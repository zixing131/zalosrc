package p670y5;

import java.util.Iterator;
import java.util.Map;

/* renamed from: y5.m1 */
/* loaded from: classes2.dex */
abstract class AbstractC30527m1 extends AbstractC30755y1 {

    /* renamed from: p */
    final Map f141492p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC30527m1(Map map) {
        map.getClass();
        this.f141492p = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f141492p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f141492p.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f141492p.size();
    }
}
