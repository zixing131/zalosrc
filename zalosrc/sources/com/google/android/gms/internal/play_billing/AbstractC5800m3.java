package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.m3 */
/* loaded from: classes2.dex */
public abstract class AbstractC5800m3 {

    /* renamed from: a */
    private static final AbstractC5782j3 f33366a;

    /* renamed from: b */
    public static final /* synthetic */ int f33367b = 0;

    static {
        if (AbstractC5770h3.m30245C() && AbstractC5770h3.m30246D()) {
            int i11 = AbstractC5722a0.f33231a;
        }
        f33366a = new C5788k3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m30362a(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    byte b12 = bArr[i11];
                    byte b13 = bArr[i11 + 1];
                    if (b11 <= -12 && b12 <= -65 && b13 <= -65) {
                        return (b13 << 16) ^ ((b12 << 8) ^ b11);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b14 = bArr[i11];
            if (b11 <= -12 && b14 <= -65) {
                return (b14 << 8) ^ b11;
            }
            return -1;
        }
        if (b11 <= -12) {
            return b11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0101, code lost:            return r10 + r0;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m30363b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
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
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i17 + 1] = (byte) ((charAt2 & '?') | 128);
                i17 += 2;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i17 <= i13 - 3) {
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                i17 += 3;
            } else {
                if (i17 <= i13 - 4) {
                    int i18 = i16 + 1;
                    if (i18 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i18);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i19 = i17 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i16 = i18;
                        } else {
                            i16 = i18;
                        }
                    }
                    throw new C5794l3(i16 - 1, length);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i14 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i14)))) {
                    throw new C5794l3(i16, length);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
            }
            i16++;
        }
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m30364c(CharSequence charSequence) {
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
                                throw new C5794l3(i12, length2);
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
    public static boolean m30365d(byte[] bArr) {
        return f33366a.m30301b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m30366e(byte[] bArr, int i11, int i12) {
        return f33366a.m30301b(bArr, i11, i12);
    }
}
