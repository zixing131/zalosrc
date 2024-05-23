package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.by1;
import com.google.android.gms.internal.ads.kc3;
import com.google.android.gms.internal.ads.qb3;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.zzcbc;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzak implements qb3 {
    private final Executor zza;
    private final by1 zzb;

    public zzak(Executor executor, by1 by1Var) {
        this.zza = executor;
        this.zzb = by1Var;
    }

    @Override // com.google.android.gms.internal.ads.qb3
    public final /* bridge */ /* synthetic */ tc3 zza(Object obj) throws Exception {
        final zzcbc zzcbcVar = (zzcbc) obj;
        return kc3.m23882n(this.zzb.m20771b(zzcbcVar), new qb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj2) {
                zzcbc zzcbcVar2 = zzcbc.this;
                zzam zzamVar = new zzam(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzamVar.zzb = zzaw.zzb().m26119j(zzcbcVar2.f32001p).toString();
                } catch (JSONException unused) {
                    zzamVar.zzb = "{}";
                }
                return kc3.m23877i(zzamVar);
            }
        }, this.zza);
    }
}
