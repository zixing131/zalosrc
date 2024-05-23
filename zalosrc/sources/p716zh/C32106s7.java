package p716zh;

import android.text.TextUtils;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3043u0;
import com.zing.zalo.zmedia.view.C17391z;
import dj.C18013y0;
import me0.AbstractC23006a0;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.C23307g;
import p394oj.C24278d;
import tj.C26713e;

/* renamed from: zh.s7 */
/* loaded from: classes3.dex */
public class C32106s7 {

    /* renamed from: a */
    public C31869c6 f148003a;

    /* renamed from: b */
    public String f148004b;

    /* renamed from: c */
    public String f148005c;

    /* renamed from: d */
    public String f148006d;

    /* renamed from: e */
    public String f148007e;

    /* renamed from: f */
    public C26713e f148008f;

    /* renamed from: g */
    public C24278d f148009g;

    /* renamed from: h */
    private C17391z f148010h;

    public C32106s7() {
    }

    /* renamed from: a */
    public static C32106s7 m154972a(C18013y0 c18013y0) {
        if (c18013y0 != null) {
            C32106s7 c32106s7 = new C32106s7();
            C32098s c32098s = c18013y0.f91251B;
            if (c32098s != null) {
                c32106s7.f148004b = c32098s.f147969s;
                c32106s7.f148006d = c32098s.f147953c;
                c32106s7.f148007e = c18013y0.f91015t;
                c32106s7.f148005c = c18013y0.f91013r;
                c32106s7.f148008f = c32098s.f147968r;
                C31869c6 c31869c6 = new C31869c6();
                c31869c6.f146355a = c32098s.f147956f;
                c31869c6.f146356b = c32098s.f147964n;
                c31869c6.f146357c = c32098s.f147963m;
                c31869c6.f146359e = c32098s.f147951a;
                c31869c6.f146358d = c32098s.f147962l;
                c31869c6.f146361g = c32098s.f147965o;
                c31869c6.f146362h = c32098s.f147966p;
                c31869c6.f146360f = c32098s.f147967q;
                c32106s7.f148003a = c31869c6;
            }
            c32106s7.m154980i(C31840a7.m152973c().m152979g(c32106s7.m154977f(), c32106s7.m154975d()));
            return c32106s7;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static C32106s7 m154973b(C3020p0 c3020p0) {
        String str;
        C26713e c26713e = null;
        if (c3020p0 == null || !c3020p0.m14480I()) {
            return null;
        }
        try {
            C3025q0.b bVar = c3020p0.f12023C.f12134y;
            C32106s7 c32106s7 = new C32106s7();
            try {
                c32106s7.f148004b = bVar.f12141d;
                c32106s7.f148006d = bVar.f12138a;
                if (!TextUtils.isEmpty(bVar.f12140c)) {
                    str = bVar.f12140c;
                } else {
                    str = bVar.f12139b;
                }
                c32106s7.f148005c = str;
                C3043u0 c3043u0 = c3020p0.f12024D;
                if (c3043u0 != null) {
                    c26713e = c3043u0.m14618c();
                }
                c32106s7.f148008f = c26713e;
                c32106s7.f148003a = bVar.f12149l;
                c32106s7.m154980i(C31840a7.m152973c().m152979g(c32106s7.m154977f(), c32106s7.m154975d()));
                return c32106s7;
            } catch (Exception e11) {
                e = e11;
                c26713e = c32106s7;
                e.printStackTrace();
                return c26713e;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: c */
    public long m154974c() {
        C31869c6 c31869c6 = this.f148003a;
        if (c31869c6 != null) {
            return c31869c6.f146356b;
        }
        return 0L;
    }

    /* renamed from: d */
    public String m154975d() {
        C31869c6 c31869c6 = this.f148003a;
        if (c31869c6 != null) {
            return c31869c6.f146357c;
        }
        return null;
    }

    /* renamed from: e */
    public C32107s8 m154976e() {
        C31869c6 c31869c6 = this.f148003a;
        if (c31869c6 != null) {
            return c31869c6.f146358d;
        }
        return null;
    }

    /* renamed from: f */
    public String m154977f() {
        C31869c6 c31869c6 = this.f148003a;
        if (c31869c6 != null) {
            return c31869c6.f146359e;
        }
        return null;
    }

    /* renamed from: g */
    public C17391z m154978g() {
        if (this.f148010h == null) {
            m154979h();
        }
        return this.f148010h;
    }

    /* renamed from: h */
    void m154979h() {
        String str;
        String str2;
        String str3;
        String str4;
        long j11;
        float f11;
        int i11;
        int i12;
        C24278d c24278d = this.f148009g;
        String str5 = "";
        if (c24278d == null) {
            str = "";
            str2 = str;
        } else {
            String str6 = c24278d.f117250c;
            str2 = c24278d.f117251d;
            str = str6;
        }
        C31869c6 c31869c6 = this.f148003a;
        boolean z11 = false;
        float f12 = 1.0f;
        if (c31869c6 == null) {
            str3 = "";
            str4 = str3;
            j11 = 0;
            f11 = 1.0f;
        } else {
            str3 = c31869c6.f146357c;
            C23307g c23307g = c31869c6.f146362h;
            if (c23307g != null && (i11 = c23307g.f113474a) > 0 && (i12 = c23307g.f113475b) > 0) {
                f12 = (i11 * 1.0f) / i12;
            }
            C32107s8 c32107s8 = c31869c6.f146358d;
            if (c32107s8 != null) {
                str5 = String.valueOf(c32107s8.f148011a);
            }
            C31869c6 c31869c62 = this.f148003a;
            long j12 = c31869c62.f146360f * 1000;
            C32121t8 c32121t8 = c31869c62.f146361g;
            if (c32121t8 != null && c32121t8.f148090a) {
                z11 = true;
            }
            str4 = str5;
            f11 = f12;
            j11 = j12;
        }
        C17391z c17391z = new C17391z(str3, this.f148006d, str, str2, this.f148005c, AbstractC23006a0.m117875E(), false, 9, f11, 3, null, str4, 0);
        this.f148010h = c17391z;
        c17391z.f88632o = j11;
        c17391z.f88630m = z11;
    }

    /* renamed from: i */
    public void m154980i(C24278d c24278d) {
        this.f148009g = c24278d;
        m154979h();
    }

    /* renamed from: j */
    public JSONObject m154981j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("href", this.f148004b);
            jSONObject.put("thumbUrl", this.f148005c);
            jSONObject.put("title", this.f148006d);
            jSONObject.put("description", this.f148007e);
            C31869c6 c31869c6 = this.f148003a;
            if (c31869c6 != null) {
                jSONObject.put("media", c31869c6.m153174b());
            }
            C26713e c26713e = this.f148008f;
            if (c26713e != null) {
                jSONObject.put("footerv2", c26713e.m137363h());
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C32106s7(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f148004b = jSONObject.optString("href");
            this.f148005c = jSONObject.optString("thumbUrl");
            this.f148006d = jSONObject.optString("title");
            this.f148007e = jSONObject.optString("description");
            JSONObject optJSONObject = jSONObject.optJSONObject("media");
            if (optJSONObject != null) {
                this.f148003a = new C31869c6(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("footerv2");
            if (optJSONObject2 != null) {
                this.f148008f = new C26713e(optJSONObject2);
            }
            if (this.f148003a != null) {
                C31840a7 m152973c = C31840a7.m152973c();
                C31869c6 c31869c6 = this.f148003a;
                m154980i(m152973c.m152979g(c31869c6.f146359e, c31869c6.f146357c));
            }
        }
    }
}
