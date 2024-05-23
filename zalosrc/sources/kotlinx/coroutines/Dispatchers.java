package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class Dispatchers {

    /* renamed from: a */
    public static final Dispatchers f105862a = new Dispatchers();

    /* renamed from: b */
    private static final CoroutineDispatcher f105863b = DefaultScheduler.f107472x;

    /* renamed from: c */
    private static final CoroutineDispatcher f105864c = Unconfined.f105956r;

    /* renamed from: d */
    private static final CoroutineDispatcher f105865d = DefaultIoScheduler.f107470s;

    private Dispatchers() {
    }

    /* renamed from: a */
    public static final CoroutineDispatcher m112679a() {
        return f105863b;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m112680b() {
        return f105865d;
    }

    /* renamed from: c */
    public static final MainCoroutineDispatcher m112681c() {
        return MainDispatcherLoader.f107402c;
    }
}
