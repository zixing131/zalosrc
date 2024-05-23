package com.zing.zalo.zmedia.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.C1580n1;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.uidrawing.widget.video.InterfaceC16725a;
import com.zing.zalo.uidrawing.widget.video.VideoTextureRenderView;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.player.ZTimedText;
import com.zing.zalo.zmedia.view.ZGifView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Locale;
import mm0.AbstractC23350e;

/* loaded from: classes7.dex */
public class ZGifView extends FrameLayout implements MediaController.MediaPlayerControl, Handler.Callback {

    /* renamed from: i1 */
    static final int[] f88221i1 = {0, 1, 2, 4, 5};

    /* renamed from: A */
    ViewGroup.LayoutParams f88222A;

    /* renamed from: A0 */
    boolean f88223A0;

    /* renamed from: B */
    boolean f88224B;

    /* renamed from: B0 */
    boolean f88225B0;

    /* renamed from: C */
    boolean f88226C;

    /* renamed from: C0 */
    boolean f88227C0;

    /* renamed from: D */
    int f88228D;

    /* renamed from: D0 */
    AbstractC17297a.b f88229D0;

    /* renamed from: E */
    int f88230E;

    /* renamed from: E0 */
    int f88231E0;

    /* renamed from: F */
    int f88232F;

    /* renamed from: F0 */
    int f88233F0;

    /* renamed from: G */
    float f88234G;

    /* renamed from: G0 */
    int f88235G0;

    /* renamed from: H */
    int f88236H;

    /* renamed from: H0 */
    ZMediaPlayerSettings.VideoConfig f88237H0;

    /* renamed from: I */
    int f88238I;

    /* renamed from: I0 */
    protected ZMediaPlayerSettings.PlayConfig f88239I0;

    /* renamed from: J */
    boolean f88240J;

    /* renamed from: J0 */
    boolean f88241J0;

    /* renamed from: K */
    IMediaPlayer.OnCompletionListener f88242K;

    /* renamed from: K0 */
    int f88243K0;

    /* renamed from: L */
    IMediaPlayer.OnPreparedListener f88244L;

    /* renamed from: L0 */
    int f88245L0;

    /* renamed from: M */
    IMediaPlayer.OnErrorListener f88246M;

    /* renamed from: M0 */
    HashMap f88247M0;

    /* renamed from: N */
    IMediaPlayer.OnInfoListener f88248N;

    /* renamed from: N0 */
    HashMap f88249N0;

    /* renamed from: O */
    IMediaPlayer.OnSeekCompleteListener f88250O;

    /* renamed from: O0 */
    Runnable f88251O0;

    /* renamed from: P */
    InterfaceC17350c f88252P;

    /* renamed from: P0 */
    IMediaPlayer.OnVideoSizeChangedListener f88253P0;

    /* renamed from: Q */
    int f88254Q;

    /* renamed from: Q0 */
    IMediaPlayer.OnPreparedListener f88255Q0;

    /* renamed from: R */
    int f88256R;

    /* renamed from: R0 */
    IMediaPlayer.OnCompletionListener f88257R0;

    /* renamed from: S */
    boolean f88258S;

    /* renamed from: S0 */
    IMediaPlayer.OnInfoListener f88259S0;

    /* renamed from: T */
    boolean f88260T;

    /* renamed from: T0 */
    IMediaPlayer.OnErrorListener f88261T0;

    /* renamed from: U */
    boolean f88262U;

    /* renamed from: U0 */
    IMediaPlayer.OnBufferingUpdateListener f88263U0;

    /* renamed from: V */
    boolean f88264V;

    /* renamed from: V0 */
    IMediaPlayer.OnSeekCompleteListener f88265V0;

    /* renamed from: W */
    boolean f88266W;

    /* renamed from: W0 */
    IMediaPlayer.OnTimedTextListener f88267W0;

    /* renamed from: X0 */
    IMediaPlayer.OnStateChangedListener f88268X0;

    /* renamed from: Y0 */
    InterfaceC16725a.a f88269Y0;

    /* renamed from: Z0 */
    float f88270Z0;

    /* renamed from: a0 */
    boolean f88271a0;

    /* renamed from: a1 */
    int f88272a1;

    /* renamed from: b0 */
    boolean f88273b0;

    /* renamed from: b1 */
    int f88274b1;

    /* renamed from: c0 */
    Context f88275c0;

    /* renamed from: c1 */
    boolean f88276c1;

    /* renamed from: d0 */
    Activity f88277d0;

    /* renamed from: d1 */
    float f88278d1;

    /* renamed from: e0 */
    AudioManager f88279e0;

    /* renamed from: e1 */
    float f88280e1;

    /* renamed from: f0 */
    InterfaceC16725a f88281f0;

    /* renamed from: f1 */
    IMediaPlayer.OnVideoSizeChangedListener f88282f1;

    /* renamed from: g0 */
    TextView f88283g0;

    /* renamed from: g1 */
    View f88284g1;

    /* renamed from: h0 */
    FrameLayout.LayoutParams f88285h0;

    /* renamed from: h1 */
    float f88286h1;

    /* renamed from: i0 */
    RelativeLayout.LayoutParams f88287i0;

    /* renamed from: j0 */
    int f88288j0;

    /* renamed from: k0 */
    int f88289k0;

    /* renamed from: l0 */
    long f88290l0;

    /* renamed from: m0 */
    long f88291m0;

    /* renamed from: n0 */
    long f88292n0;

    /* renamed from: o0 */
    long f88293o0;

    /* renamed from: p */
    C17391z f88294p;

    /* renamed from: p0 */
    boolean f88295p0;

    /* renamed from: q */
    int f88296q;

    /* renamed from: q0 */
    boolean f88297q0;

    /* renamed from: r */
    int f88298r;

    /* renamed from: r0 */
    int f88299r0;

    /* renamed from: s */
    InterfaceC16725a.b f88300s;

    /* renamed from: s0 */
    boolean f88301s0;

    /* renamed from: t */
    IMediaPlayer f88302t;

    /* renamed from: t0 */
    int f88303t0;

    /* renamed from: u */
    Handler f88304u;

    /* renamed from: u0 */
    boolean f88305u0;

    /* renamed from: v */
    protected int f88306v;

    /* renamed from: v0 */
    boolean f88307v0;

    /* renamed from: w */
    private int f88308w;

    /* renamed from: w0 */
    boolean f88309w0;

    /* renamed from: x */
    GifController f88310x;

    /* renamed from: x0 */
    boolean f88311x0;

    /* renamed from: y */
    FrameLayout.LayoutParams f88312y;

    /* renamed from: y0 */
    boolean f88313y0;

    /* renamed from: z */
    ViewGroup f88314z;

    /* renamed from: z0 */
    boolean f88315z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$a */
    /* loaded from: classes7.dex */
    public class C17312a implements IMediaPlayer.OnTimedTextListener {
        C17312a() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, ZTimedText zTimedText) {
            if (zTimedText != null) {
                ZGifView.this.f88283g0.setText(zTimedText.getText());
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$b */
    /* loaded from: classes7.dex */
    public class C17313b implements IMediaPlayer.OnStateChangedListener {
        C17313b() {
        }

        /* renamed from: b */
        public /* synthetic */ void m92362b(int i11) {
            ZGifView zGifView = ZGifView.this;
            if (!zGifView.f88241J0) {
                zGifView.f88310x.m92235a();
            }
            ZGifView zGifView2 = ZGifView.this;
            zGifView2.f88241J0 = true;
            if (i11 == 3) {
                InterfaceC16725a interfaceC16725a = zGifView2.f88281f0;
                if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
                    ZGifView.this.f88281f0.getView().setAlpha(1.0f);
                }
                if (ZGifView.this.f88310x.m92245k()) {
                    ZGifView.this.f88310x.m92258y(false, true);
                }
                ZGifView zGifView3 = ZGifView.this;
                if (!zGifView3.f88297q0) {
                    zGifView3.m92344M(false);
                }
                ZGifView.this.f88310x.m92255v(false);
            }
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnStateChangedListener
        public void onStateChanged(IMediaPlayer iMediaPlayer, int i11) {
            ZGifView.this.setCurrentState(i11);
            GifController gifController = ZGifView.this.f88310x;
            if (gifController != null) {
                gifController.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.v

                    /* renamed from: q */
                    public final /* synthetic */ int f88607q;

                    public /* synthetic */ RunnableC17387v(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZGifView.C17313b.this.m92362b(r2);
                    }
                });
            }
            ZGifView.this.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$c */
    /* loaded from: classes7.dex */
    public class C17314c implements InterfaceC16725a.a {
        C17314c() {
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: a */
        public void mo89176a(InterfaceC16725a.b bVar) {
            ZGifView.this.m92333B("onSurfaceDestroyed");
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZGifView zGifView = ZGifView.this;
            if (mo89171c != zGifView.f88281f0) {
                AbstractC23350e.m122774d("ZGifView", "onSurfaceDestroyed: unmatched render callback\n");
                return;
            }
            zGifView.f88300s.mo89169a();
            ZGifView zGifView2 = ZGifView.this;
            zGifView2.f88300s = null;
            zGifView2.m92338G();
        }

        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: b */
        public void mo89177b(InterfaceC16725a.b bVar, int i11, int i12) {
            ZGifView.this.m92333B("onSurfaceCreated: " + bVar);
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZGifView zGifView = ZGifView.this;
            InterfaceC16725a interfaceC16725a = zGifView.f88281f0;
            if (mo89171c != interfaceC16725a) {
                zGifView.m92334C("onSurfaceCreated: unmatched render callback\n");
                return;
            }
            zGifView.f88300s = bVar;
            IMediaPlayer iMediaPlayer = zGifView.f88302t;
            if (iMediaPlayer != null) {
                zGifView.m92351i(iMediaPlayer, bVar);
                return;
            }
            if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
                ZGifView.this.f88281f0.getView().setAlpha(0.0f);
            }
            ZGifView zGifView2 = ZGifView.this;
            if (zGifView2.f88305u0) {
                zGifView2.m92336E();
                ZGifView.this.f88305u0 = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:            if (r5.f88238I == r7) goto L45;     */
        @Override // com.zing.zalo.uidrawing.widget.video.InterfaceC16725a.a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo89178c(InterfaceC16725a.b bVar, int i11, int i12, int i13) {
            boolean z11;
            ZGifView zGifView;
            ZGifView.this.m92333B("onSurfaceChanged");
            InterfaceC16725a mo89171c = bVar.mo89171c();
            ZGifView zGifView2 = ZGifView.this;
            InterfaceC16725a interfaceC16725a = zGifView2.f88281f0;
            if (mo89171c != interfaceC16725a) {
                zGifView2.m92333B("onSurfaceChanged: unmatched render callback\n");
                return;
            }
            zGifView2.f88228D = i12;
            zGifView2.f88230E = i13;
            boolean z12 = false;
            if (zGifView2.f88298r == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (interfaceC16725a.mo89166c()) {
                ZGifView zGifView3 = ZGifView.this;
                if (zGifView3.f88236H == i12) {
                }
                zGifView = ZGifView.this;
                if (zGifView.f88302t == null && z11 && z12) {
                    int i14 = zGifView.f88256R;
                    if (i14 != 0) {
                        zGifView.seekTo(i14);
                    }
                    ZGifView.this.start();
                    return;
                }
                return;
            }
            z12 = true;
            zGifView = ZGifView.this;
            if (zGifView.f88302t == null) {
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$d */
    /* loaded from: classes7.dex */
    public class C17315d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f88319a;

        C17315d(int i11) {
            this.f88319a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f88319a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$e */
    /* loaded from: classes7.dex */
    public class RunnableC17316e implements Runnable {
        RunnableC17316e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZGifView zGifView = ZGifView.this;
                if (zGifView.f88310x != null && zGifView.f88298r != 4 && zGifView.f88296q != 0) {
                    zGifView.m92344M(true);
                    ZGifView.this.f88310x.m92255v(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$f */
    /* loaded from: classes7.dex */
    public class C17317f implements IMediaPlayer.OnDataSourceCheckedListener {
        C17317f() {
        }

        /* renamed from: b */
        public /* synthetic */ void m92364b(String str) {
            if (ZGifView.this.f88302t != null && !str.isEmpty()) {
                try {
                    ZGifView.this.f88302t.setDataSource(str);
                    ZGifView.this.f88302t.prepareAsync();
                } catch (Exception unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to open content: ");
                    sb2.append(str);
                    ZGifView.this.setCurrentState(-1);
                    ZGifView zGifView = ZGifView.this;
                    zGifView.f88298r = -1;
                    zGifView.f88261T0.onError(zGifView.f88302t, 1, 0);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onFailed() {
            AbstractC20110a.m104538g("setDataSourceAsync failed mp4.", new Object[0]);
            ZGifView.this.setCurrentState(-1);
            ZGifView zGifView = ZGifView.this;
            zGifView.f88298r = -1;
            zGifView.f88261T0.onError(zGifView.f88302t, -1010, 0);
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
        public void onSuccess(String str) {
            ZGifView.this.f88304u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.w

                /* renamed from: q */
                public final /* synthetic */ String f88609q;

                public /* synthetic */ RunnableC17388w(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZGifView.C17317f.this.m92364b(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$g */
    /* loaded from: classes7.dex */
    public class C17318g implements AbstractC17297a.b {

        /* renamed from: com.zing.zalo.zmedia.view.ZGifView$g$a */
        /* loaded from: classes7.dex */
        public class a implements IMediaPlayer.OnDataSourceCheckedListener {
            a() {
            }

            /* renamed from: b */
            public /* synthetic */ void m92366b(String str) {
                if (ZGifView.this.f88302t != null && !str.isEmpty()) {
                    try {
                        ZGifView.this.f88302t.setDataSource(str);
                        ZGifView.this.f88302t.prepareAsync();
                    } catch (Exception unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to open content: ");
                        sb2.append(str);
                        ZGifView.this.setCurrentState(-1);
                        ZGifView zGifView = ZGifView.this;
                        zGifView.f88298r = -1;
                        zGifView.f88261T0.onError(zGifView.f88302t, 1, 0);
                    }
                }
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
            public void onFailed() {
                AbstractC20110a.m104538g("setDataSourceAsync failed onCompleted.", new Object[0]);
                ZGifView.this.setCurrentState(-1);
                ZGifView zGifView = ZGifView.this;
                zGifView.f88298r = -1;
                zGifView.f88261T0.onError(zGifView.f88302t, -1010, 0);
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnDataSourceCheckedListener
            public void onSuccess(String str) {
                ZGifView.this.f88304u.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.x

                    /* renamed from: q */
                    public final /* synthetic */ String f88611q;

                    public /* synthetic */ RunnableC17389x(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZGifView.C17318g.a.this.m92366b(r2);
                    }
                });
            }
        }

        C17318g() {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: cH */
        public void mo39665cH(C17391z c17391z, CacheException cacheException) {
            AbstractC17297a.b bVar;
            if (ZGifView.this.f88294p.equals(c17391z) && (bVar = ZGifView.this.f88229D0) != null) {
                bVar.mo39665cH(c17391z, cacheException);
            }
            ZGifView zGifView = ZGifView.this;
            IMediaPlayer.OnErrorListener onErrorListener = zGifView.f88261T0;
            if (onErrorListener != null) {
                onErrorListener.onError(zGifView.f88302t, 1, 0);
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: qH */
        public void mo39666qH(C17391z c17391z) {
            AbstractC17297a.b bVar;
            if (ZGifView.this.f88294p.equals(c17391z) && (bVar = ZGifView.this.f88229D0) != null) {
                bVar.mo39666qH(c17391z);
            }
            ZGifView zGifView = ZGifView.this;
            if (zGifView.f88310x != null) {
                zGifView.m92344M(true);
                ZGifView.this.f88310x.m92255v(false);
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: tE */
        public void mo39667tE(C17391z c17391z) {
            AbstractC17297a.b bVar;
            C17391z c17391z2;
            try {
                ZGifView zGifView = ZGifView.this;
                int i11 = zGifView.f88296q;
                if ((i11 == 1 || i11 == 0) && (c17391z2 = zGifView.f88294p) != null && c17391z2.equals(c17391z)) {
                    ZGifView.this.m92344M(false);
                    ZGifView.this.f88302t.setDataSourceAsync(c17391z.f88628k, new a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C17391z c17391z3 = ZGifView.this.f88294p;
            if (c17391z3 != null && c17391z3.equals(c17391z) && (bVar = ZGifView.this.f88229D0) != null) {
                bVar.mo39667tE(c17391z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$h */
    /* loaded from: classes7.dex */
    public class C17319h implements IMediaPlayer.OnVideoSizeChangedListener {
        C17319h() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            ZGifView zGifView;
            int i17;
            if (ZGifView.this.f88236H == iMediaPlayer.getVideoHeight() && ZGifView.this.f88238I == iMediaPlayer.getVideoWidth() && ((i17 = (zGifView = ZGifView.this).f88232F) == 90 || i17 == 270)) {
                zGifView.f88232F = 0;
                InterfaceC16725a interfaceC16725a = zGifView.f88281f0;
                if (interfaceC16725a != null) {
                    interfaceC16725a.setVideoRotation(0);
                }
            }
            ZGifView.this.f88236H = iMediaPlayer.getVideoWidth();
            ZGifView.this.f88238I = iMediaPlayer.getVideoHeight();
            ZGifView.this.f88288j0 = iMediaPlayer.getVideoSarNum();
            ZGifView.this.f88289k0 = iMediaPlayer.getVideoSarDen();
            ZGifView zGifView2 = ZGifView.this;
            if (zGifView2.f88236H != 0 && zGifView2.f88238I != 0) {
                zGifView2.m92342K();
                ZGifView zGifView3 = ZGifView.this;
                int i18 = zGifView3.f88236H;
                int i19 = zGifView3.f88238I;
                int i21 = zGifView3.f88232F;
                if (i21 != 90 && i21 != 270) {
                    i16 = i18;
                    i15 = i19;
                } else {
                    i15 = i18;
                    i16 = i19;
                }
                float f11 = i16 / i15;
                if (Math.abs(zGifView3.getVideoRatio() - f11) > 0.01d) {
                    ZGifView.this.setVideoRatio(f11);
                    ZGifView.this.requestLayout();
                    IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = ZGifView.this.f88282f1;
                    if (onVideoSizeChangedListener != null) {
                        onVideoSizeChangedListener.onVideoSizeChanged(iMediaPlayer, i16, i15, i13, i14);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$i */
    /* loaded from: classes7.dex */
    public class C17320i implements IMediaPlayer.OnPreparedListener {
        C17320i() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:            if (r5.f88230E == r5.f88238I) goto L60;     */
        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnPreparedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            ZGifView.this.m92334C("OnPrepared  with targetState :" + ZGifView.this.f88298r);
            ZGifView.this.f88291m0 = System.currentTimeMillis();
            ZGifView zGifView = ZGifView.this;
            zGifView.removeCallbacks(zGifView.f88251O0);
            ZGifView.this.setCurrentState(2);
            ZGifView zGifView2 = ZGifView.this;
            IMediaPlayer.OnPreparedListener onPreparedListener = zGifView2.f88244L;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(zGifView2.f88302t);
            }
            ZGifView.this.f88236H = iMediaPlayer.getVideoWidth();
            ZGifView.this.f88238I = iMediaPlayer.getVideoHeight();
            ZGifView zGifView3 = ZGifView.this;
            int i11 = zGifView3.f88256R;
            if (i11 > 0) {
                zGifView3.seekTo(i11);
            }
            ZGifView zGifView4 = ZGifView.this;
            if (zGifView4.f88236H != 0 && zGifView4.f88238I != 0) {
                if (zGifView4.f88281f0 != null) {
                    zGifView4.m92342K();
                    ZGifView zGifView5 = ZGifView.this;
                    zGifView5.f88281f0.mo89164a(zGifView5.f88288j0, zGifView5.f88289k0);
                    if (ZGifView.this.f88281f0.mo89166c()) {
                        ZGifView zGifView6 = ZGifView.this;
                        if (zGifView6.f88228D == zGifView6.f88236H) {
                        }
                    }
                    ZGifView zGifView7 = ZGifView.this;
                    if (zGifView7.f88298r != 3 && zGifView7.f88237H0.getPlayerType() != 0) {
                        ZGifView zGifView8 = ZGifView.this;
                        if (zGifView8.f88298r == 4) {
                            zGifView8.pause();
                        }
                    } else {
                        ZGifView.this.start();
                    }
                }
            } else if (zGifView4.f88298r != 3 && zGifView4.f88237H0.getPlayerType() != 0) {
                ZGifView zGifView9 = ZGifView.this;
                if (zGifView9.f88298r == 4) {
                    zGifView9.pause();
                }
            } else {
                ZGifView.this.start();
            }
            ZGifView.this.f88310x.m92232B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$j */
    /* loaded from: classes7.dex */
    public class C17321j implements IMediaPlayer.OnCompletionListener {
        C17321j() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
        public void onVideoCompletion(IMediaPlayer iMediaPlayer) {
            ZGifView.this.setCurrentState(5);
            ZGifView zGifView = ZGifView.this;
            zGifView.f88298r = 5;
            IMediaPlayer.OnCompletionListener onCompletionListener = zGifView.f88242K;
            if (onCompletionListener != null) {
                onCompletionListener.onVideoCompletion(zGifView.f88302t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$k */
    /* loaded from: classes7.dex */
    public class C17322k implements IMediaPlayer.OnInfoListener {
        C17322k() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
            IMediaPlayer.OnInfoListener onInfoListener = ZGifView.this.f88248N;
            if (onInfoListener != null) {
                onInfoListener.onInfo(iMediaPlayer, i11, i12, obj);
            }
            if (i11 != 3) {
                if (i11 != 10001) {
                    if (i11 != 11000) {
                        switch (i11) {
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                ZGifView zGifView = ZGifView.this;
                                zGifView.removeCallbacks(zGifView.f88251O0);
                                ZGifView zGifView2 = ZGifView.this;
                                zGifView2.postDelayed(zGifView2.f88251O0, 1000L);
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                ZGifView.this.m92344M(false);
                                ZGifView zGifView3 = ZGifView.this;
                                zGifView3.removeCallbacks(zGifView3.f88251O0);
                                ZGifView zGifView4 = ZGifView.this;
                                zGifView4.f88297q0 = false;
                                zGifView4.f88299r0 = 0;
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("MEDIA_INFO_NETWORK_BANDWIDTH: ");
                                sb2.append(i12);
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_EMPTY /* 704 */:
                                ZGifView zGifView5 = ZGifView.this;
                                if (zGifView5.f88299r0 == -10000) {
                                    zGifView5.m92335D();
                                }
                                ZGifView.this.f88297q0 = true;
                                break;
                        }
                    } else {
                        ZGifView zGifView6 = ZGifView.this;
                        if (zGifView6.f88294p != null && zGifView6.f88249N0 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onInfo: MEDIA_INFO_BUFFERING_START ");
                            ZGifView zGifView7 = ZGifView.this;
                            sb3.append(zGifView7.f88249N0.get(zGifView7.f88294p.f88618a));
                            ZGifView zGifView8 = ZGifView.this;
                            zGifView8.f88249N0.put(zGifView8.f88294p.f88618a, Boolean.TRUE);
                        }
                    }
                } else {
                    ZGifView.this.f88232F = i12;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("MEDIA_INFO_VIDEO_ROTATION_CHANGED: ");
                    sb4.append(i12);
                    InterfaceC16725a interfaceC16725a = ZGifView.this.f88281f0;
                    if (interfaceC16725a != null) {
                        interfaceC16725a.setVideoRotation(i12);
                    }
                }
            } else {
                ZGifView.this.f88297q0 = false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$l */
    /* loaded from: classes7.dex */
    public class C17323l implements IMediaPlayer.OnBufferingUpdateListener {
        C17323l() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11) {
            if (i11 > 0) {
                ZGifView.this.f88254Q = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$m */
    /* loaded from: classes7.dex */
    public class C17324m implements IMediaPlayer.OnSeekCompleteListener {
        C17324m() {
        }

        @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            ZGifView.this.f88293o0 = System.currentTimeMillis();
            IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = ZGifView.this.f88250O;
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(iMediaPlayer);
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$n */
    /* loaded from: classes7.dex */
    public interface InterfaceC17325n {
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$o */
    /* loaded from: classes7.dex */
    public interface InterfaceC17326o {
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$p */
    /* loaded from: classes7.dex */
    public interface InterfaceC17327p {
    }

    /* renamed from: com.zing.zalo.zmedia.view.ZGifView$q */
    /* loaded from: classes7.dex */
    public interface InterfaceC17328q {
    }

    public ZGifView(Context context) {
        super(context);
        this.f88296q = 0;
        this.f88298r = 0;
        this.f88300s = null;
        this.f88302t = null;
        this.f88306v = 0;
        this.f88308w = 0;
        this.f88224B = false;
        this.f88226C = false;
        this.f88234G = 1.0f;
        this.f88236H = 0;
        this.f88238I = 0;
        this.f88240J = true;
        this.f88258S = true;
        this.f88260T = true;
        this.f88262U = true;
        this.f88264V = false;
        this.f88266W = false;
        this.f88271a0 = false;
        this.f88273b0 = false;
        this.f88290l0 = 0L;
        this.f88291m0 = 0L;
        this.f88292n0 = 0L;
        this.f88293o0 = 0L;
        this.f88295p0 = true;
        this.f88297q0 = false;
        this.f88299r0 = 0;
        this.f88301s0 = false;
        this.f88303t0 = -1;
        this.f88305u0 = false;
        this.f88307v0 = true;
        this.f88309w0 = false;
        this.f88311x0 = false;
        this.f88313y0 = false;
        this.f88315z0 = false;
        this.f88223A0 = false;
        this.f88225B0 = false;
        this.f88227C0 = false;
        this.f88231E0 = 0;
        this.f88241J0 = false;
        this.f88243K0 = 0;
        this.f88245L0 = 0;
        this.f88251O0 = new RunnableC17316e();
        this.f88253P0 = new C17319h();
        this.f88255Q0 = new C17320i();
        this.f88257R0 = new C17321j();
        this.f88259S0 = new C17322k();
        this.f88261T0 = new IMediaPlayer.OnErrorListener() { // from class: com.zing.zalo.zmedia.view.p
            public /* synthetic */ C17376p() {
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                boolean m92331y;
                m92331y = ZGifView.this.m92331y(iMediaPlayer, i11, i12);
                return m92331y;
            }
        };
        this.f88263U0 = new C17323l();
        this.f88265V0 = new C17324m();
        this.f88267W0 = new C17312a();
        this.f88268X0 = new C17313b();
        this.f88269Y0 = new C17314c();
        this.f88270Z0 = 1.0f;
        this.f88272a1 = 0;
        this.f88274b1 = f88221i1[0];
        this.f88276c1 = true;
        this.f88280e1 = 1.7777778f;
        this.f88286h1 = 0.0f;
        m92358q(context);
    }

    /* renamed from: A */
    public /* synthetic */ void m92320A(IMediaPlayer iMediaPlayer) {
        Handler handler;
        iMediaPlayer.reset();
        iMediaPlayer.release();
        this.f88273b0 = false;
        if (this.f88305u0 && (handler = this.f88304u) != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* renamed from: s */
    private boolean m92327s() {
        ZMediaPlayerSettings.PlayConfig playConfig = this.f88239I0;
        if (playConfig != null) {
            return playConfig.isForceScreenOnWhilePlaying();
        }
        return true;
    }

    /* renamed from: v */
    public /* synthetic */ void m92328v(View view) {
        try {
            if (this.f88295p0) {
                this.f88301s0 = true;
                return;
            }
            this.f88303t0 = getCurrentPosition();
            boolean z11 = !this.f88226C;
            this.f88226C = z11;
            if (z11) {
                if (getActivity().getResources().getConfiguration().orientation != 2) {
                    getActivity().setRequestedOrientation(6);
                }
            } else {
                if (getActivity().getResources().getConfiguration().orientation != 1) {
                    getActivity().setRequestedOrientation(1);
                }
                try {
                    if (!isPlaying() && !this.f88264V) {
                        m92347P();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            setFullScreen(this.f88226C);
            m92348Q();
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f88226C = true ^ this.f88226C;
        }
    }

    /* renamed from: w */
    public /* synthetic */ void m92329w(View view) {
        try {
            this.f88310x.m92231A(false);
            this.f88310x.m92259z(false);
            m92344M(true);
            m92336E();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public /* synthetic */ void m92330x(int i11) {
        try {
            if ((i11 & 4) == 0) {
                if (this.f88224B) {
                    this.f88310x.m92236b(true);
                }
            } else {
                this.f88310x.m92236b(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public /* synthetic */ boolean m92331y(IMediaPlayer iMediaPlayer, int i11, int i12) {
        if (i11 == 0) {
            return false;
        }
        int i13 = this.f88296q;
        if ((i13 != 2 && (i13 != 3 || this.f88297q0)) || i11 != -10000) {
            m92335D();
            return true;
        }
        this.f88299r0 = ZMediaPlayer.MEDIA_ERROR_Z_PLAYER;
        return true;
    }

    /* renamed from: z */
    public /* synthetic */ void m92332z() {
        m92344M(false);
    }

    /* renamed from: B */
    public void m92333B(String str) {
        StringBuilder sb2 = new StringBuilder();
        C17391z c17391z = this.f88294p;
        if (c17391z != null) {
            sb2.append(c17391z.f88620c);
            sb2.append("\n");
        }
        sb2.append(m92355m(this.f88296q));
        sb2.append(": ");
        sb2.append(str);
    }

    /* renamed from: C */
    void m92334C(String str) {
        StringBuilder sb2 = new StringBuilder();
        C17391z c17391z = this.f88294p;
        if (c17391z != null) {
            sb2.append(c17391z.f88620c);
            sb2.append("\n");
        }
        sb2.append(m92355m(this.f88296q));
        sb2.append(": ");
        sb2.append(str);
    }

    /* renamed from: D */
    void m92335D() {
        this.f88299r0 = 0;
        setCurrentState(-1);
        this.f88298r = -1;
        removeCallbacks(this.f88251O0);
        this.f88310x.m92233C();
        this.f88310x.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.r
            public /* synthetic */ RunnableC17380r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZGifView.this.m92332z();
            }
        });
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.m92231A(true);
        }
        IMediaPlayer.OnErrorListener onErrorListener = this.f88246M;
        if (onErrorListener != null) {
            onErrorListener.onError(this.f88302t, ZMediaPlayer.MEDIA_ERROR_Z_PLAYER, 0);
        }
    }

    /* renamed from: E */
    public void m92336E() {
        String str;
        C17391z c17391z = this.f88294p;
        if (c17391z != null && this.f88300s != null) {
            m92337F(false);
            if (this.f88273b0) {
                if (this.f88294p != null) {
                    this.f88305u0 = true;
                    return;
                }
                return;
            }
            Handler handler = this.f88304u;
            if (handler != null) {
                handler.removeMessages(1);
            }
            try {
                if (!TextUtils.isEmpty(this.f88294p.f88620c) && !"null".equalsIgnoreCase(this.f88294p.f88620c)) {
                    IMediaPlayer m92353k = m92353k(this.f88294p.f88620c);
                    this.f88302t = m92353k;
                    m92353k.setOnPreparedListener(this.f88255Q0);
                    this.f88302t.setOnVideoSizeChangedListener(this.f88253P0);
                    this.f88302t.setOnCompletionListener(this.f88257R0);
                    this.f88302t.setOnErrorListener(this.f88261T0);
                    this.f88302t.setOnInfoListener(this.f88259S0);
                    this.f88302t.setOnBufferingUpdateListener(this.f88263U0);
                    this.f88302t.setOnSeekCompleteListener(this.f88265V0);
                    this.f88302t.setOnTimedTextListener(this.f88267W0);
                    this.f88302t.setOnStateChangedListener(this.f88268X0);
                    this.f88254Q = 0;
                    if (this.f88266W) {
                        this.f88237H0 = ZMediaPlayerSettings.getVideoConfig(8);
                    }
                    m92351i(this.f88302t, this.f88300s);
                    this.f88302t.setAudioStreamType(3);
                    this.f88302t.setScreenOnWhilePlaying(m92327s());
                    this.f88290l0 = System.currentTimeMillis();
                    setCurrentState(1);
                    if (this.f88237H0.getPlayerType() == 1 && !this.f88266W) {
                        postDelayed(this.f88251O0, 1200L);
                        this.f88302t.setDataSourceAsync(this.f88294p.f88620c, new C17317f());
                        return;
                    } else {
                        AbstractC17297a.m92226d(this.f88294p, new C17318g());
                        return;
                    }
                }
                return;
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to open content: ");
                C17391z c17391z2 = this.f88294p;
                if (c17391z2 != null) {
                    str = c17391z2.f88620c;
                } else {
                    str = "";
                }
                sb2.append(str);
                setCurrentState(-1);
                this.f88298r = -1;
                this.f88261T0.onError(this.f88302t, 1, 0);
                return;
            }
        }
        if (c17391z != null) {
            this.f88305u0 = true;
        }
    }

    /* renamed from: F */
    public void m92337F(boolean z11) {
        m92334C("Release :" + z11);
        if (z11) {
            m92344M(false);
        }
        Handler handler = this.f88304u;
        if (handler != null) {
            handler.removeMessages(1);
        }
        IMediaPlayer iMediaPlayer = this.f88302t;
        if (iMediaPlayer != null) {
            this.f88302t = null;
            setCurrentState(0);
            if (z11 || this.f88298r == 4) {
                this.f88298r = 0;
            }
            this.f88273b0 = true;
            this.f88236H = 0;
            this.f88238I = 0;
            AbstractC17356f.m92487a(new Runnable() { // from class: com.zing.zalo.zmedia.view.q

                /* renamed from: q */
                public final /* synthetic */ IMediaPlayer f88594q;

                public /* synthetic */ RunnableC17378q(IMediaPlayer iMediaPlayer2) {
                    r2 = iMediaPlayer2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZGifView.this.m92320A(r2);
                }
            });
            this.f88279e0 = null;
        }
        InterfaceC16725a interfaceC16725a = this.f88281f0;
        if (interfaceC16725a != null && interfaceC16725a.getView() != null) {
            this.f88281f0.getView().setAlpha(0.0f);
        }
        removeCallbacks(this.f88251O0);
        if (z11) {
            this.f88294p = null;
            GifController gifController = this.f88310x;
            if (gifController != null) {
                gifController.m92253s();
            }
            this.f88256R = 0;
        }
    }

    /* renamed from: G */
    public void m92338G() {
        IMediaPlayer iMediaPlayer = this.f88302t;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    /* renamed from: H */
    void m92339H() {
        ZMediaPlayerSettings.PlayConfig playConfig = this.f88239I0;
        if (playConfig == null || !playConfig.isSilent()) {
            InterfaceC17350c interfaceC17350c = this.f88252P;
            if (interfaceC17350c != null) {
                interfaceC17350c.mo92474b(this);
            } else {
                getAudioManager().requestAudioFocus(null, 3, 2);
            }
        }
    }

    /* renamed from: I */
    public void m92340I() {
        m92334C("Resume");
        this.f88298r = 3;
        m92336E();
    }

    /* renamed from: J */
    public void m92341J(C17391z c17391z, ZMediaPlayerSettings.VideoConfig videoConfig) {
        RelativeLayout.LayoutParams layoutParams;
        ViewOnClickListenerC17348b viewOnClickListenerC17348b;
        C17391z c17391z2 = this.f88294p;
        if (c17391z2 == null || (c17391z != null && !c17391z2.equals(c17391z))) {
            this.f88294p = c17391z;
            GifController gifController = this.f88310x;
            if (gifController != null && (viewOnClickListenerC17348b = gifController.f88162s) != null) {
                viewOnClickListenerC17348b.m92465l(c17391z);
                this.f88310x.f88162s.m92469p(true, false);
            }
            C17391z c17391z3 = this.f88294p;
            if (c17391z3 != null) {
                setVideoRatio(c17391z3.f88626i);
            }
            m92337F(false);
            GifController gifController2 = this.f88310x;
            if (gifController2 != null && (layoutParams = this.f88287i0) != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                gifController2.setLoadingViewLayoutParams(layoutParams);
            }
        }
        this.f88237H0 = videoConfig;
        if (videoConfig != null && videoConfig.isZaloPlayer()) {
            HandlerThreadC17390y.m92533c(CoreUtility.getAppContext());
        }
    }

    /* renamed from: K */
    void m92342K() {
        boolean z11;
        InterfaceC16725a interfaceC16725a = this.f88281f0;
        if (interfaceC16725a != null) {
            int i11 = this.f88236H;
            int i12 = this.f88238I;
            if (this.f88231E0 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC16725a.mo89168e(i11, i12, z11, this.f88233F0, this.f88235G0);
        }
    }

    /* renamed from: L */
    public void m92343L(boolean z11) {
        GifController gifController = this.f88310x;
        if (gifController != null) {
            if (z11) {
                gifController.m92235a();
            } else {
                gifController.m92240f();
            }
        }
    }

    /* renamed from: M */
    public void m92344M(boolean z11) {
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.m92257x(z11);
        }
    }

    /* renamed from: N */
    public void m92345N() {
        m92334C("Stop");
        int i11 = this.f88296q;
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            m92337F(true);
        } else {
            m92346O();
        }
        this.f88310x.m92240f();
        m92344M(false);
        this.f88310x.m92231A(false);
        this.f88310x.m92259z(true);
    }

    /* renamed from: O */
    public void m92346O() {
        IMediaPlayer iMediaPlayer = this.f88302t;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f88302t.setDisplay(null);
            m92337F(false);
        }
    }

    /* renamed from: P */
    public void m92347P() {
        if (this.f88271a0) {
            try {
                int i11 = this.f88296q;
                if (i11 != -1 && i11 != 0 && i11 != 1) {
                    seekTo(getCurrentPosition());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Q */
    void m92348Q() {
        m92343L(true);
        int i11 = this.f88296q;
        if (i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6) {
            GifController gifController = this.f88310x;
            if (gifController != null && this.f88294p != null) {
                gifController.m92258y(true, false);
                return;
            }
            return;
        }
        GifController gifController2 = this.f88310x;
        if (gifController2 != null) {
            gifController2.m92258y(false, false);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f88258S;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f88260T;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f88262U;
    }

    /* renamed from: g */
    void m92349g() {
        ZMediaPlayerSettings.PlayConfig playConfig = this.f88239I0;
        if (playConfig == null || !playConfig.isSilent()) {
            InterfaceC17350c interfaceC17350c = this.f88252P;
            if (interfaceC17350c != null) {
                interfaceC17350c.mo92473a(this);
            } else {
                getAudioManager().abandonAudioFocus(null);
            }
        }
    }

    Activity getActivity() {
        Activity activity = this.f88277d0;
        if (activity != null) {
            return activity;
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Activity activity2 = (Activity) context;
                this.f88277d0 = activity2;
                return activity2;
            }
        }
        return null;
    }

    AudioManager getAudioManager() {
        if (this.f88279e0 == null) {
            this.f88279e0 = (AudioManager) this.f88275c0.getSystemService("audio");
        }
        return this.f88279e0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f88302t != null) {
            return this.f88254Q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (m92360u()) {
            return (int) this.f88302t.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionIgnoreState() {
        try {
            IMediaPlayer iMediaPlayer = this.f88302t;
            if (iMediaPlayer != null) {
                return (int) iMediaPlayer.getCurrentPosition();
            }
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    public int getCurrentState() {
        if (this.f88302t != null) {
            return this.f88296q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        long j11;
        if (m92360u()) {
            j11 = this.f88302t.getDuration();
        } else {
            C17391z c17391z = this.f88294p;
            if (c17391z != null) {
                j11 = c17391z.f88632o;
            } else {
                return -1;
            }
        }
        return (int) j11;
    }

    public GifController getGifController() {
        return this.f88310x;
    }

    public RecyclingImageView getLoadingView() {
        return this.f88310x.f88162s.f88479q;
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
        return this.f88294p;
    }

    public float getVideoRatio() {
        return this.f88234G;
    }

    /* renamed from: h */
    void m92350h() {
        if (this.f88284g1 == null) {
            this.f88284g1 = new View(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(1073741824);
            gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics()));
            this.f88284g1.setBackground(gradientDrawable);
            addView(this.f88284g1, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            m92336E();
            this.f88305u0 = false;
        }
        return false;
    }

    /* renamed from: i */
    void m92351i(IMediaPlayer iMediaPlayer, InterfaceC16725a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            m92333B("bindSurfaceHolder");
            iMediaPlayer.setSurface(bVar.mo89170b());
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        if (m92360u() && this.f88302t.isPlaying()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    void m92352j(int i11, int i12) {
        int i13;
        int i14;
        float f11;
        if (this.f88236H > 0 && this.f88238I > 0) {
            float f12 = this.f88234G;
            if (f12 < this.f88280e1) {
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
            int i17 = this.f88232F;
            if (i17 != 90 && i17 != 270) {
                matrix.setScale(f13, f11, i15, i16);
            } else {
                matrix.setScale(f11, f13, i16, i15);
            }
            FrameLayout.LayoutParams layoutParams = this.f88285h0;
            layoutParams.width = i11;
            layoutParams.height = i12;
            Object obj = this.f88281f0;
            if (obj instanceof TextureView) {
                ((TextureView) obj).setTransform(matrix);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* renamed from: k */
    public IMediaPlayer m92353k(String str) {
        long j11;
        ?? r22;
        ZMediaPlayerSettings.PlayConfig playConfig;
        if (this.f88237H0.getPlayerType() != 1 || this.f88294p == null) {
            return null;
        }
        ZMediaPlayer zMediaPlayer = new ZMediaPlayer();
        if (!ZMediaPlayer.isLibrariesLoaded()) {
            this.f88266W = true;
            return null;
        }
        if (ZMediaPlayerSettings.AUDIO_DECODER_OPENSLES) {
            j11 = 1;
        } else {
            j11 = 0;
        }
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OPENSLES, j11);
        long j12 = 0;
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC, j12);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE, j12);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE, j12);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FRAME_DROP, 1L);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PACKET_BUFFERING, 1L);
        zMediaPlayer.setLooping(this.f88315z0);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_IS_GIF, 1L);
        if (this.f88225B0 || ((playConfig = this.f88239I0) != null && playConfig.isSilent())) {
            zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_AUDIO, 1L);
        }
        ZMediaPlayerSettings.PlayConfig playConfig2 = this.f88239I0;
        if (playConfig2 != null) {
            r22 = playConfig2.isAutoStartOnPrepared();
        } else {
            r22 = 1;
        }
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_START_ON_PREPARED, (long) r22);
        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, ZMediaPlayerSettings.getPixelFormatWhitelist(-1));
        zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_PATH, ZMediaPlayerSettings.getCacheDir(this.f88237H0.getPlayerSection()));
        zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_OID, this.f88294p.f88631n);
        zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_INDEX, Math.max(this.f88294p.f88633p, 0));
        zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_SECTION, this.f88237H0.getPlayerSection());
        return zMediaPlayer;
    }

    /* renamed from: l */
    void m92354l(int i11, int i12) {
        RelativeLayout.LayoutParams layoutParams;
        if (i11 > 0 && i12 > 0) {
            float f11 = i11;
            float f12 = i12;
            float f13 = (1.0f * f11) / f12;
            float f14 = this.f88234G;
            if (f14 < f13) {
                i11 = (int) (f12 * f14);
            } else {
                i12 = (int) (f11 / f14);
            }
            GifController gifController = this.f88310x;
            if (gifController != null && (layoutParams = this.f88287i0) != null) {
                layoutParams.width = i11;
                layoutParams.height = i12;
                gifController.setLoadingViewLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: m */
    String m92355m(int i11) {
        switch (i11) {
            case -1:
                return "STATE ERROR";
            case 0:
                return "STATE IDLE";
            case 1:
                return "STATE PREPARING";
            case 2:
                return "STATE PREPARED";
            case 3:
                return "STATE PLAYING";
            case 4:
                return "STATE PAUSED";
            case 5:
                return "STATE COMPLETED";
            case 6:
                return "STATE STOPPED";
            default:
                return "NOT_DEFINED";
        }
    }

    /* renamed from: n */
    float m92356n(int i11, int i12) {
        if (i11 > 0 && i12 > 0 && !this.f88240J) {
            return i11 / i12;
        }
        DisplayMetrics displayMetrics = this.f88275c0.getResources().getDisplayMetrics();
        int i13 = displayMetrics.widthPixels;
        int i14 = displayMetrics.heightPixels;
        if (this.f88240J) {
            i14 -= getStatusBarHeight();
        }
        return i13 / i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (this.f88295p0) {
                this.f88314z = (ViewGroup) getParent();
                this.f88222A = getLayoutParams();
                this.f88295p0 = false;
            }
            if (this.f88301s0) {
                this.f88301s0 = false;
                if (this.f88310x.getOnFullScreenListener() != null) {
                    this.f88310x.getOnFullScreenListener().onClick(null);
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
        if (this.f88226C) {
            int size3 = View.MeasureSpec.getSize(i11);
            int size4 = View.MeasureSpec.getSize(i12);
            float f11 = size3 / size4;
            this.f88278d1 = f11;
            float f12 = this.f88234G;
            if (f12 < f11) {
                FrameLayout.LayoutParams layoutParams2 = this.f88285h0;
                layoutParams2.height = size4;
                layoutParams2.width = (int) (size4 * f12);
            } else {
                FrameLayout.LayoutParams layoutParams3 = this.f88285h0;
                layoutParams3.width = size3;
                layoutParams3.height = (int) (size3 / f12);
            }
            super.onMeasure(i11, i12);
            return;
        }
        if (this.f88276c1) {
            float m92356n = m92356n(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            float f13 = this.f88234G;
            if (f13 < m92356n) {
                this.f88278d1 = m92356n;
                int size5 = View.MeasureSpec.getSize(i11);
                int i13 = (int) (size5 / this.f88278d1);
                FrameLayout.LayoutParams layoutParams4 = this.f88285h0;
                layoutParams4.height = i13;
                layoutParams4.width = (int) (i13 * this.f88234G);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            }
            if (f13 > 1.7777778f) {
                this.f88278d1 = 1.7777778f;
                int size6 = View.MeasureSpec.getSize(i11);
                int i14 = (int) (size6 / this.f88278d1);
                FrameLayout.LayoutParams layoutParams5 = this.f88285h0;
                layoutParams5.width = size6;
                layoutParams5.height = (int) (size6 / this.f88234G);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size6, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            }
            this.f88278d1 = f13;
            int size7 = View.MeasureSpec.getSize(i11);
            int i15 = (int) (size7 / this.f88278d1);
            FrameLayout.LayoutParams layoutParams6 = this.f88285h0;
            layoutParams6.width = size7;
            layoutParams6.height = i15;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            return;
        }
        this.f88278d1 = this.f88280e1;
        int i16 = this.f88231E0;
        if ((i16 == 1 || i16 == 2) && (this.f88281f0 instanceof TextureView)) {
            size = View.MeasureSpec.getSize(i11);
            size2 = View.MeasureSpec.getSize(i12);
            this.f88233F0 = size;
            this.f88235G0 = size2;
            int i17 = this.f88231E0;
            if (i17 == 1) {
                m92352j(size, size2);
            } else if (i17 == 2) {
                m92354l(size, size2);
            }
        } else {
            size = View.MeasureSpec.getSize(i11);
            size2 = (int) (size / this.f88278d1);
            float f14 = this.f88234G;
            if (f14 < this.f88280e1) {
                FrameLayout.LayoutParams layoutParams7 = this.f88285h0;
                layoutParams7.height = size2;
                layoutParams7.width = (int) (size2 * f14);
            } else {
                FrameLayout.LayoutParams layoutParams8 = this.f88285h0;
                layoutParams8.width = size;
                layoutParams8.height = (int) (size / f14);
            }
            GifController gifController = this.f88310x;
            if (gifController != null && (layoutParams = this.f88287i0) != null) {
                FrameLayout.LayoutParams layoutParams9 = this.f88285h0;
                layoutParams.width = layoutParams9.width;
                layoutParams.height = layoutParams9.height;
                gifController.setLoadingViewLayoutParams(layoutParams);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* renamed from: p */
    void m92357p() {
        boolean z11;
        GifController gifController = new GifController(this.f88275c0);
        this.f88310x = gifController;
        gifController.m92244j(this.f88308w);
        GifController gifController2 = this.f88310x;
        if (getActivity() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        gifController2.setEnableFullScreen(z11);
        this.f88310x.setLoadingViewLayoutParams(this.f88287i0);
        this.f88312y = new FrameLayout.LayoutParams(-1, -1, 80);
        this.f88310x.setOnFullScreenClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zmedia.view.t
            public /* synthetic */ ViewOnClickListenerC17384t() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZGifView.this.m92328v(view);
            }
        });
        this.f88310x.setRetryListener(new View.OnClickListener() { // from class: com.zing.zalo.zmedia.view.u
            public /* synthetic */ ViewOnClickListenerC17386u() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZGifView.this.m92329w(view);
            }
        });
        addView(this.f88310x, this.f88312y);
        this.f88310x.m92241g(false);
        this.f88310x.setMediaPlayer(this);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        m92334C("Pause");
        if (m92360u()) {
            if (this.f88302t.isPlaying()) {
                this.f88302t.pause();
                setCurrentState(4);
            }
            this.f88298r = 0;
        } else if (this.f88296q == 1) {
            this.f88298r = 4;
        }
        m92344M(false);
        this.f88310x.m92255v(true);
    }

    /* renamed from: q */
    void m92358q(Context context) {
        this.f88275c0 = getContext();
        this.f88306v = 1;
        this.f88308w = C17395R.layout.gif_controller;
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        m92359r();
        m92357p();
        setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.zing.zalo.zmedia.view.s
            public /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC17382s() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i11) {
                ZGifView.this.m92330x(i11);
            }
        });
        this.f88304u = new Handler(Looper.getMainLooper(), this);
        this.f88236H = 0;
        this.f88238I = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        setCurrentState(0);
        this.f88298r = 0;
        TextView textView = new TextView(context);
        this.f88283g0 = textView;
        textView.setTextSize(24.0f);
        this.f88283g0.setGravity(17);
        addView(this.f88283g0, new FrameLayout.LayoutParams(-1, -2, 80));
        this.f88247M0 = new HashMap();
        this.f88249N0 = new HashMap();
    }

    /* renamed from: r */
    void m92359r() {
        setRender(2);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i11) {
        if (i11 < getCurrentPosition()) {
            this.f88245L0++;
        } else {
            this.f88243K0++;
        }
        if (i11 >= 0) {
            if (m92360u()) {
                this.f88292n0 = System.currentTimeMillis();
                this.f88302t.seekTo(i11);
                this.f88256R = 0;
                return;
            }
            this.f88256R = i11;
        }
    }

    public void setAudioFocusControl(InterfaceC17350c interfaceC17350c) {
        this.f88252P = interfaceC17350c;
    }

    public void setCurrentState(int i11) {
        this.f88296q = i11;
        boolean z11 = false;
        if (i11 == 0 || i11 == 5) {
            this.f88297q0 = false;
            this.f88299r0 = 0;
        }
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            m92349g();
        } else {
            m92339H();
        }
        if (isPlaying() && m92327s()) {
            z11 = true;
        }
        setKeepScreenOn(z11);
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.m92252r(i11);
        }
    }

    public void setDimAlpha(float f11) {
        this.f88286h1 = f11;
        m92350h();
        View view = this.f88284g1;
        if (view != null) {
            view.setAlpha(f11);
        }
    }

    public void setExcludeSystemDecorationSize(boolean z11) {
        if (this.f88240J != z11) {
            this.f88240J = z11;
            requestLayout();
        }
    }

    public void setForceHideController(boolean z11) {
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.setForceHideController(z11);
        }
    }

    public void setFullScreen(boolean z11) {
        this.f88226C = z11;
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.setFullScreen(z11);
        }
        if (this.f88226C) {
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
    }

    public void setIsFocusing(boolean z11) {
        this.f88224B = z11;
        this.f88310x.setIsFocusing(z11);
    }

    public void setLoadingViewImageInfo(C3979l c3979l) {
        GifController gifController = this.f88310x;
        if (gifController != null) {
            gifController.setLoadingViewImageInfo(c3979l);
        }
    }

    public void setLooping(boolean z11) {
        this.f88315z0 = z11;
    }

    public void setMute(boolean z11) {
        this.f88225B0 = z11;
        IMediaPlayer iMediaPlayer = this.f88302t;
        if (iMediaPlayer != null) {
            if (z11) {
                iMediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                iMediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    public void setOnCacheListener(AbstractC17297a.b bVar) {
        this.f88229D0 = bVar;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f88242K = onCompletionListener;
    }

    public void setOnDimAlphaChangedListener(InterfaceC17325n interfaceC17325n) {
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f88246M = onErrorListener;
    }

    public void setOnFullScreenChangedListener(InterfaceC17326o interfaceC17326o) {
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f88248N = onInfoListener;
    }

    public void setOnLoadLibraryCompletedListener(InterfaceC17327p interfaceC17327p) {
    }

    public void setOnPlayerStateChangedListener(InterfaceC17328q interfaceC17328q) {
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f88244L = onPreparedListener;
    }

    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.f88250O = onSeekCompleteListener;
    }

    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.f88282f1 = onVideoSizeChangedListener;
    }

    public void setPendingUpdateSurface(boolean z11) {
        this.f88264V = z11;
    }

    public void setPlayConfig(ZMediaPlayerSettings.PlayConfig playConfig) {
        this.f88239I0 = playConfig;
        if (playConfig != null) {
            setLooping(playConfig.isLoopInfinite());
        }
    }

    public void setRender(int i11) {
        if (i11 != 0) {
            if (i11 != 2) {
                AbstractC23350e.m122774d("ZGifView", String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i11)));
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
        if (this.f88281f0 != null) {
            IMediaPlayer iMediaPlayer = this.f88302t;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f88281f0.getView();
            this.f88281f0.mo89167d(this.f88269Y0);
            this.f88281f0 = null;
            removeView(view);
        }
        if (interfaceC16725a == null) {
            return;
        }
        this.f88281f0 = interfaceC16725a;
        interfaceC16725a.setAspectRatio(this.f88274b1);
        if (this.f88236H > 0 && this.f88238I > 0) {
            m92342K();
        }
        int i12 = this.f88288j0;
        if (i12 > 0 && (i11 = this.f88289k0) > 0) {
            interfaceC16725a.mo89164a(i12, i11);
        }
        View view2 = this.f88281f0.getView();
        this.f88285h0 = new FrameLayout.LayoutParams(-2, -2, 17);
        this.f88281f0.mo89165b(this.f88269Y0);
        view2.setLayoutParams(this.f88285h0);
        addView(view2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f88287i0 = layoutParams;
        layoutParams.addRule(13, -1);
    }

    public void setRoundCorner(boolean z11) {
        this.f88223A0 = z11;
        if (z11) {
            setBackgroundColor(getResources().getColor(C17395R.color.transparent));
            setRoundCorner(AbstractC17358g.m92489b(getContext(), 10.0f));
        } else {
            setOutlineProvider(null);
            setClipToOutline(false);
        }
    }

    public void setSkipShowControlWhenStart(boolean z11) {
        this.f88241J0 = z11;
    }

    public void setTrimmed(boolean z11) {
        this.f88227C0 = z11;
    }

    public void setUseVideoRatio(boolean z11) {
        this.f88276c1 = z11;
    }

    public void setVideoPlayerMode(int i11) {
        this.f88231E0 = i11;
        InterfaceC16725a interfaceC16725a = this.f88281f0;
        if (interfaceC16725a != null && (interfaceC16725a instanceof TextureView)) {
            ((TextureView) this.f88281f0).setTransform(new Matrix());
        }
        m92342K();
    }

    public void setVideoRatio(float f11) {
        if (f11 <= 0.0f || f11 == this.f88234G) {
            return;
        }
        this.f88234G = f11;
    }

    public void setViewRatio(float f11) {
        if (f11 <= 0.0f) {
            return;
        }
        this.f88280e1 = f11;
        requestLayout();
    }

    public void setVolume(float f11) {
        this.f88270Z0 = f11;
        IMediaPlayer iMediaPlayer = this.f88302t;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(f11, f11);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        m92334C("Start");
        if (m92360u()) {
            this.f88302t.start();
            setCurrentState(3);
            this.f88305u0 = false;
            this.f88298r = 0;
            return;
        }
        if (this.f88296q == 1) {
            this.f88298r = 3;
        }
    }

    /* renamed from: u */
    public boolean m92360u() {
        int i11;
        return (this.f88302t == null || (i11 = this.f88296q) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    public void setRoundCorner(int i11) {
        this.f88223A0 = true;
        setBackgroundColor(getResources().getColor(C17395R.color.transparent));
        setOutlineProvider(new C17315d(i11));
        setClipToOutline(true);
    }

    public ZGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88296q = 0;
        this.f88298r = 0;
        this.f88300s = null;
        this.f88302t = null;
        this.f88306v = 0;
        this.f88308w = 0;
        this.f88224B = false;
        this.f88226C = false;
        this.f88234G = 1.0f;
        this.f88236H = 0;
        this.f88238I = 0;
        this.f88240J = true;
        this.f88258S = true;
        this.f88260T = true;
        this.f88262U = true;
        this.f88264V = false;
        this.f88266W = false;
        this.f88271a0 = false;
        this.f88273b0 = false;
        this.f88290l0 = 0L;
        this.f88291m0 = 0L;
        this.f88292n0 = 0L;
        this.f88293o0 = 0L;
        this.f88295p0 = true;
        this.f88297q0 = false;
        this.f88299r0 = 0;
        this.f88301s0 = false;
        this.f88303t0 = -1;
        this.f88305u0 = false;
        this.f88307v0 = true;
        this.f88309w0 = false;
        this.f88311x0 = false;
        this.f88313y0 = false;
        this.f88315z0 = false;
        this.f88223A0 = false;
        this.f88225B0 = false;
        this.f88227C0 = false;
        this.f88231E0 = 0;
        this.f88241J0 = false;
        this.f88243K0 = 0;
        this.f88245L0 = 0;
        this.f88251O0 = new RunnableC17316e();
        this.f88253P0 = new C17319h();
        this.f88255Q0 = new C17320i();
        this.f88257R0 = new C17321j();
        this.f88259S0 = new C17322k();
        this.f88261T0 = new IMediaPlayer.OnErrorListener() { // from class: com.zing.zalo.zmedia.view.p
            public /* synthetic */ C17376p() {
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                boolean m92331y;
                m92331y = ZGifView.this.m92331y(iMediaPlayer, i11, i12);
                return m92331y;
            }
        };
        this.f88263U0 = new C17323l();
        this.f88265V0 = new C17324m();
        this.f88267W0 = new C17312a();
        this.f88268X0 = new C17313b();
        this.f88269Y0 = new C17314c();
        this.f88270Z0 = 1.0f;
        this.f88272a1 = 0;
        this.f88274b1 = f88221i1[0];
        this.f88276c1 = true;
        this.f88280e1 = 1.7777778f;
        this.f88286h1 = 0.0f;
        m92358q(context);
    }
}
