package p716zh;

import org.json.JSONObject;

/* renamed from: zh.s0 */
/* loaded from: classes.dex */
public class C32099s0 {

    /* renamed from: a */
    public boolean f147980a;

    /* renamed from: b */
    public boolean f147981b;

    /* renamed from: c */
    public boolean f147982c;

    /* renamed from: d */
    public boolean f147983d;

    public C32099s0() {
        this.f147981b = true;
        this.f147980a = true;
        this.f147982c = true;
        this.f147983d = true;
    }

    public C32099s0(JSONObject jSONObject) {
        boolean z11 = true;
        this.f147980a = true;
        this.f147981b = true;
        this.f147982c = true;
        this.f147983d = true;
        if (jSONObject != null) {
            try {
                this.f147980a = jSONObject.optInt("social") == 1;
                this.f147981b = jSONObject.optInt("chat") == 1;
                this.f147982c = jSONObject.optInt("message") == 1;
                if (jSONObject.optInt("mediastore", 1) != 1) {
                    z11 = false;
                }
                this.f147983d = z11;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
