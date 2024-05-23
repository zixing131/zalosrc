package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes.dex */
public final class DefaultExecutorKt {

    /* renamed from: a */
    private static final boolean f105855a = SystemPropsKt.m113718f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final Delay f105856b = m112660b();

    /* renamed from: a */
    public static final Delay m112659a() {
        return f105856b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final Delay m112660b() {
        if (!f105855a) {
            return DefaultExecutor.f105853x;
        }
        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
        if (!MainDispatchersKt.m113687c(m112681c) && (m112681c instanceof Delay)) {
            return (Delay) m112681c;
        }
        return DefaultExecutor.f105853x;
    }
}
