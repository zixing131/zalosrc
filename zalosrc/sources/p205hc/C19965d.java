package p205hc;

import androidx.lifecycle.InterfaceC1764d0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* renamed from: hc.d */
/* loaded from: classes3.dex */
public final class C19965d implements InterfaceC1764d0 {

    /* renamed from: p */
    private final InterfaceC18505l f98271p;

    public C19965d(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onEventUnhandledContent");
        this.f98271p = interfaceC18505l;
    }

    @Override // androidx.lifecycle.InterfaceC1764d0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo8524qp(C19964c c19964c) {
        Object m103749a;
        if (c19964c != null && (m103749a = c19964c.m103749a()) != null) {
            this.f98271p.mo205i9(m103749a);
        }
    }
}
