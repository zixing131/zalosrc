package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.C0708i;
import ac.C0732w;
import ac.InterfaceC0733x;
import ag0.C0820h;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import ao.InterfaceC2266h;
import ar.AbstractC2298a0;
import ar.C2301c;
import ar.C2310k;
import ar.C2312m;
import ar.C2314o;
import ar.C2321v;
import as.InterfaceC2333h;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bn.C2913t1;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3011n1;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3033r3;
import bo.C3039t0;
import bo.C3042u;
import bo.C3047v0;
import bo.C3051w0;
import bo.C3054x;
import bo.C3060y1;
import bp0.AbstractC3102n;
import c30.C3246i0;
import com.zing.p058v4.view.ViewPager;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.FeedDetailsHeaderDecor;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemOAVideo;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestMultiBase;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import com.zing.zalo.feed.components.FeedItemZaloVideoView;
import com.zing.zalo.feed.components.InterfaceC8403u6;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.uicontrols.AbstractC8895v;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.imageviewer.FeedImageViewer;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.location.MapInAppView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.settings.SettingTimelineV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.FeedStickerSuggestView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CommentSupportGifEditText;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import hf0.C20040b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.C20275e;
import io.C20637a;
import is.AbstractC20789d;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l30.C22033k0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23093i;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.AbstractC23254w8;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nb0.C23672c;
import no.C23908a;
import no.C23910c;
import no.C23911d;
import no.C23912e;
import no.C23913f;
import no.C23914g;
import no.C23915h;
import np.InterfaceC23923b;
import p084cs.AbstractC17569c;
import p084cs.C17567a;
import p084cs.C17570d;
import p109ds.C18062a;
import p109ds.C18063b;
import p109ds.C18064c;
import p167fs.C19136a;
import p167fs.C19140e;
import p172fy.C19171b;
import p205hc.C19964c;
import p215hp.C20111a;
import p262jb.AbstractC21196a;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p322lf.AbstractC22470k;
import p329lo.C22547b0;
import p329lo.C22548c;
import p329lo.C22577q0;
import p329lo.C22579r0;
import p329lo.InterfaceC22544a;
import p329lo.InterfaceC22546b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p458qr.AbstractC25477j;
import p458qr.C25470c;
import p458qr.C25471d;
import p458qr.C25485r;
import p471r3.C25630b;
import p489rn.C25849b;
import p494rv.C25979a;
import p509sp.C26361j;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p554up.C27353a;
import p583vq.AbstractC28568a;
import p588vw.C28644j;
import p588vw.C28652r;
import p615wn.C29106b;
import p691yr.C31060j;
import p691yr.C31063m;
import p716zh.C31862c;
import p716zh.C31877d;
import p716zh.C32002l4;
import p716zh.C32065p8;
import p726zr.C32546b;
import sa0.C26203c;
import sa0.C26209i;
import sn.C26333b;
import th.AbstractC26683d;
import tn.C26746f;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28209v3;
import vg.C28212v6;
import w20.InterfaceC28702e;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public class FeedDetailsView extends BaseDetailView implements InterfaceC22546b, TextWatcher, View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC2266h, FeedItemPhotoMultiModuleView.InterfaceC8112b, InterfaceC28702e, InterfaceC0733x, InterfaceC23923b, View.OnLongClickListener {

    /* renamed from: j3 */
    protected static int f73263j3;

    /* renamed from: A2 */
    InterfaceC22544a f73264A2;

    /* renamed from: B2 */
    private C20275e f73265B2;

    /* renamed from: C2 */
    private int f73266C2;

    /* renamed from: D2 */
    private View f73267D2;

    /* renamed from: E2 */
    private ContentObserver f73268E2;

    /* renamed from: F2 */
    private EmptyContentView f73269F2;

    /* renamed from: H2 */
    private C16572d1 f73271H2;

    /* renamed from: I2 */
    boolean f73272I2;

    /* renamed from: J2 */
    Editable f73273J2;

    /* renamed from: M2 */
    AbstractC8895v f73276M2;

    /* renamed from: N2 */
    FrameLayout f73277N2;

    /* renamed from: O2 */
    RelativeLayout f73278O2;

    /* renamed from: Y1 */
    TextView f73289Y1;

    /* renamed from: Y2 */
    ActionBarMenuItem f73290Y2;

    /* renamed from: Z1 */
    LinearLayout f73291Z1;

    /* renamed from: Z2 */
    ActionBarMenuItem f73292Z2;

    /* renamed from: a2 */
    View f73293a2;

    /* renamed from: a3 */
    FeedActionZUtils.InterfaceC8913k f73294a3;

    /* renamed from: b2 */
    RobotoTextView f73295b2;

    /* renamed from: b3 */
    MenuListPopupView f73296b3;

    /* renamed from: c2 */
    RobotoTextView f73297c2;

    /* renamed from: d2 */
    RelativeLayout f73299d2;

    /* renamed from: e2 */
    RobotoTextView f73301e2;

    /* renamed from: e3 */
    C20040b f73302e3;

    /* renamed from: f2 */
    RobotoTextView f73303f2;

    /* renamed from: g2 */
    MultiStateView f73305g2;

    /* renamed from: g3 */
    C13306b f73306g3;

    /* renamed from: h2 */
    RedDotImageButton f73307h2;

    /* renamed from: i2 */
    View f73309i2;

    /* renamed from: j2 */
    View f73311j2;

    /* renamed from: k2 */
    ChangeableHeightView f73312k2;

    /* renamed from: l2 */
    FeedDetailsHeaderDecor f73313l2;

    /* renamed from: q2 */
    boolean f73318q2;

    /* renamed from: s2 */
    boolean f73320s2;

    /* renamed from: v2 */
    public int f73323v2;

    /* renamed from: x2 */
    private int f73325x2;

    /* renamed from: y2 */
    int f73326y2;

    /* renamed from: z2 */
    int f73327z2;

    /* renamed from: X1 */
    boolean f73287X1 = false;

    /* renamed from: m2 */
    private final float f73314m2 = 0.7f;

    /* renamed from: n2 */
    String f73315n2 = "";

    /* renamed from: o2 */
    int f73316o2 = 0;

    /* renamed from: p2 */
    int f73317p2 = 0;

    /* renamed from: r2 */
    int f73319r2 = 0;

    /* renamed from: t2 */
    boolean f73321t2 = false;

    /* renamed from: u2 */
    private final int f73322u2 = m78956lL().getResources().getDimensionPixelSize(AbstractC16802y.avt_S) + (AbstractC23136l9.m118742r(10.0f) * 2);

    /* renamed from: w2 */
    boolean f73324w2 = false;

    /* renamed from: G2 */
    private final String f73270G2 = "view_feed_detail_multi_photo";

    /* renamed from: K2 */
    Runnable f73274K2 = new RunnableC14274s();

    /* renamed from: L2 */
    C0820h.a f73275L2 = new C14275t();

    /* renamed from: P2 */
    boolean f73279P2 = false;

    /* renamed from: Q2 */
    boolean f73280Q2 = false;

    /* renamed from: R2 */
    View.OnLayoutChangeListener f73281R2 = new ViewOnLayoutChangeListenerC14256a();

    /* renamed from: S2 */
    View.OnLayoutChangeListener f73282S2 = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.rd
        public /* synthetic */ ViewOnLayoutChangeListenerC16089rd() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            FeedDetailsView.this.m79550LO(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: T2 */
    int f73283T2 = 0;

    /* renamed from: U2 */
    boolean f73284U2 = false;

    /* renamed from: V2 */
    AbstractC22055v0.g f73285V2 = new C14259d();

    /* renamed from: W2 */
    final Runnable f73286W2 = new RunnableC14260e();

    /* renamed from: X2 */
    boolean f73288X2 = false;

    /* renamed from: c3 */
    String f73298c3 = "";

    /* renamed from: d3 */
    boolean f73300d3 = false;

    /* renamed from: f3 */
    boolean f73304f3 = false;

    /* renamed from: h3 */
    C13306b.c f73308h3 = new C14264i();

    /* renamed from: i3 */
    Runnable f73310i3 = new RunnableC14267l();

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$a */
    /* loaded from: classes6.dex */
    class ViewOnLayoutChangeListenerC14256a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC14256a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                ListView listView = feedDetailsView.f72303m1;
                if (listView != null && feedDetailsView.f73278O2 != null) {
                    int measuredHeight = listView.getMeasuredHeight();
                    int i19 = 0;
                    for (int i21 = 0; i21 < FeedDetailsView.this.f72303m1.getChildCount(); i21++) {
                        View childAt = FeedDetailsView.this.f72303m1.getChildAt(i21);
                        if (childAt != null && childAt != FeedDetailsView.this.f73278O2) {
                            i19 += childAt.getMeasuredHeight();
                        }
                    }
                    FeedDetailsView.this.f73278O2.setMinimumHeight(Math.max(measuredHeight - i19, 0));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$b */
    /* loaded from: classes6.dex */
    public class C14257b extends AbstractC8895v {
        C14257b() {
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v
        /* renamed from: d */
        public boolean mo47496d(C31862c c31862c) {
            return FeedDetailsView.this.f73264A2.mo116644f1(c31862c);
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v
        /* renamed from: e */
        public ViewGroup mo47497e(C31862c c31862c) {
            if (c31862c != null && c31862c.f146302D) {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                feedDetailsView.f73280Q2 = true;
                return feedDetailsView.f73277N2;
            }
            FeedDetailsView feedDetailsView2 = FeedDetailsView.this;
            feedDetailsView2.f73280Q2 = false;
            return feedDetailsView2.f73278O2;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$c */
    /* loaded from: classes6.dex */
    public class C14258c implements AbstractC8895v.c {

        /* renamed from: a */
        final /* synthetic */ View f73330a;

        C14258c(View view) {
            this.f73330a = view;
        }

        /* renamed from: b */
        public /* synthetic */ void m79663b(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            FeedDetailsView.this.m79592kP(false);
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v.c
        /* renamed from: j0 */
        public void mo47510j0() {
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                if (feedDetailsView.f73280Q2) {
                    feedDetailsView.m79592kP(true);
                    this.f73330a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.ie
                        public /* synthetic */ ViewOnLayoutChangeListenerC15733ie() {
                        }

                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                            FeedDetailsView.C14258c.this.m79663b(view, i11, i12, i13, i14, i15, i16, i17, i18);
                        }
                    });
                    return;
                }
                ListView listView = feedDetailsView.f72303m1;
                if (listView != null) {
                    listView.addOnLayoutChangeListener(feedDetailsView.f73281R2);
                }
                FeedDetailsView feedDetailsView2 = FeedDetailsView.this;
                RelativeLayout relativeLayout = feedDetailsView2.f73278O2;
                if (relativeLayout != null) {
                    relativeLayout.addOnLayoutChangeListener(feedDetailsView2.f73282S2);
                }
                FeedDetailsView feedDetailsView3 = FeedDetailsView.this;
                feedDetailsView3.f72304n1.f123346x = true;
                feedDetailsView3.f73264A2.mo116648j0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v.c
        /* renamed from: k0 */
        public void mo47511k0(String str, String str2) {
            FeedDetailsView.this.m79624YO(str, str2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$d */
    /* loaded from: classes6.dex */
    class C14259d implements AbstractC22055v0.g {
        C14259d() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            C25849b c25849b = FeedDetailsView.this.f72304n1;
            if (c25849b != null) {
                c25849b.notifyDataSetChanged();
            }
            FeedDetailsView.this.f73264A2.mo116656nl();
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (FeedDetailsView.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$e */
    /* loaded from: classes6.dex */
    class RunnableC14260e implements Runnable {
        RunnableC14260e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (FeedDetailsView.this.f72301k1.getText().length() > 0) {
                    FeedDetailsView.this.m78364wN();
                    FeedDetailsView feedDetailsView = FeedDetailsView.this;
                    feedDetailsView.f72283U1.postDelayed(feedDetailsView.f73286W2, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$f */
    /* loaded from: classes6.dex */
    public class C14261f implements FeedActionZUtils.InterfaceC8913k {
        C14261f() {
        }

        /* renamed from: b */
        public /* synthetic */ void m79665b(C3020p0 c3020p0) {
            if (FeedDetailsView.this.f72421L0.m92646QI() != null) {
                FeedDetailsView.this.mo78325Ka(0);
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                feedDetailsView.f73296b3 = FeedActionZUtils.m47538Z(feedDetailsView.m92689tK(), c3020p0, FeedDetailsView.this.f72421L0.m92676n2(), FeedDetailsView.this.f73294a3);
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: o2 */
        public void mo47577o2(String str, PrivacyInfo privacyInfo) {
            FeedDetailsView.this.f73264A2.mo116606Jj(privacyInfo);
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: p2 */
        public void mo47578p2() {
            FeedDetailsView.this.mo49315c4();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: q2 */
        public void mo47579q2(int i11, C3020p0 c3020p0) {
            ArrayList arrayList;
            try {
                FeedActionZUtils.m47519G(FeedDetailsView.this.f73296b3, FeedDetailsView.this.f72421L0.m92676n2());
                if (i11 == 70) {
                    List list = PrivacyInfo.f45971u;
                    if (list != null && list.size() == 2) {
                        AbstractC23647d.m123906p("13441");
                    } else {
                        AbstractC23647d.m123906p("13440");
                    }
                    AbstractC23647d.m123893c();
                    FeedDetailsView.this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(new ArrayList(), 100, FeedDetailsView.this.m78956lL().getString(AbstractC8020f0.str_privacy_select_title)), 1017, 1, true);
                    return;
                }
                if (i11 == 80) {
                    List list2 = PrivacyInfo.f45971u;
                    if (list2 != null && list2.size() == 2) {
                        AbstractC23647d.m123906p("13451");
                    } else {
                        AbstractC23647d.m123906p("13450");
                    }
                    AbstractC23647d.m123893c();
                    FeedDetailsView.this.f72421L0.m92662fJ().m93066i2(PrivacyPickGroupView.class, null, 1017, 1, true);
                    return;
                }
                if (i11 == 90) {
                    ArrayList arrayList2 = new ArrayList();
                    PrivacyInfo privacyInfo = c3020p0.f12042V;
                    if (privacyInfo != null && (arrayList = privacyInfo.f45974q) != null && privacyInfo.f45977t == i11) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            LikeContactItem likeContactItem = (LikeContactItem) it.next();
                            arrayList2.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                        }
                    }
                    Bundle m83055pM = ProfilePickerView.m83055pM(arrayList2, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
                    m83055pM.putBoolean("extra_show_text_instead_icon", true);
                    m83055pM.putBoolean("extra_type_exclude_friends", true);
                    FeedDetailsView.this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 1020, 1, true);
                    return;
                }
                if (c3020p0.f12042V.f45977t != i11) {
                    FeedActionZUtils.m47553k(c3020p0.f12057p, i11, FeedDetailsView.this.f73294a3);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: r2 */
        public void mo47580r2() {
            FeedDetailsView.this.mo46829Y();
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: s2 */
        public void mo47581s2(int i11, C3020p0 c3020p0) {
            ArrayList arrayList;
            try {
                FeedActionZUtils.m47519G(FeedDetailsView.this.f73296b3, (ZaloActivity) FeedDetailsView.this.f72421L0.m92648SI());
                if (i11 == 1000) {
                    arrayList = (ArrayList) c3020p0.f12042V.m45138e();
                } else {
                    arrayList = (ArrayList) PrivacyInfo.m45134q(i11).m45138e();
                }
                FeedDetailsView.this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, ProfilePickerView.m83055pM(arrayList, 100, FeedDetailsView.this.m78956lL().getString(AbstractC8020f0.str_privacy_select_title)), 1017, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: t2 */
        public void mo47582t2(C3020p0 c3020p0) {
            FeedDetailsView.this.m79644nO(new Runnable() { // from class: com.zing.zalo.ui.zviews.je

                /* renamed from: q */
                public final /* synthetic */ C3020p0 f80782q;

                public /* synthetic */ RunnableC15769je(C3020p0 c3020p02) {
                    r2 = c3020p02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedDetailsView.C14261f.this.m79665b(r2);
                }
            });
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: z1 */
        public void mo47583z1(C20096c c20096c) {
            FeedDetailsView.this.f73264A2.mo116674yi(c20096c);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$g */
    /* loaded from: classes6.dex */
    class C14262g extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ String f73335p;

        C14262g(String str) {
            this.f73335p = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                if (!TextUtils.isEmpty(this.f73335p)) {
                    new C19171b().m101508a(new C19171b.a(FeedDetailsView.this.f72421L0.m92676n2(), new C26365a.b(this.f73335p, FeedDetailsView.this.f73264A2.mo112339g().m154284u(2)).m135739F("18600").m135743b(), 0, 1));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(FeedDetailsView.this.getContext(), AbstractC21196a.TextColor1));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$h */
    /* loaded from: classes6.dex */
    class C14263h extends ViewPager.C6879n {

        /* renamed from: p */
        final /* synthetic */ View f73337p;

        C14263h(View view) {
            this.f73337p = view;
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            boolean z11;
            if (i11 == 0) {
                FeedDetailsView.this.f73319r2 = ((FeedItemSuggestMultiBase) this.f73337p).getPager().getCurrentItem();
            }
            SwipeRefreshListView swipeRefreshListView = FeedDetailsView.this.f72280T0;
            if (swipeRefreshListView != null) {
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                swipeRefreshListView.setEnabled(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$i */
    /* loaded from: classes6.dex */
    class C14264i extends C13306b.c {
        C14264i() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            if (!str.equals("tip.feeddetail.commentphoto") && !str.equals("tip.feeddetail.commentsticker")) {
                return super.mo66900a(c28212v6);
            }
            if (c28212v6.f131575a == 1 || FeedDetailsView.this.f73304f3) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: b */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
            View view;
            boolean z11;
            if (c26209i != null && (view = c26209i.f124546a) != null && (view instanceof RedDotImageButton)) {
                if (c28212v6 != null && c28212v6.m142167f()) {
                    z11 = c28212v6.f131580f;
                } else {
                    z11 = false;
                }
                ((RedDotImageButton) c26209i.f124546a).setEnableNoti(z11);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            if (c26203c != null) {
                c26203c.f124513d = AbstractC23136l9.m118742r(-4.0f);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130860q;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.feeddetail.commentphoto")) {
                if (!str.equals("tip.feeddetail.commentsticker")) {
                    return null;
                }
                return new C26209i(FeedDetailsView.this.f72314x1);
            }
            return new C26209i(FeedDetailsView.this.f73307h2);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (FeedDetailsView.this.f72421L0.m92672lJ() && FeedDetailsView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$j */
    /* loaded from: classes6.dex */
    class C14265j extends AbstractC31727b {
        C14265j() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: c */
        public void mo46563c(String str) {
            C25630b m143290W;
            try {
                if (!TextUtils.isEmpty(str) && (m143290W = C28644j.m143233Y().m143290W(str)) != null && !m143290W.m132399G()) {
                    AbstractC20789d.m108472f(301, FeedDetailsView.this.f72421L0.m92649TI());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                StringBuilder sb2 = new StringBuilder();
                int selectionEnd = FeedDetailsView.this.f72301k1.getSelectionEnd();
                if (selectionEnd == FeedDetailsView.this.f72301k1.getText().length() && AbstractC23309i.m121379Rd() == 1) {
                    if (selectionEnd > 0 && (charAt = FeedDetailsView.this.f72301k1.getText().toString().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                        sb2.append(" ");
                        sb2.append(str);
                    }
                    if (selectionEnd == FeedDetailsView.this.f72301k1.getText().length()) {
                        if (sb2.length() == 0) {
                            sb2.append(str);
                            sb2.append(" ");
                        } else {
                            sb2.append(" ");
                        }
                    }
                    if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                        str = sb2.toString();
                    }
                    FeedDetailsView feedDetailsView = FeedDetailsView.this;
                    if (feedDetailsView.f72301k1 != null && (feedDetailsView.f73264A2.mo112333R() - FeedDetailsView.this.f72301k1.length()) - str.length() >= 0) {
                        C0820h.m2140c(FeedDetailsView.this.f72301k1.getText(), selectionEnd, str, 0.0f, FeedDetailsView.this.f73275L2);
                        return;
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                        return;
                    }
                }
                FeedDetailsView feedDetailsView2 = FeedDetailsView.this;
                if (feedDetailsView2.f72301k1 != null && (feedDetailsView2.f73264A2.mo112333R() - FeedDetailsView.this.f72301k1.length()) - str.length() >= 0) {
                    C0820h.m2140c(FeedDetailsView.this.f72301k1.getText(), selectionEnd, str, 0.0f, FeedDetailsView.this.f73275L2);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    FeedDetailsView feedDetailsView = FeedDetailsView.this;
                    feedDetailsView.f72283U1.postDelayed(feedDetailsView.f73286W2, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    FeedDetailsView feedDetailsView2 = FeedDetailsView.this;
                    feedDetailsView2.f72283U1.removeCallbacks(feedDetailsView2.f73286W2);
                    FeedDetailsView feedDetailsView3 = FeedDetailsView.this;
                    feedDetailsView3.f72281T1++;
                    if (!feedDetailsView3.f72283U1.hasMessages(2)) {
                        FeedDetailsView.this.f72283U1.sendEmptyMessage(2);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            AbstractC2379w.m12430d(FeedDetailsView.this.f72301k1);
            FeedDetailsView feedDetailsView = FeedDetailsView.this;
            feedDetailsView.m78360sN(feedDetailsView.f72307q1, false);
            FeedDetailsView.this.mo78325Ka(0);
            FeedDetailsView.this.f73264A2.mo112334R1(c25630b, i11);
            AbstractC23647d.m123897g("49180008");
        }

        @Override // z90.AbstractC31727b
        /* renamed from: p */
        public void mo46564p(C25630b c25630b, int i11, int i12, int i13) {
            FeedDetailsView.this.f73264A2.mo116621W(c25630b, i11, i12, i13);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$k */
    /* loaded from: classes6.dex */
    public class C14266k extends ContentObserver {
        C14266k(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11, Uri uri) {
            String m119855c;
            InterfaceC22544a interfaceC22544a;
            super.onChange(z11, uri);
            if (uri != null && (m119855c = AbstractC23254w8.m119855c(FeedDetailsView.this.getContext(), uri)) != null && AbstractC23009a3.m117960k(m119855c) && (interfaceC22544a = FeedDetailsView.this.f73264A2) != null) {
                interfaceC22544a.mo116609Kk();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$l */
    /* loaded from: classes6.dex */
    class RunnableC14267l implements Runnable {
        RunnableC14267l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedDetailsView feedDetailsView = FeedDetailsView.this;
            ListView listView = feedDetailsView.f72303m1;
            if (listView != null) {
                listView.setVerticalScrollBarEnabled(feedDetailsView.f73318q2);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$m */
    /* loaded from: classes6.dex */
    class C14268m implements AbsListView.OnScrollListener {
        C14268m() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            RobotoTextView robotoTextView;
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                ListView listView = feedDetailsView.f72303m1;
                if (listView != null && feedDetailsView.f72304n1 != null) {
                    int lastVisiblePosition = FeedDetailsView.this.f72303m1.getLastVisiblePosition();
                    C10873l m133432f = FeedDetailsView.this.f72304n1.m133432f();
                    for (int max = Math.max(listView.getFirstVisiblePosition() - FeedDetailsView.this.f72303m1.getHeaderViewsCount(), 0); max <= lastVisiblePosition; max++) {
                        C10873l m133430d = FeedDetailsView.this.f72304n1.m133430d(max);
                        if (m133430d != null && m133432f != null && m133430d.m56493u().equals(m133432f.m56493u()) && (robotoTextView = FeedDetailsView.this.f72298h1) != null) {
                            robotoTextView.setVisibility(8);
                        }
                    }
                }
                if (absListView.getScrollY() != 0) {
                    FeedDetailsView.this.removeDialog(9);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    FeedDetailsView feedDetailsView = FeedDetailsView.this;
                    feedDetailsView.f73318q2 = false;
                    feedDetailsView.f72304n1.m133438m(false);
                    FeedDetailsView.this.f72304n1.notifyDataSetChanged();
                    if (!(FeedDetailsView.this.m78321IM() instanceof FeedItemZaloVideoContainerView) && FeedDetailsView.this.m79649qO() != null) {
                        FeedDetailsView.this.m79649qO().m104022z();
                    }
                } else {
                    FeedDetailsView feedDetailsView2 = FeedDetailsView.this;
                    feedDetailsView2.f72305o1 = false;
                    feedDetailsView2.f73318q2 = true;
                    feedDetailsView2.f72304n1.m133438m(true);
                    FeedDetailsView.this.f72280T0.m88202K();
                }
                FeedDetailsView.this.m79597oP();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$n */
    /* loaded from: classes6.dex */
    class C14269n implements C25849b.a {
        C14269n() {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: a */
        public void mo46569a() {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: b */
        public void mo46570b(C10873l c10873l, View view, C20275e c20275e, int i11) {
            FeedDetailsView.this.f73265B2 = c20275e;
            FeedDetailsView.this.f73266C2 = i11;
            FeedDetailsView.this.f73267D2 = view;
            FeedDetailsView.this.f73264A2.mo116641e0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: c */
        public void mo46571c(String str) {
            FeedDetailsView.this.m79646oO(str);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: d */
        public View mo46572d() {
            return FeedDetailsView.this.f73278O2;
        }

        @Override // p489rn.C25849b.a
        /* renamed from: e */
        public void mo46573e(C20096c c20096c) {
            FeedDetailsView.this.f73264A2.mo116598C(c20096c);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f */
        public void mo46574f(C10866e c10866e) {
            if (c10866e instanceof C23672c) {
                FeedActionZUtils.m47541b(FeedDetailsView.this, new C28209v3(true, ((C23672c) c10866e).f114678g0, 2));
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f1 */
        public void mo46575f1(int i11, int i12, String str, int i13) {
            if (i11 > 0) {
                try {
                    if (FeedDetailsView.this.f72421L0.m92676n2() != null) {
                        AbstractC23152n3.m119066r0(FeedDetailsView.this.f72421L0.m92676n2(), i11, "", i12, str, i13);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: g */
        public void mo46576g(boolean z11, int i11) {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: h */
        public void mo46577h(C10873l c10873l) {
            try {
                FeedDetailsView.this.f73264A2.mo116672y(c10873l, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: i */
        public void mo46578i(String str) {
            FeedDetailsView.this.f73264A2.mo116653mj(str, true, true);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: j */
        public void mo46579j(String str) {
            FeedDetailsView.this.f73264A2.mo116653mj(str, false, false);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k */
        public void mo46580k(C10873l c10873l) {
            int i11;
            if (c10873l != null) {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                int i12 = c10873l.f54909Y;
                List list = c10873l.f54910Z;
                if (list != null) {
                    i11 = list.size();
                } else {
                    i11 = 0;
                }
                feedDetailsView.f73317p2 = i12 + i11;
            }
            FeedDetailsView.this.f73264A2.mo116602H2(2, c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k0 */
        public void mo46581k0(C10873l c10873l) {
            FeedDetailsView.this.f73264A2.mo112343k0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: l */
        public void mo46582l(int i11) {
            FeedDetailsView.this.f73264A2.mo116625Y(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$o */
    /* loaded from: classes6.dex */
    public class C14270o implements KeyboardFrameLayout.InterfaceC13508a {
        C14270o() {
        }

        /* renamed from: b */
        public /* synthetic */ void m79667b() {
            FeedDetailsView feedDetailsView = FeedDetailsView.this;
            if (feedDetailsView.f72275Q1 != 2) {
                feedDetailsView.f72315y1.setPaddingBottom(0);
                FeedDetailsView.this.f72315y1.requestLayout();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                feedDetailsView.f72316z1 = false;
                if (feedDetailsView.f73321t2) {
                    return;
                }
                feedDetailsView.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ke
                    public /* synthetic */ RunnableC15812ke() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedDetailsView.C14270o.this.m79667b();
                    }
                });
                FeedDetailsView.this.removeDialog(9);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            if (!FeedDetailsView.this.f72301k1.isFocused()) {
                return;
            }
            FeedDetailsView.this.m78367zN(i11);
            FeedDetailsView feedDetailsView = FeedDetailsView.this;
            feedDetailsView.f72316z1 = true;
            if (!feedDetailsView.f73321t2 && feedDetailsView.f72275Q1 != 1) {
                feedDetailsView.mo78325Ka(1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$p */
    /* loaded from: classes6.dex */
    class C14271p implements FeedStickerSuggestView.InterfaceC14282c {
        C14271p() {
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: a */
        public void mo46585a(C25630b c25630b, int i11) {
            FeedDetailsView.this.mo78316E0(c25630b, i11);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: b */
        public void mo46586b(C25630b c25630b, int i11, String str, int i12, String str2) {
            FeedDetailsView.this.f73264A2.mo112344l3(c25630b, i11);
            AbstractC23647d.m123897g("49180009");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$q */
    /* loaded from: classes6.dex */
    class C14272q extends FeedStickerSuggestView {
        C14272q(Context context, ZaloView zaloView, ActionEditText actionEditText, FeedStickerSuggestView.InterfaceC14282c interfaceC14282c) {
            super(context, zaloView, actionEditText, interfaceC14282c);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView
        /* renamed from: m */
        public void mo46587m() {
            FeedDetailsView feedDetailsView = FeedDetailsView.this;
            feedDetailsView.f73323v2 = feedDetailsView.f72275Q1;
            feedDetailsView.mo78325Ka(0);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
            this.f73382w.m92662fJ().m93066i2(SettingTimelineV2View.class, bundle, 1035, 1, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$r */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC14273r implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC14273r() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i11;
            try {
                RelativeLayout relativeLayout = FeedDetailsView.this.f73299d2;
                if (relativeLayout != null) {
                    relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                RelativeLayout relativeLayout2 = feedDetailsView.f73299d2;
                if (relativeLayout2 != null) {
                    i11 = relativeLayout2.getHeight();
                } else {
                    i11 = 0;
                }
                feedDetailsView.f73325x2 = i11;
                FeedDetailsView.this.f73264A2.mo116608Kj();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$s */
    /* loaded from: classes6.dex */
    class RunnableC14274s implements Runnable {
        RunnableC14274s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                if (feedDetailsView.f73273J2 == null) {
                    return;
                }
                if (feedDetailsView.f73272I2) {
                    feedDetailsView.f73272I2 = false;
                } else {
                    C28652r.m143349v().m143362X(FeedDetailsView.this.f73273J2, 0.0f);
                    C0820h.f2880z = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedDetailsView$t */
    /* loaded from: classes6.dex */
    public class C14275t implements C0820h.a {
        C14275t() {
        }

        /* renamed from: c */
        public /* synthetic */ void m79669c(Editable editable, int i11, int i12) {
            try {
                FeedDetailsView feedDetailsView = FeedDetailsView.this;
                CommentSupportGifEditText commentSupportGifEditText = feedDetailsView.f72301k1;
                if (commentSupportGifEditText != null) {
                    int i13 = 1;
                    feedDetailsView.f73272I2 = true;
                    commentSupportGifEditText.setText(editable);
                    if (i11 != FeedDetailsView.this.f72301k1.getText().length() || AbstractC23309i.m121379Rd() != 1) {
                        i13 = 0;
                    }
                    FeedDetailsView.this.f72301k1.setSelection(i12 + i13);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ag0.C0820h.a
        /* renamed from: a */
        public void mo2144a(Editable editable, int i11, int i12) {
            FeedDetailsView.this.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.le

                /* renamed from: q */
                public final /* synthetic */ Editable f81007q;

                /* renamed from: r */
                public final /* synthetic */ int f81008r;

                /* renamed from: s */
                public final /* synthetic */ int f81009s;

                public /* synthetic */ RunnableC15849le(Editable editable2, int i112, int i122) {
                    r2 = editable2;
                    r3 = i112;
                    r4 = i122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedDetailsView.C14275t.this.m79669c(r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: AO */
    public /* synthetic */ void m79528AO(C29106b c29106b, View view, int i11) {
        try {
            C20040b c20040b = this.f73302e3;
            if (c20040b != null) {
                c20040b.m104020u();
                this.f73302e3.m104011V(true);
            }
            C3000l0 c3000l0 = c29106b.f134937a;
            mo11957ig(c3000l0, 0, AbstractC20826v0.m108787U(c3000l0.m14322a0(), i11), 1, ((FeedItemSocialAlbum) view).f44639s0, ((FeedItemSocialAlbum) view).f44639s0.getVideoDisplayView());
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: BO */
    public /* synthetic */ void m79530BO() {
        if (this.f72421L0.m92662fJ() != null) {
            this.f72421L0.m92662fJ().m93030Q1();
        }
    }

    /* renamed from: CO */
    public /* synthetic */ void m79532CO(C19964c c19964c) {
        InterfaceC22544a interfaceC22544a;
        if ((((C20111a.a) c19964c.m103749a()) instanceof C20111a.c) && (interfaceC22544a = this.f73264A2) != null) {
            interfaceC22544a.mo116656nl();
        }
    }

    /* renamed from: DO */
    public /* synthetic */ void m79534DO(C19964c c19964c) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.td

            /* renamed from: q */
            public final /* synthetic */ C19964c f82196q;

            public /* synthetic */ RunnableC16187td(C19964c c19964c2) {
                r2 = c19964c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FeedDetailsView.this.m79532CO(r2);
            }
        });
    }

    /* renamed from: EO */
    public /* synthetic */ void m79536EO() {
        this.f73264A2.mo116597Bf();
    }

    /* renamed from: FO */
    public /* synthetic */ void m79538FO(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
        onKeyUp(4, keyEvent);
    }

    /* renamed from: GO */
    public /* synthetic */ void m79540GO(View view, boolean z11) {
        this.f73304f3 = true;
        C13306b c13306b = this.f73306g3;
        if (c13306b != null) {
            c13306b.m74699e("tip.any");
        }
    }

    /* renamed from: HO */
    public /* synthetic */ boolean m79542HO(TextView textView, int i11, KeyEvent keyEvent) {
        String str;
        if (i11 != 6 && i11 != 4) {
            return false;
        }
        CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
        if (commentSupportGifEditText != null && commentSupportGifEditText.getText() != null) {
            str = this.f72301k1.getText().toString().trim();
        } else {
            str = "";
        }
        this.f73264A2.mo116635c0(str, m79600tO());
        return true;
    }

    /* renamed from: IO */
    public /* synthetic */ void m79544IO() {
        int i11;
        try {
            LinearLayout linearLayout = this.f72299i1;
            if (linearLayout != null) {
                i11 = linearLayout.getMeasuredHeight();
            } else {
                i11 = 0;
            }
            this.f73327z2 = AbstractC23136l9.m118713h0() - i11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JO */
    public /* synthetic */ void m79546JO() {
        this.f73264A2.mo116597Bf();
    }

    /* renamed from: KO */
    public /* synthetic */ void m79548KO(C3054x c3054x) {
        this.f73264A2.mo116637d2(c3054x);
    }

    /* renamed from: LO */
    public /* synthetic */ void m79550LO(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        try {
            m79591kO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MO */
    public /* synthetic */ Object m79552MO(ArrayList arrayList) {
        this.f73264A2.mo116643f0(arrayList);
        return Boolean.TRUE;
    }

    /* renamed from: NO */
    public /* synthetic */ void m79554NO(int i11, String str) {
        this.f73264A2.mo116605J6(i11, str);
    }

    /* renamed from: OO */
    public /* synthetic */ void m79556OO(boolean z11) {
        this.f73300d3 = z11;
    }

    /* renamed from: PO */
    public /* synthetic */ void m79558PO() {
        if (this.f72275Q1 != 0 && !mo60294yp()) {
            mo78325Ka(0);
        }
    }

    /* renamed from: QO */
    public /* synthetic */ void m79560QO() {
        try {
            this.f72305o1 = true;
            this.f72303m1.setSelection(m79598pO(this.f72304n1.getCount()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RO */
    public /* synthetic */ void m79562RO(int i11) {
        this.f73264A2.mo116624X0(i11);
    }

    /* renamed from: SO */
    public /* synthetic */ void m79564SO() {
        mo78325Ka(1);
    }

    /* renamed from: TO */
    public /* synthetic */ void m79566TO() {
        try {
            int m79598pO = m79598pO(this.f72304n1.getCount());
            if (m79598pO < 20) {
                this.f72303m1.smoothScrollToPosition(m79598pO);
            } else {
                this.f72303m1.setSelection(m79598pO);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UO */
    public /* synthetic */ void m79568UO() {
        m79639jO(this.f72280T0, this.f73277N2.getMeasuredHeight());
    }

    /* renamed from: VO */
    public /* synthetic */ void m79570VO() {
        m79584fP();
        m79639jO(this.f72280T0, this.f73277N2.getMeasuredHeight());
    }

    /* renamed from: ZO */
    public void m79575ZO() {
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(3);
        bottomSheetMenuBundleData.m45507h(this.f73264A2.mo116599Ef());
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 30, 1, true);
    }

    /* renamed from: aP */
    private void m79577aP(boolean z11, C3000l0 c3000l0, int i11, C32002l4 c32002l4) {
        String m47566x = FeedActionZUtils.m47566x(c3000l0, i11);
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(m47566x, c32002l4).m135739F(FeedActionZUtils.m47561s(z11, c3000l0, i11)).m135743b(), 0, 1));
    }

    /* renamed from: dP */
    private void m79581dP() {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.requestLayout();
        }
    }

    /* renamed from: fP */
    private void m79584fP() {
        if (!AbstractC23136l9.m118666N0(this.f73277N2)) {
            AbstractC23136l9.m118744r1(this.f73277N2, 0);
        }
    }

    /* renamed from: gO */
    private void m79585gO(C3020p0 c3020p0) {
        int i11;
        C32546b c32546b;
        try {
            if (c3020p0.f12064w) {
                C3039t0 c3039t0 = c3020p0.f12025E;
                if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
                    i11 = c32546b.m157605a();
                } else {
                    i11 = 1;
                }
                this.f72309s1.m47308X(true, i11);
                this.f72310t1.setTextColor(C31060j.f143193a.m150933J(i11, m92689tK(), C31063m.a.f143213s));
            } else {
                this.f72309s1.m47308X(false, 0);
                this.f72310t1.setTextColor(C31060j.f143193a.m150933J(0, m92689tK(), C31063m.a.f143213s));
            }
            String mo116657o8 = this.f73264A2.mo116657o8(c3020p0.f12025E.f12243a);
            this.f73316o2 = c3020p0.f12025E.f12244b;
            if (!TextUtils.isEmpty(mo116657o8)) {
                this.f73291Z1.setVisibility(0);
                TextView textView = this.f72271M1;
                if (textView != null) {
                    textView.setText(mo116657o8);
                }
            } else {
                this.f73291Z1.setVisibility(8);
            }
            mo79630bh(c3020p0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gP */
    private void m79586gP(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(9, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    /* renamed from: hO */
    private void m79587hO(C3060y1 c3060y1) {
        try {
            FeedDetailsHeaderDecor feedDetailsHeaderDecor = this.f73313l2;
            if (feedDetailsHeaderDecor != null && c3060y1 != null) {
                C3011n1 c3011n1 = c3060y1.f12367a;
                if (c3011n1 != null) {
                    feedDetailsHeaderDecor.m43650V(c3011n1, this.f72276R0);
                    this.f73313l2.setVisibility(0);
                } else {
                    feedDetailsHeaderDecor.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            FeedDetailsHeaderDecor feedDetailsHeaderDecor2 = this.f73313l2;
            if (feedDetailsHeaderDecor2 != null) {
                feedDetailsHeaderDecor2.setVisibility(8);
            }
        }
    }

    /* renamed from: hP */
    private void m79588hP() {
        ViewTreeObserver viewTreeObserver = this.f73299d2.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14273r());
        }
    }

    /* renamed from: iP */
    private void m79589iP(C3020p0 c3020p0) {
        String upperCase;
        try {
            String upperCase2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry).toUpperCase();
            if (c3020p0 != null && c3020p0.m14488S()) {
                upperCase = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_local_edit_feed).toUpperCase();
            } else {
                upperCase = AbstractC23136l9.m118743r0(AbstractC8020f0.delete).toUpperCase();
            }
            this.f73295b2.setText(upperCase2);
            this.f73297c2.setText(upperCase);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: jP */
    private void m79590jP(C3020p0 c3020p0) {
        C3039t0 c3039t0;
        int i11;
        if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null) {
            if (c3020p0.f12064w) {
                C32546b c32546b = c3039t0.f12247e;
                if (c32546b != null) {
                    i11 = c32546b.m157605a();
                } else {
                    i11 = 1;
                }
                this.f72309s1.m47308X(true, i11);
                FeedLikeButtonModulesView feedLikeButtonModulesView = this.f72309s1;
                int i12 = AbstractC23222t7.f112594x;
                feedLikeButtonModulesView.m47307W(i12, i12);
                this.f72308r1.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112562h, AbstractC23222t7.f112576o, AbstractC23222t7.f112562h);
                RelativeLayout relativeLayout = this.f72308r1;
                C31060j c31060j = C31060j.f143193a;
                Context m92689tK = m92689tK();
                C31063m.a aVar = C31063m.a.f143213s;
                relativeLayout.setBackground(c31060j.m150941g(i11, m92689tK, aVar));
                this.f72310t1.setTextColor(c31060j.m150933J(i11, m92689tK(), aVar));
                this.f72310t1.setText(c31060j.m150931H(i11, m92689tK()));
            } else {
                this.f72309s1.m47308X(false, 0);
                FeedLikeButtonModulesView feedLikeButtonModulesView2 = this.f72309s1;
                int i13 = AbstractC23222t7.f112514B;
                feedLikeButtonModulesView2.m47307W(i13, i13);
                this.f72308r1.setPadding(AbstractC23222t7.f112572m, AbstractC23222t7.f112556e, AbstractC23222t7.f112572m, AbstractC23222t7.f112556e);
                RelativeLayout relativeLayout2 = this.f72308r1;
                C31060j c31060j2 = C31060j.f143193a;
                Context m92689tK2 = m92689tK();
                C31063m.a aVar2 = C31063m.a.f143213s;
                relativeLayout2.setBackground(c31060j2.m150941g(0, m92689tK2, aVar2));
                this.f72310t1.setTextColor(c31060j2.m150933J(0, m92689tK(), aVar2));
                this.f72310t1.setText(c31060j2.m150931H(0, m92689tK()));
            }
            this.f72309s1.requestLayout();
        }
    }

    /* renamed from: kO */
    private void m79591kO() {
        AbstractC8895v abstractC8895v;
        RelativeLayout relativeLayout;
        int i11;
        if (!this.f73279P2 && (abstractC8895v = this.f73276M2) != null && abstractC8895v.m47501i() && !this.f73280Q2 && (relativeLayout = this.f73278O2) != null) {
            if (relativeLayout.getMeasuredHeight() > 0) {
                this.f73279P2 = true;
                this.f73278O2.removeOnLayoutChangeListener(this.f73282S2);
            }
            ListView listView = this.f72303m1;
            if (listView != null && (i11 = this.f73283T2) < 10) {
                this.f73283T2 = i11 + 1;
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.vd
                    public /* synthetic */ RunnableC16261vd() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedDetailsView.this.m79603yO();
                    }
                }, 100L);
            }
        }
    }

    /* renamed from: kP */
    public void m79592kP(boolean z11) {
        try {
            if (this.f73280Q2) {
                int i11 = this.f72275Q1;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        m79594lP(false, z11);
                    }
                } else {
                    m79594lP(true, z11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lO */
    private void m79593lO() {
        try {
            if (m78321IM() instanceof FeedItemStickerModulesView) {
                this.f73264A2.mo116656nl();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lP */
    private void m79594lP(boolean z11, boolean z12) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            FrameLayout frameLayout = this.f73277N2;
            if (frameLayout != null && this.f72299i1 != null && (layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams()) != null) {
                m79638iO(layoutParams, this.f72299i1.getMeasuredHeight());
                if (z11) {
                    if (z12) {
                        m79584fP();
                        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.yd
                            public /* synthetic */ RunnableC16372yd() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedDetailsView.this.m79568UO();
                            }
                        }, 100L);
                    } else {
                        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.zd
                            public /* synthetic */ RunnableC16409zd() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedDetailsView.this.m79570VO();
                            }
                        }, 100L);
                    }
                } else {
                    m79639jO(this.f72280T0, 0);
                    m79601vO();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mP */
    private void m79595mP(C3020p0 c3020p0) {
        List arrayList;
        int i11;
        C3039t0 c3039t0 = c3020p0.f12025E;
        C3051w0 c3051w0 = c3039t0.f12246d;
        C32546b c32546b = c3039t0.f12247e;
        C17570d c17570d = new C17570d(m92689tK());
        boolean z11 = c3020p0.f12064w;
        int i12 = c3020p0.f12025E.f12244b;
        if (c3051w0 != null && c3051w0.m14637a()) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        String m93559b = AbstractC17569c.Companion.m93559b(c17570d, c3020p0.f12064w, arrayList, i12, 4);
        float measureText = this.f72267I1.measureText(m93559b);
        if (this.f72272N1) {
            i11 = Math.min(new C18062a().m96026a(z11, i12, c3051w0, c32546b).size(), 3);
        } else if (c32546b != null) {
            i11 = c32546b.m157606b().size();
        } else {
            i11 = 0;
        }
        C17567a c17567a = new C17567a();
        c17567a.m93550a(this.f72267I1, c17570d, measureText, 0.0f, c3020p0.f12064w, i12);
        C22126c0 c22126c0 = this.f72268J1;
        if (c22126c0 != null) {
            c22126c0.m111959G1(c17567a.m93551c(4, i11, m93559b));
        }
    }

    /* renamed from: nP */
    private void m79596nP(C3020p0 c3020p0) {
        C3039t0 c3039t0;
        boolean z11;
        if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null) {
            int i11 = 0;
            if (c3039t0.f12244b <= 0 && !c3020p0.f12064w) {
                z11 = false;
            } else {
                z11 = true;
            }
            m79599pP(c3020p0);
            m79595mP(c3020p0);
            ModulesView modulesView = this.f72266H1;
            if (!z11) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(modulesView, i11);
            m78317EM(z11, this.f72270L1);
        }
    }

    /* renamed from: oP */
    public void m79597oP() {
        if (this.f72303m1.isVerticalScrollBarEnabled() != this.f73318q2) {
            this.f72303m1.removeCallbacks(this.f73310i3);
            if (this.f73318q2) {
                this.f72303m1.setVerticalScrollBarEnabled(true);
            } else {
                this.f72303m1.postDelayed(this.f73310i3, 200L);
            }
        }
    }

    /* renamed from: pO */
    private int m79598pO(int i11) {
        int i12;
        ListView listView = this.f72303m1;
        if (listView != null && listView.getHeaderViewsCount() >= 2) {
            i12 = this.f72303m1.getHeaderViewsCount() - 1;
        } else {
            i12 = 0;
        }
        return i11 + i12;
    }

    /* renamed from: pP */
    private void m79599pP(C3020p0 c3020p0) {
        List m150943l;
        C3039t0 c3039t0 = c3020p0.f12025E;
        C3051w0 c3051w0 = c3039t0.f12246d;
        C32546b c32546b = c3039t0.f12247e;
        int i11 = c3039t0.f12244b;
        boolean z11 = c3020p0.f12064w;
        if (i11 > 0 || z11) {
            if (this.f72272N1) {
                C18064c c18064c = this.f72265G1;
                if (c18064c != null) {
                    c18064c.m96030p1(new C18062a().m96026a(z11, i11, c3051w0, c32546b));
                    return;
                }
                return;
            }
            C18063b c18063b = this.f72264F1;
            if (c18063b != null) {
                if (c32546b != null) {
                    m150943l = c32546b.m157606b();
                } else {
                    m150943l = C31060j.f143193a.m150943l();
                }
                c18063b.m96028o1(m150943l);
            }
        }
    }

    /* renamed from: tO */
    private String m79600tO() {
        LinearLayout linearLayout = this.f72290Z0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return this.f72291a1.getText().toString();
        }
        return "";
    }

    /* renamed from: vO */
    private void m79601vO() {
        if (AbstractC23136l9.m118666N0(this.f73277N2)) {
            AbstractC23136l9.m118744r1(this.f73277N2, 8);
        }
    }

    /* renamed from: wO */
    private void m79602wO() {
        this.f73268E2 = new C14266k(this.f72827B0);
    }

    /* renamed from: yO */
    public /* synthetic */ void m79603yO() {
        try {
            this.f72303m1.smoothScrollToPosition(this.f72304n1.getCount());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zO */
    public /* synthetic */ void m79604zO() {
        C3246i0.a aVar;
        try {
            PreviewStickerDialogView previewStickerDialogView = this.f72262D1;
            if (previewStickerDialogView != null && (aVar = previewStickerDialogView.f76068K0) != null) {
                aVar.m16491v();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Ax */
    public void mo79605Ax(String str) {
        AbstractC8895v abstractC8895v = this.f73276M2;
        if (abstractC8895v != null) {
            abstractC8895v.m47498f(str, 15);
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: B0 */
    public void mo79606B0(String str, C3020p0 c3020p0, String str2) {
        try {
            this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.wd
                public /* synthetic */ RunnableC16298wd() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedDetailsView.this.m79564SO();
                }
            }, 100L);
            String m114542i = AbstractC21935u.m114542i(str, str2);
            if (c3020p0 != null && c3020p0.m14518m0()) {
                this.f72291a1.setText(m114542i);
            } else {
                SpannableString spannableString = new SpannableString(m114542i);
                spannableString.setSpan(new C14262g(str), 0, m114542i.length(), 33);
                this.f72291a1.setText(spannableString);
                this.f72291a1.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.f72290Z0.setVisibility(0);
            this.f72290Z0.startAnimation(AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_from_bottom_timeline));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        f73263j3++;
        this.f73306g3 = new C13306b(this.f72421L0.m92648SI());
        C22547b0 c22547b0 = new C22547b0(this, C21785g.m112430F0());
        this.f73264A2 = c22547b0;
        c22547b0.mo995Nd(C22577q0.m116832a(m92642L3()), null);
    }

    @Override // com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView.InterfaceC8112b
    /* renamed from: D0 */
    public void mo43988D0(int i11, int i12) {
        ListView listView = this.f72303m1;
        if (listView != null) {
            listView.smoothScrollBy(i12, 0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        String m118743r02;
        int i12;
        View m132023c;
        switch (i11) {
            case 0:
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(this.f73264A2.mo116649jh()).m43172u(this.f73264A2.mo116632bg()).m43162k(this.f73264A2.mo116668sj()).m43165n(this.f73264A2.mo116610L6(), this).m43168q(this.f73264A2.mo116646ff(), this).m43170s(this.f73264A2.mo116613P4(), this);
                return aVar.m43152a();
            case 1:
                return new C2913t1(getContext()).m13865e(new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.sd
                    public /* synthetic */ C16127sd() {
                    }

                    @Override // bn.C2913t1.b
                    /* renamed from: a */
                    public final void mo13056a(int i13, String str) {
                        FeedDetailsView.this.m79554NO(i13, str);
                    }
                }).m13862b(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_dialog_msg), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
            case 2:
                return AbstractC23093i.m118469v(this.f72421L0.m92648SI(), this, AbstractC8020f0.str_feed_untag_confirm_msg);
            case 3:
                boolean mo116650k4 = this.f73264A2.mo116650k4();
                if (mo116650k4) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_remove_local_edit_feed_v2);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_delete_failed_feed);
                }
                if (mo116650k4) {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_local_edit_feed);
                } else {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
                }
                if (mo116650k4) {
                    i12 = AbstractC8020f0.str_uncancel;
                } else {
                    i12 = AbstractC8020f0.str_cancel;
                }
                String m118743r03 = AbstractC23136l9.m118743r0(i12);
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43159h(7).m43162k(m118743r0).m43165n(m118743r03, new InterfaceC17463d.b()).m43170s(m118743r02, this);
                return aVar2.m43152a();
            case 4:
                C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
                aVar3.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_hide_memory_popup_title_v2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide), this);
                return aVar3.m43152a();
            case 5:
            default:
                return null;
            case 6:
                C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
                aVar4.m43159h(4).m43162k(Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_alert_feed_album_privacy, this.f73298c3))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm), new InterfaceC17463d.b());
                return aVar4.m43152a();
            case 7:
                return AbstractC23093i.m118468u(this.f72421L0.m92648SI(), this.f73264A2.mo116662p4(), this);
            case 8:
                C3042u mo116651l1 = this.f73264A2.mo116651l1();
                C8009j.a aVar5 = new C8009j.a(this.f72421L0.m92648SI());
                aVar5.m43159h(mo116651l1.f12242f).m43162k(mo116651l1.f12239c).m43165n(mo116651l1.f12240d, this).m43170s(mo116651l1.f12241e, this);
                this.f73300d3 = false;
                ContactProfile contactProfile = mo116651l1.f12257g;
                if (contactProfile != null && mo116651l1.f12258h && !TextUtils.isEmpty(contactProfile.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_post_detail") && (m132023c = C25485r.f122083a.m132023c(this.f72421L0.getContext(), mo116651l1.f12257g, new C25485r.a() { // from class: com.zing.zalo.ui.zviews.ae
                    public /* synthetic */ C15434ae() {
                    }

                    @Override // p458qr.C25485r.a
                    /* renamed from: a */
                    public final void mo87261a(boolean z11) {
                        FeedDetailsView.this.m79556OO(z11);
                    }
                })) != null) {
                    aVar5.m43177z(m132023c);
                }
                return aVar5.m43152a();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Dm */
    public void mo79607Dm() {
        try {
            if (!m92676n2().mo35576n3()) {
                if (m92662fJ().m93029Q(MainTabView.class)) {
                    if (!this.f77813M0) {
                        this.f88756W = 1;
                    }
                    this.f72421L0.finish();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                    m92662fJ().m93069k2(MainTabView.class, bundle, 2, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 9 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Eq */
    public void mo79608Eq(C16719g c16719g, C3000l0 c3000l0, int i11) {
        boolean z11;
        C3047v0 c3047v0;
        String str;
        if (c3000l0 != null) {
            try {
                C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                C32002l4 m154284u = this.f73264A2.mo112339g().m154284u(2);
                if (m14324b0 != null && (c3047v0 = m14324b0.f12022B) != null && (str = c3047v0.f12280b) != null && AbstractC22055v0.m115146f(str, m92676n2(), this, 27, 352, null, this.f73285V2)) {
                    this.f73264A2.mo116656nl();
                    return;
                }
                if (!(c16719g instanceof C21693c) && !(c16719g instanceof C22129e)) {
                    z11 = false;
                    m79577aP(z11, c3000l0, i11, m154284u);
                }
                z11 = true;
                m79577aP(z11, c3000l0, i11, m154284u);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        ActionBarMenuItem m92742i = actionBarMenu.m92742i(AbstractC6918a0.action_bar_head_chat, C27280g.m139660c(m92689tK(), AbstractC23322a.zds_ic_chat_line_24, AbstractC2807a.btn_icon_tertiary_alpha));
        this.f73292Z2 = m92742i;
        AbstractC23136l9.m118744r1(m92742i, 8);
        this.f73290Y2 = actionBarMenu.m92742i(AbstractC6918a0.action_bar_menu_more, C27280g.m139660c(m92689tK(), AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.btn_icon_tertiary_alpha));
        this.f73288X2 = true;
        try {
            this.f73264A2.mo116659od();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: Fj */
    public void mo43564Fj(String str, double d11, double d12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putDouble("EXTRA_INIT_LONGTITUDE", d11);
            bundle.putDouble("EXTRA_INIT_LATITUDE", d12);
            this.f72421L0.m92662fJ().m93069k2(MapInAppView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        return super.mo37483GJ(layoutInflater, viewGroup, bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        f73263j3--;
        try {
            if (m79649qO() != null) {
                m79649qO().m104003N();
            }
            C23528a c23528a = this.f72276R0;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f72276R0 = null;
            }
            m79642mO();
            C26746f.m137569i();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: J */
    public void mo79609J(C26365a c26365a) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), c26365a, 32, 1));
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: JM */
    public int mo78323JM() {
        return AbstractC7409c0.feed_details_view;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        InterfaceC22544a interfaceC22544a;
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 0) {
                if (mo92862f != 2) {
                    if (mo92862f != 3) {
                        if (mo92862f != 4) {
                            if (mo92862f != 7) {
                                if (mo92862f == 8) {
                                    if (i11 == -1 && (interfaceC22544a = this.f73264A2) != null) {
                                        interfaceC22544a.mo116663q2(this.f73300d3);
                                    }
                                    interfaceC17463d.dismiss();
                                    return;
                                }
                                return;
                            }
                            if (i11 == -1) {
                                interfaceC17463d.dismiss();
                                InterfaceC22544a interfaceC22544a2 = this.f73264A2;
                                if (interfaceC22544a2 != null) {
                                    interfaceC22544a2.mo116616Rg();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (i11 == -1) {
                            interfaceC17463d.dismiss();
                            InterfaceC22544a interfaceC22544a3 = this.f73264A2;
                            if (interfaceC22544a3 != null) {
                                interfaceC22544a3.mo116652l7();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        InterfaceC22544a interfaceC22544a4 = this.f73264A2;
                        if (interfaceC22544a4 != null) {
                            interfaceC22544a4.mo116623W7();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    InterfaceC22544a interfaceC22544a5 = this.f73264A2;
                    if (interfaceC22544a5 != null) {
                        interfaceC22544a5.mo116618So();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                InterfaceC22544a interfaceC22544a6 = this.f73264A2;
                if (interfaceC22544a6 != null) {
                    interfaceC22544a6.mo116612Od();
                    return;
                }
                return;
            }
            if (i11 == -4) {
                interfaceC17463d.dismiss();
                InterfaceC22544a interfaceC22544a7 = this.f73264A2;
                if (interfaceC22544a7 != null) {
                    interfaceC22544a7.mo116611Mb();
                    return;
                }
                return;
            }
            if (i11 == -2) {
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 55);
        C23744a.m124114c().m124117e(this, 6007);
        C23744a.m124114c().m124117e(this, 6013);
        C23744a.m124114c().m124117e(this, 6061);
        C23744a.m124114c().m124117e(this, 6097);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: Ka */
    public void mo78325Ka(int i11) {
        try {
            super.mo78325Ka(i11);
            int i12 = this.f72275Q1;
            if (i12 != 0) {
                if (i12 == 1 || i12 == 2) {
                    this.f73264A2.mo116645fe(8);
                }
            } else {
                this.f73264A2.mo116645fe(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2266h
    /* renamed from: Kw */
    public void mo11993Kw(int i11) {
        try {
            View childAt = this.f72303m1.getChildAt(0);
            int i12 = -childAt.getTop();
            if (childAt == this.f72302l1) {
                i12 += this.f73322u2;
            }
            this.f72303m1.smoothScrollBy((i11 + AbstractC23136l9.m118742r(128.0f)) - i12, 1000);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: L7 */
    public void mo79610L7(C3020p0 c3020p0) {
        C20040b c20040b = this.f73302e3;
        if (c20040b != null) {
            c20040b.m104020u();
            this.f73302e3.m104011V(true);
        }
        mo11923Jd(c3020p0);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        SwipeRefreshListView swipeRefreshListView;
        if (super.mo37488Li() && (swipeRefreshListView = this.f72280T0) != null && !swipeRefreshListView.m35363j()) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: NC */
    public void mo79611NC() {
        ListView listView = this.f72303m1;
        if (listView != null) {
            listView.setPadding(0, 0, 0, this.f73325x2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        InterfaceC22544a interfaceC22544a = this.f73264A2;
        if (interfaceC22544a != null) {
            interfaceC22544a.mo995Nd(C22577q0.m116832a(m92642L3()), null);
            this.f73264A2.mo116675zc();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Q2 */
    public void mo11930Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
        this.f73264A2.mo116655n6();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (i11 == 16908332) {
            if (this.f72421L0.m92662fJ().m93029Q(MainTabView.class)) {
                this.f88756W = 1;
            }
            mo79607Dm();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_feed_report_abuse) {
            AbstractC23647d.m123897g("18730");
            showDialog(1);
            return true;
        }
        if (i11 == AbstractC6918a0.menu_edit_caption_feed) {
            this.f73264A2.mo116626Yn(false);
            return true;
        }
        if (i11 == AbstractC6918a0.action_bar_head_chat) {
            this.f73264A2.mo116669tg(false);
            return true;
        }
        if (i11 == AbstractC6918a0.action_bar_menu_more) {
            mo78325Ka(0);
            this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ud
                public /* synthetic */ RunnableC16224ud() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedDetailsView.this.m79575ZO();
                }
            }, 200L);
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Qa */
    public void mo79612Qa(C22548c c22548c) {
        boolean z11;
        int i11 = 8;
        if (c22548c == null) {
            AbstractC23136l9.m118744r1(this.f73290Y2, 8);
            m79581dP();
            return;
        }
        if (c22548c.f110389a && c22548c.f110390b) {
            if (!c22548c.f110391c && !c22548c.f110400l && !c22548c.f110396h && !c22548c.f110397i && !c22548c.f110398j && !c22548c.f110399k && !c22548c.f110393e && !c22548c.f110401m) {
                z11 = false;
            } else {
                z11 = true;
            }
            ActionBarMenuItem actionBarMenuItem = this.f73290Y2;
            if (z11) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(actionBarMenuItem, i11);
            m79650qP();
            return;
        }
        AbstractC23136l9.m118744r1(this.f73290Y2, 8);
        m79581dP();
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Qy */
    public void mo79613Qy(List list, String str, boolean z11) {
        try {
            mo78349kC(list);
            if (!TextUtils.isEmpty(str)) {
                this.f73291Z1.setVisibility(0);
                TextView textView = this.f72271M1;
                if (textView != null) {
                    textView.setText(str);
                }
            } else {
                this.f73291Z1.setVisibility(8);
            }
            if (z11) {
                FeedActionZUtils.m47541b(this, AbstractC23304d.f113308N2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: R */
    public void mo79614R(C2310k c2310k) {
        this.f73265B2.m105865K(this.f73266C2);
        AbstractC2298a0.m12150b(c2310k, m92676n2(), 23, (ImageView) this.f73267D2, this.f72276R0, this.f73265B2);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: R0 */
    public boolean mo79615R0() {
        ListView listView = this.f72303m1;
        if (listView != null && listView.getLastVisiblePosition() >= this.f72304n1.getCount() - 3) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: R2 */
    public void mo79616R2(C2321v c2321v) {
        AbstractC2298a0.m12152d(c2321v, m92662fJ(), 10);
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
                bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                C32002l4 m154284u = this.f73264A2.mo112339g().m154284u(12);
                if (m154284u != null) {
                    bundle.putString("extra_entry_point_flow", m154284u.m154277l());
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
        this.f73320s2 = false;
        super.mo13886RJ();
        mo78325Ka(0);
        if (m79649qO() != null) {
            m79649qO().m104005P();
        }
        C13306b c13306b = this.f73306g3;
        if (c13306b != null) {
            c13306b.m74709u();
        }
        C26333b.f125013a.m135515e();
        if (this.f73268E2 != null) {
            m78956lL().getContentResolver().unregisterContentObserver(this.f73268E2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: RM */
    void mo78336RM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 instanceof ZaloActivity) {
            this.f72273O1 = (C27353a) new C1802w0((ZaloActivity) m92676n2, new C27353a.e(this, null)).m9378a(C27353a.class);
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: S0 */
    public void mo79617S0() {
        try {
            mo78325Ka(2);
            C13306b c13306b = this.f73306g3;
            if (c13306b != null) {
                c13306b.m74689E("tip.feeddetail.commentsticker");
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
            bundle.putInt("extra_presenter_key", C25471d.m131951c().m131953a(this.f73264A2.mo116634c()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: SM */
    void mo78337SM() {
        if (this.f72274P1 == null) {
            this.f72274P1 = (C20111a) new C1802w0(this, new C20111a.b(this, null)).m9378a(C20111a.class);
        }
        this.f72274P1.m104575Q().m9223p(this);
        this.f72274P1.m104575Q().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ce
            public /* synthetic */ C15507ce() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedDetailsView.this.m79534DO((C19964c) obj);
            }
        });
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Sk */
    public void mo79618Sk(int i11, C3020p0 c3020p0, C10873l c10873l) {
        String str;
        String str2;
        String str3;
        C17487o0 mo35579p;
        try {
            Bundle bundle = new Bundle();
            String str4 = "";
            if (i11 == 0) {
                if (c3020p0 != null) {
                    bundle.putString("EXTRA_FEED_ID", c3020p0.f12057p);
                    bundle.putInt("EXTRA_MODE", 0);
                    bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
                    bundle.putString("EXTRA_FEED_OWNER_ID", c3020p0.m14465A());
                }
            } else if (i11 == 2) {
                if (c10873l == null) {
                    str = "";
                } else {
                    str = c10873l.m56487r();
                }
                bundle.putString("EXTRA_FEED_ID", str);
                if (c10873l != null && !TextUtils.isEmpty(c10873l.m56491t())) {
                    str2 = c10873l.m56491t();
                } else {
                    str2 = "0";
                }
                bundle.putString("EXTRA_PHOTO_ID", str2);
                if (c10873l == null) {
                    str3 = "";
                } else {
                    str3 = c10873l.m56493u();
                }
                bundle.putString("EXTRA_CMT_ID", str3);
                bundle.putInt("EXTRA_MODE", 2);
                bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            }
            if (this.f73264A2.mo112339g() != null) {
                str4 = this.f73264A2.mo112339g().m154277l();
            }
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", str4);
            if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
                mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
            }
            mo78325Ka(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: T0 */
    public void mo79619T0() {
        int[] iArr = new int[2];
        this.f72308r1.getLocationOnScreen(iArr);
        m79586gP(iArr[0], iArr[1], this.f72308r1.getHeight(), C31060j.f143193a.m150944q(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.be
            public /* synthetic */ C15471be() {
            }

            @Override // as.InterfaceC2333h
            /* renamed from: b */
            public final void mo12288b(int i11) {
                FeedDetailsView.this.m79562RO(i11);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        if (this.f72421L0.m92648SI() != null && this.f72421L0.m92674mJ()) {
            super.mo37493TJ();
            try {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                    this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_title));
                    this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            C23744a.m124114c().m124115b(this, 24);
            C23744a.m124114c().m124115b(this, 23);
            C23744a.m124114c().m124115b(this, 11);
            C13306b c13306b = this.f73306g3;
            if (c13306b != null) {
                c13306b.m74697c(this.f73308h3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: UL */
    public void mo78939UL(String str) {
        if ("action.follow.oa".equals(str)) {
            this.f73264A2.mo116597Bf();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: UM */
    protected void mo78339UM() {
        try {
            if (this.f72278S0 == null) {
                return;
            }
            this.f73264A2.mo116604J1(401);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView.InterfaceC8112b
    /* renamed from: V3 */
    public int mo43989V3() {
        return this.f73327z2;
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f72300j1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f72300j1.dismiss();
        }
        if (m79649qO() != null) {
            m79649qO().m104009T();
        }
        try {
            C23744a.m124114c().m124117e(this, 24);
            C23744a.m124114c().m124117e(this, 23);
            C23744a.m124114c().m124117e(this, 11);
            C13306b c13306b = this.f73306g3;
            if (c13306b != null) {
                c13306b.m74701i();
            }
            C0820h.m2142e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: VM */
    protected void mo78340VM() {
        this.f72307q1.m72709oO(new C14265j());
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: WF */
    public void mo79620WF(boolean z11) {
        try {
            if (z11) {
                this.f73302e3 = new C20040b(1);
            } else {
                this.f73302e3 = new C20040b(2);
            }
            this.f73302e3.m104016f0(this.f72259A1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: WM */
    public void mo78341WM(View view) {
        try {
            super.mo78341WM(view);
            this.f72280T0.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.fe
                public /* synthetic */ C15622fe() {
                }

                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    FeedDetailsView.this.m79536EO();
                }
            });
            this.f73312k2 = new ChangeableHeightView(this.f72421L0.m92648SI());
            this.f73312k2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            this.f72303m1.addFooterView(this.f73312k2);
            this.f72303m1.setBackgroundResource(AbstractC16803z.rectangle_white);
            this.f72303m1.setScrollingCacheEnabled(false);
            this.f72303m1.setLongClickable(true);
            this.f72303m1.setVerticalScrollBarEnabled(false);
            this.f72303m1.setOnScrollListener(new C14268m());
            C25849b c25849b = new C25849b(this.f72421L0.m92676n2(), 0, this.f72276R0, new C14269n());
            this.f72304n1 = c25849b;
            c25849b.m133437l(this.f73264A2.mo116620Ug());
            this.f72303m1.setAdapter((ListAdapter) this.f72304n1);
            this.f72303m1.setSelection(0);
            this.f72287W1.setOnClickListener(this);
            this.f72290Z0.setVisibility(8);
            this.f72289Y0.setOnClickListener(this);
            this.f72289Y0.setVisibility(8);
            this.f72296f1.setVisibility(8);
            this.f72296f1.setOnClickListener(this);
            this.f73309i2 = view.findViewById(AbstractC6918a0.tvPrivacyInfo);
            FeedDetailsHeaderDecor feedDetailsHeaderDecor = (FeedDetailsHeaderDecor) view.findViewById(AbstractC6918a0.feedHeaderDecor);
            this.f73313l2 = feedDetailsHeaderDecor;
            feedDetailsHeaderDecor.setVisibility(8);
            this.f73289Y1 = (TextView) view.findViewById(AbstractC6918a0.tvFeedTime);
            this.f72271M1 = (TextView) view.findViewById(AbstractC6918a0.tvComment);
            View findViewById = view.findViewById(AbstractC6918a0.layout_like_description_container_view);
            this.f72263E1 = findViewById;
            findViewById.setOnClickListener(this);
            this.f72266H1 = (ModulesView) view.findViewById(AbstractC6918a0.layout_like_description);
            m78315DM();
            this.f72270L1 = (Divider) view.findViewById(AbstractC6918a0.layout_like_info_divider);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutCommentInfo);
            this.f73291Z1 = linearLayout;
            linearLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutLikeInfo);
            this.f72269K1 = relativeLayout;
            relativeLayout.setVisibility(8);
            this.f73293a2 = view.findViewById(AbstractC6918a0.feed_footer_overlay);
            this.f72314x1.setOnClickListener(this);
            RedDotImageButton redDotImageButton = (RedDotImageButton) view.findViewById(AbstractC6918a0.btnGallery);
            this.f73307h2 = redDotImageButton;
            redDotImageButton.setOnClickListener(this);
            View findViewById2 = this.f72278S0.findViewById(AbstractC6918a0.btn_share_memory);
            this.f73311j2 = findViewById2;
            findViewById2.setOnClickListener(this);
            this.f72301k1.addTextChangedListener(this);
            this.f72301k1.setOnClickListener(this);
            this.f72301k1.setmOnImeBack(new ActionEditText.InterfaceC16448a() { // from class: com.zing.zalo.ui.zviews.ge
                public /* synthetic */ C15659ge() {
                }

                @Override // com.zing.zalo.uicontrol.ActionEditText.InterfaceC16448a
                /* renamed from: a */
                public final void mo87301a(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
                    FeedDetailsView.this.m79538FO(actionEditText, str, keyEvent);
                }
            });
            this.f72301k1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.he
                public /* synthetic */ ViewOnFocusChangeListenerC15696he() {
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    FeedDetailsView.this.m79540GO(view2, z11);
                }
            });
            this.f72301k1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.id
                public /* synthetic */ C15732id() {
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m79542HO;
                    m79542HO = FeedDetailsView.this.m79542HO(textView, i11, keyEvent);
                    return m79542HO;
                }
            });
            this.f72299i1.setVisibility(8);
            this.f72299i1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jd
                public /* synthetic */ RunnableC15768jd() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FeedDetailsView.this.m79544IO();
                }
            });
            this.f72308r1.setOnClickListener(this);
            this.f72308r1.setOnLongClickListener(this);
            this.f72311u1.setOnClickListener(this);
            this.f72313w1.setEnabled(false);
            this.f72313w1.setOnClickListener(this);
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tvRetry);
            this.f73295b2 = robotoTextView;
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry).toUpperCase());
            this.f73295b2.setOnClickListener(this);
            RobotoTextView robotoTextView2 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvDelete);
            this.f73297c2 = robotoTextView2;
            robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.delete).toUpperCase());
            this.f73297c2.setOnClickListener(this);
            view.findViewById(AbstractC6918a0.imvRemoveLayoutReplyComment).setOnClickListener(this);
            this.f73299d2 = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutFeedFailFunction);
            m79588hP();
            this.f73301e2 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvStatusPost);
            this.f73303f2 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvDescriptionPost);
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f73305g2 = multiStateView;
            multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.kd
                public /* synthetic */ C15811kd() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    FeedDetailsView.this.m79546JO();
                }
            });
            this.f72315y1.setTopViewGroup(this.f72284V0);
            ArrayList<View> arrayList = new ArrayList<>();
            View findViewById3 = view.findViewById(AbstractC6918a0.sticker_panel_container);
            if (findViewById3 != null) {
                arrayList.add(findViewById3);
            }
            this.f72315y1.setBottomViewsGroup(arrayList);
            this.f72315y1.setOnKeyboardListener(new C14270o());
            C14272q c14272q = new C14272q(view.getContext(), this, this.f72301k1, new C14271p());
            this.f72306p1 = c14272q;
            c14272q.setProcessStickerCallback(new FeedStickerSuggestView.InterfaceC14281b() { // from class: com.zing.zalo.ui.zviews.ld
                public /* synthetic */ C15848ld() {
                }

                @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14281b
                /* renamed from: a */
                public final void mo79746a() {
                    FeedDetailsView.this.mo78343d4();
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(2, this.f72290Z0.getId());
            this.f72284V0.addView(this.f72306p1, layoutParams);
            m79659xO(view);
            EmptyContentView emptyContentView = (EmptyContentView) view.findViewById(AbstractC6918a0.error_empty_state);
            this.f73269F2 = emptyContentView;
            emptyContentView.setEmptyContentListener(new EmptyContentView.InterfaceC8078a() { // from class: com.zing.zalo.ui.zviews.md
                public /* synthetic */ C15885md() {
                }

                @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
                /* renamed from: s */
                public final void mo43432s(C3054x c3054x) {
                    FeedDetailsView.this.m79548KO(c3054x);
                }
            });
            this.f73326y2 = m78956lL().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC17484n.Companion.m92931b();
            this.f73327z2 = AbstractC23136l9.m118713h0() - AbstractC23222t7.f112544W;
            this.f73264A2.mo116595B1();
            m78318GM();
            m79650qP();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: WO */
    public void m79621WO(String str) {
        if (!TextUtils.isEmpty(str)) {
            MediaItem mediaItem = new MediaItem(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            this.f73264A2.mo116643f0(arrayList);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: We */
    public void mo11939We(View view, C3000l0 c3000l0, int i11) {
        m79577aP(view instanceof ImageView, c3000l0, i11, this.f73264A2.mo112339g());
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: X1 */
    public void mo79622X1() {
        mo78936E(C19140e.m100450e(m92689tK()));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(18);
            }
            m78367zN(AbstractC23309i.m122007i5(m78956lL()));
        }
        if (this.f73324w2) {
            mo78325Ka(this.f73323v2);
            this.f73324w2 = false;
        }
        if (z11 && !z12) {
            try {
                if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                    this.f72421L0.m92676n2().getWindow().setBackgroundDrawable(new ColorDrawable(C23212s8.m119607o(this.f72421L0.m92676n2().getContext(), AbstractC16781w.PrimaryBackgroundColor)));
                }
                C13306b c13306b = this.f73306g3;
                if (c13306b != null) {
                    c13306b.m74699e("tip.any");
                }
                this.f73264A2.mo116603H3(true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: XO */
    public void m79623XO() {
        this.f73264A2.mo116667si();
    }

    @Override // com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView.InterfaceC8112b
    /* renamed from: Y1 */
    public int mo43990Y1() {
        return this.f73326y2;
    }

    /* renamed from: YO */
    public void m79624YO(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                AbstractC28207v1.m141994i3(str, 4, m92676n2(), this, str2, new C31877d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
        LinearLayout linearLayout;
        int i11;
        if (c20275e != null && (linearLayout = this.f72299i1) != null) {
            if (linearLayout.getVisibility() == 0) {
                i11 = this.f72299i1.getHeight();
            } else {
                i11 = 0;
            }
            c20275e.m105881t(i11);
        }
        FeedActionZUtils.m47533U(animationTarget, this.f72276R0, str, bundle, c20275e, 10000, this, c3020p0, m92676n2(), trackingSource, z11, 11, this.f73264A2.mo112339g());
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: ZB */
    public void mo79625ZB(int i11, boolean z11) {
        Context context;
        int i12;
        View view = this.f73311j2;
        if (view != null && view.getVisibility() != i11) {
            this.f73311j2.setVisibility(i11);
            if (z11) {
                View view2 = this.f73311j2;
                if (i11 == 0) {
                    context = getContext();
                    i12 = AbstractC10919t.fade_in;
                } else {
                    context = getContext();
                    i12 = AbstractC10919t.fade_out;
                }
                view2.startAnimation(AnimationUtils.loadAnimation(context, i12));
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        m79602wO();
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Zf */
    public void mo11944Zf(C3000l0 c3000l0) {
        this.f72274P1.m104573O(c3000l0);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: Zu */
    public void mo79626Zu() {
        ListView listView = this.f72303m1;
        if (listView != null) {
            listView.setTranscriptMode(0);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: aF */
    public void mo79627aF(boolean z11) {
        int i11;
        int i12;
        View view = this.f72263E1;
        int i13 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(view, i11);
        RedDotImageButton redDotImageButton = this.f73307h2;
        if (z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(redDotImageButton, i12);
        RelativeLayout relativeLayout = this.f72308r1;
        if (z11) {
            i13 = 0;
        }
        AbstractC23136l9.m118744r1(relativeLayout, i13);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: ae */
    public void mo79628ae(C3000l0 c3000l0) {
        C20111a c20111a = this.f72274P1;
        if (c20111a != null) {
            c20111a.m104576R(c3000l0);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            this.f73273J2 = editable;
            String trim = this.f72301k1.getText().toString().trim();
            if (trim.length() > this.f73264A2.mo112333R()) {
                this.f72301k1.setText(trim.substring(0, this.f73264A2.mo112333R()));
                this.f72301k1.setSelection(this.f73264A2.mo112333R());
            }
            this.f72283U1.removeCallbacks(this.f73274K2);
            this.f72283U1.postDelayed(this.f73274K2, 150L);
            m78354nN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bP */
    void m79629bP() {
        FeedItemZaloVideoView videoView;
        if (this.f72259A1 != null) {
            for (int i11 = 0; i11 < this.f72259A1.getChildCount(); i11++) {
                View childAt = this.f72259A1.getChildAt(i11);
                if (childAt != null) {
                    if (childAt instanceof FeedItemVideo) {
                        ((FeedItemVideo) childAt).m44213t0();
                    }
                    if ((childAt instanceof FeedItemZaloVideoContainerView) && (videoView = ((FeedItemZaloVideoContainerView) childAt).getVideoView()) != null) {
                        videoView.m44357F0();
                    }
                    if (AbstractC26683d.f126393l && (childAt instanceof FeedItemBase)) {
                        ((FeedItemBase) childAt).m43689w();
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: bh */
    public void mo79630bh(C3020p0 c3020p0) {
        C3039t0 c3039t0;
        boolean z11;
        int i11;
        if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null) {
            this.f73316o2 = c3039t0.f12244b;
            m79590jP(c3020p0);
            m79596nP(c3020p0);
            int i12 = 0;
            if (c3020p0.f12025E.f12244b > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            View view = this.f72263E1;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
            AbstractC23136l9.m118744r1(this.f72269K1, 0);
            View view2 = this.f73293a2;
            if (!c3020p0.f12027G) {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(view2, i12);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: bw */
    public void mo11947bw(C3000l0 c3000l0) {
        this.f72274P1.m104574P(c3000l0);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: c0 */
    public boolean mo79631c0(String str) {
        return AbstractC22055v0.m115146f(str, m92676n2(), this, 27, 354, null, this.f73285V2);
    }

    /* renamed from: cP */
    void m79632cP(C23910c c23910c) {
        C3000l0 c3000l0 = c23910c.f115538a;
        if (c3000l0 != null && c3000l0.m14322a0() != null && c23910c.f115544g != null && this.f72260B1 != null && this.f72261C1 != null) {
            C3020p0 m14322a0 = c23910c.f115538a.m14322a0();
            if (m14322a0.m14479H() && m14322a0.m14472D0()) {
                this.f72261C1.m43747Y(m14322a0, this, 4, 2);
                this.f72261C1.setVisibility(0);
            } else {
                this.f72261C1.setVisibility(8);
            }
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        InterfaceC22544a interfaceC22544a = this.f73264A2;
        if (interfaceC22544a != null) {
            return interfaceC22544a.mo112337d1();
        }
        return C26361j.f125215a.m135697c(this);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: d2 */
    public void mo79633d2() {
        if (!this.f72316z1) {
            mo78325Ka(1);
        }
    }

    /* renamed from: eP */
    void m79634eP(View view) {
        FrameLayout frameLayout = this.f72259A1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            if (view != null) {
                this.f72259A1.addView(view);
            }
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: f8 */
    public void mo79635f8(C2312m c2312m) {
        AbstractC2298a0.m12152d(c2312m, m92662fJ(), 0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        try {
            AbstractC2379w.m12430d(this.f72301k1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ()) {
            C22579r0 mo116665rd = this.f73264A2.mo116665rd();
            if (mo116665rd != null) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                if (mo116665rd.f110491b) {
                    bundle.putString("feedId", mo116665rd.f110490a);
                    bundle.putBoolean("deleted", true);
                }
                if (mo116665rd.f110506q) {
                    bundle.putString("feedId", mo116665rd.f110490a);
                    bundle.putBoolean("hideUserFeed", true);
                } else {
                    bundle.putString("feedId", mo116665rd.f110490a);
                    AbstractC20805l.m108551i(bundle, mo116665rd);
                    bundle.putInt("privacy_type", mo116665rd.f110498i);
                    ArrayList arrayList = mo116665rd.f110492c;
                    if (arrayList != null && arrayList.size() > 0) {
                        bundle.putStringArrayList("deletedPhoto", mo116665rd.f110492c);
                    }
                    C3003l3 c3003l3 = mo116665rd.f110500k;
                    if (c3003l3 != null) {
                        bundle.putInt("extra_result_tag_count", c3003l3.f11956a);
                        if (mo116665rd.f110499j) {
                            bundle.putSerializable("extra_result_tag_uids", mo116665rd.f110500k.f11957b);
                        }
                    }
                }
                if (mo116665rd.f110501l) {
                    bundle.putString("extra_feed_memory_id", mo116665rd.f110502m);
                    bundle.putDouble("extra_ratio_zinstant", mo116665rd.f110503n);
                    bundle.putString("extra_memory_zinstant_feed_info", mo116665rd.f110504o);
                    bundle.putBoolean("extra_is_valid_content", mo116665rd.f110505p);
                }
                intent.putExtras(bundle);
                mo50035CK(-1, intent);
            }
            this.f73264A2.mo116596B6();
            this.f73264A2.mo112331O3();
            this.f73264A2.mo112323D2();
            C13306b c13306b = this.f73306g3;
            if (c13306b != null) {
                c13306b.m74694J();
            }
            super.finish();
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: g1 */
    public void mo79636g1(MediaItem mediaItem) {
        if (mediaItem != null) {
            try {
                if (AbstractC23041d2.m118194A(mediaItem.mo41081Q())) {
                    if (AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 17, 2, AbstractC28568a.m142995a(mediaItem)) != null) {
                        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qd
                            public /* synthetic */ RunnableC16052qd() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FeedDetailsView.this.m79558PO();
                            }
                        }, 300L);
                        this.f73321t2 = true;
                        this.f73323v2 = this.f72275Q1;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FeedDetailsView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: h0 */
    public boolean mo45894h0() {
        return !this.f72421L0.mo60294yp();
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: i4 */
    public void mo79637i4(boolean z11) {
        try {
            CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
            if (commentSupportGifEditText != null) {
                commentSupportGifEditText.clearFocus();
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_timeline_comment_feed", "social_timeline"));
            AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), 11, 17, z11, bundle);
            C13306b c13306b = this.f73306g3;
            if (c13306b != null) {
                c13306b.m74689E("tip.feeddetail.commentphoto");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // w20.InterfaceC28702e
    /* renamed from: iH */
    public boolean mo67148iH() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: iM */
    public int mo46047iM() {
        return 3;
    }

    /* renamed from: iO */
    void m79638iO(RelativeLayout.LayoutParams layoutParams, int i11) {
        if (layoutParams.bottomMargin != i11) {
            layoutParams.bottomMargin = i11;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: jM */
    public int mo79521jM(Class cls) {
        if (ProfileAlbumDetailView.class.isAssignableFrom(cls)) {
            return 29;
        }
        return super.mo79521jM(cls);
    }

    /* renamed from: jO */
    void m79639jO(View view, int i11) {
        if (view.getPaddingBottom() != i11) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: k0 */
    public void mo11959k0(ContactProfile contactProfile) {
        AbstractC20826v0.m108848z0(this.f72421L0.m92676n2(), contactProfile);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: kM */
    public FeedActionZUtils.InterfaceC8913k mo79522kM() {
        if (this.f73294a3 == null) {
            this.f73294a3 = new C14261f();
        }
        return this.f73294a3;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: kv */
    public void mo79640kv(C2301c c2301c) {
        AbstractC2298a0.m12152d(c2301c, m92662fJ(), 12);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, p302ko.InterfaceC21780b
    /* renamed from: lb */
    public void mo78350lb(long j11) {
        try {
            ListView listView = this.f72303m1;
            if (listView != null) {
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.hd
                    public /* synthetic */ RunnableC15695hd() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedDetailsView.this.m79560QO();
                    }
                }, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: lq */
    public void mo79641lq(View view, C3000l0 c3000l0) {
        mo11951dx(view, c3000l0, this.f73319r2);
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
        try {
            if (m92676n2() != null && (m92648SI() instanceof BaseZaloActivity)) {
                c20275e.m105868N(this);
                this.f73264A2.mo116607K0(bundle);
                ((BaseZaloActivity) m92648SI()).mo35551H2(animationTarget, str, bundle, c20275e, i11);
            } else {
                this.f73264A2.mo116607K0(bundle);
                this.f72421L0.m92662fJ().m93066i2(FeedImageViewer.class, bundle, i11, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: mN */
    protected void mo78352mN(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 10);
        bundle.putString("extra_song_id", str2);
        bundle.putString("extra_feed_id", str);
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 31, 1, true);
    }

    /* renamed from: mO */
    void m79642mO() {
        try {
            if (this.f72303m1 != null) {
                this.f72303m1 = null;
            }
            this.f72302l1 = null;
            this.f73305g2 = null;
            this.f72269K1 = null;
            this.f72307q1 = null;
            this.f73291Z1 = null;
            this.f72299i1 = null;
            AbstractC20789d.m108483q(this.f72262D1, this.f72421L0.m92676n2());
            this.f72262D1 = null;
            m79629bP();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: ma */
    public void mo79643ma() {
        try {
            MultiStateView multiStateView = this.f73305g2;
            if (multiStateView != null) {
                multiStateView.setVisibility(0);
                this.f73305g2.setState(MultiStateView.EnumC15914e.ERROR);
                this.f73305g2.setErrorType(MultiStateView.EnumC15915f.DELETED_ERROR);
                this.f73305g2.setErrorImageResource(AbstractC16803z.ic_unavailable_post);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f73305g2.getErrorView().getLayoutParams();
                marginLayoutParams.topMargin = AbstractC23136l9.m118742r(40.0f);
                this.f73305g2.getErrorView().setLayoutParams(marginLayoutParams);
                this.f73305g2.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_feed_not_exist));
                this.f73305g2.setErrorTitleColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
                this.f73305g2.setErrorTitleSize(AbstractC23136l9.m118742r(14.0f));
            }
            AbstractC23136l9.m118744r1(this.f72299i1, 8);
            AbstractC23136l9.m118744r1(this.f72280T0, 8);
            AbstractC23136l9.m118744r1(this.f73269F2, 8);
            mo78325Ka(0);
            mo78331OB();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nO */
    void m79644nO(Runnable runnable) {
        try {
            if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ() && this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(runnable);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: o1 */
    public void mo79645o1(int i11) {
        try {
            C0697c0.Companion.m1054h(getTrackingKey(), "feed_type", Integer.valueOf(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oO */
    public void m79646oO(String str) {
        this.f73264A2.mo116601H(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            mo78325Ka(0);
            if (i11 == 10000 && i12 == -1) {
                if (intent != null) {
                    this.f73264A2.mo116638d3(C23913f.m125040a(intent));
                }
            } else if (i11 == 10 && i12 == -1) {
                if (intent != null) {
                    this.f73264A2.mo116619U1(C23914g.m125041a(intent));
                }
            } else {
                if (i11 != 1017 && i11 != 1018) {
                    if (i11 == 1019) {
                        FeedActionZUtils.m47515C(i12, intent, mo79522kM());
                    } else if (i11 == 1035) {
                        this.f73324w2 = true;
                    } else if (i11 == 12) {
                        if (i12 == -1 && intent != null) {
                            this.f73264A2.mo116666s9(EditFeedView.m79360fU(intent));
                        }
                    } else if (i11 == 11 && i12 == -1) {
                        if (intent != null) {
                            this.f73264A2.mo116643f0(GalleryPickerView.m71440ZM(intent));
                        }
                    } else if (i11 == 17) {
                        this.f73321t2 = false;
                        this.f73324w2 = true;
                        if (i12 == -1 && intent != null) {
                            this.f73264A2.mo112325K2(C23912e.m125039a(intent), this.f72293c1.getPreviewData());
                        }
                    } else if (i11 == 23) {
                        if (i12 == -1 && intent != null) {
                            this.f73264A2.mo116654n0(intent.getStringArrayListExtra("EXTRA_DELETED_COMMENTS"));
                        }
                    } else if (i11 == 10014 && i12 == -1) {
                        this.f73264A2.mo116630b2(C23915h.m125042a(intent));
                    } else if (i11 == 1020) {
                        FeedActionZUtils.m47516D(i12, intent, mo79522kM(), this);
                    } else if (i11 == 27) {
                        this.f73264A2.mo116628Za();
                    } else if (i11 == 12200 && i12 == -1) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
                    } else if (i11 == 28 && i12 == -1) {
                        mo79607Dm();
                    } else if (i11 == 29 && i12 == -1) {
                        if (intent != null) {
                            this.f73264A2.mo116661op(C23908a.m125038a(intent));
                        }
                    } else if (i11 == 30 && i12 == -1) {
                        m79655uO(intent);
                    } else if (i11 == 31 && i12 == -1) {
                        m78326LM(i12, intent);
                    } else if (i11 == 32) {
                        mo78356q0();
                    }
                }
                FeedActionZUtils.m47517E(i12, intent, mo79522kM());
            }
            StickerPanelView stickerPanelView = this.f72307q1;
            if (stickerPanelView != null) {
                stickerPanelView.onActivityResult(i11, i12, intent);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("FeedDetailsView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btnLoadMore) {
                if (C23055e5.m118272g(true)) {
                    AbstractC23647d.m123897g("18400");
                    if (this.f72303m1 != null && this.f72280T0.m35364k()) {
                        return;
                    }
                    AbstractC23136l9.m118744r1(this.f72296f1, 8);
                    this.f73264A2.mo112346y2(true);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.layout_like_description_container_view) {
                this.f73264A2.mo116602H2(0, null);
                return;
            }
            if (id2 == AbstractC6918a0.imgEmoSticker) {
                if (!this.f72316z1 && this.f72275Q1 == 2) {
                    CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
                    if (commentSupportGifEditText != null) {
                        commentSupportGifEditText.requestFocus();
                    }
                    mo78325Ka(1);
                    AbstractC23647d.m123897g("188022");
                } else {
                    mo78325Ka(2);
                    AbstractC23647d.m123897g("188020");
                }
                C13306b c13306b = this.f73306g3;
                if (c13306b != null) {
                    c13306b.m74689E("tip.feeddetail.commentsticker");
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.btnGallery) {
                mo79637i4(true);
                AbstractC23647d.m123897g("188010");
                return;
            }
            if (id2 == AbstractC6918a0.cmtinput_text) {
                mo79633d2();
                AbstractC23647d.m123897g("188014");
                return;
            }
            if (id2 == AbstractC6918a0.btn_like) {
                C19136a.f95164a.m100437b(view);
                this.f73264A2.mo116655n6();
                return;
            }
            if (id2 == AbstractC6918a0.cmtinput_send) {
                CommentSupportGifEditText commentSupportGifEditText2 = this.f72301k1;
                if (commentSupportGifEditText2 != null && commentSupportGifEditText2.getText() != null) {
                    str2 = this.f72301k1.getText().toString().trim();
                } else {
                    str2 = "";
                }
                this.f73264A2.mo116635c0(str2, m79600tO());
                return;
            }
            if (id2 == AbstractC6918a0.tvRetry) {
                this.f73264A2.mo116633bp();
                return;
            }
            if (id2 == AbstractC6918a0.tvDelete) {
                showDialog(3);
                return;
            }
            if (id2 == AbstractC6918a0.imvRemoveLayoutReplyComment) {
                LinearLayout linearLayout = this.f72290Z0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            if (id2 != AbstractC6918a0.imvEmptyIcon && id2 != AbstractC6918a0.tvSuggestSeeMore) {
                if (id2 == AbstractC6918a0.btn_share_memory) {
                    this.f73264A2.mo116617Sf(8);
                    return;
                } else if (id2 == AbstractC6918a0.btn_comment) {
                    mo79633d2();
                    return;
                } else {
                    super.onClick(view);
                    return;
                }
            }
            if (this.f72275Q1 != 2) {
                mo78325Ka(2);
                if (view.getId() == AbstractC6918a0.imvEmptyIcon) {
                    str = "18804";
                } else {
                    str = "18805";
                }
                AbstractC23647d.m123897g(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        try {
            if (C25979a.m133814e(this.f72421L0, i11, keyEvent) || this.f72421L0.m78934CL(i11, keyEvent)) {
                return true;
            }
            if (m79649qO() != null && m79649qO().m104004O(i11, keyEvent)) {
                return true;
            }
            if (i11 == 4) {
                if (this.f77813M0) {
                    if (this.f72421L0.m92656bJ() != null) {
                        this.f72421L0.m92656bJ().onKeyUp(i11, keyEvent);
                    }
                    return true;
                }
                if (this.f72275Q1 == 1) {
                    mo78325Ka(0);
                    return true;
                }
                if (this.f72316z1) {
                    return true;
                }
                StickerPanelView stickerPanelView = this.f72307q1;
                if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                    mo78325Ka(0);
                } else {
                    if (m92693xK().m93029Q(MainTabView.class)) {
                        this.f88756W = 1;
                    }
                    mo79607Dm();
                }
                return true;
            }
            if (i11 == 82) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return super.onKeyUp(i11, keyEvent);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.btn_like) {
                m79623XO();
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
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

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        this.f73320s2 = true;
        super.onResume();
        FeedStickerSuggestView feedStickerSuggestView = this.f72306p1;
        if (feedStickerSuggestView != null) {
            feedStickerSuggestView.m79733e();
        }
        this.f73264A2.mo116640dn();
        if (m79649qO() != null) {
            m79649qO().m104006Q();
        }
        m79593lO();
        this.f73264A2.mo116673y1();
        C13306b c13306b = this.f73306g3;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        AbstractC20789d.m108469c(this.f72303m1, this.f72304n1);
        SwipeRefreshListView swipeRefreshListView = this.f72280T0;
        if (swipeRefreshListView != null && swipeRefreshListView.m35364k()) {
            this.f72280T0.setRefreshing(false);
        }
        if (this.f73268E2 != null) {
            m78956lL().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f73268E2);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        try {
            m78313AN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: pM */
    public void mo79526pM(C3020p0 c3020p0) {
        String str;
        if (c3020p0 != null) {
            str = c3020p0.m14469C();
        } else {
            str = "";
        }
        this.f73298c3 = str;
        showDialog(6);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: pa */
    public void mo79647pa(C16719g c16719g, C3000l0 c3000l0) {
        mo11954fz(c16719g, c3000l0, this.f73319r2);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: pb */
    public void mo79648pb(C3000l0 c3000l0) {
        try {
            View m78321IM = m78321IM();
            if (m78321IM instanceof FeedItemSocialAlbum) {
                C20040b c20040b = this.f73302e3;
                if (c20040b != null) {
                    c20040b.m104020u();
                    this.f73302e3.m104011V(true);
                }
                mo11957ig(c3000l0, 0, AbstractC20826v0.m108787U(c3000l0.m14322a0(), 0), 1, ((FeedItemSocialAlbum) m78321IM).f44639s0, ((FeedItemSocialAlbum) m78321IM).f44639s0.getVideoDisplayView());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qO */
    public C20040b m79649qO() {
        return this.f73302e3;
    }

    /* renamed from: qP */
    void m79650qP() {
        ActionBarMenuItem actionBarMenuItem;
        int i11;
        InterfaceC22544a interfaceC22544a = this.f73264A2;
        if (interfaceC22544a != null && (actionBarMenuItem = this.f73292Z2) != null) {
            if (interfaceC22544a.mo116639d4()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
            m79581dP();
        }
    }

    /* renamed from: rO */
    public String m79651rO() {
        InterfaceC22544a interfaceC22544a = this.f73264A2;
        if (interfaceC22544a != null) {
            return interfaceC22544a.mo112324I();
        }
        return "";
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: rl */
    public void mo79652rl(C2314o c2314o) {
        AbstractC2298a0.m12152d(c2314o, m92662fJ(), 28);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: sO */
    public InterfaceC22544a mo78324KM() {
        return this.f73264A2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p329lo.InterfaceC22546b
    /* renamed from: tf */
    public void mo79654tf(C23910c c23910c) {
        View view;
        int i11;
        if (c23910c == null) {
            return;
        }
        try {
            MultiStateView multiStateView = this.f73305g2;
            if (multiStateView != null && multiStateView.getVisibility() != 8) {
                AbstractC23115k.m118570a(this.f73305g2, AbstractC10919t.fadeout);
            }
            c23910c.f115544g = this.f72421L0.m92648SI();
            c23910c.f115545h = this.f73318q2;
            c23910c.f115546i = this;
            c23910c.f115547j = this;
            c23910c.f115548k = this;
            c23910c.f115549l = this;
            c23910c.f115550m = this.f73264A2.mo116670vn();
            c23910c.f115551n = this;
            c23910c.f115553p = this.f73319r2;
            View m78321IM = m78321IM();
            View m131962b = AbstractC25477j.m131962b(c23910c, m78321IM, 4);
            if (m131962b instanceof FeedItemSuggestMultiBase) {
                c23910c.f115552o = new C14263h(m131962b);
            }
            if (this.f72421L0.m92656bJ() != null && this.f72421L0.m92656bJ().getHeight() > 0 && this.f72421L0.m92656bJ().getWidth() > 0) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.getHeight();
                }
                LinearLayout linearLayout = this.f72299i1;
                if (linearLayout != null) {
                    linearLayout.getHeight();
                }
                this.f72421L0.m92656bJ().getHeight();
                c23910c.f115554q = this.f72421L0.m92656bJ().getWidth();
                c23910c.f115555r = (int) (this.f72303m1.getMeasuredHeight() * 0.7f);
            }
            C29106b m131961a = AbstractC25477j.m131961a(c23910c);
            if (m131961a != null) {
                if (m131962b instanceof FeedItemBaseModuleView) {
                    FeedItemBaseModuleView feedItemBaseModuleView = (FeedItemBaseModuleView) m131962b;
                    if (feedItemBaseModuleView instanceof FeedItemStickerModulesView) {
                        ((FeedItemStickerModulesView) feedItemBaseModuleView).setStickerPrefixId("FEED_DETAIL_");
                    }
                    if (m131962b instanceof FeedItemPhotoModuleView) {
                        ((FeedItemPhotoModuleView) m131962b).f44571l0 = (int) (AbstractC23136l9.m118716i0(this.f72421L0.getContext()) * 0.7f);
                    }
                    feedItemBaseModuleView.mo43694W(m131961a);
                    feedItemBaseModuleView.setListListener(m78332OM(feedItemBaseModuleView));
                } else if (m131962b instanceof FeedItemBase) {
                    FeedItemBase feedItemBase = (FeedItemBase) m131962b;
                    feedItemBase.mo43686j(m131961a);
                    feedItemBase.setListListener(m78330NM(feedItemBase, m131961a.f134937a));
                }
                if (m131962b instanceof FeedItemPhotoModuleView) {
                    this.f73264A2.mo116664qi();
                } else if (m131962b instanceof FeedItemOAVideo) {
                    if (ZMediaPlayerSettings.isVideoAutoplay() && m79649qO() != null) {
                        m79649qO().m104015e0((FeedItemOAVideo) m131962b);
                        m79649qO().m104000A(true);
                    }
                } else if (m131962b instanceof FeedItemVideo) {
                    if (ZMediaPlayerSettings.isVideoAutoplay() && m79649qO() != null) {
                        m79649qO().m104013Z((FeedItemVideo) m131962b, 0);
                        m79649qO().m104000A(true);
                    }
                    this.f73264A2.mo116664qi();
                } else if (m131962b instanceof FeedItemZaloVideoContainerView) {
                    FeedItemZaloVideoView videoView = ((FeedItemZaloVideoContainerView) m131962b).getVideoView();
                    if (videoView != null) {
                        videoView.mo43686j(m131961a);
                        videoView.setListListener(m78330NM(videoView, m131961a.f134937a));
                        videoView.setOpenZShortVideoListener(new FeedItemZaloVideoView.InterfaceC8181b() { // from class: com.zing.zalo.ui.zviews.nd
                            public /* synthetic */ C15940nd() {
                            }

                            @Override // com.zing.zalo.feed.components.FeedItemZaloVideoView.InterfaceC8181b
                            /* renamed from: a */
                            public final void mo44364a(C3033r3 c3033r3) {
                                FeedDetailsView.this.mo11932R9(c3033r3);
                            }
                        });
                    }
                    if (ZMediaPlayerSettings.isVideoAutoplay() && m79649qO() != null) {
                        m79649qO().m104013Z((FeedItemZaloVideoContainerView) m131962b, 0);
                        m79649qO().m104000A(true);
                    }
                } else if (m131962b instanceof FeedItemSocialAlbum) {
                    ((FeedItemSocialAlbum) m131962b).setVideoMixClickListener(new FeedItemSocialAlbumPhoto.InterfaceC8127a() { // from class: com.zing.zalo.ui.zviews.od

                        /* renamed from: b */
                        public final /* synthetic */ C29106b f81461b;

                        /* renamed from: c */
                        public final /* synthetic */ View f81462c;

                        public /* synthetic */ C15978od(C29106b m131961a2, View m131962b2) {
                            r2 = m131961a2;
                            r3 = m131962b2;
                        }

                        @Override // com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto.InterfaceC8127a
                        /* renamed from: a */
                        public final void mo44050a(int i12) {
                            FeedDetailsView.this.m79528AO(r2, r3, i12);
                        }
                    });
                }
                if (m131962b2 != m78321IM) {
                    m79634eP(m131962b2);
                    if (m131962b2 instanceof FeedItemSocialAlbum) {
                        ((FeedItemSocialAlbum) m131962b2).setRoundRect(4);
                    }
                }
                m79632cP(c23910c);
            }
            C3020p0 c3020p0 = c23910c.f115539b;
            if (c3020p0 != null) {
                if (!c3020p0.m14498b0()) {
                    this.f73289Y1.setText(AbstractC23160o0.m119284r(c3020p0.f12062u, true));
                } else {
                    AbstractC23136l9.m118744r1(this.f73289Y1, 8);
                }
                m79585gO(c3020p0);
                if (c3020p0.f12027G) {
                    this.f73264A2.mo116608Kj();
                    m79589iP(c3020p0);
                    C3000l0 c3000l0 = c23910c.f115538a;
                    if (c3000l0 != null) {
                        C3000l0.w m108845y = AbstractC20826v0.m108845y(c3000l0.f11892o0, c3000l0.f11895q);
                        RobotoTextView robotoTextView = this.f73301e2;
                        if (robotoTextView != null) {
                            robotoTextView.setText(m108845y.f11951b);
                        }
                        RobotoTextView robotoTextView2 = this.f73303f2;
                        if (robotoTextView2 != null) {
                            robotoTextView2.setText(m108845y.f11952c);
                        }
                        RobotoTextView robotoTextView3 = this.f73295b2;
                        if (robotoTextView3 != null) {
                            if (m108845y.f11953d) {
                                i11 = 0;
                            } else {
                                i11 = 8;
                            }
                            robotoTextView3.setVisibility(i11);
                        }
                    }
                    m79588hP();
                    AbstractC23136l9.m118744r1(this.f73299d2, 0);
                    this.f73299d2.requestLayout();
                    AbstractC23136l9.m118744r1(this.f72297g1, 8);
                } else if (c23910c.f115542e) {
                    m78363vN(this.f72303m1);
                    m78363vN(this.f72299i1);
                } else {
                    this.f72280T0.setVisibility(0);
                    this.f72299i1.setVisibility(0);
                }
                if (c23910c.f115543f && (view = this.f73309i2) != null) {
                    view.setEnabled(false);
                }
                if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().isFinishing()) {
                    this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.pd
                        public /* synthetic */ RunnableC16015pd() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedDetailsView.this.m79530BO();
                        }
                    });
                }
                if (m131962b2 instanceof InterfaceC8403u6) {
                    FeedItemZInstantLifecycleHelper.m44299a(getLifecycle(), (InterfaceC8403u6) m131962b2);
                }
                if (c3020p0.f12058q == 17) {
                    C32065p8.m154684c().m154701r(true);
                }
                if (c3020p0.f12058q == 3) {
                    int m95929b = c3020p0.f12023C.f12127r.m95929b();
                    C0708i c0708i = new C0708i();
                    c0708i.m1072c("layout_id", m95929b);
                    c0708i.m1072c("source", this.f73264A2.mo116627Z8());
                    C0732w.Companion.m1189a().m1187q("view_feed_detail_multi_photo", "", c0708i, null);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: uO */
    void m79655uO(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        C3020p0 c3020p0;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45565a() != null && bottomSheetMenuResult.m45569e() == 3 && bottomSheetMenuResult.m45571g() != 0) {
                    C20637a m45565a = bottomSheetMenuResult.m45565a();
                    if (m45565a != null) {
                        c3020p0 = m45565a.m107541c();
                    } else {
                        c3020p0 = null;
                    }
                    if (c3020p0 == null) {
                        return;
                    }
                    int m45571g = bottomSheetMenuResult.m45571g();
                    if (m45571g != 3) {
                        if (m45571g != 6) {
                            if (m45571g != 13) {
                                if (m45571g != 21) {
                                    if (m45571g != 41) {
                                        switch (m45571g) {
                                            case 8:
                                                AbstractC23647d.m123897g("18720");
                                                showDialog(0);
                                                return;
                                            case 9:
                                                AbstractC23647d.m123897g("18730");
                                                showDialog(1);
                                                return;
                                            case 10:
                                                this.f73264A2.mo116647ij();
                                                return;
                                            case 11:
                                                this.f73264A2.mo116626Yn(false);
                                                return;
                                            default:
                                                switch (m45571g) {
                                                    case 15:
                                                        this.f73264A2.mo116642el(true);
                                                        return;
                                                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                        this.f73264A2.mo116600G7();
                                                        return;
                                                    case 17:
                                                        this.f73264A2.mo116617Sf(9);
                                                        return;
                                                    case 18:
                                                        showDialog(4);
                                                        return;
                                                    case 19:
                                                        this.f73264A2.mo116660oh();
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                    }
                                    this.f73264A2.mo116631b4();
                                    return;
                                }
                                this.f73264A2.mo116615R8();
                                return;
                            }
                            showDialog(7);
                            return;
                        }
                        this.f73264A2.mo116642el(false);
                        return;
                    }
                    this.f73264A2.mo116658oc();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: vc */
    public void mo79656vc(C3000l0 c3000l0) {
        try {
            View m78321IM = m78321IM();
            if (m78321IM instanceof FeedItemVideo) {
                C20040b c20040b = this.f73302e3;
                if (c20040b != null) {
                    c20040b.m104020u();
                    this.f73302e3.m104011V(true);
                }
                mo11957ig(c3000l0, 0, AbstractC20826v0.m108789V(c3000l0.m14322a0()), 1, m78321IM, ((FeedItemVideo) m78321IM).getVideoDisplayView());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: w0 */
    public void mo79657w0(C3054x c3054x) {
        EmptyContentView emptyContentView = this.f73269F2;
        if (emptyContentView != null) {
            AbstractC23136l9.m118744r1(emptyContentView, 0);
            this.f73269F2.m43610e(c3054x);
            AbstractC23136l9.m118744r1(this.f72299i1, 8);
            AbstractC23136l9.m118744r1(this.f72280T0, 8);
            AbstractC23136l9.m118744r1(this.f73305g2, 8);
            AbstractC23136l9.m118744r1(this.f73292Z2, 8);
            AbstractC23136l9.m118744r1(this.f73290Y2, 8);
        }
        mo78325Ka(0);
        mo78331OB();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: wJ */
    public boolean mo49160wJ() {
        return true;
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: wc */
    public void mo79658wc(View view, C3000l0 c3000l0, int i11) {
        C3047v0 c3047v0;
        String str;
        if (c3000l0 != null) {
            try {
                C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                C32002l4 mo112339g = this.f73264A2.mo112339g();
                if (m14324b0 != null && (c3047v0 = m14324b0.f12022B) != null && (str = c3047v0.f12280b) != null && AbstractC22055v0.m115146f(str, m92676n2(), this, 27, 352, null, this.f73285V2)) {
                    this.f73264A2.mo116656nl();
                } else {
                    m79577aP(view instanceof ImageView, c3000l0, i11, mo112339g);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 11) {
                if (i11 != 12) {
                    if (i11 != 23) {
                        if (i11 != 24) {
                            if (i11 != 55) {
                                if (i11 != 6007) {
                                    if (i11 != 6013) {
                                        if (i11 != 6061) {
                                            if (i11 == 6097) {
                                                this.f73264A2.mo116614R0();
                                            }
                                        } else {
                                            C27353a c27353a = this.f72273O1;
                                            if (c27353a != null) {
                                                c27353a.m140006y0();
                                            }
                                        }
                                    } else {
                                        this.f73264A2.mo116671w();
                                    }
                                } else if (objArr != null) {
                                    if (objArr.length > 0) {
                                        this.f73264A2.mo116597Bf();
                                    }
                                }
                            } else if (objArr != null) {
                                if (objArr.length > 0) {
                                    Object obj = objArr[0];
                                    if (obj instanceof C10881t) {
                                        this.f73264A2.mo116594B((C10881t) obj);
                                    }
                                }
                            }
                        } else if (objArr != null) {
                            if (objArr.length > 0) {
                                this.f73264A2.mo116636ce(String.valueOf(objArr[0]), false);
                            }
                        }
                    } else if (objArr != null) {
                        if (objArr.length > 0) {
                            this.f73264A2.mo116636ce(String.valueOf(objArr[0]), true);
                        }
                    }
                } else if (objArr != null) {
                    if (objArr.length > 0) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof C25630b) {
                            AbstractC20789d.m108480n(this.f72262D1, (C25630b) obj2);
                        }
                    }
                }
            } else {
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.de
                    public /* synthetic */ RunnableC15548de() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedDetailsView.this.m79604zO();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        String str;
        int i11;
        C25470c m131954b;
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 == null) {
                m92642L3 = new Bundle();
            }
            if (bundle != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            m92642L3.putBoolean("extra_is_restoring_activity", z11);
            this.f73264A2.mo116676zi();
            this.f73264A2.mo116675zc();
            if (m92642L3.containsKey("extra_last_failed_comment_string")) {
                str = m92642L3.getString("extra_last_failed_comment_string");
            } else {
                str = "";
            }
            this.f73315n2 = str;
            if (this.f72301k1 != null && !TextUtils.isEmpty(str)) {
                this.f72301k1.setText(this.f73315n2);
                this.f72301k1.setSelection(this.f73315n2.length());
            }
            this.f73264A2.mo116603H3(false);
            FeedActionZUtils.m47519G(this.f73296b3, this.f72421L0.m92676n2());
            AbstractC23647d.m123897g("18000");
            if (bundle != null && (i11 = bundle.getInt("extra_presenter_key", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
                this.f73264A2.mo116629b(m131954b);
            }
            this.f73264A2.mo116622W5();
            this.f73271H2 = new C16572d1(this.f72301k1, true, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.ee
                public /* synthetic */ C15585ee() {
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    Object m79552MO;
                    m79552MO = FeedDetailsView.this.m79552MO((ArrayList) obj);
                    return m79552MO;
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: xN */
    protected void mo78366xN(long j11) {
        try {
            ListView listView = this.f72303m1;
            if (listView != null) {
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.xd
                    public /* synthetic */ RunnableC16335xd() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedDetailsView.this.m79566TO();
                    }
                }, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xO */
    public void m79659xO(View view) {
        try {
            this.f73277N2 = (FrameLayout) view.findViewById(AbstractC6918a0.quick_action_container_overlay);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.f73278O2 = relativeLayout;
            relativeLayout.setGravity(80);
            C14257b c14257b = new C14257b();
            this.f73276M2 = c14257b;
            c14257b.f47617e = getContext();
            this.f73276M2.m47503m(new C14258c(view));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: yD */
    public void mo79660yD(C3060y1 c3060y1) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_memory_details_title));
        }
        m79587hO(c3060y1);
        ChangeableHeightView changeableHeightView = this.f73312k2;
        if (changeableHeightView != null) {
            changeableHeightView.setHeight(AbstractC23136l9.m118742r(58.0f));
        }
        mo79625ZB(0, true);
    }

    @Override // p329lo.InterfaceC22546b
    /* renamed from: yi */
    public void mo79661yi(C23911d c23911d) {
        MultiStateView multiStateView = this.f73305g2;
        if (multiStateView != null) {
            multiStateView.setErrorTitleString(c23911d.f115561d);
        }
        int i11 = c23911d.f115559b;
        int i12 = 8;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC23136l9.m118744r1(this.f72280T0, 8);
                AbstractC23136l9.m118744r1(this.f73305g2, 0);
            }
        } else {
            AbstractC23136l9.m118744r1(this.f72280T0, 0);
            AbstractC23136l9.m118744r1(this.f73305g2, 8);
        }
        AbstractC23136l9.m118744r1(this.f73269F2, 8);
        LinearLayout linearLayout = this.f72299i1;
        if (c23911d.f115560c != 1) {
            i12 = 0;
        }
        AbstractC23136l9.m118744r1(linearLayout, i12);
        int i13 = c23911d.f115558a;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        SwipeRefreshListView swipeRefreshListView = this.f72280T0;
                        if (swipeRefreshListView != null) {
                            swipeRefreshListView.setRefreshing(false);
                            this.f72280T0.m88202K();
                        }
                        MultiStateView multiStateView2 = this.f73305g2;
                        if (multiStateView2 != null) {
                            multiStateView2.setState(MultiStateView.EnumC15914e.EMPTY);
                            return;
                        }
                        return;
                    }
                    return;
                }
                SwipeRefreshListView swipeRefreshListView2 = this.f72280T0;
                if (swipeRefreshListView2 != null) {
                    swipeRefreshListView2.setRefreshing(false);
                }
                MultiStateView multiStateView3 = this.f73305g2;
                if (multiStateView3 != null) {
                    multiStateView3.setState(MultiStateView.EnumC15914e.ERROR);
                    this.f73305g2.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                }
                ToastUtils.showMess(c23911d.f115561d);
                return;
            }
            SwipeRefreshListView swipeRefreshListView3 = this.f72280T0;
            if (swipeRefreshListView3 != null) {
                swipeRefreshListView3.setRefreshing(false);
            }
            MultiStateView multiStateView4 = this.f73305g2;
            if (multiStateView4 != null) {
                multiStateView4.setState(MultiStateView.EnumC15914e.ERROR);
                this.f73305g2.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
            ToastUtils.showMess(c23911d.f115561d);
            return;
        }
        SwipeRefreshListView swipeRefreshListView4 = this.f72280T0;
        if (swipeRefreshListView4 != null) {
            swipeRefreshListView4.setRefreshing(true);
        }
        MultiStateView multiStateView5 = this.f73305g2;
        if (multiStateView5 != null) {
            multiStateView5.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 55);
        C23744a.m124114c().m124115b(this, 6007);
        C23744a.m124114c().m124115b(this, 6013);
        C23744a.m124114c().m124115b(this, 6061);
        C23744a.m124114c().m124115b(this, 6097);
    }
}
