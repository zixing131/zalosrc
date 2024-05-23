package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as.InterfaceC2333h;
import bn.C2913t1;
import bo.C2949b;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.InterfaceC2946a1;
import cd0.C3427f;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7033c9;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8438y1;
import com.zing.zalo.feed.components.ProfileMusicView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlideShowSound;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hf0.C20043e;
import ho0.AbstractC20110a;
import i40.C20275e;
import io.C20637a;
import iq.InterfaceC20650a;
import iq.InterfaceC20656b;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20815q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23006a0;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.AbstractC23199r6;
import me0.AbstractC23202r9;
import me0.AbstractC23265y;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p167fs.C19140e;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p426pp.C24903f;
import p542ub.InterfaceC27218a;
import p554up.C27353a;
import p691yr.C31060j;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32036n8;
import p716zh.C32065p8;
import p716zh.C32123ta;
import p726zr.C32547c;
import sa0.C26203c;
import sa0.C26209i;
import sn.C26333b;
import vg.AbstractC28207v1;
import vg.AbstractC28236y3;
import vg.C28100j3;
import vg.C28212v6;

/* loaded from: classes6.dex */
public abstract class ProfileBaseView extends FeedCallbackZaloView implements InterfaceC20656b, View.OnClickListener {

    /* renamed from: A1 */
    View f76167A1;

    /* renamed from: B1 */
    RecyclingImageView f76168B1;

    /* renamed from: C1 */
    SlideShowSound f76169C1;

    /* renamed from: D1 */
    View f76170D1;

    /* renamed from: E1 */
    RobotoTextView f76171E1;

    /* renamed from: F1 */
    View f76172F1;

    /* renamed from: K1 */
    AbstractC11859g f76177K1;

    /* renamed from: L1 */
    C27353a f76178L1;

    /* renamed from: M1 */
    KeyEventCallbackC17462c f76179M1;

    /* renamed from: N1 */
    protected List f76180N1;

    /* renamed from: O1 */
    RecyclingImageView f76181O1;

    /* renamed from: R0 */
    protected C23528a f76184R0;

    /* renamed from: R1 */
    protected C13306b f76185R1;

    /* renamed from: T0 */
    protected float f76188T0;

    /* renamed from: V0 */
    View f76192V0;

    /* renamed from: Z0 */
    RecyclingImageView f76197Z0;

    /* renamed from: a1 */
    View f76198a1;

    /* renamed from: b1 */
    Avatar f76199b1;

    /* renamed from: c1 */
    FrameRoundedLayout f76200c1;

    /* renamed from: d1 */
    FrameRoundedLayout f76201d1;

    /* renamed from: e1 */
    RelativeLayout f76202e1;

    /* renamed from: f1 */
    TrackingRelativeLayout f76203f1;

    /* renamed from: g1 */
    View f76204g1;

    /* renamed from: h1 */
    ImageButton f76205h1;

    /* renamed from: i1 */
    Drawable f76206i1;

    /* renamed from: j1 */
    TrackingRelativeLayout f76207j1;

    /* renamed from: k1 */
    Avatar f76208k1;

    /* renamed from: l1 */
    View f76209l1;

    /* renamed from: m1 */
    View f76210m1;

    /* renamed from: n1 */
    View f76211n1;

    /* renamed from: o1 */
    SwipeRefreshListView f76212o1;

    /* renamed from: p1 */
    protected RecyclerView f76213p1;

    /* renamed from: q1 */
    LinearLayoutManager f76214q1;

    /* renamed from: r1 */
    protected C8050a f76215r1;

    /* renamed from: s1 */
    protected View f76216s1;

    /* renamed from: t1 */
    protected View f76217t1;

    /* renamed from: v1 */
    private View f76219v1;

    /* renamed from: z1 */
    ProfileMusicView f76223z1;

    /* renamed from: S0 */
    protected Handler f76186S0 = new Handler(Looper.getMainLooper());

    /* renamed from: U0 */
    C20815q f76190U0 = new C20815q();

    /* renamed from: W0 */
    int f76194W0 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC17484n.Companion.m92931b();

    /* renamed from: X0 */
    int f76195X0 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.cover_height);

    /* renamed from: Y0 */
    int f76196Y0 = 0;

    /* renamed from: u1 */
    protected boolean f76218u1 = true;

    /* renamed from: w1 */
    boolean f76220w1 = false;

    /* renamed from: x1 */
    int f76221x1 = AbstractC23136l9.m118742r(48.0f) * (-1);

    /* renamed from: y1 */
    long f76222y1 = 200;

    /* renamed from: G1 */
    private Snackbar f76173G1 = null;

    /* renamed from: H1 */
    private boolean f76174H1 = false;

    /* renamed from: I1 */
    private boolean f76175I1 = false;

    /* renamed from: J1 */
    boolean f76176J1 = false;

    /* renamed from: P1 */
    C23999j f76182P1 = new C14787b();

    /* renamed from: Q1 */
    RunnableC14795j f76183Q1 = new RunnableC14795j(new C14789d());

    /* renamed from: S1 */
    C13306b.c f76187S1 = new C14791f();

    /* renamed from: T1 */
    protected AbstractC22055v0.l f76189T1 = new C14792g();

    /* renamed from: U1 */
    boolean f76191U1 = true;

    /* renamed from: V1 */
    Handler f76193V1 = new HandlerC14793h(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$a */
    /* loaded from: classes6.dex */
    public class C14786a implements InterfaceC8438y1 {
        C14786a() {
        }

        @Override // com.zing.zalo.feed.components.InterfaceC8438y1
        /* renamed from: a */
        public AbstractC1785o mo44963a() {
            return ProfileBaseView.this.getLifecycle();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$b */
    /* loaded from: classes6.dex */
    class C14787b extends C23999j {
        C14787b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18839c() != null) {
                ProfileBaseView profileBaseView = ProfileBaseView.this;
                profileBaseView.f76199b1.setImageDrawable(AbstractC28236y3.m142198i(profileBaseView.getContext(), c3979l.m18839c()));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$c */
    /* loaded from: classes6.dex */
    class C14788c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f76226l1;

        /* renamed from: m1 */
        final /* synthetic */ C24003n f76227m1;

        C14788c(String str, C24003n c24003n) {
            this.f76226l1 = str;
            this.f76227m1 = c24003n;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            ProfileBaseView profileBaseView = ProfileBaseView.this;
            profileBaseView.f76199b1.setImageDrawable(AbstractC28236y3.m142198i(profileBaseView.getContext(), c3979l.m18839c()));
            if (!TextUtils.isEmpty(this.f76226l1)) {
                ProfileBaseView.this.f76199b1.setTag(this.f76226l1);
                ProfileBaseView profileBaseView2 = ProfileBaseView.this;
                ((C23528a) profileBaseView2.f76184R0.m123612r(profileBaseView2.f76181O1)).m123579C(this.f76226l1, this.f76227m1, ProfileBaseView.this.f76182P1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$d */
    /* loaded from: classes6.dex */
    class C14789d implements RunnableC14795j.c {
        C14789d() {
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView.RunnableC14795j.c
        /* renamed from: a */
        public boolean mo46114a() {
            if (ProfileBaseView.this.m92687sJ() && (ProfileBaseView.this.mo82198WM().mo107653m3() == 1 || ProfileBaseView.this.f76212o1.m88207P())) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView.RunnableC14795j.c
        /* renamed from: b */
        public void mo46115b() {
            ProfileBaseView profileBaseView = ProfileBaseView.this;
            Handler handler = profileBaseView.f76186S0;
            if (handler != null) {
                handler.postDelayed(profileBaseView.f76183Q1, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$e */
    /* loaded from: classes6.dex */
    public class C14790e implements ProfileMusicView.InterfaceC8217b {
        C14790e() {
        }

        @Override // com.zing.zalo.feed.components.ProfileMusicView.InterfaceC8217b
        /* renamed from: a */
        public void mo44480a(int i11) {
            ProfileBaseView.this.mo82198WM().mo107640Di(i11);
        }

        @Override // com.zing.zalo.feed.components.ProfileMusicView.InterfaceC8217b
        /* renamed from: b */
        public void mo44481b() {
            ProfileBaseView.this.mo82198WM().mo107661zn();
        }

        @Override // com.zing.zalo.feed.components.ProfileMusicView.InterfaceC8217b
        /* renamed from: c */
        public void mo44482c() {
            ProfileBaseView.this.mo82198WM().mo107657ri();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$f */
    /* loaded from: classes6.dex */
    class C14791f extends C13306b.c {
        C14791f() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            return ProfileBaseView.this.mo82928JM(c28212v6);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: b */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
            ProfileBaseView.this.mo82183LM(c26209i, str, c28212v6);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            if (TextUtils.equals(str, "tip.profile.rightmenu.setalias")) {
                c26203c.f124513d = AbstractC23136l9.m118742r(2.0f);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return ProfileBaseView.this.mo82205aN();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            return ProfileBaseView.this.mo82210bN(str);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (ProfileBaseView.this.f72421L0.m92672lJ() && ProfileBaseView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$g */
    /* loaded from: classes6.dex */
    public class C14792g extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$g$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f76233a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f76234b;

            /* renamed from: c */
            final /* synthetic */ int f76235c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f76233a = nVar;
                this.f76234b = c31980jc;
                this.f76235c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    AbstractC22055v0.n nVar = this.f76233a;
                    if (nVar != null) {
                        nVar.mo17230p(this.f76234b, ProfileBaseView.this.f76184R0);
                    }
                    C8050a c8050a = ProfileBaseView.this.f76215r1;
                    if (c8050a != null) {
                        c8050a.m10008p();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (ProfileBaseView.this.f72421L0.m92672lJ() && ProfileBaseView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
                ProfileBaseView.this.mo82184NN(gVar);
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (ProfileBaseView.this.f72421L0.m92672lJ() && ProfileBaseView.this.f72421L0.m92687sJ() && hVar != null) {
                    bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    bundle.putInt("srcType", this.f76235c);
                    AbstractC22055v0.m115127Q(hVar, this.f76233a, ProfileBaseView.this.f72421L0.m92676n2(), bundle, 0);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$g$b */
        /* loaded from: classes6.dex */
        class b implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.i f76237a;

            /* renamed from: b */
            final /* synthetic */ C3427f f76238b;

            b(AbstractC22055v0.i iVar, C3427f c3427f) {
                this.f76237a = iVar;
                this.f76238b = c3427f;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    ProfileBaseView.this.mo82198WM().mo107650fc();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (ProfileBaseView.this.f72421L0.m92672lJ() && ProfileBaseView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
                ProfileBaseView.this.mo82184NN(gVar);
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                try {
                    if (ProfileBaseView.this.f72421L0.m92672lJ() && ProfileBaseView.this.f72421L0.m92687sJ() && hVar != null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_LATEST_TO_OLDEST", true);
                        bundle.putInt("srcType", 338);
                        AbstractC22055v0.m115128R(hVar, this.f76237a, ProfileBaseView.this.f72421L0.m92676n2(), bundle, ZAbstractBase.ZVU_PROCESS_FLUSH, this.f76238b);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        C14792g() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: a */
        public void mo48298a(AbstractC22055v0.j jVar) {
            ProfileBaseView.this.m82939QN(new TrackingSource(1));
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: b */
        public void mo82050b(C32123ta c32123ta, C22033k0.h hVar, AbstractC22055v0.i iVar) {
            try {
                C3427f m82967YM = ProfileBaseView.this.m82967YM();
                if (m82967YM != null) {
                    m82967YM.m17190o(m82967YM.m17209s(c32123ta));
                }
                C22033k0.m115006h().m115017q(4, hVar, new b(iVar, m82967YM));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(nVar, c31980jc, i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$h */
    /* loaded from: classes6.dex */
    class HandlerC14793h extends Handler {

        /* renamed from: a */
        final int f76240a;

        /* renamed from: b */
        int f76241b;

        /* renamed from: c */
        int f76242c;

        HandlerC14793h(Looper looper) {
            super(looper);
            this.f76240a = 3;
        }

        /* renamed from: a */
        private void m83004a() {
            this.f76241b = 0;
        }

        /* renamed from: b */
        private void m83005b() {
            this.f76242c = 0;
        }

        /* renamed from: c */
        private void m83006c() {
            int i11 = this.f76241b + 1;
            this.f76241b = i11;
            if (i11 < 3) {
                ProfileBaseView.this.m82945SN(100);
            } else {
                this.f76241b = 0;
            }
        }

        /* renamed from: d */
        private void m83007d() {
            int i11 = this.f76242c + 1;
            this.f76242c = i11;
            if (i11 < 3) {
                ProfileBaseView.this.m82949TN();
            } else {
                this.f76242c = 0;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 10000) {
                    if (i11 != 10001) {
                        super.handleMessage(message);
                    } else if (!ProfileBaseView.this.m82992mN()) {
                        m83007d();
                    } else {
                        m83005b();
                        ProfileBaseView profileBaseView = ProfileBaseView.this;
                        profileBaseView.m82929JN(profileBaseView.mo82185PM(), ProfileBaseView.this.mo82211cN());
                    }
                } else if (!ProfileBaseView.this.m82988kN()) {
                    m83006c();
                } else {
                    m83004a();
                    ProfileBaseView.this.m82927IN();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$i */
    /* loaded from: classes6.dex */
    public class C14794i extends AbstractC11859g {
        C14794i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: d0 */
        protected void mo46064d0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: e0 */
        public void mo46065e0(int i11) {
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$j */
    /* loaded from: classes6.dex */
    public static class RunnableC14795j implements Runnable {

        /* renamed from: p */
        int f76245p = 0;

        /* renamed from: q */
        public View f76246q;

        /* renamed from: r */
        public c f76247r;

        /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$j$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RunnableC14795j runnableC14795j = RunnableC14795j.this;
                runnableC14795j.f76245p = 2;
                runnableC14795j.f76246q.setVisibility(8);
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$j$b */
        /* loaded from: classes6.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RunnableC14795j.this.f76245p = 0;
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.ProfileBaseView$j$c */
        /* loaded from: classes6.dex */
        public interface c {
            /* renamed from: a */
            boolean mo46114a();

            /* renamed from: b */
            void mo46115b();
        }

        public RunnableC14795j(c cVar) {
            this.f76247r = cVar;
        }

        /* renamed from: a */
        public void m83008a() {
            this.f76247r.mo46115b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f76246q == null) {
                return;
            }
            if (this.f76245p != 1) {
                if (this.f76247r.mo46114a()) {
                    if (this.f76245p == 0) {
                        AbstractC23202r9.m119542j(this.f76246q, new a());
                        this.f76245p = 1;
                        return;
                    }
                    return;
                }
                if (this.f76245p == 2) {
                    this.f76246q.setVisibility(0);
                    AbstractC23202r9.m119540h(this.f76246q, new b());
                    this.f76245p = 1;
                    return;
                }
                return;
            }
            this.f76247r.mo46115b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public /* synthetic */ void m82878AN(C3000l0 c3000l0, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            mo82198WM().mo107646T7(c3000l0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public /* synthetic */ void m82882CN(C3020p0 c3020p0, C32002l4 c32002l4, int i11) {
        mo82198WM().mo107642El(c3020p0, i11, c32002l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public /* synthetic */ void m82884DN() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f76212o1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public /* synthetic */ void m82886EN(C3020p0 c3020p0, int i11, String str) {
        mo82198WM().mo107652kl(c3020p0, i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public /* synthetic */ void m82888FN() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f76212o1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.m88209V();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public /* synthetic */ void m82890GN(int i11) {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f76212o1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.m88210W(i11);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public /* synthetic */ void m82892HN(String str, int i11) {
        mo82947T();
        m82900eN();
        this.f76173G1 = AbstractC20826v0.m108786T0(this.f76192V0, str, i11);
    }

    /* renamed from: LN */
    private void m82894LN() {
        m82895MN();
    }

    /* renamed from: MN */
    private void m82895MN() {
        this.f76178L1.m139983W().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.k70
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ProfileBaseView.this.m82908sN((InterfaceC2946a1) obj);
            }
        });
    }

    /* renamed from: OM */
    private int m82896OM() {
        View view = this.f76219v1;
        if (view != null) {
            return view.getBottom();
        }
        return 0;
    }

    /* renamed from: VN */
    private void m82897VN() {
        this.f76215r1.f43954K = m82954UM();
    }

    /* renamed from: XM */
    private int m82898XM(String str) {
        if (Objects.equals(str, CoreUtility.f89233i)) {
            return 0;
        }
        if (AbstractC21935u.m114554u(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: ZM */
    private int m82899ZM(C31980jc c31980jc) {
        if (c31980jc == null) {
            return 0;
        }
        if (!c31980jc.f147026s) {
            return 1;
        }
        return 2;
    }

    /* renamed from: eN */
    private void m82900eN() {
        Snackbar snackbar = this.f76173G1;
        if (snackbar != null && snackbar.m90661t()) {
            this.f76173G1.m90655n();
            this.f76173G1 = null;
        }
    }

    /* renamed from: gN */
    private void m82901gN() {
        this.f76178L1 = (C27353a) new C1802w0(this, new C27353a.e(this, null)).m9378a(C27353a.class);
        m82894LN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public /* synthetic */ void m82902pN() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f76212o1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public /* synthetic */ void m82904qN() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f76212o1;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.m88202K();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public /* synthetic */ void m82906rN(int i11, Object obj) {
        C8050a c8050a = this.f76215r1;
        if (c8050a != null) {
            c8050a.m10010r(i11, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public /* synthetic */ void m82908sN(InterfaceC2946a1 interfaceC2946a1) {
        mo82198WM().mo107658te(interfaceC2946a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public /* synthetic */ void m82910tN(C3000l0 c3000l0, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        mo82198WM().mo107647U6(c3000l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static /* synthetic */ boolean m82912uN() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public /* synthetic */ void m82914vN(List list, List list2) {
        try {
            C8050a c8050a = this.f76215r1;
            if (c8050a != null) {
                c8050a.m43298h0(list, list2);
                this.f76215r1.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public /* synthetic */ void m82916wN() {
        C8050a c8050a = this.f76215r1;
        if (c8050a != null) {
            c8050a.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public /* synthetic */ void m82918xN() {
        LinearLayoutManager linearLayoutManager = this.f76214q1;
        if (linearLayoutManager != null && linearLayoutManager.m9740Y1() != 0) {
            this.f76214q1.mo9756v1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public /* synthetic */ void m82920yN(InterfaceC17463d interfaceC17463d) {
        if (this.f76179M1 == interfaceC17463d) {
            this.f76179M1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public /* synthetic */ void m82922zN(boolean z11, C3020p0 c3020p0, C3000l0 c3000l0, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (z11) {
                mo82206ad(c3020p0, c3000l0, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: AE */
    public void mo82923AE(final int i11, final Object obj) {
        try {
            this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.c70
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileBaseView.this.m82906rN(i11, obj);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Aw */
    public void mo82924Aw(String str, boolean z11) {
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74688D(str, z11);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: B4 */
    public void mo82925B4() {
        C8050a c8050a = this.f76215r1;
        if (c8050a != null) {
            c8050a.m10008p();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Bp */
    public void mo82926Bp(final List list, final List list2) {
        if (!AbstractC19444a.m101693a()) {
            AbstractC20110a.m104538g("Wrong threadUI render feed", new Object[0]);
            this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v60
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileBaseView.this.m82914vN(list, list2);
                }
            });
            return;
        }
        try {
            C8050a c8050a = this.f76215r1;
            if (c8050a != null) {
                c8050a.m43298h0(list, list2);
                this.f76215r1.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f76185R1 = new C13306b(this.f72421L0.m92648SI());
        AbstractC20814p0.m108674v(getContext());
        this.f76188T0 = AbstractC23309i.m121892f4() / 100.0f;
        C32036n8.m154515e().m154522g();
        m82901gN();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        Handler handler = this.f76193V1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f76186S0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: IN */
    protected void m82927IN() {
        m82897VN();
        if (this.f76198a1 != null) {
            m82960WN();
        }
        if (this.f76191U1 && this.f72421L0.m92674mJ()) {
            mo82993mm(0);
        }
        this.f76191U1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: JM */
    public boolean mo82928JM(C28212v6 c28212v6) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: JN */
    public void m82929JN(Map map, Map map2) {
        m82931KN(map, map2, false);
    }

    /* renamed from: KM */
    public void m82930KM() {
        C3000l0 c3000l0;
        View childAt;
        try {
            if (this.f76215r1 != null && this.f76213p1 != null) {
                int m9740Y1 = this.f76214q1.m9740Y1();
                int m9745c2 = this.f76214q1.m9745c2();
                if (m9740Y1 >= 0 && m9740Y1 <= m9745c2) {
                    for (int i11 = m9740Y1; i11 <= m9745c2; i11++) {
                        C2966e1 m43214Q = this.f76215r1.m43214Q(i11);
                        if (m43214Q != null && this.f76215r1.m43216U(m43214Q.f11705c) && (c3000l0 = m43214Q.f11703a) != null && (childAt = this.f76213p1.getChildAt(i11 - m9740Y1)) != null) {
                            AbstractC20826v0.m108809g(c3000l0, 0, Math.min(childAt.getBottom(), this.f76213p1.getHeight()) - Math.max(0, childAt.getTop()), childAt.getBottom() - childAt.getTop(), this.f76188T0, mo82938QM(), mo82198WM().mo107637Ch(c3000l0.m14324b0(0).f12057p));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KN */
    protected void m82931KN(Map map, Map map2, boolean z11) {
        int m118742r;
        if (m82992mN()) {
            int m9740Y1 = this.f76214q1.m9740Y1();
            RecyclerView recyclerView = this.f76213p1;
            if (recyclerView != null && m9740Y1 == 0) {
                int[] iArr = new int[2];
                int i11 = 0;
                if (recyclerView.getChildAt(0) != null) {
                    this.f76213p1.getChildAt(0).getLocationInWindow(iArr);
                    i11 = this.f76196Y0 - iArr[1];
                }
                m118742r = i11;
            } else {
                m118742r = this.f76195X0 + AbstractC23136l9.m118742r(100.0f);
            }
            AbstractC23199r6.m119529b(m118742r, this.f88760a0, this.f76197Z0, this.f76198a1, this.f76203f1, this.f76199b1, null, this.f76223z1, true, this.f76195X0, this.f76194W0, this.f76206i1, this.f76180N1, map, map2, this, m82948TM(), z11);
        }
    }

    /* renamed from: LF */
    public void mo82182LF(ImageView imageView, C23528a c23528a, String str, Bundle bundle, C20275e c20275e, int i11, C3020p0 c3020p0) {
        c20275e.m105885x(false);
        try {
            this.f72421L0.m92676n2().mo35556V(imageView, str, bundle, c20275e, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    protected void mo82183LM(C26209i c26209i, String str, C28212v6 c28212v6) {
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: M5 */
    public void mo11926M5(C2949b c2949b, int i11, C32002l4 c32002l4) {
        if (c32002l4 == null) {
            c32002l4 = mo82938QM();
        }
        super.mo11926M5(c2949b, i11, c32002l4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: MM */
    public C0708i m82932MM(String str) {
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        int m82898XM = m82898XM(str);
        int m82899ZM = m82899ZM(m115161u);
        C0708i c0708i = new C0708i();
        c0708i.m1072c("profile_type", m82898XM);
        c0708i.m1072c("story_status", m82899ZM);
        return c0708i;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        RecyclerView recyclerView;
        if (i11 == 4 && (recyclerView = this.f76213p1) != null) {
            recyclerView.m9866X1();
        }
        return super.mo39030NJ(i11, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: NM */
    public View m82933NM(int i11) {
        if (this.f72421L0.m92656bJ() == null) {
            return null;
        }
        return this.f72421L0.m92656bJ().findViewById(i11);
    }

    /* renamed from: NN */
    protected abstract void mo82184NN(C22033k0.g gVar);

    /* renamed from: ON */
    public void m82934ON() {
        try {
            if (this.f76216s1 == null) {
                return;
            }
            int m82896OM = m82896OM();
            if (m82896OM < this.f76194W0) {
                if (!this.f76220w1) {
                    this.f76216s1.setVisibility(0);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f76216s1, "translationY", 0.0f);
                    ofFloat.setDuration(this.f76222y1);
                    ofFloat.start();
                    this.f76220w1 = true;
                }
            } else if (m82896OM > this.f76216s1.getHeight() && AbstractC23136l9.m118666N0(this.f76216s1)) {
                this.f76216s1.setVisibility(8);
                this.f76216s1.setTranslationY(this.f76221x1);
                this.f76220w1 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Oq */
    public void mo82935Oq(String str) {
        RobotoTextView robotoTextView = this.f76171E1;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    /* renamed from: PM */
    protected abstract Map mo82185PM();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: PN */
    public void m82936PN() {
        C8050a c8050a = this.f76215r1;
        if (c8050a != null) {
            c8050a.m43291J0(new C14786a());
            this.f76215r1.m43294M0(new InterfaceC8343n5() { // from class: com.zing.zalo.ui.zviews.b70
                @Override // com.zing.zalo.feed.components.InterfaceC8343n5
                /* renamed from: a */
                public final boolean mo44786a() {
                    boolean m82912uN;
                    m82912uN = ProfileBaseView.m82912uN();
                    return m82912uN;
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Q2 */
    public void mo11930Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
        mo82198WM().mo107645Q2(c3020p0, c32002l4);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: QE */
    public int mo82937QE() {
        int i11 = 0;
        try {
            RecyclerView recyclerView = this.f76213p1;
            if (recyclerView != null && this.f76215r1 != null) {
                i11 = recyclerView.getChildCount() < this.f76215r1.mo10003k() ? m82989lN() ? m82940RM() : m82944SM() : m82944SM();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        RecyclerView recyclerView;
        if (i11 == 16908332 && (recyclerView = this.f76213p1) != null) {
            recyclerView.m9866X1();
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QM */
    protected C32002l4 mo82938QM() {
        return mo82198WM().mo107651g();
    }

    /* renamed from: QN */
    public void m82939QN(TrackingSource trackingSource) {
        Point point;
        if (m82967YM() != null) {
            point = m82967YM().m17185i();
        } else {
            point = null;
        }
        AbstractC22055v0.m115134X(this.f72421L0, point, null, trackingSource);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: R5 */
    public void mo11931R5(C3020p0 c3020p0) {
        String str;
        C3025q0 c3025q0;
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            String str2 = "";
            if (c3020p0 == null || (c3025q0 = c3020p0.f12023C) == null) {
                str = "";
            } else {
                str = c3025q0.f12101J;
            }
            if (c3020p0 != null) {
                str2 = c3020p0.m14465A();
            }
            if (m92676n2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Bundle bundle = new Bundle();
                bundle.putString("fid", str);
                bundle.putString("ownerId", str2);
                C32002l4 mo82938QM = mo82938QM();
                if (mo82938QM != null) {
                    bundle.putString("extra_entry_point_flow", mo82938QM.m154284u(12).m154277l());
                }
                m92676n2.mo35579p().m93069k2(FeedDetailsView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74709u();
        }
        C26333b.f125013a.m135515e();
    }

    /* renamed from: RM */
    int m82940RM() {
        RecyclerView recyclerView = this.f76213p1;
        if (recyclerView == null) {
            return 0;
        }
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        for (int i11 = 0; i11 < this.f76213p1.getChildCount(); i11++) {
            View childAt = this.f76213p1.getChildAt(i11);
            if (childAt instanceof ChangeableHeightView) {
                computeVerticalScrollRange -= childAt.getMeasuredHeight();
            }
        }
        return computeVerticalScrollRange;
    }

    /* renamed from: RN */
    public void m82941RN() {
        int m118713h0 = this.f76195X0 - ((int) (AbstractC23136l9.m118713h0() * 0.33f));
        LinearLayoutManager linearLayoutManager = this.f76214q1;
        if (linearLayoutManager != null) {
            linearLayoutManager.m9721B2(0, -m118713h0);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: S */
    public void mo82942S() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.a70
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82888FN();
            }
        });
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: SF */
    public void mo82943SF(boolean z11) {
        int i11;
        TrackingRelativeLayout trackingRelativeLayout = this.f76203f1;
        if (trackingRelativeLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trackingRelativeLayout.setVisibility(i11);
        }
    }

    /* renamed from: SM */
    int m82944SM() {
        if (this.f76213p1 == null) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f76213p1.getChildCount(); i12++) {
            View childAt = this.f76213p1.getChildAt(i12);
            if (!(childAt instanceof ChangeableHeightView)) {
                i11 += childAt.getMeasuredHeight();
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: SN */
    public void m82945SN(int i11) {
        this.f76193V1.sendEmptyMessageDelayed(10000, i11);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Sr */
    public void mo82946Sr(boolean z11) {
        this.f76169C1.setState(0);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: T */
    public void mo82947T() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.w60
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82904qN();
            }
        });
    }

    /* renamed from: TM */
    int m82948TM() {
        return AbstractC23136l9.m118736p(AbstractC16802y.profile_circle_avatar_size);
    }

    /* renamed from: TN */
    protected void m82949TN() {
        this.f76193V1.sendEmptyMessageDelayed(10001, 100L);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Te */
    public void mo82950Te(boolean z11) {
        int i11;
        View view = this.f76167A1;
        if (view != null) {
            if (z11 && mo82198WM().mo107636C6() && mo82198WM().mo107643H6()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Ts */
    public void mo82951Ts(final C3020p0 c3020p0) {
        KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(this.f72421L0.m92648SI(), new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.l70
            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i11, String str) {
                ProfileBaseView.this.m82886EN(c3020p0, i11, str);
            }
        }, this.f72421L0.m92652XI(AbstractC8020f0.str_feed_report_dialog_msg), this.f72421L0.m92652XI(AbstractC8020f0.str_yes), this.f72421L0.m92652XI(AbstractC8020f0.str_no));
        this.f76179M1 = m118464q;
        if (m118464q != null) {
            m82955UN();
            this.f76179M1.mo13822K();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Tt */
    public void mo11936Tt(C16719g c16719g, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        C17487o0 c17487o02 = c17487o0;
        if (c17487o02 != null) {
            FeedActionZUtils.m47525M(c16719g, c3000l0, i11, c17487o02, bundle, 68, 13, z11, mo82938QM());
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Ty */
    public void mo82952Ty(boolean z11) {
        int i11;
        SlideShowSound slideShowSound = this.f76169C1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        slideShowSound.setVisibility(i11);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: U6 */
    public void mo82953U6(List list, ArrayList arrayList, int i11) {
        this.f76215r1.m43298h0(list, arrayList);
        this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.u60
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82916wN();
            }
        }, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        C13306b c13306b;
        super.mo37584UJ();
        if (mo82205aN() != null && (c13306b = this.f76185R1) != null) {
            c13306b.m74697c(this.f76187S1);
        }
    }

    /* renamed from: UM */
    int m82954UM() {
        return (int) (this.f76195X0 + (m82948TM() * 0.33333334f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: UN */
    public void m82955UN() {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f76179M1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.y60
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    ProfileBaseView.this.m82920yN(interfaceC17463d);
                }
            });
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: VB */
    public void mo82956VB(final C3000l0 c3000l0) {
        final C3020p0 c3020p0;
        final boolean z11;
        int i11;
        String str;
        AbstractC23647d.m123906p("6511");
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        CharSequence m108759G = AbstractC20826v0.m108759G(c3020p0);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.delete);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
        if (c3020p0 != null && c3020p0.m14494Y() && c3020p0.m14485P() && c3020p0.f12058q != 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = "";
        if (z11) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_delete);
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_delete_edit);
            i11 = 9;
        } else {
            i11 = 7;
            str = "";
        }
        if (c3020p0 != null && c3020p0.f12058q == 23) {
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_item_option_item_delete_title);
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + "?";
            }
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(i11).m43172u(str2).m43162k(m108759G).m43168q(str, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.d70
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ProfileBaseView.this.m82922zN(z11, c3020p0, c3000l0, interfaceC17463d, i12);
            }
        }).m43170s(m118743r0, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.e70
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ProfileBaseView.this.m82878AN(c3000l0, interfaceC17463d, i12);
            }
        }).m43165n(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.f70
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                interfaceC17463d.dismiss();
            }
        });
        this.f76179M1 = aVar.m43152a();
        m82955UN();
        this.f76179M1.mo13822K();
        AbstractC23647d.m123893c();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    /* renamed from: VM */
    int m82957VM() {
        return (int) (m82948TM() * 0.33333334f);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Vn */
    public void mo82958Vn(String str) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(str);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Vr */
    public void mo82959Vr(String str, int i11, String str2, C32002l4 c32002l4, int i12) {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(c32002l4);
        c31877d.f146422h = i12;
        AbstractC28207v1.m141994i3(str, i11, this.f72421L0.m92676n2(), this.f72421L0, str2, c31877d);
    }

    /* renamed from: WM */
    abstract InterfaceC20650a mo82198WM();

    /* renamed from: WN */
    void m82960WN() {
        ViewGroup.LayoutParams layoutParams = this.f76198a1.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = m82957VM();
        this.f76198a1.setLayoutParams(layoutParams);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Wg */
    public void mo82961Wg(int i11, boolean z11, C24903f c24903f) {
        if (c24903f != null) {
            C32065p8.m154684c().m154697l(c24903f.m129500c(), i11, z11);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Wl */
    public void mo82962Wl(String str) {
        if (this.f76168B1 != null && !TextUtils.isEmpty(str)) {
            this.f76168B1.setImageResource(AbstractC16803z.bg_item_feed_o);
            ((C23528a) this.f76184R0.m123612r(this.f76168B1)).m123618x(str, C23278z2.m120123e0());
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: X1 */
    public void mo82963X1() {
        mo78936E(C19140e.m100450e(m92689tK()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        C13306b c13306b;
        super.mo37122XJ(z11, z12);
        if (z11) {
            if ((!z12 || this.f72421L0.m92683qJ()) && (c13306b = this.f76185R1) != null) {
                c13306b.m74699e("tip.any");
            }
        }
    }

    /* renamed from: XN */
    public void m82964XN(boolean z11) {
        this.f76175I1 = z11;
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Xu */
    public void mo82965Xu(String str, String str2) {
        if (this.f76181O1 == null) {
            this.f76181O1 = new RecyclingImageView(getContext());
        }
        C24003n m120147p = C23278z2.m120147p();
        if (this.f76199b1.getTag() == null) {
            Avatar avatar = this.f76199b1;
            avatar.setImageDrawable(C23212s8.m119609q(avatar.getContext(), AbstractC16781w.default_avatar));
        }
        if (!TextUtils.isEmpty(str2) && C23999j.m125696L2(str2, m120147p)) {
            this.f76199b1.setTag(str2);
            ((C23528a) this.f76184R0.m123612r(this.f76181O1)).m123579C(str2, m120147p, this.f76182P1);
        } else {
            this.f76199b1.setTag(str);
            ((C23528a) this.f76184R0.m123612r(this.f76181O1)).m123579C(str, C23278z2.m120143n(), new C14788c(str2, m120147p));
        }
        Avatar avatar2 = this.f76208k1;
        if (avatar2 != null) {
            avatar2.m90479n(str);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Y4 */
    public void mo82966Y4(String str) {
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74689E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: YM */
    public C3427f m82967YM() {
        if (this.f76213p1 != null) {
            for (int i11 = 0; i11 < this.f76213p1.getChildCount(); i11++) {
                RecyclerView.AbstractC1876c0 m9900t0 = this.f76213p1.m9900t0(i11);
                if (m9900t0 instanceof FeedBaseAdapter.C8043t) {
                    return ((FeedBaseAdapter.C8043t) m9900t0).f43941M;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: YN */
    public void m82968YN(boolean z11) {
        this.f76174H1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
        FeedActionZUtils.m47533U(animationTarget, this.f76184R0, str, bundle, c20275e, 10000, this, c3020p0, m92676n2(), trackingSource, z11, 13, mo82938QM());
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Yy */
    public void mo82969Yy(boolean z11) {
        int i11;
        Avatar avatar = this.f76208k1;
        if (avatar != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            avatar.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ZN */
    public void m82970ZN(View view) {
        this.f76219v1 = view;
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: a0 */
    public void mo82971a0() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.g70
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82902pN();
            }
        });
    }

    /* renamed from: aN */
    protected String[] mo82205aN() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: aO */
    public void m82972aO() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle("");
            this.f88760a0.getTitleTextView().setTypeface(C13718q1.m76694c(getContext(), 7));
            this.f88760a0.getTitleTextView().setId(8000000);
            ActionBar actionBar2 = this.f88760a0;
            actionBar2.setTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC21196a.TextColor1));
            this.f88760a0.getTitleTextView().setBackground(AbstractC23136l9.m118665N(this.f88760a0.getContext(), AbstractC16803z.profile_ripple_effect_text_header));
        }
    }

    /* renamed from: ad */
    public void mo82206ad(C3020p0 c3020p0, C3000l0 c3000l0, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bN */
    public C26209i mo82210bN(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bO */
    public void mo82973bO() {
        this.f76216s1 = m82933NM(AbstractC6918a0.profile_feed_sticky_header_group);
        View m82933NM = m82933NM(AbstractC6918a0.fake_action_bar_above_sticky_functions);
        this.f76217t1 = m82933NM;
        m82933NM.getLayoutParams().height = this.f76194W0;
    }

    /* renamed from: cN */
    protected abstract Map mo82211cN();

    /* renamed from: cO */
    public void m82974cO() {
        if (this.f76177K1 == null) {
            C14794i c14794i = new C14794i(this.f76213p1, (StateListDrawable) AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), (StateListDrawable) AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent));
            this.f76177K1 = c14794i;
            c14794i.m114859H(AbstractC23136l9.m118742r(300.0f), AbstractC23136l9.m118742r(60.0f));
            this.f76177K1.m65929g0((RobotoTextView) m82933NM(AbstractC6918a0.bubble_date));
            this.f76177K1.m114844Y(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dN */
    public void m82975dN(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        C3000l0 c3000l0;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45565a() != null && bottomSheetMenuResult.m45569e() == 4 && bottomSheetMenuResult.m45571g() != 0) {
                    C20637a m45565a = bottomSheetMenuResult.m45565a();
                    if (m45565a != null) {
                        c3000l0 = m45565a.m107540b();
                    } else {
                        c3000l0 = null;
                    }
                    if (c3000l0 == null) {
                        return;
                    }
                    mo82198WM().mo107660wl(bottomSheetMenuResult.m45571g(), c3000l0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: dO */
    abstract void mo82214dO(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h);

    @Override // iq.InterfaceC20656b
    /* renamed from: dj */
    public void mo82976dj(final String str, final int i11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t60
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileBaseView.this.m82892HN(str, i11);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: eO */
    public void m82977eO(boolean z11) {
        C7033c9.a m17208q;
        try {
            C3427f m82967YM = m82967YM();
            if (m82967YM != null && (m17208q = m82967YM.m17208q()) != null) {
                if (z11) {
                    m17208q.m35947i0();
                } else {
                    m17208q.m35948j0();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: fN */
    public void m82978fN() {
        this.f76197Z0 = (RecyclingImageView) m82933NM(AbstractC6918a0.cover_image);
        this.f76195X0 = (int) (AbstractC23136l9.m118713h0() * 0.5f);
        ViewGroup.LayoutParams layoutParams = this.f76197Z0.getLayoutParams();
        layoutParams.height = this.f76195X0;
        RecyclingImageView recyclingImageView = this.f76197Z0;
        if (recyclingImageView != null) {
            recyclingImageView.setLayoutParams(layoutParams);
        }
        View m82933NM = m82933NM(AbstractC6918a0.top_profile_cover_gradient);
        ViewGroup.LayoutParams layoutParams2 = m82933NM.getLayoutParams();
        layoutParams2.height = this.f76194W0;
        m82933NM.setLayoutParams(layoutParams2);
        m82933NM.setVisibility(0);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: fp */
    public void mo82979fp(String str) {
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
            ((C23528a) this.f76184R0.m123612r(this.f76197Z0)).m123618x(str, C23278z2.m120070G(getContext(), AbstractC23006a0.m117928x()));
            return;
        }
        RecyclingImageView recyclingImageView = this.f76197Z0;
        if (recyclingImageView != null) {
            recyclingImageView.setImageDrawable(AbstractC23170p.m119358p(getContext()));
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: ga */
    public void mo82980ga(boolean z11) {
        int i11;
        View view = this.f76170D1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: gn */
    public void mo11955gn(C3020p0 c3020p0) {
        C17487o0 mo35579p;
        String str;
        Bundle bundle = new Bundle();
        if (c3020p0 != null) {
            bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
            bundle.putInt("EXTRA_MODE", 0);
            bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            if (mo82938QM() != null) {
                str = mo82938QM().m154277l();
            } else {
                str = "";
            }
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", str);
            bundle.putString("EXTRA_FEED_OWNER_ID", c3020p0.m14465A());
        }
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: h6 */
    public void mo82981h6(int i11, String str) {
        this.f76199b1.setImageDrawable(C16640q2.m88404a().mo88412f(str, i11));
        if (this.f76208k1 != null) {
            this.f76208k1.setImageDrawable(C16640q2.m88404a().mo88412f(str, i11));
        }
    }

    /* renamed from: hN */
    public void m82982hN() {
        try {
            if (mo82198WM().mo107643H6()) {
                ProfileMusicView profileMusicView = (ProfileMusicView) m82933NM(AbstractC6918a0.profile_music_view);
                this.f76223z1 = profileMusicView;
                if (profileMusicView != null) {
                    ViewGroup.LayoutParams layoutParams = profileMusicView.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        int m118742r = AbstractC23136l9.m118742r(16.0f);
                        ((RelativeLayout.LayoutParams) layoutParams).setMargins(m118742r, this.f76194W0, m118742r, 0);
                        this.f76223z1.setLayoutParams(layoutParams);
                    }
                    this.f76223z1.setCallback(new C14790e());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: iM */
    public int mo46047iM() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: iN */
    public void m82983iN() {
        this.f76192V0 = m82933NM(AbstractC6918a0.root_backgroundmain);
    }

    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_INT_REQUEST_CODE", 10014);
        C20043e.m104033y(this.f72421L0.m92676n2(), c3000l0.m14324b0(i11), c17391z, i12, view, view2, bundle, mo82938QM());
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: ik */
    public void mo82984ik(C3020p0 c3020p0) {
        mo79525nM(TagsListView.m84986jM(c3020p0.f12057p, c3020p0.f12058q, c3020p0.f12022B.f12280b, c3020p0.f12059r.f11956a, false).getExtras());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: jN */
    public void m82985jN(String str) {
        Avatar avatar = (Avatar) m82933NM(AbstractC6918a0.imvAvatar);
        this.f76199b1 = avatar;
        avatar.m90481x(m92689tK(), EnumC16949e.SIZE_128);
        this.f76200c1 = (FrameRoundedLayout) m82933NM(AbstractC6918a0.rounded_warning);
        TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) m82933NM(AbstractC6918a0.layoutAvatar);
        this.f76203f1 = trackingRelativeLayout;
        trackingRelativeLayout.setIdTracking("social_profile_avatar");
        this.f76203f1.setTrackingExtraData(m82932MM(str));
        this.f76203f1.setOnClickListener(this);
        this.f76198a1 = m82933NM(AbstractC6918a0.info_background);
        this.f76202e1 = (RelativeLayout) m82933NM(AbstractC6918a0.rl_profile_bio_container);
        View m82933NM = m82933NM(AbstractC6918a0.pbUploadAvatar);
        this.f76204g1 = m82933NM;
        m82933NM.setVisibility(8);
        ImageButton imageButton = (ImageButton) m82933NM(AbstractC6918a0.btnRetryUploadAvatar);
        this.f76205h1 = imageButton;
        imageButton.setVisibility(8);
        this.f76205h1.setOnClickListener(this);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: jh */
    public void mo82986jh(String str) {
        if (!TextUtils.isEmpty(str) && m92648SI() != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            bundle.putInt("EXTRA_SOURCE_LINK", 13);
            String m40689a = new TrackingSource.C7894b().m40694f(13).m40689a();
            if (!TextUtils.isEmpty(m40689a)) {
                bundle.putString("EXTRA_SOURCE_PARAM", m40689a);
            }
            ZaloWebView.m87105iS(m92676n2(), str, bundle);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: k */
    public ZaloView mo82987k() {
        return this;
    }

    /* renamed from: kN */
    protected boolean m82988kN() {
        return (this.f76199b1 == null || this.f76198a1 == null) ? false : true;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: kf */
    public void mo11960kf(View view, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        C17487o0 c17487o02 = c17487o0;
        if (c17487o02 != null) {
            FeedActionZUtils.m47524L(view, c3000l0, i11, c17487o02, bundle, 68, 13, z11, mo82938QM());
        }
    }

    /* renamed from: lN */
    boolean m82989lN() {
        if (this.f76213p1 == null) {
            return false;
        }
        for (int i11 = 0; i11 < this.f76213p1.getChildCount(); i11++) {
            if (this.f76213p1.getChildAt(i11) instanceof ChangeableHeightView) {
                return true;
            }
        }
        return false;
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: lp */
    public void mo82990lp(final C3020p0 c3020p0, final C32002l4 c32002l4, int i11, int i12, int i13) {
        mo82214dO(i11, i12, i13, C31060j.f143193a.m150944q(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.x60
            @Override // as.InterfaceC2333h
            /* renamed from: b */
            public final void mo12288b(int i14) {
                ProfileBaseView.this.m82882CN(c3020p0, c32002l4, i14);
            }
        });
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: m7 */
    public void mo82991m7(String str, int i11) {
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74711w(str, i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
        try {
            this.f72421L0.m92676n2().mo35551H2(animationTarget, str, bundle, c20275e, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mN */
    protected boolean m82992mN() {
        return this.f76203f1 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000d, B:8:0x0015, B:12:0x002e, B:14:0x0032, B:16:0x0043, B:18:0x004d, B:20:0x0053, B:23:0x002a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // iq.InterfaceC20656b
    /* renamed from: mm */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo82993mm(int i11) {
        int i12;
        try {
            if (this.f76213p1 != null && this.f76214q1.m9740Y1() == 0) {
                if (this.f76213p1.getChildAt(0) != null) {
                    int[] iArr = new int[2];
                    this.f76213p1.getChildAt(0).getLocationInWindow(iArr);
                    i12 = this.f76196Y0 - iArr[1];
                }
                if (this.f76213p1 == null) {
                    int i13 = this.f76195X0;
                    int m118713h0 = i13 - ((int) (AbstractC23136l9.m118713h0() * 0.33f));
                    if (m118713h0 < 0) {
                        m118713h0 = i13 - AbstractC23136l9.m118655I(AbstractC16802y.cover_init_height);
                    }
                    if (i11 > 0) {
                        this.f76213p1.m9845O1(0, m118713h0);
                        return;
                    } else {
                        this.f76213p1.scrollBy(0, m118713h0);
                        return;
                    }
                }
                return;
            }
            i12 = this.f76195X0;
            if (i12 != 0) {
                return;
            }
            if (this.f76213p1 == null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nN */
    public boolean m82994nN() {
        return this.f76175I1;
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: nm */
    public void mo82995nm(final int i11) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h70
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82890GN(i11);
            }
        });
    }

    /* renamed from: oN */
    public boolean m82996oN() {
        return this.f76174H1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 2000) {
            if (i11 == 11116 && i12 == -1) {
                C3427f m82967YM = m82967YM();
                if (m82967YM != null) {
                    m82967YM.m17210t();
                }
                AbstractC23647d.m123897g("6515");
            }
        } else {
            C3427f m82967YM2 = m82967YM();
            if (m82967YM2 != null) {
                m82967YM2.m17210t();
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    public void onClick(View view) {
        if (view.getId() == 8000000) {
            m82941RN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC20814p0.m108674v(getContext());
        RecyclerView recyclerView = this.f76213p1;
        if (recyclerView != null && this.f76215r1 != null) {
            recyclerView.removeAllViews();
            this.f76213p1.removeAllViewsInLayout();
            this.f76213p1.getRecycledViewPool().m10179b();
            this.f76215r1.m10008p();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 115) {
            int length = iArr.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    if (iArr[i12] != 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    m82939QN(new TrackingSource(1));
                    break;
                }
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f76185R1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        m82930KM();
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: pA */
    public void mo82997pA() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j70
            @Override // java.lang.Runnable
            public final void run() {
                ProfileBaseView.this.m82884DN();
            }
        });
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: pf */
    public void mo82998pf(boolean z11) {
        C32065p8.m154684c().m154701r(z11);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: pk */
    public void mo82999pk(C3020p0 c3020p0, C32547c c32547c) {
        C8050a c8050a = this.f76215r1;
        if (c8050a != null && c3020p0 != null) {
            c8050a.m43296O0(c3020p0.f12057p, c32547c);
        }
    }

    /* renamed from: qh */
    public void mo83000qh() {
        try {
            this.f76167A1 = m82933NM(AbstractC6918a0.user_details_functions_sticky_music);
            this.f76168B1 = (RecyclingImageView) m82933NM(AbstractC6918a0.img_sticky_music_icon);
            this.f76169C1 = (SlideShowSound) m82933NM(AbstractC6918a0.gif_sound_sticky_music);
            this.f76170D1 = m82933NM(AbstractC6918a0.thumb_play_sticky_music);
            this.f76171E1 = (RobotoTextView) m82933NM(AbstractC6918a0.tv_song_title_sticky_music);
            this.f76172F1 = m82933NM(AbstractC6918a0.btn_close_sticky_music);
            this.f76169C1.setAnimX(0);
            this.f76169C1.setAnimWidth(AbstractC23136l9.m118742r(2.0f));
            this.f76169C1.m75887a(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f));
            this.f76169C1.setShadowPaintColor(637534208);
            AbstractC23136l9.m118729m1(this.f76168B1, AbstractC23136l9.m118742r(4.0f));
            View view = this.f76167A1;
            view.setBackgroundColor(AbstractC23265y.m120019f(C23212s8.m119607o(view.getContext(), AbstractC16781w.PrimaryBackgroundColor), 0.8f));
            this.f76167A1.setOnClickListener(this);
            mo82950Te(false);
            this.f76172F1.setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: r4 */
    public void mo83001r4() {
        C8050a c8050a;
        try {
            RecyclerView recyclerView = this.f76213p1;
            if (recyclerView != null && recyclerView.getHeight() != 0 && (c8050a = this.f76215r1) != null && c8050a.mo10003k() != 0) {
                this.f76213p1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.z60
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileBaseView.this.m82918xN();
                    }
                }, 200L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: uI */
    public void mo83002uI(String str, int i11, String str2, C32002l4 c32002l4) {
        mo82959Vr(str, i11, str2, c32002l4, 0);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: v3 */
    public void mo11972v3(C3020p0 c3020p0, C32002l4 c32002l4, int i11, int i12, int i13) {
        mo82198WM().mo107659v3(c3020p0, c32002l4, i11, i12, i13);
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: x6 */
    public void mo83003x6(final C3000l0 c3000l0) {
        this.f76179M1 = AbstractC23093i.m118469v(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.i70
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProfileBaseView.this.m82910tN(c3000l0, interfaceC17463d, i11);
            }
        }, AbstractC8020f0.str_feed_untag_confirm_msg);
        m82955UN();
        this.f76179M1.mo13822K();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.social.controls.InterfaceC10861a
    /* renamed from: yf */
    public void mo43566yf(C28100j3 c28100j3) {
        if (c28100j3 == null) {
            return;
        }
        try {
            if (c28100j3.f131060a == 1) {
                String str = c28100j3.f131061b;
                String str2 = c28100j3.f131062c;
                if (!TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("fid", str);
                    bundle.putString("ownerId", str2);
                    C32002l4 mo82938QM = mo82938QM();
                    if (mo82938QM != null) {
                        bundle.putString("extra_entry_point_flow", mo82938QM.m154277l());
                    }
                    C17487o0 mo35579p = this.f72421L0.m92676n2().mo35579p();
                    if (mo35579p != null) {
                        mo35579p.m93066i2(FeedDetailsView.class, bundle, 68, 1, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
