package p398oo;

import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import ln0.AbstractC22543l;
import on0.AbstractC24340u;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p398oo.C24377r;
import p509sp.C26359h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;

/* renamed from: oo.e */
/* loaded from: classes4.dex */
public final class C24354e {

    /* renamed from: a */
    private final int f117552a;

    /* renamed from: b */
    private int f117553b;

    /* renamed from: c */
    private final Map f117554c = new LinkedHashMap();

    /* renamed from: d */
    private final List f117555d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117556q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f117556q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24377r c24377r) {
            AbstractC19074t.m100208f(c24377r, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c24377r.m127495a(), this.f117556q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117557q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f117557q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24377r c24377r) {
            AbstractC19074t.m100208f(c24377r, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c24377r.m127495a(), this.f117557q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117558q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f117558q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f117558q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C3000l0 f117559q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3000l0 c3000l0) {
            super(1);
            this.f117559q = c3000l0;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24377r c24377r) {
            AbstractC19074t.m100208f(c24377r, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c24377r.m127495a(), this.f117559q.f11895q));
        }
    }

    public C24354e(int i11) {
        this.f117552a = i11;
    }

    /* renamed from: A */
    private final void m127309A(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "FEED_LIST_WRAPPER", new c(str));
    }

    /* renamed from: D */
    private final void m127310D(C3000l0 c3000l0) {
        this.f117554c.remove(c3000l0.f11895q);
        AbstractC25378x.m131542D(this.f117555d, new d(c3000l0));
    }

    /* renamed from: E */
    private final C3000l0 m127311E(C3000l0 c3000l0, boolean z11) {
        String str;
        boolean m127149O;
        if (c3000l0.m14322a0() == null) {
            return null;
        }
        if (z11) {
            C3000l0 c3000l02 = null;
            for (C3000l0 c3000l03 : this.f117554c.values()) {
                if (c3000l03 != null && (str = c3000l03.f11895q) != null) {
                    AbstractC19074t.m100205c(str);
                    String str2 = c3000l0.f11895q;
                    if (str2 == null) {
                        str2 = "";
                    } else {
                        AbstractC19074t.m100205c(str2);
                    }
                    m127149O = AbstractC24342w.m127149O(str, str2, false, 2, null);
                    if (m127149O && c3000l0.m14322a0() != null) {
                        int size = c3000l03.f11899s.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            C3020p0 c3020p0 = (C3020p0) c3000l03.f11899s.get(i11);
                            if (c3020p0 != null && AbstractC19074t.m100204b(c3020p0.f12057p, c3000l0.f11895q)) {
                                AbstractC20826v0.m108821m(c3020p0, c3000l0.m14322a0());
                                c3020p0.m14534x0(true);
                                c3000l02 = c3000l03;
                            }
                        }
                        c3000l03.m14298H1();
                    }
                }
            }
            return c3000l02;
        }
        if (!this.f117554c.containsKey(c3000l0.f11895q)) {
            return null;
        }
        Map map = this.f117554c;
        String str3 = c3000l0.f11895q;
        AbstractC19074t.m100207e(str3, "feedContentId");
        map.put(str3, c3000l0);
        return c3000l0;
    }

    /* renamed from: a */
    private final void m127312a(C3000l0 c3000l0) {
        String str = c3000l0.f11895q;
        if (!this.f117554c.containsKey(str)) {
            List list = this.f117555d;
            C24377r.a aVar = C24377r.Companion;
            AbstractC19074t.m100205c(str);
            list.add(aVar.m127497a(str));
        }
        c3000l0.f11896q0 = m127337w();
        Map map = this.f117554c;
        AbstractC19074t.m100205c(str);
        map.put(str, c3000l0);
    }

    /* renamed from: c */
    private final void m127313c(C3000l0 c3000l0, C24377r.b bVar) {
        String str = c3000l0.f11895q;
        if (c3000l0.m14281A0()) {
            List list = c3000l0.f11899s;
            AbstractC19074t.m100207e(list, "listNewFeed");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((C3020p0) it.next()).f12057p;
                if (this.f117554c.containsKey(str2)) {
                    this.f117554c.remove(str2);
                    AbstractC25378x.m131542D(this.f117555d, new a(str2));
                }
            }
        }
        if (this.f117554c.containsKey(str)) {
            AbstractC25378x.m131542D(this.f117555d, new b(str));
        }
        c3000l0.f11896q0 = m127337w();
        Map map = this.f117554c;
        AbstractC19074t.m100205c(str);
        map.put(str, c3000l0);
        this.f117555d.add(0, new C24377r(str, bVar));
    }

    /* renamed from: e */
    static /* synthetic */ void m127314e(C24354e c24354e, C3000l0 c3000l0, C24377r.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bVar = C24377r.b.f117731p;
        }
        c24354e.m127313c(c3000l0, bVar);
    }

    /* renamed from: r */
    private final List m127315r() {
        int m131511r;
        List m127316s = m127316s();
        m131511r = AbstractC25370t.m131511r(m127316s, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m127316s.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24377r) it.next()).m127495a());
        }
        return arrayList;
    }

    /* renamed from: s */
    private final List m127316s() {
        List list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C24377r) obj).m127496b() == C24377r.b.f117731p) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public final void m127317B(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "function");
        Set entrySet = this.f117554c.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            C3000l0 c3000l0 = (C3000l0) ((Map.Entry) it.next()).getValue();
            if (c3000l0 == null || !((Boolean) interfaceC18505l.mo205i9(c3000l0)).booleanValue()) {
                c3000l0 = null;
            }
            if (c3000l0 != null) {
                arrayList.add(c3000l0);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m127310D((C3000l0) it2.next());
        }
    }

    /* renamed from: C */
    public final void m127318C(int i11, int i12) {
        List m131199Y;
        C3000l0 c3000l0;
        C3000l0 c3000l02;
        List<C24377r> list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        for (C24377r c24377r : list) {
            if (c24377r.m127496b() == C24377r.b.f117732q && (c3000l02 = (C3000l0) this.f117554c.get(c24377r.m127495a())) != null && c3000l02.f11893p == i11) {
                c3000l0 = (C3000l0) this.f117554c.get(c24377r.m127495a());
            } else {
                c3000l0 = null;
            }
            if (c3000l0 != null) {
                arrayList.add(c3000l0);
            }
        }
        m131199Y = AbstractC25332a0.m131199Y(arrayList, i12);
        Iterator it = m131199Y.iterator();
        while (it.hasNext()) {
            m127310D((C3000l0) it.next());
        }
    }

    /* renamed from: F */
    public final C3000l0 m127319F(C3000l0 c3000l0, boolean z11) {
        String str;
        C3020p0 m14322a0;
        JSONObject m14474E0;
        AbstractC19074t.m100208f(c3000l0, "newFeed");
        C3000l0 m127311E = m127311E(c3000l0, z11);
        if (m127311E == null && !z11) {
            m127313c(c3000l0, C24377r.b.f117733r);
            m127309A("syncNewGeneratedFeed - feed post: " + c3000l0.m14322a0().m14474E0().toString(4));
            return c3000l0;
        }
        if (m127311E != null && (m14322a0 = m127311E.m14322a0()) != null && (m14474E0 = m14322a0.m14474E0()) != null) {
            str = m14474E0.toString(4);
        } else {
            str = null;
        }
        m127309A("syncNewGeneratedFeed - feed edit: " + str);
        return m127311E;
    }

    /* renamed from: b */
    public final void m127320b(List list) {
        AbstractC19074t.m100208f(list, "newFeeds");
        this.f117553b++;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m127312a((C3000l0) it.next());
        }
    }

    /* renamed from: d */
    public final void m127321d(List list) {
        List m131225y0;
        AbstractC19074t.m100208f(list, "newFeeds");
        m131225y0 = AbstractC25332a0.m131225y0(list);
        Iterator it = m131225y0.iterator();
        while (it.hasNext()) {
            m127314e(this, (C3000l0) it.next(), null, 2, null);
        }
    }

    /* renamed from: f */
    public final void m127322f() {
        this.f117553b = 0;
        this.f117554c.clear();
        this.f117555d.clear();
    }

    /* renamed from: g */
    public final void m127323g(List list) {
        AbstractC19074t.m100208f(list, "feedItemIds");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3000l0 m127325i = m127325i((String) it.next());
            if (m127325i != null) {
                arrayList.add(m127325i);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m127310D((C3000l0) it2.next());
        }
    }

    /* renamed from: h */
    public final List m127324h(String str) {
        C3000l0 c3000l0;
        AbstractC19074t.m100208f(str, "userId");
        List<String> m127335u = m127335u();
        ArrayList arrayList = new ArrayList();
        for (String str2 : m127335u) {
            C3000l0 c3000l02 = (C3000l0) this.f117554c.get(str2);
            if (c3000l02 != null && c3000l02.m14356r0(str)) {
                c3000l0 = (C3000l0) this.f117554c.get(str2);
            } else {
                c3000l0 = null;
            }
            if (c3000l0 != null) {
                arrayList.add(c3000l0);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final C3000l0 m127325i(String str) {
        boolean m127149O;
        C3000l0 c3000l0;
        AbstractC19074t.m100208f(str, "id");
        if (this.f117554c.containsKey(str)) {
            return (C3000l0) this.f117554c.get(str);
        }
        for (Map.Entry entry : this.f117554c.entrySet()) {
            m127149O = AbstractC24342w.m127149O((CharSequence) entry.getKey(), str, false, 2, null);
            if (m127149O) {
                c3000l0 = (C3000l0) entry.getValue();
            } else {
                c3000l0 = null;
            }
            if (c3000l0 != null) {
                return c3000l0;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final String m127326j(String str) {
        String str2;
        boolean m127149O;
        AbstractC19074t.m100208f(str, "id");
        if (!this.f117554c.containsKey(str)) {
            Iterator it = this.f117554c.entrySet().iterator();
            do {
                str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                m127149O = AbstractC24342w.m127149O((CharSequence) entry.getKey(), str, false, 2, null);
                if (m127149O) {
                    str2 = (String) entry.getKey();
                }
            } while (str2 == null);
            return str2;
        }
        return str;
    }

    /* renamed from: k */
    public final List m127327k() {
        List m131179G0;
        String str;
        List<C24377r> list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        for (C24377r c24377r : list) {
            if (c24377r.m127496b() != C24377r.b.f117732q && this.f117554c.get(c24377r.m127495a()) == null) {
                str = c24377r.m127495a();
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        m131179G0 = AbstractC25332a0.m131179G0(arrayList, 20);
        return m131179G0;
    }

    /* renamed from: l */
    public final List m127328l() {
        String str;
        List<C24377r> list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        for (C24377r c24377r : list) {
            if (c24377r.m127496b() != C24377r.b.f117732q && this.f117554c.get(c24377r.m127495a()) == null) {
                str = c24377r.m127495a();
            } else {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final String m127329m() {
        String str;
        Object obj;
        Map map = this.f117554c;
        List m127335u = m127335u();
        ListIterator listIterator = m127335u.listIterator(m127335u.size());
        while (true) {
            str = null;
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                C3000l0 c3000l0 = (C3000l0) this.f117554c.get((String) obj);
                if (c3000l0 != null && !c3000l0.m14375y0()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3000l0 c3000l02 = (C3000l0) map.get(obj);
        if (c3000l02 != null) {
            str = c3000l02.m14331f0();
        }
        if (str == null) {
            return "0";
        }
        return str;
    }

    /* renamed from: n */
    public final long m127330n() {
        Object m131206f0;
        Comparable m131218r0;
        boolean m127120J;
        List m127132B0;
        List m131187O0;
        int m131511r;
        Long m127109o;
        long j11;
        Long m127109o2;
        m131206f0 = AbstractC25332a0.m131206f0(m127315r());
        String str = (String) m131206f0;
        if (str == null) {
            str = "0";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m127315r().iterator();
        while (true) {
            long j12 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            m127120J = AbstractC24341v.m127120J(str2, "GROUP", false, 2, null);
            if (!m127120J) {
                m127109o2 = AbstractC24340u.m127109o(str2);
                if (m127109o2 != null) {
                    j12 = m127109o2.longValue();
                }
                arrayList.add(Long.valueOf(j12));
            } else {
                m127132B0 = AbstractC24342w.m127132B0(str, new String[]{"_"}, false, 0, 6, null);
                m131187O0 = AbstractC25332a0.m131187O0(m127132B0);
                AbstractC25378x.m131543E(m131187O0);
                List list = m131187O0;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m127109o = AbstractC24340u.m127109o((String) it2.next());
                    if (m127109o != null) {
                        j11 = m127109o.longValue();
                    } else {
                        j11 = 0;
                    }
                    arrayList2.add(Long.valueOf(j11));
                }
                arrayList.addAll(arrayList2);
            }
        }
        m131218r0 = AbstractC25332a0.m131218r0(arrayList);
        Long l11 = (Long) m131218r0;
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    /* renamed from: o */
    public final List m127331o() {
        List list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3000l0 c3000l0 = (C3000l0) this.f117554c.get(((C24377r) it.next()).m127495a());
            if (c3000l0 != null) {
                arrayList.add(c3000l0);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final int m127332p(C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        Iterator it = this.f117555d.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!AbstractC19074t.m100204b(((C24377r) it.next()).m127495a(), c3000l0.f11895q)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final int m127333q(String str) {
        boolean m127149O;
        AbstractC19074t.m100208f(str, "feedId");
        Iterator it = this.f117555d.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            m127149O = AbstractC24342w.m127149O(((C24377r) it.next()).m127495a(), str, false, 2, null);
            if (!m127149O) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: t */
    public final int m127334t() {
        return this.f117553b;
    }

    /* renamed from: u */
    public final List m127335u() {
        int m131511r;
        List m127336v = m127336v();
        m131511r = AbstractC25370t.m131511r(m127336v, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m127336v.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24377r) it.next()).m127495a());
        }
        return arrayList;
    }

    /* renamed from: v */
    public final List m127336v() {
        List list = this.f117555d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C24377r) obj).m127496b() != C24377r.b.f117732q) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public int m127337w() {
        return this.f117552a;
    }

    /* renamed from: x */
    public final boolean m127338x(String str) {
        boolean m127149O;
        AbstractC19074t.m100208f(str, "feedItemId");
        Set keySet = this.f117554c.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            m127149O = AbstractC24342w.m127149O((String) it.next(), str, false, 2, null);
            if (m127149O) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final void m127339y(int i11, C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        c3000l0.f11896q0 = m127337w();
        Map map = this.f117554c;
        String str = c3000l0.f11895q;
        AbstractC19074t.m100207e(str, "feedContentId");
        map.put(str, c3000l0);
        List list = this.f117555d;
        C24377r.a aVar = C24377r.Companion;
        String str2 = c3000l0.f11895q;
        AbstractC19074t.m100207e(str2, "feedContentId");
        list.add(i11, aVar.m127498b(str2));
    }

    /* renamed from: z */
    public final void m127340z(List list) {
        int m131511r;
        int m131511r2;
        int m131400e;
        int m116580c;
        AbstractC19074t.m100208f(list, "orderFeeds");
        this.f117553b = 0;
        this.f117554c.clear();
        Map map = this.f117554c;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24377r) it.next()).m127495a());
        }
        m131511r2 = AbstractC25370t.m131511r(arrayList, 10);
        m131400e = AbstractC25361o0.m131400e(m131511r2);
        m116580c = AbstractC22543l.m116580c(m131400e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, null);
        }
        map.putAll(linkedHashMap);
        this.f117555d.addAll(list);
    }
}
