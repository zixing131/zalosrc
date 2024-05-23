package com.zing.zalo.zalocloud.offload;

import am.AbstractC0924m0;
import androidx.work.AbstractC2151i0;
import androidx.work.C2135a0;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.EnumC2240j;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import on0.AbstractC24341v;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: com.zing.zalo.zalocloud.offload.a */
/* loaded from: classes7.dex */
public final class C16874a {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.zalocloud.offload.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C16874a m90147a() {
            return b.f85866a.m90148a();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.a$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f85866a = new b();

        /* renamed from: b */
        private static final C16874a f85867b = new C16874a();

        private b() {
        }

        /* renamed from: a */
        public final C16874a m90148a() {
            return f85867b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85868t;

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
            AbstractC28298d.m142578e();
            if (this.f85868t == 0) {
                AbstractC24862s.m129228b(obj);
                C2149h0 m90137m = C16874a.m90137m(C16874a.this, null, 1, null);
                if (m90137m == null) {
                    return C24848g0.f119245a;
                }
                if (m90137m.m11542c() == C2149h0.c.RUNNING) {
                    AbstractC0924m0.m3324Oq(true);
                    C16874a.m90133f(C16874a.this, null, 1, null);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85870t;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85870t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C16874a c16874a = C16874a.this;
                this.f85870t = 1;
                if (c16874a.m90140r(this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.offload.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85872t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            C2149h0.c cVar;
            AbstractC28298d.m142578e();
            if (this.f85872t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC2151i0 m11547h = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c());
                AbstractC19074t.m100207e(m11547h, "getInstance(...)");
                String str = CoreUtility.f89233i;
                if (C16874a.this.m90139o()) {
                    long m90138n = C16874a.this.m90138n();
                    C16874a c16874a = C16874a.this;
                    AbstractC19074t.m100205c(str);
                    C2149h0 m90144l = c16874a.m90144l(str);
                    if (m90144l != null) {
                        cVar = m90144l.m11542c();
                    } else {
                        cVar = null;
                    }
                    C2135a0.a aVar = new C2135a0.a(ZaloCloudOffloadWorker.class, m90138n, TimeUnit.MILLISECONDS);
                    C24860q[] c24860qArr = {AbstractC24866w.m129235a("UserUid", str)};
                    C2148h.a aVar2 = new C2148h.a();
                    C24860q c24860q = c24860qArr[0];
                    aVar2.m11535b((String) c24860q.m129215c(), c24860q.m129216d());
                    C2148h m11534a = aVar2.m11534a();
                    AbstractC19074t.m100207e(m11534a, "dataBuilder.build()");
                    m11547h.mo11553e(C16874a.this.m90136k(str), EnumC2240j.KEEP, (C2135a0) ((C2135a0.a) aVar.m11873n(m11534a)).m11863b());
                    C26676b.m136955e("SMLZCloudOffloadScheduler", "Scheduled offload worker with interval of " + m90138n + " ms, lastState: " + cVar, C26676b.b.f126338w);
                } else {
                    C16874a c16874a2 = C16874a.this;
                    AbstractC19074t.m100205c(str);
                    c16874a2.m90141e(str);
                    C26676b.m136955e("SMLZCloudOffloadScheduler", "Cancelled offload worker", C26676b.b.f126338w);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m90133f(C16874a c16874a, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
        c16874a.m90141e(str);
    }

    /* renamed from: h */
    public static /* synthetic */ void m90134h(C16874a c16874a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c16874a.m90142g(z11);
    }

    /* renamed from: j */
    private final CoroutineScope m90135j() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: k */
    public final String m90136k(String str) {
        return "ZaloCloudOffloadWorker:" + str;
    }

    /* renamed from: m */
    public static /* synthetic */ C2149h0 m90137m(C16874a c16874a, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
        return c16874a.m90144l(str);
    }

    /* renamed from: n */
    public final long m90138n() {
        return C16805b.Companion.m89811a().m89803k().m89776a() * 86400000;
    }

    /* renamed from: o */
    public final boolean m90139o() {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            return C31831a.Companion.m152940a().m152937u();
        }
        C26676b.m136955e("SMLZCloudOffloadScheduler", "Current userUid is null", C26676b.b.f126338w);
        return false;
    }

    /* renamed from: r */
    public final Object m90140r(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new e(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e */
    public final void m90141e(String str) {
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11550b(m90136k(str));
    }

    /* renamed from: g */
    public final void m90142g(boolean z11) {
        if (z11) {
            BuildersKt__Builders_commonKt.m112540d(m90135j(), Dispatchers.m112680b(), null, new c(null), 2, null);
        } else {
            m90133f(this, null, 1, null);
        }
    }

    /* renamed from: i */
    public final void m90143i() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 24);
        C2149h0 m90137m = m90137m(this, null, 1, null);
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudOffloadScheduler").mo104556o(8, m127130z + "\nworkInfo: " + m90137m + m127130z2, new Object[0]);
    }

    /* renamed from: l */
    public final C2149h0 m90144l(String str) {
        Object m131206f0;
        AbstractC19074t.m100208f(str, "userUid");
        Object obj = AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11557j(m90136k(str)).get();
        AbstractC19074t.m100207e(obj, "get(...)");
        m131206f0 = AbstractC25332a0.m131206f0((List) obj);
        return (C2149h0) m131206f0;
    }

    /* renamed from: p */
    public final void m90145p() {
        m90146q();
    }

    /* renamed from: q */
    public final Job m90146q() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(m90135j(), null, null, new d(null), 3, null);
        return m112540d;
    }
}
