package p007a1;

import java.util.Arrays;

/* renamed from: a1.a */
/* loaded from: classes2.dex */
public class C0020a extends AbstractC0021b {

    /* renamed from: a */
    private final double[] f35a;

    /* renamed from: b */
    a[] f36b;

    /* renamed from: c */
    private boolean f37c = true;

    /* renamed from: a1.a$a */
    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: s */
        private static double[] f38s = new double[91];

        /* renamed from: a */
        double[] f39a;

        /* renamed from: b */
        double f40b;

        /* renamed from: c */
        double f41c;

        /* renamed from: d */
        double f42d;

        /* renamed from: e */
        double f43e;

        /* renamed from: f */
        double f44f;

        /* renamed from: g */
        double f45g;

        /* renamed from: h */
        double f46h;

        /* renamed from: i */
        double f47i;

        /* renamed from: j */
        double f48j;

        /* renamed from: k */
        double f49k;

        /* renamed from: l */
        double f50l;

        /* renamed from: m */
        double f51m;

        /* renamed from: n */
        double f52n;

        /* renamed from: o */
        double f53o;

        /* renamed from: p */
        double f54p;

        /* renamed from: q */
        boolean f55q;

        /* renamed from: r */
        boolean f56r;

        a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            int i12;
            double d17;
            double d18;
            this.f56r = false;
            this.f55q = i11 == 1;
            this.f41c = d11;
            this.f42d = d12;
            this.f47i = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.f56r = true;
            }
            double d19 = d15 - d13;
            double d21 = d16 - d14;
            if (!this.f56r && Math.abs(d19) >= 0.001d && Math.abs(d21) >= 0.001d) {
                this.f39a = new double[101];
                boolean z11 = this.f55q;
                if (z11) {
                    i12 = -1;
                } else {
                    i12 = 1;
                }
                this.f48j = d19 * i12;
                this.f49k = d21 * (z11 ? 1 : -1);
                if (z11) {
                    d17 = d15;
                } else {
                    d17 = d13;
                }
                this.f50l = d17;
                if (z11) {
                    d18 = d14;
                } else {
                    d18 = d16;
                }
                this.f51m = d18;
                m46a(d13, d14, d15, d16);
                this.f52n = this.f40b * this.f47i;
                return;
            }
            this.f56r = true;
            this.f43e = d13;
            this.f44f = d15;
            this.f45g = d14;
            this.f46h = d16;
            double hypot = Math.hypot(d21, d19);
            this.f40b = hypot;
            this.f52n = hypot * this.f47i;
            double d22 = this.f42d;
            double d23 = this.f41c;
            this.f50l = d19 / (d22 - d23);
            this.f51m = d21 / (d22 - d23);
        }

        /* renamed from: a */
        private void m46a(double d11, double d12, double d13, double d14) {
            double d15;
            double d16 = d13 - d11;
            double d17 = d12 - d14;
            int i11 = 0;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d21 = 0.0d;
            while (true) {
                if (i11 >= f38s.length) {
                    break;
                }
                double d22 = d18;
                double radians = Math.toRadians((i11 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d16;
                double cos = Math.cos(radians) * d17;
                if (i11 > 0) {
                    d15 = Math.hypot(sin - d19, cos - d21) + d22;
                    f38s[i11] = d15;
                } else {
                    d15 = d22;
                }
                i11++;
                d21 = cos;
                d18 = d15;
                d19 = sin;
            }
            double d23 = d18;
            this.f40b = d23;
            int i12 = 0;
            while (true) {
                double[] dArr = f38s;
                if (i12 >= dArr.length) {
                    break;
                }
                dArr[i12] = dArr[i12] / d23;
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 < this.f39a.length) {
                    double length = i13 / (r1.length - 1);
                    int binarySearch = Arrays.binarySearch(f38s, length);
                    if (binarySearch >= 0) {
                        this.f39a[i13] = binarySearch / (f38s.length - 1);
                    } else if (binarySearch == -1) {
                        this.f39a[i13] = 0.0d;
                    } else {
                        int i14 = -binarySearch;
                        int i15 = i14 - 2;
                        double[] dArr2 = f38s;
                        double d24 = dArr2[i15];
                        this.f39a[i13] = (i15 + ((length - d24) / (dArr2[i14 - 1] - d24))) / (dArr2.length - 1);
                    }
                    i13++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        double m47b() {
            double d11 = this.f48j * this.f54p;
            double hypot = this.f52n / Math.hypot(d11, (-this.f49k) * this.f53o);
            if (this.f55q) {
                d11 = -d11;
            }
            return d11 * hypot;
        }

        /* renamed from: c */
        double m48c() {
            double d11 = this.f48j * this.f54p;
            double d12 = (-this.f49k) * this.f53o;
            double hypot = this.f52n / Math.hypot(d11, d12);
            if (this.f55q) {
                return (-d12) * hypot;
            }
            return d12 * hypot;
        }

        /* renamed from: d */
        public double m49d(double d11) {
            return this.f50l;
        }

        /* renamed from: e */
        public double m50e(double d11) {
            return this.f51m;
        }

        /* renamed from: f */
        public double m51f(double d11) {
            double d12 = (d11 - this.f41c) * this.f47i;
            double d13 = this.f43e;
            return d13 + (d12 * (this.f44f - d13));
        }

        /* renamed from: g */
        public double m52g(double d11) {
            double d12 = (d11 - this.f41c) * this.f47i;
            double d13 = this.f45g;
            return d13 + (d12 * (this.f46h - d13));
        }

        /* renamed from: h */
        double m53h() {
            return this.f50l + (this.f48j * this.f53o);
        }

        /* renamed from: i */
        double m54i() {
            return this.f51m + (this.f49k * this.f54p);
        }

        /* renamed from: j */
        double m55j(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f39a;
            double length = d11 * (dArr.length - 1);
            int i11 = (int) length;
            double d12 = length - i11;
            double d13 = dArr[i11];
            return d13 + (d12 * (dArr[i11 + 1] - d13));
        }

        /* renamed from: k */
        void m56k(double d11) {
            double d12;
            if (this.f55q) {
                d12 = this.f42d - d11;
            } else {
                d12 = d11 - this.f41c;
            }
            double m55j = m55j(d12 * this.f47i) * 1.5707963267948966d;
            this.f53o = Math.sin(m55j);
            this.f54p = Math.cos(m55j);
        }
    }

    public C0020a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f35a = dArr;
        this.f36b = new a[dArr.length - 1];
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            a[] aVarArr = this.f36b;
            if (i11 < aVarArr.length) {
                int i14 = iArr[i11];
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                if (i12 == 1) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                i13 = i12;
                            }
                        } else {
                            i12 = 2;
                            i13 = 2;
                        }
                    } else {
                        i12 = 1;
                        i13 = 1;
                    }
                } else {
                    i13 = 3;
                }
                double d11 = dArr[i11];
                int i15 = i11 + 1;
                double d12 = dArr[i15];
                double[] dArr3 = dArr2[i11];
                double d13 = dArr3[0];
                double d14 = dArr3[1];
                double[] dArr4 = dArr2[i15];
                aVarArr[i11] = new a(i13, d11, d12, d13, d14, dArr4[0], dArr4[1]);
                i11 = i15;
            } else {
                return;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: c */
    public double mo40c(double d11, int i11) {
        double m52g;
        double m50e;
        double m54i;
        double m48c;
        double m52g2;
        double m50e2;
        int i12 = 0;
        if (this.f37c) {
            a[] aVarArr = this.f36b;
            a aVar = aVarArr[0];
            double d12 = aVar.f41c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (aVar.f56r) {
                    if (i11 == 0) {
                        m52g2 = aVar.m51f(d12);
                        m50e2 = this.f36b[0].m49d(d12);
                    } else {
                        m52g2 = aVar.m52g(d12);
                        m50e2 = this.f36b[0].m50e(d12);
                    }
                    return m52g2 + (d13 * m50e2);
                }
                aVar.m56k(d12);
                if (i11 == 0) {
                    m54i = this.f36b[0].m53h();
                    m48c = this.f36b[0].m47b();
                } else {
                    m54i = this.f36b[0].m54i();
                    m48c = this.f36b[0].m48c();
                }
                return m54i + (d13 * m48c);
            }
            if (d11 > aVarArr[aVarArr.length - 1].f42d) {
                double d14 = aVarArr[aVarArr.length - 1].f42d;
                double d15 = d11 - d14;
                int length = aVarArr.length - 1;
                if (i11 == 0) {
                    m52g = aVarArr[length].m51f(d14);
                    m50e = this.f36b[length].m49d(d14);
                } else {
                    m52g = aVarArr[length].m52g(d14);
                    m50e = this.f36b[length].m50e(d14);
                }
                return m52g + (d15 * m50e);
            }
        } else {
            a[] aVarArr2 = this.f36b;
            double d16 = aVarArr2[0].f41c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > aVarArr2[aVarArr2.length - 1].f42d) {
                d11 = aVarArr2[aVarArr2.length - 1].f42d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.f36b;
            if (i12 < aVarArr3.length) {
                a aVar2 = aVarArr3[i12];
                if (d11 <= aVar2.f42d) {
                    if (aVar2.f56r) {
                        if (i11 == 0) {
                            return aVar2.m51f(d11);
                        }
                        return aVar2.m52g(d11);
                    }
                    aVar2.m56k(d11);
                    if (i11 == 0) {
                        return this.f36b[i12].m53h();
                    }
                    return this.f36b[i12].m54i();
                }
                i12++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: d */
    public void mo41d(double d11, double[] dArr) {
        if (this.f37c) {
            a[] aVarArr = this.f36b;
            a aVar = aVarArr[0];
            double d12 = aVar.f41c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (aVar.f56r) {
                    dArr[0] = aVar.m51f(d12) + (this.f36b[0].m49d(d12) * d13);
                    dArr[1] = this.f36b[0].m52g(d12) + (d13 * this.f36b[0].m50e(d12));
                    return;
                } else {
                    aVar.m56k(d12);
                    dArr[0] = this.f36b[0].m53h() + (this.f36b[0].m47b() * d13);
                    dArr[1] = this.f36b[0].m54i() + (d13 * this.f36b[0].m48c());
                    return;
                }
            }
            if (d11 > aVarArr[aVarArr.length - 1].f42d) {
                double d14 = aVarArr[aVarArr.length - 1].f42d;
                double d15 = d11 - d14;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f56r) {
                    dArr[0] = aVar2.m51f(d14) + (this.f36b[length].m49d(d14) * d15);
                    dArr[1] = this.f36b[length].m52g(d14) + (d15 * this.f36b[length].m50e(d14));
                    return;
                } else {
                    aVar2.m56k(d11);
                    dArr[0] = this.f36b[length].m53h() + (this.f36b[length].m47b() * d15);
                    dArr[1] = this.f36b[length].m54i() + (d15 * this.f36b[length].m48c());
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f36b;
            double d16 = aVarArr2[0].f41c;
            if (d11 < d16) {
                d11 = d16;
            }
            if (d11 > aVarArr2[aVarArr2.length - 1].f42d) {
                d11 = aVarArr2[aVarArr2.length - 1].f42d;
            }
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr3 = this.f36b;
            if (i11 < aVarArr3.length) {
                a aVar3 = aVarArr3[i11];
                if (d11 <= aVar3.f42d) {
                    if (aVar3.f56r) {
                        dArr[0] = aVar3.m51f(d11);
                        dArr[1] = this.f36b[i11].m52g(d11);
                        return;
                    } else {
                        aVar3.m56k(d11);
                        dArr[0] = this.f36b[i11].m53h();
                        dArr[1] = this.f36b[i11].m54i();
                        return;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: e */
    public void mo42e(double d11, float[] fArr) {
        if (this.f37c) {
            a[] aVarArr = this.f36b;
            a aVar = aVarArr[0];
            double d12 = aVar.f41c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (aVar.f56r) {
                    fArr[0] = (float) (aVar.m51f(d12) + (this.f36b[0].m49d(d12) * d13));
                    fArr[1] = (float) (this.f36b[0].m52g(d12) + (d13 * this.f36b[0].m50e(d12)));
                    return;
                } else {
                    aVar.m56k(d12);
                    fArr[0] = (float) (this.f36b[0].m53h() + (this.f36b[0].m47b() * d13));
                    fArr[1] = (float) (this.f36b[0].m54i() + (d13 * this.f36b[0].m48c()));
                    return;
                }
            }
            if (d11 > aVarArr[aVarArr.length - 1].f42d) {
                double d14 = aVarArr[aVarArr.length - 1].f42d;
                double d15 = d11 - d14;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.f56r) {
                    fArr[0] = (float) (aVar2.m51f(d14) + (this.f36b[length].m49d(d14) * d15));
                    fArr[1] = (float) (this.f36b[length].m52g(d14) + (d15 * this.f36b[length].m50e(d14)));
                    return;
                } else {
                    aVar2.m56k(d11);
                    fArr[0] = (float) this.f36b[length].m53h();
                    fArr[1] = (float) this.f36b[length].m54i();
                    return;
                }
            }
        } else {
            a[] aVarArr2 = this.f36b;
            double d16 = aVarArr2[0].f41c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > aVarArr2[aVarArr2.length - 1].f42d) {
                d11 = aVarArr2[aVarArr2.length - 1].f42d;
            }
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr3 = this.f36b;
            if (i11 < aVarArr3.length) {
                a aVar3 = aVarArr3[i11];
                if (d11 <= aVar3.f42d) {
                    if (aVar3.f56r) {
                        fArr[0] = (float) aVar3.m51f(d11);
                        fArr[1] = (float) this.f36b[i11].m52g(d11);
                        return;
                    } else {
                        aVar3.m56k(d11);
                        fArr[0] = (float) this.f36b[i11].m53h();
                        fArr[1] = (float) this.f36b[i11].m54i();
                        return;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: f */
    public double mo43f(double d11, int i11) {
        a[] aVarArr = this.f36b;
        int i12 = 0;
        double d12 = aVarArr[0].f41c;
        if (d11 < d12) {
            d11 = d12;
        }
        if (d11 > aVarArr[aVarArr.length - 1].f42d) {
            d11 = aVarArr[aVarArr.length - 1].f42d;
        }
        while (true) {
            a[] aVarArr2 = this.f36b;
            if (i12 < aVarArr2.length) {
                a aVar = aVarArr2[i12];
                if (d11 <= aVar.f42d) {
                    if (aVar.f56r) {
                        if (i11 == 0) {
                            return aVar.m49d(d11);
                        }
                        return aVar.m50e(d11);
                    }
                    aVar.m56k(d11);
                    if (i11 == 0) {
                        return this.f36b[i12].m47b();
                    }
                    return this.f36b[i12].m48c();
                }
                i12++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: g */
    public void mo44g(double d11, double[] dArr) {
        a[] aVarArr = this.f36b;
        double d12 = aVarArr[0].f41c;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > aVarArr[aVarArr.length - 1].f42d) {
            d11 = aVarArr[aVarArr.length - 1].f42d;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f36b;
            if (i11 < aVarArr2.length) {
                a aVar = aVarArr2[i11];
                if (d11 <= aVar.f42d) {
                    if (aVar.f56r) {
                        dArr[0] = aVar.m49d(d11);
                        dArr[1] = this.f36b[i11].m50e(d11);
                        return;
                    } else {
                        aVar.m56k(d11);
                        dArr[0] = this.f36b[i11].m47b();
                        dArr[1] = this.f36b[i11].m48c();
                        return;
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // p007a1.AbstractC0021b
    /* renamed from: h */
    public double[] mo45h() {
        return this.f35a;
    }
}
