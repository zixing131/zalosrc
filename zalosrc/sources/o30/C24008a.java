package o30;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;
import org.json.JSONObject;

/* renamed from: o30.a */
/* loaded from: classes5.dex */
public final class C24008a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f116303a;

    /* renamed from: b */
    private final String f116304b;

    /* renamed from: o30.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24008a m125882a(JSONObject jSONObject) {
            boolean m127128x;
            AbstractC19074t.m100208f(jSONObject, "json");
            int optInt = jSONObject.optInt("id");
            String optString = jSONObject.optString("text");
            if (optInt != 0) {
                AbstractC19074t.m100205c(optString);
                m127128x = AbstractC24341v.m127128x(optString);
                if (!m127128x) {
                    return new C24008a(String.valueOf(optInt), optString);
                }
                return null;
            }
            return null;
        }
    }

    public C24008a(String str, String str2) {
        AbstractC19074t.m100208f(str, "emoId");
        AbstractC19074t.m100208f(str2, "text");
        this.f116303a = str;
        this.f116304b = str2;
    }

    /* renamed from: a */
    public final String m125880a() {
        return this.f116303a;
    }

    /* renamed from: b */
    public final String m125881b() {
        return this.f116304b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24008a)) {
            return false;
        }
        C24008a c24008a = (C24008a) obj;
        return AbstractC19074t.m100204b(this.f116303a, c24008a.f116303a) && AbstractC19074t.m100204b(this.f116304b, c24008a.f116304b);
    }

    public int hashCode() {
        return (this.f116303a.hashCode() * 31) + this.f116304b.hashCode();
    }

    public String toString() {
        return "ReactionConfigData(emoId=" + this.f116303a + ", text=" + this.f116304b + ")";
    }
}
