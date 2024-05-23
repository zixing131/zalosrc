package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzcgs;

/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private ue0 zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbt) {
            return (zzbt) queryLocalInterface;
        }
        return new zzbt(iBinder);
    }

    public final zzbs zza(Context context, zzq zzqVar, String str, v90 v90Var, int i11) {
        zzbs zzbqVar;
        zzbs zzbqVar2;
        AbstractC4554gx.m22622c(context);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21375s8)).booleanValue()) {
            try {
                IBinder zze = ((zzbt) bl0.m20569b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new al0() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.al0
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbt) {
                            return (zzbt) queryLocalInterface;
                        }
                        return new zzbt(obj);
                    }
                })).zze(BinderC4273d.m19913I3(context), zzqVar, str, v90Var, 223104000, i11);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbs) {
                    zzbqVar = (zzbs) queryLocalInterface;
                } else {
                    zzbqVar = new zzbq(zze);
                }
                return zzbqVar;
            } catch (RemoteException e11) {
                e = e11;
                ue0 m26287c = se0.m26287c(context);
                this.zza = m26287c;
                m26287c.mo26290b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                yk0.zzl("#007 Could not call remote method.", e);
                return null;
            } catch (zzcgs e12) {
                e = e12;
                ue0 m26287c2 = se0.m26287c(context);
                this.zza = m26287c2;
                m26287c2.mo26290b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                yk0.zzl("#007 Could not call remote method.", e);
                return null;
            } catch (NullPointerException e13) {
                e = e13;
                ue0 m26287c22 = se0.m26287c(context);
                this.zza = m26287c22;
                m26287c22.mo26290b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                yk0.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbt) getRemoteCreatorInstance(context)).zze(BinderC4273d.m19913I3(context), zzqVar, str, v90Var, 223104000, i11);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbs) {
                zzbqVar2 = (zzbs) queryLocalInterface2;
            } else {
                zzbqVar2 = new zzbq(zze2);
            }
            return zzbqVar2;
        } catch (RemoteException e14) {
            e = e14;
            yk0.zzf("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e15) {
            e = e15;
            yk0.zzf("Could not create remote AdManager.", e);
            return null;
        }
    }
}
