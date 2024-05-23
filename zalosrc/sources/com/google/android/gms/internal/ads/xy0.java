package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
final class xy0 implements jy0 {

    /* renamed from: a */
    private final ei0 f30683a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xy0(ei0 ei0Var) {
        this.f30683a = ei0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ei0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.jy0
    /* renamed from: a */
    public final void mo23779a(JSONObject jSONObject) {
        ?? r42;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r42 = -1;
        } else {
            r42 = jSONObject.optBoolean("npa");
        }
        this.f30683a.m21717b(r42, optLong);
    }
}
