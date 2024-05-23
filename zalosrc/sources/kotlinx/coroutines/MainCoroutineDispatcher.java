package kotlinx.coroutines;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes7.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        return this;
    }

    /* renamed from: G0 */
    public abstract MainCoroutineDispatcher mo112861G0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H0 */
    public final String m112862H0() {
        MainCoroutineDispatcher mainCoroutineDispatcher;
        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
        if (this == m112681c) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = m112681c.mo112861G0();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this != mainCoroutineDispatcher) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String m112862H0 = m112862H0();
        if (m112862H0 == null) {
            return DebugStringsKt.m112647a(this) + '@' + DebugStringsKt.m112648b(this);
        }
        return m112862H0;
    }
}
