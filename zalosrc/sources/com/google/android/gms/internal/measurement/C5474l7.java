package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* loaded from: classes.dex */
final class C5474l7 implements InterfaceC5423i7 {

    /* renamed from: r */
    private static final InterfaceC5423i7 f32476r = new InterfaceC5423i7() { // from class: com.google.android.gms.internal.measurement.k7
        @Override // com.google.android.gms.internal.measurement.InterfaceC5423i7
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: p */
    private volatile InterfaceC5423i7 f32477p;

    /* renamed from: q */
    private Object f32478q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5474l7(InterfaceC5423i7 interfaceC5423i7) {
        interfaceC5423i7.getClass();
        this.f32477p = interfaceC5423i7;
    }

    public final String toString() {
        Object obj = this.f32477p;
        if (obj == f32476r) {
            obj = "<supplier that returned " + String.valueOf(this.f32478q) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5423i7
    public final Object zza() {
        InterfaceC5423i7 interfaceC5423i7 = this.f32477p;
        InterfaceC5423i7 interfaceC5423i72 = f32476r;
        if (interfaceC5423i7 != interfaceC5423i72) {
            synchronized (this) {
                try {
                    if (this.f32477p != interfaceC5423i72) {
                        Object zza = this.f32477p.zza();
                        this.f32478q = zza;
                        this.f32477p = interfaceC5423i72;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f32478q;
    }
}
