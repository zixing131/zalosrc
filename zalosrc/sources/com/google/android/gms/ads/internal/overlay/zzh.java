package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zq0;

/* loaded from: classes2.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zq0 zq0Var) throws zzf {
        this.zzb = zq0Var.getLayoutParams();
        ViewParent parent = zq0Var.getParent();
        this.zzd = zq0Var.mo26694e();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zq0Var.mo23737i());
            viewGroup.removeView(zq0Var.mo23737i());
            zq0Var.mo26705r0(true);
            return;
        }
        throw new zzf("Could not get the parent of the WebView for an overlay.");
    }
}
