package p568v5;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: v5.r */
/* loaded from: classes2.dex */
public abstract class AbstractC27547r extends AbstractCollection implements Serializable {

    /* renamed from: p */
    private static final Object[] f129507p = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Object[] mo140753d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo140754e();

    /* renamed from: g */
    abstract int mo140755g();

    /* renamed from: j */
    public abstract AbstractC27550u mo140756j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo140757k();

    /* renamed from: l */
    abstract int mo140758l(Object[] objArr, int i11);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f129507p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo140753d = mo140753d();
            if (mo140753d == null) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            } else {
                return Arrays.copyOfRange(mo140753d, mo140754e(), mo140755g(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo140758l(objArr, 0);
        return objArr;
    }
}
