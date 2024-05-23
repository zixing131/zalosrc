package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class c33 extends u33 {

    /* renamed from: a */
    private final String f18095a;

    /* renamed from: b */
    private final String f18096b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c33(String str, String str2, b33 b33Var) {
        this.f18095a = str;
        this.f18096b = str2;
    }

    @Override // com.google.android.gms.internal.ads.u33
    /* renamed from: a */
    public final String mo20791a() {
        return this.f18096b;
    }

    @Override // com.google.android.gms.internal.ads.u33
    /* renamed from: b */
    public final String mo20792b() {
        return this.f18095a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u33) {
            u33 u33Var = (u33) obj;
            String str = this.f18095a;
            if (str != null ? str.equals(u33Var.mo20792b()) : u33Var.mo20792b() == null) {
                String str2 = this.f18096b;
                if (str2 != null ? str2.equals(u33Var.mo20791a()) : u33Var.mo20791a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f18095a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f18096b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f18095a + ", appId=" + this.f18096b + "}";
    }
}
