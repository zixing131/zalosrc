package gl0;

import al0.C0894a;
import bl0.C2835a;
import bl0.C2836b;
import bl0.C2839e;
import bl0.C2842h;
import com.zing.zalo.zinstant.ZinstantNative;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import el0.C18486f;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fl0.C18993d;
import fl0.C18995f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import hl0.C20088a;
import hl0.C20090c;
import ik0.AbstractC20595r;
import ik0.AbstractC20596s;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.InterfaceC20587j;
import jl0.C21285a;
import jl0.C21287c;
import kl0.C21760b;
import kl0.C21762d;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import lk0.C22504b;
import lk0.C22509g;
import nk0.C23855s0;
import pj0.InterfaceC24775a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vk0.C28283e;
import vk0.C28284f;
import vk0.C28289k;
import vk0.InterfaceC28281c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zk0.InterfaceC32222a;

/* renamed from: gl0.f */
/* loaded from: classes7.dex */
public final class C19484f {

    /* renamed from: a */
    private final C19482d f96654a;

    /* renamed from: b */
    private final InterfaceC24854k f96655b;

    /* renamed from: c */
    private final InterfaceC24854k f96656c;

    /* renamed from: d */
    private final InterfaceC32222a f96657d;

    /* renamed from: e */
    private final InterfaceC32222a f96658e;

    /* renamed from: f */
    private C21287c f96659f;

    /* renamed from: g */
    private C2839e f96660g;

    /* renamed from: h */
    private final C2835a f96661h;

    /* renamed from: i */
    private boolean f96662i;

    /* renamed from: gl0.f$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f96663t;

        a(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f96663t;
            int i12 = 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            ZinstantNative.getInstance().initNativeScaleFactorIfNeeded();
            AbstractC20597t mo107100s = C19484f.this.m101887n().m99746a().mo107100s();
            if (mo107100s != null) {
                C19484f c19484f = C19484f.this;
                AbstractC20601x m99746a = c19484f.m101887n().m99746a();
                this.f96663t = 1;
                if (c19484f.m101856F(m99746a, mo107100s, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            AbstractC20595r mo107098q = C19484f.this.m101887n().m99746a().mo107098q();
            if (mo107098q != null) {
                C19484f c19484f2 = C19484f.this;
                AbstractC20601x m99746a2 = c19484f2.m101887n().m99746a();
                this.f96663t = 2;
                if (c19484f2.m101857G(m99746a2, mo107098q, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            C28284f c28284f = new C28284f(400, "unknown request");
            C19484f c19484f3 = C19484f.this;
            C2839e c2839e = new C2839e(null, c28284f, i12, 0 == true ? 1 : 0);
            this.f96663t = 3;
            if (c19484f3.m101877s(c2839e, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m101888r(Continuation continuation) {
            return new a(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((a) m101888r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f96665s;

        /* renamed from: t */
        Object f96666t;

        /* renamed from: u */
        /* synthetic */ Object f96667u;

        /* renamed from: w */
        int f96669w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96667u = obj;
            this.f96669w |= Integer.MIN_VALUE;
            return C19484f.this.m101877s(null, this);
        }
    }

    /* renamed from: gl0.f$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96670t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f96670t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C20090c c20090c = new C20090c(new C20088a(C19484f.this.m101887n().m101846c(), C19484f.this.m101887n().m101851h(), C19484f.this.m101887n().m101848e(), C19484f.this.m101887n().m101847d(), C19484f.this.m101887n().m99746a()), C19484f.this.f96657d);
                this.f96670t = 1;
                obj = c20090c.mo18187a(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C18486f c18486f = (C18486f) obj;
            InterfaceC24775a m101850g = C19484f.this.m101887n().m101850g();
            if (c18486f.mo13723d()) {
                c18486f.m142538c();
                m101850g.onSuccess(null);
            } else if (c18486f.m142536a()) {
                c18486f.m142537b();
                C28284f m142537b = c18486f.m142537b();
                AbstractC19074t.m100206d(m142537b, "null cannot be cast to non-null type com.zing.zalo.zinstant.universe.base.request.UniversalException");
                m101850g.mo15338c(new ZinstantException(m142537b.m142528a(), m142537b.m142529b()));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96672t;

        /* renamed from: u */
        final /* synthetic */ C22509g f96673u;

        /* renamed from: v */
        final /* synthetic */ String f96674v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C22509g c22509g, String str, Continuation continuation) {
            super(2, continuation);
            this.f96673u = c22509g;
            this.f96674v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f96673u, this.f96674v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f96672t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f96673u.m116381d(this.f96674v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f96675s;

        /* renamed from: t */
        /* synthetic */ Object f96676t;

        /* renamed from: v */
        int f96678v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96676t = obj;
            this.f96678v |= Integer.MIN_VALUE;
            return C19484f.this.m101855E(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f96679t;

        /* renamed from: v */
        final /* synthetic */ AbstractC20601x f96681v;

        /* renamed from: w */
        final /* synthetic */ AbstractC20596s f96682w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, Continuation continuation) {
            super(1, continuation);
            this.f96681v = abstractC20601x;
            this.f96682w = abstractC20596s;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f96679t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19484f c19484f = C19484f.this;
                AbstractC20601x abstractC20601x = this.f96681v;
                AbstractC20596s abstractC20596s = this.f96682w;
                k.a m101874p = c19484f.m101874p();
                InterfaceC32222a interfaceC32222a = C19484f.this.f96658e;
                this.f96679t = 1;
                if (c19484f.m101858H(abstractC20601x, abstractC20596s, m101874p, interfaceC32222a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m101892r(Continuation continuation) {
            return new f(this.f96681v, this.f96682w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f) m101892r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29096d {

        /* renamed from: s */
        Object f96683s;

        /* renamed from: t */
        /* synthetic */ Object f96684t;

        /* renamed from: v */
        int f96686v;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96684t = obj;
            this.f96686v |= Integer.MIN_VALUE;
            return C19484f.this.m101857G(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f96687s;

        /* renamed from: u */
        int f96689u;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96687s = obj;
            this.f96689u |= Integer.MIN_VALUE;
            return C19484f.this.m101859I(this);
        }
    }

    /* renamed from: gl0.f$i */
    /* loaded from: classes7.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: gl0.f$i$a */
        /* loaded from: classes7.dex */
        public static final class a implements InterfaceC28281c {

            /* renamed from: a */
            final /* synthetic */ C19484f f96691a;

            a(C19484f c19484f) {
                this.f96691a = c19484f;
            }

            @Override // vk0.InterfaceC28281c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object mo101895a(C2839e c2839e, Continuation continuation) {
                Object m142578e;
                Object m101880v = this.f96691a.m101880v(c2839e, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m101880v == m142578e) {
                    return m101880v;
                }
                return C24848g0.f119245a;
            }
        }

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(C19484f.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.f$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f96692t;

        /* renamed from: u */
        final /* synthetic */ C22509g f96693u;

        /* renamed from: v */
        final /* synthetic */ C22504b f96694v;

        /* renamed from: w */
        final /* synthetic */ AbstractC20601x f96695w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C22509g c22509g, C22504b c22504b, AbstractC20601x abstractC20601x, Continuation continuation) {
            super(2, continuation);
            this.f96693u = c22509g;
            this.f96694v = c22504b;
            this.f96695w = abstractC20601x;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f96693u, this.f96694v, this.f96695w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f96692t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f96693u.m116383h(this.f96694v, this.f96695w.mo107089h());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: gl0.f$k */
    /* loaded from: classes7.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: gl0.f$k$a */
        /* loaded from: classes7.dex */
        public static final class a implements InterfaceC28281c {

            /* renamed from: a */
            final /* synthetic */ C19484f f96697a;

            a(C19484f c19484f) {
                this.f96697a = c19484f;
            }

            @Override // vk0.InterfaceC28281c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object mo101895a(C2839e c2839e, Continuation continuation) {
                this.f96697a.m101882x(c2839e);
                return C24848g0.f119245a;
            }
        }

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            return new a(C19484f.this);
        }
    }

    public C19484f(C19482d c19482d) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c19482d, "info");
        this.f96654a = c19482d;
        m129210a = AbstractC24856m.m129210a(new k());
        this.f96655b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new i());
        this.f96656c = m129210a2;
        C0894a c0894a = C0894a.f3359a;
        this.f96657d = c0894a.m2758i();
        this.f96658e = c0894a.m2756g();
        this.f96661h = new C2835a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m101852A(InterfaceC20587j interfaceC20587j, AbstractC20601x abstractC20601x, ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(interfaceC20587j, "$callback");
        AbstractC19074t.m100208f(abstractC20601x, "$request");
        AbstractC19074t.m100208f(zOMDocument, "$document");
        C23855s0 m124606T = C23855s0.m124606T(zOMDocument);
        AbstractC19074t.m100207e(m124606T, "obtain(document)");
        interfaceC20587j.mo61859c(abstractC20601x, m124606T);
    }

    /* renamed from: B */
    private final Object m101853B(C21287c c21287c, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        if (c21287c.mo13723d()) {
            Object m101879u = m101879u(this.f96654a.m99746a(), c21287c, continuation);
            m142578e3 = AbstractC28298d.m142578e();
            if (m101879u == m142578e3) {
                return m101879u;
            }
            return C24848g0.f119245a;
        }
        if (c21287c.m142536a()) {
            Object m101878t = m101878t(c21287c, continuation);
            m142578e2 = AbstractC28298d.m142578e();
            if (m101878t == m142578e2) {
                return m101878t;
            }
            return C24848g0.f119245a;
        }
        Object m101877s = m101877s(new C2839e(null, new C28284f(400, "unknown zinstantdata response"), 1, 0 == true ? 1 : 0), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m101877s == m142578e) {
            return m101877s;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: D */
    private final void m101854D(AbstractC20595r abstractC20595r) {
        C18993d m99740b = this.f96654a.m101851h().m99740b();
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new d(this.f96654a.m101851h().m99741c(), m99740b.m99728a(abstractC20595r), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m101855E(AbstractC20601x abstractC20601x, AbstractC20595r abstractC20595r, Continuation continuation) {
        e eVar;
        Object obj;
        Object m142578e;
        int i11;
        C19484f c19484f;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f96678v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f96678v = i12 - Integer.MIN_VALUE;
                obj = eVar.f96676t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f96678v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19484f = (C19484f) eVar.f96675s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21760b c21760b = new C21760b(new C21285a(this.f96654a.m101851h(), this.f96654a.m101846c(), abstractC20595r, true, abstractC20601x), this.f96657d);
                    eVar.f96675s = this;
                    eVar.f96678v = 1;
                    obj = c21760b.mo18187a(eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19484f = this;
                }
                eVar.f96675s = null;
                eVar.f96678v = 2;
                if (c19484f.m101853B((C21287c) obj, eVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        obj = eVar.f96676t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f96678v;
        if (i11 == 0) {
        }
        eVar.f96675s = null;
        eVar.f96678v = 2;
        if (c19484f.m101853B((C21287c) obj, eVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final Object m101856F(AbstractC20601x abstractC20601x, AbstractC20597t abstractC20597t, Continuation continuation) {
        Object m142578e;
        AbstractC20596s mo107078f = abstractC20597t.mo107078f();
        AbstractC19074t.m100207e(mo107078f, "zinstantDataRequest.rootLayoutRequest()");
        AbstractC20596s mo107079g = abstractC20597t.mo107079g();
        if (mo107079g != null) {
            m101876r(new f(abstractC20601x, mo107079g, null));
        }
        Object m101858H = m101858H(abstractC20601x, mo107078f, m101873o(), this.f96657d, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m101858H == m142578e) {
            return m101858H;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m101857G(AbstractC20601x abstractC20601x, AbstractC20595r abstractC20595r, Continuation continuation) {
        g gVar;
        Object obj;
        Object m142578e;
        int i11;
        C19484f c19484f;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i12 = gVar.f96686v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f96686v = i12 - Integer.MIN_VALUE;
                obj = gVar.f96684t;
                m142578e = AbstractC28298d.m142578e();
                i11 = gVar.f96686v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19484f = (C19484f) gVar.f96683s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C21762d c21762d = new C21762d(new C21285a(this.f96654a.m101851h(), this.f96654a.m101846c(), abstractC20595r, false, abstractC20601x, 8, null), this.f96657d);
                    gVar.f96683s = this;
                    gVar.f96686v = 1;
                    obj = c21762d.mo18187a(gVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19484f = this;
                }
                gVar.f96683s = null;
                gVar.f96686v = 2;
                if (c19484f.m101853B((C21287c) obj, gVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        gVar = new g(continuation);
        obj = gVar.f96684t;
        m142578e = AbstractC28298d.m142578e();
        i11 = gVar.f96686v;
        if (i11 == 0) {
        }
        gVar.f96683s = null;
        gVar.f96686v = 2;
        if (c19484f.m101853B((C21287c) obj, gVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final Object m101858H(AbstractC20601x abstractC20601x, AbstractC20596s abstractC20596s, InterfaceC28281c interfaceC28281c, InterfaceC32222a interfaceC32222a, Continuation continuation) {
        Object m142578e;
        int mo107090i = this.f96654a.m99746a().mo107090i();
        String mo107099r = this.f96654a.m99746a().mo107099r();
        AbstractC19074t.m100207e(mo107099r, "info.zinstantRequest.zinstantDataId()");
        String mo107091j = this.f96654a.m99746a().mo107091j();
        String mo107088f = this.f96654a.m99746a().mo107088f();
        String mo107061h = abstractC20596s.mo107061h();
        String mo107060g = abstractC20596s.mo107060g();
        AbstractC19074t.m100207e(mo107060g, "layoutRequest.resourceChecksum()");
        Object m101844a = new C19481c(new C19479a(interfaceC28281c, new C18995f(mo107090i, mo107099r, mo107091j, mo107088f, mo107061h, mo107060g, abstractC20596s.mo107056c(), abstractC20596s.mo107058e()), this.f96654a.m101847d(), this.f96654a.m101848e(), this.f96654a.m101851h(), abstractC20596s, abstractC20601x), interfaceC32222a).m101844a(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m101844a == m142578e) {
            return m101844a;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m101859I(Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        AbstractC20595r mo107098q;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f96689u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f96689u = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f96687s;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f96689u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f96662i) {
                        return AbstractC29094b.m145339a(false);
                    }
                    this.f96662i = true;
                    if (this.f96654a.m99746a().mo107092k() && (mo107098q = this.f96654a.m99746a().mo107098q()) != null) {
                        AbstractC20601x m99746a = this.f96654a.m99746a();
                        hVar.f96689u = 1;
                        if (m101855E(m99746a, mo107098q, hVar) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        return AbstractC29094b.m145339a(false);
                    }
                }
                return AbstractC29094b.m145339a(true);
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f96687s;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f96689u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(true);
    }

    /* renamed from: J */
    private final void m101860J(AbstractC20595r abstractC20595r) {
        C21287c c21287c = this.f96659f;
        if (c21287c != null && c21287c.mo13723d()) {
            c21287c.m142538c();
            C18993d m99740b = this.f96654a.m101851h().m99740b();
            C22509g m99741c = this.f96654a.m101851h().m99741c();
            AbstractC20601x m99746a = this.f96654a.m99746a();
            Object m142538c = c21287c.m142538c();
            AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.model.ZinstantData");
            C22504b c22504b = (C22504b) m142538c;
            c22504b.f110127a = m99740b.m99728a(abstractC20595r);
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new j(m99741c, c22504b, m99746a, null), 3, null);
        }
    }

    /* renamed from: o */
    private final i.a m101873o() {
        return (i.a) this.f96656c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final k.a m101874p() {
        return (k.a) this.f96655b.getValue();
    }

    /* renamed from: q */
    private final C28289k m101875q() {
        return C0894a.f3359a.m2757h();
    }

    /* renamed from: r */
    private final void m101876r(InterfaceC18505l interfaceC18505l) {
        m101875q().m142539a(new C28283e(this.f96654a, null, 2, null), interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m101877s(C2839e c2839e, Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        C19484f c19484f;
        C28284f m142537b;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f96669w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f96669w = i12 - Integer.MIN_VALUE;
                obj = bVar.f96667u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f96669w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c2839e = (C2839e) bVar.f96666t;
                        c19484f = (C19484f) bVar.f96665s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f96660g == null) {
                        this.f96660g = c2839e;
                    }
                    bVar.f96665s = this;
                    bVar.f96666t = c2839e;
                    bVar.f96669w = 1;
                    obj = m101859I(bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19484f = this;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return C24848g0.f119245a;
                }
                c2839e.m142537b();
                AbstractC20595r mo107098q = c19484f.f96654a.m99746a().mo107098q();
                if (mo107098q != null) {
                    c19484f.m101854D(mo107098q);
                }
                C19059j0 c19059j0 = new C19059j0();
                C28284f m142537b2 = c2839e.m142537b();
                AbstractC19074t.m100206d(m142537b2, "null cannot be cast to non-null type com.zing.zalo.zinstant.universe.base.request.UniversalException");
                c19059j0.f94941p = m142537b2;
                InterfaceC20587j m101845b = c19484f.f96654a.m101845b();
                AbstractC20601x m99746a = c19484f.f96654a.m99746a();
                C2839e c2839e2 = c19484f.f96660g;
                if (c2839e2 != null && (m142537b = c2839e2.m142537b()) != null && !AbstractC19074t.m100204b(m142537b, c19059j0.f94941p)) {
                    c19059j0.f94941p = new C28284f(m142537b.m142528a(), m142537b.m142529b() + " - retry(" + c19059j0.f94941p + ')');
                }
                ZinstantException zinstantException = new ZinstantException(((C28284f) c19059j0.f94941p).m142528a(), ((C28284f) c19059j0.f94941p).m142529b());
                c19484f.f96654a.m101849f().mo91701b(m99746a, zinstantException);
                m101845b.mo61858b(m99746a, zinstantException);
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        obj = bVar.f96667u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f96669w;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* renamed from: t */
    private final Object m101878t(C21287c c21287c, Continuation continuation) {
        Object m142578e;
        c21287c.m142537b();
        C28284f m142537b = c21287c.m142537b();
        AbstractC19074t.m100206d(m142537b, "null cannot be cast to non-null type com.zing.zalo.zinstant.universe.base.request.UniversalException");
        Object m101877s = m101877s(new C2839e(null, m142537b, 1, 0 == true ? 1 : 0), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m101877s == m142578e) {
            return m101877s;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: u */
    private final Object m101879u(AbstractC20601x abstractC20601x, C21287c c21287c, Continuation continuation) {
        String str;
        Object m142578e;
        c21287c.m142538c();
        this.f96659f = c21287c;
        Object m142538c = c21287c.m142538c();
        AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.model.ZinstantData");
        C22504b c22504b = (C22504b) m142538c;
        AbstractC20595r mo107098q = abstractC20601x.mo107098q();
        if (mo107098q != null) {
            str = mo107098q.mo107044c();
        } else {
            str = null;
        }
        AbstractC20597t mo107081a = AbstractC20597t.m107200c(c22504b, abstractC20601x.mo107088f(), abstractC20601x.mo107091j(), str).mo107081a();
        AbstractC19074t.m100207e(mo107081a, "builder(\n               …ata\n            ).build()");
        Object m101856F = m101856F(abstractC20601x, mo107081a, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m101856F == m142578e) {
            return m101856F;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final Object m101880v(C2839e c2839e, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        if (c2839e.mo13723d()) {
            m101884z(c2839e);
        } else {
            if (c2839e.m142536a()) {
                Object m101877s = m101877s(c2839e, continuation);
                m142578e2 = AbstractC28298d.m142578e();
                if (m101877s == m142578e2) {
                    return m101877s;
                }
                return C24848g0.f119245a;
            }
            Object m101877s2 = m101877s(new C2839e(null, new C28284f(400, "unknown response"), 1, 0 == true ? 1 : 0), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m101877s2 == m142578e) {
                return m101877s2;
            }
        }
        return C24848g0.f119245a;
    }

    /* renamed from: w */
    private final void m101881w(C2839e c2839e) {
        c2839e.m142537b();
        C28284f m142537b = c2839e.m142537b();
        AbstractC19074t.m100206d(m142537b, "null cannot be cast to non-null type com.zing.zalo.zinstant.universe.base.request.UniversalException");
        InterfaceC20587j m101845b = this.f96654a.m101845b();
        AbstractC20601x m99746a = this.f96654a.m99746a();
        ZinstantException zinstantException = new ZinstantException(m142537b.m142528a(), m142537b.m142529b());
        this.f96654a.m101849f().mo91700a(this.f96654a.m99746a(), zinstantException);
        m101845b.mo61857a(m99746a, zinstantException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m101882x(C2839e c2839e) {
        if (c2839e.mo13723d()) {
            m101883y(c2839e);
        } else if (c2839e.m142536a()) {
            m101881w(c2839e);
        } else {
            m101881w(new C2839e(null, new C28284f(400, "unknown skeleton response"), 1, 0 == true ? 1 : 0));
        }
    }

    /* renamed from: y */
    private final void m101883y(C2839e c2839e) {
        c2839e.m142538c();
        InterfaceC20587j m101845b = this.f96654a.m101845b();
        AbstractC20601x m99746a = this.f96654a.m99746a();
        Object m142538c = c2839e.m142538c();
        AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
        this.f96654a.m101849f().mo91703d(this.f96654a.m99746a());
        m101845b.mo61860d(m99746a, (ZOMDocument) m142538c);
    }

    /* renamed from: z */
    private final void m101884z(C2839e c2839e) {
        c2839e.m142538c();
        AbstractC20595r mo107098q = this.f96654a.m99746a().mo107098q();
        if (mo107098q != null) {
            m101860J(mo107098q);
        }
        final InterfaceC20587j m101845b = this.f96654a.m101845b();
        final AbstractC20601x m99746a = this.f96654a.m99746a();
        Object m142538c = c2839e.m142538c();
        AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
        final ZOMDocument zOMDocument = (ZOMDocument) m142538c;
        C2836b m13690a = this.f96661h.m13690a();
        m13690a.m13694c(System.currentTimeMillis());
        this.f96654a.m101849f().mo91702c(this.f96654a.m99746a(), m13690a.m13693b(), m13690a.m13692a());
        if (c2839e instanceof C2842h) {
            C2842h c2842h = (C2842h) c2839e;
            c2842h.m13724e();
            C23855s0 m13724e = c2842h.m13724e();
            AbstractC19074t.m100206d(m13724e, "null cannot be cast to non-null type com.zing.zalo.zinstant.renderer.ZinstantRoot");
            m101845b.mo61859c(m99746a, m13724e);
            return;
        }
        if (zOMDocument.cachingState()) {
            zOMDocument.queueNativeTask(new Runnable() { // from class: gl0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C19484f.m101852A(InterfaceC20587j.this, m99746a, zOMDocument);
                }
            });
            return;
        }
        C23855s0 m124606T = C23855s0.m124606T(zOMDocument);
        AbstractC19074t.m100207e(m124606T, "obtain(document)");
        m101845b.mo61859c(m99746a, m124606T);
    }

    /* renamed from: C */
    public final void m101885C() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new c(null), 3, null);
    }

    /* renamed from: m */
    public final void m101886m() {
        this.f96661h.m13690a().m13695d(System.currentTimeMillis());
        m101876r(new a(null));
    }

    /* renamed from: n */
    public final C19482d m101887n() {
        return this.f96654a;
    }
}
