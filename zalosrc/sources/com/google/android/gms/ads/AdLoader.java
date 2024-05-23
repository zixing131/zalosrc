package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.r20;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.zzbls;

/* loaded from: classes2.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbl zzc;

    AdLoader(Context context, zzbl zzblVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzblVar;
        this.zza = zzpVar;
    }

    private final void zzb(zzdr zzdrVar) {
        AbstractC4554gx.m22622c(this.zzb);
        if (((Boolean) AbstractC5149wy.f30255c.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    public final /* synthetic */ zzdr zzb;

                    public /* synthetic */ zza(zzdr zzdrVar2) {
                        r2 = zzdrVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(r2);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar2));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to load ad.", e11);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e11) {
            yk0.zzk("Failed to check if ad is loading.", e11);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i11) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza()), i11);
        } catch (RemoteException e11) {
            yk0.zzh("Failed to load ads.", e11);
        }
    }

    public final /* synthetic */ void zza(zzdr zzdrVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdrVar));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to load ad.", e11);
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private final Context zza;
        private final zzbo zzb;

        public Builder(Context context, String str) {
            Context context2 = (Context) AbstractC4205o.m19723l(context, "context cannot be null");
            zzbo zzc = zzaw.zza().zzc(context, str, new s90());
            this.zza = context2;
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e11) {
                yk0.zzh("Failed to build AdLoader.", e11);
                return new AdLoader(this.zza, new zzeo().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new t20(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e11) {
                    yk0.zzk("Failed to add Google Ad Manager banner ad listener", e11);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            ad0 ad0Var = new ad0(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, ad0Var.m20085b(), ad0Var.m20084a());
            } catch (RemoteException e11) {
                yk0.zzk("Failed to add custom format ad listener", e11);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            r20 r20Var = new r20(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, r20Var.m25945e(), r20Var.m25944d());
            } catch (RemoteException e11) {
                yk0.zzk("Failed to add custom template ad listener", e11);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new cd0(onNativeAdLoadedListener));
            } catch (RemoteException e11) {
                yk0.zzk("Failed to add google native ad listener", e11);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new u20(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e11) {
                yk0.zzk("Failed to add google native ad listener", e11);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e11) {
                yk0.zzk("Failed to set AdListener.", e11);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e11) {
                yk0.zzk("Failed to specify Ad Manager banner ad options", e11);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbls(nativeAdOptions));
            } catch (RemoteException e11) {
                yk0.zzk("Failed to specify native ad options", e11);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbls(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e11) {
                yk0.zzk("Failed to specify native ad options", e11);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
