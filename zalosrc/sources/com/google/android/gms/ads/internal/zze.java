package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.bk0;
import com.google.android.gms.internal.ads.jw2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.kc3;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.kw2;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.o80;
import com.google.android.gms.internal.ads.qb3;
import com.google.android.gms.internal.ads.r80;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.u80;
import com.google.android.gms.internal.ads.uc3;
import com.google.android.gms.internal.ads.xw2;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzcgv;
import org.json.JSONObject;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcgv zzcgvVar, String str, Runnable runnable, xw2 xw2Var) {
        zzb(context, zzcgvVar, true, null, str, null, runnable, xw2Var);
    }

    final void zzb(Context context, zzcgv zzcgvVar, boolean z11, bk0 bk0Var, String str, String str2, Runnable runnable, xw2 xw2Var) {
        PackageInfo m111064f;
        if (zzt.zzB().mo105914b() - this.zzb < 5000) {
            yk0.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().mo105914b();
        if (bk0Var != null) {
            if (zzt.zzB().mo105913a() - bk0Var.m20553a() <= ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21270i3)).longValue() && bk0Var.m20561i()) {
                return;
            }
        }
        if (context == null) {
            yk0.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            yk0.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        kw2 m23764a = jw2.m23764a(context, 4);
        m23764a.zzf();
        u80 m24168a = zzt.zzf().m24168a(this.zza, zzcgvVar, xw2Var);
        o80 o80Var = r80.f27138b;
        k80 m26871a = m24168a.m26871a("google.afma.config.fetchAppSettings", o80Var, o80Var);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z11);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("experiment_ids", TextUtils.join(",", AbstractC4554gx.m22620a()));
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (m111064f = C21472e.m111067a(context).m111064f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", m111064f.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            tc3 zzb = m26871a.zzb(jSONObject);
            zzd zzdVar = new qb3() { // from class: com.google.android.gms.ads.internal.zzd
                public final /* synthetic */ kw2 zzb;

                public /* synthetic */ zzd(kw2 m23764a2) {
                    r2 = m23764a2;
                }

                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    xw2 xw2Var2 = xw2.this;
                    kw2 kw2Var = r2;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        zzt.zzo().m22936h().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    kw2Var.mo23067q(optBoolean);
                    xw2Var2.m28055b(kw2Var.zzj());
                    return kc3.m23877i(null);
                }
            };
            uc3 uc3Var = kl0.f23368f;
            tc3 m23882n = kc3.m23882n(zzb, zzdVar, uc3Var);
            if (runnable != null) {
                zzb.zzc(runnable, uc3Var);
            }
            nl0.m24944a(m23882n, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e11) {
            yk0.zzh("Error requesting application settings", e11);
            m23764a2.mo23067q(false);
            xw2Var.m28055b(m23764a2.zzj());
        }
    }

    public final void zzc(Context context, zzcgv zzcgvVar, String str, bk0 bk0Var, xw2 xw2Var) {
        String str2;
        if (bk0Var != null) {
            str2 = bk0Var.m20554b();
        } else {
            str2 = null;
        }
        zzb(context, zzcgvVar, false, bk0Var, str2, str, null, xw2Var);
    }
}
