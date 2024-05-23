package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fh4 {

    /* renamed from: a */
    public final long f20120a;

    /* renamed from: b */
    public final long f20121b;

    public fh4(long j11, long j12) {
        this.f20120a = j11;
        this.f20121b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh4)) {
            return false;
        }
        fh4 fh4Var = (fh4) obj;
        if (this.f20120a == fh4Var.f20120a && this.f20121b == fh4Var.f20121b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f20120a) * 31) + ((int) this.f20121b);
    }
}
