package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4901q9;
import com.google.android.gms.internal.ads.C4825o8;
import com.google.android.gms.internal.ads.pl0;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzajl;
import java.util.Map;
import p229i5.AbstractC20284e;

/* loaded from: classes2.dex */
public final class zzbo {
    private static C4825o8 zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        C4825o8 m25673a;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    AbstractC4554gx.m22622c(context);
                    if (!AbstractC20284e.m105912a()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20955C3)).booleanValue()) {
                            m25673a = zzax.zzb(context);
                            zzb = m25673a;
                        }
                    }
                    m25673a = AbstractC4901q9.m25673a(context, null);
                    zzb = m25673a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final tc3 zza(String str) {
        pl0 pl0Var = new pl0();
        zzb.m25097a(new zzbn(str, null, pl0Var));
        return pl0Var;
    }

    public final tc3 zzb(int i11, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        xk0 xk0Var = new xk0(null);
        zzbi zzbiVar = new zzbi(this, i11, str, zzblVar, zzbhVar, bArr, map, xk0Var);
        if (xk0.m27903l()) {
            try {
                xk0Var.m27912d(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzajl e11) {
                yk0.zzj(e11.getMessage());
            }
        }
        zzb.m25097a(zzbiVar);
        return zzblVar;
    }
}
