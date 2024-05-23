package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface SharedFlow<T> extends Flow<T> {
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    Object mo97893a(FlowCollector flowCollector, Continuation continuation);
}
