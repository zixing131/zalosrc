package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ce2 implements rh2 {

    /* renamed from: a */
    private final JSONObject f18379a;

    /* renamed from: b */
    private final JSONObject f18380b;

    public ce2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f18379a = jSONObject;
        this.f18380b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f18379a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f18380b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
