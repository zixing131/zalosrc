package ac;

import ac.C0720o;
import ac.C0722p;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import bg0.C2797c;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONObject;
import p036bc.C2719f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ac.c0 */
/* loaded from: classes.dex */
public final class C0697c0 {
    public static final b Companion = new b(null);

    /* renamed from: j */
    private static final InterfaceC24854k f2285j;

    /* renamed from: a */
    private boolean f2286a;

    /* renamed from: b */
    private boolean f2287b;

    /* renamed from: c */
    private boolean f2288c;

    /* renamed from: d */
    private final HashSet f2289d;

    /* renamed from: e */
    private final C2797c f2290e;

    /* renamed from: f */
    private InterfaceC23792b f2291f;

    /* renamed from: g */
    private C0720o f2292g;

    /* renamed from: h */
    private final InterfaceC24854k f2293h;

    /* renamed from: i */
    private final ArrayList f2294i;

    /* renamed from: ac.c0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f2295q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0697c0 mo12V4() {
            return c.f2296a.m1055a();
        }
    }

    /* renamed from: ac.c0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final Bundle m1047a(ZaloView zaloView) {
            if (zaloView.m92642L3() == null) {
                zaloView.mo60305zK(new Bundle());
            }
            Bundle m92642L3 = zaloView.m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            if (m92642L3.containsKey("EXTRA_DATA_TRACKING")) {
                Bundle m92642L32 = zaloView.m92642L3();
                AbstractC19074t.m100205c(m92642L32);
                return m92642L32.getBundle("EXTRA_DATA_TRACKING");
            }
            Bundle bundle = new Bundle();
            Bundle m92642L33 = zaloView.m92642L3();
            AbstractC19074t.m100205c(m92642L33);
            m92642L33.putBundle("EXTRA_DATA_TRACKING", bundle);
            return bundle;
        }

        /* renamed from: b */
        public final C0697c0 m1048b() {
            return (C0697c0) C0697c0.f2285j.getValue();
        }

        /* renamed from: c */
        public final void m1049c(ZaloView zaloView, String str, double d11) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC19074t.m100208f(str, "key");
            Bundle m1047a = m1047a(zaloView);
            if (m1047a != null) {
                m1047a.putDouble(str, d11);
            }
        }

        /* renamed from: d */
        public final void m1050d(ZaloView zaloView, String str, int i11) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC19074t.m100208f(str, "key");
            Bundle m1047a = m1047a(zaloView);
            if (m1047a != null) {
                m1047a.putInt(str, i11);
            }
        }

        /* renamed from: e */
        public final void m1051e(ZaloView zaloView, String str, long j11) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC19074t.m100208f(str, "key");
            Bundle m1047a = m1047a(zaloView);
            if (m1047a != null) {
                m1047a.putLong(str, j11);
            }
        }

        /* renamed from: f */
        public final void m1052f(ZaloView zaloView, String str, String str2) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(str2, "value");
            Bundle m1047a = m1047a(zaloView);
            if (m1047a != null) {
                m1047a.putString(str, str2);
            }
        }

        /* renamed from: g */
        public final void m1053g(ZaloView zaloView, String str, boolean z11) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC19074t.m100208f(str, "key");
            Bundle m1047a = m1047a(zaloView);
            if (m1047a != null) {
                m1047a.putBoolean(str, z11);
            }
        }

        /* renamed from: h */
        public final void m1054h(String str, String str2, Object obj) {
            AbstractC19074t.m100208f(str, "screenId");
            AbstractC19074t.m100208f(str2, "key");
            AbstractC19074t.m100208f(obj, "value");
            m1048b().m1029s(str, str2, obj);
        }
    }

    /* renamed from: ac.c0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f2296a = new c();

        /* renamed from: b */
        private static final C0697c0 f2297b = new C0697c0(null);

        private c() {
        }

        /* renamed from: a */
        public final C0697c0 m1055a() {
            return f2297b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.c0$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f2298q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f2295q);
        f2285j = m129210a;
    }

    public /* synthetic */ C0697c0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: j */
    public static final void m1026j(C0697c0 c0697c0, String str, long j11) {
        C0720o c0720o;
        AbstractC19074t.m100208f(c0697c0, "this$0");
        AbstractC19074t.m100208f(str, "$screenId");
        try {
            if (c0697c0.m1028o().size() == 0) {
                return;
            }
            Iterator it = c0697c0.m1028o().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0720o = (C0720o) it.next();
                    if (AbstractC19074t.m100204b(c0720o.m1138e(), str)) {
                        break;
                    }
                } else {
                    c0720o = null;
                    break;
                }
            }
            if (c0720o == null) {
                return;
            }
            if (AbstractC19074t.m100204b(c0697c0.m1028o().get(0), c0720o)) {
                for (C0720o c0720o2 : c0697c0.m1028o()) {
                    c0720o2.m1143j(j11);
                    c0720o2.m1142i(C0720o.a.NORMAL);
                    c0697c0.m1033z(c0720o2);
                }
                c0697c0.m1028o().clear();
                c0697c0.f2292g = c0720o;
                C0711j0.Companion.m1104a().m1100t(C0722p.a.NORMAL_END);
                return;
            }
            c0720o.m1143j(j11);
            c0720o.m1142i(C0720o.a.NORMAL);
            c0697c0.m1033z(c0720o);
            c0697c0.m1028o().remove(c0720o);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l */
    public static final void m1027l(C0697c0 c0697c0, ZaloAnalytics.C7296e c7296e, long j11) {
        AbstractC19074t.m100208f(c0697c0, "this$0");
        try {
            if (c0697c0.m1028o().size() == 0) {
                if (c7296e != null) {
                    c7296e.mo37224a();
                    return;
                }
                return;
            }
            for (C0720o c0720o : c0697c0.m1028o()) {
                c0720o.m1143j(j11);
                c0720o.m1142i(C0720o.a.NORMAL);
                c0697c0.m1033z(c0720o);
            }
            c0697c0.m1028o().clear();
            c0697c0.f2292g = null;
            if (c7296e != null) {
                c7296e.mo37224a();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: o */
    private final List m1028o() {
        return (List) this.f2293h.getValue();
    }

    /* renamed from: s */
    public final void m1029s(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str) || !m1042r(str)) {
            return;
        }
        this.f2290e.mo13474a(new Runnable() { // from class: ac.z

            /* renamed from: q */
            public final /* synthetic */ String f2458q;

            /* renamed from: r */
            public final /* synthetic */ String f2459r;

            /* renamed from: s */
            public final /* synthetic */ Object f2460s;

            public /* synthetic */ RunnableC0735z(String str3, String str22, Object obj2) {
                r2 = str3;
                r3 = str22;
                r4 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0697c0.m1030t(C0697c0.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: t */
    public static final void m1030t(C0697c0 c0697c0, String str, String str2, Object obj) {
        C0720o c0720o;
        AbstractC19074t.m100208f(c0697c0, "this$0");
        AbstractC19074t.m100208f(str, "$screenId");
        AbstractC19074t.m100208f(str2, "$key");
        AbstractC19074t.m100208f(obj, "$value");
        try {
            if (c0697c0.m1028o().size() == 0) {
                return;
            }
            Iterator it = c0697c0.m1028o().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0720o = (C0720o) it.next();
                    if (AbstractC19074t.m100204b(c0720o.m1138e(), str)) {
                        break;
                    }
                } else {
                    c0720o = null;
                    break;
                }
            }
            if (c0720o == null) {
                return;
            }
            if (!c0720o.m1134a().containsKey(str2) && c0720o.m1134a().size() >= ZaloAnalytics.Companion.m37219b().m37200Q()) {
                return;
            }
            if (obj instanceof String) {
                int length = ((String) obj).length();
                ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
                if (length > c7293b.m37219b().m37201R()) {
                    obj = ((String) obj).substring(0, c7293b.m37219b().m37201R());
                    AbstractC19074t.m100207e(obj, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
            c0720o.m1134a().put(str2, obj);
            C2719f c2719f = new C2719f(c0720o.m1138e(), c0720o.m1141h(), c0720o.m1140g(), c0720o.m1139f());
            c2719f.m13250j(c0720o.m1136c());
            c2719f.m13252l(c0720o.m1137d());
            HashMap m1134a = c0720o.m1134a();
            AbstractC19074t.m100206d(m1134a, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            String jSONObject = new JSONObject(m1134a).toString();
            AbstractC19074t.m100207e(jSONObject, "JSONObject(screen.data a…<String, Any>).toString()");
            c2719f.m13251k(jSONObject);
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37242J().mo13234d(c2719f);
            AbstractC20110a.m104542k(8, "[Screen] Extra Data : {'id': " + c2719f.m13245e() + ", 'extraData':" + c2719f.m13243c() + ", 'sessionId':" + c2719f.m13246f() + '}', new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m1031x(C0697c0 c0697c0, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c0697c0.m1045w(str, z11);
    }

    /* renamed from: y */
    public static final void m1032y(C0697c0 c0697c0, String str, boolean z11, long j11) {
        String str2;
        long j12;
        AbstractC19074t.m100208f(c0697c0, "this$0");
        AbstractC19074t.m100208f(str, "$screenId");
        try {
            if (c0697c0.m1028o().size() > 0) {
                Iterator it = c0697c0.m1028o().iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((C0720o) it.next()).m1138e(), str)) {
                        return;
                    }
                }
                c0697c0.f2292g = (C0720o) c0697c0.m1028o().get(0);
                if (!z11) {
                    for (C0720o c0720o : c0697c0.m1028o()) {
                        c0720o.m1143j(j11);
                        c0720o.m1142i(C0720o.a.NORMAL);
                        c0697c0.m1033z(c0720o);
                    }
                    c0697c0.m1028o().clear();
                    C0711j0.Companion.m1104a().m1100t(C0722p.a.NORMAL_END);
                }
            }
            C0720o c0720o2 = new C0720o(j11);
            c0720o2.m1145l(str);
            C0720o c0720o3 = c0697c0.f2292g;
            if (c0720o3 == null || (str2 = c0720o3.m1138e()) == null) {
                str2 = "unknown";
            }
            c0720o2.m1147n(str2);
            C0722p m1096o = C0711j0.Companion.m1104a().m1096o();
            if (m1096o != null) {
                j12 = m1096o.m1156g();
            } else {
                j12 = 0;
            }
            c0720o2.m1146m(j12);
            C2719f c2719f = new C2719f(c0720o2.m1138e(), c0720o2.m1141h(), c0720o2.m1140g(), c0720o2.m1139f());
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c0720o2.m1144k(c7304a.m37245a(appContext).mo37242J().mo13233c(c2719f));
            c0697c0.m1028o().add(c0720o2);
            c0697c0.f2292g = null;
            AbstractC20110a.m104542k(8, "Start [Screen]: {'id': " + c2719f.m13245e() + ", 'startTime':" + c2719f.m13248h() + '}', new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: z */
    private final void m1033z(C0720o c0720o) {
        C2719f c2719f = new C2719f(c0720o.m1138e(), c0720o.m1141h(), c0720o.m1140g(), c0720o.m1139f());
        c2719f.m13250j(c0720o.m1136c());
        c2719f.m13249i(c0720o.m1135b().m1149c());
        c2719f.m13252l(c0720o.m1137d());
        HashMap m1134a = c0720o.m1134a();
        AbstractC19074t.m100206d(m1134a, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        String jSONObject = new JSONObject(m1134a).toString();
        AbstractC19074t.m100207e(jSONObject, "JSONObject(screenRecord.…<String, Any>).toString()");
        c2719f.m13251k(jSONObject);
        if (c2719f.m13242b() - c2719f.m13248h() <= 10) {
            AbstractC20110a.m104535d("end Screen [" + c2719f.m13245e() + " - " + c2719f.m13244d() + "] ... delete record cuz duration <= TIME_THRESH_HOLD ", new Object[0]);
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            c7304a.m37245a(appContext).mo37242J().mo13232b(c2719f);
            return;
        }
        AbstractC20110a.m104535d("end Screen [" + c2719f.m13245e() + " - " + c2719f.m13244d() + "] - [end : " + c2719f.m13242b() + ']', new Object[0]);
        AnalyticsRoomDatabase.C7304a c7304a2 = AnalyticsRoomDatabase.Companion;
        Context appContext2 = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext2, "getAppContext()");
        c7304a2.m37245a(appContext2).mo37242J().mo13234d(c2719f);
        AbstractC20110a.m104542k(8, "End [Screen]: {'id': " + c2719f.m13245e() + ", 'startTime':" + c2719f.m13248h() + ", 'endTime':" + c2719f.m13242b() + ", 'extraData':" + c2719f.m13243c() + ", 'sources':" + c2719f.m13247g() + ", 'endReason':" + c2719f.m13241a() + ", 'sessionId':" + c2719f.m13246f() + '}', new Object[0]);
    }

    /* renamed from: g */
    public final void m1034g() {
        this.f2287b = false;
    }

    /* renamed from: h */
    public final void m1035h(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f2294i.remove(str2);
        }
        m1036i(str);
    }

    /* renamed from: i */
    public final void m1036i(String str) {
        long currentTimeMillis;
        if (str == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !m1042r(str)) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2291f;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2291f;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2290e.mo13474a(new Runnable() { // from class: ac.y

            /* renamed from: q */
            public final /* synthetic */ String f2455q;

            /* renamed from: r */
            public final /* synthetic */ long f2456r;

            public /* synthetic */ RunnableC0734y(String str2, long currentTimeMillis2) {
                r2 = str2;
                r3 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0697c0.m1026j(C0697c0.this, r2, r3);
            }
        });
    }

    /* renamed from: k */
    public final void m1037k(ZaloAnalytics.C7296e c7296e) {
        long currentTimeMillis;
        InterfaceC23792b interfaceC23792b = this.f2291f;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2291f;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2290e.mo13474a(new Runnable() { // from class: ac.b0

            /* renamed from: q */
            public final /* synthetic */ ZaloAnalytics.C7296e f2276q;

            /* renamed from: r */
            public final /* synthetic */ long f2277r;

            public /* synthetic */ RunnableC0695b0(ZaloAnalytics.C7296e c7296e2, long currentTimeMillis2) {
                r2 = c7296e2;
                r3 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0697c0.m1027l(C0697c0.this, r2, r3);
            }
        });
    }

    /* renamed from: m */
    public final String m1038m() {
        if (m1028o().size() == 0) {
            return "unknown";
        }
        return ((C0720o) m1028o().get(m1028o().size() - 1)).m1138e();
    }

    /* renamed from: n */
    public final ArrayList m1039n() {
        return this.f2294i;
    }

    /* renamed from: p */
    public final void m1040p(JSONObject jSONObject) {
        int i11;
        String str;
        AbstractC19074t.m100208f(jSONObject, "config");
        if (this.f2287b) {
            return;
        }
        this.f2287b = true;
        this.f2291f = ZaloAnalytics.Companion.m37219b().m37198O();
        boolean optBoolean = jSONObject.optBoolean("enable");
        this.f2286a = optBoolean;
        if (!optBoolean) {
            return;
        }
        int optInt = jSONObject.optInt("strategy");
        if (optInt != 0) {
            if (optInt == 1) {
                this.f2288c = true;
                this.f2286a = true;
                return;
            }
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("screens");
        if (optJSONArray != null) {
            i11 = optJSONArray.length();
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (optJSONArray != null) {
                str = optJSONArray.getString(i12);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            this.f2289d.add(str);
        }
        this.f2286a = !this.f2289d.isEmpty();
    }

    /* renamed from: q */
    public final boolean m1041q() {
        return this.f2287b && this.f2286a;
    }

    /* renamed from: r */
    public final boolean m1042r(String str) {
        AbstractC19074t.m100208f(str, "screenName");
        if (m1041q() && (this.f2288c || this.f2289d.contains(str))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m1043u(String str) {
        m1044v(str, false);
    }

    /* renamed from: v */
    public final void m1044v(String str, boolean z11) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f2294i.add(str2);
        }
        m1045w(str, z11);
    }

    /* renamed from: w */
    public final void m1045w(String str, boolean z11) {
        long currentTimeMillis;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2) || !m1042r(str2)) {
            return;
        }
        InterfaceC23792b interfaceC23792b = this.f2291f;
        InterfaceC23792b interfaceC23792b2 = null;
        if (interfaceC23792b == null) {
            AbstractC19074t.m100223u("timeProvider");
            interfaceC23792b = null;
        }
        if (interfaceC23792b.mo124314i() != 0) {
            InterfaceC23792b interfaceC23792b3 = this.f2291f;
            if (interfaceC23792b3 == null) {
                AbstractC19074t.m100223u("timeProvider");
            } else {
                interfaceC23792b2 = interfaceC23792b3;
            }
            currentTimeMillis = interfaceC23792b2.mo124314i();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f2290e.mo13474a(new Runnable() { // from class: ac.a0

            /* renamed from: q */
            public final /* synthetic */ String f2269q;

            /* renamed from: r */
            public final /* synthetic */ boolean f2270r;

            /* renamed from: s */
            public final /* synthetic */ long f2271s;

            public /* synthetic */ RunnableC0693a0(String str22, boolean z112, long currentTimeMillis2) {
                r2 = str22;
                r3 = z112;
                r4 = currentTimeMillis2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0697c0.m1032y(C0697c0.this, r2, r3, r4);
            }
        });
    }

    private C0697c0() {
        InterfaceC24854k m129210a;
        this.f2289d = new HashSet();
        this.f2290e = new C2797c(AbstractC0837p0.Companion.m2237f());
        m129210a = AbstractC24856m.m129210a(d.f2298q);
        this.f2293h = m129210a;
        this.f2294i = new ArrayList();
    }
}
