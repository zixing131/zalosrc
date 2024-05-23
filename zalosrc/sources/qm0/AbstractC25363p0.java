package qm0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pm0.C24860q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC25363p0 extends AbstractC25361o0 {
    /* renamed from: i */
    public static Map m131404i() {
        C25339d0 c25339d0 = C25339d0.f121531p;
        AbstractC19074t.m100206d(c25339d0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c25339d0;
    }

    /* renamed from: j */
    public static Object m131405j(Map map, Object obj) {
        AbstractC19074t.m100208f(map, "<this>");
        return AbstractC25359n0.m131395a(map, obj);
    }

    /* renamed from: k */
    public static HashMap m131406k(C24860q... c24860qArr) {
        int m131400e;
        AbstractC19074t.m100208f(c24860qArr, "pairs");
        m131400e = AbstractC25361o0.m131400e(c24860qArr.length);
        HashMap hashMap = new HashMap(m131400e);
        m131412q(hashMap, c24860qArr);
        return hashMap;
    }

    /* renamed from: l */
    public static Map m131407l(C24860q... c24860qArr) {
        Map m131404i;
        int m131400e;
        AbstractC19074t.m100208f(c24860qArr, "pairs");
        if (c24860qArr.length > 0) {
            m131400e = AbstractC25361o0.m131400e(c24860qArr.length);
            return m131416u(c24860qArr, new LinkedHashMap(m131400e));
        }
        m131404i = m131404i();
        return m131404i;
    }

    /* renamed from: m */
    public static Map m131408m(C24860q... c24860qArr) {
        int m131400e;
        AbstractC19074t.m100208f(c24860qArr, "pairs");
        m131400e = AbstractC25361o0.m131400e(c24860qArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
        m131412q(linkedHashMap, c24860qArr);
        return linkedHashMap;
    }

    /* renamed from: n */
    public static final Map m131409n(Map map) {
        Map m131404i;
        AbstractC19074t.m100208f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            m131404i = m131404i();
            return m131404i;
        }
        if (size == 1) {
            return AbstractC25361o0.m131402g(map);
        }
        return map;
    }

    /* renamed from: o */
    public static Map m131410o(Map map, C24860q c24860q) {
        Map m131401f;
        AbstractC19074t.m100208f(map, "<this>");
        AbstractC19074t.m100208f(c24860q, "pair");
        if (map.isEmpty()) {
            m131401f = AbstractC25361o0.m131401f(c24860q);
            return m131401f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c24860q.m129215c(), c24860q.m129216d());
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final void m131411p(Map map, Iterable iterable) {
        AbstractC19074t.m100208f(map, "<this>");
        AbstractC19074t.m100208f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C24860q c24860q = (C24860q) it.next();
            map.put(c24860q.m129213a(), c24860q.m129214b());
        }
    }

    /* renamed from: q */
    public static final void m131412q(Map map, C24860q[] c24860qArr) {
        AbstractC19074t.m100208f(map, "<this>");
        AbstractC19074t.m100208f(c24860qArr, "pairs");
        for (C24860q c24860q : c24860qArr) {
            map.put(c24860q.m129213a(), c24860q.m129214b());
        }
    }

    /* renamed from: r */
    public static Map m131413r(Iterable iterable) {
        Map m131404i;
        Object next;
        Map m131401f;
        int m131400e;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m131404i = m131404i();
                return m131404i;
            }
            if (size != 1) {
                m131400e = AbstractC25361o0.m131400e(collection.size());
                return m131414s(iterable, new LinkedHashMap(m131400e));
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            m131401f = AbstractC25361o0.m131401f((C24860q) next);
            return m131401f;
        }
        return m131409n(m131414s(iterable, new LinkedHashMap()));
    }

    /* renamed from: s */
    public static final Map m131414s(Iterable iterable, Map map) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(map, "destination");
        m131411p(map, iterable);
        return map;
    }

    /* renamed from: t */
    public static Map m131415t(Map map) {
        Map m131404i;
        Map m131417v;
        AbstractC19074t.m100208f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            m131404i = m131404i();
            return m131404i;
        }
        if (size != 1) {
            m131417v = m131417v(map);
            return m131417v;
        }
        return AbstractC25361o0.m131402g(map);
    }

    /* renamed from: u */
    public static final Map m131416u(C24860q[] c24860qArr, Map map) {
        AbstractC19074t.m100208f(c24860qArr, "<this>");
        AbstractC19074t.m100208f(map, "destination");
        m131412q(map, c24860qArr);
        return map;
    }

    /* renamed from: v */
    public static Map m131417v(Map map) {
        AbstractC19074t.m100208f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
