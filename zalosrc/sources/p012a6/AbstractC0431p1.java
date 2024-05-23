package p012a6;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: a6.p1 */
/* loaded from: classes2.dex */
abstract class AbstractC0431p1 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return AbstractC0450q1.m844b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
