package com.zing.zalo.zmedia.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.player.event.IZMediaListener;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import me0.AbstractC23254w8;
import pl0.AbstractC24827h;
import pl0.C24821b;
import pl0.C24829j;

/* loaded from: classes.dex */
public final class ZMediaPlayer extends AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_BUF_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int FFP_PROP_STRING_DESCRIPTION = 20209;
    public static final int HDR_GAMA_COMPRESSION_BT1886 = 1;
    public static final int HDR_GAMA_COMPRESSION_BT709 = 0;
    public static final int HDR_GAMUT_CONVERSION_BT709ADAPTIVE = 2;
    public static final int HDR_GAMUT_CONVERSION_BT709CLIP = 0;
    public static final int HDR_GAMUT_CONVERSION_BT709COMPRESS = 1;
    public static final int HDR_HUE_REFERENCE_DISPLAY = 0;
    public static final int HDR_HUE_REFERENCE_SCENE = 1;
    public static final int HDR_LUT_HLG2SDR_LINEAR = 0;
    public static final int HDR_LUT_HLG2SDR_NBCU_ADOBE = 2;
    public static final int HDR_LUT_HLG2SDR_NBCU_DAVINCI = 1;
    public static final int HDR_LUT_HLG2SDR_NBCU_HARDWARE = 3;
    public static final int HDR_LUT_PQ2SDR_ACES_1_3 = 10;
    public static final int HDR_LUT_PQ2SDR_ACES_1_3_REFERENCE = 11;
    public static final int HDR_LUT_PQ2SDR_BT2446_BT2407 = 9;
    public static final int HDR_LUT_PQ2SDR_DAVINCI = 6;
    public static final int HDR_LUT_PQ2SDR_DAVINCI_LUMINANCE = 7;
    public static final int HDR_LUT_PQ2SDR_DAVINCI_SATURATION = 8;
    public static final int HDR_LUT_PQ2SDR_LINEAR_V1 = 4;
    public static final int HDR_LUT_PQ2SDR_LINEAR_V2 = 5;
    public static final int HDR_LUT_PQ2SDR_NBCU_ADOBE = 3;
    public static final int HDR_LUT_PQ2SDR_NBCU_HARDWARE = 2;
    public static final int HDR_LUT_PQ2SDR_NBCU_RESOLVE = 1;
    public static final int HDR_LUT_PQ2SDR_YOUTUBE_V3 = 0;
    public static final int HDR_TONEMAP_ANDROID_13 = 2;
    public static final int HDR_TONEMAP_ANDROID_8 = 1;
    public static final int HDR_TONEMAP_BT2446A = 3;
    public static final int HDR_TONEMAP_BT2446A1 = 4;
    public static final int HDR_TONEMAP_BT2446C = 5;
    public static final int HDR_TONEMAP_HABLE = 0;
    static final int MEDIA_BUFFERING_UPDATE = 3;
    static final int MEDIA_ERROR = 100;
    public static final int MEDIA_ERROR_BACKGROUND_RETRY = 0;
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NETWORK = -1011;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_ERROR_Z_PLAYER = -10000;
    static final int MEDIA_INFO = 200;
    static final int MEDIA_NOP = 0;
    static final int MEDIA_PLAYBACK_COMPLETE = 2;
    static final int MEDIA_PREPARED = 1;
    static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SET_VIDEO_SAR = 10001;
    static final int MEDIA_SET_VIDEO_SIZE = 5;
    static final int MEDIA_TIMED_TEXT = 99;
    public static final int MEDIA_TYPE_HLS = 1;
    public static final int MEDIA_TYPE_MP4 = 2;
    public static final int MEDIA_TYPE_UNKNOWN = 0;
    public static final int NETWORK_ERROR_RETRY_LATER = -1012;
    public static final int NETWORK_ERROR_ROLLED_URL = -1013;
    public static final int NETWORK_ERROR_UI_INTERRUPT = -1014;
    public static final int OPTION_CATEGORY_CODEC = 2;
    public static final int OPTION_CATEGORY_FORMAT = 1;
    public static final int OPTION_CATEGORY_PLAYER = 4;
    public static final int OPTION_CATEGORY_SWR = 5;
    public static final int OPTION_CATEGORY_SWS = 3;
    public static final String OPTION_FORMAT_KEY_CACHE_ENABLED = "zcache_enabled";
    public static final String OPTION_FORMAT_KEY_CACHE_INDEX = "zcache_index";
    public static final String OPTION_FORMAT_KEY_CACHE_OID = "zcache_oid";
    public static final String OPTION_FORMAT_KEY_CACHE_PATH = "zcache_path";
    public static final String OPTION_FORMAT_KEY_CACHE_SECTION = "zcache_section";
    public static final String OPTION_FORMAT_KEY_CACHE_URL_TYPE = "zcache_type";
    public static final String OPTION_PLAYER_E2EE_FLAG = "enable-e2ee-video-qos";
    public static final String OPTION_PLAYER_FIRST_VFRAME_RENDER_QOS = "enable-first-vframe-render-qos";
    public static final String OPTION_PLAYER_KEY_ACCURATE_SEEK_TIMEOUT = "accurate-seek-timeout";
    public static final String OPTION_PLAYER_KEY_ASYNC_INIT_DECODER = "async-init-decoder";
    public static final String OPTION_PLAYER_KEY_AUDIO_FILTER = "audio-filters";
    public static final String OPTION_PLAYER_KEY_AV_SYNC_TYPE = "av-sync-type";
    public static final String OPTION_PLAYER_KEY_CORNER_RADIUS = "corner-radius";
    public static final String OPTION_PLAYER_KEY_DISABLE_AUDIO = "disable-audio";
    public static final String OPTION_PLAYER_KEY_DISABLE_DISPLAY = "disable-display";
    public static final String OPTION_PLAYER_KEY_DISABLE_VIDEO = "disable-video";
    public static final String OPTION_PLAYER_KEY_ENABLE_ACCURATE_SEEK = "enable-accurate-seek";
    public static final String OPTION_PLAYER_KEY_FEATURE_BLUR = "enable-blur-top-bottom";
    public static final String OPTION_PLAYER_KEY_FEATURE_BLUR_LEVEL = "enable-blur-top-bottom-level";
    public static final String OPTION_PLAYER_KEY_FEATURE_LIVE_STREAM = "enable-live-stream";
    public static final String OPTION_PLAYER_KEY_FEATURE_MASK = "enable-mask";
    public static final String OPTION_PLAYER_KEY_FEATURE_PLAY_IN_RANGE = "enable-play-in-range";
    public static final String OPTION_PLAYER_KEY_FORCE_FORMAT = "force-format";
    public static final String OPTION_PLAYER_KEY_FRAME_DROP = "frame-drop";
    public static final String OPTION_PLAYER_KEY_HDR_CONTENT_MAX_LUMINANCE = "hdr-content-max-luminance";
    public static final String OPTION_PLAYER_KEY_HDR_CURRENT_DISPLAY_LUMINANCE = "hdr-current-display-luminance";
    public static final String OPTION_PLAYER_KEY_HDR_DISPLAY_MAX_LUMINANCE = "hdr-display-max-luminance";
    public static final String OPTION_PLAYER_KEY_HDR_GAMA_COMPRESSION = "hdr-gama-compression";
    public static final String OPTION_PLAYER_KEY_HDR_GAMUT_CONVERSION = "hdr-gamut-conversion";
    public static final String OPTION_PLAYER_KEY_HDR_HUE_REFERENCE = "hdr-hue-reference";
    public static final String OPTION_PLAYER_KEY_HDR_LUT_TYPE = "hdr-lut-type";
    public static final String OPTION_PLAYER_KEY_HDR_TONEMAP_TYPE = "hdr-tonemap-type";
    public static final String OPTION_PLAYER_KEY_INFINITE_BUFFER = "infinite-buffer";
    public static final String OPTION_PLAYER_KEY_IS_GIF = "is-gif";
    public static final String OPTION_PLAYER_KEY_MAX_BUFFER_SIZE = "max-buffer-size";
    public static final String OPTION_PLAYER_KEY_MAX_FPS = "max-fps";
    public static final String OPTION_PLAYER_KEY_MEDIACODEC = "mediacodec";
    public static final String OPTION_PLAYER_KEY_MEDIACODEC_AUTO_RESOLUTION_CHANGE = "mediacodec-auto-resolution-change";
    public static final String OPTION_PLAYER_KEY_MEDIACODEC_AUTO_ROTATE = "mediacodec-auto-rotate";
    public static final String OPTION_PLAYER_KEY_MEDIACODEC_DEFAULT_NAME = "mediacodec-default-name";
    public static final String OPTION_PLAYER_KEY_MEDIACODEC_SYNC = "mediacodec-sync";
    public static final String OPTION_PLAYER_KEY_META_DELAY_INIT = "meta-delay-init";
    public static final String OPTION_PLAYER_KEY_MIN_FRAMES = "min-frames";
    public static final String OPTION_PLAYER_KEY_NUMBER_OF_LOOP = "loop";
    public static final String OPTION_PLAYER_KEY_OPENSLES = "opensles";
    public static final String OPTION_PLAYER_KEY_OVERLAY_FORMAT = "overlay-format";
    public static final String OPTION_PLAYER_KEY_PACKET_BUFFERING = "packet-buffering";
    public static final String OPTION_PLAYER_KEY_PLAY_IN_DURATION = "play-duration";
    public static final String OPTION_PLAYER_KEY_PLAY_REVERSE = "play-reverse";
    public static final String OPTION_PLAYER_KEY_PLAY_START_TIME = "play-start-time";
    public static final String OPTION_PLAYER_KEY_RENDER_WAIT_START = "render-wait-start";
    public static final String OPTION_PLAYER_KEY_SEEK_AT_START = "seek-at-start";
    public static final String OPTION_PLAYER_KEY_SOFTWARE_DECODE = "software-decoder";
    public static final String OPTION_PLAYER_KEY_STARTUP_VOLUME = "startup-volume";
    public static final String OPTION_PLAYER_KEY_START_ON_PREPARED = "start-on-prepared";
    public static final String OPTION_PLAYER_KEY_SUBTITLE = "subtitle";
    public static final String OPTION_PLAYER_KEY_SYNC_AV_START = "sync-av-start";
    public static final String OPTION_PLAYER_KEY_VIDEO_PICTURE_QUEUE_SIZE = "video-pictq-size";
    public static final String OPTION_PLAYER_KEY_VIDIO_FILTER = "video-filters";
    public static final String OPTION_PLAYER_KEY_VOLUME_FADE_INOUT_TIME = "volume-fade-inout-time";
    public static final String OPTION_PLAYER_LOADING_TIMEOUT = "loading-timeout";
    public static final String OPTION_PLAYER_STATES_QOS = "enable-player-states-qos";
    public static final String OPTION_PLAYER_WAIT_TIME_QOS = "enable-total-wait-time-qos";
    public static final int PLAYER_LOG_DEBUG = 3;
    public static final int PLAYER_LOG_DEFAULT = 1;
    public static final int PLAYER_LOG_ERROR = 6;
    public static final int PLAYER_LOG_FATAL = 7;
    public static final int PLAYER_LOG_INFO = 4;
    public static final int PLAYER_LOG_SILENT = 8;
    public static final int PLAYER_LOG_UNKNOWN = 0;
    public static final int PLAYER_LOG_VERBOSE = 2;
    public static final int PLAYER_LOG_WARN = 5;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_GLES2 = 844318047;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    private static final boolean SHOW_DOWNLOAD_DEBUG_INFO = false;
    static final String TAG = "ZMediaPlayer";
    public static final int VIDEO_CACHE_STATUS_DOWNLOADED_PARTIALLY = 0;
    public static final int VIDEO_CACHE_STATUS_DOWNLOAD_FULL = 1;
    public static final int VIDEO_CACHE_STATUS_LIB_NOT_LOADED = -2;
    public static final int VIDEO_CACHE_STATUS_NOT_DOWNLOADED = -1;
    public static final int VIDEO_REMOTE_STATUS_VIDEO_EXISTS = 0;
    public static final int VIDEO_REMOTE_STATUS_VIDEO_ROLLED = -1;
    public static final int ZPLAYER_EXPIRED_URL = -1016;
    public static final int ZPLAYER_INVALID_DATA = -4043;
    public static final int ZPLAYER_LOADING_TIMEOUT = -1015;
    public static final int ZPLAYER_ROLLED_CACHED = -4041;
    public static final int ZPLAYER_ROLLED_NOT_CACHED = -4040;
    public static final int ZPLAYER_UNSUPPORTED_AUDIO_CODEC = -8890;
    public static final int ZPLAYER_UNSUPPORTED_CODEC = -8888;
    public static final int ZPLAYER_UNSUPPORTED_FORMAT = -7777;
    public static final int ZPLAYER_UNSUPPORTED_PROTOCOL = -9999;
    public static final int ZPLAYER_UNSUPPORTED_SUBTITLE_CODEC = -8891;
    public static final int ZPLAYER_UNSUPPORTED_VIDEO_CODEC = -8889;
    public static PrecacheVideoListener mPrecacheListener;
    static Map<String, Integer> sKnownCodecList;
    String mDataSource;
    private HandlerC17299a mEventHandler;
    int mIndex;
    long mNativeAndroidDataSource;
    long mNativeMediaPlayer;
    String mObjectId;
    OnControlMessageListener mOnControlMessageListener;
    private OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    OnNativeInvokeListener mOnNativeInvokeListener;
    private boolean mScreenOnWhilePlaying;
    int mSection;
    private boolean mStayAwake;
    private SurfaceHolder mSurfaceHolder;
    int mVideoHeight;
    int mVideoSarDen;
    int mVideoSarNum;
    int mVideoWidth;
    static final Map<String, List<CacheItem>> mCacheDetails = Collections.synchronizedMap(new HashMap());
    static final List<HLSItem> mHSlItem = Collections.synchronizedList(new ArrayList());
    static long mLastMP4Updated = 0;
    static volatile boolean mIsLibLoaded = false;
    static volatile boolean mIsNativeInitialized = false;
    static volatile String mBasePath = "";
    private PowerManager.WakeLock mWakeLock = null;
    boolean callOnce = false;

    /* loaded from: classes7.dex */
    public static class CacheItem {
        public long mCacheSize;
        public boolean mCaching;
        public int mIndex;
        public long mSize;
        public String msgId;

        CacheItem(int i11, long j11, long j12) {
            long j13;
            boolean z11;
            this.mIndex = i11;
            this.mSize = j11;
            if (Math.abs(j12) <= this.mSize) {
                j13 = Math.abs(j12);
            } else {
                j13 = 0;
            }
            this.mCacheSize = j13;
            if (j12 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.mCaching = z11;
        }
    }

    /* loaded from: classes7.dex */
    public static class HLSItem {
        public String mId;
        public int mIndex;
        public long mLastUpdate;
        public int mSession;
        public String mUid;
        public String mUrl;

        public HLSItem(int i11, String str, String str2, int i12) {
            this.mIndex = i11;
            this.mUrl = str;
            this.mUid = str2;
            this.mSession = i12;
        }

        public HLSItem(String str, String str2, String str3, int i11) {
            this.mId = str;
            this.mIndex = 0;
            this.mLastUpdate = 0L;
            this.mUrl = str2;
            this.mUid = str3;
            this.mSession = i11;
        }
    }

    /* loaded from: classes7.dex */
    public interface OnControlMessageListener {
        String onControlResolveSegmentUrl(int i11);
    }

    /* loaded from: classes7.dex */
    public interface OnMediaCodecSelectListener {
        String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i11, int i12);
    }

    /* loaded from: classes7.dex */
    public interface OnNativeInvokeListener {
        public static final String ARG_BYTES = "bytes";
        public static final String ARG_ERROR = "error";
        public static final String ARG_OFFSET_READ = "offset_read";
        public static final String ARG_OFFSET_SEEK = "offset_seek";
        public static final String ARG_READ_COUNT = "read_count";
        public static final String ARG_SEEK_COUNT = "seek_count";
        public static final String ARG_SEGMENT_INDEX = "zsegment_index";
        public static final String ARG_SIZE_REQUEST = "size_request";
        public static final String ARG_SIZE_RESPONSE = "size_response";
        public static final String ARG_URL = "url";
        public static final int ZEVENT_PROTOCOL_ZIO_DID_CLOSE = 8;
        public static final int ZEVENT_PROTOCOL_ZIO_DID_OPEN = 2;
        public static final int ZEVENT_PROTOCOL_ZIO_DID_READ = 4;
        public static final int ZEVENT_PROTOCOL_ZIO_DID_SEEK = 6;
        public static final int ZEVENT_PROTOCOL_ZIO_WILL_CLOSE = 7;
        public static final int ZEVENT_PROTOCOL_ZIO_WILL_OPEN = 1;
        public static final int ZEVENT_PROTOCOL_ZIO_WILL_READ = 3;
        public static final int ZEVENT_PROTOCOL_ZIO_WILL_SEEK = 5;
        public static final int ZEVENT_ZSEGMENT_IOCONTROL_LIVE = 131073;

        boolean onNativeInvoke(int i11, Bundle bundle);
    }

    /* loaded from: classes7.dex */
    public interface PrecacheVideoListener {
        void onDataPrecacheUpdate(int i11, String str);
    }

    /* loaded from: classes7.dex */
    public static class VideoMediaCodecSelector implements OnMediaCodecSelectListener {
        public static final VideoMediaCodecSelector sInstance = new VideoMediaCodecSelector();

        @Override // com.zing.zalo.zmedia.player.ZMediaPlayer.OnMediaCodecSelectListener
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String str, int i11, int i12) {
            if (!str.startsWith("video")) {
                return null;
            }
            return AbstractC24827h.m129074b(str);
        }
    }

    /* renamed from: com.zing.zalo.zmedia.player.ZMediaPlayer$a */
    /* loaded from: classes7.dex */
    public static class HandlerC17299a extends Handler {

        /* renamed from: a */
        final WeakReference f88143a;

        public HandlerC17299a(ZMediaPlayer zMediaPlayer, Looper looper) {
            super(looper);
            this.f88143a = new WeakReference(zMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ZMediaPlayer zMediaPlayer = (ZMediaPlayer) this.f88143a.get();
            if (zMediaPlayer != null) {
                long j11 = 0;
                if (zMediaPlayer.mNativeMediaPlayer != 0) {
                    int i11 = message.what;
                    if (i11 != -1011) {
                        if (i11 != 200) {
                            if (i11 != 10001) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        if (i11 != 2) {
                                            if (i11 != 3) {
                                                if (i11 != 4) {
                                                    if (i11 != 5) {
                                                        if (i11 != ZMediaPlayer.MEDIA_TIMED_TEXT) {
                                                            if (i11 != 100) {
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("Unknown message type ");
                                                                sb2.append(message.what);
                                                                return;
                                                            }
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("Error (");
                                                            sb3.append(message.arg1);
                                                            sb3.append(",");
                                                            sb3.append(message.arg2);
                                                            sb3.append(")");
                                                            zMediaPlayer.notifyOnError(message.arg1, message.arg2);
                                                            zMediaPlayer.stayAwake(false);
                                                            return;
                                                        }
                                                        if (message.obj == null) {
                                                            zMediaPlayer.notifyOnTimedText(null);
                                                            return;
                                                        } else {
                                                            zMediaPlayer.notifyOnTimedText(new ZTimedText(new Rect(0, 0, 1, 1), (String) message.obj));
                                                            return;
                                                        }
                                                    }
                                                    int i12 = message.arg1;
                                                    zMediaPlayer.mVideoWidth = i12;
                                                    int i13 = message.arg2;
                                                    zMediaPlayer.mVideoHeight = i13;
                                                    zMediaPlayer.notifyOnVideoSizeChanged(i12, i13, zMediaPlayer.mVideoSarNum, zMediaPlayer.mVideoSarDen);
                                                    return;
                                                }
                                                zMediaPlayer.notifyOnSeekComplete();
                                                return;
                                            }
                                            int i14 = message.arg1;
                                            if (i14 == -1 && message.arg2 == 100) {
                                                zMediaPlayer.notifyOnBufferingUpdate(100);
                                                return;
                                            }
                                            long j12 = i14;
                                            if (j12 < 0) {
                                                j12 = 0;
                                            }
                                            long duration = zMediaPlayer.getDuration();
                                            long j13 = 100;
                                            if (duration > 0) {
                                                j11 = (j12 * 100) / duration;
                                            }
                                            if (j11 < 100) {
                                                j13 = j11;
                                            }
                                            zMediaPlayer.notifyOnBufferingUpdate((int) j13);
                                            return;
                                        }
                                        zMediaPlayer.stayAwake(false);
                                        zMediaPlayer.notifyOnCompletion();
                                        zMediaPlayer.notifyOnStateChanged(5);
                                        return;
                                    }
                                    zMediaPlayer.notifyOnPrepared();
                                    zMediaPlayer.notifyOnStateChanged(2);
                                    return;
                                }
                                return;
                            }
                            zMediaPlayer.mVideoSarNum = message.arg1;
                            zMediaPlayer.mVideoSarDen = message.arg2;
                            return;
                        }
                        int i15 = message.arg1;
                        if (i15 != 3) {
                            if (i15 == 11001) {
                                zMediaPlayer.notifyOnCompletion();
                                zMediaPlayer.notifyOnCompletionInRange();
                            }
                        } else {
                            zMediaPlayer.notifyOnStateChanged(3);
                        }
                        zMediaPlayer.notifyOnInfo(message.arg1, message.arg2, message.obj);
                        return;
                    }
                    zMediaPlayer.notifyOnError(message.arg1, message.arg2);
                }
            }
        }
    }

    public ZMediaPlayer() {
        if (!mIsLibLoaded) {
            loadLibrariesOnce();
        }
        if (mIsLibLoaded && !mIsNativeInitialized) {
            initNativeOnce("");
        }
        if (mIsLibLoaded && mIsNativeInitialized) {
            ZMediaHandlerThread.getInstance();
            initPlayer();
        }
    }

    @Deprecated
    public static native void _cacheUrls(String[] strArr, String str, int i11, int i12);

    @Deprecated
    static native int _cacheValidate(String str, String str2);

    @Deprecated
    static native int _checkPlayingAndRemove(String str, int i11);

    @Deprecated
    static native int _checkUrlStatus(String str);

    @Deprecated
    static native int _cloneVideoFromCache(String str, String str2, String str3);

    @Deprecated
    static native void _closeUserStory(String str);

    @Deprecated
    static native int _deleteCachedVideo(String str, String str2);

    static native void _enableNetworkQoS(int i11);

    @Deprecated
    static native void _forceFullDownload(String str, int i11);

    static native void _forceSubmitLog();

    @Deprecated
    public static native void _freeHandle(Object obj);

    static native int _genThumbFromVideo(String str, String str2, int i11, int i12);

    @Deprecated
    static native long _getCacheSize(String str, int i11, int i12);

    static native long _getCellularData(int i11);

    @Deprecated
    static native long _getChunkCount(String str, String str2, int i11);

    @Deprecated
    static native long _getChunkSize(String str, int i11, int i12);

    static native String _getColorFormatName(int i11);

    static native String[] _getSectionPlaylist(int i11);

    static native int _isFileExisted(String str, String str2, int i11);

    @Deprecated
    static native int _isPlayingUrl(String str);

    @Deprecated
    public static native Object _loadHandle(String str, int i11) throws IllegalArgumentException, SecurityException, IllegalStateException;

    @Deprecated
    public static native Object _loadHandleFromBitmap(Object obj, int i11) throws IllegalArgumentException, SecurityException, IllegalStateException;

    public static native void _onNetworkChanged(int i11);

    @Deprecated
    static native void _precache(String str, String str2, int i11, int i12, int i13);

    static native void _precache2(String str, int i11, String str2, int i12, int i13, int i14);

    @Deprecated
    static native void _registerZMediaListener(IZMediaListener iZMediaListener, String str);

    @Deprecated
    public static native void _releaseAllUrl();

    @Deprecated
    static native int _releasePlaylistBySectionSync(int i11);

    @Deprecated
    public static native void _releaseUrlBySection(int i11);

    static native void _releaseVideoAtIndex(String str, int i11, int i12);

    static native void _resetDownloadedSize(int i11);

    @Deprecated
    static native void _setCurrentUser(String str);

    static native void _setLogLevel(int i11);

    static native void _setNetworkType(int i11);

    static native void _setPlayingIndex(int i11, int i12, String str);

    @Deprecated
    public static native void _setStopAllUrlCaching();

    @Deprecated
    static native void _startMonitorCacheDir();

    @Deprecated
    static native int _stopFullDownload(String str);

    @Deprecated
    static native void _stopMonitorCacheDir();

    @Deprecated
    static native void _unrefZMediaListener(IZMediaListener iZMediaListener, String str);

    public static void cacheUrls(ZMediaPlayerSettings.VideoConfig videoConfig, String[] strArr, String str, int i11, int i12) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            ZMediaHandlerThread.getInstance().postCacheUrls(strArr, str, i11, i12);
        }
    }

    public static int cacheValidate(String str, String str2) {
        if (!mIsNativeInitialized) {
            return -2;
        }
        return _cacheValidate(str, str2);
    }

    public static int checkPlayingAndRemove(String str, int i11) {
        if (!mIsNativeInitialized) {
            return -2;
        }
        return _checkPlayingAndRemove(str, i11);
    }

    public static int checkUrlStatus(String str) {
        return _checkUrlStatus(str);
    }

    public static boolean cloneVideoFromCache(ZMediaPlayerSettings.VideoConfig videoConfig, String str, String str2, String str3) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer() || _cloneVideoFromCache(str, str2, str3) != 1) {
            return false;
        }
        return true;
    }

    public static void closeUserStory(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _closeUserStory(str);
        }
    }

    public static int deleteCachedVideo(ZMediaPlayerSettings.VideoConfig videoConfig, String str, String str2) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer()) {
            return -1;
        }
        return _deleteCachedVideo(str, str2);
    }

    public static void enableNetworkQoS(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _enableNetworkQoS(i11);
    }

    static List<CacheItem> feedCacheDetails(HLSItem hLSItem) {
        return null;
    }

    public static void forceFullDownload(ZMediaPlayerSettings.VideoConfig videoConfig, String str, int i11) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _forceFullDownload(str, i11);
        }
    }

    public static void forceSubmitLog() {
        if (!mIsNativeInitialized) {
            return;
        }
        _forceSubmitLog();
    }

    public static void freeHandle(Object obj) {
        if (!mIsNativeInitialized) {
            return;
        }
        _freeHandle(obj);
    }

    public static int genThumbFromVideo(String str, String str2, int i11, int i12) {
        if (!mIsNativeInitialized) {
            return -1;
        }
        return _genThumbFromVideo(str, str2, i11, i12);
    }

    public static List<CacheItem> getCacheDetails(int i11) {
        return null;
    }

    public static long getCellularData(int i11) {
        if (!mIsNativeInitialized) {
            return 0L;
        }
        return _getCellularData(i11);
    }

    public static String getColorFormatName(int i11) {
        return _getColorFormatName(i11);
    }

    public static String[] getSectionPlaylist(ZMediaPlayerSettings.VideoConfig videoConfig, int i11) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer()) {
            return null;
        }
        return _getSectionPlaylist(i11);
    }

    private static String getUrlFromVideoItem(ZMediaPlayerSettings.VideoConfig videoConfig, ZVideoItem zVideoItem) {
        if (videoConfig.getPriorityFormat() == 0 && zVideoItem.hevcMp4Uri.length() > 0) {
            return zVideoItem.hevcMp4Uri;
        }
        return zVideoItem.h264HlsUri;
    }

    public static void initCacheDetails(ZMediaPlayerSettings.VideoConfig videoConfig, List<HLSItem> list) {
    }

    public static void initNativeOnce(String str) {
        synchronized (ZMediaPlayer.class) {
            try {
                if (!mIsNativeInitialized && mIsLibLoaded) {
                    ZPlayerLogger.setLogDirectory(str);
                    native_init();
                    native_cache_rule(ZCacheSetting.getZCacheConfigs());
                    _startMonitorCacheDir();
                    mIsNativeInitialized = true;
                    if (ZMediaPlayerSettings.DEBUG_ENABLED) {
                        _setLogLevel(3);
                    } else {
                        _setLogLevel(6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isFileExisted(ZMediaPlayerSettings.VideoConfig videoConfig, String str, String str2, int i11) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer() || _isFileExisted(str, str2, i11) != 1) {
            return false;
        }
        return true;
    }

    public static boolean isLibrariesLoaded() {
        return mIsNativeInitialized && mIsLibLoaded;
    }

    public static int isPlayingUrl(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer()) {
            return 0;
        }
        return _isPlayingUrl(str);
    }

    public /* synthetic */ void lambda$setDataSourceAsync$0(Uri uri, IMediaPlayer.OnDataSourceCheckedListener onDataSourceCheckedListener) {
        try {
            ParcelFileDescriptor openFileDescriptor = CoreUtility.getAppContext().getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                this.mDataSource = "pipe:" + openFileDescriptor.detachFd();
                openFileDescriptor.close();
                onDataSourceCheckedListener.onSuccess(this.mDataSource);
            }
        } catch (IOException unused) {
            onDataSourceCheckedListener.onFailed();
        }
    }

    public static Object loadHandle(String str, int i11) throws IllegalArgumentException, SecurityException, IllegalStateException {
        if (!mIsNativeInitialized) {
            return null;
        }
        return _loadHandle(str, i11);
    }

    public static void loadLibrariesOnce() {
        synchronized (ZMediaPlayer.class) {
            try {
                if (!mIsLibLoaded) {
                    try {
                        NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84882Y);
                        mIsLibLoaded = true;
                    } catch (Throwable unused) {
                        mIsLibLoaded = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    static native void native_cache_rule(ZCacheConfig[] zCacheConfigArr);

    static native void native_init();

    @Deprecated
    static native void native_preset(String str, int i11, int i12, double d11, double d12, int i13);

    static boolean onNativeInvoke(Object obj, int i11, Bundle bundle) {
        OnControlMessageListener onControlMessageListener;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onNativeInvoke ");
        sb2.append(i11);
        if (obj != null && (obj instanceof WeakReference)) {
            ZMediaPlayer zMediaPlayer = (ZMediaPlayer) ((WeakReference) obj).get();
            if (zMediaPlayer != null) {
                OnNativeInvokeListener onNativeInvokeListener = zMediaPlayer.mOnNativeInvokeListener;
                if (onNativeInvokeListener != null && onNativeInvokeListener.onNativeInvoke(i11, bundle)) {
                    return true;
                }
                if (i11 != 131073 || (onControlMessageListener = zMediaPlayer.mOnControlMessageListener) == null) {
                    return false;
                }
                int i12 = bundle.getInt(OnNativeInvokeListener.ARG_SEGMENT_INDEX, -1);
                if (i12 >= 0) {
                    String onControlResolveSegmentUrl = onControlMessageListener.onControlResolveSegmentUrl(i12);
                    if (onControlResolveSegmentUrl != null) {
                        bundle.putString(OnNativeInvokeListener.ARG_URL, onControlResolveSegmentUrl);
                        return true;
                    }
                    throw new RuntimeException(new IOException("onNativeInvoke() = <NULL newUrl>"));
                }
                throw new InvalidParameterException("onNativeInvoke(invalid segment index)");
            }
            throw new IllegalStateException("<null weakPlayer>.onNativeInvoke()");
        }
        throw new IllegalStateException("NULL <ZMediaPlayer>.onNativeInvoke()");
    }

    public static void onNetworkChange(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        ZMediaHandlerThread.getInstance().postNotifyNetworkChanged(i11);
    }

    private static String onSelectCodec(Object obj, String str, int i11, int i12) {
        ZMediaPlayer zMediaPlayer;
        if (obj == null || !(obj instanceof WeakReference) || (zMediaPlayer = (ZMediaPlayer) ((WeakReference) obj).get()) == null) {
            return null;
        }
        OnMediaCodecSelectListener onMediaCodecSelectListener = zMediaPlayer.mOnMediaCodecSelectListener;
        if (onMediaCodecSelectListener == null) {
            onMediaCodecSelectListener = VideoMediaCodecSelector.sInstance;
        }
        return onMediaCodecSelectListener.onMediaCodecSelect(zMediaPlayer, str, i11, i12);
    }

    static boolean onVerifyCodec(Object obj, String str) {
        if (obj == null || !(obj instanceof WeakReference) || str == null || ((ZMediaPlayer) ((WeakReference) obj).get()) == null) {
            return false;
        }
        return AbstractC24827h.m129085m(str.toLowerCase(Locale.US));
    }

    static void postEventFromNative(Object obj, int i11, int i12, int i13, Object obj2) {
        ZMediaPlayer zMediaPlayer;
        if (obj == null || (zMediaPlayer = (ZMediaPlayer) ((WeakReference) obj).get()) == null) {
            return;
        }
        if (i11 == 200 && i12 == 2) {
            zMediaPlayer.start();
        }
        HandlerC17299a handlerC17299a = zMediaPlayer.mEventHandler;
        if (handlerC17299a != null) {
            zMediaPlayer.mEventHandler.sendMessage(handlerC17299a.obtainMessage(i11, i12, i13, obj2));
        }
    }

    public static void precache(ZMediaPlayerSettings.VideoConfig videoConfig, String str, String str2, int i11, int i12, int i13) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _precache(str, str2, i11, i12, i13);
        }
    }

    public static void precache2(ZMediaPlayerSettings.VideoConfig videoConfig, String str, int i11, String str2, int i12, int i13, int i14) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            if (str.contains(".mp4")) {
                _precache2(str, 2, str2, i12, i13, i14);
            } else {
                _precache2(str, 0, str2, i12, i13, i14);
            }
        }
    }

    public static void precacheVideoItem(ZMediaPlayerSettings.VideoConfig videoConfig, ZVideoItem zVideoItem) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            if (zVideoItem.hevcMp4Uri.length() > 0 && videoConfig.getPriorityFormat() == 0) {
                _precache2(zVideoItem.hevcMp4Uri, 2, zVideoItem.userId, zVideoItem.index, zVideoItem.source, zVideoItem.priority);
            } else if (zVideoItem.h264HlsUri.length() > 0) {
                _precache2(zVideoItem.h264HlsUri, 0, zVideoItem.userId, zVideoItem.index, zVideoItem.source, zVideoItem.priority);
            }
        }
    }

    public static void preloadLibrary(String str) {
        if (!mIsLibLoaded) {
            loadLibrariesOnce();
        }
        if (!mIsNativeInitialized) {
            initNativeOnce(str);
        }
    }

    public static void registerZMediaListener(ZMediaPlayerSettings.VideoConfig videoConfig, IZMediaListener iZMediaListener, String str) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _registerZMediaListener(iZMediaListener, str);
        }
    }

    public static void releaseAllUrl(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _releasePlaylistBySectionSync(6);
            ZMediaHandlerThread.getInstance().postReleaseAllUrls();
        }
    }

    public static void releaseUrlBySection(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            if (videoConfig.getPlayerSection() == 6) {
                _releasePlaylistBySectionSync(6);
            } else {
                ZMediaHandlerThread.getInstance().postReleaseUrlBySection(videoConfig.getPlayerSection());
            }
        }
    }

    public static void releaseVideoAtIndex(ZMediaPlayerSettings.VideoConfig videoConfig, ZVideoItem zVideoItem) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _releaseVideoAtIndex(getUrlFromVideoItem(videoConfig, zVideoItem), zVideoItem.index, zVideoItem.source);
        }
    }

    public static void resetDownloadedSize(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _resetDownloadedSize(i11);
    }

    public static void setCurrentUser(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _setCurrentUser(str);
        }
    }

    public static void setLogLevel(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _setLogLevel(i11);
    }

    public static void setNetworkType(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _setNetworkType(i11);
    }

    public static void setPlayingIndex(ZMediaPlayerSettings.VideoConfig videoConfig, int i11, int i12, String str) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _setPlayingIndex(i11, i12, str);
        }
    }

    public static void setPlayingVideo(ZMediaPlayerSettings.VideoConfig videoConfig, ZVideoItem zVideoItem) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _setPlayingIndex(zVideoItem.source, zVideoItem.index, getUrlFromVideoItem(videoConfig, zVideoItem));
        }
    }

    public static void setStopAllUrlCaching(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            ZMediaHandlerThread.getInstance().postStopAllCachingUrls();
        }
    }

    public static int stopFullDownload(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        if (!mIsNativeInitialized || !videoConfig.isZaloPlayer()) {
            return -1;
        }
        return _stopFullDownload(str);
    }

    public static void unrefZMediaListener(ZMediaPlayerSettings.VideoConfig videoConfig, IZMediaListener iZMediaListener, String str) {
        if (mIsNativeInitialized && videoConfig.isZaloPlayer()) {
            _unrefZMediaListener(iZMediaListener, str);
        }
    }

    public static void updateCacheData(String str, int i11, long j11, long j12) {
    }

    native void _fastSeekTo(long j11) throws IllegalStateException;

    native String _getAudioCodecInfo();

    native int _getAudioSessionId();

    native long _getCurrentPosition();

    native long _getDuration();

    native int _getLoopCount();

    native Bundle _getMediaMeta();

    native float _getPropertyFloat(int i11, float f11);

    native long _getPropertyLong(int i11, long j11);

    native String _getPropertyString(int i11, String str);

    native String _getVideoCodecInfo();

    native boolean _isPlaying();

    native void _pause() throws IllegalStateException;

    native void _prepareAsync() throws IllegalStateException;

    native void _release();

    native void _reset();

    native void _seekTo(long j11) throws IllegalStateException;

    native void _setDataSource(IAndroidDataSource iAndroidDataSource) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    native void _setLoopCount(int i11);

    @Deprecated
    public native void _setMaskHandle(Object obj) throws IllegalArgumentException, SecurityException, IllegalStateException;

    native void _setMuted(int i11);

    native void _setOption(int i11, String str, long j11);

    native void _setOption(int i11, String str, String str2);

    native void _setPlayDuration(long j11) throws IllegalStateException;

    native void _setPropertyFloat(int i11, float f11);

    native void _setPropertyLong(int i11, long j11);

    @Deprecated
    native void _setReverseMode(int i11) throws IllegalStateException;

    native void _setStreamSelected(int i11, boolean z11);

    @Deprecated
    public native void _setThumbHandle(Object obj) throws IllegalArgumentException, SecurityException;

    native void _setVideoSurface(Surface surface);

    native void _setVolume(float f11, float f12);

    native void _snapshot(String str) throws IllegalStateException;

    native void _start() throws IllegalStateException;

    native void _stop() throws IllegalStateException;

    public void fastSeekTo(long j11) throws IllegalStateException {
        if (!mIsNativeInitialized) {
            return;
        }
        _fastSeekTo(j11);
    }

    protected void finalize() throws Throwable {
        super.finalize();
    }

    public long getAudioCacheByPackets() {
        return _getPropertyLong(FFP_PROP_INT64_AUDIO_CACHED_PACKETS, 0L);
    }

    public long getAudioCachedBytes() {
        return _getPropertyLong(FFP_PROP_INT64_AUDIO_CACHED_BYTES, 0L);
    }

    public long getAudioCachedDuration() {
        return _getPropertyLong(FFP_PROP_INT64_AUDIO_CACHED_DURATION, 0L);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getAudioSessionId() {
        if (!mIsNativeInitialized) {
            return MEDIA_ERROR_Z_PLAYER;
        }
        return _getAudioSessionId();
    }

    public long getBitRate() {
        return _getPropertyLong(FFP_PROP_INT64_BIT_RATE, 0L);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public long getCurrentPosition() {
        if (!mIsNativeInitialized) {
            return -10000L;
        }
        return _getCurrentPosition();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public String getDataSource() {
        return this.mDataSource;
    }

    public String getDescription() {
        return _getPropertyString(FFP_PROP_STRING_DESCRIPTION, "defaultValue");
    }

    public float getDropFrameRate() {
        return _getPropertyFloat(10007, 0.0f);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public long getDuration() {
        if (!mIsNativeInitialized) {
            return -10000L;
        }
        return _getDuration();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public C24821b getMediaInfo() {
        C24821b c24821b = new C24821b();
        c24821b.f119160a = TAG;
        String _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            String[] split = _getVideoCodecInfo.split(",");
            if (split.length >= 2) {
                c24821b.f119161b = split[0];
                c24821b.f119162c = split[1];
            } else if (split.length >= 1) {
                c24821b.f119161b = split[0];
                c24821b.f119162c = "";
            }
        }
        String _getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getAudioCodecInfo)) {
            String[] split2 = _getAudioCodecInfo.split(",");
            if (split2.length >= 2) {
                c24821b.f119163d = split2[0];
                c24821b.f119164e = split2[1];
            } else if (split2.length >= 1) {
                c24821b.f119163d = split2[0];
                c24821b.f119164e = "";
            }
        }
        try {
            c24821b.f119165f = C24829j.m129096f(_getMediaMeta());
        } catch (Throwable unused) {
        }
        return c24821b;
    }

    public Bundle getMediaMeta() {
        if (!mIsNativeInitialized) {
            return null;
        }
        return _getMediaMeta();
    }

    public long getSeekLoadDuration() {
        return _getPropertyLong(FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION, 0L);
    }

    public float getSpeed(float f11) {
        return _getPropertyFloat(10003, 0.0f);
    }

    public long getTcpSpeed() {
        return _getPropertyLong(FFP_PROP_INT64_TCP_SPEED, 0L);
    }

    public long getVideoCacheByPackets() {
        return _getPropertyLong(FFP_PROP_INT64_VIDEO_CACHED_PACKETS, 0L);
    }

    public long getVideoCachedBytes() {
        return _getPropertyLong(FFP_PROP_INT64_VIDEO_CACHED_BYTES, 0L);
    }

    public long getVideoCachedDuration() {
        return _getPropertyLong(FFP_PROP_INT64_VIDEO_CACHED_DURATION, 0L);
    }

    public float getVideoDecodeFramesPerSecond() {
        return _getPropertyFloat(10001, 0.0f);
    }

    public int getVideoDecoder() {
        return (int) _getPropertyLong(FFP_PROP_INT64_VIDEO_DECODER, 0L);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public float getVideoOutputFramesPerSecond() {
        return _getPropertyFloat(10002, 0.0f);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    void initPlayer() {
        if (mIsNativeInitialized && mIsLibLoaded) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.mEventHandler = new HandlerC17299a(this, myLooper);
            } else {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    this.mEventHandler = new HandlerC17299a(this, mainLooper);
                } else {
                    this.mEventHandler = null;
                }
            }
            native_setup(new WeakReference(this));
            notifyOnStateChanged(0);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isLooping() {
        if (_getLoopCount() != 1) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isPlayable() {
        return true;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public boolean isPlaying() {
        if (!mIsNativeInitialized) {
            return false;
        }
        return _isPlaying();
    }

    native void native_finalize();

    native void native_message_loop(Object obj);

    native void native_setup(Object obj);

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void pause() throws IllegalStateException {
        stayAwake(false);
        _pause();
        notifyOnStateChanged(4);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void prepare() throws Exception {
        if (!this.callOnce) {
            this.callOnce = true;
            _prepareAsync();
            notifyOnStateChanged(1);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        if (!this.callOnce) {
            this.callOnce = true;
            _prepareAsync();
            notifyOnStateChanged(1);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void release() {
        this.callOnce = false;
        stayAwake(false);
        updateSurfaceScreenOn();
        resetListeners();
        _release();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void reset() {
        stayAwake(false);
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
    }

    @Override // com.zing.zalo.zmedia.player.AbstractMediaPlayer
    public void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void seekTo(long j11) throws IllegalStateException {
        if (!mIsNativeInitialized) {
            return;
        }
        _seekTo(j11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setAudioStreamType(int i11) {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        setDataSource(context, uri, null);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSourceAsync(String str, IMediaPlayer.OnDataSourceCheckedListener onDataSourceCheckedListener) throws IllegalArgumentException, SecurityException, IllegalStateException {
        if (AbstractC23254w8.m119859g(str)) {
            Executors.newSingleThreadExecutor(new ThreadFactoryC18928a(TAG)).execute(new Runnable() { // from class: com.zing.zalo.zmedia.player.b

                /* renamed from: q */
                public final /* synthetic */ Uri f88150q;

                /* renamed from: r */
                public final /* synthetic */ IMediaPlayer.OnDataSourceCheckedListener f88151r;

                public /* synthetic */ RunnableC17301b(Uri uri, IMediaPlayer.OnDataSourceCheckedListener onDataSourceCheckedListener2) {
                    r2 = uri;
                    r3 = onDataSourceCheckedListener2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZMediaPlayer.this.lambda$setDataSourceAsync$0(r2, r3);
                }
            });
        } else {
            this.mDataSource = str;
            onDataSourceCheckedListener2.onSuccess(str);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSourceWithFormatOptions(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                setOption(1, entry.getKey(), entry.getValue());
            }
        }
        setDataSource(str);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Surface surface;
        this.mSurfaceHolder = surfaceHolder;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = null;
        }
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setKeepInBackground(boolean z11) {
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setLooping(boolean z11) {
        int i11 = !z11 ? 1 : 0;
        setOption(4, OPTION_PLAYER_KEY_NUMBER_OF_LOOP, i11);
        if (!mIsNativeInitialized) {
            return;
        }
        _setLoopCount(i11);
    }

    public void setMaskHandle(Object obj) throws IllegalArgumentException, SecurityException, IllegalStateException {
        if (!mIsNativeInitialized) {
            return;
        }
        _setMaskHandle(obj);
    }

    public void setMuted(boolean z11) {
        _setMuted(z11 ? 1 : 0);
    }

    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    public void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    public void setOption(int i11, String str, String str2) {
        if (mIsNativeInitialized) {
            _setOption(i11, str, str2);
        }
    }

    public void setOptionDp(int i11, String str, long j11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _setOption(i11, str, ((float) j11) * Resources.getSystem().getDisplayMetrics().density);
    }

    public void setPlayDuration(long j11) throws IllegalStateException {
        if (!mIsNativeInitialized) {
            return;
        }
        _setPlayDuration(j11);
    }

    public void setReverseMode(int i11) {
        if (!mIsNativeInitialized) {
            return;
        }
        _setReverseMode(i11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z11) {
        if (this.mScreenOnWhilePlaying != z11) {
            this.mScreenOnWhilePlaying = z11;
            updateSurfaceScreenOn();
        }
    }

    public void setSpeed(float f11) {
        _setPropertyFloat(10003, f11);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setSurface(Surface surface) {
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    public void setThumbHandle(Object obj) throws IllegalArgumentException, SecurityException {
        if (!mIsNativeInitialized) {
            return;
        }
        _setThumbHandle(obj);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setVolume(float f11, float f12) {
        if (!mIsNativeInitialized) {
            return;
        }
        _setVolume(f11, f12);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    @SuppressLint({"Wakelock"})
    public void setWakeMode(Context context, int i11) {
        boolean z11;
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.mWakeLock.release();
                z11 = true;
            } else {
                z11 = false;
            }
            this.mWakeLock = null;
        } else {
            z11 = false;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) CoreUtility.getAppContext().getSystemService("power")).newWakeLock(i11 | 536870912, "ZMediaPlayer:wakelock");
        this.mWakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        if (z11) {
            this.mWakeLock.acquire();
        }
    }

    public void snapshot(ZMediaPlayerSettings.VideoConfig videoConfig, String str) {
        if (!mIsNativeInitialized) {
            return;
        }
        _snapshot(str);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void start() throws IllegalStateException {
        this.callOnce = false;
        stayAwake(true);
        _start();
        notifyOnStateChanged(3);
    }

    @SuppressLint({"Wakelock"})
    void stayAwake(boolean z11) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z11 && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z11 && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z11;
        updateSurfaceScreenOn();
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void stop() throws IllegalStateException {
        stayAwake(false);
        _stop();
        notifyOnStateChanged(6);
    }

    void updateSurfaceScreenOn() {
        boolean z11;
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            if (this.mScreenOnWhilePlaying && this.mStayAwake) {
                z11 = true;
            } else {
                z11 = false;
            }
            surfaceHolder.setKeepScreenOn(z11);
        }
    }

    public static List<CacheItem> getCacheDetails(String str) {
        return null;
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if ("file".equals(uri.getScheme())) {
            setDataSource(uri.getPath());
        } else {
            setDataSource(uri.toString(), map);
        }
    }

    public void setOption(int i11, String str, long j11) {
        if (mIsNativeInitialized) {
            _setOption(i11, str, j11);
        }
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (AbstractC23254w8.m119859g(str)) {
            try {
                ParcelFileDescriptor openFileDescriptor = CoreUtility.getAppContext().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    this.mDataSource = "pipe:" + openFileDescriptor.detachFd();
                    openFileDescriptor.close();
                }
            } catch (IOException unused) {
            }
        } else {
            this.mDataSource = str;
        }
        _setDataSource(this.mDataSource, null, null);
    }

    public void setDataSource(String str, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append(":");
                if (!TextUtils.isEmpty(entry.getValue())) {
                    sb2.append(entry.getValue());
                }
                sb2.append("\r\n");
            }
            setOption(1, "headers", sb2.toString());
        }
        setDataSource(str);
    }

    @Override // com.zing.zalo.zmedia.player.IMediaPlayer
    public void setDataSource(IAndroidDataSource iAndroidDataSource) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        if (mIsLibLoaded && mIsNativeInitialized) {
            _setDataSource(iAndroidDataSource);
            return;
        }
        throw new IllegalStateException("Libraries did not load or initiated successful!!!");
    }
}
