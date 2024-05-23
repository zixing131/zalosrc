package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r40 implements c40 {

    /* renamed from: a */
    private final Object f27074a = new Object();

    /* renamed from: b */
    private final Map f27075b = new HashMap();

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.f27074a) {
            try {
                q40 q40Var = (q40) this.f27075b.remove(str);
                if (q40Var == null) {
                    yk0.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    q40Var.zza(str3 + concat);
                    return;
                }
                if (str5 == null) {
                    q40Var.mo21975a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    q40Var.mo21975a(jSONObject);
                } catch (JSONException e11) {
                    q40Var.zza(e11.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final tc3 m25955b(l70 l70Var, String str, JSONObject jSONObject) {
        pl0 pl0Var = new pl0();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        m25956c(uuid, new p40(this, pl0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            l70Var.mo23550C0(str, jSONObject2);
        } catch (Exception e11) {
            pl0Var.zze(e11);
        }
        return pl0Var;
    }

    /* renamed from: c */
    public final void m25956c(String str, q40 q40Var) {
        synchronized (this.f27074a) {
            this.f27075b.put(str, q40Var);
        }
    }
}
