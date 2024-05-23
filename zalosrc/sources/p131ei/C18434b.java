package p131ei;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0927o;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p131ei.C18434b;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31847b;
import p716zh.C31862c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import vg.AbstractC28207v1;

/* renamed from: ei.b */
/* loaded from: classes3.dex */
public final class C18434b {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final List f92928c;

    /* renamed from: d */
    private static final List f92929d;

    /* renamed from: e */
    private static final InterfaceC24854k f92930e;

    /* renamed from: f */
    private static final c f92931f;

    /* renamed from: a */
    private final Map f92932a;

    /* renamed from: b */
    private final AtomicBoolean f92933b;

    /* renamed from: ei.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f92934q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18434b mo12V4() {
            return new C18434b(null);
        }
    }

    /* renamed from: ei.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final boolean m97693a(int i11) {
            return C18434b.f92928c.contains(Integer.valueOf(i11));
        }

        /* renamed from: f */
        private final void m97694f(C31862c c31862c) {
            if (!c31862c.m153154f() && c31862c.m153155h()) {
                c31862c.m153151c();
            }
        }

        /* renamed from: b */
        public final C18434b m97695b() {
            return (C18434b) C18434b.f92930e.getValue();
        }

        /* renamed from: c */
        public final C31862c m97696c(JSONObject jSONObject, JSONObject jSONObject2, int i11) {
            if (jSONObject != null && jSONObject2 != null) {
                C31847b c31847b = new C31847b(jSONObject2);
                if (c31847b.f146219f == -1) {
                    c31847b.f146219f = c31847b.f146218e + jSONObject.optLong("expiredTime");
                }
                C31862c c31862c = new C31862c(jSONObject);
                c31862c.f146333z = c31847b;
                c31862c.f146299A = jSONObject.toString();
                c31862c.f146300B = jSONObject2.toString();
                c31862c.f146331x = i11;
                if (i11 == 10 && C18434b.Companion.m97693a(c31862c.f146308a)) {
                    c31862c.f146311d = "";
                }
                return c31862c;
            }
            return null;
        }

        /* renamed from: d */
        public final C31862c m97697d(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            JSONObject optJSONObject = jSONObject.optJSONObject("condition");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject != null && optJSONObject2 != null && optJSONObject2.has("viewType")) {
                C31847b c31847b = new C31847b(optJSONObject);
                if (c31847b.f146219f == -1) {
                    c31847b.f146219f = c31847b.f146218e + optJSONObject2.optLong("expiredTime");
                }
                C31862c c31862c = new C31862c(optJSONObject2);
                c31862c.f146333z = c31847b;
                c31862c.f146299A = optJSONObject2.toString();
                c31862c.f146300B = optJSONObject.toString();
                c31862c.f146331x = 0;
                C18434b.Companion.m97694f(c31862c);
                return c31862c;
            }
            return null;
        }

        /* renamed from: e */
        public final C31862c m97698e(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsData");
            C31862c c31862c = new C31862c(jSONObject);
            String str = c31862c.f146310c;
            if (str == null || str.length() == 0) {
                String str2 = "PUSHED_" + c31862c.f146308a;
                c31862c.m153160m(str2);
                jSONObject.put("id", str2);
            }
            C31847b c31847b = new C31847b();
            long optLong = jSONObject.optLong("startTime");
            if (optLong <= 0) {
                optLong = C23793c.Companion.m124321a().mo124311f() / 1000;
            }
            long optLong2 = jSONObject.optLong("expiredTime");
            if (optLong2 <= 0) {
                optLong2 = 86400;
            }
            c31847b.f146218e = optLong;
            c31847b.f146219f = optLong + optLong2;
            c31862c.f146333z = c31847b;
            c31862c.f146299A = jSONObject.toString();
            c31862c.f146300B = c31862c.f146333z.m153089a();
            c31862c.f146331x = 10;
            b bVar = C18434b.Companion;
            if (bVar.m97693a(c31862c.f146308a)) {
                c31862c.f146311d = "";
            }
            bVar.m97694f(c31862c);
            return c31862c;
        }
    }

    /* renamed from: ei.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final int f92935a;

        /* renamed from: b */
        private final int f92936b;

        /* renamed from: c */
        private final int f92937c;

        /* renamed from: d */
        private final int f92938d;

        /* renamed from: e */
        private final int f92939e;

        /* renamed from: f */
        private final int f92940f;

        public c(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f92935a = i11;
            this.f92936b = i12;
            this.f92937c = i13;
            this.f92938d = i14;
            this.f92939e = i15;
            this.f92940f = i16;
        }

        /* renamed from: a */
        public final int m97699a() {
            return this.f92936b;
        }

        /* renamed from: b */
        public final int m97700b() {
            return this.f92935a;
        }

        /* renamed from: c */
        public final int m97701c() {
            return this.f92939e;
        }

        /* renamed from: d */
        public final int m97702d() {
            return this.f92938d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f92935a == cVar.f92935a && this.f92936b == cVar.f92936b && this.f92937c == cVar.f92937c && this.f92938d == cVar.f92938d && this.f92939e == cVar.f92939e && this.f92940f == cVar.f92940f;
        }

        public int hashCode() {
            return (((((((((this.f92935a * 31) + this.f92936b) * 31) + this.f92937c) * 31) + this.f92938d) * 31) + this.f92939e) * 31) + this.f92940f;
        }

        public String toString() {
            List m131505m;
            String m131214n0;
            int i11 = this.f92935a;
            if (i11 != -1 || this.f92936b != -1 || this.f92937c != -1 || this.f92938d != -1 || this.f92939e != -1 || this.f92940f != -1) {
                m131505m = AbstractC25368s.m131505m(Integer.valueOf(i11), Integer.valueOf(this.f92936b), Integer.valueOf(this.f92937c), Integer.valueOf(this.f92938d), Integer.valueOf(this.f92939e), Integer.valueOf(this.f92940f));
                m131214n0 = AbstractC25332a0.m131214n0(m131505m, "_", null, null, 0, null, null, 62, null);
                return m131214n0;
            }
            return "-1";
        }
    }

    /* renamed from: ei.b$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo47509a(int i11, List list);
    }

    /* renamed from: ei.b$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        void mo64321a(int i11, C31862c c31862c);
    }

    /* renamed from: ei.b$f */
    /* loaded from: classes3.dex */
    public static final class f extends LinkedHashMap {
        f() {
            super(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 0.75f, true);
        }

        /* renamed from: a */
        public /* bridge */ boolean m97703a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m97704b(C31862c c31862c) {
            return super.containsValue(c31862c);
        }

        /* renamed from: c */
        public /* bridge */ C31862c m97705c(String str) {
            return (C31862c) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m97703a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj != null && !(obj instanceof C31862c)) {
                return false;
            }
            return m97704b((C31862c) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m97706e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m97706e();
        }

        /* renamed from: f */
        public /* bridge */ Set m97707f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ C31862c m97708g(String str, C31862c c31862c) {
            return (C31862c) super.getOrDefault(str, c31862c);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m97705c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m97708g((String) obj, (C31862c) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m97709h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m97710i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ C31862c m97711k(String str) {
            return (C31862c) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m97707f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m97712l(String str, C31862c c31862c) {
            return super.remove(str, c31862c);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m97711k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "eldest");
            if (size() > 500) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m97709h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m97710i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof C31862c)) {
                return m97712l((String) obj, (C31862c) obj2);
            }
            return false;
        }
    }

    /* renamed from: ei.b$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC0939u {
        g() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42490ob(C23793c.Companion.m124321a().mo124311f() / 1000);
        }
    }

    /* renamed from: ei.b$h */
    /* loaded from: classes3.dex */
    public static final class h implements d {

        /* renamed from: a */
        final /* synthetic */ e f92941a;

        h(e eVar) {
            this.f92941a = eVar;
        }

        @Override // p131ei.C18434b.d
        /* renamed from: a */
        public void mo47509a(int i11, List list) {
            Object m131207g0;
            AbstractC19074t.m100208f(list, "result");
            e eVar = this.f92941a;
            m131207g0 = AbstractC25332a0.m131207g0(list, 0);
            eVar.mo64321a(i11, (C31862c) m131207g0);
        }
    }

    /* renamed from: ei.b$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f92942a;

        /* renamed from: b */
        final /* synthetic */ C18434b f92943b;

        /* renamed from: c */
        final /* synthetic */ c f92944c;

        /* renamed from: d */
        final /* synthetic */ String f92945d;

        /* renamed from: e */
        final /* synthetic */ AbstractC28207v1.i0 f92946e;

        /* renamed from: f */
        final /* synthetic */ d f92947f;

        i(List list, C18434b c18434b, c cVar, String str, AbstractC28207v1.i0 i0Var, d dVar) {
            this.f92942a = list;
            this.f92943b = c18434b;
            this.f92944c = cVar;
            this.f92945d = str;
            this.f92946e = i0Var;
            this.f92947f = dVar;
        }

        /* renamed from: d */
        public static final void m97714d(d dVar, int i11, List list) {
            AbstractC19074t.m100208f(list, "$result");
            dVar.mo47509a(i11, list);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Iterator it = this.f92942a.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                ArrayList arrayList = new ArrayList();
                List m42507q5 = C7960e.m41971c6().m42507q5(intValue);
                AbstractC19074t.m100207e(m42507q5, "getAllQuickActionsByViewType(...)");
                C31862c m97678k = this.f92943b.m97678k(m42507q5, this.f92944c, this.f92945d, this.f92946e);
                if (m97678k != null) {
                    C18434b c18434b = this.f92943b;
                    m97678k.m153151c();
                    synchronized (c18434b) {
                        Map map = c18434b.f92932a;
                        String m153150b = m97678k.m153150b();
                        AbstractC19074t.m100207e(m153150b, "getUniqueKey(...)");
                        map.put(m153150b, m97678k);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    arrayList.add(m97678k);
                }
                AbstractC19444a.m101697e(new Runnable() { // from class: ei.c

                    /* renamed from: q */
                    public final /* synthetic */ int f92955q;

                    /* renamed from: r */
                    public final /* synthetic */ List f92956r;

                    public /* synthetic */ RunnableC18435c(int intValue2, List arrayList2) {
                        r2 = intValue2;
                        r3 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18434b.i.m97714d(C18434b.d.this, r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: ei.b$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    AbstractC20110a.f98889a.mo104559s(c20096c.toString(), new Object[0]);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                C18434b.this.f92933b.compareAndSet(true, false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            String str;
            C31862c m97697d;
            C18434b c18434b;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    str = CoreUtility.f89233i;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                if (str != null && str.length() != 0) {
                    JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                    ArrayList arrayList = new ArrayList();
                    List<C31862c> m42495p5 = C7960e.m41971c6().m42495p5(0);
                    AbstractC19074t.m100207e(m42495p5, "getAllQuickActionsBySource(...)");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C31862c c31862c : m42495p5) {
                        String m153150b = c31862c.m153150b();
                        AbstractC19074t.m100207e(m153150b, "getUniqueKey(...)");
                        AbstractC19074t.m100205c(c31862c);
                        linkedHashMap.put(m153150b, c31862c);
                    }
                    C7960e.m41971c6().m42086Cb(0);
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                        if (optJSONObject != null && (m97697d = C18434b.Companion.m97697d(optJSONObject)) != null) {
                            C31862c c31862c2 = (C31862c) linkedHashMap.get(m97697d.m153150b());
                            if (c31862c2 != null && c31862c2.f146332y) {
                                m97697d.f146332y = true;
                                C7960e.m41971c6().m42265S8(m97697d);
                                c18434b = C18434b.this;
                                synchronized (c18434b) {
                                    Map map = c18434b.f92932a;
                                    String m153150b2 = m97697d.m153150b();
                                    AbstractC19074t.m100207e(m153150b2, "getUniqueKey(...)");
                                    map.put(m153150b2, m97697d);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                }
                            }
                            arrayList.add(m97697d);
                            C7960e.m41971c6().m42265S8(m97697d);
                            c18434b = C18434b.this;
                            synchronized (c18434b) {
                            }
                        }
                    }
                    AbstractC0924m0.m4349xh(C23793c.Companion.m124321a().mo124311f() + (r13.optInt("expiredTime", 0) * 1000));
                    C23744a.Companion.m124119a().m124116d(6020, new Object[0]);
                    C18434b.this.f92933b.compareAndSet(true, false);
                }
            } finally {
                C18434b.this.f92933b.compareAndSet(true, false);
            }
        }
    }

    /* renamed from: ei.b$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ int f92949a;

        /* renamed from: b */
        final /* synthetic */ String f92950b;

        k(int i11, String str) {
            this.f92949a = i11;
            this.f92950b = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42576wc(this.f92949a, this.f92950b);
        }
    }

    /* renamed from: ei.b$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31862c f92951a;

        l(C31862c c31862c) {
            this.f92951a = c31862c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42585xc(this.f92951a.m153150b());
        }
    }

    /* renamed from: ei.b$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31862c f92952a;

        m(C31862c c31862c) {
            this.f92952a = c31862c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42265S8(this.f92952a);
        }
    }

    /* renamed from: ei.b$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31862c f92953a;

        n(C31862c c31862c) {
            this.f92953a = c31862c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42298Vd(this.f92953a.m153150b(), true);
        }
    }

    static {
        List m131505m;
        List m131505m2;
        InterfaceC24854k m129210a;
        m131505m = AbstractC25368s.m131505m(1, 6, 3, 4, 15, 16, 28, 29, 30, 33, 34);
        f92928c = m131505m;
        m131505m2 = AbstractC25368s.m131505m(1, 3, 4, 5, 6, 8, 10, 11, 15, 16, 18, 19, 20, 21, 26, 27, 28, 29, 30);
        f92929d = m131505m2;
        m129210a = AbstractC24856m.m129210a(a.f92934q);
        f92930e = m129210a;
        f92931f = new c(-1, -1, -1, -1, -1, -1);
    }

    public /* synthetic */ C18434b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: h */
    public static final void m97675h(C18434b c18434b) {
        AbstractC19074t.m100208f(c18434b, "this$0");
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            c18434b.m97677j();
            long m3559X0 = AbstractC0924m0.m3559X0();
            if (m3559X0 > 0 && m3559X0 > C23793c.Companion.m124321a().mo124311f()) {
                return;
            }
            c18434b.m97680q();
        }
    }

    /* renamed from: i */
    private final void m97676i(C31862c c31862c) {
        if (c31862c.f146308a == 1) {
            C19669z.b bVar = C19669z.Companion;
            if (bVar.m103232a().m103221f1(c31862c)) {
                bVar.m103232a().m103198O0();
                return;
            }
        }
        if (c31862c.f146308a == 6 && C19669z.Companion.m103232a().m103220e1(c31862c)) {
            C23744a.Companion.m124119a().m124116d(106, new Object[0]);
        }
    }

    /* renamed from: j */
    private final void m97677j() {
        C0824j.m2153b(new g());
    }

    /* renamed from: k */
    public final C31862c m97678k(List list, c cVar, String str, AbstractC28207v1.i0 i0Var) {
        Iterator it = list.iterator();
        C31862c c31862c = null;
        while (it.hasNext()) {
            C31862c c31862c2 = (C31862c) it.next();
            C31847b c31847b = c31862c2.f146333z;
            if (c31847b != null && c31862c2.m153157j(i0Var) && c31862c2.m153152d() && !c31862c2.f146332y) {
                int i11 = c31847b.f146217d;
                List list2 = f92929d;
                if (list2.contains(Integer.valueOf(c31862c2.f146308a))) {
                    i11 = -1;
                }
                if (i11 == -1 || i11 == cVar.m97700b()) {
                    int i12 = c31847b.f146216c;
                    if (i12 == -1 || i12 == cVar.m97699a()) {
                        int i13 = c31847b.f146215b;
                        if (list2.contains(Integer.valueOf(c31862c2.f146308a))) {
                            i13 = -1;
                        }
                        if (i13 == -1 || i13 == cVar.m97702d()) {
                            int i14 = c31847b.f146214a;
                            if (list2.contains(Integer.valueOf(c31862c2.f146308a))) {
                                i14 = -1;
                            }
                            if (i14 == -1 || i14 == cVar.m97701c()) {
                                String str2 = c31862c2.f146311d;
                                AbstractC19074t.m100207e(str2, "threadId");
                                if (str2.length() <= 0 || AbstractC19074t.m100204b(c31862c2.f146311d, str)) {
                                    if (c31862c == null || (c31862c.f146331x != 10 && c31862c2.f146331x == 10)) {
                                        c31862c = c31862c2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return c31862c;
    }

    /* renamed from: l */
    public static final C18434b m97679l() {
        return Companion.m97695b();
    }

    /* renamed from: q */
    private final void m97680q() {
        if (!this.f92933b.compareAndSet(false, true)) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new j());
        c0766k.mo1773x4();
    }

    /* renamed from: r */
    public static final C31862c m97681r(JSONObject jSONObject, JSONObject jSONObject2, int i11) {
        return Companion.m97696c(jSONObject, jSONObject2, i11);
    }

    /* renamed from: s */
    private final void m97682s(int i11, String str) {
        synchronized (this) {
            try {
                Iterator it = this.f92932a.entrySet().iterator();
                while (it.hasNext()) {
                    C31862c c31862c = (C31862c) ((Map.Entry) it.next()).getValue();
                    if (c31862c.f146331x == 10 && c31862c.f146308a == i11 && AbstractC19074t.m100204b(c31862c.f146311d, str)) {
                        it.remove();
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0824j.m2153b(new k(i11, str));
    }

    /* renamed from: g */
    public final void m97683g() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ei.a
            public /* synthetic */ RunnableC18433a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18434b.m97675h(C18434b.this);
            }
        });
    }

    /* renamed from: m */
    public final void m97684m(int i11, String str, c cVar, AbstractC28207v1.i0 i0Var, e eVar) {
        List m131496e;
        AbstractC19074t.m100208f(cVar, "condition");
        if (eVar != null) {
            m131496e = AbstractC25366r.m131496e(Integer.valueOf(i11));
            m97687p(m131496e, str, cVar, i0Var, new h(eVar));
        }
    }

    /* renamed from: n */
    public final void m97685n(int i11, String str, AbstractC28207v1.i0 i0Var, e eVar) {
        m97684m(i11, str, f92931f, i0Var, eVar);
    }

    /* renamed from: o */
    public final void m97686o(int i11, AbstractC28207v1.i0 i0Var, e eVar) {
        m97685n(i11, null, i0Var, eVar);
    }

    /* renamed from: p */
    public final void m97687p(List list, String str, c cVar, AbstractC28207v1.i0 i0Var, d dVar) {
        AbstractC19074t.m100208f(list, "viewTypes");
        AbstractC19074t.m100208f(cVar, "condition");
        if (dVar == null) {
            return;
        }
        C0824j.m2153b(new i(list, this, cVar, AbstractC25495a.m132089n(str), i0Var, dVar));
        m97683g();
    }

    /* renamed from: t */
    public final void m97688t(C31862c c31862c) {
        if (c31862c != null) {
            synchronized (this) {
            }
            C0824j.m2153b(new l(c31862c));
        }
    }

    /* renamed from: u */
    public final void m97689u() {
        synchronized (this) {
            this.f92932a.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: v */
    public final C31862c m97690v(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C31862c m97698e = Companion.m97698e(jSONObject);
            int i11 = m97698e.f146308a;
            String str = m97698e.f146311d;
            AbstractC19074t.m100207e(str, "threadId");
            m97682s(i11, str);
            if (m97698e.m153154f()) {
                C23744a.Companion.m124119a().m124116d(6020, Integer.valueOf(m97698e.f146308a));
                return m97698e;
            }
            synchronized (this) {
                Map map = this.f92932a;
                String m153150b = m97698e.m153150b();
                AbstractC19074t.m100207e(m153150b, "getUniqueKey(...)");
                map.put(m153150b, m97698e);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m97698e.m153151c();
            C0824j.m2153b(new m(m97698e));
            m97676i(m97698e);
            C23744a.Companion.m124119a().m124116d(6020, Integer.valueOf(m97698e.f146308a));
            return m97698e;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: w */
    public final void m97691w(C31862c c31862c) {
        String str;
        if (c31862c != null) {
            str = c31862c.m153150b();
        } else {
            str = null;
        }
        if (str != null) {
            c31862c.f146332y = true;
            C0824j.m2153b(new n(c31862c));
        }
    }

    private C18434b() {
        Map synchronizedMap = Collections.synchronizedMap(new f());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f92932a = synchronizedMap;
        this.f92933b = new AtomicBoolean(false);
    }
}
