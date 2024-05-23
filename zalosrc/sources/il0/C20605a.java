package il0;

import fl0.AbstractC18997h;
import fn0.AbstractC19074t;
import ik0.InterfaceC20603z;
import vk0.InterfaceC28285g;

/* renamed from: il0.a */
/* loaded from: classes7.dex */
public final class C20605a {

    /* renamed from: a */
    private final InterfaceC20603z f101347a;

    public C20605a(InterfaceC20603z interfaceC20603z) {
        AbstractC19074t.m100208f(interfaceC20603z, "prioritizer");
        this.f101347a = interfaceC20603z;
    }

    /* renamed from: a */
    public C20606b m107241a(InterfaceC28285g interfaceC28285g) {
        int i11;
        AbstractC19074t.m100208f(interfaceC28285g, "info");
        if (interfaceC28285g instanceof AbstractC18997h) {
            i11 = this.f101347a.mo91788a(((AbstractC18997h) interfaceC28285g).m99746a());
        } else {
            i11 = 0;
        }
        return new C20606b(i11);
    }
}
