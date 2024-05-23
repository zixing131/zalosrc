package p644xg;

import fn0.AbstractC19074t;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p608wg.InterfaceC28970f;

/* renamed from: xg.a */
/* loaded from: classes3.dex */
public final class C29622a implements InterfaceC28970f {

    /* renamed from: a */
    private final InterfaceC25792a.c f136790a;

    /* renamed from: b */
    private final String f136791b;

    /* renamed from: c */
    private final String f136792c;

    /* renamed from: d */
    private final int f136793d;

    public C29622a(InterfaceC25792a.c cVar, String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "action");
        this.f136790a = cVar;
        this.f136791b = str;
        this.f136792c = str2;
        this.f136793d = i11;
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        InterfaceC25792a.c cVar;
        InterfaceC25792a.c cVar2;
        String str = this.f136791b;
        if (AbstractC19074t.m100204b(str, "action.iap.requestpayment")) {
            if (this.f136793d == 2 && AbstractC25384a.m131571b(this.f136792c) != null && (cVar2 = this.f136790a) != null) {
                cVar2.mo39930a(mo2446a(this.f136791b), this.f136792c);
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(str, "action.iap.isSupported") && (cVar = this.f136790a) != null) {
            InterfaceC25792a.c.a.m132932a(cVar, mo2446a(this.f136791b), null, 2, null);
        }
    }
}
