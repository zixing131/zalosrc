package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.nk0;

/* loaded from: classes2.dex */
public class QueryInfo {
    private final zzeg zza;

    public QueryInfo(zzeg zzegVar) {
        this.zza = zzegVar;
    }

    public static void generate(final Context context, final AdFormat adFormat, final AdRequest adRequest, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzdr zza;
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30263k.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdr zza2;
                        Context context2 = context;
                        AdFormat adFormat2 = adFormat;
                        AdRequest adRequest2 = adRequest;
                        QueryInfoGenerationCallback queryInfoGenerationCallback2 = queryInfoGenerationCallback;
                        if (adRequest2 == null) {
                            zza2 = null;
                        } else {
                            zza2 = adRequest2.zza();
                        }
                        new fe0(context2, adFormat2, zza2).m21993b(queryInfoGenerationCallback2);
                    }
                });
                return;
            }
        }
        if (adRequest == null) {
            zza = null;
        } else {
            zza = adRequest.zza();
        }
        new fe0(context, adFormat, zza).m21993b(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzd();
    }

    public final zzeg zza() {
        return this.zza;
    }
}
