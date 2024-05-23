package wm0;

import kotlin.coroutines.Continuation;
import um0.C27316g;
import um0.InterfaceC27315f;

/* renamed from: wm0.j */
/* loaded from: classes7.dex */
public abstract class AbstractC29102j extends AbstractC29093a {
    public AbstractC29102j(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != C27316g.f128559p) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return C27316g.f128559p;
    }
}
