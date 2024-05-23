package p705z5;

import java.util.Iterator;

/* renamed from: z5.uc */
/* loaded from: classes2.dex */
final class C31588uc extends AbstractC31518pc {

    /* renamed from: r */
    private final transient AbstractC31504oc f145267r;

    /* renamed from: s */
    private final transient AbstractC31476mc f145268s;

    public C31588uc(AbstractC31504oc abstractC31504oc, AbstractC31476mc abstractC31476mc) {
        this.f145267r = abstractC31504oc;
        this.f145268s = abstractC31476mc;
    }

    @Override // p705z5.AbstractC31460la, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f145267r.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: d */
    public final int mo152300d(Object[] objArr, int i11) {
        return this.f145268s.mo152300d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f145268s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f145267r.size();
    }
}
