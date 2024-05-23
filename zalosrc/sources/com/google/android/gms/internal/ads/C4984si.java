package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.si */
/* loaded from: classes2.dex */
final class C4984si {

    /* renamed from: a */
    private final int f27679a;

    /* renamed from: b */
    private final int f27680b;

    /* renamed from: c */
    private final int f27681c;

    /* renamed from: d */
    private final int f27682d;

    /* renamed from: e */
    private final int f27683e;

    /* renamed from: f */
    private final short[] f27684f;

    /* renamed from: g */
    private int f27685g;

    /* renamed from: h */
    private short[] f27686h;

    /* renamed from: i */
    private int f27687i;

    /* renamed from: j */
    private short[] f27688j;

    /* renamed from: k */
    private int f27689k;

    /* renamed from: l */
    private short[] f27690l;

    /* renamed from: q */
    private int f27695q;

    /* renamed from: r */
    private int f27696r;

    /* renamed from: s */
    private int f27697s;

    /* renamed from: t */
    private int f27698t;

    /* renamed from: v */
    private int f27700v;

    /* renamed from: w */
    private int f27701w;

    /* renamed from: x */
    private int f27702x;

    /* renamed from: m */
    private int f27691m = 0;

    /* renamed from: n */
    private int f27692n = 0;

    /* renamed from: u */
    private int f27699u = 0;

    /* renamed from: o */
    private float f27693o = 1.0f;

    /* renamed from: p */
    private float f27694p = 1.0f;

    public C4984si(int i11, int i12) {
        this.f27679a = i11;
        this.f27680b = i12;
        this.f27681c = i11 / 400;
        int i13 = i11 / 65;
        this.f27682d = i13;
        int i14 = i13 + i13;
        this.f27683e = i14;
        this.f27684f = new short[i14];
        this.f27685g = i14;
        int i15 = i12 * i14;
        this.f27686h = new short[i15];
        this.f27687i = i14;
        this.f27688j = new short[i15];
        this.f27689k = i14;
        this.f27690l = new short[i15];
    }

    /* renamed from: g */
    private final int m26311g(short[] sArr, int i11, int i12, int i13) {
        int i14;
        int i15 = i11 * this.f27680b;
        int i16 = 255;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        while (i12 <= i13) {
            int i21 = 0;
            for (int i22 = 0; i22 < i12; i22++) {
                short s7 = sArr[i15 + i22];
                short s11 = sArr[i15 + i12 + i22];
                if (s7 >= s11) {
                    i14 = s7 - s11;
                } else {
                    i14 = s11 - s7;
                }
                i21 += i14;
            }
            int i23 = i21 * i18;
            int i24 = i17 * i12;
            if (i23 < i24) {
                i17 = i21;
            }
            if (i23 < i24) {
                i18 = i12;
            }
            int i25 = i21 * i16;
            int i26 = i19 * i12;
            if (i25 > i26) {
                i19 = i21;
            }
            if (i25 > i26) {
                i16 = i12;
            }
            i12++;
        }
        this.f27701w = i17 / i18;
        this.f27702x = i19 / i16;
        return i18;
    }

    /* renamed from: h */
    private final void m26312h(short[] sArr, int i11, int i12) {
        m26315k(i12);
        int i13 = this.f27680b;
        System.arraycopy(sArr, i11 * i13, this.f27688j, this.f27696r * i13, i13 * i12);
        this.f27696r += i12;
    }

    /* renamed from: i */
    private final void m26313i(short[] sArr, int i11, int i12) {
        int i13 = this.f27683e / i12;
        int i14 = this.f27680b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f27684f[i17] = (short) (i18 / i15);
        }
    }

    /* renamed from: j */
    private final void m26314j(int i11) {
        int i12 = this.f27695q;
        int i13 = this.f27685g;
        if (i12 + i11 > i13) {
            int i14 = i13 + (i13 / 2) + i11;
            this.f27685g = i14;
            this.f27686h = Arrays.copyOf(this.f27686h, i14 * this.f27680b);
        }
    }

    /* renamed from: k */
    private final void m26315k(int i11) {
        int i12 = this.f27696r;
        int i13 = this.f27687i;
        if (i12 + i11 > i13) {
            int i14 = i13 + (i13 / 2) + i11;
            this.f27687i = i14;
            this.f27688j = Arrays.copyOf(this.f27688j, i14 * this.f27680b);
        }
    }

    /* renamed from: l */
    private static void m26316l(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
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

    /* renamed from: m */
    private final void m26317m() {
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
        int i22 = this.f27696r;
        float f11 = this.f27693o / this.f27694p;
        double d11 = f11;
        int i23 = 1;
        if (d11 <= 1.00001d && d11 >= 0.99999d) {
            m26312h(this.f27686h, 0, this.f27695q);
            this.f27695q = 0;
        } else {
            int i24 = this.f27695q;
            if (i24 >= this.f27683e) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f27698t;
                    if (i26 > 0) {
                        int min = Math.min(this.f27683e, i26);
                        m26312h(this.f27686h, i25, min);
                        this.f27698t -= min;
                        i25 += min;
                    } else {
                        short[] sArr = this.f27686h;
                        int i27 = this.f27679a;
                        if (i27 > 4000) {
                            i11 = i27 / 4000;
                        } else {
                            i11 = 1;
                        }
                        if (this.f27680b == i23 && i11 == i23) {
                            i12 = m26311g(sArr, i25, this.f27681c, this.f27682d);
                        } else {
                            m26313i(sArr, i25, i11);
                            int m26311g = m26311g(this.f27684f, 0, this.f27681c / i11, this.f27682d / i11);
                            if (i11 != i23) {
                                int i28 = m26311g * i11;
                                int i29 = i11 * 4;
                                int i31 = i28 - i29;
                                int i32 = i28 + i29;
                                int i33 = this.f27681c;
                                if (i31 < i33) {
                                    i31 = i33;
                                }
                                int i34 = this.f27682d;
                                if (i32 > i34) {
                                    i32 = i34;
                                }
                                if (this.f27680b == i23) {
                                    i12 = m26311g(sArr, i25, i31, i32);
                                } else {
                                    m26313i(sArr, i25, i23);
                                    i12 = m26311g(this.f27684f, 0, i31, i32);
                                }
                            } else {
                                i12 = m26311g;
                            }
                        }
                        int i35 = this.f27701w;
                        int i36 = this.f27702x;
                        if (i35 != 0 && (i16 = this.f27699u) != 0 && i36 <= i35 * 3 && i35 + i35 > this.f27700v * 3) {
                            i13 = i16;
                        } else {
                            i13 = i12;
                        }
                        this.f27700v = i35;
                        this.f27699u = i12;
                        if (d11 > 1.0d) {
                            short[] sArr2 = this.f27686h;
                            if (f11 >= 2.0f) {
                                i15 = (int) (i13 / ((-1.0f) + f11));
                            } else {
                                this.f27698t = (int) ((i13 * (2.0f - f11)) / ((-1.0f) + f11));
                                i15 = i13;
                            }
                            m26315k(i15);
                            int i37 = i15;
                            m26316l(i15, this.f27680b, this.f27688j, this.f27696r, sArr2, i25, sArr2, i25 + i13);
                            this.f27696r += i37;
                            i25 += i13 + i37;
                        } else {
                            int i38 = i13;
                            short[] sArr3 = this.f27686h;
                            if (f11 < 0.5f) {
                                i14 = (int) ((i38 * f11) / (1.0f - f11));
                            } else {
                                this.f27698t = (int) ((i38 * ((f11 + f11) - 1.0f)) / (1.0f - f11));
                                i14 = i38;
                            }
                            int i39 = i38 + i14;
                            m26315k(i39);
                            int i41 = this.f27680b;
                            System.arraycopy(sArr3, i25 * i41, this.f27688j, this.f27696r * i41, i41 * i38);
                            m26316l(i14, this.f27680b, this.f27688j, this.f27696r + i38, sArr3, i38 + i25, sArr3, i25);
                            this.f27696r += i39;
                            i25 += i14;
                        }
                    }
                    if (this.f27683e + i25 > i24) {
                        break;
                    } else {
                        i23 = 1;
                    }
                }
                int i42 = this.f27695q - i25;
                short[] sArr4 = this.f27686h;
                int i43 = this.f27680b;
                System.arraycopy(sArr4, i25 * i43, sArr4, 0, i43 * i42);
                this.f27695q = i42;
            }
        }
        float f12 = this.f27694p;
        if (f12 != 1.0f && this.f27696r != i22) {
            int i44 = this.f27679a;
            int i45 = (int) (i44 / f12);
            while (true) {
                if (i45 <= 16384 && i44 <= 16384) {
                    break;
                }
                i45 /= 2;
                i44 /= 2;
            }
            int i46 = this.f27696r - i22;
            int i47 = this.f27697s;
            int i48 = this.f27689k;
            if (i47 + i46 > i48) {
                int i49 = i48 + (i48 / 2) + i46;
                this.f27689k = i49;
                this.f27690l = Arrays.copyOf(this.f27690l, i49 * this.f27680b);
            }
            short[] sArr5 = this.f27688j;
            int i51 = this.f27680b;
            System.arraycopy(sArr5, i22 * i51, this.f27690l, this.f27697s * i51, i51 * i46);
            this.f27696r = i22;
            this.f27697s += i46;
            int i52 = 0;
            while (true) {
                i17 = this.f27697s;
                i18 = i17 - 1;
                if (i52 >= i18) {
                    break;
                }
                while (true) {
                    i19 = this.f27691m + 1;
                    i21 = this.f27692n;
                    if (i19 * i45 <= i21 * i44) {
                        break;
                    }
                    m26315k(1);
                    int i53 = 0;
                    while (true) {
                        int i54 = this.f27680b;
                        if (i53 < i54) {
                            short[] sArr6 = this.f27688j;
                            int i55 = this.f27696r;
                            short[] sArr7 = this.f27690l;
                            int i56 = (i52 * i54) + i53;
                            short s7 = sArr7[i56];
                            short s11 = sArr7[i56 + i54];
                            int i57 = this.f27692n;
                            int i58 = this.f27691m;
                            int i59 = (i58 + 1) * i45;
                            int i61 = i59 - (i57 * i44);
                            int i62 = i59 - (i58 * i45);
                            sArr6[(i55 * i54) + i53] = (short) (((s7 * i61) + ((i62 - i61) * s11)) / i62);
                            i53++;
                        }
                    }
                    this.f27692n++;
                    this.f27696r++;
                }
                this.f27691m = i19;
                if (i19 == i44) {
                    this.f27691m = 0;
                    if (i21 == i45) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4361bo.m20613e(z11);
                    this.f27692n = 0;
                }
                i52++;
            }
            if (i18 != 0) {
                short[] sArr8 = this.f27690l;
                int i63 = this.f27680b;
                System.arraycopy(sArr8, i18 * i63, sArr8, 0, (i17 - i18) * i63);
                this.f27697s -= i18;
            }
        }
    }

    /* renamed from: a */
    public final int m26318a() {
        return this.f27696r;
    }

    /* renamed from: b */
    public final void m26319b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f27680b, this.f27696r);
        shortBuffer.put(this.f27688j, 0, this.f27680b * min);
        int i11 = this.f27696r - min;
        this.f27696r = i11;
        short[] sArr = this.f27688j;
        int i12 = this.f27680b;
        System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
    }

    /* renamed from: c */
    public final void m26320c() {
        int i11;
        int i12 = this.f27695q;
        float f11 = this.f27693o;
        float f12 = this.f27694p;
        int i13 = this.f27696r + ((int) ((((i12 / (f11 / f12)) + this.f27697s) / f12) + 0.5f));
        int i14 = this.f27683e;
        m26314j(i14 + i14 + i12);
        int i15 = 0;
        while (true) {
            int i16 = this.f27683e;
            i11 = i16 + i16;
            int i17 = this.f27680b;
            if (i15 >= i11 * i17) {
                break;
            }
            this.f27686h[(i17 * i12) + i15] = 0;
            i15++;
        }
        this.f27695q += i11;
        m26317m();
        if (this.f27696r > i13) {
            this.f27696r = i13;
        }
        this.f27695q = 0;
        this.f27698t = 0;
        this.f27697s = 0;
    }

    /* renamed from: d */
    public final void m26321d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i11 = this.f27680b;
        int i12 = remaining / i11;
        int i13 = i11 * i12;
        m26314j(i12);
        shortBuffer.get(this.f27686h, this.f27695q * this.f27680b, (i13 + i13) / 2);
        this.f27695q += i12;
        m26317m();
    }

    /* renamed from: e */
    public final void m26322e(float f11) {
        this.f27694p = f11;
    }

    /* renamed from: f */
    public final void m26323f(float f11) {
        this.f27693o = f11;
    }
}
