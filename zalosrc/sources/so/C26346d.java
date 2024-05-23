package so;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23309i;
import p509sp.C26359h;
import p581vo.AbstractC28358a;
import p581vo.C28363f;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: so.d */
/* loaded from: classes4.dex */
public final class C26346d extends AbstractC19377a {

    /* renamed from: so.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125119a;

        /* renamed from: b */
        private final MediaItem f125120b;

        /* renamed from: c */
        private final C3003l3 f125121c;

        /* renamed from: d */
        private final C3063z0 f125122d;

        /* renamed from: e */
        private final PrivacyInfo f125123e;

        /* renamed from: f */
        private final C31890dc f125124f;

        /* renamed from: g */
        private final TrackingSource f125125g;

        /* renamed from: h */
        private final long f125126h;

        /* renamed from: i */
        private final C2949b f125127i;

        /* renamed from: j */
        private final SongInfo f125128j;

        /* renamed from: k */
        private final boolean f125129k;

        /* renamed from: l */
        private final C3000l0 f125130l;

        /* renamed from: m */
        private final boolean f125131m;

        /* renamed from: n */
        private final String f125132n;

        /* renamed from: o */
        private final InterfaceC18505l f125133o;

        public a(String str, MediaItem mediaItem, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z11, C3000l0 c3000l0, boolean z12, String str2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(mediaItem, "photo");
            AbstractC19074t.m100208f(str2, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125119a = str;
            this.f125120b = mediaItem;
            this.f125121c = c3003l3;
            this.f125122d = c3063z0;
            this.f125123e = privacyInfo;
            this.f125124f = c31890dc;
            this.f125125g = trackingSource;
            this.f125126h = j11;
            this.f125127i = c2949b;
            this.f125128j = songInfo;
            this.f125129k = z11;
            this.f125130l = c3000l0;
            this.f125131m = z12;
            this.f125132n = str2;
            this.f125133o = interfaceC18505l;
        }

        /* renamed from: a */
        public final long m135605a() {
            return this.f125126h;
        }

        /* renamed from: b */
        public final C2949b m135606b() {
            return this.f125127i;
        }

        /* renamed from: c */
        public final InterfaceC18505l m135607c() {
            return this.f125133o;
        }

        /* renamed from: d */
        public final String m135608d() {
            return this.f125119a;
        }

        /* renamed from: e */
        public final String m135609e() {
            return this.f125132n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125119a, aVar.f125119a) && AbstractC19074t.m100204b(this.f125120b, aVar.f125120b) && AbstractC19074t.m100204b(this.f125121c, aVar.f125121c) && AbstractC19074t.m100204b(this.f125122d, aVar.f125122d) && AbstractC19074t.m100204b(this.f125123e, aVar.f125123e) && AbstractC19074t.m100204b(this.f125124f, aVar.f125124f) && AbstractC19074t.m100204b(this.f125125g, aVar.f125125g) && this.f125126h == aVar.f125126h && AbstractC19074t.m100204b(this.f125127i, aVar.f125127i) && AbstractC19074t.m100204b(this.f125128j, aVar.f125128j) && this.f125129k == aVar.f125129k && AbstractC19074t.m100204b(this.f125130l, aVar.f125130l) && this.f125131m == aVar.f125131m && AbstractC19074t.m100204b(this.f125132n, aVar.f125132n) && AbstractC19074t.m100204b(this.f125133o, aVar.f125133o);
        }

        /* renamed from: f */
        public final C3063z0 m135610f() {
            return this.f125122d;
        }

        /* renamed from: g */
        public final C3000l0 m135611g() {
            return this.f125130l;
        }

        /* renamed from: h */
        public final MediaItem m135612h() {
            return this.f125120b;
        }

        public int hashCode() {
            int hashCode = ((this.f125119a.hashCode() * 31) + this.f125120b.hashCode()) * 31;
            C3003l3 c3003l3 = this.f125121c;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125122d;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125123e;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f125124f;
            int hashCode5 = (hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125125g;
            int hashCode6 = (((hashCode5 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f125126h)) * 31;
            C2949b c2949b = this.f125127i;
            int hashCode7 = (hashCode6 + (c2949b == null ? 0 : c2949b.hashCode())) * 31;
            SongInfo songInfo = this.f125128j;
            int hashCode8 = (((hashCode7 + (songInfo == null ? 0 : songInfo.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125129k)) * 31;
            C3000l0 c3000l0 = this.f125130l;
            return ((((((hashCode8 + (c3000l0 != null ? c3000l0.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f125131m)) * 31) + this.f125132n.hashCode()) * 31) + this.f125133o.hashCode();
        }

        /* renamed from: i */
        public final PrivacyInfo m135613i() {
            return this.f125123e;
        }

        /* renamed from: j */
        public final SongInfo m135614j() {
            return this.f125128j;
        }

        /* renamed from: k */
        public final C3003l3 m135615k() {
            return this.f125121c;
        }

        /* renamed from: l */
        public final TrackingSource m135616l() {
            return this.f125125g;
        }

        /* renamed from: m */
        public final C31890dc m135617m() {
            return this.f125124f;
        }

        /* renamed from: n */
        public final boolean m135618n() {
            return this.f125131m;
        }

        /* renamed from: o */
        public final boolean m135619o() {
            return this.f125129k;
        }

        public String toString() {
            return "Param(desc=" + this.f125119a + ", photo=" + this.f125120b + ", tag=" + this.f125121c + ", location=" + this.f125122d + ", privacyInfo=" + this.f125123e + ", typo=" + this.f125124f + ", trackingSource=" + this.f125125g + ", albumId=" + this.f125126h + ", albumInfo=" + this.f125127i + ", songInfo=" + this.f125128j + ", isMutualFeed=" + this.f125129k + ", oldAsyncFeed=" + this.f125130l + ", isEmptyPhotoOrVideo=" + this.f125131m + ", feedId=" + this.f125132n + ", callback=" + this.f125133o + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125134t;

        /* renamed from: u */
        private /* synthetic */ Object f125135u;

        /* renamed from: v */
        final /* synthetic */ a f125136v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.d$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f125137q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Begin EDIT_FEED_SINGLE_PHOTO_USE_CASE";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32971b implements FlowCollector {

            /* renamed from: p */
            public static final C32971b f125138p = new C32971b();

            C32971b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.d$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f125139q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "End EDIT_FEED_SINGLE_PHOTO_USE_CASE";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f125136v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f125136v, continuation);
            bVar.f125135u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0119 A[RETURN] */
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
            int i11 = this.f125134t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f125135u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f125139q);
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                        bVar = new AbstractC28358a.b(null, e);
                        this.f125135u = null;
                        this.f125134t = 3;
                        if (flowCollector.mo12109b(bVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector2 = (FlowCollector) this.f125135u;
                try {
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                } catch (Exception e12) {
                    e = e12;
                    flowCollector = flowCollector2;
                    e.printStackTrace();
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125135u = null;
                    this.f125134t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f125135u;
                try {
                    C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", a.f125137q);
                    C3000l0 m14241A = C3000l0.m14241A(this.f125136v.m135608d(), this.f125136v.m135612h(), this.f125136v.m135615k(), this.f125136v.m135610f(), this.f125136v.m135613i(), this.f125136v.m135617m(), this.f125136v.m135616l(), this.f125136v.m135605a(), this.f125136v.m135606b(), this.f125136v.m135614j(), "");
                    m14241A.f11895q = this.f125136v.m135609e();
                    m14241A.m14322a0().f12057p = this.f125136v.m135609e();
                    m14241A.m14322a0().m14534x0(true);
                    AbstractC23309i.m122403sq(System.currentTimeMillis());
                    C28363f c28363f = new C28363f();
                    C3000l0 m135611g = this.f125136v.m135611g();
                    boolean m135618n = this.f125136v.m135618n();
                    boolean m135619o = this.f125136v.m135619o();
                    C28363f.a aVar = new C28363f.a(m135611g, m14241A, AbstractC29094b.m145339a(m135619o), m135618n, this.f125136v.m135607c());
                    this.f125135u = flowCollector3;
                    this.f125134t = 1;
                    m101498a = c28363f.m101498a(aVar, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector3;
                } catch (Exception e13) {
                    e = e13;
                    flowCollector = flowCollector3;
                    e.printStackTrace();
                    bVar = new AbstractC28358a.b(null, e);
                    this.f125135u = null;
                    this.f125134t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                C32971b c32971b = C32971b.f125138p;
                this.f125135u = flowCollector2;
                this.f125134t = 2;
                if (flow.mo97893a(c32971b, this) == m142578e) {
                    return m142578e;
                }
            }
            flowCollector = flowCollector2;
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f125139q);
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
