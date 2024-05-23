package um0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;

/* renamed from: um0.d */
/* loaded from: classes.dex */
public interface InterfaceC27313d extends InterfaceC27315f.b {

    /* renamed from: o */
    public static final b f128556o = b.f128557p;

    /* renamed from: um0.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC27315f.b m139847a(InterfaceC27313d interfaceC27313d, InterfaceC27315f.c cVar) {
            AbstractC19074t.m100208f(cVar, "key");
            if (cVar instanceof AbstractC27311b) {
                AbstractC27311b abstractC27311b = (AbstractC27311b) cVar;
                if (!abstractC27311b.m139840a(interfaceC27313d.getKey())) {
                    return null;
                }
                InterfaceC27315f.b m139841b = abstractC27311b.m139841b(interfaceC27313d);
                if (!(m139841b instanceof InterfaceC27315f.b)) {
                    return null;
                }
                return m139841b;
            }
            if (InterfaceC27313d.f128556o != cVar) {
                return null;
            }
            AbstractC19074t.m100206d(interfaceC27313d, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return interfaceC27313d;
        }

        /* renamed from: b */
        public static InterfaceC27315f m139848b(InterfaceC27313d interfaceC27313d, InterfaceC27315f.c cVar) {
            AbstractC19074t.m100208f(cVar, "key");
            if (cVar instanceof AbstractC27311b) {
                AbstractC27311b abstractC27311b = (AbstractC27311b) cVar;
                if (abstractC27311b.m139840a(interfaceC27313d.getKey()) && abstractC27311b.m139841b(interfaceC27313d) != null) {
                    return C27316g.f128559p;
                }
                return interfaceC27313d;
            }
            if (InterfaceC27313d.f128556o == cVar) {
                return C27316g.f128559p;
            }
            return interfaceC27313d;
        }
    }

    /* renamed from: um0.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC27315f.c {

        /* renamed from: p */
        static final /* synthetic */ b f128557p = new b();

        private b() {
        }
    }

    /* renamed from: o */
    void mo112626o(Continuation continuation);

    /* renamed from: s */
    Continuation mo112627s(Continuation continuation);
}
