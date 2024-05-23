package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.rk0;

@TargetApi(24)
/* loaded from: classes2.dex */
public class zzu extends zzt {
    static final boolean zzf(int i11, int i12, int i13) {
        if (Math.abs(i11 - i12) <= i13) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        int i11;
        boolean isInMultiWindowMode;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21154W3)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21172Y3)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        int m26115y = rk0.m26115y(activity, configuration.screenHeightDp);
        int m26115y2 = rk0.m26115y(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzr = zzs.zzr(windowManager);
        int i12 = zzr.heightPixels;
        int i13 = zzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i11 = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i11 = 0;
        }
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21135U3)).intValue();
        if (zzf(i12, m26115y + i11, round) && zzf(i13, m26115y2, round)) {
            return false;
        }
        return true;
    }
}
