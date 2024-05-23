package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ud0 {

    /* renamed from: a */
    public final boolean f28834a;

    /* renamed from: b */
    public final String f28835b;

    public ud0(boolean z11, String str) {
        this.f28834a = z11;
        this.f28835b = str;
    }

    /* renamed from: a */
    public static ud0 m26914a(JSONObject jSONObject) {
        return new ud0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
