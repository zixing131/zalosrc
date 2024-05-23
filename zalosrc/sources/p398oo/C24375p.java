package p398oo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p425po.C24893o;
import pm0.C24848g0;

/* renamed from: oo.p */
/* loaded from: classes4.dex */
public final class C24375p {

    /* renamed from: a */
    private final String f117722a;

    /* renamed from: b */
    private final boolean f117723b;

    /* renamed from: c */
    private final List f117724c;

    public C24375p(String str, boolean z11, List list) {
        AbstractC19074t.m100208f(str, "lastUserId");
        AbstractC19074t.m100208f(list, "users");
        this.f117722a = str;
        this.f117723b = z11;
        this.f117724c = list;
    }

    /* renamed from: a */
    public final String m127488a() {
        return this.f117722a;
    }

    /* renamed from: b */
    public final List m127489b() {
        return this.f117724c;
    }

    /* renamed from: c */
    public final boolean m127490c() {
        return this.f117723b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24375p)) {
            return false;
        }
        C24375p c24375p = (C24375p) obj;
        return AbstractC19074t.m100204b(this.f117722a, c24375p.f117722a) && this.f117723b == c24375p.f117723b && AbstractC19074t.m100204b(this.f117724c, c24375p.f117724c);
    }

    public int hashCode() {
        return (((this.f117722a.hashCode() * 31) + AbstractC2144f.m11520a(this.f117723b)) * 31) + this.f117724c.hashCode();
    }

    public String toString() {
        return "ListTabUserResult(lastUserId=" + this.f117722a + ", isLoadMore=" + this.f117723b + ", users=" + this.f117724c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24375p(JSONObject jSONObject) {
        this(r0, r1, r2);
        AbstractC19074t.m100208f(jSONObject, "json");
        String optString = jSONObject.optString("lastUserId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        boolean optBoolean = jSONObject.optBoolean("isLoadMore");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("list");
        if (optJSONArray != null) {
            AbstractC19074t.m100205c(optJSONArray);
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                if (jSONObject2 != null) {
                    AbstractC19074t.m100205c(jSONObject2);
                    arrayList.add(new C24893o(jSONObject2));
                }
            }
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
    }
}
