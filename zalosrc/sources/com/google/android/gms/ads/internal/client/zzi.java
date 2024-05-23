package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbp) {
            return (zzbp) queryLocalInterface;
        }
        return new zzbp(iBinder);
    }

    public final zzbo zza(Context context, String str, v90 v90Var) {
        zzbo zzbmVar;
        try {
            IBinder zze = ((zzbp) getRemoteCreatorInstance(context)).zze(BinderC4273d.m19913I3(context), str, v90Var, 223104000);
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
            yk0.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            e = e12;
            yk0.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
