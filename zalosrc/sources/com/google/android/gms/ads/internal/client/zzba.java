package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;

/* loaded from: classes2.dex */
public final class zzba extends AbstractC4759mg implements zzbc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc
    public final void zzb() throws RemoteException {
        zzbl(1, zza());
    }
}
