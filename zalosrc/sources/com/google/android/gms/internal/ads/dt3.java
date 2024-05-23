package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class dt3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        mt3 mt3Var = (mt3) obj;
        mt3 mt3Var2 = (mt3) obj2;
        gt3 it = mt3Var.iterator();
        gt3 it2 = mt3Var2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(mt3Var.mo22168p()).compareTo(Integer.valueOf(mt3Var2.mo22168p()));
    }
}
