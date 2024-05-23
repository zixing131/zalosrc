package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a5 */
/* loaded from: classes2.dex */
final class C4305a5 extends AbstractC5193y4 {

    /* renamed from: n */
    private C5230z4 f16920n;

    /* renamed from: o */
    private int f16921o;

    /* renamed from: p */
    private boolean f16922p;

    /* renamed from: q */
    private C5113w f16923q;

    /* renamed from: r */
    private C5039u f16924r;

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: a */
    protected final long mo19983a(x02 x02Var) {
        int i11;
        int i12 = 0;
        if ((x02Var.m27777h()[0] & 1) == 1) {
            return -1L;
        }
        byte b11 = x02Var.m27777h()[0];
        C5230z4 c5230z4 = this.f16920n;
        v71.m27171b(c5230z4);
        if (!c5230z4.f31346d[(b11 >> 1) & (255 >>> (8 - c5230z4.f31347e))].f29102a) {
            i11 = c5230z4.f31343a.f29646e;
        } else {
            i11 = c5230z4.f31343a.f29647f;
        }
        if (this.f16922p) {
            i12 = (this.f16921o + i11) / 4;
        }
        long j11 = i12;
        if (x02Var.m27779j() < x02Var.m27781l() + 4) {
            byte[] copyOf = Arrays.copyOf(x02Var.m27777h(), x02Var.m27781l() + 4);
            x02Var.m27773d(copyOf, copyOf.length);
        } else {
            x02Var.m27774e(x02Var.m27781l() + 4);
        }
        byte[] m27777h = x02Var.m27777h();
        m27777h[x02Var.m27781l() - 4] = (byte) (j11 & 255);
        m27777h[x02Var.m27781l() - 3] = (byte) ((j11 >>> 8) & 255);
        m27777h[x02Var.m27781l() - 2] = (byte) ((j11 >>> 16) & 255);
        m27777h[x02Var.m27781l() - 1] = (byte) ((j11 >>> 24) & 255);
        this.f16922p = true;
        this.f16921o = i11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: b */
    public final void mo19984b(boolean z11) {
        super.mo19984b(z11);
        if (z11) {
            this.f16920n = null;
            this.f16923q = null;
            this.f16924r = null;
        }
        this.f16921o = 0;
        this.f16922p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: c */
    protected final boolean mo19985c(x02 x02Var, long j11, C5081v4 c5081v4) {
        C5230z4 c5230z4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f16920n != null) {
            c5081v4.f29182a.getClass();
            return false;
        }
        C5113w c5113w = this.f16923q;
        if (c5113w == null) {
            AbstractC5151x.m27760d(1, x02Var, false);
            int m27785p = x02Var.m27785p();
            int m27788s = x02Var.m27788s();
            int m27785p2 = x02Var.m27785p();
            int m27784o = x02Var.m27784o();
            int i16 = m27784o <= 0 ? -1 : m27784o;
            int m27784o2 = x02Var.m27784o();
            int i17 = m27784o2 <= 0 ? -1 : m27784o2;
            int m27784o3 = x02Var.m27784o();
            int i18 = m27784o3 <= 0 ? -1 : m27784o3;
            int m27788s2 = x02Var.m27788s();
            this.f16923q = new C5113w(m27785p, m27788s, m27785p2, i16, i17, i18, (int) Math.pow(2.0d, m27788s2 & 15), (int) Math.pow(2.0d, (m27788s2 & 240) >> 4), 1 == (x02Var.m27788s() & 1), Arrays.copyOf(x02Var.m27777h(), x02Var.m27781l()));
        } else {
            C5039u c5039u = this.f16924r;
            if (c5039u == null) {
                this.f16924r = AbstractC5151x.m27759c(x02Var, true, true);
            } else {
                byte[] bArr = new byte[x02Var.m27781l()];
                System.arraycopy(x02Var.m27777h(), 0, bArr, 0, x02Var.m27781l());
                int i19 = c5113w.f29642a;
                int i21 = 5;
                AbstractC5151x.m27760d(5, x02Var, false);
                int m27788s3 = x02Var.m27788s() + 1;
                C5002t c5002t = new C5002t(x02Var.m27777h());
                c5002t.m26461c(x02Var.m27780k() * 8);
                int i22 = 0;
                while (i22 < m27788s3) {
                    if (c5002t.m26460b(24) == 5653314) {
                        int m26460b = c5002t.m26460b(16);
                        int m26460b2 = c5002t.m26460b(24);
                        long[] jArr = new long[m26460b2];
                        long j12 = 0;
                        if (!c5002t.m26462d()) {
                            boolean m26462d = c5002t.m26462d();
                            int i23 = 0;
                            while (i23 < m26460b2) {
                                if (m26462d) {
                                    if (c5002t.m26462d()) {
                                        i15 = m27788s3;
                                        jArr[i23] = c5002t.m26460b(i21) + 1;
                                    } else {
                                        i15 = m27788s3;
                                        jArr[i23] = 0;
                                    }
                                } else {
                                    i15 = m27788s3;
                                    jArr[i23] = c5002t.m26460b(5) + 1;
                                }
                                i23++;
                                m27788s3 = i15;
                                i21 = 5;
                            }
                            i14 = m27788s3;
                        } else {
                            i14 = m27788s3;
                            int m26460b3 = c5002t.m26460b(5) + 1;
                            int i24 = 0;
                            while (i24 < m26460b2) {
                                int m26460b4 = c5002t.m26460b(AbstractC5151x.m27757a(m26460b2 - i24));
                                int i25 = 0;
                                while (i25 < m26460b4 && i24 < m26460b2) {
                                    jArr[i24] = m26460b3;
                                    i24++;
                                    i25++;
                                    c5039u = c5039u;
                                    bArr = bArr;
                                }
                                m26460b3++;
                                c5039u = c5039u;
                                bArr = bArr;
                            }
                        }
                        C5039u c5039u2 = c5039u;
                        byte[] bArr2 = bArr;
                        int m26460b5 = c5002t.m26460b(4);
                        if (m26460b5 > 2) {
                            throw zzbu.m28711a("lookup type greater than 2 not decodable: " + m26460b5, null);
                        }
                        if (m26460b5 != 1) {
                            if (m26460b5 == 2) {
                                m26460b5 = 2;
                            } else {
                                i22++;
                                c5039u = c5039u2;
                                m27788s3 = i14;
                                bArr = bArr2;
                                i21 = 5;
                            }
                        }
                        c5002t.m26461c(32);
                        c5002t.m26461c(32);
                        int m26460b6 = c5002t.m26460b(4) + 1;
                        c5002t.m26461c(1);
                        if (m26460b5 != 1) {
                            j12 = m26460b2 * m26460b;
                        } else if (m26460b != 0) {
                            j12 = (long) Math.floor(Math.pow(m26460b2, 1.0d / m26460b));
                        }
                        c5002t.m26461c((int) (m26460b6 * j12));
                        i22++;
                        c5039u = c5039u2;
                        m27788s3 = i14;
                        bArr = bArr2;
                        i21 = 5;
                    } else {
                        throw zzbu.m28711a("expected code book to start with [0x56, 0x43, 0x42] at " + c5002t.m26459a(), null);
                    }
                }
                C5039u c5039u3 = c5039u;
                byte[] bArr3 = bArr;
                int i26 = 6;
                int m26460b7 = c5002t.m26460b(6) + 1;
                for (int i27 = 0; i27 < m26460b7; i27++) {
                    if (c5002t.m26460b(16) != 0) {
                        throw zzbu.m28711a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i28 = 1;
                int m26460b8 = c5002t.m26460b(6) + 1;
                int i29 = 0;
                while (true) {
                    int i31 = 3;
                    if (i29 < m26460b8) {
                        int m26460b9 = c5002t.m26460b(16);
                        if (m26460b9 == 0) {
                            int i32 = 8;
                            c5002t.m26461c(8);
                            c5002t.m26461c(16);
                            c5002t.m26461c(16);
                            c5002t.m26461c(6);
                            c5002t.m26461c(8);
                            int m26460b10 = c5002t.m26460b(4) + 1;
                            int i33 = 0;
                            while (i33 < m26460b10) {
                                c5002t.m26461c(i32);
                                i33++;
                                i32 = 8;
                            }
                        } else {
                            if (m26460b9 != i28) {
                                throw zzbu.m28711a("floor type greater than 1 not decodable: " + m26460b9, null);
                            }
                            int m26460b11 = c5002t.m26460b(5);
                            int[] iArr = new int[m26460b11];
                            int i34 = -1;
                            for (int i35 = 0; i35 < m26460b11; i35++) {
                                int m26460b12 = c5002t.m26460b(4);
                                iArr[i35] = m26460b12;
                                if (m26460b12 > i34) {
                                    i34 = m26460b12;
                                }
                            }
                            int i36 = i34 + 1;
                            int[] iArr2 = new int[i36];
                            int i37 = 0;
                            while (i37 < i36) {
                                iArr2[i37] = c5002t.m26460b(i31) + 1;
                                int m26460b13 = c5002t.m26460b(2);
                                if (m26460b13 > 0) {
                                    i13 = 8;
                                    c5002t.m26461c(8);
                                } else {
                                    i13 = 8;
                                }
                                int i38 = 0;
                                for (int i39 = 1; i38 < (i39 << m26460b13); i39 = 1) {
                                    c5002t.m26461c(i13);
                                    i38++;
                                    i13 = 8;
                                }
                                i37++;
                                i31 = 3;
                            }
                            c5002t.m26461c(2);
                            int m26460b14 = c5002t.m26460b(4);
                            int i41 = 0;
                            int i42 = 0;
                            for (int i43 = 0; i43 < m26460b11; i43++) {
                                i41 += iArr2[iArr[i43]];
                                while (i42 < i41) {
                                    c5002t.m26461c(m26460b14);
                                    i42++;
                                }
                            }
                        }
                        i29++;
                        i26 = 6;
                        i28 = 1;
                    } else {
                        int i44 = 1;
                        int m26460b15 = c5002t.m26460b(i26) + 1;
                        int i45 = 0;
                        while (i45 < m26460b15) {
                            if (c5002t.m26460b(16) <= 2) {
                                c5002t.m26461c(24);
                                c5002t.m26461c(24);
                                c5002t.m26461c(24);
                                int m26460b16 = c5002t.m26460b(i26) + i44;
                                int i46 = 8;
                                c5002t.m26461c(8);
                                int[] iArr3 = new int[m26460b16];
                                for (int i47 = 0; i47 < m26460b16; i47++) {
                                    iArr3[i47] = ((c5002t.m26462d() ? c5002t.m26460b(5) : 0) * 8) + c5002t.m26460b(3);
                                }
                                int i48 = 0;
                                while (i48 < m26460b16) {
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        if ((iArr3[i48] & (1 << i49)) != 0) {
                                            c5002t.m26461c(i46);
                                        }
                                        i49++;
                                        i46 = 8;
                                    }
                                    i48++;
                                    i46 = 8;
                                }
                                i45++;
                                i26 = 6;
                                i44 = 1;
                            } else {
                                throw zzbu.m28711a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int m26460b17 = c5002t.m26460b(i26) + 1;
                        for (int i51 = 0; i51 < m26460b17; i51++) {
                            int m26460b18 = c5002t.m26460b(16);
                            if (m26460b18 != 0) {
                                lr1.m24353b("VorbisUtil", "mapping type other than 0 not supported: " + m26460b18);
                            } else {
                                if (c5002t.m26462d()) {
                                    i11 = 1;
                                    i12 = c5002t.m26460b(4) + 1;
                                } else {
                                    i11 = 1;
                                    i12 = 1;
                                }
                                if (c5002t.m26462d()) {
                                    int m26460b19 = c5002t.m26460b(8) + i11;
                                    for (int i52 = 0; i52 < m26460b19; i52++) {
                                        int i53 = i19 - 1;
                                        c5002t.m26461c(AbstractC5151x.m27757a(i53));
                                        c5002t.m26461c(AbstractC5151x.m27757a(i53));
                                    }
                                }
                                if (c5002t.m26460b(2) != 0) {
                                    throw zzbu.m28711a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i12 > 1) {
                                    for (int i54 = 0; i54 < i19; i54++) {
                                        c5002t.m26461c(4);
                                    }
                                }
                                for (int i55 = 0; i55 < i12; i55++) {
                                    c5002t.m26461c(8);
                                    c5002t.m26461c(8);
                                    c5002t.m26461c(8);
                                }
                            }
                        }
                        int m26460b20 = c5002t.m26460b(6);
                        int i56 = m26460b20 + 1;
                        C5076v[] c5076vArr = new C5076v[i56];
                        for (int i57 = 0; i57 < i56; i57++) {
                            c5076vArr[i57] = new C5076v(c5002t.m26462d(), c5002t.m26460b(16), c5002t.m26460b(16), c5002t.m26460b(8));
                        }
                        if (c5002t.m26462d()) {
                            c5230z4 = new C5230z4(c5113w, c5039u3, bArr3, c5076vArr, AbstractC5151x.m27757a(m26460b20));
                        } else {
                            throw zzbu.m28711a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        c5230z4 = null;
        this.f16920n = c5230z4;
        if (c5230z4 == null) {
            return true;
        }
        C5113w c5113w2 = c5230z4.f31343a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c5113w2.f29648g);
        arrayList.add(c5230z4.f31345c);
        zzbq m27758b = AbstractC5151x.m27758b(c83.m20831v(c5230z4.f31344b.f28676b));
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s("audio/vorbis");
        c5004t1.m26504d0(c5113w2.f29645d);
        c5004t1.m26519o(c5113w2.f29644c);
        c5004t1.m26506e0(c5113w2.f29642a);
        c5004t1.m26524t(c5113w2.f29643b);
        c5004t1.m26513i(arrayList);
        c5004t1.m26517m(m27758b);
        c5081v4.f29182a = c5004t1.m26529y();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: h */
    public final void mo19986h(long j11) {
        boolean z11;
        super.mo19986h(j11);
        int i11 = 0;
        if (j11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f16922p = z11;
        C5113w c5113w = this.f16923q;
        if (c5113w != null) {
            i11 = c5113w.f29646e;
        }
        this.f16921o = i11;
    }
}
