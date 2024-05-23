package kotlinx.coroutines;

import en0.InterfaceC18505l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class ThreadState implements InterfaceC18505l {

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f105945s = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state");
    private volatile int _state;

    /* renamed from: p */
    private final Job f105946p;

    /* renamed from: q */
    private final Thread f105947q = Thread.currentThread();

    /* renamed from: r */
    private DisposableHandle f105948r;

    public ThreadState(Job job) {
        this.f105946p = job;
    }

    /* renamed from: b */
    private final Void m112872b(int i11) {
        throw new IllegalStateException(("Illegal state " + i11).toString());
    }

    /* renamed from: a */
    public final void m112873a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105945s;
        while (true) {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m112872b(i11);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f105945s.compareAndSet(this, i11, 1)) {
                DisposableHandle disposableHandle = this.f105948r;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public void m112874c(Throwable th2) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f105945s;
        do {
            i11 = atomicIntegerFieldUpdater2.get(this);
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    m112872b(i11);
                    throw new KotlinNothingValueException();
                }
                return;
            }
            atomicIntegerFieldUpdater = f105945s;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 2));
        this.f105947q.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void m112875d() {
        int i11;
        this.f105948r = this.f105946p.mo112738w0(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105945s;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2 && i11 != 3) {
                    m112872b(i11);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f105945s.compareAndSet(this, i11, 0));
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m112874c((Throwable) obj);
        return C24848g0.f119245a;
    }
}
