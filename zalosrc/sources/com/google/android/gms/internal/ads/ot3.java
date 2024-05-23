package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ot3 extends vt3 {

    /* renamed from: f */
    private final byte[] f25761f;

    /* renamed from: g */
    private int f25762g;

    /* renamed from: h */
    private int f25763h;

    /* renamed from: i */
    private int f25764i;

    /* renamed from: j */
    private final int f25765j;

    /* renamed from: k */
    private int f25766k;

    /* renamed from: l */
    private int f25767l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ot3(byte[] bArr, int i11, int i12, boolean z11, nt3 nt3Var) {
        super(null);
        this.f25767l = Integer.MAX_VALUE;
        this.f25761f = bArr;
        this.f25762g = i12 + i11;
        this.f25764i = i11;
        this.f25765j = i11;
    }

    /* renamed from: D */
    private final void m25258D() {
        int i11 = this.f25762g + this.f25763h;
        this.f25762g = i11;
        int i12 = i11 - this.f25765j;
        int i13 = this.f25767l;
        if (i12 <= i13) {
            this.f25763h = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f25763h = i14;
        this.f25762g = i11 - i14;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: A */
    public final String mo25259A() {
        int m25264G = m25264G();
        if (m25264G > 0) {
            int i11 = this.f25762g;
            int i12 = this.f25764i;
            if (m25264G <= i11 - i12) {
                String m25038h = nx3.m25038h(this.f25761f, i12, m25264G);
                this.f25764i += m25264G;
                return m25038h;
            }
        }
        if (m25264G == 0) {
            return "";
        }
        if (m25264G <= 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: B */
    public final void mo25260B(int i11) {
        if (this.f25766k == i11) {
        } else {
            throw zzgrq.m28818b();
        }
    }

    /* renamed from: C */
    public final void m25261C(int i11) {
        if (i11 >= 0) {
            int i12 = this.f25762g;
            int i13 = this.f25764i;
            if (i11 <= i12 - i13) {
                this.f25764i = i13 + i11;
                return;
            }
        }
        if (i11 < 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: E */
    public final byte m25262E() {
        int i11 = this.f25764i;
        if (i11 != this.f25762g) {
            byte[] bArr = this.f25761f;
            this.f25764i = i11 + 1;
            return bArr[i11];
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: F */
    public final int m25263F() {
        int i11 = this.f25764i;
        if (this.f25762g - i11 >= 4) {
            byte[] bArr = this.f25761f;
            this.f25764i = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: G */
    public final int m25264G() {
        int i11;
        int i12 = this.f25764i;
        int i13 = this.f25762g;
        if (i13 != i12) {
            byte[] bArr = this.f25761f;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f25764i = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b12 = bArr[i19];
                            int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f25764i = i15;
                return i11;
            }
        }
        return (int) m25267J();
    }

    /* renamed from: H */
    public final long m25265H() {
        int i11 = this.f25764i;
        if (this.f25762g - i11 >= 8) {
            byte[] bArr = this.f25761f;
            this.f25764i = i11 + 8;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: I */
    public final long m25266I() {
        long j11;
        long j12;
        int i11 = this.f25764i;
        int i12 = this.f25762g;
        if (i12 != i11) {
            byte[] bArr = this.f25761f;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f25764i = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b11;
                if (i15 < 0) {
                    j11 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j11 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j13 = (-2080896) ^ i19;
                            i14 = i18;
                            j11 = j13;
                        } else {
                            i16 = i11 + 5;
                            long j14 = i19 ^ (bArr[i18] << 28);
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i14 = i11 + 6;
                                long j15 = (bArr[i16] << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i21 = i11 + 7;
                                    long j16 = j15 ^ (bArr[i14] << 42);
                                    if (j16 >= 0) {
                                        j11 = j16 ^ 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j15 = j16 ^ (bArr[i21] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i21 = i11 + 9;
                                            long j17 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i14 = i11 + 10;
                                                if (bArr[i21] >= 0) {
                                                    j11 = j17;
                                                }
                                            } else {
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    i14 = i21;
                                }
                                j11 = j15 ^ j12;
                            }
                        }
                    }
                    i14 = i16;
                }
                this.f25764i = i14;
                return j11;
            }
        }
        return m25267J();
    }

    /* renamed from: J */
    final long m25267J() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((m25262E() & 128) == 0) {
                return j11;
            }
        }
        throw zzgrq.m28821e();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: a */
    public final void mo25268a(int i11) {
        this.f25767l = i11;
        m25258D();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: b */
    public final boolean mo25269b() {
        return this.f25764i == this.f25762g;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: c */
    public final boolean mo25270c() {
        if (m25266I() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: d */
    public final boolean mo25271d(int i11) {
        int mo25281r;
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            m25261C(4);
                            return true;
                        }
                        throw zzgrq.m28817a();
                    }
                    do {
                        mo25281r = mo25281r();
                        if (mo25281r == 0) {
                            break;
                        }
                    } while (mo25271d(mo25281r));
                    mo25260B(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                m25261C(m25264G());
                return true;
            }
            m25261C(8);
            return true;
        }
        if (this.f25762g - this.f25764i >= 10) {
            while (i13 < 10) {
                byte[] bArr = this.f25761f;
                int i14 = this.f25764i;
                this.f25764i = i14 + 1;
                if (bArr[i14] < 0) {
                    i13++;
                }
            }
            throw zzgrq.m28821e();
        }
        while (i13 < 10) {
            if (m25262E() < 0) {
                i13++;
            }
        }
        throw zzgrq.m28821e();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: i */
    public final double mo25272i() {
        return Double.longBitsToDouble(m25265H());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: j */
    public final float mo25273j() {
        return Float.intBitsToFloat(m25263F());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: k */
    public final int mo25274k() {
        return this.f25764i - this.f25765j;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: l */
    public final int mo25275l(int i11) {
        if (i11 >= 0) {
            int i12 = i11 + (this.f25764i - this.f25765j);
            if (i12 >= 0) {
                int i13 = this.f25767l;
                if (i12 <= i13) {
                    this.f25767l = i12;
                    m25258D();
                    return i13;
                }
                throw zzgrq.m28825j();
            }
            throw zzgrq.m28823g();
        }
        throw zzgrq.m28822f();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: m */
    public final int mo25276m() {
        return m25264G();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: n */
    public final int mo25277n() {
        return m25263F();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: o */
    public final int mo25278o() {
        return m25264G();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: p */
    public final int mo25279p() {
        return m25263F();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: q */
    public final int mo25280q() {
        return vt3.m27352e(m25264G());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: r */
    public final int mo25281r() {
        if (mo25269b()) {
            this.f25766k = 0;
            return 0;
        }
        int m25264G = m25264G();
        this.f25766k = m25264G;
        if ((m25264G >>> 3) != 0) {
            return m25264G;
        }
        throw zzgrq.m28819c();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: s */
    public final int mo25282s() {
        return m25264G();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: t */
    public final long mo25283t() {
        return m25265H();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: u */
    public final long mo25284u() {
        return m25266I();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: v */
    public final long mo25285v() {
        return m25265H();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: w */
    public final long mo25286w() {
        return vt3.m27353f(m25266I());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: x */
    public final long mo25287x() {
        return m25266I();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: y */
    public final mt3 mo25288y() {
        int m25264G = m25264G();
        if (m25264G > 0) {
            int i11 = this.f25762g;
            int i12 = this.f25764i;
            if (m25264G <= i11 - i12) {
                mt3 m24727J = mt3.m24727J(this.f25761f, i12, m25264G);
                this.f25764i += m25264G;
                return m24727J;
            }
        }
        if (m25264G != 0) {
            if (m25264G > 0) {
                int i13 = this.f25762g;
                int i14 = this.f25764i;
                if (m25264G <= i13 - i14) {
                    int i15 = m25264G + i14;
                    this.f25764i = i15;
                    return mt3.m24730M(Arrays.copyOfRange(this.f25761f, i14, i15));
                }
            }
            if (m25264G <= 0) {
                throw zzgrq.m28822f();
            }
            throw zzgrq.m28825j();
        }
        return mt3.f24751q;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: z */
    public final String mo25289z() {
        int m25264G = m25264G();
        if (m25264G > 0) {
            int i11 = this.f25762g;
            int i12 = this.f25764i;
            if (m25264G <= i11 - i12) {
                String str = new String(this.f25761f, i12, m25264G, dv3.f19426b);
                this.f25764i += m25264G;
                return str;
            }
        }
        if (m25264G == 0) {
            return "";
        }
        if (m25264G < 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }
}
