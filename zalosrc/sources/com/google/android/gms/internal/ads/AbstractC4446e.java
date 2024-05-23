package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4446e {

    /* renamed from: a */
    private static final String[] f19464a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f19465b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f19466c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f19467d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f19468e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f19469f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f19470g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: b */
    public static int m21585b(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!m21596m(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i18 = f19465b[i15];
        if (i12 == 2) {
            i18 /= 2;
        } else if (i12 == 0) {
            i18 /= 4;
        }
        int i19 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            if (i12 == 3) {
                i17 = f19466c[i14 - 1];
            } else {
                i17 = f19467d[i14 - 1];
            }
            return (((i17 * 12) / i18) + i19) * 4;
        }
        if (i12 == 3) {
            if (i13 == 2) {
                i16 = f19468e[i14 - 1];
            } else {
                i16 = f19469f[i14 - 1];
            }
        } else {
            i16 = f19470g[i14 - 1];
        }
        int i21 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444;
        if (i12 == 3) {
            return ((i16 * ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444) / i18) + i19;
        }
        if (i13 == 1) {
            i21 = 72;
        }
        return ((i21 * i16) / i18) + i19;
    }

    /* renamed from: c */
    public static int m21586c(int i11) {
        int i12;
        int i13;
        if (!m21596m(i11) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0) {
            return -1;
        }
        int i14 = (i11 >>> 12) & 15;
        int i15 = (i11 >>> 10) & 3;
        if (i14 == 0 || i14 == 15 || i15 == 3) {
            return -1;
        }
        return m21595l(i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m21595l(int i11, int i12) {
        return i12 != 1 ? i12 != 2 ? 384 : 1152 : i11 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m21596m(int i11) {
        return (i11 & (-2097152)) == -2097152;
    }
}
