package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.rk0;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzq[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zzf(displayMetrics) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i11 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i11 <= 400) {
            return 32;
        }
        if (i11 <= 720) {
            return 50;
        }
        return 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12934w(parcel, 2, this.zza, false);
        AbstractC2552a.m12924m(parcel, 3, this.zzb);
        AbstractC2552a.m12924m(parcel, 4, this.zzc);
        AbstractC2552a.m12914c(parcel, 5, this.zzd);
        AbstractC2552a.m12924m(parcel, 6, this.zze);
        AbstractC2552a.m12924m(parcel, 7, this.zzf);
        AbstractC2552a.m12937z(parcel, 8, this.zzg, i11, false);
        AbstractC2552a.m12914c(parcel, 9, this.zzh);
        AbstractC2552a.m12914c(parcel, 10, this.zzi);
        AbstractC2552a.m12914c(parcel, 11, this.zzj);
        AbstractC2552a.m12914c(parcel, 12, this.zzk);
        AbstractC2552a.m12914c(parcel, 13, this.zzl);
        AbstractC2552a.m12914c(parcel, 14, this.zzm);
        AbstractC2552a.m12914c(parcel, 15, this.zzn);
        AbstractC2552a.m12914c(parcel, 16, this.zzo);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzq(Context context, AdSize[] adSizeArr) {
        int height;
        int i11;
        String str;
        int i12;
        double d11;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzb.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzb.zzg(adSize);
        boolean zzh = com.google.android.gms.ads.zzb.zzh(adSize);
        this.zzo = zzh;
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zza(adSize);
            this.zzb = height;
        } else if (zzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        int i13 = this.zze;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (i13 == -1) {
            zzaw.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzaw.zzb();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i14 = displayMetrics2.heightPixels;
                        int i15 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i16 = displayMetrics2.heightPixels;
                        int i17 = displayMetrics2.widthPixels;
                        if (i16 == i14 && i17 == i15) {
                            int i18 = displayMetrics.widthPixels;
                            zzaw.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i12 = i18 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i12;
                            d11 = i12 / displayMetrics.density;
                            i11 = (int) d11;
                            if (d11 - i11 >= 0.01d) {
                                i11++;
                            }
                        }
                    }
                }
            }
            i12 = displayMetrics.widthPixels;
            this.zzf = i12;
            d11 = i12 / displayMetrics.density;
            i11 = (int) d11;
            if (d11 - i11 >= 0.01d) {
            }
        } else {
            i11 = this.zze;
            zzaw.zzb();
            this.zzf = rk0.m26107q(displayMetrics, this.zze);
        }
        int zzf = height == -2 ? zzf(displayMetrics) : this.zzb;
        zzaw.zzb();
        this.zzc = rk0.m26107q(displayMetrics, zzf);
        if (i13 == -1 || height == -2) {
            this.zza = i11 + "x" + zzf + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (isFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i19 = 0; i19 < adSizeArr.length; i19++) {
                this.zzg[i19] = new zzq(context, adSizeArr[i19]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    public zzq(String str, int i11, int i12, boolean z11, int i13, int i14, zzq[] zzqVarArr, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z11;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = zzqVarArr;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = z14;
        this.zzk = z15;
        this.zzl = z16;
        this.zzm = z17;
        this.zzn = z18;
        this.zzo = z19;
    }
}
