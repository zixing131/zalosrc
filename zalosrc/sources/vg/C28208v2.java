package vg;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import android.location.Location;
import android.os.Handler;
import bf0.C2793a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p642xe.C29605a;
import p642xe.C29606b;
import p665y0.C30242d;
import re0.AbstractC25759a;
import vg.AbstractC28248z6;
import vg.C28208v2;

/* renamed from: vg.v2 */
/* loaded from: classes3.dex */
public class C28208v2 {

    /* renamed from: l */
    private static volatile C28208v2 f131550l;

    /* renamed from: c */
    private WeakReference f131553c;

    /* renamed from: j */
    private WeakReference f131560j;

    /* renamed from: a */
    public boolean f131551a = false;

    /* renamed from: b */
    boolean f131552b = false;

    /* renamed from: d */
    private final Object f131554d = new Object();

    /* renamed from: e */
    private final Object f131555e = new Object();

    /* renamed from: f */
    private List f131556f = new ArrayList();

    /* renamed from: g */
    private final C30242d f131557g = new C30242d();

    /* renamed from: h */
    private C30242d f131558h = new C30242d();

    /* renamed from: i */
    private final C30242d f131559i = new C30242d();

    /* renamed from: k */
    private final Handler f131561k = new Handler(C2793a.f11144a.m13457b());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.v2$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C29606b f131562a;

        /* renamed from: b */
        final /* synthetic */ boolean f131563b;

        a(C29606b c29606b, boolean z11) {
            this.f131562a = c29606b;
            this.f131563b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.m104535d("checkFetchCategoryFilterDetailFromServer:%s", c20096c);
            this.f131562a.m147164o(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            d m142133A;
            long m147152c;
            ArrayList arrayList;
            Collection collection;
            Collection collection2;
            try {
                if (obj == null) {
                    synchronized (C28208v2.this.f131559i) {
                        try {
                            collection2 = (Set) C28208v2.this.f131559i.m149128f(this.f131562a.m147152c());
                            if (collection2 == null) {
                                collection2 = new LinkedHashSet();
                            }
                        } finally {
                        }
                    }
                    d m142133A2 = C28208v2.this.m142133A();
                    if (m142133A2 != null && this.f131563b) {
                        m142133A2.mo39275b(this.f131562a.m147152c(), new ArrayList(collection2), false);
                        return;
                    }
                    return;
                }
                try {
                    this.f131562a.m147164o(false);
                    AbstractC20110a.m104535d("fetchCategoryFilterDetailFromServer: %s", obj);
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        this.f131562a.m147168s(optJSONObject.optInt("isLoadMore", 0));
                        if (optJSONObject.has("filtersList")) {
                            JSONArray jSONArray = optJSONObject.getJSONArray("filtersList");
                            ArrayList arrayList2 = new ArrayList();
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                try {
                                    C29605a m147125b = C29605a.m147125b(jSONArray.getJSONObject(i11));
                                    m147125b.m147145v(this.f131562a.m147157h());
                                    synchronized (C28208v2.this.f131558h) {
                                        m147125b.m147146w(((Long) C28208v2.this.f131558h.m149129g(m147125b.m147131h(), 0L)).longValue());
                                    }
                                    arrayList2.add(m147125b);
                                    this.f131562a.m147165p(m147125b.m147131h());
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                            C28208v2.this.m142129v(this.f131562a, arrayList2);
                        }
                        C7960e.m41971c6().m42577wd(this.f131562a);
                        if (this.f131562a.m147158i() == 0) {
                            C7960e.m41971c6().m42313Xb(this.f131562a.m147152c(), this.f131562a.m147157h());
                            C7960e.m41971c6().m42524rb();
                            C7960e.m41971c6().m42270T();
                        }
                    }
                    synchronized (C28208v2.this.f131559i) {
                        try {
                            collection = (Set) C28208v2.this.f131559i.m149128f(this.f131562a.m147152c());
                            if (collection == null) {
                                collection = new LinkedHashSet();
                            }
                        } finally {
                        }
                    }
                    m142133A = C28208v2.this.m142133A();
                } catch (Exception e12) {
                    e12.printStackTrace();
                    synchronized (C28208v2.this.f131559i) {
                        try {
                            Collection collection3 = (Set) C28208v2.this.f131559i.m149128f(this.f131562a.m147152c());
                            if (collection3 == null) {
                                collection3 = new LinkedHashSet();
                            }
                            m142133A = C28208v2.this.m142133A();
                            if (m142133A != null && this.f131563b) {
                                m147152c = this.f131562a.m147152c();
                                arrayList = new ArrayList(collection3);
                            } else {
                                return;
                            }
                        } finally {
                        }
                    }
                }
                if (m142133A != null && this.f131563b) {
                    m147152c = this.f131562a.m147152c();
                    arrayList = new ArrayList(collection);
                    m142133A.mo39275b(m147152c, arrayList, false);
                }
            } catch (Throwable th2) {
                synchronized (C28208v2.this.f131559i) {
                    try {
                        Collection collection4 = (Set) C28208v2.this.f131559i.m149128f(this.f131562a.m147152c());
                        if (collection4 == null) {
                            collection4 = new LinkedHashSet();
                        }
                        d m142133A3 = C28208v2.this.m142133A();
                        if (m142133A3 != null && this.f131563b) {
                            m142133A3.mo39275b(this.f131562a.m147152c(), new ArrayList(collection4), false);
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.v2$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC28248z6.f {
        b() {
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            C28208v2 c28208v2 = C28208v2.this;
            c28208v2.f131551a = true;
            c28208v2.m142139m(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.v2$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ JSONObject f131566a;

        c(JSONObject jSONObject) {
            this.f131566a = jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:? -> B:68:0x0101). Please report as a decompilation issue!!! */
        /* renamed from: d */
        public /* synthetic */ void m142149d(Object obj, JSONObject jSONObject) {
            d m142133A;
            int i11;
            JSONObject jSONObject2;
            Object obj2;
            JSONObject jSONObject3;
            JSONArray jSONArray;
            C29606b m147151b;
            try {
                if (obj == null) {
                    d m142133A2 = C28208v2.this.m142133A();
                    if (m142133A2 != null) {
                        m142133A2.mo39274a(C28208v2.this.m142136D(), false);
                        return;
                    }
                    return;
                }
                try {
                    AbstractC20110a.m104535d("fetchCategory: %s", obj);
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        if (optJSONObject.has("expiredTime")) {
                            i11 = Math.min(604800, Math.max(3600, optJSONObject.optInt("expiredTime")));
                        } else {
                            i11 = 43200;
                        }
                        AbstractC23309i.m120828Ch(i11);
                        if (optJSONObject.has("categoryFilters")) {
                            Object obj3 = C28208v2.this.f131555e;
                            synchronized (obj3) {
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ArrayList arrayList = new ArrayList();
                                    JSONArray optJSONArray = optJSONObject.optJSONArray("categoryFilters");
                                    if (optJSONArray != null) {
                                        int i12 = 0;
                                        loop0: while (i12 < optJSONArray.length()) {
                                            try {
                                                JSONObject jSONObject4 = optJSONArray.getJSONObject(i12);
                                                if (jSONObject4.has("filters")) {
                                                    JSONObject jSONObject5 = jSONObject4.getJSONObject("filters");
                                                    jSONObject4.remove("filters");
                                                    m147151b = C29606b.m147151b(jSONObject4);
                                                    m147151b.m147163n(jSONObject.toString());
                                                    m147151b.m147167r(currentTimeMillis);
                                                    m147151b.m147168s(jSONObject5.optInt("isLoadMore"));
                                                    JSONArray jSONArray2 = jSONObject5.getJSONArray("filtersList");
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i13 = 0;
                                                    while (i13 < jSONArray2.length()) {
                                                        try {
                                                            C29605a m147125b = C29605a.m147125b(jSONArray2.getJSONObject(i13));
                                                            m147125b.m147145v(currentTimeMillis);
                                                            synchronized (C28208v2.this.f131558h) {
                                                                try {
                                                                    jSONObject3 = optJSONObject;
                                                                    obj2 = obj3;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    jSONObject3 = optJSONObject;
                                                                    obj2 = obj3;
                                                                }
                                                                try {
                                                                    jSONArray = optJSONArray;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    jSONArray = optJSONArray;
                                                                    throw th;
                                                                    break loop0;
                                                                }
                                                                try {
                                                                    m147125b.m147146w(((Long) C28208v2.this.f131558h.m149129g(m147125b.m147131h(), 0L)).longValue());
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    throw th;
                                                                    break loop0;
                                                                    break loop0;
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    arrayList2.add(m147125b);
                                                                    m147151b.m147165p(m147125b.m147131h());
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    throw th;
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                try {
                                                                    e.printStackTrace();
                                                                    i13++;
                                                                    optJSONObject = jSONObject3;
                                                                    obj3 = obj2;
                                                                    optJSONArray = jSONArray;
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    e.printStackTrace();
                                                                    i12++;
                                                                    optJSONObject = jSONObject3;
                                                                    obj3 = obj2;
                                                                    optJSONArray = jSONArray;
                                                                }
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            jSONObject3 = optJSONObject;
                                                            obj2 = obj3;
                                                            jSONArray = optJSONArray;
                                                        }
                                                        i13++;
                                                        optJSONObject = jSONObject3;
                                                        obj3 = obj2;
                                                        optJSONArray = jSONArray;
                                                    }
                                                    jSONObject3 = optJSONObject;
                                                    obj2 = obj3;
                                                    jSONArray = optJSONArray;
                                                    C7960e.m41971c6().m42303W7(m147151b);
                                                    C7960e.m41971c6().m42305Wb(m147151b.m147152c());
                                                    C7960e.m41971c6().m42320Y7(m147151b.m147152c(), arrayList2);
                                                    synchronized (C28208v2.this.f131559i) {
                                                        C28208v2.this.f131559i.m149132j(m147151b.m147152c(), new LinkedHashSet(arrayList2));
                                                    }
                                                } else {
                                                    jSONObject3 = optJSONObject;
                                                    obj2 = obj3;
                                                    jSONArray = optJSONArray;
                                                    m147151b = C29606b.m147151b(jSONObject4);
                                                    m147151b.m147163n(jSONObject.toString());
                                                    m147151b.m147167r(currentTimeMillis);
                                                    C7960e.m41971c6().m42303W7(m147151b);
                                                }
                                                m147151b.m147169t(((Long) C28208v2.this.f131557g.m149129g(m147151b.m147152c(), 0L)).longValue());
                                                arrayList.add(m147151b);
                                            } catch (Exception e14) {
                                                e = e14;
                                                jSONObject3 = optJSONObject;
                                                obj2 = obj3;
                                                jSONArray = optJSONArray;
                                            }
                                            i12++;
                                            optJSONObject = jSONObject3;
                                            obj3 = obj2;
                                            optJSONArray = jSONArray;
                                        }
                                    }
                                    jSONObject2 = optJSONObject;
                                    obj2 = obj3;
                                    C7960e.m41971c6().m42296Vb(currentTimeMillis);
                                    C7960e.m41971c6().m42323Yb(currentTimeMillis);
                                    C7960e.m41971c6().m42512qb();
                                    C7960e.m41971c6().m42524rb();
                                    synchronized (C28208v2.this.f131554d) {
                                        C28208v2.this.f131556f = arrayList;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj3;
                                }
                            }
                        } else {
                            jSONObject2 = optJSONObject;
                        }
                        JSONObject jSONObject6 = jSONObject2;
                        if (jSONObject6.has("filterQuickAccess")) {
                            JSONObject jSONObject7 = jSONObject6.getJSONObject("filterQuickAccess");
                            AbstractC23309i.m120879Dv(jSONObject7.optInt("showInMode"));
                            AbstractC23309i.m120916Ev(jSONObject7.optInt("showInSource"));
                            JSONObject jSONObject8 = jSONObject7.getJSONObject("filterInfo");
                            jSONObject7.remove("filterInfo");
                            AbstractC23309i.m120842Cv(jSONObject8.optLong("filterId"));
                            AbstractC23309i.m120805Bv(jSONObject8.optLong("cateId"));
                            Iterator it = C7960e.m41971c6().m42367d5(jSONObject8.optLong("cateId")).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (AbstractC25759a.m132893a((C29605a) it.next())) {
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(C29605a.m147125b(jSONObject8));
                                    C7960e.m41971c6().m42320Y7(jSONObject8.optLong("cateId"), arrayList3);
                                    break;
                                }
                            }
                        }
                        if (jSONObject6.has("categoryPromote")) {
                            AbstractC23309i.m120865Dh(jSONObject6.getJSONObject("categoryPromote").optInt("cateId", -10));
                        } else {
                            AbstractC23309i.m120865Dh(-10);
                        }
                        if (jSONObject6.has("categoryEditor")) {
                            AbstractC23309i.m121163Lj(jSONObject6.getJSONObject("categoryEditor").optLong("cateId", -1L));
                        }
                    }
                    m142133A = C28208v2.this.m142133A();
                    if (m142133A == null) {
                        return;
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                    m142133A = C28208v2.this.m142133A();
                    if (m142133A == null) {
                        return;
                    }
                }
                m142133A.mo39274a(C28208v2.this.m142136D(), false);
            } finally {
                d m142133A3 = C28208v2.this.m142133A();
                if (m142133A3 != null) {
                    m142133A3.mo39274a(C28208v2.this.m142136D(), false);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28208v2 c28208v2 = C28208v2.this;
            c28208v2.f131551a = false;
            if (c28208v2.f131560j != null && C28208v2.this.f131560j.get() != null) {
                ((ZaloCameraView.InterfaceC7537l0) C28208v2.this.f131560j.get()).mo39120a();
            }
            d m142133A = C28208v2.this.m142133A();
            if (m142133A != null) {
                m142133A.mo39274a(C28208v2.this.m142136D(), false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            InterfaceC0806b1 m2225f = AbstractC0837p0.m2225f();
            final JSONObject jSONObject = this.f131566a;
            m2225f.mo2040a(new Runnable() { // from class: vg.w2
                @Override // java.lang.Runnable
                public final void run() {
                    C28208v2.c.this.m142149d(obj, jSONObject);
                }
            });
            AbstractC23309i.m122551wq(System.currentTimeMillis());
            C28208v2 c28208v2 = C28208v2.this;
            c28208v2.f131551a = false;
            if (c28208v2.f131560j != null && C28208v2.this.f131560j.get() != null) {
                ((ZaloCameraView.InterfaceC7537l0) C28208v2.this.f131560j.get()).mo39121b();
            }
        }
    }

    /* renamed from: vg.v2$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo39274a(List list, boolean z11);

        /* renamed from: b */
        void mo39275b(long j11, List list, boolean z11);
    }

    private C28208v2() {
    }

    /* renamed from: t */
    public static synchronized C28208v2 m142128t() {
        C28208v2 c28208v2;
        synchronized (C28208v2.class) {
            try {
                if (f131550l == null) {
                    synchronized (C28208v2.class) {
                        try {
                            if (f131550l == null) {
                                f131550l = new C28208v2();
                            }
                        } finally {
                        }
                    }
                }
                c28208v2 = f131550l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28208v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m142129v(C29606b c29606b, List list) {
        C7960e.m41971c6().m42320Y7(c29606b.m147152c(), list);
        synchronized (this.f131559i) {
            try {
                Set set = (Set) this.f131559i.m149128f(c29606b.m147152c());
                if (set == null) {
                    set = new LinkedHashSet(list);
                } else {
                    set.addAll(list);
                }
                this.f131559i.m149132j(c29606b.m147152c(), set);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m142130w() {
        m142146u(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m142131x() {
        synchronized (this.f131554d) {
            try {
                if (!this.f131552b) {
                    this.f131552b = true;
                    List<C29606b> m42357c5 = C7960e.m41971c6().m42357c5();
                    this.f131556f = m42357c5;
                    for (C29606b c29606b : m42357c5) {
                        this.f131557g.m149132j(c29606b.m147152c(), Long.valueOf(c29606b.m147159j()));
                        m142140n(c29606b.m147152c(), false);
                    }
                    synchronized (this.f131558h) {
                        this.f131558h = C7960e.m41971c6().m42346b5();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d m142133A = m142133A();
        if (m142133A != null) {
            m142133A.mo39274a(m142136D(), true);
        }
        m142137k();
    }

    /* renamed from: y */
    private boolean m142132y(C29606b c29606b) {
        if (c29606b != null && !c29606b.m147160k() && c29606b.m147158i() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    d m142133A() {
        WeakReference weakReference = this.f131553c;
        if (weakReference != null) {
            return (d) weakReference.get();
        }
        return null;
    }

    /* renamed from: B */
    public void m142134B(d dVar) {
        this.f131553c = new WeakReference(dVar);
    }

    /* renamed from: C */
    public void m142135C(long j11, C29605a c29605a) {
        try {
            C7960e.m41971c6().m42586xd(c29605a);
            synchronized (this.f131559i) {
                try {
                    Set<C29605a> set = (Set) this.f131559i.m149128f(j11);
                    if (set != null && set.contains(c29605a)) {
                        for (C29605a c29605a2 : set) {
                            if (c29605a2 != null && c29605a2.equals(c29605a)) {
                                c29605a2.m147146w(c29605a.m147137n());
                                synchronized (this.f131558h) {
                                    this.f131558h.m149132j(c29605a2.m147131h(), Long.valueOf(c29605a2.m147137n()));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public List m142136D() {
        ArrayList arrayList;
        synchronized (this.f131554d) {
            arrayList = new ArrayList(this.f131556f);
        }
        return arrayList;
    }

    /* renamed from: k */
    void m142137k() {
        boolean z11;
        if (this.f131551a) {
            return;
        }
        long m121667Z5 = AbstractC23309i.m121667Z5();
        int m122524w = AbstractC23309i.m122524w();
        long currentTimeMillis = System.currentTimeMillis() - m121667Z5;
        long j11 = m122524w * 1000;
        boolean z12 = false;
        if (currentTimeMillis > j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        synchronized (this.f131554d) {
            if (this.f131556f.size() == 0 || z11) {
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        this.f131561k.post(new Runnable() { // from class: vg.u2
            @Override // java.lang.Runnable
            public final void run() {
                C28208v2.this.m142130w();
            }
        });
    }

    /* renamed from: l */
    public void m142138l() {
        try {
            List list = this.f131556f;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Set<C29605a> set = (Set) this.f131559i.m149128f(((C29606b) list.get(i11)).m147152c());
                if (set != null) {
                    for (C29605a c29605a : set) {
                        if (c29605a != null) {
                            c29605a.m147143t(false);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    void m142139m(Location location) {
        double longitude;
        double d11 = 0.0d;
        if (location == null) {
            longitude = 0.0d;
        } else {
            try {
                longitude = location.getLongitude();
            } catch (Exception e11) {
                WeakReference weakReference = this.f131560j;
                if (weakReference != null && weakReference.get() != null) {
                    ((ZaloCameraView.InterfaceC7537l0) this.f131560j.get()).mo39120a();
                }
                e11.printStackTrace();
                this.f131551a = false;
                return;
            }
        }
        if (location != null) {
            d11 = location.getLatitude();
        }
        double d12 = d11;
        String valueOf = String.valueOf(C28139n5.m141620j().m141637i());
        String valueOf2 = String.valueOf(C28139n5.m141620j().m141646s());
        String valueOf3 = String.valueOf(C28139n5.m141620j().m141647t());
        String valueOf4 = String.valueOf(C28139n5.m141620j().m141639l());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("longitude", longitude);
        jSONObject.put("latitude", d12);
        jSONObject.put("cellId", valueOf);
        jSONObject.put("mcc", valueOf2);
        jSONObject.put("mnc", valueOf3);
        jSONObject.put("lac", valueOf4);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(jSONObject));
        c0766k.mo1690m9(d12, longitude, valueOf, valueOf2, valueOf3, valueOf4);
    }

    /* renamed from: n */
    void m142140n(long j11, boolean z11) {
        try {
            List<C29605a> m42367d5 = C7960e.m41971c6().m42367d5(j11);
            if (m42367d5 == null) {
                m42367d5 = new ArrayList();
            }
            synchronized (this.f131559i) {
                this.f131559i.m149132j(j11, new LinkedHashSet(m42367d5));
            }
            synchronized (this.f131558h) {
                try {
                    for (C29605a c29605a : m42367d5) {
                        this.f131558h.m149132j(c29605a.m147131h(), Long.valueOf(c29605a.m147137n()));
                    }
                } finally {
                }
            }
            d m142133A = m142133A();
            if (m142133A != null && z11) {
                m142133A.mo39275b(j11, new ArrayList(m42367d5), true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    void m142141o(C29606b c29606b, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject(c29606b.m147154e());
            double d11 = jSONObject.getDouble("longitude");
            double d12 = jSONObject.getDouble("latitude");
            String string = jSONObject.getString("cellId");
            String string2 = jSONObject.getString("mcc");
            String string3 = jSONObject.getString("mnc");
            String string4 = jSONObject.getString("lac");
            C0766k c0766k = new C0766k();
            try {
                c0766k.mo1704o8(new a(c29606b, z11));
                c0766k.mo1552Ua((int) c29606b.m147152c(), 0, 50, (int) c29606b.m147155f(), d12, d11, string, string2, string3, string4);
                c29606b.m147164o(true);
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: p */
    public C29605a m142142p(long j11, long j12) {
        synchronized (this.f131559i) {
            try {
                Set<C29605a> set = (Set) this.f131559i.m149128f(j11);
                if (set != null) {
                    for (C29605a c29605a : set) {
                        if (c29605a.m147131h() == j12) {
                            return c29605a;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    C29606b m142143q(long j11) {
        synchronized (this.f131554d) {
            try {
                for (C29606b c29606b : this.f131556f) {
                    if (c29606b.m147152c() == j11) {
                        return c29606b;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public List m142144r(long j11, boolean z11) {
        synchronized (this.f131559i) {
            try {
                Set set = (Set) this.f131559i.m149128f(j11);
                if (set != null) {
                    C29606b m142143q = m142143q(j11);
                    if (m142132y(m142143q)) {
                        m142141o(m142143q, z11);
                    }
                    return new ArrayList(set);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public void m142145s(ZaloCameraView.InterfaceC7537l0 interfaceC7537l0) {
        this.f131560j = new WeakReference(interfaceC7537l0);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.t2
            @Override // java.lang.Runnable
            public final void run() {
                C28208v2.this.m142131x();
            }
        });
    }

    /* renamed from: u */
    void m142146u(AbstractC28248z6.f fVar) {
        if (fVar == null) {
            return;
        }
        C28239y6 c28239y6 = new C28239y6();
        c28239y6.m142229k(true);
        if (!c28239y6.m142225f(MainApplication.getAppContext(), fVar, new SensitiveData("location_camera_filter", "camera_filter"))) {
            fVar.mo40758a(null, 0);
        }
    }

    /* renamed from: z */
    public void m142147z() {
        synchronized (this.f131555e) {
            this.f131552b = false;
            this.f131551a = false;
            this.f131556f.clear();
            this.f131557g.m149126b();
            this.f131558h.m149126b();
            this.f131559i.m149126b();
        }
    }
}
