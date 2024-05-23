package qm0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import jn0.AbstractC21317c;
import ln0.AbstractC22543l;
import nn0.InterfaceC23898g;
import on0.AbstractC24333n;
import sm0.AbstractC26327c;

/* renamed from: qm0.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC25332a0 extends AbstractC25382z {

    /* renamed from: qm0.a0$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC23898g {

        /* renamed from: a */
        final /* synthetic */ Iterable f121510a;

        public a(Iterable iterable) {
            this.f121510a = iterable;
        }

        @Override // nn0.InterfaceC23898g
        public Iterator iterator() {
            return this.f121510a.iterator();
        }
    }

    /* renamed from: qm0.a0$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f121511q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(1);
            this.f121511q = i11;
        }

        /* renamed from: a */
        public final Object m131227a(int i11) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f121511q + '.');
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m131227a(((Number) obj).intValue());
        }
    }

    /* renamed from: qm0.a0$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Iterable f121512q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Iterable iterable) {
            super(0);
            this.f121512q = iterable;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Iterator mo12V4() {
            return this.f121512q.iterator();
        }
    }

    /* renamed from: A0 */
    public static final Object m131173A0(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: B0 */
    public static Object m131174B0(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: C0 */
    public static List m131175C0(Iterable iterable) {
        List m131320c;
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m131185M0 = m131185M0(iterable);
                return m131185M0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            AbstractC25356m.m131335r((Comparable[]) array);
            m131320c = AbstractC25356m.m131320c(array);
            return m131320c;
        }
        List m131186N0 = m131186N0(iterable);
        AbstractC25376w.m131533v(m131186N0);
        return m131186N0;
    }

    /* renamed from: D0 */
    public static List m131176D0(Iterable iterable) {
        Comparator m135479c;
        List m131177E0;
        AbstractC19074t.m100208f(iterable, "<this>");
        m135479c = AbstractC26327c.m135479c();
        m131177E0 = m131177E0(iterable, m135479c);
        return m131177E0;
    }

    /* renamed from: E0 */
    public static List m131177E0(Iterable iterable, Comparator comparator) {
        List m131320c;
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m131185M0 = m131185M0(iterable);
                return m131185M0;
            }
            Object[] array = collection.toArray(new Object[0]);
            AbstractC25356m.m131336s(array, comparator);
            m131320c = AbstractC25356m.m131320c(array);
            return m131320c;
        }
        List m131186N0 = m131186N0(iterable);
        AbstractC25376w.m131534w(m131186N0, comparator);
        return m131186N0;
    }

    /* renamed from: F0 */
    public static long m131178F0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        Iterator it = iterable.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((Number) it.next()).longValue();
        }
        return j11;
    }

    /* renamed from: G0 */
    public static List m131179G0(Iterable iterable, int i11) {
        Object m131204d0;
        List m131496e;
        List m131185M0;
        List m131502j;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            if (iterable instanceof Collection) {
                if (i11 >= ((Collection) iterable).size()) {
                    m131185M0 = m131185M0(iterable);
                    return m131185M0;
                }
                if (i11 == 1) {
                    m131204d0 = m131204d0(iterable);
                    m131496e = AbstractC25366r.m131496e(m131204d0);
                    return m131496e;
                }
            }
            ArrayList arrayList = new ArrayList(i11);
            Iterator it = iterable.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i12++;
                if (i12 == i11) {
                    break;
                }
            }
            return AbstractC25368s.m131507o(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: H0 */
    public static List m131180H0(List list, int i11) {
        Object m131216p0;
        List m131496e;
        List m131185M0;
        List m131502j;
        AbstractC19074t.m100208f(list, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            int size = list.size();
            if (i11 >= size) {
                m131185M0 = m131185M0(list);
                return m131185M0;
            }
            if (i11 == 1) {
                m131216p0 = m131216p0(list);
                m131496e = AbstractC25366r.m131496e(m131216p0);
                return m131496e;
            }
            ArrayList arrayList = new ArrayList(i11);
            if (list instanceof RandomAccess) {
                for (int i12 = size - i11; i12 < size; i12++) {
                    arrayList.add(list.get(i12));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i11);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: I0 */
    public static boolean[] m131181I0(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        return zArr;
    }

    /* renamed from: J0 */
    public static final Collection m131182J0(Iterable iterable, Collection collection) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* renamed from: K0 */
    public static HashSet m131183K0(Iterable iterable) {
        int m131511r;
        int m131400e;
        AbstractC19074t.m100208f(iterable, "<this>");
        m131511r = AbstractC25370t.m131511r(iterable, 12);
        m131400e = AbstractC25361o0.m131400e(m131511r);
        return (HashSet) m131182J0(iterable, new HashSet(m131400e));
    }

    /* renamed from: L0 */
    public static int[] m131184L0(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Number) it.next()).intValue();
            i11++;
        }
        return iArr;
    }

    /* renamed from: M0 */
    public static List m131185M0(Iterable iterable) {
        List m131502j;
        Object next;
        List m131496e;
        List m131187O0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            if (size != 1) {
                m131187O0 = m131187O0(collection);
                return m131187O0;
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            m131496e = AbstractC25366r.m131496e(next);
            return m131496e;
        }
        return AbstractC25368s.m131507o(m131186N0(iterable));
    }

    /* renamed from: N0 */
    public static final List m131186N0(Iterable iterable) {
        List m131187O0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            m131187O0 = m131187O0((Collection) iterable);
            return m131187O0;
        }
        return (List) m131182J0(iterable, new ArrayList());
    }

    /* renamed from: O0 */
    public static List m131187O0(Collection collection) {
        AbstractC19074t.m100208f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: P0 */
    public static Set m131188P0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m131182J0(iterable, new LinkedHashSet());
    }

    /* renamed from: Q0 */
    public static Set m131189Q0(Iterable iterable) {
        Set m131551e;
        Object next;
        Set m131538d;
        int m131400e;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                m131551e = AbstractC25379x0.m131551e();
                return m131551e;
            }
            if (size != 1) {
                m131400e = AbstractC25361o0.m131400e(collection.size());
                return (Set) m131182J0(iterable, new LinkedHashSet(m131400e));
            }
            if (iterable instanceof List) {
                next = ((List) iterable).get(0);
            } else {
                next = iterable.iterator().next();
            }
            m131538d = AbstractC25377w0.m131538d(next);
            return m131538d;
        }
        return AbstractC25379x0.m131554h((Set) m131182J0(iterable, new LinkedHashSet()));
    }

    /* renamed from: R0 */
    public static Set m131190R0(Iterable iterable, Iterable iterable2) {
        Set m131188P0;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(iterable2, "other");
        m131188P0 = m131188P0(iterable);
        AbstractC25378x.m131548x(m131188P0, iterable2);
        return m131188P0;
    }

    /* renamed from: S */
    public static InterfaceC23898g m131191S(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        return new a(iterable);
    }

    /* renamed from: S0 */
    public static final List m131192S0(Iterable iterable, int i11, int i12, boolean z11) {
        int i13;
        int m116584g;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC25383z0.m131567a(i11, i12);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i14 = size / i12;
            if (size % i12 == 0) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            ArrayList arrayList = new ArrayList(i14 + i13);
            int i15 = 0;
            while (i15 >= 0 && i15 < size) {
                m116584g = AbstractC22543l.m116584g(i11, size - i15);
                if (m116584g < i11 && !z11) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList(m116584g);
                for (int i16 = 0; i16 < m116584g; i16++) {
                    arrayList2.add(list.get(i16 + i15));
                }
                arrayList.add(arrayList2);
                i15 += i12;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator m131568b = AbstractC25383z0.m131568b(iterable.iterator(), i11, i12, z11, false);
        while (m131568b.hasNext()) {
            arrayList3.add((List) m131568b.next());
        }
        return arrayList3;
    }

    /* renamed from: T */
    public static double m131193T(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        Iterator it = iterable.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            d11 += ((Number) it.next()).floatValue();
            i11++;
            if (i11 < 0) {
                AbstractC25368s.m131508p();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return d11 / i11;
    }

    /* renamed from: T0 */
    public static Iterable m131194T0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        return new C25347h0(new c(iterable));
    }

    /* renamed from: U */
    public static List m131195U(Iterable iterable, int i11) {
        AbstractC19074t.m100208f(iterable, "<this>");
        return m131192S0(iterable, i11, i11, true);
    }

    /* renamed from: V */
    public static boolean m131196V(Iterable iterable, Object obj) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (m131208h0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public static List m131197W(Iterable iterable) {
        Set m131188P0;
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        m131188P0 = m131188P0(iterable);
        m131185M0 = m131185M0(m131188P0);
        return m131185M0;
    }

    /* renamed from: X */
    public static List m131198X(Iterable iterable, int i11) {
        ArrayList arrayList;
        Object m131215o0;
        List m131496e;
        List m131502j;
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (i11 >= 0) {
            if (i11 == 0) {
                m131185M0 = m131185M0(iterable);
                return m131185M0;
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i11;
                if (size <= 0) {
                    m131502j = AbstractC25368s.m131502j();
                    return m131502j;
                }
                if (size == 1) {
                    m131215o0 = m131215o0(iterable);
                    m131496e = AbstractC25366r.m131496e(m131215o0);
                    return m131496e;
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i11 < size2) {
                            arrayList.add(((List) iterable).get(i11));
                            i11++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i11);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i12 = 0;
            for (Object obj : iterable) {
                if (i12 >= i11) {
                    arrayList.add(obj);
                } else {
                    i12++;
                }
            }
            return AbstractC25368s.m131507o(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: Y */
    public static List m131199Y(List list, int i11) {
        int m116580c;
        List m131179G0;
        AbstractC19074t.m100208f(list, "<this>");
        if (i11 >= 0) {
            List list2 = list;
            m116580c = AbstractC22543l.m116580c(list.size() - i11, 0);
            m131179G0 = m131179G0(list2, m116580c);
            return m131179G0;
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    /* renamed from: Z */
    public static final Object m131200Z(Iterable iterable, int i11) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i11);
        }
        return m131201a0(iterable, i11, new b(i11));
    }

    /* renamed from: a0 */
    public static final Object m131201a0(Iterable iterable, int i11, InterfaceC18505l interfaceC18505l) {
        int m131504l;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i11 >= 0) {
                m131504l = AbstractC25368s.m131504l(list);
                if (i11 <= m131504l) {
                    return list.get(i11);
                }
            }
            return interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }
        if (i11 < 0) {
            return interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (Object obj : iterable) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return obj;
            }
            i12 = i13;
        }
        return interfaceC18505l.mo205i9(Integer.valueOf(i11));
    }

    /* renamed from: b0 */
    public static List m131202b0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        return (List) m131203c0(iterable, new ArrayList());
    }

    /* renamed from: c0 */
    public static final Collection m131203c0(Iterable iterable, Collection collection) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* renamed from: d0 */
    public static Object m131204d0(Iterable iterable) {
        Object m131205e0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof List) {
            m131205e0 = m131205e0((List) iterable);
            return m131205e0;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: e0 */
    public static Object m131205e0(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: f0 */
    public static Object m131206f0(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: g0 */
    public static Object m131207g0(List list, int i11) {
        int m131504l;
        AbstractC19074t.m100208f(list, "<this>");
        if (i11 >= 0) {
            m131504l = AbstractC25368s.m131504l(list);
            if (i11 <= m131504l) {
                return list.get(i11);
            }
        }
        return null;
    }

    /* renamed from: h0 */
    public static final int m131208h0(Iterable iterable, Object obj) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i11 = 0;
        for (Object obj2 : iterable) {
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (AbstractC19074t.m100204b(obj, obj2)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: i0 */
    public static int m131209i0(List list, Object obj) {
        AbstractC19074t.m100208f(list, "<this>");
        return list.indexOf(obj);
    }

    /* renamed from: j0 */
    public static Set m131210j0(Iterable iterable, Iterable iterable2) {
        Set m131188P0;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(iterable2, "other");
        m131188P0 = m131188P0(iterable);
        AbstractC25378x.m131547I(m131188P0, iterable2);
        return m131188P0;
    }

    /* renamed from: k0 */
    public static final Appendable m131211k0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(appendable, "buffer");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i12 = 0;
        for (Object obj : iterable) {
            i12++;
            if (i12 > 1) {
                appendable.append(charSequence);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            AbstractC24333n.m127093a(appendable, obj, interfaceC18505l);
        }
        if (i11 >= 0 && i12 > i11) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: l0 */
    public static /* synthetic */ Appendable m131212l0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i13;
        CharSequence charSequence7;
        InterfaceC18505l interfaceC18505l2;
        if ((i12 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i12 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i12 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i12 & 16) != 0) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i12 & 64) != 0) {
            interfaceC18505l2 = null;
        } else {
            interfaceC18505l2 = interfaceC18505l;
        }
        return m131211k0(iterable, appendable, charSequence5, charSequence6, charSequence8, i13, charSequence7, interfaceC18505l2);
    }

    /* renamed from: m0 */
    public static final String m131213m0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(charSequence, "separator");
        AbstractC19074t.m100208f(charSequence2, "prefix");
        AbstractC19074t.m100208f(charSequence3, "postfix");
        AbstractC19074t.m100208f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m131211k0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i11, charSequence4, interfaceC18505l)).toString();
        AbstractC19074t.m100207e(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: n0 */
    public static /* synthetic */ String m131214n0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        CharSequence charSequence5;
        int i13;
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i12 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i12 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i12 & 8) != 0) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i12 & 32) != 0) {
            interfaceC18505l = null;
        }
        return m131213m0(iterable, charSequence, charSequence5, charSequence6, i13, charSequence7, interfaceC18505l);
    }

    /* renamed from: o0 */
    public static Object m131215o0(Iterable iterable) {
        Object m131216p0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof List) {
            m131216p0 = m131216p0((List) iterable);
            return m131216p0;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: p0 */
    public static Object m131216p0(List list) {
        int m131504l;
        AbstractC19074t.m100208f(list, "<this>");
        if (!list.isEmpty()) {
            m131504l = AbstractC25368s.m131504l(list);
            return list.get(m131504l);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: q0 */
    public static Object m131217q0(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: r0 */
    public static Comparable m131218r0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: s0 */
    public static Comparable m131219s0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: t0 */
    public static List m131220t0(Iterable iterable, Iterable iterable2) {
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(iterable2, "elements");
        Collection m131550z = AbstractC25378x.m131550z(iterable2);
        if (m131550z.isEmpty()) {
            m131185M0 = m131185M0(iterable);
            return m131185M0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!m131550z.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public static List m131221u0(Iterable iterable, Iterable iterable2) {
        List m131222v0;
        AbstractC19074t.m100208f(iterable, "<this>");
        AbstractC19074t.m100208f(iterable2, "elements");
        if (iterable instanceof Collection) {
            m131222v0 = m131222v0((Collection) iterable, iterable2);
            return m131222v0;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC25378x.m131548x(arrayList, iterable);
        AbstractC25378x.m131548x(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: v0 */
    public static List m131222v0(Collection collection, Iterable iterable) {
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        AbstractC25378x.m131548x(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: w0 */
    public static List m131223w0(Collection collection, Object obj) {
        AbstractC19074t.m100208f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: x0 */
    public static Object m131224x0(Collection collection, AbstractC21317c abstractC21317c) {
        AbstractC19074t.m100208f(collection, "<this>");
        AbstractC19074t.m100208f(abstractC21317c, "random");
        if (!collection.isEmpty()) {
            return m131200Z(collection, abstractC21317c.mo110373e(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: y0 */
    public static List m131225y0(Iterable iterable) {
        List m131185M0;
        AbstractC19074t.m100208f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            m131185M0 = m131185M0(iterable);
            return m131185M0;
        }
        List m131186N0 = m131186N0(iterable);
        AbstractC25382z.m131566R(m131186N0);
        return m131186N0;
    }

    /* renamed from: z0 */
    public static Object m131226z0(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "<this>");
        if (iterable instanceof List) {
            return m131173A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
