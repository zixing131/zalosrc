package p402os;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p369ns.AbstractC23933a;

/* renamed from: os.a */
/* loaded from: classes4.dex */
public class C24546a implements Serializable {

    /* renamed from: A */
    private String f118138A;

    /* renamed from: B */
    private String f118139B;

    /* renamed from: C */
    private String f118140C;

    /* renamed from: D */
    private boolean f118141D;

    /* renamed from: E */
    private final C24548c f118142E;

    /* renamed from: F */
    private b f118143F;

    /* renamed from: G */
    private List f118144G;

    /* renamed from: H */
    private String f118145H;

    /* renamed from: I */
    private a f118146I;

    /* renamed from: p */
    private long f118147p;

    /* renamed from: q */
    private String f118148q;

    /* renamed from: r */
    private String f118149r;

    /* renamed from: s */
    private String f118150s;

    /* renamed from: t */
    private String f118151t;

    /* renamed from: u */
    private int f118152u;

    /* renamed from: v */
    private final List f118153v;

    /* renamed from: w */
    private String f118154w;

    /* renamed from: x */
    private boolean f118155x;

    /* renamed from: y */
    private boolean f118156y;

    /* renamed from: z */
    private boolean f118157z;

    /* renamed from: os.a$a */
    /* loaded from: classes4.dex */
    public enum a {
        SHOW_DETAIL,
        OPEN_ACTION;

        /* renamed from: c */
        public static a m127892c(int i11) {
            return i11 != 1 ? SHOW_DETAIL : OPEN_ACTION;
        }
    }

    /* renamed from: os.a$b */
    /* loaded from: classes4.dex */
    public enum b {
        INTERNAL,
        WEB_GAME,
        APP_NORMAL,
        APP_GAME
    }

    public C24546a(long j11) {
        this.f118152u = 0;
        this.f118153v = new ArrayList();
        this.f118142E = new C24548c();
        this.f118143F = b.APP_GAME;
        this.f118147p = j11;
        this.f118144G = new ArrayList();
        m127870a();
    }

    /* renamed from: a */
    private void m127870a() {
    }

    /* renamed from: b */
    public long m127871b() {
        return this.f118147p;
    }

    /* renamed from: c */
    public String m127872c() {
        return this.f118140C;
    }

    /* renamed from: d */
    public String m127873d() {
        return this.f118150s;
    }

    /* renamed from: e */
    public String m127874e() {
        return this.f118151t;
    }

    /* renamed from: f */
    public String m127875f() {
        return this.f118148q;
    }

    /* renamed from: g */
    public String m127876g() {
        return this.f118154w;
    }

    /* renamed from: h */
    public List m127877h() {
        return this.f118144G;
    }

    /* renamed from: i */
    public String m127878i() {
        return this.f118145H;
    }

    /* renamed from: j */
    public C24548c m127879j() {
        return this.f118142E;
    }

    /* renamed from: k */
    public b m127880k() {
        return this.f118143F;
    }

    /* renamed from: l */
    public boolean m127881l() {
        return this.f118157z;
    }

    /* renamed from: m */
    public boolean m127882m() {
        if (this.f118143F != b.WEB_GAME && !AbstractC23933a.m125288c(this.f118154w)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public void m127883n(String str) {
        this.f118140C = str;
    }

    /* renamed from: o */
    public void m127884o(boolean z11) {
        this.f118157z = z11;
    }

    /* renamed from: p */
    public void m127885p(String str) {
        this.f118154w = str;
    }

    /* renamed from: q */
    public void m127886q(C24548c c24548c) {
        if (c24548c != null && this.f118142E.m127903d() <= c24548c.m127903d()) {
            this.f118142E.m127900a(c24548c);
        }
    }

    /* renamed from: r */
    public void m127887r(int i11) {
        if (i11 == 1) {
            m127888s(b.WEB_GAME);
        } else if (i11 == 2) {
            m127888s(b.APP_NORMAL);
        } else {
            m127888s(b.APP_GAME);
        }
    }

    /* renamed from: s */
    public void m127888s(b bVar) {
        this.f118143F = bVar;
    }

    /* renamed from: t */
    public void m127889t(JSONObject jSONObject) {
        this.f118144G = C24547b.m127895e(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("appInfo");
        if (optJSONObject != null) {
            m127890u(optJSONObject);
        }
    }

    /* renamed from: u */
    public void m127890u(JSONObject jSONObject) {
        this.f118147p = jSONObject.optLong("zappId", this.f118147p);
        this.f118148q = jSONObject.optString("appName", this.f118148q);
        this.f118149r = jSONObject.optString("desc", this.f118149r);
        this.f118151t = jSONObject.optString("logoLink", this.f118151t);
        this.f118150s = jSONObject.optString("company", this.f118150s);
        this.f118152u = jSONObject.optInt("playing", this.f118152u);
        this.f118154w = jSONObject.optString("packageName", this.f118154w);
        this.f118155x = jSONObject.optBoolean("highScore", this.f118155x);
        this.f118156y = jSONObject.optBoolean("showLeaderBoard", this.f118156y);
        this.f118157z = jSONObject.optBoolean("isBlocked", this.f118157z);
        this.f118138A = jSONObject.optString("newsFeature", this.f118138A);
        boolean z11 = true;
        if (jSONObject.optInt("isNew", 0) != 1) {
            z11 = false;
        }
        this.f118141D = z11;
        JSONArray optJSONArray = jSONObject.optJSONArray("screenShot");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.f118139B = optJSONArray.toString();
            this.f118153v.clear();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                String optString = optJSONArray.optString(i11);
                if (!TextUtils.isEmpty(optString)) {
                    this.f118153v.add(optString);
                }
            }
        }
        this.f118145H = jSONObject.optString("playStoreUrl");
        this.f118140C = jSONObject.optString("app_referrer");
        if (jSONObject.has("bodyAction")) {
            this.f118146I = a.m127892c(jSONObject.optInt("bodyAction"));
        }
        m127887r(jSONObject.optInt("appType"));
        m127870a();
    }

    public C24546a(JSONObject jSONObject) {
        this.f118152u = 0;
        ArrayList arrayList = new ArrayList();
        this.f118153v = arrayList;
        this.f118142E = new C24548c();
        this.f118143F = b.APP_GAME;
        this.f118147p = jSONObject.getLong("zappId");
        this.f118148q = jSONObject.getString("appName");
        this.f118149r = jSONObject.optString("desc");
        this.f118151t = jSONObject.getString("logoLink");
        this.f118150s = jSONObject.getString("company");
        this.f118152u = jSONObject.optInt("playing");
        this.f118154w = jSONObject.optString("packageName");
        this.f118155x = jSONObject.optBoolean("highScore");
        this.f118156y = jSONObject.optBoolean("showLeaderBoard");
        this.f118157z = jSONObject.optBoolean("isBlocked");
        this.f118138A = jSONObject.optString("newsFeature");
        this.f118141D = jSONObject.optInt("isNew", 0) == 1;
        JSONArray optJSONArray = jSONObject.optJSONArray("screenShot");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.f118139B = optJSONArray.toString();
            arrayList.clear();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                String string = optJSONArray.getString(i11);
                if (!TextUtils.isEmpty(string)) {
                    this.f118153v.add(string);
                }
            }
        }
        this.f118144G = C24547b.m127895e(jSONObject);
        this.f118145H = jSONObject.optString("playStoreUrl");
        this.f118140C = jSONObject.optString("app_referrer");
        if (jSONObject.has("bodyAction")) {
            this.f118146I = a.m127892c(jSONObject.optInt("bodyAction"));
        }
        m127887r(jSONObject.optInt("appType"));
        m127870a();
    }
}
