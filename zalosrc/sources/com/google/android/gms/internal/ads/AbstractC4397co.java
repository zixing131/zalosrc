package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.co */
/* loaded from: classes2.dex */
public abstract class AbstractC4397co {

    /* renamed from: a */
    private static final byte[] f18498a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f18499b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f18500c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair m20961a(byte[] bArr) {
        boolean z11;
        C4619io c4619io = new C4619io(bArr, bArr.length);
        int m20963c = m20963c(c4619io);
        int m20964d = m20964d(c4619io);
        int m23310a = c4619io.m23310a(4);
        if (m20963c == 5 || m20963c == 29) {
            m20964d = m20964d(c4619io);
            if (m20963c(c4619io) == 22) {
                m23310a = c4619io.m23310a(4);
            }
        }
        int i11 = f18500c[m23310a];
        if (i11 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        return Pair.create(Integer.valueOf(m20964d), Integer.valueOf(i11));
    }

    /* renamed from: b */
    public static byte[] m20962b(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 4];
        System.arraycopy(f18498a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i11, bArr2, 4, i12);
        return bArr2;
    }

    /* renamed from: c */
    private static int m20963c(C4619io c4619io) {
        int m23310a = c4619io.m23310a(5);
        if (m23310a == 31) {
            return c4619io.m23310a(6) + 32;
        }
        return m23310a;
    }

    /* renamed from: d */
    private static int m20964d(C4619io c4619io) {
        boolean z11;
        int m23310a = c4619io.m23310a(4);
        if (m23310a == 15) {
            return c4619io.m23310a(24);
        }
        if (m23310a < 13) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        return f18499b[m23310a];
    }
}
