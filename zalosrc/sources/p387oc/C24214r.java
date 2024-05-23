package p387oc;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import id.C20512b;
import kotlin.coroutines.Continuation;
import p158fd.C18880d;
import p185gc.AbstractC19379c;
import p484ri.C25804a;
import p605wc.C28911c;
import sc.C26220b;

/* renamed from: oc.r */
/* loaded from: classes3.dex */
public final class C24214r extends AbstractC19379c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C18880d f116840a;

    /* renamed from: b */
    private final C25804a f116841b;

    /* renamed from: c */
    private final C28911c f116842c;

    /* renamed from: oc.r$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: oc.r$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C20512b.c f116843a;

        public b(C20512b.c cVar) {
            AbstractC19074t.m100208f(cVar, "data");
            this.f116843a = cVar;
        }

        /* renamed from: a */
        public final C20512b.c m126211a() {
            return this.f116843a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f116843a, ((b) obj).f116843a);
        }

        public int hashCode() {
            return this.f116843a.hashCode();
        }

        public String toString() {
            return "Result(data=" + this.f116843a + ")";
        }
    }

    public C24214r(C18880d c18880d, C25804a c25804a, C28911c c28911c) {
        AbstractC19074t.m100208f(c18880d, "zipWrapperDriveSyncHandler");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepository");
        AbstractC19074t.m100208f(c28911c, "refreshGoogleAuthToken");
        this.f116840a = c18880d;
        this.f116841b = c25804a;
        this.f116842c = c28911c;
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        C28911c.c cVar = (C28911c.c) this.f116842c.m101509a(new C28911c.b(C25804a.m132980m(this.f116841b, false, 1, null), this.f116841b.m132996n(), this.f116841b.m132993i(), true));
        if (cVar == null) {
            return null;
        }
        C26220b.m134826i("SMLRefreshTokenAndFetchDriveDataUseCase", "fetchDataDriveFileMetadata", null, 4, null);
        C20512b.c m98984D = this.f116840a.m98984D(cVar.m144424b());
        C26220b.m134826i("SMLRefreshTokenAndFetchDriveDataUseCase", "fetched data from drive: mapFileZip size = " + m98984D.m106569c().size() + " - listFilePhotoSingle size = " + m98984D.m106567a().size(), null, 4, null);
        return new b(m98984D);
    }
}
