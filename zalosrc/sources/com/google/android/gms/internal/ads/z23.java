package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class z23 extends r33 {

    /* renamed from: a */
    private final int f31329a;

    /* renamed from: b */
    private final String f31330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ z23(int i11, String str, y23 y23Var) {
        this.f31329a = i11;
        this.f31330b = str;
    }

    @Override // com.google.android.gms.internal.ads.r33
    /* renamed from: a */
    public final int mo25947a() {
        return this.f31329a;
    }

    @Override // com.google.android.gms.internal.ads.r33
    /* renamed from: b */
    public final String mo25948b() {
        return this.f31330b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r33) {
            r33 r33Var = (r33) obj;
            if (this.f31329a == r33Var.mo25947a() && ((str = this.f31330b) != null ? str.equals(r33Var.mo25948b()) : r33Var.mo25948b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i11 = (this.f31329a ^ 1000003) * 1000003;
        String str = this.f31330b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i11 ^ hashCode;
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f31329a + ", sessionToken=" + this.f31330b + "}";
    }
}
