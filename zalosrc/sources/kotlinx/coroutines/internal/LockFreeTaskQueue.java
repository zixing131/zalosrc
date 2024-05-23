package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC1246b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class LockFreeTaskQueue<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f107390a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur");
    private volatile Object _cur;

    public LockFreeTaskQueue(boolean z11) {
        this._cur = new LockFreeTaskQueueCore(8, z11);
    }

    /* renamed from: a */
    public final boolean m113664a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107390a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int m113673a = lockFreeTaskQueueCore.m113673a(obj);
            if (m113673a == 0) {
                return true;
            }
            if (m113673a != 1) {
                if (m113673a == 2) {
                    return false;
                }
            } else {
                AbstractC1246b.m5921a(f107390a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m113677i());
            }
        }
    }

    /* renamed from: b */
    public final void m113665b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107390a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.m113674d()) {
                return;
            } else {
                AbstractC1246b.m5921a(f107390a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m113677i());
            }
        }
    }

    /* renamed from: c */
    public final int m113666c() {
        return ((LockFreeTaskQueueCore) f107390a.get(this)).m113675f();
    }

    /* renamed from: d */
    public final Object m113667d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107390a;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            Object m113678j = lockFreeTaskQueueCore.m113678j();
            if (m113678j != LockFreeTaskQueueCore.f107394h) {
                return m113678j;
            }
            AbstractC1246b.m5921a(f107390a, this, lockFreeTaskQueueCore, lockFreeTaskQueueCore.m113677i());
        }
    }
}
