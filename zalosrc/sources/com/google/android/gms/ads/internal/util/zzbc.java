package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.AbstractC4199m;

/* loaded from: classes2.dex */
public final class zzbc {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbc(String str, double d11, double d12, double d13, int i11) {
        this.zza = str;
        this.zzc = d11;
        this.zzb = d12;
        this.zzd = d13;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        if (!AbstractC4199m.m19701a(this.zza, zzbcVar.zza) || this.zzb != zzbcVar.zzb || this.zzc != zzbcVar.zzc || this.zze != zzbcVar.zze || Double.compare(this.zzd, zzbcVar.zzd) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return AbstractC4199m.m19703c(this).m19704a("name", this.zza).m19704a("minBound", Double.valueOf(this.zzc)).m19704a("maxBound", Double.valueOf(this.zzb)).m19704a("percent", Double.valueOf(this.zzd)).m19704a("count", Integer.valueOf(this.zze)).toString();
    }
}
