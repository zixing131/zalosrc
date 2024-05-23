package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
/* loaded from: classes.dex */
final class C5544p9 implements InterfaceC5613ta {

    /* renamed from: a */
    private static final C5544p9 f32720a = new C5544p9();

    private C5544p9() {
    }

    /* renamed from: c */
    public static C5544p9 m29528c() {
        return f32720a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5613ta
    /* renamed from: a */
    public final InterfaceC5596sa mo29422a(Class cls) {
        if (AbstractC5612t9.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC5596sa) AbstractC5612t9.m29636j(cls.asSubclass(AbstractC5612t9.class)).mo28921z(3, null, null);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5613ta
    /* renamed from: b */
    public final boolean mo29423b(Class cls) {
        return AbstractC5612t9.class.isAssignableFrom(cls);
    }
}
