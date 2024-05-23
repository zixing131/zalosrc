package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class qh3 implements xd3 {

    /* renamed from: a */
    final ze3 f26782a;

    public qh3(ze3 ze3Var) {
        this.f26782a = ze3Var;
    }

    @Override // com.google.android.gms.internal.ads.xd3
    /* renamed from: a */
    public final byte[] mo20126a(byte[] bArr, byte[] bArr2) {
        ze3 ze3Var = this.f26782a;
        if (ze3Var.m28487a() != null) {
            return jr3.m23728c(ze3Var.m28487a().m26604d(), ((xd3) this.f26782a.m28487a().m26603c()).mo20126a(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
