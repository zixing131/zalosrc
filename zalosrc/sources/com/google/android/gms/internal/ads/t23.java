package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class t23 extends e33 {

    /* renamed from: a */
    private final String f28185a;

    /* renamed from: b */
    private final String f28186b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t23(String str, String str2, s23 s23Var) {
        this.f28185a = str;
        this.f28186b = str2;
    }

    @Override // com.google.android.gms.internal.ads.e33
    /* renamed from: a */
    public final String mo21613a() {
        return this.f28186b;
    }

    @Override // com.google.android.gms.internal.ads.e33
    /* renamed from: b */
    public final String mo21614b() {
        return this.f28185a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e33) {
            e33 e33Var = (e33) obj;
            String str = this.f28185a;
            if (str != null ? str.equals(e33Var.mo21614b()) : e33Var.mo21614b() == null) {
                String str2 = this.f28186b;
                if (str2 != null ? str2.equals(e33Var.mo21613a()) : e33Var.mo21613a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f28185a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f28186b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f28185a + ", appId=" + this.f28186b + "}";
    }
}
