package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class xj0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Context f30481p;

    /* renamed from: q */
    final /* synthetic */ pl0 f30482q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xj0(yj0 yj0Var, Context context, pl0 pl0Var) {
        this.f30481p = context;
        this.f30482q = pl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30482q.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.f30481p));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e11) {
            this.f30482q.zze(e11);
            yk0.zzh("Exception while getting advertising Id info", e11);
        }
    }
}
