package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vf4 {

    /* renamed from: d */
    public static final vf4 f29300d = new vf4(0, 0, 0);

    /* renamed from: e */
    public static final g94 f29301e = new g94() { // from class: com.google.android.gms.internal.ads.xe4
    };

    /* renamed from: a */
    public final int f29302a = 0;

    /* renamed from: b */
    public final int f29303b;

    /* renamed from: c */
    public final int f29304c;

    public vf4(int i11, int i12, int i13) {
        this.f29303b = i12;
        this.f29304c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf4)) {
            return false;
        }
        vf4 vf4Var = (vf4) obj;
        int i11 = vf4Var.f29302a;
        if (this.f29303b == vf4Var.f29303b && this.f29304c == vf4Var.f29304c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29303b + 16337) * 31) + this.f29304c;
    }
}
