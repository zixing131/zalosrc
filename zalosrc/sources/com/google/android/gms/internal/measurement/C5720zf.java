package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.zf */
/* loaded from: classes2.dex */
public final class C5720zf {

    /* renamed from: a */
    final TreeMap f32971a = new TreeMap();

    /* renamed from: b */
    final TreeMap f32972b = new TreeMap();

    /* renamed from: c */
    private static final int m30114c(C5590s4 c5590s4, C5534p c5534p, InterfaceC5551q interfaceC5551q) {
        InterfaceC5551q mo28891a = c5534p.mo28891a(c5590s4, Collections.singletonList(interfaceC5551q));
        if (mo28891a instanceof C5415i) {
            return AbstractC5608t5.m29611b(mo28891a.zzh().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m30115a(String str, int i11, C5534p c5534p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f32972b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f32971a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i11))) {
            i11 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i11), c5534p);
    }

    /* renamed from: b */
    public final void m30116b(C5590s4 c5590s4, C5313c c5313c) {
        C5595s9 c5595s9 = new C5595s9(c5313c);
        for (Integer num : this.f32971a.keySet()) {
            C5296b clone = c5313c.m28955b().clone();
            int m30114c = m30114c(c5590s4, (C5534p) this.f32971a.get(num), c5595s9);
            if (m30114c == 2 || m30114c == -1) {
                c5313c.m28959f(clone);
            }
        }
        Iterator it = this.f32972b.keySet().iterator();
        while (it.hasNext()) {
            m30114c(c5590s4, (C5534p) this.f32972b.get((Integer) it.next()), c5595s9);
        }
    }
}
