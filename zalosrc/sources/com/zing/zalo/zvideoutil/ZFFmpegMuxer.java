package com.zing.zalo.zvideoutil;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class ZFFmpegMuxer extends ZAbstractBase {
    public static final int AV_PKT_FLAG_KEY = 1;
    public static final int PLAYLIST_TYPE_VOD = 2;
    static final String TAG = "ZFFmpegMuxer";
    long instance;
    boolean mCanIncreaseBuffer = true;
    final Object mCircularBufferFence = new Object();
    final Object mCircularBufferChangeSizeFence = new Object();

    /* loaded from: classes7.dex */
    public enum Format {
        MP4("mp4"),
        HLS("hls");

        String formatName;

        Format(String str) {
            this.formatName = str;
        }

        public String getFormatName() {
            return this.formatName;
        }
    }

    /* loaded from: classes7.dex */
    public interface VideoThumbListener {
        void onReceiveVideoThumb(String str, String str2, Bitmap bitmap);
    }

    ZFFmpegMuxer(String str, Format format) {
        System.out.println("");
    }

    public static ZFFmpegMuxer createMuxer(String str, Format format) {
        return null;
    }

    public static String getM3Thumbu8PathFromInputPath(String str) {
        if (str.endsWith(".m3u8")) {
            return str.substring(0, str.length() - 5) + ".jpg";
        }
        if (str.endsWith(".mp4")) {
            return str.substring(0, str.length() - 4) + ".jpg";
        }
        return null;
    }

    public void extractFirstImageFrame(String str, String str2, int i11, VideoThumbListener videoThumbListener) {
    }

    public void postRunnable(Runnable runnable) {
    }

    public void quitHandler() {
    }

    public int setAudioStream(int i11, int i12, int i13) {
        return 1;
    }

    public void setMuxerParameters(String str, String str2) {
    }

    public int setVideoStream(int i11, int i12, int i13) {
        return 0;
    }

    public void start() {
    }

    public void stop() {
    }

    public void writeAVPacket(int i11, ByteBuffer byteBuffer, int i12, int i13, int i14, long j11) {
    }

    public static boolean extractFirstImageFrame(String str, String str2, int i11) {
        return false;
    }
}
