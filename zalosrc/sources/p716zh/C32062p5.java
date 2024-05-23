package p716zh;

import org.json.JSONObject;

/* renamed from: zh.p5 */
/* loaded from: classes3.dex */
public class C32062p5 {

    /* renamed from: a */
    public String f147626a;

    /* renamed from: b */
    public String f147627b;

    /* renamed from: c */
    public String f147628c;

    /* renamed from: d */
    public int f147629d;

    /* renamed from: e */
    public String f147630e;

    /* renamed from: f */
    public int f147631f;

    public C32062p5(JSONObject jSONObject) {
        try {
            this.f147626a = jSONObject.optString("session");
            this.f147627b = jSONObject.optString("streamId");
            this.f147629d = jSONObject.optInt("maxDuration");
            this.f147630e = jSONObject.optString("server");
            this.f147628c = jSONObject.optString("config");
            this.f147631f = jSONObject.optInt("showDebugInfo");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
