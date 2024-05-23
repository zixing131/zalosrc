package me0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s00.AbstractC26080o;

/* renamed from: me0.x1 */
/* loaded from: classes4.dex */
public class C23257x1 {

    /* renamed from: F */
    private static SimpleDateFormat f112666F;

    /* renamed from: J */
    private static final e[] f112670J;

    /* renamed from: K */
    private static final e[] f112671K;

    /* renamed from: L */
    private static final e[] f112672L;

    /* renamed from: M */
    private static final e[] f112673M;

    /* renamed from: N */
    private static final e[] f112674N;

    /* renamed from: O */
    private static final e f112675O;

    /* renamed from: P */
    private static final e[] f112676P;

    /* renamed from: Q */
    private static final e[] f112677Q;

    /* renamed from: R */
    private static final e[] f112678R;

    /* renamed from: S */
    private static final e[] f112679S;

    /* renamed from: T */
    static final e[][] f112680T;

    /* renamed from: U */
    private static final e[] f112681U;

    /* renamed from: V */
    private static final e f112682V;

    /* renamed from: W */
    private static final e f112683W;

    /* renamed from: X */
    private static final HashMap[] f112684X;

    /* renamed from: Y */
    private static final HashMap[] f112685Y;

    /* renamed from: Z */
    private static final HashSet f112686Z;

    /* renamed from: a0 */
    private static final HashMap f112687a0;

    /* renamed from: b0 */
    static final Charset f112688b0;

    /* renamed from: c0 */
    static final byte[] f112689c0;

    /* renamed from: d0 */
    private static final byte[] f112690d0;

    /* renamed from: e0 */
    private static final Pattern f112691e0;

    /* renamed from: f0 */
    private static final Pattern f112692f0;

    /* renamed from: a */
    private String f112700a;

    /* renamed from: b */
    private FileDescriptor f112701b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f112702c;

    /* renamed from: d */
    private int f112703d;

    /* renamed from: e */
    private final HashMap[] f112704e;

    /* renamed from: f */
    private Set f112705f;

    /* renamed from: g */
    private ByteOrder f112706g;

    /* renamed from: h */
    private boolean f112707h;

    /* renamed from: i */
    private int f112708i;

    /* renamed from: j */
    private int f112709j;

    /* renamed from: k */
    private byte[] f112710k;

    /* renamed from: l */
    private int f112711l;

    /* renamed from: m */
    private int f112712m;

    /* renamed from: n */
    private int f112713n;

    /* renamed from: o */
    private int f112714o;

    /* renamed from: p */
    private int f112715p;

    /* renamed from: q */
    private int f112716q;

    /* renamed from: r */
    private boolean f112717r;

    /* renamed from: s */
    private boolean f112718s;

    /* renamed from: t */
    private static final boolean f112693t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u */
    private static final List f112694u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v */
    private static final List f112695v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w */
    public static final int[] f112696w = {8, 8, 8};

    /* renamed from: x */
    public static final int[] f112697x = {4};

    /* renamed from: y */
    public static final int[] f112698y = {8};

    /* renamed from: z */
    static final byte[] f112699z = {-1, -40, -1};

    /* renamed from: A */
    private static final byte[] f112661A = {102, 116, 121, 112};

    /* renamed from: B */
    private static final byte[] f112662B = {109, 105, 102, 49};

    /* renamed from: C */
    private static final byte[] f112663C = {104, 101, 105, 99};

    /* renamed from: D */
    private static final byte[] f112664D = {79, 76, 89, 77, 80, 0};

    /* renamed from: E */
    private static final byte[] f112665E = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G */
    static final String[] f112667G = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: H */
    static final int[] f112668H = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: I */
    static final byte[] f112669I = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.x1$a */
    /* loaded from: classes4.dex */
    public class a extends MediaDataSource {

        /* renamed from: p */
        long f112719p;

        /* renamed from: q */
        final /* synthetic */ b f112720q;

        a(b bVar) {
            this.f112720q = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j11, byte[] bArr, int i11, int i12) {
            if (i12 == 0) {
                return 0;
            }
            if (j11 < 0) {
                return -1;
            }
            try {
                long j12 = this.f112719p;
                if (j12 != j11) {
                    if (j12 >= 0 && j11 >= j12 + this.f112720q.available()) {
                        return -1;
                    }
                    this.f112720q.m119916d(j11);
                    this.f112719p = j11;
                }
                if (i12 > this.f112720q.available()) {
                    i12 = this.f112720q.available();
                }
                int read = this.f112720q.read(bArr, i11, i12);
                if (read >= 0) {
                    this.f112719p += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f112719p = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.x1$b */
    /* loaded from: classes4.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: t */
        private static final ByteOrder f112722t = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: u */
        private static final ByteOrder f112723u = ByteOrder.BIG_ENDIAN;

        /* renamed from: p */
        private DataInputStream f112724p;

        /* renamed from: q */
        private ByteOrder f112725q;

        /* renamed from: r */
        final int f112726r;

        /* renamed from: s */
        int f112727s;

        public b(InputStream inputStream) {
            this.f112725q = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f112724p = dataInputStream;
            int available = dataInputStream.available();
            this.f112726r = available;
            this.f112727s = 0;
            this.f112724p.mark(available);
        }

        /* renamed from: a */
        public int m119913a() {
            return this.f112726r;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f112724p.available();
        }

        /* renamed from: b */
        public int m119914b() {
            return this.f112727s;
        }

        /* renamed from: c */
        public long m119915c() {
            return readInt() & 4294967295L;
        }

        /* renamed from: d */
        public void m119916d(long j11) {
            int i11 = this.f112727s;
            if (i11 > j11) {
                this.f112727s = 0;
                this.f112724p.reset();
                this.f112724p.mark(this.f112726r);
            } else {
                j11 -= i11;
            }
            int i12 = (int) j11;
            if (skipBytes(i12) == i12) {
            } else {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: f */
        public void m119917f(ByteOrder byteOrder) {
            this.f112725q = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f112727s++;
            return this.f112724p.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f112727s++;
            return this.f112724p.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i11 = this.f112727s + 1;
            this.f112727s = i11;
            if (i11 <= this.f112726r) {
                int read = this.f112724p.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f112727s += 2;
            return this.f112724p.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i11, int i12) {
            int i13 = this.f112727s + i12;
            this.f112727s = i13;
            if (i13 <= this.f112726r) {
                if (this.f112724p.read(bArr, i11, i12) != i12) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i11 = this.f112727s + 4;
            this.f112727s = i11;
            if (i11 <= this.f112726r) {
                int read = this.f112724p.read();
                int read2 = this.f112724p.read();
                int read3 = this.f112724p.read();
                int read4 = this.f112724p.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f112725q;
                    if (byteOrder == f112722t) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f112723u) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f112725q);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i11 = this.f112727s + 8;
            this.f112727s = i11;
            if (i11 <= this.f112726r) {
                int read = this.f112724p.read();
                int read2 = this.f112724p.read();
                int read3 = this.f112724p.read();
                int read4 = this.f112724p.read();
                int read5 = this.f112724p.read();
                int read6 = this.f112724p.read();
                int read7 = this.f112724p.read();
                int read8 = this.f112724p.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f112725q;
                    if (byteOrder == f112722t) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f112723u) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f112725q);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i11 = this.f112727s + 2;
            this.f112727s = i11;
            if (i11 <= this.f112726r) {
                int read = this.f112724p.read();
                int read2 = this.f112724p.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f112725q;
                    if (byteOrder == f112722t) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f112723u) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f112725q);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f112727s += 2;
            return this.f112724p.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f112727s++;
            return this.f112724p.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i11 = this.f112727s + 2;
            this.f112727s = i11;
            if (i11 <= this.f112726r) {
                int read = this.f112724p.read();
                int read2 = this.f112724p.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f112725q;
                    if (byteOrder == f112722t) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f112723u) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f112725q);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i11) {
            int min = Math.min(i11, this.f112726r - this.f112727s);
            int i12 = 0;
            while (i12 < min) {
                i12 += this.f112724p.skipBytes(min - i12);
            }
            this.f112727s += i12;
            return i12;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int read = this.f112724p.read(bArr, i11, i12);
            this.f112727s += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f112727s + bArr.length;
            this.f112727s = length;
            if (length <= this.f112726r) {
                if (this.f112724p.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.x1$c */
    /* loaded from: classes4.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: p */
        private final OutputStream f112728p;

        /* renamed from: q */
        private ByteOrder f112729q;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f112728p = outputStream;
            this.f112729q = byteOrder;
        }

        /* renamed from: a */
        public void m119918a(ByteOrder byteOrder) {
            this.f112729q = byteOrder;
        }

        /* renamed from: b */
        public void m119919b(int i11) {
            this.f112728p.write(i11);
        }

        /* renamed from: c */
        public void m119920c(int i11) {
            ByteOrder byteOrder = this.f112729q;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f112728p.write(i11 & 255);
                this.f112728p.write((i11 >>> 8) & 255);
                this.f112728p.write((i11 >>> 16) & 255);
                this.f112728p.write((i11 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f112728p.write((i11 >>> 24) & 255);
                this.f112728p.write((i11 >>> 16) & 255);
                this.f112728p.write((i11 >>> 8) & 255);
                this.f112728p.write(i11 & 255);
            }
        }

        /* renamed from: d */
        public void m119921d(short s7) {
            ByteOrder byteOrder = this.f112729q;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f112728p.write(s7 & 255);
                this.f112728p.write((s7 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f112728p.write((s7 >>> 8) & 255);
                this.f112728p.write(s7 & 255);
            }
        }

        /* renamed from: f */
        public void m119922f(long j11) {
            m119920c((int) j11);
        }

        /* renamed from: h */
        public void m119923h(int i11) {
            m119921d((short) i11);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f112728p.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            this.f112728p.write(bArr, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.x1$d */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a */
        public final int f112730a;

        /* renamed from: b */
        public final int f112731b;

        /* renamed from: c */
        public final long f112732c;

        /* renamed from: d */
        public final byte[] f112733d;

        d(int i11, int i12, byte[] bArr) {
            this(i11, i12, -1L, bArr);
        }

        /* renamed from: a */
        public static d m119924a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C23257x1.f112688b0);
            return new d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static d m119925b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d11 : dArr) {
                wrap.putDouble(d11);
            }
            return new d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static d m119926c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putInt(i11);
            }
            return new d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static d m119927d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f112738a);
                wrap.putInt((int) fVar.f112739b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static d m119928e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C23257x1.f112688b0);
            return new d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static d m119929f(long j11, ByteOrder byteOrder) {
            return m119930g(new long[]{j11}, byteOrder);
        }

        /* renamed from: g */
        public static d m119930g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j11 : jArr) {
                wrap.putInt((int) j11);
            }
            return new d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static d m119931h(f fVar, ByteOrder byteOrder) {
            return m119932i(new f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static d m119932i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f112738a);
                wrap.putInt((int) fVar.f112739b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static d m119933j(int i11, ByteOrder byteOrder) {
            return m119934k(new int[]{i11}, byteOrder);
        }

        /* renamed from: k */
        public static d m119934k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C23257x1.f112668H[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putShort((short) i11);
            }
            return new d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m119935l(ByteOrder byteOrder) {
            Object m119938o = m119938o(byteOrder);
            if (m119938o != null) {
                if (m119938o instanceof String) {
                    return Double.parseDouble((String) m119938o);
                }
                if (m119938o instanceof long[]) {
                    if (((long[]) m119938o).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m119938o instanceof int[]) {
                    if (((int[]) m119938o).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m119938o instanceof double[]) {
                    double[] dArr = (double[]) m119938o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m119938o instanceof f[]) {
                    f[] fVarArr = (f[]) m119938o;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].m119941a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: m */
        public int m119936m(ByteOrder byteOrder) {
            Object m119938o = m119938o(byteOrder);
            if (m119938o != null) {
                if (m119938o instanceof String) {
                    return Integer.parseInt((String) m119938o);
                }
                if (m119938o instanceof long[]) {
                    long[] jArr = (long[]) m119938o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (m119938o instanceof int[]) {
                    int[] iArr = (int[]) m119938o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: n */
        public String m119937n(ByteOrder byteOrder) {
            Object m119938o = m119938o(byteOrder);
            if (m119938o == null) {
                return null;
            }
            if (m119938o instanceof String) {
                return (String) m119938o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (m119938o instanceof long[]) {
                long[] jArr = (long[]) m119938o;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m119938o instanceof int[]) {
                int[] iArr = (int[]) m119938o;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m119938o instanceof double[]) {
                double[] dArr = (double[]) m119938o;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(m119938o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) m119938o;
            while (i11 < fVarArr.length) {
                sb2.append(fVarArr[i11].f112738a);
                sb2.append('/');
                sb2.append(fVarArr[i11].f112739b);
                i11++;
                if (i11 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* renamed from: o */
        Object m119938o(ByteOrder byteOrder) {
            b bVar;
            byte b11;
            byte b12;
            b bVar2 = null;
            try {
                bVar = new b(this.f112733d);
                try {
                    bVar.m119917f(byteOrder);
                    int i11 = 0;
                    switch (this.f112730a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.f112733d;
                            if (bArr.length == 1 && (b11 = bArr[0]) >= 0 && b11 <= 1) {
                                String str = new String(new char[]{(char) (b11 + 48)});
                                try {
                                    bVar.close();
                                } catch (IOException unused) {
                                }
                                return str;
                            }
                            String str2 = new String(bArr, C23257x1.f112688b0);
                            try {
                                bVar.close();
                            } catch (IOException unused2) {
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (this.f112731b >= C23257x1.f112669I.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = C23257x1.f112669I;
                                    if (i12 < bArr2.length) {
                                        if (this.f112733d[i12] == bArr2[i12]) {
                                            i12++;
                                        }
                                    } else {
                                        i11 = bArr2.length;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (i11 < this.f112731b && (b12 = this.f112733d[i11]) != 0) {
                                if (b12 >= 32) {
                                    sb2.append((char) b12);
                                } else {
                                    sb2.append('?');
                                }
                                i11++;
                            }
                            String sb3 = sb2.toString();
                            try {
                                bVar.close();
                            } catch (IOException unused3) {
                            }
                            return sb3;
                        case 3:
                            int[] iArr = new int[this.f112731b];
                            while (i11 < this.f112731b) {
                                iArr[i11] = bVar.readUnsignedShort();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused4) {
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.f112731b];
                            while (i11 < this.f112731b) {
                                jArr[i11] = bVar.m119915c();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused5) {
                            }
                            return jArr;
                        case 5:
                            f[] fVarArr = new f[this.f112731b];
                            while (i11 < this.f112731b) {
                                fVarArr[i11] = new f(bVar.m119915c(), bVar.m119915c());
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused6) {
                            }
                            return fVarArr;
                        case 8:
                            int[] iArr2 = new int[this.f112731b];
                            while (i11 < this.f112731b) {
                                iArr2[i11] = bVar.readShort();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused7) {
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.f112731b];
                            while (i11 < this.f112731b) {
                                iArr3[i11] = bVar.readInt();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused8) {
                            }
                            return iArr3;
                        case 10:
                            f[] fVarArr2 = new f[this.f112731b];
                            while (i11 < this.f112731b) {
                                fVarArr2[i11] = new f(bVar.readInt(), bVar.readInt());
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused9) {
                            }
                            return fVarArr2;
                        case 11:
                            double[] dArr = new double[this.f112731b];
                            while (i11 < this.f112731b) {
                                dArr[i11] = bVar.readFloat();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused10) {
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.f112731b];
                            while (i11 < this.f112731b) {
                                dArr2[i11] = bVar.readDouble();
                                i11++;
                            }
                            try {
                                bVar.close();
                            } catch (IOException unused11) {
                            }
                            return dArr2;
                        default:
                            try {
                                bVar.close();
                            } catch (IOException unused12) {
                            }
                            return null;
                    }
                } catch (IOException unused13) {
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException unused14) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        try {
                            bVar2.close();
                        } catch (IOException unused15) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused16) {
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: p */
        public int m119939p() {
            return C23257x1.f112668H[this.f112730a] * this.f112731b;
        }

        public String toString() {
            return "(" + C23257x1.f112667G[this.f112730a] + ", data length:" + this.f112733d.length + ")";
        }

        d(int i11, int i12, long j11, byte[] bArr) {
            this.f112730a = i11;
            this.f112731b = i12;
            this.f112732c = j11;
            this.f112733d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.x1$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        public final int f112734a;

        /* renamed from: b */
        public final String f112735b;

        /* renamed from: c */
        public final int f112736c;

        /* renamed from: d */
        public final int f112737d;

        e(String str, int i11, int i12) {
            this.f112735b = str;
            this.f112734a = i11;
            this.f112736c = i12;
            this.f112737d = -1;
        }

        /* renamed from: a */
        boolean m119940a(int i11) {
            int i12;
            int i13 = this.f112736c;
            if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.f112737d) == i11) {
                return true;
            }
            if ((i13 == 4 || i12 == 4) && i11 == 3) {
                return true;
            }
            if ((i13 == 9 || i12 == 9) && i11 == 8) {
                return true;
            }
            return (i13 == 12 || i12 == 12) && i11 == 11;
        }

        e(String str, int i11, int i12, int i13) {
            this.f112735b = str;
            this.f112734a = i11;
            this.f112736c = i12;
            this.f112737d = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.x1$f */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a */
        public final long f112738a;

        /* renamed from: b */
        public final long f112739b;

        f(double d11) {
            this((long) (d11 * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m119941a() {
            return this.f112738a / this.f112739b;
        }

        public String toString() {
            return this.f112738a + "/" + this.f112739b;
        }

        f(long j11, long j12) {
            if (j12 == 0) {
                this.f112738a = 0L;
                this.f112739b = 1L;
            } else {
                this.f112738a = j11;
                this.f112739b = j12;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING, 1)};
        f112670J = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f112671K = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3)};
        f112672L = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f112673M = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f112674N = eVarArr5;
        f112675O = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f112676P = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f112677Q = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f112678R = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f112679S = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f112680T = eVarArr10;
        f112681U = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f112682V = new e("JPEGInterchangeFormat", 513, 4);
        f112683W = new e("JPEGInterchangeFormatLength", 514, 4);
        f112684X = new HashMap[eVarArr10.length];
        f112685Y = new HashMap[eVarArr10.length];
        f112686Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f112687a0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f112688b0 = forName;
        f112689c0 = "Exif\u0000\u0000".getBytes(forName);
        f112690d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f112666F = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr11 = f112680T;
            if (i11 >= eVarArr11.length) {
                HashMap hashMap = f112687a0;
                e[] eVarArr12 = f112681U;
                hashMap.put(Integer.valueOf(eVarArr12[0].f112734a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f112734a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f112734a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f112734a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f112734a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f112734a), 8);
                f112691e0 = Pattern.compile(".*[1-9].*");
                f112692f0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            f112684X[i11] = new HashMap();
            f112685Y[i11] = new HashMap();
            for (e eVar : eVarArr11[i11]) {
                f112684X[i11].put(Integer.valueOf(eVar.f112734a), eVar);
                f112685Y[i11].put(eVar.f112735b, eVar);
            }
            i11++;
        }
    }

    public C23257x1(File file) {
        e[][] eVarArr = f112680T;
        this.f112704e = new HashMap[eVarArr.length];
        this.f112705f = new HashSet(eVarArr.length);
        this.f112706g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            m119902y(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    /* renamed from: A */
    private static boolean m119863A(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f112699z;
            if (i11 < bArr2.length) {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: B */
    private boolean m119864B(byte[] bArr) {
        b bVar = new b(bArr);
        ByteOrder m119873K = m119873K(bVar);
        this.f112706g = m119873K;
        bVar.m119917f(m119873K);
        short readShort = bVar.readShort();
        bVar.close();
        if (readShort != 20306 && readShort != 21330) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private boolean m119865C(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i11 = 0; i11 < bytes.length; i11++) {
            if (bArr[i11] != bytes[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m119866D(byte[] bArr) {
        b bVar = new b(bArr);
        ByteOrder m119873K = m119873K(bVar);
        this.f112706g = m119873K;
        bVar.m119917f(m119873K);
        short readShort = bVar.readShort();
        bVar.close();
        if (readShort == 85) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private static boolean m119867E(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: F */
    private boolean m119868F(HashMap hashMap) {
        d dVar;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m119938o(this.f112706g);
            int[] iArr2 = f112696w;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f112703d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null) {
                int m119936m = dVar.m119936m(this.f112706g);
                if ((m119936m == 1 && Arrays.equals(iArr, f112698y)) || (m119936m == 6 && Arrays.equals(iArr, iArr2))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: G */
    private boolean m119869G(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar != null && dVar2 != null) {
            int m119936m = dVar.m119936m(this.f112706g);
            int m119936m2 = dVar2.m119936m(this.f112706g);
            if (m119936m <= 512 && m119936m2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: H */
    private void m119870H(InputStream inputStream) {
        if (inputStream != null) {
            for (int i11 = 0; i11 < f112680T.length; i11++) {
                try {
                    try {
                        this.f112704e[i11] = new HashMap();
                    } catch (IOException unused) {
                        this.f112717r = false;
                        boolean z11 = f112693t;
                        m119885a();
                        if (!z11) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    m119885a();
                    if (f112693t) {
                        m119872J();
                    }
                    throw th2;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, AbstractC26080o.a.f124275b);
            this.f112703d = m119894n(bufferedInputStream);
            b bVar = new b(bufferedInputStream);
            switch (this.f112703d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    m119897q(bVar);
                    break;
                case 4:
                    m119893k(bVar, 0, 0);
                    break;
                case 7:
                    m119895o(bVar);
                    break;
                case 9:
                    m119896p(bVar);
                    break;
                case 10:
                    m119898r(bVar);
                    break;
                case 12:
                    m119892j(bVar);
                    break;
            }
            m119879S(bVar);
            this.f112717r = true;
            m119885a();
            if (!f112693t) {
                return;
            }
            m119872J();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: I */
    private void m119871I(b bVar, int i11) {
        ByteOrder m119873K = m119873K(bVar);
        this.f112706g = m119873K;
        bVar.m119917f(m119873K);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i12 = this.f112703d;
        if (i12 != 7 && i12 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i11) {
            int i13 = readInt - 8;
            if (i13 > 0 && bVar.skipBytes(i13) != i13) {
                throw new IOException("Couldn't jump to first Ifd: " + i13);
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: J */
    private void m119872J() {
        for (int i11 = 0; i11 < this.f112704e.length; i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The size of tag group[");
            sb2.append(i11);
            sb2.append("]: ");
            sb2.append(this.f112704e[i11].size());
            for (Map.Entry entry : this.f112704e[i11].entrySet()) {
                d dVar = (d) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tagName: ");
                sb3.append((String) entry.getKey());
                sb3.append(", tagType: ");
                sb3.append(dVar.toString());
                sb3.append(", tagValue: '");
                sb3.append(dVar.m119937n(this.f112706g));
                sb3.append("'");
            }
        }
    }

    /* renamed from: K */
    private ByteOrder m119873K(b bVar) {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: L */
    private void m119874L(byte[] bArr, int i11) {
        b bVar = new b(bArr);
        m119871I(bVar, bArr.length);
        m119875M(bVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m119875M(b bVar, int i11) {
        long j11;
        long j12;
        boolean z11;
        short s7;
        String str;
        short s11;
        int i12;
        int i13;
        int i14;
        int readUnsignedShort;
        long j13;
        String str2;
        this.f112705f.add(Integer.valueOf(bVar.f112727s));
        if (bVar.f112727s + 2 > bVar.f112726r) {
            return;
        }
        short readShort = bVar.readShort();
        if (f112693t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append((int) readShort);
        }
        if (bVar.f112727s + (readShort * 12) <= bVar.f112726r && readShort > 0) {
            char c11 = 0;
            short s12 = 0;
            while (s12 < readShort) {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int readUnsignedShort3 = bVar.readUnsignedShort();
                int readInt = bVar.readInt();
                long m119914b = bVar.m119914b() + 4;
                e eVar = (e) f112684X[i11].get(Integer.valueOf(readUnsignedShort2));
                boolean z12 = f112693t;
                if (z12) {
                    Object[] objArr = new Object[5];
                    objArr[c11] = Integer.valueOf(i11);
                    objArr[1] = Integer.valueOf(readUnsignedShort2);
                    if (eVar != null) {
                        str2 = eVar.f112735b;
                    } else {
                        str2 = null;
                    }
                    objArr[2] = str2;
                    objArr[3] = Integer.valueOf(readUnsignedShort3);
                    objArr[4] = Integer.valueOf(readInt);
                    String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr);
                }
                if (eVar == null) {
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Skip the tag entry since tag number is not defined: ");
                        sb3.append(readUnsignedShort2);
                    }
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < f112668H.length) {
                            if (!eVar.m119940a(readUnsignedShort3)) {
                                if (z12) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Skip the tag entry since data format (");
                                    sb4.append(f112667G[readUnsignedShort3]);
                                    sb4.append(") is unexpected for tag: ");
                                    sb4.append(eVar.f112735b);
                                }
                            } else {
                                if (readUnsignedShort3 == 7) {
                                    readUnsignedShort3 = eVar.f112736c;
                                }
                                j11 = m119914b;
                                j12 = readInt * r5[readUnsignedShort3];
                                if (j12 >= 0 && j12 <= 2147483647L) {
                                    z11 = true;
                                } else {
                                    if (z12) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Skip the tag entry since the number of components is invalid: ");
                                        sb5.append(readInt);
                                    }
                                    z11 = false;
                                }
                                if (!z11) {
                                    bVar.m119916d(j11);
                                    s7 = readShort;
                                    s11 = s12;
                                } else {
                                    long j14 = j11;
                                    if (j12 > 4) {
                                        int readInt2 = bVar.readInt();
                                        s7 = readShort;
                                        if (z12) {
                                            StringBuilder sb6 = new StringBuilder();
                                            s11 = s12;
                                            sb6.append("seek to data offset: ");
                                            sb6.append(readInt2);
                                        } else {
                                            s11 = s12;
                                        }
                                        int i15 = this.f112703d;
                                        if (i15 == 7) {
                                            if ("MakerNote".equals(eVar.f112735b)) {
                                                this.f112713n = readInt2;
                                            } else if (i11 == 6 && "ThumbnailImage".equals(eVar.f112735b)) {
                                                this.f112714o = readInt2;
                                                this.f112715p = readInt;
                                                d m119933j = d.m119933j(6, this.f112706g);
                                                i12 = readUnsignedShort2;
                                                i13 = readUnsignedShort3;
                                                d m119929f = d.m119929f(this.f112714o, this.f112706g);
                                                i14 = readInt;
                                                d m119929f2 = d.m119929f(this.f112715p, this.f112706g);
                                                this.f112704e[4].put("Compression", m119933j);
                                                this.f112704e[4].put("JPEGInterchangeFormat", m119929f);
                                                this.f112704e[4].put("JPEGInterchangeFormatLength", m119929f2);
                                            }
                                            i12 = readUnsignedShort2;
                                            i13 = readUnsignedShort3;
                                            i14 = readInt;
                                        } else {
                                            i12 = readUnsignedShort2;
                                            i13 = readUnsignedShort3;
                                            i14 = readInt;
                                            if (i15 == 10 && "JpgFromRaw".equals(eVar.f112735b)) {
                                                this.f112716q = readInt2;
                                            }
                                        }
                                        long j15 = readInt2;
                                        str = "Compression";
                                        if (j15 + j12 <= bVar.f112726r) {
                                            bVar.m119916d(j15);
                                        } else {
                                            if (z12) {
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("Skip the tag entry since data offset is invalid: ");
                                                sb7.append(readInt2);
                                            }
                                            bVar.m119916d(j14);
                                        }
                                    } else {
                                        s7 = readShort;
                                        str = "Compression";
                                        s11 = s12;
                                        i12 = readUnsignedShort2;
                                        i13 = readUnsignedShort3;
                                        i14 = readInt;
                                    }
                                    Integer num = (Integer) f112687a0.get(Integer.valueOf(i12));
                                    if (z12) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("nextIfdType: ");
                                        sb8.append(num);
                                        sb8.append(" byteCount: ");
                                        sb8.append(j12);
                                    }
                                    if (num != null) {
                                        int i16 = i13;
                                        if (i16 != 3) {
                                            if (i16 != 4) {
                                                if (i16 != 8) {
                                                    if (i16 != 9 && i16 != 13) {
                                                        j13 = -1;
                                                    } else {
                                                        readUnsignedShort = bVar.readInt();
                                                    }
                                                } else {
                                                    readUnsignedShort = bVar.readShort();
                                                }
                                            } else {
                                                j13 = bVar.m119915c();
                                            }
                                            if (z12) {
                                                String.format("Offset: %d, tagName: %s", Long.valueOf(j13), eVar.f112735b);
                                            }
                                            if (j13 <= 0 && j13 < bVar.f112726r) {
                                                if (!this.f112705f.contains(Integer.valueOf((int) j13))) {
                                                    bVar.m119916d(j13);
                                                    m119875M(bVar, num.intValue());
                                                } else if (z12) {
                                                    StringBuilder sb9 = new StringBuilder();
                                                    sb9.append("Skip jump into the IFD since it has already been read: IfdType ");
                                                    sb9.append(num);
                                                    sb9.append(" (at ");
                                                    sb9.append(j13);
                                                    sb9.append(")");
                                                }
                                            } else if (z12) {
                                                StringBuilder sb10 = new StringBuilder();
                                                sb10.append("Skip jump into the IFD since its offset is invalid: ");
                                                sb10.append(j13);
                                            }
                                            bVar.m119916d(j14);
                                        } else {
                                            readUnsignedShort = bVar.readUnsignedShort();
                                        }
                                        j13 = readUnsignedShort;
                                        if (z12) {
                                        }
                                        if (j13 <= 0) {
                                        }
                                        if (z12) {
                                        }
                                        bVar.m119916d(j14);
                                    } else {
                                        int m119914b2 = bVar.m119914b();
                                        byte[] bArr = new byte[(int) j12];
                                        bVar.readFully(bArr);
                                        d dVar = new d(i13, i14, m119914b2, bArr);
                                        this.f112704e[i11].put(eVar.f112735b, dVar);
                                        if ("DNGVersion".equals(eVar.f112735b)) {
                                            this.f112703d = 3;
                                        }
                                        if ((("Make".equals(eVar.f112735b) || "Model".equals(eVar.f112735b)) && dVar.m119937n(this.f112706g).contains("PENTAX")) || (str.equals(eVar.f112735b) && dVar.m119936m(this.f112706g) == 65535)) {
                                            this.f112703d = 8;
                                        }
                                        if (bVar.m119914b() != j14) {
                                            bVar.m119916d(j14);
                                        }
                                    }
                                    s12 = (short) (s11 + 1);
                                    readShort = s7;
                                    c11 = 0;
                                }
                                s12 = (short) (s11 + 1);
                                readShort = s7;
                                c11 = 0;
                            }
                        }
                    }
                    j11 = m119914b;
                    if (z12) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Skip the tag entry since data format is invalid: ");
                        sb11.append(readUnsignedShort3);
                    }
                    z11 = false;
                    j12 = 0;
                    if (!z11) {
                    }
                    s12 = (short) (s11 + 1);
                    readShort = s7;
                    c11 = 0;
                }
                j11 = m119914b;
                z11 = false;
                j12 = 0;
                if (!z11) {
                }
                s12 = (short) (s11 + 1);
                readShort = s7;
                c11 = 0;
            }
            if (bVar.m119914b() + 4 <= bVar.f112726r) {
                int readInt3 = bVar.readInt();
                boolean z13 = f112693t;
                if (z13) {
                    String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
                }
                long j16 = readInt3;
                if (j16 > 0 && readInt3 < bVar.f112726r) {
                    if (!this.f112705f.contains(Integer.valueOf(readInt3))) {
                        bVar.m119916d(j16);
                        if (this.f112704e[4].isEmpty()) {
                            m119875M(bVar, 4);
                            return;
                        } else {
                            if (this.f112704e[5].isEmpty()) {
                                m119875M(bVar, 5);
                                return;
                            }
                            return;
                        }
                    }
                    if (z13) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                        sb12.append(readInt3);
                        return;
                    }
                    return;
                }
                if (z13) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("Stop reading file since a wrong offset may cause an infinite loop: ");
                    sb13.append(readInt3);
                }
            }
        }
    }

    /* renamed from: N */
    private void m119876N(String str) {
        for (int i11 = 0; i11 < f112680T.length; i11++) {
            this.f112704e[i11].remove(str);
        }
    }

    /* renamed from: O */
    private void m119877O(b bVar, int i11) {
        d dVar;
        d dVar2 = (d) this.f112704e[i11].get("ImageLength");
        d dVar3 = (d) this.f112704e[i11].get("ImageWidth");
        if ((dVar2 == null || dVar3 == null) && (dVar = (d) this.f112704e[i11].get("JPEGInterchangeFormat")) != null) {
            m119893k(bVar, dVar.m119936m(this.f112706g), i11);
        }
    }

    /* renamed from: Q */
    private void m119878Q(InputStream inputStream, OutputStream outputStream) {
        if (f112693t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("saveJpegAttributes starting with (inputStream: ");
            sb2.append(inputStream);
            sb2.append(", outputStream: ");
            sb2.append(outputStream);
            sb2.append(")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.m119919b(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.m119919b(-40);
                cVar.m119919b(-1);
                cVar.m119919b(-31);
                m119884X(cVar, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            cVar.m119919b(-1);
                            cVar.m119919b(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            cVar.m119923h(readUnsignedShort);
                            int i11 = readUnsignedShort - 2;
                            if (i11 >= 0) {
                                while (i11 > 0) {
                                    int read = dataInputStream.read(bArr, 0, Math.min(i11, 4096));
                                    if (read >= 0) {
                                        cVar.write(bArr, 0, read);
                                        i11 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                            int i12 = readUnsignedShort2 - 2;
                            if (i12 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (i12 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, f112689c0)) {
                                            int i13 = readUnsignedShort2 - 8;
                                            if (dataInputStream.skipBytes(i13) != i13) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                cVar.m119919b(-1);
                                cVar.m119919b(readByte);
                                cVar.m119923h(readUnsignedShort2);
                                if (i12 >= 6) {
                                    i12 = readUnsignedShort2 - 8;
                                    cVar.write(bArr2);
                                }
                                while (i12 > 0) {
                                    int read2 = dataInputStream.read(bArr, 0, Math.min(i12, 4096));
                                    if (read2 >= 0) {
                                        cVar.write(bArr, 0, read2);
                                        i12 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        cVar.m119919b(-1);
                        cVar.m119919b(readByte);
                        m119890f(dataInputStream, cVar);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: S */
    private void m119879S(b bVar) {
        HashMap hashMap = this.f112704e[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar != null) {
            int m119936m = dVar.m119936m(this.f112706g);
            this.f112711l = m119936m;
            if (m119936m != 1) {
                if (m119936m != 6) {
                    if (m119936m != 7) {
                        return;
                    }
                } else {
                    m119900v(bVar, hashMap);
                    return;
                }
            }
            if (m119868F(hashMap)) {
                m119901w(bVar, hashMap);
                return;
            }
            return;
        }
        this.f112711l = 6;
        m119900v(bVar, hashMap);
    }

    /* renamed from: T */
    private static boolean m119880T(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    private void m119881U(int i11, int i12) {
        if (!this.f112704e[i11].isEmpty() && !this.f112704e[i12].isEmpty()) {
            d dVar = (d) this.f112704e[i11].get("ImageLength");
            d dVar2 = (d) this.f112704e[i11].get("ImageWidth");
            d dVar3 = (d) this.f112704e[i12].get("ImageLength");
            d dVar4 = (d) this.f112704e[i12].get("ImageWidth");
            if (dVar != null && dVar2 != null && dVar3 != null && dVar4 != null) {
                int m119936m = dVar.m119936m(this.f112706g);
                int m119936m2 = dVar2.m119936m(this.f112706g);
                int m119936m3 = dVar3.m119936m(this.f112706g);
                int m119936m4 = dVar4.m119936m(this.f112706g);
                if (m119936m < m119936m3 && m119936m2 < m119936m4) {
                    HashMap[] hashMapArr = this.f112704e;
                    HashMap hashMap = hashMapArr[i11];
                    hashMapArr[i11] = hashMapArr[i12];
                    hashMapArr[i12] = hashMap;
                }
            }
        }
    }

    /* renamed from: V */
    private void m119882V(b bVar, int i11) {
        d m119933j;
        d m119933j2;
        d dVar = (d) this.f112704e[i11].get("DefaultCropSize");
        d dVar2 = (d) this.f112704e[i11].get("SensorTopBorder");
        d dVar3 = (d) this.f112704e[i11].get("SensorLeftBorder");
        d dVar4 = (d) this.f112704e[i11].get("SensorBottomBorder");
        d dVar5 = (d) this.f112704e[i11].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f112730a == 5) {
                f[] fVarArr = (f[]) dVar.m119938o(this.f112706g);
                if (fVarArr != null && fVarArr.length == 2) {
                    m119933j = d.m119931h(fVarArr[0], this.f112706g);
                    m119933j2 = d.m119931h(fVarArr[1], this.f112706g);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(fVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar.m119938o(this.f112706g);
                if (iArr != null && iArr.length == 2) {
                    m119933j = d.m119933j(iArr[0], this.f112706g);
                    m119933j2 = d.m119933j(iArr[1], this.f112706g);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid crop size values. cropSize=");
                    sb3.append(Arrays.toString(iArr));
                    return;
                }
            }
            this.f112704e[i11].put("ImageWidth", m119933j);
            this.f112704e[i11].put("ImageLength", m119933j2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int m119936m = dVar2.m119936m(this.f112706g);
            int m119936m2 = dVar4.m119936m(this.f112706g);
            int m119936m3 = dVar5.m119936m(this.f112706g);
            int m119936m4 = dVar3.m119936m(this.f112706g);
            if (m119936m2 > m119936m && m119936m3 > m119936m4) {
                d m119933j3 = d.m119933j(m119936m2 - m119936m, this.f112706g);
                d m119933j4 = d.m119933j(m119936m3 - m119936m4, this.f112706g);
                this.f112704e[i11].put("ImageLength", m119933j3);
                this.f112704e[i11].put("ImageWidth", m119933j4);
                return;
            }
            return;
        }
        m119877O(bVar, i11);
    }

    /* renamed from: W */
    private void m119883W(InputStream inputStream) {
        m119881U(0, 5);
        m119881U(0, 4);
        m119881U(5, 4);
        d dVar = (d) this.f112704e[1].get("PixelXDimension");
        d dVar2 = (d) this.f112704e[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f112704e[0].put("ImageWidth", dVar);
            this.f112704e[0].put("ImageLength", dVar2);
        }
        if (this.f112704e[4].isEmpty() && m119869G(this.f112704e[5])) {
            HashMap[] hashMapArr = this.f112704e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        m119869G(this.f112704e[4]);
    }

    /* renamed from: X */
    private int m119884X(c cVar, int i11) {
        short s7;
        e[][] eVarArr = f112680T;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f112681U) {
            m119876N(eVar.f112735b);
        }
        m119876N(f112682V.f112735b);
        m119876N(f112683W.f112735b);
        for (int i12 = 0; i12 < f112680T.length; i12++) {
            for (Object obj : this.f112704e[i12].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f112704e[i12].remove(entry.getKey());
                }
            }
        }
        if (!this.f112704e[1].isEmpty()) {
            this.f112704e[0].put(f112681U[1].f112735b, d.m119929f(0L, this.f112706g));
        }
        if (!this.f112704e[2].isEmpty()) {
            this.f112704e[0].put(f112681U[2].f112735b, d.m119929f(0L, this.f112706g));
        }
        if (!this.f112704e[3].isEmpty()) {
            this.f112704e[1].put(f112681U[3].f112735b, d.m119929f(0L, this.f112706g));
        }
        if (this.f112707h) {
            this.f112704e[4].put(f112682V.f112735b, d.m119929f(0L, this.f112706g));
            this.f112704e[4].put(f112683W.f112735b, d.m119929f(this.f112709j, this.f112706g));
        }
        for (int i13 = 0; i13 < f112680T.length; i13++) {
            Iterator it = this.f112704e[i13].entrySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                int m119939p = ((d) ((Map.Entry) it.next()).getValue()).m119939p();
                if (m119939p > 4) {
                    i14 += m119939p;
                }
            }
            iArr2[i13] = iArr2[i13] + i14;
        }
        int i15 = 8;
        for (int i16 = 0; i16 < f112680T.length; i16++) {
            if (!this.f112704e[i16].isEmpty()) {
                iArr[i16] = i15;
                i15 += (this.f112704e[i16].size() * 12) + 6 + iArr2[i16];
            }
        }
        if (this.f112707h) {
            this.f112704e[4].put(f112682V.f112735b, d.m119929f(i15, this.f112706g));
            this.f112708i = i11 + i15;
            i15 += this.f112709j;
        }
        int i17 = i15 + 8;
        if (f112693t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("totalSize length: ");
            sb2.append(i17);
            for (int i18 = 0; i18 < f112680T.length; i18++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d", Integer.valueOf(i18), Integer.valueOf(iArr[i18]), Integer.valueOf(this.f112704e[i18].size()), Integer.valueOf(iArr2[i18]));
            }
        }
        if (!this.f112704e[1].isEmpty()) {
            this.f112704e[0].put(f112681U[1].f112735b, d.m119929f(iArr[1], this.f112706g));
        }
        if (!this.f112704e[2].isEmpty()) {
            this.f112704e[0].put(f112681U[2].f112735b, d.m119929f(iArr[2], this.f112706g));
        }
        if (!this.f112704e[3].isEmpty()) {
            this.f112704e[1].put(f112681U[3].f112735b, d.m119929f(iArr[3], this.f112706g));
        }
        cVar.m119923h(i17);
        cVar.write(f112689c0);
        if (this.f112706g == ByteOrder.BIG_ENDIAN) {
            s7 = 19789;
        } else {
            s7 = 18761;
        }
        cVar.m119921d(s7);
        cVar.m119918a(this.f112706g);
        cVar.m119923h(42);
        cVar.m119922f(8L);
        for (int i19 = 0; i19 < f112680T.length; i19++) {
            if (!this.f112704e[i19].isEmpty()) {
                cVar.m119923h(this.f112704e[i19].size());
                int size = iArr[i19] + 2 + (this.f112704e[i19].size() * 12) + 4;
                for (Map.Entry entry2 : this.f112704e[i19].entrySet()) {
                    int i21 = ((e) f112685Y[i19].get(entry2.getKey())).f112734a;
                    d dVar = (d) entry2.getValue();
                    int m119939p2 = dVar.m119939p();
                    cVar.m119923h(i21);
                    cVar.m119923h(dVar.f112730a);
                    cVar.m119920c(dVar.f112731b);
                    if (m119939p2 > 4) {
                        cVar.m119922f(size);
                        size += m119939p2;
                    } else {
                        cVar.write(dVar.f112733d);
                        if (m119939p2 < 4) {
                            while (m119939p2 < 4) {
                                cVar.m119919b(0);
                                m119939p2++;
                            }
                        }
                    }
                }
                if (i19 == 0 && !this.f112704e[4].isEmpty()) {
                    cVar.m119922f(iArr[4]);
                } else {
                    cVar.m119922f(0L);
                }
                Iterator it2 = this.f112704e[i19].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f112733d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f112707h) {
            cVar.write(m119911t());
        }
        cVar.m119918a(ByteOrder.BIG_ENDIAN);
        return i17;
    }

    /* renamed from: a */
    private void m119885a() {
        String m119906g = m119906g("DateTimeOriginal");
        if (m119906g != null && m119906g("DateTime") == null) {
            this.f112704e[0].put("DateTime", d.m119928e(m119906g));
        }
        if (m119906g("ImageWidth") == null) {
            this.f112704e[0].put("ImageWidth", d.m119929f(0L, this.f112706g));
        }
        if (m119906g("ImageLength") == null) {
            this.f112704e[0].put("ImageLength", d.m119929f(0L, this.f112706g));
        }
        if (m119906g("Orientation") == null) {
            this.f112704e[0].put("Orientation", d.m119929f(0L, this.f112706g));
        }
        if (m119906g("LightSource") == null) {
            this.f112704e[1].put("LightSource", d.m119929f(0L, this.f112706g));
        }
    }

    /* renamed from: b */
    private static void m119886b(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static void m119887c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private static double m119888d(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    private static long[] m119889e(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                jArr[i11] = iArr[i11];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    /* renamed from: f */
    private static int m119890f(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                i11 += read;
                outputStream.write(bArr, 0, read);
            } else {
                return i11;
            }
        }
    }

    /* renamed from: i */
    private d m119891i(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i11 = 0; i11 < f112680T.length; i11++) {
                d dVar = (d) this.f112704e[i11].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: j */
    private void m119892j(b bVar) {
        String str;
        String str2;
        String str3;
        int i11;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(bVar));
            } else {
                FileDescriptor fileDescriptor = this.f112701b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str4 = this.f112700a;
                    if (str4 != null) {
                        mediaMetadataRetriever.setDataSource(str4);
                    } else {
                        mediaMetadataRetriever.release();
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str != null) {
                this.f112704e[0].put("ImageWidth", d.m119933j(Integer.parseInt(str), this.f112706g));
            }
            if (str2 != null) {
                this.f112704e[0].put("ImageLength", d.m119933j(Integer.parseInt(str2), this.f112706g));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i11 = 1;
                        } else {
                            i11 = 8;
                        }
                    } else {
                        i11 = 3;
                    }
                } else {
                    i11 = 6;
                }
                this.f112704e[0].put("Orientation", d.m119933j(i11, this.f112706g));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.m119916d(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f112689c0)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                m119874L(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f112693t) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Heif meta: ");
                sb2.append(str);
                sb2.append("x");
                sb2.append(str2);
                sb2.append(", rotation ");
                sb2.append(str3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x017a, code lost:            r20.m119917f(r19.f112706g);     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:            return;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[FALL_THROUGH] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m119893k(b bVar, int i11, int i12) {
        if (f112693t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getJpegAttributes starting with: ");
            sb2.append(bVar);
        }
        bVar.m119917f(ByteOrder.BIG_ENDIAN);
        bVar.m119916d(i11);
        byte readByte = bVar.readByte();
        if (readByte == -1) {
            if (bVar.readByte() == -40) {
                int i13 = i11 + 2;
                while (true) {
                    byte readByte2 = bVar.readByte();
                    if (readByte2 == -1) {
                        byte readByte3 = bVar.readByte();
                        boolean z11 = f112693t;
                        if (z11) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Found JPEG segment indicator: ");
                            sb3.append(Integer.toHexString(readByte3 & 255));
                        }
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = bVar.readUnsignedShort();
                            int i14 = readUnsignedShort - 2;
                            int i15 = i13 + 4;
                            if (z11) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("JPEG segment: ");
                                sb4.append(Integer.toHexString(readByte3 & 255));
                                sb4.append(" (length: ");
                                sb4.append(readUnsignedShort);
                                sb4.append(")");
                            }
                            if (i14 >= 0) {
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                if (bVar.skipBytes(1) == 1) {
                                                                    this.f112704e[i12].put("ImageLength", d.m119929f(bVar.readUnsignedShort(), this.f112706g));
                                                                    this.f112704e[i12].put("ImageWidth", d.m119929f(bVar.readUnsignedShort(), this.f112706g));
                                                                    i14 = readUnsignedShort - 7;
                                                                    break;
                                                                } else {
                                                                    throw new IOException("Invalid SOFx");
                                                                }
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                        if (i14 < 0) {
                                            if (bVar.skipBytes(i14) == i14) {
                                                i13 = i15 + i14;
                                            } else {
                                                throw new IOException("Invalid JPEG segment");
                                            }
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    }
                                } else {
                                    byte[] bArr = new byte[i14];
                                    bVar.readFully(bArr);
                                    int i16 = i15 + i14;
                                    byte[] bArr2 = f112689c0;
                                    if (m119880T(bArr, bArr2)) {
                                        long length = i15 + bArr2.length;
                                        m119874L(Arrays.copyOfRange(bArr, bArr2.length, i14), i12);
                                        this.f112712m = (int) length;
                                    } else {
                                        byte[] bArr3 = f112690d0;
                                        if (m119880T(bArr, bArr3)) {
                                            long length2 = i15 + bArr3.length;
                                            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr3.length, i14);
                                            if (m119906g("Xmp") == null) {
                                                this.f112704e[0].put("Xmp", new d(1, copyOfRange.length, length2, copyOfRange));
                                            }
                                        }
                                    }
                                    i15 = i16;
                                    i14 = 0;
                                }
                                byte[] bArr4 = new byte[i14];
                                if (bVar.read(bArr4) == i14) {
                                    if (m119906g("UserComment") == null) {
                                        this.f112704e[1].put("UserComment", d.m119928e(new String(bArr4, f112688b0)));
                                    }
                                    i14 = 0;
                                    if (i14 < 0) {
                                    }
                                } else {
                                    throw new IOException("Invalid exif");
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
                    }
                }
            } else {
                throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
            }
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
    }

    /* renamed from: n */
    private int m119894n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(AbstractC26080o.a.f124275b);
        byte[] bArr = new byte[AbstractC26080o.a.f124275b];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m119863A(bArr)) {
            return 4;
        }
        if (m119865C(bArr)) {
            return 9;
        }
        if (m119903z(bArr)) {
            return 12;
        }
        if (m119864B(bArr)) {
            return 7;
        }
        if (m119866D(bArr)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: o */
    private void m119895o(b bVar) {
        int i11;
        int i12;
        m119897q(bVar);
        d dVar = (d) this.f112704e[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.f112733d);
            try {
                bVar2.m119917f(this.f112706g);
                byte[] bArr = f112664D;
                byte[] bArr2 = new byte[bArr.length];
                bVar2.readFully(bArr2);
                bVar2.m119916d(0L);
                byte[] bArr3 = f112665E;
                byte[] bArr4 = new byte[bArr3.length];
                bVar2.readFully(bArr4);
                if (Arrays.equals(bArr2, bArr)) {
                    bVar2.m119916d(8L);
                } else if (Arrays.equals(bArr4, bArr3)) {
                    bVar2.m119916d(12L);
                }
                m119875M(bVar2, 6);
                bVar2.close();
                d dVar2 = (d) this.f112704e[7].get("PreviewImageStart");
                d dVar3 = (d) this.f112704e[7].get("PreviewImageLength");
                if (dVar2 != null && dVar3 != null) {
                    this.f112704e[5].put("JPEGInterchangeFormat", dVar2);
                    this.f112704e[5].put("JPEGInterchangeFormatLength", dVar3);
                }
                d dVar4 = (d) this.f112704e[8].get("AspectFrame");
                if (dVar4 != null) {
                    int[] iArr = (int[]) dVar4.m119938o(this.f112706g);
                    if (iArr != null && iArr.length == 4) {
                        int i13 = iArr[2];
                        int i14 = iArr[0];
                        if (i13 > i14 && (i11 = iArr[3]) > (i12 = iArr[1])) {
                            int i15 = (i13 - i14) + 1;
                            int i16 = (i11 - i12) + 1;
                            if (i15 < i16) {
                                int i17 = i15 + i16;
                                i16 = i17 - i16;
                                i15 = i17 - i16;
                            }
                            d m119933j = d.m119933j(i15, this.f112706g);
                            d m119933j2 = d.m119933j(i16, this.f112706g);
                            this.f112704e[0].put("ImageWidth", m119933j);
                            this.f112704e[0].put("ImageLength", m119933j2);
                            return;
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid aspect frame values. frame=");
                    sb2.append(Arrays.toString(iArr));
                }
            } catch (Throwable th2) {
                try {
                    bVar2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: p */
    private void m119896p(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        m119893k(bVar, i11, 5);
        bVar.m119916d(i12);
        bVar.m119917f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f112693t) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f112675O.f112734a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m119933j = d.m119933j(readShort, this.f112706g);
                d m119933j2 = d.m119933j(readShort2, this.f112706g);
                this.f112704e[0].put("ImageLength", m119933j);
                this.f112704e[0].put("ImageWidth", m119933j2);
                if (f112693t) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append((int) readShort);
                    sb3.append(", width: ");
                    sb3.append((int) readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: q */
    private void m119897q(b bVar) {
        d dVar;
        m119871I(bVar, bVar.available());
        m119875M(bVar, 0);
        m119882V(bVar, 0);
        m119882V(bVar, 5);
        m119882V(bVar, 4);
        m119883W(bVar);
        if (this.f112703d == 8 && (dVar = (d) this.f112704e[1].get("MakerNote")) != null) {
            b bVar2 = new b(dVar.f112733d);
            try {
                bVar2.m119917f(this.f112706g);
                bVar2.m119916d(6L);
                m119875M(bVar2, 9);
                d dVar2 = (d) this.f112704e[9].get("ColorSpace");
                if (dVar2 != null) {
                    this.f112704e[1].put("ColorSpace", dVar2);
                }
                bVar2.close();
            } catch (Throwable th2) {
                try {
                    bVar2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private void m119898r(b bVar) {
        m119897q(bVar);
        if (((d) this.f112704e[0].get("JpgFromRaw")) != null) {
            m119893k(bVar, this.f112716q, 5);
        }
        d dVar = (d) this.f112704e[0].get("ISO");
        d dVar2 = (d) this.f112704e[1].get("PhotographicSensitivity");
        if (dVar != null && dVar2 == null) {
            this.f112704e[1].put("PhotographicSensitivity", dVar);
        }
    }

    /* renamed from: u */
    private static Pair m119899u(String str) {
        int intValue;
        int i11;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair m119899u = m119899u(split[0]);
            if (((Integer) m119899u.first).intValue() == 2) {
                return m119899u;
            }
            for (int i12 = 1; i12 < split.length; i12++) {
                Pair m119899u2 = m119899u(split[i12]);
                if (!((Integer) m119899u2.first).equals(m119899u.first) && !((Integer) m119899u2.second).equals(m119899u.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) m119899u.first).intValue();
                }
                if (((Integer) m119899u.second).intValue() != -1 && (((Integer) m119899u2.first).equals(m119899u.second) || ((Integer) m119899u2.second).equals(m119899u.second))) {
                    i11 = ((Integer) m119899u.second).intValue();
                } else {
                    i11 = -1;
                }
                if (intValue == -1 && i11 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    m119899u = new Pair(Integer.valueOf(i11), -1);
                } else if (i11 == -1) {
                    m119899u = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return m119899u;
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            try {
                Long valueOf = Long.valueOf(Long.parseLong(str));
                if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                    return new Pair(3, 4);
                }
                if (valueOf.longValue() < 0) {
                    return new Pair(9, -1);
                }
                return new Pair(4, -1);
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        } catch (NumberFormatException unused3) {
            return new Pair(2, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m119900v(b bVar, HashMap hashMap) {
        int i11;
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m119936m = dVar.m119936m(this.f112706g);
            int min = Math.min(dVar2.m119936m(this.f112706g), bVar.m119913a() - m119936m);
            int i12 = this.f112703d;
            if (i12 != 4 && i12 != 9 && i12 != 10) {
                if (i12 == 7) {
                    i11 = this.f112713n;
                }
                if (f112693t) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Setting thumbnail attributes with offset: ");
                    sb2.append(m119936m);
                    sb2.append(", length: ");
                    sb2.append(min);
                }
                if (m119936m <= 0 && min > 0) {
                    this.f112707h = true;
                    this.f112708i = m119936m;
                    this.f112709j = min;
                    if (this.f112700a == null && this.f112702c == null && this.f112701b == null) {
                        byte[] bArr = new byte[min];
                        bVar.m119916d(m119936m);
                        bVar.readFully(bArr);
                        this.f112710k = bArr;
                        return;
                    }
                    return;
                }
            }
            i11 = this.f112712m;
            m119936m += i11;
            if (f112693t) {
            }
            if (m119936m <= 0) {
            }
        }
    }

    /* renamed from: w */
    private void m119901w(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] m119889e = m119889e(dVar.m119938o(this.f112706g));
            long[] m119889e2 = m119889e(dVar2.m119938o(this.f112706g));
            if (m119889e == null || m119889e2 == null) {
                return;
            }
            long j11 = 0;
            for (long j12 : m119889e2) {
                j11 += j12;
            }
            int i11 = (int) j11;
            byte[] bArr = new byte[i11];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < m119889e.length; i14++) {
                int i15 = (int) m119889e[i14];
                int i16 = (int) m119889e2[i14];
                int i17 = i15 - i12;
                bVar.m119916d(i17);
                int i18 = i12 + i17;
                byte[] bArr2 = new byte[i16];
                bVar.read(bArr2);
                i12 = i18 + i16;
                System.arraycopy(bArr2, 0, bArr, i13, i16);
                i13 += i16;
            }
            this.f112707h = true;
            this.f112710k = bArr;
            this.f112709j = i11;
        }
    }

    /* renamed from: y */
    private void m119902y(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f112702c = null;
            this.f112700a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m119867E(fileInputStream2.getFD())) {
                        this.f112701b = fileInputStream2.getFD();
                    } else {
                        this.f112701b = null;
                    }
                    m119870H(fileInputStream2);
                    m119887c(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m119887c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: z */
    public static boolean m119903z(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j11;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
            try {
                bVar.m119917f(ByteOrder.BIG_ENDIAN);
                readInt = bVar.readInt();
                bArr2 = new byte[4];
                bVar.read(bArr2);
            } catch (Exception unused) {
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (!Arrays.equals(bArr2, f112661A)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j11 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j11 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j12 = readInt - j11;
        if (j12 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z11 = false;
        boolean z12 = false;
        for (long j13 = 0; j13 < j12 / 4; j13++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j13 != 1) {
                if (Arrays.equals(bArr3, f112662B)) {
                    z11 = true;
                } else if (Arrays.equals(bArr3, f112663C)) {
                    z12 = true;
                }
                if (z11 && z12) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(7:(2:16|(1:18)(2:59|60))(2:61|(17:63|64|65|67|68|20|21|22|24|25|(1:27)(2:49|(1:51)(1:52))|28|29|30|(1:32)|33|34)(1:84))|28|29|30|(0)|33|34)|21|22|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:            r3 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:            r3 = null;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[Catch: all -> 0x00bf, Exception -> 0x00c3, TryCatch #9 {Exception -> 0x00c3, all -> 0x00bf, blocks: (B:25:0x00b3, B:27:0x00b7, B:49:0x00c6, B:51:0x00ca), top: B:24:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6 A[Catch: all -> 0x00bf, Exception -> 0x00c3, TryCatch #9 {Exception -> 0x00c3, all -> 0x00bf, blocks: (B:25:0x00b3, B:27:0x00b7, B:49:0x00c6, B:51:0x00ca), top: B:24:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m119904P() {
        ?? r62;
        File file;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream3;
        if (this.f112717r && this.f112703d == 4) {
            if (this.f112701b == null && this.f112700a == null) {
                throw new IOException("ExifInterface does not support saving attributes for the current input.");
            }
            this.f112718s = true;
            this.f112710k = m119910s();
            FileInputStream fileInputStream4 = null;
            try {
                try {
                    try {
                        if (this.f112700a != null) {
                            file = new File(this.f112700a + ".tmp");
                            if (new File(this.f112700a).renameTo(file)) {
                                fileInputStream = null;
                            } else {
                                throw new IOException("Couldn't rename to " + file.getAbsolutePath());
                            }
                        } else if (this.f112701b != null) {
                            file = File.createTempFile("temp", "jpg");
                            Os.lseek(this.f112701b, 0L, OsConstants.SEEK_SET);
                            fileInputStream = new FileInputStream(this.f112701b);
                            try {
                                r62 = new FileOutputStream(file);
                                try {
                                    m119890f(fileInputStream, r62);
                                    fileInputStream2 = r62;
                                    m119887c(fileInputStream);
                                    m119887c(fileInputStream2);
                                    fileInputStream3 = new FileInputStream(file);
                                    if (this.f112700a == null) {
                                        fileOutputStream = new FileOutputStream(this.f112700a);
                                    } else {
                                        FileDescriptor fileDescriptor = this.f112701b;
                                        if (fileDescriptor != null) {
                                            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream = new FileOutputStream(this.f112701b);
                                        } else {
                                            fileOutputStream = null;
                                        }
                                    }
                                    m119878Q(fileInputStream3, fileOutputStream);
                                    m119887c(fileInputStream3);
                                    m119887c(fileOutputStream);
                                    if (file != null) {
                                        file.delete();
                                    }
                                    this.f112710k = null;
                                    return;
                                } catch (Exception unused) {
                                    fileInputStream4 = fileInputStream;
                                    r62 = r62;
                                    try {
                                        throw new IOException("Failed to copy file");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        m119887c(fileInputStream4);
                                        m119887c(r62);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileInputStream4 = fileInputStream;
                                    m119887c(fileInputStream4);
                                    m119887c(r62);
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                r62 = 0;
                            } catch (Throwable th4) {
                                th = th4;
                                r62 = 0;
                            }
                        } else {
                            file = null;
                            fileInputStream = null;
                        }
                        m119878Q(fileInputStream3, fileOutputStream);
                        m119887c(fileInputStream3);
                        m119887c(fileOutputStream);
                        if (file != null) {
                        }
                        this.f112710k = null;
                        return;
                    } catch (Exception unused3) {
                        fileInputStream4 = fileInputStream3;
                        try {
                            throw new IOException("Failed to copy file");
                        } catch (Throwable th5) {
                            th = th5;
                            m119887c(fileInputStream4);
                            m119887c(fileOutputStream);
                            if (file != null) {
                                file.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileInputStream4 = fileInputStream3;
                        m119887c(fileInputStream4);
                        m119887c(fileOutputStream);
                        if (file != null) {
                        }
                        throw th;
                    }
                    fileInputStream3 = new FileInputStream(file);
                    if (this.f112700a == null) {
                    }
                } catch (Exception unused4) {
                    fileOutputStream = null;
                } catch (Throwable th7) {
                    th = th7;
                    fileOutputStream = null;
                }
                fileInputStream2 = fileInputStream;
                m119887c(fileInputStream);
                m119887c(fileInputStream2);
            } catch (Exception unused5) {
                r62 = 0;
            } catch (Throwable th8) {
                th = th8;
                r62 = 0;
            }
        } else {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        }
    }

    /* renamed from: R */
    public void m119905R(String str, String str2) {
        e eVar;
        int i11;
        String str3;
        String str4 = str;
        String str5 = str2;
        if (str4 != null) {
            if ("ISOSpeedRatings".equals(str4)) {
                str4 = "PhotographicSensitivity";
            }
            int i12 = 2;
            int i13 = 1;
            if (str5 != null && f112686Z.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f112692f0.matcher(str5);
                    if (!matcher.find()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid value for ");
                        sb2.append(str4);
                        sb2.append(" : ");
                        sb2.append(str5);
                        return;
                    }
                    str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str5 = new f(Double.parseDouble(str2)).toString();
                    } catch (NumberFormatException unused) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid value for ");
                        sb3.append(str4);
                        sb3.append(" : ");
                        sb3.append(str5);
                        return;
                    }
                }
            }
            int i14 = 0;
            while (i14 < f112680T.length) {
                if ((i14 != 4 || this.f112707h) && (eVar = (e) f112685Y[i14].get(str4)) != null) {
                    if (str5 == null) {
                        this.f112704e[i14].remove(str4);
                    } else {
                        Pair m119899u = m119899u(str5);
                        if (eVar.f112736c != ((Integer) m119899u.first).intValue() && eVar.f112736c != ((Integer) m119899u.second).intValue()) {
                            int i15 = eVar.f112737d;
                            if (i15 != -1 && (i15 == ((Integer) m119899u.first).intValue() || eVar.f112737d == ((Integer) m119899u.second).intValue())) {
                                i11 = eVar.f112737d;
                            } else {
                                int i16 = eVar.f112736c;
                                if (i16 != i13 && i16 != 7 && i16 != i12) {
                                    if (f112693t) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Given tag (");
                                        sb4.append(str4);
                                        sb4.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = f112667G;
                                        sb4.append(strArr[eVar.f112736c]);
                                        String str6 = "";
                                        if (eVar.f112737d == -1) {
                                            str3 = "";
                                        } else {
                                            str3 = ", " + strArr[eVar.f112737d];
                                        }
                                        sb4.append(str3);
                                        sb4.append(" (guess: ");
                                        sb4.append(strArr[((Integer) m119899u.first).intValue()]);
                                        if (((Integer) m119899u.second).intValue() != -1) {
                                            str6 = ", " + strArr[((Integer) m119899u.second).intValue()];
                                        }
                                        sb4.append(str6);
                                        sb4.append(")");
                                    }
                                } else {
                                    i11 = i16;
                                }
                            }
                        } else {
                            i11 = eVar.f112736c;
                        }
                        switch (i11) {
                            case 1:
                                this.f112704e[i14].put(str4, d.m119924a(str5));
                                break;
                            case 2:
                            case 7:
                                this.f112704e[i14].put(str4, d.m119928e(str5));
                                break;
                            case 3:
                                String[] split = str5.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i17 = 0; i17 < split.length; i17++) {
                                    iArr[i17] = Integer.parseInt(split[i17]);
                                }
                                this.f112704e[i14].put(str4, d.m119934k(iArr, this.f112706g));
                                break;
                            case 4:
                                String[] split2 = str5.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i18 = 0; i18 < split2.length; i18++) {
                                    jArr[i18] = Long.parseLong(split2[i18]);
                                }
                                this.f112704e[i14].put(str4, d.m119930g(jArr, this.f112706g));
                                break;
                            case 5:
                                String[] split3 = str5.split(",", -1);
                                f[] fVarArr = new f[split3.length];
                                for (int i19 = 0; i19 < split3.length; i19++) {
                                    String[] split4 = split3[i19].split("/", -1);
                                    fVarArr[i19] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                }
                                this.f112704e[i14].put(str4, d.m119932i(fVarArr, this.f112706g));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (f112693t) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Data format isn't one of expected formats: ");
                                    sb5.append(i11);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                String[] split5 = str5.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i21 = 0; i21 < split5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(split5[i21]);
                                }
                                this.f112704e[i14].put(str4, d.m119926c(iArr2, this.f112706g));
                                break;
                            case 10:
                                String[] split6 = str5.split(",", -1);
                                f[] fVarArr2 = new f[split6.length];
                                int i22 = 0;
                                while (i22 < split6.length) {
                                    String[] split7 = split6[i22].split("/", -1);
                                    fVarArr2[i22] = new f((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i13]));
                                    i22++;
                                    i13 = 1;
                                }
                                this.f112704e[i14].put(str4, d.m119927d(fVarArr2, this.f112706g));
                                break;
                            case 12:
                                String[] split8 = str5.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i23 = 0; i23 < split8.length; i23++) {
                                    dArr[i23] = Double.parseDouble(split8[i23]);
                                }
                                this.f112704e[i14].put(str4, d.m119925b(dArr, this.f112706g));
                                break;
                        }
                    }
                }
                i14++;
                i12 = 2;
                i13 = 1;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: g */
    public String m119906g(String str) {
        if (str != null) {
            d m119891i = m119891i(str);
            if (m119891i != null) {
                if (!f112686Z.contains(str)) {
                    return m119891i.m119937n(this.f112706g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i11 = m119891i.f112730a;
                    if (i11 != 5 && i11 != 10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GPS Timestamp format is not rational. format=");
                        sb2.append(m119891i.f112730a);
                        return null;
                    }
                    f[] fVarArr = (f[]) m119891i.m119938o(this.f112706g);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        f fVar2 = fVarArr[1];
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f112738a) / ((float) fVar.f112739b))), Integer.valueOf((int) (((float) fVar2.f112738a) / ((float) fVar2.f112739b))), Integer.valueOf((int) (((float) fVar3.f112738a) / ((float) fVar3.f112739b))));
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid GPS Timestamp array. array=");
                    sb3.append(Arrays.toString(fVarArr));
                    return null;
                }
                try {
                    return Double.toString(m119891i.m119935l(this.f112706g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: h */
    public int m119907h(String str, int i11) {
        if (str != null) {
            d m119891i = m119891i(str);
            if (m119891i == null) {
                return i11;
            }
            try {
                return m119891i.m119936m(this.f112706g);
            } catch (NumberFormatException unused) {
                return i11;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: l */
    public boolean m119908l(float[] fArr) {
        double[] m119909m = m119909m();
        if (m119909m == null) {
            return false;
        }
        fArr[0] = (float) m119909m[0];
        fArr[1] = (float) m119909m[1];
        return true;
    }

    /* renamed from: m */
    public double[] m119909m() {
        String m119906g = m119906g("GPSLatitude");
        String m119906g2 = m119906g("GPSLatitudeRef");
        String m119906g3 = m119906g("GPSLongitude");
        String m119906g4 = m119906g("GPSLongitudeRef");
        if (m119906g != null && m119906g2 != null && m119906g3 != null && m119906g4 != null) {
            try {
                return new double[]{m119888d(m119906g, m119906g2), m119888d(m119906g3, m119906g4)};
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Latitude/longitude values are not parsable. ");
                sb2.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", m119906g, m119906g2, m119906g3, m119906g4));
                return null;
            }
        }
        return null;
    }

    /* renamed from: s */
    public byte[] m119910s() {
        int i11 = this.f112711l;
        if (i11 != 6 && i11 != 7) {
            return null;
        }
        return m119911t();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: all -> 0x008b, Exception -> 0x008f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x008f, all -> 0x008b, blocks: (B:17:0x0064, B:20:0x0074, B:22:0x0080, B:27:0x0091, B:28:0x0096, B:29:0x0097, B:30:0x009c, B:31:0x009d, B:32:0x00a2), top: B:15:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x008b, Exception -> 0x008f, TryCatch #8 {Exception -> 0x008f, all -> 0x008b, blocks: (B:17:0x0064, B:20:0x0074, B:22:0x0080, B:27:0x0091, B:28:0x0096, B:29:0x0097, B:30:0x009c, B:31:0x009d, B:32:0x00a2), top: B:15:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m119911t() {
        Throwable th2;
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        Throwable th3;
        InputStream inputStream2 = null;
        if (!this.f112707h) {
            return null;
        }
        byte[] bArr = this.f112710k;
        if (bArr != null) {
            return bArr;
        }
        try {
            inputStream = this.f112702c;
        } catch (Exception unused) {
            inputStream = null;
            fileDescriptor = null;
        } catch (Throwable th4) {
            th2 = th4;
            fileDescriptor = null;
        }
        try {
            if (inputStream != null) {
                try {
                    if (inputStream.markSupported()) {
                        inputStream.reset();
                    } else {
                        m119887c(inputStream);
                        return null;
                    }
                } catch (Exception unused2) {
                    fileDescriptor = null;
                    m119887c(inputStream);
                    if (fileDescriptor != null) {
                    }
                    return null;
                } catch (Throwable th5) {
                    inputStream2 = inputStream;
                    th2 = th5;
                    fileDescriptor = null;
                    m119887c(inputStream2);
                    if (fileDescriptor != null) {
                    }
                }
            } else if (this.f112700a != null) {
                inputStream = new FileInputStream(this.f112700a);
            } else {
                FileDescriptor fileDescriptor2 = this.f112701b;
                if (fileDescriptor2 != null) {
                    FileDescriptor dup = Os.dup(fileDescriptor2);
                    try {
                        Os.lseek(dup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = dup;
                        inputStream = new FileInputStream(dup);
                    } catch (Exception unused3) {
                        fileDescriptor = dup;
                        inputStream = null;
                        m119887c(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return null;
                    } catch (Throwable th6) {
                        th3 = th6;
                        fileDescriptor = dup;
                        th2 = th3;
                        m119887c(inputStream2);
                        if (fileDescriptor != null) {
                        }
                    }
                } else {
                    inputStream = null;
                    fileDescriptor = null;
                }
                if (inputStream == null) {
                    if (inputStream.skip(this.f112708i) == this.f112708i) {
                        byte[] bArr2 = new byte[this.f112709j];
                        if (inputStream.read(bArr2) == this.f112709j) {
                            this.f112710k = bArr2;
                            m119887c(inputStream);
                            if (fileDescriptor != null) {
                                m119886b(fileDescriptor);
                            }
                            return bArr2;
                        }
                        throw new IOException("Corrupted image");
                    }
                    throw new IOException("Corrupted image");
                }
                throw new FileNotFoundException();
            }
            if (inputStream == null) {
            }
        } catch (Exception unused4) {
            m119887c(inputStream);
            if (fileDescriptor != null) {
                m119886b(fileDescriptor);
            }
            return null;
        } catch (Throwable th7) {
            th3 = th7;
            inputStream2 = inputStream;
            th2 = th3;
            m119887c(inputStream2);
            if (fileDescriptor != null) {
                m119886b(fileDescriptor);
                throw th2;
            }
            throw th2;
        }
        fileDescriptor = null;
    }

    /* renamed from: x */
    public boolean m119912x(String str) {
        if (m119891i(str) != null) {
            return true;
        }
        return false;
    }

    public C23257x1(String str) {
        e[][] eVarArr = f112680T;
        this.f112704e = new HashMap[eVarArr.length];
        this.f112705f = new HashSet(eVarArr.length);
        this.f112706g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m119902y(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C23257x1(FileDescriptor fileDescriptor) {
        boolean z11;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = f112680T;
        this.f112704e = new HashMap[eVarArr.length];
        this.f112705f = new HashSet(eVarArr.length);
        this.f112706g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f112702c = null;
            this.f112700a = null;
            if (m119867E(fileDescriptor)) {
                this.f112701b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z11 = true;
                } catch (Exception e11) {
                    throw new IOException("Failed to duplicate file descriptor", e11);
                }
            } else {
                this.f112701b = null;
                z11 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
            } catch (Throwable th3) {
                fileInputStream = null;
                th2 = th3;
            }
            try {
                m119870H(fileInputStream);
                m119887c(fileInputStream);
                if (z11) {
                    m119886b(fileDescriptor);
                    return;
                }
                return;
            } catch (Throwable th4) {
                th2 = th4;
                m119887c(fileInputStream);
                if (z11) {
                    m119886b(fileDescriptor);
                }
                throw th2;
            }
        }
        throw new NullPointerException("fileDescriptor cannot be null");
    }
}
