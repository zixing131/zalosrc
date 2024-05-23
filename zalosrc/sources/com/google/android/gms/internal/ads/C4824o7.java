package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o7 */
/* loaded from: classes2.dex */
final class C4824o7 implements InterfaceC4779n {

    /* renamed from: a */
    private final C4675k7 f25457a;

    /* renamed from: b */
    private final int f25458b;

    /* renamed from: c */
    private final long f25459c;

    /* renamed from: d */
    private final long f25460d;

    /* renamed from: e */
    private final long f25461e;

    public C4824o7(C4675k7 c4675k7, int i11, long j11, long j12) {
        this.f25457a = c4675k7;
        this.f25458b = i11;
        this.f25459c = j11;
        long j13 = (j12 - j11) / c4675k7.f23172d;
        this.f25460d = j13;
        this.f25461e = m25093a(j13);
    }

    /* renamed from: a */
    private final long m25093a(long j11) {
        return g92.m22346g0(j11 * this.f25458b, 1000000L, this.f25457a.f23171c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        long m22336b0 = g92.m22336b0((this.f25457a.f23171c * j11) / (this.f25458b * 1000000), 0L, this.f25460d - 1);
        long j12 = this.f25459c;
        int i11 = this.f25457a.f23172d;
        long m25093a = m25093a(m22336b0);
        C4816o c4816o = new C4816o(m25093a, j12 + (i11 * m22336b0));
        if (m25093a < j11 && m22336b0 != this.f25460d - 1) {
            long j13 = m22336b0 + 1;
            return new C4704l(c4816o, new C4816o(m25093a(j13), this.f25459c + (j13 * this.f25457a.f23172d)));
        }
        return new C4704l(c4816o, c4816o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f25461e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
