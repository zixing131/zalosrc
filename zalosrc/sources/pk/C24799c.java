package pk;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: pk.c */
/* loaded from: classes3.dex */
public final class C24799c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f119044a;

    /* renamed from: b */
    private String f119045b;

    /* renamed from: c */
    private int f119046c;

    /* renamed from: d */
    private long f119047d;

    /* renamed from: e */
    private String f119048e;

    /* renamed from: f */
    private long f119049f;

    /* renamed from: g */
    private String f119050g;

    /* renamed from: h */
    private long f119051h;

    /* renamed from: i */
    private String f119052i;

    /* renamed from: j */
    private boolean f119053j;

    /* renamed from: k */
    private boolean f119054k;

    /* renamed from: pk.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m128844a(C24799c c24799c, C24799c c24799c2) {
            AbstractC19074t.m100208f(c24799c, "sourceItem");
            AbstractC19074t.m100208f(c24799c2, "destItem");
            c24799c2.m128839s(c24799c.m128827g());
            c24799c2.m128841u(c24799c.m128828h());
            c24799c2.m128833m(c24799c.m128822b());
            c24799c2.m128843w(c24799c.m128830j());
            c24799c2.m128838r(c24799c.m128826f());
            c24799c2.m128837q(c24799c.m128825e());
        }

        /* renamed from: b */
        public final C24799c m128845b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            C24799c c24799c = new C24799c(0L, null, 0, 0L, null, 0L, null, 0L, null, false, false, 2047, null);
            try {
                c24799c.m128836p(jSONObject.optLong("collectionId", 0L));
                String optString = jSONObject.optString("name", "");
                AbstractC19074t.m100207e(optString, "optString(...)");
                c24799c.m128839s(optString);
                boolean z11 = false;
                c24799c.m128841u(jSONObject.optInt("size", 0));
                c24799c.m128833m(jSONObject.optLong("createdTime", 0L));
                String optString2 = jSONObject.optString("thumb", "");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                c24799c.m128843w(optString2);
                c24799c.m128838r(jSONObject.optLong("lastModifiedTime", 0L));
                String optString3 = jSONObject.optString("description", "");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                c24799c.m128834n(optString3);
                c24799c.m128837q(jSONObject.optLong("lastModifiedItemTime", 0L));
                c24799c.m128842v(C24801e.Companion.m128867b(new C24801e(c24799c.m128824d(), false, null, 0L, 14, null)));
                if (jSONObject.optInt("isPin", 0) > 0) {
                    z11 = true;
                }
                c24799c.m128840t(z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            return c24799c;
        }

        /* renamed from: c */
        public final JSONObject m128846c(C24799c c24799c) {
            AbstractC19074t.m100208f(c24799c, "item");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("collectionId", c24799c.m128824d());
            jSONObject.put("name", c24799c.m128827g());
            jSONObject.put("size", c24799c.m128828h());
            jSONObject.put("createdTime", c24799c.m128822b());
            jSONObject.put("thumb", c24799c.m128830j());
            jSONObject.put("lastModifiedTime", c24799c.m128826f());
            jSONObject.put("description", c24799c.m128823c());
            jSONObject.put("lastModifiedItemTime", c24799c.m128825e());
            jSONObject.put("stateLoadItem", c24799c.m128829i());
            jSONObject.put("isPin", c24799c.m128832l());
            return jSONObject;
        }

        /* renamed from: d */
        public final JSONObject m128847d(C24799c c24799c) {
            AbstractC19074t.m100208f(c24799c, "item");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", c24799c.m128827g());
            jSONObject.put("thumb", c24799c.m128830j());
            jSONObject.put("description", c24799c.m128823c());
            return jSONObject;
        }
    }

    public C24799c(long j11, String str, int i11, long j12, String str2, long j13, String str3, long j14, String str4, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "description");
        AbstractC19074t.m100208f(str4, "stateLoadItem");
        this.f119044a = j11;
        this.f119045b = str;
        this.f119046c = i11;
        this.f119047d = j12;
        this.f119048e = str2;
        this.f119049f = j13;
        this.f119050g = str3;
        this.f119051h = j14;
        this.f119052i = str4;
        this.f119053j = z11;
        this.f119054k = z12;
    }

    /* renamed from: a */
    public final String m128821a() {
        if (this.f119053j) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_collection_name);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        return this.f119045b;
    }

    /* renamed from: b */
    public final long m128822b() {
        return this.f119047d;
    }

    /* renamed from: c */
    public final String m128823c() {
        return this.f119050g;
    }

    /* renamed from: d */
    public final long m128824d() {
        return this.f119044a;
    }

    /* renamed from: e */
    public final long m128825e() {
        return this.f119051h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24799c)) {
            return false;
        }
        C24799c c24799c = (C24799c) obj;
        return this.f119044a == c24799c.f119044a && AbstractC19074t.m100204b(this.f119045b, c24799c.f119045b) && this.f119046c == c24799c.f119046c && this.f119047d == c24799c.f119047d && AbstractC19074t.m100204b(this.f119048e, c24799c.f119048e) && this.f119049f == c24799c.f119049f && AbstractC19074t.m100204b(this.f119050g, c24799c.f119050g) && this.f119051h == c24799c.f119051h && AbstractC19074t.m100204b(this.f119052i, c24799c.f119052i) && this.f119053j == c24799c.f119053j && this.f119054k == c24799c.f119054k;
    }

    /* renamed from: f */
    public final long m128826f() {
        return this.f119049f;
    }

    /* renamed from: g */
    public final String m128827g() {
        return this.f119045b;
    }

    /* renamed from: h */
    public final int m128828h() {
        return this.f119046c;
    }

    public int hashCode() {
        return (((((((((((((((((((AbstractC2147g0.m11521a(this.f119044a) * 31) + this.f119045b.hashCode()) * 31) + this.f119046c) * 31) + AbstractC2147g0.m11521a(this.f119047d)) * 31) + this.f119048e.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f119049f)) * 31) + this.f119050g.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f119051h)) * 31) + this.f119052i.hashCode()) * 31) + AbstractC2144f.m11520a(this.f119053j)) * 31) + AbstractC2144f.m11520a(this.f119054k);
    }

    /* renamed from: i */
    public final String m128829i() {
        return this.f119052i;
    }

    /* renamed from: j */
    public final String m128830j() {
        return this.f119048e;
    }

    /* renamed from: k */
    public final boolean m128831k() {
        return this.f119054k;
    }

    /* renamed from: l */
    public final boolean m128832l() {
        return this.f119053j;
    }

    /* renamed from: m */
    public final void m128833m(long j11) {
        this.f119047d = j11;
    }

    /* renamed from: n */
    public final void m128834n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119050g = str;
    }

    /* renamed from: o */
    public final void m128835o(boolean z11) {
        this.f119054k = z11;
    }

    /* renamed from: p */
    public final void m128836p(long j11) {
        this.f119044a = j11;
    }

    /* renamed from: q */
    public final void m128837q(long j11) {
        this.f119051h = j11;
    }

    /* renamed from: r */
    public final void m128838r(long j11) {
        this.f119049f = j11;
    }

    /* renamed from: s */
    public final void m128839s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119045b = str;
    }

    /* renamed from: t */
    public final void m128840t(boolean z11) {
        this.f119053j = z11;
    }

    public String toString() {
        return "MyCloudCollectionInfo(id=" + this.f119044a + ", name=" + this.f119045b + ", size=" + this.f119046c + ", createdTime=" + this.f119047d + ", thumb=" + this.f119048e + ", lastModifiedTime=" + this.f119049f + ", description=" + this.f119050g + ", lastModifiedItemTime=" + this.f119051h + ", stateLoadItem=" + this.f119052i + ", isPin=" + this.f119053j + ", isFake=" + this.f119054k + ")";
    }

    /* renamed from: u */
    public final void m128841u(int i11) {
        this.f119046c = i11;
    }

    /* renamed from: v */
    public final void m128842v(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119052i = str;
    }

    /* renamed from: w */
    public final void m128843w(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f119048e = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C24799c(long j11, String str, int i11, long j12, String str2, long j13, String str3, long j14, String str4, boolean z11, boolean z12, int i12, AbstractC19060k abstractC19060k) {
        this(r4, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? "" : str2, (i12 & 32) != 0 ? 0L : j13, (i12 & 64) == 0 ? str3 : "", (i12 & 128) == 0 ? j14 : 0L, (i12 & 256) != 0 ? C24801e.Companion.m128867b(new C24801e(r4, false, null, 0L, 14, null)) : str4, (i12 & 512) != 0 ? false : z11, (i12 & 1024) == 0 ? z12 : false);
        long j15 = (i12 & 1) != 0 ? 0L : j11;
    }
}
