package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class x93 {
    /* renamed from: a */
    public static int m27868a(Set set) {
        int i11;
        int i12 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i11 = obj.hashCode();
            } else {
                i11 = 0;
            }
            i12 += i11;
        }
        return i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    /* renamed from: b */
    public static Set m27869b(Set set, k53 k53Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof u93) {
                u93 u93Var = (u93) sortedSet;
                return new v93((SortedSet) u93Var.f17651p, o53.m25091a(u93Var.f17652q, k53Var));
            }
            sortedSet.getClass();
            k53Var.getClass();
            return new v93(sortedSet, k53Var);
        }
        if (set instanceof u93) {
            u93 u93Var2 = (u93) set;
            return new u93(u93Var2.f17651p, o53.m25091a(u93Var2.f17652q, k53Var));
        }
        set.getClass();
        k53Var.getClass();
        return new u93(set, k53Var);
    }

    /* renamed from: c */
    public static boolean m27870c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m27871d(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof g93) {
            collection = ((g93) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }
        return m27872e(set, collection.iterator());
    }

    /* renamed from: e */
    public static boolean m27872e(Set set, Iterator it) {
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= set.remove(it.next());
        }
        return z11;
    }
}
