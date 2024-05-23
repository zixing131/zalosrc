package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        if (xk0.m27902k(context) && !xk0.m27904m()) {
            tc3 zzb = new zzc(context).zzb();
            yk0.zzi("Updating ad debug logging enablement.");
            nl0.m24944a(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
