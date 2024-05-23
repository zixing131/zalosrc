package fo;

import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.AbstractC18522f;
import p137eo.C18521e;
import p137eo.InterfaceC18520d;
import p185gc.AbstractC19377a;
import p455qo.C25408f0;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: fo.i */
/* loaded from: classes4.dex */
public final class C19089i extends AbstractC19377a implements InterfaceC18520d {

    /* renamed from: a */
    private final C18521e f95017a;

    /* renamed from: b */
    public a f95018b;

    /* renamed from: fo.i$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95019a;

        /* renamed from: b */
        private final ProfileAlbumItem f95020b;

        /* renamed from: c */
        private final TrackingSource f95021c;

        public a(String str, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f95019a = str;
            this.f95020b = profileAlbumItem;
            this.f95021c = trackingSource;
        }

        /* renamed from: a */
        public final ProfileAlbumItem m100282a() {
            return this.f95020b;
        }

        /* renamed from: b */
        public final TrackingSource m100283b() {
            return this.f95021c;
        }

        /* renamed from: c */
        public final String m100284c() {
            return this.f95019a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95019a, aVar.f95019a) && AbstractC19074t.m100204b(this.f95020b, aVar.f95020b) && AbstractC19074t.m100204b(this.f95021c, aVar.f95021c);
        }

        public int hashCode() {
            return (((this.f95019a.hashCode() * 31) + this.f95020b.hashCode()) * 31) + this.f95021c.hashCode();
        }

        public String toString() {
            return "Param(userId=" + this.f95019a + ", albumItem=" + this.f95020b + ", trackingSource=" + this.f95021c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fo.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f95022s;

        /* renamed from: t */
        Object f95023t;

        /* renamed from: u */
        /* synthetic */ Object f95024u;

        /* renamed from: w */
        int f95026w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f95024u = obj;
            this.f95026w |= Integer.MIN_VALUE;
            return C19089i.this.mo451b(null, this);
        }
    }

    public C19089i(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f95017a = c18521e;
    }

    /* renamed from: c */
    public void m100279c(String str, ProfileAlbumItem profileAlbumItem) {
        InterfaceC18520d.a.m97894a(this, str, profileAlbumItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        C19089i c19089i;
        Object obj2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f95026w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f95026w = i12 - Integer.MIN_VALUE;
                obj = bVar.f95024u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f95026w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj2 = bVar.f95022s;
                            AbstractC24862s.m129228b(obj);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.f95023t;
                    c19089i = (C19089i) bVar.f95022s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m100281e(aVar);
                    C18521e c18521e = this.f95017a;
                    String m100284c = aVar.m100284c();
                    ProfileAlbumItem m100282a = aVar.m100282a();
                    TrackingSource m100283b = aVar.m100283b();
                    bVar.f95022s = this;
                    bVar.f95023t = aVar;
                    bVar.f95026w = 1;
                    obj = c18521e.mo97888g(m100284c, m100282a, m100283b, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19089i = this;
                }
                if (!(((AbstractC18522f) obj) instanceof AbstractC18522f.b)) {
                    c19089i.m100279c(aVar.m100284c(), aVar.m100282a());
                    new C25408f0(null, 1, null).m101508a(new C25408f0.b(aVar.m100282a()));
                    C18521e c18521e2 = c19089i.f95017a;
                    String m100284c2 = aVar.m100284c();
                    ProfileAlbumItem m100282a2 = aVar.m100282a();
                    bVar.f95022s = obj;
                    bVar.f95023t = null;
                    bVar.f95026w = 2;
                    if (c18521e2.mo97900d(m100284c2, m100282a2, bVar) == m142578e) {
                        return m142578e;
                    }
                    obj2 = obj;
                    return obj2;
                }
                return obj;
            }
        }
        bVar = new b(continuation);
        obj = bVar.f95024u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f95026w;
        if (i11 == 0) {
        }
        if (!(((AbstractC18522f) obj) instanceof AbstractC18522f.b)) {
        }
    }

    /* renamed from: e */
    public final void m100281e(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f95018b = aVar;
    }

    public /* synthetic */ C19089i(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
