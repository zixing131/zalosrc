package p543uc;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import gd.C19395d;
import p158fd.C18880d;
import p264jd.C21222a;
import p264jd.C21223b;
import p264jd.C21224c;
import p348mi.AbstractC23306f;
import p640xc.C29574a;

/* renamed from: uc.h */
/* loaded from: classes3.dex */
public final class C27230h {

    /* renamed from: a */
    public static final C27230h f127996a = new C27230h();

    private C27230h() {
    }

    /* renamed from: b */
    public static final InterfaceC27227e m139346b(String str) {
        InterfaceC27227e m146972c;
        AbstractC19074t.m100208f(str, "token");
        if (AbstractC23306f.m120676j().m128426v().m128456o() == 1) {
            if (!AbstractC0924m0.m3598Ya()) {
                AbstractC0924m0.m3113Hi(true);
                AbstractC23306f.m120688m().m132987F(true);
            }
            m146972c = new C18880d(C29574a.Companion.m146972c());
        } else {
            if (AbstractC0924m0.m3598Ya()) {
                AbstractC0924m0.m3113Hi(false);
            }
            m146972c = C29574a.Companion.m146972c();
        }
        m146972c.mo139337h(str);
        return m146972c;
    }

    /* renamed from: a */
    public final C21222a m139347a() {
        return new C21222a(new C21224c(), new C19395d(), new C21223b());
    }
}
