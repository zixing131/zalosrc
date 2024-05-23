package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public final class LimitedDispatcherKt {
    /* renamed from: a */
    public static final void m113645a(int i11) {
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i11).toString());
    }
}
