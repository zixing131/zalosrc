package sj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: sj.a */
/* loaded from: classes3.dex */
public final class C26275a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f124723a;

    /* renamed from: b */
    private int f124724b;

    /* renamed from: c */
    private String f124725c;

    /* renamed from: d */
    private String f124726d;

    /* renamed from: e */
    private int f124727e;

    /* renamed from: f */
    private int f124728f;

    /* renamed from: g */
    private int f124729g;

    /* renamed from: h */
    private long f124730h;

    /* renamed from: i */
    private long f124731i;

    /* renamed from: j */
    private boolean f124732j;

    /* renamed from: sj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26275a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f124723a = jSONObject.optInt("promotePos", -1);
        this.f124724b = jSONObject.optInt("promoteId", -1);
        String optString = jSONObject.optString("title", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f124725c = optString;
        String optString2 = jSONObject.optString("btnClose");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f124726d = optString2;
        this.f124727e = jSONObject.optInt("bgColor", -16758869);
        this.f124728f = jSONObject.optInt("textColor", -1);
        this.f124729g = jSONObject.optInt("lock");
        this.f124730h = jSONObject.optLong("startedTime");
        this.f124731i = jSONObject.optLong("endTime");
        this.f124732j = jSONObject.optBoolean("hidden");
        int i11 = this.f124729g;
        if (i11 < 0 || i11 > 1) {
            this.f124729g = 0;
        }
    }

    /* renamed from: a */
    public final int m135165a() {
        return this.f124727e;
    }

    /* renamed from: b */
    public final String m135166b() {
        return this.f124726d;
    }

    /* renamed from: c */
    public final long m135167c() {
        return this.f124731i;
    }

    /* renamed from: d */
    public final boolean m135168d() {
        return this.f124732j;
    }

    /* renamed from: e */
    public final int m135169e() {
        return this.f124729g;
    }

    /* renamed from: f */
    public final int m135170f() {
        return this.f124724b;
    }

    /* renamed from: g */
    public final int m135171g() {
        return this.f124723a;
    }

    /* renamed from: h */
    public final long m135172h() {
        return this.f124730h;
    }

    /* renamed from: i */
    public final int m135173i() {
        return this.f124728f;
    }

    /* renamed from: j */
    public final String m135174j() {
        return this.f124725c;
    }

    /* renamed from: k */
    public final void m135175k(boolean z11) {
        this.f124732j = z11;
    }

    /* renamed from: l */
    public final JSONObject m135176l() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("promotePos", this.f124723a);
        jSONObject.put("promoteId", this.f124724b);
        jSONObject.put("title", this.f124725c);
        jSONObject.put("btnClose", this.f124726d);
        jSONObject.put("bgColor", this.f124727e);
        jSONObject.put("textColor", this.f124728f);
        jSONObject.put("lock", this.f124729g);
        jSONObject.put("startedTime", this.f124730h);
        jSONObject.put("endTime", this.f124731i);
        jSONObject.put("hidden", this.f124732j);
        return jSONObject;
    }
}
