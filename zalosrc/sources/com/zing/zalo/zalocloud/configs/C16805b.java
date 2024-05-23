package com.zing.zalo.zalocloud.configs;

import am.AbstractC0924m0;
import com.zing.zalo.zalocloud.configs.AuditorConfig;
import com.zing.zalo.zalocloud.configs.C16804a;
import com.zing.zalo.zalocloud.configs.MigrationConfig;
import com.zing.zalo.zalocloud.configs.ReSyncE2EEInfoConfig;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import me0.AbstractC23138m0;
import ng0.C23743a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23306f;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import vg.C28211v5;

/* renamed from: com.zing.zalo.zalocloud.configs.b */
/* loaded from: classes.dex */
public final class C16805b {
    public static final b Companion = new b(null);

    /* renamed from: k */
    private static final InterfaceC24854k f85339k;

    /* renamed from: a */
    private final C29234i f85340a;

    /* renamed from: b */
    private final InterfaceC29232g f85341b;

    /* renamed from: c */
    private final InterfaceC29232g f85342c;

    /* renamed from: d */
    private final InterfaceC29232g f85343d;

    /* renamed from: e */
    private final InterfaceC29232g f85344e;

    /* renamed from: f */
    private final InterfaceC29232g f85345f;

    /* renamed from: g */
    private final InterfaceC29232g f85346g;

    /* renamed from: h */
    private final InterfaceC29232g f85347h;

    /* renamed from: i */
    private final InterfaceC29232g f85348i;

    /* renamed from: j */
    private final InterfaceC29232g f85349j;

    /* renamed from: com.zing.zalo.zalocloud.configs.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f85350q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16805b mo12V4() {
            return c.f85351a.m89812a();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.configs.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C16805b m89811a() {
            return (C16805b) C16805b.f85339k.getValue();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.configs.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f85351a = new c();

        /* renamed from: b */
        private static final C16805b f85352b = new C16805b();

        private c() {
        }

        /* renamed from: a */
        public final C16805b m89812a() {
            return f85352b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f85353q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AuditorConfig mo12V4() {
            AuditorConfig.Companion companion = AuditorConfig.Companion;
            String m4397z7 = AbstractC0924m0.m4397z7();
            AbstractC19074t.m100207e(m4397z7, "getZaloCloudAuditorConfig(...)");
            return companion.m89751a(m4397z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f85354q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final CharSequence mo12V4() {
            try {
                C28211v5 c28211v5 = new C28211v5(new JSONObject(AbstractC0924m0.m2899A7()));
                if (c28211v5.length() == 0) {
                    return C28211v5.Companion.m142160b("zCloud", "zCloud");
                }
                return c28211v5;
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudConfigs", e11);
                return "zCloud";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f85355q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC0924m0.m3397Rc());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f85356q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final MigrationConfig mo12V4() {
            MigrationConfig.Companion companion = MigrationConfig.Companion;
            String m3102H7 = AbstractC0924m0.m3102H7();
            AbstractC19074t.m100207e(m3102H7, "getZaloCloudMigrationConfig(...)");
            return companion.m89770a(m3102H7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f85357q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16804a mo12V4() {
            C16804a.a aVar = C16804a.Companion;
            String m3160J7 = AbstractC0924m0.m3160J7();
            AbstractC19074t.m100207e(m3160J7, "getZaloCloudOffloadConfig(...)");
            return aVar.m89782a(m3160J7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f85358q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ReSyncE2EEInfoConfig mo12V4() {
            ReSyncE2EEInfoConfig.Companion companion = ReSyncE2EEInfoConfig.Companion;
            String m3276N7 = AbstractC0924m0.m3276N7();
            AbstractC19074t.m100207e(m3276N7, "getZaloCloudReSyncE2EEInfoConfig(...)");
            return companion.m89775a(m3276N7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f85359q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            Boolean valueOf = Boolean.valueOf(AbstractC0924m0.m3600Yc());
            C26676b.m136957g("SMLZCloudConfigs", "Init cloudQueueEnabled=" + valueOf.booleanValue(), null, 4, null);
            return valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$k */
    /* loaded from: classes.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23743a mo12V4() {
            C23743a c23743a = new C23743a(false, 0, 0, 0, 15, null);
            C16805b c16805b = C16805b.this;
            try {
                String m3504V3 = AbstractC0924m0.m3504V3();
                AbstractC19074t.m100205c(m3504V3);
                if (m3504V3.length() > 0) {
                    c16805b.m89794y(c23743a, new JSONObject(m3504V3));
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudConfigs", e11);
            }
            return c23743a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.configs.b$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f85361q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            int m2928B7 = AbstractC0924m0.m2928B7();
            if (m2928B7 == -1) {
                m2928B7 = C19172a.m100600k("zalo_cloud@z_cloud@enable", -1);
            }
            C26676b.m136957g("SMLZCloudConfigs", "Init zaloCloudEnabled=" + m2928B7, null, 4, null);
            boolean z11 = true;
            if (m2928B7 != 1) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f85350q);
        f85339k = m129210a;
    }

    public C16805b() {
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f85340a = m145994a;
        this.f85341b = AbstractC29233h.m145991b(m145994a, new k());
        this.f85342c = AbstractC29233h.m145991b(m145994a, j.f85359q);
        this.f85343d = AbstractC29233h.m145991b(m145994a, l.f85361q);
        this.f85344e = AbstractC29233h.m145991b(m145994a, e.f85354q);
        this.f85345f = AbstractC29233h.m145991b(m145994a, f.f85355q);
        this.f85346g = AbstractC29233h.m145991b(m145994a, i.f85358q);
        this.f85347h = AbstractC29233h.m145991b(m145994a, g.f85356q);
        this.f85348i = AbstractC29233h.m145991b(m145994a, d.f85353q);
        this.f85349j = AbstractC29233h.m145991b(m145994a, h.f85357q);
    }

    /* renamed from: g */
    private final boolean m89785g() {
        return ((Boolean) this.f85342c.getValue()).booleanValue();
    }

    /* renamed from: h */
    public static final C16805b m89786h() {
        return Companion.m89811a();
    }

    /* renamed from: m */
    private final boolean m89787m() {
        return ((Boolean) this.f85343d.getValue()).booleanValue();
    }

    /* renamed from: n */
    private final AuditorConfig m89788n() {
        return (AuditorConfig) this.f85348i.getValue();
    }

    /* renamed from: o */
    private final CharSequence m89789o() {
        return (CharSequence) this.f85344e.getValue();
    }

    /* renamed from: p */
    private final boolean m89790p() {
        return ((Boolean) this.f85345f.getValue()).booleanValue();
    }

    /* renamed from: q */
    private final MigrationConfig m89791q() {
        return (MigrationConfig) this.f85347h.getValue();
    }

    /* renamed from: r */
    private final C16804a m89792r() {
        return (C16804a) this.f85349j.getValue();
    }

    /* renamed from: s */
    private final ReSyncE2EEInfoConfig m89793s() {
        return (ReSyncE2EEInfoConfig) this.f85346g.getValue();
    }

    /* renamed from: y */
    public final void m89794y(C23743a c23743a, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("warning_quota");
        boolean z11 = false;
        if (optJSONObject != null) {
            AbstractC19074t.m100205c(optJSONObject);
            c23743a.m124112h(optJSONObject.optInt("red_threshold", 0));
            c23743a.m124111g(optJSONObject.optInt("yellow_threshold", 0));
            c23743a.m124109e(optJSONObject.optInt("reminder_interval", 0));
        }
        if (jSONObject.optInt("enable_quota", 0) == 1) {
            z11 = true;
        }
        c23743a.m124110f(z11);
    }

    /* renamed from: z */
    private final void m89795z(JSONObject jSONObject) {
        boolean z11;
        try {
            AbstractC0924m0.m4416zq(jSONObject.optInt("enable", -1));
            boolean z12 = false;
            if (jSONObject.optInt("beta", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m2918Aq(z11);
            JSONObject optJSONObject = jSONObject.optJSONObject("migration");
            if (optJSONObject != null) {
                AbstractC0924m0.m3092Gq(optJSONObject.toString());
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("resync_e2ee_info");
            if (optJSONObject2 != null) {
                AbstractC0924m0.m3498Uq(optJSONObject2.toString());
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("auditor");
            if (optJSONObject3 != null) {
                AbstractC0924m0.m4358xq(optJSONObject3.toString());
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("branding_name");
            if (optJSONObject4 != null) {
                AbstractC0924m0.m4387yq(optJSONObject4.toString());
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("grace_period");
            if (optJSONObject5 != null) {
                if (optJSONObject5.optInt("enable_regen_msg", 0) == 1) {
                    z12 = true;
                }
                AbstractC23306f.m120627V1().m90228K(z12);
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("offload_local_storage");
            if (optJSONObject6 != null) {
                AbstractC0924m0.m3295Nq(optJSONObject6.toString());
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudConfigs", e11);
        }
    }

    /* renamed from: A */
    public final void m89796A() {
        if (!AbstractC23138m0.Companion.m118777d()) {
            return;
        }
        C26676b.m136957g("SMLZCloudConfigs", "preloadConfigs()", null, 4, null);
        m89802j();
        m89785g();
        m89787m();
    }

    /* renamed from: c */
    public final void m89797c() {
        C26676b.m136957g("SMLZCloudConfigs", "clearAllMemCache()", null, 4, null);
        this.f85340a.m145993b();
    }

    /* renamed from: d */
    public final void m89798d() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 33);
        boolean m89785g = m89785g();
        boolean m89787m = m89787m();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudConfigs").mo104556o(8, m127130z + "\nCloudQueueEnabled: " + m89785g + "\nZaloCloudEnabled: " + m89787m + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: e */
    public final AuditorConfig m89799e() {
        return m89788n();
    }

    /* renamed from: f */
    public final String m89800f() {
        return m89789o().toString();
    }

    /* renamed from: i */
    public final MigrationConfig m89801i() {
        return m89791q();
    }

    /* renamed from: j */
    public final C23743a m89802j() {
        return (C23743a) this.f85341b.getValue();
    }

    /* renamed from: k */
    public final C16804a m89803k() {
        return m89792r();
    }

    /* renamed from: l */
    public final ReSyncE2EEInfoConfig m89804l() {
        return m89793s();
    }

    /* renamed from: t */
    public final void m89805t(JSONObject jSONObject, boolean z11) {
        if (jSONObject == null) {
            return;
        }
        C26676b.m136955e("SMLZCloudConfigs", "handleServerConfig(): fromLoginFlow=" + z11 + ", json=" + jSONObject, C26676b.b.f126331p);
        try {
            boolean z12 = false;
            if (jSONObject.optInt("enable_cloud_queue", 0) == 1) {
                z12 = true;
            }
            AbstractC0924m0.m3469Tq(z12);
            JSONObject optJSONObject = jSONObject.optJSONObject("z_cloud");
            if (optJSONObject != null) {
                m89795z(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("my_cloud");
            if (optJSONObject2 != null) {
                AbstractC0924m0.m3817fl(optJSONObject2.toString());
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudConfigs", e11);
        }
    }

    /* renamed from: u */
    public final boolean m89806u() {
        return m89785g();
    }

    /* renamed from: v */
    public final boolean m89807v() {
        return m89787m();
    }

    /* renamed from: w */
    public final boolean m89808w() {
        return m89790p();
    }

    /* renamed from: x */
    public final boolean m89809x() {
        return m89802j().m124106b();
    }
}
