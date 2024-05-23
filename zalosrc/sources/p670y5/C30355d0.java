package p670y5;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: y5.d0 */
/* loaded from: classes2.dex */
public class C30355d0 extends AbstractC30317b0 implements List {

    /* renamed from: u */
    final /* synthetic */ AbstractC30374e0 f140776u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30355d0(AbstractC30374e0 abstractC30374e0, Object obj, List list, AbstractC30317b0 abstractC30317b0) {
        super(abstractC30374e0, obj, list, abstractC30317b0);
        this.f140776u = abstractC30374e0;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zzb();
        boolean isEmpty = this.f140717q.isEmpty();
        ((List) this.f140717q).add(i11, obj);
        AbstractC30374e0 abstractC30374e0 = this.f140776u;
        i12 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i12 + 1;
        if (isEmpty) {
            m149461d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        int i12;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f140717q).addAll(i11, collection);
        if (addAll) {
            int size2 = this.f140717q.size();
            AbstractC30374e0 abstractC30374e0 = this.f140776u;
            i12 = abstractC30374e0.f140818s;
            abstractC30374e0.f140818s = i12 + (size2 - size);
            if (size == 0) {
                m149461d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzb();
        return ((List) this.f140717q).get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f140717q).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f140717q).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C30336c0(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        int i12;
        zzb();
        Object remove = ((List) this.f140717q).remove(i11);
        AbstractC30374e0 abstractC30374e0 = this.f140776u;
        i12 = abstractC30374e0.f140818s;
        abstractC30374e0.f140818s = i12 - 1;
        m149462e();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        zzb();
        return ((List) this.f140717q).set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        zzb();
        AbstractC30374e0 abstractC30374e0 = this.f140776u;
        Object obj = this.f140716p;
        List subList = ((List) this.f140717q).subList(i11, i12);
        AbstractC30317b0 abstractC30317b0 = this.f140718r;
        if (abstractC30317b0 == null) {
            abstractC30317b0 = this;
        }
        return abstractC30374e0.m149490i(obj, subList, abstractC30317b0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new C30336c0(this, i11);
    }
}
