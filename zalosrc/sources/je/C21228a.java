package je;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: je.a */
/* loaded from: classes3.dex */
public final class C21228a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f103495a;

    /* renamed from: b */
    private String f103496b;

    /* renamed from: c */
    private String f103497c;

    /* renamed from: d */
    private String f103498d;

    /* renamed from: e */
    private int f103499e;

    /* renamed from: f */
    private String f103500f;

    /* renamed from: g */
    private boolean f103501g;

    /* renamed from: je.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21228a() {
        this(null, null, null, null, 0, null, false, 127, null);
    }

    /* renamed from: a */
    public final String m110001a() {
        return this.f103498d;
    }

    /* renamed from: b */
    public final String m110002b() {
        return this.f103495a;
    }

    /* renamed from: c */
    public final JSONObject m110003c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f103495a);
            jSONObject.put("name", this.f103496b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("artist", this.f103498d);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("media", jSONObject2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final String m110004d() {
        return this.f103496b;
    }

    /* renamed from: e */
    public final String m110005e() {
        return this.f103500f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21228a)) {
            return false;
        }
        C21228a c21228a = (C21228a) obj;
        return AbstractC19074t.m100204b(this.f103495a, c21228a.f103495a) && AbstractC19074t.m100204b(this.f103496b, c21228a.f103496b) && AbstractC19074t.m100204b(this.f103497c, c21228a.f103497c) && AbstractC19074t.m100204b(this.f103498d, c21228a.f103498d) && this.f103499e == c21228a.f103499e && AbstractC19074t.m100204b(this.f103500f, c21228a.f103500f) && this.f103501g == c21228a.f103501g;
    }

    /* renamed from: f */
    public final String m110006f() {
        return this.f103497c;
    }

    /* renamed from: g */
    public final boolean m110007g() {
        return AbstractC19074t.m100204b(this.f103495a, "0");
    }

    /* renamed from: h */
    public final boolean m110008h() {
        return this.f103501g;
    }

    public int hashCode() {
        return (((((((((((this.f103495a.hashCode() * 31) + this.f103496b.hashCode()) * 31) + this.f103497c.hashCode()) * 31) + this.f103498d.hashCode()) * 31) + this.f103499e) * 31) + this.f103500f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f103501g);
    }

    /* renamed from: i */
    public final void m110009i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103498d = str;
    }

    /* renamed from: j */
    public final void m110010j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103495a = str;
    }

    /* renamed from: k */
    public final void m110011k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103496b = str;
    }

    /* renamed from: l */
    public final void m110012l(boolean z11) {
        this.f103501g = z11;
    }

    /* renamed from: m */
    public final void m110013m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103497c = str;
    }

    public String toString() {
        return "RingBackTone(id=" + this.f103495a + ", name=" + this.f103496b + ", thumb=" + this.f103497c + ", artist=" + this.f103498d + ", duration=" + this.f103499e + ", src=" + this.f103500f + ", isSelected=" + this.f103501g + ")";
    }

    public C21228a(String str, String str2, String str3, String str4, int i11, String str5, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(str4, "artist");
        AbstractC19074t.m100208f(str5, "src");
        this.f103495a = str;
        this.f103496b = str2;
        this.f103497c = str3;
        this.f103498d = str4;
        this.f103499e = i11;
        this.f103500f = str5;
        this.f103501g = z11;
    }

    public /* synthetic */ C21228a(String str, String str2, String str3, String str4, int i11, String str5, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? "" : str4, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) == 0 ? str5 : "", (i12 & 64) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21228a(JSONObject jSONObject) {
        this(null, null, null, null, 0, null, false, 127, null);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            String optString = jSONObject.optString("id");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f103495a = optString;
            String optString2 = jSONObject.optString("name");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f103496b = optString2;
            String optString3 = jSONObject.optString("src");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f103500f = optString3;
            JSONObject jSONObject2 = jSONObject.getJSONObject("media");
            String optString4 = jSONObject2.optString("artist");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f103498d = optString4;
            String optString5 = jSONObject2.optString("thumb");
            AbstractC19074t.m100207e(optString5, "optString(...)");
            this.f103497c = optString5;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
