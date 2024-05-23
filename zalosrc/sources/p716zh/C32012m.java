package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.Serializable;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: zh.m */
/* loaded from: classes3.dex */
public class C32012m implements Serializable {

    /* renamed from: p */
    public int f147322p;

    /* renamed from: q */
    public long f147323q;

    /* renamed from: r */
    public String f147324r;

    /* renamed from: s */
    public String f147325s;

    /* renamed from: t */
    public int f147326t;

    /* renamed from: u */
    public int f147327u;

    /* renamed from: v */
    public int f147328v;

    public C32012m(String str) {
        this.f147322p = 0;
        this.f147323q = 0L;
        this.f147324r = "";
        this.f147325s = "";
        this.f147326t = 0;
        this.f147327u = -1;
        this.f147328v = -1;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            this.f147322p = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f147322p);
            this.f147323q = jSONObject.optLong("appId", this.f147323q);
            this.f147326t = jSONObject.optInt("clickType", this.f147326t);
            this.f147324r = jSONObject.optString("title", this.f147324r);
            this.f147325s = jSONObject.optString("params", this.f147325s);
            if (jSONObject.has("firebase")) {
                this.f147328v = jSONObject.optInt("firebase");
            }
            if (jSONObject.has("cloud")) {
                this.f147327u = jSONObject.optInt("cloud");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatContentFooter", e11);
        }
    }
}
