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
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzau zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzau zzauVar, Context context) {
        this.zzb = zzauVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "mobile_ads_settings");
        return new zzes();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzg(BinderC4273d.m19913I3(this.zza), 223104000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzek zzekVar;
        ue0 ue0Var;
        Object zzckVar;
        AbstractC4554gx.m22622c(this.zza);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                IBinder zze = ((zzcn) bl0.m20569b(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzcn) {
                            return (zzcn) queryLocalInterface;
                        }
                        return new zzcn(obj);
                    }
                })).zze(BinderC4273d.m19913I3(this.zza), 223104000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzcm) {
                    zzckVar = (zzcm) queryLocalInterface;
                } else {
                    zzckVar = new zzck(zze);
                }
                return zzckVar;
            } catch (RemoteException e11) {
                e = e11;
                this.zzb.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzb.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (zzcgs e12) {
                e = e12;
                this.zzb.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzb.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            } catch (NullPointerException e13) {
                e = e13;
                this.zzb.zzh = se0.m26287c(this.zza);
                ue0Var = this.zzb.zzh;
                ue0Var.mo26290b(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzekVar = this.zzb.zzc;
        return zzekVar.zza(this.zza);
    }
}
