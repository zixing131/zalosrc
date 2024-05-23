package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zg4 {

    /* renamed from: a */
    private final Random f31502a;

    /* renamed from: b */
    private final int[] f31503b;

    /* renamed from: c */
    private final int[] f31504c;

    public zg4(int i11) {
        this(0, new Random());
    }

    /* renamed from: a */
    public final int m28502a() {
        int[] iArr = this.f31503b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int m28503b() {
        int[] iArr = this.f31503b;
        int length = iArr.length;
        if (length <= 0) {
            return -1;
        }
        return iArr[length - 1];
    }

    /* renamed from: c */
    public final int m28504c() {
        return this.f31503b.length;
    }

    /* renamed from: d */
    public final int m28505d(int i11) {
        int i12 = this.f31504c[i11] + 1;
        int[] iArr = this.f31503b;
        if (i12 < iArr.length) {
            return iArr[i12];
        }
        return -1;
    }

    /* renamed from: e */
    public final int m28506e(int i11) {
        int i12 = this.f31504c[i11] - 1;
        if (i12 < 0) {
            return -1;
        }
        return this.f31503b[i12];
    }

    /* renamed from: f */
    public final zg4 m28507f() {
        return new zg4(0, new Random(this.f31502a.nextLong()));
    }

    /* renamed from: g */
    public final zg4 m28508g(int i11, int i12) {
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            iArr[i14] = this.f31502a.nextInt(this.f31503b.length + 1);
            int i15 = i14 + 1;
            int nextInt = this.f31502a.nextInt(i15);
            iArr2[i14] = iArr2[nextInt];
            iArr2[nextInt] = i14;
            i14 = i15;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f31503b.length + i12];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr4 = this.f31503b;
            if (i13 < iArr4.length + i12) {
                if (i16 < i12 && i17 == iArr[i16]) {
                    iArr3[i13] = iArr2[i16];
                    i16++;
                } else {
                    int i18 = i17 + 1;
                    int i19 = iArr4[i17];
                    iArr3[i13] = i19;
                    if (i19 >= 0) {
                        iArr3[i13] = i19 + i12;
                    }
                    i17 = i18;
                }
                i13++;
            } else {
                return new zg4(iArr3, new Random(this.f31502a.nextLong()));
            }
        }
    }

    /* renamed from: h */
    public final zg4 m28509h(int i11, int i12) {
        int[] iArr = new int[this.f31503b.length - i12];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr2 = this.f31503b;
            if (i13 < iArr2.length) {
                int i15 = iArr2[i13];
                if (i15 >= 0 && i15 < i12) {
                    i14++;
                } else {
                    int i16 = i13 - i14;
                    if (i15 >= 0) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                }
                i13++;
            } else {
                return new zg4(iArr, new Random(this.f31502a.nextLong()));
            }
        }
    }

    private zg4(int i11, Random random) {
        this(new int[0], random);
    }

    private zg4(int[] iArr, Random random) {
        this.f31503b = iArr;
        this.f31502a = random;
        this.f31504c = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f31504c[iArr[i11]] = i11;
        }
    }
}
