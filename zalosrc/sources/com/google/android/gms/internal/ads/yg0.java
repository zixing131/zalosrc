package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class yg0 extends AbstractC4759mg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public yg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(InterfaceC4271b interfaceC4271b, String str, v90 v90Var, int i11) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        zzbk.recycle();
        return readStrongBinder;
    }
}
