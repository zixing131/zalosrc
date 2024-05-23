package p716zh;

import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: zh.d9 */
/* loaded from: classes3.dex */
public class C31887d9 {

    /* renamed from: a */
    private String f146463a;

    /* renamed from: b */
    private String f146464b;

    /* renamed from: c */
    private String f146465c;

    /* renamed from: d */
    private String f146466d;

    /* renamed from: e */
    private String f146467e;

    /* renamed from: f */
    private String f146468f;

    /* renamed from: g */
    private int f146469g;

    /* renamed from: h */
    private String f146470h;

    /* renamed from: i */
    private int f146471i;

    /* renamed from: j */
    private String f146472j;

    /* renamed from: k */
    private boolean f146473k;

    /* renamed from: l */
    private int f146474l;

    /* renamed from: m */
    private String f146475m;

    public C31887d9() {
        this.f146474l = 0;
        this.f146475m = "";
    }

    /* renamed from: a */
    public String m153211a() {
        return this.f146472j;
    }

    /* renamed from: b */
    public int m153212b() {
        int i11 = this.f146469g;
        if (i11 == 0) {
            return 17;
        }
        if (i11 == 1) {
            return 14;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 16;
        }
        return 15;
    }

    /* renamed from: c */
    public String m153213c() {
        return this.f146463a;
    }

    /* renamed from: d */
    public int m153214d() {
        return this.f146469g;
    }

    /* renamed from: e */
    public String m153215e() {
        return this.f146465c;
    }

    /* renamed from: f */
    public String m153216f() {
        return this.f146470h;
    }

    /* renamed from: g */
    public String m153217g() {
        return this.f146467e;
    }

    /* renamed from: h */
    public String m153218h() {
        return this.f146468f;
    }

    /* renamed from: i */
    public String m153219i() {
        return this.f146475m;
    }

    /* renamed from: j */
    public boolean m153220j() {
        return this.f146473k;
    }

    /* renamed from: k */
    public int m153221k() {
        return this.f146474l;
    }

    /* renamed from: l */
    public String m153222l() {
        return this.f146466d;
    }

    /* renamed from: m */
    public String m153223m() {
        return this.f146464b;
    }

    /* renamed from: n */
    public void m153224n(String str) {
        this.f146475m = str;
    }

    /* renamed from: o */
    public void m153225o(String str) {
        this.f146466d = str;
    }

    public C31887d9(JSONObject jSONObject) {
        this.f146474l = 0;
        this.f146475m = "";
        try {
            if (jSONObject.has("command")) {
                this.f146463a = jSONObject.getString("command");
            }
            if (jSONObject.has("thumb")) {
                this.f146464b = jSONObject.getString("thumb");
            }
            if (jSONObject.has("description")) {
                this.f146465c = jSONObject.getString("description");
            }
            if (jSONObject.has("suggestion")) {
                this.f146466d = jSONObject.getString("suggestion");
            }
            if (jSONObject.has("hint")) {
                this.f146467e = jSONObject.getString("hint");
            }
            if (jSONObject.has("completionType")) {
                this.f146469g = jSONObject.getInt("completionType");
            }
            if (jSONObject.has("notfound")) {
                this.f146468f = jSONObject.getString("notfound");
            }
            if (jSONObject.has("empty_keyword")) {
                this.f146470h = jSONObject.getString("empty_keyword");
            }
            if (jSONObject.has("promote_search")) {
                this.f146471i = jSONObject.getInt("promote_search");
            }
            if (jSONObject.has("bigIconUrl")) {
                this.f146472j = jSONObject.getString("bigIconUrl");
            }
            if (jSONObject.has("showOnMore")) {
                this.f146473k = jSONObject.getInt("showOnMore") == 1;
            }
            if (jSONObject.has("showType")) {
                this.f146474l = jSONObject.optInt("showType");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
