package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y60 {
    /* renamed from: a */
    public static void m28133a(z60 z60Var, String str, Map map) {
        try {
            z60Var.mo23555n(str, zzaw.zzb().m26120k(map));
        } catch (JSONException unused) {
            yk0.zzj("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m28134b(z60 z60Var, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        yk0.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        z60Var.zza(sb2.toString());
    }

    /* renamed from: c */
    public static void m28135c(z60 z60Var, String str, String str2) {
        z60Var.zza(str + "(" + str2 + ");");
    }

    /* renamed from: d */
    public static void m28136d(z60 z60Var, String str, JSONObject jSONObject) {
        z60Var.mo23553c(str, jSONObject.toString());
    }
}
