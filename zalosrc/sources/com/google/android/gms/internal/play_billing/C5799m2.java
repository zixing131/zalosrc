package com.google.android.gms.internal.play_billing;

import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.play_billing.m2 */
/* loaded from: classes2.dex */
final class C5799m2 implements InterfaceC5835s2 {

    /* renamed from: a */
    private final InterfaceC5775i2 f33362a;

    /* renamed from: b */
    private final AbstractC5865x2 f33363b;

    /* renamed from: c */
    private final boolean f33364c;

    /* renamed from: d */
    private final AbstractC5875z0 f33365d;

    private C5799m2(AbstractC5865x2 abstractC5865x2, AbstractC5875z0 abstractC5875z0, InterfaceC5775i2 interfaceC5775i2) {
        this.f33363b = abstractC5865x2;
        this.f33364c = abstractC5875z0.mo30156c(interfaceC5775i2);
        this.f33365d = abstractC5875z0;
        this.f33362a = interfaceC5775i2;
    }

    /* renamed from: g */
    public static C5799m2 m30361g(AbstractC5865x2 abstractC5865x2, AbstractC5875z0 abstractC5875z0, InterfaceC5775i2 interfaceC5775i2) {
        return new C5799m2(abstractC5865x2, abstractC5875z0, interfaceC5775i2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: a */
    public final void mo30352a(Object obj) {
        this.f33363b.mo30559g(obj);
        this.f33365d.mo30155b(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: b */
    public final void mo30353b(Object obj, Object obj2) {
        AbstractC5847u2.m30519v(this.f33363b, obj, obj2);
        if (!this.f33364c) {
            return;
        }
        this.f33365d.mo30154a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: c */
    public final boolean mo30354c(Object obj, Object obj2) {
        AbstractC5865x2 abstractC5865x2 = this.f33363b;
        if (!abstractC5865x2.mo30556d(obj).equals(abstractC5865x2.mo30556d(obj2))) {
            return false;
        }
        if (!this.f33364c) {
            return true;
        }
        this.f33365d.mo30154a(obj);
        this.f33365d.mo30154a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: d */
    public final boolean mo30355d(Object obj) {
        this.f33365d.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: e */
    public final void mo30356e(Object obj, InterfaceC5806n3 interfaceC5806n3) {
        this.f33365d.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    /* renamed from: f */
    public final void mo30357f(Object obj, byte[] bArr, int i11, int i12, C5729b0 c5729b0) {
        AbstractC5774i1 abstractC5774i1 = (AbstractC5774i1) obj;
        if (abstractC5774i1.zzc == C5871y2.m30568c()) {
            abstractC5774i1.zzc = C5871y2.m30570f();
        }
        AbstractC30228a.m149044a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final int zza(Object obj) {
        AbstractC5865x2 abstractC5865x2 = this.f33363b;
        int mo30554b = abstractC5865x2.mo30554b(abstractC5865x2.mo30556d(obj));
        if (!this.f33364c) {
            return mo30554b;
        }
        this.f33365d.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final int zzb(Object obj) {
        int hashCode = this.f33363b.mo30556d(obj).hashCode();
        if (!this.f33364c) {
            return hashCode;
        }
        this.f33365d.mo30154a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5835s2
    public final Object zze() {
        InterfaceC5775i2 interfaceC5775i2 = this.f33362a;
        if (interfaceC5775i2 instanceof AbstractC5774i1) {
            return ((AbstractC5774i1) interfaceC5775i2).m30286g();
        }
        return interfaceC5775i2.zzk().zze();
    }
}
