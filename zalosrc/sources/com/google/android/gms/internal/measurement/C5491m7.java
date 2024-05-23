package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* loaded from: classes.dex */
final class C5491m7 implements Serializable, InterfaceC5423i7 {

    /* renamed from: p */
    final Object f32528p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5491m7(Object obj) {
        this.f32528p = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5491m7) {
            return AbstractC5338d7.m29064a(this.f32528p, ((C5491m7) obj).f32528p);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32528p});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f32528p.toString() + ")";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5423i7
    public final Object zza() {
        return this.f32528p;
    }
}
