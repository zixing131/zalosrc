package f80;

import fn0.AbstractC19074t;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p348mi.AbstractC23306f;
import qm0.AbstractC25366r;
import wd0.C28928h;

/* renamed from: f80.a */
/* loaded from: classes6.dex */
public final class C18823a {

    /* renamed from: a */
    public static final C18823a f94109a = new C18823a();

    /* renamed from: b */
    private static AtomicBoolean f94110b = new AtomicBoolean(false);

    private C18823a() {
    }

    /* renamed from: a */
    public final void m98806a(String str) {
        List m131496e;
        AbstractC19074t.m100208f(str, "uid");
        if (f94110b.compareAndSet(false, true)) {
            C28928h m120728y0 = AbstractC23306f.m120728y0();
            AbstractC19074t.m100207e(m120728y0, "provideMarkAsReadConversationUseCase(...)");
            m131496e = AbstractC25366r.m131496e(str);
            m120728y0.m101508a(new C28928h.b(m131496e));
            f94110b.set(false);
        }
    }
}
