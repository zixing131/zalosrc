package p716zh;

import android.content.Context;
import android.text.TextUtils;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.List;
import li.AbstractC22490a;
import lv.InterfaceC22657e;
import org.json.JSONObject;
import p023av.EnumC2383a;
import p140ev.C18613b;
import p140ev.C18621j;
import p278jv.C21367a;
import p278jv.C21368b;
import p542ub.InterfaceC27218a;
import p693yu.InterfaceC31084b;
import vg.AbstractC28207v1;
import yf0.C30930b;
import yf0.C30933c0;

/* renamed from: zh.gd */
/* loaded from: classes3.dex */
public final class C31936gd implements InterfaceC31084b {

    /* renamed from: a */
    private final C30933c0 f146737a;

    public C31936gd(C30933c0 c30933c0) {
        AbstractC19074t.m100208f(c30933c0, "webviewViewModel");
        this.f146737a = c30933c0;
    }

    /* renamed from: W */
    private final void m153479W(String str, String str2, String str3) {
        C30933c0 c30933c0 = this.f146737a;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("javascript: zaloJSV2.zalo_h5_event_handler('%s', '%s', '%s')", Arrays.copyOf(new Object[]{str, str2, str3}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        c30933c0.m150315X1(new C30933c0.a.z(format));
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: A */
    public void mo151017A(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str2, "eventName");
        this.f146737a.m150321a1(str, str2, str3);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: B */
    public void mo151018B(String str) {
        this.f146737a.m150335h2(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: C */
    public void mo151019C() {
        this.f146737a.m150308T0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: D */
    public void mo151020D(String str) {
        this.f146737a.m150355s0(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: E */
    public void mo151021E(String str, boolean z11) {
        this.f146737a.m150358t1(str, z11);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: F */
    public void mo151022F(C18613b c18613b, String str, boolean z11) {
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: G */
    public void mo151023G(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f146737a.m150315X1(new C30933c0.a.z("javascript: " + str2 + " ('" + str + "')"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: H */
    public void mo151024H(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f146737a.m150315X1(new C30933c0.a.z("javascript: " + str2 + " ('" + str + "')"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: I */
    public void mo151025I(String str, String str2, String str3) {
        if (str != null && str2 != null) {
            try {
                if (AbstractC19074t.m100204b(str2, "h5.event.mp.loadingview.closed")) {
                    if (str3 == null) {
                        return;
                    }
                    AbstractC20110a.f98889a.mo104548a("dispatchAppEvent2H5: " + str2 + " - " + str3, new Object[0]);
                    m153479W(str, str2, str3);
                } else {
                    if (str3 == null) {
                        str3 = "";
                    }
                    m153479W(str, str2, str3);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: J */
    public void mo151026J(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f146737a.m150315X1(new C30933c0.a.z("javascript: " + str2 + " ('" + str + "')"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: K */
    public int mo151027K() {
        return this.f146737a.m150357t0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: L */
    public boolean mo151028L(String str) {
        AbstractC19074t.m100208f(str, "action");
        return this.f146737a.m150314X0(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: M */
    public void mo151029M(C18613b c18613b, boolean z11, String str) {
        this.f146737a.m150282D1(c18613b, z11, str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: N */
    public void mo151030N(String str) {
        this.f146737a.m150279B1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: O */
    public void mo151031O(String str, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "options");
        this.f146737a.m150348n2(str, jSONObject, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: P */
    public int mo151032P() {
        return this.f146737a.m150302P0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: Q */
    public void mo151033Q(String str) {
        C21367a c21367a = (C21367a) this.f146737a.m150354r0().mo9215f();
        if (c21367a != null) {
            c21367a.m110742i(false);
        }
        InterfaceC22657e.a.m117257a(this.f146737a, null, str, false, 4, null);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: R */
    public void mo151034R(boolean z11) {
        this.f146737a.m150281C1(z11);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: S */
    public void mo151035S(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        this.f146737a.m150290I1(context, str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: T */
    public void mo151036T(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f146737a.m150315X1(new C30933c0.a.z("javascript: " + str2 + " ('" + str + "')"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: U */
    public void mo151037U(String str) {
        this.f146737a.m150369z1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: V */
    public void mo151038V() {
        this.f146737a.m150329e0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: a */
    public boolean mo151039a(String str) {
        return this.f146737a.m150319Z0(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: b */
    public boolean mo151040b(String str) {
        return this.f146737a.m150344m1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: c */
    public void mo151041c(String str, JSONObject jSONObject, String str2) {
        this.f146737a.m150307S1(str, jSONObject, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: d */
    public int mo151042d() {
        return this.f146737a.m150361v0().m98348a();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: e */
    public void mo151043e(String str, String str2) {
        this.f146737a.m150284E1(str, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: f */
    public void mo151044f(String str, int i11, JSONObject jSONObject, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f146737a.m150313X(str, i11, jSONObject, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: g */
    public void mo151045g() {
        this.f146737a.m150277A1();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: h */
    public void mo151046h(String str, String str2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "callback");
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f146737a.m150333g1(str, str2, jSONObject);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: i */
    public void mo151047i(List list, int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(list, "arrSavedPath");
        this.f146737a.m150366x1(list, i11, str, str2, str3);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: j */
    public boolean mo151048j(String str, String str2) {
        AbstractC19074t.m100208f(str, "action");
        return this.f146737a.m150340k2(str, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: k */
    public void mo151049k(String str, String str2, String str3, String str4, String str5) {
        this.f146737a.m150362v1(str, str2, str3, str4, str5);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: l */
    public void mo151050l(String str, String str2, String str3, EnumC2383a enumC2383a) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "resultJson");
        AbstractC19074t.m100208f(enumC2383a, "compressLevel");
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                this.f146737a.m150299N1(str, new JSONObject(str2), str3, enumC2383a);
            } catch (Exception e11) {
                AbstractC22490a.m116282e(new Exception("processMediaPickerResult", e11));
                this.f146737a.m150299N1(str, jSONObject, str3, enumC2383a);
            }
        } catch (Throwable th2) {
            this.f146737a.m150299N1(str, jSONObject, str3, enumC2383a);
            throw th2;
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: m */
    public void mo151051m(JSONObject jSONObject, String str) {
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f146737a.m150301O1(jSONObject, str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: n */
    public String mo151052n(InterfaceC27218a interfaceC27218a) {
        Context context;
        String m150316Y;
        if (interfaceC27218a == null || (context = interfaceC27218a.getContext()) == null || (m150316Y = this.f146737a.m150316Y(context)) == null) {
            return "undefine";
        }
        return m150316Y;
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: o */
    public void mo151053o() {
        this.f146737a.m150360u1();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: p */
    public void mo151054p(String str, String str2, String str3, String str4) {
        this.f146737a.m150294K1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: q */
    public boolean mo151055q(InterfaceC27218a interfaceC27218a) {
        return this.f146737a.m150318Z(interfaceC27218a);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: r */
    public void mo151056r(String str, String str2) {
        this.f146737a.m150322b0(str, str2);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: s */
    public void mo151057s(String str) {
        this.f146737a.m150288H1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: t */
    public void mo151058t(Context context, String str, boolean z11) {
        JSONObject m150235c;
        AbstractC19074t.m100208f(context, "context");
        if (str != null && str.length() != 0) {
            if (z11 && (m150235c = C30930b.Companion.m150239a().m150235c(context, this.f146737a.m150363w0().m98361l(), this.f146737a.m150363w0().m98360k())) != null) {
                m150235c.put("isCached", 1);
                C30933c0 c30933c0 = this.f146737a;
                String m141919S0 = AbstractC28207v1.m141919S0("action.jump.login", m150235c.toString());
                AbstractC19074t.m100207e(m141919S0, "genJsonSuccess(...)");
                c30933c0.m150338k0(str, m141919S0);
                return;
            }
            this.f146737a.m150309T1(context, str);
        }
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: u */
    public void mo151059u(String str) {
        this.f146737a.m150356s1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: v */
    public void mo151060v(String str) {
        this.f146737a.m150368y1(str);
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: w */
    public String mo151061w() {
        return this.f146737a.m150359u0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: x */
    public String mo151062x() {
        return this.f146737a.m150286G0();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: y */
    public void mo151063y() {
        this.f146737a.m150364w1();
    }

    @Override // p693yu.InterfaceC31084b
    /* renamed from: z */
    public C18621j mo151064z() {
        C21368b c21368b = (C21368b) this.f146737a.m150365x0().mo9215f();
        if (c21368b != null) {
            return c21368b.m110744b();
        }
        return null;
    }
}
