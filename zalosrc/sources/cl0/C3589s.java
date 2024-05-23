package cl0;

import bl0.AbstractC2841g;
import bl0.C2837c;
import bl0.C2839e;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: cl0.s */
/* loaded from: classes7.dex */
public final class C3589s extends AbstractC2841g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3589s(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // bl0.AbstractC2841g
    /* renamed from: j */
    public Object mo13721j(Continuation continuation) {
        ZOMDocument m13697b = ((C2837c) m142531b()).m13697b();
        C28284f c28284f = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        if (m13697b != null) {
            return new C2839e(m13697b, c28284f, 2, b13 == true ? 1 : 0);
        }
        return new C2839e(b12 == true ? 1 : 0, new C28284f(400, "mem cache - not found"), 1, b11 == true ? 1 : 0);
    }
}
