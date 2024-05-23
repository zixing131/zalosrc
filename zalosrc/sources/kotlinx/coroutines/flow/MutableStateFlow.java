package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public interface MutableStateFlow<T> extends StateFlow<T>, MutableSharedFlow<T> {
    @Override // kotlinx.coroutines.flow.StateFlow
    Object getValue();

    /* renamed from: i */
    boolean mo113436i(Object obj, Object obj2);

    void setValue(Object obj);
}
