package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ej0 {

    /* renamed from: a */
    static ej0 f19645a;

    /* renamed from: d */
    public static synchronized ej0 m21727d(Context context) {
        synchronized (ej0.class) {
            try {
                ej0 ej0Var = f19645a;
                if (ej0Var != null) {
                    return ej0Var;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC4554gx.m22622c(applicationContext);
                zzg m22936h = zzt.zzo().m22936h();
                m22936h.zzr(applicationContext);
                hi0 hi0Var = new hi0(null);
                hi0Var.m22901b(applicationContext);
                hi0Var.m22902c(zzt.zzB());
                hi0Var.m22900a(m22936h);
                hi0Var.m22903d(zzt.zzn());
                ej0 m22904e = hi0Var.m22904e();
                f19645a = m22904e;
                m22904e.mo21728a().m20122a();
                f19645a.mo21729b().m21718c();
                ij0 mo21730c = f19645a.mo21730c();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21327o0)).booleanValue()) {
                    HashMap hashMap = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject((String) zzay.zzc().m21823b(AbstractC4554gx.f21347q0));
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            HashSet hashSet = new HashSet();
                            JSONArray optJSONArray = jSONObject.optJSONArray(next);
                            if (optJSONArray != null) {
                                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                    String optString = optJSONArray.optString(i11);
                                    if (optString != null) {
                                        hashSet.add(optString);
                                    }
                                }
                                hashMap.put(next, hashSet);
                            }
                        }
                        Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext()) {
                            mo21730c.m23273c((String) it.next());
                        }
                        mo21730c.m23274d(new gj0(mo21730c, hashMap));
                    } catch (JSONException e11) {
                        yk0.zzf("Failed to parse listening list", e11);
                    }
                }
                return f19645a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    abstract ai0 mo21728a();

    /* renamed from: b */
    public abstract ei0 mo21729b();

    /* renamed from: c */
    abstract ij0 mo21730c();
}
