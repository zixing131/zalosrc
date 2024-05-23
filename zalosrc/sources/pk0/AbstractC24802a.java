package pk0;

import fn0.AbstractC19074t;
import nk0.AbstractC23825g0;
import org.json.JSONObject;
import qk0.InterfaceC25305a;

/* renamed from: pk0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC24802a implements InterfaceC25305a {

    /* renamed from: a */
    private InterfaceC25305a f119062a;

    @Override // qk0.InterfaceC25305a
    /* renamed from: a */
    public void mo92030a() {
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            interfaceC25305a.mo92030a();
        }
    }

    @Override // qk0.InterfaceC25305a
    /* renamed from: b */
    public void mo92031b() {
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            interfaceC25305a.mo92031b();
        }
    }

    @Override // qk0.InterfaceC25305a
    /* renamed from: c */
    public void mo92032c(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "action");
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            interfaceC25305a.mo92032c(abstractC23825g0, str, str2, str3);
        }
    }

    @Override // qk0.InterfaceC25305a
    /* renamed from: d */
    public void mo92033d(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "action");
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            interfaceC25305a.mo92033d(abstractC23825g0, str, str2, str3);
        }
    }

    @Override // qk0.InterfaceC25305a
    /* renamed from: e */
    public boolean mo92034e() {
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            return interfaceC25305a.mo92034e();
        }
        return false;
    }

    @Override // qk0.InterfaceC25305a
    /* renamed from: f */
    public void mo92035f(AbstractC23825g0 abstractC23825g0, String str, String str2, String str3, JSONObject jSONObject) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "action");
        InterfaceC25305a interfaceC25305a = this.f119062a;
        if (interfaceC25305a != null) {
            interfaceC25305a.mo92035f(abstractC23825g0, str, str2, str3, jSONObject);
        }
    }

    /* renamed from: g */
    public final void m128868g(InterfaceC25305a interfaceC25305a) {
        AbstractC19074t.m100208f(interfaceC25305a, "clickHandler");
        this.f119062a = interfaceC25305a;
    }
}
