package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes2.dex */
public class C5500n implements InterfaceC5551q, InterfaceC5483m {

    /* renamed from: p */
    final Map f32554p = new HashMap();

    /* renamed from: a */
    public final List m29457a() {
        return new ArrayList(this.f32554p.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        if ("toString".equals(str)) {
            return new C5619u(toString());
        }
        return AbstractC5449k.m29328a(this, new C5619u(str), c5590s4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: e */
    public final boolean mo29099e(String str) {
        return this.f32554p.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5500n)) {
            return false;
        }
        return this.f32554p.equals(((C5500n) obj).f32554p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: g */
    public final void mo29100g(String str, InterfaceC5551q interfaceC5551q) {
        if (interfaceC5551q == null) {
            this.f32554p.remove(str);
        } else {
            this.f32554p.put(str, interfaceC5551q);
        }
    }

    public final int hashCode() {
        return this.f32554p.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: j */
    public final InterfaceC5551q mo29101j(String str) {
        if (this.f32554p.containsKey(str)) {
            return (InterfaceC5551q) this.f32554p.get(str);
        }
        return InterfaceC5551q.f32730d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f32554p.isEmpty()) {
            for (String str : this.f32554p.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f32554p.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        C5500n c5500n = new C5500n();
        for (Map.Entry entry : this.f32554p.entrySet()) {
            if (entry.getValue() instanceof InterfaceC5483m) {
                c5500n.f32554p.put((String) entry.getKey(), (InterfaceC5551q) entry.getValue());
            } else {
                c5500n.f32554p.put((String) entry.getKey(), ((InterfaceC5551q) entry.getValue()).zzd());
            }
        }
        return c5500n;
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
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return AbstractC5449k.m29329b(this.f32554p);
    }
}
