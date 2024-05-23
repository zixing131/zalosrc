package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5432j implements InterfaceC5551q, InterfaceC5483m {

    /* renamed from: p */
    protected final String f32427p;

    /* renamed from: q */
    protected final Map f32428q = new HashMap();

    public AbstractC5432j(String str) {
        this.f32427p = str;
    }

    /* renamed from: a */
    public abstract InterfaceC5551q mo28891a(C5590s4 c5590s4, List list);

    /* renamed from: b */
    public final String m29267b() {
        return this.f32427p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        if ("toString".equals(str)) {
            return new C5619u(this.f32427p);
        }
        return AbstractC5449k.m29328a(this, new C5619u(str), c5590s4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: e */
    public final boolean mo29099e(String str) {
        return this.f32428q.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5432j)) {
            return false;
        }
        AbstractC5432j abstractC5432j = (AbstractC5432j) obj;
        String str = this.f32427p;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC5432j.f32427p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: g */
    public final void mo29100g(String str, InterfaceC5551q interfaceC5551q) {
        if (interfaceC5551q == null) {
            this.f32428q.remove(str);
        } else {
            this.f32428q.put(str, interfaceC5551q);
        }
    }

    public final int hashCode() {
        String str = this.f32427p;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: j */
    public final InterfaceC5551q mo29101j(String str) {
        if (this.f32428q.containsKey(str)) {
            return (InterfaceC5551q) this.f32428q.get(str);
        }
        return InterfaceC5551q.f32730d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public InterfaceC5551q zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        return this.f32427p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return AbstractC5449k.m29329b(this.f32428q);
    }
}
