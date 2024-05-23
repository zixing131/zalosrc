package p633x5;

import java.util.Iterator;

/* renamed from: x5.v */
/* loaded from: classes2.dex */
final class C29374v extends AbstractC29364q {

    /* renamed from: r */
    private final transient AbstractC29362p f135868r;

    /* renamed from: s */
    private final transient AbstractC29356m f135869s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29374v(AbstractC29362p abstractC29362p, AbstractC29356m abstractC29356m) {
        this.f135868r = abstractC29362p;
        this.f135869s = abstractC29356m;
    }

    @Override // p633x5.AbstractC29350j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f135868r.get(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p633x5.AbstractC29350j
    /* renamed from: d */
    public final int mo146489d(Object[] objArr, int i11) {
        return this.f135869s.mo146489d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f135869s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f135868r.size();
    }
}
