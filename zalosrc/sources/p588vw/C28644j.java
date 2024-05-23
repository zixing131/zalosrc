package p588vw;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.AbstractC0840r;
import ag0.C0824j;
import ag0.C0836p;
import ag0.C0838q;
import ag0.C0844t;
import ag0.C0846u;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import android.util.SparseArray;
import c30.C3229a;
import c30.C3232b0;
import c30.C3233c;
import c30.C3245i;
import c30.C3247j;
import c30.C3251l;
import c30.C3254m0;
import c30.C3255n;
import com.androidquery.util.AbstractC3987t;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23041d2;
import me0.AbstractC23080g8;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p038bl.C2834f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p379o3.AbstractC24006q;
import p471r3.C25630b;
import p485rj.C25810b;
import p485rj.C25811c;
import p609wh.AbstractC29039u0;
import vg.C28020b3;
import vg.C28181s2;

/* renamed from: vw.j */
/* loaded from: classes4.dex */
public final class C28644j {

    /* renamed from: q */
    public static String f132746q = "";

    /* renamed from: w */
    private static volatile C28644j f132752w;

    /* renamed from: e */
    private boolean f132760e;

    /* renamed from: f */
    private boolean f132761f;

    /* renamed from: i */
    private boolean f132764i;

    /* renamed from: j */
    private boolean f132765j;

    /* renamed from: r */
    private static final HashMap f132747r = new HashMap();

    /* renamed from: s */
    private static final HashMap f132748s = new HashMap();

    /* renamed from: t */
    private static final ConcurrentHashMap f132749t = new ConcurrentHashMap();

    /* renamed from: u */
    public static final Map f132750u = new LinkedHashMap();

    /* renamed from: v */
    public static final Map f132751v = Collections.synchronizedMap(new HashMap());

    /* renamed from: x */
    private static final AtomicInteger f132753x = new AtomicInteger(0);

    /* renamed from: y */
    private static final AtomicInteger f132754y = new AtomicInteger(0);

    /* renamed from: z */
    private static final AtomicInteger f132755z = new AtomicInteger(0);

    /* renamed from: A */
    public static final String[] f132743A = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

    /* renamed from: B */
    public static final String[] f132744B = {"sticker_01", "sticker_02", "sticker_03", "sticker_04", "sticker_05", "sticker_06", "sticker_07", "sticker_08", "sticker_09", "sticker_10", "sticker_11", "sticker_12", "sticker_13", "sticker_14", "sticker_15", "sticker_16", "sticker_17", "sticker_18", "sticker_19", "sticker_20", "sticker_21", "sticker_22", "sticker_23", "sticker_24", "sticker_25", "sticker_26", "sticker_27", "sticker_28", "sticker_29", "sticker_30"};

    /* renamed from: C */
    private static int f132745C = 0;

    /* renamed from: a */
    private boolean f132756a = false;

    /* renamed from: b */
    private boolean f132757b = false;

    /* renamed from: c */
    private String f132758c = "";

    /* renamed from: d */
    private final Map f132759d = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: g */
    private int f132762g = 0;

    /* renamed from: h */
    private final String f132763h = "SyncSticker";

    /* renamed from: k */
    private int f132766k = 0;

    /* renamed from: l */
    private final Map f132767l = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: m */
    private boolean f132768m = false;

    /* renamed from: n */
    private boolean f132769n = false;

    /* renamed from: o */
    private int f132770o = 0;

    /* renamed from: p */
    private int f132771p = 0;

    /* renamed from: vw.j$a */
    /* loaded from: classes4.dex */
    class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28644j.this.f132768m = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            long j11;
            long j12;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("expiredDuration");
                    long j13 = 0;
                    if (optLong == 0) {
                        optLong = 43200;
                    }
                    AbstractC23309i.m120844Cx(C23793c.m124316k().mo124311f() + (optLong * 1000));
                    C28644j.this.f132767l.clear();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList<Integer> arrayList2 = new ArrayList();
                    for (C3245i c3245i : C7960e.m41971c6().m42530s5(CoreUtility.f89233i)) {
                        linkedHashMap2.put(Integer.valueOf(c3245i.m16463e()), c3245i);
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("cates");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            C3245i c3245i2 = new C3245i(optJSONArray.getJSONObject(i11));
                            linkedHashMap.put(Integer.valueOf(c3245i2.m16463e()), c3245i2);
                        }
                    }
                    for (Integer num : linkedHashMap.keySet()) {
                        if (!linkedHashMap2.containsKey(num)) {
                            if (!C28644j.this.f132767l.containsKey(num)) {
                                C28644j.this.f132767l.put(num, num);
                                arrayList.add(num);
                                C28644j.m143269w0((C3245i) linkedHashMap.get(num), -1);
                            }
                        } else {
                            C3245i c3245i3 = (C3245i) linkedHashMap2.get(num);
                            C3245i c3245i4 = (C3245i) linkedHashMap.get(num);
                            if (c3245i3 != null) {
                                j11 = c3245i3.f13871s;
                            } else {
                                j11 = j13;
                            }
                            if (c3245i4 != null) {
                                j12 = c3245i4.f13871s;
                            } else {
                                j12 = 0;
                            }
                            if (j11 < j12) {
                                C28644j.m143228R(num.intValue());
                                if (!C28644j.this.f132767l.containsKey(num)) {
                                    C28644j.this.f132767l.put(num, num);
                                    arrayList.add(num);
                                    C28644j.m143269w0((C3245i) linkedHashMap.get(num), -1);
                                }
                                arrayList2.add(num);
                            }
                        }
                        j13 = 0;
                    }
                    for (Integer num2 : linkedHashMap2.keySet()) {
                        if (!linkedHashMap.containsKey(num2)) {
                            arrayList2.add(num2);
                            C28644j.m143228R(num2.intValue());
                        }
                    }
                    for (Integer num3 : arrayList2) {
                        C7960e.m41971c6().m42419i4(num3.intValue(), null);
                        C7960e.m41971c6().m42450l4(num3.intValue(), "", CoreUtility.f89233i);
                    }
                    C28644j.this.m143285S();
                    Iterator it = linkedHashMap.keySet().iterator();
                    int i12 = 1;
                    while (it.hasNext()) {
                        C28644j.m143241d1(((Integer) it.next()).intValue(), i12);
                        i12++;
                    }
                    C7960e.m41971c6().m42505q3(CoreUtility.f89233i);
                    C7960e.m41971c6().m42057A(CoreUtility.f89233i, new ArrayList(linkedHashMap.values()));
                    if (arrayList.size() > 0) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C28644j.this.m143237c0(((Integer) it2.next()).intValue());
                        }
                    } else if (arrayList2.size() > 0) {
                        C2834f.f11325a.m13687g();
                    }
                }
                C28644j.this.f132768m = false;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                C28644j.this.f132768m = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.j$b */
    /* loaded from: classes4.dex */
    public class b implements C19516c.c {
        b() {
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(int i11, C20096c c20096c) {
            C28644j.this.f132767l.remove(Integer.valueOf(i11));
            if (C28644j.this.f132767l.size() == 0) {
                m143313c();
            }
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(int i11, ArrayList arrayList) {
            if (arrayList != null) {
                try {
                    C28020b3.f130648a.m141184I(arrayList);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            C28644j.this.f132767l.remove(Integer.valueOf(i11));
            if (C28644j.this.f132767l.size() == 0) {
                m143313c();
            }
        }

        /* renamed from: c */
        public void m143313c() {
            C2834f.f11325a.m13687g();
        }
    }

    /* renamed from: vw.j$c */
    /* loaded from: classes4.dex */
    class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28644j.this.f132769n = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                C7960e.m41971c6().m42429j4(null);
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (i11 < jSONArray.length()) {
                    C3245i c3245i = new C3245i(jSONArray.getJSONObject(i11));
                    i11++;
                    c3245i.f13872t = i11;
                    arrayList.add(c3245i);
                    AbstractC23304d.f113461z.put(Integer.valueOf(c3245i.f13854b), c3245i);
                    C7960e.m41971c6().m42350b9(c3245i);
                }
                ArrayList arrayList2 = AbstractC23304d.f113273F;
                synchronized (arrayList2) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                C3255n.m16562n().m16570E(AbstractC23304d.f113461z);
                AbstractC23309i.m121847dy(System.currentTimeMillis());
                C2834f.f11325a.m13689k();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C28644j.this.f132769n = false;
        }
    }

    /* renamed from: vw.j$d */
    /* loaded from: classes4.dex */
    class d extends AbstractC0939u {
        d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Map map = C28644j.f132751v;
            synchronized (map) {
                try {
                    map.clear();
                    map.putAll(C7960e.m41971c6().m42591y5());
                    if (map.size() != 0) {
                        C28644j.this.m143218I0();
                    } else {
                        C28644j.this.m143302f1();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C28644j.this.f132765j = false;
        }
    }

    /* renamed from: vw.j$e */
    /* loaded from: classes4.dex */
    class e extends AbstractC0840r.j {

        /* renamed from: a */
        final /* synthetic */ o f132776a;

        /* renamed from: b */
        final /* synthetic */ List f132777b;

        e(o oVar, List list) {
            this.f132776a = oVar;
            this.f132777b = list;
        }

        @Override // ag0.AbstractC0840r.j
        /* renamed from: a */
        public void mo2269a() {
        }

        @Override // ag0.AbstractC0840r.j
        /* renamed from: b */
        public void mo2270b() {
            if (this.f132776a != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f132777b.iterator();
                while (it.hasNext()) {
                    arrayList.add((LinkedHashMap) C28644j.f132747r.get((Integer) it.next()));
                }
                this.f132776a.mo16628f1(this.f132777b, arrayList);
            }
        }
    }

    /* renamed from: vw.j$f */
    /* loaded from: classes4.dex */
    class f extends AbstractC0840r.j {

        /* renamed from: a */
        final /* synthetic */ p f132779a;

        /* renamed from: b */
        final /* synthetic */ List f132780b;

        f(p pVar, List list) {
            this.f132779a = pVar;
            this.f132780b = list;
        }

        @Override // ag0.AbstractC0840r.j
        /* renamed from: a */
        public void mo2269a() {
        }

        @Override // ag0.AbstractC0840r.j
        /* renamed from: b */
        public void mo2270b() {
            if (this.f132779a != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f132780b.iterator();
                while (it.hasNext()) {
                    arrayList.add((ArrayList) C28644j.f132748s.get(Integer.valueOf(((C3245i) it.next()).f13854b)));
                }
                this.f132779a.mo36242n0(arrayList);
            }
        }
    }

    /* renamed from: vw.j$g */
    /* loaded from: classes4.dex */
    class g extends AbstractC0840r.e {

        /* renamed from: a */
        final /* synthetic */ m f132782a;

        g(m mVar) {
            this.f132782a = mVar;
        }

        @Override // ag0.AbstractC0840r.e
        /* renamed from: c */
        public void mo2265c(C25630b c25630b) {
            m mVar = this.f132782a;
            if (mVar != null) {
                mVar.mo35936a(c25630b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.j$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractC0840r.f {

        /* renamed from: a */
        final /* synthetic */ n f132784a;

        h(n nVar) {
            this.f132784a = nVar;
        }

        @Override // ag0.AbstractC0840r.f
        /* renamed from: c */
        public void mo2266c(List list) {
            n nVar = this.f132784a;
            if (nVar != null) {
                nVar.mo143202a(list);
            }
        }
    }

    /* renamed from: vw.j$i */
    /* loaded from: classes4.dex */
    class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 252) {
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                        C28644j.this.m143231U0(jSONObject);
                        if (jSONObject.optInt("version") == 0) {
                            synchronized (AbstractC23304d.f113261C) {
                                C28644j.this.m143292X0();
                            }
                        }
                    } else {
                        AbstractC23309i.m121734ay(System.currentTimeMillis() + 3600000);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            C28644j.this.f132760e = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C28644j.this.m143231U0(jSONObject);
                C28644j.this.m143243e1(jSONObject);
                C28644j.this.f132760e = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.j$j */
    /* loaded from: classes4.dex */
    public class j implements InterfaceC20094a {

        /* renamed from: vw.j$j$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42168Jb();
            }
        }

        /* renamed from: vw.j$j$b */
        /* loaded from: classes4.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C3254m0 f132789a;

            b(C3254m0 c3254m0) {
                this.f132789a = c3254m0;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42499p9(this.f132789a);
            }
        }

        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.m104538g("updateTrendingKeywordList...fail", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            C28644j c28644j = C28644j.this;
            int i11 = c28644j.f132766k + 1;
            c28644j.f132766k = i11;
            AbstractC23309i.m120909Eo(currentTimeMillis + AbstractC23160o0.m119261j0(i11, 15000L));
            C28644j.this.f132764i = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    AbstractC23309i.m120909Eo(jSONObject.optLong("expired_time", 0L) + currentTimeMillis);
                    if (jSONObject.has("trending_keyword")) {
                        C0824j.m2153b(new a());
                        JSONObject jSONObject2 = jSONObject.getJSONObject("trending_keyword");
                        if (jSONObject2.has("icon_url")) {
                            AbstractC23309i.m121474Ty(jSONObject2.optString("icon_url"));
                        }
                        if (jSONObject2.has("icon_event")) {
                            String optString = jSONObject2.optString("icon_event");
                            int m143251k0 = C28644j.m143251k0(AbstractC23309i.m122575xd());
                            int m143251k02 = C28644j.m143251k0(optString);
                            AbstractC23309i.m121511Uy(optString);
                            if (m143251k0 < m143251k02) {
                                AbstractC23309i.m121570Wj(true);
                                AbstractC23309i.m122395si(false);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        if (jSONObject2.has("key_words")) {
                            JSONArray jSONArray = jSONObject2.getJSONArray("key_words");
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                                C3254m0 c3254m0 = new C3254m0();
                                c3254m0.m16542p(jSONObject3);
                                hashMap.put(Long.valueOf(c3254m0.f13916a), c3254m0);
                                C0824j.m2153b(new b(c3254m0));
                            }
                        }
                        Map map = C28644j.f132751v;
                        synchronized (map) {
                            map.clear();
                            map.putAll(hashMap);
                            C28644j.this.m143218I0();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    if (currentTimeMillis >= AbstractC23309i.m122612yd()) {
                        C28644j c28644j = C28644j.this;
                        int i12 = c28644j.f132766k + 1;
                        c28644j.f132766k = i12;
                        AbstractC23309i.m120909Eo(currentTimeMillis + AbstractC23160o0.m119261j0(i12, 15000L));
                    }
                }
            } finally {
                C28644j.this.f132764i = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.j$k */
    /* loaded from: classes4.dex */
    public class k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0765j f132791a;

        /* renamed from: b */
        final /* synthetic */ int f132792b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f132793c;

        k(InterfaceC0765j interfaceC0765j, int i11, ArrayList arrayList) {
            this.f132791a = interfaceC0765j;
            this.f132792b = i11;
            this.f132793c = arrayList;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (c20096c == null) {
                    C28644j.this.f132761f = false;
                    C28644j.this.f132762g = 0;
                } else {
                    int m104491c = c20096c.m104491c();
                    if (m104491c == 250) {
                        JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                        C28644j.this.m143231U0(jSONObject);
                        AbstractC20887g.m109230h(1000000, "1412 error: " + jSONObject.toString());
                        C28644j.this.m143243e1(jSONObject);
                        C28644j.this.f132761f = false;
                        AbstractC23309i.m121469Tt(0);
                        C28644j.this.f132762g = 0;
                    } else if (m104491c != 253) {
                        C28644j.this.f132761f = false;
                        C28644j.this.f132762g = 0;
                    } else {
                        C28644j.this.f132762g++;
                        if (C28644j.this.f132762g > 2) {
                            C28644j.this.f132762g = 0;
                            C28644j.this.f132761f = false;
                        } else {
                            this.f132791a.mo1735s7(this.f132792b, this.f132793c);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C28644j.this.f132761f = false;
                C28644j.this.f132762g = 0;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C28644j.this.m143231U0(((JSONObject) obj).getJSONObject("data"));
                C28644j.this.f132761f = false;
                AbstractC23309i.m121469Tt(0);
                C28644j.this.f132762g = 0;
            } catch (Exception e11) {
                e11.printStackTrace();
                C28644j.this.f132761f = false;
                C28644j.this.f132762g = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vw.j$l */
    /* loaded from: classes4.dex */
    public class l implements C19516c.c {

        /* renamed from: a */
        final /* synthetic */ boolean f132795a;

        /* renamed from: b */
        final /* synthetic */ C3245i f132796b;

        l(boolean z11, C3245i c3245i) {
            this.f132795a = z11;
            this.f132796b = c3245i;
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(int i11, C20096c c20096c) {
            ArrayList arrayList = AbstractC23304d.f113261C;
            synchronized (arrayList) {
                try {
                    SparseArray sparseArray = AbstractC23304d.f113265D;
                    C3245i c3245i = (C3245i) sparseArray.get(i11);
                    if (c3245i != null) {
                        arrayList.remove(c3245i);
                        sparseArray.remove(c3245i.m16463e());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C28644j.this.f132759d.remove(Integer.valueOf(i11));
            if (this.f132795a) {
                AbstractC20887g.m109230h(1000000, "remove on error");
            }
            if (C28644j.this.f132759d.size() == 0) {
                C2834f.f11325a.m13689k();
            }
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(int i11, ArrayList arrayList) {
            C28644j.this.f132759d.remove(Integer.valueOf(i11));
            if (this.f132795a) {
                AbstractC20887g.m109230h(1000000, "remove on success");
            }
            if (C28644j.this.f132759d.size() == 0) {
                C2834f.f11325a.m13689k();
            }
            if (!C28644j.f132747r.containsKey(Integer.valueOf(this.f132796b.f13854b))) {
                new C0844t(null, null).m2253g(this.f132796b.f13854b + "");
            }
        }
    }

    /* renamed from: vw.j$m */
    /* loaded from: classes4.dex */
    public interface m {
        /* renamed from: a */
        void mo35936a(C25630b c25630b);
    }

    /* renamed from: vw.j$n */
    /* loaded from: classes4.dex */
    public interface n {
        /* renamed from: a */
        void mo143202a(List list);
    }

    /* renamed from: vw.j$o */
    /* loaded from: classes4.dex */
    public interface o {
        /* renamed from: f1 */
        void mo16628f1(List list, List list2);
    }

    /* renamed from: vw.j$p */
    /* loaded from: classes4.dex */
    public interface p extends o {
        /* renamed from: n0 */
        void mo36242n0(List list);
    }

    private C28644j() {
        f132746q = AbstractC0924m0.m4390z0();
        m143240d0();
        AbstractC20887g.m109230h(1000000, "hit init parser from start up");
        m143310t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m143204A0() {
        m143285S();
        List m143220L0 = m143220L0();
        ArrayList arrayList = AbstractC23304d.f113269E;
        synchronized (arrayList) {
            arrayList.clear();
            arrayList.addAll(m143220L0);
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: vw.h
            @Override // java.lang.Runnable
            public final void run() {
                C28644j.m143274z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public static /* synthetic */ void m143206B0() {
        C2834f.f11325a.m13686e();
        f132753x.set(2);
    }

    /* renamed from: C */
    public static boolean m143207C() {
        if (f132753x.get() == 2 && f132754y.get() == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m143208C0() {
        m143286T();
        List<C3245i> m143222M0 = m143222M0();
        synchronized (AbstractC23304d.f113261C) {
            try {
                AbstractC23304d.f113265D.clear();
                for (C3245i c3245i : m143222M0) {
                    AbstractC23304d.f113265D.put(c3245i.m16463e(), c3245i);
                }
                ArrayList arrayList = AbstractC23304d.f113261C;
                arrayList.clear();
                arrayList.addAll(m143222M0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: vw.f
            @Override // java.lang.Runnable
            public final void run() {
                C28644j.m143206B0();
            }
        });
    }

    /* renamed from: D */
    public static boolean m143209D() {
        if (f132753x.get() == 2 && f132755z.get() == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public static /* synthetic */ void m143210D0() {
        C2834f.f11325a.m13686e();
        f132755z.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m143211E0() {
        List m143224N0 = m143224N0();
        ArrayList arrayList = AbstractC23304d.f113273F;
        synchronized (arrayList) {
            arrayList.clear();
            arrayList.addAll(m143224N0);
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: vw.g
            @Override // java.lang.Runnable
            public final void run() {
                C28644j.m143210D0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public static /* synthetic */ void m143212F0(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25630b c25630b = (C25630b) it.next();
            C3251l c3251l = new C3251l(0);
            c3251l.m16522l(c25630b);
            hashMap.put(c3251l.m16512b(), c3251l);
        }
        synchronized (f132751v) {
            f132750u.putAll(hashMap);
        }
        C2834f.f11325a.m13686e();
    }

    /* renamed from: G */
    private void m143213G() {
        if (f132754y.compareAndSet(0, 1)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vw.c
                @Override // java.lang.Runnable
                public final void run() {
                    C28644j.this.m143204A0();
                }
            });
        }
    }

    /* renamed from: G0 */
    private void m143214G0(List list) {
        String str;
        String str2;
        int i11;
        int i12;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C3254m0.c cVar : ((C3254m0) it.next()).f13930o) {
                if (cVar instanceof C3254m0.d) {
                    C3254m0.d dVar = (C3254m0.d) cVar;
                    if (!TextUtils.isEmpty(dVar.f13943e)) {
                        C25810b c25810b = dVar.f13942d;
                        C3251l c3251l = new C3251l(2);
                        C25810b c25810b2 = dVar.f13940b;
                        if (c25810b2 == null) {
                            str = "";
                        } else {
                            str = c25810b2.f123105a;
                        }
                        if (c25810b == null) {
                            str2 = "";
                        } else {
                            str2 = c25810b.f123105a;
                        }
                        if (c25810b != null) {
                            i11 = c25810b.f123106b;
                        } else {
                            i11 = 1;
                        }
                        if (c25810b != null) {
                            i12 = c25810b.f123107c;
                        } else {
                            i12 = 1;
                        }
                        c3251l.m16521k(new C25811c(str, str2, i11, i12, dVar.f13943e, null, -1, -1, -1));
                        hashMap.put(c3251l.m16512b(), c3251l);
                    }
                }
            }
        }
        f132750u.putAll(hashMap);
    }

    /* renamed from: H */
    private void m143215H() {
        if (f132753x.compareAndSet(0, 1)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vw.a
                @Override // java.lang.Runnable
                public final void run() {
                    C28644j.this.m143208C0();
                }
            });
        }
    }

    /* renamed from: H0 */
    private void m143216H0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C3254m0.c cVar : ((C3254m0) it.next()).f13930o) {
                if (cVar instanceof C3254m0.e) {
                    C3254m0.e eVar = (C3254m0.e) cVar;
                    C25630b c25630b = new C25630b();
                    c25630b.m132404N(eVar.f13944b);
                    c25630b.m132405O(eVar.f13945c);
                    c25630b.m132414X(eVar.f13944b);
                    c25630b.m132410T(eVar.f13946d);
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C25630b) it2.next()).m132429g() == eVar.f13945c) {
                                break;
                            }
                        } else {
                            arrayList.add(c25630b);
                            break;
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            m143284R0(arrayList, this, new n() { // from class: vw.i
                @Override // p588vw.C28644j.n
                /* renamed from: a */
                public final void mo143202a(List list2) {
                    C28644j.m143212F0(list2);
                }
            });
        }
    }

    /* renamed from: I */
    private void m143217I() {
        if (f132755z.compareAndSet(0, 1)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vw.b
                @Override // java.lang.Runnable
                public final void run() {
                    C28644j.this.m143211E0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public void m143218I0() {
        ArrayList<C3254m0> arrayList = new ArrayList(f132751v.values());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C3254m0 c3254m0 : arrayList) {
            int i11 = c3254m0.f13928m;
            if (i11 == 0 || i11 == 2) {
                if (c3254m0.f13930o.size() > 0) {
                    if (c3254m0.f13928m == 0) {
                        arrayList2.add(c3254m0);
                    } else {
                        arrayList3.add(c3254m0);
                    }
                }
            }
        }
        f132750u.clear();
        m143216H0(arrayList2);
        m143214G0(arrayList3);
        C2834f.f11325a.m13686e();
    }

    /* renamed from: J */
    private void m143219J(C25630b c25630b) {
        try {
            File file = new File(c25630b.m132439q());
            if (file.exists()) {
                AbstractC23041d2.m118211j(file);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: L0 */
    private List m143220L0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3245i(-3, "LOCAL_DEFINE_NAME_CATE", "", 1, "", "", "", "", 0, 0, 0, 1, -1, "", 1, 0, "", 0L));
        arrayList.addAll(C7960e.m41971c6().m42530s5(CoreUtility.f89233i));
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C3245i c3245i = (C3245i) arrayList.get(i11);
            if (!f132747r.containsKey(Integer.valueOf(c3245i.f13854b))) {
                arrayList2.add(c3245i.f13854b + "");
            }
        }
        if (arrayList2.size() > 0) {
            new C0844t(null, null).m2253g((String[]) arrayList2.toArray(new String[0]));
        }
        return arrayList;
    }

    /* renamed from: M */
    private static void m143221M(C25630b c25630b) {
        if (c25630b != null && !TextUtils.isEmpty(c25630b.m132446x())) {
            AbstractC24006q.m125840K1(c25630b.m132446x());
        }
    }

    /* renamed from: M0 */
    private List m143222M0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3245i(-2, "LOCAL_DEFINE_NAME_CATE", "", 1, "", "", "", "", 0, 0, 0, 1, -1, "", 1, 0, "", 0L));
        if (C3229a.f13790a.m16391e()) {
            arrayList.add(C3233c.f13805a.m16424d());
        }
        arrayList.addAll(AbstractC23080g8.m118399d());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C3245i c3245i = (C3245i) arrayList.get(i11);
            if (c3245i.f13869q == 3) {
                if (c3245i.f13854b == 39) {
                    AbstractC20887g.m109230h(1000000, "delete funchar");
                }
                C7960e.m41971c6().m42409h4(CoreUtility.f89233i, c3245i.f13854b + "");
            } else {
                int i12 = c3245i.f13854b;
                if (i12 != 0 && i12 != -2 && i12 != -10 && TextUtils.isEmpty(c3245i.f13858f)) {
                    arrayList2.add(c3245i);
                } else if (!f132747r.containsKey(Integer.valueOf(c3245i.f13854b))) {
                    arrayList3.add(c3245i.f13854b + "");
                }
            }
        }
        if (arrayList3.size() > 0) {
            new C0844t(null, null).m2253g((String[]) arrayList3.toArray(new String[0]));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C3245i c3245i2 = (C3245i) it.next();
            if (c3245i2.f13854b == 39) {
                AbstractC20887g.m109230h(1000000, "call download on not having icon");
            }
            m143230U(c3245i2);
        }
        return arrayList;
    }

    /* renamed from: N */
    private void m143223N(int i11) {
        f132748s.remove(Integer.valueOf(i11));
        ArrayList arrayList = AbstractC23304d.f113273F;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3245i c3245i = (C3245i) it.next();
                    if (c3245i != null && c3245i.f13854b == i11) {
                        c3245i.f13875w = -1;
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: N0 */
    private List m143224N0() {
        ArrayList m42540t5 = C7960e.m41971c6().m42540t5();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < m42540t5.size(); i11++) {
            C3245i c3245i = (C3245i) m42540t5.get(i11);
            if (!f132748s.containsKey(Integer.valueOf(c3245i.f13854b))) {
                arrayList.add(c3245i);
            }
        }
        if (arrayList.size() > 0) {
            new C0846u(null, null).m2253g((C3245i[]) arrayList.toArray(new C3245i[0]));
        }
        return m42540t5;
    }

    /* renamed from: O */
    private void m143225O(int i11) {
        if (i11 < 0) {
            return;
        }
        f132749t.remove(i11 + "");
    }

    /* renamed from: P */
    public static void m143226P(int i11) {
        m143227Q(i11, null);
    }

    /* renamed from: Q */
    public static void m143227Q(int i11, Set set) {
        C28644j m143233Y = m143233Y();
        if (m143233Y != null && m143233Y.m143278K(i11)) {
            LinkedHashMap m143301f0 = m143233Y.m143301f0(i11);
            if (m143301f0 != null) {
                for (String str : m143301f0.keySet()) {
                    C3251l c3251l = (C3251l) m143301f0.get(str);
                    if (c3251l != null) {
                        if (set == null || set.isEmpty() || set.contains(c3251l.m16512b())) {
                            if (i11 != -2 || (c3251l.m16514d() != null && !c3251l.m16514d().m132448z())) {
                                f132749t.remove(str);
                                C25630b m16514d = c3251l.m16514d();
                                if (m16514d != null) {
                                    m143221M(m16514d);
                                }
                            }
                        }
                    } else {
                        f132749t.remove(str);
                    }
                }
            }
            m143229S0(i11);
        }
    }

    /* renamed from: R */
    public static void m143228R(int i11) {
        ArrayList arrayList = AbstractC23304d.f113261C;
        synchronized (arrayList) {
            try {
                SparseArray sparseArray = AbstractC23304d.f113265D;
                C3245i c3245i = (C3245i) sparseArray.get(i11);
                if (c3245i != null) {
                    arrayList.remove(c3245i);
                    sparseArray.remove(c3245i.m16463e());
                }
            } finally {
            }
        }
        ArrayList arrayList2 = AbstractC23304d.f113269E;
        synchronized (arrayList2) {
            try {
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = AbstractC23304d.f113269E;
                    if (((C3245i) arrayList3.get(i12)).m16463e() == i11) {
                        arrayList3.remove(i12);
                        break;
                    }
                    i12++;
                }
            } finally {
            }
        }
        m143226P(i11);
    }

    /* renamed from: S0 */
    public static void m143229S0(int i11) {
        f132747r.remove(Integer.valueOf(i11));
        synchronized (AbstractC23304d.f113261C) {
            try {
                C3245i c3245i = (C3245i) AbstractC23304d.f113265D.get(i11);
                if (c3245i != null) {
                    c3245i.f13875w = -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: U */
    private void m143230U(C3245i c3245i) {
        boolean z11;
        if (c3245i.f13854b == 39) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            AbstractC20887g.m109230h(1000000, "check should download");
        }
        if (!this.f132759d.containsKey(Integer.valueOf(c3245i.f13854b))) {
            this.f132759d.put(Integer.valueOf(c3245i.f13854b), Integer.valueOf(c3245i.f13854b));
            if (z11) {
                AbstractC20887g.m109230h(1000000, "create download task");
            }
            C19515b.m101996i().m102004m(c3245i, 10, new l(z11, c3245i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public void m143231U0(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("expired_time");
        int optInt = jSONObject.optInt("version");
        if (optLong > 0) {
            AbstractC23309i.m121734ay(System.currentTimeMillis() + (optLong * 1000));
        }
        AbstractC23309i.m121809cy(optInt);
    }

    /* renamed from: X */
    public static String m143232X() {
        if (!TextUtils.isEmpty(f132746q)) {
            return f132746q + "/api/emoticon/sticker?";
        }
        return AbstractC29039u0.m145033a(AbstractC29039u0.b.ZALO_STICKER_DOWNLOAD_URL_NEW);
    }

    /* renamed from: Y */
    public static synchronized C28644j m143233Y() {
        C28644j c28644j;
        synchronized (C28644j.class) {
            try {
                if (f132752w == null) {
                    synchronized (C28644j.class) {
                        try {
                            if (f132752w == null) {
                                f132752w = new C28644j();
                            }
                        } finally {
                        }
                    }
                } else if (f132753x.get() == 0 || f132754y.get() == 0 || f132755z.get() == 0) {
                    AbstractC20887g.m109230h(1000000, "hit init parser not having data");
                    f132752w.m143310t0();
                }
                c28644j = f132752w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28644j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m143237c0(int i11) {
        C3245i c3245i = new C3245i();
        c3245i.f13854b = i11;
        C19515b.m101996i().m102003l(c3245i, 9, 1, -1, new b());
    }

    /* renamed from: c1 */
    public static void m143238c1(int i11, int i12) {
        ArrayList arrayList = AbstractC23304d.f113261C;
        synchronized (arrayList) {
            try {
                C3245i c3245i = (C3245i) AbstractC23304d.f113265D.get(i11);
                C3233c c3233c = C3233c.f13805a;
                arrayList.remove(c3233c.m16424d());
                if (c3245i != null) {
                    arrayList.remove(c3245i);
                    if (i12 >= 0 && i12 < arrayList.size()) {
                        arrayList.add(i12, c3245i);
                    } else {
                        arrayList.add(c3245i);
                    }
                    c3245i.f13872t = i12;
                }
                if (C3229a.f13790a.m16391e()) {
                    arrayList.add(1, c3233c.m16424d());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d0 */
    private String m143240d0() {
        if (TextUtils.isEmpty(this.f132758c)) {
            this.f132758c = C20131e.f99303a.m104942a0();
        }
        return this.f132758c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static void m143241d1(int i11, int i12) {
        ArrayList arrayList = AbstractC23304d.f113269E;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    ArrayList arrayList2 = AbstractC23304d.f113269E;
                    C3245i c3245i = (C3245i) arrayList2.get(i13);
                    if (c3245i.m16463e() == i11) {
                        arrayList2.remove(i13);
                        if (i12 < arrayList2.size()) {
                            arrayList2.add(i12, c3245i);
                        } else {
                            arrayList2.add(c3245i);
                        }
                    } else {
                        i13++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public void m143243e1(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("stickerCates");
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                int i12 = optJSONArray.getInt(i11);
                if (!hashMap.containsKey(Integer.valueOf(i12)) && i12 > 0) {
                    hashMap.put(Integer.valueOf(i12), Integer.valueOf(i11 + 1));
                }
            }
            HashMap hashMap2 = new HashMap();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("updateSticker");
            if (optJSONArray2 != null) {
                for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i13);
                    int optInt = jSONObject2.optInt("cateId");
                    int optInt2 = jSONObject2.optInt("cateVer");
                    if (optInt > 0) {
                        hashMap2.put(Integer.valueOf(optInt), Integer.valueOf(optInt2));
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            synchronized (AbstractC23304d.f113261C) {
                int i14 = 0;
                while (true) {
                    try {
                        ArrayList arrayList = AbstractC23304d.f113261C;
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        C3245i c3245i = (C3245i) arrayList.get(i14);
                        int i15 = c3245i.f13854b;
                        if (i15 > 0) {
                            hashMap3.put(Integer.valueOf(i15), c3245i);
                        }
                        i14++;
                    } finally {
                    }
                }
            }
            Iterator it = hashMap3.keySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (!hashMap.containsKey(num)) {
                    it.remove();
                    if (num.intValue() == 39) {
                        AbstractC20887g.m109230h(1000000, "delete on update sticker list, not in server map");
                    }
                    C28020b3.f130648a.m141196k(num.intValue(), false);
                    m143228R(num.intValue());
                } else if (hashMap2.containsKey(num) && ((C3245i) hashMap3.get(num)).f13871s < ((Integer) hashMap2.get(num)).intValue()) {
                    it.remove();
                    C28020b3.f130648a.m141198m(num.intValue());
                    m143228R(num.intValue());
                }
                z11 = true;
            }
            m143257n0(optJSONArray2);
            ArrayList arrayList2 = new ArrayList();
            for (Integer num2 : hashMap.keySet()) {
                if (num2.intValue() != 0 && !hashMap3.containsKey(num2)) {
                    C3245i c3245i2 = new C3245i();
                    c3245i2.f13854b = num2.intValue();
                    arrayList2.add(c3245i2);
                    m143267v0(c3245i2, -1);
                    C7960e.m41971c6().m42321Y8(CoreUtility.f89233i, c3245i2);
                    z11 = true;
                }
            }
            for (Integer num3 : hashMap.keySet()) {
                int intValue = ((Integer) hashMap.get(num3)).intValue();
                if (!z11 && (hashMap3.get(num3) == null || ((C3245i) hashMap3.get(num3)).m16465g() != intValue)) {
                    z11 = true;
                }
                if (z11) {
                    if (num3.intValue() == 0) {
                        AbstractC23309i.m121618Xu(intValue);
                        m143238c1(num3.intValue(), intValue);
                    } else {
                        C7960e.m41971c6().m42344ae(num3.intValue(), ((Integer) hashMap.get(num3)).intValue());
                        m143238c1(num3.intValue(), ((Integer) hashMap.get(num3)).intValue());
                    }
                }
            }
            m143255m0(jSONObject);
            if (arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C3245i c3245i3 = (C3245i) it2.next();
                    if (c3245i3.f13854b == 39) {
                        AbstractC20887g.m109230h(1000000, "call download on update list, not in local");
                    }
                    m143230U(c3245i3);
                }
                return;
            }
            C2834f.f11325a.m13686e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i0 */
    public static int m143248i0() {
        if (f132745C <= 0) {
            f132745C = AbstractC23080g8.m118401f(MainApplication.getAppContext());
        }
        return f132745C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static int m143251k0(String str) {
        try {
            return new JSONObject(str).optInt("version", -1);
        } catch (JSONException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: l0 */
    private void m143253l0() {
        C3251l c3251l;
        try {
            ArrayList m42163J6 = C7960e.m41971c6().m42163J6(CoreUtility.f89233i);
            if (m42163J6.size() > 0) {
                String m143232X = m143232X();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i11 = 0; i11 < m42163J6.size(); i11++) {
                    C3232b0 c3232b0 = (C3232b0) m42163J6.get(i11);
                    if (c3232b0.m16416o() == 0) {
                        C3247j m16412k = c3232b0.m16412k();
                        if (m16412k != null) {
                            String str = (m143240d0() + m16412k.f13889b + "/") + m16412k.f13890c + ".amr";
                            C25630b c25630b = new C25630b();
                            c25630b.m132405O(m16412k.f13890c);
                            c25630b.m132404N(m16412k.f13888a);
                            c25630b.m132414X(m16412k.f13889b);
                            c25630b.m132419b(m143232X, m143248i0());
                            if (!TextUtils.isEmpty(m16412k.f13892e)) {
                                c25630b.m132410T(Integer.parseInt(m16412k.f13892e));
                            }
                            c25630b.m132409S(m16412k.f13891d);
                            c25630b.m132406P(m16412k.f13896i);
                            c25630b.m132407Q(m16412k.f13894g);
                            AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
                            if (AbstractC23041d2.m118194A(str)) {
                                c25630b.m132411U(str);
                            }
                            if (c25630b.m132448z()) {
                                C25630b c25630b2 = (C25630b) f132749t.get(c25630b.m132429g() + "");
                                if (c25630b2 != null) {
                                    if (TextUtils.isEmpty(c25630b2.m132431i()) || !c25630b2.m132431i().contains("emoticons/")) {
                                        m143297a1(c25630b);
                                    }
                                } else {
                                    m143297a1(c25630b);
                                }
                            } else {
                                m143297a1(c25630b);
                            }
                            C3251l c3251l2 = new C3251l(c3232b0.m16416o());
                            c3251l2.m16522l(c25630b);
                            linkedHashMap.put(c3251l2.m16512b(), c3251l2);
                        }
                    } else {
                        if (c3232b0.m16403b() == -10) {
                            c3251l = c3232b0.m16402a();
                        } else {
                            C3251l c3251l3 = new C3251l(c3232b0.m16416o());
                            c3251l3.m16522l(null);
                            c3251l3.m16520j(c3232b0.m16406e());
                            c3251l3.m16521k(c3232b0.m16411j());
                            c3251l = c3251l3;
                        }
                        linkedHashMap.put(c3251l.m16512b(), c3251l);
                    }
                }
                f132747r.put(-2, linkedHashMap);
            }
            m143299b1(m42163J6.size());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m0 */
    private void m143255m0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("removeSticker")) != null && optJSONArray.length() != 0) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    int optInt = jSONObject2.optInt("sticker_id", -1);
                    int optInt2 = jSONObject2.optInt("cate_id", -1);
                    if (optInt2 > 0 && optInt >= 0) {
                        C25630b m143290W = m143290W(optInt + "");
                        m143290W.m132414X(optInt2);
                        m143290W.m132407Q("");
                        m143219J(m143290W);
                        m143221M(m143290W);
                        m143225O(optInt);
                        C7960e.m41971c6().m42440k4(optInt2, optInt + "", CoreUtility.f89233i);
                        C7960e.m41971c6().m42450l4(optInt2, optInt + "", CoreUtility.f89233i);
                        hashSet.add(Integer.valueOf(optInt2));
                        hashSet2.add(optInt + "");
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                m143223N(intValue);
                m143226P(intValue);
                C28020b3.f130648a.m141185J(intValue);
            }
            m143286T();
            m143285S();
            m143227Q(-2, hashSet2);
            m143226P(-3);
        }
    }

    /* renamed from: n0 */
    private void m143257n0(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    JSONArray optJSONArray = jSONObject.optJSONArray("cateList");
                    int optInt = jSONObject.optInt("cateId", -1);
                    if (optJSONArray != null && optInt > 0) {
                        boolean z11 = false;
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                            int optInt2 = jSONObject2.optInt("id");
                            int optInt3 = jSONObject2.optInt("ver");
                            if (optInt2 >= 0) {
                                C25630b m143290W = m143290W(optInt2 + "");
                                m143290W.m132414X(optInt);
                                if (m143272y0(m143290W, optInt3)) {
                                    m143290W.m132407Q("");
                                    m143219J(m143290W);
                                    C28181s2.f131306a.m141725h(m143290W);
                                    m143221M(m143290W);
                                    m143225O(m143290W.m132429g());
                                    z11 = true;
                                }
                            }
                        }
                        if (z11) {
                            m143226P(optInt);
                            m143223N(optInt);
                            C28020b3.f130648a.m141185J(optInt);
                        }
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: s0 */
    private void m143263s0() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String m143232X = m143232X();
            int i11 = 0;
            while (true) {
                String[] strArr = f132743A;
                if (i11 < strArr.length) {
                    String str = "emoticons/" + f132744B[i11] + ".gif";
                    String str2 = strArr[i11];
                    C25630b c25630b = new C25630b();
                    c25630b.m132405O(Integer.parseInt(str2));
                    c25630b.m132404N(0);
                    c25630b.m132414X(0);
                    c25630b.m132410T(2);
                    c25630b.m132409S("");
                    c25630b.m132406P(0);
                    c25630b.m132407Q(str);
                    c25630b.m132419b(m143232X, m143248i0());
                    m143297a1(c25630b);
                    C3251l c3251l = new C3251l(0);
                    c3251l.m16522l(c25630b);
                    linkedHashMap.put(c3251l.m16512b(), c3251l);
                    i11++;
                } else {
                    f132747r.put(0, linkedHashMap);
                    return;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: v0 */
    public static void m143267v0(C3245i c3245i, int i11) {
        ArrayList arrayList = AbstractC23304d.f113261C;
        synchronized (arrayList) {
            try {
                C3233c c3233c = C3233c.f13805a;
                arrayList.remove(c3233c.m16424d());
                SparseArray sparseArray = AbstractC23304d.f113265D;
                C3245i c3245i2 = (C3245i) sparseArray.get(c3245i.m16463e());
                if (c3245i2 != null) {
                    arrayList.remove(c3245i2);
                }
                sparseArray.put(c3245i.m16463e(), c3245i);
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.add(i11, c3245i);
                } else {
                    arrayList.add(c3245i);
                }
                if (C3229a.f13790a.m16391e()) {
                    arrayList.add(1, c3233c.m16424d());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static void m143269w0(C3245i c3245i, int i11) {
        ArrayList arrayList = AbstractC23304d.f113269E;
        synchronized (arrayList) {
            if (i11 >= 0) {
                try {
                    if (i11 < arrayList.size()) {
                        arrayList.add(i11, c3245i);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(c3245i);
        }
    }

    /* renamed from: y0 */
    private boolean m143272y0(C25630b c25630b, int i11) {
        try {
            int m132445w = c25630b.m132445w();
            if (m132445w == -1) {
                String m132436n = c25630b.m132436n();
                if (AbstractC23041d2.m118194A(m132436n)) {
                    String m118197D = AbstractC23041d2.m118197D(m132436n);
                    JSONObject jSONObject = new JSONObject(m118197D);
                    if (!TextUtils.isEmpty(m118197D)) {
                        m132445w = jSONObject.optInt("version", 0);
                        c25630b.m132426e0(m132445w);
                    }
                }
            }
            if (i11 > m132445w) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static /* synthetic */ void m143274z0() {
        C2834f.f11325a.m13687g();
        f132754y.set(2);
    }

    /* renamed from: E */
    public void m143275E(int i11, LinkedHashMap linkedHashMap) {
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            f132747r.put(Integer.valueOf(i11), linkedHashMap);
        }
    }

    /* renamed from: F */
    public void m143276F() {
        try {
            if (C3229a.f13790a.m16391e()) {
                ArrayList arrayList = AbstractC23304d.f113261C;
                C3233c c3233c = C3233c.f13805a;
                arrayList.remove(c3233c.m16424d());
                int i11 = 1;
                if (1 > arrayList.size()) {
                    i11 = 0;
                }
                arrayList.add(i11, c3233c.m16424d());
            } else {
                AbstractC23304d.f113261C.remove(C3233c.f13805a.m16424d());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: J0 */
    public void m143277J0(int i11) {
        ArrayList m42273T6;
        try {
            if (i11 == -2) {
                m143253l0();
                return;
            }
            if (i11 == -10) {
                f132747r.put(Integer.valueOf(i11), C3233c.f13805a.m16426f());
                return;
            }
            if (i11 == -3) {
                m42273T6 = C7960e.m41971c6().m42176K6(CoreUtility.f89233i);
                m143295Z0(m42273T6.size());
            } else {
                m42273T6 = C7960e.m41971c6().m42273T6(i11 + "");
            }
            if (i11 == 39) {
                AbstractC20887g.m109230h(1000000, "parse sticker list, local size: " + m42273T6.size());
            }
            boolean z11 = false;
            if (m42273T6.size() > 0) {
                String m143232X = m143232X();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i12 = 0; i12 < m42273T6.size(); i12++) {
                    C3247j c3247j = (C3247j) m42273T6.get(i12);
                    String str = (m143240d0() + c3247j.f13889b + "/") + c3247j.f13890c + ".amr";
                    C25630b c25630b = new C25630b();
                    c25630b.m132405O(c3247j.f13890c);
                    c25630b.m132404N(c3247j.f13888a);
                    c25630b.m132414X(c3247j.f13889b);
                    c25630b.m132419b(m143232X, m143248i0());
                    if (!TextUtils.isEmpty(c3247j.f13892e)) {
                        c25630b.m132410T(Integer.parseInt(c3247j.f13892e));
                    }
                    c25630b.m132409S(c3247j.f13891d);
                    c25630b.m132406P(c3247j.f13896i);
                    c25630b.m132407Q(c3247j.f13894g);
                    AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
                    if (AbstractC23041d2.m118194A(str)) {
                        c25630b.m132411U(str);
                    }
                    if (c25630b.m132448z()) {
                        C25630b c25630b2 = (C25630b) f132749t.get(c25630b.m132429g() + "");
                        if (c25630b2 != null) {
                            if (TextUtils.isEmpty(c25630b2.m132431i()) || !c25630b2.m132431i().contains("emoticons/")) {
                                m143297a1(c25630b);
                            }
                        } else {
                            m143297a1(c25630b);
                        }
                    } else {
                        m143297a1(c25630b);
                    }
                    C3251l c3251l = new C3251l(0);
                    c3251l.m16522l(c25630b);
                    linkedHashMap.put(c3251l.m16512b(), c3251l);
                }
                f132747r.put(Integer.valueOf(i11), linkedHashMap);
                return;
            }
            if (i11 != -3 && i11 != 0) {
                synchronized (AbstractC23304d.f113261C) {
                    try {
                        C3245i c3245i = (C3245i) AbstractC23304d.f113265D.get(i11);
                        if (c3245i != null) {
                            if (i11 == 39) {
                                AbstractC20887g.m109230h(1000000, "parse sticker list, call download on not having local");
                            }
                            m143230U(c3245i);
                            z11 = true;
                        }
                    } finally {
                    }
                }
                if (!z11) {
                    Iterator it = AbstractC23304d.f113269E.iterator();
                    while (it.hasNext()) {
                        if (((C3245i) it.next()).f13854b == i11) {
                            m143237c0(i11);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public boolean m143278K(int i11) {
        return f132747r.containsKey(Integer.valueOf(i11));
    }

    /* renamed from: K0 */
    public void m143279K0(C3245i c3245i) {
        ArrayList arrayList = new ArrayList();
        try {
            String str = c3245i.f13864l;
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                String m143232X = m143232X();
                if (jSONArray.length() > 0) {
                    HashMap hashMap = new HashMap();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        C3247j c3247j = new C3247j(jSONArray.getJSONObject(i11));
                        int i12 = c3245i.f13854b;
                        c3247j.f13888a = i12;
                        c3247j.f13889b = i12;
                        C25630b c25630b = new C25630b();
                        c25630b.m132405O(c3247j.f13890c);
                        c25630b.m132404N(c3247j.f13888a);
                        c25630b.m132410T(Integer.parseInt(c3247j.f13892e));
                        c25630b.m132406P(c3247j.f13896i);
                        c25630b.m132414X(c3247j.f13888a);
                        c25630b.m132407Q(c3247j.f13894g);
                        c25630b.m132419b(m143232X, m143248i0());
                        m143297a1(c25630b);
                        C3251l c3251l = new C3251l(0);
                        c3251l.m16522l(c25630b);
                        arrayList.add(c3251l);
                        hashMap.put(Integer.valueOf(c3247j.f13890c), Boolean.FALSE);
                    }
                    AbstractC23304d.f113285I.put(Integer.valueOf(c3245i.f13854b), hashMap);
                    f132748s.put(Integer.valueOf(c3245i.f13854b), arrayList);
                    return;
                }
                return;
            }
            AbstractC23350e.m122777g("EMPTY STICKER parseStickerListOfPromotionCategory " + c3245i.m16463e() + " " + c3245i.m16464f() + " " + c3245i.m16466i(), new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SyncSticker", e11);
        }
    }

    /* renamed from: L */
    public boolean m143280L(int i11) {
        return f132748s.containsKey(Integer.valueOf(i11));
    }

    /* renamed from: O0 */
    public void m143281O0(C25630b c25630b, Object obj, m mVar) {
        new C0836p(new g(mVar), obj).m2254i(c25630b);
    }

    /* renamed from: P0 */
    public C25630b m143282P0(C25630b c25630b) {
        return m143283Q0(c25630b, false);
    }

    /* renamed from: Q0 */
    public C25630b m143283Q0(C25630b c25630b, boolean z11) {
        C25630b m143290W;
        try {
            m143290W = m143290W(c25630b.m132429g() + "");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (m143290W.m132427f() != -1) {
            return m143290W;
        }
        if (z11) {
            return c25630b;
        }
        c25630b.m132419b(m143232X(), m143248i0());
        if (c25630b.m132427f() == -1) {
            c25630b.m132404N(c25630b.m132432j());
        }
        if (c25630b.m132432j() > 0) {
            c25630b.m132407Q("");
        }
        c25630b.m132411U((C20131e.f99303a.m104942a0() + c25630b.m132432j() + "/") + c25630b.m132429g() + ".amr");
        AbstractC24006q.m125840K1(c25630b.m132446x());
        AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
        m143297a1(c25630b);
        return c25630b;
    }

    /* renamed from: R0 */
    public void m143284R0(List list, Object obj, n nVar) {
        new C0838q(new h(nVar), obj).m2254i(list);
    }

    /* renamed from: S */
    public void m143285S() {
        this.f132757b = C7960e.m41971c6().m42497p7(CoreUtility.f89233i);
    }

    /* renamed from: T */
    public void m143286T() {
        this.f132756a = C7960e.m41971c6().m42487o7(CoreUtility.f89233i);
    }

    /* renamed from: T0 */
    public void m143287T0() {
        try {
            synchronized (C28644j.class) {
                Map map = f132751v;
                synchronized (map) {
                    map.clear();
                    f132750u.clear();
                }
                f132752w = null;
                f132747r.clear();
                f132748s.clear();
                f132749t.clear();
                AbstractC23304d.f113261C.clear();
                AbstractC23304d.f113265D.clear();
                AbstractC23304d.f113269E.clear();
                AbstractC23304d.f113273F.clear();
                f132753x.set(0);
                f132754y.set(0);
                f132755z.set(0);
                AbstractC23309i.m120844Cx(0L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public LinkedHashMap m143288V(int i11) {
        AbstractC0840r.m2248c(i11 + "");
        if (m143312x0(i11) && !f132747r.containsKey(Integer.valueOf(i11))) {
            m143277J0(i11);
        }
        return (LinkedHashMap) f132747r.get(Integer.valueOf(i11));
    }

    /* renamed from: V0 */
    public void m143289V0(boolean z11) {
        this.f132756a = z11;
    }

    /* renamed from: W */
    public C25630b m143290W(String str) {
        C25630b c25630b = (C25630b) f132749t.get(str);
        if (c25630b == null) {
            c25630b = new C25630b();
            try {
                c25630b.m132405O(Integer.parseInt(str));
                c25630b.m132419b(m143232X(), m143248i0());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return c25630b;
    }

    /* renamed from: W0 */
    public void m143291W0(boolean z11) {
        this.f132757b = z11;
    }

    /* renamed from: X0 */
    public void m143292X0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = AbstractC23304d.f113261C;
        synchronized (arrayList2) {
            try {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int i11 = ((C3245i) it.next()).f13854b;
                    if (i11 >= 0) {
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m143293Y0(arrayList);
    }

    /* renamed from: Y0 */
    public void m143293Y0(ArrayList arrayList) {
        if (AbstractC23309i.m120888E3() != 1 || this.f132761f) {
            return;
        }
        this.f132761f = true;
        AbstractC23309i.m121469Tt(1);
        int m121045Ic = AbstractC23309i.m121045Ic();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new k(c0766k, m121045Ic, arrayList));
        c0766k.mo1735s7(m121045Ic, arrayList);
    }

    /* renamed from: Z */
    public void m143294Z() {
        try {
            if (f132755z.get() != 2) {
                Runnable runnable = new Runnable() { // from class: vw.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28644j.this.m143294Z();
                    }
                };
                int i11 = this.f132771p + 1;
                this.f132771p = i11;
                AbstractC19444a.m101694b(runnable, AbstractC23160o0.m119261j0(i11, 1000L));
                return;
            }
            this.f132771p = 0;
            if (!this.f132769n && System.currentTimeMillis() - AbstractC23309i.m121082Jc() > 86400000) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c());
                this.f132769n = true;
                c0766k.mo1632eb();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f132769n = false;
        }
    }

    /* renamed from: Z0 */
    public void m143295Z0(int i11) {
        C3245i c3245i = (C3245i) AbstractC23304d.f113269E.get(0);
        if (c3245i.f13854b == -3) {
            c3245i.f13868p = i11;
        }
    }

    /* renamed from: a0 */
    public int m143296a0(int i11, boolean z11) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) f132747r.get(Integer.valueOf(i11));
            if (linkedHashMap != null) {
                if (z11) {
                    return linkedHashMap.size();
                }
                int i12 = 0;
                for (C3251l c3251l : linkedHashMap.values()) {
                    if (c3251l.m16514d() == null || !c3251l.m16514d().m132447y()) {
                        i12++;
                    }
                }
                return i12;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return 0;
    }

    /* renamed from: a1 */
    public void m143297a1(C25630b c25630b) {
        f132749t.put(c25630b.m132429g() + "", c25630b);
    }

    /* renamed from: b0 */
    public void m143298b0() {
        try {
            if (f132754y.get() != 2) {
                Runnable runnable = new Runnable() { // from class: vw.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28644j.this.m143298b0();
                    }
                };
                int i11 = this.f132770o + 1;
                this.f132770o = i11;
                AbstractC19444a.m101694b(runnable, AbstractC23160o0.m119261j0(i11, 1000L));
                return;
            }
            this.f132770o = 0;
            if (!this.f132768m && C23793c.m124316k().mo124311f() > AbstractC23309i.m122278pc()) {
                this.f132768m = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                c0766k.mo1571X5();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f132768m = false;
        }
    }

    /* renamed from: b1 */
    public void m143299b1(int i11) {
        C3245i c3245i = (C3245i) AbstractC23304d.f113261C.get(0);
        if (c3245i.f13854b == -2) {
            c3245i.f13868p = i11;
        }
    }

    /* renamed from: e0 */
    public void m143300e0(ArrayList arrayList, o oVar, Object obj) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap hashMap = f132747r;
            LinkedHashMap linkedHashMap = (LinkedHashMap) hashMap.get(num);
            if (m143312x0(num.intValue()) && linkedHashMap == null) {
                arrayList2.add(num);
            } else {
                arrayList3.add(num);
                arrayList4.add((LinkedHashMap) hashMap.get(num));
            }
        }
        if (arrayList2.size() > 0) {
            C0844t c0844t = new C0844t(new e(oVar, arrayList2), obj);
            String[] strArr = new String[arrayList2.size()];
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                strArr[i11] = arrayList2.get(i11) + "";
            }
            c0844t.m2254i(strArr);
        }
        if (arrayList3.size() > 0 && oVar != null) {
            oVar.mo16628f1(arrayList3, arrayList4);
        }
    }

    /* renamed from: f0 */
    public LinkedHashMap m143301f0(int i11) {
        HashMap hashMap = f132747r;
        if (!hashMap.containsKey(Integer.valueOf(i11))) {
            return null;
        }
        return (LinkedHashMap) hashMap.get(Integer.valueOf(i11));
    }

    /* renamed from: f1 */
    public void m143302f1() {
        if (this.f132764i) {
            return;
        }
        this.f132764i = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new j());
        c0766k.m1829W();
    }

    /* renamed from: g0 */
    public void m143303g0(List list, p pVar) {
        if (list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3245i c3245i = (C3245i) it.next();
            ArrayList arrayList4 = (ArrayList) f132748s.get(Integer.valueOf(c3245i.f13854b));
            if (arrayList4 != null) {
                arrayList2.add(c3245i);
                arrayList3.add(arrayList4);
            } else {
                arrayList.add(c3245i);
            }
        }
        if (arrayList.size() > 0) {
            new C0846u(new f(pVar, arrayList), this).m2254i((C3245i[]) arrayList.toArray(new C3245i[0]));
        }
        if (arrayList2.size() > 0 && pVar != null) {
            pVar.mo36242n0(arrayList3);
        }
    }

    /* renamed from: h0 */
    public ArrayList m143304h0(int i11) {
        HashMap hashMap = f132748s;
        if (!hashMap.containsKey(Integer.valueOf(i11))) {
            return null;
        }
        return (ArrayList) hashMap.get(Integer.valueOf(i11));
    }

    /* renamed from: j0 */
    public void m143305j0() {
        if (f132753x.get() == 2 && !this.f132760e && !this.f132761f) {
            this.f132760e = true;
            this.f132759d.clear();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new i());
            c0766k.mo1577Y3();
        }
    }

    /* renamed from: o0 */
    public boolean m143306o0(int i11) {
        return f132749t.containsKey(i11 + "");
    }

    /* renamed from: p0 */
    public boolean m143307p0() {
        return this.f132756a;
    }

    /* renamed from: q0 */
    public boolean m143308q0() {
        return this.f132757b;
    }

    /* renamed from: r0 */
    public boolean m143309r0() {
        LinkedHashMap m143288V;
        try {
            m143288V = m143288V(-2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m143288V != null && !m143288V.isEmpty()) {
            Iterator it = new ArrayList(m143288V.values()).iterator();
            while (it.hasNext()) {
                if (((C3251l) it.next()).m16519i()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: t0 */
    public void m143310t0() {
        try {
            f132747r.clear();
            f132748s.clear();
            f132749t.clear();
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            m143263s0();
            m143215H();
            m143217I();
            m143213G();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u0 */
    public void m143311u0() {
        if (!this.f132765j && AbstractC23309i.m121791cg()) {
            this.f132765j = true;
            C0824j.m2153b(new d());
        }
    }

    /* renamed from: x0 */
    public boolean m143312x0(int i11) {
        if (i11 == -10) {
            return true;
        }
        try {
            synchronized (AbstractC23304d.f113261C) {
                try {
                    if (((C3245i) AbstractC23304d.f113265D.get(i11)) != null) {
                        return true;
                    }
                    synchronized (AbstractC23304d.f113269E) {
                        int i12 = 0;
                        while (true) {
                            try {
                                ArrayList arrayList = AbstractC23304d.f113269E;
                                if (i12 < arrayList.size()) {
                                    if (((C3245i) arrayList.get(i12)).f13854b == i11) {
                                        return true;
                                    }
                                    i12++;
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }
}
