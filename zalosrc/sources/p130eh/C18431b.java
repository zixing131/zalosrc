package p130eh;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import vg.C28211v5;

/* renamed from: eh.b */
/* loaded from: classes3.dex */
public final class C18431b {

    /* renamed from: a */
    private final int f92923a;

    /* renamed from: b */
    private final C28211v5 f92924b;

    /* renamed from: c */
    private final int f92925c;

    /* renamed from: d */
    private String f92926d;

    public C18431b(int i11, C28211v5 c28211v5, int i12, String str) {
        AbstractC19074t.m100208f(c28211v5, "title");
        AbstractC19074t.m100208f(str, "hasNewMsg");
        this.f92923a = i11;
        this.f92924b = c28211v5;
        this.f92925c = i12;
        this.f92926d = str;
    }

    /* renamed from: a */
    public final boolean m97663a() {
        if (this.f92926d.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String m97664b() {
        return this.f92926d;
    }

    /* renamed from: c */
    public final int m97665c() {
        return this.f92923a;
    }

    /* renamed from: d */
    public final int m97666d() {
        return this.f92925c;
    }

    /* renamed from: e */
    public final C28211v5 m97667e() {
        return this.f92924b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18431b)) {
            return false;
        }
        C18431b c18431b = (C18431b) obj;
        return this.f92923a == c18431b.f92923a && AbstractC19074t.m100204b(this.f92924b, c18431b.f92924b) && this.f92925c == c18431b.f92925c && AbstractC19074t.m100204b(this.f92926d, c18431b.f92926d);
    }

    /* renamed from: f */
    public final void m97668f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f92926d = str;
    }

    public int hashCode() {
        return (((((this.f92923a * 31) + this.f92924b.hashCode()) * 31) + this.f92925c) * 31) + this.f92926d.hashCode();
    }

    public String toString() {
        int i11 = this.f92923a;
        C28211v5 c28211v5 = this.f92924b;
        return "LabelInfo(id=" + i11 + ", title=" + ((Object) c28211v5) + ", index=" + this.f92925c + ", hasNewMsg=" + this.f92926d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18431b(JSONObject jSONObject, int i11, String str) {
        this(jSONObject.optInt("id", -1), new C28211v5(jSONObject.optJSONObject("title")), i11, str);
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC19074t.m100208f(str, "newMsg");
    }
}
