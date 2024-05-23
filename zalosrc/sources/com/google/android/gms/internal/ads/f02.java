package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class f02 implements n80 {
    @Override // com.google.android.gms.internal.ads.n80
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        g02 g02Var = (g02) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21167X7)).booleanValue()) {
            jSONObject2.put("ad_request_url", g02Var.f20362c.m25432e());
            jSONObject2.put("ad_request_post_body", g02Var.f20362c.m25431d());
        }
        jSONObject2.put("base_url", g02Var.f20362c.m25429b());
        jSONObject2.put("signals", g02Var.f20361b);
        jSONObject3.put("body", g02Var.f20360a.f23046c);
        jSONObject3.put("headers", zzaw.zzb().m26120k(g02Var.f20360a.f23045b));
        jSONObject3.put("response_code", g02Var.f20360a.f23044a);
        jSONObject3.put("latency", g02Var.f20360a.f23047d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", g02Var.f20362c.m25434g());
        return jSONObject;
    }
}
