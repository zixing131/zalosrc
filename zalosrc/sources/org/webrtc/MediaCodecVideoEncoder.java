package org.webrtc;

import ag0.AbstractC0837p0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.VideoRenderer;

/* loaded from: classes7.dex */
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final int BITRATE_ADJUST_MODE_DYNAMIC = 3;
    private static final int BITRATE_ADJUST_MODE_FRAMERATE = 2;
    private static final int BITRATE_ADJUST_MODE_NO_ADJUST = 1;
    private static final int BITRATE_ADJUST_MODE_UNKNOWN = 0;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 2.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 10;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final boolean FORCE_BITRATE_DYNAMIC_CHECK = false;
    private static final int H264_CODEC_TYPE = 1;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final String H264_MIME_TYPE = "video/avc";
    private static final int H265_CODEC_TYPE = 2;
    private static final String[] H265_HW_EXCEPTION_MODELS;
    private static final String H265_MIME_TYPE = "video/hevc";
    private static final int INITENCODE_ERR = -1;
    private static final int INITENCODE_ERR_SIZE_NOT_SUPPORT = -16;
    private static final int INITENCODE_OK = 0;
    private static final int INIT_ENCODE_FPS = 30;
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_ControlRateCQ = 0;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final int VIDEO_ControlRateVBR = 1;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosH265HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties exynosVp9HwProperties;
    private static final int[] h264HwLevel;
    private static final int[] h264HwProfile;
    private static final MediaCodecProperties mtkH264HwProperties;
    private static final MediaCodecProperties mtkH265HwProperties;
    private static boolean otherChipsetSupport;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomH265HwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties qcomVp9HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static final int[] supportedColorList;
    private static Set<MediaCodecProperties> supportedOtherCodec;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties[] vp8HwList;
    private static final MediaCodecProperties[] vp9HwList;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private int height;
    private Surface inputSurface;
    MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static AllCodecSizeSupportInfo allCodecSizeSupportInfo = null;
    private Map<Long, Long> beginEncTimes = new LinkedHashMap();
    private boolean firstKeyFrameGenerated = false;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private boolean mtkSupport = false;
    private boolean exynosSupport = true;
    private ByteBuffer configData = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class AllCodecSizeSupportInfo {
        private CodecSizeSupportInfo h264;
        private CodecSizeSupportInfo h265;

        private AllCodecSizeSupportInfo() {
            this.h264 = new CodecSizeSupportInfo();
            this.h265 = new CodecSizeSupportInfo();
        }

        public CodecSizeSupportInfo getCodecSizeSupport(int i11) {
            return i11 == 2 ? this.h265 : this.h264;
        }

        public CodecSizeSupportInfo getCodecSizeSupport(VideoCodecType videoCodecType) {
            return videoCodecType == VideoCodecType.VIDEO_CODEC_H265 ? this.h265 : this.h264;
        }
    }

    /* loaded from: classes7.dex */
    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class CodecSizeSupportInfo {
        private int heightAlignment;
        private boolean inited;
        private int maxHeight;
        private int maxWidth;
        private int minHeight;
        private int minWidth;
        private int widthAlignment;

        private CodecSizeSupportInfo() {
            this.inited = false;
            this.widthAlignment = 0;
            this.heightAlignment = 0;
            this.minWidth = 0;
            this.maxWidth = 0;
            this.minHeight = 0;
            this.maxHeight = 0;
        }

        public String getStringInfo() {
            return String.format("Alignment (%d, %d) - ", Integer.valueOf(this.widthAlignment), Integer.valueOf(this.heightAlignment)) + String.format("rangeWidth (%d, %d) - ", Integer.valueOf(this.minWidth), Integer.valueOf(this.maxWidth)) + String.format("rangeHeight (%d, %d)", Integer.valueOf(this.minHeight), Integer.valueOf(this.maxHeight));
        }

        public boolean isInited() {
            return this.inited;
        }

        public int updateFromMediaCodecCapactity(MediaCodecInfo.VideoCapabilities videoCapabilities) {
            if (videoCapabilities != null && this.widthAlignment <= 0) {
                try {
                    Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                    Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
                    this.minWidth = supportedWidths.getLower().intValue();
                    this.maxWidth = supportedWidths.getUpper().intValue();
                    this.minHeight = supportedHeights.getLower().intValue();
                    this.maxHeight = supportedHeights.getUpper().intValue();
                    this.widthAlignment = videoCapabilities.getWidthAlignment();
                    int heightAlignment = videoCapabilities.getHeightAlignment();
                    this.heightAlignment = heightAlignment;
                    if (this.widthAlignment != heightAlignment) {
                        Logging.m127854e(MediaCodecVideoEncoder.TAG, "HardwareCodecAlignment: widthAlignment != heightAlignment");
                        return -1;
                    }
                } catch (Exception e11) {
                    Logging.m127854e(MediaCodecVideoEncoder.TAG, "getCapabilitiesErr: " + e11.getMessage());
                    this.widthAlignment = -1;
                    return -1;
                }
            }
            this.inited = true;
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;
        public final int maxSupportedInstances;

        public EncoderProperties(String str, int i11, BitrateAdjustmentType bitrateAdjustmentType, int i12) {
            this.codecName = str;
            this.colorFormat = i11;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
            this.maxSupportedInstances = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        MediaCodecProperties(String str, int i11, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i11;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return ((MediaCodecProperties) obj).codecPrefix.equals(this.codecPrefix);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.codecPrefix);
        }
    }

    /* loaded from: classes7.dex */
    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i11);
    }

    /* loaded from: classes7.dex */
    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final long encodeTimeMs;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i11, ByteBuffer byteBuffer, boolean z11, long j11, long j12) {
            this.index = i11;
            this.buffer = byteBuffer;
            this.isKeyFrame = z11;
            this.presentationTimestampUs = j11;
            this.encodeTimeMs = j12;
        }
    }

    /* loaded from: classes7.dex */
    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264,
        VIDEO_CODEC_H265
    }

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        qcomVp8HwProperties = mediaCodecProperties;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
        exynosVp8HwProperties = mediaCodecProperties2;
        vp8HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2};
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties("OMX.qcom.", 23, bitrateAdjustmentType);
        qcomVp9HwProperties = mediaCodecProperties3;
        MediaCodecProperties mediaCodecProperties4 = new MediaCodecProperties("OMX.Exynos.", 23, bitrateAdjustmentType);
        exynosVp9HwProperties = mediaCodecProperties4;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties3, mediaCodecProperties4};
        mtkH264HwProperties = new MediaCodecProperties("OMX.MTK.", 21, bitrateAdjustmentType);
        qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType);
        h264HwProfile = new int[]{1, 2, 8, 16, 32, 64};
        h264HwLevel = new int[]{16, 256, 512, 1024, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, 4096, 8192, 16384, 32768, 65536};
        mtkH265HwProperties = new MediaCodecProperties("OMX.MTK.", 21, bitrateAdjustmentType);
        qcomH265HwProperties = new MediaCodecProperties("OMX.qcom.", 21, bitrateAdjustmentType);
        exynosH265HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType);
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
        SOFTWARE_IMPLEMENTATION_PREFIXES = new String[]{"OMX.GOOGLE.", "C2.ANDROID.", "OMX.SEC."};
        H265_HW_EXCEPTION_MODELS = new String[0];
        supportedColorList = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
        supportedSurfaceColorList = new int[]{2130708361};
        otherChipsetSupport = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z11;
        int i11;
        EncoderProperties encoderProperties = null;
        if (str.equals(H264_MIME_TYPE) && Arrays.asList(H264_HW_EXCEPTION_MODELS).contains(Build.MODEL)) {
            return null;
        }
        int i12 = 0;
        while (i12 < MediaCodecList.getCodecCount()) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i12);
            } catch (IllegalArgumentException unused) {
                Logging.m127854e(TAG, "Cannot retrieve encoder codec info");
                mediaCodecInfo = encoderProperties;
            }
            if (mediaCodecInfo != 0 && mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        if (supportedTypes[i13].equals(str)) {
                            str2 = mediaCodecInfo.getName();
                            break;
                        }
                        i13++;
                    } else {
                        str2 = encoderProperties;
                        break;
                    }
                }
                if (str2 == 0) {
                    continue;
                } else {
                    BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                    int length2 = mediaCodecPropertiesArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i14];
                            if (str2.toUpperCase().startsWith(mediaCodecProperties.codecPrefix.toUpperCase()) && Build.VERSION.SDK_INT >= mediaCodecProperties.minSdk) {
                                BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                    bitrateAdjustmentType = bitrateAdjustmentType2;
                                }
                                z11 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        Logging.m127855v(TAG, "Bitrate adjustment type:" + bitrateAdjustmentType);
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            if (Build.VERSION.SDK_INT >= 23) {
                                i11 = capabilitiesForType.getMaxSupportedInstances();
                            } else {
                                i11 = 0;
                            }
                            for (int i15 : iArr) {
                                for (int i16 : capabilitiesForType.colorFormats) {
                                    if (i16 == i15) {
                                        Logging.m127855v(TAG, "Found target encoder for mime " + str + " : " + str2 + ". Color: 0x" + Integer.toHexString(i16) + ". Bitrate adjustment: " + bitrateAdjustmentType + ". maxSupportedInstances:" + i11);
                                        return new EncoderProperties(str2, i16, bitrateAdjustmentType, i11);
                                    }
                                }
                            }
                        } catch (IllegalArgumentException unused2) {
                            Logging.m127854e(TAG, "Cannot retrieve encoder capabilities");
                        }
                    } else {
                        continue;
                    }
                }
            }
            i12++;
            encoderProperties = null;
        }
        return encoderProperties;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:            if (r8 == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:            if (r3.contains((r9[r4] + "." + r9[1] + ".").toUpperCase()) != false) goto L16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<EncoderProperties> findHwEncoders(String str) {
        MediaCodecInfo mediaCodecInfo;
        HashSet hashSet;
        String str2;
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean isHardwareAccelerated;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet(Arrays.asList(SOFTWARE_IMPLEMENTATION_PREFIXES));
        MediaCodecInfo mediaCodecInfo2 = null;
        if (str.equals(H264_MIME_TYPE) && Arrays.asList(H264_HW_EXCEPTION_MODELS).contains(Build.MODEL)) {
            return null;
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < MediaCodecList.getCodecCount()) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i13);
            } catch (IllegalArgumentException unused) {
                Logging.m127854e(TAG, "Cannot retrieve encoder codec info");
                mediaCodecInfo = mediaCodecInfo2;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                }
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        if (supportedTypes[i14].equals(str)) {
                            str2 = mediaCodecInfo.getName();
                            break;
                        }
                        i14++;
                    } else {
                        str2 = mediaCodecInfo2;
                        break;
                    }
                }
                if (str2 != null) {
                    String[] split = str2.split("\\.");
                    if (split.length > 1) {
                    }
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (Build.VERSION.SDK_INT >= 23) {
                            i11 = capabilitiesForType.getMaxSupportedInstances();
                        } else {
                            i11 = 0;
                        }
                        int[] iArr = supportedSurfaceColorList;
                        int length2 = iArr.length;
                        int i15 = 0;
                        while (i15 < length2) {
                            int i16 = iArr[i15];
                            int[] iArr2 = capabilitiesForType.colorFormats;
                            int length3 = iArr2.length;
                            while (i12 < length3) {
                                int i17 = iArr2[i12];
                                HashSet hashSet3 = hashSet2;
                                if (i17 == i16) {
                                    StringBuilder sb2 = new StringBuilder();
                                    codecCapabilities = capabilitiesForType;
                                    sb2.append("Found target encoder for mime ");
                                    sb2.append(str);
                                    sb2.append(" : ");
                                    sb2.append(str2);
                                    sb2.append(". Color: 0x");
                                    sb2.append(Integer.toHexString(i17));
                                    sb2.append(". maxSupportedInstances:");
                                    sb2.append(i11);
                                    Logging.m127855v(TAG, sb2.toString());
                                    arrayList.add(new EncoderProperties(str2, i17, null, i11));
                                } else {
                                    codecCapabilities = capabilitiesForType;
                                }
                                i12++;
                                hashSet2 = hashSet3;
                                capabilitiesForType = codecCapabilities;
                            }
                            i15++;
                            i12 = 0;
                        }
                    } catch (IllegalArgumentException unused2) {
                        hashSet = hashSet2;
                        Logging.m127854e(TAG, "Cannot retrieve encoder capabilities");
                    }
                }
            }
            hashSet = hashSet2;
            i13++;
            hashSet2 = hashSet;
            i12 = 0;
            mediaCodecInfo2 = null;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    private double getBitrateScale(int i11) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, i11 / 10.0d);
    }

    public static String getChipsetFamily(String str) {
        MediaCodecInfo mediaCodecInfo;
        boolean isHardwareAccelerated;
        HashSet hashSet = new HashSet();
        try {
            HashSet hashSet2 = new HashSet(Arrays.asList(SOFTWARE_IMPLEMENTATION_PREFIXES));
            for (int i11 = 0; i11 < MediaCodecList.getCodecCount(); i11++) {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i11);
                } catch (IllegalArgumentException e11) {
                    Logging.m127854e(TAG, "Cannot retrieve decoder codec info" + e11.toString());
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                        if (!isHardwareAccelerated) {
                        }
                    }
                    for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                        if (str2.equals(str)) {
                            String[] split = mediaCodecInfo.getName().split("\\.");
                            if (split.length > 1) {
                                if (!hashSet2.contains((split[0] + "." + split[1] + ".").toUpperCase())) {
                                    hashSet.add(split[1]);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
        if (hashSet.isEmpty()) {
            Logging.m127853d(TAG, "No HW decoder found for mime " + str);
            return "";
        }
        return AbstractC24534o.m127869a(",", hashSet);
    }

    private static MediaCodecInfo getCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public static String getListHardwareEncoderPrefixName(String str) {
        try {
            List<EncoderProperties> findHwEncoders = findHwEncoders(str);
            if (findHwEncoders != null && !findHwEncoders.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (EncoderProperties encoderProperties : findHwEncoders) {
                    Logging.m127853d(TAG, "ExtendChipset. Found hardware encoder: " + encoderProperties.codecName + "\tmimeType:" + str);
                    String[] split = encoderProperties.codecName.split("\\.");
                    if (split.length >= 2) {
                        hashSet.add(split[0] + "." + split[1]);
                    }
                }
                return AbstractC24534o.m127869a(",", hashSet);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        Logging.m127853d(TAG, "ExtendChipset. No HW encoder found for mime: " + str);
        return "";
    }

    public static int getMaxSupportedInstances(String str, boolean z11, boolean z12) {
        EncoderProperties findHwEncoder;
        int[] iArr = supportedSurfaceColorList;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case 116926:
                if (str.equals("vp8")) {
                    c11 = 0;
                    break;
                }
                break;
            case 116927:
                if (str.equals("vp9")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3148040:
                if (str.equals(ZVideoUtilMetadata.VIDEO_CODEC_H264)) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                findHwEncoder = findHwEncoder(VP8_MIME_TYPE, vp8HwList, iArr);
                break;
            case 1:
                findHwEncoder = findHwEncoder(VP9_MIME_TYPE, vp9HwList, iArr);
                break;
            case 2:
                findHwEncoder = findHwEncoder(H264_MIME_TYPE, h264HwList(z11, z12, otherChipsetSupport), iArr);
                break;
            default:
                findHwEncoder = null;
                break;
        }
        if (findHwEncoder == null) {
            return 0;
        }
        return findHwEncoder.maxSupportedInstances;
    }

    private static final MediaCodecProperties[] h264HwList(boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        if (z11) {
            arrayList.add(mtkH264HwProperties);
        }
        if (z12) {
            arrayList.add(exynosH264HwProperties);
        }
        if (z13) {
            arrayList.addAll(supportedOtherCodec);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    private static final MediaCodecProperties[] h265HwList(boolean z11, boolean z12, boolean z13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH265HwProperties);
        if (z11) {
            arrayList.add(mtkH265HwProperties);
        }
        if (z12) {
            arrayList.add(exynosH265HwProperties);
        }
        if (z13) {
            arrayList.addAll(supportedOtherCodec);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        try {
            Logging.m127853d(TAG, "Java releaseEncoder on release thread");
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Logging.m127853d(TAG, "Java releaseEncoder on release thread done");
        } catch (Exception unused) {
            Logging.m127854e(TAG, "Media encoder release failed");
        }
        countDownLatch.countDown();
    }

    private void reportEncodedFrame(int i11) {
        int i12 = this.targetFps;
        if (i12 != 0 && this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d11 = this.bitrateAccumulator + (i11 - (this.targetBitrateBps / (i12 * 8.0d)));
            this.bitrateAccumulator = d11;
            this.bitrateObservationTimeMs += 1000.0d / i12;
            double d12 = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
            double min = Math.min(d11, d12);
            this.bitrateAccumulator = min;
            this.bitrateAccumulator = Math.max(min, -d12);
            if (this.bitrateObservationTimeMs > 3000.0d) {
                Logging.m127853d(TAG, "Acc: " + ((int) this.bitrateAccumulator) + ". Max: " + ((int) this.bitrateAccumulatorMax) + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
                double d13 = this.bitrateAccumulator;
                double d14 = this.bitrateAccumulatorMax;
                if (d13 > d14) {
                    this.bitrateAccumulator = d14;
                    this.bitrateAdjustmentScaleExp--;
                } else {
                    if (d13 < (-d14)) {
                        this.bitrateAdjustmentScaleExp++;
                        this.bitrateAccumulator = -d14;
                    }
                    this.bitrateObservationTimeMs = 0.0d;
                }
                int min2 = Math.min(this.bitrateAdjustmentScaleExp, 10);
                this.bitrateAdjustmentScaleExp = min2;
                this.bitrateAdjustmentScaleExp = Math.max(min2, -10);
                Logging.m127853d(TAG, "Adjusting bitrate scale to " + this.bitrateAdjustmentScaleExp + ". Value: " + getBitrateScale(this.bitrateAdjustmentScaleExp));
                setRates(this.targetBitrateBps / 1000, this.targetFps);
                this.bitrateObservationTimeMs = 0.0d;
            }
        }
    }

    private boolean setRates(int i11, int i12) {
        int i13;
        int i14 = i11 * 1000;
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d11 = i14;
            this.bitrateAccumulatorMax = d11 / 8.0d;
            int i15 = this.targetBitrateBps;
            if (i15 > 0 && i14 < i15) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d11) / i15;
            }
        }
        this.targetBitrateBps = i14;
        this.targetFps = i12;
        if (bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && i12 > 0) {
            i14 = (i11 * 30000) / i12;
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2 && (i13 = this.bitrateAdjustmentScaleExp) != 0) {
            i14 = (int) (i14 * getBitrateScale(i13));
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i14);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "setRates failed");
            return false;
        }
    }

    int dequeueInputBuffer() {
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "dequeueIntputBuffer failed");
            return -2;
        }
    }

    OutputBufferInfo dequeueOutputBuffer() {
        long currentTimeMillis;
        boolean z11;
        VideoCodecType videoCodecType;
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0 && (bufferInfo.flags & 2) != 0) {
                Logging.m127853d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
            int i11 = dequeueOutputBuffer;
            if (i11 >= 0) {
                ByteBuffer duplicate = this.outputBuffers[i11].duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                if (!this.beginEncTimes.containsKey(Long.valueOf(bufferInfo.presentationTimeUs))) {
                    Logging.m127854e(TAG, "this frame has not been tracked!");
                    currentTimeMillis = -1;
                } else {
                    currentTimeMillis = System.currentTimeMillis() - this.beginEncTimes.get(Long.valueOf(bufferInfo.presentationTimeUs)).longValue();
                    this.beginEncTimes.remove(Long.valueOf(bufferInfo.presentationTimeUs));
                }
                long j11 = currentTimeMillis;
                if ((bufferInfo.flags & 1) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && ((videoCodecType = this.type) == VideoCodecType.VIDEO_CODEC_H264 || videoCodecType == VideoCodecType.VIDEO_CODEC_H265)) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
                    this.configData.rewind();
                    allocateDirect.put(this.configData);
                    allocateDirect.put(duplicate);
                    allocateDirect.position(0);
                    this.firstKeyFrameGenerated = true;
                    return new OutputBufferInfo(i11, allocateDirect, z11, bufferInfo.presentationTimeUs, j11);
                }
                return new OutputBufferInfo(i11, duplicate.slice(), z11, bufferInfo.presentationTimeUs, j11);
            }
            if (i11 == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                return dequeueOutputBuffer();
            }
            if (i11 == -2) {
                return dequeueOutputBuffer();
            }
            if (i11 == -1) {
                return null;
            }
            throw new RuntimeException("dequeueOutputBuffer: " + i11);
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "dequeueOutputBuffer failed");
            return new OutputBufferInfo(-1, null, false, -1L, -1L);
        }
    }

    boolean encodeBuffer(boolean z11, int i11, int i12, long j11) {
        if (z11) {
            try {
                Logging.m127855v(TAG, "Sync frame request");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mediaCodec.setParameters(bundle);
            } catch (IllegalStateException unused) {
                Logging.m127854e(TAG, "encodeBuffer failed");
                return false;
            }
        }
        this.beginEncTimes.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
        this.mediaCodec.queueInputBuffer(i11, 0, i12, j11, 0);
        return true;
    }

    boolean encodeTexture(boolean z11, int i11, float[] fArr, long j11, boolean z12, int i12) {
        if (z11) {
            try {
                Logging.m127855v(TAG, "Sync frame request");
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mediaCodec.setParameters(bundle);
            } catch (RuntimeException e11) {
                Logging.m127854e(TAG, "encodeTexture failed with message: " + e11.getMessage());
                if (this.eglBase != null) {
                    Logging.m127854e(TAG, "encodeTexture failed with eglBase trace: " + this.eglBase.getTrace());
                }
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length > 0) {
                    Logging.m127854e(TAG, "MediaCodecVideoEncoder::encodeTexture() stacks trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        Logging.m127854e(TAG, stackTraceElement.toString());
                    }
                }
                return false;
            }
        }
        this.eglBase.makeCurrent();
        GLES20.glClear(16384);
        if (i12 == VideoRenderer.I420Frame.TextureType.TEXTURE_2D.ordinal()) {
            if (z12) {
                GlRectDrawer glRectDrawer = this.drawer;
                int i13 = this.width;
                int i14 = this.height;
                glRectDrawer.drawRGB(i11, fArr, i13, i14, 0, 0, i13, i14, true);
            } else {
                GlRectDrawer glRectDrawer2 = this.drawer;
                int i15 = this.width;
                int i16 = this.height;
                glRectDrawer2.drawRGB(i11, fArr, i15, i16, 0, 0, i15, i16, false);
            }
        } else if (z12) {
            GlRectDrawer glRectDrawer3 = this.drawer;
            int i17 = this.width;
            int i18 = this.height;
            glRectDrawer3.drawOes(i11, fArr, i17, i18, 0, 0, i17, i18, true);
        } else {
            GlRectDrawer glRectDrawer4 = this.drawer;
            int i19 = this.width;
            int i21 = this.height;
            glRectDrawer4.drawOes(i11, fArr, i19, i21, 0, 0, i19, i21, false);
        }
        this.beginEncTimes.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
        this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j11));
        return true;
    }

    public AllCodecSizeSupportInfo getAllCodecSizeSupportInfo() {
        if (allCodecSizeSupportInfo == null) {
            allCodecSizeSupportInfo = new AllCodecSizeSupportInfo();
        }
        return allCodecSizeSupportInfo;
    }

    ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.m127853d(TAG, "Input buffers: " + inputBuffers.length);
        return inputBuffers;
    }

    int getMaxHeightSupported(int i11) {
        return getAllCodecSizeSupportInfo().getCodecSizeSupport(i11).maxHeight;
    }

    int getMaxWidthSupported(int i11) {
        return getAllCodecSizeSupportInfo().getCodecSizeSupport(i11).maxWidth;
    }

    int getMinHeightSupported(int i11) {
        return getAllCodecSizeSupportInfo().getCodecSizeSupport(i11).minHeight;
    }

    int getMinWidthSupported(int i11) {
        return getAllCodecSizeSupportInfo().getCodecSizeSupport(i11).minWidth;
    }

    int getSizeAlignment(int i11) {
        return getAllCodecSizeSupportInfo().getCodecSizeSupport(i11).widthAlignment;
    }

    int initEncode(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, EglBase14.Context context) {
        EncoderProperties encoderProperties;
        String str;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        VideoCodecType videoCodecType = VideoCodecType.VIDEO_CODEC_H264;
        VideoCodecType videoCodecType2 = i11 == 2 ? VideoCodecType.VIDEO_CODEC_H265 : videoCodecType;
        boolean z11 = context != null;
        Logging.m127853d(TAG, "Java initEncode: " + videoCodecType2 + " : " + i12 + " x " + i13 + ". @ " + i14 + " kbps. Fps: " + i15 + ". Encode from texture : " + z11 + ", profileH264: " + i18 + ", levelH264:" + i19);
        this.width = i12;
        this.height = i13;
        if (this.mediaCodecThread == null) {
            if (videoCodecType2 == VideoCodecType.VIDEO_CODEC_VP8) {
                MediaCodecProperties[] mediaCodecPropertiesArr = vp8HwList;
                int[] iArr = z11 ? supportedSurfaceColorList : supportedColorList;
                str = VP8_MIME_TYPE;
                encoderProperties = findHwEncoder(VP8_MIME_TYPE, mediaCodecPropertiesArr, iArr);
            } else if (videoCodecType2 == VideoCodecType.VIDEO_CODEC_VP9) {
                MediaCodecProperties[] mediaCodecPropertiesArr2 = vp9HwList;
                int[] iArr2 = z11 ? supportedSurfaceColorList : supportedColorList;
                str = VP9_MIME_TYPE;
                encoderProperties = findHwEncoder(VP9_MIME_TYPE, mediaCodecPropertiesArr2, iArr2);
            } else if (videoCodecType2 == videoCodecType) {
                MediaCodecProperties[] h264HwList = h264HwList(this.mtkSupport, this.exynosSupport, otherChipsetSupport);
                int[] iArr3 = z11 ? supportedSurfaceColorList : supportedColorList;
                str = H264_MIME_TYPE;
                encoderProperties = findHwEncoder(H264_MIME_TYPE, h264HwList, iArr3);
            } else if (videoCodecType2 == VideoCodecType.VIDEO_CODEC_H265) {
                MediaCodecProperties[] h265HwList = h265HwList(this.mtkSupport, this.exynosSupport, otherChipsetSupport);
                int[] iArr4 = z11 ? supportedSurfaceColorList : supportedColorList;
                str = H265_MIME_TYPE;
                encoderProperties = findHwEncoder(H265_MIME_TYPE, h265HwList, iArr4);
            } else {
                encoderProperties = null;
                str = null;
            }
            if (encoderProperties != null) {
                BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                Logging.m127853d(TAG, "Mime type is:" + str);
                MediaCodecInfo codecInfo = getCodecInfo(str);
                if (codecInfo != null && (videoCapabilities = codecInfo.getCapabilitiesForType(str).getVideoCapabilities()) != null) {
                    CodecSizeSupportInfo codecSizeSupport = getAllCodecSizeSupportInfo().getCodecSizeSupport(videoCodecType2);
                    if (!codecSizeSupport.isInited()) {
                        int updateFromMediaCodecCapactity = codecSizeSupport.updateFromMediaCodecCapactity(videoCapabilities);
                        Logging.m127853d(TAG, codecSizeSupport.getStringInfo());
                        if (updateFromMediaCodecCapactity != 0) {
                            return updateFromMediaCodecCapactity;
                        }
                    }
                    if (!videoCapabilities.isSizeSupported(i12, i13)) {
                        Logging.m127854e(TAG, "Size not suport " + i12 + "x" + i13);
                        return INITENCODE_ERR_SIZE_NOT_SUPPORT;
                    }
                }
                runningInstance = this;
                this.colorFormat = encoderProperties.colorFormat;
                this.bitrateAdjustmentType = encoderProperties.bitrateAdjustmentType;
                if (i16 == 1) {
                    this.bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                } else if (i16 == 2) {
                    this.bitrateAdjustmentType = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
                } else if (i16 == 3) {
                    this.bitrateAdjustmentType = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
                }
                boolean z12 = z11;
                int min = this.bitrateAdjustmentType != BitrateAdjustmentType.FRAMERATE_ADJUSTMENT ? Math.min(i15, 30) : 30;
                Logging.m127855v(TAG, "Color format: " + this.colorFormat + ". Bitrate adjustment: " + this.bitrateAdjustmentType + ". Initial fps: " + min + ", init bitrate:" + i14 + ", bitrateMode:" + i16);
                int i21 = i14 * 1000;
                this.targetBitrateBps = i21;
                this.targetFps = min;
                this.bitrateAccumulatorMax = ((double) i21) / 8.0d;
                this.bitrateAccumulator = 0.0d;
                this.bitrateObservationTimeMs = 0.0d;
                this.bitrateAdjustmentScaleExp = 0;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i12, i13);
                    createVideoFormat.setInteger("bitrate", this.targetBitrateBps);
                    createVideoFormat.setInteger("bitrate-mode", 2);
                    createVideoFormat.setInteger("color-format", encoderProperties.colorFormat);
                    createVideoFormat.setInteger("frame-rate", min);
                    createVideoFormat.setInteger("i-frame-interval", i17);
                    if (videoCodecType2 == videoCodecType) {
                        if (i18 >= 0) {
                            int[] iArr5 = h264HwProfile;
                            if (i18 < iArr5.length) {
                                createVideoFormat.setInteger("profile", iArr5[i18]);
                            }
                        }
                        if (i19 >= 0) {
                            int[] iArr6 = h264HwLevel;
                            if (i19 < iArr6.length) {
                                createVideoFormat.setInteger("level", iArr6[i19]);
                            }
                        }
                    }
                    Logging.m127853d(TAG, "  Format: " + createVideoFormat);
                    MediaCodec createByCodecName = createByCodecName(encoderProperties.codecName);
                    this.mediaCodec = createByCodecName;
                    this.type = videoCodecType2;
                    if (createByCodecName == null) {
                        Logging.m127854e(TAG, "Can not create media encoder");
                        return -1;
                    }
                    Logging.m127853d(TAG, "createByCodecName " + encoderProperties.codecName);
                    this.mediaCodec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    Logging.m127853d(TAG, "configure");
                    if (z12) {
                        this.eglBase = new EglBase14(context, EglBase.CONFIG_RECORDABLE);
                        Logging.m127853d(TAG, "new EglBase14");
                        this.inputSurface = this.mediaCodec.createInputSurface();
                        Logging.m127853d(TAG, "createInputSurface");
                        this.eglBase.createSurface(this.inputSurface);
                        Logging.m127853d(TAG, "createSurface");
                        this.drawer = new GlRectDrawer();
                        Logging.m127853d(TAG, "new GlRectDrawer");
                    }
                    this.mediaCodec.start();
                    Logging.m127853d(TAG, "mediaCodec start");
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    Logging.m127853d(TAG, "Output buffers: " + this.outputBuffers.length);
                    Logging.m127853d(TAG, "initEncode ok");
                    return 0;
                } catch (IllegalStateException unused) {
                    Logging.m127854e(TAG, "initEncode failed");
                    return -1;
                }
            }
            throw new RuntimeException("Can not find HW encoder for " + videoCodecType2);
        }
        throw new RuntimeException("Forgot to release()?");
    }

    void release() {
        Logging.m127853d(TAG, "Java releaseEncoder");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: org.webrtc.q
            @Override // java.lang.Runnable
            public final void run() {
                MediaCodecVideoEncoder.this.lambda$release$0(countDownLatch);
            }
        });
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
            Logging.m127854e(TAG, "Media encoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.m127854e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        Logging.m127853d(TAG, "Java releaseEncoder done");
    }

    boolean releaseOutputBuffer(int i11) {
        try {
            this.mediaCodec.releaseOutputBuffer(i11, false);
            return true;
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "releaseOutputBuffer failed");
            return false;
        }
    }

    void setEncoderPrefixNameSupported(String str) {
        Logging.m127853d(TAG, "Java setChipsetSupport: " + str);
        if (supportedOtherCodec == null) {
            supportedOtherCodec = new HashSet();
        }
        for (String str2 : str.split(",")) {
            String upperCase = str2.trim().toUpperCase();
            if (!upperCase.equals("OMX.EXYNOS") && !upperCase.equals("OMX.QCOM") && !upperCase.equals("OMX.MTK")) {
                supportedOtherCodec.add(new MediaCodecProperties(upperCase, 21, BitrateAdjustmentType.NO_ADJUSTMENT));
            }
        }
        if (!supportedOtherCodec.isEmpty()) {
            otherChipsetSupport = true;
        }
    }

    void setExynosSupport(boolean z11) {
        Logging.m127853d(TAG, "Java setExynosSupport: " + z11);
        this.exynosSupport = z11;
    }

    void setMtkSupport(boolean z11) {
        Logging.m127853d(TAG, "Java setMtkSupport: " + z11);
        this.mtkSupport = z11;
    }
}
