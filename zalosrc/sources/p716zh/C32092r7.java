package p716zh;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: zh.r7 */
/* loaded from: classes3.dex */
public class C32092r7 {

    /* renamed from: a */
    private String f147880a;

    /* renamed from: b */
    private int f147881b;

    /* renamed from: c */
    private String f147882c;

    /* renamed from: d */
    private ArrayList f147883d;

    public C32092r7() {
        this.f147883d = new ArrayList();
        this.f147880a = "";
        this.f147881b = -1;
    }

    /* renamed from: a */
    public String m154841a() {
        if (!TextUtils.isEmpty(this.f147882c)) {
            return this.f147882c;
        }
        return "";
    }

    /* renamed from: b */
    public int m154842b() {
        return this.f147881b;
    }

    /* renamed from: c */
    public ArrayList m154843c() {
        return this.f147883d;
    }

    /* renamed from: d */
    public String m154844d() {
        return this.f147880a;
    }

    /* renamed from: e */
    public void m154845e(String str) {
        this.f147882c = str;
    }

    /* renamed from: f */
    public void m154846f(ArrayList arrayList) {
        this.f147883d = arrayList;
    }

    /* renamed from: g */
    public void m154847g(String str) {
        this.f147880a = str;
    }

    public C32092r7(String str, int i11) {
        this.f147883d = new ArrayList();
        this.f147880a = str;
        this.f147881b = i11;
    }

    public C32092r7(JSONObject jSONObject) {
        this.f147883d = new ArrayList();
        try {
            this.f147880a = !jSONObject.isNull("obj") ? jSONObject.getString("obj") : "";
            int i11 = !jSONObject.isNull("actId") ? jSONObject.getInt("actId") : -1;
            this.f147881b = i11;
            this.f147882c = AbstractC20833z.m108907l(i11, jSONObject);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
