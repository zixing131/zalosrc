package p012a6;

import java.util.Iterator;
import java.util.Map;

/* renamed from: a6.d1 */
/* loaded from: classes2.dex */
abstract class AbstractC0203d1 extends AbstractC0431p1 {

    /* renamed from: p */
    final Map f966p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0203d1(Map map) {
        map.getClass();
        this.f966p = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f966p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f966p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f966p.size();
    }
}
