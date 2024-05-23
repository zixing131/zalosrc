package com.google.protobuf;

import com.google.protobuf.AbstractC6807h1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends AbstractC6796e {

    /* renamed from: c */
    private static final Logger f37225c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    private static final boolean f37226d = AbstractC6804g1.m34842E();

    /* renamed from: a */
    C6805h f37227a;

    /* renamed from: b */
    private boolean f37228b;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    /* loaded from: classes3.dex */
    public static class C6783b extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f37229e;

        /* renamed from: f */
        private final int f37230f;

        /* renamed from: g */
        private final int f37231g;

        /* renamed from: h */
        private int f37232h;

        C6783b(byte[] bArr, int i11, int i12) {
            super();
            if (bArr != null) {
                int i13 = i11 + i12;
                if ((i11 | i12 | (bArr.length - i13)) >= 0) {
                    this.f37229e = bArr;
                    this.f37230f = i11;
                    this.f37232h = i11;
                    this.f37231g = i13;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            throw new NullPointerException("buffer");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: A0 */
        public final void mo34655A0(int i11, InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
            mo34669O0(i11, 2);
            mo34671Q0(((AbstractC6784a) interfaceC6809i0).m34713m(interfaceC6839w0));
            interfaceC6839w0.mo35046b(interfaceC6809i0, this.f37227a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: B0 */
        public final void mo34656B0(InterfaceC6809i0 interfaceC6809i0) {
            mo34671Q0(interfaceC6809i0.mo34978f());
            interfaceC6809i0.mo34979h(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: C0 */
        public final void mo34657C0(int i11, InterfaceC6809i0 interfaceC6809i0) {
            mo34669O0(1, 3);
            mo34670P0(2, i11);
            m34705U0(3, interfaceC6809i0);
            mo34669O0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: D0 */
        public final void mo34658D0(int i11, AbstractC6799f abstractC6799f) {
            mo34669O0(1, 3);
            mo34670P0(2, i11);
            mo34684g0(3, abstractC6799f);
            mo34669O0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: M0 */
        public final void mo34667M0(int i11, String str) {
            mo34669O0(i11, 2);
            mo34668N0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: N0 */
        public final void mo34668N0(String str) {
            int i11 = this.f37232h;
            try {
                int m34624R = CodedOutputStream.m34624R(str.length() * 3);
                int m34624R2 = CodedOutputStream.m34624R(str.length());
                if (m34624R2 == m34624R) {
                    int i12 = i11 + m34624R2;
                    this.f37232h = i12;
                    int m34956e = AbstractC6807h1.m34956e(str, this.f37229e, i12, mo34677a0());
                    this.f37232h = i11;
                    mo34671Q0((m34956e - i11) - m34624R2);
                    this.f37232h = m34956e;
                } else {
                    mo34671Q0(AbstractC6807h1.m34957f(str));
                    this.f37232h = AbstractC6807h1.m34956e(str, this.f37229e, this.f37232h, mo34677a0());
                }
            } catch (AbstractC6807h1.c e11) {
                this.f37232h = i11;
                m34674W(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: O0 */
        public final void mo34669O0(int i11, int i12) {
            mo34671Q0(AbstractC6810i1.m34983c(i11, i12));
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: P0 */
        public final void mo34670P0(int i11, int i12) {
            mo34669O0(i11, 0);
            mo34671Q0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: Q0 */
        public final void mo34671Q0(int i11) {
            if (CodedOutputStream.f37226d && !AbstractC6793d.m34762c() && mo34677a0() >= 5) {
                if ((i11 & (-128)) == 0) {
                    byte[] bArr = this.f37229e;
                    int i12 = this.f37232h;
                    this.f37232h = i12 + 1;
                    AbstractC6804g1.m34848K(bArr, i12, (byte) i11);
                    return;
                }
                byte[] bArr2 = this.f37229e;
                int i13 = this.f37232h;
                this.f37232h = i13 + 1;
                AbstractC6804g1.m34848K(bArr2, i13, (byte) (i11 | 128));
                int i14 = i11 >>> 7;
                if ((i14 & (-128)) == 0) {
                    byte[] bArr3 = this.f37229e;
                    int i15 = this.f37232h;
                    this.f37232h = i15 + 1;
                    AbstractC6804g1.m34848K(bArr3, i15, (byte) i14);
                    return;
                }
                byte[] bArr4 = this.f37229e;
                int i16 = this.f37232h;
                this.f37232h = i16 + 1;
                AbstractC6804g1.m34848K(bArr4, i16, (byte) (i14 | 128));
                int i17 = i11 >>> 14;
                if ((i17 & (-128)) == 0) {
                    byte[] bArr5 = this.f37229e;
                    int i18 = this.f37232h;
                    this.f37232h = i18 + 1;
                    AbstractC6804g1.m34848K(bArr5, i18, (byte) i17);
                    return;
                }
                byte[] bArr6 = this.f37229e;
                int i19 = this.f37232h;
                this.f37232h = i19 + 1;
                AbstractC6804g1.m34848K(bArr6, i19, (byte) (i17 | 128));
                int i21 = i11 >>> 21;
                if ((i21 & (-128)) == 0) {
                    byte[] bArr7 = this.f37229e;
                    int i22 = this.f37232h;
                    this.f37232h = i22 + 1;
                    AbstractC6804g1.m34848K(bArr7, i22, (byte) i21);
                    return;
                }
                byte[] bArr8 = this.f37229e;
                int i23 = this.f37232h;
                this.f37232h = i23 + 1;
                AbstractC6804g1.m34848K(bArr8, i23, (byte) (i21 | 128));
                byte[] bArr9 = this.f37229e;
                int i24 = this.f37232h;
                this.f37232h = i24 + 1;
                AbstractC6804g1.m34848K(bArr9, i24, (byte) (i11 >>> 28));
                return;
            }
            while ((i11 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f37229e;
                    int i25 = this.f37232h;
                    this.f37232h = i25 + 1;
                    bArr10[i25] = (byte) ((i11 & 127) | 128);
                    i11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), 1), e11);
                }
            }
            byte[] bArr11 = this.f37229e;
            int i26 = this.f37232h;
            this.f37232h = i26 + 1;
            bArr11[i26] = (byte) i11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: R0 */
        public final void mo34672R0(int i11, long j11) {
            mo34669O0(i11, 0);
            mo34673S0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: S0 */
        public final void mo34673S0(long j11) {
            if (CodedOutputStream.f37226d && mo34677a0() >= 10) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.f37229e;
                    int i11 = this.f37232h;
                    this.f37232h = i11 + 1;
                    AbstractC6804g1.m34848K(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.f37229e;
                int i12 = this.f37232h;
                this.f37232h = i12 + 1;
                AbstractC6804g1.m34848K(bArr2, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f37229e;
                    int i13 = this.f37232h;
                    this.f37232h = i13 + 1;
                    bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), 1), e11);
                }
            }
            byte[] bArr4 = this.f37229e;
            int i14 = this.f37232h;
            this.f37232h = i14 + 1;
            bArr4[i14] = (byte) j11;
        }

        /* renamed from: T0 */
        public final void m34704T0(byte[] bArr, int i11, int i12) {
            try {
                System.arraycopy(bArr, i11, this.f37229e, this.f37232h, i12);
                this.f37232h += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), Integer.valueOf(i12)), e11);
            }
        }

        /* renamed from: U0 */
        public final void m34705U0(int i11, InterfaceC6809i0 interfaceC6809i0) {
            mo34669O0(i11, 2);
            mo34656B0(interfaceC6809i0);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.AbstractC6796e
        /* renamed from: a */
        public final void mo34676a(byte[] bArr, int i11, int i12) {
            m34704T0(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: a0 */
        public final int mo34677a0() {
            return this.f37231g - this.f37232h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: b0 */
        public final void mo34678b0(byte b11) {
            try {
                byte[] bArr = this.f37229e;
                int i11 = this.f37232h;
                this.f37232h = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: c0 */
        public final void mo34680c0(int i11, boolean z11) {
            mo34669O0(i11, 0);
            mo34678b0(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: f0 */
        public final void mo34683f0(byte[] bArr, int i11, int i12) {
            mo34671Q0(i12);
            m34704T0(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: g0 */
        public final void mo34684g0(int i11, AbstractC6799f abstractC6799f) {
            mo34669O0(i11, 2);
            mo34685h0(abstractC6799f);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: h0 */
        public final void mo34685h0(AbstractC6799f abstractC6799f) {
            mo34671Q0(abstractC6799f.size());
            abstractC6799f.mo34797C(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: m0 */
        public final void mo34690m0(int i11, int i12) {
            mo34669O0(i11, 5);
            mo34691n0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: n0 */
        public final void mo34691n0(int i11) {
            try {
                byte[] bArr = this.f37229e;
                int i12 = this.f37232h;
                bArr[i12] = (byte) (i11 & 255);
                bArr[i12 + 1] = (byte) ((i11 >> 8) & 255);
                bArr[i12 + 2] = (byte) ((i11 >> 16) & 255);
                this.f37232h = i12 + 4;
                bArr[i12 + 3] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: o0 */
        public final void mo34692o0(int i11, long j11) {
            mo34669O0(i11, 1);
            mo34693p0(j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: p0 */
        public final void mo34693p0(long j11) {
            try {
                byte[] bArr = this.f37229e;
                int i11 = this.f37232h;
                bArr[i11] = (byte) (((int) j11) & 255);
                bArr[i11 + 1] = (byte) (((int) (j11 >> 8)) & 255);
                bArr[i11 + 2] = (byte) (((int) (j11 >> 16)) & 255);
                bArr[i11 + 3] = (byte) (((int) (j11 >> 24)) & 255);
                bArr[i11 + 4] = (byte) (((int) (j11 >> 32)) & 255);
                bArr[i11 + 5] = (byte) (((int) (j11 >> 40)) & 255);
                bArr[i11 + 6] = (byte) (((int) (j11 >> 48)) & 255);
                this.f37232h = i11 + 8;
                bArr[i11 + 7] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37232h), Integer.valueOf(this.f37231g), 1), e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: w0 */
        public final void mo34700w0(int i11, int i12) {
            mo34669O0(i11, 0);
            mo34701x0(i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        /* renamed from: x0 */
        public final void mo34701x0(int i11) {
            if (i11 >= 0) {
                mo34671Q0(i11);
            } else {
                mo34673S0(i11);
            }
        }
    }

    /* synthetic */ CodedOutputStream(C6782a c6782a) {
        this();
    }

    /* renamed from: A */
    public static int m34607A(int i11, InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        return m34622P(i11) + m34609C(interfaceC6809i0, interfaceC6839w0);
    }

    /* renamed from: B */
    public static int m34608B(InterfaceC6809i0 interfaceC6809i0) {
        return m34654z(interfaceC6809i0.mo34978f());
    }

    /* renamed from: C */
    public static int m34609C(InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        return m34654z(((AbstractC6784a) interfaceC6809i0).m34713m(interfaceC6839w0));
    }

    /* renamed from: D */
    public static int m34610D(int i11, AbstractC6799f abstractC6799f) {
        return (m34622P(1) * 2) + m34623Q(2, i11) + m34635g(3, abstractC6799f);
    }

    /* renamed from: E */
    public static int m34611E(int i11) {
        return m34624R(i11);
    }

    /* renamed from: F */
    public static int m34612F(int i11, int i12) {
        return m34622P(i11) + m34613G(i12);
    }

    /* renamed from: G */
    public static int m34613G(int i11) {
        return 4;
    }

    /* renamed from: H */
    public static int m34614H(int i11, long j11) {
        return m34622P(i11) + m34615I(j11);
    }

    /* renamed from: I */
    public static int m34615I(long j11) {
        return 8;
    }

    /* renamed from: J */
    public static int m34616J(int i11, int i12) {
        return m34622P(i11) + m34617K(i12);
    }

    /* renamed from: K */
    public static int m34617K(int i11) {
        return m34624R(m34627U(i11));
    }

    /* renamed from: L */
    public static int m34618L(int i11, long j11) {
        return m34622P(i11) + m34619M(j11);
    }

    /* renamed from: M */
    public static int m34619M(long j11) {
        return m34626T(m34628V(j11));
    }

    /* renamed from: N */
    public static int m34620N(int i11, String str) {
        return m34622P(i11) + m34621O(str);
    }

    /* renamed from: O */
    public static int m34621O(String str) {
        int length;
        try {
            length = AbstractC6807h1.m34957f(str);
        } catch (AbstractC6807h1.c unused) {
            length = str.getBytes(AbstractC6830s.f37474a).length;
        }
        return m34654z(length);
    }

    /* renamed from: P */
    public static int m34622P(int i11) {
        return m34624R(AbstractC6810i1.m34983c(i11, 0));
    }

    /* renamed from: Q */
    public static int m34623Q(int i11, int i12) {
        return m34622P(i11) + m34624R(i12);
    }

    /* renamed from: R */
    public static int m34624R(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: S */
    public static int m34625S(int i11, long j11) {
        return m34622P(i11) + m34626T(j11);
    }

    /* renamed from: T */
    public static int m34626T(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            j11 >>>= 28;
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    /* renamed from: U */
    public static int m34627U(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    /* renamed from: V */
    public static long m34628V(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    /* renamed from: Y */
    public static CodedOutputStream m34629Y(byte[] bArr) {
        return m34630Z(bArr, 0, bArr.length);
    }

    /* renamed from: Z */
    public static CodedOutputStream m34630Z(byte[] bArr, int i11, int i12) {
        return new C6783b(bArr, i11, i12);
    }

    /* renamed from: d */
    public static int m34632d(int i11, boolean z11) {
        return m34622P(i11) + m34633e(z11);
    }

    /* renamed from: e */
    public static int m34633e(boolean z11) {
        return 1;
    }

    /* renamed from: f */
    public static int m34634f(byte[] bArr) {
        return m34654z(bArr.length);
    }

    /* renamed from: g */
    public static int m34635g(int i11, AbstractC6799f abstractC6799f) {
        return m34622P(i11) + m34636h(abstractC6799f);
    }

    /* renamed from: h */
    public static int m34636h(AbstractC6799f abstractC6799f) {
        return m34654z(abstractC6799f.size());
    }

    /* renamed from: i */
    public static int m34637i(int i11, double d11) {
        return m34622P(i11) + m34638j(d11);
    }

    /* renamed from: j */
    public static int m34638j(double d11) {
        return 8;
    }

    /* renamed from: k */
    public static int m34639k(int i11, int i12) {
        return m34622P(i11) + m34640l(i12);
    }

    /* renamed from: l */
    public static int m34640l(int i11) {
        return m34651w(i11);
    }

    /* renamed from: m */
    public static int m34641m(int i11, int i12) {
        return m34622P(i11) + m34642n(i12);
    }

    /* renamed from: n */
    public static int m34642n(int i11) {
        return 4;
    }

    /* renamed from: o */
    public static int m34643o(int i11, long j11) {
        return m34622P(i11) + m34644p(j11);
    }

    /* renamed from: p */
    public static int m34644p(long j11) {
        return 8;
    }

    /* renamed from: q */
    public static int m34645q(int i11, float f11) {
        return m34622P(i11) + m34646r(f11);
    }

    /* renamed from: r */
    public static int m34646r(float f11) {
        return 4;
    }

    /* renamed from: s */
    public static int m34647s(int i11, InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        return (m34622P(i11) * 2) + m34649u(interfaceC6809i0, interfaceC6839w0);
    }

    /* renamed from: t */
    public static int m34648t(InterfaceC6809i0 interfaceC6809i0) {
        return interfaceC6809i0.mo34978f();
    }

    /* renamed from: u */
    static int m34649u(InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        return ((AbstractC6784a) interfaceC6809i0).m34713m(interfaceC6839w0);
    }

    /* renamed from: v */
    public static int m34650v(int i11, int i12) {
        return m34622P(i11) + m34651w(i12);
    }

    /* renamed from: w */
    public static int m34651w(int i11) {
        if (i11 >= 0) {
            return m34624R(i11);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m34652x(int i11, long j11) {
        return m34622P(i11) + m34653y(j11);
    }

    /* renamed from: y */
    public static int m34653y(long j11) {
        return m34626T(j11);
    }

    /* renamed from: z */
    public static int m34654z(int i11) {
        return m34624R(i11) + i11;
    }

    /* renamed from: A0 */
    public abstract void mo34655A0(int i11, InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0);

    /* renamed from: B0 */
    public abstract void mo34656B0(InterfaceC6809i0 interfaceC6809i0);

    /* renamed from: C0 */
    public abstract void mo34657C0(int i11, InterfaceC6809i0 interfaceC6809i0);

    /* renamed from: D0 */
    public abstract void mo34658D0(int i11, AbstractC6799f abstractC6799f);

    /* renamed from: E0 */
    public final void m34659E0(int i11, int i12) {
        mo34690m0(i11, i12);
    }

    /* renamed from: F0 */
    public final void m34660F0(int i11) {
        mo34691n0(i11);
    }

    /* renamed from: G0 */
    public final void m34661G0(int i11, long j11) {
        mo34692o0(i11, j11);
    }

    /* renamed from: H0 */
    public final void m34662H0(long j11) {
        mo34693p0(j11);
    }

    /* renamed from: I0 */
    public final void m34663I0(int i11, int i12) {
        mo34670P0(i11, m34627U(i12));
    }

    /* renamed from: J0 */
    public final void m34664J0(int i11) {
        mo34671Q0(m34627U(i11));
    }

    /* renamed from: K0 */
    public final void m34665K0(int i11, long j11) {
        mo34672R0(i11, m34628V(j11));
    }

    /* renamed from: L0 */
    public final void m34666L0(long j11) {
        mo34673S0(m34628V(j11));
    }

    /* renamed from: M0 */
    public abstract void mo34667M0(int i11, String str);

    /* renamed from: N0 */
    public abstract void mo34668N0(String str);

    /* renamed from: O0 */
    public abstract void mo34669O0(int i11, int i12);

    /* renamed from: P0 */
    public abstract void mo34670P0(int i11, int i12);

    /* renamed from: Q0 */
    public abstract void mo34671Q0(int i11);

    /* renamed from: R0 */
    public abstract void mo34672R0(int i11, long j11);

    /* renamed from: S0 */
    public abstract void mo34673S0(long j11);

    /* renamed from: W */
    final void m34674W(String str, AbstractC6807h1.c cVar) {
        f37225c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(AbstractC6830s.f37474a);
        try {
            mo34671Q0(bytes.length);
            mo34676a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e11) {
            throw e11;
        } catch (IndexOutOfBoundsException e12) {
            throw new OutOfSpaceException(e12);
        }
    }

    /* renamed from: X */
    public boolean m34675X() {
        return this.f37228b;
    }

    @Override // com.google.protobuf.AbstractC6796e
    /* renamed from: a */
    public abstract void mo34676a(byte[] bArr, int i11, int i12);

    /* renamed from: a0 */
    public abstract int mo34677a0();

    /* renamed from: b0 */
    public abstract void mo34678b0(byte b11);

    /* renamed from: c */
    public final void m34679c() {
        if (mo34677a0() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public abstract void mo34680c0(int i11, boolean z11);

    /* renamed from: d0 */
    public final void m34681d0(boolean z11) {
        mo34678b0(z11 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: e0 */
    public final void m34682e0(byte[] bArr) {
        mo34683f0(bArr, 0, bArr.length);
    }

    /* renamed from: f0 */
    abstract void mo34683f0(byte[] bArr, int i11, int i12);

    /* renamed from: g0 */
    public abstract void mo34684g0(int i11, AbstractC6799f abstractC6799f);

    /* renamed from: h0 */
    public abstract void mo34685h0(AbstractC6799f abstractC6799f);

    /* renamed from: i0 */
    public final void m34686i0(int i11, double d11) {
        mo34692o0(i11, Double.doubleToRawLongBits(d11));
    }

    /* renamed from: j0 */
    public final void m34687j0(double d11) {
        mo34693p0(Double.doubleToRawLongBits(d11));
    }

    /* renamed from: k0 */
    public final void m34688k0(int i11, int i12) {
        mo34700w0(i11, i12);
    }

    /* renamed from: l0 */
    public final void m34689l0(int i11) {
        mo34701x0(i11);
    }

    /* renamed from: m0 */
    public abstract void mo34690m0(int i11, int i12);

    /* renamed from: n0 */
    public abstract void mo34691n0(int i11);

    /* renamed from: o0 */
    public abstract void mo34692o0(int i11, long j11);

    /* renamed from: p0 */
    public abstract void mo34693p0(long j11);

    /* renamed from: q0 */
    public final void m34694q0(int i11, float f11) {
        mo34690m0(i11, Float.floatToRawIntBits(f11));
    }

    /* renamed from: r0 */
    public final void m34695r0(float f11) {
        mo34691n0(Float.floatToRawIntBits(f11));
    }

    /* renamed from: s0 */
    public final void m34696s0(int i11, InterfaceC6809i0 interfaceC6809i0) {
        mo34669O0(i11, 3);
        m34698u0(interfaceC6809i0);
        mo34669O0(i11, 4);
    }

    /* renamed from: t0 */
    public final void m34697t0(int i11, InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        mo34669O0(i11, 3);
        m34699v0(interfaceC6809i0, interfaceC6839w0);
        mo34669O0(i11, 4);
    }

    /* renamed from: u0 */
    public final void m34698u0(InterfaceC6809i0 interfaceC6809i0) {
        interfaceC6809i0.mo34979h(this);
    }

    /* renamed from: v0 */
    final void m34699v0(InterfaceC6809i0 interfaceC6809i0, InterfaceC6839w0 interfaceC6839w0) {
        interfaceC6839w0.mo35046b(interfaceC6809i0, this.f37227a);
    }

    /* renamed from: w0 */
    public abstract void mo34700w0(int i11, int i12);

    /* renamed from: x0 */
    public abstract void mo34701x0(int i11);

    /* renamed from: y0 */
    public final void m34702y0(int i11, long j11) {
        mo34672R0(i11, j11);
    }

    /* renamed from: z0 */
    public final void m34703z0(long j11) {
        mo34673S0(j11);
    }

    private CodedOutputStream() {
    }
}
