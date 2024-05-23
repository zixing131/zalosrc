package com.zing.zalo.zmedia.player;

import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONObject;
import pl0.AbstractC24827h;
import pm0.C24848g0;

/* loaded from: classes.dex */
public final class ZMediaPlayerSettings {
    public static List<CacheConfig> CACHE_CONFIG_LIST = null;
    public static boolean DEBUG_ENABLED = false;
    public static final int DISPLAY_HDR10 = 1;
    public static final int DISPLAY_HDR10_PLUS = 2;
    public static final int DISPLAY_HDR_INVALID = -1;
    public static final int DISPLAY_HGL = 0;
    public static boolean ENABLE_FEATURE_MASK = false;
    public static boolean ENABLE_FEATURE_ROUND_CORNER = false;
    public static boolean ENABLE_FEATURE_VOLUME_FADE_INOUT = false;
    public static boolean IS_SHOW_DEBUG_INFO_VIEW = false;
    public static final int MEDIAPLAYER_TYPE__AndroidMediaPlayer = 0;
    public static final int MEDIAPLAYER_TYPE__ZMediaPlayer = 1;
    public static final int PLAYMODE_AUTO = 1;
    public static final int PLAYMODE_OFF = 0;
    public static final int PLAYMODE_POPUP = 2;
    public static final int PLAYMODE_STANDALONE = 3;
    public static List<PlayConfig> PLAY_CONFIG_LIST = null;
    public static final int PLAY_CONFIG_TYPE_CHAT_FULL = 2;
    public static final int PLAY_CONFIG_TYPE_CHAT_INLINE = 1;
    public static final int PLAY_CONFIG_TYPE_DEFAULT = 0;
    public static final int PLAY_CONFIG_TYPE_FEED_FULL = 4;
    public static final int PLAY_CONFIG_TYPE_FEED_TIMELINE = 3;
    public static final int PLAY_CONFIG_TYPE_FEED_TIMELINE_OFFSOUND = 8;
    public static final int PLAY_CONFIG_TYPE_FEED_ZCHANNEL = 10;
    public static final int PLAY_CONFIG_TYPE_GIF_FULL = 6;
    public static final int PLAY_CONFIG_TYPE_OA = 7;
    public static final int PLAY_CONFIG_TYPE_SIZE = 13;
    public static final int PLAY_CONFIG_TYPE_STORY = 5;
    public static final int PLAY_CONFIG_TYPE_ZCHANNEL = 9;
    public static final int PLAY_CONFIG_TYPE_ZCHANNEL_LIVESTREAM = 11;
    public static final int PLAY_CONFIG_TYPE_ZINSTANT = 12;
    public static final int RENDER_MODE_AUTO = -1;
    public static final int RENDER_MODE_NATIVE = 0;
    public static final int RENDER_MODE_OPENGL = 1;
    public static final int SECTION_TYPE_CHAT = 0;
    public static final int SECTION_TYPE_DEFAULT = 8;
    public static final int SECTION_TYPE_FEED = 1;
    public static final int SECTION_TYPE_GIF = 4;
    public static final int SECTION_TYPE_GROUP = 5;
    public static final int SECTION_TYPE_OA = 3;
    public static final int SECTION_TYPE_SIZE = 9;
    public static final int SECTION_TYPE_STORY = 2;
    public static final int SECTION_TYPE_ZCHANNEL = 6;
    public static final int SECTION_TYPE_ZINSTANT = 7;
    public static final String TAG = "ZMediaPlayerSettings";
    public static final int URL_TYPE_HLS = 0;
    public static final int URL_TYPE_MP4 = 2;
    private static String VIDEO_CACHE_DIR_CHAT;
    private static String VIDEO_CACHE_DIR_DEFAULT;
    private static String VIDEO_CACHE_DIR_FEED;
    private static String VIDEO_CACHE_DIR_GIF;
    private static String VIDEO_CACHE_DIR_GROUP;
    private static String VIDEO_CACHE_DIR_OA;
    private static String VIDEO_CACHE_DIR_STORY;
    private static String VIDEO_CACHE_DIR_ZCHANNEL;
    private static String VIDEO_CACHE_DIR_ZINSTANT;
    public static List<VideoConfig> VIDEO_CONFIG_LIST;
    private static final ReentrantLock cacheConfigLock;
    private static String externalCachePath;
    private static String externalFilesPath;
    private static final String internalCachePath;
    private static final String internalFilesPath;
    private static final String internalLogFilesPath;
    private static volatile int logLevel;
    private static final ReentrantLock playConfigLock;
    private static final ReentrantLock videoConfigLock;
    public static final ZMediaPlayerSettings INSTANCE = new ZMediaPlayerSettings();
    public static boolean ENABLE_QOS_STATE = true;
    public static boolean ENABLE_QOS_NETWORK = true;
    public static boolean ENABLE_QOS_INFO = true;
    public static boolean ENABLE_QOS_STATISTICS = true;
    public static boolean ENABLE_FEATURE_BLUR_TOP_BOTTOM = true;
    public static boolean ENABLE_FEATURE_HDR = true;
    public static boolean ENABLE_FEATURE_LIVE_STREAM = true;
    public static boolean VIDEO_DECODER_MEDIA_CODEC = true;
    public static boolean VIDEO_DECODER_WRAPPER = !true;
    public static boolean VIDEO_DECODER_SOFTWARE = !true;
    public static boolean AUDIO_DECODER_OPENSLES = true;
    public static int playMode = 3;
    public static boolean isFullScreen = true;

    /* loaded from: classes.dex */
    public static final class CacheConfig {
        public static final Companion Companion = new Companion(null);
        private static final int DEFAULT_BASE_CACHE_SIZE = 300;
        private static final int DEFAULT_CACHE_TIME_TO_LIVE = 72;
        private static final int DEFAULT_OFF_CACHE_SIZE = 50;
        public static final String TAG = "CacheConfig";
        private double addCacheSizePercent;
        private int baseCacheSize;
        private double freeStoragePercent;
        private double maxCacheSizePercent;
        private int offCacheSize;
        private int playerSection;
        private int timeToLive;
        private double totalStoragePercent;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public CacheConfig(int i11) {
            setupVideoCacheDir(i11);
            this.playerSection = i11;
            switch (i11) {
                case 0:
                    this.baseCacheSize = DEFAULT_BASE_CACHE_SIZE;
                    this.addCacheSizePercent = 0.1d;
                    this.maxCacheSizePercent = 0.5d;
                    this.freeStoragePercent = 10.0d;
                    this.totalStoragePercent = 2.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = 720;
                    return;
                case 1:
                    this.baseCacheSize = 200;
                    this.addCacheSizePercent = 0.05d;
                    this.maxCacheSizePercent = 0.3d;
                    this.freeStoragePercent = 5.0d;
                    this.totalStoragePercent = 1.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = DEFAULT_CACHE_TIME_TO_LIVE;
                    return;
                case 2:
                    this.baseCacheSize = 200;
                    this.addCacheSizePercent = 0.0d;
                    this.maxCacheSizePercent = 0.7d;
                    this.freeStoragePercent = 5.0d;
                    this.totalStoragePercent = 0.5d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = 24;
                    return;
                case 3:
                    this.baseCacheSize = 1000;
                    this.addCacheSizePercent = 0.0d;
                    this.maxCacheSizePercent = 0.2d;
                    this.freeStoragePercent = 2.0d;
                    this.totalStoragePercent = 0.5d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = 12;
                    return;
                case 4:
                    this.baseCacheSize = 200;
                    this.addCacheSizePercent = 0.1d;
                    this.maxCacheSizePercent = 0.5d;
                    this.freeStoragePercent = 3.0d;
                    this.totalStoragePercent = 1.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = 168;
                    return;
                case 5:
                    this.baseCacheSize = VideoConfig.MIN_PACKET_SIZE;
                    this.addCacheSizePercent = 0.1d;
                    this.maxCacheSizePercent = 0.5d;
                    this.freeStoragePercent = 5.0d;
                    this.totalStoragePercent = 1.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = 168;
                    return;
                case 6:
                    this.baseCacheSize = 200;
                    this.addCacheSizePercent = 0.05d;
                    this.maxCacheSizePercent = 0.3d;
                    this.freeStoragePercent = 5.0d;
                    this.totalStoragePercent = 1.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = DEFAULT_CACHE_TIME_TO_LIVE;
                    return;
                case 7:
                    this.baseCacheSize = 200;
                    this.addCacheSizePercent = 0.05d;
                    this.maxCacheSizePercent = 0.3d;
                    this.freeStoragePercent = 5.0d;
                    this.totalStoragePercent = 1.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = DEFAULT_CACHE_TIME_TO_LIVE;
                    return;
                default:
                    this.baseCacheSize = DEFAULT_BASE_CACHE_SIZE;
                    this.addCacheSizePercent = 0.0d;
                    this.maxCacheSizePercent = 0.0d;
                    this.freeStoragePercent = 0.0d;
                    this.totalStoragePercent = 0.0d;
                    this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    this.timeToLive = DEFAULT_CACHE_TIME_TO_LIVE;
                    return;
            }
        }

        private final long getCacheSizeMB(long j11) {
            if (j11 < 0) {
                j11 = 0;
            }
            double d11 = this.maxCacheSizePercent;
            if (d11 <= 0.0d) {
                return (long) (this.baseCacheSize + (this.addCacheSizePercent * j11));
            }
            double d12 = j11;
            return (long) Math.min(this.baseCacheSize + (this.addCacheSizePercent * d12), d11 * d12);
        }

        private final void setupVideoCacheDir(int i11) {
            String cacheDir = ZMediaPlayerSettings.getCacheDir(i11);
            if (cacheDir.length() > 0 && cacheDir.length() > 0) {
                File file = new File(cacheDir);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
        }

        public final double getAddCacheSizePercent() {
            return this.addCacheSizePercent;
        }

        public final int getBaseCacheSize() {
            return this.baseCacheSize;
        }

        public final double getFreeStoragePercent() {
            return this.freeStoragePercent;
        }

        public final double getMaxCacheSizePercent() {
            return this.maxCacheSizePercent;
        }

        public final int getOffCacheSize() {
            return this.offCacheSize;
        }

        public final int getPlayerSection() {
            return this.playerSection;
        }

        public final int getTimeToLive() {
            return this.timeToLive;
        }

        public final double getTotalStoragePercent() {
            return this.totalStoragePercent;
        }

        public final void setAddCacheSizePercent(double d11) {
            this.addCacheSizePercent = d11;
        }

        public final void setBaseCacheSize(int i11) {
            this.baseCacheSize = i11;
        }

        public final void setFreeStoragePercent(double d11) {
            this.freeStoragePercent = d11;
        }

        public final void setMaxCacheSizePercent(double d11) {
            this.maxCacheSizePercent = d11;
        }

        public final void setOffCacheSize(int i11) {
            this.offCacheSize = i11;
        }

        public final void setPlayerSection(int i11) {
            this.playerSection = i11;
        }

        public final void setTimeToLive(int i11) {
            this.timeToLive = i11;
        }

        public final void setTotalStoragePercent(double d11) {
            this.totalStoragePercent = d11;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[CacheConfig] => {");
            stringBuffer.append("[playerSection=" + this.playerSection + "], ");
            stringBuffer.append("[baseCacheSize=" + this.baseCacheSize + "], ");
            stringBuffer.append("[addCacheSizePercent=" + this.addCacheSizePercent + "], ");
            stringBuffer.append("[maxCacheSizePercent=" + this.maxCacheSizePercent + "], ");
            stringBuffer.append("[freeStoragePercent=" + this.freeStoragePercent + "]}");
            stringBuffer.append("[totalStoragePercent=" + this.totalStoragePercent + "]}");
            stringBuffer.append("[offCacheSize=" + this.offCacheSize + "]}");
            stringBuffer.append("[timeToLive=" + this.timeToLive + "]}");
            String stringBuffer2 = stringBuffer.toString();
            AbstractC19074t.m100207e(stringBuffer2, "toString(...)");
            return stringBuffer2;
        }

        public final long getCacheSizeMB(long j11, long j12) {
            if (j11 < 0 || j12 < 0) {
                return 0L;
            }
            double d11 = this.freeStoragePercent;
            if (d11 > 0.0d) {
                double d12 = this.totalStoragePercent;
                if (d12 > 0.0d) {
                    double d13 = d11 * j12;
                    double d14 = 100;
                    return (long) Math.min(this.baseCacheSize, Math.min(d13 / d14, (d12 * j11) / d14));
                }
            }
            return getCacheSizeMB(j12);
        }

        public CacheConfig(int i11, CacheConfig cacheConfig) {
            AbstractC19074t.m100208f(cacheConfig, "cacheConfig");
            this.playerSection = i11;
            this.baseCacheSize = cacheConfig.baseCacheSize;
            this.addCacheSizePercent = cacheConfig.addCacheSizePercent;
            this.maxCacheSizePercent = cacheConfig.maxCacheSizePercent;
            this.freeStoragePercent = cacheConfig.freeStoragePercent;
            this.totalStoragePercent = cacheConfig.totalStoragePercent;
            this.offCacheSize = cacheConfig.offCacheSize;
            this.timeToLive = cacheConfig.timeToLive;
        }

        public CacheConfig(JSONObject jSONObject, int i11) {
            AbstractC19074t.m100208f(jSONObject, "jsonConfig");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("cacheRule");
                if (optJSONObject != null) {
                    setupVideoCacheDir(i11);
                    this.playerSection = i11;
                    this.baseCacheSize = optJSONObject.optInt("baseSize", DEFAULT_BASE_CACHE_SIZE);
                    this.addCacheSizePercent = optJSONObject.optDouble("addSizePercent", 0.0d);
                    this.maxCacheSizePercent = optJSONObject.optDouble("maxSizePercent", 0.0d);
                    this.freeStoragePercent = optJSONObject.optDouble("freeStoragePercent", 0.0d);
                    this.totalStoragePercent = optJSONObject.optDouble("totalStoragePercent", 0.0d);
                    this.offCacheSize = optJSONObject.optInt("offCacheSize", DEFAULT_OFF_CACHE_SIZE);
                    int optInt = optJSONObject.optInt("ttl", DEFAULT_CACHE_TIME_TO_LIVE);
                    this.timeToLive = optInt;
                    if (this.baseCacheSize < 0) {
                        this.baseCacheSize = DEFAULT_BASE_CACHE_SIZE;
                    }
                    if (this.addCacheSizePercent < 0.0d) {
                        this.addCacheSizePercent = 0.0d;
                    }
                    if (this.maxCacheSizePercent < 0.0d) {
                        this.maxCacheSizePercent = 0.0d;
                    }
                    if (this.freeStoragePercent < 0.0d) {
                        this.freeStoragePercent = 0.0d;
                    }
                    if (this.totalStoragePercent < 0.0d) {
                        this.totalStoragePercent = 0.0d;
                    }
                    if (this.offCacheSize < 0) {
                        this.offCacheSize = DEFAULT_OFF_CACHE_SIZE;
                    }
                    if (optInt < 0) {
                        this.timeToLive = DEFAULT_CACHE_TIME_TO_LIVE;
                        return;
                    }
                    return;
                }
                new CacheConfig(i11);
            } catch (Exception e11) {
                AbstractC23350e.m122774d(ZMediaPlayerSettings.TAG, e11.toString());
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class PlayConfig {
        public static final int BLUR_LEVEL_HIGH = 2;
        public static final int BLUR_LEVEL_LOW = 0;
        public static final int BLUR_LEVEL_MEDIUM = 1;
        public static final Companion Companion = new Companion(null);
        public static final boolean DEFAULT_FORCE_SCREEN_ON_WHILE_PLAYING = true;
        public static final int REVERSE_TYPE_END_START = 1;
        public static final int REVERSE_TYPE_END_START_END = 3;
        public static final int REVERSE_TYPE_OFF = 0;
        public static final int REVERSE_TYPE_START_END_START = 2;
        public static final String TAG = "PlayConfig";
        private boolean enableBlurTopBottom;
        private boolean enableCornerRadius;
        private boolean enableLiveStream;
        private boolean enableMask;
        private boolean enablePlayInRange;
        private int enablePlayInRangeDuration;
        private int enablePlayInRangeStartTime;
        private int enableReverseMode;
        private boolean enableSpeedMode;
        private boolean enableVolumeFadeInOut;
        private boolean isForceUsingMediaCodec;
        private boolean isForceUsingSoftware;
        private boolean isLoopInfinite;
        private boolean isSilent;
        private int timeOut;
        private boolean isAutoStartOnPrepared = true;
        private boolean isForceScreenOnWhilePlaying = true;
        private int enableBlurTopBottomLevel = 2;

        /* loaded from: classes7.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public final boolean getEnableBlurTopBottom() {
            return this.enableBlurTopBottom;
        }

        public final int getEnableBlurTopBottomLevel() {
            return this.enableBlurTopBottomLevel;
        }

        public final boolean getEnableCornerRadius() {
            return this.enableCornerRadius;
        }

        public final boolean getEnableLiveStream() {
            return this.enableLiveStream;
        }

        public final boolean getEnableMask() {
            return this.enableMask;
        }

        public final boolean getEnablePlayInRange() {
            return this.enablePlayInRange;
        }

        public final int getEnablePlayInRangeDuration() {
            return this.enablePlayInRangeDuration;
        }

        public final int getEnablePlayInRangeStartTime() {
            return this.enablePlayInRangeStartTime;
        }

        public final int getEnableReverseMode() {
            return this.enableReverseMode;
        }

        public final boolean getEnableSpeedMode() {
            return this.enableSpeedMode;
        }

        public final boolean getEnableVolumeFadeInOut() {
            return this.enableVolumeFadeInOut;
        }

        public final int getTimeOut() {
            return this.timeOut;
        }

        public final boolean isAutoStartOnPrepared() {
            return this.isAutoStartOnPrepared;
        }

        public final boolean isForceScreenOnWhilePlaying() {
            return this.isForceScreenOnWhilePlaying;
        }

        public final boolean isForceUsingMediaCodec() {
            return this.isForceUsingMediaCodec;
        }

        public final boolean isForceUsingSoftware() {
            return this.isForceUsingSoftware;
        }

        public final boolean isLoopInfinite() {
            return this.isLoopInfinite;
        }

        public final boolean isSilent() {
            return this.isSilent;
        }

        public final void setAutoStartOnPrepared(boolean z11) {
            this.isAutoStartOnPrepared = z11;
        }

        public final void setEnableBlurTopBottom(boolean z11) {
            this.enableBlurTopBottom = z11;
        }

        public final void setEnableBlurTopBottomLevel(int i11) {
            this.enableBlurTopBottomLevel = i11;
        }

        public final void setEnableCornerRadius(boolean z11) {
            this.enableCornerRadius = z11;
        }

        public final void setEnableLiveStream(boolean z11) {
            this.enableLiveStream = z11;
        }

        public final void setEnableMask(boolean z11) {
            this.enableMask = z11;
        }

        public final void setEnablePlayInRange(boolean z11) {
            this.enablePlayInRange = z11;
        }

        public final void setEnablePlayInRangeDuration(int i11) {
            this.enablePlayInRangeDuration = i11;
        }

        public final void setEnablePlayInRangeStartTime(int i11) {
            this.enablePlayInRangeStartTime = i11;
        }

        public final void setEnableReverseMode(int i11) {
            this.enableReverseMode = i11;
        }

        public final void setEnableSpeedMode(boolean z11) {
            this.enableSpeedMode = z11;
        }

        public final void setEnableVolumeFadeInOut(boolean z11) {
            this.enableVolumeFadeInOut = z11;
        }

        public final void setForceScreenOnWhilePlaying(boolean z11) {
            this.isForceScreenOnWhilePlaying = z11;
        }

        public final void setForceUsingMediaCodec(boolean z11) {
            this.isForceUsingMediaCodec = z11;
        }

        public final void setForceUsingSoftware(boolean z11) {
            this.isForceUsingSoftware = z11;
        }

        public final void setLoopInfinite(boolean z11) {
            this.isLoopInfinite = z11;
        }

        public final void setSilent(boolean z11) {
            this.isSilent = z11;
        }

        public final void setTimeOut(int i11) {
            this.timeOut = i11;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[PlayConfig] => {");
            stringBuffer.append("[isSilent=" + this.isSilent + "], ");
            stringBuffer.append("[loopInfinite=" + this.isLoopInfinite + "], ");
            stringBuffer.append("[autoStartOnPrepared=" + this.isAutoStartOnPrepared + "], ");
            stringBuffer.append("[forceScreenOnWhilePlaying=" + this.isForceScreenOnWhilePlaying + "]}");
            stringBuffer.append("[enableMask=" + this.enableMask + "]}");
            stringBuffer.append("[enableBlurTopBottom=" + this.enableBlurTopBottom + "]}");
            stringBuffer.append("[enableBlurTopBottomLevel=" + this.enableBlurTopBottomLevel + "]}");
            stringBuffer.append("[enableSpeedMode=" + this.enableSpeedMode + "]}");
            stringBuffer.append("[enableReverseMode=" + this.enableReverseMode + "]}");
            stringBuffer.append("[enableCornerRadius=" + this.enableCornerRadius + "]}");
            stringBuffer.append("[enableVolumeFadeInOut=" + this.enableVolumeFadeInOut + "]}");
            stringBuffer.append("[isForceUsingMediaCodec=" + this.isForceUsingMediaCodec + "]}");
            stringBuffer.append("[isForceUsingSoftware=" + this.isForceUsingSoftware + "]}");
            stringBuffer.append("[enablePlayInRange=" + this.enablePlayInRange + "]}");
            stringBuffer.append("[enablePlayInRangeStartTime=" + this.enablePlayInRangeStartTime + "]}");
            stringBuffer.append("[enablePlayInRangeDuration=" + this.enablePlayInRangeDuration + "]}");
            stringBuffer.append("[enableLiveStream=" + this.enableLiveStream + "]}");
            String stringBuffer2 = stringBuffer.toString();
            AbstractC19074t.m100207e(stringBuffer2, "toString(...)");
            return stringBuffer2;
        }
    }

    static {
        String str;
        String str2;
        File externalCacheDir = CoreUtility.getAppContext().getExternalCacheDir();
        String str3 = null;
        if (externalCacheDir != null) {
            str = externalCacheDir.getAbsolutePath();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        externalCachePath = str;
        File externalFilesDir = CoreUtility.getAppContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getAbsolutePath();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        externalFilesPath = str2;
        File cacheDir = CoreUtility.getAppContext().getCacheDir();
        if (cacheDir != null) {
            str3 = cacheDir.getAbsolutePath();
        }
        if (str3 == null) {
            str3 = "";
        }
        internalCachePath = str3;
        String absolutePath = CoreUtility.getAppContext().getFilesDir().getAbsolutePath();
        if (absolutePath != null) {
            str4 = absolutePath;
        }
        internalFilesPath = str4;
        internalLogFilesPath = str4 + "/zalo/video/log/";
        VIDEO_CONFIG_LIST = new ArrayList();
        videoConfigLock = new ReentrantLock();
        CACHE_CONFIG_LIST = new ArrayList();
        cacheConfigLock = new ReentrantLock();
        PLAY_CONFIG_LIST = new ArrayList();
        playConfigLock = new ReentrantLock();
    }

    private ZMediaPlayerSettings() {
    }

    public static final boolean canAutoPlay() {
        return true;
    }

    public static final CacheConfig getCacheConfig(int i11) {
        ReentrantLock reentrantLock = cacheConfigLock;
        reentrantLock.lock();
        try {
            if (CACHE_CONFIG_LIST.size() <= 0) {
                for (int i12 = 0; i12 < 9; i12++) {
                    CACHE_CONFIG_LIST.add(i12, new CacheConfig(i12));
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            return CACHE_CONFIG_LIST.get(i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String getCacheDir(int i11) {
        switch (i11) {
            case 0:
                if (VIDEO_CACHE_DIR_CHAT == null) {
                    new String();
                    VIDEO_CACHE_DIR_CHAT = externalFilesPath + "/zalo/video/chat/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_CHAT);
            case 1:
                if (VIDEO_CACHE_DIR_FEED == null) {
                    new String();
                    VIDEO_CACHE_DIR_FEED = externalCachePath + "/zalo/video/cache/feed/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_FEED);
            case 2:
                if (VIDEO_CACHE_DIR_STORY == null) {
                    new String();
                    VIDEO_CACHE_DIR_STORY = externalCachePath + "/zalo/video/cache/story/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_STORY);
            case 3:
                if (VIDEO_CACHE_DIR_OA == null) {
                    new String();
                    VIDEO_CACHE_DIR_OA = externalCachePath + "/zalo/video/cache/oa/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_OA);
            case 4:
                if (VIDEO_CACHE_DIR_GIF == null) {
                    new String();
                    VIDEO_CACHE_DIR_GIF = externalCachePath + "/zalo/video/cache/gif/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_GIF);
            case 5:
                if (VIDEO_CACHE_DIR_GROUP == null) {
                    new String();
                    VIDEO_CACHE_DIR_GROUP = externalCachePath + "/zalo/video/cache/group/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_GROUP);
            case 6:
                if (VIDEO_CACHE_DIR_ZCHANNEL == null) {
                    new String();
                    VIDEO_CACHE_DIR_ZCHANNEL = externalCachePath + "/zalo/video/cache/zchannel/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_ZCHANNEL);
            case 7:
                if (VIDEO_CACHE_DIR_ZINSTANT == null) {
                    new String();
                    VIDEO_CACHE_DIR_ZINSTANT = externalCachePath + "/zalo/video/cache/zinstant/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_ZINSTANT);
            case 8:
                if (VIDEO_CACHE_DIR_DEFAULT == null) {
                    new String();
                    VIDEO_CACHE_DIR_DEFAULT = externalCachePath + "/zalo/video/cache/default/";
                }
                return String.valueOf(VIDEO_CACHE_DIR_DEFAULT);
            default:
                return externalCachePath + "/zalo/video/cache/";
        }
    }

    public static final int getDeviceAudioBuffer() {
        if (CoreUtility.getAppContext() != null && CoreUtility.getAppContext().getSystemService("audio") != null) {
            Object systemService = CoreUtility.getAppContext().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            String property = ((AudioManager) systemService).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            if (property != null) {
                return Integer.parseInt(property);
            }
            return 2;
        }
        return 2;
    }

    public static final String getExternalCachePath() {
        return externalCachePath;
    }

    public static /* synthetic */ void getExternalCachePath$annotations() {
    }

    public static final String getExternalFilesPath() {
        return externalFilesPath;
    }

    public static /* synthetic */ void getExternalFilesPath$annotations() {
    }

    public static final String getInternalCachePath() {
        return internalCachePath;
    }

    public static /* synthetic */ void getInternalCachePath$annotations() {
    }

    public static final String getInternalFilesPath() {
        return internalFilesPath;
    }

    public static /* synthetic */ void getInternalFilesPath$annotations() {
    }

    public static final String getLogDir() {
        return String.valueOf(internalCachePath);
    }

    public static final int getPixelFormatWhitelist(int i11) {
        return i11 != 1 ? ZMediaPlayer.SDL_FCC_RV32 : ZMediaPlayer.SDL_FCC_GLES2;
    }

    public static final PlayConfig getPlayConfig(int i11) {
        ReentrantLock reentrantLock = playConfigLock;
        reentrantLock.lock();
        try {
            if (PLAY_CONFIG_LIST.size() <= 0) {
                INSTANCE.initPlayConfig();
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            return PLAY_CONFIG_LIST.get(i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final VideoConfig getVideoConfig(int i11) {
        ReentrantLock reentrantLock = videoConfigLock;
        reentrantLock.lock();
        try {
            if (VIDEO_CONFIG_LIST.size() <= 0) {
                for (int i12 = 0; i12 < 9; i12++) {
                    VIDEO_CONFIG_LIST.add(i12, new VideoConfig(i12));
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            return VIDEO_CONFIG_LIST.get(i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final void initPlayConfig() {
        for (int i11 = 0; i11 < 13; i11++) {
            switch (i11) {
                case 0:
                    List<PlayConfig> list = PLAY_CONFIG_LIST;
                    PlayConfig playConfig = new PlayConfig();
                    playConfig.setSilent(false);
                    playConfig.setLoopInfinite(true);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    list.add(i11, playConfig);
                    break;
                case 1:
                    List<PlayConfig> list2 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig2 = new PlayConfig();
                    playConfig2.setSilent(true);
                    playConfig2.setLoopInfinite(true);
                    playConfig2.setEnableCornerRadius(ENABLE_FEATURE_ROUND_CORNER);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    list2.add(i11, playConfig2);
                    break;
                case 2:
                    List<PlayConfig> list3 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig3 = new PlayConfig();
                    playConfig3.setSilent(false);
                    playConfig3.setLoopInfinite(true);
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    list3.add(i11, playConfig3);
                    break;
                case 3:
                    List<PlayConfig> list4 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig4 = new PlayConfig();
                    playConfig4.setSilent(true);
                    playConfig4.setLoopInfinite(true);
                    playConfig4.setEnableBlurTopBottom(ENABLE_FEATURE_BLUR_TOP_BOTTOM);
                    playConfig4.setEnableBlurTopBottomLevel(2);
                    playConfig4.setEnableVolumeFadeInOut(ENABLE_FEATURE_VOLUME_FADE_INOUT);
                    C24848g0 c24848g04 = C24848g0.f119245a;
                    list4.add(i11, playConfig4);
                    break;
                case 4:
                    List<PlayConfig> list5 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig5 = new PlayConfig();
                    playConfig5.setLoopInfinite(true);
                    C24848g0 c24848g05 = C24848g0.f119245a;
                    list5.add(i11, playConfig5);
                    break;
                case 5:
                    List<PlayConfig> list6 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig6 = new PlayConfig();
                    playConfig6.setAutoStartOnPrepared(false);
                    C24848g0 c24848g06 = C24848g0.f119245a;
                    list6.add(i11, playConfig6);
                    break;
                case 6:
                    List<PlayConfig> list7 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig7 = new PlayConfig();
                    playConfig7.setSilent(true);
                    playConfig7.setLoopInfinite(true);
                    C24848g0 c24848g07 = C24848g0.f119245a;
                    list7.add(i11, playConfig7);
                    break;
                case 7:
                default:
                    PLAY_CONFIG_LIST.add(i11, new PlayConfig());
                    break;
                case 8:
                    List<PlayConfig> list8 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig8 = new PlayConfig();
                    playConfig8.setSilent(true);
                    playConfig8.setLoopInfinite(true);
                    playConfig8.setEnableBlurTopBottom(ENABLE_FEATURE_BLUR_TOP_BOTTOM);
                    playConfig8.setEnableBlurTopBottomLevel(2);
                    playConfig8.setEnableVolumeFadeInOut(ENABLE_FEATURE_VOLUME_FADE_INOUT);
                    C24848g0 c24848g08 = C24848g0.f119245a;
                    list8.add(i11, playConfig8);
                    break;
                case 9:
                    List<PlayConfig> list9 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig9 = new PlayConfig();
                    playConfig9.setSilent(false);
                    playConfig9.setLoopInfinite(true);
                    playConfig9.setAutoStartOnPrepared(true);
                    C24848g0 c24848g09 = C24848g0.f119245a;
                    list9.add(i11, playConfig9);
                    break;
                case 10:
                    List<PlayConfig> list10 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig10 = new PlayConfig();
                    playConfig10.setSilent(true);
                    playConfig10.setLoopInfinite(false);
                    playConfig10.setAutoStartOnPrepared(true);
                    playConfig10.setEnablePlayInRange(true);
                    playConfig10.setEnablePlayInRangeStartTime(0);
                    playConfig10.setEnablePlayInRangeDuration(10);
                    C24848g0 c24848g010 = C24848g0.f119245a;
                    list10.add(i11, playConfig10);
                    break;
                case 11:
                    List<PlayConfig> list11 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig11 = new PlayConfig();
                    playConfig11.setLoopInfinite(false);
                    playConfig11.setAutoStartOnPrepared(true);
                    playConfig11.setEnableLiveStream(true);
                    C24848g0 c24848g011 = C24848g0.f119245a;
                    list11.add(i11, playConfig11);
                    break;
                case 12:
                    List<PlayConfig> list12 = PLAY_CONFIG_LIST;
                    PlayConfig playConfig12 = new PlayConfig();
                    playConfig12.setSilent(false);
                    playConfig12.setLoopInfinite(true);
                    C24848g0 c24848g012 = C24848g0.f119245a;
                    list12.add(i11, playConfig12);
                    break;
            }
        }
    }

    public static final void initZMediaPlayerSettings(String str) {
        AbstractC19074t.m100208f(str, "config");
        try {
            AbstractC24827h.m129080h();
            int i11 = 0;
            if (!TextUtils.isEmpty(str) && str.length() > 5) {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("chat");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("feed");
                JSONObject optJSONObject3 = jSONObject.optJSONObject("story");
                JSONObject optJSONObject4 = jSONObject.optJSONObject("gif");
                JSONObject optJSONObject5 = jSONObject.optJSONObject("group");
                JSONObject optJSONObject6 = jSONObject.optJSONObject("recommendedLink");
                JSONObject optJSONObject7 = jSONObject.optJSONObject("zchannel");
                JSONObject optJSONObject8 = jSONObject.optJSONObject("zinstant");
                while (i11 < 9) {
                    switch (i11) {
                        case 0:
                            if (optJSONObject != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 1:
                            if (optJSONObject2 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject2, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject2, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 2:
                            if (optJSONObject3 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject3, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject3, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 3:
                            if (optJSONObject6 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject6, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject6, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 4:
                            if (optJSONObject4 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject4, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject4, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 5:
                            if (optJSONObject5 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject5, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject5, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 6:
                            if (optJSONObject7 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject7, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject7, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        case 7:
                            if (optJSONObject8 != null) {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(optJSONObject8, i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(optJSONObject8, i11));
                                break;
                            } else {
                                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                                break;
                            }
                        default:
                            VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                            CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                            break;
                    }
                    i11++;
                }
                return;
            }
            while (i11 < 9) {
                VIDEO_CONFIG_LIST.add(i11, new VideoConfig(i11));
                CACHE_CONFIG_LIST.add(i11, new CacheConfig(i11));
                i11++;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(TAG, e11.toString());
        }
    }

    public static final boolean isCacheConfigInitialized() {
        if ((!CACHE_CONFIG_LIST.isEmpty()) && CACHE_CONFIG_LIST.size() == 9) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void isCacheConfigInitialized$annotations() {
    }

    public static final boolean isPlayConfigInitialized() {
        if ((!PLAY_CONFIG_LIST.isEmpty()) && PLAY_CONFIG_LIST.size() == 13) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void isPlayConfigInitialized$annotations() {
    }

    public static final boolean isSupportAudioLatency() {
        if (CoreUtility.getAppContext() != null) {
            return CoreUtility.getAppContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        }
        return false;
    }

    public static final boolean isSupportVideoHDR() {
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT < 24 || CoreUtility.getAppContext() == null || CoreUtility.getAppContext().getSystemService("display") == null) {
            return false;
        }
        Object systemService = CoreUtility.getAppContext().getSystemService("display");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        hdrCapabilities = ((DisplayManager) systemService).getDisplay(0).getHdrCapabilities();
        supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        AbstractC19074t.m100207e(supportedHdrTypes, "getSupportedHdrTypes(...)");
        if (supportedHdrTypes.length == 0) {
            z11 = true;
        }
        return !z11;
    }

    public static final boolean isVideoAutoplay() {
        if (playMode == 1 && canAutoPlay()) {
            return true;
        }
        return false;
    }

    public static final boolean isVideoConfigInitialized() {
        if ((!VIDEO_CONFIG_LIST.isEmpty()) && VIDEO_CONFIG_LIST.size() == 9) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void isVideoConfigInitialized$annotations() {
    }

    public static final boolean isVideoEnable() {
        return playMode != 0;
    }

    public static final boolean isVideoStandalone() {
        return playMode == 3;
    }

    public static final void setCacheConfig(int i11, CacheConfig cacheConfig) {
        AbstractC19074t.m100208f(cacheConfig, "cacheConfig");
        ReentrantLock reentrantLock = cacheConfigLock;
        reentrantLock.lock();
        try {
            if (CACHE_CONFIG_LIST.size() <= 0) {
                for (int i12 = 0; i12 < 9; i12++) {
                    CACHE_CONFIG_LIST.add(i12, new CacheConfig(i12));
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            CACHE_CONFIG_LIST.set(i11, new CacheConfig(i11, cacheConfig));
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final void setExternalCachePath(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        externalCachePath = str;
    }

    public static final void setExternalFilesPath(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        externalFilesPath = str;
    }

    public static final void setVideoConfig(int i11, VideoConfig videoConfig) {
        AbstractC19074t.m100208f(videoConfig, "videoConfig");
        ReentrantLock reentrantLock = videoConfigLock;
        reentrantLock.lock();
        try {
            if (VIDEO_CONFIG_LIST.size() <= 0) {
                for (int i12 = 0; i12 < 9; i12++) {
                    VIDEO_CONFIG_LIST.add(i12, new VideoConfig(i12));
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            VIDEO_CONFIG_LIST.set(i11, new VideoConfig(i11, videoConfig));
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final String getInternalLogFilesPath() {
        return internalLogFilesPath;
    }

    public final int getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(int i11) {
        logLevel = i11;
        ZMediaPlayer.setLogLevel(i11);
    }

    /* loaded from: classes.dex */
    public static final class VideoConfig {
        public static final Companion Companion = new Companion(null);
        public static final int MAX_BUFFER_SIZE = 15728640;
        public static final int MIN_PACKET_SIZE = 500;
        public static final int ONE_MEGABYTE = 1048576;
        public static final int PLAY_INLINE_OFF = 0;
        public static final int PLAY_INLINE_ON = 1;
        public static final int PRECACHE_OFF = 0;
        public static final int PRECACHE_ON = 1;
        public static final int PRECACHE_WIFI = 2;
        public static final int PRIORITY_FORMAT_ANDROID_RESOURCE = 3;
        public static final int PRIORITY_FORMAT_DASH = 2;
        public static final int PRIORITY_FORMAT_HLS = 1;
        public static final int PRIORITY_FORMAT_MP4 = 0;
        public static final int PRIORITY_VIDEO_CODEC_H264 = 0;
        public static final int PRIORITY_VIDOE_CODEC_AV1 = 2;
        public static final int PRIORITY_VIDOE_CODEC_HEVC = 1;
        private int enablePrecache;
        private int maxBufferSizeInMB;
        private int minPacketBuffer;
        private int playInline;
        private int playerSection;
        private int playerType;
        private int priorityFormat;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public VideoConfig(int i11) {
            this.playerType = 1;
            this.priorityFormat = 1;
            this.enablePrecache = 1;
            this.playInline = 1;
            int i12 = MAX_BUFFER_SIZE;
            this.maxBufferSizeInMB = MAX_BUFFER_SIZE;
            int i13 = MIN_PACKET_SIZE;
            this.minPacketBuffer = MIN_PACKET_SIZE;
            int i14 = !isBlackListPhone() ? 1 : 0;
            this.playerType = i14;
            this.playerSection = i11;
            this.priorityFormat = i14 != 1 ? 0 : 1;
            this.enablePrecache = i14 != 1 ? 0 : 1;
            this.playInline = i14 != 1 ? 0 : 1;
            this.maxBufferSizeInMB = i11 == 6 ? 3145728 : i12;
            this.minPacketBuffer = i11 == 6 ? 100 : i13;
        }

        private final boolean isBlackListPhone() {
            boolean m127126v;
            m127126v = AbstractC24341v.m127126v("Letv", Build.MANUFACTURER, true);
            return m127126v;
        }

        public final int getEnablePrecache() {
            return this.enablePrecache;
        }

        public final int getMaxBufferSizeInMB() {
            return this.maxBufferSizeInMB;
        }

        public final int getMinPacketBuffer() {
            return this.minPacketBuffer;
        }

        public final int getPlayInline() {
            return this.playInline;
        }

        public final int getPlayerSection() {
            return this.playerSection;
        }

        public final int getPlayerType() {
            return this.playerType;
        }

        public final int getPriorityFormat() {
            return this.priorityFormat;
        }

        public final boolean isZaloPlayer() {
            return this.playerType == 1;
        }

        public final void setEnablePrecache(int i11) {
            this.enablePrecache = i11;
        }

        public final void setMaxBufferSizeInMB(int i11) {
            this.maxBufferSizeInMB = i11;
        }

        public final void setMinPacketBuffer(int i11) {
            this.minPacketBuffer = i11;
        }

        public final void setPlayInline(int i11) {
            this.playInline = i11;
        }

        public final void setPlayerSection(int i11) {
            this.playerSection = i11;
        }

        public final void setPlayerType(int i11) {
            this.playerType = i11;
        }

        public final void setPriorityFormat(int i11) {
            this.priorityFormat = i11;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[playerType=" + this.playerType + "], ");
            stringBuffer.append("[playerSection=" + this.playerSection + "], ");
            stringBuffer.append("[priorityFormat=" + this.priorityFormat + "], ");
            stringBuffer.append("[enablePrecache=" + this.enablePrecache + "], ");
            stringBuffer.append("[playInline=" + this.playInline + "], ");
            stringBuffer.append("[maxBufferSizeInMB=" + this.maxBufferSizeInMB + "], ");
            stringBuffer.append("[minPacketBuffer=" + this.minPacketBuffer + ']');
            String stringBuffer2 = stringBuffer.toString();
            AbstractC19074t.m100207e(stringBuffer2, "toString(...)");
            return stringBuffer2;
        }

        public VideoConfig(int i11, VideoConfig videoConfig) {
            AbstractC19074t.m100208f(videoConfig, "videoConfig");
            this.playerType = 1;
            this.priorityFormat = 1;
            this.enablePrecache = 1;
            this.playInline = 1;
            this.maxBufferSizeInMB = MAX_BUFFER_SIZE;
            this.minPacketBuffer = MIN_PACKET_SIZE;
            this.playerType = videoConfig.playerType;
            this.playerSection = i11;
            this.priorityFormat = videoConfig.priorityFormat;
            this.enablePrecache = videoConfig.enablePrecache;
            this.playInline = videoConfig.playInline;
            this.maxBufferSizeInMB = i11 == 6 ? 3145728 : videoConfig.maxBufferSizeInMB;
            this.minPacketBuffer = i11 == 6 ? 100 : videoConfig.minPacketBuffer;
        }

        public VideoConfig(JSONObject jSONObject, int i11) {
            AbstractC19074t.m100208f(jSONObject, "jsonConfig");
            this.playerType = 1;
            this.priorityFormat = 1;
            this.enablePrecache = 1;
            this.playInline = 1;
            this.maxBufferSizeInMB = MAX_BUFFER_SIZE;
            this.minPacketBuffer = MIN_PACKET_SIZE;
            try {
                int i12 = 0;
                int i13 = !isBlackListPhone() ? 1 : 0;
                this.playerType = i13;
                this.playerSection = i11;
                this.priorityFormat = i13 != 1 ? 0 : jSONObject.optInt("hls", 0);
                this.enablePrecache = this.playerType != 1 ? 0 : jSONObject.optInt("precacheHls", 0);
                if (this.playerType == 1) {
                    i12 = jSONObject.optInt("playInline", 0);
                }
                this.playInline = i12;
                if (i11 == 6) {
                    this.maxBufferSizeInMB = 3145728;
                    this.minPacketBuffer = 100;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122774d(ZMediaPlayerSettings.TAG, e11.toString());
            }
        }
    }
}
