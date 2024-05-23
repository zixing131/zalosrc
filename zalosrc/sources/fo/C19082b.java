package fo;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import p137eo.AbstractC18522f;
import p137eo.C18521e;
import p137eo.InterfaceC18520d;
import p185gc.AbstractC19377a;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: fo.b */
/* loaded from: classes4.dex */
public final class C19082b extends AbstractC19377a implements InterfaceC18520d {

    /* renamed from: a */
    private final C18521e f94964a;

    /* renamed from: b */
    public a f94965b;

    /* renamed from: fo.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f94966a;

        /* renamed from: b */
        private final long f94967b;

        /* renamed from: c */
        private final int f94968c;

        /* renamed from: d */
        private final List f94969d;

        /* renamed from: e */
        private final ProfileAlbumItem f94970e;

        public a(String str, long j11, int i11, List list, ProfileAlbumItem profileAlbumItem) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(list, "ids");
            AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
            this.f94966a = str;
            this.f94967b = j11;
            this.f94968c = i11;
            this.f94969d = list;
            this.f94970e = profileAlbumItem;
        }

        /* renamed from: a */
        public final long m100236a() {
            return this.f94967b;
        }

        /* renamed from: b */
        public final ProfileAlbumItem m100237b() {
            return this.f94970e;
        }

        /* renamed from: c */
        public final int m100238c() {
            return this.f94968c;
        }

        /* renamed from: d */
        public final List m100239d() {
            return this.f94969d;
        }

        /* renamed from: e */
        public final String m100240e() {
            return this.f94966a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f94966a, aVar.f94966a) && this.f94967b == aVar.f94967b && this.f94968c == aVar.f94968c && AbstractC19074t.m100204b(this.f94969d, aVar.f94969d) && AbstractC19074t.m100204b(this.f94970e, aVar.f94970e);
        }

        public int hashCode() {
            return (((((((this.f94966a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f94967b)) * 31) + this.f94968c) * 31) + this.f94969d.hashCode()) * 31) + this.f94970e.hashCode();
        }

        public String toString() {
            return "Param(userId=" + this.f94966a + ", albumId=" + this.f94967b + ", albumType=" + this.f94968c + ", ids=" + this.f94969d + ", albumItem=" + this.f94970e + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fo.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f94971s;

        /* renamed from: t */
        Object f94972t;

        /* renamed from: u */
        /* synthetic */ Object f94973u;

        /* renamed from: w */
        int f94975w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f94973u = obj;
            this.f94975w |= Integer.MIN_VALUE;
            return C19082b.this.mo451b(null, this);
        }
    }

    public C19082b(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f94964a = c18521e;
    }

    /* renamed from: c */
    public void m100232c(String str, ProfileAlbumItem profileAlbumItem) {
        InterfaceC18520d.a.m97894a(this, str, profileAlbumItem);
    }

    /* renamed from: d */
    public void m100233d(List list, long j11) {
        InterfaceC18520d.a.m97895b(this, list, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C19082b c19082b;
        AbstractC18522f abstractC18522f;
        Object obj;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f94975w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f94975w = i12 - Integer.MIN_VALUE;
                Object obj2 = bVar.f94973u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f94975w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj = bVar.f94971s;
                            AbstractC24862s.m129228b(obj2);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.f94972t;
                    c19082b = (C19082b) bVar.f94971s;
                    AbstractC24862s.m129228b(obj2);
                } else {
                    AbstractC24862s.m129228b(obj2);
                    m100235f(aVar);
                    C18521e c18521e = this.f94964a;
                    String m100240e = aVar.m100240e();
                    long m100236a = aVar.m100236a();
                    int m100238c = aVar.m100238c();
                    List m100239d = aVar.m100239d();
                    ProfileAlbumItem m100237b = aVar.m100237b();
                    bVar.f94971s = this;
                    bVar.f94972t = aVar;
                    bVar.f94975w = 1;
                    obj2 = c18521e.mo97886a(m100240e, m100236a, m100238c, m100239d, m100237b, bVar);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    c19082b = this;
                }
                abstractC18522f = (AbstractC18522f) obj2;
                if (!(abstractC18522f instanceof AbstractC18522f.b)) {
                    AbstractC18522f.b bVar2 = (AbstractC18522f.b) abstractC18522f;
                    c19082b.m100232c(aVar.m100240e(), (ProfileAlbumItem) bVar2.m97906b());
                    c19082b.m100233d(aVar.m100239d(), aVar.m100236a());
                    C18521e c18521e2 = c19082b.f94964a;
                    String m100240e2 = aVar.m100240e();
                    ProfileAlbumItem profileAlbumItem = (ProfileAlbumItem) bVar2.m97906b();
                    bVar.f94971s = obj2;
                    bVar.f94972t = null;
                    bVar.f94975w = 2;
                    if (c18521e2.mo97900d(m100240e2, profileAlbumItem, bVar) == m142578e) {
                        return m142578e;
                    }
                    obj = obj2;
                    return obj;
                }
                return obj2;
            }
        }
        bVar = new b(continuation);
        Object obj22 = bVar.f94973u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f94975w;
        if (i11 == 0) {
        }
        abstractC18522f = (AbstractC18522f) obj22;
        if (!(abstractC18522f instanceof AbstractC18522f.b)) {
        }
    }

    /* renamed from: f */
    public final void m100235f(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f94965b = aVar;
    }

    public /* synthetic */ C19082b(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
