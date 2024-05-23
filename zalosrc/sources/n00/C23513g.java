package n00;

import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ga0.C19322f1;

/* renamed from: n00.g */
/* loaded from: classes4.dex */
public final class C23513g extends AbstractC23514h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23513g(InterfaceC18319c interfaceC18319c, String str) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        C19322f1.f95950a.m101144W();
        if (isCancelled()) {
            return;
        }
        new C23512f(this, m123420l()).m101441i();
    }
}
