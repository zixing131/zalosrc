package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.h */
/* loaded from: classes2.dex */
public abstract class AbstractC5766h extends AbstractC5748e implements List, RandomAccess {

    /* renamed from: q */
    private static final AbstractC5850v f33322q = new C5754f(C5802n.f33368u, 0);

    /* renamed from: r */
    public static final /* synthetic */ int f33323r = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static AbstractC5766h m30235n(Object[] objArr, int i11) {
        if (i11 == 0) {
            return C5802n.f33368u;
        }
        return new C5802n(objArr, i11);
    }

    /* renamed from: p */
    public static AbstractC5766h m30236p(Collection collection) {
        if (collection instanceof AbstractC5748e) {
            AbstractC5766h mo30208j = ((AbstractC5748e) collection).mo30208j();
            if (mo30208j.mo30209k()) {
                Object[] array = mo30208j.toArray();
                return m30235n(array, array.length);
            }
            return mo30208j;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (array2[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return m30235n(array2, length);
    }

    /* renamed from: r */
    public static AbstractC5766h m30237r() {
        return C5802n.f33368u;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: d */
    public int mo30205d(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i11 = 0; i11 < size; i11++) {
                        if (AbstractC5879z4.m30582a(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC5879z4.m30582a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = (i11 * 31) + get(i12).hashCode();
        }
        return i11;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: j */
    public final AbstractC5766h mo30208j() {
        return this;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC5766h subList(int i11, int i12) {
        AbstractC5727a5.m30169d(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return C5802n.f33368u;
        }
        return new C5760g(this, i11, i13);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final AbstractC5850v listIterator(int i11) {
        AbstractC5727a5.m30167b(i11, size(), "index");
        if (isEmpty()) {
            return f33322q;
        }
        return new C5754f(this, i11);
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }
}
