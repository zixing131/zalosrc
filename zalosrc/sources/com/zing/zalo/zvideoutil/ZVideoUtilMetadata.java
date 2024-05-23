package com.zing.zalo.zvideoutil;

import android.graphics.Bitmap;
import com.zing.zalo.utils.Keep;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

@Keep
/* loaded from: classes7.dex */
public class ZVideoUtilMetadata extends ZAbstractBase implements Closeable {
    public static final int FF_PROFILE_H264_BASELINE = 66;
    public static final int FF_PROFILE_H264_CAVLC_444 = 44;
    public static final int FF_PROFILE_H264_CONSTRAINED = 512;
    public static final int FF_PROFILE_H264_CONSTRAINED_BASELINE = 578;
    public static final int FF_PROFILE_H264_EXTENDED = 88;
    public static final int FF_PROFILE_H264_HIGH = 100;
    public static final int FF_PROFILE_H264_HIGH_10 = 110;
    public static final int FF_PROFILE_H264_HIGH_10_INTRA = 2158;
    public static final int FF_PROFILE_H264_HIGH_422 = 122;
    public static final int FF_PROFILE_H264_HIGH_422_INTRA = 2170;
    public static final int FF_PROFILE_H264_HIGH_444 = 144;
    public static final int FF_PROFILE_H264_HIGH_444_INTRA = 2292;
    public static final int FF_PROFILE_H264_HIGH_444_PREDICTIVE = 244;
    public static final int FF_PROFILE_H264_INTRA = 2048;
    public static final int FF_PROFILE_H264_LEVEL_30 = 30;
    public static final int FF_PROFILE_H264_LEVEL_41 = 41;
    public static final int FF_PROFILE_H264_MAIN = 77;
    private static final Object LOCK = new Object();
    private static final int MAX_INSTANCE = 32;
    public static final int OPTION_CLOSEST_KEYFRAME = 2;
    public static final int OPTION_EXACT_KEYFRAME = 3;
    public static final int OPTION_NEXT_KEYFRAME = 1;
    public static final int OPTION_PREVIOUS_KEYFRAME = 0;
    public static final String VIDEO_CODEC_H264 = "h264";
    public static final String ZMETADATA_KEY_AUDIO_BITRATE = "com.zing.zalo.zvideoutil.metadata.AUDIO_BITRATE";
    public static final String ZMETADATA_KEY_AUDIO_CODEC = "com.zing.zalo.zvideoutil.metadata.AUDIO_CODEC";
    public static final String ZMETADATA_KEY_CHAPTER_COUNT = "com.zing.zalo.zvideoutil.metadata.CHAPTER_COUNT";
    public static final String ZMETADATA_KEY_CHAPTER_END_TIME = "com.zing.zalo.zvideoutil.metadata.CHAPTER_END_TIME";
    public static final String ZMETADATA_KEY_CHAPTER_START_TIME = "com.zing.zalo.zvideoutil.metadata.CHAPTER_START_TIME";
    public static final String ZMETADATA_KEY_DURATION = "com.zing.zalo.zvideoutil.metadata.DURATION";
    public static final String ZMETADATA_KEY_FILESIZE = "com.zing.zalo.zvideoutil.metadata.FILESIZE";
    public static final String ZMETADATA_KEY_FRAMERATE = "com.zing.zalo.zvideoutil.metadata.FRAMERATE";
    public static final String ZMETADATA_KEY_ICY_METADATA = "com.zing.zalo.zvideoutil.metadata.ICY_METADATA";
    public static final String ZMETADATA_KEY_LOCATION = "location";
    public static final String ZMETADATA_KEY_LOCATION_ISO_6709 = "@xyz";
    public static final String ZMETADATA_KEY_VIDEO_BITRATE = "com.zing.zalo.zvideoutil.metadata.VIDEO_BITRATE";
    public static final String ZMETADATA_KEY_VIDEO_CODEC = "com.zing.zalo.zvideoutil.metadata.VIDEO_CODEC";
    public static final String ZMETADATA_KEY_VIDEO_HEIGHT = "com.zing.zalo.zvideoutil.metadata.VIDEO_HEIGHT";
    public static final String ZMETADATA_KEY_VIDEO_LEVEL = "com.zing.zalo.zvideoutil.metadata.VIDEO_LEVEL";
    public static final String ZMETADATA_KEY_VIDEO_PROFILE = "com.zing.zalo.zvideoutil.metadata.VIDEO_PROFILE";
    public static final String ZMETADATA_KEY_VIDEO_ROTATION = "com.zing.zalo.zvideoutil.metadata.VIDEO_ROTATION";
    public static final String ZMETADATA_KEY_VIDEO_WIDTH = "com.zing.zalo.zvideoutil.metadata.VIDEO_WIDTH";
    private static volatile boolean mIsProcessInitialized = false;
    private HashMap<String, String> mMetadata;

    @Keep
    private long zVideoUtilMetadataID;

    static {
        ZAbstractBase.loadLibrariesOnce();
    }

    public ZVideoUtilMetadata(String str) {
        this.mMetadata = null;
        init();
        if (mIsProcessInitialized && str != null && str.length() > 0) {
            try {
                _create(new WeakReference(this), ZAbstractBase.reformatVideoPath(str));
                this.mMetadata = _getMetadata();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Keep
    private native int _create(Object obj, String str);

    @Keep
    private native void _destroy();

    @Keep
    private native Bitmap _getBitmapAtTime(long j11, int i11, int i12);

    @Keep
    private native HashMap<String, String> _getMetadata();

    @Keep
    private static native void _init(int i11);

    @Keep
    private static native void _terminate();

    private void destroy() {
        synchronized (LOCK) {
            _destroy();
        }
    }

    private void init() {
        if (!ZAbstractBase.mIsLibraryLoaded) {
            ZAbstractBase.loadLibrariesOnce();
        }
        if (!mIsProcessInitialized && ZAbstractBase.mIsLibraryLoaded) {
            synchronized (LOCK) {
                try {
                    if (!mIsProcessInitialized) {
                        _init(32);
                        mIsProcessInitialized = true;
                    }
                } finally {
                }
            }
        }
    }

    public static void terminate() {
        synchronized (LOCK) {
            mIsProcessInitialized = false;
            _terminate();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.zVideoUtilMetadataID != 0) {
            destroy();
        }
    }

    public void finalize() throws Throwable {
        if (this.zVideoUtilMetadataID != 0) {
            destroy();
        }
        super.finalize();
    }

    public Bitmap getBitmap(long j11, int i11) {
        if (this.zVideoUtilMetadataID == 0) {
            return null;
        }
        try {
            return _getBitmapAtTime(j11, i11, 0);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public String getMetadata(String str) {
        HashMap<String, String> hashMap = this.mMetadata;
        if (hashMap == null) {
            return null;
        }
        if (hashMap.containsKey(str)) {
            return this.mMetadata.get(str);
        }
        return "";
    }

    public Bitmap getBitmap(long j11, int i11, int i12) {
        if (this.zVideoUtilMetadataID == 0) {
            return null;
        }
        if (i11 >= 0 && i11 <= 3) {
            try {
                return _getBitmapAtTime(j11, i11, i12);
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("Unsupported option: " + i11);
    }
}
