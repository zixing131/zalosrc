package com.zing.zalo.zmedia.view;

import ag0.AbstractC0837p0;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.core.view.C1580n1;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.uidrawing.widget.video.InterfaceC16725a;
import com.zing.zalo.uidrawing.widget.video.VideoTextureRenderView;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.AndroidMediaPlayer;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.player.ZTimedText;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zmedia.view.debug.PrecacheIndicatorView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mm0.AbstractC23350e;
import p361nb.C23651h;
import p361nb.C23669z;
import pl0.AbstractC24825f;
import pl0.AbstractC24827h;
import ql0.C25324a;

/* loaded from: classes7.dex */
public class ZVideoView extends FrameLayout implements MediaController.MediaPlayerControl, Handler.Callback {

    /* renamed from: x1 */
    static final int[] f88331x1 = {0, 1, 2, 4, 5};

    /* renamed from: A */
    ViewGroup f88332A;

    /* renamed from: A0 */
    int f88333A0;

    /* renamed from: B */
    ViewGroup.LayoutParams f88334B;

    /* renamed from: B0 */
    boolean f88335B0;

    /* renamed from: C */
    boolean f88336C;

    /* renamed from: C0 */
    boolean f88337C0;

    /* renamed from: D */
    boolean f88338D;

    /* renamed from: D0 */
    boolean f88339D0;

    /* renamed from: E */
    int f88340E;

    /* renamed from: E0 */
    boolean f88341E0;

    /* renamed from: F */
    int f88342F;

    /* renamed from: F0 */
    boolean f88343F0;

    /* renamed from: G */
    int f88344G;

    /* renamed from: G0 */
    AbstractC17297a.b f88345G0;

    /* renamed from: H */
    float f88346H;

    /* renamed from: H0 */
    int f88347H0;

    /* renamed from: I */
    int f88348I;

    /* renamed from: I0 */
    int f88349I0;

    /* renamed from: J */
    int f88350J;

    /* renamed from: J0 */
    int f88351J0;

    /* renamed from: K */
    float f88352K;

    /* renamed from: K0 */
    protected ZMediaPlayerSettings.VideoConfig f88353K0;

    /* renamed from: L */
    boolean f88354L;

    /* renamed from: L0 */
    protected ZMediaPlayerSettings.PlayConfig f88355L0;

    /* renamed from: M */
    boolean f88356M;

    /* renamed from: M0 */
    C25324a f88357M0;

    /* renamed from: N */
    IMediaPlayer.OnCompletionListener f88358N;

    /* renamed from: N0 */
    TableLayout f88359N0;

    /* renamed from: O */
    IMediaPlayer.OnPreparedListener f88360O;

    /* renamed from: O0 */
    public boolean f88361O0;

    /* renamed from: P */
    IMediaPlayer.OnErrorListener f88362P;

    /* renamed from: P0 */
    boolean f88363P0;

    /* renamed from: Q */
    IMediaPlayer.OnInfoListener f88364Q;

    /* renamed from: Q0 */
    boolean f88365Q0;

    /* renamed from: R */
    IMediaPlayer.OnSeekCompleteListener f88366R;

    /* renamed from: R0 */
    PrecacheIndicatorView f88367R0;

    /* renamed from: S */
    InterfaceC17344p f88368S;

    /* renamed from: S0 */
    boolean f88369S0;

    /* renamed from: T */
    InterfaceC17345q f88370T;

    /* renamed from: T0 */
    int f88371T0;

    /* renamed from: U */
    InterfaceC17350c f88372U;

    /* renamed from: U0 */
    int f88373U0;

    /* renamed from: V */
    int f88374V;

    /* renamed from: V0 */
    HashMap f88375V0;

    /* renamed from: W */
    int f88376W;

    /* renamed from: W0 */
    HashMap f88377W0;

    /* renamed from: X0 */
    int f88378X0;

    /* renamed from: Y0 */
    int f88379Y0;

    /* renamed from: Z0 */
    boolean f88380Z0;

    /* renamed from: a0 */
    int f88381a0;

    /* renamed from: a1 */
    Runnable f88382a1;

    /* renamed from: b0 */
    boolean f88383b0;

    /* renamed from: b1 */
    private final AudioManager.OnAudioFocusChangeListener f88384b1;

    /* renamed from: c0 */
    boolean f88385c0;

    /* renamed from: c1 */
    IMediaPlayer.OnVideoSizeChangedListener f88386c1;

    /* renamed from: d0 */
    boolean f88387d0;

    /* renamed from: d1 */
    IMediaPlayer.OnPreparedListener f88388d1;

    /* renamed from: e0 */
    boolean f88389e0;

    /* renamed from: e1 */
    IMediaPlayer.OnCompletionListener f88390e1;

    /* renamed from: f0 */
    boolean f88391f0;

    /* renamed from: f1 */
    IMediaPlayer.OnInfoListener f88392f1;

    /* renamed from: g0 */
    boolean f88393g0;

    /* renamed from: g1 */
    IMediaPlayer.OnErrorListener f88394g1;

    /* renamed from: h0 */
    boolean f88395h0;

    /* renamed from: h1 */
    IMediaPlayer.OnBufferingUpdateListener f88396h1;

    /* renamed from: i0 */
    Context f88397i0;

    /* renamed from: i1 */
    IMediaPlayer.OnSeekCompleteListener f88398i1;

    /* renamed from: j0 */
    Activity f88399j0;

    /* renamed from: j1 */
    IMediaPlayer.OnTimedTextListener f88400j1;

    /* renamed from: k0 */
    AudioManager f88401k0;

    /* renamed from: k1 */
    IMediaPlayer.OnStateChangedListener f88402k1;

    /* renamed from: l0 */
    InterfaceC16725a f88403l0;

    /* renamed from: l1 */
    InterfaceC16725a.a f88404l1;

    /* renamed from: m0 */
    TextView f88405m0;

    /* renamed from: m1 */
    float f88406m1;

    /* renamed from: n0 */
    FrameLayout.LayoutParams f88407n0;

    /* renamed from: n1 */
    int f88408n1;

    /* renamed from: o0 */
    RelativeLayout.LayoutParams f88409o0;

    /* renamed from: o1 */
    int f88410o1;

    /* renamed from: p */
    C17391z f88411p;

    /* renamed from: p0 */
    int f88412p0;

    /* renamed from: p1 */
    boolean f88413p1;

    /* renamed from: q */
    int f88414q;

    /* renamed from: q0 */
    int f88415q0;

    /* renamed from: q1 */
    float f88416q1;

    /* renamed from: r */
    int f88417r;

    /* renamed from: r0 */
    long f88418r0;

    /* renamed from: r1 */
    float f88419r1;

    /* renamed from: s */
    InterfaceC16725a.b f88420s;

    /* renamed from: s0 */
    long f88421s0;

    /* renamed from: s1 */
    IMediaPlayer.OnVideoSizeChangedListener f88422s1;

    /* renamed from: t */
    IMediaPlayer f88423t;

    /* renamed from: t0 */
    long f88424t0;

    /* renamed from: t1 */
    View f88425t1;

    /* renamed from: u */
    Handler f88426u;

    /* renamed from: u0 */
    long f88427u0;

    /* renamed from: u1 */
    float f88428u1;

    /* renamed from: v */
    protected int f88429v;

    /* renamed from: v0 */
    boolean f88430v0;

    /* renamed from: v1 */
    ValueAnimator f88431v1;

    /* renamed from: w */
    private int f88432w;

    /* renamed from: w0 */
    boolean f88433w0;

    /* renamed from: w1 */
    InterfaceC17343o f88434w1;

    /* renamed from: x */
    private boolean f88435x;

    /* renamed from: x0 */
    int f88436x0;

    /* renamed from: y */
    VideoController f88437y;

    /* renamed from: y0 */
    int f88438y0;

    /* renamed from: z */
    FrameLayout.LayoutParams f88439z;

    /* renamed from: z0 */
    boolean f88440z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$a */
    /* loaded from: classes7.dex */
    public class C17329a implements IMediaPlayer.OnSeekCompleteListener {
        C17329a() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            ZVideoView zVideoView;
            C25324a c25324a;
            ZVideoView.this.f88427u0 = System.currentTimeMillis();
            if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (c25324a = (zVideoView = ZVideoView.this).f88357M0) != null) {
                c25324a.m131161o(zVideoView.f88427u0 - zVideoView.f88424t0);
            }
            IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = ZVideoView.this.f88366R;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(iMediaPlayer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$b */
    /* loaded from: classes7.dex */
    public class C17330b implements IMediaPlayer.OnTimedTextListener {
        C17330b() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, ZTimedText zTimedText) {
            if (zTimedText != null) {
                ZVideoView.this.f88405m0.setText(zTimedText.getText());
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$c */
    /* loaded from: classes7.dex */
    public class C17331c implements IMediaPlayer.OnStateChangedListener {
        C17331c() {
        }

        /* renamed from: b */
        public /* synthetic */ void m92441b(int i11) {
            ZVideoView zVideoView = ZVideoView.this;
            if (!zVideoView.f88369S0) {
                zVideoView.f88437y.m92305g();
            }
            ZVideoView zVideoView2 = ZVideoView.this;
            zVideoView2.f88369S0 = true;
            if (i11 == 3) {
                InterfaceC16725a interfaceC16725a = zVideoView2.f88403l0;
                if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
                    ZVideoView.this.f88403l0.getView().setAlpha(1.0f);
                }
                if (ZVideoView.this.f88437y.m92318w()) {
                    ZVideoView zVideoView3 = ZVideoView.this;
                    if (!zVideoView3.f88433w0) {
                        zVideoView3.f88437y.m92299W(false, true);
                    }
                }
                ZVideoView zVideoView4 = ZVideoView.this;
                if (!zVideoView4.f88433w0) {
                    zVideoView4.m92419m0(false);
                }
                ZVideoView.this.f88437y.m92295S(false);
            }
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnStateChangedListener
        public void onStateChanged(IMediaPlayer iMediaPlayer, int i11) {
            ZVideoView.this.setCurrentState(i11);
            VideoController videoController = ZVideoView.this.f88437y;
            if (videoController != null) {
                videoController.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.n0

                    /* renamed from: q */
                    public final /* synthetic */ int f88536q;

                    public /* synthetic */ RunnableC17373n0(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZVideoView.C17331c.this.m92441b(r2);
                    }
                });
            }
            InterfaceC17345q interfaceC17345q = ZVideoView.this.f88370T;
            if (interfaceC17345q != null) {
                interfaceC17345q.mo44076D(i112);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$d */
    /* loaded from: classes7.dex */
    public class C17332d implements InterfaceC16725a.a {
        C17332d() {
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: a */
        public void mo89176a(InterfaceC16725a.b bVar) {
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZVideoView zVideoView = ZVideoView.this;
            if (mo89171c != zVideoView.f88403l0) {
                AbstractC23350e.m122774d("ZVideoView", "onSurfaceDestroyed: unmatched render callback\n");
                return;
            }
            zVideoView.f88420s.mo89169a();
            ZVideoView zVideoView2 = ZVideoView.this;
            zVideoView2.f88420s = null;
            zVideoView2.m92413g0();
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: b */
        public void mo89177b(InterfaceC16725a.b bVar, int i11, int i12) {
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZVideoView zVideoView = ZVideoView.this;
            InterfaceC16725a interfaceC16725a = zVideoView.f88403l0;
            if (mo89171c != interfaceC16725a) {
                return;
            }
            zVideoView.f88420s = bVar;
            IMediaPlayer iMediaPlayer = zVideoView.f88423t;
            if (iMediaPlayer != null) {
                zVideoView.m92425q(iMediaPlayer, bVar);
                return;
            }
            if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
                ZVideoView.this.f88403l0.getView().setAlpha(0.0f);
            }
            ZVideoView zVideoView2 = ZVideoView.this;
            if (zVideoView2.f88335B0) {
                zVideoView2.m92410d0();
                ZVideoView.this.f88335B0 = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:            if (r5.f88350J == r7) goto L43;     */
        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo89178c(InterfaceC16725a.b bVar, int i11, int i12, int i13) {
            boolean z11;
            ZVideoView zVideoView;
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZVideoView zVideoView2 = ZVideoView.this;
            InterfaceC16725a interfaceC16725a = zVideoView2.f88403l0;
            if (mo89171c != interfaceC16725a) {
                return;
            }
            zVideoView2.f88340E = i12;
            zVideoView2.f88342F = i13;
            boolean z12 = false;
            if (zVideoView2.f88417r == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (interfaceC16725a.mo89166c()) {
                ZVideoView zVideoView3 = ZVideoView.this;
                if (zVideoView3.f88348I == i12) {
                }
                zVideoView = ZVideoView.this;
                if (zVideoView.f88423t == null && z11 && z12) {
                    int i14 = zVideoView.f88376W;
                    if (i14 != 0) {
                        zVideoView.seekTo(i14);
                    }
                    ZVideoView.this.start();
                    return;
                }
                return;
            }
            z12 = true;
            zVideoView = ZVideoView.this;
            if (zVideoView.f88423t == null) {
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$e */
    /* loaded from: classes7.dex */
    public class C17333e extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f88445a;

        C17333e(int i11) {
            this.f88445a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f88445a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$f */
    /* loaded from: classes7.dex */
    public class RunnableC17334f implements Runnable {
        RunnableC17334f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZVideoView zVideoView = ZVideoView.this;
                if (zVideoView.f88437y != null && zVideoView.f88417r != 4 && zVideoView.f88414q != 0) {
                    zVideoView.m92419m0(true);
                    ZVideoView.this.f88437y.m92295S(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$g */
    /* loaded from: classes7.dex */
    public class C17335g implements IMediaPlayer.OnDataSourceCheckedListener {

        /* renamed from: a */
        final /* synthetic */ Map f88448a;

        C17335g(Map map) {
            this.f88448a = map;
        }

        /* renamed from: c */
        public /* synthetic */ void m92444c() {
            AbstractC20110a.m104538g("set DataSource Async failed HLS.", new Object[0]);
            ZVideoView.this.setCurrentState(-1);
            ZVideoView zVideoView = ZVideoView.this;
            zVideoView.f88417r = -1;
            zVideoView.f88394g1.onError(zVideoView.f88423t, -1010, 0);
        }

        /* renamed from: d */
        public /* synthetic */ void m92445d(String str, Map map) {
            if (ZVideoView.this.f88423t != null && !str.isEmpty()) {
                try {
                    map.put(ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_URL_TYPE, String.valueOf(1));
                    ZVideoView.this.f88423t.setDataSourceWithFormatOptions(str, map);
                    ZVideoView.this.f88423t.prepareAsync();
                } catch (Exception unused) {
                    AbstractC20110a.m104538g("[HLS] setDataSource failed!!!", new Object[0]);
                    ZVideoView.this.setCurrentState(-1);
                    ZVideoView zVideoView = ZVideoView.this;
                    zVideoView.f88417r = -1;
                    zVideoView.f88394g1.onError(zVideoView.f88423t, 1, 0);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onFailed() {
            ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.o0
                public /* synthetic */ RunnableC17375o0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.C17335g.this.m92444c();
                }
            });
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onSuccess(String str) {
            ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.p0

                /* renamed from: q */
                public final /* synthetic */ String f88591q;

                /* renamed from: r */
                public final /* synthetic */ Map f88592r;

                public /* synthetic */ RunnableC17377p0(String str2, Map map) {
                    r2 = str2;
                    r3 = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.C17335g.this.m92445d(r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$h */
    /* loaded from: classes7.dex */
    public class C17336h implements IMediaPlayer.OnDataSourceCheckedListener {

        /* renamed from: a */
        final /* synthetic */ Map f88450a;

        C17336h(Map map) {
            this.f88450a = map;
        }

        /* renamed from: c */
        public /* synthetic */ void m92448c() {
            AbstractC20110a.m104538g("set DataSource Async failed mp4.", new Object[0]);
            ZVideoView.this.setCurrentState(-1);
            ZVideoView zVideoView = ZVideoView.this;
            zVideoView.f88417r = -1;
            zVideoView.f88394g1.onError(zVideoView.f88423t, -1010, 0);
        }

        /* renamed from: d */
        public /* synthetic */ void m92449d(String str, Map map) {
            if (ZVideoView.this.f88423t != null && !str.isEmpty()) {
                try {
                    map.put(ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_URL_TYPE, String.valueOf(0));
                    ZVideoView.this.f88423t.setDataSourceWithFormatOptions(str, map);
                    ZVideoView.this.f88423t.prepareAsync();
                } catch (Exception unused) {
                    AbstractC20110a.m104538g("[MP4] setDataSource failed!!!", new Object[0]);
                    ZVideoView.this.setCurrentState(-1);
                    ZVideoView zVideoView = ZVideoView.this;
                    zVideoView.f88417r = -1;
                    zVideoView.f88394g1.onError(zVideoView.f88423t, 1, 0);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onFailed() {
            ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.q0
                public /* synthetic */ RunnableC17379q0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.C17336h.this.m92448c();
                }
            });
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onSuccess(String str) {
            ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.r0

                /* renamed from: q */
                public final /* synthetic */ String f88598q;

                /* renamed from: r */
                public final /* synthetic */ Map f88599r;

                public /* synthetic */ RunnableC17381r0(String str2, Map map) {
                    r2 = str2;
                    r3 = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.C17336h.this.m92449d(r2, r3);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$i */
    /* loaded from: classes7.dex */
    public class C17337i implements AbstractC17297a.b {

        /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$i$a */
        /* loaded from: classes7.dex */
        public class a implements IMediaPlayer.OnDataSourceCheckedListener {
            a() {
            }

            /* renamed from: c */
            public /* synthetic */ void m92452c() {
                AbstractC20110a.m104538g("set DataSource Async failed onCompleted.", new Object[0]);
                ZVideoView.this.setCurrentState(-1);
                ZVideoView zVideoView = ZVideoView.this;
                zVideoView.f88417r = -1;
                zVideoView.f88394g1.onError(zVideoView.f88423t, -1010, 0);
            }

            /* renamed from: d */
            public /* synthetic */ void m92453d(String str) {
                if (ZVideoView.this.f88423t != null && !str.isEmpty()) {
                    try {
                        ZVideoView.this.f88423t.setDataSource(str);
                        ZVideoView.this.f88423t.prepareAsync();
                    } catch (Exception unused) {
                        AbstractC20110a.m104538g("[Cache] setDataSource failed!!!", new Object[0]);
                        ZVideoView.this.setCurrentState(-1);
                        ZVideoView zVideoView = ZVideoView.this;
                        zVideoView.f88417r = -1;
                        zVideoView.f88394g1.onError(zVideoView.f88423t, 1, 0);
                    }
                }
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
            public void onFailed() {
                ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.s0
                    public /* synthetic */ RunnableC17383s0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZVideoView.C17337i.a.this.m92452c();
                    }
                });
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
            public void onSuccess(String str) {
                ZVideoView.this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.t0

                    /* renamed from: q */
                    public final /* synthetic */ String f88604q;

                    public /* synthetic */ RunnableC17385t0(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZVideoView.C17337i.a.this.m92453d(r2);
                    }
                });
            }
        }

        C17337i() {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: cH */
        public void mo39665cH(C17391z c17391z, CacheException cacheException) {
            AbstractC17297a.b bVar;
            if (ZVideoView.this.f88411p.equals(c17391z) && (bVar = ZVideoView.this.f88345G0) != null) {
                bVar.mo39665cH(c17391z, cacheException);
            }
            ZVideoView zVideoView = ZVideoView.this;
            IMediaPlayer.OnErrorListener onErrorListener = zVideoView.f88394g1;
            if (onErrorListener != null) {
                onErrorListener.onError(zVideoView.f88423t, 1, 0);
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: qH */
        public void mo39666qH(C17391z c17391z) {
            AbstractC17297a.b bVar;
            C17391z c17391z2 = ZVideoView.this.f88411p;
            if (c17391z2 != null && c17391z2.equals(c17391z) && (bVar = ZVideoView.this.f88345G0) != null) {
                bVar.mo39666qH(c17391z);
                ZVideoView zVideoView = ZVideoView.this;
                if (zVideoView.f88437y != null) {
                    zVideoView.m92419m0(true);
                    ZVideoView.this.f88437y.m92295S(false);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: tE */
        public void mo39667tE(C17391z c17391z) {
            AbstractC17297a.b bVar;
            C17391z c17391z2;
            try {
                ZVideoView zVideoView = ZVideoView.this;
                int i11 = zVideoView.f88414q;
                if ((i11 == 1 || i11 == 0) && (c17391z2 = zVideoView.f88411p) != null && c17391z2.equals(c17391z)) {
                    ZVideoView.this.m92419m0(false);
                    ZVideoView.this.f88423t.setDataSourceAsync(c17391z.f88628k, new a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C17391z c17391z3 = ZVideoView.this.f88411p;
            if (c17391z3 != null && c17391z3.equals(c17391z) && (bVar = ZVideoView.this.f88345G0) != null) {
                bVar.mo39667tE(c17391z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$j */
    /* loaded from: classes7.dex */
    public class C17338j implements IMediaPlayer.OnVideoSizeChangedListener {
        C17338j() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            ZVideoView.this.f88348I = iMediaPlayer.getVideoWidth();
            ZVideoView.this.f88350J = iMediaPlayer.getVideoHeight();
            ZVideoView.this.f88412p0 = iMediaPlayer.getVideoSarNum();
            ZVideoView.this.f88415q0 = iMediaPlayer.getVideoSarDen();
            ZVideoView zVideoView = ZVideoView.this;
            if (zVideoView.f88348I != 0 && zVideoView.f88350J != 0) {
                zVideoView.m92417k0();
                ZVideoView zVideoView2 = ZVideoView.this;
                int i17 = zVideoView2.f88348I;
                int i18 = zVideoView2.f88350J;
                int i19 = zVideoView2.f88344G;
                if (i19 != 90 && i19 != 270) {
                    i16 = i17;
                    i15 = i18;
                } else {
                    i15 = i17;
                    i16 = i18;
                }
                float f11 = i16 / i15;
                if (Math.abs(zVideoView2.getVideoRatio() - f11) > 0.01d) {
                    ZVideoView.this.setVideoRatio(f11);
                    ZVideoView.this.requestLayout();
                    IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = ZVideoView.this.f88422s1;
                    if (onVideoSizeChangedListener != null) {
                        onVideoSizeChangedListener.onVideoSizeChanged(iMediaPlayer, i16, i15, i13, i14);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$k */
    /* loaded from: classes7.dex */
    public class C17339k implements IMediaPlayer.OnPreparedListener {
        C17339k() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:            if (r7.f88342F == r7.f88350J) goto L70;     */
        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnPreparedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            ZVideoView zVideoView;
            C25324a c25324a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OnPrepared with targetState :");
            sb2.append(ZVideoView.this.f88417r);
            ZVideoView.this.f88421s0 = System.currentTimeMillis();
            if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (c25324a = (zVideoView = ZVideoView.this).f88357M0) != null) {
                c25324a.m131160n(zVideoView.f88421s0 - zVideoView.f88418r0);
            }
            ZVideoView zVideoView2 = ZVideoView.this;
            zVideoView2.removeCallbacks(zVideoView2.f88382a1);
            ZVideoView.this.setCurrentState(2);
            ZVideoView zVideoView3 = ZVideoView.this;
            IMediaPlayer.OnPreparedListener onPreparedListener = zVideoView3.f88360O;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(zVideoView3.f88423t);
            }
            ZVideoView.this.f88348I = iMediaPlayer.getVideoWidth();
            ZVideoView.this.f88350J = iMediaPlayer.getVideoHeight();
            ZVideoView zVideoView4 = ZVideoView.this;
            int i11 = zVideoView4.f88376W;
            if (i11 > 0) {
                zVideoView4.seekTo(i11);
            }
            ZVideoView zVideoView5 = ZVideoView.this;
            if (zVideoView5.f88348I != 0 && zVideoView5.f88350J != 0) {
                if (zVideoView5.f88403l0 != null) {
                    zVideoView5.m92417k0();
                    ZVideoView zVideoView6 = ZVideoView.this;
                    zVideoView6.f88403l0.mo89164a(zVideoView6.f88412p0, zVideoView6.f88415q0);
                    if (ZVideoView.this.f88403l0.mo89166c()) {
                        ZVideoView zVideoView7 = ZVideoView.this;
                        if (zVideoView7.f88340E == zVideoView7.f88348I) {
                        }
                    }
                    ZVideoView zVideoView8 = ZVideoView.this;
                    if (zVideoView8.f88417r != 3 && zVideoView8.f88353K0.getPlayerType() != 0) {
                        ZVideoView zVideoView9 = ZVideoView.this;
                        if (zVideoView9.f88417r == 4) {
                            zVideoView9.pause();
                        }
                    } else {
                        ZVideoView.this.start();
                    }
                }
            } else if (zVideoView5.f88417r != 3 && zVideoView5.f88353K0.getPlayerType() != 0) {
                ZVideoView zVideoView10 = ZVideoView.this;
                if (zVideoView10.f88417r == 4) {
                    zVideoView10.pause();
                }
            } else {
                ZVideoView.this.start();
            }
            ZVideoView.this.f88437y.m92302a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$l */
    /* loaded from: classes7.dex */
    public class C17340l implements IMediaPlayer.OnCompletionListener {
        C17340l() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
        public void onVideoCompletion(IMediaPlayer iMediaPlayer) {
            ZVideoView.this.setCurrentState(5);
            ZVideoView zVideoView = ZVideoView.this;
            zVideoView.f88417r = 5;
            IMediaPlayer.OnCompletionListener onCompletionListener = zVideoView.f88358N;
            if (onCompletionListener != null) {
                onCompletionListener.onVideoCompletion(zVideoView.f88423t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$m */
    /* loaded from: classes7.dex */
    public class C17341m implements IMediaPlayer.OnInfoListener {
        C17341m() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
            IMediaPlayer.OnInfoListener onInfoListener = ZVideoView.this.f88364Q;
            if (onInfoListener != null) {
                onInfoListener.onInfo(iMediaPlayer, i11, i12, obj);
            }
            if (i11 != 3) {
                if (i11 != 1001) {
                    if (i11 != 10001) {
                        if (i11 != 11000) {
                            switch (i11) {
                                case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                    ZVideoView zVideoView = ZVideoView.this;
                                    zVideoView.removeCallbacks(zVideoView.f88382a1);
                                    ZVideoView zVideoView2 = ZVideoView.this;
                                    zVideoView2.postDelayed(zVideoView2.f88382a1, 1000L);
                                    break;
                                case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                    ZVideoView.this.m92419m0(false);
                                    ZVideoView zVideoView3 = ZVideoView.this;
                                    zVideoView3.removeCallbacks(zVideoView3.f88382a1);
                                    ZVideoView zVideoView4 = ZVideoView.this;
                                    zVideoView4.f88433w0 = false;
                                    zVideoView4.f88436x0 = 0;
                                    zVideoView4.f88438y0 = 0;
                                    break;
                                case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("MEDIA_INFO_NETWORK_BANDWIDTH: ");
                                    sb2.append(i12);
                                    break;
                                case IMediaPlayer.MEDIA_INFO_BUFFERING_EMPTY /* 704 */:
                                    ZVideoView zVideoView5 = ZVideoView.this;
                                    if (zVideoView5.f88436x0 == -10000) {
                                        zVideoView5.m92409c0();
                                    }
                                    ZVideoView.this.f88433w0 = true;
                                    break;
                            }
                        } else if (ZVideoView.this.f88411p != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onInfo: MEDIA_INFO_BUFFERING_START ");
                            ZVideoView zVideoView6 = ZVideoView.this;
                            sb3.append(zVideoView6.f88377W0.get(zVideoView6.f88411p.f88618a));
                            ZVideoView zVideoView7 = ZVideoView.this;
                            zVideoView7.f88377W0.put(zVideoView7.f88411p.f88618a, Boolean.TRUE);
                        }
                    } else {
                        ZVideoView.this.f88344G = i12;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("MEDIA_INFO_VIDEO_ROTATION_CHANGED: ");
                        sb4.append(i12);
                        InterfaceC16725a interfaceC16725a = ZVideoView.this.f88403l0;
                        if (interfaceC16725a != null) {
                            interfaceC16725a.setVideoRotation(i12);
                        }
                    }
                } else {
                    ZVideoView.this.f88437y.m92286J(i12);
                }
            } else {
                ZVideoView.this.f88433w0 = false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$n */
    /* loaded from: classes7.dex */
    public class C17342n implements IMediaPlayer.OnBufferingUpdateListener {
        C17342n() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11) {
            if (i11 > 0) {
                ZVideoView.this.f88374V = i11;
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$o */
    /* loaded from: classes7.dex */
    public interface InterfaceC17343o {
        /* renamed from: a */
        void mo61908a(float f11);
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$p */
    /* loaded from: classes7.dex */
    public interface InterfaceC17344p {
        /* renamed from: cg */
        void mo81908cg(boolean z11);
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZVideoView$q */
    /* loaded from: classes7.dex */
    public interface InterfaceC17345q {
        /* renamed from: D */
        void mo44076D(int i11);
    }

    public ZVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88414q = 0;
        this.f88417r = 0;
        this.f88420s = null;
        this.f88423t = null;
        this.f88429v = 0;
        this.f88432w = 0;
        this.f88435x = false;
        this.f88336C = false;
        this.f88338D = false;
        this.f88346H = 1.0f;
        this.f88348I = 0;
        this.f88350J = 0;
        this.f88352K = 1.0f;
        this.f88354L = false;
        this.f88356M = true;
        this.f88381a0 = 0;
        this.f88383b0 = true;
        this.f88385c0 = true;
        this.f88387d0 = true;
        this.f88389e0 = false;
        this.f88391f0 = false;
        this.f88393g0 = false;
        this.f88395h0 = false;
        this.f88418r0 = 0L;
        this.f88421s0 = 0L;
        this.f88424t0 = 0L;
        this.f88427u0 = 0L;
        this.f88430v0 = true;
        this.f88433w0 = false;
        this.f88436x0 = 0;
        this.f88438y0 = 0;
        this.f88440z0 = false;
        this.f88333A0 = -1;
        this.f88335B0 = false;
        this.f88337C0 = false;
        this.f88339D0 = false;
        this.f88341E0 = false;
        this.f88343F0 = false;
        this.f88347H0 = 0;
        this.f88361O0 = false;
        this.f88363P0 = false;
        this.f88365Q0 = false;
        this.f88369S0 = false;
        this.f88371T0 = 0;
        this.f88373U0 = 0;
        this.f88375V0 = new HashMap();
        this.f88377W0 = new HashMap();
        this.f88378X0 = 0;
        this.f88379Y0 = 0;
        this.f88380Z0 = false;
        this.f88382a1 = new RunnableC17334f();
        this.f88384b1 = new AudioManager.OnAudioFocusChangeListener() { // from class: com.zing.zalo.zmedia.view.g0
            public /* synthetic */ C17359g0() {
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                ZVideoView.this.m92377W(i11);
            }
        };
        this.f88386c1 = new C17338j();
        this.f88388d1 = new C17339k();
        this.f88390e1 = new C17340l();
        this.f88392f1 = new C17341m();
        this.f88394g1 = new IMediaPlayer.OnErrorListener() { // from class: com.zing.zalo.zmedia.view.h0
            public /* synthetic */ C17361h0() {
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                boolean m92378X;
                m92378X = ZVideoView.this.m92378X(iMediaPlayer, i11, i12);
                return m92378X;
            }
        };
        this.f88396h1 = new C17342n();
        this.f88398i1 = new C17329a();
        this.f88400j1 = new C17330b();
        this.f88402k1 = new C17331c();
        this.f88404l1 = new C17332d();
        this.f88406m1 = 1.0f;
        this.f88408n1 = f88331x1[0];
        this.f88410o1 = 0;
        this.f88413p1 = true;
        this.f88419r1 = 1.7777778f;
        this.f88428u1 = 0.0f;
        this.f88426u = new Handler(Looper.getMainLooper(), this);
        m92399E(context, attributeSet);
    }

    /* renamed from: B */
    private void m92367B(boolean z11, boolean z12, int i11) {
        C25324a c25324a;
        try {
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to open content: ");
            sb2.append(this.f88411p.f88620c);
            setCurrentState(-1);
            this.f88417r = -1;
            this.f88394g1.onError(this.f88423t, 1, 0);
        }
        if (this.f88411p == null) {
            return;
        }
        AbstractC20110a.m104542k(8, "Video 8K: initMediaPicker: forceUseProxy = " + z11 + " player: " + System.identityHashCode(this), new Object[0]);
        this.f88423t = m92428s(z11);
        if (this.f88391f0) {
            this.f88353K0 = ZMediaPlayerSettings.getVideoConfig(8);
        }
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null && this.f88353K0 != null) {
            iMediaPlayer.setOnPreparedListener(this.f88388d1);
            this.f88423t.setOnVideoSizeChangedListener(this.f88386c1);
            this.f88423t.setOnCompletionListener(this.f88390e1);
            this.f88423t.setOnErrorListener(this.f88394g1);
            this.f88423t.setOnInfoListener(this.f88392f1);
            this.f88423t.setOnBufferingUpdateListener(this.f88396h1);
            this.f88423t.setOnSeekCompleteListener(this.f88398i1);
            this.f88423t.setOnTimedTextListener(this.f88400j1);
            this.f88423t.setOnStateChangedListener(this.f88402k1);
            this.f88374V = 0;
            m92425q(this.f88423t, this.f88420s);
            this.f88423t.setAudioStreamType(3);
            this.f88423t.setScreenOnWhilePlaying(m92369G());
            this.f88418r0 = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (z12) {
                if (this.f88353K0.getEnablePrecache() == 1 && this.f88353K0.getPlayerType() == 1 && !this.f88391f0) {
                    ZMediaPlayerSettings.VideoConfig videoConfig = this.f88353K0;
                    if (!ZMediaPlayer.isFileExisted(videoConfig, ZMediaPlayerSettings.getCacheDir(videoConfig.getPlayerSection()), this.f88411p.f88621d, 1)) {
                        m92419m0(true);
                    } else {
                        postDelayed(this.f88382a1, 2000L);
                    }
                } else {
                    m92419m0(true);
                }
                this.f88423t.setDataSourceAsync(this.f88411p.f88621d, new C17335g(hashMap));
            } else if (this.f88353K0.getPlayerType() == 1 && !this.f88391f0) {
                postDelayed(this.f88382a1, 2000L);
                this.f88423t.setDataSourceAsync(this.f88411p.f88620c, new C17336h(hashMap));
            } else {
                AbstractC17297a.m92226d(this.f88411p, new C17337i());
            }
            IMediaPlayer iMediaPlayer2 = this.f88423t;
            if ((iMediaPlayer2 instanceof ZMediaPlayer) && ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (c25324a = this.f88357M0) != null) {
                c25324a.m131159l(iMediaPlayer2);
                return;
            }
            return;
        }
        setCurrentState(i11);
    }

    /* renamed from: C */
    private void m92368C(boolean z11) {
        if (this.f88411p == null) {
            return;
        }
        int currentState = getCurrentState();
        setCurrentState(1);
        if (z11) {
            m92367B(false, true, currentState);
            return;
        }
        ZMediaPlayerSettings.VideoConfig videoConfig = this.f88353K0;
        if (videoConfig != null && videoConfig.getPlayerSection() == 6) {
            m92367B(false, false, currentState);
        } else {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.zmedia.view.a0

                /* renamed from: q */
                public final /* synthetic */ String f88460q;

                /* renamed from: r */
                public final /* synthetic */ int f88461r;

                public /* synthetic */ RunnableC17347a0(String str, int currentState2) {
                    r2 = str;
                    r3 = currentState2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.this.m92374T(r2, r3);
                }
            });
        }
    }

    /* renamed from: G */
    private boolean m92369G() {
        ZMediaPlayerSettings.PlayConfig playConfig = this.f88355L0;
        if (playConfig != null) {
            return playConfig.isForceScreenOnWhilePlaying();
        }
        return true;
    }

    /* renamed from: P */
    public /* synthetic */ void m92370P(View view) {
        try {
            if (this.f88430v0) {
                this.f88440z0 = true;
                return;
            }
            this.f88333A0 = getCurrentPosition();
            boolean z11 = !this.f88338D;
            this.f88338D = z11;
            if (z11) {
                if (getActivity().getResources().getConfiguration().orientation != 2) {
                    getActivity().setRequestedOrientation(6);
                }
            } else {
                if (getActivity().getResources().getConfiguration().orientation != 1) {
                    getActivity().setRequestedOrientation(1);
                }
                try {
                    if (!isPlaying() && !this.f88389e0) {
                        m92434v0();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            setFullScreen(this.f88338D);
            InterfaceC17344p interfaceC17344p = this.f88368S;
            if (interfaceC17344p != null) {
                interfaceC17344p.mo81908cg(this.f88338D);
            }
            m92436w0();
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f88338D = true ^ this.f88338D;
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void m92371Q(View view) {
        try {
            this.f88437y.m92301Y(false);
            this.f88437y.m92300X(false);
            m92419m0(true);
            m92410d0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public /* synthetic */ void m92372R(String str, boolean z11, int i11) {
        C17391z c17391z = this.f88411p;
        if (c17391z != null && TextUtils.equals(c17391z.f88620c, str)) {
            m92367B(z11, false, i11);
        }
    }

    /* renamed from: S */
    public /* synthetic */ void m92373S(String str, int i11) {
        C17391z c17391z = this.f88411p;
        if (c17391z != null && TextUtils.equals(c17391z.f88620c, str)) {
            m92367B(false, false, i11);
        }
    }

    /* renamed from: T */
    public /* synthetic */ void m92374T(String str, int i11) {
        boolean z11;
        if (str != null) {
            try {
                if (AbstractC17358g.m92495h(str)) {
                    z11 = true;
                    this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.k0

                        /* renamed from: q */
                        public final /* synthetic */ String f88525q;

                        /* renamed from: r */
                        public final /* synthetic */ boolean f88526r;

                        /* renamed from: s */
                        public final /* synthetic */ int f88527s;

                        public /* synthetic */ RunnableC17367k0(String str2, boolean z112, int i112) {
                            r2 = str2;
                            r3 = z112;
                            r4 = i112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ZVideoView.this.m92372R(r2, r3, r4);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.l0

                    /* renamed from: q */
                    public final /* synthetic */ String f88530q;

                    /* renamed from: r */
                    public final /* synthetic */ int f88531r;

                    public /* synthetic */ RunnableC17369l0(String str2, int i112) {
                        r2 = str2;
                        r3 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZVideoView.this.m92373S(r2, r3);
                    }
                });
                return;
            }
        }
        z112 = false;
        this.f88426u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.k0

            /* renamed from: q */
            public final /* synthetic */ String f88525q;

            /* renamed from: r */
            public final /* synthetic */ boolean f88526r;

            /* renamed from: s */
            public final /* synthetic */ int f88527s;

            public /* synthetic */ RunnableC17367k0(String str2, boolean z112, int i112) {
                r2 = str2;
                r3 = z112;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZVideoView.this.m92372R(r2, r3, r4);
            }
        });
    }

    /* renamed from: U */
    public /* synthetic */ void m92375U(int i11) {
        try {
            if (this.f88414q == -1) {
                return;
            }
            if ((i11 & 4) == 0) {
                if (this.f88336C) {
                    this.f88437y.m92306h(true);
                }
            } else {
                this.f88437y.m92306h(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public /* synthetic */ void m92376V() {
        try {
            if (m92402I() && !m92403J()) {
                pause();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: W */
    public /* synthetic */ void m92377W(int i11) {
        if (i11 == -1) {
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.zmedia.view.j0
                public /* synthetic */ RunnableC17365j0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.this.m92376V();
                }
            });
        }
    }

    /* renamed from: X */
    public /* synthetic */ boolean m92378X(IMediaPlayer iMediaPlayer, int i11, int i12) {
        if (i11 == 0) {
            return false;
        }
        this.f88436x0 = i11;
        this.f88438y0 = i12;
        int i13 = this.f88414q;
        if ((i13 != 2 && (i13 != 3 || this.f88433w0)) || i11 != -10000) {
            m92409c0();
            return true;
        }
        this.f88436x0 = ZMediaPlayer.MEDIA_ERROR_Z_PLAYER;
        return true;
    }

    /* renamed from: Y */
    public /* synthetic */ void m92379Y(boolean z11) {
        m92419m0(false);
        if (z11) {
            m92429s0();
            this.f88437y.m92297U(false);
            this.f88437y.m92301Y(false);
            setLoadingViewImageInfo(null);
            return;
        }
        this.f88437y.m92301Y(true);
    }

    /* renamed from: Z */
    public /* synthetic */ void m92380Z(IMediaPlayer iMediaPlayer) {
        iMediaPlayer.reset();
        iMediaPlayer.release();
        this.f88395h0 = false;
        if (this.f88335B0) {
            this.f88426u.sendEmptyMessage(1);
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ void m92382a0(int i11) {
        this.f88437y.m92286J(i11);
    }

    /* renamed from: b0 */
    public /* synthetic */ void m92384b0(ValueAnimator valueAnimator) {
        View view;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f88428u1 = floatValue;
        InterfaceC17343o interfaceC17343o = this.f88434w1;
        if (interfaceC17343o != null) {
            interfaceC17343o.mo61908a(floatValue);
        }
        View view2 = this.f88425t1;
        if (view2 != null) {
            view2.setAlpha(this.f88428u1);
        }
        if (this.f88428u1 <= 0.0f && (view = this.f88425t1) != null) {
            removeView(view);
            this.f88425t1 = null;
        }
    }

    /* renamed from: q0 */
    private boolean m92396q0(String str) {
        Bitmap bitmap;
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            AbstractC23350e.m122777g("Delete fail file " + str, new Object[0]);
            return false;
        }
        Object obj = this.f88403l0;
        if (obj instanceof TextureView) {
            bitmap = ((TextureView) obj).getBitmap();
        } else {
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return false;
        }
        if (this.f88344G != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f88344G);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmap2 != null) {
                try {
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    fileOutputStream.flush();
                } finally {
                }
            }
            fileOutputStream.close();
            return true;
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: A */
    void m92397A() {
        if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW) {
            if (this.f88359N0 == null) {
                TableLayout tableLayout = new TableLayout(getContext());
                this.f88359N0 = tableLayout;
                tableLayout.setGravity(17);
                this.f88359N0.setBackgroundColor(getResources().getColor(C17395R.color.z_transparent_dark));
            }
            if (this.f88359N0.getParent() != null) {
                ((ViewGroup) this.f88359N0.getParent()).removeView(this.f88359N0);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13, -1);
            addView(this.f88359N0, layoutParams);
            this.f88357M0 = new C25324a(getContext(), this.f88359N0);
        }
    }

    /* renamed from: D */
    void m92398D() {
        this.f88410o1 = 2;
        setRender(2);
    }

    /* renamed from: E */
    void m92399E(Context context, AttributeSet attributeSet) {
        this.f88397i0 = getContext();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17395R.styleable.ZVideoView);
            try {
                int integer = obtainStyledAttributes.getInteger(C17395R.styleable.ZVideoView_controller_style, 0);
                this.f88429v = integer;
                if (integer != 0 && integer != 1 && integer != 2) {
                    this.f88429v = 0;
                }
                if (obtainStyledAttributes.hasValue(C17395R.styleable.ZVideoView_controller_layout)) {
                    this.f88432w = obtainStyledAttributes.getResourceId(C17395R.styleable.ZVideoView_controller_layout, C17395R.layout.zmediaplayer_controller);
                    this.f88435x = true;
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        setBackgroundColor(getResources().getColor(C17395R.color.black));
        m92398D();
        m92439z();
        setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.zing.zalo.zmedia.view.i0
            public /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC17363i0() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i11) {
                ZVideoView.this.m92375U(i11);
            }
        });
        this.f88348I = 0;
        this.f88350J = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        setCurrentState(0);
        this.f88417r = 0;
        TextView textView = new TextView(context);
        this.f88405m0 = textView;
        textView.setTextSize(24.0f);
        this.f88405m0.setGravity(17);
        addView(this.f88405m0, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    /* renamed from: F */
    public boolean m92400F(MotionEvent motionEvent) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            return videoController.m92317v(motionEvent);
        }
        return false;
    }

    /* renamed from: H */
    public boolean m92401H() {
        return this.f88338D;
    }

    /* renamed from: I */
    public boolean m92402I() {
        int i11;
        return (this.f88423t == null || (i11 = this.f88414q) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    /* renamed from: J */
    public boolean m92403J() {
        return this.f88341E0;
    }

    /* renamed from: K */
    public boolean m92404K() {
        return this.f88423t != null;
    }

    /* renamed from: L */
    public boolean m92405L() {
        boolean z11;
        boolean z12;
        if (this.f88355L0 == null) {
            return false;
        }
        ZMediaPlayerSettings.VideoConfig videoConfig = this.f88353K0;
        if (videoConfig != null && this.f88411p != null && videoConfig.getPriorityFormat() == 1 && !TextUtils.isEmpty(this.f88411p.f88621d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ZMediaPlayerSettings.VideoConfig videoConfig2 = this.f88353K0;
        if (videoConfig2 != null && videoConfig2.getPlayerType() == 1 && this.f88353K0.getPriorityFormat() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ZMediaPlayerSettings.VideoConfig videoConfig3 = this.f88353K0;
        if (videoConfig3 == null || videoConfig3.getPlayerType() != 0 || z11 || z12) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean m92406M(int i11) {
        return (this.f88414q == 4 && i11 == 2) ? false : true;
    }

    /* renamed from: N */
    public boolean m92407N(IMediaPlayer iMediaPlayer, int i11, int i12) {
        if ((iMediaPlayer instanceof ZMediaPlayer) && i11 == -10000 && i12 == -4040) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m92408O(IMediaPlayer iMediaPlayer, int i11, int i12) {
        if ((iMediaPlayer instanceof ZMediaPlayer) && i11 == -10000 && i12 == -4041) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.zmedia.view.m0.<init>(com.zing.zalo.zmedia.view.ZVideoView, boolean):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: c0 */
    void m92409c0() {
        /*
            r4 = this;
            com.zing.zalo.zmedia.player.IMediaPlayer$OnErrorListener r0 = r4.f88362P
            if (r0 == 0) goto Ld
            com.zing.zalo.zmedia.player.IMediaPlayer r1 = r4.f88423t
            int r2 = r4.f88436x0
            int r3 = r4.f88438y0
            r0.onError(r1, r2, r3)
        Ld:
            com.zing.zalo.zmedia.player.IMediaPlayer r0 = r4.f88423t
            int r1 = r4.f88436x0
            int r2 = r4.f88438y0
            boolean r0 = r4.m92407N(r0, r1, r2)
            r1 = 0
            r4.f88436x0 = r1
            r4.f88438y0 = r1
            r1 = -1
            r4.setCurrentState(r1)
            r4.f88417r = r1
            java.lang.Runnable r1 = r4.f88382a1
            r4.removeCallbacks(r1)
            com.zing.zalo.zmedia.view.VideoController r1 = r4.f88437y
            r1.m92303b0()
            com.zing.zalo.zmedia.view.VideoController r1 = r4.f88437y
            com.zing.zalo.zmedia.view.m0 r2 = new com.zing.zalo.zmedia.view.m0
            r2.<init>()
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.zmedia.view.ZVideoView.m92409c0():void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f88383b0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f88385c0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f88387d0;
    }

    /* renamed from: d0 */
    public void m92410d0() {
        C17391z c17391z = this.f88411p;
        boolean z11 = true;
        if (c17391z != null && this.f88420s != null) {
            if (this.f88353K0 == null) {
                return;
            }
            boolean z12 = false;
            m92412f0(false);
            if (this.f88395h0) {
                if (this.f88411p != null) {
                    this.f88335B0 = true;
                    return;
                }
                return;
            }
            this.f88426u.removeMessages(1);
            if (this.f88353K0.getPriorityFormat() == 1 && !TextUtils.isEmpty(this.f88411p.f88621d) && !"null".equalsIgnoreCase(this.f88411p.f88621d)) {
                z12 = true;
            }
            String str = this.f88411p.f88620c;
            if (!z12 && !TextUtils.isEmpty(str)) {
                z11 = z12;
            } else {
                str = this.f88411p.f88621d;
            }
            if (!TextUtils.isEmpty(str) && !"null".equalsIgnoreCase(str)) {
                m92368C(z11);
                return;
            }
            return;
        }
        if (c17391z != null) {
            this.f88335B0 = true;
        }
    }

    /* renamed from: e0 */
    public void m92411e0(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Open video with seek pos: ");
        sb2.append(i11);
        this.f88376W = i11;
        m92410d0();
    }

    /* renamed from: f0 */
    public void m92412f0(boolean z11) {
        PrecacheIndicatorView precacheIndicatorView;
        C25324a c25324a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Release :");
        sb2.append(z11);
        if (z11) {
            m92419m0(false);
        }
        setCurrentState(0);
        this.f88426u.removeMessages(1);
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null) {
            this.f88423t = null;
            if (z11 || this.f88417r == 4) {
                this.f88417r = 0;
            }
            this.f88395h0 = true;
            this.f88348I = 0;
            this.f88350J = 0;
            if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (c25324a = this.f88357M0) != null) {
                c25324a.m131159l(null);
            }
            AbstractC17356f.m92487a(new Runnable() { // from class: com.zing.zalo.zmedia.view.e0

                /* renamed from: q */
                public final /* synthetic */ IMediaPlayer f88503q;

                public /* synthetic */ RunnableC17355e0(IMediaPlayer iMediaPlayer2) {
                    r2 = iMediaPlayer2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.this.m92380Z(r2);
                }
            });
            this.f88401k0 = null;
        }
        InterfaceC16725a interfaceC16725a = this.f88403l0;
        if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
            this.f88403l0.getView().setAlpha(0.0f);
        }
        removeCallbacks(this.f88382a1);
        if (z11) {
            this.f88411p = null;
            VideoController videoController = this.f88437y;
            if (videoController != null) {
                videoController.m92288L();
            }
            this.f88376W = 0;
        }
        if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (precacheIndicatorView = this.f88367R0) != null) {
            precacheIndicatorView.m92486f();
        }
    }

    /* renamed from: g0 */
    public void m92413g0() {
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    Activity getActivity() {
        Activity activity = this.f88399j0;
        if (activity != null) {
            return activity;
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity2 = (Activity) context;
                this.f88399j0 = activity2;
                return activity2;
            }
        }
        return null;
    }

    AudioManager getAudioManager() {
        if (this.f88401k0 == null) {
            this.f88401k0 = (AudioManager) this.f88397i0.getSystemService("audio");
        }
        return this.f88401k0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f88423t != null) {
            return this.f88374V;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (this.f88423t != null && m92402I()) {
            return (int) this.f88423t.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentState() {
        return this.f88414q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        long j11;
        if (this.f88423t != null && m92402I()) {
            j11 = this.f88423t.getDuration();
        } else {
            C17391z c17391z = this.f88411p;
            if (c17391z != null) {
                j11 = c17391z.f88632o;
            } else {
                return -1;
            }
        }
        return (int) j11;
    }

    public RecyclingImageView getLoadingView() {
        return this.f88437y.f88210s.f88582v;
    }

    int getStatusBarHeight() {
        int i11;
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i11 = getResources().getDimensionPixelSize(identifier);
        } else {
            i11 = 0;
        }
        int i12 = C1580n1.f6524b.m8054f(C1580n1.m.m8117e()).f6231b;
        if (i12 > 0 && i12 != i11) {
            return i12;
        }
        return i11;
    }

    public C17391z getVideo() {
        return this.f88411p;
    }

    public VideoController getVideoController() {
        return this.f88437y;
    }

    public int getVideoFPS() {
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null && (iMediaPlayer instanceof ZMediaPlayer)) {
            return (int) ((ZMediaPlayer) iMediaPlayer).getVideoOutputFramesPerSecond();
        }
        return -1;
    }

    public float getVideoRatio() {
        return this.f88346H;
    }

    /* renamed from: h0 */
    public void m92414h0() {
        if (!this.f88341E0) {
            ZMediaPlayerSettings.PlayConfig playConfig = this.f88355L0;
            if (playConfig == null || !playConfig.isSilent()) {
                InterfaceC17350c interfaceC17350c = this.f88372U;
                if (interfaceC17350c != null) {
                    interfaceC17350c.mo92475c(this, this.f88384b1);
                } else {
                    getAudioManager().requestAudioFocus(null, 3, 2);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            m92410d0();
            this.f88335B0 = false;
        }
        return false;
    }

    /* renamed from: i0 */
    public void m92415i0() {
        this.f88393g0 = false;
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
        }
        this.f88437y.m92290N();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        if (this.f88423t != null && m92402I() && this.f88423t.isPlaying()) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public void m92416j0() {
        this.f88428u1 = 0.0f;
        View view = this.f88425t1;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        ValueAnimator valueAnimator = this.f88431v1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f88431v1 = null;
        }
    }

    /* renamed from: k0 */
    void m92417k0() {
        boolean z11;
        InterfaceC16725a interfaceC16725a = this.f88403l0;
        if (interfaceC16725a != null) {
            if (this.f88347H0 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC16725a.mo89168e(this.f88348I, this.f88350J, z11, this.f88349I0, this.f88351J0);
        }
    }

    /* renamed from: l0 */
    public void m92418l0(boolean z11) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            if (z11) {
                videoController.m92305g();
            } else {
                videoController.m92312p();
            }
        }
    }

    /* renamed from: m0 */
    public void m92419m0(boolean z11) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.m92298V(z11);
        }
    }

    /* renamed from: n */
    public void m92420n() {
        if (!this.f88341E0) {
            ZMediaPlayerSettings.PlayConfig playConfig = this.f88355L0;
            if (playConfig == null || !playConfig.isSilent()) {
                InterfaceC17350c interfaceC17350c = this.f88372U;
                if (interfaceC17350c != null) {
                    interfaceC17350c.mo92476d(this, this.f88384b1);
                } else {
                    getAudioManager().abandonAudioFocus(null);
                }
            }
        }
    }

    /* renamed from: n0 */
    public void m92421n0(boolean z11) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.m92299W(z11, false);
        }
    }

    /* renamed from: o0 */
    public Bitmap m92422o0() {
        Bitmap bitmap;
        Object obj = this.f88403l0;
        if (obj instanceof TextureView) {
            bitmap = ((TextureView) obj).getBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        if (this.f88344G != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f88344G);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        return bitmap;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (this.f88430v0) {
                this.f88332A = (ViewGroup) getParent();
                this.f88334B = getLayoutParams();
                this.f88430v0 = false;
            }
            if (this.f88440z0) {
                this.f88440z0 = false;
                if (this.f88437y.getOnFullScreenListener() != null) {
                    this.f88437y.getOnFullScreenListener().onClick(null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HandlerThreadC17390y.m92534d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size;
        int size2;
        RelativeLayout.LayoutParams layoutParams;
        float m92438y;
        if (this.f88338D) {
            int size3 = View.MeasureSpec.getSize(i11);
            int size4 = View.MeasureSpec.getSize(i12);
            float f11 = size3 / size4;
            this.f88416q1 = f11;
            float f12 = this.f88346H;
            if (f12 < f11) {
                FrameLayout.LayoutParams layoutParams2 = this.f88407n0;
                layoutParams2.height = size4;
                layoutParams2.width = (int) (size4 * f12);
            } else {
                FrameLayout.LayoutParams layoutParams3 = this.f88407n0;
                layoutParams3.width = size3;
                layoutParams3.height = (int) (size3 / f12);
            }
            super.onMeasure(i11, i12);
            return;
        }
        if (this.f88413p1) {
            if (this.f88354L) {
                m92438y = this.f88352K;
            } else {
                m92438y = m92438y(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            }
            float f13 = this.f88346H;
            if (f13 < m92438y) {
                this.f88416q1 = m92438y;
                int size5 = View.MeasureSpec.getSize(i11);
                int i13 = (int) (size5 / this.f88416q1);
                FrameLayout.LayoutParams layoutParams4 = this.f88407n0;
                layoutParams4.height = i13;
                layoutParams4.width = (int) (i13 * this.f88346H);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            }
            if (f13 > 1.7777778f) {
                this.f88416q1 = 1.7777778f;
                int size6 = View.MeasureSpec.getSize(i11);
                int i14 = (int) (size6 / this.f88416q1);
                FrameLayout.LayoutParams layoutParams5 = this.f88407n0;
                layoutParams5.width = size6;
                layoutParams5.height = (int) (size6 / this.f88346H);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            }
            this.f88416q1 = f13;
            int size7 = View.MeasureSpec.getSize(i11);
            int i15 = (int) (size7 / this.f88416q1);
            FrameLayout.LayoutParams layoutParams6 = this.f88407n0;
            layoutParams6.width = size7;
            layoutParams6.height = i15;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            return;
        }
        this.f88416q1 = this.f88419r1;
        int i16 = this.f88347H0;
        if ((i16 == 1 || i16 == 2) && (this.f88403l0 instanceof TextureView)) {
            size = View.MeasureSpec.getSize(i11);
            size2 = View.MeasureSpec.getSize(i12);
            this.f88349I0 = size;
            this.f88351J0 = size2;
            int i17 = this.f88347H0;
            if (i17 == 1) {
                m92426r(size, size2);
            } else if (i17 == 2) {
                m92435w(size, size2);
            }
        } else {
            size = View.MeasureSpec.getSize(i11);
            size2 = (int) (size / this.f88416q1);
            float f14 = this.f88346H;
            if (f14 < this.f88419r1) {
                FrameLayout.LayoutParams layoutParams7 = this.f88407n0;
                layoutParams7.height = size2;
                layoutParams7.width = (int) (size2 * f14);
            } else {
                FrameLayout.LayoutParams layoutParams8 = this.f88407n0;
                layoutParams8.width = size;
                layoutParams8.height = (int) (size / f14);
            }
            VideoController videoController = this.f88437y;
            if (videoController != null && (layoutParams = this.f88409o0) != null) {
                FrameLayout.LayoutParams layoutParams9 = this.f88407n0;
                layoutParams.width = layoutParams9.width;
                layoutParams.height = layoutParams9.height;
                videoController.setLoadingViewLayoutParams(layoutParams);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* renamed from: p */
    void m92423p() {
        if (this.f88425t1 == null) {
            this.f88425t1 = new View(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-2145707237);
            gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
            this.f88425t1.setBackground(gradientDrawable);
            addView(this.f88425t1, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: p0 */
    public void m92424p0(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        int i11;
        if (this.f88378X0 != 0) {
            if (m92396q0(str)) {
                i11 = 0;
            } else {
                i11 = -1;
            }
            post(new Runnable() { // from class: com.zing.zalo.zmedia.view.d0

                /* renamed from: q */
                public final /* synthetic */ int f88494q;

                public /* synthetic */ RunnableC17353d0(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZVideoView.this.m92382a0(r2);
                }
            });
            return;
        }
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer instanceof ZMediaPlayer) {
            ((ZMediaPlayer) iMediaPlayer).snapshot(videoConfig, str);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (m92402I()) {
            IMediaPlayer iMediaPlayer = this.f88423t;
            if (iMediaPlayer != null && iMediaPlayer.isPlaying()) {
                this.f88423t.pause();
                setCurrentState(4);
            }
            this.f88417r = 0;
        } else if (this.f88414q == 1) {
            this.f88417r = 4;
        }
        m92419m0(false);
        this.f88437y.m92295S(true);
    }

    /* renamed from: q */
    void m92425q(IMediaPlayer iMediaPlayer, InterfaceC16725a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            iMediaPlayer.setSurface(bVar.mo89170b());
        }
    }

    /* renamed from: r */
    void m92426r(int i11, int i12) {
        int i13;
        int i14;
        float f11;
        if (this.f88348I > 0 && this.f88350J > 0) {
            float f12 = this.f88346H;
            if (f12 < this.f88419r1) {
                i14 = (int) (i11 / f12);
                i13 = i11;
            } else {
                i13 = (int) (i12 * f12);
                i14 = i12;
            }
            float f13 = 1.0f;
            if (i13 >= i11 && i14 >= i12) {
                f11 = (i14 * 1.0f) / i12;
                f13 = (i13 * 1.0f) / i11;
            } else if (i13 <= i11 && i14 <= i12) {
                f11 = (i11 * 1.0f) / i13;
                f13 = (i12 * 1.0f) / i14;
            } else if (i11 >= i13) {
                f11 = ((i11 * 1.0f) / i13) / ((i12 * 1.0f) / i14);
            } else {
                if (i12 >= i14) {
                    f13 = ((i12 * 1.0f) / i14) / ((i11 * 1.0f) / i13);
                }
                f11 = 1.0f;
            }
            int i15 = i11 / 2;
            int i16 = i12 / 2;
            Matrix matrix = new Matrix();
            int i17 = this.f88344G;
            if (i17 != 90 && i17 != 270) {
                matrix.setScale(f13, f11, i15, i16);
            } else {
                matrix.setScale(f11, f13, i16, i15);
            }
            FrameLayout.LayoutParams layoutParams = this.f88407n0;
            layoutParams.width = i11;
            layoutParams.height = i12;
            Object obj = this.f88403l0;
            if (obj instanceof TextureView) {
                ((TextureView) obj).setTransform(matrix);
            }
        }
    }

    /* renamed from: r0 */
    public void m92427r0(float f11) {
        this.f88428u1 = f11;
        if (this.f88431v1 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f88431v1 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f88431v1.setDuration(500L);
            this.f88431v1.setCurrentPlayTime((1.0f - f11) * 500.0f);
            this.f88431v1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.zmedia.view.f0
                public /* synthetic */ C17357f0() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ZVideoView.this.m92384b0(valueAnimator);
                }
            });
        }
        this.f88431v1.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* renamed from: s */
    public IMediaPlayer m92428s(boolean z11) {
        long j11;
        String str;
        ?? r92;
        long j12;
        ZMediaPlayerSettings.PlayConfig playConfig;
        ZMediaPlayerSettings.PlayConfig playConfig2;
        ZMediaPlayerSettings.PlayConfig playConfig3;
        ZMediaPlayerSettings.PlayConfig playConfig4;
        ZMediaPlayerSettings.PlayConfig playConfig5;
        ZMediaPlayerSettings.PlayConfig playConfig6;
        ZMediaPlayerSettings.PlayConfig playConfig7;
        int i11;
        ZMediaPlayerSettings.VideoConfig videoConfig = this.f88353K0;
        ZMediaPlayer zMediaPlayer = null;
        if (videoConfig == null) {
            return null;
        }
        if (videoConfig.getPlayerType() != 0) {
            if (this.f88411p != null) {
                if (this.f88380Z0) {
                    this.f88423t.reset();
                    this.f88423t.release();
                }
                zMediaPlayer = new ZMediaPlayer();
                if (!ZMediaPlayer.isLibrariesLoaded()) {
                    AndroidMediaPlayer androidMediaPlayer = new AndroidMediaPlayer();
                    this.f88391f0 = true;
                    return androidMediaPlayer;
                }
                if (ZMediaPlayerSettings.AUDIO_DECODER_OPENSLES) {
                    j11 = 1;
                } else {
                    j11 = 0;
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OPENSLES, j11);
                if (z11 || AbstractC24827h.m129083k(Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT))) {
                    AbstractC20110a.m104542k(8, "Video 8K: createPlayer: forceUseProxy = " + z11, new Object[0]);
                    this.f88378X0 = 1;
                }
                ZMediaPlayerSettings.PlayConfig playConfig8 = this.f88355L0;
                if (playConfig8 != null) {
                    if (playConfig8.isForceUsingMediaCodec()) {
                        i11 = 1;
                    } else {
                        i11 = this.f88378X0;
                    }
                    this.f88378X0 = i11;
                }
                if (this.f88378X0 == 1 && ((ZMediaPlayerSettings.ENABLE_FEATURE_MASK && (playConfig7 = this.f88355L0) != null && playConfig7.getEnableMask()) || ((ZMediaPlayerSettings.ENABLE_FEATURE_ROUND_CORNER && (playConfig6 = this.f88355L0) != null && playConfig6.getEnableCornerRadius()) || (ZMediaPlayerSettings.ENABLE_FEATURE_BLUR_TOP_BOTTOM && (playConfig5 = this.f88355L0) != null && playConfig5.getEnableBlurTopBottom())))) {
                    this.f88378X0 = 0;
                }
                if (this.f88378X0 == 1 && ZMediaPlayerSettings.ENABLE_FEATURE_HDR) {
                    if (Build.VERSION.SDK_INT >= 33 && AbstractC24825f.m129071g(CoreUtility.getAppContext()) && AbstractC24825f.m129069e(CoreUtility.getAppContext()) && AbstractC24825f.m129070f(CoreUtility.getAppContext())) {
                        this.f88378X0 = 1;
                    } else {
                        this.f88378X0 = 0;
                        this.f88379Y0 = 0;
                    }
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC, this.f88378X0);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE, 0L);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE, this.f88378X0);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, ZMediaPlayerSettings.getPixelFormatWhitelist(-1));
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FRAME_DROP, 1L);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PACKET_BUFFERING, 1L);
                int i12 = this.f88376W;
                if (i12 > 0) {
                    str = ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE;
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SEEK_AT_START, i12);
                    this.f88381a0 = this.f88376W;
                    this.f88376W = 0;
                } else {
                    str = ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE;
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_ENABLE_ACCURATE_SEEK, 0L);
                String str2 = Build.MANUFACTURER;
                String str3 = Build.MODEL;
                int i13 = Build.VERSION.SDK_INT;
                if (AbstractC24827h.m129084l(str2, str3, Integer.valueOf(i13))) {
                    this.f88379Y0 = 1;
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SOFTWARE_DECODE, this.f88379Y0);
                if (this.f88411p.f88620c.toString().lastIndexOf("gif") > 0) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_IS_GIF, 1L);
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_LIVE_STREAM && this.f88355L0.getEnableLiveStream()) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_LIVE_STREAM, 1L);
                } else {
                    zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_PATH, ZMediaPlayerSettings.getCacheDir(this.f88353K0.getPlayerSection()));
                    zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_OID, this.f88411p.f88631n);
                    zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_INDEX, Math.max(this.f88411p.f88633p, 0));
                    zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_SECTION, this.f88353K0.getPlayerSection());
                }
                ZMediaPlayerSettings.PlayConfig playConfig9 = this.f88355L0;
                if (playConfig9 != null && playConfig9.isSilent()) {
                    zMediaPlayer.setVolume(0.0f, 0.0f);
                }
                ZMediaPlayerSettings.PlayConfig playConfig10 = this.f88355L0;
                if (playConfig10 != null) {
                    r92 = playConfig10.isAutoStartOnPrepared();
                } else {
                    r92 = 1;
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_START_ON_PREPARED, (long) r92);
                ZMediaPlayerSettings.PlayConfig playConfig11 = this.f88355L0;
                if (playConfig11 != null) {
                    setLooping(playConfig11.isLoopInfinite());
                    zMediaPlayer.setLooping(this.f88355L0.isLoopInfinite());
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_LOADING_TIMEOUT, this.f88355L0.getTimeOut());
                }
                if (this.f88353K0 != null) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MAX_BUFFER_SIZE, r7.getMaxBufferSizeInMB());
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MIN_FRAMES, this.f88353K0.getMinPacketBuffer());
                }
                ZMediaPlayerSettings.VideoConfig videoConfig2 = this.f88353K0;
                if (videoConfig2 != null && (videoConfig2.getPlayerSection() == 6 || this.f88411p.f88629l == 6)) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_AV_SYNC_TYPE, 0L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, ZMediaPlayerSettings.getPixelFormatWhitelist(1));
                    if (HandlerThreadC17390y.m92532b().m92535a(CoreUtility.getAppContext()) != 1) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MAX_BUFFER_SIZE, this.f88353K0.getMaxBufferSizeInMB());
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MIN_FRAMES, this.f88353K0.getMinPacketBuffer());
                    }
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_HDR) {
                    if (i13 >= 33) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 1L);
                    } else if (i13 < 33 && i13 >= 26) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 1L);
                    } else {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 0L);
                    }
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_DISPLAY_MAX_LUMINANCE, String.valueOf(AbstractC24825f.m129068d(CoreUtility.getAppContext())));
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_CURRENT_DISPLAY_LUMINANCE, new DecimalFormat("#").format((AbstractC24825f.m129066b(CoreUtility.getAppContext()) * AbstractC24825f.m129068d(CoreUtility.getAppContext())) / AbstractC24825f.m129067c(CoreUtility.getAppContext())));
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 844318047L);
                }
                ZMediaPlayerSettings.PlayConfig playConfig12 = this.f88355L0;
                if (playConfig12 != null && playConfig12.getEnableSpeedMode()) {
                    j12 = 1;
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_AUDIO, 1L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_AV_SYNC_TYPE, 1L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC, 0L);
                    zMediaPlayer.setOption(4, str, 0L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE, 0L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SOFTWARE_DECODE, 1L);
                } else {
                    j12 = 1;
                }
                ZMediaPlayerSettings.PlayConfig playConfig13 = this.f88355L0;
                if (playConfig13 != null && playConfig13.getEnablePlayInRange()) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_PLAY_IN_RANGE, j12);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PLAY_START_TIME, this.f88355L0.getEnablePlayInRangeStartTime() * 1000);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PLAY_IN_DURATION, this.f88355L0.getEnablePlayInRangeDuration() * 1000);
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_VOLUME_FADE_INOUT && (playConfig4 = this.f88355L0) != null && playConfig4.getEnableVolumeFadeInOut() && !this.f88355L0.isSilent()) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_STARTUP_VOLUME, 100L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_VOLUME_FADE_INOUT_TIME, 2L);
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_MASK && (playConfig3 = this.f88355L0) != null && playConfig3.getEnableMask()) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_MASK, 1L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_BLUR, 0L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 844318047L);
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_ROUND_CORNER && (playConfig2 = this.f88355L0) != null && playConfig2.getEnableCornerRadius()) {
                    zMediaPlayer.setOptionDp(4, ZMediaPlayer.OPTION_PLAYER_KEY_CORNER_RADIUS, 10L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 844318047L);
                }
                if (ZMediaPlayerSettings.ENABLE_FEATURE_BLUR_TOP_BOTTOM && (playConfig = this.f88355L0) != null && playConfig.getEnableBlurTopBottom()) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_BLUR, 1L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_BLUR_LEVEL, this.f88355L0.getEnableBlurTopBottomLevel());
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FEATURE_MASK, 0L);
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 844318047L);
                }
            }
            return zMediaPlayer;
        }
        return new AndroidMediaPlayer();
    }

    /* renamed from: s0 */
    public void m92429s0() {
        int i11 = this.f88414q;
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
            m92412f0(true);
        } else {
            m92430t0();
        }
        this.f88437y.m92312p();
        m92419m0(false);
        this.f88437y.m92301Y(false);
        this.f88437y.m92300X(true);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i11) {
        if (i11 < getCurrentPosition()) {
            this.f88373U0++;
        } else {
            this.f88371T0++;
        }
        if (i11 >= 0) {
            if (this.f88423t != null && m92402I()) {
                this.f88424t0 = System.currentTimeMillis();
                this.f88423t.seekTo(i11);
                this.f88376W = 0;
                return;
            }
            this.f88376W = i11;
        }
    }

    public void setAllowAdaptiveShowControls(boolean z11) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.setAllowAdaptiveShowControls(z11);
        }
    }

    public void setAudioFocusControl(InterfaceC17350c interfaceC17350c) {
        this.f88372U = interfaceC17350c;
    }

    public void setCurrentState(int i11) {
        boolean z11 = false;
        if (!m92406M(i11)) {
            AbstractC20110a.m104538g("Error change state video " + this.f88414q + " to " + i11, new Object[0]);
            return;
        }
        this.f88414q = i11;
        InterfaceC17345q interfaceC17345q = this.f88370T;
        if (interfaceC17345q != null) {
            interfaceC17345q.mo44076D(i11);
        }
        if (i11 == 0 || i11 == 5) {
            this.f88433w0 = false;
            this.f88436x0 = 0;
        }
        int i12 = this.f88414q;
        if (i12 != 1 && i12 != 2 && i12 != 3) {
            m92420n();
        } else {
            m92414h0();
        }
        if (isPlaying() && m92369G()) {
            z11 = true;
        }
        setKeepScreenOn(z11);
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.m92287K();
        }
    }

    public void setDimAlpha(float f11) {
        this.f88428u1 = f11;
        m92423p();
        InterfaceC17343o interfaceC17343o = this.f88434w1;
        if (interfaceC17343o != null) {
            interfaceC17343o.mo61908a(this.f88428u1);
        }
        View view = this.f88425t1;
        if (view != null) {
            view.setAlpha(f11);
        }
    }

    public void setEnableBlurThumb(boolean z11) {
        this.f88363P0 = z11;
    }

    public void setEnablePreciseDimension(boolean z11) {
        this.f88365Q0 = z11;
    }

    public void setExcludeSystemDecorationSize(boolean z11) {
        if (this.f88356M != z11) {
            this.f88356M = z11;
            requestLayout();
        }
    }

    public void setForceHideController(boolean z11) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.setForceHideController(z11);
        }
    }

    public void setFullScreen(boolean z11) {
        this.f88338D = z11;
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.setFullScreen(z11);
        }
        if (this.f88338D) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(13, -1);
            setLayoutParams(layoutParams);
            View view = (View) getParent();
            View view2 = (View) view.getParent();
            view.setLayoutParams(layoutParams2);
            view2.setLayoutParams(layoutParams3);
            requestLayout();
            return;
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(13, -1);
        View view3 = (View) getParent();
        View view4 = (View) view3.getParent();
        setLayoutParams(layoutParams4);
        view3.setLayoutParams(layoutParams5);
        view4.setLayoutParams(layoutParams6);
        requestLayout();
        if (this.f88332A != null) {
            this.f88437y.m92292P(0, 0, 0, 0);
        }
    }

    public void setIsFocusing(boolean z11) {
        this.f88336C = z11;
        this.f88437y.setIsFocusing(z11);
    }

    public void setLoadingViewImageInfo(C3979l c3979l) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.setLoadingViewImageInfo(c3979l);
        }
        if (this.f88355L0 == ZMediaPlayerSettings.getPlayConfig(5) && c3979l != null && c3979l.m18839c() != null) {
            setVideoRatio(c3979l.m18839c().getWidth() / c3979l.m18839c().getHeight());
        }
    }

    public void setLoadingViewScaleType(ImageView.ScaleType scaleType) {
        VideoController videoController = this.f88437y;
        if (videoController != null) {
            videoController.setLoadingViewScaleType(scaleType);
        }
    }

    public void setLooping(boolean z11) {
        this.f88337C0 = z11;
    }

    public void setMinRatio(float f11) {
        if (this.f88352K != f11) {
            this.f88352K = f11;
            requestLayout();
        }
    }

    public void setMute(boolean z11) {
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null) {
            if (z11) {
                iMediaPlayer.setVolume(0.0f, 0.0f);
                m92420n();
                this.f88341E0 = true;
            } else {
                iMediaPlayer.setVolume(100.0f, 100.0f);
                this.f88341E0 = false;
                m92414h0();
            }
        }
        this.f88437y.setMute(this.f88341E0);
    }

    public void setOnCacheListener(AbstractC17297a.b bVar) {
        this.f88345G0 = bVar;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f88358N = onCompletionListener;
    }

    public void setOnDimAlphaChangedListener(InterfaceC17343o interfaceC17343o) {
        this.f88434w1 = interfaceC17343o;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f88362P = onErrorListener;
    }

    public void setOnFullScreenChangedListener(InterfaceC17344p interfaceC17344p) {
        this.f88368S = interfaceC17344p;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f88364Q = onInfoListener;
    }

    public void setOnPlayerStateChangedListener(InterfaceC17345q interfaceC17345q) {
        this.f88370T = interfaceC17345q;
    }

    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f88366R = onSeekCompleteListener;
    }

    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.f88422s1 = onVideoSizeChangedListener;
    }

    public void setPlayConfig(ZMediaPlayerSettings.PlayConfig playConfig) {
        this.f88355L0 = playConfig;
        if (playConfig != null) {
            setLooping(playConfig.isLoopInfinite());
        }
    }

    public void setReInitNativePlayer(boolean z11) {
        this.f88380Z0 = z11;
    }

    public void setRender(int i11) {
        if (i11 != 0) {
            if (i11 != 2) {
                AbstractC23350e.m122774d("ZVideoView", String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i11)));
                return;
            } else {
                setRenderView(new VideoTextureRenderView(getContext()));
                return;
            }
        }
        setRenderView(null);
    }

    public void setRenderView(InterfaceC16725a interfaceC16725a) {
        int i11;
        if (this.f88403l0 != null) {
            IMediaPlayer iMediaPlayer = this.f88423t;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f88403l0.getView();
            this.f88403l0.mo89167d(this.f88404l1);
            this.f88403l0 = null;
            removeView(view);
        }
        if (interfaceC16725a == null) {
            return;
        }
        this.f88403l0 = interfaceC16725a;
        interfaceC16725a.setAspectRatio(this.f88408n1);
        if (this.f88348I > 0 && this.f88350J > 0) {
            m92417k0();
        }
        int i12 = this.f88412p0;
        if (i12 > 0 && (i11 = this.f88415q0) > 0) {
            interfaceC16725a.mo89164a(i12, i11);
        }
        View view2 = this.f88403l0.getView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        this.f88407n0 = layoutParams;
        view2.setLayoutParams(layoutParams);
        addView(view2);
        this.f88403l0.mo89165b(this.f88404l1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        this.f88409o0 = layoutParams2;
        layoutParams2.addRule(13, -1);
        if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW) {
            m92397A();
        }
    }

    public void setRoundCorner(boolean z11) {
        this.f88339D0 = z11;
        if (z11) {
            setRoundCorner(AbstractC17358g.m92489b(getContext(), 10.0f));
        } else {
            setOutlineProvider(null);
            setClipToOutline(false);
        }
    }

    public void setSkipShowControlWhenStart(boolean z11) {
        this.f88369S0 = z11;
    }

    public void setStateSpeaker(boolean z11) {
        setMute(!z11);
    }

    public void setTrimmed(boolean z11) {
        this.f88343F0 = z11;
    }

    public void setUseMinRatio(boolean z11) {
        if (this.f88354L != z11) {
            this.f88354L = z11;
            requestLayout();
        }
    }

    public void setUseVideoRatio(boolean z11) {
        this.f88413p1 = z11;
    }

    public void setVideoPlayerMode(int i11) {
        this.f88347H0 = i11;
        InterfaceC16725a interfaceC16725a = this.f88403l0;
        if (interfaceC16725a != null && (interfaceC16725a instanceof TextureView)) {
            ((TextureView) this.f88403l0).setTransform(new Matrix());
        }
        m92417k0();
    }

    public void setVideoRatio(float f11) {
        if (f11 <= 0.0f || f11 == this.f88346H) {
            return;
        }
        this.f88346H = f11;
    }

    public void setViewRatio(float f11) {
        if (f11 <= 0.0f) {
            return;
        }
        this.f88419r1 = f11;
        requestLayout();
    }

    public void setVolume(float f11) {
        this.f88406m1 = f11;
        IMediaPlayer iMediaPlayer = this.f88423t;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(f11, f11);
        }
    }

    public void setZVideo(C17391z c17391z) {
        RelativeLayout.LayoutParams layoutParams;
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        C17391z c17391z2 = this.f88411p;
        if (c17391z2 == null || (c17391z != null && !c17391z2.equals(c17391z))) {
            this.f88411p = c17391z;
            VideoController videoController = this.f88437y;
            if (videoController != null && (viewOnClickListenerC17374o = videoController.f88210s) != null) {
                viewOnClickListenerC17374o.mo92479y(c17391z);
                this.f88437y.f88210s.m92503D(true, false);
            }
            C17391z c17391z3 = this.f88411p;
            if (c17391z3 != null) {
                setVideoRatio(c17391z3.f88626i);
            }
            m92412f0(false);
            VideoController videoController2 = this.f88437y;
            if (videoController2 != null && (layoutParams = this.f88409o0) != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                videoController2.setLoadingViewLayoutParams(layoutParams);
            }
        }
        ZMediaPlayerSettings zMediaPlayerSettings = ZMediaPlayerSettings.INSTANCE;
        this.f88353K0 = ZMediaPlayerSettings.getVideoConfig(this.f88411p.f88629l);
        if (this.f88355L0 == null) {
            this.f88355L0 = ZMediaPlayerSettings.getPlayConfig(0);
        }
        if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && this.f88361O0) {
            PrecacheIndicatorView precacheIndicatorView = this.f88367R0;
            if (precacheIndicatorView == null) {
                this.f88367R0 = new PrecacheIndicatorView(getContext(), this.f88411p, this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, 50);
                layoutParams2.addRule(10);
                addView(this.f88367R0, layoutParams2);
            } else {
                precacheIndicatorView.setVideo(this.f88411p);
            }
        }
        ZMediaPlayerSettings.VideoConfig videoConfig = this.f88353K0;
        if (videoConfig != null && videoConfig.isZaloPlayer()) {
            HandlerThreadC17390y.m92533c(CoreUtility.getAppContext());
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (this.f88423t != null && m92402I()) {
            this.f88423t.start();
            setCurrentState(3);
            this.f88335B0 = false;
            this.f88417r = 0;
            return;
        }
        if (this.f88414q == 1) {
            this.f88417r = 3;
        }
    }

    /* renamed from: t0 */
    public void m92430t0() {
        C25324a c25324a;
        if (this.f88423t != null) {
            if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW && (c25324a = this.f88357M0) != null) {
                c25324a.m131159l(null);
            }
            this.f88423t.stop();
            this.f88423t.setDisplay(null);
            m92412f0(false);
        }
    }

    /* renamed from: u */
    protected VideoController m92431u(int i11) {
        if (i11 == 1) {
            return new InlineVideoController(this.f88397i0);
        }
        if (i11 == 2) {
            return new MiniPlayerVideoController(this.f88397i0);
        }
        return new VideoController(this.f88397i0);
    }

    /* renamed from: u0 */
    public C23669z m92432u0(int i11) {
        C17391z c17391z;
        int i12;
        int i13;
        boolean z11;
        int intValue;
        C23651h c23651h = null;
        try {
            IMediaPlayer iMediaPlayer = this.f88423t;
            if (iMediaPlayer != null && (c17391z = this.f88411p) != null) {
                int i14 = c17391z.f88629l;
                if (i11 != 0) {
                    i12 = this.f88371T0;
                    i13 = this.f88373U0;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int round = Math.round(((float) iMediaPlayer.getDuration()) / 1000.0f);
                int round2 = Math.round(getCurrentPosition() / 1000.0f);
                if (this.f88377W0.get(this.f88411p.f88618a) != null && ((Boolean) this.f88377W0.get(this.f88411p.f88618a)).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f88375V0.put(this.f88411p.f88618a, 0);
                    round2 = round;
                } else {
                    if (this.f88375V0.get(this.f88411p.f88618a) == null) {
                        intValue = 0;
                    } else {
                        intValue = ((Integer) this.f88375V0.get(this.f88411p.f88618a)).intValue();
                    }
                    if (round2 - intValue < 2) {
                        return null;
                    }
                }
                if (!z11) {
                    this.f88375V0.put(this.f88411p.f88618a, Integer.valueOf(round2));
                }
                this.f88377W0.put(this.f88411p.f88618a, Boolean.FALSE);
                C17391z c17391z2 = this.f88411p;
                C23651h m123961i = C23651h.m123961i(10, String.valueOf(i14), String.valueOf(round), String.valueOf(round2), String.valueOf(i12), String.valueOf(i13), String.valueOf(i11), c17391z2.f88631n, c17391z2.f88618a);
                if (m123961i == null) {
                    return null;
                }
                try {
                    m123961i.f114656c = System.currentTimeMillis();
                    m123961i.f114654a = 3;
                    m123961i.f114655b = 1;
                    m123961i.f114657d = 10;
                    return m123961i;
                } catch (Exception e11) {
                    e = e11;
                    c23651h = m123961i;
                    e.printStackTrace();
                    return c23651h;
                }
            }
            return null;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: v */
    public void m92433v() {
        this.f88437y.m92310m();
    }

    /* renamed from: v0 */
    public void m92434v0() {
        if (this.f88393g0) {
            try {
                int i11 = this.f88414q;
                if (i11 != -1 && i11 != 0 && i11 != 1) {
                    seekTo(getCurrentPosition());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w */
    void m92435w(int i11, int i12) {
        RelativeLayout.LayoutParams layoutParams;
        if (i11 > 0 && i12 > 0) {
            float f11 = i11;
            float f12 = i12;
            float f13 = (1.0f * f11) / f12;
            float f14 = this.f88346H;
            if (f14 < f13) {
                i11 = (int) (f12 * f14);
            } else {
                i12 = (int) (f11 / f14);
            }
            VideoController videoController = this.f88437y;
            if (videoController != null && (layoutParams = this.f88409o0) != null) {
                layoutParams.width = i11;
                layoutParams.height = i12;
                videoController.setLoadingViewLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: w0 */
    void m92436w0() {
        m92418l0(true);
        int i11 = this.f88414q;
        if (i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6) {
            VideoController videoController = this.f88437y;
            if (videoController != null && this.f88411p != null) {
                videoController.m92299W(true, false);
                return;
            }
            return;
        }
        VideoController videoController2 = this.f88437y;
        if (videoController2 != null) {
            videoController2.m92299W(false, false);
        }
    }

    /* renamed from: x */
    int m92437x(int i11) {
        return i11 != 1 ? i11 != 2 ? C17395R.layout.zmediaplayer_controller : C17395R.layout.mini_video_controller : C17395R.layout.inline_video_controller;
    }

    /* renamed from: y */
    float m92438y(int i11, int i12) {
        if (i11 > 0 && i12 > 0 && !this.f88356M) {
            return i11 / i12;
        }
        DisplayMetrics displayMetrics = this.f88397i0.getResources().getDisplayMetrics();
        int i13 = displayMetrics.widthPixels;
        int i14 = displayMetrics.heightPixels;
        if (this.f88356M) {
            i14 -= getStatusBarHeight();
        }
        return i13 / i14;
    }

    /* renamed from: z */
    void m92439z() {
        boolean z11;
        this.f88437y = m92431u(this.f88429v);
        int m92437x = m92437x(this.f88429v);
        if (this.f88435x) {
            m92437x = this.f88432w;
        }
        this.f88437y.m92316u(m92437x);
        VideoController videoController = this.f88437y;
        if (getActivity() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        videoController.setEnableFullScreen(z11);
        this.f88437y.setLoadingViewLayoutParams(this.f88409o0);
        this.f88439z = new FrameLayout.LayoutParams(-1, -1, 80);
        this.f88437y.setOnFullScreenClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zmedia.view.b0
            public /* synthetic */ ViewOnClickListenerC17349b0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZVideoView.this.m92370P(view);
            }
        });
        this.f88437y.setRetryListener(new View.OnClickListener() { // from class: com.zing.zalo.zmedia.view.c0
            public /* synthetic */ ViewOnClickListenerC17351c0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZVideoView.this.m92371Q(view);
            }
        });
        addView(this.f88437y, this.f88439z);
        this.f88437y.m92313q(false);
        this.f88437y.setMediaPlayer(this);
    }

    public void setRoundCorner(int i11) {
        this.f88339D0 = true;
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        setOutlineProvider(new C17333e(i11));
        setClipToOutline(true);
    }
}
