package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.f1 */
/* loaded from: classes2.dex */
final class C5756f1 implements InterfaceC5763g2 {

    /* renamed from: a */
    private static final C5756f1 f33315a = new C5756f1();

    private C5756f1() {
    }

    /* renamed from: c */
    public static C5756f1 m30219c() {
        return f33315a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5763g2
    /* renamed from: a */
    public final InterfaceC5751e2 mo30220a(Class cls) {
        if (AbstractC5774i1.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC5751e2) AbstractC5774i1.m30275f(cls.asSubclass(AbstractC5774i1.class)).mo30165q(3, null, null);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5763g2
    /* renamed from: b */
    public final boolean mo30221b(Class cls) {
        return AbstractC5774i1.class.isAssignableFrom(cls);
    }
}
