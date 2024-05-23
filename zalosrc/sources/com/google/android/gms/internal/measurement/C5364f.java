package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes2.dex */
public final class C5364f implements Iterable, InterfaceC5551q, InterfaceC5483m {

    /* renamed from: p */
    final SortedMap f32362p;

    /* renamed from: q */
    final Map f32363q;

    public C5364f() {
        this.f32362p = new TreeMap();
        this.f32363q = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return AbstractC5449k.m29328a(this, new C5619u(str), c5590s4, list);
        }
        return AbstractC5331d0.m29033a(str, this, c5590s4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: e */
    public final boolean mo29099e(String str) {
        if (!"length".equals(str) && !this.f32363q.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5364f)) {
            return false;
        }
        C5364f c5364f = (C5364f) obj;
        if (m29103l() != c5364f.m29103l()) {
            return false;
        }
        if (this.f32362p.isEmpty()) {
            return c5364f.f32362p.isEmpty();
        }
        for (int intValue = ((Integer) this.f32362p.firstKey()).intValue(); intValue <= ((Integer) this.f32362p.lastKey()).intValue(); intValue++) {
            if (!m29104m(intValue).equals(c5364f.m29104m(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: g */
    public final void mo29100g(String str, InterfaceC5551q interfaceC5551q) {
        if (interfaceC5551q == null) {
            this.f32363q.remove(str);
        } else {
            this.f32363q.put(str, interfaceC5551q);
        }
    }

    public final int hashCode() {
        return this.f32362p.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5347e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5483m
    /* renamed from: j */
    public final InterfaceC5551q mo29101j(String str) {
        InterfaceC5551q interfaceC5551q;
        if ("length".equals(str)) {
            return new C5415i(Double.valueOf(m29103l()));
        }
        if (mo29099e(str) && (interfaceC5551q = (InterfaceC5551q) this.f32363q.get(str)) != null) {
            return interfaceC5551q;
        }
        return InterfaceC5551q.f32730d;
    }

    /* renamed from: k */
    public final int m29102k() {
        return this.f32362p.size();
    }

    /* renamed from: l */
    public final int m29103l() {
        if (this.f32362p.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f32362p.lastKey()).intValue() + 1;
    }

    /* renamed from: m */
    public final InterfaceC5551q m29104m(int i11) {
        InterfaceC5551q interfaceC5551q;
        if (i11 < m29103l()) {
            if (m29112w(i11) && (interfaceC5551q = (InterfaceC5551q) this.f32362p.get(Integer.valueOf(i11))) != null) {
                return interfaceC5551q;
            }
            return InterfaceC5551q.f32730d;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: n */
    public final String m29105n(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f32362p.isEmpty()) {
            int i11 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i11 >= m29103l()) {
                    break;
                }
                InterfaceC5551q m29104m = m29104m(i11);
                sb2.append(str2);
                if (!(m29104m instanceof C5636v) && !(m29104m instanceof C5517o)) {
                    sb2.append(m29104m.zzi());
                }
                i11++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    /* renamed from: p */
    public final Iterator m29106p() {
        return this.f32362p.keySet().iterator();
    }

    /* renamed from: r */
    public final List m29107r() {
        ArrayList arrayList = new ArrayList(m29103l());
        for (int i11 = 0; i11 < m29103l(); i11++) {
            arrayList.add(m29104m(i11));
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void m29108s() {
        this.f32362p.clear();
    }

    /* renamed from: t */
    public final void m29109t(int i11, InterfaceC5551q interfaceC5551q) {
        if (i11 >= 0) {
            if (i11 >= m29103l()) {
                m29111v(i11, interfaceC5551q);
                return;
            }
            for (int intValue = ((Integer) this.f32362p.lastKey()).intValue(); intValue >= i11; intValue--) {
                SortedMap sortedMap = this.f32362p;
                Integer valueOf = Integer.valueOf(intValue);
                InterfaceC5551q interfaceC5551q2 = (InterfaceC5551q) sortedMap.get(valueOf);
                if (interfaceC5551q2 != null) {
                    m29111v(intValue + 1, interfaceC5551q2);
                    this.f32362p.remove(valueOf);
                }
            }
            m29111v(i11, interfaceC5551q);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i11);
    }

    public final String toString() {
        return m29105n(",");
    }

    /* renamed from: u */
    public final void m29110u(int i11) {
        int intValue = ((Integer) this.f32362p.lastKey()).intValue();
        if (i11 <= intValue && i11 >= 0) {
            this.f32362p.remove(Integer.valueOf(i11));
            if (i11 == intValue) {
                SortedMap sortedMap = this.f32362p;
                int i12 = i11 - 1;
                Integer valueOf = Integer.valueOf(i12);
                if (!sortedMap.containsKey(valueOf) && i12 >= 0) {
                    this.f32362p.put(valueOf, InterfaceC5551q.f32730d);
                    return;
                }
                return;
            }
            while (true) {
                i11++;
                if (i11 <= ((Integer) this.f32362p.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f32362p;
                    Integer valueOf2 = Integer.valueOf(i11);
                    InterfaceC5551q interfaceC5551q = (InterfaceC5551q) sortedMap2.get(valueOf2);
                    if (interfaceC5551q != null) {
                        this.f32362p.put(Integer.valueOf(i11 - 1), interfaceC5551q);
                        this.f32362p.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public final void m29111v(int i11, InterfaceC5551q interfaceC5551q) {
        if (i11 <= 32468) {
            if (i11 >= 0) {
                if (interfaceC5551q == null) {
                    this.f32362p.remove(Integer.valueOf(i11));
                    return;
                } else {
                    this.f32362p.put(Integer.valueOf(i11), interfaceC5551q);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i11);
        }
        throw new IllegalStateException("Array too large");
    }

    /* renamed from: w */
    public final boolean m29112w(int i11) {
        if (i11 >= 0 && i11 <= ((Integer) this.f32362p.lastKey()).intValue()) {
            return this.f32362p.containsKey(Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        C5364f c5364f = new C5364f();
        for (Map.Entry entry : this.f32362p.entrySet()) {
            if (entry.getValue() instanceof InterfaceC5483m) {
                c5364f.f32362p.put((Integer) entry.getKey(), (InterfaceC5551q) entry.getValue());
            } else {
                c5364f.f32362p.put((Integer) entry.getKey(), ((InterfaceC5551q) entry.getValue()).zzd());
            }
        }
        return c5364f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        if (this.f32362p.size() == 1) {
            return m29104m(0).zzh();
        }
        if (this.f32362p.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        return m29105n(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return new C5330d(this, this.f32362p.keySet().iterator(), this.f32363q.keySet().iterator());
    }

    public C5364f(List list) {
        this();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                m29111v(i11, (InterfaceC5551q) list.get(i11));
            }
        }
    }
}
