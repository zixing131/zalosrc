package com.zing.zalo.p077ui.zviews.share;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0826k;
import ag0.AbstractC0837p0;
import ag0.C0843s0;
import am.AbstractC0924m0;
import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import au.C2343e;
import b40.C2520a;
import b40.C2526d;
import bn.C2850a;
import cg.AbstractC3460h;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.C7106j4;
import com.zing.zalo.adapters.C7153n7;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.dialog.DownloadToForwardDialog;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.Cocos2dxAnimationActivity;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.DimLinearLayout;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.p077ui.zviews.Cocos2dxLoadingView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.QuickCreateGroupView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.pojo.ShareLinkInfo;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17961f1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17979l1;
import dj.C17990p0;
import dj.C17993q0;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import ed0.AbstractC18391a;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import i60.C20338d;
import ig0.AbstractC20550a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23006a0;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23078g6;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23238v2;
import me0.AbstractC23262x6;
import me0.AbstractC23280z4;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nc0.ViewOnTouchListenerC23713o;
import nh0.C23793c;
import oc0.C24221a;
import org.json.JSONObject;
import p142ey.C18635e;
import p142ey.C18644n;
import p164fn.C19027a;
import p164fn.C19032f;
import p164fn.InterfaceC19039m;
import p239ih.C20556f;
import p241ij.C20568e;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.AbstractC23529b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p494rv.C25979a;
import p559uv.C27373c;
import p560uw.EnumC27375b;
import p560uw.EnumC27376c;
import p588vw.C28644j;
import p588vw.C28652r;
import p716zh.C31868c5;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32063p6;
import p716zh.C32204z7;
import rw.C25982c;
import rw.C25983d;
import rw.C25984e;
import rw.C25985f;
import sx.C26404f;
import sx.C26405g;
import sx.EnumC26407i;
import tg.C26657h;
import tg.C26674y;
import th.AbstractC26689j;
import tj.C26713e;
import tv.AbstractC26897a;
import ui0.C27280g;
import v50.C27870vb;
import ve.AbstractC27985d;
import vg.AbstractC28127m2;
import vg.AbstractC28236y3;
import vg.C28020b3;
import vg.C28154p2;
import vg.C28203u6;
import vl0.AbstractC28291a;
import zc0.C31784b;
import zl0.AbstractC32234k;

/* loaded from: classes6.dex */
public class ShareView extends SlidableZaloView implements C23744a.c, C7153n7.a, InterfaceC17463d.d, View.OnClickListener, InterfaceC0733x {

    /* renamed from: e3 */
    public static final String f81950e3 = "ShareView";

    /* renamed from: B1 */
    private C23528a f81953B1;

    /* renamed from: F2 */
    protected ContactProfile f81962F2;

    /* renamed from: I1 */
    protected C26713e f81967I1;

    /* renamed from: P0 */
    protected RecyclerView f81981P0;

    /* renamed from: Q0 */
    protected C7153n7 f81984Q0;

    /* renamed from: Q2 */
    private ContactProfile f81986Q2;

    /* renamed from: R0 */
    protected RecyclerView f81987R0;

    /* renamed from: S0 */
    protected C7005a5 f81990S0;

    /* renamed from: S1 */
    protected String f81991S1;

    /* renamed from: T0 */
    protected DimLinearLayout f81993T0;

    /* renamed from: U0 */
    protected View f81996U0;

    /* renamed from: U1 */
    protected C26404f f81997U1;

    /* renamed from: V0 */
    protected View f81999V0;

    /* renamed from: V1 */
    protected String f82000V1;

    /* renamed from: W0 */
    protected View f82002W0;

    /* renamed from: X0 */
    protected View f82005X0;

    /* renamed from: Y0 */
    protected LinearLayoutManager f82008Y0;

    /* renamed from: Y2 */
    boolean f82010Y2;

    /* renamed from: Z0 */
    protected RobotoEditText f82011Z0;

    /* renamed from: a1 */
    protected ImageView f82014a1;

    /* renamed from: b1 */
    protected RobotoEditText f82017b1;

    /* renamed from: b3 */
    String f82019b3;

    /* renamed from: c1 */
    protected RoundCornerImageView f82020c1;

    /* renamed from: d1 */
    protected RobotoTextView f82023d1;

    /* renamed from: d2 */
    protected C17945a0 f82024d2;

    /* renamed from: e1 */
    protected RobotoTextView f82026e1;

    /* renamed from: e2 */
    protected List f82027e2;

    /* renamed from: f1 */
    protected RobotoTextView f82028f1;

    /* renamed from: f2 */
    protected ArrayList f82029f2;

    /* renamed from: g1 */
    protected View f82030g1;

    /* renamed from: h1 */
    protected View f82032h1;

    /* renamed from: i1 */
    protected View f82034i1;

    /* renamed from: j1 */
    protected RecyclingImageView f82036j1;

    /* renamed from: k1 */
    protected View f82038k1;

    /* renamed from: l1 */
    protected RobotoTextView f82040l1;

    /* renamed from: l2 */
    protected C26405g f82041l2;

    /* renamed from: m1 */
    protected RecyclingImageView f82042m1;

    /* renamed from: m2 */
    protected boolean f82043m2;

    /* renamed from: n1 */
    protected View f82044n1;

    /* renamed from: n2 */
    protected List f82045n2;

    /* renamed from: o1 */
    protected View f82046o1;

    /* renamed from: o2 */
    protected String f82047o2;

    /* renamed from: p1 */
    protected View f82048p1;

    /* renamed from: q1 */
    protected View f82050q1;

    /* renamed from: r1 */
    protected View f82052r1;

    /* renamed from: s1 */
    protected View f82054s1;

    /* renamed from: t1 */
    protected RecyclerView f82056t1;

    /* renamed from: t2 */
    protected Handler f82057t2;

    /* renamed from: u1 */
    protected View f82058u1;

    /* renamed from: u2 */
    protected C25982c f82059u2;

    /* renamed from: v1 */
    protected FrameLayout f82060v1;

    /* renamed from: v2 */
    protected boolean f82061v2;

    /* renamed from: w1 */
    protected C7106j4 f82062w1;

    /* renamed from: x1 */
    protected ImageButton f82064x1;

    /* renamed from: x2 */
    protected JSONObject f82065x2;

    /* renamed from: y1 */
    protected View f82066y1;

    /* renamed from: y2 */
    protected ValueAnimator f82067y2;

    /* renamed from: z1 */
    protected RobotoTextView f82068z1;

    /* renamed from: z2 */
    protected ValueAnimator f82069z2;

    /* renamed from: A1 */
    private boolean f81951A1 = false;

    /* renamed from: C1 */
    protected final Map f81955C1 = new HashMap();

    /* renamed from: D1 */
    protected final List f81957D1 = new ArrayList();

    /* renamed from: E1 */
    protected final List f81959E1 = new ArrayList();

    /* renamed from: F1 */
    protected final List f81961F1 = new ArrayList();

    /* renamed from: G1 */
    protected final List f81963G1 = new ArrayList();

    /* renamed from: H1 */
    protected LinkAttachment f81965H1 = null;

    /* renamed from: J1 */
    protected String f81969J1 = "";

    /* renamed from: K1 */
    protected String f81971K1 = "";

    /* renamed from: L1 */
    protected String f81973L1 = "";

    /* renamed from: M1 */
    protected boolean f81975M1 = false;

    /* renamed from: N1 */
    protected boolean f81977N1 = false;

    /* renamed from: O1 */
    protected boolean f81979O1 = false;

    /* renamed from: P1 */
    protected String f81982P1 = "";

    /* renamed from: Q1 */
    protected final List f81985Q1 = new ArrayList();

    /* renamed from: R1 */
    protected final ArrayList f81988R1 = new ArrayList();

    /* renamed from: T1 */
    protected Map f81994T1 = new HashMap();

    /* renamed from: W1 */
    protected boolean f82003W1 = false;

    /* renamed from: X1 */
    protected boolean f82006X1 = false;

    /* renamed from: Y1 */
    protected volatile boolean f82009Y1 = false;

    /* renamed from: Z1 */
    protected final Object f82012Z1 = new Object();

    /* renamed from: a2 */
    protected boolean f82015a2 = false;

    /* renamed from: b2 */
    protected final Object f82018b2 = new Object();

    /* renamed from: c2 */
    protected final AtomicBoolean f82021c2 = new AtomicBoolean(false);

    /* renamed from: g2 */
    protected boolean f82031g2 = false;

    /* renamed from: h2 */
    protected boolean f82033h2 = false;

    /* renamed from: i2 */
    protected boolean f82035i2 = false;

    /* renamed from: j2 */
    protected MessageId f82037j2 = null;

    /* renamed from: k2 */
    protected String f82039k2 = "";

    /* renamed from: p2 */
    protected boolean f82049p2 = false;

    /* renamed from: q2 */
    protected int f82051q2 = -1;

    /* renamed from: r2 */
    protected boolean f82053r2 = false;

    /* renamed from: s2 */
    protected boolean f82055s2 = true;

    /* renamed from: w2 */
    protected C24221a f82063w2 = new C24221a();

    /* renamed from: A2 */
    protected boolean f81952A2 = false;

    /* renamed from: B2 */
    protected boolean f81954B2 = false;

    /* renamed from: C2 */
    protected boolean f81956C2 = true;

    /* renamed from: D2 */
    protected boolean f81958D2 = false;

    /* renamed from: E2 */
    protected boolean f81960E2 = true;

    /* renamed from: G2 */
    protected String f81964G2 = "";

    /* renamed from: H2 */
    protected boolean f81966H2 = false;

    /* renamed from: I2 */
    protected boolean f81968I2 = false;

    /* renamed from: J2 */
    protected boolean f81970J2 = true;

    /* renamed from: K2 */
    protected boolean f81972K2 = false;

    /* renamed from: L2 */
    private String f81974L2 = "0";

    /* renamed from: M2 */
    private String f81976M2 = "";

    /* renamed from: N2 */
    private int f81978N2 = -1;

    /* renamed from: O2 */
    boolean f81980O2 = false;

    /* renamed from: P2 */
    private boolean f81983P2 = false;

    /* renamed from: R2 */
    private boolean f81989R2 = false;

    /* renamed from: S2 */
    private boolean f81992S2 = false;

    /* renamed from: T2 */
    long f81995T2 = 0;

    /* renamed from: U2 */
    private final int f81998U2 = 3000;

    /* renamed from: V2 */
    private final List f82001V2 = new ArrayList();

    /* renamed from: W2 */
    private final List f82004W2 = new ArrayList();

    /* renamed from: X2 */
    long f82007X2 = 0;

    /* renamed from: Z2 */
    InterfaceC20094a f82013Z2 = new C16138e();

    /* renamed from: a3 */
    final Runnable f82016a3 = new Runnable() { // from class: nc0.r
        public /* synthetic */ RunnableC23719r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShareView.this.m87508fO();
        }
    };

    /* renamed from: c3 */
    private List f82022c3 = null;

    /* renamed from: d3 */
    boolean f82025d3 = false;

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$a */
    /* loaded from: classes6.dex */
    public class C16134a implements ZinstantPreviewLayout.InterfaceC16697a {

        /* renamed from: a */
        final /* synthetic */ ZinstantPreviewLayout f82070a;

        C16134a(ZinstantPreviewLayout zinstantPreviewLayout) {
            this.f82070a = zinstantPreviewLayout;
        }

        /* renamed from: d */
        public /* synthetic */ void m87582d() {
            ShareView.this.finish();
        }

        /* renamed from: e */
        public /* synthetic */ void m87583e(ZinstantPreviewLayout zinstantPreviewLayout) {
            ShareView.this.f81983P2 = true;
            zinstantPreviewLayout.onStart();
            ShareView.this.m87522jN();
        }

        @Override // com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout.InterfaceC16697a
        /* renamed from: M0 */
        public void mo87584M0() {
        }

        @Override // com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout.InterfaceC16697a
        /* renamed from: N0 */
        public void mo87585N0() {
            ShareView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.b

                /* renamed from: q */
                public final /* synthetic */ ZinstantPreviewLayout f82094q;

                public /* synthetic */ RunnableC16150b(ZinstantPreviewLayout zinstantPreviewLayout) {
                    r2 = zinstantPreviewLayout;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.C16134a.this.m87583e(r2);
                }
            });
        }

        @Override // com.zing.zalo.uicontrol.zinstant.ZinstantPreviewLayout.InterfaceC16697a
        /* renamed from: c */
        public void mo87586c(Exception exc) {
            ShareView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.a
                public /* synthetic */ RunnableC16149a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.C16134a.this.m87582d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$b */
    /* loaded from: classes6.dex */
    public class C16135b implements C32204z7.h {
        C16135b() {
        }

        /* renamed from: f */
        public /* synthetic */ void m87589f() {
            C26404f c26404f;
            ShareView shareView;
            RobotoEditText robotoEditText;
            try {
                if (ShareView.this.f81951A1 && !TextUtils.isEmpty(ShareView.this.f82000V1)) {
                    ShareView shareView2 = ShareView.this;
                    shareView2.f82017b1.setText(shareView2.f82000V1);
                } else if (!TextUtils.isEmpty(ShareView.this.f81971K1) && C31944h6.m153558z(ShareView.this.f81971K1) && (robotoEditText = (shareView = ShareView.this).f82017b1) != null) {
                    robotoEditText.setText(shareView.f81971K1);
                } else if (TextUtils.isEmpty(ShareView.this.f82000V1) && !TextUtils.isEmpty(ShareView.this.f81997U1.m136155h())) {
                    ShareView shareView3 = ShareView.this;
                    if (shareView3.f82017b1 != null && (c26404f = shareView3.f81997U1) != null && c26404f.f125455k) {
                        shareView3.f82000V1 = c26404f.m136155h();
                        ShareView shareView4 = ShareView.this;
                        shareView4.f82017b1.setText(shareView4.f81997U1.m136155h());
                    }
                }
                ShareView.this.m87528kP();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public /* synthetic */ void m87590g() {
            ShareView.this.m87528kP();
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            ShareView.this.f82010Y2 = false;
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            try {
                ShareView.this.f82010Y2 = false;
                C26405g c26405g = new C26405g(c18013y0, true);
                ShareView.this.f81997U1.m136171x(4);
                ShareView.this.f81997U1.m136170w(c26405g);
                ShareView.this.f81997U1.f125453i = false;
                if (AbstractC9183a.m49005m(c26405g)) {
                    c26405g.f125478a = "";
                    AbstractC9183a.m49007o(c26405g, ShareView.this.f81976M2);
                }
                ShareView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.c
                    public /* synthetic */ RunnableC16151c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.C16135b.this.m87589f();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
            C26404f c26404f = ShareView.this.f81997U1;
            if (c26404f != null && c26404f.m136157j() != null) {
                ShareView.this.f81997U1.m136157j().f125475E = !str2.isEmpty();
                ShareView.this.f81997U1.m136157j().f125480c = str2;
                ShareView.this.f81997U1.m136157j().f125477G = str2;
                ShareView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.d
                    public /* synthetic */ RunnableC16152d() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.C16135b.this.m87590g();
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$c */
    /* loaded from: classes6.dex */
    public class C16136c implements InterfaceC19039m {

        /* renamed from: a */
        final /* synthetic */ String f82073a;

        C16136c(String str) {
            this.f82073a = str;
        }

        @Override // p164fn.InterfaceC19039m
        /* renamed from: a */
        public void mo87591a() {
            C20556f c20556f = new C20556f(this.f82073a);
            if (c20556f.m106830b()) {
                c20556f.m106829a();
            }
            ShareView.this.m87449KN();
        }

        @Override // p164fn.InterfaceC19039m
        /* renamed from: b */
        public void mo87592b(String str) {
            C20556f c20556f = new C20556f(this.f82073a);
            if (c20556f.m106830b()) {
                c20556f.m106829a();
            }
            ShareView.this.m87449KN();
        }

        @Override // p164fn.InterfaceC19039m
        /* renamed from: c */
        public void mo87593c(long j11, String str) {
        }

        @Override // p164fn.InterfaceC19039m
        /* renamed from: d */
        public void mo87594d() {
            ShareView.this.m87446JN(this.f82073a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$d */
    /* loaded from: classes6.dex */
    public class RunnableC16137d implements Runnable {

        /* renamed from: p */
        int f82075p;

        /* renamed from: q */
        int f82076q;

        /* renamed from: r */
        final String f82077r;

        /* renamed from: s */
        final /* synthetic */ boolean f82078s;

        RunnableC16137d(boolean z11) {
            this.f82078s = z11;
            this.f82077r = ShareView.this.m92652XI(AbstractC8020f0.str_alphabe);
        }

        /* renamed from: b */
        public /* synthetic */ void m87596b(boolean z11) {
            List list;
            RecyclerView recyclerView;
            try {
                ShareView shareView = ShareView.this;
                if (shareView.f81984Q0 != null) {
                    RobotoEditText robotoEditText = shareView.f82011Z0;
                    if (robotoEditText != null && !TextUtils.isEmpty(robotoEditText.getText().toString().trim())) {
                        return;
                    }
                    ShareView.this.m87463PO();
                    if (z11 && (list = ShareView.this.f81957D1) != null && !list.isEmpty() && (recyclerView = ShareView.this.f81981P0) != null) {
                        recyclerView.m9837K1(0);
                        ShareView shareView2 = ShareView.this;
                        shareView2.f81981P0.scrollBy(0, Math.abs((int) shareView2.f81993T0.getTranslationY()));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                try {
                    try {
                        synchronized (ShareView.this.f81959E1) {
                            try {
                                ShareView.this.f81959E1.clear();
                                ShareView.this.f81961F1.clear();
                                ShareView.this.f81963G1.clear();
                                boolean z12 = true;
                                boolean z13 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                                if (z13 && !C19669z.f97568P.get()) {
                                    C7960e.m41971c6().m42400g7();
                                }
                                if (C19669z.m103146Y().m103227q0()) {
                                    ShareView.this.f81952A2 = true;
                                }
                                ContactProfile m141809c = C28203u6.f131407a.m141809c("204278670");
                                if (C21373a.f104231a.m110802n() && ShareView.m87468RN(m141809c, ShareView.this.f82063w2, true)) {
                                    ShareView.this.f81959E1.add(0, m141809c);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                List m103199P = C19669z.m103146Y().m103199P();
                                for (int i11 = 0; i11 < m103199P.size(); i11++) {
                                    ContactProfile contactProfile = (ContactProfile) m103199P.get(i11);
                                    if (ShareView.m87468RN(contactProfile, ShareView.this.f82063w2, true) && ((!z13 || !C21927m.m114302u().m114345m(contactProfile.f42434r)) && (!contactProfile.m40372J0() || !z11))) {
                                        ShareView.this.f81959E1.add(contactProfile);
                                    }
                                }
                                if (ShareView.this.f82063w2.m126368r()) {
                                    for (C31973j5 c31973j5 : C0943w.m4462l().m4475i()) {
                                        if (c31973j5 != null && !TextUtils.isEmpty(c31973j5.m153781r())) {
                                            ContactProfile contactProfile2 = new ContactProfile("group_" + c31973j5.m153781r());
                                            contactProfile2.f42437s = c31973j5.m153793y();
                                            if (c31973j5.m153786t0()) {
                                                contactProfile2.f42446v = c31973j5.m153756e();
                                            }
                                            ShareView.this.f81961F1.add(contactProfile2);
                                        }
                                    }
                                }
                                this.f82075p = -1;
                                this.f82076q = 0;
                                int m122127lb = AbstractC23309i.m122127lb();
                                ContactProfile m141809c2 = C28203u6.f131407a.m141809c("204278670");
                                if (m141809c2 == null) {
                                    C0843s0.m2286r().m2294e(new AbstractC0826k.c("204278670", new TrackingSource((short) 1046)));
                                    String m114547n = AbstractC21935u.m114547n();
                                    if (!TextUtils.isEmpty(m114547n)) {
                                        m141809c2 = new ContactProfile("204278670");
                                        m141809c2.f42437s = m114547n;
                                        if (!TextUtils.isEmpty(AbstractC23304d.f113377e)) {
                                            m141809c2.f42446v = AbstractC23304d.f113377e;
                                        }
                                    }
                                }
                                C18635e mo98465a = C18644n.m98531l().mo98465a(m141809c2, false);
                                if (!mo98465a.isEmpty()) {
                                    ShareView.this.f81954B2 = true;
                                }
                                int size = mo98465a.size();
                                int i12 = -1;
                                int i13 = 0;
                                boolean z14 = false;
                                for (int i14 = 0; i14 < size; i14++) {
                                    try {
                                        ContactProfile contactProfile3 = (ContactProfile) mo98465a.get(i14);
                                        if (contactProfile3 != null && ((m122127lb != z12 || contactProfile3.f42382U0 != 0) && ShareView.m87468RN(contactProfile3, ShareView.this.f82063w2, z12) && (!z13 || !C21927m.m114302u().m114345m(contactProfile3.f42434r)))) {
                                            String str = "" + contactProfile3.f42440t.trim().charAt(0);
                                            Locale locale = Locale.ENGLISH;
                                            char charAt = str.toUpperCase(locale).charAt(0);
                                            i12++;
                                            if (i12 != 0) {
                                                try {
                                                    char charAt2 = ("" + ((ContactProfile) mo98465a.get(i13)).f42440t.trim().charAt(0)).toUpperCase(locale).charAt(0);
                                                    if (this.f82077r.indexOf(charAt2) != -1) {
                                                        if (charAt > charAt2) {
                                                            if (this.f82077r.indexOf(charAt) != -1) {
                                                                ContactProfile contactProfile4 = new ContactProfile();
                                                                contactProfile4.f42437s = "" + charAt;
                                                                contactProfile4.m40403e1(false);
                                                                if (!z14) {
                                                                    contactProfile4.f42407e1 = true;
                                                                    z14 = true;
                                                                }
                                                                int size2 = ShareView.this.f81963G1.size();
                                                                if (size2 > 0) {
                                                                    int i15 = size2 - 1;
                                                                    if (((ContactProfile) ShareView.this.f81963G1.get(i15)).m40366G0()) {
                                                                        ((ContactProfile) ShareView.this.f81963G1.get(i15)).f42405d1 = true;
                                                                    }
                                                                }
                                                                ShareView.this.f81963G1.add(contactProfile4);
                                                            } else {
                                                                ContactProfile contactProfile5 = new ContactProfile();
                                                                if (this.f82077r.indexOf(charAt) == -1) {
                                                                    contactProfile5.f42437s = "##";
                                                                } else {
                                                                    contactProfile5.f42437s = "" + charAt;
                                                                }
                                                                contactProfile5.m40403e1(false);
                                                                if (!z14) {
                                                                    contactProfile5.f42407e1 = true;
                                                                    z14 = true;
                                                                }
                                                                ShareView.this.f81963G1.add(contactProfile5);
                                                            }
                                                        }
                                                    } else if (this.f82077r.indexOf(charAt) != -1) {
                                                        ContactProfile contactProfile6 = new ContactProfile();
                                                        contactProfile6.f42437s = "" + charAt;
                                                        contactProfile6.m40403e1(false);
                                                        if (!z14) {
                                                            contactProfile6.f42407e1 = true;
                                                            z14 = true;
                                                        }
                                                        int size3 = ShareView.this.f81963G1.size();
                                                        if (size3 > 0) {
                                                            int i16 = size3 - 1;
                                                            if (((ContactProfile) ShareView.this.f81963G1.get(i16)).m40366G0()) {
                                                                ((ContactProfile) ShareView.this.f81963G1.get(i16)).f42405d1 = true;
                                                            }
                                                        }
                                                        ShareView.this.f81963G1.add(contactProfile6);
                                                    }
                                                } catch (Exception e11) {
                                                    try {
                                                        AbstractC20110a.m104539h(e11);
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        z12 = true;
                                                        AbstractC20110a.m104539h(e);
                                                    }
                                                }
                                            } else {
                                                ContactProfile contactProfile7 = new ContactProfile();
                                                if (this.f82077r.indexOf(charAt) == -1) {
                                                    contactProfile7.f42437s = "#";
                                                } else {
                                                    contactProfile7.f42437s = "" + charAt;
                                                }
                                                contactProfile7.m40403e1(false);
                                                if (!z14) {
                                                    contactProfile7.f42407e1 = true;
                                                    z14 = true;
                                                }
                                                ShareView.this.f81963G1.add(contactProfile7);
                                            }
                                            contactProfile3.f42399a1.clear();
                                            ShareView.this.f81963G1.add(contactProfile3);
                                            z12 = true;
                                            this.f82076q++;
                                            i13 = i14;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        ShareView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.e

                            /* renamed from: q */
                            public final /* synthetic */ boolean f82098q;

                            public /* synthetic */ RunnableC16153e(boolean z15) {
                                r2 = z15;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.RunnableC16137d.this.m87596b(r2);
                            }
                        });
                    } catch (Exception e14) {
                        AbstractC23350e.m122778h(e14);
                        ShareView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.e

                            /* renamed from: q */
                            public final /* synthetic */ boolean f82098q;

                            public /* synthetic */ RunnableC16153e(boolean z15) {
                                r2 = z15;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.RunnableC16137d.this.m87596b(r2);
                            }
                        });
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
            } catch (Throwable th3) {
                try {
                    ShareView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.e

                        /* renamed from: q */
                        public final /* synthetic */ boolean f82098q;

                        public /* synthetic */ RunnableC16153e(boolean z15) {
                            r2 = z15;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareView.RunnableC16137d.this.m87596b(r2);
                        }
                    });
                    throw th3;
                } catch (Exception e16) {
                    e16.printStackTrace();
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$e */
    /* loaded from: classes6.dex */
    public class C16138e implements InterfaceC20094a {
        C16138e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    int m104491c = c20096c.m104491c();
                    if (m104491c == -48) {
                        ShareView.this.m87571EN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number_out_of_accepted));
                    } else if (m104491c == -49) {
                        ShareView.this.m87571EN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number_wrong_new_phone));
                    } else {
                        ToastUtils.m89270r(c20096c.m104492d());
                    }
                    ShareView.this.mo78960q3();
                    synchronized (ShareView.this.f82012Z1) {
                        ShareView.this.f82009Y1 = false;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    ShareView.this.mo78960q3();
                    synchronized (ShareView.this.f82012Z1) {
                        ShareView.this.f82009Y1 = false;
                    }
                }
            } catch (Throwable th2) {
                ShareView.this.mo78960q3();
                synchronized (ShareView.this.f82012Z1) {
                    ShareView.this.f82009Y1 = false;
                    throw th2;
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    ShareView.this.m87571EN(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_change_phone_success));
                    ShareView.this.mo78960q3();
                    synchronized (ShareView.this.f82012Z1) {
                        ShareView.this.f82009Y1 = false;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    ShareView.this.mo78960q3();
                    synchronized (ShareView.this.f82012Z1) {
                        ShareView.this.f82009Y1 = false;
                    }
                }
            } catch (Throwable th2) {
                ShareView.this.mo78960q3();
                synchronized (ShareView.this.f82012Z1) {
                    ShareView.this.f82009Y1 = false;
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$f */
    /* loaded from: classes6.dex */
    public class C16139f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f82081a;

        C16139f(ContactProfile contactProfile) {
            this.f82081a = contactProfile;
        }

        /* renamed from: d */
        public /* synthetic */ void m87598d() {
            ShareView shareView = ShareView.this;
            shareView.mo36377P(shareView.f81986Q2);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89259g(c20096c.m104491c());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } finally {
                ShareView.this.mo78960q3();
                ShareView.this.f82025d3 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    new JSONObject();
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            i11 = jSONObject2.getInt("code");
                        } else {
                            i11 = -999;
                        }
                        if (i11 != 0) {
                            ToastUtils.m89259g(i11);
                            ShareView shareView = ShareView.this;
                            shareView.f82025d3 = false;
                            shareView.mo78960q3();
                            return;
                        }
                    }
                    ContactProfile contactProfile = this.f82081a;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    C19669z.m103146Y().m103198O0();
                    C21927m.m114302u().m114336h0();
                    ShareView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.share.f
                        public /* synthetic */ RunnableC16154f() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareView.C16139f.this.m87598d();
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                ShareView shareView2 = ShareView.this;
                shareView2.f82025d3 = false;
                shareView2.mo78960q3();
            } catch (Throwable th2) {
                ShareView shareView3 = ShareView.this;
                shareView3.f82025d3 = false;
                shareView3.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$g */
    /* loaded from: classes6.dex */
    public class C16140g extends C25982c {
        C16140g(C25984e c25984e) {
            super(c25984e);
        }

        @Override // rw.C25982c
        /* renamed from: g */
        public void mo81139g(C25985f c25985f) {
            if (c25985f.f123961a == 0) {
                ShareView.this.m87458NO(c25985f.f123964d);
            }
            super.mo81139g(c25985f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$h */
    /* loaded from: classes6.dex */
    public class C16141h implements CustomRelativeLayout.InterfaceC13484a {
        C16141h() {
        }

        @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
        /* renamed from: Og */
        public void mo75644Og(int i11, int i12) {
            try {
                ShareView shareView = ShareView.this;
                if (shareView.f81958D2) {
                    return;
                }
                shareView.f82061v2 = false;
                shareView.f81993T0.m75685a(false);
                if (!ShareView.this.f81994T1.isEmpty()) {
                    boolean isEmpty = TextUtils.isEmpty(ShareView.this.f82011Z0.getText().toString().trim());
                    if (ShareView.this.f82063w2.m126374x() || isEmpty) {
                        if (ShareView.this.f82067y2.isRunning()) {
                            ShareView.this.f82067y2.cancel();
                        }
                        if (ShareView.this.mo78776lN()) {
                            ShareView.this.f82069z2.start();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
        /* renamed from: n8 */
        public void mo75645n8(int i11, int i12) {
            try {
                ShareView shareView = ShareView.this;
                if (shareView.f81958D2 || !shareView.m92672lJ()) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ShareView shareView2 = ShareView.this;
                if (currentTimeMillis < shareView2.f82007X2 && !shareView2.f81956C2 && !shareView2.f82011Z0.isFocused() && !ShareView.this.f82017b1.isFocused()) {
                    AbstractC2379w.m12430d(ShareView.this.f82011Z0);
                    return;
                }
                ShareView shareView3 = ShareView.this;
                shareView3.f82061v2 = true;
                if (!shareView3.f81956C2) {
                    shareView3.f81993T0.m75685a(true);
                    AbstractC2379w.m12432f(ShareView.this.f82017b1);
                    return;
                }
                AbstractC2379w.m12432f(shareView3.f82011Z0);
                if (ShareView.this.f82069z2.isRunning()) {
                    ShareView.this.f82069z2.cancel();
                }
                if (ShareView.this.mo78777mN()) {
                    ShareView.this.f82067y2.start();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$i */
    /* loaded from: classes6.dex */
    public class C16142i extends RecyclerView.AbstractC1892s {
        C16142i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            ShareView shareView = ShareView.this;
            RobotoEditText robotoEditText = shareView.f82011Z0;
            if (robotoEditText != null && shareView.f82055s2) {
                AbstractC2379w.m12430d(robotoEditText);
                ShareView.this.f81956C2 = false;
            }
            if (i11 == 0) {
                ShareView shareView2 = ShareView.this;
                shareView2.f82055s2 = true;
                shareView2.f81984Q0.m36376O(false);
                ShareView.this.f81984Q0.m10008p();
                return;
            }
            ShareView.this.f81984Q0.m36376O(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$j */
    /* loaded from: classes6.dex */
    public class C16143j extends AbstractC18391a {
        C16143j() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            super.afterTextChanged(editable);
            try {
                RobotoEditText robotoEditText = ShareView.this.f82011Z0;
                if (robotoEditText != null && robotoEditText.getText() != null) {
                    String trim = ShareView.this.f82011Z0.getText().toString().trim();
                    ShareView.this.m87430DN(trim);
                    ImageView imageView = ShareView.this.f82014a1;
                    if (TextUtils.isEmpty(trim)) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    imageView.setVisibility(i11);
                    if (!TextUtils.isEmpty(ShareView.this.f82011Z0.getText().toString().trim()) && !ShareView.this.f82063w2.m126374x()) {
                        if (ShareView.this.f82069z2.isRunning()) {
                            ShareView.this.f82069z2.cancel();
                        }
                        if (ShareView.this.mo78777mN()) {
                            ShareView.this.f82067y2.start();
                            return;
                        }
                        return;
                    }
                    if (!ShareView.this.f81994T1.isEmpty()) {
                        ShareView shareView = ShareView.this;
                        if (!shareView.f82061v2) {
                            if (shareView.f82067y2.isRunning()) {
                                ShareView.this.f82067y2.cancel();
                            }
                            if (ShareView.this.mo78776lN()) {
                                ShareView.this.f82069z2.start();
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$k */
    /* loaded from: classes6.dex */
    public class C16144k extends AbstractC18391a {
        C16144k() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            ShareView shareView = ShareView.this;
            if (!shareView.f82053r2) {
                shareView.f82053r2 = true;
                AbstractC23647d.m123906p("13690");
                AbstractC23647d.m123893c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$l */
    /* loaded from: classes6.dex */
    public class C16145l extends AnimatorListenerAdapter {
        C16145l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RobotoTextView robotoTextView;
            super.onAnimationEnd(animator);
            if (ShareView.this.f82063w2.m126374x() && (robotoTextView = ShareView.this.f82068z1) != null) {
                AbstractC23136l9.m118744r1(robotoTextView, 4);
                return;
            }
            View view = ShareView.this.f82005X0;
            if (view != null) {
                view.setVisibility(4);
                View view2 = ShareView.this.f81999V0;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = 0;
                    ShareView.this.f81999V0.setLayoutParams(layoutParams);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            RobotoTextView robotoTextView;
            super.onAnimationStart(animator);
            if (ShareView.this.f82063w2.m126374x() && (robotoTextView = ShareView.this.f82068z1) != null) {
                AbstractC23136l9.m118744r1(robotoTextView, 0);
                return;
            }
            View view = ShareView.this.f82005X0;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$m */
    /* loaded from: classes6.dex */
    public class C16146m extends AnimatorListenerAdapter {
        C16146m() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (ShareView.this.f82063w2.m126374x()) {
                AbstractC23136l9.m118744r1(ShareView.this.f82068z1, 0);
                return;
            }
            View view = ShareView.this.f82005X0;
            if (view != null) {
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = ShareView.this.f81999V0.getLayoutParams();
                layoutParams.height = ShareView.this.f82005X0.getHeight();
                ShareView.this.f81999V0.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$n */
    /* loaded from: classes6.dex */
    class C16147n implements InterfaceC17463d.d {
        C16147n() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            ShareView shareView = ShareView.this;
            shareView.m87577fP(shareView.f81986Q2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.share.ShareView$o */
    /* loaded from: classes6.dex */
    public class C16148o extends C23999j {
        C16148o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (interfaceC3968a instanceof ImageView) {
                ((ImageView) interfaceC3968a).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
        }
    }

    /* renamed from: AN */
    private synchronized void m87421AN(String str) {
        if (AbstractC23309i.m122610yb() && !TextUtils.isEmpty(str)) {
            this.f82019b3 = str;
            C26674y.m136865t().m136877n(str, "eventbox_id_" + str, new C26674y.b() { // from class: nc0.x
                public /* synthetic */ C23725x() {
                }

                @Override // tg.C26674y.b
                /* renamed from: a */
                public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                    ShareView.this.m87493aO(i11, str2, str3, c26657h);
                }
            }, (byte) 10);
        }
    }

    /* renamed from: AO */
    public /* synthetic */ void m87422AO() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        Runnable runnable4;
        try {
            try {
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                for (ContactProfile contactProfile : this.f81985Q1) {
                    C31986k3 c31986k3 = C31986k3.f147083a;
                    if (c31986k3.m154108R1(contactProfile.f42434r)) {
                        z11 = true;
                    } else {
                        if (c31986k3.m154121a2(contactProfile.f42434r) && c31986k3.m154098K2(contactProfile.f42434r)) {
                            z13 = true;
                        }
                        z12 = true;
                    }
                }
                List m87443IN = m87443IN(z11, z12, z13);
                if (!m87443IN.isEmpty()) {
                    m87424BN(m87443IN);
                    synchronized (this.f82018b2) {
                        try {
                            this.f82015a2 = false;
                            Handler handler = this.f82057t2;
                            if (handler != null && (runnable4 = this.f82016a3) != null) {
                                handler.removeCallbacks(runnable4);
                            }
                            if (!this.f82021c2.get()) {
                                m92676n2().runOnUiThread(new Runnable() { // from class: nc0.z
                                    public /* synthetic */ RunnableC23727z() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ShareView.this.mo49315c4();
                                    }
                                });
                            }
                        } finally {
                        }
                    }
                    return;
                }
                m87575TO(true);
                synchronized (this.f82018b2) {
                    try {
                        this.f82015a2 = false;
                        Handler handler2 = this.f82057t2;
                        if (handler2 != null && (runnable3 = this.f82016a3) != null) {
                            handler2.removeCallbacks(runnable3);
                        }
                        if (!this.f82021c2.get()) {
                            m92676n2().runOnUiThread(new Runnable() { // from class: nc0.z
                                public /* synthetic */ RunnableC23727z() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShareView.this.mo49315c4();
                                }
                            });
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                synchronized (this.f82018b2) {
                    try {
                        this.f82015a2 = false;
                        Handler handler3 = this.f82057t2;
                        if (handler3 != null && (runnable = this.f82016a3) != null) {
                            handler3.removeCallbacks(runnable);
                        }
                        if (!this.f82021c2.get()) {
                            m92676n2().runOnUiThread(new Runnable() { // from class: nc0.z
                                public /* synthetic */ RunnableC23727z() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShareView.this.mo49315c4();
                                }
                            });
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this.f82018b2) {
                try {
                    this.f82015a2 = false;
                    Handler handler4 = this.f82057t2;
                    if (handler4 != null && (runnable2 = this.f82016a3) != null) {
                        handler4.removeCallbacks(runnable2);
                    }
                    if (!this.f82021c2.get()) {
                        m92676n2().runOnUiThread(new Runnable() { // from class: nc0.z
                            public /* synthetic */ RunnableC23727z() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.this.mo49315c4();
                            }
                        });
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* renamed from: BN */
    private void m87424BN(List list) {
        List arrayList;
        if (m87444IO(list)) {
            C24559a.m127933c("[E2EE]", "Show dialog download file to forward (big file)");
            if (this.f81997U1.m136152e() != null) {
                arrayList = this.f81997U1.m136152e();
            } else {
                arrayList = new ArrayList();
                arrayList.add(this.f81997U1.f125452h);
            }
            m87427CN(arrayList);
            return;
        }
        C24559a.m127933c("[E2EE]", "Download file in background and forward (small file)");
        C26404f c26404f = this.f81997U1;
        if (c26404f != null) {
            c26404f.f125439U = C23793c.m124316k().mo124319c();
        }
        Iterator it = this.f81985Q1.iterator();
        while (it.hasNext()) {
            AbstractC23112j7.m118513W(((ContactProfile) it.next()).mo2478b(), this.f81997U1);
        }
        m87579oN();
        ToastUtils.m89272t(AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_shared));
    }

    /* renamed from: BO */
    public /* synthetic */ void m87425BO() {
        this.f72421L0.mo46829Y();
    }

    /* renamed from: CN */
    private void m87427CN(List list) {
        mo70710wy(new Runnable() { // from class: nc0.k0

            /* renamed from: q */
            public final /* synthetic */ List f114779q;

            public /* synthetic */ RunnableC23706k0(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ShareView.this.m87496bO(r2);
            }
        });
    }

    /* renamed from: CO */
    public /* synthetic */ void m87428CO() {
        this.f72421L0.mo46829Y();
    }

    /* renamed from: DN */
    public void m87430DN(String str) {
        try {
            if (this.f81984Q0 != null) {
                if (TextUtils.isEmpty(str)) {
                    this.f82059u2.removeMessages(0);
                    this.f81984Q0.m36375N(this.f81957D1);
                    this.f81984Q0.m10008p();
                } else {
                    this.f82059u2.removeMessages(0);
                    this.f82059u2.m133832p(this.f82059u2.m133825i(0, str));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: DO */
    public /* synthetic */ void m87431DO(int i11, List list) {
        List list2;
        synchronized (this) {
            try {
                if (this.f82022c3 == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f82022c3 = arrayList;
                    C17945a0 c17945a0 = this.f82024d2;
                    if (c17945a0 != null) {
                        arrayList.add(c17945a0);
                    }
                    List list3 = this.f82027e2;
                    if (list3 != null) {
                        this.f82022c3.addAll(list3);
                    }
                    List list4 = this.f82045n2;
                    if (list4 != null) {
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            this.f82022c3.add(((MediaStoreItem) it.next()).m40599m());
                        }
                    }
                }
                String str = this.f81976M2;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        C2526d.f10270a.m12695T(this.f82022c3, this.f81978N2, str, this.f81974L2, list);
                                    }
                                } else {
                                    C2526d.f10270a.m12694S(this.f82022c3, this.f81978N2, str, this.f81974L2, list);
                                }
                            } else {
                                C2526d.f10270a.m12696U(this.f82022c3, this.f81978N2, str, this.f81974L2, list);
                            }
                        } else {
                            C2526d.f10270a.m12697V(this.f82022c3, this.f81978N2, str, this.f81974L2, list);
                        }
                    } else {
                        C2526d.f10270a.m12692Q(this.f82022c3, this.f81978N2, str, this.f81974L2, list);
                    }
                } else {
                    C2526d.f10270a.m12693R(this.f82022c3, this.f81978N2, str, this.f81974L2);
                }
                if (i11 == 0) {
                    List list5 = this.f82022c3;
                    if (list5 != null && !list5.isEmpty()) {
                        AbstractC9183a.m49009q(this.f82022c3, this.f81976M2);
                    } else {
                        C26404f c26404f = this.f81997U1;
                        if (c26404f != null && c26404f.m136157j() != null) {
                            AbstractC9183a.m49007o(this.f81997U1.m136157j(), this.f81976M2);
                        } else {
                            C26404f c26404f2 = this.f81997U1;
                            if (c26404f2 != null && (list2 = c26404f2.f125434P) != null) {
                                AbstractC9183a.m49008p(list2, this.f81976M2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: EO */
    public /* synthetic */ void m87433EO(C17391z c17391z, boolean z11, View view) {
        if (c17391z != null) {
            AbstractC2379w.m12430d(view);
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_VIDEO_INFO", this.f81997U1.m136161n());
            bundle.putInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 4);
            bundle.putString("video_str", c17391z.m92540e().toString());
            bundle.putBoolean("EXTRA_BOOLEAN_HIDE_OPTION_MENU", true);
            C17945a0 c17945a0 = this.f81997U1.f125452h;
            if (c17945a0 != null) {
                bundle.putString("extra_chat_content_owner_id", c17945a0.mo95039W2());
                bundle.putParcelable("extra_chat_content_message_id", this.f81997U1.f125452h.m95029V3());
            }
            if (z11) {
                bundle.putBoolean("EXTRA_GIF_MODE", true);
                bundle.putString("VIDEO_TITLE_BAR", "GIF");
                bundle.putBoolean("EXTRA_BOOLEAN_HANDLE_SCREEN_ORIENTATION", false);
            }
            getContext().startActivity(AbstractC23152n3.m119012O(MinimizableVideoPlayerView.class, bundle));
        }
    }

    /* renamed from: FN */
    private String m87435FN(String str) {
        return AbstractC23041d2.m118216o(str);
    }

    /* renamed from: FO */
    public /* synthetic */ void m87436FO(View view) {
        try {
            if (this.f81997U1.m136157j() != null && !TextUtils.isEmpty(this.f81997U1.m136157j().f125481d)) {
                if (!TextUtils.isEmpty(AbstractC20550a.m106804a(this.f81997U1.m136157j().f125481d))) {
                    AbstractC20550a.m106805b(m92648SI(), this.f81997U1.m136157j().f125481d);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_WEB_URL", this.f81997U1.m136157j().f125481d);
                    ZaloWebView.m87105iS(m92676n2(), this.f81997U1.m136157j().f125481d, bundle);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:14|15|(4:20|(3:22|(1:24)(1:59)|(3:26|27|(5:29|30|(2:34|(2:39|(1:43))(1:38))|44|(1:46)(1:49))(2:50|(2:52|(2:54|55)(1:56))(1:57)))(1:58))(5:60|(2:65|(1:76)(2:71|(2:73|74)(1:75)))|79|80|(5:82|83|(1:85)(1:88)|86|87)(2:89|(2:91|92)(1:93)))|47|48)|94|95|96|(2:100|(2:102|(5:104|(1:106)|107|(1:109)|110)(2:111|(2:117|(2:119|(11:121|122|123|124|125|126|127|128|129|130|131))(1:152)))))|153|(4:155|156|47|48)(1:157)) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x030a, code lost:            if (r3 == null) goto L330;     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x026e, code lost:            r2 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031d, code lost:            mm0.AbstractC23350e.m122778h(r2);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.StringBuilder] */
    /* renamed from: GN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Intent m87438GN() {
        Intent intent;
        Intent intent2;
        File m123576h;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        List list;
        boolean z11;
        ?? r12 = 0;
        try {
            if (!this.f81975M1) {
                return null;
            }
            try {
                if (this.f81997U1.m136159l() != 2 && this.f81997U1.m136159l() != 4) {
                    ?? m136159l = this.f81997U1.m136159l();
                    try {
                        if (m136159l != 1 && this.f81997U1.m136159l() != 13) {
                            if (this.f81997U1.m136159l() == 5) {
                                C26404f c26404f = this.f81997U1;
                                C17945a0 c17945a0 = c26404f.f125452h;
                                if (c17945a0 != null) {
                                    z11 = c17945a0.m95288w8();
                                } else {
                                    z11 = c26404f.m136161n().f128949V;
                                }
                                if (z11) {
                                    return null;
                                }
                                C26404f c26404f2 = this.f81997U1;
                                if (c26404f2.f125452h != null) {
                                    intent2 = new Intent();
                                    intent2.setAction("android.intent.action.SEND");
                                    String m94983Q3 = this.f81997U1.f125452h.m94983Q3();
                                    if (TextUtils.isEmpty(m94983Q3) && !TextUtils.isEmpty(this.f81997U1.f125452h.m95090b5())) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(AbstractC20130d.m104904x0().getAbsolutePath());
                                        String str = File.separator;
                                        sb2.append(str);
                                        sb2.append(AbstractC23352g.m122788d(this.f81997U1.f125452h.m95090b5()));
                                        sb2.append(".mp4");
                                        File file = new File(sb2.toString());
                                        if (file.exists() && file.length() > 0) {
                                            m94983Q3 = file.getAbsolutePath();
                                        } else {
                                            File file2 = new File(AbstractC20130d.m104904x0().getAbsolutePath() + str + AbstractC23352g.m122788d(this.f81997U1.f125452h.m95090b5()) + ".mp4");
                                            if (file2.exists() && file2.length() > 0) {
                                                m94983Q3 = file2.getAbsolutePath();
                                            }
                                        }
                                    }
                                    if (TextUtils.isEmpty(m94983Q3)) {
                                        ToastUtils.showMess(m92652XI(AbstractC8020f0.share_video_error_download));
                                    } else {
                                        intent2.setType("video/" + m87435FN(m94983Q3));
                                        m87461OO(intent2, m94983Q3);
                                    }
                                } else {
                                    if (c26404f2.m136161n() == null) {
                                        return null;
                                    }
                                    String m140220E = this.f81997U1.m136161n().m140220E();
                                    if (TextUtils.isEmpty(m140220E)) {
                                        return null;
                                    }
                                    intent2 = new Intent();
                                    intent2.setAction("android.intent.action.SEND");
                                    intent2.setType("video/" + m87435FN(m140220E));
                                    m87461OO(intent2, m140220E);
                                }
                            } else {
                                if (this.f81997U1.m136159l() != 10 && this.f81997U1.m136159l() != 3) {
                                    if (this.f81997U1.m136159l() != 21 || (list = this.f81997U1.f125434P) == null || list.size() != 1) {
                                        return null;
                                    }
                                    String m48437d = ((ShareLinkInfo) this.f81997U1.f125434P.get(0)).m48437d();
                                    if (TextUtils.isEmpty(m48437d)) {
                                        return null;
                                    }
                                    intent2 = new Intent();
                                    intent2.setAction("android.intent.action.SEND");
                                    intent2.putExtra("android.intent.extra.TEXT", m48437d);
                                    intent2.setType("text/plain");
                                }
                                C26404f c26404f3 = this.f81997U1;
                                if (c26404f3.f125452h != null) {
                                    intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    if (TextUtils.isEmpty(this.f81997U1.f125452h.m94983Q3())) {
                                        ToastUtils.showMess(m92652XI(AbstractC8020f0.share_file_error_download));
                                    } else {
                                        String m94983Q32 = this.f81997U1.f125452h.m94983Q3();
                                        intent.setType("application/" + m87435FN(m94983Q32));
                                        m87461OO(intent, m94983Q32);
                                    }
                                    return intent;
                                }
                                String m136149b = c26404f3.m136149b();
                                if (TextUtils.isEmpty(m136149b)) {
                                    return null;
                                }
                                intent2 = new Intent();
                                intent2.setAction("android.intent.action.SEND");
                                intent2.setType("application/" + m87435FN(m136149b));
                                m87461OO(intent2, m136149b);
                            }
                            return intent2;
                        }
                        String m136149b2 = this.f81997U1.m136149b();
                        C17945a0 c17945a02 = this.f81997U1.f125452h;
                        if (c17945a02 != null && c17945a02.m94929K2() != null) {
                            C17969i0 m94929K2 = this.f81997U1.f125452h.m94929K2();
                            if (m94929K2 instanceof C18009w0) {
                                String mo95598f = m94929K2.mo95598f();
                                if (AbstractC23078g6.m118385c(m136149b2)) {
                                    if (mo95598f.isEmpty()) {
                                        mo95598f = m94929K2.f91014s;
                                    }
                                    File m123576h2 = AbstractC23529b.m123576h(m92689tK(), mo95598f);
                                    if (m123576h2 == null) {
                                        m123576h2 = AbstractC23041d2.m118218q(m136149b2);
                                    }
                                    m136149b2 = AbstractC23078g6.m118384b(m123576h2, "", m136149b2);
                                } else if (!TextUtils.isEmpty(mo95598f) && (m123576h = AbstractC23529b.m123576h(m92689tK(), mo95598f)) != null && m123576h.exists()) {
                                    if (TextUtils.isEmpty(m87435FN(m123576h.getAbsolutePath()))) {
                                        ?? m87435FN = m87435FN(m136149b2);
                                        if (!TextUtils.isEmpty(m87435FN)) {
                                            try {
                                                File file3 = new File(AbstractC20130d.m104848O0() + "zalo." + m87435FN);
                                                try {
                                                    fileInputStream = new FileInputStream(m123576h);
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    fileInputStream = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    m87435FN = 0;
                                                    if (m87435FN != 0) {
                                                        m87435FN.close();
                                                    }
                                                    throw th;
                                                }
                                                try {
                                                    fileOutputStream = new FileOutputStream(file3);
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    AbstractC23350e.m122778h(e);
                                                }
                                                try {
                                                    FileChannel channel = fileInputStream.getChannel();
                                                    fileOutputStream.getChannel().transferFrom(channel, 0L, channel.size());
                                                    fileOutputStream.close();
                                                    fileInputStream.close();
                                                    m136149b2 = file3.getAbsolutePath();
                                                } catch (Throwable th3) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable th4) {
                                                        th3.addSuppressed(th4);
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                    } else {
                                        m136149b2 = m123576h.getAbsolutePath();
                                    }
                                }
                            }
                        }
                        if (TextUtils.isEmpty(m136149b2)) {
                            return null;
                        }
                        intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.setType("image/" + m87435FN(m136149b2));
                        m87461OO(intent2, m136149b2);
                        return intent2;
                    } catch (Exception e13) {
                        e = e13;
                        r12 = m136159l;
                        AbstractC23350e.m122776f(f81950e3, e);
                        return r12;
                    }
                }
                intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                if (this.f81997U1.m136157j() != null && !TextUtils.isEmpty(this.f81997U1.m136157j().f125481d)) {
                    intent.putExtra("android.intent.extra.TEXT", this.f81997U1.m136157j().f125481d);
                } else {
                    intent.putExtra("android.intent.extra.TEXT", this.f81997U1.m136155h());
                }
                intent.setType("text/plain");
                return intent;
            } catch (Exception e14) {
                r12 = ".mp4";
                e = e14;
            }
        } catch (Exception e15) {
            e = e15;
            AbstractC23350e.m122776f(f81950e3, e);
            return r12;
        }
    }

    /* renamed from: GO */
    public /* synthetic */ void m87439GO(View view) {
        C25630b m143282P0;
        try {
            if (this.f81997U1.f125464t != null && (m143282P0 = C28644j.m143233Y().m143282P0(this.f81997U1.f125464t)) != null && m143282P0.m132425e() > 0) {
                AbstractC2379w.m12430d(this.f82011Z0);
                this.f81956C2 = false;
                m87421AN(String.valueOf(m143282P0.m132425e()));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: HN */
    private void m87441HN(boolean z11) {
        AbstractC0837p0.m2225f().mo2040a(new RunnableC16137d(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* renamed from: IN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List m87443IN(boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        ArrayList arrayList = new ArrayList();
        boolean z16 = false;
        if (!z13) {
            C17945a0 c17945a0 = this.f81997U1.f125452h;
            if (c17945a0 != null && c17945a0.m95234q7()) {
                if (!this.f81997U1.f125452h.m95170j6() && !C31986k3.f147083a.m154109S1(this.f81997U1.f125452h.m95090b5())) {
                    z15 = true;
                    if (this.f81997U1.m136152e() != null) {
                        for (C17945a0 c17945a02 : this.f81997U1.m136152e()) {
                            if (c17945a02.m95234q7()) {
                                if (c17945a02.m95170j6()) {
                                    z16 = true;
                                } else {
                                    z15 = true;
                                }
                            }
                        }
                    }
                    boolean z17 = z15;
                    z14 = z16;
                    z16 = z17;
                } else {
                    z16 = true;
                }
            }
            z15 = false;
            if (this.f81997U1.m136152e() != null) {
            }
            boolean z172 = z15;
            z14 = z16;
            z16 = z172;
        } else {
            z14 = false;
        }
        if (z13 || ((z16 && z11) || (z14 && z12))) {
            C17945a0 c17945a03 = this.f81997U1.f125452h;
            if (c17945a03 != null && c17945a03.m95234q7() && !c17945a03.m95240r6()) {
                arrayList.add(c17945a03);
            }
            if (this.f81997U1.m136152e() != null) {
                for (C17945a0 c17945a04 : this.f81997U1.m136152e()) {
                    if (c17945a04.m95234q7() && !c17945a04.m95240r6()) {
                        arrayList.add(c17945a04);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: IO */
    private boolean m87444IO(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C17945a0) it.next()).m94916I6()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: JN */
    public void m87446JN(String str) {
        try {
            this.f81997U1.m136162o(str);
            m92676n2().runOnUiThread(new Runnable() { // from class: nc0.t
                public /* synthetic */ RunnableC23721t() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87528kP();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JO */
    private void m87447JO() {
        if (this.f81997U1.m136159l() == 1 || this.f81997U1.m136159l() == 13) {
            CameraInputParams m39206p = CameraInputParams.m39206p(this.f81997U1.m136149b());
            Bundle bundle = new Bundle();
            bundle.putParcelable("TRACKING_SOURCE_POST_STORY_KEY", new TrackingSource(5));
            AbstractC22470k.m116168t(m92676n2(), 12345, 2, m39206p, bundle);
        }
    }

    /* renamed from: KN */
    public void m87449KN() {
        try {
            m92676n2().runOnUiThread(new Runnable() { // from class: nc0.c0
                public /* synthetic */ RunnableC23690c0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87502dO();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KO */
    private void m87450KO(C27373c c27373c) {
        String str;
        try {
            CameraInputParams m39208t = CameraInputParams.m39208t(c27373c);
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            if (videoBlendingParam != null && videoBlendingParam.f48265Q > 0) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_prefix) + " ";
            } else {
                str = "";
            }
            m39208t.f41122o0 = str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_snackbar_msg_share_video_from_outapp_failed);
            m39208t.f41126q0 = true;
            m39208t.f41124p0 = C2526d.m12658f(c27373c);
            m39208t.f41128r0 = "share_outapp";
            AbstractC22470k.m116167s(m92676n2(), 2202, 1, m39208t);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0015, B:16:0x0035, B:18:0x003d, B:19:0x0079, B:21:0x009e, B:22:0x00a3, B:24:0x004e, B:26:0x005a, B:27:0x0066, B:28:0x00aa, B:30:0x00b4, B:32:0x00b9, B:35:0x00c7, B:37:0x00d8, B:38:0x00dd, B:40:0x00e6, B:43:0x00f1, B:46:0x00fc, B:48:0x0106, B:50:0x011c, B:53:0x0127, B:56:0x0132, B:58:0x013c, B:60:0x0148, B:61:0x014b, B:63:0x0150, B:65:0x015a, B:67:0x0166, B:68:0x0169, B:70:0x016e, B:72:0x0178, B:74:0x0184, B:75:0x0187, B:77:0x018c, B:79:0x0196, B:81:0x019a, B:82:0x019d, B:85:0x01a2, B:87:0x01b6, B:89:0x01bc, B:90:0x01d9, B:91:0x01e0, B:93:0x01e4, B:94:0x01ec, B:96:0x01f0, B:98:0x0203, B:101:0x020b, B:104:0x0216, B:106:0x021c, B:108:0x0222, B:112:0x01c2, B:114:0x01ce, B:115:0x01d4, B:116:0x01dd), top: B:1:0x0000 }] */
    /* renamed from: LN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m87452LN(ContactProfile contactProfile) {
        String str;
        try {
            boolean z11 = true;
            if (contactProfile.f42434r.startsWith("-")) {
                if (contactProfile.f42434r.equals("-3")) {
                    AbstractC23647d.m123906p("13640");
                    AbstractC23647d.m123893c();
                    Bundle bundle = new Bundle();
                    int m136159l = this.f81997U1.m136159l();
                    if (m136159l != 1) {
                        if (m136159l != 2) {
                            if (m136159l != 4) {
                                if (m136159l != 13) {
                                    return;
                                }
                            } else if (this.f81997U1.m136157j() != null) {
                                bundle.putString("extra_share_original_link", this.f81997U1.m136157j().f125481d);
                            }
                        } else if (!TextUtils.isEmpty(this.f81997U1.m136155h())) {
                            bundle.putSerializable("status", this.f81997U1.m136155h());
                        }
                        bundle.putBoolean("fromShareVia", true);
                        bundle.putBoolean("bol_back_to_source", this.f81977N1);
                        bundle.putBoolean("bol_auto_back_to_source", this.f81979O1);
                        bundle.putString("token", this.f81982P1);
                        bundle.putString("extra_tracking_source", this.f81964G2);
                        str = this.f82047o2;
                        if (str != null) {
                            bundle.putString("extra_action_list_task_id", str);
                        }
                        m87491ZO(UpdateStatusView.class, bundle);
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f81997U1.m136149b());
                    bundle.putStringArrayList("path", arrayList);
                    bundle.putBoolean("fromShareVia", true);
                    bundle.putBoolean("bol_back_to_source", this.f81977N1);
                    bundle.putBoolean("bol_auto_back_to_source", this.f81979O1);
                    bundle.putString("token", this.f81982P1);
                    bundle.putString("extra_tracking_source", this.f81964G2);
                    str = this.f82047o2;
                    if (str != null) {
                    }
                    m87491ZO(UpdateStatusView.class, bundle);
                    return;
                }
                if (contactProfile.f42434r.equals("-2")) {
                    m87569zN();
                    return;
                }
                C17487o0 c17487o0 = null;
                if (contactProfile.f42434r.equals("-10")) {
                    AbstractC23647d.m123906p("13693");
                    AbstractC23647d.m123893c();
                    Bundle bundle2 = new Bundle();
                    String str2 = contactProfile.f42358M0;
                    if (str2 != null) {
                        bundle2.putString("extra_preload_data", str2);
                    }
                    bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(QuickCreateGroupView.class, bundle2, 12346, 1, true);
                        return;
                    }
                    return;
                }
                if (contactProfile.f42434r.equals("-1")) {
                    AbstractC23647d.m123906p("13691");
                    AbstractC23647d.m123893c();
                    Bundle bundle3 = new Bundle();
                    bundle3.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    }
                    C17487o0 c17487o03 = c17487o0;
                    if (c17487o03 != null) {
                        c17487o03.m93066i2(QuickCreateGroupView.class, bundle3, 12346, 1, true);
                        return;
                    }
                    return;
                }
                if (contactProfile.f42434r.equals("-4")) {
                    AbstractC23647d.m123906p("136920");
                    AbstractC23647d.m123893c();
                    C24221a c24221a = this.f82063w2;
                    if (c24221a != null) {
                        c24221a.m126336K(true);
                    }
                    m87463PO();
                    return;
                }
                if (contactProfile.f42434r.equals("-5")) {
                    AbstractC23647d.m123906p("136921");
                    AbstractC23647d.m123893c();
                    C24221a c24221a2 = this.f82063w2;
                    if (c24221a2 != null) {
                        c24221a2.m126335J(true);
                    }
                    m87463PO();
                    return;
                }
                if (contactProfile.f42434r.equals("-6")) {
                    AbstractC23647d.m123906p("136922");
                    AbstractC23647d.m123893c();
                    C24221a c24221a3 = this.f82063w2;
                    if (c24221a3 != null) {
                        c24221a3.m126334I(true);
                    }
                    m87463PO();
                    return;
                }
                if (contactProfile.f42434r.equals("-7")) {
                    C24221a c24221a4 = this.f82063w2;
                    if (c24221a4 != null) {
                        c24221a4.m126333H(true);
                    }
                    m87463PO();
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(this.f82011Z0.getText().toString().trim())) {
                if (contactProfile.m40374K0()) {
                    AbstractC23647d.m123906p("13612");
                } else if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                    AbstractC23647d.m123906p("13613");
                } else {
                    AbstractC23647d.m123906p("13611");
                }
                AbstractC23647d.m123893c();
            } else {
                m87572HO(contactProfile);
            }
            List list = this.f81985Q1;
            if (list != null) {
                list.clear();
                this.f81985Q1.add(contactProfile);
            }
            C26404f c26404f = this.f81997U1;
            if (c26404f != null) {
                c26404f.m136172y(this.f82017b1.getText().toString());
                C17945a0 c17945a0 = this.f81997U1.f125452h;
                if (c17945a0 == null || c17945a0.m94929K2() == null) {
                    z11 = false;
                }
                if (this.f81997U1.m136159l() == 5 && !z11 && AbstractC23309i.m121905fg()) {
                    m87455MN(this.f81997U1);
                } else {
                    m87472SO(this.f81997U1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LO */
    private void m87453LO(String str, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i11 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                if (i11 != 1) {
                    if (i11 == 11) {
                        C26404f c26404f = new C26404f(11);
                        this.f81997U1 = c26404f;
                        c26404f.f125465u = jSONObject.optString("gifUrl");
                        this.f81997U1.f125466v = jSONObject.optString("photoUrl");
                        this.f81997U1.f125467w = jSONObject.optInt("width");
                        this.f81997U1.f125468x = jSONObject.optInt("height");
                        this.f81997U1.f125470z = jSONObject.optString("contentId");
                        this.f81997U1.f125469y = jSONObject.optString("smallUrl");
                        this.f81997U1.m136162o(jSONObject.optString("dataPath"));
                        this.f81997U1.f125428J = z11;
                    }
                } else {
                    C26404f c26404f2 = new C26404f(1);
                    this.f81997U1 = c26404f2;
                    c26404f2.f125429K = this.f82051q2;
                    c26404f2.f125463s = jSONObject.optString("photoUrl");
                    this.f81997U1.m136162o(jSONObject.optString("dataPath"));
                    this.f81997U1.m136169v(jSONObject.optString("pid"));
                    if (z11) {
                        this.f81997U1.f125429K = 10;
                    } else {
                        this.f81997U1.f125429K = 18;
                    }
                }
                C26404f c26404f3 = this.f81997U1;
                if (c26404f3 != null) {
                    c26404f3.f125444Z = this.f81980O2;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: MN */
    private void m87455MN(C26404f c26404f) {
        try {
            if (c26404f.m136161n() == null) {
                return;
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: nc0.s

                /* renamed from: q */
                public final /* synthetic */ C26404f f114795q;

                public /* synthetic */ RunnableC23720s(C26404f c26404f2) {
                    r2 = c26404f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87505eO(r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: NN */
    private void m87457NN(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("EXTRA_VIDEO_INFO")) {
                    C27373c c27373c = (C27373c) intent.getSerializableExtra("EXTRA_VIDEO_INFO");
                    intent.getStringExtra("extra_result_video_log");
                    if (c27373c != null) {
                        C26404f c26404f = new C26404f(5);
                        this.f81997U1 = c26404f;
                        c26404f.f125444Z = this.f81980O2;
                        c26404f.f125429K = this.f82051q2;
                        c26404f.m136173z(c27373c);
                        if (!TextUtils.isEmpty(this.f82017b1.getText())) {
                            this.f81997U1.m136172y(this.f82017b1.getText().toString());
                        } else if (!TextUtils.isEmpty(this.f82000V1)) {
                            this.f81997U1.m136172y(this.f82000V1);
                        }
                    }
                    m87505eO(this.f81997U1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: NO */
    public void m87458NO(Object obj) {
        try {
            if (obj instanceof String) {
                List<ContactProfile> m120006s = AbstractC23262x6.m120006s((String) obj, this.f82063w2.m126366p(), this.f81955C1, true);
                ArrayList arrayList = new ArrayList();
                for (ContactProfile contactProfile : m120006s) {
                    if (m87468RN(contactProfile, this.f82063w2, true)) {
                        arrayList.add(contactProfile);
                    }
                }
                Handler handler = this.f82057t2;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: nc0.g0

                        /* renamed from: q */
                        public final /* synthetic */ Object f114764q;

                        /* renamed from: r */
                        public final /* synthetic */ List f114765r;

                        public /* synthetic */ RunnableC23698g0(Object obj2, List arrayList2) {
                            r2 = obj2;
                            r3 = arrayList2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareView.this.m87570zO(r2, r3);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x093b, code lost:            if (android.text.TextUtils.isEmpty(r3.m136149b()) != false) goto L695;     */
    /* renamed from: ON */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m87460ON(Bundle bundle) {
        boolean z11;
        boolean z12;
        RobotoEditText robotoEditText;
        try {
            this.f82051q2 = bundle.getInt("extra_source_log", -1);
            this.f82010Y2 = false;
            AbstractC23112j7.m118566y0(EnumC26407i.f125519u);
            this.f81982P1 = bundle.getString("token");
            this.f81977N1 = bundle.getBoolean("bol_back_to_source", false);
            this.f81979O1 = bundle.getBoolean("bol_auto_back_to_source", false);
            this.f81975M1 = bundle.getBoolean("bol_share_in_app", false);
            this.f82043m2 = bundle.getBoolean("btn_extra_show_hide_post_feed", false);
            boolean containsKey = bundle.containsKey("currentCaption");
            this.f81951A1 = containsKey;
            this.f82000V1 = containsKey ? bundle.getString("currentCaption") : null;
            this.f82003W1 = bundle.containsKey("fromDirectShare") && bundle.getBoolean("fromDirectShare");
            this.f81964G2 = bundle.getString("extra_tracking_source_feed", "");
            this.f81966H2 = bundle.getBoolean("EXTRA_SHARE_TIMELINE_FORWARD_REQUEST_CODE", false);
            if (bundle.containsKey("STR_EXTRA_SHARE_ZINSTANT")) {
                String string = bundle.getString("STR_EXTRA_SHARE_ZINSTANT");
                C26404f c26404f = new C26404f(20);
                this.f81997U1 = c26404f;
                c26404f.f125440V = new JSONObject(string);
            } else if (bundle.containsKey("contentNeedToShare")) {
                String string2 = bundle.getString("contentNeedToShare");
                C26404f c26404f2 = new C26404f(7);
                this.f81997U1 = c26404f2;
                c26404f2.f125424F = string2;
                JSONObject jSONObject = new JSONObject(string2);
                this.f81997U1.f125425G = jSONObject.optString("name");
                this.f81997U1.f125426H = jSONObject.optString("iconPreview");
            } else if (bundle.containsKey("sharingUid")) {
                this.f81991S1 = bundle.containsKey("sharingUid") ? bundle.getString("sharingUid") : "";
                String string3 = bundle.containsKey("sharingAvt") ? bundle.getString("sharingAvt") : "";
                String string4 = bundle.containsKey("sharingDpn") ? bundle.getString("sharingDpn") : "";
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f81991S1);
                if (m141809c == null && bundle.getBoolean("extra_bundle_contact_oa_profile_to_share", false)) {
                    m141809c = new ContactProfile(this.f81991S1);
                    m141809c.f42437s = string4;
                    m141809c.f42446v = string3;
                    m141809c.f42352K0 = 1;
                }
                C26404f c26404f3 = new C26404f(9);
                this.f81997U1 = c26404f3;
                c26404f3.f125456l = m141809c;
            } else if (bundle.containsKey("imagePathUri")) {
                if (bundle.containsKey("imageCaption")) {
                    this.f82000V1 = bundle.getString("imageCaption");
                }
                if (bundle.containsKey("flag_share_multi_photo") && bundle.getBoolean("flag_share_multi_photo", false)) {
                    if (bundle.containsKey("extra_share_multi_photo_from_media_item_list")) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("extra_share_multi_photo_from_media_item_list");
                        if (parcelableArrayList != null) {
                            C26404f c26404f4 = new C26404f(parcelableArrayList);
                            this.f81997U1 = c26404f4;
                            c26404f4.f125433O = bundle.getBoolean("EXTRA_FROM_ACTION_LIST_MEDIA_PICKER");
                        }
                    } else {
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("extra_share_multi_photo");
                        if (stringArrayList != null) {
                            boolean z13 = bundle.getBoolean("bol_extra_photo_hd", false);
                            ArrayList arrayList = new ArrayList();
                            Iterator<String> it = stringArrayList.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                MediaItem mediaItem = new MediaItem();
                                mediaItem.m41116O0(z13);
                                mediaItem.mo41082W0(next);
                                arrayList.add(mediaItem);
                            }
                            C26404f c26404f5 = new C26404f(arrayList);
                            this.f81997U1 = c26404f5;
                            c26404f5.f125462r = z13;
                        }
                    }
                } else {
                    this.f81969J1 = bundle.getString("imagePathUri");
                    if (bundle.getBoolean("bol_open_post_feed", false)) {
                        Bundle bundle2 = new Bundle();
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(this.f81969J1);
                        bundle2.putStringArrayList("path", arrayList2);
                        if (!TextUtils.isEmpty(this.f82000V1)) {
                            bundle2.putString("status", this.f82000V1);
                        }
                        bundle2.putBoolean("fromShareVia", true);
                        bundle2.putBoolean("bol_back_to_source", this.f81977N1);
                        bundle2.putBoolean("bol_auto_back_to_source", this.f81979O1);
                        bundle2.putString("token", this.f81982P1);
                        bundle2.putString("extra_tracking_source", this.f81964G2);
                        m87491ZO(UpdateStatusView.class, bundle2);
                        this.f82049p2 = true;
                    } else {
                        if (this.f81969J1.toLowerCase().endsWith(".gif")) {
                            this.f81997U1 = new C26404f(5);
                            C27373c c27373c = new C27373c();
                            c27373c.m140250e0(this.f81969J1);
                            c27373c.f128949V = true;
                            this.f81997U1.m136173z(c27373c);
                            AbstractC26897a.m138619e(c27373c);
                            String m140995l = AbstractC27985d.m140995l(System.currentTimeMillis());
                            AbstractC3460h.m17441i(this.f81969J1, new File(m140995l), 480, false);
                            c27373c.m140237V(m140995l);
                            this.f81997U1.f125451g = new C17961f1("", 0, "", "", "", "", C17961f1.m95438A(c27373c, false, 0L, 0, 0, -1L, -1), c27373c);
                            C17979l1 c17979l1 = new C17979l1();
                            c17979l1.f91060c = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
                            this.f81997U1.m136167t(c17979l1);
                        } else {
                            if (bundle.getBoolean("extra_photo_sticker")) {
                                this.f81997U1 = new C26404f(15);
                            } else {
                                this.f81997U1 = new C26404f(1);
                                this.f82001V2.add(new ContactProfile("-2"));
                            }
                            this.f82001V2.add(new ContactProfile("-3"));
                        }
                        C26404f c26404f6 = this.f81997U1;
                        c26404f6.f125429K = this.f82051q2;
                        c26404f6.m136162o(this.f81969J1);
                        this.f81997U1.f125462r = bundle.getBoolean("bol_extra_photo_hd", false);
                    }
                }
            } else if (bundle.containsKey("linktoShare")) {
                this.f81971K1 = bundle.containsKey("linktoShare") ? bundle.getString("linktoShare") : "";
                this.f81973L1 = bundle.containsKey("subjectForLink") ? bundle.getString("subjectForLink") : "";
                this.f81989R2 = bundle.getBoolean("BOL_EXTRA_SHARE_LINK_FROM_SCAN_QR_VIEW", false);
                this.f81992S2 = bundle.getBoolean("BOL_EXTRA_SHARE_LINK_WITH_PARSE_ACTION", false);
                if (bundle.containsKey("shareLinkAttachmentForChat")) {
                    String string5 = bundle.getString("shareLinkAttachmentForChat");
                    this.f82041l2 = TextUtils.isEmpty(string5) ? null : C26405g.m136174b(new JSONObject(string5));
                }
                if (this.f82041l2 == null) {
                    this.f81965H1 = (LinkAttachment) bundle.getParcelable("shareLinkAttachment");
                    if (bundle.containsKey("footer_action_v2")) {
                        this.f81967I1 = new C26713e(new JSONObject(bundle.getString("footer_action_v2", "{}")));
                    }
                }
                String m153548n = C31944h6.m153548n(this.f81971K1);
                if (bundle.getBoolean("bol_open_post_feed", false)) {
                    Bundle bundle3 = new Bundle();
                    if (!TextUtils.isEmpty(m153548n)) {
                        bundle3.putString("extra_share_original_link", this.f81971K1);
                        bundle3.putString("status", this.f81973L1);
                    } else {
                        bundle3.putString("status", this.f81971K1);
                    }
                    bundle3.putBoolean("fromShareVia", true);
                    bundle3.putBoolean("bol_back_to_source", this.f81977N1);
                    bundle3.putBoolean("bol_auto_back_to_source", this.f81979O1);
                    bundle3.putString("token", this.f81982P1);
                    bundle3.putString("extra_tracking_source", this.f81964G2);
                    m87491ZO(UpdateStatusView.class, bundle3);
                    this.f82049p2 = true;
                } else {
                    this.f82001V2.add(new ContactProfile("-3"));
                    if (this.f81975M1 && (this.f82041l2 != null || this.f81965H1 != null)) {
                        C26404f c26404f7 = new C26404f(4);
                        this.f81997U1 = c26404f7;
                        C26405g c26405g = this.f82041l2;
                        if (c26405g != null) {
                            c26404f7.m136170w(c26405g);
                            this.f81997U1.m136165r(this.f82041l2.f125491n);
                        } else {
                            c26404f7.m136170w(new C26405g(this.f81965H1));
                            this.f81997U1.m136165r(this.f81967I1);
                            if (this.f81992S2) {
                                this.f81997U1.f125453i = true;
                                if (!TextUtils.isEmpty(m153548n)) {
                                    m87573MO(m153548n);
                                    z12 = false;
                                } else {
                                    z12 = false;
                                    this.f81997U1.f125453i = false;
                                }
                                this.f81992S2 = z12;
                            }
                        }
                    } else {
                        C26404f c26404f8 = new C26404f(2);
                        this.f81997U1 = c26404f8;
                        c26404f8.m136168u(this.f81971K1);
                        this.f81997U1.m136162o(this.f81971K1);
                        if (this.f81989R2) {
                            this.f81997U1.f125454j = true;
                        }
                        if (bundle.getBoolean("BOL_EXTRA_SHARE_LINK_WITH_PARSE_ACTION", true)) {
                            this.f81997U1.f125453i = true;
                            if (!TextUtils.isEmpty(m153548n)) {
                                m87573MO(m153548n);
                            } else {
                                this.f81997U1.f125453i = false;
                            }
                        }
                    }
                }
            } else if (bundle.containsKey("multipleLinksToShare")) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("multipleLinksToShare");
                C26404f c26404f9 = new C26404f(21);
                this.f81997U1 = c26404f9;
                c26404f9.f125434P = parcelableArrayList2;
                if (parcelableArrayList2 != null && parcelableArrayList2.size() == 1) {
                    this.f82001V2.add(new ContactProfile("-3"));
                }
            } else if (bundle.containsKey("EXTRA_VIDEO_INFO")) {
                C27373c c27373c2 = (C27373c) bundle.getSerializable("EXTRA_VIDEO_INFO");
                if (c27373c2 != null) {
                    C26404f c26404f10 = new C26404f(5);
                    this.f81997U1 = c26404f10;
                    c26404f10.f125429K = this.f82051q2;
                    c26404f10.m136173z(c27373c2);
                    this.f81997U1.f125462r = C17961f1.m95440W(bundle.getBoolean("bol_extra_photo_hd", false));
                }
            } else if (bundle.containsKey("extra_share_rich_content_video")) {
                C17961f1 c17961f1 = (C17961f1) bundle.getSerializable("extra_share_rich_content_video");
                if (c17961f1 != null) {
                    C26404f c26404f11 = new C26404f(5);
                    this.f81997U1 = c26404f11;
                    c26404f11.f125451g = c17961f1;
                    c26404f11.f125429K = this.f82051q2;
                    C27373c c27373c3 = new C27373c();
                    c27373c3.m140250e0(c17961f1.f91014s);
                    c27373c3.m140226K(c17961f1.m95508w());
                    this.f81997U1.m136173z(c27373c3);
                    this.f81997U1.m136163p(c17961f1.m95455I());
                }
            } else if (bundle.containsKey("extra_data_path")) {
                String string6 = bundle.getString("extra_data_path");
                if (!TextUtils.isEmpty(string6)) {
                    C26404f c26404f12 = new C26404f(10);
                    this.f81997U1 = c26404f12;
                    c26404f12.f125429K = this.f82051q2;
                    c26404f12.m136162o(string6);
                }
            } else if (bundle.containsKey("extra_multi_data_path")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("extra_multi_data_path");
                if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                    C26404f c26404f13 = new C26404f(17);
                    this.f81997U1 = c26404f13;
                    c26404f13.m136164q(stringArrayList2);
                    this.f81997U1.f125429K = this.f82051q2;
                }
            } else if (bundle.containsKey("action_list")) {
                m87453LO(bundle.getString("action_list"), bundle.getBoolean("extra_share_from_feed"));
            } else if (bundle.containsKey("bol_extra_is_forwarding")) {
                boolean z14 = bundle.getBoolean("bol_extra_is_forwarding");
                this.f82031g2 = z14;
                if (z14) {
                    this.f82037j2 = bundle.containsKey("forwardMessageId") ? (MessageId) bundle.getParcelable("forwardMessageId") : null;
                    this.f82039k2 = bundle.containsKey("forwardMessageOwnerUid") ? bundle.getString("forwardMessageOwnerUid") : "";
                    C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(this.f82037j2);
                    this.f82024d2 = m2635r;
                    if (m2635r != null) {
                        m87531lP(m2635r, this.f82001V2);
                        this.f81997U1 = m87542qN(this.f82024d2, false, this.f82051q2);
                    }
                    C17945a0 c17945a0 = this.f82024d2;
                    if (c17945a0 != null && c17945a0.m94960N7() && !C31944h6.m153557x(this.f82024d2.m94929K2().f91011p) && C23793c.m124316k().mo124314i() - this.f82024d2.m94974P4() > 86400000) {
                        m87539pN(this.f82024d2);
                    } else if (this.f82024d2.m95306y8()) {
                        if (this.f82024d2.m94929K2() instanceof C17961f1) {
                            C27373c c27373c4 = new C27373c();
                            c27373c4.m140237V(this.f82024d2.m94929K2().f91013r);
                            c27373c4.m140250e0(this.f82024d2.m94929K2().f91014s);
                            c27373c4.m140226K(((C17961f1) this.f82024d2.m94929K2()).m95508w());
                            this.f81997U1.m136173z(c27373c4);
                        }
                    } else if (this.f82024d2.m94977P7() && this.f81997U1.m136159l() == 4 && (this.f82024d2.m94929K2() instanceof C18013y0) && TextUtils.isEmpty(this.f82000V1)) {
                        this.f82000V1 = this.f82024d2.m94929K2().f91011p;
                    }
                    if (this.f81997U1 == null) {
                        throw new IllegalArgumentException("Cannot create share info for forward message " + this.f82037j2);
                    }
                }
            } else if (bundle.containsKey("bol_extra_group_forwarding")) {
                boolean z15 = bundle.getBoolean("bol_extra_group_forwarding");
                this.f82033h2 = z15;
                if (z15) {
                    this.f82037j2 = bundle.containsKey("forwardMessageId") ? (MessageId) bundle.getParcelable("forwardMessageId") : null;
                    this.f82039k2 = bundle.containsKey("forwardMessageOwnerUid") ? bundle.getString("forwardMessageOwnerUid") : "";
                    if (AbstractC23306f.m120584H0().m2635r(this.f82037j2) != null) {
                        List<C17945a0> m102891F0 = AbstractC19646n0.m102891F0(this.f82039k2, this.f82037j2, true);
                        this.f82027e2 = new ArrayList();
                        loop1: while (true) {
                            z11 = true;
                            for (C17945a0 c17945a02 : m102891F0) {
                                if (c17945a02.m94954N0()) {
                                    this.f82027e2.add(c17945a02);
                                    if (!z11) {
                                        continue;
                                    } else if (!c17945a02.m94864C6() && !c17945a02.m94870D6()) {
                                        z11 = false;
                                    }
                                }
                            }
                            break loop1;
                        }
                        if (AbstractC26689j.m137087N()) {
                            AbstractC19646n0.m102964c2(this.f82027e2);
                        }
                        List list = this.f82027e2;
                        if (list != null && list.size() > 0) {
                            C26404f c26404f14 = new C26404f(14);
                            this.f81997U1 = c26404f14;
                            c26404f14.m136166s(this.f82027e2);
                            this.f81997U1.f125462r = z11;
                        }
                        if (this.f81997U1 == null) {
                            throw new IllegalArgumentException("Cannot create share info for forward message " + this.f82037j2);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create share info for forward message " + this.f82037j2);
                    }
                }
            } else if (bundle.containsKey("extra_location_latitude") && bundle.containsKey("extra_location_longitude")) {
                C26404f c26404f15 = new C26404f(12);
                this.f81997U1 = c26404f15;
                c26404f15.f125420B = bundle.getDouble("extra_location_latitude");
                this.f81997U1.f125421C = bundle.getDouble("extra_location_longitude");
                this.f81997U1.f125422D = bundle.getString("extra_location_title");
                C26404f c26404f16 = this.f81997U1;
                if (c26404f16.f125422D == null) {
                    c26404f16.f125422D = "";
                }
                c26404f16.f125423E = bundle.getString("extra_location_snippet");
                C26404f c26404f17 = this.f81997U1;
                if (c26404f17.f125423E == null) {
                    c26404f17.f125423E = "";
                }
            } else if (bundle.containsKey("extra_change_phone_number_new_num") && bundle.containsKey("extra_change_phone_number_old_num")) {
                this.f81997U1 = new C26404f(18);
                String string7 = bundle.getString("extra_change_phone_number_old_num");
                this.f81997U1.f125438T = bundle.getString("extra_change_phone_number_new_num");
                C26404f c26404f18 = this.f81997U1;
                String str = c26404f18.f125438T;
                c26404f18.f125436R = AbstractC23056e6.m118288n(string7);
                this.f81997U1.f125437S = AbstractC23056e6.m118288n(str);
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                this.f81991S1 = contactProfile.f42434r;
                this.f81997U1.f125456l = contactProfile;
            } else if (bundle.containsKey("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES")) {
                boolean z16 = bundle.getBoolean("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES");
                this.f82035i2 = z16;
                if (z16) {
                    this.f82039k2 = bundle.containsKey("forwardMessageOwnerUid") ? bundle.getString("forwardMessageOwnerUid") : "";
                    ArrayList parcelableArrayList3 = bundle.getParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING");
                    this.f82029f2 = parcelableArrayList3;
                    if (parcelableArrayList3 != null) {
                        this.f82027e2 = new LinkedList();
                        Iterator it2 = this.f82029f2.iterator();
                        while (it2.hasNext()) {
                            C17945a0 m2635r2 = AbstractC23306f.m120584H0().m2635r((MessageId) it2.next());
                            if (m2635r2 != null) {
                                this.f82027e2.add(m2635r2);
                            }
                        }
                        List list2 = this.f82027e2;
                        if (list2 != null && !list2.isEmpty()) {
                            if (this.f82027e2.size() == 1 && ((C17945a0) this.f82027e2.get(0)).m94960N7() && C23793c.m124316k().mo124314i() - ((C17945a0) this.f82027e2.get(0)).m94974P4() > 86400000) {
                                C17945a0 c17945a03 = (C17945a0) this.f82027e2.get(0);
                                this.f81997U1 = m87542qN(c17945a03, true, this.f82051q2);
                                m87539pN(c17945a03);
                            } else {
                                this.f81997U1 = new C26404f(19);
                            }
                            C26404f c26404f19 = this.f81997U1;
                            if (c26404f19 != null) {
                                c26404f19.m136166s(this.f82027e2);
                            }
                        }
                    }
                    if (this.f81997U1 == null) {
                        throw new IllegalArgumentException("Cannot create share info for forward message " + this.f82037j2);
                    }
                }
            }
            if (this.f82003W1 && this.f81997U1 != null) {
                String string8 = bundle.getString("userId");
                if (!TextUtils.isEmpty(string8)) {
                    String string9 = bundle.getString("displayname");
                    String string10 = bundle.getString("avatar");
                    ContactProfile contactProfile2 = new ContactProfile();
                    contactProfile2.f42434r = string8;
                    if (!TextUtils.isEmpty(string9)) {
                        contactProfile2.f42437s = string9;
                    }
                    if (!TextUtils.isEmpty(string10)) {
                        contactProfile2.f42446v = string10;
                    }
                    this.f81985Q1.add(contactProfile2);
                    m87483WO();
                }
            }
            if (bundle.containsKey("extra_action_list_task_id")) {
                this.f82047o2 = bundle.getString("extra_action_list_task_id");
            }
            C26404f c26404f20 = this.f81997U1;
            if (c26404f20 != null) {
                c26404f20.f125444Z = this.f81980O2;
                m87528kP();
                if (this.f81997U1.m136159l() == 2) {
                    C26404f c26404f21 = this.f81997U1;
                    if (c26404f21.f125453i && !TextUtils.isEmpty(c26404f21.m136149b())) {
                        String m153548n2 = C31944h6.m153548n(this.f81997U1.m136149b());
                        if (!TextUtils.isEmpty(m153548n2)) {
                            m87573MO(m153548n2);
                        } else {
                            this.f81997U1.f125453i = false;
                        }
                    }
                }
                if (this.f81997U1.m136159l() != 1 || !TextUtils.isEmpty(this.f81997U1.m136149b())) {
                    if (this.f81997U1.m136159l() == 11) {
                        C26404f c26404f22 = this.f81997U1;
                        if (c26404f22.f125452h == null) {
                        }
                    }
                    AbstractC23112j7.m118559v(this.f81997U1, bundle);
                }
                m87500cP(this.f81997U1);
                AbstractC23112j7.m118559v(this.f81997U1, bundle);
            }
            String str2 = this.f82000V1;
            if (str2 == null || (robotoEditText = this.f82017b1) == null) {
                return;
            }
            robotoEditText.setText(str2);
            this.f82017b1.setSelection(this.f82000V1.length());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            finish();
        }
    }

    /* renamed from: OO */
    private void m87461OO(Intent intent, String str) {
        if (!new C20556f(str).m106844q()) {
            if (Build.VERSION.SDK_INT >= 24) {
                intent.setFlags(1);
                intent.putExtra("android.intent.extra.STREAM", FileProvider.m6950f(MainApplication.getAppContext(), "com.zing.zalo.provider", new File(str)));
                return;
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
                return;
            }
        }
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
    }

    /* renamed from: PO */
    public void m87463PO() {
        boolean z11;
        try {
            this.f81957D1.clear();
            if (this.f82063w2 != null) {
                if (this.f81960E2 && !this.f82001V2.isEmpty()) {
                    if (this.f82063w2.m126370t()) {
                        ContactProfile contactProfile = new ContactProfile();
                        contactProfile.f42437s = this.f82063w2.m126356f();
                        contactProfile.m40403e1(false);
                        contactProfile.f42407e1 = true;
                        this.f81957D1.add(contactProfile);
                    }
                    ((ContactProfile) this.f82001V2.get(0)).f42407e1 = true;
                    this.f81957D1.add(new ContactProfile("-11"));
                    this.f82038k1.setVisibility(8);
                    this.f82044n1.setVisibility(8);
                    this.f82046o1.setVisibility(8);
                    this.f82048p1.setVisibility(8);
                    this.f82050q1.setVisibility(8);
                    this.f82052r1.setVisibility(8);
                    this.f82054s1.setVisibility(0);
                    int m118766z = AbstractC23136l9.m118766z(getContext());
                    if (!this.f82001V2.isEmpty()) {
                        int m118742r = (m118766z - AbstractC23136l9.m118742r(32.0f)) / this.f82001V2.size();
                        if (this.f82001V2.size() > 4) {
                            m118742r = (int) ((m118766z - AbstractC23136l9.m118742r(32.0f)) / 4.3f);
                        }
                        for (ContactProfile contactProfile2 : this.f82001V2) {
                            if (contactProfile2.f42434r.equals("-10")) {
                                this.f82040l1.setText(contactProfile2.f42437s);
                                ((C23528a) this.f81953B1.m123612r(this.f82042m1)).m123618x(contactProfile2.f42446v, C23278z2.m120150q0());
                                this.f82038k1.setLayoutParams(new LinearLayout.LayoutParams(m118742r, -2));
                                this.f82038k1.setVisibility(0);
                            } else if (contactProfile2.f42434r.equals("-1")) {
                                if (this.f82001V2.size() == 1) {
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m118766z, -2);
                                    layoutParams.setMargins(0, AbstractC23136l9.m118742r(2.0f), 0, AbstractC23136l9.m118742r(6.0f));
                                    this.f82046o1.setLayoutParams(layoutParams);
                                    this.f82046o1.setVisibility(0);
                                    this.f82054s1.setVisibility(8);
                                } else {
                                    this.f82044n1.setLayoutParams(new LinearLayout.LayoutParams(m118742r, -2));
                                    this.f82044n1.setVisibility(0);
                                }
                            } else if (contactProfile2.f42434r.equals("-2")) {
                                this.f82048p1.setLayoutParams(new LinearLayout.LayoutParams(m118742r, -2));
                                this.f82048p1.setVisibility(0);
                            } else if (contactProfile2.f42434r.equals("-3")) {
                                this.f82050q1.setLayoutParams(new LinearLayout.LayoutParams(m118742r, -2));
                                this.f82050q1.setVisibility(0);
                            } else if (contactProfile2.f42434r.equals("-12")) {
                                this.f82052r1.setLayoutParams(new LinearLayout.LayoutParams(m118742r, -2));
                                this.f82052r1.setVisibility(0);
                            }
                        }
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!this.f82004W2.isEmpty()) {
                    if (z11) {
                        this.f81957D1.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f82063w2.m126373w()) {
                        ContactProfile contactProfile3 = new ContactProfile();
                        contactProfile3.f42437s = this.f82063w2.m126359i();
                        contactProfile3.m40403e1(false);
                        contactProfile3.f42407e1 = true;
                        this.f81957D1.add(contactProfile3);
                    }
                    int size = this.f82004W2.size();
                    if (!this.f82063w2.m126365o() && size > this.f82063w2.m126354d()) {
                        size = this.f82063w2.m126354d();
                    }
                    int i11 = 0;
                    while (i11 < size) {
                        this.f81957D1.add((ContactProfile) this.f82004W2.get(i11));
                        i11++;
                        z11 = true;
                    }
                    if (size < this.f82004W2.size()) {
                        this.f81957D1.add(new ContactProfile("-4"));
                    }
                }
                if (!this.f81959E1.isEmpty() && this.f82063w2.m126366p()) {
                    if (z11) {
                        this.f81957D1.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f82063w2.m126372v()) {
                        ContactProfile contactProfile4 = new ContactProfile();
                        contactProfile4.f42437s = this.f82063w2.m126358h();
                        contactProfile4.m40403e1(false);
                        contactProfile4.f42407e1 = true;
                        this.f81957D1.add(contactProfile4);
                    }
                    int size2 = this.f81959E1.size();
                    if (!this.f82063w2.m126364n() && size2 > this.f82063w2.m126354d()) {
                        size2 = this.f82063w2.m126354d();
                    }
                    int i12 = 0;
                    while (i12 < size2) {
                        this.f81957D1.add((ContactProfile) this.f81959E1.get(i12));
                        i12++;
                        z11 = true;
                    }
                    if (size2 < this.f81959E1.size()) {
                        this.f81957D1.add(new ContactProfile("-5"));
                    }
                }
                if (!this.f81961F1.isEmpty() && this.f82063w2.m126368r()) {
                    if (z11) {
                        this.f81957D1.add(new ContactProfile("-8"));
                        z11 = false;
                    }
                    if (this.f82063w2.m126371u()) {
                        ContactProfile contactProfile5 = new ContactProfile();
                        contactProfile5.f42437s = this.f82063w2.m126357g();
                        contactProfile5.m40403e1(false);
                        contactProfile5.f42407e1 = true;
                        this.f81957D1.add(contactProfile5);
                    }
                    int size3 = this.f81961F1.size();
                    if (!this.f82063w2.m126363m() && size3 > this.f82063w2.m126354d()) {
                        size3 = this.f82063w2.m126354d();
                    }
                    int i13 = 0;
                    while (i13 < size3) {
                        this.f81957D1.add((ContactProfile) this.f81961F1.get(i13));
                        i13++;
                        z11 = true;
                    }
                    if (size3 < this.f81961F1.size()) {
                        this.f81957D1.add(new ContactProfile("-6"));
                    }
                }
                if (!this.f81963G1.isEmpty() && this.f82063w2.m126367q()) {
                    if (z11) {
                        this.f81957D1.add(new ContactProfile("-8"));
                    }
                    if (this.f82063w2.m126369s()) {
                        ContactProfile contactProfile6 = new ContactProfile();
                        contactProfile6.f42437s = this.f82063w2.m126355e();
                        contactProfile6.m40403e1(false);
                        contactProfile6.f42407e1 = true;
                        this.f81957D1.add(contactProfile6);
                    }
                    if (this.f82063w2.m126362l()) {
                        this.f81957D1.addAll(this.f81963G1);
                    } else {
                        int i14 = 0;
                        for (int i15 = 0; i15 < this.f81963G1.size(); i15++) {
                            ContactProfile contactProfile7 = (ContactProfile) this.f81963G1.get(i15);
                            this.f81957D1.add(contactProfile7);
                            if (contactProfile7.m40366G0() && (i14 = i14 + 1) >= this.f82063w2.m126354d()) {
                                break;
                            }
                        }
                        if (i14 < this.f81963G1.size()) {
                            this.f81957D1.add(new ContactProfile("-7"));
                        }
                    }
                }
            } else {
                this.f81957D1.addAll(this.f81959E1);
            }
            this.f81984Q0.m36375N(this.f81957D1);
            this.f81984Q0.m10008p();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: QN */
    public static boolean m87465QN(ContactProfile contactProfile, C24221a c24221a) {
        return m87468RN(contactProfile, c24221a, false);
    }

    /* renamed from: QO */
    private void m87466QO() {
        C17945a0 c17945a0 = this.f81997U1.f125452h;
        if (c17945a0 != null && c17945a0.m95050X2() != null) {
            this.f81997U1.f125452h.m95237qa(null);
            return;
        }
        if (this.f81997U1.m136152e() != null && !this.f81997U1.m136152e().isEmpty()) {
            for (C17945a0 c17945a02 : this.f81997U1.m136152e()) {
                if (c17945a02.m95050X2() != null) {
                    c17945a02.m95237qa(null);
                }
            }
        }
    }

    /* renamed from: RN */
    public static boolean m87468RN(ContactProfile contactProfile, C24221a c24221a, boolean z11) {
        boolean m126368r = c24221a.m126368r();
        int m126351a = c24221a.m126351a();
        if (contactProfile == null || TextUtils.isEmpty(contactProfile.f42434r) || contactProfile.f42434r.equals(CoreUtility.f89233i) || AbstractC25495a.m132086k(contactProfile.f42434r) || AbstractC25495a.m132081f(contactProfile.f42434r) || AbstractC25495a.m132084i(contactProfile.f42434r) || (!z11 && C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r))) {
            return false;
        }
        C28203u6 c28203u6 = C28203u6.f131407a;
        if (c28203u6.m141819r(contactProfile.f42434r)) {
            return false;
        }
        if (c24221a.m126361k() && (AbstractC25495a.m132083h(contactProfile.f42434r) || contactProfile.m40374K0() || AbstractC25495a.m132084i(contactProfile.f42434r) || (!AbstractC25495a.m132086k(contactProfile.f42434r) && (contactProfile.f42348J != null || C21927m.m114302u().m114318P(contactProfile.f42434r) || contactProfile.m40387S0() || AbstractC23304d.f113417o.containsKey(contactProfile.f42434r))))) {
            return false;
        }
        if ((!contactProfile.m40374K0() || m126368r) && !contactProfile.m40387S0()) {
            if (!contactProfile.m40374K0() && !c24221a.m126367q()) {
                return false;
            }
            if (contactProfile.m40374K0() || m126351a == 2) {
                return true;
            }
            ContactProfile m141809c = c28203u6.m141809c(contactProfile.f42434r);
            if (m141809c != null) {
                contactProfile.f42449w = m141809c.f42449w;
            }
            if ((m126351a != 0 || contactProfile.f42449w != 0) && (m126351a != 1 || contactProfile.f42449w != 1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: RO */
    private void m87469RO(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    if (AbstractC25495a.m132079d(str)) {
                        C31973j5 m4473g = C0943w.m4462l().m4473g(str);
                        if (m4473g != null) {
                            InviteContactProfile inviteContactProfile = new InviteContactProfile();
                            inviteContactProfile.f42434r = str;
                            inviteContactProfile.f42437s = m4473g.m153793y();
                            if (m4473g.m153786t0()) {
                                inviteContactProfile.f42446v = m4473g.m153756e();
                            }
                            this.f81994T1.put(inviteContactProfile.f42434r, inviteContactProfile);
                            this.f81988R1.add(inviteContactProfile);
                        }
                    } else {
                        ContactProfile m141811g = C28203u6.f131407a.m141811g(str);
                        if (m141811g != null) {
                            InviteContactProfile inviteContactProfile2 = new InviteContactProfile(m141811g);
                            this.f81994T1.put(inviteContactProfile2.f42434r, inviteContactProfile2);
                            this.f81988R1.add(inviteContactProfile2);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
        m87522jN();
        if (!this.f81988R1.isEmpty() && !this.f82063w2.m126374x()) {
            this.f81960E2 = false;
            this.f81990S0.m35846M(this.f81988R1);
            this.f81990S0.m10008p();
            this.f81987R0.setVisibility(0);
            this.f82069z2.start();
        }
    }

    /* renamed from: SN */
    public /* synthetic */ void m87471SN(C27373c c27373c) {
        try {
            m87450KO(c27373c);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: SO */
    private void m87472SO(C26404f c26404f) {
        if (c26404f != null) {
            try {
                List list = this.f81985Q1;
                if (list != null && list.size() > 0) {
                    if (c26404f.m136159l() == 18) {
                        m87477UO(c26404f, new ArrayList(this.f81985Q1));
                        return;
                    }
                    synchronized (this.f82018b2) {
                        try {
                            if (this.f82015a2) {
                                return;
                            }
                            this.f82021c2.set(false);
                            this.f82015a2 = true;
                            this.f82057t2.removeCallbacks(this.f82016a3);
                            this.f82057t2.postDelayed(this.f82016a3, 1000L);
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: nc0.o0
                                public /* synthetic */ RunnableC23714o0() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShareView.this.m87422AO();
                                }
                            });
                        } finally {
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: TN */
    public /* synthetic */ void m87474TN() {
        try {
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UN */
    public /* synthetic */ void m87476UN() {
        try {
            m87514hN();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: UO */
    private void m87477UO(C26404f c26404f, List list) {
        String str;
        int i11;
        try {
            synchronized (this.f82012Z1) {
                try {
                    if (this.f82009Y1) {
                        this.f72421L0.mo70710wy(new Runnable() { // from class: nc0.e0
                            public /* synthetic */ RunnableC23694e0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.this.m87425BO();
                            }
                        });
                        return;
                    }
                    int i12 = 0;
                    if (list.size() > 100) {
                        m87571EN(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_number_out_of_shared_number), 100));
                        return;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ContactProfile contactProfile = (ContactProfile) it.next();
                            if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                                try {
                                    i11 = Integer.parseInt(contactProfile.f42434r);
                                } catch (Exception unused) {
                                    i11 = -1;
                                }
                                if (i11 > 0) {
                                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                                    i12++;
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    if (i12 > 0) {
                        long j11 = c26404f.f125436R;
                        long j12 = AbstractC23056e6.f112063b;
                        if (j11 != j12 && c26404f.f125437S != j12) {
                            synchronized (this.f82012Z1) {
                                this.f72421L0.mo70710wy(new Runnable() { // from class: nc0.f0
                                    public /* synthetic */ RunnableC23696f0() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ShareView.this.m87428CO();
                                    }
                                });
                                this.f82009Y1 = true;
                            }
                            String m136160m = c26404f.m136160m();
                            if (m136160m == null) {
                                m136160m = "";
                            }
                            C0766k c0766k = new C0766k();
                            c0766k.mo1704o8(this.f82013Z2);
                            c0766k.mo1700o4(i12, byteArrayOutputStream.toByteArray(), c26404f.f125436R, c26404f.f125437S, m136160m);
                            if (i12 == 1) {
                                str = "38118";
                            } else if (i12 <= 5) {
                                str = "38119";
                            } else if (i12 <= 10) {
                                str = "38120";
                            } else {
                                str = "38121";
                            }
                            AbstractC23647d.m123906p(str);
                            AbstractC23647d.m123893c();
                            return;
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                } finally {
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: VN */
    public /* synthetic */ void m87479VN() {
        Handler handler;
        Handler handler2;
        try {
            if (!m92677nJ()) {
                removeDialog(2);
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator it = this.f81985Q1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ContactProfile) it.next()).f42434r);
                }
                Intent intent = new Intent();
                intent.putStringArrayListExtra("EXTRA_RESULT_SELECTED_UID_LIST", arrayList);
                mo50035CK(-1, intent);
                FeedActionZUtils.m47534V(m92648SI(), this.f81982P1, 1, 0);
                if (this.f81979O1) {
                    AbstractC23136l9.m118678T0((Activity) m92648SI());
                    if (this.f82063w2.m126360j()) {
                        if (this.f82021c2.get() && (handler2 = this.f82057t2) != null) {
                            handler2.postDelayed(new Runnable() { // from class: nc0.u
                                public /* synthetic */ RunnableC23722u() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShareView.this.m87474TN();
                                }
                            }, 500L);
                            return;
                        } else {
                            finish();
                            return;
                        }
                    }
                    return;
                }
                if (this.f81977N1) {
                    showDialog(2);
                    return;
                }
                if (this.f82003W1) {
                    if (this.f81985Q1.size() > 0) {
                        m87480VO((ContactProfile) this.f81985Q1.get(0));
                    }
                } else if (this.f82063w2.m126360j()) {
                    if (this.f82021c2.get() && (handler = this.f82057t2) != null) {
                        handler.postDelayed(new Runnable() { // from class: nc0.v
                            public /* synthetic */ RunnableC23723v() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.this.m87476UN();
                            }
                        }, 500L);
                    } else {
                        m87514hN();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VO */
    private void m87480VO(ContactProfile contactProfile) {
        AbstractC23059e9.m118318G(3);
        Bundle m140776b = new C27870vb(contactProfile.f42434r).m140778d(contactProfile.f42437s).m140775a(contactProfile.f42446v).m140776b();
        m140776b.putInt("extra_chat_profile_type_contact", contactProfile.m40430t0());
        m140776b.putLong("extra_chat_profile_last_action", contactProfile.f42336F);
        m87491ZO(ChatView.class, m140776b);
    }

    /* renamed from: WN */
    public /* synthetic */ void m87482WN(C20338d c20338d) {
        C20568e m106048f = c20338d.m106048f();
        if (m106048f != null && m106048f.m107023g()) {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.undo_msg_toast));
        } else {
            ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_deleted));
        }
        finish();
    }

    /* renamed from: WO */
    private void m87483WO() {
        if (this.f81997U1 == null && TextUtils.isEmpty(this.f81969J1) && TextUtils.isEmpty(this.f81971K1) && (!this.f82031g2 || this.f82024d2 == null)) {
            finish();
            return;
        }
        AbstractC23647d.m123906p("13661");
        m87472SO(this.f81997U1);
        AbstractC23647d.m123893c();
    }

    /* renamed from: XN */
    public /* synthetic */ void m87485XN(C20338d c20338d) {
        if (this.f82027e2.size() == 0) {
            C20568e m106048f = c20338d.m106048f();
            if (m106048f != null && m106048f.m107023g()) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.undo_msg_toast));
            } else {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_msg_deleted));
            }
            finish();
            return;
        }
        RobotoTextView robotoTextView = this.f82028f1;
        if (robotoTextView != null) {
            robotoTextView.setText(String.valueOf(this.f82027e2.size()));
        }
    }

    /* renamed from: YN */
    public /* synthetic */ void m87487YN() {
        RecyclerView recyclerView;
        int i11;
        ActionBar actionBar;
        try {
            C7153n7 c7153n7 = this.f81984Q0;
            if (c7153n7 != null && (recyclerView = this.f81987R0) != null && this.f81990S0 != null) {
                c7153n7.f39125w = "";
                if (this.f81988R1.isEmpty()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                recyclerView.setVisibility(i11);
                this.f81990S0.m35846M(this.f81988R1);
                this.f81990S0.m10008p();
                C24221a c24221a = this.f82063w2;
                if (c24221a != null && c24221a.m126360j() && (actionBar = this.f88760a0) != null) {
                    actionBar.setSubtitle(String.format(m92652XI(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f81994T1.size())));
                }
                RobotoEditText robotoEditText = this.f82011Z0;
                if (robotoEditText != null && !TextUtils.isEmpty(robotoEditText.getText().toString().trim())) {
                    this.f82059u2.removeMessages(0);
                    this.f82059u2.m133832p(this.f82059u2.m133825i(0, this.f82011Z0.getText().toString().trim()));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: YO */
    private void m87488YO() {
        this.f82020c1.setImageDrawable(C27280g.m139660c(m92689tK(), AbstractC16803z.background_thumb_preview, AbstractC28291a.page_background_03));
        this.f82034i1.setVisibility(0);
    }

    /* renamed from: ZN */
    public /* synthetic */ void m87490ZN(String str, int i11, String str2, C26657h c26657h) {
        boolean z11;
        int i12;
        boolean z12;
        try {
            if (!TextUtils.isEmpty(this.f82019b3) && TextUtils.equals(this.f82019b3, str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m92674mJ() && !m92681pJ() && m92648SI() != null && z11) {
                if (i11 == 0 && str2 != null && c26657h != null && (i12 = c26657h.f126157b) > 0 && i12 != 5) {
                    if (i12 == 14) {
                        LottieConfig lottieConfig = c26657h.f126162g;
                        if (lottieConfig != null) {
                            C25979a.m133815f(this.f72421L0, str, str2, lottieConfig);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_asset_path", str2);
                    bundle.putString("extra_metadata_name", "metadata");
                    bundle.putInt("extra_effect_type", c26657h.f126157b);
                    bundle.putString("extra_play_params", "{}");
                    if (Math.abs(AbstractC23309i.m122378s1() - System.currentTimeMillis()) > 86400000 && Math.abs(AbstractC23309i.m121186M5() - System.currentTimeMillis()) > 86400000) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!this.f72421L0.m92676n2().mo35567d1() && !z12) {
                        Intent intent = new Intent(m92648SI(), (Class<?>) Cocos2dxAnimationActivity.class);
                        intent.putExtras(bundle);
                        m92641HK(intent);
                        return;
                    }
                    AbstractC23309i.m120756Aj(System.currentTimeMillis());
                    m92662fJ().m93069k2(Cocos2dxLoadingView.class, bundle, 0, true);
                    return;
                }
                this.f82019b3 = "";
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: ZO */
    private void m87491ZO(Class cls, Bundle bundle) {
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        m92676n2().mo35573l4(cls, bundle, 1, true);
    }

    /* renamed from: aO */
    public /* synthetic */ void m87493aO(int i11, String str, String str2, C26657h c26657h) {
        mo70710wy(new Runnable() { // from class: nc0.j0

            /* renamed from: q */
            public final /* synthetic */ String f114773q;

            /* renamed from: r */
            public final /* synthetic */ int f114774r;

            /* renamed from: s */
            public final /* synthetic */ String f114775s;

            /* renamed from: t */
            public final /* synthetic */ C26657h f114776t;

            public /* synthetic */ RunnableC23704j0(String str3, int i112, String str22, C26657h c26657h2) {
                r2 = str3;
                r3 = i112;
                r4 = str22;
                r5 = c26657h2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ShareView.this.m87490ZN(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: aP */
    private void m87494aP(Class cls, Bundle bundle, int i11) {
        if (cls == null) {
            return;
        }
        if (bundle != null) {
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        }
        m92676n2().mo35581q(cls, bundle, i11, 1, true);
    }

    /* renamed from: bO */
    public /* synthetic */ void m87496bO(List list) {
        DownloadToForwardDialog.m42896lL(list).m92602UK(m92649TI(), "DownloadToForwardDialog");
    }

    /* renamed from: bP */
    private void m87497bP() {
        try {
            Thread.sleep(10L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: cO */
    public /* synthetic */ void m87499cO(String str) {
        try {
            m87514hN();
            ToastUtils.showMess(str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: cP */
    private void m87500cP(C26404f c26404f) {
        String str;
        String str2;
        try {
            if (this.f81997U1.m136159l() == 1) {
                str = this.f81997U1.f125463s;
            } else {
                str = this.f81997U1.f125465u;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f82034i1.setVisibility(0);
            this.f82064x1.setVisibility(8);
            String m122788d = AbstractC23352g.m122788d(str);
            if (c26404f.m136159l() == 1) {
                str2 = ".jpg";
            } else {
                str2 = ".gif";
            }
            String str3 = AbstractC20130d.m104874i0() + m122788d + str2;
            C16136c c16136c = new C16136c(str3);
            if (C19027a.m100086c().m100088b(str) != null) {
                C19027a.m100086c().m100088b(str).m100109g(c16136c);
                return;
            }
            C20556f c20556f = new C20556f(str3);
            if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                m87446JN(str3);
                return;
            }
            if (c20556f.m106830b()) {
                c20556f.m106829a();
            }
            if (this.f81997U1.m136159l() == 11) {
                File file = new File(AbstractC20130d.m104905y(), m122788d + str2);
                if (file.exists() && file.length() > 0) {
                    m87446JN(file.getAbsolutePath());
                    return;
                }
            }
            C19032f c19032f = new C19032f(str, 1);
            c19032f.m100109g(c16136c);
            c19032f.m100107e(str3);
            C19027a.m100086c().m100090e(c19032f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dO */
    public /* synthetic */ void m87502dO() {
        this.f82034i1.setVisibility(8);
        this.f82064x1.setVisibility(0);
    }

    /* renamed from: dP */
    private void m87503dP(int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: nc0.b0

            /* renamed from: q */
            public final /* synthetic */ int f114749q;

            /* renamed from: r */
            public final /* synthetic */ List f114750r;

            public /* synthetic */ RunnableC23688b0(int i112, List list) {
                r2 = i112;
                r3 = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ShareView.this.m87431DO(r2, r3);
            }
        });
    }

    /* renamed from: eP */
    private void m87506eP() {
        String m153548n;
        EnumC27375b enumC27375b;
        if (this.f81997U1.m136159l() == 4 && this.f81997U1.m136157j() != null) {
            m153548n = this.f81997U1.m136157j().f125481d;
        } else {
            m153548n = C31944h6.m153548n(this.f81997U1.m136155h());
        }
        if (TextUtils.isEmpty(m153548n)) {
            return;
        }
        if (this.f81989R2) {
            enumC27375b = EnumC27375b.f128974s;
        } else if (!this.f82031g2 && !this.f82033h2 && !this.f82035i2) {
            if (this.f81985Q1.size() > 1) {
                enumC27375b = EnumC27375b.f128978w;
            } else {
                enumC27375b = EnumC27375b.f128976u;
            }
        } else if (this.f81985Q1.size() > 1) {
            enumC27375b = EnumC27375b.f128977v;
        } else {
            enumC27375b = EnumC27375b.f128975t;
        }
        EnumC27375b enumC27375b2 = enumC27375b;
        if (this.f81997U1.m136154g() == null) {
            this.f81997U1.m136167t(new C17979l1());
        }
        if (this.f81997U1.m136157j() != null) {
            this.f81997U1.m136154g().f91072o = new C32063p6(enumC27375b2, true, !this.f81997U1.m136157j().f125480c.isEmpty(), C31944h6.m153554u(this.f81997U1.m136157j().f125481d), 0L, false);
        } else {
            this.f81997U1.m136154g().f91072o = new C32063p6(enumC27375b2, false, false, C31944h6.m153554u(m153548n), 0L, false);
        }
    }

    /* renamed from: fO */
    public /* synthetic */ void m87508fO() {
        try {
            synchronized (this.f82018b2) {
                try {
                    if (this.f82015a2 && m92672lJ()) {
                        this.f82021c2.set(true);
                        mo46829Y();
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gO */
    public /* synthetic */ void m87511gO() {
        ArrayList arrayList;
        if (this.f81987R0 != null && (arrayList = this.f81988R1) != null && !arrayList.isEmpty()) {
            this.f81987R0.mo9854S1(this.f81988R1.size() - 1);
        }
    }

    /* renamed from: gP */
    private static C26404f m87512gP(C17945a0 c17945a0) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(13);
            try {
                c26404f2.m136162o(c17945a0.m94983Q3());
                c26404f2.f125451g = c17945a0.m94929K2();
                c26404f2.m136167t(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                    return c26404f2;
                }
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: hN */
    private void m87514hN() {
        if (m92662fJ().m93009J0() > 0) {
            finish();
        } else {
            m87491ZO(MainTabView.class, new Bundle());
        }
    }

    /* renamed from: hO */
    public /* synthetic */ void m87515hO() {
        m87578nN();
        new C8009j.a(getContext()).m43159h(2).m43171t(AbstractC8020f0.f43851x78a063bc).m43173v(2).m43161j(AbstractC8020f0.str_download_file_to_forward_between_e2ee_and_normal_thread_desc).m43156e(AbstractC16803z.bg_chatpopup).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tip_banner_got_it), null).m43154c(true).m43152a().mo13822K();
    }

    /* renamed from: hP */
    private static C26404f m87516hP(C17945a0 c17945a0, int i11) {
        C26404f c26404f;
        C26404f c26404f2 = null;
        try {
            c26404f = new C26404f(1);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            c26404f.f125429K = i11;
            c26404f.f125452h = c17945a0;
            c26404f.m136162o(c17945a0.m94983Q3());
            c26404f.m136167t(c17945a0.m95051X3());
            if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                c26404f.f125458n = c17945a0.m95071Z3();
            }
            boolean z11 = false;
            if (c17945a0.m95041W4() == 4) {
                z11 = true;
            }
            c26404f.f125462r = z11;
            if (!z11 && c17945a0.m95041W4() == 3) {
                if (c17945a0.m94929K2() instanceof C18009w0) {
                    c26404f.f125462r = !TextUtils.isEmpty(r4.mo95598f());
                    return c26404f;
                }
                return c26404f;
            }
            return c26404f;
        } catch (Exception e12) {
            e = e12;
            c26404f2 = c26404f;
            AbstractC20110a.m104539h(e);
            return c26404f2;
        }
    }

    /* renamed from: iN */
    private void m87518iN() {
        C17945a0 c17945a0;
        ArrayList arrayList = new ArrayList();
        if (this.f81997U1.m136159l() == 15 && (c17945a0 = this.f81997U1.f125452h) != null) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if ((m94929K2 instanceof C18009w0) && ((C18009w0) m94929K2).m95786t() == 1) {
                arrayList.add(this.f81997U1.f125452h);
            }
        }
        if (this.f81997U1.m136159l() == 19) {
            for (C17945a0 c17945a02 : this.f81997U1.m136152e()) {
                if (c17945a02 != null) {
                    C17969i0 m94929K22 = c17945a02.m94929K2();
                    if ((m94929K22 instanceof C18009w0) && ((C18009w0) m94929K22).m95786t() == 1) {
                        arrayList.add(c17945a02);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18009w0 c18009w0 = (C18009w0) ((C17945a0) it.next()).m94929K2();
            C2520a.f10235a.m12625g(-1, c18009w0.m95736A(), c18009w0.m95792z(), "chat_forward", this.f81974L2);
        }
    }

    /* renamed from: iO */
    public /* synthetic */ void m87519iO(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        if (z11) {
            AbstractC23647d.m123906p("13671");
        } else {
            AbstractC23647d.m123906p("13681");
        }
        AbstractC23647d.m123893c();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m87514hN();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9 A[Catch: Exception -> 0x0024, TRY_ENTER, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0013, B:9:0x001b, B:12:0x00a9, B:14:0x00b8, B:16:0x00c2, B:18:0x0027, B:20:0x002f, B:21:0x0036, B:24:0x003e, B:30:0x0067, B:32:0x006f, B:34:0x0075, B:36:0x007f, B:37:0x008f), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: iP */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C26404f m87520iP(C17945a0 c17945a0, boolean z11) {
        C17969i0 m94929K2;
        C26404f c26404f;
        C26404f c26404f2 = null;
        try {
            if (c17945a0.m94929K2() != null) {
                ?? r12 = c17945a0.m94929K2().f91016u;
                if (!TextUtils.isEmpty(r12)) {
                    if (r12.equals("recommened.vip")) {
                        c26404f = new C26404f(6);
                    } else if (r12.equals("recommened.stickerset")) {
                        c26404f = new C26404f(7);
                    } else {
                        try {
                            if (r12.equals("recommened.link")) {
                                C26404f c26404f3 = new C26404f(4);
                                C17969i0 m94929K22 = c17945a0.m94929K2();
                                r12 = c26404f3;
                                if (m94929K22 instanceof C18013y0) {
                                    C18013y0 c18013y0 = (C18013y0) m94929K22;
                                    C26405g c26405g = new C26405g(c18013y0, z11);
                                    c26405g.f125477G = c17945a0.m94983Q3();
                                    c26404f3.m136170w(c26405g);
                                    c26404f3.m136172y(c18013y0.f91011p);
                                    r12 = c26404f3;
                                }
                            } else {
                                if (r12.equals("recommened.user") && (m94929K2 = c17945a0.m94929K2()) != null) {
                                    String str = m94929K2.f91017v;
                                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                                    if (m141809c == null) {
                                        m141809c = new ContactProfile(str);
                                        m141809c.f42437s = m94929K2.f91011p;
                                        m141809c.f42446v = m94929K2.f91013r;
                                        m141809c.f42352K0 = 0;
                                    }
                                    C26404f c26404f4 = new C26404f(9);
                                    c26404f4.f125456l = m141809c;
                                    r12 = c26404f4;
                                    if (m94929K2 instanceof C18013y0) {
                                        C17978l0 c17978l0 = ((C18013y0) m94929K2).f91253D;
                                        r12 = c26404f4;
                                        if (c17978l0 != null) {
                                            c26404f4.f125435Q = c17978l0.f91053a;
                                            r12 = c26404f4;
                                        }
                                    }
                                }
                                if (c26404f2 != null) {
                                    c26404f2.f125452h = c17945a0;
                                    c26404f2.m136167t(c17945a0.m95051X3());
                                    if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                                        c26404f2.f125458n = c17945a0.m95071Z3();
                                    }
                                }
                            }
                            c26404f2 = r12;
                            if (c26404f2 != null) {
                            }
                        } catch (Exception e11) {
                            e = e11;
                            c26404f2 = r12;
                            AbstractC20110a.m104539h(e);
                            return c26404f2;
                        }
                    }
                    c26404f2 = c26404f;
                    if (c26404f2 != null) {
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return c26404f2;
    }

    /* renamed from: jN */
    public void m87522jN() {
        boolean z11;
        try {
            if (this.f82066y1 != null) {
                C26404f c26404f = this.f81997U1;
                boolean z12 = true;
                if (c26404f != null && c26404f.m136159l() == 20) {
                    z11 = this.f81983P2;
                } else {
                    z11 = true;
                }
                View view = this.f82066y1;
                if (!z11 || this.f81994T1.isEmpty()) {
                    z12 = false;
                }
                view.setEnabled(z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: jO */
    public /* synthetic */ void m87523jO(boolean z11, InterfaceC17463d interfaceC17463d, int i11) {
        if (z11) {
            AbstractC23647d.m123906p("13670");
        } else {
            AbstractC23647d.m123906p("13680");
        }
        AbstractC23647d.m123893c();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23136l9.m118678T0((Activity) m92648SI());
        finish();
    }

    /* renamed from: jP */
    private static C26404f m87524jP(C17945a0 c17945a0) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(2);
            try {
                c26404f2.m136168u(c17945a0.m95019U3());
                c26404f2.m136167t(c17945a0.m95051X3());
                c26404f2.f125454j = true;
                c26404f2.f125451g = c17945a0.m94929K2();
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                    return c26404f2;
                }
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: kN */
    public void m87505eO(C26404f c26404f) {
        try {
            boolean z11 = c26404f.f125462r;
            C27373c m136161n = c26404f.m136161n();
            if (m136161n != null && AbstractC23280z4.m120338l0(m136161n, z11 ? 1 : 0)) {
                m87472SO(c26404f);
            } else {
                mo70710wy(new Runnable() { // from class: nc0.q0

                    /* renamed from: q */
                    public final /* synthetic */ C27373c f114792q;

                    public /* synthetic */ RunnableC23718q0(C27373c m136161n2) {
                        r2 = m136161n2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.this.m87471SN(r2);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: kO */
    public static /* synthetic */ void m87527kO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0059. Please report as an issue. */
    /* renamed from: kP */
    public void m87528kP() {
        boolean z11;
        String str;
        String str2;
        String str3;
        ContactProfile m153138j;
        ContactProfile contactProfile;
        Drawable m142197h;
        C17945a0 c17945a0;
        C17945a0 c17945a02;
        String m92652XI;
        List list;
        int size;
        try {
            this.f82023d1.setVisibility(8);
            this.f82026e1.setVisibility(8);
            this.f82020c1.setVisibility(8);
            this.f82028f1.setVisibility(8);
            this.f82036j1.setVisibility(8);
            this.f82030g1.setVisibility(8);
            this.f82056t1.setVisibility(8);
            this.f82060v1.setVisibility(8);
            this.f82064x1.setVisibility(8);
            this.f82034i1.setVisibility(8);
            this.f82058u1.setVisibility(0);
            this.f82032h1.setVisibility(0);
            this.f82023d1.setMaxLines(1);
            this.f82023d1.setPadding(0, 0, 0, 0);
            C26404f c26404f = this.f81997U1;
            if (c26404f != null) {
                String str4 = "";
                C17391z c17391z = null;
                r8 = null;
                String str5 = null;
                Drawable m142197h2 = null;
                c17391z = null;
                c17391z = null;
                switch (c26404f.m136159l()) {
                    case 1:
                        String m136149b = this.f81997U1.m136149b();
                        if (!TextUtils.isEmpty(m136149b)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m136149b, C23278z2.m120068F());
                        }
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_photo));
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        if (this.f81997U1.f125462r) {
                            this.f82036j1.setImageResource(AbstractC16803z.icn_hd_photo);
                            this.f82036j1.setVisibility(0);
                            break;
                        }
                        break;
                    case 2:
                        if (!TextUtils.isEmpty(this.f81997U1.m136155h())) {
                            SpannableString spannableString = new SpannableString(this.f81997U1.m136155h());
                            Linkify.addLinks(spannableString, 7);
                            CharSequence m143354E = C28652r.m143349v().m143354E(spannableString);
                            if (m143354E instanceof SpannableStringBuilder) {
                                ((SpannableStringBuilder) m143354E).insert(0, (CharSequence) "\"").append((CharSequence) "\"");
                            } else {
                                m143354E = "\"" + ((Object) m143354E) + "\"";
                            }
                            this.f82023d1.setText(m143354E);
                        }
                        this.f82023d1.setPadding(0, AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f));
                        this.f82023d1.setMaxLines(3);
                        this.f82023d1.setVisibility(0);
                        this.f82032h1.setVisibility(8);
                        break;
                    case 3:
                        this.f82020c1.setImageResource(AbstractC16803z.thumbnail_recordvoice);
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_voice));
                        if (!TextUtils.isEmpty(this.f81997U1.m136149b())) {
                            String m40110V = C7853b.m40052a0().m40110V(this.f81997U1.m136149b());
                            if (!TextUtils.isEmpty(m40110V)) {
                                this.f82026e1.setText(m40110V);
                                this.f82026e1.setVisibility(0);
                            }
                        }
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 4:
                        C26405g m136157j = this.f81997U1.m136157j();
                        if (!TextUtils.isEmpty(m136157j.f125478a)) {
                            this.f82023d1.setText(m136157j.f125478a);
                        }
                        try {
                            if (AbstractC9183a.m49005m(m136157j)) {
                                if (!TextUtils.isEmpty(m136157j.f125484g)) {
                                    this.f82023d1.setText(m136157j.f125484g);
                                } else {
                                    this.f82023d1.setText(m136157j.f125478a);
                                }
                                this.f82026e1.setText(m136157j.f125479b);
                            } else if (!TextUtils.isEmpty(m136157j.f125482e)) {
                                this.f82026e1.setText(m136157j.f125482e);
                            } else {
                                URI uri = new URI(m136157j.f125481d);
                                if (!TextUtils.isEmpty(uri.getHost())) {
                                    this.f82026e1.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.timeline_link_base_domain, uri.getHost()));
                                }
                            }
                        } catch (URISyntaxException unused) {
                            this.f82026e1.setText(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.timeline_link_base_domain_invalid));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            this.f82026e1.setText("");
                        }
                        if (!TextUtils.isEmpty(m136157j.f125480c)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m136157j.f125480c, C23278z2.m120136k0());
                        } else if (m136157j.f125476F == EnumC27376c.f128983r && m136157j.f125475E) {
                            if (m136157j.f125477G.isEmpty()) {
                                m87488YO();
                            } else {
                                ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m136157j.f125477G, C23278z2.m120136k0());
                            }
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120136k0().f116261b);
                        }
                        this.f82058u1.setOnClickListener(new View.OnClickListener() { // from class: nc0.l
                            public /* synthetic */ ViewOnClickListenerC23707l() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ShareView.this.m87436FO(view);
                            }
                        });
                        this.f82026e1.setVisibility(0);
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 5:
                        if (this.f81997U1.m136161n() != null) {
                            String m140253g = this.f81997U1.m136161n().m140253g();
                            if (!TextUtils.isEmpty(m140253g)) {
                                this.f82017b1.setText(m140253g);
                                this.f82017b1.setSelection(m140253g.length());
                            }
                        }
                        C26404f c26404f2 = this.f81997U1;
                        C17945a0 c17945a03 = c26404f2.f125452h;
                        if (c17945a03 != null) {
                            z11 = c17945a03.m95288w8();
                        } else {
                            z11 = c26404f2.m136161n().f128949V;
                        }
                        if (z11) {
                            this.f82023d1.setText(m92652XI(AbstractC8020f0.share_gif));
                            this.f82023d1.setVisibility(0);
                            this.f82036j1.setImageResource(AbstractC16803z.icn_gif);
                            this.f82036j1.setVisibility(0);
                        } else {
                            this.f82026e1.setText(AbstractC3460h.m17440h(this.f81997U1.m136161n().m140255i()));
                            this.f82026e1.setVisibility(0);
                            this.f82023d1.setText(m92652XI(AbstractC8020f0.share_video));
                            this.f82023d1.setVisibility(0);
                            if (this.f81997U1.f125462r) {
                                this.f82036j1.setImageResource(AbstractC16803z.icn_hd_photo);
                            } else {
                                this.f82036j1.setImageResource(AbstractC16803z.icn_video_share);
                            }
                            this.f82036j1.setVisibility(0);
                        }
                        if (this.f81997U1.m136161n() != null) {
                            str = this.f81997U1.m136161n().m140268v();
                            if (TextUtils.isEmpty(str)) {
                                str = this.f81997U1.m136151d();
                            }
                            c17391z = new C17391z("", "", this.f81997U1.m136161n().m140220E(), "", str, AbstractC23006a0.m117875E(), true, 9, 1.0f, 5, this.f81997U1.m136161n().m140220E(), "", 0);
                        } else if (this.f81997U1.f125452h.m95032V6()) {
                            str = this.f81997U1.f125452h.m94947M4();
                            if (TextUtils.isEmpty(str) || !AbstractC23041d2.m118194A(str)) {
                                str = this.f81997U1.f125452h.m94929K2().f91013r;
                            }
                        } else {
                            str = this.f81997U1.f125452h.m94929K2().f91013r;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str, C23278z2.m120068F());
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120068F().f116261b);
                        }
                        this.f82020c1.setVisibility(0);
                        this.f82020c1.setOnClickListener(new View.OnClickListener() { // from class: nc0.a

                            /* renamed from: q */
                            public final /* synthetic */ C17391z f114744q;

                            /* renamed from: r */
                            public final /* synthetic */ boolean f114745r;

                            public /* synthetic */ ViewOnClickListenerC23685a(C17391z c17391z2, boolean z112) {
                                r2 = c17391z2;
                                r3 = z112;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ShareView.this.m87433EO(r2, r3, view);
                            }
                        });
                        break;
                    case 6:
                        C17945a0 c17945a04 = this.f81997U1.f125452h;
                        if (c17945a04 != null) {
                            if (c17945a04.m94929K2() != null) {
                                str4 = c17945a04.m94929K2().f91013r;
                                String str6 = c17945a04.m94929K2().f91011p;
                                str3 = c17945a04.m94929K2().f91017v;
                                if (c17945a04.m94929K2().f91016u.equals("recommened.vip") && C21927m.m114302u().m114357s() != null && C21927m.m114302u().m114357s().m153137g(str3) && (m153138j = C21927m.m114302u().m114357s().m153138j(str3)) != null && (ContactProfile.m40345C0(m153138j.f42352K0) || ContactProfile.m40345C0(m153138j.f42447v0) || m153138j.m40384Q0())) {
                                    this.f82030g1.setVisibility(0);
                                }
                                ContactProfile m98552o = C18644n.m98531l().m98552o(str3);
                                str2 = (m98552o == null || str3.equals(CoreUtility.f89233i)) ? str6 : AbstractC21935u.m114539f(m98552o.f42455y, str3, str6);
                            } else {
                                str2 = "";
                                str3 = str2;
                            }
                            this.f82020c1.setRoundRadius(AbstractC23136l9.m118742r(21.0f));
                            if (!TextUtils.isEmpty(str4)) {
                                if (C23302b.f113247a.m120523d(str4)) {
                                    this.f82020c1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(str2), C2343e.m12307a(str3, false)));
                                } else {
                                    ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str4, C23278z2.m120143n());
                                }
                            } else {
                                this.f82020c1.setImageDrawable(C23278z2.m120143n().f116261b);
                            }
                            this.f82026e1.setText(m92652XI(AbstractC8020f0.title_vipmsg));
                            this.f82026e1.setVisibility(0);
                            this.f82023d1.setText(str2);
                            this.f82023d1.setVisibility(0);
                            this.f82020c1.setVisibility(0);
                            break;
                        }
                        break;
                    case 7:
                        C17945a0 c17945a05 = this.f81997U1.f125452h;
                        if (c17945a05 != null && c17945a05.m94929K2() != null) {
                            if (!TextUtils.isEmpty(this.f81997U1.f125452h.m94929K2().f91011p)) {
                                String str7 = this.f81997U1.f125452h.m94929K2().f91011p;
                            }
                            if (!TextUtils.isEmpty(this.f81997U1.f125452h.m94929K2().f91013r)) {
                                str4 = this.f81997U1.f125452h.m94929K2().f91013r;
                            }
                        } else {
                            if (!TextUtils.isEmpty(this.f81997U1.f125425G)) {
                                String str8 = this.f81997U1.f125425G;
                            }
                            if (!TextUtils.isEmpty(this.f81997U1.f125426H)) {
                                str4 = this.f81997U1.f125426H;
                            }
                        }
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_sticker));
                        this.f82023d1.setVisibility(0);
                        if (!TextUtils.isEmpty(str4)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str4, C23278z2.m120120d0());
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120120d0().f116261b);
                        }
                        this.f82020c1.setVisibility(0);
                        break;
                    case 8:
                        C25630b m143282P0 = C28644j.m143233Y().m143282P0(this.f81997U1.f125464t);
                        if (m143282P0.m132448z()) {
                            Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                            if (m141206w != null) {
                                this.f82020c1.setImageBitmap(m141206w);
                            }
                        } else if (C25630b.m132391I(m143282P0)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123579C(m143282P0.m132444v(), C23278z2.m120068F(), new C16148o());
                        } else {
                            C28020b3 c28020b3 = C28020b3.f130648a;
                            Bitmap m141205v = c28020b3.m141205v(m143282P0, false);
                            if (m141205v == null) {
                                c28020b3.m141183G(m143282P0, this.f81953B1, this.f82020c1, null, true);
                            } else {
                                this.f82020c1.setImageBitmap(m141205v);
                            }
                        }
                        this.f82020c1.setOnClickListener(new View.OnClickListener() { // from class: nc0.w
                            public /* synthetic */ ViewOnClickListenerC23724w() {
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ShareView.this.m87439GO(view);
                            }
                        });
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_sticker));
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 9:
                        C26404f c26404f3 = this.f81997U1;
                        if (c26404f3 != null && (contactProfile = c26404f3.f125456l) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f81997U1.f125456l.f42434r);
                            if (m141809c == null && !TextUtils.isEmpty(this.f81997U1.f125456l.f42446v) && !TextUtils.isEmpty(this.f81997U1.f125456l.f42437s)) {
                                m141809c = new ContactProfile();
                                ContactProfile contactProfile2 = this.f81997U1.f125456l;
                                m141809c.f42434r = contactProfile2.f42434r;
                                m141809c.f42446v = contactProfile2.f42446v;
                                m141809c.f42437s = contactProfile2.f42437s;
                                m141809c.f42352K0 = 0;
                            }
                            if (m141809c != null) {
                                this.f82020c1.setRoundRadius(AbstractC23136l9.m118742r(21.0f));
                                if (C23302b.f113247a.m120523d(m141809c.f42446v) && !CoreUtility.f89233i.equals(m141809c.f42434r)) {
                                    this.f82020c1.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m141809c.m40383Q(true, false)), C2343e.m12307a(m141809c.f42434r, false)));
                                } else {
                                    ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m141809c.f42446v, C23278z2.m120143n());
                                }
                                if (m141809c.m40387S0() && (ContactProfile.m40345C0(m141809c.f42352K0) || ContactProfile.m40345C0(m141809c.f42447v0) || m141809c.m40384Q0())) {
                                    this.f82030g1.setVisibility(0);
                                }
                                this.f82026e1.setText(m92652XI(m141809c.m40387S0() ? AbstractC8020f0.title_vipmsg : AbstractC8020f0.funcInvite));
                                RobotoTextView robotoTextView = this.f82026e1;
                                robotoTextView.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(robotoTextView.getContext(), AbstractC16803z.icn_contact_mini), (Drawable) null, (Drawable) null, (Drawable) null);
                                this.f82023d1.setText(m141809c.m40383Q(true, false));
                                this.f82026e1.setVisibility(0);
                                this.f82023d1.setVisibility(0);
                                this.f82026e1.setVisibility(0);
                                this.f82020c1.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 10:
                        C26404f c26404f4 = this.f81997U1;
                        if (c26404f4 != null && (c17945a0 = c26404f4.f125452h) != null && c17945a0.m94929K2() != null && (this.f81997U1.f125452h.m94929K2() instanceof C17990p0)) {
                            C17990p0 c17990p0 = (C17990p0) this.f81997U1.f125452h.m94929K2();
                            if (!TextUtils.isEmpty(c17990p0.f91011p)) {
                                if (c17990p0.m95670k()) {
                                    this.f82023d1.setText(c17990p0.m95667h());
                                } else {
                                    this.f82023d1.setText(c17990p0.f91011p);
                                }
                            } else {
                                this.f82023d1.setText("");
                            }
                            if (c17990p0.f91113B > 0) {
                                if (c17990p0.m95670k()) {
                                    this.f82026e1.setText(c17990p0.m95668i());
                                } else {
                                    this.f82026e1.setText(AbstractC23041d2.m118226y(c17990p0.f91113B));
                                }
                            } else {
                                this.f82026e1.setText("");
                            }
                            if (c17990p0.m95670k()) {
                                m142197h2 = AbstractC23136l9.m118665N(this.f82020c1.getContext(), AbstractC16803z.icn_folder);
                            } else if (!TextUtils.isEmpty(c17990p0.f91115D)) {
                                m142197h2 = AbstractC28236y3.m142197h(this.f82020c1.getContext(), c17990p0.f91115D);
                            }
                            if (m142197h2 != null) {
                                this.f82020c1.setImageDrawable(m142197h2);
                            }
                        } else if (!TextUtils.isEmpty(this.f81997U1.m136149b())) {
                            File file = new File(this.f81997U1.m136149b());
                            if (file.exists()) {
                                this.f82023d1.setText(file.getName());
                                this.f82026e1.setText(AbstractC23041d2.m118226y(file.length()));
                                String m118217p = AbstractC23041d2.m118217p(file.getName());
                                if (!TextUtils.isEmpty(m118217p) && (m142197h = AbstractC28236y3.m142197h(this.f82020c1.getContext(), m118217p)) != null) {
                                    this.f82020c1.setImageDrawable(m142197h);
                                }
                            }
                        }
                        this.f82026e1.setVisibility(0);
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        this.f82020c1.setDrawStroke(false);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 11:
                        C26404f c26404f5 = this.f81997U1;
                        if (c26404f5 != null && (c17945a02 = c26404f5.f125452h) != null && c17945a02.m94929K2() != null) {
                            str4 = this.f81997U1.f125452h.m94929K2().f91013r;
                        } else {
                            C26404f c26404f6 = this.f81997U1;
                            if (c26404f6 != null && !TextUtils.isEmpty(c26404f6.m136149b())) {
                                str4 = this.f81997U1.f125466v;
                            }
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str4, C23278z2.m120068F());
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120068F().f116261b);
                        }
                        this.f82036j1.setImageResource(AbstractC16803z.icn_gif);
                        this.f82036j1.setVisibility(0);
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_gif));
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 12:
                        if (!TextUtils.isEmpty(this.f81997U1.f125422D)) {
                            this.f82023d1.setText(this.f81997U1.f125422D);
                            this.f82023d1.setVisibility(0);
                        }
                        if (!TextUtils.isEmpty(this.f81997U1.f125423E)) {
                            this.f82026e1.setText(this.f81997U1.f125423E);
                            this.f82026e1.setMaxLines(2);
                            this.f82026e1.setVisibility(0);
                        }
                        this.f82020c1.setImageResource(AbstractC16803z.thumb_location);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 13:
                        String m136149b2 = this.f81997U1.m136149b();
                        if (!TextUtils.isEmpty(m136149b2)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m136149b2, C23278z2.m120068F());
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120068F().f116261b);
                        }
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_doodle));
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case 14:
                        C26404f c26404f7 = this.f81997U1;
                        if (c26404f7 != null && c26404f7.m136152e() != null) {
                            List<C17945a0> m136152e = this.f81997U1.m136152e();
                            if (m136152e.size() > 0) {
                                C17945a0 c17945a06 = (C17945a0) m136152e.get(0);
                                boolean z12 = false;
                                boolean z13 = false;
                                for (C17945a0 c17945a07 : m136152e) {
                                    if (c17945a07.m94871D7()) {
                                        z12 = true;
                                    } else if (c17945a07.m95306y8()) {
                                        z13 = true;
                                    }
                                }
                                if (z12 && z13) {
                                    m92652XI = m92652XI(AbstractC8020f0.share_photo_and_video);
                                } else if (z12) {
                                    m92652XI = m92652XI(AbstractC8020f0.share_multi_photo);
                                } else if (z13) {
                                    m92652XI = m92652XI(AbstractC8020f0.share_multi_video);
                                } else {
                                    m92652XI = m92652XI(AbstractC8020f0.share);
                                }
                                if (c17945a06 != null && c17945a06.m94929K2() != null) {
                                    String str9 = c17945a06.m94929K2().f91013r;
                                    if (TextUtils.isEmpty(str9) && c17945a06.m95170j6()) {
                                        str9 = c17945a06.m94983Q3();
                                    }
                                    if (!TextUtils.isEmpty(str9)) {
                                        ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str9, C23278z2.m120136k0());
                                    } else {
                                        this.f82020c1.setImageDrawable(C23278z2.m120136k0().f116261b);
                                    }
                                    this.f82023d1.setText(m92652XI);
                                    this.f82023d1.setVisibility(0);
                                    this.f82028f1.setText(String.valueOf(m136152e.size()));
                                    this.f82028f1.setVisibility(0);
                                    this.f82020c1.setVisibility(0);
                                    if (this.f81997U1.f125462r) {
                                        this.f82036j1.setImageResource(AbstractC16803z.icn_hd_photo);
                                        this.f82036j1.setVisibility(0);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 15:
                        C17945a0 c17945a08 = this.f81997U1.f125452h;
                        if (c17945a08 != null && c17945a08.m94929K2() != null) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(this.f81997U1.f125452h.m94929K2().mo95597e(), C23278z2.m120068F());
                        } else {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(this.f81997U1.m136149b(), C23278z2.m120068F());
                        }
                        this.f82023d1.setText(m92652XI(AbstractC8020f0.share_sticker));
                        this.f82023d1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        C26404f c26404f8 = this.f81997U1;
                        if (c26404f8 != null && c26404f8.m136153f() != null) {
                            List m136153f = this.f81997U1.m136153f();
                            if (m136153f.size() > 0) {
                                String m120292D = AbstractC23280z4.m120292D((MediaItem) m136153f.get(0));
                                if (!TextUtils.isEmpty(m120292D)) {
                                    ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(m120292D, C23278z2.m120136k0());
                                    this.f82020c1.setVisibility(0);
                                }
                                this.f82023d1.setText(m92652XI(AbstractC8020f0.share_multi_photo));
                                this.f82023d1.setVisibility(0);
                                this.f82028f1.setText(String.valueOf(m136153f.size()));
                                this.f82028f1.setVisibility(0);
                                if (this.f81997U1.f125462r) {
                                    this.f82036j1.setImageResource(AbstractC16803z.icn_hd_photo);
                                    this.f82036j1.setVisibility(0);
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        this.f82058u1.setVisibility(8);
                        this.f82056t1.setVisibility(0);
                        if (this.f82062w1 == null) {
                            this.f82062w1 = new C7106j4();
                            this.f82056t1.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                            this.f82056t1.setAdapter(this.f82062w1);
                        }
                        C26404f c26404f9 = this.f81997U1;
                        if (c26404f9 != null && (list = c26404f9.f125442X) != null && !list.isEmpty()) {
                            this.f82062w1.m36198N(this.f81997U1.f125442X);
                            this.f82062w1.m10008p();
                            break;
                        }
                        break;
                    case 19:
                        C26404f c26404f10 = this.f81997U1;
                        if (c26404f10 != null && c26404f10.m136152e() != null && (size = this.f81997U1.m136152e().size()) > 0) {
                            this.f82032h1.setVisibility(8);
                            this.f82023d1.setVisibility(0);
                            this.f82023d1.setText(getContext().getResources().getQuantityString(AbstractC7921d0.plural_share_multi_messages, size, Integer.valueOf(size)));
                            break;
                        }
                        break;
                    case 20:
                        this.f82058u1.setVisibility(8);
                        this.f82056t1.setVisibility(8);
                        this.f82060v1.setVisibility(0);
                        RobotoEditText robotoEditText = this.f82017b1;
                        if (robotoEditText != null) {
                            robotoEditText.setVisibility(8);
                        }
                        C26404f c26404f11 = this.f81997U1;
                        JSONObject jSONObject = c26404f11 != null ? c26404f11.f125440V : null;
                        try {
                            if (jSONObject != null) {
                                ZinstantPreviewLayout zinstantPreviewLayout = new ZinstantPreviewLayout(getContext());
                                zinstantPreviewLayout.setupData(new C16134a(zinstantPreviewLayout));
                                zinstantPreviewLayout.m88955d1(jSONObject, 39);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                                layoutParams.gravity = 16;
                                zinstantPreviewLayout.setLayoutParams(layoutParams);
                                this.f82060v1.addView(zinstantPreviewLayout);
                                this.f81997U1.f125441W = zinstantPreviewLayout.getZinstantAPIInfo();
                                break;
                            } else {
                                throw new IllegalArgumentException("Can not load zinstant preview because data is null.");
                            }
                        } catch (Exception e12) {
                            AbstractC20110a.m104539h(e12);
                            break;
                        }
                    case 21:
                        List list2 = this.f81997U1.f125434P;
                        ShareLinkInfo shareLinkInfo = (list2 == null || list2.isEmpty()) ? null : (ShareLinkInfo) list2.get(0);
                        if (shareLinkInfo != null && shareLinkInfo.m48436c() != null) {
                            str5 = shareLinkInfo.m48436c().f125480c;
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            ((C23528a) this.f81953B1.m123612r(this.f82020c1)).m123618x(str5, C23278z2.m120136k0());
                        } else {
                            this.f82020c1.setImageDrawable(C23278z2.m120136k0().f116261b);
                        }
                        if (list2 != null && AbstractC9183a.m49004l(list2)) {
                            if (list2.size() == 1) {
                                C26405g m48436c = ((ShareLinkInfo) list2.get(0)).m48436c();
                                if (m48436c != null) {
                                    if (!TextUtils.isEmpty(m48436c.f125484g)) {
                                        this.f82023d1.setText(m48436c.f125484g);
                                    } else {
                                        this.f82023d1.setText(m48436c.f125478a);
                                    }
                                    this.f82026e1.setText(m48436c.f125479b);
                                    this.f82026e1.setVisibility(0);
                                } else {
                                    this.f82023d1.setText(m92653YI(AbstractC8020f0.str_share_product_link_single, Integer.valueOf(list2.size())));
                                }
                            } else {
                                this.f82023d1.setText(m92653YI(AbstractC8020f0.str_share_product_link_multiple, Integer.valueOf(list2.size())));
                            }
                        } else {
                            this.f82023d1.setText(m92652XI(AbstractC8020f0.str_share_link));
                        }
                        this.f82023d1.setVisibility(0);
                        this.f82028f1.setText(String.valueOf(list2 != null ? list2.size() : 0));
                        this.f82028f1.setVisibility(0);
                        this.f82020c1.setVisibility(0);
                        break;
                }
            }
            if (this.f81997U1.m136159l() == 18) {
                RobotoEditText robotoEditText2 = this.f82017b1;
                if (robotoEditText2 != null) {
                    robotoEditText2.setVisibility(8);
                }
                this.f82058u1.setVisibility(8);
                View view = this.f82066y1;
                if (view != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = AbstractC23136l9.m118742r(4.0f);
                    layoutParams2.gravity = 21;
                    this.f82066y1.setLayoutParams(layoutParams2);
                }
            }
            if (m87574PN()) {
                Iterator it = this.f82001V2.iterator();
                while (it.hasNext()) {
                    if (((ContactProfile) it.next()).f42434r.equals("-12")) {
                        return;
                    }
                }
                this.f82001V2.add(new ContactProfile("-12"));
            }
        } catch (Exception e13) {
            AbstractC23350e.m122778h(e13);
        }
    }

    /* renamed from: lO */
    public /* synthetic */ void m87530lO() {
        RobotoEditText robotoEditText;
        if (!this.f81958D2 && (robotoEditText = this.f82017b1) != null) {
            AbstractC2379w.m12432f(robotoEditText);
            this.f81956C2 = false;
        }
    }

    /* renamed from: lP */
    private void m87531lP(C17945a0 c17945a0, List list) {
        int m95041W4 = c17945a0.m95041W4();
        if (m95041W4 != 0) {
            if (m95041W4 != 12) {
                if (m95041W4 == 2 || m95041W4 == 3 || m95041W4 == 4) {
                    list.add(new ContactProfile("-2"));
                    list.add(new ContactProfile("-3"));
                    return;
                }
                return;
            }
            if (c17945a0.m94929K2().f91016u.equals("recommened.link")) {
                list.add(new ContactProfile("-3"));
                return;
            }
            return;
        }
        list.add(new ContactProfile("-3"));
    }

    /* renamed from: mO */
    public /* synthetic */ boolean m87533mO(View view, MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                view.postDelayed(new Runnable() { // from class: nc0.a0
                    public /* synthetic */ RunnableC23686a0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.this.m87564xO();
                    }
                }, 300L);
                this.f81956C2 = true;
                View view2 = this.f82005X0;
                if (view2 != null) {
                    view2.setTranslationY(view2.getHeight());
                    this.f82005X0.setAlpha(0.0f);
                    this.f82005X0.setVisibility(4);
                    ViewGroup.LayoutParams layoutParams = this.f81999V0.getLayoutParams();
                    layoutParams.height = 0;
                    this.f81999V0.setLayoutParams(layoutParams);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    /* renamed from: nO */
    public /* synthetic */ void m87535nO(ValueAnimator valueAnimator) {
        RobotoTextView robotoTextView;
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f82063w2.m126374x() && (robotoTextView = this.f82068z1) != null) {
                robotoTextView.setAlpha(1.0f - floatValue);
            } else {
                this.f82005X0.setTranslationY(r0.getHeight() * floatValue);
                this.f82005X0.setAlpha(1.0f - floatValue);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oO */
    public /* synthetic */ void m87537oO(ValueAnimator valueAnimator) {
        RobotoTextView robotoTextView;
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f82063w2.m126374x() && (robotoTextView = this.f82068z1) != null) {
                robotoTextView.setAlpha(1.0f - floatValue);
            } else {
                this.f82005X0.setTranslationY(r0.getHeight() * floatValue);
                this.f82005X0.setAlpha(1.0f - floatValue);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pN */
    private void m87539pN(C17945a0 c17945a0) {
        C26404f c26404f;
        if (c17945a0.m94960N7() && (c26404f = this.f81997U1) != null) {
            c26404f.m136171x(2);
            String str = c17945a0.m94929K2().f91011p;
            String str2 = c17945a0.m94929K2().f91014s;
            C26404f c26404f2 = this.f81997U1;
            c26404f2.f125453i = true;
            c26404f2.m136162o(str2);
            if (str.contains(str2)) {
                this.f81997U1.m136168u(str);
                this.f81997U1.m136172y("");
                this.f82000V1 = "";
                this.f81997U1.f125455k = true;
                return;
            }
            this.f81997U1.m136168u(str2);
            this.f81997U1.m136172y(str);
            this.f82000V1 = str;
            this.f81997U1.f125455k = false;
        }
    }

    /* renamed from: pO */
    public /* synthetic */ void m87540pO() {
        AbstractC2379w.m12432f(this.f82011Z0);
        this.f81956C2 = true;
    }

    /* renamed from: qN */
    public static C26404f m87542qN(C17945a0 c17945a0, boolean z11, int i11) {
        C26404f m87524jP;
        int m95041W4 = c17945a0.m95041W4();
        if (m95041W4 != 0) {
            if (m95041W4 != 6) {
                if (m95041W4 != 10) {
                    if (m95041W4 != 12) {
                        if (m95041W4 != 31) {
                            if (m95041W4 != 2) {
                                if (m95041W4 != 3 && m95041W4 != 4) {
                                    if (m95041W4 != 18) {
                                        if (m95041W4 != 19) {
                                            switch (m95041W4) {
                                                case 22:
                                                    m87524jP = m87545rN(c17945a0, i11);
                                                    break;
                                                case 23:
                                                    m87524jP = m87548sN(c17945a0);
                                                    break;
                                                case 24:
                                                    m87524jP = m87566yN(c17945a0);
                                                    break;
                                                default:
                                                    m87524jP = null;
                                                    break;
                                            }
                                        } else {
                                            m87524jP = m87560wN(c17945a0, i11);
                                        }
                                    } else {
                                        m87524jP = m87551tN(c17945a0);
                                    }
                                } else {
                                    m87524jP = m87516hP(c17945a0, i11);
                                }
                            } else {
                                m87524jP = m87512gP(c17945a0);
                            }
                        } else {
                            m87524jP = m87554uN(c17945a0, i11);
                        }
                    } else {
                        m87524jP = m87520iP(c17945a0, z11);
                    }
                } else {
                    m87524jP = m87557vN(c17945a0);
                }
            } else {
                m87524jP = m87563xN(c17945a0);
            }
        } else {
            m87524jP = m87524jP(c17945a0);
        }
        if (m87524jP != null) {
            m87524jP.f125427I = true;
            m87524jP.f125460p = z11;
            m87524jP.f125443Y = AbstractC23112j7.m118499I(c17945a0);
        }
        return m87524jP;
    }

    /* renamed from: qO */
    public /* synthetic */ boolean m87543qO(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f82017b1.postDelayed(new Runnable() { // from class: nc0.i0
                public /* synthetic */ RunnableC23702i0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87530lO();
                }
            }, 300L);
            this.f81956C2 = false;
        }
        return false;
    }

    /* renamed from: rN */
    private static C26404f m87545rN(C17945a0 c17945a0, int i11) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(10);
            try {
                c26404f2.f125452h = c17945a0;
                c26404f2.f125429K = i11;
                c26404f2.m136167t(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                    return c26404f2;
                }
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: rO */
    public /* synthetic */ void m87546rO() {
        try {
            ViewGroup.LayoutParams layoutParams = this.f81999V0.getLayoutParams();
            if (layoutParams.height > 0 && this.f82005X0.getHeight() != layoutParams.height) {
                layoutParams.height = this.f82005X0.getHeight();
                this.f81999V0.setLayoutParams(layoutParams);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: sN */
    private static C26404f m87548sN(C17945a0 c17945a0) {
        C26404f c26404f;
        C26404f c26404f2 = null;
        try {
            c26404f = new C26404f(11);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            c26404f.f125452h = c17945a0;
            c26404f.m136167t(c17945a0.m95051X3());
            if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                c26404f.f125458n = c17945a0.m95071Z3();
            }
            if (c17945a0.m94929K2() instanceof C17993q0) {
                C17993q0 c17993q0 = (C17993q0) c17945a0.m94929K2();
                c26404f.f125470z = c17993q0.f91138F;
                c26404f.f125465u = c17993q0.f91014s;
                c26404f.f125466v = c17993q0.f91013r;
                c26404f.f125469y = c17993q0.f91136D;
                c26404f.f125467w = c17993q0.f91134B;
                c26404f.f125468x = c17993q0.f91135C;
                return c26404f;
            }
            return c26404f;
        } catch (Exception e12) {
            e = e12;
            c26404f2 = c26404f;
            AbstractC20110a.m104539h(e);
            return c26404f2;
        }
    }

    /* renamed from: sO */
    public /* synthetic */ void m87549sO(View view) {
        AbstractC2379w.m12430d(this.f82017b1);
    }

    /* renamed from: tN */
    private static C26404f m87551tN(C17945a0 c17945a0) {
        C26404f c26404f = null;
        try {
            if (!(c17945a0.m94929K2() instanceof C18002t0)) {
                return null;
            }
            C18002t0 c18002t0 = (C18002t0) c17945a0.m94929K2();
            C26404f c26404f2 = new C26404f(12);
            try {
                c26404f2.f125422D = c18002t0.f91011p;
                c26404f2.f125423E = c18002t0.f91015t;
                C31868c5 c31868c5 = c18002t0.f91181B;
                if (c31868c5 != null) {
                    c26404f2.f125420B = c31868c5.m153169a();
                    c26404f2.f125421C = c18002t0.f91181B.m153170b();
                }
                c26404f2.f125451g = c17945a0.m94929K2();
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: tO */
    public /* synthetic */ void m87552tO(RecyclerView recyclerView, int i11, View view) {
        try {
            mo36377P((ContactProfile) this.f81988R1.get(i11));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: uN */
    private static C26404f m87554uN(C17945a0 c17945a0, int i11) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(15);
            try {
                c26404f2.f125429K = i11;
                c26404f2.f125452h = c17945a0;
                c26404f2.m136167t(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                    return c26404f2;
                }
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: uO */
    public /* synthetic */ void m87555uO(View view) {
        this.f82011Z0.setText("");
    }

    /* renamed from: vN */
    private static C26404f m87557vN(C17945a0 c17945a0) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(8);
            try {
                c26404f2.m136167t(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                }
                if (c17945a0.m94929K2() != null && ((C17949b1) c17945a0.m94929K2()).m95397g() != null) {
                    c26404f2.f125464t = new C25630b(((C17949b1) c17945a0.m94929K2()).m95397g());
                }
                c26404f2.f125452h = c17945a0;
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: vO */
    public /* synthetic */ void m87558vO() {
        this.f82011Z0.requestFocus();
    }

    /* renamed from: wN */
    private static C26404f m87560wN(C17945a0 c17945a0, int i11) {
        C26404f c26404f;
        C26404f c26404f2 = null;
        try {
            c26404f = new C26404f(5);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            c26404f.f125429K = i11;
            c26404f.f125452h = c17945a0;
            c26404f.m136167t(c17945a0.m95051X3());
            if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                c26404f.f125458n = c17945a0.m95071Z3();
            }
            if (c17945a0.m94929K2() instanceof C17961f1) {
                c26404f.f125462r = ((C17961f1) c17945a0.m94929K2()).m95465S();
                return c26404f;
            }
            return c26404f;
        } catch (Exception e12) {
            e = e12;
            c26404f2 = c26404f;
            AbstractC20110a.m104539h(e);
            return c26404f2;
        }
    }

    /* renamed from: wO */
    public /* synthetic */ void m87561wO(View view, boolean z11) {
        try {
            if (z11) {
                this.f81956C2 = z11;
            } else {
                z11 = this.f81956C2;
            }
            if (z11) {
                this.f81993T0.m75685a(false);
            } else if (this.f82061v2) {
                this.f81993T0.m75685a(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xN */
    private static C26404f m87563xN(C17945a0 c17945a0) {
        C26404f c26404f = null;
        try {
            C26404f c26404f2 = new C26404f(3);
            try {
                c26404f2.m136162o(c17945a0.m94983Q3());
                c26404f2.m136167t(c17945a0.m95051X3());
                if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137356a()) {
                    c26404f2.f125458n = c17945a0.m95071Z3();
                    return c26404f2;
                }
                return c26404f2;
            } catch (Exception e11) {
                e = e11;
                c26404f = c26404f2;
                AbstractC20110a.m104539h(e);
                return c26404f;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: xO */
    public /* synthetic */ void m87564xO() {
        RobotoEditText robotoEditText;
        if (!this.f81958D2 && (robotoEditText = this.f82011Z0) != null) {
            AbstractC2379w.m12432f(robotoEditText);
            this.f81956C2 = true;
        }
    }

    /* renamed from: yN */
    private static C26404f m87566yN(C17945a0 c17945a0) {
        C26404f c26404f;
        C26404f c26404f2 = null;
        try {
            c26404f = new C26404f(20);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            c26404f.f125452h = c17945a0;
            c26404f.m136167t(c17945a0.m95051X3());
            c26404f.f125451g = c17945a0.m94929K2();
            if (c17945a0.m94929K2() instanceof C17967h1) {
                JSONObject m95580k = ((C17967h1) c17945a0.m94929K2()).m95580k();
                JSONObject jSONObject = ((C17967h1) c17945a0.m94929K2()).f90987M;
                if (m95580k != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("zinstantdata", m95580k);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ZInstantAPIInfo", jSONObject2);
                    if (jSONObject != null) {
                        jSONObject3.put("previewMsgText", jSONObject);
                    }
                    c26404f.f125440V = jSONObject3;
                }
            }
            if (c26404f.f125440V == null) {
                return null;
            }
            return c26404f;
        } catch (Exception e12) {
            e = e12;
            c26404f2 = c26404f;
            AbstractC20110a.m104539h(e);
            return c26404f2;
        }
    }

    /* renamed from: yO */
    public /* synthetic */ void m87567yO() {
        m87441HN(true);
    }

    /* renamed from: zN */
    private void m87569zN() {
        AbstractC23647d.m123897g("13692");
        if (!AbstractC23034c6.m118121G()) {
            AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, 134);
        } else if (AbstractC23238v2.m119727l()) {
            m87447JO();
        } else {
            ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
        }
    }

    /* renamed from: zO */
    public /* synthetic */ void m87570zO(Object obj, List list) {
        RecyclerView recyclerView;
        try {
            RobotoEditText robotoEditText = this.f82011Z0;
            if (robotoEditText != null && obj.equals(robotoEditText.getText().toString().trim())) {
                if (list.isEmpty()) {
                    list.add(new ContactProfile("-9"));
                }
                this.f81984Q0.m36375N(list);
                this.f81984Q0.m10008p();
                if (!list.isEmpty() && (recyclerView = this.f81981P0) != null) {
                    recyclerView.m9837K1(0);
                    this.f81981P0.scrollBy(0, Math.abs((int) this.f81993T0.getTranslationY()));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: Exception -> 0x0027, TryCatch #1 {Exception -> 0x0027, blocks: (B:3:0x0011, B:5:0x001b, B:6:0x0029, B:8:0x002f, B:11:0x0038, B:13:0x0040, B:17:0x004a, B:19:0x0052, B:22:0x005b, B:24:0x005f, B:25:0x0067), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:27:0x0092, B:29:0x00f6, B:31:0x00fc, B:33:0x0131, B:35:0x013b, B:36:0x014d, B:38:0x0151, B:39:0x015d), top: B:26:0x0092 }] */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo37111CJ(Bundle bundle) {
        JSONObject jSONObject;
        Bundle m92688sK;
        boolean z11;
        boolean z12;
        boolean z13;
        super.mo37111CJ(bundle);
        try {
            m92688sK = m92688sK();
            if (m92688sK.containsKey("EXTRA_CONFIG")) {
                this.f82065x2 = new JSONObject(m92688sK.getString("EXTRA_CONFIG"));
            }
            if (m92688sK.containsKey("EXTRA_CONFIG_ENABLE_HIDE_GROUP") && m92688sK.getBoolean("EXTRA_CONFIG_ENABLE_HIDE_GROUP")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f81968I2 = z11;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        try {
            if (m92688sK.containsKey("EXTRA_CONFIG_SHOW_CREATE_GROUP_ENTRY_POINT") && !m92688sK.getBoolean("EXTRA_CONFIG_SHOW_CREATE_GROUP_ENTRY_POINT")) {
                z12 = false;
                this.f81970J2 = z12;
                if (!m92688sK.containsKey("EXTRA_ONLY_SHOW_ZALO_FRIEND") && m92688sK.getBoolean("EXTRA_ONLY_SHOW_ZALO_FRIEND")) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f81972K2 = z13;
                if (bundle == null) {
                    this.f82006X1 = m92688sK.getBoolean("extra_show_dialog_file_limit", false);
                }
                this.f81976M2 = m92688sK.getString("STR_SOURCE_START_VIEW", "");
                this.f81974L2 = m92688sK.getString("STR_LOG_CHAT_TYPE", "0");
                this.f81978N2 = m92688sK.getInt("INT_LOG_MSG_INDEX", -1);
                this.f81980O2 = m92642L3().getBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", false);
                this.f81953B1 = new C23528a(m92648SI());
                this.f82057t2 = new Handler(Looper.getMainLooper());
                m92637BK(true);
                C25983d c25983d = new C25983d(f81950e3);
                c25983d.start();
                this.f82059u2 = new C16140g(c25983d.m133836a());
                this.f82063w2.m126330E(true);
                this.f82063w2.m126341P(!C21373a.f104231a.m110802n());
                this.f82063w2.m126347V(m92652XI(AbstractC8020f0.lable_share_destination));
                this.f82001V2.addAll(this.f82063w2.m126352b());
                this.f82004W2.addAll(this.f82063w2.m126353c());
                jSONObject = this.f82065x2;
                if (jSONObject != null && jSONObject.has("suggestGroup")) {
                    JSONObject optJSONObject = this.f82065x2.optJSONObject("suggestGroup");
                    ContactProfile contactProfile = new ContactProfile("-10");
                    this.f81962F2 = contactProfile;
                    contactProfile.f42437s = optJSONObject.optString("title");
                    this.f81962F2.f42446v = optJSONObject.optString("iconUrl");
                    this.f81962F2.f42358M0 = optJSONObject.optString("groupInfo", "");
                    if (!TextUtils.isEmpty(this.f81962F2.f42437s) && !TextUtils.isEmpty(this.f81962F2.f42446v)) {
                        this.f82001V2.add(this.f81962F2);
                        AbstractC23647d.m123906p("136931");
                        AbstractC23647d.m123893c();
                    }
                }
                if (this.f81970J2) {
                    this.f82001V2.add(new ContactProfile("-1"));
                }
                this.f82063w2.m126337L(true);
                this.f82063w2.m126343R(true);
                this.f82063w2.m126349X(m92652XI(AbstractC8020f0.str_share_title_recents));
                this.f82063w2.m126339N(!this.f81968I2);
                this.f82063w2.m126342Q(true);
                this.f82063w2.m126348W(m92652XI(AbstractC8020f0.str_share_title_group));
                this.f82063w2.m126338M(true);
                this.f82063w2.m126340O(true);
                this.f82063w2.m126346U(m92652XI(AbstractC8020f0.str_share_title_contact));
                this.f82063w2.m126333H(true);
                this.f82063w2.m126332G(this.f81970J2);
                this.f82063w2.m126331F(this.f81972K2);
                return;
            }
            this.f81953B1 = new C23528a(m92648SI());
            this.f82057t2 = new Handler(Looper.getMainLooper());
            m92637BK(true);
            C25983d c25983d2 = new C25983d(f81950e3);
            c25983d2.start();
            this.f82059u2 = new C16140g(c25983d2.m133836a());
            this.f82063w2.m126330E(true);
            this.f82063w2.m126341P(!C21373a.f104231a.m110802n());
            this.f82063w2.m126347V(m92652XI(AbstractC8020f0.lable_share_destination));
            this.f82001V2.addAll(this.f82063w2.m126352b());
            this.f82004W2.addAll(this.f82063w2.m126353c());
            jSONObject = this.f82065x2;
            if (jSONObject != null) {
                JSONObject optJSONObject2 = this.f82065x2.optJSONObject("suggestGroup");
                ContactProfile contactProfile2 = new ContactProfile("-10");
                this.f81962F2 = contactProfile2;
                contactProfile2.f42437s = optJSONObject2.optString("title");
                this.f81962F2.f42446v = optJSONObject2.optString("iconUrl");
                this.f81962F2.f42358M0 = optJSONObject2.optString("groupInfo", "");
                if (!TextUtils.isEmpty(this.f81962F2.f42437s)) {
                    this.f82001V2.add(this.f81962F2);
                    AbstractC23647d.m123906p("136931");
                    AbstractC23647d.m123893c();
                }
            }
            if (this.f81970J2) {
            }
            this.f82063w2.m126337L(true);
            this.f82063w2.m126343R(true);
            this.f82063w2.m126349X(m92652XI(AbstractC8020f0.str_share_title_recents));
            this.f82063w2.m126339N(!this.f81968I2);
            this.f82063w2.m126342Q(true);
            this.f82063w2.m126348W(m92652XI(AbstractC8020f0.str_share_title_group));
            this.f82063w2.m126338M(true);
            this.f82063w2.m126340O(true);
            this.f82063w2.m126346U(m92652XI(AbstractC8020f0.str_share_title_contact));
            this.f82063w2.m126333H(true);
            this.f82063w2.m126332G(this.f81970J2);
            this.f82063w2.m126331F(this.f81972K2);
            return;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return;
        }
        z12 = true;
        this.f81970J2 = z12;
        if (!m92688sK.containsKey("EXTRA_ONLY_SHOW_ZALO_FRIEND")) {
        }
        z13 = false;
        this.f81972K2 = z13;
        if (bundle == null) {
        }
        this.f81976M2 = m92688sK.getString("STR_SOURCE_START_VIEW", "");
        this.f81974L2 = m92688sK.getString("STR_LOG_CHAT_TYPE", "0");
        this.f81978N2 = m92688sK.getInt("INT_LOG_MSG_INDEX", -1);
        this.f81980O2 = m92642L3().getBoolean("STR_EXTRA_SHARED_FROM_OTHER_APP", false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        boolean z11 = false;
        if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        return super.mo39014DJ(i11);
                    }
                    C8009j.a aVar = new C8009j.a(m92648SI());
                    aVar.m43159h(4).m43161j(AbstractC8020f0.str_content_popup_confirm_unblock).m43169r(AbstractC8020f0.btn_func_Unblock, new C16147n()).m43164m(AbstractC8020f0.cancel, new InterfaceC17463d.b());
                    return aVar.m43152a();
                }
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43159h(4).m43171t(AbstractC8020f0.str_change_phone_share_confirm_title).m43161j(AbstractC8020f0.str_change_phone_share_confirm_content).m43169r(AbstractC8020f0.str_change_phone_share_confirm_yes, this).m43164m(AbstractC8020f0.str_change_phone_share_confirm_no, this);
                return aVar2.m43152a();
            }
            this.f82006X1 = false;
            C8009j.a aVar3 = new C8009j.a(m92648SI());
            aVar3.m43159h(3).m43161j(AbstractC8020f0.str_toast_file_size_limit).m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.d() { // from class: nc0.m0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                    ShareView.m87527kO(interfaceC17463d, i14);
                }
            });
            return aVar3.m43152a();
        }
        if (i11 == 2) {
            z11 = true;
        }
        C2850a.a aVar4 = new C2850a.a(m92648SI());
        if (z11) {
            i12 = AbstractC16803z.btn_radio_on_holo_light;
        } else {
            i12 = -1;
        }
        C2850a.a m13741c = aVar4.m13741c(i12);
        if (z11) {
            i13 = AbstractC8020f0.profile_share_vip_success;
        } else {
            i13 = AbstractC8020f0.str_share_cancel;
        }
        m13741c.m13743e(i13).m13742d(AbstractC8020f0.str_stay_in_zalo, new InterfaceC17463d.d() { // from class: nc0.h0

            /* renamed from: q */
            public final /* synthetic */ boolean f114768q;

            public /* synthetic */ C23700h0(boolean z112) {
                r2 = z112;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                ShareView.this.m87519iO(r2, interfaceC17463d, i14);
            }
        }).m13740b(AbstractC8020f0.str_back_to_previous_app, new InterfaceC17463d.d() { // from class: nc0.l0

            /* renamed from: q */
            public final /* synthetic */ boolean f114782q;

            public /* synthetic */ C23708l0(boolean z112) {
                r2 = z112;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                ShareView.this.m87523jO(r2, interfaceC17463d, i14);
            }
        });
        C2850a m13739a = aVar4.m13739a();
        m13739a.m92873y(!z112);
        m13739a.m92874z(!z112);
        return m13739a;
    }

    /* renamed from: EN */
    void m87571EN(String str) {
        Handler handler = this.f82057t2;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: nc0.d0

                /* renamed from: q */
                public final /* synthetic */ String f114757q;

                public /* synthetic */ RunnableC23692d0(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87499cO(r2);
                }
            }, 500L);
        } else {
            m87514hN();
            ToastUtils.showMess(str2);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        ActionBar actionBar;
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        C24221a c24221a = this.f82063w2;
        if (c24221a != null && c24221a.m126360j() && (actionBar = this.f88760a0) != null) {
            actionBar.setSubtitle(String.format(m92652XI(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f81994T1.size())));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<String> stringArrayList;
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.share_view, viewGroup, false);
        try {
            this.f82064x1 = (ImageButton) inflate.findViewById(AbstractC6918a0.btn_retry);
            this.f82020c1 = (RoundCornerImageView) inflate.findViewById(AbstractC6918a0.imagePreview);
            this.f82023d1 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.titlePreview);
            this.f82026e1 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.desPreview);
            this.f82028f1 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvNumber);
            this.f82030g1 = inflate.findViewById(AbstractC6918a0.iconOA);
            this.f82036j1 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.iconPreview);
            this.f82032h1 = inflate.findViewById(AbstractC6918a0.layoutImagePreview);
            this.f82034i1 = inflate.findViewById(AbstractC6918a0.progress_loading);
            RoundCornerImageView roundCornerImageView = this.f82020c1;
            roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(roundCornerImageView.getContext(), AbstractC16781w.PopupBackgroundColor));
            this.f82020c1.setAlpha(1.0f);
            this.f82056t1 = (RecyclerView) inflate.findViewById(AbstractC6918a0.list_preview);
            this.f82058u1 = inflate.findViewById(AbstractC6918a0.preview);
            this.f82060v1 = (FrameLayout) inflate.findViewById(AbstractC6918a0.preview_zinstant);
            View findViewById = inflate.findViewById(AbstractC6918a0.floating_btn_send);
            this.f82066y1 = findViewById;
            findViewById.setOnClickListener(this);
            this.f82064x1.setOnClickListener(this);
            RobotoEditText robotoEditText = (RobotoEditText) inflate.findViewById(AbstractC6918a0.edtCaption);
            this.f82017b1 = robotoEditText;
            robotoEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3000)});
            this.f82017b1.setOnTouchListener(new View.OnTouchListener() { // from class: nc0.f
                public /* synthetic */ ViewOnTouchListenerC23695f() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m87543qO;
                    m87543qO = ShareView.this.m87543qO(view, motionEvent);
                    return m87543qO;
                }
            });
            View findViewById2 = inflate.findViewById(AbstractC6918a0.layout_preview);
            this.f82005X0 = findViewById2;
            findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: nc0.h
                public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC23699h() {
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ShareView.this.m87546rO();
                }
            });
            this.f82005X0.setOnClickListener(AbstractC23136l9.f112240a);
            DimLinearLayout dimLinearLayout = (DimLinearLayout) inflate.findViewById(AbstractC6918a0.content_view);
            this.f81993T0 = dimLinearLayout;
            dimLinearLayout.setDimColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_30));
            this.f81993T0.setDimClickListener(new View.OnClickListener() { // from class: nc0.i
                public /* synthetic */ ViewOnClickListenerC23701i() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShareView.this.m87549sO(view);
                }
            });
            View inflate2 = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.item_destination_view, (ViewGroup) null, false);
            this.f81996U0 = inflate2;
            this.f82054s1 = inflate2.findViewById(AbstractC6918a0.share_multi_destination);
            this.f82038k1 = this.f81996U0.findViewById(AbstractC6918a0.share_group_destination);
            this.f82040l1 = (RobotoTextView) this.f81996U0.findViewById(AbstractC6918a0.tvShareDestination);
            this.f82042m1 = (RecyclingImageView) this.f81996U0.findViewById(AbstractC6918a0.iconShareDestination);
            this.f82044n1 = this.f81996U0.findViewById(AbstractC6918a0.share_group_view);
            this.f82046o1 = this.f81996U0.findViewById(AbstractC6918a0.share_one_group_view);
            this.f82048p1 = this.f81996U0.findViewById(AbstractC6918a0.share_story_view);
            this.f82050q1 = this.f81996U0.findViewById(AbstractC6918a0.share_timeline_view);
            this.f82052r1 = this.f81996U0.findViewById(AbstractC6918a0.share_other_app);
            this.f82038k1.setOnClickListener(this);
            this.f82044n1.setOnClickListener(this);
            this.f82046o1.setOnClickListener(this);
            this.f82048p1.setOnClickListener(this);
            this.f82050q1.setOnClickListener(this);
            this.f82052r1.setOnClickListener(this);
            View view = new View(m92648SI());
            this.f81999V0 = view;
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            CustomRelativeLayout customRelativeLayout = (CustomRelativeLayout) inflate.findViewById(AbstractC6918a0.keyboard_root_view);
            customRelativeLayout.setOnClickListener(AbstractC23136l9.f112240a);
            customRelativeLayout.setLayoutChangeListener(new C16141h());
            this.f81981P0 = (RecyclerView) inflate.findViewById(AbstractC6918a0.recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            this.f82008Y0 = linearLayoutManager;
            this.f81981P0.setLayoutManager(linearLayoutManager);
            C7153n7 c7153n7 = new C7153n7(this, this.f81996U0, this.f81999V0);
            this.f81984Q0 = c7153n7;
            c7153n7.f39123u = this.f82063w2.m126360j();
            this.f81984Q0.f39124v = this.f82063w2.m126374x();
            this.f81984Q0.m36375N(this.f81957D1);
            this.f81981P0.setAdapter(this.f81984Q0);
            this.f81981P0.m9826E(new C16142i());
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(AbstractC6918a0.rv_bubbles);
            this.f81987R0 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(m92648SI(), 0, false));
            C7005a5 c7005a5 = new C7005a5();
            this.f81990S0 = c7005a5;
            c7005a5.f38321u = true;
            this.f81987R0.setAdapter(c7005a5);
            C31784b.m152808a(this.f81987R0).m152809b(new C31784b.d() { // from class: nc0.j
                public /* synthetic */ C23703j() {
                }

                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView2, int i11, View view2) {
                    ShareView.this.m87552tO(recyclerView2, i11, view2);
                }
            });
            if (!m92676n2().mo35576n3()) {
                inflate.setFitsSystemWindows(true);
            }
            View findViewById3 = inflate.findViewById(AbstractC6918a0.layout_search);
            this.f82002W0 = findViewById3;
            findViewById3.setOnClickListener(this);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.clear);
            this.f82014a1 = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: nc0.k
                public /* synthetic */ ViewOnClickListenerC23705k() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareView.this.m87555uO(view2);
                }
            });
            RobotoEditText robotoEditText2 = (RobotoEditText) inflate.findViewById(AbstractC6918a0.edit_search);
            this.f82011Z0 = robotoEditText2;
            AbstractC32234k.m155469a(robotoEditText2, AbstractC16803z.chat_bar_text_cursor);
            this.f82011Z0.postDelayed(new Runnable() { // from class: nc0.m
                public /* synthetic */ RunnableC23709m() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87558vO();
                }
            }, 300L);
            this.f82011Z0.addTextChangedListener(new C16143j());
            this.f82011Z0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: nc0.n
                public /* synthetic */ ViewOnFocusChangeListenerC23711n() {
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z11) {
                    ShareView.this.m87561wO(view2, z11);
                }
            });
            ViewOnTouchListenerC23713o viewOnTouchListenerC23713o = new View.OnTouchListener() { // from class: nc0.o
                public /* synthetic */ ViewOnTouchListenerC23713o() {
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean m87533mO;
                    m87533mO = ShareView.this.m87533mO(view2, motionEvent);
                    return m87533mO;
                }
            };
            this.f82002W0.setOnTouchListener(viewOnTouchListenerC23713o);
            this.f82011Z0.setOnTouchListener(viewOnTouchListenerC23713o);
            this.f82017b1.addTextChangedListener(new C16144k());
            if (bundle == null) {
                m87460ON(m92642L3());
            } else {
                m87460ON(bundle);
                ZaloView m92996E0 = m92649TI().m92996E0("DownloadToForwardDialog");
                if (m92996E0 instanceof DownloadToForwardDialog) {
                    ((DownloadToForwardDialog) m92996E0).dismiss();
                }
            }
            if (this.f82049p2) {
                inflate.setVisibility(8);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f82067y2 = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator());
            this.f82067y2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nc0.p
                public /* synthetic */ C23715p() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ShareView.this.m87535nO(valueAnimator);
                }
            });
            this.f82067y2.addListener(new C16145l());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f82069z2 = ofFloat2;
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            this.f82069z2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nc0.q
                public /* synthetic */ C23717q() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ShareView.this.m87537oO(valueAnimator);
                }
            });
            this.f82069z2.addListener(new C16146m());
            if (bundle != null) {
                m87469RO(bundle.getStringArrayList("listSelect"));
            } else if (m92642L3() != null && (stringArrayList = m92642L3().getStringArrayList("EXTRA_SELECTED_UID_LIST")) != null) {
                m87469RO(stringArrayList);
            }
            if (AbstractC23309i.m121980hf()) {
                this.f82057t2.postDelayed(new Runnable() { // from class: nc0.g
                    public /* synthetic */ RunnableC23697g() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.this.m87540pO();
                    }
                }, 100L);
                this.f81956C2 = true;
            }
            m87503dP(0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return inflate;
    }

    /* renamed from: HO */
    public void m87572HO(ContactProfile contactProfile) {
        try {
            if (this.f82004W2.contains(contactProfile)) {
                AbstractC23647d.m123906p("136910");
                AbstractC23647d.m123893c();
            } else {
                List list = this.f81959E1;
                if (list != null && list.contains(contactProfile)) {
                    AbstractC23647d.m123906p("136911");
                    AbstractC23647d.m123893c();
                } else {
                    List list2 = this.f81961F1;
                    if (list2 != null && list2.contains(contactProfile)) {
                        AbstractC23647d.m123906p("136912");
                        AbstractC23647d.m123893c();
                    } else {
                        List list3 = this.f81963G1;
                        if (list3 != null && list3.contains(contactProfile)) {
                            AbstractC23647d.m123906p("136913");
                            AbstractC23647d.m123893c();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 5) {
            if (i11 == -1) {
                m87472SO(this.f81997U1);
            }
            interfaceC17463d.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 6016);
    }

    /* renamed from: MO */
    public void m87573MO(String str) {
        if (!this.f82010Y2 && str != null && str.length() != 0) {
            this.f82010Y2 = true;
            this.f81965H1 = null;
            C32204z7.m155260j().m155277x(str, false, true, 1, new C16135b());
        }
    }

    /* renamed from: P */
    public void mo36377P(ContactProfile contactProfile) {
        boolean isEmpty;
        C31973j5 m4472f;
        int i11;
        ActionBar actionBar;
        try {
            AbstractC2379w.m12430d(this.f82011Z0);
            if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                this.f81986Q2 = contactProfile;
                showDialog(6);
                return;
            }
            this.f81956C2 = false;
            m87572HO(contactProfile);
            int i12 = 8;
            if (this.f81994T1.containsKey(contactProfile.f42434r)) {
                this.f81994T1.remove(contactProfile.f42434r);
                isEmpty = this.f81994T1.isEmpty();
                this.f81960E2 = true;
                int size = this.f81988R1.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((InviteContactProfile) this.f81988R1.get(size)).f42434r.equals(contactProfile.f42434r)) {
                        this.f81988R1.remove(size);
                        break;
                    }
                    size--;
                }
                this.f81984Q0.f39125w = "";
                RecyclerView recyclerView = this.f81987R0;
                if (!this.f81988R1.isEmpty()) {
                    i12 = 0;
                }
                recyclerView.setVisibility(i12);
                this.f81990S0.m35846M(this.f81988R1);
                this.f81990S0.m10008p();
            } else {
                if (this.f81994T1.size() >= AbstractC0924m0.m4364y3()) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_max_thread_allow_share, Integer.valueOf(AbstractC0924m0.m4364y3())));
                    return;
                }
                if (contactProfile.m40374K0() && (m4472f = C0943w.m4462l().m4472f(contactProfile.f42434r)) != null && !m4472f.m153742T() && m4472f.m153764i0()) {
                    if (m4472f.m153747Y()) {
                        i11 = AbstractC8020f0.str_cannot_send_message_to_community;
                    } else {
                        i11 = AbstractC8020f0.str_cannot_send_message_to_group;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                    return;
                }
                this.f81984Q0.f39125w = "";
                isEmpty = this.f81994T1.isEmpty();
                this.f81960E2 = false;
                this.f81994T1.put(contactProfile.f42434r, contactProfile);
                this.f81988R1.add(new InviteContactProfile(contactProfile));
                RecyclerView recyclerView2 = this.f81987R0;
                if (!this.f81988R1.isEmpty()) {
                    i12 = 0;
                }
                recyclerView2.setVisibility(i12);
                this.f81990S0.m35846M(this.f81988R1);
                this.f81990S0.m10008p();
                this.f81987R0.post(new Runnable() { // from class: nc0.y
                    public /* synthetic */ RunnableC23726y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.this.m87511gO();
                    }
                });
                if (C21927m.m114302u().m114345m(contactProfile.f42434r)) {
                    AbstractC23647d.m123897g("5801132");
                }
            }
            if (isEmpty) {
                m87463PO();
            } else {
                C7153n7 c7153n7 = this.f81984Q0;
                if (c7153n7 != null) {
                    c7153n7.m10008p();
                }
            }
            m87522jN();
            AbstractC23309i.m122620yl(!TextUtils.isEmpty(this.f82011Z0.getText().toString().trim()));
            RobotoEditText robotoEditText = this.f82011Z0;
            if (robotoEditText != null) {
                robotoEditText.setText("");
            }
            C24221a c24221a = this.f82063w2;
            if (c24221a != null && c24221a.m126360j() && (actionBar = this.f88760a0) != null) {
                actionBar.setSubtitle(String.format(m92652XI(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f81994T1.size())));
            }
            m87576XO(!this.f81994T1.isEmpty());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        this.f82000V1 = null;
        m87460ON(m92642L3());
    }

    /* renamed from: PN */
    boolean m87574PN() {
        List list;
        boolean z11;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (!this.f81975M1) {
            return false;
        }
        if (this.f81997U1.m136159l() == 2) {
            return true;
        }
        if (this.f81997U1.m136159l() == 4) {
            if (this.f82024d2 == null) {
                return true;
            }
            return !r1.m94857B8();
        }
        if (this.f81997U1.m136159l() != 1 && this.f81997U1.m136159l() != 13) {
            if (this.f81997U1.m136159l() == 5) {
                C26404f c26404f = this.f81997U1;
                C17945a0 c17945a0 = c26404f.f125452h;
                if (c17945a0 != null) {
                    z11 = c17945a0.m95288w8();
                } else {
                    z11 = c26404f.m136161n().f128949V;
                }
                if (!z11) {
                    C26404f c26404f2 = this.f81997U1;
                    if (c26404f2.f125452h != null) {
                        return true;
                    }
                    if (c26404f2.m136161n() != null && !TextUtils.isEmpty(this.f81997U1.m136161n().m140220E())) {
                        return true;
                    }
                }
            } else {
                if (this.f81997U1.m136159l() != 10 && this.f81997U1.m136159l() != 3) {
                    if (this.f81997U1.m136159l() != 21 || (list = this.f81997U1.f125434P) == null || list.size() != 1) {
                        return false;
                    }
                    return true;
                }
                C26404f c26404f3 = this.f81997U1;
                if (c26404f3.f125452h != null || !TextUtils.isEmpty(c26404f3.m136149b())) {
                    return true;
                }
            }
            return false;
        }
        if (TextUtils.isEmpty(this.f81997U1.m136149b())) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            try {
                this.f81958D2 = true;
                AbstractC2379w.m12430d(this.f82011Z0);
                this.f81956C2 = false;
                FeedActionZUtils.m47534V(m92648SI(), this.f81982P1, 0, 0);
                if (this.f81979O1) {
                    AbstractC23136l9.m118678T0((Activity) m92648SI());
                    finish();
                } else if (this.f81977N1) {
                    showDialog(3);
                } else {
                    m87514hN();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            C23744a.m124114c().m124117e(this, 9);
            C23744a.m124114c().m124117e(this, 36);
            C23744a.m124114c().m124117e(this, 6072);
            C23744a.m124114c().m124117e(this, 6073);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = this.f81988R1.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContactProfile) it.next()).f42434r);
            }
            bundle.putStringArrayList("listSelect", arrayList);
            bundle.putString("currentCaption", this.f82000V1);
            if (!TextUtils.isEmpty(this.f81969J1)) {
                bundle.putString("imagePathUri", this.f81969J1);
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    bundle.putBoolean("bol_extra_photo_hd", m92642L3.getBoolean("bol_extra_photo_hd", false));
                }
            } else if (!TextUtils.isEmpty(this.f81971K1)) {
                bundle.putString("linktoShare", this.f81971K1);
                bundle.putString("subjectForLink", this.f81973L1);
            } else {
                boolean z11 = this.f82031g2;
                if (z11) {
                    bundle.putBoolean("bol_extra_is_forwarding", z11);
                    bundle.putParcelable("forwardMessageId", this.f82037j2);
                    bundle.putString("forwardMessageOwnerUid", this.f82039k2);
                } else {
                    boolean z12 = this.f82033h2;
                    if (z12) {
                        bundle.putBoolean("bol_extra_group_forwarding", z12);
                        bundle.putParcelable("forwardMessageId", this.f82037j2);
                        bundle.putString("forwardMessageOwnerUid", this.f82039k2);
                    } else {
                        boolean z13 = this.f82035i2;
                        if (z13) {
                            bundle.putBoolean("EXTRA_BOOLEAN_FORWARD_MULTI_MESSAGES", z13);
                            bundle.putParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", this.f82029f2);
                            bundle.putString("forwardMessageOwnerUid", this.f82039k2);
                        } else {
                            bundle.putAll(m92642L3());
                        }
                    }
                }
            }
            bundle.putBoolean("bol_share_in_app", this.f81975M1);
            bundle.putBoolean("bol_back_to_source", this.f81977N1);
            bundle.putBoolean("bol_auto_back_to_source", this.f81979O1);
            bundle.putString("token", this.f81982P1);
            bundle.putBoolean("btn_extra_show_hide_post_feed", this.f82043m2);
            super.mo37118SJ(bundle);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.adapters.C7153n7.a
    /* renamed from: T1 */
    public boolean mo36378T1(String str) {
        return this.f81994T1.containsKey(str);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(m92652XI(AbstractC8020f0.share));
            AbstractC23136l9.m118690Z0(this.f88760a0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0175 A[Catch: all -> 0x0013, Exception -> 0x0170, TryCatch #1 {Exception -> 0x0170, blocks: (B:16:0x015b, B:18:0x015f, B:20:0x016d, B:22:0x0175, B:23:0x0177, B:25:0x0185, B:26:0x018f, B:27:0x0193, B:29:0x0199, B:31:0x01a8, B:33:0x01af, B:36:0x01b3, B:136:0x0158), top: B:135:0x0158, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0185 A[Catch: all -> 0x0013, Exception -> 0x0170, TryCatch #1 {Exception -> 0x0170, blocks: (B:16:0x015b, B:18:0x015f, B:20:0x016d, B:22:0x0175, B:23:0x0177, B:25:0x0185, B:26:0x018f, B:27:0x0193, B:29:0x0199, B:31:0x01a8, B:33:0x01af, B:36:0x01b3, B:136:0x0158), top: B:135:0x0158, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0199 A[Catch: all -> 0x0013, Exception -> 0x0170, TryCatch #1 {Exception -> 0x0170, blocks: (B:16:0x015b, B:18:0x015f, B:20:0x016d, B:22:0x0175, B:23:0x0177, B:25:0x0185, B:26:0x018f, B:27:0x0193, B:29:0x0199, B:31:0x01a8, B:33:0x01af, B:36:0x01b3, B:136:0x0158), top: B:135:0x0158, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: TO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m87575TO(boolean z11) {
        C28154p2 c28154p2;
        C26404f c26404f;
        boolean z12;
        ContactProfile contactProfile;
        try {
            try {
                if (this.f81985Q1.size() < 2) {
                    AbstractC23647d.m123906p("13621");
                    AbstractC23647d.m123893c();
                } else if (this.f81985Q1.size() < 6) {
                    AbstractC23647d.m123906p("13622");
                    AbstractC23647d.m123893c();
                } else if (this.f81985Q1.size() < 11) {
                    AbstractC23647d.m123906p("13623");
                    AbstractC23647d.m123893c();
                } else {
                    AbstractC23647d.m123906p("13624");
                    AbstractC23647d.m123893c();
                }
                Iterator it = this.f81985Q1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C21927m.m114302u().m114345m(((ContactProfile) it.next()).f42434r)) {
                            AbstractC23647d.m123897g("5801133");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                switch (this.f81997U1.m136159l()) {
                    case 1:
                        AbstractC23647d.m123906p("38113");
                        AbstractC23647d.m123893c();
                        break;
                    case 2:
                        AbstractC23647d.m123906p("38101");
                        AbstractC23647d.m123893c();
                        break;
                    case 3:
                        AbstractC23647d.m123906p("38106");
                        AbstractC23647d.m123893c();
                        break;
                    case 4:
                        AbstractC23647d.m123906p("38102");
                        AbstractC23647d.m123893c();
                        break;
                    case 5:
                        C26404f c26404f2 = this.f81997U1;
                        C17945a0 c17945a0 = c26404f2.f125452h;
                        if (c17945a0 != null) {
                            z12 = c17945a0.m95288w8();
                        } else {
                            z12 = c26404f2.m136161n().f128949V;
                        }
                        if (z12) {
                            AbstractC23647d.m123906p("38105");
                        } else {
                            AbstractC23647d.m123906p("38116");
                        }
                        AbstractC23647d.m123893c();
                        break;
                    case 6:
                        AbstractC23647d.m123906p("38111");
                        AbstractC23647d.m123893c();
                        break;
                    case 7:
                        AbstractC23647d.m123906p("38104");
                        AbstractC23647d.m123893c();
                        break;
                    case 8:
                        AbstractC23647d.m123906p("38103");
                        AbstractC23647d.m123893c();
                        break;
                    case 9:
                        C26404f c26404f3 = this.f81997U1;
                        if (c26404f3 != null && (contactProfile = c26404f3.f125456l) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f81997U1.f125456l.f42434r);
                            if (m141809c != null && m141809c.m40387S0()) {
                                AbstractC23647d.m123906p("38111");
                            } else {
                                AbstractC23647d.m123906p("38110");
                            }
                            AbstractC23647d.m123893c();
                            break;
                        }
                        break;
                    case 10:
                        AbstractC23647d.m123906p("38107");
                        AbstractC23647d.m123893c();
                        break;
                    case 11:
                        AbstractC23647d.m123906p("38105");
                        AbstractC23647d.m123893c();
                        break;
                    case 12:
                        AbstractC23647d.m123906p("38109");
                        AbstractC23647d.m123893c();
                        break;
                    case 13:
                        AbstractC23647d.m123906p("38112");
                        AbstractC23647d.m123893c();
                        break;
                    case 14:
                        AbstractC23647d.m123906p("38114");
                        AbstractC23647d.m123893c();
                        break;
                    case 15:
                        AbstractC23647d.m123906p("38117");
                        AbstractC23647d.m123893c();
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        AbstractC23647d.m123906p("38115");
                        AbstractC23647d.m123893c();
                        break;
                    case 17:
                        AbstractC23647d.m123906p("38108");
                        AbstractC23647d.m123893c();
                        break;
                }
            } catch (Exception e11) {
                try {
                    AbstractC23350e.m122778h(e11);
                } catch (Exception e12) {
                    AbstractC23350e.m122778h(e12);
                    synchronized (this.f82018b2) {
                        try {
                            this.f82015a2 = false;
                            Handler handler = this.f82057t2;
                            if (handler != null) {
                                handler.removeCallbacks(this.f82016a3);
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.f82047o2 != null) {
                AbstractC28127m2 m141613e = AbstractC28127m2.a.m141609d().m141613e(this.f82047o2);
                if (m141613e instanceof C28154p2) {
                    c28154p2 = (C28154p2) m141613e;
                    if (c28154p2 != null) {
                        c28154p2.f131226e = 2;
                    }
                    m87506eP();
                    ArrayList<ContactProfile> arrayList = new ArrayList(this.f81985Q1);
                    c26404f = this.f81997U1;
                    if (c26404f != null) {
                        c26404f.f125439U = C23793c.m124316k().mo124319c();
                    }
                    for (ContactProfile contactProfile2 : arrayList) {
                        AbstractC23112j7.m118513W(contactProfile2.f42434r, this.f81997U1);
                        if (c28154p2 != null) {
                            c28154p2.f131228g.add(contactProfile2.f42434r);
                        }
                        m87497bP();
                    }
                    m87466QO();
                    m87518iN();
                    synchronized (this.f82018b2) {
                        try {
                            this.f82015a2 = false;
                            Handler handler2 = this.f82057t2;
                            if (handler2 != null) {
                                handler2.removeCallbacks(this.f82016a3);
                            }
                        } finally {
                        }
                    }
                    if (z11) {
                        m87579oN();
                        ToastUtils.m89272t(AbstractC23136l9.m118743r0(AbstractC8020f0.d2f_shared));
                        return;
                    }
                    return;
                }
            }
            c28154p2 = null;
            if (c28154p2 != null) {
            }
            m87506eP();
            ArrayList<ContactProfile> arrayList2 = new ArrayList(this.f81985Q1);
            c26404f = this.f81997U1;
            if (c26404f != null) {
            }
            while (r0.hasNext()) {
            }
            m87466QO();
            m87518iN();
            synchronized (this.f82018b2) {
            }
        } catch (Throwable th2) {
            synchronized (this.f82018b2) {
                try {
                    this.f82015a2 = false;
                    Handler handler3 = this.f82057t2;
                    if (handler3 != null) {
                        handler3.removeCallbacks(this.f82016a3);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* renamed from: XO */
    void m87576XO(boolean z11) {
        if (z11) {
            if (!this.f82061v2) {
                if (this.f82067y2.isRunning()) {
                    this.f82067y2.cancel();
                }
                if (mo78776lN()) {
                    this.f82069z2.start();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f82017b1.isFocused()) {
            AbstractC2379w.m12430d(this.f82017b1);
        }
        this.f81993T0.m75685a(false);
        if (this.f82069z2.isRunning()) {
            this.f82069z2.cancel();
        }
        if (mo78777mN()) {
            this.f82067y2.start();
        }
    }

    @Override // com.zing.zalo.adapters.C7153n7.a
    /* renamed from: Z1 */
    public void mo36379Z1(ContactProfile contactProfile) {
        m87452LN(contactProfile);
    }

    /* renamed from: fP */
    void m87577fP(ContactProfile contactProfile) {
        try {
            if (this.f82025d3) {
                return;
            }
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C16139f(contactProfile));
            this.f82025d3 = true;
            c0766k.mo1448Ha(contactProfile.f42434r, 16);
        } catch (Exception unused) {
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f81950e3;
    }

    /* renamed from: lN */
    protected boolean mo78776lN() {
        if (!this.f82069z2.isRunning() && (this.f82005X0.getTranslationY() != 0.0f || this.f82005X0.getVisibility() != 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: mN */
    protected boolean mo78777mN() {
        if (!this.f82067y2.isRunning() && this.f82005X0.getTranslationY() < this.f82005X0.getHeight() && this.f82005X0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: nN */
    public void m87578nN() {
        RecyclerView recyclerView;
        int i11;
        ActionBar actionBar;
        try {
            this.f81994T1.clear();
            this.f81988R1.clear();
            this.f81984Q0.m10008p();
            C7153n7 c7153n7 = this.f81984Q0;
            if (c7153n7 != null && (recyclerView = this.f81987R0) != null && this.f81990S0 != null) {
                c7153n7.f39125w = "";
                if (this.f81988R1.isEmpty()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                recyclerView.setVisibility(i11);
                this.f81990S0.m35846M(this.f81988R1);
                this.f81990S0.m10008p();
                C24221a c24221a = this.f82063w2;
                if (c24221a != null && c24221a.m126360j() && (actionBar = this.f88760a0) != null) {
                    actionBar.setSubtitle(String.format(m92652XI(AbstractC8020f0.str_selected_muti_share), Integer.valueOf(this.f81994T1.size())));
                }
            }
            m87576XO(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oN */
    public void m87579oN() {
        if (m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: nc0.b
                public /* synthetic */ RunnableC23687b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87479VN();
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 2202) {
            m87457NN(i12, intent);
            return;
        }
        if (i11 == 12345) {
            if (i12 == -1) {
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_share_photo_post_story_successful));
                return;
            }
            return;
        }
        if (i11 == 12346 && i12 == -1 && intent.hasExtra("groupId")) {
            String stringExtra = intent.getStringExtra("groupId");
            if (!TextUtils.isEmpty(stringExtra)) {
                ContactProfile contactProfile = new ContactProfile("group_" + stringExtra);
                List list = this.f81985Q1;
                if (list != null) {
                    list.clear();
                    this.f81985Q1.add(contactProfile);
                }
                C26404f c26404f = this.f81997U1;
                if (c26404f != null) {
                    c26404f.m136172y(this.f82017b1.getText().toString());
                    C17945a0 c17945a0 = this.f81997U1.f125452h;
                    if (c17945a0 != null && c17945a0.m94929K2() != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f81997U1.m136159l() == 5 && !z11 && AbstractC23309i.m121905fg()) {
                        m87455MN(this.f81997U1);
                    } else {
                        m87472SO(this.f81997U1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0163 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0016, B:10:0x001d, B:12:0x002a, B:13:0x0037, B:15:0x003d, B:17:0x004f, B:19:0x0053, B:21:0x0066, B:24:0x006d, B:27:0x0077, B:29:0x007d, B:30:0x0083, B:31:0x0088, B:33:0x008e, B:35:0x0098, B:37:0x00a6, B:38:0x00a9, B:40:0x00ae, B:42:0x00b3, B:53:0x00dd, B:55:0x00e3, B:57:0x00e9, B:59:0x00fd, B:60:0x0145, B:62:0x0163, B:63:0x0168, B:66:0x0175, B:67:0x0180, B:69:0x017d, B:72:0x0106, B:74:0x010e, B:75:0x011a, B:77:0x0126, B:78:0x0132, B:79:0x0185, B:81:0x018a, B:83:0x0197, B:86:0x01a0, B:89:0x01a6, B:91:0x01aa, B:93:0x01c0, B:95:0x01c8, B:96:0x01cf, B:98:0x01d8, B:101:0x01e3, B:102:0x01ed, B:104:0x01f2, B:106:0x01f6, B:108:0x0206, B:110:0x020c, B:111:0x0219, B:114:0x021e, B:116:0x0235, B:118:0x0245, B:120:0x0262, B:121:0x0271, B:123:0x0277, B:126:0x0282, B:127:0x028c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175 A[Catch: Exception -> 0x0013, TRY_ENTER, TryCatch #0 {Exception -> 0x0013, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0016, B:10:0x001d, B:12:0x002a, B:13:0x0037, B:15:0x003d, B:17:0x004f, B:19:0x0053, B:21:0x0066, B:24:0x006d, B:27:0x0077, B:29:0x007d, B:30:0x0083, B:31:0x0088, B:33:0x008e, B:35:0x0098, B:37:0x00a6, B:38:0x00a9, B:40:0x00ae, B:42:0x00b3, B:53:0x00dd, B:55:0x00e3, B:57:0x00e9, B:59:0x00fd, B:60:0x0145, B:62:0x0163, B:63:0x0168, B:66:0x0175, B:67:0x0180, B:69:0x017d, B:72:0x0106, B:74:0x010e, B:75:0x011a, B:77:0x0126, B:78:0x0132, B:79:0x0185, B:81:0x018a, B:83:0x0197, B:86:0x01a0, B:89:0x01a6, B:91:0x01aa, B:93:0x01c0, B:95:0x01c8, B:96:0x01cf, B:98:0x01d8, B:101:0x01e3, B:102:0x01ed, B:104:0x01f2, B:106:0x01f6, B:108:0x0206, B:110:0x020c, B:111:0x0219, B:114:0x021e, B:116:0x0235, B:118:0x0245, B:120:0x0262, B:121:0x0271, B:123:0x0277, B:126:0x0282, B:127:0x028c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:3:0x0004, B:5:0x000c, B:8:0x0016, B:10:0x001d, B:12:0x002a, B:13:0x0037, B:15:0x003d, B:17:0x004f, B:19:0x0053, B:21:0x0066, B:24:0x006d, B:27:0x0077, B:29:0x007d, B:30:0x0083, B:31:0x0088, B:33:0x008e, B:35:0x0098, B:37:0x00a6, B:38:0x00a9, B:40:0x00ae, B:42:0x00b3, B:53:0x00dd, B:55:0x00e3, B:57:0x00e9, B:59:0x00fd, B:60:0x0145, B:62:0x0163, B:63:0x0168, B:66:0x0175, B:67:0x0180, B:69:0x017d, B:72:0x0106, B:74:0x010e, B:75:0x011a, B:77:0x0126, B:78:0x0132, B:79:0x0185, B:81:0x018a, B:83:0x0197, B:86:0x01a0, B:89:0x01a6, B:91:0x01aa, B:93:0x01c0, B:95:0x01c8, B:96:0x01cf, B:98:0x01d8, B:101:0x01e3, B:102:0x01ed, B:104:0x01f2, B:106:0x01f6, B:108:0x0206, B:110:0x020c, B:111:0x0219, B:114:0x021e, B:116:0x0235, B:118:0x0245, B:120:0x0262, B:121:0x0271, B:123:0x0277, B:126:0x0282, B:127:0x028c), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        String str;
        List list;
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_retry) {
                m87500cP(this.f81997U1);
                return;
            }
            boolean z11 = false;
            if (id2 == AbstractC6918a0.floating_btn_send) {
                this.f81958D2 = true;
                AbstractC2379w.m12430d(this.f82011Z0);
                this.f81956C2 = false;
                List list2 = this.f81985Q1;
                if (list2 != null) {
                    list2.clear();
                    Iterator it = this.f81994T1.entrySet().iterator();
                    while (it.hasNext()) {
                        this.f81985Q1.add((ContactProfile) ((Map.Entry) it.next()).getValue());
                    }
                }
                C26404f c26404f = this.f81997U1;
                if (c26404f != null) {
                    c26404f.m136172y(this.f82017b1.getText().toString());
                    C17945a0 c17945a0 = this.f81997U1.f125452h;
                    if (c17945a0 != null && c17945a0.m94929K2() != null) {
                        z11 = true;
                    }
                    if (this.f81997U1.m136159l() == 5 && !z11 && AbstractC23309i.m121905fg()) {
                        m87455MN(this.f81997U1);
                    } else {
                        m87472SO(this.f81997U1);
                    }
                }
                if (m92642L3() != null && m92642L3().containsKey("str_extra_toast_sent_message")) {
                    String string = m92642L3().getString("str_extra_toast_sent_message");
                    if (!TextUtils.isEmpty(string)) {
                        ToastUtils.showMess(string);
                    }
                }
                m87503dP(1);
                return;
            }
            if (id2 == AbstractC6918a0.share_timeline_view) {
                AbstractC2379w.m12430d(this.f82011Z0);
                AbstractC23647d.m123906p("13640");
                AbstractC23647d.m123893c();
                Bundle bundle = new Bundle();
                int m136159l = this.f81997U1.m136159l();
                if (m136159l != 1) {
                    if (m136159l != 2) {
                        if (m136159l != 4) {
                            if (m136159l != 13) {
                                if (m136159l == 21 && (list = this.f81997U1.f125434P) != null && list.size() == 1) {
                                    ShareLinkInfo shareLinkInfo = (ShareLinkInfo) this.f81997U1.f125434P.get(0);
                                    if (!TextUtils.isEmpty(shareLinkInfo.m48437d())) {
                                        bundle.putString("extra_share_original_link", shareLinkInfo.m48437d());
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else if (this.f81997U1.m136157j() != null) {
                            bundle.putString("extra_share_original_link", this.f81997U1.m136157j().f125481d);
                        }
                    } else if (!TextUtils.isEmpty(this.f81997U1.m136155h())) {
                        bundle.putSerializable("status", this.f81997U1.m136155h());
                    }
                    bundle.putBoolean("fromShareVia", true);
                    bundle.putBoolean("bol_back_to_source", this.f81977N1);
                    bundle.putBoolean("bol_auto_back_to_source", this.f81979O1);
                    bundle.putString("token", this.f81982P1);
                    str = this.f82047o2;
                    if (str != null) {
                        bundle.putString("extra_action_list_task_id", str);
                    }
                    bundle.putString("extra_tracking_source", this.f81964G2);
                    if (!this.f81966H2) {
                        m87494aP(UpdateStatusView.class, bundle, m92655aJ());
                    } else {
                        m87491ZO(UpdateStatusView.class, bundle);
                    }
                    m87503dP(2);
                    return;
                }
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(this.f81997U1.m136149b());
                bundle.putStringArrayList("path", arrayList);
                bundle.putBoolean("fromShareVia", true);
                bundle.putBoolean("bol_back_to_source", this.f81977N1);
                bundle.putBoolean("bol_auto_back_to_source", this.f81979O1);
                bundle.putString("token", this.f81982P1);
                str = this.f82047o2;
                if (str != null) {
                }
                bundle.putString("extra_tracking_source", this.f81964G2);
                if (!this.f81966H2) {
                }
                m87503dP(2);
                return;
            }
            if (id2 == AbstractC6918a0.share_story_view) {
                AbstractC2379w.m12430d(this.f82011Z0);
                m87569zN();
                m87503dP(3);
                return;
            }
            C17487o0 c17487o0 = null;
            if (id2 != AbstractC6918a0.share_one_group_view && id2 != AbstractC6918a0.share_group_view) {
                if (id2 == AbstractC6918a0.share_group_destination) {
                    AbstractC2379w.m12430d(this.f82011Z0);
                    AbstractC23647d.m123906p("13693");
                    AbstractC23647d.m123893c();
                    Bundle bundle2 = new Bundle();
                    ContactProfile contactProfile = this.f81962F2;
                    if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42358M0)) {
                        bundle2.putString("extra_preload_data", this.f81962F2.f42358M0);
                    }
                    bundle2.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
                    if (m92676n2() != null) {
                        c17487o0 = m92676n2().mo35579p();
                    }
                    C17487o0 c17487o02 = c17487o0;
                    if (c17487o02 != null) {
                        c17487o02.m93066i2(QuickCreateGroupView.class, bundle2, 12346, 1, true);
                    }
                    m87503dP(4);
                    return;
                }
                if (id2 == AbstractC6918a0.share_other_app) {
                    AbstractC2379w.m12430d(this.f82011Z0);
                    AbstractC23647d.m123897g("13694");
                    Intent m87438GN = m87438GN();
                    if (m87438GN != null && m87438GN.getType() != null) {
                        m92641HK(Intent.createChooser(m87438GN, m92652XI(AbstractC8020f0.share)));
                    }
                    m87503dP(5);
                    return;
                }
                return;
            }
            AbstractC2379w.m12430d(this.f82011Z0);
            AbstractC23647d.m123906p("13691");
            AbstractC23647d.m123893c();
            if (!m87443IN(false, true, false).isEmpty()) {
                C24559a.m127933c("[E2EE]", "forward msg to new group FAIL: Local file required!");
                mo70710wy(new Runnable() { // from class: nc0.n0
                    public /* synthetic */ RunnableC23712n0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareView.this.m87515hO();
                    }
                });
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putShort("SHORT_EXTRA_CREATE_SOURCE", (short) 3);
            bundle3.putString("extra_preload_data", QuickCreateGroupView.m83234GM(1, AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_group_title_create_group_to_share)));
            if (!TextUtils.isEmpty(this.f81991S1)) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(this.f81991S1);
                bundle3.putStringArrayList("STR_EXTRA_SELECTED_UIDS", arrayList2);
            }
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            }
            C17487o0 c17487o03 = c17487o0;
            if (c17487o03 != null) {
                c17487o03.m93066i2(QuickCreateGroupView.class, bundle3, 12346, 1, true);
            }
            m87503dP(4);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            RobotoEditText robotoEditText = this.f82011Z0;
            if (robotoEditText != null && robotoEditText.length() > 0) {
                this.f82011Z0.setText("");
                this.f82011Z0.requestFocus();
                return true;
            }
            AbstractC23647d.m123906p("13650");
            AbstractC23647d.m123893c();
            this.f81958D2 = true;
            AbstractC2379w.m12430d(this.f82011Z0);
            this.f81956C2 = false;
            FeedActionZUtils.m47534V(m92648SI(), this.f81982P1, 0, 0);
            if (this.f81979O1) {
                AbstractC23136l9.m118678T0((Activity) m92648SI());
                finish();
            } else if (this.f81977N1) {
                showDialog(3);
            } else {
                m87514hN();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 134 && AbstractC23034c6.m118121G()) {
            m87447JO();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            C23744a.m124114c().m124115b(this, 9);
            C23744a.m124114c().m124115b(this, 36);
            C23744a.m124114c().m124115b(this, 6072);
            C23744a.m124114c().m124115b(this, 6073);
            this.f82059u2.m133829m(new Runnable() { // from class: nc0.p0
                public /* synthetic */ RunnableC23716p0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShareView.this.m87567yO();
                }
            }, 50);
            if (m92676n2() instanceof Activity) {
                m92676n2().mo35554O(18);
            }
            if (this.f82006X1) {
                showDialog(4);
            }
            this.f82011Z0.requestFocus();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f82007X2 = System.currentTimeMillis() + 300;
    }

    @Override // com.zing.zalo.adapters.C7153n7.a
    /* renamed from: w */
    public void mo36380w(ContactProfile contactProfile) {
        AbstractC2379w.m12430d(this.f82011Z0);
        this.f81956C2 = false;
        m87452LN(contactProfile);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        MessageId m106047e;
        List list;
        int i12 = 0;
        try {
            if (i11 != 9) {
                if (i11 != 36) {
                    if (i11 != 6016) {
                        if (i11 != 6072) {
                            if (i11 == 6073 && !this.f81954B2) {
                                if (!C18644n.m98531l().m98559v()) {
                                    this.f81954B2 = true;
                                }
                                m87441HN(false);
                                return;
                            }
                            return;
                        }
                        for (ContactProfile contactProfile : new ArrayList(this.f81994T1.values())) {
                            if (contactProfile.m40374K0() && contactProfile.m40388T(false) == null) {
                                this.f81994T1.remove(contactProfile.f42434r);
                                int size = this.f81988R1.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        break;
                                    }
                                    if (((InviteContactProfile) this.f81988R1.get(size)).f42434r.equals(contactProfile.f42434r)) {
                                        this.f81988R1.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            }
                        }
                        m87441HN(false);
                        this.f82057t2.post(new Runnable() { // from class: nc0.e
                            public /* synthetic */ RunnableC23693e() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareView.this.m87487YN();
                            }
                        });
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_photo_post_story_successful));
                    finish();
                    return;
                }
                if (!this.f81952A2) {
                    if (C19669z.m103146Y().m103227q0()) {
                        this.f81952A2 = true;
                    }
                    m87441HN(false);
                    return;
                }
                return;
            }
            if (objArr != null && objArr.length > 0) {
                C20338d c20338d = (C20338d) objArr[0];
                if ((this.f82031g2 || this.f82033h2) && this.f82037j2 != null && !TextUtils.isEmpty(this.f82039k2)) {
                    C17945a0 m106046d = c20338d.m106046d();
                    if (m106046d == null || !m106046d.m95135f9(this.f82037j2) || !TextUtils.equals(this.f82039k2, m106046d.mo95039W2()) || this.f82015a2) {
                        return;
                    }
                    this.f82057t2.post(new Runnable() { // from class: nc0.c

                        /* renamed from: q */
                        public final /* synthetic */ C20338d f114752q;

                        public /* synthetic */ RunnableC23689c(C20338d c20338d2) {
                            r2 = c20338d2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareView.this.m87482WN(r2);
                        }
                    });
                    return;
                }
                if (this.f82035i2 && (m106047e = c20338d2.m106047e()) != null && m106047e.m41059z() && (list = this.f82027e2) != null) {
                    int size2 = list.size();
                    while (i12 < size2) {
                        if (((C17945a0) this.f82027e2.get(i12)).m95135f9(m106047e)) {
                            this.f82027e2.remove(i12);
                            this.f82029f2.remove(i12);
                            size2--;
                            i12--;
                        }
                        i12++;
                    }
                    this.f82057t2.post(new Runnable() { // from class: nc0.d

                        /* renamed from: q */
                        public final /* synthetic */ C20338d f114755q;

                        public /* synthetic */ RunnableC23691d(C20338d c20338d2) {
                            r2 = c20338d2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ShareView.this.m87485XN(r2);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 6016);
    }
}
