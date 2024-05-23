package org.webrtc.voiceengine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import org.webrtc.Logging;
import p097db.AbstractC17849h;

/* loaded from: classes7.dex */
class WebRtcAudioManager {
    static final String[] AUDIO_MODES = {"MODE_NORMAL", "MODE_RINGTONE", "MODE_IN_CALL", "MODE_IN_COMMUNICATION"};
    static final int BITS_PER_SAMPLE = 16;
    static final int CHANNELS = 1;
    static final boolean DEBUG = false;
    static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static String FEATURE_CALL = "comm_call";
    private static String FEATURE_LIVESTREAM = "comm_csc";
    private static String SOURCE_LIVESTREAM = "micro_csc_attachment_livestream";
    private static String SOURCE_VIDEO_CALL_1_1 = "micro_call";
    private static String SOURCE_VIDEO_CALL_GROUP = "micro_call_group";
    static final String TAG = "WebRtcAudioManager";
    final AudioManager audioManager;
    int channels;
    final Context context;
    boolean hardwareAEC;
    boolean hardwareAGC;
    boolean hardwareNS;
    boolean initialized = false;
    int inputBufferSize;
    boolean lowLatencyInput;
    boolean lowLatencyOutput;
    final long nativeAudioManager;
    int nativeChannels;
    int nativeSampleRate;
    int outputBufferSize;
    int sampleRate;

    WebRtcAudioManager(Context context, long j11) {
        this.context = context;
        this.nativeAudioManager = j11;
        this.audioManager = (AudioManager) context.getSystemService("audio");
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.channels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.outputBufferSize, this.inputBufferSize, j11);
    }

    static void assertTrue(boolean z11) {
        if (z11) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    static int getMinInputFrameSize(int i11, int i12) {
        int i13 = i12 * 2;
        boolean z11 = true;
        if (i12 != 1) {
            z11 = false;
        }
        assertTrue(z11);
        return AudioRecord.getMinBufferSize(i11, 16, 2) / i13;
    }

    static int getMinOutputFrameSize(int i11, int i12) {
        int i13;
        int i14 = i12 * 2;
        if (i12 == 1) {
            i13 = 4;
        } else if (i12 == 2) {
            i13 = 12;
        } else {
            return -1;
        }
        return AudioTrack.getMinBufferSize(i11, i13, 2) / i14;
    }

    private SensitiveData getSensitiveData() {
        int m94292a = AbstractC17849h.m94292a();
        if (m94292a != 0) {
            if (m94292a != 1) {
                if (m94292a != 2) {
                    return null;
                }
                return new SensitiveData(SOURCE_VIDEO_CALL_GROUP, FEATURE_CALL);
            }
            return new SensitiveData(SOURCE_LIVESTREAM, FEATURE_LIVESTREAM);
        }
        return new SensitiveData(SOURCE_VIDEO_CALL_1_1, FEATURE_CALL);
    }

    static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    static boolean isAutomaticGainControlSupported() {
        return WebRtcAudioEffects.canUseAutomaticGainControl();
    }

    static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    void dispose() {
    }

    int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    @SuppressLint({"NewApi"})
    int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return DEFAULT_FRAME_PER_BUFFER;
        }
        return Integer.parseInt(property);
    }

    @SuppressLint({"NewApi"})
    int getNativeOutputSampleRate() {
        int parseInt;
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.m127853d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.m127853d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            parseInt = WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            parseInt = Integer.parseInt(property);
        }
        Logging.m127853d(TAG, "Sample rate is set to " + parseInt + " Hz");
        return parseInt;
    }

    boolean hasEarpiece() {
        return this.context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    boolean init() {
        if (this.initialized) {
            return true;
        }
        this.initialized = true;
        return true;
    }

    boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return true;
        }
        return false;
    }

    boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.m127854e(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    public boolean isLowLatencyInputSupported() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported()) {
            return true;
        }
        return false;
    }

    boolean isLowLatencyOutputSupported() {
        return this.context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    native void nativeCacheAudioParameters(int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i13, int i14, long j11);

    void onChangeRecordState(boolean z11) {
        SensitiveData sensitiveData = getSensitiveData();
        if (sensitiveData != null) {
            if (z11) {
                C8937j0.m47660i().m49661d(sensitiveData);
            } else {
                C8937j0.m47660i().m49660b();
            }
        }
    }

    void storeAudioParameters() {
        int minOutputFrameSize;
        int minInputFrameSize;
        this.channels = 1;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = isAutomaticGainControlSupported();
        this.hardwareNS = isNoiseSuppressorSupported();
        boolean isLowLatencyOutputSupported = isLowLatencyOutputSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported;
        if (isLowLatencyOutputSupported) {
            minOutputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minOutputFrameSize = getMinOutputFrameSize(this.sampleRate, this.channels);
        }
        this.outputBufferSize = minOutputFrameSize;
        boolean isLowLatencyOutputSupported2 = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyOutputSupported2;
        if (isLowLatencyOutputSupported2) {
            minInputFrameSize = getLowLatencyInputFramesPerBuffer();
        } else {
            minInputFrameSize = getMinInputFrameSize(this.sampleRate, this.channels);
        }
        this.inputBufferSize = minInputFrameSize;
    }
}
