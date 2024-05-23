package to;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20834z0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p304ks.C21937w;
import p398oo.C24348b;
import p398oo.C24371m0;
import p458qr.AbstractC25468a;
import p458qr.C25487t;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: to.b */
/* loaded from: classes4.dex */
public final class C26852b extends AbstractC19377a {

    /* renamed from: a */
    private final C24348b f127129a;

    /* renamed from: to.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f127130a;

        /* renamed from: b */
        private final TrackingSource f127131b;

        /* renamed from: c */
        private final boolean f127132c;

        public a(List list, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(list, "uids");
            this.f127130a = list;
            this.f127131b = trackingSource;
            this.f127132c = list.isEmpty();
        }

        /* renamed from: a */
        public final TrackingSource m138030a() {
            return this.f127131b;
        }

        /* renamed from: b */
        public final List m138031b() {
            return this.f127130a;
        }

        /* renamed from: c */
        public final boolean m138032c() {
            return this.f127132c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f127130a, aVar.f127130a) && AbstractC19074t.m100204b(this.f127131b, aVar.f127131b);
        }

        public int hashCode() {
            int hashCode = this.f127130a.hashCode() * 31;
            TrackingSource trackingSource = this.f127131b;
            return hashCode + (trackingSource == null ? 0 : trackingSource.hashCode());
        }

        public String toString() {
            return "Param(uids=" + this.f127130a + ", trackingSource=" + this.f127131b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127133t;

        /* renamed from: u */
        private /* synthetic */ Object f127134u;

        /* renamed from: v */
        final /* synthetic */ a f127135v;

        /* renamed from: w */
        final /* synthetic */ C26852b f127136w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C26852b c26852b, Continuation continuation) {
            super(2, continuation);
            this.f127135v = aVar;
            this.f127136w = c26852b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f127135v, this.f127136w, continuation);
            bVar.f127134u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: Exception -> 0x002a, LOOP:0: B:19:0x0083->B:21:0x0089, LOOP_END, TryCatch #0 {Exception -> 0x002a, blocks: (B:15:0x0025, B:17:0x0031, B:18:0x0077, B:19:0x0083, B:21:0x0089, B:23:0x00a3, B:27:0x0052, B:29:0x005a, B:32:0x00c1, B:33:0x00c6), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[RETURN] */
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
            ?? r12 = this.f127133t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f127134u = null;
                this.f127133t = 4;
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
                    flowCollector = (FlowCollector) this.f127134u;
                    AbstractC24862s.m129228b(obj);
                    for (String str : this.f127135v.m138031b()) {
                        C24371m0.Companion.m127483a().m127480r(str);
                        C21937w.f108027a.m114568f(new ContactProfile(str));
                    }
                    C20834z0.f102412a.m108928g(true);
                    C25487t.f122084a.m132028c(C25487t.a.f122099w);
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f127134u = flowCollector;
                    this.f127133t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f127134u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f127134u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f127134u = flowCollector2;
                this.f127133t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (!this.f127135v.m138032c()) {
                C24348b m138028c = this.f127136w.m138028c();
                List m138031b = this.f127135v.m138031b();
                TrackingSource m138030a = this.f127135v.m138030a();
                this.f127134u = flowCollector;
                this.f127133t = 2;
                if (m138028c.m127229c(m138031b, m138030a, this) == m142578e) {
                    return m142578e;
                }
                while (r9.hasNext()) {
                }
                C20834z0.f102412a.m108928g(true);
                C25487t.f122084a.m132028c(C25487t.a.f122099w);
                cVar = new AbstractC25468a.c(C24848g0.f119245a);
                this.f127134u = flowCollector;
                this.f127133t = 3;
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

    public /* synthetic */ C26852b(C24348b c24348b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b);
    }

    /* renamed from: c */
    public final C24348b m138028c() {
        return this.f127129a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C26852b(C24348b c24348b) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        this.f127129a = c24348b;
    }
}
