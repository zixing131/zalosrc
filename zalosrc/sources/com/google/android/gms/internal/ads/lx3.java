package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class lx3 extends kx3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:            if (r13[r14] <= (-65)) goto L11;     */
    @Override // com.google.android.gms.internal.ads.kx3
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo24084a(int i11, byte[] bArr, int i12, int i13) {
        int i14;
        int i15;
        int m25042l;
        int m25041k;
        int m25041k2;
        if (i11 != 0) {
            if (i12 >= i13) {
                return i11;
            }
            byte b11 = (byte) i11;
            if (b11 < -32) {
                if (b11 >= -62) {
                    i15 = i12 + 1;
                }
                return -1;
            }
            if (b11 < -16) {
                byte b12 = (byte) (~(i11 >> 8));
                if (b12 == 0) {
                    int i16 = i12 + 1;
                    byte b13 = bArr[i12];
                    if (i16 >= i13) {
                        m25041k2 = nx3.m25041k(b11, b13);
                        return m25041k2;
                    }
                    i12 = i16;
                    b12 = b13;
                }
                if (b12 <= -65 && ((b11 != -32 || b12 >= -96) && (b11 != -19 || b12 < -96))) {
                    i15 = i12 + 1;
                }
                return -1;
            }
            byte b14 = (byte) (~(i11 >> 8));
            if (b14 == 0) {
                int i17 = i12 + 1;
                b14 = bArr[i12];
                if (i17 >= i13) {
                    m25041k = nx3.m25041k(b11, b14);
                    return m25041k;
                }
                i12 = i17;
                i14 = 0;
            } else {
                i14 = i11 >> 16;
            }
            if (i14 == 0) {
                int i18 = i12 + 1;
                byte b15 = bArr[i12];
                if (i18 >= i13) {
                    m25042l = nx3.m25042l(b11, b14, b15);
                    return m25042l;
                }
                i12 = i18;
                i14 = b15;
            }
            if (b14 <= -65 && (((b11 << 28) + (b14 + 112)) >> 30) == 0 && i14 <= -65) {
                i15 = i12 + 1;
            }
            return -1;
            i12 = i15;
        }
        while (i12 < i13 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i13) {
            return 0;
        }
        while (i12 < i13) {
            int i19 = i12 + 1;
            byte b16 = bArr[i12];
            if (b16 < 0) {
                if (b16 < -32) {
                    if (i19 < i13) {
                        if (b16 >= -62) {
                            i12 += 2;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b16;
                }
                if (b16 < -16) {
                    if (i19 >= i13 - 1) {
                        return nx3.m25033c(bArr, i19, i13);
                    }
                    int i21 = i12 + 2;
                    byte b17 = bArr[i19];
                    if (b17 <= -65 && ((b16 != -32 || b17 >= -96) && (b16 != -19 || b17 < -96))) {
                        i12 += 3;
                        if (bArr[i21] > -65) {
                        }
                    }
                    return -1;
                }
                if (i19 >= i13 - 2) {
                    return nx3.m25033c(bArr, i19, i13);
                }
                int i22 = i12 + 2;
                byte b18 = bArr[i19];
                if (b18 <= -65 && (((b16 << 28) + (b18 + 112)) >> 30) == 0) {
                    int i23 = i12 + 3;
                    if (bArr[i22] <= -65) {
                        i12 += 4;
                        if (bArr[i23] > -65) {
                        }
                    }
                }
                return -1;
            }
            i12 = i19;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.kx3
    /* renamed from: b */
    public final String mo24085b(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        if ((i11 | i12 | ((length - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!jx3.m23775d(b11)) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b11;
                i14++;
            }
            while (i11 < i13) {
                int i15 = i11 + 1;
                byte b12 = bArr[i11];
                if (jx3.m23775d(b12)) {
                    cArr[i14] = (char) b12;
                    i14++;
                    i11 = i15;
                    while (i11 < i13) {
                        byte b13 = bArr[i11];
                        if (!jx3.m23775d(b13)) {
                            break;
                        }
                        i11++;
                        cArr[i14] = (char) b13;
                        i14++;
                    }
                } else if (jx3.m23777f(b12)) {
                    if (i15 < i13) {
                        i11 += 2;
                        jx3.m23774c(b12, bArr[i15], cArr, i14);
                        i14++;
                    } else {
                        throw zzgrq.m28820d();
                    }
                } else if (jx3.m23776e(b12)) {
                    if (i15 < i13 - 1) {
                        int i16 = i11 + 2;
                        i11 += 3;
                        jx3.m23773b(b12, bArr[i15], bArr[i16], cArr, i14);
                        i14++;
                    } else {
                        throw zzgrq.m28820d();
                    }
                } else if (i15 < i13 - 2) {
                    int i17 = i11 + 2;
                    int i18 = i11 + 3;
                    i11 += 4;
                    jx3.m23772a(b12, bArr[i15], bArr[i17], bArr[i18], cArr, i14);
                    i14 += 2;
                } else {
                    throw zzgrq.m28820d();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(i12)));
    }
}
