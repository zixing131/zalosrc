package p051c7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: c7.o */
/* loaded from: classes3.dex */
public abstract class AbstractC3320o {

    /* renamed from: a */
    private static final Set f14131a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b */
    private static final Set f14132b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c */
    private static final Map f14133c = new HashMap();

    /* renamed from: d */
    private static final C3325t f14134d = new C3325t("PlayCoreVersion");

    /* renamed from: a */
    public static synchronized Map m16789a(String str) {
        Map map;
        synchronized (AbstractC3320o.class) {
            try {
                Map map2 = f14133c;
                if (!map2.containsKey("app_update")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("java", 11004);
                    map2.put("app_update", hashMap);
                }
                map = (Map) map2.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
