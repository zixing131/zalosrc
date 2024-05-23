package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlinx.coroutines.ThreadContextElement;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class ThreadContextKt {

    /* renamed from: a */
    public static final Symbol f107422a = new Symbol("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final InterfaceC18509p f107423b = ThreadContextKt$countAll$1.f107426q;

    /* renamed from: c */
    private static final InterfaceC18509p f107424c = ThreadContextKt$findOne$1.f107427q;

    /* renamed from: d */
    private static final InterfaceC18509p f107425d = ThreadContextKt$updateState$1.f107428q;

    /* renamed from: a */
    public static final void m113729a(InterfaceC27315f interfaceC27315f, Object obj) {
        if (obj == f107422a) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).m113750b(interfaceC27315f);
            return;
        }
        Object mo112826h = interfaceC27315f.mo112826h(null, f107424c);
        AbstractC19074t.m100206d(mo112826h, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((ThreadContextElement) mo112826h).mo112633Q(interfaceC27315f, obj);
    }

    /* renamed from: b */
    public static final Object m113730b(InterfaceC27315f interfaceC27315f) {
        Object mo112826h = interfaceC27315f.mo112826h(0, f107423b);
        AbstractC19074t.m100205c(mo112826h);
        return mo112826h;
    }

    /* renamed from: c */
    public static final Object m113731c(InterfaceC27315f interfaceC27315f, Object obj) {
        if (obj == null) {
            obj = m113730b(interfaceC27315f);
        }
        if (obj == 0) {
            return f107422a;
        }
        if (obj instanceof Integer) {
            return interfaceC27315f.mo112826h(new ThreadState(interfaceC27315f, ((Number) obj).intValue()), f107425d);
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement) obj).mo112634Z(interfaceC27315f);
    }
}
