package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class yb4 {

    /* renamed from: a */
    private final int f30880a;

    /* renamed from: b */
    private final int f30881b;

    /* renamed from: c */
    private final float f30882c;

    /* renamed from: d */
    private final float f30883d;

    /* renamed from: e */
    private final float f30884e;

    /* renamed from: f */
    private final int f30885f;

    /* renamed from: g */
    private final int f30886g;

    /* renamed from: h */
    private final int f30887h;

    /* renamed from: i */
    private final short[] f30888i;

    /* renamed from: j */
    private short[] f30889j;

    /* renamed from: k */
    private int f30890k;

    /* renamed from: l */
    private short[] f30891l;

    /* renamed from: m */
    private int f30892m;

    /* renamed from: n */
    private short[] f30893n;

    /* renamed from: o */
    private int f30894o;

    /* renamed from: p */
    private int f30895p;

    /* renamed from: q */
    private int f30896q;

    /* renamed from: r */
    private int f30897r;

    /* renamed from: s */
    private int f30898s;

    /* renamed from: t */
    private int f30899t;

    /* renamed from: u */
    private int f30900u;

    /* renamed from: v */
    private int f30901v;

    public yb4(int i11, int i12, float f11, float f12, int i13) {
        this.f30880a = i11;
        this.f30881b = i12;
        this.f30882c = f11;
        this.f30883d = f12;
        this.f30884e = i11 / i13;
        this.f30885f = i11 / 400;
        int i14 = i11 / 65;
        this.f30886g = i14;
        int i15 = i14 + i14;
        this.f30887h = i15;
        this.f30888i = new short[i15];
        int i16 = i15 * i12;
        this.f30889j = new short[i16];
        this.f30891l = new short[i16];
        this.f30893n = new short[i16];
    }

    /* renamed from: g */
    private final int m28178g(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f30881b;
        int i15 = 255;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int i19 = 0;
            for (int i21 = 0; i21 < i12; i21++) {
                i19 += Math.abs(sArr[i14 + i21] - sArr[(i14 + i12) + i21]);
            }
            int i22 = i19 * i17;
            int i23 = i16 * i12;
            if (i22 < i23) {
                i16 = i19;
            }
            if (i22 < i23) {
                i17 = i12;
            }
            int i24 = i19 * i15;
            int i25 = i18 * i12;
            if (i24 > i25) {
                i18 = i19;
            }
            if (i24 > i25) {
                i15 = i12;
            }
            i12++;
        }
        this.f30900u = i16 / i17;
        this.f30901v = i18 / i15;
        return i17;
    }

    /* renamed from: h */
    private final void m28179h(short[] sArr, int i11, int i12) {
        short[] m28183l = m28183l(this.f30891l, this.f30892m, i12);
        this.f30891l = m28183l;
        int i13 = this.f30881b;
        System.arraycopy(sArr, i11 * i13, m28183l, this.f30892m * i13, i13 * i12);
        this.f30892m += i12;
    }

    /* renamed from: i */
    private final void m28180i(short[] sArr, int i11, int i12) {
        int i13 = this.f30887h / i12;
        int i14 = this.f30881b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f30888i[i17] = (short) (i18 / i15);
        }
    }

    /* renamed from: j */
    private static void m28181j(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr2[i19] * (i11 - i21)) + (sArr3[i18] * i21)) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    /* renamed from: k */
    private final void m28182k() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z11;
        int i22 = this.f30892m;
        float f11 = this.f30882c;
        float f12 = this.f30883d;
        float f13 = f11 / f12;
        float f14 = this.f30884e * f12;
        double d11 = f13;
        float f15 = 1.0f;
        int i23 = 1;
        if (d11 <= 1.00001d && d11 >= 0.99999d) {
            m28179h(this.f30889j, 0, this.f30890k);
            this.f30890k = 0;
        } else {
            int i24 = this.f30890k;
            if (i24 >= this.f30887h) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f30897r;
                    if (i26 > 0) {
                        int min = Math.min(this.f30887h, i26);
                        m28179h(this.f30889j, i25, min);
                        this.f30897r -= min;
                        i25 += min;
                    } else {
                        short[] sArr = this.f30889j;
                        int i27 = this.f30880a;
                        if (i27 > 4000) {
                            i11 = i27 / 4000;
                        } else {
                            i11 = 1;
                        }
                        if (this.f30881b == i23 && i11 == i23) {
                            i12 = m28178g(sArr, i25, this.f30885f, this.f30886g);
                        } else {
                            m28180i(sArr, i25, i11);
                            int m28178g = m28178g(this.f30888i, 0, this.f30885f / i11, this.f30886g / i11);
                            if (i11 != i23) {
                                int i28 = m28178g * i11;
                                int i29 = i11 * 4;
                                int i31 = i28 - i29;
                                int i32 = i28 + i29;
                                int i33 = this.f30885f;
                                if (i31 < i33) {
                                    i31 = i33;
                                }
                                int i34 = this.f30886g;
                                if (i32 > i34) {
                                    i32 = i34;
                                }
                                if (this.f30881b == i23) {
                                    i12 = m28178g(sArr, i25, i31, i32);
                                } else {
                                    m28180i(sArr, i25, i23);
                                    i12 = m28178g(this.f30888i, 0, i31, i32);
                                }
                            } else {
                                i12 = m28178g;
                            }
                        }
                        int i35 = this.f30900u;
                        int i36 = this.f30901v;
                        if (i35 != 0 && (i16 = this.f30898s) != 0 && i36 <= i35 * 3 && i35 + i35 > this.f30899t * 3) {
                            i13 = i16;
                        } else {
                            i13 = i12;
                        }
                        this.f30899t = i35;
                        this.f30898s = i12;
                        if (d11 > 1.0d) {
                            short[] sArr2 = this.f30889j;
                            if (f13 >= 2.0f) {
                                i15 = (int) (i13 / ((-1.0f) + f13));
                            } else {
                                this.f30897r = (int) ((i13 * (2.0f - f13)) / ((-1.0f) + f13));
                                i15 = i13;
                            }
                            short[] m28183l = m28183l(this.f30891l, this.f30892m, i15);
                            this.f30891l = m28183l;
                            int i37 = i15;
                            m28181j(i15, this.f30881b, m28183l, this.f30892m, sArr2, i25, sArr2, i25 + i13);
                            this.f30892m += i37;
                            i25 += i13 + i37;
                        } else {
                            int i38 = i13;
                            short[] sArr3 = this.f30889j;
                            if (f13 < 0.5f) {
                                i14 = (int) ((i38 * f13) / (f15 - f13));
                            } else {
                                this.f30897r = (int) ((i38 * ((f13 + f13) - 1.0f)) / (f15 - f13));
                                i14 = i38;
                            }
                            int i39 = i38 + i14;
                            short[] m28183l2 = m28183l(this.f30891l, this.f30892m, i39);
                            this.f30891l = m28183l2;
                            int i41 = this.f30881b;
                            System.arraycopy(sArr3, i25 * i41, m28183l2, this.f30892m * i41, i41 * i38);
                            m28181j(i14, this.f30881b, this.f30891l, this.f30892m + i38, sArr3, i25 + i38, sArr3, i25);
                            this.f30892m += i39;
                            i25 += i14;
                        }
                    }
                    if (this.f30887h + i25 > i24) {
                        break;
                    }
                    f15 = 1.0f;
                    i23 = 1;
                }
                int i42 = this.f30890k - i25;
                short[] sArr4 = this.f30889j;
                int i43 = this.f30881b;
                System.arraycopy(sArr4, i25 * i43, sArr4, 0, i43 * i42);
                this.f30890k = i42;
                f15 = 1.0f;
            }
        }
        if (f14 != f15 && this.f30892m != i22) {
            int i44 = this.f30880a;
            int i45 = (int) (i44 / f14);
            while (true) {
                if (i45 <= 16384 && i44 <= 16384) {
                    break;
                }
                i45 /= 2;
                i44 /= 2;
            }
            int i46 = this.f30892m - i22;
            short[] m28183l3 = m28183l(this.f30893n, this.f30894o, i46);
            this.f30893n = m28183l3;
            short[] sArr5 = this.f30891l;
            int i47 = this.f30881b;
            System.arraycopy(sArr5, i22 * i47, m28183l3, this.f30894o * i47, i47 * i46);
            this.f30892m = i22;
            this.f30894o += i46;
            int i48 = 0;
            while (true) {
                i17 = this.f30894o;
                i18 = i17 - 1;
                if (i48 >= i18) {
                    break;
                }
                while (true) {
                    i19 = this.f30895p + 1;
                    i21 = this.f30896q;
                    if (i19 * i45 <= i21 * i44) {
                        break;
                    }
                    this.f30891l = m28183l(this.f30891l, this.f30892m, 1);
                    int i49 = 0;
                    while (true) {
                        int i51 = this.f30881b;
                        if (i49 < i51) {
                            short[] sArr6 = this.f30891l;
                            int i52 = this.f30892m;
                            short[] sArr7 = this.f30893n;
                            int i53 = (i48 * i51) + i49;
                            short s7 = sArr7[i53];
                            short s11 = sArr7[i53 + i51];
                            int i54 = this.f30896q;
                            int i55 = this.f30895p;
                            int i56 = (i55 + 1) * i45;
                            int i57 = i56 - (i54 * i44);
                            int i58 = i56 - (i55 * i45);
                            sArr6[(i52 * i51) + i49] = (short) (((s7 * i57) + ((i58 - i57) * s11)) / i58);
                            i49++;
                        }
                    }
                    this.f30896q++;
                    this.f30892m++;
                }
                this.f30895p = i19;
                if (i19 == i44) {
                    this.f30895p = 0;
                    if (i21 == i45) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v71.m27175f(z11);
                    this.f30896q = 0;
                }
                i48++;
            }
            if (i18 != 0) {
                short[] sArr8 = this.f30893n;
                int i59 = this.f30881b;
                System.arraycopy(sArr8, i18 * i59, sArr8, 0, (i17 - i18) * i59);
                this.f30894o -= i18;
            }
        }
    }

    /* renamed from: l */
    private final short[] m28183l(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f30881b;
        int i14 = length / i13;
        if (i11 + i12 <= i14) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    /* renamed from: a */
    public final int m28184a() {
        int i11 = this.f30892m * this.f30881b;
        return i11 + i11;
    }

    /* renamed from: b */
    public final int m28185b() {
        int i11 = this.f30890k * this.f30881b;
        return i11 + i11;
    }

    /* renamed from: c */
    public final void m28186c() {
        this.f30890k = 0;
        this.f30892m = 0;
        this.f30894o = 0;
        this.f30895p = 0;
        this.f30896q = 0;
        this.f30897r = 0;
        this.f30898s = 0;
        this.f30899t = 0;
        this.f30900u = 0;
        this.f30901v = 0;
    }

    /* renamed from: d */
    public final void m28187d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f30881b, this.f30892m);
        shortBuffer.put(this.f30891l, 0, this.f30881b * min);
        int i11 = this.f30892m - min;
        this.f30892m = i11;
        short[] sArr = this.f30891l;
        int i12 = this.f30881b;
        System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
    }

    /* renamed from: e */
    public final void m28188e() {
        int i11;
        int i12 = this.f30890k;
        float f11 = this.f30882c;
        float f12 = this.f30883d;
        int i13 = this.f30892m + ((int) ((((i12 / (f11 / f12)) + this.f30894o) / (this.f30884e * f12)) + 0.5f));
        short[] sArr = this.f30889j;
        int i14 = this.f30887h;
        this.f30889j = m28183l(sArr, i12, i14 + i14 + i12);
        int i15 = 0;
        while (true) {
            int i16 = this.f30887h;
            i11 = i16 + i16;
            int i17 = this.f30881b;
            if (i15 >= i11 * i17) {
                break;
            }
            this.f30889j[(i17 * i12) + i15] = 0;
            i15++;
        }
        this.f30890k += i11;
        m28182k();
        if (this.f30892m > i13) {
            this.f30892m = i13;
        }
        this.f30890k = 0;
        this.f30897r = 0;
        this.f30894o = 0;
    }

    /* renamed from: f */
    public final void m28189f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i11 = this.f30881b;
        int i12 = remaining / i11;
        int i13 = i11 * i12;
        short[] m28183l = m28183l(this.f30889j, this.f30890k, i12);
        this.f30889j = m28183l;
        shortBuffer.get(m28183l, this.f30890k * this.f30881b, (i13 + i13) / 2);
        this.f30890k += i12;
        m28182k();
    }
}
