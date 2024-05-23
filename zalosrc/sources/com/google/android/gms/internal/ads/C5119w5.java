package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.w5 */
/* loaded from: classes2.dex */
final class C5119w5 {

    /* renamed from: a */
    private final InterfaceC4928r f29789a;

    /* renamed from: d */
    private final C4630j f29792d;

    /* renamed from: e */
    private final byte[] f29793e;

    /* renamed from: f */
    private int f29794f;

    /* renamed from: g */
    private long f29795g;

    /* renamed from: h */
    private long f29796h;

    /* renamed from: l */
    private long f29800l;

    /* renamed from: m */
    private long f29801m;

    /* renamed from: n */
    private boolean f29802n;

    /* renamed from: b */
    private final SparseArray f29790b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f29791c = new SparseArray();

    /* renamed from: i */
    private final C5082v5 f29797i = new C5082v5(null);

    /* renamed from: j */
    private final C5082v5 f29798j = new C5082v5(null);

    /* renamed from: k */
    private boolean f29799k = false;

    public C5119w5(InterfaceC4928r interfaceC4928r, boolean z11, boolean z12) {
        this.f29789a = interfaceC4928r;
        byte[] bArr = new byte[128];
        this.f29793e = bArr;
        this.f29792d = new C4630j(bArr, 0, 0);
    }

    /* renamed from: a */
    public final void m27527a(C4483f c4483f) {
        this.f29791c.append(c4483f.f19873a, c4483f);
    }

    /* renamed from: b */
    public final void m27528b(C4520g c4520g) {
        this.f29790b.append(c4520g.f20349d, c4520g);
    }

    /* renamed from: c */
    public final void m27529c() {
        this.f29799k = false;
    }

    /* renamed from: d */
    public final void m27530d(long j11, int i11, long j12) {
        this.f29794f = i11;
        this.f29796h = j12;
        this.f29795g = j11;
    }

    /* renamed from: e */
    public final boolean m27531e(long j11, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (this.f29794f == 9) {
            if (z11 && this.f29799k) {
                long j12 = this.f29795g;
                int i12 = i11 + ((int) (j11 - j12));
                long j13 = this.f29801m;
                if (j13 != -9223372036854775807L) {
                    boolean z14 = this.f29802n;
                    long j14 = this.f29800l;
                    this.f29789a.mo23302f(j13, z14 ? 1 : 0, (int) (j12 - j14), i12, null);
                }
            }
            this.f29800l = this.f29795g;
            this.f29801m = this.f29796h;
            this.f29802n = false;
            this.f29799k = true;
        }
        boolean z15 = this.f29802n;
        int i13 = this.f29794f;
        if (i13 == 5 || (z12 && i13 == 1)) {
            z13 = true;
        }
        boolean z16 = z15 | z13;
        this.f29802n = z16;
        return z16;
    }
}
