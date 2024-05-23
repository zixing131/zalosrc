package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes7.dex */
public final class MainDispatchersKt {

    /* renamed from: a */
    private static final boolean f107403a = false;

    /* renamed from: a */
    private static final MissingMainCoroutineDispatcher m113685a(Throwable th2, String str) {
        if (f107403a) {
            return new MissingMainCoroutineDispatcher(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        m113688d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ MissingMainCoroutineDispatcher m113686b(Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return m113685a(th2, str);
    }

    /* renamed from: c */
    public static final boolean m113687c(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.mo112861G0() instanceof MissingMainCoroutineDispatcher;
    }

    /* renamed from: d */
    public static final Void m113688d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final MainCoroutineDispatcher m113689e(MainDispatcherFactory mainDispatcherFactory, List list) {
        try {
            return mainDispatcherFactory.mo112884b(list);
        } catch (Throwable th2) {
            return m113685a(th2, mainDispatcherFactory.mo112883a());
        }
    }
}
