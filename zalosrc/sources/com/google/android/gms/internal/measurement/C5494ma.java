package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ma */
/* loaded from: classes.dex */
final class C5494ma implements InterfaceC5613ta {

    /* renamed from: a */
    private final InterfaceC5613ta[] f32529a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5494ma(InterfaceC5613ta... interfaceC5613taArr) {
        this.f32529a = interfaceC5613taArr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5613ta
    /* renamed from: a */
    public final InterfaceC5596sa mo29422a(Class cls) {
        InterfaceC5613ta[] interfaceC5613taArr = this.f32529a;
        for (int i11 = 0; i11 < 2; i11++) {
            InterfaceC5613ta interfaceC5613ta = interfaceC5613taArr[i11];
            if (interfaceC5613ta.mo29423b(cls)) {
                return interfaceC5613ta.mo29422a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5613ta
    /* renamed from: b */
    public final boolean mo29423b(Class cls) {
        InterfaceC5613ta[] interfaceC5613taArr = this.f32529a;
        for (int i11 = 0; i11 < 2; i11++) {
            if (interfaceC5613taArr[i11].mo29423b(cls)) {
                return true;
            }
        }
        return false;
    }
}
