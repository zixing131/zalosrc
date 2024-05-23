package p716zh;

import org.json.JSONObject;

/* renamed from: zh.q8 */
/* loaded from: classes3.dex */
public class C32079q8 {

    /* renamed from: a */
    public int f147782a;

    /* renamed from: b */
    public int f147783b;

    /* renamed from: c */
    public String f147784c;

    /* renamed from: d */
    public String f147785d;

    public C32079q8(String str) {
        this.f147782a = 0;
        this.f147783b = -1;
        this.f147784c = "";
        this.f147785d = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("config");
            this.f147782a = optInt;
            if (optInt != 0 && optInt != 1 && optInt != 2) {
                this.f147782a = 0;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("reaction_type");
            if (optJSONObject != null) {
                this.f147783b = optJSONObject.optInt("rType", -1);
                this.f147784c = optJSONObject.optString("rIcon");
            }
            this.f147785d = jSONObject.optString("emoji");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
