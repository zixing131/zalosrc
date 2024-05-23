package qm0;

import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import pm0.C24860q;
import rm0.C25838d;

/* renamed from: qm0.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC25361o0 extends AbstractC25359n0 {
    /* renamed from: b */
    public static Map m131397b(Map map) {
        AbstractC19074t.m100208f(map, "builder");
        return ((C25838d) map).m133270l();
    }

    /* renamed from: c */
    public static Map m131398c() {
        return new C25838d();
    }

    /* renamed from: d */
    public static Map m131399d(int i11) {
        return new C25838d(i11);
    }

    /* renamed from: e */
    public static int m131400e(int i11) {
        if (i11 < 0) {
            return i11;
        }
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public static Map m131401f(C24860q c24860q) {
        AbstractC19074t.m100208f(c24860q, "pair");
        Map singletonMap = Collections.singletonMap(c24860q.m129215c(), c24860q.m129216d());
        AbstractC19074t.m100207e(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    /* renamed from: g */
    public static final Map m131402g(Map map) {
        AbstractC19074t.m100208f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC19074t.m100207e(singletonMap, "with(...)");
        return singletonMap;
    }

    /* renamed from: h */
    public static SortedMap m131403h(Map map) {
        AbstractC19074t.m100208f(map, "<this>");
        return new TreeMap(map);
    }
}
