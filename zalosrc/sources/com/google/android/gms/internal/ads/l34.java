package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class l34 {

    /* renamed from: a */
    public final gf4 f23712a;

    /* renamed from: b */
    public final long f23713b;

    /* renamed from: c */
    public final long f23714c;

    /* renamed from: d */
    public final long f23715d;

    /* renamed from: e */
    public final long f23716e;

    /* renamed from: f */
    public final boolean f23717f;

    /* renamed from: g */
    public final boolean f23718g;

    /* renamed from: h */
    public final boolean f23719h;

    /* renamed from: i */
    public final boolean f23720i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l34(gf4 gf4Var, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16 = true;
        if (!z14 || z12) {
            z15 = true;
        } else {
            z15 = false;
        }
        v71.m27173d(z15);
        if (z13 && !z12) {
            z16 = false;
        }
        v71.m27173d(z16);
        this.f23712a = gf4Var;
        this.f23713b = j11;
        this.f23714c = j12;
        this.f23715d = j13;
        this.f23716e = j14;
        this.f23717f = false;
        this.f23718g = z12;
        this.f23719h = z13;
        this.f23720i = z14;
    }

    /* renamed from: a */
    public final l34 m24110a(long j11) {
        if (j11 == this.f23714c) {
            return this;
        }
        return new l34(this.f23712a, this.f23713b, j11, this.f23715d, this.f23716e, false, this.f23718g, this.f23719h, this.f23720i);
    }

    /* renamed from: b */
    public final l34 m24111b(long j11) {
        if (j11 == this.f23713b) {
            return this;
        }
        return new l34(this.f23712a, j11, this.f23714c, this.f23715d, this.f23716e, false, this.f23718g, this.f23719h, this.f23720i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l34.class == obj.getClass()) {
            l34 l34Var = (l34) obj;
            if (this.f23713b == l34Var.f23713b && this.f23714c == l34Var.f23714c && this.f23715d == l34Var.f23715d && this.f23716e == l34Var.f23716e && this.f23718g == l34Var.f23718g && this.f23719h == l34Var.f23719h && this.f23720i == l34Var.f23720i && g92.m22362t(this.f23712a, l34Var.f23712a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f23712a.hashCode() + 527) * 31) + ((int) this.f23713b)) * 31) + ((int) this.f23714c)) * 31) + ((int) this.f23715d)) * 31) + ((int) this.f23716e)) * 961) + (this.f23718g ? 1 : 0)) * 31) + (this.f23719h ? 1 : 0)) * 31) + (this.f23720i ? 1 : 0);
    }
}
