package cl0;

import bl0.AbstractC2838d;
import bl0.C2837c;
import bl0.C2839e;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: cl0.c */
/* loaded from: classes7.dex */
public final class C3573c extends AbstractC2838d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3573c(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        if (((C2837c) m142531b()).m13717w()) {
            return m18161h(continuation);
        }
        return m18162i();
    }

    /* renamed from: h */
    public final Object m18161h(Continuation continuation) {
        return new C3593w(new C3591u(null, ((C2837c) m142531b()).m13713s().getPath(), ((C2837c) m142531b()).m13703h(), ((C2837c) m142531b()).m13700e(), ((C2837c) m142531b()).m13701f(), ((C2837c) m142531b()).m13704i(), ((C2837c) m142531b()).m13702g(), ((C2837c) m142531b()).m99746a()), m142532c()).mo18187a(continuation);
    }

    /* renamed from: i */
    public final C2839e m18162i() {
        return new C2839e(null, new C28284f(401, "cache file - not found"), 1, 0 == true ? 1 : 0);
    }
}
