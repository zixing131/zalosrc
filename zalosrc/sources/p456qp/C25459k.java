package p456qp;

import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mm0.AbstractC23350e;
import p185gc.AbstractC19377a;
import p399op.C24405q;
import p426pp.AbstractC24900c;
import p426pp.C24902e;
import p426pp.C24903f;
import p458qr.C25478k;
import p458qr.InterfaceC25469b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.k */
/* loaded from: classes4.dex */
public final class C25459k extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC25469b f122011a;

    /* renamed from: qp.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f122012a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "id");
            this.f122012a = str;
        }

        /* renamed from: a */
        public final String m131905a() {
            return this.f122012a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f122012a, ((a) obj).f122012a);
        }

        public int hashCode() {
            return this.f122012a.hashCode();
        }

        public String toString() {
            return "Param(id=" + this.f122012a + ")";
        }
    }

    /* renamed from: qp.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C7853b.f f122013a;

        public b(C7853b.f fVar) {
            AbstractC19074t.m100208f(fVar, "resumeResult");
            this.f122013a = fVar;
        }

        /* renamed from: a */
        public final C7853b.f m131906a() {
            return this.f122013a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f122013a, ((b) obj).f122013a);
        }

        public int hashCode() {
            return this.f122013a.hashCode();
        }

        public String toString() {
            return "Result(resumeResult=" + this.f122013a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.k$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122014t;

        /* renamed from: u */
        private /* synthetic */ Object f122015u;

        /* renamed from: w */
        final /* synthetic */ a f122017w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f122017w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f122017w, continuation);
            cVar.f122015u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC24900c.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f122014t;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                AbstractC24900c.a aVar = new AbstractC24900c.a(e11);
                this.f122015u = null;
                this.f122014t = 5;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 != 4) {
                                if (r12 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC24862s.m129228b(obj);
                            }
                            return C24848g0.f119245a;
                        }
                        flowCollector = (FlowCollector) this.f122015u;
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC24900c.c(new b(C25451c.f121865a.m131825o(((C24903f) obj).m129503f())));
                        this.f122015u = flowCollector;
                        this.f122014t = 4;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f122015u;
                    AbstractC24862s.m129228b(obj);
                    C24902e c24902e = (C24902e) obj;
                    C24405q m127651a = C24405q.Companion.m127651a();
                    String m129490f = c24902e.m129490f();
                    String m129493i = c24902e.m129493i();
                    this.f122015u = flowCollector;
                    this.f122014t = 3;
                    obj = m127651a.mo127590i(m129490f, m129493i, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    cVar = new AbstractC24900c.c(new b(C25451c.f121865a.m131825o(((C24903f) obj).m129503f())));
                    this.f122015u = flowCollector;
                    this.f122014t = 4;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f122015u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f122015u;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f122015u = flowCollector2;
                this.f122014t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (C25459k.this.f122011a.mo131936a(false)) {
                C24405q m127651a2 = C24405q.Companion.m127651a();
                String m131905a = this.f122017w.m131905a();
                this.f122015u = flowCollector;
                this.f122014t = 2;
                obj = m127651a2.mo127588f(m131905a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                C24902e c24902e2 = (C24902e) obj;
                C24405q m127651a3 = C24405q.Companion.m127651a();
                String m129490f2 = c24902e2.m129490f();
                String m129493i2 = c24902e2.m129493i();
                this.f122015u = flowCollector;
                this.f122014t = 3;
                obj = m127651a3.mo127590i(m129490f2, m129493i2, this);
                if (obj == m142578e) {
                }
                cVar = new AbstractC24900c.c(new b(C25451c.f121865a.m131825o(((C24903f) obj).m129503f())));
                this.f122015u = flowCollector;
                this.f122014t = 4;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            throw ExceptionNoNetwork.f46313p;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25459k(InterfaceC25469b interfaceC25469b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C25478k() : interfaceC25469b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C25459k(InterfaceC25469b interfaceC25469b) {
        AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
        this.f122011a = interfaceC25469b;
    }
}
