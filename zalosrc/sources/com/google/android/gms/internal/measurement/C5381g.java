package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes2.dex */
public final class C5381g implements InterfaceC5551q {

    /* renamed from: p */
    private final boolean f32382p;

    public C5381g(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f32382p = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        if ("toString".equals(str)) {
            return new C5619u(Boolean.toString(this.f32382p));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f32382p), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5381g) && this.f32382p == ((C5381g) obj).f32382p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f32382p).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f32382p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return new C5381g(Boolean.valueOf(this.f32382p));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        return Boolean.valueOf(this.f32382p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        double d11;
        if (true != this.f32382p) {
            d11 = 0.0d;
        } else {
            d11 = 1.0d;
        }
        return Double.valueOf(d11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        return Boolean.toString(this.f32382p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return null;
    }
}
