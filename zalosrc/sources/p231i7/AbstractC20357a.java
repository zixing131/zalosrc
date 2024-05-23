package p231i7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i7.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC20357a {
    /* renamed from: a */
    public static /* synthetic */ boolean m106108a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
