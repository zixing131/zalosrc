package so;

import androidx.work.AbstractC2144f;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
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
import p559uv.C27373c;
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.g */
/* loaded from: classes4.dex */
public final class C26349g extends AbstractC19377a {

    /* renamed from: so.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125171a;

        /* renamed from: b */
        private final C27373c f125172b;

        /* renamed from: c */
        private final C3003l3 f125173c;

        /* renamed from: d */
        private final C3063z0 f125174d;

        /* renamed from: e */
        private final PrivacyInfo f125175e;

        /* renamed from: f */
        private final String f125176f;

        /* renamed from: g */
        private final C31890dc f125177g;

        /* renamed from: h */
        private final TrackingSource f125178h;

        /* renamed from: i */
        private final ProfilePreviewAlbumItem f125179i;

        /* renamed from: j */
        private final boolean f125180j;

        /* renamed from: k */
        private final C3000l0 f125181k;

        /* renamed from: l */
        private final boolean f125182l;

        /* renamed from: m */
        private final String f125183m;

        /* renamed from: n */
        private final InterfaceC18505l f125184n;

        public a(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, C3000l0 c3000l0, boolean z12, String str3, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(str3, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125171a = str;
            this.f125172b = c27373c;
            this.f125173c = c3003l3;
            this.f125174d = c3063z0;
            this.f125175e = privacyInfo;
            this.f125176f = str2;
            this.f125177g = c31890dc;
            this.f125178h = trackingSource;
            this.f125179i = profilePreviewAlbumItem;
            this.f125180j = z11;
            this.f125181k = c3000l0;
            this.f125182l = z12;
            this.f125183m = str3;
            this.f125184n = interfaceC18505l;
        }

        /* renamed from: a */
        public final InterfaceC18505l m135654a() {
            return this.f125184n;
        }

        /* renamed from: b */
        public final String m135655b() {
            return this.f125176f;
        }

        /* renamed from: c */
        public final String m135656c() {
            return this.f125171a;
        }

        /* renamed from: d */
        public final String m135657d() {
            return this.f125183m;
        }

        /* renamed from: e */
        public final C3063z0 m135658e() {
            return this.f125174d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125171a, aVar.f125171a) && AbstractC19074t.m100204b(this.f125172b, aVar.f125172b) && AbstractC19074t.m100204b(this.f125173c, aVar.f125173c) && AbstractC19074t.m100204b(this.f125174d, aVar.f125174d) && AbstractC19074t.m100204b(this.f125175e, aVar.f125175e) && AbstractC19074t.m100204b(this.f125176f, aVar.f125176f) && AbstractC19074t.m100204b(this.f125177g, aVar.f125177g) && AbstractC19074t.m100204b(this.f125178h, aVar.f125178h) && AbstractC19074t.m100204b(this.f125179i, aVar.f125179i) && this.f125180j == aVar.f125180j && AbstractC19074t.m100204b(this.f125181k, aVar.f125181k) && this.f125182l == aVar.f125182l && AbstractC19074t.m100204b(this.f125183m, aVar.f125183m) && AbstractC19074t.m100204b(this.f125184n, aVar.f125184n);
        }

        /* renamed from: f */
        public final C3000l0 m135659f() {
            return this.f125181k;
        }

        /* renamed from: g */
        public final PrivacyInfo m135660g() {
            return this.f125175e;
        }

        /* renamed from: h */
        public final ProfilePreviewAlbumItem m135661h() {
            return this.f125179i;
        }

        public int hashCode() {
            int hashCode = this.f125171a.hashCode() * 31;
            C27373c c27373c = this.f125172b;
            int hashCode2 = (hashCode + (c27373c == null ? 0 : c27373c.hashCode())) * 31;
            C3003l3 c3003l3 = this.f125173c;
            int hashCode3 = (hashCode2 + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125174d;
            int hashCode4 = (hashCode3 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125175e;
            int hashCode5 = (hashCode4 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            String str = this.f125176f;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            C31890dc c31890dc = this.f125177g;
            int hashCode7 = (hashCode6 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125178h;
            int hashCode8 = (hashCode7 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31;
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f125179i;
            int hashCode9 = (((hashCode8 + (profilePreviewAlbumItem == null ? 0 : profilePreviewAlbumItem.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125180j)) * 31;
            C3000l0 c3000l0 = this.f125181k;
            return ((((((hashCode9 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125182l)) * 31) + this.f125183m.hashCode()) * 31) + this.f125184n.hashCode();
        }

        /* renamed from: i */
        public final C3003l3 m135662i() {
            return this.f125173c;
        }

        /* renamed from: j */
        public final TrackingSource m135663j() {
            return this.f125178h;
        }

        /* renamed from: k */
        public final C31890dc m135664k() {
            return this.f125177g;
        }

        /* renamed from: l */
        public final C27373c m135665l() {
            return this.f125172b;
        }

        /* renamed from: m */
        public final boolean m135666m() {
            return this.f125182l;
        }

        /* renamed from: n */
        public final boolean m135667n() {
            return this.f125180j;
        }

        public String toString() {
            return "Param(desc=" + this.f125171a + ", videoInfo=" + this.f125172b + ", tag=" + this.f125173c + ", location=" + this.f125174d + ", privacy=" + this.f125175e + ", cameraLog=" + this.f125176f + ", typo=" + this.f125177g + ", trackingSource=" + this.f125178h + ", profilePreviewAlbumItem=" + this.f125179i + ", isMutualFeed=" + this.f125180j + ", oldAsyncFeed=" + this.f125181k + ", isEmptyPhotoOrVideo=" + this.f125182l + ", feedId=" + this.f125183m + ", callback=" + this.f125184n + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125185t;

        /* renamed from: u */
        private /* synthetic */ Object f125186u;

        /* renamed from: v */
        final /* synthetic */ a f125187v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.g$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            public static final a f125188p = new a();

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
            this.f125187v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125187v, continuation);
            bVar.f125186u = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0122 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:18:0x0036, B:20:0x011e, B:22:0x0122), top: B:17:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[RETURN] */
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
            long j11;
            Object m101498a;
            FlowCollector flowCollector;
            Flow flow;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125185t;
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
                    flowCollector = (FlowCollector) this.f125186u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m101498a = obj;
                        flow = (Flow) m101498a;
                        if (flow != null) {
                            a aVar = a.f125188p;
                            this.f125186u = flowCollector;
                            this.f125185t = 3;
                            if (flow.mo97893a(aVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r42 = flowCollector;
                        e.printStackTrace();
                        bVar = new AbstractC28358a.b(null, e);
                        this.f125186u = null;
                        this.f125185t = 4;
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
            FlowCollector flowCollector2 = (FlowCollector) this.f125186u;
            try {
            } catch (Exception e13) {
                e = e13;
                r42 = flowCollector2;
                e.printStackTrace();
                bVar = new AbstractC28358a.b(null, e);
                this.f125186u = null;
                this.f125185t = 4;
                if (r42.mo12109b(bVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            if (this.f125187v.m135665l() == null) {
                AbstractC28358a.b bVar2 = new AbstractC28358a.b(null, new NullPointerException());
                this.f125186u = flowCollector2;
                this.f125185t = 1;
                if (flowCollector2.mo12109b(bVar2, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            C2949b m108833s = AbstractC20826v0.m108833s(this.f125187v.m135661h());
            String m135656c = this.f125187v.m135656c();
            C27373c m135665l = this.f125187v.m135665l();
            C3003l3 m135662i = this.f125187v.m135662i();
            C3063z0 m135658e = this.f125187v.m135658e();
            PrivacyInfo m135660g = this.f125187v.m135660g();
            String m135655b = this.f125187v.m135655b();
            C31890dc m135664k = this.f125187v.m135664k();
            TrackingSource m135663j = this.f125187v.m135663j();
            ProfilePreviewAlbumItem m135661h = this.f125187v.m135661h();
            if (m135661h != null) {
                j11 = m135661h.getId();
            } else {
                j11 = 0;
            }
            C3000l0 m14244D = C3000l0.m14244D(m135656c, m135665l, m135662i, m135658e, m135660g, m135655b, m135664k, m135663j, j11, m108833s, "");
            m14244D.f11895q = this.f125187v.m135657d();
            m14244D.m14322a0().f12057p = this.f125187v.m135657d();
            m14244D.m14322a0().m14534x0(true);
            AbstractC23309i.m122403sq(System.currentTimeMillis());
            C28363f c28363f = new C28363f();
            C3000l0 m135659f = this.f125187v.m135659f();
            boolean m135666m = this.f125187v.m135666m();
            boolean m135667n = this.f125187v.m135667n();
            C28363f.a aVar2 = new C28363f.a(m135659f, m14244D, AbstractC29094b.m145339a(m135667n), m135666m, this.f125187v.m135654a());
            this.f125186u = flowCollector2;
            this.f125185t = 2;
            m101498a = c28363f.m101498a(aVar2, this);
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
