package p633x5;

import java.util.Iterator;
import java.util.Map;

/* renamed from: x5.u */
/* loaded from: classes2.dex */
final class C29372u extends AbstractC29364q {

    /* renamed from: r */
    private final transient AbstractC29362p f135865r;

    /* renamed from: s */
    private final transient Object[] f135866s;

    /* renamed from: t */
    private final transient int f135867t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29372u(AbstractC29362p abstractC29362p, Object[] objArr, int i11, int i12) {
        this.f135865r = abstractC29362p;
        this.f135866s = objArr;
        this.f135867t = i12;
    }

    @Override // p633x5.AbstractC29350j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f135865r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p633x5.AbstractC29350j
    /* renamed from: d */
    public final int mo146489d(Object[] objArr, int i11) {
        return m146509k().mo146489d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m146509k().listIterator(0);
    }

    @Override // p633x5.AbstractC29364q
    /* renamed from: l */
    final AbstractC29356m mo146510l() {
        return new C29370t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f135867t;
    }
}
