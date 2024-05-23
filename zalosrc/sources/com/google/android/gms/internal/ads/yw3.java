package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yw3 {

    /* renamed from: f */
    private static final yw3 f31240f = new yw3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f31241a;

    /* renamed from: b */
    private int[] f31242b;

    /* renamed from: c */
    private Object[] f31243c;

    /* renamed from: d */
    private int f31244d = -1;

    /* renamed from: e */
    private boolean f31245e;

    private yw3(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f31241a = i11;
        this.f31242b = iArr;
        this.f31243c = objArr;
        this.f31245e = z11;
    }

    /* renamed from: c */
    public static yw3 m28369c() {
        return f31240f;
    }

    /* renamed from: d */
    public static yw3 m28370d(yw3 yw3Var, yw3 yw3Var2) {
        int i11 = yw3Var.f31241a + yw3Var2.f31241a;
        int[] copyOf = Arrays.copyOf(yw3Var.f31242b, i11);
        System.arraycopy(yw3Var2.f31242b, 0, copyOf, yw3Var.f31241a, yw3Var2.f31241a);
        Object[] copyOf2 = Arrays.copyOf(yw3Var.f31243c, i11);
        System.arraycopy(yw3Var2.f31243c, 0, copyOf2, yw3Var.f31241a, yw3Var2.f31241a);
        return new yw3(i11, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static yw3 m28371e() {
        return new yw3(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m28372a() {
        int m20733f;
        int m20734g;
        int i11;
        int i12 = this.f31244d;
        if (i12 == -1) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.f31241a; i14++) {
                int i15 = this.f31242b[i14];
                int i16 = i15 >>> 3;
                int i17 = i15 & 7;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 == 5) {
                                    ((Integer) this.f31243c[i14]).intValue();
                                    i11 = bu3.m20733f(i16 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzgrq.m28817a());
                                }
                            } else {
                                int m20732e = bu3.m20732e(i16);
                                m20733f = m20732e + m20732e;
                                m20734g = ((yw3) this.f31243c[i14]).m28372a();
                            }
                        } else {
                            mt3 mt3Var = (mt3) this.f31243c[i14];
                            int m20733f2 = bu3.m20733f(i16 << 3);
                            int mo22168p = mt3Var.mo22168p();
                            i13 += m20733f2 + bu3.m20733f(mo22168p) + mo22168p;
                        }
                    } else {
                        ((Long) this.f31243c[i14]).longValue();
                        i11 = bu3.m20733f(i16 << 3) + 8;
                    }
                    i13 += i11;
                } else {
                    long longValue = ((Long) this.f31243c[i14]).longValue();
                    m20733f = bu3.m20733f(i16 << 3);
                    m20734g = bu3.m20734g(longValue);
                }
                i11 = m20733f + m20734g;
                i13 += i11;
            }
            this.f31244d = i13;
            return i13;
        }
        return i12;
    }

    /* renamed from: b */
    public final int m28373b() {
        int i11 = this.f31244d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f31241a; i13++) {
                int i14 = this.f31242b[i13];
                mt3 mt3Var = (mt3) this.f31243c[i13];
                int m20733f = bu3.m20733f(8);
                int mo22168p = mt3Var.mo22168p();
                i12 += m20733f + m20733f + bu3.m20733f(16) + bu3.m20733f(i14 >>> 3) + bu3.m20733f(24) + bu3.m20733f(mo22168p) + mo22168p;
            }
            this.f31244d = i12;
            return i12;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yw3)) {
            return false;
        }
        yw3 yw3Var = (yw3) obj;
        int i11 = this.f31241a;
        if (i11 == yw3Var.f31241a) {
            int[] iArr = this.f31242b;
            int[] iArr2 = yw3Var.f31242b;
            int i12 = 0;
            while (true) {
                if (i12 < i11) {
                    if (iArr[i12] != iArr2[i12]) {
                        break;
                    }
                    i12++;
                } else {
                    Object[] objArr = this.f31243c;
                    Object[] objArr2 = yw3Var.f31243c;
                    int i13 = this.f31241a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m28374f() {
        this.f31245e = false;
    }

    /* renamed from: g */
    public final void m28375g(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f31241a; i12++) {
            bw3.m20764b(sb2, i11, String.valueOf(this.f31242b[i12] >>> 3), this.f31243c[i12]);
        }
    }

    /* renamed from: h */
    public final void m28376h(int i11, Object obj) {
        int i12;
        if (this.f31245e) {
            int i13 = this.f31241a;
            int[] iArr = this.f31242b;
            if (i13 == iArr.length) {
                if (i13 < 4) {
                    i12 = 8;
                } else {
                    i12 = i13 >> 1;
                }
                int i14 = i13 + i12;
                this.f31242b = Arrays.copyOf(iArr, i14);
                this.f31243c = Arrays.copyOf(this.f31243c, i14);
            }
            int[] iArr2 = this.f31242b;
            int i15 = this.f31241a;
            iArr2[i15] = i11;
            this.f31243c[i15] = obj;
            this.f31241a = i15 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i11 = this.f31241a;
        int i12 = (i11 + 527) * 31;
        int[] iArr = this.f31242b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.f31243c;
        int i17 = this.f31241a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    /* renamed from: i */
    public final void m28377i(cu3 cu3Var) {
        if (this.f31241a != 0) {
            for (int i11 = 0; i11 < this.f31241a; i11++) {
                int i12 = this.f31242b[i11];
                Object obj = this.f31243c[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    cu3Var.m21098v(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzgrq.m28817a());
                                }
                            } else {
                                cu3Var.m21082e(i13);
                                ((yw3) obj).m28377i(cu3Var);
                                cu3Var.m21095s(i13);
                            }
                        } else {
                            cu3Var.m21091o(i13, (mt3) obj);
                        }
                    } else {
                        cu3Var.m21100x(i13, ((Long) obj).longValue());
                    }
                } else {
                    cu3Var.m21071E(i13, ((Long) obj).longValue());
                }
            }
        }
    }
}
