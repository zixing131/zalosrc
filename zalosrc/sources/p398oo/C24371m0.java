package p398oo;

import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: oo.m0 */
/* loaded from: classes4.dex */
public final class C24371m0 implements InterfaceC24374o {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static volatile C24371m0 f117707d;

    /* renamed from: a */
    private CoroutineScope f117708a;

    /* renamed from: b */
    private final C24362i f117709b;

    /* renamed from: c */
    private final C24362i f117710c;

    /* renamed from: oo.m0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24371m0 m127483a() {
            C24371m0 c24371m0;
            C24371m0 c24371m02 = C24371m0.f117707d;
            if (c24371m02 == null) {
                synchronized (this) {
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112681c());
                    c24371m0 = new C24371m0(m112637a, new C24362i(0, null, null, m112637a, 6, null), new C24362i(1, null, null, m112637a, 6, null));
                    C24371m0.f117707d = c24371m0;
                }
                return c24371m0;
            }
            return c24371m02;
        }
    }

    /* renamed from: oo.m0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f117711s;

        /* renamed from: t */
        /* synthetic */ Object f117712t;

        /* renamed from: v */
        int f117714v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117712t = obj;
            this.f117714v |= Integer.MIN_VALUE;
            return C24371m0.this.mo127470b(this);
        }
    }

    /* renamed from: oo.m0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117715t;

        /* renamed from: v */
        final /* synthetic */ String f117717v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f117717v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f117717v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117715t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C24362i c24362i = C24371m0.this.f117709b;
                String str = this.f117717v;
                this.f117715t = 1;
                if (c24362i.m127418z(str, this) == m142578e) {
                    return m142578e;
                }
            }
            C24362i c24362i2 = C24371m0.this.f117710c;
            String str2 = this.f117717v;
            this.f117715t = 2;
            if (c24362i2.m127418z(str2, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24371m0(CoroutineScope coroutineScope, C24362i c24362i, C24362i c24362i2) {
        AbstractC19074t.m100208f(coroutineScope, "uiScope");
        AbstractC19074t.m100208f(c24362i, "feedTabMain");
        AbstractC19074t.m100208f(c24362i2, "feedTabOther");
        this.f117708a = coroutineScope;
        this.f117709b = c24362i;
        this.f117710c = c24362i2;
    }

    /* renamed from: o */
    private final C24362i m127467o(String str) {
        if (this.f117709b.m127407n(str)) {
            return this.f117709b;
        }
        if (this.f117710c.m127407n(str)) {
            return this.f117710c;
        }
        return null;
    }

    /* renamed from: p */
    public static final C24371m0 m127468p() {
        return Companion.m127483a();
    }

    @Override // p398oo.InterfaceC24374o
    /* renamed from: a */
    public void mo127469a() {
        this.f117709b.m127399f();
        this.f117710c.m127399f();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p398oo.InterfaceC24374o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo127470b(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C24371m0 c24371m0;
        C24362i c24362i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f117714v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f117714v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f117712t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f117714v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c24371m0 = (C24371m0) bVar.f117711s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C24362i c24362i2 = this.f117709b;
                    bVar.f117711s = this;
                    bVar.f117714v = 1;
                    if (c24362i2.m127398e(bVar) == m142578e) {
                        return m142578e;
                    }
                    c24371m0 = this;
                }
                c24362i = c24371m0.f117710c;
                bVar.f117711s = null;
                bVar.f117714v = 2;
                if (c24362i.m127398e(bVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f117712t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f117714v;
        if (i11 == 0) {
        }
        c24362i = c24371m0.f117710c;
        bVar.f117711s = null;
        bVar.f117714v = 2;
        if (c24362i.m127398e(bVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    @Override // p398oo.InterfaceC24374o
    /* renamed from: c */
    public C3000l0 mo127471c(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        C3000l0 m127404k = this.f117709b.m127404k(str);
        if (m127404k == null) {
            return this.f117710c.m127404k(str);
        }
        return m127404k;
    }

    @Override // p398oo.InterfaceC24374o
    /* renamed from: d */
    public C24362i mo127472d(int i11) {
        return i11 != 0 ? i11 != 1 ? this.f117710c : this.f117710c : this.f117709b;
    }

    /* renamed from: i */
    public void m127473i() {
        this.f117709b.m127397d();
        this.f117710c.m127397d();
    }

    /* renamed from: j */
    public void m127474j(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "fids");
        this.f117709b.m127400g(list, z11);
        this.f117710c.m127400g(list, z11);
    }

    /* renamed from: k */
    public int m127475k(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        if (this.f117709b.m127407n(str)) {
            return this.f117709b.m127402i(str);
        }
        if (this.f117710c.m127407n(str)) {
            return this.f117710c.m127402i(str);
        }
        return -1;
    }

    /* renamed from: l */
    public int m127476l(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        int m127403j = this.f117709b.m127403j(str);
        int m127403j2 = this.f117710c.m127403j(str);
        if (m127403j < 0) {
            return m127403j2;
        }
        return m127403j;
    }

    /* renamed from: m */
    public List m127477m() {
        List m131222v0;
        m131222v0 = AbstractC25332a0.m131222v0(this.f117709b.m127405l(), this.f117710c.m127405l());
        return m131222v0;
    }

    /* renamed from: n */
    public C3020p0 m127478n(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        C3000l0 m127404k = this.f117709b.m127404k(str);
        if (m127404k == null) {
            m127404k = this.f117710c.m127404k(str);
        }
        if (m127404k != null) {
            return m127404k.m14325c0(str);
        }
        return null;
    }

    /* renamed from: q */
    public void m127479q(String str, String str2) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "hideFeedId");
        this.f117709b.m127408o(str, str2);
        this.f117710c.m127408o(str, str2);
    }

    /* renamed from: r */
    public void m127480r(String str) {
        AbstractC19074t.m100208f(str, "userId");
        BuildersKt__Builders_commonKt.m112540d(this.f117708a, null, null, new c(str, null), 3, null);
    }

    /* renamed from: s */
    public boolean m127481s(String str, InterfaceC18509p interfaceC18509p) {
        List m131496e;
        AbstractC19074t.m100208f(str, "fid");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        C24362i m127467o = m127467o(str);
        if (m127467o != null) {
            m131496e = AbstractC25366r.m131496e(str);
            return m127467o.m127394D(m131496e, interfaceC18509p);
        }
        return false;
    }

    /* renamed from: t */
    public boolean m127482t(List list, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "fids");
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        boolean m127394D = this.f117709b.m127394D(list, interfaceC18509p);
        boolean m127394D2 = this.f117710c.m127394D(list, interfaceC18509p);
        if (!m127394D && !m127394D2) {
            return false;
        }
        return true;
    }
}
