package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i7 */
/* loaded from: classes2.dex */
final class C4602i7 implements InterfaceC4565h7 {

    /* renamed from: a */
    private final mm4 f22100a;

    /* renamed from: b */
    private final InterfaceC4928r f22101b;

    /* renamed from: c */
    private final C4675k7 f22102c;

    /* renamed from: d */
    private final C4671k3 f22103d;

    /* renamed from: e */
    private final int f22104e;

    /* renamed from: f */
    private long f22105f;

    /* renamed from: g */
    private int f22106g;

    /* renamed from: h */
    private long f22107h;

    public C4602i7(mm4 mm4Var, InterfaceC4928r interfaceC4928r, C4675k7 c4675k7, String str, int i11) {
        this.f22100a = mm4Var;
        this.f22101b = interfaceC4928r;
        this.f22102c = c4675k7;
        int i12 = (c4675k7.f23170b * c4675k7.f23173e) / 8;
        int i13 = c4675k7.f23172d;
        if (i13 == i12) {
            int i14 = c4675k7.f23171c * i12;
            int i15 = i14 * 8;
            int max = Math.max(i12, i14 / 10);
            this.f22104e = max;
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s(str);
            c5004t1.m26504d0(i15);
            c5004t1.m26519o(i15);
            c5004t1.m26516l(max);
            c5004t1.m26506e0(c4675k7.f23170b);
            c5004t1.m26524t(c4675k7.f23171c);
            c5004t1.m26518n(i11);
            this.f22103d = c5004t1.m26529y();
            return;
        }
        throw zzbu.m28711a("Expected block size: " + i12 + "; got: " + i13, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    /* renamed from: a */
    public final void mo22288a(long j11) {
        this.f22105f = j11;
        this.f22106g = 0;
        this.f22107h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    /* renamed from: b */
    public final boolean mo22289b(km4 km4Var, long j11) {
        int i11;
        int i12;
        long j12 = j11;
        while (j12 > 0 && (i11 = this.f22106g) < (i12 = this.f22104e)) {
            int m25365a = AbstractC4853p.m25365a(this.f22101b, km4Var, (int) Math.min(i12 - i11, j12), true);
            if (m25365a == -1) {
                j12 = 0;
            } else {
                this.f22106g += m25365a;
                j12 -= m25365a;
            }
        }
        int i13 = this.f22102c.f23172d;
        int i14 = this.f22106g / i13;
        if (i14 > 0) {
            long j13 = this.f22105f;
            long m22346g0 = g92.m22346g0(this.f22107h, 1000000L, r1.f23171c);
            int i15 = i14 * i13;
            int i16 = this.f22106g - i15;
            this.f22101b.mo23302f(j13 + m22346g0, 1, i15, i16, null);
            this.f22107h += i14;
            this.f22106g = i16;
        }
        if (j12 <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4565h7
    public final void zza(int i11, long j11) {
        this.f22100a.mo21603f(new C4824o7(this.f22102c, 1, i11, j11));
        this.f22101b.mo23300d(this.f22103d);
    }
}
