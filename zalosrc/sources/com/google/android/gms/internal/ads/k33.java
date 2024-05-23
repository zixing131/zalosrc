package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k33 extends b43 {

    /* renamed from: q */
    final /* synthetic */ e33 f23121q;

    /* renamed from: r */
    final /* synthetic */ s33 f23122r;

    /* renamed from: s */
    final /* synthetic */ C22890k f23123s;

    /* renamed from: t */
    final /* synthetic */ n33 f23124t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k33(n33 n33Var, C22890k c22890k, e33 e33Var, s33 s33Var, C22890k c22890k2) {
        super(c22890k);
        this.f23124t = n33Var;
        this.f23121q = e33Var;
        this.f23122r = s33Var;
        this.f23123s = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.x33] */
    @Override // com.google.android.gms.internal.ads.b43
    /* renamed from: a */
    protected final void mo20397a() {
        a43 a43Var;
        String str;
        String str2;
        try {
            ?? m24129e = this.f23124t.f24997a.m24129e();
            e33 e33Var = this.f23121q;
            str2 = this.f23124t.f24998b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", e33Var.mo21614b());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", e33Var.mo21613a());
            m24129e.mo27150E0(bundle, new m33(this.f23124t, this.f23122r));
        } catch (RemoteException e11) {
            a43Var = n33.f24995c;
            str = this.f23124t.f24998b;
            a43Var.m19980c(e11, "dismiss overlay display from: %s", str);
            this.f23123s.m117597d(new RuntimeException(e11));
        }
    }
}
