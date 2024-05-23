package p642xe;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p295kb.C21643a;

/* renamed from: xe.a */
/* loaded from: classes3.dex */
public final class C29605a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f136670a;

    /* renamed from: b */
    private final String f136671b;

    /* renamed from: c */
    private final String f136672c;

    /* renamed from: d */
    private final String f136673d;

    /* renamed from: e */
    private final String f136674e;

    /* renamed from: f */
    private final String f136675f;

    /* renamed from: g */
    private final int f136676g;

    /* renamed from: h */
    private final int f136677h;

    /* renamed from: i */
    private final int f136678i;

    /* renamed from: j */
    private final JSONObject f136679j;

    /* renamed from: k */
    private int f136680k;

    /* renamed from: l */
    private int f136681l;

    /* renamed from: m */
    private int f136682m;

    /* renamed from: n */
    private long f136683n;

    /* renamed from: o */
    private long f136684o;

    /* renamed from: p */
    private final C21643a f136685p;

    /* renamed from: q */
    private final C21643a f136686q;

    /* renamed from: r */
    private final C21643a f136687r;

    /* renamed from: s */
    private boolean f136688s;

    /* renamed from: t */
    private String f136689t;

    /* renamed from: xe.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29605a m147148a(String str) {
            AbstractC19074t.m100208f(str, "data");
            return new C29605a(new JSONObject(str), null);
        }

        /* renamed from: b */
        public final C29605a m147149b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "dataObj");
            C29605a c29605a = new C29605a(jSONObject, null);
            c29605a.m147142s(jSONObject.toString());
            return c29605a;
        }
    }

    public /* synthetic */ C29605a(JSONObject jSONObject, AbstractC19060k abstractC19060k) {
        this(jSONObject);
    }

    /* renamed from: a */
    public static final C29605a m147124a(String str) {
        return Companion.m147148a(str);
    }

    /* renamed from: b */
    public static final C29605a m147125b(JSONObject jSONObject) {
        return Companion.m147149b(jSONObject);
    }

    /* renamed from: c */
    public final String m147126c() {
        return this.f136673d;
    }

    /* renamed from: d */
    public final String m147127d() {
        return this.f136675f;
    }

    /* renamed from: e */
    public final String m147128e() {
        return this.f136674e;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C29605a) && this.f136670a == ((C29605a) obj).f136670a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m147129f() {
        return this.f136689t;
    }

    /* renamed from: g */
    public final int m147130g() {
        return this.f136677h;
    }

    /* renamed from: h */
    public final long m147131h() {
        return this.f136670a;
    }

    public int hashCode() {
        long j11 = this.f136670a;
        return (int) (j11 ^ (j11 >>> 32));
    }

    /* renamed from: i */
    public final String m147132i() {
        return this.f136672c;
    }

    /* renamed from: j */
    public final int m147133j() {
        return this.f136676g;
    }

    /* renamed from: k */
    public final int m147134k() {
        return this.f136681l;
    }

    /* renamed from: l */
    public final int m147135l() {
        return this.f136678i;
    }

    /* renamed from: m */
    public final long m147136m() {
        return this.f136684o;
    }

    /* renamed from: n */
    public final long m147137n() {
        return this.f136683n;
    }

    /* renamed from: o */
    public final int m147138o() {
        return this.f136682m;
    }

    /* renamed from: p */
    public final int m147139p() {
        return this.f136680k;
    }

    /* renamed from: q */
    public final boolean m147140q() {
        return this.f136688s;
    }

    /* renamed from: r */
    public final boolean m147141r(int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f136685p.m111567c(-1) && this.f136686q.m111567c(-1) && this.f136687r.m111567c(-1)) {
            return true;
        }
        if (!this.f136685p.m111569f() && !this.f136685p.m111567c(-1) && !this.f136685p.m111567c(i11)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.f136686q.m111569f() && !this.f136686q.m111567c(-1) && !this.f136686q.m111567c(i12)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!this.f136687r.m111569f() && !this.f136687r.m111567c(-1) && !this.f136687r.m111567c(i13)) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z11 && z12 && z13) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m147142s(String str) {
        this.f136689t = str;
    }

    /* renamed from: t */
    public final void m147143t(boolean z11) {
        this.f136688s = z11;
    }

    /* renamed from: u */
    public final void m147144u(long j11) {
        this.f136670a = j11;
    }

    /* renamed from: v */
    public final void m147145v(long j11) {
        this.f136684o = j11;
    }

    /* renamed from: w */
    public final void m147146w(long j11) {
        this.f136683n = j11;
    }

    /* renamed from: x */
    public final JSONObject m147147x() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterId", this.f136670a);
            jSONObject.put("filterTitle", this.f136671b);
            jSONObject.put("filterThumb", this.f136672c);
            jSONObject.put("attachment", this.f136673d);
            jSONObject.put("checksumZip", this.f136674e);
            jSONObject.put("checksumFolder", this.f136675f);
            jSONObject.put("filterType", this.f136676g);
            jSONObject.put("filterEditable", this.f136677h);
            jSONObject.put("metadata", this.f136679j);
            return jSONObject;
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    private C29605a(JSONObject jSONObject) {
        this.f136685p = new C21643a();
        this.f136686q = new C21643a();
        this.f136687r = new C21643a();
        this.f136670a = jSONObject.getLong("filterId");
        String optString = jSONObject.optString("filterTitle");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f136671b = optString;
        String optString2 = jSONObject.optString("filterThumb");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f136672c = optString2;
        String optString3 = jSONObject.optString("attachment");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f136673d = optString3;
        String optString4 = jSONObject.optString("checksumZip");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f136674e = optString4;
        String optString5 = jSONObject.optString("checksumFolder");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        this.f136675f = optString5;
        this.f136676g = jSONObject.optInt("filterType");
        this.f136677h = jSONObject.optInt("filterEditable");
        this.f136678i = jSONObject.optInt("hasFaceDetect");
        this.f136679j = jSONObject.optJSONObject("metadata");
        this.f136680k = jSONObject.optInt("version");
        this.f136681l = jSONObject.optInt("filterVersion");
        this.f136682m = jSONObject.optInt("showRedDot");
        JSONArray optJSONArray = jSONObject.optJSONArray("showtime");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = optJSONArray.get(i11);
                JSONObject jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
                if (jSONObject2 != null && jSONObject2.has("startedTime") && jSONObject2.has("endTime")) {
                    int i12 = jSONObject2.getInt("startedTime");
                    int i13 = jSONObject2.getInt("endTime");
                    if (i12 != -1 && i13 != -1) {
                        while (i12 != i13) {
                            this.f136685p.m111565a(i12);
                            i12++;
                            if (i12 == 24) {
                                i12 = 0;
                            }
                        }
                        this.f136685p.m111565a(i13);
                    }
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("dayofweek");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i14 = 0; i14 < length2; i14++) {
                this.f136686q.m111565a(optJSONArray2.getInt(i14));
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("camera");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i15 = 0; i15 < length3; i15++) {
                this.f136687r.m111565a(optJSONArray3.getInt(i15));
            }
        }
    }
}
