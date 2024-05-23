package p012a6;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a6.o */
/* loaded from: classes2.dex */
public class C0410o extends AbstractC0372m implements List {

    /* renamed from: u */
    final /* synthetic */ AbstractC0429p f1689u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410o(AbstractC0429p abstractC0429p, Object obj, List list, AbstractC0372m abstractC0372m) {
        super(abstractC0429p, obj, list, abstractC0372m);
        this.f1689u = abstractC0429p;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zzb();
        boolean isEmpty = this.f1616q.isEmpty();
        ((List) this.f1616q).add(i11, obj);
        AbstractC0429p abstractC0429p = this.f1689u;
        i12 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i12 + 1;
        if (isEmpty) {
            m785d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        int i12;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f1616q).addAll(i11, collection);
        if (addAll) {
            int size2 = this.f1616q.size();
            AbstractC0429p abstractC0429p = this.f1689u;
            i12 = abstractC0429p.f1744s;
            abstractC0429p.f1744s = i12 + (size2 - size);
            if (size == 0) {
                m785d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzb();
        return ((List) this.f1616q).get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f1616q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f1616q).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C0391n(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        int i12;
        zzb();
        Object remove = ((List) this.f1616q).remove(i11);
        AbstractC0429p abstractC0429p = this.f1689u;
        i12 = abstractC0429p.f1744s;
        abstractC0429p.f1744s = i12 - 1;
        m786e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        zzb();
        return ((List) this.f1616q).set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        zzb();
        AbstractC0429p abstractC0429p = this.f1689u;
        Object obj = this.f1615p;
        List subList = ((List) this.f1616q).subList(i11, i12);
        AbstractC0372m abstractC0372m = this.f1617r;
        if (abstractC0372m == null) {
            abstractC0372m = this;
        }
        return abstractC0429p.m826i(obj, subList, abstractC0372m);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new C0391n(this, i11);
    }
}
