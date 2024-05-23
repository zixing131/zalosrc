package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
import ao.InterfaceC2266h;
import ar.AbstractC2298a0;
import ar.C2297a;
import ar.C2310k;
import ar.C2321v;
import ar.C2323x;
import as.InterfaceC2333h;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bn.C2913t1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3042u;
import bo.C3047v0;
import bo.C3051w0;
import bo.C3054x;
import bp0.AbstractC3102n;
import c30.C3246i0;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.uicontrols.AbstractC8895v;
import com.zing.zalo.feed.uicontrols.FeedLikeButtonModulesView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.settings.SettingTimelineV2View;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.FeedStickerSuggestView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.social.controls.FeedLikeStatus;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CommentSupportGifEditText;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
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
import com.zing.zalocore.CoreUtility;
import db0.AbstractC17865a;
import en0.InterfaceC18505l;
import hf0.C20040b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20789d;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import l80.C22126c0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mo.C23375c;
import mo.C23394l0;
import mo.C23396m0;
import mo.C23407x;
import mo.InterfaceC23371a;
import mo.InterfaceC23373b;
import nb0.C23672c;
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
import p175g0.AbstractC19181d;
import p262jb.AbstractC21196a;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p322lf.AbstractC22470k;
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
import p726zr.C32546b;
import sa0.C26203c;
import sa0.C26209i;
import sn.C26333b;
import tn.C26746f;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28209v3;
import vg.C28212v6;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public class ImageCommentView extends BaseDetailView implements InterfaceC23373b, C23744a.c, TextWatcher, View.OnClickListener, InterfaceC0733x, FeedItemPhotoMultiModuleView.InterfaceC8112b, InterfaceC2266h, InterfaceC23923b, View.OnLongClickListener {

    /* renamed from: N2 */
    ActionBarMenuItem f74341N2;

    /* renamed from: O2 */
    ActionBarMenuItem f74342O2;

    /* renamed from: R2 */
    C13306b f74345R2;

    /* renamed from: Y1 */
    LinearLayout f74348Y1;

    /* renamed from: Z1 */
    AbstractC17865a f74349Z1;

    /* renamed from: a2 */
    MultiStateView f74350a2;

    /* renamed from: b2 */
    ImageView f74351b2;

    /* renamed from: c2 */
    private C20275e f74352c2;

    /* renamed from: d2 */
    private int f74353d2;

    /* renamed from: e2 */
    private View f74354e2;

    /* renamed from: f2 */
    int f74355f2;

    /* renamed from: j2 */
    C20040b f74359j2;

    /* renamed from: k2 */
    RedDotImageButton f74360k2;

    /* renamed from: m2 */
    public int f74362m2;

    /* renamed from: p2 */
    boolean f74365p2;

    /* renamed from: q2 */
    int f74366q2;

    /* renamed from: r2 */
    int f74367r2;

    /* renamed from: s2 */
    InterfaceC23371a f74368s2;

    /* renamed from: t2 */
    private EmptyContentView f74369t2;

    /* renamed from: u2 */
    private C16572d1 f74370u2;

    /* renamed from: v2 */
    AbstractC8895v f74371v2;

    /* renamed from: w2 */
    FrameLayout f74372w2;

    /* renamed from: x2 */
    RelativeLayout f74373x2;

    /* renamed from: X1 */
    private final float f74347X1 = 0.7f;

    /* renamed from: g2 */
    boolean f74356g2 = false;

    /* renamed from: h2 */
    String f74357h2 = "";

    /* renamed from: i2 */
    boolean f74358i2 = false;

    /* renamed from: l2 */
    private final int f74361l2 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.avt_S) + (AbstractC23136l9.m118742r(10.0f) * 2);

    /* renamed from: n2 */
    boolean f74363n2 = false;

    /* renamed from: o2 */
    boolean f74364o2 = true;

    /* renamed from: y2 */
    boolean f74374y2 = false;

    /* renamed from: z2 */
    boolean f74375z2 = false;

    /* renamed from: A2 */
    View.OnLayoutChangeListener f74328A2 = new ViewOnLayoutChangeListenerC14475m();

    /* renamed from: B2 */
    View.OnLayoutChangeListener f74329B2 = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.rq
        public /* synthetic */ ViewOnLayoutChangeListenerC16102rq() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            ImageCommentView.this.m80817tO(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: C2 */
    int f74330C2 = 0;

    /* renamed from: D2 */
    boolean f74331D2 = false;

    /* renamed from: E2 */
    AbstractC22055v0.g f74332E2 = new C14463a();

    /* renamed from: F2 */
    boolean f74333F2 = false;

    /* renamed from: G2 */
    private final int f74334G2 = 1;

    /* renamed from: H2 */
    private final int f74335H2 = 2;

    /* renamed from: I2 */
    private final int f74336I2 = 3;

    /* renamed from: J2 */
    private final int f74337J2 = 4;

    /* renamed from: K2 */
    private final int f74338K2 = 5;

    /* renamed from: L2 */
    private final int f74339L2 = 6;

    /* renamed from: M2 */
    private final int f74340M2 = 7;

    /* renamed from: P2 */
    final Runnable f74343P2 = new RunnableC14465c();

    /* renamed from: Q2 */
    boolean f74344Q2 = false;

    /* renamed from: S2 */
    C13306b.c f74346S2 = new C14466d();

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$a */
    /* loaded from: classes6.dex */
    class C14463a implements AbstractC22055v0.g {
        C14463a() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
            C25849b c25849b = ImageCommentView.this.f72304n1;
            if (c25849b != null) {
                c25849b.notifyDataSetChanged();
            }
            ImageCommentView.this.f74368s2.mo122843Zk();
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (ImageCommentView.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$b */
    /* loaded from: classes6.dex */
    class C14464b extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ String f74377p;

        C14464b(String str) {
            this.f74377p = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                if (!TextUtils.isEmpty(this.f74377p)) {
                    new C19171b().m101508a(new C19171b.a(ImageCommentView.this.f72421L0.m92676n2(), new C26365a.b(this.f74377p, C32002l4.m154265h(10007, 3)).m135739F("18600").m135743b(), 0, 1));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(ImageCommentView.this.getContext(), AbstractC21196a.TextColor1));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$c */
    /* loaded from: classes6.dex */
    class RunnableC14465c implements Runnable {
        RunnableC14465c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ImageCommentView.this.f72301k1.getText().length() > 0) {
                    ImageCommentView.this.m78364wN();
                    ImageCommentView imageCommentView = ImageCommentView.this;
                    imageCommentView.f72283U1.postDelayed(imageCommentView.f74343P2, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$d */
    /* loaded from: classes6.dex */
    class C14466d extends C13306b.c {
        C14466d() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            String str = c28212v6.f131577c;
            str.hashCode();
            if (!str.equals("tip.feeddetail.commentphoto") && !str.equals("tip.feeddetail.commentsticker")) {
                return super.mo66900a(c28212v6);
            }
            if (c28212v6.f131575a == 1 || ImageCommentView.this.f74344Q2) {
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
            return AbstractC28025b8.f130861r;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.feeddetail.commentphoto")) {
                if (!str.equals("tip.feeddetail.commentsticker")) {
                    return null;
                }
                return new C26209i(ImageCommentView.this.f72314x1);
            }
            return new C26209i(ImageCommentView.this.f74360k2);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (ImageCommentView.this.f72421L0.m92672lJ() && ImageCommentView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$e */
    /* loaded from: classes6.dex */
    class C14467e extends AbstractC31727b {
        C14467e() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: c */
        public void mo46563c(String str) {
            C25630b m143290W;
            try {
                if (!TextUtils.isEmpty(str) && (m143290W = C28644j.m143233Y().m143290W(str)) != null && !m143290W.m132399G()) {
                    AbstractC20789d.m108472f(301, ImageCommentView.this.f72421L0.m92649TI());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            ImageCommentView.this.m80850cl(str);
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    ImageCommentView imageCommentView = ImageCommentView.this;
                    imageCommentView.f72283U1.postDelayed(imageCommentView.f74343P2, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    ImageCommentView imageCommentView2 = ImageCommentView.this;
                    imageCommentView2.f72283U1.removeCallbacks(imageCommentView2.f74343P2);
                    ImageCommentView.this.m78364wN();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            try {
                AbstractC2379w.m12430d(ImageCommentView.this.f72301k1);
                ImageCommentView imageCommentView = ImageCommentView.this;
                imageCommentView.m78360sN(imageCommentView.f72307q1, false);
                ImageCommentView.this.mo78325Ka(0);
                ImageCommentView.this.f74368s2.mo112334R1(c25630b, i11);
                AbstractC23647d.m123897g("49180008");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: p */
        public void mo46564p(C25630b c25630b, int i11, int i12, int i13) {
            ImageCommentView.this.f74368s2.mo122839W(c25630b, i11, i12, i13);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$f */
    /* loaded from: classes6.dex */
    class C14468f implements FeedActionZUtils.InterfaceC8913k {
        C14468f() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: o2 */
        public void mo47577o2(String str, PrivacyInfo privacyInfo) {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: p2 */
        public void mo47578p2() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: q2 */
        public void mo47579q2(int i11, C3020p0 c3020p0) {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: r2 */
        public void mo47580r2() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: s2 */
        public void mo47581s2(int i11, C3020p0 c3020p0) {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: t2 */
        public void mo47582t2(C3020p0 c3020p0) {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8913k
        /* renamed from: z1 */
        public void mo47583z1(C20096c c20096c) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$g */
    /* loaded from: classes6.dex */
    class C14469g implements AbsListView.OnScrollListener {
        C14469g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            if (absListView.getScrollY() != 0) {
                ImageCommentView.this.removeDialog(4);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                ImageCommentView imageCommentView = ImageCommentView.this;
                C25849b c25849b = imageCommentView.f72304n1;
                if (c25849b != null) {
                    if (i11 == 0) {
                        imageCommentView.f74365p2 = false;
                        c25849b.m133438m(false);
                        ImageCommentView.this.f72304n1.notifyDataSetChanged();
                    } else {
                        imageCommentView.f74365p2 = true;
                        imageCommentView.f72305o1 = false;
                        c25849b.m133438m(true);
                        ImageCommentView.this.f72280T0.m88202K();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$h */
    /* loaded from: classes6.dex */
    class C14470h extends AbstractC17865a {
        C14470h() {
        }

        @Override // db0.AbstractC17865a
        /* renamed from: d */
        protected void mo80863d(int i11, float f11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$i */
    /* loaded from: classes6.dex */
    public class C14471i implements KeyboardFrameLayout.InterfaceC13508a {
        C14471i() {
        }

        /* renamed from: b */
        public /* synthetic */ void m80865b() {
            ImageCommentView imageCommentView = ImageCommentView.this;
            if (imageCommentView.f72275Q1 != 2) {
                imageCommentView.f72315y1.setPaddingBottom(0);
                ImageCommentView.this.f72315y1.requestLayout();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                ImageCommentView imageCommentView = ImageCommentView.this;
                imageCommentView.f72316z1 = false;
                if (imageCommentView.f74356g2) {
                    return;
                }
                imageCommentView.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.zq
                    public /* synthetic */ RunnableC16422zq() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageCommentView.C14471i.this.m80865b();
                    }
                });
                ImageCommentView.this.removeDialog(4);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            if (!ImageCommentView.this.f72301k1.isFocused()) {
                return;
            }
            ImageCommentView.this.m78367zN(i11);
            ImageCommentView imageCommentView = ImageCommentView.this;
            imageCommentView.f72316z1 = true;
            if (!imageCommentView.f74356g2 && imageCommentView.f72275Q1 != 1) {
                imageCommentView.mo78325Ka(1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$j */
    /* loaded from: classes6.dex */
    class C14472j implements C25849b.a {
        C14472j() {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: a */
        public void mo46569a() {
        }

        @Override // p489rn.C25849b.a
        /* renamed from: b */
        public void mo46570b(C10873l c10873l, View view, C20275e c20275e, int i11) {
            ImageCommentView.this.f74352c2 = c20275e;
            ImageCommentView.this.f74353d2 = i11;
            ImageCommentView.this.f74354e2 = view;
            ImageCommentView.this.f74368s2.mo122854e0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: c */
        public void mo46571c(String str) {
            ImageCommentView.this.f74368s2.mo122825H(str);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: d */
        public View mo46572d() {
            return ImageCommentView.this.f74373x2;
        }

        @Override // p489rn.C25849b.a
        /* renamed from: e */
        public void mo46573e(C20096c c20096c) {
            ImageCommentView.this.f74368s2.mo122820C(c20096c);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f */
        public void mo46574f(C10866e c10866e) {
            if (c10866e instanceof C23672c) {
                FeedActionZUtils.m47541b(ImageCommentView.this, new C28209v3(true, ((C23672c) c10866e).f114678g0, 2));
            }
        }

        @Override // p489rn.C25849b.a
        /* renamed from: f1 */
        public void mo46575f1(int i11, int i12, String str, int i13) {
            if (i11 > 0) {
                try {
                    if (!C28644j.m143233Y().m143312x0(i11) && ImageCommentView.this.f72421L0.m92676n2() != null) {
                        AbstractC23152n3.m119066r0(ImageCommentView.this.f72421L0.m92676n2(), i11, "", i12, str, i13);
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
            ImageCommentView.this.f74368s2.mo122866y(c10873l, true);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: i */
        public void mo46578i(String str) {
            ImageCommentView.this.f74368s2.mo122822Ea(str, true, true);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: j */
        public void mo46579j(String str) {
            ImageCommentView.this.f74368s2.mo122822Ea(str, false, false);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k */
        public void mo46580k(C10873l c10873l) {
            int i11;
            if (c10873l != null) {
                ImageCommentView imageCommentView = ImageCommentView.this;
                int i12 = c10873l.f54909Y;
                List list = c10873l.f54910Z;
                if (list != null) {
                    i11 = list.size();
                } else {
                    i11 = 0;
                }
                imageCommentView.f74355f2 = i12 + i11;
            }
            ImageCommentView.this.f74368s2.mo122826H2(2, c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: k0 */
        public void mo46581k0(C10873l c10873l) {
            ImageCommentView.this.f74368s2.mo112343k0(c10873l);
        }

        @Override // p489rn.C25849b.a
        /* renamed from: l */
        public void mo46582l(int i11) {
            ImageCommentView.this.f74368s2.mo122841Y(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$k */
    /* loaded from: classes6.dex */
    class C14473k implements FeedStickerSuggestView.InterfaceC14282c {
        C14473k() {
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: a */
        public void mo46585a(C25630b c25630b, int i11) {
            ImageCommentView.this.mo78316E0(c25630b, i11);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14282c
        /* renamed from: b */
        public void mo46586b(C25630b c25630b, int i11, String str, int i12, String str2) {
            ImageCommentView.this.f74368s2.mo112344l3(c25630b, i11);
            AbstractC23647d.m123897g("49180009");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$l */
    /* loaded from: classes6.dex */
    class C14474l extends FeedStickerSuggestView {
        C14474l(Context context, ZaloView zaloView, ActionEditText actionEditText, FeedStickerSuggestView.InterfaceC14282c interfaceC14282c) {
            super(context, zaloView, actionEditText, interfaceC14282c);
        }

        @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView
        /* renamed from: m */
        public void mo46587m() {
            ImageCommentView imageCommentView = ImageCommentView.this;
            imageCommentView.f74362m2 = imageCommentView.f72275Q1;
            imageCommentView.mo78325Ka(0);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 16);
            this.f73382w.m92662fJ().m93066i2(SettingTimelineV2View.class, bundle, 30, 1, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$m */
    /* loaded from: classes6.dex */
    class ViewOnLayoutChangeListenerC14475m implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC14475m() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            try {
                ImageCommentView imageCommentView = ImageCommentView.this;
                ListView listView = imageCommentView.f72303m1;
                if (listView != null && imageCommentView.f74373x2 != null) {
                    int measuredHeight = listView.getMeasuredHeight();
                    int i19 = 0;
                    for (int i21 = 0; i21 < ImageCommentView.this.f72303m1.getChildCount(); i21++) {
                        View childAt = ImageCommentView.this.f72303m1.getChildAt(i21);
                        if (childAt != null && childAt != ImageCommentView.this.f74373x2) {
                            i19 += childAt.getMeasuredHeight();
                        }
                    }
                    ImageCommentView.this.f74373x2.setMinimumHeight(Math.max(measuredHeight - i19, 0));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$n */
    /* loaded from: classes6.dex */
    public class C14476n extends AbstractC8895v {
        C14476n() {
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v
        /* renamed from: d */
        public boolean mo47496d(C31862c c31862c) {
            return ImageCommentView.this.f74368s2.mo122856f1(c31862c);
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v
        /* renamed from: e */
        public ViewGroup mo47497e(C31862c c31862c) {
            if (c31862c != null && c31862c.f146302D) {
                ImageCommentView imageCommentView = ImageCommentView.this;
                imageCommentView.f74375z2 = true;
                return imageCommentView.f74372w2;
            }
            ImageCommentView imageCommentView2 = ImageCommentView.this;
            imageCommentView2.f74375z2 = false;
            return imageCommentView2.f74373x2;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ImageCommentView$o */
    /* loaded from: classes6.dex */
    public class C14477o implements AbstractC8895v.c {

        /* renamed from: a */
        final /* synthetic */ View f74391a;

        C14477o(View view) {
            this.f74391a = view;
        }

        /* renamed from: b */
        public /* synthetic */ void m80867b(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            ImageCommentView.this.m80835OO(false);
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v.c
        /* renamed from: j0 */
        public void mo47510j0() {
            try {
                ImageCommentView imageCommentView = ImageCommentView.this;
                if (imageCommentView.f74375z2) {
                    imageCommentView.m80835OO(true);
                    this.f74391a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.ar
                        public /* synthetic */ ViewOnLayoutChangeListenerC15447ar() {
                        }

                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                            ImageCommentView.C14477o.this.m80867b(view, i11, i12, i13, i14, i15, i16, i17, i18);
                        }
                    });
                    return;
                }
                ListView listView = imageCommentView.f72303m1;
                if (listView != null) {
                    listView.addOnLayoutChangeListener(imageCommentView.f74328A2);
                }
                ImageCommentView imageCommentView2 = ImageCommentView.this;
                RelativeLayout relativeLayout = imageCommentView2.f74373x2;
                if (relativeLayout != null) {
                    relativeLayout.addOnLayoutChangeListener(imageCommentView2.f74329B2);
                }
                ImageCommentView imageCommentView3 = ImageCommentView.this;
                imageCommentView3.f72304n1.f123346x = true;
                imageCommentView3.f74368s2.mo122857j0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.AbstractC8895v.c
        /* renamed from: k0 */
        public void mo47511k0(String str, String str2) {
            ImageCommentView.this.m80826FO(str, str2);
        }
    }

    /* renamed from: AO */
    public /* synthetic */ void m80768AO() {
        mo78325Ka(1);
    }

    /* renamed from: BO */
    public /* synthetic */ void m80770BO() {
        m80784LO();
        m80846ZN(this.f72280T0, this.f74372w2.getMeasuredHeight());
    }

    /* renamed from: CO */
    public /* synthetic */ void m80772CO() {
        m80846ZN(this.f72280T0, this.f74372w2.getMeasuredHeight());
    }

    /* renamed from: GO */
    public void m80777GO() {
        String str;
        if (this.f72421L0.m92676n2() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(8);
        BottomSheetMenuBundleDataPhotoViewfull mo122824Fd = this.f74368s2.mo122824Fd();
        bottomSheetMenuBundleData.m45508i(mo122824Fd);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        if (mo122824Fd.m45534d() != null) {
            str = mo122824Fd.m45534d().f42599t;
        } else {
            str = "";
        }
        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", str);
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 34, 1, true);
    }

    /* renamed from: KO */
    private void m80782KO(boolean z11) {
        int i11;
        ActionBarMenuItem actionBarMenuItem = this.f74341N2;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(actionBarMenuItem, i11);
    }

    /* renamed from: LO */
    private void m80784LO() {
        if (!AbstractC23136l9.m118666N0(this.f74372w2)) {
            AbstractC23136l9.m118744r1(this.f74372w2, 0);
        }
    }

    /* renamed from: MO */
    private void m80786MO(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        m92639EK(4, new C8848a.a(new C8848a.b(i11, i12, i13), new C8848a.c(list), interfaceC2333h));
    }

    /* renamed from: NO */
    private void m80788NO(ItemAlbumMobile itemAlbumMobile) {
        int i11;
        if (itemAlbumMobile == null) {
            return;
        }
        if (itemAlbumMobile.f42552E.equals("1")) {
            C32546b c32546b = itemAlbumMobile.f42563N;
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

    /* renamed from: PO */
    private void m80791PO(boolean z11, boolean z12) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            FrameLayout frameLayout = this.f74372w2;
            if (frameLayout != null && this.f72299i1 != null && (layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams()) != null) {
                m80843YN(layoutParams, this.f72299i1.getMeasuredHeight());
                if (z11) {
                    if (z12) {
                        m80784LO();
                        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.oq
                            public /* synthetic */ RunnableC15991oq() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageCommentView.this.m80772CO();
                            }
                        }, 100L);
                    } else {
                        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qq
                            public /* synthetic */ RunnableC16065qq() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ImageCommentView.this.m80770BO();
                            }
                        }, 100L);
                    }
                } else {
                    m80846ZN(this.f72280T0, 0);
                    m80806hO();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: QO */
    private void m80793QO(ItemAlbumMobile itemAlbumMobile) {
        List arrayList;
        int i11;
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        C17570d c17570d = new C17570d(m92689tK());
        int parseInt = Integer.parseInt(itemAlbumMobile.f42560K);
        boolean equals = itemAlbumMobile.f42552E.equals("1");
        if (c3051w0 != null && c3051w0.m14637a()) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        String m93559b = AbstractC17569c.Companion.m93559b(c17570d, equals, arrayList, parseInt, 4);
        float measureText = this.f72267I1.measureText(m93559b);
        if (this.f72272N1) {
            i11 = Math.min(new C18062a().m96026a(equals, parseInt, c3051w0, c32546b).size(), 3);
        } else if (c32546b != null) {
            i11 = c32546b.m157606b().size();
        } else {
            i11 = 0;
        }
        C17567a c17567a = new C17567a();
        c17567a.m93550a(this.f72267I1, c17570d, measureText, 0.0f, equals, parseInt);
        C22126c0 c22126c0 = this.f72268J1;
        if (c22126c0 != null) {
            c22126c0.m111959G1(c17567a.m93551c(4, i11, m93559b));
        }
    }

    /* renamed from: RO */
    private void m80795RO(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        boolean z12;
        if (itemAlbumMobile == null) {
            return;
        }
        int i11 = 0;
        if (Integer.parseInt(itemAlbumMobile.f42560K) <= 0 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        m80797SO(itemAlbumMobile);
        m80793QO(itemAlbumMobile);
        ModulesView modulesView = this.f72266H1;
        if (!z12) {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(modulesView, i11);
        m78317EM(z12, this.f72270L1);
    }

    /* renamed from: SO */
    private void m80797SO(ItemAlbumMobile itemAlbumMobile) {
        List m150943l;
        C3051w0 c3051w0 = itemAlbumMobile.f42562M;
        C32546b c32546b = itemAlbumMobile.f42563N;
        int parseInt = Integer.parseInt(itemAlbumMobile.f42560K);
        boolean equals = itemAlbumMobile.f42552E.equals("1");
        if (parseInt > 0 || equals) {
            if (this.f72272N1) {
                C18064c c18064c = this.f72265G1;
                if (c18064c != null) {
                    c18064c.m96030p1(new C18062a().m96026a(equals, parseInt, c3051w0, c32546b));
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

    /* renamed from: TO */
    private void m80799TO() {
        ActionBarMenuItem actionBarMenuItem;
        int i11;
        InterfaceC23371a interfaceC23371a = this.f74368s2;
        if (interfaceC23371a != null && (actionBarMenuItem = this.f74342O2) != null) {
            if (interfaceC23371a.mo122852d4()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            actionBarMenuItem.setVisibility(i11);
        }
    }

    /* renamed from: bO */
    private void m80804bO(ZaloView zaloView) {
        try {
            if (!m92676n2().mo35576n3()) {
                if (m92662fJ().m93029Q(MainTabView.class)) {
                    zaloView.finish();
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

    /* renamed from: fO */
    private String m80805fO() {
        LinearLayout linearLayout = this.f72290Z0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return this.f72291a1.getText().toString();
        }
        return "";
    }

    /* renamed from: hO */
    private void m80806hO() {
        if (AbstractC23136l9.m118666N0(this.f74372w2)) {
            AbstractC23136l9.m118744r1(this.f74372w2, 8);
        }
    }

    /* renamed from: iO */
    private void m80807iO() {
        String str;
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f74358i2 = m92642L3.getBoolean("extra_should_prevent_screenshot", false);
                if (m92642L3.containsKey("extra_last_failed_comment_string")) {
                    str = m92642L3.getString("extra_last_failed_comment_string");
                } else {
                    str = "";
                }
                this.f74357h2 = str;
                if (this.f72301k1 != null && !TextUtils.isEmpty(str)) {
                    this.f72301k1.setText(this.f74357h2);
                    this.f72301k1.setSelection(this.f74357h2.length());
                }
            }
            this.f74368s2.mo122863pp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kO */
    public /* synthetic */ void m80808kO() {
        try {
            this.f72303m1.smoothScrollToPosition(this.f72304n1.getCount());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lO */
    public /* synthetic */ void m80809lO() {
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

    /* renamed from: mO */
    public /* synthetic */ void m80810mO(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
        onKeyUp(4, keyEvent);
    }

    /* renamed from: nO */
    public /* synthetic */ void m80811nO(View view, boolean z11) {
        this.f74344Q2 = true;
        C13306b c13306b = this.f74345R2;
        if (c13306b != null) {
            c13306b.m74699e("tip.any");
        }
    }

    /* renamed from: oO */
    public /* synthetic */ boolean m80812oO(TextView textView, int i11, KeyEvent keyEvent) {
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
        this.f74368s2.mo122849c0(str, m80805fO());
        return true;
    }

    /* renamed from: pO */
    public /* synthetic */ void m80813pO() {
        this.f74368s2.mo122842Z6();
    }

    /* renamed from: qO */
    public /* synthetic */ boolean m80814qO(View view, MotionEvent motionEvent) {
        ListView listView;
        AbstractC17865a abstractC17865a = this.f74349Z1;
        if (abstractC17865a != null && (listView = this.f72303m1) != null && abstractC17865a.m94388b(listView, motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: rO */
    public /* synthetic */ void m80815rO() {
        this.f74368s2.mo122842Z6();
    }

    /* renamed from: sO */
    public /* synthetic */ void m80816sO(C3054x c3054x) {
        this.f74368s2.mo122850d2(c3054x);
    }

    /* renamed from: tO */
    public /* synthetic */ void m80817tO(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        try {
            m80847aO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uO */
    public /* synthetic */ Object m80818uO(ArrayList arrayList) {
        this.f74368s2.mo122855f0(arrayList);
        return Boolean.TRUE;
    }

    /* renamed from: vO */
    public /* synthetic */ void m80819vO(int i11, String str) {
        this.f74368s2.mo122862p6(i11, str);
    }

    /* renamed from: wO */
    public /* synthetic */ void m80820wO(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            interfaceC17463d.dismiss();
            this.f74368s2.mo122847bl();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: xO */
    public /* synthetic */ void m80821xO(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        InterfaceC23371a interfaceC23371a = this.f74368s2;
        if (interfaceC23371a != null) {
            interfaceC23371a.mo122864q2(this.f74333F2);
        }
    }

    /* renamed from: yO */
    public /* synthetic */ void m80822yO(boolean z11) {
        this.f74333F2 = z11;
    }

    /* renamed from: zO */
    public /* synthetic */ void m80823zO(int i11) {
        this.f74368s2.mo122840X0(i11);
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: Ax */
    public void mo79605Ax(String str) {
        AbstractC8895v abstractC8895v = this.f74371v2;
        if (abstractC8895v != null) {
            abstractC8895v.m47498f(str, 16);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f74345R2 = new C13306b(this.f72421L0.m92648SI());
        C23407x c23407x = new C23407x(this, C21785g.m112430F0());
        this.f74368s2 = c23407x;
        c23407x.mo995Nd(C23394l0.m122886a(m92642L3()), null);
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
        View m132023c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    return super.mo39014DJ(i11);
                }
                C3042u mo122858l1 = this.f74368s2.mo122858l1();
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(mo122858l1.f12242f).m43162k(mo122858l1.f12239c).m43165n(mo122858l1.f12240d, new InterfaceC17463d.b()).m43170s(mo122858l1.f12241e, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.jq
                    public /* synthetic */ C15781jq() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        ImageCommentView.this.m80821xO(interfaceC17463d, i12);
                    }
                });
                this.f74333F2 = false;
                ContactProfile contactProfile = mo122858l1.f12257g;
                if (contactProfile != null && mo122858l1.f12258h && !TextUtils.isEmpty(contactProfile.f42455y) && AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_in_post_detail") && (m132023c = C25485r.f122083a.m132023c(this.f72421L0.getContext(), mo122858l1.f12257g, new C25485r.a() { // from class: com.zing.zalo.ui.zviews.kq
                    public /* synthetic */ C15824kq() {
                    }

                    @Override // p458qr.C25485r.a
                    /* renamed from: a */
                    public final void mo87261a(boolean z11) {
                        ImageCommentView.this.m80822yO(z11);
                    }
                })) != null) {
                    aVar.m43177z(m132023c);
                }
                return aVar.m43152a();
            }
            return AbstractC23093i.m118469v(this.f72421L0.m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.iq
                public /* synthetic */ C15745iq() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    ImageCommentView.this.m80820wO(interfaceC17463d, i12);
                }
            }, this.f74368s2.mo122853dm());
        }
        return new C2913t1(this.f72421L0.getContext()).m13865e(new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.hq
            public /* synthetic */ C15708hq() {
            }

            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i12, String str) {
                ImageCommentView.this.m80819vO(i12, str);
            }
        }).m13862b(this.f74368s2.mo122828Io(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
    }

    /* renamed from: DO */
    public void m80824DO(String str) {
        if (!TextUtils.isEmpty(str)) {
            MediaItem mediaItem = new MediaItem(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            this.f74368s2.mo122855f0(arrayList);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 4 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                return new C8848a(m92692wK(), (C8848a.a) obj);
            }
        }
        return null;
    }

    /* renamed from: EO */
    public void m80825EO() {
        this.f74368s2.mo122831Nc();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        ActionBarMenuItem m92742i = actionBarMenu.m92742i(1, C27280g.m139660c(m92689tK(), AbstractC23322a.zds_ic_chat_line_24, AbstractC2807a.btn_icon_tertiary_alpha));
        this.f74342O2 = m92742i;
        AbstractC23136l9.m118744r1(m92742i, 8);
        m80799TO();
        this.f74341N2 = actionBarMenu.m92742i(0, C27280g.m139660c(m92689tK(), AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.btn_icon_tertiary_alpha));
        this.f74368s2.mo122867y3();
    }

    /* renamed from: FO */
    public void m80826FO(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                AbstractC28207v1.m141994i3(str, 4, m92676n2(), this, str2, new C31877d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Fk */
    public void mo80827Fk(C23375c c23375c) {
        int i11 = 8;
        if (c23375c == null) {
            AbstractC23136l9.m118744r1(this.f74341N2, 8);
        } else {
            ActionBarMenuItem actionBarMenuItem = this.f74341N2;
            if (c23375c.f113596g) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(actionBarMenuItem, i11);
            if (this.f72316z1) {
                AbstractC2379w.m12430d(this.f72301k1);
            }
        }
        m80799TO();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f72421L0.m92676n2().getWindow().setBackgroundDrawable(new ColorDrawable(C23212s8.m119607o(this.f72421L0.m92676n2().getContext(), AbstractC16781w.PrimaryBackgroundColor)));
        return super.mo37483GJ(layoutInflater, viewGroup, bundle);
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Gu */
    public void mo80828Gu(C2323x c2323x) {
        C20040b c20040b = this.f74359j2;
        if (c20040b != null) {
            c20040b.m104020u();
            this.f74359j2.m104011V(true);
        }
        AbstractC2298a0.m12150b(c2323x, m92676n2(), 32, null, this.f72276R0, null);
    }

    /* renamed from: HO */
    void m80829HO(ItemAlbumMobile itemAlbumMobile, Context context) {
        C3020p0 c3020p0;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null && context != null && this.f72260B1 != null && this.f72261C1 != null) {
            if (c3020p0.m14479H() && c3020p0.m14472D0()) {
                this.f72261C1.m43747Y(c3020p0, this, 4, 3);
                this.f72261C1.setVisibility(0);
            } else {
                this.f72261C1.setVisibility(8);
            }
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Hp */
    public void mo80830Hp(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f74348Y1.setVisibility(0);
            TextView textView = this.f72271M1;
            if (textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        this.f74348Y1.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            C23528a c23528a = this.f72276R0;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f72276R0 = null;
            }
            C20040b c20040b = this.f74359j2;
            if (c20040b != null) {
                c20040b.m104003N();
            }
            m80849cO();
            C26746f.m137569i();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IO */
    void m80831IO(View view) {
        FrameLayout frameLayout = this.f72259A1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            if (view != null) {
                this.f72259A1.addView(view);
            }
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: J */
    public void mo80832J(C26365a c26365a) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), c26365a, 36, 1));
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: JM */
    public int mo78323JM() {
        return AbstractC7409c0.image_comment_view;
    }

    /* renamed from: JO */
    void m80833JO(C20275e c20275e) {
        c20275e.m105882u((int) this.f72421L0.m92651WI().getDimension(AbstractC19181d.abc_action_bar_default_height_material));
        LinearLayout linearLayout = this.f72299i1;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            c20275e.m105881t(this.f72299i1.getHeight());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 55);
        C23744a.m124114c().m124117e(this, 6013);
        C23744a.m124114c().m124117e(this, 6061);
        C23744a.m124114c().m124117e(this, 6097);
    }

    @Override // ao.InterfaceC2266h
    /* renamed from: Kw */
    public void mo11993Kw(int i11) {
        try {
            View childAt = this.f72303m1.getChildAt(0);
            int i12 = -childAt.getTop();
            if (childAt == this.f72302l1) {
                i12 += this.f74361l2;
            }
            this.f72303m1.smoothScrollBy((i11 + AbstractC23136l9.m118742r(128.0f)) - i12, 1000);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
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

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            mo80857l5();
        } else {
            super.mo59740N7(z11);
        }
        this.f77813M0 = false;
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Nh */
    public void mo80834Nh(String str, ContactProfile contactProfile, String str2) {
        try {
            if (str.equals(CoreUtility.f89233i)) {
                return;
            }
            if (!this.f72421L0.m92676n2().isFinishing() && !this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ()) {
                this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.nq
                    public /* synthetic */ RunnableC15953nq() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageCommentView.this.m80768AO();
                    }
                }, 100L);
            }
            String m114542i = AbstractC21935u.m114542i(str, str2);
            if (contactProfile != null && contactProfile.m40387S0()) {
                this.f72291a1.setText(m114542i);
            } else {
                SpannableString spannableString = new SpannableString(m114542i);
                spannableString.setSpan(new C14464b(str), 0, m114542i.length(), 33);
                this.f72291a1.setText(spannableString);
                this.f72291a1.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.f72290Z0.setVisibility(0);
            this.f72290Z0.startAnimation(AnimationUtils.loadAnimation(this.f72421L0.m92648SI(), AbstractC10919t.slide_in_from_bottom_timeline));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OO */
    void m80835OO(boolean z11) {
        try {
            if (this.f74375z2) {
                int i11 = this.f72275Q1;
                if (i11 != 0) {
                    if (i11 == 1 || i11 == 2) {
                        m80791PO(false, z11);
                    }
                } else {
                    m80791PO(true, z11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m80807iO();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ImageCommentView", e11);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 16908332) {
                            if (i11 != 6) {
                                if (i11 == 7) {
                                    this.f74368s2.mo122830Mj();
                                    return true;
                                }
                                return super.mo37491QJ(i11);
                            }
                            this.f74368s2.mo122836U5();
                            return true;
                        }
                        mo80857l5();
                        return true;
                    }
                    this.f74368s2.mo122868y9();
                    return true;
                }
                this.f74368s2.mo122860ne();
                return true;
            }
            this.f74368s2.mo122838Vo();
            return true;
        }
        mo78325Ka(0);
        this.f72283U1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.mq
            public /* synthetic */ RunnableC15903mq() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ImageCommentView.this.m80777GO();
            }
        }, 200L);
        return true;
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: R */
    public void mo80836R(C2310k c2310k) {
        this.f74352c2.m105865K(this.f74353d2);
        AbstractC2298a0.m12150b(c2310k, m92676n2(), 29, (ImageView) this.f74354e2, this.f72276R0, this.f74352c2);
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: R0 */
    public boolean mo80837R0() {
        ListView listView = this.f72303m1;
        if (listView != null && listView.getLastVisiblePosition() >= this.f72304n1.getCount() - 3) {
            return true;
        }
        return false;
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: R2 */
    public void mo80838R2(C2321v c2321v) {
        AbstractC2298a0.m12152d(c2321v, m92662fJ(), 10);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        mo78325Ka(0);
        C13306b c13306b = this.f74345R2;
        if (c13306b != null) {
            c13306b.m74709u();
        }
        C20040b c20040b = this.f74359j2;
        if (c20040b != null) {
            c20040b.m104005P();
        }
        C26333b.f125013a.m135515e();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: RM */
    void mo78336RM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 instanceof ZaloActivity) {
            this.f72273O1 = (C27353a) new C1802w0((ZaloActivity) m92676n2, new C27353a.e(this, null)).m9378a(C27353a.class);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            C25470c mo122848c = this.f74368s2.mo122848c();
            mo122848c.m131945h("extra_should_prevent_screenshot", this.f74358i2);
            bundle.putInt("extra_presenter_key", C25471d.m131951c().m131953a(mo122848c));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: SM */
    void mo78337SM() {
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: T0 */
    public void mo80839T0() {
        int[] iArr = new int[2];
        this.f72308r1.getLocationOnScreen(iArr);
        m80786MO(iArr[0], iArr[1], this.f72308r1.getHeight(), C31060j.f143193a.m150944q(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.pq
            public /* synthetic */ C16028pq() {
            }

            @Override // as.InterfaceC2333h
            /* renamed from: b */
            public final void mo12288b(int i11) {
                ImageCommentView.this.m80823zO(i11);
            }
        });
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: TB */
    public void mo80840TB() {
        try {
            FeedActionZUtils.m47541b(this, AbstractC23304d.f113308N2);
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
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_title));
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
        m80782KO(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, p302ko.InterfaceC21780b
    /* renamed from: U3 */
    public void mo78338U3(List list) {
        super.mo78338U3(list);
        AbstractC23136l9.m118744r1(this.f72295e1, 8);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        try {
            C23744a.m124114c().m124115b(this, 26);
            C23744a.m124114c().m124115b(this, 25);
            C23744a.m124114c().m124115b(this, 11);
            C13306b c13306b = this.f74345R2;
            if (c13306b != null) {
                c13306b.m74697c(this.f74346S2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: UM */
    protected void mo78339UM() {
        try {
            this.f74368s2.mo122829J1(402);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Ue */
    public void mo80841Ue(C23910c c23910c) {
        C20040b c20040b;
        ItemAlbumMobile itemAlbumMobile = c23910c.f115540c;
        if (itemAlbumMobile == null) {
            return;
        }
        c23910c.f115544g = this.f72421L0.m92648SI();
        c23910c.f115545h = this.f74365p2;
        c23910c.f115546i = this;
        c23910c.f115547j = this;
        c23910c.f115548k = this;
        c23910c.f115549l = this;
        c23910c.f115550m = this.f74368s2.mo122821Dk();
        c23910c.f115551n = this;
        View m78321IM = m78321IM();
        View m131962b = AbstractC25477j.m131962b(c23910c, m78321IM, 4);
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
        if (m131961a != null && this.f72303m1 != null) {
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
        }
        if (m131962b != m78321IM) {
            m80831IO(m131962b);
            if (m131962b instanceof FeedItemSocialAlbum) {
                ((FeedItemSocialAlbum) m131962b).setRoundRect(4);
            }
        }
        m80829HO(itemAlbumMobile, this.f72421L0.m92648SI());
        if (itemAlbumMobile.f42591p == 2 && (m131962b instanceof FeedItemVideo) && ZMediaPlayerSettings.isVideoAutoplay() && (c20040b = this.f74359j2) != null) {
            c20040b.m104013Z((FeedItemVideo) m131962b, 0);
            this.f74359j2.m104000A(true);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView.InterfaceC8112b
    /* renamed from: V3 */
    public int mo43989V3() {
        return this.f74367r2;
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: V7 */
    public void mo80842V7(C23911d c23911d) {
        int i11;
        MultiStateView multiStateView = this.f74350a2;
        if (multiStateView != null) {
            multiStateView.setErrorTitleString(c23911d.f115561d);
        }
        int i12 = c23911d.f115559b;
        if (i12 != 0) {
            if (i12 == 1) {
                AbstractC23136l9.m118744r1(this.f72280T0, 8);
                AbstractC23136l9.m118744r1(this.f74350a2, 0);
            }
        } else {
            AbstractC23136l9.m118744r1(this.f72280T0, 0);
            AbstractC23136l9.m118744r1(this.f74350a2, 8);
        }
        LinearLayout linearLayout = this.f72299i1;
        if (c23911d.f115560c == 1) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        AbstractC23136l9.m118744r1(linearLayout, i11);
        AbstractC23136l9.m118744r1(this.f74369t2, 8);
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
                        MultiStateView multiStateView2 = this.f74350a2;
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
                MultiStateView multiStateView3 = this.f74350a2;
                if (multiStateView3 != null) {
                    multiStateView3.setState(MultiStateView.EnumC15914e.ERROR);
                    this.f74350a2.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                }
                ToastUtils.showMess(c23911d.f115561d);
                return;
            }
            SwipeRefreshListView swipeRefreshListView3 = this.f72280T0;
            if (swipeRefreshListView3 != null) {
                swipeRefreshListView3.setRefreshing(false);
            }
            MultiStateView multiStateView4 = this.f74350a2;
            if (multiStateView4 != null) {
                multiStateView4.setState(MultiStateView.EnumC15914e.ERROR);
                this.f74350a2.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            }
            ToastUtils.showMess(c23911d.f115561d);
            return;
        }
        SwipeRefreshListView swipeRefreshListView4 = this.f72280T0;
        if (swipeRefreshListView4 != null) {
            swipeRefreshListView4.setRefreshing(true);
        }
        MultiStateView multiStateView5 = this.f74350a2;
        if (multiStateView5 != null) {
            multiStateView5.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f72300j1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f72300j1.dismiss();
        }
        try {
            C23744a.m124114c().m124117e(this, 26);
            C23744a.m124114c().m124117e(this, 25);
            C23744a.m124114c().m124117e(this, 11);
            C13306b c13306b = this.f74345R2;
            if (c13306b != null) {
                c13306b.m74701i();
            }
            C20040b c20040b = this.f74359j2;
            if (c20040b != null) {
                c20040b.m104009T();
            }
            if (this.f74358i2 && !this.f74364o2) {
                this.f74364o2 = true;
                if (AbstractC23304d.f113455x1.decrementAndGet() == 0) {
                    this.f72421L0.m92676n2().getWindow().clearFlags(8192);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: VM */
    protected void mo78340VM() {
        this.f72307q1.m72709oO(new C14467e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: WM */
    public void mo78341WM(View view) {
        try {
            super.mo78341WM(view);
            this.f72301k1.addTextChangedListener(this);
            this.f72301k1.setOnClickListener(this);
            this.f72301k1.setmOnImeBack(new ActionEditText.InterfaceC16448a() { // from class: com.zing.zalo.ui.zviews.sq
                public /* synthetic */ C16163sq() {
                }

                @Override // com.zing.zalo.uicontrol.ActionEditText.InterfaceC16448a
                /* renamed from: a */
                public final void mo87301a(ActionEditText actionEditText, String str, KeyEvent keyEvent) {
                    ImageCommentView.this.m80810mO(actionEditText, str, keyEvent);
                }
            });
            this.f72301k1.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.tq
                public /* synthetic */ ViewOnFocusChangeListenerC16200tq() {
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    ImageCommentView.this.m80811nO(view2, z11);
                }
            });
            this.f72301k1.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.uq
                public /* synthetic */ C16237uq() {
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m80812oO;
                    m80812oO = ImageCommentView.this.m80812oO(textView, i11, keyEvent);
                    return m80812oO;
                }
            });
            this.f72314x1.setOnClickListener(this);
            this.f72313w1.setOnClickListener(this);
            this.f72313w1.setEnabled(false);
            this.f72280T0.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.vq
                public /* synthetic */ C16274vq() {
                }

                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    ImageCommentView.this.m80813pO();
                }
            });
            this.f72303m1.setFastScrollEnabled(false);
            this.f72303m1.setVerticalScrollBarEnabled(true);
            this.f72303m1.setScrollingCacheEnabled(false);
            this.f72303m1.setOnScrollListener(new C14469g());
            this.f72308r1.setOnClickListener(this);
            this.f72308r1.setOnLongClickListener(this);
            this.f72311u1.setOnClickListener(this);
            this.f74349Z1 = new C14470h();
            this.f72303m1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.wq
                public /* synthetic */ ViewOnTouchListenerC16311wq() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean m80814qO;
                    m80814qO = ImageCommentView.this.m80814qO(view2, motionEvent);
                    return m80814qO;
                }
            });
            this.f72271M1 = (TextView) view.findViewById(AbstractC6918a0.tvComment);
            this.f72287W1.setOnClickListener(this);
            View findViewById = view.findViewById(AbstractC6918a0.layout_like_description_container_view);
            this.f72263E1 = findViewById;
            findViewById.setOnClickListener(this);
            this.f72266H1 = (ModulesView) view.findViewById(AbstractC6918a0.layout_like_description);
            m78315DM();
            this.f72270L1 = (Divider) view.findViewById(AbstractC6918a0.layout_like_info_divider);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutLikeInfo);
            this.f72269K1 = relativeLayout;
            relativeLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutCommentInfo);
            this.f74348Y1 = linearLayout;
            linearLayout.setVisibility(8);
            this.f72290Z0.setVisibility(8);
            this.f72299i1.setVisibility(8);
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f74350a2 = multiStateView;
            multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.xq
                public /* synthetic */ C16348xq() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    ImageCommentView.this.m80815rO();
                }
            });
            this.f72296f1.setVisibility(8);
            this.f72296f1.setOnClickListener(this);
            ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.imvRemoveLayoutReplyComment);
            this.f74351b2 = imageView;
            imageView.setOnClickListener(this);
            this.f72289Y0.setOnClickListener(this);
            this.f72289Y0.setVisibility(8);
            this.f72315y1.setTopViewGroup(this.f72284V0);
            ArrayList<View> arrayList = new ArrayList<>();
            View findViewById2 = view.findViewById(AbstractC6918a0.sticker_panel_container);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
            this.f72315y1.setBottomViewsGroup(arrayList);
            this.f72315y1.setOnKeyboardListener(new C14471i());
            ImageView imageView2 = (ImageView) view.findViewById(AbstractC6918a0.ic_edit_photo_preview);
            this.f72282U0 = imageView2;
            imageView2.setOnClickListener(this);
            RedDotImageButton redDotImageButton = (RedDotImageButton) view.findViewById(AbstractC6918a0.btnGallery);
            this.f74360k2 = redDotImageButton;
            redDotImageButton.setOnClickListener(this);
            C25849b c25849b = new C25849b(this.f72421L0.m92676n2(), 0, this.f72276R0, new C14472j());
            this.f72304n1 = c25849b;
            this.f72303m1.setAdapter((ListAdapter) c25849b);
            C14474l c14474l = new C14474l(view.getContext(), this, this.f72301k1, new C14473k());
            this.f72306p1 = c14474l;
            c14474l.setProcessStickerCallback(new FeedStickerSuggestView.InterfaceC14281b() { // from class: com.zing.zalo.ui.zviews.yq
                public /* synthetic */ C16385yq() {
                }

                @Override // com.zing.zalo.p077ui.zviews.FeedStickerSuggestView.InterfaceC14281b
                /* renamed from: a */
                public final void mo79746a() {
                    ImageCommentView.this.mo78343d4();
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(2, this.f72290Z0.getId());
            this.f72284V0.addView(this.f72306p1, layoutParams);
            m80855jO(view);
            EmptyContentView emptyContentView = (EmptyContentView) view.findViewById(AbstractC6918a0.error_empty_state);
            this.f74369t2 = emptyContentView;
            emptyContentView.setEmptyContentListener(new EmptyContentView.InterfaceC8078a() { // from class: com.zing.zalo.ui.zviews.fq
                public /* synthetic */ C15634fq() {
                }

                @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
                /* renamed from: s */
                public final void mo43432s(C3054x c3054x) {
                    ImageCommentView.this.m80816sO(c3054x);
                }
            });
            this.f74366q2 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC17484n.Companion.m92931b();
            this.f74367r2 = AbstractC23136l9.m118713h0() - AbstractC23222t7.f112544W;
            this.f74368s2.mo122819B1();
            m78318GM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        C13306b c13306b;
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(18);
            }
            if (this.f74363n2) {
                mo78325Ka(this.f74362m2);
                this.f74363n2 = false;
            }
            if (!z12 && (c13306b = this.f74345R2) != null) {
                c13306b.m74699e("tip.any");
            }
            m78367zN(AbstractC23309i.m122007i5(MainApplication.getAppContext()));
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView.InterfaceC8112b
    /* renamed from: Y1 */
    public int mo43990Y1() {
        return this.f74366q2;
    }

    /* renamed from: YN */
    void m80843YN(RelativeLayout.LayoutParams layoutParams, int i11) {
        if (layoutParams.bottomMargin != i11) {
            layoutParams.bottomMargin = i11;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
        this.f74368s2.mo122834Sh(c20275e, animationTarget);
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Z3 */
    public void mo80844Z3(C2297a c2297a) {
        AbstractC2298a0.m12152d(c2297a, m92662fJ(), 0);
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: Z9 */
    public void mo80845Z9(C2310k c2310k, C20275e c20275e, AnimationTarget animationTarget) {
        AbstractC2379w.m12430d(this.f72301k1);
        c20275e.m105865K(0);
        c20275e.m105868N(this);
        m80833JO(c20275e);
        c2310k.m12228s(this.f74358i2);
        AbstractC2298a0.m12151c(c2310k, m92676n2(), 33, animationTarget, this.f72276R0, c20275e);
    }

    /* renamed from: ZN */
    void m80846ZN(View view, int i11) {
        if (view.getPaddingBottom() != i11) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
        }
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: aF */
    public void mo79627aF(boolean z11) {
        int i11;
        int i12;
        try {
            RelativeLayout relativeLayout = this.f72308r1;
            int i13 = 8;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(relativeLayout, i11);
            View view = this.f72263E1;
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(view, i12);
            RedDotImageButton redDotImageButton = this.f74360k2;
            if (z11) {
                i13 = 0;
            }
            AbstractC23136l9.m118744r1(redDotImageButton, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aO */
    void m80847aO() {
        AbstractC8895v abstractC8895v;
        RelativeLayout relativeLayout;
        int i11;
        if (!this.f74374y2 && (abstractC8895v = this.f74371v2) != null && abstractC8895v.m47501i() && !this.f74375z2 && (relativeLayout = this.f74373x2) != null) {
            if (relativeLayout.getMeasuredHeight() > 0) {
                this.f74374y2 = true;
                this.f74373x2.removeOnLayoutChangeListener(this.f74329B2);
            }
            ListView listView = this.f72303m1;
            if (listView != null && (i11 = this.f74330C2) < 10) {
                this.f74330C2 = i11 + 1;
                listView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.lq
                    public /* synthetic */ RunnableC15861lq() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageCommentView.this.m80808kO();
                    }
                }, 100L);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            String trim = this.f72301k1.getText().toString().trim();
            if (trim.length() > this.f74368s2.mo112333R()) {
                this.f72301k1.setText(trim.substring(0, this.f74368s2.mo112333R()));
                this.f72301k1.setSelection(this.f74368s2.mo112333R());
            }
            C28652r.m143349v().m143361W(editable);
            m78354nN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: c0 */
    public boolean mo80848c0(String str) {
        return AbstractC22055v0.m115146f(str, m92676n2(), this, 31, 352, null, this.f74332E2);
    }

    /* renamed from: cO */
    void m80849cO() {
        try {
            this.f72303m1 = null;
            this.f72307q1 = null;
            AbstractC20789d.m108483q(this.f72262D1, this.f72421L0.m92676n2());
            this.f72262D1 = null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cl */
    public void m80850cl(String str) {
        try {
            CommentSupportGifEditText commentSupportGifEditText = this.f72301k1;
            if (commentSupportGifEditText != null && (300 - commentSupportGifEditText.length()) - str.length() >= 0) {
                int selectionEnd = this.f72301k1.getSelectionEnd();
                StringBuffer stringBuffer = new StringBuffer(this.f72301k1.getText().toString());
                stringBuffer.insert(selectionEnd, str);
                this.f72301k1.setText(stringBuffer.toString());
                this.f72301k1.setSelection(selectionEnd + str.length());
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        InterfaceC23371a interfaceC23371a = this.f74368s2;
        if (interfaceC23371a != null) {
            return interfaceC23371a.mo112337d1();
        }
        return C26361j.f125215a.m135697c(this);
    }

    /* renamed from: dO */
    public String m80851dO() {
        InterfaceC23371a interfaceC23371a = this.f74368s2;
        if (interfaceC23371a != null) {
            return interfaceC23371a.mo112324I();
        }
        return "";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: eO */
    public InterfaceC23371a mo78324KM() {
        return this.f74368s2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        this.f74368s2.mo112331O3();
        this.f74368s2.mo112323D2();
        C23396m0 mo122823En = this.f74368s2.mo122823En();
        if (mo122823En != null && mo122823En.f113656c) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("photoId", mo122823En.f113655b);
            bundle.putBoolean("deleted", true);
            intent.putExtras(bundle);
            mo50035CK(-1, intent);
        }
        super.finish();
    }

    @Override // p302ko.InterfaceC21780b
    /* renamed from: g1 */
    public void mo79636g1(MediaItem mediaItem) {
        if (mediaItem != null) {
            try {
                if (AbstractC23041d2.m118194A(mediaItem.mo41081Q())) {
                    AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 27, 2, AbstractC28568a.m142995a(mediaItem));
                    this.f74356g2 = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
    }

    /* renamed from: gO */
    void m80853gO(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        ItemAlbumMobile itemAlbumMobile;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45566b() != null && bottomSheetMenuResult.m45569e() == 8 && bottomSheetMenuResult.m45571g() != 0) {
                    BottomSheetMenuBundleDataPhotoViewfull m45566b = bottomSheetMenuResult.m45566b();
                    if (m45566b != null) {
                        itemAlbumMobile = m45566b.m45534d();
                    } else {
                        itemAlbumMobile = null;
                    }
                    if (itemAlbumMobile == null) {
                        return;
                    }
                    int m45571g = bottomSheetMenuResult.m45571g();
                    if (m45571g != 22) {
                        if (m45571g != 31) {
                            if (m45571g != 33) {
                                if (m45571g == 41) {
                                    this.f74368s2.mo122846b4();
                                    return;
                                }
                                return;
                            }
                            this.f74368s2.mo122830Mj();
                            return;
                        }
                        this.f74368s2.mo122836U5();
                        return;
                    }
                    this.f74368s2.mo122868y9();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ImageCommentView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: h0 */
    public boolean mo45894h0() {
        return !this.f72421L0.mo60294yp();
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: hg */
    public void mo80854hg(String str) {
        try {
            this.f74350a2.setVisibility(0);
            this.f74350a2.setState(MultiStateView.EnumC15914e.ERROR);
            this.f74350a2.setErrorType(MultiStateView.EnumC15915f.DELETED_ERROR);
            this.f74350a2.setErrorImageResource(AbstractC16803z.ic_unavailable_post);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f74350a2.getErrorView().getLayoutParams();
            marginLayoutParams.topMargin = AbstractC23136l9.m118742r(40.0f);
            this.f74350a2.getErrorView().setLayoutParams(marginLayoutParams);
            this.f74350a2.setErrorTitleString(str);
            this.f74350a2.setErrorTitleColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            this.f74350a2.setErrorTitleSize(AbstractC23136l9.m118742r(14.0f));
            AbstractC23136l9.m118744r1(this.f74369t2, 8);
            this.f72299i1.setVisibility(8);
            this.f72280T0.setVisibility(8);
            mo78325Ka(0);
            mo78331OB();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, ao.InterfaceC2259a
    /* renamed from: ig */
    public void mo11957ig(C3000l0 c3000l0, int i11, C17391z c17391z, int i12, View view, View view2) {
    }

    /* renamed from: jO */
    public void m80855jO(View view) {
        try {
            this.f74372w2 = (FrameLayout) view.findViewById(AbstractC6918a0.quick_action_container_overlay);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.f74373x2 = relativeLayout;
            relativeLayout.setGravity(80);
            C14476n c14476n = new C14476n();
            this.f74371v2 = c14476n;
            c14476n.f47617e = getContext();
            this.f74371v2.m47503m(new C14477o(view));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView
    /* renamed from: kM */
    protected FeedActionZUtils.InterfaceC8913k mo79522kM() {
        return new C14468f();
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: kn */
    public void mo80856kn() {
        mo78936E(C19140e.m100450e(m92689tK()));
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: l5 */
    public void mo80857l5() {
        try {
            AbstractC2379w.m12430d(this.f72301k1);
            C23396m0 mo122861oj = this.f74368s2.mo122861oj();
            Intent intent = new Intent();
            if (mo122861oj != null) {
                intent.putExtra("EXTRA_RESULT_ITEM_ALBUM_MOBILE", mo122861oj.f113654a);
                FeedLikeStatus feedLikeStatus = mo122861oj.f113657d;
                if (feedLikeStatus != null) {
                    intent.putExtra("extra_feed_like_status", feedLikeStatus);
                }
            }
            this.f72421L0.mo50035CK(-1, intent);
            C13306b c13306b = this.f74345R2;
            if (c13306b != null) {
                c13306b.m74694J();
            }
            m80804bO(this);
        } catch (Exception e11) {
            e11.printStackTrace();
            if (!this.f72421L0.m92676n2().isFinishing()) {
                m80804bO(this);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, p302ko.InterfaceC21780b
    /* renamed from: lj */
    public void mo78351lj(List list, int i11, boolean z11) {
        SwipeRefreshListView swipeRefreshListView;
        try {
            if (this.f72303m1 != null && (swipeRefreshListView = this.f72280T0) != null) {
                swipeRefreshListView.setRefreshing(false);
                this.f72303m1.setTranscriptMode(0);
            }
            super.mo78351lj(list, i11, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: lu */
    public void mo80858lu(ContactProfile contactProfile) {
        int i11;
        if (contactProfile != null) {
            try {
                C25849b c25849b = this.f72304n1;
                if (contactProfile.m40387S0()) {
                    i11 = 20;
                } else {
                    i11 = 10;
                }
                c25849b.m133437l(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView
    /* renamed from: mN */
    protected void mo78352mN(String str, String str2) {
        if (this.f72421L0.m92676n2() != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 10);
            bundle.putString("extra_song_id", str2);
            bundle.putString("extra_feed_id", str);
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
            this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 35, 1, true);
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: o1 */
    public void mo80859o1(int i11) {
        try {
            C0697c0.Companion.m1054h(getTrackingKey(), "feed_type", Integer.valueOf(i11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            mo78325Ka(0);
            if (i11 != 10) {
                if (i11 != 15) {
                    if (i11 != 27) {
                        switch (i11) {
                            case 29:
                                if (i12 == -1 && intent != null) {
                                    this.f74368s2.mo122859n0(intent.getStringArrayListExtra("EXTRA_DELETED_COMMENTS"));
                                    break;
                                }
                                break;
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                this.f74363n2 = true;
                                break;
                            case 31:
                                this.f74368s2.mo122869yc();
                                break;
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                if (i12 == -1) {
                                    this.f74368s2.mo122845b2(C23915h.m125042a(intent));
                                    break;
                                }
                                break;
                            case 33:
                                if (i12 == -1) {
                                    this.f74368s2.mo122851d3(C23913f.m125040a(intent));
                                    break;
                                }
                                break;
                            case 34:
                                m80853gO(intent);
                                break;
                            case 35:
                                m78326LM(i12, intent);
                                break;
                            case 36:
                                mo78356q0();
                                break;
                        }
                    } else if (i12 == -1 && intent != null) {
                        this.f74368s2.mo112325K2(C23912e.m125039a(intent), this.f72293c1.getPreviewData());
                    }
                } else if (i12 == -1 && intent != null) {
                    this.f74368s2.mo122855f0(GalleryPickerView.m71440ZM(intent));
                }
            } else if (i12 == -1 && intent != null) {
                this.f74368s2.mo122835U1(C23914g.m125041a(intent));
            }
            StickerPanelView stickerPanelView = this.f72307q1;
            if (stickerPanelView != null) {
                stickerPanelView.onActivityResult(i11, i12, intent);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.cmtinput_text) {
                if (!this.f72316z1) {
                    mo78325Ka(1);
                }
                AbstractC23647d.m123897g("188014");
                mo78350lb(300L);
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
                C13306b c13306b = this.f74345R2;
                if (c13306b != null) {
                    c13306b.m74689E("tip.feeddetail.commentsticker");
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.cmtinput_send) {
                CommentSupportGifEditText commentSupportGifEditText2 = this.f72301k1;
                if (commentSupportGifEditText2 != null && commentSupportGifEditText2.getText() != null) {
                    str2 = this.f72301k1.getText().toString().trim();
                } else {
                    str2 = "";
                }
                this.f74368s2.mo122849c0(str2, m80805fO());
                return;
            }
            if (id2 != AbstractC6918a0.ibtn_like && id2 != AbstractC6918a0.btn_like) {
                if (id2 == AbstractC6918a0.btnLoadMore) {
                    if (this.f72280T0.m35364k()) {
                        return;
                    }
                    AbstractC23136l9.m118744r1(this.f72296f1, 8);
                    AbstractC23136l9.m118744r1(this.f72297g1, 0);
                    this.f74368s2.mo112346y2(true);
                    return;
                }
                if (id2 == AbstractC6918a0.imvRemoveLayoutReplyComment) {
                    AbstractC23136l9.m118744r1(this.f72290Z0, 8);
                    return;
                }
                if (id2 == AbstractC6918a0.btnGallery) {
                    CommentSupportGifEditText commentSupportGifEditText3 = this.f72301k1;
                    if (commentSupportGifEditText3 != null) {
                        commentSupportGifEditText3.clearFocus();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
                    AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), 15, 17, true, bundle);
                    C13306b c13306b2 = this.f74345R2;
                    if (c13306b2 != null) {
                        c13306b2.m74689E("tip.feeddetail.commentphoto");
                    }
                    AbstractC23647d.m123897g("188010");
                    return;
                }
                if (id2 == AbstractC6918a0.layout_like_description_container_view) {
                    this.f74368s2.mo122826H2(1, null);
                    return;
                }
                if (id2 != AbstractC6918a0.imvEmptyIcon && id2 != AbstractC6918a0.tvSuggestSeeMore) {
                    if (id2 == AbstractC6918a0.tvUserName) {
                        this.f74368s2.mo122837Ue();
                        return;
                    } else {
                        if (id2 == AbstractC6918a0.btn_comment) {
                            if (!this.f72316z1) {
                                mo78325Ka(1);
                            }
                            mo78350lb(300L);
                            return;
                        }
                        super.onClick(view);
                        return;
                    }
                }
                if (this.f72275Q1 != 2) {
                    mo78325Ka(2);
                    if (view.getId() == AbstractC6918a0.tvSuggestSeeMore) {
                        str = "18805";
                    } else {
                        str = "18804";
                    }
                    AbstractC23647d.m123897g(str);
                    return;
                }
                return;
            }
            C19136a.f95164a.m100437b(view);
            this.f74368s2.mo122833Rf();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.FeedCallbackZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ImageCommentView", e11);
        }
        if (C25979a.m133814e(this.f72421L0, i11, keyEvent) || this.f72421L0.m78934CL(i11, keyEvent)) {
            return true;
        }
        C20040b c20040b = this.f74359j2;
        if (c20040b != null && c20040b.m104004O(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
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
                return true;
            }
            mo80857l5();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.btn_like) {
                m80825EO();
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
        super.onResume();
        FeedStickerSuggestView feedStickerSuggestView = this.f72306p1;
        if (feedStickerSuggestView != null) {
            feedStickerSuggestView.m79733e();
        }
        C13306b c13306b = this.f74345R2;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        AbstractC20789d.m108469c(this.f72303m1, this.f72304n1);
        C20040b c20040b = this.f74359j2;
        if (c20040b != null) {
            c20040b.m104006Q();
        }
        SwipeRefreshListView swipeRefreshListView = this.f72280T0;
        if (swipeRefreshListView != null && swipeRefreshListView.m35364k()) {
            this.f72280T0.setRefreshing(false);
        }
        if (this.f74358i2 && this.f74364o2) {
            this.f74364o2 = false;
            AbstractC23304d.f113455x1.getAndIncrement();
            this.f72421L0.m92676n2().getWindow().addFlags(8192);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        m78313AN();
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: s8 */
    public void mo80860s8(int i11, ItemAlbumMobile itemAlbumMobile, C10873l c10873l) {
        String str;
        String str2;
        String str3;
        C17487o0 mo35579p;
        String str4;
        String str5;
        C3020p0 c3020p0;
        C3047v0 c3047v0;
        try {
            Bundle bundle = new Bundle();
            String str6 = "";
            if (i11 == 1) {
                if (itemAlbumMobile == null) {
                    str4 = "";
                } else {
                    str4 = itemAlbumMobile.f42595r;
                }
                bundle.putString("EXTRA_PHOTO_ID", str4);
                bundle.putInt("EXTRA_MODE", 1);
                bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 352);
                if (itemAlbumMobile == null || (c3020p0 = itemAlbumMobile.f42594q0) == null || (c3047v0 = c3020p0.f12022B) == null) {
                    str5 = "";
                } else {
                    str5 = c3047v0.f12280b;
                }
                bundle.putString("EXTRA_FEED_OWNER_ID", str5);
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
                bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 352);
            }
            if (this.f74368s2.mo112339g() != null) {
                str6 = this.f74368s2.mo112339g().m154277l();
            }
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", str6);
            if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
                mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 0, 0, true);
            }
            mo78325Ka(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: se */
    public void mo80861se(ItemAlbumMobile itemAlbumMobile, boolean z11) {
        boolean z12;
        if (itemAlbumMobile == null) {
            return;
        }
        boolean equals = itemAlbumMobile.f42552E.equals("1");
        m80788NO(itemAlbumMobile);
        int i11 = 8;
        if (z11) {
            if (Integer.parseInt(itemAlbumMobile.f42560K) > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            m80795RO(itemAlbumMobile, equals);
            AbstractC23136l9.m118744r1(this.f72269K1, 0);
            View view = this.f72263E1;
            if (z12) {
                i11 = 0;
            }
            AbstractC23136l9.m118744r1(view, i11);
            return;
        }
        CharSequence charSequence = itemAlbumMobile.f42565P;
        if (charSequence != null && charSequence.length() > 0) {
            AbstractC23136l9.m118744r1(this.f72269K1, 0);
            Iterator it = itemAlbumMobile.m40532t().iterator();
            while (it.hasNext()) {
                ((C10866e) it.next()).m56365I(this.f72421L0.m92676n2());
            }
            return;
        }
        AbstractC23136l9.m118744r1(this.f72269K1, 8);
    }

    @Override // mo.InterfaceC23373b
    /* renamed from: w0 */
    public void mo80862w0(C3054x c3054x) {
        EmptyContentView emptyContentView = this.f74369t2;
        if (emptyContentView != null) {
            AbstractC23136l9.m118744r1(emptyContentView, 0);
            this.f74369t2.m43610e(c3054x);
            AbstractC23136l9.m118744r1(this.f72299i1, 8);
            AbstractC23136l9.m118744r1(this.f72280T0, 8);
            AbstractC23136l9.m118744r1(this.f74350a2, 8);
            AbstractC23136l9.m118744r1(this.f74342O2, 8);
            AbstractC23136l9.m118744r1(this.f74341N2, 8);
        }
        mo78325Ka(0);
        mo78331OB();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 11) {
                if (i11 != 12) {
                    if (i11 != 25) {
                        if (i11 != 26) {
                            if (i11 != 55) {
                                if (i11 != 6013) {
                                    if (i11 != 6061) {
                                        if (i11 == 6097) {
                                            this.f74368s2.mo122832R0();
                                        }
                                    } else {
                                        C27353a c27353a = this.f72273O1;
                                        if (c27353a != null) {
                                            c27353a.m140006y0();
                                        }
                                    }
                                } else {
                                    this.f74368s2.mo122865w();
                                }
                            } else if (objArr != null) {
                                if (objArr.length > 0) {
                                    Object obj = objArr[0];
                                    if (obj instanceof C10881t) {
                                        this.f74368s2.mo122818B((C10881t) obj);
                                    }
                                }
                            }
                        } else if (objArr != null) {
                            if (objArr.length > 0) {
                                this.f74368s2.mo122827H7(String.valueOf(objArr[0]), false);
                            }
                        }
                    } else if (objArr != null) {
                        if (objArr.length > 0) {
                            this.f74368s2.mo122827H7(String.valueOf(objArr[0]), true);
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
                this.f72283U1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.eq
                    public /* synthetic */ RunnableC15597eq() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageCommentView.this.m80809lO();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseDetailView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C25470c m131954b;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                int i11 = bundle.getInt("extra_presenter_key", -1);
                if (i11 != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
                    this.f74368s2.mo122844b(m131954b);
                    this.f74358i2 = m131954b.m131939b("extra_should_prevent_screenshot", this.f74358i2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (ZMediaPlayerSettings.isVideoAutoplay()) {
            this.f74359j2 = new C20040b(1);
        }
        m80807iO();
        this.f74370u2 = new C16572d1(this.f72301k1, true, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.gq
            public /* synthetic */ C15671gq() {
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                Object m80818uO;
                m80818uO = ImageCommentView.this.m80818uO((ArrayList) obj);
                return m80818uO;
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 55);
        C23744a.m124114c().m124115b(this, 6013);
        C23744a.m124114c().m124115b(this, 6061);
        C23744a.m124114c().m124115b(this, 6097);
    }
}
