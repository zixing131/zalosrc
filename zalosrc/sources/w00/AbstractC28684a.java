package w00;

import android.content.Context;
import com.zing.zalo.shortvideo.data.p071db.C9368a;
import com.zing.zalo.shortvideo.p072ui.presenter.BlockListChannelPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.BlockListUserPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.BookmarkListPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.ChannelPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.CommentPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.CropImagePresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.EditChannelAvatarPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.EditProfileDetailPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.FeedBackPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.HashTagListPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10055c;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10057e;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f;
import com.zing.zalo.shortvideo.p072ui.presenter.LikedVideoPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.LivestreamPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.NotificationPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.OnboardingPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.ReportPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchAllPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchChannelPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchHashtagPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchVideoChannelPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.SearchVideoPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.UploadPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.VideoLocationPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.presenter.VideoPresenterImpl;
import com.zing.zalocore.CoreUtility;
import e10.C18171h;
import e10.InterfaceC18165b;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g10.C19203a;
import h10.C19707h;
import h10.C19714o;
import h20.InterfaceC19717a;
import h20.InterfaceC19718b;
import h20.InterfaceC19719c;
import h20.InterfaceC19720d;
import h20.InterfaceC19721e;
import h20.InterfaceC19722f;
import h20.InterfaceC19723g;
import h20.InterfaceC19724h;
import h20.InterfaceC19725i;
import h20.InterfaceC19726j;
import h20.InterfaceC19727k;
import h20.InterfaceC19728l;
import h20.InterfaceC19729m;
import h20.InterfaceC19730n;
import h20.InterfaceC19731o;
import h20.InterfaceC19733q;
import h20.InterfaceC19735s;
import h20.InterfaceC19736t;
import h20.InterfaceC19738v;
import l10.C21998a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import w10.C28686a;
import x00.C29282c;
import x00.C29284e;
import x00.InterfaceC29280a;
import x00.InterfaceC29283d;
import y00.InterfaceC30248b;

/* renamed from: w00.a */
/* loaded from: classes5.dex */
public abstract class AbstractC28684a {
    public static final h Companion = new h(null);

    /* renamed from: a */
    private static final InterfaceC24854k f133132a;

    /* renamed from: b */
    private static final InterfaceC24854k f133133b;

    /* renamed from: c */
    private static final InterfaceC24854k f133134c;

    /* renamed from: d */
    private static final InterfaceC24854k f133135d;

    /* renamed from: e */
    private static final InterfaceC24854k f133136e;

    /* renamed from: f */
    private static final InterfaceC24854k f133137f;

    /* renamed from: g */
    private static final InterfaceC24854k f133138g;

    /* renamed from: w00.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f133139q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C21998a mo12V4() {
            return new C21998a(AbstractC28684a.Companion.m143658e());
        }
    }

    /* renamed from: w00.a$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f133140q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29282c mo12V4() {
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            return new C29282c(appContext);
        }
    }

    /* renamed from: w00.a$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f133141q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19714o mo12V4() {
            return new C19714o(AbstractC28684a.Companion.m143657d(), null, null, 6, null);
        }
    }

    /* renamed from: w00.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f133142q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C9368a mo12V4() {
            return new C9368a();
        }
    }

    /* renamed from: w00.a$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f133143q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19203a mo12V4() {
            return new C19203a(AbstractC28684a.Companion.m143659f());
        }
    }

    /* renamed from: w00.a$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f133144q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29284e mo12V4() {
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            return new C29284e(appContext);
        }
    }

    /* renamed from: w00.a$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f133145q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18171h mo12V4() {
            h hVar = AbstractC28684a.Companion;
            return new C18171h(hVar.m143681o(), hVar.m143685s());
        }
    }

    /* renamed from: w00.a$h */
    /* loaded from: classes5.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public final C21998a m143657d() {
            return (C21998a) AbstractC28684a.f133136e.getValue();
        }

        /* renamed from: e */
        public final InterfaceC29280a m143658e() {
            return (InterfaceC29280a) AbstractC28684a.f133132a.getValue();
        }

        /* renamed from: f */
        public final C19714o m143659f() {
            return (C19714o) AbstractC28684a.f133137f.getValue();
        }

        /* renamed from: g */
        private final InterfaceC30248b m143660g() {
            return (InterfaceC30248b) AbstractC28684a.f133135d.getValue();
        }

        /* renamed from: h */
        private final InterfaceC18165b m143661h() {
            return (InterfaceC18165b) AbstractC28684a.f133138g.getValue();
        }

        /* renamed from: i */
        private final InterfaceC29283d m143662i() {
            return (InterfaceC29283d) AbstractC28684a.f133134c.getValue();
        }

        /* renamed from: j */
        private final InterfaceC18170g m143663j() {
            return (InterfaceC18170g) AbstractC28684a.f133133b.getValue();
        }

        /* renamed from: A */
        public final InterfaceC19726j m143664A() {
            return new NotificationPresenterImpl(m143663j());
        }

        /* renamed from: B */
        public final InterfaceC10057e m143665B() {
            return new OnboardingPresenterImpl(m143663j());
        }

        /* renamed from: C */
        public final InterfaceC19727k m143666C() {
            return new ReportPresenterImpl(m143663j());
        }

        /* renamed from: D */
        public final InterfaceC18170g m143667D() {
            return m143663j();
        }

        /* renamed from: E */
        public final InterfaceC19728l m143668E() {
            return new SearchAllPresenterImpl(m143663j());
        }

        /* renamed from: F */
        public final InterfaceC19729m m143669F() {
            return new SearchChannelPresenterImpl(m143663j());
        }

        /* renamed from: G */
        public final InterfaceC19730n m143670G() {
            return new SearchHashtagPresenterImpl(m143663j());
        }

        /* renamed from: H */
        public final InterfaceC19731o m143671H() {
            return new SearchPresenterImpl(m143658e(), m143663j());
        }

        /* renamed from: I */
        public final InterfaceC19733q m143672I() {
            return new SearchVideoChannelPresenterImpl(m143663j());
        }

        /* renamed from: J */
        public final InterfaceC19735s m143673J() {
            return new SearchVideoPresenterImpl(m143663j());
        }

        /* renamed from: K */
        public final InterfaceC19736t m143674K() {
            return new UploadPresenterImpl(m143663j());
        }

        /* renamed from: L */
        public final InterfaceC19738v m143675L() {
            return new VideoLocationPresenterImpl(m143663j());
        }

        /* renamed from: M */
        public final InterfaceC10058f m143676M() {
            return new VideoPresenterImpl(m143663j(), m143660g());
        }

        /* renamed from: k */
        public final InterfaceC19717a m143677k() {
            return new BlockListChannelPresenterImpl(m143663j());
        }

        /* renamed from: l */
        public final InterfaceC19718b m143678l() {
            return new BlockListUserPresenterImpl(m143663j());
        }

        /* renamed from: m */
        public final InterfaceC19719c m143679m() {
            return new BookmarkListPresenterImpl(m143663j());
        }

        /* renamed from: n */
        public final C28686a m143680n() {
            return new C28686a(m143658e());
        }

        /* renamed from: o */
        public final InterfaceC29280a m143681o() {
            return m143658e();
        }

        /* renamed from: p */
        public final InterfaceC10054b m143682p() {
            return new ChannelPresenterImpl(m143663j(), m143657d());
        }

        /* renamed from: q */
        public final InterfaceC10055c m143683q() {
            return new CommentPresenterImpl(m143663j());
        }

        /* renamed from: r */
        public final InterfaceC19720d m143684r() {
            return new CropImagePresenterImpl();
        }

        /* renamed from: s */
        public final InterfaceC30248b m143685s() {
            return m143660g();
        }

        /* renamed from: t */
        public final InterfaceC19721e m143686t() {
            return new EditChannelAvatarPresenterImpl(m143663j());
        }

        /* renamed from: u */
        public final InterfaceC19722f m143687u() {
            return new EditProfileDetailPresenterImpl(m143663j());
        }

        /* renamed from: v */
        public final InterfaceC19723g m143688v() {
            return new FeedBackPresenterImpl(m143663j());
        }

        /* renamed from: w */
        public final InterfaceC19724h m143689w() {
            return new HashTagListPresenterImpl(m143663j());
        }

        /* renamed from: x */
        public final InterfaceC19725i m143690x() {
            return new LikedVideoPresenterImpl(m143663j());
        }

        /* renamed from: y */
        public final InterfaceC10056d m143691y() {
            return new LivestreamPresenterImpl(m143663j(), new C19707h(m143661h(), null, null, null, null, null, null, null, null, null, 1022, null), m143658e());
        }

        /* renamed from: z */
        public final InterfaceC29283d m143692z() {
            return m143662i();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(b.f133140q);
        f133132a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(g.f133145q);
        f133133b = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(f.f133144q);
        f133134c = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(d.f133142q);
        f133135d = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(a.f133139q);
        f133136e = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(c.f133141q);
        f133137f = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(e.f133143q);
        f133138g = m129210a7;
    }
}
