package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class xl4 implements InterfaceC4779n {

    /* renamed from: a */
    private final long f30530a;

    /* renamed from: b */
    private final long f30531b;

    /* renamed from: c */
    private final int f30532c;

    /* renamed from: d */
    private final long f30533d;

    /* renamed from: e */
    private final int f30534e;

    /* renamed from: f */
    private final long f30535f;

    public xl4(long j11, long j12, int i11, int i12, boolean z11) {
        long m27935c;
        this.f30530a = j11;
        this.f30531b = j12;
        this.f30532c = i12 == -1 ? 1 : i12;
        this.f30534e = i11;
        if (j11 == -1) {
            this.f30533d = -1L;
            m27935c = -9223372036854775807L;
        } else {
            this.f30533d = j11 - j12;
            m27935c = m27935c(j11, j12, i11);
        }
        this.f30535f = m27935c;
    }

    /* renamed from: c */
    private static long m27935c(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / i11;
    }

    /* renamed from: a */
    public final long m27936a(long j11) {
        return m27935c(j11, this.f30531b, this.f30534e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        long j12 = this.f30533d;
        if (j12 != -1) {
            int i11 = this.f30534e;
            long j13 = this.f30532c;
            long j14 = (((i11 * j11) / 8000000) / j13) * j13;
            if (j12 != -1) {
                j14 = Math.min(j14, j12 - j13);
            }
            long max = this.f30531b + Math.max(j14, 0L);
            long m27936a = m27936a(max);
            C4816o c4816o = new C4816o(m27936a, max);
            if (this.f30533d != -1 && m27936a < j11) {
                long j15 = max + this.f30532c;
                if (j15 < this.f30530a) {
                    return new C4704l(c4816o, new C4816o(m27936a(j15), j15));
                }
            }
            return new C4704l(c4816o, c4816o);
        }
        C4816o c4816o2 = new C4816o(0L, this.f30531b);
        return new C4704l(c4816o2, c4816o2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f30535f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return this.f30533d != -1;
    }
}
