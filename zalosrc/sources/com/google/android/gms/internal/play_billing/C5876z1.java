package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.z1 */
/* loaded from: classes2.dex */
final class C5876z1 implements InterfaceC5763g2 {

    /* renamed from: a */
    private final InterfaceC5763g2[] f33459a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5876z1(InterfaceC5763g2... interfaceC5763g2Arr) {
        this.f33459a = interfaceC5763g2Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5763g2
    /* renamed from: a */
    public final InterfaceC5751e2 mo30220a(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            InterfaceC5763g2 interfaceC5763g2 = this.f33459a[i11];
            if (interfaceC5763g2.mo30221b(cls)) {
                return interfaceC5763g2.mo30220a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5763g2
    /* renamed from: b */
    public final boolean mo30221b(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.f33459a[i11].mo30221b(cls)) {
                return true;
            }
        }
        return false;
    }
}
