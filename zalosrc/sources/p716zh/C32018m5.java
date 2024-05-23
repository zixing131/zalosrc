package p716zh;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zh.m5 */
/* loaded from: classes3.dex */
public class C32018m5 {

    /* renamed from: a */
    public int f147387a;

    /* renamed from: b */
    public String f147388b;

    /* renamed from: c */
    public String f147389c;

    /* renamed from: d */
    public String f147390d;

    /* renamed from: e */
    public ArrayList f147391e;

    /* renamed from: f */
    public String f147392f;

    /* renamed from: g */
    public long f147393g;

    /* renamed from: h */
    public String f147394h;

    /* renamed from: i */
    public int f147395i;

    /* renamed from: j */
    public boolean f147396j;

    /* renamed from: k */
    public int f147397k;

    /* renamed from: l */
    public String f147398l;

    public C32018m5(int i11) {
        this.f147387a = i11;
    }

    public C32018m5(int i11, JSONObject jSONObject) {
        try {
            this.f147387a = 0;
            this.f147397k = i11;
            this.f147388b = jSONObject.optString("title");
            this.f147389c = jSONObject.optString("icon");
            this.f147390d = jSONObject.optString("emoji");
            JSONArray optJSONArray = jSONObject.optJSONArray("answers");
            if (optJSONArray != null) {
                this.f147391e = new ArrayList();
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    this.f147391e.add((String) optJSONArray.get(i12));
                }
            }
            this.f147392f = jSONObject.optString("text");
            this.f147393g = jSONObject.optLong("startTime");
            this.f147394h = jSONObject.optString("link");
            this.f147395i = jSONObject.optInt("color");
            this.f147396j = jSONObject.optInt("openTimePicker") == 1;
            this.f147398l = jSONObject.optString("kwd");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
