package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class nf2 implements rh2 {

    /* renamed from: a */
    public final hq2 f25170a;

    public nf2(hq2 hq2Var) {
        this.f25170a = hq2Var;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        hq2 hq2Var = this.f25170a;
        if (hq2Var != null) {
            bundle.putBoolean("render_in_browser", hq2Var.m23000d());
            bundle.putBoolean("disable_ml", this.f25170a.m22999c());
        }
    }
}
