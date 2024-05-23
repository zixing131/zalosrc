package e30;

import d30.C17726f;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pm0.C24860q;

/* renamed from: e30.c */
/* loaded from: classes5.dex */
public final class C18195c implements InterfaceC18193a {

    /* renamed from: a */
    private final C17726f f92372a;

    /* renamed from: b */
    private final Map f92373b;

    public C18195c(Map map, C17726f c17726f) {
        AbstractC19074t.m100208f(map, "keyword2ItemList");
        AbstractC19074t.m100208f(c17726f, "metadata");
        this.f92372a = c17726f;
        this.f92373b = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Integer m93833b = this.f92372a.m93833b((C24860q) it2.next());
                if (m93833b != null) {
                    int intValue = m93833b.intValue();
                    if (!this.f92373b.containsKey(Integer.valueOf(intValue))) {
                        this.f92373b.put(Integer.valueOf(intValue), new HashSet());
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Integer m93833b2 = this.f92372a.m93833b((C24860q) it3.next());
                        if (m93833b2 != null) {
                            int intValue2 = m93833b2.intValue();
                            Set set = (Set) this.f92373b.get(Integer.valueOf(intValue));
                            if (set != null) {
                                set.add(Integer.valueOf(intValue2));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // e30.InterfaceC18193a
    /* renamed from: a */
    public Set mo96959a(Map map, int i11) {
        Object orDefault;
        AbstractC19074t.m100208f(map, "sticker2Click");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (C24860q c24860q : map.keySet()) {
            Integer m93833b = this.f92372a.m93833b(c24860q);
            if (m93833b != null) {
                int intValue = m93833b.intValue();
                hashSet.add(Integer.valueOf(intValue));
                Integer valueOf = Integer.valueOf(intValue);
                Object obj = map.get(c24860q);
                AbstractC19074t.m100205c(obj);
                hashMap.put(valueOf, obj);
            }
        }
        HashSet hashSet2 = new HashSet(C18196d.m96961a(this.f92372a.m93832a(), hashSet));
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Set set = (Set) this.f92373b.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (set != null) {
                hashSet2.removeAll(set);
            }
        }
        HashSet hashSet3 = new HashSet();
        Iterator it2 = hashMap.keySet().iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            Map map2 = this.f92373b;
            Integer valueOf2 = Integer.valueOf(intValue2);
            Set emptySet = Collections.emptySet();
            AbstractC19074t.m100207e(emptySet, "emptySet()");
            orDefault = map2.getOrDefault(valueOf2, emptySet);
            Set set2 = (Set) orDefault;
            if (set2.isEmpty()) {
                hashSet3.addAll(C18196d.m96962b(hashSet2, i11));
            } else {
                Set m96961a = C18196d.m96961a(set2, hashMap.keySet());
                if (m96961a.size() >= i11) {
                    hashSet3.addAll(C18196d.m96962b(m96961a, i11));
                } else {
                    hashSet3.addAll(m96961a);
                    hashSet3.addAll(C18196d.m96962b(hashSet2, i11 - m96961a.size()));
                }
            }
        }
        return hashSet3;
    }
}
