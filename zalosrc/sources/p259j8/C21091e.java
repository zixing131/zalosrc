package p259j8;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j8.e */
/* loaded from: classes.dex */
public class C21091e implements Closeable {

    /* renamed from: v */
    private static final Logger f103093v = Logger.getLogger(C21091e.class.getName());

    /* renamed from: p */
    private final RandomAccessFile f103094p;

    /* renamed from: q */
    int f103095q;

    /* renamed from: r */
    private int f103096r;

    /* renamed from: s */
    private b f103097s;

    /* renamed from: t */
    private b f103098t;

    /* renamed from: u */
    private final byte[] f103099u = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j8.e$a */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a */
        boolean f103100a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f103101b;

        a(StringBuilder sb2) {
            this.f103101b = sb2;
        }

        @Override // p259j8.C21091e.d
        /* renamed from: a */
        public void mo109602a(InputStream inputStream, int i11) {
            if (this.f103100a) {
                this.f103100a = false;
            } else {
                this.f103101b.append(", ");
            }
            this.f103101b.append(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j8.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        static final b f103103c = new b(0, 0);

        /* renamed from: a */
        final int f103104a;

        /* renamed from: b */
        final int f103105b;

        b(int i11, int i12) {
            this.f103104a = i11;
            this.f103105b = i12;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f103104a + ", length = " + this.f103105b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.e$c */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: p */
        private int f103106p;

        /* renamed from: q */
        private int f103107q;

        /* synthetic */ c(C21091e c21091e, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            C21091e.m109592t(bArr, "buffer");
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i13 = this.f103107q;
            if (i13 <= 0) {
                return -1;
            }
            if (i12 > i13) {
                i12 = i13;
            }
            C21091e.this.m109579J(this.f103106p, bArr, i11, i12);
            this.f103106p = C21091e.this.m109582N(this.f103106p + i12);
            this.f103107q -= i12;
            return i12;
        }

        private c(b bVar) {
            this.f103106p = C21091e.this.m109582N(bVar.f103104a + 4);
            this.f103107q = bVar.f103105b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f103107q == 0) {
                return -1;
            }
            C21091e.this.f103094p.seek(this.f103106p);
            int read = C21091e.this.f103094p.read();
            this.f103106p = C21091e.this.m109582N(this.f103106p + 1);
            this.f103107q--;
            return read;
        }
    }

    /* renamed from: j8.e$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo109602a(InputStream inputStream, int i11);
    }

    public C21091e(File file) {
        if (!file.exists()) {
            m109591r(file);
        }
        this.f103094p = m109593v(file);
        m109576A();
    }

    /* renamed from: A */
    private void m109576A() {
        this.f103094p.seek(0L);
        this.f103094p.readFully(this.f103099u);
        int m109577E = m109577E(this.f103099u, 0);
        this.f103095q = m109577E;
        if (m109577E <= this.f103094p.length()) {
            this.f103096r = m109577E(this.f103099u, 4);
            int m109577E2 = m109577E(this.f103099u, 8);
            int m109577E3 = m109577E(this.f103099u, 12);
            this.f103097s = m109594y(m109577E2);
            this.f103098t = m109594y(m109577E3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f103095q + ", Actual length: " + this.f103094p.length());
    }

    /* renamed from: E */
    private static int m109577E(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    /* renamed from: F */
    private int m109578F() {
        return this.f103095q - m109596M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m109579J(int i11, byte[] bArr, int i12, int i13) {
        int m109582N = m109582N(i11);
        int i14 = m109582N + i13;
        int i15 = this.f103095q;
        if (i14 <= i15) {
            this.f103094p.seek(m109582N);
            this.f103094p.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - m109582N;
        this.f103094p.seek(m109582N);
        this.f103094p.readFully(bArr, i12, i16);
        this.f103094p.seek(16L);
        this.f103094p.readFully(bArr, i12 + i16, i13 - i16);
    }

    /* renamed from: K */
    private void m109580K(int i11, byte[] bArr, int i12, int i13) {
        int m109582N = m109582N(i11);
        int i14 = m109582N + i13;
        int i15 = this.f103095q;
        if (i14 <= i15) {
            this.f103094p.seek(m109582N);
            this.f103094p.write(bArr, i12, i13);
            return;
        }
        int i16 = i15 - m109582N;
        this.f103094p.seek(m109582N);
        this.f103094p.write(bArr, i12, i16);
        this.f103094p.seek(16L);
        this.f103094p.write(bArr, i12 + i16, i13 - i16);
    }

    /* renamed from: L */
    private void m109581L(int i11) {
        this.f103094p.setLength(i11);
        this.f103094p.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public int m109582N(int i11) {
        int i12 = this.f103095q;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    /* renamed from: O */
    private void m109583O(int i11, int i12, int i13, int i14) {
        m109585Q(this.f103099u, i11, i12, i13, i14);
        this.f103094p.seek(0L);
        this.f103094p.write(this.f103099u);
    }

    /* renamed from: P */
    private static void m109584P(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    /* renamed from: Q */
    private static void m109585Q(byte[] bArr, int... iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            m109584P(bArr, i11, i12);
            i11 += 4;
        }
    }

    /* renamed from: o */
    private void m109590o(int i11) {
        int i12 = i11 + 4;
        int m109578F = m109578F();
        if (m109578F >= i12) {
            return;
        }
        int i13 = this.f103095q;
        do {
            m109578F += i13;
            i13 <<= 1;
        } while (m109578F < i12);
        m109581L(i13);
        b bVar = this.f103098t;
        int m109582N = m109582N(bVar.f103104a + 4 + bVar.f103105b);
        if (m109582N < this.f103097s.f103104a) {
            FileChannel channel = this.f103094p.getChannel();
            channel.position(this.f103095q);
            long j11 = m109582N - 4;
            if (channel.transferTo(16L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f103098t.f103104a;
        int i15 = this.f103097s.f103104a;
        if (i14 < i15) {
            int i16 = (this.f103095q + i14) - 16;
            m109583O(i13, this.f103096r, i15, i16);
            this.f103098t = new b(i16, this.f103098t.f103105b);
        } else {
            m109583O(i13, this.f103096r, i15, i14);
        }
        this.f103095q = i13;
    }

    /* renamed from: r */
    private static void m109591r(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m109593v = m109593v(file2);
        try {
            m109593v.setLength(4096L);
            m109593v.seek(0L);
            byte[] bArr = new byte[16];
            m109585Q(bArr, 4096, 0, 0, 0);
            m109593v.write(bArr);
            m109593v.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            m109593v.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static Object m109592t(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: v */
    private static RandomAccessFile m109593v(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: y */
    private b m109594y(int i11) {
        if (i11 == 0) {
            return b.f103103c;
        }
        this.f103094p.seek(i11);
        return new b(i11, this.f103094p.readInt());
    }

    /* renamed from: G */
    public synchronized void m109595G() {
        try {
            if (!m109601s()) {
                if (this.f103096r == 1) {
                    m109599i();
                } else {
                    b bVar = this.f103097s;
                    int m109582N = m109582N(bVar.f103104a + 4 + bVar.f103105b);
                    m109579J(m109582N, this.f103099u, 0, 4);
                    int m109577E = m109577E(this.f103099u, 0);
                    m109583O(this.f103095q, this.f103096r - 1, m109582N, this.f103098t.f103104a);
                    this.f103096r--;
                    this.f103097s = new b(m109582N, m109577E);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: M */
    public int m109596M() {
        if (this.f103096r == 0) {
            return 16;
        }
        b bVar = this.f103098t;
        int i11 = bVar.f103104a;
        int i12 = this.f103097s.f103104a;
        if (i11 >= i12) {
            return (i11 - i12) + 4 + bVar.f103105b + 16;
        }
        return (((i11 + 4) + bVar.f103105b) + this.f103095q) - i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f103094p.close();
    }

    /* renamed from: f */
    public void m109597f(byte[] bArr) {
        m109598h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public synchronized void m109598h(byte[] bArr, int i11, int i12) {
        int m109582N;
        int i13;
        try {
            m109592t(bArr, "buffer");
            if ((i11 | i12) >= 0 && i12 <= bArr.length - i11) {
                m109590o(i12);
                boolean m109601s = m109601s();
                if (m109601s) {
                    m109582N = 16;
                } else {
                    b bVar = this.f103098t;
                    m109582N = m109582N(bVar.f103104a + 4 + bVar.f103105b);
                }
                b bVar2 = new b(m109582N, i12);
                m109584P(this.f103099u, 0, i12);
                m109580K(bVar2.f103104a, this.f103099u, 0, 4);
                m109580K(bVar2.f103104a + 4, bArr, i11, i12);
                if (m109601s) {
                    i13 = bVar2.f103104a;
                } else {
                    i13 = this.f103097s.f103104a;
                }
                m109583O(this.f103095q, this.f103096r + 1, i13, bVar2.f103104a);
                this.f103098t = bVar2;
                this.f103096r++;
                if (m109601s) {
                    this.f103097s = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public synchronized void m109599i() {
        try {
            m109583O(4096, 0, 0, 0);
            this.f103096r = 0;
            b bVar = b.f103103c;
            this.f103097s = bVar;
            this.f103098t = bVar;
            if (this.f103095q > 4096) {
                m109581L(4096);
            }
            this.f103095q = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: q */
    public synchronized void m109600q(d dVar) {
        int i11 = this.f103097s.f103104a;
        for (int i12 = 0; i12 < this.f103096r; i12++) {
            b m109594y = m109594y(i11);
            dVar.mo109602a(new c(this, m109594y, null), m109594y.f103105b);
            i11 = m109582N(m109594y.f103104a + 4 + m109594y.f103105b);
        }
    }

    /* renamed from: s */
    public synchronized boolean m109601s() {
        boolean z11;
        if (this.f103096r == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f103095q);
        sb2.append(", size=");
        sb2.append(this.f103096r);
        sb2.append(", first=");
        sb2.append(this.f103097s);
        sb2.append(", last=");
        sb2.append(this.f103098t);
        sb2.append(", element lengths=[");
        try {
            m109600q(new a(sb2));
        } catch (IOException e11) {
            f103093v.log(Level.WARNING, "read error", (Throwable) e11);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
