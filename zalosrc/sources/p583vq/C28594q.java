package p583vq;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import android.util.LruCache;
import bo.C3030r0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import p665y0.C30239a;

/* renamed from: vq.q */
/* loaded from: classes4.dex */
public class C28594q {

    /* renamed from: e */
    private static volatile C28594q f132608e;

    /* renamed from: b */
    private C30239a f132610b = new C30239a();

    /* renamed from: c */
    private final LruCache f132611c = new LruCache(10);

    /* renamed from: d */
    private final C30239a f132612d = new C30239a();

    /* renamed from: a */
    private boolean f132609a = false;

    /* renamed from: vq.q$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C28594q.this.f132610b = C7960e.m41971c6().m42118F6(CoreUtility.f89233i);
            C28594q.m143005j().m143018r();
            C28594q.this.f132609a = true;
        }
    }

    /* renamed from: vq.q$b */
    /* loaded from: classes4.dex */
    class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f132614a;

        b(String str) {
            this.f132614a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C28594q c28594q = C28594q.this;
            String m143004g = c28594q.m143004g(c28594q.m143011k(this.f132614a));
            if (!m143004g.isEmpty()) {
                C7960e.m41971c6().m42153I8(this.f132614a, m143004g);
            } else {
                C7960e.m41971c6().m42597yc(this.f132614a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vq.q$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f132616a;

        c(List list) {
            this.f132616a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42608zc(this.f132616a);
        }
    }

    private C28594q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public String m143004g(List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C3030r0) it.next()).m14585b());
            }
        }
        if (jSONArray.length() == 0) {
            return "";
        }
        return jSONArray.toString();
    }

    /* renamed from: j */
    public static C28594q m143005j() {
        if (f132608e == null) {
            synchronized (C28594q.class) {
                try {
                    if (f132608e == null) {
                        f132608e = new C28594q();
                    }
                } finally {
                }
            }
        }
        return f132608e;
    }

    /* renamed from: d */
    public void m143006d(String str, List list) {
        synchronized (this.f132611c) {
            this.f132611c.put(str, list);
        }
    }

    /* renamed from: e */
    public void m143007e() {
        C30239a c30239a = this.f132610b;
        if (c30239a != null) {
            c30239a.clear();
        }
        LruCache lruCache = this.f132611c;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        C30239a c30239a2 = this.f132612d;
        if (c30239a2 != null) {
            c30239a2.clear();
        }
    }

    /* renamed from: f */
    public void m143008f(String str) {
        synchronized (C28594q.class) {
            try {
                try {
                    C30239a c30239a = this.f132610b;
                    if (c30239a != null) {
                        List list = (List) c30239a.remove(str);
                        if (list != null && !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C3030r0 c3030r0 = (C3030r0) it.next();
                                if (c3030r0 != null && !c3030r0.m14584a()) {
                                    it.remove();
                                }
                            }
                        }
                        if (list != null) {
                            this.f132610b.put(str, list);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public List m143009h(String str) {
        List list;
        synchronized (this.f132611c) {
            list = (List) this.f132611c.get(str);
        }
        return list;
    }

    /* renamed from: i */
    public String m143010i(String str) {
        String str2;
        synchronized (this.f132612d) {
            str2 = (String) this.f132612d.get(str);
        }
        return str2;
    }

    /* renamed from: k */
    public List m143011k(String str) {
        synchronized (C28594q.class) {
            try {
                C30239a c30239a = this.f132610b;
                if (c30239a != null) {
                    return (List) c30239a.get(str);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m143012l() {
        if (!this.f132609a) {
            C0824j.m2153b(new a());
        }
    }

    /* renamed from: m */
    public void m143013m(String str, String str2) {
        synchronized (this.f132611c) {
            try {
                List list = (List) this.f132611c.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C10873l c10873l = (C10873l) it.next();
                        if (c10873l != null && !TextUtils.isEmpty(c10873l.m56493u()) && c10873l.m56493u().equals(str2)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public void m143014n(String str) {
        synchronized (this.f132612d) {
            this.f132612d.remove(str);
        }
    }

    /* renamed from: o */
    public void m143015o(String str, String str2) {
        List list;
        synchronized (C28594q.class) {
            try {
                try {
                    C30239a c30239a = this.f132610b;
                    if (c30239a != null && (list = (List) c30239a.get(str)) != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C3030r0 c3030r0 = (C3030r0) it.next();
                            if (c3030r0 != null && !TextUtils.isEmpty(c3030r0.f12210h) && c3030r0.f12210h.equals(str2)) {
                                it.remove();
                            }
                        }
                        if (list.isEmpty()) {
                            this.f132610b.remove(str);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public void m143016p(String str, String str2) {
        synchronized (this.f132612d) {
            this.f132612d.put(str, str2);
        }
    }

    /* renamed from: q */
    public void m143017q(String str) {
        m143008f(str);
        C0824j.m2153b(new b(str));
    }

    /* renamed from: r */
    public void m143018r() {
        synchronized (C28594q.class) {
            try {
                try {
                    Set<String> keySet = this.f132610b.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (String str : keySet) {
                        m143008f(str);
                        List m143011k = m143011k(str);
                        if (m143011k != null && !m143011k.isEmpty()) {
                        }
                        arrayList.add(str);
                    }
                    C0824j.m2153b(new c(arrayList));
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public void m143019s(String str, List list) {
        List list2;
        synchronized (C28594q.class) {
            try {
                try {
                    C30239a c30239a = this.f132610b;
                    if (c30239a != null && list != null && (list2 = (List) c30239a.get(str)) != null && !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            C3030r0 c3030r0 = (C3030r0) it.next();
                            Iterator it2 = list.iterator();
                            boolean z11 = false;
                            while (it2.hasNext()) {
                                C10873l c10873l = (C10873l) it2.next();
                                if (c10873l != null && TextUtils.equals(c10873l.m56493u(), c3030r0.f12210h)) {
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                it.remove();
                            }
                        }
                        if (list2.isEmpty()) {
                            this.f132610b.remove(str);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
