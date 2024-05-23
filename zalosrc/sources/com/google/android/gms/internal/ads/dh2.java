package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class dh2 implements rh2 {

    /* renamed from: a */
    public final String f19241a;

    /* renamed from: b */
    public final String f19242b;

    /* renamed from: c */
    public final String f19243c;

    /* renamed from: d */
    public final String f19244d;

    /* renamed from: e */
    public final Long f19245e;

    public dh2(String str, String str2, String str3, String str4, Long l11) {
        this.f19241a = str;
        this.f19242b = str2;
        this.f19243c = str3;
        this.f19244d = str4;
        this.f19245e = l11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        nr2.m24984c(bundle, "gmp_app_id", this.f19241a);
        nr2.m24984c(bundle, "fbs_aiid", this.f19242b);
        nr2.m24984c(bundle, "fbs_aeid", this.f19243c);
        nr2.m24984c(bundle, "apm_id_origin", this.f19244d);
        Long l11 = this.f19245e;
        if (l11 != null) {
            bundle.putLong("sai_timeout", l11.longValue());
        }
    }
}
