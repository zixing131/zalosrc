package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ej2 implements rh2 {

    /* renamed from: a */
    private final String f19647a;

    public ej2(String str) {
        this.f19647a = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f19647a)) {
                zzf.put("attok", this.f19647a);
            }
        } catch (JSONException e11) {
            zze.zzb("Failed putting attestation token.", e11);
        }
    }
}
