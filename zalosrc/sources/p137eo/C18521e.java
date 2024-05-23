package p137eo;

import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import p735do.C18034b;
import p735do.C18035c;

/* renamed from: eo.e */
/* loaded from: classes4.dex */
public final class C18521e implements InterfaceC18525i, InterfaceC18519c {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static volatile C18521e f93154c;

    /* renamed from: a */
    private final InterfaceC18525i f93155a;

    /* renamed from: b */
    private final InterfaceC18519c f93156b;

    /* renamed from: eo.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18521e m97903a() {
            C18521e c18521e = C18521e.f93154c;
            if (c18521e == null) {
                synchronized (this) {
                    c18521e = new C18521e(new C18524h(new C18035c()), new C18518b(new C18034b()));
                    C18521e.f93154c = c18521e;
                }
            }
            return c18521e;
        }
    }

    public C18521e(InterfaceC18525i interfaceC18525i, InterfaceC18519c interfaceC18519c) {
        AbstractC19074t.m100208f(interfaceC18525i, "profileAlbumListManager");
        AbstractC19074t.m100208f(interfaceC18519c, "albumDetailManager");
        this.f93155a = interfaceC18525i;
        this.f93156b = interfaceC18519c;
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: a */
    public Object mo97886a(String str, long j11, int i11, List list, ProfileAlbumItem profileAlbumItem, Continuation continuation) {
        return this.f93156b.mo97886a(str, j11, i11, list, profileAlbumItem, continuation);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: b */
    public Object mo97887b(String str, long j11, int i11, Continuation continuation) {
        return this.f93156b.mo97887b(str, j11, i11, continuation);
    }

    @Override // p137eo.InterfaceC18525i
    /* renamed from: c */
    public Object mo97899c(String str, long j11, Continuation continuation) {
        return this.f93155a.mo97899c(str, j11, continuation);
    }

    @Override // p137eo.InterfaceC18525i
    /* renamed from: d */
    public Object mo97900d(String str, ProfileAlbumItem profileAlbumItem, Continuation continuation) {
        return this.f93155a.mo97900d(str, profileAlbumItem, continuation);
    }

    @Override // p137eo.InterfaceC18525i
    /* renamed from: e */
    public Object mo97901e(String str, int i11, int i12, C8676a c8676a, Continuation continuation) {
        return this.f93155a.mo97901e(str, i11, i12, c8676a, continuation);
    }

    @Override // p137eo.InterfaceC18525i
    /* renamed from: f */
    public Flow mo97902f(String str, int i11) {
        AbstractC19074t.m100208f(str, "userId");
        return this.f93155a.mo97902f(str, i11);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: g */
    public Object mo97888g(String str, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
        return this.f93156b.mo97888g(str, profileAlbumItem, trackingSource, continuation);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: h */
    public Object mo97889h(String str, ProfileAlbumItem profileAlbumItem, String str2, int i11, Continuation continuation) {
        return this.f93156b.mo97889h(str, profileAlbumItem, str2, i11, continuation);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: i */
    public Object mo97890i(String str, long j11, int i11, String str2, String str3, ThemeItem themeItem, TrackingSource trackingSource, Continuation continuation) {
        return this.f93156b.mo97890i(str, j11, i11, str2, str3, themeItem, trackingSource, continuation);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: j */
    public Object mo97891j(String str, long j11, int i11, Continuation continuation) {
        return this.f93156b.mo97891j(str, j11, i11, continuation);
    }

    @Override // p137eo.InterfaceC18519c
    /* renamed from: k */
    public Object mo97892k(String str, int i11, long j11, long j12, int i12, ProfileAlbumItem profileAlbumItem, TrackingSource trackingSource, Continuation continuation) {
        return this.f93156b.mo97892k(str, i11, j11, j12, i12, profileAlbumItem, trackingSource, continuation);
    }
}
