package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fu3 {

    /* renamed from: a */
    private final Object f20285a;

    /* renamed from: b */
    private final int f20286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fu3(Object obj, int i11) {
        this.f20285a = obj;
        this.f20286b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu3)) {
            return false;
        }
        fu3 fu3Var = (fu3) obj;
        if (this.f20285a != fu3Var.f20285a || this.f20286b != fu3Var.f20286b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f20285a) * 65535) + this.f20286b;
    }
}
