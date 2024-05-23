package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class lw3 {

    /* renamed from: a */
    public final String f24260a;

    /* renamed from: b */
    public final C4671k3 f24261b;

    /* renamed from: c */
    public final C4671k3 f24262c;

    /* renamed from: d */
    public final int f24263d;

    /* renamed from: e */
    public final int f24264e;

    public lw3(String str, C4671k3 c4671k3, C4671k3 c4671k32, int i11, int i12) {
        boolean z11 = true;
        if (i11 != 0) {
            if (i12 == 0) {
                i12 = 0;
            } else {
                z11 = false;
            }
        }
        v71.m27173d(z11);
        v71.m27172c(str);
        this.f24260a = str;
        c4671k3.getClass();
        this.f24261b = c4671k3;
        c4671k32.getClass();
        this.f24262c = c4671k32;
        this.f24263d = i11;
        this.f24264e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lw3.class == obj.getClass()) {
            lw3 lw3Var = (lw3) obj;
            if (this.f24263d == lw3Var.f24263d && this.f24264e == lw3Var.f24264e && this.f24260a.equals(lw3Var.f24260a) && this.f24261b.equals(lw3Var.f24261b) && this.f24262c.equals(lw3Var.f24262c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f24263d + 527) * 31) + this.f24264e) * 31) + this.f24260a.hashCode()) * 31) + this.f24261b.hashCode()) * 31) + this.f24262c.hashCode();
    }
}
