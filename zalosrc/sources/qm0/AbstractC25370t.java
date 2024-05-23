package qm0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: qm0.t */
/* loaded from: classes.dex */
public abstract class AbstractC25370t extends AbstractC25368s {
    /* renamed from: r */
    public static int m131511r(Iterable iterable, int i11) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i11;
    }

    /* renamed from: s */
    public static final Integer m131512s(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: t */
    public static List m131513t(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC25378x.m131548x(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
