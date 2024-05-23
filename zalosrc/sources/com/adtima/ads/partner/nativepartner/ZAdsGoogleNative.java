package com.adtima.ads.partner.nativepartner;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsPartnerNativeAbstract;
import com.adtima.ads.partner.ZAdsPartnerNativeListener;
import com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner;
import com.adtima.ads.partner.helper.ZAdsGoogleNativeWrapper;
import com.adtima.ads.partner.helper.ZAdsGoogleRequestBuilder;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import p009a3.C0098c;
import p009a3.C0099d;
import p227i3.AbstractC20202f;

/* loaded from: classes2.dex */
public class ZAdsGoogleNative extends ZAdsPartnerNativeAbstract {
    private static final String TAG = ZAdsGoogleNativeBanner.class.getSimpleName();
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private Bundle mAdsTargeting;
    private boolean mAdsSoundOn = true;
    private Object mNativeAd = null;

    public ZAdsGoogleNative(Context context, C0099d c0099d, String str, Bundle bundle) {
        try {
            this.mAdsContext = context;
            this.mAdsData = c0099d;
            this.mAdsContentUrl = str;
            this.mAdsTargeting = bundle;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:            if (r3 != null) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleAdsReceived(Object obj) {
        ZAdsPartnerNativeListener zAdsPartnerNativeListener;
        String str = TAG;
        Adtima.m18328e(str, "handleAdsReceived");
        try {
            this.mNativeAd = obj;
            stopTimeoutTask();
            if (!ZAdsGoogleNativeWrapper.checkNativeAd(this.mNativeAd)) {
                Adtima.m18328e(str, "not NativeAd");
                zAdsPartnerNativeListener = this.mAdsListener;
                if (zAdsPartnerNativeListener != null) {
                    zAdsPartnerNativeListener.onFailed();
                }
                return;
            }
            ZAdsGoogleNativeWrapper.Transporter transporter = new ZAdsGoogleNativeWrapper.Transporter();
            transporter.adNative = this.mNativeAd;
            C0098c nativeEntity = ZAdsGoogleNativeWrapper.getNativeEntity(this.mAdsContext, transporter);
            this.mAdsNative = nativeEntity;
            if (nativeEntity != null) {
                this.mAdsIsLoaded = true;
                ZAdsPartnerNativeListener zAdsPartnerNativeListener2 = this.mAdsListener;
                if (zAdsPartnerNativeListener2 != null) {
                    zAdsPartnerNativeListener2.onLoaded();
                }
            } else {
                zAdsPartnerNativeListener = this.mAdsListener;
            }
            return;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onContentAdLoaded", e11);
        }
        Adtima.m18329e(TAG, "onContentAdLoaded", e11);
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerNativeAbstract
    public void destroyAdsPartner() {
        try {
            this.mAdsListener = null;
            stopTimeoutTask();
            ZAdsGoogleNativeWrapper.destroy(this.mNativeAd);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerNativeAbstract
    public void haveAdsPartnerClick() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerNativeAbstract
    public void loadAdsPartner() {
        Adtima.m18328e(TAG, "loadAdsPartner");
        try {
            ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
            AdLoader build = new AdLoader.Builder(this.mAdsContext, this.mAdsData.f550d).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.adtima.ads.partner.nativepartner.ZAdsGoogleNative.2
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd) {
                    try {
                        Adtima.m18328e(ZAdsGoogleNative.TAG, "onNativeAdLoaded");
                        ZAdsGoogleNative.this.handleAdsReceived(nativeAd);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNative.TAG, "onNativeAdLoaded", e11);
                    }
                }
            }).withAdListener(new AdListener() { // from class: com.adtima.ads.partner.nativepartner.ZAdsGoogleNative.1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    Adtima.m18328e(ZAdsGoogleNative.TAG, "onAdClicked");
                    try {
                        ZAdsGoogleNative.this.stopTimeoutTask();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNative.TAG, "onAdClicked", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    Adtima.m18328e(ZAdsGoogleNative.TAG, "onAdClosed");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    try {
                        Adtima.m18328e(ZAdsGoogleNative.TAG, "onAdFailedToLoad");
                        ZAdsGoogleNative.this.stopTimeoutTask();
                        if (((ZAdsPartnerNativeAbstract) ZAdsGoogleNative.this).mAdsListener != null) {
                            ((ZAdsPartnerNativeAbstract) ZAdsGoogleNative.this).mAdsListener.onFailed();
                        }
                        Adtima.m18328e(ZAdsGoogleNative.TAG, "Load ad error with code: " + loadAdError.getCode());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNative.TAG, "onAdFailedToLoad", e11);
                    }
                }
            }).withNativeAdOptions(new NativeAdOptions.Builder().setReturnUrlsForImageAssets(true).setRequestMultipleImages(true).setMediaAspectRatio(1).setMediaAspectRatio(2).setAdChoicesPlacement(1).build()).build();
            if (this.mAdsData.f548b.equals("admob")) {
                build.loadAd(ZAdsGoogleRequestBuilder.buildAdMobRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build());
            } else if (this.mAdsData.f548b.equals("dfp")) {
                build.loadAd(ZAdsGoogleRequestBuilder.buildDFPRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build());
            }
            startTimeoutTask(this.mAdsData, AbstractC20202f.f99793U.longValue());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }
}
