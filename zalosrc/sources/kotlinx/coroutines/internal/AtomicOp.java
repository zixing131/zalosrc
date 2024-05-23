package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC1246b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public abstract class AtomicOp<T> extends OpDescriptor {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f107346a = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile Object _consensus = AtomicKt.f107345a;

    /* renamed from: c */
    private final Object m113580c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107346a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AtomicKt.f107345a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @Override // kotlinx.coroutines.internal.OpDescriptor
    /* renamed from: a */
    public final Object mo113581a(Object obj) {
        Object obj2 = f107346a.get(this);
        if (obj2 == AtomicKt.f107345a) {
            obj2 = m113580c(mo112836d(obj));
        }
        mo113582b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo113582b(Object obj, Object obj2);

    /* renamed from: d */
    public abstract Object mo112836d(Object obj);
}
