package i10;

import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h10.AbstractC19711l;
import h10.C19701b;
import h10.C19710k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import p10.EnumC24604h;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: i10.b */
/* loaded from: classes5.dex */
public final class C20186b implements InterfaceC20185a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private ConcurrentLinkedQueue f99720a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private ConcurrentLinkedQueue f99721b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private List f99722c = new ArrayList();

    /* renamed from: d */
    private HashSet f99723d = new HashSet();

    /* renamed from: e */
    private boolean f99724e;

    /* renamed from: i10.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: f */
    private final int m105291f() {
        int size = this.f99720a.size();
        if (10 <= size && size < 26) {
            return 2;
        }
        if (26 <= size && size < 51) {
            return 3;
        }
        if (51 <= size && size < 76) {
            return 4;
        }
        if (size > 75) {
            return 5;
        }
        return 1;
    }

    /* renamed from: g */
    private final int m105292g() {
        return 1;
    }

    /* renamed from: h */
    private final void m105293h() {
        Object m131207g0;
        if (this.f99722c.size() > 200) {
            int size = this.f99722c.size();
            ArrayList arrayList = new ArrayList();
            for (int i11 = size / 2; i11 < size; i11++) {
                m131207g0 = AbstractC25332a0.m131207g0(this.f99722c, i11);
                Long l11 = (Long) m131207g0;
                if (l11 != null) {
                    arrayList.add(Long.valueOf(l11.longValue()));
                }
            }
            this.f99722c = arrayList;
        }
    }

    /* renamed from: i */
    private final List m105294i(int i11) {
        ArrayList arrayList = new ArrayList();
        int size = this.f99720a.size() - 1080;
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                this.f99720a.poll();
            }
        }
        for (int i13 = 0; i13 < i11; i13++) {
            AbstractC19711l abstractC19711l = (AbstractC19711l) this.f99720a.poll();
            if (abstractC19711l != null) {
                arrayList.add(abstractC19711l);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: j */
    private final List m105295j() {
        List m105294i = m105294i(m105291f());
        if (m105294i == null) {
            return m105296k(m105292g());
        }
        return m105294i;
    }

    /* renamed from: k */
    private final List m105296k(int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC19711l abstractC19711l = (AbstractC19711l) this.f99721b.poll();
            if (abstractC19711l != null) {
                arrayList.add(abstractC19711l);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: l */
    private final List m105297l() {
        List m105296k = m105296k(m105292g());
        if (m105296k == null) {
            return m105294i(m105291f());
        }
        return m105296k;
    }

    @Override // i10.InterfaceC20185a
    /* renamed from: a */
    public void mo105286a(List list) {
        int m131511r;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            List list3 = list;
            m131511r = AbstractC25370t.m131511r(list3, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                mo105289d((AbstractC19711l) it.next());
                arrayList.add(C24848g0.f119245a);
            }
        }
    }

    @Override // i10.InterfaceC20185a
    /* renamed from: b */
    public boolean mo105287b() {
        return !this.f99723d.isEmpty();
    }

    @Override // i10.InterfaceC20185a
    /* renamed from: c */
    public void mo105288c(AbstractC19711l abstractC19711l) {
        if (abstractC19711l != null && (abstractC19711l instanceof C19701b)) {
            C19701b c19701b = (C19701b) abstractC19711l;
            if (c19701b.m103381d().m51643a() != null) {
                this.f99722c.add(c19701b.m103381d().m51643a());
            }
        }
    }

    @Override // i10.InterfaceC20185a
    public void clear() {
        this.f99720a = new ConcurrentLinkedQueue();
        this.f99722c = new ArrayList();
        this.f99723d = new HashSet();
    }

    @Override // i10.InterfaceC20185a
    /* renamed from: d */
    public void mo105289d(AbstractC19711l abstractC19711l) {
        long j11;
        Long m51669c;
        AbstractC19074t.m100208f(abstractC19711l, "event");
        if (abstractC19711l instanceof C19701b) {
            Long m51643a = ((C19701b) abstractC19711l).m103381d().m51643a();
            if (m51643a != null) {
                long longValue = m51643a.longValue();
                if (!this.f99722c.contains(Long.valueOf(longValue))) {
                    this.f99722c.add(Long.valueOf(longValue));
                    this.f99720a.offer(abstractC19711l);
                    m105293h();
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC19711l instanceof C19710k) {
            if (abstractC19711l.mo103449c() == EnumC24604h.f118390u) {
                InteractEventResponse.InteractItem m103450d = ((C19710k) abstractC19711l).m103450d();
                if (m103450d != null && (m51669c = m103450d.m51669c()) != null) {
                    j11 = m51669c.longValue();
                } else {
                    j11 = -1;
                }
                if (j11 >= 0 && !this.f99723d.contains(Long.valueOf(j11))) {
                    this.f99723d.add(Long.valueOf(j11));
                    this.f99721b.offer(abstractC19711l);
                    return;
                }
                return;
            }
            this.f99721b.offer(abstractC19711l);
        }
    }

    @Override // i10.InterfaceC20185a
    /* renamed from: e */
    public void mo105290e(List list) {
        Long l11;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC19711l abstractC19711l = (AbstractC19711l) it.next();
                if (abstractC19711l instanceof C19701b) {
                    l11 = ((C19701b) abstractC19711l).m103381d().m51643a();
                } else {
                    l11 = null;
                }
                if (l11 != null) {
                    arrayList.add(l11);
                }
            }
            this.f99722c.addAll(arrayList);
        }
    }

    @Override // i10.InterfaceC20185a
    public List take() {
        if (this.f99724e) {
            this.f99724e = false;
            return m105297l();
        }
        this.f99724e = true;
        return m105295j();
    }
}
