package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.te */
/* loaded from: classes2.dex */
public final class C5017te implements AppOpsManager.OnOpActiveChangedListener {

    /* renamed from: a */
    final /* synthetic */ C5091ve f28292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5017te(C5091ve c5091ve) {
        this.f28292a = c5091ve;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i11, String str2, boolean z11) {
        long j11;
        long j12;
        long j13;
        if (z11) {
            this.f28292a.f29281a = System.currentTimeMillis();
            this.f28292a.f29284d = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C5091ve c5091ve = this.f28292a;
        j11 = c5091ve.f29282b;
        if (j11 > 0) {
            j12 = c5091ve.f29282b;
            if (currentTimeMillis >= j12) {
                j13 = c5091ve.f29282b;
                c5091ve.f29283c = currentTimeMillis - j13;
            }
        }
        this.f28292a.f29284d = false;
    }
}
