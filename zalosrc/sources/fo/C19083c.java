package fo;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.AbstractC18522f;
import p137eo.AbstractC18523g;
import p137eo.C18521e;
import p137eo.InterfaceC18520d;
import p185gc.AbstractC19377a;
import p455qo.C25408f0;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: fo.c */
/* loaded from: classes4.dex */
public final class C19083c extends AbstractC19377a implements InterfaceC18520d {

    /* renamed from: a */
    private final C18521e f94976a;

    /* renamed from: fo.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f94977a;

        /* renamed from: b */
        private long f94978b;

        /* renamed from: c */
        private int f94979c;

        /* renamed from: d */
        private String f94980d;

        /* renamed from: e */
        private String f94981e;

        /* renamed from: f */
        private ThemeItem f94982f;

        /* renamed from: g */
        private final TrackingSource f94983g;

        public a(String str, long j11, int i11, String str2, String str3, ThemeItem themeItem, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(str2, "title");
            AbstractC19074t.m100208f(str3, "desc");
            AbstractC19074t.m100208f(themeItem, "themeInfo");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f94977a = str;
            this.f94978b = j11;
            this.f94979c = i11;
            this.f94980d = str2;
            this.f94981e = str3;
            this.f94982f = themeItem;
            this.f94983g = trackingSource;
        }

        /* renamed from: a */
        public final String m100243a() {
            return this.f94981e;
        }

        /* renamed from: b */
        public final long m100244b() {
            return this.f94978b;
        }

        /* renamed from: c */
        public final ThemeItem m100245c() {
            return this.f94982f;
        }

        /* renamed from: d */
        public final String m100246d() {
            return this.f94980d;
        }

        /* renamed from: e */
        public final TrackingSource m100247e() {
            return this.f94983g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f94977a, aVar.f94977a) && this.f94978b == aVar.f94978b && this.f94979c == aVar.f94979c && AbstractC19074t.m100204b(this.f94980d, aVar.f94980d) && AbstractC19074t.m100204b(this.f94981e, aVar.f94981e) && AbstractC19074t.m100204b(this.f94982f, aVar.f94982f) && AbstractC19074t.m100204b(this.f94983g, aVar.f94983g);
        }

        /* renamed from: f */
        public final int m100248f() {
            return this.f94979c;
        }

        /* renamed from: g */
        public final String m100249g() {
            return this.f94977a;
        }

        public int hashCode() {
            return (((((((((((this.f94977a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f94978b)) * 31) + this.f94979c) * 31) + this.f94980d.hashCode()) * 31) + this.f94981e.hashCode()) * 31) + this.f94982f.hashCode()) * 31) + this.f94983g.hashCode();
        }

        public String toString() {
            return "Param(userId=" + this.f94977a + ", id=" + this.f94978b + ", type=" + this.f94979c + ", title=" + this.f94980d + ", desc=" + this.f94981e + ", themeInfo=" + this.f94982f + ", trackingSource=" + this.f94983g + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fo.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f94984s;

        /* renamed from: t */
        Object f94985t;

        /* renamed from: u */
        /* synthetic */ Object f94986u;

        /* renamed from: w */
        int f94988w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f94986u = obj;
            this.f94988w |= Integer.MIN_VALUE;
            return C19083c.this.mo451b(null, this);
        }
    }

    public C19083c(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f94976a = c18521e;
    }

    /* renamed from: c */
    public void m100241c(String str, ProfileAlbumItem profileAlbumItem) {
        InterfaceC18520d.a.m97894a(this, str, profileAlbumItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        a aVar2;
        Object mo97890i;
        C19083c c19083c;
        AbstractC18522f abstractC18522f;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f94988w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f94988w = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f94986u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f94988w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return new AbstractC18522f.b(AbstractC29094b.m145339a(true));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar3 = (a) bVar.f94985t;
                    c19083c = (C19083c) bVar.f94984s;
                    AbstractC24862s.m129228b(obj);
                    mo97890i = obj;
                    aVar2 = aVar3;
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18521e c18521e = this.f94976a;
                    String m100249g = aVar.m100249g();
                    long m100244b = aVar.m100244b();
                    int m100248f = aVar.m100248f();
                    String m100246d = aVar.m100246d();
                    String m100243a = aVar.m100243a();
                    ThemeItem m100245c = aVar.m100245c();
                    TrackingSource m100247e = aVar.m100247e();
                    bVar.f94984s = this;
                    aVar2 = aVar;
                    bVar.f94985t = aVar2;
                    bVar.f94988w = 1;
                    mo97890i = c18521e.mo97890i(m100249g, m100244b, m100248f, m100246d, m100243a, m100245c, m100247e, bVar);
                    if (mo97890i == m142578e) {
                        return m142578e;
                    }
                    c19083c = this;
                }
                abstractC18522f = (AbstractC18522f) mo97890i;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    ProfileAlbumItem profileAlbumItem = (ProfileAlbumItem) ((AbstractC18522f.b) abstractC18522f).m97906b();
                    if (profileAlbumItem != null) {
                        c19083c.m100241c(aVar2.m100249g(), profileAlbumItem);
                        new C25408f0(null, 1, null).m101508a(new C25408f0.b(profileAlbumItem));
                        C18521e c18521e2 = c19083c.f94976a;
                        String m100249g2 = aVar2.m100249g();
                        bVar.f94984s = null;
                        bVar.f94985t = null;
                        bVar.f94988w = 2;
                        if (c18521e2.mo97900d(m100249g2, profileAlbumItem, bVar) == m142578e) {
                            return m142578e;
                        }
                    }
                    return new AbstractC18522f.b(AbstractC29094b.m145339a(true));
                }
                if (abstractC18522f instanceof AbstractC18522f.a) {
                    return new AbstractC18522f.a(((AbstractC18522f.a) abstractC18522f).m97905b());
                }
                return new AbstractC18522f.a(new AbstractC18523g.c());
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f94986u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f94988w;
        if (i11 == 0) {
        }
        abstractC18522f = (AbstractC18522f) mo97890i;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }

    public /* synthetic */ C19083c(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
