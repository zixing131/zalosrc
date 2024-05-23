package p627x;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONObject;
import p467r.C25578a;
import p467r.C25580c;
import p467r.C25581d;
import p467r.C25588k;
import p467r.C25589l;
import p498s.C26055a;
import p512t.C26438d;
import p512t.C26439e;
import p562v.AbstractC27388a;
import p562v.AbstractC27389b;
import p562v.AbstractC27391d;
import p592w.C28682b;

/* renamed from: x.a */
/* loaded from: classes2.dex */
public abstract class AbstractC29273a {

    /* renamed from: a */
    private C28682b f135667a;

    /* renamed from: b */
    private C25578a f135668b;

    /* renamed from: c */
    private C26055a f135669c;

    /* renamed from: d */
    private a f135670d;

    /* renamed from: e */
    private long f135671e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x.a$a */
    /* loaded from: classes2.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AbstractC29273a() {
        m146296w();
        this.f135667a = new C28682b(null);
    }

    /* renamed from: a */
    public void mo146274a() {
    }

    /* renamed from: b */
    public void m146275b(float f11) {
        C26439e.m136297a().m136299c(m146294u(), f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m146276c(WebView webView) {
        this.f135667a = new C28682b(webView);
    }

    /* renamed from: d */
    public void m146277d(String str) {
        C26439e.m136297a().m136301e(m146294u(), str, null);
    }

    /* renamed from: e */
    public void m146278e(String str, long j11) {
        if (j11 >= this.f135671e) {
            this.f135670d = a.AD_STATE_VISIBLE;
            C26439e.m136297a().m136309m(m146294u(), str);
        }
    }

    /* renamed from: f */
    public void m146279f(String str, JSONObject jSONObject) {
        C26439e.m136297a().m136301e(m146294u(), str, jSONObject);
    }

    /* renamed from: g */
    public void m146280g(JSONObject jSONObject) {
        C26439e.m136297a().m136310n(m146294u(), jSONObject);
    }

    /* renamed from: h */
    public void m146281h(C25578a c25578a) {
        this.f135668b = c25578a;
    }

    /* renamed from: i */
    public void m146282i(C25580c c25580c) {
        C26439e.m136297a().m136305i(m146294u(), c25580c.m132142d());
    }

    /* renamed from: j */
    public void mo146283j(C25589l c25589l, C25581d c25581d) {
        m146284k(c25589l, c25581d, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m146284k(C25589l c25589l, C25581d c25581d, JSONObject jSONObject) {
        String m132175t = c25589l.m132175t();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC27389b.m140321f(jSONObject2, "environment", "app");
        AbstractC27389b.m140321f(jSONObject2, "adSessionType", c25581d.m132145c());
        AbstractC27389b.m140321f(jSONObject2, "deviceInfo", AbstractC27388a.m140315d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC27389b.m140321f(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        AbstractC27389b.m140321f(jSONObject3, "partnerName", c25581d.m132150h().m132154a());
        AbstractC27389b.m140321f(jSONObject3, "partnerVersion", c25581d.m132150h().m132155c());
        AbstractC27389b.m140321f(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC27389b.m140321f(jSONObject4, "libraryVersion", "1.3.4-Vngvn");
        AbstractC27389b.m140321f(jSONObject4, "appId", C26438d.m136294a().m136296c().getApplicationContext().getPackageName());
        AbstractC27389b.m140321f(jSONObject2, "app", jSONObject4);
        if (c25581d.m132146d() != null) {
            AbstractC27389b.m140321f(jSONObject2, "contentUrl", c25581d.m132146d());
        }
        if (c25581d.m132147e() != null) {
            AbstractC27389b.m140321f(jSONObject2, "customReferenceData", c25581d.m132147e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C25588k c25588k : c25581d.m132151i()) {
            AbstractC27389b.m140321f(jSONObject5, c25588k.m132158c(), c25588k.m132159d());
        }
        C26439e.m136297a().m136302f(m146294u(), m132175t, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: l */
    public void m146285l(C26055a c26055a) {
        this.f135669c = c26055a;
    }

    /* renamed from: m */
    public void m146286m(boolean z11) {
        if (m146291r()) {
            C26439e.m136297a().m136312p(m146294u(), z11 ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: n */
    public void mo146287n() {
        this.f135667a.clear();
    }

    /* renamed from: o */
    public void m146288o(String str, long j11) {
        if (j11 >= this.f135671e) {
            a aVar = this.f135670d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f135670d = aVar2;
                C26439e.m136297a().m136309m(m146294u(), str);
            }
        }
    }

    /* renamed from: p */
    public C25578a m146289p() {
        return this.f135668b;
    }

    /* renamed from: q */
    public C26055a m146290q() {
        return this.f135669c;
    }

    /* renamed from: r */
    public boolean m146291r() {
        return this.f135667a.get() != 0;
    }

    /* renamed from: s */
    public void m146292s() {
        C26439e.m136297a().m136298b(m146294u());
    }

    /* renamed from: t */
    public void m146293t() {
        C26439e.m136297a().m136308l(m146294u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public WebView m146294u() {
        return (WebView) this.f135667a.get();
    }

    /* renamed from: v */
    public void m146295v() {
        C26439e.m136297a().m136311o(m146294u());
    }

    /* renamed from: w */
    public void m146296w() {
        this.f135671e = AbstractC27391d.m140334a();
        this.f135670d = a.AD_STATE_IDLE;
    }
}
