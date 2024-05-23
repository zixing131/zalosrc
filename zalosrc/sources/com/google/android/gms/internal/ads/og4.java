package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class og4 {

    /* renamed from: a */
    private final x02 f25629a = new x02(32);

    /* renamed from: b */
    private ng4 f25630b;

    /* renamed from: c */
    private ng4 f25631c;

    /* renamed from: d */
    private ng4 f25632d;

    /* renamed from: e */
    private long f25633e;

    /* renamed from: f */
    private final jj4 f25634f;

    public og4(jj4 jj4Var, byte[] bArr) {
        this.f25634f = jj4Var;
        ng4 ng4Var = new ng4(0L, 65536);
        this.f25630b = ng4Var;
        this.f25631c = ng4Var;
        this.f25632d = ng4Var;
    }

    /* renamed from: i */
    private final int m25181i(int i11) {
        ng4 ng4Var = this.f25632d;
        if (ng4Var.f25180c == null) {
            cj4 m23624b = this.f25634f.m23624b();
            ng4 ng4Var2 = new ng4(this.f25632d.f25179b, 65536);
            ng4Var.f25180c = m23624b;
            ng4Var.f25181d = ng4Var2;
        }
        return Math.min(i11, (int) (this.f25632d.f25179b - this.f25633e));
    }

    /* renamed from: j */
    private static ng4 m25182j(ng4 ng4Var, long j11) {
        while (j11 >= ng4Var.f25179b) {
            ng4Var = ng4Var.f25181d;
        }
        return ng4Var;
    }

    /* renamed from: k */
    private static ng4 m25183k(ng4 ng4Var, long j11, ByteBuffer byteBuffer, int i11) {
        ng4 m25182j = m25182j(ng4Var, j11);
        while (i11 > 0) {
            int min = Math.min(i11, (int) (m25182j.f25179b - j11));
            byteBuffer.put(m25182j.f25180c.f18453a, m25182j.m24922a(j11), min);
            i11 -= min;
            j11 += min;
            if (j11 == m25182j.f25179b) {
                m25182j = m25182j.f25181d;
            }
        }
        return m25182j;
    }

    /* renamed from: l */
    private static ng4 m25184l(ng4 ng4Var, long j11, byte[] bArr, int i11) {
        ng4 m25182j = m25182j(ng4Var, j11);
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(i12, (int) (m25182j.f25179b - j11));
            System.arraycopy(m25182j.f25180c.f18453a, m25182j.m24922a(j11), bArr, i11 - i12, min);
            i12 -= min;
            j11 += min;
            if (j11 == m25182j.f25179b) {
                m25182j = m25182j.f25181d;
            }
        }
        return m25182j;
    }

    /* renamed from: m */
    private static ng4 m25185m(ng4 ng4Var, il3 il3Var, qg4 qg4Var, x02 x02Var) {
        ng4 ng4Var2;
        int i11;
        if (il3Var.m23296k()) {
            long j11 = qg4Var.f26774b;
            x02Var.m27772c(1);
            ng4 m25184l = m25184l(ng4Var, j11, x02Var.m27777h(), 1);
            long j12 = j11 + 1;
            byte b11 = x02Var.m27777h()[0];
            int i12 = b11 & 128;
            int i13 = b11 & Byte.MAX_VALUE;
            hi3 hi3Var = il3Var.f22216b;
            byte[] bArr = hi3Var.f21768a;
            if (bArr == null) {
                hi3Var.f21768a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ng4Var2 = m25184l(m25184l, j12, hi3Var.f21768a, i13);
            long j13 = j12 + i13;
            if (i12 != 0) {
                x02Var.m27772c(2);
                ng4Var2 = m25184l(ng4Var2, j13, x02Var.m27777h(), 2);
                j13 += 2;
                i11 = x02Var.m27792w();
            } else {
                i11 = 1;
            }
            int[] iArr = hi3Var.f21771d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = hi3Var.f21772e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (i12 != 0) {
                int i14 = i11 * 6;
                x02Var.m27772c(i14);
                ng4Var2 = m25184l(ng4Var2, j13, x02Var.m27777h(), i14);
                j13 += i14;
                x02Var.m27775f(0);
                for (int i15 = 0; i15 < i11; i15++) {
                    iArr2[i15] = x02Var.m27792w();
                    iArr4[i15] = x02Var.m27791v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = qg4Var.f26773a - ((int) (j13 - qg4Var.f26774b));
            }
            C4891q c4891q = qg4Var.f26775c;
            int i16 = g92.f20474a;
            hi3Var.m22907c(i11, iArr2, iArr4, c4891q.f26589b, hi3Var.f21768a, c4891q.f26588a, c4891q.f26590c, c4891q.f26591d);
            long j14 = qg4Var.f26774b;
            int i17 = (int) (j13 - j14);
            qg4Var.f26774b = j14 + i17;
            qg4Var.f26773a -= i17;
        } else {
            ng4Var2 = ng4Var;
        }
        if (il3Var.m22007e()) {
            x02Var.m27772c(4);
            ng4 m25184l2 = m25184l(ng4Var2, qg4Var.f26774b, x02Var.m27777h(), 4);
            int m27791v = x02Var.m27791v();
            qg4Var.f26774b += 4;
            qg4Var.f26773a -= 4;
            il3Var.m23294i(m27791v);
            ng4 m25183k = m25183k(m25184l2, qg4Var.f26774b, il3Var.f22217c, m27791v);
            qg4Var.f26774b += m27791v;
            int i18 = qg4Var.f26773a - m27791v;
            qg4Var.f26773a = i18;
            ByteBuffer byteBuffer = il3Var.f22220f;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                il3Var.f22220f.clear();
            } else {
                il3Var.f22220f = ByteBuffer.allocate(i18);
            }
            return m25183k(m25183k, qg4Var.f26774b, il3Var.f22220f, qg4Var.f26773a);
        }
        il3Var.m23294i(qg4Var.f26773a);
        return m25183k(ng4Var2, qg4Var.f26774b, il3Var.f22217c, qg4Var.f26773a);
    }

    /* renamed from: n */
    private final void m25186n(int i11) {
        long j11 = this.f25633e + i11;
        this.f25633e = j11;
        ng4 ng4Var = this.f25632d;
        if (j11 == ng4Var.f25179b) {
            this.f25632d = ng4Var.f25181d;
        }
    }

    /* renamed from: a */
    public final int m25187a(td4 td4Var, int i11, boolean z11) {
        int m25181i = m25181i(i11);
        ng4 ng4Var = this.f25632d;
        int mo19942a = td4Var.mo19942a(ng4Var.f25180c.f18453a, ng4Var.m24922a(this.f25633e), m25181i);
        if (mo19942a == -1) {
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }
        m25186n(mo19942a);
        return mo19942a;
    }

    /* renamed from: b */
    public final long m25188b() {
        return this.f25633e;
    }

    /* renamed from: c */
    public final void m25189c(long j11) {
        ng4 ng4Var;
        if (j11 != -1) {
            while (true) {
                ng4Var = this.f25630b;
                if (j11 < ng4Var.f25179b) {
                    break;
                }
                this.f25634f.m23625c(ng4Var.f25180c);
                this.f25630b = this.f25630b.m24923b();
            }
            if (this.f25631c.f25178a < ng4Var.f25178a) {
                this.f25631c = ng4Var;
            }
        }
    }

    /* renamed from: d */
    public final void m25190d(il3 il3Var, qg4 qg4Var) {
        m25185m(this.f25631c, il3Var, qg4Var, this.f25629a);
    }

    /* renamed from: e */
    public final void m25191e(il3 il3Var, qg4 qg4Var) {
        this.f25631c = m25185m(this.f25631c, il3Var, qg4Var, this.f25629a);
    }

    /* renamed from: f */
    public final void m25192f() {
        ng4 ng4Var = this.f25630b;
        if (ng4Var.f25180c != null) {
            this.f25634f.m23626d(ng4Var);
            ng4Var.m24923b();
        }
        this.f25630b.m24924c(0L, 65536);
        ng4 ng4Var2 = this.f25630b;
        this.f25631c = ng4Var2;
        this.f25632d = ng4Var2;
        this.f25633e = 0L;
        this.f25634f.m23629g();
    }

    /* renamed from: g */
    public final void m25193g() {
        this.f25631c = this.f25630b;
    }

    /* renamed from: h */
    public final void m25194h(x02 x02Var, int i11) {
        while (i11 > 0) {
            int m25181i = m25181i(i11);
            ng4 ng4Var = this.f25632d;
            x02Var.m27771b(ng4Var.f25180c.f18453a, ng4Var.m24922a(this.f25633e), m25181i);
            i11 -= m25181i;
            m25186n(m25181i);
        }
    }
}
