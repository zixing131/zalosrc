package kl0;

import fn0.AbstractC19074t;
import jl0.AbstractC21286b;
import jl0.C21285a;
import jl0.C21287c;
import kotlin.coroutines.Continuation;
import lk0.C22504b;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: kl0.a */
/* loaded from: classes7.dex */
public final class C21759a extends AbstractC21286b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21759a(C21285a c21285a, InterfaceC32222a interfaceC32222a) {
        super(c21285a, interfaceC32222a);
        AbstractC19074t.m100208f(c21285a, "info");
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        C22504b m112249h = m112249h();
        if (m112249h != null) {
            return new C21287c(m112249h, null, 2, null);
        }
        return new C21287c(null, new C28284f(300, "zinstantdata cache - not found"), 1, null);
    }

    /* renamed from: h */
    public final C22504b m112249h() {
        C21285a c21285a = (C21285a) m142531b();
        C22504b m116382f = c21285a.m110242d().m99741c().m116382f(c21285a.m110242d().m99740b().m99728a(c21285a.m110243e()));
        if (m116382f == null) {
            return null;
        }
        AbstractC19074t.m100207e(m116382f, "this.utility.repository.…ByKey(key) ?: return null");
        if (m116382f.mo116352b(((C21285a) m142531b()).m99746a().mo107089h())) {
            if (((C21285a) m142531b()).m110240b()) {
                m142533d("zinstantdata cache - use expired");
                return m116382f;
            }
            m142533d("zinstantdata cache - expired");
            return null;
        }
        return m116382f;
    }
}
