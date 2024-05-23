package f20;

import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.p072ui.view.SearchAllView;
import com.zing.zalo.shortvideo.p072ui.view.SearchChannelView;
import com.zing.zalo.shortvideo.p072ui.view.SearchHashtagView;
import com.zing.zalo.shortvideo.p072ui.view.SearchVideoView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18187a;
import e20.InterfaceC18188b;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Map;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25363p0;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: f20.e */
/* loaded from: classes5.dex */
public final class C18707e extends AbstractC17505t0 implements InterfaceC18703a {

    /* renamed from: w */
    private final ViewPager f93981w;

    /* renamed from: x */
    private final Map f93982x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.e$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f93983q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return new SearchAllView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.e$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f93984q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return new SearchVideoView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.e$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f93985q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return new SearchChannelView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f20.e$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f93986q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return new SearchHashtagView();
        }
    }

    /* renamed from: f20.e$e */
    /* loaded from: classes5.dex */
    public static final class e extends Enum {

        /* renamed from: p */
        public static final e f93987p = new e("ALL", 0);

        /* renamed from: q */
        public static final e f93988q = new e("VIDEO", 1);

        /* renamed from: r */
        public static final e f93989r = new e("CHANNEL", 2);

        /* renamed from: s */
        public static final e f93990s = new e("HASHTAG", 3);

        /* renamed from: t */
        private static final /* synthetic */ e[] f93991t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f93992u;

        static {
            e[] m98662b = m98662b();
            f93991t = m98662b;
            f93992u = AbstractC30166b.m148796a(m98662b);
        }

        private e(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m98662b() {
            return new e[]{f93987p, f93988q, f93989r, f93990s};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f93991t.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18707e(ViewPager viewPager, C17487o0 c17487o0) {
        super(c17487o0);
        Map m131407l;
        AbstractC19074t.m100208f(viewPager, "viewPager");
        AbstractC19074t.m100208f(c17487o0, "zvm");
        this.f93981w = viewPager;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(Integer.valueOf(e.f93987p.ordinal()), new C24860q(AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_search_menu_all, new Object[0]), a.f93983q)), AbstractC24866w.m129235a(Integer.valueOf(e.f93988q.ordinal()), new C24860q(AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_search_menu_video, new Object[0]), b.f93984q)), AbstractC24866w.m129235a(Integer.valueOf(e.f93989r.ordinal()), new C24860q(AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_search_menu_channel, new Object[0]), c.f93985q)), AbstractC24866w.m129235a(Integer.valueOf(e.f93990s.ordinal()), new C24860q(AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_search_menu_hashtag, new Object[0]), d.f93986q)));
        this.f93982x = m131407l;
    }

    /* renamed from: A */
    public void m98652A(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53932Bg();
        }
    }

    /* renamed from: B */
    public final void m98653B(int i11) {
        InterfaceC18188b interfaceC18188b;
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18188b) {
            interfaceC18188b = (InterfaceC18188b) mo35339k;
        } else {
            interfaceC18188b = null;
        }
        if (interfaceC18188b != null) {
            interfaceC18188b.mo54739h9();
        }
    }

    /* renamed from: C */
    public void m98654C(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.deactivate();
        }
    }

    /* renamed from: D */
    public final void m98655D(int i11, String str, Throwable th2) {
        InterfaceC18188b interfaceC18188b;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(th2, "throwable");
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18188b) {
            interfaceC18188b = (InterfaceC18188b) mo35339k;
        } else {
            interfaceC18188b = null;
        }
        if (interfaceC18188b != null) {
            interfaceC18188b.mo54732Mz(str, th2);
        }
    }

    /* renamed from: E */
    public final void m98656E(int i11, String str) {
        InterfaceC18188b interfaceC18188b;
        AbstractC19074t.m100208f(str, "keyword");
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18188b) {
            interfaceC18188b = (InterfaceC18188b) mo35339k;
        } else {
            interfaceC18188b = null;
        }
        if (interfaceC18188b != null) {
            interfaceC18188b.mo54742wx(str);
        }
    }

    /* renamed from: F */
    public final void m98657F(int i11, String str, SearchAllResult searchAllResult) {
        InterfaceC18188b interfaceC18188b;
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(searchAllResult, "result");
        Object mo35339k = mo35339k(this.f93981w, i11);
        if (mo35339k instanceof InterfaceC18188b) {
            interfaceC18188b = (InterfaceC18188b) mo35339k;
        } else {
            interfaceC18188b = null;
        }
        if (interfaceC18188b != null) {
            interfaceC18188b.mo54733QA(str, searchAllResult);
        }
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: a */
    public void mo98626a(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93981w, i11);
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
        Object mo35339k = mo35339k(this.f93981w, i11);
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
        return this.f93982x.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        String str;
        C24860q c24860q = (C24860q) this.f93982x.get(Integer.valueOf(i11));
        if (c24860q != null && (str = (String) c24860q.m129215c()) != null) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        InterfaceC18494a interfaceC18494a;
        ZaloView zaloView;
        C24860q c24860q = (C24860q) this.f93982x.get(Integer.valueOf(i11));
        if (c24860q != null && (interfaceC18494a = (InterfaceC18494a) c24860q.m129216d()) != null && (zaloView = (ZaloView) interfaceC18494a.mo12V4()) != null) {
            return zaloView;
        }
        throw new IllegalArgumentException();
    }
}
