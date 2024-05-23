package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nb */
/* loaded from: classes.dex */
final class C5512nb extends AbstractC5478lb {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: a */
    public final /* synthetic */ int mo29424a(Object obj) {
        return ((C5495mb) obj).m29445a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: b */
    public final /* synthetic */ int mo29425b(Object obj) {
        return ((C5495mb) obj).m29446b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo29426c(Object obj) {
        AbstractC5612t9 abstractC5612t9 = (AbstractC5612t9) obj;
        C5495mb c5495mb = abstractC5612t9.zzc;
        if (c5495mb == C5495mb.m29441c()) {
            C5495mb m29443f = C5495mb.m29443f();
            abstractC5612t9.zzc = m29443f;
            return m29443f;
        }
        return c5495mb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: d */
    public final /* synthetic */ Object mo29427d(Object obj) {
        return ((AbstractC5612t9) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo29428e(Object obj, Object obj2) {
        if (!C5495mb.m29441c().equals(obj2)) {
            if (C5495mb.m29441c().equals(obj)) {
                return C5495mb.m29442e((C5495mb) obj, (C5495mb) obj2);
            }
            ((C5495mb) obj).m29447d((C5495mb) obj2);
            return obj;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo29429f(Object obj, int i11, long j11) {
        ((C5495mb) obj).m29451j(i11 << 3, Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: g */
    public final void mo29430g(Object obj) {
        ((AbstractC5612t9) obj).zzc.m29449h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: h */
    public final /* synthetic */ void mo29431h(Object obj, Object obj2) {
        ((AbstractC5612t9) obj).zzc = (C5495mb) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5478lb
    /* renamed from: i */
    public final /* synthetic */ void mo29432i(Object obj, InterfaceC5326cc interfaceC5326cc) {
        ((C5495mb) obj).m29452k(interfaceC5326cc);
    }
}
