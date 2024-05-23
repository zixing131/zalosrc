package bo;

import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: bo.b */
/* loaded from: classes4.dex */
public final class C2949b {

    /* renamed from: a */
    private long f11636a;

    /* renamed from: b */
    private String f11637b;

    /* renamed from: c */
    private String f11638c;

    /* renamed from: d */
    private String f11639d;

    /* renamed from: e */
    private ThemeItem f11640e;

    public C2949b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f11637b = "";
        this.f11638c = "";
        this.f11639d = "";
        ThemeItem.C8684b c8684b = ThemeItem.Companion;
        this.f11640e = c8684b.m46365a();
        try {
            this.f11636a = jSONObject.optLong("id");
            String optString = jSONObject.optString("thumb");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f11637b = optString;
            String optString2 = jSONObject.optString("title");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f11638c = optString2;
            JSONObject optJSONObject = jSONObject.optJSONObject("theme");
            if (optJSONObject != null) {
                String jSONObject2 = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                this.f11640e = c8684b.m46366b(jSONObject2);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: a */
    public final long m13958a() {
        return this.f11636a;
    }

    /* renamed from: b */
    public final String m13959b() {
        return this.f11639d;
    }

    /* renamed from: c */
    public final ThemeItem m13960c() {
        return this.f11640e;
    }

    /* renamed from: d */
    public final String m13961d() {
        return this.f11637b;
    }

    /* renamed from: e */
    public final String m13962e() {
        return this.f11638c;
    }

    /* renamed from: f */
    public final void m13963f(long j11) {
        this.f11636a = j11;
    }

    /* renamed from: g */
    public final void m13964g(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11639d = str;
    }

    /* renamed from: h */
    public final void m13965h(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "<set-?>");
        this.f11640e = themeItem;
    }

    /* renamed from: i */
    public final void m13966i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11637b = str;
    }

    /* renamed from: j */
    public final void m13967j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11638c = str;
    }

    /* renamed from: k */
    public final JSONObject m13968k() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f11636a);
        jSONObject.put("thumb", this.f11637b);
        jSONObject.put("title", this.f11638c);
        jSONObject.put("theme", this.f11640e.toJsonObject());
        return jSONObject;
    }

    public C2949b() {
        this(new JSONObject());
    }
}
