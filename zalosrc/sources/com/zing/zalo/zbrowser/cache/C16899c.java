package com.zing.zalo.zbrowser.cache;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.zing.zalo.zbrowser.cache.c */
/* loaded from: classes7.dex */
public final class C16899c implements Closeable {

    /* renamed from: F */
    static final Pattern f86075F = Pattern.compile("[a-zA-Z0-9_-]{1,1024}");

    /* renamed from: G */
    private static final OutputStream f86076G = new b();

    /* renamed from: A */
    private final Map f86077A;

    /* renamed from: B */
    private final boolean f86078B;

    /* renamed from: p */
    private final File f86082p;

    /* renamed from: q */
    private final File f86083q;

    /* renamed from: r */
    private final File f86084r;

    /* renamed from: s */
    private final File f86085s;

    /* renamed from: t */
    private final int f86086t;

    /* renamed from: u */
    private long f86087u;

    /* renamed from: v */
    private final int f86088v;

    /* renamed from: x */
    private Writer f86090x;

    /* renamed from: z */
    private int f86092z;

    /* renamed from: w */
    private long f86089w = 0;

    /* renamed from: y */
    private final LinkedHashMap f86091y = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: C */
    private long f86079C = 0;

    /* renamed from: D */
    final ThreadPoolExecutor f86080D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: E */
    private final Callable f86081E = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zbrowser.cache.c$a */
    /* loaded from: classes7.dex */
    public class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C16899c.this) {
                try {
                    if (C16899c.this.f86090x != null) {
                        C16899c.this.m90379Z();
                        if (C16899c.this.m90371J()) {
                            C16899c.this.m90377P();
                            C16899c.this.f86092z = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.zbrowser.cache.c$b */
    /* loaded from: classes7.dex */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.zbrowser.cache.c$c */
    /* loaded from: classes7.dex */
    public final class c {

        /* renamed from: a */
        private final d f86094a;

        /* renamed from: b */
        private final boolean[] f86095b;

        /* renamed from: c */
        private boolean f86096c;

        /* renamed from: d */
        private boolean f86097d;

        /* renamed from: com.zing.zalo.zbrowser.cache.c$c$a */
        /* loaded from: classes7.dex */
        private class a extends FilterOutputStream {
            /* synthetic */ a(c cVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f86096c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f86096c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i11) {
                try {
                    ((FilterOutputStream) this).out.write(i11);
                } catch (IOException unused) {
                    c.this.f86096c = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i11, int i12) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i11, i12);
                } catch (IOException unused) {
                    c.this.f86096c = true;
                }
            }
        }

        /* synthetic */ c(C16899c c16899c, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m90405a() {
            C16899c.this.m90392t(this, false);
        }

        /* renamed from: e */
        public void m90406e() {
            if (this.f86096c) {
                C16899c.this.m90392t(this, false);
                C16899c.this.m90397Q(this.f86094a.f86100a);
            } else {
                C16899c.this.m90392t(this, true);
            }
            this.f86097d = true;
        }

        /* renamed from: f */
        public OutputStream m90407f(int i11) {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i11 >= 0 && i11 < C16899c.this.f86088v) {
                synchronized (C16899c.this) {
                    try {
                        if (this.f86094a.f86103d == this) {
                            if (!this.f86094a.f86102c) {
                                this.f86095b[i11] = true;
                            }
                            File m90420k = this.f86094a.m90420k(i11);
                            try {
                                fileOutputStream = new FileOutputStream(m90420k);
                            } catch (FileNotFoundException unused) {
                                C16899c.this.f86082p.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(m90420k);
                                } catch (FileNotFoundException unused2) {
                                    return C16899c.f86076G;
                                }
                            }
                            aVar = new a(this, fileOutputStream, null);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return aVar;
            }
            throw new IllegalArgumentException("Expected index " + i11 + " to be greater than 0 and less than the maximum value count of " + C16899c.this.f86088v);
        }

        private c(d dVar) {
            this.f86094a = dVar;
            this.f86095b = dVar.f86102c ? null : new boolean[C16899c.this.f86088v];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zbrowser.cache.c$d */
    /* loaded from: classes7.dex */
    public final class d {

        /* renamed from: a */
        private final String f86100a;

        /* renamed from: b */
        private final long[] f86101b;

        /* renamed from: c */
        private boolean f86102c;

        /* renamed from: d */
        private c f86103d;

        /* renamed from: e */
        private long f86104e;

        /* synthetic */ d(C16899c c16899c, String str, a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m90417m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m90418n(String[] strArr) {
            if (strArr.length == C16899c.this.f86088v) {
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    try {
                        this.f86101b[i11] = Long.parseLong(strArr[i11]);
                    } catch (NumberFormatException unused) {
                        throw m90417m(strArr);
                    }
                }
                return;
            }
            throw m90417m(strArr);
        }

        /* renamed from: j */
        public File m90419j(int i11) {
            return new File(C16899c.this.f86082p, this.f86100a + "." + i11);
        }

        /* renamed from: k */
        public File m90420k(int i11) {
            return new File(C16899c.this.f86082p, this.f86100a + "." + i11 + ".tmp");
        }

        /* renamed from: l */
        public String m90421l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f86101b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f86100a = str;
            this.f86101b = new long[C16899c.this.f86088v];
        }
    }

    /* renamed from: com.zing.zalo.zbrowser.cache.c$e */
    /* loaded from: classes7.dex */
    public final class e implements Closeable {

        /* renamed from: p */
        private final String f86106p;

        /* renamed from: q */
        private final long f86107q;

        /* renamed from: r */
        private final InputStream[] f86108r;

        /* renamed from: s */
        private final long[] f86109s;

        /* synthetic */ e(C16899c c16899c, String str, long j11, InputStream[] inputStreamArr, long[] jArr, a aVar) {
            this(str, j11, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream m90422a(int i11) {
            return this.f86108r[i11];
        }

        /* renamed from: b */
        public long m90423b(int i11) {
            return this.f86109s[i11];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f86108r) {
                g.m90428a(inputStream);
            }
        }

        private e(String str, long j11, InputStream[] inputStreamArr, long[] jArr) {
            this.f86106p = str;
            this.f86107q = j11;
            this.f86108r = inputStreamArr;
            this.f86109s = jArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zbrowser.cache.c$f */
    /* loaded from: classes7.dex */
    public class f implements Closeable {

        /* renamed from: p */
        private final InputStream f86111p;

        /* renamed from: q */
        private final Charset f86112q;

        /* renamed from: r */
        private byte[] f86113r;

        /* renamed from: s */
        private int f86114s;

        /* renamed from: t */
        private int f86115t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zbrowser.cache.c$f$a */
        /* loaded from: classes7.dex */
        public class a extends ByteArrayOutputStream {
            a(int i11) {
                super(i11);
            }

            @Override // java.io.ByteArrayOutputStream
            public String toString() {
                int i11 = ((ByteArrayOutputStream) this).count;
                if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                    i11--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i11, f.this.f86112q.name());
                } catch (UnsupportedEncodingException e11) {
                    throw new AssertionError(e11);
                }
            }
        }

        public f(C16899c c16899c, InputStream inputStream, Charset charset) {
            this(inputStream, 8192, charset);
        }

        /* renamed from: b */
        private void m90425b() {
            InputStream inputStream = this.f86111p;
            byte[] bArr = this.f86113r;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                this.f86114s = 0;
                this.f86115t = read;
                return;
            }
            throw new EOFException();
        }

        /* renamed from: c */
        public boolean m90426c() {
            return this.f86115t == -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (this.f86111p) {
                try {
                    if (this.f86113r != null) {
                        this.f86113r = null;
                        this.f86111p.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public String m90427d() {
            int i11;
            byte[] bArr;
            int i12;
            synchronized (this.f86111p) {
                try {
                    if (this.f86113r != null) {
                        if (this.f86114s >= this.f86115t) {
                            m90425b();
                        }
                        for (int i13 = this.f86114s; i13 != this.f86115t; i13++) {
                            byte[] bArr2 = this.f86113r;
                            if (bArr2[i13] == 10) {
                                int i14 = this.f86114s;
                                if (i13 != i14) {
                                    i12 = i13 - 1;
                                    if (bArr2[i12] == 13) {
                                        String str = new String(bArr2, i14, i12 - i14, this.f86112q.name());
                                        this.f86114s = i13 + 1;
                                        return str;
                                    }
                                }
                                i12 = i13;
                                String str2 = new String(bArr2, i14, i12 - i14, this.f86112q.name());
                                this.f86114s = i13 + 1;
                                return str2;
                            }
                        }
                        a aVar = new a((this.f86115t - this.f86114s) + 80);
                        loop1: while (true) {
                            byte[] bArr3 = this.f86113r;
                            int i15 = this.f86114s;
                            aVar.write(bArr3, i15, this.f86115t - i15);
                            this.f86115t = -1;
                            m90425b();
                            i11 = this.f86114s;
                            while (i11 != this.f86115t) {
                                bArr = this.f86113r;
                                if (bArr[i11] == 10) {
                                    break loop1;
                                }
                                i11++;
                            }
                        }
                        int i16 = this.f86114s;
                        if (i11 != i16) {
                            aVar.write(bArr, i16, i11 - i16);
                        }
                        this.f86114s = i11 + 1;
                        return aVar.toString();
                    }
                    throw new IOException("LineReader is closed");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public f(InputStream inputStream, int i11, Charset charset) {
            if (inputStream == null || charset == null) {
                throw null;
            }
            if (i11 >= 0) {
                if (charset.equals(g.f86118a)) {
                    this.f86111p = inputStream;
                    this.f86112q = charset;
                    this.f86113r = new byte[i11];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
    }

    /* renamed from: com.zing.zalo.zbrowser.cache.c$g */
    /* loaded from: classes7.dex */
    public static final class g {

        /* renamed from: a */
        static final Charset f86118a = Charset.forName("US-ASCII");

        /* renamed from: b */
        static final Charset f86119b = Charset.forName("UTF-8");

        /* renamed from: a */
        public static void m90428a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public static void m90429b(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m90429b(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete file: " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }
    }

    private C16899c(File file, int i11, int i12, long j11, Map map, boolean z11) {
        this.f86082p = file;
        this.f86086t = i11;
        this.f86083q = new File(file, "journal");
        this.f86084r = new File(file, "journal.tmp");
        this.f86085s = new File(file, "journal.bkp");
        this.f86088v = i12;
        this.f86087u = j11;
        this.f86077A = map;
        this.f86078B = z11;
    }

    /* renamed from: E */
    private synchronized c m90370E(String str, long j11) {
        m90391r();
        m90385d0(str);
        d dVar = (d) this.f86091y.get(str);
        a aVar = null;
        if (j11 != -1 && (dVar == null || dVar.f86104e != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f86091y.put(str, dVar);
        } else if (dVar.f86103d != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f86103d = cVar;
        this.f86090x.write("DIRTY " + str + '\n');
        this.f86090x.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public boolean m90371J() {
        int i11 = this.f86092z;
        if (i11 >= 2000 && i11 >= this.f86091y.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private void m90372K() {
        LinkedHashMap linkedHashMap;
        if (this.f86077A != null && (linkedHashMap = this.f86091y) != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                this.f86077A.put(Integer.valueOf(((String) ((Map.Entry) it.next()).getKey()).hashCode()), this);
            }
        }
    }

    /* renamed from: L */
    public static C16899c m90373L(File file, int i11, int i12, long j11, Map map, boolean z11) {
        if (j11 > 0) {
            if (i12 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m90378R(file2, file3, false);
                    }
                }
                C16899c c16899c = new C16899c(file, i11, i12, j11, map, z11);
                if (c16899c.f86083q.exists()) {
                    try {
                        c16899c.m90375N();
                        c16899c.m90374M();
                        c16899c.m90377P();
                        c16899c.m90372K();
                        return c16899c;
                    } catch (IOException e11) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                        c16899c.m90400v();
                    }
                }
                file.mkdirs();
                C16899c c16899c2 = new C16899c(file, i11, i12, j11, map, z11);
                c16899c2.m90377P();
                c16899c2.m90372K();
                return c16899c2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: M */
    private void m90374M() {
        m90393y(this.f86084r);
        Iterator it = this.f86091y.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i11 = 0;
            if (dVar.f86103d != null) {
                dVar.f86103d = null;
                while (i11 < this.f86088v) {
                    m90393y(dVar.m90419j(i11));
                    m90393y(dVar.m90420k(i11));
                    i11++;
                }
                it.remove();
            } else {
                long j11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < this.f86088v) {
                        if (!dVar.m90419j(i12).exists()) {
                            while (i11 < this.f86088v) {
                                m90393y(dVar.m90419j(i11));
                                m90393y(dVar.m90420k(i11));
                                i11++;
                            }
                            it.remove();
                        } else {
                            j11 += dVar.f86101b[i12];
                            i12++;
                        }
                    } else {
                        this.f86089w += j11;
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: N */
    private void m90375N() {
        f fVar = new f(this, new FileInputStream(this.f86083q), g.f86118a);
        try {
            String m90427d = fVar.m90427d();
            String m90427d2 = fVar.m90427d();
            String m90427d3 = fVar.m90427d();
            String m90427d4 = fVar.m90427d();
            String m90427d5 = fVar.m90427d();
            if ("libcore.io.DiskLruCache".equals(m90427d) && "1".equals(m90427d2) && Integer.toString(this.f86086t).equals(m90427d3) && Integer.toString(this.f86088v).equals(m90427d4) && "".equals(m90427d5)) {
                int i11 = 0;
                while (true) {
                    try {
                        m90376O(fVar.m90427d());
                        i11++;
                    } catch (EOFException unused) {
                        this.f86092z = i11 - this.f86091y.size();
                        if (fVar.m90426c()) {
                            m90377P();
                        } else {
                            this.f86090x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86083q, true), g.f86118a));
                        }
                        g.m90428a(fVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m90427d + ", " + m90427d2 + ", " + m90427d4 + ", " + m90427d5 + "]");
            }
        } catch (Throwable th2) {
            g.m90428a(fVar);
            throw th2;
        }
    }

    /* renamed from: O */
    private void m90376O(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i11 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i11);
            if (indexOf2 == -1) {
                substring = str.substring(i11);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f86091y.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i11, indexOf2);
            }
            d dVar = (d) this.f86091y.get(substring);
            a aVar = null;
            if (dVar == null) {
                dVar = new d(this, substring, aVar);
                this.f86091y.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f86102c = true;
                dVar.f86103d = null;
                dVar.m90418n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f86103d = new c(this, dVar, aVar);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public synchronized void m90377P() {
        try {
            Writer writer = this.f86090x;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86084r), g.f86118a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f86086t));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f86088v));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f86091y.values()) {
                    if (dVar.f86103d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f86100a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f86100a + dVar.m90421l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f86083q.exists()) {
                    m90378R(this.f86083q, this.f86085s, true);
                }
                m90378R(this.f86084r, this.f86083q, false);
                this.f86085s.delete();
                this.f86090x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86083q, true), g.f86118a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* renamed from: R */
    private static void m90378R(File file, File file2, boolean z11) {
        if (z11) {
            m90393y(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m90379Z() {
        while (this.f86089w > this.f86087u) {
            m90397Q((String) ((Map.Entry) this.f86091y.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: c0 */
    private void m90383c0() {
        LinkedHashMap linkedHashMap;
        if (this.f86077A != null && (linkedHashMap = this.f86091y) != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                this.f86077A.remove(Integer.valueOf(((String) ((Map.Entry) it.next()).getKey()).hashCode()));
            }
        }
    }

    /* renamed from: d0 */
    private void m90385d0(String str) {
        if (f86075F.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-zA-Z0-9_-]{1,1024}: \"" + str + "\"");
    }

    /* renamed from: r */
    private void m90391r() {
        if (this.f86090x != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public synchronized void m90392t(c cVar, boolean z11) {
        d dVar = cVar.f86094a;
        if (dVar.f86103d == cVar) {
            if (z11 && !dVar.f86102c) {
                for (int i11 = 0; i11 < this.f86088v; i11++) {
                    if (cVar.f86095b[i11]) {
                        if (!dVar.m90420k(i11).exists()) {
                            cVar.m90405a();
                            return;
                        }
                    } else {
                        cVar.m90405a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f86088v; i12++) {
                File m90420k = dVar.m90420k(i12);
                if (z11) {
                    if (m90420k.exists()) {
                        File m90419j = dVar.m90419j(i12);
                        m90420k.renameTo(m90419j);
                        long j11 = dVar.f86101b[i12];
                        long length = m90419j.length();
                        dVar.f86101b[i12] = length;
                        this.f86089w = (this.f86089w - j11) + length;
                    }
                } else {
                    m90393y(m90420k);
                }
            }
            this.f86092z++;
            dVar.f86103d = null;
            if (dVar.f86102c | z11) {
                dVar.f86102c = true;
                this.f86090x.write("CLEAN " + dVar.f86100a + dVar.m90421l() + '\n');
                if (z11) {
                    long j12 = this.f86079C;
                    this.f86079C = 1 + j12;
                    dVar.f86104e = j12;
                }
            } else {
                this.f86091y.remove(dVar.f86100a);
                this.f86090x.write("REMOVE " + dVar.f86100a + '\n');
            }
            this.f86090x.flush();
            if (this.f86089w > this.f86087u || m90371J()) {
                this.f86080D.submit(this.f86081E);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: y */
    private static void m90393y(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: A */
    public c m90394A(String str) {
        return m90370E(str, -1L);
    }

    /* renamed from: F */
    public synchronized e m90395F(String str) {
        InputStream inputStream;
        m90391r();
        m90385d0(str);
        d dVar = (d) this.f86091y.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f86102c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f86088v];
        for (int i11 = 0; i11 < this.f86088v; i11++) {
            try {
                inputStreamArr[i11] = new FileInputStream(dVar.m90419j(i11));
            } catch (FileNotFoundException unused) {
                for (int i12 = 0; i12 < this.f86088v && (inputStream = inputStreamArr[i12]) != null; i12++) {
                    g.m90428a(inputStream);
                }
                return null;
            }
        }
        this.f86092z++;
        this.f86090x.append((CharSequence) ("READ " + str + '\n'));
        if (m90371J()) {
            this.f86080D.submit(this.f86081E);
        }
        return new e(this, str, dVar.f86104e, inputStreamArr, dVar.f86101b, null);
    }

    /* renamed from: G */
    public boolean m90396G() {
        return this.f86078B;
    }

    /* renamed from: Q */
    public synchronized boolean m90397Q(String str) {
        try {
            Map map = this.f86077A;
            if (map != null) {
                map.remove(Integer.valueOf(str.hashCode()));
            }
            m90391r();
            m90385d0(str);
            d dVar = (d) this.f86091y.get(str);
            if (dVar != null && dVar.f86103d == null) {
                for (int i11 = 0; i11 < this.f86088v; i11++) {
                    File m90419j = dVar.m90419j(i11);
                    if (m90419j.exists() && !m90419j.delete()) {
                        throw new IOException("failed to delete " + m90419j);
                    }
                    this.f86089w -= dVar.f86101b[i11];
                    dVar.f86101b[i11] = 0;
                }
                this.f86092z++;
                this.f86090x.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f86091y.remove(str);
                if (m90371J()) {
                    this.f86080D.submit(this.f86081E);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: T */
    public synchronized long m90398T() {
        return this.f86089w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            m90383c0();
            if (this.f86090x == null) {
                return;
            }
            Iterator it = new ArrayList(this.f86091y.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f86103d != null) {
                    dVar.f86103d.m90405a();
                }
            }
            m90379Z();
            this.f86090x.close();
            this.f86090x = null;
            this.f86080D.shutdownNow();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isClosed() {
        boolean z11;
        if (this.f86090x == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: s */
    public void m90399s() {
        this.f86091y.clear();
        g.m90429b(this.f86082p);
        m90377P();
    }

    /* renamed from: v */
    public void m90400v() {
        close();
        g.m90429b(this.f86082p);
    }
}
