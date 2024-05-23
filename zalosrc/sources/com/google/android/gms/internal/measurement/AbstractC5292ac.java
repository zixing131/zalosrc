package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ac */
/* loaded from: classes.dex */
public abstract class AbstractC5292ac {

    /* renamed from: a */
    private static final AbstractC5682xb f32262a;

    /* renamed from: b */
    public static final /* synthetic */ int f32263b = 0;

    static {
        if (AbstractC5648vb.m29778C() && AbstractC5648vb.m29779D()) {
            int i11 = AbstractC5441j8.f32440a;
        }
        f32262a = new C5699yb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m28886a(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    byte b12 = bArr[i11];
                    byte b13 = bArr[i11 + 1];
                    if (b11 <= -12 && b12 <= -65 && b13 <= -65) {
                        return ((b12 << 8) ^ b11) ^ (b13 << 16);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b14 = bArr[i11];
                if (b11 <= -12 && b14 <= -65) {
                    return b11 ^ (b14 << 8);
                }
            }
        } else if (b11 <= -12) {
            return b11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ff, code lost:            return r9 + r0;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m28887b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char charAt;
        int length = charSequence.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length || (i15 = i16 + i11) >= i13 || (charAt = charSequence.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) charAt;
            i16++;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i13) {
                bArr[i17] = (byte) charAt2;
                i17++;
            } else if (charAt2 < 2048 && i17 <= i13 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i17 <= i13 - 3) {
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                int i19 = i17 + 2;
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            } else {
                if (i17 <= i13 - 4) {
                    int i21 = i16 + 1;
                    if (i21 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i21);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i22 = i17 + 3;
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i22] = (byte) ((codePoint & 63) | 128);
                            i16 = i21;
                        } else {
                            i16 = i21;
                        }
                    }
                    throw new C5716zb(i16 - 1, length);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i14 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i14)))) {
                    throw new C5716zb(i16, length);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
            }
            i16++;
        }
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m28888c(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) >= 65536) {
                                i12++;
                            } else {
                                throw new C5716zb(i12, length2);
                            }
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i13 + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m28889d(byte[] bArr) {
        return f32262a.m30029b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m28890e(byte[] bArr, int i11, int i12) {
        return f32262a.m30029b(bArr, i11, i12);
    }
}
