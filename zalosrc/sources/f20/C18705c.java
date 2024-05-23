package f20;

import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerView;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18187a;
import e20.InterfaceC18189c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import pm0.C24865v;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import v00.C27417l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: f20.c */
/* loaded from: classes5.dex */
public final class C18705c extends AbstractC17505t0 implements InterfaceC18703a {

    /* renamed from: A */
    private boolean f93964A;

    /* renamed from: w */
    private final ViewPager f93965w;

    /* renamed from: x */
    private final List f93966x;

    /* renamed from: y */
    private d f93967y;

    /* renamed from: z */
    private Video f93968z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.c$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final VideoPageView mo12V4() {
            VideoPageView.C10573b c10573b = VideoPageView.Companion;
            Video video = C18705c.this.f93968z;
            if (video == null || C18705c.this.f93967y != d.f93972q) {
                video = null;
            }
            return c10573b.m55416l(video);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final VideoChannelPagerView mo12V4() {
            VideoChannelPagerView.C10509b c10509b = VideoChannelPagerView.Companion;
            Video video = C18705c.this.f93968z;
            if (video == null || C18705c.this.f93967y != d.f93973r) {
                video = null;
            }
            return c10509b.m55116d(video, C18705c.this.f93964A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final VideoPageView mo12V4() {
            VideoPageView.C10573b c10573b = VideoPageView.Companion;
            Video video = C18705c.this.f93968z;
            if (video == null || C18705c.this.f93967y != d.f93974s) {
                video = null;
            }
            return c10573b.m55417m(video);
        }
    }

    /* renamed from: f20.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends Enum {
        public static final a Companion;

        /* renamed from: q */
        public static final d f93972q = new d("FOLLOWING", 0, 0);

        /* renamed from: r */
        public static final d f93973r = new d("FOR_U", 1, 1);

        /* renamed from: s */
        public static final d f93974s = new d("FRIEND", 2, 2);

        /* renamed from: t */
        private static final /* synthetic */ d[] f93975t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f93976u;

        /* renamed from: p */
        private final int f93977p;

        /* renamed from: f20.c$d$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m98646a(Integer num) {
                for (d dVar : d.values()) {
                    int m98645c = dVar.m98645c();
                    if (num != null && m98645c == num.intValue()) {
                        return dVar;
                    }
                }
                return null;
            }
        }

        static {
            d[] m98644b = m98644b();
            f93975t = m98644b;
            f93976u = AbstractC30166b.m148796a(m98644b);
            Companion = new a(null);
        }

        private d(String str, int i11, int i12) {
            super(str, i11);
            this.f93977p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m98644b() {
            return new d[]{f93972q, f93973r, f93974s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f93975t.clone();
        }

        /* renamed from: c */
        public final int m98645c() {
            return this.f93977p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18705c(ViewPager viewPager, C17487o0 c17487o0) {
        super(c17487o0);
        ArrayList m131500h;
        AbstractC19074t.m100208f(viewPager, "viewPager");
        AbstractC19074t.m100208f(c17487o0, "zvm");
        this.f93965w = viewPager;
        d dVar = d.f93973r;
        m131500h = AbstractC25368s.m131500h(new C24865v(d.f93972q, AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_main_menu_following, new Object[0]), new a()), new C24865v(dVar, AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_main_menu_for_u, new Object[0]), new b()));
        if (C27417l.f129055a.m140389m()) {
            m131500h.add(0, new C24865v(d.f93974s, AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_main_menu_friend, new Object[0]), new c()));
        }
        this.f93966x = m131500h;
        this.f93967y = dVar;
    }

    /* renamed from: D */
    public void m98635D(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93965w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53932Bg();
        }
    }

    /* renamed from: E */
    public void m98636E(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93965w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.deactivate();
        }
    }

    /* renamed from: F */
    public final d m98637F(int i11) {
        if (i11 >= 0 && i11 < this.f93966x.size()) {
            return (d) ((C24865v) this.f93966x.get(i11)).m129232d();
        }
        return null;
    }

    /* renamed from: G */
    public final Integer m98638G(d dVar) {
        AbstractC19074t.m100208f(dVar, "page");
        int size = this.f93966x.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((C24865v) this.f93966x.get(i11)).m129232d() == dVar) {
                return Integer.valueOf(i11);
            }
        }
        return null;
    }

    /* renamed from: H */
    public final void m98639H(int i11) {
        InterfaceC18189c interfaceC18189c;
        Object mo35339k = mo35339k(this.f93965w, i11);
        if (mo35339k instanceof InterfaceC18189c) {
            interfaceC18189c = (InterfaceC18189c) mo35339k;
        } else {
            interfaceC18189c = null;
        }
        if (interfaceC18189c != null) {
            interfaceC18189c.mo54480ni();
        }
    }

    /* renamed from: I */
    public final void m98640I(d dVar, Video video, boolean z11) {
        if (dVar == null) {
            dVar = d.f93973r;
        }
        this.f93967y = dVar;
        if (m98638G(dVar) == null) {
            this.f93967y = d.f93973r;
        }
        this.f93968z = video;
        this.f93964A = z11;
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: a */
    public void mo98626a(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93965w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53934d0();
        }
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: c */
    public void mo98627c(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93965w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53937r4();
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f93966x.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        return (CharSequence) ((C24865v) this.f93966x.get(i11)).m129233e();
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        return (ZaloView) ((InterfaceC18494a) ((C24865v) this.f93966x.get(i11)).m129234f()).mo12V4();
    }
}
