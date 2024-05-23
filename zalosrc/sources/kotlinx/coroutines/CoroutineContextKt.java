package kotlinx.coroutines;

import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import um0.C27316g;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;
import wm0.InterfaceC29097e;

/* loaded from: classes.dex */
public final class CoroutineContextKt {
    /* renamed from: a */
    private static final InterfaceC27315f m112612a(InterfaceC27315f interfaceC27315f, InterfaceC27315f interfaceC27315f2, boolean z11) {
        boolean m112614c = m112614c(interfaceC27315f);
        boolean m112614c2 = m112614c(interfaceC27315f2);
        if (!m112614c && !m112614c2) {
            return interfaceC27315f.mo112823d0(interfaceC27315f2);
        }
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = interfaceC27315f2;
        C27316g c27316g = C27316g.f128559p;
        InterfaceC27315f interfaceC27315f3 = (InterfaceC27315f) interfaceC27315f.mo112826h(c27316g, new CoroutineContextKt$foldCopies$folded$1(c19059j0, z11));
        if (m112614c2) {
            c19059j0.f94941p = ((InterfaceC27315f) c19059j0.f94941p).mo112826h(c27316g, CoroutineContextKt$foldCopies$1.f105831q);
        }
        return interfaceC27315f3.mo112823d0((InterfaceC27315f) c19059j0.f94941p);
    }

    /* renamed from: b */
    public static final String m112613b(InterfaceC27315f interfaceC27315f) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m112614c(InterfaceC27315f interfaceC27315f) {
        return ((Boolean) interfaceC27315f.mo112826h(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f105834q)).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC27315f m112615d(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f) {
        InterfaceC27315f m112612a = m112612a(coroutineScope.mo9207O(), interfaceC27315f, true);
        if (m112612a != Dispatchers.m112679a() && m112612a.mo112624d(InterfaceC27313d.f128556o) == null) {
            return m112612a.mo112823d0(Dispatchers.m112679a());
        }
        return m112612a;
    }

    /* renamed from: e */
    public static final InterfaceC27315f m112616e(InterfaceC27315f interfaceC27315f, InterfaceC27315f interfaceC27315f2) {
        if (!m112614c(interfaceC27315f2)) {
            return interfaceC27315f.mo112823d0(interfaceC27315f2);
        }
        return m112612a(interfaceC27315f, interfaceC27315f2, false);
    }

    /* renamed from: f */
    public static final UndispatchedCoroutine m112617f(InterfaceC29097e interfaceC29097e) {
        while (!(interfaceC29097e instanceof DispatchedCoroutine) && (interfaceC29097e = interfaceC29097e.mo112582e()) != null) {
            if (interfaceC29097e instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) interfaceC29097e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final UndispatchedCoroutine m112618g(Continuation continuation, InterfaceC27315f interfaceC27315f, Object obj) {
        if (!(continuation instanceof InterfaceC29097e) || interfaceC27315f.mo112624d(UndispatchedMarker.f105958p) == null) {
            return null;
        }
        UndispatchedCoroutine m112617f = m112617f((InterfaceC29097e) continuation);
        if (m112617f != null) {
            m112617f.m112881u1(interfaceC27315f, obj);
        }
        return m112617f;
    }
}
