package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
/* loaded from: classes2.dex */
final class C5560q8 extends C5611t8 {

    /* renamed from: u */
    private final int f32747u;

    public C5560q8(byte[] bArr, int i11, int i12) {
        super(bArr);
        AbstractC5679x8.m30020p(0, i12, bArr.length);
        this.f32747u = i12;
    }

    @Override // com.google.android.gms.internal.measurement.C5611t8, com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: d */
    public final byte mo29549d(int i11) {
        int i12 = this.f32747u;
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
        return this.f32809t[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C5611t8, com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: e */
    public final byte mo29550e(int i11) {
        return this.f32809t[i11];
    }

    @Override // com.google.android.gms.internal.measurement.C5611t8, com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: g */
    public final int mo29551g() {
        return this.f32747u;
    }

    @Override // com.google.android.gms.internal.measurement.C5611t8
    /* renamed from: u */
    protected final int mo29552u() {
        return 0;
    }
}
