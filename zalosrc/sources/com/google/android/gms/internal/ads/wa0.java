package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class wa0 implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final ba0 f29852a;

    /* renamed from: b */
    private UnifiedNativeAdMapper f29853b;

    /* renamed from: c */
    private NativeCustomTemplateAd f29854c;

    public wa0(ba0 ba0Var) {
        this.f29852a = ba0Var;
    }

    /* renamed from: a */
    public final NativeCustomTemplateAd m27582a() {
        return this.f29854c;
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper m27583b() {
        return this.f29853b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClicked.");
        try {
            this.f29852a.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClosed.");
        try {
            this.f29852a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i11) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error. " + i11);
        try {
            this.f29852a.mo20448b(i11);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f29853b;
        if (this.f29854c == null) {
            if (unifiedNativeAdMapper == null) {
                yk0.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                yk0.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        yk0.zze("Adapter called onAdImpression.");
        try {
            this.f29852a.zzm();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f29852a.zzn();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLoaded.");
        try {
            this.f29852a.zzo();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdOpened.");
        try {
            this.f29852a.zzp();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onVideoEnd.");
        try {
            this.f29852a.zzv();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(nativeCustomTemplateAd.getCustomTemplateId())));
        this.f29854c = nativeCustomTemplateAd;
        try {
            this.f29852a.zzo();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAppEvent.");
        try {
            this.f29852a.mo20453q4(str, str2);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof f10) {
            try {
                this.f29852a.mo20445K0(((f10) nativeCustomTemplateAd).m21864a(), str);
                return;
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
                return;
            }
        }
        yk0.zzj("Unexpected native custom template ad type.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClicked.");
        try {
            this.f29852a.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClosed.");
        try {
            this.f29852a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f29852a.mo20452o0(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f29852a.zzn();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLoaded.");
        try {
            this.f29852a.zzo();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdOpened.");
        try {
            this.f29852a.zzp();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f29853b;
        if (this.f29854c == null) {
            if (unifiedNativeAdMapper == null) {
                yk0.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                yk0.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        yk0.zze("Adapter called onAdClicked.");
        try {
            this.f29852a.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdClosed.");
        try {
            this.f29852a.zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f29852a.zzn();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdLoaded.");
        this.f29853b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new la0());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.f29852a.zzo();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdOpened.");
        try {
            this.f29852a.zzp();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i11) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error " + i11 + ".");
        try {
            this.f29852a.mo20448b(i11);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f29852a.mo20452o0(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i11) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error " + i11 + ".");
        try {
            this.f29852a.mo20448b(i11);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        yk0.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.f29852a.mo20452o0(adError.zza());
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}
