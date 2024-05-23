package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class e03 extends zz2 {

    /* renamed from: a */
    private final String f19482a;

    /* renamed from: b */
    private final boolean f19483b;

    /* renamed from: c */
    private final boolean f19484c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e03(String str, boolean z11, boolean z12, d03 d03Var) {
        this.f19482a = str;
        this.f19483b = z11;
        this.f19484c = z12;
    }

    @Override // com.google.android.gms.internal.ads.zz2
    /* renamed from: b */
    public final String mo21598b() {
        return this.f19482a;
    }

    @Override // com.google.android.gms.internal.ads.zz2
    /* renamed from: c */
    public final boolean mo21599c() {
        return this.f19484c;
    }

    @Override // com.google.android.gms.internal.ads.zz2
    /* renamed from: d */
    public final boolean mo21600d() {
        return this.f19483b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zz2) {
            zz2 zz2Var = (zz2) obj;
            if (this.f19482a.equals(zz2Var.mo21598b()) && this.f19483b == zz2Var.mo21600d() && this.f19484c == zz2Var.mo21599c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f19482a.hashCode() ^ 1000003) * 1000003;
        int i12 = 1231;
        if (true != this.f19483b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        int i13 = (hashCode ^ i11) * 1000003;
        if (true != this.f19484c) {
            i12 = 1237;
        }
        return i13 ^ i12;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f19482a + ", shouldGetAdvertisingId=" + this.f19483b + ", isGooglePlayServicesAvailable=" + this.f19484c + "}";
    }
}
