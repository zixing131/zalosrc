package p715zg;

import ae.C0762g;
import com.zing.zalo.control.WebAppInterface;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p608wg.InterfaceC28970f;

/* renamed from: zg.a */
/* loaded from: classes3.dex */
public abstract class AbstractC31827a implements InterfaceC28970f {

    /* renamed from: a */
    private final String f146050a;

    /* renamed from: b */
    private final String f146051b;

    /* renamed from: c */
    private final InterfaceC25792a.c f146052c;

    /* renamed from: d */
    private final JSONObject f146053d;

    /* renamed from: zg.a$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC31827a.this.m152914l(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC31827a.this.m152913k(obj);
        }
    }

    public AbstractC31827a(String str, String str2, InterfaceC25792a.c cVar) {
        JSONObject jSONObject;
        AbstractC19074t.m100208f(str, "action");
        this.f146050a = str;
        this.f146051b = str2;
        this.f146052c = cVar;
        if (str2 != null) {
            jSONObject = AbstractC25384a.m131571b(str2);
        } else {
            jSONObject = null;
        }
        this.f146053d = jSONObject;
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    /* renamed from: b */
    public String m152905b(int i11, String str, String str2) {
        return InterfaceC28970f.a.m144681a(this, i11, str, str2);
    }

    /* renamed from: c */
    public String m152906c(String str, String str2) {
        return InterfaceC28970f.a.m144683c(this, str, str2);
    }

    /* renamed from: e */
    public final String m152907e() {
        return this.f146050a;
    }

    /* renamed from: f */
    public final String m152908f() {
        return this.f146051b;
    }

    /* renamed from: g */
    public final JSONObject m152909g() {
        return this.f146053d;
    }

    /* renamed from: h */
    public final InterfaceC25792a.c m152910h() {
        return this.f146052c;
    }

    /* renamed from: i */
    public final void m152911i(String str) {
        AbstractC19074t.m100208f(str, "appId");
        if (this.f146053d == null) {
            return;
        }
        try {
            C0762g c0762g = new C0762g();
            String optString = this.f146053d.optString("parentAction", this.f146050a);
            c0762g.m1341j(new a());
            long parseLong = Long.parseLong(str);
            AbstractC19074t.m100205c(optString);
            c0762g.m1376o(parseLong, optString, this.f146053d);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j */
    public abstract void mo152912j(String str);

    /* renamed from: k */
    public final void m152913k(Object obj) {
        JSONObject jSONObject;
        String str;
        String m127114D;
        String optString;
        JSONObject m131571b;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            InterfaceC25792a.c cVar = this.f146052c;
            if (cVar != null) {
                InterfaceC25792a.c.a.m132932a(cVar, m152905b(WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, "Server sent a non-json data format", this.f146050a), null, 2, null);
                return;
            }
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && (optString = optJSONObject.optString("payload")) != null && (m131571b = AbstractC25384a.m131571b(optString)) != null) {
            str = m131571b.optString("data");
        } else {
            str = null;
        }
        if (str != null) {
            m127114D = AbstractC24341v.m127114D(str, "\"", "\\\"", false, 4, null);
            mo152912j(m127114D);
            InterfaceC25792a.c cVar2 = this.f146052c;
            if (cVar2 != null) {
                InterfaceC25792a.c.a.m132932a(cVar2, m152906c(this.f146050a, m127114D), null, 2, null);
                return;
            }
            return;
        }
        InterfaceC25792a.c cVar3 = this.f146052c;
        if (cVar3 != null) {
            InterfaceC25792a.c.a.m132932a(cVar3, m152905b(WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, "Payload is null!", this.f146050a), null, 2, null);
        }
    }

    /* renamed from: l */
    public final void m152914l(C20096c c20096c) {
        AbstractC20110a.f98889a.mo104548a("handleDynamicApiOnServer: " + c20096c, new Object[0]);
        InterfaceC25792a.c cVar = this.f146052c;
        if (cVar != null) {
            InterfaceC25792a.c.a.m132932a(cVar, m152905b(WebAppInterface.ERROR_CODE_PARSED_DATA_FAILED, String.valueOf(c20096c), this.f146050a), null, 2, null);
        }
    }
}
