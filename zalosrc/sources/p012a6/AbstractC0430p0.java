package p012a6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: a6.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0430p0 extends AbstractC0335k0 implements List, RandomAccess {

    /* renamed from: q */
    private static final AbstractC0526u1 f1745q = new C0392n0(C0317j1.f1515u, 0);

    /* renamed from: r */
    public static final /* synthetic */ int f1746r = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static AbstractC0430p0 m828l(Object[] objArr, int i11) {
        if (i11 == 0) {
            return C0317j1.f1515u;
        }
        return new C0317j1(objArr, i11);
    }

    /* renamed from: m */
    public static AbstractC0430p0 m829m() {
        return C0317j1.f1515u;
    }

    /* renamed from: n */
    public static AbstractC0430p0 m830n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        for (int i11 = 0; i11 < 2; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return m828l(objArr, 2);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p012a6.AbstractC0335k0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p012a6.AbstractC0335k0
    /* renamed from: d */
    public int mo768d(Object[] objArr, int i11) {
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
                        if (AbstractC0466qh.m859a(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC0466qh.m859a(it.next(), it2.next())) {
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

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC0430p0 subList(int i11, int i12) {
        AbstractC0163b.m619c(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return C0317j1.f1515u;
        }
        return new C0411o0(this, i11, i13);
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
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC0526u1 listIterator(int i11) {
        AbstractC0163b.m618b(i11, size(), "index");
        if (isEmpty()) {
            return f1745q;
        }
        return new C0392n0(this, i11);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }
}
