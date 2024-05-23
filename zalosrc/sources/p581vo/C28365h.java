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
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p107dq.C18049e;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23309i;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p581vo.C28362e;
import p716zh.C31890dc;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ro.AbstractC25936a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: vo.h */
/* loaded from: classes4.dex */
public final class C28365h extends AbstractC19377a {

    /* renamed from: vo.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC25936a {

        /* renamed from: a */
        private final String f132188a;

        /* renamed from: b */
        private final ArrayList f132189b;

        /* renamed from: c */
        private final boolean f132190c;

        /* renamed from: d */
        private final C3003l3 f132191d;

        /* renamed from: e */
        private final C3063z0 f132192e;

        /* renamed from: f */
        private final PrivacyInfo f132193f;

        /* renamed from: g */
        private final C31890dc f132194g;

        /* renamed from: h */
        private final TrackingSource f132195h;

        /* renamed from: i */
        private final SongInfo f132196i;

        /* renamed from: j */
        private final ProfilePreviewAlbumItem f132197j;

        /* renamed from: k */
        private final List f132198k;

        /* renamed from: l */
        private final boolean f132199l;

        /* renamed from: m */
        private final C18049e f132200m;

        /* renamed from: n */
        private final InterfaceC18505l f132201n;

        /* renamed from: o */
        private final String f132202o;

        public a(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, ProfilePreviewAlbumItem profilePreviewAlbumItem, List list, boolean z12, C18049e c18049e, InterfaceC18505l interfaceC18505l, String str2) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(arrayList, "mUploadPhotos");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            AbstractC19074t.m100208f(list, "allPhotoList");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            AbstractC19074t.m100208f(str2, "postFeedCallbackId");
            this.f132188a = str;
            this.f132189b = arrayList;
            this.f132190c = z11;
            this.f132191d = c3003l3;
            this.f132192e = c3063z0;
            this.f132193f = privacyInfo;
            this.f132194g = c31890dc;
            this.f132195h = trackingSource;
            this.f132196i = songInfo;
            this.f132197j = profilePreviewAlbumItem;
            this.f132198k = list;
            this.f132199l = z12;
            this.f132200m = c18049e;
            this.f132201n = interfaceC18505l;
            this.f132202o = str2;
        }

        /* renamed from: a */
        public final List m142847a() {
            return this.f132198k;
        }

        /* renamed from: b */
        public final InterfaceC18505l m142848b() {
            return this.f132201n;
        }

        /* renamed from: c */
        public final String m142849c() {
            return this.f132188a;
        }

        /* renamed from: d */
        public final C18049e m142850d() {
            return this.f132200m;
        }

        /* renamed from: e */
        public C3063z0 m142851e() {
            return this.f132192e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f132188a, aVar.f132188a) && AbstractC19074t.m100204b(this.f132189b, aVar.f132189b) && this.f132190c == aVar.f132190c && AbstractC19074t.m100204b(this.f132191d, aVar.f132191d) && AbstractC19074t.m100204b(this.f132192e, aVar.f132192e) && AbstractC19074t.m100204b(this.f132193f, aVar.f132193f) && AbstractC19074t.m100204b(this.f132194g, aVar.f132194g) && AbstractC19074t.m100204b(this.f132195h, aVar.f132195h) && AbstractC19074t.m100204b(this.f132196i, aVar.f132196i) && AbstractC19074t.m100204b(this.f132197j, aVar.f132197j) && AbstractC19074t.m100204b(this.f132198k, aVar.f132198k) && this.f132199l == aVar.f132199l && AbstractC19074t.m100204b(this.f132200m, aVar.f132200m) && AbstractC19074t.m100204b(this.f132201n, aVar.f132201n) && AbstractC19074t.m100204b(this.f132202o, aVar.f132202o);
        }

        /* renamed from: f */
        public final ArrayList m142852f() {
            return this.f132189b;
        }

        /* renamed from: g */
        public String m142853g() {
            return this.f132202o;
        }

        /* renamed from: h */
        public PrivacyInfo m142854h() {
            return this.f132193f;
        }

        public int hashCode() {
            int hashCode = ((((this.f132188a.hashCode() * 31) + this.f132189b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f132190c)) * 31;
            C3003l3 c3003l3 = this.f132191d;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f132192e;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f132193f;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f132194g;
            int hashCode5 = (((hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31) + this.f132195h.hashCode()) * 31;
            SongInfo songInfo = this.f132196i;
            int hashCode6 = (hashCode5 + (songInfo == null ? 0 : songInfo.hashCode())) * 31;
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f132197j;
            int hashCode7 = (((((hashCode6 + (profilePreviewAlbumItem == null ? 0 : profilePreviewAlbumItem.hashCode())) * 31) + this.f132198k.hashCode()) * 31) + AbstractC2144f.m11520a(this.f132199l)) * 31;
            C18049e c18049e = this.f132200m;
            return ((((hashCode7 + (c18049e != null ? c18049e.hashCode() : 0)) * 31) + this.f132201n.hashCode()) * 31) + this.f132202o.hashCode();
        }

        /* renamed from: i */
        public final ProfilePreviewAlbumItem m142855i() {
            return this.f132197j;
        }

        /* renamed from: j */
        public final SongInfo m142856j() {
            return this.f132196i;
        }

        /* renamed from: k */
        public C3003l3 m142857k() {
            return this.f132191d;
        }

        /* renamed from: l */
        public TrackingSource m142858l() {
            return this.f132195h;
        }

        /* renamed from: m */
        public C31890dc m142859m() {
            return this.f132194g;
        }

        /* renamed from: n */
        public final boolean m142860n() {
            return this.f132190c;
        }

        /* renamed from: o */
        public boolean m142861o() {
            return this.f132199l;
        }

        public String toString() {
            return "Param(desc=" + this.f132188a + ", mUploadPhotos=" + this.f132189b + ", useDynamicLayout=" + this.f132190c + ", tag=" + this.f132191d + ", location=" + this.f132192e + ", privacyInfo=" + this.f132193f + ", typo=" + this.f132194g + ", trackingSource=" + this.f132195h + ", songInfo=" + this.f132196i + ", profilePreviewAlbumItem=" + this.f132197j + ", allPhotoList=" + this.f132198k + ", isMutualFeed=" + this.f132199l + ", layoutConfig=" + this.f132200m + ", callback=" + this.f132201n + ", postFeedCallbackId=" + this.f132202o + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vo.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f132203t;

        /* renamed from: u */
        final /* synthetic */ a f132204u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.h$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f132205q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Begin UPLOAD_FEED_MULTI_PHOTO_USE_CASE";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33016b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C33016b f132206q = new C33016b();

            C33016b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "End UPLOAD_FEED_MULTI_PHOTO_USE_CASE";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vo.h$b$c */
        /* loaded from: classes4.dex */
        public static final class c implements FlowCollector {

            /* renamed from: p */
            public static final c f132207p = new c();

            c() {
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
            this.f132204u = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f132204u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long j11;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f132203t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", a.f132205q);
                ProfilePreviewAlbumItem m142855i = this.f132204u.m142855i();
                if (m142855i != null) {
                    j11 = m142855i.getId();
                } else {
                    j11 = 0;
                }
                long j12 = j11;
                C2949b m108833s = AbstractC20826v0.m108833s(this.f132204u.m142855i());
                Iterator it = this.f132204u.m142852f().iterator();
                while (it.hasNext()) {
                    MediaItem mediaItem = (MediaItem) it.next();
                    if (mediaItem != null) {
                        mediaItem.m41135Z0(this.f132204u.m142847a().indexOf(mediaItem));
                    }
                }
                C3000l0 m14280z = C3000l0.m14280z(this.f132204u.m142849c(), this.f132204u.m142852f(), this.f132204u.m142860n(), this.f132204u.m142857k(), this.f132204u.m142851e(), this.f132204u.m142854h(), this.f132204u.m142859m(), this.f132204u.m142858l(), j12, m108833s, this.f132204u.m142856j(), this.f132204u.m142850d(), this.f132204u.m142853g());
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", C33016b.f132206q);
                AbstractC23309i.m122403sq(System.currentTimeMillis());
                C28362e c28362e = new C28362e();
                C28362e.a aVar = new C28362e.a(m14280z, AbstractC29094b.m145339a(this.f132204u.m142861o()), this.f132204u.m142848b());
                this.f132203t = 1;
                m101498a = c28362e.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                c cVar = c.f132207p;
                this.f132203t = 2;
                if (flow.mo97893a(cVar, this) == m142578e) {
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
