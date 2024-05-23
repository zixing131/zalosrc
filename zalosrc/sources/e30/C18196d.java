package e30;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p148f3.C18710b;
import qm0.AbstractC25366r;

/* renamed from: e30.d */
/* loaded from: classes5.dex */
public final class C18196d {

    /* renamed from: a */
    public static final C18196d f92374a = new C18196d();

    private C18196d() {
    }

    /* renamed from: a */
    public static final Set m96961a(Set set, Collection collection) {
        AbstractC19074t.m100208f(set, "a");
        AbstractC19074t.m100208f(collection, C18710b.f94009e);
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (!collection.contains(Integer.valueOf(intValue))) {
                hashSet.add(Integer.valueOf(intValue));
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final List m96962b(Collection collection, int i11) {
        AbstractC19074t.m100208f(collection, "itemList");
        if (i11 >= collection.size()) {
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList(collection);
        AbstractC25366r.m131497f(arrayList);
        return arrayList.subList(0, i11);
    }
}
