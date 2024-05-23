package com.zing.zalo.media.server;

import com.zing.zalo.media.server.NanoHTTPD;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import ho0.AbstractC20110a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import p664y.AbstractC30228a;
import s00.AbstractC26080o;

/* loaded from: classes4.dex */
public abstract class NanoHTTPD {

    /* renamed from: a */
    final String f48291a;

    /* renamed from: b */
    final int f48292b;

    /* renamed from: c */
    ServerSocket f48293c;

    /* renamed from: d */
    Set f48294d;

    /* renamed from: e */
    Thread f48295e;

    /* renamed from: f */
    InterfaceC9013a f48296f;

    /* renamed from: g */
    InterfaceC9025m f48297g;

    /* loaded from: classes4.dex */
    public static final class ResponseException extends Exception {

        /* renamed from: p */
        private final C9022j.b f48298p;

        public ResponseException(C9022j.b bVar, String str) {
            super(str);
            this.f48298p = bVar;
        }

        /* renamed from: a */
        public C9022j.b m48189a() {
            return this.f48298p;
        }

        public ResponseException(C9022j.b bVar, String str, Exception exc) {
            super(str, exc);
            this.f48298p = bVar;
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC9013a {
        /* renamed from: a */
        void mo48190a(Runnable runnable);
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$b */
    /* loaded from: classes4.dex */
    public class C9014b implements Iterable {

        /* renamed from: p */
        private HashMap f48299p = new HashMap();

        /* renamed from: q */
        private ArrayList f48300q = new ArrayList();

        public C9014b(Map map) {
            String str = (String) map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.f48299p.put(split[0], split[1]);
                    }
                }
            }
        }

        /* renamed from: d */
        public void m48191d(C9022j c9022j) {
            Iterator it = this.f48300q.iterator();
            if (!it.hasNext()) {
                return;
            }
            AbstractC30228a.m149044a(it.next());
            throw null;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f48299p.keySet().iterator();
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$c */
    /* loaded from: classes4.dex */
    public static class C9015c implements InterfaceC9013a {

        /* renamed from: a */
        long f48302a;

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9013a
        /* renamed from: a */
        public void mo48190a(Runnable runnable) {
            this.f48302a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f48302a + ")");
            thread.start();
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$d */
    /* loaded from: classes4.dex */
    public static class C9016d implements InterfaceC9023k {

        /* renamed from: a */
        File f48303a;

        /* renamed from: b */
        OutputStream f48304b;

        public C9016d(String str) {
            this.f48303a = File.createTempFile("NanoHTTPD-", "", new File(str));
            this.f48304b = new FileOutputStream(this.f48303a);
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9023k
        /* renamed from: a */
        public String mo48192a() {
            return this.f48303a.getAbsolutePath();
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9023k
        /* renamed from: b */
        public void mo48193b() {
            NanoHTTPD.m48176h(this.f48304b);
            this.f48303a.delete();
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$e */
    /* loaded from: classes4.dex */
    public static class C9017e implements InterfaceC9024l {

        /* renamed from: a */
        final String f48305a = System.getProperty("java.io.tmpdir");

        /* renamed from: b */
        final List f48306b = new ArrayList();

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9024l
        /* renamed from: a */
        public InterfaceC9023k mo48194a() {
            C9016d c9016d = new C9016d(this.f48305a);
            this.f48306b.add(c9016d);
            return c9016d;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9024l
        public void clear() {
            Iterator it = this.f48306b.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC9023k) it.next()).mo48193b();
                } catch (Exception unused) {
                }
            }
            this.f48306b.clear();
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$f */
    /* loaded from: classes4.dex */
    private class C9018f implements InterfaceC9025m {
        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9025m
        /* renamed from: a */
        public InterfaceC9024l mo48195a() {
            return new C9017e();
        }

        private C9018f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$g */
    /* loaded from: classes4.dex */
    public class C9019g implements InterfaceC9020h {

        /* renamed from: a */
        private final InterfaceC9024l f48308a;

        /* renamed from: b */
        private final OutputStream f48309b;

        /* renamed from: c */
        private PushbackInputStream f48310c;

        /* renamed from: d */
        private int f48311d;

        /* renamed from: e */
        private int f48312e;

        /* renamed from: f */
        private String f48313f;

        /* renamed from: g */
        private EnumC9021i f48314g;

        /* renamed from: h */
        private Map f48315h;

        /* renamed from: i */
        private Map f48316i;

        /* renamed from: j */
        private C9014b f48317j;

        /* renamed from: k */
        private String f48318k;

        public C9019g(InterfaceC9024l interfaceC9024l, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            String str;
            this.f48308a = interfaceC9024l;
            this.f48310c = new PushbackInputStream(inputStream, 8192);
            this.f48309b = outputStream;
            if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
                str = inetAddress.getHostAddress().toString();
            } else {
                str = "127.0.0.1";
            }
            HashMap hashMap = new HashMap();
            this.f48316i = hashMap;
            hashMap.put("remote-addr", str);
            this.f48316i.put("http-client-ip", str);
        }

        /* renamed from: h */
        private void m48196h(BufferedReader bufferedReader, Map map, Map map2, Map map3) {
            String m48180d;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            m48198j(nextToken.substring(indexOf + 1), map2);
                            m48180d = NanoHTTPD.this.m48180d(nextToken.substring(0, indexOf));
                        } else {
                            m48180d = NanoHTTPD.this.m48180d(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String readLine2 = bufferedReader.readLine();
                            while (readLine2 != null && readLine2.trim().length() > 0) {
                                int indexOf2 = readLine2.indexOf(58);
                                if (indexOf2 >= 0) {
                                    map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                                }
                                readLine2 = bufferedReader.readLine();
                            }
                        }
                        map.put("uri", m48180d);
                        return;
                    }
                    throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            } catch (IOException e11) {
                throw new ResponseException(C9022j.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e11.getMessage(), e11);
            }
        }

        /* renamed from: i */
        private void m48197i(String str, ByteBuffer byteBuffer, BufferedReader bufferedReader, Map map, Map map2) {
            int i11;
            Map map3;
            try {
                int[] m48200m = m48200m(byteBuffer, str.getBytes());
                String readLine = bufferedReader.readLine();
                int i12 = 1;
                while (readLine != null) {
                    if (readLine.contains(str)) {
                        int i13 = i12 + 1;
                        HashMap hashMap = new HashMap();
                        String readLine2 = bufferedReader.readLine();
                        while (true) {
                            i11 = 0;
                            if (readLine2 == null || readLine2.trim().length() <= 0) {
                                break;
                            }
                            int indexOf = readLine2.indexOf(58);
                            if (indexOf != -1) {
                                hashMap.put(readLine2.substring(0, indexOf).trim().toLowerCase(Locale.US), readLine2.substring(indexOf + 1).trim());
                            }
                            readLine2 = bufferedReader.readLine();
                        }
                        if (readLine2 != null) {
                            String str2 = (String) hashMap.get("content-disposition");
                            if (str2 != null) {
                                StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
                                HashMap hashMap2 = new HashMap();
                                while (stringTokenizer.hasMoreTokens()) {
                                    String trim = stringTokenizer.nextToken().trim();
                                    int indexOf2 = trim.indexOf(61);
                                    if (indexOf2 != -1) {
                                        hashMap2.put(trim.substring(i11, indexOf2).trim().toLowerCase(Locale.US), trim.substring(indexOf2 + 1).trim());
                                    }
                                    i11 = 0;
                                }
                                String str3 = (String) hashMap2.get("name");
                                String substring = str3.substring(1, str3.length() - 1);
                                String str4 = "";
                                if (hashMap.get("content-type") == null) {
                                    while (readLine2 != null && !readLine2.contains(str)) {
                                        readLine2 = bufferedReader.readLine();
                                        if (readLine2 != null) {
                                            int indexOf3 = readLine2.indexOf(str);
                                            if (indexOf3 == -1) {
                                                str4 = str4 + readLine2;
                                            } else {
                                                str4 = str4 + readLine2.substring(0, indexOf3 - 2);
                                            }
                                        }
                                    }
                                    map3 = map;
                                } else if (i13 <= m48200m.length) {
                                    map2.put(substring, m48202o(byteBuffer, m48203p(byteBuffer, m48200m[i12 - 1]), (m48200m[i12] - r7) - 4));
                                    String str5 = (String) hashMap2.get("filename");
                                    str4 = str5.substring(1, str5.length() - 1);
                                    do {
                                        readLine2 = bufferedReader.readLine();
                                        if (readLine2 == null) {
                                            break;
                                        }
                                    } while (!readLine2.contains(str));
                                    map3 = map;
                                } else {
                                    throw new ResponseException(C9022j.b.INTERNAL_ERROR, "Error processing request");
                                }
                                map3.put(substring, str4);
                            } else {
                                throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but no content-disposition info found. Usage: GET /example/file.html");
                            }
                        }
                        i12 = i13;
                        readLine = readLine2;
                    } else {
                        throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but next chunk does not start with boundary. Usage: GET /example/file.html");
                    }
                }
            } catch (IOException e11) {
                throw new ResponseException(C9022j.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e11.getMessage(), e11);
            }
        }

        /* renamed from: j */
        private void m48198j(String str, Map map) {
            if (str == null) {
                this.f48318k = "";
                return;
            }
            this.f48318k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(NanoHTTPD.this.m48180d(nextToken.substring(0, indexOf)).trim(), NanoHTTPD.this.m48180d(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(NanoHTTPD.this.m48180d(nextToken).trim(), "");
                }
            }
        }

        /* renamed from: l */
        private int m48199l(byte[] bArr, int i11) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 3;
                if (i13 >= i11) {
                    return 0;
                }
                if (bArr[i12] == 13 && bArr[i12 + 1] == 10 && bArr[i12 + 2] == 13 && bArr[i13] == 10) {
                    return i12 + 4;
                }
                i12++;
            }
        }

        /* renamed from: m */
        private int[] m48200m(ByteBuffer byteBuffer, byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            int i12 = 0;
            int i13 = -1;
            while (i11 < byteBuffer.limit()) {
                if (byteBuffer.get(i11) == bArr[i12]) {
                    if (i12 == 0) {
                        i13 = i11;
                    }
                    i12++;
                    if (i12 == bArr.length) {
                        arrayList.add(Integer.valueOf(i13));
                    } else {
                        i11++;
                    }
                } else {
                    i11 -= i12;
                }
                i12 = 0;
                i13 = -1;
                i11++;
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i14 = 0; i14 < size; i14++) {
                iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
            }
            return iArr;
        }

        /* renamed from: n */
        private RandomAccessFile m48201n() {
            try {
                return new RandomAccessFile(this.f48308a.mo48194a().mo48192a(), "rw");
            } catch (Exception e11) {
                throw new Error(e11);
            }
        }

        /* renamed from: o */
        private String m48202o(ByteBuffer byteBuffer, int i11, int i12) {
            if (i12 > 0) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        InterfaceC9023k mo48194a = this.f48308a.mo48194a();
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(mo48194a.mo48192a());
                        try {
                            FileChannel channel = fileOutputStream2.getChannel();
                            duplicate.position(i11).limit(i11 + i12);
                            channel.write(duplicate.slice());
                            String mo48192a = mo48194a.mo48192a();
                            NanoHTTPD.m48176h(fileOutputStream2);
                            return mo48192a;
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream2;
                            throw new Error(e);
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            NanoHTTPD.m48176h(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } else {
                return "";
            }
        }

        /* renamed from: p */
        private int m48203p(ByteBuffer byteBuffer, int i11) {
            while (i11 < byteBuffer.limit()) {
                if (byteBuffer.get(i11) == 13) {
                    int i12 = i11 + 1;
                    if (byteBuffer.get(i12) == 10) {
                        i12 = i11 + 2;
                        if (byteBuffer.get(i12) == 13) {
                            i11 += 3;
                            if (byteBuffer.get(i11) == 10) {
                                break;
                            }
                        }
                    }
                    i11 = i12;
                }
                i11++;
            }
            return i11 + 1;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: a */
        public final Map mo48204a() {
            return this.f48316i;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: b */
        public final Map mo48205b() {
            return this.f48315h;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: c */
        public void mo48206c(Map map) {
            Throwable th2;
            FileInputStream fileInputStream;
            BufferedReader bufferedReader;
            long j11;
            String str;
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile m48201n = m48201n();
                try {
                    if (this.f48316i.containsKey("content-length")) {
                        j11 = Integer.parseInt((String) this.f48316i.get("content-length"));
                    } else {
                        int i11 = this.f48311d;
                        int i12 = this.f48312e;
                        if (i11 < i12) {
                            j11 = i12 - i11;
                        } else {
                            j11 = 0;
                        }
                    }
                    byte[] bArr = new byte[512];
                    while (this.f48312e >= 0 && j11 > 0) {
                        int read = this.f48310c.read(bArr, 0, (int) Math.min(j11, 512L));
                        this.f48312e = read;
                        j11 -= read;
                        if (read > 0) {
                            m48201n.write(bArr, 0, read);
                        }
                    }
                    MappedByteBuffer map2 = m48201n.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, m48201n.length());
                    m48201n.seek(0L);
                    fileInputStream = new FileInputStream(m48201n.getFD());
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = null;
                    }
                    try {
                        if (EnumC9021i.POST.equals(this.f48314g)) {
                            String str2 = (String) this.f48316i.get("content-type");
                            if (str2 != null) {
                                StringTokenizer stringTokenizer = new StringTokenizer(str2, ",; ");
                                String str3 = "";
                                if (!stringTokenizer.hasMoreTokens()) {
                                    str = "";
                                } else {
                                    str = stringTokenizer.nextToken();
                                }
                                if ("multipart/form-data".equalsIgnoreCase(str)) {
                                    if (stringTokenizer.hasMoreTokens()) {
                                        String substring = str2.substring(str2.indexOf("boundary=") + 9, str2.length());
                                        if (substring.startsWith("\"") && substring.endsWith("\"")) {
                                            substring = substring.substring(1, substring.length() - 1);
                                        }
                                        m48197i(substring, map2, bufferedReader, this.f48315h, map);
                                    } else {
                                        throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                                    }
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    char[] cArr = new char[512];
                                    for (int read2 = bufferedReader.read(cArr); read2 >= 0 && !str3.endsWith("\r\n"); read2 = bufferedReader.read(cArr)) {
                                        str3 = String.valueOf(cArr, 0, read2);
                                        sb2.append(str3);
                                    }
                                    String trim = sb2.toString().trim();
                                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(str)) {
                                        m48198j(trim, this.f48315h);
                                    } else if (trim.length() != 0) {
                                        map.put("postData", trim);
                                    }
                                }
                            } else {
                                throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: CCould not get content-type from Header");
                            }
                        } else if (EnumC9021i.PUT.equals(this.f48314g)) {
                            map.put("content", m48202o(map2, 0, map2.limit()));
                        }
                        NanoHTTPD.m48176h(m48201n);
                        NanoHTTPD.m48176h(bufferedReader);
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        randomAccessFile = m48201n;
                        NanoHTTPD.m48176h(randomAccessFile);
                        NanoHTTPD.m48176h(bufferedReader);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                throw th2;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    fileInputStream = null;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th2 = th6;
                fileInputStream = null;
                bufferedReader = null;
            }
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: d */
        public C9014b mo48207d() {
            return this.f48317j;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: e */
        public final EnumC9021i mo48208e() {
            return this.f48314g;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: f */
        public String mo48209f() {
            return this.f48318k;
        }

        @Override // com.zing.zalo.media.server.NanoHTTPD.InterfaceC9020h
        /* renamed from: g */
        public final String mo48210g() {
            return this.f48313f;
        }

        /* renamed from: k */
        public void m48211k() {
            byte[] bArr;
            int read;
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                this.f48311d = 0;
                                this.f48312e = 0;
                                try {
                                    read = this.f48310c.read(bArr, 0, 8192);
                                } catch (Exception unused) {
                                    NanoHTTPD.m48176h(this.f48310c);
                                    NanoHTTPD.m48176h(this.f48309b);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                            } catch (SocketTimeoutException e11) {
                                throw e11;
                            }
                        } catch (ResponseException e12) {
                            new C9022j(e12.m48189a(), "text/plain", e12.getMessage()).m48218c(this.f48309b);
                            NanoHTTPD.m48176h(this.f48309b);
                        }
                    } catch (SocketException e13) {
                        throw e13;
                    }
                } catch (IOException e14) {
                    new C9022j(C9022j.b.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e14.getMessage()).m48218c(this.f48309b);
                    NanoHTTPD.m48176h(this.f48309b);
                }
                if (read != -1) {
                    while (read > 0) {
                        int i11 = this.f48312e + read;
                        this.f48312e = i11;
                        int m48199l = m48199l(bArr, i11);
                        this.f48311d = m48199l;
                        if (m48199l > 0) {
                            break;
                        }
                        PushbackInputStream pushbackInputStream = this.f48310c;
                        int i12 = this.f48312e;
                        read = pushbackInputStream.read(bArr, i12, 8192 - i12);
                    }
                    int i13 = this.f48311d;
                    int i14 = this.f48312e;
                    if (i13 < i14) {
                        this.f48310c.unread(bArr, i13, i14 - i13);
                    }
                    this.f48315h = new HashMap();
                    if (this.f48316i == null) {
                        this.f48316i = new HashMap();
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f48312e)));
                    HashMap hashMap = new HashMap();
                    m48196h(bufferedReader, hashMap, this.f48315h, this.f48316i);
                    EnumC9021i m48213c = EnumC9021i.m48213c((String) hashMap.get("method"));
                    this.f48314g = m48213c;
                    if (m48213c != null) {
                        this.f48313f = (String) hashMap.get("uri");
                        this.f48317j = new C9014b(this.f48316i);
                        C9022j mo48182k = NanoHTTPD.this.mo48182k(this);
                        if (mo48182k != null) {
                            this.f48317j.m48191d(mo48182k);
                            mo48182k.m48221h(this.f48314g);
                            mo48182k.m48218c(this.f48309b);
                            this.f48308a.clear();
                            return;
                        }
                        throw new ResponseException(C9022j.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    throw new ResponseException(C9022j.b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                }
                NanoHTTPD.m48176h(this.f48310c);
                NanoHTTPD.m48176h(this.f48309b);
                throw new SocketException("NanoHttpd Shutdown");
            } catch (Throwable th2) {
                this.f48308a.clear();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$h */
    /* loaded from: classes4.dex */
    public interface InterfaceC9020h {
        /* renamed from: a */
        Map mo48204a();

        /* renamed from: b */
        Map mo48205b();

        /* renamed from: c */
        void mo48206c(Map map);

        /* renamed from: d */
        C9014b mo48207d();

        /* renamed from: e */
        EnumC9021i mo48208e();

        /* renamed from: f */
        String mo48209f();

        /* renamed from: g */
        String mo48210g();
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$i */
    /* loaded from: classes4.dex */
    public enum EnumC9021i {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        /* renamed from: c */
        static EnumC9021i m48213c(String str) {
            for (EnumC9021i enumC9021i : values()) {
                if (enumC9021i.toString().equalsIgnoreCase(str)) {
                    return enumC9021i;
                }
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$k */
    /* loaded from: classes4.dex */
    public interface InterfaceC9023k {
        /* renamed from: a */
        String mo48192a();

        /* renamed from: b */
        void mo48193b();
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$l */
    /* loaded from: classes4.dex */
    public interface InterfaceC9024l {
        /* renamed from: a */
        InterfaceC9023k mo48194a();

        void clear();
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$m */
    /* loaded from: classes4.dex */
    public interface InterfaceC9025m {
        /* renamed from: a */
        InterfaceC9024l mo48195a();
    }

    public NanoHTTPD(int i11) {
        this(null, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m48174e(Socket socket, InputStream inputStream) {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = socket.getOutputStream();
                C9019g c9019g = new C9019g(this.f48297g.mo48195a(), inputStream, outputStream, socket.getInetAddress());
                while (!socket.isClosed()) {
                    c9019g.m48211k();
                }
            } catch (Exception e11) {
                if (!(e11 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e11.getMessage())) {
                    e11.printStackTrace();
                }
            }
        } finally {
            m48176h(outputStream);
            m48176h(inputStream);
            m48178j(socket);
            m48188q(socket);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m48175f() {
        do {
            try {
                final Socket accept = this.f48293c.accept();
                m48181g(accept);
                accept.setSoTimeout(AbstractC26080o.a.f124275b);
                final InputStream inputStream = accept.getInputStream();
                this.f48296f.mo48190a(new Runnable() { // from class: vv.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        NanoHTTPD.this.m48174e(accept, inputStream);
                    }
                });
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
        } while (!this.f48293c.isClosed());
    }

    /* renamed from: h */
    static final void m48176h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: i */
    static final void m48177i(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: j */
    static final void m48178j(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: c */
    public synchronized void m48179c() {
        Iterator it = this.f48294d.iterator();
        while (it.hasNext()) {
            m48178j((Socket) it.next());
        }
    }

    /* renamed from: d */
    protected String m48180d(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public synchronized void m48181g(Socket socket) {
        this.f48294d.add(socket);
    }

    /* renamed from: k */
    public C9022j mo48182k(InterfaceC9020h interfaceC9020h) {
        HashMap hashMap = new HashMap();
        EnumC9021i mo48208e = interfaceC9020h.mo48208e();
        if (EnumC9021i.PUT.equals(mo48208e) || EnumC9021i.POST.equals(mo48208e)) {
            try {
                interfaceC9020h.mo48206c(hashMap);
            } catch (ResponseException e11) {
                return new C9022j(e11.m48189a(), "text/plain", e11.getMessage());
            } catch (IOException e12) {
                return new C9022j(C9022j.b.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage());
            }
        }
        Map mo48205b = interfaceC9020h.mo48205b();
        mo48205b.put("NanoHttpd.QUERY_STRING", interfaceC9020h.mo48209f());
        return m48183l(interfaceC9020h.mo48210g(), mo48208e, interfaceC9020h.mo48204a(), mo48205b, hashMap);
    }

    /* renamed from: l */
    public C9022j m48183l(String str, EnumC9021i enumC9021i, Map map, Map map2, Map map3) {
        return new C9022j(C9022j.b.NOT_FOUND, "text/plain", "Not Found");
    }

    /* renamed from: m */
    public void m48184m(InterfaceC9013a interfaceC9013a) {
        this.f48296f = interfaceC9013a;
    }

    /* renamed from: n */
    public void m48185n(InterfaceC9025m interfaceC9025m) {
        this.f48297g = interfaceC9025m;
    }

    /* renamed from: o */
    public void m48186o() {
        InetSocketAddress inetSocketAddress;
        ServerSocket serverSocket = new ServerSocket();
        this.f48293c = serverSocket;
        if (this.f48291a != null) {
            inetSocketAddress = new InetSocketAddress(this.f48291a, this.f48292b);
        } else {
            inetSocketAddress = new InetSocketAddress(this.f48292b);
        }
        serverSocket.bind(inetSocketAddress);
        Thread thread = new Thread(new Runnable() { // from class: vv.b
            @Override // java.lang.Runnable
            public final void run() {
                NanoHTTPD.this.m48175f();
            }
        });
        this.f48295e = thread;
        thread.setName("Z:NanoHttpd");
        this.f48295e.start();
    }

    /* renamed from: p */
    public void m48187p() {
        try {
            m48177i(this.f48293c);
            m48179c();
            Thread thread = this.f48295e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public synchronized void m48188q(Socket socket) {
        this.f48294d.remove(socket);
    }

    /* renamed from: com.zing.zalo.media.server.NanoHTTPD$j */
    /* loaded from: classes4.dex */
    public static class C9022j {

        /* renamed from: a */
        a f48327a;

        /* renamed from: b */
        String f48328b;

        /* renamed from: c */
        InputStream f48329c;

        /* renamed from: d */
        Map f48330d = new HashMap();

        /* renamed from: e */
        EnumC9021i f48331e;

        /* renamed from: f */
        boolean f48332f;

        /* renamed from: com.zing.zalo.media.server.NanoHTTPD$j$a */
        /* loaded from: classes4.dex */
        public interface a {
            String getDescription();
        }

        /* renamed from: com.zing.zalo.media.server.NanoHTTPD$j$b */
        /* loaded from: classes4.dex */
        public enum b implements a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, "Internal Server Error");


            /* renamed from: p */
            private final int f48349p;

            /* renamed from: q */
            private final String f48350q;

            b(int i11, String str) {
                this.f48349p = i11;
                this.f48350q = str;
            }

            @Override // com.zing.zalo.media.server.NanoHTTPD.C9022j.a
            public String getDescription() {
                return "" + this.f48349p + " " + this.f48350q;
            }
        }

        public C9022j(a aVar, String str, InputStream inputStream) {
            this.f48327a = aVar;
            this.f48328b = str;
            this.f48329c = inputStream;
        }

        /* renamed from: b */
        private boolean m48214b(Map map, String str) {
            Iterator it = map.keySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                z11 |= ((String) it.next()).equalsIgnoreCase(str);
            }
            return z11;
        }

        /* renamed from: d */
        private void m48215d(OutputStream outputStream, PrintWriter printWriter) {
            printWriter.print("Transfer-Encoding: chunked\r\n");
            printWriter.print("\r\n");
            printWriter.flush();
            byte[] bytes = "\r\n".getBytes();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = this.f48329c.read(bArr);
                if (read > 0) {
                    outputStream.write(String.format("%x\r\n", Integer.valueOf(read)).getBytes());
                    outputStream.write(bArr, 0, read);
                    outputStream.write(bytes);
                } else {
                    outputStream.write(String.format("0\r\n\r\n", new Object[0]).getBytes());
                    return;
                }
            }
        }

        /* renamed from: e */
        private void m48216e(OutputStream outputStream, int i11) {
            int i12;
            if (this.f48331e != EnumC9021i.HEAD && this.f48329c != null) {
                byte[] bArr = new byte[16384];
                while (i11 > 0) {
                    InputStream inputStream = this.f48329c;
                    if (i11 > 16384) {
                        i12 = 16384;
                    } else {
                        i12 = i11;
                    }
                    int read = inputStream.read(bArr, 0, i12);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i11 -= read;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m48217a(String str, String str2) {
            this.f48330d.put(str, str2);
        }

        /* renamed from: c */
        protected void m48218c(OutputStream outputStream) {
            int i11;
            String str = this.f48328b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f48327a != null) {
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.print("HTTP/1.1 " + this.f48327a.getDescription() + " \r\n");
                    if (str != null) {
                        printWriter.print("Content-Type: " + str + "\r\n");
                    }
                    Map map = this.f48330d;
                    if (map == null || map.get("Date") == null) {
                        printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                    }
                    Map map2 = this.f48330d;
                    if (map2 != null) {
                        for (String str2 : map2.keySet()) {
                            printWriter.print(str2 + ": " + ((String) this.f48330d.get(str2)) + "\r\n");
                        }
                    }
                    m48219f(printWriter, this.f48330d);
                    if (this.f48331e != EnumC9021i.HEAD && this.f48332f) {
                        m48215d(outputStream, printWriter);
                    } else {
                        InputStream inputStream = this.f48329c;
                        if (inputStream != null) {
                            i11 = inputStream.available();
                        } else {
                            i11 = 0;
                        }
                        m48220g(printWriter, this.f48330d, i11);
                        printWriter.print("\r\n");
                        printWriter.flush();
                        m48216e(outputStream, i11);
                    }
                    outputStream.flush();
                    NanoHTTPD.m48176h(this.f48329c);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException unused) {
            }
        }

        /* renamed from: f */
        protected void m48219f(PrintWriter printWriter, Map map) {
            if (!m48214b(map, "connection")) {
                printWriter.print("Connection: keep-alive\r\n");
            }
        }

        /* renamed from: g */
        protected void m48220g(PrintWriter printWriter, Map map, int i11) {
            if (!m48214b(map, "content-length")) {
                printWriter.print("Content-Length: " + i11 + "\r\n");
            }
        }

        /* renamed from: h */
        public void m48221h(EnumC9021i enumC9021i) {
            this.f48331e = enumC9021i;
        }

        public C9022j(a aVar, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.f48327a = aVar;
            this.f48328b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e11) {
                    e11.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.f48329c = byteArrayInputStream;
        }
    }

    public NanoHTTPD(String str, int i11) {
        this.f48294d = new HashSet();
        this.f48291a = str;
        this.f48292b = i11;
        m48185n(new C9018f());
        m48184m(new C9015c());
    }
}
