package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbd zza(String str, double d11, double d12) {
        int i11 = 0;
        while (i11 < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i11)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i11)).doubleValue();
            if (d11 < doubleValue || (doubleValue == d11 && d12 < doubleValue2)) {
                break;
            }
            i11++;
        }
        this.zza.add(i11, str);
        this.zzc.add(i11, Double.valueOf(d11));
        this.zzb.add(i11, Double.valueOf(d12));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}
