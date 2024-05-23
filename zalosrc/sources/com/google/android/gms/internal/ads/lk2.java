package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lk2 implements rh2 {

    /* renamed from: a */
    private final String f23963a;

    public lk2(String str) {
        this.f23963a = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.f23963a)) {
                com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii").put("adsid", this.f23963a);
            }
        } catch (JSONException e11) {
            yk0.zzk("Failed putting trustless token.", e11);
        }
    }
}
