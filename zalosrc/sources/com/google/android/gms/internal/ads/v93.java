package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v93 extends u93 implements SortedSet {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v93(SortedSet sortedSet, k53 k53Var) {
        super(sortedSet, k53Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f17651p).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f17651p.iterator();
        k53 k53Var = this.f17652q;
        it.getClass();
        k53Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (k53Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new v93(((SortedSet) this.f17651p).headSet(obj), this.f17652q);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f17651p;
        while (true) {
            Object last = sortedSet.last();
            if (this.f17652q.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new v93(((SortedSet) this.f17651p).subSet(obj, obj2), this.f17652q);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new v93(((SortedSet) this.f17651p).tailSet(obj), this.f17652q);
    }
}
