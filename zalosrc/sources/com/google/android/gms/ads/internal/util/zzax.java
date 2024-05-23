package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4788n8;
import com.google.android.gms.internal.ads.AbstractC5122w8;
import com.google.android.gms.internal.ads.C4456e9;
import com.google.android.gms.internal.ads.C4639j8;
import com.google.android.gms.internal.ads.C4677k9;
import com.google.android.gms.internal.ads.C4825o8;
import com.google.android.gms.internal.ads.C5160x8;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.zzakm;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzax extends C5160x8 {
    private final Context zzc;

    private zzax(Context context, AbstractC5122w8 abstractC5122w8) {
        super(abstractC5122w8);
        this.zzc = context;
    }

    public static C4825o8 zzb(Context context) {
        C4825o8 c4825o8 = new C4825o8(new C4456e9(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new C4677k9(null, null)), 4);
        c4825o8.m25100d();
        return c4825o8;
    }

    @Override // com.google.android.gms.internal.ads.C5160x8, com.google.android.gms.internal.ads.InterfaceC4566h8
    public final C4639j8 zza(AbstractC4788n8 abstractC4788n8) throws zzakm {
        if (abstractC4788n8.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20965D3), abstractC4788n8.zzk())) {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                if (rk0.m26110t(this.zzc, 13400000)) {
                    C4639j8 zza = new b60(this.zzc).zza(abstractC4788n8);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(abstractC4788n8.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(abstractC4788n8.zzk())));
                }
            }
        }
        return super.zza(abstractC4788n8);
    }
}
