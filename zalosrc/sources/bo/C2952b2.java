package bo;

import com.zing.zalo.zinstant.C17244x0;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import org.json.JSONObject;

/* renamed from: bo.b2 */
/* loaded from: classes4.dex */
public class C2952b2 implements InterfaceC2947a2 {

    /* renamed from: a */
    public int f11647a;

    /* renamed from: b */
    public C3060y1 f11648b;

    /* renamed from: c */
    public C17244x0 f11649c;

    /* renamed from: d */
    public C2957c2 f11650d;

    /* renamed from: e */
    public InterfaceC20578a0 f11651e;

    public C2952b2(JSONObject jSONObject) {
        C3060y1 c3060y1;
        C17244x0 c17244x0;
        if (jSONObject != null) {
            try {
                this.f11647a = jSONObject.optInt("pos");
                JSONObject optJSONObject = jSONObject.optJSONObject("attachment");
                if (optJSONObject != null) {
                    c3060y1 = new C3060y1(optJSONObject);
                } else {
                    c3060y1 = null;
                }
                this.f11648b = c3060y1;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("zinstant_entry_info");
                if (optJSONObject2 != null) {
                    c17244x0 = new C17244x0(29, optJSONObject2);
                } else {
                    c17244x0 = null;
                }
                this.f11649c = c17244x0;
                JSONObject optJSONObject3 = jSONObject.optJSONObject("time_valid");
                this.f11650d = optJSONObject3 != null ? new C2957c2(optJSONObject3) : null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: a */
    public int mo13949a() {
        return AbstractC23136l9.m118722k0();
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: b */
    public C17244x0 mo13950b() {
        return this.f11649c;
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: c */
    public InterfaceC20578a0 mo13951c() {
        return m13979i();
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: d */
    public boolean mo13952d(InterfaceC2947a2 interfaceC2947a2) {
        if (interfaceC2947a2 instanceof C2952b2) {
            return m13981k((C2952b2) interfaceC2947a2);
        }
        return false;
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: e */
    public String mo13953e() {
        return m13977g();
    }

    @Override // bo.InterfaceC2947a2
    /* renamed from: f */
    public C3060y1 mo13954f() {
        return this.f11648b;
    }

    /* renamed from: g */
    public String m13977g() {
        C3060y1 c3060y1 = this.f11648b;
        if (c3060y1 != null) {
            return c3060y1.m14709a();
        }
        return "";
    }

    /* renamed from: h */
    public InterfaceC22508f m13978h() {
        C3060y1 c3060y1 = this.f11648b;
        if (c3060y1 != null) {
            return c3060y1.m14710b();
        }
        return null;
    }

    /* renamed from: i */
    public InterfaceC20578a0 m13979i() {
        return this.f11651e;
    }

    /* renamed from: j */
    public InterfaceC22508f m13980j() {
        C17244x0 c17244x0 = this.f11649c;
        if (c17244x0 != null) {
            return c17244x0.m92064b();
        }
        return null;
    }

    /* renamed from: k */
    public boolean m13981k(C2952b2 c2952b2) {
        C17244x0 c17244x0;
        if (this == c2952b2) {
            return true;
        }
        if (c2952b2 != null && (c17244x0 = this.f11649c) != null && c17244x0.equals(c2952b2.f11649c)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m13982l() {
        long currentTimeMillis = System.currentTimeMillis();
        C2957c2 c2957c2 = this.f11650d;
        if (c2957c2 != null && currentTimeMillis >= c2957c2.f11666a && currentTimeMillis <= c2957c2.f11667b) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void m13983m(InterfaceC20578a0 interfaceC20578a0) {
        this.f11651e = interfaceC20578a0;
    }

    /* renamed from: n */
    public JSONObject m13984n() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("pos", this.f11647a);
            C3060y1 c3060y1 = this.f11648b;
            JSONObject jSONObject4 = null;
            if (c3060y1 != null) {
                jSONObject = c3060y1.m14711c();
            } else {
                jSONObject = null;
            }
            jSONObject3.put("attachment", jSONObject);
            C17244x0 c17244x0 = this.f11649c;
            if (c17244x0 != null) {
                jSONObject2 = c17244x0.m92066d();
            } else {
                jSONObject2 = null;
            }
            jSONObject3.put("zinstant_entry_info", jSONObject2);
            C2957c2 c2957c2 = this.f11650d;
            if (c2957c2 != null) {
                jSONObject4 = c2957c2.m14003a();
            }
            jSONObject3.put("time_valid", jSONObject4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject3;
    }
}
