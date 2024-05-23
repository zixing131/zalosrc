package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s */
/* loaded from: classes2.dex */
public final class C4965s {

    /* renamed from: a */
    private final byte[] f27419a = new byte[10];

    /* renamed from: b */
    private boolean f27420b;

    /* renamed from: c */
    private int f27421c;

    /* renamed from: d */
    private long f27422d;

    /* renamed from: e */
    private int f27423e;

    /* renamed from: f */
    private int f27424f;

    /* renamed from: g */
    private int f27425g;

    /* renamed from: a */
    public final void m26213a(InterfaceC4928r interfaceC4928r, C4891q c4891q) {
        if (this.f27421c > 0) {
            interfaceC4928r.mo23302f(this.f27422d, this.f27423e, this.f27424f, this.f27425g, c4891q);
            this.f27421c = 0;
        }
    }

    /* renamed from: b */
    public final void m26214b() {
        this.f27420b = false;
        this.f27421c = 0;
    }

    /* renamed from: c */
    public final void m26215c(InterfaceC4928r interfaceC4928r, long j11, int i11, int i12, int i13, C4891q c4891q) {
        if (this.f27425g <= i12 + i13) {
            if (!this.f27420b) {
                return;
            }
            int i14 = this.f27421c;
            int i15 = i14 + 1;
            this.f27421c = i15;
            if (i14 == 0) {
                this.f27422d = j11;
                this.f27423e = i11;
                this.f27424f = 0;
            }
            this.f27424f += i12;
            this.f27425g = i13;
            if (i15 >= 16) {
                m26213a(interfaceC4928r, c4891q);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    /* renamed from: d */
    public final void m26216d(km4 km4Var) {
        if (this.f27420b) {
            return;
        }
        km4Var.mo23966j(this.f27419a, 0, 10);
        km4Var.zzj();
        byte[] bArr = this.f27419a;
        int i11 = jl4.f22872g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f27420b = true;
        }
    }
}
