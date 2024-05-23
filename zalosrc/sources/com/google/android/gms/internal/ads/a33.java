package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a33 extends t33 {

    /* renamed from: a */
    private String f16909a;

    /* renamed from: b */
    private String f16910b;

    @Override // com.google.android.gms.internal.ads.t33
    /* renamed from: a */
    public final t33 mo19974a(String str) {
        this.f16910b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.t33
    /* renamed from: b */
    public final t33 mo19975b(String str) {
        this.f16909a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.t33
    /* renamed from: c */
    public final u33 mo19976c() {
        return new c33(this.f16909a, this.f16910b, null);
    }
}
