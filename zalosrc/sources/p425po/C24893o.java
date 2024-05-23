package p425po;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: po.o */
/* loaded from: classes4.dex */
public final class C24893o {

    /* renamed from: a */
    private final String f119430a;

    /* renamed from: b */
    private final String f119431b;

    /* renamed from: c */
    private final String f119432c;

    public C24893o(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "avatar");
        AbstractC19074t.m100208f(str3, "displayName");
        this.f119430a = str;
        this.f119431b = str2;
        this.f119432c = str3;
    }

    /* renamed from: a */
    public final String m129414a() {
        return this.f119430a;
    }

    /* renamed from: b */
    public final JSONObject m129415b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", this.f119430a);
        jSONObject.put("avatar", this.f119431b);
        jSONObject.put("displayName", this.f119432c);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24893o)) {
            return false;
        }
        C24893o c24893o = (C24893o) obj;
        return AbstractC19074t.m100204b(this.f119430a, c24893o.f119430a) && AbstractC19074t.m100204b(this.f119431b, c24893o.f119431b) && AbstractC19074t.m100204b(this.f119432c, c24893o.f119432c);
    }

    public int hashCode() {
        return (((this.f119430a.hashCode() * 31) + this.f119431b.hashCode()) * 31) + this.f119432c.hashCode();
    }

    public String toString() {
        return "TabUser(userId=" + this.f119430a + ", avatar=" + this.f119431b + ", displayName=" + this.f119432c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24893o(JSONObject jSONObject) {
        this(r0, r2, r5);
        AbstractC19074t.m100208f(jSONObject, "json");
        String optString = jSONObject.optString("userId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        String optString2 = jSONObject.optString("avatar");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        String optString3 = jSONObject.optString("displayName");
        AbstractC19074t.m100207e(optString3, "optString(...)");
    }
}
