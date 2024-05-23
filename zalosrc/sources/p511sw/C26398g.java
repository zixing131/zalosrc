package p511sw;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import mm0.AbstractC23350e;
import p511sw.InterfaceC26395d;
import pm0.C24848g0;
import qm0.AbstractC25380y;
import tw.AbstractC26902d;

/* renamed from: sw.g */
/* loaded from: classes.dex */
public final class C26398g implements InterfaceC26395d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC26397f f125402a;

    /* renamed from: sw.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sw.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final int f125403a;

        /* renamed from: b */
        private final int f125404b;

        /* renamed from: sw.g$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m136116a(int i11, int i12) {
                return new b(i11, i12);
            }
        }

        public b(int i11, int i12) {
            this.f125403a = i11;
            this.f125404b = i12;
        }

        /* renamed from: a */
        public final int m136114a() {
            return this.f125403a;
        }

        /* renamed from: b */
        public final int m136115b() {
            return this.f125404b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f125403a == bVar.f125403a && this.f125404b == bVar.f125404b;
        }

        public int hashCode() {
            return (this.f125403a * 31) + this.f125404b;
        }

        public String toString() {
            return "DBParams(fromIndex=" + this.f125403a + ", loadSize=" + this.f125404b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sw.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC26392a f125405q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC26392a interfaceC26392a) {
            super(1);
            this.f125405q = interfaceC26392a;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(InterfaceC26396e interfaceC26396e) {
            boolean z11;
            AbstractC19074t.m100208f(interfaceC26396e, "it");
            if (interfaceC26396e.mo95213o() >= this.f125405q.mo95213o()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C26398g(InterfaceC26397f interfaceC26397f) {
        AbstractC19074t.m100208f(interfaceC26397f, "source");
        this.f125402a = interfaceC26397f;
    }

    /* renamed from: e */
    private final void m136102e(C26394c c26394c, boolean z11, InterfaceC18505l interfaceC18505l) {
        C26393b m136076v = c26394c.m136076v();
        if (m136076v == null || m136076v.m136010j()) {
            return;
        }
        if (z11) {
            InterfaceC26396e m136004d = m136076v.m136004d();
            long mo95204n = m136004d.mo95204n();
            if (mo95204n != -1) {
                int m136016p = m136076v.m136016p();
                int i11 = 0;
                for (int i12 = 0; i12 < m136016p && m136076v.m136006f(i12).mo95204n() != -1 && m136076v.m136006f(i12).mo95204n() == mo95204n; i12++) {
                    i11++;
                }
                if (i11 < m136004d.mo95126f()) {
                    m136111o(c26394c, m136076v, m136004d, i11, interfaceC18505l);
                    return;
                }
                return;
            }
            return;
        }
        if (!c26394c.m136046L()) {
            InterfaceC26396e m136012l = m136076v.m136012l();
            long mo95204n2 = m136012l.mo95204n();
            if (mo95204n2 != -1) {
                int i13 = 0;
                for (int m136016p2 = m136076v.m136016p() - 1; -1 < m136016p2 && m136076v.m136006f(m136016p2).mo95204n() != -1 && m136076v.m136006f(m136016p2).mo95204n() == mo95204n2; m136016p2--) {
                    i13++;
                }
                if (i13 < m136012l.mo95126f()) {
                    m136108l(c26394c, m136076v, m136012l, i13, interfaceC18505l);
                }
            }
        }
    }

    /* renamed from: g */
    private final b m136103g(InterfaceC26395d.b.a aVar) {
        int m116580c;
        InterfaceC26392a m136096c = aVar.m136096c();
        int mo2656c = this.f125402a.mo2656c(m136096c);
        if (mo2656c == Integer.MIN_VALUE && !aVar.m136095b()) {
            mo2656c = this.f125402a.mo2657d(m136096c);
        }
        if (mo2656c == Integer.MIN_VALUE) {
            return null;
        }
        int m136094a = aVar.m136094a();
        m116580c = AbstractC22543l.m116580c(mo2656c - (m136094a / 4), 0);
        return b.Companion.m136116a(m116580c, m136094a);
    }

    /* renamed from: h */
    private final b m136104h(C26394c c26394c, InterfaceC26395d.b.d dVar) {
        int m116584g;
        C26393b m136076v = c26394c.m136076v();
        if (m136076v == null) {
            return null;
        }
        int m136003c = m136076v.m136003c() + 1;
        int m136094a = dVar.m136094a();
        if (m136003c >= 0) {
            m116584g = AbstractC22543l.m116584g(m136003c, c26394c.m136079y().m138636b());
            return b.Companion.m136116a(m116584g, m136094a);
        }
        return null;
    }

    /* renamed from: i */
    private final b m136105i(C26394c c26394c, InterfaceC26395d.b.d dVar) {
        m136113f(c26394c);
        if (dVar.m136098b()) {
            return m136106j(c26394c, dVar);
        }
        return m136104h(c26394c, dVar);
    }

    /* renamed from: j */
    private final b m136106j(C26394c c26394c, InterfaceC26395d.b.d dVar) {
        int m116580c;
        int m136094a = dVar.m136094a();
        int m136077w = c26394c.m136077w();
        if (m136077w > 0) {
            m116580c = AbstractC22543l.m116580c(m136077w - m136094a, 0);
            return b.Companion.m136116a(m116580c, m136077w - m116580c);
        }
        return null;
    }

    /* renamed from: k */
    private final List m136107k(C26394c c26394c, b bVar, InterfaceC18505l interfaceC18505l) {
        List m131559M;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadAroundInternal(");
        sb2.append(bVar);
        sb2.append(")");
        int m136114a = bVar.m136114a();
        List mo2658e = this.f125402a.mo2658e(c26394c.m136038A(), m136114a, bVar.m136115b());
        m131559M = AbstractC25380y.m131559M(mo2658e);
        Iterator it = m131559M.iterator();
        while (it.hasNext()) {
            interfaceC18505l.mo205i9((InterfaceC26396e) it.next());
        }
        m136113f(c26394c);
        c26394c.m136062f(m136114a, mo2658e);
        return mo2658e;
    }

    /* renamed from: l */
    private final void m136108l(C26394c c26394c, C26393b c26393b, InterfaceC26396e interfaceC26396e, int i11, InterfaceC18505l interfaceC18505l) {
        int m116584g;
        AbstractC26902d.m138659a("PositionalPager", "loadBottomMediaGroup(" + c26394c + "): Total size: " + interfaceC26396e.mo95126f() + ", current: " + i11);
        m136113f(c26394c);
        m116584g = AbstractC22543l.m116584g(c26393b.m136003c() + 1, c26394c.m136079y().m138636b());
        List mo2658e = this.f125402a.mo2658e(c26394c.m136038A(), m116584g, interfaceC26396e.mo95126f() - i11);
        if (!mo2658e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = mo2658e.size();
            for (int i12 = 0; i12 < size && ((InterfaceC26396e) mo2658e.get(i12)).mo95204n() != -1 && ((InterfaceC26396e) mo2658e.get(i12)).mo95204n() == interfaceC26396e.mo95204n(); i12++) {
                arrayList.add(mo2658e.get(i12));
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    interfaceC18505l.mo205i9((InterfaceC26396e) it.next());
                }
                c26394c.m136062f(m116584g, arrayList);
            }
        }
    }

    /* renamed from: m */
    private final List m136109m(C26394c c26394c, InterfaceC26395d.b.c cVar) {
        return this.f125402a.mo2655b(c26394c.m136038A(), c26394c.m136068l0() - c26394c.m136043F(), cVar.m136094a());
    }

    /* renamed from: n */
    private final List m136110n(C26394c c26394c, b bVar, InterfaceC18505l interfaceC18505l) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadMoreInternal(");
        sb2.append(bVar);
        sb2.append(")");
        String m136038A = c26394c.m136038A();
        int m136114a = bVar.m136114a();
        List mo2658e = this.f125402a.mo2658e(m136038A, m136114a, bVar.m136115b());
        Iterator it = mo2658e.iterator();
        while (it.hasNext()) {
            interfaceC18505l.mo205i9((InterfaceC26396e) it.next());
        }
        c26394c.m136062f(m136114a, mo2658e);
        return mo2658e;
    }

    /* renamed from: o */
    private final void m136111o(C26394c c26394c, C26393b c26393b, InterfaceC26396e interfaceC26396e, int i11, InterfaceC18505l interfaceC18505l) {
        int m116580c;
        AbstractC26902d.m138659a("PositionalPager", "loadTopMediaGroup(" + c26394c + "): Total size: " + interfaceC26396e.mo95126f() + ", current: " + i11);
        m136113f(c26394c);
        int m136007g = c26393b.m136007g();
        m116580c = AbstractC22543l.m116580c(m136007g - i11, 0);
        int i12 = m136007g - m116580c;
        if (i12 > 0) {
            List mo2658e = this.f125402a.mo2658e(c26394c.m136038A(), m116580c, i12);
            if (!mo2658e.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = mo2658e.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i13 = size - 1;
                        if (((InterfaceC26396e) mo2658e.get(size)).mo95204n() == -1 || ((InterfaceC26396e) mo2658e.get(size)).mo95204n() != interfaceC26396e.mo95204n()) {
                            break;
                        }
                        arrayList.add(0, mo2658e.get(size));
                        if (i13 < 0) {
                            break;
                        } else {
                            size = i13;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        interfaceC18505l.mo205i9((InterfaceC26396e) it.next());
                    }
                    c26394c.m136062f(m136007g - arrayList.size(), arrayList);
                }
            }
        }
    }

    /* renamed from: p */
    private final int m136112p(C26394c c26394c, InterfaceC26392a interfaceC26392a) {
        if (!c26394c.m136079y().m138638d()) {
            return Integer.MIN_VALUE;
        }
        return c26394c.m136053T(interfaceC26392a);
    }

    @Override // p511sw.InterfaceC26395d
    /* renamed from: a */
    public void mo136089a(C26394c c26394c, InterfaceC26395d.b.C32974b c32974b, InterfaceC26395d.a aVar, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c26394c, "pagedList");
        AbstractC19074t.m100208f(c32974b, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        AbstractC26902d.m138659a("PositionalPager", "loadBottom(" + c26394c + ", " + c32974b + ")");
        try {
            if (c26394c.m136042E() != null) {
                c26394c.m136051R();
                if (aVar != null) {
                    aVar.mo64203a(new InterfaceC26395d.c.b(c26394c));
                    return;
                }
                return;
            }
            List mo2655b = this.f125402a.mo2655b(c26394c.m136038A(), 0, c32974b.m136094a());
            Iterator it = mo2655b.iterator();
            while (it.hasNext()) {
                interfaceC18505l.mo205i9((InterfaceC26396e) it.next());
            }
            c26394c.m136062f(c26394c.m136079y().m138636b() - mo2655b.size(), mo2655b);
            m136102e(c26394c, true, interfaceC18505l);
            if (aVar != null) {
                aVar.mo64203a(new InterfaceC26395d.c.b(c26394c));
            }
        } catch (Exception e11) {
            if (aVar != null) {
                aVar.mo64205c(new InterfaceC26395d.c.a(e11));
            }
            AbstractC23350e.m122776f("PositionalPager", e11);
        }
    }

    @Override // p511sw.InterfaceC26395d
    /* renamed from: b */
    public void mo136090b(C26394c c26394c, InterfaceC26395d.b.a aVar, InterfaceC26395d.a aVar2, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c26394c, "pagedList");
        AbstractC19074t.m100208f(aVar, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        AbstractC26902d.m138659a("PositionalPager", "loadAround(" + c26394c + ", " + aVar + ")");
        InterfaceC26392a m136096c = aVar.m136096c();
        int m136112p = m136112p(c26394c, m136096c);
        if (m136112p != Integer.MIN_VALUE) {
            c26394c.m136059b0(m136112p);
            InterfaceC26396e m136073s = c26394c.m136073s(m136096c);
            if (aVar2 != null) {
                aVar2.mo64203a(new InterfaceC26395d.c.b(c26394c, m136073s));
                return;
            }
            return;
        }
        try {
            if (m136103g(aVar) == null) {
                if (aVar2 != null) {
                    aVar2.mo64204b();
                    return;
                }
                return;
            }
            if (!m136107k(c26394c, r2, interfaceC18505l).isEmpty()) {
                m136102e(c26394c, true, interfaceC18505l);
                m136102e(c26394c, false, interfaceC18505l);
                InterfaceC26396e m136073s2 = c26394c.m136073s(m136096c);
                if (m136073s2 == null) {
                    if (!aVar.m136095b()) {
                        m136073s2 = c26394c.m136072r(new c(m136096c));
                    } else {
                        m136073s2 = null;
                    }
                }
                if (aVar2 != null) {
                    aVar2.mo64203a(new InterfaceC26395d.c.b(c26394c, m136073s2));
                    return;
                }
                return;
            }
            if (aVar2 != null) {
                aVar2.mo64204b();
            }
        } catch (Exception e11) {
            if (aVar2 != null) {
                aVar2.mo64205c(new InterfaceC26395d.c.a(e11));
            }
            AbstractC23350e.m122776f("PositionalPager", e11);
        }
    }

    @Override // p511sw.InterfaceC26395d
    /* renamed from: c */
    public void mo136091c(C26394c c26394c, InterfaceC26395d.b.c cVar, InterfaceC26395d.a aVar, InterfaceC18505l interfaceC18505l) {
        List<InterfaceC26396e> m131559M;
        AbstractC19074t.m100208f(c26394c, "pagedList");
        AbstractC19074t.m100208f(cVar, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        AbstractC26902d.m138659a("PositionalPager", "loadInitial(" + c26394c + ", " + cVar + ")");
        if (!c26394c.m136048N() || !c26394c.m136049O()) {
            c26394c.m136069m();
        }
        InterfaceC26392a m136097b = cVar.m136097b();
        int m136094a = cVar.m136094a();
        if (m136097b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadInitial(). Have target item: ");
            sb2.append(m136097b);
            mo136090b(c26394c, new InterfaceC26395d.b.a(m136097b, m136094a, false), aVar, interfaceC18505l);
            c26394c.m136060c0(true);
            return;
        }
        if (c26394c.m136048N()) {
            if (aVar != null) {
                aVar.mo64203a(new InterfaceC26395d.c.b(c26394c));
                return;
            }
            return;
        }
        try {
            List m136109m = m136109m(c26394c, cVar);
            if (!m136109m.isEmpty()) {
                m131559M = AbstractC25380y.m131559M(m136109m);
                for (InterfaceC26396e interfaceC26396e : m131559M) {
                    C26394c.m136025e(c26394c, interfaceC26396e, false, 2, null);
                    interfaceC18505l.mo205i9(interfaceC26396e);
                }
                if (m136109m.size() < m136094a) {
                    synchronized (c26394c) {
                        c26394c.m136079y().m138640f();
                        c26394c.m136056Y();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } else {
                    m136102e(c26394c, true, interfaceC18505l);
                }
                if (aVar != null) {
                    aVar.mo64203a(new InterfaceC26395d.c.b(c26394c));
                }
            } else {
                c26394c.m136079y().m138640f();
                if (aVar != null) {
                    aVar.mo64204b();
                }
            }
            c26394c.m136060c0(true);
        } catch (Exception e11) {
            if (aVar != null) {
                aVar.mo64205c(new InterfaceC26395d.c.a(e11));
            }
            AbstractC23350e.m122776f("PositionalPager", e11);
        }
    }

    @Override // p511sw.InterfaceC26395d
    /* renamed from: d */
    public void mo136092d(C26394c c26394c, InterfaceC26395d.b.d dVar, InterfaceC26395d.a aVar, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c26394c, "pagedList");
        AbstractC19074t.m100208f(dVar, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        AbstractC26902d.m138659a("PositionalPager", "loadMore(" + c26394c + ", " + dVar + ")");
        b m136105i = m136105i(c26394c, dVar);
        if (m136105i == null) {
            if (aVar != null) {
                aVar.mo64204b();
                return;
            }
            return;
        }
        try {
            m136110n(c26394c, m136105i, interfaceC18505l);
            m136102e(c26394c, dVar.m136098b(), interfaceC18505l);
            if (aVar != null) {
                aVar.mo64203a(new InterfaceC26395d.c.b(c26394c));
            }
        } catch (Exception e11) {
            if (aVar != null) {
                aVar.mo64205c(new InterfaceC26395d.c.a(e11));
            }
            AbstractC23350e.m122776f("PositionalPager", e11);
        }
    }

    /* renamed from: f */
    public final void m136113f(C26394c c26394c) {
        AbstractC19074t.m100208f(c26394c, "pagedList");
        if (c26394c.m136079y().m138638d()) {
            return;
        }
        int mo2654a = this.f125402a.mo2654a(c26394c.m136038A());
        if (mo2654a >= 0) {
            synchronized (c26394c) {
                c26394c.m136071n0(mo2654a);
                c26394c.m136056Y();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            return;
        }
        throw new IllegalStateException("Invalid DB row count!");
    }
}
