package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.ys1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzc {
    private final it1 zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21203b6)).intValue();
    private final long zzb = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21213c6)).longValue();
    private final boolean zzc = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21263h6)).booleanValue();
    private final boolean zzd = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21243f6)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(it1 it1Var) {
        this.zzh = it1Var;
    }

    private final synchronized void zzg(final ys1 ys1Var) {
        if (!this.zzc) {
            return;
        }
        final ArrayDeque clone = this.zzg.clone();
        this.zzg.clear();
        final ArrayDeque clone2 = this.zzf.clone();
        this.zzf.clear();
        kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                zzc.this.zze(ys1Var, clone, clone2);
            }
        });
    }

    private final void zzh(ys1 ys1Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ys1Var.m28337a());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.m24035e(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (mo105913a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e11) {
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, ys1 ys1Var) {
        Pair pair = (Pair) this.zze.get(str);
        ys1Var.m28337a().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            ys1Var.m28337a().put("mhit", "true");
            return str2;
        }
        ys1Var.m28337a().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, ys1 ys1Var) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().mo105913a()), str2));
        zzi();
        zzg(ys1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(ys1 ys1Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(ys1Var, arrayDeque, "to");
        zzh(ys1Var, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
