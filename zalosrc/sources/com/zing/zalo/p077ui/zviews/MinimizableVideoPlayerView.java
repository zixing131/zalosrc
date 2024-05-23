package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0809c1;
import ag0.C0815e1;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.C1421e;
import au.EnumC2382z;
import b40.C2526d;
import b40.C2535j;
import ci.C3509j0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.MaskableImageView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicontrol.draggableview.DraggableView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.videoplayer.DraggableVideoView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.InterfaceC17372n;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.widget.InsetsLayout;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import e80.C18303h;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hf0.AbstractC20049k;
import hf0.C20043e;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import i40.InterfaceC20278h;
import i60.C20338d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23159o;
import me0.AbstractC23238v2;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p164fn.AbstractC19037k;
import p175g0.AbstractC19182e;
import p239ih.C20556f;
import p241ij.C20568e;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p361nb.C23669z;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p420pb.C24709a;
import p500s1.C26087b;
import p558uu.InterfaceC27367c;
import p559uv.C27373c;
import sa0.C26209i;
import tv.AbstractC26897a;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.C28075g8;
import xd0.C29604t;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MinimizableVideoPlayerView extends BaseZaloView implements ZaloView.InterfaceC17422g, ZaloView.InterfaceC17421f, C23744a.c, ZVideoView.InterfaceC17345q, ZVideoView.InterfaceC17344p, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnErrorListener, AbstractC17297a.b, InterfaceC17372n, InterfaceC0733x {

    /* renamed from: C1 */
    View f75260C1;

    /* renamed from: G1 */
    String f75264G1;

    /* renamed from: H1 */
    String f75265H1;

    /* renamed from: J1 */
    Bundle f75267J1;

    /* renamed from: L1 */
    boolean f75269L1;

    /* renamed from: M0 */
    DraggableVideoView f75270M0;

    /* renamed from: N0 */
    View f75272N0;

    /* renamed from: N1 */
    int f75273N1;

    /* renamed from: O0 */
    ZVideoView f75274O0;

    /* renamed from: O1 */
    Animator f75275O1;

    /* renamed from: P0 */
    protected C17391z f75276P0;

    /* renamed from: P1 */
    ActionBarMenuItem f75277P1;

    /* renamed from: Q0 */
    protected int f75278Q0;

    /* renamed from: Q1 */
    ActionBarMenuItem f75279Q1;

    /* renamed from: R0 */
    private C27373c f75280R0;

    /* renamed from: S0 */
    int f75282S0;

    /* renamed from: T0 */
    int f75284T0;

    /* renamed from: T1 */
    InterfaceC20278h f75285T1;

    /* renamed from: U0 */
    private String f75286U0;

    /* renamed from: V0 */
    private C17945a0 f75288V0;

    /* renamed from: V1 */
    C14646l f75289V1;

    /* renamed from: W0 */
    private MessageId f75290W0;

    /* renamed from: W1 */
    C13306b f75291W1;

    /* renamed from: X0 */
    private MediaStoreItem f75292X0;

    /* renamed from: Z0 */
    C20043e f75294Z0;

    /* renamed from: a1 */
    MaskableImageView f75295a1;

    /* renamed from: b1 */
    C23528a f75296b1;

    /* renamed from: e1 */
    OrientationEventListener f75299e1;

    /* renamed from: g1 */
    C3977j f75301g1;

    /* renamed from: m1 */
    private boolean f75307m1;

    /* renamed from: p1 */
    private String f75310p1;

    /* renamed from: u1 */
    DragToCloseLayout f75315u1;

    /* renamed from: y1 */
    boolean f75319y1;

    /* renamed from: Y0 */
    int f75293Y0 = 0;

    /* renamed from: c1 */
    Handler f75297c1 = new Handler(Looper.getMainLooper());

    /* renamed from: d1 */
    boolean f75298d1 = false;

    /* renamed from: f1 */
    boolean f75300f1 = false;

    /* renamed from: h1 */
    boolean f75302h1 = true;

    /* renamed from: i1 */
    private int f75303i1 = -1;

    /* renamed from: j1 */
    protected boolean f75304j1 = true;

    /* renamed from: k1 */
    boolean f75305k1 = false;

    /* renamed from: l1 */
    boolean f75306l1 = false;

    /* renamed from: n1 */
    private boolean f75308n1 = false;

    /* renamed from: o1 */
    private boolean f75309o1 = false;

    /* renamed from: q1 */
    private boolean f75311q1 = false;

    /* renamed from: r1 */
    private boolean f75312r1 = false;

    /* renamed from: s1 */
    private String f75313s1 = "0";

    /* renamed from: t1 */
    private String f75314t1 = "";

    /* renamed from: v1 */
    boolean f75316v1 = false;

    /* renamed from: w1 */
    int f75317w1 = 0;

    /* renamed from: x1 */
    boolean f75318x1 = false;

    /* renamed from: z1 */
    int f75320z1 = -1;

    /* renamed from: A1 */
    boolean f75258A1 = false;

    /* renamed from: B1 */
    private int f75259B1 = 0;

    /* renamed from: D1 */
    boolean f75261D1 = false;

    /* renamed from: E1 */
    boolean f75262E1 = false;

    /* renamed from: F1 */
    boolean f75263F1 = false;

    /* renamed from: I1 */
    boolean f75266I1 = false;

    /* renamed from: K1 */
    boolean f75268K1 = false;

    /* renamed from: M1 */
    boolean f75271M1 = false;

    /* renamed from: R1 */
    boolean f75281R1 = false;

    /* renamed from: S1 */
    protected boolean f75283S1 = true;

    /* renamed from: U1 */
    VideoController.AbstractC17311d f75287U1 = new C14645k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$a */
    /* loaded from: classes6.dex */
    public class C14635a implements DragToCloseLayout.InterfaceC16432a {

        /* renamed from: p */
        ValueAnimator f75321p;

        /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$a$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MinimizableVideoPlayerView.this.mo79709QM();
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$a$b */
        /* loaded from: classes6.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MinimizableVideoPlayerView.this.f72421L0.m92662fJ().m93094z(false);
                View view = MinimizableVideoPlayerView.this.f75260C1;
                if (view != null) {
                    view.setBackgroundColor(-16777216);
                }
            }
        }

        C14635a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m81916c(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MinimizableVideoPlayerView.this.f75315u1.setTranslationY(intValue);
            View view = MinimizableVideoPlayerView.this.f75260C1;
            if (view != null && view.getHeight() > 0) {
                MinimizableVideoPlayerView.this.f75260C1.setBackgroundColor(Color.argb(Math.max(255 - ((Math.abs(intValue) * 255) / MinimizableVideoPlayerView.this.f75260C1.getHeight()), 0), 0, 0, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81917d(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            MinimizableVideoPlayerView.this.f75315u1.setTranslationY(intValue);
            View view = MinimizableVideoPlayerView.this.f75260C1;
            if (view != null && view.getHeight() > 0) {
                MinimizableVideoPlayerView.this.f75260C1.setBackgroundColor(Color.argb(Math.max(255 - ((Math.abs(intValue) * 255) / MinimizableVideoPlayerView.this.f75260C1.getHeight()), 0), 0, 0, 0));
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
            if (!MinimizableVideoPlayerView.this.f72421L0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(MinimizableVideoPlayerView.this.f72421L0.m92676n2().getWindow(), false);
            }
            View view = MinimizableVideoPlayerView.this.f75260C1;
            if (view != null && view.getHeight() > 0) {
                MinimizableVideoPlayerView.this.f75260C1.setBackgroundColor(Color.argb(Math.max(255 - ((((int) Math.abs(f11)) * 255) / MinimizableVideoPlayerView.this.f75260C1.getHeight()), 0), 0, 0, 0));
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean z11) {
            MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
            minimizableVideoPlayerView.f75316v1 = false;
            if (!z11) {
                int translationY = (int) minimizableVideoPlayerView.f75315u1.getTranslationY();
                int height = MinimizableVideoPlayerView.this.f75315u1.getHeight();
                if (translationY < 0) {
                    height = -height;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(translationY, height);
                this.f75321p = ofInt;
                ofInt.setDuration(300L);
                this.f75321p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.uy
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MinimizableVideoPlayerView.C14635a.this.m81916c(valueAnimator);
                    }
                });
                this.f75321p.addListener(new a());
            } else {
                AbstractC23136l9.m118686X0(minimizableVideoPlayerView.f72421L0.m92676n2().getWindow(), true);
                ValueAnimator ofInt2 = ValueAnimator.ofInt((int) MinimizableVideoPlayerView.this.f75315u1.getTranslationY(), 0);
                this.f75321p = ofInt2;
                ofInt2.setDuration(300L);
                this.f75321p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.vy
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MinimizableVideoPlayerView.C14635a.this.m81917d(valueAnimator);
                    }
                });
                this.f75321p.addListener(new b());
            }
            this.f75321p.start();
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
            ValueAnimator valueAnimator = this.f75321p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
            minimizableVideoPlayerView.f75316v1 = true;
            minimizableVideoPlayerView.m81906ZM(false, false, true, false);
            MinimizableVideoPlayerView.this.f72421L0.m92662fJ().m93094z(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$b */
    /* loaded from: classes6.dex */
    public class C14636b extends C13306b.c {
        C14636b() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130866w;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            ZVideoView zVideoView;
            if ("tip.video.snapshot".equals(str) && (zVideoView = MinimizableVideoPlayerView.this.f75274O0) != null) {
                return new C26209i(zVideoView.findViewById(C17395R.id.video_btn_snapshot));
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (MinimizableVideoPlayerView.this.m92672lJ() && MinimizableVideoPlayerView.this.m92687sJ() && !MinimizableVideoPlayerView.this.mo66383c8()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$c */
    /* loaded from: classes6.dex */
    public class C14637c implements C18303h.b {
        C14637c() {
        }

        @Override // e80.C18303h.b
        /* renamed from: a */
        public boolean mo69095a() {
            if (!MinimizableVideoPlayerView.this.f72421L0.m92677nJ() && MinimizableVideoPlayerView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }

        @Override // e80.C18303h.b
        /* renamed from: b */
        public void mo69096b(boolean z11) {
            if (z11) {
                MinimizableVideoPlayerView.this.f72421L0.mo46829Y();
            } else {
                MinimizableVideoPlayerView.this.f72421L0.mo49315c4();
            }
        }

        @Override // e80.C18303h.b
        /* renamed from: c */
        public void mo69097c(List list) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("bol_share_in_app", true);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaStoreItem) it.next()).m40571M());
            }
            bundle.putParcelableArrayList("EXTRA_LIST_MESSAGE_ID_FORWARDING", arrayList);
            bundle.putString("extra_tracking_source_feed", new TrackingSource(9).m40686z());
            MinimizableVideoPlayerView.this.m92662fJ().m93066i2(ShareView.class, bundle, 0, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$d */
    /* loaded from: classes6.dex */
    public class C14638d extends C23999j {
        C14638d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    C3977j c3977j = MinimizableVideoPlayerView.this.f75301g1;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    MinimizableVideoPlayerView.this.f75274O0.setLoadingViewImageInfo(c3979l);
                    MinimizableVideoPlayerView.this.f75295a1.m75794q(c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$e */
    /* loaded from: classes6.dex */
    class C14639e extends OrientationEventListener {
        C14639e(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            try {
                MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
                minimizableVideoPlayerView.f75320z1 = i11;
                if (minimizableVideoPlayerView.f75317w1 == 0 && !minimizableVideoPlayerView.f75319y1 && Settings.System.getInt(minimizableVideoPlayerView.f72421L0.m92648SI().getContentResolver(), "accelerometer_rotation") == 1) {
                    if ((i11 >= 30 && i11 <= 60) || ((i11 >= 120 && i11 <= 150) || ((i11 >= 210 && i11 <= 240) || (i11 >= 300 && i11 <= 330)))) {
                        MinimizableVideoPlayerView.this.m81904WM(-1);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$f */
    /* loaded from: classes6.dex */
    public class ViewOnLayoutChangeListenerC14640f implements View.OnLayoutChangeListener {

        /* renamed from: p */
        final /* synthetic */ View f75329p;

        ViewOnLayoutChangeListenerC14640f(View view) {
            this.f75329p = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f75329p.removeOnLayoutChangeListener(this);
            MinimizableVideoPlayerView.this.m81877RM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$g */
    /* loaded from: classes6.dex */
    class C14641g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f75331a;

        C14641g(C23669z c23669z) {
            this.f75331a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MinimizableVideoPlayerView.this.getContext()).m128305K(this.f75331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$h */
    /* loaded from: classes6.dex */
    public class C14642h extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f75333p;

        C14642h(boolean z11) {
            this.f75333p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ActionBar actionBar = MinimizableVideoPlayerView.this.f88760a0;
            if (actionBar != null) {
                if (!this.f75333p) {
                    actionBar.setVisibility(8);
                }
                MinimizableVideoPlayerView.this.f88760a0.setTranslationY(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$i */
    /* loaded from: classes6.dex */
    public class C14643i implements AbstractC19037k.f {

        /* renamed from: a */
        final /* synthetic */ int f75335a;

        /* renamed from: b */
        final /* synthetic */ boolean f75336b;

        C14643i(int i11, boolean z11) {
            this.f75335a = i11;
            this.f75336b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81919d(boolean z11, int i11, AbstractC19037k.e eVar, int i12, boolean z12) {
            try {
                if (z11) {
                    MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
                    if (!minimizableVideoPlayerView.f75298d1 && !minimizableVideoPlayerView.mo60294yp()) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 == 4) {
                                        C27373c c27373c = new C27373c();
                                        c27373c.m140250e0(eVar.f94898d);
                                        c27373c.m140237V(MinimizableVideoPlayerView.this.f75276P0.f88622e);
                                        AbstractC26897a.m138618d(c27373c);
                                        Bundle bundle = new Bundle();
                                        bundle.putSerializable("EXTRA_VIDEO_INFO", c27373c);
                                        bundle.putBoolean("bol_share_in_app", true);
                                        bundle.putInt("extra_source_log", MinimizableVideoPlayerView.this.mo79704AM());
                                        MinimizableVideoPlayerView.this.f72421L0.m92676n2().mo35579p().m93069k2(ShareView.class, bundle, 1, true);
                                    }
                                } else {
                                    AbstractC22470k.m116167s(MinimizableVideoPlayerView.this.f72421L0.m92676n2(), 0, 2, CameraInputParams.m39207q(eVar.f94898d));
                                }
                            } else {
                                C27373c c27373c2 = new C27373c();
                                c27373c2.m140250e0(eVar.f94898d);
                                c27373c2.m140237V(MinimizableVideoPlayerView.this.f75276P0.f88622e);
                                AbstractC26897a.m138618d(c27373c2);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("media_type", 2);
                                bundle2.putSerializable("extra_video_info", c27373c2);
                                bundle2.putBoolean("fromShareVia", true);
                                MinimizableVideoPlayerView.this.f72421L0.m92662fJ().m93069k2(UpdateStatusView.class, bundle2, 1, true);
                            }
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_already_save_in));
                        }
                    }
                } else if (i12 == 1) {
                    ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                }
                if (z12) {
                    if (MinimizableVideoPlayerView.this.f75288V0 != null) {
                        if (MinimizableVideoPlayerView.this.f75307m1) {
                            C2526d c2526d = C2526d.f10270a;
                            c2526d.m12729v(MinimizableVideoPlayerView.this.f75288V0.m95029V3(), -1, "csc_msg_video_full", MinimizableVideoPlayerView.this.f75313s1);
                            c2526d.m12691O(MinimizableVideoPlayerView.this.f75288V0, false, false, z11);
                            return;
                        }
                        C2526d.f10270a.m12689M(MinimizableVideoPlayerView.this.f75288V0, -1, "csc_msg_video_full", MinimizableVideoPlayerView.this.f75313s1);
                        return;
                    }
                    if (MinimizableVideoPlayerView.this.f75292X0 != null) {
                        C2526d.f10270a.m12688L(MinimizableVideoPlayerView.this.f75292X0, "chat_storedmedia", MinimizableVideoPlayerView.this.f75313s1);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: a */
        public void mo463a(AbstractC19037k.e eVar, long j11) {
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: b */
        public void mo464b(final boolean z11, final AbstractC19037k.e eVar, final int i11) {
            Handler handler = MinimizableVideoPlayerView.this.f75297c1;
            final int i12 = this.f75335a;
            final boolean z12 = this.f75336b;
            handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.wy
                @Override // java.lang.Runnable
                public final void run() {
                    MinimizableVideoPlayerView.C14643i.this.m81919d(z11, i12, eVar, i11, z12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$j */
    /* loaded from: classes6.dex */
    public class C14644j implements AbstractC19037k.f {

        /* renamed from: a */
        final /* synthetic */ AbstractC19037k.f f75338a;

        C14644j(AbstractC19037k.f fVar) {
            this.f75338a = fVar;
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: a */
        public void mo463a(AbstractC19037k.e eVar, long j11) {
        }

        @Override // p164fn.AbstractC19037k.f
        /* renamed from: b */
        public void mo464b(boolean z11, AbstractC19037k.e eVar, int i11) {
            MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
            minimizableVideoPlayerView.f75269L1 = false;
            minimizableVideoPlayerView.mo49315c4();
            AbstractC19037k.f fVar = this.f75338a;
            if (fVar != null) {
                fVar.mo464b(z11, eVar, i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$k */
    /* loaded from: classes6.dex */
    class C14645k extends VideoController.AbstractC17311d {
        C14645k() {
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: c */
        public void mo81920c(boolean z11) {
            MinimizableVideoPlayerView minimizableVideoPlayerView = MinimizableVideoPlayerView.this;
            if (minimizableVideoPlayerView.f75316v1) {
                return;
            }
            try {
                if (z11) {
                    if (minimizableVideoPlayerView.f75317w1 == 0) {
                        minimizableVideoPlayerView.m81906ZM(false, true, false, true);
                    }
                } else {
                    minimizableVideoPlayerView.m81906ZM(false, false, false, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
            super.mo61750d(zVideoView, j11, j12);
            C20043e c20043e = MinimizableVideoPlayerView.this.f75294Z0;
            if (c20043e != null) {
                AbstractC20049k.m104108a(zVideoView, c20043e.m104120f());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MinimizableVideoPlayerView$l */
    /* loaded from: classes6.dex */
    class C14646l {

        /* renamed from: a */
        public Animation f75341a;

        /* renamed from: b */
        public Animation f75342b;

        /* renamed from: c */
        public Animation f75343c;

        /* renamed from: d */
        public Animation f75344d;

        /* renamed from: e */
        public Animation f75345e;

        /* renamed from: f */
        public Animation f75346f;

        /* renamed from: g */
        public boolean f75347g;

        C14646l(Context context) {
            this.f75347g = false;
            try {
                C26087b c26087b = new C26087b();
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                this.f75341a = alphaAnimation;
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                this.f75341a.setDuration(300L);
                this.f75341a.setInterpolator(c26087b);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                this.f75342b = alphaAnimation2;
                alphaAnimation2.setInterpolator(new AccelerateInterpolator());
                this.f75342b.setDuration(800L);
                this.f75341a.setInterpolator(c26087b);
                this.f75343c = AnimationUtils.loadAnimation(context, AbstractC10919t.slide_in_from_top);
                this.f75344d = AnimationUtils.loadAnimation(context, AbstractC10919t.slide_out_to_top);
                this.f75343c.setDuration(300L);
                this.f75344d.setDuration(800L);
                this.f75343c.setInterpolator(c26087b);
                this.f75344d.setInterpolator(c26087b);
                this.f75345e = AnimationUtils.loadAnimation(context, AbstractC10919t.slide_in_from_bottom);
                this.f75346f = AnimationUtils.loadAnimation(context, AbstractC10919t.slide_out_to_bottom);
                this.f75345e.setDuration(300L);
                this.f75346f.setDuration(800L);
                this.f75345e.setInterpolator(c26087b);
                this.f75346f.setInterpolator(c26087b);
                if (this.f75341a != null && this.f75342b != null && this.f75343c != null && this.f75344d != null && this.f75345e != null && this.f75346f != null) {
                    this.f75347g = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                MinimizableVideoPlayerView.this.f75258A1 = false;
            }
        }
    }

    /* renamed from: CM */
    private C17391z m81867CM(String str) {
        try {
            return new C17391z(new JSONObject(str));
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public /* synthetic */ void m81868GM(C20338d c20338d) {
        C20568e m106048f = c20338d.m106048f();
        if (m106048f != null && m92672lJ()) {
            m81878UM(m106048f.m107023g());
        }
        m81910wM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public /* synthetic */ void m81869HM() {
        this.f75295a1.setVisibility(8);
        ZVideoView zVideoView = this.f75274O0;
        C17391z c17391z = this.f75276P0;
        AbstractC20049k.m104116j(zVideoView, c17391z, this.f75278Q0, c17391z.f88618a);
        this.f75306l1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public /* synthetic */ void m81870IM() {
        try {
            this.f75270M0.m89623H();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public /* synthetic */ void m81871JM() {
        DraggableVideoView draggableVideoView = this.f75270M0;
        if (draggableVideoView != null) {
            draggableVideoView.getDragView().setY(this.f75270M0.f83696E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public /* synthetic */ void m81872KM() {
        try {
            if (this.f72421L0.m92656bJ() != null) {
                this.f72421L0.m92656bJ().requestLayout();
            }
            if (this.f75270M0 != null && !mo66383c8()) {
                this.f75270M0.m89623H();
                this.f75270M0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ty
                    @Override // java.lang.Runnable
                    public final void run() {
                        MinimizableVideoPlayerView.this.m81871JM();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m81873LM() {
        try {
            C20556f c20556f = new C20556f(this.f75280R0.m140220E());
            if (c20556f.m106830b()) {
                AbstractC23152n3.m119036c0(getContext(), c20556f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MinimizableVideoPlayerView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m81874MM(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.sy
            @Override // java.lang.Runnable
            public final void run() {
                MinimizableVideoPlayerView.this.m81873LM();
            }
        });
        m81910wM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m81875NM(InterfaceC17463d interfaceC17463d, int i11) {
        m81910wM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static /* synthetic */ void m81876OM(View view, C1421e c1421e) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public void m81877RM() {
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                AbstractC32226c.m155413l(this, actionBar);
                this.f88760a0.requestLayout();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: UM */
    private void m81878UM(boolean z11) {
        int i11;
        String m118743r0;
        int i12;
        if (this.f75309o1) {
            if (z11) {
                i12 = AbstractC8020f0.str_gif_recalled;
            } else {
                i12 = AbstractC8020f0.str_gif_deleted;
            }
            m118743r0 = AbstractC23136l9.m118743r0(i12);
        } else {
            if (z11) {
                i11 = AbstractC8020f0.str_video_recalled;
            } else {
                i11 = AbstractC8020f0.str_video_deleted;
            }
            m118743r0 = AbstractC23136l9.m118743r0(i11);
        }
        ToastUtils.showMess(m118743r0);
    }

    /* renamed from: rM */
    private void m81893rM() {
        C0815e1.m2075D().m2100V(new C23648e(35, this.f75314t1, 1, "open_view_full_video", this.f75313s1), false);
    }

    /* renamed from: sM */
    private void m81894sM(Configuration configuration) {
        View view;
        int i11 = configuration.orientation;
        if (i11 != this.f75259B1 && (view = this.f75260C1) != null) {
            this.f75259B1 = i11;
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC14640f(view));
        }
    }

    /* renamed from: tM */
    private boolean m81895tM() {
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            if (zVideoView.m92405L() && !this.f75318x1) {
                return false;
            }
            return true;
        }
        return this.f75318x1;
    }

    /* renamed from: uM */
    private void m81896uM(boolean z11, AbstractC19037k.f fVar) {
        AbstractC19037k.e m100141d;
        if (this.f75269L1) {
            ToastUtils.m89266n(AbstractC8020f0.video_player_download_not_downloaded_message, new Object[0]);
            return;
        }
        try {
            this.f75269L1 = true;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_loading));
            C14644j c14644j = new C14644j(fVar);
            if (this.f75307m1) {
                m100141d = AbstractC19037k.d.m100138h(this.f75276P0, z11, this.f75310p1, c14644j);
            } else {
                m100141d = AbstractC19037k.e.m100141d(this.f75276P0, z11, c14644j);
            }
            AbstractC19037k.m100125k(m100141d, this.f75276P0.m92538c(), new SensitiveData("gallery_save_video_detail", "video_download"));
        } catch (Exception unused) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            this.f75269L1 = false;
        }
    }

    /* renamed from: AM */
    protected int mo79704AM() {
        return 9;
    }

    /* renamed from: BM */
    C13306b.c m81897BM() {
        return new C14636b();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        this.f75289V1 = new C14646l(this.f72421L0.m92648SI());
        boolean z12 = true;
        mo79715YM(true);
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            this.f75302h1 = m92642L3().getBoolean("EXTRA_BOOLEAN_HANDLE_SCREEN_ORIENTATION", true);
            if (m92642L3().containsKey("EXTRA_ADD_JUMP_TO_ORIGINAL_MESSAGE_OPTION") && m92642L3().getBoolean("EXTRA_ADD_JUMP_TO_ORIGINAL_MESSAGE_OPTION", false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f75311q1 = z11;
            if (!m92642L3().containsKey("EXTRA_FROM_DETAIL_COLLECTION") || !m92642L3().getBoolean("EXTRA_FROM_DETAIL_COLLECTION", false)) {
                z12 = false;
            }
            this.f75312r1 = z12;
            this.f75313s1 = m92642L3().getString("STR_LOG_CHAT_TYPE", "0");
            this.f75293Y0 = m92642L3().getInt("EXTRA_MEDIA_STORE_ZALO_TRACKING_SOURCE", this.f75293Y0);
            this.f75314t1 = m92642L3().getString("STR_SOURCE_START_VIEW", "");
        }
    }

    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
    /* renamed from: D */
    public void mo44076D(int i11) {
        try {
            if (i11 != -1) {
                if (i11 == 2) {
                    C27373c c27373c = this.f75280R0;
                    if (c27373c != null) {
                        c27373c.m140226K(this.f75274O0.getDuration());
                    }
                    this.f75306l1 = false;
                    return;
                }
                return;
            }
            if (this.f75280R0 != null && this.f75305k1 && this.f75306l1) {
                this.f75306l1 = false;
                new C8009j.a(getContext()).m43162k(m92652XI(AbstractC8020f0.str_open_external_video_player_dialog)).m43170s(m92652XI(AbstractC8020f0.browser_menu_link_open), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.oy
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        MinimizableVideoPlayerView.this.m81874MM(interfaceC17463d, i12);
                    }
                }).m43165n(m92652XI(AbstractC8020f0.str_exit), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.py
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        MinimizableVideoPlayerView.this.m81875NM(interfaceC17463d, i12);
                    }
                }).m43152a().mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0040, B:8:0x0046, B:11:0x0050, B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x0081, B:18:0x0084, B:20:0x00a8, B:21:0x00ae, B:23:0x00b3, B:25:0x00c2, B:26:0x00ce, B:28:0x00da, B:29:0x00de, B:31:0x010d, B:34:0x0115, B:35:0x0113, B:36:0x011b, B:42:0x0126, B:43:0x0132, B:45:0x0154, B:46:0x0157, B:48:0x015b, B:51:0x0163, B:53:0x0167, B:56:0x0129, B:57:0x012e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0040, B:8:0x0046, B:11:0x0050, B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x0081, B:18:0x0084, B:20:0x00a8, B:21:0x00ae, B:23:0x00b3, B:25:0x00c2, B:26:0x00ce, B:28:0x00da, B:29:0x00de, B:31:0x010d, B:34:0x0115, B:35:0x0113, B:36:0x011b, B:42:0x0126, B:43:0x0132, B:45:0x0154, B:46:0x0157, B:48:0x015b, B:51:0x0163, B:53:0x0167, B:56:0x0129, B:57:0x012e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0004, B:5:0x000c, B:7:0x0040, B:8:0x0046, B:11:0x0050, B:12:0x0058, B:14:0x0062, B:15:0x0068, B:17:0x0081, B:18:0x0084, B:20:0x00a8, B:21:0x00ae, B:23:0x00b3, B:25:0x00c2, B:26:0x00ce, B:28:0x00da, B:29:0x00de, B:31:0x010d, B:34:0x0115, B:35:0x0113, B:36:0x011b, B:42:0x0126, B:43:0x0132, B:45:0x0154, B:46:0x0157, B:48:0x015b, B:51:0x0163, B:53:0x0167, B:56:0x0129, B:57:0x012e), top: B:2:0x0004 }] */
    /* renamed from: DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo79705DM() {
        String str;
        C17945a0 c17945a0;
        try {
            Bundle m92642L3 = m92642L3();
            this.f75267J1 = m92642L3;
            if (m92642L3 != null) {
                this.f75261D1 = m92642L3.getBoolean("EXTRA_BOOLEAN_HIDE_ACTION_BAR", false);
                this.f75262E1 = this.f75267J1.getBoolean("EXTRA_BOOLEAN_HIDE_OPTION_MENU", false);
                this.f75263F1 = this.f75267J1.getBoolean("EXTRA_BOOLEAN_HIDE_OPEN_SHARED_MEDIA", false);
                this.f75271M1 = this.f75267J1.getBoolean("EXTRA_PLAY_LOOP_VIDEO", false);
                boolean z11 = this.f75267J1.getBoolean("EXTRA_GIF_MODE", false);
                this.f75309o1 = z11;
                if (z11) {
                    this.f75262E1 = true;
                }
                String str2 = "";
                if (!this.f75267J1.containsKey("VIDEO_TITLE_BAR")) {
                    str = "";
                } else {
                    str = this.f75267J1.getString("VIDEO_TITLE_BAR");
                }
                this.f75264G1 = str;
                if (this.f75267J1.containsKey("VIDEO_SUB_TITLE_BAR")) {
                    str2 = this.f75267J1.getString("VIDEO_SUB_TITLE_BAR");
                }
                this.f75265H1 = str2;
                this.f75305k1 = this.f75267J1.getBoolean("EXTRA_OPEN_EXTERNAL_WHEN_STARTING_FAILED", false);
                int i11 = this.f75267J1.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, -1);
                this.f75278Q0 = i11;
                if (i11 == -1) {
                    m81910wM(true);
                }
                this.f75286U0 = this.f75267J1.getString("extra_chat_conversation_id");
                this.f75290W0 = (MessageId) this.f75267J1.getParcelable("extra_chat_content_message_id");
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(this.f75290W0);
                this.f75288V0 = m2635r;
                if (m2635r != null) {
                    this.f75309o1 = m2635r.m95288w8();
                }
                if (this.f75278Q0 == 6) {
                    String string = this.f75267J1.getString("EXTRA_STR_MEDIA_STORE_ITEM_JSON", null);
                    if (!TextUtils.isEmpty(string)) {
                        this.f75292X0 = new MediaStoreItem(new JSONObject(string));
                    }
                }
                Serializable serializable = this.f75267J1.getSerializable("EXTRA_VIDEO_INFO");
                if (serializable instanceof C27373c) {
                    this.f75280R0 = (C27373c) serializable;
                }
                this.f75282S0 = this.f75267J1.getInt("margin_right", AbstractC23136l9.m118742r(2.0f));
                this.f75284T0 = this.f75267J1.getInt("margin_bottom", AbstractC23136l9.m118742r(2.0f));
                C17391z m81867CM = m81867CM(this.f75267J1.getString("video_str"));
                this.f75276P0 = m81867CM;
                if (m81867CM != null) {
                    int i12 = this.f75278Q0;
                    if (i12 == 1 || i12 == 2) {
                        m81867CM.f88633p = 1;
                    }
                    m81867CM.f88629l = AbstractC20049k.m104112e(i12);
                }
                int i13 = this.f75278Q0;
                if (i13 != 0) {
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 7) {
                            this.f75303i1 = -1;
                        }
                    } else {
                        this.f75303i1 = 30;
                    }
                    this.f75307m1 = this.f75267J1.getBoolean("EXTRA_BOOLEAN_IS_MSG_FILE", false);
                    this.f75310p1 = this.f75267J1.getString("EXTRA_STR_FILE_NAME_DOWNLOAD");
                    this.f75308n1 = this.f75267J1.getBoolean("EXTRA_OPEN_FROM_MEMORY");
                    if (this.f75278Q0 == 6) {
                        m81893rM();
                    }
                    c17945a0 = this.f75288V0;
                    if (c17945a0 == null) {
                        C2535j.f10308a.m12775s("csc", c17945a0, false);
                        return;
                    }
                    MediaStoreItem mediaStoreItem = this.f75292X0;
                    if (mediaStoreItem != null) {
                        C2535j.f10308a.m12774r("chat_storedmedia", mediaStoreItem, false);
                        return;
                    }
                    return;
                }
                this.f75303i1 = 28;
                this.f75307m1 = this.f75267J1.getBoolean("EXTRA_BOOLEAN_IS_MSG_FILE", false);
                this.f75310p1 = this.f75267J1.getString("EXTRA_STR_FILE_NAME_DOWNLOAD");
                this.f75308n1 = this.f75267J1.getBoolean("EXTRA_OPEN_FROM_MEMORY");
                if (this.f75278Q0 == 6) {
                }
                c17945a0 = this.f75288V0;
                if (c17945a0 == null) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: EM */
    public void m81898EM() {
        DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) this.f75260C1.findViewById(AbstractC6918a0.feed_video_drag_to_close_layout);
        this.f75315u1 = dragToCloseLayout;
        dragToCloseLayout.setDirection(2);
        this.f75315u1.setOnDragToCloseListener(new C14635a());
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: F1 */
    public void mo81899F1(boolean z11, String str) {
        if (!m92681pJ() && !m92677nJ() && !mo66383c8()) {
            if (z11 && !TextUtils.isEmpty(str)) {
                if (m92672lJ() && AbstractC23041d2.m118194A(str)) {
                    AbstractC23152n3.m119011N0(this.f72421L0.m92676n2(), str, true, false, this.f75303i1);
                    return;
                }
                return;
            }
            if (m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.str_capture_video_snapshot_failed, new Object[0]);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        boolean z11;
        try {
            if (m92674mJ() && !m92677nJ() && !this.f75261D1 && !this.f75262E1 && this.f75317w1 != 1) {
                actionBarMenu.m92750r();
                C17391z c17391z = this.f75276P0;
                if (c17391z != null) {
                    boolean z12 = false;
                    if (this.f75292X0 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c17391z.m92537b() && !this.f75309o1) {
                        z12 = true;
                    }
                    C17945a0 c17945a0 = this.f75288V0;
                    if (c17945a0 != null) {
                        z11 = c17945a0.m94954N0();
                    }
                    if (z11 || z12) {
                        if (z12 && !this.f75308n1) {
                            this.f75279Q1 = actionBarMenu.m92738e(AbstractC6918a0.video_player_action_bar_menu_download, AbstractC16803z.icn_header_download_white);
                        }
                        ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.video_player_action_bar_menu_more, AbstractC19182e.abc_ic_menu_overflow_material);
                        this.f75277P1 = m92738e;
                        if (z11) {
                            m92738e.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.video_player_menu_video_forward, AbstractC8020f0.forward_to_friend));
                        }
                        if (z12) {
                            this.f75277P1.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.video_player_menu_video_download, AbstractC8020f0.str_menu_video_download));
                        }
                    }
                    if (this.f75311q1) {
                        this.f75277P1.m92774j(AbstractC23136l9.m118724l(m92689tK(), AbstractC6918a0.menu_view_original_msg_csc, AbstractC8020f0.str_view_original_msg));
                    }
                }
                this.f75281R1 = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: FM */
    public void m81900FM() {
        this.f75296b1 = new C23528a(this.f72421L0.m92648SI());
        mo79705DM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\nonCreateView, type = ");
        sb2.append(this.f75278Q0);
        this.f75260C1 = layoutInflater.inflate(AbstractC7409c0.minimizable_video_player_view, viewGroup, false);
        m81900FM();
        m92637BK(true);
        this.f75258A1 = false;
        this.f75260C1.setBackgroundColor(-16777216);
        this.f75260C1.findViewById(AbstractC6918a0.draggable_view).setBackgroundColor(0);
        m81898EM();
        return this.f75260C1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            super.mo39024IJ();
            mo81907bN();
            m81904WM(1);
            ZVideoView zVideoView = this.f75274O0;
            if (zVideoView != null) {
                zVideoView.m92412f0(true);
            }
            MaskableImageView maskableImageView = this.f75295a1;
            if (maskableImageView != null) {
                maskableImageView.m75793p();
            }
            C20043e c20043e = this.f75294Z0;
            if (c20043e != null) {
                c20043e.m104034p();
            }
            C23528a c23528a = this.f75296b1;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f75296b1 = null;
            }
            C3977j c3977j = this.f75301g1;
            if (c3977j != null) {
                c3977j.setImageInfo(null);
            }
            AbstractC9010h.m48152e();
            mo79715YM(false);
            C13306b c13306b = this.f75291W1;
            if (c13306b != null) {
                c13306b.m74702j("tip.any");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f75260C1 = null;
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        try {
            Bundle bundle = this.f75267J1;
            boolean z11 = false;
            if (bundle != null && bundle.getBoolean("EXTRA_IGNORE_FLOW_ANIM_CALLBACK")) {
                z11 = true;
            }
            InterfaceC20278h interfaceC20278h = this.f75285T1;
            if (interfaceC20278h != null && !z11) {
                interfaceC20278h.mo56687X0(!this.f75283S1);
            }
            C23744a.m124114c().m124117e(this, 52);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        if (this.f75260C1 != null) {
            mo79705DM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: PM */
    public void m81901PM() {
        C17391z c17391z = this.f75276P0;
        if (c17391z != null && c17391z.f88622e != null) {
            if (this.f75301g1 == null) {
                this.f75301g1 = new C3977j(getContext());
            }
            this.f75274O0.setLoadingViewImageInfo(null);
            ((C23528a) this.f75296b1.m123612r(this.f75301g1)).m123579C(this.f75276P0.f88622e, C23278z2.m120068F(), new C14638d());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.video_player_menu_video_forward) {
            m81912yM();
            return true;
        }
        if (i11 != AbstractC6918a0.video_player_action_bar_menu_download && i11 != AbstractC6918a0.video_player_menu_video_download) {
            if (i11 == 16908332) {
                m81910wM(false);
                return true;
            }
            if (i11 == AbstractC6918a0.menu_view_original_msg_csc) {
                m81902SM();
                return true;
            }
            return super.mo37491QJ(i11);
        }
        m81909vM(1);
        return true;
    }

    /* renamed from: QM */
    void mo79709QM() {
        this.f75283S1 = true;
        m81910wM(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        C20043e c20043e;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            sb2.append("\nonPause, type = ");
            sb2.append(this.f75278Q0);
            super.mo13886RJ();
            if (this.f75304j1 && !this.f72421L0.m92676n2().mo35576n3()) {
                AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), false);
            }
            C23744a.m124114c().m124117e(this, 9);
            m81905XM();
            if (!this.f75298d1 && (c20043e = this.f75294Z0) != null) {
                c20043e.m104036r();
            }
            C13306b c13306b = this.f75291W1;
            if (c13306b != null) {
                c13306b.m74709u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putString("mTitleActionbarBackup", this.f75264G1);
        bundle.putString("mSubtitleActionbarBackup", this.f75265H1);
    }

    /* renamed from: SM */
    void m81902SM() {
        MessageId m41035b;
        try {
            if (this.f75292X0 != null) {
                C27870vb c27870vb = new C27870vb(this.f75286U0);
                if (this.f75292X0.m40599m() != null) {
                    m41035b = this.f75292X0.m40599m().m95029V3();
                } else {
                    m41035b = MessageId.m41035b(0L, 0L, "", "");
                }
                Bundle m140776b = c27870vb.m140781h(m41035b).m140776b();
                if (this.f72421L0.m92676n2() != null) {
                    this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
                finish();
                if (this.f75312r1) {
                    AbstractC23647d.m123897g("140822003");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        mo79712TM();
    }

    /* renamed from: TM */
    void mo79712TM() {
        ActionBar m92646QI;
        if (this.f72421L0.m92648SI() != null && m92674mJ() && !this.f75261D1 && (m92646QI = this.f72421L0.m92646QI()) != null) {
            m92646QI.setBackground(new ColorDrawable(AbstractC1401h.m7080d(m92651WI(), AbstractC16801x.black_60, null)));
            m92646QI.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            if (TextUtils.isEmpty(this.f75264G1)) {
                this.f75264G1 = AbstractC23136l9.m118743r0(AbstractC8020f0.video_player_activity_title);
            }
            this.f88760a0.setTitle(this.f75264G1);
            if (this.f88760a0.getTitleTextView() != null) {
                this.f88760a0.getTitleTextView().setTextColor(-1);
            }
            if (!TextUtils.isEmpty(this.f75265H1)) {
                this.f88760a0.setSubtitle(this.f75265H1);
            } else {
                this.f88760a0.setSubtitle(null);
            }
            if (this.f88760a0.getSubtitleTextView() != null) {
                this.f88760a0.getSubtitleTextView().setTextColor(AbstractC1401h.m7080d(m92651WI(), AbstractC16801x.white_70, null));
            }
            ZVideoView zVideoView = this.f75274O0;
            if (zVideoView != null && zVideoView.m92401H() && this.f75300f1) {
                this.f88760a0.setVisibility(4);
            }
            AbstractC32226c.m155413l(this, this.f88760a0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\nonStart, type = ");
        sb2.append(this.f75278Q0);
        super.mo37584UJ();
        OrientationEventListener orientationEventListener = this.f75299e1;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        if (this.f72421L0.m92676n2() != null && (this.f72421L0.m92676n2().mo35585v() instanceof InsetsLayout)) {
            ((InsetsLayout) this.f72421L0.m92676n2().mo35585v()).setAllowApplyInsets(false);
        }
        C13306b c13306b = this.f75291W1;
        if (c13306b != null) {
            c13306b.m74697c(m81897BM());
        }
        if (this.f75278Q0 == 6 && !TextUtils.isEmpty(this.f75286U0)) {
            C3509j0.m17726l(this.f75286U0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\nonStop, type = ");
        sb2.append(this.f75278Q0);
        super.mo37712VJ();
        try {
            OrientationEventListener orientationEventListener = this.f75299e1;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            C20043e c20043e = this.f75294Z0;
            if (c20043e != null) {
                c20043e.m104038t();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f72421L0.m92676n2() != null && (this.f72421L0.m92676n2().mo35585v() instanceof InsetsLayout)) {
            ((InsetsLayout) this.f72421L0.m92676n2().mo35585v()).setAllowApplyInsets(true);
        }
        if (this.f75291W1 != null) {
            if (mo60294yp()) {
                this.f75291W1.m74702j("tip.any");
            }
            this.f75291W1.m74701i();
        }
        if (this.f75278Q0 == 6 && !TextUtils.isEmpty(this.f75286U0)) {
            C3509j0.m17730p(this.f75286U0);
        }
    }

    /* renamed from: VM */
    void m81903VM() {
        try {
            if (this.f75290W0 != null) {
                ArrayList arrayList = AbstractC23304d.f113413n;
                if (arrayList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        C20568e c20568e = (C20568e) arrayList2.get(i11);
                        if (c20568e != null && c20568e.m107018b().equals(this.f75290W0)) {
                            if (m92672lJ()) {
                                m81878UM(c20568e.m107023g());
                            }
                            m81910wM(true);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: WM */
    public void m81904WM(int i11) {
        if (!this.f75302h1) {
            return;
        }
        this.f72421L0.m92676n2().setRequestedOrientation(i11);
    }

    /* renamed from: XC */
    public void mo79714XC(long j11) {
    }

    /* renamed from: XM */
    void m81905XM() {
        mo81907bN();
        m81904WM(1);
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            zVideoView.setFullScreen(false);
        }
        DragToCloseLayout dragToCloseLayout = this.f75315u1;
        if (dragToCloseLayout != null) {
            dragToCloseLayout.setDisableTouch(false);
        }
        this.f72421L0.m92646QI().setVisibility(0);
        this.f75270M0.m89623H();
        ZMediaPlayerSettings.isFullScreen = false;
    }

    /* renamed from: YM */
    protected void mo79715YM(boolean z11) {
        AbstractC23304d.f113276F2 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(final View view, Bundle bundle) {
        boolean z11;
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(-16777216);
        m89412p.m89426U(Boolean.FALSE);
        m89412p.m89430n(new InterfaceC27367c() { // from class: com.zing.zalo.ui.zviews.ny
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                MinimizableVideoPlayerView.m81876OM(view, c1421e);
            }
        });
        this.f75295a1 = (MaskableImageView) view.findViewById(AbstractC6918a0.imv_anim_mask);
        DraggableVideoView draggableVideoView = (DraggableVideoView) view.findViewById(AbstractC6918a0.draggable_view);
        this.f75270M0 = draggableVideoView;
        draggableVideoView.f83730x = this.f75282S0;
        draggableVideoView.f83729w = this.f75284T0;
        DraggableView.f83691h0 = AbstractC23136l9.m118742r(5.0f);
        this.f75272N0 = this.f75270M0.getDragView();
        this.f75274O0 = this.f75270M0.getVideoView();
        m81901PM();
        boolean z12 = false;
        this.f75270M0.setAllowDrag(false);
        this.f75274O0.setOnPlayerStateChangedListener(this);
        this.f75274O0.getVideoController().m92307i(this.f75287U1);
        VideoController videoController = this.f75274O0.getVideoController();
        if (!this.f72421L0.m92676n2().mo35586v2() && !this.f72421L0.m92676n2().mo35576n3()) {
            z11 = true;
        } else {
            z11 = false;
        }
        videoController.setEnableFullScreen(z11);
        this.f75274O0.setOnCacheListener(this);
        this.f75274O0.setOnFullScreenChangedListener(this);
        this.f75274O0.setAudioFocusControl(C28075g8.m141538e());
        this.f75274O0.setLooping(this.f75271M1);
        if (this.f75309o1) {
            this.f75274O0.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(6));
            this.f75274O0.getVideoController().setComponentEnabled(false);
        }
        if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
            this.f75274O0.setExcludeSystemDecorationSize(false);
        }
        VideoController videoController2 = this.f75274O0.getVideoController();
        videoController2.f88210s.m92523p(this);
        int i11 = this.f75278Q0;
        if (i11 != 4 && i11 != 5 && AbstractC23309i.m121587X()) {
            z12 = true;
        }
        videoController2.setEnableSnapshot(z12);
        videoController2.setSnapShotFolder(AbstractC20130d.m104905y());
    }

    /* renamed from: ZM */
    void m81906ZM(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z11) {
            boolean z15 = this.f75266I1;
            this.f75266I1 = !z15;
            mo79716aN(z15, z13, z14);
        } else {
            this.f75266I1 = !z12;
            mo79716aN(z12, z13, z14);
        }
        C13306b c13306b = this.f75291W1;
        if (c13306b != null) {
            if (z12) {
                c13306b.m74714z("tip.video.snapshot", 200);
                return;
            }
            ShowcaseView m74705n = c13306b.m74705n("tip.video.snapshot");
            if (m74705n != null && m74705n.isShown()) {
                m74705n.m74639u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[Catch: Exception -> 0x001a, TRY_LEAVE, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:6:0x0007, B:8:0x0015, B:12:0x007d, B:17:0x001e, B:19:0x0033, B:21:0x0039, B:24:0x0041, B:26:0x0045, B:28:0x0049, B:30:0x0051, B:32:0x0058, B:34:0x0065, B:35:0x0074), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: aN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo79716aN(boolean z11, boolean z12, boolean z13) {
        try {
            if (!m92687sJ()) {
                return;
            }
            ActionBar m92646QI = this.f72421L0.m92646QI();
            if (this.f75274O0.m92401H()) {
                if (!this.f75300f1) {
                }
                if (!z12) {
                    this.f75274O0.m92418l0(z11);
                    return;
                }
                return;
            }
            if (m92646QI != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("actionBar.isShowing():");
                sb2.append(m92646QI.isShown());
                Animator animator = this.f75275O1;
                if (animator != null && animator.isRunning()) {
                    this.f75275O1.end();
                }
                if (z11) {
                    if (!this.f75261D1 && !this.f75298d1 && !this.f88760a0.isShown()) {
                        this.f88760a0.setVisibility(0);
                        if (z13) {
                            Animator m81913zM = m81913zM(true);
                            this.f75275O1 = m81913zM;
                            m81913zM.start();
                        }
                    }
                } else if (z13) {
                    this.f88760a0.setVisibility(0);
                    Animator m81913zM2 = m81913zM(false);
                    this.f75275O1 = m81913zM2;
                    m81913zM2.start();
                } else {
                    this.f88760a0.setVisibility(8);
                }
            }
            if (!z12) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bN */
    public void mo81907bN() {
        try {
            Window window = m92692wK().getWindow();
            if (window != null) {
                AbstractC23136l9.m118686X0(window, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView.InterfaceC17423h
    /* renamed from: c8 */
    public boolean mo66383c8() {
        return this.f75317w1 == 1;
    }

    @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
    /* renamed from: cH */
    public void mo39665cH(C17391z c17391z, CacheException cacheException) {
        this.f75318x1 = false;
    }

    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17344p
    /* renamed from: cg */
    public void mo81908cg(boolean z11) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onFullScreenChanged: fullscreen=");
            sb2.append(z11);
            sb2.append("; userAction=true");
            this.f75319y1 = true;
            if (z11 && this.f75300f1) {
                this.f72421L0.m92646QI().setVisibility(8);
            } else {
                this.f72421L0.m92646QI().setVisibility(0);
            }
            this.f75270M0.m89623H();
            ZMediaPlayerSettings.isFullScreen = z11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String getTrackingKey() {
        return "MinimizableVideoPlayerView";
    }

    /* renamed from: k3 */
    public boolean mo79717k3(View view) {
        if (view != null) {
            if (view.getId() == C17395R.id.video_btn_snapshot) {
                if (!AbstractC23238v2.m119726k()) {
                    ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
                    return true;
                }
                if (this.f75274O0.m92402I()) {
                    if (this.f75274O0.isPlaying()) {
                        AbstractC23647d.m123897g("900144040");
                    } else {
                        AbstractC23647d.m123897g("900144041");
                    }
                }
            } else if (view.getId() == C17395R.id.video_btn_close) {
                m81910wM(false);
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z11 = false;
        try {
            this.f75319y1 = false;
            if (this.f75258A1) {
                int i11 = configuration.orientation;
                if (i11 == 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("screen width = ");
                    sb2.append(AbstractC23136l9.m118731n0(this.f72421L0.m92648SI()));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("screen height = ");
                    sb3.append(AbstractC23136l9.m118719j0(this.f72421L0.m92648SI()));
                    if (!this.f75274O0.m92401H()) {
                        this.f75274O0.m92433v();
                    }
                } else if (i11 == 1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("screen width = ");
                    sb4.append(AbstractC23136l9.m118731n0(this.f72421L0.m92648SI()));
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("screen height = ");
                    sb5.append(AbstractC23136l9.m118719j0(this.f72421L0.m92648SI()));
                    if (this.f75274O0.m92401H()) {
                        this.f75274O0.m92433v();
                    }
                }
                this.f75272N0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qy
                    @Override // java.lang.Runnable
                    public final void run() {
                        MinimizableVideoPlayerView.this.m81870IM();
                    }
                }, 200L);
            }
            DragToCloseLayout dragToCloseLayout = this.f75315u1;
            if (dragToCloseLayout != null) {
                if (configuration.orientation != 1) {
                    z11 = true;
                }
                dragToCloseLayout.setDisableTouch(z11);
            }
            m81894sM(configuration);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
        long j11;
        String str;
        MessageId messageId;
        String str2;
        String mo95039W2;
        MessageId m95029V3;
        String m94862C4;
        try {
            boolean m92407N = this.f75274O0.m92407N(iMediaPlayer, i11, i12);
            boolean m92408O = this.f75274O0.m92408O(iMediaPlayer, i11, i12);
            if (m92407N || m92408O) {
                C17945a0 c17945a0 = this.f75288V0;
                if (c17945a0 != null) {
                    mo95039W2 = c17945a0.mo95039W2();
                    m95029V3 = this.f75288V0.m95029V3();
                    m94862C4 = this.f75288V0.m94862C4();
                    j11 = this.f75288V0.m94974P4();
                    C2535j c2535j = C2535j.f10308a;
                    c2535j.m12772o(m95029V3, m92408O ? 1 : 0);
                    c2535j.m12775s("csc", this.f75288V0, m92407N);
                } else {
                    MediaStoreItem mediaStoreItem = this.f75292X0;
                    if (mediaStoreItem != null) {
                        mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
                        m95029V3 = this.f75292X0.m40599m().m95029V3();
                        m94862C4 = this.f75292X0.m40599m().m94862C4();
                        j11 = this.f75292X0.m40599m().m95313z4();
                        C2535j c2535j2 = C2535j.f10308a;
                        c2535j2.m12772o(m95029V3, m92408O ? 1 : 0);
                        c2535j2.m12774r("chat_storedmedia", this.f75292X0, m92407N);
                    } else {
                        j11 = 0;
                        str = null;
                        messageId = null;
                        str2 = null;
                        if (m92407N && str != null && str2 != null && !AbstractC19646n0.m103038v1(1, j11)) {
                            AbstractC23306f.m120618S1().m101508a(new C29604t.a(CoreUtility.f89233i, str, messageId, str2, "csc"));
                        }
                    }
                }
                str = mo95039W2;
                messageId = m95029V3;
                str2 = m94862C4;
                if (m92407N) {
                    AbstractC23306f.m120618S1().m101508a(new C29604t.a(CoreUtility.f89233i, str, messageId, str2, "csc"));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        C20043e c20043e;
        boolean z11;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            sb2.append("\nonKeyUp, type = ");
            sb2.append(this.f75278Q0);
            c20043e = this.f75294Z0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (c20043e != null && c20043e.m104035q(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            C23669z m92432u0 = this.f75274O0.m92432u0(1);
            if (m92432u0 != null) {
                C0809c1.m2050b(new C14641g(m92432u0));
            }
            m81904WM(1);
            if (this.f75317w1 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m81910wM(z11);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        int i12;
        if (i11 == 109) {
            if (AbstractC23034c6.m118121G() && (i12 = this.f75273N1) != 0) {
                m81909vM(i12);
            }
            this.f75273N1 = 0;
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append("\nonResume, type = ");
        sb2.append(this.f75278Q0);
        super.onResume();
        if (!this.f72421L0.m92676n2().mo35576n3()) {
            AbstractC23136l9.m118686X0(this.f72421L0.m92676n2().getWindow(), true);
        }
        C23744a.m124114c().m124115b(this, 9);
        this.f75319y1 = false;
        C20043e c20043e = this.f75294Z0;
        if (c20043e != null) {
            c20043e.m104037s();
        }
        if (this.f75274O0 != null) {
            this.f72421L0.m92656bJ().post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ly
                @Override // java.lang.Runnable
                public final void run() {
                    MinimizableVideoPlayerView.this.m81872KM();
                }
            });
            m81903VM();
        }
        C13306b c13306b = this.f75291W1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        m81894sM(m92651WI().getConfiguration());
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
    public void onVideoCompletion(IMediaPlayer iMediaPlayer) {
        try {
            if (this.f75278Q0 == 1) {
                this.f75274O0.getVideoController().m92303b0();
                AbstractC20049k.m104118l(this.f75276P0.f88618a, this.f75278Q0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
    /* renamed from: qH */
    public void mo39666qH(C17391z c17391z) {
    }

    @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
    /* renamed from: tE */
    public void mo39667tE(C17391z c17391z) {
        this.f75318x1 = true;
        if (this.f75268K1) {
            this.f75268K1 = false;
            m81909vM(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vM */
    public void m81909vM(int i11) {
        if (!AbstractC23034c6.m118118E() && m92676n2() != null) {
            this.f75273N1 = i11;
            AbstractC23034c6.m118186w0(m92676n2(), AbstractC23034c6.f112029f, 109);
            return;
        }
        boolean z11 = false;
        if (!m81895tM()) {
            ToastUtils.m89266n(AbstractC8020f0.video_player_share_not_downloaded_message, new Object[0]);
            if (i11 == 1) {
                this.f75268K1 = true;
                return;
            }
            return;
        }
        if (!this.f75298d1 && !mo60294yp()) {
            if (i11 == 1) {
                z11 = true;
            }
            m81896uM(z11, new C14643i(i11, z11));
            if (z11 && this.f75278Q0 == 6 && !TextUtils.isEmpty(this.f75286U0)) {
                C3509j0.m17719e(this.f75286U0, this.f75293Y0, EnumC2382z.f9945r, 1);
            }
        }
    }

    /* renamed from: wM */
    public void m81910wM(boolean z11) {
        try {
            mo79715YM(false);
            this.f75283S1 = z11;
            ZVideoView zVideoView = this.f75274O0;
            if (zVideoView != null) {
                zVideoView.setForceHideController(true);
            }
            this.f75298d1 = true;
            C20043e c20043e = this.f75294Z0;
            if (c20043e != null) {
                c20043e.m104039z();
            }
            if (this.f75317w1 == 1) {
                this.f75317w1 = 0;
            }
            if (this.f75283S1 && AbstractC19444a.m101693a()) {
                this.f72421L0.m92662fJ().mo92702G1(this, 0);
                if (this.f75288V0 != null) {
                    C23744a.m124114c().m124116d(54, this.f75288V0.mo95039W2());
                    return;
                }
                return;
            }
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 9) {
            try {
                if (objArr.length > 0 && this.f72421L0.m92656bJ() != null && m92674mJ()) {
                    final C20338d c20338d = (C20338d) objArr[0];
                    MessageId m106047e = c20338d.m106047e();
                    MessageId messageId = this.f75290W0;
                    if (messageId != null && messageId.equals(m106047e)) {
                        this.f75297c1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.my
                            @Override // java.lang.Runnable
                            public final void run() {
                                MinimizableVideoPlayerView.this.m81868GM(c20338d);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        int i12;
        try {
            this.f72421L0.m92676n2().mo35554O(18);
            if (bundle != null) {
                this.f75264G1 = bundle.getString("mTitleActionbarBackup");
                this.f75265H1 = bundle.getString("mSubtitleActionbarBackup");
            }
            super.mo37135xJ(bundle);
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setVisibility(8);
            }
            if (this.f75302h1) {
                this.f75299e1 = new C14639e(this.f72421L0.m92648SI(), 3);
            }
            if (this.f75276P0 != null) {
                this.f75294Z0 = new C20043e(this.f75274O0, this.f75278Q0);
                this.f75274O0.setZVideo(this.f75276P0);
                this.f75274O0.setOnCompletionListener(this);
                this.f75274O0.setOnErrorListener(this);
                this.f75274O0.setSkipShowControlWhenStart(true);
                this.f75258A1 = true;
                C17945a0 c17945a0 = this.f75288V0;
                if (c17945a0 != null && c17945a0.m95051X3() != null && (this.f75288V0.m95051X3().f91060c == 1000 || this.f75288V0.m95051X3().f91060c == 1002 || this.f75288V0.m95051X3().f91060c == 1001)) {
                    int i13 = this.f75288V0.m95051X3().f91060c;
                    if (i13 != 1000) {
                        if (i13 != 1002) {
                            i11 = AbstractC16803z.round05_shape;
                            i12 = AbstractC16803z.round05_frame;
                        } else {
                            i11 = AbstractC16803z.heart03_shape;
                            i12 = AbstractC16803z.heart03_frame;
                        }
                    } else {
                        i11 = AbstractC16803z.heart01_shape;
                        i12 = AbstractC16803z.heart01_frame;
                    }
                    this.f75295a1.m75795r(i11, i12);
                    this.f75295a1.setVisibility(0);
                    this.f75295a1.m75796s();
                    this.f75297c1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ry
                        @Override // java.lang.Runnable
                        public final void run() {
                            MinimizableVideoPlayerView.this.m81869HM();
                        }
                    }, 550L);
                } else {
                    this.f75295a1.setVisibility(8);
                    ZVideoView zVideoView = this.f75274O0;
                    C17391z c17391z = this.f75276P0;
                    AbstractC20049k.m104116j(zVideoView, c17391z, this.f75278Q0, c17391z.f88618a);
                    this.f75306l1 = true;
                }
            } else {
                m81910wM(true);
            }
            C13306b c13306b = new C13306b(this.f72421L0.m92648SI());
            this.f75291W1 = c13306b;
            c13306b.m74687C((ViewGroup) this.f72421L0.m92656bJ());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m81911xM(List list) {
        new C18303h(list, this.f75296b1, new C14637c()).m97213k();
        AbstractC23647d.m123897g("10015041");
    }

    /* renamed from: yM */
    protected void m81912yM() {
        int i11;
        try {
            C17945a0 c17945a0 = this.f75288V0;
            if (c17945a0 != null) {
                if (c17945a0.m95276v6()) {
                    i11 = 7;
                } else {
                    i11 = 9;
                }
                AbstractC19646n0.m102966d0(this.f72421L0.m92676n2(), this.f75288V0, true, i11, "", "", "0", -1);
            } else {
                MediaStoreItem mediaStoreItem = this.f75292X0;
                if (mediaStoreItem != null) {
                    m81911xM(AbstractC23159o.m119180d(mediaStoreItem));
                }
            }
            if (this.f75278Q0 == 6 && !TextUtils.isEmpty(this.f75286U0)) {
                C3509j0.m17720f(this.f75286U0, this.f75293Y0, EnumC2382z.f9945r, 1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        try {
            if (zaloActivity instanceof InterfaceC20278h) {
                this.f75285T1 = (InterfaceC20278h) zaloActivity;
            }
            super.mo40210zJ(zaloActivity);
            C23744a.m124114c().m124115b(this, 52);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    Animator m81913zM(boolean z11) {
        float f11;
        int height = this.f88760a0.getHeight();
        if (height == 0) {
            height = m92651WI().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
        }
        float f12 = 0.0f;
        if (z11) {
            f11 = -height;
        } else {
            f11 = 0.0f;
        }
        if (!z11) {
            f12 = -height;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f88760a0, "translationY", f11, f12);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new C26087b());
        ofFloat.addListener(new C14642h(z11));
        return ofFloat;
    }
}
