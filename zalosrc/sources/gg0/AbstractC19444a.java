package gg0;

import android.os.Handler;
import android.os.Looper;
import fn0.AbstractC19074t;

/* renamed from: gg0.a */
/* loaded from: classes.dex */
public abstract class AbstractC19444a {

    /* renamed from: a */
    private static final Handler f96525a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static final boolean m101693a() {
        return AbstractC19074t.m100204b(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: b */
    public static final void m101694b(Runnable runnable, long j11) {
        AbstractC19074t.m100208f(runnable, "r");
        f96525a.postDelayed(runnable, j11);
    }

    /* renamed from: c */
    public static final void m101695c(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "r");
        f96525a.post(runnable);
    }

    /* renamed from: d */
    public static final void m101696d(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "r");
        f96525a.removeCallbacks(runnable);
    }

    /* renamed from: e */
    public static final void m101697e(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "runnable");
        if (m101693a()) {
            runnable.run();
        } else {
            m101695c(runnable);
        }
    }
}
