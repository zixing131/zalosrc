package p140ev;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p307kv.AbstractC21954k;

/* renamed from: ev.f */
/* loaded from: classes4.dex */
public final class C18617f {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static C18617f f93629r;

    /* renamed from: a */
    private long f93630a;

    /* renamed from: b */
    private long f93631b;

    /* renamed from: c */
    private long f93632c;

    /* renamed from: d */
    private long f93633d;

    /* renamed from: e */
    private long f93634e;

    /* renamed from: f */
    private long f93635f;

    /* renamed from: g */
    private long f93636g;

    /* renamed from: h */
    private long f93637h;

    /* renamed from: i */
    private long f93638i;

    /* renamed from: j */
    private long f93639j;

    /* renamed from: k */
    private long f93640k;

    /* renamed from: l */
    private long f93641l;

    /* renamed from: m */
    private long f93642m;

    /* renamed from: n */
    private long f93643n;

    /* renamed from: o */
    private JSONObject f93644o = new JSONObject();

    /* renamed from: p */
    private long f93645p;

    /* renamed from: q */
    private boolean f93646q;

    /* renamed from: ev.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18617f m98397a() {
            return C18617f.f93629r;
        }

        /* renamed from: b */
        public final void m98398b() {
            C18617f.f93629r = new C18617f();
            C18617f c18617f = C18617f.f93629r;
            AbstractC19074t.m100205c(c18617f);
            c18617f.f93630a = AbstractC21954k.Companion.m114623r();
        }
    }

    /* renamed from: d */
    public final void m98381d(long j11, WebResourceRequest webResourceRequest) {
        Uri uri;
        this.f93643n++;
        long m114623r = AbstractC21954k.Companion.m114623r() - j11;
        this.f93642m += m114623r;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", j11 - this.f93630a);
            jSONObject.put("duration", m114623r);
            JSONObject jSONObject2 = this.f93644o;
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            jSONObject2.put(String.valueOf(uri), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final String m98382e(int i11) {
        if (this.f93646q) {
            return null;
        }
        this.f93646q = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ma_session_id", i11);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("init", this.f93632c - this.f93630a);
        jSONObject2.put("res_loading", Math.max(this.f93634e - this.f93632c, 0L));
        jSONObject2.put("login", Math.max(this.f93637h - this.f93636g, 0L));
        jSONObject2.put("total", this.f93635f - this.f93630a);
        jSONObject.put("duration_summary", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("start", 0);
        jSONObject3.put("show_loading", this.f93631b - this.f93630a);
        jSONObject3.put("load_mp_url", this.f93632c - this.f93630a);
        jSONObject3.put("zbrowser_res_hit", this.f93645p - this.f93630a);
        jSONObject3.put("page_started", this.f93633d - this.f93630a);
        jSONObject3.put("page_finished", this.f93634e - this.f93630a);
        jSONObject3.put("login", Math.max(this.f93636g - this.f93630a, 0L));
        jSONObject3.put("login_finished", Math.max(this.f93637h - this.f93630a, 0L));
        jSONObject3.put("storage_hit", Math.max(this.f93641l - this.f93630a, 0L));
        jSONObject3.put("close_loading", this.f93635f - this.f93630a);
        jSONObject.put("time_line", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("init", this.f93640k);
        jSONObject4.put("total_request", this.f93639j);
        jSONObject4.put("time_hit", this.f93638i);
        jSONObject.put("storage_info", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("cached", this.f93643n);
        jSONObject5.put("time_hit", this.f93642m);
        jSONObject5.put("res_loading_log", this.f93644o);
        jSONObject.put("zbrowser_info", jSONObject5);
        try {
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } finally {
            f93629r = null;
        }
    }

    /* renamed from: f */
    public final long m98383f() {
        return this.f93639j;
    }

    /* renamed from: g */
    public final long m98384g() {
        return this.f93638i;
    }

    /* renamed from: h */
    public final void m98385h() {
        if (this.f93634e == 0) {
            this.f93634e = AbstractC21954k.Companion.m114623r();
        }
    }

    /* renamed from: i */
    public final void m98386i() {
        this.f93633d = AbstractC21954k.Companion.m114623r();
    }

    /* renamed from: j */
    public final void m98387j() {
        if (this.f93635f == 0) {
            this.f93635f = AbstractC21954k.Companion.m114623r();
        }
    }

    /* renamed from: k */
    public final void m98388k() {
        this.f93637h = AbstractC21954k.Companion.m114623r();
    }

    /* renamed from: l */
    public final void m98389l() {
        this.f93632c = AbstractC21954k.Companion.m114623r();
    }

    /* renamed from: m */
    public final void m98390m(long j11) {
        if (this.f93640k == 0) {
            this.f93640k = j11;
        }
    }

    /* renamed from: n */
    public final void m98391n(long j11) {
        this.f93639j = j11;
    }

    /* renamed from: o */
    public final void m98392o(long j11) {
        this.f93638i = j11;
    }

    /* renamed from: p */
    public final void m98393p() {
        this.f93631b = AbstractC21954k.Companion.m114623r();
    }

    /* renamed from: q */
    public final void m98394q() {
        this.f93636g = AbstractC21954k.Companion.m114623r();
    }

    /* renamed from: r */
    public final void m98395r() {
        if (this.f93641l == 0) {
            this.f93641l = AbstractC21954k.Companion.m114623r();
        }
    }

    /* renamed from: s */
    public final void m98396s(long j11) {
        if (this.f93645p == 0) {
            this.f93645p = j11;
        }
    }
}
