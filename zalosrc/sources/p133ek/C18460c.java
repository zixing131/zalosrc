package p133ek;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ek.c */
/* loaded from: classes3.dex */
public final class C18460c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final String f93020a;

    /* renamed from: b */
    public final String f93021b;

    /* renamed from: c */
    public final String f93022c;

    /* renamed from: d */
    public final String f93023d;

    /* renamed from: e */
    public final int f93024e;

    /* renamed from: f */
    public final double f93025f;

    /* renamed from: g */
    public final double f93026g;

    /* renamed from: ek.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18460c m97791a(JSONObject jSONObject) {
            String string;
            String string2;
            String string3;
            int i11;
            double d11;
            double d12;
            double d13;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                String str = "";
                if (jSONObject.isNull("srcId")) {
                    string = "";
                } else {
                    string = jSONObject.getString("srcId");
                }
                if (jSONObject.isNull("title")) {
                    string2 = "";
                } else {
                    string2 = jSONObject.getString("title");
                }
                if (jSONObject.isNull("address")) {
                    string3 = "";
                } else {
                    string3 = jSONObject.getString("address");
                }
                if (jSONObject.isNull("distance")) {
                    i11 = 0;
                } else {
                    i11 = jSONObject.getInt("distance");
                }
                if (!jSONObject.isNull("icon")) {
                    str = jSONObject.getString("icon");
                }
                String str2 = str;
                double d14 = 0.0d;
                if (!jSONObject.isNull(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                    if (jSONObject2.isNull("lon")) {
                        d13 = 0.0d;
                    } else {
                        d13 = jSONObject2.getDouble("lon");
                    }
                    if (!jSONObject2.isNull("lat")) {
                        d14 = jSONObject2.getDouble("lat");
                    }
                    d11 = d13;
                    d12 = d14;
                } else {
                    d11 = 0.0d;
                    d12 = 0.0d;
                }
                AbstractC19074t.m100205c(string);
                AbstractC19074t.m100205c(string2);
                AbstractC19074t.m100205c(string3);
                AbstractC19074t.m100205c(str2);
                return new C18460c(string, string2, string3, str2, i11, d11, d12);
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return new C18460c(null, null, null, null, 0, 0.0d, 0.0d, 127, null);
            }
        }
    }

    public C18460c(String str, String str2, String str3, String str4, int i11, double d11, double d12) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "address");
        AbstractC19074t.m100208f(str4, "iconUrl");
        this.f93020a = str;
        this.f93021b = str2;
        this.f93022c = str3;
        this.f93023d = str4;
        this.f93024e = i11;
        this.f93025f = d11;
        this.f93026g = d12;
    }

    /* renamed from: a */
    public final String m97787a() {
        return this.f93020a;
    }

    /* renamed from: b */
    public final String m97788b() {
        return this.f93021b;
    }

    /* renamed from: c */
    public final String m97789c() {
        return this.f93022c;
    }

    /* renamed from: d */
    public final String m97790d() {
        return this.f93023d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18460c)) {
            return false;
        }
        C18460c c18460c = (C18460c) obj;
        return AbstractC19074t.m100204b(this.f93020a, c18460c.f93020a) && AbstractC19074t.m100204b(this.f93021b, c18460c.f93021b) && AbstractC19074t.m100204b(this.f93022c, c18460c.f93022c) && AbstractC19074t.m100204b(this.f93023d, c18460c.f93023d) && this.f93024e == c18460c.f93024e && Double.compare(this.f93025f, c18460c.f93025f) == 0 && Double.compare(this.f93026g, c18460c.f93026g) == 0;
    }

    public int hashCode() {
        return (((((((((((this.f93020a.hashCode() * 31) + this.f93021b.hashCode()) * 31) + this.f93022c.hashCode()) * 31) + this.f93023d.hashCode()) * 31) + this.f93024e) * 31) + AbstractC18459b.m97786a(this.f93025f)) * 31) + AbstractC18459b.m97786a(this.f93026g);
    }

    public String toString() {
        return "LocationFoursquareItem(id=" + this.f93020a + ", name=" + this.f93021b + ", address=" + this.f93022c + ", iconUrl=" + this.f93023d + ", distance=" + this.f93024e + ", longitude=" + this.f93025f + ", latitude=" + this.f93026g + ")";
    }

    public /* synthetic */ C18460c(String str, String str2, String str3, String str4, int i11, double d11, double d12, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) == 0 ? str4 : "", (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? 0.0d : d11, (i12 & 64) == 0 ? d12 : 0.0d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18460c(String str, String str2, String str3, double d11, double d12) {
        this(str, str2, str3, "", 0, d11, d12);
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "address");
    }
}
