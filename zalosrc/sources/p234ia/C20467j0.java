package p234ia;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ia.j0 */
/* loaded from: classes3.dex */
final class C20467j0 implements Closeable {

    /* renamed from: p */
    final /* synthetic */ C20471n f100672p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C20467j0(C20471n c20471n, AbstractC20465i0 abstractC20465i0) {
        AtomicReference atomicReference;
        boolean z11;
        this.f100672p = c20471n;
        atomicReference = c20471n.f100705d;
        if (((Thread) atomicReference.getAndSet(Thread.currentThread())) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f100672p.f100705d;
        atomicReference.set(null);
        this.f100672p.m106519d();
    }
}
