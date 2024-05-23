package p511sw;

import cu.AbstractC17574a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import ln0.AbstractC22543l;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import tw.AbstractC26901c;
import tw.AbstractC26902d;
import tw.C26899a;
import tw.C26900b;

/* renamed from: sw.c */
/* loaded from: classes4.dex */
public class C26394c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f125380a;

    /* renamed from: b */
    private final C26899a f125381b;

    /* renamed from: c */
    private final List f125382c;

    /* renamed from: d */
    private final AbstractC26901c f125383d;

    /* renamed from: e */
    private volatile int f125384e;

    /* renamed from: f */
    private boolean f125385f;

    /* renamed from: g */
    private final boolean f125386g;

    /* renamed from: h */
    private final C26900b f125387h;

    /* renamed from: sw.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: sw.c$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26392a f125388q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC26392a interfaceC26392a) {
            super(1);
            this.f125388q = interfaceC26392a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(interfaceC26396e, this.f125388q));
        }
    }

    /* renamed from: sw.c$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26392a f125389q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC26392a interfaceC26392a) {
            super(1);
            this.f125389q = interfaceC26392a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(interfaceC26396e.getItemId(), this.f125389q.getItemId()));
        }
    }

    /* renamed from: sw.c$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26392a f125390q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC26392a interfaceC26392a) {
            super(1);
            this.f125390q = interfaceC26392a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(interfaceC26396e, this.f125390q));
        }
    }

    /* renamed from: sw.c$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26392a f125391q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC26392a interfaceC26392a) {
            super(1);
            this.f125391q = interfaceC26392a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(interfaceC26396e.getItemId(), this.f125391q.getItemId()));
        }
    }

    /* renamed from: sw.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC26901c {
        f() {
        }

        @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C26393b)) {
                return false;
            }
            return m136086w((C26393b) obj);
        }

        /* renamed from: w */
        public /* bridge */ boolean m136086w(C26393b c26393b) {
            return super.containsValue(c26393b);
        }

        @Override // tw.AbstractC26901c
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer mo136085h() {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sw.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26396e f125392q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC26396e interfaceC26396e) {
            super(1);
            this.f125392q = interfaceC26396e;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(interfaceC26396e, this.f125392q));
        }
    }

    public C26394c(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f125380a = str;
        this.f125381b = new C26899a(0, 1, null);
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f125382c = synchronizedList;
        this.f125383d = new f();
        this.f125387h = new C26900b(0, false, 3, null);
    }

    /* renamed from: G */
    private final synchronized int m136017G(int i11) {
        int i12 = 0;
        if (m136047M()) {
            return 0;
        }
        for (C26393b c26393b : this.f125383d.values()) {
            if (c26393b.m136007g() >= 0 && c26393b.m136008h() < i11) {
                i12 = c26393b.m136007g() + (i11 - c26393b.m136008h());
            }
        }
        return i12;
    }

    /* renamed from: I */
    private final synchronized void m136018I(int i11, boolean z11) {
        if (z11) {
            try {
                this.f125387h.m138637c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C26393b c26393b = (C26393b) this.f125383d.get(Integer.valueOf(i11));
        if (c26393b != null) {
            c26393b.m136015o(c26393b.m136009i() + 1);
        }
    }

    /* renamed from: J */
    static /* synthetic */ void m136019J(C26394c c26394c, int i11, boolean z11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                z11 = true;
            }
            c26394c.m136018I(i11, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: increasePageSizeByOne");
    }

    /* renamed from: P */
    private final boolean m136020P() {
        if (this.f125387h.m138638d() && this.f125387h.m138636b() == m136068l0()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            r4 = r1.m136007g();     */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized int m136021U(int i11) {
        int i12;
        Iterator it = this.f125383d.values().iterator();
        while (true) {
            if (it.hasNext()) {
                C26393b c26393b = (C26393b) it.next();
                if (c26393b.m136001a(i11)) {
                    break;
                }
            } else {
                i12 = Integer.MIN_VALUE;
                break;
            }
        }
        return i12;
    }

    /* renamed from: X */
    private final synchronized int m136022X(int i11) {
        if (m136047M()) {
            return -1;
        }
        C26393b c26393b = (C26393b) this.f125383d.m138646e(Integer.valueOf(i11));
        if (c26393b == null || !c26393b.m136002b(i11)) {
            return -1;
        }
        return c26393b.m136008h() + (i11 - c26393b.m136007g());
    }

    /* renamed from: a */
    private final synchronized void m136023a(boolean z11) {
        if (z11) {
            try {
                this.f125387h.m138637c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m136028g(0, 0, 1);
        m136059b0(0);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m136024c(C26394c c26394c, InterfaceC26396e interfaceC26396e, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return c26394c.m136058b(interfaceC26396e, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
    }

    /* renamed from: e */
    public static /* synthetic */ void m136025e(C26394c c26394c, InterfaceC26396e interfaceC26396e, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            c26394c.mo17962d(interfaceC26396e, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemAtBegin");
    }

    /* renamed from: e0 */
    private final synchronized void m136026e0(int i11, int i12) {
        try {
            if (m136047M()) {
                return;
            }
            TreeMap treeMap = new TreeMap();
            Iterator it = this.f125383d.values().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                C26393b c26393b = (C26393b) next;
                if (c26393b.m136007g() >= i11) {
                    int m136007g = c26393b.m136007g() + i12;
                    c26393b.m136013m(m136007g);
                    treeMap.put(Integer.valueOf(m136007g), c26393b);
                    it.remove();
                }
            }
            if (i11 == 0 || this.f125381b.m138633a() > i11) {
                m136059b0(this.f125381b.m138633a() + i12);
            }
            this.f125383d.putAll(treeMap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f0 */
    private final void m136027f0(int i11, int i12) {
        if (m136047M()) {
            return;
        }
        for (C26393b c26393b : this.f125383d.values()) {
            if (c26393b.m136007g() > i11) {
                c26393b.m136014n(c26393b.m136008h() + i12);
            }
        }
    }

    /* renamed from: g */
    private final synchronized void m136028g(int i11, int i12, int i13) {
        this.f125383d.put(Integer.valueOf(i11), new C26393b(i11, i12, i13, this.f125382c));
    }

    /* renamed from: g0 */
    private final synchronized void m136029g0(int i11, int i12) {
        try {
            if (m136047M()) {
                return;
            }
            TreeMap treeMap = new TreeMap();
            Iterator it = this.f125383d.values().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                C26393b c26393b = (C26393b) next;
                if (c26393b.m136007g() > i11) {
                    c26393b.m136014n(c26393b.m136008h() + i12);
                    int m136007g = c26393b.m136007g() + i12;
                    c26393b.m136013m(m136007g);
                    treeMap.put(Integer.valueOf(m136007g), c26393b);
                    it.remove();
                }
            }
            if (this.f125381b.m138633a() > i11) {
                m136059b0(this.f125381b.m138633a() + i12);
            }
            this.f125383d.putAll(treeMap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h */
    private final boolean m136030h(int i11) {
        C26393b m136042E = m136042E();
        if (m136042E == null) {
            return false;
        }
        if (m136020P()) {
            if (m136042E.m136008h() > i11) {
                return false;
            }
        } else if (m136042E.m136008h() >= i11) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m136031i(C26393b c26393b, int i11) {
        if (m136020P()) {
            if (c26393b.m136008h() > i11 || i11 > c26393b.m136008h() + c26393b.m136009i()) {
                return false;
            }
        } else if (c26393b.m136008h() >= i11 || i11 >= c26393b.m136008h() + c26393b.m136009i()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m136032j() {
        C26393b m136076v = m136076v();
        if (m136076v == null || this.f125381b.m138633a() + m136076v.m136016p() >= this.f125387h.m138636b()) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    private final synchronized void m136033j0(int i11, InterfaceC18505l interfaceC18505l) {
        try {
            AbstractC26902d.m138659a("PagedList", "shrinkItemList(" + i11 + ")");
            while (m136068l0() > i11) {
                InterfaceC26396e m136064i0 = m136064i0();
                if (m136064i0 != null) {
                    interfaceC18505l.mo205i9(m136064i0);
                }
            }
            this.f125387h.m138639e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: m0 */
    private final synchronized void m136034m0(int i11) {
        try {
            TreeMap treeMap = new TreeMap();
            Iterator it = this.f125383d.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                C26393b c26393b = (C26393b) next;
                if (c26393b.m136008h() < i11 && i11 < c26393b.m136008h() + c26393b.m136009i()) {
                    int m136009i = c26393b.m136009i();
                    int m136008h = i11 - c26393b.m136008h();
                    c26393b.m136015o(m136008h);
                    int m136007g = c26393b.m136007g() + m136008h;
                    treeMap.put(Integer.valueOf(m136007g), new C26393b(m136007g, i11, m136009i - c26393b.m136009i(), this.f125382c));
                    break;
                }
            }
            this.f125383d.putAll(treeMap);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private final synchronized boolean m136035o(int i11) {
        boolean z11;
        try {
            this.f125387h.m138635a();
            C26393b c26393b = (C26393b) this.f125383d.get(Integer.valueOf(i11));
            z11 = false;
            int i12 = 0;
            if (c26393b != null) {
                c26393b.m136015o(c26393b.m136009i() - 1);
                if (c26393b.m136010j()) {
                    this.f125383d.remove(Integer.valueOf(i11));
                    if (!this.f125383d.isEmpty() || (this.f125387h.m138638d() && this.f125387h.m138636b() == 0)) {
                        if (c26393b.m136007g() == this.f125381b.m138633a()) {
                            int intValue = ((Number) this.f125383d.m138653o(Integer.valueOf(c26393b.m136007g()))).intValue();
                            if (intValue == ((Number) this.f125383d.mo136085h()).intValue()) {
                                intValue = ((Number) this.f125383d.m138645c(Integer.valueOf(c26393b.m136007g()))).intValue();
                            }
                            if (intValue != ((Number) this.f125383d.mo136085h()).intValue()) {
                                i12 = intValue;
                            }
                            m136059b0(i12);
                        }
                    }
                    m136069m();
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    /* renamed from: p */
    private final C24860q m136036p(int i11) {
        int i12;
        int i13;
        Iterator it = this.f125383d.values().iterator();
        while (true) {
            if (it.hasNext()) {
                C26393b c26393b = (C26393b) it.next();
                AbstractC19074t.m100205c(c26393b);
                if (m136031i(c26393b, i11)) {
                    i12 = c26393b.m136007g() + (i11 - c26393b.m136008h());
                    i13 = c26393b.m136007g();
                    break;
                }
            } else {
                i12 = Integer.MIN_VALUE;
                i13 = Integer.MIN_VALUE;
                break;
            }
        }
        return new C24860q(Integer.valueOf(i12), Integer.valueOf(i13));
    }

    /* renamed from: q */
    private final int m136037q(InterfaceC26396e interfaceC26396e) {
        return AbstractC17574a.m93594a(this.f125382c, interfaceC26396e);
    }

    /* renamed from: A */
    public final String m136038A() {
        return this.f125380a;
    }

    /* renamed from: B */
    public final synchronized List m136039B() {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(this.f125382c);
        return m131185M0;
    }

    /* renamed from: C */
    public final synchronized InterfaceC26396e m136040C() {
        Object m131217q0;
        m131217q0 = AbstractC25332a0.m131217q0(this.f125382c);
        return (InterfaceC26396e) m131217q0;
    }

    /* renamed from: D */
    public final synchronized List m136041D(int i11) {
        List m131180H0;
        List m131225y0;
        List m131502j;
        List m131502j2;
        if (!m136049O()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        if (this.f125382c.size() < i11) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        m131180H0 = AbstractC25332a0.m131180H0(this.f125382c, i11);
        m131225y0 = AbstractC25332a0.m131225y0(m131180H0);
        return m131225y0;
    }

    /* renamed from: E */
    public final C26393b m136042E() {
        C26393b c26393b = (C26393b) this.f125383d.m138656r();
        if (c26393b == null) {
            return null;
        }
        if (c26393b.m136007g() + c26393b.m136016p() != this.f125387h.m138636b()) {
            c26393b = null;
        }
        return c26393b;
    }

    /* renamed from: F */
    public final int m136043F() {
        return this.f125384e;
    }

    /* renamed from: H */
    public final synchronized void m136044H() {
        this.f125384e++;
    }

    /* renamed from: K */
    public final synchronized boolean m136045K() {
        if (m136047M()) {
            return true;
        }
        if (this.f125381b.m138633a() == ((Number) this.f125383d.m138644b()).intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final synchronized boolean m136046L() {
        if (m136047M()) {
            return true;
        }
        return AbstractC19074t.m100204b(m136076v(), m136042E());
    }

    /* renamed from: M */
    public final synchronized boolean m136047M() {
        boolean z11;
        if (m136068l0() != 0) {
            if (!this.f125383d.isEmpty()) {
                z11 = false;
            }
        }
        z11 = true;
        return z11;
    }

    /* renamed from: N */
    public final boolean m136048N() {
        return this.f125385f;
    }

    /* renamed from: O */
    public final synchronized boolean m136049O() {
        boolean z11;
        if (m136047M()) {
            return this.f125387h.m138638d();
        }
        if (m136042E() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    /* renamed from: Q */
    public final synchronized void m136050Q() {
        Iterator it = this.f125383d.values().iterator();
        C26393b c26393b = null;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C26393b c26393b2 = (C26393b) next;
            if (c26393b != null && c26393b.m136003c() + 1 == c26393b2.m136007g()) {
                c26393b.m136015o(c26393b.m136009i() + c26393b2.m136009i());
                it.remove();
                if (c26393b2.m136007g() == this.f125381b.m138633a()) {
                    m136059b0(c26393b.m136007g());
                }
            }
            c26393b = c26393b2;
        }
    }

    /* renamed from: R */
    public final synchronized void m136051R() {
        if (m136047M()) {
            return;
        }
        m136059b0(((Number) this.f125383d.m138655q()).intValue());
    }

    /* renamed from: S */
    public final synchronized int m136052S(InterfaceC18505l interfaceC18505l) {
        int i11;
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        int m136054V = m136054V(interfaceC18505l);
        if (m136054V != -1) {
            i11 = m136021U(m136054V);
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return i11;
    }

    /* renamed from: T */
    public final int m136053T(InterfaceC26392a interfaceC26392a) {
        AbstractC19074t.m100208f(interfaceC26392a, "item");
        if (interfaceC26392a instanceof InterfaceC26396e) {
            return m136052S(new d(interfaceC26392a));
        }
        return m136052S(new e(interfaceC26392a));
    }

    /* renamed from: V */
    public final synchronized int m136054V(InterfaceC18505l interfaceC18505l) {
        int i11;
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        Iterator it = this.f125382c.iterator();
        i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Boolean) interfaceC18505l.mo205i9(it.next())).booleanValue()) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return i11;
    }

    /* renamed from: W */
    public final int m136055W(InterfaceC26396e interfaceC26396e) {
        AbstractC19074t.m100208f(interfaceC26396e, "item");
        return m136054V(new g(interfaceC26396e));
    }

    /* renamed from: Y */
    public final synchronized void m136056Y() {
        int m116580c;
        AbstractC26902d.m138659a("PagedList", "refreshPages()");
        this.f125383d.clear();
        m116580c = AbstractC22543l.m116580c(this.f125387h.m138636b() - (m136068l0() - this.f125384e), 0);
        m136059b0(m116580c);
        if (!this.f125382c.isEmpty()) {
            m136028g(m116580c, 0, m136068l0());
            AbstractC26902d.m138659a("PagedList", "refreshPages(): Add new page at " + m116580c + ", with " + m136068l0() + " items");
        }
    }

    /* renamed from: Z */
    public synchronized InterfaceC26396e mo17960Z(InterfaceC26396e interfaceC26396e) {
        AbstractC19074t.m100208f(interfaceC26396e, "item");
        int m136055W = m136055W(interfaceC26396e);
        if (m136055W == -1) {
            return null;
        }
        InterfaceC26396e interfaceC26396e2 = (InterfaceC26396e) this.f125382c.remove(m136055W);
        int m136021U = m136021U(m136055W);
        m136035o(m136021U);
        m136029g0(m136021U, -1);
        m136050Q();
        return interfaceC26396e2;
    }

    /* renamed from: a0 */
    public final synchronized void m136057a0(int i11) {
        if (i11 == Integer.MIN_VALUE) {
            return;
        }
        try {
            int m136022X = m136022X(i11);
            if (m136022X != -1) {
                this.f125382c.remove(m136022X);
                m136035o(((Number) this.f125383d.m138645c(Integer.valueOf(i11))).intValue());
                m136029g0(i11, -1);
            } else {
                m136026e0(i11, -1);
                this.f125387h.m138635a();
            }
            m136050Q();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public final synchronized boolean m136058b(InterfaceC26396e interfaceC26396e, boolean z11) {
        AbstractC19074t.m100208f(interfaceC26396e, "item");
        if (m136047M()) {
            this.f125382c.add(interfaceC26396e);
            m136023a(z11);
            return true;
        }
        int m136037q = m136037q(interfaceC26396e);
        if (m136030h(m136037q)) {
            this.f125382c.add(m136037q, interfaceC26396e);
            m136018I(((Number) this.f125383d.m138655q()).intValue(), z11);
            return true;
        }
        C24860q m136036p = m136036p(m136037q);
        int intValue = ((Number) m136036p.m129213a()).intValue();
        int intValue2 = ((Number) m136036p.m129214b()).intValue();
        if (intValue != Integer.MIN_VALUE) {
            this.f125382c.add(m136037q, interfaceC26396e);
            m136018I(intValue2, z11);
            m136029g0(intValue, 1);
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addItemInternal(");
        sb2.append(interfaceC26396e);
        sb2.append("): Not added.");
        int m136017G = m136017G(m136037q);
        if (m136017G != Integer.MIN_VALUE) {
            m136026e0(m136017G, 1);
        }
        if (z11) {
            this.f125387h.m138637c();
        }
        return false;
    }

    /* renamed from: b0 */
    public final void m136059b0(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setCurrentPageIndex(");
        sb2.append(i11);
        sb2.append(")");
        this.f125381b.m138634b(i11);
    }

    /* renamed from: c0 */
    public final void m136060c0(boolean z11) {
        this.f125385f = z11;
    }

    /* renamed from: d */
    public synchronized void mo17962d(InterfaceC26396e interfaceC26396e, boolean z11) {
        try {
            AbstractC19074t.m100208f(interfaceC26396e, "item");
            this.f125382c.add(0, interfaceC26396e);
            if (m136047M()) {
                m136023a(z11);
            } else {
                m136019J(this, ((Number) this.f125383d.m138644b()).intValue(), false, 2, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d0 */
    public final synchronized void m136061d0(List list) {
        try {
            AbstractC19074t.m100208f(list, "items");
            if (list.isEmpty()) {
                return;
            }
            m136069m();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f125382c.add(i11, (InterfaceC26396e) list.get(i11));
                this.f125387h.m138637c();
            }
            m136056Y();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public final synchronized void m136062f(int i11, List list) {
        try {
            AbstractC19074t.m100208f(list, "items");
            if (list.isEmpty()) {
                return;
            }
            if (!this.f125387h.m138638d()) {
                return;
            }
            C26393b c26393b = (C26393b) this.f125383d.m138646e(Integer.valueOf(i11));
            C26393b c26393b2 = (C26393b) this.f125383d.m138654p(Integer.valueOf(i11));
            int i12 = 0;
            if (c26393b != null && c26393b2 != null) {
                int m136007g = c26393b.m136007g() + c26393b.m136009i();
                if (m136007g < i11 && list.size() + i11 < c26393b2.m136007g()) {
                    m136028g(i11, c26393b2.m136008h(), list.size());
                    int size = list.size();
                    while (i12 < size) {
                        this.f125382c.add(c26393b2.m136008h() + i12, list.get(i12));
                        i12++;
                    }
                    m136027f0(i11, list.size());
                    m136059b0(i11);
                } else if (m136007g >= i11 && list.size() + i11 >= c26393b2.m136007g()) {
                    int i13 = m136007g - i11;
                    int m136007g2 = c26393b2.m136007g() - i11;
                    if (i13 < list.size() && m136007g2 > 0 && m136007g2 <= list.size()) {
                        List subList = list.subList(i13, m136007g2);
                        c26393b.m136015o(c26393b.m136009i() + subList.size() + c26393b2.m136009i());
                        this.f125383d.remove(Integer.valueOf(c26393b2.m136007g()));
                        int size2 = subList.size();
                        while (i12 < size2) {
                            this.f125382c.add(c26393b2.m136008h() + i12, subList.get(i12));
                            i12++;
                        }
                        m136027f0(i11, subList.size());
                    }
                    m136059b0(c26393b.m136007g());
                } else if (m136007g >= i11) {
                    int i14 = m136007g - i11;
                    if (i14 < list.size()) {
                        List subList2 = list.subList(i14, list.size());
                        c26393b.m136015o(c26393b.m136009i() + subList2.size());
                        int size3 = subList2.size();
                        while (i12 < size3) {
                            this.f125382c.add(c26393b2.m136008h() + i12, subList2.get(i12));
                            i12++;
                        }
                        m136027f0(i11, subList2.size());
                    }
                    m136059b0(c26393b.m136007g());
                } else {
                    int m136007g3 = c26393b2.m136007g() - i11;
                    if (m136007g3 > 0 && m136007g3 <= list.size()) {
                        List subList3 = list.subList(0, m136007g3);
                        m136028g(i11, c26393b2.m136008h(), subList3.size() + c26393b2.m136009i());
                        this.f125383d.remove(Integer.valueOf(c26393b2.m136007g()));
                        int size4 = subList3.size();
                        while (i12 < size4) {
                            this.f125382c.add(c26393b2.m136008h() + i12, subList3.get(i12));
                            i12++;
                        }
                        m136027f0(i11, subList3.size());
                    }
                    m136059b0(i11);
                }
            } else if (c26393b != null) {
                int m136007g4 = c26393b.m136007g() + c26393b.m136009i();
                if (m136007g4 < i11) {
                    m136028g(i11, m136068l0(), list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f125382c.add((InterfaceC26396e) it.next());
                    }
                    m136059b0(i11);
                } else {
                    int i15 = m136007g4 - i11;
                    if (i15 < list.size()) {
                        List subList4 = list.subList(i15, list.size());
                        c26393b.m136015o(c26393b.m136009i() + subList4.size());
                        int size5 = subList4.size();
                        while (i12 < size5) {
                            this.f125382c.add(subList4.get(i12));
                            i12++;
                        }
                    }
                    m136059b0(c26393b.m136007g());
                }
            } else if (c26393b2 != null) {
                if (list.size() + i11 < c26393b2.m136007g()) {
                    m136028g(i11, 0, list.size());
                    int size6 = list.size();
                    while (i12 < size6) {
                        this.f125382c.add(i12, list.get(i12));
                        i12++;
                    }
                    m136027f0(i11, list.size());
                    m136059b0(i11);
                } else {
                    int m136007g5 = c26393b2.m136007g() - i11;
                    if (m136007g5 > 0 && m136007g5 <= list.size()) {
                        List subList5 = list.subList(0, m136007g5);
                        m136028g(i11, 0, subList5.size() + c26393b2.m136009i());
                        this.f125383d.remove(Integer.valueOf(c26393b2.m136007g()));
                        int size7 = subList5.size();
                        while (i12 < size7) {
                            this.f125382c.add(i12, subList5.get(i12));
                            i12++;
                        }
                        m136027f0(i11, subList5.size());
                    }
                    m136059b0(i11);
                }
            } else {
                m136028g(i11, 0, list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    this.f125382c.add((InterfaceC26396e) it2.next());
                }
                m136059b0(i11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h0 */
    public final synchronized void m136063h0(InterfaceC26396e interfaceC26396e) {
        try {
            AbstractC19074t.m100208f(interfaceC26396e, "pivotItem");
            int m136037q = m136037q(interfaceC26396e);
            m136034m0(m136037q);
            int m136017G = m136017G(m136037q);
            if (m136017G != Integer.MIN_VALUE) {
                m136026e0(m136017G, 1);
            }
            this.f125387h.m138637c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i0 */
    protected final synchronized InterfaceC26396e m136064i0() {
        Object m131205e0;
        InterfaceC26396e mo17960Z;
        try {
            if (m136047M()) {
                return null;
            }
            if (!this.f125386g) {
                m131205e0 = AbstractC25332a0.m131205e0(this.f125382c);
                mo17960Z = mo17960Z((InterfaceC26396e) m131205e0);
            } else {
                mo17960Z = (InterfaceC26396e) this.f125382c.remove(0);
                m136035o(((Number) this.f125383d.m138644b()).intValue());
            }
            return mo17960Z;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    public final boolean m136065k(boolean z11) {
        if (z11) {
            return m136067l();
        }
        return m136032j();
    }

    /* renamed from: k0 */
    public final synchronized void m136066k0(InterfaceC18505l interfaceC18505l) {
        try {
            AbstractC19074t.m100208f(interfaceC18505l, "block");
            if (m136047M()) {
                return;
            }
            AbstractC26902d.m138659a("PagedList", "shrinkToLastPage()");
            C26393b m136042E = m136042E();
            if (m136042E != null) {
                m136033j0(m136042E.m136009i(), interfaceC18505l);
            }
            m136056Y();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public final boolean m136067l() {
        if (!this.f125387h.m138638d() || this.f125381b.m138633a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    public final synchronized int m136068l0() {
        return this.f125382c.size();
    }

    /* renamed from: m */
    public final synchronized void m136069m() {
        AbstractC26902d.m138659a("PagedList", "clear()");
        this.f125382c.clear();
        this.f125383d.clear();
        this.f125381b.m138634b(0);
        this.f125387h.m138641g();
        this.f125385f = false;
        this.f125384e = 0;
    }

    /* renamed from: n */
    public final synchronized void m136070n() {
        int i11 = this.f125384e;
        this.f125384e = i11 - 1;
        AbstractC22543l.m116580c(i11, 0);
    }

    /* renamed from: n0 */
    public final void m136071n0(int i11) {
        AbstractC26902d.m138659a("PagedList", "updateDBRowCount(" + i11 + ")");
        this.f125387h.m138642h(i11);
    }

    /* renamed from: r */
    public final synchronized InterfaceC26396e m136072r(InterfaceC18505l interfaceC18505l) {
        Object obj;
        try {
            AbstractC19074t.m100208f(interfaceC18505l, "predicate");
            Iterator it = this.f125382c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Boolean) interfaceC18505l.mo205i9(obj)).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC26396e) obj;
    }

    /* renamed from: s */
    public final InterfaceC26396e m136073s(InterfaceC26392a interfaceC26392a) {
        AbstractC19074t.m100208f(interfaceC26392a, "item");
        if (interfaceC26392a instanceof InterfaceC26396e) {
            return m136072r(new b(interfaceC26392a));
        }
        return m136072r(new c(interfaceC26392a));
    }

    /* renamed from: t */
    public final synchronized InterfaceC26396e m136074t(InterfaceC18505l interfaceC18505l) {
        Object obj;
        try {
            AbstractC19074t.m100208f(interfaceC18505l, "predicate");
            List list = this.f125382c;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((Boolean) interfaceC18505l.mo205i9(obj)).booleanValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC26396e) obj;
    }

    public String toString() {
        if (m136047M()) {
            return "PagedList{id=" + this.f125380a + ", isInitialLoaded=" + this.f125385f + "}";
        }
        return "PagedList{id=" + this.f125380a + ", isInitialLoaded=" + this.f125385f + ", dbRowCount=" + this.f125387h + ", itemListSize=" + this.f125382c.size() + ", currentIndex=" + this.f125381b + ", pageMaps=" + this.f125383d + "}";
    }

    /* renamed from: u */
    public final synchronized void m136075u(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        Iterator it = this.f125382c.iterator();
        while (it.hasNext()) {
            interfaceC18505l.mo205i9(it.next());
        }
    }

    /* renamed from: v */
    public final synchronized C26393b m136076v() {
        return (C26393b) this.f125383d.get(Integer.valueOf(this.f125381b.m138633a()));
    }

    /* renamed from: w */
    public final int m136077w() {
        return this.f125381b.m138633a();
    }

    /* renamed from: x */
    public final int m136078x() {
        return this.f125387h.m138636b();
    }

    /* renamed from: y */
    public final C26900b m136079y() {
        return this.f125387h;
    }

    /* renamed from: z */
    public final synchronized InterfaceC26396e m136080z() {
        Object m131206f0;
        m131206f0 = AbstractC25332a0.m131206f0(this.f125382c);
        return (InterfaceC26396e) m131206f0;
    }
}
