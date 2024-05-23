package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes2.dex */
public final class C5568r implements InterfaceC5551q {

    /* renamed from: p */
    private final String f32755p;

    /* renamed from: q */
    private final ArrayList f32756q;

    public C5568r(String str, List list) {
        this.f32755p = str;
        ArrayList arrayList = new ArrayList();
        this.f32756q = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m29568a() {
        return this.f32755p;
    }

    /* renamed from: b */
    public final ArrayList m29569b() {
        return this.f32756q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5568r)) {
            return false;
        }
        C5568r c5568r = (C5568r) obj;
        String str = this.f32755p;
        if (str == null ? c5568r.f32755p != null : !str.equals(c5568r.f32755p)) {
            return false;
        }
        return this.f32756q.equals(c5568r.f32756q);
    }

    public final int hashCode() {
        int i11;
        String str = this.f32755p;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return (i11 * 31) + this.f32756q.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return null;
    }
}
