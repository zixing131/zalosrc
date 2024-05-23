package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* loaded from: classes2.dex */
public abstract class AbstractC5643v6 {
    /* renamed from: a */
    public static InterfaceC5551q m29773a(C5574r5 c5574r5) {
        if (c5574r5 == null) {
            return InterfaceC5551q.f32730d;
        }
        int m29582J = c5574r5.m29582J() - 1;
        if (m29582J != 1) {
            if (m29582J != 2) {
                if (m29582J != 3) {
                    if (m29582J == 4) {
                        List m29577E = c5574r5.m29577E();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = m29577E.iterator();
                        while (it.hasNext()) {
                            arrayList.add(m29773a((C5574r5) it.next()));
                        }
                        return new C5568r(c5574r5.m29575C(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (c5574r5.m29579G()) {
                    return new C5381g(Boolean.valueOf(c5574r5.m29578F()));
                }
                return new C5381g(null);
            }
            if (c5574r5.m29580H()) {
                return new C5415i(Double.valueOf(c5574r5.m29574A()));
            }
            return new C5415i(null);
        }
        if (c5574r5.m29581I()) {
            return new C5619u(c5574r5.m29576D());
        }
        return InterfaceC5551q.f32737k;
    }

    /* renamed from: b */
    public static InterfaceC5551q m29774b(Object obj) {
        if (obj == null) {
            return InterfaceC5551q.f32731e;
        }
        if (obj instanceof String) {
            return new C5619u((String) obj);
        }
        if (obj instanceof Double) {
            return new C5415i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C5415i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C5415i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C5381g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C5500n c5500n = new C5500n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC5551q m29774b = m29774b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c5500n.mo29100g((String) obj2, m29774b);
                }
            }
            return c5500n;
        }
        if (obj instanceof List) {
            C5364f c5364f = new C5364f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c5364f.m29111v(c5364f.m29103l(), m29774b(it.next()));
            }
            return c5364f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
