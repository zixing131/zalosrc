package y30;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: y30.a */
/* loaded from: classes5.dex */
public class C30283a implements Serializable {

    /* renamed from: p */
    private long f140657p;

    /* renamed from: q */
    private String f140658q;

    /* renamed from: r */
    private String f140659r;

    /* renamed from: s */
    private boolean f140660s;

    /* renamed from: t */
    private boolean f140661t;

    /* renamed from: u */
    private final List f140662u = new ArrayList();

    /* renamed from: v */
    private String f140663v;

    /* renamed from: y30.a$a */
    /* loaded from: classes5.dex */
    public static class a extends b {

        /* renamed from: t */
        private String f140664t;

        /* renamed from: u */
        private String f140665u;

        a(JSONObject jSONObject) {
            super(jSONObject);
            if (jSONObject.has("extra_info_oa")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra_info_oa");
                this.f140664t = jSONObject2.getString("avt");
                this.f140665u = jSONObject2.getString("name");
            }
        }

        /* renamed from: f */
        public String m149426f() {
            return this.f140664t;
        }

        /* renamed from: g */
        public String m149427g() {
            return this.f140665u;
        }
    }

    /* renamed from: y30.a$b */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {

        /* renamed from: p */
        private boolean f140666p;

        /* renamed from: q */
        private boolean f140667q;

        /* renamed from: r */
        private String f140668r;

        /* renamed from: s */
        private String f140669s;

        b(JSONObject jSONObject) {
            this.f140666p = false;
            this.f140667q = false;
            this.f140666p = jSONObject.getBoolean("perDefOn");
            this.f140667q = jSONObject.getBoolean("perReq");
            this.f140668r = jSONObject.getString("perId");
            this.f140669s = jSONObject.getString("perTitle");
        }

        /* renamed from: a */
        public String m149428a() {
            return this.f140668r;
        }

        /* renamed from: b */
        public String m149429b() {
            return this.f140669s;
        }

        /* renamed from: c */
        public boolean m149430c() {
            return this.f140667q;
        }

        /* renamed from: d */
        public boolean m149431d() {
            return this.f140666p;
        }

        /* renamed from: e */
        public void m149432e(boolean z11) {
            this.f140666p = z11;
        }
    }

    public C30283a(long j11, JSONObject jSONObject) {
        Object bVar;
        this.f140660s = false;
        this.f140661t = false;
        this.f140657p = j11;
        this.f140658q = jSONObject.optString("perText");
        this.f140659r = jSONObject.optString("appLogo");
        this.f140661t = jSONObject.optBoolean("userConsent", true);
        this.f140660s = jSONObject.optBoolean("forceSetPwd");
        this.f140663v = jSONObject.optString("sid");
        JSONArray optJSONArray = jSONObject.optJSONArray("pers");
        if (optJSONArray != null) {
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray.get(i11);
                if (jSONObject2.has("extra_info_oa")) {
                    bVar = new a(jSONObject2);
                } else {
                    bVar = new b(jSONObject2);
                }
                this.f140662u.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public String m149419a() {
        return this.f140659r;
    }

    /* renamed from: b */
    public List m149420b() {
        return this.f140662u;
    }

    /* renamed from: c */
    public String m149421c() {
        return this.f140663v;
    }

    /* renamed from: d */
    public String m149422d() {
        return this.f140658q;
    }

    /* renamed from: e */
    public boolean m149423e() {
        return this.f140662u.isEmpty();
    }

    /* renamed from: f */
    public boolean m149424f() {
        return this.f140660s;
    }

    /* renamed from: g */
    public boolean m149425g() {
        return this.f140661t;
    }
}
