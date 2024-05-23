package so;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.f */
/* loaded from: classes4.dex */
public final class C26348f extends AbstractC19377a {

    /* renamed from: so.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125156a;

        /* renamed from: b */
        private final C3003l3 f125157b;

        /* renamed from: c */
        private final C3063z0 f125158c;

        /* renamed from: d */
        private final PrivacyInfo f125159d;

        /* renamed from: e */
        private final C31890dc f125160e;

        /* renamed from: f */
        private final TrackingSource f125161f;

        /* renamed from: g */
        private final boolean f125162g;

        /* renamed from: h */
        private final C3000l0 f125163h;

        /* renamed from: i */
        private final boolean f125164i;

        /* renamed from: j */
        private final String f125165j;

        /* renamed from: k */
        private final InterfaceC18505l f125166k;

        public a(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str2, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125156a = str;
            this.f125157b = c3003l3;
            this.f125158c = c3063z0;
            this.f125159d = privacyInfo;
            this.f125160e = c31890dc;
            this.f125161f = trackingSource;
            this.f125162g = z11;
            this.f125163h = c3000l0;
            this.f125164i = z12;
            this.f125165j = str2;
            this.f125166k = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m135640a() {
            return this.f125166k;
        }

        /* renamed from: b */
        public final String m135641b() {
            return this.f125156a;
        }

        /* renamed from: c */
        public final String m135642c() {
            return this.f125165j;
        }

        /* renamed from: d */
        public final C3063z0 m135643d() {
            return this.f125158c;
        }

        /* renamed from: e */
        public final C3000l0 m135644e() {
            return this.f125163h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125156a, aVar.f125156a) && AbstractC19074t.m100204b(this.f125157b, aVar.f125157b) && AbstractC19074t.m100204b(this.f125158c, aVar.f125158c) && AbstractC19074t.m100204b(this.f125159d, aVar.f125159d) && AbstractC19074t.m100204b(this.f125160e, aVar.f125160e) && AbstractC19074t.m100204b(this.f125161f, aVar.f125161f) && this.f125162g == aVar.f125162g && AbstractC19074t.m100204b(this.f125163h, aVar.f125163h) && this.f125164i == aVar.f125164i && AbstractC19074t.m100204b(this.f125165j, aVar.f125165j) && AbstractC19074t.m100204b(this.f125166k, aVar.f125166k);
        }

        /* renamed from: f */
        public final PrivacyInfo m135645f() {
            return this.f125159d;
        }

        /* renamed from: g */
        public final C3003l3 m135646g() {
            return this.f125157b;
        }

        /* renamed from: h */
        public final TrackingSource m135647h() {
            return this.f125161f;
        }

        public int hashCode() {
            int hashCode = this.f125156a.hashCode() * 31;
            C3003l3 c3003l3 = this.f125157b;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125158c;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125159d;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f125160e;
            int hashCode5 = (hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125161f;
            int hashCode6 = (((hashCode5 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125162g)) * 31;
            C3000l0 c3000l0 = this.f125163h;
            return ((((((hashCode6 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125164i)) * 31) + this.f125165j.hashCode()) * 31) + this.f125166k.hashCode();
        }

        /* renamed from: i */
        public final C31890dc m135648i() {
            return this.f125160e;
        }

        /* renamed from: j */
        public final boolean m135649j() {
            return this.f125164i;
        }

        /* renamed from: k */
        public final boolean m135650k() {
            return this.f125162g;
        }

        public String toString() {
            return "Param(desc=" + this.f125156a + ", tag=" + this.f125157b + ", feedLocation=" + this.f125158c + ", privacyInfo=" + this.f125159d + ", typo=" + this.f125160e + ", trackingSource=" + this.f125161f + ", isMutualFeed=" + this.f125162g + ", oldAsyncFeed=" + this.f125163h + ", isEmptyPhotoOrVideo=" + this.f125164i + ", feedId=" + this.f125165j + ", callback=" + this.f125166k + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125167t;

        /* renamed from: u */
        private /* synthetic */ Object f125168u;

        /* renamed from: v */
        final /* synthetic */ a f125169v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f125170p = new a();

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
            this.f125169v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125169v, continuation);
            bVar.f125168u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00e2 A[RETURN] */
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
            int i11 = this.f125167t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        flowCollector = (FlowCollector) this.f125168u;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Exception e11) {
                            e = e11;
                            bVar = new AbstractC28358a.b(null, e);
                            this.f125168u = null;
                            this.f125167t = 3;
                            if (flowCollector.mo12109b(bVar, this) == m142578e) {
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    return C24848g0.f119245a;
                }
                flowCollector2 = (FlowCollector) this.f125168u;
                try {
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                } catch (Exception e12) {
                    e = e12;
                    flowCollector = flowCollector2;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125168u = null;
                    this.f125167t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f125168u;
                try {
                    C3000l0 m14243C = C3000l0.m14243C(this.f125169v.m135641b(), this.f125169v.m135646g(), this.f125169v.m135643d(), this.f125169v.m135645f(), this.f125169v.m135648i(), this.f125169v.m135647h(), "");
                    m14243C.f11895q = this.f125169v.m135642c();
                    m14243C.m14322a0().f12057p = this.f125169v.m135642c();
                    m14243C.m14322a0().m14534x0(true);
                    C28363f c28363f = new C28363f();
                    C3000l0 m135644e = this.f125169v.m135644e();
                    boolean m135649j = this.f125169v.m135649j();
                    boolean m135650k = this.f125169v.m135650k();
                    C28363f.a aVar = new C28363f.a(m135644e, m14243C, AbstractC29094b.m145339a(m135650k), m135649j, this.f125169v.m135640a());
                    this.f125168u = flowCollector3;
                    this.f125167t = 1;
                    m101498a = c28363f.m101498a(aVar, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector3;
                } catch (Exception e13) {
                    e = e13;
                    flowCollector = flowCollector3;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125168u = null;
                    this.f125167t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                a aVar2 = a.f125170p;
                this.f125168u = flowCollector2;
                this.f125167t = 2;
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
