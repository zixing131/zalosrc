package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.nd0;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaa extends zzav {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzau zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzau zzauVar, Activity activity) {
        this.zzb = zzauVar;
        this.zza = activity;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzl(BinderC4273d.m19913I3(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        ue0 ue0Var;
        kd0 kd0Var;
        AbstractC4554gx.m22622c(this.zza);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                return nd0.zzF(((rd0) bl0.m20569b(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        return qd0.m25693N(obj);
                    }
                })).zze(BinderC4273d.m19913I3(this.zza)));
            } catch (RemoteException | zzcgs | NullPointerException e11) {
                this.zzb.zzh = se0.m26287c(this.zza.getApplicationContext());
                ue0Var = this.zzb.zzh;
                ue0Var.mo26290b(e11, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        kd0Var = this.zzb.zzf;
        return kd0Var.m23888a(this.zza);
    }
}
