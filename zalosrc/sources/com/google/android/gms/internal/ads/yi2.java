package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class yi2 implements rh2 {

    /* renamed from: a */
    final String f30962a;

    /* renamed from: b */
    final int f30963b;

    public yi2(String str, int i11) {
        this.f30962a = str;
        this.f30963b = i11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.f30962a) && this.f30963b != -1) {
            try {
                JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
                zzf.put("pvid", this.f30962a);
                zzf.put("pvid_s", this.f30963b);
            } catch (JSONException e11) {
                zze.zzb("Failed putting gms core app set ID info.", e11);
            }
        }
    }
}
