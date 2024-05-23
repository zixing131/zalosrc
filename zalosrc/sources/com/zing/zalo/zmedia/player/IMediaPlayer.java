package com.zing.zalo.zmedia.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import pl0.C24821b;

/* loaded from: classes7.dex */
public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_AUDIO_DECODED_START = 10003;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_AUDIO_SEEK_RENDERING_START = 10009;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_EMPTY = 704;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_COMPLETED_AND_LOOP = 11000;
    public static final int MEDIA_INFO_COMPLETED_IN_RANGE = 11001;
    public static final int MEDIA_INFO_COMPONENT_OPEN = 10007;
    public static final int MEDIA_INFO_FIND_STREAM_INFO = 10006;
    public static final int MEDIA_INFO_HAVE_ATTACHMENT_STREAM = 10025;
    public static final int MEDIA_INFO_HAVE_AUDIO_STREAM = 10022;
    public static final int MEDIA_INFO_HAVE_DATA_STREAM = 10023;
    public static final int MEDIA_INFO_HAVE_SUBTITLE_STREAM = 10024;
    public static final int MEDIA_INFO_HAVE_UNKNOWN_STREAM = 10020;
    public static final int MEDIA_INFO_HAVE_VIDEO_STREAM = 10021;
    public static final int MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE = 10100;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_OPEN_INPUT = 10005;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_DECODED_START = 10004;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_SEEK_RENDERING_START = 10008;
    public static final int MEDIA_INFO_VIDEO_SNAPSHOT_START = 1000;
    public static final int MEDIA_INFO_VIDEO_SNAPSHOT_STOP = 1001;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    public static final int MODE_REVERSE_BOOMERANG = 2;
    public static final int MODE_REVERSE_OFF = 0;
    public static final int MODE_REVERSE_ONLY = 1;
    public static final int STATE_COMPLETED = 5;
    public static final int STATE_ERROR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARED = 2;
    public static final int STATE_PREPARING = 1;
    public static final int STATE_STOPPED = 6;

    /* loaded from: classes7.dex */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i11);
    }

    /* loaded from: classes7.dex */
    public interface OnCompletionInRangeListener {
        void onVideoCompletionInRange(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes7.dex */
    public interface OnCompletionListener {
        void onVideoCompletion(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes7.dex */
    public interface OnDataSourceCheckedListener {
        void onFailed();

        void onSuccess(String str);
    }

    /* loaded from: classes7.dex */
    public interface OnErrorListener {
        boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12);
    }

    /* loaded from: classes7.dex */
    public interface OnInfoListener {
        boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj);
    }

    /* loaded from: classes7.dex */
    public interface OnPreparedListener {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes7.dex */
    public interface OnSeekCompleteListener {
        void onSeekComplete(IMediaPlayer iMediaPlayer);
    }

    /* loaded from: classes7.dex */
    public interface OnStateChangedListener {
        void onStateChanged(IMediaPlayer iMediaPlayer, int i11);
    }

    /* loaded from: classes7.dex */
    public interface OnTimedTextListener {
        void onTimedText(IMediaPlayer iMediaPlayer, ZTimedText zTimedText);
    }

    /* loaded from: classes7.dex */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14);
    }

    int getAudioSessionId();

    long getCurrentPosition();

    String getDataSource();

    long getDuration();

    C24821b getMediaInfo();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isLooping();

    @Deprecated
    boolean isPlayable();

    boolean isPlaying();

    void pause() throws IllegalStateException;

    void prepare() throws Exception;

    void prepareAsync() throws IllegalStateException;

    void release();

    void reset();

    void seekTo(long j11) throws IllegalStateException;

    void setAudioStreamType(int i11);

    void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(IAndroidDataSource iAndroidDataSource) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSourceAsync(String str, OnDataSourceCheckedListener onDataSourceCheckedListener) throws IllegalArgumentException, SecurityException, IllegalStateException;

    void setDataSourceWithFormatOptions(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void setDisplay(SurfaceHolder surfaceHolder);

    @Deprecated
    void setKeepInBackground(boolean z11);

    void setLooping(boolean z11);

    void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(OnCompletionListener onCompletionListener);

    void setOnErrorListener(OnErrorListener onErrorListener);

    void setOnInfoListener(OnInfoListener onInfoListener);

    void setOnPreparedListener(OnPreparedListener onPreparedListener);

    void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    void setOnStateChangedListener(OnStateChangedListener onStateChangedListener);

    void setOnTimedTextListener(OnTimedTextListener onTimedTextListener);

    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setScreenOnWhilePlaying(boolean z11);

    void setSurface(Surface surface);

    void setVolume(float f11, float f12);

    @Deprecated
    void setWakeMode(Context context, int i11);

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;
}
