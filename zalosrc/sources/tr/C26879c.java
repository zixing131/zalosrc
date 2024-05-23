package tr;

import bo.C2952b2;
import bo.C2956c1;
import bo.C2998k3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3030r0;
import bo.C3055x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.NoWhenBranchMatchedException;
import p304ks.C21933s;
import p398oo.C24373n0;
import p509sp.C26359h;
import p509sp.C26360i;
import p583vq.C28594q;
import pr.C24906b;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;
import tn.C26747f0;
import tn.C26767v;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: tr.c */
/* loaded from: classes4.dex */
public final class C26879c {

    /* renamed from: a */
    public static final C26879c f127187a = new C26879c();

    /* renamed from: b */
    private static final List f127188b;

    /* renamed from: c */
    private static final List f127189c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final b f127190a;

        /* renamed from: b */
        private final List f127191b;

        public a(b bVar, List list) {
            AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(list, "data");
            this.f127190a = bVar;
            this.f127191b = list;
        }

        /* renamed from: a */
        public final List m138476a() {
            return this.f127191b;
        }

        /* renamed from: b */
        public final b m138477b() {
            return this.f127190a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127190a == aVar.f127190a && AbstractC19074t.m100204b(this.f127191b, aVar.f127191b);
        }

        public int hashCode() {
            return (this.f127190a.hashCode() * 31) + this.f127191b.hashCode();
        }

        public String toString() {
            return "DynamicFeedData(type=" + this.f127190a + ", data=" + this.f127191b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: tr.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements g {

        /* renamed from: q */
        public static final b f127192q = new b("SUGGEST_FRIEND", 0, 5);

        /* renamed from: r */
        public static final b f127193r = new b("LAST_ITEM_PROMOTION", 1, 6);

        /* renamed from: s */
        public static final b f127194s = new b("ADS", 2, 1);

        /* renamed from: t */
        public static final b f127195t = new b("VIDEO_CHANNEL", 3, 2);

        /* renamed from: u */
        private static final /* synthetic */ b[] f127196u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f127197v;

        /* renamed from: p */
        private final int f127198p;

        static {
            b[] m138478b = m138478b();
            f127196u = m138478b;
            f127197v = AbstractC30166b.m148796a(m138478b);
        }

        private b(String str, int i11, int i12) {
            this.f127198p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m138478b() {
            return new b[]{f127192q, f127193r, f127194s, f127195t};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f127196u.clone();
        }

        /* renamed from: c */
        public final int m138479c() {
            return this.f127198p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr.c$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final d f127199a;

        /* renamed from: b */
        private final List f127200b;

        public c(d dVar, List list) {
            AbstractC19074t.m100208f(dVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(list, "data");
            this.f127199a = dVar;
            this.f127200b = list;
        }

        /* renamed from: a */
        public final List m138480a() {
            return this.f127200b;
        }

        /* renamed from: b */
        public final d m138481b() {
            return this.f127199a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f127199a == cVar.f127199a && AbstractC19074t.m100204b(this.f127200b, cVar.f127200b);
        }

        public int hashCode() {
            return (this.f127199a.hashCode() * 31) + this.f127200b.hashCode();
        }

        public String toString() {
            return "FixedFeedData(type=" + this.f127199a + ", data=" + this.f127200b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: tr.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements g {

        /* renamed from: q */
        public static final d f127201q = new d("BANNER", 0, 3);

        /* renamed from: r */
        public static final d f127202r = new d("MEMORY_ENTRY", 1, 4);

        /* renamed from: s */
        private static final /* synthetic */ d[] f127203s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f127204t;

        /* renamed from: p */
        private final int f127205p;

        static {
            d[] m138482b = m138482b();
            f127203s = m138482b;
            f127204t = AbstractC30166b.m148796a(m138482b);
        }

        private d(String str, int i11, int i12) {
            this.f127205p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m138482b() {
            return new d[]{f127201q, f127202r};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f127203s.clone();
        }

        /* renamed from: c */
        public final int m138483c() {
            return this.f127205p;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: tr.c$e */
    /* loaded from: classes4.dex */
    public static final class e implements g {

        /* renamed from: p */
        public static final e f127206p = new e("LOCAL_FEED", 0);

        /* renamed from: q */
        private static final /* synthetic */ e[] f127207q;

        /* renamed from: r */
        private static final /* synthetic */ InterfaceC30165a f127208r;

        static {
            e[] m138484b = m138484b();
            f127207q = m138484b;
            f127208r = AbstractC30166b.m148796a(m138484b);
        }

        private e(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m138484b() {
            return new e[]{f127206p};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f127207q.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: tr.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements g {

        /* renamed from: p */
        public static final f f127209p = new f("QUICK_CMT", 0);

        /* renamed from: q */
        public static final f f127210q = new f("SUGGEST_CMT", 1);

        /* renamed from: r */
        public static final f f127211r = new f("LOCAL_EDITED", 2);

        /* renamed from: s */
        private static final /* synthetic */ f[] f127212s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f127213t;

        static {
            f[] m138485b = m138485b();
            f127212s = m138485b;
            f127213t = AbstractC30166b.m148796a(m138485b);
        }

        private f(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ f[] m138485b() {
            return new f[]{f127209p, f127210q, f127211r};
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f127212s.clone();
        }
    }

    /* renamed from: tr.c$g */
    /* loaded from: classes4.dex */
    public interface g {
    }

    /* renamed from: tr.c$h */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f127214a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f127215b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f127216c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f127217d;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f127206p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f127214a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.f127201q.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[d.f127202r.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f127215b = iArr2;
            int[] iArr3 = new int[b.values().length];
            try {
                iArr3[b.f127192q.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[b.f127193r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[b.f127194s.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[b.f127195t.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f127216c = iArr3;
            int[] iArr4 = new int[f.values().length];
            try {
                iArr4[f.f127209p.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[f.f127210q.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[f.f127211r.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f127217d = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tr.c$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f127218q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.f127218q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f127218q;
        }
    }

    /* renamed from: tr.c$j */
    /* loaded from: classes4.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((a) obj).m138477b().m138479c()), Integer.valueOf(((a) obj2).m138477b().m138479c()));
            return m135478b;
        }
    }

    /* renamed from: tr.c$k */
    /* loaded from: classes4.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((c) obj).m138481b().m138483c()), Integer.valueOf(((c) obj2).m138481b().m138483c()));
            return m135478b;
        }
    }

    static {
        List m131505m;
        List m131505m2;
        b bVar = b.f127192q;
        b bVar2 = b.f127193r;
        b bVar3 = b.f127194s;
        f fVar = f.f127209p;
        f fVar2 = f.f127210q;
        m131505m = AbstractC25368s.m131505m(e.f127206p, d.f127201q, d.f127202r, bVar, bVar2, bVar3, b.f127195t, fVar, fVar2, f.f127211r);
        f127188b = m131505m;
        m131505m2 = AbstractC25368s.m131505m(bVar, bVar2, bVar3, fVar, fVar2);
        f127189c = m131505m2;
    }

    private C26879c() {
    }

    /* renamed from: a */
    private final List m138457a(int i11) {
        return i11 == 0 ? f127188b : f127189c;
    }

    /* renamed from: b */
    private final void m138458b(int i11, Map map) {
        List m138527g = C26883g.Companion.m138535a(i11).m138527g(3);
        ArrayList<C2998k3> arrayList = new ArrayList();
        for (Object obj : m138527g) {
            if (((C2998k3) obj).m14235c()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (C2998k3 c2998k3 : arrayList) {
                int i12 = c2998k3.f11846b;
                C26879c c26879c = f127187a;
                b bVar = b.f127194s;
                List list = c2998k3.f11845a;
                AbstractC19074t.m100207e(list, "suggestionFeeds");
                c26879c.m138473r(map, i12, new a(bVar, list));
            }
        }
    }

    /* renamed from: c */
    private final void m138459c(int i11, Map map) {
        List m138527g = C26883g.Companion.m138535a(i11).m138527g(2);
        ArrayList<C2998k3> arrayList = new ArrayList();
        for (Object obj : m138527g) {
            if (((C2998k3) obj).m14235c()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (C2998k3 c2998k3 : arrayList) {
                int i12 = c2998k3.f11846b;
                C26879c c26879c = f127187a;
                d dVar = d.f127201q;
                List list = c2998k3.f11845a;
                AbstractC19074t.m100207e(list, "suggestionFeeds");
                c26879c.m138474s(map, i12, new c(dVar, list));
            }
        }
    }

    /* renamed from: d */
    private final void m138460d(Map map) {
        List m131506n;
        List<C3000l0> m137656H = C26747f0.m137582I().m137656H();
        AbstractC19074t.m100205c(m137656H);
        for (C3000l0 c3000l0 : m137656H) {
            C2952b2 c2952b2 = c3000l0.f11881d0;
            if (c2952b2 != null) {
                int i11 = c2952b2.f11647a;
                C26879c c26879c = f127187a;
                d dVar = d.f127202r;
                m131506n = AbstractC25368s.m131506n(c3000l0);
                c26879c.m138474s(map, i11, new c(dVar, m131506n));
            }
        }
    }

    /* renamed from: e */
    private final void m138461e(Map map) {
        List m131506n;
        C3000l0 m114447V = C21933s.m114404I().m114447V();
        if (m114447V != null) {
            AbstractC19074t.m100207e(m114447V.f11876Y, "lstFriendSuggest");
            if (!r1.isEmpty()) {
                int i11 = m114447V.f11878a0;
                b bVar = b.f127192q;
                m131506n = AbstractC25368s.m131506n(m114447V);
                m138473r(map, i11, new a(bVar, m131506n));
            }
        }
    }

    /* renamed from: f */
    private final void m138462f(int i11, C2956c1 c2956c1, Map map) {
        Object m131205e0;
        if (!c2956c1.f11664c && C24373n0.f117718a.m127485a()) {
            List m138527g = C26883g.Companion.m138535a(i11).m138527g(4);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m138527g) {
                if (((C2998k3) obj).m14235c()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                m131205e0 = AbstractC25332a0.m131205e0(arrayList);
                C2998k3 c2998k3 = (C2998k3) m131205e0;
                int i12 = c2998k3.f11846b;
                b bVar = b.f127195t;
                List list = c2998k3.f11845a;
                AbstractC19074t.m100207e(list, "suggestionFeeds");
                m138473r(map, i12, new a(bVar, list));
            }
        }
    }

    /* renamed from: g */
    private final void m138463g(String str) {
        if (C26360i.f125213a.m135694c("FEED_TIMELINE")) {
            C26359h.f125209a.mo135685a("FEED_TIMELINE", "FEED_ORDER_HELPER", new i(str));
        }
    }

    /* renamed from: h */
    private final void m138464h(String str, List list) {
        int m131511r;
        try {
            if (C26360i.f125213a.m135694c("FEED_TIMELINE")) {
                List list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                int i11 = 0;
                for (Object obj : list2) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    C3000l0 c3000l0 = (C3000l0) obj;
                    arrayList.add(i12 + "." + c3000l0.f11895q + "." + c3000l0.f11893p);
                    i11 = i12;
                }
                m138463g(str + ": " + arrayList);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    private final List m138465i(List list, C2956c1 c2956c1, List list2, boolean z11) {
        List m131187O0;
        SortedMap m131403h;
        C3055x0 c3055x0;
        List m131506n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = c2956c1.f11663b;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i12 = h.f127216c[bVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f127187a.m138462f(i11, c2956c1, linkedHashMap);
                        }
                    } else {
                        f127187a.m138458b(i11, linkedHashMap);
                    }
                } else {
                    C3000l0 m114425K = C21933s.m114404I().m114425K();
                    boolean z12 = c2956c1.f11662a;
                    if (m114425K != null) {
                        c3055x0 = m114425K.f11879b0;
                    } else {
                        c3055x0 = null;
                    }
                    if (c3055x0 != null && !z11) {
                        int i13 = m114425K.f11880c0;
                        if (i13 == -1 && z12) {
                            AbstractC19074t.m100205c(m114425K);
                            arrayList.add(m114425K);
                        } else {
                            C26879c c26879c = f127187a;
                            AbstractC19074t.m100205c(m114425K);
                            m131506n = AbstractC25368s.m131506n(m114425K);
                            c26879c.m138473r(linkedHashMap, i13, new a(bVar, m131506n));
                        }
                    }
                }
            } else {
                f127187a.m138461e(linkedHashMap);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(list);
        m131403h = AbstractC25361o0.m131403h(linkedHashMap);
        for (Map.Entry entry : m131403h.entrySet()) {
            Integer num = (Integer) entry.getKey();
            List list3 = (List) entry.getValue();
            AbstractC19074t.m100205c(num);
            if (num.intValue() >= 0 && num.intValue() <= m131187O0.size()) {
                ArrayList arrayList2 = new ArrayList();
                AbstractC19074t.m100205c(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.addAll(((a) it2.next()).m138476a());
                }
                m131187O0.addAll(num.intValue(), arrayList2);
            }
        }
        if (!arrayList.isEmpty()) {
            m131187O0.addAll(arrayList);
        }
        m138464h("processDynamicPositionFeed", m131187O0);
        return m131187O0;
    }

    /* renamed from: j */
    private final List m138466j(List list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            ArrayList m137786e = C26767v.m137782d().m137786e();
            AbstractC19074t.m100207e(m137786e, "getListAsyncFeed(...)");
            ArrayList<C3000l0> arrayList2 = new ArrayList();
            ArrayList<C3000l0> arrayList3 = new ArrayList();
            Iterator it = m137786e.iterator();
            while (it.hasNext()) {
                C3000l0 m108788U0 = AbstractC20826v0.m108788U0((C3000l0) it.next());
                if (m108788U0 != null) {
                    if (m108788U0.m14377z0()) {
                        arrayList3.add(m108788U0);
                    } else if (m108788U0.m14290E0()) {
                        arrayList2.add(m108788U0);
                    }
                }
            }
            for (C3000l0 c3000l0 : arrayList3) {
                if (!c3000l0.m14322a0().m14488S()) {
                    arrayList.add(0, c3000l0);
                }
            }
            for (C3000l0 c3000l02 : arrayList2) {
                if (!c3000l02.m14322a0().m14488S()) {
                    arrayList.add(0, c3000l02);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return list;
        }
    }

    /* renamed from: k */
    private final List m138467k(List list) {
        try {
            ArrayList arrayList = new ArrayList(list);
            ArrayList m137786e = C26767v.m137782d().m137786e();
            AbstractC19074t.m100207e(m137786e, "getListAsyncFeed(...)");
            ArrayList<C3000l0> arrayList2 = new ArrayList();
            ArrayList<C3000l0> arrayList3 = new ArrayList();
            Iterator it = m137786e.iterator();
            while (it.hasNext()) {
                C3000l0 m108788U0 = AbstractC20826v0.m108788U0((C3000l0) it.next());
                if (m108788U0 != null) {
                    if (m108788U0.m14377z0()) {
                        arrayList3.add(m108788U0);
                    } else if (m108788U0.m14290E0()) {
                        arrayList2.add(m108788U0);
                    }
                }
            }
            for (C3000l0 c3000l0 : arrayList3) {
                if (c3000l0 != null && c3000l0.m14322a0().m14488S()) {
                    AbstractC20826v0.m108819l(c3000l0, arrayList);
                }
            }
            for (C3000l0 c3000l02 : arrayList2) {
                if (c3000l02 != null && c3000l02.m14322a0().m14488S()) {
                    AbstractC20826v0.m108819l(c3000l02, arrayList);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return list;
        }
    }

    /* renamed from: l */
    private final List m138468l(List list, C2956c1 c2956c1, List list2) {
        List m131187O0;
        SortedMap m131403h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = c2956c1.f11663b;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i12 = h.f127215b[((d) it.next()).ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    f127187a.m138460d(linkedHashMap);
                }
            } else {
                f127187a.m138459c(i11, linkedHashMap);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(list);
        m131403h = AbstractC25361o0.m131403h(linkedHashMap);
        for (Map.Entry entry : m131403h.entrySet()) {
            Integer num = (Integer) entry.getKey();
            List list3 = (List) entry.getValue();
            AbstractC19074t.m100205c(num);
            if (num.intValue() >= 0 && num.intValue() <= m131187O0.size()) {
                ArrayList arrayList = new ArrayList();
                AbstractC19074t.m100205c(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(((c) it2.next()).m138480a());
                }
                m131187O0.addAll(num.intValue(), arrayList);
            }
        }
        m138464h("processFixedPositionFeed", m131187O0);
        return m131187O0;
    }

    /* renamed from: m */
    private final List m138469m(List list, List list2) {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (h.f127214a[((e) it.next()).ordinal()] == 1) {
                m131185M0 = f127187a.m138466j(m131185M0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        m138464h("processHeader", m131185M0);
        return m131185M0;
    }

    /* renamed from: n */
    private final List m138470n(List list, List list2) {
        List m131187O0;
        m131187O0 = AbstractC25332a0.m131187O0(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i11 = h.f127217d[((f) it.next()).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m131187O0 = AbstractC25332a0.m131187O0(f127187a.m138467k(m131187O0));
                    }
                } else {
                    f127187a.m138472p(m131187O0);
                }
            } else {
                f127187a.m138471o(m131187O0);
            }
        }
        m138464h("processOthers", m131187O0);
        return m131187O0;
    }

    /* renamed from: o */
    private final void m138471o(List list) {
        C3020p0 m14322a0;
        try {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (!c3000l0.m14281A0() && c3000l0.m14322a0() != null && (m14322a0 = c3000l0.m14322a0()) != null) {
                        C28594q.m143005j().m143008f(m14322a0.f12057p);
                        m14322a0.m14509i();
                        List m143011k = C28594q.m143005j().m143011k(m14322a0.f12057p);
                        List list2 = m143011k;
                        if (list2 != null && !list2.isEmpty()) {
                            Iterator it2 = m143011k.iterator();
                            while (it2.hasNext()) {
                                m14322a0.m14497b((C3030r0) it2.next());
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    private final void m138472p(List list) {
        C3020p0 m14322a0;
        try {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (!c3000l0.m14281A0() && !c3000l0.m14283B0() && c3000l0.m14322a0() != null && (m14322a0 = c3000l0.m14322a0()) != null) {
                        C24906b c24906b = C24906b.f119505a;
                        String str = m14322a0.f12057p;
                        AbstractC19074t.m100207e(str, "fid");
                        m14322a0.f12053g0 = c24906b.m129551v(str);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    private final void m138473r(Map map, int i11, a aVar) {
        List m131506n;
        List list;
        if (i11 < 0) {
            return;
        }
        if (map.containsKey(Integer.valueOf(i11)) && (list = (List) map.get(Integer.valueOf(i11))) != null && (!list.isEmpty())) {
            List list2 = (List) map.get(Integer.valueOf(i11));
            if (list2 != null) {
                list2.add(aVar);
            }
            if (list2 != null && list2.size() > 1) {
                AbstractC25376w.m131534w(list2, new j());
                return;
            }
            return;
        }
        Integer valueOf = Integer.valueOf(i11);
        m131506n = AbstractC25368s.m131506n(aVar);
        map.put(valueOf, m131506n);
    }

    /* renamed from: s */
    private final void m138474s(Map map, int i11, c cVar) {
        List m131506n;
        List list;
        if (i11 < 0) {
            return;
        }
        if (map.containsKey(Integer.valueOf(i11)) && (list = (List) map.get(Integer.valueOf(i11))) != null && (!list.isEmpty())) {
            List list2 = (List) map.get(Integer.valueOf(i11));
            if (list2 != null) {
                list2.add(cVar);
            }
            if (list2 != null && list2.size() > 1) {
                AbstractC25376w.m131534w(list2, new k());
                return;
            }
            return;
        }
        Integer valueOf = Integer.valueOf(i11);
        m131506n = AbstractC25368s.m131506n(cVar);
        map.put(valueOf, m131506n);
    }

    /* renamed from: q */
    public final List m138475q(List list, C2956c1 c2956c1, int i11) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "originalList");
        AbstractC19074t.m100208f(c2956c1, "dataExtras");
        try {
            m131185M0 = AbstractC25332a0.m131185M0(list);
            List list2 = c2956c1.f11665d;
            boolean isEmpty = m131185M0.isEmpty();
            List m138457a = m138457a(i11);
            AbstractC19074t.m100207e(list2, "element");
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m138457a) {
                    if (list2.contains((g) obj)) {
                        arrayList.add(obj);
                    }
                }
                m138457a = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m138457a) {
                if (obj2 instanceof e) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : m138457a) {
                if (obj3 instanceof b) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : m138457a) {
                if (obj4 instanceof d) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : m138457a) {
                if (obj5 instanceof f) {
                    arrayList5.add(obj5);
                }
            }
            return m138470n(m138469m(m138468l(m138465i(m131185M0, c2956c1, arrayList3, isEmpty), c2956c1, arrayList4), arrayList2), arrayList5);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return list;
        }
    }
}
