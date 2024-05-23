package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int i11, String str, String str2, AdError adError) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public String getDomain() {
        return this.zzc;
    }

    public String getMessage() {
        return this.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.zzd == null) {
            zzeVar = null;
        } else {
            AdError adError = this.zzd;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzb());
        }
        return jSONObject;
    }

    public AdError(int i11, String str, String str2) {
        this(i11, str, str2, null);
    }
}
