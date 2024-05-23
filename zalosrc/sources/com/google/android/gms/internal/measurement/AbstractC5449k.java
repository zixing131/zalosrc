package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5449k {
    /* renamed from: a */
    public static InterfaceC5551q m29328a(InterfaceC5483m interfaceC5483m, InterfaceC5551q interfaceC5551q, C5590s4 c5590s4, List list) {
        if (interfaceC5483m.mo29099e(interfaceC5551q.zzi())) {
            InterfaceC5551q mo29101j = interfaceC5483m.mo29101j(interfaceC5551q.zzi());
            if (mo29101j instanceof AbstractC5432j) {
                return ((AbstractC5432j) mo29101j).mo28891a(c5590s4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC5551q.zzi()));
        }
        if ("hasOwnProperty".equals(interfaceC5551q.zzi())) {
            AbstractC5608t5.m29617h("hasOwnProperty", 1, list);
            if (interfaceC5483m.mo29099e(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi())) {
                return InterfaceC5551q.f32735i;
            }
            return InterfaceC5551q.f32736j;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC5551q.zzi()));
    }

    /* renamed from: b */
    public static Iterator m29329b(Map map) {
        return new C5466l(map.keySet().iterator());
    }
}
