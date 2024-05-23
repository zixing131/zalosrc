package p348mi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mi.g */
/* loaded from: classes3.dex */
public final class C23307g {

    /* renamed from: a */
    public int f113474a;

    /* renamed from: b */
    public int f113475b;

    /* renamed from: c */
    public float f113476c;

    /* renamed from: d */
    public float f113477d;

    /* renamed from: e */
    public long f113478e;

    /* renamed from: f */
    public String f113479f;

    /* renamed from: g */
    public long f113480g;

    /* renamed from: h */
    public boolean f113481h;

    public C23307g(int i11, int i12) {
        this.f113474a = i11;
        this.f113475b = i12;
        this.f113476c = 0.0f;
        this.f113477d = 0.0f;
        this.f113478e = 0L;
        this.f113479f = "";
        this.f113480g = 0L;
        this.f113481h = false;
    }

    /* renamed from: a */
    public JSONObject m120735a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", this.f113474a);
            jSONObject.put("height", this.f113475b);
            jSONObject.put("latitude", this.f113476c);
            jSONObject.put("longitude", this.f113477d);
            jSONObject.put("created_time", this.f113478e);
            jSONObject.put("file_name", this.f113479f);
            jSONObject.put("file_size", this.f113480g);
            jSONObject.put("has_device_info", this.f113481h);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C23307g(int i11, int i12, float f11, float f12, long j11, String str, long j12, boolean z11) {
        this.f113474a = i11;
        this.f113475b = i12;
        this.f113476c = f11;
        this.f113477d = f12;
        this.f113478e = j11;
        this.f113479f = str;
        this.f113480g = j12;
        this.f113481h = z11;
    }

    public C23307g(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f113474a = jSONObject.getInt("width");
                this.f113475b = jSONObject.getInt("height");
                this.f113476c = (float) jSONObject.optDouble("latitude");
                this.f113477d = (float) jSONObject.optDouble("longitude");
                if (Float.isNaN(this.f113476c)) {
                    this.f113476c = 0.0f;
                }
                if (Float.isNaN(this.f113477d)) {
                    this.f113477d = 0.0f;
                }
                this.f113478e = jSONObject.optLong("created_time");
                this.f113479f = jSONObject.optString("file_name");
                this.f113480g = jSONObject.optLong("file_size");
                this.f113481h = jSONObject.optBoolean("has_device_info");
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }
}
