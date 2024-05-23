package p627x;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p467r.C25581d;
import p467r.C25588k;
import p467r.C25589l;
import p512t.C26438d;
import p512t.C26439e;
import p562v.AbstractC27389b;
import p562v.AbstractC27391d;

/* renamed from: x.c */
/* loaded from: classes2.dex */
public class C29275c extends AbstractC29273a {

    /* renamed from: f */
    private WebView f135676f;

    /* renamed from: g */
    private Long f135677g = null;

    /* renamed from: h */
    private Map f135678h;

    /* renamed from: i */
    private final String f135679i;

    /* renamed from: x.c$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        private WebView f135680p;

        a() {
            this.f135680p = C29275c.this.f135676f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f135680p.destroy();
        }
    }

    public C29275c(Map map, String str) {
        this.f135678h = map;
        this.f135679i = str;
    }

    @Override // p627x.AbstractC29273a
    /* renamed from: a */
    public void mo146274a() {
        super.mo146274a();
        m146298y();
    }

    @Override // p627x.AbstractC29273a
    /* renamed from: j */
    public void mo146283j(C25589l c25589l, C25581d c25581d) {
        JSONObject jSONObject = new JSONObject();
        Map m132148f = c25581d.m132148f();
        for (String str : m132148f.keySet()) {
            AbstractC27389b.m140321f(jSONObject, str, (C25588k) m132148f.get(str));
        }
        m146284k(c25589l, c25581d, jSONObject);
    }

    @Override // p627x.AbstractC29273a
    /* renamed from: n */
    public void mo146287n() {
        super.mo146287n();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.f135677g == null ? 4000L : TimeUnit.MILLISECONDS.convert(AbstractC27391d.m140334a() - this.f135677g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f135676f = null;
    }

    /* renamed from: y */
    void m146298y() {
        WebView webView = new WebView(C26438d.m136294a().m136296c());
        this.f135676f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m146276c(this.f135676f);
        C26439e.m136297a().m136307k(this.f135676f, this.f135679i);
        for (String str : this.f135678h.keySet()) {
            C26439e.m136297a().m136300d(this.f135676f, ((C25588k) this.f135678h.get(str)).m132157a().toExternalForm(), str);
        }
        this.f135677g = Long.valueOf(AbstractC27391d.m140334a());
    }
}
