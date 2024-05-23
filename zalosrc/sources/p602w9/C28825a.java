package p602w9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: w9.a */
/* loaded from: classes.dex */
public class C28825a {

    /* renamed from: a */
    ByteBuffer f133513a;

    /* renamed from: b */
    int f133514b;

    /* renamed from: c */
    int f133515c;

    /* renamed from: d */
    int[] f133516d;

    /* renamed from: e */
    int f133517e;

    /* renamed from: f */
    boolean f133518f;

    /* renamed from: g */
    boolean f133519g;

    /* renamed from: h */
    int f133520h;

    /* renamed from: i */
    int[] f133521i;

    /* renamed from: j */
    int f133522j;

    /* renamed from: k */
    int f133523k;

    /* renamed from: l */
    boolean f133524l;

    /* renamed from: m */
    a f133525m;

    /* renamed from: n */
    final AbstractC28827c f133526n;

    /* renamed from: w9.a$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract ByteBuffer mo144111a(int i11);

        /* renamed from: b */
        public void m144112b(ByteBuffer byteBuffer) {
        }
    }

    /* renamed from: w9.a$b */
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: a */
        public static final b f133527a = new b();

        @Override // p602w9.C28825a.a
        /* renamed from: a */
        public ByteBuffer mo144111a(int i11) {
            return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C28825a(int i11, a aVar, ByteBuffer byteBuffer, AbstractC28827c abstractC28827c) {
        this.f133515c = 1;
        this.f133516d = null;
        this.f133517e = 0;
        this.f133518f = false;
        this.f133519g = false;
        this.f133521i = new int[16];
        this.f133522j = 0;
        this.f133523k = 0;
        this.f133524l = false;
        i11 = i11 <= 0 ? 1024 : i11;
        this.f133525m = aVar;
        if (byteBuffer != null) {
            this.f133513a = byteBuffer;
            byteBuffer.clear();
            this.f133513a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f133513a = aVar.mo144111a(i11);
        }
        this.f133526n = abstractC28827c;
        this.f133514b = this.f133513a.capacity();
    }

    /* renamed from: u */
    static ByteBuffer m144076u(ByteBuffer byteBuffer, a aVar) {
        int i11;
        int capacity = byteBuffer.capacity();
        if (capacity == 0) {
            i11 = 1024;
        } else {
            i11 = 2147483639;
            if (capacity != 2147483639) {
                if (((-1073741824) & capacity) == 0) {
                    i11 = capacity << 1;
                }
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        byteBuffer.position(0);
        ByteBuffer mo144111a = aVar.mo144111a(i11);
        mo144111a.position(mo144111a.clear().capacity() - capacity);
        mo144111a.put(byteBuffer);
        return mo144111a;
    }

    /* renamed from: A */
    public void m144077A(byte b11) {
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - 1;
        this.f133514b = i11;
        byteBuffer.put(i11, b11);
    }

    /* renamed from: B */
    public void m144078B(double d11) {
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - 8;
        this.f133514b = i11;
        byteBuffer.putDouble(i11, d11);
    }

    /* renamed from: C */
    public void m144079C(int i11) {
        ByteBuffer byteBuffer = this.f133513a;
        int i12 = this.f133514b - 4;
        this.f133514b = i12;
        byteBuffer.putInt(i12, i11);
    }

    /* renamed from: D */
    public void m144080D(long j11) {
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - 8;
        this.f133514b = i11;
        byteBuffer.putLong(i11, j11);
    }

    /* renamed from: E */
    public void m144081E(short s7) {
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - 2;
        this.f133514b = i11;
        byteBuffer.putShort(i11, s7);
    }

    /* renamed from: F */
    public byte[] m144082F() {
        return m144083G(this.f133514b, this.f133513a.capacity() - this.f133514b);
    }

    /* renamed from: G */
    public byte[] m144083G(int i11, int i12) {
        m144105t();
        byte[] bArr = new byte[i12];
        this.f133513a.position(i11);
        this.f133513a.get(bArr);
        return bArr;
    }

    /* renamed from: H */
    public void m144084H(int i11) {
        this.f133516d[i11] = m144107w();
    }

    /* renamed from: I */
    public void m144085I(int i11) {
        m144106v();
        int[] iArr = this.f133516d;
        if (iArr == null || iArr.length < i11) {
            this.f133516d = new int[i11];
        }
        this.f133517e = i11;
        Arrays.fill(this.f133516d, 0, i11, 0);
        this.f133518f = true;
        this.f133520h = m144107w();
    }

    /* renamed from: J */
    public void m144086J(int i11, int i12, int i13) {
        m144106v();
        this.f133523k = i12;
        int i14 = i11 * i12;
        m144109y(4, i14);
        m144109y(i13, i14);
        this.f133518f = true;
    }

    /* renamed from: a */
    public void m144087a(int i11, boolean z11, boolean z12) {
        if (this.f133524l || z11 != z12) {
            m144088b(z11);
            m144084H(i11);
        }
    }

    /* renamed from: b */
    public void m144088b(boolean z11) {
        m144109y(1, 0);
        m144110z(z11);
    }

    /* renamed from: c */
    public void m144089c(byte b11) {
        m144109y(1, 0);
        m144077A(b11);
    }

    /* renamed from: d */
    public void m144090d(int i11, byte b11, int i12) {
        if (this.f133524l || b11 != i12) {
            m144089c(b11);
            m144084H(i11);
        }
    }

    /* renamed from: e */
    public void m144091e(double d11) {
        m144109y(8, 0);
        m144078B(d11);
    }

    /* renamed from: f */
    public void m144092f(int i11, double d11, double d12) {
        if (this.f133524l || d11 != d12) {
            m144091e(d11);
            m144084H(i11);
        }
    }

    /* renamed from: g */
    public void m144093g(int i11) {
        m144109y(4, 0);
        m144079C(i11);
    }

    /* renamed from: h */
    public void m144094h(int i11, int i12, int i13) {
        if (this.f133524l || i12 != i13) {
            m144093g(i12);
            m144084H(i11);
        }
    }

    /* renamed from: i */
    public void m144095i(int i11, long j11, long j12) {
        if (this.f133524l || j11 != j12) {
            m144096j(j11);
            m144084H(i11);
        }
    }

    /* renamed from: j */
    public void m144096j(long j11) {
        m144109y(8, 0);
        m144080D(j11);
    }

    /* renamed from: k */
    public void m144097k(int i11) {
        m144109y(4, 0);
        m144079C((m144107w() - i11) + 4);
    }

    /* renamed from: l */
    public void m144098l(int i11, int i12, int i13) {
        if (this.f133524l || i12 != i13) {
            m144097k(i12);
            m144084H(i11);
        }
    }

    /* renamed from: m */
    public void m144099m(int i11, short s7, int i12) {
        if (this.f133524l || s7 != i12) {
            m144100n(s7);
            m144084H(i11);
        }
    }

    /* renamed from: n */
    public void m144100n(short s7) {
        m144109y(2, 0);
        m144081E(s7);
    }

    /* renamed from: o */
    public int mo101957o(CharSequence charSequence) {
        int mo101933c = this.f133526n.mo101933c(charSequence);
        m144089c((byte) 0);
        m144086J(1, mo101933c, 1);
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - mo101933c;
        this.f133514b = i11;
        byteBuffer.position(i11);
        this.f133526n.mo101932b(charSequence, this.f133513a);
        return m144102q();
    }

    /* renamed from: p */
    public int m144101p() {
        int i11;
        int i12;
        if (this.f133516d != null && this.f133518f) {
            m144093g(0);
            int m144107w = m144107w();
            int i13 = this.f133517e - 1;
            while (i13 >= 0 && this.f133516d[i13] == 0) {
                i13--;
            }
            for (int i14 = i13; i14 >= 0; i14--) {
                int i15 = this.f133516d[i14];
                if (i15 != 0) {
                    i12 = m144107w - i15;
                } else {
                    i12 = 0;
                }
                m144100n((short) i12);
            }
            m144100n((short) (m144107w - this.f133520h));
            m144100n((short) ((i13 + 3) * 2));
            int i16 = 0;
            loop2: while (true) {
                if (i16 < this.f133522j) {
                    int capacity = this.f133513a.capacity() - this.f133521i[i16];
                    int i17 = this.f133514b;
                    short s7 = this.f133513a.getShort(capacity);
                    if (s7 == this.f133513a.getShort(i17)) {
                        for (int i18 = 2; i18 < s7; i18 += 2) {
                            if (this.f133513a.getShort(capacity + i18) != this.f133513a.getShort(i17 + i18)) {
                                break;
                            }
                        }
                        i11 = this.f133521i[i16];
                        break loop2;
                    }
                    i16++;
                } else {
                    i11 = 0;
                    break;
                }
            }
            if (i11 != 0) {
                int capacity2 = this.f133513a.capacity() - m144107w;
                this.f133514b = capacity2;
                this.f133513a.putInt(capacity2, i11 - m144107w);
            } else {
                int i19 = this.f133522j;
                int[] iArr = this.f133521i;
                if (i19 == iArr.length) {
                    this.f133521i = Arrays.copyOf(iArr, i19 * 2);
                }
                int[] iArr2 = this.f133521i;
                int i21 = this.f133522j;
                this.f133522j = i21 + 1;
                iArr2[i21] = m144107w();
                ByteBuffer byteBuffer = this.f133513a;
                byteBuffer.putInt(byteBuffer.capacity() - m144107w, m144107w() - m144107w);
            }
            this.f133518f = false;
            return m144107w;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    /* renamed from: q */
    public int m144102q() {
        if (this.f133518f) {
            this.f133518f = false;
            m144079C(this.f133523k);
            return m144107w();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: r */
    public void m144103r(int i11) {
        m144104s(i11, false);
    }

    /* renamed from: s */
    protected void m144104s(int i11, boolean z11) {
        int i12;
        int i13 = this.f133515c;
        if (z11) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        m144109y(i13, i12 + 4);
        m144097k(i11);
        if (z11) {
            m144093g(this.f133513a.capacity() - this.f133514b);
        }
        this.f133513a.position(this.f133514b);
        this.f133519g = true;
    }

    /* renamed from: t */
    public void m144105t() {
        if (this.f133519g) {
        } else {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: v */
    public void m144106v() {
        if (!this.f133518f) {
        } else {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: w */
    public int m144107w() {
        return this.f133513a.capacity() - this.f133514b;
    }

    /* renamed from: x */
    public void m144108x(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBuffer = this.f133513a;
            int i13 = this.f133514b - 1;
            this.f133514b = i13;
            byteBuffer.put(i13, (byte) 0);
        }
    }

    /* renamed from: y */
    public void m144109y(int i11, int i12) {
        if (i11 > this.f133515c) {
            this.f133515c = i11;
        }
        int i13 = ((~((this.f133513a.capacity() - this.f133514b) + i12)) + 1) & (i11 - 1);
        while (this.f133514b < i13 + i11 + i12) {
            int capacity = this.f133513a.capacity();
            ByteBuffer byteBuffer = this.f133513a;
            ByteBuffer m144076u = m144076u(byteBuffer, this.f133525m);
            this.f133513a = m144076u;
            if (byteBuffer != m144076u) {
                this.f133525m.m144112b(byteBuffer);
            }
            this.f133514b += this.f133513a.capacity() - capacity;
        }
        m144108x(i13);
    }

    /* renamed from: z */
    public void m144110z(boolean z11) {
        ByteBuffer byteBuffer = this.f133513a;
        int i11 = this.f133514b - 1;
        this.f133514b = i11;
        byteBuffer.put(i11, z11 ? (byte) 1 : (byte) 0);
    }

    public C28825a(int i11) {
        this(i11, b.f133527a, null, AbstractC28827c.m144120d());
    }
}
