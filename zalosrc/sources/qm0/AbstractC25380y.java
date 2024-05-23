package qm0;

import fn0.AbstractC19074t;
import java.util.List;
import ln0.C22537f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.y */
/* loaded from: classes.dex */
public abstract class AbstractC25380y extends AbstractC25378x {
    /* renamed from: M */
    public static List m131559M(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        return new C25371t0(list);
    }

    /* renamed from: N */
    public static List m131560N(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        return new C25369s0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final int m131561O(List list, int i11) {
        int m131504l;
        int m131504l2;
        int m131504l3;
        m131504l = AbstractC25368s.m131504l(list);
        if (new C22537f(0, m131504l).m116554l(i11)) {
            m131504l3 = AbstractC25368s.m131504l(list);
            return m131504l3 - i11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i11);
        sb2.append(" must be in range [");
        m131504l2 = AbstractC25368s.m131504l(list);
        sb2.append(new C22537f(0, m131504l2));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final int m131562P(List list, int i11) {
        int m131504l;
        m131504l = AbstractC25368s.m131504l(list);
        return m131504l - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final int m131563Q(List list, int i11) {
        if (new C22537f(0, list.size()).m116554l(i11)) {
            return list.size() - i11;
        }
        throw new IndexOutOfBoundsException("Position index " + i11 + " must be in range [" + new C22537f(0, list.size()) + "].");
    }
}
