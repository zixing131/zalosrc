package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    Object mo12109b(Object obj, Continuation continuation);

    /* renamed from: d */
    boolean mo113433d(Object obj);

    /* renamed from: h */
    StateFlow m113434h();

    /* renamed from: l */
    void mo113435l();
}
