package p140ev;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ev.a */
/* loaded from: classes4.dex */
public final class C18612a {

    /* renamed from: a */
    private final String f93593a;

    /* renamed from: b */
    private final JSONObject f93594b;

    /* renamed from: c */
    private final String f93595c;

    public C18612a(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        this.f93593a = str;
        this.f93594b = jSONObject;
        this.f93595c = str2;
    }

    /* renamed from: a */
    public final String m98346a() {
        return this.f93595c;
    }

    /* renamed from: b */
    public final JSONObject m98347b() {
        return this.f93594b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18612a)) {
            return false;
        }
        C18612a c18612a = (C18612a) obj;
        return AbstractC19074t.m100204b(this.f93593a, c18612a.f93593a) && AbstractC19074t.m100204b(this.f93594b, c18612a.f93594b) && AbstractC19074t.m100204b(this.f93595c, c18612a.f93595c);
    }

    public int hashCode() {
        int hashCode = this.f93593a.hashCode() * 31;
        JSONObject jSONObject = this.f93594b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f93595c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ActionCommonInfo(action=" + this.f93593a + ", data=" + this.f93594b + ", callback=" + this.f93595c + ")";
    }
}
