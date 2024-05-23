package ue0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ue0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC27241b {

    /* renamed from: a */
    private static final Map f128025a = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static void m139380a(String str) {
        m139381b(str).m139377b();
    }

    /* renamed from: b */
    public static C27240a m139381b(String str) {
        Map map = f128025a;
        C27240a c27240a = (C27240a) map.get(str);
        if (c27240a == null) {
            C27240a c27240a2 = new C27240a(str);
            map.put(str, c27240a2);
            return c27240a2;
        }
        return c27240a;
    }

    /* renamed from: c */
    public static void m139382c(String str) {
        m139381b(str).m139379d();
    }
}
