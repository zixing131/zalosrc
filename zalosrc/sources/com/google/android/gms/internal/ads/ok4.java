package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ok4 implements DisplayManager.DisplayListener, mk4 {

    /* renamed from: a */
    private final DisplayManager f25678a;

    /* renamed from: b */
    private jk4 f25679b;

    private ok4(DisplayManager displayManager) {
        this.f25678a = displayManager;
    }

    /* renamed from: b */
    public static mk4 m25204b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ok4(displayManager);
        }
        return null;
    }

    /* renamed from: c */
    private final Display m25205c() {
        return this.f25678a.getDisplay(0);
    }

    @Override // com.google.android.gms.internal.ads.mk4
    /* renamed from: a */
    public final void mo24621a(jk4 jk4Var) {
        this.f25679b = jk4Var;
        this.f25678a.registerDisplayListener(this, g92.m22339d(null));
        qk4.m25760b(jk4Var.f22859a, m25205c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i11) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i11) {
        jk4 jk4Var = this.f25679b;
        if (jk4Var != null && i11 == 0) {
            qk4.m25760b(jk4Var.f22859a, m25205c());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.mk4
    public final void zza() {
        this.f25678a.unregisterDisplayListener(this);
        this.f25679b = null;
    }
}
