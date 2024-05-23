package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class i90 extends cl0 {

    /* renamed from: b */
    private final h90 f22120b;

    public i90(h90 h90Var, String str) {
        super(str);
        this.f22120b = h90Var;
    }

    @Override // com.google.android.gms.internal.ads.cl0, com.google.android.gms.internal.ads.qk0
    public final boolean zza(String str) {
        yk0.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        yk0.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
