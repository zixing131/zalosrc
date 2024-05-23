package p716zh;

import org.json.JSONObject;
import p133ek.AbstractC18458a;

/* renamed from: zh.l7 */
/* loaded from: classes3.dex */
public class C32005l7 {

    /* renamed from: a */
    public String f147270a;

    /* renamed from: b */
    public String f147271b;

    /* renamed from: c */
    public String f147272c;

    /* renamed from: d */
    public int f147273d;

    public C32005l7(String str, String str2, String str3, int i11) {
        this.f147270a = str;
        this.f147271b = str2;
        this.f147273d = i11;
        this.f147272c = str3;
    }

    /* renamed from: a */
    public JSONObject m154299a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("actionType", this.f147270a);
            jSONObject.put("actionData", this.f147271b);
            jSONObject.put("actionColor", this.f147273d);
            jSONObject.put("actionLabel", this.f147272c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C32005l7(JSONObject jSONObject) {
        this.f147273d = jSONObject.optInt("actionColor");
        this.f147270a = jSONObject.optString("actionType");
        this.f147271b = jSONObject.optString("actionData");
        this.f147272c = jSONObject.optString("actionLabel");
        JSONObject optJSONObject = jSONObject.optJSONObject("actionLabelv2");
        if (optJSONObject != null) {
            if (AbstractC18458a.f93019a.equals("vi")) {
                this.f147272c = optJSONObject.optString("vi");
            } else if (AbstractC18458a.f93019a.equals("en")) {
                this.f147272c = optJSONObject.optString("en");
            } else if (AbstractC18458a.f93019a.equals("my")) {
                this.f147272c = optJSONObject.optString("my");
            }
        }
    }
}
