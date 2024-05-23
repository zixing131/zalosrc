package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class s41 {

    /* renamed from: e */
    public static final s41 f27527e = new s41(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final g94 f27528f = new g94() { // from class: com.google.android.gms.internal.ads.q31
    };

    /* renamed from: a */
    public final int f27529a;

    /* renamed from: b */
    public final int f27530b;

    /* renamed from: c */
    public final int f27531c;

    /* renamed from: d */
    public final float f27532d;

    public s41(int i11, int i12, int i13, float f11) {
        this.f27529a = i11;
        this.f27530b = i12;
        this.f27531c = i13;
        this.f27532d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s41) {
            s41 s41Var = (s41) obj;
            if (this.f27529a == s41Var.f27529a && this.f27530b == s41Var.f27530b && this.f27531c == s41Var.f27531c && this.f27532d == s41Var.f27532d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f27529a + 217) * 31) + this.f27530b) * 31) + this.f27531c) * 31) + Float.floatToRawIntBits(this.f27532d);
    }
}
