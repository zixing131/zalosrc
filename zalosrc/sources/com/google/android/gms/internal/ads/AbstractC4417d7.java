package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d7 */
/* loaded from: classes2.dex */
public abstract class AbstractC4417d7 {
    /* renamed from: a */
    public static int m21275a(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] != 71) {
            i11++;
        }
        return i11;
    }

    /* renamed from: b */
    public static long m21276b(x02 x02Var, int i11, int i12) {
        x02Var.m27775f(i11);
        if (x02Var.m27778i() < 5) {
            return -9223372036854775807L;
        }
        int m27782m = x02Var.m27782m();
        if ((8388608 & m27782m) != 0 || ((m27782m >> 8) & 8191) != i12 || (m27782m & 32) == 0 || x02Var.m27788s() < 7 || x02Var.m27778i() < 7 || (x02Var.m27788s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        x02Var.m27771b(bArr, 0, 6);
        byte b11 = bArr[0];
        long j11 = bArr[3] & 255;
        return ((bArr[1] & 255) << 17) | ((b11 & 255) << 25) | ((bArr[2] & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }
}
