package dj;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.c1 */
/* loaded from: classes3.dex */
public class C17952c1 extends C17969i0 {

    /* renamed from: B */
    public String f90868B;

    /* renamed from: C */
    public String f90869C;

    /* renamed from: D */
    public String f90870D;

    /* renamed from: E */
    public String f90871E;

    /* renamed from: F */
    public String f90872F;

    /* renamed from: G */
    public String f90873G;

    /* renamed from: H */
    public String f90874H;

    /* renamed from: I */
    public String f90875I;

    /* renamed from: J */
    public boolean f90876J;

    /* renamed from: K */
    public int f90877K;

    /* renamed from: L */
    public int f90878L;

    /* renamed from: M */
    public int f90879M;

    /* renamed from: N */
    public int f90880N;

    /* renamed from: O */
    public long f90881O;

    /* renamed from: P */
    public int f90882P;

    /* renamed from: Q */
    public int f90883Q;

    public C17952c1() {
        this.f90882P = -1;
        this.f90883Q = 0;
    }

    /* renamed from: g */
    public static C17952c1 m95408g(JSONObject jSONObject) {
        C17952c1 c17952c1 = new C17952c1();
        c17952c1.m95411j(jSONObject);
        c17952c1.m95412k();
        return c17952c1;
    }

    /* renamed from: h */
    private String m95409h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", this.f90868B);
            jSONObject.put("avt", this.f90869C);
            jSONObject.put("cover", this.f90870D);
            jSONObject.put("dpn", this.f90871E);
            jSONObject.put("uname", this.f90872F);
            jSONObject.put("desc", this.f90873G);
            jSONObject.put("phone", this.f90874H);
            jSONObject.put("showPhotos", this.f90876J);
            jSONObject.put("notify", this.f90877K);
            jSONObject.put("showQuickReply", this.f90878L);
            jSONObject.put("showMessageEmpty", this.f90879M);
            jSONObject.put("topOutStranger", this.f90880N);
            jSONObject.put("ttl", this.f90881O);
            jSONObject.put("suggestStickerKeyword", this.f90875I);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startPos", this.f90882P);
            jSONObject2.put("len", this.f90883Q);
            jSONObject.put("nameInfo", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    private void m95410i() {
        if (!TextUtils.isEmpty(this.f91017v)) {
            try {
                m95411j(new JSONObject(this.f91017v));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: j */
    private void m95411j(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            this.f90868B = AbstractC18069a.m96089h(jSONObject, "uid");
            this.f90869C = AbstractC18069a.m96089h(jSONObject, "avt");
            this.f90870D = AbstractC18069a.m96089h(jSONObject, "cover");
            this.f90871E = AbstractC18069a.m96089h(jSONObject, "dpn");
            this.f90872F = AbstractC18069a.m96089h(jSONObject, "uname");
            this.f90873G = AbstractC18069a.m96089h(jSONObject, "desc");
            this.f90874H = AbstractC18069a.m96089h(jSONObject, "phone");
            this.f90876J = AbstractC18069a.m96083b(jSONObject, "showPhotos");
            this.f90877K = AbstractC18069a.m96085d(jSONObject, "notify");
            this.f90878L = AbstractC18069a.m96085d(jSONObject, "showQuickReply");
            this.f90879M = AbstractC18069a.m96085d(jSONObject, "showMessageEmpty");
            this.f90880N = AbstractC18069a.m96085d(jSONObject, "topOutStranger");
            this.f90881O = AbstractC18069a.m96087f(jSONObject, "ttl");
            this.f90875I = AbstractC18069a.m96089h(jSONObject, "suggestStickerKeyword");
            if (!TextUtils.isEmpty(this.f90874H) && (optJSONObject = jSONObject.optJSONObject("nameInfo")) != null) {
                this.f90882P = optJSONObject.optInt("startPos", -1);
                this.f90883Q = optJSONObject.optInt("len");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public void m95412k() {
        this.f91017v = m95409h();
    }

    public C17952c1(JSONObject jSONObject) {
        super(jSONObject);
        this.f90882P = -1;
        this.f90883Q = 0;
        m95410i();
    }

    public C17952c1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        this.f90882P = -1;
        this.f90883Q = 0;
        m95410i();
    }
}
