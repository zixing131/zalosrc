package org.webrtc;

import ag0.AbstractC0837p0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import ho0.AbstractC20110a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes7.dex */
public class MediaCodecVideoDecoder {
    static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    static final long DEQUEUE_OUTPUT_TIMEOUT = 0;
    static final int H264_CODEC_TYPE = 1;
    static final String H264_MIME_TYPE = "video/avc";
    static final int H265_CODEC_TYPE = 2;
    static final String H265_MIME_TYPE = "video/hevc";
    static final long MAX_DECODE_TIME_MS = 200;
    static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    static final String TAG = "MediaCodecVideoDecoder";
    static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    static int codecErrors;
    static MediaCodecVideoDecoderErrorCallback errorCallback;
    static MediaCodecVideoDecoder runningInstance;
    int colorFormat;
    int droppedFrames;
    boolean hasDecodedFirstFrame;
    int height;
    ByteBuffer[] inputBuffers;
    MediaCodec mediaCodec;
    Thread mediaCodecThread;
    ByteBuffer[] outputBuffers;
    int sliceHeight;
    int stride;
    TextureListener textureListener;
    boolean useSurface;
    int width;
    static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.GOOGLE.", "C2.ANDROID.", "OMX.SEC."};
    static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    static final String[] supportedH264HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel.", "OMX.Exynos.", "OMX.MTK."};
    static final String[] supportedH265HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel.", "OMX.Exynos.", "OMX.MTK."};
    static Set<String> supportedHwCodecPrefixes = new HashSet(Arrays.asList("OMX.qcom.", "OMX.Intel.", "OMX.Exynos.", "OMX.MTK."));
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    static final List<Integer> supportedColorList = Arrays.asList(19, 21, 2141391872, Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka), Integer.valueOf(COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m));
    final Queue<TimeStamps> decodeStartTimeMs = new LinkedList();
    Surface surface = null;
    final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new LinkedList();

    /* loaded from: classes7.dex */
    public enum CodecType {
        H264(1),
        H265(2),
        VP8(3),
        VP9(4);

        int value;

        CodecType(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class DecodedBufferInfo {
        public final ByteBuffer buffer;
        public final int colorFormat;
        public final int errCode;
        public final int height;
        public final long presentationTimeStamUs;
        public final int stride;
        public final int width;

        public DecodedBufferInfo(int i11, ByteBuffer byteBuffer, int i12, int i13, int i14, int i15, long j11) {
            this.errCode = i11;
            this.buffer = byteBuffer;
            this.width = i12;
            this.height = i13;
            this.stride = i14;
            this.colorFormat = i15;
            this.presentationTimeStamUs = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class DecodedOutputBuffer {
        final long decodeTimeMs;
        final long endDecodeTimeMs;
        final int index;
        final long ntpTimeStampMs;
        final int offset;
        final long presentationTimeStampMs;
        final int size;
        final long timeStampMs;

        public DecodedOutputBuffer(int i11, int i12, int i13, long j11, long j12, long j13, long j14, long j15) {
            this.index = i11;
            this.offset = i12;
            this.size = i13;
            this.presentationTimeStampMs = j11;
            this.timeStampMs = j12;
            this.ntpTimeStampMs = j13;
            this.decodeTimeMs = j14;
            this.endDecodeTimeMs = j15;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class DecodedTextureBuffer {
        final long decodeTimeMs;
        final long frameDelayMs;
        final long ntpTimeStampMs;
        final long presentationTimeStampMs;
        final int textureID;
        final long timeStampMs;
        final float[] transformMatrix;

        public DecodedTextureBuffer(int i11, float[] fArr, long j11, long j12, long j13, long j14, long j15) {
            this.textureID = i11;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j11;
            this.timeStampMs = j12;
            this.ntpTimeStampMs = j13;
            this.decodeTimeMs = j14;
            this.frameDelayMs = j15;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i11) {
            this.codecName = str;
            this.colorFormat = i11;
        }
    }

    /* loaded from: classes7.dex */
    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class TextureListener implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
        DecodedOutputBuffer bufferToRender;
        final Object newFrameLock = new Object();
        DecodedTextureBuffer renderedBuffer;
        final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.m127854e(MediaCodecVideoDecoder.TAG, "Unexpected addBufferToRender() called while waiting for a texture.");
                throw new IllegalStateException("Waiting for a texture.");
            }
        }

        public DecodedTextureBuffer dequeueTextureBuffer(int i11) {
            DecodedTextureBuffer decodedTextureBuffer;
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null && i11 > 0 && isWaitingForTexture()) {
                    try {
                        this.newFrameLock.wait(i11);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                decodedTextureBuffer = this.renderedBuffer;
                this.renderedBuffer = null;
            }
            return decodedTextureBuffer;
        }

        public boolean isWaitingForTexture() {
            boolean z11;
            synchronized (this.newFrameLock) {
                if (this.bufferToRender != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return z11;
        }

        @Override // org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener
        public void onTextureFrameAvailable(int i11, float[] fArr, long j11) {
            synchronized (this.newFrameLock) {
                try {
                    if (this.renderedBuffer == null) {
                        DecodedOutputBuffer decodedOutputBuffer = this.bufferToRender;
                        this.renderedBuffer = new DecodedTextureBuffer(i11, fArr, decodedOutputBuffer.presentationTimeStampMs, decodedOutputBuffer.timeStampMs, decodedOutputBuffer.ntpTimeStampMs, decodedOutputBuffer.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                        this.bufferToRender = null;
                        this.newFrameLock.notifyAll();
                    } else {
                        Logging.m127854e(MediaCodecVideoDecoder.TAG, "Unexpected onTextureFrameAvailable() called while already holding a texture.");
                        throw new IllegalStateException("Already holding a texture.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                try {
                    if (this.renderedBuffer != null) {
                        this.surfaceTextureHelper.returnTextureFrame();
                        this.renderedBuffer = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class TimeStamps {
        final long decodeStartTimeMs;
        final long ntpTimeStampMs;
        final long timeStampMs;

        public TimeStamps(long j11, long j12, long j13) {
            this.decodeStartTimeMs = j11;
            this.timeStampMs = j12;
            this.ntpTimeStampMs = j13;
        }
    }

    /* loaded from: classes7.dex */
    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264,
        VIDEO_CODEC_H265
    }

    private int decodeFrame(ByteBuffer byteBuffer, long j11) {
        checkOnMediaCodecThread();
        if (this.mediaCodec == null) {
            Logging.m127853d(TAG, "mediaCodec has not been initialized");
            return -1;
        }
        int dequeueInputBuffer = dequeueInputBuffer();
        if (dequeueInputBuffer < 0) {
            Logging.m127853d(TAG, "no input buffer available");
            return -1;
        }
        try {
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j11, DEQUEUE_OUTPUT_TIMEOUT));
            this.inputBuffers[dequeueInputBuffer].clear();
            this.inputBuffers[dequeueInputBuffer].position(0);
            this.inputBuffers[dequeueInputBuffer].limit(byteBuffer.capacity());
            this.inputBuffers[dequeueInputBuffer].put(byteBuffer);
            this.mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.capacity(), j11, 0);
            return 0;
        } catch (IllegalStateException e11) {
            Logging.m127854e(TAG, "decode failed " + e11.toString());
            return -2;
        }
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "dequeueIntputBuffer failed");
            return -2;
        }
    }

    public static void disableH264HwCodec() {
        Logging.m127856w(TAG, "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableH265HwCodec() {
        Logging.m127856w(TAG, "H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(H265_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        Logging.m127856w(TAG, "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.m127856w(TAG, "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static DecoderProperties findDecoder(String str, String[] strArr) {
        MediaCodecInfo mediaCodecInfo;
        boolean isHardwareAccelerated;
        Logging.m127853d(TAG, "Trying to find HW decoder for mime " + str);
        int i11 = 0;
        while (true) {
            String str2 = null;
            if (i11 < MediaCodecList.getCodecCount()) {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i11);
                } catch (IllegalArgumentException unused) {
                    Logging.m127854e(TAG, "Cannot retrieve decoder codec info");
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                        if (!isHardwareAccelerated) {
                            continue;
                        }
                    }
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        }
                        if (supportedTypes[i12].equals(str)) {
                            str2 = mediaCodecInfo.getName();
                            break;
                        }
                        i12++;
                    }
                    if (str2 == null) {
                        continue;
                    } else {
                        Logging.m127853d(TAG, "Found candidate decoder " + str2);
                        int length2 = strArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length2) {
                                if (str2.toUpperCase().startsWith(strArr[i13].toUpperCase())) {
                                    try {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                        Iterator<Integer> it = supportedColorList.iterator();
                                        while (it.hasNext()) {
                                            int intValue = it.next().intValue();
                                            for (int i14 : capabilitiesForType.colorFormats) {
                                                if (i14 == intValue) {
                                                    Logging.m127853d(TAG, "Found target decoder " + str2 + ". Color: 0x" + Integer.toHexString(i14));
                                                    return new DecoderProperties(str2, i14);
                                                }
                                            }
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        Logging.m127854e(TAG, "Cannot retrieve decoder capabilities");
                                    }
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                }
                i11++;
            } else {
                Logging.m127853d(TAG, "No HW decoder found for mime " + str);
                return null;
            }
        }
    }

    static List<DecoderProperties> findHwDecoders(String str) {
        MediaCodecInfo mediaCodecInfo;
        boolean isHardwareAccelerated;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(Arrays.asList(SOFTWARE_IMPLEMENTATION_PREFIXES));
        Logging.m127853d(TAG, "Trying to find HW decoder for mime " + str);
        int i11 = 0;
        while (true) {
            String str2 = null;
            if (i11 >= MediaCodecList.getCodecCount()) {
                break;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i11);
            } catch (IllegalArgumentException unused) {
                Logging.m127854e(TAG, "Cannot retrieve decoder codec info");
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                    if (!isHardwareAccelerated) {
                    }
                }
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    if (supportedTypes[i12].equals(str)) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                    i12++;
                }
                if (str2 != null) {
                    String[] split = str2.split("\\.");
                    if (split.length > 1) {
                        if (hashSet.contains((split[0] + "." + split[1] + ".").toUpperCase())) {
                        }
                    }
                    Logging.m127853d(TAG, "Found candidate decoder " + str2);
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        Iterator<Integer> it = supportedColorList.iterator();
                        while (it.hasNext()) {
                            int intValue = it.next().intValue();
                            for (int i13 : capabilitiesForType.colorFormats) {
                                if (i13 == intValue) {
                                    Logging.m127853d(TAG, "Found target decoder " + str2 + ". Color: 0x" + Integer.toHexString(i13));
                                    arrayList.add(new DecoderProperties(str2, i13));
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused2) {
                        Logging.m127854e(TAG, "Cannot retrieve decoder capabilities");
                    }
                }
            }
            i11++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        Logging.m127853d(TAG, "No HW decoder found for mime " + str);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0105, code lost:            throw new java.lang.RuntimeException("Unexpected size change. Configured " + r13.width + "*" + r13.height + ". New " + r5 + "*" + r7);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DecodedBufferInfo getDecodedFrame(long j11) {
        checkOnMediaCodecThread();
        if (this.mediaCodec == null) {
            Logging.m127853d(TAG, "mediaCodec has not been initialized");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, j11);
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    if (dequeueOutputBuffer == -1) {
                        return null;
                    }
                    this.hasDecodedFirstFrame = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.decodeStartTimeMs.remove().decodeStartTimeMs;
                    if (elapsedRealtime > MAX_DECODE_TIME_MS) {
                        Logging.m127854e(TAG, "Very high decode time: " + elapsedRealtime + "ms. Q size: " + this.decodeStartTimeMs.size() + ". Might be caused by resuming H264 decoding after a pause.");
                    }
                    ByteBuffer byteBuffer = this.outputBuffers[dequeueOutputBuffer];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(0);
                    byteBuffer.limit(bufferInfo.size);
                    allocateDirect.put(byteBuffer);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return new DecodedBufferInfo(0, allocateDirect, this.width, this.height, this.stride, this.colorFormat, bufferInfo.presentationTimeUs);
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Logging.m127853d(TAG, "Decoder format changed: " + outputFormat.toString());
                int integer = outputFormat.getInteger("width");
                int integer2 = outputFormat.getInteger("height");
                if (!this.hasDecodedFirstFrame || (integer == this.width && integer2 == this.height)) {
                    this.width = outputFormat.getInteger("width");
                    this.height = outputFormat.getInteger("height");
                    if (!this.useSurface && outputFormat.containsKey("color-format")) {
                        this.colorFormat = outputFormat.getInteger("color-format");
                        Logging.m127855v(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                        if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                            throw new IllegalStateException("Non supported color format: " + this.colorFormat);
                        }
                    }
                    if (outputFormat.containsKey("stride")) {
                        this.stride = outputFormat.getInteger("stride");
                    }
                    if (outputFormat.containsKey("slice-height")) {
                        this.sliceHeight = outputFormat.getInteger("slice-height");
                    }
                    Logging.m127853d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                    this.stride = Math.max(this.width, this.stride);
                    this.sliceHeight = Math.max(this.height, this.sliceHeight);
                }
            } else {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.m127853d(TAG, "Decoder output buffers changed: " + this.outputBuffers.length);
                if (this.hasDecodedFirstFrame) {
                    throw new RuntimeException("Unexpected output buffer change event.");
                }
            }
        }
    }

    public static String getHardwareDecoderName(String str) {
        try {
            DecoderProperties findDecoder = findDecoder(str, (String[]) supportedHwCodecPrefixes.toArray(new String[0]));
            if (findDecoder != null) {
                Logging.m127853d(TAG, "Found hardware decoder: " + findDecoder.codecName + " ,mimeType:" + str);
                return findDecoder.codecName;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        Logging.m127853d(TAG, "No HW decoder found for mime: " + str);
        return "";
    }

    public static String getListHardwareDecoderPrefixName(String str) {
        try {
            List<DecoderProperties> findHwDecoders = findHwDecoders(str);
            if (findHwDecoders != null && !findHwDecoders.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (DecoderProperties decoderProperties : findHwDecoders) {
                    Logging.m127853d(TAG, "ExtendChipset. Found hardware decoder: " + decoderProperties.codecName + "\tmimeType:" + str);
                    String[] split = decoderProperties.codecName.split("\\.");
                    if (split.length >= 2) {
                        hashSet.add(split[0] + "." + split[1]);
                    }
                }
                return AbstractC24534o.m127869a(",", hashSet);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        Logging.m127853d(TAG, "ExtendChipset. No HW decoder found for mime: " + str);
        return "";
    }

    public static boolean isH264HwSupported() {
        if (!hwDecoderDisabledTypes.contains(H264_MIME_TYPE) && findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes) != null) {
            return true;
        }
        return false;
    }

    public static boolean isH265HwSupported() {
        if (!hwDecoderDisabledTypes.contains(H265_MIME_TYPE) && findDecoder(H265_MIME_TYPE, supportedH265HwCodecPrefixes) != null) {
            return true;
        }
        return false;
    }

    public static boolean isVp8HwSupported() {
        if (!hwDecoderDisabledTypes.contains(VP8_MIME_TYPE) && findDecoder(VP8_MIME_TYPE, supportedVp8HwCodecPrefixes) != null) {
            return true;
        }
        return false;
    }

    public static boolean isVp9HwSupported() {
        if (!hwDecoderDisabledTypes.contains(VP9_MIME_TYPE) && findDecoder(VP9_MIME_TYPE, supportedVp9HwCodecPrefixes) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(CountDownLatch countDownLatch) {
        try {
            Logging.m127853d(TAG, "Java releaseDecoder on release thread");
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Logging.m127853d(TAG, "Java releaseDecoder on release thread done");
        } catch (Exception unused) {
            Logging.m127854e(TAG, "Media decoder release failed");
        }
        countDownLatch.countDown();
    }

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder != null && (thread = mediaCodecVideoDecoder.mediaCodecThread) != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m127855v(TAG, "MediaCodecVideoDecoder stacks trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m127855v(TAG, stackTraceElement.toString());
                }
            }
        }
    }

    private boolean queueInputBuffer(int i11, int i12, long j11, long j12, long j13) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i11].position(0);
            this.inputBuffers[i11].limit(i12);
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j12, j13));
            this.mediaCodec.queueInputBuffer(i11, 0, i12, j11, 0);
            return true;
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "decode failed");
            return false;
        }
    }

    public static String setDecoderPrefixNameSupported(String str) {
        Logging.m127853d(TAG, "Java setChipsetSupport: " + str);
        if (str.isEmpty()) {
            return "";
        }
        for (String str2 : str.split(",")) {
            String upperCase = str2.trim().toUpperCase();
            if (!upperCase.equals("OMX.EXYNOS") && !upperCase.equals("OMX.QCOM") && !upperCase.equals("OMX.MTK")) {
                supportedHwCodecPrefixes.add(upperCase + ".");
            }
        }
        return AbstractC24534o.m127869a(",", supportedHwCodecPrefixes);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.m127853d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty() && !this.textureListener.isWaitingForTexture()) {
            DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
            this.textureListener.addBufferToRender(remove);
            this.mediaCodec.releaseOutputBuffer(remove.index, true);
        }
    }

    void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new IllegalStateException("MediaCodecVideoDecoder previously operated on " + this.mediaCodecThread + " but is now called on " + Thread.currentThread());
    }

    public DecodedBufferInfo decodeFrameNoDelay(ByteBuffer byteBuffer, long j11) {
        checkOnMediaCodecThread();
        if (decodeFrame(byteBuffer, j11) < 0) {
            return null;
        }
        return getDecodedFrame(200000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:            throw new java.lang.RuntimeException("Unexpected size change. Configured " + r22.width + "*" + r22.height + ". New " + r7 + "*" + r9);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    DecodedOutputBuffer dequeueOutputBuffer(int i11) {
        long j11;
        checkOnMediaCodecThread();
        if (this.decodeStartTimeMs.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i11));
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    if (dequeueOutputBuffer == -1) {
                        return null;
                    }
                    this.hasDecodedFirstFrame = true;
                    TimeStamps remove = this.decodeStartTimeMs.remove();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - remove.decodeStartTimeMs;
                    if (elapsedRealtime > MAX_DECODE_TIME_MS) {
                        Logging.m127854e(TAG, "Very high decode time: " + elapsedRealtime + "ms. Q size: " + this.decodeStartTimeMs.size() + ". Might be caused by resuming H264 decoding after a pause.");
                        j11 = 200L;
                    } else {
                        j11 = elapsedRealtime;
                    }
                    return new DecodedOutputBuffer(dequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), remove.timeStampMs, remove.ntpTimeStampMs, j11, SystemClock.elapsedRealtime());
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Logging.m127853d(TAG, "Decoder format changed: " + outputFormat.toString());
                int integer = outputFormat.getInteger("width");
                int integer2 = outputFormat.getInteger("height");
                if (!this.hasDecodedFirstFrame || (integer == this.width && integer2 == this.height)) {
                    this.width = outputFormat.getInteger("width");
                    this.height = outputFormat.getInteger("height");
                    if (!this.useSurface && outputFormat.containsKey("color-format")) {
                        this.colorFormat = outputFormat.getInteger("color-format");
                        Logging.m127853d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                        if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                            throw new IllegalStateException("Non supported color format: " + this.colorFormat);
                        }
                    }
                    if (outputFormat.containsKey("stride")) {
                        this.stride = outputFormat.getInteger("stride");
                    }
                    if (outputFormat.containsKey("slice-height")) {
                        this.sliceHeight = outputFormat.getInteger("slice-height");
                    }
                    Logging.m127853d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                    this.stride = Math.max(this.width, this.stride);
                    this.sliceHeight = Math.max(this.height, this.sliceHeight);
                }
            } else {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.m127853d(TAG, "Decoder output buffers changed: " + this.outputBuffers.length);
                if (this.hasDecodedFirstFrame) {
                    throw new RuntimeException("Unexpected output buffer change event.");
                }
            }
        }
    }

    DecodedTextureBuffer dequeueTextureBuffer(int i11) {
        checkOnMediaCodecThread();
        if (this.useSurface) {
            DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i11);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i11);
            if (dequeueTextureBuffer != null) {
                MaybeRenderDecodedTextureBuffer();
                return dequeueTextureBuffer;
            }
            if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i11 <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
                return null;
            }
            this.droppedFrames++;
            DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
            if (i11 > 0) {
                Logging.m127856w(TAG, "Draining decoder. Dropping frame with TS: " + remove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
            } else {
                Logging.m127856w(TAG, "Too many output buffers " + this.dequeuedSurfaceOutputBuffers.size() + ". Dropping frame with TS: " + remove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
            }
            this.mediaCodec.releaseOutputBuffer(remove.index, false);
            return new DecodedTextureBuffer(0, null, remove.presentationTimeStampMs, remove.timeStampMs, remove.ntpTimeStampMs, remove.decodeTimeMs, SystemClock.elapsedRealtime() - remove.endDecodeTimeMs);
        }
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    boolean initDecode(int i11, int i12, int i13, SurfaceTextureHelper surfaceTextureHelper) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread != null) {
            return false;
        }
        this.useSurface = surfaceTextureHelper != null;
        if (i11 == CodecType.VP8.getValue()) {
            strArr = supportedVp8HwCodecPrefixes;
            str = VP8_MIME_TYPE;
        } else {
            if (i11 != CodecType.VP9.getValue()) {
                if (i11 == CodecType.H264.getValue()) {
                    strArr = supportedH264HwCodecPrefixes;
                    str = H264_MIME_TYPE;
                }
                return false;
            }
            strArr = supportedVp9HwCodecPrefixes;
            str = VP9_MIME_TYPE;
        }
        DecoderProperties findDecoder = findDecoder(str, strArr);
        if (findDecoder == null) {
            Logging.m127853d(TAG, "Can not find decoder:" + i11);
            return false;
        }
        Logging.m127853d(TAG, "Java initDecode: " + i11 + " : " + i12 + " x " + i13 + ". Color: 0x" + Integer.toHexString(findDecoder.colorFormat) + ". Use Surface: " + this.useSurface);
        runningInstance = this;
        this.mediaCodecThread = Thread.currentThread();
        try {
            this.width = i12;
            this.height = i13;
            this.stride = i12;
            this.sliceHeight = i13;
            if (this.useSurface) {
                this.textureListener = new TextureListener(surfaceTextureHelper);
                this.surface = new Surface(surfaceTextureHelper.surfaceTexture);
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i12, i13);
            if (!this.useSurface) {
                createVideoFormat.setInteger("color-format", findDecoder.colorFormat);
            }
            Logging.m127853d(TAG, "  Format: " + createVideoFormat);
            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
            this.mediaCodec = createByCodecName;
            if (createByCodecName == null) {
                Logging.m127854e(TAG, "Can not create media decoder");
                return false;
            }
            createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
            this.mediaCodec.start();
            this.colorFormat = findDecoder.colorFormat;
            this.outputBuffers = this.mediaCodec.getOutputBuffers();
            this.inputBuffers = this.mediaCodec.getInputBuffers();
            this.decodeStartTimeMs.clear();
            this.hasDecodedFirstFrame = false;
            this.dequeuedSurfaceOutputBuffers.clear();
            this.droppedFrames = 0;
            Logging.m127853d(TAG, "Input buffers: " + this.inputBuffers.length + ". Output buffers: " + this.outputBuffers.length);
            return true;
        } catch (IllegalStateException unused) {
            Logging.m127854e(TAG, "initDecode failed");
        }
    }

    void release() {
        Logging.m127853d(TAG, "Java releaseDecoder. Total number of dropped frames: " + this.droppedFrames);
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: org.webrtc.p
            @Override // java.lang.Runnable
            public final void run() {
                MediaCodecVideoDecoder.this.lambda$release$0(countDownLatch);
            }
        });
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
            Logging.m127854e(TAG, "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.m127854e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        Logging.m127853d(TAG, "Java releaseDecoder done");
    }

    void reset(int i11, int i12) {
        if (this.mediaCodecThread != null && this.mediaCodec != null) {
            Logging.m127853d(TAG, "Java reset: " + i11 + " x " + i12);
            this.mediaCodec.flush();
            this.width = i11;
            this.height = i12;
            this.decodeStartTimeMs.clear();
            this.dequeuedSurfaceOutputBuffers.clear();
            this.hasDecodedFirstFrame = false;
            this.droppedFrames = 0;
            return;
        }
        throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
    }

    void returnDecodedOutputBuffer(int i11) throws IllegalStateException, MediaCodec.CodecException {
        checkOnMediaCodecThread();
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i11, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    public boolean initDecode(int i11, int i12, int i13) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread != null) {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
        if (i11 != 1 && i11 != 2) {
            return false;
        }
        VideoCodecType videoCodecType = VideoCodecType.VIDEO_CODEC_H264;
        VideoCodecType videoCodecType2 = i11 == 2 ? VideoCodecType.VIDEO_CODEC_H265 : videoCodecType;
        if (videoCodecType2 == videoCodecType) {
            strArr = supportedH264HwCodecPrefixes;
            str = H264_MIME_TYPE;
        } else if (videoCodecType2 == VideoCodecType.VIDEO_CODEC_H265) {
            strArr = supportedH265HwCodecPrefixes;
            str = H265_MIME_TYPE;
        } else {
            strArr = null;
            str = null;
        }
        DecoderProperties findDecoder = findDecoder(str, strArr);
        if (findDecoder != null) {
            Logging.m127853d(TAG, "Java initDecode: " + videoCodecType2 + " : " + i12 + " x " + i13 + ". Color: 0x" + Integer.toHexString(findDecoder.colorFormat));
            runningInstance = this;
            this.mediaCodecThread = Thread.currentThread();
            try {
                this.width = i12;
                this.height = i13;
                this.stride = i12;
                this.sliceHeight = i13;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i12, i13);
                if (!this.useSurface) {
                    createVideoFormat.setInteger("color-format", 2135033992);
                }
                Logging.m127853d(TAG, "  Format: " + createVideoFormat);
                MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
                this.mediaCodec = createByCodecName;
                if (createByCodecName == null) {
                    Logging.m127854e(TAG, "Can not create media decoder");
                    return false;
                }
                createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                this.mediaCodec.start();
                this.colorFormat = findDecoder.colorFormat;
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                this.inputBuffers = this.mediaCodec.getInputBuffers();
                this.decodeStartTimeMs.clear();
                this.hasDecodedFirstFrame = false;
                this.dequeuedSurfaceOutputBuffers.clear();
                this.droppedFrames = 0;
                Logging.m127853d(TAG, "Input buffers: " + this.inputBuffers.length + ". Output buffers: " + this.outputBuffers.length);
                return true;
            } catch (IllegalStateException e11) {
                Logging.m127854e(TAG, "initDecode failed" + e11.toString());
                return false;
            }
        }
        throw new RuntimeException("Cannot find HW decoder for " + videoCodecType2);
    }
}
