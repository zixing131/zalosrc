package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.pf1;
import p229i5.AbstractC20295p;

/* loaded from: classes2.dex */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z11) {
        zzx zzxVar;
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            pf1 pf1Var = adOverlayInfoParcel.zzy;
            if (pf1Var != null) {
                pf1Var.zzq();
            }
            Activity zzk = adOverlayInfoParcel.zzd.zzk();
            zzc zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null && zzcVar.zzj && zzk != null) {
                context = zzk;
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zzz zzzVar = adOverlayInfoParcel.zzi;
            if (zzcVar2 != null) {
                zzxVar = zzcVar2.zzi;
            } else {
                zzxVar = null;
            }
            zza.zzb(context, zzcVar2, zzzVar, zzxVar);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.f32033s);
        intent.putExtra("shouldCallOnOverlayOpened", z11);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!AbstractC20295p.m105952f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzs.zzJ(context, intent);
    }
}
