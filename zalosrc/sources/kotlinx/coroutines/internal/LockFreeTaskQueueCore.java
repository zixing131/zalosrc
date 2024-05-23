package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC1246b;
import fn0.AbstractC19060k;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class LockFreeTaskQueueCore<E> {

    /* renamed from: e */
    public static final Companion f107391e = new Companion(null);

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f107392f = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");

    /* renamed from: g */
    private static final AtomicLongFieldUpdater f107393g = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");

    /* renamed from: h */
    public static final Symbol f107394h = new Symbol("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    private final int f107395a;

    /* renamed from: b */
    private final boolean f107396b;

    /* renamed from: c */
    private final int f107397c;

    /* renamed from: d */
    private final AtomicReferenceArray f107398d;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m113679a(long j11) {
            return (j11 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m113680b(long j11, int i11) {
            return m113682d(j11, 1073741823L) | i11;
        }

        /* renamed from: c */
        public final long m113681c(long j11, int i11) {
            return m113682d(j11, 1152921503533105152L) | (i11 << 30);
        }

        /* renamed from: d */
        public final long m113682d(long j11, long j12) {
            return j11 & (~j12);
        }
    }

    /* loaded from: classes.dex */
    public static final class Placeholder {

        /* renamed from: a */
        public final int f107399a;

        public Placeholder(int i11) {
            this.f107399a = i11;
        }
    }

    public LockFreeTaskQueueCore(int i11, boolean z11) {
        this.f107395a = i11;
        this.f107396b = z11;
        int i12 = i11 - 1;
        this.f107397c = i12;
        this.f107398d = new AtomicReferenceArray(i11);
        if (i12 <= 1073741823) {
            if ((i11 & i12) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final LockFreeTaskQueueCore m113668b(long j11) {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(this.f107395a * 2, this.f107396b);
        int i11 = (int) (1073741823 & j11);
        int i12 = (int) ((1152921503533105152L & j11) >> 30);
        while (true) {
            int i13 = this.f107397c;
            if ((i11 & i13) != (i12 & i13)) {
                Object obj = this.f107398d.get(i13 & i11);
                if (obj == null) {
                    obj = new Placeholder(i11);
                }
                lockFreeTaskQueueCore.f107398d.set(lockFreeTaskQueueCore.f107397c & i11, obj);
                i11++;
            } else {
                f107393g.set(lockFreeTaskQueueCore, f107391e.m113682d(j11, 1152921504606846976L));
                return lockFreeTaskQueueCore;
            }
        }
    }

    /* renamed from: c */
    private final LockFreeTaskQueueCore m113669c(long j11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107392f;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AbstractC1246b.m5921a(f107392f, this, null, m113668b(j11));
        }
    }

    /* renamed from: e */
    private final LockFreeTaskQueueCore m113670e(int i11, Object obj) {
        Object obj2 = this.f107398d.get(this.f107397c & i11);
        if ((obj2 instanceof Placeholder) && ((Placeholder) obj2).f107399a == i11) {
            this.f107398d.set(i11 & this.f107397c, obj);
            return this;
        }
        return null;
    }

    /* renamed from: h */
    private final long m113671h() {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107393g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 1152921504606846976L) != 0) {
                return j11;
            }
            j12 = j11 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j12));
        return j12;
    }

    /* renamed from: k */
    private final LockFreeTaskQueueCore m113672k(int i11, int i12) {
        long j11;
        int i13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107393g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            i13 = (int) (1073741823 & j11);
            if ((1152921504606846976L & j11) != 0) {
                return m113677i();
            }
        } while (!f107393g.compareAndSet(this, j11, f107391e.m113680b(j11, i12)));
        this.f107398d.set(this.f107397c & i13, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:            return 1;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m113673a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107393g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j11) != 0) {
                return f107391e.m113679a(j11);
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f107397c;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            if (!this.f107396b && this.f107398d.get(i12 & i13) != null) {
                int i14 = this.f107395a;
                if (i14 < 1024 || ((i12 - i11) & 1073741823) > (i14 >> 1)) {
                    break;
                }
            } else if (f107393g.compareAndSet(this, j11, f107391e.m113681c(j11, (i12 + 1) & 1073741823))) {
                this.f107398d.set(i12 & i13, obj);
                LockFreeTaskQueueCore lockFreeTaskQueueCore = this;
                while ((f107393g.get(lockFreeTaskQueueCore) & 1152921504606846976L) != 0 && (lockFreeTaskQueueCore = lockFreeTaskQueueCore.m113677i().m113670e(i12, obj)) != null) {
                }
                return 0;
            }
        }
    }

    /* renamed from: d */
    public final boolean m113674d() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107393g;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if ((j11 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j11) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, j11 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m113675f() {
        long j11 = f107393g.get(this);
        return 1073741823 & (((int) ((j11 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j11)));
    }

    /* renamed from: g */
    public final boolean m113676g() {
        long j11 = f107393g.get(this);
        if (((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final LockFreeTaskQueueCore m113677i() {
        return m113669c(m113671h());
    }

    /* renamed from: j */
    public final Object m113678j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f107393g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j11) != 0) {
                return f107394h;
            }
            int i11 = (int) (1073741823 & j11);
            int i12 = (int) ((1152921503533105152L & j11) >> 30);
            int i13 = this.f107397c;
            if ((i12 & i13) == (i11 & i13)) {
                return null;
            }
            Object obj = this.f107398d.get(i13 & i11);
            if (obj == null) {
                if (this.f107396b) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i14 = (i11 + 1) & 1073741823;
                if (f107393g.compareAndSet(this, j11, f107391e.m113680b(j11, i14))) {
                    this.f107398d.set(this.f107397c & i11, null);
                    return obj;
                }
                if (this.f107396b) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = this;
                    do {
                        lockFreeTaskQueueCore = lockFreeTaskQueueCore.m113672k(i11, i14);
                    } while (lockFreeTaskQueueCore != null);
                    return obj;
                }
            }
        }
    }
}
