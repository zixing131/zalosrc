package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.z2 */
/* loaded from: classes2.dex */
final class C5877z2 extends AbstractC5865x2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: a */
    public final /* synthetic */ int mo30553a(Object obj) {
        return ((C5871y2) obj).m30572a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: b */
    public final /* synthetic */ int mo30554b(Object obj) {
        return ((C5871y2) obj).m30573b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30555c(Object obj) {
        AbstractC5774i1 abstractC5774i1 = (AbstractC5774i1) obj;
        C5871y2 c5871y2 = abstractC5774i1.zzc;
        if (c5871y2 == C5871y2.m30568c()) {
            C5871y2 m30570f = C5871y2.m30570f();
            abstractC5774i1.zzc = m30570f;
            return m30570f;
        }
        return c5871y2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: d */
    public final /* synthetic */ Object mo30556d(Object obj) {
        return ((AbstractC5774i1) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo30557e(Object obj, Object obj2) {
        if (!C5871y2.m30568c().equals(obj2)) {
            if (C5871y2.m30568c().equals(obj)) {
                return C5871y2.m30569e((C5871y2) obj, (C5871y2) obj2);
            }
            ((C5871y2) obj).m30574d((C5871y2) obj2);
            return obj;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo30558f(Object obj, int i11, long j11) {
        ((C5871y2) obj).m30578j(i11 << 3, Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: g */
    public final void mo30559g(Object obj) {
        ((AbstractC5774i1) obj).zzc.m30576h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: h */
    public final /* synthetic */ void mo30560h(Object obj, Object obj2) {
        ((AbstractC5774i1) obj).zzc = (C5871y2) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5865x2
    /* renamed from: i */
    public final /* synthetic */ void mo30561i(Object obj, InterfaceC5806n3 interfaceC5806n3) {
        ((C5871y2) obj).m30579k(interfaceC5806n3);
    }
}
