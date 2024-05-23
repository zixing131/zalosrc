package bj0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25368s;

/* renamed from: bj0.a */
/* loaded from: classes7.dex */
public final class C2822a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final List f11297a;

    /* renamed from: b */
    private final String f11298b;

    /* renamed from: c */
    private final String f11299c;

    /* renamed from: d */
    private final boolean f11300d;

    /* renamed from: e */
    private final boolean f11301e;

    /* renamed from: f */
    private final String f11302f;

    /* renamed from: g */
    private final String f11303g;

    /* renamed from: bj0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:            r0 = bj0.AbstractC2823b.m13648b(r0);     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C2822a m13646a(JSONObject jSONObject) {
            List m131502j;
            boolean z11;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            JSONArray optJSONArray = jSONObject.optJSONArray("offer_tag");
            if (optJSONArray == null || m131502j == null) {
                m131502j = AbstractC25368s.m131502j();
            }
            List list = m131502j;
            String optString = jSONObject.optString("base_plan_id");
            AbstractC19074t.m100207e(optString, "basePlanId");
            if (optString.length() != 0) {
                String optString2 = jSONObject.optString("old_purchase_token");
                AbstractC19074t.m100207e(optString2, "jsonObject.optString(\"old_purchase_token\")");
                String optString3 = jSONObject.optString("proration_mode");
                AbstractC19074t.m100207e(optString3, "jsonObject.optString(\"proration_mode\")");
                String lowerCase = optString3.toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                boolean z12 = false;
                if (jSONObject.optInt("allowMultiZAAccount", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (jSONObject.optInt("validateOldPurchaseToken", 1) == 1) {
                    z12 = true;
                }
                String optString4 = jSONObject.optString("offer_id");
                AbstractC19074t.m100207e(optString4, "jsonObject.optString(\"offer_id\")");
                return new C2822a(list, optString2, lowerCase, z11, z12, optString, optString4);
            }
            throw new IllegalArgumentException("Missing base_plan_id");
        }
    }

    public C2822a(List list, String str, String str2, boolean z11, boolean z12, String str3, String str4) {
        AbstractC19074t.m100208f(list, "offerTags");
        AbstractC19074t.m100208f(str, "oldPurchaseToken");
        AbstractC19074t.m100208f(str3, "basePlanId");
        AbstractC19074t.m100208f(str4, "offerId");
        this.f11297a = list;
        this.f11298b = str;
        this.f11299c = str2;
        this.f11300d = z11;
        this.f11301e = z12;
        this.f11302f = str3;
        this.f11303g = str4;
    }

    /* renamed from: a */
    public final boolean m13639a() {
        return this.f11300d;
    }

    /* renamed from: b */
    public final String m13640b() {
        return this.f11302f;
    }

    /* renamed from: c */
    public final String m13641c() {
        return this.f11303g;
    }

    /* renamed from: d */
    public final List m13642d() {
        return this.f11297a;
    }

    /* renamed from: e */
    public final String m13643e() {
        return this.f11298b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2822a)) {
            return false;
        }
        C2822a c2822a = (C2822a) obj;
        return AbstractC19074t.m100204b(this.f11297a, c2822a.f11297a) && AbstractC19074t.m100204b(this.f11298b, c2822a.f11298b) && AbstractC19074t.m100204b(this.f11299c, c2822a.f11299c) && this.f11300d == c2822a.f11300d && this.f11301e == c2822a.f11301e && AbstractC19074t.m100204b(this.f11302f, c2822a.f11302f) && AbstractC19074t.m100204b(this.f11303g, c2822a.f11303g);
    }

    /* renamed from: f */
    public final String m13644f() {
        return this.f11299c;
    }

    /* renamed from: g */
    public final boolean m13645g() {
        return this.f11301e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f11297a.hashCode() * 31) + this.f11298b.hashCode()) * 31;
        String str = this.f11299c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.f11300d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f11301e;
        return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f11302f.hashCode()) * 31) + this.f11303g.hashCode();
    }

    public String toString() {
        return "SubscriptionData(offerTags=" + this.f11297a + ", oldPurchaseToken=" + this.f11298b + ", prorationMode=" + this.f11299c + ", allowMultiZAAccount=" + this.f11300d + ", validateOldPurchaseToken=" + this.f11301e + ", basePlanId=" + this.f11302f + ", offerId=" + this.f11303g + ")";
    }
}
