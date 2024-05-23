package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class DownstreamExceptionContext implements InterfaceC27315f {

    /* renamed from: p */
    public final Throwable f107303p;

    /* renamed from: q */
    private final /* synthetic */ InterfaceC27315f f107304q;

    public DownstreamExceptionContext(Throwable th2, InterfaceC27315f interfaceC27315f) {
        this.f107303p = th2;
        this.f107304q = interfaceC27315f;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        return this.f107304q.mo112624d(cVar);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return this.f107304q.mo112823d0(interfaceC27315f);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        return this.f107304q.mo112826h(obj, interfaceC18509p);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        return this.f107304q.mo112625i(cVar);
    }
}
