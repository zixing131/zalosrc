package org.webrtc.voiceengine;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import org.webrtc.Logging;

/* loaded from: classes7.dex */
public final class WebRtcAudioUtils {
    private static boolean HW_AUDIO_EFFECT = true;
    private static final String TAG = "WebRtcAudioUtils";
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = {"Nexus 5", "D6503", "ONE A2005"};
    private static final String[] BLACKLISTED_AGC_MODELS = {"Nexus 10", "Nexus 9"};
    private static final String[] BLACKLISTED_NS_MODELS = {"Nexus 10", "Nexus 9", "Nexus 5", "ONE A2005"};
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static int defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
    private static boolean isDefaultSampleRateOverridden = false;
    private static boolean useWebRtcBasedAcousticEchoCanceler = false;
    private static boolean useWebRtcBasedAutomaticGainControl = false;
    private static boolean useWebRtcBasedNoiseSuppressor = false;

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForAgcUsage() {
        return Arrays.asList(BLACKLISTED_AGC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i11;
        synchronized (WebRtcAudioUtils.class) {
            i11 = defaultSampleRateHz;
        }
        return i11;
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    public static boolean hasPermission(Context context, String str) {
        if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z11;
        synchronized (WebRtcAudioUtils.class) {
            z11 = isDefaultSampleRateOverridden;
        }
        return z11;
    }

    public static boolean runningOnEmulator() {
        if (Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_")) {
            return true;
        }
        return false;
    }

    public static boolean runningOnLollipopOrHigher() {
        return true;
    }

    public static synchronized void setDefaultSampleRateHz(int i11) {
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (i11 <= 0) {
                    isDefaultSampleRateOverridden = false;
                    defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
                } else {
                    isDefaultSampleRateOverridden = true;
                    defaultSampleRateHz = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setEnableBuildInHwAudioEffect(boolean z11) {
        HW_AUDIO_EFFECT = z11;
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z11) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z11;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z11) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAutomaticGainControl = z11;
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z11) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z11;
        }
    }

    public static boolean shouldUseHwAudioEffect() {
        return HW_AUDIO_EFFECT;
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z11;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedAcousticEchoCanceler) {
                    Logging.m127856w(TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                z11 = useWebRtcBasedAcousticEchoCanceler;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        boolean z11;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedAutomaticGainControl) {
                    Logging.m127856w(TAG, "Overriding default behavior; now using WebRTC AGC!");
                }
                z11 = useWebRtcBasedAutomaticGainControl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z11;
        synchronized (WebRtcAudioUtils.class) {
            try {
                if (useWebRtcBasedNoiseSuppressor) {
                    Logging.m127856w(TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                z11 = useWebRtcBasedNoiseSuppressor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }
}
