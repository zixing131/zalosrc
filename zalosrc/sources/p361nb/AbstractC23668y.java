package p361nb;

import android.util.SparseArray;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nb.y */
/* loaded from: classes3.dex */
public abstract class AbstractC23668y {

    /* renamed from: a */
    private static final SparseArray f114652a = new SparseArray();

    /* renamed from: b */
    private static final Map f114653b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: a */
    public static C23653j m123992a(C23648e c23648e) {
        if (c23648e.f114654a != 13) {
            c23648e.m123922o(0);
            return new C23653j(c23648e, 0L);
        }
        String str = c23648e.f114655b + "_" + c23648e.m123916i();
        Map map = f114653b;
        C23653j c23653j = (C23653j) map.get(str);
        if (c23653j == null) {
            c23648e.m123922o(0);
            C23653j c23653j2 = new C23653j(c23648e, 0L);
            map.put(str, c23653j2);
            return c23653j2;
        }
        return c23653j;
    }

    /* renamed from: b */
    public static Map m123993b() {
        return f114653b;
    }

    /* renamed from: c */
    public static SparseArray m123994c() {
        return f114652a;
    }

    /* renamed from: d */
    public static int m123995d(int i11) {
        SparseArray sparseArray = f114652a;
        AtomicInteger atomicInteger = (AtomicInteger) sparseArray.get(i11);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            sparseArray.put(i11, atomicInteger);
        }
        return atomicInteger.get();
    }

    /* renamed from: e */
    public static void m123996e(C23648e c23648e) {
        if (c23648e.f114654a != 13) {
            return;
        }
        f114653b.remove(c23648e.f114655b + "_" + c23648e.m123916i());
    }

    /* renamed from: f */
    public static void m123997f(int i11, int i12) {
        SparseArray sparseArray = f114652a;
        AtomicInteger atomicInteger = (AtomicInteger) sparseArray.get(i11);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger();
            sparseArray.put(i11, atomicInteger);
        }
        atomicInteger.set(i12);
    }

    /* renamed from: g */
    public static void m123998g(C23648e c23648e, boolean z11) {
        if (c23648e.f114654a != 13) {
            return;
        }
        String str = c23648e.f114655b + "_" + c23648e.m123916i();
        Map map = f114653b;
        C23653j c23653j = (C23653j) map.get(str);
        if (c23653j == null) {
            c23653j = new C23653j(c23648e, 0L);
            map.put(str, c23653j);
        } else {
            c23653j.m123968d(c23648e);
        }
        if (z11) {
            c23653j.m123969e(0L);
        } else if (c23653j.m123967c() == 0) {
            c23653j.m123969e(System.currentTimeMillis() + 5000);
        }
    }
}
