package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlinx.coroutines.ThreadContextElement;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {

    /* renamed from: p */
    private final Object f107429p;

    /* renamed from: q */
    private final ThreadLocal f107430q;

    /* renamed from: r */
    private final InterfaceC27315f.c f107431r;

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: Q */
    public void mo112633Q(InterfaceC27315f interfaceC27315f, Object obj) {
        this.f107430q.set(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: Z */
    public Object mo112634Z(InterfaceC27315f interfaceC27315f) {
        Object obj = this.f107430q.get();
        this.f107430q.set(this.f107429p);
        return obj;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        if (AbstractC19074t.m100204b(getKey(), cVar)) {
            AbstractC19074t.m100206d(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return ThreadContextElement.DefaultImpls.m112867b(this, interfaceC27315f);
    }

    @Override // um0.InterfaceC27315f.b
    public InterfaceC27315f.c getKey() {
        return this.f107431r;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        return ThreadContextElement.DefaultImpls.m112866a(this, obj, interfaceC18509p);
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        if (AbstractC19074t.m100204b(getKey(), cVar)) {
            return C27316g.f128559p;
        }
        return this;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f107429p + ", threadLocal = " + this.f107430q + ')';
    }
}
