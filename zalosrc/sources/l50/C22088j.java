package l50;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import k50.C21473a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.j */
/* loaded from: classes5.dex */
public final class C22088j extends AbstractC19377a {

    /* renamed from: a */
    private final C20304a f108709a;

    /* renamed from: l50.j$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final C21473a f108710a;

        public a(C21473a c21473a) {
            AbstractC19074t.m100208f(c21473a, "songCategory");
            this.f108710a = c21473a;
        }

        /* renamed from: a */
        public final C21473a m115237a() {
            return this.f108710a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f108710a, ((a) obj).f108710a);
        }

        public int hashCode() {
            return this.f108710a.hashCode();
        }

        public String toString() {
            return "Param(songCategory=" + this.f108710a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.j$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108711t;

        /* renamed from: u */
        private /* synthetic */ Object f108712u;

        /* renamed from: w */
        final /* synthetic */ a f108714w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f108714w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f108714w, continuation);
            bVar.f108712u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
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
            ?? r12 = this.f108711t;
            try {
            } catch (Exception e11) {
                AbstractC24900c.a aVar = new AbstractC24900c.a(e11);
                this.f108712u = null;
                this.f108711t = 4;
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
                    flowCollector = (FlowCollector) this.f108712u;
                    AbstractC24862s.m129228b(obj);
                    cVar = new AbstractC24900c.c((C21473a) obj);
                    this.f108712u = flowCollector;
                    this.f108711t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f108712u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f108712u;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f108712u = flowCollector2;
                this.f108711t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C20304a m115235c = C22088j.this.m115235c();
            C21473a m115237a = this.f108714w.m115237a();
            this.f108712u = flowCollector;
            this.f108711t = 2;
            obj = m115235c.m106000z(m115237a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            cVar = new AbstractC24900c.c((C21473a) obj);
            this.f108712u = flowCollector;
            this.f108711t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22088j(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108709a = c20304a;
    }

    /* renamed from: c */
    public final C20304a m115235c() {
        return this.f108709a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }

    public /* synthetic */ C22088j(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
