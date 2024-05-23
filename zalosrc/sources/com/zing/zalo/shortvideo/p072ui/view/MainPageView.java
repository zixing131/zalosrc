package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.VideoReceiver;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.MainPageLayout;
import com.zing.zalo.shortvideo.p072ui.view.MainPageView;
import com.zing.zalo.shortvideo.p072ui.view.SearchPageView;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.MenuBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import e20.InterfaceC18189c;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18705c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import gg0.AbstractC19444a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k20.C21456b;
import l20.C22006a;
import l20.InterfaceC22007b;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25006f2;
import q20.C25090m;
import q20.C25097t;
import qm0.AbstractC25361o0;
import s20.AbstractC26102d;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import x00.InterfaceC29280a;
import x00.InterfaceC29283d;

/* loaded from: classes5.dex */
public final class MainPageView extends AbstractC10623a implements MainPageLayout.InterfaceC10301a, InterfaceC18189c, C21456b.c, ZchBaseView.InterfaceC10622a {
    public static final C10303b Companion = new C10303b(null);

    /* renamed from: B0 */
    private NotificationReceiver f52988B0;

    /* renamed from: C0 */
    private VideoReceiver f52989C0;

    /* renamed from: D0 */
    private C18705c f52990D0;

    /* renamed from: E0 */
    private long f52991E0;

    /* renamed from: F0 */
    private final C10304c f52992F0;

    /* renamed from: G0 */
    private C21456b.b f52993G0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10302a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10302a f52994y = new C10302a();

        C10302a() {
            super(3, C25006f2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageMainBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54535h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25006f2 m54535h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25006f2.m129813c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10303b {
        private C10303b() {
        }

        public /* synthetic */ C10303b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Bundle m54536b(C10303b c10303b, int i11, Video video, boolean z11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            return c10303b.m54537a(i11, video, z11);
        }

        /* renamed from: a */
        public final Bundle m54537a(int i11, Video video, boolean z11) {
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SELECTED_TAB_ID", Integer.valueOf(i11)), AbstractC24866w.m129235a("RESERVED_VIDEO", video), AbstractC24866w.m129235a("SHOW_TOOLTIP_NEW_VIDEO", Boolean.valueOf(z11)), AbstractC24866w.m129235a("SHOW_WITH_FLAGS", 16777216));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$c */
    /* loaded from: classes5.dex */
    public static final class C10304c implements InterfaceC22007b {
        C10304c() {
        }

        @Override // l20.InterfaceC22007b
        /* renamed from: a */
        public void mo54538a(boolean z11) {
            ImageView imageView;
            C25006f2 c25006f2 = (C25006f2) MainPageView.this.m55556SK();
            if (c25006f2 != null && (imageView = c25006f2.f119904s) != null) {
                if (z11) {
                    AbstractC26112n.m134431w0(imageView);
                } else {
                    AbstractC26112n.m134374O(imageView);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$d */
    /* loaded from: classes5.dex */
    static final class C10305d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25006f2 f52997r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10305d(C25006f2 c25006f2) {
            super(1);
            this.f52997r = c25006f2;
        }

        /* renamed from: a */
        public final void m54539a(boolean z11) {
            Integer m98638G;
            C18705c c18705c = MainPageView.this.f52990D0;
            if (c18705c != null && (m98638G = c18705c.m98638G(C18705c.d.f93973r)) != null) {
                this.f52997r.f119902q.m55965j(m98638G.intValue());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54539a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$e */
    /* loaded from: classes5.dex */
    static final class C10306e extends AbstractC19075u implements InterfaceC18505l {
        C10306e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54540a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = MainPageView.this.m92652XI(AbstractC27413h.zch_action_key_quit_icon);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            ZaloActivity zaloActivity = null;
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            MainPageView.this.m55549OK(true);
            ZchMasterView m55543KK = MainPageView.this.m55543KK();
            if (m55543KK != null) {
                m55543KK.finish();
            }
            StateManager.C10098a c10098a = StateManager.Companion;
            String m55544LK = MainPageView.this.m55544LK();
            InterfaceC27218a m92676n2 = MainPageView.this.m92676n2();
            if (m92676n2 instanceof ZaloActivity) {
                zaloActivity = (ZaloActivity) m92676n2;
            }
            c10098a.m53806j(m55544LK, zaloActivity);
            c10098a.m53798b();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54540a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$f */
    /* loaded from: classes5.dex */
    static final class C10307f extends AbstractC19075u implements InterfaceC18505l {
        C10307f() {
            super(1);
        }

        /* renamed from: a */
        public final void m54541a(View view) {
            Map m131401f;
            C17487o0 mo35579p;
            C17507u0 m92998F;
            AbstractC19074t.m100208f(view, "it");
            MainPageView.this.m55549OK(true);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = MainPageView.this.m92652XI(AbstractC27413h.zch_action_key_floating_btn);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 1));
            c19205a.m100713L(m92652XI, m131401f);
            FloatingManager.Companion.m53872n();
            StateManager.Companion.m53805i();
            InterfaceC27218a m92676n2 = MainPageView.this.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null && (m92998F = mo35579p.m92998F(ZChannelFloatingAnimView.class, true)) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("xAnim4View", 1);
                C17507u0 m93139f = m92998F.m93139f(bundle);
                if (m93139f != null) {
                    m93139f.m93136a();
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54541a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$g */
    /* loaded from: classes5.dex */
    static final class C10308g extends AbstractC19075u implements InterfaceC18505l {
        C10308g() {
            super(1);
        }

        /* renamed from: a */
        public final void m54542a(View view) {
            AbstractC19074t.m100208f(view, "it");
            MainPageView.this.m55551QK(SearchPageView.C10392b.m54825c(SearchPageView.Companion, null, 1, null));
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = MainPageView.this.m92652XI(AbstractC27413h.zch_action_key_search_from_feed);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54542a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$h */
    /* loaded from: classes5.dex */
    static final class C10309h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ImageView f53002r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC29280a f53003s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10309h(ImageView imageView, InterfaceC29280a interfaceC29280a) {
            super(1);
            this.f53002r = imageView;
            this.f53003s = interfaceC29280a;
        }

        /* renamed from: a */
        public final void m54543a(View view) {
            AbstractC19074t.m100208f(view, "it");
            MainPageView.this.m55551QK(new SettingView());
            ImageView imageView = this.f53002r;
            Context m92689tK = MainPageView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            imageView.setImageDrawable(C27280g.m139658a(m92689tK, AbstractC23322a.zch_ic_user_rectangle_shadow_line_24));
            this.f53003s.mo146315Q(false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54543a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$i */
    /* loaded from: classes5.dex */
    public static final class C10310i extends ViewPager.C6879n {

        /* renamed from: p */
        private int f53004p;

        /* renamed from: q */
        final /* synthetic */ MainPageView f53005q;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$i$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f53006a;

            static {
                int[] iArr = new int[C18705c.d.values().length];
                try {
                    iArr[C18705c.d.f93972q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C18705c.d.f93974s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C18705c.d.f93973r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f53006a = iArr;
            }
        }

        C10310i(NonSwipeableViewPager nonSwipeableViewPager, MainPageView mainPageView) {
            this.f53005q = mainPageView;
            this.f53004p = nonSwipeableViewPager.getCurrentItem();
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            C18705c.d dVar;
            int i12;
            Map m131401f;
            Map m131401f2;
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            C18705c c18705c = this.f53005q.f52990D0;
            if (c18705c != null) {
                dVar = c18705c.m98637F(i11);
            } else {
                dVar = null;
            }
            if (dVar == null) {
                i12 = -1;
            } else {
                i12 = a.f53006a[dVar.ordinal()];
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        C19205a c19205a = C19205a.f95429a;
                        String m92652XI = this.f53005q.m92652XI(AbstractC27413h.zch_action_key_open_recommend_tab);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                    }
                } else {
                    C19205a c19205a2 = C19205a.f95429a;
                    String m92652XI2 = this.f53005q.m92652XI(AbstractC27413h.zch_action_key_open_friend_tab);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    m131401f2 = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("is_highlight", Boolean.valueOf(m143692z.mo146374m())));
                    c19205a2.m100713L(m92652XI2, m131401f2);
                }
            } else {
                C19205a c19205a3 = C19205a.f95429a;
                String m92652XI3 = this.f53005q.m92652XI(AbstractC27413h.zch_action_key_open_following_tab);
                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("is_highlight", Boolean.valueOf(m143692z.mo146367f())));
                c19205a3.m100713L(m92652XI3, m131401f);
            }
            C18705c c18705c2 = this.f53005q.f52990D0;
            if (c18705c2 != null) {
                c18705c2.m98636E(this.f53004p);
            }
            C18705c c18705c3 = this.f53005q.f52990D0;
            if (c18705c3 != null) {
                c18705c3.m98635D(i11);
            }
            this.f53004p = i11;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$j */
    /* loaded from: classes5.dex */
    static final class C10311j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25006f2 f53007q;

        /* renamed from: r */
        final /* synthetic */ MainPageView f53008r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10311j(C25006f2 c25006f2, MainPageView mainPageView) {
            super(1);
            this.f53007q = c25006f2;
            this.f53008r = mainPageView;
        }

        /* renamed from: a */
        public final void m54544a(boolean z11) {
            int i11;
            ImageView imageView = this.f53007q.f119905t;
            Context m92689tK = this.f53008r.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            if (z11) {
                i11 = AbstractC23322a.zch_ic_user_rectangle_shadow_dot_line_24;
            } else {
                i11 = AbstractC23322a.zch_ic_user_rectangle_shadow_line_24;
            }
            imageView.setImageDrawable(C27280g.m139658a(m92689tK, i11));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54544a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$k */
    /* loaded from: classes5.dex */
    static final class C10312k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25006f2 f53010r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10312k(C25006f2 c25006f2) {
            super(1);
            this.f53010r = c25006f2;
        }

        /* renamed from: a */
        public final void m54545a(boolean z11) {
            C18705c.d dVar;
            Integer m98638G;
            C18705c c18705c = MainPageView.this.f52990D0;
            if (c18705c != null) {
                dVar = c18705c.m98637F(this.f53010r.f119910y.getCurrentItem());
            } else {
                dVar = null;
            }
            C18705c.d dVar2 = C18705c.d.f93972q;
            if (dVar != dVar2) {
                C18705c c18705c2 = MainPageView.this.f52990D0;
                if (c18705c2 != null && (m98638G = c18705c2.m98638G(dVar2)) != null) {
                    int intValue = m98638G.intValue();
                    if (z11) {
                        this.f53010r.f119902q.m55965j(intValue);
                        return;
                    } else {
                        this.f53010r.f119902q.m55964f(intValue);
                        return;
                    }
                }
                return;
            }
            AbstractC28684a.Companion.m143692z().mo146363b(false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54545a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageView$l */
    /* loaded from: classes5.dex */
    static final class C10313l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25006f2 f53012r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10313l(C25006f2 c25006f2) {
            super(1);
            this.f53012r = c25006f2;
        }

        /* renamed from: a */
        public final void m54546a(boolean z11) {
            C18705c.d dVar;
            Integer m98638G;
            if (C27417l.f129055a.m140389m()) {
                C18705c c18705c = MainPageView.this.f52990D0;
                if (c18705c != null) {
                    dVar = c18705c.m98637F(this.f53012r.f119910y.getCurrentItem());
                } else {
                    dVar = null;
                }
                C18705c.d dVar2 = C18705c.d.f93974s;
                if (dVar != dVar2) {
                    C18705c c18705c2 = MainPageView.this.f52990D0;
                    if (c18705c2 != null && (m98638G = c18705c2.m98638G(dVar2)) != null) {
                        int intValue = m98638G.intValue();
                        if (z11) {
                            this.f53012r.f119902q.m55965j(intValue);
                            return;
                        } else {
                            this.f53012r.f119902q.m55964f(intValue);
                            return;
                        }
                    }
                    return;
                }
                AbstractC28684a.Companion.m143692z().mo146372k(false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54546a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public MainPageView() {
        super(C10302a.f52994y);
        this.f52992F0 = new C10304c();
    }

    /* renamed from: ZK */
    public static final void m54528ZK(MainPageView mainPageView, View view) {
        AbstractC19074t.m100208f(mainPageView, "this$0");
        AbstractC19074t.m100208f(view, "$view");
        try {
            mainPageView.mo53932Bg();
        } catch (Exception unused) {
            view.postDelayed(new Runnable() { // from class: m20.s0
                public /* synthetic */ RunnableC22794s0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainPageView.m54529aL(MainPageView.this);
                }
            }, ViewConfiguration.getDoubleTapTimeout());
        }
    }

    /* renamed from: aL */
    public static final void m54529aL(MainPageView mainPageView) {
        AbstractC19074t.m100208f(mainPageView, "this$0");
        try {
            mainPageView.mo53932Bg();
        } catch (Exception unused) {
        }
    }

    /* renamed from: cL */
    private final void m54530cL(C25006f2 c25006f2) {
        long millis;
        CoreConfig m51425b;
        Long m51444g;
        if (C25090m.f120499a.m130051c(getContext())) {
            InterfaceC29280a m143681o = AbstractC28684a.Companion.m143681o();
            long mo146322X = m143681o.mo146322X("dataUsageWarning");
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51444g = m51425b.m51444g()) != null) {
                millis = m51444g.longValue();
            } else {
                millis = TimeUnit.MINUTES.toMillis(5L);
            }
            if (System.currentTimeMillis() - mo146322X > millis) {
                c25006f2.f119907v.post(new Runnable() { // from class: m20.r0

                    /* renamed from: q */
                    public final /* synthetic */ C25006f2 f111386q;

                    public /* synthetic */ RunnableC22790r0(C25006f2 c25006f22) {
                        r2 = c25006f22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MainPageView.m54531dL(MainPageView.this, r2);
                    }
                });
                m143681o.mo146305G("dataUsageWarning");
            }
        }
    }

    /* renamed from: dL */
    public static final void m54531dL(MainPageView mainPageView, C25006f2 c25006f2) {
        AbstractC19074t.m100208f(mainPageView, "this$0");
        AbstractC19074t.m100208f(c25006f2, "$this_showDataUsageWarningIfNeeded");
        if (mainPageView.m55545MK()) {
            C25097t.m130151u(C25097t.f120556a, mainPageView.getContext(), AbstractC27413h.zch_page_main_data_usage_warning, 0, c25006f2.f119907v.getHeight(), 4, null);
        } else {
            C25097t.f120556a.m130153n(mainPageView.getContext(), AbstractC27413h.zch_page_main_data_usage_warning);
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null) {
            m54530cL(c25006f2);
            C18705c c18705c = this.f52990D0;
            if (c18705c != null) {
                c18705c.m98635D(c25006f2.f119910y.getCurrentItem());
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        NotificationReceiver notificationReceiver = this.f52988B0;
        if (notificationReceiver != null) {
            notificationReceiver.mo53687g();
        }
        VideoReceiver videoReceiver = this.f52989C0;
        if (videoReceiver != null) {
            videoReceiver.mo53687g();
        }
        FloatingManager.Companion.m53873o(this.f52992F0);
        super.mo37484JJ();
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(MainPageView.class, C10303b.m54536b(Companion, C18705c.d.f93973r.m98645c(), null, false, 4, null));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        C18705c c18705c;
        if (super.mo39030NJ(i11, keyEvent)) {
            return true;
        }
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
            Object mo35339k = c18705c.mo35339k(nonSwipeableViewPager, nonSwipeableViewPager.getCurrentItem());
            if (mo35339k != null) {
                AbstractC19074t.m100206d(mo35339k, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.BasePageView<*>");
                if (((AbstractC10623a) mo35339k).mo39030NJ(i11, keyEvent)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        NonSwipeableViewPager nonSwipeableViewPager;
        C18705c c18705c;
        Integer num;
        VideoChannelPagerView videoChannelPagerView;
        super.mo39032PJ();
        C17487o0 m92649TI = m92649TI();
        if (m92649TI.m93012K0() != null) {
            if (!m92649TI.m93002G0()) {
                m92649TI.mo92702G1(m92649TI.m93012K0(), 0);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: m20.p0
                public /* synthetic */ RunnableC22782p0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainPageView.this.mo39032PJ();
                }
            });
            return;
        }
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (nonSwipeableViewPager = c25006f2.f119910y) != null) {
            AbstractC6881a adapter = nonSwipeableViewPager.getAdapter();
            Video video = null;
            if (adapter instanceof C18705c) {
                c18705c = (C18705c) adapter;
            } else {
                c18705c = null;
            }
            if (c18705c != null) {
                C18705c.d.a aVar = C18705c.d.Companion;
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    num = Integer.valueOf(m92642L3.getInt("SELECTED_TAB_ID"));
                } else {
                    num = null;
                }
                C18705c.d m98646a = aVar.m98646a(num);
                if (m98646a == null) {
                    m98646a = C18705c.d.f93973r;
                }
                Integer m98638G = c18705c.m98638G(m98646a);
                if (c18705c.m98637F(nonSwipeableViewPager.getCurrentItem()) != m98646a && m98638G != null) {
                    nonSwipeableViewPager.setCurrentItem(m98638G.intValue());
                }
                C18705c.d dVar = C18705c.d.f93973r;
                if (m98646a != dVar) {
                    mo53934d0();
                }
                Integer m98638G2 = c18705c.m98638G(dVar);
                if (m98638G2 != null) {
                    Object mo35339k = c18705c.mo35339k(nonSwipeableViewPager, m98638G2.intValue());
                    if (mo35339k instanceof VideoChannelPagerView) {
                        videoChannelPagerView = (VideoChannelPagerView) mo35339k;
                    } else {
                        videoChannelPagerView = null;
                    }
                    if (videoChannelPagerView != null) {
                        VideoPageView.C10573b c10573b = VideoPageView.Companion;
                        Bundle m92642L32 = m92642L3();
                        if (m92642L32 != null) {
                            video = (Video) m92642L32.getParcelable("RESERVED_VIDEO");
                        }
                        videoChannelPagerView.mo60305zK(c10573b.m55408d(video));
                        videoChannelPagerView.mo39032PJ();
                    }
                }
            }
        }
    }

    /* renamed from: XK */
    public final C21456b.b m54532XK() {
        return this.f52993G0;
    }

    /* renamed from: YK */
    public final void m54533YK(boolean z11) {
        NonSwipeableViewPager nonSwipeableViewPager;
        float f11;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        LinearLayout linearLayout = null;
        if (c25006f2 != null) {
            nonSwipeableViewPager = c25006f2.f119910y;
        } else {
            nonSwipeableViewPager = null;
        }
        if (nonSwipeableViewPager != null) {
            nonSwipeableViewPager.setSwipeEnable(!z11);
        }
        C25006f2 c25006f22 = (C25006f2) m55556SK();
        if (c25006f22 != null) {
            linearLayout = c25006f22.f119907v;
        }
        if (linearLayout != null) {
            if (z11) {
                f11 = -2.1474836E9f;
            } else {
                f11 = 0.0f;
            }
            linearLayout.setTranslationY(f11);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.MainPageLayout.InterfaceC10301a
    /* renamed from: Yz */
    public void mo54521Yz(int i11) {
        float f11;
        boolean z11;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null) {
            LinearLayout linearLayout = c25006f2.f119907v;
            if (i11 < c25006f2.getRoot().getWidth()) {
                f11 = -i11;
            } else {
                f11 = -2.1474836E9f;
            }
            linearLayout.setTranslationX(f11);
            NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            nonSwipeableViewPager.setSwipeEnable(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Integer num;
        C18705c c18705c;
        Integer m98638G;
        C18705c c18705c2;
        Integer m98638G2;
        Integer m98638G3;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        FloatingManager.Companion.m53869k(this.f52992F0);
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null) {
            ImageView imageView = c25006f2.f119903r;
            AbstractC19074t.m100207e(imageView, "btnBack");
            AbstractC26112n.m134407k0(imageView, new C10306e());
            ImageView imageView2 = c25006f2.f119904s;
            AbstractC19074t.m100205c(imageView2);
            AbstractC26112n.m134407k0(imageView2, new C10307f());
            ImageView imageView3 = c25006f2.f119906u;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            imageView3.setImageDrawable(C27280g.m139658a(m92689tK, AbstractC23322a.zch_ic_search_shadow_line_24));
            AbstractC19074t.m100205c(imageView3);
            AbstractC26112n.m134407k0(imageView3, new C10308g());
            ImageView imageView4 = c25006f2.f119905t;
            AbstractC28684a.h hVar = AbstractC28684a.Companion;
            InterfaceC29280a m143681o = hVar.m143681o();
            if (m143681o.mo146320V()) {
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                imageView4.setImageDrawable(C27280g.m139658a(m92689tK2, AbstractC23322a.zch_ic_user_rectangle_shadow_dot_line_24));
            } else {
                Context m92689tK3 = m92689tK();
                AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                imageView4.setImageDrawable(C27280g.m139658a(m92689tK3, AbstractC23322a.zch_ic_user_rectangle_shadow_line_24));
            }
            AbstractC19074t.m100205c(imageView4);
            AbstractC26112n.m134407k0(imageView4, new C10309h(imageView4, m143681o));
            NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
            C18705c.d.a aVar = C18705c.d.Companion;
            Bundle m92642L3 = m92642L3();
            Integer num2 = null;
            if (m92642L3 != null) {
                num = Integer.valueOf(m92642L3.getInt("SELECTED_TAB_ID", -1));
            } else {
                num = null;
            }
            C18705c.d m98646a = aVar.m98646a(num);
            if (m98646a == null) {
                m98646a = C18705c.d.f93973r;
            }
            NonSwipeableViewPager nonSwipeableViewPager2 = c25006f2.f119910y;
            AbstractC19074t.m100207e(nonSwipeableViewPager2, "viePager");
            C17487o0 m92649TI = m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            C18705c c18705c3 = new C18705c(nonSwipeableViewPager2, m92649TI);
            Bundle m92642L32 = m92642L3();
            int i11 = 0;
            if (m92642L32 != null) {
                c18705c3.m98640I(m98646a, (Video) m92642L32.getParcelable("RESERVED_VIDEO"), m92642L32.getBoolean("SHOW_TOOLTIP_NEW_VIDEO", false));
            }
            this.f52990D0 = c18705c3;
            nonSwipeableViewPager.setAdapter(c18705c3);
            C18705c c18705c4 = this.f52990D0;
            if (c18705c4 != null && (m98638G3 = c18705c4.m98638G(m98646a)) != null) {
                i11 = m98638G3.intValue();
            } else {
                C18705c c18705c5 = this.f52990D0;
                if (c18705c5 != null) {
                    num2 = c18705c5.m98638G(C18705c.d.f93973r);
                }
                if (num2 != null) {
                    i11 = num2.intValue();
                }
            }
            nonSwipeableViewPager.setCurrentItem(i11);
            C18705c c18705c6 = this.f52990D0;
            AbstractC19074t.m100205c(c18705c6);
            nonSwipeableViewPager.setOffscreenPageLimit(c18705c6.mo35335g());
            nonSwipeableViewPager.addOnPageChangeListener(new C10310i(nonSwipeableViewPager, this));
            MenuBar menuBar = c25006f2.f119902q;
            NonSwipeableViewPager nonSwipeableViewPager3 = c25006f2.f119910y;
            AbstractC19074t.m100207e(nonSwipeableViewPager3, "viePager");
            menuBar.setupWithViewPager(nonSwipeableViewPager3);
            NotificationReceiver notificationReceiver = new NotificationReceiver(null, new C10311j(c25006f2, this), null, null, null, 29, null);
            Context m92689tK4 = m92689tK();
            AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
            notificationReceiver.mo53685d(m92689tK4);
            this.f52988B0 = notificationReceiver;
            VideoReceiver videoReceiver = new VideoReceiver(new C10312k(c25006f2), new C10313l(c25006f2), new C10305d(c25006f2));
            Context m92689tK5 = m92689tK();
            AbstractC19074t.m100207e(m92689tK5, "requireContext(...)");
            videoReceiver.mo53685d(m92689tK5);
            this.f52989C0 = videoReceiver;
            InterfaceC29283d m143692z = hVar.m143692z();
            if (m143692z.mo146367f() && (c18705c2 = this.f52990D0) != null && (m98638G2 = c18705c2.m98638G(C18705c.d.f93972q)) != null) {
                c25006f2.f119902q.m55965j(m98638G2.intValue());
            }
            if (m143692z.mo146374m() && (c18705c = this.f52990D0) != null && (m98638G = c18705c.m98638G(C18705c.d.f93974s)) != null) {
                c25006f2.f119902q.m55965j(m98638G.intValue());
            }
            view.post(new Runnable() { // from class: m20.q0

                /* renamed from: q */
                public final /* synthetic */ View f111382q;

                public /* synthetic */ RunnableC22786q0(View view2) {
                    r2 = view2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MainPageView.m54528ZK(MainPageView.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.MainPageLayout.InterfaceC10301a
    /* renamed from: al */
    public void mo54522al(int i11) {
        C18705c c18705c;
        Integer m98638G;
        MenuBar menuBar;
        C18705c.d m98646a = C18705c.d.Companion.m98646a(Integer.valueOf(i11));
        if (m98646a != null && (c18705c = this.f52990D0) != null && (m98638G = c18705c.m98638G(m98646a)) != null) {
            if (m98638G.intValue() < 0) {
                m98638G = null;
            }
            if (m98638G != null) {
                int intValue = m98638G.intValue();
                C25006f2 c25006f2 = (C25006f2) m55556SK();
                if (c25006f2 != null && (menuBar = c25006f2.f119902q) != null) {
                    menuBar.m55964f(intValue);
                }
            }
        }
    }

    /* renamed from: bL */
    public final void m54534bL(int i11) {
        C18705c c18705c;
        Integer m98638G;
        NonSwipeableViewPager nonSwipeableViewPager;
        C18705c.d m98646a = C18705c.d.Companion.m98646a(Integer.valueOf(i11));
        if (m98646a != null && (c18705c = this.f52990D0) != null && (m98638G = c18705c.m98638G(m98646a)) != null) {
            int intValue = m98638G.intValue();
            C25006f2 c25006f2 = (C25006f2) m55556SK();
            if (c25006f2 != null) {
                nonSwipeableViewPager = c25006f2.f119910y;
            } else {
                nonSwipeableViewPager = null;
            }
            if (nonSwipeableViewPager != null) {
                nonSwipeableViewPager.setCurrentItem(intValue);
            }
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        C18705c c18705c;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            c18705c.mo98626a(c25006f2.f119910y.getCurrentItem());
        }
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        C18705c c18705c;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            c18705c.m98636E(c25006f2.f119910y.getCurrentItem());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView.InterfaceC10622a
    /* renamed from: lz */
    public boolean mo53979lz() {
        if (m55556SK() == null) {
            return false;
        }
        InterfaceC22715a m55556SK = m55556SK();
        AbstractC19074t.m100205c(m55556SK);
        C25006f2 c25006f2 = (C25006f2) m55556SK;
        ImageView imageView = c25006f2.f119904s;
        AbstractC19074t.m100207e(imageView, "btnFloat");
        if ((!AbstractC26112n.m134380U(imageView) || c25006f2.f119907v.getTranslationX() < 0.0f) && !(FloatingManager.Companion.m53860b() instanceof C22006a)) {
            return false;
        }
        return true;
    }

    @Override // e20.InterfaceC18189c
    /* renamed from: ni */
    public void mo54480ni() {
        C18705c c18705c;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            c18705c.m98639H(c25006f2.f119910y.getCurrentItem());
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        Object obj;
        C18705c.d m98637F;
        AbstractC19074t.m100208f(bVar, "extras");
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null) {
            int currentItem = c25006f2.f119910y.getCurrentItem();
            C18705c c18705c = this.f52990D0;
            if (c18705c != null && (m98637F = c18705c.m98637F(currentItem)) != null) {
                bVar.m111023b(0, Integer.valueOf(m98637F.m98645c()));
            }
            C18705c c18705c2 = this.f52990D0;
            if (c18705c2 != null) {
                obj = c18705c2.mo35339k(c25006f2.f119910y, currentItem);
            } else {
                obj = null;
            }
            if (obj instanceof VideoChannelPagerView) {
                ((VideoChannelPagerView) obj).m55110vL(bVar);
            } else if (obj instanceof VideoPageView) {
                ((VideoPageView) obj).m55402vM(bVar);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        C18705c c18705c;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
            Object mo35339k = c18705c.mo35339k(nonSwipeableViewPager, nonSwipeableViewPager.getCurrentItem());
            if (mo35339k != null) {
                AbstractC19074t.m100206d(mo35339k, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.BasePageView<*>");
                if (((AbstractC10623a) mo35339k).onKeyUp(i11, keyEvent)) {
                    return true;
                }
            }
        }
        if (i11 == 4) {
            if (this.f52991E0 < SystemClock.elapsedRealtime() - 2000) {
                this.f52991E0 = SystemClock.elapsedRealtime();
                C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_page_main_tap_again_to_exit);
                mo54480ni();
                return true;
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_quit_phone_button);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            ZaloActivity zaloActivity = null;
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            m55549OK(true);
            StateManager.C10098a c10098a = StateManager.Companion;
            String m55544LK = m55544LK();
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 instanceof ZaloActivity) {
                zaloActivity = (ZaloActivity) m92676n2;
            }
            c10098a.m53806j(m55544LK, zaloActivity);
            c10098a.m53798b();
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.Companion.m124119a().m124116d(15003, 0);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        Integer num;
        int m98645c;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Object m111022a = bVar.m111022a(0);
            if (m111022a instanceof Integer) {
                num = (Integer) m111022a;
            } else {
                num = null;
            }
            if (num != null) {
                m98645c = num.intValue();
            } else {
                m98645c = C18705c.d.f93973r.m98645c();
            }
            AbstractC26102d.m134326a(m92642L3, "SELECTED_TAB_ID", Integer.valueOf(m98645c));
        }
        this.f52993G0 = bVar;
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        C18705c c18705c;
        C25006f2 c25006f2 = (C25006f2) m55556SK();
        if (c25006f2 != null && (c18705c = this.f52990D0) != null) {
            c18705c.mo98627c(c25006f2.f119910y.getCurrentItem());
        }
    }
}
