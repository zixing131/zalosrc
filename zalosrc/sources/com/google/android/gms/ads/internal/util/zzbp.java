package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public final class zzbp extends AbstractC4759mg implements zzbr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(InterfaceC4271b interfaceC4271b) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(InterfaceC4271b interfaceC4271b, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        zza.writeString(str2);
        Parcel zzbk = zzbk(1, zza);
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }
}
