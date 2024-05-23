package p001a.p005d;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.d.b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0007b {
    /* renamed from: a */
    public static /* synthetic */ boolean m4a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
