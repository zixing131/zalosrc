package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zzcv implements MuteThisAdReason {
    private final String zza;
    private final zzcu zzb;

    public zzcv(zzcu zzcuVar) {
        String str;
        this.zzb = zzcuVar;
        try {
            str = zzcuVar.zze();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzcu zza() {
        return this.zzb;
    }
}
