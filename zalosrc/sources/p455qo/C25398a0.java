package p455qo;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p398oo.C24369l0;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: qo.a0 */
/* loaded from: classes4.dex */
public final class C25398a0 extends AbstractC19377a {

    /* renamed from: a */
    private final C24369l0 f121594a;

    /* renamed from: b */
    private final InterfaceC24374o f121595b;

    /* renamed from: qo.a0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121596a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "userId");
            this.f121596a = str;
        }

        /* renamed from: a */
        public final String m131606a() {
            return this.f121596a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121596a, ((a) obj).f121596a);
        }

        public int hashCode() {
            return this.f121596a.hashCode();
        }

        public String toString() {
            return "Param(userId=" + this.f121596a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.a0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121597t;

        /* renamed from: u */
        private /* synthetic */ Object f121598u;

        /* renamed from: w */
        final /* synthetic */ a f121600w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121600w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121600w, continuation);
            bVar.f121598u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f121597t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f121598u = null;
                this.f121597t = 3;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    FlowCollector flowCollector2 = (FlowCollector) this.f121598u;
                    AbstractC24862s.m129228b(obj);
                    r12 = flowCollector2;
                    return C24848g0.f119245a;
                }
                FlowCollector flowCollector3 = (FlowCollector) this.f121598u;
                AbstractC24862s.m129228b(obj);
                flowCollector = flowCollector3;
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.f121598u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f121598u = flowCollector4;
                this.f121597t = 1;
                if (flowCollector4.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector4;
            }
            C25398a0.this.f121595b.mo127472d(0).m127391A(this.f121600w.m131606a());
            C25398a0.this.f121595b.mo127472d(1).m127391A(this.f121600w.m131606a());
            AbstractC25468a.c cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(true));
            this.f121598u = flowCollector;
            this.f121597t = 2;
            Object mo12109b = flowCollector.mo12109b(cVar, this);
            r12 = flowCollector;
            if (mo12109b == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C25398a0(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24369l0.Companion.m127457a() : c24369l0, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }

    public C25398a0(C24369l0 c24369l0, InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(c24369l0, "repo");
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121594a = c24369l0;
        this.f121595b = interfaceC24374o;
    }
}
