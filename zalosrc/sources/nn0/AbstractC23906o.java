package nn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gn0.InterfaceC19517a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;

/* renamed from: nn0.o */
/* loaded from: classes.dex */
public abstract class AbstractC23906o extends AbstractC23905n {

    /* renamed from: nn0.o$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterable, InterfaceC19517a {

        /* renamed from: p */
        final /* synthetic */ InterfaceC23898g f115520p;

        public a(InterfaceC23898g interfaceC23898g) {
            this.f115520p = interfaceC23898g;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f115520p.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn0.o$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f115521q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(1);
            this.f115521q = i11;
        }

        /* renamed from: a */
        public final Object m125034a(int i11) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f115521q + '.');
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m125034a(((Number) obj).intValue());
        }
    }

    /* renamed from: nn0.o$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f115522q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(Object obj) {
            boolean z11;
            if (obj == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: nn0.o$d */
    /* loaded from: classes7.dex */
    public static final class d implements InterfaceC23898g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC23898g f115523a;

        /* renamed from: b */
        final /* synthetic */ Comparator f115524b;

        d(InterfaceC23898g interfaceC23898g, Comparator comparator) {
            this.f115523a = interfaceC23898g;
            this.f115524b = comparator;
        }

        @Override // nn0.InterfaceC23898g
        public Iterator iterator() {
            List m125033v = AbstractC23906o.m125033v(this.f115523a);
            AbstractC25376w.m131534w(m125033v, this.f115524b);
            return m125033v.iterator();
        }
    }

    /* renamed from: h */
    public static Iterable m125019h(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        return new a(interfaceC23898g);
    }

    /* renamed from: i */
    public static InterfaceC23898g m125020i(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "selector");
        return new C23894c(interfaceC23898g, interfaceC18505l);
    }

    /* renamed from: j */
    public static Object m125021j(InterfaceC23898g interfaceC23898g, int i11) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        return m125022k(interfaceC23898g, i11, new b(i11));
    }

    /* renamed from: k */
    public static final Object m125022k(InterfaceC23898g interfaceC23898g, int i11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "defaultValue");
        if (i11 < 0) {
            return interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }
        int i12 = 0;
        for (Object obj : interfaceC23898g) {
            int i13 = i12 + 1;
            if (i11 == i12) {
                return obj;
            }
            i12 = i13;
        }
        return interfaceC18505l.mo205i9(Integer.valueOf(i11));
    }

    /* renamed from: l */
    public static InterfaceC23898g m125023l(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        return new C23896e(interfaceC23898g, true, interfaceC18505l);
    }

    /* renamed from: m */
    public static final InterfaceC23898g m125024m(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        return new C23896e(interfaceC23898g, false, interfaceC18505l);
    }

    /* renamed from: n */
    public static final InterfaceC23898g m125025n(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        InterfaceC23898g m125024m = m125024m(interfaceC23898g, c.f115522q);
        AbstractC19074t.m100206d(m125024m, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return m125024m;
    }

    /* renamed from: o */
    public static Object m125026o(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        Iterator it = interfaceC23898g.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: p */
    public static Object m125027p(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        Iterator it = interfaceC23898g.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: q */
    public static InterfaceC23898g m125028q(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "transform");
        return new C23907p(interfaceC23898g, interfaceC18505l);
    }

    /* renamed from: r */
    public static InterfaceC23898g m125029r(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "transform");
        return m125025n(new C23907p(interfaceC23898g, interfaceC18505l));
    }

    /* renamed from: s */
    public static InterfaceC23898g m125030s(InterfaceC23898g interfaceC23898g, Comparator comparator) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(comparator, "comparator");
        return new d(interfaceC23898g, comparator);
    }

    /* renamed from: t */
    public static final Collection m125031t(InterfaceC23898g interfaceC23898g, Collection collection) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        AbstractC19074t.m100208f(collection, "destination");
        Iterator it = interfaceC23898g.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* renamed from: u */
    public static List m125032u(InterfaceC23898g interfaceC23898g) {
        List m131496e;
        List m131502j;
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        Iterator it = interfaceC23898g.iterator();
        if (!it.hasNext()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            m131496e = AbstractC25366r.m131496e(next);
            return m131496e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: v */
    public static final List m125033v(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        return (List) m125031t(interfaceC23898g, new ArrayList());
    }
}
