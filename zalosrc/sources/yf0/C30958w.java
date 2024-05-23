package yf0;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import x30.C29308c;
import x30.C29311f;
import x30.C29312g;
import x30.C29313h;

/* renamed from: yf0.w */
/* loaded from: classes5.dex */
public final class C30958w {

    /* renamed from: a */
    private final C29313h.a f142873a;

    /* renamed from: b */
    private String f142874b;

    /* renamed from: c */
    private String f142875c;

    /* renamed from: d */
    private C29311f f142876d;

    /* renamed from: e */
    private C29312g f142877e;

    /* renamed from: f */
    private C29313h f142878f;

    /* renamed from: g */
    private C29313h f142879g;

    public C30958w(C29313h.a aVar) {
        AbstractC19074t.m100208f(aVar, "webAdsRequestListener");
        this.f142873a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (android.text.TextUtils.equals(r0.f135793c, r4) == false) goto L9;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m150574b(String str, String str2, int i11, String str3) {
        C29313h.a aVar;
        C29313h c29313h = this.f142878f;
        if (c29313h != null) {
            aVar = c29313h.m146452f();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            C29313h c29313h2 = this.f142878f;
            AbstractC19074t.m100205c(c29313h2);
        }
        this.f142878f = new C29313h(str, this.f142873a, 1);
        C29311f c29311f = this.f142876d;
        if (c29311f != null) {
            AbstractC19074t.m100205c(c29311f);
            if (TextUtils.equals(c29311f.m146440e(), str2)) {
                C29311f c29311f2 = this.f142876d;
                AbstractC19074t.m100205c(c29311f2);
                c29311f2.m146441g();
                return;
            }
        }
        C29308c m146423e = C29308c.m146423e();
        C29313h c29313h3 = this.f142878f;
        AbstractC19074t.m100205c(c29313h3);
        this.f142876d = m146423e.m146427b(str2, i11, c29313h3, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:            if (android.text.TextUtils.equals(r0.f135793c, r4) == false) goto L8;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m150575c(String str, String str2, int i11, String str3) {
        C29313h c29313h = this.f142879g;
        if (c29313h != null) {
            AbstractC19074t.m100205c(c29313h);
            if (c29313h.m146452f() != null) {
                C29313h c29313h2 = this.f142879g;
                AbstractC19074t.m100205c(c29313h2);
            }
        }
        this.f142879g = new C29313h(str, this.f142873a, 2);
        C29312g c29312g = this.f142877e;
        if (c29312g != null) {
            AbstractC19074t.m100205c(c29312g);
            if (TextUtils.equals(c29312g.m146448e(), str2)) {
                C29312g c29312g2 = this.f142877e;
                AbstractC19074t.m100205c(c29312g2);
                c29312g2.m146449g();
                return;
            }
        }
        C29308c m146423e = C29308c.m146423e();
        C29313h c29313h3 = this.f142879g;
        AbstractC19074t.m100205c(c29313h3);
        this.f142877e = m146423e.m146428c(str2, i11, c29313h3, str3);
    }

    /* renamed from: a */
    public final void m150576a(String str, String str2) {
        String str3;
        C29312g c29312g;
        AbstractC19074t.m100208f(str, "action");
        if (str2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString("callback");
        int optInt = jSONObject.optInt("actionType");
        long optLong = jSONObject.optLong("timeOut", -1L);
        String string2 = jSONObject.getString("zoneId");
        int optInt2 = jSONObject.optInt("orientation");
        if (jSONObject.has("contentId")) {
            str3 = jSONObject.getString("contentId");
        } else {
            str3 = null;
        }
        if (AbstractC19074t.m100204b(str, "action.open.adtima.ads")) {
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            m150574b(string, string2, optInt2, str3);
        } else if (AbstractC19074t.m100204b(str, "action.open.adtima.ads.interstitial")) {
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            m150575c(string, string2, optInt2, str3);
        } else {
            return;
        }
        if (optInt == 2) {
            if (!this.f142873a.mo146455b()) {
                C29308c.m146424f(124006, "WebView inactive");
                return;
            }
            if (AbstractC19074t.m100204b(str, "action.open.adtima.ads")) {
                C29311f c29311f = this.f142876d;
                if (c29311f != null) {
                    c29311f.m146442h(optLong);
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(str, "action.open.adtima.ads.interstitial") && (c29312g = this.f142877e) != null) {
                c29312g.m146450h(optLong);
            }
        }
    }

    /* renamed from: d */
    public final void m150577d() {
        if (!TextUtils.isEmpty(this.f142874b)) {
            C29308c m146423e = C29308c.m146423e();
            String str = this.f142874b;
            AbstractC19074t.m100205c(str);
            m146423e.m146429i(new C29313h(str, this.f142873a, 1));
            this.f142874b = "";
        }
        if (!TextUtils.isEmpty(this.f142875c)) {
            C29308c m146423e2 = C29308c.m146423e();
            String str2 = this.f142875c;
            AbstractC19074t.m100205c(str2);
            m146423e2.m146429i(new C29313h(str2, this.f142873a, 2));
            this.f142875c = "";
        }
    }
}
