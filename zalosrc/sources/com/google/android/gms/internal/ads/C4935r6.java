package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r6 */
/* loaded from: classes2.dex */
final class C4935r6 implements tl4 {

    /* renamed from: a */
    private final a72 f27106a;

    /* renamed from: b */
    private final x02 f27107b = new x02();

    /* renamed from: c */
    private final int f27108c;

    public C4935r6(int i11, a72 a72Var, int i12) {
        this.f27108c = i11;
        this.f27106a = a72Var;
    }

    @Override // com.google.android.gms.internal.ads.tl4
    /* renamed from: a */
    public final sl4 mo22710a(km4 km4Var, long j11) {
        int m21275a;
        int m21275a2;
        long j12;
        long zzf = km4Var.zzf();
        int min = (int) Math.min(112800L, km4Var.zzd() - zzf);
        this.f27107b.m27772c(min);
        ((yl4) km4Var).mo23963f(this.f27107b.m27777h(), 0, min, false);
        x02 x02Var = this.f27107b;
        int m27781l = x02Var.m27781l();
        long j13 = -1;
        long j14 = -1;
        long j15 = -9223372036854775807L;
        while (x02Var.m27778i() >= 188 && (m21275a2 = (m21275a = AbstractC4417d7.m21275a(x02Var.m27777h(), x02Var.m27780k(), m27781l)) + 188) <= m27781l) {
            long m21276b = AbstractC4417d7.m21276b(x02Var, m21275a, this.f27108c);
            if (m21276b != -9223372036854775807L) {
                long m20014b = this.f27106a.m20014b(m21276b);
                if (m20014b > j11) {
                    if (j15 == -9223372036854775807L) {
                        return sl4.m26361d(m20014b, zzf);
                    }
                    j12 = zzf + j14;
                } else if (100000 + m20014b > j11) {
                    j12 = zzf + m21275a;
                } else {
                    j14 = m21275a;
                    j15 = m20014b;
                }
                return sl4.m26362e(j12);
            }
            x02Var.m27775f(m21275a2);
            j13 = m21275a2;
        }
        if (j15 != -9223372036854775807L) {
            return sl4.m26363f(j15, zzf + j13);
        }
        return sl4.f27781d;
    }

    @Override // com.google.android.gms.internal.ads.tl4
    public final void zzb() {
        x02 x02Var = this.f27107b;
        byte[] bArr = g92.f20479f;
        int length = bArr.length;
        x02Var.m27773d(bArr, 0);
    }
}
