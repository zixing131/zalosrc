package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class c83 extends x73 implements List, RandomAccess {

    /* renamed from: q */
    private static final ca3 f18158q = new a83(k93.f23194t, 0);

    /* renamed from: A */
    public static c83 m20823A(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        i93.m23145b(objArr, 3);
        return m20828s(objArr, 3);
    }

    /* renamed from: B */
    public static c83 m20824B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        i93.m23145b(objArr, 5);
        return m20828s(objArr, 5);
    }

    /* renamed from: C */
    public static c83 m20825C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        i93.m23145b(objArr, 6);
        return m20828s(objArr, 6);
    }

    /* renamed from: p */
    public static z73 m20826p() {
        return new z73(4);
    }

    /* renamed from: r */
    public static c83 m20827r(Object[] objArr) {
        return m20828s(objArr, objArr.length);
    }

    /* renamed from: s */
    public static c83 m20828s(Object[] objArr, int i11) {
        if (i11 == 0) {
            return k93.f23194t;
        }
        return new k93(objArr, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static c83 m20829t(Iterable iterable) {
        iterable.getClass();
        return m20830u(iterable);
    }

    /* renamed from: u */
    public static c83 m20830u(Collection collection) {
        if (collection instanceof x73) {
            c83 mo20837j = ((x73) collection).mo20837j();
            if (mo20837j.mo20436l()) {
                Object[] array = mo20837j.toArray();
                return m20828s(array, array.length);
            }
            return mo20837j;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        i93.m23145b(array2, length);
        return m20828s(array2, length);
    }

    /* renamed from: v */
    public static c83 m20831v(Object[] objArr) {
        if (objArr.length == 0) {
            return k93.f23194t;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        i93.m23145b(objArr2, length);
        return m20828s(objArr2, length);
    }

    /* renamed from: w */
    public static c83 m20832w() {
        return k93.f23194t;
    }

    /* renamed from: x */
    public static c83 m20833x(Object obj) {
        Object[] objArr = {obj};
        i93.m23145b(objArr, 1);
        return m20828s(objArr, 1);
    }

    /* renamed from: z */
    public static c83 m20834z(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        i93.m23145b(objArr, 2);
        return m20828s(objArr, 2);
    }

    @Override // java.util.List
    /* renamed from: D */
    public final ca3 listIterator(int i11) {
        j53.m23532b(i11, size(), "index");
        if (isEmpty()) {
            return f18158q;
        }
        return new a83(this, i11);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.x73, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    public int mo20836d(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
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
                        if (e53.m21617a(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !e53.m21617a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: j */
    public final c83 mo20837j() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public final ba3 mo20838k() {
        return listIterator(0);
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
    /* renamed from: n */
    public c83 subList(int i11, int i12) {
        j53.m23537g(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return k93.f23194t;
        }
        return new b83(this, i11, i13);
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
