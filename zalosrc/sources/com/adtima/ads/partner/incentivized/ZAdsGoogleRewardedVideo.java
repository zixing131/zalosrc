package com.adtima.ads.partner.incentivized;

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
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import p009a3.C0099d;
import p227i3.EnumC20200d;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public class ZAdsGoogleRewardedVideo extends ZAdsPartnerInterstitialAbstract {
    private static final String TAG = "ZAdsGoogleRewardedVideo";
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;
    private RewardedAd mRewardedAd = null;
    private OnUserEarnedRewardListener mAdCallback = null;
    private RewardedAdLoadCallback mAdLoadCallback = null;
    private FullScreenContentCallback mFullScreenContentCallback = null;
    private boolean mIsAdsClicked = false;

    public ZAdsGoogleRewardedVideo(Context context, boolean z11, C0099d c0099d, String str, Bundle bundle) {
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
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mAdsIsLoaded = false;
            this.mRewardedAd = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public boolean isAdsPartnerLoaded() {
        return this.mAdsIsLoaded;
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void loadAdsPartner() {
        try {
            String str = this.mAdsData.f550d;
            if (str != null && str.trim().length() != 0) {
                ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
                this.mFullScreenContentCallback = new FullScreenContentCallback() { // from class: com.adtima.ads.partner.incentivized.ZAdsGoogleRewardedVideo.1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdClicked() {
                        Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "onAdClicked");
                        try {
                            if (ZAdsGoogleRewardedVideo.this.mIsAdsClicked) {
                                return;
                            }
                            ZAdsGoogleRewardedVideo.this.mIsAdsClicked = true;
                            if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener != null) {
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onClicked();
                            }
                            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.incentivized.ZAdsGoogleRewardedVideo.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ZAdsGoogleRewardedVideo.this.mIsAdsClicked = false;
                                }
                            }, 1000L);
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "onAdDismissedFullScreenContent");
                        ZAdsGoogleRewardedVideo.this.mRewardedAd = null;
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onClosed();
                        }
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "onAdFailedToShowFullScreenContent");
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onFailed(adError, EnumC20200d.AD_RENDER_ERROR);
                        }
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdImpression() {
                        Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "onAdImpression");
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "onAdShowedFullScreenContent");
                    }
                };
                this.mAdCallback = new OnUserEarnedRewardListener() { // from class: com.adtima.ads.partner.incentivized.ZAdsGoogleRewardedVideo.2
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public void onUserEarnedReward(RewardItem rewardItem) {
                        Adtima.m18326d(ZAdsGoogleRewardedVideo.TAG, "onUserEarnedReward");
                        try {
                            if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener != null) {
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onRewarded();
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsGoogleRewardedVideo.TAG, "onUserEarnedReward", e11);
                        }
                    }
                };
                this.mAdLoadCallback = new RewardedAdLoadCallback() { // from class: com.adtima.ads.partner.incentivized.ZAdsGoogleRewardedVideo.3
                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        ZAdsPartnerViewListener zAdsPartnerViewListener;
                        C0099d c0099d;
                        EnumC20200d enumC20200d;
                        Adtima.m18326d(ZAdsGoogleRewardedVideo.TAG, "onRewardedAdFailedToLoad");
                        try {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsIsLoaded = false;
                            if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener != null) {
                                if (3 == loadAdError.getCode()) {
                                    zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener;
                                    c0099d = ZAdsGoogleRewardedVideo.this.mAdsData;
                                    enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                                } else {
                                    zAdsPartnerViewListener = ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener;
                                    c0099d = ZAdsGoogleRewardedVideo.this.mAdsData;
                                    enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                                }
                                zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                            }
                            Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "Load ad error with code: " + loadAdError.getCode());
                            Adtima.m18328e(ZAdsGoogleRewardedVideo.TAG, "Load ad error with message: " + loadAdError.getMessage());
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsGoogleRewardedVideo.TAG, "onRewardedAdFailedToLoad", e11);
                        }
                    }

                    @Override // com.google.android.gms.ads.AdLoadCallback
                    public void onAdLoaded(RewardedAd rewardedAd) {
                        Adtima.m18326d(ZAdsGoogleRewardedVideo.TAG, "onRewardedAdLoaded");
                        try {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsIsLoaded = true;
                            ZAdsGoogleRewardedVideo.this.mRewardedAd = rewardedAd;
                            ZAdsGoogleRewardedVideo.this.mRewardedAd.setFullScreenContentCallback(ZAdsGoogleRewardedVideo.this.mFullScreenContentCallback);
                            if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener == null || ZAdsGoogleRewardedVideo.this.mRewardedAd == null) {
                                return;
                            }
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onImpression();
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleRewardedVideo.this).mAdsListener.onLoaded(ZAdsGoogleRewardedVideo.this.mAdsData);
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsGoogleRewardedVideo.TAG, "onRewardedAdLoaded", e11);
                        }
                    }
                };
                if (this.mAdsData.f548b.equals("admob")) {
                    RewardedAd.load(this.mAdsContext, this.mAdsData.f550d, ZAdsGoogleRequestBuilder.buildAdMobRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build(), this.mAdLoadCallback);
                } else if (this.mAdsData.f548b.equals("dfp")) {
                    RewardedAd.load(this.mAdsContext, this.mAdsData.f550d, ZAdsGoogleRequestBuilder.buildDFPRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build(), this.mAdLoadCallback);
                }
            }
            ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
            if (zAdsPartnerViewListener != null) {
                zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void pauseAdsPartner() {
        try {
            Adtima.m18326d(TAG, "pauseAdsPartner");
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void resumeAdsPartner() {
        try {
            Adtima.m18326d(TAG, "resumeAdsPartner");
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "resumeAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void showAdsPartner() {
        try {
            this.mAdsIsLoaded = false;
            if (this.mRewardedAd != null) {
                this.mRewardedAd.show(AbstractC22011d.m114902c(), this.mAdCallback);
            } else {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showAdsPartner", e11);
        }
    }
}
