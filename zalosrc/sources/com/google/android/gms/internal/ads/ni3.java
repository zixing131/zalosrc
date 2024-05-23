package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ni3 implements di3 {

    /* renamed from: a */
    private final ss3 f25207a;

    /* renamed from: b */
    private final ss3 f25208b;

    private ni3(byte[] bArr, byte[] bArr2) {
        this.f25207a = ss3.m26397a(bArr);
        this.f25208b = ss3.m26397a(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ni3 m24929a(byte[] bArr, byte[] bArr2, int i11) {
        tr3.m26721e(tr3.m26726j(tr3.m26727k(i11), 1, bArr2), tr3.m26724h(i11, bArr));
        return new ni3(bArr, bArr2);
    }
}
