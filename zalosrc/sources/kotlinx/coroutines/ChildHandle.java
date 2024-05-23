package kotlinx.coroutines;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface ChildHandle extends DisposableHandle {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: d */
    boolean mo112593d(Throwable th2);

    Job getParent();
}
