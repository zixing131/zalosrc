package p581vo;

import androidx.work.AbstractC2144f;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3023p3;
import bo.C3063z0;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23309i;
import p458qr.AbstractC25468a;
import p581vo.AbstractC28358a;
import p581vo.C28362e;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.g */
/* loaded from: classes4.dex */
public final class C28364g extends AbstractC19377a {

    /* renamed from: vo.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132173a;

        /* renamed from: b */
        private final LinkAttachment f132174b;

        /* renamed from: c */
        private final C3023p3 f132175c;

        /* renamed from: d */
        private final C3003l3 f132176d;

        /* renamed from: e */
        private final C3063z0 f132177e;

        /* renamed from: f */
        private final PrivacyInfo f132178f;

        /* renamed from: g */
        private final C31890dc f132179g;

        /* renamed from: h */
        private final TrackingSource f132180h;

        /* renamed from: i */
        private final boolean f132181i;

        /* renamed from: j */
        private final InterfaceC18505l f132182j;

        /* renamed from: k */
        private final String f132183k;

        public a(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, InterfaceC18505l interfaceC18505l, String str2) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str2, "postFeedCallbackId");
            this.f132173a = str;
            this.f132174b = linkAttachment;
            this.f132175c = c3023p3;
            this.f132176d = c3003l3;
            this.f132177e = c3063z0;
            this.f132178f = privacyInfo;
            this.f132179g = c31890dc;
            this.f132180h = trackingSource;
            this.f132181i = z11;
            this.f132182j = interfaceC18505l;
            this.f132183k = str2;
        }

        /* renamed from: a */
        public final InterfaceC18505l m142833a() {
            return this.f132182j;
        }

        /* renamed from: b */
        public final String m142834b() {
            return this.f132173a;
        }

        /* renamed from: c */
        public final LinkAttachment m142835c() {
            return this.f132174b;
        }

        /* renamed from: d */
        public C3063z0 m142836d() {
            return this.f132177e;
        }

        /* renamed from: e */
        public String m142837e() {
            return this.f132183k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132173a, aVar.f132173a) && AbstractC19074t.m100204b(this.f132174b, aVar.f132174b) && AbstractC19074t.m100204b(this.f132175c, aVar.f132175c) && AbstractC19074t.m100204b(this.f132176d, aVar.f132176d) && AbstractC19074t.m100204b(this.f132177e, aVar.f132177e) && AbstractC19074t.m100204b(this.f132178f, aVar.f132178f) && AbstractC19074t.m100204b(this.f132179g, aVar.f132179g) && AbstractC19074t.m100204b(this.f132180h, aVar.f132180h) && this.f132181i == aVar.f132181i && AbstractC19074t.m100204b(this.f132182j, aVar.f132182j) && AbstractC19074t.m100204b(this.f132183k, aVar.f132183k);
        }

        /* renamed from: f */
        public PrivacyInfo m142838f() {
            return this.f132178f;
        }

        /* renamed from: g */
        public C3003l3 m142839g() {
            return this.f132176d;
        }

        /* renamed from: h */
        public TrackingSource m142840h() {
            return this.f132180h;
        }

        public int hashCode() {
            int hashCode = this.f132173a.hashCode() * 31;
            LinkAttachment linkAttachment = this.f132174b;
            int hashCode2 = (hashCode + (linkAttachment == null ? 0 : linkAttachment.hashCode())) * 31;
            C3023p3 c3023p3 = this.f132175c;
            int hashCode3 = (hashCode2 + (c3023p3 == null ? 0 : c3023p3.hashCode())) * 31;
            C3003l3 c3003l3 = this.f132176d;
            int hashCode4 = (hashCode3 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132177e;
            int hashCode5 = (hashCode4 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132178f;
            int hashCode6 = (hashCode5 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f132179g;
            int hashCode7 = (hashCode6 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f132180h;
            return ((((((hashCode7 + (trackingSource != null ? trackingSource.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f132181i)) * 31) + this.f132182j.hashCode()) * 31) + this.f132183k.hashCode();
        }

        /* renamed from: i */
        public C31890dc m142841i() {
            return this.f132179g;
        }

        /* renamed from: j */
        public final C3023p3 m142842j() {
            return this.f132175c;
        }

        /* renamed from: k */
        public boolean m142843k() {
            return this.f132181i;
        }

        public String toString() {
            return "Param(desc=" + this.f132173a + ", linkAttachment=" + this.f132174b + ", zShortVideoInfo=" + this.f132175c + ", tag=" + this.f132176d + ", location=" + this.f132177e + ", privacyInfo=" + this.f132178f + ", typo=" + this.f132179g + ", trackingSource=" + this.f132180h + ", isMutualFeed=" + this.f132181i + ", callback=" + this.f132182j + ", postFeedCallbackId=" + this.f132183k + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132184t;

        /* renamed from: u */
        private /* synthetic */ Object f132185u;

        /* renamed from: v */
        final /* synthetic */ a f132186v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.g$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f132187p = new a();

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
            this.f132186v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132186v, continuation);
            bVar.f132185u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ed A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:18:0x0036, B:20:0x00e9, B:22:0x00ed), top: B:17:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010c A[RETURN] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v5 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC28358a.b bVar;
            Object m101498a;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132184t;
            ?? r42 = 3;
            try {
            } catch (Exception e11) {
                e = e11;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f132185u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m101498a = obj;
                        flow = (Flow) m101498a;
                        if (flow != null) {
                            a aVar = a.f132187p;
                            this.f132185u = flowCollector;
                            this.f132184t = 3;
                            if (flow.mo97893a(aVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r42 = flowCollector;
                        e.printStackTrace();
                        bVar = new AbstractC28358a.b(null, e);
                        this.f132185u = null;
                        this.f132184t = 4;
                        if (r42.mo12109b(bVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.f132185u;
            try {
            } catch (Exception e13) {
                e = e13;
                r42 = flowCollector2;
                e.printStackTrace();
                bVar = new AbstractC28358a.b(null, e);
                this.f132185u = null;
                this.f132184t = 4;
                if (r42.mo12109b(bVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            if (this.f132186v.m142835c() == null) {
                AbstractC28358a.b bVar2 = new AbstractC28358a.b(null, new NullPointerException());
                this.f132185u = flowCollector2;
                this.f132184t = 1;
                if (flowCollector2.mo12109b(bVar2, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            AbstractC20826v0.m108805e(this.f132186v.m142835c().f42624p);
            AbstractC23309i.m122403sq(System.currentTimeMillis());
            C3000l0 m14278x = C3000l0.m14278x(this.f132186v.m142834b(), this.f132186v.m142835c(), this.f132186v.m142842j(), this.f132186v.m142839g(), this.f132186v.m142836d(), this.f132186v.m142838f(), this.f132186v.m142841i(), this.f132186v.m142840h(), this.f132186v.m142837e());
            C28362e c28362e = new C28362e();
            C28362e.a aVar2 = new C28362e.a(m14278x, AbstractC29094b.m145339a(this.f132186v.m142843k()), this.f132186v.m142833a());
            this.f132185u = flowCollector2;
            this.f132184t = 2;
            m101498a = c28362e.m101498a(aVar2, this);
            if (m101498a == m142578e) {
                return m142578e;
            }
            flowCollector = flowCollector2;
            flow = (Flow) m101498a;
            if (flow != null) {
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
