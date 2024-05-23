package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o */
/* loaded from: classes2.dex */
public final class C5517o implements InterfaceC5551q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C5517o;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return InterfaceC5551q.f32731e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return null;
    }
}
