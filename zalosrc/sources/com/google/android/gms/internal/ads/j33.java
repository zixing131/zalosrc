package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j33 extends b43 {

    /* renamed from: q */
    final /* synthetic */ p33 f22615q;

    /* renamed from: r */
    final /* synthetic */ s33 f22616r;

    /* renamed from: s */
    final /* synthetic */ C22890k f22617s;

    /* renamed from: t */
    final /* synthetic */ n33 f22618t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(n33 n33Var, C22890k c22890k, p33 p33Var, s33 s33Var, C22890k c22890k2) {
        super(c22890k);
        this.f22618t = n33Var;
        this.f22615q = p33Var;
        this.f22616r = s33Var;
        this.f22617s = c22890k2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.x33] */
    @Override // com.google.android.gms.internal.ads.b43
    /* renamed from: a */
    protected final void mo20397a() {
        a43 a43Var;
        String str;
        String str2;
        String str3;
        try {
            ?? m24129e = this.f22618t.f24997a.m24129e();
            n33 n33Var = this.f22618t;
            str2 = n33Var.f24998b;
            p33 p33Var = this.f22615q;
            str3 = n33Var.f24998b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", p33Var.mo25391e());
            bundle.putString("adFieldEnifd", p33Var.mo25392f());
            bundle.putInt("layoutGravity", p33Var.mo25389c());
            bundle.putFloat("layoutVerticalMargin", p33Var.mo25387a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", p33Var.mo25390d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (p33Var.mo25393g() != null) {
                bundle.putString("appId", p33Var.mo25393g());
            }
            m24129e.mo27151F3(str2, bundle, new m33(this.f22618t, this.f22616r));
        } catch (RemoteException e11) {
            a43Var = n33.f24995c;
            str = this.f22618t.f24998b;
            a43Var.m19980c(e11, "show overlay display from: %s", str);
            this.f22617s.m117597d(new RuntimeException(e11));
        }
    }
}
