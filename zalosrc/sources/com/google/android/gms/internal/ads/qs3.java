package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class qs3 {
    /* renamed from: a */
    public static byte[] m25870a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            int i11 = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i12 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i12;
            copyOf[31] = (byte) (i12 | 64);
            byte[][] bArr3 = lr3.f24033a;
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                for (int i13 = 0; i13 < 7; i13++) {
                    byte[][] bArr4 = lr3.f24033a;
                    if (jr3.m23727b(bArr4[i13], copyOf2)) {
                        throw new InvalidKeyException("Banned public key: ".concat(fs3.m22159a(bArr4[i13])));
                    }
                }
                long[] m21802k = es3.m21802k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(m21802k, 0, jArr2, 0, 10);
                while (i11 < 32) {
                    int i14 = copyOf[31 - i11] & 255;
                    int i15 = 0;
                    while (i15 < 8) {
                        int i16 = (i14 >> (7 - i15)) & 1;
                        lr3.m24362a(jArr4, jArr2, i16);
                        lr3.m24362a(jArr5, jArr3, i16);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        int i17 = i14;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i18 = i11;
                        long[] jArr13 = new long[19];
                        int i19 = i15;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        es3.m21800i(jArr4, jArr4, jArr5);
                        es3.m21799h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        es3.m21800i(jArr2, jArr2, jArr3);
                        es3.m21799h(jArr3, copyOf4, jArr3);
                        es3.m21793b(jArr14, jArr2, jArr5);
                        es3.m21793b(jArr15, jArr4, jArr3);
                        es3.m21796e(jArr14);
                        es3.m21795d(jArr14);
                        es3.m21796e(jArr15);
                        es3.m21795d(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        es3.m21800i(jArr14, jArr14, jArr15);
                        es3.m21799h(jArr15, copyOf4, jArr15);
                        es3.m21798g(jArr18, jArr14);
                        es3.m21798g(jArr17, jArr15);
                        es3.m21793b(jArr15, jArr17, m21802k);
                        es3.m21796e(jArr15);
                        es3.m21795d(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        es3.m21798g(jArr12, jArr4);
                        es3.m21798g(jArr13, jArr5);
                        es3.m21793b(jArr8, jArr12, jArr13);
                        es3.m21796e(jArr8);
                        es3.m21795d(jArr8);
                        es3.m21799h(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        es3.m21797f(jArr10, jArr13, 121665L);
                        es3.m21795d(jArr10);
                        es3.m21800i(jArr10, jArr10, jArr12);
                        es3.m21793b(jArr16, jArr13, jArr10);
                        es3.m21796e(jArr16);
                        es3.m21795d(jArr16);
                        lr3.m24362a(jArr8, jArr6, i16);
                        lr3.m24362a(jArr16, jArr7, i16);
                        i15 = i19 + 1;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        i14 = i17;
                        jArr = jArr11;
                        i11 = i18;
                        jArr6 = jArr19;
                        jArr5 = jArr16;
                        copyOf = bArr5;
                        long[] jArr20 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr20;
                        long[] jArr21 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr21;
                    }
                    i11++;
                    copyOf = copyOf;
                }
                long[] jArr22 = jArr;
                long[] jArr23 = new long[10];
                long[] jArr24 = new long[10];
                long[] jArr25 = new long[10];
                long[] jArr26 = new long[10];
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = jArr2;
                long[] jArr34 = new long[10];
                es3.m21798g(jArr24, jArr5);
                es3.m21798g(jArr34, jArr24);
                es3.m21798g(jArr32, jArr34);
                es3.m21792a(jArr25, jArr32, jArr5);
                es3.m21792a(jArr26, jArr25, jArr24);
                es3.m21798g(jArr32, jArr26);
                es3.m21792a(jArr27, jArr32, jArr25);
                es3.m21798g(jArr32, jArr27);
                es3.m21798g(jArr34, jArr32);
                es3.m21798g(jArr32, jArr34);
                es3.m21798g(jArr34, jArr32);
                es3.m21798g(jArr32, jArr34);
                es3.m21792a(jArr28, jArr32, jArr27);
                es3.m21798g(jArr32, jArr28);
                es3.m21798g(jArr34, jArr32);
                int i21 = 2;
                for (int i22 = 10; i21 < i22; i22 = 10) {
                    es3.m21798g(jArr32, jArr34);
                    es3.m21798g(jArr34, jArr32);
                    i21 += 2;
                }
                es3.m21792a(jArr29, jArr34, jArr28);
                es3.m21798g(jArr32, jArr29);
                es3.m21798g(jArr34, jArr32);
                for (int i23 = 2; i23 < 20; i23 += 2) {
                    es3.m21798g(jArr32, jArr34);
                    es3.m21798g(jArr34, jArr32);
                }
                es3.m21792a(jArr32, jArr34, jArr29);
                es3.m21798g(jArr34, jArr32);
                es3.m21798g(jArr32, jArr34);
                int i24 = 2;
                for (int i25 = 10; i24 < i25; i25 = 10) {
                    es3.m21798g(jArr34, jArr32);
                    es3.m21798g(jArr32, jArr34);
                    i24 += 2;
                }
                es3.m21792a(jArr30, jArr32, jArr28);
                es3.m21798g(jArr32, jArr30);
                es3.m21798g(jArr34, jArr32);
                for (int i26 = 2; i26 < 50; i26 += 2) {
                    es3.m21798g(jArr32, jArr34);
                    es3.m21798g(jArr34, jArr32);
                }
                es3.m21792a(jArr31, jArr34, jArr30);
                es3.m21798g(jArr34, jArr31);
                es3.m21798g(jArr32, jArr34);
                for (int i27 = 2; i27 < 100; i27 += 2) {
                    es3.m21798g(jArr34, jArr32);
                    es3.m21798g(jArr32, jArr34);
                }
                es3.m21792a(jArr34, jArr32, jArr31);
                es3.m21798g(jArr32, jArr34);
                es3.m21798g(jArr34, jArr32);
                for (int i28 = 2; i28 < 50; i28 += 2) {
                    es3.m21798g(jArr32, jArr34);
                    es3.m21798g(jArr34, jArr32);
                }
                es3.m21792a(jArr32, jArr34, jArr30);
                es3.m21798g(jArr34, jArr32);
                es3.m21798g(jArr32, jArr34);
                es3.m21798g(jArr34, jArr32);
                es3.m21798g(jArr32, jArr34);
                es3.m21798g(jArr34, jArr32);
                es3.m21792a(jArr23, jArr34, jArr26);
                es3.m21792a(jArr22, jArr4, jArr23);
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[11];
                long[] jArr38 = new long[11];
                long[] jArr39 = new long[11];
                es3.m21792a(jArr35, m21802k, jArr22);
                es3.m21800i(jArr36, m21802k, jArr22);
                long[] jArr40 = new long[10];
                jArr40[0] = 486662;
                es3.m21800i(jArr38, jArr36, jArr40);
                es3.m21792a(jArr38, jArr38, jArr3);
                es3.m21800i(jArr38, jArr38, jArr33);
                es3.m21792a(jArr38, jArr38, jArr35);
                es3.m21792a(jArr38, jArr38, jArr33);
                es3.m21797f(jArr37, jArr38, 4L);
                es3.m21795d(jArr37);
                es3.m21792a(jArr38, jArr35, jArr3);
                es3.m21799h(jArr38, jArr38, jArr3);
                es3.m21792a(jArr39, jArr36, jArr33);
                es3.m21800i(jArr38, jArr38, jArr39);
                es3.m21798g(jArr38, jArr38);
                if (jr3.m23727b(es3.m21801j(jArr37), es3.m21801j(jArr38))) {
                    return es3.m21801j(jArr22);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(fs3.m22159a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m25871b() {
        byte[] m24706a = ms3.m24706a(32);
        m24706a[0] = (byte) (m24706a[0] | 7);
        int i11 = m24706a[31] & 63;
        m24706a[31] = (byte) i11;
        m24706a[31] = (byte) (i11 | 128);
        return m24706a;
    }

    /* renamed from: c */
    public static byte[] m25872c(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m25870a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
