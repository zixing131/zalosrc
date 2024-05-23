package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class nk4 implements mk4 {

    /* renamed from: a */
    private final WindowManager f25227a;

    private nk4(WindowManager windowManager) {
        this.f25227a = windowManager;
    }

    /* renamed from: b */
    public static mk4 m24938b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new nk4(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mk4
    /* renamed from: a */
    public final void mo24621a(jk4 jk4Var) {
        qk4.m25760b(jk4Var.f22859a, this.f25227a.getDefaultDisplay());
    }

    @Override // com.google.android.gms.internal.ads.mk4
    public final void zza() {
    }
}
