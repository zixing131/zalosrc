package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.AbstractC5677x6;
import com.google.android.gms.internal.measurement.C5598sc;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;
import p230i6.C20307b;
import p230i6.C20323o;
import p230i6.EnumC20305a;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* loaded from: classes.dex */
public final class C6127s4 implements InterfaceC6073n5 {

    /* renamed from: H */
    private static volatile C6127s4 f34420H;

    /* renamed from: A */
    private volatile Boolean f34421A;

    /* renamed from: B */
    protected Boolean f34422B;

    /* renamed from: C */
    protected Boolean f34423C;

    /* renamed from: D */
    private volatile boolean f34424D;

    /* renamed from: E */
    private int f34425E;

    /* renamed from: G */
    final long f34427G;

    /* renamed from: a */
    private final Context f34428a;

    /* renamed from: b */
    private final String f34429b;

    /* renamed from: c */
    private final String f34430c;

    /* renamed from: d */
    private final String f34431d;

    /* renamed from: e */
    private final boolean f34432e;

    /* renamed from: f */
    private final C5945c f34433f;

    /* renamed from: g */
    private final C5990g f34434g;

    /* renamed from: h */
    private final C5950c4 f34435h;

    /* renamed from: i */
    private final C6082o3 f34436i;

    /* renamed from: j */
    private final C6105q4 f34437j;

    /* renamed from: k */
    private final C6153u8 f34438k;

    /* renamed from: l */
    private final C6121r9 f34439l;

    /* renamed from: m */
    private final C6027j3 f34440m;

    /* renamed from: n */
    private final InterfaceC20285f f34441n;

    /* renamed from: o */
    private final C5976e7 f34442o;

    /* renamed from: p */
    private final C6129s6 f34443p;

    /* renamed from: q */
    private final C6179x1 f34444q;

    /* renamed from: r */
    private final C6162v6 f34445r;

    /* renamed from: s */
    private final String f34446s;

    /* renamed from: t */
    private C6016i3 f34447t;

    /* renamed from: u */
    private C5977e8 f34448u;

    /* renamed from: v */
    private C6078o f34449v;

    /* renamed from: w */
    private C5994g3 f34450w;

    /* renamed from: y */
    private Boolean f34452y;

    /* renamed from: z */
    private long f34453z;

    /* renamed from: x */
    private boolean f34451x = false;

    /* renamed from: F */
    private final AtomicInteger f34426F = new AtomicInteger(0);

    C6127s4(C6106q5 c6106q5) {
        long mo105913a;
        Bundle bundle;
        AbstractC4205o.m19722k(c6106q5);
        Context context = c6106q5.f34367a;
        C5945c c5945c = new C5945c(context);
        this.f34433f = c5945c;
        AbstractC5949c3.f33805a = c5945c;
        this.f34428a = context;
        this.f34429b = c6106q5.f34368b;
        this.f34430c = c6106q5.f34369c;
        this.f34431d = c6106q5.f34370d;
        this.f34432e = c6106q5.f34374h;
        this.f34421A = c6106q5.f34371e;
        this.f34446s = c6106q5.f34376j;
        this.f34424D = true;
        zzcl zzclVar = c6106q5.f34373g;
        if (zzclVar != null && (bundle = zzclVar.f32979v) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f34422B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f32979v.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f34423C = (Boolean) obj2;
            }
        }
        AbstractC5677x6.m30013d(context);
        InterfaceC20285f m105926d = C20288i.m105926d();
        this.f34441n = m105926d;
        Long l11 = c6106q5.f34375i;
        if (l11 != null) {
            mo105913a = l11.longValue();
        } else {
            mo105913a = m105926d.mo105913a();
        }
        this.f34427G = mo105913a;
        this.f34434g = new C5990g(this);
        C5950c4 c5950c4 = new C5950c4(this);
        c5950c4.m31141k();
        this.f34435h = c5950c4;
        C6082o3 c6082o3 = new C6082o3(this);
        c6082o3.m31141k();
        this.f34436i = c6082o3;
        C6121r9 c6121r9 = new C6121r9(this);
        c6121r9.m31141k();
        this.f34439l = c6121r9;
        this.f34440m = new C6027j3(new C6095p5(c6106q5, this));
        this.f34444q = new C6179x1(this);
        C5976e7 c5976e7 = new C5976e7(this);
        c5976e7.m31456i();
        this.f34442o = c5976e7;
        C6129s6 c6129s6 = new C6129s6(this);
        c6129s6.m31456i();
        this.f34443p = c6129s6;
        C6153u8 c6153u8 = new C6153u8(this);
        c6153u8.m31456i();
        this.f34438k = c6153u8;
        C6162v6 c6162v6 = new C6162v6(this);
        c6162v6.m31141k();
        this.f34445r = c6162v6;
        C6105q4 c6105q4 = new C6105q4(this);
        c6105q4.m31141k();
        this.f34437j = c6105q4;
        zzcl zzclVar2 = c6106q5.f34373g;
        boolean z11 = zzclVar2 == null || zzclVar2.f32974q == 0;
        if (context.getApplicationContext() instanceof Application) {
            C6129s6 m31376I = m31376I();
            if (m31376I.f34158a.f34428a.getApplicationContext() instanceof Application) {
                Application application = (Application) m31376I.f34158a.f34428a.getApplicationContext();
                if (m31376I.f34456c == null) {
                    m31376I.f34456c = new C6118r6(m31376I);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(m31376I.f34456c);
                    application.registerActivityLifecycleCallbacks(m31376I.f34456c);
                    m31376I.f34158a.mo31033c().m31201u().m31108a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo31033c().m31202w().m31108a("Application context is not an Application");
        }
        c6105q4.m31296z(new RunnableC6116r4(this, c6106q5));
    }

    /* renamed from: H */
    public static C6127s4 m31363H(Context context, zzcl zzclVar, Long l11) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f32977t == null || zzclVar.f32978u == null)) {
            zzclVar = new zzcl(zzclVar.f32973p, zzclVar.f32974q, zzclVar.f32975r, zzclVar.f32976s, null, null, zzclVar.f32979v, null);
        }
        AbstractC4205o.m19722k(context);
        AbstractC4205o.m19722k(context.getApplicationContext());
        if (f34420H == null) {
            synchronized (C6127s4.class) {
                try {
                    if (f34420H == null) {
                        f34420H = new C6127s4(new C6106q5(context, zzclVar, l11));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f32979v) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC4205o.m19722k(f34420H);
            f34420H.f34421A = Boolean.valueOf(zzclVar.f32979v.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC4205o.m19722k(f34420H);
        return f34420H;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m31364d(C6127s4 c6127s4, C6106q5 c6106q5) {
        c6127s4.mo31037v().mo31036g();
        c6127s4.f34434g.m30932w();
        C6078o c6078o = new C6078o(c6127s4);
        c6078o.m31141k();
        c6127s4.f34449v = c6078o;
        C5994g3 c5994g3 = new C5994g3(c6127s4, c6106q5.f34372f);
        c5994g3.m31456i();
        c6127s4.f34450w = c5994g3;
        C6016i3 c6016i3 = new C6016i3(c6127s4);
        c6016i3.m31456i();
        c6127s4.f34447t = c6016i3;
        C5977e8 c5977e8 = new C5977e8(c6127s4);
        c5977e8.m31456i();
        c6127s4.f34448u = c5977e8;
        c6127s4.f34439l.m31142l();
        c6127s4.f34435h.m31142l();
        c6127s4.f34450w.m31457j();
        C6060m3 m31200t = c6127s4.mo31033c().m31200t();
        c6127s4.f34434g.m30926p();
        m31200t.m31109b("App measurement initialized, version", 76003L);
        c6127s4.mo31033c().m31200t().m31108a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m30941r = c5994g3.m30941r();
        if (TextUtils.isEmpty(c6127s4.f34429b)) {
            if (c6127s4.m31381N().m31335U(m30941r)) {
                c6127s4.mo31033c().m31200t().m31108a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c6127s4.mo31033c().m31200t().m31108a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m30941r)));
            }
        }
        c6127s4.mo31033c().m31196p().m31108a("Debug-level message logging enabled");
        if (c6127s4.f34425E != c6127s4.f34426F.get()) {
            c6127s4.mo31033c().m31197q().m31110c("Not all components initialized", Integer.valueOf(c6127s4.f34425E), Integer.valueOf(c6127s4.f34426F.get()));
        }
        c6127s4.f34451x = true;
    }

    /* renamed from: s */
    public static final void m31365s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: t */
    private static final void m31366t(AbstractC6051l5 abstractC6051l5) {
        if (abstractC6051l5 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: u */
    private static final void m31367u(AbstractC6148u3 abstractC6148u3) {
        if (abstractC6148u3 != null) {
            if (abstractC6148u3.m31458l()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC6148u3.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: w */
    private static final void m31368w(AbstractC6062m5 abstractC6062m5) {
        if (abstractC6062m5 != null) {
            if (abstractC6062m5.m31143m()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC6062m5.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: A */
    public final C6078o m31369A() {
        m31368w(this.f34449v);
        return this.f34449v;
    }

    /* renamed from: B */
    public final C5994g3 m31370B() {
        m31367u(this.f34450w);
        return this.f34450w;
    }

    /* renamed from: C */
    public final C6016i3 m31371C() {
        m31367u(this.f34447t);
        return this.f34447t;
    }

    /* renamed from: D */
    public final C6027j3 m31372D() {
        return this.f34440m;
    }

    /* renamed from: E */
    public final C6082o3 m31373E() {
        C6082o3 c6082o3 = this.f34436i;
        if (c6082o3 == null || !c6082o3.m31143m()) {
            return null;
        }
        return c6082o3;
    }

    /* renamed from: F */
    public final C5950c4 m31374F() {
        m31366t(this.f34435h);
        return this.f34435h;
    }

    /* renamed from: G */
    public final C6105q4 m31375G() {
        return this.f34437j;
    }

    /* renamed from: I */
    public final C6129s6 m31376I() {
        m31367u(this.f34443p);
        return this.f34443p;
    }

    /* renamed from: J */
    public final C6162v6 m31377J() {
        m31368w(this.f34445r);
        return this.f34445r;
    }

    /* renamed from: K */
    public final C5976e7 m31378K() {
        m31367u(this.f34442o);
        return this.f34442o;
    }

    /* renamed from: L */
    public final C5977e8 m31379L() {
        m31367u(this.f34448u);
        return this.f34448u;
    }

    /* renamed from: M */
    public final C6153u8 m31380M() {
        m31367u(this.f34438k);
        return this.f34438k;
    }

    /* renamed from: N */
    public final C6121r9 m31381N() {
        m31366t(this.f34439l);
        return this.f34439l;
    }

    /* renamed from: O */
    public final String m31382O() {
        return this.f34429b;
    }

    /* renamed from: P */
    public final String m31383P() {
        return this.f34430c;
    }

    /* renamed from: Q */
    public final String m31384Q() {
        return this.f34431d;
    }

    /* renamed from: R */
    public final String m31385R() {
        return this.f34446s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: a */
    public final InterfaceC20285f mo31031a() {
        return this.f34441n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: b */
    public final Context mo31032b() {
        return this.f34428a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: c */
    public final C6082o3 mo31033c() {
        m31368w(this.f34436i);
        return this.f34436i;
    }

    /* renamed from: e */
    public final void m31386e() {
        this.f34426F.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: f */
    public final C5945c mo31035f() {
        return this.f34433f;
    }

    /* renamed from: g */
    public final /* synthetic */ void m31387g(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i11 != 200 && i11 != 204) {
            if (i11 == 304) {
                i11 = 304;
            }
            mo31033c().m31202w().m31110c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        if (th2 == null) {
            m31374F().f33823s.m31484a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        mo31033c().m31196p().m31108a("Deferred Deep Link is empty.");
                        return;
                    }
                    C6121r9 m31381N = m31381N();
                    C6127s4 c6127s4 = m31381N.f34158a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m31381N.f34158a.f34428a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f34443p.m31440t("auto", "_cmp", bundle);
                        C6121r9 m31381N2 = m31381N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = m31381N2.f34158a.f34428a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    m31381N2.f34158a.f34428a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e11) {
                                m31381N2.f34158a.mo31033c().m31197q().m31109b("Failed to persist Deferred Deep Link. exception", e11);
                                return;
                            }
                        }
                        return;
                    }
                    mo31033c().m31202w().m31110c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e12) {
                    mo31033c().m31197q().m31109b("Failed to parse the Deferred Deep Link response. exception", e12);
                    return;
                }
            }
            mo31033c().m31196p().m31108a("Deferred Deep Link response empty.");
            return;
        }
        mo31033c().m31202w().m31110c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    /* renamed from: h */
    public final void m31388h() {
        this.f34425E++;
    }

    /* renamed from: i */
    public final void m31389i() {
        mo31037v().mo31036g();
        m31368w(m31377J());
        String m30941r = m31370B().m30941r();
        Pair m30818o = m31374F().m30818o(m30941r);
        if (this.f34434g.m30912A() && !((Boolean) m30818o.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m30818o.first)) {
            C6162v6 m31377J = m31377J();
            m31377J.m31140j();
            ConnectivityManager connectivityManager = (ConnectivityManager) m31377J.f34158a.f34428a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                C6121r9 m31381N = m31381N();
                m31370B().f34158a.f34434g.m30926p();
                URL m31351r = m31381N.m31351r(76003L, m30941r, (String) m30818o.first, m31374F().f33824t.m31502a() - 1);
                if (m31351r != null) {
                    C6162v6 m31377J2 = m31377J();
                    C20323o c20323o = new C20323o(this);
                    m31377J2.mo31036g();
                    m31377J2.m31140j();
                    AbstractC4205o.m19722k(m31351r);
                    AbstractC4205o.m19722k(c20323o);
                    m31377J2.f34158a.mo31037v().m31295y(new RunnableC6151u6(m31377J2, m30941r, m31351r, null, null, c20323o));
                    return;
                }
                return;
            }
            mo31033c().m31202w().m31108a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        mo31033c().m31196p().m31108a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* renamed from: j */
    public final void m31390j(boolean z11) {
        this.f34421A = Boolean.valueOf(z11);
    }

    /* renamed from: k */
    public final void m31391k(boolean z11) {
        mo31037v().mo31036g();
        this.f34424D = z11;
    }

    /* renamed from: l */
    public final void m31392l(zzcl zzclVar) {
        C20307b c20307b;
        mo31037v().mo31036g();
        C20307b m30819p = m31374F().m30819p();
        C5950c4 m31374F = m31374F();
        C6127s4 c6127s4 = m31374F.f34158a;
        m31374F.mo31036g();
        int i11 = 100;
        int i12 = m31374F.m30817n().getInt("consent_source", 100);
        C5990g c5990g = this.f34434g;
        C6127s4 c6127s42 = c5990g.f34158a;
        Boolean m30929s = c5990g.m30929s("google_analytics_default_allow_ad_storage");
        C5990g c5990g2 = this.f34434g;
        C6127s4 c6127s43 = c5990g2.f34158a;
        Boolean m30929s2 = c5990g2.m30929s("google_analytics_default_allow_analytics_storage");
        if ((m30929s != null || m30929s2 != null) && m31374F().m30825w(-10)) {
            c20307b = new C20307b(m30929s, m30929s2);
            i11 = -10;
        } else {
            if (!TextUtils.isEmpty(m31370B().m30942s()) && (i12 == 0 || i12 == 30 || i12 == 10 || i12 == 30 || i12 == 30 || i12 == 40)) {
                m31376I().m31414G(C20307b.f100288b, -10, this.f34427G);
            } else if (TextUtils.isEmpty(m31370B().m30942s()) && zzclVar != null && zzclVar.f32979v != null && m31374F().m30825w(30)) {
                c20307b = C20307b.m106003a(zzclVar.f32979v);
                if (!c20307b.equals(C20307b.f100288b)) {
                    i11 = 30;
                }
            }
            c20307b = null;
        }
        if (c20307b != null) {
            m31376I().m31414G(c20307b, i11, this.f34427G);
            m30819p = c20307b;
        }
        m31376I().m31417J(m30819p);
        if (m31374F().f33809e.m31502a() == 0) {
            mo31033c().m31201u().m31109b("Persisting first open", Long.valueOf(this.f34427G));
            m31374F().f33809e.m31503b(this.f34427G);
        }
        m31376I().f34467n.m31494c();
        if (!m31397q()) {
            if (m31394n()) {
                if (!m31381N().m31334T("android.permission.INTERNET")) {
                    mo31033c().m31197q().m31108a("App is missing INTERNET permission");
                }
                if (!m31381N().m31334T("android.permission.ACCESS_NETWORK_STATE")) {
                    mo31033c().m31197q().m31108a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!C21472e.m111067a(this.f34428a).m111065g() && !this.f34434g.m30918G()) {
                    if (!C6121r9.m31302a0(this.f34428a)) {
                        mo31033c().m31197q().m31108a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!C6121r9.m31303b0(this.f34428a, false)) {
                        mo31033c().m31197q().m31108a("AppMeasurementService not registered/enabled");
                    }
                }
                mo31033c().m31197q().m31108a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(m31370B().m30942s()) || !TextUtils.isEmpty(m31370B().m30940q())) {
                C6121r9 m31381N = m31381N();
                String m30942s = m31370B().m30942s();
                C5950c4 m31374F2 = m31374F();
                m31374F2.mo31036g();
                String string = m31374F2.m30817n().getString("gmp_app_id", null);
                String m30940q = m31370B().m30940q();
                C5950c4 m31374F3 = m31374F();
                m31374F3.mo31036g();
                if (m31381N.m31339d0(m30942s, string, m30940q, m31374F3.m30817n().getString("admob_app_id", null))) {
                    mo31033c().m31200t().m31108a("Rechecking which service to use due to a GMP App Id change");
                    C5950c4 m31374F4 = m31374F();
                    m31374F4.mo31036g();
                    Boolean m30820q = m31374F4.m30820q();
                    SharedPreferences.Editor edit = m31374F4.m30817n().edit();
                    edit.clear();
                    edit.apply();
                    if (m30820q != null) {
                        m31374F4.m30821r(m30820q);
                    }
                    m31371C().m30953p();
                    this.f34448u.m30874Q();
                    this.f34448u.m30873P();
                    m31374F().f33809e.m31503b(this.f34427G);
                    m31374F().f33811g.m30804b(null);
                }
                C5950c4 m31374F5 = m31374F();
                String m30942s2 = m31370B().m30942s();
                m31374F5.mo31036g();
                SharedPreferences.Editor edit2 = m31374F5.m30817n().edit();
                edit2.putString("gmp_app_id", m30942s2);
                edit2.apply();
                C5950c4 m31374F6 = m31374F();
                String m30940q2 = m31370B().m30940q();
                m31374F6.mo31036g();
                SharedPreferences.Editor edit3 = m31374F6.m30817n().edit();
                edit3.putString("admob_app_id", m30940q2);
                edit3.apply();
            }
            if (!m31374F().m30819p().m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                m31374F().f33811g.m30804b(null);
            }
            m31376I().m31410C(m31374F().f33811g.m30803a());
            C5598sc.m29603b();
            if (this.f34434g.m30913B(null, AbstractC5972e3.f33920g0)) {
                try {
                    m31381N().f34158a.f34428a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m31374F().f33825u.m30803a())) {
                        mo31033c().m31202w().m31108a("Remote config removed with active feature rollouts");
                        m31374F().f33825u.m30804b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m31370B().m30942s()) || !TextUtils.isEmpty(m31370B().m30940q())) {
                boolean m31394n = m31394n();
                if (!m31374F().m30823t() && !this.f34434g.m30916E()) {
                    m31374F().m30822s(!m31394n);
                }
                if (m31394n) {
                    m31376I().m31433f0();
                }
                m31380M().f34520d.m31452a();
                m31379L().m30876S(new AtomicReference());
                m31379L().m30888u(m31374F().f33828x.m31497a());
            }
        }
        m31374F().f33818n.m31484a(true);
    }

    /* renamed from: m */
    public final boolean m31393m() {
        if (this.f34421A != null && this.f34421A.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m31394n() {
        if (m31399x() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m31395o() {
        mo31037v().mo31036g();
        return this.f34424D;
    }

    /* renamed from: p */
    public final boolean m31396p() {
        return TextUtils.isEmpty(this.f34429b);
    }

    /* renamed from: q */
    public final boolean m31397q() {
        boolean z11;
        if (this.f34451x) {
            mo31037v().mo31036g();
            Boolean bool = this.f34452y;
            if (bool == null || this.f34453z == 0 || (!bool.booleanValue() && Math.abs(this.f34441n.mo105914b() - this.f34453z) > 1000)) {
                this.f34453z = this.f34441n.mo105914b();
                boolean z12 = true;
                if (m31381N().m31334T("android.permission.INTERNET") && m31381N().m31334T("android.permission.ACCESS_NETWORK_STATE") && (C21472e.m111067a(this.f34428a).m111065g() || this.f34434g.m30918G() || (C6121r9.m31302a0(this.f34428a) && C6121r9.m31303b0(this.f34428a, false)))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Boolean valueOf = Boolean.valueOf(z11);
                this.f34452y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m31381N().m31327M(m31370B().m30942s(), m31370B().m30940q()) && TextUtils.isEmpty(m31370B().m30940q())) {
                        z12 = false;
                    }
                    this.f34452y = Boolean.valueOf(z12);
                }
            }
            return this.f34452y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: r */
    public final boolean m31398r() {
        return this.f34432e;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: v */
    public final C6105q4 mo31037v() {
        m31368w(this.f34437j);
        return this.f34437j;
    }

    /* renamed from: x */
    public final int m31399x() {
        mo31037v().mo31036g();
        if (this.f34434g.m30916E()) {
            return 1;
        }
        Boolean bool = this.f34423C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo31037v().mo31036g();
        if (!this.f34424D) {
            return 8;
        }
        Boolean m30820q = m31374F().m30820q();
        if (m30820q != null) {
            if (m30820q.booleanValue()) {
                return 0;
            }
            return 3;
        }
        C5990g c5990g = this.f34434g;
        C5945c c5945c = c5990g.f34158a.f34433f;
        Boolean m30929s = c5990g.m30929s("firebase_analytics_collection_enabled");
        if (m30929s != null) {
            if (m30929s.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f34422B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f34421A == null || this.f34421A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    /* renamed from: y */
    public final C6179x1 m31400y() {
        C6179x1 c6179x1 = this.f34444q;
        if (c6179x1 != null) {
            return c6179x1;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C5990g m31401z() {
        return this.f34434g;
    }
}
