package p624wx;

import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;

/* renamed from: wx.a */
/* loaded from: classes4.dex */
public final class C29258a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private JSONObject f135545a;

    /* renamed from: b */
    private boolean f135546b;

    /* renamed from: c */
    private int f135547c = 1;

    /* renamed from: d */
    private int f135548d = 30;

    /* renamed from: e */
    private int f135549e = 10;

    /* renamed from: f */
    private int f135550f = 120;

    /* renamed from: g */
    private int f135551g = 3000;

    /* renamed from: h */
    private int f135552h = 12;

    /* renamed from: i */
    private int f135553i = 1;

    /* renamed from: j */
    private int f135554j = 3;

    /* renamed from: k */
    private String f135555k = "https://catalog.zalo.me";

    /* renamed from: wx.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final int m146126a() {
        return this.f135548d;
    }

    /* renamed from: b */
    public final JSONObject m146127b() {
        return this.f135545a;
    }

    /* renamed from: c */
    public final int m146128c() {
        return this.f135547c;
    }

    /* renamed from: d */
    public final String m146129d() {
        return this.f135555k;
    }

    /* renamed from: e */
    public final int m146130e() {
        return this.f135551g;
    }

    /* renamed from: f */
    public final int m146131f() {
        return this.f135550f;
    }

    /* renamed from: g */
    public final int m146132g() {
        return this.f135553i;
    }

    /* renamed from: h */
    public final int m146133h() {
        return this.f135552h;
    }

    /* renamed from: i */
    public final int m146134i() {
        return this.f135554j;
    }

    /* renamed from: j */
    public final boolean m146135j() {
        return this.f135546b;
    }

    /* renamed from: k */
    public final void m146136k(JSONObject jSONObject) {
        boolean z11;
        int m116580c;
        int m116580c2;
        int m116580c3;
        int m116580c4;
        int m116580c5;
        int m116580c6;
        int m116580c7;
        int m116580c8;
        this.f135545a = jSONObject;
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setConfig: config: ");
            sb2.append(jSONObject);
        }
        JSONObject jSONObject2 = this.f135545a;
        if (jSONObject2 != null) {
            if (jSONObject2.optInt("enable") > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f135546b = z11;
            m116580c = AbstractC22543l.m116580c(jSONObject2.optInt("max_total_catalog", this.f135547c), 0);
            this.f135547c = m116580c;
            m116580c2 = AbstractC22543l.m116580c(jSONObject2.optInt("catalog_name_max_length", this.f135548d), 0);
            this.f135548d = m116580c2;
            m116580c3 = AbstractC22543l.m116580c(jSONObject2.optInt("max_total_product", this.f135549e), 0);
            this.f135549e = m116580c3;
            m116580c4 = AbstractC22543l.m116580c(jSONObject2.optInt("product_name_max_length", this.f135550f), 0);
            this.f135550f = m116580c4;
            m116580c5 = AbstractC22543l.m116580c(jSONObject2.optInt("product_desc_max_length", this.f135551g), 0);
            this.f135551g = m116580c5;
            m116580c6 = AbstractC22543l.m116580c(jSONObject2.optInt("product_price_max_length", this.f135552h), 0);
            this.f135552h = m116580c6;
            m116580c7 = AbstractC22543l.m116580c(jSONObject2.optInt("max_product_photo", this.f135553i), 0);
            this.f135553i = m116580c7;
            m116580c8 = AbstractC22543l.m116580c(jSONObject2.optInt("product_share_max_count", this.f135554j), 0);
            this.f135554j = m116580c8;
        }
    }

    /* renamed from: l */
    public final void m146137l(boolean z11) {
        this.f135546b = z11;
    }

    /* renamed from: m */
    public final void m146138m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f135555k = str;
    }
}
