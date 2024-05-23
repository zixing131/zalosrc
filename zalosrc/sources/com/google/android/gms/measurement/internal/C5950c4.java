package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.C20307b;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* loaded from: classes.dex */
public final class C5950c4 extends AbstractC6062m5 {

    /* renamed from: y */
    static final Pair f33806y = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f33807c;

    /* renamed from: d */
    public C5926a4 f33808d;

    /* renamed from: e */
    public final C6203z3 f33809e;

    /* renamed from: f */
    public final C6203z3 f33810f;

    /* renamed from: g */
    public final C5938b4 f33811g;

    /* renamed from: h */
    private String f33812h;

    /* renamed from: i */
    private boolean f33813i;

    /* renamed from: j */
    private long f33814j;

    /* renamed from: k */
    public final C6203z3 f33815k;

    /* renamed from: l */
    public final C6181x3 f33816l;

    /* renamed from: m */
    public final C5938b4 f33817m;

    /* renamed from: n */
    public final C6181x3 f33818n;

    /* renamed from: o */
    public final C6203z3 f33819o;

    /* renamed from: p */
    public final C6203z3 f33820p;

    /* renamed from: q */
    public boolean f33821q;

    /* renamed from: r */
    public final C6181x3 f33822r;

    /* renamed from: s */
    public final C6181x3 f33823s;

    /* renamed from: t */
    public final C6203z3 f33824t;

    /* renamed from: u */
    public final C5938b4 f33825u;

    /* renamed from: v */
    public final C5938b4 f33826v;

    /* renamed from: w */
    public final C6203z3 f33827w;

    /* renamed from: x */
    public final C6192y3 f33828x;

    public C5950c4(C6127s4 c6127s4) {
        super(c6127s4);
        this.f33815k = new C6203z3(this, "session_timeout", 1800000L);
        this.f33816l = new C6181x3(this, "start_new_session", true);
        this.f33819o = new C6203z3(this, "last_pause_time", 0L);
        this.f33820p = new C6203z3(this, "session_id", 0L);
        this.f33817m = new C5938b4(this, "non_personalized_ads", null);
        this.f33818n = new C6181x3(this, "allow_remote_dynamite", false);
        this.f33809e = new C6203z3(this, "first_open_time", 0L);
        this.f33810f = new C6203z3(this, "app_install_time", 0L);
        this.f33811g = new C5938b4(this, "app_instance_id", null);
        this.f33822r = new C6181x3(this, "app_backgrounded", false);
        this.f33823s = new C6181x3(this, "deep_link_retrieval_complete", false);
        this.f33824t = new C6203z3(this, "deep_link_retrieval_attempts", 0L);
        this.f33825u = new C5938b4(this, "firebase_feature_rollouts", null);
        this.f33826v = new C5938b4(this, "deferred_attribution_cache", null);
        this.f33827w = new C6203z3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f33828x = new C6192y3(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: h */
    protected final void mo30815h() {
        SharedPreferences sharedPreferences = this.f34158a.mo31032b().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f33807c = sharedPreferences;
        boolean z11 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f33821q = z11;
        if (!z11) {
            SharedPreferences.Editor edit = this.f33807c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f34158a.m31401z();
        this.f33808d = new C5926a4(this, "health_monitor", Math.max(0L, ((Long) AbstractC5972e3.f33915e.m30827a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: i */
    protected final boolean mo30816i() {
        return true;
    }

    /* renamed from: n */
    public final SharedPreferences m30817n() {
        mo31036g();
        m31140j();
        AbstractC4205o.m19722k(this.f33807c);
        return this.f33807c;
    }

    /* renamed from: o */
    public final Pair m30818o(String str) {
        mo31036g();
        long mo105914b = this.f34158a.mo31031a().mo105914b();
        String str2 = this.f33812h;
        if (str2 != null && mo105914b < this.f33814j) {
            return new Pair(str2, Boolean.valueOf(this.f33813i));
        }
        this.f33814j = mo105914b + this.f34158a.m31401z().m30927q(str, AbstractC5972e3.f33911c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f34158a.mo31032b());
            this.f33812h = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f33812h = id2;
            }
            this.f33813i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e11) {
            this.f34158a.mo31033c().m31196p().m31109b("Unable to get advertising id", e11);
            this.f33812h = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f33812h, Boolean.valueOf(this.f33813i));
    }

    /* renamed from: p */
    public final C20307b m30819p() {
        mo31036g();
        return C20307b.m106004b(m30817n().getString("consent_settings", "G1"));
    }

    /* renamed from: q */
    public final Boolean m30820q() {
        mo31036g();
        if (m30817n().contains("measurement_enabled")) {
            return Boolean.valueOf(m30817n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: r */
    public final void m30821r(Boolean bool) {
        mo31036g();
        SharedPreferences.Editor edit = m30817n().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: s */
    public final void m30822s(boolean z11) {
        mo31036g();
        this.f34158a.mo31033c().m31201u().m31109b("App measurement setting deferred collection", Boolean.valueOf(z11));
        SharedPreferences.Editor edit = m30817n().edit();
        edit.putBoolean("deferred_analytics_collection", z11);
        edit.apply();
    }

    /* renamed from: t */
    public final boolean m30823t() {
        SharedPreferences sharedPreferences = this.f33807c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: u */
    public final boolean m30824u(long j11) {
        if (j11 - this.f33815k.m31502a() > this.f33819o.m31502a()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m30825w(int i11) {
        return C20307b.m106006j(i11, m30817n().getInt("consent_source", 100));
    }
}
