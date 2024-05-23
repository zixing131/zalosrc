package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes2.dex */
public final class C5398h implements InterfaceC5551q {

    /* renamed from: p */
    private final InterfaceC5551q f32393p;

    /* renamed from: q */
    private final String f32394q;

    public C5398h(String str) {
        this.f32393p = InterfaceC5551q.f32730d;
        this.f32394q = str;
    }

    /* renamed from: a */
    public final InterfaceC5551q m29165a() {
        return this.f32393p;
    }

    /* renamed from: b */
    public final String m29166b() {
        return this.f32394q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5398h)) {
            return false;
        }
        C5398h c5398h = (C5398h) obj;
        if (this.f32394q.equals(c5398h.f32394q) && this.f32393p.equals(c5398h.f32393p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32394q.hashCode() * 31) + this.f32393p.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return new C5398h(this.f32394q, this.f32393p.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return null;
    }

    public C5398h(String str, InterfaceC5551q interfaceC5551q) {
        this.f32393p = interfaceC5551q;
        this.f32394q = str;
    }
}
