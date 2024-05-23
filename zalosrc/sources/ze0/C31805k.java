package ze0;

import ve0.C27995d;
import ve0.InterfaceC27993b;
import we0.AbstractC28945a;
import ye0.C30920b;

/* renamed from: ze0.k */
/* loaded from: classes4.dex */
public final class C31805k implements InterfaceC31804j {

    /* renamed from: a */
    private final InterfaceC31808n f145956a;

    /* renamed from: b */
    private final InterfaceC31802h f145957b;

    public C31805k(InterfaceC31808n interfaceC31808n, InterfaceC31802h interfaceC31802h) {
        this.f145956a = interfaceC31808n;
        this.f145957b = interfaceC31802h;
    }

    @Override // ze0.InterfaceC31809o
    /* renamed from: a */
    public C27995d mo152836a(String str) {
        if (AbstractC28945a.m144589b(str)) {
            return ((C31796b) this.f145957b.mo152827a(this.f145956a.mo152838a(str))).m152830c(str);
        }
        throw new IllegalArgumentException(str + " region code is a non-geo entity");
    }

    @Override // ze0.InterfaceC31807m
    /* renamed from: b */
    public C27995d mo152837b(int i11) {
        if (!AbstractC28945a.m144588a(i11)) {
            return ((C31796b) this.f145957b.mo152827a(this.f145956a.mo152838a(Integer.valueOf(i11)))).m152829b(i11);
        }
        throw new IllegalArgumentException(i11 + " calling code belongs to a geo entity");
    }

    public C31805k(InterfaceC31808n interfaceC31808n, InterfaceC27993b interfaceC27993b, C30920b c30920b) {
        this(interfaceC31808n, new C31795a(interfaceC27993b, c30920b, new C31796b()));
    }
}
