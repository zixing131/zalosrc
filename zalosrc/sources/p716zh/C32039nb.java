package p716zh;

import org.json.JSONObject;

/* renamed from: zh.nb */
/* loaded from: classes3.dex */
public class C32039nb {

    /* renamed from: a */
    long f147532a;

    /* renamed from: b */
    long f147533b;

    /* renamed from: c */
    int f147534c;

    public C32039nb(long j11, long j12, boolean z11) {
        this.f147532a = j11;
        this.f147533b = j12;
        this.f147534c = z11 ? 1 : 0;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", this.f147532a);
            jSONObject.put("endTime", this.f147533b);
            jSONObject.put("preSendMsg", this.f147534c);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }
}
