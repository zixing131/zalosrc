package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.s90;

/* loaded from: classes2.dex */
public class OfflinePingSender extends Worker {
    private final gd0 zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzaw.zza().zzl(context, new s90());
    }

    @Override // androidx.work.Worker
    public final AbstractC2252t.a doWork() {
        try {
            this.zza.zzf();
            return AbstractC2252t.a.m11891c();
        } catch (RemoteException unused) {
            return AbstractC2252t.a.m11889a();
        }
    }
}
