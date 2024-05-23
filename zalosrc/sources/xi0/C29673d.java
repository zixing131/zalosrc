package xi0;

import aj0.AbstractC0878a;
import aj0.C0880c;
import aj0.C0881d;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import bj0.C2824c;
import bj0.C2826e;
import cj0.AbstractC3559c;
import cj0.C3557a;
import cj0.C3558b;
import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3914j;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3934p;
import com.android.billingclient.api.C3940r;
import com.android.billingclient.api.InterfaceC3949u;
import com.zing.zalo.ziap.data.p080db.ZIAPDatabase;
import com.zing.zalocore.CoreUtility;
import dj0.InterfaceC18016a;
import ej0.AbstractC18457a;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fj0.C18985b;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import gg0.AbstractC19444a;
import gj0.C19462a;
import gj0.C19463b;
import hj0.C20074a;
import hj0.C20075b;
import hj0.C20076c;
import hj0.C20077d;
import hj0.C20078e;
import ij0.C20574f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jj0.AbstractC21278c;
import jj0.EnumC21276a;
import jj0.EnumC21277b;
import jj0.EnumC21279d;
import kj0.AbstractC21750g;
import kj0.C21744a;
import kj0.C21745b;
import kj0.C21746c;
import kj0.InterfaceC21747d;
import km0.InterfaceC21766a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lj0.AbstractC22500a;
import lj0.C22501b;
import nh0.InterfaceC23792b;
import p248iy.AbstractC20887g;
import p248iy.C20884d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25379x0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import yi0.C30995b;
import zi0.C32216b;
import zi0.InterfaceC32215a;

/* renamed from: xi0.d */
/* loaded from: classes.dex */
public final class C29673d extends AbstractC29674e implements InterfaceC3949u {

    /* renamed from: d */
    public static final C29673d f136989d;

    /* renamed from: e */
    private static final String f136990e;

    /* renamed from: f */
    private static AbstractC3894e f136991f;

    /* renamed from: g */
    private static InterfaceC27315f f136992g;

    /* renamed from: h */
    private static final CoroutineExceptionHandler f136993h;

    /* renamed from: i */
    private static InterfaceC21766a f136994i;

    /* renamed from: j */
    private static final InterfaceC24854k f136995j;

    /* renamed from: k */
    private static InterfaceC23792b f136996k;

    /* renamed from: l */
    private static Context f136997l;

    /* renamed from: m */
    private static final MutableStateFlow f136998m;

    /* renamed from: n */
    private static C2826e f136999n;

    /* renamed from: o */
    private static int f137000o;

    /* renamed from: p */
    private static InterfaceC32215a f137001p;

    /* renamed from: q */
    private static InterfaceC18016a f137002q;

    /* renamed from: r */
    private static final e f137003r;

    /* renamed from: s */
    private static C3557a f137004s;

    /* renamed from: t */
    private static AbstractC3559c f137005t;

    /* renamed from: u */
    private static C30995b f137006u;

    /* renamed from: v */
    private static Map f137007v;

    /* renamed from: w */
    private static final StateFlow f137008w;

    /* renamed from: xi0.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137009t;

        /* renamed from: u */
        final /* synthetic */ C0880c f137010u;

        /* renamed from: v */
        final /* synthetic */ boolean f137011v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0880c c0880c, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f137010u = c0880c;
            this.f137011v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f137010u, this.f137011v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137009t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String m18691f = new C3940r(this.f137010u.m2697e(), this.f137010u.m2698f()).m18691f();
                AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
                C29673d c29673d = C29673d.f136989d;
                C21744a c21744a = new C21744a(m18691f, c29673d.m147517K());
                C21746c c21746c = new C21746c(c29673d.m147517K(), c29673d.m147586a());
                C22501b m147586a = c29673d.m147586a();
                this.f137009t = 1;
                obj = AbstractC21750g.m112198d(c21744a, c21746c, null, 0, 0L, m147586a, this, 28, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return AbstractC29094b.m145339a(C29673d.f136989d.m147526d0(this.f137010u, this.f137011v, (C3918k) ((C24860q) obj).m129213a()));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f137012s;

        /* renamed from: t */
        Object f137013t;

        /* renamed from: u */
        Object f137014u;

        /* renamed from: v */
        /* synthetic */ Object f137015v;

        /* renamed from: x */
        int f137017x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137015v = obj;
            this.f137017x |= Integer.MIN_VALUE;
            return C29673d.this.m147513C(null, null, this);
        }
    }

    /* renamed from: xi0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137018t;

        /* renamed from: u */
        final /* synthetic */ C0880c f137019u;

        /* renamed from: v */
        final /* synthetic */ boolean f137020v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C0880c c0880c, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f137019u = c0880c;
            this.f137020v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f137019u, this.f137020v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137018t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String m18691f = new C3940r(this.f137019u.m2697e(), this.f137019u.m2698f()).m18691f();
                AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
                C29673d c29673d = C29673d.f136989d;
                C21745b c21745b = new C21745b(m18691f, c29673d.m147517K(), c29673d.m147586a());
                C21746c c21746c = new C21746c(c29673d.m147517K(), c29673d.m147586a());
                C22501b m147586a = c29673d.m147586a();
                this.f137018t = 1;
                obj = AbstractC21750g.m112198d(c21745b, c21746c, null, 0, 3000L, m147586a, this, 12, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return AbstractC29094b.m145339a(C29673d.f136989d.m147526d0(this.f137019u, this.f137020v, (C3918k) ((C24860q) obj).m129213a()));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f137021q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZIAPDatabase mo12V4() {
            return ZIAPDatabase.Companion.m91401a(C29673d.f136989d.m147518M());
        }
    }

    /* renamed from: xi0.d$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC21747d.a {

        /* renamed from: xi0.d$e$a */
        /* loaded from: classes7.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f137022t;

            /* renamed from: u */
            int f137023u;

            a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List list;
                C0881d c0881d;
                ZIAPDatabase m147519N;
                InterfaceC18016a interfaceC18016a;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f137023u;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) this.f137022t;
                        AbstractC24862s.m129228b(obj);
                        C29673d c29673d = C29673d.f136989d;
                        c0881d = new C0881d(c29673d.m147586a());
                        m147519N = c29673d.m147519N();
                        interfaceC18016a = C29673d.f137002q;
                        this.f137022t = null;
                        this.f137023u = 3;
                        if (c0881d.m2711b(m147519N, list, interfaceC18016a, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C29673d c29673d2 = C29673d.f136989d;
                    AbstractC3894e m147517K = c29673d2.m147517K();
                    this.f137023u = 1;
                    obj = c29673d2.m147592h(m147517K, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                list = (List) obj;
                C29673d c29673d3 = C29673d.f136989d;
                AbstractC3894e m147517K2 = c29673d3.m147517K();
                this.f137022t = list;
                this.f137023u = 2;
                if (c29673d3.m147568k0(list, m147517K2, null, this) == m142578e) {
                    return m142578e;
                }
                C29673d c29673d4 = C29673d.f136989d;
                c0881d = new C0881d(c29673d4.m147586a());
                m147519N = c29673d4.m147519N();
                interfaceC18016a = C29673d.f137002q;
                this.f137022t = null;
                this.f137023u = 3;
                if (c0881d.m2711b(m147519N, list, interfaceC18016a, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        e() {
        }

        @Override // kj0.InterfaceC21747d.a
        /* renamed from: a */
        public void mo112194a(C3918k c3918k) {
            AbstractC19074t.m100208f(c3918k, "billingResult");
        }

        @Override // kj0.InterfaceC21747d.a
        public void onSuccess(Object obj) {
            AbstractC19074t.m100208f(obj, "result");
            BuildersKt__Builders_commonKt.m112540d(C29673d.f136989d.m147520O(), null, null, new a(null), 3, null);
        }
    }

    /* renamed from: xi0.d$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f137024s;

        /* renamed from: u */
        int f137026u;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137024s = obj;
            this.f137026u |= Integer.MIN_VALUE;
            return C29673d.this.m147524U(null, false, false, this);
        }
    }

    /* renamed from: xi0.d$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137027t;

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f137027t == 0) {
                AbstractC24862s.m129228b(obj);
                C29673d c29673d = C29673d.f136989d;
                if (!c29673d.m147519N().m361z()) {
                    c29673d.m147519N().m352o().mo187p0();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi0.d$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137028t;

        /* renamed from: u */
        final /* synthetic */ String f137029u;

        /* renamed from: v */
        final /* synthetic */ AbstractC0878a f137030v;

        /* renamed from: w */
        final /* synthetic */ C2826e f137031w;

        /* renamed from: x */
        final /* synthetic */ C29673d f137032x;

        /* renamed from: y */
        final /* synthetic */ Activity f137033y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, AbstractC0878a abstractC0878a, C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.f137029u = str;
            this.f137030v = abstractC0878a;
            this.f137031w = c2826e;
            this.f137032x = c29673d;
            this.f137033y = activity;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f137029u, this.f137030v, this.f137031w, this.f137032x, this.f137033y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131505m;
            List m131505m2;
            List m131223w0;
            List m131222v0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137028t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C18984a c18984a = new C18984a(null, null, null, null, null, 31, null);
                String str = this.f137029u;
                C29673d c29673d = C29673d.f136989d;
                m131505m = AbstractC25368s.m131505m(new C20074a(str, c29673d.m147586a()), new C20075b(this.f137029u, c29673d.m147586a()), new C20574f(this.f137029u, c18984a, c29673d.m147586a()), new C20077d(this.f137029u, c18984a, c29673d.m147586a()), new C20076c(this.f137029u, c18984a, c29673d.m147586a()), new C20078e(c18984a));
                C18985b c18985b = new C18985b(c18984a);
                m131505m2 = AbstractC25368s.m131505m(new C19462a(this.f137029u, c18984a), new C19463b(this.f137029u, c29673d.m147523S(), this.f137030v, c18984a, c29673d.m147586a()));
                m131223w0 = AbstractC25332a0.m131223w0(m131505m, c18985b);
                m131222v0 = AbstractC25332a0.m131222v0(m131223w0, m131505m2);
                AbstractC18986c m99654a = AbstractC18986c.Companion.m99654a(m131222v0);
                C2826e c2826e = this.f137031w;
                C29673d c29673d2 = this.f137032x;
                Activity activity = this.f137033y;
                this.f137028t = 1;
                if (m99654a.mo99651a(c2826e, c29673d2, activity, this) == m142578e) {
                    return m142578e;
                }
            }
            C30995b c30995b = C29673d.f137006u;
            if (c30995b != null) {
                c30995b.m150656b();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137034t;

        /* renamed from: u */
        final /* synthetic */ AbstractC0878a f137035u;

        /* renamed from: v */
        final /* synthetic */ String f137036v;

        /* renamed from: w */
        final /* synthetic */ String f137037w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AbstractC0878a abstractC0878a, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f137035u = abstractC0878a;
            this.f137036v = str;
            this.f137037w = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f137035u, this.f137036v, this.f137037w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137034t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC0878a abstractC0878a = this.f137035u;
                String str = this.f137036v;
                String str2 = this.f137037w;
                C22501b m147586a = C29673d.f136989d.m147586a();
                this.f137034t = 1;
                if (abstractC0878a.m2661a(str, str2, m147586a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$j */
    /* loaded from: classes7.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137038t;

        /* renamed from: u */
        final /* synthetic */ List f137039u;

        /* renamed from: v */
        final /* synthetic */ C2826e f137040v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list, C2826e c2826e, Continuation continuation) {
            super(2, continuation);
            this.f137039u = list;
            this.f137040v = c2826e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f137039u, this.f137040v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137038t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                List list = this.f137039u;
                if (list != null) {
                    C29673d c29673d = C29673d.f136989d;
                    AbstractC3894e m147517K = c29673d.m147517K();
                    C2826e c2826e = this.f137040v;
                    this.f137038t = 1;
                    if (c29673d.m147568k0(list, m147517K, c2826e, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$k */
    /* loaded from: classes7.dex */
    static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137041t;

        /* renamed from: u */
        final /* synthetic */ C2826e f137042u;

        /* renamed from: v */
        final /* synthetic */ AbstractC0878a f137043v;

        /* renamed from: w */
        final /* synthetic */ C3918k f137044w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C2826e c2826e, AbstractC0878a abstractC0878a, C3918k c3918k, Continuation continuation) {
            super(2, continuation);
            this.f137042u = c2826e;
            this.f137043v = abstractC0878a;
            this.f137044w = c3918k;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f137042u, this.f137043v, this.f137044w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137041t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C2826e c2826e = this.f137042u;
                if (c2826e != null) {
                    C29673d c29673d = C29673d.f136989d;
                    AbstractC0878a abstractC0878a = this.f137043v;
                    this.f137041t = 1;
                    if (c29673d.m147515G(c2826e, abstractC0878a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
            C29673d c29673d2 = C29673d.f136989d;
            c29673d2.m147516H(this.f137044w, this.f137042u);
            c29673d2.m147538o0();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$l */
    /* loaded from: classes7.dex */
    static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137045t;

        /* renamed from: u */
        final /* synthetic */ C2826e f137046u;

        /* renamed from: v */
        final /* synthetic */ AbstractC0878a f137047v;

        /* renamed from: w */
        final /* synthetic */ C3918k f137048w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C2826e c2826e, AbstractC0878a abstractC0878a, C3918k c3918k, Continuation continuation) {
            super(2, continuation);
            this.f137046u = c2826e;
            this.f137047v = abstractC0878a;
            this.f137048w = c3918k;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f137046u, this.f137047v, this.f137048w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137045t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                                C29673d c29673d = C29673d.f136989d;
                                c29673d.m147516H(this.f137048w, this.f137046u);
                                c29673d.m147538o0();
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        C29673d c29673d2 = C29673d.f136989d;
                        c29673d2.m147516H(this.f137048w, this.f137046u);
                        c29673d2.m147538o0();
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C29673d c29673d3 = C29673d.f136989d;
                AbstractC3894e m147517K = c29673d3.m147517K();
                this.f137045t = 1;
                obj = c29673d3.m147592h(m147517K, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                if (this.f137046u != null) {
                    if (AbstractC19074t.m100204b(((C3940r) list.get(0)).m18688c().get(0), this.f137046u.m13654a())) {
                        C29673d c29673d4 = C29673d.f136989d;
                        AbstractC3894e m147517K2 = c29673d4.m147517K();
                        C2826e c2826e = this.f137046u;
                        this.f137045t = 2;
                        if (c29673d4.m147568k0(list, m147517K2, c2826e, this) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        C29673d c29673d5 = C29673d.f136989d;
                        C2826e c2826e2 = this.f137046u;
                        AbstractC0878a abstractC0878a = this.f137047v;
                        this.f137045t = 3;
                        if (c29673d5.m147515G(c2826e2, abstractC0878a, this) == m142578e) {
                            return m142578e;
                        }
                        C29673d c29673d22 = C29673d.f136989d;
                        c29673d22.m147516H(this.f137048w, this.f137046u);
                        c29673d22.m147538o0();
                    }
                }
            } else {
                C2826e c2826e3 = this.f137046u;
                if (c2826e3 != null) {
                    C29673d c29673d6 = C29673d.f136989d;
                    AbstractC0878a abstractC0878a2 = this.f137047v;
                    this.f137045t = 4;
                    if (c29673d6.m147515G(c2826e3, abstractC0878a2, this) == m142578e) {
                        return m142578e;
                    }
                    C29673d c29673d7 = C29673d.f136989d;
                    c29673d7.m147516H(this.f137048w, this.f137046u);
                    c29673d7.m147538o0();
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: xi0.d$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC29096d {

        /* renamed from: s */
        Object f137049s;

        /* renamed from: t */
        Object f137050t;

        /* renamed from: u */
        Object f137051u;

        /* renamed from: v */
        Object f137052v;

        /* renamed from: w */
        Object f137053w;

        /* renamed from: x */
        /* synthetic */ Object f137054x;

        /* renamed from: z */
        int f137056z;

        m(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137054x = obj;
            this.f137056z |= Integer.MIN_VALUE;
            return C29673d.this.m147568k0(null, null, null, this);
        }
    }

    /* renamed from: xi0.d$n */
    /* loaded from: classes.dex */
    public static final class n extends AbstractC27310a implements CoroutineExceptionHandler {
        public n(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            C29673d.f136989d.m147586a().mo104552e(th2);
        }
    }

    /* renamed from: xi0.d$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC29096d {

        /* renamed from: s */
        Object f137057s;

        /* renamed from: t */
        Object f137058t;

        /* renamed from: u */
        /* synthetic */ Object f137059u;

        /* renamed from: w */
        int f137061w;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137059u = obj;
            this.f137061w |= Integer.MIN_VALUE;
            return C29673d.this.m147542r0(null, null, this);
        }
    }

    /* renamed from: xi0.d$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29096d {

        /* renamed from: s */
        Object f137062s;

        /* renamed from: t */
        Object f137063t;

        /* renamed from: u */
        Object f137064u;

        /* renamed from: v */
        boolean f137065v;

        /* renamed from: w */
        int f137066w;

        /* renamed from: x */
        /* synthetic */ Object f137067x;

        /* renamed from: z */
        int f137069z;

        p(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f137067x = obj;
            this.f137069z |= Integer.MIN_VALUE;
            return C29673d.this.m147575t0(null, false, this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        C29673d c29673d = new C29673d();
        f136989d = c29673d;
        f136990e = "BillingManager: ";
        f136993h = new n(CoroutineExceptionHandler.f105837l);
        m129210a = AbstractC24856m.m129210a(d.f137021q);
        f136995j = m129210a;
        MutableStateFlow m113503a = StateFlowKt.m113503a(AbstractC18457a.a.f93007b);
        f136998m = m113503a;
        f137001p = C32216b.f148610a.m155340a();
        f137003r = new e();
        C3557a c3557a = new C3557a(c29673d.m147586a());
        f137004s = c3557a;
        f137005t = c3557a;
        f137007v = new LinkedHashMap();
        f137008w = FlowKt.m113284b(m113503a);
    }

    private C29673d() {
    }

    /* renamed from: A */
    private final Object m147512A(C0880c c0880c, boolean z11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(c0880c, z11, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147513C(C2826e c2826e, C3940r c3940r, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        Object m131205e0;
        C3934p c3934p;
        C2826e c2826e2;
        C3940r c3940r2;
        C29673d c29673d;
        Object m131205e02;
        Object m131205e03;
        C3940r c3940r3;
        C2826e c2826e3;
        C29673d c29673d2;
        Object m131205e04;
        Object m131205e05;
        String str;
        String str2;
        Object m131205e06;
        Object m131205e07;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f137017x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f137017x = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f137015v;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f137017x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c3940r3 = (C3940r) bVar.f137014u;
                            c2826e3 = (C2826e) bVar.f137013t;
                            c29673d2 = (C29673d) bVar.f137012s;
                            AbstractC24862s.m129228b(obj);
                            Map m147587c = c29673d2.m147587c();
                            List m18688c = c3940r3.m18688c();
                            AbstractC19074t.m100207e(m18688c, "purchase.products");
                            m131205e07 = AbstractC25332a0.m131205e0(m18688c);
                            c3934p = (C3934p) m147587c.get(m131205e07);
                            c29673d = c29673d2;
                            c2826e2 = c2826e3;
                            c3940r2 = c3940r3;
                            if (c3934p == null) {
                                C22501b m147586a = c29673d.m147586a();
                                List m18688c2 = c3940r2.m18688c();
                                AbstractC19074t.m100207e(m18688c2, "purchase.products");
                                m131205e05 = AbstractC25332a0.m131205e0(m18688c2);
                                if (c2826e2 != null) {
                                    str = c2826e2.toString();
                                } else {
                                    str = null;
                                }
                                m147586a.m116345w("Caching product detail failed with product id: " + m131205e05 + ". CurTransData: " + str, new Object[0]);
                                String str3 = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str3, "currentUserUid");
                                if (c2826e2 == null || (str2 = c2826e2.m13657d()) == null) {
                                    str2 = "";
                                }
                                List m18688c3 = c3940r2.m18688c();
                                AbstractC19074t.m100207e(m18688c3, "purchase.products");
                                m131205e06 = AbstractC25332a0.m131205e0(m18688c3);
                                AbstractC20887g.m109231i(str3, 1, "tranxId: " + str2 + ", productId: " + m131205e06, 0L, 79912, CoreUtility.f89236l);
                            }
                            return c3934p;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3940r2 = (C3940r) bVar.f137014u;
                    c2826e2 = (C2826e) bVar.f137013t;
                    c29673d = (C29673d) bVar.f137012s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    Map m147587c2 = m147587c();
                    List m18688c4 = c3940r.m18688c();
                    AbstractC19074t.m100207e(m18688c4, "purchase.products");
                    m131205e0 = AbstractC25332a0.m131205e0(m18688c4);
                    c3934p = (C3934p) m147587c2.get(m131205e0);
                    if (c3934p == null) {
                        List m18688c5 = c3940r.m18688c();
                        AbstractC19074t.m100207e(m18688c5, "purchase.products");
                        m131205e02 = AbstractC25332a0.m131205e0(m18688c5);
                        AbstractC19074t.m100207e(m131205e02, "purchase.products.first()");
                        AbstractC3894e m147517K = m147517K();
                        bVar.f137012s = this;
                        bVar.f137013t = c2826e;
                        bVar.f137014u = c3940r;
                        bVar.f137017x = 1;
                        if (m147590f((String) m131205e02, "inapp", m147517K, bVar) == m142578e) {
                            return m142578e;
                        }
                        c2826e2 = c2826e;
                        c3940r2 = c3940r;
                        c29673d = this;
                    } else {
                        c2826e2 = c2826e;
                        c3940r2 = c3940r;
                        c29673d = this;
                        if (c3934p == null) {
                            List m18688c6 = c3940r2.m18688c();
                            AbstractC19074t.m100207e(m18688c6, "purchase.products");
                            m131205e03 = AbstractC25332a0.m131205e0(m18688c6);
                            AbstractC19074t.m100207e(m131205e03, "purchase.products.first()");
                            AbstractC3894e m147517K2 = c29673d.m147517K();
                            bVar.f137012s = c29673d;
                            bVar.f137013t = c2826e2;
                            bVar.f137014u = c3940r2;
                            bVar.f137017x = 2;
                            if (c29673d.m147590f((String) m131205e03, "subs", m147517K2, bVar) == m142578e) {
                                return m142578e;
                            }
                            c3940r3 = c3940r2;
                            c2826e3 = c2826e2;
                            c29673d2 = c29673d;
                            Map m147587c3 = c29673d2.m147587c();
                            List m18688c7 = c3940r3.m18688c();
                            AbstractC19074t.m100207e(m18688c7, "purchase.products");
                            m131205e07 = AbstractC25332a0.m131205e0(m18688c7);
                            c3934p = (C3934p) m147587c3.get(m131205e07);
                            c29673d = c29673d2;
                            c2826e2 = c2826e3;
                            c3940r2 = c3940r3;
                        }
                        if (c3934p == null) {
                        }
                        return c3934p;
                    }
                }
                Map m147587c4 = c29673d.m147587c();
                List m18688c8 = c3940r2.m18688c();
                AbstractC19074t.m100207e(m18688c8, "purchase.products");
                m131205e04 = AbstractC25332a0.m131205e0(m18688c8);
                c3934p = (C3934p) m147587c4.get(m131205e04);
                if (c3934p == null) {
                }
                if (c3934p == null) {
                }
                return c3934p;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f137015v;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f137017x;
        if (i11 == 0) {
        }
        Map m147587c42 = c29673d.m147587c();
        List m18688c82 = c3940r2.m18688c();
        AbstractC19074t.m100207e(m18688c82, "purchase.products");
        m131205e04 = AbstractC25332a0.m131205e0(m18688c82);
        c3934p = (C3934p) m147587c42.get(m131205e04);
        if (c3934p == null) {
        }
        if (c3934p == null) {
        }
        return c3934p;
    }

    /* renamed from: E */
    private final Object m147514E(C0880c c0880c, boolean z11, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(c0880c, z11, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:            if (r0.equals("consumable") == false) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:            return r6.m2661a(r5.m13657d(), "", m147586a(), r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:            if (r0.equals("non-consumable") == false) goto L46;     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147515G(C2826e c2826e, AbstractC0878a abstractC0878a, Continuation continuation) {
        String m13655b = c2826e.m13655b();
        int hashCode = m13655b.hashCode();
        if (hashCode != -390443677) {
            if (hashCode != -166371741) {
                if (hashCode == 341203229 && m13655b.equals("subscription") && c2826e.m13656c() != null) {
                    return abstractC0878a.m2661a(c2826e.m13657d(), "", m147586a(), continuation);
                }
            }
            return AbstractC29094b.m145341c(0);
        }
    }

    /* renamed from: H */
    public final void m147516H(C3918k c3918k, C2826e c2826e) {
        EnumC21277b m110219a = AbstractC21278c.m110219a(c3918k.m18652b());
        m147529g0(c2826e.m13657d(), c2826e.m13654a(), m110219a);
        C20884d m147588d = m147588d();
        String m18651a = c3918k.m18651a();
        AbstractC19074t.m100207e(m18651a, "billingResult.debugMessage");
        m147588d.m109173a(m18651a, m110219a);
    }

    /* renamed from: K */
    public final AbstractC3894e m147517K() {
        AbstractC3894e abstractC3894e = f136991f;
        AbstractC19074t.m100205c(abstractC3894e);
        return abstractC3894e;
    }

    /* renamed from: M */
    public final Context m147518M() {
        Context context = f136997l;
        AbstractC19074t.m100205c(context);
        return context;
    }

    /* renamed from: N */
    public final ZIAPDatabase m147519N() {
        return (ZIAPDatabase) f136995j.getValue();
    }

    /* renamed from: O */
    public final CoroutineScope m147520O() {
        InterfaceC27315f interfaceC27315f = f136992g;
        AbstractC19074t.m100205c(interfaceC27315f);
        return CoroutineScopeKt.m112637a(interfaceC27315f);
    }

    /* renamed from: P */
    public static final C22501b m147521P() {
        return f136989d.m147586a();
    }

    /* renamed from: R */
    private final InterfaceC21766a m147522R() {
        InterfaceC21766a interfaceC21766a = f136994i;
        AbstractC19074t.m100205c(interfaceC21766a);
        return interfaceC21766a;
    }

    /* renamed from: S */
    public final InterfaceC23792b m147523S() {
        InterfaceC23792b interfaceC23792b = f136996k;
        AbstractC19074t.m100205c(interfaceC23792b);
        return interfaceC23792b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147524U(C0880c c0880c, boolean z11, boolean z12, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        boolean z13;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f137026u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f137026u = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f137024s;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f137026u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            z13 = ((Boolean) obj).booleanValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        z13 = ((Boolean) obj).booleanValue();
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Object obj2 = m147587c().get(c0880c.m2695c());
                    AbstractC19074t.m100205c(obj2);
                    String m18670c = ((C3934p) obj2).m18670c();
                    int hashCode = m18670c.hashCode();
                    z13 = false;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && m18670c.equals("inapp")) {
                            fVar.f137026u = 2;
                            obj = m147514E(c0880c, z11, fVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            z13 = ((Boolean) obj).booleanValue();
                        }
                    } else if (m18670c.equals("subs")) {
                        if (z12) {
                            C3918k m18653a = C3918k.m18648c().m18655c(0).m18653a();
                            AbstractC19074t.m100207e(m18653a, "newBuilder()\n           …                 .build()");
                            z13 = m147526d0(c0880c, z11, m18653a);
                        } else {
                            fVar.f137026u = 1;
                            obj = m147512A(c0880c, z11, fVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            z13 = ((Boolean) obj).booleanValue();
                        }
                    }
                }
                return AbstractC29094b.m145339a(z13);
            }
        }
        fVar = new f(continuation);
        Object obj3 = fVar.f137024s;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f137026u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(z13);
    }

    /* renamed from: c0 */
    private final AbstractC3894e m147525c0(Context context) {
        AbstractC3894e m18539a = AbstractC3894e.m18528h(context).m18541c(this).m18540b().m18539a();
        AbstractC19074t.m100207e(m18539a, "newBuilder(context)\n    …es()\n            .build()");
        return m18539a;
    }

    /* renamed from: d0 */
    public final boolean m147526d0(C0880c c0880c, boolean z11, C3918k c3918k) {
        C3940r c3940r = new C3940r(c0880c.m2697e(), c0880c.m2698f());
        String m2701i = c0880c.m2701i();
        String m18691f = c3940r.m18691f();
        AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
        int m116341a = AbstractC22500a.m116341a(c3918k);
        AbstractC0878a mo91399I = m147519N().mo91399I();
        m147586a().mo104554k("onConsumeFinished. PurchaseToken: " + m18691f + ", BillingResult: " + c3918k, new Object[0]);
        if (m116341a == 0) {
            if (c0880c.m2696d().length() > 0 && !AbstractC19074t.m100204b(c0880c.m2696d(), "subscription")) {
                BuildersKt__Builders_commonKt.m112540d(m147520O(), null, null, new i(mo91399I, m2701i, m18691f, null), 3, null);
            }
            if (z11) {
                AbstractC19444a.m101697e(new Runnable() { // from class: xi0.b

                    /* renamed from: p */
                    public final /* synthetic */ String f136986p;

                    /* renamed from: q */
                    public final /* synthetic */ C0880c f136987q;

                    public /* synthetic */ RunnableC29671b(String m2701i2, C0880c c0880c2) {
                        r1 = m2701i2;
                        r2 = c0880c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29673d.m147527e0(r1, r2);
                    }
                });
            } else {
                m147586a().m116345w("onVerifyReceiptSucceed (onPurchaseFlow=false)", new Object[0]);
            }
            AbstractC20887g.m109217D(79901, null, 2, null);
            return true;
        }
        m147586a().m116345w("Error while consuming. BillingResult: " + c3918k, new Object[0]);
        if (z11) {
            AbstractC19444a.m101697e(new Runnable() { // from class: xi0.c
                public /* synthetic */ RunnableC29672c() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29673d.m147528f0(C0880c.this);
                }
            });
        } else {
            m147586a().m116345w("onVerifyReceiptFailed (onPurchaseFlow=false)", new Object[0]);
        }
        AbstractC20887g.m109244v(79901, null, 2, null);
        return false;
    }

    /* renamed from: e0 */
    public static final void m147527e0(String str, C0880c c0880c) {
        AbstractC19074t.m100208f(str, "$tranxId");
        AbstractC19074t.m100208f(c0880c, "$billingItem");
        f136989d.m147531i0(str, c0880c.m2700h());
    }

    /* renamed from: f0 */
    public static final void m147528f0(C0880c c0880c) {
        AbstractC19074t.m100208f(c0880c, "$billingItem");
        f136989d.m147530h0(c0880c, true);
    }

    /* renamed from: g0 */
    private final void m147529g0(String str, String str2, EnumC21277b enumC21277b) {
        Object value;
        MutableStateFlow mutableStateFlow = f136998m;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.mo113436i(value, new AbstractC18457a.d(str, str2, enumC21277b)));
    }

    /* renamed from: h0 */
    private final void m147530h0(C0880c c0880c, boolean z11) {
        int i11;
        String m2701i = c0880c.m2701i();
        Map map = f137007v;
        Integer num = (Integer) map.get(m2701i);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        map.put(m2701i, Integer.valueOf(i11 + 1));
        Object obj = f137007v.get(m2701i);
        AbstractC19074t.m100205c(obj);
        int intValue = ((Number) obj).intValue();
        if (intValue == 1) {
            m147529g0(c0880c.m2701i(), c0880c.m2700h(), EnumC21277b.FAIL);
            if (!z11) {
                f137007v.remove(m2701i);
            }
        } else if (intValue > 3) {
            m147529g0(c0880c.m2701i(), c0880c.m2700h(), EnumC21277b.EXCEEDED_MAX_RETRY);
            f137007v.remove(m2701i);
        }
        if (z11 && intValue <= 3) {
            m147573q0(c0880c, false, intValue);
        }
    }

    /* renamed from: i0 */
    private final void m147531i0(String str, String str2) {
        m147529g0(str, str2, EnumC21277b.SUCCESS);
    }

    /* renamed from: o0 */
    public final void m147538o0() {
        f136999n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147542r0(C0880c c0880c, C2826e c2826e, Continuation continuation) {
        o oVar;
        Object m142578e;
        int i11;
        C19051f0 c19051f0;
        C19051f0 c19051f02;
        C19051f0 c19051f03;
        C19051f0 c19051f04;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i12 = oVar.f137061w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                oVar.f137061w = i12 - Integer.MIN_VALUE;
                Object obj = oVar.f137059u;
                m142578e = AbstractC28298d.m142578e();
                i11 = oVar.f137061w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c19051f02 = (C19051f0) oVar.f137058t;
                                c19051f0 = (C19051f0) oVar.f137057s;
                                AbstractC24862s.m129228b(obj);
                                c19051f02.f94928p = ((Boolean) obj).booleanValue();
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            c19051f03 = (C19051f0) oVar.f137058t;
                            c19051f0 = (C19051f0) oVar.f137057s;
                            AbstractC24862s.m129228b(obj);
                            c19051f03.f94928p = ((Boolean) obj).booleanValue();
                        }
                    } else {
                        c19051f04 = (C19051f0) oVar.f137058t;
                        c19051f0 = (C19051f0) oVar.f137057s;
                        AbstractC24862s.m129228b(obj);
                        c19051f04.f94928p = ((Boolean) obj).booleanValue();
                        f136989d.m147538o0();
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19051f0 c19051f05 = new C19051f0();
                    boolean z11 = false;
                    if (c0880c.m2704l() == 0) {
                        if (c2826e != null) {
                            C29673d c29673d = f136989d;
                            c29673d.m147572p0();
                            oVar.f137057s = c19051f05;
                            oVar.f137058t = c19051f05;
                            oVar.f137061w = 1;
                            Object m147575t0 = c29673d.m147575t0(c0880c, true, oVar);
                            if (m147575t0 == m142578e) {
                                return m142578e;
                            }
                            c19051f0 = c19051f05;
                            obj = m147575t0;
                            c19051f04 = c19051f0;
                            c19051f04.f94928p = ((Boolean) obj).booleanValue();
                            f136989d.m147538o0();
                        } else {
                            C29673d c29673d2 = f136989d;
                            oVar.f137057s = c19051f05;
                            oVar.f137058t = c19051f05;
                            oVar.f137061w = 2;
                            Object m147575t02 = c29673d2.m147575t0(c0880c, false, oVar);
                            if (m147575t02 == m142578e) {
                                return m142578e;
                            }
                            c19051f0 = c19051f05;
                            obj = m147575t02;
                            c19051f03 = c19051f0;
                            c19051f03.f94928p = ((Boolean) obj).booleanValue();
                        }
                    } else {
                        m147586a().m116345w(f136990e + "submitBillingItemToServer: The billing item with tranxid " + c0880c.m2701i() + " has been already submitted to server", new Object[0]);
                        if (c2826e != null) {
                            z11 = true;
                        }
                        oVar.f137057s = c19051f05;
                        oVar.f137058t = c19051f05;
                        oVar.f137061w = 3;
                        Object m147524U = m147524U(c0880c, z11, true, oVar);
                        if (m147524U == m142578e) {
                            return m142578e;
                        }
                        c19051f0 = c19051f05;
                        obj = m147524U;
                        c19051f02 = c19051f0;
                        c19051f02.f94928p = ((Boolean) obj).booleanValue();
                    }
                }
                return AbstractC29094b.m145339a(c19051f0.f94928p);
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f137059u;
        m142578e = AbstractC28298d.m142578e();
        i11 = oVar.f137061w;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(c19051f0.f94928p);
    }

    /* renamed from: u0 */
    public static final void m147546u0(C0880c c0880c) {
        AbstractC19074t.m100208f(c0880c, "$billingItem");
        f136989d.m147530h0(c0880c, true);
    }

    /* renamed from: B */
    public final void m147552B(C2826e c2826e) {
        if (c2826e != null && c2826e.m13661h()) {
            f137005t = new C3558b(m147586a());
        }
    }

    /* renamed from: D */
    public final void m147553D() {
        f136998m.setValue(AbstractC18457a.a.f93007b);
    }

    /* renamed from: F */
    public final void m147554F() {
        m147586a().m116345w("deinit, current refCount: " + f137000o, new Object[0]);
        int i11 = f137000o + (-1);
        f137000o = i11;
        if (i11 == 0) {
            m147556J();
        }
    }

    /* renamed from: I */
    public final void m147555I(String str, String str2, EnumC21279d enumC21279d, String str3) {
        Object value;
        AbstractC19074t.m100208f(str, "tranxId");
        AbstractC19074t.m100208f(str2, "productId");
        AbstractC19074t.m100208f(enumC21279d, "responseCode");
        AbstractC19074t.m100208f(str3, "jsCallback");
        MutableStateFlow mutableStateFlow = f136998m;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.mo113436i(value, new AbstractC18457a.c(str, str2, enumC21279d, str3)));
    }

    /* renamed from: J */
    public final void m147556J() {
        m147586a().m116345w("Destroying the Billing Manager", new Object[0]);
        try {
            AbstractC3894e abstractC3894e = f136991f;
            if (abstractC3894e != null) {
                abstractC3894e.mo18531c();
            }
            InterfaceC27315f interfaceC27315f = f136992g;
            if (interfaceC27315f != null) {
                JobKt__JobKt.m112765d(interfaceC27315f, null, 1, null);
            }
            m147538o0();
            m147586a().mo104554k("Billing Manager was destroyed", new Object[0]);
        } catch (Exception e11) {
            m147586a().mo104553f(e11, "Destroy Billing Manager fail", new Object[0]);
        }
    }

    /* renamed from: L */
    public final int m147557L() {
        return m147517K().mo18533e();
    }

    /* renamed from: Q */
    public final AbstractC3559c m147558Q() {
        return f137005t;
    }

    /* renamed from: T */
    public final StateFlow m147559T() {
        return f137008w;
    }

    /* renamed from: V */
    public final void m147560V() {
        String str;
        if (f136994i != null && f136996k != null && f136997l != null) {
            if (f137000o == 0) {
                f137001p = C32216b.f148610a.m155340a();
                m147586a().m116345w("CurrentConfig: ", new Object[0]);
                InterfaceC32215a interfaceC32215a = f137001p;
                C29673d c29673d = f136989d;
                c29673d.m147586a().m116345w("enable: " + interfaceC32215a.mo155338a(), new Object[0]);
                c29673d.m147586a().m116345w("verifyUrl: " + interfaceC32215a.mo155339b(), new Object[0]);
            }
            f137000o++;
            if (f137001p.mo155338a()) {
                if (f136991f == null) {
                    f136991f = m147525c0(m147518M());
                }
                int mo18533e = m147517K().mo18533e();
                if (mo18533e != 0) {
                    if (mo18533e != 1) {
                        if (mo18533e != 2) {
                            if (mo18533e != 3) {
                                str = "Unknown";
                            } else {
                                str = "Closed";
                            }
                        } else {
                            str = "Connected";
                        }
                    } else {
                        str = "Connecting";
                    }
                } else {
                    str = "Disconnected";
                }
                m147586a().m116345w("Call init with connection state: " + str, new Object[0]);
                if (m147517K().mo18533e() != 2 && m147517K().mo18533e() != 1) {
                    if (m147517K().mo18533e() == 3) {
                        f136991f = m147525c0(m147518M());
                    }
                    f136992g = SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c().mo112861G0()).mo112823d0(f136993h);
                    BuildersKt__Builders_commonKt.m112540d(m147520O(), Dispatchers.m112680b(), null, new g(null), 2, null);
                    new C21746c(m147517K(), m147586a()).mo112193b(f137003r);
                    f137006u = new C30995b(m147517K(), m147586a());
                    return;
                }
                m147586a().m116345w("Skip init", new Object[0]);
                return;
            }
            return;
        }
        throw new IllegalStateException("Call injectDependencies first!");
    }

    /* renamed from: W */
    public final void m147561W(InterfaceC21766a interfaceC21766a, InterfaceC23792b interfaceC23792b, Context context, InterfaceC18016a interfaceC18016a) {
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18016a, "billingSharedPreferenceConfig");
        f136994i = interfaceC21766a;
        f136996k = interfaceC23792b;
        f136997l = context.getApplicationContext();
        f137002q = interfaceC18016a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:            if (r5.equals("priceChangeConfirmation") == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:            if (r5.equals("subscriptionsUpdate") != false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:            if (r5.equals("subscriptions") == false) goto L53;     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m147562X(String str) {
        AbstractC19074t.m100208f(str, "feature");
        C3918k mo18534f = m147517K().mo18534f(str);
        AbstractC19074t.m100207e(mo18534f, "billingClient.isFeatureSupported(feature)");
        switch (str.hashCode()) {
            case -422092961:
                break;
            case 97314:
                if (str.equals("bbb")) {
                    str = "inAppMessaging";
                    break;
                }
                str = "Unknown";
                break;
            case 101286:
                if (str.equals("fff")) {
                    str = "productDetails";
                    break;
                }
                str = "Unknown";
                break;
            case 207616302:
                break;
            case 1987365622:
                break;
            default:
                str = "Unknown";
                break;
        }
        m147586a().m116345w("Check feature " + str + " supported result: " + mo18534f, new Object[0]);
        int m18652b = mo18534f.m18652b();
        if (m18652b == -2 || m18652b != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public final EnumC21276a m147563Y() {
        AbstractC3894e abstractC3894e = f136991f;
        if (f137001p.mo155338a() && abstractC3894e != null && abstractC3894e.mo18533e() == 2) {
            return EnumC21276a.DEVICE_SUPPORTED;
        }
        return EnumC21276a.DEVICE_UNSUPPORTED;
    }

    /* renamed from: Z */
    public final C3918k m147564Z(Activity activity, C3914j c3914j) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(c3914j, "billingFlowParams");
        C3918k mo18535g = m147517K().mo18535g(activity, c3914j);
        AbstractC19074t.m100207e(mo18535g, "billingClient.launchBill…ivity, billingFlowParams)");
        return mo18535g;
    }

    /* renamed from: a0 */
    public final void m147565a0(Activity activity, String str, C2826e c2826e) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(str, "callback");
        AbstractC19074t.m100208f(c2826e, "transactionData");
        if (f137001p.mo155338a()) {
            AbstractC0878a mo91399I = m147519N().mo91399I();
            if (!activity.isFinishing()) {
                BuildersKt__Builders_commonKt.m112540d(m147520O(), null, null, new h(str, mo91399I, c2826e, this, activity, null), 3, null);
                return;
            }
            return;
        }
        m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.DEVICE_UNSUPPORTED, str);
    }

    @Override // com.android.billingclient.api.InterfaceC3949u
    /* renamed from: b */
    public void mo18700b(C3918k c3918k, List list) {
        String str;
        Set m131555i;
        Set m131555i2;
        Set m131555i3;
        AbstractC19074t.m100208f(c3918k, "billingResult");
        int m116341a = AbstractC22500a.m116341a(c3918k);
        AbstractC0878a mo91399I = m147519N().mo91399I();
        C2826e c2826e = f136999n;
        C22501b m147586a = m147586a();
        if (list != null) {
            str = AbstractC25332a0.m131214n0(list, null, null, null, 0, null, null, 63, null);
        } else {
            str = null;
        }
        m147586a.m116346x(true, "onPurchaseUpdated() - Purchases: " + str + " BillingResult: " + c3918k, new Object[0]);
        m131555i = AbstractC25379x0.m131555i(-2, 4, 8, 3);
        m131555i2 = AbstractC25379x0.m131555i(2, 12, 6, -1);
        m131555i3 = AbstractC25379x0.m131555i(1, 5);
        if (m116341a == 0) {
            BuildersKt__Builders_commonKt.m112540d(m147520O(), null, null, new j(list, c2826e, null), 3, null);
            return;
        }
        if (m116341a == 7) {
            if (c2826e != null) {
                m147516H(c3918k, c2826e);
                m147538o0();
                return;
            }
            return;
        }
        if (m131555i3.contains(Integer.valueOf(m116341a)) || m131555i.contains(Integer.valueOf(m116341a))) {
            BuildersKt__Builders_commonKt.m112540d(m147520O(), null, null, new k(c2826e, mo91399I, c3918k, null), 3, null);
        } else if (m131555i2.contains(Integer.valueOf(m116341a))) {
            BuildersKt__Builders_commonKt.m112540d(m147520O(), null, null, new l(c2826e, mo91399I, c3918k, null), 3, null);
        }
    }

    /* renamed from: b0 */
    public final void m147566b0(SQLiteDatabase sQLiteDatabase, Context context) {
        AbstractC19074t.m100208f(sQLiteDatabase, "zaloDb");
        AbstractC19074t.m100208f(context, "context");
        f136997l = context.getApplicationContext();
        m147519N().m91400J(sQLiteDatabase, m147586a());
    }

    /* renamed from: j0 */
    public final Object m147567j0(List list, C2826e c2826e, Continuation continuation) {
        return m147568k0(list, m147517K(), c2826e, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(1:(11:13|14|15|16|17|18|(4:21|22|(2:24|(3:26|27|(1:29)(7:31|32|33|(4:38|(5:40|41|42|43|(1:45)(9:46|47|48|(1:50)|15|16|17|18|(1:19)))(6:55|56|57|58|59|(1:61)(9:62|63|48|(0)|15|16|17|18|(1:19)))|53|54)|35|36|37))(1:68))(1:70)|69)|71|72|36|37)(2:74|75))(14:76|77|63|48|(0)|15|16|17|18|(1:19)|71|72|36|37))(14:78|79|47|48|(0)|15|16|17|18|(1:19)|71|72|36|37))(10:80|81|82|83|32|33|(0)|35|36|37))(7:86|18|(1:19)|71|72|36|37)))|88|6|7|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x016b -> B:15:0x0047). Please report as a decompilation issue!!! */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object m147568k0(List list, AbstractC3894e abstractC3894e, C2826e c2826e, Continuation continuation) {
        m mVar;
        C29673d c29673d;
        Object m142578e;
        int i11;
        C29673d c29673d2;
        boolean z11;
        Iterator it;
        boolean z12;
        Object obj;
        m mVar2;
        AbstractC0878a abstractC0878a;
        C2826e c2826e2;
        C2826e c2826e3;
        AbstractC0878a abstractC0878a2;
        Iterator it2;
        C0880c c0880c;
        C3940r c3940r;
        AbstractC0878a abstractC0878a3;
        C2826e c2826e4;
        C29673d c29673d3;
        C29673d c29673d4;
        C2826e c2826e5;
        AbstractC0878a abstractC0878a4;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i12 = mVar.f137056z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                mVar.f137056z = i12 - Integer.MIN_VALUE;
                c29673d = this;
                Object obj2 = mVar.f137054x;
                m142578e = AbstractC28298d.m142578e();
                i11 = mVar.f137056z;
                int i13 = 2;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    it2 = (Iterator) mVar.f137052v;
                                    abstractC0878a2 = (AbstractC0878a) mVar.f137051u;
                                    c2826e3 = (C2826e) mVar.f137050t;
                                    c29673d2 = (C29673d) mVar.f137049s;
                                    AbstractC24862s.m129228b(obj2);
                                    Object obj3 = m142578e;
                                    mVar2 = mVar;
                                    abstractC0878a = abstractC0878a2;
                                    it = it2;
                                    obj = obj3;
                                    i13 = 2;
                                    C2826e c2826e6 = c2826e3;
                                    z12 = ((Boolean) obj2).booleanValue();
                                    c2826e2 = c2826e6;
                                    while (it.hasNext()) {
                                        C3940r c3940r2 = (C3940r) it.next();
                                        if (c3940r2.m18689d() == 1) {
                                            AbstractC19074t.m100207e(c3940r2.m18688c(), "purchase.products");
                                            if (!r14.isEmpty()) {
                                                mVar2.f137049s = c29673d2;
                                                mVar2.f137050t = c2826e2;
                                                mVar2.f137051u = abstractC0878a;
                                                mVar2.f137052v = it;
                                                mVar2.f137053w = c3940r2;
                                                mVar2.f137056z = 1;
                                                Object m147513C = c29673d2.m147513C(c2826e2, c3940r2, mVar2);
                                                if (m147513C == obj) {
                                                    return obj;
                                                }
                                                c2826e4 = c2826e2;
                                                abstractC0878a3 = abstractC0878a;
                                                mVar = mVar2;
                                                m142578e = obj;
                                                it2 = it;
                                                obj2 = m147513C;
                                                c3940r = c3940r2;
                                                c29673d3 = c29673d2;
                                                try {
                                                } catch (Exception unused) {
                                                    c29673d4 = c29673d3;
                                                }
                                                if (((C3934p) obj2) != null) {
                                                    if (c2826e4 != null) {
                                                        try {
                                                            AbstractC3559c abstractC3559c = f137005t;
                                                            String mo155339b = f137001p.mo155339b();
                                                            mVar.f137049s = c29673d3;
                                                            mVar.f137050t = c2826e4;
                                                            mVar.f137051u = abstractC0878a3;
                                                            mVar.f137052v = it2;
                                                            mVar.f137053w = null;
                                                            mVar.f137056z = i13;
                                                            Object mo18081d = abstractC3559c.mo18081d(abstractC0878a3, c2826e4, c3940r, mo155339b, mVar);
                                                            if (mo18081d == m142578e) {
                                                                return m142578e;
                                                            }
                                                            c29673d2 = c29673d4;
                                                            c2826e3 = c2826e5;
                                                            obj2 = mo18081d;
                                                            abstractC0878a2 = abstractC0878a4;
                                                            c0880c = (C0880c) obj2;
                                                            mVar.f137049s = c29673d2;
                                                            mVar.f137050t = c2826e3;
                                                            mVar.f137051u = abstractC0878a2;
                                                            mVar.f137052v = it2;
                                                            mVar.f137056z = 4;
                                                            obj2 = c29673d2.m147542r0(c0880c, c2826e3, mVar);
                                                            if (obj2 == m142578e) {
                                                                return m142578e;
                                                            }
                                                            Object obj32 = m142578e;
                                                            mVar2 = mVar;
                                                            abstractC0878a = abstractC0878a2;
                                                            it = it2;
                                                            obj = obj32;
                                                            i13 = 2;
                                                            C2826e c2826e62 = c2826e3;
                                                            z12 = ((Boolean) obj2).booleanValue();
                                                            c2826e2 = c2826e62;
                                                            while (it.hasNext()) {
                                                            }
                                                        } catch (Exception unused2) {
                                                        }
                                                        c29673d4 = c29673d3;
                                                        c2826e5 = c2826e4;
                                                        abstractC0878a4 = abstractC0878a3;
                                                    } else {
                                                        C2826e c2826e7 = c2826e4;
                                                        AbstractC0878a abstractC0878a5 = abstractC0878a3;
                                                        C29673d c29673d5 = c29673d3;
                                                        try {
                                                            C3557a c3557a = f137004s;
                                                            String mo155339b2 = f137001p.mo155339b();
                                                            mVar.f137049s = c29673d5;
                                                            mVar.f137050t = c2826e7;
                                                            mVar.f137051u = abstractC0878a5;
                                                            mVar.f137052v = it2;
                                                            mVar.f137053w = null;
                                                            mVar.f137056z = 3;
                                                            Object mo18081d2 = c3557a.mo18081d(abstractC0878a5, null, c3940r, mo155339b2, mVar);
                                                            if (mo18081d2 == m142578e) {
                                                                return m142578e;
                                                            }
                                                            c29673d2 = c29673d5;
                                                            c2826e3 = c2826e7;
                                                            obj2 = mo18081d2;
                                                            abstractC0878a2 = abstractC0878a5;
                                                            c0880c = (C0880c) obj2;
                                                            mVar.f137049s = c29673d2;
                                                            mVar.f137050t = c2826e3;
                                                            mVar.f137051u = abstractC0878a2;
                                                            mVar.f137052v = it2;
                                                            mVar.f137056z = 4;
                                                            obj2 = c29673d2.m147542r0(c0880c, c2826e3, mVar);
                                                            if (obj2 == m142578e) {
                                                            }
                                                            Object obj322 = m142578e;
                                                            mVar2 = mVar;
                                                            abstractC0878a = abstractC0878a2;
                                                            it = it2;
                                                            obj = obj322;
                                                            i13 = 2;
                                                            C2826e c2826e622 = c2826e3;
                                                            z12 = ((Boolean) obj2).booleanValue();
                                                            c2826e2 = c2826e622;
                                                            while (it.hasNext()) {
                                                            }
                                                        } catch (Exception unused3) {
                                                            c29673d4 = c29673d5;
                                                        }
                                                    }
                                                    c29673d2 = c29673d4;
                                                    c29673d2.m147553D();
                                                }
                                                z11 = false;
                                                return AbstractC29094b.m145339a(z11);
                                            }
                                        }
                                        i13 = 2;
                                    }
                                    z11 = z12;
                                    return AbstractC29094b.m145339a(z11);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it2 = (Iterator) mVar.f137052v;
                            abstractC0878a2 = (AbstractC0878a) mVar.f137051u;
                            c2826e3 = (C2826e) mVar.f137050t;
                            c29673d2 = (C29673d) mVar.f137049s;
                            AbstractC24862s.m129228b(obj2);
                            c0880c = (C0880c) obj2;
                            mVar.f137049s = c29673d2;
                            mVar.f137050t = c2826e3;
                            mVar.f137051u = abstractC0878a2;
                            mVar.f137052v = it2;
                            mVar.f137056z = 4;
                            obj2 = c29673d2.m147542r0(c0880c, c2826e3, mVar);
                            if (obj2 == m142578e) {
                            }
                            Object obj3222 = m142578e;
                            mVar2 = mVar;
                            abstractC0878a = abstractC0878a2;
                            it = it2;
                            obj = obj3222;
                            i13 = 2;
                            C2826e c2826e6222 = c2826e3;
                            z12 = ((Boolean) obj2).booleanValue();
                            c2826e2 = c2826e6222;
                            while (it.hasNext()) {
                            }
                            z11 = z12;
                            return AbstractC29094b.m145339a(z11);
                        }
                        it2 = (Iterator) mVar.f137052v;
                        abstractC0878a2 = (AbstractC0878a) mVar.f137051u;
                        c2826e3 = (C2826e) mVar.f137050t;
                        c29673d2 = (C29673d) mVar.f137049s;
                        AbstractC24862s.m129228b(obj2);
                        c0880c = (C0880c) obj2;
                        mVar.f137049s = c29673d2;
                        mVar.f137050t = c2826e3;
                        mVar.f137051u = abstractC0878a2;
                        mVar.f137052v = it2;
                        mVar.f137056z = 4;
                        obj2 = c29673d2.m147542r0(c0880c, c2826e3, mVar);
                        if (obj2 == m142578e) {
                        }
                        Object obj32222 = m142578e;
                        mVar2 = mVar;
                        abstractC0878a = abstractC0878a2;
                        it = it2;
                        obj = obj32222;
                        i13 = 2;
                        C2826e c2826e62222 = c2826e3;
                        z12 = ((Boolean) obj2).booleanValue();
                        c2826e2 = c2826e62222;
                        while (it.hasNext()) {
                        }
                        z11 = z12;
                        return AbstractC29094b.m145339a(z11);
                    }
                    C3940r c3940r3 = (C3940r) mVar.f137053w;
                    Iterator it3 = (Iterator) mVar.f137052v;
                    AbstractC0878a abstractC0878a6 = (AbstractC0878a) mVar.f137051u;
                    C2826e c2826e8 = (C2826e) mVar.f137050t;
                    c29673d3 = (C29673d) mVar.f137049s;
                    try {
                        AbstractC24862s.m129228b(obj2);
                        c3940r = c3940r3;
                        it2 = it3;
                        abstractC0878a3 = abstractC0878a6;
                        c2826e4 = c2826e8;
                        if (((C3934p) obj2) != null) {
                        }
                    } catch (Exception unused4) {
                        c29673d2 = c29673d3;
                    }
                    z11 = false;
                    return AbstractC29094b.m145339a(z11);
                }
                AbstractC24862s.m129228b(obj2);
                AbstractC0878a mo91399I = m147519N().mo91399I();
                c29673d2 = c29673d;
                it = list.iterator();
                z12 = true;
                obj = m142578e;
                mVar2 = mVar;
                abstractC0878a = mo91399I;
                c2826e2 = c2826e;
                while (it.hasNext()) {
                }
                z11 = z12;
                return AbstractC29094b.m145339a(z11);
            }
        }
        c29673d = this;
        mVar = new m(continuation);
        Object obj22 = mVar.f137054x;
        m142578e = AbstractC28298d.m142578e();
        i11 = mVar.f137056z;
        int i132 = 2;
        if (i11 == 0) {
        }
    }

    /* renamed from: l0 */
    public final Object m147569l0(String str, String str2, Continuation continuation) {
        return m147590f(str, str2, m147517K(), continuation);
    }

    /* renamed from: m0 */
    public final Object m147570m0(String str, Continuation continuation) {
        return m147591g(m147517K(), str, continuation);
    }

    /* renamed from: n0 */
    public final Object m147571n0(Continuation continuation) {
        return m147593i(m147517K(), continuation);
    }

    /* renamed from: p0 */
    public final void m147572p0() {
        f136998m.setValue(AbstractC18457a.b.f93008b);
    }

    /* renamed from: q0 */
    public final void m147573q0(C0880c c0880c, boolean z11, int i11) {
        Object value;
        AbstractC19074t.m100208f(c0880c, "billingItem");
        MutableStateFlow mutableStateFlow = f136998m;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.mo113436i(value, new AbstractC18457a.e(c0880c, z11, i11)));
    }

    /* renamed from: s0 */
    public final void m147574s0(C2826e c2826e) {
        AbstractC19074t.m100208f(c2826e, "transactionData");
        f136999n = c2826e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147575t0(C0880c c0880c, boolean z11, Continuation continuation) {
        p pVar;
        Object obj;
        Object m142578e;
        int i11;
        C0880c c0880c2;
        boolean z12;
        C29673d c29673d;
        AbstractC0878a abstractC0878a;
        boolean z13;
        int intValue;
        int i12;
        int i13;
        C0880c c0880c3;
        int i14;
        boolean z14;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i15 = pVar.f137069z;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f137069z = i15 - Integer.MIN_VALUE;
                obj = pVar.f137067x;
                m142578e = AbstractC28298d.m142578e();
                i11 = pVar.f137069z;
                boolean z15 = false;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                i14 = pVar.f137066w;
                                AbstractC24862s.m129228b(obj);
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                AbstractC20887g.m109217D(i14, null, 2, null);
                                z14 = booleanValue;
                                if (z14) {
                                    z15 = true;
                                }
                                return AbstractC29094b.m145339a(z15);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = pVar.f137066w;
                        z12 = pVar.f137065v;
                        c0880c3 = (C0880c) pVar.f137063t;
                        c29673d = (C29673d) pVar.f137062s;
                        AbstractC24862s.m129228b(obj);
                        int intValue2 = ((Number) obj).intValue();
                        c29673d.m147586a().m116345w("update submit state by purchase token: " + c0880c3.m2699g() + ". Affected row: " + intValue2, new Object[0]);
                        pVar.f137062s = null;
                        pVar.f137063t = null;
                        pVar.f137066w = i13;
                        pVar.f137069z = 3;
                        obj = c29673d.m147524U(c0880c3, z12, true, pVar);
                        if (obj != m142578e) {
                            return m142578e;
                        }
                        i14 = i13;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        AbstractC20887g.m109217D(i14, null, 2, null);
                        z14 = booleanValue2;
                        if (z14) {
                        }
                        return AbstractC29094b.m145339a(z15);
                    }
                    int i16 = pVar.f137066w;
                    z12 = pVar.f137065v;
                    abstractC0878a = (AbstractC0878a) pVar.f137064u;
                    C0880c c0880c4 = (C0880c) pVar.f137063t;
                    C29673d c29673d2 = (C29673d) pVar.f137062s;
                    AbstractC24862s.m129228b(obj);
                    c0880c2 = c0880c4;
                    c29673d = c29673d2;
                    z13 = i16;
                } else {
                    AbstractC24862s.m129228b(obj);
                    AbstractC0878a mo91399I = m147519N().mo91399I();
                    C3940r c3940r = new C3940r(c0880c.m2697e(), c0880c.m2698f());
                    C2824c c2824c = new C2824c(m147522R(), m147586a());
                    String m2701i = c0880c.m2701i();
                    String m18687b = c3940r.m18687b();
                    AbstractC19074t.m100207e(m18687b, "purchase.originalJson");
                    String m18692g = c3940r.m18692g();
                    AbstractC19074t.m100207e(m18692g, "purchase.signature");
                    String m2703k = c0880c.m2703k();
                    pVar.f137062s = this;
                    c0880c2 = c0880c;
                    pVar.f137063t = c0880c2;
                    pVar.f137064u = mo91399I;
                    pVar.f137065v = z11;
                    pVar.f137066w = 0;
                    pVar.f137069z = 1;
                    Object m13650b = c2824c.m13650b(m2701i, m18687b, m18692g, m2703k, pVar);
                    if (m13650b == m142578e) {
                        return m142578e;
                    }
                    z12 = z11;
                    c29673d = this;
                    abstractC0878a = mo91399I;
                    obj = m13650b;
                    z13 = false;
                }
                intValue = ((Number) obj).intValue();
                if (intValue == -2001) {
                    if (intValue != -5) {
                        i12 = 79907;
                    } else {
                        i12 = 79902;
                    }
                } else {
                    i12 = 79903;
                }
                if (intValue == -2001 && intValue != -5 && intValue != 0) {
                    if (z12) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: xi0.a
                            public /* synthetic */ RunnableC29670a() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C29673d.m147546u0(C0880c.this);
                            }
                        });
                        z14 = z13;
                    } else {
                        c29673d.m147586a().m116345w("onVerifyReceiptFailed (onPurchaseFlow=false)", new Object[0]);
                        z14 = z13;
                    }
                    if (z14) {
                    }
                    return AbstractC29094b.m145339a(z15);
                }
                String m2699g = c0880c2.m2699g();
                pVar.f137062s = c29673d;
                pVar.f137063t = c0880c2;
                pVar.f137064u = null;
                pVar.f137065v = z12;
                pVar.f137066w = i12;
                pVar.f137069z = 2;
                obj = abstractC0878a.mo2673m(m2699g, 1, pVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                i13 = i12;
                c0880c3 = c0880c2;
                int intValue22 = ((Number) obj).intValue();
                c29673d.m147586a().m116345w("update submit state by purchase token: " + c0880c3.m2699g() + ". Affected row: " + intValue22, new Object[0]);
                pVar.f137062s = null;
                pVar.f137063t = null;
                pVar.f137066w = i13;
                pVar.f137069z = 3;
                obj = c29673d.m147524U(c0880c3, z12, true, pVar);
                if (obj != m142578e) {
                }
            }
        }
        pVar = new p(continuation);
        obj = pVar.f137067x;
        m142578e = AbstractC28298d.m142578e();
        i11 = pVar.f137069z;
        boolean z152 = false;
        if (i11 == 0) {
        }
        intValue = ((Number) obj).intValue();
        if (intValue == -2001) {
        }
        if (intValue == -2001) {
        }
        String m2699g2 = c0880c2.m2699g();
        pVar.f137062s = c29673d;
        pVar.f137063t = c0880c2;
        pVar.f137064u = null;
        pVar.f137065v = z12;
        pVar.f137066w = i12;
        pVar.f137069z = 2;
        obj = abstractC0878a.mo2673m(m2699g2, 1, pVar);
        if (obj != m142578e) {
        }
    }
}
