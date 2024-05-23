package kotlinx.coroutines;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* renamed from: p */
    public static final NonDisposableHandle f105937p = new NonDisposableHandle();

    private NonDisposableHandle() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: d */
    public boolean mo112593d(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
