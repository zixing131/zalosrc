package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ji2 implements rh2 {

    /* renamed from: a */
    private final AdvertisingIdClient.Info f22830a;

    /* renamed from: b */
    private final String f22831b;

    public ji2(AdvertisingIdClient.Info info, String str) {
        this.f22830a = info;
        this.f22831b = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f22830a;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzf.put("rdid", this.f22830a.getId());
                zzf.put("is_lat", this.f22830a.isLimitAdTrackingEnabled());
                zzf.put("idtype", "adid");
            } else {
                zzf.put("pdid", this.f22831b);
                zzf.put("pdidtype", "ssaid");
            }
        } catch (JSONException e11) {
            zze.zzb("Failed putting Ad ID.", e11);
        }
    }
}
