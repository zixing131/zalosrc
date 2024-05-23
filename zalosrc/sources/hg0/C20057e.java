package hg0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hg0.e */
/* loaded from: classes.dex */
public final class C20057e {

    /* renamed from: b */
    public static final C20057e f98626b = new C20057e();

    /* renamed from: a */
    private static final Map f98625a = new HashMap();

    private C20057e() {
    }

    /* renamed from: a */
    private final AbstractC20056d m104179a(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createWorker(");
        sb2.append(i11);
        sb2.append(')');
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return new C20054b();
                }
                throw new IllegalArgumentException("Worker of type " + i11 + " is not defined!");
            }
            return new C20053a();
        }
        return new C20055c();
    }

    /* renamed from: b */
    public final AbstractC20056d m104180b(int i11) {
        AbstractC20056d abstractC20056d;
        Map map = f98625a;
        Object obj = map.get(Integer.valueOf(i11));
        if (obj != null) {
            return (AbstractC20056d) obj;
        }
        synchronized (map) {
            abstractC20056d = (AbstractC20056d) map.get(Integer.valueOf(i11));
            if (abstractC20056d == null) {
                abstractC20056d = f98626b.m104179a(i11);
                map.put(Integer.valueOf(i11), abstractC20056d);
            }
        }
        return abstractC20056d;
    }
}
