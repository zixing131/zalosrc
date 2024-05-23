package qm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.s0 */
/* loaded from: classes7.dex */
public final class C25369s0 extends AbstractC25340e {

    /* renamed from: p */
    private final List f121546p;

    /* renamed from: qm0.s0$a */
    /* loaded from: classes7.dex */
    public static final class a implements ListIterator, InterfaceC19517a {

        /* renamed from: p */
        private final ListIterator f121547p;

        a(int i11) {
            int m131563Q;
            List list = C25369s0.this.f121546p;
            m131563Q = AbstractC25380y.m131563Q(C25369s0.this, i11);
            this.f121547p = list.listIterator(m131563Q);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f121547p.add(obj);
            this.f121547p.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f121547p.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f121547p.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f121547p.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int m131562P;
            m131562P = AbstractC25380y.m131562P(C25369s0.this, this.f121547p.previousIndex());
            return m131562P;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f121547p.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int m131562P;
            m131562P = AbstractC25380y.m131562P(C25369s0.this, this.f121547p.nextIndex());
            return m131562P;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f121547p.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f121547p.set(obj);
        }
    }

    public C25369s0(List list) {
        AbstractC19074t.m100208f(list, "delegate");
        this.f121546p = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, Object obj) {
        int m131563Q;
        List list = this.f121546p;
        m131563Q = AbstractC25380y.m131563Q(this, i11);
        list.add(m131563Q, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f121546p.clear();
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: d */
    public int mo131256d() {
        return this.f121546p.size();
    }

    @Override // qm0.AbstractC25340e
    /* renamed from: e */
    public Object mo131257e(int i11) {
        int m131561O;
        List list = this.f121546p;
        m131561O = AbstractC25380y.m131561O(this, i11);
        return list.remove(m131561O);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i11) {
        int m131561O;
        List list = this.f121546p;
        m131561O = AbstractC25380y.m131561O(this, i11);
        return list.get(m131561O);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i11, Object obj) {
        int m131561O;
        List list = this.f121546p;
        m131561O = AbstractC25380y.m131561O(this, i11);
        return list.set(m131561O, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i11) {
        return new a(i11);
    }
}
