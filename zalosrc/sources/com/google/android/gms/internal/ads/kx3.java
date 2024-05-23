package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class kx3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static final String m24083d(ByteBuffer byteBuffer, int i11, int i12) {
        if ((i11 | i12 | ((byteBuffer.limit() - i11) - i12)) >= 0) {
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = byteBuffer.get(i11);
                if (!jx3.m23775d(b11)) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b11;
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = byteBuffer.get(i11);
                if (jx3.m23775d(b12)) {
                    cArr[i15] = (char) b12;
                    i15++;
                    i11 = i16;
                    while (i11 < i13) {
                        byte b13 = byteBuffer.get(i11);
                        if (!jx3.m23775d(b13)) {
                            break;
                        }
                        i11++;
                        cArr[i15] = (char) b13;
                        i15++;
                    }
                } else if (jx3.m23777f(b12)) {
                    if (i16 < i13) {
                        i11 += 2;
                        jx3.m23774c(b12, byteBuffer.get(i16), cArr, i15);
                        i15++;
                    } else {
                        throw zzgrq.m28820d();
                    }
                } else if (jx3.m23776e(b12)) {
                    if (i16 < i13 - 1) {
                        int i17 = i11 + 2;
                        i11 += 3;
                        jx3.m23773b(b12, byteBuffer.get(i16), byteBuffer.get(i17), cArr, i15);
                        i15++;
                    } else {
                        throw zzgrq.m28820d();
                    }
                } else if (i16 < i13 - 2) {
                    int i18 = i11 + 2;
                    int i19 = i11 + 3;
                    i11 += 4;
                    jx3.m23772a(b12, byteBuffer.get(i16), byteBuffer.get(i18), byteBuffer.get(i19), cArr, i15);
                    i15 += 2;
                } else {
                    throw zzgrq.m28820d();
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo24084a(int i11, byte[] bArr, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo24085b(byte[] bArr, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m24086c(byte[] bArr, int i11, int i12) {
        if (mo24084a(0, bArr, i11, i12) != 0) {
            return false;
        }
        return true;
    }
}
