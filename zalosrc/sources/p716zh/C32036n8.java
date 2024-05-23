package p716zh;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import vg.AbstractCallableC28112k5;

/* renamed from: zh.n8 */
/* loaded from: classes3.dex */
public class C32036n8 {

    /* renamed from: a */
    private final Map f147508a;

    /* renamed from: b */
    private long f147509b;

    /* renamed from: c */
    AbstractCallableC28112k5 f147510c;

    /* renamed from: zh.n8$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 30) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: zh.n8$b */
    /* loaded from: classes3.dex */
    class b extends AbstractCallableC28112k5 {
        b() {
        }

        @Override // vg.AbstractCallableC28112k5, java.util.concurrent.Callable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C32036n8.this.m154523j();
            return (Void) super.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zh.n8$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        static C32036n8 f147513a = new C32036n8();
    }

    /* renamed from: b */
    private void m154514b(String str, String str2) {
        m154516h();
        if (this.f147508a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f147508a.put(str, str2);
            AbstractC23309i.m121142Kz(m154521f(this.f147508a).toString());
        }
    }

    /* renamed from: e */
    public static C32036n8 m154515e() {
        return c.f147513a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m154516h() {
        try {
            this.f147510c.m141598a();
        } catch (Exception e11) {
            e11.printStackTrace();
            m154523j();
        }
    }

    /* renamed from: i */
    private boolean m154517i() {
        m154516h();
        if (this.f147509b != 0 && System.currentTimeMillis() - this.f147509b <= 1209600000) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m154518k() {
        try {
            String m121714ae = AbstractC23309i.m121714ae();
            if (TextUtils.isEmpty(m121714ae)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(m121714ae);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject != null) {
                    d dVar = new d(jSONObject);
                    if (this.f147508a != null && !TextUtils.isEmpty(dVar.f147514a) && !TextUtils.isEmpty(dVar.f147515b)) {
                        this.f147508a.put(dVar.f147514a, dVar.f147515b);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c */
    public boolean m154519c() {
        m154516h();
        if (m154517i()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f147509b = currentTimeMillis;
            AbstractC23309i.m121503Uq(currentTimeMillis);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m154520d(String str, String str2) {
        m154516h();
        if (this.f147508a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals((String) this.f147508a.get(str), str2)) {
            return false;
        }
        m154514b(str, str2);
        return true;
    }

    /* renamed from: f */
    public JSONArray m154521f(Map map) {
        JSONArray jSONArray = new JSONArray();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    jSONArray.put(new d(str, str2).m154526a());
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: g */
    public void m154522g() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.m8
            @Override // java.lang.Runnable
            public final void run() {
                C32036n8.this.m154516h();
            }
        });
    }

    /* renamed from: j */
    public void m154523j() {
        this.f147509b = AbstractC23309i.m122531w6();
        m154518k();
    }

    /* renamed from: l */
    public void m154524l() {
        this.f147509b = 0L;
        AbstractC23309i.m121503Uq(0L);
        Map map = this.f147508a;
        if (map != null) {
            map.clear();
        }
    }

    /* renamed from: zh.n8$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        public String f147514a;

        /* renamed from: b */
        public String f147515b;

        d(String str, String str2) {
            this.f147514a = "";
            this.f147515b = "";
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f147514a = str;
            this.f147515b = str2;
        }

        /* renamed from: a */
        public JSONObject m154526a() {
            String str;
            JSONObject jSONObject = new JSONObject();
            try {
                String str2 = "";
                if (TextUtils.isEmpty(this.f147514a)) {
                    str = "";
                } else {
                    str = this.f147514a;
                }
                jSONObject.put("userId", str);
                if (!TextUtils.isEmpty(this.f147515b)) {
                    str2 = this.f147515b;
                }
                jSONObject.put("songId", str2);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        d(JSONObject jSONObject) {
            this.f147514a = "";
            this.f147515b = "";
            if (jSONObject != null) {
                try {
                    this.f147514a = jSONObject.getString("userId");
                    this.f147515b = jSONObject.getString("songId");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    private C32036n8() {
        this.f147509b = 0L;
        this.f147508a = Collections.synchronizedMap(new a());
        this.f147510c = new b();
    }
}
