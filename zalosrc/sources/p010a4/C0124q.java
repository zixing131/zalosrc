package p010a4;

import java.util.Set;
import p668y3.C30276b;
import p668y3.InterfaceC30279e;
import p668y3.InterfaceC30280f;
import p668y3.InterfaceC30281g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a4.q */
/* loaded from: classes.dex */
public final class C0124q implements InterfaceC30281g {

    /* renamed from: a */
    private final Set f698a;

    /* renamed from: b */
    private final AbstractC0123p f699b;

    /* renamed from: c */
    private final InterfaceC0127t f700c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0124q(Set set, AbstractC0123p abstractC0123p, InterfaceC0127t interfaceC0127t) {
        this.f698a = set;
        this.f699b = abstractC0123p;
        this.f700c = interfaceC0127t;
    }

    @Override // p668y3.InterfaceC30281g
    /* renamed from: a */
    public InterfaceC30280f mo552a(String str, Class cls, C30276b c30276b, InterfaceC30279e interfaceC30279e) {
        if (this.f698a.contains(c30276b)) {
            return new C0126s(this.f699b, str, c30276b, interfaceC30279e, this.f700c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c30276b, this.f698a));
    }
}
