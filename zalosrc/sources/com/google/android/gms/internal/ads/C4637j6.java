package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j6 */
/* loaded from: classes2.dex */
final class C4637j6 {

    /* renamed from: c */
    private boolean f22671c;

    /* renamed from: d */
    private boolean f22672d;

    /* renamed from: e */
    private boolean f22673e;

    /* renamed from: a */
    private final a72 f22669a = new a72(0);

    /* renamed from: f */
    private long f22674f = -9223372036854775807L;

    /* renamed from: g */
    private long f22675g = -9223372036854775807L;

    /* renamed from: h */
    private long f22676h = -9223372036854775807L;

    /* renamed from: b */
    private final x02 f22670b = new x02();

    /* renamed from: c */
    public static long m23541c(x02 x02Var) {
        int m27780k = x02Var.m27780k();
        if (x02Var.m27778i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        x02Var.m27771b(bArr, 0, 9);
        x02Var.m27775f(m27780k);
        byte b11 = bArr[0];
        if ((b11 & 196) == 68) {
            byte b12 = bArr[2];
            if ((b12 & 4) == 4) {
                byte b13 = bArr[4];
                if ((b13 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j11 = b11;
                    long j12 = b12;
                    return ((bArr[1] & 255) << 20) | ((j11 & 3) << 28) | (((56 & j11) >> 3) << 30) | (((j12 & 248) >> 3) << 15) | ((j12 & 3) << 13) | ((bArr[3] & 255) << 5) | ((b13 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private final int m23542f(km4 km4Var) {
        x02 x02Var = this.f22670b;
        byte[] bArr = g92.f20479f;
        int length = bArr.length;
        x02Var.m27773d(bArr, 0);
        this.f22671c = true;
        km4Var.zzj();
        return 0;
    }

    /* renamed from: g */
    private static final int m23543g(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int m23544a(km4 km4Var, C4667k c4667k) {
        long j11 = -9223372036854775807L;
        if (!this.f22673e) {
            long zzd = km4Var.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j12 = zzd - min;
            if (km4Var.zzf() != j12) {
                c4667k.f23035a = j12;
                return 1;
            }
            this.f22670b.m27772c(min);
            km4Var.zzj();
            ((yl4) km4Var).mo23963f(this.f22670b.m27777h(), 0, min, false);
            x02 x02Var = this.f22670b;
            int m27780k = x02Var.m27780k();
            int m27781l = x02Var.m27781l() - 4;
            while (true) {
                if (m27781l < m27780k) {
                    break;
                }
                if (m23543g(x02Var.m27777h(), m27781l) == 442) {
                    x02Var.m27775f(m27781l + 4);
                    long m23541c = m23541c(x02Var);
                    if (m23541c != -9223372036854775807L) {
                        j11 = m23541c;
                        break;
                    }
                }
                m27781l--;
            }
            this.f22675g = j11;
            this.f22673e = true;
            return 0;
        }
        if (this.f22675g == -9223372036854775807L) {
            m23542f(km4Var);
            return 0;
        }
        if (!this.f22672d) {
            int min2 = (int) Math.min(20000L, km4Var.zzd());
            if (km4Var.zzf() != 0) {
                c4667k.f23035a = 0L;
                return 1;
            }
            this.f22670b.m27772c(min2);
            km4Var.zzj();
            ((yl4) km4Var).mo23963f(this.f22670b.m27777h(), 0, min2, false);
            x02 x02Var2 = this.f22670b;
            int m27780k2 = x02Var2.m27780k();
            int m27781l2 = x02Var2.m27781l();
            while (true) {
                if (m27780k2 >= m27781l2 - 3) {
                    break;
                }
                if (m23543g(x02Var2.m27777h(), m27780k2) == 442) {
                    x02Var2.m27775f(m27780k2 + 4);
                    long m23541c2 = m23541c(x02Var2);
                    if (m23541c2 != -9223372036854775807L) {
                        j11 = m23541c2;
                        break;
                    }
                }
                m27780k2++;
            }
            this.f22674f = j11;
            this.f22672d = true;
            return 0;
        }
        long j13 = this.f22674f;
        if (j13 == -9223372036854775807L) {
            m23542f(km4Var);
            return 0;
        }
        long m20014b = this.f22669a.m20014b(this.f22675g) - this.f22669a.m20014b(j13);
        this.f22676h = m20014b;
        if (m20014b < 0) {
            lr1.m24356e("PsDurationReader", "Invalid duration: " + m20014b + ". Using TIME_UNSET instead.");
            this.f22676h = -9223372036854775807L;
        }
        m23542f(km4Var);
        return 0;
    }

    /* renamed from: b */
    public final long m23545b() {
        return this.f22676h;
    }

    /* renamed from: d */
    public final a72 m23546d() {
        return this.f22669a;
    }

    /* renamed from: e */
    public final boolean m23547e() {
        return this.f22671c;
    }
}
