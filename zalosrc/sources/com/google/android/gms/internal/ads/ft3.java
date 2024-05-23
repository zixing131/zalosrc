package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ft3 extends it3 {

    /* renamed from: u */
    private final int f20283u;

    /* renamed from: v */
    private final int f20284v;

    public ft3(byte[] bArr, int i11, int i12) {
        super(bArr);
        mt3.m24723D(i11, i11 + i12, bArr.length);
        this.f20283u = i11;
        this.f20284v = i12;
    }

    @Override // com.google.android.gms.internal.ads.it3
    /* renamed from: Q */
    protected final int mo22165Q() {
        return this.f20283u;
    }

    @Override // com.google.android.gms.internal.ads.it3, com.google.android.gms.internal.ads.mt3
    /* renamed from: l */
    public final byte mo22166l(int i11) {
        mt3.m24731e(i11, this.f20284v);
        return this.f22400t[this.f20283u + i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.it3, com.google.android.gms.internal.ads.mt3
    /* renamed from: m */
    public final byte mo22167m(int i11) {
        return this.f22400t[this.f20283u + i11];
    }

    @Override // com.google.android.gms.internal.ads.it3, com.google.android.gms.internal.ads.mt3
    /* renamed from: p */
    public final int mo22168p() {
        return this.f20284v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.it3, com.google.android.gms.internal.ads.mt3
    /* renamed from: r */
    public final void mo22169r(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f22400t, this.f20283u + i11, bArr, i12, i13);
    }
}
