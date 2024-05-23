package ro0;

import org.json.JSONObject;

/* renamed from: ro0.k */
/* loaded from: classes7.dex */
public class C25947k {

    /* renamed from: a */
    public boolean f123728a;

    /* renamed from: b */
    public boolean f123729b;

    /* renamed from: c */
    public int f123730c;

    /* renamed from: d */
    public int f123731d;

    /* renamed from: e */
    public int f123732e;

    /* renamed from: f */
    public int f123733f;

    /* renamed from: g */
    public int f123734g;

    /* renamed from: h */
    public String f123735h;

    public C25947k(JSONObject jSONObject) {
        this.f123730c = 10;
        this.f123731d = 10;
        this.f123732e = 10;
        this.f123733f = 4096;
        this.f123734g = 60;
        this.f123735h = "/api/qos/uploadcalllog";
        try {
            this.f123728a = jSONObject.optBoolean("sazPlayoutOn");
            this.f123729b = jSONObject.optBoolean("sazRecordOn");
            this.f123730c = jSONObject.optInt("sazPlayoutMax", 10);
            this.f123731d = jSONObject.optInt("sazRecordMax", 10);
            this.f123732e = jSONObject.optInt("sazSliceDur", 10);
            this.f123733f = jSONObject.optInt("sazImgWidthMax", 4096);
            this.f123734g = jSONObject.optInt("sazSpecMul", 60);
            this.f123735h = jSONObject.optString("sazUploadApi", "/api/qos/uploadcalllog");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
