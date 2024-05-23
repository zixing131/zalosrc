package p705z5;

import java.util.Iterator;
import java.util.Map;

/* renamed from: z5.tc */
/* loaded from: classes2.dex */
final class C31574tc extends AbstractC31518pc {

    /* renamed from: r */
    private final transient AbstractC31504oc f145234r;

    /* renamed from: s */
    private final transient Object[] f145235s;

    /* renamed from: t */
    private final transient int f145236t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31574tc(AbstractC31504oc abstractC31504oc, Object[] objArr, int i11, int i12) {
        this.f145234r = abstractC31504oc;
        this.f145235s = objArr;
        this.f145236t = i12;
    }

    @Override // p705z5.AbstractC31460la, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f145234r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p705z5.AbstractC31460la
    /* renamed from: d */
    public final int mo152300d(Object[] objArr, int i11) {
        return m152338k().mo152300d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m152338k().listIterator(0);
    }

    @Override // p705z5.AbstractC31518pc
    /* renamed from: l */
    final AbstractC31476mc mo152339l() {
        return new C31560sc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f145236t;
    }
}
