package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wb */
/* loaded from: classes2.dex */
abstract class AbstractC5665wb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m29983a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) {
        if (!m29987e(b12) && (((b11 << 28) + (b12 + 112)) >> 30) == 0 && !m29987e(b13) && !m29987e(b14)) {
            int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
            cArr[i11] = (char) ((i12 >>> 10) + 55232);
            cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
            return;
        }
        throw zzll.m30119c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m29984b(byte b11, byte b12, byte b13, char[] cArr, int i11) {
        if (!m29987e(b12)) {
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
            if (!m29987e(b13)) {
                cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
                return;
            }
        }
        throw zzll.m30119c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m29985c(byte b11, byte b12, char[] cArr, int i11) {
        if (b11 >= -62 && !m29987e(b12)) {
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
            return;
        }
        throw zzll.m30119c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m29986d(byte b11) {
        return b11 >= 0;
    }

    /* renamed from: e */
    private static boolean m29987e(byte b11) {
        return b11 > -65;
    }
}
