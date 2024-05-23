package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class jx3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m23772a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
        if (!m23778g(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !m23778g(b13) && !m23778g(b14)) {
            int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
            cArr[i11] = (char) ((i12 >>> 10) + 55232);
            cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
            return;
        }
        throw zzgrq.m28820d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m23773b(byte b11, byte b12, byte b13, char[] cArr, int i11) {
        if (!m23778g(b12)) {
            if (b11 == -32) {
                if (b12 >= -96) {
                    b11 = -32;
                }
            }
            if (b11 == -19) {
                if (b12 < -96) {
                    b11 = -19;
                }
            }
            if (!m23778g(b13)) {
                cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
                return;
            }
        }
        throw zzgrq.m28820d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m23774c(byte b11, byte b12, char[] cArr, int i11) {
        if (b11 >= -62 && !m23778g(b12)) {
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
            return;
        }
        throw zzgrq.m28820d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m23775d(byte b11) {
        return b11 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ boolean m23776e(byte b11) {
        return b11 < -16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ boolean m23777f(byte b11) {
        return b11 < -32;
    }

    /* renamed from: g */
    private static boolean m23778g(byte b11) {
        return b11 > -65;
    }
}
