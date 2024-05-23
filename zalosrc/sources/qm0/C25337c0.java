package qm0;

import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: qm0.c0 */
/* loaded from: classes.dex */
public final class C25337c0 implements List, Serializable, RandomAccess, InterfaceC19517a {

    /* renamed from: p */
    public static final C25337c0 f121530p = new C25337c0();
    private static final long serialVersionUID = -7390468764508069838L;

    private C25337c0() {
    }

    private final Object readResolve() {
        return f121530p;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m131243d((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: d */
    public boolean m131243d(Void r22) {
        AbstractC19074t.m100208f(r22, "element");
        return false;
    }

    @Override // java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(int i11) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i11 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int m131245g() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m131246j((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C25335b0.f121522p;
    }

    /* renamed from: j */
    public int m131246j(Void r22) {
        AbstractC19074t.m100208f(r22, "element");
        return -1;
    }

    /* renamed from: k */
    public int m131247k(Void r22) {
        AbstractC19074t.m100208f(r22, "element");
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m131247k((Void) obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return C25335b0.f121522p;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m131245g();
    }

    @Override // java.util.List
    public List subList(int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC19058j.m100166a(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i11) {
        if (i11 == 0) {
            return C25335b0.f121522p;
        }
        throw new IndexOutOfBoundsException("Index: " + i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
