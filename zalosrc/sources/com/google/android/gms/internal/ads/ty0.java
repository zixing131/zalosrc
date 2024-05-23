package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ty0 implements iy0 {

    /* renamed from: a */
    private final Context f28654a;

    /* renamed from: b */
    private final zzg f28655b = zzt.zzo().m22936h();

    public ty0(Context context) {
        this.f28654a = context;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21357r0)).booleanValue()) {
                this.f28655b.zzH(parseBoolean);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue() && parseBoolean) {
                    this.f28654a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21307m0)).booleanValue()) {
            zzt.zzn().m21422w(bundle);
        }
    }
}
