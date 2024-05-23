package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4759mg;

/* loaded from: classes2.dex */
public final class zzcz extends AbstractC4759mg implements zzdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
