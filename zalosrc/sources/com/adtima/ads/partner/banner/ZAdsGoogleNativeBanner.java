package com.adtima.ads.partner.banner;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.helper.ZAdsGoogleNativeWrapper;
import com.adtima.ads.partner.helper.ZAdsGoogleRequestBuilder;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.List;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0099d;
import p227i3.AbstractC20202f;
import p227i3.EnumC20200d;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public final class ZAdsGoogleNativeBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsGoogleNativeBanner";
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private ZAdsBannerSize mAdsSize;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;
    private double mImageRatio;
    private boolean mIsAdsClicked;
    private int mLoadingImage;
    private Object mNativeAd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner$1 */
    /* loaded from: classes2.dex */
    public class C38091 extends AdListener {

        /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner$1$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ZAdsGoogleNativeBanner.this.mIsAdsClicked = false;
            }
        }

        C38091() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdClicked");
            try {
                ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                if (ZAdsGoogleNativeBanner.this.mIsAdsClicked) {
                    return;
                }
                ZAdsGoogleNativeBanner.this.mIsAdsClicked = true;
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onClicked();
                }
                ZAdsGoogleNativeBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner.1.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsGoogleNativeBanner.this.mIsAdsClicked = false;
                    }
                }, 1000L);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onAdClicked", e11);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdClosed");
            try {
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onClosed();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            ZAdsPartnerViewListener zAdsPartnerViewListener;
            C0099d c0099d;
            EnumC20200d enumC20200d;
            try {
                Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdFailedToLoad");
                ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                    if (3 == loadAdError.getCode()) {
                        zAdsPartnerViewListener = ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener;
                        c0099d = ZAdsGoogleNativeBanner.this.mAdsData;
                        enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                    } else {
                        zAdsPartnerViewListener = ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener;
                        c0099d = ZAdsGoogleNativeBanner.this.mAdsData;
                        enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                    }
                    zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                }
                Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "Load ad error with code: " + loadAdError.getCode());
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onAdFailedToLoad", e11);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
        }
    }

    /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner$2 */
    /* loaded from: classes2.dex */
    class C38102 implements NativeAd.OnNativeAdLoadedListener {
        C38102() {
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd nativeAd) {
            try {
                Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "handleAdsReceived");
                ZAdsGoogleNativeBanner.this.handleAdsReceived(nativeAd);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onUnifiedNativeAdLoaded", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner$3 */
    /* loaded from: classes2.dex */
    public class C38113 extends AbstractRunnableC0008c {
        final /* synthetic */ String val$imgUrl;

        C38113(String str) {
            r2 = str;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Double doInBackground() {
            double d11 = 0.0d;
            try {
                d11 = AbstractC22011d.m114917r(r2);
                Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, r2 + "  : " + d11);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "doInBackground", e11);
            }
            return Double.valueOf(d11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Double d11) {
            try {
                ZAdsGoogleNativeBanner.access$1318(ZAdsGoogleNativeBanner.this, d11.doubleValue());
                ZAdsGoogleNativeBanner.access$1410(ZAdsGoogleNativeBanner.this);
                Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, ZAdsGoogleNativeBanner.this.mImageRatio + "  ||  " + ZAdsGoogleNativeBanner.this.mLoadingImage);
                if (ZAdsGoogleNativeBanner.this.mLoadingImage == 0) {
                    ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                    if (ZAdsGoogleNativeBanner.this.mImageRatio >= 1.734d) {
                        ZAdsGoogleNativeBanner.this.renderBanner();
                    } else if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                        ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onFailed(ZAdsGoogleNativeBanner.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "getImageRatio", e11);
            }
        }
    }

    public ZAdsGoogleNativeBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, C0099d c0099d, String str, Bundle bundle) {
        super(context);
        this.mNativeAd = null;
        this.mImageRatio = 0.0d;
        this.mLoadingImage = 0;
        this.mIsAdsClicked = false;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsSoundOn = z11;
            this.mAdsSize = zAdsBannerSize;
            this.mAdsData = c0099d;
            this.mAdsContentUrl = str;
            this.mAdsTargeting = bundle;
        } catch (Exception unused) {
        }
    }

    static /* synthetic */ double access$1318(ZAdsGoogleNativeBanner zAdsGoogleNativeBanner, double d11) {
        double d12 = zAdsGoogleNativeBanner.mImageRatio + d11;
        zAdsGoogleNativeBanner.mImageRatio = d12;
        return d12;
    }

    static /* synthetic */ int access$1410(ZAdsGoogleNativeBanner zAdsGoogleNativeBanner) {
        int i11 = zAdsGoogleNativeBanner.mLoadingImage;
        zAdsGoogleNativeBanner.mLoadingImage = i11 - 1;
        return i11;
    }

    private void getImageRatio(String str) {
        try {
            C0009d.m11g(new AbstractRunnableC0008c() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner.3
                final /* synthetic */ String val$imgUrl;

                C38113(String str2) {
                    r2 = str2;
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public Double doInBackground() {
                    double d11 = 0.0d;
                    try {
                        d11 = AbstractC22011d.m114917r(r2);
                        Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, r2 + "  : " + d11);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "doInBackground", e11);
                    }
                    return Double.valueOf(d11);
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(Double d11) {
                    try {
                        ZAdsGoogleNativeBanner.access$1318(ZAdsGoogleNativeBanner.this, d11.doubleValue());
                        ZAdsGoogleNativeBanner.access$1410(ZAdsGoogleNativeBanner.this);
                        Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, ZAdsGoogleNativeBanner.this.mImageRatio + "  ||  " + ZAdsGoogleNativeBanner.this.mLoadingImage);
                        if (ZAdsGoogleNativeBanner.this.mLoadingImage == 0) {
                            ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                            if (ZAdsGoogleNativeBanner.this.mImageRatio >= 1.734d) {
                                ZAdsGoogleNativeBanner.this.renderBanner();
                            } else if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                                ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onFailed(ZAdsGoogleNativeBanner.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                            }
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "getImageRatio", e11);
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getImageRatio", e11);
        }
    }

    public void handleAdsReceived(Object obj) {
        try {
            this.mNativeAd = obj;
            stopTimeoutTask();
            if (!ZAdsGoogleNativeWrapper.checkNativeAd(this.mNativeAd)) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            List<NativeAd.Image> images = ((NativeAd) this.mNativeAd).getImages();
            this.mLoadingImage = images.size();
            for (int i11 = 0; i11 < images.size(); i11++) {
                try {
                    getImageRatio(images.get(i11).getUri().toString());
                } catch (Exception e11) {
                    Adtima.m18329e(TAG, "getImageRatio", e11);
                }
            }
            startTimeoutTask(this.mAdsData, AbstractC20202f.f99797Y.longValue());
        } catch (Exception e12) {
            Adtima.m18329e(TAG, "onContentAdLoaded", e12);
            ZAdsPartnerViewListener zAdsPartnerViewListener2 = this.mAdsListener;
            if (zAdsPartnerViewListener2 != null) {
                zAdsPartnerViewListener2.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
            }
        }
    }

    public void renderBanner() {
        try {
            ZAdsGoogleNativeWrapper.Transporter transporter = new ZAdsGoogleNativeWrapper.Transporter();
            transporter.adNative = this.mNativeAd;
            transporter.adSize = this.mAdsSize;
            View register = ZAdsGoogleNativeWrapper.register(this.mAdsContext, transporter, 1);
            if (register != null) {
                addView(register);
                this.mAdsIsLoaded = true;
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onImpression();
                    this.mAdsListener.onLoaded(this.mAdsData);
                }
            } else {
                ZAdsPartnerViewListener zAdsPartnerViewListener2 = this.mAdsListener;
                if (zAdsPartnerViewListener2 != null) {
                    zAdsPartnerViewListener2.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "renderBanner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        try {
            this.mAdsListener = null;
            stopTimeoutTask();
            ZAdsGoogleNativeWrapper.destroy(this.mNativeAd);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        try {
            ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
            AdLoader build = new AdLoader.Builder(this.mAdsContext, this.mAdsData.f550d).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner.2
                C38102() {
                }

                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public void onNativeAdLoaded(NativeAd nativeAd) {
                    try {
                        Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "handleAdsReceived");
                        ZAdsGoogleNativeBanner.this.handleAdsReceived(nativeAd);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onUnifiedNativeAdLoaded", e11);
                    }
                }
            }).withAdListener(new AdListener() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner.1

                /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner$1$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsGoogleNativeBanner.this.mIsAdsClicked = false;
                    }
                }

                C38091() {
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdClicked");
                    try {
                        ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                        if (ZAdsGoogleNativeBanner.this.mIsAdsClicked) {
                            return;
                        }
                        ZAdsGoogleNativeBanner.this.mIsAdsClicked = true;
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onClicked();
                        }
                        ZAdsGoogleNativeBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner.1.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                ZAdsGoogleNativeBanner.this.mIsAdsClicked = false;
                            }
                        }, 1000L);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onAdClicked", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdClosed");
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener.onClosed();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    ZAdsPartnerViewListener zAdsPartnerViewListener;
                    C0099d c0099d;
                    EnumC20200d enumC20200d;
                    try {
                        Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "onAdFailedToLoad");
                        ZAdsGoogleNativeBanner.this.stopTimeoutTask();
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener != null) {
                            if (3 == loadAdError.getCode()) {
                                zAdsPartnerViewListener = ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener;
                                c0099d = ZAdsGoogleNativeBanner.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_NO_FILL_ERROR;
                            } else {
                                zAdsPartnerViewListener = ((ZAdsPartnerBannerAbstract) ZAdsGoogleNativeBanner.this).mAdsListener;
                                c0099d = ZAdsGoogleNativeBanner.this.mAdsData;
                                enumC20200d = EnumC20200d.AD_RENDER_ERROR;
                            }
                            zAdsPartnerViewListener.onFailed(c0099d, enumC20200d);
                        }
                        Adtima.m18328e(ZAdsGoogleNativeBanner.TAG, "Load ad error with code: " + loadAdError.getCode());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleNativeBanner.TAG, "onAdFailedToLoad", e11);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
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

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
    }
}
