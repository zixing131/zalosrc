package p611wj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wj.e */
/* loaded from: classes3.dex */
public final class C29057e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f134618a;

    /* renamed from: b */
    private final String f134619b;

    /* renamed from: c */
    private final String f134620c;

    /* renamed from: d */
    private final String f134621d;

    /* renamed from: e */
    private final String f134622e;

    /* renamed from: f */
    private final String f134623f;

    /* renamed from: g */
    private final String f134624g;

    /* renamed from: wj.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29057e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        String optString = jSONObject.optString("src");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f134618a = optString;
        String optString2 = jSONObject.optString("name");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f134619b = optString2;
        String optString3 = jSONObject.optString("artist");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f134620c = optString3;
        String optString4 = jSONObject.optString("thumb");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f134621d = optString4;
        String optString5 = jSONObject.optString("href");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        this.f134622e = optString5;
        String optString6 = jSONObject.optString("stream_icon");
        AbstractC19074t.m100207e(optString6, "optString(...)");
        this.f134623f = optString6;
        String optString7 = jSONObject.optString("redirect_url");
        AbstractC19074t.m100207e(optString7, "optString(...)");
        this.f134624g = optString7;
    }

    /* renamed from: a */
    public final String m145121a() {
        return this.f134620c;
    }

    /* renamed from: b */
    public final String m145122b() {
        return this.f134622e;
    }

    /* renamed from: c */
    public final String m145123c() {
        return this.f134619b;
    }

    /* renamed from: d */
    public final String m145124d() {
        return this.f134624g;
    }

    /* renamed from: e */
    public final String m145125e() {
        return this.f134618a;
    }

    /* renamed from: f */
    public final String m145126f() {
        return this.f134623f;
    }

    /* renamed from: g */
    public final String m145127g() {
        return this.f134621d;
    }

    /* renamed from: h */
    public final JSONObject m145128h() {
        JSONObject jSONObject = new JSONObject();
        if (this.f134618a.length() > 0) {
            jSONObject.put("src", this.f134618a);
        }
        if (this.f134619b.length() > 0) {
            jSONObject.put("name", this.f134619b);
        }
        if (this.f134620c.length() > 0) {
            jSONObject.put("artist", this.f134620c);
        }
        if (this.f134621d.length() > 0) {
            jSONObject.put("thumb", this.f134621d);
        }
        if (this.f134622e.length() > 0) {
            jSONObject.put("href", this.f134622e);
        }
        if (this.f134623f.length() > 0) {
            jSONObject.put("stream_icon", this.f134623f);
        }
        if (this.f134624g.length() > 0) {
            jSONObject.put("redirect_url", this.f134624g);
        }
        return jSONObject;
    }
}
