package p012a6;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.y0 */
/* loaded from: classes2.dex */
public final class C0597y0 extends AbstractSequentialList implements Serializable {

    /* renamed from: p */
    final List f2085p;

    /* renamed from: q */
    final InterfaceC0428oh f2086q;

    public C0597y0(List list, InterfaceC0428oh interfaceC0428oh) {
        list.getClass();
        this.f2085p = list;
        interfaceC0428oh.getClass();
        this.f2086q = interfaceC0428oh;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2085p.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new C0579x0(this, this.f2085p.listIterator(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2085p.size();
    }
}
