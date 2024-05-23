package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import nn0.AbstractC23904m;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;

/* loaded from: classes7.dex */
public final class CoroutineExceptionHandlerImplKt {

    /* renamed from: a */
    private static final Collection f107354a;

    static {
        InterfaceC23898g m125014c;
        List m125032u;
        m125014c = AbstractC23904m.m125014c(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        m125032u = AbstractC23906o.m125032u(m125014c);
        f107354a = m125032u;
    }

    /* renamed from: a */
    public static final Collection m113600a() {
        return f107354a;
    }

    /* renamed from: b */
    public static final void m113601b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
