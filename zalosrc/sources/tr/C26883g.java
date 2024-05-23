package tr;

import bo.C2981h1;
import bo.C2998k3;
import bo.C3000l0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p509sp.C26359h;
import p509sp.C26360i;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25378x;

/* renamed from: tr.g */
/* loaded from: classes4.dex */
public final class C26883g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC26880d f127241a;

    /* renamed from: b */
    private final int f127242b;

    /* renamed from: c */
    private final AtomicBoolean f127243c;

    /* renamed from: d */
    private final List f127244d;

    /* renamed from: e */
    private final Object f127245e;

    /* renamed from: tr.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26883g m138535a(int i11) {
            if (i11 == 0) {
                return b.f127246a.m138536a();
            }
            return b.f127246a.m138537b();
        }
    }

    /* renamed from: tr.g$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f127246a = new b();

        /* renamed from: b */
        private static C26883g f127247b;

        /* renamed from: c */
        private static C26883g f127248c;

        static {
            C26882f c26882f = C26882f.f127239a;
            f127247b = new C26883g(c26882f, 0, null);
            f127248c = new C26883g(c26882f, 1, null);
        }

        private b() {
        }

        /* renamed from: a */
        public final C26883g m138536a() {
            return f127247b;
        }

        /* renamed from: b */
        public final C26883g m138537b() {
            return f127248c;
        }
    }

    /* renamed from: tr.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f127249q = new c();

        /* renamed from: tr.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ boolean f127250q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11) {
                super(1);
                this.f127250q = z11;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(C3000l0 c3000l0) {
                boolean z11;
                if (this.f127250q && c3000l0.m14375y0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C2998k3 c2998k3) {
            AbstractC19074t.m100208f(c2998k3, "it");
            boolean m14233a = c2998k3.m14233a();
            List list = c2998k3.f11845a;
            AbstractC19074t.m100207e(list, "suggestionFeeds");
            AbstractC25378x.m131542D(list, new a(m14233a));
            return Boolean.valueOf(c2998k3.f11845a.isEmpty());
        }
    }

    /* renamed from: tr.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ int f127252r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f127252r = i11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C2998k3 c2998k3) {
            AbstractC19074t.m100208f(c2998k3, "it");
            return Boolean.valueOf(C26883g.this.m138518h(c2998k3, this.f127252r));
        }
    }

    /* renamed from: tr.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f127253q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f127253q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return this.f127253q;
        }
    }

    public /* synthetic */ C26883g(InterfaceC26880d interfaceC26880d, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC26880d, i11);
    }

    /* renamed from: e */
    private final String m138516e(C2998k3 c2998k3) {
        Object m131205e0;
        Integer num;
        boolean m14235c = c2998k3.m14235c();
        String str = "\t isDataValid: " + m14235c;
        if (m14235c) {
            List list = c2998k3.f11845a;
            AbstractC19074t.m100207e(list, "suggestionFeeds");
            m131205e0 = AbstractC25332a0.m131205e0(list);
            C3000l0 c3000l0 = (C3000l0) m131205e0;
            if (c3000l0 != null) {
                num = Integer.valueOf(c3000l0.f11893p);
            } else {
                num = null;
            }
            return str + "\t feedHolderType: " + num + " - size: " + c2998k3.f11845a.size() + " - position: " + c2998k3.f11846b;
        }
        return str;
    }

    /* renamed from: f */
    public static final C26883g m138517f(int i11) {
        return Companion.m138535a(i11);
    }

    /* renamed from: h */
    public final boolean m138518h(C2998k3 c2998k3, int i11) {
        if (i11 == 1) {
            return true;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return false;
                }
                return c2998k3.m14236d();
            }
            return c2998k3.m14233a();
        }
        return c2998k3.m14234b();
    }

    /* renamed from: i */
    private final boolean m138519i(int i11) {
        Object obj;
        boolean z11;
        synchronized (this.f127245e) {
            Iterator it = this.f127244d.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (m138518h((C2998k3) obj, i11)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: j */
    private final boolean m138520j(C2981h1 c2981h1) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c2981h1 != null && c2981h1.m14136a() > 0 && 0 <= currentTimeMillis - c2981h1.m14136a() && currentTimeMillis - c2981h1.m14136a() <= 86400000 && c2981h1.m14137b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final void m138521m() {
        String mo138489c = this.f127241a.mo138489c();
        if (mo138489c.length() > 0) {
            C2998k3 m138544c = new C26884h().m138544c(mo138489c);
            boolean m138519i = m138519i(4);
            if (m138544c != null) {
                if (!m138519i) {
                    m138531q(m138544c);
                }
            } else {
                this.f127241a.mo138490d("");
            }
        }
        m138522n("loadVideoChannelEntryOffline: " + mo138489c);
    }

    /* renamed from: n */
    private final void m138522n(String str) {
        if (C26360i.f125213a.m135694c("FEED_TIMELINE")) {
            C26359h.f125209a.mo135685a("FEED_TIMELINE", "SUGGESTION_FEED_MANAGER", new e(str));
        }
    }

    /* renamed from: o */
    private final Map m138523o(JSONArray jSONArray) {
        Map m131404i;
        Map m131417v;
        List list;
        m131404i = AbstractC25363p0.m131404i();
        m131417v = AbstractC25363p0.m131417v(m131404i);
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONArray.getJSONObject(i11));
                        if (m108750B0 != null && m108750B0.f11897r > 0 && (list = m108750B0.f11899s) != null && list.size() > 0) {
                            int i12 = m108750B0.f11897r;
                            List list2 = (List) m131417v.get(Integer.valueOf(i12));
                            if (list2 != null) {
                                list2.add(m108750B0);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(m108750B0);
                                m131417v.put(Integer.valueOf(i12), arrayList);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return m131417v;
    }

    /* renamed from: b */
    public final boolean m138524b(String str) {
        boolean z11;
        C3000l0 c3000l0;
        C3000l0 c3000l02;
        boolean z12;
        Object obj;
        boolean m127149O;
        AbstractC19074t.m100208f(str, "feedItemId");
        synchronized (this.f127245e) {
            z11 = false;
            try {
                try {
                    Iterator it = this.f127244d.iterator();
                    while (true) {
                        c3000l0 = null;
                        if (it.hasNext()) {
                            C2998k3 c2998k3 = (C2998k3) it.next();
                            boolean m14233a = c2998k3.m14233a();
                            List list = c2998k3.f11845a;
                            AbstractC19074t.m100207e(list, "suggestionFeeds");
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj = it2.next();
                                    C3000l0 c3000l03 = (C3000l0) obj;
                                    if (m14233a) {
                                        String str2 = c3000l03.f11895q;
                                        AbstractC19074t.m100207e(str2, "feedContentId");
                                        m127149O = AbstractC24342w.m127149O(str2, str, false, 2, null);
                                        if (m127149O) {
                                            break;
                                        }
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            c3000l02 = (C3000l0) obj;
                            if (c3000l02 != null) {
                                break;
                            }
                        } else {
                            c3000l02 = null;
                            break;
                        }
                    }
                    if (c3000l02 != null) {
                        c3000l02.m14345m1(str);
                        c3000l0 = c3000l02;
                    }
                    if (c3000l0 != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC25378x.m131542D(this.f127244d, c.f127249q);
                    z11 = z12;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public final void m138525c() {
        synchronized (this.f127245e) {
            this.f127244d.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: d */
    public final void m138526d(int i11) {
        synchronized (this.f127245e) {
            AbstractC25378x.m131542D(this.f127244d, new d(i11));
        }
    }

    /* renamed from: g */
    public final List m138527g(int i11) {
        ArrayList arrayList;
        synchronized (this.f127245e) {
            try {
                arrayList = new ArrayList();
                List list = this.f127244d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (m138518h((C2998k3) obj, i11)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void m138528k() {
        m138525c();
        m138529l();
        m138521m();
    }

    /* renamed from: l */
    public final void m138529l() {
        int m131400e;
        String mo138488b = this.f127241a.mo138488b(this.f127242b);
        C2981h1 c2981h1 = new C2981h1(mo138488b);
        if (m138520j(c2981h1)) {
            Map m138523o = m138523o(c2981h1.m14137b());
            m131400e = AbstractC25361o0.m131400e(m138523o.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
            Iterator it = m138523o.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(Integer.valueOf(((Number) r3.getKey()).intValue() - 1), ((Map.Entry) it.next()).getValue());
            }
            if (!this.f127243c.get()) {
                m138532r(linkedHashMap);
            }
        } else if (!this.f127243c.get()) {
            this.f127241a.mo138487a("", this.f127242b);
        }
        m138522n("loadOfflineSuggestionBannerFeed: " + mo138488b);
    }

    /* renamed from: p */
    public final void m138530p(JSONObject jSONObject) {
        InterfaceC26880d interfaceC26880d = this.f127241a;
        String str = "";
        if (jSONObject != null) {
            try {
                str = new C2981h1(System.currentTimeMillis(), jSONObject.optJSONArray("sug_banner")).m14138c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        interfaceC26880d.mo138487a(str, this.f127242b);
    }

    /* renamed from: q */
    public final void m138531q(C2998k3 c2998k3) {
        AbstractC19074t.m100208f(c2998k3, "data");
        synchronized (this.f127245e) {
            try {
                if (c2998k3.m14235c()) {
                    this.f127244d.add(c2998k3);
                }
                m138522n("saveSuggestionFeedPosition: " + m138516e(c2998k3));
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public final void m138532r(Map map) {
        AbstractC19074t.m100208f(map, "suggestedFeeds");
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            if (intValue >= 0 && (!list.isEmpty())) {
                m138531q(new C2998k3(list, intValue));
            }
        }
    }

    /* renamed from: s */
    public final void m138533s(String str) {
        AbstractC19074t.m100208f(str, "data");
        this.f127241a.mo138490d(str);
    }

    /* renamed from: t */
    public final void m138534t(boolean z11) {
        this.f127243c.set(z11);
    }

    private C26883g(InterfaceC26880d interfaceC26880d, int i11) {
        this.f127241a = interfaceC26880d;
        this.f127242b = i11;
        this.f127243c = new AtomicBoolean(false);
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f127244d = synchronizedList;
        this.f127245e = new Object();
    }
}
