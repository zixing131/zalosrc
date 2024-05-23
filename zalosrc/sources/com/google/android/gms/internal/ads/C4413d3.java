package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d3 */
/* loaded from: classes2.dex */
final class C4413d3 implements InterfaceC4376c3 {

    /* renamed from: a */
    private final long[] f19063a;

    /* renamed from: b */
    private final long[] f19064b;

    /* renamed from: c */
    private final long f19065c;

    /* renamed from: d */
    private final long f19066d;

    private C4413d3(long[] jArr, long[] jArr2, long j11, long j12) {
        this.f19063a = jArr;
        this.f19064b = jArr2;
        this.f19065c = j11;
        this.f19066d = j12;
    }

    /* renamed from: a */
    public static C4413d3 m21251a(long j11, long j12, C4409d c4409d, x02 x02Var) {
        int i11;
        int m27788s;
        x02Var.m27776g(10);
        int m27782m = x02Var.m27782m();
        if (m27782m <= 0) {
            return null;
        }
        int i12 = c4409d.f19044d;
        long j13 = m27782m;
        if (i12 >= 32000) {
            i11 = 1152;
        } else {
            i11 = 576;
        }
        long m22346g0 = g92.m22346g0(j13, i11 * 1000000, i12);
        int m27792w = x02Var.m27792w();
        int m27792w2 = x02Var.m27792w();
        int m27792w3 = x02Var.m27792w();
        x02Var.m27776g(2);
        long j14 = j12 + c4409d.f19043c;
        long[] jArr = new long[m27792w];
        long[] jArr2 = new long[m27792w];
        int i13 = 0;
        long j15 = j12;
        while (i13 < m27792w) {
            int i14 = m27792w2;
            long j16 = j14;
            jArr[i13] = (i13 * m22346g0) / m27792w;
            jArr2[i13] = Math.max(j15, j16);
            if (m27792w3 != 1) {
                if (m27792w3 != 2) {
                    if (m27792w3 != 3) {
                        if (m27792w3 != 4) {
                            return null;
                        }
                        m27788s = x02Var.m27791v();
                    } else {
                        m27788s = x02Var.m27790u();
                    }
                } else {
                    m27788s = x02Var.m27792w();
                }
            } else {
                m27788s = x02Var.m27788s();
            }
            j15 += m27788s * i14;
            i13++;
            jArr = jArr;
            m27792w2 = i14;
            j14 = j16;
        }
        long[] jArr3 = jArr;
        if (j11 != -1 && j11 != j15) {
            lr1.m24356e("VbriSeeker", "VBRI data size mismatch: " + j11 + ", " + j15);
        }
        return new C4413d3(jArr3, jArr2, m22346g0, j15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        int m22320N = g92.m22320N(this.f19063a, j11, true, true);
        C4816o c4816o = new C4816o(this.f19063a[m22320N], this.f19064b[m22320N]);
        if (c4816o.f25385a < j11) {
            long[] jArr = this.f19063a;
            if (m22320N != jArr.length - 1) {
                int i11 = m22320N + 1;
                return new C4704l(c4816o, new C4816o(jArr[i11], this.f19064b[i11]));
            }
        }
        return new C4704l(c4816o, c4816o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    /* renamed from: d */
    public final long mo20373d(long j11) {
        return this.f19063a[g92.m22320N(this.f19064b, j11, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4376c3
    public final long zzb() {
        return this.f19066d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f19065c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
