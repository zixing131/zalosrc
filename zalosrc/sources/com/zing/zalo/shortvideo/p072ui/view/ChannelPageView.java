package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.p072ui.view.ChannelView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.LeftTitleHeaderLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18187a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import k20.C21456b;
import pm0.C24848g0;
import q10.C24990b2;
import s20.AbstractC26102d;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public final class ChannelPageView extends AbstractC10623a implements ChannelView.InterfaceC10143c, InterfaceC18187a, C21456b.c, ZchBaseView.InterfaceC10622a {
    public static final C10134b Companion = new C10134b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10133a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10133a f52579y = new C10133a();

        C10133a() {
            super(3, C24990b2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m53980h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24990b2 m53980h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24990b2.m129767c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10134b {
        private C10134b() {
        }

        public /* synthetic */ C10134b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ChannelPageView m53981c(C10134b c10134b, Channel channel, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return c10134b.m53983a(channel, str);
        }

        /* renamed from: d */
        public static /* synthetic */ ChannelPageView m53982d(C10134b c10134b, String str, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return c10134b.m53984b(str, str2);
        }

        /* renamed from: a */
        public final ChannelPageView m53983a(Channel channel, String str) {
            AbstractC19074t.m100208f(channel, "channel");
            ChannelPageView channelPageView = new ChannelPageView();
            channelPageView.mo60305zK(ChannelView.Companion.m54083b(channel, str));
            return channelPageView;
        }

        /* renamed from: b */
        public final ChannelPageView m53984b(String str, String str2) {
            AbstractC19074t.m100208f(str, "channelId");
            ChannelPageView channelPageView = new ChannelPageView();
            channelPageView.mo60305zK(ChannelView.Companion.m54084c(str, str2));
            return channelPageView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$c */
    /* loaded from: classes5.dex */
    static final class C10135c extends AbstractC19075u implements InterfaceC18505l {
        C10135c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53985a(View view) {
            AbstractC19074t.m100208f(view, "it");
            if (ChannelPageView.this.m92650VI() instanceof VideoChannelPagerView) {
                ZaloView m92650VI = ChannelPageView.this.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                ((VideoChannelPagerView) m92650VI).m55102kL();
                return;
            }
            ChannelPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53985a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$d */
    /* loaded from: classes5.dex */
    static final class C10136d extends AbstractC19075u implements InterfaceC18505l {
        C10136d() {
            super(1);
        }

        /* renamed from: a */
        public final void m53986a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView m53969TK = ChannelPageView.this.m53969TK();
            if (m53969TK != null) {
                m53969TK.m54072VL();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53986a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$e */
    /* loaded from: classes5.dex */
    static final class C10137e extends AbstractC19075u implements InterfaceC18505l {
        C10137e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53987a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView m53969TK = ChannelPageView.this.m53969TK();
            if (m53969TK != null) {
                m53969TK.m54070TL();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53987a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ChannelPageView$f */
    /* loaded from: classes5.dex */
    static final class C10138f extends AbstractC19075u implements InterfaceC18505l {
        C10138f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53988a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ChannelView m53969TK = ChannelPageView.this.m53969TK();
            if (m53969TK != null) {
                m53969TK.m54069SL(false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53988a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public ChannelPageView() {
        super(C10133a.f52579y);
    }

    /* renamed from: cL */
    public static /* synthetic */ void m53968cL(ChannelPageView channelPageView, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        channelPageView.m53977bL(str, str2);
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        VideoChannelPagerView videoChannelPagerView;
        ChannelView m53969TK = m53969TK();
        if (m53969TK != null) {
            m53969TK.m54067PL();
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof VideoChannelPagerView) {
            videoChannelPagerView = (VideoChannelPagerView) m92650VI;
        } else {
            videoChannelPagerView = null;
        }
        if (videoChannelPagerView != null) {
            videoChannelPagerView.m55109rL(true);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ChannelView.InterfaceC10143c
    /* renamed from: E3 */
    public boolean mo51855E3(InterfaceC18494a interfaceC18494a) {
        VideoChannelPagerView videoChannelPagerView;
        AbstractC19074t.m100208f(interfaceC18494a, "pendingAction");
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof VideoChannelPagerView) {
            videoChannelPagerView = (VideoChannelPagerView) m92650VI;
        } else {
            videoChannelPagerView = null;
        }
        if (videoChannelPagerView != null) {
            return videoChannelPagerView.m55100iL(interfaceC18494a);
        }
        return true;
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(ChannelPageView.class, null);
    }

    /* renamed from: TK */
    public final ChannelView m53969TK() {
        ZaloView m92993D0 = m92649TI().m92993D0(ChannelView.class);
        if (m92993D0 instanceof ChannelView) {
            return (ChannelView) m92993D0;
        }
        return null;
    }

    /* renamed from: UK */
    public final C17487o0 m53970UK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof VideoChannelPagerView) {
            return ((VideoChannelPagerView) m92650VI).m55099hL();
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* renamed from: VK */
    public final void m53971VK() {
        SimpleShadowTextView simpleShadowTextView;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null && (simpleShadowTextView = c24990b2.f119794r) != null) {
            AbstractC26112n.m134367H(simpleShadowTextView);
        }
    }

    /* renamed from: WK */
    public final boolean m53972WK() {
        return m92650VI() instanceof VideoChannelPagerView;
    }

    /* renamed from: XK */
    public final void m53973XK(boolean z11) {
        int i11;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null) {
            UsernameTextView usernameTextView = c24990b2.f119791A;
            AbstractC19074t.m100207e(usernameTextView, "txtTitle");
            if (AbstractC26112n.m134380U(usernameTextView)) {
                SimpleShadowTextView simpleShadowTextView = c24990b2.f119794r;
                AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
                int i12 = 8;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                simpleShadowTextView.setVisibility(i11);
                ImageView imageView = c24990b2.f119795s;
                AbstractC19074t.m100207e(imageView, "btnMore");
                if (!z11) {
                    i12 = 0;
                }
                imageView.setVisibility(i12);
            }
        }
    }

    /* renamed from: YK */
    public final void m53974YK(boolean z11) {
        ImageView imageView;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null && (imageView = c24990b2.f119795s) != null) {
            if (z11) {
                AbstractC26112n.m134431w0(imageView);
            } else {
                AbstractC26112n.m134374O(imageView);
            }
            imageView.requestLayout();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null) {
            LeftTitleHeaderLayout leftTitleHeaderLayout = c24990b2.f119799w;
            AbstractC19074t.m100207e(leftTitleHeaderLayout, "lytHeader");
            ViewGroup.LayoutParams layoutParams = leftTitleHeaderLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                FrameLayout root = c24990b2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                leftTitleHeaderLayout.setLayoutParams(layoutParams2);
                ImageView imageView = c24990b2.f119793q;
                AbstractC19074t.m100207e(imageView, "btnBack");
                AbstractC26112n.m134407k0(imageView, new C10135c());
                ImageView imageView2 = c24990b2.f119796t;
                AbstractC19074t.m100207e(imageView2, "btnUpload");
                AbstractC26112n.m134407k0(imageView2, new C10136d());
                ImageView imageView3 = c24990b2.f119795s;
                AbstractC19074t.m100207e(imageView3, "btnMore");
                AbstractC26112n.m134407k0(imageView3, new C10137e());
                SimpleShadowTextView simpleShadowTextView = c24990b2.f119794r;
                AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
                AbstractC26112n.m134407k0(simpleShadowTextView, new C10138f());
                if (bundle != null) {
                    return;
                }
                C17507u0 m93138e = m92649TI().m92998F(ChannelView.class, false).m93138e(c24990b2.f119798v.getId());
                Bundle m92688sK = m92688sK();
                AbstractC19074t.m100207e(m92688sK, "requireArguments(...)");
                m93138e.m93139f(m92688sK).m93137d(0).m93136a();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: ZK */
    public final void m53975ZK(boolean z11) {
        ImageView imageView;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null && (imageView = c24990b2.f119796t) != null) {
            if (z11) {
                AbstractC26112n.m134374O(imageView);
            } else {
                AbstractC26112n.m134367H(imageView);
            }
        }
    }

    /* renamed from: aL */
    public final boolean m53976aL(Channel channel, String str) {
        AbstractC19074t.m100208f(channel, "channel");
        AbstractC19074t.m100208f(str, "justWatchedId");
        ChannelView m53969TK = m53969TK();
        if (m53969TK == null || !m53969TK.m54068QL(channel, str)) {
            return false;
        }
        m53968cL(this, null, null, 2, null);
        m53975ZK(false);
        m53974YK(false);
        return true;
    }

    /* renamed from: bL */
    public final void m53977bL(String str, String str2) {
        UsernameTextView usernameTextView;
        UsernameTextView usernameTextView2;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null) {
            usernameTextView = c24990b2.f119791A;
        } else {
            usernameTextView = null;
        }
        if (usernameTextView != null) {
            usernameTextView.setText(str);
        }
        C24990b2 c24990b22 = (C24990b2) m55556SK();
        if (c24990b22 != null && (usernameTextView2 = c24990b22.f119791A) != null) {
            usernameTextView2.setVerifiedIcon(str2);
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        InterfaceC18187a.a.m96937c(this);
    }

    /* renamed from: dL */
    public final void m53978dL(boolean z11, boolean z12) {
        boolean z13;
        C24990b2 c24990b2 = (C24990b2) m55556SK();
        if (c24990b2 != null) {
            if (z11) {
                UsernameTextView usernameTextView = c24990b2.f119791A;
                AbstractC19074t.m100207e(usernameTextView, "txtTitle");
                AbstractC26112n.m134431w0(usernameTextView);
                ImageView imageView = c24990b2.f119796t;
                AbstractC19074t.m100207e(imageView, "btnUpload");
                if (AbstractC26112n.m134377R(imageView)) {
                    ImageView imageView2 = c24990b2.f119796t;
                    AbstractC19074t.m100207e(imageView2, "btnUpload");
                    AbstractC26112n.m134431w0(imageView2);
                }
                if (z12) {
                    SimpleShadowTextView simpleShadowTextView = c24990b2.f119794r;
                    AbstractC19074t.m100207e(simpleShadowTextView, "btnFollow");
                    AbstractC26112n.m134431w0(simpleShadowTextView);
                }
                ImageView imageView3 = c24990b2.f119795s;
                AbstractC19074t.m100207e(imageView3, "btnMore");
                SimpleShadowTextView simpleShadowTextView2 = c24990b2.f119794r;
                AbstractC19074t.m100207e(simpleShadowTextView2, "btnFollow");
                int i11 = 0;
                if (simpleShadowTextView2.getVisibility() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!(!z13)) {
                    i11 = 8;
                }
                imageView3.setVisibility(i11);
                return;
            }
            UsernameTextView usernameTextView2 = c24990b2.f119791A;
            AbstractC19074t.m100207e(usernameTextView2, "txtTitle");
            AbstractC26112n.m134374O(usernameTextView2);
            SimpleShadowTextView simpleShadowTextView3 = c24990b2.f119794r;
            AbstractC19074t.m100207e(simpleShadowTextView3, "btnFollow");
            AbstractC26112n.m134367H(simpleShadowTextView3);
            ImageView imageView4 = c24990b2.f119795s;
            AbstractC19074t.m100207e(imageView4, "btnMore");
            AbstractC26112n.m134431w0(imageView4);
            ImageView imageView5 = c24990b2.f119796t;
            AbstractC19074t.m100207e(imageView5, "btnUpload");
            if (AbstractC26112n.m134380U(imageView5)) {
                ImageView imageView6 = c24990b2.f119796t;
                AbstractC19074t.m100207e(imageView6, "btnUpload");
                AbstractC26112n.m134374O(imageView6);
            }
        }
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        InterfaceC18187a.a.m96936b(this);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView.InterfaceC10622a
    /* renamed from: lz */
    public boolean mo53979lz() {
        return true;
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Channel channel = (Channel) m92642L3.getParcelable("CHANNEL");
            if (channel != null) {
                AbstractC19074t.m100205c(channel);
                bVar.m111023b(0, channel);
            }
            String string = m92642L3.getString("CHANNEL_ID");
            if (string != null) {
                AbstractC19074t.m100205c(string);
                bVar.m111023b(1, string);
            }
            String string2 = m92642L3.getString("xSource");
            if (string2 != null) {
                AbstractC19074t.m100205c(string2);
                bVar.m111023b(2, string2);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ImageView imageView;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C24990b2 c24990b2 = (C24990b2) m55556SK();
            if (c24990b2 != null && (imageView = c24990b2.f119793q) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        return false;
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        Channel channel;
        String str;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Object m111022a = bVar.m111022a(0);
            String str2 = null;
            if (m111022a instanceof Channel) {
                channel = (Channel) m111022a;
            } else {
                channel = null;
            }
            if (channel != null) {
                AbstractC26102d.m134326a(m92642L3, "CHANNEL", channel);
            }
            Object m111022a2 = bVar.m111022a(1);
            if (m111022a2 instanceof String) {
                str = (String) m111022a2;
            } else {
                str = null;
            }
            if (str != null) {
                AbstractC26102d.m134326a(m92642L3, "CHANNEL_ID", str);
            }
            Object m111022a3 = bVar.m111022a(2);
            if (m111022a3 instanceof String) {
                str2 = (String) m111022a3;
            }
            if (str2 != null) {
                AbstractC26102d.m134326a(m92642L3, "xSource", str2);
            }
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        InterfaceC18187a.a.m96938d(this);
    }
}
