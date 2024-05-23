package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC4777my;
import com.google.android.gms.internal.ads.ph2;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import p289k5.C21472e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context, String str) {
        String concat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + C21472e.m111067a(context).m111064f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            yk0.zzh("Unable to get package version name for reporting", e11);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = concat;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcgv zzcgvVar) {
        Bundle bundle;
        this.zzd = zzlVar.zzj.zza;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle == null) {
            return;
        }
        String str = (String) AbstractC4777my.f24905c.m24091e();
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.zze = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzc.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.zzc.put("SDKVersion", zzcgvVar.f32030p);
        if (((Boolean) AbstractC4777my.f24903a.m24091e()).booleanValue()) {
            try {
                Bundle m25470a = ph2.m25470a(this.zza, new JSONArray((String) AbstractC4777my.f24904b.m24091e()));
                for (String str3 : m25470a.keySet()) {
                    this.zzc.put(str3, m25470a.get(str3).toString());
                }
            } catch (JSONException e11) {
                yk0.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e11);
            }
        }
    }
}
