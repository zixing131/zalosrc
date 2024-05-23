package qm0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pm0.C24860q;

/* renamed from: qm0.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC25367r0 extends AbstractC25365q0 {
    /* renamed from: w */
    public static List m131499w(Map map) {
        List m131496e;
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(map, "<this>");
        if (map.size() == 0) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            m131496e = AbstractC25366r.m131496e(new C24860q(entry.getKey(), entry.getValue()));
            return m131496e;
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C24860q(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C24860q(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
