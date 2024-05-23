package p670y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: y5.z1 */
/* loaded from: classes2.dex */
public abstract class AbstractC30774z1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m149737a(Set set) {
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
    public static boolean m149738b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC30622r1) {
            collection = ((InterfaceC30622r1) collection).zza();
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
        return m149739c(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m149739c(Set set, Iterator it) {
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= set.remove(it.next());
        }
        return z11;
    }
}
