package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f1 */
/* loaded from: classes3.dex */
public class C6801f1 extends AbstractList implements InterfaceC6840x, RandomAccess {

    /* renamed from: p */
    private final InterfaceC6840x f37271p;

    /* renamed from: com.google.protobuf.f1$a */
    /* loaded from: classes3.dex */
    class a implements ListIterator {

        /* renamed from: p */
        ListIterator f37272p;

        /* renamed from: q */
        final /* synthetic */ int f37273q;

        a(int i11) {
            this.f37273q = i11;
            this.f37272p = C6801f1.this.f37271p.listIterator(i11);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f37272p.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f37272p.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f37272p.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f37272p.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f37272p.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f37272p.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.f1$b */
    /* loaded from: classes3.dex */
    class b implements Iterator {

        /* renamed from: p */
        Iterator f37275p;

        b() {
            this.f37275p = C6801f1.this.f37271p.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f37275p.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37275p.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6801f1(InterfaceC6840x interfaceC6840x) {
        this.f37271p = interfaceC6840x;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i11) {
        return (String) this.f37271p.get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i11) {
        return new a(i11);
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: q */
    public void mo34820q(AbstractC6799f abstractC6799f) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: r0 */
    public InterfaceC6840x mo34821r0() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37271p.size();
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: y */
    public List mo34822y() {
        return this.f37271p.mo34822y();
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: z0 */
    public Object mo34823z0(int i11) {
        return this.f37271p.mo34823z0(i11);
    }
}
