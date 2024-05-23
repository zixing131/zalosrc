package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l6 */
/* loaded from: classes2.dex */
final class C4711l6 {

    /* renamed from: a */
    private final InterfaceC4822o5 f23750a;

    /* renamed from: b */
    private final a72 f23751b;

    /* renamed from: c */
    private final wz1 f23752c = new wz1(new byte[64], 64);

    /* renamed from: d */
    private boolean f23753d;

    /* renamed from: e */
    private boolean f23754e;

    /* renamed from: f */
    private boolean f23755f;

    public C4711l6(InterfaceC4822o5 interfaceC4822o5, a72 a72Var) {
        this.f23750a = interfaceC4822o5;
        this.f23751b = a72Var;
    }

    /* renamed from: a */
    public final void m24133a(x02 x02Var) {
        long j11;
        x02Var.m27771b(this.f23752c.f30280a, 0, 3);
        this.f23752c.m27751h(0);
        this.f23752c.m27753j(8);
        this.f23753d = this.f23752c.m27755l();
        this.f23754e = this.f23752c.m27755l();
        this.f23752c.m27753j(6);
        x02Var.m27771b(this.f23752c.f30280a, 0, this.f23752c.m27746c(8));
        this.f23752c.m27751h(0);
        if (this.f23753d) {
            this.f23752c.m27753j(4);
            int m27746c = this.f23752c.m27746c(3);
            this.f23752c.m27753j(1);
            int m27746c2 = this.f23752c.m27746c(15);
            this.f23752c.m27753j(1);
            long m27746c3 = (m27746c << 30) | (m27746c2 << 15) | this.f23752c.m27746c(15);
            this.f23752c.m27753j(1);
            if (!this.f23755f && this.f23754e) {
                this.f23752c.m27753j(4);
                int m27746c4 = this.f23752c.m27746c(3);
                this.f23752c.m27753j(1);
                int m27746c5 = this.f23752c.m27746c(15);
                this.f23752c.m27753j(1);
                int m27746c6 = this.f23752c.m27746c(15);
                this.f23752c.m27753j(1);
                this.f23751b.m20014b((m27746c5 << 15) | (m27746c4 << 30) | m27746c6);
                this.f23755f = true;
            }
            j11 = this.f23751b.m20014b(m27746c3);
        } else {
            j11 = 0;
        }
        this.f23750a.mo20011c(j11, 4);
        this.f23750a.mo20009a(x02Var);
        this.f23750a.zzc();
    }

    /* renamed from: b */
    public final void m24134b() {
        this.f23755f = false;
        this.f23750a.zze();
    }
}
