package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class nx3 {

    /* renamed from: a */
    private static final kx3 f25371a;

    static {
        if (ix3.m23439a() && ix3.m23440b()) {
            int i11 = xs3.f30618a;
        }
        f25371a = new lx3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ int m25033c(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return m25042l(b11, bArr[i11], bArr[i11 + 1]);
                }
                throw new AssertionError();
            }
            return m25041k(b11, bArr[i11]);
        }
        if (b11 > -12) {
            return -1;
        }
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:            return r9 + r0;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m25034d(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i12 + i11;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i11) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                bArr[i17] = (byte) charAt2;
                i17++;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i17 <= i15 - 3) {
                bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                int i19 = i17 + 2;
                bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            } else {
                if (i17 <= i15 - 4) {
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
                    throw new mx3(i16 - 1, length);
                }
                if (charAt2 >= 55296 && charAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                    throw new mx3(i16, length);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
            }
            i16++;
        }
        return i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m25035e(CharSequence charSequence) {
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
                                throw new mx3(i12, length2);
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
    /* renamed from: f */
    public static int m25036f(int i11, byte[] bArr, int i12, int i13) {
        return f25371a.mo24084a(i11, bArr, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m25037g(ByteBuffer byteBuffer, int i11, int i12) {
        kx3 kx3Var = f25371a;
        if (byteBuffer.hasArray()) {
            return kx3Var.mo24085b(byteBuffer.array(), byteBuffer.arrayOffset() + i11, i12);
        }
        if (byteBuffer.isDirect()) {
            return kx3.m24083d(byteBuffer, i11, i12);
        }
        return kx3.m24083d(byteBuffer, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m25038h(byte[] bArr, int i11, int i12) {
        return f25371a.mo24085b(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m25039i(byte[] bArr) {
        return f25371a.m24086c(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m25040j(byte[] bArr, int i11, int i12) {
        return f25371a.m24086c(bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m25041k(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m25042l(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }
}
