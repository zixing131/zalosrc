package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* loaded from: classes2.dex */
public final class sb2 implements rh2 {

    /* renamed from: a */
    public final Context f27608a;

    /* renamed from: b */
    public final zzq f27609b;

    /* renamed from: c */
    public final List f27610c;

    public sb2(Context context, zzq zzqVar, List list) {
        this.f27608a = context;
        this.f27609b = zzqVar;
        this.f27610c = list;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        Bundle bundle = (Bundle) obj;
        if (!((Boolean) AbstractC4408cz.f19035a.m24091e()).booleanValue()) {
            return;
        }
        Bundle bundle2 = new Bundle();
        zzt.zzp();
        String str = null;
        try {
            ActivityManager activityManager = (ActivityManager) this.f27608a.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                componentName = runningTaskInfo.topActivity;
                if (componentName != null) {
                    componentName2 = runningTaskInfo.topActivity;
                    str = componentName2.getClassName();
                }
            }
        } catch (Exception unused) {
        }
        bundle2.putString("activity", str);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("width", this.f27609b.zze);
        bundle3.putInt("height", this.f27609b.zzb);
        bundle2.putBundle("size", bundle3);
        if (!this.f27610c.isEmpty()) {
            List list = this.f27610c;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
        bundle.putBundle("view_hierarchy", bundle2);
    }
}
