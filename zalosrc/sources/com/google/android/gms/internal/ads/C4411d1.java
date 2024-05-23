package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d1 */
/* loaded from: classes2.dex */
final class C4411d1 implements InterfaceC4779n {

    /* renamed from: a */
    final /* synthetic */ InterfaceC4779n f19051a;

    /* renamed from: b */
    final /* synthetic */ C4448e1 f19052b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4411d1(C4448e1 c4448e1, InterfaceC4779n interfaceC4779n) {
        this.f19052b = c4448e1;
        this.f19051a = interfaceC4779n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        long j12;
        long j13;
        C4704l mo20362b = this.f19051a.mo20362b(j11);
        C4816o c4816o = mo20362b.f23656a;
        long j14 = c4816o.f25385a;
        long j15 = c4816o.f25386b;
        j12 = this.f19052b.f19486p;
        C4816o c4816o2 = new C4816o(j14, j15 + j12);
        C4816o c4816o3 = mo20362b.f23657b;
        long j16 = c4816o3.f25385a;
        long j17 = c4816o3.f25386b;
        j13 = this.f19052b.f19486p;
        return new C4704l(c4816o2, new C4816o(j16, j17 + j13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f19051a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return this.f19051a.zzh();
    }
}
