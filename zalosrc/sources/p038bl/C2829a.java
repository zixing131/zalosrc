package p038bl;

import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bl.a */
/* loaded from: classes3.dex */
public final class C2829a {

    /* renamed from: a */
    public static final C2829a f11323a = new C2829a();

    private C2829a() {
    }

    /* renamed from: a */
    public static final int m13676a(Map map, String str, long j11) {
        Integer num;
        AbstractC19074t.m100208f(map, "messageEffect");
        AbstractC19074t.m100208f(str, "ownerUid");
        Map map2 = (Map) map.get(str);
        if (map2 != null && (num = (Integer) map2.remove(Long.valueOf(j11))) != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static final void m13677b(Map map, String str, long j11, int i11) {
        AbstractC19074t.m100208f(map, "messageEffect");
        AbstractC19074t.m100208f(str, "ownerUid");
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(Long.valueOf(j11), Integer.valueOf(i11));
    }
}
