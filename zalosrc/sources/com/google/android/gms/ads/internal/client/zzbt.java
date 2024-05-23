package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.v90;

/* loaded from: classes2.dex */
public final class zzbt extends AbstractC4759mg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(InterfaceC4271b interfaceC4271b, zzq zzqVar, String str, v90 v90Var, int i11, int i12) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        zza.writeInt(i12);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
