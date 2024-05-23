package p581vo;

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
import p458qr.AbstractC25468a;
import p471r3.C25630b;
import p581vo.AbstractC28358a;
import p581vo.C28362e;
import p588vw.C28644j;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vg.C28020b3;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.j */
/* loaded from: classes4.dex */
public final class C28367j extends AbstractC19377a {

    /* renamed from: vo.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132227a;

        /* renamed from: b */
        private final C3003l3 f132228b;

        /* renamed from: c */
        private final C3063z0 f132229c;

        /* renamed from: d */
        private final PrivacyInfo f132230d;

        /* renamed from: e */
        private final C31890dc f132231e;

        /* renamed from: f */
        private final TrackingSource f132232f;

        /* renamed from: g */
        private C25630b f132233g;

        /* renamed from: h */
        private final boolean f132234h;

        /* renamed from: i */
        private final InterfaceC18505l f132235i;

        /* renamed from: j */
        private final String f132236j;

        public a(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, C25630b c25630b, boolean z11, InterfaceC18505l interfaceC18505l, String str2) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str2, "postFeedCallbackId");
            this.f132227a = str;
            this.f132228b = c3003l3;
            this.f132229c = c3063z0;
            this.f132230d = privacyInfo;
            this.f132231e = c31890dc;
            this.f132232f = trackingSource;
            this.f132233g = c25630b;
            this.f132234h = z11;
            this.f132235i = interfaceC18505l;
            this.f132236j = str2;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142885a() {
            return this.f132235i;
        }

        /* renamed from: b */
        public final String m142886b() {
            return this.f132227a;
        }

        /* renamed from: c */
        public C3063z0 m142887c() {
            return this.f132229c;
        }

        /* renamed from: d */
        public final C25630b m142888d() {
            return this.f132233g;
        }

        /* renamed from: e */
        public String m142889e() {
            return this.f132236j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132227a, aVar.f132227a) && AbstractC19074t.m100204b(this.f132228b, aVar.f132228b) && AbstractC19074t.m100204b(this.f132229c, aVar.f132229c) && AbstractC19074t.m100204b(this.f132230d, aVar.f132230d) && AbstractC19074t.m100204b(this.f132231e, aVar.f132231e) && AbstractC19074t.m100204b(this.f132232f, aVar.f132232f) && AbstractC19074t.m100204b(this.f132233g, aVar.f132233g) && this.f132234h == aVar.f132234h && AbstractC19074t.m100204b(this.f132235i, aVar.f132235i) && AbstractC19074t.m100204b(this.f132236j, aVar.f132236j);
        }

        /* renamed from: f */
        public PrivacyInfo m142890f() {
            return this.f132230d;
        }

        /* renamed from: g */
        public C3003l3 m142891g() {
            return this.f132228b;
        }

        /* renamed from: h */
        public TrackingSource m142892h() {
            return this.f132232f;
        }

        public int hashCode() {
            int hashCode = this.f132227a.hashCode() * 31;
            C3003l3 c3003l3 = this.f132228b;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132229c;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132230d;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f132231e;
            int hashCode5 = (hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f132232f;
            int hashCode6 = (hashCode5 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31;
            C25630b c25630b = this.f132233g;
            return ((((((hashCode6 + (c25630b != null ? c25630b.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f132234h)) * 31) + this.f132235i.hashCode()) * 31) + this.f132236j.hashCode();
        }

        /* renamed from: i */
        public C31890dc m142893i() {
            return this.f132231e;
        }

        /* renamed from: j */
        public boolean m142894j() {
            return this.f132234h;
        }

        public String toString() {
            return "Param(desc=" + this.f132227a + ", tag=" + this.f132228b + ", location=" + this.f132229c + ", privacyInfo=" + this.f132230d + ", typo=" + this.f132231e + ", trackingSource=" + this.f132232f + ", mCurrentSticker=" + this.f132233g + ", isMutualFeed=" + this.f132234h + ", callback=" + this.f132235i + ", postFeedCallbackId=" + this.f132236j + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.j$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132237t;

        /* renamed from: u */
        private /* synthetic */ Object f132238u;

        /* renamed from: v */
        final /* synthetic */ a f132239v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.j$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f132240p = new a();

            a() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f132239v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132239v, continuation);
            bVar.f132238u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00dc A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:15:0x0028, B:17:0x0035, B:18:0x00e9, B:20:0x003f, B:22:0x00d8, B:24:0x00dc), top: B:2:0x000c }] */
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
            C25630b m142888d;
            String str;
            boolean z11;
            int i11;
            int i12;
            Object m101498a;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i13 = this.f132237t;
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
                    flowCollector = (FlowCollector) this.f132238u;
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                    flow = (Flow) m101498a;
                    if (flow != null) {
                        a aVar = a.f132240p;
                        this.f132238u = flowCollector;
                        this.f132237t = 2;
                        if (flow.mo97893a(aVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f132238u;
                try {
                    m142888d = this.f132239v.m142888d();
                    if (m142888d == null) {
                        str = "";
                        z11 = false;
                    } else {
                        m142888d = C28644j.m143233Y().m143282P0(m142888d);
                        str = C28020b3.f130648a.m141207x(m142888d);
                        z11 = true;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r42 = flowCollector2;
                    e.printStackTrace();
                    AbstractC28358a.b bVar = new AbstractC28358a.b(null, e);
                    this.f132238u = null;
                    this.f132237t = 4;
                    if (r42.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                if (z11) {
                    String m142886b = this.f132239v.m142886b();
                    if (m142888d != null) {
                        i11 = m142888d.m132429g();
                    } else {
                        i11 = 0;
                    }
                    if (m142888d != null) {
                        i12 = m142888d.m132427f();
                    } else {
                        i12 = 0;
                    }
                    C3000l0 m14242B = C3000l0.m14242B(m142886b, i11, i12, str, this.f132239v.m142891g(), this.f132239v.m142887c(), this.f132239v.m142890f(), this.f132239v.m142893i(), this.f132239v.m142892h(), this.f132239v.m142889e());
                    C28362e c28362e = new C28362e();
                    C28362e.a aVar2 = new C28362e.a(m14242B, AbstractC29094b.m145339a(this.f132239v.m142894j()), this.f132239v.m142885a());
                    this.f132238u = flowCollector2;
                    this.f132237t = 1;
                    m101498a = c28362e.m101498a(aVar2, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector = flowCollector2;
                    flow = (Flow) m101498a;
                    if (flow != null) {
                    }
                } else {
                    AbstractC28358a.a aVar3 = new AbstractC28358a.a();
                    this.f132238u = flowCollector2;
                    this.f132237t = 3;
                    if (flowCollector2.mo12109b(aVar3, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            C3255n.m16562n().m16578v(this.f132239v.m142888d());
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
