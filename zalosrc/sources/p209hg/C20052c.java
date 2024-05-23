package p209hg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadCloseButton;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadTextView;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.MiniChatRequestPermissionActivity;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.p077ui.backuprestore.settings.SettingBackupRestoreView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamPlaybackView;
import com.zing.zalo.p077ui.group.livestream.GroupLiveStreamView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.settings.SettingContactView;
import com.zing.zalo.p077ui.settings.SettingThemeV2View;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zviews.Cocos2dxLoadingView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.FindFriendByPhoneNumberView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.MiniProfileView;
import com.zing.zalo.p077ui.zviews.MutualFeedView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.productcatalog.p068ui.zview.ProductAddEditView;
import com.zing.zalo.productcatalog.p068ui.zview.ProductManageView;
import com.zing.zalo.report_v2.reportattachment.ReportAttachmentView;
import com.zing.zalo.report_v2.reportsuccess.ReportSuccessActionView;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryView;
import com.zing.zalo.zview.AbstractC17489p0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.InterfaceC17502s;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import d60.C17799h;
import gg.AbstractC19438a;
import gg.C19442e;
import gg.C19443f;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21711h;
import kg.C21712i;
import kg.C21715l;
import me0.AbstractC23152n3;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p161fg.C18922m;
import p161fg.C18927r;
import p161fg.InterfaceC18910a;
import p161fg.InterfaceC18911b;
import p238ig.C20548b;
import p266jg.AbstractC21244b;
import p266jg.AbstractC21245c;
import p266jg.C21243a;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import p716zh.AbstractC32146v5;
import th.AbstractC26683d;
import v00.AbstractC27418m;
import vg.C28203u6;
import xl0.InterfaceC30162c;
import zl0.AbstractC32232i;

/* renamed from: hg.c */
/* loaded from: classes3.dex */
public class C20052c implements InterfaceC27218a {

    /* renamed from: A */
    private C21715l f98589A;

    /* renamed from: B */
    private C21709f f98590B;

    /* renamed from: C */
    private C21243a f98591C;

    /* renamed from: D */
    public d f98592D;

    /* renamed from: E */
    private DisplayMetrics f98593E;

    /* renamed from: F */
    private UpArrowLayout f98594F;

    /* renamed from: G */
    private InterfaceC18911b f98595G;

    /* renamed from: H */
    private Handler f98596H;

    /* renamed from: I */
    private Intent f98597I;

    /* renamed from: K */
    private View f98599K;

    /* renamed from: O */
    private final InterfaceC18910a f98603O;

    /* renamed from: q */
    private final Context f98608q;

    /* renamed from: r */
    private final C20548b f98609r;

    /* renamed from: s */
    private List f98610s;

    /* renamed from: u */
    private int f98612u;

    /* renamed from: v */
    private int f98613v;

    /* renamed from: w */
    private ChatHeadCloseButton f98614w;

    /* renamed from: x */
    private AbstractC19438a f98615x;

    /* renamed from: p */
    private final Map f98607p = new HashMap(3);

    /* renamed from: t */
    private int f98611t = -1;

    /* renamed from: y */
    private AbstractC19438a f98616y = null;

    /* renamed from: z */
    private int f98617z = AbstractC32232i.m155455c(MainApplication.getAppContext());

    /* renamed from: J */
    public ChatHeadTextView f98598J = null;

    /* renamed from: L */
    public RectF f98600L = new RectF();

    /* renamed from: M */
    public boolean f98601M = false;

    /* renamed from: N */
    private final Map f98602N = new HashMap();

    /* renamed from: P */
    C17487o0 f98604P = new b();

    /* renamed from: Q */
    Runnable f98605Q = new Runnable() { // from class: hg.a
        public /* synthetic */ RunnableC20050a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C20052c.this.m104130D();
        }
    };

    /* renamed from: R */
    boolean f98606R = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hg.c$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC18911b {
        a() {
        }

        @Override // p161fg.InterfaceC18911b
        /* renamed from: c */
        public ZaloView mo99117a(C18927r c18927r, ChatHead chatHead, ViewGroup viewGroup) {
            C20052c c20052c = C20052c.this;
            if (c20052c.f98601M) {
                return null;
            }
            ZaloView zaloView = (ZaloView) c20052c.f98602N.get(c18927r);
            if (zaloView == null) {
                if (c18927r.f94428s == null) {
                    c18927r.f94428s = new Bundle();
                }
                c18927r.f94428s.putInt("SHOW_WITH_FLAGS", 67108864);
                ZaloView mo57057c2 = C20052c.this.mo35579p().mo57057c2(AbstractC6918a0.zalo_view_container, c18927r.f94431v, c18927r.f94428s, 0, null, 0, true);
                C20052c.this.f98602N.put(c18927r, mo57057c2);
                return mo57057c2;
            }
            return zaloView;
        }

        @Override // p161fg.InterfaceC18911b
        /* renamed from: d */
        public void mo99118b(C18927r c18927r, ChatHead chatHead, ViewGroup viewGroup) {
            try {
                ZaloView zaloView = (ZaloView) C20052c.this.f98602N.get(c18927r);
                if (zaloView != null) {
                    AbstractC2379w.m12430d(viewGroup.findFocus());
                    C20052c.this.f98602N.remove(c18927r);
                    C20052c.this.mo35579p().mo92702G1(zaloView, 0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatHeadManager", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hg.c$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC17489p0 {
        b() {
        }

        @Override // com.zing.zalo.zview.AbstractC17489p0, com.zing.zalo.zview.C17487o0
        /* renamed from: c2 */
        public ZaloView mo57057c2(int i11, Class cls, Bundle bundle, int i12, String str, int i13, boolean z11) {
            if (!cls.equals(MyInfoView.class) && !cls.equals(UserDetailsView.class) && !cls.equals(GroupLiveStreamView.class) && !cls.equals(GroupLiveStreamPlaybackView.class) && !cls.equals(ShareView.class) && !cls.equals(MutualFeedView.class) && !cls.equals(FeedDetailsView.class) && !cls.equals(ImageCommentView.class) && !cls.equals(FindFriendByPhoneNumberView.class) && !cls.equals(SettingHiddenChatView.class) && !cls.equals(ZaloWebView.class) && !cls.equals(UpdateStatusView.class) && ((!cls.equals(StoryDetailsView.class) || AbstractC26683d.f126396o) && !cls.equals(MyCalendarView.class) && !cls.equals(MainTabView.class) && !cls.equals(QuickCreateGroupView.class) && !cls.equals(MiniProfileView.class) && !cls.equals(ListContactNativeView.class) && !cls.equals(SettingContactView.class) && !cls.equals(SettingThemeV2View.class) && !cls.equals(StoryDetailsView.class) && !cls.equals(BackupDetailView.class) && !cls.equals(SettingBackupRestoreView.class) && !cls.equals(ProductManageView.class) && !cls.equals(ProductAddEditView.class) && !cls.equals(ReportSummaryView.class) && !cls.equals(ReportAttachmentView.class) && !cls.equals(ReportSuccessActionView.class) && !cls.equals(ManageGoogleAccountView.class) && !cls.equals(ZCloudHomeView.class) && !AbstractC27418m.m140397a(cls))) {
                if (cls.equals(Cocos2dxLoadingView.class)) {
                    return super.mo57057c2(AbstractC6918a0.chat_head_full_container, cls, bundle, i12, str, i13, z11);
                }
                return super.mo57057c2(i11, cls, bundle, i12, str, i13, z11);
            }
            Intent m119014P = AbstractC23152n3.m119014P(cls, bundle, false);
            m119014P.addFlags(268435456);
            C20052c.this.getContext().startActivity(m119014P);
            return null;
        }
    }

    /* renamed from: hg.c$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC21707d {
        c() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            if (C20052c.this.f98599K != null) {
                C20052c.this.f98599K.setAlpha((float) c21709f.m112033d());
            }
        }
    }

    /* renamed from: hg.c$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        final Class f98621a;

        public d(Class cls) {
            this.f98621a = cls;
        }

        /* renamed from: a */
        public Class m104176a() {
            return this.f98621a;
        }
    }

    public C20052c(Context context, C20548b c20548b, InterfaceC18910a interfaceC18910a) {
        this.f98608q = context;
        this.f98609r = c20548b;
        this.f98603O = interfaceC18910a;
        m104121F(context, new C21243a());
        m104148a0(new a());
    }

    /* renamed from: F */
    private void m104121F(Context context, C21243a c21243a) {
        this.f98609r.m106795r(this);
        this.f98593E = context.getResources().getDisplayMetrics();
        this.f98591C = c21243a;
        this.f98610s = new ArrayList(5);
        View view = new View(context);
        this.f98599K = view;
        view.setBackgroundColor(-1728053248);
        this.f98599K.setAlpha(0.0f);
        this.f98609r.m106781d(this.f98599K, m104164m().m106784g(-1, -1, 0, 0));
        C21715l m112062k = C21715l.m112062k();
        this.f98589A = m112062k;
        C21709f m112019d = m112062k.m112019d();
        this.f98590B = m112019d;
        m112019d.m112048u(C21711h.m112058a(40.0d, 9.0d));
        this.f98590B.m112030a(new c());
        UpArrowLayout upArrowLayout = new UpArrowLayout(context);
        this.f98594F = upArrowLayout;
        upArrowLayout.setId(AbstractC6918a0.zalo_view_container);
        this.f98594F.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C20548b c20548b = this.f98609r;
        UpArrowLayout upArrowLayout2 = this.f98594F;
        c20548b.m106781d(upArrowLayout2, upArrowLayout2.getLayoutParams());
        this.f98614w = new ChatHeadCloseButton(context, this);
        this.f98609r.m106781d(this.f98614w, this.f98609r.m106784g(c21243a.f103548f, c21243a.f103547e, 8388659, 0));
        this.f98607p.put(C19443f.class, new C19443f(this));
        this.f98607p.put(C19442e.class, new C19442e(this));
        m104146Y(c21243a);
        C21712i.m112059b().m112060a(AbstractC21245c.f103557d, "dragging mode");
        C21712i.m112059b().m112060a(AbstractC21245c.f103554a, "not dragging mode");
        this.f98604P.m92989C(this, new InterfaceC17502s() { // from class: hg.b
            public /* synthetic */ C20051b() {
            }

            @Override // com.zing.zalo.zview.InterfaceC17502s
            public final View findViewById(int i11) {
                View m104122K;
                m104122K = C20052c.this.m104122K(i11);
                return m104122K;
            }
        }, null);
        this.f98604P.m93047Y();
        this.f98604P.m93038V();
        this.f98604P.m93090x0();
        this.f98604P.m93087w0();
        this.f98596H = new Handler(Looper.getMainLooper());
    }

    /* renamed from: K */
    public /* synthetic */ View m104122K(int i11) {
        if (i11 == AbstractC6918a0.chat_head_full_container) {
            return this.f98609r.m106788k().getFullContainerFrameLayout();
        }
        if (i11 != 16908290 && i11 != AbstractC6918a0.zalo_view_container) {
            return this.f98594F.findViewById(i11);
        }
        return this.f98594F;
    }

    /* renamed from: X */
    private void m104123X(d dVar) {
        boolean z11;
        AbstractC19438a abstractC19438a = (AbstractC19438a) this.f98607p.get(dVar.m104176a());
        AbstractC19438a abstractC19438a2 = this.f98615x;
        if (abstractC19438a2 != abstractC19438a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (abstractC19438a2 != null) {
            abstractC19438a2.mo101666h(this.f98612u, this.f98613v);
            this.f98616y = this.f98615x;
        }
        this.f98615x = abstractC19438a;
        if (abstractC19438a != null) {
            abstractC19438a.mo101662d(this.f98612u, this.f98613v, true, null);
            if (z11) {
                this.f98609r.m106794q(this.f98616y, abstractC19438a);
            }
        }
    }

    /* renamed from: A */
    public AbstractC19438a m104127A() {
        return this.f98616y;
    }

    /* renamed from: B */
    public C21715l m104128B() {
        return this.f98589A;
    }

    /* renamed from: C */
    public int m104129C() {
        return this.f98617z;
    }

    /* renamed from: D */
    public void m104130D() {
        ChatHeadTextView chatHeadTextView = this.f98598J;
        if (chatHeadTextView != null) {
            chatHeadTextView.setVisibility(8);
            this.f98596H.removeCallbacks(this.f98605Q);
        }
    }

    /* renamed from: E */
    public void m104131E() {
        this.f98590B.m112046s(0.0d);
    }

    /* renamed from: G */
    public boolean m104132G() {
        AbstractC19438a abstractC19438a = this.f98615x;
        if (abstractC19438a != null) {
            return abstractC19438a instanceof C19442e;
        }
        d dVar = this.f98592D;
        if (dVar != null && dVar.m104176a() == C19442e.class) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean m104133H() {
        AbstractC19438a abstractC19438a = this.f98615x;
        if (abstractC19438a != null) {
            return abstractC19438a instanceof C19443f;
        }
        d dVar = this.f98592D;
        if (dVar != null && dVar.m104176a() == C19443f.class) {
            return true;
        }
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: H2 */
    public void mo35551H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        int i12 = 0;
        if (bundle != null) {
            i12 = bundle.getInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 0);
        }
        mo35579p().mo57057c2(AbstractC6918a0.chat_head_full_container, AbstractC32146v5.m155121d(i12), bundle, i11, null, 1, true);
    }

    /* renamed from: I */
    public boolean m104134I() {
        return this.f98612u < this.f98613v;
    }

    /* renamed from: J */
    public boolean m104135J() {
        return this.f98606R;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    /* renamed from: L */
    public void m104136L(WindowInsets windowInsets) {
        this.f98617z = AbstractC32232i.m155455c(MainApplication.getAppContext());
        this.f98604P.m93041W(windowInsets);
    }

    /* renamed from: M */
    void m104137M(ChatHead chatHead) {
        if (chatHead != null && chatHead.getParent() != null) {
            chatHead.m39818D();
            this.f98609r.m106797t(chatHead);
        }
    }

    /* renamed from: N */
    public void m104138N() {
        UpArrowLayout upArrowLayout = this.f98594F;
        if (upArrowLayout != null) {
            upArrowLayout.m39856b();
        }
        List list = this.f98610s;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < this.f98610s.size(); i11++) {
                ((ChatHead) this.f98610s.get(i11)).m39820H();
            }
        }
        m104155f0(C23212s8.m119610r(AbstractC16781w.logo_zalo_chathead));
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: O */
    public void mo35554O(int i11) {
    }

    /* renamed from: P */
    public void m104139P(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        C17799h.m94029a().f90033h = i11;
        C17799h.m94029a().f90034i = i12;
        int i15 = this.f98613v;
        boolean z12 = true;
        if (i12 != i15 && i11 != (i14 = this.f98612u) && i14 != 0 && i15 != 0 && (i15 >= i12 || i14 >= i11)) {
            m104140Q();
            z11 = true;
        } else {
            z11 = false;
        }
        if (getResources().getConfiguration().orientation != 2 || (i13 = this.f98612u) == 0 || i11 == 0 || i13 == i11) {
            z12 = false;
        }
        this.f98613v = i12;
        this.f98612u = i11;
        this.f98614w.m39843n();
        this.f98614w.m39846r((int) (i11 * 0.5f), (int) (i12 * 0.9f));
        this.f98600L.set((r8 - (m104167s().f103547e / 2)) - AbstractC21244b.m110052b(getContext(), 20), (r9 - (m104167s().f103548f / 2)) - AbstractC21244b.m110052b(getContext(), 20), r8 + (m104167s().f103547e / 2) + AbstractC21244b.m110052b(getContext(), 20), r9 + (m104167s().f103548f / 2) + AbstractC21244b.m110052b(getContext(), 20));
        if (this.f98613v > 0 && this.f98612u > 0) {
            d dVar = this.f98592D;
            if (dVar != null) {
                m104123X(dVar);
                this.f98592D = null;
                return;
            }
            if (z11) {
                m104123X(new d(this.f98615x.getClass()));
                return;
            }
            if (z12) {
                if (m104132G()) {
                    ((C19442e) this.f98615x).m101676B(this.f98612u, this.f98613v);
                } else if (m104133H()) {
                    m104123X(new d(this.f98615x.getClass()));
                }
            }
        }
    }

    /* renamed from: Q */
    void m104140Q() {
        m104130D();
        C20548b c20548b = this.f98609r;
        if (c20548b != null) {
            c20548b.m106796s();
        }
    }

    /* renamed from: R */
    public void m104141R(int i11, int i12, int i13, int i14) {
        ChatHeadCloseButton chatHeadCloseButton = this.f98614w;
        if (chatHeadCloseButton != null) {
            chatHeadCloseButton.m39843n();
        }
    }

    /* renamed from: S */
    public void m104142S() {
        this.f98601M = true;
        ChatHeadTextView chatHeadTextView = this.f98598J;
        if (chatHeadTextView != null && chatHeadTextView.getParent() != null) {
            this.f98609r.m106793p().removeView(this.f98598J);
            this.f98598J = null;
        }
        List list = this.f98610s;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f98610s.iterator();
            while (it.hasNext()) {
                ChatHead chatHead = (ChatHead) it.next();
                it.remove();
                m104137M(chatHead);
            }
        }
        InterfaceC18910a interfaceC18910a = this.f98603O;
        if (interfaceC18910a != null) {
            interfaceC18910a.mo99115b(m104132G());
        }
    }

    /* renamed from: T */
    public boolean m104143T(C18927r c18927r) {
        boolean z11;
        List list;
        ChatHead m104159i = m104159i(c18927r);
        if (m104159i != null) {
            this.f98610s.remove(m104159i);
            m104137M(m104159i);
            AbstractC19438a abstractC19438a = this.f98615x;
            if (abstractC19438a != null) {
                abstractC19438a.mo101664f(m104159i);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (!c18927r.m99173b() && ((list = this.f98610s) == null || list.size() != m104167s().f103553k)) {
            C18922m.m99141t().m99153W();
        } else {
            m104142S();
        }
        return z11;
    }

    /* renamed from: U */
    public void m104144U() {
        if (m104170w() < m104165n().size() && !((ChatHead) m104165n().get(m104170w())).getUser().f94432w) {
            int i11 = 0;
            while (true) {
                if (i11 >= m104165n().size()) {
                    break;
                }
                if (i11 == m104170w()) {
                    while (i11 < m104165n().size() - 1) {
                        int i12 = i11 + 1;
                        Collections.swap(m104165n(), i11, i12);
                        i11 = i12;
                    }
                } else {
                    i11++;
                }
            }
        }
        m104147Z(m104165n().size() - 1);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: V */
    public void mo35556V(ImageView imageView, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
        int i12 = 0;
        if (bundle != null) {
            i12 = bundle.getInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 0);
        }
        mo35579p().mo57057c2(AbstractC6918a0.chat_head_full_container, AbstractC32146v5.m155121d(i12), bundle, i11, null, 1, true);
    }

    /* renamed from: W */
    public void m104145W(Class cls) {
        InterfaceC18910a interfaceC18910a;
        AbstractC20110a.m104542k(8, "setArrangement: %s", cls);
        if (!AbstractC23309i.m120862De()) {
            m104161j0(cls.equals(C19442e.class));
        }
        this.f98592D = new d(cls);
        this.f98609r.m106798u();
        if (cls.isAssignableFrom(C19442e.class)) {
            InterfaceC18910a interfaceC18910a2 = this.f98603O;
            if (interfaceC18910a2 != null) {
                interfaceC18910a2.mo99114a();
                return;
            }
            return;
        }
        if (cls.isAssignableFrom(C19443f.class) && (interfaceC18910a = this.f98603O) != null) {
            interfaceC18910a.mo99116c();
        }
    }

    /* renamed from: Y */
    public void m104146Y(C21243a c21243a) {
        this.f98591C = c21243a;
        ChatHeadCloseButton chatHeadCloseButton = this.f98614w;
        if (chatHeadCloseButton != null) {
            if (c21243a.f103552j) {
                chatHeadCloseButton.setVisibility(8);
            } else {
                chatHeadCloseButton.setVisibility(0);
            }
        }
        Iterator it = this.f98607p.entrySet().iterator();
        while (it.hasNext()) {
            ((AbstractC19438a) ((Map.Entry) it.next()).getValue()).mo101665g(c21243a);
        }
    }

    /* renamed from: Z */
    public void m104147Z(int i11) {
        this.f98611t = i11;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: a */
    public boolean mo35559a() {
        return false;
    }

    /* renamed from: a0 */
    public void m104148a0(InterfaceC18911b interfaceC18911b) {
        this.f98595G = interfaceC18911b;
    }

    /* renamed from: b0 */
    public void m104149b0(boolean z11) {
        int i11;
        this.f98606R = z11;
        C20548b c20548b = this.f98609r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c20548b.m106777B(i11);
        ChatHeadTextView chatHeadTextView = this.f98598J;
        if (chatHeadTextView != null && !z11) {
            chatHeadTextView.setVisibility(8);
        }
        if (z11) {
            mo35579p().m93087w0();
        } else {
            mo35579p().m93095z0();
        }
    }

    /* renamed from: c0 */
    public void m104150c0(CharSequence charSequence, boolean z11, int i11, int i12) {
        if (!this.f98606R) {
            return;
        }
        m104130D();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, AbstractC32232i.f148649a, 264, -3);
        layoutParams.gravity = 51;
        AbstractC32232i.m155461i(this.f98608q, layoutParams);
        ChatHeadTextView chatHeadTextView = this.f98598J;
        if (chatHeadTextView == null) {
            ChatHeadTextView chatHeadTextView2 = new ChatHeadTextView(this.f98608q);
            this.f98598J = chatHeadTextView2;
            chatHeadTextView2.m39854d(charSequence, z11);
            if (i11 < m104173z() / 2) {
                m104167s();
                layoutParams.x = ((((i11 + C21243a.f103541p) + ChatHeadTextView.f42060B) - ChatHeadTextView.f42068x) - ChatHead.f41974p0) - ChatHead.f41973o0;
            } else {
                layoutParams.x = ((i11 - this.f98598J.getViewWidth()) - ChatHeadTextView.f42060B) + ChatHeadTextView.f42068x + ChatHead.f41974p0 + ChatHead.f41973o0;
            }
            m104167s();
            layoutParams.y = i12 + (((C21243a.f103540o - this.f98598J.getViewHeight()) - ChatHeadTextView.f42069y) / 2);
            this.f98609r.m106793p().addView(this.f98598J, layoutParams);
        } else {
            chatHeadTextView.setVisibility(0);
            this.f98598J.m39854d(charSequence, z11);
            if (i11 < m104173z() / 2) {
                m104167s();
                layoutParams.x = ((((i11 + C21243a.f103541p) + ChatHeadTextView.f42060B) - ChatHeadTextView.f42068x) - ChatHead.f41974p0) - ChatHead.f41973o0;
            } else {
                layoutParams.x = ((i11 - this.f98598J.getViewWidth()) - ChatHeadTextView.f42060B) + ChatHeadTextView.f42068x + ChatHead.f41974p0 + ChatHead.f41973o0;
            }
            m104167s();
            layoutParams.y = i12 + (((C21243a.f103540o - this.f98598J.getViewHeight()) - ChatHeadTextView.f42069y) / 2);
            this.f98609r.m106793p().updateViewLayout(this.f98598J, layoutParams);
        }
        this.f98596H.postDelayed(this.f98605Q, 5000L);
    }

    /* renamed from: d0 */
    public void m104151d0() {
        this.f98590B.m112046s(1.0d);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: d1 */
    public boolean mo35567d1() {
        if (!mo35576n3() && !mo35586v2()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public ChatHead m104152e(C18927r c18927r, boolean z11) {
        ChatHead m104159i = m104159i(c18927r);
        if (m104159i == null) {
            m104159i = new ChatHead(this, this.f98589A, getContext());
            m104159i.setUser(c18927r);
            this.f98610s.add(m104159i);
            C20548b c20548b = this.f98609r;
            m104167s();
            int i11 = C21243a.f103541p;
            m104167s();
            this.f98609r.m106781d(m104159i, c20548b.m106784g(i11, C21243a.f103539n, 8388659, 0));
            if (this.f98610s.size() > this.f98591C.f103546d) {
                AbstractC19438a abstractC19438a = this.f98615x;
                if (abstractC19438a != null) {
                    abstractC19438a.mo101668j();
                } else {
                    m104143T(((ChatHead) this.f98610s.get(0)).getUser());
                }
            }
            AbstractC19438a abstractC19438a2 = this.f98615x;
            if (abstractC19438a2 != null) {
                abstractC19438a2.mo101663e(m104159i, z11);
            }
        } else {
            m104159i.setUser(c18927r);
            if (m104132G() && z11) {
                ((C19442e) this.f98615x).m101677C(C19442e.d.SWITCH_TAB, m104159i);
                this.f98615x.mo101661c();
            }
            if (m104133H()) {
                this.f98615x.mo101663e(m104159i, true);
            }
        }
        if (this.f98615x == null) {
            m104147Z(this.f98610s.size() - 1);
        }
        return m104159i;
    }

    /* renamed from: e0 */
    public void m104153e0(String str, List list, int i11) {
        ChatHead chatHead;
        int i12 = 0;
        while (true) {
            try {
                if (i12 < this.f98610s.size()) {
                    if (((ChatHead) this.f98610s.get(i12)).getUser().f94425p.equals(str)) {
                        chatHead = (ChatHead) this.f98610s.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    chatHead = null;
                    break;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatHeadManager", e11);
                return;
            }
        }
        if (chatHead != null) {
            chatHead.m39823L(list, i11);
        }
    }

    /* renamed from: f */
    public ZaloView m104154f(ChatHead chatHead, ViewGroup viewGroup) {
        InterfaceC18911b interfaceC18911b = this.f98595G;
        if (interfaceC18911b != null) {
            return interfaceC18911b.mo99117a(chatHead.getUser(), chatHead, viewGroup);
        }
        return null;
    }

    /* renamed from: f0 */
    public void m104155f0(int i11) {
        ChatHead m104171x = m104171x();
        if (m104171x != null) {
            m104171x.getUser().f94430u = i11;
            m104171x.setAvatar(i11);
        }
    }

    @Override // p542ub.InterfaceC27218a
    public View findViewById(int i11) {
        return this.f98609r.m106788k().findViewById(i11);
    }

    @Override // p542ub.InterfaceC27218a
    public void finish() {
        this.f98604P.m93050Z();
        C18922m.m99141t().m99157q();
    }

    /* renamed from: g */
    public void m104156g(ChatHead chatHead, ViewGroup viewGroup) {
        InterfaceC18911b interfaceC18911b = this.f98595G;
        if (interfaceC18911b != null) {
            interfaceC18911b.mo99118b(chatHead.getUser(), chatHead, viewGroup);
        }
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: g0 */
    public View mo35570g0() {
        return this.f98609r.m106788k();
    }

    @Override // p542ub.InterfaceC27218a
    public AssetManager getAssets() {
        return this.f98608q.getAssets();
    }

    @Override // p542ub.InterfaceC27218a
    public Context getContext() {
        return this.f98608q;
    }

    @Override // p542ub.InterfaceC27218a
    public View getCurrentFocus() {
        return this.f98609r.m106788k().findFocus();
    }

    @Override // p542ub.InterfaceC27218a
    public Intent getIntent() {
        if (this.f98597I == null) {
            this.f98597I = new Intent();
        }
        return this.f98597I;
    }

    @Override // p542ub.InterfaceC27218a
    public LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(this.f98608q);
    }

    @Override // p542ub.InterfaceC27218a
    public int getRequestedOrientation() {
        return 1;
    }

    @Override // p542ub.InterfaceC27218a
    public Resources getResources() {
        return getContext().getResources();
    }

    @Override // p542ub.InterfaceC27218a
    public String getString(int i11) {
        return this.f98608q.getString(i11);
    }

    @Override // p542ub.InterfaceC27218a
    public Window getWindow() {
        return null;
    }

    /* renamed from: h */
    public ChatHead m104157h(String str) {
        try {
            for (ChatHead chatHead : this.f98610s) {
                if (chatHead.getUser().f94425p.equals(str)) {
                    return chatHead;
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatHeadManager", e11);
            return null;
        }
    }

    /* renamed from: h0 */
    public void m104158h0(int i11) {
        try {
            ChatHead m104171x = m104171x();
            if (m104171x != null) {
                m104171x.m39826O(i11);
                m104171x.m39819G();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatHeadManager", e11);
        }
    }

    /* renamed from: i */
    public ChatHead m104159i(C18927r c18927r) {
        for (ChatHead chatHead : this.f98610s) {
            if (chatHead.getUser().equals(c18927r)) {
                return chatHead;
            }
        }
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: i0 */
    public boolean mo35572i0() {
        return true;
    }

    @Override // p542ub.InterfaceC27218a
    public boolean isDestroyed() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public boolean isFinishing() {
        return this.f98601M;
    }

    /* renamed from: j */
    public AbstractC19438a m104160j() {
        AbstractC19438a abstractC19438a = this.f98615x;
        if (abstractC19438a != null) {
            return abstractC19438a;
        }
        return null;
    }

    /* renamed from: j0 */
    public void m104161j0(boolean z11) {
        C20548b c20548b = this.f98609r;
        if (c20548b != null) {
            c20548b.m106778C(z11);
        }
    }

    /* renamed from: k */
    public ChatHead m104162k() {
        int i11 = this.f98611t;
        if (i11 >= 0 && i11 < this.f98610s.size()) {
            return (ChatHead) this.f98610s.get(this.f98611t);
        }
        return null;
    }

    /* renamed from: l */
    public UpArrowLayout m104163l() {
        return this.f98594F;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: l4 */
    public void mo35573l4(Class cls, Bundle bundle, int i11, boolean z11) {
        mo35581q(cls, bundle, 0, i11, z11);
    }

    /* renamed from: m */
    public C20548b m104164m() {
        return this.f98609r;
    }

    /* renamed from: n */
    public List m104165n() {
        return this.f98610s;
    }

    @Override // p542ub.InterfaceC27219b
    /* renamed from: n1 */
    public Activity mo35575n1() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: n3 */
    public boolean mo35576n3() {
        return true;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: o */
    public boolean mo35577o() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.f98604P.m93088w1(i11, i12, intent);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: p */
    public C17487o0 mo35579p() {
        return this.f98604P;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: q */
    public void mo35581q(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        if (cls.equals(ChatView.class)) {
            if (bundle != null && bundle.containsKey("extra_chat_profile_uid")) {
                String string = bundle.getString("extra_chat_profile_uid");
                String string2 = bundle.getString("extra_chat_profile_avt");
                ContactProfile m141809c = C28203u6.f131407a.m141809c(string);
                if (m141809c == null) {
                    m141809c = new ContactProfile(string);
                    m141809c.f42446v = string2;
                }
                C18922m.m99141t().m99148R(bundle, m141809c);
                return;
            }
            return;
        }
        this.f98604P.m93066i2(cls, bundle, i11, i12, z11);
    }

    /* renamed from: r */
    public ChatHeadCloseButton m104166r() {
        return this.f98614w;
    }

    @Override // p542ub.InterfaceC27219b
    public void requestPermissions(String[] strArr, int i11) {
        if (strArr != null && strArr.length != 0) {
            C18922m.f94409e = false;
            Bundle bundle = new Bundle();
            bundle.putStringArray("EXTRA_PERMISSION", strArr);
            bundle.putInt("EXTRA_REQUEST_CODE", i11);
            Intent intent = new Intent(getContext(), (Class<?>) MiniChatRequestPermissionActivity.class);
            intent.addFlags(335544320);
            intent.putExtra("EXTRA_BUNDLE", bundle);
            getContext().startActivity(intent);
        }
    }

    @Override // p542ub.InterfaceC27218a
    public void runOnUiThread(Runnable runnable) {
        this.f98596H.post(runnable);
    }

    /* renamed from: s */
    public C21243a m104167s() {
        return this.f98591C;
    }

    @Override // p542ub.InterfaceC27218a
    public void setRequestedOrientation(int i11) {
    }

    @Override // p542ub.InterfaceC27219b
    public boolean shouldShowRequestPermissionRationale(String str) {
        return false;
    }

    @Override // p542ub.InterfaceC27218a, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        intent.setFlags(268435456);
        this.f98608q.startActivity(intent);
        C18922m.m99141t().m99143L();
    }

    @Override // p542ub.InterfaceC27218a
    public void startActivityForResult(Intent intent, int i11) {
        intent.setFlags(268435456);
        this.f98608q.startActivity(intent);
        C18922m.m99141t().m99143L();
    }

    /* renamed from: t */
    public DisplayMetrics m104168t() {
        return this.f98593E;
    }

    /* renamed from: u */
    public double m104169u(float f11, float f12) {
        ChatHeadCloseButton chatHeadCloseButton = this.f98614w;
        return Math.hypot(f11 - chatHeadCloseButton.f42049w, f12 - chatHeadCloseButton.f42050x);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v */
    public View mo35585v() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v2 */
    public boolean mo35586v2() {
        return false;
    }

    /* renamed from: w */
    public int m104170w() {
        return this.f98611t;
    }

    /* renamed from: x */
    public ChatHead m104171x() {
        for (int i11 = 0; i11 < this.f98610s.size(); i11++) {
            if (((ChatHead) this.f98610s.get(i11)).getUser().m99173b()) {
                return (ChatHead) this.f98610s.get(i11);
            }
        }
        return null;
    }

    /* renamed from: y */
    public int m104172y() {
        return this.f98613v;
    }

    /* renamed from: z */
    public int m104173z() {
        return this.f98612u;
    }
}
