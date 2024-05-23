package ga0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p348mi.AbstractC23304d;
import p716zh.C32093r8;

/* renamed from: ga0.u0 */
/* loaded from: classes6.dex */
public final class C19364u0 {

    /* renamed from: a */
    private final Map f96173a;

    /* renamed from: b */
    private long f96174b;

    public C19364u0() {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f96173a = synchronizedMap;
        this.f96174b = -1L;
    }

    /* renamed from: a */
    private final List m101458a(String str) {
        ArrayList arrayList = new ArrayList();
        Map map = AbstractC23304d.f113429r;
        AbstractC19074t.m100207e(map, "mapKeywordArrInfoItems");
        for (Map.Entry entry : map.entrySet()) {
            this.f96173a.put(str, arrayList);
            Object value = entry.getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            for (C32093r8 c32093r8 : (Iterable) value) {
                C32093r8 c32093r82 = new C32093r8();
                c32093r82.f147887d = c32093r8.f147887d;
                c32093r82.f147884a = c32093r8.f147884a;
                c32093r82.f147886c = c32093r8.f147886c;
                c32093r82.f147890g = 1.0f;
                c32093r82.f147885b = c32093r8.f147885b;
                c32093r82.f147893j = c32093r8.f147893j;
                c32093r82.f147892i = c32093r8.f147892i;
                arrayList.add(c32093r82);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List m101459b(String str) {
        AbstractC19074t.m100208f(str, "query");
        if (m101460c()) {
            this.f96173a.clear();
            m101461d(false);
        }
        List list = (List) this.f96173a.get("");
        if (list == null) {
            return m101458a("");
        }
        return list;
    }

    /* renamed from: c */
    public final boolean m101460c() {
        if (this.f96174b != C19322f1.f95950a.m101147c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m101461d(boolean z11) {
        long m101147c;
        if (z11) {
            m101147c = -1;
        } else {
            m101147c = C19322f1.f95950a.m101147c();
        }
        this.f96174b = m101147c;
    }
}
