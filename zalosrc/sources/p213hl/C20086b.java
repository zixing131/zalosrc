package p213hl;

import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import me0.AbstractC23041d2;
import mx.AbstractC23466c;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25376w;

/* renamed from: hl.b */
/* loaded from: classes3.dex */
public final class C20086b {

    /* renamed from: a */
    private long f98808a;

    /* renamed from: b */
    private long f98809b;

    /* renamed from: c */
    private final AtomicLong f98810c = new AtomicLong(0);

    /* renamed from: d */
    private final AtomicInteger f98811d = new AtomicInteger(0);

    /* renamed from: e */
    private final AtomicInteger f98812e = new AtomicInteger(0);

    /* renamed from: f */
    private final AtomicBoolean f98813f = new AtomicBoolean(false);

    /* renamed from: g */
    private List f98814g = new ArrayList();

    /* renamed from: h */
    private final List f98815h = Collections.synchronizedList(new ArrayList());

    /* renamed from: hl.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f98816q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(ThreadStorageInfo threadStorageInfo, ThreadStorageInfo threadStorageInfo2) {
            AbstractC19074t.m100208f(threadStorageInfo, "o1");
            AbstractC19074t.m100208f(threadStorageInfo2, "o2");
            return Integer.valueOf(AbstractC19074t.m100210h(threadStorageInfo2.m74777O(), threadStorageInfo.m74777O()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final int m104430v(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: b */
    public final List m104431b() {
        ArrayList arrayList = new ArrayList(this.f98815h.size());
        List list = this.f98815h;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                for (ThreadStorageInfo threadStorageInfo : this.f98815h) {
                    threadStorageInfo.m74788a0(new ArrayList());
                    AbstractC19074t.m100205c(threadStorageInfo);
                    arrayList.add(threadStorageInfo);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m104432c() {
        ArrayList arrayList;
        List list = this.f98815h;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            arrayList = new ArrayList(this.f98815h);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List m104433d() {
        ArrayList arrayList = new ArrayList();
        File m118218q = AbstractC23041d2.m118218q(AbstractC20130d.m104819A(false));
        File m118218q2 = AbstractC23041d2.m118218q(AbstractC20130d.m104849P());
        File m118218q3 = AbstractC23041d2.m118218q(AbstractC20130d.m104829F());
        File m118218q4 = AbstractC23041d2.m118218q(AbstractC20130d.m104895t());
        File m118218q5 = AbstractC23041d2.m118218q(AbstractC20130d.m104906y0());
        C20131e c20131e = C20131e.f99303a;
        File m118218q6 = AbstractC23041d2.m118218q(c20131e.m104942a0());
        File m123214q = AbstractC23466c.m123214q();
        AbstractC19074t.m100207e(m123214q, "getZamFolder(...)");
        File m118218q7 = AbstractC23041d2.m118218q(AbstractC20130d.m104841L());
        File m118218q8 = AbstractC23041d2.m118218q(AbstractC20130d.m104848O0());
        File m118218q9 = AbstractC23041d2.m118218q(AbstractC20130d.m104847O(false));
        File m118218q10 = AbstractC23041d2.m118218q(AbstractC20130d.m104865Z());
        File m118218q11 = AbstractC23041d2.m118218q(AbstractC20130d.m104831G());
        File m118218q12 = AbstractC23041d2.m118218q(c20131e.m104946c0());
        File m118218q13 = AbstractC23041d2.m118218q(AbstractC20130d.m104866a0());
        File m118218q14 = AbstractC23041d2.m118218q(c20131e.m104937S());
        File m118218q15 = AbstractC23041d2.m118218q(c20131e.m104931M());
        if (m118218q != null) {
            arrayList.add(m118218q);
        }
        if (m118218q2 != null) {
            arrayList.add(m118218q2);
        }
        if (m118218q3 != null) {
            arrayList.add(m118218q3);
        }
        if (m118218q4 != null) {
            arrayList.add(m118218q4);
        }
        if (m118218q5 != null) {
            arrayList.add(m118218q5);
        }
        if (m118218q6 != null) {
            arrayList.add(m118218q6);
        }
        arrayList.add(m123214q);
        if (m118218q7 != null) {
            arrayList.add(m118218q7);
        }
        if (m118218q8 != null) {
            arrayList.add(m118218q8);
        }
        if (m118218q9 != null) {
            arrayList.add(m118218q9);
        }
        if (m118218q10 != null) {
            arrayList.add(m118218q10);
        }
        if (m118218q11 != null) {
            arrayList.add(m118218q11);
        }
        if (m118218q12 != null) {
            arrayList.add(m118218q12);
        }
        if (m118218q13 != null) {
            arrayList.add(m118218q13);
        }
        if (m118218q14 != null) {
            arrayList.add(m118218q14);
        }
        if (m118218q15 != null) {
            arrayList.add(m118218q15);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List m104434e() {
        return this.f98814g;
    }

    /* renamed from: f */
    public final List m104435f() {
        List list = this.f98815h;
        AbstractC19074t.m100207e(list, "listConversations");
        return list;
    }

    /* renamed from: g */
    public final int m104436g() {
        return this.f98811d.get();
    }

    /* renamed from: h */
    public final long m104437h() {
        return this.f98808a;
    }

    /* renamed from: i */
    public final long m104438i() {
        return this.f98809b;
    }

    /* renamed from: j */
    public final long m104439j() {
        return this.f98810c.get();
    }

    /* renamed from: k */
    public final int m104440k() {
        return this.f98812e.get();
    }

    /* renamed from: l */
    public final synchronized void m104441l() {
        if (this.f98811d.incrementAndGet() == this.f98812e.get()) {
            this.f98812e.set(0);
            this.f98811d.set(0);
        }
    }

    /* renamed from: m */
    public final synchronized void m104442m(int i11) {
        if (i11 <= 0) {
            return;
        }
        AtomicInteger atomicInteger = this.f98812e;
        atomicInteger.set(atomicInteger.get() + i11);
    }

    /* renamed from: n */
    public final void m104443n(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        List list = this.f98815h;
        AbstractC19074t.m100207e(list, "listConversations");
        synchronized (list) {
            try {
                Iterator it = this.f98815h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AbstractC19074t.m100204b(((ThreadStorageInfo) it.next()).m74822z(), str)) {
                        it.remove();
                        break;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final synchronized void m104444o(long j11) {
        try {
            if (j11 >= 0) {
                AtomicLong atomicLong = this.f98810c;
                atomicLong.set(atomicLong.get() + j11);
            } else {
                this.f98810c.set(0L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: p */
    public final void m104445p(List list) {
        List m131187O0;
        AbstractC19074t.m100208f(list, "allCacheDirs");
        m131187O0 = AbstractC25332a0.m131187O0(list);
        this.f98814g = m131187O0;
    }

    /* renamed from: q */
    public final void m104446q(List list) {
        AbstractC19074t.m100208f(list, "loadedConversations");
        List list2 = this.f98815h;
        AbstractC19074t.m100207e(list2, "listConversations");
        synchronized (list2) {
            this.f98815h.clear();
            this.f98815h.addAll(list);
        }
    }

    /* renamed from: r */
    public final void m104447r(long j11) {
        this.f98808a = j11;
    }

    /* renamed from: s */
    public final void m104448s(long j11) {
        this.f98809b = j11;
    }

    /* renamed from: t */
    public final void m104449t(boolean z11) {
        this.f98813f.set(z11);
    }

    /* renamed from: u */
    public final void m104450u() {
        List m104432c = m104432c();
        final a aVar = a.f98816q;
        AbstractC25376w.m131534w(m104432c, new Comparator() { // from class: hl.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m104430v;
                m104430v = C20086b.m104430v(InterfaceC18509p.this, obj, obj2);
                return m104430v;
            }
        });
        m104446q(m104432c);
    }
}
