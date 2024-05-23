package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class vv2 {

    /* renamed from: a */
    public final String f29490a;

    /* renamed from: b */
    public final String f29491b;

    public vv2(String str, String str2) {
        this.f29490a = str;
        this.f29491b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv2)) {
            return false;
        }
        vv2 vv2Var = (vv2) obj;
        if (this.f29490a.equals(vv2Var.f29490a) && this.f29491b.equals(vv2Var.f29491b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.f29490a).concat(String.valueOf(this.f29491b)).hashCode();
    }
}
