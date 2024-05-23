package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class hu1 {

    /* renamed from: a */
    private Long f21904a;

    /* renamed from: b */
    private final String f21905b;

    /* renamed from: c */
    private String f21906c;

    /* renamed from: d */
    private Integer f21907d;

    /* renamed from: e */
    private String f21908e;

    /* renamed from: f */
    private Integer f21909f;

    public /* synthetic */ hu1(String str, gu1 gu1Var) {
        this.f21905b = str;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m23016a(hu1 hu1Var) {
        String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21275i8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", hu1Var.f21904a);
            jSONObject.put("eventCategory", hu1Var.f21905b);
            jSONObject.putOpt("event", hu1Var.f21906c);
            jSONObject.putOpt("errorCode", hu1Var.f21907d);
            jSONObject.putOpt("rewardType", hu1Var.f21908e);
            jSONObject.putOpt("rewardAmount", hu1Var.f21909f);
        } catch (JSONException unused) {
            yk0.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
