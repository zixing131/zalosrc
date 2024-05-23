package com.zing.zalo.feed.mvp.profile;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import bo.C3000l0;
import bo.C3054x;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView;
import com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.FeedCallbackZaloView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.PrivacyPickGroupView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.QuickPreviewZView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gi0.C19451a;
import ho0.AbstractC20110a;
import i40.C20275e;
import iq.C20679f1;
import iq.C20733q0;
import iq.C20738r0;
import iq.C20743s0;
import iq.InterfaceC20748t0;
import iq.InterfaceC20753u0;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p172fy.C19171b;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p649xl.C30051t9;
import p716zh.C32002l4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ProfileAlbumDetailView extends FeedCallbackZaloView implements InterfaceC20753u0, C23744a.c, InterfaceC0733x {
    public static final C8634a Companion = new C8634a(null);

    /* renamed from: o1 */
    private static final int f46468o1 = AbstractC23136l9.m118742r(76.0f);

    /* renamed from: S0 */
    private C23528a f46470S0;

    /* renamed from: U0 */
    private InterfaceC20748t0 f46472U0;

    /* renamed from: V0 */
    public C30051t9 f46473V0;

    /* renamed from: W0 */
    private RecyclerView f46474W0;

    /* renamed from: X0 */
    public NoPredictiveItemAnimLinearLayoutMngr f46475X0;

    /* renamed from: Y0 */
    public C8050a f46476Y0;

    /* renamed from: Z0 */
    private View f46477Z0;

    /* renamed from: a1 */
    private View f46478a1;

    /* renamed from: b1 */
    private boolean f46479b1;

    /* renamed from: c1 */
    private String f46480c1;

    /* renamed from: d1 */
    private String f46481d1;

    /* renamed from: f1 */
    private AbstractC11859g f46483f1;

    /* renamed from: g1 */
    private boolean f46484g1;

    /* renamed from: h1 */
    private int f46485h1;

    /* renamed from: i1 */
    private ArrayList f46486i1;

    /* renamed from: j1 */
    private boolean f46487j1;

    /* renamed from: k1 */
    private String f46488k1;

    /* renamed from: l1 */
    private MenuListPopupView f46489l1;

    /* renamed from: m1 */
    private boolean f46490m1;

    /* renamed from: n1 */
    private boolean f46491n1;

    /* renamed from: R0 */
    private final String f46469R0 = "ProfileAlbumDetailView";

    /* renamed from: T0 */
    private Handler f46471T0 = new Handler(Looper.getMainLooper());

    /* renamed from: e1 */
    private boolean f46482e1 = true;

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$a */
    /* loaded from: classes4.dex */
    public static final class C8634a {
        private C8634a() {
        }

        public /* synthetic */ C8634a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m46060a() {
            return C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor);
        }

        /* renamed from: b */
        public final int m46061b() {
            return C23212s8.m119606n(AbstractC21196a.TextColor1);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$b */
    /* loaded from: classes4.dex */
    public static final class C8635b extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ View f46493q;

        C8635b(View view) {
            this.f46493q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            ProfileAlbumDetailView.this.m46051nN(false);
            if (!ProfileAlbumDetailView.this.m46036ZM()) {
                ProfileAlbumDetailView.this.m45995aN(this.f46493q);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            ProfileAlbumDetailView.this.m46051nN(false);
            if (!ProfileAlbumDetailView.this.m46036ZM()) {
                ProfileAlbumDetailView.this.m45995aN(this.f46493q);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$c */
    /* loaded from: classes4.dex */
    static final class C8636c extends AbstractC19075u implements InterfaceC18505l {
        C8636c() {
            super(1);
        }

        /* renamed from: a */
        public final void m46062a(C20738r0 c20738r0) {
            try {
                if (c20738r0.m108178c()) {
                    ProfileAlbumDetailView profileAlbumDetailView = ProfileAlbumDetailView.this;
                    RelativeLayout relativeLayout = profileAlbumDetailView.m46024LM().f139455q;
                    AbstractC19074t.m100207e(relativeLayout, "buttonPostPhotoContainer");
                    profileAlbumDetailView.m46006rN(relativeLayout);
                } else {
                    ProfileAlbumDetailView profileAlbumDetailView2 = ProfileAlbumDetailView.this;
                    RelativeLayout relativeLayout2 = profileAlbumDetailView2.m46024LM().f139455q;
                    AbstractC19074t.m100207e(relativeLayout2, "buttonPostPhotoContainer");
                    profileAlbumDetailView2.m45987QM(relativeLayout2);
                }
                ProfileAlbumDetailView.this.m46024LM().f139456r.setColorFilter(c20738r0.m108177b());
                Drawable mutate = ProfileAlbumDetailView.this.m46024LM().f139455q.getBackground().mutate();
                AbstractC19074t.m100207e(mutate, "mutate(...)");
                if (mutate instanceof GradientDrawable) {
                    ((GradientDrawable) mutate).setColor(c20738r0.m108176a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46062a((C20738r0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$d */
    /* loaded from: classes4.dex */
    static final class C8637d extends AbstractC19075u implements InterfaceC18494a {
        C8637d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m46063a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m46063a() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46236sa();
            ProfileAlbumDetailView.this.f46484g1 = false;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$e */
    /* loaded from: classes4.dex */
    public static final class C8638e extends AbstractC11859g {

        /* renamed from: U */
        final /* synthetic */ ProfileAlbumDetailView f46496U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8638e(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, ProfileAlbumDetailView profileAlbumDetailView, RecyclerView recyclerView) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
            this.f46496U = profileAlbumDetailView;
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: d0 */
        protected void mo46064d0() {
            InterfaceC20748t0 interfaceC20748t0 = this.f46496U.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46233pm(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: e0 */
        public void mo46065e0(int i11) {
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            InterfaceC20748t0 interfaceC20748t0 = this.f46496U.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46233pm(false);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$f */
    /* loaded from: classes4.dex */
    public static final class C8639f extends RecyclerView.AbstractC1892s {

        /* renamed from: b */
        final /* synthetic */ C30051t9 f46498b;

        C8639f(C30051t9 c30051t9) {
            this.f46498b = c30051t9;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ProfileAlbumDetailView.this.m46029PM().m43223b0(true);
                        this.f46498b.f139461w.m88202K();
                        InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
                        if (interfaceC20748t0 == null) {
                            AbstractC19074t.m100223u("mPresenter");
                            interfaceC20748t0 = null;
                        }
                        interfaceC20748t0.mo46223h9();
                        this.f46498b.f139462x.m45431s();
                        return;
                    }
                    return;
                }
                ProfileAlbumDetailView.this.m46029PM().m43290I0(false);
                ProfileAlbumDetailView.this.m46029PM().m43223b0(false);
                ProfileAlbumDetailView.this.m46029PM().m10008p();
                this.f46498b.f139462x.m45430r();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                int m9740Y1 = ProfileAlbumDetailView.this.m46027OM().m9740Y1();
                int m9745c2 = ProfileAlbumDetailView.this.m46027OM().m9745c2();
                int m10127i = ProfileAlbumDetailView.this.m46027OM().m10127i();
                boolean z11 = true;
                int i13 = (m9745c2 - m9740Y1) + 1;
                for (int i14 = 0; i14 < i13; i14++) {
                    View m10105V = ProfileAlbumDetailView.this.m46027OM().m10105V(i14);
                    if (m10105V != null) {
                        ProfileAlbumDetailView profileAlbumDetailView = ProfileAlbumDetailView.this;
                        if (m10105V.getY() < profileAlbumDetailView.m46024LM().f139460v.getY()) {
                            profileAlbumDetailView.m46001jN(m9740Y1 + i14);
                        }
                    }
                }
                ProfileAlbumDetailView.this.m46001jN(m9740Y1);
                C8050a m46029PM = ProfileAlbumDetailView.this.m46029PM();
                if (Math.abs(i12) < ProfileAlbumDetailView.f46468o1) {
                    z11 = false;
                }
                m46029PM.m43290I0(z11);
                InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
                InterfaceC20748t0 interfaceC20748t02 = null;
                if (interfaceC20748t0 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC20748t0 = null;
                }
                interfaceC20748t0.mo46192E5(i12);
                InterfaceC20748t0 interfaceC20748t03 = ProfileAlbumDetailView.this.f46472U0;
                if (interfaceC20748t03 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC20748t03 = null;
                }
                interfaceC20748t03.mo46222h6(m9740Y1);
                if (m9745c2 >= m10127i - 5) {
                    InterfaceC20748t0 interfaceC20748t04 = ProfileAlbumDetailView.this.f46472U0;
                    if (interfaceC20748t04 == null) {
                        AbstractC19074t.m100223u("mPresenter");
                    } else {
                        interfaceC20748t02 = interfaceC20748t04;
                    }
                    interfaceC20748t02.mo46226j4();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$g */
    /* loaded from: classes4.dex */
    public static final class ViewOnLayoutChangeListenerC8640g implements View.OnLayoutChangeListener {

        /* renamed from: p */
        private int f46499p;

        ViewOnLayoutChangeListenerC8640g() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(view, "view");
            try {
                if (this.f46499p != view.getMeasuredWidth()) {
                    this.f46499p = view.getMeasuredWidth();
                    ProfileAlbumDetailView.this.m46029PM().m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$h */
    /* loaded from: classes4.dex */
    public static final class C8641h implements FeedBaseAdapter.AlbumProfileCallback {
        C8641h() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: W0 */
        public void mo43226W0() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46203W0();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: X0 */
        public void mo43227X0() {
        }

        @Override // com.zing.zalo.feed.components.FeedItemTitleDivider.InterfaceC8146a
        /* renamed from: a */
        public void mo44157a() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: a4 */
        public void mo43228a4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: b4 */
        public void mo43229b4() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onItemClick(this, animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: c4 */
        public void mo43230c4() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: d4 */
        public void mo43231d4() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46217f8();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e */
        public void mo43232e() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e2 */
        public void mo43233e2() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46216e2();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e4 */
        public void mo43234e4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: f4 */
        public void mo43235f4(View view, View view2) {
            AbstractC19074t.m100208f(view, "headerRootView");
            AbstractC19074t.m100208f(view2, "headerTitleView");
            ProfileAlbumDetailView.this.m46042gN(view);
            ProfileAlbumDetailView.this.m46044hN(view2);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onPreviewItemDeleteClick(this, i11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: l0 */
        public void mo43236l0() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onClickOpenGallery(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onItemVideoClick(this);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46209af();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
            ProfileAlbumDetailView.this.f46482e1 = z11;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
            AbstractC19074t.m100208f(view, "view");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
            ProfileAlbumDetailView.this.m46024LM().f139461w.setSwipeRefreshEnable(!z11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onPreviewItemDeleteVideoClick(this);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46189E();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$i */
    /* loaded from: classes4.dex */
    public static final class C8642i implements C8050a.t {
        C8642i() {
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.t
        /* renamed from: a */
        public void mo43360a(int i11, ItemAlbumMobile itemAlbumMobile, ImageView imageView, View view) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photo");
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46190E2(itemAlbumMobile);
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.t
        /* renamed from: b */
        public void mo43361b(int i11, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, View view) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photo");
            AbstractC19074t.m100208f(animationTarget, "animationTarget");
            InterfaceC20748t0 interfaceC20748t0 = null;
            if (itemAlbumMobile.f42591p == 2) {
                InterfaceC20748t0 interfaceC20748t02 = ProfileAlbumDetailView.this.f46472U0;
                if (interfaceC20748t02 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC20748t0 = interfaceC20748t02;
                }
                interfaceC20748t0.mo46211bh(itemAlbumMobile, animationTarget);
                return;
            }
            InterfaceC20748t0 interfaceC20748t03 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t03 == null) {
                AbstractC19074t.m100223u("mPresenter");
            } else {
                interfaceC20748t0 = interfaceC20748t03;
            }
            interfaceC20748t0.mo46240x8(itemAlbumMobile, animationTarget);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$j */
    /* loaded from: classes4.dex */
    static final class C8643j extends AbstractC19075u implements InterfaceC18505l {
        C8643j() {
            super(1);
        }

        /* renamed from: a */
        public final void m46067a(C20743s0 c20743s0) {
            try {
                ProfileAlbumDetailView.this.m46029PM().m43297g0(c20743s0.m108182a());
                ProfileAlbumDetailView.this.m46029PM().m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46067a((C20743s0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$k */
    /* loaded from: classes4.dex */
    static final class C8644k extends AbstractC19075u implements InterfaceC18505l {
        C8644k() {
            super(1);
        }

        /* renamed from: a */
        public final void m46068a(Boolean bool) {
            try {
                SwipeRefreshListView swipeRefreshListView = ProfileAlbumDetailView.this.m46024LM().f139461w;
                AbstractC19074t.m100205c(bool);
                swipeRefreshListView.setSwipeRefreshEnable(bool.booleanValue());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46068a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$l */
    /* loaded from: classes4.dex */
    static final class C8645l extends AbstractC19075u implements InterfaceC18505l {
        C8645l() {
            super(1);
        }

        /* renamed from: a */
        public final void m46069a(C20733q0 c20733q0) {
            ProfileAlbumDetailView profileAlbumDetailView = ProfileAlbumDetailView.this;
            AbstractC19074t.m100205c(c20733q0);
            profileAlbumDetailView.m46010tN(c20733q0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46069a((C20733q0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$m */
    /* loaded from: classes4.dex */
    public static final class C8646m extends C20275e {
        C8646m() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            ProfileAlbumDetailView.this.m46050lN(i11);
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$n */
    /* loaded from: classes4.dex */
    public static final class C8647n extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f46507p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f46508q;

        C8647n(View view, InterfaceC18494a interfaceC18494a) {
            this.f46507p = view;
            this.f46508q = interfaceC18494a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            this.f46507p.setScaleX(1.0f);
            this.f46507p.setScaleY(1.0f);
            this.f46508q.mo12V4();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            this.f46507p.setScaleX(1.0f);
            this.f46507p.setScaleY(1.0f);
            this.f46508q.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$o */
    /* loaded from: classes4.dex */
    static final class C8648o implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46509p;

        C8648o(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46509p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46509p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f46509p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$p */
    /* loaded from: classes4.dex */
    public static final class C8649p extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ View f46511q;

        C8649p(View view) {
            this.f46511q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            ProfileAlbumDetailView.this.m46052oN(false);
            if (!ProfileAlbumDetailView.this.m46035YM()) {
                ProfileAlbumDetailView.this.m45998dN(this.f46511q);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            ProfileAlbumDetailView.this.m46052oN(false);
            if (!ProfileAlbumDetailView.this.m46035YM()) {
                ProfileAlbumDetailView.this.m45998dN(this.f46511q);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$q */
    /* loaded from: classes4.dex */
    public static final class C8650q implements ProfileAlbumThemePickerControl.InterfaceC8525a {
        C8650q() {
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: L1 */
        public void mo45407L1() {
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46195L1();
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: N2 */
        public void mo45408N2(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "theme");
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46197N2(themeItem);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: V0 */
        public void mo45409V0(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "themeInfo");
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46201V0(themeItem);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: g2 */
        public void mo45410g2(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "selectedTheme");
            InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46220g2(themeItem);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: v */
        public void mo45411v(boolean z11) {
            ProfileAlbumDetailView.this.f46482e1 = z11;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView$r */
    /* loaded from: classes4.dex */
    public static final class C8651r extends C7145n.g {
        C8651r() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
                if (interfaceC20748t0 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC20748t0 = null;
                }
                interfaceC20748t0.mo46193G0(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            try {
                InterfaceC20748t0 interfaceC20748t0 = ProfileAlbumDetailView.this.f46472U0;
                if (interfaceC20748t0 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC20748t0 = null;
                }
                interfaceC20748t0.mo46232p2(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m45984JM(int i11, ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        if (i11 == 5100) {
            try {
                profileAlbumDetailView.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: MM */
    public static final int m45985MM() {
        return Companion.m46060a();
    }

    /* renamed from: NM */
    public static final int m45986NM() {
        return Companion.m46061b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public final void m45987QM(View view) {
        if (view.getAlpha() == 0.0f || this.f46491n1) {
            return;
        }
        this.f46491n1 = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", AbstractC23136l9.m118742r(48.0f) + AbstractC23136l9.m118742r(16.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C8635b(view));
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* renamed from: RM */
    private final void m45988RM(View view) {
        m45995aN(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m45989SM(ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        try {
            profileAlbumDetailView.m46024LM().f139461w.setRefreshing(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m45990TM(ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        try {
            profileAlbumDetailView.m46024LM().f139461w.m88202K();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: UM */
    private final void m45991UM() {
        m46024LM().f139459u.setVisibility(4);
        m46024LM().f139463y.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m45992VM(ProfileAlbumDetailView profileAlbumDetailView, InterfaceC18494a interfaceC18494a, View view) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        AbstractC19074t.m100208f(interfaceC18494a, "$callback");
        if (!profileAlbumDetailView.f46484g1) {
            profileAlbumDetailView.f46484g1 = true;
            RelativeLayout relativeLayout = profileAlbumDetailView.m46024LM().f139455q;
            AbstractC19074t.m100207e(relativeLayout, "buttonPostPhotoContainer");
            profileAlbumDetailView.m45999eN(relativeLayout, interfaceC18494a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m45993WM(ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        InterfaceC20748t0 interfaceC20748t0 = profileAlbumDetailView.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46215e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public static final boolean m45994XM(ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        AbstractC11859g abstractC11859g = profileAlbumDetailView.f46483f1;
        if (abstractC11859g != null) {
            return abstractC11859g.m114868x();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public final void m45995aN(View view) {
        int m118742r = AbstractC23136l9.m118742r(48.0f) + AbstractC23136l9.m118742r(16.0f);
        view.setVisibility(8);
        view.setTranslationY(m118742r);
        view.setAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m45996bN(ProfileAlbumDetailView profileAlbumDetailView, View view) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        InterfaceC20748t0 interfaceC20748t0 = profileAlbumDetailView.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46204W9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public static final void m45997cN(ProfileAlbumDetailView profileAlbumDetailView, View view) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        InterfaceC20748t0 interfaceC20748t0 = profileAlbumDetailView.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46212d8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public final void m45998dN(View view) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    /* renamed from: eN */
    private final void m45999eN(View view, InterfaceC18494a interfaceC18494a) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.9f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.9f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 0.9f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 0.9f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new C8647n(view, interfaceC18494a));
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* renamed from: fN */
    private final void m46000fN(String str) {
        m46024LM().f139459u.setVisibility(0);
        m46024LM().f139463y.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public final void m46001jN(int i11) {
        String str;
        long m43304p0 = m46029PM().m43304p0(i11);
        if (m43304p0 != 0) {
            str = AbstractC23244v8.m119740d(AbstractC23160o0.m119299w(m43304p0));
            AbstractC19074t.m100207e(str, "capitalizeFirstLetterOfEachWord(...)");
        } else {
            str = "";
        }
        if (str.length() > 0) {
            m46000fN(str);
        } else {
            m45991UM();
        }
    }

    /* renamed from: mN */
    private final void m46002mN(boolean z11) {
        int i11;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            Button trailingButton = m87077NK.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(i11);
            }
            Button trailingButton2 = m87077NK.getTrailingButton2();
            if (trailingButton2 != null) {
                trailingButton2.setVisibility(i11);
            }
        }
    }

    /* renamed from: qN */
    private final void m46004qN(int i11) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setTrailingButton1Color(i11);
            m87077NK.setTrailingButton2Color(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public final void m46006rN(View view) {
        if (view.getAlpha() == 1.0f || this.f46490m1) {
            return;
        }
        this.f46490m1 = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
        view.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C8649p(view));
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m46008sN(ProfileAlbumDetailView profileAlbumDetailView) {
        AbstractC19074t.m100208f(profileAlbumDetailView, "this$0");
        try {
            profileAlbumDetailView.m46024LM().f139461w.m88209V();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m46010tN(C20733q0 c20733q0) {
        String str;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (c20733q0.m108169f()) {
                str = c20733q0.m108167d();
            } else {
                str = "";
            }
            m87077NK.setMiddleTitle(str);
            m87077NK.setMiddleTitleTextColor(c20733q0.m108168e());
            m46004qN(c20733q0.m108165b());
            m87077NK.setBackgroundColor(c20733q0.m108164a());
            m87077NK.setLeadingButton1Color(c20733q0.m108165b());
            Drawable mutate = m46024LM().f139460v.getBackground().mutate();
            AbstractC19074t.m100207e(mutate, "mutate(...)");
            if (mutate instanceof ColorDrawable) {
                ((ColorDrawable) mutate).setColor(c20733q0.m108164a());
            }
            m46024LM().f139463y.setTextColor(c20733q0.m108168e());
            m46024LM().f139457s.setBackgroundColor(c20733q0.m108166c());
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: As */
    public void mo46017As() {
        m46002mN(true);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: Be */
    public void mo46018Be(long j11, int i11) {
        C17487o0 mo35579p;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 5);
            bundle.putLong("selected_album_id", j11);
            bundle.putInt("EXTRA_PRIVACY", i11);
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, ZAbstractBase.ZVU_BLEND_GEN_THUMB, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: C8 */
    public void mo46019C8() {
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C8662b c8662b = new C8662b(this);
        this.f46472U0 = c8662b;
        c8662b.mo995Nd(C20679f1.m107801a(m92642L3()), null);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: D2 */
    public void mo46020D2(List list) {
        AbstractC19074t.m100208f(list, "excludedProfileList");
        try {
            Bundle m83055pM = ProfilePickerView.m83055pM(new ArrayList(list), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putBoolean("extra_type_exclude_friends", true);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfilePickerView.class, m83055pM, 1007, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: D3 */
    public void mo46021D3(ItemAlbumMobile itemAlbumMobile) {
        C17487o0 c17487o0;
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            c17487o0 = m92676n2.mo35579p();
        } else {
            c17487o0 = null;
        }
        QuickPreviewZView.m83490fM(c17487o0, null, 0, itemAlbumMobile);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: GE */
    public void mo46022GE(int i11, ProfilePreviewAlbumItem profilePreviewAlbumItem, PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "albumItem");
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        try {
            if (!AbstractC23309i.m121565We()) {
                ToastUtils.m89266n(AbstractC8020f0.feature_is_not_supported_on_device, new Object[0]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CREATE_ALBUM_ITEM", profilePreviewAlbumItem);
            bundle.putParcelable("EXTRA_PRIVACY_UPDATE", privacyInfo);
            bundle.putInt("extra_from_feed_remind_media_type", 1);
            bundle.putString("extra_tracking_source", new TrackingSource(i11).m40686z());
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(UpdateStatusView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        this.f46470S0 = new C23528a(this.f72421L0.m92648SI());
        C30051t9 m148534c = C30051t9.m148534c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148534c, "inflate(...)");
        m46048iN(m148534c);
        Context context = getContext();
        C23528a c23528a = this.f46470S0;
        InterfaceC20748t0 interfaceC20748t0 = null;
        if (c23528a == null) {
            AbstractC19074t.m100223u("mAQ");
            c23528a = null;
        }
        m46053pN(new C8050a(context, c23528a));
        InterfaceC20748t0 interfaceC20748t02 = this.f46472U0;
        if (interfaceC20748t02 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t02 = null;
        }
        interfaceC20748t02.mo46208a1();
        InterfaceC20748t0 interfaceC20748t03 = this.f46472U0;
        if (interfaceC20748t03 == null) {
            AbstractC19074t.m100223u("mPresenter");
        } else {
            interfaceC20748t0 = interfaceC20748t03;
        }
        interfaceC20748t0.mo46188D();
        CustomRelativeLayout root = m46024LM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        InterfaceC20748t0 interfaceC20748t0 = this.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo994F2();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.Companion.m124119a().m124117e(this, 5100);
        super.mo40200KJ();
    }

    /* renamed from: KM */
    public final void m46023KM() {
        InterfaceC20748t0 interfaceC20748t0 = this.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46217f8();
    }

    /* renamed from: LM */
    public final C30051t9 m46024LM() {
        C30051t9 c30051t9 = this.f46473V0;
        if (c30051t9 != null) {
            return c30051t9;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && this.f46482e1) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: Np */
    public void mo46025Np(C32002l4 c32002l4, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(c32002l4, "setActionOnLastEntryPoint");
        if (z11) {
            i11 = 2;
        } else {
            i11 = -1;
        }
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, c32002l4).m135742a(i11).m135743b(), 0, 1));
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: O3 */
    public void mo46026O3(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, Bundle bundle) {
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        AbstractC19074t.m100208f(itemAlbumMobile, "photo");
        try {
            this.f46485h1 = -1;
            C8646m c8646m = new C8646m();
            m46029PM().m43308t0();
            c8646m.m105857C(m46029PM().m43306r0());
            c8646m.m105858D(m46029PM().m43307s0());
            RecyclerView recyclerView = this.f46474W0;
            if (recyclerView == null) {
                AbstractC19074t.m100223u("profileListview");
                recyclerView = null;
            }
            c8646m.m105861G(new C2370r0(recyclerView));
            c8646m.m105865K(i11);
            c8646m.m105882u((int) m92651WI().getDimension(AbstractC17454d.action_bar_default_height));
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35551H2(animationTarget, itemAlbumMobile.m40504N(), bundle, c8646m, 1000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f46469R0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: iq.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumDetailView.m45996bN(ProfileAlbumDetailView.this, view);
                }
            });
            Button trailingButton = m87077NK.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(8);
            }
            m87077NK.setOnClickListenerTrailingButton2(new View.OnClickListener() { // from class: iq.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumDetailView.m45997cN(ProfileAlbumDetailView.this, view);
                }
            });
            Button trailingButton2 = m87077NK.getTrailingButton2();
            if (trailingButton2 != null) {
                trailingButton2.setVisibility(8);
            }
            Context context = m87077NK.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.ic_album_theme_white);
            if (m139658a != null) {
                m87077NK.setTrailingIconButton(m139658a);
            }
            Context context2 = m87077NK.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            Drawable m139658a2 = C27280g.m139658a(context2, AbstractC16803z.ic_more_24_white);
            if (m139658a2 != null) {
                m87077NK.setTrailingIconButton2(m139658a2);
            }
        }
        mo46056tw();
        InterfaceC20748t0 interfaceC20748t0 = this.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46230mi().m9219j(this, new C8648o(new C8645l()));
    }

    /* renamed from: OM */
    public final NoPredictiveItemAnimLinearLayoutMngr m46027OM() {
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = this.f46475X0;
        if (noPredictiveItemAnimLinearLayoutMngr != null) {
            return noPredictiveItemAnimLinearLayoutMngr;
        }
        AbstractC19074t.m100223u("linearLayoutManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: PK */
    public void mo46028PK() {
        super.mo46028PK();
        C19451a m87076MK = m87076MK();
        if (m87076MK != null) {
            m87076MK.m101752c(false);
        }
    }

    /* renamed from: PM */
    public final C8050a m46029PM() {
        C8050a c8050a = this.f46476Y0;
        if (c8050a != null) {
            return c8050a;
        }
        AbstractC19074t.m100223u("profileFeedAdapter");
        return null;
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: S */
    public void mo46030S() {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: iq.d1
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumDetailView.m46008sN(ProfileAlbumDetailView.this);
                }
            });
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: T */
    public void mo46031T() {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: iq.e1
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumDetailView.m45990TM(ProfileAlbumDetailView.this);
                }
            });
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: U0 */
    public void mo46032U0(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        MenuListPopupView m87748rL = MenuListPopupView.m87748rL(m92689tK(), false, privacyInfo, new C8651r(), privacyInfo.f45974q.size(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_privacy_popup_title));
        this.f46489l1 = m87748rL;
        if (m87748rL != null) {
            m87748rL.m92602UK(this.f72421L0.m92649TI(), "MenuListPopupView");
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: U2 */
    public void mo46033U2() {
        try {
            MenuListPopupView menuListPopupView = this.f46489l1;
            if (menuListPopupView != null) {
                if (menuListPopupView != null) {
                    menuListPopupView.dismiss();
                }
            } else {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("MenuListPopupView");
                if (m92996E0 != null) {
                    m92996E0.finish();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: Ww */
    public boolean mo46034Ww() {
        if (m46024LM().f139462x.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: YM */
    public final boolean m46035YM() {
        return this.f46491n1;
    }

    /* renamed from: ZM */
    public final boolean m46036ZM() {
        return this.f46490m1;
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: Zp */
    public void mo46037Zp(long j11, String str, String str2, ThemeItem themeItem, PrivacyInfo privacyInfo, ArrayList arrayList, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        AbstractC19074t.m100208f(themeItem, "themeId");
        AbstractC19074t.m100208f(privacyInfo, "privacy");
        AbstractC19074t.m100208f(arrayList, "mediaList");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        Bundle bundle = new Bundle();
        bundle.putLong("albumid", j11);
        bundle.putString("title", str);
        bundle.putString("desc", str2);
        bundle.putParcelable("theme", themeItem);
        bundle.putParcelable("privacy", privacyInfo);
        bundle.putParcelableArrayList("medialist", arrayList);
        bundle.putInt("mode", 1);
        bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ProfileAlbumCreateView.class, bundle, 0, 1, true);
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: a0 */
    public void mo46038a0() {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: iq.y0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumDetailView.m45989SM(ProfileAlbumDetailView.this);
                }
            });
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: bt */
    public void mo46039bt(boolean z11, ProfileAlbumItem profileAlbumItem) {
        AbstractC19074t.m100208f(profileAlbumItem, "item");
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1054h(getTrackingKey(), "isOwner", Integer.valueOf(z11 ? 1 : 0));
        bVar.m1054h(getTrackingKey(), "privacy_setting", Integer.valueOf(profileAlbumItem.m46300c().m46282j().f45973p));
        bVar.m1054h(getTrackingKey(), "total_photos", Integer.valueOf(profileAlbumItem.m46300c().m46281i()));
        bVar.m1054h(getTrackingKey(), "total_videos", Integer.valueOf(profileAlbumItem.m46300c().m46289q()));
        bVar.m1054h(getTrackingKey(), "decorated_topic", Integer.valueOf(profileAlbumItem.m46300c().m46285m().getId()));
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: dI */
    public void mo46040dI(boolean z11) {
        m46024LM().f139462x.setCloseButtonVisibility(z11);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: f4 */
    public void mo46041f4() {
        try {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(PrivacyPickGroupView.class, null, 1006, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        Intent intent = new Intent();
        ArrayList arrayList = this.f46486i1;
        if (arrayList != null) {
            AbstractC19074t.m100205c(arrayList);
            if (arrayList.size() > 0) {
                intent.putExtra("deletedPhoto", this.f46486i1);
            }
        }
        boolean z11 = this.f46487j1;
        if (z11) {
            intent.putExtra("EXTRA_BOOL_FEED_DELETED", z11);
            intent.putExtra("EXTRA_STRING_FEED_ID", this.f46488k1);
        }
        boolean z12 = this.f46479b1;
        if (z12) {
            intent.putExtra("extra_bool_finished_compose_feed", z12);
        }
        if (!TextUtils.isEmpty(this.f46480c1)) {
            intent.putExtra("extra_result_avatar_path", this.f46480c1);
        }
        if (!TextUtils.isEmpty(this.f46481d1)) {
            intent.putExtra("extra_result_avatar_picid", this.f46481d1);
        }
        mo50035CK(-1, intent);
        super.finish();
    }

    /* renamed from: gN */
    public final void m46042gN(View view) {
        this.f46477Z0 = view;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfileAlbumDetailView";
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: h2 */
    public void mo46043h2() {
        C30051t9 m46024LM = m46024LM();
        m46024LM.f139461w.setContainerViewSnackBar(m46024LM.f139458t);
        m46024LM.f139461w.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: iq.z0
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                ProfileAlbumDetailView.m45993WM(ProfileAlbumDetailView.this);
            }
        });
        RecyclerView recyclerView = m46024LM.f139461w.f83582p0;
        AbstractC19074t.m100207e(recyclerView, "mRecyclerView");
        this.f46474W0 = recyclerView;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        m46049kN(noPredictiveItemAnimLinearLayoutMngr);
        RecyclerView recyclerView2 = this.f46474W0;
        InterfaceC20748t0 interfaceC20748t0 = null;
        if (recyclerView2 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(m46027OM());
        RecyclerView recyclerView3 = this.f46474W0;
        if (recyclerView3 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView3 = null;
        }
        recyclerView3.setBackgroundResource(AbstractC16803z.rectangle_transparent);
        RecyclerView recyclerView4 = this.f46474W0;
        if (recyclerView4 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView4 = null;
        }
        recyclerView4.setVisibility(0);
        RecyclerView recyclerView5 = this.f46474W0;
        if (recyclerView5 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView5 = null;
        }
        recyclerView5.setVerticalScrollBarEnabled(false);
        RecyclerView recyclerView6 = this.f46474W0;
        if (recyclerView6 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView6 = null;
        }
        recyclerView6.m9826E(new C8639f(m46024LM));
        m46024LM.getRoot().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8640g());
        m46029PM().m43220Y(new C8641h());
        m46029PM().m43292K0(new C8642i());
        m46029PM().f43972c0 = new C8050a.g() { // from class: iq.a1
            @Override // com.zing.zalo.feed.adapters.C8050a.g
            /* renamed from: a */
            public final boolean mo43330a() {
                boolean m45994XM;
                m45994XM = ProfileAlbumDetailView.m45994XM(ProfileAlbumDetailView.this);
                return m45994XM;
            }
        };
        m46029PM().m43297g0(new ArrayList());
        RecyclerView recyclerView7 = this.f46474W0;
        if (recyclerView7 == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView7 = null;
        }
        recyclerView7.setAdapter(m46029PM());
        InterfaceC20748t0 interfaceC20748t02 = this.f46472U0;
        if (interfaceC20748t02 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t02 = null;
        }
        interfaceC20748t02.mo46198Rh().m9219j(this, new C8648o(new C8643j()));
        InterfaceC20748t0 interfaceC20748t03 = this.f46472U0;
        if (interfaceC20748t03 == null) {
            AbstractC19074t.m100223u("mPresenter");
        } else {
            interfaceC20748t0 = interfaceC20748t03;
        }
        interfaceC20748t0.mo46213dj().m9219j(this, new C8648o(new C8644k()));
    }

    /* renamed from: hN */
    public final void m46044hN(View view) {
        this.f46478a1 = view;
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: hv */
    public void mo46045hv() {
        final C8637d c8637d = new C8637d();
        m46024LM().f139455q.setOnClickListener(new View.OnClickListener() { // from class: iq.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileAlbumDetailView.m45992VM(ProfileAlbumDetailView.this, c8637d, view);
            }
        });
        RelativeLayout relativeLayout = m46024LM().f139455q;
        AbstractC19074t.m100207e(relativeLayout, "buttonPostPhotoContainer");
        m45988RM(relativeLayout);
        InterfaceC20748t0 interfaceC20748t0 = this.f46472U0;
        if (interfaceC20748t0 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC20748t0 = null;
        }
        interfaceC20748t0.mo46231oo().m9219j(this, new C8648o(new C8636c()));
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: i2 */
    public void mo46046i2() {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable = (StateListDrawable) m118665N;
        Drawable m118665N2 = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        Drawable m118665N3 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable2 = (StateListDrawable) m118665N3;
        Drawable m118665N4 = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        RecyclerView recyclerView = this.f46474W0;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("profileListview");
            recyclerView = null;
        }
        C8638e c8638e = new C8638e(stateListDrawable, m118665N2, stateListDrawable2, m118665N4, this, recyclerView);
        this.f46483f1 = c8638e;
        c8638e.m114859H(AbstractC23136l9.m118742r(300.0f), AbstractC23136l9.m118742r(60.0f));
        c8638e.m65929g0((RobotoTextView) m46024LM().f139458t.findViewById(AbstractC6918a0.bubble_date));
        c8638e.m114844Y(3);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: iM */
    public int mo46047iM() {
        return -1;
    }

    /* renamed from: iN */
    public final void m46048iN(C30051t9 c30051t9) {
        AbstractC19074t.m100208f(c30051t9, "<set-?>");
        this.f46473V0 = c30051t9;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
    }

    /* renamed from: kN */
    public final void m46049kN(NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr) {
        AbstractC19074t.m100208f(noPredictiveItemAnimLinearLayoutMngr, "<set-?>");
        this.f46475X0 = noPredictiveItemAnimLinearLayoutMngr;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: kf */
    public void mo11960kf(View view, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
    }

    /* renamed from: lN */
    public final void m46050lN(int i11) {
        this.f46485h1 = i11;
    }

    /* renamed from: nN */
    public final void m46051nN(boolean z11) {
        this.f46491n1 = z11;
    }

    /* renamed from: oN */
    public final void m46052oN(boolean z11) {
        this.f46490m1 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle bundle;
        Bundle bundle2;
        super.onActivityResult(i11, i12, intent);
        InterfaceC20748t0 interfaceC20748t0 = null;
        InterfaceC20748t0 interfaceC20748t02 = null;
        InterfaceC20748t0 interfaceC20748t03 = null;
        InterfaceC20748t0 interfaceC20748t04 = null;
        InterfaceC20748t0 interfaceC20748t05 = null;
        Bundle bundle3 = null;
        InterfaceC20748t0 interfaceC20748t06 = null;
        if (i11 != 1000) {
            if (i11 != 10014) {
                if (i11 != 1002) {
                    if (i11 != 1003) {
                        switch (i11) {
                            case 1005:
                                InterfaceC20748t0 interfaceC20748t07 = this.f46472U0;
                                if (interfaceC20748t07 == null) {
                                    AbstractC19074t.m100223u("mPresenter");
                                } else {
                                    interfaceC20748t04 = interfaceC20748t07;
                                }
                                interfaceC20748t04.mo46239w3(i12, intent);
                                return;
                            case 1006:
                                InterfaceC20748t0 interfaceC20748t08 = this.f46472U0;
                                if (interfaceC20748t08 == null) {
                                    AbstractC19074t.m100223u("mPresenter");
                                } else {
                                    interfaceC20748t03 = interfaceC20748t08;
                                }
                                interfaceC20748t03.mo46239w3(i12, intent);
                                return;
                            case 1007:
                                InterfaceC20748t0 interfaceC20748t09 = this.f46472U0;
                                if (interfaceC20748t09 == null) {
                                    AbstractC19074t.m100223u("mPresenter");
                                } else {
                                    interfaceC20748t02 = interfaceC20748t09;
                                }
                                interfaceC20748t02.mo46205Y1(i12, intent);
                                return;
                            default:
                                return;
                        }
                    }
                    if (i12 == -1 && intent != null && intent.getExtras() != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null && extras.getBoolean("EXTRA_RESULT_DELETE_ALBUM", false)) {
                            InterfaceC20748t0 interfaceC20748t010 = this.f46472U0;
                            if (interfaceC20748t010 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                                interfaceC20748t010 = null;
                            }
                            interfaceC20748t010.mo46199S6();
                        }
                        if (extras != null && extras.getBoolean("EXTRA_RESULT_EDIT_ALBUM", false)) {
                            InterfaceC20748t0 interfaceC20748t011 = this.f46472U0;
                            if (interfaceC20748t011 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                                interfaceC20748t011 = null;
                            }
                            interfaceC20748t011.mo46238tk();
                        }
                        if (extras != null && extras.getBoolean("EXTRA_RESULT_CHANGE_PRIVACY", false)) {
                            InterfaceC20748t0 interfaceC20748t012 = this.f46472U0;
                            if (interfaceC20748t012 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                                interfaceC20748t012 = null;
                            }
                            interfaceC20748t012.mo46237t5();
                        }
                        if (extras != null && extras.getBoolean("EXTRA_RESULT_CHANGE_THEME", false)) {
                            InterfaceC20748t0 interfaceC20748t013 = this.f46472U0;
                            if (interfaceC20748t013 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                            } else {
                                interfaceC20748t05 = interfaceC20748t013;
                            }
                            interfaceC20748t05.mo46202Vl();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i12 == -1) {
                    if (intent != null) {
                        bundle3 = intent.getExtras();
                    }
                    AbstractC19074t.m100205c(bundle3);
                    boolean z11 = bundle3.getBoolean("EXTRA_BOL_UPDATE_STATUS_FINISHED");
                    this.f46479b1 = z11;
                    if (z11) {
                        finish();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == -1) {
                if (intent != null) {
                    bundle2 = intent.getExtras();
                } else {
                    bundle2 = null;
                }
                AbstractC19074t.m100205c(bundle2);
                this.f46487j1 = bundle2.getBoolean("EXTRA_BOOL_FEED_DELETED");
                this.f46488k1 = bundle2.getString("EXTRA_STRING_FEED_ID");
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) bundle2.getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
                if (this.f46487j1 && itemAlbumMobile != null) {
                    InterfaceC20748t0 interfaceC20748t014 = this.f46472U0;
                    if (interfaceC20748t014 == null) {
                        AbstractC19074t.m100223u("mPresenter");
                    } else {
                        interfaceC20748t06 = interfaceC20748t014;
                    }
                    interfaceC20748t06.mo46191E3(itemAlbumMobile.f42595r);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == -1) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                int i13 = bundle.getInt("totalPhoto");
                this.f46486i1 = bundle.getStringArrayList("deletedPhoto");
                InterfaceC20748t0 interfaceC20748t015 = this.f46472U0;
                if (interfaceC20748t015 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC20748t015 = null;
                }
                interfaceC20748t015.mo46196Lm(i13, this.f46486i1);
                m46029PM().m43295N0();
                this.f46480c1 = bundle.getString("EXTRA_RESULT_AVATAR_PATH", "");
                this.f46481d1 = bundle.getString("EXTRA_RESULT_AVATAR_PICID", "");
                InterfaceC20748t0 interfaceC20748t016 = this.f46472U0;
                if (interfaceC20748t016 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC20748t0 = interfaceC20748t016;
                }
                interfaceC20748t0.mo46186Ag(this.f46480c1, this.f46481d1);
            }
        }
        m46027OM().mo9756v1(this.f46485h1);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            InterfaceC20748t0 interfaceC20748t0 = this.f46472U0;
            if (interfaceC20748t0 == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC20748t0 = null;
            }
            interfaceC20748t0.mo46194Ih();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pN */
    public final void m46053pN(C8050a c8050a) {
        AbstractC19074t.m100208f(c8050a, "<set-?>");
        this.f46476Y0 = c8050a;
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: rh */
    public void mo46054rh() {
        m46024LM().f139462x.setVisibility(8);
    }

    @Override // iq.InterfaceC20753u0
    public void setBackgroundColor(int i11) {
        m46024LM().getRoot().setBackgroundColor(i11);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: su */
    public void mo46055su(C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "setActionOnLastEntryPoint");
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, c32002l4).m135742a(1).m135743b(), 0, 1));
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: tw */
    public void mo46056tw() {
        m46002mN(false);
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: u0 */
    public void mo46057u0(List list) {
        AbstractC19074t.m100208f(list, "listPrivacyFriend");
        try {
            Bundle m83055pM = ProfilePickerView.m83055pM(new ArrayList(list), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfilePickerView.class, m83055pM, 1005, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: uA */
    public void mo46058uA(int i11) {
        try {
            if (!AbstractC23309i.m121565We()) {
                ToastUtils.m89266n(AbstractC8020f0.feature_is_not_supported_on_device, new Object[0]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("extra_from_feed_remind_media_type", 2);
            bundle.putString("extra_tracking_source", new TrackingSource(i11).m40686z());
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(UpdateStatusView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        this.f46471T0.post(new Runnable() { // from class: iq.b1
            @Override // java.lang.Runnable
            public final void run() {
                ProfileAlbumDetailView.m45984JM(i11, this);
            }
        });
    }

    @Override // iq.InterfaceC20753u0
    /* renamed from: ya */
    public void mo46059ya(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "theme");
        C30051t9 m46024LM = m46024LM();
        m46024LM.f139462x.setVisibility(0);
        m46024LM.f139462x.setThemePickerCallback(new C8650q());
        m46024LM.f139462x.m45424e(themeItem);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 5100);
    }
}
