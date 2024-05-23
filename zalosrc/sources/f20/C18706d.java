package f20;

import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.data.model.config.NotiCategories;
import com.zing.zalo.shortvideo.p072ui.view.NotificationView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18187a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27413h;
import v00.C27417l;

/* renamed from: f20.d */
/* loaded from: classes5.dex */
public final class C18706d extends AbstractC17505t0 implements InterfaceC18703a {
    public static final a Companion = new a(null);

    /* renamed from: w */
    private final String f93978w;

    /* renamed from: x */
    private final ViewPager f93979x;

    /* renamed from: y */
    private final List f93980y;

    /* renamed from: f20.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18706d(String str, ViewPager viewPager, C17487o0 c17487o0) {
        super(c17487o0);
        List m131505m;
        CoreConfig m51425b;
        CoreConfig m51425b2;
        AbstractC19074t.m100208f(str, "source");
        AbstractC19074t.m100208f(viewPager, "viewPager");
        AbstractC19074t.m100208f(c17487o0, "zvm");
        this.f93978w = str;
        this.f93979x = viewPager;
        if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e == null || (m51425b2 = m140381e.m51425b()) == null || (m131505m = m51425b2.m51440c()) == null) {
                m131505m = AbstractC25368s.m131505m(new NotiCategories("22", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_comment, new Object[0])), new NotiCategories("23", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_like, new Object[0])), new NotiCategories("24", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_follow, new Object[0])), new NotiCategories("20", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_system, new Object[0])));
            }
        } else if (AbstractC19074t.m100204b(str, "SOURCE_USER")) {
            ChannelConfig m140381e2 = C27417l.f129055a.m140381e();
            if (m140381e2 == null || (m51425b = m140381e2.m51425b()) == null || (m131505m = m51425b.m51458u()) == null) {
                m131505m = AbstractC25368s.m131505m(new NotiCategories("30", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_comment, new Object[0])), new NotiCategories("31", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_like, new Object[0])), new NotiCategories("11", AbstractC26112n.m134366G(viewPager, AbstractC27413h.zch_page_notification_tab_system, new Object[0])));
            }
        } else {
            throw new IllegalStateException();
        }
        this.f93980y = m131505m;
    }

    /* renamed from: A */
    public void m98647A(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93979x, i11);
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
    public final ZaloView m98648B() {
        Iterator it = this.f93980y.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                NotiCategories notiCategories = (NotiCategories) it.next();
                if (AbstractC19074t.m100204b(notiCategories.m51483a(), "30") || AbstractC19074t.m100204b(notiCategories.m51483a(), "22")) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        return m93128x(i11);
    }

    /* renamed from: C */
    public void m98649C(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93979x, i11);
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
    public final List m98650D() {
        return this.f93980y;
    }

    /* renamed from: E */
    public final int m98651E(String str) {
        AbstractC19074t.m100208f(str, "id");
        Iterator it = this.f93980y.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!AbstractC19074t.m100204b(((NotiCategories) it.next()).m51483a(), str)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: a */
    public void mo98626a(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93979x, i11);
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
        Object mo35339k = mo35339k(this.f93979x, i11);
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
        return this.f93980y.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        String m51484b = ((NotiCategories) this.f93980y.get(i11)).m51484b();
        if (m51484b == null) {
            return "";
        }
        return m51484b;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        String str = this.f93978w;
        if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
            NotificationView.C10328a c10328a = NotificationView.Companion;
            String m51483a = ((NotiCategories) this.f93980y.get(i11)).m51483a();
            AbstractC19074t.m100205c(m51483a);
            return c10328a.m54634a(m51483a);
        }
        if (AbstractC19074t.m100204b(str, "SOURCE_USER")) {
            NotificationView.C10328a c10328a2 = NotificationView.Companion;
            String m51483a2 = ((NotiCategories) this.f93980y.get(i11)).m51483a();
            AbstractC19074t.m100205c(m51483a2);
            return c10328a2.m54635b(m51483a2);
        }
        throw new IllegalStateException();
    }
}
