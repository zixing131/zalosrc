package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.mb */
/* loaded from: classes.dex */
public final class C5495mb {

    /* renamed from: f */
    private static final C5495mb f32530f = new C5495mb(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f32531a;

    /* renamed from: b */
    private int[] f32532b;

    /* renamed from: c */
    private Object[] f32533c;

    /* renamed from: d */
    private int f32534d = -1;

    /* renamed from: e */
    private boolean f32535e;

    private C5495mb(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f32531a = i11;
        this.f32532b = iArr;
        this.f32533c = objArr;
        this.f32535e = z11;
    }

    /* renamed from: c */
    public static C5495mb m29441c() {
        return f32530f;
    }

    /* renamed from: e */
    public static C5495mb m29442e(C5495mb c5495mb, C5495mb c5495mb2) {
        int i11 = c5495mb.f32531a + c5495mb2.f32531a;
        int[] copyOf = Arrays.copyOf(c5495mb.f32532b, i11);
        System.arraycopy(c5495mb2.f32532b, 0, copyOf, c5495mb.f32531a, c5495mb2.f32531a);
        Object[] copyOf2 = Arrays.copyOf(c5495mb.f32533c, i11);
        System.arraycopy(c5495mb2.f32533c, 0, copyOf2, c5495mb.f32531a, c5495mb2.f32531a);
        return new C5495mb(i11, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static C5495mb m29443f() {
        return new C5495mb(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m29444l(int i11) {
        int[] iArr = this.f32532b;
        if (i11 > iArr.length) {
            int i12 = this.f32531a;
            int i13 = i12 + (i12 / 2);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f32532b = Arrays.copyOf(iArr, i11);
            this.f32533c = Arrays.copyOf(this.f32533c, i11);
        }
    }

    /* renamed from: a */
    public final int m29445a() {
        int m29090z;
        int m29089y;
        int i11;
        int i12 = this.f32534d;
        if (i12 == -1) {
            int i13 = 0;
            for (int i14 = 0; i14 < this.f32531a; i14++) {
                int i15 = this.f32532b[i14];
                int i16 = i15 >>> 3;
                int i17 = i15 & 7;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 == 5) {
                                    ((Integer) this.f32533c[i14]).intValue();
                                    i11 = AbstractC5357e9.m29089y(i16 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzll.m30117a());
                                }
                            } else {
                                int i18 = i16 << 3;
                                int i19 = AbstractC5357e9.f32354d;
                                m29090z = ((C5495mb) this.f32533c[i14]).m29445a();
                                int m29089y2 = AbstractC5357e9.m29089y(i18);
                                m29089y = m29089y2 + m29089y2;
                            }
                        } else {
                            AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) this.f32533c[i14];
                            int i21 = AbstractC5357e9.f32354d;
                            int mo29551g = abstractC5679x8.mo29551g();
                            i11 = AbstractC5357e9.m29089y(i16 << 3) + AbstractC5357e9.m29089y(mo29551g) + mo29551g;
                        }
                    } else {
                        ((Long) this.f32533c[i14]).longValue();
                        i11 = AbstractC5357e9.m29089y(i16 << 3) + 8;
                    }
                    i13 += i11;
                } else {
                    int i22 = i16 << 3;
                    m29090z = AbstractC5357e9.m29090z(((Long) this.f32533c[i14]).longValue());
                    m29089y = AbstractC5357e9.m29089y(i22);
                }
                i11 = m29089y + m29090z;
                i13 += i11;
            }
            this.f32534d = i13;
            return i13;
        }
        return i12;
    }

    /* renamed from: b */
    public final int m29446b() {
        int i11 = this.f32534d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f32531a; i13++) {
                int i14 = this.f32532b[i13] >>> 3;
                AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) this.f32533c[i13];
                int i15 = AbstractC5357e9.f32354d;
                int mo29551g = abstractC5679x8.mo29551g();
                int m29089y = AbstractC5357e9.m29089y(mo29551g) + mo29551g;
                int m29089y2 = AbstractC5357e9.m29089y(16);
                int m29089y3 = AbstractC5357e9.m29089y(i14);
                int m29089y4 = AbstractC5357e9.m29089y(8);
                i12 += m29089y4 + m29089y4 + m29089y2 + m29089y3 + AbstractC5357e9.m29089y(24) + m29089y;
            }
            this.f32534d = i12;
            return i12;
        }
        return i11;
    }

    /* renamed from: d */
    public final C5495mb m29447d(C5495mb c5495mb) {
        if (c5495mb.equals(f32530f)) {
            return this;
        }
        m29448g();
        int i11 = this.f32531a + c5495mb.f32531a;
        m29444l(i11);
        System.arraycopy(c5495mb.f32532b, 0, this.f32532b, this.f32531a, c5495mb.f32531a);
        System.arraycopy(c5495mb.f32533c, 0, this.f32533c, this.f32531a, c5495mb.f32531a);
        this.f32531a = i11;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5495mb)) {
            return false;
        }
        C5495mb c5495mb = (C5495mb) obj;
        int i11 = this.f32531a;
        if (i11 == c5495mb.f32531a) {
            int[] iArr = this.f32532b;
            int[] iArr2 = c5495mb.f32532b;
            int i12 = 0;
            while (true) {
                if (i12 < i11) {
                    if (iArr[i12] != iArr2[i12]) {
                        break;
                    }
                    i12++;
                } else {
                    Object[] objArr = this.f32533c;
                    Object[] objArr2 = c5495mb.f32533c;
                    int i13 = this.f32531a;
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
    final void m29448g() {
        if (this.f32535e) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m29449h() {
        if (this.f32535e) {
            this.f32535e = false;
        }
    }

    public final int hashCode() {
        int i11 = this.f32531a;
        int i12 = i11 + 527;
        int[] iArr = this.f32532b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 * 31) + i14;
        Object[] objArr = this.f32533c;
        int i17 = this.f32531a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return (i16 * 31) + i13;
    }

    /* renamed from: i */
    public final void m29450i(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f32531a; i12++) {
            AbstractC5681xa.m30025b(sb2, i11, String.valueOf(this.f32532b[i12] >>> 3), this.f32533c[i12]);
        }
    }

    /* renamed from: j */
    public final void m29451j(int i11, Object obj) {
        m29448g();
        m29444l(this.f32531a + 1);
        int[] iArr = this.f32532b;
        int i12 = this.f32531a;
        iArr[i12] = i11;
        this.f32533c[i12] = obj;
        this.f32531a = i12 + 1;
    }

    /* renamed from: k */
    public final void m29452k(InterfaceC5326cc interfaceC5326cc) {
        if (this.f32531a != 0) {
            for (int i11 = 0; i11 < this.f32531a; i11++) {
                int i12 = this.f32532b[i11];
                Object obj = this.f32533c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    interfaceC5326cc.mo29021s(i14, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzll.m30117a());
                                }
                            } else {
                                interfaceC5326cc.zzE(i14);
                                ((C5495mb) obj).m29452k(interfaceC5326cc);
                                interfaceC5326cc.mo29008f(i14);
                            }
                        } else {
                            interfaceC5326cc.mo29002I(i14, (AbstractC5679x8) obj);
                        }
                    } else {
                        interfaceC5326cc.mo29003a(i14, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC5326cc.mo29007e(i14, ((Long) obj).longValue());
                }
            }
        }
    }
}
