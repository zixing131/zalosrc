package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.bw1;
import com.google.android.gms.internal.ads.cw1;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.yk0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class zzaw {
    private cw1 zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    protected static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        tc3 zzb = new zzbo(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21125T3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            yk0.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e11);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e12) {
            yk0.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e12);
            zzb.cancel(true);
            return null;
        } catch (Exception e13) {
            yk0.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e13);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzp();
                try {
                    str5 = new String(AbstractC20291l.m105943e(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    yk0.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e11) {
                        yk0.zzh("Error writing to file in internal storage.", e11);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final cw1 zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        cw1 cw1Var;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue() && (cw1Var = this.zzg) != null) {
            cw1Var.m21177h(new zzat(this, context), bw1.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzQ(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21085P3), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21115S3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzH(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z11) {
        synchronized (this.zzb) {
            try {
                this.zzf = z11;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().m22936h().zzB(z11);
                    cw1 cw1Var = this.zzg;
                    if (cw1Var != null) {
                        cw1Var.m21179j(z11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzg(cw1 cw1Var) {
        this.zzg = cw1Var;
    }

    public final void zzh(boolean z11) {
        synchronized (this.zzb) {
            this.zze = z11;
        }
    }

    public final void zzi(Context context, String str, boolean z11, boolean z12) {
        if (!(context instanceof Activity)) {
            yk0.zzi("Can not create dialog without Activity Context");
        } else {
            zzs.zza.post(new zzav(this, context, str, z11, z12));
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21105R3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            yk0.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
                zzg m22936h = com.google.android.gms.ads.internal.zzt.zzo().m22936h();
                if (true != equals) {
                    str = "";
                }
                m22936h.zzA(str);
            }
            return equals;
        } catch (JSONException e11) {
            yk0.zzk("Fail to get debug mode response json.", e11);
            return false;
        }
    }

    public final boolean zzk(Context context, String str, String str2) {
        boolean z11;
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21095Q3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            yk0.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzo.trim());
            String optString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
                if ("0".equals(this.zza) || "2".equals(this.zza)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzf(z11);
                zzg m22936h = com.google.android.gms.ads.internal.zzt.zzo().m22936h();
                if (true != z11) {
                    str = "";
                }
                m22936h.zzA(str);
            }
            synchronized (this.zzb) {
                this.zzd = optString;
            }
            return true;
        } catch (JSONException e11) {
            yk0.zzk("Fail to get in app preview response json.", e11);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z11;
        synchronized (this.zzb) {
            z11 = this.zzf;
        }
        return z11;
    }

    public final boolean zzm() {
        boolean z11;
        synchronized (this.zzb) {
            z11 = this.zze;
        }
        return z11;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && zzm()) {
            yk0.zze("Sending troubleshooting signals to the server.");
            zze(context, str, str2, str3);
            return true;
        }
        return false;
    }
}
