package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l4 */
/* loaded from: classes2.dex */
final class C4709l4 implements InterfaceC4779n {

    /* renamed from: a */
    final /* synthetic */ C4746m4 f23721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4709l4(C4746m4 c4746m4, AbstractC4672k4 abstractC4672k4) {
        this.f23721a = c4746m4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        AbstractC5193y4 abstractC5193y4;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        C4746m4 c4746m4 = this.f23721a;
        abstractC5193y4 = c4746m4.f24368d;
        long m28120f = abstractC5193y4.m28120f(j11);
        j12 = c4746m4.f24366b;
        j13 = c4746m4.f24367c;
        j14 = c4746m4.f24366b;
        j15 = c4746m4.f24370f;
        long j18 = (m28120f * (j13 - j14)) / j15;
        j16 = c4746m4.f24366b;
        j17 = c4746m4.f24367c;
        C4816o c4816o = new C4816o(j11, g92.m22336b0((-30000) + j12 + j18, j16, j17 - 1));
        return new C4704l(c4816o, c4816o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        AbstractC5193y4 abstractC5193y4;
        long j11;
        C4746m4 c4746m4 = this.f23721a;
        abstractC5193y4 = c4746m4.f24368d;
        j11 = c4746m4.f24370f;
        return abstractC5193y4.m28119e(j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
