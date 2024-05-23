package so;

import android.util.Pair;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3063z0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p107dq.C18049e;
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

/* renamed from: so.c */
/* loaded from: classes4.dex */
public final class C26345c extends AbstractC19377a {

    /* renamed from: so.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f125096a;

        /* renamed from: b */
        private final ArrayList f125097b;

        /* renamed from: c */
        private final boolean f125098c;

        /* renamed from: d */
        private final C3003l3 f125099d;

        /* renamed from: e */
        private final C3063z0 f125100e;

        /* renamed from: f */
        private final PrivacyInfo f125101f;

        /* renamed from: g */
        private final C31890dc f125102g;

        /* renamed from: h */
        private final TrackingSource f125103h;

        /* renamed from: i */
        private final long f125104i;

        /* renamed from: j */
        private final C2949b f125105j;

        /* renamed from: k */
        private final SongInfo f125106k;

        /* renamed from: l */
        private final boolean f125107l;

        /* renamed from: m */
        private final C3000l0 f125108m;

        /* renamed from: n */
        private final boolean f125109n;

        /* renamed from: o */
        private final String f125110o;

        /* renamed from: p */
        private final C18049e f125111p;

        /* renamed from: q */
        private final InterfaceC18505l f125112q;

        public a(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z12, C3000l0 c3000l0, boolean z13, String str2, C18049e c18049e, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "desc");
            AbstractC19074t.m100208f(arrayList, "listMediaItem");
            AbstractC19074t.m100208f(str2, "feedId");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            this.f125096a = str;
            this.f125097b = arrayList;
            this.f125098c = z11;
            this.f125099d = c3003l3;
            this.f125100e = c3063z0;
            this.f125101f = privacyInfo;
            this.f125102g = c31890dc;
            this.f125103h = trackingSource;
            this.f125104i = j11;
            this.f125105j = c2949b;
            this.f125106k = songInfo;
            this.f125107l = z12;
            this.f125108m = c3000l0;
            this.f125109n = z13;
            this.f125110o = str2;
            this.f125111p = c18049e;
            this.f125112q = interfaceC18505l;
        }

        /* renamed from: a */
        public final long m135583a() {
            return this.f125104i;
        }

        /* renamed from: b */
        public final C2949b m135584b() {
            return this.f125105j;
        }

        /* renamed from: c */
        public final InterfaceC18505l m135585c() {
            return this.f125112q;
        }

        /* renamed from: d */
        public final String m135586d() {
            return this.f125096a;
        }

        /* renamed from: e */
        public final String m135587e() {
            return this.f125110o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125096a, aVar.f125096a) && AbstractC19074t.m100204b(this.f125097b, aVar.f125097b) && this.f125098c == aVar.f125098c && AbstractC19074t.m100204b(this.f125099d, aVar.f125099d) && AbstractC19074t.m100204b(this.f125100e, aVar.f125100e) && AbstractC19074t.m100204b(this.f125101f, aVar.f125101f) && AbstractC19074t.m100204b(this.f125102g, aVar.f125102g) && AbstractC19074t.m100204b(this.f125103h, aVar.f125103h) && this.f125104i == aVar.f125104i && AbstractC19074t.m100204b(this.f125105j, aVar.f125105j) && AbstractC19074t.m100204b(this.f125106k, aVar.f125106k) && this.f125107l == aVar.f125107l && AbstractC19074t.m100204b(this.f125108m, aVar.f125108m) && this.f125109n == aVar.f125109n && AbstractC19074t.m100204b(this.f125110o, aVar.f125110o) && AbstractC19074t.m100204b(this.f125111p, aVar.f125111p) && AbstractC19074t.m100204b(this.f125112q, aVar.f125112q);
        }

        /* renamed from: f */
        public final C18049e m135588f() {
            return this.f125111p;
        }

        /* renamed from: g */
        public final ArrayList m135589g() {
            return this.f125097b;
        }

        /* renamed from: h */
        public final C3063z0 m135590h() {
            return this.f125100e;
        }

        public int hashCode() {
            int hashCode = ((((this.f125096a.hashCode() * 31) + this.f125097b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f125098c)) * 31;
            C3003l3 c3003l3 = this.f125099d;
            int hashCode2 = (hashCode + (c3003l3 == null ? 0 : c3003l3.hashCode())) * 31;
            C3063z0 c3063z0 = this.f125100e;
            int hashCode3 = (hashCode2 + (c3063z0 == null ? 0 : c3063z0.hashCode())) * 31;
            PrivacyInfo privacyInfo = this.f125101f;
            int hashCode4 = (hashCode3 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31;
            C31890dc c31890dc = this.f125102g;
            int hashCode5 = (hashCode4 + (c31890dc == null ? 0 : c31890dc.hashCode())) * 31;
            TrackingSource trackingSource = this.f125103h;
            int hashCode6 = (((hashCode5 + (trackingSource == null ? 0 : trackingSource.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f125104i)) * 31;
            C2949b c2949b = this.f125105j;
            int hashCode7 = (hashCode6 + (c2949b == null ? 0 : c2949b.hashCode())) * 31;
            SongInfo songInfo = this.f125106k;
            int hashCode8 = (((hashCode7 + (songInfo == null ? 0 : songInfo.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125107l)) * 31;
            C3000l0 c3000l0 = this.f125108m;
            int hashCode9 = (((((hashCode8 + (c3000l0 == null ? 0 : c3000l0.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125109n)) * 31) + this.f125110o.hashCode()) * 31;
            C18049e c18049e = this.f125111p;
            return ((hashCode9 + (c18049e != null ? c18049e.hashCode() : 0)) * 31) + this.f125112q.hashCode();
        }

        /* renamed from: i */
        public final C3000l0 m135591i() {
            return this.f125108m;
        }

        /* renamed from: j */
        public final PrivacyInfo m135592j() {
            return this.f125101f;
        }

        /* renamed from: k */
        public final SongInfo m135593k() {
            return this.f125106k;
        }

        /* renamed from: l */
        public final C3003l3 m135594l() {
            return this.f125099d;
        }

        /* renamed from: m */
        public final TrackingSource m135595m() {
            return this.f125103h;
        }

        /* renamed from: n */
        public final C31890dc m135596n() {
            return this.f125102g;
        }

        /* renamed from: o */
        public final boolean m135597o() {
            return this.f125098c;
        }

        /* renamed from: p */
        public final boolean m135598p() {
            return this.f125109n;
        }

        /* renamed from: q */
        public final boolean m135599q() {
            return this.f125107l;
        }

        public String toString() {
            return "Param(desc=" + this.f125096a + ", listMediaItem=" + this.f125097b + ", useDynamicLayout=" + this.f125098c + ", tag=" + this.f125099d + ", location=" + this.f125100e + ", privacyInfo=" + this.f125101f + ", typo=" + this.f125102g + ", trackingSource=" + this.f125103h + ", albumId=" + this.f125104i + ", albumInfo=" + this.f125105j + ", songInfo=" + this.f125106k + ", isMutualFeed=" + this.f125107l + ", oldAsyncFeed=" + this.f125108m + ", isEmptyPhotoOrVideo=" + this.f125109n + ", feedId=" + this.f125110o + ", layoutConfig=" + this.f125111p + ", callback=" + this.f125112q + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: so.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f125113t;

        /* renamed from: u */
        final /* synthetic */ a f125114u;

        /* renamed from: v */
        final /* synthetic */ C26345c f125115v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.c$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f125116q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Begin UPLOAD_FEED_PHOTO_USE_CASE";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32970b implements FlowCollector {

            /* renamed from: p */
            public static final C32970b f125117p = new C32970b();

            C32970b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: so.c$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final c f125118q = new c();

            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "End UPLOAD_FEED_MULTI_PHOTO_USE_CASE";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C26345c c26345c, Continuation continuation) {
            super(2, continuation);
            this.f125114u = aVar;
            this.f125115v = c26345c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f125114u, this.f125115v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f125113t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f125118q);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", a.f125116q);
                C3000l0 m14280z = C3000l0.m14280z(this.f125114u.m135586d(), this.f125114u.m135589g(), this.f125114u.m135597o(), this.f125114u.m135594l(), this.f125114u.m135590h(), this.f125114u.m135592j(), this.f125114u.m135596n(), this.f125114u.m135595m(), this.f125114u.m135583a(), this.f125114u.m135584b(), this.f125114u.m135593k(), this.f125114u.m135588f(), "");
                m14280z.f11895q = this.f125114u.m135587e();
                m14280z.m14322a0().f12057p = this.f125114u.m135587e();
                m14280z.m14322a0().m14534x0(true);
                if (this.f125114u.m135591i() != null) {
                    C26345c c26345c = this.f125115v;
                    C3000l0 m135591i = this.f125114u.m135591i();
                    AbstractC19074t.m100205c(m14280z);
                    c26345c.m135581d(m135591i, m14280z);
                }
                AbstractC23309i.m122403sq(System.currentTimeMillis());
                C28363f c28363f = new C28363f();
                C3000l0 m135591i2 = this.f125114u.m135591i();
                boolean m135598p = this.f125114u.m135598p();
                boolean m135599q = this.f125114u.m135599q();
                C28363f.a aVar = new C28363f.a(m135591i2, m14280z, AbstractC29094b.m145339a(m135599q), m135598p, this.f125114u.m135585c());
                this.f125113t = 1;
                m101498a = c28363f.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                C32970b c32970b = C32970b.f125117p;
                this.f125113t = 2;
                if (flow.mo97893a(c32970b, this) == m142578e) {
                    return m142578e;
                }
            }
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_COMMON", c.f125118q);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m135581d(C3000l0 c3000l0, C3000l0 c3000l02) {
        ArrayList m14335h0 = c3000l0.m14335h0();
        ArrayList m14335h02 = c3000l02.m14335h0();
        if (m14335h0 != null && m14335h02 != null) {
            HashMap hashMap = new HashMap();
            Iterator it = m14335h0.iterator();
            while (it.hasNext()) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                String str = itemAlbumMobile.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                Pair create = Pair.create(itemAlbumMobile.f42611z, itemAlbumMobile.f42550D);
                AbstractC19074t.m100207e(create, "create(...)");
                hashMap.put(str, create);
            }
            Iterator it2 = m14335h02.iterator();
            while (it2.hasNext()) {
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) it2.next();
                Pair pair = (Pair) hashMap.get(itemAlbumMobile2.f42595r);
                if (pair != null) {
                    itemAlbumMobile2.f42611z = (String) pair.first;
                    itemAlbumMobile2.f42550D = (String) pair.second;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }
}
