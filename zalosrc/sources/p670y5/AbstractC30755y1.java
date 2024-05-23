package p670y5;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: y5.y1 */
/* loaded from: classes2.dex */
abstract class AbstractC30755y1 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC30774z1.m149738b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
