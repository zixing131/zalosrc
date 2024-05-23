package qm0;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: qm0.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC25381y0 extends AbstractC25379x0 {
    /* renamed from: j */
    public static Set m131564j(Set set, Iterable iterable) {
        Set m131189Q0;
        AbstractC19074t.m100208f(set, "<this>");
        AbstractC19074t.m100208f(iterable, "elements");
        Collection<?> m131550z = AbstractC25378x.m131550z(iterable);
        if (m131550z.isEmpty()) {
            m131189Q0 = AbstractC25332a0.m131189Q0(set);
            return m131189Q0;
        }
        if (m131550z instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!m131550z.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(m131550z);
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static Set m131565k(Set set, Iterable iterable) {
        int size;
        int m131400e;
        AbstractC19074t.m100208f(set, "<this>");
        AbstractC19074t.m100208f(iterable, "elements");
        Integer m131512s = AbstractC25370t.m131512s(iterable);
        if (m131512s != null) {
            size = set.size() + m131512s.intValue();
        } else {
            size = set.size() * 2;
        }
        m131400e = AbstractC25361o0.m131400e(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(m131400e);
        linkedHashSet.addAll(set);
        AbstractC25378x.m131548x(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
