package ac;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bg0.C2797c;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONObject;
import p036bc.C2725l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ac.m0 */
/* loaded from: classes3.dex */
public final class C0717m0 {
    public static final b Companion = new b(null);

    /* renamed from: o */
    private static final InterfaceC24854k f2359o;

    /* renamed from: a */
    private boolean f2360a;

    /* renamed from: b */
    private boolean f2361b;

    /* renamed from: c */
    private int f2362c = 15;

    /* renamed from: d */
    private int f2363d = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;

    /* renamed from: e */
    private final HashSet f2364e = new HashSet();

    /* renamed from: f */
    private final HashSet f2365f = new HashSet();

    /* renamed from: g */
    private final HashSet f2366g = new HashSet();

    /* renamed from: h */
    private final HashSet f2367h = new HashSet();

    /* renamed from: i */
    private final HashSet f2368i = new HashSet();

    /* renamed from: j */
    private final HashSet f2369j = new HashSet();

    /* renamed from: k */
    private final HashMap f2370k = new HashMap();

    /* renamed from: l */
    private final HashMap f2371l = new HashMap();

    /* renamed from: m */
    private final C2797c f2372m = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: n */
    private InterfaceC23792b f2373n;

    /* renamed from: ac.m0$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f2374q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0717m0 mo12V4() {
            return c.f2375a.m1126a();
        }
    }

    /* renamed from: ac.m0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0717m0 m1125a() {
            return (C0717m0) C0717m0.f2359o.getValue();
        }
    }

    /* renamed from: ac.m0$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f2375a = new c();

        /* renamed from: b */
        private static final C0717m0 f2376b = new C0717m0();

        private c() {
        }

        /* renamed from: a */
        public final C0717m0 m1126a() {
            return f2376b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f2374q);
        f2359o = m129210a;
    }

    /* renamed from: d */
    private final boolean m1109d(String str, String str2) {
        if (!this.f2367h.contains(str2) && !this.f2368i.contains(str2) && !this.f2364e.contains(str) && !this.f2365f.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m1110e(String str, String str2) {
        if (!this.f2367h.contains(str2) && !this.f2369j.contains(str2) && !this.f2364e.contains(str) && !this.f2366g.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m1111j() {
        return this.f2361b && this.f2360a;
    }

    /* renamed from: p */
    public static final void m1112p(C0717m0 c0717m0, String str, long j11, C0708i c0708i) {
        long j12;
        JSONObject jSONObject;
        AbstractC19074t.m100208f(c0717m0, "this$0");
        AbstractC19074t.m100208f(str, "$viewName");
        try {
            String m1038m = C0697c0.Companion.m1048b().m1038m();
            if (c0717m0.m1109d(str, m1038m)) {
                C0722p m1096o = C0711j0.Companion.m1104a().m1096o();
                if (m1096o != null) {
                    j12 = m1096o.m1153d();
                } else {
                    j12 = 0;
                }
                long j13 = j12;
                C2725l c2725l = new C2725l(str, j11, m1038m, j13);
                c2725l.m13292j(EnumC0719n0.CLICK.m1133c());
                c2725l.m13291i("");
                if (c0708i == null || (jSONObject = c0708i.m1071b()) == null) {
                    jSONObject = new JSONObject();
                }
                String jSONObject2 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "eData.toString()");
                c2725l.m13293k(jSONObject2);
                AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
                Context appContext = CoreUtility.getAppContext();
                AbstractC19074t.m100207e(appContext, "getAppContext()");
                c7304a.m37245a(appContext).mo37244L().mo13278d(c2725l);
                AbstractC20110a.m104542k(8, "[Click]: {'id':" + str + ", 'time':" + j11 + ", 'screenId':" + m1038m + ", 'sessionId':" + j13 + ", 'extraData':" + jSONObject + '}', new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    public static final void m1113r(String str, C0717m0 c0717m0, String str2, long j11, long j12, long j13, C0708i c0708i) {
        String str3;
        long j14;
        JSONObject jSONObject;
        AbstractC19074t.m100208f(str, "$screenName");
        AbstractC19074t.m100208f(c0717m0, "this$0");
        AbstractC19074t.m100208f(str2, "$viewName");
        try {
            if (TextUtils.isEmpty(str)) {
                str3 = C0697c0.Companion.m1048b().m1038m();
            } else {
                str3 = str;
            }
            if (c0717m0.m1110e(str2, str3)) {
                C0722p m1096o = C0711j0.Companion.m1104a().m1096o();
                if (m1096o != null) {
                    j14 = m1096o.m1153d();
                } else {
                    j14 = 0;
                }
                long j15 = j14;
                C2725l c2725l = new C2725l(str2, j11, str3, j15);
                c2725l.m13292j(EnumC0719n0.IMPRESSION.m1133c());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endTime", j12);
                jSONObject2.put("duration", j13);
                String jSONObject3 = jSONObject2.toString();
                AbstractC19074t.m100207e(jSONObject3, "actionData.toString()");
                c2725l.m13291i(jSONObject3);
                if (c0708i == null || (jSONObject = c0708i.m1071b()) == null) {
                    jSONObject = new JSONObject();
                }
                String jSONObject4 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject4, "eData.toString()");
                c2725l.m13293k(jSONObject4);
                AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
                Context appContext = CoreUtility.getAppContext();
                AbstractC19074t.m100207e(appContext, "getAppContext()");
                c7304a.m37245a(appContext).mo37244L().mo13278d(c2725l);
                AbstractC20110a.m104542k(8, "[Impression]: {'id':" + str2 + ", 'screenId':" + str3 + ", 'startTime'=" + j11 + ", 'endTime'=" + j12 + ", 'duration'=" + j13 + ", 'sessionId':" + j15 + ", 'actionData'=" + jSONObject2 + ", 'extraData':" + jSONObject + '}', new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f */
    public final void m1114f() {
        this.f2361b = false;
    }

    /* renamed from: g */
    public final int m1115g() {
        return this.f2362c;
    }

    /* renamed from: h */
    public final int m1116h() {
        return this.f2363d;
    }

    /* renamed from: i */
    public final void m1117i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        if (this.f2361b) {
            return;
        }
        this.f2361b = true;
        this.f2373n = ZaloAnalytics.Companion.m37219b().m37198O();
        boolean optBoolean = jSONObject.optBoolean("enable");
        this.f2360a = optBoolean;
        if (!optBoolean) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("enable_all");
        if (optJSONObject != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("views");
            if (optJSONArray != null) {
                AbstractC19074t.m100207e(optJSONArray, "optJSONArray(\"views\")");
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String string = optJSONArray.getString(i11);
                    if (string == null) {
                        string = "";
                    } else {
                        AbstractC19074t.m100207e(string, "this.getString(i) ?: \"\"");
                    }
                    this.f2364e.add(string);
                }
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("screens");
            if (optJSONArray2 != null) {
                AbstractC19074t.m100207e(optJSONArray2, "optJSONArray(\"screens\")");
                int length2 = optJSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    String string2 = optJSONArray2.getString(i12);
                    if (string2 == null) {
                        string2 = "";
                    } else {
                        AbstractC19074t.m100207e(string2, "this.getString(i) ?: \"\"");
                    }
                    this.f2367h.add(string2);
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("click");
        if (optJSONObject2 != null) {
            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("views");
            if (optJSONArray3 != null) {
                AbstractC19074t.m100207e(optJSONArray3, "optJSONArray(\"views\")");
                int length3 = optJSONArray3.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    String string3 = optJSONArray3.getString(i13);
                    if (string3 == null) {
                        string3 = "";
                    } else {
                        AbstractC19074t.m100207e(string3, "this.getString(i) ?: \"\"");
                    }
                    this.f2365f.add(string3);
                }
            }
            JSONArray optJSONArray4 = optJSONObject2.optJSONArray("screens");
            if (optJSONArray4 != null) {
                AbstractC19074t.m100207e(optJSONArray4, "optJSONArray(\"screens\")");
                int length4 = optJSONArray4.length();
                for (int i14 = 0; i14 < length4; i14++) {
                    String string4 = optJSONArray4.getString(i14);
                    if (string4 == null) {
                        string4 = "";
                    } else {
                        AbstractC19074t.m100207e(string4, "this.getString(i) ?: \"\"");
                    }
                    this.f2368i.add(string4);
                }
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject(ZinstantMetaConstant.IMPRESSION_META_NAME);
        if (optJSONObject3 != null) {
            JSONArray optJSONArray5 = optJSONObject3.optJSONArray("views");
            if (optJSONArray5 != null) {
                AbstractC19074t.m100207e(optJSONArray5, "optJSONArray(\"views\")");
                int length5 = optJSONArray5.length();
                for (int i15 = 0; i15 < length5; i15++) {
                    String string5 = optJSONArray5.getString(i15);
                    if (string5 == null) {
                        string5 = "";
                    } else {
                        AbstractC19074t.m100207e(string5, "this.getString(i) ?: \"\"");
                    }
                    this.f2366g.add(string5);
                }
            }
            JSONArray optJSONArray6 = optJSONObject3.optJSONArray("screens");
            if (optJSONArray6 != null) {
                AbstractC19074t.m100207e(optJSONArray6, "optJSONArray(\"screens\")");
                int length6 = optJSONArray6.length();
                for (int i16 = 0; i16 < length6; i16++) {
                    String string6 = optJSONArray6.getString(i16);
                    if (string6 == null) {
                        string6 = "";
                    } else {
                        AbstractC19074t.m100207e(string6, "this.getString(i) ?: \"\"");
                    }
                    this.f2369j.add(string6);
                }
            }
            this.f2363d = optJSONObject3.optInt("threshold", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
            this.f2362c = optJSONObject3.optInt("min_visible_percent", 15);
        }
    }

    /* renamed from: k */
    public final AbstractC0704g m1118k(C16719g c16719g, String str) {
        boolean z11;
        AbstractC19074t.m100208f(c16719g, "module");
        AbstractC19074t.m100208f(str, "moduleName");
        Iterator it = C0697c0.Companion.m1048b().m1039n().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (this.f2367h.contains(str2) || this.f2368i.contains(str2)) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (m1111j() && (this.f2364e.contains(str) || this.f2365f.contains(str) || z11)) {
            return new C0694b(c16719g, str);
        }
        return new C0712k(c16719g);
    }

    /* renamed from: l */
    public final AbstractC0710j m1119l(C16719g c16719g, String str) {
        boolean z11;
        C16719g c16719g2;
        C0696c c0696c;
        AbstractC19074t.m100208f(c16719g, "module");
        AbstractC19074t.m100208f(str, "moduleName");
        Iterator it = C0697c0.Companion.m1048b().m1039n().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (this.f2367h.contains(str2) || this.f2368i.contains(str2)) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (m1111j() && (this.f2364e.contains(str) || this.f2366g.contains(str) || z11)) {
            WeakReference weakReference = (WeakReference) this.f2371l.get(str);
            if (weakReference != null && (c0696c = (C0696c) weakReference.get()) != null) {
                c16719g2 = c0696c.m1018f();
            } else {
                c16719g2 = null;
            }
            if (!AbstractC19074t.m100204b(c16719g2, c16719g)) {
                weakReference = new WeakReference(new C0696c(new WeakReference(c16719g), str));
                this.f2371l.put(str, weakReference);
            }
            Object obj = weakReference.get();
            AbstractC19074t.m100205c(obj);
            return (AbstractC0710j) obj;
        }
        return new C0716m();
    }

    /* renamed from: m */
    public final AbstractC0704g m1120m(View view, String str) {
        boolean z11;
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(str, "viewName");
        Iterator it = C0697c0.Companion.m1048b().m1039n().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (this.f2367h.contains(str2) || this.f2368i.contains(str2)) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (m1111j() && (this.f2364e.contains(str) || this.f2365f.contains(str) || z11)) {
            return new ViewOnClickListenerC0698d(view, str);
        }
        return new ViewOnClickListenerC0714l(view);
    }

    /* renamed from: n */
    public final AbstractC0710j m1121n(View view, String str) {
        boolean z11;
        View view2;
        C0702f c0702f;
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(str, "viewName");
        Iterator it = C0697c0.Companion.m1048b().m1039n().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (this.f2367h.contains(str2) || this.f2368i.contains(str2)) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (m1111j() && (this.f2364e.contains(str) || this.f2366g.contains(str) || z11)) {
            WeakReference weakReference = (WeakReference) this.f2370k.get(str);
            if (weakReference != null && (c0702f = (C0702f) weakReference.get()) != null) {
                view2 = c0702f.m1060g();
            } else {
                view2 = null;
            }
            if (!AbstractC19074t.m100204b(view2, view)) {
                weakReference = new WeakReference(new C0702f(new WeakReference(view), str));
                this.f2370k.put(str, weakReference);
            }
            Object obj = weakReference.get();
            AbstractC19074t.m100205c(obj);
            return (AbstractC0710j) obj;
        }
        return new C0716m();
    }

    /* renamed from: o */
    public final void m1122o(String str, C0708i c0708i) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(str, "viewName");
        if (!m1111j()) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2373n;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2373n;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2372m.mo13474a(new Runnable() { // from class: ac.l0

            /* renamed from: q */
            public final /* synthetic */ String f2356q;

            /* renamed from: r */
            public final /* synthetic */ long f2357r;

            /* renamed from: s */
            public final /* synthetic */ C0708i f2358s;

            public /* synthetic */ RunnableC0715l0(String str2, long currentTimeMillis2, C0708i c0708i2) {
                r2 = str2;
                r3 = currentTimeMillis2;
                r5 = c0708i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0717m0.m1112p(C0717m0.this, r2, r3, r5);
            }
        });
    }

    /* renamed from: q */
    public final void m1123q(String str, String str2, long j11, long j12, long j13, C0708i c0708i) {
        AbstractC19074t.m100208f(str, "viewName");
        AbstractC19074t.m100208f(str2, "screenName");
        if (!m1111j()) {
            return;
        }
        this.f2372m.mo13474a(new Runnable() { // from class: ac.k0

            /* renamed from: p */
            public final /* synthetic */ String f2346p;

            /* renamed from: q */
            public final /* synthetic */ C0717m0 f2347q;

            /* renamed from: r */
            public final /* synthetic */ String f2348r;

            /* renamed from: s */
            public final /* synthetic */ long f2349s;

            /* renamed from: t */
            public final /* synthetic */ long f2350t;

            /* renamed from: u */
            public final /* synthetic */ long f2351u;

            /* renamed from: v */
            public final /* synthetic */ C0708i f2352v;

            public /* synthetic */ RunnableC0713k0(String str22, C0717m0 this, String str3, long j112, long j122, long j132, C0708i c0708i2) {
                r1 = str22;
                r2 = this;
                r3 = str3;
                r4 = j112;
                r6 = j122;
                r8 = j132;
                r10 = c0708i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0717m0.m1113r(r1, r2, r3, r4, r6, r8, r10);
            }
        });
    }
}
