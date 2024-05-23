package o30;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: o30.b */
/* loaded from: classes5.dex */
public final class C24009b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f116305a;

    /* renamed from: b */
    private final int f116306b;

    /* renamed from: o30.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24009b m125887a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            int optInt = jSONObject.optInt("id");
            return new C24009b(String.valueOf(optInt), jSONObject.optInt("count"));
        }
    }

    public C24009b(String str, int i11) {
        AbstractC19074t.m100208f(str, "emoId");
        this.f116305a = str;
        this.f116306b = i11;
    }

    /* renamed from: b */
    public static final C24009b m125883b(JSONObject jSONObject) {
        return Companion.m125887a(jSONObject);
    }

    /* renamed from: a */
    public final C24009b m125884a(String str, int i11) {
        AbstractC19074t.m100208f(str, "emoId");
        return new C24009b(str, i11);
    }

    /* renamed from: c */
    public final int m125885c() {
        return this.f116306b;
    }

    /* renamed from: d */
    public final String m125886d() {
        return this.f116305a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24009b)) {
            return false;
        }
        C24009b c24009b = (C24009b) obj;
        return AbstractC19074t.m100204b(this.f116305a, c24009b.f116305a) && this.f116306b == c24009b.f116306b;
    }

    public int hashCode() {
        return (this.f116305a.hashCode() * 31) + this.f116306b;
    }

    public String toString() {
        return "ReactionStoryData(emoId=" + this.f116305a + ", count=" + this.f116306b + ")";
    }
}
