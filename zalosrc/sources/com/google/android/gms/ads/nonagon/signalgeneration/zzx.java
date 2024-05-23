package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.gc3;
import com.google.android.gms.internal.ads.ox2;
import com.google.android.gms.internal.ads.yk0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzx implements gc3 {
    final /* synthetic */ de0 zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzaa zzaaVar, de0 de0Var, boolean z11) {
        this.zzc = zzaaVar;
        this.zza = de0Var;
        this.zzb = z11;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        try {
            this.zza.mo20484c("Internal error: " + th2.getMessage());
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z11;
        String str;
        Uri zzW;
        ox2 ox2Var;
        ox2 ox2Var2;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.mo20485t0(arrayList);
            z11 = this.zzc.zzt;
            if (!z11 && !this.zzb) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.zzc.zzO(uri)) {
                    str = this.zzc.zzC;
                    zzW = zzaa.zzW(uri, str, "1");
                    ox2Var = this.zzc.zzs;
                    ox2Var.m25355c(zzW.toString(), null);
                } else {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20948B6)).booleanValue()) {
                        ox2Var2 = this.zzc.zzs;
                        ox2Var2.m25355c(uri.toString(), null);
                    }
                }
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
