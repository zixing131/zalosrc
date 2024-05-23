package bj0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: bj0.e */
/* loaded from: classes7.dex */
public final class C2826e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f11309a;

    /* renamed from: b */
    private final String f11310b;

    /* renamed from: c */
    private final String f11311c;

    /* renamed from: d */
    private final String f11312d;

    /* renamed from: e */
    private final String f11313e;

    /* renamed from: f */
    private final C2822a f11314f;

    /* renamed from: g */
    private long f11315g;

    /* renamed from: bj0.e$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2826e m13663a(JSONObject jSONObject) {
            C2822a c2822a;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            String optString = jSONObject.optString("product_type");
            if (AbstractC19074t.m100204b(optString, "subscription")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("subscription_data");
                if (optJSONObject != null) {
                    c2822a = C2822a.Companion.m13646a(optJSONObject);
                } else {
                    throw new IllegalArgumentException("missing subscription_data");
                }
            } else {
                c2822a = null;
            }
            C2822a c2822a2 = c2822a;
            String optString2 = jSONObject.optString("uuid");
            AbstractC19074t.m100207e(optString2, "jsonObject.optString(\"uuid\")");
            String optString3 = jSONObject.optString("sku");
            AbstractC19074t.m100207e(optString3, "jsonObject.optString(\"sku\")");
            String optString4 = jSONObject.optString("tranx_id");
            AbstractC19074t.m100207e(optString4, "jsonObject.optString(\"tranx_id\")");
            AbstractC19074t.m100207e(optString, "productType");
            String optString5 = jSONObject.optString("verify_url");
            AbstractC19074t.m100207e(optString5, "jsonObject.optString(\"verify_url\")");
            return new C2826e(optString2, optString3, optString4, optString, optString5, c2822a2, 0L, 64, null);
        }
    }

    public C2826e(String str, String str2, String str3, String str4, String str5, C2822a c2822a, long j11) {
        AbstractC19074t.m100208f(str, "uuid");
        AbstractC19074t.m100208f(str2, "productId");
        AbstractC19074t.m100208f(str3, "tranxId");
        AbstractC19074t.m100208f(str4, "productType");
        AbstractC19074t.m100208f(str5, "verificationUrl");
        this.f11309a = str;
        this.f11310b = str2;
        this.f11311c = str3;
        this.f11312d = str4;
        this.f11313e = str5;
        this.f11314f = c2822a;
        this.f11315g = j11;
    }

    /* renamed from: a */
    public final String m13654a() {
        return this.f11310b;
    }

    /* renamed from: b */
    public final String m13655b() {
        return this.f11312d;
    }

    /* renamed from: c */
    public final C2822a m13656c() {
        return this.f11314f;
    }

    /* renamed from: d */
    public final String m13657d() {
        return this.f11311c;
    }

    /* renamed from: e */
    public final long m13658e() {
        return this.f11315g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2826e)) {
            return false;
        }
        C2826e c2826e = (C2826e) obj;
        return AbstractC19074t.m100204b(this.f11309a, c2826e.f11309a) && AbstractC19074t.m100204b(this.f11310b, c2826e.f11310b) && AbstractC19074t.m100204b(this.f11311c, c2826e.f11311c) && AbstractC19074t.m100204b(this.f11312d, c2826e.f11312d) && AbstractC19074t.m100204b(this.f11313e, c2826e.f11313e) && AbstractC19074t.m100204b(this.f11314f, c2826e.f11314f) && this.f11315g == c2826e.f11315g;
    }

    /* renamed from: f */
    public final String m13659f() {
        return this.f11309a;
    }

    /* renamed from: g */
    public final String m13660g() {
        return this.f11313e;
    }

    /* renamed from: h */
    public final boolean m13661h() {
        String str;
        C2822a c2822a = this.f11314f;
        if (c2822a != null) {
            str = c2822a.m13644f();
        } else {
            str = null;
        }
        return AbstractC19074t.m100204b(str, "deferred");
    }

    public int hashCode() {
        int hashCode = ((((((((this.f11309a.hashCode() * 31) + this.f11310b.hashCode()) * 31) + this.f11311c.hashCode()) * 31) + this.f11312d.hashCode()) * 31) + this.f11313e.hashCode()) * 31;
        C2822a c2822a = this.f11314f;
        return ((hashCode + (c2822a == null ? 0 : c2822a.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f11315g);
    }

    /* renamed from: i */
    public final void m13662i(long j11) {
        this.f11315g = j11;
    }

    public String toString() {
        return "ZTransactionData(uuid=" + this.f11309a + ", productId=" + this.f11310b + ", tranxId=" + this.f11311c + ", productType=" + this.f11312d + ", verificationUrl=" + this.f11313e + ", subscriptionData=" + this.f11314f + ", tranxIdRequestTime=" + this.f11315g + ")";
    }

    public /* synthetic */ C2826e(String str, String str2, String str3, String str4, String str5, C2822a c2822a, long j11, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, str4, str5, c2822a, (i11 & 64) != 0 ? 0L : j11);
    }
}
