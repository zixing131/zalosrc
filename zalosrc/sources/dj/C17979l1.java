package dj;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;
import p560uw.EnumC27374a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31957i4;
import p716zh.C32063p6;
import p716zh.C32108s9;

/* renamed from: dj.l1 */
/* loaded from: classes3.dex */
public class C17979l1 {

    /* renamed from: i */
    public C31890dc f91066i;

    /* renamed from: l */
    public C31957i4 f91069l;

    /* renamed from: m */
    private String f91070m;

    /* renamed from: n */
    private C32108s9 f91071n;

    /* renamed from: o */
    public C32063p6 f91072o;

    /* renamed from: a */
    public int f91058a = -1;

    /* renamed from: b */
    public int f91059b = -1;

    /* renamed from: c */
    public int f91060c = -1;

    /* renamed from: d */
    public int f91061d = 0;

    /* renamed from: e */
    public int f91062e = -1;

    /* renamed from: f */
    public String f91063f = "";

    /* renamed from: g */
    public int f91064g = 0;

    /* renamed from: h */
    public int f91065h = 0;

    /* renamed from: j */
    public boolean f91067j = false;

    /* renamed from: k */
    public EnumC27374a f91068k = EnumC27374a.f128964q;

    /* renamed from: a */
    public JSONObject m95619a(boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sSrcType", this.f91062e);
            jSONObject.put("sSrcStr", this.f91063f);
            if (this.f91064g != 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("decorType", this.f91064g);
                jSONObject2.put("typoId", this.f91065h);
                jSONObject.put("decorInfo", jSONObject2);
            }
            if (this.f91067j) {
                jSONObject.put("shouldParseLinkOrContact", 1);
            }
            jSONObject.put("msg_warning_type", this.f91068k.m140275c());
            C31957i4 c31957i4 = this.f91069l;
            if (c31957i4 != null) {
                jSONObject.put("emoji", c31957i4.m153656a());
            }
            if (!z11 && !TextUtils.isEmpty(this.f91070m)) {
                jSONObject.put("msg_failed_info", this.f91070m);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public int m95620b() {
        if (m95623e()) {
            return this.f91064g;
        }
        return 0;
    }

    /* renamed from: c */
    public C32108s9 m95621c() {
        if (this.f91071n == null && !TextUtils.isEmpty(this.f91070m)) {
            try {
                this.f91071n = new C32108s9(new JSONObject(this.f91070m));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return this.f91071n;
    }

    /* renamed from: d */
    public boolean m95622d() {
        if (m95620b() == 4 && this.f91065h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m95623e() {
        int i11 = this.f91064g;
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        if (i11 == 4 && C31845ac.m152996J().m153048c0()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m95624f(String str) {
        JSONObject optJSONObject;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f91062e = jSONObject.optInt("sSrcType", -1);
                this.f91063f = jSONObject.optString("sSrcStr");
                if (jSONObject.has("decorInfo") && (optJSONObject = jSONObject.optJSONObject("decorInfo")) != null) {
                    if (optJSONObject.has("decorType")) {
                        this.f91064g = optJSONObject.getInt("decorType");
                    }
                    if (optJSONObject.has("typoId")) {
                        this.f91065h = optJSONObject.getInt("typoId");
                    }
                    if (this.f91064g == 4) {
                        if (this.f91065h == 0) {
                            this.f91066i = C31845ac.m152996J().m153024D();
                        } else {
                            C31890dc m153036O = C31845ac.m152996J().m153036O(String.valueOf(this.f91065h));
                            if (m153036O != null && m153036O.m153250u()) {
                                this.f91066i = m153036O;
                            }
                        }
                    }
                }
                boolean z11 = true;
                if (jSONObject.optInt("shouldParseLinkOrContact") != 1) {
                    z11 = false;
                }
                this.f91067j = z11;
                this.f91070m = jSONObject.optString("msg_failed_info", "");
                this.f91068k = EnumC27374a.m140274d(jSONObject.optInt("msg_warning_type", EnumC27374a.f128964q.m140275c()));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    public void m95625g(String str) {
        this.f91070m = str;
    }
}
