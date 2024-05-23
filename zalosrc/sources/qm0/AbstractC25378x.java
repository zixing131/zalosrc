package qm0;

import en0.InterfaceC18505l;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import ln0.C22537f;

/* renamed from: qm0.x */
/* loaded from: classes.dex */
public abstract class AbstractC25378x extends AbstractC25376w {
    /* renamed from: A */
    private static final boolean m131539A(Iterable iterable, InterfaceC18505l interfaceC18505l, boolean z11) {
        Iterator it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC18505l.mo205i9(it.next())).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    /* renamed from: B */
    private static final boolean m131540B(List list, InterfaceC18505l interfaceC18505l, boolean z11) {
        int m131504l;
        int m131504l2;
        if (list instanceof RandomAccess) {
            m131504l = AbstractC25368s.m131504l(list);
            AbstractC25351j0 it = new C22537f(0, m131504l).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int mo116552a = it.mo116552a();
                Object obj = list.get(mo116552a);
                if (((Boolean) interfaceC18505l.mo205i9(obj)).booleanValue() != z11) {
                    if (i11 != mo116552a) {
                        list.set(i11, obj);
                    }
                    i11++;
                }
            }
            if (i11 < list.size()) {
                m131504l2 = AbstractC25368s.m131504l(list);
                if (i11 > m131504l2) {
                    return true;
                }
                while (true) {
                    list.remove(m131504l2);
                    if (m131504l2 != i11) {
                        m131504l2--;
                    } else {
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            AbstractC19074t.m100206d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m131539A(AbstractC19069o0.m100185b(list), interfaceC18505l, z11);
        }
    }

    /* renamed from: C */
    public static boolean m131541C(Iterable iterable, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        return m131539A(iterable, interfaceC18505l, true);
    }

    /* renamed from: D */
    public static boolean m131542D(List list, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        return m131540B(list, interfaceC18505l, true);
    }

    /* renamed from: E */
    public static Object m131543E(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: F */
    public static Object m131544F(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* renamed from: G */
    public static Object m131545G(List list) {
        int m131504l;
        AbstractC19074t.m100208f(list, "<this>");
        if (!list.isEmpty()) {
            m131504l = AbstractC25368s.m131504l(list);
            return list.remove(m131504l);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: H */
    public static Object m131546H(List list) {
        int m131504l;
        AbstractC19074t.m100208f(list, "<this>");
        if (!list.isEmpty()) {
            m131504l = AbstractC25368s.m131504l(list);
            return list.remove(m131504l);
        }
        return null;
    }

    /* renamed from: I */
    public static final boolean m131547I(Collection collection, Iterable iterable) {
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(iterable, "elements");
        return collection.retainAll(m131550z(iterable));
    }

    /* renamed from: x */
    public static boolean m131548x(Collection collection, Iterable iterable) {
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: y */
    public static boolean m131549y(Collection collection, Object[] objArr) {
        List m131320c;
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(objArr, "elements");
        m131320c = AbstractC25356m.m131320c(objArr);
        return collection.addAll(m131320c);
    }

    /* renamed from: z */
    public static final Collection m131550z(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC25332a0.m131185M0(iterable);
        }
        return (Collection) iterable;
    }
}
