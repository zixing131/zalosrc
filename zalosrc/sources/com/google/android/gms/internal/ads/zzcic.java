package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcic extends zzcie implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: I */
    private static final Map f32035I;

    /* renamed from: A */
    private int f32036A;

    /* renamed from: B */
    private int f32037B;

    /* renamed from: C */
    private dn0 f32038C;

    /* renamed from: D */
    private final boolean f32039D;

    /* renamed from: E */
    private int f32040E;

    /* renamed from: F */
    private mm0 f32041F;

    /* renamed from: G */
    private boolean f32042G;

    /* renamed from: H */
    private Integer f32043H;

    /* renamed from: s */
    private final fn0 f32044s;

    /* renamed from: t */
    private final gn0 f32045t;

    /* renamed from: u */
    private final boolean f32046u;

    /* renamed from: v */
    private int f32047v;

    /* renamed from: w */
    private int f32048w;

    /* renamed from: x */
    private MediaPlayer f32049x;

    /* renamed from: y */
    private Uri f32050y;

    /* renamed from: z */
    private int f32051z;

    static {
        HashMap hashMap = new HashMap();
        f32035I = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_ERROR_TIMED_OUT), "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_START), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_END), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE), "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_METADATA_UPDATE), "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcic(Context context, fn0 fn0Var, boolean z11, boolean z12, en0 en0Var, gn0 gn0Var, Integer num) {
        super(context, num);
        this.f32047v = 0;
        this.f32048w = 0;
        this.f32042G = false;
        this.f32043H = null;
        setSurfaceTextureListener(this);
        this.f32044s = fn0Var;
        this.f32045t = gn0Var;
        this.f32039D = z11;
        this.f32046u = z12;
        gn0Var.m22478a(this);
    }

    /* renamed from: D */
    private final void m28721D() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f32050y != null && surfaceTexture != null) {
            m28722E(false);
            try {
                zzt.zzk();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f32049x = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f32049x.setOnCompletionListener(this);
                this.f32049x.setOnErrorListener(this);
                this.f32049x.setOnInfoListener(this);
                this.f32049x.setOnPreparedListener(this);
                this.f32049x.setOnVideoSizeChangedListener(this);
                this.f32037B = 0;
                if (this.f32039D) {
                    dn0 dn0Var = new dn0(getContext());
                    this.f32038C = dn0Var;
                    dn0Var.m21502c(surfaceTexture, getWidth(), getHeight());
                    this.f32038C.start();
                    SurfaceTexture m21500a = this.f32038C.m21500a();
                    if (m21500a != null) {
                        surfaceTexture = m21500a;
                    } else {
                        this.f32038C.m21503d();
                        this.f32038C = null;
                    }
                }
                this.f32049x.setDataSource(getContext(), this.f32050y);
                zzt.zzl();
                this.f32049x.setSurface(new Surface(surfaceTexture));
                this.f32049x.setAudioStreamType(3);
                this.f32049x.setScreenOnWhilePlaying(true);
                this.f32049x.prepareAsync();
                m28723F(1);
            } catch (IOException e11) {
                e = e11;
                yk0.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f32050y)), e);
                onError(this.f32049x, 1, 0);
            } catch (IllegalArgumentException e12) {
                e = e12;
                yk0.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f32050y)), e);
                onError(this.f32049x, 1, 0);
            } catch (IllegalStateException e13) {
                e = e13;
                yk0.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f32050y)), e);
                onError(this.f32049x, 1, 0);
            }
        }
    }

    /* renamed from: E */
    private final void m28722E(boolean z11) {
        zze.zza("AdMediaPlayerView release");
        dn0 dn0Var = this.f32038C;
        if (dn0Var != null) {
            dn0Var.m21503d();
            this.f32038C = null;
        }
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f32049x.release();
            this.f32049x = null;
            m28723F(0);
            if (z11) {
                this.f32048w = 0;
            }
        }
    }

    /* renamed from: F */
    private final void m28723F(int i11) {
        if (i11 == 3) {
            this.f32045t.m22480c();
            this.f32053q.m23971b();
        } else if (this.f32047v == 3) {
            this.f32045t.m22482e();
            this.f32053q.m23972c();
        }
        this.f32047v = i11;
    }

    /* renamed from: G */
    private final void m28724G(float f11) {
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f11, f11);
            } catch (IllegalStateException unused) {
            }
        } else {
            yk0.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: H */
    private final boolean m28725H() {
        int i11;
        return (this.f32049x == null || (i11 = this.f32047v) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static /* bridge */ /* synthetic */ void m28728K(zzcic zzcicVar, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && zzcicVar.f32044s != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType != 1) {
                        if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    } else {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                zzcicVar.f32043H = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                zzcicVar.f32044s.mo23552V("onMetadataEvent", hashMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m28730b(int i11) {
        mm0 mm0Var = this.f32041F;
        if (mm0Var != null) {
            mm0Var.onWindowVisibilityChanged(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: h */
    public final int mo28731h() {
        if (m28725H()) {
            return this.f32049x.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: i */
    public final int mo28732i() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT >= 26 && m28725H()) {
            metrics = this.f32049x.getMetrics();
            return metrics.getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: j */
    public final int mo28733j() {
        if (m28725H()) {
            return this.f32049x.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: k */
    public final int mo28734k() {
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: l */
    public final int mo28735l() {
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: m */
    public final long mo28736m() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: n */
    public final long mo28737n() {
        if (this.f32043H != null) {
            return (mo28738p() * this.f32037B) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i11) {
        this.f32037B = i11;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        m28723F(5);
        this.f32048w = 5;
        zzs.zza.post(new dm0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
        Map map = f32035I;
        String str = (String) map.get(Integer.valueOf(i11));
        String str2 = (String) map.get(Integer.valueOf(i12));
        yk0.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m28723F(-1);
        this.f32048w = -1;
        zzs.zza.post(new em0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
        Map map = f32035I;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i11))) + ":" + ((String) map.get(Integer.valueOf(i12))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:            if (r1 > r6) goto L30;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int defaultSize = View.getDefaultSize(this.f32051z, i11);
        int defaultSize2 = View.getDefaultSize(this.f32036A, i12);
        if (this.f32051z > 0 && this.f32036A > 0 && this.f32038C == null) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size2 = View.MeasureSpec.getSize(i12);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i14 = this.f32051z;
                    int i15 = i14 * size2;
                    int i16 = this.f32036A;
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
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i18 = (this.f32036A * size) / this.f32051z;
                if (mode2 != Integer.MIN_VALUE || i18 <= size2) {
                    defaultSize2 = i18;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i13 = (this.f32051z * size2) / this.f32036A;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i19 = this.f32051z;
                    int i21 = this.f32036A;
                    if (mode2 == Integer.MIN_VALUE && i21 > size2) {
                        i13 = (size2 * i19) / i21;
                    } else {
                        i13 = i19;
                        size2 = i21;
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
        dn0 dn0Var = this.f32038C;
        if (dn0Var != null) {
            dn0Var.m21501b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView prepared");
        m28723F(2);
        this.f32045t.m22479b();
        zzs.zza.post(new cm0(this, mediaPlayer));
        this.f32051z = mediaPlayer.getVideoWidth();
        this.f32036A = mediaPlayer.getVideoHeight();
        int i11 = this.f32040E;
        if (i11 != 0) {
            mo28742u(i11);
        }
        if (this.f32046u && m28725H() && this.f32049x.getCurrentPosition() > 0 && this.f32048w != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            m28724G(0.0f);
            this.f32049x.start();
            int currentPosition = this.f32049x.getCurrentPosition();
            long mo105913a = zzt.zzB().mo105913a();
            while (m28725H() && this.f32049x.getCurrentPosition() == currentPosition && zzt.zzB().mo105913a() - mo105913a <= 250) {
            }
            this.f32049x.pause();
            zzn();
        }
        yk0.zzi("AdMediaPlayerView stream dimensions: " + this.f32051z + " x " + this.f32036A);
        if (this.f32048w == 3) {
            mo28741s();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        zze.zza("AdMediaPlayerView surface created");
        m28721D();
        zzs.zza.post(new fm0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null && this.f32040E == 0) {
            this.f32040E = mediaPlayer.getCurrentPosition();
        }
        dn0 dn0Var = this.f32038C;
        if (dn0Var != null) {
            dn0Var.m21503d();
        }
        zzs.zza.post(new hm0(this));
        m28722E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        zze.zza("AdMediaPlayerView surface changed");
        int i13 = this.f32048w;
        boolean z11 = false;
        if (this.f32051z == i11 && this.f32036A == i12) {
            z11 = true;
        }
        if (this.f32049x != null && i13 == 3 && z11) {
            int i14 = this.f32040E;
            if (i14 != 0) {
                mo28742u(i14);
            }
            mo28741s();
        }
        dn0 dn0Var = this.f32038C;
        if (dn0Var != null) {
            dn0Var.m21501b(i11, i12);
        }
        zzs.zza.post(new gm0(this, i11, i12));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f32045t.m22483f(this);
        this.f32052p.m28547a(surfaceTexture, this.f32041F);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i11, int i12) {
        zze.zza("AdMediaPlayerView size changed: " + i11 + " x " + i12);
        this.f32051z = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f32036A = videoHeight;
        if (this.f32051z != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i11) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i11);
        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.bm0
            @Override // java.lang.Runnable
            public final void run() {
                zzcic.this.m28730b(i11);
            }
        });
        super.onWindowVisibilityChanged(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: p */
    public final long mo28738p() {
        if (this.f32043H != null) {
            return mo28733j() * this.f32043H.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: q */
    public final String mo28739q() {
        return "MediaPlayer".concat(true != this.f32039D ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: r */
    public final void mo28740r() {
        zze.zza("AdMediaPlayerView pause");
        if (m28725H() && this.f32049x.isPlaying()) {
            this.f32049x.pause();
            m28723F(4);
            zzs.zza.post(new km0(this));
        }
        this.f32048w = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: s */
    public final void mo28741s() {
        zze.zza("AdMediaPlayerView play");
        if (m28725H()) {
            this.f32049x.start();
            m28723F(3);
            this.f32052p.m28548b();
            zzs.zza.post(new jm0(this));
        }
        this.f32048w = 3;
    }

    @Override // android.view.View
    public final String toString() {
        return zzcic.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: u */
    public final void mo28742u(int i11) {
        zze.zza("AdMediaPlayerView seek " + i11);
        if (m28725H()) {
            this.f32049x.seekTo(i11);
            this.f32040E = 0;
        } else {
            this.f32040E = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: v */
    public final void mo28743v(mm0 mm0Var) {
        this.f32041F = mm0Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: w */
    public final void mo28744w(String str) {
        Uri parse = Uri.parse(str);
        zzbeb m28705t = zzbeb.m28705t(parse);
        if (m28705t != null && m28705t.f31882p == null) {
            return;
        }
        if (m28705t != null) {
            parse = Uri.parse(m28705t.f31882p);
        }
        this.f32050y = parse;
        this.f32040E = 0;
        m28721D();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: x */
    public final void mo28745x() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f32049x;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f32049x.release();
            this.f32049x = null;
            m28723F(0);
            this.f32048w = 0;
        }
        this.f32045t.m22481d();
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    /* renamed from: y */
    public final void mo28746y(float f11, float f12) {
        dn0 dn0Var = this.f32038C;
        if (dn0Var != null) {
            dn0Var.m21504e(f11, f12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie, com.google.android.gms.internal.ads.jn0
    public final void zzn() {
        m28724G(this.f32053q.m23970a());
    }
}
