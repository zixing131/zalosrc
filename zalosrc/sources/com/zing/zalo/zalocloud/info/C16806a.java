package com.zing.zalo.zalocloud.info;

import ah0.C0860a;
import am.AbstractC0924m0;
import com.zing.zalo.data.zalocloud.model.api.CloudInfoResponse;
import com.zing.zalo.data.zalocloud.model.api.EncryptionInfo;
import com.zing.zalo.zalocloud.configs.C16805b;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hc0.EnumC19985o;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nh0.InterfaceC23792b;
import nl.C23870a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import pg0.C24747a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: com.zing.zalo.zalocloud.info.a */
/* loaded from: classes7.dex */
public final class C16806a {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f85373f;

    /* renamed from: a */
    private final C16805b f85374a;

    /* renamed from: b */
    private final C23870a f85375b;

    /* renamed from: c */
    private final C0860a f85376c;

    /* renamed from: d */
    private final C31831a f85377d;

    /* renamed from: e */
    private final InterfaceC23792b f85378e;

    /* renamed from: com.zing.zalo.zalocloud.info.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f85379q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16806a mo12V4() {
            return c.f85380a.m89847a();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.info.a$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C16806a m89846a() {
            return (C16806a) C16806a.f85373f.getValue();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.info.a$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f85380a = new c();

        /* renamed from: b */
        private static final C16806a f85381b;

        static {
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C0860a m120691m2 = AbstractC23306f.m120691m2();
            AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
            C31831a m120687l2 = AbstractC23306f.m120687l2();
            AbstractC19074t.m100207e(m120687l2, "provideZaloCloudSettings(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f85381b = new C16806a(m120633X1, m120679j2, m120691m2, m120687l2, m120579F1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C16806a m89847a() {
            return f85381b;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.info.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85382t;

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
            int i11 = this.f85382t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C16806a.this.f85375b;
                this.f85382t = 1;
                obj = c23870a.m124785P(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            CloudInfoResponse cloudInfoResponse = (CloudInfoResponse) obj;
            if (cloudInfoResponse != null) {
                C16806a.this.m89842m(cloudInfoResponse);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.info.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f85384s;

        /* renamed from: t */
        /* synthetic */ Object f85385t;

        /* renamed from: v */
        int f85387v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85385t = obj;
            this.f85387v |= Integer.MIN_VALUE;
            return C16806a.this.m89843n(this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f85379q);
        f85373f = m129210a;
    }

    public C16806a(C16805b c16805b, C23870a c23870a, C0860a c0860a, C31831a c31831a, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c16805b, "cloudConfigs");
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c31831a, "cloudSettings");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f85374a = c16805b;
        this.f85375b = c23870a;
        this.f85376c = c0860a;
        this.f85377d = c31831a;
        this.f85378e = interfaceC23792b;
    }

    /* renamed from: e */
    private final void m89826e() {
        m89844u("");
        m89832r(-1);
        m89829o(-1);
        m89833s(-1);
        m89830p(-1);
    }

    /* renamed from: h */
    public static final C16806a m89827h() {
        return Companion.m89846a();
    }

    /* renamed from: l */
    private final boolean m89828l() {
        if (this.f85378e.mo124314i() - AbstractC0924m0.m4247u2() >= 604800000) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final void m89829o(int i11) {
        C26676b.m136957g("SMLZCloudInfo", "setBackupMigrationStatus(): " + i11, null, 4, null);
        AbstractC0924m0.m2947Bq(i11);
    }

    /* renamed from: p */
    private final void m89830p(int i11) {
        C26676b.m136957g("SMLZCloudInfo", "setCloudMediaMigrationStatus(): " + i11, null, 4, null);
        AbstractC0924m0.m2976Cq(i11);
    }

    /* renamed from: q */
    private final void m89831q(JSONObject jSONObject) {
        int i11;
        JSONObject jSONObject2;
        int i12;
        int i13;
        if (jSONObject == null) {
            C26676b.m136957g("SMLZCloudInfo", "setMigrationInfo(): NULL", null, 4, null);
        }
        C26676b.m136957g("SMLZCloudInfo", "setMigrationInfo(): " + jSONObject, null, 4, null);
        int i14 = 0;
        if (jSONObject != null) {
            i11 = jSONObject.optInt("status");
        } else {
            i11 = 0;
        }
        m89832r(i11);
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject("sub_status");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            C26676b.m136957g("SMLZCloudInfo", "setMigrationInfo(): sub_status is NULL", null, 4, null);
        }
        if (jSONObject2 != null) {
            i12 = jSONObject2.optInt("message_backup");
        } else {
            i12 = 0;
        }
        m89829o(i12);
        if (jSONObject2 != null) {
            i13 = jSONObject2.optInt("my_cloud");
        } else {
            i13 = 0;
        }
        m89833s(i13);
        if (jSONObject2 != null) {
            i14 = jSONObject2.optInt("cloud_media");
        }
        m89830p(i14);
        if (jSONObject != null) {
            AbstractC0924m0.m3296Nr(jSONObject.toString());
        } else {
            AbstractC0924m0.m3296Nr("");
        }
    }

    /* renamed from: r */
    private final void m89832r(int i11) {
        C26676b.m136957g("SMLZCloudInfo", "setMigrationStatus(): " + i11, null, 4, null);
        AbstractC0924m0.m3005Dq(i11);
    }

    /* renamed from: s */
    private final void m89833s(int i11) {
        C26676b.m136957g("SMLZCloudInfo", "setMyCloudMigrationStatus(): " + i11, null, 4, null);
        AbstractC0924m0.m3034Eq(i11);
    }

    /* renamed from: t */
    private final void m89834t(int i11) {
        if (i11 == -1) {
            C26676b.m136955e("SMLZCloudInfo", "setZaloCloudServerEncryptionType(): INVALID type", C26676b.b.f126335t);
            return;
        }
        C26676b.m136957g("SMLZCloudInfo", "setZaloCloudServerEncryptionType(): " + i11, null, 4, null);
        AbstractC0924m0.m3527Vq(i11);
    }

    /* renamed from: c */
    public final void m89835c() {
        if (!this.f85374a.m89807v() || this.f85376c.m2463n()) {
            return;
        }
        if (this.f85375b.m124818m0() == null || m89828l()) {
            m89838g();
        }
    }

    /* renamed from: d */
    public final void m89836d() {
        C26676b.m136957g("SMLZCloudInfo", "clearAllCacheData()", null, 4, null);
        m89826e();
    }

    /* renamed from: f */
    public final void m89837f() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 36);
        String m89840j = m89840j();
        int m89839i = m89839i();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudInfo").mo104556o(8, m127130z + "\nServer Public Key: " + m89840j + "\nServer Encryption Type: " + m89839i + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: g */
    public final void m89838g() {
        C26676b.m136955e("SMLZCloudInfo", "fetchCloudInfo()", C26676b.b.f126331p);
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new d(null), 3, null);
    }

    /* renamed from: i */
    public final int m89839i() {
        return AbstractC0924m0.m3305O7();
    }

    /* renamed from: j */
    public final String m89840j() {
        String m3334P7 = AbstractC0924m0.m3334P7();
        AbstractC19074t.m100207e(m3334P7, "getZaloCloudServerPublicKey(...)");
        return m3334P7;
    }

    /* renamed from: k */
    public final void m89841k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            C26676b.m136955e("SMLZCloudInfo", "handleCloudUserInfoWhenLogin(): NULL", C26676b.b.f126335t);
            return;
        }
        C26676b.m136955e("SMLZCloudInfo", "handleCloudUserInfoWhenLogin(): " + jSONObject, C26676b.b.f126331p);
        try {
            if (jSONObject.has("plan")) {
                this.f85376c.m2470u(jSONObject.getInt("plan"));
            }
            if (jSONObject.has("onboarding_setup")) {
                int i11 = jSONObject.getInt("onboarding_setup");
                C24747a m120636Y1 = AbstractC23306f.m120636Y1();
                boolean z11 = true;
                if (i11 != 1) {
                    z11 = false;
                }
                m120636Y1.m128514F(z11);
            }
            this.f85377d.m152933l(jSONObject.optJSONObject("cloud_setting"));
            JSONObject optJSONObject = jSONObject.optJSONObject("cloud_info");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("public_key");
                AbstractC19074t.m100205c(optString);
                m89844u(optString);
                m89834t(optJSONObject.optInt("encrypt_type", -1));
                jSONObject2 = optJSONObject.optJSONObject("migrate_info");
            } else {
                jSONObject2 = null;
            }
            m89831q(jSONObject2);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudInfo", e11);
        }
    }

    /* renamed from: m */
    public final void m89842m(CloudInfoResponse cloudInfoResponse) {
        AbstractC19074t.m100208f(cloudInfoResponse, "serverResponse");
        try {
            this.f85376c.m2469t(cloudInfoResponse.m41276b());
            EncryptionInfo m41275a = cloudInfoResponse.m41275a();
            if (m41275a != null) {
                m89844u(m41275a.m41342b());
                m89834t(m41275a.m41341a());
            }
            AbstractC0924m0.m4205sj(this.f85378e.mo124314i());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudInfo", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89843n(Continuation continuation) {
        e eVar;
        Object obj;
        Object m142578e;
        int i11;
        C16806a c16806a;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f85387v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f85387v = i12 - Integer.MIN_VALUE;
                obj = eVar.f85385t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f85387v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c16806a = (C16806a) eVar.f85384s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C23870a c23870a = this.f85375b;
                    eVar.f85384s = this;
                    eVar.f85387v = 1;
                    obj = c23870a.m124803b1(eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c16806a = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    c16806a.m89836d();
                    C28989l m120667g2 = AbstractC23306f.m120667g2();
                    AbstractC19074t.m100207e(m120667g2, "provideZaloCloudOnboardingJobManager(...)");
                    C28989l.m144745n(m120667g2, false, 1, null);
                    AbstractC23306f.m120636Y1().m128510B(EnumC19985o.f98288q);
                    AbstractC0924m0.m3734cs(true);
                }
                return obj;
            }
        }
        eVar = new e(continuation);
        obj = eVar.f85385t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f85387v;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj;
    }

    /* renamed from: u */
    public final void m89844u(String str) {
        AbstractC19074t.m100208f(str, "publicKey");
        C26676b.m136957g("SMLZCloudInfo", "setZaloCloudServerPublicKey(): " + str, null, 4, null);
        AbstractC0924m0.m3556Wq(str);
    }
}
