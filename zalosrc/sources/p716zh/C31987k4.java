package p716zh;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: zh.k4 */
/* loaded from: classes3.dex */
public class C31987k4 {

    /* renamed from: a */
    private int f147196a;

    /* renamed from: b */
    int f147197b;

    /* renamed from: c */
    private HashMap f147198c;

    /* renamed from: d */
    private boolean f147199d;

    public C31987k4(int i11) {
        this.f147198c = new HashMap();
        this.f147196a = i11;
        this.f147197b = 0;
    }

    /* renamed from: d */
    public static C31987k4 m154201d(JSONObject jSONObject) {
        C31987k4 c31987k4 = new C31987k4(0);
        if (jSONObject != null) {
            try {
                c31987k4.m154215o(jSONObject.optInt("source", 0));
                c31987k4.m154212l(jSONObject.optInt("action", 0));
                if (jSONObject.has("params") && !TextUtils.isEmpty(jSONObject.getString("params"))) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("params"));
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        c31987k4.m154202a(next, jSONObject2.get(next));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return c31987k4;
    }

    /* renamed from: a */
    public void m154202a(String str, Object obj) {
        HashMap hashMap = this.f147198c;
        if (hashMap != null) {
            hashMap.put(str, obj);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C31987k4 clone() {
        C31987k4 c31987k4 = new C31987k4(this.f147196a, this.f147197b);
        HashMap hashMap = this.f147198c;
        if (hashMap != null && hashMap.size() > 0) {
            c31987k4.m154213m((HashMap) m154206f().clone());
        }
        return c31987k4;
    }

    /* renamed from: c */
    public HashMap m154204c() {
        return (HashMap) this.f147198c.clone();
    }

    /* renamed from: e */
    public int m154205e() {
        return this.f147197b;
    }

    /* renamed from: f */
    public HashMap m154206f() {
        return this.f147198c;
    }

    /* renamed from: g */
    public int m154207g() {
        return this.f147196a;
    }

    /* renamed from: h */
    public String m154208h() {
        try {
            HashMap hashMap = this.f147198c;
            if (hashMap != null && hashMap.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : this.f147198c.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && entry.getValue() != null) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                return jSONObject.toString();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public boolean m154209i(C31987k4 c31987k4) {
        int i11 = this.f147196a;
        int i12 = c31987k4.f147196a;
        if ((i11 == i12 && this.f147197b == 0) || (i11 == i12 && this.f147197b == c31987k4.f147197b)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m154210j() {
        return this.f147199d;
    }

    /* renamed from: k */
    public String m154211k() {
        return this.f147196a + " [" + this.f147197b + " @" + m154208h() + "]";
    }

    /* renamed from: l */
    public void m154212l(int i11) {
        this.f147197b = i11;
    }

    /* renamed from: m */
    public void m154213m(HashMap hashMap) {
        if (hashMap != null) {
            this.f147198c = hashMap;
        }
    }

    /* renamed from: n */
    public C31987k4 m154214n(boolean z11) {
        this.f147199d = z11;
        return this;
    }

    /* renamed from: o */
    public void m154215o(int i11) {
        this.f147196a = i11;
    }

    /* renamed from: p */
    public JSONObject m154216p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", this.f147196a);
            jSONObject.put("action", this.f147197b);
            jSONObject.put("params", m154208h());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    public C31987k4(int i11, int i12) {
        this.f147198c = new HashMap();
        this.f147196a = i11;
        this.f147197b = i12;
    }
}
