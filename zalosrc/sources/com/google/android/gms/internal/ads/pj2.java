package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pj2 implements rh2 {

    /* renamed from: a */
    private final String f26234a;

    /* renamed from: b */
    private final String f26235b;

    public pj2(String str, String str2) {
        this.f26234a = str;
        this.f26235b = str2;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            zzf.put("doritos", this.f26234a);
            zzf.put("doritos_v2", this.f26235b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }
}
