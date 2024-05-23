package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.C5221yw;
import com.google.android.gms.internal.ads.C5258zw;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC4480ex;

/* loaded from: classes2.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final C5221yw zzb;
    private final C5258zw zzc;
    private final SharedPreferencesOnSharedPreferenceChangeListenerC4480ex zzd;

    protected zzay() {
        C5221yw c5221yw = new C5221yw();
        C5258zw c5258zw = new C5258zw();
        SharedPreferencesOnSharedPreferenceChangeListenerC4480ex sharedPreferencesOnSharedPreferenceChangeListenerC4480ex = new SharedPreferencesOnSharedPreferenceChangeListenerC4480ex();
        this.zzb = c5221yw;
        this.zzc = c5258zw;
        this.zzd = sharedPreferencesOnSharedPreferenceChangeListenerC4480ex;
    }

    public static C5221yw zza() {
        return zza.zzb;
    }

    public static C5258zw zzb() {
        return zza.zzc;
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC4480ex zzc() {
        return zza.zzd;
    }
}
