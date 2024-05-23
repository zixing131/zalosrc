package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j01 implements j04 {

    /* renamed from: a */
    private final w04 f22583a;

    public j01(w04 w04Var) {
        this.f22583a = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((l41) this.f22583a).m24112a().f22287A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
