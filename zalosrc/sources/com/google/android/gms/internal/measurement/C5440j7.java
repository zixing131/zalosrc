package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
/* loaded from: classes.dex */
final class C5440j7 implements Serializable, InterfaceC5423i7 {

    /* renamed from: p */
    final InterfaceC5423i7 f32437p;

    /* renamed from: q */
    volatile transient boolean f32438q;

    /* renamed from: r */
    transient Object f32439r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5440j7(InterfaceC5423i7 interfaceC5423i7) {
        interfaceC5423i7.getClass();
        this.f32437p = interfaceC5423i7;
    }

    public final String toString() {
        Object obj;
        if (this.f32438q) {
            obj = "<supplier that returned " + String.valueOf(this.f32439r) + ">";
        } else {
            obj = this.f32437p;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5423i7
    public final Object zza() {
        if (!this.f32438q) {
            synchronized (this) {
                try {
                    if (!this.f32438q) {
                        Object zza = this.f32437p.zza();
                        this.f32439r = zza;
                        this.f32438q = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f32439r;
    }
}
