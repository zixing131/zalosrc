package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class HashedWeakRef<T> extends WeakReference<T> {

    /* renamed from: a */
    public final int f106398a;

    public HashedWeakRef(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        int i11;
        if (obj != null) {
            i11 = obj.hashCode();
        } else {
            i11 = 0;
        }
        this.f106398a = i11;
    }
}
