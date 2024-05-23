package p581vo;

import androidx.work.AbstractC2144f;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23309i;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p581vo.AbstractC28358a;
import p581vo.C28362e;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.i */
/* loaded from: classes4.dex */
public final class C28366i extends AbstractC19377a {

    /* renamed from: vo.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132208a;

        /* renamed from: b */
        private final C3003l3 f132209b;

        /* renamed from: c */
        private final C3063z0 f132210c;

        /* renamed from: d */
        private final PrivacyInfo f132211d;

        /* renamed from: e */
        private final C31890dc f132212e;

        /* renamed from: f */
        private final TrackingSource f132213f;

        /* renamed from: g */
        private final SongInfo f132214g;

        /* renamed from: h */
        private final List f132215h;

        /* renamed from: i */
        private final ProfilePreviewAlbumItem f132216i;

        /* renamed from: j */
        private final ArrayList f132217j;

        /* renamed from: k */
        private final boolean f132218k;

        /* renamed from: l */
        private final InterfaceC18505l f132219l;

        /* renamed from: m */
        private final String f132220m;

        public a(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, List list, ProfilePreviewAlbumItem profilePreviewAlbumItem, ArrayList arrayList, boolean z11, InterfaceC18505l interfaceC18505l, String str2) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            AbstractC19074t.m100208f(list, "allPhotoList");
            AbstractC19074t.m100208f(arrayList, "uploadPhotos");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str2, "postFeedCallbackId");
            this.f132208a = str;
            this.f132209b = c3003l3;
            this.f132210c = c3063z0;
            this.f132211d = privacyInfo;
            this.f132212e = c31890dc;
            this.f132213f = trackingSource;
            this.f132214g = songInfo;
            this.f132215h = list;
            this.f132216i = profilePreviewAlbumItem;
            this.f132217j = arrayList;
            this.f132218k = z11;
            this.f132219l = interfaceC18505l;
            this.f132220m = str2;
        }

        /* renamed from: a */
        public final List m142867a() {
            return this.f132215h;
        }

        /* renamed from: b */
        public final InterfaceC18505l m142868b() {
            return this.f132219l;
        }

        /* renamed from: c */
        public final String m142869c() {
            return this.f132208a;
        }

        /* renamed from: d */
        public C3063z0 m142870d() {
            return this.f132210c;
        }

        /* renamed from: e */
        public String m142871e() {
            return this.f132220m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132208a, aVar.f132208a) && AbstractC19074t.m100204b(this.f132209b, aVar.f132209b) && AbstractC19074t.m100204b(this.f132210c, aVar.f132210c) && AbstractC19074t.m100204b(this.f132211d, aVar.f132211d) && AbstractC19074t.m100204b(this.f132212e, aVar.f132212e) && AbstractC19074t.m100204b(this.f132213f, aVar.f132213f) && AbstractC19074t.m100204b(this.f132214g, aVar.f132214g) && AbstractC19074t.m100204b(this.f132215h, aVar.f132215h) && AbstractC19074t.m100204b(this.f132216i, aVar.f132216i) && AbstractC19074t.m100204b(this.f132217j, aVar.f132217j) && this.f132218k == aVar.f132218k && AbstractC19074t.m100204b(this.f132219l, aVar.f132219l) && AbstractC19074t.m100204b(this.f132220m, aVar.f132220m);
        }

        /* renamed from: f */
        public PrivacyInfo m142872f() {
            return this.f132211d;
        }

        /* renamed from: g */
        public final ProfilePreviewAlbumItem m142873g() {
            return this.f132216i;
        }

        /* renamed from: h */
        public final SongInfo m142874h() {
            return this.f132214g;
        }

        public int hashCode() {
            int hashCode = this.f132208a.hashCode() * 31;
            C3003l3 c3003l3 = this.f132209b;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132210c;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132211d;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f132212e;
            int hashCode5 = (((hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31) + this.f132213f.hashCode()) * 31;
            SongInfo songInfo = this.f132214g;
            int hashCode6 = (((hashCode5 + (songInfo == null ? 0 : songInfo.hashCode())) * 31) + this.f132215h.hashCode()) * 31;
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f132216i;
            return ((((((((hashCode6 + (profilePreviewAlbumItem != null ? profilePreviewAlbumItem.hashCode() : 0)) * 31) + this.f132217j.hashCode()) * 31) + AbstractC2144f.m11520a(this.f132218k)) * 31) + this.f132219l.hashCode()) * 31) + this.f132220m.hashCode();
        }

        /* renamed from: i */
        public C3003l3 m142875i() {
            return this.f132209b;
        }

        /* renamed from: j */
        public TrackingSource m142876j() {
            return this.f132213f;
        }

        /* renamed from: k */
        public C31890dc m142877k() {
            return this.f132212e;
        }

        /* renamed from: l */
        public final ArrayList m142878l() {
            return this.f132217j;
        }

        /* renamed from: m */
        public boolean m142879m() {
            return this.f132218k;
        }

        public String toString() {
            return "Param(desc=" + this.f132208a + ", tag=" + this.f132209b + ", location=" + this.f132210c + ", privacyInfo=" + this.f132211d + ", typo=" + this.f132212e + ", trackingSource=" + this.f132213f + ", songInfo=" + this.f132214g + ", allPhotoList=" + this.f132215h + ", profilePreviewAlbumItem=" + this.f132216i + ", uploadPhotos=" + this.f132217j + ", isMutualFeed=" + this.f132218k + ", callback=" + this.f132219l + ", postFeedCallbackId=" + this.f132220m + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132221t;

        /* renamed from: u */
        private /* synthetic */ Object f132222u;

        /* renamed from: v */
        final /* synthetic */ a f132223v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f132224q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Begin UPLOAD_FEED_SINGLE_PHOTO_USE_CASE";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33017b implements FlowCollector {

            /* renamed from: p */
            public static final C33017b f132225p = new C33017b();

            C33017b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.i$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f132226q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "End UPLOAD_FEED_SINGLE_PHOTO_USE_CASE";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f132223v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f132223v, continuation);
            bVar.f132222u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x011b A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            long j11;
            Object m101498a;
            FlowCollector flowCollector2;
            AbstractC28358a.b bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132221t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f132222u;
                    try {
                        AbstractC24862s.m129228b(obj);
                        C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f132226q);
                    } catch (Exception e11) {
                        e = e11;
                        bVar = new AbstractC28358a.b(null, e);
                        this.f132222u = null;
                        this.f132221t = 3;
                        if (flowCollector.mo12109b(bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector2 = (FlowCollector) this.f132222u;
                try {
                    AbstractC24862s.m129228b(obj);
                    m101498a = obj;
                } catch (Exception e12) {
                    e = e12;
                    flowCollector = flowCollector2;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f132222u = null;
                    this.f132221t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f132222u;
                try {
                    C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", a.f132224q);
                    ProfilePreviewAlbumItem m142873g = this.f132223v.m142873g();
                    if (m142873g != null) {
                        j11 = m142873g.getId();
                    } else {
                        j11 = 0;
                    }
                    long j12 = j11;
                    C2949b m108833s = AbstractC20826v0.m108833s(this.f132223v.m142873g());
                    Object obj2 = this.f132223v.m142878l().get(0);
                    AbstractC19074t.m100207e(obj2, "get(...)");
                    MediaItem mediaItem = (MediaItem) obj2;
                    mediaItem.m41135Z0(this.f132223v.m142867a().indexOf(mediaItem));
                    C3000l0 m14241A = C3000l0.m14241A(this.f132223v.m142869c(), mediaItem, this.f132223v.m142875i(), this.f132223v.m142870d(), this.f132223v.m142872f(), this.f132223v.m142877k(), this.f132223v.m142876j(), j12, m108833s, this.f132223v.m142874h(), this.f132223v.m142871e());
                    AbstractC23309i.m122403sq(System.currentTimeMillis());
                    C28362e c28362e = new C28362e();
                    C28362e.a aVar = new C28362e.a(m14241A, AbstractC29094b.m145339a(this.f132223v.m142879m()), this.f132223v.m142868b());
                    this.f132222u = flowCollector3;
                    this.f132221t = 1;
                    m101498a = c28362e.m101498a(aVar, this);
                    if (m101498a == m142578e) {
                        return m142578e;
                    }
                    flowCollector2 = flowCollector3;
                } catch (Exception e13) {
                    e = e13;
                    flowCollector = flowCollector3;
                    bVar = new AbstractC28358a.b(null, e);
                    this.f132222u = null;
                    this.f132221t = 3;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                C33017b c33017b = C33017b.f132225p;
                this.f132222u = flowCollector2;
                this.f132221t = 2;
                if (flow.mo97893a(c33017b, this) == m142578e) {
                    return m142578e;
                }
            }
            flowCollector = flowCollector2;
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f132226q);
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
