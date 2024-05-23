package vn0;

import fn0.AbstractC19074t;
import on0.AbstractC24340u;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: vn0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC28322i {

    /* renamed from: a */
    private static final int f132048a;

    static {
        Object m129218b;
        int i11;
        Integer m127107m;
        try {
            C24861r.a aVar = C24861r.f119264q;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC19074t.m100207e(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            m127107m = AbstractC24340u.m127107m(property);
            m129218b = C24861r.m129218b(m127107m);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = null;
        }
        Integer num = (Integer) m129218b;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 2097152;
        }
        f132048a = i11;
    }
}
