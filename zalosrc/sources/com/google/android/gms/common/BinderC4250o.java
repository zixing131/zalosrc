package com.google.android.gms.common;

import java.util.Arrays;

/* renamed from: com.google.android.gms.common.o */
/* loaded from: classes2.dex */
final class BinderC4250o extends AbstractBinderC4249n {

    /* renamed from: q */
    private final byte[] f16719q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4250o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f16719q = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC4249n
    /* renamed from: I3 */
    public final byte[] mo19844I3() {
        return this.f16719q;
    }
}
