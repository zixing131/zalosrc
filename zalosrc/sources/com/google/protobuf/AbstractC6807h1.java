package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.h1 */
/* loaded from: classes3.dex */
public abstract class AbstractC6807h1 {

    /* renamed from: a */
    private static final a f37313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.h1$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        a() {
        }

        /* renamed from: a */
        abstract int mo34965a(CharSequence charSequence, byte[] bArr, int i11, int i12);

        /* renamed from: b */
        final boolean m34966b(byte[] bArr, int i11, int i12) {
            if (mo34967c(0, bArr, i11, i12) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        abstract int mo34967c(int i11, byte[] bArr, int i12, int i13);
    }

    /* renamed from: com.google.protobuf.h1$b */
    /* loaded from: classes3.dex */
    static final class b extends a {
        b() {
        }

        /* renamed from: d */
        private static int m34968d(byte[] bArr, int i11, int i12) {
            while (i11 < i12 && bArr[i11] >= 0) {
                i11++;
            }
            if (i11 >= i12) {
                return 0;
            }
            return m34969e(bArr, i11, i12);
        }

        /* renamed from: e */
        private static int m34969e(byte[] bArr, int i11, int i12) {
            while (i11 < i12) {
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    if (b11 < -32) {
                        if (i13 >= i12) {
                            return b11;
                        }
                        if (b11 >= -62) {
                            i11 += 2;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b11 < -16) {
                        if (i13 >= i12 - 1) {
                            return AbstractC6807h1.m34962k(bArr, i13, i12);
                        }
                        int i14 = i11 + 2;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                            i11 += 3;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i12 - 2) {
                        return AbstractC6807h1.m34962k(bArr, i13, i12);
                    }
                    int i15 = i11 + 2;
                    byte b13 = bArr[i13];
                    if (b13 <= -65 && (((b11 << 28) + (b13 + 112)) >> 30) == 0) {
                        int i16 = i11 + 3;
                        if (bArr[i15] <= -65) {
                            i11 += 4;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                i11 = i13;
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r10 + r0;     */
        @Override // com.google.protobuf.AbstractC6807h1.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo34965a(CharSequence charSequence, byte[] bArr, int i11, int i12) {
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
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
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
                        throw new c(i16 - 1, length);
                    }
                    if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                        throw new c(i16, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                }
                i16++;
            }
            return i17;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:            if (r8[r9] > (-65)) goto L13;     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:            if (r8[r9] > (-65)) goto L32;     */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:            if (r8[r7] > (-65)) goto L53;     */
        @Override // com.google.protobuf.AbstractC6807h1.a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo34967c(int i11, byte[] bArr, int i12, int i13) {
            byte b11;
            int i14;
            int i15;
            if (i11 != 0) {
                if (i12 >= i13) {
                    return i11;
                }
                byte b12 = (byte) i11;
                if (b12 < -32) {
                    if (b12 >= -62) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                if (b12 < -16) {
                    byte b13 = (byte) (~(i11 >> 8));
                    if (b13 == 0) {
                        int i16 = i12 + 1;
                        byte b14 = bArr[i12];
                        if (i16 >= i13) {
                            return AbstractC6807h1.m34960i(b12, b14);
                        }
                        i12 = i16;
                        b13 = b14;
                    }
                    if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                        i15 = i12 + 1;
                    }
                    return -1;
                }
                byte b15 = (byte) (~(i11 >> 8));
                if (b15 == 0) {
                    i14 = i12 + 1;
                    b15 = bArr[i12];
                    if (i14 >= i13) {
                        return AbstractC6807h1.m34960i(b12, b15);
                    }
                    b11 = 0;
                } else {
                    b11 = (byte) (i11 >> 16);
                    i14 = i12;
                }
                if (b11 == 0) {
                    int i17 = i14 + 1;
                    byte b16 = bArr[i14];
                    if (i17 >= i13) {
                        return AbstractC6807h1.m34961j(b12, b15, b16);
                    }
                    b11 = b16;
                    i14 = i17;
                }
                if (b15 <= -65 && (((b12 << 28) + (b15 + 112)) >> 30) == 0 && b11 <= -65) {
                    i12 = i14 + 1;
                }
                return -1;
                i12 = i15;
            }
            return m34968d(bArr, i12, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.h1$c */
    /* loaded from: classes3.dex */
    public static class c extends IllegalArgumentException {
        c(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    /* renamed from: com.google.protobuf.h1$d */
    /* loaded from: classes3.dex */
    static final class d extends a {
        d() {
        }

        /* renamed from: d */
        static boolean m34970d() {
            if (AbstractC6804g1.m34842E() && AbstractC6804g1.m34843F()) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:            return -1;     */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int m34971e(byte[] bArr, long j11, int i11) {
            int m34972f = m34972f(bArr, j11, i11);
            int i12 = i11 - m34972f;
            long j12 = j11 + m34972f;
            while (true) {
                byte b11 = 0;
                while (true) {
                    if (i12 <= 0) {
                        break;
                    }
                    long j13 = j12 + 1;
                    b11 = AbstractC6804g1.m34878u(bArr, j12);
                    if (b11 >= 0) {
                        i12--;
                        j12 = j13;
                    } else {
                        j12 = j13;
                        break;
                    }
                }
                if (i12 == 0) {
                    return 0;
                }
                int i13 = i12 - 1;
                if (b11 < -32) {
                    if (i13 == 0) {
                        return b11;
                    }
                    i12 -= 2;
                    if (b11 < -62) {
                        break;
                    }
                    long j14 = 1 + j12;
                    if (AbstractC6804g1.m34878u(bArr, j12) > -65) {
                        break;
                    }
                    j12 = j14;
                } else if (b11 < -16) {
                    if (i13 < 2) {
                        return m34973g(bArr, b11, j12, i13);
                    }
                    i12 -= 3;
                    long j15 = 1 + j12;
                    byte m34878u = AbstractC6804g1.m34878u(bArr, j12);
                    if (m34878u > -65 || ((b11 == -32 && m34878u < -96) || (b11 == -19 && m34878u >= -96))) {
                        break;
                    }
                    j12 += 2;
                    if (AbstractC6804g1.m34878u(bArr, j15) > -65) {
                        break;
                    }
                } else {
                    if (i13 < 3) {
                        return m34973g(bArr, b11, j12, i13);
                    }
                    i12 -= 4;
                    long j16 = 1 + j12;
                    byte m34878u2 = AbstractC6804g1.m34878u(bArr, j12);
                    if (m34878u2 > -65 || (((b11 << 28) + (m34878u2 + 112)) >> 30) != 0) {
                        break;
                    }
                    long j17 = 2 + j12;
                    if (AbstractC6804g1.m34878u(bArr, j16) > -65) {
                        break;
                    }
                    j12 += 3;
                    if (AbstractC6804g1.m34878u(bArr, j17) > -65) {
                        break;
                    }
                }
            }
            return -1;
        }

        /* renamed from: f */
        private static int m34972f(byte[] bArr, long j11, int i11) {
            int i12 = 0;
            if (i11 < 16) {
                return 0;
            }
            while (i12 < i11) {
                long j12 = 1 + j11;
                if (AbstractC6804g1.m34878u(bArr, j11) < 0) {
                    return i12;
                }
                i12++;
                j11 = j12;
            }
            return i11;
        }

        /* renamed from: g */
        private static int m34973g(byte[] bArr, int i11, long j11, int i12) {
            if (i12 == 0) {
                return AbstractC6807h1.m34959h(i11);
            }
            if (i12 == 1) {
                return AbstractC6807h1.m34960i(i11, AbstractC6804g1.m34878u(bArr, j11));
            }
            if (i12 == 2) {
                return AbstractC6807h1.m34961j(i11, AbstractC6804g1.m34878u(bArr, j11), AbstractC6804g1.m34878u(bArr, j11 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.AbstractC6807h1.a
        /* renamed from: a */
        int mo34965a(CharSequence charSequence, byte[] bArr, int i11, int i12) {
            long j11;
            String str;
            String str2;
            int i13;
            long j12;
            long j13;
            char charAt;
            long j14 = i11;
            long j15 = i12 + j14;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length <= i12 && bArr.length - i12 >= i11) {
                int i14 = 0;
                while (true) {
                    j11 = 1;
                    if (i14 >= length || (charAt = charSequence.charAt(i14)) >= 128) {
                        break;
                    }
                    AbstractC6804g1.m34848K(bArr, j14, (byte) charAt);
                    i14++;
                    j14 = 1 + j14;
                }
                if (i14 == length) {
                    return (int) j14;
                }
                while (i14 < length) {
                    char charAt2 = charSequence.charAt(i14);
                    if (charAt2 < 128 && j14 < j15) {
                        AbstractC6804g1.m34848K(bArr, j14, (byte) charAt2);
                        j13 = j15;
                        str2 = str4;
                        j12 = j11;
                        j14 += j11;
                        str = str3;
                    } else {
                        if (charAt2 < 2048 && j14 <= j15 - 2) {
                            str = str3;
                            str2 = str4;
                            long j16 = j14 + j11;
                            AbstractC6804g1.m34848K(bArr, j14, (byte) ((charAt2 >>> 6) | 960));
                            j14 += 2;
                            AbstractC6804g1.m34848K(bArr, j16, (byte) ((charAt2 & '?') | 128));
                        } else {
                            str = str3;
                            str2 = str4;
                            if ((charAt2 < 55296 || 57343 < charAt2) && j14 <= j15 - 3) {
                                AbstractC6804g1.m34848K(bArr, j14, (byte) ((charAt2 >>> '\f') | 480));
                                long j17 = j14 + 2;
                                AbstractC6804g1.m34848K(bArr, j14 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                                j14 += 3;
                                AbstractC6804g1.m34848K(bArr, j17, (byte) ((charAt2 & '?') | 128));
                            } else {
                                if (j14 <= j15 - 4) {
                                    int i15 = i14 + 1;
                                    if (i15 != length) {
                                        char charAt3 = charSequence.charAt(i15);
                                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                                            j12 = 1;
                                            AbstractC6804g1.m34848K(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                            j13 = j15;
                                            AbstractC6804g1.m34848K(bArr, j14 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j18 = j14 + 3;
                                            AbstractC6804g1.m34848K(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                            j14 += 4;
                                            AbstractC6804g1.m34848K(bArr, j18, (byte) ((codePoint & 63) | 128));
                                            i14 = i15;
                                        } else {
                                            i14 = i15;
                                        }
                                    }
                                    throw new c(i14 - 1, length);
                                }
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i13)))) {
                                    throw new c(i14, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j14);
                            }
                        }
                        j13 = j15;
                        j12 = 1;
                    }
                    i14++;
                    str3 = str;
                    str4 = str2;
                    j11 = j12;
                    j15 = j13;
                }
                return (int) j14;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i11 + i12));
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:            if (com.google.protobuf.AbstractC6804g1.m34878u(r13, r2) > (-65)) goto L38;     */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:            if (com.google.protobuf.AbstractC6804g1.m34878u(r13, r2) > (-65)) goto L59;     */
        @Override // com.google.protobuf.AbstractC6807h1.a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo34967c(int i11, byte[] bArr, int i12, int i13) {
            long j11;
            byte b11 = 0;
            if ((i12 | i13 | (bArr.length - i13)) >= 0) {
                long j12 = i12;
                long j13 = i13;
                if (i11 != 0) {
                    if (j12 >= j13) {
                        return i11;
                    }
                    byte b12 = (byte) i11;
                    if (b12 < -32) {
                        if (b12 >= -62) {
                            long j14 = 1 + j12;
                            if (AbstractC6804g1.m34878u(bArr, j12) <= -65) {
                                j12 = j14;
                            }
                        }
                        return -1;
                    }
                    if (b12 < -16) {
                        byte b13 = (byte) (~(i11 >> 8));
                        if (b13 == 0) {
                            long j15 = j12 + 1;
                            b13 = AbstractC6804g1.m34878u(bArr, j12);
                            if (j15 >= j13) {
                                return AbstractC6807h1.m34960i(b12, b13);
                            }
                            j12 = j15;
                        }
                        if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                            j11 = j12 + 1;
                        }
                        return -1;
                    }
                    byte b14 = (byte) (~(i11 >> 8));
                    if (b14 == 0) {
                        long j16 = j12 + 1;
                        b14 = AbstractC6804g1.m34878u(bArr, j12);
                        if (j16 >= j13) {
                            return AbstractC6807h1.m34960i(b12, b14);
                        }
                        j12 = j16;
                    } else {
                        b11 = (byte) (i11 >> 16);
                    }
                    if (b11 == 0) {
                        long j17 = j12 + 1;
                        b11 = AbstractC6804g1.m34878u(bArr, j12);
                        if (j17 >= j13) {
                            return AbstractC6807h1.m34961j(b12, b14, b11);
                        }
                        j12 = j17;
                    }
                    if (b14 <= -65 && (((b12 << 28) + (b14 + 112)) >> 30) == 0 && b11 <= -65) {
                        j11 = j12 + 1;
                    }
                    return -1;
                    j12 = j11;
                }
                return m34971e(bArr, j12, (int) (j13 - j12));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
    }

    static {
        a bVar;
        if (d.m34970d() && !AbstractC6793d.m34762c()) {
            bVar = new d();
        } else {
            bVar = new b();
        }
        f37313a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m34956e(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return f37313a.mo34965a(charSequence, bArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m34957f(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 < length) {
                char charAt = charSequence.charAt(i11);
                if (charAt < 2048) {
                    i12 += (127 - charAt) >>> 31;
                    i11++;
                } else {
                    i12 += m34958g(charSequence, i11);
                    break;
                }
            } else {
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    /* renamed from: g */
    private static int m34958g(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i11) >= 65536) {
                        i11++;
                    } else {
                        throw new c(i11, length);
                    }
                }
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m34959h(int i11) {
        if (i11 > -12) {
            return -1;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m34960i(int i11, int i12) {
        if (i11 > -12 || i12 > -65) {
            return -1;
        }
        return i11 ^ (i12 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m34961j(int i11, int i12, int i13) {
        if (i11 > -12 || i12 > -65 || i13 > -65) {
            return -1;
        }
        return (i11 ^ (i12 << 8)) ^ (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m34962k(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return m34961j(b11, bArr[i11], bArr[i11 + 1]);
                }
                throw new AssertionError();
            }
            return m34960i(b11, bArr[i11]);
        }
        return m34959h(b11);
    }

    /* renamed from: l */
    public static boolean m34963l(byte[] bArr) {
        return f37313a.m34966b(bArr, 0, bArr.length);
    }

    /* renamed from: m */
    public static boolean m34964m(byte[] bArr, int i11, int i12) {
        return f37313a.m34966b(bArr, i11, i12);
    }
}
