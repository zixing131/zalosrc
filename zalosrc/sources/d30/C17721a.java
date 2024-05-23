package d30;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: d30.a */
/* loaded from: classes5.dex */
public final class C17721a {

    /* renamed from: a */
    private Map f89810a;

    public C17721a(List list, Map map) {
        AbstractC19074t.m100208f(list, "itemIdList");
        AbstractC19074t.m100208f(map, "kwd2IndexMap");
        this.f89810a = new HashMap();
        for (String str : map.keySet()) {
            List list2 = (List) map.get(str);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (intValue >= 0 && intValue < list.size()) {
                        arrayList.add(list.get(intValue));
                    }
                }
                this.f89810a.put(str, arrayList);
            }
        }
    }

    /* renamed from: a */
    public final Map m93796a() {
        return this.f89810a;
    }
}
