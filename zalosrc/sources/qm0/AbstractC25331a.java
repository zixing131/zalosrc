package qm0;

import en0.InterfaceC18505l;
import fn0.AbstractC19058j;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gn0.InterfaceC19517a;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: qm0.a */
/* loaded from: classes.dex */
public abstract class AbstractC25331a implements Collection, InterfaceC19517a {

    /* renamed from: qm0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(Object obj) {
            if (obj == AbstractC25331a.this) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC19074t.m100208f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public abstract int mo127005d();

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo127005d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC19058j.m100166a(this);
    }

    public String toString() {
        String m131214n0;
        m131214n0 = AbstractC25332a0.m131214n0(this, ", ", "[", "]", 0, null, new a(), 24, null);
        return m131214n0;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        return AbstractC19058j.m100167b(this, objArr);
    }
}
