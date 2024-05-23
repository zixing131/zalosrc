package p690yq;

import bo.C3000l0;
import bo.C3020p0;
import bo.C3051w0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p455qo.C25414i0;
import p455qo.C25422m0;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p618wq.C29190a;
import p618wq.C29191b;
import p654xq.C30196f;
import p654xq.InterfaceC30193c;
import p725zq.C32543a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: yq.a */
/* loaded from: classes4.dex */
public final class C31049a extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC30193c f143156a;

    /* renamed from: b */
    private final InterfaceC26357f f143157b;

    /* renamed from: yq.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f143158a;

        /* renamed from: b */
        private final List f143159b;

        /* renamed from: c */
        private final int f143160c;

        public a(List list, List list2, int i11) {
            AbstractC19074t.m100208f(list, "listFeedsOnScreen");
            AbstractC19074t.m100208f(list2, "listTotalFeeds");
            this.f143158a = list;
            this.f143159b = list2;
            this.f143160c = i11;
        }

        /* renamed from: a */
        public final List m150873a() {
            return this.f143158a;
        }

        /* renamed from: b */
        public final List m150874b() {
            return this.f143159b;
        }

        /* renamed from: c */
        public final int m150875c() {
            return this.f143160c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f143158a, aVar.f143158a) && AbstractC19074t.m100204b(this.f143159b, aVar.f143159b) && this.f143160c == aVar.f143160c;
        }

        public int hashCode() {
            return (((this.f143158a.hashCode() * 31) + this.f143159b.hashCode()) * 31) + this.f143160c;
        }

        public String toString() {
            return "Params(listFeedsOnScreen=" + this.f143158a + ", listTotalFeeds=" + this.f143159b + ", scrollOffsetY=" + this.f143160c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yq.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f143161q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(0);
            this.f143161q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f143161q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3020p0) it.next()).f12057p);
            }
            return "feedOnScreen: " + arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yq.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f143162t;

        /* renamed from: u */
        private /* synthetic */ Object f143163u;

        /* renamed from: w */
        final /* synthetic */ a f143165w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: yq.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ a f143166q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar) {
                super(0);
                this.f143166q = aVar;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                int m131511r;
                int m131511r2;
                List m150874b = this.f143166q.m150874b();
                m131511r = AbstractC25370t.m131511r(m150874b, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m150874b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3000l0) it.next()).f11895q);
                }
                List m150873a = this.f143166q.m150873a();
                m131511r2 = AbstractC25370t.m131511r(m150873a, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = m150873a.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C3000l0) it2.next()).f11895q);
                }
                return "[Start execute use case] - Total feeds: " + arrayList + " - Feed on screens: " + arrayList2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: yq.a$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ a f143167q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar) {
                super(0);
                this.f143167q = aVar;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                int m131511r;
                List m150873a = this.f143167q.m150873a();
                m131511r = AbstractC25370t.m131511r(m150873a, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m150873a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3000l0) it.next()).f11895q);
                }
                return "[Start execute use case] - Feed on screens: " + arrayList + " - dy: " + this.f143167q.m150875c();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: yq.a$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33055c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ List f143168q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33055c(List list) {
                super(0);
                this.f143168q = list;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                int m131511r;
                List list = this.f143168q;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C29190a) it.next()).m145737a());
                }
                return "Executed success. Emitting result: " + arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: yq.a$c$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Exception f143169q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Exception exc) {
                super(0);
                this.f143169q = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Executed fail. Emitting error: " + this.f143169q;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f143165w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f143165w, continuation);
            cVar.f143163u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f143162t;
            try {
            } catch (Exception e11) {
                C31049a.this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new d(e11));
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f143163u = null;
                this.f143162t = 4;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f143163u;
                    AbstractC24862s.m129228b(obj);
                    List list = (List) obj;
                    C31049a.this.m150871i(list);
                    C31049a.this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new C33055c(list));
                    cVar = new AbstractC25468a.c(list);
                    this.f143163u = flowCollector;
                    this.f143162t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f143163u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f143163u;
                C31049a.this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new a(this.f143165w));
                C31049a.this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new b(this.f143165w));
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f143163u = flowCollector2;
                this.f143162t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C31049a c31049a = C31049a.this;
            List m150873a = this.f143165w.m150873a();
            List m150874b = this.f143165w.m150874b();
            int m150875c = this.f143165w.m150875c();
            this.f143163u = flowCollector;
            this.f143162t = 2;
            obj = c31049a.m150870g(m150873a, m150874b, m150875c, this);
            if (obj == m142578e) {
                return m142578e;
            }
            List list2 = (List) obj;
            C31049a.this.m150871i(list2);
            C31049a.this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new C33055c(list2));
            cVar = new AbstractC25468a.c(list2);
            this.f143163u = flowCollector;
            this.f143162t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yq.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f143170q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list) {
            super(0);
            this.f143170q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f143170q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29190a) it.next()).m145737a());
            }
            return "Start sync local: " + arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yq.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f143171q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list) {
            super(0);
            this.f143171q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f143171q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29190a) it.next()).m145737a());
            }
            return "Sync local completed: " + arrayList;
        }
    }

    public /* synthetic */ C31049a(InterfaceC30193c interfaceC30193c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C30196f.a.m148915c(C30196f.Companion, null, null, null, null, null, 31, null) : interfaceC30193c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    /* renamed from: f */
    private final boolean m150869f(C3000l0 c3000l0) {
        if (c3000l0.f11899s.size() == 1 && !c3000l0.m14285C0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final Object m150870g(List list, List list2, int i11, Continuation continuation) {
        List m131502j;
        int m131511r;
        int m131511r2;
        List m131502j2;
        int m131511r3;
        int m131511r4;
        int m131511r5;
        Object m131216p0;
        int m131504l;
        int m131504l2;
        int m131511r6;
        int i12;
        if (i11 <= 0 || list.isEmpty() || list2.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m150869f((C3000l0) obj)) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList<C3020p0> arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3000l0) it.next()).m14322a0());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (m150869f((C3000l0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        m131511r2 = AbstractC25370t.m131511r(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(m131511r2);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C3000l0) it2.next()).m14322a0());
        }
        if (arrayList2.isEmpty() || arrayList4.isEmpty()) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_GET_REAL_TIME_LIKE_COMMENT_INFO", new b(arrayList2));
        ArrayList arrayList5 = new ArrayList();
        m131511r3 = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList6 = new ArrayList(m131511r3);
        for (C3020p0 c3020p0 : arrayList2) {
            String str = c3020p0.f12057p;
            AbstractC19074t.m100207e(str, "fid");
            String m14465A = c3020p0.m14465A();
            AbstractC19074t.m100207e(m14465A, "getOwnerId(...)");
            arrayList6.add(new C29191b(str, m14465A, true, c3020p0.f12058q, c3020p0.f12062u));
        }
        arrayList5.addAll(arrayList6);
        ArrayList<C3020p0> arrayList7 = new ArrayList();
        m131511r4 = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList8 = new ArrayList(m131511r4);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList8.add(((C3020p0) it3.next()).f12057p);
        }
        m131511r5 = AbstractC25370t.m131511r(arrayList4, 10);
        ArrayList arrayList9 = new ArrayList(m131511r5);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList9.add(((C3020p0) it4.next()).f12057p);
        }
        m131216p0 = AbstractC25332a0.m131216p0(arrayList8);
        int indexOf = arrayList9.indexOf(m131216p0);
        int m157593e = C32543a.f150389a.m157593e() + indexOf;
        m131504l = AbstractC25368s.m131504l(arrayList9);
        if (m157593e > m131504l) {
            m157593e = AbstractC25368s.m131504l(arrayList9);
        }
        m131504l2 = AbstractC25368s.m131504l(arrayList9);
        if (indexOf < m131504l2 && (i12 = indexOf + 1) <= m157593e) {
            while (true) {
                Object obj3 = arrayList4.get(i12);
                AbstractC19074t.m100207e(obj3, "get(...)");
                arrayList7.add(obj3);
                if (i12 == m157593e) {
                    break;
                }
                i12++;
            }
        }
        m131511r6 = AbstractC25370t.m131511r(arrayList7, 10);
        ArrayList arrayList10 = new ArrayList(m131511r6);
        for (C3020p0 c3020p02 : arrayList7) {
            String str2 = c3020p02.f12057p;
            AbstractC19074t.m100207e(str2, "fid");
            String m14465A2 = c3020p02.m14465A();
            AbstractC19074t.m100207e(m14465A2, "getOwnerId(...)");
            arrayList10.add(new C29191b(str2, m14465A2, false, c3020p02.f12058q, c3020p02.f12062u));
        }
        arrayList5.addAll(arrayList10);
        return this.f143156a.mo148867b(arrayList5, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m150871i(List list) {
        this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_SYNC_LOCAL_FEED_CONTENT_LIKE_COMMENT_INFO", new d(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29190a c29190a = (C29190a) it.next();
            new C25422m0(null, null, 3, null).m101508a(new C25422m0.a(c29190a.m145737a(), c29190a.m145738b().m145756c(), c29190a.m145738b().m145757d(), new C3051w0(c29190a.m145738b().m145755b()), c29190a.m145738b().m145754a(), true, false));
            new C25414i0(null, 1, null).m101508a(new C25414i0.a(c29190a.m145737a(), c29190a.m145741e(), true));
        }
        this.f143157b.mo135685a("REAL_TIME_LIKE_COMMENT", "LOCAL_SOURCE_SYNC_LOCAL_FEED_CONTENT_LIKE_COMMENT_INFO", new e(list));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C31049a(InterfaceC30193c interfaceC30193c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(interfaceC30193c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f143156a = interfaceC30193c;
        this.f143157b = interfaceC26357f;
    }
}
