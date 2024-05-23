package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.cl */
/* loaded from: classes2.dex */
public final class C4394cl {

    /* renamed from: a */
    public final String f18469a;

    /* renamed from: b */
    public final boolean f18470b;

    /* renamed from: c */
    public final boolean f18471c;

    /* renamed from: d */
    public final boolean f18472d;

    /* renamed from: e */
    private final String f18473e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f18474f;

    private C4394cl(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        str.getClass();
        this.f18469a = str;
        this.f18473e = str2;
        this.f18474f = codecCapabilities;
        boolean z15 = true;
        if (!z11 && codecCapabilities != null && AbstractC4916qo.f26898a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f18470b = z13;
        if (codecCapabilities != null && AbstractC4916qo.f26898a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f18471c = z14;
        if (!z12 && (codecCapabilities == null || AbstractC4916qo.f26898a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z15 = false;
        }
        this.f18472d = z15;
    }

    /* renamed from: a */
    public static C4394cl m20924a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12) {
        return new C4394cl(str, str2, codecCapabilities, z11, z12);
    }

    /* renamed from: b */
    public static C4394cl m20925b(String str) {
        return new C4394cl("OMX.google.raw.decoder", null, null, false, false);
    }

    /* renamed from: h */
    private final void m20926h(String str) {
        String str2 = this.f18469a;
        String str3 = this.f18473e;
        String str4 = AbstractC4916qo.f26902e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
    }

    /* renamed from: i */
    private static boolean m20927i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        if (d11 != -1.0d && d11 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i11, i12, d11);
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    /* renamed from: c */
    public final boolean m20928c(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18474f;
        if (codecCapabilities == null) {
            m20926h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m20926h("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() < i11) {
            m20926h("channelCount.support, " + i11);
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m20929d(int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18474f;
        if (codecCapabilities == null) {
            m20926h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m20926h("sampleRate.aCaps");
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i11)) {
            m20926h("sampleRate.support, " + i11);
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m20930e(String str) {
        String str2;
        if (str == null || this.f18473e == null) {
            return true;
        }
        String trim = str.trim();
        if (!trim.startsWith("avc1") && !trim.startsWith("avc3")) {
            if (!trim.startsWith("hev1") && !trim.startsWith("hvc1")) {
                if (trim.startsWith("vp9")) {
                    str2 = "video/x-vnd.on2.vp9";
                } else if (trim.startsWith("vp8")) {
                    str2 = "video/x-vnd.on2.vp8";
                } else if (trim.startsWith("mp4a")) {
                    str2 = "audio/mp4a-latm";
                } else if (!trim.startsWith("ac-3") && !trim.startsWith("dac3")) {
                    if (!trim.startsWith("ec-3") && !trim.startsWith("dec3")) {
                        if (!trim.startsWith("dtsc") && !trim.startsWith("dtse")) {
                            if (!trim.startsWith("dtsh") && !trim.startsWith("dtsl")) {
                                if (trim.startsWith("opus")) {
                                    str2 = "audio/opus";
                                } else if (trim.startsWith("vorbis")) {
                                    str2 = "audio/vorbis";
                                } else {
                                    str2 = null;
                                }
                            } else {
                                str2 = "audio/vnd.dts.hd";
                            }
                        } else {
                            str2 = "audio/vnd.dts";
                        }
                    } else {
                        str2 = "audio/eac3";
                    }
                } else {
                    str2 = "audio/ac3";
                }
            } else {
                str2 = "video/hevc";
            }
        } else {
            str2 = "video/avc";
        }
        if (str2 == null) {
            return true;
        }
        if (!this.f18473e.equals(str2)) {
            m20926h("codec.mime " + str + ", " + str2);
            return false;
        }
        Pair m24940b = AbstractC4801nl.m24940b(str);
        if (m24940b == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m20932g()) {
            if (codecProfileLevel.profile == ((Integer) m24940b.first).intValue() && codecProfileLevel.level >= ((Integer) m24940b.second).intValue()) {
                return true;
            }
        }
        m20926h("codec.profileLevel, " + str + ", " + str2);
        return false;
    }

    /* renamed from: f */
    public final boolean m20931f(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18474f;
        if (codecCapabilities == null) {
            m20926h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m20926h("sizeAndRate.vCaps");
            return false;
        }
        if (!m20927i(videoCapabilities, i11, i12, d11)) {
            if (i11 < i12 && m20927i(videoCapabilities, i12, i11, d11)) {
                String str = this.f18469a;
                String str2 = this.f18473e;
                String str3 = AbstractC4916qo.f26902e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AssumedSupport [");
                sb2.append("sizeAndRate.rotated, " + i11 + "x" + i12 + "x" + d11);
                sb2.append("] [");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(str2);
                sb2.append("] [");
                sb2.append(str3);
                sb2.append("]");
                return true;
            }
            m20926h("sizeAndRate.support, " + i11 + "x" + i12 + "x" + d11);
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final MediaCodecInfo.CodecProfileLevel[] m20932g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18474f;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
