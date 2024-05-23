package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class k30 implements c40 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        WindowManager windowManager = (WindowManager) zq0Var.getContext().getSystemService("window");
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr(windowManager);
        int i11 = zzr.widthPixels;
        int i12 = zzr.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zq0Var).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i11));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i12));
        zq0Var.mo23552V("locationReady", hashMap);
        yk0.zzj("GET LOCATION COMPILED");
    }
}
