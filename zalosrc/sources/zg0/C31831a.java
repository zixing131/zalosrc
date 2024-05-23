package zg0;

import ah0.C0860a;
import am.AbstractC0924m0;
import am.C0943w;
import ch0.AbstractC3489d;
import com.zing.zalo.data.zalocloud.model.api.CloudSettings;
import com.zing.zalo.zalocloud.configs.C16805b;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.List;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nh0.InterfaceC23792b;
import nl.C23870a;
import og0.C24252c;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p056cj.AbstractC3536d;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sl.C26318c;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: zg0.a */
/* loaded from: classes7.dex */
public final class C31831a {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f146064e;

    /* renamed from: a */
    private final C16805b f146065a;

    /* renamed from: b */
    private final C23870a f146066b;

    /* renamed from: c */
    private final C0860a f146067c;

    /* renamed from: d */
    private final InterfaceC23792b f146068d;

    /* renamed from: zg0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f146069q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31831a mo12V4() {
            return c.f146070a.m152941a();
        }
    }

    /* renamed from: zg0.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31831a m152940a() {
            return (C31831a) C31831a.f146064e.getValue();
        }
    }

    /* renamed from: zg0.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f146070a = new c();

        /* renamed from: b */
        private static final C31831a f146071b;

        static {
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C0860a m120691m2 = AbstractC23306f.m120691m2();
            AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f146071b = new C31831a(m120633X1, m120679j2, m120691m2, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C31831a m152941a() {
            return f146071b;
        }
    }

    /* renamed from: zg0.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f146072t;

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
            int i11 = this.f146072t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C31831a.this.f146066b;
                this.f146072t = 1;
                obj = c23870a.m124789R(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            CloudSettings cloudSettings = (CloudSettings) obj;
            if (cloudSettings != null) {
                C31831a.this.m152926v(cloudSettings);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg0.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f146074t;

        /* renamed from: v */
        final /* synthetic */ C26318c f146076v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18494a f146077w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C26318c c26318c, InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f146076v = c26318c;
            this.f146077w = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f146076v, this.f146077w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f146074t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C31831a.this.f146066b;
                C26318c c26318c = this.f146076v;
                this.f146074t = 1;
                obj = c23870a.m124842x1(c26318c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            CloudSettings cloudSettings = (CloudSettings) obj;
            if (cloudSettings != null) {
                C31831a c31831a = C31831a.this;
                InterfaceC18494a interfaceC18494a = this.f146077w;
                c31831a.f146066b.m124809f1(cloudSettings);
                interfaceC18494a.mo12V4();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f146069q);
        f146064e = m129210a;
    }

    public C31831a(C16805b c16805b, C23870a c23870a, C0860a c0860a, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c16805b, "cloudConfigs");
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f146065a = c16805b;
        this.f146066b = c23870a;
        this.f146067c = c0860a;
        this.f146068d = interfaceC23792b;
    }

    /* renamed from: h */
    private final CloudSettings m152919h() {
        return this.f146066b.m124816l0();
    }

    /* renamed from: k */
    public static final C31831a m152920k() {
        return Companion.m152940a();
    }

    /* renamed from: n */
    private final boolean m152921n(C17945a0 c17945a0) {
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95316z8()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m152922o() {
        if (this.f146068d.mo124314i() - AbstractC0924m0.m4276v2() >= 259200000) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final boolean m152923q(long j11) {
        if (1 > j11 || j11 > m152931i()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private final boolean m152924r(C17945a0 c17945a0) {
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95306y8() && !c17945a0.m95276v6() && !c17945a0.m95316z8()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private final boolean m152925t(C17945a0 c17945a0, boolean z11) {
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (!m152935p(mo95039W2) || !m152924r(c17945a0) || c17945a0.m94879E5() || c17945a0.m95089b4() == 0 || c17945a0.m95089b4() == 1) {
            return false;
        }
        if (z11 && !m152921n(c17945a0) && !m152923q(AbstractC3536d.m17981c(c17945a0))) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m152926v(CloudSettings cloudSettings) {
        try {
            if (!cloudSettings.m41312g()) {
                C26676b.m136955e("SMLZCloudSettings", "onFetchCloudSettingsSuccess(): INVALID", C26676b.b.f126335t);
                return;
            }
            C24252c.f117152a.m126603j(cloudSettings.m41310e());
            this.f146066b.m124809f1(cloudSettings);
            AbstractC0924m0.m4235tj(this.f146068d.mo124314i());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudSettings", e11);
        }
    }

    /* renamed from: d */
    public final void m152927d() {
        if (!this.f146065a.m89807v()) {
            return;
        }
        CloudSettings m152919h = m152919h();
        if (m152919h == null || !m152919h.m41312g() || m152922o()) {
            m152930g();
        }
    }

    /* renamed from: e */
    public final void m152928e() {
        C26676b.m136957g("SMLZCloudSettings", "clearAllMemCache()", null, 4, null);
    }

    /* renamed from: f */
    public final void m152929f() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 32);
        List m126597c = C24252c.f117152a.m126597c();
        CloudSettings m152919h = m152919h();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudSettings").mo104556o(8, m127130z + "\nOpt-in Features: " + m126597c + "\nCached Settings: " + m152919h + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: g */
    public final void m152930g() {
        if (this.f146067c.m2463n()) {
            return;
        }
        C26676b.m136955e("SMLZCloudSettings", "fetchCloudSettings()", C26676b.b.f126331p);
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new d(null), 3, null);
    }

    /* renamed from: i */
    public final long m152931i() {
        int i11;
        CloudSettings m152919h = m152919h();
        if (m152919h != null) {
            i11 = m152919h.m41306a();
        } else {
            i11 = 100;
        }
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        return C21459a.m111040i(i11);
    }

    /* renamed from: j */
    public final long[] m152932j() {
        return new long[]{3, 4, 2, 19, 22, 6};
    }

    /* renamed from: l */
    public final void m152933l(JSONObject jSONObject) {
        if (jSONObject == null) {
            C26676b.m136955e("SMLZCloudSettings", "handleCloudSettingsWhenLogin(): NULL", C26676b.b.f126335t);
            return;
        }
        C26676b.m136955e("SMLZCloudSettings", "handleCloudSettingsWhenLogin(): " + jSONObject, C26676b.b.f126331p);
        int optInt = jSONObject.optInt("opt_in");
        C24252c.f117152a.m126603j(optInt);
        this.f146066b.m124809f1(new CloudSettings(optInt, 1024, 1024, jSONObject.optInt("enable_community"), jSONObject.optInt("enable_offload")));
    }

    /* renamed from: m */
    public final boolean m152934m() {
        CloudSettings m152919h;
        if (AbstractC3489d.m17501i() && !AbstractC3489d.m17506n() && this.f146065a.m89803k().m89778c() && (m152919h = m152919h()) != null && m152919h.m41311f()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m152935p(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (AbstractC25495a.m132082g(str)) {
            return false;
        }
        if (!AbstractC25495a.m132079d(str)) {
            return true;
        }
        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
        if (m4472f == null || m4472f.m153732O() > 100) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m152936s(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        return m152925t(c17945a0, true);
    }

    /* renamed from: u */
    public final boolean m152937u() {
        if (m152934m() && this.f146065a.m89803k().m89776a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void m152938w(C26318c c26318c, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c26318c, "params");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        if (this.f146067c.m2463n()) {
            return;
        }
        C26676b.m136955e("SMLZCloudSettings", "updateCloudSettings()", C26676b.b.f126331p);
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new e(c26318c, interfaceC18494a, null), 3, null);
    }
}
