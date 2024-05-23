package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class i83 {
    /* renamed from: a */
    public static boolean m23140a(Iterable iterable, k53 k53Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            k53Var.getClass();
            return m23142c((List) iterable, k53Var);
        }
        Iterator it = iterable.iterator();
        k53Var.getClass();
        boolean z11 = false;
        while (it.hasNext()) {
            if (k53Var.zza(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: b */
    private static void m23141b(List list, k53 k53Var, int i11, int i12) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i12) {
                break;
            } else if (k53Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i12--;
            if (i12 >= i11) {
                list.remove(i12);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private static boolean m23142c(List list, k53 k53Var) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < list.size()) {
            Object obj = list.get(i11);
            if (!k53Var.zza(obj)) {
                if (i11 > i12) {
                    try {
                        list.set(i12, obj);
                    } catch (IllegalArgumentException unused) {
                        m23141b(list, k53Var, i12, i11);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m23141b(list, k53Var, i12, i11);
                        return true;
                    }
                }
                i12++;
            }
            i11++;
        }
        list.subList(i12, list.size()).clear();
        if (i11 == i12) {
            return false;
        }
        return true;
    }
}
