package com.google.android.gms.ads.internal.util;

/* loaded from: classes2.dex */
public final class zzbz {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbz(long j11) {
        this.zza = j11;
    }

    public final void zza(long j11) {
        synchronized (this.zzc) {
            this.zza = j11;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            try {
                long mo105914b = com.google.android.gms.ads.internal.zzt.zzB().mo105914b();
                if (this.zzb + this.zza > mo105914b) {
                    return false;
                }
                this.zzb = mo105914b;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
