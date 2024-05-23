package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zzek extends RemoteCreator {
    public zzek() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzcn) {
            return (zzcn) queryLocalInterface;
        }
        return new zzcn(iBinder);
    }

    public final zzcm zza(Context context) {
        zzcm zzckVar;
        try {
            IBinder zze = ((zzcn) getRemoteCreatorInstance(context)).zze(BinderC4273d.m19913I3(context), 223104000);
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
            yk0.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            e = e12;
            yk0.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
