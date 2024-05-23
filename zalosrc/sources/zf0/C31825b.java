package zf0;

import ae.C0762g;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p307kv.AbstractC21954k;
import p667y2.C30268e;
import zf0.C31825b;

/* renamed from: zf0.b */
/* loaded from: classes5.dex */
public final class C31825b {

    /* renamed from: a */
    private final MiniAppZinstantLayout f146041a;

    /* renamed from: b */
    private final long f146042b;

    /* renamed from: c */
    private final int f146043c;

    /* renamed from: d */
    private final JSONObject f146044d;

    /* renamed from: e */
    private final String f146045e;

    /* renamed from: f */
    private InterfaceC31826c f146046f;

    /* renamed from: g */
    private JSONObject f146047g;

    /* renamed from: zf0.b$a */
    /* loaded from: classes5.dex */
    public static final class a implements MiniAppZinstantLayout.InterfaceC14613a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m152904b(C31825b c31825b) {
            AbstractC19074t.m100208f(c31825b, "this$0");
            c31825b.m152900f().onStart();
            c31825b.m152900f().setExternalData(c31825b.f146047g);
            InterfaceC31826c m152899e = c31825b.m152899e();
            if (m152899e != null) {
                m152899e.mo81422yo(String.valueOf(c31825b.f146047g));
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout.InterfaceC14613a
        /* renamed from: L0 */
        public void mo81778L0(String str, String str2) {
            AbstractC19074t.m100208f(str, "action");
            C31825b.this.m152897h(str, str2);
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout.InterfaceC14613a
        /* renamed from: M0 */
        public void mo81779M0() {
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout.InterfaceC14613a
        /* renamed from: N0 */
        public void mo81780N0() {
            AbstractC21954k.a aVar = AbstractC21954k.Companion;
            final C31825b c31825b = C31825b.this;
            aVar.m114607G(new Runnable() { // from class: zf0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C31825b.a.m152904b(C31825b.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout.InterfaceC14613a
        /* renamed from: O0 */
        public void mo81781O0() {
            C31825b.this.m152896g();
        }

        @Override // com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout.InterfaceC14613a
        /* renamed from: c */
        public void mo81782c(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            InterfaceC31826c m152899e = C31825b.this.m152899e();
            if (m152899e != null) {
                m152899e.mo87353c(exc);
            }
        }
    }

    /* renamed from: zf0.b$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC31826c m152899e = C31825b.this.m152899e();
            if (m152899e != null) {
                m152899e.mo87353c(new Exception(String.valueOf(c20096c)));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                int i11 = jSONObject.getInt("error_code");
                if (i11 != 0) {
                    AbstractC20110a.f98889a.mo104551d("errorCode = " + i11 + " msg = " + jSONObject.getString("error_message"), new Object[0]);
                    InterfaceC31826c m152899e = C31825b.this.m152899e();
                    if (m152899e != null) {
                        m152899e.mo87353c(new Exception(jSONObject.getString("error_message")));
                        return;
                    }
                    return;
                }
                C31825b.this.m152898j(new JSONObject(((JSONObject) obj).getJSONObject("data").getString("payload")));
            } catch (Exception e11) {
                InterfaceC31826c m152899e2 = C31825b.this.m152899e();
                if (m152899e2 != null) {
                    m152899e2.mo87353c(e11);
                }
            }
        }
    }

    public C31825b(MiniAppZinstantLayout miniAppZinstantLayout, long j11, int i11, JSONObject jSONObject, String str) {
        AbstractC19074t.m100208f(miniAppZinstantLayout, "zinstantLayout");
        AbstractC19074t.m100208f(jSONObject, "payload");
        this.f146041a = miniAppZinstantLayout;
        this.f146042b = j11;
        this.f146043c = i11;
        this.f146044d = jSONObject;
        this.f146045e = str;
        miniAppZinstantLayout.setupData(new a());
        m152896g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m152896g() {
        String str;
        String str2;
        if (!this.f146044d.optBoolean("forceUpdate") && (str2 = this.f146045e) != null && str2.length() != 0) {
            try {
                m152898j(new JSONObject(this.f146045e));
                AbstractC20110a.f98889a.mo104548a("getZinstantParams: Used cache", new Object[0]);
                return;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        int i11 = this.f146043c;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            str = null;
                        }
                    } else {
                        str = "zinstant.getdata.ui-menu";
                    }
                }
                str = "zinstant.getdata.uiconsent";
            } else {
                str = "zinstant.getdata.permission-management";
            }
        } else {
            str = "zinstant.getdata.app-info";
        }
        C0762g c0762g = new C0762g();
        c0762g.m1341j(new b());
        if (str != null) {
            c0762g.m1375n(this.f146042b, str, this.f146044d);
        }
        AbstractC20110a.f98889a.mo104548a("getZinstantParams: Requested UI", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m152897h(String str, String str2) {
        try {
            InterfaceC31826c interfaceC31826c = this.f146046f;
            if (interfaceC31826c != null) {
                interfaceC31826c.mo87351L0(str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m152898j(JSONObject jSONObject) {
        try {
            this.f146047g = jSONObject;
            MiniAppZinstantLayout miniAppZinstantLayout = this.f146041a;
            JSONObject jSONObject2 = jSONObject.getJSONObject("ZInstantAPIInfo");
            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
            MiniAppZinstantLayout.m81775i1(miniAppZinstantLayout, jSONObject2, 43, null, 4, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public final InterfaceC31826c m152899e() {
        return this.f146046f;
    }

    /* renamed from: f */
    public final MiniAppZinstantLayout m152900f() {
        return this.f146041a;
    }

    /* renamed from: i */
    public final void m152901i() {
        m152896g();
    }

    /* renamed from: k */
    public final void m152902k(InterfaceC31826c interfaceC31826c) {
        this.f146046f = interfaceC31826c;
    }
}
