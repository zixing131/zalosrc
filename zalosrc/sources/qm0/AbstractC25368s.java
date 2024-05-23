package qm0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ln0.C22537f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.s */
/* loaded from: classes.dex */
public abstract class AbstractC25368s extends AbstractC25366r {
    /* renamed from: h */
    public static ArrayList m131500h(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C25346h(objArr, true));
    }

    /* renamed from: i */
    public static final Collection m131501i(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "<this>");
        return new C25346h(objArr, false);
    }

    /* renamed from: j */
    public static List m131502j() {
        return C25337c0.f121530p;
    }

    /* renamed from: k */
    public static C22537f m131503k(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        return new C22537f(0, collection.size() - 1);
    }

    /* renamed from: l */
    public static int m131504l(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: m */
    public static List m131505m(Object... objArr) {
        List m131502j;
        List m131320c;
        AbstractC19074t.m100208f(objArr, "elements");
        if (objArr.length > 0) {
            m131320c = AbstractC25356m.m131320c(objArr);
            return m131320c;
        }
        m131502j = m131502j();
        return m131502j;
    }

    /* renamed from: n */
    public static List m131506n(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C25346h(objArr, true));
    }

    /* renamed from: o */
    public static final List m131507o(List list) {
        List m131502j;
        List m131496e;
        AbstractC19074t.m100208f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            m131502j = m131502j();
            return m131502j;
        }
        if (size == 1) {
            m131496e = AbstractC25366r.m131496e(list.get(0));
            return m131496e;
        }
        return list;
    }

    /* renamed from: p */
    public static void m131508p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: q */
    public static void m131509q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
