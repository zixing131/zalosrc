package com.android.billingclient.api;

import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.h */
/* loaded from: classes2.dex */
public final class C3906h {

    /* renamed from: a */
    private final String f15531a;

    /* renamed from: b */
    private final JSONObject f15532b;

    /* renamed from: c */
    private final String f15533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3906h(String str) {
        this.f15531a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15532b = jSONObject;
        this.f15533c = jSONObject.optString("countryCode");
    }

    /* renamed from: a */
    public String m18594a() {
        return this.f15533c;
    }
}
