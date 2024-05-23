package p581vo;

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
import p458qr.AbstractC25468a;
import p581vo.AbstractC28358a;
import p581vo.C28359b;
import p581vo.C28362e;
import p716zh.C31845ac;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.k */
/* loaded from: classes4.dex */
public final class C28368k extends AbstractC19377a {

    /* renamed from: vo.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132241a;

        /* renamed from: b */
        private final C3003l3 f132242b;

        /* renamed from: c */
        private final C3063z0 f132243c;

        /* renamed from: d */
        private final PrivacyInfo f132244d;

        /* renamed from: e */
        private final C31890dc f132245e;

        /* renamed from: f */
        private final TrackingSource f132246f;

        /* renamed from: g */
        private final boolean f132247g;

        /* renamed from: h */
        private final boolean f132248h;

        /* renamed from: i */
        private final InterfaceC18505l f132249i;

        /* renamed from: j */
        private final String f132250j;

        public a(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, boolean z12, InterfaceC18505l interfaceC18505l, String str2) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str2, "postFeedCallbackId");
            this.f132241a = str;
            this.f132242b = c3003l3;
            this.f132243c = c3063z0;
            this.f132244d = privacyInfo;
            this.f132245e = c31890dc;
            this.f132246f = trackingSource;
            this.f132247g = z11;
            this.f132248h = z12;
            this.f132249i = interfaceC18505l;
            this.f132250j = str2;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142898a() {
            return this.f132249i;
        }

        /* renamed from: b */
        public final String m142899b() {
            return this.f132241a;
        }

        /* renamed from: c */
        public C3063z0 m142900c() {
            return this.f132243c;
        }

        /* renamed from: d */
        public String m142901d() {
            return this.f132250j;
        }

        /* renamed from: e */
        public PrivacyInfo m142902e() {
            return this.f132244d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132241a, aVar.f132241a) && AbstractC19074t.m100204b(this.f132242b, aVar.f132242b) && AbstractC19074t.m100204b(this.f132243c, aVar.f132243c) && AbstractC19074t.m100204b(this.f132244d, aVar.f132244d) && AbstractC19074t.m100204b(this.f132245e, aVar.f132245e) && AbstractC19074t.m100204b(this.f132246f, aVar.f132246f) && this.f132247g == aVar.f132247g && this.f132248h == aVar.f132248h && AbstractC19074t.m100204b(this.f132249i, aVar.f132249i) && AbstractC19074t.m100204b(this.f132250j, aVar.f132250j);
        }

        /* renamed from: f */
        public C3003l3 m142903f() {
            return this.f132242b;
        }

        /* renamed from: g */
        public TrackingSource m142904g() {
            return this.f132246f;
        }

        /* renamed from: h */
        public C31890dc m142905h() {
            return this.f132245e;
        }

        public int hashCode() {
            int hashCode = this.f132241a.hashCode() * 31;
            C3003l3 c3003l3 = this.f132242b;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132243c;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132244d;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f132245e;
            return ((((((((((hashCode4 + (c31890dc != null ? c31890dc.hashCode() : 0)) * 31) + this.f132246f.hashCode()) * 31) + AbstractC2144f.m11520a(this.f132247g)) * 31) + AbstractC2144f.m11520a(this.f132248h)) * 31) + this.f132249i.hashCode()) * 31) + this.f132250j.hashCode();
        }

        /* renamed from: i */
        public boolean m142906i() {
            return this.f132247g;
        }

        /* renamed from: j */
        public final boolean m142907j() {
            return this.f132248h;
        }

        public String toString() {
            return "Param(desc=" + this.f132241a + ", tag=" + this.f132242b + ", location=" + this.f132243c + ", privacyInfo=" + this.f132244d + ", typo=" + this.f132245e + ", trackingSource=" + this.f132246f + ", isMutualFeed=" + this.f132247g + ", isPostOnStory=" + this.f132248h + ", callback=" + this.f132249i + ", postFeedCallbackId=" + this.f132250j + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132251t;

        /* renamed from: u */
        private /* synthetic */ Object f132252u;

        /* renamed from: v */
        final /* synthetic */ a f132253v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f132254p = new a();

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
            this.f132253v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132253v, continuation);
            bVar.f132252u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:14:0x0023, B:15:0x009f, B:17:0x00a7, B:18:0x00d9, B:20:0x00e1, B:22:0x00eb, B:26:0x002f, B:27:0x008e, B:29:0x0092, B:33:0x003b), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e1 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:14:0x0023, B:15:0x009f, B:17:0x00a7, B:18:0x00d9, B:20:0x00e1, B:22:0x00eb, B:26:0x002f, B:27:0x008e, B:29:0x0092, B:33:0x003b), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[Catch: Exception -> 0x0028, TRY_LEAVE, TryCatch #0 {Exception -> 0x0028, blocks: (B:14:0x0023, B:15:0x009f, B:17:0x00a7, B:18:0x00d9, B:20:0x00e1, B:22:0x00eb, B:26:0x002f, B:27:0x008e, B:29:0x0092, B:33:0x003b), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            C31890dc m142905h;
            Integer num;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f132251t;
            try {
            } catch (Exception e11) {
                AbstractC28358a.b bVar = new AbstractC28358a.b(null, e11);
                this.f132252u = null;
                this.f132251t = 3;
                if (r12.mo12109b(bVar, this) == m142578e) {
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
                    FlowCollector flowCollector2 = (FlowCollector) this.f132252u;
                    AbstractC24862s.m129228b(obj);
                    r12 = flowCollector2;
                    if (this.f132253v.m142907j()) {
                        new C28359b().m101508a(new C28359b.a(this.f132253v.m142899b(), this.f132253v.m142905h(), this.f132253v.m142900c(), this.f132253v.m142902e(), this.f132253v.m142903f(), this.f132253v.m142904g()));
                    }
                    m142905h = this.f132253v.m142905h();
                    if (m142905h == null) {
                        num = AbstractC29094b.m145341c(m142905h.f146495a);
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        C31845ac.m152996J().m153052j(this.f132253v.m142905h().f146495a);
                    }
                    return C24848g0.f119245a;
                }
                FlowCollector flowCollector3 = (FlowCollector) this.f132252u;
                AbstractC24862s.m129228b(obj);
                flowCollector = flowCollector3;
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.f132252u;
                C3000l0 m14243C = C3000l0.m14243C(this.f132253v.m142899b(), this.f132253v.m142903f(), this.f132253v.m142900c(), this.f132253v.m142902e(), this.f132253v.m142905h(), this.f132253v.m142904g(), this.f132253v.m142901d());
                C28362e c28362e = new C28362e();
                C28362e.a aVar = new C28362e.a(m14243C, AbstractC29094b.m145339a(this.f132253v.m142906i()), this.f132253v.m142898a());
                this.f132252u = flowCollector4;
                this.f132251t = 1;
                obj = c28362e.m101498a(aVar, this);
                flowCollector = flowCollector4;
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            r12 = flowCollector;
            if (flow != null) {
                a aVar2 = a.f132254p;
                this.f132252u = flowCollector;
                this.f132251t = 2;
                r12 = flowCollector;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            if (this.f132253v.m142907j()) {
            }
            m142905h = this.f132253v.m142905h();
            if (m142905h == null) {
            }
            if (num != null) {
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
