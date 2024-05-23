package gs;

import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gs.b */
/* loaded from: classes4.dex */
public final class C19592b {

    /* renamed from: a */
    public static final C19592b f97337a = new C19592b();

    /* renamed from: b */
    private static final Map f97338b = Collections.synchronizedMap(new HashMap());

    private C19592b() {
    }

    /* renamed from: a */
    public final String m102564a(String str) {
        return (String) f97338b.get(str);
    }

    /* renamed from: b */
    public final void m102565b(String str, String str2) {
        Map map = f97338b;
        AbstractC19074t.m100207e(map, "cachedRichContentMaps");
        map.put(str, str2);
    }
}
