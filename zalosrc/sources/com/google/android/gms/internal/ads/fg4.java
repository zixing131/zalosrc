package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fg4 {

    /* renamed from: a */
    public final int f20111a;

    /* renamed from: b */
    public final boolean f20112b;

    public fg4(int i11, boolean z11) {
        this.f20111a = i11;
        this.f20112b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fg4.class == obj.getClass()) {
            fg4 fg4Var = (fg4) obj;
            if (this.f20111a == fg4Var.f20111a && this.f20112b == fg4Var.f20112b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20111a * 31) + (this.f20112b ? 1 : 0);
    }
}
