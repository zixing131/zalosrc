package yf0;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p140ev.C18614c;
import p140ev.C18624m;
import p348mi.AbstractC23309i;
import th0.AbstractC26698d;
import th0.C26697c;
import th0.C26699e;
import yf0.C30939f0;

/* renamed from: yf0.f0 */
/* loaded from: classes5.dex */
public final class C30939f0 {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final String f142812d;

    /* renamed from: a */
    private C26699e f142813a;

    /* renamed from: b */
    private final AbstractC26698d.f f142814b = new AbstractC26698d.f() { // from class: yf0.d0
        @Override // th0.AbstractC26698d.f
        /* renamed from: a */
        public final void mo137228a(String str) {
            C30939f0.m150472f(str);
        }
    };

    /* renamed from: c */
    private C26699e.g f142815c;

    /* renamed from: yf0.f0$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: yf0.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C33054a extends AbstractC30932c {

            /* renamed from: a */
            final /* synthetic */ C26699e f142816a;

            /* renamed from: b */
            final /* synthetic */ Context f142817b;

            /* renamed from: c */
            final /* synthetic */ C18614c f142818c;

            /* renamed from: d */
            final /* synthetic */ String f142819d;

            C33054a(C26699e c26699e, Context context, C18614c c18614c, AbstractC26698d.g gVar, String str) {
                this.f142816a = c26699e;
                this.f142817b = context;
                this.f142818c = c18614c;
                this.f142819d = str;
            }

            @Override // lv.InterfaceC22656d
            /* renamed from: a */
            public void mo117236a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "data");
                try {
                    if (jSONObject.has("zbrowser_config")) {
                        this.f142816a.m137257z(jSONObject.getJSONObject("zbrowser_config"), this.f142817b);
                    }
                    a aVar = C30939f0.Companion;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(this.f142818c.m98357h()));
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    aVar.m150476k(jSONObject2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f142816a.m137255w(null, this.f142819d);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m150475i(Context context, String str, AbstractC26698d.g gVar) {
            C26699e m150478d;
            AbstractC19074t.m100208f(context, "$context");
            AbstractC19074t.m100208f(str, "$url");
            a aVar = C30939f0.Companion;
            if (aVar.m150479e() && (m150478d = aVar.m150478d(context)) != null && !TextUtils.isEmpty(str) && aVar.m150480f(context, str)) {
                C18614c c18614c = new C18614c(str);
                C30938f.Companion.m150466a().m150465f(context, c18614c, new C33054a(m150478d, context, c18614c, gVar, str));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public final void m150476k(JSONObject jSONObject) {
            String str;
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("cookiesIdLogins")) {
                JSONArray jSONArray = jSONObject.getJSONArray("cookiesIdLogins");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    AbstractC19074t.m100205c(jSONObject2);
                    arrayList.add(new C18624m(jSONObject2));
                }
            }
            if (jSONObject.has("cookiesOAuthLogins")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("cookiesOAuthLogins");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    AbstractC19074t.m100205c(jSONObject3);
                    arrayList.add(new C18624m(jSONObject3));
                }
            }
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18624m c18624m = (C18624m) it.next();
                if (c18624m.m98428c()) {
                    str = "https";
                } else {
                    str = "http";
                }
                cookieManager.setCookie(str + "://" + c18624m.m98426a() + c18624m.m98427b(), c18624m.toString());
            }
            CookieManager.getInstance().flush();
        }

        /* renamed from: c */
        public final C30939f0 m150477c() {
            return b.f142820a.m150484a();
        }

        /* renamed from: d */
        public final C26699e m150478d(Context context) {
            AbstractC19074t.m100208f(context, "context");
            if (m150479e()) {
                return m150477c().m150471e(context);
            }
            return null;
        }

        /* renamed from: e */
        public final boolean m150479e() {
            return AbstractC23309i.m121981hg();
        }

        /* renamed from: f */
        public final boolean m150480f(Context context, String str) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            C26699e m150478d = m150478d(context);
            if (m150478d != null) {
                return m150478d.m137254v(str);
            }
            return false;
        }

        /* renamed from: g */
        public final void m150481g(Context context, String str) {
            C26697c m137251r;
            AbstractC19074t.m100208f(context, "context");
            C26699e m150478d = m150478d(context);
            if (m150478d != null && (m137251r = m150478d.m137251r()) != null) {
                m137251r.m137204D(str);
            }
        }

        /* renamed from: h */
        public final void m150482h(final Context context, final String str, final AbstractC26698d.g gVar) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable(context, str, gVar) { // from class: yf0.e0

                /* renamed from: p */
                public final /* synthetic */ Context f142805p;

                /* renamed from: q */
                public final /* synthetic */ String f142806q;

                @Override // java.lang.Runnable
                public final void run() {
                    C30939f0.a.m150475i(this.f142805p, this.f142806q, null);
                }
            });
        }

        /* renamed from: j */
        public final void m150483j(Context context) {
            AbstractC19074t.m100208f(context, "context");
            C26699e c26699e = m150477c().f142813a;
            if (c26699e != null) {
                c26699e.m137256y(context);
            }
            m150477c().f142813a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yf0.f0$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f142820a = new b();

        /* renamed from: b */
        private static final C30939f0 f142821b = new C30939f0();

        private b() {
        }

        /* renamed from: a */
        public final C30939f0 m150484a() {
            return f142821b;
        }
    }

    /* renamed from: yf0.f0$c */
    /* loaded from: classes5.dex */
    public static final class c implements C26699e.g {

        /* renamed from: a */
        final /* synthetic */ Context f142822a;

        /* renamed from: yf0.f0$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC30932c {

            /* renamed from: a */
            final /* synthetic */ C26699e.g.a f142823a;

            a(C26699e.g.a aVar) {
                this.f142823a = aVar;
            }

            @Override // lv.InterfaceC22656d
            /* renamed from: a */
            public void mo117236a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "data");
                this.f142823a.onSuccess(jSONObject.getJSONObject("zbrowser_config"));
            }

            @Override // yf0.AbstractC30932c, lv.InterfaceC22656d
            /* renamed from: b */
            public void mo117237b(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "errorMessage");
                this.f142823a.mo137258a(c20096c.m104491c(), c20096c.m104492d());
            }
        }

        c(Context context) {
            this.f142822a = context;
        }

        @Override // th0.C26699e.g
        /* renamed from: a */
        public void mo137260a(String str) {
            AbstractC19074t.m100208f(str, "config");
            if (TextUtils.equals(str, AbstractC23309i.m122317qe())) {
                return;
            }
            AbstractC23309i.m121822dA(str);
        }

        @Override // th0.C26699e.g
        /* renamed from: b */
        public void mo137261b(String str, C26699e.g.a aVar) {
            AbstractC19074t.m100208f(str, "configUrl");
            AbstractC19074t.m100208f(aVar, "callback");
            try {
                C30938f.Companion.m150466a().m150465f(this.f142822a, new C18614c(str), new a(aVar));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // th0.C26699e.g
        /* renamed from: c */
        public String mo137262c() {
            String m122317qe = AbstractC23309i.m122317qe();
            AbstractC19074t.m100207e(m122317qe, "getZBrowserPrecacheConfig(...)");
            return m122317qe;
        }
    }

    static {
        String simpleName = C30939f0.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f142812d = simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized C26699e m150471e(Context context) {
        try {
            if (this.f142813a == null) {
                this.f142815c = new c(context);
                C26699e.g gVar = this.f142815c;
                AbstractC19074t.m100205c(gVar);
                this.f142813a = new C26699e(gVar, C20131e.f99303a.m104937S(), context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f142813a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m150472f(String str) {
        AbstractC20110a.f98889a.m104564x(f142812d).mo104548a(str, new Object[0]);
    }
}
