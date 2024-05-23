package com.google.android.gms.internal.ads;

import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* loaded from: classes2.dex */
public abstract class ml4 {

    /* renamed from: a */
    private static final int[] f24647a = {ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, ZAbstractBase.ZVU_PROCESS_FLUSH, 1920, 1601, 1600, 1001, 1000, 960, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 480, 400, 400, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA};

    /* renamed from: b */
    public static final /* synthetic */ int f24648b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:            if (r12 != 11) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:            if (r12 != 11) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:            if (r12 != 8) goto L45;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ll4 m24628a(wz1 wz1Var) {
        int i11;
        int i12;
        int i13;
        int m27746c;
        int m27746c2 = wz1Var.m27746c(16);
        int m27746c3 = wz1Var.m27746c(16);
        if (m27746c3 == 65535) {
            m27746c3 = wz1Var.m27746c(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i14 = m27746c3 + i11;
        if (m27746c2 == 44097) {
            i14 += 2;
        }
        int i15 = i14;
        int m27746c4 = wz1Var.m27746c(2);
        if (m27746c4 == 3) {
            int i16 = 0;
            while (true) {
                m27746c = i16 + wz1Var.m27746c(2);
                if (!wz1Var.m27755l()) {
                    break;
                }
                i16 = (m27746c + 1) << 2;
            }
            m27746c4 = m27746c + 3;
        }
        int i17 = m27746c4;
        int m27746c5 = wz1Var.m27746c(10);
        if (wz1Var.m27755l() && wz1Var.m27746c(3) > 0) {
            wz1Var.m27753j(2);
        }
        if (true != wz1Var.m27755l()) {
            i12 = 44100;
        } else {
            i12 = 48000;
        }
        int m27746c6 = wz1Var.m27746c(4);
        if (i12 == 44100 && m27746c6 == 13) {
            i13 = f24647a[13];
        } else if (i12 == 48000 && m27746c6 < 14) {
            int i18 = f24647a[m27746c6];
            int i19 = m27746c5 % 5;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 == 4) {
                            if (m27746c6 != 3) {
                                if (m27746c6 != 8) {
                                }
                            }
                            i18++;
                        }
                        i13 = i18;
                    }
                } else {
                    if (m27746c6 != 8) {
                    }
                    i18++;
                    i13 = i18;
                }
            }
            if (m27746c6 != 3) {
            }
            i18++;
            i13 = i18;
        } else {
            i13 = 0;
        }
        return new ll4(i17, 2, i12, i15, i13, null);
    }

    /* renamed from: b */
    public static void m24629b(int i11, x02 x02Var) {
        x02Var.m27772c(7);
        byte[] m27777h = x02Var.m27777h();
        m27777h[0] = -84;
        m27777h[1] = 64;
        m27777h[2] = -1;
        m27777h[3] = -1;
        m27777h[4] = (byte) ((i11 >> 16) & 255);
        m27777h[5] = (byte) ((i11 >> 8) & 255);
        m27777h[6] = (byte) (i11 & 255);
    }
}
