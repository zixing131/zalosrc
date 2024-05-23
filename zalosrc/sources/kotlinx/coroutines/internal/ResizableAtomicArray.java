package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ln0.AbstractC22543l;

/* loaded from: classes.dex */
public final class ResizableAtomicArray<T> {
    private volatile AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i11) {
        this.array = new AtomicReferenceArray<>(i11);
    }

    /* renamed from: a */
    public final int m113699a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m113700b(int i11) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i11 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i11);
        }
        return null;
    }

    /* renamed from: c */
    public final void m113701c(int i11, Object obj) {
        int m116580c;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i11 >= length) {
            m116580c = AbstractC22543l.m116580c(i11 + 1, length * 2);
            AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(m116580c);
            for (int i12 = 0; i12 < length; i12++) {
                atomicReferenceArray2.set(i12, atomicReferenceArray.get(i12));
            }
            atomicReferenceArray2.set(i11, obj);
            this.array = atomicReferenceArray2;
            return;
        }
        atomicReferenceArray.set(i11, obj);
    }
}
