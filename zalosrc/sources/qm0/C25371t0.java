package qm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.t0 */
/* loaded from: classes7.dex */
public class C25371t0 extends AbstractC25336c {

    /* renamed from: q */
    private final List f121549q;

    /* renamed from: qm0.t0$a */
    /* loaded from: classes7.dex */
    public static final class a implements ListIterator, InterfaceC19517a {

        /* renamed from: p */
        private final ListIterator f121550p;

        a(int i11) {
            int m131563Q;
            List list = C25371t0.this.f121549q;
            m131563Q = AbstractC25380y.m131563Q(C25371t0.this, i11);
            this.f121550p = list.listIterator(m131563Q);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f121550p.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f121550p.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f121550p.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int m131562P;
            m131562P = AbstractC25380y.m131562P(C25371t0.this, this.f121550p.previousIndex());
            return m131562P;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f121550p.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int m131562P;
            m131562P = AbstractC25380y.m131562P(C25371t0.this, this.f121550p.nextIndex());
            return m131562P;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25371t0(List list) {
        AbstractC19074t.m100208f(list, "delegate");
        this.f121549q = list;
    }

    @Override // qm0.AbstractC25331a
    /* renamed from: d */
    public int mo127005d() {
        return this.f121549q.size();
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public Object get(int i11) {
        int m131561O;
        List list = this.f121549q;
        m131561O = AbstractC25380y.m131561O(this, i11);
        return list.get(m131561O);
    }

    @Override // qm0.AbstractC25336c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // qm0.AbstractC25336c, java.util.List
    public ListIterator listIterator(int i11) {
        return new a(i11);
    }
}
