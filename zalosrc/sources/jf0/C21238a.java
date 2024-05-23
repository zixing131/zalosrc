package jf0;

import org.json.JSONObject;

/* renamed from: jf0.a */
/* loaded from: classes5.dex */
public class C21238a {

    /* renamed from: a */
    public long f103520a;

    /* renamed from: b */
    public int f103521b;

    /* renamed from: c */
    public String f103522c;

    /* renamed from: d */
    public String f103523d;

    /* renamed from: e */
    public int f103524e;

    public C21238a(JSONObject jSONObject) {
        this.f103520a = 0L;
        this.f103521b = 1;
        this.f103524e = 0;
        this.f103520a = jSONObject.optLong("id", 0L);
        this.f103521b = jSONObject.optInt("featureId", 1);
        this.f103522c = jSONObject.optString("icon", "");
        this.f103523d = jSONObject.optString("name", "");
        this.f103524e = jSONObject.optInt("enable", 0);
    }

    /* renamed from: a */
    public boolean m110035a() {
        return this.f103524e == 1;
    }

    public C21238a() {
        this.f103520a = 0L;
        this.f103521b = 1;
        this.f103524e = 0;
    }
}
