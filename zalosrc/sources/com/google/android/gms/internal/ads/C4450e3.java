package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e3 */
/* loaded from: classes2.dex */
final class C4450e3 implements InterfaceC4376c3 {

    /* renamed from: a */
    private final long f19495a;

    /* renamed from: b */
    private final int f19496b;

    /* renamed from: c */
    private final long f19497c;

    /* renamed from: d */
    private final long f19498d;

    /* renamed from: e */
    private final long f19499e;

    /* renamed from: f */
    private final long[] f19500f;

    private C4450e3(long j11, int i11, long j12, long j13, long[] jArr) {
        this.f19495a = j11;
        this.f19496b = i11;
        this.f19497c = j12;
        this.f19500f = jArr;
        this.f19498d = j13;
        this.f19499e = j13 != -1 ? j11 + j13 : -1L;
    }

    /* renamed from: a */
    public static C4450e3 m21608a(long j11, long j12, C4409d c4409d, x02 x02Var) {
        int m27791v;
        int i11 = c4409d.f19047g;
        int i12 = c4409d.f19044d;
        int m27782m = x02Var.m27782m();
        if ((m27782m & 1) == 1 && (m27791v = x02Var.m27791v()) != 0) {
            long m22346g0 = g92.m22346g0(m27791v, i11 * 1000000, i12);
            if ((m27782m & 6) != 6) {
                return new C4450e3(j12, c4409d.f19043c, m22346g0, -1L, null);
            }
            long m27762A = x02Var.m27762A();
            long[] jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = x02Var.m27788s();
            }
            if (j11 != -1) {
                long j13 = j12 + m27762A;
                if (j11 != j13) {
                    lr1.m24356e("XingSeeker", "XING data size mismatch: " + j11 + ", " + j13);
                }
            }
            return new C4450e3(j12, c4409d.f19043c, m22346g0, m27762A, jArr);
        }
        return null;
    }

    /* renamed from: c */
    private final long m21609c(int i11) {
        return (this.f19497c * i11) / 100;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        double d11;
        if (!zzh()) {
            C4816o c4816o = new C4816o(0L, this.f19495a + this.f19496b);
            return new C4704l(c4816o, c4816o);
        }
        long m22336b0 = g92.m22336b0(j11, 0L, this.f19497c);
        double d12 = (m22336b0 * 100.0d) / this.f19497c;
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 100.0d) {
                d13 = 256.0d;
            } else {
                int i11 = (int) d12;
                long[] jArr = (long[]) v71.m27171b(this.f19500f);
                double d14 = jArr[i11];
                if (i11 == 99) {
                    d11 = 256.0d;
                } else {
                    d11 = jArr[i11 + 1];
                }
                d13 = d14 + ((d12 - i11) * (d11 - d14));
            }
        }
        C4816o c4816o2 = new C4816o(m22336b0, this.f19495a + g92.m22336b0(Math.round((d13 / 256.0d) * this.f19498d), this.f19496b, this.f19498d - 1));
        return new C4704l(c4816o2, c4816o2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    /* renamed from: d */
    public final long mo20373d(long j11) {
        long j12;
        double d11;
        long j13 = j11 - this.f19495a;
        if (zzh() && j13 > this.f19496b) {
            long[] jArr = (long[]) v71.m27171b(this.f19500f);
            double d12 = (j13 * 256.0d) / this.f19498d;
            int m22320N = g92.m22320N(jArr, (long) d12, true, true);
            long m21609c = m21609c(m22320N);
            long j14 = jArr[m22320N];
            int i11 = m22320N + 1;
            long m21609c2 = m21609c(i11);
            if (m22320N == 99) {
                j12 = 256;
            } else {
                j12 = jArr[i11];
            }
            if (j14 == j12) {
                d11 = 0.0d;
            } else {
                d11 = (d12 - j14) / (j12 - j14);
            }
            return m21609c + Math.round(d11 * (m21609c2 - m21609c));
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    public final long zzb() {
        return this.f19499e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f19497c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return this.f19500f != null;
    }
}
