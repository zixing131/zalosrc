package p715zg;

import com.zing.zalo.SensitiveData;
import fn0.AbstractC19074t;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;
import yf0.C30955t;

/* renamed from: zg.c */
/* loaded from: classes3.dex */
public final class C31829c implements InterfaceC28970f {

    /* renamed from: a */
    private final String f146059a;

    /* renamed from: b */
    private final String f146060b;

    /* renamed from: c */
    private final InterfaceC25792a.c f146061c;

    /* renamed from: d */
    private final InterfaceC27218a f146062d;

    /* renamed from: e */
    private final C30955t f146063e;

    public C31829c(String str, String str2, InterfaceC25792a.c cVar, InterfaceC27218a interfaceC27218a, C30955t c30955t) {
        AbstractC19074t.m100208f(c30955t, "mpWifiManager");
        this.f146059a = str;
        this.f146060b = str2;
        this.f146061c = cVar;
        this.f146062d = interfaceC27218a;
        this.f146063e = c30955t;
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    /* renamed from: b */
    public final SensitiveData m152915b() {
        return new SensitiveData("wifi_join_from_action_common", "action_common", null, 4, null);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        this.f146063e.m150566j(this.f146062d, AbstractC25384a.m131571b(this.f146059a), this.f146060b, this.f146061c, m152915b());
    }
}
