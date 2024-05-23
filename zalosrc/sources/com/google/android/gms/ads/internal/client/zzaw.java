package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.gh0;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzaw {
    private static final zzaw zza = new zzaw();
    private final rk0 zzb;
    private final zzau zzc;
    private final String zzd;
    private final zzcgv zze;
    private final Random zzf;

    protected zzaw() {
        rk0 rk0Var = new rk0();
        zzau zzauVar = new zzau(new zzk(), new zzi(), new zzek(), new l20(), new gh0(), new kd0(), new m20());
        String m26103f = rk0.m26103f();
        zzcgv zzcgvVar = new zzcgv(0, 223104000, true, false, false);
        Random random = new Random();
        this.zzb = rk0Var;
        this.zzc = zzauVar;
        this.zzd = m26103f;
        this.zze = zzcgvVar;
        this.zzf = random;
    }

    public static zzau zza() {
        return zza.zzc;
    }

    public static rk0 zzb() {
        return zza.zzb;
    }

    public static zzcgv zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
