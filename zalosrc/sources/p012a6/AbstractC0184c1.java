package p012a6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0184c1 extends AbstractC0431p1 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo626d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    abstract Map mo626d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo626d().isEmpty();
    }

    @Override // p012a6.AbstractC0431p1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return AbstractC0450q1.m844b(this, collection);
        } catch (UnsupportedOperationException unused) {
            return AbstractC0450q1.m845c(this, collection.iterator());
        }
    }

    @Override // p012a6.AbstractC0431p1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i11;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC0524u.m876a(size, "expectedSize");
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
            return ((C0277h) mo626d()).f1440s.zzo().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo626d().size();
    }
}
