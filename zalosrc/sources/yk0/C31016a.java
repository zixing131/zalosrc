package yk0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import pm0.C24848g0;

/* renamed from: yk0.a */
/* loaded from: classes7.dex */
public final class C31016a {

    /* renamed from: a */
    private final Object f143075a = new Object();

    /* renamed from: b */
    private final HashMap f143076b = new HashMap();

    /* renamed from: a */
    public final boolean m150801a(Object obj, Object obj2) {
        boolean z11;
        AbstractC19074t.m100208f(obj, "key");
        AbstractC19074t.m100208f(obj2, "signal");
        synchronized (this.f143075a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f143076b.get(obj);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f143076b.put(obj, linkedHashMap);
                }
                z11 = !linkedHashMap.isEmpty();
                linkedHashMap.put(Integer.valueOf(obj2.hashCode()), obj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: b */
    public final Collection m150802b(Object obj) {
        Collection collection;
        AbstractC19074t.m100208f(obj, "key");
        synchronized (this.f143075a) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f143076b.remove(obj);
                if (linkedHashMap != null) {
                    collection = linkedHashMap.values();
                } else {
                    collection = null;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return collection;
    }
}
