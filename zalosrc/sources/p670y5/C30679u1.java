package p670y5;

import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.u1 */
/* loaded from: classes2.dex */
final class C30679u1 extends AbstractC30432h1 {

    /* renamed from: r */
    private final transient AbstractC30413g1 f141873r;

    /* renamed from: s */
    private final transient Object[] f141874s;

    /* renamed from: t */
    private final transient int f141875t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30679u1(AbstractC30413g1 abstractC30413g1, Object[] objArr, int i11, int i12) {
        this.f141873r = abstractC30413g1;
        this.f141874s = objArr;
        this.f141875t = i12;
    }

    @Override // p670y5.AbstractC30754y0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f141873r.get(key))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p670y5.AbstractC30754y0
    /* renamed from: d */
    public final int mo149494d(Object[] objArr, int i11) {
        return m149526k().mo149494d(objArr, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m149526k().listIterator(0);
    }

    @Override // p670y5.AbstractC30432h1
    /* renamed from: l */
    final AbstractC30375e1 mo149527l() {
        return new C30660t1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f141875t;
    }
}
