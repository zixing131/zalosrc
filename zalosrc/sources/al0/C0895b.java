package al0;

import fn0.AbstractC19074t;
import ik0.InterfaceC20603z;
import java.util.concurrent.ExecutorService;

/* renamed from: al0.b */
/* loaded from: classes.dex */
public final class C0895b {

    /* renamed from: a */
    public static final C0895b f3371a = new C0895b();

    /* renamed from: b */
    public static InterfaceC20603z f3372b;

    /* renamed from: c */
    public static ExecutorService f3373c;

    private C0895b() {
    }

    /* renamed from: a */
    public static final ExecutorService m2766a() {
        ExecutorService executorService = f3373c;
        if (executorService != null) {
            return executorService;
        }
        AbstractC19074t.m100223u("executor");
        return null;
    }

    /* renamed from: b */
    public static final InterfaceC20603z m2767b() {
        InterfaceC20603z interfaceC20603z = f3372b;
        if (interfaceC20603z != null) {
            return interfaceC20603z;
        }
        AbstractC19074t.m100223u("prioritizer");
        return null;
    }

    /* renamed from: c */
    public static final void m2768c(ExecutorService executorService) {
        AbstractC19074t.m100208f(executorService, "<set-?>");
        f3373c = executorService;
    }

    /* renamed from: d */
    public static final void m2769d(InterfaceC20603z interfaceC20603z) {
        AbstractC19074t.m100208f(interfaceC20603z, "<set-?>");
        f3372b = interfaceC20603z;
    }
}
