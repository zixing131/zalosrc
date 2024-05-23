package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONException;
import org.json.JSONObject;
import x20.C29299a;

/* renamed from: zh.y4 */
/* loaded from: classes3.dex */
public final class C32187y4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f148422a;

    /* renamed from: b */
    private long f148423b;

    /* renamed from: c */
    private int f148424c;

    /* renamed from: d */
    private int f148425d;

    /* renamed from: e */
    private String f148426e;

    /* renamed from: f */
    private b f148427f;

    /* renamed from: g */
    private int f148428g;

    /* renamed from: h */
    private int f148429h;

    /* renamed from: i */
    private long f148430i;

    /* renamed from: j */
    private String f148431j;

    /* renamed from: k */
    private String f148432k;

    /* renamed from: l */
    private String f148433l;

    /* renamed from: m */
    private long f148434m;

    /* renamed from: zh.y4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zh.y4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private float f148435a;

        /* renamed from: b */
        private float f148436b;

        /* renamed from: c */
        private float f148437c;

        /* renamed from: d */
        private float f148438d;

        /* renamed from: e */
        private int f148439e;

        /* renamed from: f */
        private int f148440f;

        /* renamed from: g */
        private String f148441g;

        /* renamed from: zh.y4$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public b() {
        }

        public b(JSONObject jSONObject) {
            this();
            if (jSONObject != null) {
                this.f148435a = (float) jSONObject.optDouble("top", 0.0d);
                this.f148436b = (float) jSONObject.optDouble("left", 0.0d);
                this.f148437c = (float) jSONObject.optDouble("right", 0.0d);
                this.f148438d = (float) jSONObject.optDouble("bottom", 0.0d);
                this.f148439e = jSONObject.optInt("contentMode", 1);
                this.f148440f = jSONObject.optInt("layoutId", 0);
                this.f148441g = jSONObject.optString("layoutType");
            }
        }

        /* renamed from: a */
        public final float m155192a() {
            return this.f148438d;
        }

        /* renamed from: b */
        public final int m155193b() {
            return this.f148440f;
        }

        /* renamed from: c */
        public final float m155194c() {
            return this.f148436b;
        }

        /* renamed from: d */
        public final float m155195d() {
            return this.f148437c;
        }

        /* renamed from: e */
        public final float m155196e() {
            return this.f148435a;
        }

        /* renamed from: f */
        public final void m155197f(float f11) {
            this.f148438d = f11;
        }

        /* renamed from: g */
        public final void m155198g(int i11) {
            this.f148440f = i11;
        }

        /* renamed from: h */
        public final void m155199h(float f11) {
            this.f148436b = f11;
        }

        /* renamed from: i */
        public final void m155200i(float f11) {
            this.f148437c = f11;
        }

        /* renamed from: j */
        public final void m155201j(float f11) {
            this.f148435a = f11;
        }
    }

    public C32187y4() {
        this.f148425d = 1;
        this.f148426e = "";
        this.f148431j = "";
        this.f148432k = "";
        this.f148433l = "";
    }

    /* renamed from: a */
    public final long m155173a() {
        return this.f148434m;
    }

    /* renamed from: b */
    public final int m155174b() {
        return this.f148429h;
    }

    /* renamed from: c */
    public final long m155175c() {
        return this.f148422a;
    }

    /* renamed from: d */
    public final b m155176d() {
        return this.f148427f;
    }

    /* renamed from: e */
    public final float m155177e() {
        b bVar = this.f148427f;
        if (bVar != null) {
            return bVar.m155192a();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final int m155178f() {
        b bVar = this.f148427f;
        if (bVar != null) {
            return bVar.m155193b();
        }
        return 0;
    }

    /* renamed from: g */
    public final float m155179g() {
        b bVar = this.f148427f;
        if (bVar != null) {
            return bVar.m155194c();
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m155180h() {
        b bVar = this.f148427f;
        if (bVar != null) {
            return bVar.m155195d();
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float m155181i() {
        b bVar = this.f148427f;
        if (bVar != null) {
            return bVar.m155196e();
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final String m155182j() {
        return this.f148433l;
    }

    /* renamed from: k */
    public final long m155183k() {
        return this.f148423b;
    }

    /* renamed from: l */
    public final int m155184l() {
        return this.f148428g;
    }

    /* renamed from: m */
    public final String m155185m() {
        return this.f148431j;
    }

    /* renamed from: n */
    public final String m155186n() {
        return this.f148426e;
    }

    /* renamed from: o */
    public final String m155187o() {
        return this.f148432k;
    }

    /* renamed from: p */
    public final int m155188p() {
        return this.f148425d;
    }

    /* renamed from: q */
    public final boolean m155189q() {
        return this.f148424c == 1 || this.f148425d == 2;
    }

    /* renamed from: r */
    public final void m155190r(long j11) {
        this.f148430i = j11;
    }

    /* renamed from: s */
    public final String m155191s() {
        if (AbstractC19074t.m100204b(C29299a.f135738a.m146396a().m101506a(), Boolean.TRUE)) {
            return this.f148431j;
        }
        return this.f148432k;
    }

    public C32187y4(JSONObject jSONObject) {
        this();
        if (jSONObject != null) {
            try {
                this.f148427f = !jSONObject.isNull("layout") ? new b(jSONObject.getJSONObject("layout")) : null;
                this.f148424c = AbstractC19074t.m100204b(jSONObject.optString("subType", ""), "video") ? 1 : 0;
                this.f148425d = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                this.f148429h = (int) jSONObject.optLong("duration", 0L);
                this.f148423b = jSONObject.optLong("photoId", 0L);
                this.f148430i = jSONObject.optLong("albumId", 0L);
                this.f148428g = jSONObject.optInt("score", 0);
                String optString = jSONObject.optString("srcUrl");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f148431j = optString;
                String optString2 = jSONObject.optString("thumbUrl");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f148432k = optString2;
                String optString3 = jSONObject.optString("thumLocalPath");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                this.f148426e = optString3;
                String optString4 = jSONObject.optString("ownerId");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                this.f148433l = optString4;
                this.f148434m = jSONObject.optLong("createdTime", 0L);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }
}
