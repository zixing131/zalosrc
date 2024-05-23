package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class jg2 implements rh2 {

    /* renamed from: a */
    private final String f22816a;

    /* renamed from: b */
    private final String f22817b;

    public jg2(String str, String str2) {
        this.f22816a = str;
        this.f22817b = str2;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21183Z5)).booleanValue()) {
            bundle.putString("request_id", this.f22817b);
        } else {
            bundle.putString("request_id", this.f22816a);
        }
    }
}
