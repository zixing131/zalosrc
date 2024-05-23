package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l33 extends b43 {

    /* renamed from: q */
    final /* synthetic */ u33 f23707q;

    /* renamed from: r */
    final /* synthetic */ int f23708r;

    /* renamed from: s */
    final /* synthetic */ s33 f23709s;

    /* renamed from: t */
    final /* synthetic */ C22890k f23710t;

    /* renamed from: u */
    final /* synthetic */ n33 f23711u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l33(n33 n33Var, C22890k c22890k, u33 u33Var, int i11, s33 s33Var, C22890k c22890k2) {
        super(c22890k);
        this.f23711u = n33Var;
        this.f23707q = u33Var;
        this.f23708r = i11;
        this.f23709s = s33Var;
        this.f23710t = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.x33] */
    @Override // com.google.android.gms.internal.ads.b43
    /* renamed from: a */
    protected final void mo20397a() {
        a43 a43Var;
        String str;
        String str2;
        try {
            ?? m24129e = this.f23711u.f24997a.m24129e();
            u33 u33Var = this.f23707q;
            str2 = this.f23711u.f24998b;
            int i11 = this.f23708r;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", u33Var.mo20792b());
            bundle.putInt("displayMode", i11);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", u33Var.mo20791a());
            m24129e.mo27152N4(bundle, new m33(this.f23711u, this.f23709s));
        } catch (RemoteException e11) {
            a43Var = n33.f24995c;
            str = this.f23711u.f24998b;
            a43Var.m19980c(e11, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f23708r), str);
            this.f23710t.m117597d(new RuntimeException(e11));
        }
    }
}
