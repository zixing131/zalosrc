package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.y2 */
/* loaded from: classes2.dex */
public final class C5871y2 {

    /* renamed from: f */
    private static final C5871y2 f33451f = new C5871y2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f33452a;

    /* renamed from: b */
    private int[] f33453b;

    /* renamed from: c */
    private Object[] f33454c;

    /* renamed from: d */
    private int f33455d = -1;

    /* renamed from: e */
    private boolean f33456e;

    private C5871y2(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f33452a = i11;
        this.f33453b = iArr;
        this.f33454c = objArr;
        this.f33456e = z11;
    }

    /* renamed from: c */
    public static C5871y2 m30568c() {
        return f33451f;
    }

    /* renamed from: e */
    public static C5871y2 m30569e(C5871y2 c5871y2, C5871y2 c5871y22) {
        int i11 = c5871y2.f33452a + c5871y22.f33452a;
        int[] copyOf = Arrays.copyOf(c5871y2.f33453b, i11);
        System.arraycopy(c5871y22.f33453b, 0, copyOf, c5871y2.f33452a, c5871y22.f33452a);
        Object[] copyOf2 = Arrays.copyOf(c5871y2.f33454c, i11);
        System.arraycopy(c5871y22.f33454c, 0, copyOf2, c5871y2.f33452a, c5871y22.f33452a);
        return new C5871y2(i11, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C5871y2 m30570f() {
        return new C5871y2(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m30571l(int i11) {
        int[] iArr = this.f33453b;
        if (i11 > iArr.length) {
            int i12 = this.f33452a;
            int i13 = i12 + (i12 / 2);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f33453b = Arrays.copyOf(iArr, i11);
            this.f33454c = Arrays.copyOf(this.f33454c, i11);
        }
    }

    /* renamed from: a */
    public final int m30572a() {
        int m30489z;
        int m30488y;
        int i11;
        int i12 = this.f33455d;
        if (i12 == -1) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.f33452a; i14++) {
                int i15 = this.f33453b[i14];
                int i16 = i15 >>> 3;
                int i17 = i15 & 7;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 == 5) {
                                    ((Integer) this.f33454c[i14]).intValue();
                                    i11 = AbstractC5845u0.m30488y(i16 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzff.m30583a());
                                }
                            } else {
                                int i18 = i16 << 3;
                                int i19 = AbstractC5845u0.f33433d;
                                m30489z = ((C5871y2) this.f33454c[i14]).m30572a();
                                int m30488y2 = AbstractC5845u0.m30488y(i18);
                                m30488y = m30488y2 + m30488y2;
                            }
                        } else {
                            int i21 = i16 << 3;
                            AbstractC5803n0 abstractC5803n0 = (AbstractC5803n0) this.f33454c[i14];
                            int i22 = AbstractC5845u0.f33433d;
                            int mo30241g = abstractC5803n0.mo30241g();
                            i11 = AbstractC5845u0.m30488y(i21) + AbstractC5845u0.m30488y(mo30241g) + mo30241g;
                        }
                    } else {
                        ((Long) this.f33454c[i14]).longValue();
                        i11 = AbstractC5845u0.m30488y(i16 << 3) + 8;
                    }
                    i13 += i11;
                } else {
                    int i23 = i16 << 3;
                    m30489z = AbstractC5845u0.m30489z(((Long) this.f33454c[i14]).longValue());
                    m30488y = AbstractC5845u0.m30488y(i23);
                }
                i11 = m30488y + m30489z;
                i13 += i11;
            }
            this.f33455d = i13;
            return i13;
        }
        return i12;
    }

    /* renamed from: b */
    public final int m30573b() {
        int i11 = this.f33455d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f33452a; i13++) {
                int i14 = this.f33453b[i13] >>> 3;
                AbstractC5803n0 abstractC5803n0 = (AbstractC5803n0) this.f33454c[i13];
                int i15 = AbstractC5845u0.f33433d;
                int mo30241g = abstractC5803n0.mo30241g();
                int m30488y = AbstractC5845u0.m30488y(mo30241g) + mo30241g;
                int m30488y2 = AbstractC5845u0.m30488y(16);
                int m30488y3 = AbstractC5845u0.m30488y(i14);
                int m30488y4 = AbstractC5845u0.m30488y(8);
                i12 += m30488y4 + m30488y4 + m30488y2 + m30488y3 + AbstractC5845u0.m30488y(24) + m30488y;
            }
            this.f33455d = i12;
            return i12;
        }
        return i11;
    }

    /* renamed from: d */
    public final C5871y2 m30574d(C5871y2 c5871y2) {
        if (c5871y2.equals(f33451f)) {
            return this;
        }
        m30575g();
        int i11 = this.f33452a + c5871y2.f33452a;
        m30571l(i11);
        System.arraycopy(c5871y2.f33453b, 0, this.f33453b, this.f33452a, c5871y2.f33452a);
        System.arraycopy(c5871y2.f33454c, 0, this.f33454c, this.f33452a, c5871y2.f33452a);
        this.f33452a = i11;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5871y2)) {
            return false;
        }
        C5871y2 c5871y2 = (C5871y2) obj;
        int i11 = this.f33452a;
        if (i11 == c5871y2.f33452a) {
            int[] iArr = this.f33453b;
            int[] iArr2 = c5871y2.f33453b;
            int i12 = 0;
            while (true) {
                if (i12 < i11) {
                    if (iArr[i12] != iArr2[i12]) {
                        break;
                    }
                    i12++;
                } else {
                    Object[] objArr = this.f33454c;
                    Object[] objArr2 = c5871y2.f33454c;
                    int i13 = this.f33452a;
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

    /* renamed from: g */
    final void m30575g() {
        if (this.f33456e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m30576h() {
        if (this.f33456e) {
            this.f33456e = false;
        }
    }

    public final int hashCode() {
        int i11 = this.f33452a;
        int i12 = i11 + 527;
        int[] iArr = this.f33453b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = ((i12 * 31) + i14) * 31;
        Object[] objArr = this.f33454c;
        int i17 = this.f33452a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    /* renamed from: i */
    public final void m30577i(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f33452a; i12++) {
            AbstractC5787k2.m30314b(sb2, i11, String.valueOf(this.f33453b[i12] >>> 3), this.f33454c[i12]);
        }
    }

    /* renamed from: j */
    public final void m30578j(int i11, Object obj) {
        m30575g();
        m30571l(this.f33452a + 1);
        int[] iArr = this.f33453b;
        int i12 = this.f33452a;
        iArr[i12] = i11;
        this.f33454c[i12] = obj;
        this.f33452a = i12 + 1;
    }

    /* renamed from: k */
    public final void m30579k(InterfaceC5806n3 interfaceC5806n3) {
        if (this.f33452a != 0) {
            for (int i11 = 0; i11 < this.f33452a; i11++) {
                int i12 = this.f33453b[i11];
                Object obj = this.f33454c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    interfaceC5806n3.mo30406s(i14, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzff.m30583a());
                                }
                            } else {
                                interfaceC5806n3.zzE(i14);
                                ((C5871y2) obj).m30579k(interfaceC5806n3);
                                interfaceC5806n3.mo30393f(i14);
                            }
                        } else {
                            interfaceC5806n3.mo30385G(i14, (AbstractC5803n0) obj);
                        }
                    } else {
                        interfaceC5806n3.mo30388a(i14, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC5806n3.mo30392e(i14, ((Long) obj).longValue());
                }
            }
        }
    }
}
