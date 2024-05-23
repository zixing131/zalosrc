package kotlinx.coroutines;

import fn0.AbstractC19060k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class CompletedExceptionally {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f105827b = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f105828a;

    public CompletedExceptionally(Throwable th2, boolean z11) {
        this.f105828a = th2;
        this._handled = z11 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m112604a() {
        if (f105827b.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m112605b() {
        return f105827b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return DebugStringsKt.m112647a(this) + '[' + this.f105828a + ']';
    }

    public /* synthetic */ CompletedExceptionally(Throwable th2, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this(th2, (i11 & 2) != 0 ? false : z11);
    }
}
