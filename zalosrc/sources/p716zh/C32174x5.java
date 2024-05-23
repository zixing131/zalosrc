package p716zh;

import org.json.JSONObject;

/* renamed from: zh.x5 */
/* loaded from: classes3.dex */
public class C32174x5 {

    /* renamed from: a */
    public String f148356a;

    /* renamed from: b */
    public String f148357b;

    /* renamed from: c */
    public String f148358c;

    /* renamed from: d */
    public int f148359d;

    /* renamed from: e */
    public String f148360e;

    /* renamed from: f */
    public long f148361f;

    /* renamed from: g */
    public String f148362g;

    /* renamed from: h */
    public String f148363h;

    /* renamed from: i */
    public int f148364i;

    /* renamed from: j */
    public int f148365j = 0;

    /* renamed from: k */
    public String f148366k = "";

    public C32174x5(JSONObject jSONObject) {
        this.f148356a = jSONObject.optString("uid");
        this.f148357b = jSONObject.optString("dpn");
        this.f148358c = jSONObject.optString("avt");
        this.f148359d = jSONObject.optInt("discoverItemType");
        this.f148360e = jSONObject.optString("msg");
        this.f148361f = jSONObject.optLong("time");
        this.f148362g = jSONObject.optString("inviteUid");
        this.f148364i = jSONObject.optInt("reqSrc");
        this.f148363h = jSONObject.optString("inviteDpn");
    }
}
