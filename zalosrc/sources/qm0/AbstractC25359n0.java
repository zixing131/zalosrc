package qm0;

import fn0.AbstractC19074t;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: qm0.n0 */
/* loaded from: classes.dex */
abstract class AbstractC25359n0 {
    /* renamed from: a */
    public static final Object m131395a(Map map, Object obj) {
        AbstractC19074t.m100208f(map, "<this>");
        if (map instanceof InterfaceC25355l0) {
            return ((InterfaceC25355l0) map).m131319s(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }
}
