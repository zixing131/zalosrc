package ss;

import ae.C0766k;
import ag0.AbstractC0837p0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p363nh.C23744a;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: ss.q */
/* loaded from: classes4.dex */
public final class C26385q {

    /* renamed from: a */
    private long f125363a;

    /* renamed from: c */
    private boolean f125365c;

    /* renamed from: b */
    private final a f125364b = new a();

    /* renamed from: d */
    private final C1761c0 f125366d = new C1761c0(Boolean.FALSE);

    /* renamed from: e */
    private final ArrayList f125367e = new ArrayList();

    /* renamed from: f */
    private final C1761c0 f125368f = new C1761c0();

    /* renamed from: ss.q$a */
    /* loaded from: classes4.dex */
    public static final class a {
        a() {
        }
    }

    /* renamed from: ss.q$b */
    /* loaded from: classes4.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C26376h) obj2).m135880g()), Long.valueOf(((C26376h) obj).m135880g()));
            return m135478b;
        }
    }

    /* renamed from: ss.q$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f125370b;

        c(boolean z11) {
            this.f125370b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                AbstractC20110a.f98889a.mo104551d(m104492d, new Object[0]);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("version");
                    a aVar = C26385q.this.f125364b;
                    boolean z11 = this.f125370b;
                    C26385q c26385q = C26385q.this;
                    synchronized (aVar) {
                        if (!z11) {
                            try {
                                if (optLong > c26385q.f125363a) {
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray = optJSONObject.getJSONArray("item");
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            arrayList.add(new C26376h((JSONObject) obj2));
                        }
                        c26385q.m135963x(optLong, arrayList);
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public C26385q(long j11, boolean z11) {
        this.f125363a = j11;
        if (z11) {
            m135952t();
        }
    }

    /* renamed from: A */
    public static final void m135939A(C26385q c26385q, C26376h c26376h) {
        List m131506n;
        AbstractC19074t.m100208f(c26385q, "this$0");
        AbstractC19074t.m100208f(c26376h, "$item");
        C7960e m41971c6 = C7960e.m41971c6();
        long j11 = c26385q.f125363a;
        m131506n = AbstractC25368s.m131506n(c26376h);
        AbstractC19074t.m100206d(m131506n, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.group.autoreply.AutoReplyItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.group.autoreply.AutoReplyItem> }");
        m41971c6.m42498p8(j11, (ArrayList) m131506n, false);
    }

    /* renamed from: h */
    private final boolean m135947h(long j11, long j12) {
        long j13 = this.f125363a;
        if (j13 == j11) {
            return true;
        }
        if (j13 < j12) {
            m135964y(true);
        }
        return false;
    }

    /* renamed from: j */
    public static final void m135948j(C26385q c26385q, long j11) {
        AbstractC19074t.m100208f(c26385q, "this$0");
        C7960e.m41971c6().m42079C3(c26385q.f125363a, j11);
    }

    /* renamed from: k */
    private final int m135949k() {
        int i11;
        synchronized (this.f125364b) {
            try {
                Iterator it = this.f125367e.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((C26376h) it.next()).m135878e()) {
                        i11++;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: p */
    public static final void m135950p(C26385q c26385q, C26376h c26376h) {
        List m131506n;
        AbstractC19074t.m100208f(c26385q, "this$0");
        AbstractC19074t.m100208f(c26376h, "$item");
        C7960e m41971c6 = C7960e.m41971c6();
        long j11 = c26385q.f125363a;
        m131506n = AbstractC25368s.m131506n(c26376h);
        AbstractC19074t.m100206d(m131506n, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.group.autoreply.AutoReplyItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.group.autoreply.AutoReplyItem> }");
        m41971c6.m42498p8(j11, (ArrayList) m131506n, false);
    }

    /* renamed from: s */
    private final void m135951s() {
        synchronized (this.f125364b) {
            try {
                ArrayList arrayList = this.f125367e;
                if (arrayList.size() > 1) {
                    AbstractC25376w.m131534w(arrayList, new b());
                }
                this.f125368f.mo9221n(this.f125367e);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    private final void m135952t() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ss.l
            public /* synthetic */ RunnableC26380l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26385q.m135953u(C26385q.this);
            }
        });
    }

    /* renamed from: u */
    public static final void m135953u(C26385q c26385q) {
        AbstractC19074t.m100208f(c26385q, "this$0");
        synchronized (c26385q.f125364b) {
            c26385q.f125367e.clear();
            c26385q.f125367e.addAll(C7960e.m41971c6().m42399g6());
            c26385q.f125365c = true;
            c26385q.f125366d.mo9221n(true);
            c26385q.m135951s();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: v */
    private final void m135954v() {
        synchronized (this.f125364b) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ss.m

                /* renamed from: q */
                public final /* synthetic */ ArrayList f125356q;

                public /* synthetic */ RunnableC26381m(ArrayList arrayList) {
                    r2 = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26385q.m135955w(C26385q.this, r2);
                }
            });
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: w */
    public static final void m135955w(C26385q c26385q, ArrayList arrayList) {
        AbstractC19074t.m100208f(c26385q, "this$0");
        AbstractC19074t.m100208f(arrayList, "$arrCopyToSave");
        C7960e.m41971c6().m42498p8(c26385q.f125363a, arrayList, true);
    }

    /* renamed from: i */
    public final void m135956i(long j11, long j12, long j13) {
        synchronized (this.f125364b) {
            try {
                if (m135947h(j12, j13)) {
                    this.f125363a = j13;
                    Iterator it = this.f125367e.iterator();
                    AbstractC19074t.m100207e(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C26376h c26376h = (C26376h) next;
                        if (c26376h.m135880g() == j11) {
                            it.remove();
                            C23744a.Companion.m124119a().m124116d(166, Long.valueOf(c26376h.m135880g()));
                        }
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ss.p

                        /* renamed from: q */
                        public final /* synthetic */ long f125362q;

                        public /* synthetic */ RunnableC26384p(long j112) {
                            r2 = j112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26385q.m135948j(C26385q.this, r2);
                        }
                    });
                    m135951s();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final int m135957l() {
        return C7960e.m41971c6().m42216O0();
    }

    /* renamed from: m */
    public final C26376h m135958m(long j11) {
        synchronized (this.f125364b) {
            Iterator it = this.f125367e.iterator();
            AbstractC19074t.m100207e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                C26376h c26376h = (C26376h) next;
                if (c26376h.m135880g() == j11) {
                    return c26376h;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return null;
        }
    }

    /* renamed from: n */
    public final LiveData m135959n() {
        return this.f125368f;
    }

    /* renamed from: o */
    public final void m135960o(JSONObject jSONObject, long j11, long j12) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        synchronized (this.f125364b) {
            try {
                if (m135947h(j11, j12)) {
                    C26376h c26376h = new C26376h(jSONObject);
                    this.f125363a = j12;
                    this.f125367e.add(c26376h);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ss.o

                        /* renamed from: q */
                        public final /* synthetic */ C26376h f125360q;

                        public /* synthetic */ RunnableC26383o(C26376h c26376h2) {
                            r2 = c26376h2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26385q.m135950p(C26385q.this, r2);
                        }
                    });
                    C23744a.Companion.m124119a().m124116d(164, new Object[0]);
                    m135951s();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public final boolean m135961q() {
        if (m135949k() >= C26373e.f125282a.m135792a()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m135962r() {
        if (this.f125367e.size() >= C26373e.f125282a.m135793b()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m135963x(long j11, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listData");
        synchronized (this.f125364b) {
            this.f125363a = j11;
            this.f125367e.clear();
            this.f125367e.addAll(arrayList);
            m135954v();
            m135951s();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: y */
    public final void m135964y(boolean z11) {
        long j11;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(z11));
        if (z11) {
            j11 = 0;
        } else {
            j11 = this.f125363a;
        }
        c0766k.mo1669j9(j11);
    }

    /* renamed from: z */
    public final void m135965z(long j11, JSONObject jSONObject, long j12, long j13) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        synchronized (this.f125364b) {
            try {
                if (m135947h(j12, j13)) {
                    C26376h c26376h = new C26376h(jSONObject);
                    this.f125363a = j13;
                    Iterator it = this.f125367e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C26376h c26376h2 = (C26376h) it.next();
                        if (c26376h2.m135880g() == j11) {
                            c26376h2.m135875b(c26376h);
                            break;
                        }
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ss.n

                        /* renamed from: q */
                        public final /* synthetic */ C26376h f125358q;

                        public /* synthetic */ RunnableC26382n(C26376h c26376h3) {
                            r2 = c26376h3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26385q.m135939A(C26385q.this, r2);
                        }
                    });
                    C23744a.Companion.m124119a().m124116d(165, Long.valueOf(j11));
                    m135951s();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
