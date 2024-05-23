package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class jx1 implements j04 {

    /* renamed from: a */
    private final w04 f23021a;

    /* renamed from: b */
    private final w04 f23022b;

    public jx1(w04 w04Var, w04 w04Var2) {
        this.f23021a = w04Var;
        this.f23022b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        hv2 hv2Var = (hv2) this.f23021a.zzb();
        final CookieManager zzb = zzt.zzq().zzb((Context) this.f23022b.zzb());
        xu2 m28026i = qu2.m25888a(new Callable() { // from class: com.google.android.gms.internal.ads.gx1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzay.zzc().m21823b(AbstractC4554gx.f21002H0));
            }
        }, bv2.WEBVIEW_COOKIE, hv2Var).m28026i(1L, TimeUnit.SECONDS);
        final hx1 hx1Var = new ju2() { // from class: com.google.android.gms.internal.ads.hx1
            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                return "";
            }
        };
        return m28026i.m28020c(Exception.class, new qb3() { // from class: com.google.android.gms.internal.ads.tu2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return kc3.m23877i("");
            }
        }).m28018a();
    }
}
