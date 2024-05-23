package to;

import androidx.work.AbstractC2144f;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p398oo.C24348b;
import p398oo.C24371m0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import tn.C26747f0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: to.a */
/* loaded from: classes4.dex */
public final class C26851a extends AbstractC19377a {

    /* renamed from: a */
    private final C24348b f127119a;

    /* renamed from: to.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f127120a;

        /* renamed from: b */
        private final String f127121b;

        /* renamed from: c */
        private final TrackingSource f127122c;

        /* renamed from: d */
        private final boolean f127123d;

        /* renamed from: e */
        private final boolean f127124e;

        public a(String str, String str2, TrackingSource trackingSource, boolean z11) {
            boolean m127128x;
            boolean z12;
            boolean m127128x2;
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "feedId");
            this.f127120a = str;
            this.f127121b = str2;
            this.f127122c = trackingSource;
            this.f127123d = z11;
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                m127128x2 = AbstractC24341v.m127128x(str2);
                if (!m127128x2) {
                    z12 = false;
                    this.f127124e = z12;
                }
            }
            z12 = true;
            this.f127124e = z12;
        }

        /* renamed from: a */
        public final String m138022a() {
            return this.f127121b;
        }

        /* renamed from: b */
        public final String m138023b() {
            return this.f127120a;
        }

        /* renamed from: c */
        public final TrackingSource m138024c() {
            return this.f127122c;
        }

        /* renamed from: d */
        public final boolean m138025d() {
            return this.f127124e;
        }

        /* renamed from: e */
        public final boolean m138026e() {
            return this.f127123d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f127120a, aVar.f127120a) && AbstractC19074t.m100204b(this.f127121b, aVar.f127121b) && AbstractC19074t.m100204b(this.f127122c, aVar.f127122c) && this.f127123d == aVar.f127123d;
        }

        public int hashCode() {
            int hashCode = ((this.f127120a.hashCode() * 31) + this.f127121b.hashCode()) * 31;
            TrackingSource trackingSource = this.f127122c;
            return ((hashCode + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f127123d);
        }

        public String toString() {
            return "Param(ownerId=" + this.f127120a + ", feedId=" + this.f127121b + ", trackingSource=" + this.f127122c + ", isOnTimeline=" + this.f127123d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: to.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127125t;

        /* renamed from: u */
        private /* synthetic */ Object f127126u;

        /* renamed from: v */
        final /* synthetic */ a f127127v;

        /* renamed from: w */
        final /* synthetic */ C26851a f127128w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C26851a c26851a, Continuation continuation) {
            super(2, continuation);
            this.f127127v = aVar;
            this.f127128w = c26851a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f127127v, this.f127128w, continuation);
            bVar.f127126u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:15:0x0025, B:17:0x0031, B:18:0x007b, B:20:0x0083, B:21:0x00a8, B:24:0x0099, B:26:0x0052, B:28:0x005a, B:31:0x00d4, B:32:0x00d9), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:15:0x0025, B:17:0x0031, B:18:0x007b, B:20:0x0083, B:21:0x00a8, B:24:0x0099, B:26:0x0052, B:28:0x005a, B:31:0x00d4, B:32:0x00d9), top: B:2:0x000a }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            List m131496e;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f127125t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f127126u = null;
                this.f127125t = 4;
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
                    flowCollector = (FlowCollector) this.f127126u;
                    AbstractC24862s.m129228b(obj);
                    if (!this.f127127v.m138026e()) {
                        C24371m0.Companion.m127483a().m127479q(this.f127127v.m138023b(), this.f127127v.m138022a());
                    } else {
                        C24371m0.Companion.m127483a().m127480r(this.f127127v.m138023b());
                    }
                    C26747f0.m137582I().m137653A0(this.f127127v.m138022a());
                    C26747f0.m137582I().m137655C(this.f127127v.m138022a());
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f127126u = flowCollector;
                    this.f127125t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f127126u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f127126u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f127126u = flowCollector2;
                this.f127125t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (!this.f127127v.m138025d()) {
                C24348b m138020c = this.f127128w.m138020c();
                m131496e = AbstractC25366r.m131496e(this.f127127v.m138023b());
                TrackingSource m138024c = this.f127127v.m138024c();
                this.f127126u = flowCollector;
                this.f127125t = 2;
                if (m138020c.m127229c(m131496e, m138024c, this) == m142578e) {
                    return m142578e;
                }
                if (!this.f127127v.m138026e()) {
                }
                C26747f0.m137582I().m137653A0(this.f127127v.m138022a());
                C26747f0.m137582I().m137655C(this.f127127v.m138022a());
                cVar = new AbstractC25468a.c(C24848g0.f119245a);
                this.f127126u = flowCollector;
                this.f127125t = 3;
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

    public /* synthetic */ C26851a(C24348b c24348b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b);
    }

    /* renamed from: c */
    public final C24348b m138020c() {
        return this.f127119a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C26851a(C24348b c24348b) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        this.f127119a = c24348b;
    }
}
