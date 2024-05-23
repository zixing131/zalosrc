package p213hl;

import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import j30.C20912a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import p405ov.C24561c;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import qm0.AbstractC25379x0;
import sm0.AbstractC26327c;

/* renamed from: hl.c */
/* loaded from: classes3.dex */
public final class C20087c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final List f98817a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final HashSet f98818b = new HashSet();

    /* renamed from: c */
    private final HashMap f98819c = new HashMap();

    /* renamed from: d */
    private final HashMap f98820d = new HashMap();

    /* renamed from: hl.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: hl.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj2).m74777O()), Long.valueOf(((ThreadStorageInfo) obj).m74777O()));
            return m135478b;
        }
    }

    /* renamed from: hl.c$c */
    /* loaded from: classes3.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj2).m74777O()), Long.valueOf(((ThreadStorageInfo) obj).m74777O()));
            return m135478b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hl.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f98821q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C13380a c13380a) {
            boolean z11;
            AbstractC19074t.m100208f(c13380a, "it");
            if (c13380a.m75087i() > C20912a.Companion.m109411a().m109401f()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hl.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f98822q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "it");
            C17945a0 m75089k = c13380a.m75089k();
            if (m75089k != null) {
                return m75089k.m94983Q3();
            }
            return null;
        }
    }

    /* renamed from: hl.c$f */
    /* loaded from: classes3.dex */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Long l11;
            int m135478b;
            C17945a0 m75089k = ((C13380a) obj2).m75089k();
            Long l12 = null;
            if (m75089k != null) {
                l11 = Long.valueOf(m75089k.m94974P4());
            } else {
                l11 = null;
            }
            C17945a0 m75089k2 = ((C13380a) obj).m75089k();
            if (m75089k2 != null) {
                l12 = Long.valueOf(m75089k2.m94974P4());
            }
            m135478b = AbstractC26327c.m135478b(l11, l12);
            return m135478b;
        }
    }

    /* renamed from: hl.c$g */
    /* loaded from: classes3.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj2).m75087i()), Long.valueOf(((C13380a) obj).m75087i()));
            return m135478b;
        }
    }

    /* renamed from: hl.c$h */
    /* loaded from: classes3.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((ThreadStorageInfo) obj2).m74777O()), Long.valueOf(((ThreadStorageInfo) obj).m74777O()));
            return m135478b;
        }
    }

    /* renamed from: g */
    private final Set m104452g(String str) {
        Set set;
        synchronized (this.f98819c) {
            try {
                set = (HashSet) this.f98819c.get(str);
                if (set == null) {
                    set = AbstractC25379x0.m131551e();
                } else {
                    AbstractC19074t.m100205c(set);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return set;
    }

    /* renamed from: m */
    private final void m104453m(List list) {
        int m131511r;
        String str;
        Object obj;
        String str2;
        HashSet hashSet = new HashSet();
        ArrayList<C13380a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C17945a0 m75089k = ((C13380a) next).m75089k();
            if (m75089k != null) {
                str3 = m75089k.m94983Q3();
            }
            if (hashSet.add(str3)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j11 = 0;
        while (it2.hasNext()) {
            j11 += ((C13380a) it2.next()).m75087i();
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C17945a0 m75089k2 = ((C13380a) it3.next()).m75089k();
            if (m75089k2 == null || (str2 = m75089k2.m94983Q3()) == null) {
                str2 = "";
            }
            arrayList2.add(str2);
        }
        C24561c.m127942b("SMLToolStorageRepository", "selectedStorageUsageItemsWithoutRef: " + arrayList.size() + ". deleteSize: " + j11);
        this.f98818b.addAll(arrayList2);
        for (C13380a c13380a : arrayList) {
            C17945a0 m75089k3 = c13380a.m75089k();
            if (m75089k3 == null || (str = m75089k3.m94983Q3()) == null) {
                str = "";
            }
            AbstractC19074t.m100205c(str);
            Set<String> m104452g = m104452g(str);
            synchronized (this.f98820d) {
            }
            C24561c.m127942b("SMLToolStorageRepository", "localPath: " + str + ". Total ref include main file: " + m104452g.size());
            for (String str4 : m104452g) {
                List list2 = this.f98817a;
                AbstractC19074t.m100207e(list2, "listConversations");
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (AbstractC19074t.m100204b(((ThreadStorageInfo) obj).m74822z(), str4)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) obj;
                if (threadStorageInfo != null) {
                    threadStorageInfo.m74793g(c13380a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m104454a(Map map) {
        AbstractC19074t.m100208f(map, "data");
        synchronized (this.f98820d) {
            this.f98820d.putAll(map);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: b */
    public final void m104455b(Map map) {
        AbstractC19074t.m100208f(map, "data");
        synchronized (this.f98819c) {
            try {
                for (String str : map.keySet()) {
                    HashSet hashSet = (HashSet) this.f98819c.get(str);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    } else {
                        AbstractC19074t.m100205c(hashSet);
                    }
                    String str2 = (String) map.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashSet.add(str2);
                    this.f98819c.put(str, hashSet);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final List m104456c() {
        ArrayList arrayList = new ArrayList(this.f98817a.size());
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                for (ThreadStorageInfo threadStorageInfo : this.f98817a) {
                    threadStorageInfo.m74788a0(new ArrayList());
                    AbstractC19074t.m100205c(threadStorageInfo);
                    arrayList.add(threadStorageInfo);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List m104457d() {
        ArrayList arrayList;
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                List list2 = this.f98817a;
                AbstractC19074t.m100207e(list2, "listConversations");
                if (list2.size() > 1) {
                    AbstractC25376w.m131534w(list2, new b());
                }
                arrayList = new ArrayList(this.f98817a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void m104458e(List list) {
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        List list2 = this.f98817a;
        AbstractC19074t.m100207e(list2, "listConversations");
        synchronized (list2) {
            m104453m(list);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: f */
    public final void m104459f(ThreadStorageInfo threadStorageInfo) {
        Object obj;
        List m131177E0;
        List m131187O0;
        int m131511r;
        AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                List list2 = this.f98817a;
                AbstractC19074t.m100207e(list2, "listConversations");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((ThreadStorageInfo) obj).m74822z(), threadStorageInfo.m74822z())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ThreadStorageInfo threadStorageInfo2 = (ThreadStorageInfo) obj;
                if (threadStorageInfo2 != null) {
                    ArrayList m74799j = threadStorageInfo2.m74799j();
                    m131511r = AbstractC25370t.m131511r(m74799j, 10);
                    ArrayList arrayList = new ArrayList(m131511r);
                    Iterator it2 = m74799j.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C13380a(0, null, false, false, (C17945a0) it2.next(), null, 0L, 111, null));
                    }
                    m104453m(arrayList);
                }
                List list3 = this.f98817a;
                AbstractC19074t.m100207e(list3, "listConversations");
                m131177E0 = AbstractC25332a0.m131177E0(list3, new c());
                m131187O0 = AbstractC25332a0.m131187O0(m131177E0);
                m104465n(m131187O0);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final List m104460h() {
        InterfaceC23898g m131191S;
        InterfaceC23898g m125023l;
        InterfaceC23898g m125030s;
        InterfaceC23898g m125020i;
        InterfaceC23898g m125030s2;
        List m125032u;
        int m131511r;
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                ArrayList arrayList = new ArrayList();
                List list2 = this.f98817a;
                AbstractC19074t.m100207e(list2, "listConversations");
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ArrayList m74799j = ((ThreadStorageInfo) it.next()).m74799j();
                    m131511r = AbstractC25370t.m131511r(m74799j, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    Iterator it2 = m74799j.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C13380a(0, null, false, false, (C17945a0) it2.next(), null, 0L, 111, null));
                    }
                    arrayList.addAll(arrayList2);
                }
                m131191S = AbstractC25332a0.m131191S(arrayList);
                m125023l = AbstractC23906o.m125023l(m131191S, d.f98821q);
                m125030s = AbstractC23906o.m125030s(m125023l, new f());
                m125020i = AbstractC23906o.m125020i(m125030s, e.f98822q);
                m125030s2 = AbstractC23906o.m125030s(m125020i, new g());
                m125032u = AbstractC23906o.m125032u(m125030s2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m125032u;
    }

    /* renamed from: i */
    public final List m104461i() {
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        if (list.size() > 1) {
            AbstractC25376w.m131534w(list, new h());
        }
        List list2 = this.f98817a;
        AbstractC19074t.m100207e(list2, "listConversations");
        return list2;
    }

    /* renamed from: j */
    public final List m104462j(String str) {
        Object obj;
        List m131502j;
        int m131511r;
        AbstractC19074t.m100208f(str, "ownerId");
        List list = this.f98817a;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                List list2 = this.f98817a;
                AbstractC19074t.m100207e(list2, "listConversations");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((ThreadStorageInfo) obj).m74822z(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) obj;
                if (threadStorageInfo == null) {
                    m131502j = AbstractC25368s.m131502j();
                    return m131502j;
                }
                ArrayList m74799j = threadStorageInfo.m74799j();
                m131511r = AbstractC25370t.m131511r(m74799j, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it2 = m74799j.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C13380a(0, null, false, false, (C17945a0) it2.next(), null, 0L, 111, null));
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final long m104463k() {
        long m131178F0;
        synchronized (this.f98820d) {
            Collection values = this.f98820d.values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            m131178F0 = AbstractC25332a0.m131178F0(values);
        }
        return m131178F0;
    }

    /* renamed from: l */
    public final void m104464l() {
        this.f98817a.clear();
        this.f98818b.clear();
        this.f98819c.clear();
        this.f98820d.clear();
    }

    /* renamed from: n */
    public final void m104465n(List list) {
        AbstractC19074t.m100208f(list, "loadedConversations");
        List list2 = this.f98817a;
        AbstractC19074t.m100207e(list2, "listConversations");
        synchronized (list2) {
            this.f98817a.clear();
            this.f98817a.addAll(list);
        }
    }
}
