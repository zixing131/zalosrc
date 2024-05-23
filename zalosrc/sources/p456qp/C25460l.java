package p456qp;

import androidx.work.AbstractC2144f;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p399op.C24405q;
import p426pp.AbstractC24900c;
import p426pp.C24899b;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.l */
/* loaded from: classes4.dex */
public final class C25460l extends AbstractC19377a {
    public static final a Companion = new a(null);

    /* renamed from: qp.l$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: qp.l$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f122018a;

        /* renamed from: b */
        private final boolean f122019b;

        public b(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "keyword");
            this.f122018a = str;
            this.f122019b = z11;
        }

        /* renamed from: a */
        public final String m131909a() {
            return this.f122018a;
        }

        /* renamed from: b */
        public final boolean m131910b() {
            return this.f122019b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f122018a, bVar.f122018a) && this.f122019b == bVar.f122019b;
        }

        public int hashCode() {
            return (this.f122018a.hashCode() * 31) + AbstractC2144f.m11520a(this.f122019b);
        }

        public String toString() {
            return "Param(keyword=" + this.f122018a + ", needRefresh=" + this.f122019b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ b f122020q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f122020q = bVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "params " + this.f122020q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.l$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f122021t;

        /* renamed from: u */
        int f122022u;

        /* renamed from: v */
        private /* synthetic */ Object f122023v;

        /* renamed from: w */
        final /* synthetic */ b f122024w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.l$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ b f122025q;

            /* renamed from: r */
            final /* synthetic */ C24899b f122026r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, C24899b c24899b) {
                super(0);
                this.f122025q = bVar;
                this.f122026r = c24899b;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "keyword " + this.f122025q.m131909a() + " success " + this.f122026r;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.l$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ b f122027q;

            /* renamed from: r */
            final /* synthetic */ Exception f122028r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b bVar, Exception exc) {
                super(0);
                this.f122027q = bVar;
                this.f122028r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "keyword " + this.f122027q.m131909a() + " exception " + this.f122028r;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f122024w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f122024w, continuation);
            dVar.f122023v = obj;
            return dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            AbstractC24900c.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f122022u;
            try {
            } catch (Exception e11) {
                e = e11;
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
                    flowCollector = (FlowCollector) this.f122021t;
                    flowCollector2 = (FlowCollector) this.f122023v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_SEARCH_MUSIC", new a(this.f122024w, (C24899b) obj));
                        cVar = new AbstractC24900c.c(obj);
                        this.f122023v = flowCollector2;
                        this.f122021t = null;
                        this.f122022u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_SEARCH_MUSIC", new b(this.f122024w, e));
                        AbstractC24900c.a aVar = new AbstractC24900c.a(e);
                        this.f122023v = null;
                        this.f122021t = null;
                        this.f122022u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f122023v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f122023v;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f122023v = flowCollector3;
                this.f122022u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            C24405q m127651a = C24405q.Companion.m127651a();
            String m131909a = this.f122024w.m131909a();
            boolean m131910b = this.f122024w.m131910b();
            this.f122023v = flowCollector;
            this.f122021t = flowCollector;
            this.f122022u = 2;
            obj = m127651a.m127650z(m131909a, 200, m131910b, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_SEARCH_MUSIC", new a(this.f122024w, (C24899b) obj));
            cVar = new AbstractC24900c.c(obj);
            this.f122023v = flowCollector2;
            this.f122021t = null;
            this.f122022u = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((d) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(b bVar, Continuation continuation) {
        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_SEARCH_MUSIC", new c(bVar));
        return FlowKt.m113265A(new d(bVar, null));
    }
}
