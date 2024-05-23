package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.EnumC5180xs;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzae {
    private final String zza;

    public /* synthetic */ zzae(zzac zzacVar, zzad zzadVar) {
        String str;
        str = zzacVar.zza;
        this.zza = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final EnumC5180xs zza() {
        char c11;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    if (c11 != 3) {
                        return EnumC5180xs.AD_INITIATER_UNSPECIFIED;
                    }
                    return EnumC5180xs.REWARD_BASED_VIDEO_AD;
                }
                return EnumC5180xs.AD_LOADER;
            }
            return EnumC5180xs.INTERSTITIAL;
        }
        return EnumC5180xs.BANNER;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
