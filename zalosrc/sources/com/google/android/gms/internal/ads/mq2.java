package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class mq2 {

    /* renamed from: a */
    public final String f24721a;

    /* renamed from: b */
    public final String f24722b;

    /* renamed from: c */
    public final JSONObject f24723c;

    /* renamed from: d */
    public final JSONObject f24724d;

    public mq2(JsonReader jsonReader) {
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
        this.f24724d = zzh;
        this.f24721a = zzh.optString("ad_html", null);
        this.f24722b = zzh.optString("ad_base_url", null);
        this.f24723c = zzh.optJSONObject("ad_json");
    }
}
