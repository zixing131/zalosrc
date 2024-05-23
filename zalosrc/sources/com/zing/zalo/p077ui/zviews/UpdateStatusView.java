package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.C0708i;
import ac.C0732w;
import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0820h;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import au.C2370r0;
import bi0.AbstractC2808b;
import bn.C2850a;
import bo.C2953b3;
import bo.C2971f1;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3023p3;
import bo.C3063z0;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.showingphotolib.view.ViewAnimationTarget;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.ComposeSongItemView;
import com.zing.zalo.feed.components.FeedBackgroundView;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.album.AlbumListBottomSheet;
import com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import com.zing.zalo.feed.mvp.postfeed.component.BoxLyric;
import com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView;
import com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposLyricStatus;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposeSongStatus;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.DecorItem;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.feed.uicontrols.C8884o;
import com.zing.zalo.feed.uicontrols.FeedGridModulesView;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.picker.location.ShareLocationWithMapView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.CustomSwitch;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.social.controls.AbstractC10875n;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.stickers.FeedStickerView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.C17460a;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import gq.C19581d;
import gq.C19587j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import i40.C20275e;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.C20820s0;
import is.C20834z0;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kn.AbstractC21777d;
import l30.C22013a0;
import m90.EnumC22962a;
import m90.EnumC22963b;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.AbstractC23254w8;
import me0.C23212s8;
import me0.C23278z2;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mm0.AbstractC23350e;
import mp.C23418f;
import nh0.C23793c;
import np.InterfaceC23923b;
import org.json.JSONArray;
import org.json.JSONObject;
import p006a0.C0012a;
import p107dq.C18045a;
import p107dq.C18047c;
import p107dq.C18049e;
import p107dq.C18051g;
import p107dq.C18054j;
import p133ek.C18460c;
import p139eq.C18565a;
import p173fz.C19172a;
import p205hc.C19964c;
import p216hq.C20112a;
import p304ks.AbstractC21935u;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p368nq.C23926a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p456qp.C25464p;
import p458qr.C25482o;
import p471r3.C25630b;
import p490rp.AbstractC25951b;
import p490rp.AbstractC25952c;
import p500s1.C26087b;
import p559uv.C27373c;
import p588vw.C28652r;
import p651xn.C30169a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31948ha;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32065p8;
import pm0.C24848g0;
import qi0.C25297f;
import qi0.EnumC25294c;
import sa0.C26203c;
import sa0.C26209i;
import sa0.EnumC26202b;
import tn.C26761p;
import tn.C26767v;
import ui0.C27280g;
import v20.C27473a;
import v20.C27477e;
import v20.C27486n;
import vg.AbstractC28025b8;
import vg.AbstractC28127m2;
import vg.AbstractC28207v1;
import vg.AbstractCallableC28112k5;
import vg.C28154p2;
import vg.C28203u6;
import vg.C28212v6;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class UpdateStatusView extends SlidableZaloView implements ZaloView.InterfaceC17417b, TextWatcher, CustomRelativeLayout.InterfaceC13484a, C23744a.c, View.OnClickListener, InterfaceC0733x, InterfaceC1799v, InterfaceC23923b {

    /* renamed from: D4 */
    public static final int f78642D4 = AbstractC23309i.m121778c4();

    /* renamed from: E4 */
    public static final int f78643E4;

    /* renamed from: A1 */
    ControlComposeButtonView f78644A1;

    /* renamed from: A3 */
    private long f78646A3;

    /* renamed from: A4 */
    C13306b.c f78647A4;

    /* renamed from: B1 */
    ImageView f78648B1;

    /* renamed from: B4 */
    private final SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b f78651B4;

    /* renamed from: C1 */
    boolean f78652C1;

    /* renamed from: C3 */
    private C16572d1 f78654C3;

    /* renamed from: C4 */
    private final View.OnClickListener f78655C4;

    /* renamed from: E1 */
    RedDotImageButton f78659E1;

    /* renamed from: F1 */
    C27373c f78662F1;

    /* renamed from: G1 */
    String f78665G1;

    /* renamed from: H1 */
    View f78668H1;

    /* renamed from: H2 */
    AspectRatioImageView f78669H2;

    /* renamed from: H3 */
    C31890dc f78670H3;

    /* renamed from: I1 */
    AspectRatioImageView f78671I1;

    /* renamed from: I2 */
    RecyclingImageView f78672I2;

    /* renamed from: I3 */
    C31890dc f78673I3;

    /* renamed from: J1 */
    ImageView f78674J1;

    /* renamed from: J2 */
    RobotoTextView f78675J2;

    /* renamed from: J3 */
    boolean f78676J3;

    /* renamed from: K1 */
    RobotoTextView f78677K1;

    /* renamed from: K2 */
    FeedRecyclerView f78678K2;

    /* renamed from: K3 */
    boolean f78679K3;

    /* renamed from: L1 */
    RedDotImageButton f78680L1;

    /* renamed from: L2 */
    LinearLayoutManager f78681L2;

    /* renamed from: L3 */
    private int f78682L3;

    /* renamed from: M2 */
    C27477e f78684M2;

    /* renamed from: M3 */
    boolean f78685M3;

    /* renamed from: N1 */
    View f78686N1;

    /* renamed from: N2 */
    RobotoTextView f78687N2;

    /* renamed from: N3 */
    boolean f78688N3;

    /* renamed from: O1 */
    View f78689O1;

    /* renamed from: O2 */
    LinearLayout f78690O2;

    /* renamed from: O3 */
    EnumC15263k0 f78691O3;

    /* renamed from: P1 */
    FeedStickerView f78693P1;

    /* renamed from: P2 */
    boolean f78694P2;

    /* renamed from: P3 */
    AtomicInteger f78695P3;

    /* renamed from: Q1 */
    RedDotImageButton f78697Q1;

    /* renamed from: Q3 */
    final int f78699Q3;

    /* renamed from: R0 */
    MenuListPopupView f78700R0;

    /* renamed from: R3 */
    View f78703R3;

    /* renamed from: S0 */
    AbstractCallableC28112k5 f78704S0;

    /* renamed from: S1 */
    String f78705S1;

    /* renamed from: S3 */
    Button f78707S3;

    /* renamed from: T0 */
    View f78708T0;

    /* renamed from: T1 */
    boolean f78709T1;

    /* renamed from: T3 */
    CustomSwitch f78711T3;

    /* renamed from: U1 */
    RelativeLayout f78713U1;

    /* renamed from: U2 */
    Animation f78714U2;

    /* renamed from: U3 */
    View f78715U3;

    /* renamed from: V0 */
    QuickPickerView f78716V0;

    /* renamed from: V1 */
    ProgressBar f78717V1;

    /* renamed from: V3 */
    RobotoTextView f78719V3;

    /* renamed from: W0 */
    C23528a f78720W0;

    /* renamed from: W1 */
    RecyclingImageView f78721W1;

    /* renamed from: W3 */
    RobotoTextView f78723W3;

    /* renamed from: X0 */
    ChangeableHeightRelativeLayout f78724X0;

    /* renamed from: X1 */
    RobotoTextView f78725X1;

    /* renamed from: X3 */
    boolean f78727X3;

    /* renamed from: Y0 */
    ScrollView f78728Y0;

    /* renamed from: Y1 */
    RobotoTextView f78729Y1;

    /* renamed from: Y3 */
    boolean f78731Y3;

    /* renamed from: Z0 */
    ControlComposeButtonView f78732Z0;

    /* renamed from: Z1 */
    View f78733Z1;

    /* renamed from: Z3 */
    boolean f78735Z3;

    /* renamed from: a2 */
    C24003n f78737a2;

    /* renamed from: a4 */
    LocationPickerView.InterfaceC12771b f78739a4;

    /* renamed from: b4 */
    C3977j f78743b4;

    /* renamed from: c2 */
    C3063z0 f78745c2;

    /* renamed from: c4 */
    C20275e f78747c4;

    /* renamed from: d1 */
    ContactProfile f78748d1;

    /* renamed from: d2 */
    RelativeLayout f78749d2;

    /* renamed from: d4 */
    SparseIntArray f78751d4;

    /* renamed from: e2 */
    AspectRatioImageView f78753e2;

    /* renamed from: e4 */
    SparseIntArray f78755e4;

    /* renamed from: f1 */
    StatusComposeEditText f78756f1;

    /* renamed from: f2 */
    ImageView f78757f2;

    /* renamed from: f4 */
    Editable f78759f4;

    /* renamed from: g1 */
    FeedBackgroundView f78760g1;

    /* renamed from: g2 */
    RedDotImageButton f78761g2;

    /* renamed from: g4 */
    Runnable f78763g4;

    /* renamed from: h1 */
    String f78764h1;

    /* renamed from: h2 */
    RedDotImageButton f78765h2;

    /* renamed from: h3 */
    protected C20112a f78766h3;

    /* renamed from: h4 */
    EnumC15265l0 f78767h4;

    /* renamed from: i1 */
    View f78768i1;

    /* renamed from: i2 */
    LinearLayout f78769i2;

    /* renamed from: i3 */
    SelectMultiPhotoLayoutBottomSheet f78770i3;

    /* renamed from: i4 */
    boolean f78771i4;

    /* renamed from: j1 */
    View f78772j1;

    /* renamed from: j2 */
    RedDotImageButton f78773j2;

    /* renamed from: j3 */
    int f78774j3;

    /* renamed from: j4 */
    boolean f78775j4;

    /* renamed from: k2 */
    RedDotImageButton f78777k2;

    /* renamed from: k3 */
    C18049e f78778k3;

    /* renamed from: k4 */
    boolean f78779k4;

    /* renamed from: l1 */
    CheckBox f78780l1;

    /* renamed from: l2 */
    RedDotImageButton f78781l2;

    /* renamed from: l3 */
    ModulesView f78782l3;

    /* renamed from: l4 */
    ProfilePreviewAlbumItem f78783l4;

    /* renamed from: m1 */
    RobotoTextView f78784m1;

    /* renamed from: m2 */
    LinearLayout f78785m2;

    /* renamed from: m3 */
    ModulesView f78786m3;

    /* renamed from: m4 */
    C8009j f78787m4;

    /* renamed from: n1 */
    RedDotImageButton f78788n1;

    /* renamed from: n2 */
    LinearLayout f78789n2;

    /* renamed from: n3 */
    FrameLayout f78790n3;

    /* renamed from: n4 */
    C0820h.a f78791n4;

    /* renamed from: o1 */
    File f78792o1;

    /* renamed from: o2 */
    RelativeLayout f78793o2;

    /* renamed from: o3 */
    int f78794o3;

    /* renamed from: o4 */
    int f78795o4;

    /* renamed from: p2 */
    RobotoTextView f78797p2;

    /* renamed from: p4 */
    final Runnable f78799p4;

    /* renamed from: q1 */
    HorizontalScrollView f78800q1;

    /* renamed from: q2 */
    RobotoTextView f78801q2;

    /* renamed from: q4 */
    int f78803q4;

    /* renamed from: r1 */
    FeedGridModulesView f78804r1;

    /* renamed from: r2 */
    RecyclingImageView f78805r2;

    /* renamed from: r3 */
    C0708i f78806r3;

    /* renamed from: r4 */
    int f78807r4;

    /* renamed from: s1 */
    View f78808s1;

    /* renamed from: s3 */
    int[] f78810s3;

    /* renamed from: s4 */
    boolean f78811s4;

    /* renamed from: t1 */
    View f78812t1;

    /* renamed from: t4 */
    final Runnable f78815t4;

    /* renamed from: u1 */
    android.widget.Button f78816u1;

    /* renamed from: u4 */
    int f78819u4;

    /* renamed from: v1 */
    View f78820v1;

    /* renamed from: v4 */
    InterfaceC20094a f78823v4;

    /* renamed from: w1 */
    View f78824w1;

    /* renamed from: w4 */
    ArrayList f78827w4;

    /* renamed from: x1 */
    C18565a f78828x1;

    /* renamed from: x4 */
    boolean f78831x4;

    /* renamed from: y1 */
    ComposeSongItemView f78832y1;

    /* renamed from: y2 */
    ArrayList f78833y2;

    /* renamed from: y4 */
    boolean f78835y4;

    /* renamed from: z1 */
    BoxLyric f78836z1;

    /* renamed from: z4 */
    C13306b f78839z4;

    /* renamed from: P0 */
    private final Random f78692P0 = new Random();

    /* renamed from: Q0 */
    final String f78696Q0 = UpdateStatusView.class.getSimpleName();

    /* renamed from: U0 */
    boolean f78712U0 = false;

    /* renamed from: a1 */
    LinkedHashMap f78736a1 = new LinkedHashMap();

    /* renamed from: b1 */
    LinkedHashMap f78740b1 = new LinkedHashMap();

    /* renamed from: c1 */
    PrivacyInfo f78744c1 = new PrivacyInfo();

    /* renamed from: e1 */
    boolean f78752e1 = false;

    /* renamed from: k1 */
    int f78776k1 = 5;

    /* renamed from: p1 */
    ArrayList f78796p1 = new ArrayList();

    /* renamed from: D1 */
    ArrayList f78656D1 = new ArrayList();

    /* renamed from: M1 */
    C25630b f78683M1 = null;

    /* renamed from: R1 */
    LinkAttachment f78701R1 = null;

    /* renamed from: b2 */
    C3023p3 f78741b2 = null;

    /* renamed from: s2 */
    C32002l4 f78809s2 = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM);

    /* renamed from: t2 */
    C31987k4 f78813t2 = new C31987k4(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM);

    /* renamed from: u2 */
    private boolean f78817u2 = false;

    /* renamed from: v2 */
    long f78821v2 = -1;

    /* renamed from: w2 */
    boolean f78825w2 = false;

    /* renamed from: x2 */
    EnumC22962a f78829x2 = EnumC22962a.f111693q;

    /* renamed from: z2 */
    boolean f78837z2 = false;

    /* renamed from: A2 */
    boolean f78645A2 = false;

    /* renamed from: B2 */
    boolean f78649B2 = false;

    /* renamed from: C2 */
    boolean f78653C2 = false;

    /* renamed from: D2 */
    String f78657D2 = "";

    /* renamed from: E2 */
    boolean f78660E2 = false;

    /* renamed from: F2 */
    boolean f78663F2 = false;

    /* renamed from: G2 */
    boolean f78666G2 = false;

    /* renamed from: Q2 */
    TrackingSource f78698Q2 = new TrackingSource(0);

    /* renamed from: R2 */
    int f78702R2 = 0;

    /* renamed from: S2 */
    private boolean f78706S2 = false;

    /* renamed from: T2 */
    Handler f78710T2 = new HandlerC15262k(Looper.getMainLooper());

    /* renamed from: V2 */
    boolean f78718V2 = true;

    /* renamed from: W2 */
    int f78722W2 = -1;

    /* renamed from: X2 */
    boolean f78726X2 = false;

    /* renamed from: Y2 */
    boolean f78730Y2 = false;

    /* renamed from: Z2 */
    boolean f78734Z2 = true;

    /* renamed from: a3 */
    boolean f78738a3 = false;

    /* renamed from: b3 */
    boolean f78742b3 = false;

    /* renamed from: c3 */
    private Boolean f78746c3 = Boolean.TRUE;

    /* renamed from: d3 */
    private int f78750d3 = -1;

    /* renamed from: e3 */
    private Boolean f78754e3 = Boolean.FALSE;

    /* renamed from: f3 */
    protected SongInfo f78758f3 = null;

    /* renamed from: g3 */
    private int f78762g3 = -1;

    /* renamed from: p3 */
    boolean f78798p3 = true;

    /* renamed from: q3 */
    int f78802q3 = 0;

    /* renamed from: t3 */
    int f78814t3 = 0;

    /* renamed from: u3 */
    int f78818u3 = 0;

    /* renamed from: v3 */
    int f78822v3 = 0;

    /* renamed from: w3 */
    private boolean f78826w3 = false;

    /* renamed from: x3 */
    private int f78830x3 = 0;

    /* renamed from: y3 */
    boolean f78834y3 = false;

    /* renamed from: z3 */
    String f78838z3 = "";

    /* renamed from: B3 */
    private String f78650B3 = "";

    /* renamed from: D3 */
    boolean f78658D3 = false;

    /* renamed from: E3 */
    int f78661E3 = 0;

    /* renamed from: F3 */
    C31890dc f78664F3 = C31845ac.m152996J().m153020A();

    /* renamed from: G3 */
    boolean f78667G3 = false;

    /* loaded from: classes6.dex */
    public static class UpdateStatusFragmentDialog extends DialogView {

        /* renamed from: H0 */
        UpdateStatusView f78840H0;

        /* renamed from: I0 */
        InterfaceC17463d.d f78841I0 = new C15241a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$UpdateStatusFragmentDialog$a */
        /* loaded from: classes6.dex */
        public class C15241a implements InterfaceC17463d.d {
            C15241a() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                try {
                    int i12 = UpdateStatusFragmentDialog.this.m92642L3().getInt("id");
                    if (i12 != 11) {
                        if (i12 == 12 && interfaceC17463d != null) {
                            try {
                                interfaceC17463d.dismiss();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        return;
                    }
                    if (interfaceC17463d != null) {
                        try {
                            interfaceC17463d.dismiss();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                            return;
                        }
                    }
                    UpdateStatusFragmentDialog updateStatusFragmentDialog = UpdateStatusFragmentDialog.this;
                    if (updateStatusFragmentDialog.f78840H0 != null) {
                        FeedActionZUtils.m47534V(updateStatusFragmentDialog.m92648SI(), UpdateStatusFragmentDialog.this.f78840H0.f78657D2, 0, 0);
                        UpdateStatusView updateStatusView = UpdateStatusFragmentDialog.this.f78840H0;
                        if (updateStatusView.f78653C2) {
                            C20834z0.f102412a.m108927f(true);
                            if (UpdateStatusFragmentDialog.this.m92676n2() instanceof Activity) {
                                AbstractC23136l9.m118678T0((Activity) UpdateStatusFragmentDialog.this.m92676n2());
                            }
                            UpdateStatusFragmentDialog.this.f78840H0.m85944kR();
                        } else if (updateStatusView.f78649B2) {
                            updateStatusView.m85829DS(17);
                        } else {
                            updateStatusView.m85833FN();
                        }
                        UpdateStatusFragmentDialog.this.f78840H0.mo79399TS(true);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                e13.printStackTrace();
            }
        }

        /* renamed from: cL */
        public static UpdateStatusFragmentDialog m85997cL(int i11, UpdateStatusView updateStatusView) {
            UpdateStatusFragmentDialog updateStatusFragmentDialog = new UpdateStatusFragmentDialog();
            updateStatusFragmentDialog.m86004jL(updateStatusView);
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            updateStatusFragmentDialog.mo60305zK(bundle);
            if (i11 == 17 || i11 == 18) {
                updateStatusFragmentDialog.mo43041MK(false);
            }
            return updateStatusFragmentDialog;
        }

        /* renamed from: dL */
        public /* synthetic */ void m85998dL(C27473a c27473a, InterfaceC17463d interfaceC17463d, int i11) {
            try {
                int m140529a = c27473a.m140529a(i11);
                if (m140529a == -1) {
                    return;
                }
                if (m140529a == 10) {
                    this.f78840H0.m85977tR();
                } else if (m140529a == 11) {
                    this.f78840H0.m85892VR();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: eL */
        public /* synthetic */ void m85999eL(EditText editText, InterfaceC17463d interfaceC17463d, int i11) {
            if (this.f78840H0 != null && editText != null) {
                editText.setText("");
                AbstractC2379w.m12430d(editText);
                this.f78840H0.m85855Ka(0);
            }
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
        }

        /* renamed from: fL */
        public /* synthetic */ void m86000fL(EditText editText, InterfaceC17463d interfaceC17463d, int i11) {
            String trim = editText.getText().toString().trim();
            if (trim != null && trim.length() > 0) {
                editText.setText("");
                AbstractC2379w.m12430d(editText);
                UpdateStatusView updateStatusView = this.f78840H0;
                if (updateStatusView != null) {
                    updateStatusView.m85936iO(trim);
                    this.f78840H0.m85855Ka(0);
                }
                if (interfaceC17463d != null) {
                    interfaceC17463d.dismiss();
                    return;
                }
                return;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_input_inform));
        }

        /* renamed from: gL */
        public /* synthetic */ void m86001gL(InterfaceC17463d interfaceC17463d) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            this.f78840H0.m85855Ka(0);
        }

        /* renamed from: hL */
        public /* synthetic */ void m86002hL(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
            if (z11) {
                AbstractC23647d.m123906p("13671");
            } else {
                AbstractC23647d.m123906p("13681");
            }
            AbstractC23647d.m123893c();
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            if (z11) {
                C20834z0.f102412a.m108927f(true);
            }
            if (z11) {
                UpdateStatusView updateStatusView = this.f78840H0;
                updateStatusView.m85840HN(updateStatusView.mo79391LO());
            } else {
                this.f78840H0.m85833FN();
            }
        }

        /* renamed from: iL */
        public /* synthetic */ void m86003iL(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
            if (z11) {
                AbstractC23647d.m123906p("13670");
            } else {
                AbstractC23647d.m123906p("13680");
            }
            AbstractC23647d.m123893c();
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            if (z11) {
                C20834z0.f102412a.m108927f(true);
            }
            if (m92676n2() instanceof Activity) {
                AbstractC23136l9.m118678T0((Activity) m92676n2());
            }
            this.f78840H0.m85879TN();
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            int i11;
            int i12;
            try {
                if (this.f78840H0 == null || bundle != null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C8009j c8009j = null;
            try {
                int i13 = m92642L3().getInt("id");
                boolean z11 = true;
                switch (i13) {
                    case 10:
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C27473a.a(11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_location_delete)));
                        arrayList.add(new C27473a.a(10, AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_location_change)));
                        C27473a c27473a = new C27473a(m92648SI());
                        c27473a.m140530b(arrayList);
                        C17460a.a aVar = new C17460a.a(m92648SI());
                        aVar.m92831b(c27473a, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.hz0

                            /* renamed from: q */
                            public final /* synthetic */ C27473a f80630q;

                            public /* synthetic */ hz0(C27473a c27473a2) {
                                r2 = c27473a2;
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                UpdateStatusView.UpdateStatusFragmentDialog.this.m85998dL(r2, interfaceC17463d, i14);
                            }
                        });
                        C17460a m92830a = aVar.m92830a();
                        m92830a.m92874z(true);
                        return m92830a;
                    case 11:
                        CharSequence mo79394NO = this.f78840H0.mo79394NO();
                        C8009j.a aVar2 = new C8009j.a(m92648SI());
                        aVar2.m43159h(7).m43162k(mo79394NO).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this.f78841I0);
                        return aVar2.m43152a();
                    case 12:
                        return AbstractC23093i.m118465r(m92648SI(), this.f78841I0);
                    case 13:
                    case 15:
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    default:
                        return null;
                    case 14:
                        try {
                            C8009j.a aVar3 = new C8009j.a(m92648SI());
                            View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.compose_status_link_layout, (ViewGroup) null);
                            EditText editText = (EditText) inflate.findViewById(AbstractC6918a0.link_input_edit_text);
                            String str = "";
                            LinkAttachment linkAttachment = this.f78840H0.f78701R1;
                            if (linkAttachment != null && !TextUtils.isEmpty(linkAttachment.f42624p)) {
                                str = this.f78840H0.f78701R1.f42624p;
                            } else if (AbstractC20826v0.m108837u()) {
                                try {
                                    String m119771j = ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119771j(m92648SI(), new SensitiveData("clipboard_paste_link_dialog", "paste_link_dialog"));
                                    if (!TextUtils.isEmpty(m119771j)) {
                                        if (!TextUtils.isEmpty(new URI(m119771j).getHost())) {
                                            str = m119771j;
                                        }
                                    }
                                } catch (Exception e12) {
                                    AbstractC20110a.m104539h(e12);
                                }
                            }
                            if (!TextUtils.isEmpty(str)) {
                                editText.setText(str);
                                editText.setSelection(str.length());
                                editText.selectAll();
                            }
                            int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 24.0f);
                            aVar3.m43150A(inflate, m118712h, AbstractC23136l9.m118712h(MainApplication.getAppContext(), 10.0f), m118712h, 0);
                            aVar3.m43154c(false);
                            aVar3.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_cancel), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.iz0

                                /* renamed from: q */
                                public final /* synthetic */ EditText f80734q;

                                public /* synthetic */ iz0(EditText editText2) {
                                    r2 = editText2;
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                    UpdateStatusView.UpdateStatusFragmentDialog.this.m85999eL(r2, interfaceC17463d, i14);
                                }
                            });
                            aVar3.m43169r(AbstractC8020f0.str_cap_okay, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.jz0

                                /* renamed from: q */
                                public final /* synthetic */ EditText f80834q;

                                public /* synthetic */ jz0(EditText editText2) {
                                    r2 = editText2;
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                /* renamed from: K8 */
                                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                    UpdateStatusView.UpdateStatusFragmentDialog.this.m86000fL(r2, interfaceC17463d, i14);
                                }
                            });
                            aVar3.m43167p(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.kz0
                                public /* synthetic */ kz0() {
                                }

                                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                                /* renamed from: p7 */
                                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                                    UpdateStatusView.UpdateStatusFragmentDialog.this.m86001gL(interfaceC17463d);
                                }
                            });
                            c8009j = aVar3.m43152a();
                            c8009j.m92867k().m92890I(37);
                            return c8009j;
                        } catch (Exception e13) {
                            e13.printStackTrace();
                            return c8009j;
                        }
                    case 17:
                    case 18:
                        if (i13 != 18) {
                            z11 = false;
                        }
                        C2850a.a aVar4 = new C2850a.a(m92648SI());
                        if (z11) {
                            i11 = AbstractC16803z.btn_radio_on_holo_light;
                        } else {
                            i11 = -1;
                        }
                        C2850a.a m13741c = aVar4.m13741c(i11);
                        if (z11) {
                            i12 = AbstractC8020f0.profile_share_vip_success;
                        } else {
                            i12 = AbstractC8020f0.str_share_cancel;
                        }
                        m13741c.m13743e(i12).m13742d(AbstractC8020f0.str_stay_in_zalo, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.lz0

                            /* renamed from: q */
                            public final /* synthetic */ boolean f81069q;

                            public /* synthetic */ lz0(boolean z112) {
                                r2 = z112;
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                UpdateStatusView.UpdateStatusFragmentDialog.this.m86002hL(r2, interfaceC17463d, i14);
                            }
                        }).m13740b(AbstractC8020f0.str_back_to_previous_app, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.mz0

                            /* renamed from: q */
                            public final /* synthetic */ boolean f81286q;

                            public /* synthetic */ mz0(boolean z112) {
                                r2 = z112;
                            }

                            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                            /* renamed from: K8 */
                            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                                UpdateStatusView.UpdateStatusFragmentDialog.this.m86003iL(r2, interfaceC17463d, i14);
                            }
                        });
                        C2850a m13739a = aVar4.m13739a();
                        m13739a.m92873y(false);
                        return m13739a;
                    case 19:
                        String m85859MO = this.f78840H0.m85859MO();
                        C8009j.a aVar5 = new C8009j.a(m92648SI());
                        aVar5.m43159h(4).m43162k(Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_alert_feed_album_privacy, m85859MO))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm), new InterfaceC17463d.b());
                        return aVar5.m43152a();
                    case 20:
                        String m85859MO2 = this.f78840H0.m85859MO();
                        C8009j.a aVar6 = new C8009j.a(m92648SI());
                        aVar6.m43159h(4).m43162k(Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_profile_album_limit_item_album, m85859MO2))).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm), new InterfaceC17463d.b());
                        return aVar6.m43152a();
                }
            } catch (Exception e14) {
                e14.printStackTrace();
                return c8009j;
            }
            e14.printStackTrace();
            return c8009j;
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
        /* renamed from: Tv */
        public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
            super.mo12457Tv(interfaceC17463d);
            UpdateStatusView updateStatusView = this.f78840H0;
            if (updateStatusView != null) {
                updateStatusView.m85855Ka(0);
            }
        }

        /* renamed from: jL */
        public void m86004jL(UpdateStatusView updateStatusView) {
            this.f78840H0 = updateStatusView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$a */
    /* loaded from: classes6.dex */
    public class C15242a implements ControlComposeButtonView.InterfaceC8625a {
        C15242a() {
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: a */
        public void mo45922a() {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.m85799vR(updateStatusView.f78750d3);
            UpdateStatusView.this.f78702R2 = 2;
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 58)), false);
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null) {
                c13306b.m74689E("tip.formpost.music");
            }
            C0732w.Companion.m1189a().m1187q("click_button_music_bottom", "", null, null);
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: b */
        public void mo45923b(boolean z11, boolean z12) {
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: c */
        public void mo45924c() {
            UpdateStatusView.this.f78813t2.m154212l(36);
            UpdateStatusView.this.m85820AS();
            C0732w.Companion.m1189a().m1187q("click_button_album_bottom", "", null, null);
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: d */
        public void mo45925d() {
            UpdateStatusView.this.m85724aT();
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: e */
        public void mo45926e() {
            AbstractC23647d.m123906p("13200");
            UpdateStatusView.this.mo79382AR();
            AbstractC23647d.m123893c();
            UpdateStatusView.this.f78839z4.m74689E("tip.postfeed.friendtag");
            C0732w.Companion.m1189a().m1187q("click_button_tag_friend_bottom", "", null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$a0 */
    /* loaded from: classes6.dex */
    public class C15243a0 implements SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b {
        C15243a0() {
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b
        /* renamed from: a */
        public void mo45948a() {
            UpdateStatusView.this.m85733dT();
            UpdateStatusView.this.f78770i3 = null;
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b
        /* renamed from: b */
        public void mo45949b() {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.f78802q3 = 0;
            updateStatusView.f78798p3 = false;
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b
        /* renamed from: c */
        public void mo45950c() {
            UpdateStatusView.this.m85733dT();
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b
        /* renamed from: d */
        public void mo45951d(C18051g c18051g) {
            UpdateStatusView.this.f78774j3 = c18051g.m95939e();
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            int[] iArr = updateStatusView.f78810s3;
            int i11 = updateStatusView.f78774j3;
            iArr[i11] = iArr[i11] + 1;
            updateStatusView.mo79403eT();
            UpdateStatusView.this.m85948lT();
            UpdateStatusView updateStatusView2 = UpdateStatusView.this;
            updateStatusView2.f78832y1.m43592f0(updateStatusView2.f78774j3);
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet.InterfaceC8627b
        /* renamed from: e */
        public void mo45952e() {
            UpdateStatusView.this.m85733dT();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$b */
    /* loaded from: classes6.dex */
    public class C15244b extends RecyclerView.AbstractC1887n {
        C15244b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            rect.right = AbstractC23136l9.m118742r(5.0f);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$b0 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C15245b0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78846a;

        /* renamed from: b */
        static final /* synthetic */ int[] f78847b;

        static {
            int[] iArr = new int[AlbumListBottomSheet.EnumC8474b.values().length];
            f78847b = iArr;
            try {
                iArr[AlbumListBottomSheet.EnumC8474b.f46007p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78847b[AlbumListBottomSheet.EnumC8474b.f46008q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78847b[AlbumListBottomSheet.EnumC8474b.f46009r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC15261j0.values().length];
            f78846a = iArr2;
            try {
                iArr2[EnumC15261j0.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78846a[EnumC15261j0.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$c */
    /* loaded from: classes6.dex */
    public class C15246c implements C27477e.b {
        C15246c() {
        }

        @Override // v20.C27477e.b
        /* renamed from: a */
        public void mo78503a(C31890dc c31890dc, int i11) {
            try {
                C31845ac.m152996J().m153029G(c31890dc, new C15267m0(), (byte) 2);
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                C27477e c27477e = updateStatusView.f78684M2;
                if (c27477e != null) {
                    c27477e.m140544Y(i11, updateStatusView.f78678K2, updateStatusView.f78681L2, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // v20.C27477e.b
        /* renamed from: b */
        public void mo78504b(C31890dc c31890dc, int i11) {
            try {
                if (!UpdateStatusView.this.m85899XP()) {
                    return;
                }
                AbstractC23647d.m123897g("1300103");
                C31890dc c31890dc2 = UpdateStatusView.this.f78670H3;
                if (c31890dc2 != null && !c31890dc2.m153249t()) {
                    AbstractC23647d.m123897g("1300105");
                }
                UpdateStatusView.this.m85928fS(c31890dc, false);
                UpdateStatusView.this.m85932gS();
                UpdateStatusView.this.mo79419nT();
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                C27477e c27477e = updateStatusView.f78684M2;
                if (c27477e != null) {
                    c27477e.m140544Y(i11, updateStatusView.f78678K2, updateStatusView.f78681L2, true);
                }
                C0732w.Companion.m1189a().m1187q("select_typo", "", null, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$c0 */
    /* loaded from: classes6.dex */
    public class C15247c0 implements QuickPickerView.InterfaceC12657s {
        C15247c0() {
        }

        /* renamed from: g */
        public /* synthetic */ void m86006g() {
            QuickPickerView quickPickerView = UpdateStatusView.this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71220MN(0);
                UpdateStatusView.this.f78716V0.m71289vO();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: Z */
        public void mo45273Z(C27373c c27373c, String str) {
            C0732w.Companion.m1189a().m1187q("gallery_pick_video", "", null, null);
            UpdateStatusView.this.mo79422qR(c27373c, str);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: a */
        public void mo45274a() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: b */
        public boolean mo45275b() {
            UpdateStatusView.this.m85971sO();
            return true;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: c */
        public void mo45276c(int i11) {
            if (i11 == 0 && UpdateStatusView.this.f78647A4.mo66903h("tip.postfeed.camera") != null) {
                UpdateStatusView.this.f78839z4.m74689E("tip.postfeed.camera");
            } else {
                UpdateStatusView.this.f78839z4.m74702j("tip.any");
            }
            if (i11 == 0) {
                UpdateStatusView.this.m85883Tr();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: d */
        public void mo45277d() {
            C0732w.Companion.m1189a().m1187q("gallery_open_camera", "", null, null);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: e */
        public void mo45278e(List list, boolean z11) {
            C0732w.Companion.m1189a().m1187q("gallery_pick_photo", "", null, null);
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.f78726X2 = false;
            if (updateStatusView.f78796p1 != null) {
                updateStatusView.m85903YS(list);
                UpdateStatusView.this.m85877SR();
            }
            UpdateStatusView.this.f78716V0.m71265dO(false);
            UpdateStatusView.this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.az0
                public /* synthetic */ az0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15247c0.this.m86006g();
                }
            }, 300L);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$d */
    /* loaded from: classes6.dex */
    public class C15248d implements FeedRecyclerView.InterfaceC8863b {
        C15248d() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            UpdateStatusView.this.f78676J3 = false;
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            UpdateStatusView.this.f78676J3 = true;
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            UpdateStatusView.this.f78676J3 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$d0 */
    /* loaded from: classes6.dex */
    public class C15249d0 implements QuickPickerView.InterfaceC12664z {
        C15249d0() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: a */
        public boolean mo64343a() {
            return false;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: b */
        public void mo64344b(String str, int i11, int i12) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: c */
        public void mo64345c(String str) {
            C31845ac m152996J = C31845ac.m152996J();
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            m152996J.m153047b0(updateStatusView.f78756f1, str, updateStatusView.m85821BO(), UpdateStatusView.this.f78791n4);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: d */
        public void mo64346d(C25630b c25630b, int i11, int i12, int i13) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: e */
        public void mo64347e(C25630b c25630b, int i11, int i12, int i13, String str) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: f */
        public void mo64348f(int i11) {
            UpdateStatusView.this.m85949le(i11);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: g */
        public void mo64349g(C25630b c25630b, int i11, int i12, int i13) {
            UpdateStatusView.this.mo79402eP(c25630b);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: h */
        public void mo64350h() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: i */
        public void mo64351i(String str) {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12664z
        /* renamed from: j */
        public void mo64352j() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$e */
    /* loaded from: classes6.dex */
    public class C15250e extends RecyclerView.AbstractC1892s {
        C15250e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    UpdateStatusView.this.f78684M2.m140550e0(false);
                    UpdateStatusView.this.f78684M2.m10008p();
                    AbstractC23647d.m123897g("1300106");
                } else {
                    UpdateStatusView.this.f78684M2.m140550e0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$e0 */
    /* loaded from: classes6.dex */
    public class C15251e0 implements QuickPickerView.InterfaceC12663y {
        C15251e0() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: K */
        public void mo45279K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            String str3;
            C3063z0 c3063z0;
            if (c18460c != null) {
                try {
                    double d11 = c18460c.f93025f;
                    double d12 = c18460c.f93026g;
                    String str4 = c18460c.f93020a;
                    if (!TextUtils.isEmpty(c18460c.f93021b)) {
                        str3 = c18460c.f93021b;
                    } else {
                        str3 = c18460c.f93022c;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str5 = str3;
                    if (d11 != 0.0d && d12 != 0.0d && !TextUtils.isEmpty(str5)) {
                        c3063z0 = new C3063z0(str4, d11, d12, str5, true);
                    } else {
                        c3063z0 = null;
                    }
                    if (c3063z0 != null) {
                        UpdateStatusView updateStatusView = UpdateStatusView.this;
                        updateStatusView.f78745c2 = c3063z0;
                        updateStatusView.m85853KR();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: b */
        public void mo45280b() {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.f78825w2 = false;
            updateStatusView.f78726X2 = false;
            updateStatusView.m85938iS();
            UpdateStatusView.this.m85935hS();
            UpdateStatusView.this.m85850KN(1);
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null) {
                c13306b.m74699e("tip.any");
                UpdateStatusView.this.f78839z4.m74700f("tip.any", Boolean.TRUE);
            }
            UpdateStatusView.this.m85858MN();
            UpdateStatusView.this.m85676LN();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: e */
        public void mo45281e() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: g */
        public void mo45282g() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: h */
        public void mo45283h() {
            UpdateStatusView.this.m85892VR();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: i */
        public void mo45284i(C31890dc c31890dc) {
            UpdateStatusView.this.m85906ZR(c31890dc, true);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: j */
        public void mo45285j() {
            UpdateStatusView.this.m85906ZR(C31845ac.m152996J().m153020A(), true);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: k */
        public void mo45286k(Bundle bundle) {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.m85831EP(updateStatusView.f72421L0.m92642L3(), bundle);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: l */
        public void mo45287l() {
            UpdateStatusView.this.mo37493TJ();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: m */
        public void mo45288m() {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.f78726X2 = false;
            updateStatusView.m85850KN(1);
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null) {
                c13306b.m74699e("tip.any");
                UpdateStatusView.this.f78839z4.m74700f("tip.any", Boolean.TRUE);
            }
            UpdateStatusView.this.m85676LN();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: n */
        public void mo45289n() {
            ShowcaseView showcaseView;
            int i11 = 0;
            UpdateStatusView.this.m85850KN(0);
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null && (showcaseView = c13306b.f68386f) != null && showcaseView.isShown() && !TextUtils.equals("tip.postfeed.camera", UpdateStatusView.this.f78839z4.f68386f.getShowcaseId())) {
                UpdateStatusView.this.f78839z4.m74702j("tip.any");
            }
            AbstractC2379w.m12430d(UpdateStatusView.this.f78756f1);
            UpdateStatusView.this.f78826w3 = true;
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            ArrayList arrayList = updateStatusView.f78796p1;
            if (arrayList != null) {
                i11 = arrayList.size();
            }
            updateStatusView.f78830x3 = i11;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: o */
        public void mo45290o() {
            UpdateStatusView.this.mo37493TJ();
            UpdateStatusView.this.f78839z4.m74699e("tip.any");
            UpdateStatusView.this.f78839z4.m74700f("tip.any", Boolean.TRUE);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$f */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC15252f implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$f$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                try {
                    UpdateStatusView.this.m85920cT(EnumC15261j0.DECREASE);
                    UpdateStatusView updateStatusView = UpdateStatusView.this;
                    if (updateStatusView.f78691O3 == EnumC15263k0.ON && updateStatusView.f78695P3.get() == 0) {
                        UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                        updateStatusView2.f78684M2.m140546a0(updateStatusView2.f78670H3, updateStatusView2.f78678K2, updateStatusView2.f78681L2, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        ViewTreeObserverOnPreDrawListenerC15252f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                UpdateStatusView.this.f78678K2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (UpdateStatusView.this.m85918cQ()) {
                    UpdateStatusView.this.m85920cT(EnumC15261j0.INCREASE);
                    int childCount = UpdateStatusView.this.f78678K2.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = childCount - 1; i11 >= 0; i11--) {
                        View childAt = UpdateStatusView.this.f78678K2.getChildAt(i11);
                        childAt.setTranslationX((-childAt.getLeft()) - childAt.getWidth());
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationX", 0.0f);
                        ofFloat.setStartDelay((r1 - i11) * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.addListener(new a());
                    animatorSet.start();
                } else {
                    UpdateStatusView.this.f78678K2.clearAnimation();
                    UpdateStatusView updateStatusView = UpdateStatusView.this;
                    updateStatusView.f78678K2.startAnimation(updateStatusView.f78714U2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$f0 */
    /* loaded from: classes6.dex */
    public class C15253f0 implements QuickPickerView.InterfaceC12659u {
        C15253f0() {
        }

        /* renamed from: c */
        public /* synthetic */ void m86009c() {
            StatusComposeEditText statusComposeEditText = UpdateStatusView.this.f78756f1;
            if (statusComposeEditText != null && statusComposeEditText.getLineCount() > 2) {
                int lineCount = (UpdateStatusView.this.f78756f1.getLineCount() - 2) * UpdateStatusView.this.f78756f1.getLineHeight();
                ScrollView scrollView = UpdateStatusView.this.f78728Y0;
                if (scrollView != null && scrollView.getScrollY() < lineCount) {
                    UpdateStatusView.this.f78728Y0.smoothScrollTo(0, lineCount);
                }
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m86010d() {
            UpdateStatusView.this.m85877SR();
            StatusComposeEditText statusComposeEditText = UpdateStatusView.this.f78756f1;
            if (statusComposeEditText != null && statusComposeEditText.getLineCount() > 2) {
                int lineCount = (UpdateStatusView.this.f78756f1.getLineCount() - 2) * UpdateStatusView.this.f78756f1.getLineHeight();
                ScrollView scrollView = UpdateStatusView.this.f78728Y0;
                if (scrollView != null && scrollView.getScrollY() < lineCount) {
                    UpdateStatusView.this.f78728Y0.smoothScrollTo(0, lineCount);
                }
            }
            UpdateStatusView.this.f78706S2 = true;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: O */
        public void mo45270O(MediaItem mediaItem) {
            C0708i c0708i = new C0708i();
            c0708i.m1072c("multiple_photo", !UpdateStatusView.this.f78796p1.isEmpty() ? 1 : 0);
            C0732w.Companion.m1189a().m1187q("gallery_select_photo", "", c0708i, null);
            if (!mediaItem.m41173u0()) {
                UpdateStatusView.this.f78796p1.remove(mediaItem);
            } else if (UpdateStatusView.this.f78796p1.size() < AbstractC0924m0.m3769e3()) {
                UpdateStatusView.this.f78796p1.add(mediaItem);
            }
            UpdateStatusView.this.m85877SR();
            UpdateStatusView.this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.dz0
                public /* synthetic */ dz0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15253f0.this.m86009c();
                }
            });
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: m */
        public void mo45271m(List list) {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            if (updateStatusView.f78796p1 != null) {
                updateStatusView.m85903YS(list);
                UpdateStatusView.this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ez0
                    public /* synthetic */ ez0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.C15253f0.this.m86010d();
                    }
                }, 200L);
            }
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null) {
                c13306b.m74714z("tip.postfeed.camera", 200);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: n */
        public void mo45272n(boolean z11, boolean z12) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$g */
    /* loaded from: classes6.dex */
    public class C15254g extends AnimatorListenerAdapter {
        C15254g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                UpdateStatusView.this.m85920cT(EnumC15261j0.DECREASE);
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (updateStatusView.f78691O3 == EnumC15263k0.OFF) {
                    updateStatusView.f78678K2.setVisibility(8);
                }
                for (int i11 = 0; i11 < UpdateStatusView.this.f78678K2.getChildCount(); i11++) {
                    UpdateStatusView.this.f78678K2.getChildAt(i11).setTranslationX(0.0f);
                }
                UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                if (updateStatusView2.f78691O3 == EnumC15263k0.ON && updateStatusView2.f78695P3.get() == 0) {
                    UpdateStatusView updateStatusView3 = UpdateStatusView.this;
                    updateStatusView3.f78684M2.m140546a0(updateStatusView3.f78670H3, updateStatusView3.f78678K2, updateStatusView3.f78681L2, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$g0 */
    /* loaded from: classes6.dex */
    class C15255g0 extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f78858p;

        C15255g0(Runnable runnable) {
            this.f78858p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f78858p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$h */
    /* loaded from: classes6.dex */
    public class C15256h implements StatusComposeEditText.InterfaceC10892b {
        C15256h() {
        }

        @Override // com.zing.zalo.social.widget.StatusComposeEditText.InterfaceC10892b
        /* renamed from: a */
        public void mo56530a() {
        }

        @Override // com.zing.zalo.social.widget.StatusComposeEditText.InterfaceC10892b
        /* renamed from: b */
        public void mo56531b() {
        }

        @Override // com.zing.zalo.social.widget.StatusComposeEditText.InterfaceC10892b
        /* renamed from: c */
        public void mo56532c() {
        }

        @Override // com.zing.zalo.social.widget.StatusComposeEditText.InterfaceC10892b
        /* renamed from: d */
        public void mo56533d(int i11, int i12, boolean z11) {
            UpdateStatusView.this.m85662GR(i11, i12, z11);
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.m85912bO(updateStatusView.m85875SO());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$h0 */
    /* loaded from: classes6.dex */
    public class C15257h0 extends C23999j {
        C15257h0() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    interfaceC3968a.setImageInfo(c3979l);
                    interfaceC3968a.setVisibility(0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$i */
    /* loaded from: classes6.dex */
    public class C15258i implements ControlComposeButtonView.InterfaceC8625a {
        C15258i() {
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: a */
        public void mo45922a() {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            updateStatusView.m85799vR(updateStatusView.f78750d3);
            UpdateStatusView.this.f78702R2 = 1;
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 57)), false);
            C0732w.Companion.m1189a().m1187q("click_button_music_top", "", null, null);
            C13306b c13306b = UpdateStatusView.this.f78839z4;
            if (c13306b != null) {
                c13306b.m74689E("tip.formpost.music");
            }
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: b */
        public void mo45923b(boolean z11, boolean z12) {
            if (UpdateStatusView.this.m85710WP()) {
                UpdateStatusView.this.f78766h3.m104634n0(false);
                UpdateStatusView.this.m85694QS();
            } else {
                UpdateStatusView.this.f78766h3.m104634n0(z12);
            }
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: c */
        public void mo45924c() {
            C0732w.Companion.m1189a().m1187q("click_button_album_top", "", null, null);
            UpdateStatusView.this.f78813t2.m154212l(35);
            if (UpdateStatusView.this.m85710WP()) {
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                updateStatusView.f78774j3 = 0;
                updateStatusView.m85948lT();
                UpdateStatusView.this.m85713XN();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_only_available_for_default_layout));
            }
            UpdateStatusView.this.m85820AS();
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: d */
        public void mo45925d() {
            UpdateStatusView.this.m85724aT();
        }

        @Override // com.zing.zalo.feed.mvp.postfeed.component.ControlComposeButtonView.InterfaceC8625a
        /* renamed from: e */
        public void mo45926e() {
            UpdateStatusView.this.mo79382AR();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$i0 */
    /* loaded from: classes6.dex */
    public class C15259i0 extends C23999j {
        C15259i0() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (interfaceC3968a instanceof AspectRatioImageView) {
                        interfaceC3968a.setImageInfo(c3979l);
                        interfaceC3968a.setVisibility(0);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$j */
    /* loaded from: classes6.dex */
    public class C15260j extends C20275e {
        C15260j() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$j0 */
    /* loaded from: classes6.dex */
    public enum EnumC15261j0 {
        INCREASE,
        DECREASE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$k */
    /* loaded from: classes6.dex */
    public class HandlerC15262k extends Handler {
        HandlerC15262k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        UpdateStatusView.this.m85692QN();
                        return;
                    }
                    return;
                }
                UpdateStatusView.this.m85878SS();
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                int i12 = updateStatusView.f78807r4 - 1;
                updateStatusView.f78807r4 = i12;
                if (i12 > 0) {
                    updateStatusView.f78710T2.sendEmptyMessageDelayed(2, 50L);
                    return;
                }
                return;
            }
            UpdateStatusView.this.m85848JN(0L);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$k0 */
    /* loaded from: classes6.dex */
    public enum EnumC15263k0 {
        ON,
        OFF
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$l */
    /* loaded from: classes6.dex */
    public class C15264l implements ComposeSongItemView.InterfaceC8077a {
        C15264l() {
        }

        @Override // com.zing.zalo.feed.components.ComposeSongItemView.InterfaceC8077a
        /* renamed from: a */
        public void mo43593a(SongData songData) {
            UpdateStatusView.this.f78766h3.m104635o0(songData);
        }

        @Override // com.zing.zalo.feed.components.ComposeSongItemView.InterfaceC8077a
        /* renamed from: b */
        public void mo43594b() {
            UpdateStatusView.this.f78766h3.m104603B0();
        }

        @Override // com.zing.zalo.feed.components.ComposeSongItemView.InterfaceC8077a
        /* renamed from: c */
        public void mo43595c(SongData songData) {
            UpdateStatusView updateStatusView = UpdateStatusView.this;
            if (!updateStatusView.f78834y3) {
                updateStatusView.f78766h3.m104636p0();
                UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                updateStatusView2.m85799vR(updateStatusView2.f78750d3);
                C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 60)), false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$l0 */
    /* loaded from: classes6.dex */
    public enum EnumC15265l0 {
        STATE_MAX_SIZE,
        STATE_MIN_SIZE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$m */
    /* loaded from: classes6.dex */
    public class C15266m implements LocationPickerView.InterfaceC12771b {
        C15266m() {
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: a */
        public void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            UpdateStatusView.this.mo79414lR(c18460c);
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: h */
        public void mo60385h() {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$m0 */
    /* loaded from: classes6.dex */
    public class C15267m0 implements C31845ac.g {
        C15267m0() {
        }

        /* renamed from: e */
        public /* synthetic */ void m86016e() {
            try {
                if (UpdateStatusView.this.m85899XP() && UpdateStatusView.this.f72421L0.m92672lJ()) {
                    UpdateStatusView.this.m85924eS(true, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m86017f(String str, C31890dc c31890dc) {
            try {
                if (UpdateStatusView.this.m85899XP() && UpdateStatusView.this.f72421L0.m92672lJ()) {
                    UpdateStatusView.this.m85873RR();
                    C31890dc m140541R = UpdateStatusView.this.f78684M2.m140541R();
                    if (m140541R != null) {
                        if (str.equals(m140541R.f146495a + "")) {
                            if (c31890dc.m153250u()) {
                                AbstractC23647d.m123897g("1300103");
                                C31890dc c31890dc2 = UpdateStatusView.this.f78670H3;
                                if (c31890dc2 != null && !c31890dc2.m153249t()) {
                                    AbstractC23647d.m123897g("1300105");
                                }
                                UpdateStatusView.this.m85928fS(c31890dc, false);
                            } else {
                                UpdateStatusView.this.m85924eS(true, true);
                            }
                        }
                    }
                    UpdateStatusView.this.m85932gS();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: a */
        public void mo71404a(int i11, String str) {
            UpdateStatusView.this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.fz0
                public /* synthetic */ fz0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15267m0.this.m86016e();
                }
            });
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: b */
        public void mo71405b(String str, C31890dc c31890dc) {
            UpdateStatusView.this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gz0

                /* renamed from: q */
                public final /* synthetic */ String f80516q;

                /* renamed from: r */
                public final /* synthetic */ C31890dc f80517r;

                public /* synthetic */ gz0(String str2, C31890dc c31890dc2) {
                    r2 = str2;
                    r3 = c31890dc2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15267m0.this.m86017f(r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$n */
    /* loaded from: classes6.dex */
    public class C15268n implements C23418f.a {
        C15268n() {
        }

        /* renamed from: d */
        public /* synthetic */ void m86019d() {
            UpdateStatusView.this.m85856LR();
        }

        @Override // mp.C23418f.a
        /* renamed from: a */
        public void mo79430a(PrivacyInfo privacyInfo) {
            UpdateStatusView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.xy0
                public /* synthetic */ xy0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15268n.this.m86019d();
                }
            });
            UpdateStatusView.this.m85968rO(privacyInfo);
        }

        @Override // mp.C23418f.a
        /* renamed from: b */
        public void mo79431b(boolean z11) {
        }

        @Override // mp.C23418f.a
        public void onError(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$o */
    /* loaded from: classes6.dex */
    public class C15269o implements C8880k.f {

        /* renamed from: a */
        final /* synthetic */ int f78879a;

        C15269o(int i11) {
            this.f78879a = i11;
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: a */
        public void mo43488a(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            try {
                C0732w.Companion.m1189a().m1187q("click_button_edit_photo", "", null, null);
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (updateStatusView.f78712U0) {
                    AbstractC2379w.m12430d(updateStatusView.f78756f1);
                }
                C20275e c20275e = UpdateStatusView.this.f78747c4;
                if (c20275e != null) {
                    c20275e.m105865K(i11);
                }
                UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                updateStatusView2.m85973sR((MediaItem) updateStatusView2.f78796p1.get(i11), animationTarget, UpdateStatusView.this.f78747c4, i11, f11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: b */
        public void mo43489b(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, float f11) {
            try {
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (updateStatusView.f78712U0) {
                    AbstractC2379w.m12430d(updateStatusView.f78756f1);
                }
                ArrayList arrayList = UpdateStatusView.this.f78796p1;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i12 = this.f78879a;
                    if (size > i12 && i11 == i12 - 1) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("EXTRA_SELECTED_PHOTOS", UpdateStatusView.this.f78796p1);
                        bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", UpdateStatusView.this.mo46542d1());
                        bundle.putBoolean("extra_enable_inline_banner", true);
                        UpdateStatusView.this.f72421L0.m92662fJ().m93066i2(PostPhotoEditorView.class, bundle, 1021, 1, true);
                        AbstractC23647d.m123897g("13715");
                        return;
                    }
                    if (UpdateStatusView.this.f78716V0.m71254ZL() != -1) {
                        UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                        if (updateStatusView2.f78716V0.f65908G0) {
                            updateStatusView2.m85894WN();
                            return;
                        } else {
                            updateStatusView2.m85883Tr();
                            return;
                        }
                    }
                    AbstractC23647d.m123897g("13712");
                    UpdateStatusView.this.f78747c4.m105865K(i11);
                    UpdateStatusView updateStatusView3 = UpdateStatusView.this;
                    updateStatusView3.m85973sR((MediaItem) updateStatusView3.f78796p1.get(i11), animationTarget, UpdateStatusView.this.f78747c4, i11, f11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: c */
        public void mo43490c(int i11) {
            try {
                ArrayList arrayList = UpdateStatusView.this.f78796p1;
                if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                    MediaItem mediaItem = (MediaItem) UpdateStatusView.this.f78796p1.get(i11);
                    if (UpdateStatusView.this.f78796p1.contains(mediaItem)) {
                        UpdateStatusView.this.f78796p1.remove(mediaItem);
                        QuickPickerView quickPickerView = UpdateStatusView.this.f78716V0;
                        if (quickPickerView != null) {
                            quickPickerView.m71209FN(mediaItem);
                        }
                    }
                    ArrayList arrayList2 = UpdateStatusView.this.f78833y2;
                    if (arrayList2 != null) {
                        Iterator it = arrayList2.iterator();
                        String str = mediaItem.m41119R() + mediaItem.mo41081Q();
                        while (it.hasNext()) {
                            MediaItem mediaItem2 = (MediaItem) it.next();
                            if (TextUtils.equals(str, mediaItem2.m41119R() + mediaItem2.mo41081Q())) {
                                it.remove();
                            }
                        }
                        UpdateStatusView.this.m85941jR();
                    }
                    UpdateStatusView.this.m85668IR();
                    UpdateStatusView.this.m85877SR();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.C8880k.f
        /* renamed from: d */
        public void mo43491d(ItemAlbumMobile itemAlbumMobile, int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$p */
    /* loaded from: classes6.dex */
    public class RunnableC15270p implements Runnable {
        RunnableC15270p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (updateStatusView.f78759f4 == null) {
                    return;
                }
                float m85821BO = updateStatusView.m85821BO();
                UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                if (updateStatusView2.f78694P2) {
                    updateStatusView2.f78694P2 = false;
                } else {
                    C28652r.m143349v().m143362X(UpdateStatusView.this.f78759f4, m85821BO);
                    C0820h.f2880z = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$q */
    /* loaded from: classes6.dex */
    public class C15271q extends ClickableSpan {
        C15271q() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            StatusComposeEditText statusComposeEditText = UpdateStatusView.this.f78756f1;
            if (statusComposeEditText != null) {
                statusComposeEditText.setEnabled(false);
            }
            UpdateStatusView.this.mo79382AR();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                if (C13778s1.m76960a()) {
                    textPaint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
                textPaint.setColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
                textPaint.setUnderlineText(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$r */
    /* loaded from: classes6.dex */
    public class C15272r extends AbstractC10875n {
        C15272r(int i11, int i12) {
            super(i11, i12);
        }

        /* renamed from: j */
        public /* synthetic */ void m86021j() {
            StatusComposeEditText statusComposeEditText = UpdateStatusView.this.f78756f1;
            if (statusComposeEditText != null) {
                statusComposeEditText.setEnabled(true);
            }
        }

        @Override // com.zing.zalo.social.controls.AbstractC10875n
        /* renamed from: e */
        public void mo56513e(View view, String str) {
            UpdateStatusView.this.m85849JS();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                StatusComposeEditText statusComposeEditText = UpdateStatusView.this.f78756f1;
                if (statusComposeEditText != null) {
                    statusComposeEditText.setEnabled(false);
                }
                UpdateStatusView.this.m85847IS();
                UpdateStatusView.this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.yy0
                    public /* synthetic */ yy0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.C15272r.this.m86021j();
                    }
                }, 200L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.social.controls.AbstractC10875n, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                if (C13778s1.m76960a()) {
                    textPaint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
                textPaint.setColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
                textPaint.setUnderlineText(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$s */
    /* loaded from: classes6.dex */
    public class C15273s implements C0820h.a {
        C15273s() {
        }

        /* renamed from: c */
        public /* synthetic */ void m86023c(Editable editable, int i11, int i12) {
            try {
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                StatusComposeEditText statusComposeEditText = updateStatusView.f78756f1;
                if (statusComposeEditText != null) {
                    int i13 = 1;
                    updateStatusView.f78694P2 = true;
                    statusComposeEditText.setText(editable);
                    if (i11 != UpdateStatusView.this.f78756f1.getText().length() || AbstractC23309i.m121379Rd() != 1) {
                        i13 = 0;
                    }
                    UpdateStatusView.this.f78756f1.setSelection(i12 + i13);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ag0.C0820h.a
        /* renamed from: a */
        public void mo2144a(Editable editable, int i11, int i12) {
            UpdateStatusView.this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.zy0

                /* renamed from: q */
                public final /* synthetic */ Editable f82893q;

                /* renamed from: r */
                public final /* synthetic */ int f82894r;

                /* renamed from: s */
                public final /* synthetic */ int f82895s;

                public /* synthetic */ zy0(Editable editable2, int i112, int i122) {
                    r2 = editable2;
                    r3 = i112;
                    r4 = i122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.C15273s.this.m86023c(r2, r3, r4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$t */
    /* loaded from: classes6.dex */
    public class RunnableC15274t implements Runnable {
        RunnableC15274t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UpdateStatusView.this.f72421L0.m92676n2().mo35554O(18);
                AbstractC2379w.m12432f(UpdateStatusView.this.f78756f1);
                UpdateStatusView.this.m85883Tr();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(UpdateStatusView.this.f78696Q0, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$u */
    /* loaded from: classes6.dex */
    public class RunnableC15275u implements Runnable {
        RunnableC15275u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UpdateStatusView.this.f78756f1.getText().length() > 0) {
                    UpdateStatusView.this.m85878SS();
                    UpdateStatusView updateStatusView = UpdateStatusView.this;
                    if (updateStatusView.f78811s4) {
                        updateStatusView.f78710T2.postDelayed(updateStatusView.f78815t4, 50L);
                    } else {
                        updateStatusView.f78710T2.removeCallbacks(updateStatusView.f78815t4);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$v */
    /* loaded from: classes6.dex */
    class C15276v extends AbstractCallableC28112k5 {
        C15276v() {
        }

        @Override // vg.AbstractCallableC28112k5, java.util.concurrent.Callable
        /* renamed from: c */
        public Void call() {
            UpdateStatusView.this.m85743gR();
            return (Void) super.call();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$w */
    /* loaded from: classes6.dex */
    public class C15277w implements InterfaceC20094a {
        C15277w() {
        }

        /* renamed from: e */
        public /* synthetic */ void m86027e() {
            UpdateStatusView.this.m85958oR();
        }

        /* renamed from: f */
        public /* synthetic */ void m86028f(C20096c c20096c) {
            UpdateStatusView.this.m85954nR(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                updateStatusView.f78709T1 = false;
                updateStatusView.m85964qO(new Runnable() { // from class: com.zing.zalo.ui.zviews.bz0

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f79974q;

                    public /* synthetic */ bz0(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.C15277w.this.m86028f(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11 = 0;
            try {
                UpdateStatusView.this.f78709T1 = false;
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    UpdateStatusView.this.f78701R1 = new LinkAttachment(optJSONObject);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("zvideo_info");
                    if (optJSONObject2 != null) {
                        UpdateStatusView.this.f78741b2 = new C3023p3(optJSONObject2);
                    }
                }
                UpdateStatusView.this.m85964qO(new Runnable() { // from class: com.zing.zalo.ui.zviews.cz0
                    public /* synthetic */ cz0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.C15277w.this.m86027e();
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (updateStatusView.f78701R1 != null) {
                    i11 = 3;
                }
                updateStatusView.m85897WS(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$x */
    /* loaded from: classes6.dex */
    public class C15278x implements FeedActionZUtils.InterfaceC8912j {

        /* renamed from: a */
        final /* synthetic */ List f78889a;

        C15278x(List list) {
            this.f78889a = list;
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: a */
        public void mo47574a() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: b */
        public void mo47575b() {
            try {
                UpdateStatusView.this.mo79387ER();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: c */
        public void mo47576c(List list) {
            int i11;
            try {
                this.f78889a.removeAll(list);
                PrivacyInfo.m45127K(this.f78889a);
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                if (this.f78889a.size() == 0) {
                    i11 = 40;
                } else {
                    i11 = 90;
                }
                updateStatusView.m85953mT(i11, true);
                UpdateStatusView.this.mo79387ER();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$y */
    /* loaded from: classes6.dex */
    public class C15279y extends C7145n.g {
        C15279y() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                if (i11 == 70) {
                    List list = PrivacyInfo.f45971u;
                    if (list != null && list.size() == 2) {
                        AbstractC23647d.m123906p("13441");
                    } else {
                        AbstractC23647d.m123906p("13440");
                    }
                    AbstractC23647d.m123893c();
                    LinkedHashMap linkedHashMap = UpdateStatusView.this.f78740b1;
                    if (linkedHashMap != null) {
                        linkedHashMap.clear();
                    }
                    UpdateStatusView.this.m85987xR();
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
                    UpdateStatusView.this.m85925f4();
                    return;
                }
                if (i11 == 90) {
                    UpdateStatusView.this.m85983wR();
                } else {
                    UpdateStatusView.this.m85953mT(i11, false);
                    UpdateStatusView.this.m85884U2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            try {
                AbstractC23647d.m123906p("13431");
                AbstractC23647d.m123893c();
                UpdateStatusView updateStatusView = UpdateStatusView.this;
                LinkedHashMap linkedHashMap = updateStatusView.f78740b1;
                if (linkedHashMap != null) {
                    linkedHashMap.clear();
                } else {
                    updateStatusView.f78740b1 = new LinkedHashMap();
                }
                List<InviteContactProfile> m45138e = PrivacyInfo.m45134q(i11).m45138e();
                if (m45138e != null) {
                    for (InviteContactProfile inviteContactProfile : m45138e) {
                        UpdateStatusView.this.f78740b1.put(inviteContactProfile.f42434r, inviteContactProfile);
                    }
                }
                UpdateStatusView.this.m85987xR();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateStatusView$z */
    /* loaded from: classes6.dex */
    public class C15280z extends C13306b.c {
        C15280z() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003b. Please report as an issue. */
        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            QuickPickerView quickPickerView;
            int m71254ZL;
            View view;
            String str = c28212v6.f131577c;
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -698998559:
                    if (str.equals("tip.postfeed.typo")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 205094155:
                    if (str.equals("tip.postfeed.background")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 1504448718:
                    if (str.equals("tip.formpost.music")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 2063294850:
                    if (str.equals("tip.postfeed.camera")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    UpdateStatusView updateStatusView = UpdateStatusView.this;
                    if (updateStatusView.f78825w2 || updateStatusView.f78685M3 || !updateStatusView.m85899XP()) {
                        return false;
                    }
                    if (c28212v6.f131575a == 1 && !UpdateStatusView.this.f78831x4) {
                        return false;
                    }
                    return super.mo66900a(c28212v6);
                case 1:
                    UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                    if (updateStatusView2.f78825w2 || !updateStatusView2.m85899XP() || (c28212v6.f131575a == 1 && !UpdateStatusView.this.f78835y4)) {
                        return false;
                    }
                    return super.mo66900a(c28212v6);
                case 2:
                    if (UpdateStatusView.this.f78706S2) {
                        UpdateStatusView updateStatusView3 = UpdateStatusView.this;
                        if (!updateStatusView3.f78825w2 && updateStatusView3.m85899XP() && (quickPickerView = UpdateStatusView.this.f78716V0) != null && !quickPickerView.m71233SM()) {
                            return true;
                        }
                    }
                    return false;
                case 3:
                    UpdateStatusView updateStatusView4 = UpdateStatusView.this;
                    QuickPickerView quickPickerView2 = updateStatusView4.f78716V0;
                    if (quickPickerView2 == null || updateStatusView4.f78712U0 || ((m71254ZL = quickPickerView2.m71254ZL()) != 100 && m71254ZL != 101 && m71254ZL != 106)) {
                        return false;
                    }
                    return super.mo66900a(c28212v6);
                default:
                    C26209i mo66903h = mo66903h(c28212v6.f131577c);
                    if (UpdateStatusView.this.f78825w2 || mo66903h == null || (view = mo66903h.f124546a) == null || !view.isEnabled()) {
                        return false;
                    }
                    return super.mo66900a(c28212v6);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:            if (r8.f78685M3 == false) goto L143;     */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[Catch: Exception -> 0x000d, TRY_LEAVE, TryCatch #0 {Exception -> 0x000d, blocks: (B:70:0x0002, B:72:0x0006, B:74:0x000a, B:5:0x0015, B:7:0x001b, B:10:0x0022, B:24:0x009e, B:33:0x005d, B:35:0x0065, B:37:0x0069, B:39:0x006f, B:43:0x0078, B:45:0x007c, B:47:0x0080, B:50:0x0087, B:53:0x008e, B:55:0x0092, B:57:0x0098, B:59:0x0037, B:62:0x0041, B:65:0x004b), top: B:69:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x004b A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:70:0x0002, B:72:0x0006, B:74:0x000a, B:5:0x0015, B:7:0x001b, B:10:0x0022, B:24:0x009e, B:33:0x005d, B:35:0x0065, B:37:0x0069, B:39:0x006f, B:43:0x0078, B:45:0x007c, B:47:0x0080, B:50:0x0087, B:53:0x008e, B:55:0x0092, B:57:0x0098, B:59:0x0037, B:62:0x0041, B:65:0x004b), top: B:69:0x0002 }] */
        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo74255b(C26209i c26209i, String str, C28212v6 c28212v6) {
            View view;
            RedDotImageButton redDotImageButton;
            boolean z11;
            int hashCode;
            char c11;
            View view2;
            if (c26209i != null) {
                try {
                    view = c26209i.f124546a;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (view != null && (view instanceof RedDotImageButton)) {
                    redDotImageButton = (RedDotImageButton) view;
                    boolean z12 = false;
                    int i11 = 0;
                    if (c28212v6 == null && c28212v6.m142167f() && c28212v6.f131580f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hashCode = str.hashCode();
                    if (hashCode == -698998559) {
                        if (hashCode != 205094155) {
                            if (hashCode == 1504448718 && str.equals("tip.formpost.music")) {
                                c11 = 2;
                                if (c11 == 0) {
                                    if (c11 != 1) {
                                        if (c11 == 2) {
                                            UpdateStatusView.this.m85800vS(z11, str);
                                        }
                                    } else {
                                        if (c28212v6 != null && c28212v6.f131575a == 1) {
                                            UpdateStatusView updateStatusView = UpdateStatusView.this;
                                            if (!updateStatusView.f78835y4 && !updateStatusView.m85899XP()) {
                                                z11 = false;
                                            }
                                        }
                                        if (c26209i != null && (view2 = c26209i.f124546a) != null && (view2 instanceof CustomSwitch)) {
                                            CustomSwitch customSwitch = (CustomSwitch) view2;
                                            if (!z11) {
                                                i11 = 8;
                                            }
                                            customSwitch.setVisibilityReddot(i11);
                                        }
                                    }
                                } else if (c28212v6 != null && c28212v6.f131575a == 1) {
                                    UpdateStatusView updateStatusView2 = UpdateStatusView.this;
                                    if (!updateStatusView2.f78831x4) {
                                    }
                                }
                                z12 = z11;
                                if (redDotImageButton == null) {
                                    redDotImageButton.setEnableNoti(z12);
                                    return;
                                }
                                return;
                            }
                            c11 = 65535;
                            if (c11 == 0) {
                            }
                            z12 = z11;
                            if (redDotImageButton == null) {
                            }
                        } else {
                            if (str.equals("tip.postfeed.background")) {
                                c11 = 1;
                                if (c11 == 0) {
                                }
                                z12 = z11;
                                if (redDotImageButton == null) {
                                }
                            }
                            c11 = 65535;
                            if (c11 == 0) {
                            }
                            z12 = z11;
                            if (redDotImageButton == null) {
                            }
                        }
                    } else {
                        if (str.equals("tip.postfeed.typo")) {
                            c11 = 0;
                            if (c11 == 0) {
                            }
                            z12 = z11;
                            if (redDotImageButton == null) {
                            }
                        }
                        c11 = 65535;
                        if (c11 == 0) {
                        }
                        z12 = z11;
                        if (redDotImageButton == null) {
                        }
                    }
                    e11.printStackTrace();
                }
            }
            redDotImageButton = null;
            boolean z122 = false;
            int i112 = 0;
            if (c28212v6 == null) {
            }
            z11 = false;
            hashCode = str.hashCode();
            if (hashCode == -698998559) {
            }
            e11.printStackTrace();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: c */
        public void mo74715c(String str, C28212v6 c28212v6, C25297f c25297f) {
            str.hashCode();
            if (str.equals("tip.formpost.music")) {
                c25297f.m130918X(UpdateStatusView.this.m85670JO());
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: d */
        public void mo66901d(String str, C28212v6 c28212v6, C26203c c26203c) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1326231349:
                    if (str.equals("tip.postfeed.privacy")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -699252329:
                    if (str.equals("tip.postfeed.link")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -698998559:
                    if (str.equals("tip.postfeed.typo")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -192760194:
                    if (str.equals("tip.postfeed.video")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 205094155:
                    if (str.equals("tip.postfeed.background")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1392981632:
                    if (str.equals("tip.postfeed.sticker")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1516974271:
                    if (str.equals("tip.postfeed.friendtag")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 2063294850:
                    if (str.equals("tip.postfeed.camera")) {
                        c11 = 7;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    c26203c.f124513d = AbstractC23136l9.m118742r(24.0f);
                    break;
                case 1:
                case 5:
                case 6:
                case 7:
                    c26203c.f124513d = -AbstractC23136l9.m118742r(4.0f);
                    break;
                case 2:
                    c26203c.f124507D = EnumC26202b.TOP;
                    break;
                case 3:
                    c26203c.f124513d = -AbstractC23136l9.m118742r(4.0f);
                    break;
                case 4:
                    c26203c.f124513d = AbstractC23136l9.m118742r(4.0f);
                    break;
            }
            if (TextUtils.equals("tip.postfeed.camera", str) && c28212v6 != null && c28212v6.f131590p == 1) {
                c26203c.f124506C = true;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130859p;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1326231349:
                    if (str.equals("tip.postfeed.privacy")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -699252329:
                    if (str.equals("tip.postfeed.link")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -698998559:
                    if (str.equals("tip.postfeed.typo")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -192760194:
                    if (str.equals("tip.postfeed.video")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 205094155:
                    if (str.equals("tip.postfeed.background")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1392981632:
                    if (str.equals("tip.postfeed.sticker")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1504448718:
                    if (str.equals("tip.formpost.music")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 1516974271:
                    if (str.equals("tip.postfeed.friendtag")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2063294850:
                    if (str.equals("tip.postfeed.camera")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            View view = null;
            switch (c11) {
                case 0:
                    return new C26209i(UpdateStatusView.this.f78715U3);
                case 1:
                    return new C26209i(UpdateStatusView.this.f78697Q1);
                case 2:
                    return new C26209i(UpdateStatusView.this.f78765h2);
                case 3:
                    return new C26209i(UpdateStatusView.this.f78659E1);
                case 4:
                    return new C26209i(UpdateStatusView.this.f78711T3);
                case 5:
                    return new C26209i(UpdateStatusView.this.f78680L1);
                case 6:
                    View m85815zO = UpdateStatusView.this.m85815zO(str);
                    if (m85815zO == null) {
                        return null;
                    }
                    return new C26209i(m85815zO);
                case 7:
                    return new C26209i(UpdateStatusView.this.f78732Z0);
                case '\b':
                    QuickPickerView quickPickerView = UpdateStatusView.this.f78716V0;
                    if (quickPickerView != null) {
                        view = quickPickerView.m71267fM();
                    }
                    return new C26209i(view);
                default:
                    return null;
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            boolean z11;
            QuickPickerView quickPickerView = UpdateStatusView.this.f78716V0;
            if (quickPickerView != null && quickPickerView.m71255ZM()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!UpdateStatusView.this.f72421L0.m92672lJ() || !UpdateStatusView.this.f72421L0.m92687sJ() || z11 || UpdateStatusView.this.f78726X2) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: j */
        public boolean mo74718j(String str) {
            if (TextUtils.equals("tip.postfeed.typo", str)) {
                UpdateStatusView.this.f78831x4 = false;
                C31845ac.m152996J().m153054l();
                return false;
            }
            if (TextUtils.equals("tip.postfeed.background", str)) {
                UpdateStatusView.this.f78835y4 = false;
                C31845ac.m152996J().m153053k();
                return false;
            }
            return super.mo74718j(str);
        }
    }

    static {
        int i11;
        if (AbstractC23136l9.m118654H0(MainApplication.getAppContext())) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        f78643E4 = i11;
    }

    public UpdateStatusView() {
        C31890dc m153044X = C31845ac.m152996J().m153044X();
        this.f78670H3 = m153044X;
        this.f78673I3 = m153044X;
        this.f78676J3 = true;
        this.f78679K3 = false;
        this.f78682L3 = 0;
        this.f78685M3 = false;
        this.f78688N3 = false;
        this.f78691O3 = EnumC15263k0.OFF;
        this.f78695P3 = new AtomicInteger();
        this.f78699Q3 = AbstractC23136l9.m118742r(32.0f);
        this.f78727X3 = true;
        this.f78731Y3 = false;
        this.f78735Z3 = true;
        this.f78739a4 = new C15266m();
        this.f78743b4 = null;
        this.f78751d4 = new SparseIntArray();
        this.f78755e4 = new SparseIntArray();
        this.f78763g4 = new RunnableC15270p();
        this.f78767h4 = EnumC15265l0.STATE_MAX_SIZE;
        this.f78771i4 = false;
        this.f78775j4 = false;
        this.f78779k4 = false;
        this.f78783l4 = null;
        this.f78791n4 = new C15273s();
        this.f78795o4 = 0;
        this.f78799p4 = new RunnableC15274t();
        this.f78803q4 = 0;
        this.f78811s4 = true;
        this.f78815t4 = new RunnableC15275u();
        this.f78819u4 = -1;
        this.f78823v4 = new C15277w();
        this.f78827w4 = new ArrayList();
        this.f78831x4 = false;
        this.f78835y4 = false;
        this.f78647A4 = new C15280z();
        this.f78651B4 = new C15243a0();
        this.f78655C4 = new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.jx0
            public /* synthetic */ jx0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateStatusView.this.m85658FQ(view);
            }
        };
    }

    /* renamed from: A4 */
    private void m85642A4() {
        int i11;
        Bundle bundle = new Bundle();
        if (this.f78662F1 != null) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        bundle.putInt("media_type", i11);
        bundle.putParcelableArrayList("medialist", this.f78796p1);
        bundle.putSerializable("videoinfo", this.f78662F1);
        bundle.putString("desc", m85875SO());
        bundle.putParcelable("privacy", this.f78744c1);
        bundle.putInt("mode", 0);
        bundle.putParcelableArrayList("extra_external_photos", m85653DO());
        bundle.putString("extra_entry_point_flow", C32002l4.m154267j(this.f78809s2).m154272b(this.f78813t2).m154277l());
        m92662fJ().m93066i2(ProfileAlbumCreateView.class, bundle, 1024, 1, true);
    }

    /* renamed from: AQ */
    public /* synthetic */ void m85645AQ(boolean z11) {
        C0708i c0708i = new C0708i();
        c0708i.m1072c("mode_background", !z11 ? 1 : 0);
        C0732w.Companion.m1189a().m1187q("click_button_compose_mode", "", c0708i, null);
        if (z11 && !m85914bQ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_applied_bg_feed));
            this.f78711T3.m75655j(false, false);
        } else if (z11) {
            m85889US(true, false);
            this.f78771i4 = false;
        } else {
            m85893VS(false, false);
        }
    }

    /* renamed from: BQ */
    public /* synthetic */ void m85648BQ(View view, boolean z11) {
        try {
            C13306b c13306b = this.f78839z4;
            if (c13306b != null) {
                c13306b.m74689E("tip.postfeed.background");
            }
            if (z11) {
                AbstractC23647d.m123897g("13602");
            } else {
                AbstractC23647d.m123897g("13601");
            }
            AbstractC23309i.m122174mk(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CQ */
    public /* synthetic */ void m85651CQ(int[] iArr, int i11, AtomicBoolean atomicBoolean) {
        this.f78816u1.getLocationOnScreen(iArr);
        int measuredHeight = iArr[1] + this.f78816u1.getMeasuredHeight();
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
        if (selectMultiPhotoLayoutBottomSheet != null && selectMultiPhotoLayoutBottomSheet.m45943TL()) {
            if (i11 - this.f78770i3.m90512bL() <= measuredHeight && this.f78770i3.m45943TL()) {
                atomicBoolean.set(true);
            } else {
                atomicBoolean.set(false);
            }
        }
    }

    /* renamed from: DO */
    private ArrayList m85653DO() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f78833y2;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && mediaItem.m41173u0()) {
                    arrayList.add(mediaItem);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: DQ */
    public /* synthetic */ boolean m85654DQ(AtomicBoolean atomicBoolean, View view, MotionEvent motionEvent) {
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet;
        if (atomicBoolean.get() && (selectMultiPhotoLayoutBottomSheet = this.f78770i3) != null && selectMultiPhotoLayoutBottomSheet.m45943TL() && motionEvent.getAction() == 1) {
            m85713XN();
            return false;
        }
        return false;
    }

    /* renamed from: EQ */
    public /* synthetic */ void m85656EQ() {
        StatusComposeEditText statusComposeEditText = this.f78756f1;
        if (statusComposeEditText != null && statusComposeEditText.getLineCount() > 2) {
            int lineCount = (this.f78756f1.getLineCount() - 2) * this.f78756f1.getLineHeight();
            ScrollView scrollView = this.f78728Y0;
            if (scrollView != null && scrollView.getScrollY() < lineCount) {
                this.f78728Y0.smoothScrollTo(0, lineCount);
            }
        }
    }

    /* renamed from: FQ */
    public /* synthetic */ void m85658FQ(View view) {
        if (m85710WP()) {
            this.f78818u3++;
            m85817zR();
        }
    }

    /* renamed from: GO */
    private QuickPickerView.InterfaceC12659u m85660GO() {
        return new C15253f0();
    }

    /* renamed from: GQ */
    public /* synthetic */ void m85661GQ() {
        try {
            if (m85899XP()) {
                m85916cO(false);
                m85938iS();
            } else {
                this.f78667G3 = true;
                m85889US(true, false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: GR */
    public void m85662GR(int i11, int i12, boolean z11) {
        StatusComposeEditText statusComposeEditText;
        CharSequence coerceToText;
        boolean z12;
        int i13;
        if (!AbstractC20826v0.m108837u()) {
            return;
        }
        try {
            ClipData m15b = new C0012a((ClipboardManager) m92686rK().getSystemService("clipboard"), new SensitiveData("clipboard_paste_text_post_feed", "social_timeline")).m15b();
            if (m15b != null && (statusComposeEditText = this.f78756f1) != null && statusComposeEditText.getText() != null) {
                boolean z13 = false;
                for (int i14 = 0; i14 < m15b.getItemCount(); i14++) {
                    if (z11) {
                        coerceToText = m15b.getItemAt(i14).coerceToStyledText(getContext());
                    } else {
                        coerceToText = m15b.getItemAt(i14).coerceToText(getContext());
                        if (coerceToText instanceof Spanned) {
                            coerceToText = coerceToText.toString();
                        }
                    }
                    if (coerceToText != null) {
                        String str = "";
                        StringBuilder sb2 = new StringBuilder();
                        if (!z13) {
                            i13 = Math.max(i11, 0);
                            sb2.append(coerceToText);
                            z12 = true;
                        } else {
                            int max = Math.max(0, this.f78756f1.getSelectionEnd());
                            sb2.append("\n");
                            sb2.append(coerceToText);
                            z12 = z13;
                            i13 = max;
                            str = "\n";
                        }
                        int min = Math.min(sb2.toString().length() + i13, this.f78756f1.getText().length());
                        this.f78756f1.setSelection(min);
                        String queryParameter = Uri.parse(coerceToText.toString()).getQueryParameter("title");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f78756f1.getText().replace(i13, min, str + queryParameter);
                        }
                        z13 = z12;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HQ */
    public /* synthetic */ void m85664HQ() {
        try {
            if (!m85899XP()) {
                this.f78667G3 = true;
                m85889US(true, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IN */
    private void m85666IN() {
        try {
            if (this.f78683M1 == null) {
                return;
            }
            this.f78686N1.setVisibility(0);
            C2971f1 c2971f1 = new C2971f1();
            c2971f1.m14060g("UPDATE_STATUS_");
            c2971f1.m14061h(String.valueOf(System.currentTimeMillis()));
            c2971f1.m14059f(this.f78683M1);
            C20820s0.m108740n(this.f78693P1, c2971f1, this.f78720W0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IQ */
    public /* synthetic */ void m85667IQ(int i11, int i12, Intent intent) {
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            quickPickerView.onActivityResult(i11, i12, intent);
        }
    }

    /* renamed from: IR */
    public void m85668IR() {
        if (!m85891VP()) {
            m85713XN();
        }
    }

    /* renamed from: JO */
    public EnumC25294c m85670JO() {
        if (this.f78644A1.isShown()) {
            return EnumC25294c.BOTTOM;
        }
        if (this.f78732Z0.isShown()) {
            return EnumC25294c.TOP;
        }
        return EnumC25294c.BOTTOM;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.nx0.<init>(com.zing.zalo.ui.zviews.UpdateStatusView, int[], int, java.util.concurrent.atomic.AtomicBoolean):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: JP */
    private void m85671JP() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            android.widget.ScrollView r1 = r5.f78728Y0
            if (r1 == 0) goto L37
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            if (r1 == 0) goto L37
            android.widget.Button r1 = r5.f78816u1
            if (r1 == 0) goto L37
            android.content.Context r1 = r5.m92689tK()
            int r1 = me0.AbstractC23136l9.m118716i0(r1)
            r2 = 2
            int[] r2 = new int[r2]
            android.widget.ScrollView r3 = r5.f78728Y0
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            com.zing.zalo.ui.zviews.nx0 r4 = new com.zing.zalo.ui.zviews.nx0
            r4.<init>()
            r3.addOnScrollChangedListener(r4)
            android.widget.ScrollView r1 = r5.f78728Y0
            com.zing.zalo.ui.zviews.yx0 r2 = new com.zing.zalo.ui.zviews.yx0
            r2.<init>()
            r1.setOnTouchListener(r2)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.UpdateStatusView.m85671JP():void");
    }

    /* renamed from: JQ */
    public /* synthetic */ void m85672JQ(View view) {
        AbstractC2379w.m12430d(this.f78756f1);
        mo79421pR();
    }

    /* renamed from: KQ */
    public /* synthetic */ void m85674KQ(Bundle bundle) {
        ArrayList arrayList = this.f78796p1;
        if (arrayList != null) {
            arrayList.clear();
        } else {
            this.f78796p1 = new ArrayList();
        }
        m85989zP(bundle, null);
        ArrayList arrayList2 = this.f78833y2;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.f78796p1.addAll(this.f78833y2);
            this.f78833y2.clear();
        }
        m85941jR();
        m85877SR();
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            quickPickerView.m71216JO(new ArrayList(this.f78796p1), new ArrayList());
        }
        m85681NN(bundle);
    }

    /* renamed from: LN */
    public void m85676LN() {
        int i11;
        if (this.f78826w3) {
            ArrayList arrayList = this.f78796p1;
            if (arrayList != null) {
                i11 = arrayList.size();
            } else {
                i11 = 0;
            }
            int i12 = i11 - this.f78830x3;
            C0708i c0708i = new C0708i();
            if (i12 <= 0) {
                i12 = 0;
            }
            c0708i.m1072c("insert_photo", i12);
            c0708i.m1072c("total_photo", i11);
            C0732w.Companion.m1189a().m1187q("gallery_expand_full_fpf", "", c0708i, null);
            this.f78826w3 = false;
            this.f78830x3 = 0;
        }
    }

    /* renamed from: LQ */
    public /* synthetic */ void m85677LQ(View view) {
        ShowcaseView showcaseView = this.f78839z4.f68386f;
        if (showcaseView != null && showcaseView.isShown() && TextUtils.equals(this.f78839z4.f68386f.getShowcaseId(), "tip.postfeed.privacy")) {
            this.f78839z4.m74702j("tip.postfeed.privacy");
            this.f78839z4.m74689E("tip.postfeed.privacy");
        }
        mo79425yR();
    }

    /* renamed from: MQ */
    public /* synthetic */ void m85679MQ(String str) {
        if (!TextUtils.isEmpty(str) && m85910aQ() && AbstractC0924m0.m3191K9()) {
            AbstractC0924m0.m2908Ag(false);
            AbstractC28207v1.m141984g3("action.open.zinstantview", 0, this.f72421L0.m92676n2(), this.f72421L0, str, null, null);
        }
    }

    /* renamed from: NN */
    private void m85681NN(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("EXTRA_CREATE_ALBUM_ITEM")) {
            this.f78783l4 = (ProfilePreviewAlbumItem) bundle.getParcelable("EXTRA_CREATE_ALBUM_ITEM");
            m85795uT();
            if (m85957oP() && !TextUtils.isEmpty(this.f78783l4.getDesc()) && TextUtils.isEmpty(m85875SO())) {
                String desc = this.f78783l4.getDesc();
                m85861MR(desc.substring(0, Math.min(desc.length(), f78642D4)));
            }
            mo79401bT();
            m85967qT();
            mo79403eT();
            mo79398SN();
            mo79419nT();
            m85948lT();
            m85974sT();
            m85942jT();
            m85713XN();
        }
        if (bundle.containsKey("EXTRA_PRIVACY_UPDATE")) {
            this.f78744c1 = (PrivacyInfo) bundle.getParcelable("EXTRA_PRIVACY_UPDATE");
        }
        boolean z11 = bundle.getBoolean("EXTRA_AUTO_ADD_PHOTO_TO_ALBUM", false);
        this.f78742b3 = z11;
        if (z11 && bundle.containsKey("extra_initial_photos")) {
            mo46829Y();
            AbstractC23136l9.m118744r1(this.f78708T0.findViewById(AbstractC6918a0.overlay_auto_post_album), 0);
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.by0

                /* renamed from: q */
                public final /* synthetic */ Bundle f79971q;

                public /* synthetic */ by0(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.this.m85738fQ(r2);
                }
            }, 500L);
        }
    }

    /* renamed from: NP */
    public void m85682NP() {
        try {
            this.f78704S0.m141598a();
        } catch (Exception e11) {
            e11.printStackTrace();
            m85743gR();
        }
    }

    /* renamed from: NQ */
    public /* synthetic */ void m85683NQ(List list) {
        try {
            m85907ZS("begin refresh UI: ");
            m85877SR();
            if (!m85950mP()) {
                this.f78752e1 = false;
                if (list.size() > 0 && this.f72421L0.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_photos_selected_not_exist));
                }
            }
            m85907ZS("end refresh UI: ");
        } catch (Exception e11) {
            m85907ZS("fail refresh UI: " + e11.getMessage());
            e11.printStackTrace();
        }
    }

    /* renamed from: NS */
    private void m85684NS() {
        this.f78802q3 = 1;
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
        if (selectMultiPhotoLayoutBottomSheet != null) {
            selectMultiPhotoLayoutBottomSheet.m45946YL();
        }
    }

    /* renamed from: ON */
    private void m85686ON(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("EXTRA_SONG_ID")) {
            String string = bundle.getString("EXTRA_SONG_ID", "");
            if (!string.isEmpty()) {
                this.f78766h3.m104604C0(string);
            }
        }
        if (bundle.containsKey("EXTRA_PARAM_CATE_FOCUS")) {
            this.f78750d3 = bundle.getInt("EXTRA_PARAM_CATE_FOCUS", -1);
        }
    }

    /* renamed from: OQ */
    public /* synthetic */ void m85687OQ() {
        m85964qO(new Runnable() { // from class: com.zing.zalo.ui.zviews.my0

            /* renamed from: q */
            public final /* synthetic */ List f81282q;

            public /* synthetic */ my0(List list) {
                r2 = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85683NQ(r2);
            }
        });
        if (m85950mP()) {
            mo79413lO();
        } else {
            mo78960q3();
        }
    }

    /* renamed from: PO */
    private String[] m85689PO() {
        return new String[]{"tip.formpost.music"};
    }

    /* renamed from: PQ */
    public /* synthetic */ void m85690PQ(float f11) {
        ScrollView scrollView = this.f78728Y0;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, m85851KO(f11));
        }
    }

    /* renamed from: QN */
    public void m85692QN() {
        C13306b c13306b = this.f78839z4;
        if (c13306b != null && this.f78706S2) {
            c13306b.m74700f("tip.formpost.music", Boolean.TRUE);
            this.f78839z4.m74698d("tip.formpost.music");
        }
    }

    /* renamed from: QS */
    public void m85694QS() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unavailable_lyric));
    }

    /* renamed from: RN */
    private void m85696RN(long j11) {
        Handler handler = this.f78710T2;
        if (handler != null) {
            handler.removeMessages(3);
            this.f78710T2.sendEmptyMessageDelayed(3, j11);
        }
    }

    /* renamed from: RO */
    private int m85697RO() {
        if (m85899XP()) {
            if (m85950mP()) {
                if (m85845IO() == 1) {
                    return 2;
                }
                return 3;
            }
            if (m85965qP()) {
                return 6;
            }
            if (m85943kP()) {
                return 7;
            }
            if (m85969rP()) {
                return 17;
            }
        }
        return 1;
    }

    /* renamed from: RP */
    private boolean m85698RP() {
        return this.f78774j3 == 0;
    }

    /* renamed from: RQ */
    public /* synthetic */ void m85699RQ(int i11) {
        C27477e c27477e = this.f78684M2;
        if (c27477e != null) {
            c27477e.m140544Y(i11, this.f78678K2, this.f78681L2, true);
        }
    }

    /* renamed from: UQ */
    public /* synthetic */ void m85705UQ() {
        AbstractC23136l9.m118693a1(this.f78786m3, AbstractC16803z.bg_music_feed_item_overlay);
    }

    /* renamed from: VO */
    private void m85707VO() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_sticker_deleted));
        this.f78683M1 = null;
        FeedStickerView feedStickerView = this.f78693P1;
        if (feedStickerView != null) {
            feedStickerView.m56563l();
        }
        m85897WS(0);
        m85921dO(4, false);
        this.f78752e1 = false;
    }

    /* renamed from: VQ */
    public /* synthetic */ void m85708VQ(InterfaceC17463d interfaceC17463d, int i11) {
        C26761p.m137741q().m137755H();
        mo79421pR();
        interfaceC17463d.dismiss();
    }

    /* renamed from: WP */
    public boolean m85710WP() {
        if (m85891VP() && !m85698RP()) {
            return true;
        }
        return false;
    }

    /* renamed from: XN */
    public void m85713XN() {
        this.f78802q3 = 0;
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
        if (selectMultiPhotoLayoutBottomSheet != null) {
            selectMultiPhotoLayoutBottomSheet.close();
        }
    }

    /* renamed from: XQ */
    public /* synthetic */ void m85714XQ(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C8009j c8009j;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_remove_location_tag) {
            this.f78745c2 = null;
            m85853KR();
        } else if (intValue == AbstractC8020f0.str_continue_edit && (c8009j = this.f78787m4) != null) {
            c8009j.dismiss();
        }
    }

    /* renamed from: XS */
    private void m85715XS() {
        ArrayList arrayList = this.f78833y2;
        if (arrayList != null && arrayList.size() > 0) {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null && quickPickerView.m71243VM(this.f78833y2)) {
                this.f78833y2.clear();
                m85941jR();
                return;
            }
            m85941jR();
            Iterator it = this.f78833y2.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && mediaItem.m41173u0()) {
                    this.f78796p1.add(mediaItem);
                }
            }
        }
    }

    /* renamed from: YN */
    private void m85717YN(GlowingReddot glowingReddot) {
        glowingReddot.m44424c(AbstractC23136l9.m118742r(10.0f), Color.parseColor("#ff565d"), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
        glowingReddot.setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
        glowingReddot.setTopLayerColor(Color.parseColor("#ff565d"));
        glowingReddot.setBottomLayerSize(AbstractC23136l9.m118742r(8.0f));
        glowingReddot.setBottomLayerColor(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
    }

    /* renamed from: YQ */
    public /* synthetic */ void m85718YQ(InterfaceC17463d interfaceC17463d) {
        if (this.f78787m4 == interfaceC17463d) {
            this.f78787m4 = null;
        }
    }

    /* renamed from: YR */
    private void m85719YR(int i11) {
        boolean z11;
        C19587j c19587j = C19587j.f97307a;
        boolean mo102470m = c19587j.m102530f(i11).mo102470m();
        if (c19587j.m102530f(i11).mo102468k() && m85891VP()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m85961pP()) {
            m85785sS(mo102470m);
            m85791uO(mo102470m, i11);
        } else {
            m85785sS(z11);
            m85791uO(z11, i11);
        }
    }

    /* renamed from: ZQ */
    public /* synthetic */ void m85721ZQ() {
        try {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71295yO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aR */
    public /* synthetic */ void m85723aR() {
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        try {
            View findViewById = this.f78728Y0.findViewById(AbstractC6918a0.ll_preview_post_feed);
            if (this.f78765h2.getVisibility() == 0) {
                i11 = this.f78820v1.getMeasuredHeight();
            } else {
                i11 = 0;
            }
            if (this.f78732Z0.getVisibility() == 0) {
                i12 = this.f78732Z0.getMeasuredHeight();
            } else {
                i12 = 0;
            }
            int i16 = i12 + i11 + AbstractC23222t7.f112552c;
            SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
            if (selectMultiPhotoLayoutBottomSheet != null && selectMultiPhotoLayoutBottomSheet.m45943TL() && !this.f78712U0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i13 = this.f78770i3.m90514dL();
            } else {
                i13 = 0;
            }
            if (z11) {
                i14 = this.f78770i3.m45938ML();
            } else {
                i14 = 0;
            }
            if (z11) {
                i15 = this.f78690O2.getHeight();
            } else {
                i15 = 0;
            }
            if (z11) {
                findViewById.setPadding(0, 0, 0, (((i13 - i14) - i15) + i16) - i11);
            } else {
                findViewById.setPadding(0, 0, 0, i16);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: aT */
    public void m85724aT() {
        this.f78814t3++;
        if (this.f78802q3 == 0) {
            m85817zR();
        } else {
            this.f78822v3++;
            m85713XN();
        }
    }

    /* renamed from: bR */
    public /* synthetic */ void m85726bR(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 < this.f78796p1.size()) {
            ((MediaItem) this.f78796p1.get(i11)).m41155l1(i12);
            ((MediaItem) this.f78796p1.get(i11)).m41151j1(i13);
        }
    }

    /* renamed from: cR */
    public /* synthetic */ void m85728cR(View view) {
        m85832ES(4, true);
    }

    /* renamed from: dQ */
    public /* synthetic */ void m85730dQ(int i11, String str, C31890dc c31890dc) {
        try {
            if (i11 == 0 && c31890dc != null) {
                m85928fS(c31890dc, true);
            } else {
                m85924eS(false, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dR */
    public /* synthetic */ void m85731dR(int i11, View view) {
        if (this.f78712U0) {
            AbstractC2379w.m12430d(this.f78756f1);
        }
        m85973sR((MediaItem) this.f78796p1.get(i11), new ViewAnimationTarget(view), null, i11, 0.0f);
    }

    /* renamed from: dS */
    private void m85732dS(int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f78816u1.getLayoutParams();
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
                    layoutParams2.addRule(8, this.f78812t1.getId());
                    this.f78782l3.setLayoutParams(layoutParams2);
                    this.f78782l3.invalidate();
                    C19587j c19587j = C19587j.f97307a;
                    int mo102462e = c19587j.m102530f(this.f78774j3).mo102462e();
                    int mo102464g = c19587j.m102530f(this.f78774j3).mo102464g();
                    this.f78804r1.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()) - AbstractC23136l9.m118742r(mo102462e * 2.0f));
                    float f11 = mo102464g;
                    this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(f11), 0, AbstractC23136l9.m118742r(f11));
                    int m118742r = AbstractC23136l9.m118742r(12.0f);
                    layoutParams.leftMargin = m118742r;
                    layoutParams.rightMargin = m118742r;
                    return;
                }
                return;
            }
            C19587j c19587j2 = C19587j.f97307a;
            int mo102462e2 = c19587j2.m102530f(this.f78774j3).mo102462e();
            int mo102464g2 = c19587j2.m102530f(this.f78774j3).mo102464g();
            this.f78804r1.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()) - AbstractC23136l9.m118742r(mo102462e2 * 2.0f));
            if (m85961pP()) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
                layoutParams3.addRule(8, this.f78790n3.getId());
                this.f78782l3.setLayoutParams(layoutParams3);
                this.f78782l3.invalidate();
                float f12 = mo102464g2;
                this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(f12), 0, AbstractC23136l9.m118742r(f12));
            } else {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
                layoutParams4.addRule(8, this.f78812t1.getId());
                this.f78782l3.setLayoutParams(layoutParams4);
                this.f78782l3.invalidate();
                float f13 = mo102464g2;
                this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(f13), 0, AbstractC23136l9.m118742r(f13));
            }
            int m118742r2 = AbstractC23136l9.m118742r(12.0f);
            layoutParams.leftMargin = m118742r2;
            layoutParams.rightMargin = m118742r2;
            this.f78790n3.setBackgroundColor(0);
            return;
        }
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left) + AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);
        if (m85957oP()) {
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
            layoutParams5.addRule(8, this.f78812t1.getId());
            this.f78782l3.setLayoutParams(layoutParams5);
            this.f78782l3.invalidate();
            this.f78804r1.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()) - (m118655I / 2));
            this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(4.0f), 0, 0);
            int m118742r3 = AbstractC23136l9.m118742r(8.0f);
            layoutParams.leftMargin = m118742r3;
            layoutParams.rightMargin = m118742r3;
        } else if (m85961pP()) {
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
            layoutParams6.addRule(8, this.f78790n3.getId());
            this.f78782l3.setLayoutParams(layoutParams6);
            this.f78782l3.invalidate();
            this.f78804r1.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()) - (m118655I / 2));
            this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(16.0f));
            int m118742r4 = AbstractC23136l9.m118742r(16.0f);
            layoutParams.leftMargin = m118742r4;
            layoutParams.rightMargin = m118742r4;
        } else {
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) this.f78782l3.getLayoutParams();
            layoutParams7.addRule(8, this.f78812t1.getId());
            this.f78782l3.setLayoutParams(layoutParams7);
            this.f78782l3.invalidate();
            this.f78804r1.setWidth(AbstractC23136l9.m118725l0(this.f72421L0.getContext()) - m118655I);
            this.f78812t1.setPadding(0, AbstractC23136l9.m118742r(12.0f), 0, 0);
            int m118742r5 = AbstractC23136l9.m118742r(16.0f);
            layoutParams.leftMargin = m118742r5;
            layoutParams.rightMargin = m118742r5;
        }
        this.f78790n3.setBackgroundColor(0);
    }

    /* renamed from: dT */
    public void m85733dT() {
        this.f78724X0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hx0
            public /* synthetic */ hx0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85723aR();
            }
        });
    }

    /* renamed from: eQ */
    public /* synthetic */ void m85735eQ() {
        AbstractC20276f.m105890c(this.f78711T3, null);
    }

    /* renamed from: eR */
    public /* synthetic */ void m85736eR(int i11, View view) {
        try {
            MediaItem mediaItem = (MediaItem) this.f78796p1.get(i11);
            if (this.f78796p1.contains(mediaItem)) {
                this.f78796p1.remove(mediaItem);
                mediaItem.m41140d1(false);
                QuickPickerView quickPickerView = this.f78716V0;
                if (quickPickerView != null) {
                    quickPickerView.m71209FN(mediaItem);
                }
            }
            ArrayList arrayList = this.f78833y2;
            if (arrayList != null && arrayList.contains(mediaItem)) {
                this.f78833y2.remove(mediaItem);
                m85941jR();
            }
            m85877SR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fQ */
    public /* synthetic */ void m85738fQ(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("extra_initial_photos");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                ((MediaItem) it.next()).m41140d1(true);
            }
            m85903YS(parcelableArrayList);
        }
        mo79421pR();
    }

    /* renamed from: fR */
    public /* synthetic */ void m85739fR(C3000l0 c3000l0) {
        mo78960q3();
        if (m85887UP(c3000l0)) {
            m85907ZS("end saveAsyncFeed: dismissed loading view");
        }
        FeedActionZUtils.m47534V(this.f72421L0.m92648SI(), this.f78657D2, 1, 0);
        this.f78738a3 = true;
        if (this.f78653C2) {
            C20834z0.f102412a.m108927f(true);
            if (this.f72421L0.m92676n2() instanceof Activity) {
                AbstractC23136l9.m118678T0((Activity) this.f72421L0.m92676n2());
            }
            this.f72421L0.finish();
            return;
        }
        if (this.f78649B2) {
            m85829DS(18);
        } else {
            m85975tO(c3000l0.f11895q);
            this.f78766h3.m104646z0();
        }
    }

    /* renamed from: gQ */
    public /* synthetic */ void m85742gQ() {
        try {
            m85883Tr();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gR */
    public void m85743gR() {
        try {
            C2953b3 c2953b3 = AbstractC23304d.f113416n2;
            if (c2953b3 == null && c2953b3 == null) {
                AbstractC23304d.m120550u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: hQ */
    public /* synthetic */ void m85746hQ(int i11) {
        try {
            if (i11 == 58) {
                m85951mR();
                this.f78831x4 = true;
                C13306b c13306b = this.f78839z4;
                if (c13306b != null) {
                    c13306b.m74714z("tip.postfeed.typo", 0);
                    return;
                }
                return;
            }
            if (i11 == 88) {
                this.f78835y4 = true;
                C13306b c13306b2 = this.f78839z4;
                if (c13306b2 != null) {
                    c13306b2.m74714z("tip.postfeed.background", 0);
                }
                this.f78710T2.sendEmptyMessage(1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: hT */
    private void m85747hT(List list, List list2) {
        if (list != null && list2 != null) {
            ArrayList arrayList = this.f78796p1;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f78796p1 = new ArrayList();
            }
            this.f78796p1.addAll(list);
            ArrayList arrayList2 = this.f78833y2;
            if (arrayList2 != null && arrayList2.size() > 0) {
                m85927fP(this.f78796p1);
                m85941jR();
            }
            m85877SR();
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71216JO(list, list2);
            }
        }
    }

    /* renamed from: iQ */
    public /* synthetic */ void m85750iQ(InterfaceC0765j interfaceC0765j, String str) {
        try {
            interfaceC0765j.mo1793z8(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f78709T1 = false;
            m85954nR(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
        }
    }

    /* renamed from: iR */
    private void m85751iR(int i11) {
        C18049e c18049e = this.f78778k3;
        if (c18049e != null) {
            c18049e.m95931d(i11);
            if (i11 == 1) {
                C18045a c18045a = new C18045a();
                c18045a.m95916d(new C18047c(1, this.f78828x1.m98033l(), this.f78828x1.m98031j(), this.f78828x1.m98032k(), this.f78828x1.m98030i()));
                this.f78778k3.m95930c(c18045a);
            } else {
                if (i11 == 2) {
                    this.f78778k3.m95930c(null);
                    return;
                }
                C18054j mo102469l = C19587j.f97307a.m102530f(i11).mo102469l(this.f78796p1);
                if (mo102469l != null && mo102469l.m95948b() != null && mo102469l.m95947a() != null) {
                    C18054j c18054j = new C18054j(mo102469l.m95948b(), mo102469l.m95947a());
                    C18045a c18045a2 = new C18045a();
                    c18045a2.m95917e(c18054j);
                    c18045a2.m95916d(null);
                    this.f78778k3.m95930c(c18045a2);
                }
            }
        }
    }

    /* renamed from: jQ */
    public /* synthetic */ C24848g0 m85754jQ(Drawable drawable) {
        m85781rS(this.f78782l3, drawable);
        return null;
    }

    /* renamed from: kQ */
    public /* synthetic */ C24848g0 m85757kQ(Drawable drawable) {
        m85781rS(this.f78782l3, drawable);
        return null;
    }

    /* renamed from: kT */
    private void m85758kT() {
        boolean z11;
        CustomSwitch customSwitch = this.f78711T3;
        if (customSwitch != null) {
            if (!m85957oP() && !m85961pP() && !m85710WP()) {
                z11 = true;
            } else {
                z11 = false;
            }
            customSwitch.setEnabled(z11);
        }
    }

    /* renamed from: lQ */
    public /* synthetic */ C24848g0 m85761lQ(Drawable drawable) {
        m85781rS(this.f78782l3, drawable);
        return null;
    }

    /* renamed from: mQ */
    public /* synthetic */ C24848g0 m85764mQ(Drawable drawable) {
        m85781rS(this.f78782l3, drawable);
        return null;
    }

    /* renamed from: nQ */
    public /* synthetic */ void m85767nQ(Intent intent) {
        try {
            if (intent.hasExtra("EXTRA_SELECTED_PHOTOS")) {
                m85747hT(intent.getParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS"), intent.getParcelableArrayListExtra("EXTRA_MODIFIED_PHOTOS"));
                if (!m85891VP()) {
                    m85713XN();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f78696Q0, e11);
        }
    }

    /* renamed from: oQ */
    public /* synthetic */ void m85770oQ(Intent intent) {
        try {
            if (intent.hasExtra("EXTRA_SELECTED_PHOTOS")) {
                m85747hT(intent.getParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS"), new ArrayList());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f78696Q0, e11);
        }
    }

    /* renamed from: pQ */
    public /* synthetic */ void m85773pQ() {
        try {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71284sO(false, new SensitiveData("gallery_post_video_feed", "social_timeline"));
            }
            m85897WS(5);
            m85921dO(5, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qQ */
    public /* synthetic */ void m85776qQ(C19964c c19964c) {
        C20112a.c cVar = (C20112a.c) c19964c.m103749a();
        if (cVar instanceof C20112a.g) {
            mo78936E(((C20112a.g) cVar).m104678a());
        }
        if (cVar instanceof C20112a.e) {
            m85867OS((C20112a.e) cVar);
        }
        if (cVar instanceof C20112a.j) {
            mo79423tT(((C20112a.j) cVar).m104679a());
        }
        if (cVar instanceof C20112a.i) {
            this.f78752e1 = false;
        }
        if (cVar instanceof C20112a.d) {
            m85707VO();
        }
        if (cVar instanceof C20112a.f) {
            m85979uR(((C20112a.f) cVar).m104677a());
        }
    }

    /* renamed from: rQ */
    public /* synthetic */ void m85779rQ(SongData songData) {
        this.f78832y1.m43589Y(songData);
        if (this.f78834y3) {
            this.f78832y1.m43590d0();
        }
    }

    /* renamed from: rR */
    private void m85780rR() {
        long j11;
        try {
            AbstractC2379w.m12430d(this.f78756f1);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 4);
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
            if (profilePreviewAlbumItem != null) {
                j11 = profilePreviewAlbumItem.getId();
            } else {
                j11 = -1;
            }
            bundle.putLong("selected_album_id", j11);
            this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1022, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rS */
    private void m85781rS(View view, Drawable drawable) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ry0

            /* renamed from: p */
            public final /* synthetic */ View f81867p;

            /* renamed from: q */
            public final /* synthetic */ Drawable f81868q;

            public /* synthetic */ ry0(View view2, Drawable drawable2) {
                r1 = view2;
                r2 = drawable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23136l9.m118696b1(r1, r2);
            }
        });
    }

    /* renamed from: sQ */
    public /* synthetic */ void m85784sQ(ComposLyricStatus composLyricStatus) {
        this.f78727X3 = composLyricStatus.m45957a();
        this.f78731Y3 = composLyricStatus.m45958b();
        m85929fT();
    }

    /* renamed from: sS */
    private void m85785sS(boolean z11) {
        if (z11) {
            this.f78782l3.setVisibility(0);
        } else {
            this.f78782l3.setVisibility(8);
        }
    }

    /* renamed from: tQ */
    public /* synthetic */ void m85788tQ(ComposeSongStatus composeSongStatus) {
        this.f78754e3 = Boolean.valueOf(composeSongStatus.m45963c());
        this.f78758f3 = composeSongStatus.m45965e();
        m85921dO(2, this.f78754e3.booleanValue());
        mo79419nT();
        m85929fT();
        m85948lT();
    }

    /* renamed from: uO */
    private void m85791uO(boolean z11, int i11) {
        MediaItem mediaItem;
        String mo41081Q;
        if (z11) {
            ArrayList arrayList = this.f78796p1;
            if (arrayList != null && !arrayList.isEmpty()) {
                mediaItem = (MediaItem) this.f78796p1.get(0);
            } else {
                mediaItem = null;
            }
            if (m85950mP() && mediaItem != null) {
                if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                    mo41081Q = mediaItem.m41113N();
                } else {
                    mo41081Q = mediaItem.mo41081Q();
                }
                C19587j c19587j = C19587j.f97307a;
                int mo102466i = c19587j.m102530f(i11).mo102466i();
                if (mo102466i == 3) {
                    C18054j mo102469l = c19587j.m102530f(i11).mo102469l(this.f78796p1);
                    if (mo102469l != null) {
                        if (C23212s8.m119603k() && mo102469l.m95948b() != null) {
                            this.f78828x1.m98028e(m92689tK(), mo102469l.m95948b(), mo102466i, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.hy0
                                public /* synthetic */ hy0() {
                                }

                                @Override // en0.InterfaceC18505l
                                /* renamed from: i9 */
                                public final Object mo205i9(Object obj) {
                                    C24848g0 m85754jQ;
                                    m85754jQ = UpdateStatusView.this.m85754jQ((Drawable) obj);
                                    return m85754jQ;
                                }
                            });
                            this.f78790n3.setBackgroundColor(C19581d.f97279a.m102499v(mo102469l.m95948b()));
                            return;
                        } else {
                            if (mo102469l.m95947a() != null) {
                                this.f78828x1.m98028e(m92689tK(), mo102469l.m95947a(), mo102466i, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.iy0
                                    public /* synthetic */ iy0() {
                                    }

                                    @Override // en0.InterfaceC18505l
                                    /* renamed from: i9 */
                                    public final Object mo205i9(Object obj) {
                                        C24848g0 m85757kQ;
                                        m85757kQ = UpdateStatusView.this.m85757kQ((Drawable) obj);
                                        return m85757kQ;
                                    }
                                });
                                this.f78790n3.setBackgroundColor(C19581d.f97279a.m102499v(mo102469l.m95947a()));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                this.f78828x1.m98028e(m92689tK(), mo41081Q, mo102466i, new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.ky0
                    public /* synthetic */ ky0() {
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public final Object mo205i9(Object obj) {
                        C24848g0 m85761lQ;
                        m85761lQ = UpdateStatusView.this.m85761lQ((Drawable) obj);
                        return m85761lQ;
                    }
                });
                return;
            }
            this.f78828x1.m98026c(m92689tK(), new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.ly0
                public /* synthetic */ ly0() {
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m85764mQ;
                    m85764mQ = UpdateStatusView.this.m85764mQ((Drawable) obj);
                    return m85764mQ;
                }
            });
        }
    }

    /* renamed from: uP */
    private void m85792uP() {
        this.f78802q3 = 0;
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
        if (selectMultiPhotoLayoutBottomSheet != null) {
            selectMultiPhotoLayoutBottomSheet.m45940OL();
        }
    }

    /* renamed from: uQ */
    public /* synthetic */ void m85793uQ(Boolean bool) {
        this.f78746c3 = bool;
        mo79403eT();
        m85929fT();
    }

    /* renamed from: uS */
    private void m85794uS(ControlComposeButtonView controlComposeButtonView, boolean z11, String str) {
        int i11;
        if (str.equals("tip.formpost.music")) {
            GlowingReddot layoutMusicRedDot = controlComposeButtonView.getLayoutMusicRedDot();
            m85717YN(layoutMusicRedDot);
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            layoutMusicRedDot.setVisibility(i11);
        }
    }

    /* renamed from: uT */
    private void m85795uT() {
        if (m85957oP()) {
            PrivacyInfo privacyInfo = new PrivacyInfo(this.f78783l4.getPrivacyType());
            C23418f c23418f = C23418f.f113810a;
            c23418f.m123076c(this.f78783l4.getId(), privacyInfo);
            c23418f.m123074a(this.f78783l4.getId(), this.f78783l4.getPrivacyType(), new C15268n());
        }
    }

    /* renamed from: vQ */
    public /* synthetic */ void m85798vQ(LyricRender lyricRender) {
        this.f78836z1.m45900a(lyricRender);
    }

    /* renamed from: vR */
    public void m85799vR(int i11) {
        try {
            AbstractC2379w.m12430d(this.f78756f1);
            Bundle bundle = new Bundle();
            AbstractC25951b.m133689b(bundle, new MusicSelectParam(C32002l4.m154267j(this.f78809s2), i11));
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 9);
            this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1023, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vS */
    public void m85800vS(boolean z11, String str) {
        if (z11) {
            if (this.f78644A1.isShown()) {
                m85794uS(this.f78644A1, true, str);
                return;
            } else {
                if (this.f78732Z0.isShown()) {
                    m85794uS(this.f78732Z0, true, str);
                    return;
                }
                return;
            }
        }
        m85794uS(this.f78644A1, false, str);
        m85794uS(this.f78732Z0, false, str);
    }

    /* renamed from: wO */
    private String m85803wO() {
        if (this.f78758f3 != null) {
            return "UPDATE_STATUS_VIEW_" + this.f78758f3.m45182d();
        }
        return "";
    }

    /* renamed from: wQ */
    public /* synthetic */ void m85804wQ(int i11, String str, C31890dc c31890dc) {
        try {
            if (i11 == 0 && c31890dc != null) {
                m85928fS(c31890dc, true);
            } else {
                m85924eS(false, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xQ */
    public /* synthetic */ void m85807xQ(int i11, String str, C31890dc c31890dc) {
        try {
            if (i11 == 0 && c31890dc != null) {
                m85928fS(c31890dc, true);
            } else {
                m85924eS(false, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yO */
    private View m85810yO(ControlComposeButtonView controlComposeButtonView, String str) {
        if (!str.equals("tip.formpost.music")) {
            return null;
        }
        View layoutMusic = controlComposeButtonView.getLayoutMusic();
        int[] iArr = new int[2];
        layoutMusic.getLocationInWindow(iArr);
        int i11 = iArr[0];
        if (i11 < 0 || i11 + layoutMusic.getWidth() >= AbstractC23136l9.m118722k0()) {
            return null;
        }
        return layoutMusic;
    }

    /* renamed from: yP */
    private void m85811yP() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.cx0
            public /* synthetic */ cx0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85682NP();
            }
        });
    }

    /* renamed from: yQ */
    public /* synthetic */ boolean m85812yQ(View view, MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                C0732w.Companion.m1189a().m1187q("click_input_status", "", null, null);
                int m119758v = AbstractC23244v8.m119758v(this.f78756f1.getText().toString(), System.getProperty("line.separator"));
                if (m85875SO().length() <= 70 && m119758v <= 2) {
                    m85830EN();
                    if (!this.f78712U0) {
                        m85792uP();
                        AbstractC2379w.m12432f(this.f78756f1);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: zO */
    public View m85815zO(String str) {
        if (this.f78644A1.isShown()) {
            return m85810yO(this.f78644A1, str);
        }
        if (this.f78732Z0.isShown()) {
            return m85810yO(this.f78732Z0, str);
        }
        return null;
    }

    /* renamed from: zQ */
    public /* synthetic */ boolean m85816zQ(View view) {
        try {
            StatusComposeEditText statusComposeEditText = this.f78756f1;
            if (statusComposeEditText != null) {
                statusComposeEditText.requestFocus();
                int selectionStart = this.f78756f1.getSelectionStart();
                Layout layout = this.f78756f1.getLayout();
                int lineForOffset = layout.getLineForOffset(selectionStart);
                int lineBaseline = layout.getLineBaseline(lineForOffset);
                int lineAscent = layout.getLineAscent(lineForOffset);
                float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart);
                float f11 = lineBaseline + lineAscent;
                int m118712h = AbstractC23136l9.m118712h(this.f72421L0.m92648SI(), 2.0f);
                if (TextUtils.isEmpty(this.f78756f1.getText().toString())) {
                    float f12 = m118712h;
                    this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f78756f1.getX() + f12, this.f78756f1.getY() + f12, 0));
                    this.f78756f1.setEnabled(false);
                    this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f78756f1.getX() + f12, this.f78756f1.getY() + f12, 0));
                    this.f78756f1.setEnabled(true);
                } else {
                    float f13 = primaryHorizontal + m118712h;
                    this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f13, f11, 0));
                    this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, f13, f11, 0));
                }
                this.f78756f1.requestFocus();
                this.f78756f1.performLongClick();
                if (Build.VERSION.SDK_INT >= 23) {
                    if (TextUtils.isEmpty(this.f78756f1.getText().toString())) {
                        float f14 = m118712h;
                        this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f78756f1.getX() + f14, this.f78756f1.getY() + f14, 0));
                        this.f78756f1.setEnabled(false);
                        this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f78756f1.getX() + f14, this.f78756f1.getY() + f14, 0));
                        this.f78756f1.setEnabled(true);
                    } else {
                        float f15 = primaryHorizontal + m118712h;
                        this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f15, f11, 0));
                        this.f78756f1.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, f15, f11, 0));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    /* renamed from: zR */
    private void m85817zR() {
        m85883Tr();
        AbstractC2379w.m12430d(this.f78756f1);
        if (!this.f78712U0 || this.f78770i3 == null) {
            this.f78802q3 = 1;
            SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = this.f78770i3;
            if (selectMultiPhotoLayoutBottomSheet != null) {
                selectMultiPhotoLayoutBottomSheet.m45946YL();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("layout_id", this.f78774j3);
            SelectMultiPhotoLayoutBottomSheet m45947a = SelectMultiPhotoLayoutBottomSheet.Companion.m45947a(bundle);
            this.f78770i3 = m45947a;
            m45947a.m45944VL(this.f78651B4);
            m92649TI().m93058d2(AbstractC6918a0.fl_bottom_sheet_container, this.f78770i3, 0, "SelectMultiPhotoLayoutBottomSheet", 1, false);
        }
    }

    /* renamed from: AO */
    public PrivacyInfo m85818AO() {
        if (m85905ZP()) {
            PrivacyInfo m123075b = C23418f.f113810a.m123075b(this.f78783l4.getId());
            if (m123075b == null) {
                return new PrivacyInfo(this.f78783l4.getPrivacyType());
            }
            return m123075b;
        }
        return this.f78744c1;
    }

    /* renamed from: AP */
    void m85819AP() {
        this.f78713U1 = (RelativeLayout) this.f78708T0.findViewById(AbstractC6918a0.layoutLinkTab);
        this.f78717V1 = (ProgressBar) this.f78708T0.findViewById(AbstractC6918a0.pb_link_progress);
        this.f78721W1 = (RecyclingImageView) this.f78708T0.findViewById(AbstractC6918a0.imvLinkHeader);
        this.f78725X1 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tvLinkTitle);
        this.f78729Y1 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tvLinkDescription);
        View findViewById = this.f78708T0.findViewById(AbstractC6918a0.link_preview_delete);
        this.f78733Z1 = findViewById;
        findViewById.setOnClickListener(this);
    }

    /* renamed from: AR */
    protected void mo79382AR() {
        try {
            if (this.f78712U0) {
                AbstractC2379w.m12430d(this.f78756f1);
            }
            if (this.f72421L0.m92648SI() != null) {
                Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(this.f78736a1.values()), 20, AbstractC23136l9.m118743r0(AbstractC8020f0.profile_picker_tag_activity_title));
                m83056qM.putBoolean("extra_show_text_instead_icon", true);
                m83056qM.putBoolean("allow_empty_pick", true);
                m83056qM.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
                if (m85905ZP()) {
                    m83056qM.putLong("extra_album_id_to_get_friend_list_privacy", this.f78783l4.getId());
                    m83056qM.putLong("extra_album_privacy_type_to_get_friend_list_privacy", this.f78783l4.getPrivacyType());
                }
                this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83056qM, 1007, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AS */
    void m85820AS() {
        if (C23926a.f115594a.m125053b()) {
            m85780rR();
        } else if (AbstractC0924m0.m4195s9()) {
            m85642A4();
        } else {
            m85780rR();
        }
    }

    /* renamed from: BO */
    float m85821BO() {
        int i11;
        if (m85899XP()) {
            C31890dc c31890dc = this.f78673I3;
            if (c31890dc != null) {
                i11 = c31890dc.m153244m(m85875SO(), 7);
            } else {
                i11 = 16;
            }
        } else {
            C31890dc c31890dc2 = this.f78664F3;
            if (c31890dc2 != null) {
                i11 = c31890dc2.m153244m(m85875SO(), 7);
            } else {
                i11 = 20;
            }
        }
        return AbstractC23136l9.m118742r(i11);
    }

    /* renamed from: BP */
    void m85822BP() {
        this.f78749d2 = (RelativeLayout) this.f78708T0.findViewById(AbstractC6918a0.layoutThumbLocation);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) this.f78708T0.findViewById(AbstractC6918a0.imv_thumb_location);
        this.f78753e2 = aspectRatioImageView;
        aspectRatioImageView.setScaleOption(3);
        this.f78753e2.setRatio(AbstractC20814p0.f102273c);
        this.f78753e2.setOnClickListener(this);
        ImageView imageView = (ImageView) this.f78708T0.findViewById(AbstractC6918a0.ic_thumb_location_remove);
        this.f78757f2 = imageView;
        imageView.setOnClickListener(this);
    }

    /* renamed from: BR */
    public void m85823BR() {
        PrivacyInfo m85818AO = m85818AO();
        if (m85818AO != null && m85818AO.f45973p == 3 && this.f78736a1 != null) {
            List m45138e = m85818AO.m45138e();
            FeedActionZUtils.m47513A(m45138e, m85980vO().f11957b, this, new C15278x(m45138e));
        } else {
            mo79387ER();
        }
    }

    /* renamed from: BS */
    void mo79383BS(int i11) {
        try {
            if (this.f78803q4 != i11) {
                if (this.f78709T1 && i11 != 3) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_mode_conflict_msg, mo79388FO(3), mo79388FO(i11)));
                    return;
                } else if ((i11 == 2 || i11 == 3) && m85957oP()) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_mode_conflict_msg, mo79388FO(i11), mo79388FO(7)));
                    return;
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_mode_conflict_msg, mo79388FO(this.f78803q4), mo79388FO(i11)));
                    return;
                }
            }
            throw new IllegalArgumentException("New mode and current mode is the same, no conflict");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this);
        C13306b c13306b = new C13306b(this.f72421L0.m92648SI());
        this.f78839z4 = c13306b;
        boolean z11 = true;
        c13306b.m74686B(true);
        if (!C31845ac.m152996J().m153054l()) {
            this.f78831x4 = true;
        }
        if (!C31845ac.m152996J().m153053k()) {
            this.f78835y4 = true;
        }
        this.f78714U2 = AnimationUtils.loadAnimation(this.f72421L0.getContext(), AbstractC10919t.fade_in);
        if (!AbstractC23309i.m122355rf() || !C22013a0.m114928g()) {
            z11 = false;
        }
        this.f78718V2 = z11;
        C31845ac.m152996J().m153071w0(new int[]{AbstractC20826v0.m108781R(MainApplication.getAppContext()).f146495a});
        this.f78730Y2 = AbstractC23309i.m122503vf();
        this.f78734Z2 = AbstractC23309i.m122093kf();
        this.f78704S0 = new C15276v();
        m85811yP();
        this.f78766h3 = (C20112a) new C1802w0(this, new C20112a.k(this, null)).m9378a(C20112a.class);
        C13306b.m74679g(m85689PO());
    }

    /* renamed from: CO */
    public C31890dc m85824CO() {
        if (m85899XP()) {
            if (this.f78673I3 != null && !TextUtils.isEmpty(m85875SO())) {
                return this.f78673I3;
            }
            return C31845ac.m152996J().m153044X();
        }
        if (this.f78664F3 != null && !TextUtils.isEmpty(m85875SO())) {
            return this.f78664F3;
        }
        return C31845ac.m152996J().m153020A();
    }

    /* renamed from: CP */
    void m85825CP() {
        try {
            this.f78812t1 = this.f78708T0.findViewById(AbstractC6918a0.preview_content);
            FeedGridModulesView feedGridModulesView = (FeedGridModulesView) this.f78708T0.findViewById(AbstractC6918a0.photo_preview_grid);
            this.f78804r1 = feedGridModulesView;
            AbstractC23136l9.m118729m1(feedGridModulesView, AbstractC23136l9.m118742r(6.0f));
            View findViewById = this.f78708T0.findViewById(AbstractC6918a0.empty_photo_music);
            this.f78824w1 = findViewById;
            findViewById.setOnClickListener(this);
            this.f78644A1 = (ControlComposeButtonView) this.f78708T0.findViewById(AbstractC6918a0.compose_button_header);
            this.f78648B1 = (ImageView) this.f78708T0.findViewById(AbstractC6918a0.container_detail_album_arrow_right);
            this.f78808s1 = this.f78708T0.findViewById(AbstractC6918a0.preview_layout);
            this.f78782l3 = (ModulesView) this.f78708T0.findViewById(AbstractC6918a0.background_feed_music_container);
            this.f78786m3 = (ModulesView) this.f78708T0.findViewById(AbstractC6918a0.overlay_background_feed_photo);
            this.f78828x1 = (C18565a) C18565a.Companion.m122672a();
            this.f78816u1 = (android.widget.Button) this.f78708T0.findViewById(AbstractC6918a0.btn_photo_grid_add);
            this.f78800q1 = (HorizontalScrollView) this.f78708T0.findViewById(AbstractC6918a0.status_photos_grid);
            this.f78790n3 = (FrameLayout) this.f78708T0.findViewById(AbstractC6918a0.song_container);
            android.widget.Button button = this.f78816u1;
            if (button != null) {
                button.setOnClickListener(this);
            }
            this.f78644A1.m45920u();
            this.f78644A1.setVisibility(8);
            this.f78644A1.setListener(new C15258i());
            this.f78820v1 = this.f78708T0.findViewById(AbstractC6918a0.layout_typo_location_tag_control);
            this.f78747c4 = new C15260j();
            this.f78836z1 = (BoxLyric) this.f78708T0.findViewById(AbstractC6918a0.box_lyric);
            ComposeSongItemView composeSongItemView = (ComposeSongItemView) this.f78708T0.findViewById(AbstractC6918a0.song_view);
            this.f78832y1 = composeSongItemView;
            composeSongItemView.setListener(new C15264l());
            this.f78766h3.m104630j0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.sy0
                public /* synthetic */ sy0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85776qQ((C19964c) obj);
                }
            });
            this.f78766h3.m104628h0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ty0
                public /* synthetic */ ty0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85779rQ((SongData) obj);
                }
            });
            this.f78766h3.m104626f0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.uy0
                public /* synthetic */ uy0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85784sQ((ComposLyricStatus) obj);
                }
            });
            this.f78766h3.m104629i0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.vy0
                public /* synthetic */ vy0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85788tQ((ComposeSongStatus) obj);
                }
            });
            this.f78766h3.m104620Y().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.wy0
                public /* synthetic */ wy0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85793uQ((Boolean) obj);
                }
            });
            this.f78766h3.m104624c0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.sw0
                public /* synthetic */ sw0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    UpdateStatusView.this.m85798vQ((LyricRender) obj);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: CR */
    public Bundle mo79384CR() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
        bundle.putSerializable("extra_media_picker_sub_source", EnumC22963b.f111701q);
        bundle.putBoolean("extra_enable_inline_banner", true);
        int i11 = this.f78722W2;
        if (i11 != 1 && i11 != 2) {
            bundle.putInt("extra_preload_grid_mode", 100);
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_post_photo_feed", "social_timeline"));
        } else {
            this.f78726X2 = true;
            QuickPickerView quickPickerView = this.f78716V0;
            quickPickerView.f65957i1 = true;
            quickPickerView.m71234SN(true);
            if (this.f78722W2 == 2) {
                bundle.putInt("extra_preload_grid_mode", 101);
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_post_video_feed", "social_timeline"));
            } else {
                bundle.putInt("extra_preload_grid_mode", 100);
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_post_photo_feed", "social_timeline"));
            }
        }
        return bundle;
    }

    /* renamed from: CS */
    protected void m85826CS() {
        new C16972e0.a(m92689tK()).m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_notif_max_async_feed_new, Integer.valueOf(C26761p.m137741q().m137750B()))).m90932i(C16972e0.b.DIALOG_INFORMATION).m90942s(AbstractC8020f0.str_max_async_feed_continue_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ny0
            public /* synthetic */ ny0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                UpdateStatusView.this.m85708VQ(interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_max_async_feed_no_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.oy0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90931h("limit_feed_popup").m90947x("limit_feed_popup_proceed").m90937n("limit_feed_popup_cancel").m90927d().mo13822K();
    }

    /* renamed from: DN */
    protected boolean mo79385DN() {
        return true;
    }

    /* renamed from: DP */
    void m85827DP() {
        RedDotImageButton redDotImageButton = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_photo);
        this.f78788n1 = redDotImageButton;
        redDotImageButton.setImageDrawable(AbstractC23136l9.m118665N(redDotImageButton.getContext(), AbstractC16803z.im_postfeed_photo_o));
        this.f78788n1.setOnClickListener(this);
        RedDotImageButton redDotImageButton2 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_video);
        this.f78659E1 = redDotImageButton2;
        redDotImageButton2.setOnClickListener(this);
        if (!AbstractC23309i.m121565We()) {
            this.f78659E1.setVisibility(8);
        }
        RedDotImageButton redDotImageButton3 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_sticker);
        this.f78680L1 = redDotImageButton3;
        redDotImageButton3.setOnClickListener(this);
        RedDotImageButton redDotImageButton4 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_link);
        this.f78697Q1 = redDotImageButton4;
        redDotImageButton4.setOnClickListener(this);
        RedDotImageButton redDotImageButton5 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_location);
        this.f78761g2 = redDotImageButton5;
        redDotImageButton5.setOnClickListener(this);
    }

    /* renamed from: DR */
    void m85828DR() {
        EnumC15265l0 enumC15265l0;
        try {
            if (!AbstractC23309i.m121491Ue()) {
                return;
            }
            if (!m85914bQ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_applied_bg_feed));
                this.f78711T3.m75655j(false, false);
                m85893VS(false, false);
                this.f78771i4 = true;
                return;
            }
            if (m85875SO().length() <= C31845ac.f146174y) {
                enumC15265l0 = EnumC15265l0.STATE_MAX_SIZE;
            } else {
                enumC15265l0 = EnumC15265l0.STATE_MIN_SIZE;
            }
            if (enumC15265l0 != this.f78767h4) {
                this.f78767h4 = enumC15265l0;
                m85906ZR(this.f78664F3, false);
                return;
            }
            C31890dc c31890dc = this.f78664F3;
            if (c31890dc != null && this.f78760g1.m43645r(c31890dc, m85875SO(), this.f78664F3.f146514t)) {
                m85906ZR(this.f78664F3, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DS */
    public void m85829DS(int i11) {
        try {
            UpdateStatusFragmentDialog m85997cL = UpdateStatusFragmentDialog.m85997cL(i11, this);
            if (m85997cL != null) {
                if (m85997cL.m92687sJ()) {
                    m85997cL.dismiss();
                }
                m85997cL.mo83093TK(this.f72421L0.m92649TI());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:3:0x0003, B:7:0x000e, B:10:0x0014, B:13:0x001a, B:15:0x0030, B:19:0x0049, B:21:0x005a, B:23:0x0077, B:27:0x0039), top: B:2:0x0003 }] */
    /* renamed from: EN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m85830EN() {
        boolean m121293P1;
        int m153031I;
        C13306b c13306b;
        try {
            m121293P1 = AbstractC23309i.m121293P1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m85899XP() && !this.f78658D3 && m121293P1 && this.f78682L3 != 1) {
            C31890dc m153028F = C31845ac.m152996J().m153028F(this.f78684M2.m140539P(), AbstractC23309i.m120855D7(), -100, 0);
            if (m153028F != null) {
                if (m153028F.m153249t()) {
                }
                if (m153028F != null && (m153031I = C31845ac.m152996J().m153031I(this.f78684M2.m140539P(), m153028F)) != -1) {
                    this.f78684M2.m140551f0(m153028F);
                    m85839GS(true, false);
                    m85959oS(m153031I);
                    C31845ac.m152996J().m153057o0(m153028F.f146495a, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.tw0
                        public /* synthetic */ tw0() {
                        }

                        @Override // p716zh.C31845ac.e
                        /* renamed from: a */
                        public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                            UpdateStatusView.this.m85730dQ(i11, str, c31890dc);
                        }
                    });
                    c13306b = this.f78839z4;
                    if (c13306b != null) {
                        c13306b.m74702j("tip.postfeed.typo");
                        this.f78839z4.m74689E("tip.postfeed.typo");
                    }
                    return true;
                }
                return false;
            }
            m153028F = C31845ac.m152996J().m153043V(this.f78684M2.m140539P());
            if (m153028F != null) {
                this.f78684M2.m140551f0(m153028F);
                m85839GS(true, false);
                m85959oS(m153031I);
                C31845ac.m152996J().m153057o0(m153028F.f146495a, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.tw0
                    public /* synthetic */ tw0() {
                    }

                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                        UpdateStatusView.this.m85730dQ(i11, str, c31890dc);
                    }
                });
                c13306b = this.f78839z4;
                if (c13306b != null) {
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: EO */
    protected int mo79386EO() {
        return AbstractC7409c0.update_status_view;
    }

    /* renamed from: EP */
    void m85831EP(Bundle bundle, Bundle bundle2) {
        boolean z11;
        try {
            if (!AbstractC23309i.m121491Ue()) {
                return;
            }
            if (bundle2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = bundle.getBoolean("EXTRA_SHOW_EXTERNAL_BG", false);
            if (!z11 && z12) {
                String string = bundle.getString("EXTRA_EXTERNAL_TYPO_ID", "");
                if (!TextUtils.isEmpty(string)) {
                    this.f78667G3 = true;
                    this.f78711T3.m75656k(true, false);
                    m85889US(false, false);
                    m85911aS(string);
                    JSONArray jSONArray = new JSONArray(string);
                    if (jSONArray.length() > 0) {
                        int min = Math.min(jSONArray.length(), 3);
                        int[] iArr = new int[min];
                        for (int i11 = 0; i11 < min; i11++) {
                            iArr[i11] = jSONArray.optInt(i11);
                        }
                        C31845ac.m152996J().m153071w0(iArr);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ER */
    public void mo79387ER() {
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            if (this.f78752e1) {
                return;
            }
            mo79406hR();
            if (C26761p.m137741q().m137768s()) {
                m85826CS();
                return;
            }
            if (m85905ZP() && ((m85950mP() && this.f78783l4.getRemain() < this.f78796p1.size()) || (m85969rP() && this.f78783l4.getRemain() <= 0))) {
                m85829DS(20);
                return;
            }
            this.f78752e1 = true;
            AbstractC2379w.m12430d(this.f78756f1);
            if (m85899XP()) {
                if (m85950mP()) {
                    m85907ZS("showLoadingView: ");
                    mo49282B8(null, false);
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.fy0
                        public /* synthetic */ fy0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateStatusView.this.m85687OQ();
                        }
                    });
                } else if (m85965qP()) {
                    mo79416mO();
                } else if (m85943kP()) {
                    mo79408jO();
                } else if (m85969rP()) {
                    mo79417nO();
                } else {
                    mo79411kO();
                }
            } else {
                mo79411kO();
            }
            C25482o.f122075a.m132012t(m85697RO(), this.f78646A3);
            try {
                Bundle m92642L3 = this.f72421L0.m92642L3();
                if (m92642L3 != null && m92642L3.containsKey("extra_action_list_task_id")) {
                    AbstractC28127m2 m141613e = AbstractC28127m2.a.m141609d().m141613e(m92642L3.getString("extra_action_list_task_id"));
                    if (m141613e instanceof C28154p2) {
                        C28154p2 c28154p2 = (C28154p2) m141613e;
                        c28154p2.f131226e = 1;
                        c28154p2.f131228g.clear();
                        PrivacyInfo privacyInfo = this.f78744c1;
                        if (privacyInfo != null) {
                            int i11 = privacyInfo.f45973p;
                            if (i11 == 1) {
                                c28154p2.f131227f = 1;
                                c28154p2.f131228g.add(CoreUtility.f89233i);
                                return;
                            }
                            if (i11 == 2 && (arrayList2 = privacyInfo.f45974q) != null) {
                                c28154p2.f131227f = 2;
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    c28154p2.f131228g.add(((LikeContactItem) it.next()).m56333d());
                                }
                                return;
                            }
                            if (i11 == 3 && (arrayList = privacyInfo.f45974q) != null) {
                                c28154p2.f131227f = 3;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    c28154p2.f131228g.add(((LikeContactItem) it2.next()).m56333d());
                                }
                                return;
                            }
                            c28154p2.f131227f = 0;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Exception e12) {
            this.f78752e1 = false;
            e12.printStackTrace();
        }
    }

    /* renamed from: ES */
    void m85832ES(int i11, boolean z11) {
        if (i11 != 4 && i11 != 5) {
            return;
        }
        try {
            if (mo79396QP(i11)) {
                mo79383BS(i11);
                return;
            }
            AbstractC2379w.m12430d(this.f78756f1);
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                if (i11 != 4) {
                    if (i11 == 5) {
                        quickPickerView.m71284sO(z11, new SensitiveData("gallery_post_video_feed", "social_timeline"));
                    }
                } else {
                    quickPickerView.m71281pO(z11, new SensitiveData("gallery_post_photo_feed", "social_timeline"));
                }
            }
            m85938iS();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            actionBarMenu.m92750r();
            if (AbstractC23309i.m121491Ue()) {
                actionBarMenu.m92746m(AbstractC6918a0.menu_switch, this.f78711T3, new LinearLayout.LayoutParams(-2, -2));
            }
            View m92744k = actionBarMenu.m92744k(AbstractC6918a0.menu_done, AbstractC7409c0.social_fpf_post_button);
            this.f78703R3 = m92744k;
            Button button = (Button) m92744k.findViewById(AbstractC6918a0.bt_post_feed);
            this.f78707S3 = button;
            button.setIdTracking("button_post_fpf");
            this.f78707S3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.jy0
                public /* synthetic */ jy0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UpdateStatusView.this.m85672JQ(view);
                }
            });
            mo79419nT();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FN */
    void m85833FN() {
        m85837GN(0, null);
    }

    /* renamed from: FO */
    public String mo79388FO(int i11) {
        if (i11 != 0) {
            try {
                switch (i11) {
                    case 2:
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_sticker);
                    case 3:
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_link);
                    case 4:
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_photos);
                    case 5:
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_video);
                    case 6:
                        if (m85950mP()) {
                            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_photos);
                        }
                        if (m85969rP()) {
                            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_video);
                        }
                        if (!m85943kP()) {
                            return "";
                        }
                        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_mode_link);
                    case 7:
                        return "Album";
                    default:
                        throw new IllegalArgumentException("Invalid mode: " + i11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
        return "Text";
    }

    /* renamed from: FP */
    void m85834FP(Bundle bundle, Bundle bundle2) {
        boolean z11;
        if (bundle2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            boolean z12 = bundle.getBoolean("extra_show_typo", false);
            if (!z11 && z12) {
                int i11 = bundle.getInt("extra_external_typo_id", 0);
                String string = bundle.getString("extra_external_typo_thumb", "");
                if (i11 != 0 && !TextUtils.isEmpty(string)) {
                    C31890dc m153043V = C31845ac.m152996J().m153043V(this.f78684M2.m140539P());
                    if (m153043V != null) {
                        int m153031I = C31845ac.m152996J().m153031I(this.f78684M2.m140539P(), m153043V);
                        this.f78684M2.m140551f0(m153043V);
                        m85839GS(true, false);
                        m85959oS(m153031I);
                        C31845ac.m152996J().m153057o0(m153043V.f146495a, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.vx0
                            public /* synthetic */ vx0() {
                            }

                            @Override // p716zh.C31845ac.e
                            /* renamed from: a */
                            public final void mo39491a(int i12, String str, C31890dc c31890dc) {
                                UpdateStatusView.this.m85804wQ(i12, str, c31890dc);
                            }
                        });
                        return;
                    }
                    C31890dc c31890dc = new C31890dc(i11);
                    c31890dc.f146496b = string;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C31845ac.m152996J().m153044X());
                    arrayList.add(c31890dc);
                    this.f78684M2.m140548c0(arrayList);
                    this.f78684M2.m140551f0(c31890dc);
                    m85839GS(true, false);
                    C31845ac.m152996J().m153057o0(i11, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.wx0
                        public /* synthetic */ wx0() {
                        }

                        @Override // p716zh.C31845ac.e
                        /* renamed from: a */
                        public final void mo39491a(int i12, String str, C31890dc c31890dc2) {
                            UpdateStatusView.this.m85807xQ(i12, str, c31890dc2);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FR */
    void m85835FR() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92662fJ().m92996E0("LOCATION_PICKER_VIEW_TAG");
            if (m92996E0 instanceof ShareLocationWithMapView) {
                ((ShareLocationWithMapView) m92996E0).m72065nM(this.f78739a4);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FS */
    void m85836FS(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (this.f78730Y2) {
            AbstractC23136l9.m118744r1(this.f78800q1, 8);
            View view = this.f78824w1;
            if (m85961pP() && !m85950mP()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
            ComposeSongItemView composeSongItemView = this.f78832y1;
            if (m85961pP()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(composeSongItemView, i12);
            FeedGridModulesView feedGridModulesView = this.f78804r1;
            if (z11 && m85950mP()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            AbstractC23136l9.m118744r1(feedGridModulesView, i13);
            View view2 = this.f78808s1;
            if (z11) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            AbstractC23136l9.m118744r1(view2, i14);
            android.widget.Button button = this.f78816u1;
            if (z11 && m85950mP() && !this.f78834y3) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            AbstractC23136l9.m118744r1(button, i15);
            BoxLyric boxLyric = this.f78836z1;
            if (m85710WP() || !m85961pP() || !this.f78727X3 || !this.f78731Y3) {
                i16 = 8;
            }
            AbstractC23136l9.m118744r1(boxLyric, i16);
            mo79401bT();
            mo79403eT();
            return;
        }
        HorizontalScrollView horizontalScrollView = this.f78800q1;
        if (!z11) {
            i16 = 8;
        }
        AbstractC23136l9.m118744r1(horizontalScrollView, i16);
        AbstractC23136l9.m118744r1(this.f78808s1, 8);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f78708T0 = layoutInflater.inflate(mo79386EO(), viewGroup, false);
        mo79392LP();
        m85671JP();
        return this.f78708T0;
    }

    /* renamed from: GN */
    void m85837GN(int i11, Intent intent) {
        AbstractC2379w.m12430d(this.f78756f1);
        if (i11 == 0) {
            this.f78766h3.m104637q0(this.f78838z3);
        }
        if (AbstractC21777d.m112310a(this.f72421L0.m92662fJ(), this.f72421L0.m92642L3())) {
            return;
        }
        if (this.f72421L0.m92662fJ().m93009J0() > 0) {
            this.f72421L0.mo50035CK(i11, intent);
            this.f72421L0.finish();
        } else {
            m85874RS(MainTabView.class, new Bundle());
        }
    }

    /* renamed from: GP */
    void m85838GP() {
        StatusComposeEditText statusComposeEditText = (StatusComposeEditText) this.f78708T0.findViewById(AbstractC6918a0.etDesc);
        this.f78756f1 = statusComposeEditText;
        statusComposeEditText.addTextChangedListener(this);
        this.f78756f1.setTextContextChangeListener(new C15256h());
        this.f78756f1.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.kx0
            public /* synthetic */ kx0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m85812yQ;
                m85812yQ = UpdateStatusView.this.m85812yQ(view, motionEvent);
                return m85812yQ;
            }
        });
        this.f78768i1 = this.f78708T0.findViewById(AbstractC6918a0.focus_override);
        View findViewById = this.f78708T0.findViewById(AbstractC6918a0.statusAnchor);
        this.f78772j1 = findViewById;
        findViewById.setOnClickListener(this);
        this.f78772j1.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.zviews.lx0
            public /* synthetic */ lx0() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m85816zQ;
                m85816zQ = UpdateStatusView.this.m85816zQ(view);
                return m85816zQ;
            }
        });
        mo79419nT();
    }

    /* renamed from: GS */
    public void m85839GS(boolean z11, boolean z12) {
        EnumC15263k0 enumC15263k0;
        int i11 = 0;
        try {
            if (z12) {
                if (z11) {
                    enumC15263k0 = EnumC15263k0.ON;
                } else {
                    enumC15263k0 = EnumC15263k0.OFF;
                }
                this.f78691O3 = enumC15263k0;
                if (z11) {
                    this.f78678K2.setVisibility(0);
                    this.f78678K2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC15252f());
                } else {
                    m85920cT(EnumC15261j0.INCREASE);
                    int childCount = this.f78678K2.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f78678K2.getChildAt(i12), "translationX", (-r4.getLeft()) - r4.getWidth());
                        ofFloat.setStartDelay(i12 * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.addListener(new C15254g());
                    animatorSet.start();
                }
            } else {
                FeedRecyclerView feedRecyclerView = this.f78678K2;
                if (!z11) {
                    i11 = 8;
                }
                feedRecyclerView.setVisibility(i11);
            }
            this.f78685M3 = z11;
            m85963pT(this.f78682L3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        int i11;
        int m118713h0;
        if (this.f78726X2) {
            if (z11) {
                i11 = AbstractC23136l9.m118713h0();
            } else {
                i11 = 0;
            }
            if (z11) {
                m118713h0 = 0;
            } else {
                m118713h0 = AbstractC23136l9.m118713h0();
            }
            View m92656bJ = this.f72421L0.m92656bJ();
            m92656bJ.setTranslationY(i11);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(m92656bJ, "translationY", m118713h0));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new C26087b());
            animatorSet.addListener(new C15255g0(runnable));
            return animatorSet;
        }
        return super.mo39022HJ(z11, runnable);
    }

    /* renamed from: HN */
    void m85840HN(Intent intent) {
        int i11;
        if (intent != null) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        m85837GN(i11, intent);
    }

    /* renamed from: HO */
    String m85841HO(MediaItem mediaItem) {
        if (mediaItem != null) {
            if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                return mediaItem.m41113N();
            }
            if (!TextUtils.isEmpty(mediaItem.m41141e0())) {
                return mediaItem.m41141e0();
            }
            return mediaItem.mo41081Q();
        }
        return "";
    }

    /* renamed from: HP */
    void m85842HP() {
        try {
            if (this.f78686N1 == null) {
                this.f78686N1 = this.f78708T0.findViewById(AbstractC6918a0.attachment_sticker_preview_tab);
            }
            if (this.f78693P1 == null) {
                this.f78693P1 = (FeedStickerView) this.f78708T0.findViewById(AbstractC6918a0.feed_sticker);
                int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.sticker_size_update_status);
                this.f78693P1.m56564m(m118655I, m118655I);
            }
            if (this.f78689O1 == null) {
                this.f78689O1 = this.f78708T0.findViewById(AbstractC6918a0.feed_sticker_preview_delete);
            }
            this.f78689O1.setOnClickListener(this);
            if (this.f78795o4 == 3) {
                m85921dO(4, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HR */
    void m85843HR() {
        try {
            m85863NR(2);
            m85863NR(5);
            m85863NR(3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HS */
    public void m85844HS(boolean z11) {
        try {
            if (z11) {
                this.f78717V1.setVisibility(0);
                this.f78721W1.setVisibility(4);
                this.f78725X1.setVisibility(4);
                this.f78729Y1.setVisibility(4);
                this.f78733Z1.setVisibility(4);
            } else {
                this.f78717V1.setVisibility(8);
                this.f78721W1.setVisibility(0);
                this.f78725X1.setVisibility(0);
                this.f78729Y1.setVisibility(0);
                this.f78733Z1.setVisibility(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            super.mo39024IJ();
            if (!C31948ha.m153587d().m153595i() && !C31948ha.m153587d().m153596j() && !C32065p8.m154684c().m154691f() && !C32065p8.m154684c().m154692g()) {
                new C25464p().m101508a(new C25464p.b());
            }
            if (!C31948ha.m153587d().m153595i() && !C31948ha.m153587d().m153596j() && !C32065p8.m154684c().m154691f() && !C32065p8.m154684c().m154692g() && C7853b.m40052a0().m40137k0()) {
                C7853b.m40052a0().m40136j1();
            }
            m85885UN();
            getLifecycle().mo9338d(this);
            C13306b.m74675K(m85689PO());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IO */
    public int m85845IO() {
        ArrayList arrayList = this.f78796p1;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: IP */
    void m85846IP() {
        try {
            CustomSwitch customSwitch = (CustomSwitch) LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.action_bar_menu_item_switch, (ViewGroup) null);
            this.f78711T3 = customSwitch;
            customSwitch.setEnableRedDot(true);
            this.f78711T3.setPaddingRect(AbstractC23136l9.m118742r(1.0f));
            this.f78711T3.m75654g(AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(28.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(8.0f));
            this.f78711T3.m75653f(AbstractC16803z.bg_track_gradient, AbstractC16803z.bg_thumb_switch, AbstractC16803z.icn_aa_inactive, AbstractC16803z.icn_aa_active, AbstractC16803z.icn_magic_inactive, AbstractC16803z.icn_magic_active);
            this.f78711T3.setOnCheckedChangeListener(new CustomSwitch.InterfaceC13487c() { // from class: com.zing.zalo.ui.zviews.uw0
                public /* synthetic */ uw0() {
                }

                @Override // com.zing.zalo.p077ui.widget.CustomSwitch.InterfaceC13487c
                /* renamed from: a */
                public final void mo75661a(boolean z11) {
                    UpdateStatusView.this.m85645AQ(z11);
                }
            });
            this.f78711T3.setOnCustomClickDragListener(new CustomSwitch.InterfaceC13488d() { // from class: com.zing.zalo.ui.zviews.vw0
                public /* synthetic */ vw0() {
                }

                @Override // com.zing.zalo.p077ui.widget.CustomSwitch.InterfaceC13488d
                /* renamed from: a */
                public final void mo75662a(View view, boolean z11) {
                    UpdateStatusView.this.m85648BQ(view, z11);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IS */
    void m85847IS() {
        try {
            AbstractC23647d.m123906p("13300");
            AbstractC2379w.m12430d(this.f78756f1);
            SensitiveData sensitiveData = new SensitiveData("timeline_post_compose_location", "social_timeline");
            ShareLocationWithMapView shareLocationWithMapView = new ShareLocationWithMapView();
            shareLocationWithMapView.m72065nM(this.f78739a4);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_MODE_LIVE_LOCATION", 0);
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo46542d1());
            shareLocationWithMapView.mo60305zK(bundle);
            shareLocationWithMapView.m72061jM(sensitiveData);
            shareLocationWithMapView.m72060iM(this.f72421L0.getContext());
            shareLocationWithMapView.mo60305zK(bundle);
            this.f72421L0.m92662fJ().mo89693h2(shareLocationWithMapView, "LOCATION_PICKER_VIEW_TAG", 1, true);
            m85938iS();
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JN */
    void m85848JN(long j11) {
        try {
            if (AbstractC23309i.m121701a2()) {
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.dx0
                    public /* synthetic */ dx0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85735eQ();
                    }
                }, j11);
                this.f78710T2.removeMessages(1);
                this.f78710T2.sendEmptyMessageDelayed(1, j11 + 1500);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JR */
    public void mo79389JR() {
        try {
            if (m85946lP() && !mo79418nP() && m85899XP() && this.f78735Z3) {
                this.f78749d2.setVisibility(0);
                AbstractC20814p0.m108602E0(m92689tK(), this.f78745c2, this.f78753e2, AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(16.0f) * 2), AbstractC20814p0.f102273c, false, this.f78720W0);
                C3063z0 c3063z0 = this.f78745c2;
                if (c3063z0 != null) {
                    c3063z0.f12384i = true;
                    return;
                }
                return;
            }
            m85886UO();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JS */
    void m85849JS() {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_location_tag));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_remove_location_tag));
            arrayList.add(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_continue_edit));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_continue_edit));
            arrayList.add(hashMap2);
            if (!arrayList.isEmpty()) {
                SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.dy0

                    /* renamed from: q */
                    public final /* synthetic */ SimpleAdapter f80185q;

                    public /* synthetic */ dy0(SimpleAdapter simpleAdapter2) {
                        r2 = simpleAdapter2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        UpdateStatusView.this.m85714XQ(r2, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f78787m4 = m43152a;
                if (!m43152a.m92868m()) {
                    this.f78787m4.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.ey0
                        public /* synthetic */ ey0() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                        /* renamed from: Tv */
                        public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                            UpdateStatusView.this.m85718YQ(interfaceC17463d);
                        }
                    });
                    this.f78787m4.mo13822K();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 58);
        C23744a.m124114c().m124117e(this, 88);
    }

    /* renamed from: KN */
    void m85850KN(int i11) {
        boolean z11;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            this.f78825w2 = z11;
            if (i11 == 1) {
                m85857LS(true);
                mo37493TJ();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KO */
    int m85851KO(float f11) {
        int i11;
        try {
            int m118713h0 = AbstractC23136l9.m118713h0();
            int m118722k0 = AbstractC23136l9.m118722k0();
            int i12 = (int) (m118722k0 * f11);
            i11 = (i12 - (((m118713h0 - (MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top)) - AbstractC23309i.m122007i5(MainApplication.getAppContext())) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.function_status_bar_height))) / 2;
        } catch (Exception e11) {
            e11.printStackTrace();
            i11 = 0;
        }
        if (i11 <= 0) {
            return 0;
        }
        return i11;
    }

    /* renamed from: KP */
    void m85852KP() {
        try {
            RedDotImageButton redDotImageButton = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.imv_entry_typo);
            this.f78765h2 = redDotImageButton;
            redDotImageButton.setOnClickListener(this);
            this.f78765h2.setRedDotMargin(AbstractC23136l9.m118742r(6.0f));
            FeedRecyclerView feedRecyclerView = (FeedRecyclerView) this.f78708T0.findViewById(AbstractC6918a0.lv_typo_graphy);
            this.f78678K2 = feedRecyclerView;
            feedRecyclerView.setVisibility(8);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
            this.f78681L2 = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
            this.f78678K2.setLayoutManager(this.f78681L2);
            this.f78678K2.m9816A(new C15244b());
            C27477e c27477e = new C27477e(this.f72421L0.getContext(), C27477e.d.TYPO_FEED);
            this.f78684M2 = c27477e;
            c27477e.m140552g0(new C15246c());
            this.f78678K2.setCatchTouchEventListener(new C15248d());
            this.f78678K2.m9826E(new C15250e());
            this.f78684M2.m140551f0(this.f78670H3);
            this.f78678K2.setAdapter(this.f78684M2);
            m85951mR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KR */
    public void m85853KR() {
        try {
            m85866OR();
            m85872QR();
            mo79389JR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KS */
    void m85854KS() {
        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ay0
            public /* synthetic */ ay0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85721ZQ();
            }
        }, 300L);
    }

    /* renamed from: Ka */
    public void m85855Ka(int i11) {
        this.f78795o4 = i11;
        m85933gT();
    }

    /* renamed from: LO */
    public Intent mo79391LO() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_BOL_UPDATE_STATUS_FINISHED", this.f78738a3);
        return intent;
    }

    /* renamed from: LP */
    public void mo79392LP() {
        this.f78720W0 = new C23528a(this.f72421L0.m92648SI());
        this.f78724X0 = (ChangeableHeightRelativeLayout) this.f78708T0.findViewById(AbstractC6918a0.changable_height_layout);
        this.f78728Y0 = (ScrollView) this.f78708T0.findViewById(AbstractC6918a0.status_scroll_view);
        RobotoTextView robotoTextView = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tv_tag_location_review);
        this.f78675J2 = robotoTextView;
        robotoTextView.setHighlightColor(0);
        this.f78687N2 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tv_add);
        this.f78690O2 = (LinearLayout) this.f78708T0.findViewById(AbstractC6918a0.updateStatusFunctionBar);
        ControlComposeButtonView controlComposeButtonView = (ControlComposeButtonView) this.f78708T0.findViewById(AbstractC6918a0.control_button_floating);
        this.f78732Z0 = controlComposeButtonView;
        controlComposeButtonView.setTextAlbum(AbstractC23136l9.m118743r0(AbstractC8020f0.album));
        this.f78732Z0.setTextMusic(AbstractC23136l9.m118743r0(AbstractC8020f0.music));
        this.f78732Z0.m45921v();
        this.f78732Z0.setListener(new C15242a());
        m85838GP();
        m85827DP();
        m85842HP();
        m85819AP();
        m85981vP();
        m85852KP();
        m85982wP();
        m85846IP();
        m85822BP();
        m85825CP();
        if (AbstractC23309i.m121565We()) {
            m85860MP();
        }
        ((CustomRelativeLayout) this.f78708T0.findViewById(AbstractC6918a0.update_status_main_layout)).setLayoutChangeListener(this);
        this.f78669H2 = (AspectRatioImageView) this.f78708T0.findViewById(AbstractC6918a0.decor_feed_bottom);
        this.f78672I2 = (RecyclingImageView) this.f78708T0.findViewById(AbstractC6918a0.decor_feed_top);
        this.f78669H2.setScaleOption(0);
    }

    /* renamed from: LR */
    public void m85856LR() {
        String m118743r0;
        String str;
        String str2;
        String m118743r02;
        String m118743r03;
        PrivacyInfo m85818AO = m85818AO();
        String str3 = "";
        int i11 = -1;
        if (m85818AO != null) {
            if (this.f78748d1 != null) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_to_friend_count_title);
                i11 = AbstractC16803z.icn_profile_form_selected_friends;
                str2 = m85818AO.f45975r;
                if (this.f78736a1.size() > 0) {
                    str2 = str2 + " (+)";
                }
                m85970rT(str, str2, i11);
            }
            int i12 = m85818AO.f45973p;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            m118743r0 = "";
                        } else {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends_count_title);
                            i11 = AbstractC16803z.icn_profile_form_except;
                            if (m85905ZP() && !m85818AO.m45151w()) {
                                m118743r03 = m85818AO.m45149t();
                            } else {
                                m118743r03 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_except_friends_count), Integer.valueOf(m85818AO.f45974q.size()));
                            }
                        }
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_to_friend_count_title);
                        i11 = AbstractC16803z.icn_profile_form_selected_friends;
                        if (m85905ZP() && !m85818AO.m45151w()) {
                            m118743r03 = m85818AO.m45149t();
                        } else {
                            m118743r03 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_to_friend_count), Integer.valueOf(m85818AO.f45974q.size()));
                            if (this.f78736a1.size() > 0) {
                                m118743r03 = m118743r03 + " (+)";
                            }
                        }
                    }
                } else {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_title);
                    i11 = AbstractC16803z.icn_profile_form_private;
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_new);
                    if (this.f78736a1.size() > 0) {
                        m118743r03 = m118743r03 + " (+)";
                    }
                }
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_title);
                i11 = AbstractC16803z.icn_profile_form_friends;
                m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_new);
            }
            String str4 = m118743r02;
            str3 = m118743r03;
            m118743r0 = str4;
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy);
        }
        String str5 = str3;
        str = m118743r0;
        str2 = str5;
        m85970rT(str, str2, i11);
    }

    /* renamed from: LS */
    void m85857LS(boolean z11) {
        int i11;
        View view = this.f78703R3;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* renamed from: MN */
    public void m85858MN() {
        if (this.f78798p3 && m85891VP() && m85881TP() && !m85957oP()) {
            m85817zR();
            this.f78798p3 = false;
        } else if (!m85891VP()) {
            m85713XN();
        }
    }

    /* renamed from: MO */
    String m85859MO() {
        if (m85957oP()) {
            return this.f78783l4.getTitle();
        }
        return "";
    }

    /* renamed from: MP */
    void m85860MP() {
        View findViewById = this.f78708T0.findViewById(AbstractC6918a0.layoutVideoFeed);
        this.f78668H1 = findViewById;
        findViewById.setVisibility(8);
        this.f78668H1.setOnClickListener(this);
        this.f78671I1 = (AspectRatioImageView) this.f78708T0.findViewById(AbstractC6918a0.imv_thumb_video);
        ImageView imageView = (ImageView) this.f78708T0.findViewById(AbstractC6918a0.imv_video_feed_remove);
        this.f78674J1 = imageView;
        imageView.setOnClickListener(this);
        this.f78677K1 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tv_video_duration);
    }

    /* renamed from: MR */
    void m85861MR(String str) {
        SpannableStringBuilder spannableStringBuilder;
        try {
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            int selectionStart = this.f78756f1.getSelectionStart();
            int selectionEnd = this.f78756f1.getSelectionEnd();
            this.f78756f1.setText(spannableStringBuilder);
            this.f78756f1.setSelection(selectionStart, selectionEnd);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: MS */
    void m85862MS() {
        try {
            if (m85910aQ()) {
                return;
            }
            if (m85905ZP()) {
                m85829DS(19);
                return;
            }
            MenuListPopupView m87745oL = MenuListPopupView.m87745oL(getContext(), true, this.f78744c1, new C15279y(), this.f78736a1.size());
            this.f78700R0 = m87745oL;
            if (m87745oL != null) {
                m87745oL.m92602UK(this.f72421L0.m92649TI(), "MenuListPopupView");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NO */
    protected CharSequence mo79394NO() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_discard_dialog_msg_general_v2);
        if (m85905ZP()) {
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
            if (profilePreviewAlbumItem != null && profilePreviewAlbumItem.getSize() == 0) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_created_empty_album);
            }
            if (m85950mP() || m85969rP()) {
                return Html.fromHtml(AbstractC23136l9.m118746s0(AbstractC8020f0.str_alert_cancel_post_album, m85859MO()));
            }
            return m118743r0;
        }
        return m118743r0;
    }

    /* renamed from: NR */
    void m85863NR(int i11) {
        try {
            if (i11 != 2) {
                int i12 = 0;
                if (i11 != 3) {
                    if (i11 == 5) {
                        View view = this.f78668H1;
                        if (view != null) {
                            if (!m85969rP()) {
                                i12 = 8;
                            }
                            view.setVisibility(i12);
                        }
                        m85942jT();
                        return;
                    }
                    throw new IllegalArgumentException("Refresh invalid tab: " + i11);
                }
                if (this.f78709T1) {
                    m85844HS(true);
                    return;
                }
                m85844HS(false);
                if (this.f78701R1 != null) {
                    if (this.f78737a2 == null) {
                        C24003n c24003n = new C24003n();
                        this.f78737a2 = c24003n;
                        c24003n.f116264e = 0;
                        c24003n.f116275p = true;
                        c24003n.f116276q = true;
                        c24003n.f116261b = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.no_image2);
                        C24003n c24003n2 = this.f78737a2;
                        c24003n2.f116271l = AbstractC16803z.no_image2;
                        c24003n2.f116262c = -3;
                    }
                    if (!TextUtils.isEmpty(this.f78701R1.f42625q)) {
                        this.f78725X1.setText(this.f78701R1.f42625q);
                    }
                    try {
                        if (!TextUtils.isEmpty(this.f78701R1.f42628t)) {
                            this.f78729Y1.setText(this.f78701R1.f42628t);
                        } else {
                            URI uri = new URI(this.f78701R1.f42624p);
                            if (!TextUtils.isEmpty(uri.getHost())) {
                                this.f78729Y1.setText(uri.getHost());
                            }
                        }
                    } catch (URISyntaxException unused) {
                        this.f78729Y1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.timeline_link_base_domain_invalid));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.f78729Y1.setText("");
                    }
                    this.f78721W1.setImageResource(AbstractC16803z.attach_gallery_96);
                    if (!TextUtils.isEmpty(this.f78701R1.f42626r)) {
                        ((C23528a) this.f78720W0.m123612r(this.f78721W1)).m123618x(this.f78701R1.f42626r, this.f78737a2);
                        return;
                    }
                    return;
                }
                m85923eO(false);
                return;
            }
            m85836FS(true);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: OO */
    String m85864OO() {
        LinkedHashMap linkedHashMap = this.f78736a1;
        if (linkedHashMap != null && linkedHashMap.size() != 0) {
            Iterator it = this.f78736a1.values().iterator();
            if (this.f78736a1.size() == 1) {
                return ((InviteContactProfile) it.next()).f42437s;
            }
            if (this.f78736a1.size() == 2) {
                return AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_x_and_y, ((InviteContactProfile) it.next()).f42437s, ((InviteContactProfile) it.next()).f42437s);
            }
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_x_and_y_and_others, ((InviteContactProfile) it.next()).f42437s, ((InviteContactProfile) it.next()).f42437s, Integer.valueOf(this.f78736a1.size() - 2));
        }
        return null;
    }

    /* renamed from: OP */
    public void m85865OP() {
        try {
            if (this.f78683M1 == null) {
                return;
            }
            if (mo79396QP(2)) {
                mo79383BS(2);
            } else {
                m85666IN();
                m85897WS(2);
                m85921dO(4, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OR */
    void m85866OR() {
        String str;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String m85864OO = m85864OO();
            boolean m85946lP = m85946lP();
            if (m85864OO != null && !m85946lP) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_with, m85864OO);
            } else if (m85864OO == null && m85946lP) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_at, this.f78745c2.m14727f());
            } else if (m85864OO != null && m85946lP) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_with_at, m85864OO, this.f78745c2.m14727f());
            } else {
                str = null;
            }
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" — ");
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilder2.setSpan(new StatusComposeEditText.TagColorSpan(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cMtxt5)), 0, spannableStringBuilder2.length(), 33);
                if (m85864OO != null) {
                    int indexOf = spannableStringBuilder2.toString().indexOf(m85864OO);
                    int length = m85864OO.length() + indexOf;
                    spannableStringBuilder2.setSpan(new StyleSpan(0), indexOf, length, 33);
                    spannableStringBuilder2.setSpan(new C15271q(), indexOf, length, 33);
                }
                if (m85946lP) {
                    int indexOf2 = spannableStringBuilder2.toString().indexOf(this.f78745c2.m14727f());
                    int length2 = this.f78745c2.m14727f().length() + indexOf2;
                    spannableStringBuilder2.setSpan(new StyleSpan(0), indexOf2, length2, 33);
                    spannableStringBuilder2.setSpan(new C15272r(indexOf2, length2), indexOf2, length2, 33);
                }
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            }
            if (spannableStringBuilder.length() > 0) {
                this.f78675J2.setMovementMethod(CustomMovementMethod.m56305e());
                this.f78675J2.setVisibility(0);
                this.f78675J2.setText(spannableStringBuilder);
                return;
            }
            this.f78675J2.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OS */
    void m85867OS(C20112a.e eVar) {
        Snackbar.m90634w(this.f78708T0, eVar.m104675b(), -1).m90644J(C27280g.m139659b(m92689tK(), eVar.m104674a(), AbstractC2808b.ng60)).m90648N();
        this.f78732Z0.setShowMusic(false);
        this.f78644A1.setShowMusic(false);
        AbstractC0924m0.m2995Dg(false);
    }

    @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
    /* renamed from: Og */
    public void mo75644Og(int i11, int i12) {
        this.f78712U0 = false;
        m85938iS();
        m85935hS();
        StatusComposeEditText statusComposeEditText = this.f78756f1;
        if (statusComposeEditText != null) {
            statusComposeEditText.clearFocus();
        }
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null && quickPickerView.m71254ZL() == -1) {
            m85684NS();
        }
        m85733dT();
        C13306b c13306b = this.f78839z4;
        if (c13306b != null) {
            c13306b.m74714z("tip.any", 200);
            this.f78839z4.m74685A("tip.any", 200, Boolean.TRUE);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.rw0

                /* renamed from: q */
                public final /* synthetic */ Bundle f81863q;

                public /* synthetic */ rw0(Bundle m92642L32) {
                    r2 = m92642L32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.this.m85674KQ(r2);
                }
            }, 300L);
        }
    }

    /* renamed from: PN */
    void m85868PN() {
        boolean z11;
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            if (this.f78726X2 && this.f78796p1.isEmpty() && this.f78662F1 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            quickPickerView.m71234SN(z11);
        }
    }

    /* renamed from: PP */
    public void m85869PP(C25630b c25630b) {
        try {
            if (mo79396QP(2)) {
                mo79383BS(2);
            } else {
                this.f78683M1 = c25630b;
                m85666IN();
                m85897WS(2);
                m85921dO(4, true);
                this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.qy0
                    public /* synthetic */ qy0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85656EQ();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PR */
    public void m85870PR() {
        try {
            m85866OR();
            m85856LR();
            m85872QR();
            LinkedHashMap linkedHashMap = this.f78736a1;
            if (linkedHashMap != null) {
                linkedHashMap.size();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PS */
    void m85871PS() {
        try {
            AbstractC2379w.m12430d(this.f78756f1);
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71283rO();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        QuickPickerView quickPickerView;
        try {
            quickPickerView = this.f78716V0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (quickPickerView != null && quickPickerView.m71255ZM()) {
            return this.f78716V0.mo37491QJ(i11);
        }
        QuickPickerView quickPickerView2 = this.f78716V0;
        if (quickPickerView2 != null) {
            int m71254ZL = quickPickerView2.m71254ZL();
            if (this.f78825w2 && (m71254ZL == 100 || m71254ZL == 102)) {
                return this.f78716V0.mo37491QJ(i11);
            }
        }
        if (i11 == 16908332) {
            m85971sO();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    /* renamed from: QO */
    String mo79395QO() {
        return "post_feed_multi_photo";
    }

    /* renamed from: QP */
    boolean mo79396QP(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i12 = this.f78803q4;
        if (i12 == i11) {
            return false;
        }
        if (i12 != 0 && i11 != 0 && i12 != 6 && i11 != 6) {
            return true;
        }
        if (i11 != 3 && (m85943kP() || this.f78709T1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 2 && m85965qP()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 != 4 && m85950mP()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i11 != 5 && m85969rP()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if ((i11 == 2 || i11 == 3) && m85957oP()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((i11 == 2 || i11 == 3) && m85961pP()) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (!z11 && !z12 && !z13 && !z14 && !z15 && !z16) {
            return false;
        }
        return true;
    }

    /* renamed from: QR */
    void m85872QR() {
        try {
            LinkedHashMap linkedHashMap = this.f78736a1;
            if (linkedHashMap != null) {
                linkedHashMap.size();
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
            this.f78839z4.m74709u();
            m85855Ka(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RR */
    void m85873RR() {
        try {
            this.f78684M2.m140548c0(C31845ac.m152996J().m153035N());
            this.f78684M2.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RS */
    void m85874RS(Class cls, Bundle bundle) {
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        this.f72421L0.m92662fJ().m93069k2(cls, bundle, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        String m14727f;
        C27373c c27373c;
        try {
            if (!TextUtils.isEmpty(m85875SO())) {
                bundle.putString("status_text", m85875SO());
            }
            LinkedHashMap linkedHashMap = this.f78736a1;
            if (linkedHashMap != null && linkedHashMap.size() > 0) {
                bundle.putParcelableArrayList("tag_profile_list", new ArrayList<>(this.f78736a1.values()));
            }
            PrivacyInfo privacyInfo = this.f78744c1;
            if (privacyInfo != null) {
                bundle.putInt("cur_privacy_type", privacyInfo.f45973p);
                bundle.putInt("cur_privacy_selected_id", this.f78744c1.f45977t);
            }
            bundle.putBoolean("extra_saved_is_redirect_media_picker", this.f78652C1);
            File file = this.f78792o1;
            if (file != null) {
                bundle.putString("cameraImageUri", file.getPath());
            }
            if (this.f78796p1 != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f78796p1.iterator();
                while (it.hasNext()) {
                    MediaItem mediaItem = (MediaItem) it.next();
                    if (mediaItem.m41173u0()) {
                        arrayList.add(mediaItem);
                    }
                }
                bundle.putParcelableArrayList("extra_saved_upload_photos", arrayList);
            }
            if (AbstractC23309i.m121565We() && (c27373c = this.f78662F1) != null) {
                bundle.putSerializable("extra_video_info", c27373c);
                if (!TextUtils.isEmpty(this.f78665G1)) {
                    bundle.putSerializable("extra_saved_video_camera_log", this.f78665G1);
                }
            }
            C3063z0 c3063z0 = this.f78745c2;
            if (c3063z0 != null && c3063z0.m14731j()) {
                bundle.putDouble("location_lon", this.f78745c2.m153170b());
                bundle.putDouble("location_lat", this.f78745c2.m153169a());
                String str = "";
                if (this.f78745c2.m14727f() == null) {
                    m14727f = "";
                } else {
                    m14727f = this.f78745c2.m14727f();
                }
                bundle.putString("location_desc", m14727f);
                String str2 = this.f78745c2.f12383h;
                if (str2 != null) {
                    str = str2;
                }
                bundle.putString("location_id", str);
            }
            bundle.putBoolean("enableThumb", this.f78735Z3);
            bundle.putSerializable("sticker", this.f78683M1);
            LinkAttachment linkAttachment = this.f78701R1;
            if (linkAttachment != null) {
                bundle.putParcelable("status_link", linkAttachment);
            }
            ArrayList arrayList2 = this.f78827w4;
            if (arrayList2 != null && arrayList2.size() > 0) {
                bundle.putStringArrayList("lastParsedLink", this.f78827w4);
            }
            bundle.putInt("currentMode", this.f78803q4);
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                bundle.putInt("curGridMode", quickPickerView.m71254ZL());
            }
            bundle.putSerializable("media_picker_source", this.f78829x2);
            ArrayList<? extends Parcelable> arrayList3 = this.f78833y2;
            if (arrayList3 != null) {
                bundle.putParcelableArrayList("extra_external_photos", arrayList3);
            }
            bundle.putBoolean("isShowingTypoGraphy", this.f78685M3);
            bundle.putBoolean("isAppledLastSelectedTypo", this.f78658D3);
            bundle.putBoolean("isOverNumEnter", this.f78679K3);
            C31890dc c31890dc = this.f78670H3;
            if (c31890dc != null) {
                bundle.putString("typo_selected", c31890dc.m153253y());
            }
            C31890dc c31890dc2 = this.f78673I3;
            if (c31890dc2 != null) {
                bundle.putString("typo_applied", c31890dc2.m153253y());
            }
            bundle.putInt("mCurrentStateEntryTypo", this.f78682L3);
            bundle.putInt("mCurrentModeCompose", this.f78661E3);
            bundle.putBoolean("isLastApplyModeBg", this.f78771i4);
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
            if (profilePreviewAlbumItem != null) {
                bundle.putString("profilePreviewAlbumItem", ProfilePreviewAlbumItem.Companion.m46321c(profilePreviewAlbumItem));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        super.mo37118SJ(bundle);
    }

    /* renamed from: SN */
    public void mo79398SN() {
        int i11;
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            if (!m85905ZP() && !mo79396QP(2) && m85899XP()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            quickPickerView.m71212GO(i11);
        }
    }

    /* renamed from: SO */
    String m85875SO() {
        try {
            String trim = this.f78756f1.getText().toString().trim();
            this.f78764h1 = trim;
            return trim;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: SP */
    boolean m85876SP() {
        try {
            if (m85875SO().length() > 0 || m85946lP() || m85965qP() || m85943kP() || m85950mP() || m85969rP()) {
                return false;
            }
            if (m85957oP() && (m85950mP() || m85969rP())) {
                return false;
            }
            LinkedHashMap linkedHashMap = this.f78736a1;
            if (linkedHashMap != null) {
                if (linkedHashMap.size() > 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: SR */
    public void m85877SR() {
        try {
            m85948lT();
            int i11 = 4;
            if (!mo79396QP(4)) {
                if (m85845IO() <= 0) {
                    i11 = 0;
                }
                m85897WS(i11);
                m85921dO(2, true);
                m85863NR(2);
            }
            m85868PN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: SS */
    void m85878SS() {
        try {
            C0820h.f2880z = null;
            StatusComposeEditText statusComposeEditText = this.f78756f1;
            if (statusComposeEditText != null) {
                statusComposeEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f78756f1.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
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
            actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            if (this.f78715U3 == null) {
                this.f78715U3 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.actionbar_leftview_compose_feed, (ViewGroup) null, false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                layoutParams.leftMargin = AbstractC23222t7.f112545X;
                this.f88760a0.m92707b(this.f78715U3, layoutParams);
                View view = this.f78715U3;
                if (view != null) {
                    RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.titleTv);
                    this.f78719V3 = robotoTextView;
                    if (robotoTextView != null) {
                        robotoTextView.setMaxScaledTextSize(AbstractC23222t7.f112586t);
                        this.f78719V3.setTextSize(0, AbstractC23222t7.f112586t);
                        this.f78719V3.setTypeface(C13718q1.m76694c(getContext(), 7));
                    }
                    RobotoTextView robotoTextView2 = (RobotoTextView) this.f78715U3.findViewById(AbstractC6918a0.subtitleTv);
                    this.f78723W3 = robotoTextView2;
                    if (robotoTextView2 != null) {
                        robotoTextView2.setMaxScaledTextSize(AbstractC23222t7.f112576o);
                        this.f78723W3.setTextSize(0, AbstractC23222t7.f112576o);
                    }
                    this.f78715U3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ex0
                        public /* synthetic */ ex0() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            UpdateStatusView.this.m85677LQ(view2);
                        }
                    });
                }
            }
            m85856LR();
        }
    }

    /* renamed from: TN */
    void m85879TN() {
        AbstractC2379w.m12430d(this.f78756f1);
        this.f72421L0.finish();
    }

    /* renamed from: TO */
    void m85880TO() {
        try {
            m85923eO(false);
            m85926fO(false);
            m85930gO(false);
            m85934hO(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: TP */
    boolean m85881TP() {
        return this.f78794o3 == 1;
    }

    /* renamed from: TR */
    List m85882TR() {
        String m41146h0;
        m85907ZS("begin removeDeletedPhotos: ");
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = this.f78796p1.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (!mediaItem.m41174v0()) {
                    if (AbstractC23254w8.m119859g(mediaItem.mo41081Q())) {
                        m41146h0 = mediaItem.mo41081Q();
                    } else {
                        m41146h0 = mediaItem.m41146h0();
                    }
                    if (TextUtils.isEmpty(m41146h0) || !AbstractC23041d2.m118194A(m41146h0)) {
                        arrayList.add(mediaItem);
                        it.remove();
                    }
                }
            }
        } catch (Exception e11) {
            m85907ZS("fail removeDeletedPhotos: " + e11.getMessage());
            e11.printStackTrace();
        }
        m85907ZS("end removeDeletedPhotos: " + arrayList.size());
        return arrayList;
    }

    /* renamed from: TS */
    void mo79399TS(boolean z11) {
        C0732w.Companion.m1189a().m1187q(mo79395QO(), "", mo79400ZN(z11), null);
    }

    /* renamed from: Tr */
    void m85883Tr() {
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null && quickPickerView.m71254ZL() != -1) {
            this.f78716V0.m71289vO();
        }
        m85938iS();
    }

    /* renamed from: U2 */
    void m85884U2() {
        try {
            MenuListPopupView menuListPopupView = this.f78700R0;
            if (menuListPopupView != null) {
                menuListPopupView.dismiss();
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

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f78839z4;
        if (c13306b != null) {
            c13306b.m74697c(this.f78647A4);
        }
    }

    /* renamed from: UN */
    void m85885UN() {
        try {
            this.f78737a2 = null;
            this.f78720W0 = null;
            C0820h.m2142e();
            C23418f.f113810a.m123077d();
            FeedStickerView feedStickerView = this.f78693P1;
            if (feedStickerView != null) {
                feedStickerView.m56563l();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UO */
    public void m85886UO() {
        try {
            this.f78749d2.setVisibility(8);
            C3063z0 c3063z0 = this.f78745c2;
            if (c3063z0 != null) {
                c3063z0.f12384i = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: UP */
    boolean m85887UP(C3000l0 c3000l0) {
        if (c3000l0 != null && c3000l0.m14322a0() != null && (c3000l0.m14322a0().f12058q == 2 || c3000l0.m14322a0().f12058q == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: UR */
    void m85888UR() {
        if (this.f78709T1) {
            return;
        }
        this.f78701R1 = null;
        m85921dO(3, false);
        m85863NR(3);
        m85855Ka(2);
        m85897WS(0);
    }

    /* renamed from: US */
    void m85889US(boolean z11, boolean z12) {
        try {
            if (!AbstractC23309i.m121491Ue()) {
                return;
            }
            this.f78661E3 = 1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78756f1.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            this.f78756f1.setVisibility(4);
            this.f78690O2.setVisibility(8);
            this.f78769i2.setVisibility(0);
            this.f78765h2.setVisibility(8);
            View view = this.f78820v1;
            if (view != null) {
                AbstractC23136l9.m118696b1(view, null);
            }
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71212GO(0);
            }
            m85839GS(false, false);
            m85880TO();
            m85701SQ(z12);
            if (z11) {
                m85915bS();
            }
            AbstractC23309i.m121502Up(1);
            mo79419nT();
            mo79389JR();
            m85960oT(this.f78803q4);
            this.f78811s4 = false;
            mo79401bT();
            m85733dT();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f78839z4;
        if (c13306b != null) {
            c13306b.m74701i();
        }
        C8009j c8009j = this.f78787m4;
        if (c8009j != null) {
            c8009j.dismiss();
        }
    }

    /* renamed from: VN */
    void m85890VN() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92662fJ().m92996E0("LOCATION_PICKER_VIEW_TAG");
            if (m92996E0 instanceof ShareLocationChatPickerView) {
                ((ShareLocationChatPickerView) m92996E0).dismiss();
            } else if (m92996E0 instanceof ShareLocationWithMapView) {
                m92996E0.f88756W = 0;
                m92996E0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VP */
    boolean m85891VP() {
        if (this.f78796p1.size() >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: VR */
    void m85892VR() {
        this.f78745c2 = null;
        m85866OR();
    }

    /* renamed from: VS */
    void m85893VS(boolean z11, boolean z12) {
        try {
            this.f78661E3 = 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78756f1.getLayoutParams();
            layoutParams.gravity = 51;
            layoutParams.topMargin = AbstractC23136l9.m118742r(16.0f);
            this.f78756f1.setVisibility(0);
            this.f78690O2.setVisibility(0);
            this.f78769i2.setVisibility(8);
            this.f78765h2.setVisibility(0);
            this.f78760g1.setTypeRender(0);
            this.f78760g1.m43644q(AbstractC6918a0.tag_visibility, 8);
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                quickPickerView.m71212GO(1);
            }
            m85919cS();
            m85693QQ(z12, z11);
            AbstractC23309i.m121502Up(0);
            mo79419nT();
            mo79403eT();
            m85960oT(this.f78803q4);
            this.f78811s4 = false;
            m85733dT();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WN */
    public void m85894WN() {
        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.fx0
            public /* synthetic */ fx0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85742gQ();
            }
        }, 300L);
    }

    /* renamed from: WO */
    void m85895WO(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.xx0

                    /* renamed from: q */
                    public final /* synthetic */ Intent f82678q;

                    public /* synthetic */ xx0(Intent intent2) {
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85767nQ(r2);
                    }
                }, 300L);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f78696Q0, e11);
            }
        }
    }

    /* renamed from: WR */
    void m85896WR(List list) {
        try {
            Collections.sort(list, Collections.reverseOrder());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f78833y2.remove(((Integer) it.next()).intValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WS */
    public void m85897WS(int i11) {
        try {
            this.f78803q4 = i11;
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                m85960oT(0);
                            } else {
                                m85960oT(5);
                            }
                        } else {
                            m85960oT(4);
                        }
                    } else {
                        m85960oT(3);
                    }
                } else {
                    m85960oT(2);
                }
            } else {
                m85960oT(0);
                m85938iS();
            }
            mo79419nT();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || this.f72421L0.m92683qJ()) {
                this.f78839z4.m74699e("tip.any");
                int i11 = this.f78722W2;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            m85799vR(this.f78750d3);
                            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154345T(C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM, 59)), false);
                            return;
                        }
                        return;
                    }
                    m85897WS(5);
                    m85921dO(5, true);
                    m85832ES(5, true);
                    return;
                }
                m85897WS(4);
                m85921dO(2, true);
                m85832ES(4, true);
            }
        }
    }

    /* renamed from: XO */
    void m85898XO(int i11, Intent intent) {
        AlbumListBottomSheet.EnumC8474b enumC8474b;
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("mode_select")) {
                    enumC8474b = (AlbumListBottomSheet.EnumC8474b) intent.getSerializableExtra("mode_select");
                } else {
                    enumC8474b = AlbumListBottomSheet.EnumC8474b.f46007p;
                }
                int i12 = C15245b0.f78847b[enumC8474b.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            this.f78783l4 = null;
                            mo79401bT();
                            m85967qT();
                            mo79403eT();
                            mo79398SN();
                            mo79419nT();
                            m85974sT();
                            m85942jT();
                            return;
                        }
                        return;
                    }
                    this.f78783l4 = (ProfilePreviewAlbumItem) intent.getParcelableExtra("selected_album_item");
                    m85795uT();
                    mo79401bT();
                    m85967qT();
                    mo79403eT();
                    mo79398SN();
                    mo79419nT();
                    m85974sT();
                    m85942jT();
                    m85713XN();
                    return;
                }
                m85642A4();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: XP */
    boolean m85899XP() {
        return this.f78661E3 == 0;
    }

    /* renamed from: XR */
    void m85900XR() {
        C27373c c27373c;
        if (this.f78716V0 != null && (c27373c = this.f78662F1) != null && !TextUtils.isEmpty(c27373c.m140262p())) {
            this.f78716V0.m71211GN(this.f78662F1.m140262p());
        }
        this.f78662F1 = null;
        this.f78665G1 = null;
        m85897WS(0);
        m85921dO(5, false);
        m85863NR(5);
        RedDotImageButton redDotImageButton = this.f78788n1;
        if (redDotImageButton != null) {
            redDotImageButton.setEnabled(true);
        }
    }

    /* renamed from: YO */
    void m85901YO(int i11, Intent intent) {
        try {
            if (i11 == -1 && intent != null) {
                MusicSelectResult m133690a = AbstractC25952c.m133690a(intent);
                if (m133690a != null) {
                    if (this.f78796p1.size() != 0) {
                        this.f78798p3 = false;
                        m85713XN();
                    }
                    m85883Tr();
                    this.f78762g3 = m133690a.m45748a();
                    this.f78766h3.m104604C0(m133690a.m45749b());
                    return;
                }
                return;
            }
            this.f78766h3.m104633m0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: YP */
    boolean m85902YP(MediaItem mediaItem, List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem2 = (MediaItem) it.next();
                if (mediaItem2.mo41081Q().equals(mediaItem.mo41081Q())) {
                    mediaItem.mo41082W0(mediaItem2.mo41081Q());
                    mediaItem.m41124T0(mediaItem2.m41113N());
                    mediaItem.m41153k1(mediaItem2.m41141e0());
                    mediaItem.m41116O0(mediaItem2.m41166q0());
                    mediaItem.m41110L0(mediaItem2.m41100F());
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: YS */
    void m85903YS(List list) {
        try {
            ArrayList arrayList = this.f78796p1;
            if (arrayList != null) {
                arrayList.clear();
            }
            m85715XS();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && mediaItem.m41173u0()) {
                    this.f78796p1.add(mediaItem);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f78646A3 = System.currentTimeMillis();
    }

    /* renamed from: ZN */
    C0708i mo79400ZN(boolean z11) {
        try {
            if (!z11) {
                this.f78806r3.m1072c("status", 1);
                this.f78806r3.m1072c("final_layout", this.f78774j3);
                this.f78806r3.m1072c("final_photo_count", this.f78796p1.size());
                if (C23212s8.m119603k()) {
                    this.f78806r3.m1075f("post_theme", "light");
                } else {
                    this.f78806r3.m1075f("post_theme", "dark");
                }
                if (m85961pP()) {
                    this.f78806r3.m1072c("has_music", 1);
                } else {
                    this.f78806r3.m1072c("has_music", 0);
                }
                if (this.f78736a1.size() > 0) {
                    this.f78806r3.m1072c("has_tagged_friend", 1);
                } else {
                    this.f78806r3.m1072c("has_tagged_friend", 0);
                }
            } else {
                this.f78806r3.m1072c("status", 0);
            }
            this.f78806r3.m1072c("click_layout_button_count", this.f78814t3);
            this.f78806r3.m1072c("click_preview_background_count", this.f78818u3);
            this.f78806r3.m1072c("close_layout_sheet_count", this.f78822v3);
            JSONObject jSONObject = new JSONObject();
            for (int i11 = 0; i11 < this.f78810s3.length; i11++) {
                jSONObject.put(String.valueOf(i11), this.f78810s3[i11]);
            }
            this.f78806r3.m1074e("layout_choice_count", jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f78806r3;
    }

    /* renamed from: ZO */
    void m85904ZO(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("extra_selected_profiles") && intent.hasExtra("extra_list_id")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                    int intExtra = intent.getIntExtra("extra_list_id", -1);
                    if (intExtra != -1) {
                        PrivacyInfo.m45128M(intExtra, parcelableArrayListExtra);
                        if (parcelableArrayListExtra.size() == 0) {
                            m85953mT(50, true);
                        } else {
                            m85953mT(intExtra, true);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m85862MS();
    }

    /* renamed from: ZP */
    public boolean m85905ZP() {
        if (m85957oP() && m85899XP()) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.ax0.<init>(com.zing.zalo.ui.zviews.UpdateStatusView, float):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: ZR */
    public void m85906ZR(p716zh.C31890dc r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = p348mi.AbstractC23309i.m121491Ue()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L56
            boolean r0 = r11.m85899XP()     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto Ld
            goto L56
        Ld:
            com.zing.zalo.social.widget.StatusComposeEditText r0 = r11.f78756f1     // Catch: java.lang.Exception -> L51
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> L51
            com.zing.zalo.feed.components.FeedBackgroundView r0 = r11.f78760g1     // Catch: java.lang.Exception -> L51
            r2 = 1
            r0.setTypeRender(r2)     // Catch: java.lang.Exception -> L51
            com.zing.zalo.feed.components.FeedBackgroundView r0 = r11.f78760g1     // Catch: java.lang.Exception -> L51
            int r2 = com.zing.zalo.AbstractC6918a0.tag_visibility     // Catch: java.lang.Exception -> L51
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L51
            r0.m43644q(r2, r3)     // Catch: java.lang.Exception -> L51
            com.zing.zalo.feed.components.FeedBackgroundView r4 = r11.f78760g1     // Catch: java.lang.Exception -> L51
            r6 = 1
            r7 = 0
            java.lang.String r8 = r11.m85875SO()     // Catch: java.lang.Exception -> L51
            float r9 = r12.f146514t     // Catch: java.lang.Exception -> L51
            r10 = 7
            r5 = r12
            r4.m43641m(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L51
            r11.m85978tS(r12)     // Catch: java.lang.Exception -> L51
            r11.m85932gS()     // Catch: java.lang.Exception -> L51
            float r12 = r12.f146514t     // Catch: java.lang.Exception -> L51
            if (r13 == 0) goto L53
            android.os.Handler r13 = r11.f78710T2     // Catch: java.lang.Exception -> L51
            com.zing.zalo.ui.zviews.ax0 r0 = new com.zing.zalo.ui.zviews.ax0     // Catch: java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Exception -> L51
            boolean r12 = r11.f78667G3     // Catch: java.lang.Exception -> L51
            if (r12 == 0) goto L4b
            r2 = 50
            goto L4d
        L4b:
            r2 = 150(0x96, double:7.4E-322)
        L4d:
            r13.postDelayed(r0, r2)     // Catch: java.lang.Exception -> L51
            goto L53
        L51:
            r12 = move-exception
            goto L57
        L53:
            r11.f78667G3 = r1     // Catch: java.lang.Exception -> L51
            goto L5a
        L56:
            return
        L57:
            r12.printStackTrace()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.UpdateStatusView.m85906ZR(zh.dc, boolean):void");
    }

    /* renamed from: ZS */
    void m85907ZS(String str) {
    }

    /* renamed from: aO */
    MediaItem m85908aO(String str) {
        C23307g m118367a = AbstractC23067f6.m118367a(str);
        MediaItem mediaItem = new MediaItem();
        mediaItem.m41131X0(this.f78692P0.nextInt(Integer.MAX_VALUE) + "");
        mediaItem.mo41082W0(str);
        mediaItem.m41140d1(true);
        mediaItem.m41155l1(m118367a.f113474a);
        mediaItem.m41151j1(m118367a.f113475b);
        return mediaItem;
    }

    /* renamed from: aP */
    void m85909aP(int i11, Intent intent) {
        ArrayList parcelableArrayListExtra;
        int i12;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles")) != null) {
                    PrivacyInfo.m45127K(parcelableArrayListExtra);
                    if (parcelableArrayListExtra.size() == 0) {
                        i12 = 40;
                    } else {
                        i12 = 90;
                    }
                    m85953mT(i12, true);
                }
            } else {
                m85862MS();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: aQ */
    boolean m85910aQ() {
        return this.f78748d1 != null;
    }

    /* renamed from: aS */
    void m85911aS(String str) {
        try {
            if (AbstractC23309i.m121491Ue() && !m85899XP() && !m85899XP() && m85985xO() != null) {
                m85985xO().m71394uM(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            this.f78759f4 = editable;
            int length = editable.length();
            int i11 = f78642D4;
            if (length > i11 && m85875SO().length() > i11) {
                String m85875SO = m85875SO();
                if (m85875SO.length() > i11) {
                    m85861MR(m85875SO.substring(0, i11));
                } else {
                    m85892VR();
                }
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, Integer.valueOf(i11)));
            }
            this.f78710T2.removeCallbacks(this.f78763g4);
            this.f78710T2.postDelayed(this.f78763g4, 150L);
            m85939iT(editable.toString());
            if (m85899XP()) {
                if (this.f78771i4 && m85914bQ()) {
                    m85945kS();
                    return;
                }
                m85974sT();
                if (editable.length() == 0) {
                    this.f78756f1.setHintTextColor(this.f78673I3.m153238c());
                    return;
                }
                return;
            }
            m85828DR();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bO */
    void m85912bO(String str) {
        if (!mo79396QP(3) && !m85943kP() && !this.f78709T1) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;\\p{L}]*[-A-Za-z0-9+&@#/%=~_()|\\p{L}])", 42).matcher(AbstractC23244v8.m119747k(str));
                        if (matcher.find()) {
                            String group = matcher.group();
                            if (this.f78827w4.contains(group)) {
                                return;
                            }
                            this.f78827w4.add(group);
                            m85936iO(matcher.group());
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: bP */
    void m85913bP(int i11, Intent intent) {
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                    if (parcelableArrayListExtra.size() == 0) {
                        m85953mT(50, true);
                    } else {
                        m85953mT(PrivacyInfo.m45129a(parcelableArrayListExtra), true);
                    }
                }
            } else {
                m85862MS();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bQ */
    boolean m85914bQ() {
        try {
            int m119758v = AbstractC23244v8.m119758v(this.f78756f1.getText().toString(), System.getProperty("line.separator"));
            if (m85875SO().length() > C31845ac.f146175z) {
                return false;
            }
            if (m119758v > f78643E4) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: bS */
    void m85915bS() {
        try {
            if (AbstractC23309i.m121491Ue() && !m85899XP() && !m85899XP() && m85985xO() != null) {
                m85985xO().m71397xM(m85985xO().m71389kM());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bT */
    public void mo79401bT() {
        int i11;
        int i12;
        int i13;
        if (m85910aQ()) {
            m85972sP();
            return;
        }
        int i14 = 0;
        if (m85957oP()) {
            this.f78774j3 = 0;
        }
        LinearLayout linearLayout = this.f78785m2;
        if (m85956oO()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(linearLayout, i11);
        RelativeLayout relativeLayout = this.f78793o2;
        if (m85956oO()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(relativeLayout, i12);
        if (this.f78793o2.getVisibility() == 0) {
            DecorItem decorItem = this.f78783l4.getThemeInfo().getDecorItem();
            GradientDrawable gradientDrawable = (GradientDrawable) this.f78793o2.getBackground();
            if (gradientDrawable != null) {
                gradientDrawable.setColor(decorItem.getBgColor());
                gradientDrawable.setStroke(AbstractC23136l9.m118742r(0.5f), decorItem.getBgStrokeColor());
            }
            boolean z11 = !decorItem.getDecorUrl().isEmpty();
            RecyclingImageView recyclingImageView = this.f78805r2;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            recyclingImageView.setVisibility(i13);
            if (z11) {
                ((C23528a) this.f78720W0.m123612r(this.f78805r2)).m123618x(decorItem.getDecorUrl(), C23278z2.m120080L());
            }
        }
        LinearLayout linearLayout2 = this.f78789n2;
        if (!mo79420pO() || m85937iP()) {
            i14 = 8;
        }
        AbstractC23136l9.m118744r1(linearLayout2, i14);
        m85758kT();
        ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
        if (profilePreviewAlbumItem != null) {
            this.f78801q2.setText(profilePreviewAlbumItem.getTitle());
            this.f78648B1.setImageResource(AbstractC16803z.ic_chevron_down_line_16);
            this.f78797p2.setTextColor(this.f78783l4.getThemeInfo().getAlbumCaptionColor());
            this.f78801q2.setTextColor(this.f78783l4.getThemeInfo().getContent().getTextColor01());
            this.f78648B1.setColorFilter(this.f78783l4.getThemeInfo().getContent().getArrowColor(), PorterDuff.Mode.SRC_IN);
        }
        m85856LR();
        mo79389JR();
        mo79419nT();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* renamed from: cO */
    void m85916cO(boolean z11) {
        try {
            if (m85950mP()) {
                m85921dO(2, true);
                m85863NR(2);
            } else if (m85969rP()) {
                m85921dO(5, true);
                m85863NR(5);
            } else if (m85965qP()) {
                m85865OP();
            } else if (m85943kP()) {
                m85921dO(3, true);
                m85863NR(3);
            } else if (z11) {
                m85855Ka(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cP */
    void m85917cP(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                this.f78745c2 = LocationPickerView.m71998dN(intent);
                m85853KR();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: cQ */
    boolean m85918cQ() {
        try {
            int childCount = this.f78678K2.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (this.f78678K2.getChildAt(i11).getWidth() < this.f78699Q3) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: cS */
    void m85919cS() {
        try {
            if (!m85899XP()) {
                return;
            }
            m85984wS(this.f78682L3);
            m85839GS(this.f78685M3, true);
            this.f78684M2.m140551f0(this.f78670H3);
            C31845ac.m152996J().m153074y0(this.f78756f1, this.f78673I3, true);
            m85932gS();
            m85974sT();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cT */
    int m85920cT(EnumC15261j0 enumC15261j0) {
        int i11 = C15245b0.f78846a[enumC15261j0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (this.f78695P3.get() > 0) {
                    return this.f78695P3.decrementAndGet();
                }
                this.f78695P3.set(0);
            }
        } else if (this.f78695P3.get() <= 0) {
            this.f78695P3.set(1);
        } else {
            return this.f78695P3.incrementAndGet();
        }
        return this.f78695P3.get();
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        return m85803wO();
    }

    /* renamed from: dO */
    public void m85921dO(int i11, boolean z11) {
        if (z11) {
            try {
                mo79409jS(true);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        m85855Ka(0);
                        m85897WS(0);
                        return;
                    }
                    m85934hO(z11);
                    if (z11) {
                        RedDotImageButton redDotImageButton = this.f78659E1;
                        redDotImageButton.setImageDrawable(AbstractC23136l9.m118665N(redDotImageButton.getContext(), AbstractC16803z.icn_video_o));
                        this.f78788n1.setEnabled(false);
                        this.f78697Q1.setEnabled(false);
                        this.f78819u4 = 5;
                        m85926fO(false);
                        m85923eO(false);
                        m85930gO(false);
                    }
                } else {
                    m85930gO(z11);
                    if (z11) {
                        this.f78788n1.setEnabled(false);
                        this.f78659E1.setEnabled(false);
                        this.f78697Q1.setEnabled(false);
                        this.f78819u4 = 4;
                        m85926fO(false);
                        m85934hO(false);
                        m85923eO(false);
                    }
                }
            } else {
                m85923eO(z11);
                if (z11) {
                    RedDotImageButton redDotImageButton2 = this.f78697Q1;
                    redDotImageButton2.setImageDrawable(AbstractC23136l9.m118665N(redDotImageButton2.getContext(), AbstractC16803z.im_postfeed_link_o));
                    this.f78788n1.setEnabled(false);
                    this.f78659E1.setEnabled(false);
                    this.f78819u4 = 3;
                    m85863NR(3);
                    m85930gO(false);
                    m85926fO(false);
                    m85934hO(false);
                    m85894WN();
                }
            }
        } else {
            m85926fO(z11);
            if (z11 && (m85950mP() || m85961pP())) {
                this.f78659E1.setEnabled(false);
                this.f78697Q1.setEnabled(false);
                this.f78819u4 = 2;
                m85934hO(false);
                m85923eO(false);
                m85930gO(false);
            }
        }
        mo79419nT();
        m85843HR();
        mo79389JR();
        mo79401bT();
        m85967qT();
        mo79403eT();
        mo79398SN();
    }

    /* renamed from: dP */
    void m85922dP(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("extra_selected_profiles")) {
                    ArrayList<InviteContactProfile> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                    this.f78736a1.clear();
                    if (parcelableArrayListExtra != null) {
                        for (InviteContactProfile inviteContactProfile : parcelableArrayListExtra) {
                            if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                                inviteContactProfile.f42437s = AbstractC21935u.m114542i(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                                this.f78736a1.put(inviteContactProfile.f42434r, inviteContactProfile);
                            }
                        }
                    }
                    m85870PR();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: eO */
    public void m85923eO(boolean z11) {
        int i11;
        RelativeLayout relativeLayout = this.f78713U1;
        if (relativeLayout != null) {
            if (z11 && m85899XP()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            relativeLayout.setVisibility(i11);
        }
    }

    /* renamed from: eP */
    protected void mo79402eP(C25630b c25630b) {
        m85869PP(c25630b);
    }

    /* renamed from: eS */
    void m85924eS(boolean z11, boolean z12) {
        try {
            C31890dc m153044X = C31845ac.m152996J().m153044X();
            this.f78684M2.m140551f0(m153044X);
            m85928fS(m153044X, false);
            if (z12) {
                m85959oS(0);
            }
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_download_failed_typo));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eT */
    public void mo79403eT() {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (m85899XP() && (m85937iP() || m85940jP() || m85957oP() || m85961pP())) {
            z11 = true;
        } else {
            z11 = false;
        }
        ControlComposeButtonView controlComposeButtonView = this.f78644A1;
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        controlComposeButtonView.setVisibility(i11);
        ControlComposeButtonView controlComposeButtonView2 = this.f78732Z0;
        if (!z11) {
            i12 = 0;
        }
        controlComposeButtonView2.setVisibility(i12);
        ControlComposeButtonView controlComposeButtonView3 = this.f78732Z0;
        if (!m85910aQ() && !m85957oP() && !m85937iP() && m85899XP()) {
            z12 = true;
        } else {
            z12 = false;
        }
        controlComposeButtonView3.setShowAlbum(z12);
        ControlComposeButtonView controlComposeButtonView4 = this.f78732Z0;
        if (!m85943kP() && !m85965qP()) {
            z13 = true;
        } else {
            z13 = false;
        }
        controlComposeButtonView4.setEnableAlbum(z13);
        ControlComposeButtonView controlComposeButtonView5 = this.f78732Z0;
        if (this.f78746c3.booleanValue() && !m85961pP() && !m85940jP() && m85899XP() && AbstractC0924m0.m3278N9()) {
            z14 = true;
        } else {
            z14 = false;
        }
        controlComposeButtonView5.setShowMusic(z14);
        ControlComposeButtonView controlComposeButtonView6 = this.f78732Z0;
        if (this.f78746c3.booleanValue() && !m85943kP() && !m85965qP()) {
            z15 = true;
        } else {
            z15 = false;
        }
        controlComposeButtonView6.setEnableMusic(z15);
        ControlComposeButtonView controlComposeButtonView7 = this.f78644A1;
        if (!m85910aQ() && m85937iP() && !m85957oP() && !m85961pP()) {
            z16 = true;
        } else {
            z16 = false;
        }
        controlComposeButtonView7.setShowAlbum(z16);
        ControlComposeButtonView controlComposeButtonView8 = this.f78644A1;
        if (this.f78746c3.booleanValue() && m85940jP() && !m85957oP() && !m85961pP() && AbstractC0924m0.m3278N9()) {
            z17 = true;
        } else {
            z17 = false;
        }
        controlComposeButtonView8.setShowMusic(z17);
        ControlComposeButtonView controlComposeButtonView9 = this.f78644A1;
        if (!m85881TP() || !m85891VP() || m85957oP()) {
            z18 = false;
        }
        controlComposeButtonView9.setShowMultiPhotoLayoutBottomSheet(z18);
        if (m85961pP()) {
            this.f78644A1.m45919s(m85710WP());
        }
        m85758kT();
        m85733dT();
        m85696RN(200L);
    }

    /* renamed from: f4 */
    void m85925f4() {
        try {
            m85884U2();
            this.f72421L0.m92662fJ().m93066i2(PrivacyPickGroupView.class, null, 1018, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fO */
    void m85926fO(boolean z11) {
        m85836FS(z11);
    }

    /* renamed from: fP */
    void m85927fP(List list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f78833y2.size(); i11++) {
                if (!m85902YP((MediaItem) this.f78833y2.get(i11), list)) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            m85896WR(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fS */
    public void m85928fS(C31890dc c31890dc, boolean z11) {
        try {
            C31845ac.m152996J().m153074y0(this.f78756f1, c31890dc, true);
            m85990zS(c31890dc);
            if (z11) {
                m85873RR();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: fT */
    void m85929fT() {
        boolean z11;
        boolean z12;
        ControlComposeButtonView controlComposeButtonView = this.f78644A1;
        boolean z13 = false;
        if (this.f78746c3.booleanValue() && m85961pP() && this.f78731Y3) {
            z11 = true;
        } else {
            z11 = false;
        }
        controlComposeButtonView.setShowLyric(z11);
        ControlComposeButtonView controlComposeButtonView2 = this.f78644A1;
        if (this.f78746c3.booleanValue() && this.f78727X3) {
            z12 = true;
        } else {
            z12 = false;
        }
        controlComposeButtonView2.setEnableLyric(z12);
        ControlComposeButtonView controlComposeButtonView3 = this.f78644A1;
        if (this.f78746c3.booleanValue() && m85961pP() && !this.f78731Y3) {
            z13 = true;
        }
        controlComposeButtonView3.setShowNoLyric(z13);
    }

    /* renamed from: gO */
    void m85930gO(boolean z11) {
        if (this.f78686N1 != null) {
            if (z11 && m85899XP()) {
                this.f78686N1.setVisibility(0);
            } else {
                this.f78686N1.setVisibility(8);
            }
        }
    }

    /* renamed from: gP */
    void m85931gP(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qx0

                    /* renamed from: q */
                    public final /* synthetic */ Intent f81756q;

                    public /* synthetic */ qx0(Intent intent2) {
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85770oQ(r2);
                    }
                }, 300L);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(this.f78696Q0, e11);
            }
        }
    }

    /* renamed from: gS */
    public void m85932gS() {
        try {
            float m85821BO = m85821BO();
            String obj = this.f78756f1.getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                C28652r.m143349v().m143362X(this.f78756f1.getText(), m85821BO);
            } else {
                m85939iT(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gT */
    void m85933gT() {
        try {
            this.f78710T2.removeCallbacks(this.f78799p4);
            int i11 = this.f78795o4;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        m85871PS();
                        return;
                    }
                    return;
                }
                if (i11 == 1) {
                    QuickPickerView quickPickerView = this.f78716V0;
                    if (quickPickerView != null) {
                        quickPickerView.m71292xM();
                    }
                    this.f78710T2.post(this.f78799p4);
                } else if (i11 == 2) {
                    AbstractC2379w.m12430d(this.f78756f1);
                    m85883Tr();
                }
                this.f78756f1.setFocusable(true);
                m85938iS();
                return;
            }
            AbstractC2379w.m12430d(this.f78756f1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f78696Q0, e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateStatusView";
    }

    /* renamed from: hO */
    void m85934hO(boolean z11) {
        if (this.f78668H1 != null) {
            if (z11 && m85969rP()) {
                this.f78668H1.setVisibility(0);
                ((C23528a) this.f78720W0.m123612r(this.f78671I1)).m123618x(this.f78662F1.m140268v(), C23278z2.m120126f0());
                RobotoTextView robotoTextView = this.f78677K1;
                if (robotoTextView != null) {
                    robotoTextView.setText(AbstractC3460h.m17440h(this.f78662F1.m140264r()));
                    if (this.f78662F1.m140264r() > 0) {
                        this.f78677K1.setVisibility(0);
                    } else {
                        this.f78677K1.setVisibility(8);
                    }
                }
                m85942jT();
                return;
            }
            this.f78668H1.setVisibility(8);
            this.f78668H1.setVerticalScrollbarPosition(8);
        }
    }

    /* renamed from: hP */
    public void mo79405hP() {
        AbstractC2379w.m12430d(this.f78756f1);
        C27373c c27373c = this.f78662F1;
        if (c27373c != null) {
            ZaloCameraView m116167s = AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 11112, 0, CameraInputParams.m39204n(c27373c));
            if (m116167s != null) {
                m116167s.f40833A1 = true;
            }
        }
    }

    /* renamed from: hR */
    protected void mo79406hR() {
        String str;
        try {
            ArrayList<C3000l0> m137786e = C26767v.m137782d().m137786e();
            long mo124311f = C23793c.m124316k().mo124311f();
            JSONArray jSONArray = new JSONArray();
            if (m137786e != null) {
                for (C3000l0 c3000l0 : m137786e) {
                    if (c3000l0 != null && c3000l0.m14322a0() != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (c3000l0.m14322a0().m14488S()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
                        jSONObject.put("time_in_queue", Math.round(((float) (mo124311f - c3000l0.m14322a0().f12062u)) / 3600000.0f));
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("size", jSONArray.length());
            jSONObject2.put("local_feeds", jSONArray);
            C0815e1.m2075D().m2100V(new C23648e(57, "form_post_feed", 0, "post_feed_with_queue_local", jSONObject2.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: hS */
    void m85935hS() {
        int i11;
        try {
            if (m85899XP()) {
                return;
            }
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                i11 = quickPickerView.m71254ZL();
            } else {
                i11 = -1;
            }
            this.f78773j2.setImageResource(AbstractC16803z.bg_btn_postfeed_addsticker);
            if (i11 == 102 && !this.f78712U0) {
                this.f78773j2.setImageResource(AbstractC16803z.ic_postfeed_keyboard);
            }
            this.f78777k2.setImageResource(AbstractC16803z.icon_postfeed_bg);
            if (!this.f78712U0 && i11 == 108) {
                this.f78777k2.setImageResource(AbstractC16803z.icon_postfeed_bg_active);
            }
            this.f78781l2.setImageResource(AbstractC16803z.icn_arrow_down);
            if (!this.f78712U0 && i11 == -1) {
                this.f78781l2.setImageResource(AbstractC16803z.icn_arrow_up);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iO */
    public void m85936iO(String str) {
        if (!this.f78709T1 && str != null && str.length() != 0) {
            try {
                C0766k c0766k = new C0766k();
                this.f78701R1 = null;
                this.f78709T1 = true;
                m85897WS(3);
                m85921dO(3, true);
                m85844HS(true);
                c0766k.mo1704o8(this.f78823v4);
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.zx0

                    /* renamed from: q */
                    public final /* synthetic */ InterfaceC0765j f82889q;

                    /* renamed from: r */
                    public final /* synthetic */ String f82890r;

                    public /* synthetic */ zx0(InterfaceC0765j c0766k2, String str2) {
                        r2 = c0766k2;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85750iQ(r2, r3);
                    }
                }, 300L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: iP */
    boolean m85937iP() {
        if (!m85950mP() && !m85969rP()) {
            return false;
        }
        return true;
    }

    /* renamed from: iS */
    void m85938iS() {
        mo79409jS(false);
    }

    /* renamed from: iT */
    void m85939iT(String str) {
        try {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78756f1.getLayoutParams();
            int m152997W = C31845ac.m152997W(m85824CO().f146515u);
            if (m85899XP()) {
                layoutParams.width = -1;
                this.f78756f1.setTextAlignment(m152997W);
                this.f78756f1.requestLayout();
            } else if (m152997W == 4) {
                if (!TextUtils.isEmpty(str)) {
                    layoutParams.width = -1;
                    this.f78756f1.setTextAlignment(m152997W);
                    this.f78756f1.requestLayout();
                } else {
                    layoutParams.width = -2;
                    this.f78756f1.setTextAlignment(2);
                    this.f78756f1.requestLayout();
                }
            } else {
                layoutParams.width = -1;
                this.f78756f1.setTextAlignment(m152997W);
                this.f78756f1.requestLayout();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jO */
    void mo79408jO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        LinkAttachment linkAttachment = this.f78701R1;
        C3023p3 c3023p3 = this.f78741b2;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c20112a.m104605D0(str, linkAttachment, c3023p3, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, z11, this.f78838z3);
    }

    /* renamed from: jP */
    boolean m85940jP() {
        return m85950mP();
    }

    /* renamed from: jR */
    public void m85941jR() {
        ArrayList arrayList;
        if (this.f78716V0 != null && (arrayList = this.f78833y2) != null) {
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                MediaItem mediaItem = (MediaItem) it.next();
                if (mediaItem != null && mediaItem.m41173u0()) {
                    i11++;
                }
            }
            this.f78716V0.m71269gt(i11);
        }
    }

    /* renamed from: jS */
    public void mo79409jS(boolean z11) {
        int i11;
        try {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                i11 = quickPickerView.m71254ZL();
            } else {
                i11 = -1;
            }
            RedDotImageButton redDotImageButton = this.f78680L1;
            if (redDotImageButton != null) {
                redDotImageButton.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addsticker));
                if (i11 == 102 && !this.f78712U0) {
                    this.f78680L1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_postfeed_keyboard));
                }
            }
            RedDotImageButton redDotImageButton2 = this.f78788n1;
            if (redDotImageButton2 != null) {
                redDotImageButton2.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addphoto));
                if (i11 == 100 && !this.f78712U0 && !mo79396QP(4)) {
                    this.f78788n1.setEnabled(true);
                    this.f78788n1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.im_postfeed_photo_o));
                }
            }
            RedDotImageButton redDotImageButton3 = this.f78659E1;
            if (redDotImageButton3 != null) {
                redDotImageButton3.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addvideo));
                if (i11 == 101 && !this.f78712U0 && !mo79396QP(5)) {
                    this.f78659E1.setEnabled(true);
                    this.f78659E1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_video_o));
                }
            }
            if (z11 || (!m85943kP() && !m85950mP() && !m85965qP() && !m85969rP() && !m85957oP() && !m85961pP())) {
                RedDotImageButton redDotImageButton4 = this.f78788n1;
                if (redDotImageButton4 != null) {
                    redDotImageButton4.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addphoto));
                    this.f78788n1.setEnabled(true);
                    if (i11 == 100 && !this.f78712U0 && !mo79396QP(4)) {
                        this.f78788n1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.im_postfeed_photo_o));
                    }
                }
                RedDotImageButton redDotImageButton5 = this.f78659E1;
                if (redDotImageButton5 != null) {
                    redDotImageButton5.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addvideo));
                    this.f78659E1.setEnabled(true);
                    if (i11 == 101 && !this.f78712U0 && !mo79396QP(5)) {
                        this.f78659E1.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_video_o));
                    }
                }
                RedDotImageButton redDotImageButton6 = this.f78697Q1;
                if (redDotImageButton6 != null) {
                    redDotImageButton6.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed_addlink));
                    this.f78697Q1.setEnabled(true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jT */
    void m85942jT() {
        View view = this.f78668H1;
        if (view != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (m85957oP()) {
                int m118742r = AbstractC23136l9.m118742r(8.0f);
                layoutParams.leftMargin = m118742r;
                layoutParams.rightMargin = m118742r;
            } else {
                int m118742r2 = AbstractC23136l9.m118742r(16.0f);
                layoutParams.leftMargin = m118742r2;
                layoutParams.rightMargin = m118742r2;
            }
        }
    }

    /* renamed from: kO */
    void mo79411kO() {
        boolean z11;
        boolean z12;
        if (!m85899XP() && this.f78780l1.isChecked() && this.f78718V2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f78698Q2 = new TrackingSource(3);
        }
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        if (this.f78748d1 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        c20112a.m104609I0(str, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, z12, z11, this.f78838z3);
    }

    /* renamed from: kP */
    public boolean m85943kP() {
        if (m85899XP() && this.f78701R1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: kR */
    void m85944kR() {
        this.f78766h3.m104637q0(this.f78838z3);
        m85879TN();
    }

    /* renamed from: kS */
    void m85945kS() {
        try {
            this.f78711T3.m75655j(true, false);
            m85889US(true, false);
            this.f78771i4 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lO */
    void mo79413lO() {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        this.f78752e1 = false;
        m85907ZS("begin doUploadPhotoStatus: ");
        if (m85845IO() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m85845IO();
        List m71242VL = this.f78716V0.m71242VL();
        this.f78698Q2.m40677a("entry_music", Integer.valueOf(this.f78702R2));
        this.f78698Q2.m40677a("cate_music", Integer.valueOf(this.f78762g3));
        if (z11) {
            C20112a c20112a = this.f78766h3;
            String str = this.f78764h1;
            C3003l3 m85980vO = m85980vO();
            C3063z0 c3063z0 = this.f78745c2;
            PrivacyInfo m85818AO = m85818AO();
            C31890dc m85824CO = m85824CO();
            TrackingSource trackingSource = this.f78698Q2;
            SongInfo songInfo = this.f78758f3;
            ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
            ArrayList arrayList = this.f78796p1;
            if (this.f78748d1 != null) {
                z13 = true;
            }
            c20112a.m104607F0(str, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, songInfo, m71242VL, profilePreviewAlbumItem, arrayList, z13, this.f78838z3);
            return;
        }
        C20112a c20112a2 = this.f78766h3;
        String str2 = this.f78764h1;
        ArrayList arrayList2 = this.f78796p1;
        boolean z14 = this.f78730Y2;
        C3003l3 m85980vO2 = m85980vO();
        C3063z0 c3063z02 = this.f78745c2;
        PrivacyInfo m85818AO2 = m85818AO();
        C31890dc m85824CO2 = m85824CO();
        TrackingSource trackingSource2 = this.f78698Q2;
        SongInfo songInfo2 = this.f78758f3;
        ProfilePreviewAlbumItem profilePreviewAlbumItem2 = this.f78783l4;
        if (this.f78748d1 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        c20112a2.m104606E0(str2, arrayList2, z14, m85980vO2, c3063z02, m85818AO2, m85824CO2, trackingSource2, songInfo2, profilePreviewAlbumItem2, m71242VL, z12, this.f78778k3, this.f78838z3);
        mo79399TS(false);
    }

    /* renamed from: lP */
    boolean m85946lP() {
        C3063z0 c3063z0 = this.f78745c2;
        if (c3063z0 != null && c3063z0.m14731j()) {
            return true;
        }
        return false;
    }

    /* renamed from: lR */
    public void mo79414lR(C18460c c18460c) {
        String str;
        C3063z0 c3063z0;
        try {
            this.f78735Z3 = true;
            m85883Tr();
            m85890VN();
            if (!TextUtils.isEmpty(c18460c.f93021b)) {
                str = c18460c.f93021b;
            } else if (!TextUtils.isEmpty(c18460c.f93022c)) {
                str = c18460c.f93022c;
            } else {
                str = "";
            }
            String str2 = str;
            if (c18460c.f93025f != -1.0d && c18460c.f93026g != -1.0d && !TextUtils.isEmpty(str2)) {
                c3063z0 = new C3063z0(c18460c.f93020a, c18460c.f93025f, c18460c.f93026g, str2, true);
            } else {
                c3063z0 = null;
            }
            this.f78745c2 = c3063z0;
            m85853KR();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: lS */
    void m85947lS() {
        if (m85965qP()) {
            m85865OP();
        }
    }

    /* renamed from: lT */
    void m85948lT() {
        boolean z11;
        try {
            if (this.f78730Y2) {
                m85836FS(true);
                ArrayList arrayList = new ArrayList();
                C19587j c19587j = C19587j.f97307a;
                List mo102461d = c19587j.m102530f(this.f78774j3).mo102461d(this.f78796p1);
                int mo102465h = c19587j.m102530f(this.f78774j3).mo102465h();
                Iterator it = this.f78796p1.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    MediaItem mediaItem = (MediaItem) it.next();
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.m40513X(mediaItem, true);
                    if (i11 < mo102461d.size()) {
                        itemAlbumMobile.f42596r0 = (ItemAlbumMobile.C7883c) mo102461d.get(i11);
                    }
                    arrayList.add(itemAlbumMobile);
                    i11++;
                }
                this.f78751d4.clear();
                this.f78755e4.clear();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.f78751d4.put(i12, 0);
                }
                this.f78755e4.put(0, 0);
                this.f78747c4.m105861G(new C2370r0(this.f78804r1));
                this.f78747c4.m105857C(this.f78751d4);
                this.f78747c4.m105858D(this.f78755e4);
                this.f78747c4.m105855A(true);
                if (m85891VP()) {
                    m85732dS(this.f78774j3);
                    m85751iR(this.f78774j3);
                    this.f78832y1.m43592f0(this.f78774j3);
                    m85719YR(this.f78774j3);
                } else {
                    m85732dS(0);
                    if (this.f78796p1.size() > 0) {
                        this.f78832y1.m43592f0(0);
                    }
                    m85751iR(0);
                    m85719YR(0);
                }
                m85988yS();
                this.f78804r1.setUseFileCache(false);
                this.f78804r1.setSourceActionLog(1000);
                C8884o c8884o = new C8884o(arrayList, 0, AbstractC20826v0.m108824n0(0), -1);
                FeedGridModulesView feedGridModulesView = this.f78804r1;
                if (arrayList.size() == 1 && mo79385DN()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                feedGridModulesView.m47296W(c8884o, 0, true, z11, this.f78774j3);
                this.f78804r1.m47298Y(c8884o, false, 0, new AbstractC20826v0.j() { // from class: com.zing.zalo.ui.zviews.rx0
                    public /* synthetic */ rx0() {
                    }

                    @Override // is.AbstractC20826v0.j
                    /* renamed from: a */
                    public final void mo87393a(int i13, int i14, int i15) {
                        UpdateStatusView.this.m85726bR(i13, i14, i15);
                    }
                });
                this.f78804r1.setItemClickListener(new C15269o(mo102465h));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = this.f78796p1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C27486n((MediaItem) it2.next()));
            }
            this.f78800q1.removeAllViews();
            LinearLayout linearLayout = new LinearLayout(this.f72421L0.m92648SI());
            linearLayout.setOrientation(0);
            this.f78800q1.addView(linearLayout);
            int size = arrayList2.size();
            if (size > 0 && size < 9) {
                View inflate = this.f72421L0.m92676n2().getLayoutInflater().inflate(AbstractC7409c0.status_photos_grid_item, (ViewGroup) this.f78800q1, false);
                linearLayout.addView(inflate);
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) inflate.findViewById(AbstractC6918a0.imvPhoto);
                aspectRatioImageView.setScaleOption(1);
                aspectRatioImageView.setImageResource(AbstractC16803z.ic_addphoto_postfeed_n);
                aspectRatioImageView.setBackgroundResource(AbstractC16803z.rectangle_white);
                aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.sx0
                    public /* synthetic */ sx0() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UpdateStatusView.this.m85728cR(view);
                    }
                });
                inflate.findViewById(AbstractC6918a0.btnRemove).setVisibility(8);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                View inflate2 = this.f72421L0.m92676n2().getLayoutInflater().inflate(AbstractC7409c0.status_photos_grid_item, (ViewGroup) this.f78800q1, false);
                linearLayout.addView(inflate2);
                AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) inflate2.findViewById(AbstractC6918a0.imvPhoto);
                aspectRatioImageView2.setScaleOption(1);
                aspectRatioImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.tx0

                    /* renamed from: q */
                    public final /* synthetic */ int f82245q;

                    public /* synthetic */ tx0(int i132) {
                        r2 = i132;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UpdateStatusView.this.m85731dR(r2, view);
                    }
                });
                ((C23528a) this.f78720W0.m123612r(aspectRatioImageView2)).m123618x(m85841HO((MediaItem) this.f78796p1.get(i132)), C23278z2.m120136k0());
                inflate2.findViewById(AbstractC6918a0.btnRemove).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ux0

                    /* renamed from: q */
                    public final /* synthetic */ int f82348q;

                    public /* synthetic */ ux0(int i132) {
                        r2 = i132;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UpdateStatusView.this.m85736eR(r2, view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: le */
    public void m85949le(int i11) {
        try {
            if (i11 == 0) {
                this.f78811s4 = true;
                this.f78710T2.postDelayed(this.f78815t4, 400L);
            } else if (i11 == 1 || i11 == 3) {
                this.f78710T2.removeCallbacks(this.f78815t4);
                this.f78807r4++;
                if (!this.f78710T2.hasMessages(2)) {
                    this.f78710T2.sendEmptyMessage(2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mO */
    void mo79416mO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        C25630b c25630b = this.f78683M1;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c20112a.m104608G0(str, m85980vO, c3063z0, m85818AO, m85824CO, trackingSource, c25630b, z11, this.f78838z3);
    }

    /* renamed from: mP */
    public boolean m85950mP() {
        ArrayList arrayList;
        if (m85899XP() && (arrayList = this.f78796p1) != null && arrayList.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: mR */
    void m85951mR() {
        try {
            List m153035N = C31845ac.m152996J().m153035N();
            if (m153035N.size() > 1 && m85899XP()) {
                this.f78687N2.setVisibility(8);
                this.f78765h2.setVisibility(0);
                this.f78684M2.m140548c0(m153035N);
                this.f78684M2.m10008p();
            } else {
                this.f78687N2.setVisibility(8);
                this.f78765h2.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mS */
    public void m85693QQ(boolean z11, boolean z12) {
        try {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null && quickPickerView.f65908G0) {
                m85955nS(z11, z12);
                return;
            }
            m85916cO(z12);
            mo79389JR();
            if (z11) {
                if (this.f78716V0.m71254ZL() != 102) {
                    this.f78716V0.m71283rO();
                }
                StatusComposeEditText statusComposeEditText = this.f78756f1;
                if (statusComposeEditText != null) {
                    statusComposeEditText.requestFocus();
                }
                if (!this.f78712U0) {
                    AbstractC2379w.m12432f(this.f78756f1);
                }
                m85938iS();
                return;
            }
            int i11 = this.f78803q4;
            if (i11 != 0 && i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        if (i11 != 6) {
                            m85832ES(4, false);
                            return;
                        }
                    } else {
                        m85832ES(i11, false);
                        return;
                    }
                } else {
                    StatusComposeEditText statusComposeEditText2 = this.f78756f1;
                    if (statusComposeEditText2 != null) {
                        statusComposeEditText2.requestFocus();
                    }
                    if (!this.f78712U0) {
                        AbstractC2379w.m12432f(this.f78756f1);
                        return;
                    }
                    return;
                }
            }
            AbstractC2379w.m12430d(this.f78756f1);
            if (this.f78716V0.m71254ZL() != 102) {
                this.f78716V0.m71283rO();
            }
            m85938iS();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mT */
    void m85953mT(int i11, boolean z11) {
        PrivacyInfo privacyInfo = this.f78744c1;
        if (i11 != privacyInfo.f45977t || z11) {
            privacyInfo.f45977t = i11;
            if (i11 != 40) {
                if (i11 != 50) {
                    if (i11 != 90) {
                        if (!z11) {
                            AbstractC23647d.m123906p("13430");
                            AbstractC23647d.m123893c();
                        }
                        this.f78744c1 = PrivacyInfo.m45134q(i11);
                    } else {
                        this.f78744c1 = PrivacyInfo.m45133i();
                    }
                } else {
                    if (!z11) {
                        AbstractC23647d.m123906p("13420");
                        AbstractC23647d.m123893c();
                    }
                    this.f78744c1.f45973p = 1;
                }
            } else {
                if (!z11) {
                    AbstractC23647d.m123906p("13410");
                    AbstractC23647d.m123893c();
                }
                this.f78744c1.f45973p = 0;
            }
            m85856LR();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
    /* renamed from: n8 */
    public void mo75645n8(int i11, int i12) {
        this.f78712U0 = true;
        m85938iS();
        m85935hS();
        m85792uP();
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null && !quickPickerView.m71251YM() && !this.f78716V0.m71255ZM()) {
            this.f78716V0.m71214HO();
        }
        m85733dT();
        this.f78839z4.m74702j("tip.postfeed.camera");
    }

    /* renamed from: nO */
    void mo79417nO() {
        boolean z11;
        C20112a c20112a = this.f78766h3;
        String str = this.f78764h1;
        C27373c c27373c = this.f78662F1;
        C3003l3 m85980vO = m85980vO();
        C3063z0 c3063z0 = this.f78745c2;
        PrivacyInfo m85818AO = m85818AO();
        String str2 = this.f78665G1;
        C31890dc m85824CO = m85824CO();
        TrackingSource trackingSource = this.f78698Q2;
        ProfilePreviewAlbumItem profilePreviewAlbumItem = this.f78783l4;
        if (this.f78748d1 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c20112a.m104610J0(str, c27373c, m85980vO, c3063z0, m85818AO, str2, m85824CO, trackingSource, profilePreviewAlbumItem, z11, this.f78838z3);
    }

    /* renamed from: nP */
    public boolean mo79418nP() {
        if (!m85943kP() && !m85950mP() && !m85969rP() && !m85965qP() && !m85957oP() && !m85961pP()) {
            return false;
        }
        return true;
    }

    /* renamed from: nR */
    void m85954nR(C20096c c20096c) {
        try {
            if (!m85899XP()) {
                return;
            }
            m85855Ka(2);
            m85897WS(0);
            if (c20096c != null) {
                if (c20096c.m104491c() == 1003) {
                    m85829DS(14);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_link_invalid));
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                }
            }
            m85863NR(3);
            m85921dO(3, false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: nS */
    void m85955nS(boolean z11, boolean z12) {
        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ix0

            /* renamed from: q */
            public final /* synthetic */ boolean f80727q;

            /* renamed from: r */
            public final /* synthetic */ boolean f80728r;

            public /* synthetic */ ix0(boolean z112, boolean z122) {
                r2 = z112;
                r3 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85693QQ(r2, r3);
            }
        }, 300L);
    }

    /* renamed from: nT */
    public void mo79419nT() {
        try {
            if (this.f78703R3 != null && this.f78756f1 != null && this.f78707S3 != null) {
                boolean z11 = false;
                if (m85899XP()) {
                    if (m85875SO().trim().length() <= 0 && !m85965qP() && !m85943kP() && !m85950mP() && !m85969rP()) {
                        z11 = true;
                    }
                    this.f78707S3.setEnabled(!z11);
                    return;
                }
                if (m85875SO().trim().length() <= 0) {
                    z11 = true;
                }
                this.f78707S3.setEnabled(!z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oO */
    boolean m85956oO() {
        if (m85957oP() && m85899XP()) {
            return true;
        }
        return false;
    }

    /* renamed from: oP */
    public boolean m85957oP() {
        return this.f78783l4 != null;
    }

    /* renamed from: oR */
    public void m85958oR() {
        int i11 = 0;
        try {
            if (!m85899XP()) {
                return;
            }
            m85863NR(3);
            if (this.f78701R1 != null) {
                m85897WS(3);
                m85921dO(3, true);
                m85844HS(false);
            } else {
                m85855Ka(2);
                m85897WS(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (this.f78701R1 != null) {
                i11 = 3;
            }
            m85897WS(i11);
        }
    }

    /* renamed from: oS */
    public void m85959oS(int i11) {
        Handler handler = this.f78710T2;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.px0

                /* renamed from: q */
                public final /* synthetic */ int f81641q;

                public /* synthetic */ px0(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.this.m85699RQ(r2);
                }
            }, 200L);
        }
    }

    /* renamed from: oT */
    void m85960oT(int i11) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 100 && i11 != 101) {
                if (i11 != 1004) {
                    if (i11 != 1007) {
                        if (i11 != 2001) {
                            switch (i11) {
                                case 1017:
                                    m85913bP(i12, intent);
                                    break;
                                case 1018:
                                    m85913bP(i12, intent);
                                    break;
                                case 1019:
                                    m85904ZO(i12, intent);
                                    break;
                                case 1020:
                                    m85909aP(i12, intent);
                                    break;
                                case 1021:
                                    m85895WO(i12, intent);
                                    break;
                                case 1022:
                                    m85898XO(i12, intent);
                                    break;
                                case 1023:
                                    m85901YO(i12, intent);
                                    break;
                                case 1024:
                                    m85931gP(i12, intent);
                                    break;
                                default:
                                    switch (i11) {
                                    }
                            }
                        }
                        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.bx0

                            /* renamed from: q */
                            public final /* synthetic */ int f79967q;

                            /* renamed from: r */
                            public final /* synthetic */ int f79968r;

                            /* renamed from: s */
                            public final /* synthetic */ Intent f79969s;

                            public /* synthetic */ bx0(int i112, int i122, Intent intent2) {
                                r2 = i112;
                                r3 = i122;
                                r4 = intent2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateStatusView.this.m85667IQ(r2, r3, r4);
                            }
                        }, 200L);
                    } else {
                        m85922dP(i122, intent2);
                    }
                } else {
                    m85917cP(i122, intent2);
                }
            } else {
                QuickPickerView quickPickerView = this.f78716V0;
                if (quickPickerView != null) {
                    quickPickerView.onActivityResult(i112, i122, intent2);
                }
            }
            super.onActivityResult(i112, i122, intent2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void onClick(View view) {
        int i11;
        String str;
        int id2 = view.getId();
        int i12 = 1;
        if (id2 == AbstractC6918a0.imv_entry_typo) {
            try {
                C0708i c0708i = new C0708i();
                c0708i.m1072c("expanding_typo", this.f78685M3 ? 1 : 0);
                C0732w.Companion.m1189a().m1187q("click_typo_toggle", "", c0708i, null);
                if (this.f78682L3 == 0) {
                    if (this.f78685M3) {
                        AbstractC23647d.m123897g("1300104");
                    } else {
                        C13306b c13306b = this.f78839z4;
                        if (c13306b != null && c13306b.m74706o("tip.postfeed.typo")) {
                            str = "1300101";
                        } else {
                            str = "1300102";
                        }
                        AbstractC23647d.m123897g(str);
                    }
                    if (this.f78658D3 || this.f78685M3 || !m85830EN()) {
                        m85839GS(!this.f78685M3, true);
                    }
                } else if (m85957oP()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_typo_album));
                } else {
                    if (this.f78679K3) {
                        i11 = AbstractC8020f0.str_over_line_applied_typo;
                    } else {
                        i11 = AbstractC8020f0.str_over_limit_applied_typo;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                }
                this.f78839z4.m74689E("tip.postfeed.typo");
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int i13 = -1;
        if (id2 == AbstractC6918a0.btn_post_attach_photo) {
            C0732w.Companion.m1189a().m1187q("click_icon_photo", "", null, null);
            AbstractC23647d.m123906p("13800");
            if (mo79396QP(4)) {
                mo79383BS(4);
            } else {
                if (this.f78712U0) {
                    this.f78712U0 = false;
                    AbstractC2379w.m12430d(this.f78756f1);
                    QuickPickerView quickPickerView = this.f78716V0;
                    if (quickPickerView != null) {
                        quickPickerView.m71281pO(false, new SensitiveData("gallery_post_photo_feed", "social_timeline"));
                    }
                } else {
                    QuickPickerView quickPickerView2 = this.f78716V0;
                    if (quickPickerView2 != null) {
                        i13 = quickPickerView2.m71254ZL();
                    }
                    QuickPickerView quickPickerView3 = this.f78716V0;
                    if (quickPickerView3 != null) {
                        if (i13 == 100) {
                            m85883Tr();
                        } else {
                            quickPickerView3.m71281pO(false, new SensitiveData("gallery_post_photo_feed", "social_timeline"));
                        }
                    }
                }
                m85938iS();
            }
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.btn_post_attach_video) {
            C0732w.Companion.m1189a().m1187q("click_icon_video", "", null, null);
            if (mo79396QP(5)) {
                mo79383BS(5);
            } else {
                if (this.f78712U0) {
                    this.f78712U0 = false;
                    AbstractC2379w.m12430d(this.f78756f1);
                    QuickPickerView quickPickerView4 = this.f78716V0;
                    if (quickPickerView4 != null) {
                        quickPickerView4.m71284sO(false, new SensitiveData("gallery_post_video_feed", "social_timeline"));
                    }
                } else {
                    QuickPickerView quickPickerView5 = this.f78716V0;
                    if (quickPickerView5 != null) {
                        i13 = quickPickerView5.m71254ZL();
                    }
                    QuickPickerView quickPickerView6 = this.f78716V0;
                    if (quickPickerView6 != null) {
                        if (i13 == 101) {
                            m85883Tr();
                        } else {
                            quickPickerView6.m71284sO(false, new SensitiveData("gallery_post_video_feed", "social_timeline"));
                        }
                    }
                }
                m85938iS();
                this.f78839z4.m74689E("tip.postfeed.video");
            }
            AbstractC23647d.m123897g("136000");
            return;
        }
        if (id2 == AbstractC6918a0.btn_post_attach_sticker) {
            try {
                AbstractC23647d.m123906p("13100");
                QuickPickerView quickPickerView7 = this.f78716V0;
                if (quickPickerView7 != null) {
                    if (!this.f78712U0 && quickPickerView7.m71254ZL() == 102) {
                        i12 = 0;
                    }
                    if (!this.f78712U0 && this.f78716V0.m71254ZL() == 102) {
                        StatusComposeEditText statusComposeEditText = this.f78756f1;
                        if (statusComposeEditText != null) {
                            statusComposeEditText.requestFocus();
                        }
                        if (!this.f78712U0) {
                            AbstractC2379w.m12432f(this.f78756f1);
                        }
                    } else {
                        AbstractC2379w.m12430d(this.f78756f1);
                        m85897WS(6);
                        if (this.f78716V0.m71254ZL() != 102) {
                            this.f78716V0.m71283rO();
                        }
                    }
                    C0708i c0708i2 = new C0708i();
                    c0708i2.m1072c("icon_sticker", i12);
                    C0732w.Companion.m1189a().m1187q("click_button_sticker", "", c0708i2, null);
                }
                m85938iS();
                AbstractC23647d.m123893c();
                this.f78839z4.m74689E("tip.postfeed.sticker");
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_post_attach_link) {
            try {
                C0732w.Companion.m1189a().m1187q("click_icon_link", "", null, null);
                AbstractC23647d.m123906p("13120");
                if (mo79396QP(3)) {
                    mo79383BS(3);
                } else if (!this.f78709T1) {
                    m85829DS(14);
                    m85894WN();
                }
                AbstractC23647d.m123893c();
                this.f78839z4.m74689E("tip.postfeed.link");
                return;
            } catch (Exception e13) {
                e13.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_post_attach_location) {
            C0732w.Companion.m1189a().m1187q("click_icon_location", "", null, null);
            m85847IS();
            return;
        }
        if (id2 == AbstractC6918a0.statusAnchor) {
            StatusComposeEditText statusComposeEditText2 = this.f78756f1;
            if (statusComposeEditText2 != null) {
                statusComposeEditText2.requestFocus();
            }
            if (!this.f78712U0) {
                AbstractC2379w.m12432f(this.f78756f1);
            }
            m85830EN();
            return;
        }
        if (id2 == AbstractC6918a0.feed_sticker_preview_delete) {
            try {
                this.f78683M1 = null;
                m85897WS(0);
                m85921dO(4, false);
                m85863NR(4);
                mo79419nT();
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        if (id2 == AbstractC6918a0.link_preview_delete) {
            m85888UR();
            return;
        }
        if (id2 == AbstractC6918a0.container_detail_album) {
            this.f78813t2.m154212l(35);
            m85820AS();
            return;
        }
        if (id2 == AbstractC6918a0.layoutVideoFeed) {
            mo79405hP();
            AbstractC23647d.m123897g("136001");
            return;
        }
        if (id2 == AbstractC6918a0.imv_video_feed_remove) {
            m85900XR();
            AbstractC23647d.m123897g("136002");
            return;
        }
        if (id2 == AbstractC6918a0.btn_bg_attach_kb) {
            if (this.f78716V0 != null) {
                C0708i c0708i3 = new C0708i();
                if (this.f78716V0.m71254ZL() != 102) {
                    i12 = 0;
                }
                c0708i3.m1072c("icon_sticker", i12);
                C0732w.Companion.m1189a().m1187q("click_icon_sticker", "", c0708i3, null);
                if (!this.f78712U0 && this.f78716V0.m71254ZL() == 102) {
                    StatusComposeEditText statusComposeEditText3 = this.f78756f1;
                    if (statusComposeEditText3 != null) {
                        statusComposeEditText3.requestFocus();
                    }
                    if (!this.f78712U0) {
                        AbstractC2379w.m12432f(this.f78756f1);
                    }
                } else {
                    AbstractC2379w.m12430d(this.f78756f1);
                    m85897WS(6);
                    if (this.f78716V0.m71254ZL() != 102) {
                        this.f78716V0.m71283rO();
                    }
                }
                m85935hS();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_post_attach_bg_feed) {
            C0732w.Companion.m1189a().m1187q("click_button_show_bg_list", "", null, null);
            m85897WS(0);
            m85701SQ(false);
            AbstractC23647d.m123897g("13603");
            return;
        }
        if (id2 == AbstractC6918a0.btn_post_attach_bg_arrow_down) {
            QuickPickerView quickPickerView8 = this.f78716V0;
            if (quickPickerView8 != null) {
                if (quickPickerView8.m71254ZL() == -1) {
                    m85701SQ(false);
                } else {
                    AbstractC2379w.m12430d(this.f78756f1);
                    this.f78716V0.m71289vO();
                    m85935hS();
                }
            }
            AbstractC23647d.m123897g("13604");
            return;
        }
        if (id2 == AbstractC6918a0.ic_thumb_location_remove) {
            this.f78735Z3 = false;
            m85886UO();
            return;
        }
        if (id2 == AbstractC6918a0.imv_thumb_location) {
            m85847IS();
            return;
        }
        if (id2 == AbstractC6918a0.tv_post_story) {
            if (this.f78780l1 != null) {
                this.f78780l1.setChecked(!r11.isChecked());
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.empty_photo_album) {
            this.f78698Q2 = new TrackingSource(34);
            m85832ES(4, true);
        } else if (id2 == AbstractC6918a0.empty_photo_music) {
            m85832ES(4, true);
        } else if (id2 == AbstractC6918a0.btn_photo_grid_add) {
            m85832ES(4, true);
            AbstractC23647d.m123897g("13710");
            C0732w.Companion.m1189a().m1187q("click_button_add_more_photo", "", null, null);
        }
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_STOP)
    void onEnterBackground() {
        C20112a c20112a = this.f78766h3;
        if (c20112a != null) {
            c20112a.m104645y0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f77813M0) {
                if (this.f72421L0.m92656bJ() != null) {
                    this.f72421L0.m92656bJ().onKeyUp(i11, keyEvent);
                }
                return true;
            }
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null) {
                if (quickPickerView.m71255ZM()) {
                    return this.f78716V0.onKeyUp(i11, keyEvent);
                }
                if (this.f78825w2) {
                    return this.f78716V0.onKeyUp(i11, keyEvent);
                }
                if (this.f78716V0.m71254ZL() != -1) {
                    if (this.f78716V0.f65908G0) {
                        m85894WN();
                    } else {
                        m85883Tr();
                    }
                    return true;
                }
            }
            m85971sO();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.m92676n2().mo35554O(18);
        StatusComposeEditText statusComposeEditText = this.f78756f1;
        if (statusComposeEditText != null) {
            statusComposeEditText.setEnabled(true);
        }
        this.f78839z4.m74710v();
        m85947lS();
        m85848JN(300L);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        mo79419nT();
    }

    /* renamed from: pO */
    public boolean mo79420pO() {
        if (m85956oO() && !m85937iP()) {
            return true;
        }
        return false;
    }

    /* renamed from: pP */
    boolean m85961pP() {
        return this.f78754e3.booleanValue();
    }

    /* renamed from: pR */
    public void mo79421pR() {
        boolean z11;
        try {
            if (this.f78709T1) {
                return;
            }
            String m85875SO = m85875SO();
            this.f78764h1 = m85875SO;
            boolean z12 = false;
            if (m85875SO.length() <= 0 && !m85965qP() && !m85943kP() && !m85950mP() && !m85969rP()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m85899XP() && ((m85957oP() && !m85937iP()) || (m85961pP() && !m85940jP()))) {
                z12 = true;
            }
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_empty_inform));
            } else if (z12) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_status_need_photo));
            } else {
                m85823BR();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pS */
    public void m85701SQ(boolean z11) {
        try {
            QuickPickerView quickPickerView = this.f78716V0;
            if (quickPickerView != null && quickPickerView.f65908G0) {
                m85966qS(z11);
                return;
            }
            if (!AbstractC23309i.m121491Ue()) {
                return;
            }
            if (z11) {
                QuickPickerView quickPickerView2 = this.f78716V0;
                if (quickPickerView2 != null) {
                    quickPickerView2.m71271hO(false);
                }
                StatusComposeEditText statusComposeEditText = this.f78756f1;
                if (statusComposeEditText != null) {
                    statusComposeEditText.requestFocus();
                }
                if (!this.f78712U0) {
                    AbstractC2379w.m12432f(this.f78756f1);
                }
            } else if (this.f78803q4 == 6) {
                if (this.f78716V0 != null && m85985xO() == null) {
                    this.f78716V0.m71271hO(true);
                }
                AbstractC2379w.m12430d(this.f78756f1);
                QuickPickerView quickPickerView3 = this.f78716V0;
                if (quickPickerView3 != null && quickPickerView3.m71254ZL() != 102) {
                    this.f78716V0.m71283rO();
                }
            } else {
                AbstractC2379w.m12430d(this.f78756f1);
                QuickPickerView quickPickerView4 = this.f78716V0;
                if (quickPickerView4 != null) {
                    quickPickerView4.m71271hO(false);
                }
            }
            m85935hS();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pT */
    void m85963pT(int i11) {
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f78765h2.setImageResource(AbstractC16803z.icn_postfeed_typo_disable);
                }
            } else if (this.f78685M3) {
                this.f78765h2.setImageResource(AbstractC16803z.icn_postfeed_typo_back);
            } else {
                this.f78765h2.setImageResource(AbstractC16803z.icn_postfeed_typo_normal);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qO */
    public void m85964qO(Runnable runnable) {
        try {
            if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ() && this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().runOnUiThread(runnable);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qP */
    public boolean m85965qP() {
        if (m85899XP() && this.f78683M1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: qR */
    public void mo79422qR(C27373c c27373c, String str) {
        try {
            this.f78662F1 = c27373c;
            this.f78665G1 = str;
            if (AbstractC23309i.m121565We()) {
                if (mo79396QP(5)) {
                    mo79383BS(5);
                    return;
                }
                QuickPickerView quickPickerView = this.f78716V0;
                if (quickPickerView != null) {
                    quickPickerView.m71284sO(false, new SensitiveData("gallery_post_video_feed", "social_timeline"));
                }
                m85897WS(5);
                m85921dO(5, true);
                m85854KS();
            }
            this.f78726X2 = false;
            m85868PN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qS */
    void m85966qS(boolean z11) {
        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.mx0

            /* renamed from: q */
            public final /* synthetic */ boolean f81278q;

            public /* synthetic */ mx0(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85701SQ(r2);
            }
        }, 300L);
    }

    /* renamed from: qT */
    void m85967qT() {
        boolean z11;
        RedDotImageButton redDotImageButton = this.f78659E1;
        boolean z12 = false;
        if (!m85961pP() && !mo79396QP(5)) {
            z11 = true;
        } else {
            z11 = false;
        }
        redDotImageButton.setEnabled(z11);
        RedDotImageButton redDotImageButton2 = this.f78697Q1;
        if (!m85957oP() && !m85961pP()) {
            z12 = true;
        }
        redDotImageButton2.setEnabled(z12);
    }

    /* renamed from: rO */
    public void m85968rO(PrivacyInfo privacyInfo) {
        ArrayList arrayList;
        if (!this.f78736a1.isEmpty()) {
            int i11 = privacyInfo.f45973p;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && (arrayList = privacyInfo.f45974q) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.f78736a1.remove(((LikeContactItem) it.next()).m56333d());
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = privacyInfo.f45974q;
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((LikeContactItem) it2.next()).m56333d());
                        }
                    }
                    Iterator it3 = this.f78736a1.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (!arrayList2.contains(((Map.Entry) it3.next()).getKey())) {
                            it3.remove();
                        }
                    }
                }
            } else {
                this.f78736a1.clear();
            }
            m85870PR();
        }
    }

    /* renamed from: rP */
    public boolean m85969rP() {
        if (m85899XP() && this.f78662F1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: rT */
    void m85970rT(String str, String str2, int i11) {
        Drawable drawable;
        try {
            RobotoTextView robotoTextView = this.f78719V3;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
                Drawable m118665N = AbstractC23136l9.m118665N(this.f78719V3.getContext(), AbstractC16803z.ic_icn_form_dropdown);
                int m118742r = AbstractC23136l9.m118742r(22.0f);
                m118665N.setBounds(0, 0, m118742r, m118742r);
                if (i11 != -1) {
                    drawable = AbstractC23136l9.m118665N(this.f78719V3.getContext(), i11);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, AbstractC23136l9.m118742r(22.0f), AbstractC23136l9.m118742r(16.0f));
                }
                this.f78719V3.setCompoundDrawables(drawable, null, m118665N, null);
                this.f78719V3.setCompoundDrawablePadding(AbstractC23136l9.m118742r(2.0f));
            }
            RobotoTextView robotoTextView2 = this.f78723W3;
            if (robotoTextView2 != null) {
                robotoTextView2.setText(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sO */
    public void m85971sO() {
        if (!m85876SP()) {
            m85829DS(11);
            return;
        }
        FeedActionZUtils.m47534V(this.f72421L0.m92648SI(), this.f78657D2, 0, 0);
        if (this.f78653C2) {
            C20834z0.f102412a.m108927f(true);
            this.f78766h3.m104637q0(this.f78838z3);
            if (this.f72421L0.m92676n2() instanceof Activity) {
                AbstractC23136l9.m118678T0((Activity) this.f72421L0.m92676n2());
            }
            this.f72421L0.finish();
            return;
        }
        if (this.f78649B2) {
            m85829DS(17);
        } else {
            m85833FN();
        }
    }

    /* renamed from: sP */
    public void m85972sP() {
        AbstractC23136l9.m118744r1(this.f78785m2, 8);
        this.f78732Z0.setShowAlbum(false);
    }

    /* renamed from: sR */
    void m85973sR(MediaItem mediaItem, AnimationTarget animationTarget, C20275e c20275e, int i11, float f11) {
        if (c20275e != null) {
            try {
                c20275e.m105865K(i11);
                c20275e.m105862H(f11);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            quickPickerView.m71206DN(this.f78796p1, mediaItem, animationTarget, c20275e);
        }
        this.f78839z4.m74702j("tip.any");
    }

    /* renamed from: sT */
    public void m85974sT() {
        boolean z11;
        C31890dc c31890dc;
        try {
            if (this.f78670H3 != null && this.f78673I3 != null) {
                int m119758v = AbstractC23244v8.m119758v(this.f78756f1.getText().toString(), System.getProperty("line.separator"));
                String m85875SO = m85875SO();
                C31890dc m153044X = C31845ac.m152996J().m153044X();
                if (!m85957oP() && m85875SO.length() <= 70 && m119758v <= 2) {
                    int i11 = this.f78682L3;
                    m85984wS(0);
                    if (this.f78670H3.f146495a != this.f78673I3.f146495a) {
                        C31845ac.m152996J().m153074y0(this.f78756f1, this.f78670H3, true);
                        this.f78673I3 = this.f78670H3;
                        m85932gS();
                    }
                    if (i11 == 1 && !this.f78685M3 && (c31890dc = this.f78673I3) != null && !c31890dc.m153249t()) {
                        m85839GS(true, true);
                        return;
                    }
                    return;
                }
                m85984wS(1);
                if (m119758v > 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f78679K3 = z11;
                if (this.f78685M3) {
                    m85839GS(false, true);
                }
                if (!this.f78670H3.m153249t() && !this.f78673I3.m153249t()) {
                    C31845ac.m152996J().m153074y0(this.f78756f1, m153044X, true);
                    this.f78673I3 = m153044X;
                    m85932gS();
                    if (m85957oP()) {
                        if (AbstractC0924m0.m3163Ja()) {
                            AbstractC0924m0.m3460Th(false);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_typo_album));
                            return;
                        }
                        return;
                    }
                    if (this.f78679K3) {
                        if (!this.f78779k4) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_over_line_applied_typo));
                            this.f78779k4 = true;
                            return;
                        }
                        return;
                    }
                    if (!this.f78775j4) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_over_limit_applied_typo));
                        this.f78775j4 = true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tO */
    public void m85975tO(String str) {
        C23744a.m124114c().m124116d(22, str);
        if (this.f78645A2) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_sharefeedsuccess));
        }
        m85840HN(mo79391LO());
    }

    /* renamed from: tP */
    void m85976tP() {
        StatusComposeEditText statusComposeEditText;
        if (!m85899XP() && (statusComposeEditText = this.f78756f1) != null) {
            statusComposeEditText.setVisibility(4);
        }
    }

    /* renamed from: tR */
    void m85977tR() {
        try {
            if (this.f78712U0) {
                AbstractC2379w.m12430d(this.f78756f1);
            }
            if (this.f72421L0.m92648SI() != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("extra_from_update_status", true);
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("timeline_post_compose_location", "social_timeline"));
                this.f72421L0.m92662fJ().m93066i2(LocationPickerView.class, bundle, 1004, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tS */
    void m85978tS(C31890dc c31890dc) {
        this.f78664F3 = c31890dc;
        AbstractC23309i.m121206Mp(c31890dc.f146495a + "_" + c31890dc.f146509o);
    }

    /* renamed from: tT */
    void mo79423tT(C3000l0 c3000l0) {
        m85964qO(new Runnable() { // from class: com.zing.zalo.ui.zviews.ox0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f81519q;

            public /* synthetic */ ox0(C3000l0 c3000l02) {
                r2 = c3000l02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85739fR(r2);
            }
        });
    }

    /* renamed from: uR */
    void m85979uR(String str) {
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.gy0

            /* renamed from: q */
            public final /* synthetic */ String f80513q;

            public /* synthetic */ gy0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85679MQ(r2);
            }
        }, 3000L);
    }

    /* renamed from: vO */
    public C3003l3 m85980vO() {
        C3003l3 c3003l3 = new C3003l3();
        try {
            LinkedHashMap linkedHashMap = this.f78736a1;
            if (linkedHashMap != null && linkedHashMap.size() > 0) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i11 = 0;
                for (String str : this.f78736a1.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        linkedHashMap2.put(str, ((InviteContactProfile) this.f78736a1.get(str)).m40383Q(true, false));
                    }
                    i11++;
                }
                c3003l3.f11957b = linkedHashMap2;
                c3003l3.f11956a = i11;
                c3003l3.f11960e = true;
                c3003l3.mo14398k();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c3003l3;
    }

    /* renamed from: vP */
    void m85981vP() {
        this.f78785m2 = (LinearLayout) this.f78708T0.findViewById(AbstractC6918a0.layout_album);
        this.f78793o2 = (RelativeLayout) this.f78708T0.findViewById(AbstractC6918a0.container_detail_album);
        this.f78805r2 = (RecyclingImageView) this.f78708T0.findViewById(AbstractC6918a0.theme_decor);
        this.f78789n2 = (LinearLayout) this.f78708T0.findViewById(AbstractC6918a0.empty_photo_album);
        this.f78797p2 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.title);
        this.f78801q2 = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.desc);
        this.f78789n2.setOnClickListener(this);
        this.f78793o2.setOnClickListener(this);
    }

    /* renamed from: wP */
    void m85982wP() {
        int i11;
        try {
            FeedBackgroundView feedBackgroundView = (FeedBackgroundView) this.f78708T0.findViewById(AbstractC6918a0.bg_feed_view);
            this.f78760g1 = feedBackgroundView;
            feedBackgroundView.setModeUse(1);
            int i12 = 0;
            this.f78760g1.setModeView(0);
            this.f78769i2 = (LinearLayout) this.f78708T0.findViewById(AbstractC6918a0.updateBgFunctionBar);
            RedDotImageButton redDotImageButton = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_bg_attach_kb);
            this.f78773j2 = redDotImageButton;
            redDotImageButton.setOnClickListener(this);
            RedDotImageButton redDotImageButton2 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_bg_feed);
            this.f78777k2 = redDotImageButton2;
            redDotImageButton2.setOnClickListener(this);
            RedDotImageButton redDotImageButton3 = (RedDotImageButton) this.f78708T0.findViewById(AbstractC6918a0.btn_post_attach_bg_arrow_down);
            this.f78781l2 = redDotImageButton3;
            redDotImageButton3.setOnClickListener(this);
            this.f78781l2.setVisibility(8);
            CheckBox checkBox = (CheckBox) this.f78708T0.findViewById(AbstractC6918a0.cb_post_story);
            this.f78780l1 = checkBox;
            checkBox.setChecked(true);
            CheckBox checkBox2 = this.f78780l1;
            if (this.f78718V2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            checkBox2.setVisibility(i11);
            RobotoTextView robotoTextView = (RobotoTextView) this.f78708T0.findViewById(AbstractC6918a0.tv_post_story);
            this.f78784m1 = robotoTextView;
            robotoTextView.setOnClickListener(this);
            RobotoTextView robotoTextView2 = this.f78784m1;
            if (!this.f78718V2) {
                i12 = 8;
            }
            robotoTextView2.setVisibility(i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wR */
    void m85983wR() {
        ArrayList arrayList;
        try {
            m85884U2();
            ArrayList arrayList2 = new ArrayList();
            PrivacyInfo privacyInfo = PrivacyInfo.f45972v;
            if (privacyInfo != null && (arrayList = privacyInfo.f45974q) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    arrayList2.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                }
            }
            Bundle m83055pM = ProfilePickerView.m83055pM(arrayList2, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putBoolean("extra_type_exclude_friends", true);
            m83055pM.putBoolean("allow_empty_pick", true);
            this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 1020, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wS */
    void m85984wS(int i11) {
        this.f78682L3 = i11;
        m85963pT(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        this.f78710T2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gx0

            /* renamed from: q */
            public final /* synthetic */ int f80508q;

            public /* synthetic */ gx0(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UpdateStatusView.this.m85746hQ(r2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0395 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:8:0x0048, B:10:0x004c, B:11:0x0057, B:13:0x0062, B:15:0x0068, B:17:0x006e, B:18:0x0072, B:20:0x0078, B:23:0x0080, B:26:0x0088, B:32:0x0090, B:34:0x00a3, B:35:0x00ab, B:37:0x00b1, B:38:0x00b9, B:42:0x00db, B:44:0x00ec, B:46:0x0105, B:48:0x010f, B:49:0x0112, B:51:0x0120, B:52:0x012b, B:54:0x0133, B:56:0x013b, B:57:0x0142, B:58:0x0145, B:60:0x014b, B:62:0x0161, B:63:0x0169, B:65:0x0179, B:66:0x0181, B:68:0x0187, B:70:0x018f, B:71:0x0196, B:73:0x01e0, B:74:0x01e6, B:76:0x0202, B:93:0x0287, B:95:0x028d, B:96:0x029c, B:97:0x02f2, B:99:0x02f6, B:101:0x0305, B:102:0x030b, B:103:0x0322, B:105:0x0358, B:108:0x035d, B:110:0x0365, B:111:0x038e, B:113:0x0395, B:114:0x03cc, B:116:0x03e5, B:117:0x03ed, B:128:0x03c4, B:129:0x036b, B:131:0x0372, B:132:0x0376, B:134:0x037a, B:135:0x0389, B:138:0x0283, B:140:0x00e1, B:141:0x02a0, B:143:0x02a8, B:145:0x02b7, B:147:0x02bc, B:148:0x02be, B:150:0x02c2, B:152:0x02c8, B:153:0x02ec, B:78:0x0205, B:80:0x0236, B:82:0x0240, B:84:0x0250, B:86:0x0258, B:88:0x025e, B:90:0x0268), top: B:6:0x0046, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03e5 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:8:0x0048, B:10:0x004c, B:11:0x0057, B:13:0x0062, B:15:0x0068, B:17:0x006e, B:18:0x0072, B:20:0x0078, B:23:0x0080, B:26:0x0088, B:32:0x0090, B:34:0x00a3, B:35:0x00ab, B:37:0x00b1, B:38:0x00b9, B:42:0x00db, B:44:0x00ec, B:46:0x0105, B:48:0x010f, B:49:0x0112, B:51:0x0120, B:52:0x012b, B:54:0x0133, B:56:0x013b, B:57:0x0142, B:58:0x0145, B:60:0x014b, B:62:0x0161, B:63:0x0169, B:65:0x0179, B:66:0x0181, B:68:0x0187, B:70:0x018f, B:71:0x0196, B:73:0x01e0, B:74:0x01e6, B:76:0x0202, B:93:0x0287, B:95:0x028d, B:96:0x029c, B:97:0x02f2, B:99:0x02f6, B:101:0x0305, B:102:0x030b, B:103:0x0322, B:105:0x0358, B:108:0x035d, B:110:0x0365, B:111:0x038e, B:113:0x0395, B:114:0x03cc, B:116:0x03e5, B:117:0x03ed, B:128:0x03c4, B:129:0x036b, B:131:0x0372, B:132:0x0376, B:134:0x037a, B:135:0x0389, B:138:0x0283, B:140:0x00e1, B:141:0x02a0, B:143:0x02a8, B:145:0x02b7, B:147:0x02bc, B:148:0x02be, B:150:0x02c2, B:152:0x02c8, B:153:0x02ec, B:78:0x0205, B:80:0x0236, B:82:0x0240, B:84:0x0250, B:86:0x0258, B:88:0x025e, B:90:0x0268), top: B:6:0x0046, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c4 A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:8:0x0048, B:10:0x004c, B:11:0x0057, B:13:0x0062, B:15:0x0068, B:17:0x006e, B:18:0x0072, B:20:0x0078, B:23:0x0080, B:26:0x0088, B:32:0x0090, B:34:0x00a3, B:35:0x00ab, B:37:0x00b1, B:38:0x00b9, B:42:0x00db, B:44:0x00ec, B:46:0x0105, B:48:0x010f, B:49:0x0112, B:51:0x0120, B:52:0x012b, B:54:0x0133, B:56:0x013b, B:57:0x0142, B:58:0x0145, B:60:0x014b, B:62:0x0161, B:63:0x0169, B:65:0x0179, B:66:0x0181, B:68:0x0187, B:70:0x018f, B:71:0x0196, B:73:0x01e0, B:74:0x01e6, B:76:0x0202, B:93:0x0287, B:95:0x028d, B:96:0x029c, B:97:0x02f2, B:99:0x02f6, B:101:0x0305, B:102:0x030b, B:103:0x0322, B:105:0x0358, B:108:0x035d, B:110:0x0365, B:111:0x038e, B:113:0x0395, B:114:0x03cc, B:116:0x03e5, B:117:0x03ed, B:128:0x03c4, B:129:0x036b, B:131:0x0372, B:132:0x0376, B:134:0x037a, B:135:0x0389, B:138:0x0283, B:140:0x00e1, B:141:0x02a0, B:143:0x02a8, B:145:0x02b7, B:147:0x02bc, B:148:0x02be, B:150:0x02c2, B:152:0x02c8, B:153:0x02ec, B:78:0x0205, B:80:0x0236, B:82:0x0240, B:84:0x0250, B:86:0x0258, B:88:0x025e, B:90:0x0268), top: B:6:0x0046, inners: #1 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37135xJ(Bundle bundle) {
        String str;
        ContactProfile contactProfile;
        SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet;
        File file;
        ArrayList parcelableArrayList;
        super.mo37135xJ(bundle);
        try {
            m85989zP(this.f72421L0.m92642L3(), bundle);
            m85986xP(this.f72421L0.m92642L3(), bundle);
            this.f78766h3.m104602A0();
            str = "profilePreviewAlbumItem";
        } catch (Exception e11) {
            str = "profilePreviewAlbumItem";
            AbstractC23350e.m122776f(this.f78696Q0, e11);
        }
        try {
            if (bundle != null) {
                if (this.f78736a1 == null) {
                    this.f78736a1 = new LinkedHashMap();
                }
                this.f78736a1.clear();
                if (bundle.containsKey("tag_profile_list") && (parcelableArrayList = bundle.getParcelableArrayList("tag_profile_list")) != null && parcelableArrayList.size() > 0) {
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                        if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                            this.f78736a1.put(inviteContactProfile.f42434r, inviteContactProfile);
                        }
                    }
                }
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ww0
                    public /* synthetic */ ww0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85870PR();
                    }
                }, 200L);
                if (bundle.containsKey("cur_privacy_type")) {
                    this.f78744c1.f45973p = bundle.getInt("cur_privacy_type");
                }
                if (bundle.containsKey("cur_privacy_selected_id")) {
                    this.f78744c1.f45977t = bundle.getInt("cur_privacy_selected_id");
                }
                double d11 = bundle.getDouble("location_lon", -1.0d);
                double d12 = bundle.getDouble("location_lat", -1.0d);
                String string = bundle.getString("location_id", "");
                String string2 = bundle.getString("location_desc");
                if (d11 != -1.0d || d12 != -1.0d || !TextUtils.isEmpty(string2)) {
                    this.f78745c2 = new C3063z0(string, d11, d12, string2, true);
                }
                this.f78735Z3 = bundle.getBoolean("enableThumb", true);
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.xw0
                    public /* synthetic */ xw0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85853KR();
                    }
                }, 200L);
                if (bundle.containsKey("status_text")) {
                    String string3 = bundle.getString("status_text");
                    if (!TextUtils.isEmpty(string3)) {
                        m85861MR(string3);
                    }
                }
                this.f78652C1 = bundle.getBoolean("extra_saved_is_redirect_media_picker");
                if (bundle.containsKey("cameraImageUri")) {
                    file = new File(bundle.getString("cameraImageUri"));
                } else {
                    file = null;
                }
                this.f78792o1 = file;
                if (bundle.containsKey("extra_saved_upload_photos")) {
                    ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("extra_saved_upload_photos");
                    this.f78796p1 = parcelableArrayList2;
                    if (parcelableArrayList2 == null) {
                        this.f78796p1 = new ArrayList();
                    }
                    m85877SR();
                }
                if (AbstractC23309i.m121565We()) {
                    this.f78662F1 = (C27373c) bundle.getSerializable("extra_video_info");
                    this.f78665G1 = bundle.getString("extra_saved_video_camera_log");
                    if (this.f78662F1 != null) {
                        m85897WS(5);
                        m85921dO(5, true);
                    }
                }
                this.f78683M1 = (C25630b) bundle.getSerializable("sticker");
                if (bundle.containsKey("status_link")) {
                    this.f78701R1 = (LinkAttachment) bundle.getParcelable("status_link");
                }
                if (bundle.containsKey("lastParsedLink")) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("lastParsedLink");
                    this.f78827w4 = stringArrayList;
                    if (stringArrayList == null) {
                        this.f78827w4 = new ArrayList();
                    }
                }
                int i11 = bundle.getInt("currentMode");
                this.f78803q4 = i11;
                m85897WS(i11);
                this.f78661E3 = bundle.getInt("mCurrentModeCompose", 0);
                this.f78771i4 = bundle.getBoolean("isLastApplyModeBg", false);
                mo79419nT();
                m85976tP();
                this.f78711T3.m75656k(!m85899XP(), false);
                this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.yw0
                    public /* synthetic */ yw0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85661GQ();
                    }
                }, 150L);
                this.f78829x2 = (EnumC22962a) bundle.get("media_picker_source");
                if (bundle.containsKey("extra_external_photos")) {
                    this.f78833y2 = bundle.getParcelableArrayList("extra_external_photos");
                }
                this.f78716V0 = (QuickPickerView) this.f72421L0.m92649TI().m92996E0("mQuickPickerFragment");
                int i12 = bundle.getInt("curGridMode", 100);
                QuickPickerView quickPickerView = this.f78716V0;
                if (quickPickerView != null) {
                    quickPickerView.m71231RN(i12);
                }
                try {
                    int i13 = bundle.getInt("mCurrentStateEntryTypo", 0);
                    this.f78682L3 = i13;
                    m85984wS(i13);
                    this.f78685M3 = bundle.getBoolean("isShowingTypoGraphy", false);
                    this.f78658D3 = bundle.getBoolean("isAppledLastSelectedTypo", false);
                    this.f78679K3 = bundle.getBoolean("isOverNumEnter", false);
                    m85839GS(this.f78685M3, true);
                    if (bundle.containsKey("typo_selected")) {
                        String string4 = bundle.getString("typo_selected");
                        if (!TextUtils.isEmpty(string4)) {
                            C31890dc c31890dc = new C31890dc(new JSONObject(string4));
                            this.f78670H3 = c31890dc;
                            C27477e c27477e = this.f78684M2;
                            if (c27477e != null) {
                                c27477e.m140551f0(c31890dc);
                            }
                        }
                    }
                    if (bundle.containsKey("typo_applied")) {
                        String string5 = bundle.getString("typo_applied");
                        if (!TextUtils.isEmpty(string5)) {
                            this.f78673I3 = new C31890dc(new JSONObject(string5));
                            C31845ac.m152996J().m153074y0(this.f78756f1, this.f78673I3, true);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                String str2 = str;
                if (bundle.containsKey(str2)) {
                    this.f78783l4 = ProfilePreviewAlbumItem.Companion.m46319a(bundle.getString(str2, ""));
                    mo79401bT();
                }
                m85835FR();
            } else {
                Bundle m92642L3 = this.f72421L0.m92642L3();
                if (m92642L3 != null) {
                    this.f78722W2 = m92642L3.getInt("extra_from_feed_remind_media_type", -1);
                    if (!AbstractC23309i.m121565We() && this.f78722W2 == 2) {
                        this.f78722W2 = -1;
                    }
                }
                if (this.f78817u2 && AbstractC23309i.m120826Cf()) {
                    this.f78661E3 = AbstractC23309i.m122567x5();
                    m85976tP();
                    this.f78711T3.m75656k(!m85899XP(), false);
                    new Handler().postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.zw0
                        public /* synthetic */ zw0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateStatusView.this.m85664HQ();
                        }
                    }, 150L);
                }
                m85681NN(m92642L3);
                m85686ON(m92642L3);
            }
            if (this.f78716V0 == null) {
                this.f78716V0 = new QuickPickerView();
                Bundle mo79384CR = mo79384CR();
                if (this.f78834y3) {
                    mo79384CR.putInt("extra_preload_grid_mode", -1);
                }
                this.f78716V0.mo60305zK(mo79384CR);
                this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.quick_picker_container, this.f78716V0, 0, "mQuickPickerFragment", 0, false);
            }
            this.f78716V0.m71224ON(this.f78724X0);
            this.f78716V0.m71252YN(m85660GO());
            this.f78716V0.m71247WN(new C15247c0());
            this.f78716V0.m71264cO(new C15249d0());
            this.f78716V0.m71261bO(new C15251e0());
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f78705S1) && this.f78701R1 == null) {
            if (!TextUtils.isEmpty(this.f78764h1)) {
                m85912bO(this.f78764h1);
            }
            m85884U2();
            contactProfile = this.f78748d1;
            if (contactProfile == null) {
                String m114542i = AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.f42437s);
                PrivacyInfo privacyInfo = new PrivacyInfo();
                this.f78744c1 = privacyInfo;
                privacyInfo.f45973p = 2;
                ArrayList arrayList = new ArrayList();
                ContactProfile contactProfile2 = this.f78748d1;
                arrayList.add(new LikeContactItem(contactProfile2.f42434r, m114542i, contactProfile2.f42446v));
                PrivacyInfo privacyInfo2 = this.f78744c1;
                privacyInfo2.f45974q = arrayList;
                privacyInfo2.f45975r = m114542i;
                m85856LR();
            } else {
                m85953mT(this.f78744c1.f45977t, true);
            }
            m85834FP(this.f72421L0.m92642L3(), bundle);
            selectMultiPhotoLayoutBottomSheet = (SelectMultiPhotoLayoutBottomSheet) m92649TI().m92996E0("SelectMultiPhotoLayoutBottomSheet");
            this.f78770i3 = selectMultiPhotoLayoutBottomSheet;
            if (selectMultiPhotoLayoutBottomSheet != null) {
                selectMultiPhotoLayoutBottomSheet.m45944VL(this.f78651B4);
                this.f78802q3 = 1;
            }
            this.f78812t1.setOnClickListener(this.f78655C4);
            this.f78839z4.m74687C((ViewGroup) this.f78708T0);
            if (this.f78834y3) {
                m85715XS();
            }
            if (!TextUtils.isEmpty(this.f78650B3)) {
                ToastUtils.showMess(this.f78650B3);
            }
            this.f78654C3 = new C16572d1(this.f78756f1, false, null);
        }
        if (mo79396QP(3)) {
            mo79383BS(3);
        } else if (this.f78701R1 != null) {
            m85863NR(3);
            m85897WS(3);
            m85844HS(false);
            m85921dO(3, true);
        } else {
            m85936iO(this.f78705S1);
        }
        m85884U2();
        contactProfile = this.f78748d1;
        if (contactProfile == null) {
        }
        m85834FP(this.f72421L0.m92642L3(), bundle);
        selectMultiPhotoLayoutBottomSheet = (SelectMultiPhotoLayoutBottomSheet) m92649TI().m92996E0("SelectMultiPhotoLayoutBottomSheet");
        this.f78770i3 = selectMultiPhotoLayoutBottomSheet;
        if (selectMultiPhotoLayoutBottomSheet != null) {
        }
        this.f78812t1.setOnClickListener(this.f78655C4);
        this.f78839z4.m74687C((ViewGroup) this.f78708T0);
        if (this.f78834y3) {
        }
        if (!TextUtils.isEmpty(this.f78650B3)) {
        }
        this.f78654C3 = new C16572d1(this.f78756f1, false, null);
    }

    /* renamed from: xO */
    BackgroundPickerView m85985xO() {
        QuickPickerView quickPickerView = this.f78716V0;
        if (quickPickerView != null) {
            return quickPickerView.m71245WL();
        }
        return null;
    }

    /* renamed from: xP */
    void m85986xP(Bundle bundle, Bundle bundle2) {
        String str;
        long j11;
        String str2;
        if (bundle == null) {
            return;
        }
        String str3 = "";
        if (!bundle.containsKey("status")) {
            str = "";
        } else {
            str = bundle.getString("status");
        }
        int length = str.length();
        int i11 = f78642D4;
        if (length > i11) {
            str = str.substring(0, i11);
        }
        if (bundle.containsKey("extra_forward_msg_id")) {
            j11 = bundle.getLong("extra_forward_msg_id");
        } else {
            j11 = -1;
        }
        this.f78821v2 = j11;
        this.f78764h1 = str;
        this.f78756f1.setText(str);
        this.f78756f1.setSelected(true);
        this.f78756f1.setSelection(this.f78764h1.length());
        if (bundle.getBoolean("fromShareVia", false)) {
            this.f78705S1 = bundle.getString("extra_share_original_link");
            this.f78645A2 = true;
            this.f78649B2 = bundle.getBoolean("bol_back_to_source", false);
            this.f78653C2 = bundle.getBoolean("bol_auto_back_to_source", false);
            this.f78657D2 = bundle.getString("token");
        }
        this.f78660E2 = bundle.getBoolean("extra_from_feed_remind", false);
        this.f78663F2 = bundle.getBoolean("extra_from_feed_remind_photo_server", false);
        this.f78666G2 = bundle.getBoolean("extra_from_feed_remind_photo_offline", false);
        this.f78817u2 = bundle.getBoolean("EXTRA_ALLOW_RESTORE_LAST_COMPOSE", false);
        String string = bundle.getString("extra_tracking_source", "");
        if (!string.isEmpty()) {
            this.f78698Q2 = new TrackingSource(string);
        }
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1050d(this, "sourceTracking", this.f78698Q2.m40683t());
        bVar.m1052f(this, "paramTracking", this.f78698Q2.m40682o());
        try {
            String string2 = bundle.getString("uid");
            if (!TextUtils.isEmpty(string2)) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(string2);
                this.f78748d1 = m141809c;
                if (m141809c == null) {
                    ContactProfile contactProfile = new ContactProfile(string2);
                    this.f78748d1 = contactProfile;
                    if (!bundle.containsKey("avt")) {
                        str2 = "";
                    } else {
                        str2 = bundle.getString("avt");
                    }
                    contactProfile.f42446v = str2;
                    ContactProfile contactProfile2 = this.f78748d1;
                    if (bundle.containsKey("dpn")) {
                        str3 = bundle.getString("dpn");
                    }
                    contactProfile2.f42437s = str3;
                }
            }
            if (m85910aQ()) {
                m85972sP();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        try {
            this.f78778k3 = new C18049e();
            this.f78806r3 = new C0708i();
            this.f78810s3 = new int[4];
            if (bundle.containsKey("extra_link_attachment")) {
                this.f78701R1 = new LinkAttachment(new JSONObject(bundle.getString("extra_link_attachment")));
            } else if (bundle.containsKey("extra_share_original_link")) {
                this.f78705S1 = bundle.getString("extra_share_original_link");
            }
            if (this.f78660E2) {
                C30169a c30169a = C30169a.f140177a;
                if (!TextUtils.isEmpty(c30169a.m148801a().m44994b().getFeedHint())) {
                    this.f78756f1.setHint(c30169a.m148801a().m44994b().getFeedHint());
                }
            }
            m85682NP();
            C2953b3 c2953b3 = AbstractC23304d.f113416n2;
            if (c2953b3 != null && c2953b3.m13985a()) {
                String str4 = AbstractC23304d.f113416n2.f11654c;
                if (!TextUtils.isEmpty(str4)) {
                    ((C23528a) this.f78720W0.m123612r(this.f78672I2)).m123579C(str4, C23278z2.m120082M(), new C15257h0());
                }
                String str5 = AbstractC23304d.f113416n2.f11655d;
                if (!TextUtils.isEmpty(str5)) {
                    ((C23528a) this.f78720W0.m123612r(this.f78669H2)).m123579C(str5, C23278z2.m120082M(), new C15259i0());
                }
            }
            this.f78794o3 = C19172a.m100600k("social@feed_multi_photo@enable_layout_multi_photo", 0);
            if (m85881TP()) {
                this.f78774j3 = C19587j.f97307a.m102527b(C19172a.m100600k("social@feed_multi_photo@default_picked_layout_id", 1));
            } else {
                this.f78774j3 = 0;
            }
            mo79424xS();
            this.f78834y3 = bundle.getBoolean("EXTRA_IS_POST_PROFILE_MUSIC", false);
            if (bundle.containsKey("EXTRA_POST_FEED_CALLBACK_ID")) {
                this.f78838z3 = bundle.getString("EXTRA_POST_FEED_CALLBACK_ID");
            }
            if (bundle.containsKey("EXTRA_MSG_DOWNLOAD_ERROR")) {
                this.f78650B3 = bundle.getString("EXTRA_MSG_DOWNLOAD_ERROR");
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: xR */
    void m85987xR() {
        try {
            m85884U2();
            Bundle m83055pM = ProfilePickerView.m83055pM(new ArrayList(this.f78740b1.values()), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putBoolean("allow_empty_pick", true);
            this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 1017, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xS */
    void mo79424xS() {
        int[] iArr = this.f78810s3;
        int i11 = this.f78774j3;
        iArr[i11] = iArr[i11] + 1;
    }

    /* renamed from: yR */
    public void mo79425yR() {
        int i11;
        try {
            if (m85910aQ()) {
                return;
            }
            MenuListPopupView menuListPopupView = this.f78700R0;
            if (menuListPopupView != null && menuListPopupView.m87763vL() > 0 && System.currentTimeMillis() - this.f78700R0.m87763vL() < 300) {
                this.f78700R0.m87753BL();
                return;
            }
            AbstractC23647d.m123906p("13400");
            MenuListPopupView menuListPopupView2 = this.f78700R0;
            if (menuListPopupView2 != null && menuListPopupView2.m92687sJ()) {
                m85884U2();
            } else {
                AbstractC2379w.m12430d(this.f78756f1);
                m85862MS();
            }
            AbstractC23647d.m123893c();
            this.f78839z4.m74689E("tip.postfeed.privacy");
            C0732w.Companion.m1189a().m1187q("click_privacy", "", null, null);
            C0815e1 m2075D = C0815e1.m2075D();
            C32017m4 m154326S = C32017m4.m154326S();
            C32002l4 m154264g = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_HAVE_UNKNOWN_STREAM);
            if (m85957oP()) {
                i11 = 47;
            } else {
                i11 = 46;
            }
            m2075D.m2100V(m154326S.m154343Q(m154264g.m154284u(i11)), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yS */
    void m85988yS() {
        try {
            if (this.f78796p1.size() == 1) {
                if (!m85961pP()) {
                }
                this.f78786m3.setVisibility(0);
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.py0
                    public /* synthetic */ py0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateStatusView.this.m85705UQ();
                    }
                });
            }
            if (!m85698RP() || !m85961pP() || !m85950mP()) {
                this.f78786m3.setVisibility(8);
                return;
            }
            this.f78786m3.setVisibility(0);
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.py0
                public /* synthetic */ py0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateStatusView.this.m85705UQ();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.p077ui.chat.InterfaceC11568d
    /* renamed from: yp */
    public boolean mo60294yp() {
        if (!this.f72421L0.m92677nJ() && !this.f72421L0.m92681pJ()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 58);
        C23744a.m124114c().m124115b(this, 88);
    }

    /* renamed from: zP */
    void m85989zP(Bundle bundle, Bundle bundle2) {
        boolean z11;
        ArrayList parcelableArrayList;
        if (bundle2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean("multiUpload", false)) {
                    if (bundle.containsKey("extra_initial_photos") && !z11 && (parcelableArrayList = bundle.getParcelableArrayList("extra_initial_photos")) != null && parcelableArrayList.size() > 0) {
                        if (mo79396QP(4)) {
                            mo79383BS(4);
                            return;
                        }
                        int m3769e3 = AbstractC0924m0.m3769e3();
                        if (m85845IO() >= m3769e3) {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_uploadphoto_reachlimit), Integer.valueOf(m3769e3)));
                            return;
                        }
                        this.f78833y2 = new ArrayList();
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                MediaItem mediaItem = (MediaItem) it.next();
                                if (mediaItem != null && !TextUtils.isEmpty(mediaItem.mo41081Q())) {
                                    mediaItem.m41140d1(true);
                                    this.f78833y2.add(mediaItem);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        return;
                    }
                    return;
                }
                int i11 = bundle.getInt("media_type", 1);
                if (i11 == 1) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("path");
                    this.f78656D1 = stringArrayList;
                    if (stringArrayList != null && stringArrayList.size() > 0) {
                        if (mo79396QP(4)) {
                            mo79383BS(4);
                            return;
                        }
                        int m3769e32 = AbstractC0924m0.m3769e3();
                        if (m85845IO() >= m3769e32) {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_uploadphoto_reachlimit), Integer.valueOf(m3769e32)));
                            return;
                        }
                        m85877SR();
                        if (!z11) {
                            this.f78833y2 = new ArrayList();
                            Iterator it2 = this.f78656D1.iterator();
                            while (it2.hasNext()) {
                                this.f78833y2.add(m85908aO((String) it2.next()));
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    this.f78662F1 = (C27373c) bundle.getSerializable("extra_video_info");
                    if (mo79396QP(5)) {
                        mo79383BS(5);
                    } else {
                        AbstractC2379w.m12430d(this.f78756f1);
                        this.f78710T2.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.cy0
                            public /* synthetic */ cy0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateStatusView.this.m85773pQ();
                            }
                        }, 300L);
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: zS */
    protected void m85990zS(C31890dc c31890dc) {
        try {
            this.f78670H3 = c31890dc;
            this.f78673I3 = c31890dc;
            if (!c31890dc.m153249t()) {
                this.f78658D3 = true;
            }
            AbstractC23309i.m121803cs(c31890dc.f146495a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
