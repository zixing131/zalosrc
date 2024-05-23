package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.MainCoroutineDispatcher;
import nn0.AbstractC23904m;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;

/* loaded from: classes7.dex */
public final class MainDispatcherLoader {

    /* renamed from: a */
    public static final MainDispatcherLoader f107400a;

    /* renamed from: b */
    private static final boolean f107401b = false;

    /* renamed from: c */
    public static final MainCoroutineDispatcher f107402c;

    static {
        MainDispatcherLoader mainDispatcherLoader = new MainDispatcherLoader();
        f107400a = mainDispatcherLoader;
        SystemPropsKt.m113718f("kotlinx.coroutines.fast.service.loader", true);
        f107402c = mainDispatcherLoader.m113684a();
    }

    private MainDispatcherLoader() {
    }

    /* renamed from: a */
    private final MainCoroutineDispatcher m113684a() {
        InterfaceC23898g m125014c;
        List m125032u;
        Object next;
        MainCoroutineDispatcher m113689e;
        try {
            if (!f107401b) {
                m125014c = AbstractC23904m.m125014c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                m125032u = AbstractC23906o.m125032u(m125014c);
            } else {
                m125032u = FastServiceLoader.f107372a.m113631c();
            }
            Iterator it = m125032u.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int mo112885c = ((MainDispatcherFactory) next).mo112885c();
                    do {
                        Object next2 = it.next();
                        int mo112885c2 = ((MainDispatcherFactory) next2).mo112885c();
                        if (mo112885c < mo112885c2) {
                            next = next2;
                            mo112885c = mo112885c2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory == null || (m113689e = MainDispatchersKt.m113689e(mainDispatcherFactory, m125032u)) == null) {
                return MainDispatchersKt.m113686b(null, null, 3, null);
            }
            return m113689e;
        } catch (Throwable th2) {
            return MainDispatchersKt.m113686b(th2, null, 2, null);
        }
    }
}
