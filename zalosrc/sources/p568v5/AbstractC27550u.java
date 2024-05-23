package p568v5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: v5.u */
/* loaded from: classes2.dex */
public abstract class AbstractC27550u extends AbstractC27547r implements List, RandomAccess {

    /* renamed from: q */
    private static final AbstractC27553x f129512q = new C27548s(C27551v.f129513t, 0);

    /* renamed from: n */
    public static AbstractC27550u m140760n() {
        return C27551v.f129513t;
    }

    /* renamed from: p */
    public static AbstractC27550u m140761p(Collection collection) {
        if (collection instanceof AbstractC27547r) {
            AbstractC27550u mo140756j = ((AbstractC27547r) collection).mo140756j();
            if (mo140756j.mo140757k()) {
                Object[] array = mo140756j.toArray();
                return m140762r(array, array.length);
            }
            return mo140756j;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (array2[i11] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        return m140762r(array2, length);
    }

    /* renamed from: r */
    static AbstractC27550u m140762r(Object[] objArr, int i11) {
        if (i11 == 0) {
            return C27551v.f129513t;
        }
        return new C27551v(objArr, i11);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
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
                        if (AbstractC27543n.m140746a(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC27543n.m140746a(it.next(), it2.next())) {
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
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // p568v5.AbstractC27547r
    /* renamed from: j */
    public final AbstractC27550u mo140756j() {
        return this;
    }

    @Override // p568v5.AbstractC27547r
    /* renamed from: l */
    int mo140758l(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
        return size;
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
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: m */
    public AbstractC27550u subList(int i11, int i12) {
        AbstractC27544o.m140749c(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return C27551v.f129513t;
        }
        return new C27549t(this, i11, i13);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public final AbstractC27553x listIterator(int i11) {
        AbstractC27544o.m140748b(i11, size(), "index");
        if (isEmpty()) {
            return f129512q;
        }
        return new C27548s(this, i11);
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }
}
