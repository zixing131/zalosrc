package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class lj2 implements sh2 {

    /* renamed from: a */
    private final JSONObject f23952a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lj2(Context context) {
        this.f23952a = wf0.m27604c(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m24310a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f23952a);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23877i(new rh2() { // from class: com.google.android.gms.internal.ads.kj2
            @Override // com.google.android.gms.internal.ads.rh2
            /* renamed from: a */
            public final void mo20086a(Object obj) {
                lj2.this.m24310a((JSONObject) obj);
            }
        });
    }
}
