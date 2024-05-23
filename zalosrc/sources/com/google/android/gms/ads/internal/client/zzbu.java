package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;

/* loaded from: classes2.dex */
public final class zzbu extends AbstractC4759mg implements zzbw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbw
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
