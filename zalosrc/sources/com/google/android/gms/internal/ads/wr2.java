package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public abstract class wr2 {
    /* renamed from: a */
    public static void m27704a(Context context, boolean z11) {
        if (z11) {
            yk0.zzi("This request is sent from a test device.");
            return;
        }
        zzaw.zzb();
        yk0.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + rk0.m26116z(context) + "\")) to get test ads on this device.");
    }

    /* renamed from: b */
    public static void m27705b(int i11, Throwable th2, String str) {
        yk0.zzi("Ad failed to load : " + i11);
        zze.zzb(str, th2);
        if (i11 == 3) {
            return;
        }
        zzt.zzo().m22944s(th2, str);
    }
}
