package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C4830od;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4830od c4830od;
        C4830od c4830od2;
        zzs zzsVar = this.zza;
        c4830od = zzsVar.zzh;
        if (c4830od != null) {
            c4830od2 = zzsVar.zzh;
            c4830od2.m25161d(motionEvent);
            return false;
        }
        return false;
    }
}
