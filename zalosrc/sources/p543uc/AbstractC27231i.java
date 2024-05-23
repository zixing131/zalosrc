package p543uc;

import fn0.AbstractC19074t;
import java.util.List;
import org.json.JSONObject;

/* renamed from: uc.i */
/* loaded from: classes3.dex */
public abstract class AbstractC27231i implements InterfaceC27227e {

    /* renamed from: a */
    private final InterfaceC27227e f127997a;

    public AbstractC27231i(InterfaceC27227e interfaceC27227e) {
        AbstractC19074t.m100208f(interfaceC27227e, "wrapped");
        this.f127997a = interfaceC27227e;
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: b */
    public void mo139334b(JSONObject jSONObject, long j11) {
        AbstractC19074t.m100208f(jSONObject, "jsonMediaInfo");
        this.f127997a.mo139334b(jSONObject, j11);
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: c */
    public List mo139335c(List list) {
        AbstractC19074t.m100208f(list, "listDriveIdNeedDelete");
        return this.f127997a.mo139335c(list);
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: e */
    public String mo139336e() {
        return this.f127997a.mo139336e();
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: h */
    public void mo139337h(String str) {
        AbstractC19074t.m100208f(str, "token");
        this.f127997a.mo139337h(str);
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: i */
    public void mo139338i() {
        this.f127997a.mo139338i();
    }
}
