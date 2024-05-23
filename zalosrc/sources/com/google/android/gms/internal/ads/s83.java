package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class s83 extends w93 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo22284d().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    abstract Map mo22284d();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo22284d().isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.w93, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return x93.m27871d(this, collection);
        } catch (UnsupportedOperationException unused) {
            return x93.m27872e(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.w93, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i11;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                a73.m20019a(size, "expectedSize");
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
            return mo22284d().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo22284d().size();
    }
}
