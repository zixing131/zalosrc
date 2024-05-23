package p716zh;

import android.text.TextUtils;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import th.AbstractC26683d;
import vg.AbstractC28207v1;

/* renamed from: zh.c */
/* loaded from: classes3.dex */
public class C31862c {

    /* renamed from: A */
    public String f146299A;

    /* renamed from: B */
    public String f146300B;

    /* renamed from: C */
    public boolean f146301C;

    /* renamed from: D */
    public boolean f146302D;

    /* renamed from: E */
    public boolean f146303E;

    /* renamed from: F */
    public String f146304F;

    /* renamed from: G */
    public C17244x0 f146305G;

    /* renamed from: H */
    public List f146306H;

    /* renamed from: I */
    private String f146307I;

    /* renamed from: a */
    public int f146308a;

    /* renamed from: b */
    public int f146309b;

    /* renamed from: c */
    public String f146310c;

    /* renamed from: d */
    public String f146311d;

    /* renamed from: e */
    public String f146312e;

    /* renamed from: f */
    public String f146313f;

    /* renamed from: g */
    public String f146314g;

    /* renamed from: h */
    public boolean f146315h;

    /* renamed from: i */
    public boolean f146316i;

    /* renamed from: j */
    public String f146317j;

    /* renamed from: k */
    public String f146318k;

    /* renamed from: l */
    public boolean f146319l;

    /* renamed from: m */
    public String f146320m;

    /* renamed from: n */
    public String f146321n;

    /* renamed from: o */
    public String f146322o;

    /* renamed from: p */
    public String f146323p;

    /* renamed from: q */
    public String f146324q;

    /* renamed from: r */
    public String f146325r;

    /* renamed from: s */
    public String f146326s;

    /* renamed from: t */
    public String f146327t;

    /* renamed from: u */
    public String f146328u;

    /* renamed from: v */
    public String f146329v;

    /* renamed from: x */
    public int f146331x;

    /* renamed from: z */
    public C31847b f146333z;

    /* renamed from: w */
    public List f146330w = new ArrayList();

    /* renamed from: y */
    public boolean f146332y = false;

    /* renamed from: zh.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f146334a;

        /* renamed from: b */
        public String f146335b;

        /* renamed from: c */
        public int f146336c;

        /* renamed from: d */
        public String f146337d;

        /* renamed from: e */
        public String f146338e;

        public a(JSONObject jSONObject) {
            try {
                this.f146334a = jSONObject.optString("label");
                this.f146335b = jSONObject.optString("iconUrl");
                this.f146336c = jSONObject.optInt("bgColor");
                this.f146337d = jSONObject.optString("act");
                this.f146338e = jSONObject.optString("data");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: a */
        public JSONObject m153162a() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f146334a)) {
                    jSONObject.put("label", this.f146334a);
                }
                if (!TextUtils.isEmpty(this.f146335b)) {
                    jSONObject.put("iconUrl", this.f146335b);
                }
                jSONObject.put("bgColor", this.f146336c);
                if (!TextUtils.isEmpty(this.f146337d)) {
                    jSONObject.put("act", this.f146337d);
                }
                if (!TextUtils.isEmpty(this.f146338e)) {
                    jSONObject.put("data", this.f146338e);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            return jSONObject;
        }
    }

    public C31862c(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        JSONObject optJSONObject;
        this.f146308a = 0;
        this.f146309b = -1;
        this.f146310c = "";
        this.f146311d = "";
        this.f146312e = "";
        this.f146313f = "";
        this.f146314g = "";
        this.f146315h = false;
        this.f146316i = false;
        this.f146317j = "";
        this.f146318k = "";
        this.f146319l = false;
        this.f146320m = "";
        this.f146321n = "";
        this.f146322o = "";
        this.f146323p = "";
        this.f146324q = "";
        this.f146325r = "";
        this.f146326s = "";
        this.f146327t = "";
        this.f146328u = "";
        this.f146329v = "";
        this.f146331x = 0;
        this.f146301C = true;
        this.f146302D = false;
        this.f146303E = false;
        this.f146304F = "";
        this.f146307I = "";
        try {
            this.f146310c = jSONObject.optString("id");
            this.f146311d = jSONObject.optString("threadId", "");
            this.f146308a = jSONObject.optInt("viewType");
            this.f146309b = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
            this.f146312e = jSONObject.optString("avt");
            this.f146313f = jSONObject.optString("title");
            this.f146314g = jSONObject.optString("subTitle");
            if (jSONObject.optInt("lock") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f146315h = z11;
            if (jSONObject.optInt("isCloseByBio") == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f146319l = z12;
            if (jSONObject.optInt("dismissOnClick") == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f146316i = z13;
            this.f146329v = jSONObject.optString("thumbUrl");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("actionBackground");
            if (optJSONObject2 != null) {
                this.f146318k = optJSONObject2.optString("act");
                this.f146317j = optJSONObject2.optString("data");
                if (optJSONObject2.has("usePreProcess")) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("data");
                    optJSONObject3.put("usePreProcess", optJSONObject2.optString("usePreProcess"));
                    this.f146317j = optJSONObject3.toString();
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("actionButton");
            if (optJSONObject4 != null) {
                this.f146322o = optJSONObject4.optString("label");
                this.f146320m = optJSONObject4.optString("data");
                this.f146321n = optJSONObject4.optString("act");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("actionLeftButton");
            if (optJSONObject5 != null) {
                this.f146325r = optJSONObject5.optString("label");
                this.f146323p = optJSONObject5.optString("data");
                this.f146324q = optJSONObject5.optString("act");
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("actionNotify");
            if (optJSONObject6 != null) {
                this.f146328u = optJSONObject6.optString("label");
                this.f146326s = optJSONObject6.optString("data");
                this.f146327t = optJSONObject6.optString("act");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("miniActionList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    this.f146330w.add(new a(optJSONArray.getJSONObject(i11)));
                }
            }
            this.f146331x = jSONObject.optInt("priority");
            JSONObject optJSONObject7 = jSONObject.optJSONObject("zinstantview");
            if (optJSONObject7 != null && (optJSONObject = optJSONObject7.optJSONObject("ZInstantAPIInfo")) != null) {
                this.f146305G = new C17244x0(9, optJSONObject);
                this.f146306H = AbstractC18069a.m96092k(optJSONObject7.optJSONArray("precheck_actions"));
                this.f146307I = optJSONObject.toString();
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("configurator");
            if (optJSONObject8 != null) {
                if (optJSONObject8.optInt("isShowWhenNoComment", 1) == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f146301C = z14;
                if (optJSONObject8.optInt("isShowOverlap", 0) == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f146302D = z15;
                this.f146303E = optJSONObject8.optInt("bubbleSetting", 0) == 1;
                this.f146304F = optJSONObject8.optString("tipData");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    private boolean m153148g() {
        if (this.f146309b == 4 && !TextUtils.isEmpty(this.f146318k) && this.f146318k.equals("action.open.suggest.collection")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m153149a() {
        boolean z11;
        C17244x0 c17244x0;
        boolean z12 = true;
        boolean z13 = !m153148g();
        if (z13 && m153158k()) {
            AbstractC26683d.m137045e();
            if (AbstractC26683d.f126394m && (c17244x0 = this.f146305G) != null && c17244x0.m92064b() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            z13 &= z11;
        }
        if (this.f146303E) {
            if (!AbstractC26683d.f126391B || AbstractC23034c6.m118125K()) {
                z12 = false;
            }
            return z13 & z12;
        }
        return z13;
    }

    /* renamed from: b */
    public String m153150b() {
        int i11;
        int i12;
        int i13;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f146310c);
        sb2.append("_");
        sb2.append(this.f146308a);
        sb2.append("_");
        sb2.append(this.f146331x);
        sb2.append("_");
        sb2.append(this.f146311d);
        sb2.append("_");
        C31847b c31847b = this.f146333z;
        int i14 = -1;
        if (c31847b != null) {
            i11 = c31847b.f146217d;
        } else {
            i11 = -1;
        }
        sb2.append(i11);
        sb2.append("_");
        C31847b c31847b2 = this.f146333z;
        if (c31847b2 != null) {
            i12 = c31847b2.f146216c;
        } else {
            i12 = -1;
        }
        sb2.append(i12);
        sb2.append("_");
        C31847b c31847b3 = this.f146333z;
        if (c31847b3 != null) {
            i13 = c31847b3.f146215b;
        } else {
            i13 = -1;
        }
        sb2.append(i13);
        sb2.append("_");
        C31847b c31847b4 = this.f146333z;
        if (c31847b4 != null) {
            i14 = c31847b4.f146214a;
        }
        sb2.append(i14);
        sb2.append("_");
        return sb2.toString();
    }

    /* renamed from: c */
    public void m153151c() {
        try {
            if (m153158k()) {
                AbstractC26683d.m137045e();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public boolean m153152d() {
        if (this.f146333z == null) {
            return false;
        }
        long mo124311f = C23793c.m124316k().mo124311f() / 1000;
        C31847b c31847b = this.f146333z;
        if (c31847b.f146218e > mo124311f || mo124311f >= c31847b.f146219f) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m153153e() {
        return this.f146316i;
    }

    /* renamed from: f */
    public boolean m153154f() {
        if (C23793c.m124316k().mo124311f() / 1000 > this.f146333z.f146219f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m153155h() {
        int i11;
        List list;
        int i12 = this.f146309b;
        if (i12 == 0 || i12 == 1) {
            return true;
        }
        if ((i12 == 2 && (list = this.f146330w) != null && list.size() > 0) || (i11 = this.f146309b) == 3 || i11 == 4 || i11 == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m153156i() {
        return m153157j(null);
    }

    /* renamed from: j */
    public boolean m153157j(AbstractC28207v1.i0 i0Var) {
        List<JSONObject> list;
        if (!TextUtils.isEmpty(this.f146321n) && !AbstractC28207v1.m141987h1(this.f146321n, this.f146320m, null, i0Var)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f146327t) && !AbstractC28207v1.m141987h1(this.f146327t, this.f146326s, null, i0Var)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f146318k) && !AbstractC28207v1.m141987h1(this.f146318k, this.f146317j, null, i0Var)) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f146324q) && !AbstractC28207v1.m141987h1(this.f146324q, this.f146323p, null, i0Var)) {
            return false;
        }
        List<a> list2 = this.f146330w;
        if (list2 != null) {
            for (a aVar : list2) {
                if (!AbstractC28207v1.m141987h1(aVar.f146337d, aVar.f146338e, null, i0Var)) {
                    return false;
                }
            }
        }
        if (this.f146305G != null && (list = this.f146306H) != null) {
            for (JSONObject jSONObject : list) {
                if (!AbstractC28207v1.m141987h1(jSONObject.optString("act"), jSONObject.optString("data"), null, i0Var)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m153158k() {
        return this.f146309b == 5;
    }

    /* renamed from: l */
    public boolean m153159l(C31862c c31862c) {
        if (m153158k() && c31862c.m153158k() && TextUtils.equals(this.f146307I, c31862c.f146307I)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void m153160m(String str) {
        this.f146310c = str;
    }

    /* renamed from: n */
    public JSONObject m153161n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f146310c);
            jSONObject.put("threadId", this.f146311d);
            jSONObject.put("viewType", this.f146308a);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f146309b);
            jSONObject.put("avt", this.f146312e);
            jSONObject.put("title", this.f146313f);
            jSONObject.put("subTitle", this.f146314g);
            jSONObject.put("lock", this.f146315h ? 1 : 0);
            jSONObject.put("isCloseByBio", this.f146319l ? 1 : 0);
            jSONObject.put("dismissOnClick", this.f146316i ? 1 : 0);
            jSONObject.put("thumbUrl", this.f146329v);
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(this.f146318k)) {
                jSONObject2.put("act", this.f146318k);
            }
            if (!TextUtils.isEmpty(this.f146317j)) {
                JSONObject jSONObject3 = new JSONObject(this.f146317j);
                if (jSONObject3.has("usePreProcess")) {
                    jSONObject2.put("usePreProcess", jSONObject3.optString("usePreProcess"));
                    jSONObject3.remove("usePreProcess");
                }
                jSONObject2.put("act", jSONObject3);
            }
            jSONObject.put("actionBackground", jSONObject2);
            JSONObject jSONObject4 = new JSONObject();
            if (!TextUtils.isEmpty(this.f146322o)) {
                jSONObject4.put("label", this.f146322o);
            }
            if (!TextUtils.isEmpty(this.f146320m)) {
                jSONObject4.put("data", this.f146320m);
            }
            if (!TextUtils.isEmpty(this.f146321n)) {
                jSONObject4.put("act", this.f146321n);
            }
            jSONObject.put("actionButton", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            if (!TextUtils.isEmpty(this.f146325r)) {
                jSONObject5.put("label", this.f146325r);
            }
            if (!TextUtils.isEmpty(this.f146323p)) {
                jSONObject5.put("data", this.f146323p);
            }
            if (!TextUtils.isEmpty(this.f146324q)) {
                jSONObject5.put("act", this.f146324q);
            }
            jSONObject.put("actionLeftButton", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (!TextUtils.isEmpty(this.f146328u)) {
                jSONObject6.put("label", this.f146328u);
            }
            if (!TextUtils.isEmpty(this.f146326s)) {
                jSONObject6.put("data", this.f146326s);
            }
            if (!TextUtils.isEmpty(this.f146327t)) {
                jSONObject6.put("act", this.f146327t);
            }
            jSONObject.put("actionNotify", jSONObject6);
            List list = this.f146330w;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < this.f146330w.size(); i11++) {
                    jSONArray.put(i11, ((a) this.f146330w.get(i11)).m153162a());
                }
                jSONObject.put("miniActionList", jSONArray);
            }
            jSONObject.put("priority", this.f146331x);
            if (this.f146305G != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("ZInstantAPIInfo", this.f146305G.m92066d());
                List list2 = this.f146306H;
                if (list2 != null && !list2.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = this.f146306H.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((JSONObject) it.next());
                    }
                    jSONObject7.put("precheck_actions", jSONArray2);
                }
                jSONObject.put("zinstantview", jSONObject7);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("isShowWhenNoComment", this.f146301C ? 1 : 0);
            jSONObject8.put("isShowOverlap", this.f146302D ? 1 : 0);
            jSONObject8.put("bubbleSetting", this.f146303E ? 1 : 0);
            if (!TextUtils.isEmpty(this.f146304F)) {
                jSONObject8.put("tipData", this.f146304F);
            }
            jSONObject.put("configurator", jSONObject8);
            return jSONObject;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }
}
