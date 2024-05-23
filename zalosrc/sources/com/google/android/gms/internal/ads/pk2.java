package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pk2 implements rh2 {

    /* renamed from: a */
    private final Map f26242a;

    public pk2(Map map) {
        this.f26242a = map;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzaw.zzb().m26120k(this.f26242a));
        } catch (JSONException e11) {
            zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
