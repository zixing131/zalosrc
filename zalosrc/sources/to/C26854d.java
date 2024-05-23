package to;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20834z0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p304ks.C21937w;
import p398oo.C24348b;
import p458qr.AbstractC25468a;
import p458qr.C25487t;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: to.d */
/* loaded from: classes4.dex */
public final class C26854d extends AbstractC19377a {

    /* renamed from: a */
    private final C24348b f127144a;

    /* renamed from: to.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final ContactProfile f127145a;

        /* renamed from: b */
        private final TrackingSource f127146b;

        /* renamed from: c */
        private final boolean f127147c;

        public a(ContactProfile contactProfile, TrackingSource trackingSource) {
            boolean m127128x;
            AbstractC19074t.m100208f(contactProfile, "cp");
            this.f127145a = contactProfile;
            this.f127146b = trackingSource;
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            m127128x = AbstractC24341v.m127128x(str);
            this.f127147c = m127128x;
        }

        /* renamed from: a */
        public final ContactProfile m138043a() {
            return this.f127145a;
        }

        /* renamed from: b */
        public final TrackingSource m138044b() {
            return this.f127146b;
        }

        /* renamed from: c */
        public final boolean m138045c() {
            return this.f127147c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f127145a, aVar.f127145a) && AbstractC19074t.m100204b(this.f127146b, aVar.f127146b);
        }

        public int hashCode() {
            int hashCode = this.f127145a.hashCode() * 31;
            TrackingSource trackingSource = this.f127146b;
            return hashCode + (trackingSource == null ? 0 : trackingSource.hashCode());
        }

        public String toString() {
            return "Param(cp=" + this.f127145a + ", trackingSource=" + this.f127146b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127148t;

        /* renamed from: u */
        private /* synthetic */ Object f127149u;

        /* renamed from: v */
        final /* synthetic */ a f127150v;

        /* renamed from: w */
        final /* synthetic */ C26854d f127151w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C26854d c26854d, Continuation continuation) {
            super(2, continuation);
            this.f127150v = aVar;
            this.f127151w = c26854d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f127150v, this.f127151w, continuation);
            bVar.f127149u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
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
            ?? r12 = this.f127148t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f127149u = null;
                this.f127148t = 4;
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
                    flowCollector = (FlowCollector) this.f127149u;
                    AbstractC24862s.m129228b(obj);
                    C21937w.f108027a.m114576o(this.f127150v.m138043a().f42434r);
                    C20834z0.f102412a.m108928g(true);
                    C25487t.f122084a.m132028c(C25487t.a.f122099w);
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f127149u = flowCollector;
                    this.f127148t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f127149u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f127149u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f127149u = flowCollector2;
                this.f127148t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (!this.f127150v.m138045c()) {
                C24348b m138041c = this.f127151w.m138041c();
                String str = this.f127150v.m138043a().f42434r;
                AbstractC19074t.m100207e(str, "uid");
                TrackingSource m138044b = this.f127150v.m138044b();
                this.f127149u = flowCollector;
                this.f127148t = 2;
                if (m138041c.m127233k(str, m138044b, this) == m142578e) {
                    return m142578e;
                }
                C21937w.f108027a.m114576o(this.f127150v.m138043a().f42434r);
                C20834z0.f102412a.m108928g(true);
                C25487t.f122084a.m132028c(C25487t.a.f122099w);
                cVar = new AbstractC25468a.c(C24848g0.f119245a);
                this.f127149u = flowCollector;
                this.f127148t = 3;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            throw new Exception();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C26854d(C24348b c24348b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b);
    }

    /* renamed from: c */
    public final C24348b m138041c() {
        return this.f127144a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C26854d(C24348b c24348b) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        this.f127144a = c24348b;
    }
}
