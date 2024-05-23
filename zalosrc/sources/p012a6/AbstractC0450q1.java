package p012a6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: a6.q1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0450q1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m843a(Set set) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m844b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC0298i1) {
            collection = ((InterfaceC0298i1) collection).zza();
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
        return m845c(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m845c(Set set, Iterator it) {
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= set.remove(it.next());
        }
        return z11;
    }
}
