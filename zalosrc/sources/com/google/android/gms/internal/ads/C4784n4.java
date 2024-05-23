package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n4 */
/* loaded from: classes2.dex */
final class C4784n4 implements InterfaceC5007t4 {

    /* renamed from: a */
    private final wm4 f25012a;

    /* renamed from: b */
    private final vm4 f25013b;

    /* renamed from: c */
    private long f25014c = -1;

    /* renamed from: d */
    private long f25015d = -1;

    public C4784n4(wm4 wm4Var, vm4 vm4Var) {
        this.f25012a = wm4Var;
        this.f25013b = vm4Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    /* renamed from: a */
    public final long mo24457a(km4 km4Var) {
        long j11 = this.f25015d;
        if (j11 < 0) {
            return -1L;
        }
        this.f25015d = -1L;
        return -(j11 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    /* renamed from: b */
    public final void mo24458b(long j11) {
        long[] jArr = this.f25013b.f29407a;
        this.f25015d = jArr[g92.m22320N(jArr, j11, true, true)];
    }

    /* renamed from: c */
    public final void m24840c(long j11) {
        this.f25014c = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5007t4
    public final InterfaceC4779n zze() {
        boolean z11;
        if (this.f25014c != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        return new um4(this.f25012a, this.f25014c);
    }
}
