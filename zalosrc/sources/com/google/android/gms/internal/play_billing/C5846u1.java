package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.u1 */
/* loaded from: classes2.dex */
final class C5846u1 extends AbstractC5858w1 {
    public /* synthetic */ C5846u1(AbstractC5840t1 abstractC5840t1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5858w1
    /* renamed from: a */
    public final void mo30465a(Object obj, long j11) {
        ((InterfaceC5798m1) AbstractC5770h3.m30258k(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5858w1
    /* renamed from: b */
    public final void mo30466b(Object obj, Object obj2, long j11) {
        InterfaceC5798m1 interfaceC5798m1 = (InterfaceC5798m1) AbstractC5770h3.m30258k(obj, j11);
        InterfaceC5798m1 interfaceC5798m12 = (InterfaceC5798m1) AbstractC5770h3.m30258k(obj2, j11);
        int size = interfaceC5798m1.size();
        int size2 = interfaceC5798m12.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC5798m1.zzc()) {
                interfaceC5798m1 = interfaceC5798m1.mo30360c(size2 + size);
            }
            interfaceC5798m1.addAll(interfaceC5798m12);
        }
        if (size > 0) {
            interfaceC5798m12 = interfaceC5798m1;
        }
        AbstractC5770h3.m30271x(obj, j11, interfaceC5798m12);
    }
}
