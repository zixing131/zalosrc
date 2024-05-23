package me0;

import fn0.AbstractC19074t;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: me0.z6 */
/* loaded from: classes4.dex */
public final class C23282z6 {

    /* renamed from: a */
    public static final C23282z6 f113023a = new C23282z6();

    /* renamed from: b */
    private static final ConcurrentHashMap f113024b = new ConcurrentHashMap();

    private C23282z6() {
    }

    /* renamed from: a */
    public static final void m120365a(int i11) {
        f113024b.remove(Integer.valueOf(i11));
    }

    /* renamed from: b */
    private static final C23111j6 m120366b(String str, int i11) {
        if (AbstractC23210s6.m119560a(i11, 4096)) {
            return C23013a7.m117988j(str, i11);
        }
        if (AbstractC23210s6.m119560a(i11, 8192)) {
            return C23013a7.m117989k(str, i11);
        }
        return C23013a7.m117991m(str, i11);
    }

    /* renamed from: c */
    public static final C23111j6 m120367c(String str, int i11) {
        AbstractC19074t.m100208f(str, "input");
        ConcurrentHashMap concurrentHashMap = f113024b;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(i11));
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put(Integer.valueOf(i11), concurrentHashMap2);
        }
        C23111j6 c23111j6 = (C23111j6) concurrentHashMap2.get(str);
        if (c23111j6 == null) {
            C23111j6 m120366b = m120366b(str, i11);
            concurrentHashMap2.put(str, m120366b);
            return m120366b;
        }
        return c23111j6;
    }
}
