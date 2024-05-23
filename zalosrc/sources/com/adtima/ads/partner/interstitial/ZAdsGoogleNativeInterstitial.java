package com.adtima.ads.partner.interstitial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.ZAdsNetwork;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.helper.ZAdsGoogleNativeWrapper;
import com.adtima.ads.partner.helper.ZAdsGoogleRequestBuilder;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import p009a3.C0099d;
import p227i3.EnumC20200d;

/* loaded from: classes2.dex */
public final class ZAdsGoogleNativeInterstitial extends ZAdsPartnerInterstitialAbstract {
    private static final String TAG = "ZAdsGoogleNativeInterstitial";
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private int mAdsOrientationPrefer;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;
    private Object mNativeAd = null;
    private boolean mIsAdsClicked = false;

    public ZAdsGoogleNativeInterstitial(Context context, boolean z11, C0099d c0099d, String str, Bundle bundle, int i11) {
        try {
            this.mAdsContext = context;
            this.mAdsSoundOn = z11;
            this.mAdsData = c0099d;
            this.mAdsContentUrl = str;
            this.mAdsTargeting = bundle;
            this.mAdsOrientationPrefer = i11;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void destroyAdsPartner() {
        try {
            this.mAdsIsLoaded = false;
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void loadAdsPartner() {
        try {
            ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
            AdLoader build = new AdLoader.Builder(this.mAdsContext, this.mAdsData.f550d).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleNativeInterstitial.2
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd) {
                    try {
                        Adtima.m18328e(ZAdsGoogleNativeInterstitial.TAG, "onNativeAdLoaded");
                        ZAdsGoogleNativeInterstitial.this.mNativeAd = nativeAd;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener != null) {
                            if (ZAdsGoogleNativeWrapper.checkNativeAd(ZAdsGoogleNativeInterstitial.this.mNativeAd)) {
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsIsLoaded = true;
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener.onLoaded(ZAdsGoogleNativeInterstitial.this.mAdsData);
                            } else {
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener.onFailed(ZAdsGoogleNativeInterstitial.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                            }
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeInterstitial.TAG, "onNativeAdLoaded", e11);
                    }
                }
            }).withAdListener(new AdListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleNativeInterstitial.1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    Adtima.m18328e(ZAdsGoogleNativeInterstitial.TAG, "onAdClicked");
                    try {
                        if (ZAdsGoogleNativeInterstitial.this.mIsAdsClicked) {
                            return;
                        }
                        ZAdsGoogleNativeInterstitial.this.mIsAdsClicked = true;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener.onClicked();
                        }
                        new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleNativeInterstitial.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ZAdsGoogleNativeInterstitial.this.mIsAdsClicked = false;
                            }
                        }, 1000L);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeInterstitial.TAG, "onAdClicked", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    Adtima.m18328e(ZAdsGoogleNativeInterstitial.TAG, "onAdClosed");
                    try {
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener.onClosed(true);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeInterstitial.TAG, "onAdClosed", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    ZAdsPartnerViewListener zAdsPartnerViewListener;
                    C0099d c0099d;
                    EnumC20200d enumC20200d;
                    Adtima.m18328e(ZAdsGoogleNativeInterstitial.TAG, "onAdFailedToLoad");
                    try {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsIsLoaded = false;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener != null) {
                            if (3 == loadAdError.getCode()) {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleNativeInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                            } else {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleNativeInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleNativeInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                            }
                            zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                        }
                        Adtima.m18328e(ZAdsGoogleNativeInterstitial.TAG, "Load ad error with code: " + loadAdError.getCode());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeInterstitial.TAG, "onAdFailedToLoad", e11);
                    }
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().setReturnUrlsForImageAssets(true).setMediaAspectRatio(1).setRequestMultipleImages(true).setMediaAspectRatio(2).setAdChoicesPlacement(1).build()).build();
            if (this.mAdsData.f548b.equals("admob")) {
                build.loadAd(ZAdsGoogleRequestBuilder.buildAdMobRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build());
            } else if (this.mAdsData.f548b.equals("dfp")) {
                build.loadAd(ZAdsGoogleRequestBuilder.buildDFPRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build());
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void pauseAdsPartner() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void resumeAdsPartner() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void showAdsPartner() {
        try {
            this.mAdsIsLoaded = false;
            ZAdsGoogleNativeWrapper.Transporter transporter = new ZAdsGoogleNativeWrapper.Transporter();
            transporter.adNative = this.mNativeAd;
            transporter.adSize = ZAdsBannerSize.FULL_PAGE;
            Intent intent = new Intent(this.mAdsContext, (Class<?>) ZAdsNetwork.class);
            intent.putExtra("adsOrientationPrefer", this.mAdsOrientationPrefer);
            intent.addFlags(268435456);
            ZAdsNetwork.handleNetwork("admob", transporter, this.mAdsListener);
            this.mAdsContext.startActivity(intent);
            ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
            if (zAdsPartnerViewListener != null) {
                zAdsPartnerViewListener.onImpression();
            }
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }
}
