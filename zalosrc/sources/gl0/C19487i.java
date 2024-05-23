package gl0;

import fn0.AbstractC19074t;
import pj0.InterfaceC24775a;

/* renamed from: gl0.i */
/* loaded from: classes7.dex */
public final class C19487i implements InterfaceC24775a {

    /* renamed from: a */
    private final InterfaceC24775a f96703a;

    public C19487i(InterfaceC24775a interfaceC24775a) {
        this.f96703a = interfaceC24775a;
    }

    @Override // pj0.InterfaceC24775a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSuccess(Void r22) {
        InterfaceC24775a interfaceC24775a = this.f96703a;
        if (interfaceC24775a != null) {
            interfaceC24775a.onSuccess(r22);
        }
    }

    @Override // pj0.InterfaceC24775a
    /* renamed from: c */
    public void mo15338c(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        InterfaceC24775a interfaceC24775a = this.f96703a;
        if (interfaceC24775a != null) {
            interfaceC24775a.mo15338c(exc);
        }
    }
}
