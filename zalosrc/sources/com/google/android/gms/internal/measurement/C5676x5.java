package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
/* loaded from: classes.dex */
final class C5676x5 extends AbstractC5626u6 {

    /* renamed from: a */
    private final Context f32896a;

    /* renamed from: b */
    private final InterfaceC5423i7 f32897b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5676x5(Context context, InterfaceC5423i7 interfaceC5423i7) {
        this.f32896a = context;
        this.f32897b = interfaceC5423i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5626u6
    /* renamed from: a */
    public final Context mo29679a() {
        return this.f32896a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5626u6
    /* renamed from: b */
    public final InterfaceC5423i7 mo29680b() {
        return this.f32897b;
    }

    public final boolean equals(Object obj) {
        InterfaceC5423i7 interfaceC5423i7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5626u6) {
            AbstractC5626u6 abstractC5626u6 = (AbstractC5626u6) obj;
            if (this.f32896a.equals(abstractC5626u6.mo29679a()) && ((interfaceC5423i7 = this.f32897b) != null ? interfaceC5423i7.equals(abstractC5626u6.mo29680b()) : abstractC5626u6.mo29680b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f32896a.hashCode() ^ 1000003;
        InterfaceC5423i7 interfaceC5423i7 = this.f32897b;
        if (interfaceC5423i7 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC5423i7.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f32896a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f32897b) + "}";
    }
}
