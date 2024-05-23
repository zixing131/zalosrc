package so;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.zinstant.C17244x0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p133ek.AbstractC18459b;
import p185gc.AbstractC19377a;
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.b */
/* loaded from: classes4.dex */
public final class C26344b extends AbstractC19377a {

    /* renamed from: so.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125077a;

        /* renamed from: b */
        private final String f125078b;

        /* renamed from: c */
        private final int f125079c;

        /* renamed from: d */
        private final C17244x0 f125080d;

        /* renamed from: e */
        private final C3003l3 f125081e;

        /* renamed from: f */
        private final C3063z0 f125082f;

        /* renamed from: g */
        private final PrivacyInfo f125083g;

        /* renamed from: h */
        private final int f125084h;

        /* renamed from: i */
        private final double f125085i;

        /* renamed from: j */
        private final TrackingSource f125086j;

        /* renamed from: k */
        private final boolean f125087k;

        /* renamed from: l */
        private final C3000l0 f125088l;

        /* renamed from: m */
        private final boolean f125089m;

        /* renamed from: n */
        private final String f125090n;

        /* renamed from: o */
        private final InterfaceC18505l f125091o;

        public a(String str, String str2, int i11, C17244x0 c17244x0, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i12, double d11, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str3, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str2, "feedMemoryId");
            AbstractC19074t.m100208f(str3, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125077a = str;
            this.f125078b = str2;
            this.f125079c = i11;
            this.f125080d = c17244x0;
            this.f125081e = c3003l3;
            this.f125082f = c3063z0;
            this.f125083g = privacyInfo;
            this.f125084h = i12;
            this.f125085i = d11;
            this.f125086j = trackingSource;
            this.f125087k = z11;
            this.f125088l = c3000l0;
            this.f125089m = z12;
            this.f125090n = str3;
            this.f125091o = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m135563a() {
            return this.f125091o;
        }

        /* renamed from: b */
        public final String m135564b() {
            return this.f125077a;
        }

        /* renamed from: c */
        public final String m135565c() {
            return this.f125090n;
        }

        /* renamed from: d */
        public final C3063z0 m135566d() {
            return this.f125082f;
        }

        /* renamed from: e */
        public final String m135567e() {
            return this.f125078b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125077a, aVar.f125077a) && AbstractC19074t.m100204b(this.f125078b, aVar.f125078b) && this.f125079c == aVar.f125079c && AbstractC19074t.m100204b(this.f125080d, aVar.f125080d) && AbstractC19074t.m100204b(this.f125081e, aVar.f125081e) && AbstractC19074t.m100204b(this.f125082f, aVar.f125082f) && AbstractC19074t.m100204b(this.f125083g, aVar.f125083g) && this.f125084h == aVar.f125084h && Double.compare(this.f125085i, aVar.f125085i) == 0 && AbstractC19074t.m100204b(this.f125086j, aVar.f125086j) && this.f125087k == aVar.f125087k && AbstractC19074t.m100204b(this.f125088l, aVar.f125088l) && this.f125089m == aVar.f125089m && AbstractC19074t.m100204b(this.f125090n, aVar.f125090n) && AbstractC19074t.m100204b(this.f125091o, aVar.f125091o);
        }

        /* renamed from: f */
        public final int m135568f() {
            return this.f125079c;
        }

        /* renamed from: g */
        public final C3000l0 m135569g() {
            return this.f125088l;
        }

        /* renamed from: h */
        public final PrivacyInfo m135570h() {
            return this.f125083g;
        }

        public int hashCode() {
            int hashCode = ((((this.f125077a.hashCode() * 31) + this.f125078b.hashCode()) * 31) + this.f125079c) * 31;
            C17244x0 c17244x0 = this.f125080d;
            int hashCode2 = (hashCode + (c17244x0 == null ? 0 : c17244x0.hashCode())) * 31;
            C3003l3 c3003l3 = this.f125081e;
            int hashCode3 = (hashCode2 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125082f;
            int hashCode4 = (hashCode3 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125083g;
            int hashCode5 = (((((hashCode4 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31) + this.f125084h) * 31) + AbstractC18459b.m97786a(this.f125085i)) * 31;
            TrackingSource trackingSource = this.f125086j;
            int hashCode6 = (((hashCode5 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125087k)) * 31;
            C3000l0 c3000l0 = this.f125088l;
            return ((((((hashCode6 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125089m)) * 31) + this.f125090n.hashCode()) * 31) + this.f125091o.hashCode();
        }

        /* renamed from: i */
        public final double m135571i() {
            return this.f125085i;
        }

        /* renamed from: j */
        public final C3003l3 m135572j() {
            return this.f125081e;
        }

        /* renamed from: k */
        public final TrackingSource m135573k() {
            return this.f125086j;
        }

        /* renamed from: l */
        public final int m135574l() {
            return this.f125084h;
        }

        /* renamed from: m */
        public final C17244x0 m135575m() {
            return this.f125080d;
        }

        /* renamed from: n */
        public final boolean m135576n() {
            return this.f125089m;
        }

        /* renamed from: o */
        public final boolean m135577o() {
            return this.f125087k;
        }

        public String toString() {
            return "Param(desc=" + this.f125077a + ", feedMemoryId=" + this.f125078b + ", feedMemoryType=" + this.f125079c + ", zinstantFeedInfo=" + this.f125080d + ", tag=" + this.f125081e + ", feedLocation=" + this.f125082f + ", privacyInfo=" + this.f125083g + ", typoId=" + this.f125084h + ", ratioZinstant=" + this.f125085i + ", trackingSource=" + this.f125086j + ", isMutualFeed=" + this.f125087k + ", oldAsyncFeed=" + this.f125088l + ", isEmptyPhotoOrVideo=" + this.f125089m + ", feedId=" + this.f125090n + ", callback=" + this.f125091o + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125092t;

        /* renamed from: u */
        private /* synthetic */ Object f125093u;

        /* renamed from: v */
        final /* synthetic */ a f125094v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f125095p = new a();

            a() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f125094v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125094v, continuation);
            bVar.f125093u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00fb A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            Object m101498a;
            FlowCollector flowCollector2;
            AbstractC28358a.b bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125092t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        flowCollector = (FlowCollector) this.f125093u;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Exception e11) {
                            e = e11;
                            bVar = new AbstractC28358a.b(null, e);
                            this.f125093u = null;
                            this.f125092t = 3;
                            if (flowCollector.mo12109b(bVar, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    return C24848g0.f119245a;
                }
                flowCollector2 = (FlowCollector) this.f125093u;
                try {
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                } catch (Exception e12) {
                    e = e12;
                    flowCollector = flowCollector2;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125093u = null;
                    this.f125092t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f125093u;
                try {
                    C3000l0 m14279y = C3000l0.m14279y(this.f125094v.m135564b(), this.f125094v.m135567e(), this.f125094v.m135568f(), this.f125094v.m135575m(), this.f125094v.m135572j(), this.f125094v.m135566d(), this.f125094v.m135570h(), this.f125094v.m135574l(), this.f125094v.m135571i(), this.f125094v.m135573k(), "");
                    m14279y.f11895q = this.f125094v.m135565c();
                    m14279y.m14322a0().f12057p = this.f125094v.m135565c();
                    m14279y.m14322a0().m14534x0(true);
                    C28363f c28363f = new C28363f();
                    C3000l0 m135569g = this.f125094v.m135569g();
                    boolean m135576n = this.f125094v.m135576n();
                    boolean m135577o = this.f125094v.m135577o();
                    C28363f.a aVar = new C28363f.a(m135569g, m14279y, AbstractC29094b.m145339a(m135577o), m135576n, this.f125094v.m135563a());
                    this.f125093u = flowCollector3;
                    this.f125092t = 1;
                    m101498a = c28363f.m101498a(aVar, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector3;
                } catch (Exception e13) {
                    e = e13;
                    flowCollector = flowCollector3;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125093u = null;
                    this.f125092t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                a aVar2 = a.f125095p;
                this.f125093u = flowCollector2;
                this.f125092t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }
}
