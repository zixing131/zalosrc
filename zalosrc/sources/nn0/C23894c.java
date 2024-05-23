package nn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.Iterator;

/* renamed from: nn0.c */
/* loaded from: classes7.dex */
public final class C23894c implements InterfaceC23898g {

    /* renamed from: a */
    private final InterfaceC23898g f115498a;

    /* renamed from: b */
    private final InterfaceC18505l f115499b;

    public C23894c(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "keySelector");
        this.f115498a = interfaceC23898g;
        this.f115499b = interfaceC18505l;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new C23893b(this.f115498a.iterator(), this.f115499b);
    }
}
