package so;

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
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.a */
/* loaded from: classes4.dex */
public final class C26343a extends AbstractC19377a {

    /* renamed from: so.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125060a;

        /* renamed from: b */
        private final LinkAttachment f125061b;

        /* renamed from: c */
        private final C3023p3 f125062c;

        /* renamed from: d */
        private final C3003l3 f125063d;

        /* renamed from: e */
        private final C3063z0 f125064e;

        /* renamed from: f */
        private final PrivacyInfo f125065f;

        /* renamed from: g */
        private final C31890dc f125066g;

        /* renamed from: h */
        private final TrackingSource f125067h;

        /* renamed from: i */
        private final boolean f125068i;

        /* renamed from: j */
        private final C3000l0 f125069j;

        /* renamed from: k */
        private final boolean f125070k;

        /* renamed from: l */
        private final String f125071l;

        /* renamed from: m */
        private final InterfaceC18505l f125072m;

        public a(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str2, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125060a = str;
            this.f125061b = linkAttachment;
            this.f125062c = c3023p3;
            this.f125063d = c3003l3;
            this.f125064e = c3063z0;
            this.f125065f = privacyInfo;
            this.f125066g = c31890dc;
            this.f125067h = trackingSource;
            this.f125068i = z11;
            this.f125069j = c3000l0;
            this.f125070k = z12;
            this.f125071l = str2;
            this.f125072m = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m135547a() {
            return this.f125072m;
        }

        /* renamed from: b */
        public final String m135548b() {
            return this.f125060a;
        }

        /* renamed from: c */
        public final String m135549c() {
            return this.f125071l;
        }

        /* renamed from: d */
        public final LinkAttachment m135550d() {
            return this.f125061b;
        }

        /* renamed from: e */
        public final C3063z0 m135551e() {
            return this.f125064e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125060a, aVar.f125060a) && AbstractC19074t.m100204b(this.f125061b, aVar.f125061b) && AbstractC19074t.m100204b(this.f125062c, aVar.f125062c) && AbstractC19074t.m100204b(this.f125063d, aVar.f125063d) && AbstractC19074t.m100204b(this.f125064e, aVar.f125064e) && AbstractC19074t.m100204b(this.f125065f, aVar.f125065f) && AbstractC19074t.m100204b(this.f125066g, aVar.f125066g) && AbstractC19074t.m100204b(this.f125067h, aVar.f125067h) && this.f125068i == aVar.f125068i && AbstractC19074t.m100204b(this.f125069j, aVar.f125069j) && this.f125070k == aVar.f125070k && AbstractC19074t.m100204b(this.f125071l, aVar.f125071l) && AbstractC19074t.m100204b(this.f125072m, aVar.f125072m);
        }

        /* renamed from: f */
        public final C3000l0 m135552f() {
            return this.f125069j;
        }

        /* renamed from: g */
        public final PrivacyInfo m135553g() {
            return this.f125065f;
        }

        /* renamed from: h */
        public final C3003l3 m135554h() {
            return this.f125063d;
        }

        public int hashCode() {
            int hashCode = this.f125060a.hashCode() * 31;
            LinkAttachment linkAttachment = this.f125061b;
            int hashCode2 = (hashCode + (linkAttachment == null ? 0 : linkAttachment.hashCode())) * 31;
            C3023p3 c3023p3 = this.f125062c;
            int hashCode3 = (hashCode2 + (c3023p3 == null ? 0 : c3023p3.hashCode())) * 31;
            C3003l3 c3003l3 = this.f125063d;
            int hashCode4 = (hashCode3 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125064e;
            int hashCode5 = (hashCode4 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125065f;
            int hashCode6 = (hashCode5 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f125066g;
            int hashCode7 = (hashCode6 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125067h;
            int hashCode8 = (((hashCode7 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125068i)) * 31;
            C3000l0 c3000l0 = this.f125069j;
            return ((((((hashCode8 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125070k)) * 31) + this.f125071l.hashCode()) * 31) + this.f125072m.hashCode();
        }

        /* renamed from: i */
        public final TrackingSource m135555i() {
            return this.f125067h;
        }

        /* renamed from: j */
        public final C31890dc m135556j() {
            return this.f125066g;
        }

        /* renamed from: k */
        public final C3023p3 m135557k() {
            return this.f125062c;
        }

        /* renamed from: l */
        public final boolean m135558l() {
            return this.f125070k;
        }

        /* renamed from: m */
        public final boolean m135559m() {
            return this.f125068i;
        }

        public String toString() {
            return "Param(desc=" + this.f125060a + ", linkAttachment=" + this.f125061b + ", zShortVideoInfo=" + this.f125062c + ", tag=" + this.f125063d + ", location=" + this.f125064e + ", privacyInfo=" + this.f125065f + ", typo=" + this.f125066g + ", trackingSource=" + this.f125067h + ", isMutualFeed=" + this.f125068i + ", oldAsyncFeed=" + this.f125069j + ", isEmptyPhotoOrVideo=" + this.f125070k + ", feedId=" + this.f125071l + ", callback=" + this.f125072m + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125073t;

        /* renamed from: u */
        private /* synthetic */ Object f125074u;

        /* renamed from: v */
        final /* synthetic */ a f125075v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f125076p = new a();

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
            this.f125075v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125075v, continuation);
            bVar.f125074u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0133 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0114 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:24:0x0036, B:26:0x0110, B:28:0x0114), top: B:23:0x0036 }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC28358a.b bVar;
            FlowCollector flowCollector2;
            String str;
            Object m101498a;
            FlowCollector flowCollector3;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125073t;
            try {
            } catch (Exception e11) {
                e = e11;
                flowCollector = flowCollector2;
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
                            flowCollector = (FlowCollector) this.f125074u;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e12) {
                                e = e12;
                                e.printStackTrace();
                                bVar = new AbstractC28358a.b(null, e);
                                this.f125074u = null;
                                this.f125073t = 4;
                                if (flowCollector.mo12109b(bVar, this) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector3 = (FlowCollector) this.f125074u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m101498a = obj;
                        flow = (Flow) m101498a;
                        if (flow != null) {
                            a aVar = a.f125076p;
                            this.f125074u = flowCollector3;
                            this.f125073t = 3;
                            if (flow.mo97893a(aVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        flowCollector = flowCollector3;
                        e.printStackTrace();
                        bVar = new AbstractC28358a.b(null, e);
                        this.f125074u = null;
                        this.f125073t = 4;
                        if (flowCollector.mo12109b(bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector2 = (FlowCollector) this.f125074u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector2 = (FlowCollector) this.f125074u;
                if (this.f125075v.m135550d() == null) {
                    AbstractC28358a.b bVar2 = new AbstractC28358a.b(null, new NullPointerException());
                    this.f125074u = flowCollector2;
                    this.f125073t = 1;
                    if (flowCollector2.mo12109b(bVar2, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            LinkAttachment m135550d = this.f125075v.m135550d();
            if (m135550d != null) {
                str = m135550d.f42624p;
            } else {
                str = null;
            }
            AbstractC20826v0.m108805e(str);
            AbstractC23309i.m122403sq(System.currentTimeMillis());
            C3000l0 m14278x = C3000l0.m14278x(this.f125075v.m135548b(), this.f125075v.m135550d(), this.f125075v.m135557k(), this.f125075v.m135554h(), this.f125075v.m135551e(), this.f125075v.m135553g(), this.f125075v.m135556j(), this.f125075v.m135555i(), "");
            m14278x.f11895q = this.f125075v.m135549c();
            m14278x.m14322a0().f12057p = this.f125075v.m135549c();
            m14278x.m14322a0().m14534x0(true);
            C28363f c28363f = new C28363f();
            C28363f.a aVar2 = new C28363f.a(this.f125075v.m135552f(), m14278x, AbstractC29094b.m145339a(this.f125075v.m135559m()), this.f125075v.m135558l(), this.f125075v.m135547a());
            this.f125074u = flowCollector2;
            this.f125073t = 2;
            m101498a = c28363f.m101498a(aVar2, this);
            if (m101498a == m142578e) {
                return m142578e;
            }
            flowCollector3 = flowCollector2;
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
