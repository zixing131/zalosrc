package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t6 */
/* loaded from: classes2.dex */
final class C5009t6 {

    /* renamed from: c */
    private boolean f28219c;

    /* renamed from: d */
    private boolean f28220d;

    /* renamed from: e */
    private boolean f28221e;

    /* renamed from: a */
    private final a72 f28217a = new a72(0);

    /* renamed from: f */
    private long f28222f = -9223372036854775807L;

    /* renamed from: g */
    private long f28223g = -9223372036854775807L;

    /* renamed from: h */
    private long f28224h = -9223372036854775807L;

    /* renamed from: b */
    private final x02 f28218b = new x02();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5009t6(int i11) {
    }

    /* renamed from: e */
    private final int m26568e(km4 km4Var) {
        x02 x02Var = this.f28218b;
        byte[] bArr = g92.f20479f;
        int length = bArr.length;
        x02Var.m27773d(bArr, 0);
        this.f28219c = true;
        km4Var.zzj();
        return 0;
    }

    /* renamed from: a */
    public final int m26569a(km4 km4Var, C4667k c4667k, int i11) {
        if (i11 <= 0) {
            m26568e(km4Var);
            return 0;
        }
        long j11 = -9223372036854775807L;
        if (!this.f28221e) {
            long zzd = km4Var.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j12 = zzd - min;
            if (km4Var.zzf() != j12) {
                c4667k.f23035a = j12;
                return 1;
            }
            this.f28218b.m27772c(min);
            km4Var.zzj();
            ((yl4) km4Var).mo23963f(this.f28218b.m27777h(), 0, min, false);
            x02 x02Var = this.f28218b;
            int m27780k = x02Var.m27780k();
            int m27781l = x02Var.m27781l();
            int i12 = m27781l - 188;
            while (true) {
                if (i12 < m27780k) {
                    break;
                }
                byte[] m27777h = x02Var.m27777h();
                int i13 = -4;
                int i14 = 0;
                while (true) {
                    if (i13 > 4) {
                        break;
                    }
                    int i15 = (i13 * 188) + i12;
                    if (i15 < m27780k || i15 >= m27781l || m27777h[i15] != 71) {
                        i14 = 0;
                    } else {
                        i14++;
                        if (i14 == 5) {
                            long m21276b = AbstractC4417d7.m21276b(x02Var, i12, i11);
                            if (m21276b != -9223372036854775807L) {
                                j11 = m21276b;
                                break;
                            }
                        }
                    }
                    i13++;
                }
                i12--;
            }
            this.f28223g = j11;
            this.f28221e = true;
            return 0;
        }
        if (this.f28223g == -9223372036854775807L) {
            m26568e(km4Var);
            return 0;
        }
        if (!this.f28220d) {
            int min2 = (int) Math.min(112800L, km4Var.zzd());
            if (km4Var.zzf() != 0) {
                c4667k.f23035a = 0L;
                return 1;
            }
            this.f28218b.m27772c(min2);
            km4Var.zzj();
            ((yl4) km4Var).mo23963f(this.f28218b.m27777h(), 0, min2, false);
            x02 x02Var2 = this.f28218b;
            int m27780k2 = x02Var2.m27780k();
            int m27781l2 = x02Var2.m27781l();
            while (true) {
                if (m27780k2 >= m27781l2) {
                    break;
                }
                if (x02Var2.m27777h()[m27780k2] == 71) {
                    long m21276b2 = AbstractC4417d7.m21276b(x02Var2, m27780k2, i11);
                    if (m21276b2 != -9223372036854775807L) {
                        j11 = m21276b2;
                        break;
                    }
                }
                m27780k2++;
            }
            this.f28222f = j11;
            this.f28220d = true;
            return 0;
        }
        long j13 = this.f28222f;
        if (j13 == -9223372036854775807L) {
            m26568e(km4Var);
            return 0;
        }
        long m20014b = this.f28217a.m20014b(this.f28223g) - this.f28217a.m20014b(j13);
        this.f28224h = m20014b;
        if (m20014b < 0) {
            lr1.m24356e("TsDurationReader", "Invalid duration: " + m20014b + ". Using TIME_UNSET instead.");
            this.f28224h = -9223372036854775807L;
        }
        m26568e(km4Var);
        return 0;
    }

    /* renamed from: b */
    public final long m26570b() {
        return this.f28224h;
    }

    /* renamed from: c */
    public final a72 m26571c() {
        return this.f28217a;
    }

    /* renamed from: d */
    public final boolean m26572d() {
        return this.f28219c;
    }
}
