package com.zing.zalo.zmedia.view;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.core.content.res.AbstractC1401h;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p354n3.C23528a;

/* loaded from: classes7.dex */
public class VideoController extends RelativeLayout implements InterfaceC17372n {

    /* renamed from: A */
    C23528a f88188A;

    /* renamed from: B */
    boolean f88189B;

    /* renamed from: C */
    boolean f88190C;

    /* renamed from: D */
    boolean f88191D;

    /* renamed from: E */
    boolean f88192E;

    /* renamed from: F */
    boolean f88193F;

    /* renamed from: G */
    boolean f88194G;

    /* renamed from: H */
    private boolean f88195H;

    /* renamed from: I */
    Handler f88196I;

    /* renamed from: J */
    View.OnClickListener f88197J;

    /* renamed from: K */
    View.OnClickListener f88198K;

    /* renamed from: L */
    long f88199L;

    /* renamed from: M */
    SeekBar.OnSeekBarChangeListener f88200M;

    /* renamed from: N */
    int f88201N;

    /* renamed from: O */
    boolean f88202O;

    /* renamed from: P */
    boolean f88203P;

    /* renamed from: Q */
    String f88204Q;

    /* renamed from: R */
    volatile String f88205R;

    /* renamed from: S */
    final Set f88206S;

    /* renamed from: p */
    Context f88207p;

    /* renamed from: q */
    View f88208q;

    /* renamed from: r */
    int f88209r;

    /* renamed from: s */
    public ViewOnClickListenerC17374o f88210s;

    /* renamed from: t */
    boolean f88211t;

    /* renamed from: u */
    boolean f88212u;

    /* renamed from: v */
    boolean f88213v;

    /* renamed from: w */
    View.OnClickListener f88214w;

    /* renamed from: x */
    boolean f88215x;

    /* renamed from: y */
    ZVideoView f88216y;

    /* renamed from: z */
    boolean f88217z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.VideoController$a */
    /* loaded from: classes7.dex */
    public class HandlerC17308a extends Handler {
        HandlerC17308a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        VideoController.this.m92283G();
                        sendMessageDelayed(obtainMessage(3), 1000L);
                        return;
                    }
                    return;
                }
                VideoController videoController = VideoController.this;
                if (videoController.f88216y != null) {
                    int m92293Q = videoController.m92293Q();
                    int currentState = VideoController.this.f88216y.getCurrentState();
                    VideoController videoController2 = VideoController.this;
                    if (!videoController2.f88211t) {
                        if (currentState == 1 || currentState == 2 || videoController2.f88216y.isPlaying()) {
                            sendMessageDelayed(obtainMessage(2), 40 - (m92293Q % 40));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            VideoController.this.m92312p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.VideoController$b */
    /* loaded from: classes7.dex */
    public class ViewOnClickListenerC17309b implements View.OnClickListener {
        ViewOnClickListenerC17309b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isPlaying = VideoController.this.f88216y.isPlaying();
            VideoController.this.m92311n();
            VideoController.this.m92305g();
            VideoController.this.m92282F(!isPlaying);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zmedia.view.VideoController$c */
    /* loaded from: classes7.dex */
    public class C17310c implements SeekBar.OnSeekBarChangeListener {
        C17310c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            ZVideoView zVideoView;
            if (z11 && (zVideoView = VideoController.this.f88216y) != null) {
                long duration = zVideoView.getDuration();
                VideoController videoController = VideoController.this;
                long j11 = (duration * i11) / 1000;
                videoController.f88199L = j11;
                videoController.f88210s.m92519l(j11);
                if (VideoController.this.f88216y.getCurrentState() == 5) {
                    VideoController.this.f88216y.start();
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            VideoController videoController = VideoController.this;
            videoController.f88211t = true;
            videoController.m92305g();
            VideoController.this.f88196I.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            VideoController videoController = VideoController.this;
            videoController.f88211t = false;
            videoController.f88216y.seekTo((int) videoController.f88199L);
            VideoController.this.m92293Q();
            VideoController.this.m92304c0();
            VideoController.this.m92305g();
            ZVideoView zVideoView = VideoController.this.f88216y;
            if (zVideoView != null && zVideoView.getCurrentState() == 5) {
                VideoController videoController2 = VideoController.this;
                videoController2.f88201N = videoController2.f88216y.getCurrentPosition();
            }
            VideoController.this.f88196I.sendEmptyMessage(2);
            VideoController videoController3 = VideoController.this;
            InterfaceC17372n interfaceC17372n = videoController3.f88210s.f88573k0;
            if (interfaceC17372n != null) {
                interfaceC17372n.mo79714XC(videoController3.f88199L);
            }
            VideoController videoController4 = VideoController.this;
            InterfaceC17372n interfaceC17372n2 = videoController4.f88210s.f88574l0;
            if (interfaceC17372n2 != null) {
                interfaceC17372n2.mo79714XC(videoController4.f88199L);
            }
        }
    }

    /* renamed from: com.zing.zalo.zmedia.view.VideoController$d */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC17311d {
        /* renamed from: a */
        public void mo61749a(boolean z11) {
        }

        /* renamed from: b */
        public void mo82405b(ZVideoView zVideoView, boolean z11) {
        }

        /* renamed from: c */
        public void mo81920c(boolean z11) {
        }

        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
        }
    }

    public VideoController(Context context) {
        this(context, true);
    }

    /* renamed from: A */
    public /* synthetic */ void m92268A(String str) {
        m92272Z(true, str);
    }

    /* renamed from: B */
    public /* synthetic */ void m92269B() {
        m92272Z(false, null);
    }

    /* renamed from: C */
    public /* synthetic */ void m92270C() {
        m92272Z(false, null);
    }

    /* renamed from: D */
    public /* synthetic */ void m92271D(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.length() > 0) {
                this.f88196I.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.i

                    /* renamed from: q */
                    public final /* synthetic */ String f88519q;

                    public /* synthetic */ RunnableC17362i(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoController.this.m92268A(r2);
                    }
                });
            } else {
                this.f88196I.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.j
                    public /* synthetic */ RunnableC17364j() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoController.this.m92269B();
                    }
                });
            }
        } catch (Exception e11) {
            this.f88196I.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.k
                public /* synthetic */ RunnableC17366k() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoController.this.m92270C();
                }
            });
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Z */
    private void m92272Z(boolean z11, String str) {
        InterfaceC17372n interfaceC17372n = this.f88210s.f88574l0;
        if (interfaceC17372n != null) {
            interfaceC17372n.mo81899F1(z11, str);
        }
    }

    private long getCurrentVideoPosition() {
        int currentPosition;
        if (this.f88216y.getCurrentState() == 5) {
            currentPosition = this.f88216y.getDuration();
        } else {
            currentPosition = this.f88216y.getCurrentPosition();
        }
        return currentPosition;
    }

    /* renamed from: y */
    public /* synthetic */ void m92279y() {
        m92286J(-1);
    }

    /* renamed from: z */
    public /* synthetic */ void m92280z() {
        try {
            this.f88205R = new File(this.f88204Q, CoreUtility.f89233i + "_video_snapshot_" + System.currentTimeMillis() + ".jpg").getAbsolutePath();
            ZVideoView zVideoView = this.f88216y;
            zVideoView.m92424p0(zVideoView.f88353K0, this.f88205R);
        } catch (Exception e11) {
            this.f88196I.post(new Runnable() { // from class: com.zing.zalo.zmedia.view.m
                public /* synthetic */ RunnableC17370m() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoController.this.m92279y();
                }
            });
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: E */
    void m92281E(boolean z11) {
        synchronized (this.f88206S) {
            try {
                Iterator it = this.f88206S.iterator();
                while (it.hasNext()) {
                    ((AbstractC17311d) it.next()).mo61749a(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: F */
    void m92282F(boolean z11) {
        synchronized (this.f88206S) {
            try {
                Iterator it = this.f88206S.iterator();
                while (it.hasNext()) {
                    ((AbstractC17311d) it.next()).mo82405b(this.f88216y, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: F1 */
    public void mo81899F1(boolean z11, String str) {
    }

    /* renamed from: G */
    void m92283G() {
        synchronized (this.f88206S) {
            try {
                if (this.f88216y == null) {
                    return;
                }
                long currentVideoPosition = getCurrentVideoPosition();
                long duration = this.f88216y.getDuration();
                Iterator it = this.f88206S.iterator();
                while (it.hasNext()) {
                    ((AbstractC17311d) it.next()).mo61750d(this.f88216y, currentVideoPosition, duration);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H */
    void m92284H(boolean z11) {
        synchronized (this.f88206S) {
            try {
                Iterator it = this.f88206S.iterator();
                while (it.hasNext()) {
                    ((AbstractC17311d) it.next()).mo81920c(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: I */
    void m92285I() {
        ZMediaPlayer zMediaPlayer;
        IMediaPlayer iMediaPlayer;
        ZVideoView zVideoView = this.f88216y;
        if (zVideoView != null && (iMediaPlayer = zVideoView.f88423t) != null && (iMediaPlayer instanceof ZMediaPlayer)) {
            zMediaPlayer = (ZMediaPlayer) iMediaPlayer;
        } else {
            zMediaPlayer = null;
        }
        if (zMediaPlayer == null || this.f88203P) {
            return;
        }
        this.f88203P = true;
        this.f88210s.m92531x(true);
        this.f88216y.pause();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.zmedia.view.l
            public /* synthetic */ RunnableC17368l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoController.this.m92280z();
            }
        });
    }

    /* renamed from: J */
    public void m92286J(int i11) {
        this.f88203P = false;
        this.f88210s.m92531x(false);
        String str = this.f88205R;
        this.f88205R = null;
        if (i11 >= 0 && !TextUtils.isEmpty(str)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.zmedia.view.h

                /* renamed from: q */
                public final /* synthetic */ String f88516q;

                public /* synthetic */ RunnableC17360h(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoController.this.m92271D(r2);
                }
            });
        } else {
            m92272Z(false, null);
        }
    }

    /* renamed from: K */
    public void m92287K() {
        m92308j();
        m92304c0();
    }

    /* renamed from: L */
    public void m92288L() {
        ViewOnClickListenerC17374o viewOnClickListenerC17374o = this.f88210s;
        if (viewOnClickListenerC17374o != null) {
            viewOnClickListenerC17374o.mo92479y(null);
        }
        synchronized (this.f88206S) {
            this.f88206S.clear();
        }
    }

    /* renamed from: M */
    public void m92289M(AbstractC17311d abstractC17311d) {
        if (abstractC17311d == null) {
            return;
        }
        synchronized (this.f88206S) {
            this.f88206S.remove(abstractC17311d);
        }
    }

    /* renamed from: N */
    public void m92290N() {
        this.f88216y = null;
        m92291O();
        m92301Y(false);
        m92297U(false);
        m92303b0();
    }

    /* renamed from: O */
    void m92291O() {
        this.f88210s.m92512e();
        this.f88196I.removeMessages(1);
        this.f88196I.removeMessages(2);
        this.f88196I.removeMessages(3);
    }

    /* renamed from: P */
    public void m92292P(int i11, int i12, int i13, int i14) {
        this.f88210s.m92518k(i11, i12, i13, i14);
    }

    /* renamed from: Q */
    int m92293Q() {
        ZVideoView zVideoView = this.f88216y;
        if (zVideoView != null && !this.f88211t) {
            long duration = zVideoView.getDuration();
            long currentVideoPosition = getCurrentVideoPosition();
            this.f88210s.m92530w(duration, currentVideoPosition, this.f88216y.getBufferPercentage());
            return (int) currentVideoPosition;
        }
        return 0;
    }

    /* renamed from: R */
    public void m92294R(int i11) {
        try {
            if (!this.f88189B) {
                m92293Q();
                ImageView imageView = this.f88210s.f88546J;
                if (imageView != null) {
                    imageView.requestFocus();
                }
                m92309l();
                boolean m92319x = m92319x();
                m92296T(true, true, i11);
                m92304c0();
                if (m92319x != m92319x()) {
                    m92284H(true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public void m92295S(boolean z11) {
        if (z11) {
            this.f88190C = false;
            if (this.f88189B) {
                return;
            }
        }
        this.f88210s.mo92480z(z11);
    }

    /* renamed from: T */
    public void m92296T(boolean z11, boolean z12, int i11) {
        if (z11) {
            try {
                if (this.f88189B) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f88210s.mo92477A(z11, z12);
        if (z11) {
            this.f88196I.removeMessages(2);
            this.f88196I.removeMessages(1);
            this.f88196I.sendEmptyMessage(2);
            if (i11 >= 0 && this.f88195H) {
                this.f88196I.sendMessageDelayed(this.f88196I.obtainMessage(1), i11);
            }
        }
        AbstractC17358g.m92498k(this.f88210s.f88540D, 8);
    }

    /* renamed from: U */
    public void m92297U(boolean z11) {
        AbstractC20110a.m104535d("showErrorView: %s", Boolean.valueOf(z11));
        this.f88210s.m92501B(z11);
        if (z11) {
            m92294R(-1);
        }
    }

    /* renamed from: V */
    public void m92298V(boolean z11) {
        AbstractC20110a.m104535d("showLoadingProgress: %s", Boolean.valueOf(z11));
        if (z11) {
            this.f88190C = false;
        }
        this.f88210s.m92502C(z11);
        m92281E(z11);
    }

    /* renamed from: W */
    public void m92299W(boolean z11, boolean z12) {
        AbstractC20110a.m104535d("showLoadingView: %s", Boolean.valueOf(z11));
        this.f88210s.m92503D(z11, z12);
        m92281E(z11);
    }

    /* renamed from: X */
    public void m92300X(boolean z11) {
        if (z11) {
            this.f88190C = false;
            if (this.f88189B) {
                return;
            }
        }
        this.f88210s.m92504E(z11);
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: XC */
    public void mo79714XC(long j11) {
    }

    /* renamed from: Y */
    public void m92301Y(boolean z11) {
        AbstractC20110a.m104535d("showRetryButton: %s", Boolean.valueOf(z11));
        if (z11) {
            this.f88190C = true;
            if (this.f88189B) {
                return;
            }
        } else {
            this.f88190C = false;
        }
        this.f88210s.m92505F(z11);
        if (z11) {
            m92294R(-1);
        }
    }

    /* renamed from: a0 */
    public void m92302a0() {
        m92303b0();
        this.f88196I.sendEmptyMessage(3);
    }

    /* renamed from: b0 */
    public void m92303b0() {
        this.f88196I.removeMessages(3);
    }

    /* renamed from: c0 */
    public void m92304c0() {
        if (this.f88208q != null && this.f88210s.f88546J != null && this.f88216y != null) {
            this.f88196I.removeMessages(2);
            this.f88196I.sendEmptyMessage(2);
            if (this.f88209r == 0) {
                this.f88210s.m92526s(this.f88216y.isPlaying());
            } else {
                this.f88210s.m92526s(false);
            }
        }
    }

    /* renamed from: g */
    public void m92305g() {
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        TrackSeekBar trackSeekBar;
        boolean z11;
        ZVideoView zVideoView;
        try {
            if (!this.f88211t && (zVideoView = this.f88216y) != null && zVideoView.getCurrentState() == 3) {
                m92294R(3000);
            } else {
                m92294R(-1);
            }
            ZVideoView zVideoView2 = this.f88216y;
            if (zVideoView2 != null && (viewOnClickListenerC17374o = this.f88210s) != null && (trackSeekBar = viewOnClickListenerC17374o.f88577q) != null) {
                if (zVideoView2.getDuration() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                trackSeekBar.setEnableTouch(z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public View getBottomControlLayout() {
        return this.f88210s.f88583w;
    }

    public View.OnClickListener getOnFullScreenListener() {
        return this.f88214w;
    }

    /* renamed from: h */
    public void m92306h(boolean z11) {
        ZVideoView zVideoView = this.f88216y;
        if (zVideoView != null && zVideoView.getCurrentState() == 3) {
            m92296T(z11, false, 3000);
        } else {
            m92296T(z11, false, -1);
        }
        if (z11) {
            m92284H(true);
        }
    }

    /* renamed from: i */
    public void m92307i(AbstractC17311d abstractC17311d) {
        if (abstractC17311d == null) {
            return;
        }
        synchronized (this.f88206S) {
            this.f88206S.add(abstractC17311d);
        }
    }

    /* renamed from: j */
    void m92308j() {
        boolean z11;
        ZVideoView zVideoView;
        IMediaPlayer iMediaPlayer;
        boolean z12 = false;
        if (this.f88202O && (zVideoView = this.f88216y) != null && (iMediaPlayer = zVideoView.f88423t) != null && (iMediaPlayer instanceof ZMediaPlayer) && !TextUtils.isEmpty(this.f88204Q)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f88210s.m92521n(z11);
        if (z11 && this.f88210s.f88542F != null) {
            int currentState = this.f88216y.getCurrentState();
            if (currentState == 3 || currentState == 4) {
                z12 = true;
            }
            this.f88210s.f88542F.setEnabled(z12);
        }
    }

    /* renamed from: k */
    protected ViewOnClickListenerC17374o mo92260k() {
        return new ViewOnClickListenerC17374o();
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: k3 */
    public boolean mo79717k3(View view) {
        int id2 = view.getId();
        if (id2 == C17395R.id.video_btn_mute) {
            ZVideoView zVideoView = this.f88216y;
            if (zVideoView != null) {
                zVideoView.setMute(!zVideoView.m92403J());
            }
        } else {
            int i11 = 0;
            if (id2 == C17395R.id.video_btn_fullscreen) {
                try {
                    setFullScreen(!this.f88215x);
                    View.OnClickListener onClickListener = this.f88214w;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else if (id2 == C17395R.id.video_btn_play) {
                View.OnClickListener onClickListener2 = this.f88197J;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            } else if (id2 == C17395R.id.video_btn_retry) {
                View.OnClickListener onClickListener3 = this.f88198K;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            } else if (id2 == C17395R.id.video_btn_fast_forward) {
                ZVideoView zVideoView2 = this.f88216y;
                if (zVideoView2 == null) {
                    return false;
                }
                this.f88216y.seekTo(zVideoView2.getCurrentPosition() + 15000);
                m92293Q();
                m92305g();
            } else if (id2 == C17395R.id.video_btn_rewind) {
                if (this.f88216y == null) {
                    return false;
                }
                this.f88216y.seekTo(r5.getCurrentPosition() - 5000);
                m92293Q();
                m92305g();
            } else if (id2 == C17395R.id.video_btn_snapshot) {
                ZVideoView zVideoView3 = this.f88216y;
                if (zVideoView3 != null) {
                    i11 = zVideoView3.getCurrentState();
                }
                if (!TextUtils.isEmpty(this.f88204Q) && !this.f88203P && (i11 == 3 || i11 == 4)) {
                    m92285I();
                } else {
                    m92286J(-1);
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    void m92309l() {
        ZVideoView zVideoView = this.f88216y;
        if (zVideoView == null) {
            return;
        }
        try {
            if (this.f88210s.f88546J != null && !zVideoView.canPause()) {
                this.f88210s.f88546J.setEnabled(false);
            }
            if (this.f88210s.f88586z != null && !this.f88216y.canSeekBackward()) {
                this.f88210s.f88586z.setEnabled(false);
            }
            if (this.f88210s.f88585y != null && !this.f88216y.canSeekForward()) {
                this.f88210s.f88585y.setEnabled(false);
            }
        } catch (IncompatibleClassChangeError unused) {
        }
    }

    /* renamed from: m */
    public void m92310m() {
        ImageView imageView = this.f88210s.f88581u;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    /* renamed from: n */
    public void m92311n() {
        ZVideoView zVideoView = this.f88216y;
        if (zVideoView == null) {
            return;
        }
        switch (zVideoView.getCurrentState()) {
            case -1:
            case 0:
            case 6:
                this.f88216y.m92410d0();
                return;
            case 1:
                m92298V(true);
                this.f88216y.start();
                return;
            case 2:
            case 4:
            case 5:
                this.f88216y.start();
                int i11 = this.f88201N;
                if (i11 != -1) {
                    this.f88216y.seekTo(i11);
                    this.f88201N = -1;
                    return;
                }
                return;
            case 3:
                this.f88216y.pause();
                return;
            default:
                return;
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (this.f88217z && this.f88215x) {
            m92292P(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f88196I.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MediaController.class.getName());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        boolean z11;
        ZVideoView zVideoView;
        ImageView imageView;
        if (keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 79 && i11 != 85 && i11 != 62) {
            if (i11 == 126) {
                ZVideoView zVideoView2 = this.f88216y;
                if (zVideoView2 != null && z11 && !zVideoView2.isPlaying()) {
                    this.f88216y.start();
                    m92304c0();
                    m92305g();
                }
                return true;
            }
            if (i11 != 86 && i11 != 127) {
                if (i11 != 25 && i11 != 24 && i11 != 164 && i11 != 27) {
                    if (i11 == 82) {
                        if (z11) {
                            m92312p();
                        }
                        return false;
                    }
                    if (i11 == 4) {
                        if (z11) {
                            m92312p();
                        }
                        if (!this.f88215x || (imageView = this.f88210s.f88581u) == null) {
                            return false;
                        }
                        imageView.performClick();
                        return true;
                    }
                    m92305g();
                    return super.onKeyUp(i11, keyEvent);
                }
                return super.onKeyUp(i11, keyEvent);
            }
            if (z11 && (zVideoView = this.f88216y) != null && zVideoView.isPlaying()) {
                this.f88216y.pause();
                m92304c0();
                m92305g();
            }
            return true;
        }
        if (z11) {
            m92311n();
            m92305g();
            ImageView imageView2 = this.f88210s.f88546J;
            if (imageView2 != null) {
                imageView2.requestFocus();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f88189B) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f88209r == 0) {
                if (m92319x()) {
                    m92312p();
                } else {
                    m92305g();
                }
            } else {
                View.OnClickListener onClickListener = this.f88214w;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        m92305g();
        return false;
    }

    /* renamed from: p */
    public void m92312p() {
        m92313q(true);
    }

    /* renamed from: q */
    public void m92313q(boolean z11) {
        try {
            boolean m92319x = m92319x();
            m92296T(false, z11, -1);
            if (m92319x != m92319x()) {
                m92284H(false);
            }
        } catch (Exception unused) {
            AbstractC20110a.m104545n("already removed", new Object[0]);
        }
    }

    /* renamed from: r */
    void m92314r() {
        int i11;
        this.f88210s.m92520m(this.f88191D);
        ImageView imageView = this.f88210s.f88546J;
        if (imageView != null) {
            imageView.requestFocus();
        }
        View view = this.f88210s.f88548L;
        if (view != null) {
            view.requestFocus();
        }
        ImageView imageView2 = this.f88210s.f88585y;
        int i12 = 4;
        if (imageView2 != null) {
            if (this.f88212u) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            AbstractC17358g.m92498k(imageView2, i11);
        }
        ImageView imageView3 = this.f88210s.f88586z;
        if (imageView3 != null) {
            if (this.f88212u) {
                i12 = 0;
            }
            AbstractC17358g.m92498k(imageView3, i12);
        }
        TrackSeekBar trackSeekBar = this.f88210s.f88577q;
        if (trackSeekBar != null) {
            trackSeekBar.setOnSeekBarChangeListener(this.f88200M);
        }
    }

    /* renamed from: s */
    void m92315s() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        setDescendantFocusability(262144);
    }

    public void setAllowAdaptiveShowControls(boolean z11) {
        this.f88195H = z11;
        if (!z11) {
            this.f88196I.removeMessages(1);
        }
    }

    public void setAllowShowLoadingView(boolean z11) {
        this.f88210s.m92515h(z11);
    }

    public void setComponentEnabled(boolean z11) {
        this.f88210s.m92522o(z11);
        m92309l();
        super.setEnabled(z11);
    }

    public void setEnableFullScreen(boolean z11) {
        this.f88191D = z11;
        this.f88210s.m92520m(z11);
    }

    public void setEnableSnapshot(boolean z11) {
        this.f88202O = z11;
        m92308j();
    }

    public void setForceHideController(boolean z11) {
        this.f88189B = z11;
    }

    public void setFullScreen(boolean z11) {
        this.f88215x = z11;
        this.f88210s.m92524q(z11);
    }

    public void setIsFocusing(boolean z11) {
        this.f88217z = z11;
    }

    public void setLoadingViewFromVideo(C17391z c17391z) {
        String str;
        C23528a c23528a;
        C3979l m123610p;
        if (c17391z != null && (str = c17391z.f88622e) != null && !str.equals("") && (c23528a = this.f88188A) != null && (m123610p = c23528a.m123610p(c17391z.f88622e, AbstractC17358g.m92491d())) != null && m123610p.m18839c() != null) {
            setLoadingViewImageInfo(m123610p);
        }
    }

    public void setLoadingViewImageInfo(C3979l c3979l) {
        this.f88210s.m92527t(c3979l);
    }

    public void setLoadingViewLayoutParams(RelativeLayout.LayoutParams layoutParams) {
        this.f88210s.m92528u(layoutParams);
    }

    public void setLoadingViewScaleType(ImageView.ScaleType scaleType) {
        this.f88210s.m92529v(scaleType);
    }

    public void setMediaPlayer(ZVideoView zVideoView) {
        this.f88216y = zVideoView;
        if (zVideoView == null) {
            m92304c0();
        }
    }

    public void setMute(boolean z11) {
        this.f88192E = z11;
        this.f88210s.m92525r(z11);
    }

    public void setNextEnabled(boolean z11) {
        float f11;
        this.f88193F = z11;
        ImageView imageView = this.f88210s.f88537A;
        if (imageView != null) {
            imageView.setEnabled(z11);
            ImageView imageView2 = this.f88210s.f88537A;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            imageView2.setAlpha(f11);
        }
    }

    public void setOnFullScreenClickListener(View.OnClickListener onClickListener) {
        this.f88214w = onClickListener;
    }

    public void setPlayListener(View.OnClickListener onClickListener) {
        this.f88197J = onClickListener;
    }

    public void setPreviousEnabled(boolean z11) {
        float f11;
        this.f88194G = z11;
        ImageView imageView = this.f88210s.f88538B;
        if (imageView != null) {
            imageView.setEnabled(z11);
            ImageView imageView2 = this.f88210s.f88538B;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            imageView2.setAlpha(f11);
        }
    }

    public void setRetryListener(View.OnClickListener onClickListener) {
        this.f88198K = onClickListener;
    }

    public void setSnapShotFolder(String str) {
        this.f88204Q = str;
        m92308j();
    }

    public void setUseNextPrevious(boolean z11) {
        int i11;
        this.f88213v = z11;
        ImageView imageView = this.f88210s.f88537A;
        int i12 = 4;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        AbstractC17358g.m92498k(imageView, i11);
        ImageView imageView2 = this.f88210s.f88538B;
        if (this.f88213v) {
            i12 = 0;
        }
        AbstractC17358g.m92498k(imageView2, i12);
    }

    public void setViewMode(int i11) {
        if (this.f88209r != i11) {
            this.f88209r = i11;
            if (i11 == 1) {
                m92296T(false, false, -1);
                this.f88210s.m92526s(false);
            }
        }
    }

    /* renamed from: u */
    public void m92316u(int i11) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f88207p.getSystemService("layout_inflater");
        if (i11 != 0) {
            this.f88208q = layoutInflater.inflate(i11, (ViewGroup) this, true);
        } else {
            this.f88208q = this;
        }
        ViewOnClickListenerC17374o mo92260k = mo92260k();
        this.f88210s = mo92260k;
        mo92260k.mo92478d(this.f88208q);
        this.f88210s.f88573k0 = this;
        setBackgroundColor(AbstractC1401h.m7080d(getResources(), C17395R.color.transparent, null));
        m92314r();
        m92315s();
    }

    /* renamed from: v */
    public boolean m92317v(MotionEvent motionEvent) {
        if (!this.f88215x && !AbstractC17358g.m92497j(this.f88210s.f88583w, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public boolean m92318w() {
        RecyclingImageView recyclingImageView = this.f88210s.f88582v;
        if (recyclingImageView != null && recyclingImageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean m92319x() {
        boolean z11;
        boolean z12;
        ViewGroup viewGroup = this.f88210s.f88583w;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ViewGroup viewGroup2 = this.f88210s.f88584x;
        if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 && !z12) {
            return false;
        }
        return true;
    }

    public VideoController(Context context, boolean z11) {
        super(context);
        this.f88209r = 0;
        this.f88213v = false;
        this.f88215x = false;
        this.f88217z = false;
        this.f88189B = false;
        this.f88190C = false;
        this.f88191D = true;
        this.f88192E = false;
        this.f88193F = false;
        this.f88194G = false;
        this.f88195H = true;
        this.f88196I = new HandlerC17308a();
        this.f88197J = new ViewOnClickListenerC17309b();
        this.f88200M = new C17310c();
        this.f88201N = -1;
        this.f88203P = false;
        this.f88204Q = null;
        this.f88205R = null;
        this.f88206S = Collections.synchronizedSet(new HashSet());
        this.f88207p = context;
        this.f88212u = z11;
        Context context2 = getContext();
        this.f88207p = context2;
        this.f88188A = new C23528a(context2);
    }
}
