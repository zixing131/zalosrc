package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: com.google.android.gms.internal.play_billing.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5748e extends AbstractCollection implements Serializable {

    /* renamed from: p */
    private static final Object[] f33308p = new Object[0];

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

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public abstract int mo30205d(Object[] objArr, int i11);

    /* renamed from: e */
    int mo30206e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public int mo30207g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public abstract AbstractC5766h mo30208j();

    /* renamed from: k */
    public abstract boolean mo30209k();

    /* renamed from: l */
    public Object[] mo30210l() {
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

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        Spliterator spliterator;
        spliterator = Spliterators.spliterator(this, 1296);
        return spliterator;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f33308p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] mo30210l = mo30210l();
            if (mo30210l == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(mo30210l, mo30207g(), mo30206e(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        mo30205d(objArr, 0);
        return objArr;
    }
}
