package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.AbstractC1785o;
import androidx.recyclerview.widget.RecyclerView;
import as.InterfaceC2333h;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bn.C2874g1;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3046v;
import bo.C3054x;
import bp0.AbstractC3102n;
import cd0.C3427f;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7231u8;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.ProfileMusicView;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet;
import com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.rounedlayout.FrameRoundedLayout;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.SettingV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.ProfileBaseView;
import com.zing.zalo.p077ui.zviews.QRCodeViewerView;
import com.zing.zalo.p077ui.zviews.UserInfoDetailView;
import com.zing.zalo.p077ui.zviews.UserInfoView;
import com.zing.zalo.uicontrol.FeedAsyncFailedPopupView;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.ProfileMusicBottomSheet;
import com.zing.zalo.uicontrol.Snackbar;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
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
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.C20275e;
import iq.C20713m0;
import iq.C20779z1;
import iq.InterfaceC20650a;
import iq.InterfaceC20707l;
import iq.InterfaceC20712m;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22033k0;
import l30.C22052u;
import me0.AbstractC23034c6;
import me0.AbstractC23047d8;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.AbstractC23238v2;
import me0.C23212s8;
import me0.C23283z7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import np.InterfaceC23923b;
import org.json.JSONArray;
import p055ce.C3432a;
import p140ev.C18613b;
import p140ev.C18620i;
import p173fz.C19172a;
import p322lf.AbstractC22470k;
import p325lj.C22499f;
import p329lo.C22579r0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p368nq.C23927b;
import p369ns.AbstractC23933a;
import p398oo.C24355e0;
import p458qr.C25470c;
import p458qr.C25471d;
import p490rp.AbstractC25951b;
import p490rp.AbstractC25952c;
import p492rr.C25973p;
import p494rv.C25979a;
import p527tq.C26876b;
import p554up.AbstractC27354b;
import p645xh.C29630g;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32036n8;
import p716zh.C32065p8;
import pm0.C24848g0;
import s00.AbstractC26080o;
import sa0.C26209i;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28209v3;
import vg.C28212v6;
import wh0.C29046a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MyInfoView extends ProfileBaseView implements InterfaceC20712m, UserInfoView.InterfaceC15317c, C23744a.c, UserInfoDetailView.InterfaceC15314f, InterfaceC0733x, InterfaceC23923b {

    /* renamed from: t2 */
    static final String f75515t2 = "MyInfoView";

    /* renamed from: u2 */
    protected static int f75516u2;

    /* renamed from: W1 */
    FeedAsyncFailedPopupView f75517W1;

    /* renamed from: X1 */
    UserInfoDetailView f75518X1;

    /* renamed from: Y1 */
    View f75519Y1;

    /* renamed from: Z1 */
    TextView f75520Z1;

    /* renamed from: a2 */
    ActionBarMenuItem f75521a2;

    /* renamed from: b2 */
    ActionBarMenuItem f75522b2;

    /* renamed from: d2 */
    private View f75524d2;

    /* renamed from: e2 */
    Animation f75525e2;

    /* renamed from: f2 */
    Animation f75526f2;

    /* renamed from: h2 */
    UserInfoView f75528h2;

    /* renamed from: i2 */
    private InterfaceC20707l f75529i2;

    /* renamed from: n2 */
    private C3046v f75534n2;

    /* renamed from: o2 */
    FeedActionZUtils.InterfaceC8913k f75535o2;

    /* renamed from: p2 */
    MenuListPopupView f75536p2;

    /* renamed from: c2 */
    boolean f75523c2 = false;

    /* renamed from: g2 */
    final Runnable f75527g2 = new RunnableC14676a();

    /* renamed from: j2 */
    private final Map f75530j2 = new HashMap();

    /* renamed from: k2 */
    private final Map f75531k2 = new HashMap();

    /* renamed from: l2 */
    private boolean f75532l2 = false;

    /* renamed from: m2 */
    private View.OnClickListener f75533m2 = new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.v00
        public /* synthetic */ v00() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MyInfoView.this.m82130UO(view);
        }
    };

    /* renamed from: q2 */
    C17487o0.l f75537q2 = new C14682g();

    /* renamed from: r2 */
    C2874g1.b f75538r2 = new C14683h();

    /* renamed from: s2 */
    private boolean f75539s2 = false;

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$a */
    /* loaded from: classes6.dex */
    class RunnableC14676a implements Runnable {
        RunnableC14676a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserInfoView userInfoView = MyInfoView.this.f75528h2;
                if (userInfoView != null) {
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    userInfoView.m86377wM(contactProfile, true, false, contactProfile.f42437s, false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$b */
    /* loaded from: classes6.dex */
    public class C14677b implements FeedBaseAdapter.InterfaceC8048y {
        C14677b() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: X */
        public void mo43274X() {
            MyInfoView.this.f75529i2.mo107881X();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: Y */
        public void mo43275Y(String str, String str2) {
            C31877d c31877d = new C31877d();
            str.hashCode();
            if (str.equals("action.open.memorylist")) {
                c31877d.m153184c(C32002l4.m154265h(10001, 30));
            }
            AbstractC28207v1.m141994i3(str, 4, MyInfoView.this.f72421L0.m92676n2(), MyInfoView.this.f72421L0, str2, c31877d);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: Z */
        public String mo43276Z() {
            return MyInfoView.this.f75529i2.mo107916lf();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8049z
        /* renamed from: a0 */
        public void mo43277a0(C23927b c23927b) {
            MyInfoView.this.f75529i2.mo107648Vf(c23927b);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8048y
        /* renamed from: k1 */
        public void mo43272k1() {
            MyInfoView.this.f75529i2.mo107910k1();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8048y
        /* renamed from: l1 */
        public void mo43273l1(View view) {
            MyInfoView.this.f75524d2 = view;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            MyInfoView.this.f75529i2.mo107927s(c3054x);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
            MyInfoView.this.f75529i2.mo107931u();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
            MyInfoView.this.f73260P0 = z11;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
            MyInfoView.this.m82970ZN(view);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
            MyInfoView.this.f76212o1.setSwipeRefreshEnable(!z11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
            AbstractC27354b.m140049a(MyInfoView.this.f76178L1, c3000l0);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
            MyInfoView.this.f75529i2.mo107641E();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$c */
    /* loaded from: classes6.dex */
    public class C14678c extends RecyclerView.AbstractC1892s {
        C14678c() {
        }

        /* renamed from: g */
        public /* synthetic */ void m82255g() {
            MyInfoView.this.m82934ON();
            MyInfoView myInfoView = MyInfoView.this;
            myInfoView.m82117Ck(myInfoView.m82187QO());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            try {
                MyInfoView myInfoView = MyInfoView.this;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                myInfoView.m82964XN(z11);
                if (i11 == 0) {
                    MyInfoView.this.f76215r1.m43223b0(false);
                } else {
                    MyInfoView.this.f76215r1.m43223b0(true);
                }
                MyInfoView.this.f76215r1.m43285D0(recyclerView, i11);
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
                int m9740Y1 = MyInfoView.this.f76214q1.m9740Y1();
                int m9745c2 = MyInfoView.this.f76214q1.m9745c2();
                int m10110a = MyInfoView.this.f76214q1.m10110a();
                int m10127i = MyInfoView.this.f76214q1.m10127i();
                if (MyInfoView.this.m82994nN()) {
                    MyInfoView myInfoView = MyInfoView.this;
                    if (i12 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    myInfoView.m82968YN(z11);
                }
                MyInfoView myInfoView2 = MyInfoView.this;
                myInfoView2.m82929JN(myInfoView2.f75531k2, MyInfoView.this.f75530j2);
                if (m9740Y1 >= 10) {
                    MyInfoView.this.m82974cO();
                }
                MyInfoView myInfoView3 = MyInfoView.this;
                if (myInfoView3.f76215r1 != null) {
                    if (m9745c2 >= m10127i - 5) {
                        myInfoView3.f75529i2.mo107860L3();
                    }
                    MyInfoView myInfoView4 = MyInfoView.this;
                    C8050a c8050a = myInfoView4.f76215r1;
                    if (myInfoView4.m82996oN()) {
                        bVar = C20040b.b.f98513p;
                    } else {
                        bVar = C20040b.b.f98514q;
                    }
                    c8050a.m43284C0(recyclerView, m9740Y1, m10110a, bVar);
                    MyInfoView.this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.c10
                        public /* synthetic */ c10() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MyInfoView.C14678c.this.m82255g();
                        }
                    });
                }
                if (m10110a > 0) {
                    MyInfoView.this.m82930KM();
                }
                ProfileBaseView.RunnableC14795j runnableC14795j = MyInfoView.this.f76183Q1;
                if (runnableC14795j != null) {
                    runnableC14795j.m83008a();
                }
                if (i12 != 0) {
                    MyInfoView.this.removeDialog(10);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$d */
    /* loaded from: classes6.dex */
    class C14679d extends Snackbar.AbstractC16514e {
        C14679d() {
        }

        @Override // com.zing.zalo.uicontrol.Snackbar.AbstractC16514e
        /* renamed from: a */
        public void mo82256a(Snackbar snackbar, int i11) {
            super.mo82256a(snackbar, i11);
            MyInfoView.this.f75529i2.mo107918n4();
        }

        @Override // com.zing.zalo.uicontrol.Snackbar.AbstractC16514e
        /* renamed from: b */
        public void mo82257b(Snackbar snackbar) {
            super.mo82257b(snackbar);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$e */
    /* loaded from: classes6.dex */
    class C14680e implements FeedAsyncFailedPopupView.InterfaceC16459a {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f75544a;

        C14680e(C3000l0 c3000l0) {
            this.f75544a = c3000l0;
        }

        @Override // com.zing.zalo.uicontrol.FeedAsyncFailedPopupView.InterfaceC16459a
        /* renamed from: a */
        public void mo82051a(String str) {
            MyInfoView.this.m82123MO();
            MyInfoView.this.f75529i2.mo107853Eo(this.f75544a);
        }

        @Override // com.zing.zalo.uicontrol.FeedAsyncFailedPopupView.InterfaceC16459a
        /* renamed from: b */
        public void mo82052b(String str) {
            MyInfoView.this.m82123MO();
            MyInfoView.this.f75529i2.mo107864Om(str);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$f */
    /* loaded from: classes6.dex */
    public class C14681f implements FeedActionZUtils.InterfaceC8913k {
        C14681f() {
        }

        /* renamed from: b */
        public /* synthetic */ void m82259b(C3020p0 c3020p0) {
            MyInfoView myInfoView = MyInfoView.this;
            myInfoView.f75536p2 = FeedActionZUtils.m47538Z(myInfoView.m92689tK(), c3020p0, MyInfoView.this.f72421L0.m92676n2(), MyInfoView.this.f75535o2);
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: o2 */
        public void mo47577o2(String str, PrivacyInfo privacyInfo) {
            MyInfoView.this.f75529i2.mo107921o2(str, privacyInfo);
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: p2 */
        public void mo47578p2() {
            MyInfoView.this.mo49315c4();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: q2 */
        public void mo47579q2(int i11, C3020p0 c3020p0) {
            try {
                MyInfoView myInfoView = MyInfoView.this;
                FeedActionZUtils.m47519G(myInfoView.f75536p2, myInfoView.f72421L0.m92676n2());
                MyInfoView.this.f75529i2.mo107919ng(i11, c3020p0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: r2 */
        public void mo47580r2() {
            MyInfoView.this.mo46829Y();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: s2 */
        public void mo47581s2(int i11, C3020p0 c3020p0) {
            try {
                MyInfoView myInfoView = MyInfoView.this;
                FeedActionZUtils.m47519G(myInfoView.f75536p2, myInfoView.f72421L0.m92676n2());
                MyInfoView.this.f75529i2.mo107887Zm(i11, c3020p0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: t2 */
        public void mo47582t2(C3020p0 c3020p0) {
            MyInfoView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.d10

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f80096q;

                public /* synthetic */ d10(C3020p0 c3020p02) {
                    r2 = c3020p02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MyInfoView.C14681f.this.m82259b(r2);
                }
            });
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: z1 */
        public void mo47583z1(C20096c c20096c) {
            MyInfoView.this.f75529i2.mo107936z1(c20096c);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$g */
    /* loaded from: classes6.dex */
    class C14682g implements C17487o0.l {
        C14682g() {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            MyInfoView.this.m82115BO(zaloView);
            MyInfoView.this.m82140gP();
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            MyInfoView.this.m82164yO(zaloView);
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$h */
    /* loaded from: classes6.dex */
    class C14683h implements C2874g1.b {
        C14683h() {
        }

        @Override // bn.C2874g1.b
        /* renamed from: a */
        public void mo13802a(int i11) {
            try {
                switch (i11) {
                    case 0:
                        MyInfoView.this.f75529i2.mo107869Ri();
                        break;
                    case 1:
                        MyInfoView.this.f75529i2.mo107862Mk();
                        break;
                    case 2:
                        AbstractC23647d.m123907q("6410", MyInfoView.this.f72829D0);
                        MyInfoView.this.f75529i2.mo107886Zg();
                        AbstractC23647d.m123893c();
                        break;
                    case 3:
                        MyInfoView.this.f75529i2.mo107852Ej();
                        break;
                    case 4:
                        AbstractC23647d.m123907q("6310", MyInfoView.this.f72829D0);
                        MyInfoView.this.f75529i2.mo107856Fc();
                        AbstractC23647d.m123893c();
                        break;
                    case 5:
                        MyInfoView.this.f75529i2.mo107850Do();
                        break;
                    case 6:
                        MyInfoView.this.f75529i2.mo107935y7();
                        break;
                    default:
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MyInfoView$i */
    /* loaded from: classes6.dex */
    public class C14684i implements AbstractC22055v0.g {

        /* renamed from: a */
        final /* synthetic */ String f75549a;

        C14684i(String str) {
            this.f75549a = str;
        }

        /* renamed from: c */
        public /* synthetic */ void m82261c(String str) {
            boolean z11;
            if (!AbstractC22055v0.m115112B(str) && !MyInfoView.this.f75539s2) {
                Avatar avatar = MyInfoView.this.f76199b1;
                boolean z12 = false;
                if (avatar != null) {
                    avatar.setStateLoadingStory(false);
                }
                Avatar avatar2 = MyInfoView.this.f76208k1;
                if (avatar2 != null) {
                    avatar2.setStateLoadingStory(false);
                }
                C31980jc m115161u = AbstractC22055v0.m115161u(CoreUtility.f89233i);
                Avatar avatar3 = MyInfoView.this.f76199b1;
                if (avatar3 != null) {
                    if (m115161u != null && !m115161u.f147026s) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    avatar3.m90482y(true, z11);
                }
                Avatar avatar4 = MyInfoView.this.f76208k1;
                if (avatar4 != null) {
                    if (m115161u != null && !m115161u.f147026s) {
                        z12 = true;
                    }
                    avatar4.m90482y(true, z12);
                }
            }
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            MyInfoView.this.f76186S0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.e10

                /* renamed from: q */
                public final /* synthetic */ String f80196q;

                public /* synthetic */ e10(String str) {
                    r2 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MyInfoView.C14684i.this.m82261c(r2);
                }
            }, 200L);
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (MyInfoView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(str);
                mo46561O();
            }
            MyInfoView.this.mo82184NN(gVar);
        }
    }

    /* renamed from: BO */
    public void m82115BO(ZaloView zaloView) {
        try {
            C17487o0 m92649TI = m92649TI();
            if (m92649TI != null && AbstractC20826v0.m108784S0(zaloView) && m92649TI.m92999F0() + m92649TI.m93018M0() == 0) {
                this.f75529i2.mo107901e3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CO */
    private KeyEventCallbackC17462c m82116CO(C3046v c3046v) {
        if (c3046v != null) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(4).m43162k(Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_alert_feed_album_privacy, c3046v.f12278e))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm), new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        return null;
    }

    /* renamed from: Ck */
    public void m82117Ck(boolean z11) {
        try {
            if (z11) {
                m82151mP();
            } else {
                m82122LO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DO */
    private void m82118DO() {
        this.f75531k2.clear();
        this.f75531k2.put(Integer.valueOf(AbstractC6918a0.menu_limit_visible_feed), Integer.valueOf(AbstractC16803z.ic_clock2_line_24_white));
        this.f75531k2.put(Integer.valueOf(AbstractC6918a0.menu_drawer), Integer.valueOf(AbstractC16803z.ic_more_24_white));
    }

    /* renamed from: EO */
    private void m82119EO() {
        this.f75530j2.clear();
        this.f75530j2.put(Integer.valueOf(AbstractC6918a0.menu_limit_visible_feed), Integer.valueOf(AbstractC16803z.ic_clock2_line_24_black));
        this.f75530j2.put(Integer.valueOf(AbstractC6918a0.menu_drawer), Integer.valueOf(AbstractC16803z.ic_more_24_black));
    }

    /* renamed from: FO */
    private void m82120FO(int i11) {
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f75529i2.mo107905i5();
                        }
                    } else {
                        this.f75529i2.mo107868Qm();
                    }
                } else {
                    this.f75529i2.mo107914ki();
                }
            } else {
                this.f75529i2.mo107906ia();
            }
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                m92642L3.putInt("int_extra_action_list_action", -1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IO */
    private void m82121IO(Intent intent) {
        if (intent == null) {
            return;
        }
        this.f75529i2.mo107938ze(intent);
    }

    /* renamed from: LO */
    private void m82122LO() {
        if (m82126PO()) {
            m82143hP();
        }
    }

    /* renamed from: MO */
    public void m82123MO() {
        try {
            FeedAsyncFailedPopupView feedAsyncFailedPopupView = this.f75517W1;
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

    /* renamed from: NO */
    private void m82124NO() {
        int i11 = AbstractC32226c.m155411j(m92676n2()).top;
        int dimensionPixelSize = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        if (!AbstractC32226c.m155415n(m92676n2())) {
            i11 = 0;
        }
        this.f76194W0 = dimensionPixelSize + i11;
        this.f76196Y0 = 0;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in);
        this.f75525e2 = loadAnimation;
        loadAnimation.setDuration(100L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_out);
        this.f75526f2 = loadAnimation2;
        loadAnimation2.setDuration(100L);
    }

    /* renamed from: OO */
    private boolean m82125OO() {
        if (this.f76199b1 == null) {
            return true;
        }
        UserInfoView userInfoView = this.f75528h2;
        if ((userInfoView != null && userInfoView.m92672lJ()) || AbstractC23136l9.m118644C0(this.f76199b1).bottom - this.f76194W0 < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: PO */
    private boolean m82126PO() {
        View view = this.f75519Y1;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: RO */
    public /* synthetic */ void m82127RO(int i11, Object[] objArr) {
        InterfaceC20707l interfaceC20707l;
        boolean z11 = false;
        try {
            if (i11 == 22) {
                if (objArr != null && objArr.length > 0) {
                    this.f75529i2.mo107908j7(String.valueOf(objArr[0]));
                    return;
                }
                return;
            }
            if (i11 == 28) {
                if (objArr.length > 0) {
                    this.f75529i2.mo107867Qe(((Integer) objArr[0]).intValue());
                    return;
                }
                return;
            }
            if (i11 == 88) {
                this.f75529i2.mo107870S9();
                return;
            }
            if (i11 == 3001) {
                this.f75529i2.mo107895c2();
                return;
            }
            if (i11 == 5001) {
                this.f75529i2.mo107844C0();
                return;
            }
            if (i11 == 5000) {
                this.f75529i2.mo107847D3();
                return;
            }
            if (i11 == 5100) {
                if (objArr != null && objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof Bundle) {
                        this.f75529i2.mo107898ck(C26876b.m138439a((Bundle) obj));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 6007) {
                if (objArr != null && objArr.length > 0) {
                    this.f75529i2.mo107639Df((ProfileAlbumItem) objArr[0]);
                    return;
                }
                return;
            }
            if (i11 == 6008) {
                if (objArr != null && objArr.length > 0) {
                    this.f75529i2.mo107635Bl(((Long) objArr[0]).longValue());
                    return;
                }
                return;
            }
            if (i11 == 6022) {
                this.f75529i2.mo107897ci();
                return;
            }
            if (i11 == 5400) {
                this.f75529i2.mo107840A6();
                return;
            }
            if (i11 != 3002 && i11 != 3006 && i11 != 3007) {
                if (i11 == 6097) {
                    if (objArr != null && objArr.length > 0 && ((Integer) objArr[0]).intValue() != 10001) {
                        this.f75529i2.mo107851E1();
                        return;
                    }
                    return;
                }
                String str = "";
                if (i11 == 15000) {
                    if (objArr != null && objArr.length > 0) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        }
                    }
                    if (objArr.length > 2) {
                        Object obj3 = objArr[2];
                        if (obj3 instanceof Boolean) {
                            z11 = ((Boolean) obj3).booleanValue();
                        }
                    }
                    this.f75529i2.mo107878V6(str, z11);
                    return;
                }
                if (i11 == 15001) {
                    if (objArr.length > 0) {
                        Object obj4 = objArr[0];
                        if (obj4 instanceof String) {
                            str = (String) obj4;
                        }
                    }
                    if (objArr.length > 1) {
                        Object obj5 = objArr[1];
                        if (obj5 instanceof Boolean) {
                            z11 = ((Boolean) obj5).booleanValue();
                        }
                    }
                    this.f75529i2.mo107883Xa(str, z11);
                    return;
                }
                if (i11 == 6020 && (interfaceC20707l = this.f75529i2) != null) {
                    interfaceC20707l.mo107655pg();
                    return;
                }
                return;
            }
            m82217eP(CoreUtility.f89233i, this.f76199b1);
            m82217eP(CoreUtility.f89233i, this.f76208k1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SO */
    public /* synthetic */ boolean m82128SO() {
        AbstractC11859g abstractC11859g = this.f76177K1;
        if (abstractC11859g != null && abstractC11859g.m114868x()) {
            return true;
        }
        return false;
    }

    /* renamed from: TO */
    public /* synthetic */ void m82129TO(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        m82929JN(this.f75531k2, this.f75530j2);
    }

    /* renamed from: UO */
    public /* synthetic */ void m82130UO(View view) {
        this.f75529i2.mo107930t7();
    }

    /* renamed from: VO */
    public /* synthetic */ C24848g0 m82131VO() {
        InterfaceC20707l interfaceC20707l = this.f75529i2;
        if (interfaceC20707l != null) {
            interfaceC20707l.mo107933vp();
        }
        return C24848g0.f119245a;
    }

    /* renamed from: WO */
    public /* synthetic */ void m82132WO(String str, InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            this.f75529i2.mo107885Yj(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: XO */
    public /* synthetic */ void m82133XO(String str) {
        try {
            C8050a c8050a = this.f76215r1;
            if (c8050a != null && this.f76214q1 != null) {
                int m43303o0 = c8050a.m43303o0(str);
                int m43302m0 = this.f76215r1.m43302m0(str);
                int m9745c2 = this.f76214q1.m9745c2();
                if ((m43303o0 > -1 && m43303o0 > m9745c2) || (m43302m0 > -1 && m43302m0 > m9745c2)) {
                    this.f76214q1.mo9756v1(m43302m0);
                } else if (m43303o0 > -1) {
                    this.f76214q1.m9721B2(m43303o0, AbstractC23136l9.m118742r(100.0f));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YO */
    public /* synthetic */ void m82134YO() {
        this.f75529i2.mo107900e();
    }

    /* renamed from: aP */
    private void m82135aP(Intent intent, Bundle bundle) {
        if (intent != null && bundle != null) {
            if (bundle.getBoolean("EXTRA_BOOL_FEED_DELETED")) {
                this.f75529i2.mo107889ao(bundle.getString("EXTRA_STRING_FEED_ID", ""));
            } else {
                this.f75529i2.mo107846Co(bundle.getStringArrayList("deletedPhoto"));
            }
        }
    }

    /* renamed from: bP */
    private void m82136bP(Intent intent, Bundle bundle) {
        this.f75529i2.mo107842Bn(bundle.getStringArrayList("deletedPhoto"), intent, bundle.getString("feedId"), bundle.getBoolean("extra_feed_empty_tag"), bundle.getStringArrayList("extra_deleted_tag_uids"));
    }

    /* renamed from: fP */
    private void m82138fP() {
        C23744a.m124114c().m124117e(this, 15000);
        C23744a.m124114c().m124117e(this, 15001);
    }

    /* renamed from: gP */
    public void m82140gP() {
        try {
            C13306b c13306b = this.f76185R1;
            if (c13306b != null) {
                c13306b.m74710v();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h2 */
    private void m82141h2() {
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) m82933NM(AbstractC6918a0.swipe_refresh_layout);
        this.f76212o1 = swipeRefreshListView;
        swipeRefreshListView.setContainerViewSnackBar(this.f76192V0);
        this.f76212o1.m35371s(false, 0, this.f76194W0);
        RecyclerView recyclerView = this.f76212o1.f83582p0;
        this.f76213p1 = recyclerView;
        recyclerView.setBackgroundResource(AbstractC16803z.rectangle_transparent);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f76214q1 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f76213p1.setLayoutManager(this.f76214q1);
        this.f76213p1.setOverScrollMode(2);
        C8050a c8050a = new C8050a(this.f72421L0.m92648SI(), this.f76184R0);
        this.f76215r1 = c8050a;
        c8050a.m43222a0(CoreUtility.f89233i);
        this.f76215r1.m43223b0(this.f76218u1);
        this.f76215r1.m43218W(this);
        this.f76215r1.m43219X(this);
        this.f76215r1.m43225d0(this);
        if (C22013a0.m114928g()) {
            this.f76215r1.m43224c0(this.f76189T1, new C7231u8());
        }
        this.f76215r1.f43972c0 = new C8050a.g() { // from class: com.zing.zalo.ui.zviews.y00
            public /* synthetic */ y00() {
            }

            @Override // com.zing.zalo.feed.adapters.C8050a.g
            /* renamed from: a */
            public final boolean mo43330a() {
                boolean m82128SO;
                m82128SO = MyInfoView.this.m82128SO();
                return m82128SO;
            }
        };
        this.f76213p1.setVisibility(0);
        this.f76213p1.setVerticalScrollBarEnabled(false);
        this.f76213p1.setAdapter(this.f76215r1);
        this.f76214q1.mo9756v1(0);
        this.f76215r1.m43298h0(new ArrayList(), new ArrayList());
        this.f76215r1.m43220Y(new C14677b());
        m82936PN();
        this.f76213p1.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.z00
            public /* synthetic */ z00() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                MyInfoView.this.m82129TO(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        this.f76213p1.m9826E(new C14678c());
        m82945SN(0);
    }

    /* renamed from: hP */
    private void m82143hP() {
        View view = this.f75519Y1;
        if (view != null && this.f75526f2 != null) {
            view.setVisibility(8);
            this.f75519Y1.clearAnimation();
            this.f75519Y1.startAnimation(this.f75526f2);
        }
    }

    /* renamed from: iP */
    private void m82145iP() {
        View view = this.f75519Y1;
        if (view != null && this.f75525e2 != null) {
            view.setVisibility(0);
            this.f75519Y1.clearAnimation();
            this.f75519Y1.startAnimation(this.f75525e2);
        }
    }

    /* renamed from: kP */
    private void m82148kP() {
        View m82933NM = m82933NM(AbstractC6918a0.profile_bottom_functions_layout);
        if (m82933NM != null) {
            m82933NM.setVisibility(8);
        }
    }

    /* renamed from: mP */
    private void m82151mP() {
        if (!m82126PO()) {
            m82145iP();
        }
    }

    /* renamed from: nP */
    private void m82153nP() {
        if (AbstractC23238v2.m119727l()) {
            CameraInputParams cameraInputParams = new CameraInputParams();
            cameraInputParams.f41129s = 0;
            C29046a.f134547b = f75515t2;
            cameraInputParams.f41133u = 2;
            cameraInputParams.f41087F = true;
            if (this.f75529i2.mo107915kp()) {
                cameraInputParams.f41085D = true;
                cameraInputParams.f41138w0 = new SensitiveData("profile_cover_camera", "profile_cover");
            } else {
                cameraInputParams.f41084C = true;
                cameraInputParams.f41138w0 = new SensitiveData("profile_avatar_camera", "profile_avatar");
                cameraInputParams.f41105X = "6";
            }
            AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 5, 1, cameraInputParams);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }

    /* renamed from: xO */
    private void m82163xO() {
        C23744a.m124114c().m124115b(this, 15000);
        C23744a.m124114c().m124115b(this, 15001);
    }

    /* renamed from: yO */
    public void m82164yO(ZaloView zaloView) {
        try {
            C17487o0 m92649TI = m92649TI();
            if (m92649TI != null && AbstractC20826v0.m108782R0(zaloView) && m92649TI.m92999F0() + m92649TI.m93018M0() == 1) {
                this.f75529i2.mo107920o1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: A8 */
    public boolean mo82165A8() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93012K0() != null && m92662fJ().m93012K0().equals(this) && m92672lJ() && m92687sJ()) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: AG */
    public void mo82166AG(ArrayList arrayList) {
        m92662fJ().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(arrayList, 100, MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_select_title)), 1017, 1, true);
    }

    /* renamed from: AO */
    void m82167AO() {
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

    @Override // iq.InterfaceC20712m
    /* renamed from: At */
    public boolean mo82168At() {
        try {
            UserInfoDetailView userInfoDetailView = this.f75518X1;
            if (userInfoDetailView != null && userInfoDetailView.m92687sJ()) {
                if (!this.f75518X1.m92681pJ()) {
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

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        C25470c m131954b;
        super.mo37111CJ(bundle);
        f75516u2++;
        this.f75529i2 = new C20713m0(this);
        if (!AbstractC23138m0.m118770b()) {
            finish();
            return;
        }
        if (m92649TI() != null) {
            m92649TI().m93092y(this.f75537q2);
        }
        m82124NO();
        this.f75529i2.mo995Nd(C20779z1.m108415a(m92642L3()), null);
        if (bundle != null && (i11 = bundle.getInt("extra_presenter_key", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            this.f75529i2.mo107890b(m131954b);
        }
        m82118DO();
        m82119EO();
        try {
            C0697c0.b bVar = C0697c0.Companion;
            bVar.m1052f(this, ZinstantMetaConstant.IMPRESSION_META_TYPE, "my_profile");
            bVar.m1052f(this, "tracking_source", C32017m4.m154326S().m154380z(this.f75529i2.mo107651g()).m40683t() + "");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Cw */
    public void mo82169Cw() {
        m92662fJ().m93069k2(SettingPrivateV2View.class, null, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return m82201ZO(this.f75534n2);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: E6 */
    public void mo82170E6() {
        if (m92672lJ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_getinfo_failed));
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: E9 */
    public void mo82171E9(ItemAlbumMobile itemAlbumMobile, int i11, boolean z11) {
        FeedActionZUtils.m47546d0(m92676n2(), this.f76184R0, itemAlbumMobile, i11, z11, mo82198WM().mo107651g());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 10 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f75522b2 = actionBarMenu.m92738e(AbstractC6918a0.menu_limit_visible_feed, AbstractC16803z.ic_clock2_line_24_white);
            this.f75521a2 = actionBarMenu.m92738e(AbstractC6918a0.menu_drawer, AbstractC16803z.ic_more_24_white);
            ArrayList arrayList = new ArrayList();
            this.f76180N1 = arrayList;
            arrayList.add(this.f75522b2);
            this.f76180N1.add(this.f75521a2);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Ff */
    public void mo82172Ff(boolean z11) {
        int i11;
        View view = this.f76210m1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        return layoutInflater.inflate(AbstractC7409c0.material_user_details_view, viewGroup, false);
    }

    /* renamed from: GO */
    void m82173GO(int i11, Intent intent) {
        boolean booleanExtra;
        String str;
        if (i11 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("extra_result_output_path");
                if (this.f75529i2.mo107915kp()) {
                    booleanExtra = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false);
                } else {
                    booleanExtra = intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true);
                }
                if (this.f75529i2.mo107915kp()) {
                    if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                        String stringExtra2 = intent.getStringExtra("EXTRA_ERROR_MSG");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            mo82976dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                            return;
                        } else {
                            mo82976dj(stringExtra2, 3000);
                            return;
                        }
                    }
                } else if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra3 = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra3)) {
                        mo82976dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                        return;
                    } else {
                        mo82976dj(stringExtra3, 3000);
                        return;
                    }
                }
                if (intent.hasExtra("extra_result_camera_log")) {
                    str = intent.getStringExtra("extra_result_camera_log");
                } else {
                    str = null;
                }
                this.f75529i2.mo107843Bp(stringExtra, booleanExtra, str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: HO */
    public void m82174HO(String str) {
        boolean z11;
        boolean z12;
        boolean z13;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (str.equals(CoreUtility.f89233i)) {
            C22052u.m115085y().m115100t(m115161u);
        }
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

    @Override // iq.InterfaceC20712m
    /* renamed from: I1 */
    public void mo82175I1(boolean z11, boolean z12, int i11, int i12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_ACTION", "4902");
            bundle.putBoolean("EXTRA_ALLOW_RESTORE_LAST_COMPOSE", true);
            if (z12) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(i11);
                bundle.putBoolean("EXTRA_SHOW_EXTERNAL_BG", true);
                bundle.putString("EXTRA_EXTERNAL_TYPO_ID", jSONArray.toString());
            }
            bundle.putString("extra_tracking_source", new TrackingSource(i12).m40686z());
            m92662fJ().m93066i2(UpdateStatusView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
            C29630g.m147299E0().m147319V0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            f75516u2--;
            C8050a c8050a = this.f76215r1;
            if (c8050a != null) {
                c8050a.m43299i0();
                this.f76215r1.m43300j0();
                this.f76215r1.m43312y0();
                this.f76215r1 = null;
            }
            C23528a c23528a = this.f76184R0;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f76184R0 = null;
            }
            this.f75529i2.mo994F2();
            if (m92649TI() != null) {
                m92649TI().m93008I1(this.f75537q2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Ik */
    public void mo82176Ik() {
        m92662fJ().m93069k2(SettingV2View.class, null, 1, true);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Io */
    public void mo82177Io(boolean z11) {
        int i11;
        ImageButton imageButton = this.f76205h1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(imageButton, i11);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Ip */
    public void mo82178Ip(int i11) {
        FrameRoundedLayout frameRoundedLayout = this.f76200c1;
        if (frameRoundedLayout != null) {
            frameRoundedLayout.setVisibility(i11);
        }
        FrameRoundedLayout frameRoundedLayout2 = this.f76201d1;
        if (frameRoundedLayout2 != null) {
            frameRoundedLayout2.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m82138fP();
    }

    /* renamed from: JO */
    void m82179JO(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        mo82976dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        mo82976dj(stringExtra, 3000);
                    }
                } else {
                    this.f75529i2.mo107904ho(GalleryPickerView.m71440ZM(intent), intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 22);
        C23744a.m124114c().m124117e(this, 88);
        C23744a.m124114c().m124117e(this, 3001);
        C23744a.m124114c().m124117e(this, 28);
        C23744a.m124114c().m124117e(this, 5001);
        C23744a.m124114c().m124117e(this, AbstractC26080o.a.f124275b);
        C23744a.m124114c().m124117e(this, 5100);
        C23744a.m124114c().m124117e(this, 6007);
        C23744a.m124114c().m124117e(this, 6008);
        C23744a.m124114c().m124117e(this, 6022);
        C23744a.m124114c().m124117e(this, 5400);
        C23744a.m124114c().m124117e(this, 3002);
        C23744a.m124114c().m124117e(this, 6097);
        C23744a.m124114c().m124117e(this, 3007);
        C23744a.m124114c().m124117e(this, 3006);
        C23744a.m124114c().m124117e(this, 6020);
    }

    /* renamed from: KO */
    void m82180KO(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        mo82976dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                    } else {
                        mo82976dj(stringExtra, 3000);
                    }
                } else {
                    this.f75529i2.mo107909jk(GalleryPickerView.m71440ZM(intent), intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Ke */
    public void mo82181Ke(int i11) {
        try {
            String m17233b = C3432a.f14402a.m17233b();
            if (TextUtils.isEmpty(m17233b)) {
                AbstractC20110a.m104539h(new Exception("Business Account editUrl is empty"));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m17233b);
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
            bundle.putInt("EXTRA_SOURCE_LINK", i11);
            ZaloWebView.m87105iS(m92692wK(), m17233b, bundle);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, iq.InterfaceC20712m
    /* renamed from: LF */
    public void mo82182LF(ImageView imageView, C23528a c23528a, String str, Bundle bundle, C20275e c20275e, int i11, C3020p0 c3020p0) {
        m82232oP(bundle);
        super.mo82182LF(imageView, c23528a, str, bundle, c20275e, i11, c3020p0);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: LM */
    protected void mo82183LM(C26209i c26209i, String str, C28212v6 c28212v6) {
        str.hashCode();
        if (str.equals("tip.profile.limitfeedview")) {
            this.f75529i2.mo107888al(c28212v6);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        SwipeRefreshListView swipeRefreshListView;
        if (super.mo37488Li() && !m82228mc() && !mo82168At() && (swipeRefreshListView = this.f76212o1) != null && !swipeRefreshListView.m35363j()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: M2 */
    public void mo11925M2(C3000l0 c3000l0) {
        FeedAsyncFailedPopupView m87736kL = FeedAsyncFailedPopupView.m87736kL(c3000l0.f11895q, c3000l0.f11892o0, new C14680e(c3000l0));
        this.f75517W1 = m87736kL;
        if (m87736kL != null) {
            m87736kL.m92602UK(this.f72421L0.m92649TI(), "FeedAsyncFailedPopupView");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: NN */
    protected void mo82184NN(C22033k0.g gVar) {
        InterfaceC20707l interfaceC20707l = this.f75529i2;
        if (interfaceC20707l != null) {
            interfaceC20707l.mo107855F8(gVar);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m82239to();
        this.f75532l2 = true;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f75529i2.mo107902fd(C20779z1.m108415a(m92642L3));
            m82120FO(this.f75529i2.mo107841An());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: PM */
    protected Map mo82185PM() {
        return this.f75531k2;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Pi */
    public void mo82186Pi() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("qrcode_type_view", QRCodeViewerView.EnumC14816e.MY_QRCODE);
        m92662fJ().m93069k2(QRCodeViewerView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_drawer) {
            AbstractC23047d8.m118262n();
            m82253zp();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_limit_visible_feed) {
            this.f75529i2.mo107930t7();
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QO */
    public boolean m82187QO() {
        View view = this.f75524d2;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] - this.f76196Y0 > 0) {
            return false;
        }
        return true;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Qj */
    public void mo82188Qj(String str, int i11) {
        FeedActionZUtils.m47553k(str, i11, this.f75535o2);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Qq */
    public void mo82189Qq(boolean z11) {
        ActionBarMenuItem actionBarMenuItem = this.f75522b2;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnableNoti(z11);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: R7 */
    public boolean mo82190R7() {
        if (this.f76205h1.getVisibility() == 0) {
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
            mo49315c4();
            m82977eO(false);
            m82251zO(AbstractC1785o.a.ON_PAUSE);
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
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    }
                } else {
                    ProfileMusicView profileMusicView2 = this.f76223z1;
                    if (profileMusicView2 != null) {
                        profileMusicView2.m44479e(i11, this.f75529i2.mo107845Ce(), C32036n8.m154515e().m154519c());
                        return;
                    }
                    return;
                }
            } else {
                if (this.f76223z1 != null && this.f75529i2.mo107871T0() != null) {
                    this.f76223z1.m44479e(i11, this.f75529i2.mo107871T0(), C32036n8.m154515e().m154520d(CoreUtility.f89233i, this.f75529i2.mo107871T0().m129490f()));
                    return;
                }
                return;
            }
        }
        ProfileMusicView profileMusicView3 = this.f76223z1;
        if (profileMusicView3 != null) {
            profileMusicView3.m44479e(i11, null, false);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: S6 */
    public void mo82192S6(String str, int i11, C32002l4 c32002l4) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                bundle.putInt("extra_album_type", i11);
                bundle.putBoolean("extra_is_mode_pick_avatar", false);
                bundle.putBoolean("extra_bol_only_show_grid_photo", true);
                if (c32002l4 != null) {
                    if (m82228mc()) {
                        c32002l4 = c32002l4.m154284u(34);
                    }
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 1053, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            bundle.putInt("extra_presenter_key", C25471d.m131951c().m131953a(this.f75529i2.mo107894c()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) this.f88760a0.m92717l(AbstractC7409c0.profile_avatar_layout);
            this.f76207j1 = trackingRelativeLayout;
            Avatar avatar = (Avatar) trackingRelativeLayout.findViewById(AbstractC6918a0.imvAvatar);
            this.f76208k1 = avatar;
            avatar.m90481x(m92689tK(), EnumC16949e.SIZE_32);
            this.f76207j1.setIdTracking("social_profile_mini_avatar");
            this.f76207j1.setTrackingExtraData(m82932MM(CoreUtility.f89233i));
            FrameRoundedLayout frameRoundedLayout = (FrameRoundedLayout) this.f76207j1.findViewById(AbstractC6918a0.rounded_warning);
            this.f76201d1 = frameRoundedLayout;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) frameRoundedLayout.findViewById(AbstractC6918a0.rounded_warning_img);
            if (this.f76201d1.getLayoutParams() != null && aspectRatioImageView != null && aspectRatioImageView.getLayoutParams() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f76201d1.getLayoutParams();
                int i11 = AbstractC23222t7.f112586t;
                layoutParams.width = i11;
                layoutParams.height = i11;
                layoutParams.setMargins(0, 0, 0, AbstractC23222t7.f112566j);
                this.f76201d1.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aspectRatioImageView.getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, 0);
                int i12 = AbstractC23222t7.f112586t;
                layoutParams2.width = i12;
                layoutParams2.height = i12;
                aspectRatioImageView.setLayoutParams(layoutParams2);
                aspectRatioImageView.setBackground(AbstractC23136l9.m118665N(m92689tK(), AbstractC23322a.zds_ic_warning_circle_solid_16));
            }
            ((FrameRoundedLayout) this.f76207j1.findViewById(AbstractC6918a0.rounded_avatar_frame)).setBackground(AbstractC1388a.m6964f(m92689tK(), AbstractC17466e.transparent));
            m82217eP(CoreUtility.f89233i, this.f76208k1);
            this.f76209l1 = this.f76207j1.findViewById(AbstractC6918a0.pbUploadAvatar);
            View findViewById = this.f76207j1.findViewById(AbstractC6918a0.btnRetryUploadAvatar);
            this.f76210m1 = findViewById;
            findViewById.setOnClickListener(this);
            m82972aO();
            this.f75529i2.mo107872Tb();
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Th */
    public void mo82193Th() {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileCoverBottomSheet.class, bundle, 1400, 0, true);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: UF */
    public void mo82194UF() {
        C3427f m82967YM = m82967YM();
        if (m82967YM != null) {
            m82967YM.m17210t();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            if (this.f75523c2) {
                this.f76213p1.m9837K1(0);
                this.f75523c2 = false;
            }
            this.f75529i2.mo107654pb();
            C32017m4.m154326S().m154353b0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0004. Please report as an issue. */
    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: V */
    public void mo82195V(int i11) {
        try {
            if (i11 != 14) {
                switch (i11) {
                    case 31:
                        this.f75529i2.mo107913ke();
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        this.f75529i2.mo107866P6();
                        break;
                    case 33:
                        this.f75529i2.mo107877V5();
                        break;
                    case 34:
                        this.f75529i2.mo107879Wi();
                        break;
                    case 35:
                        this.f75529i2.mo107849D7();
                        break;
                    case 36:
                        this.f75529i2.mo107911k6();
                        break;
                    case 37:
                        this.f75529i2.mo107923om();
                        break;
                    case 38:
                        this.f75529i2.mo107922o6();
                        break;
                    default:
                        return;
                }
            } else {
                this.f75529i2.mo107882X4();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: V1 */
    public void mo82196V1() {
        ContactProfile contactProfile;
        UserInfoView userInfoView = this.f75528h2;
        if (userInfoView != null && (contactProfile = AbstractC23304d.f113368c0) != null) {
            userInfoView.m86377wM(contactProfile, false, false, contactProfile.f42437s, false);
        }
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
            m82251zO(AbstractC1785o.a.ON_STOP);
            C32017m4.m154326S().m154355c0(this.f75529i2.mo107649Wh(), CoreUtility.f89233i);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Vv */
    public void mo82197Vv(ArrayList arrayList) {
        Bundle m83055pM = ProfilePickerView.m83055pM(arrayList, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
        m83055pM.putBoolean("extra_show_text_instead_icon", true);
        m83055pM.putBoolean("extra_type_exclude_friends", true);
        m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 1020, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: WM */
    InterfaceC20650a mo82198WM() {
        return this.f75529i2;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: X */
    public void mo11940X(C3000l0 c3000l0) {
        boolean z11;
        String m118743r0;
        String m118743r02;
        int i11;
        String str;
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
        aVar.m43159h(7).m43162k(m118743r0).m43165n(m118743r03, new InterfaceC17463d.b()).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.w00

            /* renamed from: q */
            public final /* synthetic */ String f82466q;

            public /* synthetic */ w00(String str2) {
                r2 = str2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                MyInfoView.this.m82132WO(r2, interfaceC17463d, i12);
            }
        });
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f76179M1;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
        this.f76179M1 = aVar.m43152a();
        m82955UN();
        this.f76179M1.mo13822K();
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: XA */
    public void mo82199XA() {
        C32065p8.m154684c().m154698n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
            this.f72421L0.m92676n2().mo35554O(32);
        }
        if (z11) {
            if ((!z12 || this.f72421L0.m92683qJ()) && !this.f75532l2) {
                this.f76218u1 = false;
                C8050a c8050a = this.f76215r1;
                if (c8050a != null) {
                    c8050a.m43223b0(false);
                }
                this.f75529i2.mo107854F3();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        super.mo49153YJ(z11, z12);
        if (z11 && !z12) {
            this.f76218u1 = true;
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Yn */
    public boolean mo82200Yn() {
        if (this.f76204g1.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Ys */
    public void mo11942Ys(C3000l0 c3000l0, String str, boolean z11) {
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(4);
        bottomSheetMenuBundleData.m45507h(this.f75529i2.mo107644H9(c3000l0, z11));
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1051, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Context context;
        int i11;
        ZaloView m92996E0;
        super.mo37125ZJ(view, bundle);
        this.f76184R0 = new C23528a(this.f72421L0.m92648SI());
        if (C23212s8.m119603k()) {
            context = getContext();
            i11 = AbstractC16803z.profile_bg_action_bar;
        } else {
            context = getContext();
            i11 = AbstractC16803z.stencil_bg_action_bar;
        }
        this.f76206i1 = AbstractC23136l9.m118665N(context, i11);
        m82983iN();
        m82978fN();
        m82985jN(CoreUtility.f89233i);
        m82982hN();
        m82141h2();
        m82217eP(CoreUtility.f89233i, this.f76199b1);
        m82223jP();
        mo82973bO();
        mo83000qh();
        m82226lP();
        m82148kP();
        AbstractC23126l.m118627a("MyInfoActivity");
        this.f75529i2.mo107656qb();
        boolean m92683qJ = this.f72421L0.m92683qJ();
        this.f75523c2 = m92683qJ;
        if (m92683qJ && (m92996E0 = this.f72421L0.m92649TI().m92996E0("UserInfoDetailView")) != null && (m92996E0 instanceof UserInfoDetailView)) {
            this.f75518X1 = (UserInfoDetailView) m92996E0;
        }
        this.f76185R1.m74687C((ViewGroup) this.f72421L0.m92656bJ());
        m82120FO(this.f75529i2.mo107841An());
        m82163xO();
    }

    /* renamed from: ZO */
    public KeyEventCallbackC17462c m82201ZO(C3046v c3046v) {
        int i11 = c3046v.f12274a;
        if (i11 == 8) {
            return m82116CO(c3046v);
        }
        if (i11 == 9) {
            return C24355e0.f117560a.m127360h(m92689tK(), new InterfaceC18494a() { // from class: com.zing.zalo.ui.zviews.x00
                public /* synthetic */ x00() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    C24848g0 m82131VO;
                    m82131VO = MyInfoView.this.m82131VO();
                    return m82131VO;
                }
            });
        }
        return null;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Zb */
    public void mo82202Zb(String str) {
        com.zing.zalo.zdesign.component.Snackbar m90634w = com.zing.zalo.zdesign.component.Snackbar.m90634w(m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_remove_music), -1);
        m90634w.m90645K(AbstractC23136l9.m118742r(12.0f));
        m90634w.m90648N();
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: Zx */
    public void mo82203Zx(C28209v3 c28209v3) {
        FeedActionZUtils.m47541b(this, c28209v3);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: aI */
    public void mo82204aI(C3046v c3046v) {
        this.f75534n2 = c3046v;
        showDialog(c3046v.f12274a);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: aN */
    protected String[] mo82205aN() {
        return AbstractC28025b8.f130858o;
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, iq.InterfaceC20656b
    /* renamed from: ad */
    public void mo82206ad(C3020p0 c3020p0, C3000l0 c3000l0, boolean z11) {
        C17487o0 c17487o0;
        int i11;
        if (m92676n2() != null) {
            c17487o0 = m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        C17487o0 c17487o02 = c17487o0;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
        bundle.putString("EXTRA_FEED_CONTENT_JSON", AbstractC20826v0.m108827p(c3000l0).toString());
        if (z11) {
            i11 = IMediaPlayer.MEDIA_INFO_HAVE_SUBTITLE_STREAM;
        } else {
            i11 = 10001;
        }
        bundle.putString("EXTRA_ENTRY_POINT_CHAIN", C32002l4.m154264g(i11).m154277l());
        if (c17487o02 != null) {
            c17487o02.m93066i2(EditFeedView.class, bundle, 1013, 1, true);
        }
        AbstractC23647d.m123897g("6514");
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: am */
    public void mo82207am() {
        AbstractC28207v1.m141994i3("action.open.editbio", 4, this.f72421L0.m92676n2(), this.f72421L0, "", null);
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoDetailView.InterfaceC15314f
    /* renamed from: b0 */
    public void mo82208b0(boolean z11) {
        this.f75529i2.mo107891b0(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: b1 */
    public void mo11946b1() {
        this.f75529i2.mo107892b1();
    }

    @Override // com.zing.zalo.p077ui.zviews.UserInfoView.InterfaceC15317c
    /* renamed from: b2 */
    public void mo82209b2(int i11, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: bN */
    public C26209i mo82210bN(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1779299599:
                if (str.equals("tip.profile.avatar")) {
                    c11 = 0;
                    break;
                }
                break;
            case -685523610:
                if (str.equals("tip.profile.limitfeedview")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1915055895:
                if (str.equals("tip.edit.bio")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                if (!m82125OO()) {
                    return new C26209i(this.f76199b1);
                }
                return null;
            case 1:
                ActionBarMenuItem actionBarMenuItem = this.f75522b2;
                if (actionBarMenuItem != null && actionBarMenuItem.isShown()) {
                    return new C26209i(this.f75522b2);
                }
                break;
            case 2:
                View view = this.f76211n1;
                if (view != null && view.isShown()) {
                    return new C26209i(this.f76211n1);
                }
                break;
        }
        return super.mo82210bN(str);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: cN */
    protected Map mo82211cN() {
        return this.f75530j2;
    }

    /* renamed from: cP */
    public void m82212cP(String str) {
        C17487o0 mo35579p;
        this.f75529i2.mo107917lp();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 1300, 0, true);
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        try {
            InterfaceC20707l interfaceC20707l = this.f75529i2;
            if (interfaceC20707l == null || TextUtils.isEmpty(interfaceC20707l.mo107929t3())) {
                return "";
            }
            return this.f75529i2.mo107929t3();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: dD */
    public void mo82213dD(boolean z11) {
        int i11;
        View view = this.f76204g1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView
    /* renamed from: dO */
    void mo82214dO(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(10, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    /* renamed from: dP */
    public void m82215dP(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        bundle.putStringArrayList("path", arrayList);
        bundle.putString("EXTRA_SONG_ID", str);
        bundle.putBoolean("EXTRA_IS_POST_PROFILE_MUSIC", true);
        bundle.putString("extra_tracking_source", str3);
        m92676n2().mo35581q(UpdateStatusView.class, bundle, 0, 1, true);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: eC */
    public void mo82216eC() {
        try {
            C28212v6 m141453i = AbstractC28025b8.m141453i("tip.timeline.createstory");
            if (m141453i != null && m141453i.f131580f) {
                m141453i.f131580f = false;
                m141453i.f131579e = false;
                AbstractC28025b8.m141437H(m141453i);
            }
            m82939QN(new TrackingSource(4));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: eP */
    public void m82217eP(String str, Avatar avatar) {
        boolean z11;
        boolean z12;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (m115161u != null && str.equals(CoreUtility.f89233i)) {
            C22052u.m115085y().m115100t(m115161u);
        }
        if (avatar != null) {
            int i11 = 0;
            if (m115161u != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m115161u != null && !m115161u.f147026s) {
                z12 = true;
            } else {
                z12 = false;
            }
            avatar.m90482y(z11, z12);
            if (!C22052u.m115085y().m115105z()) {
                i11 = 4;
            }
            mo82178Ip(i11);
            if (C22052u.m115085y().m115087B() || C22052u.m115085y().m115086A()) {
                avatar.setStateUploadingStory(true);
                this.f75539s2 = true;
            }
        }
    }

    @Override // iq.InterfaceC20656b
    /* renamed from: f5 */
    public void mo82218f5() {
        this.f76186S0.postDelayed(this.f75527g2, 400L);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: fm */
    public void mo82219fm() {
        C22499f m110205h = AbstractC23306f.m120583H().m110205h();
        if (m110205h != null) {
            m110205h.m116339o("", CoreUtility.f89233i, AbstractC23933a.m125288c(m110205h.m116333i()), 0);
            AbstractC23152n3.m119080y0(MainApplication.getAppContext(), this.f72421L0.m92676n2(), m110205h);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f75515t2;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: h7 */
    public void mo82220h7() {
        m92662fJ().m93069k2(SettingAccountAndSecurityV2View.class, null, 1, true);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: hH */
    public void mo82221hH(boolean z11) {
        this.f75539s2 = z11;
        Avatar avatar = this.f76199b1;
        if (avatar != null) {
            avatar.setStateUploadingStory(z11);
            if (!z11) {
                this.f76199b1.m90482y(true, true);
            }
        }
        Avatar avatar2 = this.f76208k1;
        if (avatar2 != null) {
            avatar2.setStateUploadingStory(z11);
            if (!z11) {
                this.f76208k1.m90482y(true, true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: i7 */
    public void mo11956i7() {
        this.f75529i2.mo107893bj();
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
        super.mo11957ig(c3000l0, i11, c17391z, i12, view, view2);
        AbstractC23647d.m123897g("6552");
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: ix */
    public void mo82222ix(boolean z11) {
        Snackbar m133792e = C25973p.f123927a.m133792e(this.f76192V0, this.f75533m2, z11);
        if (m133792e != null) {
            View m88025i = m133792e.m88025i();
            if (m88025i.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) m88025i.getLayoutParams();
                layoutParams.setMargins(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f));
                m88025i.setLayoutParams(layoutParams);
            }
            m133792e.m88032u(new C14679d());
            m133792e.m88019B();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: jM */
    public int mo79521jM(Class cls) {
        if (ProfileAlbumDetailView.class.isAssignableFrom(cls)) {
            return 1060;
        }
        return super.mo79521jM(cls);
    }

    /* renamed from: jP */
    void m82223jP() {
        this.f76212o1.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.u00
            public /* synthetic */ u00() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                MyInfoView.this.m82134YO();
            }
        });
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: k2 */
    public void mo82224k2(String str) {
        int i11;
        int height;
        int i12;
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (m115161u != null) {
            m115161u.m153811A(true);
            if (!AbstractC22055v0.m115112B(str) && !this.f75539s2) {
                Avatar avatar = this.f76199b1;
                if (avatar != null) {
                    avatar.setStateLoadingStory(true);
                }
                Avatar avatar2 = this.f76208k1;
                if (avatar2 != null) {
                    avatar2.setStateLoadingStory(true);
                }
            }
            int[] iArr = new int[2];
            Avatar avatar3 = this.f76199b1;
            if (avatar3 != null) {
                avatar3.getLocationOnScreen(iArr);
            }
            int i13 = 0;
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
            AbstractC22055v0.m115124N(m115161u, this, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 361, null, new C14684i(str), i13, i12);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: k8 */
    public void mo82225k8(int i11, String str) {
        C23283z7.m120379l(this.f72421L0.m92676n2(), str, C27280g.m139660c(m92689tK(), i11, AbstractC2807a.snackbar_icon), Integer.valueOf(AbstractC23136l9.m118742r(12.0f)));
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: kM */
    public FeedActionZUtils.InterfaceC8913k mo79522kM() {
        if (this.f75535o2 == null) {
            this.f75535o2 = new C14681f();
        }
        return this.f75535o2;
    }

    /* renamed from: lP */
    void m82226lP() {
        ((ViewStub) m82933NM(AbstractC6918a0.stub_user_details_bottom_bar)).inflate();
        this.f75519Y1 = m82933NM(AbstractC6918a0.user_details_bottom_bar_container);
        TextView textView = (TextView) m82933NM(AbstractC6918a0.imgButtonUpdateStatus);
        this.f75520Z1 = textView;
        textView.setOnClickListener(this);
        this.f76183Q1.f76246q = this.f75520Z1;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: mD */
    public void mo82227mD() {
        try {
            String[] m118179t = AbstractC23034c6.m118179t();
            if (AbstractC23034c6.m118167n(m92686rK(), m118179t) != 0) {
                AbstractC23034c6.m118184v0(this, m118179t, 111);
            } else {
                m82153nP();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
        m82232oP(bundle);
        super.mo11963mE(animationTarget, c23528a, str, c20275e, bundle, i11, c3020p0);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: mM */
    public void mo79524mM() {
        this.f75529i2.mo107925r7();
    }

    /* renamed from: mc */
    public boolean m82228mc() {
        UserInfoView userInfoView = this.f75528h2;
        if (userInfoView != null && userInfoView.m92674mJ()) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: mw */
    public void mo82229mw(String str, String str2) {
        C17487o0 mo35579p;
        this.f75529i2.mo107917lp();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PROFILE_UID", str);
        bundle.putString("EXTRA_OPTION_VARIANT", str2);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileAvatarBottomSheet.class, bundle, 1300, 0, true);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: nu */
    public void mo82230nu(boolean z11) {
        int i11;
        View view = this.f76209l1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: nv */
    public void mo82231nv() {
        this.f75524d2 = null;
    }

    /* renamed from: oP */
    protected void m82232oP(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("EXTRA_BOL_ALLOW_DISABLE_BACK_ANIM", true);
            bundle.putBoolean("fromMyProfile", true);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: oc */
    public void mo82233oc() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_avatar", "profile_avatar"));
        AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), 1011, 1, true, bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        MusicSelectResult m133690a;
        try {
            if (i11 == 5) {
                m82239to();
                m82173GO(i12, intent);
            } else if (i11 == 68) {
                if (i12 == -1) {
                    Bundle extras = intent.getExtras();
                    this.f75529i2.mo107907ig(C22579r0.m116835b(extras), extras);
                }
            } else if (i11 == 10000) {
                if (i12 == -1) {
                    if (intent != null && intent.getExtras() != null) {
                        m82136bP(intent, intent.getExtras());
                    }
                    this.f75529i2.mo107875Ud();
                    this.f75529i2.mo107857G4();
                    return;
                }
            } else if (i11 == 10014) {
                if (i12 == -1) {
                    Bundle extras2 = intent.getExtras();
                    this.f75529i2.mo107884Xk(extras2.getBoolean("EXTRA_BOOL_FEED_DELETED"), intent, extras2.getString("EXTRA_STRING_FEED_ID"));
                }
            } else if (i11 == 1005) {
                if (i12 == -1) {
                    this.f75529i2.mo107876Uo(intent.getBooleanExtra("extra_dpn_changed", false));
                }
            } else if (i11 == 1006) {
                if (i12 == -1 && intent != null) {
                    this.f75529i2.mo107937zb(intent.getStringExtra("extra_feed_id"), TagsListView.m84991sM(intent), TagsListView.m84989oM(intent));
                }
            } else {
                Bundle bundle = null;
                if (i11 == 1052) {
                    if (i12 == -1) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        if (bundle != null) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("deletedPhoto");
                            if (stringArrayList != null) {
                                this.f75529i2.mo107873Th(stringArrayList);
                            }
                            boolean z11 = bundle.getBoolean("EXTRA_BOOL_FEED_DELETED");
                            if (z11) {
                                this.f75529i2.mo107884Xk(z11, intent, bundle.getString("EXTRA_STRING_FEED_ID"));
                            }
                        }
                    }
                } else if (i11 == 1001) {
                    if (i12 == -1) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        if (bundle != null) {
                            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("deletedPhoto");
                            if (stringArrayList2 != null) {
                                this.f75529i2.mo107896cg(stringArrayList2);
                            }
                            boolean z12 = bundle.getBoolean("EXTRA_BOOL_FEED_DELETED");
                            if (z12) {
                                this.f75529i2.mo107884Xk(z12, intent, bundle.getString("EXTRA_STRING_FEED_ID"));
                            }
                        }
                    }
                } else if (i11 == 1011) {
                    m82239to();
                    m82179JO(i12, intent);
                } else if (i11 == 1012) {
                    m82239to();
                    m82180KO(i12, intent);
                } else {
                    if (i11 != 1017 && i11 != 1018) {
                        if (i11 == 1019) {
                            FeedActionZUtils.m47515C(i12, intent, mo79522kM());
                        } else if (i11 == 1013) {
                            if (i12 == -1 && intent != null) {
                                EditFeedView.m79360fU(intent);
                                this.f75529i2.mo107934y1();
                            }
                        } else if (i11 == 2000) {
                            this.f75529i2.mo107912kd();
                        } else if (i11 == 1020) {
                            FeedActionZUtils.m47516D(i12, intent, mo79522kM(), this);
                        } else if (i11 == 1050) {
                            if (i12 == -1 && intent != null && (m133690a = AbstractC25952c.m133690a(intent)) != null && intent.getExtras() != null) {
                                this.f75529i2.mo107926ra(m133690a.m45749b(), intent.getIntExtra("extra_tracking_source", 0));
                            }
                        } else if (i11 == 12200) {
                            if (i12 == -1) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
                            }
                        } else if (i11 != 1053) {
                            if (i11 == 1060) {
                                if (i12 == -1 && intent != null) {
                                    m82135aP(intent, intent.getExtras());
                                }
                            } else if (i11 == 1051) {
                                if (i12 == -1 && intent != null) {
                                    m82975dN(intent);
                                }
                            } else if (i11 == 1200) {
                                if (i12 == -1 && intent != null) {
                                    m82121IO(intent);
                                }
                            } else if (i11 == 500) {
                                if (i12 == -1 && intent != null) {
                                    m82174HO(CoreUtility.f89233i);
                                }
                            } else if (i11 == 1300) {
                                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                                    int intExtra = intent.getIntExtra("EXTRA_TYPE_OPTION", 0);
                                    if (intExtra == 0) {
                                        this.f75529i2.mo107863O4(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                                    } else if (intExtra == 1) {
                                        this.f75529i2.mo107924pn(intent.getStringExtra("EXTRA_ACTION_TYPE"), intent.getStringExtra("EXTRA_ACTION_DATA"));
                                    }
                                }
                            } else if (i11 == 1400) {
                                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                                    this.f75529i2.mo107899de(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                                }
                            } else if (i11 == 1314) {
                                if (i12 == 1302) {
                                    this.f75529i2.mo107859Ig();
                                } else if (i12 == 1301) {
                                    this.f75529i2.mo107848D4();
                                } else if (i12 != 1303) {
                                    if (i12 == 1304) {
                                        this.f75529i2.mo107932vj(intent.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL));
                                    } else if (i12 == 1305) {
                                        o70.m87382b(this, intent.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), intent.getStringExtra("song_id"), 10000L, new TrackingSource(42).m40686z());
                                    }
                                }
                            }
                        }
                    }
                    FeedActionZUtils.m47517E(i12, intent, mo79522kM());
                }
            }
            this.f72421L0.m92643OI(i11, i12, intent);
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f75515t2, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.layoutAvatar) {
                m82235pP(CoreUtility.f89233i);
            } else if (id2 == AbstractC6918a0.btnRetryUploadAvatar) {
                this.f75529i2.mo107880Wl();
            } else if (id2 == AbstractC6918a0.imgButtonUpdateStatus) {
                this.f75529i2.mo107928s1();
            } else if (id2 == AbstractC6918a0.user_details_functions_sticky_music) {
                this.f75529i2.mo107861M1();
            } else if (id2 == AbstractC6918a0.btn_close_sticky_music) {
                this.f75529i2.mo107638Cl();
            } else if (id2 == 8000000) {
                AbstractC23647d.m123897g("6101");
                super.onClick(view);
            } else {
                super.onClick(view);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        UserInfoDetailView userInfoDetailView;
        try {
            if (C25979a.m133814e(this.f72421L0, i11, keyEvent) || this.f72421L0.m78934CL(i11, keyEvent)) {
                return true;
            }
            C8050a c8050a = this.f76215r1;
            if ((c8050a != null && c8050a.m43313z0(i11, keyEvent)) || super.onKeyUp(i11, keyEvent)) {
                return true;
            }
            if (i11 == 4) {
                if (mo82168At() && (userInfoDetailView = this.f75518X1) != null && userInfoDetailView.onKeyUp(i11, keyEvent)) {
                    return true;
                }
                if (m82228mc()) {
                    m82239to();
                    return true;
                }
                if (AbstractC23304d.f113383f1) {
                    Intent intent = new Intent();
                    if (m92642L3() != null) {
                        intent.putExtras(m92642L3());
                    }
                    this.f72421L0.mo50035CK(-1, intent);
                }
                finish();
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        try {
            if (i11 == 111) {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118179t()) == 0) {
                    m82153nP();
                }
            } else if (i11 == 125) {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112030g) == 0) {
                    AbstractC3102n.m15597p(this.f72421L0);
                } else {
                    AbstractC23034c6.m118162k0(this, 125);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        try {
            super.onResume();
            this.f76215r1.m43283B0();
            this.f75529i2.onResume();
            m82167AO();
            mo82203Zx(AbstractC23304d.f113304M2);
            m82977eO(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: oo */
    public void mo82234oo(int i11, C32002l4 c32002l4) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                AbstractC25951b.m133689b(bundle, new MusicSelectParam(C32002l4.m154267j(c32002l4), -1));
                bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 9);
                bundle.putInt("extra_tracking_source", i11);
                m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1050, 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: pM */
    public void mo79526pM(C3020p0 c3020p0) {
        this.f75529i2.mo107903hh(c3020p0);
    }

    /* renamed from: pP */
    public void m82235pP(String str) {
        boolean z11 = false;
        if (C19172a.m100600k("profile@self_avatar@open_on_click", 0) != 1) {
            z11 = true;
        }
        C31980jc m115161u = AbstractC22055v0.m115161u(str);
        if (m115161u == null && C23302b.f113247a.m120523d(this.f75529i2.mo107858Ha())) {
            m82212cP(str);
            return;
        }
        if (m115161u != null && (!m115161u.f147016A || !m115161u.m153819a())) {
            if (!m115161u.f147026s) {
                if (z11) {
                    mo82224k2(str);
                    return;
                } else {
                    m82212cP(str);
                    return;
                }
            }
            m82212cP(str);
            return;
        }
        m82212cP(str);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: pm */
    public void mo82236pm(boolean z11, String str, boolean z12, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("user_id", CoreUtility.f89233i);
        bundle.putString("song_id", this.f75529i2.mo107929t3());
        bundle.putBoolean("is_ready", true);
        bundle.putString("footer_info", "");
        bundle.putBoolean("is_show_snack_bar", z12);
        bundle.putString("snack_bar_msg", str2);
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", this.f75529i2.mo107929t3());
        m92649TI().m93021N0().mo35581q(ProfileMusicBottomSheet.class, bundle, 1314, 1, true);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: pu */
    public void mo82237pu(String str) {
        this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.b10

            /* renamed from: q */
            public final /* synthetic */ String f79869q;

            public /* synthetic */ b10(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyInfoView.this.m82133XO(r2);
            }
        });
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: sz */
    public void mo82238sz() {
        if (this.f75518X1 == null) {
            this.f75518X1 = new UserInfoDetailView();
            Bundle bundle = new Bundle();
            bundle.putString("extra_contact_uid", AbstractC23304d.f113368c0.f42434r);
            this.f75518X1.mo60305zK(bundle);
        }
        this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.root_backgroundmain, this.f75518X1, 0, "UserInfoDetailView", 1, false);
    }

    /* renamed from: to */
    public void m82239to() {
        try {
            if (this.f75528h2 != null) {
                this.f72421L0.m92649TI().mo92702G1(this.f75528h2, 2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: ts */
    public void mo82240ts(int i11) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("extra_from_feed_remind_media_type", i11);
                bundle.putString("extra_tracking_source", new TrackingSource(27).m40686z());
                m92662fJ.m93069k2(UpdateStatusView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: uf */
    public void mo82241uf(String str) {
        C17487o0 mo35579p;
        this.f75529i2.mo107874Tj();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_OPTION_VARIANT", str);
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(ProfileCoverBottomSheet.class, bundle, 1400, 0, true);
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: ur */
    public void mo82242ur() {
        AbstractC23152n3.m119040e0(m92676n2(), this, C18620i.f93672O);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: ve */
    public void mo82243ve() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putString("STR_QUICK_ACCESS_VISIBLE_ACTION_TYPE", "");
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: vx */
    public void mo82244vx() {
        m82217eP(CoreUtility.f89233i, this.f76199b1);
        m82217eP(CoreUtility.f89233i, this.f76208k1);
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: wj */
    public void mo82245wj() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_profile_cover", "profile_cover"));
        AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), 1012, 2, true, bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        this.f76186S0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.a10

            /* renamed from: q */
            public final /* synthetic */ int f79762q;

            /* renamed from: r */
            public final /* synthetic */ Object[] f79763r;

            public /* synthetic */ a10(int i112, Object[] objArr2) {
                r2 = i112;
                r3 = objArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyInfoView.this.m82127RO(r2, r3);
            }
        });
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: xI */
    public void mo82246xI() {
        try {
            if (!AbstractC23309i.m121565We()) {
                ToastUtils.m89266n(AbstractC8020f0.feature_is_not_supported_on_device, new Object[0]);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("extra_from_feed_remind", true);
            bundle.putInt("extra_from_feed_remind_media_type", 2);
            m92662fJ().m93069k2(UpdateStatusView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("UserInfoView");
        if (m92996E0 instanceof UserInfoView) {
            this.f75528h2 = (UserInfoView) m92996E0;
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: y */
    public String mo82247y() {
        return this.f72829D0;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: y0 */
    public boolean mo82248y0() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93012K0() != null && AbstractC20826v0.m108784S0(m92662fJ().m93012K0())) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: yy */
    public void mo82249yy() {
        if (m92672lJ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
        }
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: yz */
    public void mo82250yz(C32002l4 c32002l4) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 7);
        bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1200, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 22);
        C23744a.m124114c().m124115b(this, 88);
        C23744a.m124114c().m124115b(this, 3001);
        C23744a.m124114c().m124115b(this, 28);
        C23744a.m124114c().m124115b(this, 5001);
        C23744a.m124114c().m124115b(this, AbstractC26080o.a.f124275b);
        C23744a.m124114c().m124115b(this, 5100);
        C23744a.m124114c().m124115b(this, 6007);
        C23744a.m124114c().m124115b(this, 6008);
        C23744a.m124114c().m124115b(this, 6022);
        C23744a.m124114c().m124115b(this, 5400);
        C23744a.m124114c().m124115b(this, 3002);
        C23744a.m124114c().m124115b(this, 6097);
        C23744a.m124114c().m124115b(this, 3007);
        C23744a.m124114c().m124115b(this, 3006);
        C23744a.m124114c().m124115b(this, 6020);
    }

    /* renamed from: zO */
    public void m82251zO(AbstractC1785o.a aVar) {
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
                this.f75529i2.mo107865P0();
                return;
            }
            return;
        }
        this.f75529i2.mo107865P0();
    }

    @Override // iq.InterfaceC20712m
    /* renamed from: zh */
    public void mo82252zh() {
        m92662fJ().m93066i2(PrivacyPickGroupView.class, null, 1017, 1, true);
    }

    /* renamed from: zp */
    void m82253zp() {
        try {
            if (this.f75528h2 == null) {
                this.f75528h2 = new UserInfoView();
            }
            this.f72421L0.m92649TI().m93060e2(AbstractC6918a0.root_backgroundmain, this.f75528h2, "UserInfoView", 2, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
