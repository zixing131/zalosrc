package lb;

import org.json.JSONObject;

/* renamed from: lb.e */
/* loaded from: classes3.dex */
public final class C22392e {

    /* renamed from: a */
    private final int f109628a;

    /* renamed from: b */
    private final String f109629b;

    public C22392e(int i11, String str) {
        this.f109628a = i11;
        this.f109629b = str;
    }

    /* renamed from: a */
    public static C22392e m115806a(JSONObject jSONObject) {
        return new C22392e(jSONObject.optInt("enable", 0), jSONObject.optString("link", ""));
    }

    /* renamed from: b */
    public String m115807b() {
        return this.f109629b;
    }

    /* renamed from: c */
    public boolean m115808c() {
        return this.f109628a == 1;
    }
}
