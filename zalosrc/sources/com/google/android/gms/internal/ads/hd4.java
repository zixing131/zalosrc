package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* loaded from: classes2.dex */
public final class hd4 {

    /* renamed from: a */
    public final String f21638a;

    /* renamed from: b */
    public final String f21639b;

    /* renamed from: c */
    public final String f21640c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f21641d;

    /* renamed from: e */
    public final boolean f21642e;

    /* renamed from: f */
    public final boolean f21643f;

    /* renamed from: g */
    public final boolean f21644g;

    /* renamed from: h */
    private final boolean f21645h;

    hd4(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.f21638a = str;
        this.f21639b = str2;
        this.f21640c = str3;
        this.f21641d = codecCapabilities;
        this.f21644g = z11;
        this.f21642e = z14;
        this.f21643f = z16;
        this.f21645h = k70.m23850h(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:            if ("Nexus 10".equals(r3) == false) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:            if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L50;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hd4 m22786c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        boolean z17;
        boolean z18;
        if (codecCapabilities != null) {
            int i11 = g92.f20474a;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (g92.f20474a <= 22) {
                    String str4 = g92.f20477d;
                    if (!"ODROID-XU3".equals(str4)) {
                    }
                    if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                    }
                }
                z16 = true;
                if (codecCapabilities == null && g92.f20474a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z15 || (codecCapabilities != null && g92.f20474a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                return new hd4(str, str2, str3, codecCapabilities, z11, z12, z13, z16, z17, z18);
            }
        }
        z16 = false;
        if (codecCapabilities == null) {
        }
        z17 = false;
        if (!z15) {
        }
        z18 = true;
        return new hd4(str, str2, str3, codecCapabilities, z11, z12, z13, z16, z17, z18);
    }

    /* renamed from: h */
    private static Point m22787h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(g92.m22321O(i11, widthAlignment) * widthAlignment, g92.m22321O(i12, heightAlignment) * heightAlignment);
    }

    /* renamed from: i */
    private final void m22788i(String str) {
        lr1.m24352a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f21638a + ", " + this.f21639b + "] [" + g92.f20478e + "]");
    }

    /* renamed from: j */
    private static boolean m22789j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i11, int i12, double d11) {
        Point m22787h = m22787h(videoCapabilities, i11, i12);
        int i13 = m22787h.x;
        int i14 = m22787h.y;
        if (d11 != -1.0d && d11 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d11));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    /* renamed from: a */
    public final Point m22790a(int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21641d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m22787h(videoCapabilities, i11, i12);
    }

    /* renamed from: b */
    public final lw3 m22791b(C4671k3 c4671k3, C4671k3 c4671k32) {
        int i11;
        int i12;
        if (true != g92.m22362t(c4671k3.f23099l, c4671k32.f23099l)) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        if (this.f21645h) {
            if (c4671k3.f23107t != c4671k32.f23107t) {
                i11 |= 1024;
            }
            if (!this.f21642e && (c4671k3.f23104q != c4671k32.f23104q || c4671k3.f23105r != c4671k32.f23105r)) {
                i11 |= 512;
            }
            if (!g92.m22362t(c4671k3.f23111x, c4671k32.f23111x)) {
                i11 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
            }
            String str = this.f21638a;
            if (g92.f20477d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !c4671k3.m23811d(c4671k32)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                String str2 = this.f21638a;
                if (true != c4671k3.m23811d(c4671k32)) {
                    i12 = 2;
                } else {
                    i12 = 3;
                }
                return new lw3(str2, c4671k3, c4671k32, i12, 0);
            }
        } else {
            if (c4671k3.f23112y != c4671k32.f23112y) {
                i11 |= 4096;
            }
            if (c4671k3.f23113z != c4671k32.f23113z) {
                i11 |= 8192;
            }
            if (c4671k3.f23082A != c4671k32.f23082A) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f21639b)) {
                Pair m21354b = de4.m21354b(c4671k3);
                Pair m21354b2 = de4.m21354b(c4671k32);
                if (m21354b != null && m21354b2 != null) {
                    int intValue = ((Integer) m21354b.first).intValue();
                    int intValue2 = ((Integer) m21354b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new lw3(this.f21638a, c4671k3, c4671k32, 3, 0);
                    }
                }
            }
            if (!c4671k3.m23811d(c4671k32)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.f21639b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new lw3(this.f21638a, c4671k3, c4671k32, 1, 0);
            }
        }
        return new lw3(this.f21638a, c4671k3, c4671k32, 0, i11);
    }

    /* renamed from: d */
    public final boolean m22792d(C4671k3 c4671k3) {
        int i11;
        Pair m21354b;
        int i12;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z11 = false;
        if (!this.f21639b.equals(c4671k3.f23099l) && !this.f21639b.equals(de4.m21357e(c4671k3))) {
            return false;
        }
        int i13 = 16;
        if (c4671k3.f23096i != null && (m21354b = de4.m21354b(c4671k3)) != null) {
            int intValue = ((Integer) m21354b.first).intValue();
            int intValue2 = ((Integer) m21354b.second).intValue();
            int i14 = 8;
            if ("video/dolby-vision".equals(c4671k3.f23099l)) {
                if ("video/avc".equals(this.f21639b)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.f21639b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (!this.f21645h) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] m22795g = m22795g();
            if (g92.f20474a <= 23 && "video/x-vnd.on2.vp9".equals(this.f21639b) && m22795g.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21641d;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    i12 = videoCapabilities.getBitrateRange().getUpper().intValue();
                } else {
                    i12 = 0;
                }
                if (i12 >= 180000000) {
                    i14 = 1024;
                } else if (i12 >= 120000000) {
                    i14 = 512;
                } else if (i12 >= 60000000) {
                    i14 = 256;
                } else if (i12 >= 30000000) {
                    i14 = 128;
                } else if (i12 >= 18000000) {
                    i14 = 64;
                } else if (i12 >= 12000000) {
                    i14 = 32;
                } else if (i12 >= 7200000) {
                    i14 = 16;
                } else if (i12 < 3600000) {
                    if (i12 >= 1800000) {
                        i14 = 4;
                    } else if (i12 >= 800000) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i14;
                m22795g = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : m22795g) {
                if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                    if ("video/hevc".equals(this.f21639b) && intValue == 2) {
                        String str = g92.f20475b;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                }
            }
            m22788i("codec.profileLevel, " + c4671k3.f23096i + ", " + this.f21640c);
            return false;
        }
        if (this.f21645h) {
            int i15 = c4671k3.f23104q;
            if (i15 <= 0 || (i11 = c4671k3.f23105r) <= 0) {
                return true;
            }
            if (g92.f20474a >= 21) {
                return m22794f(i15, i11, c4671k3.f23106s);
            }
            if (i15 * i11 <= de4.m21353a()) {
                z11 = true;
            }
            if (!z11) {
                m22788i("legacyFrameSize, " + c4671k3.f23104q + "x" + c4671k3.f23105r);
            }
            return z11;
        }
        int i16 = g92.f20474a;
        if (i16 >= 21) {
            int i17 = c4671k3.f23113z;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f21641d;
                if (codecCapabilities2 == null) {
                    m22788i("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m22788i("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i17)) {
                    m22788i("sampleRate.support, " + i17);
                    return false;
                }
            }
            int i18 = c4671k3.f23112y;
            if (i18 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f21641d;
                if (codecCapabilities3 == null) {
                    m22788i("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m22788i("channelCount.aCaps");
                    } else {
                        String str2 = this.f21638a;
                        String str3 = this.f21639b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i16 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i13 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i13 = 30;
                            }
                            lr1.m24356e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i13 + "]");
                            maxInputChannelCount = i13;
                        }
                        if (maxInputChannelCount < i18) {
                            m22788i("channelCount.support, " + i18);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m22793e(C4671k3 c4671k3) {
        if (this.f21645h) {
            return this.f21642e;
        }
        Pair m21354b = de4.m21354b(c4671k3);
        if (m21354b != null && ((Integer) m21354b.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m22794f(int i11, int i12, double d11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21641d;
        if (codecCapabilities == null) {
            m22788i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m22788i("sizeAndRate.vCaps");
            return false;
        }
        if (!m22789j(videoCapabilities, i11, i12, d11)) {
            if (i11 < i12 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f21638a) || !"mcv5a".equals(g92.f20475b)) && m22789j(videoCapabilities, i12, i11, d11))) {
                String str = this.f21638a;
                String str2 = this.f21639b;
                String str3 = g92.f20478e;
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
                lr1.m24352a("MediaCodecInfo", sb2.toString());
                return true;
            }
            m22788i("sizeAndRate.support, " + i11 + "x" + i12 + "x" + d11);
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final MediaCodecInfo.CodecProfileLevel[] m22795g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21641d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    public final String toString() {
        return this.f21638a;
    }
}
