package cl0;

import bl0.AbstractC2841g;
import bl0.C2837c;
import bl0.C2839e;
import bl0.C2842h;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import ik0.InterfaceC20578a0;
import kotlin.coroutines.Continuation;
import nk0.C23855s0;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: cl0.l */
/* loaded from: classes7.dex */
public final class C3582l extends AbstractC2841g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3582l(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // bl0.AbstractC2841g
    /* renamed from: j */
    public Object mo13721j(Continuation continuation) {
        InterfaceC20578a0 m13699d = ((C2837c) m142531b()).m13699d();
        C28284f c28284f = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        if (m13699d instanceof ZOMDocument) {
            return new C2839e((ZOMDocument) m13699d, c28284f, 2, b13 == true ? 1 : 0);
        }
        if (m13699d instanceof C23855s0) {
            C23855s0 c23855s0 = (C23855s0) m13699d;
            return new C2842h(c23855s0, c23855s0.f115178b, null, 4, null);
        }
        return new C2839e(b12 == true ? 1 : 0, new C28284f(400, "current ZinstantTree - not found"), 1, b11 == true ? 1 : 0);
    }
}
