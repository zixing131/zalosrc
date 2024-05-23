package com.zing.zalo.camera.videos.videotrim;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.videos.customviews.AbstractC7767a;
import com.zing.zalo.camera.videos.customviews.VideoSeekBarView;
import com.zing.zalo.camera.videos.customviews.VideoTimelineView;
import com.zing.zalo.camera.videos.videotrim.VideoTrimView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.C20131e;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p227i3.C20218v;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p649xl.C29716ae;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.C28075g8;

/* loaded from: classes3.dex */
public final class VideoTrimView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private final InterfaceC24854k f41748M0;

    /* renamed from: N0 */
    private String f41749N0;

    /* renamed from: O0 */
    private String f41750O0;

    /* renamed from: P0 */
    private String f41751P0;

    /* renamed from: Q0 */
    private int f41752Q0;

    /* renamed from: R0 */
    private int f41753R0;

    /* renamed from: S0 */
    private C17391z f41754S0;

    /* renamed from: T0 */
    private VideoTimelineView f41755T0;

    /* renamed from: U0 */
    private VideoSeekBarView f41756U0;

    /* renamed from: V0 */
    private C3977j f41757V0;

    /* renamed from: W0 */
    private boolean f41758W0;

    /* renamed from: X0 */
    private boolean f41759X0;

    /* renamed from: Y0 */
    private boolean f41760Y0;

    /* renamed from: Z0 */
    private int f41761Z0;

    /* renamed from: a1 */
    private float f41762a1;

    /* renamed from: b1 */
    private boolean f41763b1;

    /* renamed from: c1 */
    private Thread f41764c1;

    /* renamed from: d1 */
    private C29716ae f41765d1;

    /* renamed from: e1 */
    private AbstractC7767a f41766e1;

    /* renamed from: f1 */
    private IMediaPlayer.OnInfoListener f41767f1;

    /* renamed from: g1 */
    private ZVideoView.InterfaceC17345q f41768g1;

    /* renamed from: h1 */
    private Runnable f41769h1;

    /* renamed from: i1 */
    private AbstractC17297a.b f41770i1;

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$a */
    /* loaded from: classes3.dex */
    static final class C7782a extends AbstractC19075u implements InterfaceC18494a {
        C7782a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(VideoTrimView.this.m92648SI());
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$b */
    /* loaded from: classes3.dex */
    public static final class C7783b implements AbstractC17297a.b {
        C7783b() {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: cH */
        public void mo39665cH(C17391z c17391z, CacheException cacheException) {
            AbstractC19074t.m100208f(c17391z, "video");
            AbstractC19074t.m100208f(cacheException, "exception");
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: qH */
        public void mo39666qH(C17391z c17391z) {
            AbstractC19074t.m100208f(c17391z, "video");
            try {
                if (VideoTrimView.this.f41754S0 != null) {
                    C17391z c17391z2 = VideoTrimView.this.f41754S0;
                    AbstractC19074t.m100205c(c17391z2);
                    if (TextUtils.equals(c17391z2.f88620c, c17391z.f88620c)) {
                        VideoTrimView.this.m39650oM().f137266x.m92419m0(false);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: tE */
        public void mo39667tE(C17391z c17391z) {
            AbstractC19074t.m100208f(c17391z, "video");
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$c */
    /* loaded from: classes3.dex */
    public static final class C7784c extends RecyclerView.AbstractC1892s {
        C7784c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 && i12 != 0) {
                VideoTrimView.this.m39663xM(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$d */
    /* loaded from: classes3.dex */
    public static final class C7785d extends C23999j {
        C7785d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            if (c3979l != null) {
                VideoTrimView.this.m39650oM().f137266x.setLoadingViewImageInfo(c3979l);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$e */
    /* loaded from: classes3.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC7786e implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC7786e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (VideoTrimView.this.m39650oM().f137267y.getWidth() > 0 && VideoTrimView.this.m39650oM().f137267y.getHeight() > 0) {
                VideoTrimView.this.m39650oM().f137266x.setViewRatio((VideoTrimView.this.m39650oM().f137267y.getWidth() * 1.0f) / VideoTrimView.this.m39650oM().f137267y.getHeight());
                VideoTrimView.this.m39650oM().f137267y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videotrim.VideoTrimView$f */
    /* loaded from: classes3.dex */
    public static final class C7787f extends AbstractC7767a {
        C7787f() {
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: a */
        public String mo39607a() {
            return AbstractC23160o0.m119258i0(Math.floor(VideoTrimView.this.m39651qM() / 1000.0d));
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: b */
        public String mo39608b() {
            return AbstractC23160o0.m119258i0(Math.floor(VideoTrimView.this.m39662sM() / 1000.0d));
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: d */
        public void mo39610d(float f11) {
            VideoTrimView.this.m39663xM(false);
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: e */
        public void mo39611e(float f11) {
            VideoTrimView.this.m39663xM(true);
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: f */
        public void mo39612f(float f11) {
            VideoTrimView.this.m39663xM(false);
        }
    }

    public VideoTrimView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C7782a());
        this.f41748M0 = m129210a;
        this.f41749N0 = "";
        this.f41750O0 = "";
        this.f41751P0 = "";
        this.f41753R0 = Integer.MAX_VALUE;
        this.f41761Z0 = -1;
        this.f41766e1 = new C7787f();
        this.f41767f1 = new IMediaPlayer.OnInfoListener() { // from class: rf.b
            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
                boolean m39653uM;
                m39653uM = VideoTrimView.m39653uM(VideoTrimView.this, iMediaPlayer, i11, i12, obj);
                return m39653uM;
            }
        };
        this.f41768g1 = new ZVideoView.InterfaceC17345q() { // from class: rf.c
            @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
            /* renamed from: D */
            public final void mo44076D(int i11) {
                VideoTrimView.m39655wM(VideoTrimView.this, i11);
            }
        };
        this.f41769h1 = new Runnable() { // from class: rf.d
            @Override // java.lang.Runnable
            public final void run() {
                VideoTrimView.m39657zM(VideoTrimView.this);
            }
        };
        this.f41770i1 = new C7783b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m39631AM(VideoTrimView videoTrimView) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        videoTrimView.m39654vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m39632BM(VideoTrimView videoTrimView) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        videoTrimView.m39659EM(videoTrimView.m39650oM().f137266x.getCurrentPosition());
    }

    /* renamed from: C2 */
    private final C23528a m39633C2() {
        return (C23528a) this.f41748M0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m39634DM(VideoTrimView videoTrimView, int i11) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        videoTrimView.m39650oM().f137266x.seekTo(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x010a, code lost:            if (r2 != 6) goto L26;     */
    /* renamed from: FM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m39635FM() {
        float f11;
        int i11;
        m39650oM().f137266x.setAudioFocusControl(C28075g8.m141538e());
        m39650oM().f137266x.setOnPlayerStateChangedListener(this.f41768g1);
        m39650oM().f137266x.setOnInfoListener(this.f41767f1);
        m39650oM().f137266x.setOnCacheListener(this.f41770i1);
        if (this.f41751P0.length() > 0) {
            ((C23528a) m39633C2().m123612r(this.f41757V0)).m123579C(this.f41751P0, C23278z2.m120103W0(), new C7785d());
        } else {
            m39650oM().f137266x.setLoadingViewImageInfo(null);
        }
        m39650oM().f137266x.m92421n0(true);
        int[] m17448p = AbstractC3460h.m17448p(this.f41749N0);
        AbstractC19074t.m100207e(m17448p, "getVideoWidthHeight(...)");
        int i12 = m17448p[0];
        if (i12 > 0 && (i11 = m17448p[1]) > 0) {
            f11 = (i12 * 1.0f) / i11;
        } else {
            f11 = this.f41762a1;
        }
        C17391z c17391z = new C17391z(String.valueOf(System.currentTimeMillis()), "", this.f41749N0, "", this.f41751P0, C23278z2.m120136k0().f116260a, false, 9, f11, 8, this.f41749N0, "", 0);
        m39650oM().f137266x.setIsFocusing(true);
        m39650oM().f137266x.setZVideo(c17391z);
        m39650oM().f137266x.setUseVideoRatio(false);
        m39650oM().f137266x.setViewRatio(c17391z.f88626i);
        m39650oM().f137266x.setForceHideController(true);
        m39650oM().f137266x.setTrimmed(true);
        m39650oM().f137266x.setVideoPlayerMode(2);
        int currentState = m39650oM().f137266x.getCurrentState();
        if (currentState != -1 && currentState != 0) {
            if (currentState != 2 && currentState != 4) {
                if (currentState != 5) {
                }
            }
            m39650oM().f137266x.start();
            m39636GM(false);
            this.f41754S0 = c17391z;
            m39650oM().f137267y.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7786e());
        }
        m39650oM().f137266x.m92410d0();
        this.f41754S0 = c17391z;
        m39650oM().f137267y.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7786e());
    }

    /* renamed from: GM */
    private final void m39636GM(final boolean z11) {
        this.f72827B0.post(new Runnable() { // from class: rf.e
            @Override // java.lang.Runnable
            public final void run() {
                VideoTrimView.m39637HM(VideoTrimView.this, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m39637HM(VideoTrimView videoTrimView, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        ImageButton imageButton = videoTrimView.m39650oM().f137262t;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        imageButton.setVisibility(i11);
    }

    /* renamed from: IM */
    private final void m39638IM() {
        if (this.f41764c1 == null) {
            Thread thread = new Thread(this.f41769h1);
            this.f41764c1 = thread;
            AbstractC19074t.m100205c(thread);
            thread.start();
        }
    }

    /* renamed from: nM */
    private final boolean m39649nM() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92686rK(), new String[]{"android.permission.CAMERA"}) != 0) {
                    return false;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public final C29716ae m39650oM() {
        C29716ae c29716ae = this.f41765d1;
        AbstractC19074t.m100205c(c29716ae);
        return c29716ae;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final int m39651qM() {
        VideoTimelineView videoTimelineView = this.f41755T0;
        AbstractC19074t.m100205c(videoTimelineView);
        int startPoint = videoTimelineView.getStartPoint();
        VideoSeekBarView videoSeekBarView = this.f41756U0;
        AbstractC19074t.m100205c(videoSeekBarView);
        double rightProgress = videoSeekBarView.getRightProgress();
        AbstractC19074t.m100205c(this.f41755T0);
        return startPoint + ((int) Math.ceil(rightProgress * r3.getVisibleLength()));
    }

    /* renamed from: tM */
    private final void m39652tM() {
        int m39662sM = m39662sM();
        int m39651qM = m39651qM() - m39662sM;
        Intent intent = new Intent();
        intent.putExtra("video_input_path", this.f41749N0);
        intent.putExtra("mark_video_position_only", this.f41763b1);
        intent.putExtra("video_output_path", this.f41750O0);
        intent.putExtra("video_output_start_position", m39662sM);
        intent.putExtra("video_output_play_duration", m39651qM);
        if (this.f41763b1) {
            mo50035CK(-1, intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final boolean m39653uM(VideoTrimView videoTrimView, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        if (iMediaPlayer != null && i11 == 3) {
            try {
                videoTrimView.m39650oM().f137266x.m92421n0(false);
                videoTrimView.f41759X0 = true;
                if (!videoTrimView.m92672lJ()) {
                    videoTrimView.m39650oM().f137266x.pause();
                    videoTrimView.m39636GM(true);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return false;
    }

    /* renamed from: vM */
    private final void m39654vM() {
        try {
            if (this.f41756U0 != null) {
                int m39662sM = m39662sM();
                m39650oM().f137266x.seekTo(m39662sM);
                m39659EM(m39662sM);
            }
            m39650oM().f137266x.start();
            m39636GM(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m39655wM(VideoTrimView videoTrimView, int i11) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        try {
            if (i11 != -1) {
                if (i11 != 5) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (videoTrimView.f41760Y0) {
                                videoTrimView.m39650oM().f137266x.seekTo(videoTrimView.m39662sM());
                                videoTrimView.f41760Y0 = false;
                            }
                            videoTrimView.m39638IM();
                            return;
                        }
                        return;
                    }
                    videoTrimView.f41758W0 = true;
                    if (videoTrimView.f41755T0 != null) {
                        int i12 = videoTrimView.f41753R0;
                        int i13 = videoTrimView.f41752Q0;
                        if (1 <= i13 && i13 < i12) {
                            VideoSeekBarView videoSeekBarView = videoTrimView.f41756U0;
                            AbstractC19074t.m100205c(videoSeekBarView);
                            videoSeekBarView.setMinProgress((videoTrimView.f41752Q0 * 1.0f) / videoTrimView.f41753R0);
                        }
                        videoTrimView.m39658CM((int) videoTrimView.m39660pM());
                        return;
                    }
                    return;
                }
                videoTrimView.m39654vM();
                return;
            }
            videoTrimView.f41758W0 = false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: yM */
    private final void m39656yM() {
        if (!this.f41758W0) {
            return;
        }
        try {
            if (m39650oM().f137266x.getCurrentState() == 3) {
                m39650oM().f137266x.pause();
                m39636GM(true);
            } else {
                m39650oM().f137266x.start();
                m39636GM(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m39657zM(final VideoTrimView videoTrimView) {
        AbstractC19074t.m100208f(videoTrimView, "this$0");
        while (videoTrimView.f41765d1 != null) {
            if (videoTrimView.m39650oM().f137266x.getCurrentState() == 3) {
                videoTrimView.f72827B0.post(new Runnable() { // from class: rf.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoTrimView.m39632BM(VideoTrimView.this);
                    }
                });
                try {
                    if (videoTrimView.m39650oM().f137266x.getCurrentPosition() >= videoTrimView.m39651qM()) {
                        videoTrimView.m39650oM().f137266x.pause();
                        videoTrimView.m39636GM(true);
                        videoTrimView.m39650oM().f137266x.post(new Runnable() { // from class: rf.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                VideoTrimView.m39631AM(VideoTrimView.this);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        videoTrimView.f41764c1 = null;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (!m39649nM()) {
            finish();
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("video_input_path");
            String str = "";
            if (string == null) {
                string = "";
            } else {
                AbstractC19074t.m100205c(string);
            }
            this.f41749N0 = string;
            String string2 = m92642L3.getString("video_output_path");
            if (string2 == null) {
                string2 = "";
            } else {
                AbstractC19074t.m100205c(string2);
            }
            this.f41750O0 = string2;
            if (string2.length() == 0) {
                this.f41750O0 = C20131e.m104920n0() + System.currentTimeMillis() + ".mp4";
            }
            String string3 = m92642L3.getString("video_thumb_path");
            if (string3 != null) {
                AbstractC19074t.m100205c(string3);
                str = string3;
            }
            this.f41751P0 = str;
            this.f41752Q0 = m92642L3.getInt("min_video_duration", 0);
            this.f41753R0 = m92642L3.getInt("max_video_duration", Integer.MAX_VALUE);
            this.f41763b1 = m92642L3.getBoolean("mark_video_position_only", false);
        }
        this.f41762a1 = (AbstractC23136l9.m118722k0() * 1.0f) / AbstractC23136l9.m118713h0();
    }

    /* renamed from: CM */
    public final void m39658CM(final int i11) {
        this.f72827B0.removeCallbacksAndMessages(null);
        this.f72827B0.postDelayed(new Runnable() { // from class: rf.a
            @Override // java.lang.Runnable
            public final void run() {
                VideoTrimView.m39634DM(VideoTrimView.this, i11);
            }
        }, 250L);
        m39659EM(i11);
    }

    /* renamed from: EM */
    public final void m39659EM(long j11) {
        int m39662sM = m39662sM();
        int m39651qM = m39651qM();
        if (m39662sM <= j11 && j11 <= m39651qM) {
            float ceil = (float) (Math.ceil((((float) (j11 - r2)) / m39661rM()) * 1000.0f) / 1000);
            VideoSeekBarView videoSeekBarView = this.f41756U0;
            AbstractC19074t.m100205c(videoSeekBarView);
            videoSeekBarView.setProgress(ceil);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f41765d1 = C29716ae.m147740c(layoutInflater, viewGroup, false);
        m39650oM().f137264v.setOnClickListener(this);
        m39650oM().f137266x.setBackgroundColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.black_1f1f1f));
        RecyclingImageView loadingView = m39650oM().f137266x.getLoadingView();
        if (loadingView != null) {
            loadingView.setBackgroundColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.black_1f1f1f));
        }
        VideoTimelineView videoTimelineView = new VideoTimelineView(this.f72421L0.m92648SI());
        videoTimelineView.m39597k2(videoTimelineView.getContext(), this.f41749N0, this.f41753R0, false);
        videoTimelineView.m9826E(new C7784c());
        this.f41755T0 = videoTimelineView;
        VideoSeekBarView videoSeekBarView = new VideoSeekBarView(this.f72421L0.m92648SI());
        videoSeekBarView.setVideoSeekBarListener(this.f41766e1);
        this.f41756U0 = videoSeekBarView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AbstractC23136l9.m118742r(59.5f), 80);
        int i11 = AbstractC23222t7.f112586t;
        layoutParams.setMargins(i11, 0, i11, AbstractC23222t7.f112552c);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 80);
        m39650oM().f137265w.addView(this.f41755T0, layoutParams);
        m39650oM().f137265w.addView(this.f41756U0, layoutParams2);
        m39650oM().f137262t.setOnClickListener(this);
        m39650oM().f137260r.setOnClickListener(this);
        m39650oM().f137261s.setOnClickListener(this);
        Context m92686rK = this.f72421L0.m92686rK();
        AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
        this.f41757V0 = new C3977j(m92686rK);
        m39635FM();
        RelativeLayout root = m39650oM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m39650oM().f137266x.setOnPlayerStateChangedListener(null);
        m39650oM().f137266x.setOnInfoListener(null);
        m39650oM().f137266x.m92415i0();
        m39650oM().f137266x.m92412f0(true);
        VideoTimelineView videoTimelineView = this.f41755T0;
        if (videoTimelineView != null) {
            videoTimelineView.m39596j2();
        }
        this.f72827B0.removeCallbacksAndMessages(null);
        Thread thread = this.f41764c1;
        if (thread != null) {
            thread.interrupt();
        }
        this.f41765d1 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        int m116580c;
        super.mo13886RJ();
        int currentState = m39650oM().f137266x.getCurrentState();
        if (currentState == 3 || currentState == 4) {
            m116580c = AbstractC22543l.m116580c(m39650oM().f137266x.getCurrentPosition() - 1000, 0);
            this.f41761Z0 = m116580c;
            m39650oM().f137266x.pause();
            m39636GM(true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "VideoTrimView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.video_clickable_view || id2 == AbstractC6918a0.play_pause_button) {
            m39656yM();
            return;
        }
        if (id2 == AbstractC6918a0.cancel_button) {
            mo50035CK(0, null);
            finish();
        } else if (id2 == AbstractC6918a0.done_button) {
            m39652tM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        VideoTimelineView videoTimelineView = this.f41755T0;
        if (videoTimelineView != null) {
            videoTimelineView.m39598n2(m92689tK());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (m92648SI() != null) {
            AbstractC23136l9.m118686X0(this, true);
        }
        int currentState = m39650oM().f137266x.getCurrentState();
        if (currentState == 2 || currentState == 4) {
            int i11 = this.f41761Z0;
            if (i11 >= 0) {
                m39658CM(i11);
            }
            this.f41761Z0 = -1;
            m39650oM().f137266x.start();
            m39636GM(false);
        }
    }

    /* renamed from: pM */
    public final long m39660pM() {
        double m39651qM = m39651qM() - m39662sM();
        long m39662sM = m39662sM();
        AbstractC19074t.m100205c(this.f41756U0);
        return m39662sM + ((long) Math.ceil(r4.getProgress() * m39651qM));
    }

    /* renamed from: rM */
    public final int m39661rM() {
        return (int) Math.ceil(m39651qM() - m39662sM());
    }

    /* renamed from: sM */
    public final int m39662sM() {
        VideoTimelineView videoTimelineView = this.f41755T0;
        AbstractC19074t.m100205c(videoTimelineView);
        int startPoint = videoTimelineView.getStartPoint();
        VideoSeekBarView videoSeekBarView = this.f41756U0;
        AbstractC19074t.m100205c(videoSeekBarView);
        double leftProgress = videoSeekBarView.getLeftProgress();
        AbstractC19074t.m100205c(this.f41755T0);
        return startPoint + ((int) Math.ceil(leftProgress * r3.getVisibleLength()));
    }

    /* renamed from: xM */
    public final void m39663xM(boolean z11) {
        try {
            if (this.f41758W0 && this.f41759X0) {
                if (m39650oM().f137266x.getCurrentState() == 3) {
                    m39650oM().f137266x.pause();
                    m39650oM().f137262t.setVisibility(0);
                }
                m39650oM().f137266x.setOnSeekCompleteListener(null);
                if (z11) {
                    m39658CM((int) m39660pM());
                } else {
                    m39658CM(m39662sM());
                }
                this.f41760Y0 = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
