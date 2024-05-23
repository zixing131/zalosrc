package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.p057h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.gh0;
import com.google.android.gms.internal.ads.i50;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.ue0;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.yk0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzau {
    private final zzk zza;
    private final zzi zzb;
    private final zzek zzc;
    private final l20 zzd;
    private final gh0 zze;
    private final kd0 zzf;
    private final m20 zzg;
    private ue0 zzh;

    public zzau(zzk zzkVar, zzi zziVar, zzek zzekVar, l20 l20Var, gh0 gh0Var, kd0 kd0Var, m20 m20Var) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzekVar;
        this.zzd = l20Var;
        this.zze = gh0Var;
        this.zzf = kd0Var;
        this.zzg = m20Var;
    }

    public static /* bridge */ /* synthetic */ void zzs(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().m26124o(context, zzaw.zzc().f32030p, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, v90 v90Var) {
        return (zzbo) new zzam(this, context, str, v90Var).zzd(context, false);
    }

    public final zzbs zzd(Context context, zzq zzqVar, String str, v90 v90Var) {
        return (zzbs) new zzai(this, context, zzqVar, str, v90Var).zzd(context, false);
    }

    public final zzbs zze(Context context, zzq zzqVar, String str, v90 v90Var) {
        return (zzbs) new zzak(this, context, zzqVar, str, v90Var).zzd(context, false);
    }

    public final o00 zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (o00) new zzaq(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final u00 zzh(View view, HashMap hashMap, HashMap hashMap2) {
        return (u00) new zzas(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final i50 zzk(Context context, v90 v90Var, OnH5AdsEventListener onH5AdsEventListener) {
        return (i50) new zzag(this, context, v90Var, onH5AdsEventListener).zzd(context, false);
    }

    public final gd0 zzl(Context context, v90 v90Var) {
        return (gd0) new zzae(this, context, v90Var).zzd(context, false);
    }

    public final od0 zzn(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z11 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            yk0.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z11 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (od0) zzaaVar.zzd(activity, z11);
    }

    public final ug0 zzp(Context context, String str, v90 v90Var) {
        return (ug0) new zzat(this, context, str, v90Var).zzd(context, false);
    }

    public final qj0 zzq(Context context, v90 v90Var) {
        return (qj0) new zzac(this, context, v90Var).zzd(context, false);
    }
}
