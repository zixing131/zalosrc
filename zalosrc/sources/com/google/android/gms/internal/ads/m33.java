package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class m33 extends y33 {

    /* renamed from: p */
    private final s33 f24360p;

    /* renamed from: q */
    final /* synthetic */ n33 f24361q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m33(n33 n33Var, s33 s33Var) {
        this.f24361q = n33Var;
        this.f24360p = s33Var;
    }

    @Override // com.google.android.gms.internal.ads.z33
    /* renamed from: w */
    public final void mo24452w(Bundle bundle) {
        int i11 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        q33 m25946c = r33.m25946c();
        m25946c.mo25650b(i11);
        if (string != null) {
            m25946c.mo25649a(string);
        }
        this.f24360p.zza(m25946c.mo25651c());
        if (i11 == 8157) {
            this.f24361q.m24807c();
        }
    }
}
