package p679yf;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import cg.C3457e;
import com.zing.zalo.zmedia.player.AndroidMediaPlayer;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.text.DecimalFormat;
import java.util.Locale;
import mm0.AbstractC23350e;
import pl0.AbstractC24825f;
import pl0.AbstractC24827h;
import wf.AbstractC28955g;
import xh0.C29647g0;
import xh0.InterfaceC29654l;

/* renamed from: yf.b */
/* loaded from: classes3.dex */
public class C30922b implements IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnStateChangedListener, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: M */
    static final String f142593M = "b";

    /* renamed from: A */
    Context f142594A;

    /* renamed from: C */
    C30923c f142596C;

    /* renamed from: D */
    AbstractC28955g f142597D;

    /* renamed from: E */
    C29647g0 f142598E;

    /* renamed from: F */
    Surface f142599F;

    /* renamed from: G */
    Thread f142600G;

    /* renamed from: H */
    c f142601H;

    /* renamed from: I */
    final Handler.Callback f142602I;

    /* renamed from: J */
    long f142603J;

    /* renamed from: K */
    int f142604K;

    /* renamed from: L */
    Runnable f142605L;

    /* renamed from: p */
    final Handler f142606p;

    /* renamed from: q */
    final Handler f142607q;

    /* renamed from: r */
    final String f142608r;

    /* renamed from: s */
    IMediaPlayer f142609s;

    /* renamed from: t */
    int f142610t;

    /* renamed from: u */
    int f142611u;

    /* renamed from: x */
    int f142614x;

    /* renamed from: v */
    int f142612v = 0;

    /* renamed from: w */
    int f142613w = 0;

    /* renamed from: y */
    boolean f142615y = false;

    /* renamed from: z */
    boolean f142616z = false;

    /* renamed from: B */
    AudioManager f142595B = null;

    /* renamed from: yf.b$a */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            C30922b.this.m150223n();
                            return false;
                        }
                        return false;
                    }
                    C30922b.this.m150213d();
                    C30922b.this.m150214e();
                    return false;
                }
                C30922b.this.m150216g();
                C30922b.this.m150222m((C30924d) message.obj);
                return false;
            }
            IMediaPlayer iMediaPlayer = C30922b.this.f142609s;
            if (iMediaPlayer != null && iMediaPlayer.isPlaying()) {
                C30922b c30922b = C30922b.this;
                if (c30922b.f142614x > 0) {
                    c30922b.m150212b();
                    C30922b.this.f142606p.sendEmptyMessageDelayed(1, 50L);
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: yf.b$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                IMediaPlayer iMediaPlayer = C30922b.this.f142609s;
                if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                    break;
                }
                try {
                    C30922b c30922b = C30922b.this;
                    c cVar = c30922b.f142601H;
                    if (cVar != null) {
                        cVar.mo38370a(c30922b.f142609s.getCurrentPosition());
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                try {
                    Thread.sleep(50L);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            C30922b.this.f142600G = null;
        }
    }

    /* renamed from: yf.b$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo38370a(long j11);

        /* renamed from: b */
        void mo38371b();
    }

    public C30922b(String str) {
        a aVar = new a();
        this.f142602I = aVar;
        this.f142603J = 0L;
        this.f142604K = 0;
        this.f142605L = new b();
        this.f142608r = str;
        HandlerThread handlerThread = new HandlerThread("Z:GL-VideoPlayer");
        handlerThread.start();
        this.f142606p = new Handler(handlerThread.getLooper(), aVar);
        this.f142607q = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    void m150212b() {
        IMediaPlayer iMediaPlayer = this.f142609s;
        if (iMediaPlayer != null && iMediaPlayer.isPlaying() && this.f142614x > 0) {
            int currentPosition = (int) this.f142609s.getCurrentPosition();
            long j11 = currentPosition;
            long j12 = this.f142603J;
            if (j11 > j12 && j11 - j12 < 100) {
                return;
            }
            this.f142603J = j11;
            int i11 = this.f142604K;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (currentPosition < this.f142614x - 2000) {
                                this.f142604K = 0;
                                return;
                            } else {
                                float f11 = (r0 - currentPosition) / 2000.0f;
                                this.f142609s.setVolume(f11, f11);
                                return;
                            }
                        }
                        return;
                    }
                    if (currentPosition > this.f142614x - 2000) {
                        this.f142604K = 0;
                        return;
                    }
                    return;
                }
                if (currentPosition > 3000) {
                    this.f142604K = 0;
                    return;
                } else {
                    float f12 = currentPosition / 3000.0f;
                    this.f142609s.setVolume(f12, f12);
                    return;
                }
            }
            if (currentPosition > this.f142614x - 2000) {
                this.f142604K = 4;
            } else if (currentPosition < 3000) {
                this.f142604K = 1;
            } else {
                this.f142609s.setVolume(1.0f, 1.0f);
                this.f142604K = 3;
            }
        }
    }

    /* renamed from: d */
    void m150213d() {
        if (this.f142594A != null) {
            if (this.f142595B == null) {
                this.f142595B = (AudioManager) this.f142594A.getSystemService("audio");
            }
            AudioManager audioManager = this.f142595B;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.f142595B = null;
        }
    }

    /* renamed from: e */
    void m150214e() {
        IMediaPlayer iMediaPlayer = this.f142609s;
        if (iMediaPlayer != null) {
            iMediaPlayer.release();
        }
        this.f142609s = null;
        Surface surface = this.f142599F;
        if (surface != null) {
            surface.release();
            this.f142599F = null;
        }
        this.f142606p.getLooper().quitSafely();
    }

    /* renamed from: f */
    public void m150215f() {
        Handler handler = this.f142606p;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* renamed from: g */
    void m150216g() {
        if (this.f142594A != null) {
            if (this.f142595B == null) {
                this.f142595B = (AudioManager) this.f142594A.getSystemService("audio");
            }
            AudioManager audioManager = this.f142595B;
            if (audioManager != null) {
                audioManager.requestAudioFocus(null, 3, 2);
            }
        }
    }

    /* renamed from: h */
    public void m150217h(boolean z11) {
        this.f142616z = z11;
    }

    /* renamed from: i */
    public void m150218i(Context context) {
        this.f142594A = context;
    }

    /* renamed from: j */
    public void m150219j(c cVar) {
        this.f142601H = cVar;
    }

    /* renamed from: k */
    void m150220k(float f11) {
        C30923c c30923c = this.f142596C;
        if (c30923c != null) {
            c30923c.f142629k = f11;
        }
        IMediaPlayer iMediaPlayer = this.f142609s;
        if (iMediaPlayer != null && (iMediaPlayer instanceof ZMediaPlayer)) {
            ((ZMediaPlayer) iMediaPlayer).setSpeed(f11);
        }
    }

    /* renamed from: l */
    public void m150221l(C30924d c30924d) {
        Handler handler = this.f142606p;
        if (handler != null) {
            this.f142606p.sendMessage(handler.obtainMessage(2, c30924d));
        }
    }

    /* renamed from: m */
    void m150222m(C30924d c30924d) {
        C30923c c30923c;
        long j11;
        int i11;
        if (c30924d.f142634a == null || TextUtils.isEmpty(this.f142608r) || this.f142609s != null || this.f142594A == null) {
            return;
        }
        C30923c c30923c2 = c30924d.f142635b;
        this.f142610t = c30923c2.f142619a;
        this.f142611u = c30923c2.f142620b;
        this.f142596C = c30923c2;
        this.f142597D = c30924d.f142634a;
        try {
            C29647g0 c29647g0 = new C29647g0(c30924d.f142634a.m144597l0());
            this.f142598E = c29647g0;
            c29647g0.setOnFrameAvailableListener(this);
            this.f142599F = new Surface(this.f142598E);
            if (ZMediaPlayerSettings.getVideoConfig(8).isZaloPlayer()) {
                ZMediaPlayer zMediaPlayer = new ZMediaPlayer();
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_FRAME_DROP, 1L);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PACKET_BUFFERING, 1L);
                if (this.f142616z) {
                    j11 = 1;
                } else {
                    j11 = 0;
                }
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_AUDIO, j11);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_START_ON_PREPARED, 1L);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 842225234L);
                if (this.f142596C.f142630l == 2) {
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_VIDEO_PICTURE_QUEUE_SIZE, 16L);
                }
                MediaCodecInfo m17409b = C3457e.m17409b(this.f142594A, this.f142608r);
                int i12 = 0;
                if (this.f142596C.f142633o && m17409b != null) {
                    zMediaPlayer.setOption(4, "video-codec-name", m17409b.getName());
                    AbstractC20110a.m104542k(8, "[GLVideoPlayer] Request using HW decoder %s", m17409b.getName());
                    i11 = 0;
                    i12 = 1;
                } else {
                    if (m17409b == null) {
                        if (AbstractC24827h.m129084l(Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT))) {
                            AbstractC20110a.m104542k(8, "[GLVideoPlayer] Use SW decoder", new Object[0]);
                            i11 = 1;
                        } else {
                            AbstractC20110a.m104542k(8, "[GLVideoPlayer] Use wrapper or SW", new Object[0]);
                        }
                    }
                    i11 = 0;
                }
                long j12 = i12;
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC, j12);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE, 0L);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE, j12);
                zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SOFTWARE_DECODE, i11);
                C30923c c30923c3 = this.f142596C;
                if (c30923c3 != null) {
                    if (c30923c3.f142629k != 1.0f || c30923c3.f142630l != 0) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_DISABLE_AUDIO, 1L);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_AV_SYNC_TYPE, 1L);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC, 0L);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE, 0L);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE, 0L);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SOFTWARE_DECODE, 1L);
                    }
                    int i13 = this.f142596C.f142630l;
                    if (i13 != 0) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PLAY_REVERSE, i13);
                    }
                    C30923c c30923c4 = this.f142596C;
                    int i14 = c30923c4.f142631m;
                    if (i14 >= 0 && c30923c4.f142632n > 0) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_SEEK_AT_START, i14);
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_PLAY_IN_DURATION, this.f142596C.f142632n);
                    }
                }
                zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_PATH, ZMediaPlayerSettings.getCacheDir(ZMediaPlayerSettings.getVideoConfig(8).getPlayerSection()));
                zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_OID, "default");
                zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_INDEX, 0L);
                zMediaPlayer.setOption(1, ZMediaPlayer.OPTION_FORMAT_KEY_CACHE_SECTION, 8L);
                if (ZMediaPlayerSettings.ENABLE_FEATURE_HDR) {
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 33) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 1L);
                    } else if (i15 < 33 && i15 >= 26) {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 1L);
                    } else {
                        zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE, 0L);
                    }
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_DISPLAY_MAX_LUMINANCE, String.valueOf(AbstractC24825f.m129068d(CoreUtility.getAppContext())));
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_HDR_CURRENT_DISPLAY_LUMINANCE, new DecimalFormat("#").format((AbstractC24825f.m129066b(CoreUtility.getAppContext()) * AbstractC24825f.m129068d(CoreUtility.getAppContext())) / AbstractC24825f.m129067c(CoreUtility.getAppContext())));
                    zMediaPlayer.setOption(4, ZMediaPlayer.OPTION_PLAYER_KEY_OVERLAY_FORMAT, 844318047L);
                }
                this.f142609s = zMediaPlayer;
            } else {
                AndroidMediaPlayer androidMediaPlayer = new AndroidMediaPlayer();
                this.f142609s = androidMediaPlayer;
                if (this.f142616z) {
                    androidMediaPlayer.setVolume(0.0f, 0.0f);
                }
            }
            this.f142609s.setOnVideoSizeChangedListener(this);
            this.f142609s.setLooping(true);
            this.f142609s.setDataSource(this.f142608r);
            this.f142609s.setSurface(this.f142599F);
            this.f142609s.setOnStateChangedListener(this);
            this.f142609s.prepare();
            this.f142614x = (int) this.f142609s.getDuration();
            this.f142615y = true;
            C30923c c30923c5 = this.f142596C;
            if (c30923c5 != null) {
                float f11 = c30923c5.f142629k;
                if (f11 != 1.0f) {
                    m150220k(f11);
                }
            }
            final InterfaceC30926f interfaceC30926f = c30924d.f142636c;
            if (interfaceC30926f != null) {
                final C30927g c30927g = new C30927g(this.f142609s, this.f142596C, this.f142615y);
                this.f142607q.post(new Runnable() { // from class: yf.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC30926f.this.mo38268e(c30927g);
                    }
                });
            }
            if (!this.f142616z) {
                this.f142606p.sendEmptyMessageDelayed(1, 50L);
            }
            c cVar = this.f142601H;
            if (cVar != null) {
                cVar.mo38371b();
            }
            IMediaPlayer iMediaPlayer = this.f142609s;
            if (iMediaPlayer instanceof AndroidMediaPlayer) {
                if (this.f142596C != null) {
                    iMediaPlayer.seekTo(r3.f142631m);
                }
                this.f142609s.start();
                Handler handler = this.f142606p;
                if (handler != null && (c30923c = this.f142596C) != null) {
                    if (c30923c.f142631m != 0 || c30923c.f142632n != 0) {
                        this.f142606p.sendMessage(handler.obtainMessage(4, c30924d));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            AbstractC23350e.m122774d(f142593M, "media player prepare failed");
        }
    }

    /* renamed from: n */
    void m150223n() {
        if (this.f142600G == null) {
            Thread thread = new Thread(this.f142605L);
            this.f142600G = thread;
            thread.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (surfaceTexture instanceof InterfaceC29654l) {
            this.f142597D.m144618r((InterfaceC29654l) surfaceTexture);
        }
        c cVar = this.f142601H;
        if (cVar != null) {
            cVar.mo38371b();
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnStateChangedListener
    public void onStateChanged(IMediaPlayer iMediaPlayer, int i11) {
        if (i11 == 3) {
            try {
                Handler handler = this.f142606p;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(4, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
        int i15;
        String.format(Locale.US, "onVideoSizeChanged: %d/%d", Integer.valueOf(i11), Integer.valueOf(i12));
        if (i11 == this.f142612v && i12 == this.f142613w) {
            return;
        }
        this.f142612v = i11;
        this.f142613w = i12;
        if ((iMediaPlayer instanceof AndroidMediaPlayer) && ((i15 = this.f142596C.f142621c) == 90 || i15 == 270)) {
            this.f142612v = i12;
            this.f142613w = i11;
        }
        AbstractC28955g abstractC28955g = this.f142597D;
        if (abstractC28955g != null) {
            int i16 = this.f142612v;
            int i17 = this.f142613w;
            C30923c c30923c = this.f142596C;
            abstractC28955g.m144616i0(i16, i17, c30923c.f142621c, c30923c.f142627i);
        }
    }
}
