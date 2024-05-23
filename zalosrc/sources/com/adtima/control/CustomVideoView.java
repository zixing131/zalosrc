package com.adtima.control;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.VideoView;
import com.adtima.Adtima;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes2.dex */
public class CustomVideoView extends SurfaceView {

    /* renamed from: A */
    private int f15302A;

    /* renamed from: B */
    private int f15303B;

    /* renamed from: C */
    private MediaPlayer.OnCompletionListener f15304C;

    /* renamed from: D */
    private MediaPlayer.OnPreparedListener f15305D;

    /* renamed from: E */
    private int f15306E;

    /* renamed from: F */
    private MediaPlayer.OnErrorListener f15307F;

    /* renamed from: G */
    private MediaPlayer.OnInfoListener f15308G;

    /* renamed from: H */
    private int f15309H;

    /* renamed from: I */
    private boolean f15310I;

    /* renamed from: J */
    private boolean f15311J;

    /* renamed from: K */
    private boolean f15312K;

    /* renamed from: L */
    MediaPlayer.OnPreparedListener f15313L;

    /* renamed from: M */
    private Vector f15314M;

    /* renamed from: N */
    private MediaPlayer.OnCompletionListener f15315N;

    /* renamed from: O */
    private MediaPlayer.OnInfoListener f15316O;

    /* renamed from: P */
    private MediaPlayer.OnErrorListener f15317P;

    /* renamed from: Q */
    private MediaPlayer.OnBufferingUpdateListener f15318Q;

    /* renamed from: R */
    SurfaceHolder.Callback f15319R;

    /* renamed from: p */
    private String f15320p;

    /* renamed from: q */
    private Uri f15321q;

    /* renamed from: r */
    private Map f15322r;

    /* renamed from: s */
    private int f15323s;

    /* renamed from: t */
    private int f15324t;

    /* renamed from: u */
    private SurfaceHolder f15325u;

    /* renamed from: v */
    private MediaPlayer f15326v;

    /* renamed from: w */
    private int f15327w;

    /* renamed from: x */
    private int f15328x;

    /* renamed from: y */
    private int f15329y;

    /* renamed from: z */
    MediaPlayer.OnVideoSizeChangedListener f15330z;

    /* renamed from: com.adtima.control.CustomVideoView$a */
    /* loaded from: classes2.dex */
    class C3842a implements MediaPlayer.OnVideoSizeChangedListener {
        C3842a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i11, int i12) {
            try {
                CustomVideoView.this.f15328x = mediaPlayer.getVideoWidth();
                CustomVideoView.this.f15329y = mediaPlayer.getVideoHeight();
                if (CustomVideoView.this.f15328x != 0 && CustomVideoView.this.f15329y != 0) {
                    CustomVideoView.this.getHolder().setFixedSize(CustomVideoView.this.f15328x, CustomVideoView.this.f15329y);
                    CustomVideoView.this.requestLayout();
                }
                Adtima.m18328e("@@@", "wc " + i11 + " hc " + i12);
                Adtima.m18328e("@@@", "wcs " + CustomVideoView.this.f15328x + " hcs " + CustomVideoView.this.f15329y);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$b */
    /* loaded from: classes2.dex */
    class C3843b implements MediaPlayer.OnPreparedListener {
        C3843b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                CustomVideoView.this.f15323s = 2;
                CustomVideoView customVideoView = CustomVideoView.this;
                customVideoView.f15310I = customVideoView.f15311J = customVideoView.f15312K = true;
                if (CustomVideoView.this.f15305D != null) {
                    CustomVideoView.this.f15305D.onPrepared(CustomVideoView.this.f15326v);
                }
                CustomVideoView.this.f15328x = mediaPlayer.getVideoWidth();
                CustomVideoView.this.f15329y = mediaPlayer.getVideoHeight();
                int i11 = CustomVideoView.this.f15309H;
                if (i11 != 0) {
                    CustomVideoView.this.m18374e(i11);
                }
                if (CustomVideoView.this.f15328x != 0 && CustomVideoView.this.f15329y != 0) {
                    Adtima.m18326d("@@@@", "video size: " + CustomVideoView.this.f15328x + "/" + CustomVideoView.this.f15329y);
                    CustomVideoView.this.getHolder().setFixedSize(CustomVideoView.this.f15328x, CustomVideoView.this.f15329y);
                    if (CustomVideoView.this.f15302A != CustomVideoView.this.f15328x || CustomVideoView.this.f15303B != CustomVideoView.this.f15329y || CustomVideoView.this.f15324t != 3) {
                        return;
                    }
                } else if (CustomVideoView.this.f15324t != 3) {
                    return;
                }
                CustomVideoView.this.m18372D();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$c */
    /* loaded from: classes2.dex */
    class C3844c implements MediaPlayer.OnCompletionListener {
        C3844c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            CustomVideoView.this.f15323s = 5;
            CustomVideoView.this.f15324t = 5;
            if (CustomVideoView.this.f15304C != null) {
                CustomVideoView.this.f15304C.onCompletion(CustomVideoView.this.f15326v);
            }
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$d */
    /* loaded from: classes2.dex */
    class C3845d implements MediaPlayer.OnInfoListener {
        C3845d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            if (CustomVideoView.this.f15308G == null) {
                return true;
            }
            CustomVideoView.this.f15308G.onInfo(mediaPlayer, i11, i12);
            return true;
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$e */
    /* loaded from: classes2.dex */
    class C3846e implements MediaPlayer.OnErrorListener {
        C3846e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            Adtima.m18326d(CustomVideoView.this.f15320p, "Error: " + i11 + "," + i12);
            CustomVideoView.this.f15323s = -1;
            CustomVideoView.this.f15324t = -1;
            if (CustomVideoView.this.f15307F != null) {
                CustomVideoView.this.f15307F.onError(CustomVideoView.this.f15326v, i11, i12);
            }
            return true;
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$f */
    /* loaded from: classes2.dex */
    class C3847f implements MediaPlayer.OnBufferingUpdateListener {
        C3847f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i11) {
            CustomVideoView.this.f15306E = i11;
        }
    }

    /* renamed from: com.adtima.control.CustomVideoView$g */
    /* loaded from: classes2.dex */
    class SurfaceHolderCallbackC3848g implements SurfaceHolder.Callback {
        SurfaceHolderCallbackC3848g() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            CustomVideoView.this.f15302A = i12;
            CustomVideoView.this.f15303B = i13;
            boolean z11 = false;
            boolean z12 = CustomVideoView.this.f15324t == 3;
            if (CustomVideoView.this.f15328x == i12 && CustomVideoView.this.f15329y == i13) {
                z11 = true;
            }
            if (CustomVideoView.this.f15326v != null && z12 && z11) {
                if (CustomVideoView.this.f15309H != 0) {
                    CustomVideoView customVideoView = CustomVideoView.this;
                    customVideoView.m18374e(customVideoView.f15309H);
                }
                CustomVideoView.this.m18372D();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CustomVideoView.this.f15325u = surfaceHolder;
            CustomVideoView.this.m18368x();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CustomVideoView.this.f15325u = null;
            CustomVideoView.this.m18353d();
        }
    }

    public CustomVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15320p = "VideoView";
        this.f15323s = 0;
        this.f15324t = 0;
        this.f15325u = null;
        this.f15326v = null;
        this.f15330z = new C3842a();
        this.f15313L = new C3843b();
        this.f15315N = new C3844c();
        this.f15316O = new C3845d();
        this.f15317P = new C3846e();
        this.f15318Q = new C3847f();
        this.f15319R = new SurfaceHolderCallbackC3848g();
        m18358k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m18353d() {
        try {
            MediaPlayer mediaPlayer = this.f15326v;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f15326v = null;
                this.f15314M.clear();
                this.f15323s = 0;
                this.f15324t = 0;
                Context context = getContext();
                if (context != null) {
                    ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m18354g(boolean z11) {
        try {
            MediaPlayer mediaPlayer = this.f15326v;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                this.f15326v.release();
                this.f15326v = null;
                this.f15314M.clear();
                this.f15323s = 0;
                if (z11) {
                    this.f15324t = 0;
                }
                Context context = getContext();
                if (context != null) {
                    ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(null);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m18358k() {
        this.f15328x = 0;
        this.f15329y = 0;
        getHolder().addCallback(this.f15319R);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f15314M = new Vector();
        this.f15323s = 0;
        this.f15324t = 0;
    }

    /* renamed from: p */
    private boolean m18362p() {
        int i11;
        return (this.f15326v == null || (i11 = this.f15323s) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m18368x() {
        MediaPlayer.OnErrorListener onErrorListener;
        MediaPlayer mediaPlayer;
        if (this.f15321q == null || this.f15325u == null) {
            return;
        }
        m18354g(false);
        try {
            try {
                try {
                    this.f15326v = new MediaPlayer();
                    Context context = getContext();
                    int i11 = this.f15327w;
                    if (i11 != 0) {
                        this.f15326v.setAudioSessionId(i11);
                    } else {
                        this.f15327w = this.f15326v.getAudioSessionId();
                    }
                    this.f15326v.setOnPreparedListener(this.f15313L);
                    this.f15326v.setOnVideoSizeChangedListener(this.f15330z);
                    this.f15326v.setOnCompletionListener(this.f15315N);
                    this.f15326v.setOnErrorListener(this.f15317P);
                    this.f15326v.setOnInfoListener(this.f15316O);
                    this.f15326v.setOnBufferingUpdateListener(this.f15318Q);
                    this.f15306E = 0;
                    this.f15326v.setDataSource(context, this.f15321q, this.f15322r);
                    this.f15326v.setDisplay(getHolder());
                    this.f15326v.setAudioStreamType(3);
                    this.f15326v.setScreenOnWhilePlaying(true);
                    this.f15326v.prepareAsync();
                    this.f15323s = 1;
                } catch (IOException e11) {
                    Adtima.m18327d(this.f15320p, "Unable to open content: " + this.f15321q, e11);
                    this.f15323s = -1;
                    this.f15324t = -1;
                    onErrorListener = this.f15317P;
                    mediaPlayer = this.f15326v;
                    onErrorListener.onError(mediaPlayer, 1, 0);
                    this.f15314M.clear();
                }
            } catch (IllegalArgumentException e12) {
                Adtima.m18327d(this.f15320p, "Unable to open content: " + this.f15321q, e12);
                this.f15323s = -1;
                this.f15324t = -1;
                onErrorListener = this.f15317P;
                mediaPlayer = this.f15326v;
                onErrorListener.onError(mediaPlayer, 1, 0);
                this.f15314M.clear();
            }
            this.f15314M.clear();
        } catch (Throwable th2) {
            this.f15314M.clear();
            throw th2;
        }
    }

    /* renamed from: A */
    public void m18371A() {
        if (m18362p() && this.f15326v.isPlaying()) {
            this.f15326v.pause();
            this.f15323s = 4;
        }
        this.f15324t = 4;
    }

    /* renamed from: D */
    public void m18372D() {
        if (m18362p()) {
            this.f15326v.start();
            this.f15323s = 3;
        }
        this.f15324t = 3;
    }

    /* renamed from: F */
    public void m18373F() {
        MediaPlayer mediaPlayer = this.f15326v;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f15326v.release();
            this.f15326v = null;
            this.f15323s = 0;
            this.f15324t = 0;
            Context context = getContext();
            if (context != null) {
                ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(null);
            }
        }
    }

    /* renamed from: e */
    public void m18374e(int i11) {
        if (m18362p()) {
            this.f15326v.seekTo(i11);
            i11 = 0;
        }
        this.f15309H = i11;
    }

    /* renamed from: f */
    public void m18375f(Uri uri, Map map) {
        this.f15321q = uri;
        this.f15322r = map;
        this.f15309H = 0;
        m18368x();
        requestLayout();
        invalidate();
    }

    public int getAudioSessionId() {
        if (this.f15327w == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f15327w = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f15327w;
    }

    public int getBufferPercentage() {
        if (this.f15326v != null) {
            return this.f15306E;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (m18362p()) {
            return this.f15326v.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (m18362p()) {
            return this.f15326v.getDuration();
        }
        return -1;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:            if (r1 > r6) goto L27;     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        int defaultSize = View.getDefaultSize(this.f15328x, i11);
        int defaultSize2 = View.getDefaultSize(this.f15329y, i12);
        if (this.f15328x > 0 && this.f15329y > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size2 = View.MeasureSpec.getSize(i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i14 = this.f15328x;
                int i15 = i14 * size2;
                int i16 = this.f15329y;
                int i17 = size * i16;
                if (i15 < i17) {
                    defaultSize = i15 / i16;
                    defaultSize2 = size2;
                } else {
                    if (i15 > i17) {
                        defaultSize2 = i17 / i14;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i18 = (this.f15329y * size) / this.f15328x;
                if (mode2 != Integer.MIN_VALUE || i18 <= size2) {
                    defaultSize2 = i18;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i13 = (this.f15328x * size2) / this.f15329y;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i19 = this.f15328x;
                    int i21 = this.f15329y;
                    if (mode2 != Integer.MIN_VALUE || i21 <= size2) {
                        i13 = i19;
                        size2 = i21;
                    } else {
                        i13 = (size2 * i19) / i21;
                    }
                    if (mode == Integer.MIN_VALUE && i13 > size) {
                        defaultSize2 = (i21 * size) / i19;
                        defaultSize = size;
                    }
                }
                defaultSize = i13;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f15304C = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f15307F = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f15308G = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f15305D = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        m18375f(uri, null);
    }

    /* renamed from: u */
    public boolean m18376u() {
        return m18362p() && this.f15326v.isPlaying();
    }

    public CustomVideoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15320p = "VideoView";
        this.f15323s = 0;
        this.f15324t = 0;
        this.f15325u = null;
        this.f15326v = null;
        this.f15330z = new C3842a();
        this.f15313L = new C3843b();
        this.f15315N = new C3844c();
        this.f15316O = new C3845d();
        this.f15317P = new C3846e();
        this.f15318Q = new C3847f();
        this.f15319R = new SurfaceHolderCallbackC3848g();
        m18358k();
    }
}
