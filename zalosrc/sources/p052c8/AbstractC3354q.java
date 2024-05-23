package p052c8;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: c8.q */
/* loaded from: classes.dex */
abstract class AbstractC3354q {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c8.q$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final C3339c f14208a;

        /* renamed from: b */
        private final Set f14209b = new HashSet();

        /* renamed from: c */
        private final Set f14210c = new HashSet();

        b(C3339c c3339c) {
            this.f14208a = c3339c;
        }

        /* renamed from: a */
        void m16896a(b bVar) {
            this.f14209b.add(bVar);
        }

        /* renamed from: b */
        void m16897b(b bVar) {
            this.f14210c.add(bVar);
        }

        /* renamed from: c */
        C3339c m16898c() {
            return this.f14208a;
        }

        /* renamed from: d */
        Set m16899d() {
            return this.f14209b;
        }

        /* renamed from: e */
        boolean m16900e() {
            return this.f14209b.isEmpty();
        }

        /* renamed from: f */
        boolean m16901f() {
            return this.f14210c.isEmpty();
        }

        /* renamed from: g */
        void m16902g(b bVar) {
            this.f14210c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c8.q$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final C3338b0 f14211a;

        /* renamed from: b */
        private final boolean f14212b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f14211a.equals(this.f14211a) || cVar.f14212b != this.f14212b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f14211a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f14212b).hashCode();
        }

        private c(C3338b0 c3338b0, boolean z11) {
            this.f14211a = c3338b0;
            this.f14212b = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m16893a(List list) {
        Set<b> m16895c = m16895c(list);
        Set m16894b = m16894b(m16895c);
        int i11 = 0;
        while (!m16894b.isEmpty()) {
            b bVar = (b) m16894b.iterator().next();
            m16894b.remove(bVar);
            i11++;
            for (b bVar2 : bVar.m16899d()) {
                bVar2.m16902g(bVar);
                if (bVar2.m16901f()) {
                    m16894b.add(bVar2);
                }
            }
        }
        if (i11 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : m16895c) {
            if (!bVar3.m16901f() && !bVar3.m16900e()) {
                arrayList.add(bVar3.m16898c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    private static Set m16894b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m16901f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set m16895c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C3339c c3339c = (C3339c) it.next();
                b bVar = new b(c3339c);
                for (C3338b0 c3338b0 : c3339c.m16831j()) {
                    c cVar = new c(c3338b0, !c3339c.m16835p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f14212b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", c3338b0));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (C3355r c3355r : bVar2.m16898c().m16828g()) {
                            if (c3355r.m16914e() && (set = (Set) hashMap.get(new c(c3355r.m16912c(), c3355r.m16916g()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.m16896a(bVar3);
                                    bVar3.m16897b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
