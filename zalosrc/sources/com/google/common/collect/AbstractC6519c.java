package com.google.common.collect;

import com.google.common.collect.AbstractC6520d;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import p358n7.AbstractC23600d;

/* renamed from: com.google.common.collect.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6519c extends AbstractCollection implements Serializable {

    /* renamed from: p */
    private static final Object[] f36352p = new Object[0];

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

    /* renamed from: d */
    abstract int mo33408d(Object[] objArr, int i11);

    /* renamed from: e */
    public Object[] mo33409e() {
        return null;
    }

    /* renamed from: g */
    int mo33410g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public int mo33411j() {
        throw new UnsupportedOperationException();
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
        return toArray(f36352p);
    }

    Object writeReplace() {
        return new AbstractC6520d.b(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC23600d.m123736g(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] mo33409e = mo33409e();
            if (mo33409e != null) {
                return AbstractC6525i.m33444a(mo33409e, mo33411j(), mo33410g(), objArr);
            }
            objArr = AbstractC6524h.m33443d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo33408d(objArr, 0);
        return objArr;
    }
}
