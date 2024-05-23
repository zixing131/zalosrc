package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o40 implements c40 {

    /* renamed from: a */
    private final xw1 f25424a;

    public o40(xw1 xw1Var) {
        this.f25424a = xw1Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
            return;
        }
        String str = (String) map.get("action");
        String str2 = (String) map.get("adUnitId");
        String str3 = (String) map.get("redirectUrl");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f25424a.m28050f(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f25424a.m28051g(str2, str3);
            }
        }
    }
}
