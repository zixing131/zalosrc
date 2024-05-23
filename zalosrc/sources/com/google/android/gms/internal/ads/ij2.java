package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ij2 implements rh2 {

    /* renamed from: a */
    private final JSONObject f22193a;

    public ij2(JSONObject jSONObject) {
        this.f22193a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f22193a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}
