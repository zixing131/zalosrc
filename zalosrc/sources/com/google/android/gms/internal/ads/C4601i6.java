package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i6 */
/* loaded from: classes2.dex */
final class C4601i6 extends ul4 {
    public C4601i6(a72 a72Var, long j11, long j12) {
        super(new pl4(), new C4564h6(a72Var, null), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* bridge */ /* synthetic */ int m23130h(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}
