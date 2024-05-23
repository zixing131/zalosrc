package p012a6;

import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.l1 */
/* loaded from: classes2.dex */
final class C0355l1 extends AbstractC0487s0 {

    /* renamed from: r */
    private final transient AbstractC0468r0 f1578r;

    /* renamed from: s */
    private final transient Object[] f1579s;

    /* renamed from: t */
    private final transient int f1580t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0355l1(AbstractC0468r0 abstractC0468r0, Object[] objArr, int i11, int i12) {
        this.f1578r = abstractC0468r0;
        this.f1579s = objArr;
        this.f1580t = i12;
    }

    @Override // p012a6.AbstractC0335k0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f1578r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p012a6.AbstractC0335k0
    /* renamed from: d */
    public final int mo768d(Object[] objArr, int i11) {
        return m871k().mo768d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m871k().listIterator(0);
    }

    @Override // p012a6.AbstractC0487s0
    /* renamed from: l */
    final AbstractC0430p0 mo781l() {
        return new C0336k1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1580t;
    }
}
