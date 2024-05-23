package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p057h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.c50;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.l50;
import com.google.android.gms.internal.ads.p50;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzag extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ v90 zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzau zzauVar, Context context, v90 v90Var, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = v90Var;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* synthetic */ Object zza() {
        return new p50();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzj(BinderC4273d.m19913I3(this.zza), this.zzb, 223104000, new c50(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((l50) bl0.m20569b(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.al0
                public final Object zza(Object obj) {
                    return k50.m23840N(obj);
                }
            })).mo23529G3(BinderC4273d.m19913I3(this.zza), this.zzb, 223104000, new c50(this.zzc));
        } catch (RemoteException | zzcgs | NullPointerException unused) {
            return null;
        }
    }
}
