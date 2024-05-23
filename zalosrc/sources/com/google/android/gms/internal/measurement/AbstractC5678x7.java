package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
/* loaded from: classes.dex */
public abstract class AbstractC5678x7 extends AbstractC5593s7 implements List, RandomAccess {

    /* renamed from: q */
    private static final AbstractC5373f8 f32909q = new C5627u7(C5305b8.f32274u, 0);

    /* renamed from: r */
    public static final /* synthetic */ int f32910r = 0;

    /* renamed from: l */
    public static AbstractC5678x7 m30015l(Object[] objArr, int i11) {
        if (i11 == 0) {
            return C5305b8.f32274u;
        }
        return new C5305b8(objArr, i11);
    }

    /* renamed from: m */
    public static AbstractC5678x7 m30016m(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC5288a8.m28881b(objArr, 2);
        return m30015l(objArr, 2);
    }

    /* renamed from: n */
    public static AbstractC5678x7 m30017n(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", "app", "am"};
        AbstractC5288a8.m28881b(objArr, 3);
        return m30015l(objArr, 3);
    }

    /* renamed from: p */
    public static AbstractC5678x7 m30018p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC5288a8.m28881b(objArr, 7);
        return m30015l(objArr, 7);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: d */
    int mo28945d(Object[] objArr, int i11) {
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
                        if (AbstractC5338d7.m29064a(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !AbstractC5338d7.m29064a(it.next(), it2.next())) {
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
    /* renamed from: k */
    public AbstractC5678x7 subList(int i11, int i12) {
        AbstractC5372f7.m29137c(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return C5305b8.f32274u;
        }
        return new C5644v7(this, i11, i13);
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
    /* renamed from: r */
    public final AbstractC5373f8 listIterator(int i11) {
        AbstractC5372f7.m29136b(i11, size(), "index");
        if (isEmpty()) {
            return f32909q;
        }
        return new C5627u7(this, i11);
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
