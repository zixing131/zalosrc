package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ha */
/* loaded from: classes.dex */
final class C5409ha extends AbstractC5443ja {
    public /* synthetic */ C5409ha(AbstractC5392ga abstractC5392ga) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5443ja
    /* renamed from: a */
    public final void mo29140a(Object obj, long j11) {
        ((InterfaceC5714z9) AbstractC5648vb.m29791k(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5443ja
    /* renamed from: b */
    public final void mo29141b(Object obj, Object obj2, long j11) {
        InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) AbstractC5648vb.m29791k(obj, j11);
        InterfaceC5714z9 interfaceC5714z92 = (InterfaceC5714z9) AbstractC5648vb.m29791k(obj2, j11);
        int size = interfaceC5714z9.size();
        int size2 = interfaceC5714z92.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC5714z9.zzc()) {
                interfaceC5714z9 = interfaceC5714z9.mo28992c(size2 + size);
            }
            interfaceC5714z9.addAll(interfaceC5714z92);
        }
        if (size > 0) {
            interfaceC5714z92 = interfaceC5714z9;
        }
        AbstractC5648vb.m29804x(obj, j11, interfaceC5714z92);
    }
}
