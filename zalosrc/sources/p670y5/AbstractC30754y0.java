package p670y5;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: y5.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC30754y0 extends AbstractCollection implements Serializable {

    /* renamed from: p */
    private static final Object[] f142014p = new Object[0];

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo149494d(Object[] objArr, int i11);

    /* renamed from: e */
    int mo149475e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo149476g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Object[] mo149477j() {
        return null;
    }

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
        return toArray(f142014p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo149477j = mo149477j();
            if (mo149477j == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(mo149477j, mo149476g(), mo149475e(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo149494d(objArr, 0);
        return objArr;
    }
}
