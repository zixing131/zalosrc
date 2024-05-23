package p012a6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.w0 */
/* loaded from: classes2.dex */
public final class C0561w0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: p */
    final List f2012p;

    /* renamed from: q */
    final InterfaceC0428oh f2013q;

    public C0561w0(List list, InterfaceC0428oh interfaceC0428oh) {
        list.getClass();
        this.f2012p = list;
        interfaceC0428oh.getClass();
        this.f2013q = interfaceC0428oh;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2012p.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return this.f2013q.zza(this.f2012p.get(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2012p.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new C0543v0(this, this.f2012p.listIterator(i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return this.f2013q.zza(this.f2012p.remove(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2012p.size();
    }
}
