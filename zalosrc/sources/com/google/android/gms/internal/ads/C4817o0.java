package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.o0 */
/* loaded from: classes2.dex */
public final class C4817o0 implements tl4 {

    /* renamed from: a */
    private final wm4 f25387a;

    /* renamed from: b */
    private final int f25388b;

    /* renamed from: c */
    private final rm4 f25389c = new rm4();

    public /* synthetic */ C4817o0(wm4 wm4Var, int i11, AbstractC4780n0 abstractC4780n0) {
        this.f25387a = wm4Var;
        this.f25388b = i11;
    }

    /* renamed from: b */
    private final long m25052b(km4 km4Var) {
        while (km4Var.zze() < km4Var.zzd() - 6) {
            wm4 wm4Var = this.f25387a;
            int i11 = this.f25388b;
            rm4 rm4Var = this.f25389c;
            long zze = km4Var.zze();
            byte[] bArr = new byte[2];
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
                km4Var.zzj();
                yl4Var.m28247k((int) (zze - km4Var.zzf()), false);
            } else {
                x02 x02Var = new x02(16);
                System.arraycopy(bArr, 0, x02Var.m27777h(), 0, 2);
                x02Var.m27774e(nm4.m24963a(km4Var, x02Var.m27777h(), 2, 14));
                km4Var.zzj();
                yl4Var.m28247k((int) (zze - km4Var.zzf()), false);
                if (sm4.m26367c(x02Var, wm4Var, i11, rm4Var)) {
                    break;
                }
            }
            yl4Var.m28247k(1, false);
        }
        if (km4Var.zze() >= km4Var.zzd() - 6) {
            ((yl4) km4Var).m28247k((int) (km4Var.zzd() - km4Var.zze()), false);
            return this.f25387a.f30024j;
        }
        return this.f25389c.f27301a;
    }

    @Override // com.google.android.gms.internal.ads.tl4
    /* renamed from: a */
    public final sl4 mo22710a(km4 km4Var, long j11) {
        long zzf = km4Var.zzf();
        long m25052b = m25052b(km4Var);
        long zze = km4Var.zze();
        ((yl4) km4Var).m28247k(Math.max(6, this.f25387a.f30017c), false);
        long m25052b2 = m25052b(km4Var);
        long zze2 = km4Var.zze();
        if (m25052b <= j11 && m25052b2 > j11) {
            return sl4.m26362e(zze);
        }
        if (m25052b2 <= j11) {
            return sl4.m26363f(m25052b2, zze2);
        }
        return sl4.m26361d(m25052b, zzf);
    }

    @Override // com.google.android.gms.internal.ads.tl4
    public final /* synthetic */ void zzb() {
    }
}
