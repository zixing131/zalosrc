package i00;

import java.io.Serializable;
import java.lang.reflect.Array;

/* renamed from: i00.e */
/* loaded from: classes4.dex */
public class C20182e implements Serializable {

    /* renamed from: p */
    private final double[][] f99714p;

    /* renamed from: q */
    private final double[][] f99715q;

    /* renamed from: r */
    private final double[] f99716r;

    /* renamed from: s */
    private final int f99717s;

    /* renamed from: t */
    private final int f99718t;

    public C20182e(C20180c c20180c) {
        int i11;
        int i12;
        double d11;
        double d12;
        int i13;
        double d13;
        double d14;
        long j11;
        boolean z11;
        boolean z12;
        double d15;
        double d16;
        boolean z13;
        boolean z14;
        boolean z15;
        double d17;
        int i14;
        boolean z16;
        boolean z17;
        C20182e c20182e = this;
        double[][] m105270f = c20180c.m105270f();
        int m105275k = c20180c.m105275k();
        c20182e.f99717s = m105275k;
        int m105271g = c20180c.m105271g();
        c20182e.f99718t = m105271g;
        int min = Math.min(m105275k, m105271g);
        c20182e.f99716r = new double[Math.min(m105275k + 1, m105271g)];
        Class cls = Double.TYPE;
        c20182e.f99714p = (double[][]) Array.newInstance((Class<?>) cls, m105275k, min);
        c20182e.f99715q = (double[][]) Array.newInstance((Class<?>) cls, m105271g, m105271g);
        double[] dArr = new double[m105271g];
        double[] dArr2 = new double[m105275k];
        int min2 = Math.min(m105275k - 1, m105271g);
        int max = Math.max(0, Math.min(m105271g - 2, m105275k));
        int i15 = 0;
        while (true) {
            if (i15 >= Math.max(min2, max)) {
                break;
            }
            if (i15 < min2) {
                c20182e.f99716r[i15] = 0.0d;
                for (int i16 = i15; i16 < c20182e.f99717s; i16++) {
                    double[] dArr3 = c20182e.f99716r;
                    dArr3[i15] = AbstractC20179b.m105262a(dArr3[i15], m105270f[i16][i15]);
                }
                double[] dArr4 = c20182e.f99716r;
                double d18 = dArr4[i15];
                if (d18 != 0.0d) {
                    if (m105270f[i15][i15] < 0.0d) {
                        dArr4[i15] = -d18;
                    }
                    for (int i17 = i15; i17 < c20182e.f99717s; i17++) {
                        double[] dArr5 = m105270f[i17];
                        dArr5[i15] = dArr5[i15] / c20182e.f99716r[i15];
                    }
                    double[] dArr6 = m105270f[i15];
                    dArr6[i15] = dArr6[i15] + 1.0d;
                }
                double[] dArr7 = c20182e.f99716r;
                dArr7[i15] = -dArr7[i15];
            }
            int i18 = i15 + 1;
            for (int i19 = i18; i19 < c20182e.f99718t; i19++) {
                if (i15 < min2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c20182e.f99716r[i15] != 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z16 & z17) {
                    double d19 = 0.0d;
                    for (int i21 = i15; i21 < c20182e.f99717s; i21++) {
                        double[] dArr8 = m105270f[i21];
                        d19 += dArr8[i15] * dArr8[i19];
                    }
                    double d21 = (-d19) / m105270f[i15][i15];
                    for (int i22 = i15; i22 < c20182e.f99717s; i22++) {
                        double[] dArr9 = m105270f[i22];
                        dArr9[i19] = dArr9[i19] + (dArr9[i15] * d21);
                    }
                }
                dArr[i19] = m105270f[i15][i19];
            }
            if (i15 < min2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15 & true) {
                for (int i23 = i15; i23 < c20182e.f99717s; i23++) {
                    c20182e.f99714p[i23][i15] = m105270f[i23][i15];
                }
            }
            if (i15 < max) {
                dArr[i15] = 0.0d;
                for (int i24 = i18; i24 < c20182e.f99718t; i24++) {
                    dArr[i15] = AbstractC20179b.m105262a(dArr[i15], dArr[i24]);
                }
                double d22 = dArr[i15];
                if (d22 != 0.0d) {
                    if (dArr[i18] < 0.0d) {
                        dArr[i15] = -d22;
                    }
                    for (int i25 = i18; i25 < c20182e.f99718t; i25++) {
                        dArr[i25] = dArr[i25] / dArr[i15];
                    }
                    dArr[i18] = dArr[i18] + 1.0d;
                }
                double d23 = -dArr[i15];
                dArr[i15] = d23;
                if (i18 < c20182e.f99717s) {
                    d17 = 0.0d;
                    i14 = 1;
                } else {
                    d17 = 0.0d;
                    i14 = 0;
                }
                if ((i14 & (d23 == d17 ? 0 : 1)) != 0) {
                    int i26 = i18;
                    while (i26 < c20182e.f99717s) {
                        dArr2[i26] = d17;
                        i26++;
                        d17 = 0.0d;
                    }
                    for (int i27 = i18; i27 < c20182e.f99718t; i27++) {
                        for (int i28 = i18; i28 < c20182e.f99717s; i28++) {
                            dArr2[i28] = dArr2[i28] + (dArr[i27] * m105270f[i28][i27]);
                        }
                    }
                    for (int i29 = i18; i29 < c20182e.f99718t; i29++) {
                        double d24 = (-dArr[i29]) / dArr[i18];
                        for (int i31 = i18; i31 < c20182e.f99717s; i31++) {
                            double[] dArr10 = m105270f[i31];
                            dArr10[i29] = dArr10[i29] + (dArr2[i31] * d24);
                        }
                    }
                }
                for (int i32 = i18; i32 < c20182e.f99718t; i32++) {
                    c20182e.f99715q[i32][i15] = dArr[i32];
                }
            }
            i15 = i18;
        }
        int min3 = Math.min(c20182e.f99718t, c20182e.f99717s + 1);
        if (min2 < c20182e.f99718t) {
            c20182e.f99716r[min2] = m105270f[min2][min2];
        }
        if (c20182e.f99717s < min3) {
            c20182e.f99716r[min3 - 1] = 0.0d;
        }
        if (max + 1 < min3) {
            dArr[max] = m105270f[max][min3 - 1];
        }
        int i33 = min3 - 1;
        double d25 = 0.0d;
        dArr[i33] = 0.0d;
        int i34 = min2;
        while (i34 < min) {
            int i35 = 0;
            while (i35 < c20182e.f99717s) {
                c20182e.f99714p[i35][i34] = d25;
                i35++;
                d25 = 0.0d;
            }
            c20182e.f99714p[i34][i34] = 1.0d;
            i34++;
            d25 = 0.0d;
        }
        for (int i36 = min2 - 1; i36 >= 0; i36--) {
            if (c20182e.f99716r[i36] != 0.0d) {
                for (int i37 = i36 + 1; i37 < min; i37++) {
                    double d26 = 0.0d;
                    for (int i38 = i36; i38 < c20182e.f99717s; i38++) {
                        double[] dArr11 = c20182e.f99714p[i38];
                        d26 += dArr11[i36] * dArr11[i37];
                    }
                    double d27 = (-d26) / c20182e.f99714p[i36][i36];
                    for (int i39 = i36; i39 < c20182e.f99717s; i39++) {
                        double[] dArr12 = c20182e.f99714p[i39];
                        dArr12[i37] = dArr12[i37] + (dArr12[i36] * d27);
                    }
                }
                for (int i41 = i36; i41 < c20182e.f99717s; i41++) {
                    double[] dArr13 = c20182e.f99714p[i41];
                    dArr13[i36] = -dArr13[i36];
                }
                double[] dArr14 = c20182e.f99714p[i36];
                dArr14[i36] = dArr14[i36] + 1.0d;
                for (int i42 = 0; i42 < i36 - 1; i42++) {
                    c20182e.f99714p[i42][i36] = 0.0d;
                }
            } else {
                double d28 = 0.0d;
                int i43 = 0;
                while (i43 < c20182e.f99717s) {
                    c20182e.f99714p[i43][i36] = d28;
                    i43++;
                    d28 = 0.0d;
                }
                c20182e.f99714p[i36][i36] = 1.0d;
            }
        }
        for (int i44 = c20182e.f99718t - 1; i44 >= 0; i44--) {
            if (i44 < max) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (dArr[i44] != 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z13 & z14) {
                int i45 = i44 + 1;
                for (int i46 = i45; i46 < min; i46++) {
                    double d29 = 0.0d;
                    for (int i47 = i45; i47 < c20182e.f99718t; i47++) {
                        double[] dArr15 = c20182e.f99715q[i47];
                        d29 += dArr15[i44] * dArr15[i46];
                    }
                    double d31 = (-d29) / c20182e.f99715q[i45][i44];
                    for (int i48 = i45; i48 < c20182e.f99718t; i48++) {
                        double[] dArr16 = c20182e.f99715q[i48];
                        dArr16[i46] = dArr16[i46] + (dArr16[i44] * d31);
                    }
                }
            }
            for (int i49 = 0; i49 < c20182e.f99718t; i49++) {
                c20182e.f99715q[i49][i44] = 0.0d;
            }
            c20182e.f99715q[i44][i44] = 1.0d;
        }
        double pow = Math.pow(2.0d, -52.0d);
        double pow2 = Math.pow(2.0d, -966.0d);
        while (min3 > 0) {
            int i51 = min3 - 2;
            int i52 = i51;
            while (true) {
                if (i52 < -1 || i52 == -1) {
                    break;
                }
                if (Math.abs(dArr[i52]) <= ((Math.abs(c20182e.f99716r[i52]) + Math.abs(c20182e.f99716r[i52 + 1])) * pow) + pow2) {
                    dArr[i52] = 0.0d;
                    break;
                }
                i52--;
            }
            if (i52 == i51) {
                i12 = 4;
            } else {
                int i53 = min3 - 1;
                int i54 = i53;
                while (true) {
                    if (i54 < i52 || i54 == i52) {
                        break;
                    }
                    if (i54 != min3) {
                        d11 = Math.abs(dArr[i54]);
                    } else {
                        d11 = 0.0d;
                    }
                    if (i54 != i52 + 1) {
                        d12 = Math.abs(dArr[i54 - 1]);
                    } else {
                        d12 = 0.0d;
                    }
                    if (Math.abs(c20182e.f99716r[i54]) <= pow2 + ((d11 + d12) * pow)) {
                        c20182e.f99716r[i54] = 0.0d;
                        break;
                    }
                    i54--;
                }
                if (i54 == i52) {
                    i12 = 3;
                } else if (i54 == i53) {
                    i12 = 1;
                } else {
                    i52 = i54;
                    i12 = 2;
                }
            }
            int i55 = i52 + 1;
            if (i12 != i11) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            double[] dArr17 = c20182e.f99716r;
                            double d32 = dArr17[i55];
                            if (d32 <= 0.0d) {
                                if (d32 < 0.0d) {
                                    d16 = -d32;
                                } else {
                                    d16 = 0.0d;
                                }
                                dArr17[i55] = d16;
                                for (int i56 = 0; i56 <= i33; i56++) {
                                    double[] dArr18 = c20182e.f99715q[i56];
                                    dArr18[i55] = -dArr18[i55];
                                }
                            }
                            while (i55 < i33) {
                                double[] dArr19 = c20182e.f99716r;
                                double d33 = dArr19[i55];
                                int i57 = i55 + 1;
                                double d34 = dArr19[i57];
                                if (d33 >= d34) {
                                    break;
                                }
                                dArr19[i55] = d34;
                                dArr19[i57] = d33;
                                if (i55 < c20182e.f99718t - i11) {
                                    for (int i58 = 0; i58 < c20182e.f99718t; i58++) {
                                        double[] dArr20 = c20182e.f99715q[i58];
                                        double d35 = dArr20[i57];
                                        dArr20[i57] = dArr20[i55];
                                        dArr20[i55] = d35;
                                    }
                                }
                                if (i55 < c20182e.f99717s - i11) {
                                    for (int i59 = 0; i59 < c20182e.f99717s; i59++) {
                                        double[] dArr21 = c20182e.f99714p[i59];
                                        double d36 = dArr21[i57];
                                        dArr21[i57] = dArr21[i55];
                                        dArr21[i55] = d36;
                                    }
                                }
                                i55 = i57;
                            }
                            min3--;
                        }
                        i13 = i33;
                        d13 = pow;
                        d14 = pow2;
                        j11 = 4611686018427387904L;
                    } else {
                        int i61 = min3 - 1;
                        double max2 = Math.max(Math.max(Math.max(Math.max(Math.abs(c20182e.f99716r[i61]), Math.abs(c20182e.f99716r[i51])), Math.abs(dArr[i51])), Math.abs(c20182e.f99716r[i55])), Math.abs(dArr[i55]));
                        double[] dArr22 = c20182e.f99716r;
                        double d37 = dArr22[i61] / max2;
                        double d38 = dArr22[i51] / max2;
                        double d39 = dArr[i51] / max2;
                        double d41 = dArr22[i55] / max2;
                        double d42 = dArr[i55] / max2;
                        j11 = 4611686018427387904L;
                        double d43 = (((d38 + d37) * (d38 - d37)) + (d39 * d39)) / 2.0d;
                        double d44 = d39 * d37;
                        double d45 = d44 * d44;
                        if (d43 != 0.0d) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (d45 != 0.0d) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 | z12) {
                            d13 = pow;
                            double sqrt = Math.sqrt((d43 * d43) + d45);
                            d15 = d45 / (d43 + (d43 < 0.0d ? -sqrt : sqrt));
                        } else {
                            d13 = pow;
                            d15 = 0.0d;
                        }
                        double d46 = ((d41 + d37) * (d41 - d37)) + d15;
                        int i62 = i55;
                        double d47 = d41 * d42;
                        while (i62 < i61) {
                            double m105262a = AbstractC20179b.m105262a(d46, d47);
                            double d48 = d46 / m105262a;
                            double d49 = d47 / m105262a;
                            if (i62 != i55) {
                                dArr[i62 - 1] = m105262a;
                            }
                            double[] dArr23 = c20182e.f99716r;
                            double d51 = dArr23[i62];
                            double d52 = dArr[i62];
                            double d53 = pow2;
                            double d54 = (d48 * d51) + (d49 * d52);
                            dArr[i62] = (d52 * d48) - (d51 * d49);
                            int i63 = i62 + 1;
                            double d55 = dArr23[i63];
                            int i64 = i33;
                            int i65 = i51;
                            double d56 = d49 * d55;
                            dArr23[i63] = d55 * d48;
                            int i66 = i61;
                            int i67 = 0;
                            while (i67 < c20182e.f99718t) {
                                double[] dArr24 = c20182e.f99715q[i67];
                                double d57 = dArr24[i62];
                                double d58 = dArr24[i63];
                                dArr24[i63] = ((-d49) * d57) + (d58 * d48);
                                dArr24[i62] = (d48 * d57) + (d49 * d58);
                                i67++;
                                c20182e = this;
                                d56 = d56;
                            }
                            double d59 = d56;
                            double m105262a2 = AbstractC20179b.m105262a(d54, d59);
                            double d61 = d54 / m105262a2;
                            double d62 = d59 / m105262a2;
                            c20182e = this;
                            double[] dArr25 = c20182e.f99716r;
                            dArr25[i62] = m105262a2;
                            double d63 = dArr[i62];
                            double d64 = dArr25[i63];
                            double d65 = (d61 * d63) + (d62 * d64);
                            double d66 = -d62;
                            dArr25[i63] = (d63 * d66) + (d64 * d61);
                            double d67 = dArr[i63];
                            double d68 = d62 * d67;
                            dArr[i63] = d67 * d61;
                            if (i62 < c20182e.f99717s - 1) {
                                for (int i68 = 0; i68 < c20182e.f99717s; i68++) {
                                    double[] dArr26 = c20182e.f99714p[i68];
                                    double d69 = dArr26[i62];
                                    double d71 = dArr26[i63];
                                    dArr26[i63] = (d69 * d66) + (d71 * d61);
                                    dArr26[i62] = (d61 * d69) + (d62 * d71);
                                }
                            }
                            i62 = i63;
                            i61 = i66;
                            i33 = i64;
                            i51 = i65;
                            d47 = d68;
                            d46 = d65;
                            pow2 = d53;
                        }
                        i13 = i33;
                        d14 = pow2;
                        dArr[i51] = d46;
                    }
                } else {
                    i13 = i33;
                    d13 = pow;
                    d14 = pow2;
                    j11 = 4611686018427387904L;
                    double d72 = dArr[i52];
                    dArr[i52] = 0.0d;
                    while (i55 < min3) {
                        double m105262a3 = AbstractC20179b.m105262a(c20182e.f99716r[i55], d72);
                        double[] dArr27 = c20182e.f99716r;
                        double d73 = dArr27[i55] / m105262a3;
                        double d74 = d72 / m105262a3;
                        dArr27[i55] = m105262a3;
                        double d75 = -d74;
                        double d76 = dArr[i55];
                        double d77 = d75 * d76;
                        dArr[i55] = d76 * d73;
                        for (int i69 = 0; i69 < c20182e.f99717s; i69++) {
                            double[] dArr28 = c20182e.f99714p[i69];
                            double d78 = dArr28[i55];
                            double d79 = dArr28[i52];
                            dArr28[i52] = (d78 * d75) + (d79 * d73);
                            dArr28[i55] = (d73 * d78) + (d74 * d79);
                        }
                        i55++;
                        d72 = d77;
                    }
                }
            } else {
                i13 = i33;
                d13 = pow;
                d14 = pow2;
                j11 = 4611686018427387904L;
                double d81 = dArr[i51];
                dArr[i51] = 0.0d;
                int i71 = i51;
                while (i71 >= i55) {
                    double m105262a4 = AbstractC20179b.m105262a(c20182e.f99716r[i71], d81);
                    double[] dArr29 = c20182e.f99716r;
                    double d82 = dArr29[i71] / m105262a4;
                    double d83 = d81 / m105262a4;
                    dArr29[i71] = m105262a4;
                    if (i71 != i55) {
                        int i72 = i71 - 1;
                        double d84 = dArr[i72];
                        d81 = (-d83) * d84;
                        dArr[i72] = d84 * d82;
                    }
                    int i73 = 0;
                    while (i73 < c20182e.f99718t) {
                        double[] dArr30 = c20182e.f99715q[i73];
                        double d85 = dArr30[i71];
                        int i74 = min3 - 1;
                        double d86 = dArr30[i74];
                        dArr30[i74] = ((-d83) * d85) + (d86 * d82);
                        dArr30[i71] = (d82 * d85) + (d83 * d86);
                        i73++;
                        c20182e = this;
                        d81 = d81;
                    }
                    i71--;
                    c20182e = this;
                }
            }
            i11 = 1;
            c20182e = this;
            i33 = i13;
            pow = d13;
            pow2 = d14;
        }
    }

    /* renamed from: a */
    public C20180c m105282a() {
        int i11 = this.f99718t;
        C20180c c20180c = new C20180c(i11, i11);
        double[][] m105269e = c20180c.m105269e();
        for (int i12 = 0; i12 < this.f99718t; i12++) {
            for (int i13 = 0; i13 < this.f99718t; i13++) {
                m105269e[i12][i13] = 0.0d;
            }
            m105269e[i12][i12] = this.f99716r[i12];
        }
        return c20180c;
    }

    /* renamed from: b */
    public C20180c m105283b() {
        double[][] dArr = this.f99714p;
        int i11 = this.f99717s;
        return new C20180c(dArr, i11, Math.min(i11 + 1, this.f99718t));
    }

    /* renamed from: c */
    public C20180c m105284c() {
        double[][] dArr = this.f99715q;
        int i11 = this.f99718t;
        return new C20180c(dArr, i11, i11);
    }

    /* renamed from: d */
    public int m105285d() {
        int i11 = 0;
        double max = Math.max(this.f99717s, this.f99718t) * this.f99716r[0] * Math.pow(2.0d, -52.0d);
        int i12 = 0;
        while (true) {
            double[] dArr = this.f99716r;
            if (i11 < dArr.length) {
                if (dArr[i11] > max) {
                    i12++;
                }
                i11++;
            } else {
                return i12;
            }
        }
    }
}
