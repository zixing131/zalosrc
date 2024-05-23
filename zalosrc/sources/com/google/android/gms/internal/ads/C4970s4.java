package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s4 */
/* loaded from: classes2.dex */
final class C4970s4 {

    /* renamed from: a */
    public int f27520a;

    /* renamed from: b */
    public long f27521b;

    /* renamed from: c */
    public int f27522c;

    /* renamed from: d */
    public int f27523d;

    /* renamed from: e */
    public int f27524e;

    /* renamed from: f */
    public final int[] f27525f = new int[255];

    /* renamed from: g */
    private final x02 f27526g = new x02(255);

    /* renamed from: a */
    public final void m26244a() {
        this.f27520a = 0;
        this.f27521b = 0L;
        this.f27522c = 0;
        this.f27523d = 0;
        this.f27524e = 0;
    }

    /* renamed from: b */
    public final boolean m26245b(km4 km4Var, boolean z11) {
        m26244a();
        this.f27526g.m27772c(27);
        if (nm4.m24965c(km4Var, this.f27526g.m27777h(), 0, 27, z11) && this.f27526g.m27762A() == 1332176723) {
            if (this.f27526g.m27788s() != 0) {
                if (z11) {
                    return false;
                }
                throw zzbu.m28713c("unsupported bit stream revision");
            }
            this.f27520a = this.f27526g.m27788s();
            this.f27521b = this.f27526g.m27793x();
            this.f27526g.m27794y();
            this.f27526g.m27794y();
            this.f27526g.m27794y();
            int m27788s = this.f27526g.m27788s();
            this.f27522c = m27788s;
            this.f27523d = m27788s + 27;
            this.f27526g.m27772c(m27788s);
            if (nm4.m24965c(km4Var, this.f27526g.m27777h(), 0, this.f27522c, z11)) {
                for (int i11 = 0; i11 < this.f27522c; i11++) {
                    this.f27525f[i11] = this.f27526g.m27788s();
                    this.f27524e += this.f27525f[i11];
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m26246c(km4 km4Var, long j11) {
        boolean z11;
        if (km4Var.zzf() == km4Var.zze()) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        this.f27526g.m27772c(4);
        while (true) {
            if ((j11 == -1 || km4Var.zzf() + 4 < j11) && nm4.m24965c(km4Var, this.f27526g.m27777h(), 0, 4, true)) {
                this.f27526g.m27775f(0);
                if (this.f27526g.m27762A() != 1332176723) {
                    ((yl4) km4Var).m28248l(1, false);
                } else {
                    km4Var.zzj();
                    return true;
                }
            }
        }
        do {
            if (j11 != -1 && km4Var.zzf() >= j11) {
                break;
            }
        } while (km4Var.mo23961c(1) != -1);
        return false;
    }
}
