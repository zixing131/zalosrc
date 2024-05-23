package bo;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: bo.f3 */
/* loaded from: classes4.dex */
public final class C2973f3 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f11756a;

    /* renamed from: b */
    private long f11757b;

    /* renamed from: c */
    private boolean f11758c;

    /* renamed from: d */
    private boolean f11759d;

    /* renamed from: bo.f3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2973f3 m14076a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            String optString = jSONObject.optString("data");
            long optLong = jSONObject.optLong("createTime");
            boolean optBoolean = jSONObject.optBoolean("isRead");
            boolean optBoolean2 = jSONObject.optBoolean("isProfileEntryPointRead");
            AbstractC19074t.m100205c(optString);
            return new C2973f3(optString, optLong, optBoolean, optBoolean2);
        }
    }

    public C2973f3(String str, long j11, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "data");
        this.f11756a = str;
        this.f11757b = j11;
        this.f11758c = z11;
        this.f11759d = z12;
    }

    /* renamed from: a */
    public static final C2973f3 m14068a(JSONObject jSONObject) {
        return Companion.m14076a(jSONObject);
    }

    /* renamed from: b */
    public final long m14069b() {
        return this.f11757b;
    }

    /* renamed from: c */
    public final boolean m14070c() {
        return this.f11759d;
    }

    /* renamed from: d */
    public final boolean m14071d() {
        return this.f11758c;
    }

    /* renamed from: e */
    public final void m14072e(boolean z11) {
        this.f11759d = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2973f3)) {
            return false;
        }
        C2973f3 c2973f3 = (C2973f3) obj;
        return AbstractC19074t.m100204b(this.f11756a, c2973f3.f11756a) && this.f11757b == c2973f3.f11757b && this.f11758c == c2973f3.f11758c && this.f11759d == c2973f3.f11759d;
    }

    /* renamed from: f */
    public final void m14073f(boolean z11) {
        this.f11758c = z11;
    }

    /* renamed from: g */
    public final String m14074g() {
        String jSONObject = m14075h().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* renamed from: h */
    public final JSONObject m14075h() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.f11756a);
        jSONObject.put("createTime", this.f11757b);
        jSONObject.put("isRead", this.f11758c);
        jSONObject.put("isProfileEntryPointRead", this.f11759d);
        return jSONObject;
    }

    public int hashCode() {
        return (((((this.f11756a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f11757b)) * 31) + AbstractC2144f.m11520a(this.f11758c)) * 31) + AbstractC2144f.m11520a(this.f11759d);
    }

    public String toString() {
        return "StoryArchiveProfileNotificationItem(data=" + this.f11756a + ", createTime=" + this.f11757b + ", isRead=" + this.f11758c + ", isProfileEntryPointRead=" + this.f11759d + ")";
    }
}
