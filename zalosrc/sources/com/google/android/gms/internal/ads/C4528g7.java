package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g7 */
/* loaded from: classes2.dex */
final class C4528g7 implements InterfaceC4565h7 {

    /* renamed from: m */
    private static final int[] f20439m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f20440n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final mm4 f20441a;

    /* renamed from: b */
    private final InterfaceC4928r f20442b;

    /* renamed from: c */
    private final C4675k7 f20443c;

    /* renamed from: d */
    private final int f20444d;

    /* renamed from: e */
    private final byte[] f20445e;

    /* renamed from: f */
    private final x02 f20446f;

    /* renamed from: g */
    private final int f20447g;

    /* renamed from: h */
    private final C4671k3 f20448h;

    /* renamed from: i */
    private int f20449i;

    /* renamed from: j */
    private long f20450j;

    /* renamed from: k */
    private int f20451k;

    /* renamed from: l */
    private long f20452l;

    public C4528g7(mm4 mm4Var, InterfaceC4928r interfaceC4928r, C4675k7 c4675k7) {
        this.f20441a = mm4Var;
        this.f20442b = interfaceC4928r;
        this.f20443c = c4675k7;
        int max = Math.max(1, c4675k7.f23171c / 10);
        this.f20447g = max;
        x02 x02Var = new x02(c4675k7.f23174f);
        x02Var.m27786q();
        int m27786q = x02Var.m27786q();
        this.f20444d = m27786q;
        int i11 = c4675k7.f23170b;
        int i12 = (((c4675k7.f23172d - (i11 * 4)) * 8) / (c4675k7.f23173e * i11)) + 1;
        if (m27786q == i12) {
            int m22321O = g92.m22321O(max, m27786q);
            this.f20445e = new byte[c4675k7.f23172d * m22321O];
            this.f20446f = new x02(m22321O * (m27786q + m27786q) * i11);
            int i13 = ((c4675k7.f23171c * c4675k7.f23172d) * 8) / m27786q;
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s("audio/raw");
            c5004t1.m26504d0(i13);
            c5004t1.m26519o(i13);
            c5004t1.m26516l((max + max) * i11);
            c5004t1.m26506e0(c4675k7.f23170b);
            c5004t1.m26524t(c4675k7.f23171c);
            c5004t1.m26518n(2);
            this.f20448h = c5004t1.m26529y();
            return;
        }
        throw zzbu.m28711a("Expected frames per block: " + i12 + "; got: " + m27786q, null);
    }

    /* renamed from: c */
    private final int m22285c(int i11) {
        int i12 = this.f20443c.f23170b;
        return i11 / (i12 + i12);
    }

    /* renamed from: d */
    private final int m22286d(int i11) {
        return (i11 + i11) * this.f20443c.f23170b;
    }

    /* renamed from: e */
    private final void m22287e(int i11) {
        long j11 = this.f20450j;
        long m22346g0 = g92.m22346g0(this.f20452l, 1000000L, this.f20443c.f23171c);
        int m22286d = m22286d(i11);
        this.f20442b.mo23302f(j11 + m22346g0, 1, m22286d, this.f20451k - m22286d, null);
        this.f20452l += i11;
        this.f20451k -= m22286d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    /* renamed from: a */
    public final void mo22288a(long j11) {
        this.f20449i = 0;
        this.f20450j = j11;
        this.f20451k = 0;
        this.f20452l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x001f). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo22289b(km4 km4Var, long j11) {
        boolean z11;
        int i11;
        int m22285c;
        int i12;
        int m22321O = g92.m22321O(this.f20447g - m22285c(this.f20451k), this.f20444d) * this.f20443c.f23172d;
        if (j11 != 0) {
            z11 = false;
            while (!z11) {
                if (this.f20449i >= m22321O) {
                    break;
                }
                int mo19942a = km4Var.mo19942a(this.f20445e, this.f20449i, (int) Math.min(m22321O - r5, j11));
                if (mo19942a != -1) {
                    this.f20449i += mo19942a;
                }
            }
            i11 = this.f20449i / this.f20443c.f23172d;
            if (i11 > 0) {
                byte[] bArr = this.f20445e;
                x02 x02Var = this.f20446f;
                for (int i13 = 0; i13 < i11; i13++) {
                    int i14 = 0;
                    while (true) {
                        C4675k7 c4675k7 = this.f20443c;
                        int i15 = c4675k7.f23170b;
                        if (i14 < i15) {
                            byte[] m27777h = x02Var.m27777h();
                            int i16 = c4675k7.f23172d;
                            int i17 = (i13 * i16) + (i14 * 4);
                            int i18 = (i15 * 4) + i17;
                            int i19 = (i16 / i15) - 4;
                            int i21 = (short) (((bArr[i17 + 1] & 255) << 8) | (bArr[i17] & 255));
                            int min = Math.min(bArr[i17 + 2] & 255, 88);
                            int i22 = f20440n[min];
                            int i23 = (this.f20444d * i13 * i15) + i14;
                            int i24 = i23 + i23;
                            m27777h[i24] = (byte) (i21 & 255);
                            m27777h[i24 + 1] = (byte) (i21 >> 8);
                            int i25 = 0;
                            while (i25 < i19 + i19) {
                                byte b11 = bArr[((i25 / 8) * i15 * 4) + i18 + ((i25 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i26 = b11 & 255;
                                if (i25 % 2 == 0) {
                                    i12 = b11 & 15;
                                } else {
                                    i12 = i26 >> 4;
                                }
                                int i27 = i12 & 7;
                                int i28 = (((i27 + i27) + 1) * i22) >> 3;
                                if ((i12 & 8) != 0) {
                                    i28 = -i28;
                                }
                                i21 = g92.m22322P(i21 + i28, -32768, 32767);
                                i24 += i15 + i15;
                                m27777h[i24] = (byte) (i21 & 255);
                                m27777h[i24 + 1] = (byte) (i21 >> 8);
                                min = g92.m22322P(min + f20439m[i12], 0, 88);
                                i22 = f20440n[min];
                                i25++;
                                i19 = i19;
                                bArr = bArr2;
                            }
                            i14++;
                        }
                    }
                }
                int m22286d = m22286d(this.f20444d * i11);
                x02Var.m27775f(0);
                x02Var.m27774e(m22286d);
                this.f20449i -= i11 * this.f20443c.f23172d;
                x02 x02Var2 = this.f20446f;
                int m27781l = x02Var2.m27781l();
                AbstractC4853p.m25366b(this.f20442b, x02Var2, m27781l);
                int i29 = this.f20451k + m27781l;
                this.f20451k = i29;
                int m22285c2 = m22285c(i29);
                int i31 = this.f20447g;
                if (m22285c2 >= i31) {
                    m22287e(i31);
                }
            }
            if (z11 && (m22285c = m22285c(this.f20451k)) > 0) {
                m22287e(m22285c);
            }
            return z11;
        }
        z11 = true;
        while (!z11) {
        }
        i11 = this.f20449i / this.f20443c.f23172d;
        if (i11 > 0) {
        }
        if (z11) {
            m22287e(m22285c);
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    public final void zza(int i11, long j11) {
        this.f20441a.mo21603f(new C4824o7(this.f20443c, this.f20444d, i11, j11));
        this.f20442b.mo23300d(this.f20448h);
    }
}
