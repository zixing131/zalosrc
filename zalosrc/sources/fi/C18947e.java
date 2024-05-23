package fi;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: fi.e */
/* loaded from: classes3.dex */
public final class C18947e {

    /* renamed from: a */
    private String f94514a;

    /* renamed from: b */
    private String f94515b;

    /* renamed from: c */
    private int f94516c;

    /* renamed from: d */
    private int f94517d;

    /* renamed from: e */
    private int f94518e;

    /* renamed from: f */
    private int f94519f;

    public C18947e(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f94514a = "";
        this.f94516c = -16777216;
        this.f94517d = -16777216;
        this.f94518e = -1;
        this.f94519f = -16777216;
        String m96089h = AbstractC18069a.m96089h(jSONObject, "keyword");
        AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
        this.f94514a = m96089h;
        String m96089h2 = AbstractC18069a.m96089h(jSONObject, "iconUrl");
        AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
        this.f94515b = m96089h2;
        if (jSONObject.has("startColor")) {
            this.f94516c = AbstractC18069a.m96085d(jSONObject, "startColor");
        }
        if (jSONObject.has("endColor")) {
            this.f94517d = AbstractC18069a.m96085d(jSONObject, "endColor");
        }
        if (jSONObject.has("bgColor")) {
            this.f94518e = AbstractC18069a.m96085d(jSONObject, "bgColor");
        }
        if (jSONObject.has("txtColor")) {
            this.f94519f = AbstractC18069a.m96085d(jSONObject, "txtColor");
        }
    }

    /* renamed from: a */
    public final int m99316a() {
        return this.f94518e;
    }

    /* renamed from: b */
    public final int m99317b() {
        return this.f94517d;
    }

    /* renamed from: c */
    public final String m99318c() {
        return this.f94514a;
    }

    /* renamed from: d */
    public final int m99319d() {
        return this.f94516c;
    }

    /* renamed from: e */
    public final String m99320e() {
        return this.f94515b;
    }

    /* renamed from: f */
    public final int m99321f() {
        return this.f94519f;
    }
}
