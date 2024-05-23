package p715zg;

import fn0.AbstractC19074t;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import p608wg.InterfaceC28970f;

/* renamed from: zg.b */
/* loaded from: classes3.dex */
public final class C31828b implements InterfaceC28970f {

    /* renamed from: a */
    private final String f146055a;

    /* renamed from: b */
    private final String f146056b;

    /* renamed from: c */
    private final String f146057c;

    /* renamed from: d */
    private final InterfaceC25792a.b f146058d;

    public C31828b(String str, String str2, String str3, InterfaceC25792a.b bVar) {
        AbstractC19074t.m100208f(str, "strAction");
        this.f146055a = str;
        this.f146056b = str2;
        this.f146057c = str3;
        this.f146058d = bVar;
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        InterfaceC25792a.b bVar = this.f146058d;
        if (bVar != null) {
            bVar.mo40738c(this.f146055a, AbstractC25384a.m131571b(this.f146056b), this.f146057c);
        }
    }
}
