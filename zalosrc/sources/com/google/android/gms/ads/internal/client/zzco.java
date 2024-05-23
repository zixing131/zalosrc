package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;

/* loaded from: classes2.dex */
public final class zzco extends AbstractC4759mg implements zzcq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcq
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
