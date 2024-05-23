package ph;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7958c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import on0.AbstractC24342w;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.C24865v;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;

/* renamed from: ph.d */
/* loaded from: classes3.dex */
public final class C24751d {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private static final Comparator f118838f = new Comparator() { // from class: ph.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m128557b;
            m128557b = C24751d.m128557b((C24753f) obj, (C24753f) obj2);
            return m128557b;
        }
    };

    /* renamed from: a */
    private final MessageId f118839a;

    /* renamed from: b */
    private final ArrayList f118840b;

    /* renamed from: c */
    private final InterfaceC29232g f118841c;

    /* renamed from: d */
    private final InterfaceC29232g f118842d;

    /* renamed from: e */
    private final HashMap f118843e;

    /* renamed from: ph.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ph.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            ArrayList m128565g = C24751d.this.m128565g();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : m128565g) {
                Integer valueOf = Integer.valueOf(((C24753f) obj).m128601n());
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(obj);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ph.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            ArrayList m128565g = C24751d.this.m128565g();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : m128565g) {
                String m128597j = ((C24753f) obj).m128597j();
                Object obj2 = linkedHashMap.get(m128597j);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(m128597j, obj2);
                }
                ((List) obj2).add(obj);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ph.d$d */
    /* loaded from: classes3.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b((Long) ((C24865v) obj).m129233e(), (Long) ((C24865v) obj2).m129233e());
            return m135478b;
        }
    }

    /* renamed from: ph.d$e */
    /* loaded from: classes3.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b((Integer) ((C24865v) obj2).m129234f(), (Integer) ((C24865v) obj).m129234f());
            return m135478b;
        }
    }

    /* renamed from: ph.d$f */
    /* loaded from: classes3.dex */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C24753f) obj).m128598k()), Long.valueOf(((C24753f) obj2).m128598k()));
            return m135478b;
        }
    }

    /* renamed from: ph.d$g */
    /* loaded from: classes3.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((C24753f) obj2).m128594g()), Integer.valueOf(((C24753f) obj).m128594g()));
            return m135478b;
        }
    }

    /* renamed from: ph.d$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C24753f f118846q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C24753f c24753f) {
            super(1);
            this.f118846q = c24753f;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24753f c24753f) {
            boolean z11;
            AbstractC19074t.m100208f(c24753f, "predicate");
            if (c24753f.m128601n() == this.f118846q.m128601n()) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: ph.d$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C24753f f118847q;

        /* renamed from: r */
        final /* synthetic */ String f118848r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C24753f c24753f, String str) {
            super(1);
            this.f118847q = c24753f;
            this.f118848r = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24753f c24753f) {
            boolean z11;
            AbstractC19074t.m100208f(c24753f, "predicate");
            if (c24753f.m128601n() == this.f118847q.m128601n() && AbstractC19074t.m100204b(c24753f.m128597j(), this.f118848r)) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C24751d(MessageId messageId, ArrayList arrayList) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(arrayList, "listReaction");
        this.f118839a = messageId;
        this.f118840b = arrayList;
        this.f118841c = AbstractC29233h.m145990a(new b());
        this.f118842d = AbstractC29233h.m145990a(new c());
        this.f118843e = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m128557b(C24753f c24753f, C24753f c24753f2) {
        int m104526b;
        int m104525a;
        if (c24753f.m128594g() != c24753f2.m128594g()) {
            m104525a = AbstractC20104d.m104525a(c24753f2.m128594g() - c24753f.m128594g());
            return m104525a;
        }
        m104526b = AbstractC20104d.m104526b(c24753f.m128598k() - c24753f2.m128598k());
        return m104526b;
    }

    /* renamed from: e */
    private final String m128558e(int i11) {
        CharSequence m127168X0;
        List m128559h = m128559h(i11);
        int i12 = 3;
        if (m128559h.size() < 3) {
            i12 = m128559h.size();
        }
        Iterator it = m128559h.subList(0, i12).iterator();
        String str = "";
        while (it.hasNext()) {
            str = ((Object) str) + ((C24753f) it.next()).m128595h() + " ";
        }
        m127168X0 = AbstractC24342w.m127168X0(str);
        return m127168X0.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:            r2 = qm0.AbstractC25332a0.m131177E0(r2, ph.C24751d.f118838f);     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m128559h(int i11) {
        List m131177E0;
        List list = (List) m128567j().get(Integer.valueOf(i11));
        if (list == null || m131177E0 == null) {
            return new ArrayList();
        }
        return m131177E0;
    }

    /* renamed from: k */
    private final Map m128560k() {
        return (Map) this.f118842d.getValue();
    }

    /* renamed from: v */
    private final void m128561v() {
        this.f118841c.reset();
        this.f118842d.reset();
    }

    /* renamed from: c */
    public final List m128562c() {
        List m131185M0;
        List m131177E0;
        List m131177E02;
        int m131511r;
        Map m128567j = m128567j();
        ArrayList arrayList = new ArrayList(m128567j.size());
        for (Map.Entry entry : m128567j.entrySet()) {
            Object key = entry.getKey();
            Iterator it = ((Iterable) entry.getValue()).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long m128598k = ((C24753f) next).m128598k();
                    do {
                        Object next2 = it.next();
                        long m128598k2 = ((C24753f) next2).m128598k();
                        if (m128598k < m128598k2) {
                            next = next2;
                            m128598k = m128598k2;
                        }
                    } while (it.hasNext());
                }
                Long valueOf = Long.valueOf(((C24753f) next).m128598k());
                Iterator it2 = ((Iterable) entry.getValue()).iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    i11 += ((C24753f) it2.next()).m128594g();
                }
                arrayList.add(new C24865v(key, valueOf, Integer.valueOf(i11)));
            } else {
                throw new NoSuchElementException();
            }
        }
        m131185M0 = AbstractC25332a0.m131185M0(arrayList);
        m131177E0 = AbstractC25332a0.m131177E0(m131185M0, new d());
        m131177E02 = AbstractC25332a0.m131177E0(m131177E0, new e());
        List list = m131177E02;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((C24865v) it3.next()).m129232d()).intValue()));
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final List m128563d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m128562c().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            arrayList.add(C24753f.Companion.m128616c(intValue, m128558e(intValue), m128574r(intValue)));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24751d)) {
            return false;
        }
        C24751d c24751d = (C24751d) obj;
        return AbstractC19074t.m100204b(this.f118839a, c24751d.f118839a) && AbstractC19074t.m100204b(this.f118840b, c24751d.f118840b);
    }

    /* renamed from: f */
    public final List m128564f(String str) {
        List m131177E0;
        AbstractC19074t.m100208f(str, "reactionTypeKey");
        ArrayList arrayList = new ArrayList();
        List list = (List) m128560k().get(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        m131177E0 = AbstractC25332a0.m131177E0(arrayList, f118838f);
        return m131177E0;
    }

    /* renamed from: g */
    public final ArrayList m128565g() {
        return this.f118840b;
    }

    public int hashCode() {
        return (this.f118839a.hashCode() * 31) + this.f118840b.hashCode();
    }

    /* renamed from: i */
    public final List m128566i(boolean z11) {
        List m131177E0;
        List m131177E02;
        Object m131205e0;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : m128560k().entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            m131205e0 = AbstractC25332a0.m131205e0(list);
            C24753f c24753f = (C24753f) m131205e0;
            String m128595h = c24753f.m128595h();
            int m128599l = c24753f.m128599l();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                long m128598k = ((C24753f) it.next()).m128598k();
                while (it.hasNext()) {
                    long m128598k2 = ((C24753f) it.next()).m128598k();
                    if (m128598k < m128598k2) {
                        m128598k = m128598k2;
                    }
                }
                int m128573q = m128573q(str);
                C24753f m128615b = C24753f.Companion.m128615b(m128599l, m128595h);
                m128615b.m128609w(m128573q);
                m128615b.m128610x(m128598k);
                arrayList.add(m128615b);
            } else {
                throw new NoSuchElementException();
            }
        }
        if (z11) {
            m131177E0 = AbstractC25332a0.m131177E0(arrayList, new f());
            m131177E02 = AbstractC25332a0.m131177E0(m131177E0, new g());
            return m131177E02;
        }
        return arrayList;
    }

    /* renamed from: j */
    public final Map m128567j() {
        return (Map) this.f118841c.getValue();
    }

    /* renamed from: l */
    public final MessageId m128568l() {
        return this.f118839a;
    }

    /* renamed from: m */
    public final List m128569m() {
        int m131511r;
        List m128566i = m128566i(true);
        int i11 = 3;
        if (m128566i.size() < 3) {
            i11 = m128566i.size();
        }
        List subList = m128566i.subList(0, i11);
        m131511r = AbstractC25370t.m131511r(subList, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24753f) it.next()).m128596i());
        }
        return arrayList;
    }

    /* renamed from: n */
    public final C24753f m128570n(int i11) {
        List list = (List) m128567j().get(Integer.valueOf(i11));
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long m128598k = ((C24753f) next).m128598k();
                    do {
                        Object next2 = it.next();
                        long m128598k2 = ((C24753f) next2).m128598k();
                        if (m128598k < m128598k2) {
                            next = next2;
                            m128598k = m128598k2;
                        }
                    } while (it.hasNext());
                }
                return (C24753f) next;
            }
            throw new NoSuchElementException();
        }
        return null;
    }

    /* renamed from: o */
    public final int m128571o() {
        return m128567j().size();
    }

    /* renamed from: p */
    public final int m128572p() {
        Iterator it = this.f118840b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((C24753f) it.next()).m128594g();
        }
        return i11;
    }

    /* renamed from: q */
    public final int m128573q(String str) {
        AbstractC19074t.m100208f(str, "reactionTypeKey");
        List list = (List) m128560k().get(str);
        int i11 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i11 += ((C24753f) it.next()).m128594g();
            }
        }
        return i11;
    }

    /* renamed from: r */
    public final int m128574r(int i11) {
        List list = (List) m128567j().get(Integer.valueOf(i11));
        int i12 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i12 += ((C24753f) it.next()).m128594g();
            }
        }
        return i12;
    }

    /* renamed from: s */
    public final boolean m128575s() {
        if (m128572p() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:            if (ph.C24753f.m128593p(r1, 0, r10.m128598k(), 1, null) == null) goto L14;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m128576t(int i11, C24753f c24753f) {
        AbstractC19074t.m100208f(c24753f, "reactionType");
        List list = (List) m128567j().get(Integer.valueOf(i11));
        C24753f c24753f2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC19074t.m100204b(((C24753f) next).m128597j(), c24753f.m128597j())) {
                    c24753f2 = next;
                    break;
                }
            }
            c24753f2 = c24753f2;
        }
        if (c24753f2 != null) {
        }
        this.f118840b.add(C24753f.Companion.m128617d(c24753f.m128599l(), c24753f.m128595h(), i11, c24753f.m128598k()));
        m128561v();
        if (c24753f2 == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ReactionMsgInfo(messageId=" + this.f118839a + ", listReaction=" + this.f118840b + ")";
    }

    /* renamed from: u */
    public final void m128577u(C24753f c24753f) {
        AbstractC19074t.m100208f(c24753f, "reactionType");
        if (!c24753f.m128605s()) {
            return;
        }
        if (c24753f.m128606t()) {
            AbstractC25378x.m131542D(this.f118840b, new h(c24753f));
        } else {
            AbstractC25378x.m131542D(this.f118840b, new i(c24753f, C24753f.Companion.m128621h(c24753f)));
        }
        m128561v();
        HashMap hashMap = this.f118843e;
        Integer valueOf = Integer.valueOf(c24753f.m128601n());
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(valueOf, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        if (c24753f.m128606t()) {
            arrayList.clear();
            arrayList.add(c24753f);
        } else if (arrayList.isEmpty() || !((C24753f) arrayList.get(0)).m128606t()) {
            arrayList.add(c24753f);
        }
    }

    /* renamed from: w */
    public final void m128578w() {
        Object m131205e0;
        Object m131205e02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f118839a);
        Collection<ArrayList> values = this.f118843e.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        for (ArrayList arrayList2 : values) {
            AbstractC19074t.m100205c(arrayList2);
            if (!arrayList2.isEmpty()) {
                m131205e0 = AbstractC25332a0.m131205e0(arrayList2);
                if (((C24753f) m131205e0).m128606t()) {
                    C7958c m41593b = C7958c.Companion.m41593b();
                    String m41048l = this.f118839a.m41048l();
                    m131205e02 = AbstractC25332a0.m131205e0(arrayList2);
                    m41593b.m41584h(m41048l, ((C24753f) m131205e02).m128601n(), arrayList);
                } else {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C7958c.Companion.m41593b().m41585i(this.f118839a.m41048l(), (C24753f) it.next(), arrayList);
                    }
                }
            }
        }
        this.f118843e.clear();
    }

    /* renamed from: x */
    public final C24751d m128579x() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f118840b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            C24753f c24753f = (C24753f) obj;
            if (c24753f.m128603q() && c24753f.m128604r()) {
                arrayList3.add(obj);
            }
        }
        arrayList.addAll(arrayList3);
        return new C24751d(this.f118839a, arrayList);
    }

    /* renamed from: y */
    public final C24751d m128580y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f118840b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            C24753f c24753f = (C24753f) obj;
            if (c24753f.m128603q() && !c24753f.m128604r()) {
                arrayList3.add(obj);
            }
        }
        arrayList.addAll(arrayList3);
        return new C24751d(this.f118839a, arrayList);
    }
}
