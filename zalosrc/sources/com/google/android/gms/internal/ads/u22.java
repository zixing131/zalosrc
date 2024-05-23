package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
final class u22 extends TimerTask {

    /* renamed from: p */
    final /* synthetic */ AlertDialog f28710p;

    /* renamed from: q */
    final /* synthetic */ Timer f28711q;

    /* renamed from: r */
    final /* synthetic */ zzl f28712r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u22(AlertDialog alertDialog, Timer timer, zzl zzlVar) {
        this.f28710p = alertDialog;
        this.f28711q = timer;
        this.f28712r = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f28710p.dismiss();
        this.f28711q.cancel();
        zzl zzlVar = this.f28712r;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
