package p625wy;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: wy.a */
/* loaded from: classes4.dex */
public final class C29268a implements InterfaceC29270c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f135657a;

    /* renamed from: b */
    private final String f135658b;

    /* renamed from: c */
    private final String f135659c;

    /* renamed from: d */
    private final String f135660d;

    /* renamed from: wy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29268a m146266a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObj");
            String optString = jSONObject.optString("bin");
            AbstractC19074t.m100207e(optString, "optString(...)");
            String optString2 = jSONObject.optString("number");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            String optString3 = jSONObject.optString("bank_name");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            String optString4 = jSONObject.optString("user_name");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            return new C29268a(optString, optString2, optString3, optString4);
        }
    }

    public C29268a(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "bin");
        AbstractC19074t.m100208f(str2, "number");
        AbstractC19074t.m100208f(str3, "bankName");
        AbstractC19074t.m100208f(str4, "userName");
        this.f135657a = str;
        this.f135658b = str2;
        this.f135659c = str3;
        this.f135660d = str4;
    }

    /* renamed from: a */
    public final String m146261a() {
        return this.f135659c;
    }

    /* renamed from: b */
    public final String m146262b() {
        return this.f135657a;
    }

    /* renamed from: c */
    public final String m146263c() {
        return this.f135658b;
    }

    /* renamed from: d */
    public final String m146264d() {
        return this.f135660d;
    }

    /* renamed from: e */
    public final boolean m146265e() {
        if (this.f135657a.length() > 0 && this.f135658b.length() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29268a)) {
            return false;
        }
        C29268a c29268a = (C29268a) obj;
        return AbstractC19074t.m100204b(this.f135657a, c29268a.f135657a) && AbstractC19074t.m100204b(this.f135658b, c29268a.f135658b) && AbstractC19074t.m100204b(this.f135659c, c29268a.f135659c) && AbstractC19074t.m100204b(this.f135660d, c29268a.f135660d);
    }

    public int hashCode() {
        return (((((this.f135657a.hashCode() * 31) + this.f135658b.hashCode()) * 31) + this.f135659c.hashCode()) * 31) + this.f135660d.hashCode();
    }

    public String toString() {
        return "BankAccount(bin=" + this.f135657a + ", number=" + this.f135658b + ", bankName=" + this.f135659c + ", userName=" + this.f135660d + ")";
    }
}
