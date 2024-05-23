package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.sj0;
import com.google.android.gms.internal.ads.tj0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzac extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ v90 zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzau zzauVar, Context context, v90 v90Var) {
        this.zza = context;
        this.zzb = v90Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzo(BinderC4273d.m19913I3(this.zza), this.zzb, 223104000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((tj0) bl0.m20569b(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.al0
                public final Object zza(Object obj) {
                    return sj0.m26337N(obj);
                }
            })).mo26083y(BinderC4273d.m19913I3(this.zza), this.zzb, 223104000);
        } catch (RemoteException | zzcgs | NullPointerException unused) {
            return null;
        }
    }
}
