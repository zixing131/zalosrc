package nn0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import vm0.AbstractC28297c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nn0.k */
/* loaded from: classes.dex */
public abstract class AbstractC23902k {

    /* renamed from: nn0.k$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC23898g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f115517a;

        public a(InterfaceC18509p interfaceC18509p) {
            this.f115517a = interfaceC18509p;
        }

        @Override // nn0.InterfaceC23898g
        public Iterator iterator() {
            Iterator m125012a;
            m125012a = AbstractC23902k.m125012a(this.f115517a);
            return m125012a;
        }
    }

    /* renamed from: a */
    public static Iterator m125012a(InterfaceC18509p interfaceC18509p) {
        Continuation m142574a;
        AbstractC19074t.m100208f(interfaceC18509p, "block");
        C23899h c23899h = new C23899h();
        m142574a = AbstractC28297c.m142574a(interfaceC18509p, c23899h, c23899h);
        c23899h.m124994l(m142574a);
        return c23899h;
    }

    /* renamed from: b */
    public static InterfaceC23898g m125013b(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "block");
        return new a(interfaceC18509p);
    }
}
