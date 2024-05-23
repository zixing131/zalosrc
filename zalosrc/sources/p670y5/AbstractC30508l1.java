package p670y5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.l1 */
/* loaded from: classes2.dex */
public abstract class AbstractC30508l1 extends AbstractC30755y1 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo149563d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    abstract Map mo149563d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo149563d().isEmpty();
    }

    @Override // p670y5.AbstractC30755y1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return AbstractC30774z1.m149738b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return AbstractC30774z1.m149739c(this, collection.iterator());
        }
    }

    @Override // p670y5.AbstractC30755y1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i11;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC30469j0.m149551a(size, "expectedSize");
                i11 = size + 1;
            } else if (size < 1073741824) {
                i11 = (int) Math.ceil(size / 0.75d);
            } else {
                i11 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i11);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((C30696v) mo149563d()).f141906s.zzo().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo149563d().size();
    }
}
