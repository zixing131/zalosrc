package wm0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;

/* renamed from: wm0.d */
/* loaded from: classes.dex */
public abstract class AbstractC29096d extends AbstractC29093a {

    /* renamed from: q */
    private final InterfaceC27315f f134918q;

    /* renamed from: r */
    private transient Continuation f134919r;

    public AbstractC29096d(Continuation continuation, InterfaceC27315f interfaceC27315f) {
        super(continuation);
        this.f134918q = interfaceC27315f;
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        InterfaceC27315f interfaceC27315f = this.f134918q;
        AbstractC19074t.m100205c(interfaceC27315f);
        return interfaceC27315f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wm0.AbstractC29093a
    /* renamed from: p */
    public void mo113558p() {
        Continuation continuation = this.f134919r;
        if (continuation != null && continuation != this) {
            InterfaceC27315f.b mo112624d = getContext().mo112624d(InterfaceC27313d.f128556o);
            AbstractC19074t.m100205c(mo112624d);
            ((InterfaceC27313d) mo112624d).mo112626o(continuation);
        }
        this.f134919r = C29095c.f134917p;
    }

    /* renamed from: q */
    public final Continuation m145343q() {
        Continuation continuation = this.f134919r;
        if (continuation == null) {
            InterfaceC27313d interfaceC27313d = (InterfaceC27313d) getContext().mo112624d(InterfaceC27313d.f128556o);
            if (interfaceC27313d == null || (continuation = interfaceC27313d.mo112627s(this)) == null) {
                continuation = this;
            }
            this.f134919r = continuation;
        }
        return continuation;
    }

    public AbstractC29096d(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
