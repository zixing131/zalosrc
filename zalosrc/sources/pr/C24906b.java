package pr;

import ae.C0766k;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import bo.C2976g1;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p217hs.C20120e;
import p361nb.C23648e;
import p363nh.C23744a;
import p665y0.C30239a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;

/* renamed from: pr.b */
/* loaded from: classes4.dex */
public final class C24906b {

    /* renamed from: a */
    public static final C24906b f119505a;

    /* renamed from: b */
    private static final ArrayMap f119506b;

    /* renamed from: c */
    private static final ArrayList f119507c;

    /* renamed from: d */
    private static final Queue f119508d;

    /* renamed from: e */
    private static long f119509e;

    /* renamed from: f */
    private static long f119510f;

    /* renamed from: g */
    private static boolean f119511g;

    /* renamed from: h */
    private static boolean f119512h;

    /* renamed from: i */
    private static Handler f119513i;

    /* renamed from: pr.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f119514a;

        a(List list) {
            this.f119514a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42146Hc(this.f119514a);
        }
    }

    /* renamed from: pr.b$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f119515a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f119516b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18494a f119517c;

        b(InterfaceC18505l interfaceC18505l, ArrayList arrayList, InterfaceC18494a interfaceC18494a) {
            this.f119515a = interfaceC18505l;
            this.f119516b = arrayList;
            this.f119517c = interfaceC18494a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24906b.f119507c.removeAll(this.f119516b);
            this.f119517c.mo12V4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray m96090i;
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject m96091j = AbstractC18069a.m96091j((JSONObject) obj, "data");
                if (m96091j != null) {
                    if (m96091j.has("expiredTime")) {
                        C24906b c24906b = C24906b.f119505a;
                        C24906b.f119509e = AbstractC18069a.m96087f(m96091j, "expiredTime") * 1000;
                        AbstractC0924m0.m3235Lo(C24906b.f119509e);
                    }
                    if (m96091j.has("timeReloadInQueue")) {
                        C24906b c24906b2 = C24906b.f119505a;
                        C24906b.f119510f = AbstractC18069a.m96087f(m96091j, "timeReloadInQueue") * 1000;
                    }
                    if (m96091j.has("suggestComments") && (m96090i = AbstractC18069a.m96090i(m96091j, "suggestComments")) != null) {
                        Map m108754D0 = AbstractC20826v0.m108754D0(m96090i);
                        AbstractC19074t.m100207e(m108754D0, "parseListFeedSuggestComment(...)");
                        this.f119515a.mo205i9(m108754D0);
                    }
                    C24906b.f119507c.removeAll(this.f119516b);
                }
            } catch (JSONException e11) {
                C24906b.f119507c.removeAll(this.f119516b);
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: pr.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            try {
                int i11 = message.what;
                if (i11 != 100) {
                    if (i11 == 101) {
                        C24906b.f119505a.m129519M();
                    }
                } else {
                    C23744a.b bVar = C23744a.Companion;
                    bVar.m124119a().m124116d(6013, new Object[0]);
                    bVar.m124119a().m124116d(5113, message.obj);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pr.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {
        d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C30239a m42319Y6 = C7960e.m41971c6().m42319Y6(CoreUtility.f89233i);
            C24906b c24906b = C24906b.f119505a;
            AbstractC19074t.m100205c(m42319Y6);
            C24906b.f119506b.putAll(c24906b.m129515F(m42319Y6));
            c24906b.m129539t();
            c24906b.m129538s();
            C24906b.f119511g = true;
            c24906b.m129519M();
        }
    }

    /* renamed from: pr.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f119518q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m129553a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m129553a() {
            C24906b.m129535p(C24906b.f119505a, null, 1, null);
        }
    }

    /* renamed from: pr.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f119519q;

        /* renamed from: r */
        final /* synthetic */ List f119520r;

        /* renamed from: s */
        final /* synthetic */ C32002l4 f119521s;

        /* renamed from: t */
        final /* synthetic */ ArrayMap f119522t;

        /* renamed from: u */
        final /* synthetic */ List f119523u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, List list, C32002l4 c32002l4, ArrayMap arrayMap, List list2) {
            super(1);
            this.f119519q = z11;
            this.f119520r = list;
            this.f119521s = c32002l4;
            this.f119522t = arrayMap;
            this.f119523u = list2;
        }

        /* renamed from: a */
        public final void m129554a(Map map) {
            AbstractC19074t.m100208f(map, "it");
            ArrayList<C2976g1> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                C2976g1 c2976g1 = (C2976g1) entry.getValue();
                if (c2976g1.m14116b()) {
                    arrayList2.add(str);
                } else {
                    arrayList.add(c2976g1);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayMap arrayMap = this.f119522t;
            for (C2976g1 c2976g12 : arrayList) {
                C24906b.f119506b.put(c2976g12.m14115a(), c2976g12);
                arrayMap.put(c2976g12.m14115a(), c2976g12);
                arrayList3.add(c2976g12.m14115a());
            }
            C24906b c24906b = C24906b.f119505a;
            c24906b.m129517J(arrayList);
            c24906b.m129534o(arrayList2);
            if (this.f119519q) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                List list = this.f119520r;
                List list2 = this.f119523u;
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    String str2 = (String) obj;
                    if (arrayList2.contains(str2)) {
                        arrayList4.add(str2);
                        arrayList5.add(list2.get(i11));
                    }
                    i11 = i12;
                }
                if (!arrayList4.isEmpty()) {
                    C24906b.f119505a.m129518K(new C24905a(arrayList4, arrayList5, this.f119521s, false));
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m129554a((Map) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: pr.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f119524a;

        g(List list) {
            this.f119524a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C2976g1 c2976g1 : this.f119524a) {
                arrayList.add(c2976g1.m14115a());
                arrayList2.add(c2976g1.m14126n().toString());
            }
            C7960e.m41971c6().m42190L8(arrayList, arrayList2);
        }
    }

    /* renamed from: pr.b$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C2976g1 f119525a;

        h(C2976g1 c2976g1) {
            this.f119525a = c2976g1;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42178K8(this.f119525a.m14115a(), this.f119525a.m14126n().toString());
        }
    }

    static {
        C24906b c24906b = new C24906b();
        f119505a = c24906b;
        f119506b = new ArrayMap();
        f119507c = new ArrayList();
        f119508d = new LinkedList();
        f119509e = 10800000L;
        f119510f = -1L;
        f119513i = new c(Looper.getMainLooper());
        c24906b.m129516G();
    }

    private C24906b() {
    }

    /* renamed from: B */
    private final void m129513B(List list, C32002l4 c32002l4, boolean z11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((C3000l0) it.next()).f11899s;
            AbstractC19074t.m100207e(list2, "listNewFeed");
            AbstractC25378x.m131548x(arrayList, list2);
        }
        C24905a c24905a = new C24905a(m129540u(arrayList), c32002l4);
        c24905a.m129512e(z11);
        m129514C(c24905a);
    }

    /* renamed from: C */
    private final synchronized void m129514C(C24905a c24905a) {
        if (!f119511g) {
            m129533n(c24905a);
            return;
        }
        List m129509b = c24905a.m129509b();
        List m129511d = c24905a.m129511d();
        C32002l4 m129508a = c24905a.m129508a();
        if (m129509b.size() != m129511d.size()) {
            return;
        }
        boolean m129510c = c24905a.m129510c();
        m129538s();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        int size = m129509b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayMap arrayMap2 = f119506b;
            if (arrayMap2.containsKey(m129509b.get(i11))) {
                arrayMap.put(m129509b.get(i11), arrayMap2.get(m129509b.get(i11)));
            } else if (!f119507c.contains(m129509b.get(i11))) {
                arrayList.add(m129509b.get(i11));
                arrayList2.add(m129511d.get(i11));
            }
        }
        if (arrayList.size() == 0) {
            m129535p(this, null, 1, null);
        } else {
            InterfaceC18505l fVar = new f(m129510c, m129509b, m129508a, arrayMap, m129511d);
            InterfaceC18494a interfaceC18494a = e.f119518q;
            f119507c.addAll(arrayList);
            TrackingSource m154329A = C32017m4.m154326S().m154329A(m129508a);
            AbstractC19074t.m100207e(m154329A, "createTrackingSourceGetSuggestComment(...)");
            m129541w(arrayList, arrayList2, m154329A, fVar, interfaceC18494a);
        }
    }

    /* renamed from: F */
    public final Map m129515F(Map map) {
        ArrayMap arrayMap = new ArrayMap();
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C2976g1 c2976g1 = new C2976g1();
                if (str2.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str2);
                    String m96089h = AbstractC18069a.m96089h(jSONObject, "feedId");
                    AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                    c2976g1.m14121i(m96089h);
                    c2976g1.m14125m(AbstractC18069a.m96087f(jSONObject, "timestamp"));
                    JSONArray m96090i = AbstractC18069a.m96090i(jSONObject, "suggests");
                    if (m96090i != null) {
                        List m108756E0 = AbstractC20826v0.m108756E0(m96090i);
                        AbstractC19074t.m100207e(m108756E0, "parseListSuggestComment(...)");
                        c2976g1.m14124l(m108756E0);
                    }
                    c2976g1.m14123k(AbstractC18069a.m96083b(jSONObject, "showOnTimeline"));
                }
                arrayMap.put(str, c2976g1);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayMap;
    }

    /* renamed from: G */
    private final void m129516G() {
        f119511g = false;
        m129543y();
        m129536q();
        m129552z();
    }

    /* renamed from: J */
    public final void m129517J(List list) {
        C0824j.m2153b(new g(list));
    }

    /* renamed from: K */
    public final void m129518K(C24905a c24905a) {
        long j11 = f119510f;
        if (0 <= j11 && j11 < 600000) {
            m129533n(c24905a);
            f119513i.removeMessages(101);
            f119513i.sendEmptyMessageDelayed(101, f119510f);
        }
    }

    /* renamed from: M */
    public final void m129519M() {
        Queue<C24905a> queue = f119508d;
        synchronized (queue) {
            try {
                for (C24905a c24905a : queue) {
                    C24906b c24906b = f119505a;
                    AbstractC19074t.m100205c(c24905a);
                    c24906b.m129514C(c24905a);
                }
                f119508d.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private final void m129533n(C24905a c24905a) {
        Queue queue = f119508d;
        synchronized (queue) {
            try {
                queue.add(c24905a);
                if (queue.size() > 3) {
                    queue.remove();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final void m129534o(List list) {
        f119513i.removeMessages(100);
        Handler handler = f119513i;
        handler.sendMessageDelayed(handler.obtainMessage(100, list), 500L);
    }

    /* renamed from: p */
    static /* synthetic */ void m129535p(C24906b c24906b, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = AbstractC25368s.m131502j();
        }
        c24906b.m129534o(list);
    }

    /* renamed from: q */
    private final void m129536q() {
        f119506b.clear();
        f119508d.clear();
        f119507c.clear();
    }

    /* renamed from: r */
    private final void m129537r(List list) {
        C0824j.m2153b(new a(list));
    }

    /* renamed from: s */
    public final synchronized void m129538s() {
        try {
            ArrayMap arrayMap = f119506b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : arrayMap.entrySet()) {
                C2976g1 c2976g1 = (C2976g1) entry.getValue();
                C24906b c24906b = f119505a;
                AbstractC19074t.m100205c(c2976g1);
                if (!c24906b.m129542x(c2976g1)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            f119506b.removeAll(linkedHashMap.keySet());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: t */
    public final synchronized void m129539t() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : f119506b.entrySet()) {
                String str = (String) entry.getKey();
                C2976g1 c2976g1 = (C2976g1) entry.getValue();
                C24906b c24906b = f119505a;
                AbstractC19074t.m100205c(c2976g1);
                if (!c24906b.m129542x(c2976g1)) {
                    arrayList.add(str);
                }
            }
            m129537r(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    private final List m129540u(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3020p0 c3020p0 = (C3020p0) obj;
            if (c3020p0.f12052f0 && !AbstractC19074t.m100204b(c3020p0.m14465A(), CoreUtility.f89233i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private final synchronized void m129541w(List list, List list2, TrackingSource trackingSource, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
        if (list.size() != list2.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        m129538s();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(interfaceC18505l, arrayList, interfaceC18494a));
        c0766k.m1873v(list, list2, trackingSource);
    }

    /* renamed from: x */
    private final boolean m129542x(C2976g1 c2976g1) {
        if (System.currentTimeMillis() - c2976g1.m14118d() < f119509e) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private final void m129543y() {
        long m3802f6 = AbstractC0924m0.m3802f6();
        if (m3802f6 == 0) {
            m3802f6 = 10800000;
        }
        f119509e = m3802f6;
    }

    /* renamed from: A */
    public final void m129544A(C3020p0 c3020p0, C32002l4 c32002l4) {
        List m131496e;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        m131496e = AbstractC25366r.m131496e(c3020p0);
        m129514C(new C24905a(m129540u(m131496e), c32002l4));
    }

    /* renamed from: D */
    public final void m129545D(List list, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(list, "feedContents");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (C20120e.f99217a.m104724c(0)) {
            m129513B(list, c32002l4, false);
        }
    }

    /* renamed from: E */
    public final void m129546E(String str, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(str, "entryPoint");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tc", i11);
            jSONObject.put("cp", i12 + 1);
            jSONObject.put("feedType", i13);
            jSONObject.put("suggestionType", i14);
            C0815e1.m2075D().m2100V(new C23648e(14, str, 0, "suggest_comment", jSONObject.toString()), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H */
    public final void m129547H() {
        if (f119512h) {
            m129516G();
            f119512h = false;
        }
    }

    /* renamed from: I */
    public final void m129548I(C2976g1 c2976g1) {
        AbstractC19074t.m100208f(c2976g1, "suggestComments");
        C0824j.m2153b(new h(c2976g1));
    }

    /* renamed from: L */
    public final void m129549L(boolean z11) {
        f119512h = z11;
    }

    /* renamed from: N */
    public final void m129550N(C2976g1 c2976g1, boolean z11) {
        List m131185M0;
        AbstractC19074t.m100208f(c2976g1, "feedSuggestComments");
        c2976g1.m14123k(!z11);
        m129548I(c2976g1);
        C23744a m124119a = C23744a.Companion.m124119a();
        Set keySet = f119506b.keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        m131185M0 = AbstractC25332a0.m131185M0(keySet);
        m124119a.m124116d(5113, m131185M0);
    }

    /* renamed from: v */
    public final synchronized C2976g1 m129551v(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return (C2976g1) f119506b.get(str);
    }

    /* renamed from: z */
    public final synchronized void m129552z() {
        f119506b.clear();
        if (!f119511g) {
            C0824j.m2153b(new d());
        }
    }
}
