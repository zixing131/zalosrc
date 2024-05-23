package com.zing.zalo.camera;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0820h;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import androidx.window.layout.AbstractC2106h0;
import androidx.window.layout.AbstractC2128z;
import androidx.window.layout.C2104g0;
import androidx.window.layout.ExecutorC2100e0;
import androidx.window.layout.InterfaceC2120r;
import au.AbstractC2379w;
import b40.C2526d;
import bf.AbstractC2790b;
import cf.C3450a;
import cg.AbstractC3460h;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.camera.CameraEditorController;
import com.zing.zalo.camera.CameraPreviewController;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.filterpicker.FilterPickerView;
import com.zing.zalo.camera.gallerypicker.GalleryPickerContainer;
import com.zing.zalo.camera.gallerypicker.GalleryPickerMini;
import com.zing.zalo.camera.videos.videotrim.VideoTrimView;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposLyricStatus;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposeSongStatus;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.picker.AbstractC12670d;
import com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.DragCameraLayout;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.p077ui.widget.imageview.RedDotRoundedImageView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.PreviewUpdateAvatarView;
import com.zing.zalo.p077ui.zviews.PreviewUpdateCoverView;
import com.zing.zalo.p077ui.zviews.RotatableZaloView;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uicomponents.view.RecordButton;
import com.zing.zalo.uicontrol.Snackbar;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import et.C18607n;
import h40.AbstractC19849s1;
import hk.InterfaceC20079a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import im.C20610a;
import im.C20612c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import l30.C22052u;
import m90.EnumC22962a;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23112j7;
import me0.AbstractC23121k5;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23192r;
import me0.AbstractC23203s;
import me0.AbstractC23204s0;
import me0.AbstractC23222t7;
import me0.AbstractC23237v1;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import me0.AbstractC23280z4;
import me0.C23046d7;
import me0.C23081g9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nr.C23930c;
import org.json.JSONException;
import org.json.JSONObject;
import p100df.EnumC17910b;
import p205hc.C19964c;
import p207he.C20024r;
import p239ih.C20556f;
import p248iy.AbstractC20887g;
import p274jr.C21343a;
import p276jt.AbstractC21351f;
import p276jt.C21354i;
import p276jt.C21357l;
import p276jt.C21362q;
import p306ku.AbstractC21943a;
import p322lf.AbstractC22461b;
import p322lf.AbstractC22462c;
import p322lf.AbstractC22463d;
import p322lf.AbstractC22466g;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p413p2.C24609a;
import p458qr.C25482o;
import p490rp.AbstractC25952c;
import p493rt.C25977a;
import p500s1.C26087b;
import p509sp.C26359h;
import p524te.ViewOnClickListenerC26642c;
import p542ub.InterfaceC27218a;
import p545ue.C27239a;
import p546uf.InterfaceC27243b;
import p559uv.C27373c;
import p642xe.C29605a;
import p646xi.C29669a;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31986k3;
import p716zh.C32094r9;
import p716zh.C32123ta;
import p728zt.C32556e;
import re0.AbstractC25759a;
import tg.C26657h;
import th.AbstractC26681b;
import th.AbstractC26689j;
import th.C26694o;
import tv.AbstractC26897a;
import v00.AbstractC27418m;
import ve.AbstractC27985d;
import ve.C27989h;
import ve.RunnableC27991j;
import vg.AbstractC28025b8;
import vg.C28020b3;
import vg.C28139n5;
import vg.C28193t5;
import vg.C28208v2;
import xh0.C29639c0;
import xh0.C29667y;
import xh0.InterfaceC29634a;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zh0.AbstractC32212c;
import zl0.AbstractC32226c;

@SuppressLint({"DefaultLocale", "StringFormatInTimber"})
/* loaded from: classes3.dex */
public class ZaloCameraView extends RotatableZaloView implements ZaloView.InterfaceC17421f, C23744a.c, InterfaceC0733x, InterfaceC7732s2 {

    /* renamed from: J2 */
    private static final int[] f40824J2 = {0, 50, 50, 100};

    /* renamed from: K2 */
    public static int f40825K2 = AbstractC23222t7.f112591v0;

    /* renamed from: L2 */
    public static int f40826L2 = AbstractC23222t7.f112546Y;

    /* renamed from: M2 */
    public static final int f40827M2 = AbstractC23222t7.f112513A0;

    /* renamed from: N2 */
    public static final int[] f40828N2 = {3, 2};

    /* renamed from: O2 */
    public static final int[] f40829O2 = {7, 1};

    /* renamed from: P2 */
    public static final int[] f40830P2 = {4, 5};

    /* renamed from: Q2 */
    private static final int f40831Q2 = AbstractC23136l9.m118713h0();

    /* renamed from: R2 */
    private static final int f40832R2 = AbstractC19849s1.m103552d().y;

    /* renamed from: C2 */
    private int f40838C2;

    /* renamed from: H1 */
    private Animation f40847H1;

    /* renamed from: I1 */
    private Animation f40849I1;

    /* renamed from: J1 */
    private String f40851J1;

    /* renamed from: K1 */
    private GalleryPickerContainer f40852K1;

    /* renamed from: L1 */
    private AnimatorSet f40853L1;

    /* renamed from: M1 */
    private FilterPickerView f40854M1;

    /* renamed from: N1 */
    private Animator f40855N1;

    /* renamed from: R1 */
    private C29605a f40859R1;

    /* renamed from: T1 */
    private C29605a f40862T1;

    /* renamed from: U0 */
    private View f40863U0;

    /* renamed from: V0 */
    private View f40865V0;

    /* renamed from: W0 */
    private RecyclingImageView f40867W0;

    /* renamed from: X0 */
    private DragToCloseLayout f40869X0;

    /* renamed from: Y0 */
    private DragCameraLayout f40871Y0;

    /* renamed from: Z0 */
    private ImageDecorView f40873Z0;

    /* renamed from: Z1 */
    private FrameLayout f40874Z1;

    /* renamed from: a1 */
    private FrameLayout f40875a1;

    /* renamed from: a2 */
    private BackgroundPickerView f40876a2;

    /* renamed from: b1 */
    private ImageView f40877b1;

    /* renamed from: b2 */
    private FrameLayout f40878b2;

    /* renamed from: c1 */
    private Snackbar f40879c1;

    /* renamed from: c2 */
    private StickerPanelView f40880c2;

    /* renamed from: d1 */
    private CameraPreviewController f40881d1;

    /* renamed from: d2 */
    private Animator f40882d2;

    /* renamed from: e1 */
    private CameraEditorController f40883e1;

    /* renamed from: e2 */
    private Animator f40884e2;

    /* renamed from: f1 */
    private C29669a f40885f1;

    /* renamed from: f2 */
    private Animator f40886f2;

    /* renamed from: g1 */
    private InterfaceC20079a f40887g1;

    /* renamed from: g2 */
    private Animator f40888g2;

    /* renamed from: h1 */
    private C23528a f40889h1;

    /* renamed from: i2 */
    private C29605a f40892i2;

    /* renamed from: j1 */
    private Conversation f40893j1;

    /* renamed from: m2 */
    protected C23930c f40900m2;

    /* renamed from: p1 */
    private GestureDetector f40905p1;

    /* renamed from: p2 */
    private C24609a f40906p2;

    /* renamed from: r1 */
    private boolean f40909r1;

    /* renamed from: s2 */
    public SensitiveData f40912s2;

    /* renamed from: t2 */
    private long f40914t2;

    /* renamed from: y2 */
    private AbstractC32226c.b f40924y2;

    /* renamed from: T0 */
    private final Queue f40861T0 = new LinkedBlockingQueue();

    /* renamed from: i1 */
    private CameraInputParams f40891i1 = CameraInputParams.m39203m();

    /* renamed from: k1 */
    private int f40895k1 = 0;

    /* renamed from: l1 */
    public int f40897l1 = 1;

    /* renamed from: m1 */
    public int f40899m1 = 0;

    /* renamed from: n1 */
    private int f40901n1 = 2;

    /* renamed from: o1 */
    private int f40903o1 = 1;

    /* renamed from: q1 */
    private boolean f40907q1 = false;

    /* renamed from: s1 */
    private boolean f40911s1 = false;

    /* renamed from: t1 */
    private boolean f40913t1 = false;

    /* renamed from: u1 */
    private boolean f40915u1 = false;

    /* renamed from: v1 */
    private boolean f40917v1 = false;

    /* renamed from: w1 */
    private boolean f40919w1 = false;

    /* renamed from: x1 */
    private boolean f40921x1 = false;

    /* renamed from: y1 */
    private boolean f40923y1 = false;

    /* renamed from: z1 */
    public boolean f40925z1 = false;

    /* renamed from: A1 */
    public boolean f40833A1 = false;

    /* renamed from: B1 */
    public boolean f40835B1 = true;

    /* renamed from: C1 */
    public boolean f40837C1 = false;

    /* renamed from: D1 */
    public boolean f40839D1 = true;

    /* renamed from: E1 */
    private int f40841E1 = 0;

    /* renamed from: F1 */
    private int f40843F1 = -1;

    /* renamed from: G1 */
    private int f40845G1 = 0;

    /* renamed from: O1 */
    private boolean f40856O1 = false;

    /* renamed from: P1 */
    private boolean f40857P1 = false;

    /* renamed from: Q1 */
    private C29605a f40858Q1 = null;

    /* renamed from: S1 */
    private int f40860S1 = 100;

    /* renamed from: U1 */
    private long f40864U1 = -10;

    /* renamed from: V1 */
    public boolean f40866V1 = false;

    /* renamed from: W1 */
    private Animator f40868W1 = null;

    /* renamed from: X1 */
    private long f40870X1 = -10;

    /* renamed from: Y1 */
    private final C1761c0 f40872Y1 = new C1761c0(-10L);

    /* renamed from: h2 */
    private final int f40890h2 = AbstractC23222t7.f112542U - AbstractC23222t7.f112574n;

    /* renamed from: j2 */
    public boolean f40894j2 = false;

    /* renamed from: k2 */
    public boolean f40896k2 = false;

    /* renamed from: l2 */
    private Drawable f40898l2 = null;

    /* renamed from: n2 */
    private TrackingSource f40902n2 = new TrackingSource(0);

    /* renamed from: o2 */
    public long f40904o2 = 0;

    /* renamed from: q2 */
    private final C7541n0 f40908q2 = new C7541n0();

    /* renamed from: r2 */
    private boolean f40910r2 = false;

    /* renamed from: u2 */
    private final C21343a f40916u2 = new C21343a();

    /* renamed from: v2 */
    private final Handler f40918v2 = new HandlerC7534k(Looper.getMainLooper());

    /* renamed from: w2 */
    private final AbstractC19849s1.a f40920w2 = new AbstractC19849s1.a() { // from class: com.zing.zalo.camera.d3
        public /* synthetic */ C7588d3() {
        }

        @Override // h40.AbstractC19849s1.a
        /* renamed from: a */
        public final void mo39223a(int i11, int i12) {
            ZaloCameraView.this.m38786TR(i11, i12);
        }
    };

    /* renamed from: x2 */
    private boolean f40922x2 = false;

    /* renamed from: z2 */
    private final ImageDecorView.InterfaceC7828c f40926z2 = new C7526g();

    /* renamed from: A2 */
    private final ImageDecorView.InterfaceC7826a f40834A2 = new C7528h();

    /* renamed from: B2 */
    private final DragToCloseLayout.InterfaceC16432a f40836B2 = new C7542o();

    /* renamed from: D2 */
    private final Runnable f40840D2 = new RunnableC7547t();

    /* renamed from: E2 */
    private final int f40842E2 = AbstractC23136l9.m118742r(51.0f);

    /* renamed from: F2 */
    private final int f40844F2 = AbstractC23136l9.m118742r(61.0f);

    /* renamed from: G2 */
    public boolean f40846G2 = false;

    /* renamed from: H2 */
    private final DragCameraLayout.InterfaceC13495a f40848H2 = new C7553z();

    /* renamed from: I2 */
    private final GalleryPickerView.InterfaceC12681b f40850I2 = new C7519c0();

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$a */
    /* loaded from: classes3.dex */
    public class C7514a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f40927l1;

        /* renamed from: m1 */
        final /* synthetic */ C20612c f40928m1;

        C7514a(String str, C20612c c20612c) {
            this.f40927l1 = str;
            this.f40928m1 = c20612c;
        }

        /* renamed from: H3 */
        public /* synthetic */ void m39090H3(String str, String str2, C20612c c20612c) {
            String str3;
            boolean m137086M = AbstractC26689j.m137086M();
            if (c20612c != null) {
                str3 = c20612c.m107280d();
            } else {
                str3 = "";
            }
            AbstractC23112j7.m118522c0(str, str2, "", "", m137086M, str3, "chat_send", ZaloCameraView.this.f40904o2, C32094r9.m154848q(C31986k3.f147083a.m154105P1(str)));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.camera.n4.<init>(com.zing.zalo.camera.ZaloCameraView$a, java.lang.String, java.lang.String, im.c):void, class status: GENERATED_AND_UNLOADED
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
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(java.lang.String r3, com.androidquery.util.InterfaceC3968a r4, com.androidquery.util.C3979l r5, p379o3.C23995f r6) {
            /*
                r2 = this;
                r3 = 1
                if (r5 == 0) goto L30
                boolean r4 = r5.m18849m()
                if (r4 == 0) goto L30
                com.zing.zalo.camera.ZaloCameraView r4 = com.zing.zalo.camera.ZaloCameraView.this
                com.zing.zalo.data.chat.model.tabmessage.Conversation r4 = com.zing.zalo.camera.ZaloCameraView.m38738NN(r4)
                java.lang.String r4 = r4.f42893q
                java.lang.String r5 = r2.f40927l1
                ag0.b1 r6 = ag0.AbstractC0837p0.m2226g()
                im.c r0 = r2.f40928m1
                com.zing.zalo.camera.n4 r1 = new com.zing.zalo.camera.n4
                r1.<init>()
                r6.mo2040a(r1)
                nh.a r5 = p363nh.C23744a.m124114c()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r6 = 0
                r3[r6] = r4
                r4 = 145(0x91, float:2.03E-43)
                r5.m124116d(r4, r3)
                goto L48
            L30:
                int r4 = com.zing.zalo.AbstractC8020f0.str_invalid_image_camera_to_send
                java.lang.String r4 = me0.AbstractC23136l9.m118743r0(r4)
                com.zing.zalo.utils.ToastUtils.showMess(r3, r4)
                java.lang.String r3 = r2.f40927l1
                long r3 = me0.AbstractC23041d2.m118224w(r3)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r4 = 26029(0x65ad, float:3.6474E-41)
                p248iy.AbstractC20887g.m109240r(r4, r3)
            L48:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.camera.ZaloCameraView.C7514a.mo473O1(java.lang.String, com.androidquery.util.a, com.androidquery.util.l, o3.f):void");
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$a0 */
    /* loaded from: classes3.dex */
    public class C7515a0 extends AnimatorListenerAdapter {
        C7515a0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                super.onAnimationEnd(animator);
                if (ZaloCameraView.this.m92677nJ()) {
                    return;
                }
                ZaloCameraView.this.f40854M1.m39264H();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$b */
    /* loaded from: classes3.dex */
    public class C7516b extends AnimatorListenerAdapter {
        C7516b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ZaloCameraView.this.m38759PT(false, false);
            ZaloCameraView.this.m38843bU(true, false);
            if (C20024r.m103941j()) {
                ZaloCameraView.this.f40881d1.setPreviewRecordMode(2);
            }
            ZaloCameraView.this.f40881d1.m38579a3(ZaloCameraView.this.f40881d1.getPreviewRecordMode());
            ZaloCameraView.this.f40881d1.m38563O0(ZaloCameraView.this.f40881d1.getPreviewRecordMode(), true);
            ZaloCameraView.this.f40883e1.m38262a6();
            ZaloCameraView.this.f40881d1.m38567R0("tip.any");
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$b0 */
    /* loaded from: classes3.dex */
    public class C7517b0 extends AnimatorListenerAdapter {
        C7517b0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                super.onAnimationEnd(animator);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$c */
    /* loaded from: classes3.dex */
    public class C7518c extends AnimatorListenerAdapter {
        C7518c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            zaloCameraView.f88756W = 0;
            zaloCameraView.finish();
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$c0 */
    /* loaded from: classes3.dex */
    class C7519c0 implements GalleryPickerView.InterfaceC12681b {
        C7519c0() {
        }

        @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
        /* renamed from: dl */
        public void mo39091dl(Intent intent) {
            try {
                ZaloCameraView.this.m39041XT(false, 10);
                ZaloCameraView.this.m38785TQ(intent);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
        /* renamed from: y9 */
        public void mo39092y9() {
            try {
                ZaloCameraView.this.m38869fQ(true, new int[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$d */
    /* loaded from: classes3.dex */
    public class C7520d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f40935p;

        C7520d(boolean z11) {
            this.f40935p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            try {
                super.onAnimationCancel(animator);
                if (ZaloCameraView.this.f40882d2 != null && ZaloCameraView.this.f40882d2.equals(animator)) {
                    ZaloCameraView.this.f40882d2 = null;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0017, B:8:0x002d, B:10:0x0050, B:14:0x005c, B:16:0x0074, B:19:0x0081, B:20:0x0094, B:22:0x009c, B:25:0x008b), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAnimationEnd(Animator animator) {
            try {
                super.onAnimationEnd(animator);
                if (ZaloCameraView.this.f40882d2 != null && ZaloCameraView.this.f40882d2.equals(animator)) {
                    ZaloCameraView.this.f40882d2 = null;
                    ZaloCameraView.this.f40883e1.setAlpha(1.0f);
                    if (this.f40935p) {
                        ZaloCameraView.this.f40883e1.m38281j3(true);
                        ZaloCameraView.this.f40873Z0.m39791y0();
                        ZaloCameraView.this.f40873Z0.mo39680s();
                        if (ZaloCameraView.this.f40869X0 != null) {
                            ZaloCameraView.this.f40869X0.setDisableTouch(true);
                            return;
                        }
                        return;
                    }
                    ZaloCameraView.this.f40883e1.m38281j3(false);
                    ZaloCameraView.this.f40883e1.m38264c8(false, true);
                    if (AbstractC26689j.f126436b && ZaloCameraView.this.f40883e1.m38233K4()) {
                        ZaloCameraView.this.f40883e1.setVisibilityTopAndBottom(4);
                        if (ZaloCameraView.this.f40869X0 == null) {
                            ZaloCameraView.this.f40869X0.setDisableTouch(false);
                            return;
                        }
                        return;
                    }
                    AbstractC23136l9.m118744r1(ZaloCameraView.this.f40883e1, 4);
                    if (ZaloCameraView.this.f40869X0 == null) {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$d0 */
    /* loaded from: classes3.dex */
    public class C7521d0 extends AbstractC31727b {
        C7521d0() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            C31845ac.m152996J().m153047b0(ZaloCameraView.this.f40881d1.getEditStatus(), str, ZaloCameraView.this.f40881d1.getCurrentSizeDecor(), ZaloCameraView.this.f40881d1.f40741N0);
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            ZaloCameraView.this.m38911le(i11);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$e */
    /* loaded from: classes3.dex */
    public class RunnableC7522e implements Runnable {

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$e$a */
        /* loaded from: classes3.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ZaloCameraView zaloCameraView = ZaloCameraView.this;
                zaloCameraView.f88756W = 0;
                zaloCameraView.finish();
            }
        }

        RunnableC7522e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZaloCameraView.this.m92662fJ().m93094z(true);
                AnimatorSet animatorSet = new AnimatorSet();
                if (ZaloCameraView.this.f40891i1.m39214c() != null) {
                    ZaloCameraView.this.f40863U0.setPivotX(ZaloCameraView.this.f40891i1.m39214c().x);
                    ZaloCameraView.this.f40863U0.setPivotY(ZaloCameraView.this.f40891i1.m39214c().y);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ZaloCameraView.this.f40863U0, "scaleX", 0.0f), ObjectAnimator.ofFloat(ZaloCameraView.this.f40863U0, "scaleY", 0.0f), ObjectAnimator.ofFloat(ZaloCameraView.this.f40883e1, "alpha", 0.0f));
                } else {
                    animatorSet.play(ObjectAnimator.ofFloat(ZaloCameraView.this.f40863U0, "translationY", ZaloCameraView.this.f40863U0.getHeight()));
                }
                animatorSet.setInterpolator(new C26087b());
                animatorSet.setDuration(300L);
                animatorSet.addListener(new a());
                animatorSet.start();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
                ZaloCameraView.this.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$e0 */
    /* loaded from: classes3.dex */
    public class C7523e0 implements AbstractC23258x2.a {

        /* renamed from: a */
        final /* synthetic */ Intent f40940a;

        C7523e0(Intent intent) {
            this.f40940a = intent;
        }

        /* renamed from: c */
        public /* synthetic */ void m39095c(boolean z11, boolean z12, Intent intent) {
            ZaloCameraView.this.f40922x2 = false;
            if (m39097d()) {
                return;
            }
            if (!z11) {
                ToastUtils.m89266n(AbstractC8020f0.media_picker_image_full_dont_exist, new Object[0]);
            } else if (z12) {
                ZaloCameraView.this.m38840bR(intent);
            } else {
                ToastUtils.m89273u();
            }
        }

        @Override // me0.AbstractC23258x2.a
        /* renamed from: a */
        public void mo39096a(boolean z11, boolean z12) {
            if (((CommonZaloview) ZaloCameraView.this).f72827B0 != null) {
                ((CommonZaloview) ZaloCameraView.this).f72827B0.post(new Runnable() { // from class: com.zing.zalo.camera.z4

                    /* renamed from: q */
                    public final /* synthetic */ boolean f41818q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f41819r;

                    /* renamed from: s */
                    public final /* synthetic */ Intent f41820s;

                    public /* synthetic */ RunnableC7811z4(boolean z112, boolean z122, Intent intent) {
                        r2 = z112;
                        r3 = z122;
                        r4 = intent;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.C7523e0.this.m39095c(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: d */
        public boolean m39097d() {
            return !ZaloCameraView.this.m92674mJ();
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$f */
    /* loaded from: classes3.dex */
    public class C7524f implements C28193t5.b {
        C7524f() {
        }

        /* renamed from: e */
        public /* synthetic */ void m39099e(List list, AbstractC2790b abstractC2790b) {
            try {
                if (ZaloCameraView.this.f40883e1 != null) {
                    ZaloCameraView.this.f40883e1.setLocationFilter(list);
                    if (ZaloCameraView.this.f40891i1.m39212a() && AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, ZaloCameraView.f40830P2) && abstractC2790b != null && !ZaloCameraView.this.f40883e1.m38305z4()) {
                        AbstractC23309i.m121687Zp(abstractC2790b.f11109a);
                        ZaloCameraView.this.f40883e1.setLocationFilterIntro(abstractC2790b);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // vg.C28193t5.b
        /* renamed from: a */
        public void mo38388a() {
        }

        @Override // vg.C28193t5.b
        /* renamed from: b */
        public void mo38389b() {
        }

        @Override // vg.C28193t5.b
        /* renamed from: c */
        public void mo38390c(List list) {
            if (list != null && list.size() > 0) {
                ZaloCameraView.this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.o4

                    /* renamed from: q */
                    public final /* synthetic */ List f41411q;

                    /* renamed from: r */
                    public final /* synthetic */ AbstractC2790b f41412r;

                    public /* synthetic */ RunnableC7704o4(List list2, AbstractC2790b abstractC2790b) {
                        r2 = list2;
                        r3 = abstractC2790b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.C7524f.this.m39099e(r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$f0 */
    /* loaded from: classes3.dex */
    public class C7525f0 extends C23999j {
        C7525f0() {
        }

        /* renamed from: H3 */
        public /* synthetic */ void m39101H3(Bitmap bitmap) {
            ZaloCameraView.this.f40867W0.setImageBitmap(bitmap);
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    Bitmap m18839c = c3979l.m18839c();
                    if (m18839c != null) {
                        if (m18839c.getWidth() == 1 && m18839c.getHeight() == 1) {
                            return;
                        }
                        ZaloCameraView.this.f40867W0.post(new Runnable() { // from class: com.zing.zalo.camera.a5

                            /* renamed from: q */
                            public final /* synthetic */ Bitmap f41003q;

                            public /* synthetic */ RunnableC7560a5(Bitmap m18839c2) {
                                r2 = m18839c2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloCameraView.C7525f0.this.m39101H3(r2);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$g */
    /* loaded from: classes3.dex */
    class C7526g implements ImageDecorView.InterfaceC7828c {

        /* renamed from: a */
        Animator f40944a = null;

        C7526g() {
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: c */
        public void mo39102c() {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38270f3();
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: d */
        public void mo39103d(AbstractC21351f abstractC21351f) {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38294t6(abstractC21351f);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: e */
        public void mo39104e(boolean z11) {
            if (z11 && (ZaloCameraView.this.m39071qR() || ZaloCameraView.this.m39073rR() || ZaloCameraView.this.m39065nR())) {
                ZaloCameraView.this.f40869X0.setCanInterceptTouch(false);
            } else {
                ZaloCameraView.this.f40869X0.setCanInterceptTouch(z11);
            }
            ZaloCameraView.this.f40871Y0.setCanInterceptTouch(z11);
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: f */
        public void mo39105f(AbstractC21351f abstractC21351f) {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38255W5(abstractC21351f);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: g */
        public void mo39106g(boolean z11) {
            if (z11 != ZaloCameraView.this.f40917v1) {
                ZaloCameraView.this.f40917v1 = z11;
                ZaloCameraView.this.m38855dR();
                Animator animator = this.f40944a;
                if (animator != null && animator.isRunning()) {
                    this.f40944a.cancel();
                }
                if (z11) {
                    ZaloCameraView.this.f40877b1.setEnabled(true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ZaloCameraView.this.f40877b1, "scaleX", 1.5f), ObjectAnimator.ofFloat(ZaloCameraView.this.f40877b1, "scaleY", 1.5f));
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                    this.f40944a = animatorSet;
                    C23081g9.m118410g(30L);
                    return;
                }
                ZaloCameraView.this.f40877b1.setEnabled(false);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(ZaloCameraView.this.f40877b1, "scaleX", 1.0f), ObjectAnimator.ofFloat(ZaloCameraView.this.f40877b1, "scaleY", 1.0f));
                animatorSet2.setDuration(200L);
                animatorSet2.start();
                this.f40944a = animatorSet2;
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: h */
        public void mo39107h(AbstractC21351f abstractC21351f) {
            if (abstractC21351f instanceof C21357l) {
                ZaloCameraView.this.m39070pU("text_trash");
            } else if (abstractC21351f instanceof C21354i) {
                ZaloCameraView.this.m39070pU("sticker_trash");
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: i */
        public void mo39108i() {
            C23081g9.m118410g(30L);
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: j */
        public void mo39109j(boolean z11) {
            if (z11 && ZaloCameraView.this.f40883e1 != null) {
                boolean m38229J4 = ZaloCameraView.this.f40883e1.m38229J4();
                boolean m38236L4 = ZaloCameraView.this.f40883e1.m38236L4();
                if (m38229J4 || m38236L4) {
                    return;
                }
            }
            ZaloCameraView.this.f40869X0.setCanInterceptTouch(!z11);
            ZaloCameraView.this.f40871Y0.setCanInterceptTouch(!z11);
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38257Y2();
            }
            ZaloCameraView.this.m38855dR();
            if (z11) {
                if (ZaloCameraView.this.f40847H1 == null) {
                    ZaloCameraView.this.f40847H1 = new AlphaAnimation(0.0f, 1.0f);
                    ZaloCameraView.this.f40847H1.setStartOffset(200L);
                    ZaloCameraView.this.f40847H1.setDuration(200L);
                    ZaloCameraView.this.f40847H1.setInterpolator(new LinearInterpolator());
                }
                ZaloCameraView.this.f40877b1.startAnimation(ZaloCameraView.this.f40847H1);
                AbstractC23136l9.m118744r1(ZaloCameraView.this.f40877b1, 0);
                ZaloCameraView.this.m39038VT(false, new int[0]);
                if (ZaloCameraView.this.f40883e1 != null) {
                    if (AbstractC26689j.f126436b) {
                        ZaloCameraView.this.f40883e1.m38267d8(false);
                    }
                    ZaloCameraView.this.m38759PT(false, true);
                }
                if (ZaloCameraView.this.f40881d1 != null) {
                    ZaloCameraView.this.m38843bU(false, true);
                    ZaloCameraView.this.f40881d1.m38568S0();
                    return;
                }
                return;
            }
            ZaloCameraView.this.f40877b1.clearAnimation();
            AbstractC23136l9.m118744r1(ZaloCameraView.this.f40877b1, 8);
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (zaloCameraView.f40897l1 == 1 && zaloCameraView.f40881d1 != null) {
                ZaloCameraView.this.m38843bU(true, true);
            } else if (ZaloCameraView.this.f40883e1 != null && !ZaloCameraView.this.f40883e1.m38226I4()) {
                ZaloCameraView.this.m38759PT(true, true);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: k */
        public void mo39110k(AbstractC21351f abstractC21351f) {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38254V5(abstractC21351f);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: l */
        public void mo39111l(MotionEvent motionEvent) {
            if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40780p0) {
                return;
            }
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38227I6();
            }
            if (ZaloCameraView.this.f40883e1 != null && ZaloCameraView.this.f40883e1.m38290s4() && ZaloCameraView.this.f40883e1.m38229J4()) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        ZaloCameraView.this.m38759PT(true, true);
                        return;
                    }
                    return;
                }
                ZaloCameraView.this.f40883e1.m38220E7();
                ZaloCameraView.this.m38759PT(false, true);
                return;
            }
            if (ZaloCameraView.this.f40882d2 != null && ZaloCameraView.this.f40882d2.isRunning()) {
                ZaloCameraView.this.f40882d2.end();
                if (ZaloCameraView.this.f40883e1 != null && ZaloCameraView.this.f40883e1.getVisibility() != 0) {
                    ZaloCameraView.this.m38759PT(true, false);
                }
            }
            if (ZaloCameraView.this.f40905p1 != null) {
                ZaloCameraView.this.f40905p1.onTouchEvent(motionEvent);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$g0 */
    /* loaded from: classes3.dex */
    public class C7527g0 extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7537l0 f40946a;

        C7527g0(InterfaceC7537l0 interfaceC7537l0) {
            this.f40946a = interfaceC7537l0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            InterfaceC7537l0 interfaceC7537l0;
            for (C29605a c29605a : C7960e.m41971c6().m42367d5(AbstractC23309i.m121043Ia())) {
                if (AbstractC25759a.m132893a(c29605a)) {
                    ZaloCameraView.this.f40892i2 = c29605a;
                    InterfaceC7537l0 interfaceC7537l02 = this.f40946a;
                    if (interfaceC7537l02 != null) {
                        interfaceC7537l02.mo39121b();
                        return;
                    }
                    return;
                }
            }
            if (ZaloCameraView.this.f40892i2 == null && (interfaceC7537l0 = this.f40946a) != null) {
                interfaceC7537l0.mo39120a();
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$h */
    /* loaded from: classes3.dex */
    public class C7528h implements ImageDecorView.InterfaceC7826a {

        /* renamed from: a */
        float f40948a = 0.0f;

        C7528h() {
        }

        /* renamed from: f */
        public /* synthetic */ void m39113f() {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38248S6();
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7826a
        /* renamed from: a */
        public void mo39114a() {
            Rect rect = new Rect(0, 0, 0, 0);
            rect.right = AbstractC23136l9.m118722k0() / 4;
            rect.bottom = ZaloCameraView.f40831Q2 / 6;
            rect.offset((ZaloCameraView.this.f40873Z0.getWidth() - rect.right) / 2, AbstractC23222t7.f112586t);
            ZaloCameraView.this.f40873Z0.setDeleteArea(rect);
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7826a
        /* renamed from: b */
        public void mo39115b() {
            try {
                if (ZaloCameraView.this.f40873Z0 == null) {
                    return;
                }
                mo39114a();
                if (ZaloCameraView.this.f40911s1) {
                    ZaloCameraView.this.m38876gQ();
                    ZaloCameraView.this.f40911s1 = false;
                }
                if (!TextUtils.isEmpty(ZaloCameraView.this.f40851J1)) {
                    try {
                        ZaloCameraView.this.f40851J1 = null;
                        ZaloCameraView zaloCameraView = ZaloCameraView.this;
                        if (zaloCameraView.f40897l1 == 2) {
                            zaloCameraView.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.p4
                                public /* synthetic */ RunnableC7710p4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloCameraView.C7528h.this.m39113f();
                                }
                            });
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("ZaloCameraView", e11);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("ZaloCameraView", e12);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7826a
        /* renamed from: c */
        public void mo39116c() {
            if (ZaloCameraView.this.f40883e1 != null) {
                ZaloCameraView.this.f40883e1.m38257Y2();
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7826a
        /* renamed from: d */
        public void mo39117d(float f11, boolean z11) {
            try {
                if (ZaloCameraView.this.f40881d1 == null) {
                    return;
                }
                ZaloCameraView zaloCameraView = ZaloCameraView.this;
                if (zaloCameraView.f40897l1 != 2 && zaloCameraView.f40881d1.f40752T.mo147380k()) {
                    if (z11) {
                        this.f40948a = 0.0f;
                    }
                    if (f11 == -1.0f) {
                        return;
                    }
                    ZaloCameraView.this.f40881d1.f40752T.mo147371b(false);
                    int mo147379j = ZaloCameraView.this.f40881d1.f40752T.mo147379j();
                    if (((!ZaloCameraView.this.f40881d1.f40769f0 && f11 > this.f40948a) || (ZaloCameraView.this.f40881d1.f40769f0 && f11 < this.f40948a)) && Math.abs(f11 - this.f40948a) > 5.0f) {
                        if (ZaloCameraView.this.f40841E1 < mo147379j) {
                            ZaloCameraView.this.f40841E1++;
                        }
                    } else if (((!ZaloCameraView.this.f40881d1.f40769f0 && f11 < this.f40948a) || (ZaloCameraView.this.f40881d1.f40769f0 && f11 > this.f40948a)) && Math.abs(f11 - this.f40948a) > 5.0f && ZaloCameraView.this.f40841E1 > 0) {
                        ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                        zaloCameraView2.f40841E1--;
                    }
                    this.f40948a = f11;
                    ZaloCameraView.this.f40881d1.f40752T.mo147386q(ZaloCameraView.this.f40841E1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7826a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onConfigurationChanged(Configuration configuration) {
            long j11;
            boolean z11;
            AbstractC20110a.m104543l("ZaloCameraView").mo104554k("View#onConfigurationChanged", new Object[0]);
            ZaloCameraView.this.f40918v2.removeMessages(1);
            Message message = new Message();
            message.what = 1;
            message.arg1 = AbstractC32212c.m155331a(ZaloCameraView.this.m92648SI());
            if (ZaloCameraView.this.f40910r2) {
                j11 = ZaloCameraView.this.f40881d1.f40762Z0 + 100;
                ZaloCameraView.this.f40910r2 = false;
            } else {
                j11 = 0;
            }
            if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40769f0) {
                if (ZaloCameraView.this.m38971uR()) {
                    ZaloCameraView.this.f40881d1.m38566Q2(true);
                    j11 = ZaloCameraView.this.f40881d1.f40762Z0 + 100;
                } else {
                    AbstractC20110a.m104544m("skip handle OrientationChanged due to isRecordingVideo", new Object[0]);
                    z11 = true;
                    AbstractC20110a.m104543l("ZaloCameraView").mo104554k("delayMillis: %d", Long.valueOf(j11));
                    if (z11) {
                        ZaloCameraView.this.f40918v2.sendMessageDelayed(message, j11);
                        return;
                    }
                    return;
                }
            }
            z11 = false;
            AbstractC20110a.m104543l("ZaloCameraView").mo104554k("delayMillis: %d", Long.valueOf(j11));
            if (z11) {
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$h0 */
    /* loaded from: classes3.dex */
    public class C7529h0 implements InterfaceC7537l0 {

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$h0$a */
        /* loaded from: classes3.dex */
        class a implements InterfaceC7537l0 {
            a() {
            }

            @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
            /* renamed from: a */
            public void mo39120a() {
                ZaloCameraView.this.mo49315c4();
                ToastUtils.m89266n(AbstractC8020f0.str_error_loading_quick_access_filter, new Object[0]);
            }

            @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
            /* renamed from: b */
            public void mo39121b() {
                ZaloCameraView.this.mo49315c4();
                ZaloCameraView.this.m38724LP();
            }
        }

        C7529h0() {
        }

        /* renamed from: d */
        public /* synthetic */ void m39119d() {
            ZaloCameraView.this.m38842bT(AbstractC23309i.m121043Ia(), ZaloCameraView.this.f40892i2, ZaloCameraView.this.f40896k2);
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: a */
        public void mo39120a() {
            ZaloCameraView.this.mo78950cq("");
            ZaloCameraView.this.m38897jQ(new a());
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: b */
        public void mo39121b() {
            ZaloCameraView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.b5
                public /* synthetic */ RunnableC7567b5() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.C7529h0.this.m39119d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$i */
    /* loaded from: classes3.dex */
    public class C7530i implements CameraPreviewController.InterfaceC7513q {

        /* renamed from: a */
        private final C27989h.a f40952a = new C27989h.a() { // from class: com.zing.zalo.camera.q4
            public /* synthetic */ C7722q4() {
            }

            @Override // ve.C27989h.a
            /* renamed from: a */
            public final void mo39367a(Bitmap bitmap) {
                ZaloCameraView.C7530i.this.m39125o(bitmap);
            }
        };

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$i$a */
        /* loaded from: classes3.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                try {
                    if (!ZaloCameraView.this.mo60294yp()) {
                        ZaloCameraView.this.m38732MP(2);
                        ZaloCameraView.this.m38843bU(false, false);
                        ZaloCameraView.this.m38759PT(true, true);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
            }
        }

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$i$b */
        /* loaded from: classes3.dex */
        class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ boolean f40955p;

            /* renamed from: q */
            final /* synthetic */ String f40956q;

            b(boolean z11, String str) {
                this.f40955p = z11;
                this.f40956q = str;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean z11;
                try {
                    if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40752T != null) {
                        if (this.f40955p && ZaloCameraView.this.f40881d1.f40752T.mo147377h()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ZaloCameraView.this.m38744NT(this.f40956q, 0, 0, z11, false, true);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
            }
        }

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$i$c */
        /* loaded from: classes3.dex */
        class c extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C32123ta f40958a;

            c(C32123ta c32123ta) {
                this.f40958a = c32123ta;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e m41971c6 = C7960e.m41971c6();
                String str = CoreUtility.f89233i;
                C32123ta c32123ta = this.f40958a;
                m41971c6.m42074B8(str, c32123ta.f148138h, c32123ta.m155082i0().toString(), 1, this.f40958a.f148157w);
                C22052u.m115085y().m115096p(this.f40958a);
                C22052u.m115085y().m115101u();
                C22052u.m115085y().m115091U(this.f40958a);
                if (ZaloCameraView.this.m92655aJ() == 12345) {
                    C23744a.m124114c().m124116d(6016, new Object[0]);
                }
                C23744a.m124114c().m124116d(28, 0);
                ZaloCameraView.this.m38893iU();
            }
        }

        C7530i() {
        }

        /* renamed from: o */
        public /* synthetic */ void m39125o(Bitmap bitmap) {
            if (bitmap != null) {
                ZaloCameraView.this.m38727LS(bitmap);
            }
        }

        /* renamed from: p */
        public /* synthetic */ void m39126p() {
            try {
                ZaloCameraView.this.f40869X0.setDisableTouch(false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        /* renamed from: q */
        public static /* synthetic */ String m39127q(C32123ta c32123ta) {
            return "uploadStoryItem from preview camera: url=" + c32123ta.f148147m + " id=" + c32123ta.f148138h;
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: a */
        public void mo38641a(boolean z11) {
            AbstractC23237v1.m119713a("camera-open");
            AbstractC23237v1.m119713a("switchCamera");
            if (ZaloCameraView.this.f40923y1) {
                return;
            }
            try {
                ZaloCameraView.this.m39060lT(true);
                if (z11) {
                    if (ZaloCameraView.this.f40891i1.f41120m0 == null) {
                        ZaloCameraView.this.m38864eT();
                    } else {
                        ZaloCameraView zaloCameraView = ZaloCameraView.this;
                        zaloCameraView.m38711JQ(zaloCameraView.f40891i1.f41120m0);
                        ZaloCameraView.this.f40891i1.f41120m0 = null;
                    }
                }
                m39128n();
            } catch (Throwable th2) {
                AbstractC23350e.m122776f("ZaloCameraView", th2);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: b */
        public void mo38642b(C32123ta c32123ta) {
            if (c32123ta != null) {
                c32123ta.m155081h0(ZaloCameraView.this.f40902n2);
                ZaloCameraView.this.mo50035CK(-1, new Intent());
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: com.zing.zalo.camera.r4
                    public /* synthetic */ C7728r4() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m39127q;
                        m39127q = ZaloCameraView.C7530i.m39127q(C32123ta.this);
                        return m39127q;
                    }
                });
                C0824j.m2153b(new c(c32123ta));
                C25482o.f122075a.m132013u(c32123ta.f148140i, ZaloCameraView.this.f40914t2);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: c */
        public void mo38643c(byte[] bArr, int i11) {
            boolean z11;
            try {
                int m83785iM = ZaloCameraView.this.m83785iM();
                ZaloCameraView.this.m38732MP(2);
                if (bArr != null) {
                    if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40752T != null) {
                        z11 = ZaloCameraView.this.f40881d1.f40752T.mo147377h();
                    } else {
                        z11 = false;
                    }
                    new RunnableC27991j(ZaloCameraView.this.f40873Z0, bArr, i11, z11, this.f40952a).m141025d();
                } else {
                    AbstractC27985d.m140993j(ZaloCameraView.this.f40873Z0, ZaloCameraView.this.f40891i1.f41087F, m83785iM, this.f40952a);
                }
                if (bArr != null) {
                    C29667y.m147458p().m147474O();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: d */
        public void mo38644d(View view) {
            if (view.getId() == AbstractC6918a0.btn_back_cam && !ZaloCameraView.this.m39010BS()) {
                ZaloCameraView.this.m38835aT();
                ZaloCameraView.this.m39061lU("120N001");
                if (ZaloCameraView.this.f40869X0 == null || ZaloCameraView.this.f40869X0.getTranslationY() != 0.0f) {
                    ZaloCameraView.this.m38674EC(false);
                    return;
                }
                ZaloCameraView zaloCameraView = ZaloCameraView.this;
                if (zaloCameraView.f88756W == 0) {
                    zaloCameraView.f88756W = 1;
                }
                zaloCameraView.finish();
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: e */
        public void mo38645e(boolean z11, boolean z12) {
            if (ZaloCameraView.this.f40869X0 != null) {
                ZaloCameraView.this.f40869X0.setDisableTouch(z11);
            }
            if (ZaloCameraView.this.f40871Y0 != null && z12) {
                ZaloCameraView.this.f40871Y0.setDisableTouch(z11);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: f */
        public void mo38646f() {
            try {
                if (ZaloCameraView.this.m39071qR()) {
                    ZaloCameraView.this.f40854M1.m39264H();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00ac A[Catch: Exception -> 0x002c, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0012, B:11:0x00ac, B:12:0x00b3, B:14:0x00ba, B:15:0x014f, B:18:0x00cf, B:20:0x00f3, B:22:0x00ff, B:24:0x0105, B:25:0x010d, B:26:0x011f, B:28:0x0127, B:31:0x0133, B:34:0x0144, B:75:0x00a3, B:84:0x016b, B:87:0x0175, B:89:0x0181, B:90:0x0187, B:92:0x019d, B:93:0x01b6, B:94:0x01bb), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00ba A[Catch: Exception -> 0x002c, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0012, B:11:0x00ac, B:12:0x00b3, B:14:0x00ba, B:15:0x014f, B:18:0x00cf, B:20:0x00f3, B:22:0x00ff, B:24:0x0105, B:25:0x010d, B:26:0x011f, B:28:0x0127, B:31:0x0133, B:34:0x0144, B:75:0x00a3, B:84:0x016b, B:87:0x0175, B:89:0x0181, B:90:0x0187, B:92:0x019d, B:93:0x01b6, B:94:0x01bb), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: Exception -> 0x002c, TryCatch #3 {Exception -> 0x002c, blocks: (B:6:0x0012, B:11:0x00ac, B:12:0x00b3, B:14:0x00ba, B:15:0x014f, B:18:0x00cf, B:20:0x00f3, B:22:0x00ff, B:24:0x0105, B:25:0x010d, B:26:0x011f, B:28:0x0127, B:31:0x0133, B:34:0x0144, B:75:0x00a3, B:84:0x016b, B:87:0x0175, B:89:0x0181, B:90:0x0187, B:92:0x019d, B:93:0x01b6, B:94:0x01bb), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo38647g(String str, boolean z11, boolean z12) {
            long j11;
            MediaMetadataRetriever mediaMetadataRetriever;
            IOException iOException;
            AbstractC20110a.b m104543l;
            boolean z13;
            Map m138617c;
            boolean z14;
            try {
                if (!z12) {
                    if (str == null) {
                        AbstractC20110a.m104544m("onReallyStopVideoRecording: outputPath is not available", new Object[0]);
                        AbstractC20887g.m109233k(CoreUtility.f89233i, 21003, "", 0L, 21000, CoreUtility.f89236l);
                        j11 = 0;
                    } else {
                        try {
                            m138617c = AbstractC26897a.m138617c(str);
                        } catch (Exception e11) {
                            try {
                                AbstractC23350e.m122776f("ZaloCameraView", e11);
                            } catch (Exception e12) {
                                e = e12;
                                j11 = 0;
                                AbstractC23350e.m122776f("ZaloCameraView", e);
                                z13 = true;
                                if (j11 > 0) {
                                }
                                ZaloCameraView.this.m38720KT();
                                if (!z13) {
                                }
                                ZaloCameraView.this.f40883e1.m38230J5();
                                ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                                ZaloCameraView.this.f40883e1.m38302x8();
                                return;
                            }
                        }
                        if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                            String str2 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                            Objects.requireNonNull(str2);
                            j11 = Long.parseLong(str2);
                            if (j11 == 0) {
                                try {
                                    mediaMetadataRetriever = new MediaMetadataRetriever();
                                    try {
                                        try {
                                            mediaMetadataRetriever.setDataSource(str);
                                            j11 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                                            AbstractC20110a.m104544m("stopVideoRecording: get video duration again= %s", Long.valueOf(j11));
                                        } finally {
                                        }
                                    } catch (Exception e13) {
                                        AbstractC23350e.m122776f("ZaloCameraView", e13);
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (IOException e14) {
                                            iOException = e14;
                                            m104543l = AbstractC20110a.m104543l("ZaloCameraView");
                                            m104543l.mo104552e(iOException);
                                            z13 = false;
                                            if (j11 > 0) {
                                            }
                                            ZaloCameraView.this.m38720KT();
                                            if (!z13) {
                                            }
                                            ZaloCameraView.this.f40883e1.m38230J5();
                                            ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                                            ZaloCameraView.this.f40883e1.m38302x8();
                                            return;
                                        }
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    AbstractC23350e.m122776f("ZaloCameraView", e);
                                    z13 = true;
                                    if (j11 > 0) {
                                    }
                                    ZaloCameraView.this.m38720KT();
                                    if (!z13) {
                                    }
                                    ZaloCameraView.this.f40883e1.m38230J5();
                                    ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                                    ZaloCameraView.this.f40883e1.m38302x8();
                                    return;
                                }
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (IOException e16) {
                                    iOException = e16;
                                    m104543l = AbstractC20110a.m104543l("ZaloCameraView");
                                    m104543l.mo104552e(iOException);
                                    z13 = false;
                                    if (j11 > 0) {
                                    }
                                    ZaloCameraView.this.m38720KT();
                                    if (!z13) {
                                    }
                                    ZaloCameraView.this.f40883e1.m38230J5();
                                    ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                                    ZaloCameraView.this.f40883e1.m38302x8();
                                    return;
                                }
                            }
                            z13 = false;
                            if (j11 > 0) {
                                ZaloCameraView.this.f40900m2.m125231M0(2, j11);
                            }
                            ZaloCameraView.this.m38720KT();
                            if (!z13) {
                                ZaloCameraView.this.m38805WP();
                                ZaloCameraView.this.f40883e1.setEditorRecordMode(ZaloCameraView.this.f40881d1.getPreviewRecordMode());
                                if (!ZaloCameraView.this.f40883e1.isShown()) {
                                    if (ZaloCameraView.this.f40881d1.m38588l1()) {
                                        ZaloCameraView zaloCameraView = ZaloCameraView.this;
                                        if (zaloCameraView.f40899m1 == 2) {
                                            zaloCameraView.f40883e1.setEditorRecordMode(3);
                                        }
                                    }
                                    AnimatorSet m38807WS = ZaloCameraView.this.m38807WS();
                                    m38807WS.addListener(new b(z11, str));
                                    m38807WS.start();
                                } else if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40752T != null) {
                                    if (z11 && ZaloCameraView.this.f40881d1.f40752T.mo147377h()) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    ZaloCameraView.this.m38744NT(str, 0, 0, z14, false, true);
                                }
                            } else {
                                ZaloCameraView.this.f40883e1.setIsWaitingForVideo(false);
                                ZaloCameraView.this.mo49315c4();
                                ZaloCameraView.this.m38667CS();
                            }
                            ZaloCameraView.this.f40883e1.m38230J5();
                            ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                            ZaloCameraView.this.f40883e1.m38302x8();
                            return;
                        }
                        j11 = 0;
                        if (j11 == 0) {
                        }
                        z13 = false;
                        if (j11 > 0) {
                        }
                        ZaloCameraView.this.m38720KT();
                        if (!z13) {
                        }
                        ZaloCameraView.this.f40883e1.m38230J5();
                        ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                        ZaloCameraView.this.f40883e1.m38302x8();
                        return;
                    }
                    z13 = true;
                    if (j11 > 0) {
                    }
                    ZaloCameraView.this.m38720KT();
                    if (!z13) {
                    }
                    ZaloCameraView.this.f40883e1.m38230J5();
                    ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                    ZaloCameraView.this.f40883e1.m38302x8();
                    return;
                }
                if (ZaloCameraView.this.f40883e1 != null && str != null) {
                    if (ZaloCameraView.this.f40883e1.isShown()) {
                        ZaloCameraView.this.m38862eQ();
                    } else {
                        ZaloCameraView.this.f40883e1.m38269e3();
                        ZaloCameraView.this.m38759PT(false, false);
                        if (ZaloCameraView.this.f40869X0 != null) {
                            ZaloCameraView.this.f40869X0.setDisableTouch(true);
                            ZaloCameraView.this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.s4
                                public /* synthetic */ RunnableC7734s4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZaloCameraView.C7530i.this.m39126p();
                                }
                            }, 1000L);
                        }
                        ZaloCameraView.this.m38843bU(true, false);
                    }
                }
                ZaloCameraView.this.m39076tU();
            } catch (Exception e17) {
                AbstractC23350e.m122776f("ZaloCameraView", e17);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: h */
        public void mo38648h(boolean z11, boolean z12) {
            ZaloCameraView.this.m38843bU(z11, z12);
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: i */
        public void mo38649i(boolean z11) {
            if (ZaloCameraView.this.f40883e1 == null) {
                return;
            }
            if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 4)) {
                ZaloCameraView.this.f40883e1.m38284n8(2);
            } else if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 5)) {
                ZaloCameraView.this.f40883e1.m38284n8(3);
            } else {
                ZaloCameraView.this.f40883e1.m38284n8(!z11 ? 1 : 0);
            }
        }

        @Override // com.zing.zalo.camera.CameraPreviewController.InterfaceC7513q
        /* renamed from: j */
        public void mo38650j(boolean z11) {
            if (!z11) {
                try {
                    ZaloCameraView.this.m38720KT();
                    ZaloCameraView.this.f40883e1.setEditorRecordMode(ZaloCameraView.this.f40881d1.getPreviewRecordMode());
                    ZaloCameraView.this.f40883e1.setEditingMediaType(2);
                    ZaloCameraView.this.f40883e1.m38237L5();
                    ZaloCameraView.this.f40883e1.m38302x8();
                    ZaloCameraView.this.f40883e1.setIsWaitingForVideo(true);
                    AnimatorSet m38807WS = ZaloCameraView.this.m38807WS();
                    m38807WS.addListener(new a());
                    m38807WS.start();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
            }
        }

        /* renamed from: n */
        void m39128n() {
            boolean z11;
            boolean z12;
            int m83785iM = ZaloCameraView.this.m83785iM();
            if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 7) && (ZaloCameraView.this.f40881d1.getPreviewRecordMode() == 2 || ZaloCameraView.this.f40881d1.getPreviewRecordMode() == 3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!ZaloCameraView.this.m39078vR() && (m83785iM == 0 || m83785iM == 180)) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean m118128N = AbstractC23034c6.m118128N();
            if (z11) {
                ZaloCameraView zaloCameraView = ZaloCameraView.this;
                if (zaloCameraView.f40897l1 != 2 && z12) {
                    if (!zaloCameraView.m39073rR()) {
                        ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                        if (!zaloCameraView2.f40835B1 && zaloCameraView2.f40881d1 != null && !ZaloCameraView.this.f40881d1.f40769f0 && m118128N) {
                            if (ZaloCameraView.this.f40881d1.f40730I == null || !ZaloCameraView.this.f40881d1.f40730I.isShown()) {
                                ZaloCameraView.this.m39041XT(true, new int[0]);
                                return;
                            }
                            return;
                        }
                    }
                    if (ZaloCameraView.this.m39071qR()) {
                        ZaloCameraView.this.m38833aR();
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$i0 */
    /* loaded from: classes3.dex */
    public class C7531i0 implements InterfaceC7537l0 {
        C7531i0() {
        }

        /* renamed from: d */
        public /* synthetic */ void m39130d() {
            ZaloCameraView.this.m38842bT(AbstractC23309i.m121043Ia(), ZaloCameraView.this.f40892i2, ZaloCameraView.this.f40896k2);
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: a */
        public void mo39120a() {
            ToastUtils.m89266n(AbstractC8020f0.str_error_loading_quick_access_filter, new Object[0]);
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: b */
        public void mo39121b() {
            ZaloCameraView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.c5
                public /* synthetic */ RunnableC7574c5() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.C7531i0.this.m39130d();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$j */
    /* loaded from: classes3.dex */
    public class C7532j extends AnimatorListenerAdapter {
        C7532j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ZaloCameraView.this.m38732MP(2);
            ZaloCameraView.this.f40881d1.m38570U0();
            ZaloCameraView.this.m38759PT(true, false);
            ZaloCameraView.this.m38843bU(false, false);
            ZaloCameraView.this.f40883e1.m38299x2();
            AbstractC23237v1.m119714b("capture", "end showEditorController");
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$j0 */
    /* loaded from: classes3.dex */
    public class C7533j0 implements FilterPickerView.InterfaceC7604c {
        C7533j0() {
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: b */
        public void mo39131b(int i11) {
            if (ZaloCameraView.this.f40871Y0 != null) {
                ZaloCameraView.this.f40871Y0.setPickerMiniY(i11);
            }
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: c */
        public boolean mo39132c() {
            return ZaloCameraView.this.m39009BR();
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: d */
        public void mo39133d() {
            ZaloCameraView.this.m38826ZQ();
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: e */
        public void mo39134e(String str, boolean z11) {
            String str2;
            if (!str.equals("filter_thumbnail") && !str.equals("filter_arrow_down")) {
                ZaloCameraView.this.m39070pU(str);
                return;
            }
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (z11) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            zaloCameraView.m39072qU(str, str2);
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: f */
        public void mo39135f(boolean z11) {
            ZaloCameraView.this.m38671DP(z11);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$k */
    /* loaded from: classes3.dex */
    class HandlerC7534k extends Handler {
        HandlerC7534k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11;
            try {
                int i12 = message.what;
                switch (i12) {
                    case 1:
                        removeMessages(1);
                        ZaloCameraView.this.m38771RQ(message.arg1);
                        break;
                    case 2:
                        removeMessages(2, Integer.valueOf(i12));
                        if (message.arg1 != AbstractC32212c.m155331a(ZaloCameraView.this.m92648SI()) && (message.obj instanceof Long) && Math.abs(System.currentTimeMillis() - ((Long) message.obj).longValue()) < 5000) {
                            Message message2 = new Message();
                            message2.what = 2;
                            message2.arg1 = message.arg1;
                            if (message.arg2 >= ZaloCameraView.f40824J2.length - 1) {
                                i11 = message.arg2;
                            } else {
                                i11 = message.arg2 + 1;
                            }
                            message2.arg2 = i11;
                            message2.obj = message.obj;
                            ZaloCameraView.this.f40918v2.sendMessageDelayed(message2, ZaloCameraView.f40824J2[message2.arg2]);
                            return;
                        }
                        removeMessages(2);
                        ZaloCameraView.this.f40873Z0.getRender().m98278U1();
                        break;
                        break;
                    case 3:
                        String str = (String) message.obj;
                        ZaloCameraView zaloCameraView = ZaloCameraView.this;
                        if (zaloCameraView.f40897l1 == 1 && zaloCameraView.f40881d1 != null) {
                            if (ZaloCameraView.this.f40881d1.f40730I != null && ZaloCameraView.this.f40881d1.f40730I.getParent() != null && TextUtils.equals(str, ZaloCameraView.this.f40881d1.f40730I.getShowcaseId())) {
                                ZaloCameraView.this.f40881d1.f40730I.m74626d();
                                ZaloCameraView.this.f40881d1.f40730I = null;
                            }
                            ZaloCameraView.this.f40881d1.m38567R0(str);
                            ZaloCameraView.this.f40881d1.m38564P0(str);
                            break;
                        } else {
                            ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                            if (zaloCameraView2.f40897l1 == 2 && zaloCameraView2.f40883e1 != null) {
                                if (ZaloCameraView.this.f40883e1.f40562T1 != null && ZaloCameraView.this.f40883e1.f40562T1.getParent() != null && TextUtils.equals(str, ZaloCameraView.this.f40883e1.f40562T1.getShowcaseId())) {
                                    ZaloCameraView.this.f40883e1.f40562T1.m74626d();
                                    ZaloCameraView.this.f40883e1.f40562T1 = null;
                                }
                                ZaloCameraView.this.f40883e1.m38251U2(str);
                                ZaloCameraView.this.f40883e1.m38249T2(str);
                                break;
                            }
                        }
                        break;
                    case 4:
                        ZaloCameraView.this.m39060lT(true);
                        break;
                    case 5:
                        if (ZaloCameraView.this.f40881d1 != null) {
                            ZaloCameraView.this.f40881d1.m38557K0();
                        }
                        if (ZaloCameraView.this.f40883e1 != null) {
                            ZaloCameraView.this.f40883e1.m38303z2(AbstractC22463d.m116126a(ZaloCameraView.this.m92648SI(), message.arg1));
                            break;
                        }
                        break;
                    case 6:
                        ZaloCameraView.this.m38865eU();
                        ZaloCameraView.this.f40838C2--;
                        if (ZaloCameraView.this.f40838C2 > 0) {
                            ZaloCameraView.this.f40918v2.sendEmptyMessageDelayed(6, 50L);
                            break;
                        }
                        break;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$k0 */
    /* loaded from: classes3.dex */
    class C7535k0 extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f40964p;

        /* renamed from: q */
        final /* synthetic */ Runnable f40965q;

        /* renamed from: r */
        final /* synthetic */ View f40966r;

        C7535k0(boolean z11, Runnable runnable, View view) {
            this.f40964p = z11;
            this.f40965q = runnable;
            this.f40966r = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view;
            super.onAnimationCancel(animator);
            if (ZaloCameraView.this.f40873Z0 != null) {
                ZaloCameraView.this.f40873Z0.setVisibility(0);
            }
            Runnable runnable = this.f40965q;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f40964p && (view = this.f40966r) != null) {
                view.setTranslationY(0.0f);
                this.f40966r.setAlpha(1.0f);
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f40965q;
            if (runnable != null) {
                runnable.run();
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f40964p) {
                ZaloCameraView.this.m39060lT(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$l */
    /* loaded from: classes3.dex */
    public class C7536l implements CameraEditorController.InterfaceC7480j0 {

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$l$a */
        /* loaded from: classes3.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C32123ta f40969a;

            a(C32123ta c32123ta) {
                this.f40969a = c32123ta;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e m41971c6 = C7960e.m41971c6();
                String str = CoreUtility.f89233i;
                C32123ta c32123ta = this.f40969a;
                m41971c6.m42074B8(str, c32123ta.f148138h, c32123ta.m155082i0().toString(), 1, this.f40969a.f148157w);
                C22052u.m115085y().m115096p(this.f40969a);
                C22052u.m115085y().m115101u();
                C22052u.m115085y().m115091U(this.f40969a);
                if (ZaloCameraView.this.m92655aJ() == 12345) {
                    C23744a.m124114c().m124116d(6016, new Object[0]);
                }
                C23744a.m124114c().m124116d(28, 0);
                ZaloCameraView.this.m38893iU();
            }
        }

        C7536l() {
        }

        /* renamed from: s */
        public /* synthetic */ void m39140s(int i11) {
            boolean z11;
            C23930c c23930c = ZaloCameraView.this.f40900m2;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c23930c.m125228I0(z11);
        }

        /* renamed from: t */
        public /* synthetic */ void m39141t() {
            ZaloCameraView.this.m92645PI();
        }

        /* renamed from: u */
        public /* synthetic */ void m39142u(boolean z11) {
            ZaloCameraView.this.f40900m2.m125228I0(z11);
        }

        /* renamed from: v */
        public static /* synthetic */ String m39143v(C32123ta c32123ta) {
            return "uploadStoryItem from editor camera: url=" + c32123ta.f148147m + " id=" + c32123ta.f148138h;
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: b */
        public void mo38344b(C32123ta c32123ta) {
            if (c32123ta != null) {
                c32123ta.m155081h0(ZaloCameraView.this.f40902n2);
                ZaloCameraView.this.mo50035CK(-1, new Intent());
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: com.zing.zalo.camera.w4
                    public /* synthetic */ C7793w4() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m39143v;
                        m39143v = ZaloCameraView.C7536l.m39143v(C32123ta.this);
                        return m39143v;
                    }
                });
                C0824j.m2153b(new a(c32123ta));
                ZaloCameraView.this.m39055jT();
                C25482o.f122075a.m132013u(c32123ta.f148140i, ZaloCameraView.this.f40914t2);
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: c */
        public void mo38345c(C27373c c27373c, String str) {
            AbstractC23152n3.m119009M0(ZaloCameraView.this.m92676n2(), c27373c, 11123, 3);
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: d */
        public void mo38346d() {
            ZaloCameraView.this.m39010BS();
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: e */
        public void mo38347e(String str, String str2, C20612c c20612c) {
            boolean z11;
            boolean z12;
            boolean z13;
            try {
                if (ZaloCameraView.this.f40895k1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (ZaloCameraView.this.f40895k1 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 3) && ZaloCameraView.this.f40899m1 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z11 && !z12 && !z13) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    int i11 = zaloCameraView.f40899m1;
                    if (i11 == 0 || i11 == 1) {
                        zaloCameraView.m38835aT();
                        ZaloCameraView.this.m38979vT(str, c20612c);
                        ZaloCameraView.this.m38674EC(false);
                        return;
                    }
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("extra_result_output_path", str);
                intent.putExtra("extra_result_original_path", ZaloCameraView.this.f40891i1.f41137w);
                intent.putExtra("extra_result_camera_log", str2);
                intent.putExtra("extra_result_decor_data", ZaloCameraView.this.m39031OS());
                ZaloCameraView.this.mo50035CK(-1, intent);
                ZaloCameraView.this.finish();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: f */
        public void mo38348f(String str, boolean z11) {
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (zaloCameraView.f40900m2 != null) {
                ((CommonZaloview) zaloCameraView).f72827B0.post(new Runnable() { // from class: com.zing.zalo.camera.t4

                    /* renamed from: q */
                    public final /* synthetic */ boolean f41574q;

                    public /* synthetic */ RunnableC7742t4(boolean z112) {
                        r2 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.C7536l.this.m39142u(r2);
                    }
                });
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: g */
        public void mo38349g(boolean z11) {
            ZaloCameraView.this.f40869X0.setCanInterceptTouch(z11);
            ZaloCameraView.this.f40871Y0.setCanInterceptTouch(z11);
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: h */
        public void mo38350h(int i11) {
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (zaloCameraView.f40900m2 != null) {
                ((CommonZaloview) zaloCameraView).f72827B0.post(new Runnable() { // from class: com.zing.zalo.camera.v4

                    /* renamed from: q */
                    public final /* synthetic */ int f41594q;

                    public /* synthetic */ RunnableC7754v4(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.C7536l.this.m39140s(r2);
                    }
                });
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: i */
        public void mo38351i(String str, int i11, int i12) {
            Bundle bundle = new Bundle();
            bundle.putString("video_input_path", str);
            bundle.putInt("min_video_duration", i11);
            bundle.putInt("max_video_duration", i12);
            bundle.putBoolean("mark_video_position_only", true);
            bundle.putString("video_output_path", AbstractC20130d.m104900v0("trimmed_video_").toString());
            if (ZaloCameraView.this.m92676n2() != null) {
                ZaloCameraView.this.m39060lT(false);
                ZaloCameraView.this.f40913t1 = true;
                ZaloCameraView.this.m38780SS(bundle, 11118);
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: j */
        public void mo38352j() {
            ZaloCameraView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.u4
                public /* synthetic */ RunnableC7748u4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.C7536l.this.m39141t();
                }
            });
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: k */
        public void mo38353k(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
            ZaloCameraView.this.mo50035CK(0, null);
            ZaloCameraView.this.finish();
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: l */
        public void mo38354l(String str, float f11) {
            C23930c c23930c = ZaloCameraView.this.f40900m2;
            if (c23930c != null) {
                c23930c.m125232N0(f11);
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: m */
        public void mo38355m(C27373c c27373c, String str) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if (ZaloCameraView.this.f40895k1 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ZaloCameraView.this.f40895k1 == 2 && ZaloCameraView.this.f40891i1.f41102U) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (ZaloCameraView.this.f40895k1 == 0 && ZaloCameraView.this.f40891i1.f41103V) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 2) && ZaloCameraView.this.f40899m1 == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z11 && !z12 && !z13 && !z14) {
                if (ZaloCameraView.this.f40895k1 == 9) {
                    AbstractC27418m.m140398b(ZaloCameraView.this.m92662fJ(), c27373c, str);
                    return;
                }
                if (ZaloCameraView.this.m38666CR()) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_VIDEO_INFO", c27373c);
                    ZaloCameraView.this.mo50035CK(-1, intent);
                    ZaloCameraView.this.m38835aT();
                    ZaloCameraView.this.m38985wT(c27373c, str);
                    ZaloCameraView.this.m38674EC(false);
                    return;
                }
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("EXTRA_VIDEO_INFO", c27373c);
            intent2.putExtra("extra_result_video_log", str);
            intent2.putExtra("extra_result_original_path", ZaloCameraView.this.f40891i1.f41139x);
            VideoBlendingParam videoBlendingParam = c27373c.f128947T;
            if (videoBlendingParam != null) {
                intent2.putExtra("extra_result_decor_data", videoBlendingParam.f48280t);
            }
            ZaloCameraView.this.mo50035CK(-1, intent2);
            ZaloCameraView.this.finish();
            VideoBlendingParam videoBlendingParam2 = c27373c.f128947T;
            if (videoBlendingParam2 != null && videoBlendingParam2.f48265Q > 0 && ZaloCameraView.this.f40891i1.f41126q0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C2526d.m12656d(c27373c, ZaloCameraView.this.f40899m1));
                C2526d.m12650C("", arrayList, true, ZaloCameraView.this.f40891i1.f41128r0);
            }
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: n */
        public void mo38356n(boolean z11, boolean z12) {
            ZaloCameraView.this.m38759PT(z11, z12);
        }

        @Override // com.zing.zalo.camera.CameraEditorController.InterfaceC7480j0
        /* renamed from: o */
        public void mo38357o(String str, String str2) {
            AbstractC23152n3.m119013O0(ZaloCameraView.this.m92676n2(), str, true, AbstractC26689j.m137086M(), 11122, 1);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$l0 */
    /* loaded from: classes3.dex */
    public interface InterfaceC7537l0 {
        /* renamed from: a */
        void mo39120a();

        /* renamed from: b */
        void mo39121b();
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$m */
    /* loaded from: classes3.dex */
    public class C7538m extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f40971p = false;

        /* renamed from: q */
        final /* synthetic */ View f40972q;

        C7538m(View view) {
            this.f40972q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f40971p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (ZaloCameraView.this.f40868W1 == animator && !this.f40971p) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    zaloCameraView.m38936pT(zaloCameraView.f40883e1.f40668y1);
                    ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                    zaloCameraView2.m38936pT(zaloCameraView2.f40883e1.f40638r);
                    ZaloCameraView zaloCameraView3 = ZaloCameraView.this;
                    zaloCameraView3.m38936pT(zaloCameraView3.f40883e1.f40642s);
                    ZaloCameraView zaloCameraView4 = ZaloCameraView.this;
                    zaloCameraView4.m38936pT(zaloCameraView4.f40883e1.f40646t);
                    ZaloCameraView zaloCameraView5 = ZaloCameraView.this;
                    zaloCameraView5.m38936pT(zaloCameraView5.f40883e1.f40650u);
                    ZaloCameraView.this.m38936pT(this.f40972q);
                    AbstractC23136l9.m118744r1(ZaloCameraView.this.f40881d1.f40791v, 0);
                    ZaloCameraView.this.f40881d1.m38559L2(0);
                    ZaloCameraView.this.f40881d1.m38554F2(0);
                    ZaloCameraView.this.f40881d1.m38556G2(0);
                    ZaloCameraView.this.f40881d1.m38561M2(0);
                    if (ZaloCameraView.this.f40868W1 == animator) {
                        ZaloCameraView.this.f40868W1 = null;
                    }
                    ZaloCameraView.this.f40883e1.f40506F1 = true;
                    ZaloCameraView.this.f40883e1.f40643s0 = false;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$m0 */
    /* loaded from: classes3.dex */
    class C7539m0 extends GestureDetector.SimpleOnGestureListener {
        C7539m0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                if (ZaloCameraView.this.f40873Z0 != null) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    if (zaloCameraView.f40897l1 == 1 && zaloCameraView.f40881d1 != null && !ZaloCameraView.this.f40881d1.f40769f0 && ZaloCameraView.this.f40881d1.f40783r != null && !ZaloCameraView.this.f40881d1.f40783r.f41073s && C29667y.m147458p().m147480q() > 1 && !ZaloCameraView.this.f40881d1.m38597u1(motionEvent) && !ZaloCameraView.this.f40881d1.m38596t1(motionEvent)) {
                        ZaloCameraView.this.f40881d1.m38587j2();
                    } else {
                        ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                        if (zaloCameraView2.f40897l1 == 2 && zaloCameraView2.f40883e1 != null) {
                            ZaloCameraView.this.f40883e1.m38258Y5();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            try {
                if (ZaloCameraView.this.m39071qR() && !ZaloCameraView.this.m38934pR()) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    if (zaloCameraView.f40897l1 == 1 && zaloCameraView.f40881d1 != null && ZaloCameraView.this.f40881d1.f40795x != null) {
                        ZaloCameraView.this.f40881d1.f40795x.setSelected(false);
                    }
                    ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                    if (zaloCameraView2.f40897l1 == 2 && zaloCameraView2.f40883e1 != null) {
                        ZaloCameraView.this.f40883e1.setEditingMode(0);
                    }
                    ZaloCameraView.this.m39038VT(false, new int[0]);
                    ZaloCameraView.this.m39070pU("filter_click_notclear");
                } else if (ZaloCameraView.this.m38964tR() && (ZaloCameraView.this.f40853L1 == null || !ZaloCameraView.this.f40853L1.isRunning())) {
                    ZaloCameraView.this.m39041XT(false, new int[0]);
                } else if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40776m0 && ZaloCameraView.this.m39065nR() && (ZaloCameraView.this.f40884e2 == null || !ZaloCameraView.this.f40884e2.isRunning())) {
                    ZaloCameraView.this.m39036TT(false, true, true);
                } else {
                    ZaloCameraView zaloCameraView3 = ZaloCameraView.this;
                    if (!zaloCameraView3.f40866V1 && zaloCameraView3.f40881d1 != null) {
                        ZaloCameraView.this.f40881d1.m38585i2(motionEvent);
                    } else if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40752T != null) {
                        ZaloCameraView.this.f40881d1.f40752T.mo147381l(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$n */
    /* loaded from: classes3.dex */
    public class C7540n extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f40975p = false;

        /* renamed from: q */
        final /* synthetic */ View f40976q;

        C7540n(View view) {
            this.f40976q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f40975p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (ZaloCameraView.this.f40868W1 == animator && !this.f40975p) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    zaloCameraView.m38936pT(zaloCameraView.f40883e1.f40668y1);
                    ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                    zaloCameraView2.m38936pT(zaloCameraView2.f40883e1.f40638r);
                    ZaloCameraView zaloCameraView3 = ZaloCameraView.this;
                    zaloCameraView3.m38936pT(zaloCameraView3.f40883e1.f40642s);
                    ZaloCameraView zaloCameraView4 = ZaloCameraView.this;
                    zaloCameraView4.m38936pT(zaloCameraView4.f40883e1.f40646t);
                    ZaloCameraView zaloCameraView5 = ZaloCameraView.this;
                    zaloCameraView5.m38936pT(zaloCameraView5.f40883e1.f40650u);
                    ZaloCameraView.this.m38936pT(this.f40976q);
                    ZaloCameraView zaloCameraView6 = ZaloCameraView.this;
                    zaloCameraView6.m38936pT(zaloCameraView6.f40881d1.f40791v);
                    ZaloCameraView zaloCameraView7 = ZaloCameraView.this;
                    zaloCameraView7.m38936pT(zaloCameraView7.f40881d1.f40787t);
                    ZaloCameraView zaloCameraView8 = ZaloCameraView.this;
                    zaloCameraView8.m38936pT(zaloCameraView8.f40881d1.f40789u);
                    ZaloCameraView zaloCameraView9 = ZaloCameraView.this;
                    zaloCameraView9.m38936pT(zaloCameraView9.f40881d1.f40795x);
                    ZaloCameraView zaloCameraView10 = ZaloCameraView.this;
                    zaloCameraView10.m38936pT(zaloCameraView10.f40881d1.f40797y);
                    ZaloCameraView zaloCameraView11 = ZaloCameraView.this;
                    zaloCameraView11.m38936pT(zaloCameraView11.f40881d1.f40793w);
                    if (ZaloCameraView.this.f40881d1.m38594s1()) {
                        ZaloCameraView zaloCameraView12 = ZaloCameraView.this;
                        zaloCameraView12.m38936pT(zaloCameraView12.f40881d1.f40799z);
                        ZaloCameraView zaloCameraView13 = ZaloCameraView.this;
                        zaloCameraView13.m38936pT(zaloCameraView13.f40881d1.f40714A);
                    }
                    if (ZaloCameraView.this.f40868W1 == animator) {
                        ZaloCameraView.this.f40868W1 = null;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$n0 */
    /* loaded from: classes3.dex */
    class C7541n0 extends AbstractC22461b {
        C7541n0() {
        }

        @Override // p322lf.AbstractC22461b
        /* renamed from: b */
        public void mo39144b(InterfaceC2120r interfaceC2120r) {
            AbstractC20110a.m104543l("ZaloCameraView").mo104554k("onLayoutChanged: %s", interfaceC2120r);
            if ((interfaceC2120r.getState() == InterfaceC2120r.a.f8993d || interfaceC2120r.getState() == InterfaceC2120r.a.f8992c) && ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.f40769f0) {
                AbstractC20110a.m104541j("Stop video recording due to layout change", new Object[0]);
                ZaloCameraView.this.f40881d1.m38566Q2(true);
                ZaloCameraView.this.f40910r2 = true;
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$o */
    /* loaded from: classes3.dex */
    public class C7542o implements DragToCloseLayout.InterfaceC16432a {

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$o$a */
        /* loaded from: classes3.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ZaloCameraView zaloCameraView = ZaloCameraView.this;
                zaloCameraView.f88756W = 0;
                zaloCameraView.finish();
            }
        }

        /* renamed from: com.zing.zalo.camera.ZaloCameraView$o$b */
        /* loaded from: classes3.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ZaloCameraView.this.f40843F1 = -1;
                if (ZaloCameraView.this.f40881d1 != null) {
                    ZaloCameraView.this.f40881d1.m38551A2();
                }
                if (ZaloCameraView.this.f40863U0 != null) {
                    ZaloCameraView.this.f40863U0.setBackgroundResource(0);
                }
                ZaloCameraView.this.m92662fJ().m93094z(false);
                ZaloCameraView.this.m92645PI();
            }
        }

        C7542o() {
        }

        /* renamed from: c */
        public /* synthetic */ void m39147c(ValueAnimator valueAnimator) {
            ZaloCameraView.this.f40869X0.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }

        /* renamed from: d */
        public /* synthetic */ void m39148d(ValueAnimator valueAnimator) {
            ZaloCameraView.this.f40869X0.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
            ZaloCameraView.this.m39060lT(false);
            if (ZaloCameraView.this.f40881d1 != null) {
                ZaloCameraView.this.f40881d1.m38568S0();
            }
            if (AbstractC22470k.m116158j(ZaloCameraView.this.f40895k1, 3, 2)) {
                if (ZaloCameraView.this.f40863U0 != null) {
                    ZaloCameraView.this.f40863U0.setBackgroundResource(0);
                }
            } else if (ZaloCameraView.this.f40863U0 != null && ZaloCameraView.this.f40863U0.getHeight() > 0) {
                ZaloCameraView.this.f40863U0.setBackgroundColor(Color.argb(Math.max(255 - ((((int) f11) * 255) / ZaloCameraView.this.f40863U0.getHeight()), 0), 0, 0, 0));
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean z11) {
            if (ZaloCameraView.this.mo60294yp()) {
                return;
            }
            if (!z11) {
                ZaloCameraView.this.m38835aT();
                ValueAnimator ofInt = ValueAnimator.ofInt((int) ZaloCameraView.this.f40869X0.getTranslationY(), ZaloCameraView.this.f40863U0.getHeight());
                ofInt.setDuration(200L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.x4
                    public /* synthetic */ C7799x4() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ZaloCameraView.C7542o.this.m39147c(valueAnimator);
                    }
                });
                ofInt.addListener(new a());
                ofInt.start();
                ZaloCameraView.this.m39060lT(false);
                return;
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt((int) ZaloCameraView.this.f40869X0.getTranslationY(), 0);
            ofInt2.setDuration(200L);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.y4
                public /* synthetic */ C7805y4() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ZaloCameraView.C7542o.this.m39148d(valueAnimator);
                }
            });
            ofInt2.addListener(new b());
            ofInt2.start();
            ZaloCameraView.this.m39060lT(true);
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
            if (ZaloCameraView.this.f40863U0 != null) {
                ZaloCameraView.this.f40863U0.setBackgroundColor(-16777216);
            }
            ZaloCameraView.this.m92662fJ().m93094z(true);
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$p */
    /* loaded from: classes3.dex */
    public class C7543p extends AnimatorListenerAdapter {
        C7543p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ZaloCameraView.this.f40855N1 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (animator == ZaloCameraView.this.f40855N1) {
                    ZaloCameraView.this.f40854M1.setAlpha(1.0f);
                    ZaloCameraView.this.f40854M1.setTranslationY(0.0f);
                    AbstractC23136l9.m118744r1(ZaloCameraView.this.f40854M1, 8);
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    if (zaloCameraView.f40897l1 == 2 && zaloCameraView.f40883e1 != null && !ZaloCameraView.this.f40883e1.m38296v4() && !ZaloCameraView.this.f40883e1.m38233K4() && !ZaloCameraView.this.f40883e1.m38287q4()) {
                        ZaloCameraView.this.f40883e1.setEditingMode(0);
                    }
                    ZaloCameraView.this.f40856O1 = false;
                    ZaloCameraView.this.f40857P1 = false;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$q */
    /* loaded from: classes3.dex */
    public class C7544q extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f40983p;

        C7544q(boolean z11) {
            this.f40983p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ZaloCameraView.this.f40884e2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (animator == ZaloCameraView.this.f40884e2) {
                    ZaloCameraView.this.f40874Z1.setAlpha(1.0f);
                    ZaloCameraView.this.f40874Z1.setTranslationY(0.0f);
                    if (!this.f40983p) {
                        AbstractC23136l9.m118744r1(ZaloCameraView.this.f40874Z1, 8);
                        if (!ZaloCameraView.this.f40881d1.m38590p1()) {
                            ZaloCameraView.this.f40881d1.f40781q.setTranslationY(0.0f);
                            ZaloCameraView.this.f40881d1.f40781q.setAlpha(1.0f);
                        }
                    }
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    zaloCameraView.m39019FT(zaloCameraView.f40881d1.f40738M);
                    if (this.f40983p) {
                        ZaloCameraView.this.m38765QS();
                    } else {
                        ZaloCameraView.this.m38705IS();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$r */
    /* loaded from: classes3.dex */
    public class C7545r extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f40985p;

        C7545r(boolean z11) {
            this.f40985p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ZaloCameraView.this.f40886f2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (animator == ZaloCameraView.this.f40886f2) {
                    ZaloCameraView.this.f40878b2.setAlpha(1.0f);
                    ZaloCameraView.this.f40878b2.setTranslationY(0.0f);
                    if (!this.f40985p) {
                        ZaloCameraView.this.m38819YQ();
                    }
                    if (this.f40985p) {
                        ZaloCameraView.this.m38765QS();
                    } else {
                        ZaloCameraView.this.m38705IS();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$s */
    /* loaded from: classes3.dex */
    public class C7546s implements BackgroundPickerView.InterfaceC12675c {
        C7546s() {
        }

        @Override // com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView.InterfaceC12675c
        /* renamed from: i */
        public void mo39149i(C31890dc c31890dc) {
            if (ZaloCameraView.this.f40881d1 != null) {
                ZaloCameraView.this.f40881d1.m38591p2(c31890dc);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.feedbackground.BackgroundPickerView.InterfaceC12675c
        /* renamed from: j */
        public void mo39150j() {
            C31890dc m153020A = C31845ac.m152996J().m153020A();
            if (ZaloCameraView.this.f40881d1 != null) {
                ZaloCameraView.this.f40881d1.m38591p2(m153020A);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$t */
    /* loaded from: classes3.dex */
    class RunnableC7547t implements Runnable {
        RunnableC7547t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatusComposeEditText editStatus = ZaloCameraView.this.f40881d1.getEditStatus();
                if (editStatus != null && editStatus.getText().length() > 0) {
                    ZaloCameraView.this.m38865eU();
                    ZaloCameraView.this.f40918v2.postDelayed(ZaloCameraView.this.f40840D2, 50L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.ZaloCameraView$u */
    /* loaded from: classes3.dex */
    public class C7548u extends AnimatorListenerAdapter {
        C7548u() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ZaloCameraView.this.f40888g2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ZaloCameraView.this.m38765QS();
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$v */
    /* loaded from: classes3.dex */
    class C7549v implements InterfaceC7537l0 {
        C7549v() {
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: a */
        public void mo39120a() {
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (zaloCameraView.f40894j2) {
                zaloCameraView.mo49315c4();
                ToastUtils.m89266n(AbstractC8020f0.str_error_loading_quick_access_filter, new Object[0]);
            }
        }

        @Override // com.zing.zalo.camera.ZaloCameraView.InterfaceC7537l0
        /* renamed from: b */
        public void mo39121b() {
            ZaloCameraView zaloCameraView = ZaloCameraView.this;
            if (!zaloCameraView.f40894j2) {
                zaloCameraView.m38672DQ(null);
            } else {
                zaloCameraView.mo49315c4();
                ZaloCameraView.this.m38724LP();
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$w */
    /* loaded from: classes3.dex */
    public class C7550w extends AnimatorListenerAdapter {
        C7550w() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ZaloCameraView.this.f40888g2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ZaloCameraView.this.m38705IS();
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$x */
    /* loaded from: classes3.dex */
    public class C7551x extends AnimatorListenerAdapter {
        C7551x() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            try {
                super.onAnimationCancel(animator);
                ZaloCameraView.this.f40853L1 = null;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (animator == ZaloCameraView.this.f40853L1) {
                    if (ZaloCameraView.this.m38964tR()) {
                        AbstractC23136l9.m118744r1(ZaloCameraView.this.f40852K1.f41260p, 8);
                    }
                    ZaloCameraView.this.f40852K1.setAlpha(1.0f);
                    ZaloCameraView.this.f40852K1.setTranslationY(0.0f);
                    AbstractC23136l9.m118744r1(ZaloCameraView.this.f40852K1, 8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$y */
    /* loaded from: classes3.dex */
    public class C7552y implements GalleryPickerContainer.InterfaceC7635d {
        C7552y() {
        }

        @Override // com.zing.zalo.camera.gallerypicker.GalleryPickerContainer.InterfaceC7635d
        /* renamed from: a */
        public void mo39151a(Intent intent) {
            MediaItem mediaItem;
            try {
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM.size() == 1) {
                    mediaItem = (MediaItem) m71440ZM.get(0);
                } else {
                    mediaItem = null;
                }
                if (mediaItem instanceof VideoItem) {
                    ZaloCameraView.this.m38840bR(intent);
                } else {
                    ZaloCameraView.this.m38777SP(mediaItem, intent);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // com.zing.zalo.camera.gallerypicker.GalleryPickerContainer.InterfaceC7635d
        /* renamed from: b */
        public void mo39152b(int i11) {
            if (ZaloCameraView.this.f40871Y0 != null) {
                ZaloCameraView.this.f40871Y0.setPickerMiniY(i11);
            }
        }

        @Override // com.zing.zalo.camera.gallerypicker.GalleryPickerContainer.InterfaceC7635d
        /* renamed from: c */
        public CameraPreviewController mo39153c() {
            return ZaloCameraView.this.f40881d1;
        }

        @Override // com.zing.zalo.camera.gallerypicker.GalleryPickerContainer.InterfaceC7635d
        /* renamed from: d */
        public void mo39154d() {
            try {
                if (ZaloCameraView.this.f40869X0 != null) {
                    ZaloCameraView.this.f40869X0.setCanInterceptTouch(false);
                }
                if (ZaloCameraView.this.f40871Y0 != null) {
                    ZaloCameraView.this.f40871Y0.setCanInterceptTouch(false);
                }
                ZaloCameraView.this.m39035ST();
                ZaloCameraView.this.f40921x1 = true;
                ZaloCameraView.this.m38869fQ(true, new int[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.ZaloCameraView$z */
    /* loaded from: classes3.dex */
    class C7553z implements DragCameraLayout.InterfaceC13495a {

        /* renamed from: a */
        int f40994a = -1;

        /* renamed from: b */
        float f40995b;

        C7553z() {
        }

        @Override // com.zing.zalo.p077ui.widget.DragCameraLayout.InterfaceC13495a
        /* renamed from: a */
        public void mo39155a(float f11, float f12, float f13, float f14, boolean z11, boolean z12) {
            boolean z13;
            boolean z14;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
            if (ZaloCameraView.this.m38999yR()) {
                return;
            }
            int i11 = this.f40994a;
            if (i11 != 0) {
                boolean z15 = true;
                if (i11 != 1) {
                    ZaloCameraView zaloCameraView = ZaloCameraView.this;
                    if (i11 == 2 && !z11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zaloCameraView.f40856O1 = z13;
                    ZaloCameraView zaloCameraView2 = ZaloCameraView.this;
                    if (this.f40994a == 3 && z11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zaloCameraView2.f40857P1 = z14;
                    if (!ZaloCameraView.this.f40857P1 && !ZaloCameraView.this.f40856O1) {
                        return;
                    }
                    if (ZaloCameraView.this.f40881d1 == null || !ZaloCameraView.this.f40881d1.m38594s1()) {
                        z15 = false;
                    }
                    boolean m116126a = AbstractC22463d.m116126a(ZaloCameraView.this.m92648SI(), AbstractC32212c.m155331a(ZaloCameraView.this.m92648SI()));
                    if (ZaloCameraView.this.f40891i1.f41100S || z15 || ZaloCameraView.this.m38992xR() || m116126a) {
                        ZaloCameraView.this.m38929oU();
                    } else {
                        ZaloCameraView.this.f40858Q1 = null;
                        if (ZaloCameraView.this.f40859R1 != null) {
                            ZaloCameraView zaloCameraView3 = ZaloCameraView.this;
                            zaloCameraView3.f40858Q1 = zaloCameraView3.f40859R1;
                        }
                        ZaloCameraView.this.m38924nU();
                    }
                    this.f40994a = -1;
                }
            }
            if (ZaloCameraView.this.m39071qR()) {
                ZaloCameraView.this.m38735MS(z11);
            } else if (ZaloCameraView.this.m38964tR() || ZaloCameraView.this.m38955sR()) {
                ZaloCameraView.this.m38743NS(z11);
            }
            this.f40994a = -1;
        }

        @Override // com.zing.zalo.p077ui.widget.DragCameraLayout.InterfaceC13495a
        /* renamed from: b */
        public void mo39156b(float f11, float f12, float f13, float f14) {
            try {
                if (ZaloCameraView.this.m38999yR()) {
                    return;
                }
                if (this.f40994a == 0 && this.f40995b < ZaloCameraView.this.f40873Z0.getHeight() / 2.0f) {
                    return;
                }
                int i11 = this.f40994a;
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 0) {
                        if (ZaloCameraView.this.m39071qR()) {
                            ZaloCameraView.this.m38680ES(f12);
                            return;
                        } else {
                            if ((ZaloCameraView.this.m38964tR() && ZaloCameraView.this.f40852K1.f41260p.getTranslationY() != 0.0f) || ZaloCameraView.this.m38955sR()) {
                                ZaloCameraView.this.m38693GS(f12);
                                return;
                            }
                            return;
                        }
                    }
                    if (i11 == 1) {
                        if (ZaloCameraView.this.m39071qR()) {
                            ZaloCameraView.this.m38687FS(f12);
                        } else if (ZaloCameraView.this.f40852K1 != null && ZaloCameraView.this.f40852K1.getGalleryPickerMode() == 0 && ZaloCameraView.this.m38964tR()) {
                            ZaloCameraView.this.m38700HS(f12);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.widget.DragCameraLayout.InterfaceC13495a
        /* renamed from: c */
        public void mo39157c(float f11, float f12, int i11) {
            this.f40994a = i11;
            this.f40995b = f12;
            ZaloCameraView.this.f40856O1 = false;
            ZaloCameraView.this.f40857P1 = false;
            try {
                if (ZaloCameraView.this.m38999yR()) {
                    return;
                }
                if (i11 == 0) {
                    if (this.f40995b > ZaloCameraView.this.f40873Z0.getHeight() / 2.0f) {
                        ZaloCameraView.this.f40869X0.setCanInterceptTouch(false);
                        if (!ZaloCameraView.this.f40891i1.f41100S && !ZaloCameraView.this.m39071qR() && !ZaloCameraView.this.m39073rR() && ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.getPreviewRecordMode() != 1) {
                            ZaloCameraView.this.m38872fU();
                        } else if (ZaloCameraView.this.f40881d1 != null && ZaloCameraView.this.f40881d1.m38594s1() && !ZaloCameraView.this.m39065nR() && !ZaloCameraView.this.f40881d1.m38590p1()) {
                            AbstractC23647d.m123897g("49150063");
                            ZaloCameraView.this.m39036TT(true, true, true);
                            AbstractC28025b8.m141442M("tip.camera.status.story.thumb");
                            ZaloCameraView.this.f40881d1.m38564P0("tip.camera.status.story.thumb");
                        } else if (ZaloCameraView.this.m39071qR() || ZaloCameraView.this.f40897l1 == 2) {
                            ZaloCameraView.this.m38872fU();
                        }
                    }
                } else if (i11 == 1) {
                    if (!ZaloCameraView.this.m39071qR()) {
                        ZaloCameraView zaloCameraView = ZaloCameraView.this;
                        if (zaloCameraView.f40897l1 != 2) {
                            if (zaloCameraView.m38964tR() && ZaloCameraView.this.f40852K1.getGalleryPickerMode() == 0) {
                                ZaloCameraView.this.m38886hU();
                            } else if (ZaloCameraView.this.m39065nR()) {
                                AbstractC23647d.m123897g("49150065");
                                ZaloCameraView.this.m39036TT(false, true, true);
                            } else if (ZaloCameraView.this.m39068oR() && !ZaloCameraView.this.f40881d1.m38590p1()) {
                                AbstractC23647d.m123897g("49150067");
                                ZaloCameraView.this.m39037UT(false, true, true);
                            }
                        }
                    }
                    ZaloCameraView.this.m38879gU();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: AR */
    private boolean m38655AR() {
        if (m92651WI().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: AS */
    private void m38656AS(int i11) {
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null) {
            filterPickerView.setCameraInput(i11);
            this.f40854M1.m39266K();
        }
    }

    /* renamed from: AT */
    private void m38657AT(CameraInputParams cameraInputParams) {
        if (cameraInputParams == null) {
            return;
        }
        this.f40891i1 = cameraInputParams;
        this.f40895k1 = cameraInputParams.f41129s;
        int i11 = cameraInputParams.f41133u;
        if (i11 == 3) {
            this.f40899m1 = 3;
        } else if (i11 == 2) {
            this.f40899m1 = 2;
        } else if (i11 == 1) {
            this.f40899m1 = 1;
        } else if (i11 == 4) {
            this.f40899m1 = 4;
        } else {
            this.f40899m1 = 0;
        }
        this.f40912s2 = cameraInputParams.f41138w0;
        m39011BT(cameraInputParams.f41107Z);
    }

    /* renamed from: CP */
    private void m38665CP() {
        if (this.f40873Z0.getParent() == null) {
            ((FrameLayout) this.f40865V0).addView(this.f40873Z0);
        }
    }

    /* renamed from: CR */
    public boolean m38666CR() {
        int i11 = this.f40899m1;
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: CS */
    public void m38667CS() {
        if (this.f40883e1.isShown()) {
            m38862eQ();
        } else {
            this.f40883e1.m38269e3();
            m38732MP(1);
            m38759PT(false, false);
            m38843bU(true, false);
        }
        if (!AbstractC23238v2.m119726k()) {
            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
        }
    }

    /* renamed from: DP */
    public void m38671DP(boolean z11) {
        CameraPreviewController cameraPreviewController;
        try {
            if (this.f40897l1 == 1 && (cameraPreviewController = this.f40881d1) != null && cameraPreviewController.f40795x != null && m39071qR()) {
                this.f40881d1.f40795x.setSelected(z11);
            }
            if (this.f40897l1 == 2 && this.f40883e1 != null && m39071qR()) {
                if (z11 && !this.f40883e1.m38293t4()) {
                    this.f40883e1.setEditingMode(7);
                } else if (!z11 && !this.f40883e1.m38296v4()) {
                    this.f40883e1.setEditingMode(0);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: DQ */
    public void m38672DQ(InterfaceC7537l0 interfaceC7537l0) {
        C0824j.m2153b(new C7527g0(interfaceC7537l0));
    }

    /* renamed from: DR */
    public /* synthetic */ void m38673DR() {
        this.f40854M1.m39265J();
    }

    /* renamed from: EC */
    public void m38674EC(boolean z11) {
        if (!z11) {
            try {
                m92662fJ().m93094z(true);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ObjectAnimator.ofFloat(this.f40863U0, "translationY", r1.getHeight()));
                animatorSet.setInterpolator(new C26087b());
                animatorSet.setDuration(300L);
                animatorSet.addListener(new C7518c());
                animatorSet.start();
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
                finish();
                return;
            }
        }
        this.f40836B2.mo38329EC(true);
    }

    /* renamed from: EQ */
    private EnumC22962a m38678EQ() {
        if (this.f40895k1 == 7) {
            return EnumC22962a.f111696t;
        }
        return EnumC22962a.f111694r;
    }

    /* renamed from: ER */
    public /* synthetic */ void m38679ER(int i11, String str, String str2, String str3, C29605a c29605a, long j11) {
        boolean z11;
        boolean z12;
        boolean z13;
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.f40769f0) {
            return;
        }
        if (m92674mJ() && !m92681pJ() && m92648SI() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0 && !TextUtils.isEmpty(str) && TextUtils.equals(str, str2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        try {
            if (z11 && z12) {
                m38825ZP(AbstractC23203s.m119548a(MainApplication.getAppContext(), str3, AbstractC23203s.m119549b(str3)), new ColorFilterConfig(str3, this.f40860S1 / 100.0f));
                if (this.f40854M1 != null) {
                    this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.d4
                        public /* synthetic */ RunnableC7589d4() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloCameraView.this.m38673DR();
                        }
                    });
                }
            } else {
                if (i11 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c29605a.m147143t(z13);
                FilterPickerView filterPickerView = this.f40854M1;
                if (filterPickerView != null) {
                    filterPickerView.m39267O(c29605a);
                }
                this.f40837C1 = false;
            }
            AbstractC20110a.m104544m("handleApplyFilter: %s", Long.valueOf(System.currentTimeMillis() - j11));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: ES */
    public void m38680ES(float f11) {
        if (this.f40854M1 != null) {
            float height = r0.getHeight() + f11;
            this.f40854M1.setTranslationY(Math.max(height, 0.0f));
            float abs = Math.abs(height) / this.f40854M1.getHeight();
            float f12 = 1.0f;
            float f13 = 1.0f - abs;
            if (this.f40854M1.getTranslationY() != 0.0f) {
                f12 = f13;
            }
            this.f40854M1.setAlpha(f12);
        }
    }

    /* renamed from: ET */
    private void m38681ET(boolean z11) {
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null) {
            imageDecorView.getRender().m98300k2(z11);
        }
    }

    /* renamed from: FP */
    private void m38685FP(boolean z11, boolean z12, boolean... zArr) {
        boolean z13;
        if (z12) {
            this.f40869X0.setCanInterceptTouch(!z11);
        }
        this.f40871Y0.setCanInterceptTouch(true);
        AbstractC23136l9.m118744r1(this.f40874Z1, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int height = this.f40874Z1.getHeight();
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            if (z11) {
                int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
                if (this.f40881d1.f40799z.getTranslationY() != (-m122007i5) + this.f40890h2) {
                    arrayList.addAll(m38991xQ(m122007i5));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.f40874Z1, "translationY", height, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40874Z1, "alpha", 0.0f, 1.0f));
            } else {
                if (z13 || this.f40881d1.f40799z.getTranslationY() == 0.0f) {
                    arrayList.addAll(m38915mQ());
                }
                arrayList.add(ObjectAnimator.ofFloat(this.f40874Z1, "translationY", height));
            }
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new C26087b());
        this.f40884e2 = animatorSet;
        animatorSet.addListener(new C7544q(z11));
        this.f40884e2.start();
    }

    /* renamed from: FR */
    public /* synthetic */ void m38686FR(String str, C29605a c29605a, long j11, int i11, String str2, String str3, C26657h c26657h) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.b4

            /* renamed from: q */
            public final /* synthetic */ int f41014q;

            /* renamed from: r */
            public final /* synthetic */ String f41015r;

            /* renamed from: s */
            public final /* synthetic */ String f41016s;

            /* renamed from: t */
            public final /* synthetic */ String f41017t;

            /* renamed from: u */
            public final /* synthetic */ C29605a f41018u;

            /* renamed from: v */
            public final /* synthetic */ long f41019v;

            public /* synthetic */ RunnableC7566b4(int i112, String str4, String str22, String str32, C29605a c29605a2, long j112) {
                r2 = i112;
                r3 = str4;
                r4 = str22;
                r5 = str32;
                r6 = c29605a2;
                r7 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38679ER(r2, r3, r4, r5, r6, r7);
            }
        });
    }

    /* renamed from: FS */
    public void m38687FS(float f11) {
        float max;
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null) {
            float height = filterPickerView.getHeight();
            float f12 = 0.0f;
            if (f11 > height) {
                max = height;
            } else {
                max = Math.max(f11, 0.0f);
            }
            this.f40854M1.setTranslationY(max);
            float abs = 1.0f - (Math.abs(f11) / height);
            if (this.f40854M1.getTranslationY() != height) {
                if (this.f40854M1.getTranslationY() == 0.0f) {
                    f12 = 1.0f;
                } else {
                    f12 = abs;
                }
            }
            this.f40854M1.setAlpha(f12);
        }
    }

    /* renamed from: GP */
    private void m38691GP(boolean z11, boolean z12, boolean... zArr) {
        boolean z13;
        if (z12) {
            this.f40869X0.setCanInterceptTouch(!z11);
        }
        this.f40871Y0.setCanInterceptTouch(true);
        m38766QT();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int height = this.f40878b2.getHeight();
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12) {
            if (z11) {
                int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
                if (this.f40881d1.f40799z.getTranslationY() != (-m122007i5) + this.f40890h2) {
                    arrayList.addAll(m38991xQ(m122007i5));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.f40878b2, "translationY", height, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f40878b2, "alpha", 0.0f, 1.0f));
            } else {
                if (z13 || this.f40881d1.f40799z.getTranslationY() == 0.0f) {
                    arrayList.addAll(m38915mQ());
                }
                arrayList.add(ObjectAnimator.ofFloat(this.f40878b2, "translationY", height));
            }
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new C26087b());
        this.f40886f2 = animatorSet;
        animatorSet.addListener(new C7545r(z11));
        this.f40886f2.start();
    }

    /* renamed from: GR */
    public /* synthetic */ void m38692GR(String[] strArr) {
        AbstractC23034c6.m118186w0(m92676n2(), strArr, 141);
    }

    /* renamed from: GS */
    public void m38693GS(float f11) {
        GalleryPickerMini galleryPickerMini;
        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
        if (galleryPickerContainer != null && galleryPickerContainer.getGalleryPickerMode() == 0 && (galleryPickerMini = this.f40852K1.f41260p) != null) {
            this.f40852K1.f41260p.setTranslationY(Math.max(galleryPickerMini.getHeight() + f11, 0.0f));
        }
    }

    /* renamed from: HP */
    private void m38697HP() {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && this.f40897l1 == 1) {
            cameraPreviewController.m38558L0();
            return;
        }
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.m38217E2();
        }
    }

    /* renamed from: HQ */
    private String m38698HQ() {
        CameraInputParams cameraInputParams;
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null) {
            if (cameraEditorController.m38211C4()) {
                int i11 = this.f40895k1;
                if (i11 != 4 && (i11 != 7 || !this.f40883e1.m38209B4())) {
                    return this.f40883e1.f40583Z1;
                }
                return this.f40883e1.getOriginalMediaPath();
            }
            if (this.f40883e1.m38209B4() && (cameraInputParams = this.f40891i1) != null && !TextUtils.isEmpty(cameraInputParams.f41141y)) {
                return this.f40891i1.f41141y;
            }
            return this.f40883e1.getOriginalMediaPath();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:            if (java.util.Arrays.asList(vg.AbstractC28025b8.f130855l).contains(r2) != false) goto L63;     */
    /* renamed from: HR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m38699HR(int i11, Object[] objArr) {
        CameraPreviewController cameraPreviewController;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
            return;
        }
        if (i11 == 44) {
            String str = (String) objArr[0];
            if (this.f40897l1 == 1 && (cameraPreviewController = this.f40881d1) != null && cameraPreviewController.isShown()) {
                if (Arrays.asList(AbstractC28025b8.f130854k).contains(str)) {
                    this.f40918v2.sendMessage(this.f40918v2.obtainMessage(3, str));
                }
            } else if (this.f40897l1 == 2) {
                CameraEditorController cameraEditorController = this.f40883e1;
                if (cameraEditorController != null) {
                    if (cameraEditorController.isShown()) {
                    }
                }
            }
            AbstractC23350e.m122776f("ZaloCameraView", e11);
            return;
        }
        if (i11 == 60061) {
            onEnterForeground();
        } else if (i11 == 60062) {
            onEnterBackground();
        }
    }

    /* renamed from: HS */
    public void m38700HS(float f11) {
        GalleryPickerMini galleryPickerMini;
        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
        if (galleryPickerContainer != null && (galleryPickerMini = galleryPickerContainer.f41260p) != null) {
            float height = galleryPickerMini.getHeight();
            if (f11 <= height) {
                height = Math.max(f11, 0.0f);
            }
            this.f40852K1.f41260p.setTranslationY(height);
        }
    }

    /* renamed from: IR */
    public /* synthetic */ void m38704IR(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        if (!this.f40873Z0.getRender().m1979o0()) {
            this.f40873Z0.getRender().m1985w0();
        }
        this.f40873Z0.getRender().m1969e0(interfaceC27243b, colorFilterConfig);
        this.f40873Z0.mo39680s();
    }

    /* renamed from: IS */
    public void m38705IS() {
        this.f40846G2 = false;
        m39040XS();
    }

    /* renamed from: IT */
    private void m38706IT() {
        int m147478n;
        int i11 = this.f40891i1.f41131t;
        if (i11 == -1) {
            m147478n = this.f40885f1.m147499l();
        } else if (i11 == 0) {
            m147478n = C29667y.m147458p().m147479o();
        } else {
            m147478n = C29667y.m147458p().m147478n();
        }
        if (m147478n == -1 || m147478n >= C29667y.m147458p().m147480q()) {
            this.f40885f1.m147508v(0);
            m147478n = 0;
        }
        if (m147478n > -1) {
            this.f40881d1.setCameraIndex(m147478n);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.camera.x3.<init>(com.zing.zalo.camera.ZaloCameraView, java.lang.String, xe.a, long):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: JP */
    private void m38710JP(long r8, p642xe.C29605a r10) {
        /*
            r7 = this;
            if (r10 != 0) goto L3
            return
        L3:
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r10.m147140q()
            if (r0 == 0) goto L18
            r0 = 0
            r10.m147143t(r0)
            com.zing.zalo.camera.filterpicker.FilterPickerView r0 = r7.f40854M1
            if (r0 == 0) goto L18
            r0.m39270U(r10)
        L18:
            r7.m39021GT(r8)
            r7.f40859R1 = r10
            long r8 = r10.m147131h()
            java.lang.String r2 = java.lang.String.valueOf(r8)
            tg.h r8 = new tg.h
            r8.<init>(r10)
            tg.y r9 = tg.C26674y.m136865t()
            com.zing.zalo.camera.x3 r6 = new com.zing.zalo.camera.x3
            r0 = r6
            r1 = r7
            r3 = r10
            r0.<init>()
            java.lang.String r10 = "anim_filter_camera"
            r9.m136876l(r8, r10, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.camera.ZaloCameraView.m38710JP(long, xe.a):void");
    }

    /* renamed from: JQ */
    public void m38711JQ(C27239a c27239a) {
        long m139374a = c27239a.m139374a();
        C29605a m142142p = C28208v2.m142128t().m142142p(m139374a, c27239a.m139375b());
        if (m142142p != null) {
            m38832aQ(m139374a, m142142p);
            if (m38655AR()) {
                m39038VT(true, new int[0]);
                m38973uT(m142142p, 550L);
            }
        }
    }

    /* renamed from: JR */
    public /* synthetic */ void m38712JR(long j11, C29605a c29605a) {
        try {
            m38710JP(j11, c29605a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: JS */
    private void m38713JS() {
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageDecorView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.f40873Z0.setLayoutParams(layoutParams);
            this.f40873Z0.mo39680s();
            this.f40873Z0.setScaleType(0);
            AbstractC23136l9.m118744r1(this.f40873Z0, 0);
        }
    }

    /* renamed from: KP */
    private void m38717KP() {
        m38672DQ(new C7529h0());
    }

    /* renamed from: KR */
    public /* synthetic */ void m38718KR() {
        try {
            this.f88756W = 1;
            m39060lT(false);
            super.finish();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: KS */
    private void m38719KS(JSONObject jSONObject) {
        if (!AbstractC22470k.m116158j(this.f40895k1, 1, 3, 2) && (!AbstractC22470k.m116158j(this.f40895k1, 7) || this.f40891i1.m39215d())) {
            if (jSONObject == null) {
                try {
                    if (!m38655AR() && !C26694o.f126494c) {
                        CameraInputParams cameraInputParams = this.f40891i1;
                        int i11 = cameraInputParams.f41123p;
                        int i12 = cameraInputParams.f41125q;
                        cameraInputParams.f41123p = i12;
                        cameraInputParams.f41125q = AbstractC23121k5.m118608f(i11, i12);
                    }
                    C18607n render = this.f40873Z0.getRender();
                    CameraInputParams cameraInputParams2 = this.f40891i1;
                    render.m98265H1(cameraInputParams2.f41123p, cameraInputParams2.f41125q);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                    return;
                }
            }
            CameraInputParams cameraInputParams3 = this.f40891i1;
            this.f40865V0.setLayoutParams(new FrameLayout.LayoutParams(cameraInputParams3.f41123p, cameraInputParams3.f41125q));
            return;
        }
        try {
            CameraInputParams cameraInputParams4 = this.f40891i1;
            C25977a m133805b = C25977a.m133805b(cameraInputParams4.f41123p, cameraInputParams4.f41125q, AbstractC26689j.m137077D(this.f40899m1));
            CameraInputParams cameraInputParams5 = this.f40891i1;
            float max = Math.max(cameraInputParams5.f41123p / m133805b.f123940a, cameraInputParams5.f41125q / m133805b.f123941b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (m133805b.f123940a * max), (int) (m133805b.f123941b * max));
            if (AbstractC22463d.m116126a(m92689tK(), AbstractC32212c.m155331a(m92648SI())) && !C26694o.f126494c) {
                int i13 = layoutParams.width;
                layoutParams.width = layoutParams.height;
                layoutParams.height = i13;
            }
            m38740NP(layoutParams);
            this.f40865V0.setLayoutParams(layoutParams);
            if (jSONObject == null || this.f40897l1 == 1) {
                this.f40873Z0.getRender().m98265H1(layoutParams.width, layoutParams.height);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ZaloCameraView", e12);
        }
    }

    /* renamed from: KT */
    public void m38720KT() {
        if (this.f40883e1 == null) {
            this.f40883e1 = m38848cR();
        }
    }

    /* renamed from: LP */
    public void m38724LP() {
        m38672DQ(new C7531i0());
    }

    /* renamed from: LQ */
    private void m38725LQ() {
        int i11 = this.f40895k1;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 7) {
                            if (i11 == 9) {
                                if (this.f40891i1.m39215d()) {
                                    m38732MP(2);
                                    return;
                                } else {
                                    m38732MP(1);
                                    return;
                                }
                            }
                            return;
                        }
                        if (!AbstractC23309i.m121969h5()) {
                            this.f40873Z0.setScaleType(1);
                        }
                        if (this.f40891i1.m39215d()) {
                            m38732MP(2);
                            return;
                        }
                        m38732MP(1);
                        m38706IT();
                        this.f40881d1.m38555G0();
                        return;
                    }
                    m38732MP(2);
                    return;
                }
                m38732MP(2);
                this.f40869X0.setDisableTouch(true);
                return;
            }
            m38732MP(1);
            return;
        }
        m38732MP(1);
        this.f40881d1.m38555G0();
    }

    /* renamed from: LR */
    public /* synthetic */ void m38726LR() {
        C28139n5.m141620j().m141636h();
        C28193t5.m141757e().m141761d(new C7524f(), false);
    }

    /* renamed from: LS */
    public void m38727LS(Bitmap bitmap) {
        try {
            AbstractC23237v1.m119714b("capture", "end getScreenBitmapAsync");
            m38720KT();
            this.f40883e1.setEditorRecordMode(this.f40881d1.getPreviewRecordMode());
            this.f40883e1.m38289r8(false);
            String valueOf = String.valueOf(bitmap.getGenerationId());
            if (AbstractC22470k.m116158j(this.f40895k1, 0, 7, 1, 3)) {
                this.f40900m2.m125231M0(1, 15000L);
                CameraEditorController cameraEditorController = this.f40883e1;
                this.f40881d1.f40770g0 = null;
                cameraEditorController.f40583Z1 = null;
                File m114581e = AbstractC21943a.m114581e();
                String path = m114581e.getPath();
                AbstractC27985d.m141004u(bitmap, m114581e, new AbstractC27985d.d() { // from class: com.zing.zalo.camera.z3
                    public /* synthetic */ C7810z3() {
                    }

                    @Override // ve.AbstractC27985d.d
                    /* renamed from: a */
                    public final void mo39425a(int i11, String str) {
                        ZaloCameraView.this.m38856dS(i11, str);
                    }
                });
                valueOf = path;
            }
            if (!this.f40891i1.f41087F) {
                m38751OT(bitmap, valueOf);
            }
            if (this.f40891i1.m39212a()) {
                m38770RP();
            }
            m38805WP();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: LT */
    private void m38728LT() {
        CameraPreviewController cameraPreviewController = (CameraPreviewController) ((ViewStub) this.f40875a1.findViewById(AbstractC6918a0.stub_preview_controller)).inflate();
        this.f40881d1 = cameraPreviewController;
        cameraPreviewController.m38580d1(this, this.f40873Z0, this.f40891i1);
        m38706IT();
        CameraPreviewController.InterfaceC7513q m39005zQ = m39005zQ();
        this.f40881d1.setEventListener(m39005zQ);
        InterfaceC29634a interfaceC29634a = this.f40881d1.f40752T;
        if (interfaceC29634a != null) {
            m39005zQ.mo38649i(interfaceC29634a.mo147377h());
        }
    }

    /* renamed from: MP */
    public void m38732MP(int i11) {
        this.f40897l1 = i11;
        m38656AS(m38903kQ());
    }

    /* renamed from: MQ */
    private void m38733MQ() {
        if (this.f40897l1 == 1) {
            AbstractC23136l9.m118744r1(this.f40867W0, 8);
            if (!this.f40881d1.m38589o1()) {
                AbstractC23136l9.m118744r1(this.f40881d1, 0);
            }
            m38665CP();
            this.f40881d1.m38576X2();
            if (m38655AR()) {
                this.f40881d1.m38581f1(this.f40901n1);
                return;
            }
            return;
        }
        m38665CP();
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            AbstractC23136l9.m118744r1(cameraPreviewController, 8);
        }
    }

    /* renamed from: MS */
    public void m38735MS(boolean z11) {
        float f11;
        if (this.f40854M1 != null) {
            if (m39071qR()) {
                f11 = this.f40854M1.getTranslationY();
            } else {
                f11 = 0.0f;
            }
            float height = this.f40854M1.getHeight();
            int i11 = ((int) (((height - f11) * 100.0f) / height)) + 150;
            if (z11 && f11 > height / 2.0f) {
                this.f40869X0.setCanInterceptTouch(true);
                m39038VT(false, i11);
                m38671DP(false);
                return;
            }
            m38947rQ(i11).start();
        }
    }

    /* renamed from: MT */
    private void m38736MT() {
        Intent intent;
        this.f40866V1 = false;
        AbstractC20110a.m104541j("setupViews", new Object[0]);
        m38993xS(m92692wK().mo35575n1());
        CameraInputParams cameraInputParams = this.f40891i1;
        if (cameraInputParams.f41123p == 0 && cameraInputParams.f41125q == 0) {
            if (m92676n2() != null && m92676n2().mo35586v2()) {
                int m118766z = AbstractC23136l9.m118766z(getContext());
                int m118763y = AbstractC23136l9.m118763y(getContext());
                this.f40891i1.f41123p = Math.min(m118766z, m118763y);
                this.f40891i1.f41125q = Math.max(m118766z, m118763y);
            } else {
                this.f40891i1.f41123p = AbstractC19849s1.m103551c();
                this.f40891i1.f41125q = AbstractC19849s1.m103550b();
            }
            if (C26694o.f126494c) {
                if (m92676n2() != null) {
                    Activity mo35575n1 = m92692wK().mo35575n1();
                    if (mo35575n1 != null) {
                        C2104g0 mo11343a = AbstractC2106h0.m11341a().mo11343a(mo35575n1);
                        this.f40891i1.f41123p = mo11343a.m11339a().width();
                        this.f40891i1.f41125q = mo11343a.m11339a().height();
                    } else {
                        this.f40891i1.f41123p = AbstractC23136l9.m118722k0();
                        this.f40891i1.f41125q = AbstractC23136l9.m118713h0();
                    }
                } else {
                    throw new IllegalStateException("Can not init inputParams.screenWidth/Height due to null activity");
                }
            }
        }
        if (m39020GQ() == 7) {
            intent = new Intent();
            intent.putExtra("extra_result_original_path", m38970uQ());
        } else {
            intent = null;
        }
        mo50035CK(0, intent);
        FrameLayout frameLayout = this.f40875a1;
        if (frameLayout != null) {
            this.f40871Y0.removeView(frameLayout);
        }
        mo79283UI(null).inflate(AbstractC7409c0.camera_main_controller, (ViewGroup) this.f40871Y0, true);
        FrameLayout frameLayout2 = (FrameLayout) this.f40871Y0.findViewById(AbstractC6918a0.controller_group);
        this.f40875a1 = frameLayout2;
        this.f40867W0 = (RecyclingImageView) frameLayout2.findViewById(AbstractC6918a0.imv_placeholder);
        m39042YT(true);
        this.f40869X0.setDisableTouch(false);
        this.f40871Y0.setDisableTouch(false);
        this.f40903o1 = m38933pQ();
    }

    /* renamed from: NP */
    private void m38740NP(ViewGroup.LayoutParams layoutParams) {
        int i11 = layoutParams.width;
        if (i11 % 2 == 1) {
            layoutParams.width = i11 + 1;
        }
        int i12 = layoutParams.height;
        if (i12 % 2 == 1) {
            layoutParams.height = i12 + 1;
        }
    }

    /* renamed from: NQ */
    private void m38741NQ(int i11, Intent intent) {
        try {
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null && this.f40897l1 == 2) {
                cameraEditorController.m38241O6();
            }
            if (i11 == -1 && intent != null) {
                MusicSelectResult m133690a = AbstractC25952c.m133690a(intent);
                if (m133690a != null) {
                    this.f40900m2.m125229J0(m133690a.m45749b());
                    m39082wS();
                    return;
                }
                return;
            }
            this.f40900m2.m125223C0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: NR */
    public /* synthetic */ void m38742NR(VideoItem videoItem) {
        try {
            if (AbstractC3460h.m17438f(videoItem.mo41081Q(), this.f40899m1) > AbstractC26689j.m137108q(this.f40899m1)) {
                videoItem.m41209E1(true);
            }
            mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.y3

                /* renamed from: q */
                public final /* synthetic */ VideoItem f41807q;

                public /* synthetic */ RunnableC7804y3(VideoItem videoItem2) {
                    r2 = videoItem2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.this.m38734MR(r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: NS */
    public void m38743NS(boolean z11) {
        float f11;
        GalleryPickerMini galleryPickerMini;
        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
        if (galleryPickerContainer == null) {
            return;
        }
        if (galleryPickerContainer.getGalleryPickerMode() == 0 && m38964tR()) {
            f11 = this.f40852K1.f41260p.getTranslationY();
        } else {
            f11 = 0.0f;
        }
        if (this.f40852K1.getGalleryPickerMode() == 0 && (galleryPickerMini = this.f40852K1.f41260p) != null) {
            float height = galleryPickerMini.getHeight();
            int i11 = ((int) (((height - f11) * 100.0f) / height)) + 150;
            if (z11 && f11 > height / 2.0f) {
                this.f40869X0.setCanInterceptTouch(true);
                m39041XT(false, i11);
            } else if (m38964tR()) {
                m38963tQ(i11).start();
            }
        }
    }

    /* renamed from: NT */
    public void m38744NT(String str, int i11, int i12, boolean z11, boolean z12, boolean z13) {
        CameraPreviewController cameraPreviewController;
        try {
            if (!mo60294yp()) {
                CameraPreviewController cameraPreviewController2 = this.f40881d1;
                if (cameraPreviewController2 != null) {
                    cameraPreviewController2.m38570U0();
                }
                m38732MP(2);
                if ((AbstractC22470k.m116158j(this.f40895k1, 7) && z12 && AbstractC23309i.m121969h5()) || (AbstractC22470k.m116158j(this.f40895k1, 1, 5, 9) && (cameraPreviewController = this.f40881d1) != null && cameraPreviewController.f40767d0 == null)) {
                    this.f40883e1.m38261a4(str, i11, i12, z11, z12, z13);
                } else {
                    CameraPreviewController cameraPreviewController3 = this.f40881d1;
                    if (cameraPreviewController3 != null) {
                        this.f40883e1.m38301x7(str, i11, i12, z11, z12, z13, cameraPreviewController3.f40767d0);
                    }
                }
                m38843bU(false, false);
                m38759PT(true, true);
                this.f40883e1.m38299x2();
                if (this.f40891i1.m39212a()) {
                    m38770RP();
                    return;
                }
                return;
            }
            if (z13) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.n3

                    /* renamed from: p */
                    public final /* synthetic */ String f41396p;

                    public /* synthetic */ RunnableC7697n3(String str2) {
                        r1 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.m38922nS(r1);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: OP */
    private boolean m38748OP(boolean z11) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                ArrayList arrayList = new ArrayList();
                if (!this.f40891i1.m39215d()) {
                    arrayList.add("android.permission.CAMERA");
                }
                if (AbstractC22462c.m116125a(this.f40891i1) && ((AbstractC22470k.m116164p(this.f40895k1, 7) || (AbstractC22470k.m116158j(this.f40895k1, 7) && !this.f40891i1.m39215d())) && !this.f40891i1.f41090I)) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                if (AbstractC23034c6.m118167n(m92648SI(), strArr) != 0) {
                    if (z11) {
                        this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.f3

                            /* renamed from: q */
                            public final /* synthetic */ String[] f41177q;

                            public /* synthetic */ RunnableC7600f3(String[] strArr2) {
                                r2 = strArr2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloCameraView.this.m38692GR(r2);
                            }
                        });
                        return false;
                    }
                    return false;
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
                return true;
            }
        }
        return true;
    }

    /* renamed from: OQ */
    private void m38749OQ(boolean z11, boolean z12, int... iArr) {
        int m118742r;
        int i11;
        try {
            if (m38934pR()) {
                this.f40855N1.cancel();
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null) {
                FrameLayout frameLayout = cameraEditorController.f40642s;
                if (z12) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                AbstractC23136l9.m118744r1(frameLayout, i11);
            }
            if (z12) {
                if (this.f40854M1 == null) {
                    this.f40854M1 = m38877gR();
                    m38857dT(this.f40870X1, this.f40859R1);
                }
                if (z11) {
                    this.f40869X0.setCanInterceptTouch(false);
                }
                m39041XT(false, new int[0]);
                CameraPreviewController cameraPreviewController = this.f40881d1;
                if (cameraPreviewController != null) {
                    cameraPreviewController.m38573V2(true);
                    int i12 = this.f40897l1;
                    if (i12 == 1) {
                        AbstractC28025b8.m141442M("tip.camera.capture.filter");
                        this.f40881d1.m38564P0("tip.camera.capture.filter");
                    } else if (i12 == 2) {
                        AbstractC28025b8.m141442M("tip.camera.preview.filter");
                        this.f40881d1.m38564P0("tip.camera.preview.filter");
                    }
                    if (this.f40881d1.m38594s1()) {
                        m39036TT(false, true, false);
                    }
                }
                CameraEditorController cameraEditorController2 = this.f40883e1;
                if (cameraEditorController2 != null) {
                    cameraEditorController2.m38264c8(false, false);
                    this.f40883e1.m38232K3();
                    this.f40883e1.m38239M7(false);
                    this.f40883e1.m38272f8(false);
                    if (AbstractC26689j.f126436b) {
                        this.f40883e1.m38267d8(false);
                    }
                    this.f40883e1.setEditingMode(7);
                    this.f40883e1.m38295t8(true);
                }
                AbstractC23136l9.m118744r1(this.f40854M1, 0);
                this.f40854M1.bringToFront();
                this.f40854M1.setAutoApplyPrevFilter(this.f40856O1);
                this.f40854M1.setAutoApplyNextFilter(this.f40857P1);
                this.f40854M1.setLastFilterAnim(this.f40858Q1);
                this.f40854M1.setThumbPath(m38698HQ());
                this.f40854M1.setCameraInput(m38903kQ());
                this.f40854M1.m39272W(z11);
            } else {
                if (!m39071qR()) {
                    return;
                }
                if (z11) {
                    this.f40869X0.setCanInterceptTouch(true);
                }
                AbstractC23136l9.m118744r1(this.f40854M1, 0);
                CameraPreviewController cameraPreviewController2 = this.f40881d1;
                if (cameraPreviewController2 != null) {
                    cameraPreviewController2.m38573V2(false);
                }
                CameraEditorController cameraEditorController3 = this.f40883e1;
                if (cameraEditorController3 != null) {
                    cameraEditorController3.setEditingMode(0);
                    this.f40883e1.m38295t8(false);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.f40854M1, "alpha", 0.0f));
                if (z11) {
                    FilterPickerView filterPickerView = this.f40854M1;
                    float[] fArr = new float[1];
                    if (filterPickerView.getHeight() > 0) {
                        m118742r = this.f40854M1.getHeight();
                    } else {
                        m118742r = AbstractC23136l9.m118742r(140.0f);
                    }
                    fArr[0] = m118742r / 2.0f;
                    arrayList.add(ObjectAnimator.ofFloat(filterPickerView, "translationY", fArr));
                }
                animatorSet.playTogether(arrayList);
                if (iArr.length > 0) {
                    int i13 = iArr[0];
                    if (i13 < 0) {
                        i13 = 20;
                    }
                    animatorSet.setDuration(i13);
                } else {
                    animatorSet.setDuration(250L);
                }
                animatorSet.setInterpolator(new C26087b());
                this.f40855N1 = animatorSet;
                animatorSet.addListener(new C7543p());
                this.f40855N1.start();
            }
            if (!z12) {
                m38697HP();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: OR */
    public /* synthetic */ void m38750OR(boolean z11, long j11, C29605a c29605a) {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController == null || !cameraPreviewController.f40769f0) {
            Animator animator = this.f40868W1;
            if (animator != null && animator.isStarted()) {
                return;
            }
            if (c29605a.m147138o() == 1 && c29605a.m147139p() > c29605a.m147137n()) {
                c29605a.m147146w(c29605a.m147139p());
                C28208v2.m142128t().m142135C(this.f40870X1, c29605a);
            }
            m38842bT(j11, c29605a, z11);
        }
    }

    /* renamed from: OT */
    private void m38751OT(Bitmap bitmap, String str) {
        if (AbstractC22470k.m116158j(this.f40895k1, 0) && this.f40891i1.m39213b()) {
            this.f40873Z0.getRender().m98317t2(this.f40873Z0.getWidth(), this.f40873Z0.getHeight());
            this.f40883e1.m38237L5();
            this.f40883e1.m38212C6(true, new int[0]);
        }
        this.f40873Z0.m39786t0(bitmap, str, null);
        this.f40883e1.setEditingMediaType(1);
        this.f40883e1.m38237L5();
        this.f40883e1.setBitmapCroppedOrRotated(false);
        this.f40883e1.setMediaPickedFromGallery(false);
        this.f40883e1.m38275g8(null);
        AnimatorSet m38807WS = m38807WS();
        m38807WS.addListener(new C7532j());
        m38807WS.start();
        if (this.f40881d1.m38584i1()) {
            this.f40883e1.m38210B7(bitmap);
        }
    }

    /* renamed from: PP */
    private void m38755PP(JSONObject jSONObject) {
        if (jSONObject == null && !TextUtils.isEmpty(this.f40891i1.f41083B)) {
            try {
                jSONObject = new JSONObject(this.f40891i1.f41083B);
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
        try {
            AbstractC26689j.f126436b = AbstractC23309i.m121905fg();
            m38736MT();
            if (!this.f40891i1.m39215d()) {
                m38728LT();
                if (this.f40891i1.m39213b()) {
                    m38720KT();
                }
            } else {
                m38720KT();
            }
            m38778SQ();
            m38713JS();
            m38725LQ();
            m38957sT(jSONObject);
            m38733MQ();
            m38763QQ();
            m38719KS(jSONObject);
            m38656AS(m38903kQ());
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ZaloCameraView", e12);
        }
    }

    /* renamed from: PQ */
    private void m38756PQ(boolean z11, boolean z12, int... iArr) {
        try {
            AnimatorSet animatorSet = this.f40853L1;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f40853L1.cancel();
            }
            if (z12) {
                if (this.f40852K1 == null) {
                    m38884hR();
                }
                m39038VT(false, new int[0]);
                if (z11) {
                    this.f40869X0.setCanInterceptTouch(false);
                }
                AbstractC23136l9.m118744r1(this.f40852K1, 0);
                this.f40852K1.bringToFront();
                if (AbstractC22463d.m116126a(m92648SI(), AbstractC32212c.m155331a(m92648SI()))) {
                    this.f40852K1.m39332h(z11);
                    return;
                } else {
                    this.f40852K1.m39333i(z11);
                    return;
                }
            }
            GalleryPickerContainer galleryPickerContainer = this.f40852K1;
            if (galleryPickerContainer != null && galleryPickerContainer.isShown()) {
                m38869fQ(z11, iArr);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: PR */
    public /* synthetic */ void m38757PR() {
        try {
            this.f40869X0.setCanInterceptTouch(true);
            m38826ZQ();
            m38671DP(false);
            ToastUtils.m89266n(AbstractC8020f0.zalo_camera_filter_not_available, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: PS */
    private void m38758PS(String str) {
        this.f40881d1.f40770g0 = str;
        this.f40883e1.m38286o8(str);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.c4

            /* renamed from: q */
            public final /* synthetic */ String f41028q;

            public /* synthetic */ RunnableC7573c4(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38878gS(r2);
            }
        });
        if (this.f40891i1.f41087F) {
            m39060lT(false);
            Bundle bundle = new Bundle();
            CameraInputParams cameraInputParams = this.f40891i1;
            if (cameraInputParams.f41084C) {
                bundle.putString("STR_EXTRA_IMG_PATH", str2);
                if (m92676n2() != null) {
                    m92662fJ().m93066i2(PreviewUpdateAvatarView.class, bundle, 15073619, 0, true);
                }
            } else if (cameraInputParams.f41085D) {
                bundle.putString("STR_EXTRA_IMG_PATH", str2);
                if (m92676n2() != null) {
                    m92662fJ().m93066i2(PreviewUpdateCoverView.class, bundle, 15073618, 0, true);
                }
            } else if (cameraInputParams.f41100S) {
                Intent intent = new Intent();
                intent.putExtra("extra_result_output_path", str2);
                mo50035CK(-1, intent);
                finish();
            }
        }
        AbstractC23237v1.m119713a("savePicture");
        AbstractC23237v1.m119713a("capture");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0009, B:11:0x0019, B:13:0x002c, B:16:0x0035, B:17:0x0040, B:19:0x004e, B:22:0x003b, B:23:0x0052, B:25:0x0059, B:27:0x0068, B:30:0x0071, B:31:0x007c, B:33:0x0080, B:36:0x0077, B:37:0x0084, B:40:0x008d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0009, B:11:0x0019, B:13:0x002c, B:16:0x0035, B:17:0x0040, B:19:0x004e, B:22:0x003b, B:23:0x0052, B:25:0x0059, B:27:0x0068, B:30:0x0071, B:31:0x007c, B:33:0x0080, B:36:0x0077, B:37:0x0084, B:40:0x008d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: PT */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38759PT(boolean z11, boolean z12) {
        DragToCloseLayout dragToCloseLayout;
        DragToCloseLayout dragToCloseLayout2;
        try {
            if (this.f40883e1 == null) {
                return;
            }
            Animator animator = this.f40882d2;
            if (animator != null) {
                animator.cancel();
                this.f40882d2 = null;
            }
            if (z11) {
                this.f40883e1.m38281j3(true);
                this.f40883e1.setAlpha(1.0f);
                this.f40883e1.m38245Q6();
                if (AbstractC26689j.f126436b && this.f40883e1.m38233K4()) {
                    this.f40883e1.setVisibilityTopAndBottom(0);
                    this.f40873Z0.m39791y0();
                    this.f40873Z0.mo39680s();
                    dragToCloseLayout2 = this.f40869X0;
                    if (dragToCloseLayout2 == null) {
                        dragToCloseLayout2.setDisableTouch(true);
                        return;
                    }
                    return;
                }
                AbstractC23136l9.m118744r1(this.f40883e1, 0);
                this.f40873Z0.m39791y0();
                this.f40873Z0.mo39680s();
                dragToCloseLayout2 = this.f40869X0;
                if (dragToCloseLayout2 == null) {
                }
            } else {
                this.f40883e1.m38281j3(false);
                if (!z12) {
                    this.f40883e1.setAlpha(1.0f);
                    this.f40883e1.m38264c8(false, true);
                    if (AbstractC26689j.f126436b && this.f40883e1.m38233K4()) {
                        this.f40883e1.setVisibilityTopAndBottom(4);
                        dragToCloseLayout = this.f40869X0;
                        if (dragToCloseLayout == null) {
                            dragToCloseLayout.setDisableTouch(false);
                            return;
                        }
                        return;
                    }
                    AbstractC23136l9.m118744r1(this.f40883e1, 4);
                    dragToCloseLayout = this.f40869X0;
                    if (dragToCloseLayout == null) {
                    }
                } else {
                    if (!this.f40883e1.isShown()) {
                        return;
                    }
                    AbstractC23136l9.m118744r1(this.f40883e1, 0);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f40883e1, "alpha", 0.0f);
                    this.f40882d2 = ofFloat;
                    ofFloat.setDuration(200L);
                    this.f40882d2.addListener(new C7520d(z11));
                    this.f40882d2.start();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: QQ */
    private void m38763QQ() {
        long j11;
        VideoBlendingParam videoBlendingParam;
        int i11;
        CameraEditorController cameraEditorController;
        if (this.f40891i1.m39215d()) {
            String m38970uQ = m38970uQ();
            if (!AbstractC23041d2.m118194A(m38970uQ)) {
                ToastUtils.m89266n(AbstractC8020f0.error_file_notexist, new Object[0]);
                mo50035CK(0, null);
                finish();
                return;
            }
            boolean z11 = true;
            if (this.f40903o1 == 1) {
                CameraEditorController cameraEditorController2 = this.f40883e1;
                if (cameraEditorController2 != null) {
                    cameraEditorController2.setEditingMode(0);
                    this.f40883e1.m38259Z3(m38970uQ);
                    if (!this.f40891i1.m39213b()) {
                        this.f40883e1.m38299x2();
                    }
                }
                if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
                    this.f40900m2.m125231M0(1, 15000L);
                }
            } else {
                long j12 = 0;
                if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
                    try {
                        Map m138617c = AbstractC26897a.m138617c(m38970uQ);
                        if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION)) {
                            String str = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION);
                            Objects.requireNonNull(str);
                            j12 = Long.parseLong(str);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("ZaloCameraView", e11);
                    }
                    if (this.f40881d1 == null || j12 <= r0.f40763a0) {
                        z11 = false;
                    }
                    j11 = j12;
                } else {
                    j11 = 0;
                    z11 = false;
                }
                if (z11) {
                    if (this.f40897l1 == 2 && (cameraEditorController = this.f40883e1) != null) {
                        cameraEditorController.m38235L3();
                    }
                    m38923nT(m38970uQ, null);
                } else if (this.f40891i1.f41140x0) {
                    m38950rU(m38970uQ);
                } else {
                    CameraEditorController cameraEditorController3 = this.f40883e1;
                    if (cameraEditorController3 != null) {
                        cameraEditorController3.m38261a4(m38970uQ, 0, 0, false, true, false);
                        C27373c c27373c = this.f40891i1.f41082A;
                        if (c27373c != null && (videoBlendingParam = c27373c.f128947T) != null && ((i11 = videoBlendingParam.f48264P) != 0 || videoBlendingParam.f48265Q != 0)) {
                            this.f40883e1.m38291s7(i11, videoBlendingParam.f48265Q, videoBlendingParam.f48266R, videoBlendingParam.f48267S, videoBlendingParam.f48268T);
                        }
                        this.f40883e1.m38299x2();
                        if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
                            this.f40900m2.m125231M0(2, j11);
                        }
                    }
                }
            }
            if (AbstractC22470k.m116158j(this.f40895k1, 7) && ((Boolean) this.f40916u2.m101506a()).booleanValue()) {
                String str2 = this.f40891i1.f41111d0;
                if (!TextUtils.isEmpty(str2)) {
                    StoryMusicAttachment storyMusicAttachment = new StoryMusicAttachment();
                    storyMusicAttachment.m46930h(str2);
                    storyMusicAttachment.m46931i(this.f40891i1.f41112e0);
                    storyMusicAttachment.m46934l(this.f40891i1.f41113f0);
                    storyMusicAttachment.m46935m(this.f40891i1.f41114g0);
                    storyMusicAttachment.m46932j(this.f40891i1.f41115h0);
                    storyMusicAttachment.m46933k(this.f40891i1.f41116i0);
                    CameraEditorController cameraEditorController4 = this.f40883e1;
                    if (cameraEditorController4 != null) {
                        cameraEditorController4.m38253U7(false);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f40900m2.m125222B0(str2, storyMusicAttachment);
                    }
                }
            }
        }
    }

    /* renamed from: QR */
    public /* synthetic */ void m38764QR(int i11) {
        this.f40860S1 = i11;
        this.f40873Z0.getRender().m1968d0(i11);
        this.f40873Z0.mo39680s();
    }

    /* renamed from: QS */
    public void m38765QS() {
        this.f40846G2 = true;
        m39040XS();
    }

    /* renamed from: QT */
    private void m38766QT() {
        AbstractC23136l9.m118744r1(this.f40878b2, 0);
        m38773RT(this.f40880c2, true);
    }

    /* renamed from: RP */
    private void m38770RP() {
        AbstractC2790b m141763g = C28193t5.m141757e().m141763g();
        if (m141763g != null && !this.f40883e1.m38305z4()) {
            AbstractC23309i.m121687Zp(m141763g.f11109a);
            this.f40883e1.setLocationFilterIntro(m141763g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0305 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0002, B:7:0x0020, B:9:0x0031, B:11:0x003b, B:12:0x006f, B:14:0x0073, B:16:0x0079, B:18:0x0083, B:19:0x00a4, B:20:0x00b5, B:21:0x00bc, B:22:0x00bd, B:25:0x00c9, B:27:0x00cf, B:28:0x00d4, B:30:0x00da, B:32:0x00e1, B:34:0x00e5, B:35:0x00e8, B:37:0x00ec, B:38:0x00f1, B:40:0x00f5, B:41:0x010d, B:43:0x0113, B:53:0x01c9, B:54:0x0308, B:61:0x01c6, B:62:0x01d0, B:64:0x01df, B:68:0x01ec, B:70:0x01f0, B:71:0x0251, B:73:0x0258, B:76:0x0260, B:77:0x026e, B:78:0x0301, B:80:0x0305, B:81:0x0263, B:82:0x0299, B:84:0x02ba, B:87:0x02c1, B:89:0x02cc, B:90:0x02d2, B:92:0x02df, B:93:0x02e1, B:95:0x02e5, B:96:0x02e7, B:97:0x02d0, B:98:0x01fb, B:99:0x0206, B:101:0x022c, B:103:0x0230, B:104:0x0241, B:105:0x00f9, B:107:0x00ff, B:109:0x0103, B:110:0x0106, B:112:0x010a, B:115:0x005f, B:45:0x0118, B:47:0x014f, B:49:0x0153, B:50:0x0166, B:52:0x0192, B:56:0x01be, B:58:0x01c2), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cc A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0002, B:7:0x0020, B:9:0x0031, B:11:0x003b, B:12:0x006f, B:14:0x0073, B:16:0x0079, B:18:0x0083, B:19:0x00a4, B:20:0x00b5, B:21:0x00bc, B:22:0x00bd, B:25:0x00c9, B:27:0x00cf, B:28:0x00d4, B:30:0x00da, B:32:0x00e1, B:34:0x00e5, B:35:0x00e8, B:37:0x00ec, B:38:0x00f1, B:40:0x00f5, B:41:0x010d, B:43:0x0113, B:53:0x01c9, B:54:0x0308, B:61:0x01c6, B:62:0x01d0, B:64:0x01df, B:68:0x01ec, B:70:0x01f0, B:71:0x0251, B:73:0x0258, B:76:0x0260, B:77:0x026e, B:78:0x0301, B:80:0x0305, B:81:0x0263, B:82:0x0299, B:84:0x02ba, B:87:0x02c1, B:89:0x02cc, B:90:0x02d2, B:92:0x02df, B:93:0x02e1, B:95:0x02e5, B:96:0x02e7, B:97:0x02d0, B:98:0x01fb, B:99:0x0206, B:101:0x022c, B:103:0x0230, B:104:0x0241, B:105:0x00f9, B:107:0x00ff, B:109:0x0103, B:110:0x0106, B:112:0x010a, B:115:0x005f, B:45:0x0118, B:47:0x014f, B:49:0x0153, B:50:0x0166, B:52:0x0192, B:56:0x01be, B:58:0x01c2), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02df A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0002, B:7:0x0020, B:9:0x0031, B:11:0x003b, B:12:0x006f, B:14:0x0073, B:16:0x0079, B:18:0x0083, B:19:0x00a4, B:20:0x00b5, B:21:0x00bc, B:22:0x00bd, B:25:0x00c9, B:27:0x00cf, B:28:0x00d4, B:30:0x00da, B:32:0x00e1, B:34:0x00e5, B:35:0x00e8, B:37:0x00ec, B:38:0x00f1, B:40:0x00f5, B:41:0x010d, B:43:0x0113, B:53:0x01c9, B:54:0x0308, B:61:0x01c6, B:62:0x01d0, B:64:0x01df, B:68:0x01ec, B:70:0x01f0, B:71:0x0251, B:73:0x0258, B:76:0x0260, B:77:0x026e, B:78:0x0301, B:80:0x0305, B:81:0x0263, B:82:0x0299, B:84:0x02ba, B:87:0x02c1, B:89:0x02cc, B:90:0x02d2, B:92:0x02df, B:93:0x02e1, B:95:0x02e5, B:96:0x02e7, B:97:0x02d0, B:98:0x01fb, B:99:0x0206, B:101:0x022c, B:103:0x0230, B:104:0x0241, B:105:0x00f9, B:107:0x00ff, B:109:0x0103, B:110:0x0106, B:112:0x010a, B:115:0x005f, B:45:0x0118, B:47:0x014f, B:49:0x0153, B:50:0x0166, B:52:0x0192, B:56:0x01be, B:58:0x01c2), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e5 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0002, B:7:0x0020, B:9:0x0031, B:11:0x003b, B:12:0x006f, B:14:0x0073, B:16:0x0079, B:18:0x0083, B:19:0x00a4, B:20:0x00b5, B:21:0x00bc, B:22:0x00bd, B:25:0x00c9, B:27:0x00cf, B:28:0x00d4, B:30:0x00da, B:32:0x00e1, B:34:0x00e5, B:35:0x00e8, B:37:0x00ec, B:38:0x00f1, B:40:0x00f5, B:41:0x010d, B:43:0x0113, B:53:0x01c9, B:54:0x0308, B:61:0x01c6, B:62:0x01d0, B:64:0x01df, B:68:0x01ec, B:70:0x01f0, B:71:0x0251, B:73:0x0258, B:76:0x0260, B:77:0x026e, B:78:0x0301, B:80:0x0305, B:81:0x0263, B:82:0x0299, B:84:0x02ba, B:87:0x02c1, B:89:0x02cc, B:90:0x02d2, B:92:0x02df, B:93:0x02e1, B:95:0x02e5, B:96:0x02e7, B:97:0x02d0, B:98:0x01fb, B:99:0x0206, B:101:0x022c, B:103:0x0230, B:104:0x0241, B:105:0x00f9, B:107:0x00ff, B:109:0x0103, B:110:0x0106, B:112:0x010a, B:115:0x005f, B:45:0x0118, B:47:0x014f, B:49:0x0153, B:50:0x0166, B:52:0x0192, B:56:0x01be, B:58:0x01c2), top: B:2:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d0 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x0002, B:7:0x0020, B:9:0x0031, B:11:0x003b, B:12:0x006f, B:14:0x0073, B:16:0x0079, B:18:0x0083, B:19:0x00a4, B:20:0x00b5, B:21:0x00bc, B:22:0x00bd, B:25:0x00c9, B:27:0x00cf, B:28:0x00d4, B:30:0x00da, B:32:0x00e1, B:34:0x00e5, B:35:0x00e8, B:37:0x00ec, B:38:0x00f1, B:40:0x00f5, B:41:0x010d, B:43:0x0113, B:53:0x01c9, B:54:0x0308, B:61:0x01c6, B:62:0x01d0, B:64:0x01df, B:68:0x01ec, B:70:0x01f0, B:71:0x0251, B:73:0x0258, B:76:0x0260, B:77:0x026e, B:78:0x0301, B:80:0x0305, B:81:0x0263, B:82:0x0299, B:84:0x02ba, B:87:0x02c1, B:89:0x02cc, B:90:0x02d2, B:92:0x02df, B:93:0x02e1, B:95:0x02e5, B:96:0x02e7, B:97:0x02d0, B:98:0x01fb, B:99:0x0206, B:101:0x022c, B:103:0x0230, B:104:0x0241, B:105:0x00f9, B:107:0x00ff, B:109:0x0103, B:110:0x0106, B:112:0x010a, B:115:0x005f, B:45:0x0118, B:47:0x014f, B:49:0x0153, B:50:0x0166, B:52:0x0192, B:56:0x01be, B:58:0x01c2), top: B:2:0x0002, inners: #1 }] */
    /* renamed from: RQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m38771RQ(int i11) {
        CameraEditorController cameraEditorController;
        CameraEditorController cameraEditorController2;
        int i12;
        int i13;
        double d11;
        double d12;
        double d13;
        CameraEditorController cameraEditorController3;
        int m155409h;
        try {
            boolean m116126a = AbstractC22463d.m116126a(m92689tK(), i11);
            AbstractC20110a.m104544m("handleOrientationChanged: %d", Integer.valueOf(i11));
            if (m92677nJ()) {
                return;
            }
            m38993xS(m92676n2().mo35575n1());
            if (m92676n2() != null && m92676n2().mo35586v2()) {
                int m118766z = AbstractC23136l9.m118766z(getContext());
                int m118763y = AbstractC23136l9.m118763y(getContext());
                this.f40891i1.f41123p = Math.min(m118766z, m118763y);
                this.f40891i1.f41125q = Math.max(m118766z, m118763y);
            } else {
                this.f40891i1.f41123p = AbstractC19849s1.m103551c();
                this.f40891i1.f41125q = AbstractC19849s1.m103550b();
            }
            if (C26694o.f126494c) {
                if (m92676n2() != null) {
                    Activity mo35575n1 = m92692wK().mo35575n1();
                    if (mo35575n1 != null) {
                        C2104g0 mo11343a = AbstractC2106h0.m11341a().mo11343a(mo35575n1);
                        this.f40891i1.f41123p = mo11343a.m11339a().width();
                        this.f40891i1.f41125q = mo11343a.m11339a().height();
                    } else {
                        this.f40891i1.f41123p = AbstractC23136l9.m118722k0();
                        this.f40891i1.f41125q = AbstractC23136l9.m118713h0();
                    }
                } else {
                    throw new IllegalStateException("Can not init inputParams.screenWidth/Height due to null activity");
                }
            }
            this.f40845G1 = i11;
            boolean z11 = C26694o.f126493b;
            if ((z11 && m116126a) || (!z11 && i11 != 0)) {
                if (m39071qR()) {
                    m39038VT(false, new int[0]);
                }
                if (m38964tR()) {
                    m39041XT(false, new int[0]);
                }
            }
            if (m116126a) {
                CameraEditorController cameraEditorController4 = this.f40883e1;
                if (cameraEditorController4 != null) {
                    cameraEditorController4.m38244P7(false);
                }
                CameraPreviewController cameraPreviewController = this.f40881d1;
                if (cameraPreviewController != null) {
                    m39043ZT(cameraPreviewController, 8);
                }
                CameraEditorController cameraEditorController5 = this.f40883e1;
                if (cameraEditorController5 != null) {
                    cameraEditorController5.m38274g3();
                }
            } else {
                if (!this.f40891i1.f41100S && (cameraEditorController = this.f40883e1) != null) {
                    cameraEditorController.m38244P7(true);
                }
                CameraPreviewController cameraPreviewController2 = this.f40881d1;
                if (cameraPreviewController2 != null) {
                    m39043ZT(cameraPreviewController2, 0);
                }
            }
            if (this.f40897l1 != 2) {
                this.f40918v2.removeMessages(2);
                try {
                    CameraInputParams cameraInputParams = this.f40891i1;
                    C25977a m133805b = C25977a.m133805b(cameraInputParams.f41123p, cameraInputParams.f41125q, AbstractC26689j.m137077D(this.f40899m1));
                    CameraInputParams cameraInputParams2 = this.f40891i1;
                    float max = Math.max(cameraInputParams2.f41123p / m133805b.f123940a, cameraInputParams2.f41125q / m133805b.f123941b);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (m133805b.f123940a * max), (int) (m133805b.f123941b * max));
                    if (m116126a && !C26694o.f126494c) {
                        layoutParams.width = (int) (m133805b.f123941b * max);
                        layoutParams.height = (int) (m133805b.f123940a * max);
                    }
                    m38740NP(layoutParams);
                    this.f40865V0.setLayoutParams(layoutParams);
                    this.f40873Z0.getRender().m98265H1(layoutParams.width, layoutParams.height);
                    ViewGroup.LayoutParams layoutParams2 = this.f40873Z0.getLayoutParams();
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    this.f40873Z0.setLayoutParams(layoutParams2);
                    if (m38955sR()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f40852K1.getLayoutParams();
                        layoutParams3.width = ((View) this.f40852K1.getParent()).getWidth();
                        layoutParams3.height = ((View) this.f40852K1.getParent()).getHeight();
                        layoutParams3.bottomMargin = 0;
                        this.f40852K1.setLayoutParams(layoutParams3);
                    } else {
                        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
                        if (galleryPickerContainer != null) {
                            galleryPickerContainer.m39330f(m116126a);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
                this.f40873Z0.m39780n0();
            } else {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                if (!AbstractC22470k.m116158j(this.f40895k1, f40829O2) && !AbstractC22470k.m116158j(this.f40895k1, f40828N2)) {
                    if (m116126a && !C26694o.f126494c) {
                        CameraInputParams cameraInputParams3 = this.f40891i1;
                        layoutParams4.width = cameraInputParams3.f41125q;
                        layoutParams4.height = cameraInputParams3.f41123p;
                    } else {
                        CameraInputParams cameraInputParams4 = this.f40891i1;
                        layoutParams4.width = cameraInputParams4.f41123p;
                        layoutParams4.height = cameraInputParams4.f41125q;
                    }
                    m38740NP(layoutParams4);
                    cameraEditorController2 = this.f40883e1;
                    if (cameraEditorController2 == null && cameraEditorController2.m38211C4()) {
                        if (m116126a) {
                            m155409h = AbstractC23222t7.f112593w0;
                        } else {
                            m155409h = AbstractC23222t7.f112517C0 + AbstractC32226c.m155409h(m92656bJ());
                        }
                        this.f40873Z0.getRender().m98270O1(layoutParams4.width, layoutParams4.height, this.f40883e1.f40497D0, m155409h);
                        ViewGroup.LayoutParams layoutParams5 = this.f40873Z0.getLayoutParams();
                        layoutParams5.width = -1;
                        layoutParams5.height = -1;
                        this.f40873Z0.setLayoutParams(layoutParams5);
                        this.f40865V0.setLayoutParams(layoutParams4);
                        this.f40873Z0.mo39680s();
                    } else {
                        this.f40865V0.setLayoutParams(layoutParams4);
                        int m98295i1 = this.f40873Z0.getRender().m98295i1();
                        int m98293h1 = this.f40873Z0.getRender().m98293h1();
                        CameraInputParams cameraInputParams5 = this.f40891i1;
                        i12 = cameraInputParams5.f41123p;
                        i13 = cameraInputParams5.f41125q;
                        if (m116126a && !C26694o.f126494c) {
                            i12 = i13;
                            i13 = i12;
                        }
                        d11 = m98295i1 / m98293h1;
                        d12 = i12;
                        d13 = i13;
                        if (d11 >= d12 / d13) {
                            i12 = (int) (d13 * d11);
                        } else {
                            i13 = (int) (d12 / d11);
                        }
                        this.f40873Z0.getRender().m98271P1(i12, i13);
                        if (i12 % 2 == 1) {
                            i12++;
                        }
                        if (i13 % 2 == 1) {
                            i13++;
                        }
                        this.f40873Z0.getRender().m98265H1(i12, i13);
                        ViewGroup.LayoutParams layoutParams6 = this.f40873Z0.getLayoutParams();
                        layoutParams6.width = i12;
                        layoutParams6.height = i13;
                        this.f40873Z0.setLayoutParams(layoutParams6);
                    }
                    cameraEditorController3 = this.f40883e1;
                    if (cameraEditorController3 != null) {
                        cameraEditorController3.m38250T5(i11);
                    }
                }
                CameraInputParams cameraInputParams6 = this.f40891i1;
                C25977a m133805b2 = C25977a.m133805b(cameraInputParams6.f41123p, cameraInputParams6.f41125q, AbstractC26689j.m137077D(this.f40899m1));
                CameraInputParams cameraInputParams7 = this.f40891i1;
                float max2 = Math.max(cameraInputParams7.f41123p / m133805b2.f123940a, cameraInputParams7.f41125q / m133805b2.f123941b);
                if (m116126a && !C26694o.f126494c) {
                    layoutParams4.width = (int) (m133805b2.f123941b * max2);
                    layoutParams4.height = (int) (m133805b2.f123940a * max2);
                } else {
                    layoutParams4.width = (int) (m133805b2.f123940a * max2);
                    layoutParams4.height = (int) (m133805b2.f123941b * max2);
                }
                m38740NP(layoutParams4);
                cameraEditorController2 = this.f40883e1;
                if (cameraEditorController2 == null) {
                }
                this.f40865V0.setLayoutParams(layoutParams4);
                int m98295i12 = this.f40873Z0.getRender().m98295i1();
                int m98293h12 = this.f40873Z0.getRender().m98293h1();
                CameraInputParams cameraInputParams52 = this.f40891i1;
                i12 = cameraInputParams52.f41123p;
                i13 = cameraInputParams52.f41125q;
                if (m116126a) {
                    i12 = i13;
                    i13 = i12;
                }
                d11 = m98295i12 / m98293h12;
                d12 = i12;
                d13 = i13;
                if (d11 >= d12 / d13) {
                }
                this.f40873Z0.getRender().m98271P1(i12, i13);
                if (i12 % 2 == 1) {
                }
                if (i13 % 2 == 1) {
                }
                this.f40873Z0.getRender().m98265H1(i12, i13);
                ViewGroup.LayoutParams layoutParams62 = this.f40873Z0.getLayoutParams();
                layoutParams62.width = i12;
                layoutParams62.height = i13;
                this.f40873Z0.setLayoutParams(layoutParams62);
                cameraEditorController3 = this.f40883e1;
                if (cameraEditorController3 != null) {
                }
            }
            this.f40918v2.removeMessages(5);
            Message message = new Message();
            message.what = 5;
            message.arg1 = i11;
            this.f40918v2.sendMessageDelayed(message, 0L);
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ZaloCameraView", e12);
        }
    }

    /* renamed from: RR */
    public /* synthetic */ void m38772RR(Bitmap bitmap) {
        this.f40867W0.setImageBitmap(bitmap);
    }

    /* renamed from: RT */
    private void m38773RT(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
    }

    /* renamed from: SP */
    public void m38777SP(MediaItem mediaItem, Intent intent) {
        if (!this.f40922x2 && mediaItem != null) {
            this.f40922x2 = true;
            AbstractC23258x2.m119964w(mediaItem.mo41081Q(), new C7523e0(intent));
        }
    }

    /* renamed from: SQ */
    private void m38778SQ() {
        String str;
        if (this.f40891i1.m39215d()) {
            String str2 = "";
            if (TextUtils.isEmpty(this.f40891i1.f41141y)) {
                str = "";
            } else {
                str = this.f40891i1.f41141y;
            }
            if (!TextUtils.isEmpty(this.f40891i1.f41142z)) {
                str2 = this.f40891i1.f41142z;
            }
            m39042YT(true ^ this.f40891i1.m39213b());
            m39079vS(str, str2, null);
            return;
        }
        m39023HT(true);
    }

    /* renamed from: SR */
    public /* synthetic */ void m38779SR(String str, String str2) {
        C3979l m123606l = this.f40889h1.m123606l(str, AbstractC23006a0.m117875E(), true, C23278z2.m120110a());
        if (m123606l == null) {
            C24003n m120068F = C23278z2.m120068F();
            m123606l = this.f40889h1.m123605k(str, m120068F.f116260a, m120068F.f116266g);
        }
        if (m123606l == null && !TextUtils.isEmpty(str2)) {
            C24003n m120073H0 = C23278z2.m120073H0();
            m123606l = this.f40889h1.m123605k(str2, m120073H0.f116260a, m120073H0.f116266g);
        }
        if (m123606l != null) {
            Bitmap m18839c = m123606l.m18839c();
            if (m18839c != null) {
                if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                    this.f40867W0.post(new Runnable() { // from class: com.zing.zalo.camera.u3

                        /* renamed from: q */
                        public final /* synthetic */ Bitmap f41583q;

                        public /* synthetic */ RunnableC7747u3(Bitmap m18839c2) {
                            r2 = m18839c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZaloCameraView.this.m38772RR(r2);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        C7525f0 c7525f0 = new C7525f0();
        c7525f0.m125773e3(true);
        ((C23528a) this.f40889h1.m123612r(this.f40867W0)).m123586J(str, true, true, AbstractC23006a0.m117875E(), 0, c7525f0, false, C23278z2.m120110a(), true);
    }

    /* renamed from: SS */
    public void m38780SS(Bundle bundle, int i11) {
        if (m92676n2() != null) {
            m92662fJ().m93066i2(VideoTrimView.class, bundle, i11, 0, true);
        }
    }

    /* renamed from: TP */
    private void m38784TP() {
        m38812XP();
    }

    /* renamed from: TQ */
    public void m38785TQ(Intent intent) {
        try {
            m39060lT(true);
            m39042YT(true);
            List m71440ZM = GalleryPickerView.m71440ZM(intent);
            m38864eT();
            if (m71440ZM.size() != 1) {
                m39042YT(false);
                ToastUtils.m89266n(AbstractC8020f0.qrcode_scan_load_image_error, new Object[0]);
            } else if (m71440ZM.get(0) instanceof VideoItem) {
                VideoItem videoItem = (VideoItem) m71440ZM.get(0);
                m39079vS(videoItem.mo41083a0(), "", null);
                CameraInputParams cameraInputParams = this.f40891i1;
                if (cameraInputParams != null) {
                    cameraInputParams.f41141y = videoItem.mo41083a0();
                }
                long m41213t1 = videoItem.m41213t1();
                if (m41213t1 == 0) {
                    m41213t1 = AbstractC3460h.m17442j(videoItem.mo41081Q());
                }
                if (m41213t1 > 0 && ((m41213t1 >= 3000 || !AbstractC22470k.m116158j(this.f40895k1, 7)) && (m41213t1 >= AbstractC26689j.m137116y(this.f40899m1) * 1000 || this.f40895k1 != 9))) {
                    long m137084K = AbstractC26689j.m137084K(this.f40899m1);
                    if (!m38666CR() && AbstractC23280z4.m120344o0(videoItem.m41130X(), m137084K)) {
                        AbstractC23280z4.m120360w0(getContext(), m137084K, this.f40899m1);
                        m39006zS();
                    } else {
                        this.f40925z1 = false;
                        m38732MP(2);
                        m38720KT();
                        this.f40883e1.setPositionInGallery(videoItem.m41121S());
                        if (AbstractC22470k.m116158j(this.f40895k1, 1)) {
                            if (AbstractC26689j.f126436b) {
                                this.f40883e1.setVideoInputPath(videoItem.mo41081Q());
                                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.w3

                                    /* renamed from: q */
                                    public final /* synthetic */ VideoItem f41784q;

                                    public /* synthetic */ RunnableC7792w3(VideoItem videoItem2) {
                                        r2 = videoItem2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ZaloCameraView.this.m38742NR(r2);
                                    }
                                });
                            } else {
                                m38734MR(videoItem2);
                            }
                        } else if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
                            if (m41213t1 <= AbstractC26689j.m137076C(this.f40899m1) * 1000) {
                                this.f40900m2.m125231M0(2, m41213t1);
                                m38744NT(videoItem2.mo41081Q(), 0, 0, false, true, false);
                            } else {
                                m38923nT(videoItem2.mo41081Q(), videoItem2.m41212s1());
                            }
                        } else if (this.f40895k1 == 9) {
                            this.f40883e1.setVideoInputPath(videoItem2.mo41081Q());
                            if (m41213t1 > AbstractC26689j.m137114w(this.f40899m1) * 1000) {
                                videoItem2.m41209E1(true);
                            }
                            m38734MR(videoItem2);
                        }
                    }
                }
                m39006zS();
                ToastUtils.m89266n(AbstractC8020f0.str_story_err_video_too_short, new Object[0]);
            } else {
                this.f40900m2.m125231M0(1, 15000L);
                m38720KT();
                MediaItem mediaItem = (MediaItem) m71440ZM.get(0);
                m38732MP(2);
                this.f40873Z0.m39759Q();
                m39079vS(mediaItem.mo41083a0(), "", null);
                m38720KT();
                this.f40883e1.setEditingMediaType(1);
                this.f40883e1.m38237L5();
                this.f40883e1.setBitmapCroppedOrRotated(false);
                this.f40883e1.setMediaPickedFromGallery(true);
                this.f40883e1.setPositionInGallery(mediaItem.m41121S());
                this.f40883e1.m38275g8(mediaItem.mo41081Q());
                m38759PT(true, true);
                m38843bU(false, false);
                this.f40883e1.m38299x2();
            }
            if (this.f40897l1 == 2) {
                this.f40873Z0.m39778l0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
            if (m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.qrcode_scan_load_image_error, new Object[0]);
            }
        }
    }

    /* renamed from: TR */
    public /* synthetic */ void m38786TR(int i11, int i12) {
        if (!m92674mJ()) {
            return;
        }
        AbstractC20110a.m104544m("onScreenSizeChanged: %dx%d", Integer.valueOf(i11), Integer.valueOf(i12));
        this.f40918v2.removeMessages(1);
        Message message = new Message();
        message.what = 1;
        message.arg1 = AbstractC32212c.m155331a(m92648SI());
        this.f40918v2.sendMessageDelayed(message, 0L);
    }

    /* renamed from: TS */
    private void m38787TS() {
        if (m92642L3() != null) {
            this.f40893j1 = (Conversation) m92642L3().getParcelable("extra_input_contact_profile");
        }
    }

    /* renamed from: UP */
    private void m38791UP() {
        this.f40859R1 = null;
        m39021GT(-10L);
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null) {
            filterPickerView.m39277z();
        }
        m38798VP();
    }

    /* renamed from: UQ */
    private void m38792UQ(int i11) {
        if (i11 == -1) {
            m38674EC(false);
        }
    }

    /* renamed from: UR */
    public /* synthetic */ void m38793UR(int i11) {
        this.f40900m2.m125231M0(2, i11);
    }

    /* renamed from: US */
    private void m38794US() {
        if (m92642L3() != null) {
            m38657AT((CameraInputParams) m92642L3().getParcelable("extra_input_params"));
        }
    }

    /* renamed from: VP */
    private void m38798VP() {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            this.f40896k2 = false;
            cameraEditorController.setSelectedQuickAccessFilter(false);
            return;
        }
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            this.f40896k2 = false;
            cameraPreviewController.setSelectedQuickAccessFilter(false);
        }
    }

    /* renamed from: VQ */
    private void m38799VQ(int i11) {
        if (i11 == -1) {
            m38674EC(false);
        }
    }

    /* renamed from: VR */
    public /* synthetic */ void m38800VR(int i11) {
        this.f40900m2.m125231M0(2, i11);
    }

    /* renamed from: VS */
    private void m38801VS() {
        TrackingSource trackingSource;
        try {
            if (m92642L3() != null && (trackingSource = (TrackingSource) m92642L3().getParcelable("TRACKING_SOURCE_POST_STORY_KEY")) != null) {
                this.f40902n2 = trackingSource;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: WP */
    public void m38805WP() {
        this.f40862T1 = this.f40859R1;
        this.f40864U1 = this.f40870X1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:            if (r1 != 4) goto L44;     */
    /* renamed from: WR */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m38806WR(int i11, InterfaceC17463d interfaceC17463d, int i12) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (i11 != 1) {
            if (i11 != 7) {
                if (i11 == 3) {
                    CameraEditorController cameraEditorController = this.f40883e1;
                    if (cameraEditorController != null) {
                        cameraEditorController.m38300x3(false);
                    }
                }
            }
            finish();
            return;
        }
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null) {
            imageDecorView.getRender().m98268M0();
        }
        m38862eQ();
    }

    /* renamed from: WS */
    public AnimatorSet m38807WS() {
        boolean z11;
        ImageButton imageButton;
        Animator animator = this.f40868W1;
        if (animator != null && animator.isStarted()) {
            this.f40868W1.cancel();
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC23136l9.m118744r1(this.f40883e1, 0);
        AbstractC23136l9.m118744r1(this.f40881d1.f40791v, 4);
        this.f40881d1.m38559L2(4);
        this.f40881d1.m38554F2(4);
        this.f40881d1.m38556G2(4);
        this.f40881d1.m38562N2(true);
        RecordButton recordButton = this.f40881d1.getRecordButton();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            this.f40883e1.f40638r.setAlpha(0.0f);
            this.f40883e1.f40638r.setTranslationY(-AbstractC23222t7.f112567j0);
            this.f40883e1.f40642s.setAlpha(0.0f);
            this.f40883e1.f40642s.setTranslationY(AbstractC23222t7.f112567j0);
            this.f40883e1.f40646t.setAlpha(0.0f);
            this.f40883e1.f40650u.setTranslationX(AbstractC23222t7.f112575n0);
            this.f40883e1.f40650u.setAlpha(0.0f);
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40638r, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40638r, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40642s, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40642s, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40646t, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40650u, "translationX", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40650u, "alpha", 1.0f));
        if (!z11 && (imageButton = this.f40883e1.f40668y1) != null) {
            imageButton.setAlpha(0.0f);
            this.f40883e1.f40668y1.setTranslationY(r0.getHeight());
        }
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "alpha", 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setStartDelay(50L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator(1.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet.setStartDelay(0L);
        animatorSet2.play(animatorSet);
        animatorSet2.addListener(new C7538m(recordButton));
        this.f40868W1 = animatorSet2;
        return animatorSet2;
    }

    /* renamed from: WT */
    private void m38808WT(boolean z11, int... iArr) {
        m38749OQ(false, z11, iArr);
    }

    /* renamed from: XP */
    private void m38812XP() {
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null) {
            imageDecorView.m39759Q();
            m38818YP();
        }
    }

    /* renamed from: XQ */
    public void m38734MR(VideoItem videoItem) {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null) {
            cameraEditorController.f40643s0 = videoItem.m41219z1();
        }
        m38744NT(videoItem.mo41081Q(), 0, 0, false, true, false);
    }

    /* renamed from: XR */
    public /* synthetic */ void m38814XR(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
                return;
            }
        }
        this.f40909r1 = true;
        m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* renamed from: YP */
    private void m38818YP() {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null) {
            cameraEditorController.m38266d3();
        }
    }

    /* renamed from: YQ */
    public void m38819YQ() {
        AbstractC23136l9.m118744r1(this.f40878b2, 8);
        m38773RT(this.f40880c2, false);
    }

    /* renamed from: YR */
    public static /* synthetic */ void m38820YR(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: YS */
    private void m38821YS() {
        try {
            if (this.f40854M1 == null) {
                FilterPickerView m38877gR = m38877gR();
                this.f40854M1 = m38877gR;
                AbstractC23136l9.m118744r1(m38877gR, 8);
            }
            m38857dT(this.f40870X1, this.f40859R1);
            m38828ZS(this.f40870X1, this.f40859R1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: ZP */
    private void m38825ZP(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        this.f40873Z0.getRender().m1952U(new Runnable() { // from class: com.zing.zalo.camera.g4

            /* renamed from: q */
            public final /* synthetic */ InterfaceC27243b f41258q;

            /* renamed from: r */
            public final /* synthetic */ ColorFilterConfig f41259r;

            public /* synthetic */ RunnableC7631g4(InterfaceC27243b interfaceC27243b2, ColorFilterConfig colorFilterConfig2) {
                r2 = interfaceC27243b2;
                r3 = colorFilterConfig2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38704IR(r2, r3);
            }
        });
        this.f40873Z0.mo39680s();
    }

    /* renamed from: ZQ */
    public void m38826ZQ() {
        if (!m38934pR()) {
            m39038VT(false, new int[0]);
        }
    }

    /* renamed from: ZR */
    public /* synthetic */ void m38827ZR(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null) {
            cameraEditorController.m38271f7();
        }
    }

    /* renamed from: ZS */
    private void m38828ZS(long j11, C29605a c29605a) {
        m38847cQ(j11, c29605a);
    }

    /* renamed from: aQ */
    private void m38832aQ(long j11, C29605a c29605a) {
        m38842bT(j11, c29605a, true);
    }

    /* renamed from: aR */
    public void m38833aR() {
        CameraEditorController cameraEditorController;
        if (!m39071qR()) {
            return;
        }
        try {
            if (m38934pR()) {
                this.f40855N1.cancel();
            }
            this.f40869X0.setCanInterceptTouch(true);
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null) {
                cameraPreviewController.m38573V2(false);
            }
            CameraEditorController cameraEditorController2 = this.f40883e1;
            if (cameraEditorController2 != null) {
                cameraEditorController2.setEditingMode(0);
                this.f40883e1.m38295t8(false);
                AbstractC23136l9.m118744r1(this.f40883e1.f40642s, 0);
            }
            AbstractC23136l9.m118744r1(this.f40854M1, 0);
            this.f40854M1.setAlpha(1.0f);
            this.f40854M1.setTranslationY(0.0f);
            AbstractC23136l9.m118744r1(this.f40854M1, 8);
            if (this.f40897l1 == 2 && (cameraEditorController = this.f40883e1) != null) {
                cameraEditorController.setEditingMode(0);
            }
            this.f40856O1 = false;
            this.f40857P1 = false;
            CameraPreviewController cameraPreviewController2 = this.f40881d1;
            if (cameraPreviewController2 != null && this.f40897l1 == 1) {
                cameraPreviewController2.f40791v.setAlpha(1.0f);
                this.f40881d1.f40787t.setAlpha(1.0f);
                this.f40881d1.f40789u.setAlpha(1.0f);
                ActiveImageColorButton activeImageColorButton = this.f40881d1.f40795x;
                if (activeImageColorButton != null) {
                    activeImageColorButton.setAlpha(1.0f);
                }
                ActiveImageColorButton activeImageColorButton2 = this.f40881d1.f40797y;
                if (activeImageColorButton2 != null) {
                    activeImageColorButton2.setAlpha(1.0f);
                }
                this.f40881d1.f40793w.setAlpha(1.0f);
                if (this.f40881d1.m38594s1()) {
                    this.f40881d1.f40714A.setAlpha(1.0f);
                }
                this.f40881d1.f40779p.setAlpha(1.0f);
                this.f40881d1.f40791v.setTranslationY(0.0f);
                this.f40881d1.f40787t.setTranslationY(0.0f);
                this.f40881d1.f40789u.setTranslationY(0.0f);
                ActiveImageColorButton activeImageColorButton3 = this.f40881d1.f40795x;
                if (activeImageColorButton3 != null) {
                    activeImageColorButton3.setTranslationY(0.0f);
                }
                ActiveImageColorButton activeImageColorButton4 = this.f40881d1.f40797y;
                if (activeImageColorButton4 != null) {
                    activeImageColorButton4.setTranslationY(0.0f);
                }
                this.f40881d1.f40793w.setTranslationY(0.0f);
                if (this.f40881d1.m38594s1()) {
                    this.f40881d1.f40714A.setTranslationY(0.0f);
                }
                this.f40881d1.f40779p.setTranslationY(0.0f);
                return;
            }
            CameraEditorController cameraEditorController3 = this.f40883e1;
            if (cameraEditorController3 != null && this.f40897l1 == 2) {
                cameraEditorController3.f40642s.setAlpha(1.0f);
                this.f40883e1.f40646t.setAlpha(1.0f);
                this.f40883e1.f40638r.setAlpha(1.0f);
                this.f40883e1.f40642s.setTranslationY(0.0f);
                this.f40883e1.f40646t.setTranslationY(0.0f);
                this.f40883e1.f40638r.setTranslationY(0.0f);
                this.f40883e1.f40650u.setTranslationX(0.0f);
                this.f40883e1.f40650u.setAlpha(1.0f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: aS */
    public /* synthetic */ void m38834aS(MotionEvent motionEvent) {
        AbstractC12670d.m71366a(this.f40879c1);
    }

    /* renamed from: aT */
    public void m38835aT() {
        Conversation conversation;
        CameraInputParams cameraInputParams = this.f40891i1;
        if (cameraInputParams.f41121n0 && (conversation = this.f40893j1) != null) {
            cameraInputParams.f41121n0 = false;
            AbstractC23192r.m119491b(conversation.m40996I());
        }
    }

    /* renamed from: bQ */
    private void m38839bQ() {
        try {
            if (!this.f40923y1 && !this.f40913t1 && !this.f40921x1) {
                m39062mT(false, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: bR */
    public void m38840bR(Intent intent) {
        m39041XT(false, 10);
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (!cameraPreviewController.f40784r0 && !cameraPreviewController.f40786s0) {
            m38785TQ(intent);
        }
    }

    /* renamed from: bS */
    public /* synthetic */ void m38841bS() {
        C23930c c23930c = this.f40900m2;
        if (c23930c != null) {
            c23930c.m125225E0();
        }
    }

    /* renamed from: bT */
    public void m38842bT(long j11, C29605a c29605a, boolean z11) {
        if (j11 == AbstractC23309i.m121043Ia()) {
            m38850cT(c29605a, z11);
        }
        if (z11) {
            m39021GT(j11);
            m38847cQ(j11, c29605a);
        } else {
            m38892iT(c29605a);
        }
    }

    /* renamed from: bU */
    public void m38843bU(boolean z11, boolean z12) {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController == null) {
            return;
        }
        try {
            if (z11) {
                cameraPreviewController.m38572V0(true);
                this.f40881d1.clearAnimation();
                AbstractC23136l9.m118744r1(this.f40881d1, 0);
                this.f40881d1.f40767d0 = null;
                this.f40873Z0.m39771b0();
                return;
            }
            if (cameraPreviewController.getVisibility() != 4) {
                this.f40881d1.m38572V0(false);
                AbstractC23136l9.m118744r1(this.f40881d1, 4);
                if (z12) {
                    if (this.f40849I1 == null) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        this.f40849I1 = alphaAnimation;
                        alphaAnimation.setStartOffset(150L);
                        this.f40849I1.setDuration(200L);
                        this.f40849I1.setInterpolator(new LinearInterpolator());
                    }
                    this.f40881d1.startAnimation(this.f40849I1);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: cQ */
    private void m38847cQ(long j11, C29605a c29605a) {
        if (!AbstractC23309i.m121108K1()) {
            return;
        }
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.q3

            /* renamed from: q */
            public final /* synthetic */ long f41516q;

            /* renamed from: r */
            public final /* synthetic */ C29605a f41517r;

            public /* synthetic */ RunnableC7721q3(long j112, C29605a c29605a2) {
                r2 = j112;
                r4 = c29605a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38712JR(r2, r4);
            }
        });
    }

    /* renamed from: cR */
    private CameraEditorController m38848cR() {
        CameraEditorController cameraEditorController = (CameraEditorController) ((ViewStub) this.f40875a1.findViewById(AbstractC6918a0.stub_editor_controller)).inflate();
        cameraEditorController.m38246R3(this, this.f40873Z0, this.f40891i1, this, m92657cJ());
        cameraEditorController.setEventListener(m38940qQ());
        AbstractC23136l9.m118744r1(cameraEditorController, 4);
        return cameraEditorController;
    }

    /* renamed from: cS */
    public /* synthetic */ void m38849cS() {
        C23930c c23930c = this.f40900m2;
        if (c23930c != null) {
            c23930c.m125226F0();
        }
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.m38252U6();
        }
    }

    /* renamed from: cT */
    private void m38850cT(C29605a c29605a, boolean z11) {
        boolean z12;
        boolean m132893a = AbstractC25759a.m132893a(c29605a);
        if (m132893a && this.f40892i2 == null) {
            this.f40892i2 = c29605a;
        }
        if (z11 && m132893a) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f40896k2 = z12;
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.setSelectedQuickAccessFilter(z12);
        } else {
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null) {
                cameraPreviewController.setSelectedQuickAccessFilter(z12);
            }
        }
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null && m132893a) {
            filterPickerView.m39269T(z11, c29605a);
        }
    }

    /* renamed from: dQ */
    private AnimatorSet m38854dQ() {
        boolean z11;
        boolean z12;
        Animator animator = this.f40868W1;
        if (animator != null && animator.isStarted()) {
            this.f40868W1.cancel();
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC23136l9.m118744r1(this.f40881d1, 0);
        AbstractC23136l9.m118744r1(this.f40881d1.f40791v, 0);
        this.f40881d1.m38559L2(0);
        this.f40881d1.m38554F2(0);
        this.f40881d1.m38556G2(0);
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.f40781q != null) {
            cameraPreviewController.m38562N2(false);
        } else if (cameraPreviewController != null && m38655AR()) {
            this.f40881d1.m38581f1(this.f40901n1);
        }
        RecordButton recordButton = this.f40881d1.getRecordButton();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ImageButton imageButton = this.f40883e1.f40668y1;
        if (imageButton != null && imageButton.getParent() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (!z11) {
                recordButton.setAlpha(0.0f);
                this.f40883e1.f40668y1.setTranslationX(0.0f);
                this.f40883e1.f40668y1.setTranslationY(0.0f);
                this.f40883e1.f40668y1.setScaleX(1.0f);
                this.f40883e1.f40668y1.setScaleY(1.0f);
                this.f40883e1.f40668y1.setAlpha(1.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f40883e1.f40668y1, "alpha", 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "translationX", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "scaleX", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "scaleY", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(recordButton, "alpha", 1.0f));
        if (!z11) {
            this.f40881d1.f40791v.setAlpha(0.0f);
            this.f40881d1.f40787t.setAlpha(0.0f);
            this.f40881d1.f40789u.setAlpha(0.0f);
            this.f40881d1.f40795x.setAlpha(0.0f);
            ActiveImageColorButton activeImageColorButton = this.f40881d1.f40797y;
            if (activeImageColorButton != null) {
                activeImageColorButton.setAlpha(0.0f);
            }
            this.f40881d1.f40793w.setAlpha(0.0f);
            if (this.f40881d1.m38594s1()) {
                this.f40881d1.f40799z.setAlpha(0.0f);
                this.f40881d1.f40714A.setAlpha(0.0f);
            }
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40791v, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40787t, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40789u, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40795x, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40797y, "alpha", 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40793w, "alpha", 1.0f));
        if (this.f40881d1.m38594s1()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40799z, "alpha", 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40714A, "alpha", 1.0f));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(50L);
        animatorSet.setInterpolator(new DecelerateInterpolator(1.0f));
        if (!z11) {
            this.f40883e1.f40638r.setAlpha(1.0f);
            this.f40883e1.f40638r.setTranslationY(0.0f);
            this.f40883e1.f40642s.setAlpha(1.0f);
            this.f40883e1.f40642s.setTranslationY(0.0f);
            this.f40883e1.f40646t.setAlpha(1.0f);
            this.f40883e1.f40650u.setTranslationX(0.0f);
            this.f40883e1.f40650u.setAlpha(1.0f);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40638r, "alpha", 0.0f));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40638r, "translationY", -AbstractC23222t7.f112567j0));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40642s, "alpha", 0.0f));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40642s, "translationY", AbstractC23222t7.f112567j0));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40646t, "alpha", 0.0f));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40650u, "alpha", 0.0f));
        arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40650u, "translationX", AbstractC23222t7.f112575n0));
        if (!z12) {
            arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40668y1, "alpha", 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.f40883e1.f40668y1, "translationY", r6.getHeight()));
        }
        animatorSet2.playTogether(arrayList2);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(new DecelerateInterpolator(1.0f));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new C7540n(recordButton));
        animatorSet3.playTogether(animatorSet, animatorSet2);
        this.f40868W1 = animatorSet3;
        return animatorSet3;
    }

    /* renamed from: dR */
    public void m38855dR() {
        if (this.f40877b1 == null) {
            ImageView imageView = new ImageView(m92648SI());
            this.f40877b1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f40877b1.setImageResource(AbstractC16803z.icn_trashcan_editphoto);
            this.f40877b1.setVisibility(8);
            this.f40877b1.setEnabled(false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = AbstractC23222t7.f112586t;
            this.f40877b1.setLayoutParams(layoutParams);
            m39048fT();
            this.f40875a1.addView(this.f40877b1, layoutParams);
        }
    }

    /* renamed from: dS */
    public /* synthetic */ void m38856dS(int i11, String str) {
        try {
            if (i11 == 0) {
                m38758PS(str);
            } else {
                m38667CS();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: dT */
    private void m38857dT(long j11, C29605a c29605a) {
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null) {
            filterPickerView.setSelectedFilterCategoryId(j11);
            this.f40854M1.setSelectedFilter(c29605a);
        }
    }

    /* renamed from: dU */
    private void m38858dU(String str, String str2, int i11, View.OnClickListener onClickListener, int i12) {
        try {
            Snackbar m90634w = Snackbar.m90634w(this.f40863U0, str, i12);
            if (!TextUtils.isEmpty(str2)) {
                m90634w.m90636A(str2, onClickListener);
            }
            if (i11 != 0) {
                m90634w.m90643I(i11);
                View m90659r = m90634w.m90659r();
                if (m90659r instanceof Snackbar.SnackbarLayout) {
                    AbstractC23136l9.m118744r1(((Snackbar.SnackbarLayout) m90659r).getIconView(), 0);
                }
            }
            View m90659r2 = m90634w.m90659r();
            m90659r2.setBackgroundResource(AbstractC16803z.story_archive_snackbar_bg);
            ButtonWithProgress buttonWithProgress = (ButtonWithProgress) m90659r2.findViewById(AbstractC6918a0.snackbar_action);
            if (buttonWithProgress != null) {
                new TableRow.LayoutParams(-2, -2).gravity = 8388629;
                buttonWithProgress.setMinimumWidth(0);
            }
            if (m90659r2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m90659r2.getLayoutParams();
                marginLayoutParams.setMargins(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(90.0f));
                m90659r2.setLayoutParams(marginLayoutParams);
            }
            m90634w.m90648N();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: eQ */
    public void m38862eQ() {
        try {
            m39061lU("121N001");
            if (!this.f40891i1.m39215d() && AbstractC22470k.m116153e(true)) {
                if (this.f40897l1 == 2) {
                    if (this.f40883e1.m38209B4()) {
                        this.f40915u1 = false;
                        m38791UP();
                        this.f40873Z0.getRender().m1983u0();
                    }
                    m38949rT();
                    this.f40883e1.m38240N3();
                    this.f40883e1.m38227I6();
                    this.f40883e1.setSavedMediaContent(false);
                    this.f40883e1.m38270f3();
                    this.f40883e1.m38269e3();
                    this.f40883e1.m38274g3();
                    AnimatorSet m38854dQ = m38854dQ();
                    m38854dQ.addListener(new C7516b());
                    m38854dQ.start();
                    if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
                        AbstractC23647d.m123906p("4915200");
                        AbstractC23647d.m123893c();
                        return;
                    }
                    return;
                }
                return;
            }
            finish();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: eS */
    public /* synthetic */ void m38863eS() {
        this.f40835B1 = AbstractC23280z4.m120314Z();
    }

    /* renamed from: eT */
    public void m38864eT() {
        C29605a c29605a = this.f40862T1;
        if (c29605a == null) {
            return;
        }
        this.f40859R1 = c29605a;
        m39021GT(this.f40864U1);
        this.f40862T1 = null;
        this.f40864U1 = -10L;
        m38821YS();
        m38850cT(this.f40859R1, true);
    }

    /* renamed from: eU */
    public void m38865eU() {
        try {
            CameraPreviewController cameraPreviewController = this.f40881d1;
            cameraPreviewController.f40739M0 = true;
            C0820h.f2880z = null;
            StatusComposeEditText editStatus = cameraPreviewController.getEditStatus();
            if (editStatus != null) {
                editStatus.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                editStatus.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: fQ */
    public void m38869fQ(boolean z11, int... iArr) {
        int i11;
        if (z11) {
            this.f40869X0.setCanInterceptTouch(true);
        }
        this.f40871Y0.setCanInterceptTouch(true);
        AbstractC23136l9.m118744r1(this.f40852K1, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (this.f40852K1.getGalleryPickerMode() == 1) {
            arrayList.add(ObjectAnimator.ofFloat(this.f40852K1, "alpha", 0.0f));
        }
        if (z11) {
            if (this.f40852K1.getGalleryPickerMode() == 1) {
                if (this.f40852K1.getHeight() > 0) {
                    i11 = this.f40852K1.getHeight() / 2;
                } else {
                    i11 = f40831Q2 / 2;
                }
                arrayList.add(ObjectAnimator.ofFloat(this.f40852K1, "translationY", i11));
                arrayList.add(ObjectAnimator.ofFloat(this.f40881d1, "alpha", 1.0f));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.f40852K1.f41260p, "translationY", this.f40852K1.f41260p.getHeight()));
            }
        }
        animatorSet.playTogether(arrayList);
        if (iArr.length > 0) {
            int i12 = iArr[0];
            if (i12 < 0) {
                i12 = 20;
            }
            animatorSet.setDuration(i12);
        } else {
            animatorSet.setDuration(250L);
        }
        animatorSet.setInterpolator(new C26087b());
        this.f40853L1 = animatorSet;
        animatorSet.addListener(new C7551x());
        this.f40853L1.start();
    }

    /* renamed from: fR */
    private void m38870fR() {
        BackgroundPickerView backgroundPickerView = this.f40876a2;
        if (backgroundPickerView != null) {
            backgroundPickerView.m71399zM(new C7546s());
        }
    }

    /* renamed from: fS */
    public /* synthetic */ void m38871fS() {
        boolean z11;
        try {
            AbstractC23237v1.m119715c("onResume executing");
            if (this.f40897l1 == 2 && this.f40859R1 != null) {
                m38821YS();
            }
            if (!this.f88761b0 && this.f40843F1 < 0) {
                m39060lT(true);
            }
            if (this.f40897l1 != 2) {
                this.f40925z1 = false;
                m38883hQ();
                if (C20024r.m103941j()) {
                    this.f40881d1.m38579a3(2);
                    this.f40881d1.m38563O0(2, true);
                }
                if (this.f40881d1.m38594s1()) {
                    CameraPreviewController cameraPreviewController = this.f40881d1;
                    if (!m39065nR() && !m39068oR()) {
                        z11 = false;
                        cameraPreviewController.m38562N2(z11);
                    }
                    z11 = true;
                    cameraPreviewController.m38562N2(z11);
                } else {
                    this.f40881d1.m38562N2(false);
                }
            } else {
                onEnterForeground();
                m38759PT(true, false);
                m38843bU(false, false);
                CameraEditorController cameraEditorController = this.f40883e1;
                if (cameraEditorController != null) {
                    if (cameraEditorController.m38206A4()) {
                        if (this.f40883e1.m38211C4()) {
                            this.f40883e1.m38297v7();
                        } else if (this.f40883e1.m38214D4() && !this.f40913t1 && !this.f40915u1) {
                            this.f40883e1.m38298w7();
                            this.f40883e1.m38219E6();
                        }
                    } else if (!this.f40913t1) {
                        m38862eQ();
                    }
                }
            }
            CameraPreviewController cameraPreviewController2 = this.f40881d1;
            if (cameraPreviewController2 != null && cameraPreviewController2.m38586j1()) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.r3
                    public /* synthetic */ RunnableC7727r3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.this.m38863eS();
                    }
                });
                this.f40881d1.m38568S0();
                this.f40881d1.m38578Z0(this.f40895k1);
            }
            if (this.f40909r1 && C28139n5.m141621w(m92648SI())) {
                this.f40883e1.getLocationFilter();
            }
            this.f40909r1 = false;
            this.f40907q1 = true;
            m39039WQ();
            CameraEditorController cameraEditorController2 = this.f40883e1;
            if (cameraEditorController2 != null) {
                cameraEditorController2.getMediaEditorLogInfo().m17369e(System.currentTimeMillis());
            }
            if (!this.f40891i1.f41122o0.isEmpty()) {
                this.f40879c1 = AbstractC12670d.m71367b(this, this.f40891i1.f41122o0, AbstractC23222t7.f112515B0);
                this.f40891i1.f41122o0 = "";
            }
            AbstractC23237v1.m119713a("onResume executing");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: fU */
    public void m38872fU() {
        if (m39071qR()) {
            this.f40854M1.setAlpha(1.0f);
            this.f40854M1.setTranslationY(0.0f);
        } else {
            m38808WT(true, new int[0]);
            this.f40854M1.setAlpha(0.0f);
            this.f40854M1.setTranslationY(AbstractC23222t7.f112559f0);
            m39070pU("filter_swipe_up");
        }
    }

    /* renamed from: gQ */
    public void m38876gQ() {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            cameraPreviewController.m38599z2();
            this.f40881d1.f40780p0 = true;
            EnumC17910b.INSTANCE.m94489e(this);
        }
    }

    /* renamed from: gR */
    private FilterPickerView m38877gR() {
        boolean z11;
        C7533j0 c7533j0 = new C7533j0();
        Context m92648SI = m92648SI();
        if (this.f40895k1 == 7) {
            z11 = true;
        } else {
            z11 = false;
        }
        FilterPickerView filterPickerView = new FilterPickerView(m92648SI, z11, 0);
        filterPickerView.setEventListener(c7533j0);
        filterPickerView.setStateListener(new FilterPickerView.InterfaceC7608g() { // from class: com.zing.zalo.camera.g3
            public /* synthetic */ C7630g3() {
            }

            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7608g
            /* renamed from: a */
            public final void mo39284a(boolean z12, long j11, C29605a c29605a) {
                ZaloCameraView.this.m38750OR(z12, j11, c29605a);
            }
        });
        filterPickerView.setOnDemandListener(new FilterPickerView.InterfaceC7607f() { // from class: com.zing.zalo.camera.h3
            public /* synthetic */ C7645h3() {
            }

            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7607f
            /* renamed from: a */
            public final void mo39283a() {
                ZaloCameraView.this.m38757PR();
            }
        });
        filterPickerView.getSeekBar().setProgress(this.f40860S1);
        filterPickerView.setIntensityFilterAdjustListener(new FilterPickerView.InterfaceC7606e() { // from class: com.zing.zalo.camera.i3
            public /* synthetic */ C7651i3() {
            }

            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7606e
            /* renamed from: a */
            public final void mo39282a(int i11) {
                ZaloCameraView.this.m38764QR(i11);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        filterPickerView.setBackgroundColor(0);
        this.f40875a1.addView(filterPickerView, 1, layoutParams);
        m39048fT();
        return filterPickerView;
    }

    /* renamed from: gS */
    public /* synthetic */ void m38878gS(String str) {
        CameraEditorController cameraEditorController = this.f40883e1;
        cameraEditorController.setOriginalFileContent(cameraEditorController.m38304z3(str, false));
    }

    /* renamed from: gU */
    public void m38879gU() {
        String str;
        if (m39071qR()) {
            this.f40869X0.setCanInterceptTouch(false);
            this.f40854M1.setAlpha(1.0f);
            this.f40854M1.setTranslationY(0.0f);
            if (this.f40859R1 != null) {
                str = "1";
            } else {
                str = "0";
            }
            m39072qU("filter_swipe_down", str);
        }
    }

    /* renamed from: hQ */
    private void m38883hQ() {
        if (!m38748OP(false)) {
            return;
        }
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.f40775l0 == 1) {
            return;
        }
        if (AbstractC22470k.m116152d(false) && (AbstractC22470k.m116159k() == null || AbstractC22470k.m116159k() == this)) {
            m38876gQ();
        } else {
            ToastUtils.m89266n(AbstractC8020f0.connect_camera_error, new Object[0]);
            finish();
        }
    }

    /* renamed from: hR */
    private void m38884hR() {
        try {
            if (this.f40852K1 == null) {
                this.f40852K1 = new GalleryPickerContainer(m92648SI(), new C7552y(), this.f40899m1, this.f40895k1, this.f40887g1);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                this.f40852K1.setBackgroundColor(0);
                this.f40875a1.addView(this.f40852K1, 1, layoutParams);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: hS */
    public static /* synthetic */ void m38885hS() {
        File[] listFiles;
        try {
            File m104832G0 = AbstractC20130d.m104832G0();
            if (m104832G0 != null && m104832G0.isDirectory() && (listFiles = m104832G0.listFiles()) != null) {
                for (File file : listFiles) {
                    AbstractC23041d2.m118208g(file.getAbsolutePath());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: hU */
    public void m38886hU() {
        if (m38964tR() && this.f40852K1.getGalleryPickerMode() == 0) {
            this.f40869X0.setCanInterceptTouch(false);
            this.f40852K1.f41260p.setAlpha(1.0f);
            this.f40852K1.f41260p.setTranslationY(0.0f);
        }
    }

    /* renamed from: iR */
    private void m38890iR() {
        ImageDecorView imageDecorView = new ImageDecorView(m92648SI());
        this.f40873Z0 = imageDecorView;
        imageDecorView.m39788v0(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f40873Z0.bringToFront();
        this.f40873Z0.setZOrderMediaOverlay(true);
        this.f40873Z0.setClickable(false);
        this.f40873Z0.setTouchEnable(true);
        this.f40873Z0.setEventListener(this.f40834A2);
        this.f40873Z0.setHandleDecorObjectListener(this.f40926z2);
        m38681ET(false);
        this.f40873Z0.setLayoutParams(layoutParams);
        if (this.f40895k1 == 7) {
            this.f40873Z0.setPreserveEGLContextOnPause(true);
        }
        m39023HT(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* renamed from: iS */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m38891iS(Bundle bundle) {
        JSONObject jSONObject;
        AbstractC23237v1.m119715c("onViewCreated");
        if (bundle != null) {
            try {
                jSONObject = new JSONObject(bundle.getString("all_data"));
            } catch (JSONException e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
            if (jSONObject != null || jSONObject.optInt("camera_state", 1) != 2) {
                AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.s3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.m38885hS();
                    }
                });
            }
            m38755PP(jSONObject);
            if (AbstractC22470k.m116158j(this.f40895k1, 4)) {
                this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.t3
                    public /* synthetic */ RunnableC7741t3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.this.m39076tU();
                    }
                }, 1000L);
            }
            AbstractC23237v1.m119713a("onViewCreated");
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.s3
            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.m38885hS();
            }
        });
        m38755PP(jSONObject);
        if (AbstractC22470k.m116158j(this.f40895k1, 4)) {
        }
        AbstractC23237v1.m119713a("onViewCreated");
    }

    /* renamed from: iT */
    private void m38892iT(C29605a c29605a) {
        CameraPreviewController cameraPreviewController;
        m39051hT();
        if ((c29605a.m147135l() == 1 || this.f40859R1 == null) && (cameraPreviewController = this.f40881d1) != null) {
            cameraPreviewController.m38552B2(false);
        }
    }

    /* renamed from: iU */
    public void m38893iU() {
        this.f40918v2.post(new RunnableC7522e());
    }

    /* renamed from: jQ */
    public void m38897jQ(InterfaceC7537l0 interfaceC7537l0) {
        C28208v2.m142128t().m142145s(interfaceC7537l0);
    }

    /* renamed from: jS */
    public /* synthetic */ void m38898jS(boolean z11) {
        AbstractC20110a.m104544m("run: releaseTranslation", new Object[0]);
        m39049gT(z11);
    }

    /* renamed from: jU */
    private void m38899jU() {
        try {
            if (this.f40859R1 != null && this.f40873Z0.m39769a0() && this.f40897l1 == 1) {
                m38805WP();
                this.f40859R1 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: kQ */
    private int m38903kQ() {
        CameraEditorController cameraEditorController;
        CameraPreviewController cameraPreviewController;
        InterfaceC29634a interfaceC29634a;
        int i11 = this.f40897l1;
        if (i11 == 1 && (cameraPreviewController = this.f40881d1) != null && (interfaceC29634a = cameraPreviewController.f40752T) != null) {
            return !interfaceC29634a.mo147377h() ? 1 : 0;
        }
        if (i11 == 2 && (cameraEditorController = this.f40883e1) != null) {
            if (cameraEditorController.m38211C4()) {
                return 2;
            }
            if (this.f40883e1.m38214D4()) {
                return 3;
            }
        }
        return -1;
    }

    /* renamed from: kS */
    public /* synthetic */ void m38904kS(C29605a c29605a) {
        FilterPickerView filterPickerView;
        if (mo45894h0() && (filterPickerView = this.f40854M1) != null) {
            filterPickerView.m39273X(c29605a);
        }
    }

    /* renamed from: kU */
    public void m38928oS(String str) {
        String str2;
        CameraEditorController cameraEditorController;
        if (!TextUtils.isEmpty(this.f40891i1.f41105X)) {
            if (!this.f40891i1.f41105X.equals("8")) {
                str2 = this.f40891i1.f41105X;
            }
            str2 = "4";
        } else {
            CameraInputParams cameraInputParams = this.f40891i1;
            if (cameraInputParams.f41129s == 7) {
                cameraInputParams.f41105X = "4";
                str2 = "4";
            } else {
                str2 = "7";
            }
        }
        if ("4".equals(str2) && this.f40897l1 == 2 && (cameraEditorController = this.f40883e1) != null && cameraEditorController.m38209B4()) {
            str2 = "5";
        }
        String replace = str.replace("N", str2);
        AbstractC20110a.m104544m("submitActionLog actionLogConstantRaw= " + str + ", actionLogConstant= " + replace, new Object[0]);
        AbstractC23647d.m123897g(replace);
    }

    /* renamed from: lR */
    private void m38909lR(int i11) {
        m39056kR(AbstractC23309i.m122007i5(MainApplication.getAppContext()));
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), false, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f40880c2 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.emoji_picker_container, this.f40880c2, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m38916mR();
        }
    }

    /* renamed from: lS */
    public /* synthetic */ void m38910lS(String str, C27373c c27373c, String str2) {
        AbstractC23112j7.m118562w0(str, c27373c, str2, "chat_send", this.f40904o2);
    }

    /* renamed from: le */
    public void m38911le(int i11) {
        try {
            if (i11 == 0) {
                this.f40918v2.postDelayed(this.f40840D2, 400L);
            } else if (i11 == 1 || i11 == 3) {
                this.f40918v2.removeCallbacks(this.f40840D2);
                this.f40838C2++;
                if (!this.f40918v2.hasMessages(6)) {
                    this.f40918v2.sendEmptyMessage(6);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: mQ */
    private List m38915mQ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40799z, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40714A, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40779p, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40722E, "translationY", 0.0f));
        arrayList.add(ObjectAnimator.ofInt(this.f40881d1.f40722E, "height", AbstractC23222t7.f112591v0));
        arrayList.add(ObjectAnimator.ofInt(this.f40881d1.f40734K, "height", f40832R2 - AbstractC32226c.m155408g(m92656bJ())));
        if (this.f40881d1.f40781q.getVisibility() != 0) {
            AbstractC23136l9.m118744r1(this.f40881d1.f40781q, 0);
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40781q, "alpha", 1.0f));
        return arrayList;
    }

    /* renamed from: mR */
    private void m38916mR() {
        this.f40880c2.m72709oO(new C7521d0());
    }

    /* renamed from: mS */
    public /* synthetic */ void m38917mS(long j11) {
        this.f40872Y1.mo9224q(Long.valueOf(j11));
    }

    /* renamed from: mU */
    private void m38918mU() {
        this.f40900m2.m125246q0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.u2
            public /* synthetic */ C7746u2() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ZaloCameraView.this.m38935pS((ComposeSongStatus) obj);
            }
        });
        this.f40900m2.m125245p0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.v2
            public /* synthetic */ C7752v2() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ZaloCameraView.this.m38941qS((SongData) obj);
            }
        });
        this.f40900m2.m125243m0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.w2
            public /* synthetic */ C7791w2() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ZaloCameraView.this.m38948rS((ComposLyricStatus) obj);
            }
        });
        this.f40900m2.m125241k0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.x2
            public /* synthetic */ C7797x2() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ZaloCameraView.this.m38956sS((LyricRender) obj);
            }
        });
        this.f40900m2.m125247s0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.camera.y2
            public /* synthetic */ C7803y2() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ZaloCameraView.this.m38965tS((C19964c) obj);
            }
        });
    }

    /* renamed from: nS */
    public static /* synthetic */ void m38922nS(String str) {
        new C20556f(str).m106829a();
    }

    /* renamed from: nT */
    private void m38923nT(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("video_input_path", str);
        bundle.putString("video_thumb_path", str2);
        bundle.putInt("min_video_duration", 3000);
        bundle.putInt("max_video_duration", AbstractC26689j.m137076C(this.f40899m1) * 1000);
        bundle.putBoolean("mark_video_position_only", true);
        bundle.putString("video_output_path", AbstractC23204s0.m119557h().getPath() + File.separator + "story_video_record_" + System.currentTimeMillis() + ".mp4");
        if (m92676n2() != null) {
            this.f40913t1 = true;
            this.f40915u1 = false;
            m38780SS(bundle, 11117);
        }
    }

    /* renamed from: nU */
    public void m38924nU() {
        try {
            if (!m39071qR()) {
                m38671DP(true);
                m39038VT(true, new int[0]);
            } else if (this.f40856O1) {
                this.f40854M1.getFilterPickerAdapter().m39304P(this.f40858Q1);
                this.f40856O1 = false;
            } else if (this.f40857P1) {
                this.f40854M1.getFilterPickerAdapter().m39303O(this.f40858Q1);
                this.f40857P1 = false;
            }
            m39070pU("filter_swipe");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: oU */
    public void m38929oU() {
        if (this.f40881d1.m38594s1()) {
            if (this.f40856O1) {
                BackgroundPickerView backgroundPickerView = this.f40876a2;
                if (backgroundPickerView != null) {
                    backgroundPickerView.m71396wM();
                } else {
                    this.f40881d1.m38595s2();
                }
                this.f40856O1 = false;
                return;
            }
            if (this.f40857P1) {
                BackgroundPickerView backgroundPickerView2 = this.f40876a2;
                if (backgroundPickerView2 != null) {
                    backgroundPickerView2.m71395vM();
                } else {
                    this.f40881d1.m38593r2();
                }
                this.f40857P1 = false;
            }
        }
    }

    /* renamed from: pQ */
    private int m38933pQ() {
        if (!TextUtils.isEmpty(this.f40891i1.f41139x)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: pR */
    public boolean m38934pR() {
        Animator animator = this.f40855N1;
        if (animator != null && animator.isRunning()) {
            return true;
        }
        return false;
    }

    /* renamed from: pS */
    public /* synthetic */ void m38935pS(ComposeSongStatus composeSongStatus) {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.setMusicLayoutEditingSong(composeSongStatus.m45964d());
            this.f40883e1.m38231K2(composeSongStatus.m45964d());
            this.f40883e1.m38222G2(composeSongStatus.m45964d());
            this.f40883e1.m38243P5(composeSongStatus.m45963c());
            if (!composeSongStatus.m45963c()) {
                this.f40883e1.m38256X2();
            }
        }
    }

    /* renamed from: pT */
    public void m38936pT(View view) {
        if (view != null) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(1.0f);
        }
    }

    /* renamed from: qQ */
    private CameraEditorController.InterfaceC7480j0 m38940qQ() {
        return new C7536l();
    }

    /* renamed from: qS */
    public /* synthetic */ void m38941qS(SongData songData) {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.m38228J2(songData);
            this.f40883e1.m38234L2(songData);
        }
    }

    /* renamed from: qT */
    private void m38942qT() {
        try {
            this.f40921x1 = false;
            this.f40843F1 = -1;
            this.f40895k1 = 0;
            this.f40899m1 = 0;
            this.f40869X0.setTranslationY(0.0f);
            this.f40871Y0.setTranslationX(0.0f);
            this.f40863U0.setBackgroundResource(0);
            m38812XP();
            FilterPickerView filterPickerView = this.f40854M1;
            if (filterPickerView != null) {
                filterPickerView.m39268R(-10L);
            }
            this.f40854M1 = null;
            m39021GT(-10L);
            this.f40859R1 = null;
            m38732MP(1);
            FrameLayout frameLayout = this.f40875a1;
            if (frameLayout != null) {
                this.f40871Y0.removeView(frameLayout);
            }
            m38784TP();
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null) {
                cameraPreviewController.m38570U0();
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null) {
                cameraEditorController.m38269e3();
                this.f40883e1.m38270f3();
                this.f40883e1.m38274g3();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: rQ */
    private AnimatorSet m38947rQ(int... iArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40854M1, "translationY", 0.0f), ObjectAnimator.ofFloat(this.f40854M1, "alpha", 1.0f));
            if (iArr.length > 0) {
                int i11 = iArr[0];
                if (i11 < 0) {
                    i11 = 20;
                }
                animatorSet.setDuration(i11);
            } else {
                animatorSet.setDuration(250L);
            }
            animatorSet.setInterpolator(new C26087b());
            animatorSet.addListener(new C7515a0());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
        return animatorSet;
    }

    /* renamed from: rS */
    public /* synthetic */ void m38948rS(ComposLyricStatus composLyricStatus) {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.setLyricState(composLyricStatus.m45958b());
        }
    }

    /* renamed from: rT */
    private void m38949rT() {
        View view;
        ImageDecorView imageDecorView;
        m38818YP();
        m38732MP(1);
        boolean m116164p = AbstractC22470k.m116164p(this.f40895k1, f40830P2);
        if (m92656bJ() != null) {
            view = this.f40865V0;
        } else {
            view = null;
        }
        if (m116164p && (imageDecorView = this.f40873Z0) != null && view != null && (imageDecorView.getWidth() != view.getWidth() || this.f40873Z0.getHeight() != view.getHeight())) {
            ViewGroup.LayoutParams layoutParams = this.f40873Z0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f40873Z0.setLayoutParams(layoutParams);
            this.f40873Z0.getRender().m98265H1(view.getWidth(), view.getHeight());
            this.f40911s1 = true;
        }
        if (m92672lJ()) {
            m39023HT(false);
            m38876gQ();
        }
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            cameraPreviewController.f40782q0 = true;
        }
        ImageDecorView imageDecorView2 = this.f40873Z0;
        if (imageDecorView2 != null) {
            imageDecorView2.getRender().m98302l2();
        }
        DragCameraLayout dragCameraLayout = this.f40871Y0;
        if (dragCameraLayout != null) {
            dragCameraLayout.setDisableTouch(false);
        }
    }

    /* renamed from: rU */
    private void m38950rU(String str) {
        this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.b3

            /* renamed from: q */
            public final /* synthetic */ int f41012q;

            public /* synthetic */ RunnableC7565b3(int i11) {
                r2 = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38972uS(r2);
            }
        });
        if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
            m38744NT(str, 0, 30000, false, true, false);
        }
    }

    /* renamed from: sR */
    public boolean m38955sR() {
        if (m39073rR() && this.f40921x1) {
            return true;
        }
        return false;
    }

    /* renamed from: sS */
    public /* synthetic */ void m38956sS(LyricRender lyricRender) {
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.m38224I2(lyricRender);
        }
    }

    /* renamed from: sT */
    private void m38957sT(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f40897l1 = jSONObject.optInt("camera_state");
            String optString = jSONObject.optString("decor_objects_data");
            this.f40851J1 = optString;
            if (!TextUtils.isEmpty(optString)) {
                this.f40873Z0.m39781o0(this.f40851J1);
            }
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null) {
                cameraPreviewController.m38582g2(jSONObject);
            }
            if (this.f40897l1 == 2 && this.f40883e1 == null) {
                m38720KT();
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null) {
                cameraEditorController.m38285o6(jSONObject);
                this.f40860S1 = jSONObject.optInt("intensity_color_filter", 100);
            }
            m38958sU();
        }
    }

    /* renamed from: sU */
    private void m38958sU() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f40880c2 = (StickerPanelView) m92996E0;
        }
        if (this.f40880c2 != null) {
            m38916mR();
        }
    }

    /* renamed from: tQ */
    private AnimatorSet m38963tQ(int... iArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40852K1.f41260p, "translationY", 0.0f));
            if (iArr.length > 0) {
                int i11 = iArr[0];
                if (i11 < 0) {
                    i11 = 20;
                }
                animatorSet.setDuration(i11);
            } else {
                animatorSet.setDuration(250L);
            }
            animatorSet.setInterpolator(new C26087b());
            animatorSet.addListener(new C7517b0());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
        return animatorSet;
    }

    /* renamed from: tR */
    public boolean m38964tR() {
        if (m39073rR() && this.f40852K1.m39331g()) {
            return true;
        }
        return false;
    }

    /* renamed from: tS */
    public /* synthetic */ void m38965tS(C19964c c19964c) {
        C23930c.b bVar = (C23930c.b) c19964c.m103749a();
        if (bVar instanceof C23930c.f) {
            C23930c.f fVar = (C23930c.f) bVar;
            m38858dU(fVar.m125256b(), "", fVar.m125255a(), null, 0);
            return;
        }
        if (bVar instanceof C23930c.d) {
            m39033QP((C23930c.d) bVar);
            return;
        }
        if (bVar instanceof C23930c.e) {
            C23930c.e eVar = (C23930c.e) bVar;
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null) {
                cameraEditorController.m38253U7(eVar.m125254a());
                return;
            }
            return;
        }
        if (bVar instanceof C23930c.c) {
            C23930c.c cVar = (C23930c.c) bVar;
            CameraEditorController cameraEditorController2 = this.f40883e1;
            if (cameraEditorController2 != null) {
                cameraEditorController2.m38223H2(cVar.m125250a());
            }
        }
    }

    /* renamed from: uQ */
    private String m38970uQ() {
        if (!TextUtils.isEmpty(this.f40891i1.f41137w)) {
            return this.f40891i1.f41137w;
        }
        if (!TextUtils.isEmpty(this.f40891i1.f41139x)) {
            return this.f40891i1.f41139x;
        }
        return "";
    }

    /* renamed from: uR */
    public boolean m38971uR() {
        boolean isInMultiWindowMode;
        Activity mo35575n1 = m92692wK().mo35575n1();
        if (mo35575n1 != null && Build.VERSION.SDK_INT >= 24) {
            isInMultiWindowMode = mo35575n1.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        return false;
    }

    /* renamed from: uS */
    public /* synthetic */ void m38972uS(int i11) {
        this.f40900m2.m125231M0(2, i11);
    }

    /* renamed from: uT */
    private void m38973uT(C29605a c29605a, long j11) {
        this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.e4

            /* renamed from: q */
            public final /* synthetic */ C29605a f41171q;

            public /* synthetic */ RunnableC7595e4(C29605a c29605a2) {
                r2 = c29605a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38904kS(r2);
            }
        }, j11);
    }

    /* renamed from: vQ */
    private void m38978vQ() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.m3
            public /* synthetic */ RunnableC7679m3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38726LR();
            }
        });
    }

    /* renamed from: vT */
    public void m38979vT(String str, C20612c c20612c) {
        if (this.f40893j1 != null) {
            ((C23528a) this.f40889h1.m123612r(new DumpChatImageView(getContext()))).m123579C(str, C23278z2.m120068F(), new C7514a(str, c20612c));
        } else {
            AbstractC23350e.m122776f("ZaloCameraView", new Exception("Can not send Photo to null ContactProfile!"));
        }
    }

    /* renamed from: wR */
    private boolean m38984wR() {
        boolean m116126a = AbstractC22463d.m116126a(m92648SI(), AbstractC32212c.m155331a(m92648SI()));
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.m38586j1() && !m116126a) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.camera.f4.<init>(com.zing.zalo.camera.ZaloCameraView, java.lang.String, uv.c, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: wT */
    public void m38985wT(p559uv.C27373c r4, java.lang.String r5) {
        /*
            r3 = this;
            com.zing.zalo.data.chat.model.tabmessage.Conversation r0 = r3.f40893j1
            if (r0 == 0) goto L39
            uv.c r0 = r4.m140242a()
            com.zing.zalo.data.chat.model.tabmessage.Conversation r1 = r3.f40893j1
            java.lang.String r1 = r1.f42893q
            int r2 = r4.f128948U
            if (r2 <= 0) goto L19
            dj.l1 r2 = new dj.l1
            r2.<init>()
            int r4 = r4.f128948U
            r2.f91060c = r4
        L19:
            ag0.b1 r4 = ag0.AbstractC0837p0.m2226g()
            com.zing.zalo.camera.f4 r2 = new com.zing.zalo.camera.f4
            r2.<init>()
            r4.mo2040a(r2)
            nh.a r4 = p363nh.C23744a.m124114c()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.zing.zalo.data.chat.model.tabmessage.Conversation r0 = r3.f40893j1
            java.lang.String r0 = r0.f42893q
            r1 = 0
            r5[r1] = r0
            r0 = 146(0x92, float:2.05E-43)
            r4.m124116d(r0, r5)
            goto L45
        L39:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "Can not send Video to null ContactProfile!"
            r4.<init>(r5)
            java.lang.String r5 = "ZaloCameraView"
            mm0.AbstractC23350e.m122776f(r5, r4)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.camera.ZaloCameraView.m38985wT(uv.c, java.lang.String):void");
    }

    /* renamed from: wU */
    private void m38986wU() {
        try {
            if (m92677nJ()) {
                return;
            }
            int m155331a = AbstractC32212c.m155331a(m92648SI());
            AbstractC20110a.m104544m("updateUiByOrientation: %d", Integer.valueOf(m155331a));
            if (m39071qR() && m155331a != 0) {
                m39038VT(false, new int[0]);
            }
            m39000yU(m155331a);
            m38994xU(m155331a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: xQ */
    private List m38991xQ(int i11) {
        ArrayList arrayList = new ArrayList();
        int m155408g = (f40832R2 - AbstractC32226c.m155408g(m92656bJ())) - i11;
        int i12 = -i11;
        float f11 = this.f40890h2 + i12;
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40799z, "translationY", 0.0f, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40714A, "translationY", 0.0f, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40779p, "translationY", 0.0f, f11));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40722E, "translationY", 0.0f, i12));
        arrayList.add(ObjectAnimator.ofInt(this.f40881d1.f40722E, "height", AbstractC23222t7.f112563h0));
        arrayList.add(ObjectAnimator.ofInt(this.f40881d1.f40734K, "height", m155408g));
        arrayList.add(ObjectAnimator.ofFloat(this.f40881d1.f40781q, "alpha", 1.0f, 0.0f));
        return arrayList;
    }

    /* renamed from: xR */
    public boolean m38992xR() {
        boolean z11;
        boolean z12;
        boolean z13;
        CameraEditorController cameraEditorController;
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.getShowcaseManager() != null && this.f40881d1.getShowcaseManager().m74707p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        CameraPreviewController cameraPreviewController2 = this.f40881d1;
        if (cameraPreviewController2 != null && cameraPreviewController2.m38589o1()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (AbstractC26689j.f126436b && (cameraEditorController = this.f40883e1) != null && cameraEditorController.m38233K4()) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean m116126a = AbstractC22463d.m116126a(m92648SI(), AbstractC32212c.m155331a(m92648SI()));
        if (!z12 && !z11 && !z13 && !m116126a) {
            return false;
        }
        return true;
    }

    /* renamed from: xS */
    private void m38993xS(Activity activity) {
        if (activity != null) {
            AbstractC20110a.m104541j("Activity size: %d x %d", Integer.valueOf(AbstractC23136l9.m118766z(activity)), Integer.valueOf(AbstractC23136l9.m118763y(activity)));
            C2104g0 mo11343a = AbstractC2106h0.m11341a().mo11343a(activity);
            AbstractC20110a.m104541j("window size: %d x %d", Integer.valueOf(mo11343a.m11339a().width()), Integer.valueOf(mo11343a.m11339a().height()));
        }
        AbstractC20110a.m104541j("Screen size: %d x %d", Integer.valueOf(AbstractC19849s1.m103551c()), Integer.valueOf(AbstractC19849s1.m103550b()));
    }

    /* renamed from: xU */
    private void m38994xU(int i11) {
        if (this.f40883e1 != null) {
            boolean m116126a = AbstractC22463d.m116126a(getContext(), i11);
            if (m116126a) {
                this.f40883e1.m38244P7(false);
            } else {
                this.f40883e1.m38244P7(true);
            }
            this.f40883e1.m38303z2(m116126a);
        }
    }

    /* renamed from: yR */
    public boolean m38999yR() {
        if (this.f40895k1 == 4) {
            return m38992xR();
        }
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if ((cameraPreviewController != null && cameraPreviewController.m38594s1()) || (!m38992xR() && !m38984wR() && !this.f40835B1)) {
            return false;
        }
        return true;
    }

    /* renamed from: yU */
    private void m39000yU(int i11) {
        int i12;
        if (this.f40881d1 == null) {
            return;
        }
        if (AbstractC22463d.m116126a(m92689tK(), i11)) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        m39043ZT(this.f40881d1, i12);
        this.f40881d1.m38557K0();
    }

    /* renamed from: zQ */
    private CameraPreviewController.InterfaceC7513q m39005zQ() {
        return new C7530i();
    }

    /* renamed from: zS */
    private void m39006zS() {
        try {
            m38732MP(1);
            m38759PT(false, true);
            m38843bU(true, false);
            m39042YT(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: AQ */
    public C29605a m39007AQ() {
        return this.f40862T1;
    }

    /* renamed from: BQ */
    public long m39008BQ() {
        return this.f40864U1;
    }

    /* renamed from: BR */
    public boolean m39009BR() {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && (cameraPreviewController.f40784r0 || cameraPreviewController.f40786s0)) {
            return true;
        }
        return false;
    }

    /* renamed from: BS */
    public boolean m39010BS() {
        try {
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null && cameraEditorController.isShown()) {
                CameraEditorController cameraEditorController2 = this.f40883e1;
                if (cameraEditorController2.f40506F1) {
                    if (cameraEditorController2.m38247S5()) {
                        return true;
                    }
                    boolean z11 = !this.f40883e1.m38225I3();
                    if (z11 && !TextUtils.isEmpty(this.f40891i1.f41083B)) {
                        z11 = false;
                    }
                    if (this.f40891i1.f41126q0) {
                        showDialog(7);
                    } else if (z11) {
                        showDialog(1);
                    } else {
                        m38862eQ();
                    }
                    return true;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
        if (m39071qR()) {
            return m39028KQ();
        }
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController == null || !cameraPreviewController.m38575W1()) {
            return false;
        }
        return true;
    }

    /* renamed from: BT */
    public void m39011BT(int i11) {
        this.f40901n1 = i11;
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ZaloView m92996E0;
        super.mo37111CJ(bundle);
        if (m92676n2() != null && m92676n2().mo35585v() != null) {
            if (m92676n2().mo35585v().getBackground() != null) {
                this.f40898l2 = m92676n2().mo35585v().getBackground();
            }
            m92676n2().mo35585v().setBackgroundColor(-16777216);
        }
        try {
            this.f40861T0.clear();
            m92637BK(false);
            if (bundle != null) {
                m38657AT((CameraInputParams) bundle.getParcelable("input_params"));
                this.f40893j1 = (Conversation) bundle.getParcelable("input_contact_profile");
                boolean z11 = bundle.getBoolean("is_showing_gallery_full", false);
                this.f40921x1 = z11;
                if (z11 && (m92996E0 = m92662fJ().m92996E0("GALLERY_PICKER_VIEW_TAG")) != null) {
                    ((GalleryPickerView) m92996E0).m71476yN();
                }
            } else {
                m38794US();
                m38787TS();
                m38801VS();
            }
            AbstractC19849s1.m103549a(this.f40920w2);
            this.f40889h1 = new C23528a(m92648SI());
            if (AbstractC22470k.m116158j(this.f40895k1, 4, 7)) {
                m39082wS();
            }
            CameraInputParams cameraInputParams = this.f40891i1;
            if (cameraInputParams != null) {
                C2526d.f10270a.m12698W(cameraInputParams.f41136v0, cameraInputParams.f41132t0, cameraInputParams.f41134u0, cameraInputParams.f41128r0, cameraInputParams.f41130s0);
            }
            this.f40900m2 = (C23930c) new C1802w0(this, new C23930c.h(this, null)).m9378a(C23930c.class);
            this.f40839D1 = AbstractC0924m0.m2902Aa();
            this.f40906p2 = new C24609a(AbstractC2128z.m11435a(m92686rK()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: CQ */
    public void m39012CQ() {
        if (this.f40892i2 != null) {
            m38842bT(AbstractC23309i.m121043Ia(), this.f40892i2, this.f40896k2);
        } else if (!C28208v2.m142128t().f131551a) {
            m38717KP();
        } else {
            mo78950cq("");
        }
    }

    /* renamed from: CT */
    public void m39013CT(int i11) {
        RecyclingImageView recyclingImageView = this.f40867W0;
        if (recyclingImageView != null) {
            recyclingImageView.setImageBitmap(null);
            this.f40867W0.setBackgroundColor(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        boolean z11;
        int i12;
        String m118743r0;
        String str;
        int i13;
        int i14;
        boolean z12 = false;
        try {
            if (i11 != 1 && i11 != 3 && i11 != 4 && i11 != 7) {
                if (i11 == 2) {
                    ViewOnClickListenerC26642c viewOnClickListenerC26642c = new ViewOnClickListenerC26642c(m92648SI(), new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.p3
                        public /* synthetic */ C7709p3() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                            ZaloCameraView.this.m38814XR(interfaceC17463d, i15);
                        }
                    }, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.a4
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                            ZaloCameraView.m38820YR(interfaceC17463d, i15);
                        }
                    });
                    viewOnClickListenerC26642c.m92874z(false);
                    return viewOnClickListenerC26642c;
                }
                if (i11 == 5) {
                    C8009j.a aVar = new C8009j.a(m92648SI());
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_popup_download_title);
                    aVar.m43159h(4).m43172u(m118743r02).m43156e(AbstractC16803z.bg_story_music_download).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_popup_download_desc)).m43164m(AbstractC8020f0.str_story_music_popup_download_cancel, new InterfaceC17463d.a()).m43169r(AbstractC8020f0.str_story_music_popup_download_confirm, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.h4
                        public /* synthetic */ C7646h4() {
                        }

                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                            ZaloCameraView.this.m38827ZR(interfaceC17463d, i15);
                        }
                    });
                    return aVar.m43152a();
                }
                if (i11 == 6) {
                    return C23046d7.m118240c(m92689tK());
                }
                return super.mo39014DJ(i11);
            }
            if (i11 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null && cameraEditorController.m38211C4()) {
                z12 = true;
            }
            if (z11) {
                i13 = AbstractC8020f0.str_yes;
                i14 = AbstractC8020f0.str_no;
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_camera_background_status_dialog_confirm_exit);
            } else {
                int i15 = AbstractC8020f0.str_leave;
                int i16 = AbstractC8020f0.str_stay;
                if (this.f40891i1.f41126q0) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43860xdf35df4c);
                } else {
                    if (z12) {
                        i12 = AbstractC8020f0.str_mini_camera_ask_to_exit_editor;
                    } else {
                        i12 = AbstractC8020f0.str_camera_ask_to_exit_video_editor;
                    }
                    m118743r0 = AbstractC23136l9.m118743r0(i12);
                }
                str = m118743r0;
                i13 = i15;
                i14 = i16;
            }
            C16972e0.a aVar2 = new C16972e0.a(m92648SI());
            aVar2.m90932i(C16972e0.b.DIALOG_INFORMATION).m90949z(str).m90933j(i14, new InterfaceC17463d.a()).m90942s(i13, new InterfaceC17463d.d() { // from class: com.zing.zalo.camera.e3

                /* renamed from: q */
                public final /* synthetic */ int f41169q;

                public /* synthetic */ C7594e3(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i17) {
                    ZaloCameraView.this.m38806WR(r2, interfaceC17463d, i17);
                }
            });
            return aVar2.m90927d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
            return null;
        }
    }

    /* renamed from: DS */
    public void m39015DS() {
        this.f40900m2.m125224D0();
    }

    /* renamed from: DT */
    public void m39016DT(C29605a c29605a, long j11) {
        this.f40862T1 = c29605a;
        this.f40864U1 = j11;
    }

    /* renamed from: EP */
    public void m39017EP(long j11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m38915mQ());
        animatorSet.setDuration(j11);
        animatorSet.setInterpolator(new C26087b());
        this.f40888g2 = animatorSet;
        animatorSet.addListener(new C7550w());
        this.f40888g2.start();
    }

    /* renamed from: FQ */
    public long m39018FQ() {
        return this.f40870X1;
    }

    /* renamed from: FT */
    public void m39019FT(C31890dc c31890dc) {
        BackgroundPickerView backgroundPickerView = this.f40876a2;
        if (backgroundPickerView != null) {
            backgroundPickerView.m71385BM(c31890dc);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            View inflate = layoutInflater.inflate(AbstractC7409c0.camera_main_view, viewGroup, false);
            this.f40863U0 = inflate;
            this.f40865V0 = inflate.findViewById(AbstractC6918a0.camera_resizable_layout);
            m38890iR();
            DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) this.f40863U0.findViewById(AbstractC6918a0.camera_drag_to_close_layout);
            this.f40869X0 = dragToCloseLayout;
            dragToCloseLayout.setOnTouchEventListener(new DragToCloseLayout.InterfaceC16434c() { // from class: com.zing.zalo.camera.i4
                public /* synthetic */ C7652i4() {
                }

                @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16434c
                /* renamed from: a */
                public final void mo39366a(MotionEvent motionEvent) {
                    ZaloCameraView.this.m38834aS(motionEvent);
                }
            });
            this.f40869X0.setOnDragToCloseListener(this.f40836B2);
            int i11 = this.f40843F1;
            if (i11 >= 0) {
                this.f40869X0.setTranslationY(i11);
            }
            DragCameraLayout dragCameraLayout = (DragCameraLayout) this.f40863U0.findViewById(AbstractC6918a0.camera_drag_layout);
            this.f40871Y0 = dragCameraLayout;
            dragCameraLayout.setOnDragCameraListener(this.f40848H2);
            if (m92676n2().mo35576n3()) {
                int i12 = AbstractC32226c.m155411j(m92676n2()).top;
                View findViewById = this.f40863U0.findViewById(AbstractC6918a0.status_view);
                if (this.f40895k1 == 7) {
                    if (findViewById != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                        layoutParams.height = i12;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f40871Y0.getLayoutParams();
                        layoutParams2.topMargin = i12;
                        this.f40871Y0.setLayoutParams(layoutParams2);
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f40863U0.getLayoutParams();
                    layoutParams3.topMargin = i12;
                    this.f40863U0.setLayoutParams(layoutParams3);
                }
            }
            this.f40905p1 = new GestureDetector(m92648SI(), new C7539m0());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
        return this.f40863U0;
    }

    /* renamed from: GQ */
    public int m39020GQ() {
        TrackingSource trackingSource = this.f40902n2;
        if (trackingSource != null) {
            return trackingSource.m40683t();
        }
        return 0;
    }

    /* renamed from: GT */
    public void m39021GT(long j11) {
        this.f40870X1 = j11;
        this.f40863U0.post(new Runnable() { // from class: com.zing.zalo.camera.c3

            /* renamed from: q */
            public final /* synthetic */ long f41026q;

            public /* synthetic */ RunnableC7572c3(long j112) {
                r2 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38917mS(r2);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        ImageDecorView imageDecorView;
        if (m92676n2().mo35576n3()) {
            return null;
        }
        DragToCloseLayout dragToCloseLayout = this.f40869X0;
        if (AbstractC22470k.m116158j(this.f40895k1, f40830P2)) {
            if (dragToCloseLayout != null) {
                dragToCloseLayout.setTranslationY(0.0f);
                dragToCloseLayout.setAlpha(1.0f);
            }
            return null;
        }
        if (!z11 && (imageDecorView = this.f40873Z0) != null) {
            AbstractC23136l9.m118744r1(imageDecorView, 8);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (dragToCloseLayout != null) {
            if (z11) {
                dragToCloseLayout.setAlpha(0.0f);
                animatorSet.play(ObjectAnimator.ofFloat(dragToCloseLayout, "alpha", 1.0f));
            } else {
                animatorSet.play(ObjectAnimator.ofFloat(dragToCloseLayout, "alpha", 0.0f));
            }
        }
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C7535k0(z11, runnable, dragToCloseLayout));
        return animatorSet;
    }

    /* renamed from: HT */
    public void m39023HT(boolean z11) {
        boolean z12;
        boolean z13 = m92676n2() instanceof ZaloActivity;
        ImageDecorView imageDecorView = this.f40873Z0;
        if (z13 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        imageDecorView.setSupportFadeInAnimation(z12);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        CameraEditorController cameraEditorController;
        GalleryPickerMini galleryPickerMini;
        super.mo39024IJ();
        AbstractC19849s1.m103553e(this.f40920w2);
        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
        if (galleryPickerContainer != null && (galleryPickerMini = galleryPickerContainer.f41260p) != null) {
            galleryPickerMini.m39346j();
        }
        C0820h.m2142e();
        CameraEditorController cameraEditorController2 = this.f40883e1;
        if (cameraEditorController2 != null) {
            cameraEditorController2.m38256X2();
        }
        if (m92676n2() != null && m92676n2().mo35585v() != null) {
            m92676n2().mo35585v().setBackground(this.f40898l2);
        }
        if (m38666CR() && (cameraEditorController = this.f40883e1) != null) {
            C3450a mediaEditorLogInfo = cameraEditorController.getMediaEditorLogInfo();
            mediaEditorLogInfo.m17368d(System.currentTimeMillis());
            CameraInputParams cameraInputParams = this.f40891i1;
            C2526d.m12652D(cameraInputParams.f41130s0, mediaEditorLogInfo, cameraInputParams.f41128r0);
        }
    }

    /* renamed from: IP */
    public void m39025IP(int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m38991xQ(i11));
        animatorSet.setDuration(0L);
        animatorSet.setInterpolator(new C26087b());
        this.f40888g2 = animatorSet;
        animatorSet.addListener(new C7548u());
        this.f40888g2.start();
    }

    /* renamed from: IQ */
    public String m39026IQ() {
        String str;
        if (AbstractC22470k.m116158j(this.f40895k1, 7)) {
            return AbstractC22466g.m116130d();
        }
        if (AbstractC22470k.m116158j(this.f40895k1, 2)) {
            return AbstractC20130d.m104830F0() + "VID_" + System.currentTimeMillis() + ".mp4";
        }
        Conversation conversation = this.f40893j1;
        if (conversation != null) {
            str = conversation.f42893q;
        } else {
            str = "";
        }
        return C20131e.f99303a.m104939V(str) + System.currentTimeMillis() + ".mp4";
    }

    /* renamed from: JT */
    public void m39027JT(int i11) {
        this.f40841E1 = i11;
    }

    /* renamed from: KQ */
    public boolean m39028KQ() {
        try {
            if (!m39071qR()) {
                m39038VT(false, new int[0]);
            } else {
                m38833aR();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: LJ */
    public void mo39029LJ() {
        AbstractC20110a.m104544m("onDetachViewFromContainer", new Object[0]);
        super.mo39029LJ();
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            cameraPreviewController.f40743O0.removeCallbacksAndMessages(null);
        }
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null) {
            cameraEditorController.f40584Z2.removeCallbacksAndMessages(null);
        }
        this.f40918v2.removeCallbacksAndMessages(null);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        if (i11 == 25 || i11 == 24) {
            try {
                if (AbstractC23309i.m121269Oe()) {
                    if (this.f40897l1 == 1) {
                        CameraPreviewController cameraPreviewController = this.f40881d1;
                        if (cameraPreviewController != null) {
                            if (!cameraPreviewController.m38594s1()) {
                                if (this.f40881d1.getRecordButton().isEnabled()) {
                                    View view = this.f40881d1.f40732J;
                                    if (view != null) {
                                        if (!view.isShown()) {
                                        }
                                    }
                                    if (AbstractC22470k.m116158j(this.f40895k1, 2)) {
                                        this.f40881d1.getRecordButton().performClick();
                                    } else {
                                        this.f40881d1.m38571U1();
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
        return super.mo39030NJ(i11, keyEvent);
    }

    /* renamed from: OS */
    public String m39031OS() {
        try {
            if (this.f40873Z0 != null) {
                JSONObject jSONObject = new JSONObject();
                CameraPreviewController cameraPreviewController = this.f40881d1;
                if (cameraPreviewController != null) {
                    cameraPreviewController.m38583h2(jSONObject);
                }
                CameraEditorController cameraEditorController = this.f40883e1;
                boolean z11 = false;
                if (cameraEditorController != null) {
                    cameraEditorController.m38288r6(jSONObject);
                    if (this.f40897l1 == 2 && this.f40883e1.m38211C4()) {
                        z11 = true;
                    }
                    jSONObject.put("intensity_color_filter", this.f40860S1);
                }
                this.f40873Z0.getRender().m98311q2(z11);
                this.f40873Z0.getRender().f93550r0 = AbstractC32212c.m155334d(this.f40845G1);
                jSONObject.put("is_restoring", z11);
                jSONObject.put("is_landscape", this.f40873Z0.getRender().f93550r0);
                jSONObject.put("decor_objects_data", this.f40873Z0.getDecorObjectDataToSave());
                jSONObject.put("camera_state", this.f40897l1);
                return jSONObject.toString();
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
            return "";
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m38794US();
        m38787TS();
        m38755PP(null);
    }

    /* renamed from: QP */
    void m39033QP(C23930c.d dVar) {
        m38858dU(dVar.m125253b(), "", dVar.m125252a(), null, 0);
        this.f40883e1.m38242P3();
        AbstractC0924m0.m2995Dg(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        this.f40833A1 = false;
        this.f40925z1 = true;
        super.mo13886RJ();
        try {
            this.f40915u1 = false;
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null) {
                if (cameraPreviewController.f40769f0) {
                    cameraPreviewController.m38566Q2(true);
                }
                ShowcaseView showcaseView = this.f40881d1.f40730I;
                if (showcaseView != null && showcaseView.getParent() != null) {
                    this.f40881d1.f40730I.m74634n();
                }
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null) {
                cameraEditorController.m38215D6();
                this.f40883e1.m38238M3();
                ShowcaseView showcaseView2 = this.f40883e1.f40562T1;
                if (showcaseView2 != null && showcaseView2.getParent() != null) {
                    this.f40883e1.f40562T1.m74634n();
                }
                this.f40883e1.m38241O6();
            }
            m38899jU();
            this.f40873Z0.m39677p();
            if (m92692wK().mo35576n3()) {
                C29667y.m147442J();
            } else {
                C29667y.m147458p().m147471G(new C29639c0());
            }
            m92676n2().mo35554O(18);
            m38839bQ();
            CameraPreviewController cameraPreviewController2 = this.f40881d1;
            if (cameraPreviewController2 != null && cameraPreviewController2.m38590p1()) {
                m39017EP(0L);
                if (m39068oR()) {
                    m39037UT(false, false, new boolean[0]);
                }
                if (m39065nR()) {
                    m39036TT(false, false, new boolean[0]);
                }
            }
            AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
            if (m92676n2().mo35586v2() && this.f40897l1 == 2) {
                finish();
            }
            AbstractC12670d.m71366a(this.f40879c1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: RS */
    public void m39034RS(long j11) {
        this.f40900m2.m125230K0(j11);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putParcelable("input_params", this.f40891i1);
        bundle.putParcelable("input_contact_profile", this.f40893j1);
        bundle.putBoolean("is_showing_gallery_full", this.f40921x1);
        bundle.putString("all_data", m39031OS());
        super.mo37118SJ(bundle);
    }

    /* renamed from: ST */
    public void m39035ST() {
        int i11;
        int i12;
        try {
            Bundle bundle = new Bundle();
            if (this.f40895k1 == 9) {
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_short_video", "channel"));
                i11 = 29;
            } else {
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_post_story", "social_timeline"));
                i11 = 13;
            }
            bundle.putInt("extra_photo_type", i11);
            bundle.putSerializable("extra_media_picker_source", m38678EQ());
            bundle.putBoolean("extra_open_from_camera", true);
            GalleryPickerView galleryPickerView = new GalleryPickerView();
            galleryPickerView.mo60305zK(bundle);
            galleryPickerView.m71477zN(this.f40850I2);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2.mo35576n3()) {
                i12 = AbstractC6918a0.chat_head_full_container;
            } else {
                i12 = R.id.content;
            }
            if (m92676n2.mo35585v() != null && m92676n2.mo35585v().getId() != 0) {
                i12 = m92676n2.mo35585v().getId();
            }
            m92676n2.mo35579p().m93058d2(i12, galleryPickerView, 11120, "GALLERY_PICKER_VIEW_TAG", 0, true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: TT */
    public void m39036TT(boolean z11, boolean z12, boolean... zArr) {
        int m118641B;
        try {
            Animator animator = this.f40884e2;
            if (animator != null && animator.isRunning()) {
                this.f40884e2.cancel();
            }
            if (!z11 || !m39065nR()) {
                if (!z11 && !m39065nR()) {
                    return;
                }
                if (z11) {
                    int m122007i5 = f40831Q2 - AbstractC23309i.m122007i5(MainApplication.getAppContext());
                    this.f40871Y0.setShowBgPickerBox(true);
                    this.f40871Y0.setPickerMiniY(m122007i5);
                    if (this.f40876a2 == null) {
                        m39047eR();
                    }
                    if (m39068oR()) {
                        m38819YQ();
                        AbstractC23136l9.m118744r1(this.f40874Z1, 0);
                        this.f40881d1.f40714A.setImageResource(AbstractC16803z.icn_social_story_emoji);
                    } else {
                        m38685FP(true, z12, zArr);
                    }
                    this.f40874Z1.bringToFront();
                } else {
                    this.f40871Y0.setShowBgPickerBox(false);
                    this.f40871Y0.setPickerMiniY(0);
                    FrameLayout frameLayout = this.f40874Z1;
                    if (frameLayout != null && frameLayout.getVisibility() == 0) {
                        m38685FP(false, z12, zArr);
                    }
                    return;
                }
                CameraPreviewController cameraPreviewController = this.f40881d1;
                RedDotRoundedImageView redDotRoundedImageView = cameraPreviewController.f40799z;
                if (z11) {
                    m118641B = AbstractC23136l9.m118641B(cameraPreviewController.getContext(), AbstractC16801x.camera_background_picker_selected);
                } else {
                    m118641B = AbstractC23136l9.m118641B(cameraPreviewController.getContext(), AbstractC16801x.white);
                }
                redDotRoundedImageView.setBorderColor(m118641B);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m38748OP(true);
        if (!m92692wK().mo35576n3()) {
            this.f40906p2.m128104c(m92692wK().mo35575n1(), new ExecutorC2100e0(), this.f40908q2);
        }
    }

    /* renamed from: UT */
    public void m39037UT(boolean z11, boolean z12, boolean... zArr) {
        int i11;
        try {
            Animator animator = this.f40886f2;
            if (animator != null && animator.isRunning()) {
                this.f40886f2.cancel();
            }
            if (!z11 || !m39068oR()) {
                if (!z11 && !m39068oR()) {
                    return;
                }
                if (z11) {
                    int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
                    int i12 = f40831Q2 - m122007i5;
                    this.f40871Y0.setShowBgPickerBox(true);
                    this.f40871Y0.setPickerMiniY(i12);
                    if (this.f40880c2 == null) {
                        m38909lR(m122007i5);
                    } else {
                        C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                    }
                    if (m39065nR()) {
                        AbstractC23136l9.m118744r1(this.f40874Z1, 8);
                        m38766QT();
                        CameraPreviewController cameraPreviewController = this.f40881d1;
                        cameraPreviewController.f40799z.setBorderColor(AbstractC23136l9.m118641B(cameraPreviewController.getContext(), AbstractC16801x.white));
                    } else {
                        m38691GP(true, z12, zArr);
                    }
                    this.f40878b2.bringToFront();
                } else {
                    this.f40871Y0.setShowBgPickerBox(false);
                    this.f40871Y0.setPickerMiniY(0);
                    FrameLayout frameLayout = this.f40878b2;
                    if (frameLayout != null && frameLayout.getVisibility() == 0) {
                        m38691GP(false, z12, zArr);
                    }
                    return;
                }
                ImageButton imageButton = this.f40881d1.f40714A;
                if (z11) {
                    i11 = AbstractC16803z.icn_social_story_emoji_active;
                } else {
                    i11 = AbstractC16803z.icn_social_story_emoji;
                }
                imageButton.setImageResource(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 40);
        C23744a.m124114c().m124117e(this, 44);
        C23744a.m124114c().m124117e(this, 60061);
        C23744a.m124114c().m124117e(this, 60062);
        C28208v2.m142128t().m142138l();
        if (this.f40923y1 || m92681pJ()) {
            this.f40923y1 = false;
            m38942qT();
        }
        this.f40906p2.m128105e(this.f40908q2);
    }

    /* renamed from: VT */
    public void m39038VT(boolean z11, int... iArr) {
        m38749OQ(true, z11, iArr);
    }

    /* renamed from: WQ */
    public void m39039WQ() {
        ShowcaseView showcaseView;
        ShowcaseView showcaseView2;
        try {
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController != null && (showcaseView2 = cameraPreviewController.f40730I) != null && showcaseView2.getParent() != null) {
                this.f40881d1.f40730I.m74635p();
            }
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController != null && (showcaseView = cameraEditorController.f40562T1) != null && showcaseView.getParent() != null) {
                this.f40883e1.f40562T1.m74635p();
            }
            this.f40918v2.sendMessageDelayed(this.f40918v2.obtainMessage(3, "tip.any"), 250L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        this.f40919w1 = false;
        while (true) {
            Runnable runnable = (Runnable) this.f40861T0.poll();
            if (runnable == null) {
                break;
            } else {
                runnable.run();
            }
        }
        if (z11) {
            if (m92683qJ() && AbstractC22470k.m116158j(this.f40895k1, f40830P2)) {
                this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.a3
                    public /* synthetic */ RunnableC7558a3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.this.finish();
                    }
                });
                return;
            }
            if (!z12 || m92683qJ()) {
                m38681ET(true);
                m38986wU();
                C32556e.m157646h().m157648e();
                m38978vQ();
                m38897jQ(new C7549v());
                try {
                    m92662fJ().m93094z(false);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ZaloCameraView", e11);
                }
                this.f40918v2.sendEmptyMessage(4);
            }
        }
    }

    /* renamed from: XS */
    public void m39040XS() {
        int i11;
        try {
            CameraPreviewController cameraPreviewController = this.f40881d1;
            if (cameraPreviewController == null) {
                return;
            }
            if (this.f40846G2) {
                i11 = this.f40842E2;
            } else {
                i11 = this.f40844F2;
            }
            if (cameraPreviewController.getEditStatus().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int lineCount = this.f40881d1.getEditStatus().getLayout().getLineCount();
                if (((ViewGroup.MarginLayoutParams) this.f40881d1.getEditStatus().getLayoutParams()).bottomMargin != i11) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40881d1.getEditStatus().getLayoutParams();
                    if (lineCount < 5) {
                        i11 = 0;
                    }
                    marginLayoutParams.bottomMargin = i11;
                    this.f40881d1.getEditStatus().requestLayout();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: XT */
    public void m39041XT(boolean z11, int... iArr) {
        m38756PQ(true, z11, iArr);
    }

    /* renamed from: YT */
    public void m39042YT(boolean z11) {
        int i11;
        RecyclingImageView recyclingImageView = this.f40867W0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(recyclingImageView, i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(-16777216);
        m89412p.m89426U(Boolean.FALSE);
        this.f40885f1 = AbstractC23306f.m120715u();
        this.f40887g1 = AbstractC23306f.m120566B0();
        this.f40919w1 = true;
        this.f40861T0.add(new Runnable() { // from class: com.zing.zalo.camera.k3

            /* renamed from: q */
            public final /* synthetic */ Bundle f41319q;

            public /* synthetic */ RunnableC7663k3(Bundle bundle2) {
                r2 = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38891iS(r2);
            }
        });
        CameraInputParams cameraInputParams = this.f40891i1;
        if (cameraInputParams != null) {
            if (AbstractC22470k.m116158j(cameraInputParams.f41129s, 7)) {
                this.f40914t2 = System.currentTimeMillis();
            }
            if (!this.f40891i1.f41122o0.isEmpty()) {
                CameraInputParams cameraInputParams2 = this.f40891i1;
                C2526d.m12648B("", cameraInputParams2.f41124p0, cameraInputParams2.f41128r0);
            }
        }
    }

    /* renamed from: ZT */
    public void m39043ZT(CameraPreviewController cameraPreviewController, int i11) {
        if (i11 == 0) {
            if (!this.f40891i1.f41100S && cameraPreviewController.f40795x != null) {
                if (!cameraPreviewController.m38594s1()) {
                    AbstractC23136l9.m118744r1(cameraPreviewController.f40795x, 0);
                    if (cameraPreviewController.m38565Q0()) {
                        AbstractC23136l9.m118744r1(cameraPreviewController.f40797y, 0);
                    }
                } else {
                    AbstractC23136l9.m118744r1(cameraPreviewController.f40795x, 8);
                    AbstractC23136l9.m118744r1(cameraPreviewController.f40797y, 8);
                }
            }
            if (cameraPreviewController.m38594s1()) {
                AbstractC23136l9.m118744r1(cameraPreviewController.f40799z, 0);
                AbstractC23136l9.m118744r1(cameraPreviewController.f40714A, 0);
            }
            if (cameraPreviewController.f40781q == null) {
                cameraPreviewController.m38581f1(this.f40901n1);
                return;
            }
            cameraPreviewController.m38561M2(0);
            cameraPreviewController.m38574W0();
            cameraPreviewController.m38598x2(cameraPreviewController.getPreviewRecordMode());
            return;
        }
        if (i11 == 8) {
            AbstractC23136l9.m118744r1(cameraPreviewController.f40795x, 8);
            AbstractC23136l9.m118744r1(cameraPreviewController.f40797y, 8);
            if (cameraPreviewController.m38594s1()) {
                AbstractC23136l9.m118744r1(cameraPreviewController.f40799z, 8);
                AbstractC23136l9.m118744r1(cameraPreviewController.f40714A, 8);
            }
            cameraPreviewController.m38561M2(8);
            cameraPreviewController.m38569T0();
        }
    }

    /* renamed from: aU */
    public void m39044aU(Runnable runnable) {
        AbstractC23136l9.m118744r1(this.f40867W0, 0);
        this.f40867W0.setAlpha(0.0f);
        this.f40867W0.animate().alpha(1.0f).setDuration(150L).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable).start();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
        super.mo39045bK(z11);
        this.f40907q1 = z11;
    }

    /* renamed from: cU */
    public boolean m39046cU() {
        int i11;
        int m121154La = AbstractC23309i.m121154La();
        if (m121154La == 0) {
            return true;
        }
        if (m121154La == 1 && ((i11 = this.f40899m1) == 0 || i11 == 1)) {
            return true;
        }
        if (m121154La == 2 && this.f40899m1 == 2) {
            return true;
        }
        if (m121154La == 4 && this.f40899m1 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: eR */
    public void m39047eR() {
        if (this.f40876a2 == null) {
            BackgroundPickerView backgroundPickerView = new BackgroundPickerView();
            this.f40876a2 = backgroundPickerView;
            backgroundPickerView.m71384AM(true);
            if (m92676n2() != null && !m92676n2().isFinishing() && !mo60294yp()) {
                m39054jR(AbstractC23309i.m122007i5(MainApplication.getAppContext()));
                m38870fR();
                m92649TI().m93058d2(AbstractC6918a0.background_picker_container, this.f40876a2, 0, "bgPickerView", 0, false);
            }
        }
    }

    /* renamed from: fT */
    public void m39048fT() {
        ImageView imageView;
        if (AbstractC26681b.f126358c && !m92676n2().mo35567d1() && (imageView = this.f40877b1) != null && this.f40924y2 == null) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(imageView);
            this.f40924y2 = bVar;
            bVar.f148631c = true;
            bVar.m155416a(0, AbstractC23222t7.f112586t, 0, 0);
            m92682pK(this.f40924y2);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        this.f40923y1 = true;
        if (m92676n2() != null) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.camera.m4
                public /* synthetic */ RunnableC7680m4() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.this.m38718KR();
                }
            });
        }
    }

    /* renamed from: gT */
    public void m39049gT(boolean z11) {
        if (!mo60294yp() && (this.f40869X0 == null || this.f40863U0 == null || !m92672lJ() || this.f40881d1 == null)) {
            this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.l3

                /* renamed from: q */
                public final /* synthetic */ boolean f41328q;

                public /* synthetic */ RunnableC7669l3(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloCameraView.this.m38898jS(r2);
                }
            }, 200L);
        } else {
            m38674EC(z112);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZaloCameraView";
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: hM */
    protected RotatableZaloView.EnumC14966b mo39050hM() {
        return RotatableZaloView.EnumC14966b.Auto;
    }

    /* renamed from: hT */
    public void m39051hT() {
        this.f40873Z0.getRender().m1983u0();
        this.f40873Z0.mo39680s();
        this.f40859R1 = null;
        m39021GT(-10L);
    }

    /* renamed from: iQ */
    public C20610a m39052iQ() {
        return new C20610a(this.f40859R1.m147131h() + "", this.f40870X1 + "", false);
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: jM */
    public RotatableZaloView.EnumC14966b mo39053jM() {
        return super.mo39053jM();
    }

    /* renamed from: jR */
    public void m39054jR(int i11) {
        if (this.f40874Z1 == null) {
            FrameLayout frameLayout = (FrameLayout) this.f40881d1.findViewById(AbstractC6918a0.background_picker_container);
            this.f40874Z1 = frameLayout;
            frameLayout.setVisibility(4);
        }
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        if (i11 < m122007i5) {
            i11 = m122007i5;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40874Z1.getLayoutParams();
        layoutParams.height = i11;
        this.f40874Z1.setLayoutParams(layoutParams);
    }

    /* renamed from: jT */
    public void m39055jT() {
        this.f40900m2.m125227G0();
    }

    /* renamed from: kR */
    public void m39056kR(int i11) {
        if (this.f40878b2 == null) {
            this.f40878b2 = (FrameLayout) this.f40881d1.findViewById(AbstractC6918a0.emoji_picker_container);
        }
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        if (i11 < m122007i5) {
            i11 = m122007i5;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40878b2.getLayoutParams();
        layoutParams.height = i11;
        this.f40878b2.setLayoutParams(layoutParams);
    }

    /* renamed from: kT */
    public void m39057kT() {
        BackgroundPickerView backgroundPickerView = this.f40876a2;
        if (backgroundPickerView != null) {
            backgroundPickerView.m71397xM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: lM */
    protected boolean mo39058lM() {
        return true;
    }

    /* renamed from: lQ */
    public int m39059lQ() {
        return this.f40895k1;
    }

    /* renamed from: lT */
    public void m39060lT(boolean z11) {
        m39062mT(z11, true);
    }

    /* renamed from: lU */
    public void m39061lU(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.z2

            /* renamed from: q */
            public final /* synthetic */ String f41815q;

            public /* synthetic */ RunnableC7809z2(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38928oS(r2);
            }
        });
    }

    /* renamed from: mT */
    public void m39062mT(boolean z11, boolean z12) {
        InterfaceC27218a m92676n2;
        Window window;
        if ((z12 && !m92672lJ()) || (m92676n2 = m92676n2()) == null || m92676n2.mo35576n3() || (window = m92676n2.getWindow()) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (z11) {
            window.setFlags(1024, 1024);
            viewGroup.setSystemUiVisibility(0);
        } else {
            window.clearFlags(1024);
            viewGroup.setSystemUiVisibility(0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView
    /* renamed from: nM */
    public void mo39063nM(int i11) {
        AbstractC20110a.m104544m("onOrientationChanged - from sensor %d , screen %d", Integer.valueOf(i11), Integer.valueOf(AbstractC32212c.m155331a(m92648SI())));
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null && cameraPreviewController.f40769f0) {
            return;
        }
        super.mo39063nM(i11);
        Message message = new Message();
        message.what = 2;
        message.arg1 = i11;
        message.arg2 = 0;
        message.obj = Long.valueOf(System.currentTimeMillis());
        this.f40918v2.sendMessageDelayed(message, 0L);
    }

    /* renamed from: nQ */
    public C29605a m39064nQ() {
        return this.f40859R1;
    }

    /* renamed from: nR */
    public boolean m39065nR() {
        FrameLayout frameLayout = this.f40874Z1;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.camera.InterfaceC7732s2
    /* renamed from: nn */
    public LiveData mo39066nn() {
        return this.f40872Y1;
    }

    /* renamed from: oQ */
    public DragCameraLayout m39067oQ() {
        return this.f40871Y0;
    }

    /* renamed from: oR */
    public boolean m39068oR() {
        FrameLayout frameLayout = this.f40878b2;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: oT */
    public void m39069oT() {
        FrameLayout frameLayout = this.f40875a1;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x019d A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #2 {Exception -> 0x0073, blocks: (B:3:0x000a, B:31:0x006e, B:23:0x00b1, B:9:0x0199, B:11:0x019d, B:32:0x00b6, B:35:0x00bf, B:38:0x00cd, B:39:0x00e2, B:40:0x00e7, B:41:0x00ec, B:42:0x00fe, B:45:0x0105, B:47:0x010b, B:48:0x0119, B:49:0x012a, B:50:0x0114, B:52:0x0131, B:54:0x0138, B:56:0x013c, B:59:0x0143, B:61:0x0149, B:62:0x0165, B:64:0x0175, B:66:0x017b, B:67:0x018b, B:68:0x015e, B:69:0x018e, B:71:0x0196, B:17:0x0076, B:20:0x007d, B:25:0x0033, B:28:0x003a), top: B:2:0x000a, inners: #0, #1 }] */
    @Override // com.zing.zalo.zview.ZaloView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        int i13;
        int i14;
        CameraEditorController cameraEditorController;
        int i15;
        int i16;
        CameraEditorController cameraEditorController2;
        try {
            this.f40873Z0.mo39678q();
            int i17 = 0;
            switch (i11) {
                case 11117:
                    this.f40913t1 = false;
                    if (this.f40897l1 == 2 && (cameraEditorController = this.f40883e1) != null) {
                        cameraEditorController.m38292s8();
                    }
                    if (i12 == -1 && intent != null) {
                        boolean booleanExtra = intent.getBooleanExtra("mark_video_position_only", false);
                        if (booleanExtra) {
                            String stringExtra2 = intent.getStringExtra("video_input_path");
                            int intExtra = intent.getIntExtra("video_output_start_position", 0);
                            i14 = intent.getIntExtra("video_output_play_duration", 0);
                            stringExtra = stringExtra2;
                            i13 = intExtra;
                        } else {
                            stringExtra = intent.getStringExtra("video_output_path");
                            i13 = 0;
                            i14 = 0;
                        }
                        this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.k4

                            /* renamed from: q */
                            public final /* synthetic */ int f41321q;

                            public /* synthetic */ RunnableC7664k4(int i142) {
                                r2 = i142;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloCameraView.this.m38793UR(r2);
                            }
                        });
                        if (!TextUtils.isEmpty(stringExtra) && AbstractC23041d2.m118194A(stringExtra)) {
                            this.f40915u1 = true;
                            m38744NT(stringExtra, i13, i142, false, true, !booleanExtra);
                        } else {
                            this.f40915u1 = false;
                        }
                    } else if (this.f40891i1.m39215d()) {
                        finish();
                    }
                    cameraEditorController2 = this.f40883e1;
                    if (cameraEditorController2 != null) {
                        cameraEditorController2.m38277h3(i11, i12, intent);
                        break;
                    }
                    break;
                case 11118:
                    this.f40913t1 = false;
                    String str = null;
                    if (i12 == -1 && intent != null) {
                        if (intent.getBooleanExtra("mark_video_position_only", false)) {
                            i16 = intent.getIntExtra("video_output_start_position", 0);
                            i17 = intent.getIntExtra("video_output_play_duration", 0);
                        } else {
                            str = intent.getStringExtra("video_output_path");
                            i16 = 0;
                        }
                        this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.l4

                            /* renamed from: q */
                            public final /* synthetic */ int f41330q;

                            public /* synthetic */ RunnableC7670l4(int i172) {
                                r2 = i172;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ZaloCameraView.this.m38800VR(r2);
                            }
                        });
                        int i18 = i172;
                        i172 = i16;
                        i15 = i18;
                    } else {
                        i15 = 0;
                    }
                    this.f40883e1.m38207A6(str, i172, i15);
                    cameraEditorController2 = this.f40883e1;
                    if (cameraEditorController2 != null) {
                    }
                    break;
                case 11119:
                    this.f40918v2.sendMessageDelayed(this.f40918v2.obtainMessage(3, "tip.any"), 200L);
                    cameraEditorController2 = this.f40883e1;
                    if (cameraEditorController2 != null) {
                    }
                    break;
                default:
                    switch (i11) {
                        case 11122:
                            m38792UQ(i12);
                            cameraEditorController2 = this.f40883e1;
                            if (cameraEditorController2 != null) {
                            }
                            break;
                        case 11123:
                            m38799VQ(i12);
                            cameraEditorController2 = this.f40883e1;
                            if (cameraEditorController2 != null) {
                            }
                            break;
                        case 11124:
                            if (i12 == -1 && intent != null) {
                                PrivacyInfo privacyInfo = (PrivacyInfo) intent.getParcelableExtra("EXTRA_PRIVACY_INFO_RESULT");
                                CameraEditorController cameraEditorController3 = this.f40883e1;
                                if (cameraEditorController3 != null && privacyInfo != null) {
                                    cameraEditorController3.m38218E3(privacyInfo);
                                    m38858dU(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_update_success), "", 0, null, -1);
                                }
                            }
                            cameraEditorController2 = this.f40883e1;
                            if (cameraEditorController2 != null) {
                            }
                            break;
                        case 11125:
                            m38741NQ(i12, intent);
                            cameraEditorController2 = this.f40883e1;
                            if (cameraEditorController2 != null) {
                            }
                            break;
                        default:
                            switch (i11) {
                                case 15073618:
                                    try {
                                        m38732MP(1);
                                        if (i12 == -1 && intent != null) {
                                            Intent intent2 = m92676n2().getIntent();
                                            intent2.putExtra("extra_result_output_path", intent.getStringExtra("EXTRA_CROPPED_PATH"));
                                            intent2.putExtra("EXTRA_SHOULD_PUSH_FEED", intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", false));
                                            intent2.putExtra("extra_result_camera_log", intent.getStringExtra("EXTRA_CAMERA_LOG"));
                                            intent2.putExtra("EXTRA_IS_ERROR", intent.getBooleanExtra("EXTRA_IS_ERROR", false));
                                            intent2.putExtra("EXTRA_ERROR_MSG", intent.getStringExtra("EXTRA_ERROR_MSG"));
                                            mo50035CK(-1, intent2);
                                            finish();
                                        }
                                    } catch (Exception e11) {
                                        AbstractC23350e.m122776f("ZaloCameraView", e11);
                                    }
                                    cameraEditorController2 = this.f40883e1;
                                    if (cameraEditorController2 != null) {
                                    }
                                    break;
                                case 15073619:
                                    try {
                                        m38732MP(1);
                                        if (i12 == -1 && intent != null) {
                                            Intent intent3 = m92676n2().getIntent();
                                            intent3.putExtra("extra_result_output_path", intent.getStringExtra("EXTRA_CROPPED_PATH"));
                                            intent3.putExtra("EXTRA_SHOULD_PUSH_FEED", intent.getBooleanExtra("EXTRA_SHOULD_PUSH_FEED", true));
                                            intent3.putExtra("extra_result_camera_log", intent.getStringExtra("EXTRA_CAMERA_LOG"));
                                            intent3.putExtra("EXTRA_IS_ERROR", intent.getBooleanExtra("EXTRA_IS_ERROR", false));
                                            intent3.putExtra("EXTRA_ERROR_MSG", intent.getStringExtra("EXTRA_ERROR_MSG"));
                                            mo50035CK(-1, intent3);
                                            finish();
                                        }
                                    } catch (Exception e12) {
                                        AbstractC23350e.m122776f("ZaloCameraView", e12);
                                    }
                                    cameraEditorController2 = this.f40883e1;
                                    if (cameraEditorController2 != null) {
                                    }
                                    break;
                                default:
                                    cameraEditorController2 = this.f40883e1;
                                    if (cameraEditorController2 != null) {
                                    }
                                    break;
                            }
                    }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f("ZaloCameraView", e13);
        }
        super.onActivityResult(i11, i12, intent);
    }

    void onEnterBackground() {
        this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.o3
            public /* synthetic */ RunnableC7703o3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38841bS();
            }
        }, 500L);
        CameraEditorController cameraEditorController = this.f40883e1;
        if (cameraEditorController != null && this.f40897l1 == 2) {
            cameraEditorController.m38241O6();
            this.f40883e1.m38282k8();
        }
    }

    void onEnterForeground() {
        this.f40918v2.postDelayed(new Runnable() { // from class: com.zing.zalo.camera.v3
            public /* synthetic */ RunnableC7753v3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38849cS();
            }
        }, 500L);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                if (this.f40868W1 != null) {
                    return true;
                }
                if (this.f40895k1 == 4) {
                    m39010BS();
                } else if (!m39010BS()) {
                    if (this.f40897l1 == 1) {
                        m39061lU("120N001");
                    }
                    m38835aT();
                    DragToCloseLayout dragToCloseLayout = this.f40869X0;
                    if (dragToCloseLayout != null && dragToCloseLayout.getTranslationY() == 0.0f) {
                        if (this.f88756W == 0) {
                            this.f88756W = 1;
                        }
                        finish();
                    } else {
                        m38674EC(false);
                    }
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCameraView", e11);
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        try {
            if (i11 == 141) {
                if (m38748OP(false)) {
                    m38876gQ();
                    ImageDecorView imageDecorView = this.f40873Z0;
                    if (imageDecorView != null) {
                        imageDecorView.getRender().m98302l2();
                    }
                } else {
                    finish();
                }
            } else if (i11 == 110) {
                CameraEditorController cameraEditorController = this.f40883e1;
                if (cameraEditorController != null) {
                    cameraEditorController.m38283l6(i11, strArr);
                }
            } else if (i11 == 156) {
                CameraEditorController cameraEditorController2 = this.f40883e1;
                if (cameraEditorController2 != null) {
                    cameraEditorController2.m38283l6(i11, strArr);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        this.f40833A1 = true;
        super.onResume();
        this.f40873Z0.mo39678q();
        this.f40923y1 = false;
        C23744a.m124114c().m124115b(this, 40);
        C23744a.m124114c().m124115b(this, 44);
        C23744a.m124114c().m124115b(this, 60061);
        C23744a.m124114c().m124115b(this, 60062);
        m92676n2().mo35554O(34);
        this.f40861T0.add(new Runnable() { // from class: com.zing.zalo.camera.j3
            public /* synthetic */ RunnableC7657j3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38871fS();
            }
        });
        if (this.f40919w1) {
            return;
        }
        while (true) {
            Runnable runnable = (Runnable) this.f40861T0.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }

    /* renamed from: pU */
    public void m39070pU(String str) {
        m39072qU(str, "");
    }

    /* renamed from: qR */
    public boolean m39071qR() {
        FilterPickerView filterPickerView = this.f40854M1;
        if (filterPickerView != null && filterPickerView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: qU */
    public void m39072qU(String str, String str2) {
        if (this.f40897l1 == 2) {
            CameraEditorController cameraEditorController = this.f40883e1;
            if (cameraEditorController == null || cameraEditorController.m38211C4()) {
                int i11 = this.f40895k1;
                String str3 = "chat_camera";
                if (i11 != 1) {
                    if (i11 != 7) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                str3 = "chat_photomsg";
                            }
                        } else {
                            str3 = "social_cameraupload";
                        }
                    } else {
                        str3 = "social_story";
                    }
                }
                C0815e1.m2075D().m2100V(new C23648e(34, str3, 0, str, str2), false);
            }
        }
    }

    /* renamed from: rR */
    public boolean m39073rR() {
        GalleryPickerContainer galleryPickerContainer = this.f40852K1;
        if (galleryPickerContainer != null && galleryPickerContainer.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: sQ */
    public FilterPickerView m39074sQ() {
        return this.f40854M1;
    }

    /* renamed from: tT */
    public void m39075tT() {
        this.f40900m2.m125233S0();
    }

    /* renamed from: tU */
    public void m39076tU() {
        if (!AbstractC22470k.m116158j(this.f40895k1, 7) && mo39053jM() == RotatableZaloView.EnumC14966b.Locked) {
            m83788pM(RotatableZaloView.EnumC14966b.Auto);
        }
    }

    /* renamed from: uU */
    public void m39077uU() {
        this.f40900m2.m125246q0().m9223p(this);
        this.f40900m2.m125245p0().m9223p(this);
        this.f40900m2.m125243m0().m9223p(this);
        this.f40900m2.m125247s0().m9223p(this);
    }

    /* renamed from: vR */
    public boolean m39078vR() {
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null && imageDecorView.m39773c0()) {
            return true;
        }
        return false;
    }

    /* renamed from: vS */
    public void m39079vS(String str, String str2, Bitmap bitmap) {
        try {
            if (TextUtils.isEmpty(str) && bitmap == null) {
                return;
            }
            if (bitmap != null) {
                this.f40867W0.setImageBitmap(bitmap);
            } else {
                this.f40867W0.setImageBitmap(null);
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.camera.j4

                    /* renamed from: q */
                    public final /* synthetic */ String f41310q;

                    /* renamed from: r */
                    public final /* synthetic */ String f41311r;

                    public /* synthetic */ RunnableC7658j4(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloCameraView.this.m38779SR(r2, r3);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ZaloCameraView", e11);
        }
    }

    /* renamed from: vU */
    public void m39080vU(C21362q c21362q) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40867W0.getLayoutParams();
        layoutParams.width = (int) c21362q.m110713h();
        layoutParams.height = (int) c21362q.m110707b();
        this.f40867W0.setLayoutParams(layoutParams);
        this.f40867W0.setX((float) c21362q.f104140a);
        this.f40867W0.setY((float) c21362q.f104141b);
        AbstractC23136l9.m118744r1(this.f40867W0, 0);
    }

    /* renamed from: wQ */
    public int m39081wQ(boolean z11) {
        CameraPreviewController cameraPreviewController = this.f40881d1;
        if (cameraPreviewController != null) {
            return cameraPreviewController.m38577Y0(z11);
        }
        return AbstractC26689j.m137076C(this.f40899m1) * 1000;
    }

    /* renamed from: wS */
    public void m39082wS() {
        m83788pM(RotatableZaloView.EnumC14966b.Locked);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        this.f40918v2.post(new Runnable() { // from class: com.zing.zalo.camera.t2

            /* renamed from: q */
            public final /* synthetic */ int f41570q;

            /* renamed from: r */
            public final /* synthetic */ Object[] f41571r;

            public /* synthetic */ RunnableC7740t2(int i112, Object[] objArr2) {
                r2 = i112;
                r3 = objArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloCameraView.this.m38699HR(r2, r3);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m38918mU();
    }

    /* renamed from: xT */
    public void m39083xT(C29605a c29605a) {
        this.f40859R1 = c29605a;
    }

    /* renamed from: yQ */
    public CameraPreviewController m39084yQ() {
        return this.f40881d1;
    }

    /* renamed from: yS */
    public void m39085yS() {
        this.f40900m2.m125221A0();
    }

    /* renamed from: yT */
    public void m39086yT(boolean z11) {
        ImageDecorView imageDecorView = this.f40873Z0;
        if (imageDecorView != null) {
            imageDecorView.setTouchEnable(z11);
        }
    }

    /* renamed from: zR */
    public boolean m39087zR() {
        RecyclingImageView recyclingImageView = this.f40867W0;
        if (recyclingImageView != null && recyclingImageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: zT */
    public void m39088zT(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f40843F1 = i11;
        DragToCloseLayout dragToCloseLayout = this.f40869X0;
        if (dragToCloseLayout != null) {
            dragToCloseLayout.setTranslationY(i11);
            this.f40836B2.mo38328Dg(i11);
        }
    }
}
