package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class gm4 {

    /* renamed from: a */
    private static final int[] f20746a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f20747b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f20748c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f20749d = 0;

    /* renamed from: a */
    public static C4671k3 m22477a(byte[] bArr, String str, String str2, zzx zzxVar) {
        wz1 wz1Var;
        int i11 = 0;
        int i12 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            wz1Var = new wz1(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b11 = copyOf[0];
            if (b11 == -2 || b11 == -1) {
                for (int i13 = 0; i13 < copyOf.length - 1; i13 += 2) {
                    byte b12 = copyOf[i13];
                    int i14 = i13 + 1;
                    copyOf[i13] = copyOf[i14];
                    copyOf[i14] = b12;
                }
            }
            int length = copyOf.length;
            wz1Var = new wz1(copyOf, length);
            if (copyOf[0] == 31) {
                wz1 wz1Var2 = new wz1(copyOf, length);
                while (wz1Var2.m27744a() >= 16) {
                    wz1Var2.m27753j(2);
                    wz1Var.m27748e(wz1Var2.m27746c(14), 14);
                }
            }
            wz1Var.m27750g(copyOf, copyOf.length);
        }
        wz1Var.m27753j(60);
        int i15 = f20746a[wz1Var.m27746c(6)];
        int i16 = f20747b[wz1Var.m27746c(4)];
        int m27746c = wz1Var.m27746c(5);
        if (m27746c < 29) {
            i12 = (f20748c[m27746c] * 1000) / 2;
        }
        wz1Var.m27753j(10);
        if (wz1Var.m27746c(2) > 0) {
            i11 = 1;
        }
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26511h(str);
        c5004t1.m26523s("audio/vnd.dts");
        c5004t1.m26504d0(i12);
        c5004t1.m26506e0(i15 + i11);
        c5004t1.m26524t(i16);
        c5004t1.m26500b(null);
        c5004t1.m26515k(str2);
        return c5004t1.m26529y();
    }
}
