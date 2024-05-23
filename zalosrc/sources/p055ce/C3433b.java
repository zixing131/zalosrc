package p055ce;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import org.json.JSONObject;

/* renamed from: ce.b */
/* loaded from: classes3.dex */
public final class C3433b {
    public static final a Companion = new a(null);

    /* renamed from: l */
    private static final String f14417l;

    /* renamed from: a */
    private int f14418a;

    /* renamed from: b */
    private String f14419b;

    /* renamed from: c */
    private int f14420c;

    /* renamed from: d */
    private String f14421d;

    /* renamed from: e */
    private String f14422e;

    /* renamed from: f */
    private String f14423f;

    /* renamed from: g */
    private String f14424g;

    /* renamed from: h */
    private String f14425h;

    /* renamed from: i */
    private String f14426i;

    /* renamed from: j */
    private long f14427j;

    /* renamed from: k */
    private long f14428k;

    /* renamed from: ce.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m17260a() {
            return C3433b.f14417l;
        }
    }

    static {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_business_account);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        f14417l = m118743r0;
    }

    public C3433b() {
        this.f14418a = 1;
        this.f14419b = "";
        this.f14420c = -1;
        this.f14421d = "";
        this.f14422e = "";
        this.f14423f = "";
        this.f14424g = "";
        this.f14425h = "";
        this.f14426i = "";
    }

    /* renamed from: b */
    public final String m17249b() {
        return this.f14423f;
    }

    /* renamed from: c */
    public final int m17250c() {
        return this.f14420c;
    }

    /* renamed from: d */
    public final String m17251d() {
        return this.f14421d;
    }

    /* renamed from: e */
    public final String m17252e() {
        return this.f14422e;
    }

    /* renamed from: f */
    public final String m17253f() {
        return this.f14425h;
    }

    /* renamed from: g */
    public final long m17254g() {
        return this.f14428k;
    }

    /* renamed from: h */
    public final String m17255h() {
        return this.f14419b;
    }

    /* renamed from: i */
    public final int m17256i() {
        return this.f14418a;
    }

    /* renamed from: j */
    public final String m17257j() {
        return this.f14426i;
    }

    /* renamed from: k */
    public final long m17258k() {
        return this.f14427j;
    }

    /* renamed from: l */
    public final String m17259l() {
        return this.f14424g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3433b(JSONObject jSONObject) {
        this();
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        this.f14418a = jSONObject.optInt("package_id", this.f14418a);
        String optString = jSONObject.optString("label_name", f14417l);
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f14419b = optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("ba_info");
        if (optJSONObject != null) {
            String optString2 = optJSONObject.optString("category_name", this.f14421d);
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f14421d = optString2;
            this.f14420c = optJSONObject.optInt("category_id", this.f14420c);
            String optString3 = optJSONObject.optString("description", this.f14422e);
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f14422e = optString3;
            String optString4 = optJSONObject.optString("address", this.f14423f);
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f14423f = optString4;
            String optString5 = optJSONObject.optString("website", this.f14424g);
            AbstractC19074t.m100207e(optString5, "optString(...)");
            this.f14424g = optString5;
            String optString6 = optJSONObject.optString("email", this.f14425h);
            AbstractC19074t.m100207e(optString6, "optString(...)");
            this.f14425h = optString6;
            String optString7 = optJSONObject.optString("shortlink", this.f14426i);
            AbstractC19074t.m100207e(optString7, "optString(...)");
            this.f14426i = optString7;
            this.f14427j = optJSONObject.optLong("start_time_in_millis", this.f14427j);
            this.f14428k = optJSONObject.optLong("end_time_in_millis", this.f14428k);
        }
    }
}
