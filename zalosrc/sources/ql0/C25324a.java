package ql0;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.TableLayout;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zplayer.C17395R;
import java.util.Locale;

/* renamed from: ql0.a */
/* loaded from: classes7.dex */
public class C25324a {

    /* renamed from: a */
    private C25329f f121489a;

    /* renamed from: c */
    private IMediaPlayer f121491c;

    /* renamed from: b */
    private SparseArray f121490b = new SparseArray();

    /* renamed from: d */
    private long f121492d = 0;

    /* renamed from: e */
    private long f121493e = 0;

    /* renamed from: f */
    private Handler f121494f = new a();

    /* renamed from: ql0.a$a */
    /* loaded from: classes7.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ZMediaPlayer zMediaPlayer;
            if (message.what == 1 && C25324a.this.f121491c != null) {
                if (C25324a.this.f121491c instanceof ZMediaPlayer) {
                    zMediaPlayer = (ZMediaPlayer) C25324a.this.f121491c;
                } else {
                    zMediaPlayer = null;
                }
                if (zMediaPlayer != null) {
                    int videoDecoder = zMediaPlayer.getVideoDecoder();
                    if (videoDecoder == 1) {
                        C25324a.this.m131158m(C17395R.string.vdec, "avcodec");
                    } else if (videoDecoder != 2) {
                        C25324a.this.m131158m(C17395R.string.vdec, "");
                    } else {
                        C25324a.this.m131158m(C17395R.string.vdec, "MediaCodec");
                    }
                    float videoOutputFramesPerSecond = zMediaPlayer.getVideoOutputFramesPerSecond();
                    float videoDecodeFramesPerSecond = zMediaPlayer.getVideoDecodeFramesPerSecond();
                    C25324a c25324a = C25324a.this;
                    int i11 = C17395R.string.fps;
                    Locale locale = Locale.US;
                    c25324a.m131158m(i11, String.format(locale, "%.2f / %.2f", Float.valueOf(videoDecodeFramesPerSecond), Float.valueOf(videoOutputFramesPerSecond)));
                    long videoCachedDuration = zMediaPlayer.getVideoCachedDuration();
                    long audioCachedDuration = zMediaPlayer.getAudioCachedDuration();
                    long videoCacheByPackets = zMediaPlayer.getVideoCacheByPackets();
                    long audioCacheByPackets = zMediaPlayer.getAudioCacheByPackets();
                    long videoCachedBytes = zMediaPlayer.getVideoCachedBytes();
                    long audioCachedBytes = zMediaPlayer.getAudioCachedBytes();
                    long tcpSpeed = zMediaPlayer.getTcpSpeed();
                    long bitRate = zMediaPlayer.getBitRate();
                    long seekLoadDuration = zMediaPlayer.getSeekLoadDuration();
                    String description = zMediaPlayer.getDescription();
                    C25324a.this.m131158m(C17395R.string.v_cache, String.format(locale, "%s, %s", C25324a.m131155i(videoCachedDuration), C25324a.m131156j(videoCachedBytes)));
                    C25324a.this.m131158m(C17395R.string.a_cache, String.format(locale, "%s, %s", C25324a.m131155i(audioCachedDuration), C25324a.m131156j(audioCachedBytes)));
                    C25324a.this.m131158m(C17395R.string.v_packet, String.format(locale, "%d packets", Long.valueOf(videoCacheByPackets)));
                    C25324a.this.m131158m(C17395R.string.a_packet, String.format(locale, "%d packets", Long.valueOf(audioCacheByPackets)));
                    C25324a c25324a2 = C25324a.this;
                    c25324a2.m131158m(C17395R.string.load_cost, String.format(locale, "%d ms", Long.valueOf(c25324a2.f121492d)));
                    C25324a c25324a3 = C25324a.this;
                    c25324a3.m131158m(C17395R.string.seek_cost, String.format(locale, "%d ms", Long.valueOf(c25324a3.f121493e)));
                    C25324a.this.m131158m(C17395R.string.seek_load_cost, String.format(locale, "%d ms", Long.valueOf(seekLoadDuration)));
                    C25324a.this.m131158m(C17395R.string.tcp_speed, String.format(locale, "%s", C25324a.m131157k(tcpSpeed, 1000L)));
                    C25324a.this.m131158m(C17395R.string.bit_rate, String.format(locale, "%.2f kbs", Float.valueOf(((float) bitRate) / 1000.0f)));
                    C25324a.this.m131158m(C17395R.string.stream_id, String.format(locale, "%s", description));
                    C25324a.this.f121494f.removeMessages(1);
                    C25324a.this.f121494f.sendEmptyMessageDelayed(1, 500L);
                }
            }
        }
    }

    public C25324a(Context context, TableLayout tableLayout) {
        this.f121489a = new C25329f(context, tableLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static String m131155i(long j11) {
        if (j11 >= 1000) {
            return String.format(Locale.US, "%.2f sec", Float.valueOf(((float) j11) / 1000.0f));
        }
        return String.format(Locale.US, "%d msec", Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static String m131156j(long j11) {
        if (j11 >= 100000) {
            return String.format(Locale.US, "%.2f MB", Float.valueOf((((float) j11) / 1024.0f) / 1024.0f));
        }
        if (j11 >= 100) {
            return String.format(Locale.US, "%.1f KB", Float.valueOf(((float) j11) / 1024.0f));
        }
        return String.format(Locale.US, "%d B", Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static String m131157k(long j11, long j12) {
        if (j12 <= 0 || j11 <= 0) {
            return "0 B/s";
        }
        float f11 = (((float) j11) * 1000.0f) / ((float) j12);
        if (f11 >= 1000000.0f) {
            return String.format(Locale.US, "%.2f MB/s", Float.valueOf((f11 / 1024.0f) / 1024.0f));
        }
        if (f11 >= 1000.0f) {
            return String.format(Locale.US, "%.1f KB/s", Float.valueOf(f11 / 1024.0f));
        }
        return String.format(Locale.US, "%d B/s", Long.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m131158m(int i11, String str) {
        View view = (View) this.f121490b.get(i11);
        if (view == null) {
            this.f121490b.put(i11, this.f121489a.m131164b(i11, str));
        } else {
            this.f121489a.m131168f(view, str);
        }
    }

    /* renamed from: l */
    public void m131159l(IMediaPlayer iMediaPlayer) {
        this.f121491c = iMediaPlayer;
        if (iMediaPlayer != null) {
            this.f121494f.sendEmptyMessageDelayed(1, 500L);
        } else {
            this.f121494f.removeMessages(1);
        }
    }

    /* renamed from: n */
    public void m131160n(long j11) {
        this.f121492d = j11;
    }

    /* renamed from: o */
    public void m131161o(long j11) {
        this.f121493e = j11;
    }
}
