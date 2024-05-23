package p398oo;

import bo.C3000l0;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: oo.i */
/* loaded from: classes4.dex */
public final class C24362i {

    /* renamed from: a */
    private final int f117596a;

    /* renamed from: b */
    private final InterfaceC24368l f117597b;

    /* renamed from: c */
    private final InterfaceC24364j f117598c;

    /* renamed from: d */
    private CoroutineScope f117599d;

    /* renamed from: e */
    private boolean f117600e;

    /* renamed from: f */
    private boolean f117601f;

    /* renamed from: g */
    private boolean f117602g;

    /* renamed from: oo.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f117603s;

        /* renamed from: t */
        Object f117604t;

        /* renamed from: u */
        /* synthetic */ Object f117605u;

        /* renamed from: w */
        int f117607w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117605u = obj;
            this.f117607w |= Integer.MIN_VALUE;
            return C24362i.this.m127401h(this);
        }
    }

    /* renamed from: oo.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f117608s;

        /* renamed from: t */
        /* synthetic */ Object f117609t;

        /* renamed from: v */
        int f117611v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117609t = obj;
            this.f117611v |= Integer.MIN_VALUE;
            return C24362i.this.m127409p(this);
        }
    }

    /* renamed from: oo.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f117612s;

        /* renamed from: t */
        Object f117613t;

        /* renamed from: u */
        /* synthetic */ Object f117614u;

        /* renamed from: w */
        int f117616w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117614u = obj;
            this.f117616w |= Integer.MIN_VALUE;
            return C24362i.this.m127415v(this);
        }
    }

    /* renamed from: oo.i$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f117617s;

        /* renamed from: t */
        Object f117618t;

        /* renamed from: u */
        /* synthetic */ Object f117619u;

        /* renamed from: w */
        int f117621w;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117619u = obj;
            this.f117621w |= Integer.MIN_VALUE;
            return C24362i.this.m127416w(this);
        }
    }

    /* renamed from: oo.i$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f117623r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f117623r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "[MANAGER]Tab " + C24362i.this.m127406m() + " : " + this.f117623r;
        }
    }

    /* renamed from: oo.i$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f117624s;

        /* renamed from: t */
        /* synthetic */ Object f117625t;

        /* renamed from: v */
        int f117627v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117625t = obj;
            this.f117627v |= Integer.MIN_VALUE;
            return C24362i.this.m127417y(null, null, this);
        }
    }

    /* renamed from: oo.i$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117628t;

        /* renamed from: v */
        final /* synthetic */ C3000l0 f117630v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3000l0 c3000l0, Continuation continuation) {
            super(2, continuation);
            this.f117630v = c3000l0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f117630v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117628t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC24364j interfaceC24364j = C24362i.this.f117598c;
                C3000l0 c3000l0 = this.f117630v;
                this.f117628t = 1;
                if (interfaceC24364j.mo127256g(c3000l0, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24362i(int i11, InterfaceC24368l interfaceC24368l, InterfaceC24364j interfaceC24364j, CoroutineScope coroutineScope) {
        AbstractC19074t.m100208f(interfaceC24368l, "remoteSource");
        AbstractC19074t.m100208f(interfaceC24364j, "cacheSource");
        AbstractC19074t.m100208f(coroutineScope, "uiScope");
        this.f117596a = i11;
        this.f117597b = interfaceC24368l;
        this.f117598c = interfaceC24364j;
        this.f117599d = coroutineScope;
    }

    /* renamed from: x */
    private final void m127390x(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "FEED_TAB_MANAGER", new e(str));
    }

    /* renamed from: A */
    public final void m127391A(String str) {
        AbstractC19074t.m100208f(str, "userId");
        this.f117598c.mo127268s(str);
    }

    /* renamed from: B */
    public final void m127392B() {
        this.f117598c.mo127260k();
    }

    /* renamed from: C */
    public final void m127393C(C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c3000l0, "feed");
        BuildersKt__Builders_commonKt.m112540d(this.f117599d, null, null, new g(c3000l0, null), 3, null);
    }

    /* renamed from: D */
    public final boolean m127394D(List list, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "fids");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        return this.f117598c.mo127261l(list, interfaceC18509p);
    }

    /* renamed from: b */
    public final void m127395b(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "feedId");
        this.f117598c.mo127254e(str, z11);
    }

    /* renamed from: c */
    public final Object m127396c(List list, Continuation continuation) {
        Object m142578e;
        Object mo127263n = this.f117598c.mo127263n(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo127263n == m142578e) {
            return mo127263n;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    public final void m127397d() {
        Iterator it = this.f117598c.mo127267r().iterator();
        while (it.hasNext()) {
            ((C3000l0) it.next()).m14370w();
        }
    }

    /* renamed from: e */
    public final Object m127398e(Continuation continuation) {
        Object m142578e;
        Object mo127251b = this.f117598c.mo127251b(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo127251b == m142578e) {
            return mo127251b;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public final void m127399f() {
        this.f117598c.mo127250a();
    }

    /* renamed from: g */
    public final void m127400g(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "fids");
        this.f117598c.mo127265p(list, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127401h(Continuation continuation) {
        a aVar;
        Object obj;
        Object m142578e;
        int i11;
        C24362i c24362i;
        C24362i c24362i2;
        C24362i c24362i3;
        InterfaceC24364j interfaceC24364j;
        Object m129218b;
        Throwable m129221e;
        Throwable th2;
        C24362i c24362i4;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f117607w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f117607w = i12 - Integer.MIN_VALUE;
                obj = aVar.f117605u;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f117607w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th2 = (Throwable) aVar.f117604t;
                            c24362i4 = (C24362i) aVar.f117603s;
                            AbstractC24862s.m129228b(obj);
                            c24362i = c24362i4;
                            m129221e = th2;
                            c24362i.f117600e = false;
                            throw m129221e;
                        }
                        c24362i2 = (C24362i) aVar.f117604t;
                        c24362i = (C24362i) aVar.f117603s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            c24362i2.f117598c.mo127274y();
                            m129218b = C24861r.m129218b(C24848g0.f119245a);
                        } catch (Throwable th3) {
                            th = th3;
                            C24861r.a aVar2 = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e != null) {
                            }
                        }
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                            if (m129221e instanceof ExceptionFeed) {
                                aVar.f117603s = c24362i;
                                aVar.f117604t = m129221e;
                                aVar.f117607w = 3;
                                if (c24362i.f117598c.mo127272w((ExceptionFeed) m129221e, aVar) == m142578e) {
                                    return m142578e;
                                }
                                th2 = m129221e;
                                c24362i4 = c24362i;
                                c24362i = c24362i4;
                                m129221e = th2;
                            }
                            c24362i.f117600e = false;
                            throw m129221e;
                        }
                        c24362i.f117600e = false;
                        return c24362i.f117598c.mo127267r();
                    }
                    c24362i2 = (C24362i) aVar.f117604t;
                    c24362i3 = (C24362i) aVar.f117603s;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        c24362i = c24362i3;
                        C24861r.a aVar22 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f117602g) {
                        m127390x("Not still init");
                    }
                    this.f117600e = true;
                    try {
                        C24861r.a aVar3 = C24861r.f119264q;
                        InterfaceC24368l interfaceC24368l = this.f117597b;
                        C24376q mo127270u = this.f117598c.mo127270u();
                        aVar.f117603s = this;
                        aVar.f117604t = this;
                        aVar.f117607w = 1;
                        obj = interfaceC24368l.mo127373a(mo127270u, aVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c24362i2 = this;
                        c24362i3 = c24362i2;
                    } catch (Throwable th5) {
                        th = th5;
                        c24362i = this;
                        C24861r.a aVar222 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                        }
                    }
                }
                interfaceC24364j = c24362i2.f117598c;
                aVar.f117603s = c24362i3;
                aVar.f117604t = c24362i2;
                aVar.f117607w = 2;
                if (interfaceC24364j.mo127258i((C24358g) obj, aVar) != m142578e) {
                    return m142578e;
                }
                c24362i = c24362i3;
                c24362i2.f117598c.mo127274y();
                m129218b = C24861r.m129218b(C24848g0.f119245a);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                }
            }
        }
        aVar = new a(continuation);
        obj = aVar.f117605u;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f117607w;
        if (i11 == 0) {
        }
        interfaceC24364j = c24362i2.f117598c;
        aVar.f117603s = c24362i3;
        aVar.f117604t = c24362i2;
        aVar.f117607w = 2;
        if (interfaceC24364j.mo127258i((C24358g) obj, aVar) != m142578e) {
        }
    }

    /* renamed from: i */
    public final int m127402i(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return this.f117598c.mo127264o(str);
    }

    /* renamed from: j */
    public final int m127403j(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return this.f117598c.mo127271v(str);
    }

    /* renamed from: k */
    public final C3000l0 m127404k(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return this.f117598c.mo127252c(str);
    }

    /* renamed from: l */
    public final List m127405l() {
        return this.f117598c.mo127267r();
    }

    /* renamed from: m */
    public int m127406m() {
        return this.f117596a;
    }

    /* renamed from: n */
    public final boolean m127407n(String str) {
        AbstractC19074t.m100208f(str, "feedItemId");
        return this.f117598c.mo127262m(str);
    }

    /* renamed from: o */
    public final void m127408o(String str, String str2) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "hideFeedId");
        this.f117598c.mo127255f(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127409p(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C24362i c24362i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f117611v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f117611v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f117609t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f117611v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24362i = (C24362i) bVar.f117608s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC24364j interfaceC24364j = this.f117598c;
                    bVar.f117608s = this;
                    bVar.f117611v = 1;
                    if (interfaceC24364j.mo127257h(bVar) == m142578e) {
                        return m142578e;
                    }
                    c24362i = this;
                }
                c24362i.f117602g = true;
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f117609t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f117611v;
        if (i11 == 0) {
        }
        c24362i.f117602g = true;
        return C24848g0.f119245a;
    }

    /* renamed from: q */
    public final boolean m127410q() {
        return this.f117598c.mo127253d();
    }

    /* renamed from: r */
    public final boolean m127411r() {
        return this.f117600e;
    }

    /* renamed from: s */
    public final boolean m127412s() {
        return this.f117602g;
    }

    /* renamed from: t */
    public final boolean m127413t() {
        return this.f117597b.mo127374b();
    }

    /* renamed from: u */
    public final boolean m127414u() {
        return this.f117601f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127415v(Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C24362i c24362i;
        C24362i c24362i2;
        Object m129218b;
        Throwable m129221e;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f117616w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f117616w = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f117614u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f117616w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24362i2 = (C24362i) cVar.f117613t;
                        c24362i = (C24362i) cVar.f117612s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            C24861r.a aVar = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f117602g) {
                        m127390x("Not still init");
                    }
                    this.f117601f = true;
                    try {
                        C24861r.a aVar2 = C24861r.f119264q;
                        InterfaceC24364j interfaceC24364j = this.f117598c;
                        cVar.f117612s = this;
                        cVar.f117613t = this;
                        cVar.f117616w = 1;
                        if (interfaceC24364j.mo127259j(cVar) == m142578e) {
                            return m142578e;
                        }
                        c24362i = this;
                        c24362i2 = c24362i;
                    } catch (Throwable th3) {
                        th = th3;
                        c24362i = this;
                        C24861r.a aVar3 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                        }
                    }
                }
                c24362i2.f117598c.mo127269t();
                m129218b = C24861r.m129218b(C24848g0.f119245a);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                    c24362i.f117601f = false;
                    return c24362i.f117598c.mo127267r();
                }
                c24362i.f117601f = false;
                throw m129221e;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f117614u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f117616w;
        if (i11 == 0) {
        }
        c24362i2.f117598c.mo127269t();
        m129218b = C24861r.m129218b(C24848g0.f119245a);
        m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127416w(Continuation continuation) {
        d dVar;
        Object obj;
        Object m142578e;
        int i11;
        C24362i c24362i;
        C24362i c24362i2;
        C24362i c24362i3;
        C24362i c24362i4;
        InterfaceC24364j interfaceC24364j;
        Object m129218b;
        Throwable m129221e;
        Throwable th2;
        C24362i c24362i5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f117621w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f117621w = i12 - Integer.MIN_VALUE;
                obj = dVar.f117619u;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f117621w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                th2 = (Throwable) dVar.f117618t;
                                c24362i5 = (C24362i) dVar.f117617s;
                                AbstractC24862s.m129228b(obj);
                                c24362i = c24362i5;
                                m129221e = th2;
                                c24362i.f117601f = false;
                                throw m129221e;
                            }
                            c24362i = (C24362i) dVar.f117617s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                m129218b = C24861r.m129218b(C24848g0.f119245a);
                            } catch (Throwable th3) {
                                th = th3;
                                C24861r.a aVar = C24861r.f119264q;
                                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                                m129221e = C24861r.m129221e(m129218b);
                                if (m129221e == null) {
                                }
                            }
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e == null) {
                                if (m129221e instanceof ExceptionFeed) {
                                    dVar.f117617s = c24362i;
                                    dVar.f117618t = m129221e;
                                    dVar.f117621w = 4;
                                    if (c24362i.f117598c.mo127272w((ExceptionFeed) m129221e, dVar) == m142578e) {
                                        return m142578e;
                                    }
                                    th2 = m129221e;
                                    c24362i5 = c24362i;
                                    c24362i = c24362i5;
                                    m129221e = th2;
                                }
                                c24362i.f117601f = false;
                                throw m129221e;
                            }
                            c24362i.f117601f = false;
                            return c24362i.f117598c.mo127267r();
                        }
                        c24362i2 = (C24362i) dVar.f117618t;
                        c24362i4 = (C24362i) dVar.f117617s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            interfaceC24364j = c24362i2.f117598c;
                            dVar.f117617s = c24362i4;
                            dVar.f117618t = null;
                            dVar.f117621w = 3;
                        } catch (Throwable th4) {
                            th = th4;
                            c24362i = c24362i4;
                            C24861r.a aVar2 = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e == null) {
                            }
                        }
                        if (interfaceC24364j.mo127258i((C24358g) obj, dVar) != m142578e) {
                            return m142578e;
                        }
                        c24362i = c24362i4;
                        m129218b = C24861r.m129218b(C24848g0.f119245a);
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e == null) {
                        }
                    } else {
                        c24362i2 = (C24362i) dVar.f117618t;
                        c24362i3 = (C24362i) dVar.f117617s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            c24362i = c24362i3;
                            C24861r.a aVar22 = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e == null) {
                            }
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f117602g) {
                        m127390x("Not still init");
                    }
                    this.f117601f = true;
                    try {
                        C24861r.a aVar3 = C24861r.f119264q;
                        InterfaceC24364j interfaceC24364j2 = this.f117598c;
                        dVar.f117617s = this;
                        dVar.f117618t = this;
                        dVar.f117621w = 1;
                        obj = interfaceC24364j2.mo127259j(dVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c24362i2 = this;
                        c24362i3 = c24362i2;
                    } catch (Throwable th6) {
                        th = th6;
                        c24362i = this;
                        C24861r.a aVar222 = C24861r.f119264q;
                        m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e == null) {
                        }
                    }
                }
                if (((Boolean) obj).booleanValue() && c24362i2.f117597b.mo127374b()) {
                    InterfaceC24368l interfaceC24368l = c24362i2.f117597b;
                    int mo127273x = c24362i2.f117598c.mo127273x();
                    C24376q mo127270u = c24362i2.f117598c.mo127270u();
                    dVar.f117617s = c24362i3;
                    dVar.f117618t = c24362i2;
                    dVar.f117621w = 2;
                    obj = interfaceC24368l.mo127375c(mo127273x, mo127270u, dVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24362i4 = c24362i3;
                    interfaceC24364j = c24362i2.f117598c;
                    dVar.f117617s = c24362i4;
                    dVar.f117618t = null;
                    dVar.f117621w = 3;
                    if (interfaceC24364j.mo127258i((C24358g) obj, dVar) != m142578e) {
                    }
                } else {
                    c24362i = c24362i3;
                    m129218b = C24861r.m129218b(C24848g0.f119245a);
                    m129221e = C24861r.m129221e(m129218b);
                    if (m129221e == null) {
                    }
                }
            }
        }
        dVar = new d(continuation);
        obj = dVar.f117619u;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f117621w;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        c24362i = c24362i3;
        m129218b = C24861r.m129218b(C24848g0.f119245a);
        m129221e = C24861r.m129221e(m129218b);
        if (m129221e == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127417y(String str, C24362i c24362i, Continuation continuation) {
        f fVar;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f117627v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f117627v = i12 - Integer.MIN_VALUE;
                obj = fVar.f117625t;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f117627v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c24362i = (C24362i) fVar.f117624s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC24364j interfaceC24364j = this.f117598c;
                    fVar.f117624s = c24362i;
                    fVar.f117627v = 1;
                    obj = interfaceC24364j.mo127266q(str, fVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                fVar.f117624s = null;
                fVar.f117627v = 2;
                if (c24362i.m127396c((List) obj, fVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        fVar = new f(continuation);
        obj = fVar.f117625t;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f117627v;
        if (i11 == 0) {
        }
        fVar.f117624s = null;
        fVar.f117627v = 2;
        if (c24362i.m127396c((List) obj, fVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: z */
    public final Object m127418z(String str, Continuation continuation) {
        return this.f117598c.mo127266q(str, continuation);
    }

    public /* synthetic */ C24362i(int i11, InterfaceC24368l interfaceC24368l, InterfaceC24364j interfaceC24364j, CoroutineScope coroutineScope, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? new C24360h(i11, null, 2, null) : interfaceC24368l, (i12 & 4) != 0 ? new C24350c(i11, null, null, 6, null) : interfaceC24364j, coroutineScope);
    }
}
