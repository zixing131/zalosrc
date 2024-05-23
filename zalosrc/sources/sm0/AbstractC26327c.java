package sm0;

import fn0.AbstractC19074t;
import java.util.Comparator;

/* renamed from: sm0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC26327c {
    /* renamed from: b */
    public static int m135478b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: c */
    public static Comparator m135479c() {
        C26331g c26331g = C26331g.f125004p;
        AbstractC19074t.m100206d(c26331g, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return c26331g;
    }

    /* renamed from: d */
    public static Comparator m135480d(Comparator comparator, Comparator comparator2) {
        AbstractC19074t.m100208f(comparator, "<this>");
        AbstractC19074t.m100208f(comparator2, "comparator");
        return new Comparator() { // from class: sm0.b

            /* renamed from: p */
            public final /* synthetic */ Comparator f125001p;

            /* renamed from: q */
            public final /* synthetic */ Comparator f125002q;

            public /* synthetic */ C26326b(Comparator comparator3, Comparator comparator22) {
                r1 = comparator3;
                r2 = comparator22;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m135481e;
                m135481e = AbstractC26327c.m135481e(r1, r2, obj, obj2);
                return m135481e;
            }
        };
    }

    /* renamed from: e */
    public static final int m135481e(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        AbstractC19074t.m100208f(comparator, "$this_then");
        AbstractC19074t.m100208f(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        if (compare == 0) {
            return comparator2.compare(obj, obj2);
        }
        return compare;
    }
}
