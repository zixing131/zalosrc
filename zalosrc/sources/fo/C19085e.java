package fo;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.AbstractC18522f;
import p137eo.AbstractC18523g;
import p137eo.C18521e;
import p137eo.InterfaceC18520d;
import p185gc.AbstractC19377a;
import p455qo.C25408f0;
import p455qo.C25410g0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: fo.e */
/* loaded from: classes4.dex */
public final class C19085e extends AbstractC19377a implements InterfaceC18520d {

    /* renamed from: a */
    private final C18521e f94992a;

    /* renamed from: b */
    public a f94993b;

    /* renamed from: fo.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f94994a;

        /* renamed from: b */
        private final long f94995b;

        /* renamed from: c */
        private final int f94996c;

        /* renamed from: d */
        private final int f94997d;

        /* renamed from: e */
        private final long f94998e;

        /* renamed from: f */
        private final TrackingSource f94999f;

        /* renamed from: g */
        private final ProfileAlbumItem f95000g;

        public a(String str, long j11, int i11, int i12, long j12, TrackingSource trackingSource, ProfileAlbumItem profileAlbumItem) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f94994a = str;
            this.f94995b = j11;
            this.f94996c = i11;
            this.f94997d = i12;
            this.f94998e = j12;
            this.f94999f = trackingSource;
            this.f95000g = profileAlbumItem;
        }

        /* renamed from: a */
        public final long m100260a() {
            return this.f94995b;
        }

        /* renamed from: b */
        public final int m100261b() {
            return this.f94996c;
        }

        /* renamed from: c */
        public final ProfileAlbumItem m100262c() {
            return this.f95000g;
        }

        /* renamed from: d */
        public final long m100263d() {
            return this.f94998e;
        }

        /* renamed from: e */
        public final int m100264e() {
            return this.f94997d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f94994a, aVar.f94994a) && this.f94995b == aVar.f94995b && this.f94996c == aVar.f94996c && this.f94997d == aVar.f94997d && this.f94998e == aVar.f94998e && AbstractC19074t.m100204b(this.f94999f, aVar.f94999f) && AbstractC19074t.m100204b(this.f95000g, aVar.f95000g);
        }

        /* renamed from: f */
        public final TrackingSource m100265f() {
            return this.f94999f;
        }

        /* renamed from: g */
        public final String m100266g() {
            return this.f94994a;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f94994a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f94995b)) * 31) + this.f94996c) * 31) + this.f94997d) * 31) + AbstractC2147g0.m11521a(this.f94998e)) * 31) + this.f94999f.hashCode()) * 31;
            ProfileAlbumItem profileAlbumItem = this.f95000g;
            return hashCode + (profileAlbumItem == null ? 0 : profileAlbumItem.hashCode());
        }

        public String toString() {
            return "Param(userId=" + this.f94994a + ", albumId=" + this.f94995b + ", albumType=" + this.f94996c + ", page=" + this.f94997d + ", lastPhotoId=" + this.f94998e + ", trackingSource=" + this.f94999f + ", appendProfileAlbumItem=" + this.f95000g + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fo.e$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f95001s;

        /* renamed from: t */
        /* synthetic */ Object f95002t;

        /* renamed from: v */
        int f95004v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95002t = obj;
            this.f95004v |= Integer.MIN_VALUE;
            return C19085e.this.mo451b(null, this);
        }
    }

    public C19085e(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f94992a = c18521e;
    }

    /* renamed from: f */
    private final Object m100253f(AbstractC18523g abstractC18523g, Continuation continuation) {
        Object m142578e;
        if (abstractC18523g instanceof AbstractC18523g.a) {
            m100256d(m100257e().m100266g(), m100257e().m100260a());
            new C25410g0(null, 1, null).m101508a(new C25410g0.a(m100257e().m100260a()));
            Object mo97899c = this.f94992a.mo97899c(m100257e().m100266g(), m100257e().m100260a(), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97899c == m142578e) {
                return mo97899c;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: g */
    private final Object m100254g(ProfileAlbumItem profileAlbumItem, Continuation continuation) {
        Object m142578e;
        m100255c(m100257e().m100266g(), profileAlbumItem);
        new C25408f0(null, 1, null).m101508a(new C25408f0.b(profileAlbumItem));
        Object mo97900d = this.f94992a.mo97900d(m100257e().m100266g(), profileAlbumItem, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97900d == m142578e) {
            return mo97900d;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    public void m100255c(String str, ProfileAlbumItem profileAlbumItem) {
        InterfaceC18520d.a.m97894a(this, str, profileAlbumItem);
    }

    /* renamed from: d */
    public void m100256d(String str, long j11) {
        InterfaceC18520d.a.m97896c(this, str, j11);
    }

    /* renamed from: e */
    public final a m100257e() {
        a aVar = this.f94993b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC19074t.m100223u("params");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        int i12;
        Object mo97892k;
        C19085e c19085e;
        AbstractC18522f abstractC18522f;
        Object obj;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f95004v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f95004v = i13 - Integer.MIN_VALUE;
                Object obj2 = bVar.f95002t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f95004v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.f95001s;
                        AbstractC24862s.m129228b(obj2);
                        return obj;
                    }
                    C19085e c19085e2 = (C19085e) bVar.f95001s;
                    AbstractC24862s.m129228b(obj2);
                    c19085e = c19085e2;
                    mo97892k = obj2;
                    i12 = 2;
                } else {
                    AbstractC24862s.m129228b(obj2);
                    m100259i(aVar);
                    C18521e c18521e = this.f94992a;
                    String m100266g = aVar.m100266g();
                    int m100264e = aVar.m100264e();
                    long m100263d = aVar.m100263d();
                    long m100260a = aVar.m100260a();
                    int m100261b = aVar.m100261b();
                    ProfileAlbumItem m100262c = aVar.m100262c();
                    TrackingSource m100265f = aVar.m100265f();
                    bVar.f95001s = this;
                    bVar.f95004v = 1;
                    i12 = 2;
                    mo97892k = c18521e.mo97892k(m100266g, m100264e, m100263d, m100260a, m100261b, m100262c, m100265f, bVar);
                    if (mo97892k == m142578e) {
                        return m142578e;
                    }
                    c19085e = this;
                }
                abstractC18522f = (AbstractC18522f) mo97892k;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    ProfileAlbumItem profileAlbumItem = (ProfileAlbumItem) ((AbstractC18522f.b) abstractC18522f).m97906b();
                    bVar.f95001s = mo97892k;
                    bVar.f95004v = i12;
                    if (c19085e.m100254g(profileAlbumItem, bVar) == m142578e) {
                        return m142578e;
                    }
                } else if (abstractC18522f instanceof AbstractC18522f.a) {
                    AbstractC18523g abstractC18523g = (AbstractC18523g) ((AbstractC18522f.a) abstractC18522f).m97905b();
                    bVar.f95001s = mo97892k;
                    bVar.f95004v = 3;
                    if (c19085e.m100253f(abstractC18523g, bVar) == m142578e) {
                        return m142578e;
                    }
                } else {
                    return mo97892k;
                }
                obj = mo97892k;
                return obj;
            }
        }
        bVar = new b(continuation);
        Object obj22 = bVar.f95002t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f95004v;
        if (i11 == 0) {
        }
        abstractC18522f = (AbstractC18522f) mo97892k;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
        obj = mo97892k;
        return obj;
    }

    /* renamed from: i */
    public final void m100259i(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f94993b = aVar;
    }

    public /* synthetic */ C19085e(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
