package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h0 */
/* loaded from: classes2.dex */
final class C5767h0 extends C5785k0 {

    /* renamed from: u */
    private final int f33324u;

    public C5767h0(byte[] bArr, int i11, int i12) {
        super(bArr);
        AbstractC5803n0.m30371p(0, i12, bArr.length);
        this.f33324u = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.C5785k0, com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: d */
    public final byte mo30239d(int i11) {
        int i12 = this.f33324u;
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
        return this.f33343t[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.C5785k0, com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: e */
    public final byte mo30240e(int i11) {
        return this.f33343t[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.C5785k0, com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: g */
    public final int mo30241g() {
        return this.f33324u;
    }

    @Override // com.google.android.gms.internal.play_billing.C5785k0
    /* renamed from: u */
    protected final int mo30242u() {
        return 0;
    }
}
