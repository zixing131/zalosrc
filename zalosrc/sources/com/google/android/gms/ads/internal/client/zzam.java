package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzam extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ v90 zzc;
    final /* synthetic */ zzau zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzau zzauVar, Context context, String str, v90 v90Var) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = v90Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzeo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzb(BinderC4273d.m19913I3(this.zza), this.zzb, this.zzc, 223104000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzi zziVar;
        ue0 ue0Var;
        Object zzbmVar;
        AbstractC4554gx.m22622c(this.zza);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                IBinder zze = ((zzbp) bl0.m20569b(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzal
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbp) {
                            return (zzbp) queryLocalInterface;
                        }
                        return new zzbp(obj);
                    }
                })).zze(BinderC4273d.m19913I3(this.zza), this.zzb, this.zzc, 223104000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbo) {
                    zzbmVar = (zzbo) queryLocalInterface;
                } else {
                    zzbmVar = new zzbm(zze);
                }
                return zzbmVar;
            } catch (RemoteException e11) {
                e = e11;
                this.zzd.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzd.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (zzcgs e12) {
                e = e12;
                this.zzd.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzd.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            } catch (NullPointerException e13) {
                e = e13;
                this.zzd.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzd.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zziVar = this.zzd.zzb;
        return zziVar.zza(this.zza, this.zzb, this.zzc);
    }
}
