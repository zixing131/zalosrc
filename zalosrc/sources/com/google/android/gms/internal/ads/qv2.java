package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qv2 {

    /* renamed from: a */
    private final HashMap f26977a;

    /* renamed from: b */
    private final wv2 f26978b;

    private qv2() {
        HashMap hashMap = new HashMap();
        this.f26977a = hashMap;
        this.f26978b = new wv2(zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static qv2 m25905b(String str) {
        qv2 qv2Var = new qv2();
        qv2Var.f26977a.put("action", str);
        return qv2Var;
    }

    /* renamed from: c */
    public static qv2 m25906c(String str) {
        qv2 qv2Var = new qv2();
        qv2Var.f26977a.put("request_id", str);
        return qv2Var;
    }

    /* renamed from: a */
    public final qv2 m25907a(String str, String str2) {
        this.f26977a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final qv2 m25908d(String str) {
        this.f26978b.m27729b(str);
        return this;
    }

    /* renamed from: e */
    public final qv2 m25909e(String str, String str2) {
        this.f26978b.m27730c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final qv2 m25910f(iq2 iq2Var) {
        this.f26977a.put("aai", iq2Var.f22352x);
        return this;
    }

    /* renamed from: g */
    public final qv2 m25911g(lq2 lq2Var) {
        if (!TextUtils.isEmpty(lq2Var.f24014b)) {
            this.f26977a.put("gqi", lq2Var.f24014b);
        }
        return this;
    }

    /* renamed from: h */
    public final qv2 m25912h(tq2 tq2Var, lk0 lk0Var) {
        String str;
        sq2 sq2Var = tq2Var.f28473b;
        m25911g(sq2Var.f27823b);
        if (!sq2Var.f27822a.isEmpty()) {
            switch (((iq2) sq2Var.f27822a.get(0)).f22315b) {
                case 1:
                    this.f26977a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f26977a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f26977a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f26977a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f26977a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f26977a.put("ad_format", "app_open_ad");
                    if (lk0Var != null) {
                        HashMap hashMap = this.f26977a;
                        if (true != lk0Var.m24319i()) {
                            str = "0";
                        } else {
                            str = "1";
                        }
                        hashMap.put("as", str);
                        break;
                    }
                    break;
                default:
                    this.f26977a.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final qv2 m25913i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f26977a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f26977a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map m25914j() {
        HashMap hashMap = new HashMap(this.f26977a);
        for (vv2 vv2Var : this.f26978b.m27728a()) {
            hashMap.put(vv2Var.f29490a, vv2Var.f29491b);
        }
        return hashMap;
    }
}
