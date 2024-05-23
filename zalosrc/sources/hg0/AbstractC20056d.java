package hg0;

import fn0.AbstractC19074t;
import java.util.concurrent.ExecutorService;

/* renamed from: hg0.d */
/* loaded from: classes.dex */
public abstract class AbstractC20056d {
    /* renamed from: a */
    public void m104178a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "command");
        mo104177b().execute(runnable);
    }

    /* renamed from: b */
    protected abstract ExecutorService mo104177b();
}
