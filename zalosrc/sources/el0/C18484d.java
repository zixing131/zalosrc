package el0;

import bl0.C2837c;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.AbstractC28287i;
import zk0.InterfaceC32222a;

/* renamed from: el0.d */
/* loaded from: classes7.dex */
public final class C18484d extends AbstractC28287i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18484d(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        if (((C2837c) m142531b()).m13717w()) {
            return new C18486f(((C2837c) m142531b()).m13713s(), null, 2, null);
        }
        return m97842h(continuation);
    }

    /* renamed from: h */
    public final Object m97842h(Continuation continuation) {
        return new C18483c(new C18481a(((C2837c) m142531b()).m13703h().m99734d(), ((C2837c) m142531b()).m13703h().m99737g(), ((C2837c) m142531b()).m13703h().m99736f(), ((C2837c) m142531b()).m13713s(), ((C2837c) m142531b()).m13704i().m99742d()), m142532c()).mo18187a(continuation);
    }
}
