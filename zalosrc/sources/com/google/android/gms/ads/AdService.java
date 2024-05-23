package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            zzaw.zza().zzl(this, new s90()).mo21694S(intent);
        } catch (RemoteException e11) {
            yk0.zzg("RemoteException calling handleNotificationIntent: ".concat(e11.toString()));
        }
    }
}
