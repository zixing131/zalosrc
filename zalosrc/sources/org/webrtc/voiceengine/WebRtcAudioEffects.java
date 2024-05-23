package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.List;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: classes7.dex */
class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private AcousticEchoCanceler aec = null;
    private AutomaticGainControl agc = null;

    /* renamed from: ns */
    private NoiseSuppressor f118133ns = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableAgc = false;
    private boolean shouldEnableNs = false;
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_AUTOMATIC_GAIN_CONTROL = UUID.fromString("aa8130e0-66fc-11e0-bad0-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static Boolean canUseAcousticEchoCanceler = null;
    private static Boolean canUseAutomaticGainControl = null;
    private static Boolean canUseNoiseSuppressor = null;

    private WebRtcAudioEffects() {
        Logging.m127853d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
            if (effectTypeIsVoIP(descriptor.type)) {
                Logging.m127853d(TAG, "name: " + descriptor.name + ", mode: " + descriptor.connectMode + ", implementor: " + descriptor.implementor + ", UUID: " + descriptor.uuid);
            }
        }
    }

    private static void assertTrue(boolean z11) {
        if (z11) {
        } else {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z11;
        if (canUseAcousticEchoCanceler == null) {
            if (isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID()) {
                z11 = true;
            } else {
                z11 = false;
            }
            canUseAcousticEchoCanceler = Boolean.valueOf(z11);
            Logging.m127853d(TAG, "canUseAcousticEchoCanceler: " + canUseAcousticEchoCanceler);
        }
        return canUseAcousticEchoCanceler.booleanValue();
    }

    public static boolean canUseAutomaticGainControl() {
        boolean z11;
        if (canUseAutomaticGainControl == null) {
            if (isAutomaticGainControlSupported() && !WebRtcAudioUtils.useWebRtcBasedAutomaticGainControl() && !isAutomaticGainControlBlacklisted() && !isAutomaticGainControlExcludedByUUID()) {
                z11 = true;
            } else {
                z11 = false;
            }
            canUseAutomaticGainControl = Boolean.valueOf(z11);
            Logging.m127853d(TAG, "canUseAutomaticGainControl: " + canUseAutomaticGainControl);
        }
        return canUseAutomaticGainControl.booleanValue();
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z11;
        if (canUseNoiseSuppressor == null) {
            if (isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID()) {
                z11 = true;
            } else {
                z11 = false;
            }
            canUseNoiseSuppressor = Boolean.valueOf(z11);
            Logging.m127853d(TAG, "canUseNoiseSuppressor: " + canUseNoiseSuppressor);
        }
        return canUseNoiseSuppressor.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WebRtcAudioEffects create() {
        if (!WebRtcAudioUtils.shouldUseHwAudioEffect()) {
            Logging.m127853d(TAG, "Disable hardward audio effect");
            return null;
        }
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || ((AudioEffect.EFFECT_TYPE_AGC.equals(uuid) && isAutomaticGainControlSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported()))) {
            return true;
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.m127856w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return AcousticEchoCanceler.isAvailable();
    }

    public static boolean isAutomaticGainControlBlacklisted() {
        List<String> blackListedModelsForAgcUsage = WebRtcAudioUtils.getBlackListedModelsForAgcUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAgcUsage.contains(str);
        if (contains) {
            Logging.m127856w(TAG, str + " is blacklisted for HW AGC usage!");
        }
        return contains;
    }

    private static boolean isAutomaticGainControlExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AGC) && descriptor.uuid.equals(AOSP_AUTOMATIC_GAIN_CONTROL)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAutomaticGainControlSupported() {
        return AutomaticGainControl.isAvailable();
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.m127856w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : AudioEffect.queryEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return NoiseSuppressor.isAvailable();
    }

    public void enable(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        String str;
        boolean z14;
        String str2;
        String str3;
        boolean z15;
        String str4;
        String str5;
        Logging.m127853d(TAG, "enable(audioSession=" + i11 + ")");
        boolean z16 = false;
        if (this.aec == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        assertTrue(z11);
        if (this.agc == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        assertTrue(z12);
        if (this.f118133ns == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        assertTrue(z13);
        String str6 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i11);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (this.shouldEnableAec && canUseAcousticEchoCanceler()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (this.aec.setEnabled(z15) != 0) {
                    Logging.m127854e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcousticEchoCanceler: was ");
                if (!enabled) {
                    str4 = "disabled";
                } else {
                    str4 = "enabled";
                }
                sb2.append(str4);
                sb2.append(", enable: ");
                sb2.append(z15);
                sb2.append(", is now: ");
                if (!this.aec.getEnabled()) {
                    str5 = "disabled";
                } else {
                    str5 = "enabled";
                }
                sb2.append(str5);
                Logging.m127853d(TAG, sb2.toString());
            } else {
                Logging.m127854e(TAG, "Failed to create the AcousticEchoCanceler Peer");
            }
        }
        if (isAutomaticGainControlSupported()) {
            AutomaticGainControl create2 = AutomaticGainControl.create(i11);
            this.agc = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (this.shouldEnableAgc && canUseAutomaticGainControl()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.agc.setEnabled(z14) != 0) {
                    Logging.m127854e(TAG, "Failed to set the AutomaticGainControl state");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AutomaticGainControl: was ");
                if (!enabled2) {
                    str2 = "disabled";
                } else {
                    str2 = "enabled";
                }
                sb3.append(str2);
                sb3.append(", enable: ");
                sb3.append(z14);
                sb3.append(", is now: ");
                if (!this.agc.getEnabled()) {
                    str3 = "disabled";
                } else {
                    str3 = "enabled";
                }
                sb3.append(str3);
                Logging.m127853d(TAG, sb3.toString());
            } else {
                Logging.m127854e(TAG, "Failed to create the AutomaticGainControl Peer");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create3 = NoiseSuppressor.create(i11);
            this.f118133ns = create3;
            if (create3 != null) {
                boolean enabled3 = create3.getEnabled();
                if (this.shouldEnableNs && canUseNoiseSuppressor()) {
                    z16 = true;
                }
                if (this.f118133ns.setEnabled(z16) != 0) {
                    Logging.m127854e(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("NoiseSuppressor: was ");
                if (!enabled3) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                sb4.append(str);
                sb4.append(", enable: ");
                sb4.append(z16);
                sb4.append(", is now: ");
                if (this.f118133ns.getEnabled()) {
                    str6 = "enabled";
                }
                sb4.append(str6);
                Logging.m127853d(TAG, sb4.toString());
                return;
            }
            Logging.m127854e(TAG, "Failed to create the NoiseSuppressor Peer");
        }
    }

    public void release() {
        Logging.m127853d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
        }
        NoiseSuppressor noiseSuppressor = this.f118133ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f118133ns = null;
        }
    }

    public boolean setAEC(boolean z11) {
        Logging.m127853d(TAG, "setAEC(" + z11 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.m127856w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z11 != this.shouldEnableAec) {
            Logging.m127854e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAec = z11;
        return true;
    }

    public boolean setAGC(boolean z11) {
        Logging.m127853d(TAG, "setAGC(" + z11 + ")");
        if (!canUseAutomaticGainControl()) {
            Logging.m127856w(TAG, "Platform AGC is not supported");
            this.shouldEnableAgc = false;
            return false;
        }
        if (this.agc != null && z11 != this.shouldEnableAgc) {
            Logging.m127854e(TAG, "Platform AGC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAgc = z11;
        return true;
    }

    public boolean setNS(boolean z11) {
        Logging.m127853d(TAG, "setNS(" + z11 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.m127856w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f118133ns != null && z11 != this.shouldEnableNs) {
            Logging.m127854e(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
        this.shouldEnableNs = z11;
        return true;
    }
}
