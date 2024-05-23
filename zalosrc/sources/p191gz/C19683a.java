package p191gz;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: gz.a */
/* loaded from: classes4.dex */
public final class C19683a {

    /* renamed from: a */
    private final int f97653a;

    /* renamed from: b */
    private final String f97654b;

    /* renamed from: c */
    private final JSONObject f97655c;

    public C19683a(int i11, String str, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f97653a = i11;
        this.f97654b = str;
        this.f97655c = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19683a)) {
            return false;
        }
        C19683a c19683a = (C19683a) obj;
        return this.f97653a == c19683a.f97653a && AbstractC19074t.m100204b(this.f97654b, c19683a.f97654b) && AbstractC19074t.m100204b(this.f97655c, c19683a.f97655c);
    }

    public int hashCode() {
        int hashCode = ((this.f97653a * 31) + this.f97654b.hashCode()) * 31;
        JSONObject jSONObject = this.f97655c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "PushLogResponse(errorCode=" + this.f97653a + ", errorMessage=" + this.f97654b + ", data=" + this.f97655c + ')';
    }

    public /* synthetic */ C19683a(int i11, String str, JSONObject jSONObject, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : jSONObject);
    }
}
