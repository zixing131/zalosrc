package com.adtima.ads.partner.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.helper.ZAdsGoogleRequestBuilder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import p009a3.C0099d;
import p227i3.EnumC20200d;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public final class ZAdsGoogleGraphicInterstitial extends ZAdsPartnerInterstitialAbstract {
    private static final String TAG = "ZAdsGoogleGraphicInterstitial";
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;
    private InterstitialAd mAdsInterstitial = null;
    private AdManagerInterstitialAd mAdsDFPInterstitial = null;
    private InterstitialAdLoadCallback mInterstitialAdLoadCallback = null;
    private AdManagerInterstitialAdLoadCallback mAdManagerInterstitialAdLoadCallback = null;
    private FullScreenContentCallback mFullScreenContentCallback = null;
    private boolean mIsAdsClicked = false;

    public ZAdsGoogleGraphicInterstitial(Context context, boolean z11, C0099d c0099d, String str, Bundle bundle) {
        try {
            this.mAdsContext = context;
            this.mAdsData = c0099d;
            this.mAdsSoundOn = z11;
            this.mAdsContentUrl = str;
            this.mAdsTargeting = bundle;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void destroyAdsPartner() {
        try {
            this.mAdsInterstitial = null;
            this.mAdsDFPInterstitial = null;
            this.mInterstitialAdLoadCallback = null;
            this.mAdManagerInterstitialAdLoadCallback = null;
            this.mFullScreenContentCallback = null;
            this.mAdsIsLoaded = false;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void loadAdsPartner() {
        try {
            ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
            this.mFullScreenContentCallback = new FullScreenContentCallback() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleGraphicInterstitial.1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdClicked() {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdClicked");
                    try {
                        if (ZAdsGoogleGraphicInterstitial.this.mIsAdsClicked) {
                            return;
                        }
                        ZAdsGoogleGraphicInterstitial.this.mIsAdsClicked = true;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onClicked();
                        }
                        new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleGraphicInterstitial.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ZAdsGoogleGraphicInterstitial.this.mIsAdsClicked = false;
                            }
                        }, 1000L);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdDismissedFullScreenContent");
                    ZAdsGoogleGraphicInterstitial.this.mAdsInterstitial = null;
                    ZAdsGoogleGraphicInterstitial.this.mAdsDFPInterstitial = null;
                    if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onClosed(true);
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdFailedToShowFullScreenContent");
                    if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onFailed(adError, EnumC20200d.AD_RENDER_ERROR);
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdImpression");
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdShowedFullScreenContent");
                }
            };
            this.mInterstitialAdLoadCallback = new InterstitialAdLoadCallback() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleGraphicInterstitial.2
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    ZAdsPartnerViewListener zAdsPartnerViewListener;
                    C0099d c0099d;
                    EnumC20200d enumC20200d;
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdFailedToLoad InterstitialAd");
                    try {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsIsLoaded = false;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                            if (3 == loadAdError.getCode()) {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleGraphicInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                            } else {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleGraphicInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                            }
                            zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                        }
                        Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "Load ad error with code: " + loadAdError.getCode());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleGraphicInterstitial.TAG, "onAdFailedToLoad", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdLoaded InterstitialAd");
                    try {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsIsLoaded = true;
                        ZAdsGoogleGraphicInterstitial.this.mAdsInterstitial = interstitialAd;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onImpression();
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onLoaded(ZAdsGoogleGraphicInterstitial.this.mAdsData);
                        }
                        interstitialAd.setFullScreenContentCallback(ZAdsGoogleGraphicInterstitial.this.mFullScreenContentCallback);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleGraphicInterstitial.TAG, "onAdLoaded", e11);
                    }
                }
            };
            this.mAdManagerInterstitialAdLoadCallback = new AdManagerInterstitialAdLoadCallback() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleGraphicInterstitial.3
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    ZAdsPartnerViewListener zAdsPartnerViewListener;
                    C0099d c0099d;
                    EnumC20200d enumC20200d;
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdFailedToLoad AdManagerInterstitialAd");
                    try {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsIsLoaded = false;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                            if (3 == loadAdError.getCode()) {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleGraphicInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                            } else {
                                zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener;
                                c0099d = ZAdsGoogleGraphicInterstitial.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                            }
                            zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                        }
                        Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "Load ad error with code: " + loadAdError.getCode());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleGraphicInterstitial.TAG, "onAdFailedToLoad", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
                    Adtima.m18328e(ZAdsGoogleGraphicInterstitial.TAG, "onAdLoaded AdManagerInterstitialAd");
                    try {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsIsLoaded = true;
                        ZAdsGoogleGraphicInterstitial.this.mAdsDFPInterstitial = adManagerInterstitialAd;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onImpression();
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleGraphicInterstitial.this).mAdsListener.onLoaded(ZAdsGoogleGraphicInterstitial.this.mAdsData);
                        }
                        ZAdsGoogleGraphicInterstitial.this.mAdsDFPInterstitial.setFullScreenContentCallback(ZAdsGoogleGraphicInterstitial.this.mFullScreenContentCallback);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleGraphicInterstitial.TAG, "onAdLoaded", e11);
                    }
                }
            };
            if (this.mAdsData.f548b.equals("admob")) {
                InterstitialAd.load(this.mAdsContext, this.mAdsData.f550d, ZAdsGoogleRequestBuilder.buildAdMobRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build(), this.mInterstitialAdLoadCallback);
            } else if (this.mAdsData.f548b.equals("dfp")) {
                AdManagerInterstitialAd.load(this.mAdsContext, this.mAdsData.f550d, ZAdsGoogleRequestBuilder.buildDFPRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build(), this.mAdManagerInterstitialAdLoadCallback);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
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
        AdManagerInterstitialAd adManagerInterstitialAd;
        ZAdsPartnerViewListener zAdsPartnerViewListener;
        try {
            this.mAdsIsLoaded = false;
            Activity m114902c = AbstractC22011d.m114902c();
            if (this.mAdsData.f548b.equals("admob")) {
                InterstitialAd interstitialAd = this.mAdsInterstitial;
                if (interstitialAd == null) {
                    return;
                }
                interstitialAd.show(m114902c);
                zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener == null) {
                    return;
                }
            } else {
                if (!this.mAdsData.f548b.equals("dfp") || (adManagerInterstitialAd = this.mAdsDFPInterstitial) == null) {
                    return;
                }
                adManagerInterstitialAd.show(m114902c);
                zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener == null) {
                    return;
                }
            }
            zAdsPartnerViewListener.onImpression();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showAdsPartner", e11);
        }
    }
}
