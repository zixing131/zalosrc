package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ys1 {

    /* renamed from: a */
    private final ConcurrentHashMap f31085a;

    /* renamed from: b */
    private final lk0 f31086b;

    /* renamed from: c */
    private final dr2 f31087c;

    /* renamed from: d */
    private final String f31088d;

    /* renamed from: e */
    private final String f31089e;

    public ys1(it1 it1Var, lk0 lk0Var, dr2 dr2Var, String str, String str2) {
        ConcurrentHashMap m24033c = it1Var.m24033c();
        this.f31085a = m24033c;
        this.f31086b = lk0Var;
        this.f31087c = dr2Var;
        this.f31088d = str;
        this.f31089e = str2;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21223d6)).booleanValue()) {
            return;
        }
        int zzd = zzf.zzd(dr2Var);
        int i11 = zzd - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        m24033c.put("se", "r_both");
                    } else {
                        m24033c.put("se", "r_adstring");
                    }
                } else {
                    m24033c.put("se", "r_adinfo");
                }
            } else {
                m24033c.put("se", "query_g");
            }
            m24033c.put("scar", "true");
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20978E6)).booleanValue()) {
                m24033c.put("ad_format", str2);
            }
            if (zzd == 2) {
                m24033c.put("rid", str);
            }
            m28336d("ragent", dr2Var.f19398d.zzp);
            m28336d("rtype", zzf.zza(zzf.zzb(dr2Var.f19398d)));
            return;
        }
        m24033c.put("scar", "false");
    }

    /* renamed from: d */
    private final void m28336d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f31085a.put(str, str2);
        }
    }

    /* renamed from: a */
    public final Map m28337a() {
        return this.f31085a;
    }

    /* renamed from: b */
    public final void m28338b(tq2 tq2Var) {
        String str;
        if (tq2Var.f28473b.f27822a.size() > 0) {
            switch (((iq2) tq2Var.f28473b.f27822a.get(0)).f22315b) {
                case 1:
                    this.f31085a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f31085a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f31085a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f31085a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f31085a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f31085a.put("ad_format", "app_open_ad");
                    ConcurrentHashMap concurrentHashMap = this.f31085a;
                    if (true != this.f31086b.m24319i()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    concurrentHashMap.put("as", str);
                    break;
                default:
                    this.f31085a.put("ad_format", "unknown");
                    break;
            }
        }
        m28336d("gqi", tq2Var.f28473b.f27823b.f24014b);
    }

    /* renamed from: c */
    public final void m28339c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f31085a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f31085a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
