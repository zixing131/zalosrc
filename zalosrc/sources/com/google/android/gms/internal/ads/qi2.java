package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qi2 implements rh2 {

    /* renamed from: a */
    private final String f26794a;

    public qi2(String str) {
        this.f26794a = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f26794a);
        } catch (JSONException e11) {
            zze.zzb("Failed putting Ad ID.", e11);
        }
    }
}
