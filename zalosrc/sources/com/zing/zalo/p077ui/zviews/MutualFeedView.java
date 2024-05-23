package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2261c;
import as.InterfaceC2333h;
import au.C2343e;
import bn.C2913t1;
import bo.C2955c0;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3010n0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3054x;
import bo.C3062z;
import bo.InterfaceC2946a1;
import bp0.AbstractC3102n;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7231u8;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8438y1;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.MutualFeedView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.uicontrol.FeedAsyncFailedPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18494a;
import hf0.C20040b;
import hf0.C20043e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractAnimationAnimationListenerC20277g;
import i40.C20275e;
import io.C20637a;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22012a;
import l30.C22013a0;
import l30.C22033k0;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23199r6;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3535c;
import p111du.AbstractC18069a;
import p167fs.C19140e;
import p175g0.AbstractC19181d;
import p262jb.AbstractC21196a;
import p303kq.C21909a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.C24003n;
import p398oo.C24346a;
import p398oo.C24355e0;
import p425po.C24880b;
import p455qo.C25405e;
import p494rv.C25979a;
import p527tq.C26876b;
import p542ub.InterfaceC27218a;
import p554up.AbstractC27354b;
import p554up.C27353a;
import p645xh.C29628e;
import p645xh.C29630g;
import p691yr.AbstractC31052b;
import p691yr.C31060j;
import p691yr.EnumC31051a;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32123ta;
import pm0.C24848g0;
import sn.C26333b;
import tn.C26747f0;
import tn.C26761p;
import tn.C26767v;
import tr.C26878b;
import vg.C28203u6;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MutualFeedView extends FeedCallbackZaloView implements ZaloView.InterfaceC17426k, C23744a.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: B1 */
    float f75361B1;

    /* renamed from: D1 */
    C27353a f75363D1;

    /* renamed from: E1 */
    private boolean f75364E1;

    /* renamed from: F1 */
    private EmptyContentView f75365F1;

    /* renamed from: G1 */
    FeedAsyncFailedPopupView f75366G1;

    /* renamed from: H1 */
    boolean f75367H1;

    /* renamed from: K1 */
    boolean f75370K1;

    /* renamed from: L1 */
    Animation f75371L1;

    /* renamed from: M1 */
    Animation f75372M1;

    /* renamed from: N1 */
    Animation f75373N1;

    /* renamed from: Q1 */
    protected C2966e1 f75376Q1;

    /* renamed from: R0 */
    protected C23528a f75377R0;

    /* renamed from: R1 */
    protected C2966e1 f75378R1;

    /* renamed from: S1 */
    KeyEventCallbackC17462c f75380S1;

    /* renamed from: T0 */
    View f75381T0;

    /* renamed from: U0 */
    MultiStateView f75383U0;

    /* renamed from: V0 */
    SwipeRefreshListView f75384V0;

    /* renamed from: W0 */
    RecyclerView.AbstractC1892s f75385W0;

    /* renamed from: X0 */
    protected RecyclerView f75386X0;

    /* renamed from: Y0 */
    LinearLayoutManager f75387Y0;

    /* renamed from: Z0 */
    protected C8050a f75388Z0;

    /* renamed from: a1 */
    CircleImage f75389a1;

    /* renamed from: b1 */
    CircleImage f75390b1;

    /* renamed from: c1 */
    TextView f75391c1;

    /* renamed from: d1 */
    String f75392d1;

    /* renamed from: e1 */
    String f75393e1;

    /* renamed from: f1 */
    String f75394f1;

    /* renamed from: g1 */
    RecyclingImageView f75395g1;

    /* renamed from: h1 */
    C24003n f75396h1;

    /* renamed from: j1 */
    float f75398j1;

    /* renamed from: m1 */
    View f75401m1;

    /* renamed from: n1 */
    View f75402n1;

    /* renamed from: o1 */
    View f75403o1;

    /* renamed from: q1 */
    TextView f75405q1;

    /* renamed from: r1 */
    View f75406r1;

    /* renamed from: v1 */
    ContactProfile f75410v1;

    /* renamed from: y1 */
    boolean f75413y1;

    /* renamed from: z1 */
    int f75414z1;

    /* renamed from: S0 */
    protected Handler f75379S0 = new Handler(Looper.getMainLooper());

    /* renamed from: i1 */
    int f75397i1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.cover_height);

    /* renamed from: k1 */
    int f75399k1 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material);

    /* renamed from: l1 */
    int f75400l1 = AbstractC23136l9.m118737p0();

    /* renamed from: p1 */
    boolean f75404p1 = false;

    /* renamed from: s1 */
    String f75407s1 = "";

    /* renamed from: t1 */
    String f75408t1 = "";

    /* renamed from: u1 */
    String f75409u1 = "";

    /* renamed from: w1 */
    List f75411w1 = Collections.synchronizedList(new ArrayList());

    /* renamed from: x1 */
    int f75412x1 = 1;

    /* renamed from: A1 */
    String f75360A1 = "";

    /* renamed from: C1 */
    protected List f75362C1 = new ArrayList();

    /* renamed from: I1 */
    InterfaceC20094a f75368I1 = new C14660j();

    /* renamed from: J1 */
    C24880b f75369J1 = null;

    /* renamed from: O1 */
    final Animation.AnimationListener f75374O1 = new C14652b();

    /* renamed from: P1 */
    final Animation.AnimationListener f75375P1 = new C14653c();

    /* renamed from: T1 */
    protected AbstractC22055v0.l f75382T1 = new C14654d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$a */
    /* loaded from: classes6.dex */
    public class C14651a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f75415a;

        C14651a(String str) {
            this.f75415a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42128G4(CoreUtility.f89233i, this.f75415a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$b */
    /* loaded from: classes6.dex */
    class C14652b extends AbstractAnimationAnimationListenerC20277g {
        C14652b() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MutualFeedView.this.f75371L1 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$c */
    /* loaded from: classes6.dex */
    class C14653c extends AbstractAnimationAnimationListenerC20277g {
        C14653c() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MutualFeedView.this.f75406r1.setVisibility(8);
            MutualFeedView.this.f75371L1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$d */
    /* loaded from: classes6.dex */
    public class C14654d extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$d$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f75420a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f75421b;

            /* renamed from: c */
            final /* synthetic */ int f75422c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f75420a = nVar;
                this.f75421b = c31980jc;
                this.f75422c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    AbstractC22055v0.n nVar = this.f75420a;
                    if (nVar != null) {
                        nVar.mo17230p(this.f75421b, MutualFeedView.this.f75377R0);
                    }
                    C8050a c8050a = MutualFeedView.this.f75388Z0;
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
                if (MutualFeedView.this.f72421L0.m92672lJ() && MutualFeedView.this.f72421L0.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (MutualFeedView.this.f72421L0.m92672lJ() && MutualFeedView.this.f72421L0.m92687sJ() && hVar != null) {
                    bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    bundle.putInt("srcType", this.f75422c);
                    AbstractC22055v0.m115127Q(hVar, this.f75420a, MutualFeedView.this.f72421L0.m92676n2(), bundle, 0);
                }
            }
        }

        C14654d() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: a */
        public void mo48298a(AbstractC22055v0.j jVar) {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: b */
        public void mo82050b(C32123ta c32123ta, C22033k0.h hVar, AbstractC22055v0.i iVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$e */
    /* loaded from: classes6.dex */
    public class C14655e implements InterfaceC20094a {
        C14655e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                MutualFeedView.this.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
                MutualFeedView.this.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$f */
    /* loaded from: classes6.dex */
    class C14656f implements FeedBaseAdapter.InterfaceC8021a {
        C14656f() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
            if (C23055e5.m118272g(true)) {
                MutualFeedView.this.m82026dN(false);
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
            MutualFeedView.this.f75384V0.setSwipeRefreshEnable(!z11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
            AbstractC27354b.m140049a(MutualFeedView.this.f75363D1, c3000l0);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$g */
    /* loaded from: classes6.dex */
    class C14657g implements InterfaceC8438y1 {
        C14657g() {
        }

        @Override // com.zing.zalo.feed.components.InterfaceC8438y1
        /* renamed from: a */
        public AbstractC1785o mo44963a() {
            return MutualFeedView.this.getLifecycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$h */
    /* loaded from: classes6.dex */
    public class C14658h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f75427a;

        C14658h(C3000l0 c3000l0) {
            this.f75427a = c3000l0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42438je(CoreUtility.f89233i, this.f75427a.f11895q, AbstractC20826v0.m108827p(this.f75427a).toString());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$i */
    /* loaded from: classes6.dex */
    class C14659i implements FeedAsyncFailedPopupView.InterfaceC16459a {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f75429a;

        C14659i(C3000l0 c3000l0) {
            this.f75429a = c3000l0;
        }

        @Override // com.zing.zalo.uicontrol.FeedAsyncFailedPopupView.InterfaceC16459a
        /* renamed from: a */
        public void mo82051a(String str) {
            MutualFeedView.this.m82008uN();
            if (!TextUtils.isEmpty(str)) {
                MutualFeedView.this.mo11940X(this.f75429a);
            }
        }

        @Override // com.zing.zalo.uicontrol.FeedAsyncFailedPopupView.InterfaceC16459a
        /* renamed from: b */
        public void mo82052b(String str) {
            MutualFeedView.this.m82008uN();
            if (!TextUtils.isEmpty(str)) {
                C26761p.m137741q().m137757K(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$j */
    /* loaded from: classes6.dex */
    public class C14660j implements InterfaceC20094a {
        C14660j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:8:0x0022, B:10:0x0029, B:12:0x0031, B:14:0x003e, B:18:0x0059, B:20:0x005f, B:22:0x0065, B:23:0x007c, B:26:0x0071, B:28:0x0053), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m82054d() {
            List list;
            int i11;
            MutualFeedView mutualFeedView;
            MutualFeedView.this.f75365F1.setVisibility(8);
            MutualFeedView.this.m82029gN(true);
            MutualFeedView mutualFeedView2 = MutualFeedView.this;
            if (mutualFeedView2.f75412x1 - 1 == 1 && (list = mutualFeedView2.f75411w1) != null && !list.isEmpty()) {
                try {
                    MutualFeedView mutualFeedView3 = MutualFeedView.this;
                    if (mutualFeedView3.f75386X0 != null && mutualFeedView3.f75387Y0.m9740Y1() == 0) {
                        int[] iArr = new int[2];
                        if (MutualFeedView.this.f75386X0.getChildAt(0) != null) {
                            MutualFeedView.this.f75386X0.getChildAt(0).getLocationInWindow(iArr);
                            i11 = MutualFeedView.this.f75400l1 - iArr[1];
                        }
                        mutualFeedView = MutualFeedView.this;
                        if (mutualFeedView.f75386X0 == null) {
                            if (mutualFeedView.f75364E1) {
                                MutualFeedView mutualFeedView4 = MutualFeedView.this;
                                mutualFeedView4.f75386X0.m9845O1(0, mutualFeedView4.m81997kN());
                            } else {
                                MutualFeedView mutualFeedView5 = MutualFeedView.this;
                                mutualFeedView5.f75386X0.scrollBy(0, mutualFeedView5.m81997kN());
                            }
                            MutualFeedView.this.f75364E1 = false;
                            return;
                        }
                        return;
                    }
                    i11 = MutualFeedView.this.f75397i1;
                    if (i11 != 0) {
                        return;
                    }
                    mutualFeedView = MutualFeedView.this;
                    if (mutualFeedView.f75386X0 == null) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MutualFeedView.this.m82001rN(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            MutualFeedView mutualFeedView;
            JSONArray jSONArray;
            List list;
            C24355e0.f117560a.m127364t(true);
            MutualFeedView mutualFeedView2 = MutualFeedView.this;
            if (mutualFeedView2.f75412x1 == 1) {
                List list2 = mutualFeedView2.f75411w1;
                if (list2 != null) {
                    list2.clear();
                }
                MutualFeedView mutualFeedView3 = MutualFeedView.this;
                mutualFeedView3.m82024bN(mutualFeedView3.f75411w1);
            }
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("banner_year");
                        if (optJSONObject != null) {
                            C2955c0.m13997e(optJSONObject);
                        }
                        MutualFeedView.this.f75413y1 = jSONObject2.optBoolean("lmore");
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("invitecfr");
                        if (optJSONObject2 != null) {
                            MutualFeedView.this.f75392d1 = optJSONObject2.optString("content");
                            MutualFeedView.this.f75393e1 = optJSONObject2.optString("title");
                            MutualFeedView.this.f75394f1 = optJSONObject2.optString("msg");
                        }
                        if (jSONObject2.isNull("list")) {
                            jSONArray = null;
                        } else {
                            jSONArray = jSONObject2.getJSONArray("list");
                        }
                        if (jSONArray != null && jSONArray.length() > 0) {
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                                String m96089h = AbstractC18069a.m96089h(jSONObject3, "title");
                                String m96089h2 = AbstractC18069a.m96089h(jSONObject3, "color");
                                String m96089h3 = AbstractC18069a.m96089h(jSONObject3, "color_line");
                                String m96089h4 = AbstractC18069a.m96089h(jSONObject3, "icon");
                                String m96089h5 = AbstractC18069a.m96089h(jSONObject3, "color_title");
                                JSONArray optJSONArray = jSONObject3.optJSONArray("feeds");
                                if (optJSONArray != null) {
                                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                        C3000l0 m108750B0 = AbstractC20826v0.m108750B0(optJSONArray.getJSONObject(i12));
                                        if (m108750B0 != null) {
                                            m108750B0.f11869R = m96089h;
                                            m108750B0.f11870S = m96089h2;
                                            m108750B0.f11871T = m96089h3;
                                            m108750B0.f11872U = m96089h4;
                                            m108750B0.f11873V = m96089h5;
                                            if (!m108750B0.m14322a0().f12063v && (list = MutualFeedView.this.f75411w1) != null) {
                                                list.add(m108750B0);
                                            }
                                        }
                                    }
                                }
                            }
                            MutualFeedView.this.f75412x1++;
                        } else {
                            MutualFeedView.this.f75413y1 = false;
                        }
                    } else {
                        MutualFeedView.this.f75413y1 = false;
                    }
                    mutualFeedView = MutualFeedView.this;
                    mutualFeedView.f75367H1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    mutualFeedView = MutualFeedView.this;
                    mutualFeedView.f75413y1 = false;
                }
                mutualFeedView.f75367H1 = false;
                MutualFeedView.this.m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.b00
                    @Override // java.lang.Runnable
                    public final void run() {
                        MutualFeedView.C14660j.this.m82054d();
                    }
                });
            } catch (Throwable th2) {
                MutualFeedView.this.f75367H1 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$k */
    /* loaded from: classes6.dex */
    public class C14661k implements InterfaceC20094a {
        C14661k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82056d() {
            try {
                MutualFeedView mutualFeedView = MutualFeedView.this;
                C23528a c23528a = (C23528a) mutualFeedView.f75377R0.m123612r(mutualFeedView.f75395g1);
                MutualFeedView mutualFeedView2 = MutualFeedView.this;
                c23528a.m123618x(mutualFeedView2.f75410v1.f42324B, mutualFeedView2.f75396h1);
                List list = MutualFeedView.this.f75411w1;
                if (list != null && !list.isEmpty() && MutualFeedView.this.f75383U0.getVisibility() == 8) {
                    if (C23302b.f113247a.m120523d(MutualFeedView.this.f75410v1.f42446v) && !CoreUtility.f89233i.equals(MutualFeedView.this.f75410v1.f42434r)) {
                        int m12307a = C2343e.m12307a(MutualFeedView.this.f75410v1.f42434r, false);
                        MutualFeedView.this.f75389a1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(MutualFeedView.this.f75410v1.m40383Q(true, false)), m12307a));
                    } else {
                        MutualFeedView mutualFeedView3 = MutualFeedView.this;
                        ((C23528a) mutualFeedView3.f75377R0.m123612r(mutualFeedView3.f75389a1)).m123618x(MutualFeedView.this.f75410v1.f42446v, C23278z2.m120143n());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MutualFeedView.this.f75370K1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            MutualFeedView mutualFeedView = MutualFeedView.this;
            mutualFeedView.f75370K1 = false;
            if (obj != null) {
                try {
                    mutualFeedView.f75410v1 = new ContactProfile((JSONObject) obj);
                    if (C7960e.m41971c6() != null && (contactProfile = MutualFeedView.this.f75410v1) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                        C7960e m41971c6 = C7960e.m41971c6();
                        ContactProfile contactProfile2 = MutualFeedView.this.f75410v1;
                        m41971c6.m42221O7(contactProfile2, AbstractC21935u.m114558y(contactProfile2.f42434r));
                    }
                    C3535c m2634q = AbstractC23306f.m120584H0().m2634q(MutualFeedView.this.f75410v1.f42434r);
                    if (m2634q != null) {
                        m2634q.m17971y0().m40998a().f42458z = MutualFeedView.this.f75410v1.f42458z;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            MutualFeedView.this.m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.c00
                @Override // java.lang.Runnable
                public final void run() {
                    MutualFeedView.C14661k.this.m82056d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$l */
    /* loaded from: classes6.dex */
    public class C14662l extends ClickableSpan {
        C14662l() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                textPaint.setColor(C23212s8.m119607o(MutualFeedView.this.getContext(), AbstractC21196a.TextColor1));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$m */
    /* loaded from: classes6.dex */
    public class C14663m extends ClickableSpan {
        C14663m() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                textPaint.setColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MutualFeedView$n */
    /* loaded from: classes6.dex */
    public class C14664n extends RecyclerView.AbstractC1892s {
        C14664n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                if (i11 == 0) {
                    MutualFeedView.this.f75388Z0.m43223b0(false);
                    MutualFeedView.this.f75388Z0.m10008p();
                    List list = MutualFeedView.this.f75411w1;
                    if (list != null && !list.isEmpty() && MutualFeedView.this.f75383U0.getVisibility() == 8) {
                        if (C23302b.f113247a.m120523d(MutualFeedView.this.f75410v1.f42446v) && !CoreUtility.f89233i.equals(MutualFeedView.this.f75410v1.f42434r)) {
                            int m12307a = C2343e.m12307a(MutualFeedView.this.f75410v1.f42434r, false);
                            MutualFeedView.this.f75389a1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(MutualFeedView.this.f75410v1.m40383Q(true, false)), m12307a));
                        } else {
                            MutualFeedView mutualFeedView = MutualFeedView.this;
                            ((C23528a) mutualFeedView.f75377R0.m123612r(mutualFeedView.f75389a1)).m123618x(MutualFeedView.this.f75410v1.f42446v, C23278z2.m120143n());
                        }
                    }
                } else {
                    MutualFeedView.this.f75388Z0.m43223b0(true);
                }
                if (i11 != 0) {
                    MutualFeedView.this.f75384V0.m88202K();
                }
                MutualFeedView.this.f75388Z0.m43285D0(recyclerView, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            int i13;
            C20040b.b bVar;
            try {
                int m9740Y1 = MutualFeedView.this.f75387Y0.m9740Y1();
                int m10110a = MutualFeedView.this.f75387Y0.m10110a();
                int m10127i = MutualFeedView.this.f75387Y0.m10127i();
                if (m10110a > 0) {
                    MutualFeedView.this.m82021XM();
                }
                MutualFeedView mutualFeedView = MutualFeedView.this;
                if (mutualFeedView.f75386X0 != null && mutualFeedView.f75387Y0.m9740Y1() == 0) {
                    int[] iArr = new int[2];
                    if (MutualFeedView.this.f75386X0.getChildAt(0) != null) {
                        MutualFeedView.this.f75386X0.getChildAt(0).getLocationInWindow(iArr);
                        i13 = MutualFeedView.this.f75400l1 - iArr[1];
                    } else {
                        i13 = 0;
                    }
                } else {
                    i13 = MutualFeedView.this.f75397i1;
                }
                MutualFeedView.this.m82031hO(i13);
                if (m9740Y1 + m10110a >= m10127i - 1) {
                    MutualFeedView mutualFeedView2 = MutualFeedView.this;
                    if (mutualFeedView2.f75413y1 && !mutualFeedView2.f75367H1 && mutualFeedView2.m82037nN() != 1) {
                        MutualFeedView.this.m82026dN(false);
                    }
                }
                C8050a c8050a = MutualFeedView.this.f75388Z0;
                if (i12 >= 0) {
                    bVar = C20040b.b.f98514q;
                } else {
                    bVar = C20040b.b.f98513p;
                }
                c8050a.m43284C0(recyclerView, m9740Y1, m10110a, bVar);
                if (i12 != 0) {
                    MutualFeedView.this.removeDialog(2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public /* synthetic */ void m81937AN(C3020p0 c3020p0, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            if (C23055e5.m118272g(true)) {
                d00.m87284d(this, c3020p0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public /* synthetic */ void m81943DN() {
        this.f75388Z0.m43298h0(m81993iN(), this.f75411w1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public /* synthetic */ void m81945EN(C20096c c20096c) {
        try {
            this.f75383U0.setErrorTitleString(c20096c.m104492d());
            this.f75383U0.setVisibility(0);
            this.f75365F1.setVisibility(8);
            m82029gN(false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public static /* synthetic */ boolean m81949GN() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HN */
    public /* synthetic */ void m81951HN(View view) {
        AbstractC23647d.m123906p("17013");
        m81988cO();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IN */
    public /* synthetic */ void m81953IN(View view) {
        m81985ZN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public /* synthetic */ void m81955JN() {
        SwipeRefreshListView swipeRefreshListView = this.f75384V0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public /* synthetic */ void m81957KN() {
        m82026dN(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public /* synthetic */ void m81959LN() {
        if (this.f75386X0 != null && this.f75387Y0.m9740Y1() != 0) {
            this.f75386X0.m9837K1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public /* synthetic */ C24848g0 m81961MN() {
        m81989dO();
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public /* synthetic */ void m81963NN() {
        m82026dN(true);
        m82027eN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public /* synthetic */ void m81965ON() {
        this.f75364E1 = true;
        this.f75412x1 = 1;
        m82026dN(false);
        m82027eN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QN */
    public /* synthetic */ void m81969QN() {
        boolean z11 = true;
        m82029gN(true);
        List list = this.f75411w1;
        if (list == null || list.size() > 3) {
            z11 = false;
        }
        m82045sO(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public /* synthetic */ void m81973SN(int i11, InterfaceC2946a1 interfaceC2946a1) {
        C8050a c8050a = this.f75388Z0;
        if (c8050a != null) {
            c8050a.m10010r(i11, interfaceC2946a1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public /* synthetic */ void m81975TN(C3020p0 c3020p0, C32002l4 c32002l4, int i11) {
        d00.m87285e(this, c3020p0, i11, c32002l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public /* synthetic */ void m81977UN(String str, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            m82023aO(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public /* synthetic */ void m81979VN() {
        C8050a c8050a = this.f75388Z0;
        if (c8050a != null) {
            c8050a.m43298h0(m81993iN(), this.f75411w1);
            this.f75388Z0.m10008p();
        }
    }

    /* renamed from: WM */
    private void m81980WM() {
        C23744a.m124114c().m124116d(5100, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WN */
    public /* synthetic */ void m81981WN(String str) {
        try {
            C8050a c8050a = this.f75388Z0;
            if (c8050a != null && this.f75387Y0 != null) {
                int m43303o0 = c8050a.m43303o0(str);
                int m43302m0 = this.f75388Z0.m43302m0(str);
                int m9745c2 = this.f75387Y0.m9745c2();
                if ((m43303o0 > -1 && m43303o0 > m9745c2) || (m43302m0 > -1 && m43302m0 > m9745c2)) {
                    this.f75387Y0.mo9756v1(m43302m0);
                } else if (m43303o0 > -1) {
                    this.f75387Y0.m9721B2(m43303o0, AbstractC23136l9.m118742r(100.0f));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: XN */
    private void m81982XN() {
        m81983YN();
    }

    /* renamed from: YN */
    private void m81983YN() {
        this.f75363D1.m139983W().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.fz
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                MutualFeedView.this.m82030gO((InterfaceC2946a1) obj);
            }
        });
    }

    /* renamed from: ZM */
    private void m81984ZM(List list) {
        m81986aN(list);
    }

    /* renamed from: ZN */
    private void m81985ZN() {
        if (C24355e0.f117560a.m127362p()) {
            m82006tO();
        } else {
            m81996jO();
        }
    }

    /* renamed from: aN */
    private void m81986aN(List list) {
        try {
            ArrayList m137786e = C26767v.m137782d().m137786e();
            if (m137786e != null && m137786e.size() > 0) {
                ArrayList<C3000l0> arrayList = new ArrayList();
                ArrayList<C3000l0> arrayList2 = new ArrayList();
                Iterator it = m137786e.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 != null) {
                        if (c3000l0.m14377z0()) {
                            arrayList2.add(c3000l0);
                        } else if (c3000l0.m14290E0()) {
                            arrayList.add(c3000l0);
                        }
                    }
                }
                for (C3000l0 c3000l02 : arrayList2) {
                    if (c3000l02 != null && c3000l02.m14322a0().m14488S()) {
                        AbstractC20826v0.m108819l(c3000l02, list);
                    }
                }
                for (C3000l0 c3000l03 : arrayList) {
                    if (c3000l03 != null && c3000l03.m14322a0().m14488S()) {
                        AbstractC20826v0.m108819l(c3000l03, list);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bO, reason: merged with bridge method [inline-methods] */
    public void m81967PN(C3054x c3054x) {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(m82033lN());
        mo11973vq(c3054x.m14669a(), c3054x.m14670b(), c31877d);
    }

    /* renamed from: cO */
    private void m81988cO() {
        if (C24355e0.f117560a.m127362p()) {
            m82006tO();
        } else {
            m81996jO();
        }
    }

    /* renamed from: dO */
    private void m81989dO() {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(m82033lN().m154284u(91));
        mo11973vq("action.open.kyc", "", c31877d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:            m82025cN(((bo.C3000l0) r2.f75411w1.get(r0)).f11895q);        r2.f75411w1.remove(r0);     */
    /* renamed from: eO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m81990eO(String str) {
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= this.f75411w1.size()) {
                    break;
                } else if (((C3000l0) this.f75411w1.get(i11)).f11895q.equals(str)) {
                    break;
                } else {
                    i11++;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.sz
            @Override // java.lang.Runnable
            public final void run() {
                MutualFeedView.this.m81969QN();
            }
        });
    }

    /* renamed from: fO */
    private void m81991fO() {
        if (!C24346a.f117452a.m127220c(this.f75369J1)) {
            this.f75413y1 = false;
            final C3054x m87286f = d00.m87286f(C24355e0.f117560a.m127357e(this.f75407s1));
            m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.jz
                @Override // java.lang.Runnable
                public final void run() {
                    MutualFeedView.this.m81971RN(m87286f);
                }
            });
        }
    }

    /* renamed from: hN */
    private List m81992hN() {
        ArrayList arrayList = new ArrayList();
        List list = this.f75411w1;
        if (list != null) {
            arrayList.addAll(list);
        }
        m81984ZM(arrayList);
        return arrayList;
    }

    /* renamed from: iN */
    private List m81993iN() {
        C22012a c22012a;
        ArrayList m114149b = C21909a.m114149b(m81992hN(), 2);
        if (m114149b.size() > 0 && (m114149b.get(0) instanceof C22012a) && (c22012a = (C22012a) m114149b.get(0)) != null) {
            c22012a.f108382M = true;
        }
        m114149b.add(0, new C2966e1((C3000l0) null, (C3020p0) null, 66));
        m114149b.add(new C2966e1((C3000l0) null, (C3020p0) null, 62));
        if (this.f75378R1 == null) {
            this.f75378R1 = new C2966e1(new C3062z(AbstractC23136l9.m118742r(50.0f)));
        }
        m114149b.add(this.f75378R1);
        if (this.f75376Q1 == null) {
            this.f75376Q1 = new C2966e1(new C3010n0(0));
        }
        m114149b.add(this.f75376Q1);
        this.f75362C1.clear();
        this.f75362C1.addAll(m114149b);
        return this.f75362C1;
    }

    /* renamed from: iO */
    private void m81994iO(C3000l0 c3000l0, C3020p0 c3020p0, boolean z11) {
        C32002l4 m154264g;
        C17487o0 c17487o0;
        if (c3020p0 != null) {
            try {
                if (c3020p0.m14494Y() && AbstractC23309i.m122305q2()) {
                    C26878b.m138449b().m138453e(c3000l0, c3020p0);
                    Bundle bundle = new Bundle();
                    bundle.putString("uid", this.f75410v1.f42434r);
                    bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
                    bundle.putString("EXTRA_FEED_CONTENT_JSON", AbstractC20826v0.m108827p(c3000l0).toString());
                    if (z11) {
                        m154264g = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_HAVE_SUBTITLE_STREAM);
                    } else {
                        m154264g = C32002l4.m154264g(10003);
                    }
                    bundle.putString("EXTRA_ENTRY_POINT_CHAIN", m154264g.m154277l());
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    } else {
                        c17487o0 = null;
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(EditFeedView.class, bundle, 1015, 1, true);
                    }
                    AbstractC23647d.m123897g("170141");
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: jN */
    private int m81995jN() {
        return AbstractC23136l9.m118742r(215.0f);
    }

    /* renamed from: jO */
    private void m81996jO() {
        try {
            if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().isFinishing()) {
                Bundle bundle = new Bundle();
                ContactProfile contactProfile = this.f75410v1;
                if (contactProfile != null) {
                    bundle.putString("uid", contactProfile.f42434r);
                    bundle.putString("avt", this.f75410v1.f42446v);
                    bundle.putString("dpn", this.f75410v1.f42437s);
                }
                C29630g.m147299E0().m147319V0();
                bundle.putString("extra_tracking_source", new TrackingSource(13).m40686z());
                this.f72421L0.m92662fJ().m93066i2(UpdateStatusView.class, bundle, IMediaPlayer.MEDIA_INFO_COMPLETED_AND_LOOP, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public int m81997kN() {
        return this.f75397i1 - m81995jN();
    }

    /* renamed from: pu */
    private void m81998pu(final String str) {
        this.f75379S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.qz
            @Override // java.lang.Runnable
            public final void run() {
                MutualFeedView.this.m81981WN(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public void m82001rN(final C20096c c20096c) {
        if (c20096c != null) {
            if (TextUtils.isEmpty(c20096c.m104490b())) {
                this.f75367H1 = false;
                m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.hz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MutualFeedView.this.m81945EN(c20096c);
                    }
                });
                return;
            }
            this.f75369J1 = new C24880b(c20096c.m104491c(), c20096c.m104490b());
            if (c20096c.m104491c() == 18028) {
                C24355e0.f117560a.m127364t(false);
                d00.m87282b(this);
                C23744a.m124114c().m124116d(6097, 10003);
            }
            final C3054x m87286f = d00.m87286f(this.f75369J1);
            m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.iz
                @Override // java.lang.Runnable
                public final void run() {
                    MutualFeedView.this.m81947FN(m87286f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m81971RN(C3054x c3054x) {
        List list = this.f75411w1;
        if (list != null) {
            list.clear();
        }
        m82029gN(false);
        this.f75383U0.setVisibility(8);
        this.f75365F1.setVisibility(0);
        this.f75365F1.m43610e(c3054x);
    }

    /* renamed from: sN */
    private void m82004sN(Bundle bundle) {
        LinearLayoutManager linearLayoutManager;
        if (bundle == null) {
            return;
        }
        C26876b m138439a = C26876b.m138439a(bundle);
        m82048wO();
        m82011vO(m138439a);
        m82029gN(true);
        FeedActionZUtils.m47541b(this, AbstractC23304d.f113304M2);
        if (m92672lJ() && m92687sJ()) {
            int i11 = bundle.getInt(AbstractC20826v0.f102360j, -1);
            String string = bundle.getString(AbstractC20826v0.f102361k, "");
            String string2 = bundle.getString(AbstractC20826v0.f102363m, "");
            if (i11 == 3) {
                ToastUtils.showMess(true, AbstractC20826v0.m108749B(string2), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
                long j11 = bundle.getLong(AbstractC20826v0.f102362l, 0L);
                if (!TextUtils.isEmpty(string)) {
                    int m43303o0 = this.f75388Z0.m43303o0(string);
                    boolean m108834s0 = AbstractC20826v0.m108834s0(string, this.f75388Z0.m43213P(), j11);
                    if (m43303o0 != -1 && (linearLayoutManager = this.f75387Y0) != null && m108834s0) {
                        linearLayoutManager.mo9756v1(m43303o0);
                    }
                }
            }
        }
    }

    /* renamed from: tO */
    private void m82006tO() {
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public void m82008uN() {
        try {
            FeedAsyncFailedPopupView feedAsyncFailedPopupView = this.f75366G1;
            if (feedAsyncFailedPopupView != null) {
                feedAsyncFailedPopupView.dismiss();
            } else {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("FeedAsyncFailedPopupView");
                if (m92996E0 != null) {
                    m92996E0.finish();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vN */
    private void m82010vN() {
        this.f75363D1 = (C27353a) new C1802w0(this, new C27353a.e(this, null)).m9378a(C27353a.class);
        m81982XN();
    }

    /* renamed from: vO */
    private void m82011vO(C26876b c26876b) {
        C3000l0 m138450a;
        if (c26876b != null) {
            try {
                if (c26876b.f127178a == 3) {
                    for (int i11 = 0; i11 < this.f75411w1.size(); i11++) {
                        C3000l0 c3000l0 = (C3000l0) this.f75411w1.get(i11);
                        if (c3000l0 != null && c3000l0.f11895q.equals(c26876b.f127179b) && (m138450a = C26878b.f127183a.m138450a(c3000l0.f11895q)) != null) {
                            m138450a.m14322a0().f12062u = c3000l0.m14322a0().f12062u;
                            this.f75411w1.set(i11, m138450a);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: wN */
    private boolean m82013wN(C3000l0 c3000l0) {
        PrivacyInfo privacyInfo;
        ArrayList arrayList;
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null && (privacyInfo = m14322a0.f12042V) != null && privacyInfo.m45152x() && (arrayList = m14322a0.f12042V.f45974q) != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((LikeContactItem) arrayList.get(i11)).m56333d().equals(this.f75410v1.f42434r)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public /* synthetic */ void m82015xN(String str) {
        try {
            C3000l0 m137785c = C26767v.m137782d().m137785c(str);
            if (m137785c == null) {
                m137785c = C26878b.f127183a.m138450a(str);
            }
            if (m137785c != null && !this.f75411w1.contains(m137785c)) {
                if (m82018yO(m137785c, str) && !m137785c.m14322a0().m14488S()) {
                    this.f75411w1.add(0, m137785c);
                }
                m82036mO();
                m81998pu(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public /* synthetic */ void m82017yN(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof Bundle) {
                m82004sN((Bundle) obj);
                m82036mO();
            }
        }
    }

    /* renamed from: yO */
    private boolean m82018yO(C3000l0 c3000l0, String str) {
        ArrayList arrayList;
        PrivacyInfo privacyInfo = c3000l0.m14325c0(str).f12042V;
        if (privacyInfo.f45973p != 2 || (arrayList = privacyInfo.f45974q) == null || arrayList.size() != 1 || !((LikeContactItem) privacyInfo.f45974q.get(0)).m56333d().equals(this.f75410v1.f42434r)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public /* synthetic */ void m82020zN(boolean z11, C3000l0 c3000l0, C3020p0 c3020p0, InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        if (z11) {
            m81994iO(c3000l0, c3020p0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.mo37111CJ(bundle);
        C23744a.m124114c().m124115b(this, 22);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            try {
                String string = m92642L3.getString("uid");
                if (!TextUtils.isEmpty(string)) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(string);
                    this.f75410v1 = m141809c;
                    if (m141809c == null) {
                        ContactProfile contactProfile = new ContactProfile(string);
                        this.f75410v1 = contactProfile;
                        if (!m92642L3.containsKey("avt")) {
                            str = "";
                        } else {
                            str = m92642L3.getString("avt");
                        }
                        contactProfile.f42446v = str;
                        ContactProfile contactProfile2 = this.f75410v1;
                        if (!m92642L3.containsKey("dpn")) {
                            str2 = "";
                        } else {
                            str2 = m92642L3.getString("dpn");
                        }
                        contactProfile2.f42437s = str2;
                        ContactProfile contactProfile3 = this.f75410v1;
                        if (!m92642L3.containsKey("cover")) {
                            str3 = "";
                        } else {
                            str3 = m92642L3.getString("cover");
                        }
                        contactProfile3.f42324B = str3;
                    }
                }
                this.f75360A1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f75361B1 = AbstractC23309i.m121892f4() / 100.0f;
        C0815e1.m2075D().m2100V(new C23648e(8, this.f75360A1, 1, "shared_timeline", "1"), false);
        m82010vN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            return C24355e0.f117560a.m127360h(m92689tK(), new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.zy
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    C24848g0 m81961MN;
                    m81961MN = MutualFeedView.this.m81961MN();
                    return m81961MN;
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 2 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75381T0 = layoutInflater.inflate(AbstractC7409c0.mutual_feeds_view, (ViewGroup) null);
        C24003n m120132i0 = C23278z2.m120132i0();
        this.f75396h1 = m120132i0;
        m120132i0.f116261b = C23278z2.m120071G0().f116261b;
        View view = this.f75381T0;
        if (view != null) {
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f75383U0 = multiStateView;
            multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.kz
                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    MutualFeedView.this.m81963NN();
                }
            });
            CircleImage circleImage = (CircleImage) this.f75381T0.findViewById(AbstractC6918a0.imvAvatar);
            this.f75389a1 = circleImage;
            circleImage.m87724k(C23212s8.m119607o(circleImage.getContext(), AbstractC16781w.AvatarPlaceHolderColor), 255, AbstractC23136l9.m118742r(1.0f));
            this.f75389a1.setVisibility(8);
            CircleImage circleImage2 = (CircleImage) this.f75381T0.findViewById(AbstractC6918a0.imvMyAvatar);
            this.f75390b1 = circleImage2;
            circleImage2.m87724k(C23212s8.m119607o(circleImage2.getContext(), AbstractC16781w.AvatarPlaceHolderColor), 255, AbstractC23136l9.m118742r(1.0f));
            this.f75390b1.setVisibility(8);
            TextView textView = (TextView) this.f75381T0.findViewById(AbstractC6918a0.tvMutualFeedHint);
            this.f75391c1 = textView;
            textView.setVisibility(8);
            View findViewById = this.f75381T0.findViewById(AbstractC6918a0.profile_cover_gradient);
            this.f75401m1 = findViewById;
            findViewById.setVisibility(0);
            View findViewById2 = this.f75381T0.findViewById(AbstractC6918a0.top_profile_cover_gradient);
            this.f75402n1 = findViewById2;
            findViewById2.setVisibility(0);
            this.f75403o1 = this.f75381T0.findViewById(AbstractC6918a0.layoutAvatar);
            this.f75395g1 = (RecyclingImageView) this.f75381T0.findViewById(AbstractC6918a0.cover_image);
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f75381T0.findViewById(AbstractC6918a0.swipe_refresh_layout);
            this.f75384V0 = swipeRefreshListView;
            swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.tz
                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    MutualFeedView.this.m81965ON();
                }
            });
            RecyclerView recyclerView = this.f75384V0.f83582p0;
            this.f75386X0 = recyclerView;
            recyclerView.setBackgroundResource(AbstractC16803z.rectangle_transparent);
            this.f75386X0.setVisibility(0);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
            this.f75387Y0 = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            this.f75386X0.setLayoutManager(this.f75387Y0);
            this.f75406r1 = this.f75381T0.findViewById(AbstractC6918a0.user_details_bottom_bar_container);
            this.f75405q1 = (TextView) this.f75381T0.findViewById(AbstractC6918a0.imgButtonUpdateStatus);
            EmptyContentView emptyContentView = (EmptyContentView) this.f75381T0.findViewById(AbstractC6918a0.error_empty_state);
            this.f75365F1 = emptyContentView;
            emptyContentView.setEmptyContentListener(new EmptyContentView.InterfaceC8078a() { // from class: com.zing.zalo.ui.zviews.uz
                @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
                /* renamed from: s */
                public final void mo43432s(C3054x c3054x) {
                    MutualFeedView.this.m81967PN(c3054x);
                }
            });
        }
        return this.f75381T0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        C8050a c8050a = this.f75388Z0;
        if (c8050a != null) {
            c8050a.m43312y0();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.m124114c().m124117e(this, 22);
        C23744a.m124114c().m124117e(this, 5100);
        C23744a.m124114c().m124117e(this, 6097);
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: M2 */
    public void mo11925M2(C3000l0 c3000l0) {
        FeedAsyncFailedPopupView m87736kL = FeedAsyncFailedPopupView.m87736kL(c3000l0.f11895q, c3000l0.f11892o0, new C14659i(c3000l0));
        this.f75366G1 = m87736kL;
        if (m87736kL != null) {
            m87736kL.m92602UK(this.f72421L0.m92649TI(), "FeedAsyncFailedPopupView");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Q2 */
    public void mo11930Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
        d00.m87283c(this, c3020p0, c32002l4);
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
                C32002l4 m82033lN = m82033lN();
                if (m82033lN != null) {
                    bundle.putString("extra_entry_point_flow", m82033lN.m154284u(12).m154277l());
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
        try {
            this.f75388Z0.m43282A0();
            C26333b.f125013a.m135515e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        String m118743r0;
        super.mo37493TJ();
        try {
            if (this.f72421L0.m92648SI() != null && this.f72421L0.m92674mJ()) {
                m92637BK(true);
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    List list = this.f75411w1;
                    if (list != null && list.size() > 0 && this.f75398j1 != 1.0f) {
                        i11 = AbstractC16803z.trans;
                    } else {
                        i11 = AbstractC16803z.stencil_bg_action_bar;
                    }
                    actionBar.setBackgroundResource(i11);
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                    ActionBar actionBar2 = this.f88760a0;
                    List list2 = this.f75411w1;
                    if (list2 != null && list2.size() > 0) {
                        m118743r0 = "";
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mutual_feed_title);
                    }
                    actionBar2.setTitle(m118743r0);
                    this.f88760a0.setSubtitle(null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
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
            FeedActionZUtils.m47525M(c16719g, c3000l0, i11, c17487o02, bundle, 68, -10, z11, m82033lN());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f75380S1;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f75380S1.dismiss();
        }
        try {
            this.f75388Z0.m43286E0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: X */
    public void mo11940X(C3000l0 c3000l0) {
        boolean z11;
        String m118743r0;
        String m118743r02;
        int i11;
        final String str;
        if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().m14488S()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_remove_local_edit_feed_v2);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_failed_feed);
        }
        if (z11) {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_local_edit_feed);
        } else {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
        }
        if (z11) {
            i11 = AbstractC8020f0.str_uncancel;
        } else {
            i11 = AbstractC8020f0.str_cancel;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(i11);
        if (c3000l0 != null) {
            str = c3000l0.f11895q;
        } else {
            str = "";
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43162k(m118743r0).m43165n(m118743r03, new InterfaceC17463d.b()).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.wz
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MutualFeedView.this.m81977UN(str, interfaceC17463d, i12);
            }
        });
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f75380S1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        C8009j m43152a = aVar.m43152a();
        this.f75380S1 = m43152a;
        m43152a.mo13822K();
    }

    /* renamed from: XM */
    public void m82021XM() {
        C3000l0 c3000l0;
        View childAt;
        try {
            if (this.f75388Z0 != null && this.f75386X0 != null) {
                int m9740Y1 = this.f75387Y0.m9740Y1();
                int m9745c2 = this.f75387Y0.m9745c2();
                if (m9740Y1 >= 0 && m9740Y1 <= m9745c2) {
                    for (int i11 = m9740Y1; i11 <= m9745c2; i11++) {
                        C2966e1 m43214Q = this.f75388Z0.m43214Q(i11);
                        if (m43214Q != null && this.f75388Z0.m43216U(m43214Q.f11705c) && (c3000l0 = m43214Q.f11703a) != null && (childAt = this.f75386X0.getChildAt(i11 - m9740Y1)) != null) {
                            AbstractC20826v0.m108809g(c3000l0, 0, Math.min(childAt.getBottom(), this.f75386X0.getHeight()) - Math.max(0, childAt.getTop()), childAt.getBottom() - childAt.getTop(), this.f75361B1, m82033lN(), m82035mN(c3000l0.m14324b0(0).f12057p));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YM */
    void m82022YM(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f75411w1 != null) {
                for (int i11 = 0; i11 < this.f75411w1.size(); i11++) {
                    if (((C3000l0) this.f75411w1.get(i11)).f11895q.equals(str)) {
                        ((C3000l0) this.f75411w1.get(i11)).m14322a0().f12059r.m14388a();
                        if (z11) {
                            m82036mO();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
        FeedActionZUtils.m47533U(animationTarget, this.f75377R0, str, bundle, c20275e, 10000, this, c3020p0, m92676n2(), trackingSource, z11, -10, m82033lN());
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ys */
    public void mo11942Ys(C3000l0 c3000l0, String str, boolean z11) {
        Bundle bundle = new Bundle();
        C20637a c20637a = new C20637a();
        c20637a.m107550n(str);
        c20637a.m107548l(c3000l0);
        c20637a.m107549m(c3000l0.m14325c0(str));
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(5);
        bottomSheetMenuBundleData.m45507h(c20637a);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, 1, true);
    }

    /* renamed from: aO */
    public void m82023aO(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC20826v0.m108803d(str);
            C26761p.m137741q().m137764l(str);
            m81980WM();
        }
    }

    /* renamed from: bN */
    void m82024bN(List list) {
        try {
            m82032kO(list);
            ArrayList m137786e = C26767v.m137782d().m137786e();
            if (m137786e != null && m137786e.size() > 0) {
                ArrayList<C3000l0> arrayList = new ArrayList();
                ArrayList<C3000l0> arrayList2 = new ArrayList();
                Iterator it = m137786e.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 != null && m82013wN(c3000l0)) {
                        C3000l0 m108788U0 = AbstractC20826v0.m108788U0(c3000l0);
                        if (m108788U0.m14377z0()) {
                            arrayList2.add(m108788U0);
                        } else if (m108788U0.m14290E0()) {
                            arrayList.add(m108788U0);
                        }
                    }
                }
                for (C3000l0 c3000l02 : arrayList2) {
                    if (c3000l02 != null && !c3000l02.m14322a0().m14488S()) {
                        list.add(0, c3000l02);
                    }
                }
                for (C3000l0 c3000l03 : arrayList) {
                    if (c3000l03 != null && !c3000l03.m14322a0().m14488S()) {
                        list.add(0, c3000l03);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: cN */
    void m82025cN(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0824j.m2153b(new C14651a(str));
        }
    }

    /* renamed from: dN */
    void m82026dN(boolean z11) {
        try {
            if (!this.f75367H1 && this.f75410v1 != null) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(this.f75368I1);
                if (z11) {
                    this.f75383U0.setState(MultiStateView.EnumC15914e.LOADING);
                    this.f75383U0.setVisibility(0);
                }
                this.f75367H1 = true;
                c0766k.mo1480La(this.f75410v1.f42434r, this.f75412x1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eN */
    void m82027eN() {
        if (!this.f75370K1 && this.f75410v1 != null) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14661k());
            this.f75370K1 = true;
            ContactProfile contactProfile = this.f75410v1;
            c0766k.mo1514Q4(contactProfile.f42434r, contactProfile.f42385V0, new TrackingSource((short) 1035));
        }
    }

    /* renamed from: fN */
    void m82028fN(Runnable runnable) {
        if (this.f72421L0.m92676n2() != null && runnable != null) {
            this.f72421L0.m92676n2().runOnUiThread(runnable);
        }
    }

    /* renamed from: gN */
    void m82029gN(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            this.f75384V0.setRefreshing(false);
            m82036mO();
            CircleImage circleImage = this.f75389a1;
            if (this.f75411w1.size() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            circleImage.setVisibility(i11);
            CircleImage circleImage2 = this.f75390b1;
            if (this.f75411w1.size() > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            circleImage2.setVisibility(i12);
            TextView textView = this.f75391c1;
            if (this.f75411w1.size() > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            textView.setVisibility(i13);
            if (!this.f75413y1 && this.f75411w1.size() == 0) {
                if (z11) {
                    this.f75383U0.setState(MultiStateView.EnumC15914e.MUTUAL_EMPTY);
                    this.f75383U0.setMineAvatarImageUrl(AbstractC23304d.f113368c0.f42446v);
                    if (C23302b.f113247a.m120523d(this.f75410v1.f42446v) && !CoreUtility.f89233i.equals(this.f75410v1.f42434r) && this.f75383U0.getImvFriendAvatar() != null) {
                        this.f75383U0.getImvFriendAvatar().setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f75410v1.m40383Q(true, false)), C2343e.m12307a(this.f75410v1.f42434r, false)));
                    } else {
                        this.f75383U0.setFriendAvatarImageUrl(this.f75410v1.f42446v);
                    }
                    int indexOf = this.f75408t1.indexOf(this.f75407s1);
                    if (indexOf != -1) {
                        int length = this.f75407s1.length() + indexOf;
                        C14662l c14662l = new C14662l();
                        SpannableString spannableString = new SpannableString(this.f75408t1);
                        spannableString.setSpan(c14662l, indexOf, length, 33);
                        TextView textView2 = this.f75383U0.f81201Q;
                        if (textView2 != null) {
                            textView2.setText(spannableString);
                        }
                    }
                    int indexOf2 = this.f75409u1.indexOf(this.f75407s1);
                    if (indexOf2 != -1) {
                        int length2 = this.f75407s1.length() + indexOf2;
                        C14663m c14663m = new C14663m();
                        SpannableString spannableString2 = new SpannableString(this.f75409u1);
                        spannableString2.setSpan(c14663m, indexOf2, length2, 33);
                        TextView textView3 = this.f75383U0.f81203S;
                        if (textView3 != null) {
                            textView3.setText(spannableString2);
                        }
                    }
                } else {
                    this.f75383U0.setState(MultiStateView.EnumC15914e.ERROR);
                }
                this.f75386X0.m9821B1(this.f75385W0);
                this.f75385W0 = null;
                this.f75383U0.setVisibility(0);
                mo37493TJ();
                return;
            }
            if (z11) {
                if (this.f75413y1) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                m82042pO(new C3010n0(i14));
            } else {
                m82042pO(new C3010n0(this.f75413y1 ? 1 : 0));
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mutual_feed_cover_hint);
            ContactProfile contactProfile = this.f75410v1;
            this.f75391c1.setText(String.format(m118743r0, AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.f42437s)));
            this.f75383U0.setVisibility(8);
            m82044qO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gO */
    public void m82030gO(final InterfaceC2946a1 interfaceC2946a1) {
        for (final int i11 = 0; i11 < this.f75362C1.size(); i11++) {
            try {
                C3020p0 c3020p0 = ((C2966e1) this.f75362C1.get(i11)).f11704b;
                if (c3020p0 != null && interfaceC2946a1 != null && interfaceC2946a1.mo13947I().equals(c3020p0.f12057p)) {
                    this.f75379S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.pz
                        @Override // java.lang.Runnable
                        public final void run() {
                            MutualFeedView.this.m81973SN(i11, interfaceC2946a1);
                        }
                    });
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MutualFeedView";
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: gn */
    public void mo11955gn(C3020p0 c3020p0) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        if (c3020p0 != null) {
            bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
            bundle.putInt("EXTRA_MODE", 0);
            bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", m82033lN().m154277l());
            bundle.putString("EXTRA_FEED_OWNER_ID", c3020p0.m14465A());
        }
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
        }
    }

    /* renamed from: hO */
    void m82031hO(int i11) {
        try {
            int m155405d = AbstractC32226c.m155405d(m92676n2());
            int i12 = this.f75397i1;
            int i13 = this.f75399k1;
            float f11 = i12 - i13;
            int i14 = (i13 - m155405d) - i12;
            float f12 = i11;
            float m119528a = AbstractC23199r6.m119528a(f12 / f11, 0.0f, 1.0f);
            this.f75398j1 = m119528a;
            if (m119528a < 1.0f) {
                this.f75404p1 = false;
            }
            if (this.f75404p1) {
                return;
            }
            if (m119528a == 1.0f) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.setBackgroundColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormColor));
                    if (C23212s8.m119603k()) {
                        this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
                    } else {
                        this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                    }
                }
                this.f75390b1.setEnableRoundPadding(false);
                this.f75389a1.setEnableRoundPadding(false);
                if (C23212s8.m119603k()) {
                    CircleImage circleImage = this.f75390b1;
                    circleImage.m87724k(C23212s8.m119607o(circleImage.getContext(), AbstractC16781w.AvatarPlaceHolderColor), 255, AbstractC23136l9.m118742r(2.0f));
                    CircleImage circleImage2 = this.f75389a1;
                    circleImage2.m87724k(C23212s8.m119607o(circleImage2.getContext(), AbstractC16781w.AvatarPlaceHolderColor), 255, AbstractC23136l9.m118742r(2.0f));
                }
            } else {
                ActionBar actionBar2 = this.f88760a0;
                if (actionBar2 != null) {
                    actionBar2.setBackgroundColor(0);
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                }
                this.f75390b1.setEnableRoundPadding(true);
                this.f75389a1.setEnableRoundPadding(true);
            }
            RecyclingImageView recyclingImageView = this.f75395g1;
            if (recyclingImageView != null) {
                AbstractC1579n0.m7857b1(recyclingImageView, AbstractC23199r6.m119528a((-i11) / 2, i14, 0.0f));
            }
            View view = this.f75401m1;
            if (view != null) {
                AbstractC1579n0.m7857b1(view, Math.min((this.f75397i1 - view.getHeight()) - i11, this.f75397i1 - this.f75401m1.getHeight()));
            }
            View view2 = this.f75402n1;
            if (view2 != null) {
                AbstractC1579n0.m7857b1(view2, Math.min(-i11, 0));
            }
            if (this.f75403o1 != null && this.f75391c1 != null) {
                float dimension = MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.ava3);
                float dimension2 = MainApplication.getAppContext().getResources().getDimension(AbstractC16802y.ava4);
                float f13 = (((this.f75399k1 - m155405d) - dimension) / 2.0f) + m155405d;
                float m118715i = ((this.f75397i1 - AbstractC23136l9.m118715i(MainApplication.getAppContext().getResources(), 25.0f)) - this.f75391c1.getTextSize()) - AbstractC23136l9.m118740q0(this.f72421L0.getContext());
                float m118715i2 = (m118715i - dimension2) - AbstractC23136l9.m118715i(MainApplication.getAppContext().getResources(), 8.0f);
                float f14 = m118715i2 - f12;
                float f15 = dimension / dimension2;
                float m119528a2 = AbstractC23199r6.m119528a(((f14 / m118715i2) * (1.0f - f15)) + f15, f15, 1.0f);
                AbstractC1579n0.m7841U0(this.f75403o1, 0.0f);
                AbstractC1579n0.m7845W0(this.f75403o1, m119528a2);
                AbstractC1579n0.m7847X0(this.f75403o1, m119528a2);
                AbstractC1579n0.m7857b1(this.f75403o1, Math.min(Math.max(f13, f14), m118715i2));
                AbstractC1579n0.m7854a1(this.f75403o1, dimension2 * (1.0f - m119528a2));
                AbstractC1579n0.m7805C0(this.f75391c1, 1.0f - AbstractC23199r6.m119528a((i11 - m81997kN()) / ((m81995jN() - this.f75399k1) - m155405d), 0.0f, 1.0f));
                AbstractC1579n0.m7857b1(this.f75391c1, m118715i - f12);
            }
            if (this.f75398j1 == 1.0f) {
                this.f75404p1 = true;
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

    @Override // ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_INT_REQUEST_CODE", 10014);
        C20043e.m104033y(this.f72421L0.m92676n2(), c3000l0.m14324b0(i11), c17391z, i12, view, view2, bundle, m82033lN());
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: jM */
    public int mo79521jM(Class cls) {
        if (ProfileAlbumDetailView.class.isAssignableFrom(cls)) {
            return 1016;
        }
        return super.mo79521jM(cls);
    }

    /* renamed from: kO */
    void m82032kO(List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null && c3000l0.m14285C0()) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
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
            FeedActionZUtils.m47524L(view, c3000l0, i11, c17487o02, bundle, 68, -10, z11, m82033lN());
        }
    }

    /* renamed from: lN */
    protected C32002l4 m82033lN() {
        return C32002l4.m154264g(10003);
    }

    /* renamed from: lO */
    void m82034lO(String str, ArrayList arrayList, boolean z11) {
        if (!TextUtils.isEmpty(str) && arrayList != null && arrayList.size() > 0) {
            try {
                if (this.f75411w1 != null) {
                    for (int i11 = 0; i11 < this.f75411w1.size(); i11++) {
                        if (((C3000l0) this.f75411w1.get(i11)).f11895q.equals(str)) {
                            ((C3000l0) this.f75411w1.get(i11)).m14322a0().m14530v0(arrayList, true);
                            if (z11) {
                                m82036mO();
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
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
    public int m82035mN(String str) {
        if (str == null) {
            return -1;
        }
        for (int i11 = 0; i11 < this.f75411w1.size(); i11++) {
            if (((C3000l0) this.f75411w1.get(i11)).m14329e0(str) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: mO */
    public void m82036mO() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.gz
            @Override // java.lang.Runnable
            public final void run() {
                MutualFeedView.this.m81979VN();
            }
        });
    }

    /* renamed from: nN */
    public int m82037nN() {
        C3010n0 c3010n0;
        C2966e1 c2966e1 = this.f75376Q1;
        if (c2966e1 != null && (c3010n0 = c2966e1.f11709g) != null) {
            return c3010n0.m14426a();
        }
        return 0;
    }

    /* renamed from: nO, reason: merged with bridge method [inline-methods] */
    public void m81941CN(C3020p0 c3020p0, int i11, String str) {
        String str2;
        String str3;
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12057p != null && (str2 = c3020p0.f12022B.f12280b) != null && !str2.equals(CoreUtility.f89233i) && C23055e5.m118272g(true)) {
                    if (c3020p0.m14518m0()) {
                        str3 = "6";
                    } else {
                        str3 = "7";
                    }
                    String str4 = str3;
                    mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14655e());
                    c0766k.mo1787ya(c3020p0.f12022B.f12280b, str4, c3020p0.f12057p, "", i11, str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: oN */
    void m82039oN(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        final C3000l0 c3000l0;
        String str;
        if (intent != null && intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45565a() != null && bottomSheetMenuResult.m45569e() == 5 && bottomSheetMenuResult.m45571g() != 0) {
            C20637a m45565a = bottomSheetMenuResult.m45565a();
            final C3020p0 c3020p0 = null;
            if (m45565a != null) {
                c3000l0 = m45565a.m107540b();
            } else {
                c3000l0 = null;
            }
            if (m45565a != null) {
                c3020p0 = m45565a.m107541c();
            }
            if (c3000l0 != null && c3020p0 != null) {
                int m45571g = bottomSheetMenuResult.m45571g();
                final boolean z11 = false;
                int i11 = 9;
                if (m45571g != 8) {
                    if (m45571g != 9) {
                        if (m45571g == 11) {
                            m81994iO(c3000l0, c3020p0, false);
                            return;
                        }
                        return;
                    } else {
                        AbstractC23647d.m123906p("7512");
                        KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(this.f72421L0.m92648SI(), new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.oz
                            @Override // bn.C2913t1.b
                            /* renamed from: a */
                            public final void mo13056a(int i12, String str2) {
                                MutualFeedView.this.m81941CN(c3020p0, i12, str2);
                            }
                        }, AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_dialog_msg), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no));
                        this.f75380S1 = m118464q;
                        if (m118464q != null) {
                            m118464q.mo13822K();
                        }
                        AbstractC23647d.m123893c();
                        return;
                    }
                }
                AbstractC23647d.m123906p("6511");
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_des);
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                if (c3020p0.m14494Y() && c3020p0.m14485P() && c3020p0.f12058q != 23) {
                    z11 = true;
                }
                if (z11) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_feed_confirm_v2);
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_edit);
                } else {
                    str = "";
                    i11 = 1;
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(i11).m43162k(m118743r0).m43168q(str, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.lz
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        MutualFeedView.this.m82020zN(z11, c3000l0, c3020p0, interfaceC17463d, i12);
                    }
                }).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.mz
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        MutualFeedView.this.m81937AN(c3020p0, interfaceC17463d, i12);
                    }
                }).m43165n(m118743r03, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.nz
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        interfaceC17463d.dismiss();
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f75380S1 = m43152a;
                m43152a.mo13822K();
                AbstractC23647d.m123893c();
            }
        }
    }

    /* renamed from: oO */
    void m82040oO() {
        ContactProfile contactProfile;
        try {
            if (!C29628e.m147249E0().f89373e) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.network_error));
                return;
            }
            if (!TextUtils.isEmpty(this.f75394f1) && (contactProfile = this.f75410v1) != null) {
                String str = contactProfile.f42434r;
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), 0).m95382r(this.f75394f1).m95386v(1).m95365a();
                m95365a.m94951M9();
                new C0766k().mo1734s6(str, m95365a, null);
                AbstractC21935u.m114528R(str);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        JSONObject jSONObject;
        C17244x0 c17244x0;
        boolean z11;
        Bundle extras;
        Bundle extras2;
        String stringExtra;
        Bundle extras3;
        super.onActivityResult(i11, i12, intent);
        C3000l0 c3000l0 = null;
        int i13 = 0;
        r12 = false;
        boolean z12 = false;
        try {
            if (i11 != 68) {
                if (i11 != 10000) {
                    if (i11 != 10014) {
                        if (i11 != 11000) {
                            if (i11 != 12200) {
                                if (i11 != 20001) {
                                    if (i11 != 1015) {
                                        if (i11 != 1016 || i12 != -1 || (extras3 = intent.getExtras()) == null) {
                                            return;
                                        }
                                        boolean z13 = extras3.getBoolean("EXTRA_BOOL_FEED_DELETED");
                                        if (z13) {
                                            String string = extras3.getString("EXTRA_STRING_FEED_ID", "");
                                            if (string != null && string.length() > 0) {
                                                if (!TextUtils.isEmpty(string)) {
                                                    C26747f0.m137582I().m137653A0(string);
                                                }
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 >= this.f75411w1.size()) {
                                                        break;
                                                    }
                                                    if (((C3000l0) this.f75411w1.get(i14)).f11895q.equals(string)) {
                                                        m82025cN(string);
                                                        this.f75411w1.remove(i14);
                                                        this.f75388Z0.m43298h0(m81993iN(), this.f75411w1);
                                                        this.f75388Z0.m10008p();
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                        } else {
                                            m82043qN(extras3.getStringArrayList("deletedPhoto"));
                                        }
                                        m82029gN(true);
                                        if (z13 && this.f75411w1.size() <= 3) {
                                            z12 = true;
                                        }
                                        m82045sO(z12);
                                        return;
                                    }
                                    if (i12 == -1 && intent != null) {
                                        m82049xO(EditFeedView.m79360fU(intent));
                                        return;
                                    }
                                    return;
                                }
                                if (i12 == -1) {
                                    m82039oN(intent);
                                    return;
                                }
                                return;
                            }
                            if (i12 == -1) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
                                return;
                            }
                            return;
                        }
                        if (i12 == -1) {
                            if (intent != null) {
                                try {
                                    extras2 = intent.getExtras();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            } else {
                                extras2 = null;
                            }
                            if (extras2 != null) {
                                if (intent.hasExtra("extra_new_feed_id") && (c3000l0 = C26767v.m137782d().m137785c((stringExtra = intent.getStringExtra("extra_new_feed_id")))) == null) {
                                    c3000l0 = C26878b.f127183a.m138450a(stringExtra);
                                }
                                if (c3000l0 != null && !this.f75411w1.contains(c3000l0)) {
                                    this.f75411w1.add(0, c3000l0);
                                    m82029gN(true);
                                    AbstractC20826v0.m108770L0(true);
                                    this.f75386X0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.xz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MutualFeedView.this.m81959LN();
                                        }
                                    }, 200L);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i12 == -1) {
                        Bundle extras4 = intent.getExtras();
                        boolean z14 = extras4.getBoolean("EXTRA_BOOL_FEED_DELETED");
                        String string2 = extras4.getString("EXTRA_STRING_FEED_ID");
                        if (z14) {
                            while (true) {
                                if (i13 >= this.f75411w1.size()) {
                                    break;
                                }
                                if (((C3000l0) this.f75411w1.get(i13)).f11895q.equals(string2)) {
                                    m82025cN(string2);
                                    this.f75411w1.remove(i13);
                                    break;
                                }
                                i13++;
                            }
                        }
                        boolean m108546d = AbstractC20805l.m108546d(intent, string2, this.f75411w1);
                        if (z14 || m108546d) {
                            m82036mO();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i12 == -1 || (extras = intent.getExtras()) == null) {
                }
                m82043qN(extras.getStringArrayList("deletedPhoto"));
                String string3 = extras.getString("feedId");
                AbstractC20805l.m108546d(intent, string3, this.f75411w1);
                if (!TextUtils.isEmpty(string3)) {
                    if (extras.getBoolean("extra_feed_empty_tag")) {
                        m82022YM(string3, false);
                    } else {
                        ArrayList<String> stringArrayList = extras.getStringArrayList("extra_deleted_tag_uids");
                        if (stringArrayList != null && stringArrayList.size() > 0) {
                            m82034lO(string3, stringArrayList, false);
                        }
                    }
                }
                m82029gN(true);
                return;
            }
            if (i12 == -1) {
                Bundle extras5 = intent.getExtras();
                if (extras5 == null) {
                    return;
                }
                boolean z15 = extras5.getBoolean("deleted");
                if (z15) {
                    String string4 = extras5.getString("feedId");
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.f75411w1.size()) {
                            break;
                        }
                        if (((C3000l0) this.f75411w1.get(i15)).f11895q.equals(string4)) {
                            m82025cN(string4);
                            break;
                        }
                        i15++;
                    }
                } else {
                    for (int i16 = 0; i16 < this.f75411w1.size(); i16++) {
                        if (((C3000l0) this.f75411w1.get(i16)).f11895q.equals(extras5.getString("feedId"))) {
                            C3020p0 m14322a0 = ((C3000l0) this.f75411w1.get(i16)).m14322a0();
                            AbstractC20805l.m108547e(extras5, m14322a0);
                            if (m14322a0.f12058q == 22) {
                                m14322a0.f12023C.f12101J = extras5.getString("extra_feed_memory_id", "");
                                m14322a0.f12023C.f12103L = extras5.getDouble("extra_ratio_zinstant", 0.0d);
                                String string5 = extras5.getString("extra_memory_zinstant_feed_info", "");
                                try {
                                    if (!TextUtils.isEmpty(string5)) {
                                        jSONObject = new JSONObject(string5);
                                    } else {
                                        jSONObject = null;
                                    }
                                    C3025q0 c3025q0 = m14322a0.f12023C;
                                    if (jSONObject != null) {
                                        c17244x0 = new C17244x0(31, jSONObject);
                                    } else {
                                        c17244x0 = null;
                                    }
                                    c3025q0.f12104M = c17244x0;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    m14322a0.f12023C.f12104M = null;
                                }
                                m14322a0.f12023C.f12105N = extras5.getBoolean("extra_is_valid_content", true);
                            }
                            ArrayList<String> stringArrayList2 = extras5.getStringArrayList("deletedPhoto");
                            if (stringArrayList2 != null && stringArrayList2.size() > 0) {
                                ArrayList arrayList = m14322a0.f12023C.f12118i;
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    if (stringArrayList2.contains(((ItemAlbumMobile) arrayList.get(size)).f42595r)) {
                                        arrayList.remove(size);
                                    }
                                }
                                m14322a0.f12023C.f12118i = arrayList;
                            }
                            if (m14322a0.f12059r != null) {
                                int i17 = extras5.getInt("extra_result_tag_count", -1);
                                C3003l3 c3003l3 = m14322a0.f12059r;
                                if (i17 != c3003l3.f11956a) {
                                    if (i17 == 0) {
                                        c3003l3.m14388a();
                                    } else if (extras5.containsKey("extra_result_tag_uids")) {
                                        try {
                                            HashMap hashMap = (HashMap) extras5.getSerializable("extra_result_tag_uids");
                                            if (hashMap != null && hashMap.size() > 0) {
                                                ArrayList arrayList2 = new ArrayList();
                                                for (String str : m14322a0.f12059r.f11957b.keySet()) {
                                                    if (str != null && !hashMap.containsKey(str)) {
                                                        arrayList2.add(str);
                                                    }
                                                }
                                                if (arrayList2.size() > 0) {
                                                    m14322a0.f12059r.m14395h(arrayList2, true);
                                                }
                                            }
                                        } catch (Exception e13) {
                                            e13.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m82029gN(true);
                if (z15 && this.f75411w1.size() <= 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m82045sO(z11);
            }
            if (i12 == -1) {
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnClose) {
            AbstractC23647d.m123906p("17012");
            ContactProfile contactProfile = this.f75410v1;
            if (contactProfile != null) {
                AbstractC21935u.m114528R(contactProfile.f42434r);
            }
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.btnSendInvitation) {
            AbstractC23647d.m123906p("17011");
            m82040oO();
            AbstractC23647d.m123893c();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent) || this.f75388Z0.m43313z0(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 125) {
            try {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112030g) == 0) {
                    AbstractC3102n.m15597p(this.f72421L0);
                } else {
                    AbstractC23034c6.m118162k0(this, 125);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        List list;
        super.onResume();
        try {
            C8050a c8050a = this.f75388Z0;
            if (c8050a != null) {
                c8050a.m43283B0();
            }
            if (m82046tN()) {
                m82048wO();
                m82029gN(true);
            }
            List list2 = this.f75411w1;
            if (list2 != null && list2.size() > 0) {
                Iterator it = this.f75411w1.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 == null || (list = c3000l0.f11899s) == null || list.size() == 0) {
                        it.remove();
                        z11 = true;
                    }
                }
                if (this.f75388Z0 != null && z11) {
                    m82036mO();
                    m82029gN(true);
                }
            }
            FeedActionZUtils.m47541b(this, AbstractC23304d.f113304M2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pN */
    public void m82041pN(C3020p0 c3020p0) {
        try {
            m81990eO(c3020p0.f12057p);
            this.f75379S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.rz
                @Override // java.lang.Runnable
                public final void run() {
                    MutualFeedView.this.m81943DN();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pO */
    public void m82042pO(C3010n0 c3010n0) {
        C2966e1 c2966e1 = this.f75376Q1;
        if (c2966e1 != null) {
            c2966e1.f11709g = c3010n0;
        } else {
            this.f75376Q1 = new C2966e1(c3010n0);
        }
    }

    /* renamed from: qN */
    void m82043qN(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    for (int size = this.f75411w1.size() - 1; size >= 0; size--) {
                        C3000l0 c3000l0 = (C3000l0) this.f75411w1.get(size);
                        c3000l0.m14292F(arrayList);
                        if (c3000l0.m14375y0()) {
                            m82025cN(c3000l0.f11895q);
                            this.f75411w1.remove(size);
                        }
                    }
                    new C25405e().m101509a(arrayList);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: qO */
    void m82044qO() {
        try {
            if (this.f75385W0 == null) {
                C14664n c14664n = new C14664n();
                this.f75385W0 = c14664n;
                this.f75386X0.m9826E(c14664n);
            }
            if (C23302b.f113247a.m120523d(this.f75410v1.f42446v) && !CoreUtility.f89233i.equals(this.f75410v1.f42434r)) {
                int m12307a = C2343e.m12307a(this.f75410v1.f42434r, false);
                this.f75389a1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f75410v1.m40383Q(true, false)), m12307a));
            } else {
                ((C23528a) this.f75377R0.m123612r(this.f75389a1)).m123618x(this.f75410v1.f42446v, C23278z2.m120143n());
            }
            ((C23528a) this.f75377R0.m123612r(this.f75390b1)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
            ((C23528a) this.f75377R0.m123612r(this.f75395g1)).m123618x(this.f75410v1.f42324B, this.f75396h1);
            this.f75391c1.setVisibility(0);
            this.f88760a0.setTitle("");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sO */
    public synchronized void m82045sO(boolean z11) {
    }

    /* renamed from: tN */
    boolean m82046tN() {
        try {
            List list = this.f75411w1;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C3000l0) it.next()).m14285C0()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: uO */
    public void m82047uO(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(2, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: v3 */
    public void mo11972v3(final C3020p0 c3020p0, final C32002l4 c32002l4, int i11, int i12, int i13) {
        EnumC31051a m150915b = C31060j.m150915b(c3020p0);
        if (AbstractC31052b.m150889b(m150915b)) {
            C31060j c31060j = C31060j.f143193a;
            m82047uO(i11, i12, i13, c31060j.m150944q(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.vz
                @Override // as.InterfaceC2333h
                /* renamed from: b */
                public final void mo12288b(int i14) {
                    MutualFeedView.this.m81975TN(c3020p0, c32002l4, i14);
                }
            });
            c31060j.m150942h();
        } else if (AbstractC31052b.m150888a(m150915b)) {
            mo78936E(C19140e.m100450e(m92689tK()));
        }
    }

    /* renamed from: wO */
    synchronized void m82048wO() {
        C3000l0 m138450a;
        for (int i11 = 0; i11 < this.f75411w1.size(); i11++) {
            try {
                try {
                    C3000l0 c3000l0 = (C3000l0) this.f75411w1.get(i11);
                    if (c3000l0 != null && c3000l0.m14285C0() && c3000l0.m14339j0() == 3) {
                        C3000l0 m138450a2 = C26878b.f127183a.m138450a(c3000l0.f11895q);
                        if (m138450a2 != null) {
                            this.f75411w1.set(i11, m138450a2);
                        }
                    } else if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14285C0() && c3000l0.m14322a0().f12058q == 23 && (m138450a = C26878b.f127183a.m138450a(c3000l0.f11895q)) != null) {
                        this.f75411w1.set(i11, m138450a);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m82024bN(this.f75411w1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        try {
            if (i11 == 22) {
                if (objArr != null) {
                    if (objArr.length > 0) {
                        final String valueOf = String.valueOf(objArr[0]);
                        m82028fN(new Runnable() { // from class: com.zing.zalo.ui.zviews.dz
                            @Override // java.lang.Runnable
                            public final void run() {
                                MutualFeedView.this.m82015xN(valueOf);
                            }
                        });
                    }
                }
            } else if (i11 == 5100) {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ez
                    @Override // java.lang.Runnable
                    public final void run() {
                        MutualFeedView.this.m82017yN(objArr);
                    }
                });
            } else if (i11 == 6097 && objArr != null) {
                if (objArr.length > 0 && ((Integer) objArr[0]).intValue() != 10003) {
                    m81991fO();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f75377R0 = new C23528a(this.f72421L0.m92648SI());
        this.f75372M1 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_from_bottom_timeline);
        this.f75373N1 = AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_out_to_bottom_timeline);
        int i11 = AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
        int dimensionPixelSize = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_default_height_material);
        if (!AbstractC32226c.m155415n(m92676n2())) {
            i11 = 0;
        }
        this.f75399k1 = dimensionPixelSize + i11;
        this.f75400l1 = 0;
        try {
            this.f75414z1 = AbstractC23136l9.m118742r(80.0f);
            C8050a c8050a = new C8050a(this.f72421L0.m92648SI(), this.f75377R0);
            this.f75388Z0 = c8050a;
            c8050a.f43954K = this.f75397i1;
            c8050a.m43218W(this);
            this.f75388Z0.m43219X(this);
            this.f75388Z0.m43225d0(this);
            this.f75388Z0.m43217V(true);
            this.f75388Z0.m43289H0(new InterfaceC2261c() { // from class: com.zing.zalo.ui.zviews.yz
            });
            this.f75388Z0.m43220Y(new C14656f());
            this.f75388Z0.m43291J0(new C14657g());
            this.f75388Z0.m43294M0(new InterfaceC8343n5() { // from class: com.zing.zalo.ui.zviews.zz
                @Override // com.zing.zalo.feed.components.InterfaceC8343n5
                /* renamed from: a */
                public final boolean mo44786a() {
                    boolean m81949GN;
                    m81949GN = MutualFeedView.m81949GN();
                    return m81949GN;
                }
            });
            this.f75388Z0.m43298h0(m81993iN(), this.f75411w1);
            this.f75386X0.setAdapter(this.f75388Z0);
            if (C22013a0.m114928g()) {
                this.f75388Z0.m43224c0(this.f75382T1, new C7231u8());
            }
            if (this.f75410v1 != null) {
                this.f75405q1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.a00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MutualFeedView.this.m81951HN(view);
                    }
                });
                ContactProfile contactProfile = this.f75410v1;
                this.f75407s1 = AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.f42437s);
                if (AbstractC23136l9.m118654H0(MainApplication.getAppContext()) && this.f75407s1.length() >= 20) {
                    this.f75407s1 = this.f75407s1.substring(0, 20) + "...";
                }
                this.f75408t1 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_open_mutual_feed_empty), this.f75407s1);
                this.f75409u1 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_mutual_feed_empty), this.f75407s1);
                this.f75383U0.setStatusMutualEmpty(this.f75408t1);
                this.f75383U0.setNoticeMutualEmpty(this.f75409u1);
                this.f75383U0.setBtnShareMutualEmpty(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_mutual_feed_empty));
                this.f75383U0.setMutualEmptyBtnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.az
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MutualFeedView.this.m81953IN(view);
                    }
                });
            }
            this.f75412x1 = 1;
            if (this.f75411w1.size() > 0) {
                this.f75384V0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.bz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MutualFeedView.this.m81955JN();
                    }
                });
                new Handler().postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.cz
                    @Override // java.lang.Runnable
                    public final void run() {
                        MutualFeedView.this.m81957KN();
                    }
                }, 1500L);
            } else {
                m82026dN(true);
            }
            m82027eN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xO */
    void m82049xO(C3000l0 c3000l0) {
        int i11;
        if (c3000l0 != null) {
            try {
                List list = this.f75411w1;
                if (list != null) {
                    i11 = list.size();
                } else {
                    i11 = 0;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    C3000l0 c3000l02 = (C3000l0) this.f75411w1.get(i12);
                    if (c3000l0.f11895q.equals(c3000l02.f11895q)) {
                        c3000l02.m14354q1(c3000l0.m14322a0());
                        C0824j.m2153b(new C14658h(c3000l02));
                        m82036mO();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 5100);
        C23744a.m124114c().m124115b(this, 6097);
    }
}
