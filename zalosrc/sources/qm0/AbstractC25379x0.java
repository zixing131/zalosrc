package qm0;

import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC25379x0 extends AbstractC25377w0 {
    /* renamed from: e */
    public static Set m131551e() {
        return C25341e0.f121532p;
    }

    /* renamed from: f */
    public static HashSet m131552f(Object... objArr) {
        int m131400e;
        AbstractC19074t.m100208f(objArr, "elements");
        m131400e = AbstractC25361o0.m131400e(objArr.length);
        return (HashSet) AbstractC25358n.m131379a0(objArr, new HashSet(m131400e));
    }

    /* renamed from: g */
    public static Set m131553g(Object... objArr) {
        int m131400e;
        AbstractC19074t.m100208f(objArr, "elements");
        m131400e = AbstractC25361o0.m131400e(objArr.length);
        return (Set) AbstractC25358n.m131379a0(objArr, new LinkedHashSet(m131400e));
    }

    /* renamed from: h */
    public static final Set m131554h(Set set) {
        Set m131551e;
        Set m131538d;
        AbstractC19074t.m100208f(set, "<this>");
        int size = set.size();
        if (size == 0) {
            m131551e = m131551e();
            return m131551e;
        }
        if (size == 1) {
            m131538d = AbstractC25377w0.m131538d(set.iterator().next());
            return m131538d;
        }
        return set;
    }

    /* renamed from: i */
    public static Set m131555i(Object... objArr) {
        Set m131551e;
        AbstractC19074t.m100208f(objArr, "elements");
        if (objArr.length <= 0) {
            m131551e = m131551e();
            return m131551e;
        }
        return AbstractC25358n.m131384f0(objArr);
    }
}
