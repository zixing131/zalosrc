package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class oq1 implements r81 {

    /* renamed from: p */
    private final zq0 f25740p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oq1(zq0 zq0Var) {
        this.f25740p = zq0Var;
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: r */
    public final void mo20722r(Context context) {
        zq0 zq0Var = this.f25740p;
        if (zq0Var != null) {
            zq0Var.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: t */
    public final void mo20723t(Context context) {
        zq0 zq0Var = this.f25740p;
        if (zq0Var != null) {
            zq0Var.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: z */
    public final void mo20724z(Context context) {
        zq0 zq0Var = this.f25740p;
        if (zq0Var != null) {
            zq0Var.onResume();
        }
    }
}
