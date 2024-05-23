package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sc4 {

    /* renamed from: f */
    public static final g94 f27619f = new g94() { // from class: com.google.android.gms.internal.ads.ub4
    };

    /* renamed from: a */
    public final int f27620a;

    /* renamed from: b */
    public final int f27621b;

    /* renamed from: c */
    public final int f27622c;

    /* renamed from: d */
    public final byte[] f27623d;

    /* renamed from: e */
    private int f27624e;

    public sc4(int i11, int i12, int i13, byte[] bArr) {
        this.f27620a = i11;
        this.f27621b = i12;
        this.f27622c = i13;
        this.f27623d = bArr;
    }

    /* renamed from: a */
    public static int m26272a(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: b */
    public static int m26273b(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sc4.class == obj.getClass()) {
            sc4 sc4Var = (sc4) obj;
            if (this.f27620a == sc4Var.f27620a && this.f27621b == sc4Var.f27621b && this.f27622c == sc4Var.f27622c && Arrays.equals(this.f27623d, sc4Var.f27623d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f27624e;
        if (i11 == 0) {
            int hashCode = ((((((this.f27620a + 527) * 31) + this.f27621b) * 31) + this.f27622c) * 31) + Arrays.hashCode(this.f27623d);
            this.f27624e = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final String toString() {
        boolean z11;
        int i11 = this.f27620a;
        int i12 = this.f27621b;
        int i13 = this.f27622c;
        if (this.f27623d != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return "ColorInfo(" + i11 + ", " + i12 + ", " + i13 + ", " + z11 + ")";
    }
}
