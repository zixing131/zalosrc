package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i11, int i12) {
        this(i11, i12, (i11 == -1 ? "FULL" : String.valueOf(i11)) + "x" + (i12 == -2 ? "AUTO" : String.valueOf(i12)) + "_as");
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i11) {
        AdSize m26102e = rk0.m26102e(context, i11, 50, 0);
        m26102e.zze = true;
        return m26102e;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i11) {
        int m26101c = rk0.m26101c(context, 0);
        if (m26101c == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i11, 0);
        adSize.zzg = m26101c;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i11) {
        return zzj(i11, rk0.m26101c(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i11, int i12) {
        AdSize adSize = new AdSize(i11, 0);
        adSize.zzg = i12;
        adSize.zzf = true;
        if (i12 < 32) {
            yk0.zzj("The maximum height set for the inline adaptive ad size was " + i12 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i11) {
        AdSize m26102e = rk0.m26102e(context, i11, 50, 2);
        m26102e.zze = true;
        return m26102e;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i11) {
        int m26101c = rk0.m26101c(context, 2);
        AdSize adSize = new AdSize(i11, 0);
        if (m26101c == -1) {
            return INVALID;
        }
        adSize.zzg = m26101c;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i11) {
        return zzj(i11, rk0.m26101c(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i11) {
        AdSize m26102e = rk0.m26102e(context, i11, 50, 1);
        m26102e.zze = true;
        return m26102e;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i11) {
        int m26101c = rk0.m26101c(context, 1);
        AdSize adSize = new AdSize(i11, 0);
        if (m26101c == -1) {
            return INVALID;
        }
        adSize.zzg = m26101c;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i11) {
        return zzj(i11, rk0.m26101c(context, 1));
    }

    private static AdSize zzj(int i11, int i12) {
        if (i12 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i11, 0);
        adSize.zzi = i12;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        if (this.zzb != adSize.zzb || this.zzc != adSize.zzc || !this.zzd.equals(adSize.zzd)) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i11 = this.zzc;
        if (i11 != -4 && i11 != -3) {
            if (i11 != -2) {
                zzaw.zzb();
                return rk0.m26115y(context, this.zzc);
            }
            return zzq.zza(context.getResources().getDisplayMetrics());
        }
        return -1;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i11 = this.zzb;
        if (i11 == -3) {
            return -1;
        }
        if (i11 != -1) {
            zzaw.zzb();
            return rk0.m26115y(context, this.zzb);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i11) {
        this.zzg = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i11) {
        this.zzi = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(boolean z11) {
        this.zzf = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(boolean z11) {
        this.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzi() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSize(int i11, int i12, String str) {
        if (i11 < 0 && i11 != -1 && i11 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i11);
        }
        if (i12 >= 0 || i12 == -2 || i12 == -4) {
            this.zzb = i11;
            this.zzc = i12;
            this.zzd = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i12);
        }
    }
}
