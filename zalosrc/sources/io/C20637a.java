package io;

import bo.C3000l0;
import bo.C3020p0;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import org.json.JSONObject;

/* renamed from: io.a */
/* loaded from: classes4.dex */
public final class C20637a {

    /* renamed from: a */
    private boolean f101537a;

    /* renamed from: b */
    private C3000l0 f101538b;

    /* renamed from: c */
    private String f101539c;

    /* renamed from: d */
    private C3020p0 f101540d;

    /* renamed from: e */
    private boolean f101541e;

    /* renamed from: f */
    private boolean f101542f;

    /* renamed from: g */
    private int f101543g;

    /* renamed from: h */
    private int f101544h;

    public C20637a() {
        this.f101539c = "";
        this.f101543g = -1;
        this.f101544h = -1;
    }

    /* renamed from: h */
    private final void m107537h(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f101538b = AbstractC20826v0.m108750B0(jSONObject);
        }
    }

    /* renamed from: i */
    private final void m107538i(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f101540d = AbstractC20826v0.m108752C0(jSONObject, this.f101544h);
        }
    }

    /* renamed from: a */
    public final int m107539a() {
        return this.f101543g;
    }

    /* renamed from: b */
    public final C3000l0 m107540b() {
        return this.f101538b;
    }

    /* renamed from: c */
    public final C3020p0 m107541c() {
        return this.f101540d;
    }

    /* renamed from: d */
    public final String m107542d() {
        return this.f101539c;
    }

    /* renamed from: e */
    public final boolean m107543e() {
        return this.f101542f;
    }

    /* renamed from: f */
    public final boolean m107544f() {
        return this.f101541e;
    }

    /* renamed from: g */
    public final boolean m107545g() {
        return this.f101537a;
    }

    /* renamed from: j */
    public final void m107546j(int i11) {
        this.f101543g = i11;
    }

    /* renamed from: k */
    public final void m107547k(boolean z11) {
        this.f101542f = z11;
    }

    /* renamed from: l */
    public final void m107548l(C3000l0 c3000l0) {
        this.f101538b = c3000l0;
    }

    /* renamed from: m */
    public final void m107549m(C3020p0 c3020p0) {
        this.f101540d = c3020p0;
    }

    /* renamed from: n */
    public final void m107550n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f101539c = str;
    }

    /* renamed from: o */
    public final void m107551o(boolean z11) {
        this.f101541e = z11;
    }

    /* renamed from: p */
    public final void m107552p(boolean z11) {
        this.f101537a = z11;
    }

    /* renamed from: q */
    public final JSONObject m107553q() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        C3000l0 c3000l0 = this.f101538b;
        JSONObject jSONObject3 = null;
        if (c3000l0 != null) {
            jSONObject = AbstractC20826v0.m108827p(c3000l0);
        } else {
            jSONObject = null;
        }
        jSONObject2.put("feed_content", jSONObject);
        jSONObject2.put("feed_item_id", this.f101539c);
        jSONObject2.put("is_in_mutual_mode", this.f101537a);
        C3020p0 c3020p0 = this.f101540d;
        if (c3020p0 != null) {
            jSONObject3 = c3020p0.m14474E0();
        }
        jSONObject2.put("feed_item", jSONObject3);
        jSONObject2.put("is_from_timeline", this.f101541e);
        jSONObject2.put("is_enable_edit_feed", this.f101542f);
        jSONObject2.put("access_from_src", this.f101543g);
        jSONObject2.put("holder_type", this.f101544h);
        return jSONObject2;
    }

    /* renamed from: r */
    public final String m107554r() {
        String jSONObject = m107553q().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    public C20637a(String str) {
        this.f101539c = "";
        this.f101543g = -1;
        this.f101544h = -1;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            m107537h(jSONObject.optJSONObject("feed_content"));
            String optString = jSONObject.optString("feed_item_id");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f101539c = optString;
            this.f101537a = jSONObject.optBoolean("is_in_mutual_mode");
            m107538i(jSONObject.optJSONObject("feed_item"));
            this.f101541e = jSONObject.optBoolean("is_from_timeline");
            this.f101542f = jSONObject.optBoolean("is_enable_edit_feed");
            this.f101543g = jSONObject.optInt("access_from_src", -1);
            this.f101544h = jSONObject.optInt("holder_type", -1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
