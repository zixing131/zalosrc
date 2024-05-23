package hl0;

import bl0.C2837c;
import el0.C18485e;
import el0.C18486f;
import fl0.C18995f;
import fn0.AbstractC19074t;
import ik0.AbstractC20596s;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import kotlin.coroutines.Continuation;
import vk0.AbstractC28287i;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: hl0.b */
/* loaded from: classes7.dex */
public final class C20089b extends AbstractC28287i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20089b(C20088a c20088a, InterfaceC32222a interfaceC32222a) {
        super(c20088a, interfaceC32222a);
        AbstractC19074t.m100208f(c20088a, "info");
    }

    /* renamed from: h */
    private final Object m104471h(AbstractC20601x abstractC20601x, AbstractC20597t abstractC20597t, Continuation continuation) {
        AbstractC20596s mo107078f = abstractC20597t.mo107078f();
        AbstractC19074t.m100207e(mo107078f, "zinstantDataRequest.rootLayoutRequest()");
        int mo107090i = ((C20088a) m142531b()).m99746a().mo107090i();
        String mo107099r = ((C20088a) m142531b()).m99746a().mo107099r();
        AbstractC19074t.m100207e(mo107099r, "info.zinstantRequest.zinstantDataId()");
        String mo107091j = ((C20088a) m142531b()).m99746a().mo107091j();
        String mo107088f = ((C20088a) m142531b()).m99746a().mo107088f();
        String mo107061h = mo107078f.mo107061h();
        String mo107060g = mo107078f.mo107060g();
        AbstractC19074t.m100207e(mo107060g, "layoutRequest.resourceChecksum()");
        return new C18485e(new C2837c(new C18995f(mo107090i, mo107099r, mo107091j, mo107088f, mo107061h, mo107060g, null, null), ((C20088a) m142531b()).m104468b(), ((C20088a) m142531b()).m104469c(), ((C20088a) m142531b()).m104470d(), mo107078f, abstractC20601x), m142532c()).mo18187a(continuation);
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        AbstractC20597t mo107100s = ((C20088a) m142531b()).m99746a().mo107100s();
        if (mo107100s != null) {
            return m104471h(((C20088a) m142531b()).m99746a(), mo107100s, continuation);
        }
        return new C18486f(null, new C28284f(300, "unknown request"), 1, null);
    }
}
