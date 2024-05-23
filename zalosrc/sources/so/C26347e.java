package so;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import c30.C3255n;
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
import p471r3.C25630b;
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import p581vo.EnumC28360c;
import p588vw.C28644j;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28020b3;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.e */
/* loaded from: classes4.dex */
public final class C26347e extends AbstractC19377a {

    /* renamed from: so.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125140a;

        /* renamed from: b */
        private final C25630b f125141b;

        /* renamed from: c */
        private final C3003l3 f125142c;

        /* renamed from: d */
        private final C3063z0 f125143d;

        /* renamed from: e */
        private final PrivacyInfo f125144e;

        /* renamed from: f */
        private final C31890dc f125145f;

        /* renamed from: g */
        private final TrackingSource f125146g;

        /* renamed from: h */
        private final boolean f125147h;

        /* renamed from: i */
        private final C3000l0 f125148i;

        /* renamed from: j */
        private final boolean f125149j;

        /* renamed from: k */
        private final String f125150k;

        /* renamed from: l */
        private final InterfaceC18505l f125151l;

        public a(String str, C25630b c25630b, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str2, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125140a = str;
            this.f125141b = c25630b;
            this.f125142c = c3003l3;
            this.f125143d = c3063z0;
            this.f125144e = privacyInfo;
            this.f125145f = c31890dc;
            this.f125146g = trackingSource;
            this.f125147h = z11;
            this.f125148i = c3000l0;
            this.f125149j = z12;
            this.f125150k = str2;
            this.f125151l = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m135625a() {
            return this.f125151l;
        }

        /* renamed from: b */
        public final String m135626b() {
            return this.f125140a;
        }

        /* renamed from: c */
        public final String m135627c() {
            return this.f125150k;
        }

        /* renamed from: d */
        public final C3063z0 m135628d() {
            return this.f125143d;
        }

        /* renamed from: e */
        public final C25630b m135629e() {
            return this.f125141b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125140a, aVar.f125140a) && AbstractC19074t.m100204b(this.f125141b, aVar.f125141b) && AbstractC19074t.m100204b(this.f125142c, aVar.f125142c) && AbstractC19074t.m100204b(this.f125143d, aVar.f125143d) && AbstractC19074t.m100204b(this.f125144e, aVar.f125144e) && AbstractC19074t.m100204b(this.f125145f, aVar.f125145f) && AbstractC19074t.m100204b(this.f125146g, aVar.f125146g) && this.f125147h == aVar.f125147h && AbstractC19074t.m100204b(this.f125148i, aVar.f125148i) && this.f125149j == aVar.f125149j && AbstractC19074t.m100204b(this.f125150k, aVar.f125150k) && AbstractC19074t.m100204b(this.f125151l, aVar.f125151l);
        }

        /* renamed from: f */
        public final C3000l0 m135630f() {
            return this.f125148i;
        }

        /* renamed from: g */
        public final PrivacyInfo m135631g() {
            return this.f125144e;
        }

        /* renamed from: h */
        public final C3003l3 m135632h() {
            return this.f125142c;
        }

        public int hashCode() {
            int hashCode = this.f125140a.hashCode() * 31;
            C25630b c25630b = this.f125141b;
            int hashCode2 = (hashCode + (c25630b == null ? 0 : c25630b.hashCode())) * 31;
            C3003l3 c3003l3 = this.f125142c;
            int hashCode3 = (hashCode2 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125143d;
            int hashCode4 = (hashCode3 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125144e;
            int hashCode5 = (hashCode4 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f125145f;
            int hashCode6 = (hashCode5 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125146g;
            int hashCode7 = (((hashCode6 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125147h)) * 31;
            C3000l0 c3000l0 = this.f125148i;
            return ((((((hashCode7 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125149j)) * 31) + this.f125150k.hashCode()) * 31) + this.f125151l.hashCode();
        }

        /* renamed from: i */
        public final TrackingSource m135633i() {
            return this.f125146g;
        }

        /* renamed from: j */
        public final C31890dc m135634j() {
            return this.f125145f;
        }

        /* renamed from: k */
        public final boolean m135635k() {
            return this.f125149j;
        }

        /* renamed from: l */
        public final boolean m135636l() {
            return this.f125147h;
        }

        public String toString() {
            return "Param(desc=" + this.f125140a + ", mCurrentSticker=" + this.f125141b + ", tag=" + this.f125142c + ", location=" + this.f125143d + ", privacyInfo=" + this.f125144e + ", typo=" + this.f125145f + ", trackingSource=" + this.f125146g + ", isMutualFeed=" + this.f125147h + ", oldAsyncFeed=" + this.f125148i + ", isEmptyPhotoOrVideo=" + this.f125149j + ", feedId=" + this.f125150k + ", callback=" + this.f125151l + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125152t;

        /* renamed from: u */
        private /* synthetic */ Object f125153u;

        /* renamed from: v */
        final /* synthetic */ a f125154v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.e$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f125155p = new a();

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
            this.f125154v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125154v, continuation);
            bVar.f125153u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0104 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:15:0x0029, B:17:0x0036, B:18:0x0111, B:20:0x0040, B:22:0x0100, B:24:0x0104), top: B:2:0x000d }] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25630b m135629e;
            String str;
            boolean z11;
            int i11;
            int i12;
            Object m101498a;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f125152t;
            ?? r42 = 3;
            try {
            } catch (Exception e11) {
                e = e11;
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    flowCollector = (FlowCollector) this.f125153u;
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                    flow = (Flow) m101498a;
                    if (flow != null) {
                        a aVar = a.f125155p;
                        this.f125153u = flowCollector;
                        this.f125152t = 2;
                        if (flow.mo97893a(aVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f125153u;
                try {
                    m135629e = this.f125154v.m135629e();
                    if (m135629e == null) {
                        str = "";
                        z11 = false;
                    } else {
                        m135629e = C28644j.m143233Y().m143282P0(m135629e);
                        str = C28020b3.f130648a.m141207x(m135629e);
                        z11 = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r42 = flowCollector2;
                    e.printStackTrace();
                    AbstractC28358a.b bVar = new AbstractC28358a.b(null, e);
                    this.f125153u = null;
                    this.f125152t = 4;
                    if (r42.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                if (z11) {
                    String m135626b = this.f125154v.m135626b();
                    if (m135629e != null) {
                        i11 = m135629e.m132429g();
                    } else {
                        i11 = 0;
                    }
                    if (m135629e != null) {
                        i12 = m135629e.m132427f();
                    } else {
                        i12 = 0;
                    }
                    C3000l0 m14242B = C3000l0.m14242B(m135626b, i11, i12, str, this.f125154v.m135632h(), this.f125154v.m135628d(), this.f125154v.m135631g(), this.f125154v.m135634j(), this.f125154v.m135633i(), "");
                    m14242B.f11895q = this.f125154v.m135627c();
                    m14242B.m14322a0().f12057p = this.f125154v.m135627c();
                    m14242B.m14322a0().m14534x0(true);
                    C28363f c28363f = new C28363f();
                    C3000l0 m135630f = this.f125154v.m135630f();
                    boolean m135635k = this.f125154v.m135635k();
                    boolean m135636l = this.f125154v.m135636l();
                    C28363f.a aVar2 = new C28363f.a(m135630f, m14242B, AbstractC29094b.m145339a(m135636l), m135635k, this.f125154v.m135625a());
                    this.f125153u = flowCollector2;
                    this.f125152t = 1;
                    m101498a = c28363f.m101498a(aVar2, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector2;
                    flow = (Flow) m101498a;
                    if (flow != null) {
                    }
                } else {
                    AbstractC28358a.b bVar2 = new AbstractC28358a.b(EnumC28360c.f132138q, null);
                    this.f125153u = flowCollector2;
                    this.f125152t = 3;
                    if (flowCollector2.mo12109b(bVar2, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            C3255n.m16562n().m16578v(this.f125154v.m135629e());
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
