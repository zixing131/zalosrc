package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.AbstractC0906d0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C2279a;
import as.InterfaceC2333h;
import au.AbstractC2379w;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bn.C2913t1;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3038t;
import bo.C3042u;
import bo.C3050w;
import bo.C3054x;
import ck.C3563d;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.ProfileMusicView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting;
import com.zing.zalo.feed.mvp.profile.ProfilePhotoView;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlideShowSound;
import com.zing.zalo.p077ui.zviews.ProfileBaseView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.UserInfoDetailView;
import com.zing.zalo.p077ui.zviews.UserInfoView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.qrcode.p069ui.MyQRView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.ProfileMusicBottomSheet;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import hf0.C20040b;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import i40.C20275e;
import iq.C20661b4;
import iq.C20765w2;
import iq.InterfaceC20650a;
import iq.InterfaceC20653a2;
import iq.InterfaceC20659b2;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23199r6;
import me0.AbstractC23265y;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mz.C23493c;
import np.InterfaceC23923b;
import p140ev.C18613b;
import p173fz.C19172a;
import p205hc.C19964c;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p368nq.C23927b;
import p458qr.C25470c;
import p458qr.C25471d;
import p509sp.C26359h;
import p554up.AbstractC27354b;
import p649xl.C29833h5;
import p716zh.C31874cb;
import p716zh.C31877d;
import p716zh.C31901e8;
import p716zh.C31902e9;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32036n8;
import p724zp.AbstractC32542b;
import p724zp.C32541a;
import s00.AbstractC26080o;
import sa0.C26209i;
import ui0.C27280g;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28212v6;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class UserDetailsView extends ProfileBaseView implements UserInfoView.InterfaceC15317c, UserInfoDetailView.InterfaceC15314f, View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC20659b2, InterfaceC0733x, InterfaceC23923b {

    /* renamed from: K2 */
    static final String f78995K2 = "UserDetailsView";

    /* renamed from: A2 */
    ActionBarMenuItem f78996A2;

    /* renamed from: D2 */
    LinearLayout f78999D2;

    /* renamed from: E2 */
    CircleImage f79000E2;

    /* renamed from: F2 */
    RobotoTextView f79001F2;

    /* renamed from: G2 */
    LinearLayout f79002G2;

    /* renamed from: H2 */
    OADetailView f79003H2;

    /* renamed from: W1 */
    RelativeLayout f79006W1;

    /* renamed from: X1 */
    View f79007X1;

    /* renamed from: Y1 */
    View f79008Y1;

    /* renamed from: Z1 */
    View f79009Z1;

    /* renamed from: a2 */
    View f79010a2;

    /* renamed from: b2 */
    TextView f79011b2;

    /* renamed from: c2 */
    View f79012c2;

    /* renamed from: d2 */
    TextView f79013d2;

    /* renamed from: e2 */
    TextView f79014e2;

    /* renamed from: f2 */
    C29833h5 f79015f2;

    /* renamed from: g2 */
    TextView f79016g2;

    /* renamed from: h2 */
    TextView f79017h2;

    /* renamed from: i2 */
    View f79018i2;

    /* renamed from: j2 */
    View f79019j2;

    /* renamed from: k2 */
    View f79020k2;

    /* renamed from: l2 */
    InterfaceC20653a2 f79021l2;

    /* renamed from: m2 */
    Runnable f79022m2;

    /* renamed from: n2 */
    UserInfoView f79023n2;

    /* renamed from: p2 */
    UserInfoDetailView f79025p2;

    /* renamed from: q2 */
    private C32541a f79026q2;

    /* renamed from: u2 */
    View f79030u2;

    /* renamed from: v2 */
    C3038t f79031v2;

    /* renamed from: w2 */
    CheckBox f79032w2;

    /* renamed from: x2 */
    ActionBarMenuItem f79033x2;

    /* renamed from: y2 */
    ActionBarMenuItem f79034y2;

    /* renamed from: z2 */
    ActionBarMenuItem f79035z2;

    /* renamed from: o2 */
    final Runnable f79024o2 = new RunnableC15299b();

    /* renamed from: r2 */
    private final Map f79027r2 = new HashMap();

    /* renamed from: s2 */
    private final Map f79028s2 = new HashMap();

    /* renamed from: t2 */
    boolean f79029t2 = false;

    /* renamed from: B2 */
    boolean f78997B2 = false;

    /* renamed from: C2 */
    int f78998C2 = AbstractC16803z.stencils_ic_head_menu_white;

    /* renamed from: I2 */
    C17487o0.l f79004I2 = new C15305h();

    /* renamed from: J2 */
    View.OnClickListener f79005J2 = new ViewOnClickListenerC15306i();

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C15298a {

        /* renamed from: a */
        static final /* synthetic */ int[] f79036a;

        /* renamed from: b */
        static final /* synthetic */ int[] f79037b;

        static {
            int[] iArr = new int[C32541a.b.values().length];
            f79037b = iArr;
            try {
                iArr[C32541a.b.f150330v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79037b[C32541a.b.f150329u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79037b[C32541a.b.f150328t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC15308k.values().length];
            f79036a = iArr2;
            try {
                iArr2[EnumC15308k.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79036a[EnumC15308k.GRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f79036a[EnumC15308k.BLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$b */
    /* loaded from: classes6.dex */
    class RunnableC15299b implements Runnable {
        RunnableC15299b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserInfoView userInfoView = UserDetailsView.this.f79023n2;
                if (userInfoView != null) {
                    userInfoView.m86365d0();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$c */
    /* loaded from: classes6.dex */
    public class C15300c extends AbstractC7220t8 {
        C15300c() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$d */
    /* loaded from: classes6.dex */
    public class C15301d implements C8050a.s {
        C15301d() {
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.s
        /* renamed from: X2 */
        public void mo43356X2() {
            UserDetailsView.this.f79021l2.mo107694X2();
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.s
        /* renamed from: u0 */
        public void mo43357u0() {
            UserDetailsView.this.f79021l2.mo107729u0();
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.s
        /* renamed from: u1 */
        public void mo43358u1() {
            UserDetailsView userDetailsView = UserDetailsView.this;
            if (!userDetailsView.f77813M0 && userDetailsView.m92676n2() != null && !UserDetailsView.this.m92676n2().isFinishing() && !UserDetailsView.this.f72421L0.mo60294yp()) {
                UserDetailsView.this.f79021l2.mo107730u1();
            }
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.s
        /* renamed from: w2 */
        public void mo43359w2() {
            UserDetailsView.this.f79021l2.mo107732w2();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$e */
    /* loaded from: classes6.dex */
    public class C15302e implements FeedBaseAdapter.InterfaceC8024b0 {
        C15302e() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: U2 */
        public void mo43247U2() {
            UserDetailsView.this.f79021l2.mo107690U2();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: V2 */
        public void mo43248V2() {
            UserDetailsView.this.f79021l2.mo107682Pf();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: W2 */
        public void mo43249W2(MultiStateView.EnumC15914e enumC15914e, int i11) {
            UserDetailsView.this.f79021l2.mo107668Ek(enumC15914e);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: X */
        public void mo43274X() {
            UserDetailsView.this.f79021l2.mo107693X();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: X2 */
        public void mo43250X2() {
            UserDetailsView.this.f79021l2.mo107672Jn();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: Y */
        public void mo43275Y(String str, String str2) {
            AbstractC28207v1.m141994i3(str, 4, UserDetailsView.this.f72421L0.m92676n2(), UserDetailsView.this.f72421L0, str2, new C31877d());
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: Y2 */
        public void mo43251Y2(String str) {
            TextView textView = UserDetailsView.this.f79011b2;
            if (textView != null) {
                textView.setText(str);
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: Z */
        public String mo43276Z() {
            return "";
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: a0 */
        public void mo43277a0(C23927b c23927b) {
            UserDetailsView.this.f79021l2.mo107648Vf(c23927b);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            UserDetailsView.this.f79021l2.mo107722s(c3054x);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
            UserDetailsView.this.f79021l2.mo107728u();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
            UserDetailsView.this.f73260P0 = z11;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
            UserDetailsView.this.m82970ZN(view);
            View view2 = UserDetailsView.this.f79012c2;
            if (view2 != null && view2 != view.findViewById(view2.getId())) {
                UserDetailsView userDetailsView = UserDetailsView.this;
                userDetailsView.f79012c2 = null;
                userDetailsView.f79030u2 = view;
                InterfaceC20653a2 interfaceC20653a2 = userDetailsView.f79021l2;
                interfaceC20653a2.mo107723s5(interfaceC20653a2.mo107696Ya());
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
            UserDetailsView.this.f76212o1.setSwipeRefreshEnable(!z11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
            AbstractC27354b.m140049a(UserDetailsView.this.f76178L1, c3000l0);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
            UserDetailsView.this.f79021l2.mo107641E();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8024b0
        /* renamed from: z0 */
        public void mo43252z0(C31902e9 c31902e9, ContactProfile contactProfile, String str) {
            UserDetailsView.this.m86155XO(c31902e9, contactProfile, str);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$f */
    /* loaded from: classes6.dex */
    public class C15303f extends RecyclerView.AbstractC1892s {
        C15303f() {
        }

        /* renamed from: g */
        public /* synthetic */ void m86297g() {
            UserDetailsView.this.m82934ON();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11 = true;
            try {
                if (i11 == 0) {
                    UserDetailsView.this.f76215r1.m43223b0(false);
                } else {
                    UserDetailsView.this.f76215r1.m43223b0(true);
                    UserDetailsView.this.f76212o1.m88202K();
                }
                UserDetailsView userDetailsView = UserDetailsView.this;
                if (i11 == 0) {
                    z11 = false;
                }
                userDetailsView.m82964XN(z11);
                UserDetailsView.this.f76215r1.m43285D0(recyclerView, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C20040b.b bVar;
            boolean z11;
            try {
                int m9740Y1 = UserDetailsView.this.f76214q1.m9740Y1();
                int m9745c2 = UserDetailsView.this.f76214q1.m9745c2();
                int m10110a = UserDetailsView.this.f76214q1.m10110a();
                int m10127i = UserDetailsView.this.f76214q1.m10127i();
                if (UserDetailsView.this.m82994nN()) {
                    UserDetailsView userDetailsView = UserDetailsView.this;
                    if (i12 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    userDetailsView.m82968YN(z11);
                }
                UserDetailsView userDetailsView2 = UserDetailsView.this;
                userDetailsView2.m82929JN(userDetailsView2.f79028s2, UserDetailsView.this.f79027r2);
                if (m9740Y1 >= 10) {
                    UserDetailsView.this.m82974cO();
                }
                if (UserDetailsView.this.f79021l2.mo107673Kf() != null && !UserDetailsView.this.f79021l2.mo107673Kf().m40387S0()) {
                    if (m9745c2 >= m10127i - 5 && UserDetailsView.this.f79021l2.mo107653m3() != 1) {
                        UserDetailsView.this.f79021l2.mo107675L3();
                    }
                    UserDetailsView userDetailsView3 = UserDetailsView.this;
                    C8050a c8050a = userDetailsView3.f76215r1;
                    if (userDetailsView3.m82996oN()) {
                        bVar = C20040b.b.f98513p;
                    } else {
                        bVar = C20040b.b.f98514q;
                    }
                    c8050a.m43284C0(recyclerView, m9740Y1, m10110a, bVar);
                    UserDetailsView.this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.e11
                        public /* synthetic */ e11() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            UserDetailsView.C15303f.this.m86297g();
                        }
                    });
                }
                if (m10110a > 0) {
                    UserDetailsView.this.m82930KM();
                }
                ProfileBaseView.RunnableC14795j runnableC14795j = UserDetailsView.this.f76183Q1;
                if (runnableC14795j != null) {
                    runnableC14795j.m83008a();
                }
                if (i12 != 0) {
                    UserDetailsView.this.removeDialog(26);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$g */
    /* loaded from: classes6.dex */
    public class C15304g extends AnimatorListenerAdapter {
        C15304g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                UserDetailsView.this.f79008Y1.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$h */
    /* loaded from: classes6.dex */
    class C15305h implements C17487o0.l {
        C15305h() {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            UserDetailsView.this.m86140IO(zaloView);
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            UserDetailsView.this.m86139FO(zaloView);
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$i */
    /* loaded from: classes6.dex */
    class ViewOnClickListenerC15306i implements View.OnClickListener {
        ViewOnClickListenerC15306i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserDetailsView.this.f79021l2.mo107709hc();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$j */
    /* loaded from: classes6.dex */
    public class C15307j implements AbstractC22055v0.g {
        C15307j() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (UserDetailsView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(str);
                UserDetailsView userDetailsView = UserDetailsView.this;
                userDetailsView.mo86205BA(userDetailsView.f79021l2.mo107696Ya());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UserDetailsView$k */
    /* loaded from: classes6.dex */
    public enum EnumC15308k {
        NORMAL,
        GRAY,
        BLACK
    }

    /* renamed from: DP */
    private void m86137DP() {
        this.f76212o1.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.c11
            public /* synthetic */ c11() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                UserDetailsView.this.m86197wP();
            }
        });
    }

    /* renamed from: EO */
    public void m86138EO() {
        try {
            this.f79008Y1.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f79008Y1, "scaleX", 1.0f, 1.4f));
            arrayList.add(ObjectAnimator.ofFloat(this.f79008Y1, "scaleY", 1.0f, 1.4f));
            arrayList.add(ObjectAnimator.ofFloat(this.f79008Y1, "alpha", 1.0f, 0.0f));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(500L);
            animatorSet.addListener(new C15304g());
            animatorSet.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FO */
    public void m86139FO(ZaloView zaloView) {
        try {
            C17487o0 m92649TI = m92649TI();
            if (m92649TI != null && AbstractC20826v0.m108782R0(zaloView) && m92649TI.m92999F0() + m92649TI.m93018M0() == 1) {
                this.f79021l2.mo107716o1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IO */
    public void m86140IO(ZaloView zaloView) {
        try {
            C17487o0 m92649TI = m92649TI();
            if (m92649TI != null && AbstractC20826v0.m108784S0(zaloView) && m92649TI.m92999F0() + m92649TI.m93018M0() == 0) {
                this.f79021l2.mo107704e3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JO */
    private void m86141JO() {
        try {
            CustomMovementMethod.m56305e().m56309d();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KO */
    private KeyEventCallbackC17462c m86142KO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b());
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: LO */
    private KeyEventCallbackC17462c m86143LO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3038t.f12242f).m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b()).m43170s(c3038t.f12241e, this);
        return aVar.m43152a();
    }

    /* renamed from: MO */
    private KeyEventCallbackC17462c m86144MO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3038t.f12242f).m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, this).m43170s(c3038t.f12241e, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: NO */
    private KeyEventCallbackC17462c m86145NO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(c3038t.f12238b).m43159h(c3038t.f12242f).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b()).m43170s(c3038t.f12241e, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        return m43152a;
    }

    /* renamed from: OO */
    private KeyEventCallbackC17462c m86146OO(C3038t c3038t) {
        if (!(c3038t instanceof C3042u)) {
            return null;
        }
        C3042u c3042u = (C3042u) c3038t;
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3042u.f12242f).m43162k(c3042u.f12239c).m43165n(c3042u.f12240d, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.d11
            public /* synthetic */ d11() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                UserDetailsView.this.m86161eP(interfaceC17463d, i11);
            }
        }).m43170s(c3038t.f12241e, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.l01
            public /* synthetic */ l01() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                UserDetailsView.this.m86163fP(interfaceC17463d, i11);
            }
        });
        this.f79032w2 = null;
        if (c3042u.f12258h) {
            try {
                if (!TextUtils.isEmpty(c3042u.f12257g.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_user_profile")) {
                    View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
                    this.f79032w2 = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
                    C31901e8 m2800f = AbstractC0906d0.m2800f(this.f72421L0.getContext(), c3042u.f12257g.f42455y);
                    if (m2800f != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                        String format = String.format("%s (%s)", m2800f.m153299q(), m2800f.m153297j());
                        String format2 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phone_number_in_contact), format);
                        int indexOf = format2.indexOf(format);
                        SpannableString spannableString = new SpannableString(format2);
                        spannableString.setSpan(new StyleSpan(1), indexOf, format.length() + indexOf, 33);
                        ((TextView) inflate.findViewById(AbstractC6918a0.tvRemoveContact)).setText(spannableString);
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.m01
                            public /* synthetic */ m01() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                UserDetailsView.this.m86165gP(view);
                            }
                        });
                        aVar.m43177z(inflate);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: PO */
    private KeyEventCallbackC17462c m86147PO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(c3038t.f12238b).m43173v(2).m43159h(c3038t.f12242f).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b()).m43170s(c3038t.f12241e, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(true);
        return m43152a;
    }

    /* renamed from: QO */
    private void m86148QO() {
        this.f79028s2.clear();
        this.f79028s2.put(Integer.valueOf(AbstractC6918a0.menu_call), Integer.valueOf(AbstractC16803z.icn_header_voicecall_white));
        this.f79028s2.put(Integer.valueOf(AbstractC6918a0.menu_call_video), Integer.valueOf(AbstractC16803z.btn_videocall_white));
        this.f79028s2.put(Integer.valueOf(AbstractC6918a0.menu_privacy_quick_setting), Integer.valueOf(AbstractC16803z.ic_privacy_quick_setting_white));
        this.f79028s2.put(Integer.valueOf(AbstractC6918a0.menu_drawer), Integer.valueOf(AbstractC16803z.ic_more_24_white));
    }

    /* renamed from: RO */
    private KeyEventCallbackC17462c m86149RO(C3038t c3038t) {
        if (!(c3038t instanceof C3050w)) {
            return null;
        }
        C3050w c3050w = (C3050w) c3038t;
        return new C2913t1(getContext()).m13864d(c3050w.f12298g, c3050w.f12299h).m13865e(new C2913t1.c() { // from class: com.zing.zalo.ui.zviews.k01
            public /* synthetic */ k01() {
            }

            @Override // bn.C2913t1.c
            /* renamed from: b */
            public final void mo13055b(int i11, String str, boolean z11) {
                UserDetailsView.this.m86167hP(i11, str, z11);
            }
        }).m13862b(c3050w.f12300i, c3050w.f12241e, c3050w.f12240d).m13861a();
    }

    /* renamed from: SO */
    private KeyEventCallbackC17462c m86150SO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3038t.f12242f).m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, this).m43170s(c3038t.f12241e, new InterfaceC17463d.b());
        return aVar.m43152a();
    }

    /* renamed from: TO */
    private KeyEventCallbackC17462c m86151TO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3038t.f12242f).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b()).m43170s(c3038t.f12241e, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: UO */
    private KeyEventCallbackC17462c m86152UO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(c3038t.f12242f).m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43170s(c3038t.f12241e, this);
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: VO */
    private KeyEventCallbackC17462c m86153VO(C3038t c3038t) {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(c3038t.f12238b).m43162k(c3038t.f12239c).m43165n(c3038t.f12240d, new InterfaceC17463d.b());
        C8009j m43152a = aVar.m43152a();
        m43152a.m92873y(false);
        return m43152a;
    }

    /* renamed from: WO */
    private void m86154WO() {
        this.f79027r2.clear();
        this.f79027r2.put(Integer.valueOf(AbstractC6918a0.menu_call), Integer.valueOf(AbstractC16803z.ic_call_24_black));
        this.f79027r2.put(Integer.valueOf(AbstractC6918a0.menu_call_video), Integer.valueOf(AbstractC16803z.ic_video_24_black));
        this.f79027r2.put(Integer.valueOf(AbstractC6918a0.menu_privacy_quick_setting), Integer.valueOf(AbstractC16803z.ic_privacy_quick_setting_black));
        this.f79027r2.put(Integer.valueOf(AbstractC6918a0.menu_drawer), Integer.valueOf(AbstractC16803z.ic_more_24_black));
    }

    /* renamed from: XO */
    public void m86155XO(C31902e9 c31902e9, ContactProfile contactProfile, String str) {
        this.f79021l2.mo107737z0(c31902e9, contactProfile, str);
    }

    /* renamed from: YO */
    private void m86156YO() {
        int i11 = AbstractC32226c.m155411j(m92676n2()).top;
        int dimensionPixelSize = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        if (!AbstractC32226c.m155415n(m92676n2())) {
            i11 = 0;
        }
        this.f76194W0 = dimensionPixelSize + i11;
        this.f76196Y0 = 0;
    }

    /* renamed from: ZO */
    private void m86157ZO() {
        TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) this.f88760a0.m92717l(AbstractC7409c0.profile_avatar_layout);
        this.f76207j1 = trackingRelativeLayout;
        Avatar avatar = (Avatar) trackingRelativeLayout.findViewById(AbstractC6918a0.imvAvatar);
        this.f76208k1 = avatar;
        avatar.m90481x(m92689tK(), EnumC16949e.SIZE_32);
        this.f76207j1.setIdTracking("social_profile_mini_avatar");
        this.f76207j1.setTrackingExtraData(m82932MM(this.f79021l2.mo107696Ya()));
        ((FrameRoundedLayout) this.f76207j1.findViewById(AbstractC6918a0.rounded_avatar_frame)).setBackground(AbstractC1388a.m6964f(m92689tK(), AbstractC17466e.transparent));
        m82972aO();
    }

    /* renamed from: aP */
    private void m86158aP() {
        if (this.f78999D2 == null) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.layout_avatar_action_bar, (ViewGroup) null);
            this.f78999D2 = linearLayout;
            CircleImage circleImage = (CircleImage) linearLayout.findViewById(AbstractC6918a0.imvAvatar);
            this.f79000E2 = circleImage;
            circleImage.setEnableRoundPadding(false);
            this.f79001F2 = (RobotoTextView) this.f78999D2.findViewById(AbstractC6918a0.tvTitle);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(AbstractC23136l9.m118742r(56.0f), 0, AbstractC23136l9.m118742r(40.0f), 0);
            layoutParams.gravity = 16;
            this.f88760a0.addView(this.f78999D2, layoutParams);
        }
    }

    /* renamed from: bP */
    private void m86159bP() {
        this.f79002G2 = (LinearLayout) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layout_oa_warming);
    }

    /* renamed from: cP */
    private void m86160cP(String str) {
        this.f76213p1 = this.f76212o1.f83582p0;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f76214q1 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f76213p1.setLayoutManager(this.f76214q1);
        this.f76213p1.setBackgroundResource(AbstractC16803z.rectangle_transparent);
        this.f76213p1.setOverScrollMode(2);
        C8050a c8050a = new C8050a(this.f72421L0.m92648SI(), this.f76184R0);
        this.f76215r1 = c8050a;
        c8050a.m43222a0(str);
        this.f76215r1.m43218W(this);
        this.f76215r1.m43219X(this);
        this.f76215r1.m43225d0(this);
        if (C22013a0.m114928g()) {
            this.f76215r1.m43224c0(this.f76189T1, new C15300c());
        }
        this.f76215r1.f43972c0 = new C8050a.g() { // from class: com.zing.zalo.ui.zviews.n01
            public /* synthetic */ n01() {
            }

            @Override // com.zing.zalo.feed.adapters.C8050a.g
            /* renamed from: a */
            public final boolean mo43330a() {
                boolean m86177mP;
                m86177mP = UserDetailsView.this.m86177mP();
                return m86177mP;
            }
        };
        this.f76215r1.m43293L0(new C15301d());
        this.f76215r1.m43220Y(new C15302e());
        m82936PN();
        this.f76215r1.m43298h0(new ArrayList(), new ArrayList());
        this.f76213p1.setVisibility(0);
        this.f76213p1.setVerticalScrollBarEnabled(false);
        this.f76213p1.setAdapter(this.f76215r1);
        this.f76213p1.m9837K1(0);
        this.f76213p1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.o01
            public /* synthetic */ o01() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                UserDetailsView.this.m86179nP(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        this.f76213p1.m9826E(new C15303f());
    }

    /* renamed from: eP */
    public /* synthetic */ void m86161eP(InterfaceC17463d interfaceC17463d, int i11) {
        this.f79021l2.mo107662Ah(interfaceC17463d, i11);
        if (this.f79032w2 != null) {
            AbstractC23647d.m123906p("300018202");
            AbstractC23647d.m123893c();
        } else {
            AbstractC23647d.m123906p("300018204");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: fP */
    public /* synthetic */ void m86163fP(InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        try {
            this.f79021l2.mo107662Ah(interfaceC17463d, i11);
            InterfaceC20653a2 interfaceC20653a2 = this.f79021l2;
            CheckBox checkBox = this.f79032w2;
            if (checkBox != null && checkBox.isChecked()) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC20653a2.mo107674Km(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gP */
    public /* synthetic */ void m86165gP(View view) {
        CheckBox checkBox = this.f79032w2;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* renamed from: hP */
    public /* synthetic */ void m86167hP(int i11, String str, boolean z11) {
        this.f79021l2.mo107736yg(i11, str, z11);
    }

    /* renamed from: iP */
    public /* synthetic */ void m86169iP() {
        this.f79021l2.mo107684S7();
    }

    /* renamed from: jP */
    public /* synthetic */ void m86171jP() {
        this.f79021l2.mo107727tc();
    }

    /* renamed from: kP */
    public /* synthetic */ void m86173kP() {
        this.f79021l2.mo107666E1();
    }

    /* renamed from: lP */
    public /* synthetic */ void m86175lP(String str, String str2) {
        AbstractC28207v1.m141994i3(str, 0, m92676n2(), this.f72421L0, str2, null);
    }

    /* renamed from: mP */
    public /* synthetic */ boolean m86177mP() {
        AbstractC11859g abstractC11859g = this.f76177K1;
        if (abstractC11859g != null && abstractC11859g.m114868x()) {
            return true;
        }
        return false;
    }

    /* renamed from: nP */
    public /* synthetic */ void m86179nP(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        m82929JN(this.f79028s2, this.f79027r2);
    }

    /* renamed from: oP */
    public static /* synthetic */ String m86181oP(Boolean bool) {
        return "Receive loading state: " + bool;
    }

    /* renamed from: pP */
    public /* synthetic */ void m86183pP(Boolean bool) {
        if (bool.booleanValue()) {
            mo46829Y();
        } else {
            mo49315c4();
        }
        C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_USER_DETAILS_VIEW", new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.s01

            /* renamed from: p */
            public final /* synthetic */ Boolean f81874p;

            public /* synthetic */ s01(Boolean bool2) {
                r1 = bool2;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                String m86181oP;
                m86181oP = UserDetailsView.m86181oP(r1);
                return m86181oP;
            }
        });
    }

    /* renamed from: qP */
    public static /* synthetic */ String m86185qP(C32541a.d dVar) {
        return "Receive setting result: " + dVar.toString();
    }

    /* renamed from: rP */
    public /* synthetic */ void m86187rP(C19964c c19964c) {
        C32541a.d dVar = (C32541a.d) c19964c.m103749a();
        if (dVar != null) {
            int i11 = C15298a.f79037b[dVar.m157551a().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        this.f79021l2.mo107686Si();
                    }
                } else {
                    this.f79021l2.mo107679Ni();
                }
            } else {
                this.f79021l2.mo107705ed();
            }
            C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_USER_DETAILS_VIEW", new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.q01
                public /* synthetic */ q01() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m86185qP;
                    m86185qP = UserDetailsView.m86185qP(C32541a.d.this);
                    return m86185qP;
                }
            });
        }
    }

    /* renamed from: sP */
    public /* synthetic */ void m86189sP() {
        if (!AbstractC23304d.f113385g) {
            AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
        }
    }

    /* renamed from: tP */
    public /* synthetic */ void m86191tP(String str) {
        ToastUtils.showMess(str);
        AbstractC20276f.m105891d(this.f79007X1, 1.2f, 200L, false);
    }

    /* renamed from: uP */
    public /* synthetic */ void m86193uP() {
        Avatar avatar = this.f76199b1;
        if (avatar != null) {
            avatar.setStateLoadingStory(false);
        }
        Avatar avatar2 = this.f76208k1;
        if (avatar2 != null) {
            avatar2.setStateLoadingStory(false);
        }
    }

    /* renamed from: vP */
    public /* synthetic */ void m86195vP() {
        try {
            this.f79021l2.mo107656qb();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wP */
    public /* synthetic */ void m86197wP() {
        this.f79021l2.mo107703e();
    }

    /* renamed from: xP */
    private void m86199xP() {
        m86201yP();
        m86203zP();
    }

    /* renamed from: yP */
    private void m86201yP() {
        this.f79026q2.m157542b0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.p01
            public /* synthetic */ p01() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                UserDetailsView.this.m86183pP((Boolean) obj);
            }
        });
    }

    /* renamed from: zP */
    private void m86203zP() {
        this.f79026q2.m157540Z().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.a11
            public /* synthetic */ a11() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                UserDetailsView.this.m86187rP((C19964c) obj);
            }
        });
    }

    /* renamed from: AP */
    public KeyEventCallbackC17462c m86204AP(C3038t c3038t) {
        int i11 = c3038t.f12237a;
        if (i11 != 7) {
            if (i11 != 18) {
                if (i11 != 25) {
                    if (i11 != 9) {
                        if (i11 != 10) {
                            if (i11 != 22) {
                                if (i11 != 23) {
                                    switch (i11) {
                                        case 13:
                                            return m86145NO(c3038t);
                                        case 14:
                                            return m86147PO(c3038t);
                                        case 15:
                                            return m86143LO(c3038t);
                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                            return m86142KO(c3038t);
                                        default:
                                            return null;
                                    }
                                }
                                return m86150SO(c3038t);
                            }
                            return m86152UO(c3038t);
                        }
                        return m86144MO(c3038t);
                    }
                    return m86149RO(c3038t);
                }
                return m86151TO(c3038t);
            }
            return m86153VO(c3038t);
        }
        return m86146OO(c3038t);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: BA */
    public void mo86205BA(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        Avatar avatar = this.f76199b1;
        boolean z14 = false;
        if (avatar != null) {
            if (m115161u != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (m115161u != null && !m115161u.f147026s) {
                z13 = true;
            } else {
                z13 = false;
            }
            avatar.m90482y(z12, z13);
        }
        Avatar avatar2 = this.f76208k1;
        if (avatar2 != null) {
            if (m115161u != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m115161u != null && !m115161u.f147026s) {
                z14 = true;
            }
            avatar2.m90482y(z11, z14);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: BI */
    public void mo86206BI(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        Avatar avatar = this.f76199b1;
        boolean z14 = false;
        if (avatar != null) {
            if (m115161u != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (m115161u != null && !m115161u.f147026s) {
                z13 = true;
            } else {
                z13 = false;
            }
            avatar.m90482y(z12, z13);
        }
        Avatar avatar2 = this.f76208k1;
        if (avatar2 != null) {
            if (m115161u != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m115161u != null && !m115161u.f147026s) {
                z14 = true;
            }
            avatar2.m90482y(z11, z14);
        }
    }

    /* renamed from: BP */
    public void m86207BP(String str) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 1100, 0, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Bh */
    public void mo86208Bh(boolean z11, boolean z12, boolean z13, boolean z14) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86376vM(z11);
            this.f79023n2.m86371qM(z12);
            this.f79023n2.m86372rM(z13);
            this.f79023n2.m86373sM(z14);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        C25470c m131954b;
        super.mo37111CJ(bundle);
        m86156YO();
        C20765w2 c20765w2 = new C20765w2(this);
        this.f79021l2 = c20765w2;
        c20765w2.mo995Nd(C20661b4.m107748a(m92642L3()), null);
        if (bundle != null && (i11 = bundle.getInt("extra_presenter_key", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            this.f79021l2.mo107698b(m131954b);
        }
        if (m92649TI() != null) {
            m92649TI().m93092y(this.f79004I2);
        }
        try {
            if (AbstractC21935u.m114558y(this.f79021l2.mo107696Ya())) {
                C0697c0.Companion.m1052f(this, ZinstantMetaConstant.IMPRESSION_META_TYPE, "friend_profile");
            } else {
                C0697c0.Companion.m1052f(this, ZinstantMetaConstant.IMPRESSION_META_TYPE, "stranger_profile");
            }
            TrackingSource m154380z = C32017m4.m154326S().m154380z(this.f79021l2.mo107651g());
            C0697c0.b bVar = C0697c0.Companion;
            bVar.m1050d(this, "tracking_source", m154380z.m40683t());
            bVar.m1052f(this, "source_params", m154380z.m40682o());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        C32541a c32541a = (C32541a) new C1802w0(this, new C32541a.a()).m9378a(C32541a.class);
        this.f79026q2 = c32541a;
        c32541a.m157538X(mo82938QM());
        m86199xP();
        m86154WO();
        m86148QO();
    }

    /* renamed from: CP */
    public void m86209CP(boolean z11) {
        int i11;
        TextView textView = this.f79013d2;
        if (textView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: D8 */
    public void mo86210D8(String str) {
        AbstractC32542b.m157587b(this.f79026q2, str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return m86204AP(this.f79031v2);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Dh */
    public void mo86211Dh(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else {
                        Context m92648SI = this.f72421L0.m92648SI();
                        String[] strArr = AbstractC23034c6.f112033j;
                        if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                            AbstractC23034c6.m118184v0(this, strArr, 113);
                        } else {
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, true, 18));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Ds */
    public void mo86212Ds(boolean z11) {
        int i11;
        View view = this.f79012c2;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 26 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    /* renamed from: EP */
    protected void m86213EP(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("fromMyProfile", false);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Ej */
    public void mo86214Ej(ContactProfile contactProfile, String str) {
        String str2;
        String str3 = "";
        if (contactProfile == null) {
            str2 = "";
        } else {
            str2 = contactProfile.f42437s;
        }
        if (contactProfile != null) {
            str3 = contactProfile.f42446v;
        }
        FeedActionZUtils.m47532T(str, str2, str3, m92676n2(), null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            if (this.f79021l2.mo107721rc()) {
                actionBarMenu.m92750r();
                return;
            }
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_call, AbstractC16803z.icn_header_voicecall_white);
            this.f79034y2 = m92738e;
            AbstractC23136l9.m118744r1(m92738e, 8);
            ActionBarMenuItem m92738e2 = actionBarMenu.m92738e(AbstractC6918a0.menu_call_video, AbstractC16803z.btn_videocall_white);
            this.f79035z2 = m92738e2;
            AbstractC23136l9.m118744r1(m92738e2, 8);
            ActionBarMenuItem m92738e3 = actionBarMenu.m92738e(AbstractC6918a0.menu_privacy_quick_setting, AbstractC16803z.ic_privacy_quick_setting_white);
            this.f78996A2 = m92738e3;
            AbstractC23136l9.m118744r1(m92738e3, 8);
            this.f79033x2 = actionBarMenu.m92738e(AbstractC6918a0.menu_drawer, AbstractC16803z.stencils_ic_head_menu_white);
            this.f79021l2.mo107719pd();
            ArrayList arrayList = new ArrayList();
            this.f76180N1 = arrayList;
            arrayList.add(this.f79034y2);
            this.f76180N1.add(this.f79035z2);
            this.f76180N1.add(this.f78996A2);
            this.f76180N1.add(this.f79033x2);
        }
    }

    /* renamed from: FP */
    public void m86215FP(String str) {
        boolean z11 = false;
        if (C19172a.m100600k("profile@friends_avatar@open_on_click", 0) != 1) {
            z11 = true;
        }
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (m115161u == null && C23302b.f113247a.m120523d(this.f79021l2.mo107689Te())) {
            this.f79021l2.mo107724t0();
            return;
        }
        if (m115161u == null) {
            this.f79021l2.mo107724t0();
            return;
        }
        if (!m115161u.f147026s) {
            if (z11) {
                mo86264k2(str);
                return;
            } else {
                m86207BP(str);
                return;
            }
        }
        m86207BP(str);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Fn */
    public void mo86216Fn(String str, String str2) {
        Handler handler;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (handler = this.f76193V1) != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.z01

                    /* renamed from: q */
                    public final /* synthetic */ String f82794q;

                    /* renamed from: r */
                    public final /* synthetic */ String f82795r;

                    public /* synthetic */ z01(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserDetailsView.this.m86175lP(r2, r3);
                    }
                }, 250L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f76184R0 = new C23528a(this.f72421L0.m92648SI());
        return layoutInflater.inflate(AbstractC7409c0.material_user_details_view, (ViewGroup) null);
    }

    /* renamed from: GO */
    public void m86217GO(AbstractC1785o.a aVar) {
        ZaloView zaloView;
        boolean z11;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93012K0();
        } else {
            zaloView = null;
        }
        if (m92662fJ != null && !m92662fJ.m93026P(this)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m92662fJ != null && zaloView != null && !z11) {
            if (((aVar == AbstractC1785o.a.ON_PAUSE && (zaloView instanceof ZaloView.InterfaceC17421f)) || aVar == AbstractC1785o.a.ON_STOP) && AbstractC20826v0.m108782R0(zaloView) && zaloView.m92687sJ()) {
                this.f79021l2.mo107681P0();
                return;
            }
            return;
        }
        this.f79021l2.mo107681P0();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Gf */
    public void mo86218Gf(String str, String str2) {
        try {
            this.f76195X0 = (int) (AbstractC23136l9.m118713h0() * 0.5f);
            m86160cP(str);
            m86159bP();
            RecyclingImageView recyclingImageView = (RecyclingImageView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.cover_image);
            this.f76197Z0 = recyclingImageView;
            ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
            layoutParams.height = this.f76195X0;
            RecyclingImageView recyclingImageView2 = this.f76197Z0;
            if (recyclingImageView2 != null) {
                recyclingImageView2.setLayoutParams(layoutParams);
            }
            View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.top_profile_cover_gradient);
            this.f79020k2 = findViewById;
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.height = this.f76194W0;
            this.f79020k2.setLayoutParams(layoutParams2);
            this.f79019j2 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.profile_cover_gradient);
            Avatar avatar = (Avatar) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.imvAvatar);
            this.f76199b1 = avatar;
            avatar.m90481x(m92689tK(), EnumC16949e.SIZE_128);
            TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layoutAvatar);
            this.f76203f1 = trackingRelativeLayout;
            trackingRelativeLayout.setIdTracking("social_profile_avatar");
            this.f76203f1.setTrackingExtraData(m82932MM(this.f79021l2.mo107696Ya()));
            this.f76203f1.setOnClickListener(this);
            this.f76198a1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.info_background);
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(str2);
            }
            View findViewById2 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.profile_bottom_functions_layout);
            this.f79018i2 = findViewById2;
            findViewById2.setBackgroundResource(AbstractC17466e.transparent);
            this.f76183Q1.f76246q = this.f79006W1;
            m82982hN();
            this.f79016g2 = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tvUnreadMes_ob);
            this.f79017h2 = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tvUnreadMes_tb);
            RelativeLayout relativeLayout = (RelativeLayout) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layoutUserFunction);
            this.f79006W1 = relativeLayout;
            relativeLayout.setVisibility(8);
            this.f79007X1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layoutSendMessage);
            this.f79008Y1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.bg_anim_send);
            this.f79007X1.findViewById(AbstractC6918a0.tvSendMes_ob).setOnClickListener(this);
            View findViewById3 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layoutUnBlock);
            this.f79009Z1 = findViewById3;
            findViewById3.setOnClickListener(this);
            m86137DP();
            mo82973bO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HO */
    void m86219HO() {
        C3000l0 c3000l0;
        try {
            if (this.f76215r1 != null && this.f76213p1 != null) {
                int m9740Y1 = this.f76214q1.m9740Y1();
                int m9745c2 = this.f76214q1.m9745c2();
                if (m9740Y1 >= 0 && m9740Y1 < m9745c2) {
                    while (m9740Y1 <= m9745c2) {
                        C2966e1 m43214Q = this.f76215r1.m43214Q(m9740Y1);
                        if (m43214Q != null && (c3000l0 = m43214Q.f11703a) != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().f12058q == 6) {
                            this.f76215r1.m10008p();
                        }
                        m9740Y1++;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: IC */
    public void mo86220IC(SpannableString spannableString) {
        if (spannableString != null) {
            this.f79015f2.f138000v.setVisibility(0);
            this.f79015f2.f137991D.setText(spannableString, TextView.BufferType.SPANNABLE);
            this.f79015f2.f137991D.setHighlightColor(0);
            this.f79015f2.f137991D.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.f79015f2.f138000v.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            this.f79021l2.mo994F2();
            C8050a c8050a = this.f76215r1;
            if (c8050a != null) {
                c8050a.m43299i0();
                this.f76215r1.m43300j0();
                this.f76215r1 = null;
            }
            C23528a c23528a = this.f76184R0;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f76184R0 = null;
            }
            m86141JO();
            C8050a c8050a2 = this.f76215r1;
            if (c8050a2 != null) {
                c8050a2.m43312y0();
            }
            if (m92649TI() != null) {
                m92649TI().m93008I1(this.f79004I2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: In */
    public void mo86221In(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f79035z2;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: JM */
    public boolean mo82928JM(C28212v6 c28212v6) {
        String str = c28212v6.f131577c;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1976499092:
                if (str.equals("tip.profile.setting.noti")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1487605799:
                if (str.equals("tip.profile.rightmenu.setalias")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1050871498:
                if (str.equals("tip.profile.privacyshortcut")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return this.f79021l2.mo107678Ml();
            case 1:
                return this.f79021l2.mo107670F4();
            case 2:
                return this.f79021l2.mo107734x9();
            default:
                return super.mo82928JM(c28212v6);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        this.f79021l2.mo107662Ah(interfaceC17463d, i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.m124114c().m124117e(this, AbstractC26080o.a.f124275b);
        C23744a.m124114c().m124117e(this, 6042);
        C23744a.m124114c().m124117e(this, 6093);
        C23744a.m124114c().m124117e(this, 6097);
        super.mo40200KJ();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Kg */
    public void mo86222Kg(ContactProfile contactProfile, boolean z11, boolean z12) {
        C0815e1.m2075D().m2100V(new C23648e(23, "", 1, "social_profile_privacy_bottomsheet", new String[0]), false);
        BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting = new BottomSheetMenuBundleDataPrivacyQuickSetting();
        bottomSheetMenuBundleDataPrivacyQuickSetting.m45560e(contactProfile);
        bottomSheetMenuBundleDataPrivacyQuickSetting.m45561f(Boolean.valueOf(z11));
        bottomSheetMenuBundleDataPrivacyQuickSetting.m45559d(Boolean.valueOf(z12));
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(10);
        bottomSheetMenuBundleData.m45509j(bottomSheetMenuBundleDataPrivacyQuickSetting);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1007, 1, true);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Kv */
    public void mo86223Kv(ContactProfile contactProfile) {
        AbstractC23152n3.m119032a0(contactProfile, m92676n2());
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Kx */
    public void mo86224Kx(String str) {
        C23493c.m123315o(m92662fJ(), 2, str);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, iq.InterfaceC20712m
    /* renamed from: LF */
    public void mo82182LF(ImageView imageView, C23528a c23528a, String str, Bundle bundle, C20275e c20275e, int i11, C3020p0 c3020p0) {
        m86213EP(bundle);
        super.mo82182LF(imageView, c23528a, str, bundle, c20275e, i11, c3020p0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002c. Please report as an issue. */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: LM */
    protected void mo82183LM(C26209i c26209i, String str, C28212v6 c28212v6) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1976499092:
                if (str.equals("tip.profile.setting.noti")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1487605799:
                if (str.equals("tip.profile.rightmenu.setalias")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1050871498:
                if (str.equals("tip.profile.privacyshortcut")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                this.f79021l2.mo107683Pm();
                return;
            case 1:
                this.f79021l2.mo107706fn();
                return;
            case 2:
                this.f79021l2.mo107676Ll();
                this.f79021l2.mo107683Pm();
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        SwipeRefreshListView swipeRefreshListView;
        if (super.mo37488Li() && !mo86269mc() && !m86249dP() && !mo86262jC() && (swipeRefreshListView = this.f76212o1) != null && !swipeRefreshListView.m35363j()) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Mw */
    public void mo86225Mw(boolean z11) {
        int i11;
        RelativeLayout relativeLayout = this.f79006W1;
        if (relativeLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            relativeLayout.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: My */
    public void mo86226My(boolean z11) {
        int i11;
        View view = this.f79007X1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: NH */
    public void mo86227NH(ContactProfile contactProfile) {
        if (m92676n2() != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_CONTACT_PROFILE", contactProfile.m40373K());
            bundle.putInt("EXTRA_ENTRY_SCREEN", BottomSheetBlockView.EnumC11169b.f56204s.m58496c());
            m92676n2().mo35573l4(BottomSheetBlockView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: NN */
    protected void mo82184NN(C22033k0.g gVar) {
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Ne */
    public int mo86228Ne() {
        return this.f76194W0;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: OA */
    public void mo86229OA(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("data", str);
        bundle.putString("message", str2);
        this.f72421L0.m92662fJ().m93066i2(AcceptFriendView.class, bundle, 10099, 1, true);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: P5 */
    public void mo86230P5(String str, String str2) {
        int i11;
        int i12;
        try {
            LinearLayout linearLayout = this.f78999D2;
            if (linearLayout != null) {
                if (this.f79021l2.mo107715n7()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            CircleImage circleImage = this.f79000E2;
            if (circleImage != null) {
                ((C23528a) this.f76184R0.m123612r(circleImage)).m123619y(str2, C23278z2.m120143n(), 10);
            }
            RobotoTextView robotoTextView = this.f79001F2;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
            }
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (!this.f79021l2.mo107721rc() && !this.f79021l2.mo107715n7()) {
                    i11 = AbstractC16803z.trans;
                    actionBar.setBackgroundResource(i11);
                    this.f88760a0.setSubtitle("");
                }
                i11 = AbstractC16803z.stencil_bg_action_bar;
                actionBar.setBackgroundResource(i11);
                this.f88760a0.setSubtitle("");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: PM */
    protected Map mo82185PM() {
        return this.f79028s2;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Pw */
    public void mo11929Pw() {
        C17487o0 c17487o0;
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_mode", 3);
            bundle.putInt("extra_init_page", C21933s.m114404I().f107899Z.f108001g + 1);
            bundle.putString("extra_title_action_bar", AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_title));
            c17487o0.m93069k2(SuggestFriendDetailView.class, bundle, 1, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Q5 */
    public void mo86231Q5(int i11, boolean z11) {
        AbstractC23088h5.m118432m(this.f79016g2, i11, z11, null);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: QB */
    public void mo86232QB(C3038t c3038t) {
        this.f79031v2 = c3038t;
        showDialog(c3038t.f12237a);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        this.f79021l2.mo107713l(i11);
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: QM */
    protected C32002l4 mo82938QM() {
        return this.f79021l2.mo107651g();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: R4 */
    public boolean mo86233R4() {
        OADetailView oADetailView = this.f79003H2;
        if (oADetailView != null && oADetailView.m92674mJ() && this.f79003H2.m92687sJ()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f76215r1.m43282A0();
        try {
            AbstractC23304d.f113390h0 = "";
            C23744a.m124114c().m124117e(this, 6075);
            m86217GO(AbstractC1785o.a.ON_PAUSE);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: Re */
    public void mo82191Re(int i11, int i12) {
        ProfileMusicView profileMusicView = this.f76223z1;
        if (profileMusicView != null) {
            profileMusicView.setErrorCode(i12);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    return;
                }
            } else {
                if (this.f76223z1 != null && this.f79021l2.mo107688T0() != null) {
                    this.f76223z1.m44479e(i11, this.f79021l2.mo107688T0(), C32036n8.m154515e().m154520d(this.f79021l2.mo107696Ya(), this.f79021l2.mo107688T0().m129490f()));
                    return;
                }
                return;
            }
        }
        ProfileMusicView profileMusicView2 = this.f76223z1;
        if (profileMusicView2 != null) {
            profileMusicView2.m44479e(i11, null, false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            bundle.putInt("extra_presenter_key", C25471d.m131951c().m131953a(this.f79021l2.mo107701c()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: St */
    public void mo86234St(String str) {
        TextView textView = this.f79013d2;
        if (textView != null) {
            textView.setText(str);
        }
        m86209CP(!TextUtils.isEmpty(str));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            m86158aP();
            this.f79021l2.mo107712j1();
            m86157ZO();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, iq.InterfaceC20656b
    /* renamed from: Te */
    public void mo82950Te(boolean z11) {
        int i11;
        View view = this.f76167A1;
        if (view != null) {
            if (z11 && this.f79021l2.mo107636C6()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Tz */
    public void mo86235Tz(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        if (itemAlbumMobile != null) {
            AbstractC23647d.m123897g("7301");
            FeedActionZUtils.m47546d0(this.f72421L0.m92676n2(), this.f76184R0, itemAlbumMobile, 0, z11, mo82198WM().mo107651g());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            if (this.f79029t2) {
                this.f76213p1.m9837K1(0);
                this.f79029t2 = false;
            }
            this.f79021l2.mo107654pb();
            C23744a.m124114c().m124115b(this, 65);
            C23744a.m124114c().m124115b(this, 3001);
            C23744a.m124114c().m124115b(this, 5001);
            C23744a.m124114c().m124115b(this, 6028);
            C23744a.m124114c().m124115b(this, 3002);
            C23744a.m124114c().m124115b(this, 6020);
            C32017m4.m154326S().m154353b0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: V */
    public void mo82195V(int i11) {
        this.f79021l2.mo107691V(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: V1 */
    public void mo82196V1() {
        this.f79021l2.mo107692V1();
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        try {
            KeyEventCallbackC17462c keyEventCallbackC17462c = this.f76179M1;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                this.f76179M1.dismiss();
            }
            this.f76215r1.m43286E0();
            m86217GO(AbstractC1785o.a.ON_STOP);
            C23744a.m124114c().m124117e(this, 65);
            C23744a.m124114c().m124117e(this, 3001);
            C23744a.m124114c().m124117e(this, 5001);
            C23744a.m124114c().m124117e(this, 6028);
            C23744a.m124114c().m124117e(this, 3002);
            C23744a.m124114c().m124117e(this, 6020);
            this.f79021l2.mo107738z3();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: WM */
    InterfaceC20650a mo82198WM() {
        return this.f79021l2;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Xj */
    public void mo86236Xj(int i11, boolean z11) {
        AbstractC23088h5.m118432m(this.f79017h2, i11, z11, null);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Xq */
    public void mo86237Xq(C3563d c3563d) {
        if (!TextUtils.isEmpty(c3563d.f15094e)) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93603v);
            bundle.putInt("EXTRA_SOURCE_LINK", 270);
            bundle.putBoolean("use_subtitle", false);
            ZaloWebView.Companion.m87169D(m92662fJ(), c3563d.f15094e, bundle);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Yf */
    public void mo86238Yf(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, ContactProfile contactProfile, boolean z18, boolean z19, String str, boolean z21, boolean z22) {
        try {
            UserInfoView userInfoView = this.f79023n2;
            if (userInfoView != null) {
                userInfoView.m86376vM(z11);
                this.f79023n2.m86371qM(z12);
                this.f79023n2.m86372rM(z13);
                this.f79023n2.m86373sM(z14);
                this.f79023n2.m86375uM(z15);
                this.f79023n2.m86370pM(z16);
                this.f79023n2.m86374tM(z17);
                this.f79023n2.m86367js(z22);
                this.f79023n2.m86377wM(contactProfile, false, z19, str, z21);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ys */
    public void mo11942Ys(C3000l0 c3000l0, String str, boolean z11) {
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(4);
        bottomSheetMenuBundleData.m45507h(this.f79021l2.mo107644H9(c3000l0, z11));
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1007, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Context context;
        int i11;
        super.mo37125ZJ(view, bundle);
        if (C23212s8.m119603k()) {
            context = getContext();
            i11 = AbstractC16803z.profile_bg_action_bar;
        } else {
            context = getContext();
            i11 = AbstractC16803z.stencil_bg_action_bar;
        }
        this.f76206i1 = AbstractC23136l9.m118665N(context, i11);
        try {
            AbstractC23199r6.f112459a = false;
            View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.root_backgroundmain);
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.swipe_refresh_layout);
            this.f76212o1 = swipeRefreshListView;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setContainerViewSnackBar(findViewById);
                this.f76212o1.m35371s(false, 0, this.f76194W0);
                if (!TextUtils.isEmpty(this.f79021l2.mo107696Ya())) {
                    if (this.f79021l2.mo107696Ya().equalsIgnoreCase("null")) {
                    }
                }
                RecyclerView recyclerView = this.f76212o1.f83582p0;
                this.f76213p1 = recyclerView;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    return;
                }
                return;
            }
            this.f79021l2.mo107669F3();
            if (bundle != null) {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("OADetailView");
                if (m92996E0 != null && (m92996E0 instanceof OADetailView)) {
                    this.f79003H2 = (OADetailView) m92996E0;
                }
                ZaloView m92996E02 = this.f72421L0.m92649TI().m92996E0("UserInfoDetailView");
                if (m92996E02 != null && (m92996E02 instanceof UserInfoDetailView)) {
                    this.f79025p2 = (UserInfoDetailView) m92996E02;
                }
            }
            C13306b c13306b = this.f76185R1;
            if (c13306b != null) {
                c13306b.m74687C((ViewGroup) this.f72421L0.m92656bJ());
            }
            if (this.f79021l2.mo107673Kf() == null || (this.f79021l2.mo107673Kf() != null && !this.f79021l2.mo107673Kf().m40387S0())) {
                m82945SN(0);
            }
            this.f79029t2 = m92683qJ();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: Zc */
    public void mo86239Zc(C31874cb c31874cb) {
        C17487o0 c17487o0;
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        AbstractC23074g2.m118379e(c31874cb, c17487o0, 0, 3, 0, 0);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: aC */
    public void mo86240aC() {
        int i11;
        try {
            if (this.f79012c2 == null) {
                View view = this.f79030u2;
                if (view == null) {
                    view = this.f72421L0.m92656bJ();
                }
                this.f79030u2 = null;
                if (ZaloListView.m86975fN()) {
                    i11 = AbstractC6918a0.viewstubFriendRequestVer3;
                } else {
                    i11 = AbstractC6918a0.viewstubFriendRequest;
                }
                ((ViewStub) view.findViewById(i11)).setVisibility(0);
                View findViewById = view.findViewById(AbstractC6918a0.layoutFriendRequest);
                this.f79012c2 = findViewById;
                C29833h5 m148027a = C29833h5.m148027a(findViewById);
                this.f79015f2 = m148027a;
                m148027a.f137995q.setOnClickListener(this);
                this.f79015f2.f137996r.setOnClickListener(this);
                C29833h5 c29833h5 = this.f79015f2;
                this.f79013d2 = c29833h5.f137988A;
                this.f79014e2 = c29833h5.f137989B;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: aN */
    protected String[] mo82205aN() {
        return AbstractC28025b8.f130857n;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: an */
    public void mo86241an(ContactProfile contactProfile) {
        if (contactProfile != null) {
            if (this.f79025p2 == null) {
                this.f79025p2 = new UserInfoDetailView();
                Bundle bundle = new Bundle();
                bundle.putString("extra_contact_uid", contactProfile.f42434r);
                this.f79025p2.mo60305zK(bundle);
            }
            this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.root_backgroundmain, this.f79025p2, 0, "UserInfoDetailView", 1, false);
            if (contactProfile.m40387S0()) {
                AbstractC23647d.m123906p("8210");
                AbstractC23647d.m123893c();
            }
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: au */
    public void mo86242au(String str) {
        AbstractC32542b.m157586a(this.f79026q2, str);
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoDetailView.InterfaceC15314f
    /* renamed from: b0 */
    public void mo82208b0(boolean z11) {
        this.f79021l2.mo107699b0(z11);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0016. Please report as an issue. */
    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: b2 */
    public void mo82209b2(int i11, boolean z11) {
        try {
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 8) {
                        if (i11 != 9) {
                            if (i11 != 20) {
                                if (i11 != 21) {
                                    switch (i11) {
                                        case 15:
                                            this.f79021l2.mo107710he();
                                            break;
                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                            this.f79021l2.mo107735ya();
                                            break;
                                        case 17:
                                            this.f79021l2.mo107707fo();
                                            break;
                                        case 18:
                                            this.f79021l2.mo107671Ik();
                                            break;
                                        default:
                                            return;
                                    }
                                } else {
                                    this.f79021l2.mo107680O8();
                                }
                            } else {
                                this.f79021l2.mo107700b6();
                            }
                        } else {
                            this.f79021l2.mo107717oi();
                        }
                    } else {
                        this.f79021l2.mo107718p9();
                    }
                } else {
                    this.f79021l2.mo107664Cf();
                }
            } else {
                this.f79021l2.mo107695Xj();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: bE */
    public void mo86243bE(boolean z11) {
        SwipeRefreshListView swipeRefreshListView = this.f76212o1;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setEnabled(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:2:0x0000, B:17:0x003e, B:19:0x0042, B:21:0x0048, B:23:0x004c, B:25:0x0056, B:27:0x005a, B:29:0x0016, B:32:0x0022, B:35:0x002c), top: B:1:0x0000 }] */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: bN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C26209i mo82210bN(String str) {
        int hashCode;
        char c11;
        ActionBarMenuItem actionBarMenuItem;
        try {
            hashCode = str.hashCode();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (hashCode != -1976499092) {
            if (hashCode != -1487605799) {
                if (hashCode == -1050871498 && str.equals("tip.profile.privacyshortcut")) {
                    c11 = 1;
                    if (c11 == 0) {
                        if (c11 != 1) {
                            if (c11 == 2 && (actionBarMenuItem = this.f79033x2) != null) {
                                return new C26209i(actionBarMenuItem);
                            }
                        } else {
                            ActionBarMenuItem actionBarMenuItem2 = this.f78996A2;
                            if (actionBarMenuItem2 != null) {
                                return new C26209i(actionBarMenuItem2.getIconView());
                            }
                        }
                    } else {
                        UserInfoView userInfoView = this.f79023n2;
                        if (userInfoView != null) {
                            return new C26209i(userInfoView.m86366iM(19));
                        }
                    }
                    return super.mo82210bN(str);
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                return super.mo82210bN(str);
            }
            if (str.equals("tip.profile.rightmenu.setalias")) {
                c11 = 0;
                if (c11 == 0) {
                }
                return super.mo82210bN(str);
            }
            c11 = 65535;
            if (c11 == 0) {
            }
            return super.mo82210bN(str);
        }
        if (str.equals("tip.profile.setting.noti")) {
            c11 = 2;
            if (c11 == 0) {
            }
            return super.mo82210bN(str);
        }
        c11 = 65535;
        if (c11 == 0) {
        }
        return super.mo82210bN(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: bO */
    public void mo82973bO() {
        this.f76216s1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.profile_feed_sticky_header_group);
        View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.fake_action_bar_above_sticky_functions);
        this.f76217t1 = findViewById;
        findViewById.getLayoutParams().height = this.f76194W0;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: bi */
    public void mo86244bi(String str) {
        if (!str.isEmpty()) {
            this.f79015f2.f138001w.setVisibility(0);
            this.f79015f2.f137992E.setText(str);
        } else {
            this.f79015f2.f138001w.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: cN */
    protected Map mo82211cN() {
        return this.f79027r2;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: cc */
    public void mo86245cc(String str) {
        if (!str.isEmpty()) {
            this.f79015f2.f137993F.setText(str);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: cw */
    public void mo86246cw(boolean z11) {
        int i11;
        View view = this.f79009Z1;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        try {
            InterfaceC20653a2 interfaceC20653a2 = this.f79021l2;
            if (interfaceC20653a2 == null || TextUtils.isEmpty(interfaceC20653a2.mo107725t3())) {
                return "";
            }
            return this.f79021l2.mo107725t3();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: dB */
    public void mo86247dB(ContactProfile contactProfile) {
        if (contactProfile != null) {
            Intent intent = new Intent();
            intent.putExtra("qr_viewer_id", contactProfile.f42434r);
            intent.putExtra("qr_viewer_name", contactProfile.f42437s);
            intent.putExtra("oa_contact_type", contactProfile.f42352K0);
            intent.putExtra("destination", 2);
            m92662fJ().m93069k2(MyQRView.class, intent.getExtras(), 1, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: dE */
    public void mo86248dE() {
        try {
            if (this.f79022m2 == null) {
                this.f79022m2 = new Runnable() { // from class: com.zing.zalo.ui.zviews.r01
                    public /* synthetic */ r01() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserDetailsView.this.m86195vP();
                    }
                };
            }
            Runnable runnable = this.f79022m2;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: dO */
    void mo82214dO(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(26, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    /* renamed from: dP */
    public boolean m86249dP() {
        try {
            OADetailView oADetailView = this.f79003H2;
            if (oADetailView != null && oADetailView.m92687sJ()) {
                if (!this.f79003H2.m92681pJ()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: de */
    public void mo86250de() {
        this.f79006W1.requestLayout();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: e7 */
    public void mo86251e7(String str, ContactProfile contactProfile, String str2, C3563d c3563d) {
        boolean z11;
        String str3;
        try {
            if (this.f79003H2 == null) {
                this.f79003H2 = new OADetailView();
                Bundle bundle = new Bundle();
                bundle.putString("extra_oa_info", c3563d.m18101e().toString());
                bundle.putString("extra_oa_id", str);
                if (contactProfile != null && contactProfile.m40359B0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bundle.putBoolean("extra_bol_oa_certificate", z11);
                if (contactProfile != null) {
                    str3 = contactProfile.f42437s;
                } else {
                    str3 = "";
                }
                bundle.putString("extra_oa_name", str3);
                bundle.putString("extra_oa_avatar", str2);
                this.f79003H2.mo60305zK(bundle);
            }
            if (m92676n2() != null && !m92676n2().isFinishing() && !this.f72421L0.mo60294yp()) {
                this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.container_oa_detail, this.f79003H2, 0, "OADetailView", 1, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: e8 */
    public void mo86252e8(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (!AbstractC23057e7.m118300g(this.f72421L0.m92648SI()) && C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else {
                        Context m92648SI = this.f72421L0.m92648SI();
                        String[] strArr = AbstractC23034c6.f112030g;
                        if (AbstractC23034c6.m118167n(m92648SI, strArr) != 0) {
                            AbstractC23034c6.m118184v0(this, strArr, 117);
                        } else {
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, 17));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: eF */
    public void mo86253eF(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f79034y2;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: eH */
    public void mo86254eH(boolean z11) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86370pM(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: ee */
    public void mo86255ee(boolean z11) {
        int i11;
        View view = this.f79019j2;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: f5 */
    public void mo82218f5() {
        try {
            if (mo86269mc()) {
                this.f76186S0.post(this.f79024o2);
            } else {
                this.f76186S0.postDelayed(this.f79024o2, 400L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: f9 */
    public void mo86256f9(String str) {
        TextView textView = this.f79014e2;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: fr */
    public void mo86257fr(String str) {
        int i11;
        String str2;
        Bundle bundle = new Bundle();
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93604w);
        if (m114310H != null) {
            i11 = m114310H.m40683t();
        } else {
            i11 = 0;
        }
        bundle.putInt("EXTRA_SOURCE_LINK", i11);
        if (m114310H != null) {
            str2 = m114310H.m40682o();
        } else {
            str2 = "";
        }
        bundle.putString("EXTRA_SOURCE_PARAM", str2);
        bundle.putString("id_oa_profile", str);
        bundle.putBoolean("use_subtitle", false);
        m92662fJ().m93069k2(ZaloWebView.class, bundle, 1, true);
        finish();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: gI */
    public void mo86258gI(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f79033x2;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f78995K2;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: gk */
    public void mo86259gk(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f79033x2;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnableNoti(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: gw */
    public void mo86260gw(ContactProfile contactProfile, int[] iArr) {
        try {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112033j) == 0) {
                if (contactProfile != null) {
                    AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, true, 18));
                }
            } else {
                AbstractC23034c6.m118166m0(this, 113);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: hA */
    public void mo86261hA(ContactProfile contactProfile) {
        C17487o0 c17487o0;
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        AbstractC21935u.m114523M(c17487o0, contactProfile);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        super.mo11957ig(c3000l0, i11, c17391z, i12, view, view2);
        AbstractC23647d.m123897g("7552");
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: jC */
    public boolean mo86262jC() {
        try {
            UserInfoDetailView userInfoDetailView = this.f79025p2;
            if (userInfoDetailView != null && userInfoDetailView.m92687sJ()) {
                if (!this.f79025p2.m92681pJ()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: js */
    public void mo86263js(boolean z11) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86367js(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: k2 */
    public void mo86264k2(String str) {
        int i11;
        int height;
        int i12;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        int i13 = 0;
        if (m115161u != null) {
            m115161u.m153811A(true);
            Avatar avatar = this.f76199b1;
            if (avatar != null) {
                avatar.setStateLoadingStory(true);
            }
            Avatar avatar2 = this.f76208k1;
            if (avatar2 != null) {
                avatar2.setStateLoadingStory(true);
            }
            this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.y01
                public /* synthetic */ y01() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserDetailsView.this.m86193uP();
                }
            }, 150L);
            int[] iArr = new int[2];
            Avatar avatar3 = this.f76199b1;
            if (avatar3 != null) {
                avatar3.getLocationOnScreen(iArr);
            }
            int i14 = iArr[0];
            if (i14 > 0 && iArr[1] > 0) {
                Avatar avatar4 = this.f76199b1;
                if (avatar4 != null) {
                    i13 = (avatar4.getWidth() / 2) + i14;
                    i11 = iArr[1];
                    height = this.f76199b1.getHeight() / 2;
                    i12 = i11 + height;
                }
                i12 = 0;
            } else {
                Avatar avatar5 = this.f76208k1;
                if (avatar5 != null) {
                    avatar5.getLocationOnScreen(iArr);
                    i13 = iArr[0] + (this.f76208k1.getWidth() / 2);
                    i11 = iArr[1];
                    height = this.f76208k1.getHeight() / 2;
                    i12 = i11 + height;
                }
                i12 = 0;
            }
            AbstractC22055v0.m115124N(m115161u, this, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 361, null, new C15307j(), i13, i12);
            return;
        }
        Avatar avatar6 = this.f76199b1;
        if (avatar6 != null) {
            avatar6.m90482y(false, false);
        }
        Avatar avatar7 = this.f76208k1;
        if (avatar7 != null) {
            avatar7.m90482y(false, false);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: lA */
    public void mo86265lA() {
        this.f76215r1.m43221Z(3);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: lD */
    public void mo86266lD(boolean z11) {
        int i11;
        View view = this.f79020k2;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: lc */
    public void mo86267lc(ContactProfile contactProfile) {
        if (contactProfile != null) {
            FeedActionZUtils.m47536X(contactProfile.f42434r, contactProfile.f42446v, contactProfile.f42437s, m92676n2(), new Bundle[0]);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: ls */
    public void mo86268ls(String str) {
        if (!str.isEmpty()) {
            this.f79015f2.f137999u.setVisibility(0);
            this.f79015f2.f137990C.setText(str);
        } else {
            this.f79015f2.f137999u.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
        m86213EP(bundle);
        super.mo11963mE(animationTarget, c23528a, str, c20275e, bundle, i11, c3020p0);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: mc */
    public boolean mo86269mc() {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null && userInfoView.m92674mJ()) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: mn */
    public void mo86270mn(ContactProfile contactProfile, int[] iArr) {
        try {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112030g) == 0) {
                if (contactProfile != null) {
                    AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, 17));
                }
            } else {
                AbstractC23034c6.m118162k0(this, 117);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: mq */
    public void mo86271mq(boolean z11) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86374tM(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: n6 */
    public void mo86272n6(boolean z11) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86375uM(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: nE */
    public void mo86273nE(boolean z11) {
        int i11;
        View view = this.f79010a2;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: nj */
    public void mo86274nj(int i11) {
        int color;
        int color2;
        int i12 = C15298a.f79036a[EnumC15308k.values()[i11].ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    this.f79015f2.f138002x.setVisibility(0);
                    this.f79015f2.f138004z.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stranger_friend_request_warning_black_user));
                    if (C23212s8.m119603k()) {
                        color2 = m92651WI().getColor(AbstractC2808b.f150831r70);
                    } else {
                        color2 = m92651WI().getColor(AbstractC2808b.f150828r40);
                    }
                    this.f79015f2.f138004z.setTextColor(color2);
                    Drawable m139658a = C27280g.m139658a(this.f72421L0.m92689tK(), AbstractC2810d.zds_ic_warning_solid_16);
                    if (m139658a != null) {
                        AbstractC1414a.m7196n(m139658a, color2);
                        this.f79015f2.f137997s.setImageDrawable(m139658a);
                    }
                    this.f79015f2.f138002x.setBackgroundResource(AbstractC16803z.bg_rounded_corner_support_error);
                    return;
                }
                return;
            }
            this.f79015f2.f138002x.setVisibility(0);
            this.f79015f2.f138004z.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stranger_friend_request_warning_gray_user));
            if (C23212s8.m119603k()) {
                color = m92651WI().getColor(AbstractC2808b.f150840y70);
            } else {
                color = m92651WI().getColor(AbstractC2808b.y55);
            }
            this.f79015f2.f138004z.setTextColor(color);
            Drawable m139658a2 = C27280g.m139658a(this.f72421L0.m92689tK(), AbstractC2810d.zds_ic_warning_solid_16);
            if (m139658a2 != null) {
                AbstractC1414a.m7196n(m139658a2, color);
                this.f79015f2.f137997s.setImageDrawable(m139658a2);
            }
            this.f79015f2.f138002x.setBackgroundResource(AbstractC16803z.bg_rounded_corner_support_warning_friend_request);
            return;
        }
        this.f79015f2.f138002x.setVisibility(8);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: oD */
    public void mo86275oD(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f78996A2;
        if (actionBarMenuItem != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.f79021l2.onActivityResult(i11, i12, intent);
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.layoutAvatar) {
                m86215FP(this.f79021l2.mo107696Ya());
            } else {
                if (id2 != AbstractC6918a0.tvSendMes_ob && id2 != AbstractC6918a0.tvSendMes_tb) {
                    if (id2 == AbstractC6918a0.layoutUnBlock) {
                        this.f79021l2.mo107714li();
                    } else if (id2 == AbstractC6918a0.btnAcceptFriendRequest) {
                        this.f79021l2.mo107708h5();
                    } else if (id2 == AbstractC6918a0.btnRejectFriendRequest) {
                        this.f79021l2.mo107685S8();
                    } else if (id2 == AbstractC6918a0.user_details_functions_sticky_music) {
                        this.f79021l2.mo107677M1();
                    } else if (id2 == AbstractC6918a0.btn_close_sticky_music) {
                        this.f79021l2.mo107638Cl();
                    } else if (id2 == 8000000) {
                        AbstractC23647d.m123897g("7101");
                        super.onClick(view);
                    } else {
                        super.onClick(view);
                    }
                }
                this.f79021l2.mo107667Ee();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f72421L0.m78934CL(i11, keyEvent)) {
            return true;
        }
        C8050a c8050a = this.f76215r1;
        if ((c8050a != null && c8050a.m43313z0(i11, keyEvent)) || super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            if (m86249dP() && this.f79003H2.onKeyUp(i11, keyEvent)) {
                return true;
            }
            if (mo86262jC() && this.f79025p2.onKeyUp(i11, keyEvent)) {
                return true;
            }
            if (mo86269mc()) {
                mo86284to();
                return true;
            }
            if (AbstractC23304d.f113383f1) {
                Intent intent = new Intent();
                intent.putExtras(m92642L3());
                mo50035CK(-1, intent);
            }
            finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.f79021l2.onRequestPermissionsResult(i11, strArr, iArr);
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        try {
            this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.b11
                public /* synthetic */ b11() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserDetailsView.this.m86189sP();
                }
            }, 100L);
            super.onResume();
            this.f79021l2.onResume();
            C8050a c8050a = this.f76215r1;
            if (c8050a != null) {
                c8050a.m43283B0();
            }
            C23744a.m124114c().m124115b(this, 6075);
            mo82218f5();
            try {
                mo49315c4();
                removeDialog(16);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f78995K2, e11);
            }
            m86219HO();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: ou */
    public void mo86276ou(ContactProfile contactProfile, boolean z11, boolean z12, String str, boolean z13) {
        try {
            UserInfoView userInfoView = this.f79023n2;
            if (userInfoView != null) {
                userInfoView.m86377wM(contactProfile, false, z12, str, z13);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: py */
    public void mo86277py(String str) {
        C17487o0 c17487o0;
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_mode", 3);
            bundle.putString("extra_user_id", str);
            bundle.putInt("extra_init_page", C21933s.m114404I().f107899Z.f108001g + 1);
            bundle.putString("extra_title_action_bar", AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_title));
            c17487o0.m93069k2(SuggestFriendDetailView.class, bundle, 1, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: qE */
    public void mo86278qE() {
        this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.t01
            public /* synthetic */ t01() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserDetailsView.this.m86138EO();
            }
        }, 1100L);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, iq.InterfaceC20659b2
    /* renamed from: qh */
    public void mo83000qh() {
        try {
            this.f76167A1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.user_details_functions_sticky_music);
            this.f76168B1 = (RecyclingImageView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.img_sticky_music_icon);
            this.f76169C1 = (SlideShowSound) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.gif_sound_sticky_music);
            this.f76170D1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.thumb_play_sticky_music);
            this.f76171E1 = (RobotoTextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tv_song_title_sticky_music);
            this.f76172F1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.btn_close_sticky_music);
            this.f76169C1.setAnimX(0);
            this.f76169C1.setAnimWidth(AbstractC23136l9.m118742r(2.0f));
            this.f76169C1.m75887a(AbstractC23136l9.m118742r(14.0f), AbstractC23136l9.m118742r(20.0f));
            this.f76169C1.setShadowPaintColor(637534208);
            AbstractC23136l9.m118729m1(this.f76168B1, AbstractC23136l9.m118742r(4.0f));
            View view = this.f76167A1;
            view.setBackgroundColor(AbstractC23265y.m120019f(C23212s8.m119607o(view.getContext(), AbstractC16781w.PrimaryBackgroundColor), 0.8f));
            mo82950Te(false);
            this.f76167A1.setOnClickListener(this);
            this.f76172F1.setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: qi */
    public void mo86279qi(ContactProfile contactProfile, int i11) {
        SensitiveData sensitiveData;
        if (contactProfile != null) {
            if (i11 == 691) {
                sensitiveData = new SensitiveData("phonebook_update_alias_in_user_profile", "phonebook_update");
            } else {
                sensitiveData = new SensitiveData("phonebook_update_alias_in_user_profile_right_menu", "phonebook_update");
            }
            this.f72421L0.m92676n2().mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(contactProfile.f42434r, contactProfile.f42437s, i11, sensitiveData), 1, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: ql */
    public void mo86280ql() {
        AbstractC23115k.m118571b(this.f79002G2, AbstractC10919t.fadein);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: qz */
    public void mo86281qz(Bundle bundle, boolean z11) {
        int i11;
        if (m92662fJ() != null) {
            C17487o0 m92662fJ = m92662fJ();
            if (z11) {
                i11 = 1085;
            } else {
                i11 = 1086;
            }
            m92662fJ.m93066i2(WriteInvitationView.class, bundle, i11, 1, true);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: t6 */
    public void mo86282t6(String str) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                C32002l4 mo82938QM = mo82938QM();
                if (mo82938QM != null) {
                    bundle.putString("extra_entry_point_flow", mo82938QM.m154277l());
                }
                m92662fJ.m93066i2(ProfilePhotoView.class, bundle, 0, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: tg */
    public void mo86283tg(int i11) {
        RecyclerView recyclerView = this.f76213p1;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: to */
    public void mo86284to() {
        try {
            if (this.f79023n2 != null) {
                this.f72421L0.m92649TI().mo92702G1(this.f79023n2, 2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: uB */
    public void mo86285uB() {
        try {
            RecyclerView recyclerView = this.f76213p1;
            if (recyclerView != null) {
                recyclerView.setBackgroundResource(AbstractC16803z.rectangle_transparent);
            }
            TrackingRelativeLayout trackingRelativeLayout = this.f76203f1;
            if (trackingRelativeLayout != null) {
                trackingRelativeLayout.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: uj */
    public void mo86286uj(String str) {
        this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.u01

            /* renamed from: q */
            public final /* synthetic */ String f82254q;

            public /* synthetic */ u01(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UserDetailsView.this.m86191tP(r2);
            }
        }, 700L);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: uu */
    public void mo86287uu(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("user_id", this.f79021l2.mo107696Ya());
        bundle.putString("song_id", this.f79021l2.mo107725t3());
        bundle.putBoolean("is_ready", z11);
        bundle.putString("footer_info", this.f79021l2.mo107687Sl());
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", this.f79021l2.mo107725t3());
        m92649TI().m93021N0().mo35581q(ProfileMusicBottomSheet.class, bundle, 1314, 1, true);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: v5 */
    public void mo86288v5(int i11) {
        UserInfoView userInfoView = this.f79023n2;
        if (userInfoView != null) {
            userInfoView.m86368kM(i11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: vr */
    public void mo86289vr(ContactProfile contactProfile) {
        if (contactProfile != null) {
            Intent intent = new Intent();
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putString("SOURCE_ACTION", "7802");
            intent.putExtras(m140776b);
            if (m92676n2() != null) {
                m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 65) {
                if (i11 != 6020) {
                    if (i11 != 6028) {
                        if (i11 != 6042) {
                            if (i11 != 6075) {
                                if (i11 != 6093) {
                                    if (i11 != 6097) {
                                        if (i11 != 3001) {
                                            if (i11 != 3002) {
                                                if (i11 != 5000) {
                                                    if (i11 == 5001) {
                                                        this.f79021l2.mo107663C0();
                                                    }
                                                } else {
                                                    this.f79021l2.mo107665D3();
                                                }
                                            } else {
                                                this.f79021l2.mo107739zf();
                                            }
                                        } else {
                                            this.f79021l2.mo107702c2();
                                        }
                                    } else if (objArr != null) {
                                        if (objArr.length > 0 && ((Integer) objArr[0]).intValue() != 10001) {
                                            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.x01
                                                public /* synthetic */ x01() {
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    UserDetailsView.this.m86173kP();
                                                }
                                            });
                                        }
                                    }
                                } else {
                                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.w01
                                        public /* synthetic */ w01() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            UserDetailsView.this.m86171jP();
                                        }
                                    });
                                }
                            } else {
                                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.v01
                                    public /* synthetic */ v01() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        UserDetailsView.this.m86169iP();
                                    }
                                });
                            }
                        } else {
                            this.f79021l2.mo107711hn();
                        }
                    } else {
                        this.f79021l2.mo107697Yd(objArr);
                    }
                } else {
                    this.f79021l2.mo107655pg();
                }
            } else {
                this.f79021l2.mo107731v8();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, p489rn.C25927x0.a
    /* renamed from: x2 */
    public void mo36956x2(C31874cb c31874cb, int i11, int i12) {
        this.f79021l2.mo107733x2(c31874cb, i11, i12);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
        ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("UserInfoView");
        if (m92996E0 instanceof UserInfoView) {
            this.f79023n2 = (UserInfoView) m92996E0;
        }
        this.f79021l2.mo107726t6();
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: xl */
    public void mo86290xl(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f78996A2;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnableNoti(z11);
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: xx */
    public void mo86291xx(String str, String str2, boolean z11) {
        boolean z12;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("avatarPhoto", "1");
            if ((!TextUtils.equals(str, CoreUtility.f89233i)) && !z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            bundle.putBoolean("EXTRA_SHOULD_PREVENT_SCREENSHOT", z12);
            bundle.putString("userId", str);
            bundle.putString("defaultAvatar", str2);
            bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
            C20275e c20275e = new C20275e();
            c20275e.m105883v(true);
            mo82182LF(null, null, null, bundle, c20275e, 0, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: xy */
    public void mo86292xy(String str) {
        C32541a c32541a = this.f79026q2;
        if (c32541a != null) {
            this.f79021l2.mo107720qj(c32541a.m157541a0(str));
        }
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: y */
    public String mo86293y() {
        return this.f72829D0;
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: y0 */
    public boolean mo86294y0() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93012K0() != null && AbstractC20826v0.m108784S0(m92662fJ().m93012K0())) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, AbstractC26080o.a.f124275b);
        C23744a.m124114c().m124115b(this, 6042);
        C23744a.m124114c().m124115b(this, 6093);
        C23744a.m124114c().m124115b(this, 6097);
    }

    @Override // iq.InterfaceC20659b2
    /* renamed from: zp */
    public void mo86295zp() {
        try {
            if (this.f79023n2 == null) {
                this.f79023n2 = new UserInfoView();
            }
            this.f72421L0.m92649TI().m93060e2(AbstractC6918a0.root_backgroundmain, this.f79023n2, "UserInfoView", 2, false);
            C13306b c13306b = this.f76185R1;
            if (c13306b != null) {
                c13306b.m74711w("tip.profile.rightmenu.setalias", 200);
                this.f76185R1.m74711w("tip.profile.setting.noti", 200);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
