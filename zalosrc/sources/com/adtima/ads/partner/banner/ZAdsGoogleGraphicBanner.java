package com.adtima.ads.partner.banner;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.helper.ZAdsGoogleRequestBuilder;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import p009a3.C0099d;
import p227i3.AbstractC20202f;
import p227i3.EnumC20200d;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
public final class ZAdsGoogleGraphicBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsGoogleGraphicBanner";
    private AdView mAdGoogleBanner;
    private AdManagerAdView mAdGoogleDFPBanner;
    private String mAdsContentUrl;
    private C0099d mAdsData;
    private ZAdsBannerSize mAdsSize;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;
    private boolean mIsAdsClicked;
    private RelativeLayout mRootLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner$1 */
    /* loaded from: classes2.dex */
    public class C38081 extends AdListener {

        /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner$1$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ZAdsGoogleGraphicBanner.this.mIsAdsClicked = false;
            }
        }

        C38081() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdClicked");
            try {
                if (ZAdsGoogleGraphicBanner.this.mIsAdsClicked) {
                    return;
                }
                ZAdsGoogleGraphicBanner.this.mIsAdsClicked = true;
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onClicked();
                }
                ZAdsGoogleGraphicBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner.1.1
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsGoogleGraphicBanner.this.mIsAdsClicked = false;
                    }
                }, 1000L);
            } catch (Exception unused) {
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdClosed");
            try {
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onClosed();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            try {
                Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdFailedToLoad" + loadAdError.getMessage());
                ZAdsGoogleGraphicBanner.this.stopTimeoutTask();
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onFailed(ZAdsGoogleGraphicBanner.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdLoaded");
            try {
                ZAdsGoogleGraphicBanner.this.stopTimeoutTask();
                ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsIsLoaded = true;
                if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onImpression();
                    ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onLoaded(ZAdsGoogleGraphicBanner.this.mAdsData);
                }
            } catch (Exception unused) {
            }
        }
    }

    public ZAdsGoogleGraphicBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, C0099d c0099d, String str, Bundle bundle) {
        super(context);
        this.mRootLayout = null;
        this.mAdGoogleBanner = null;
        this.mAdGoogleDFPBanner = null;
        this.mIsAdsClicked = false;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsSoundOn = z11;
            this.mAdsSize = zAdsBannerSize;
            this.mAdsData = c0099d;
            this.mAdsContentUrl = str;
            this.mAdsTargeting = bundle;
            this.mRootLayout = new RelativeLayout(context);
            int i13 = AbstractC22010c.f108378a;
            this.mRootLayout.setLayoutParams(new RelativeLayout.LayoutParams(i13, i13));
            this.mRootLayout.setBackgroundColor(-1);
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        try {
            AdView adView = this.mAdGoogleBanner;
            if (adView != null) {
                adView.destroy();
                this.mAdGoogleBanner = null;
            }
            this.mAdsData = null;
            this.mAdsListener = null;
            stopTimeoutTask();
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        RelativeLayout relativeLayout;
        View view;
        try {
            if (this.mAdsSize != ZAdsBannerSize.MEDIUM_RECTANGLE) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            ZAdsGoogleRequestBuilder.initWithSoundRequest(this.mAdsContext, this.mAdsSoundOn);
            int i11 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
            C38081 c38081 = new AdListener() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner.1

                /* renamed from: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner$1$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsGoogleGraphicBanner.this.mIsAdsClicked = false;
                    }
                }

                C38081() {
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClicked() {
                    super.onAdClicked();
                    Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdClicked");
                    try {
                        if (ZAdsGoogleGraphicBanner.this.mIsAdsClicked) {
                            return;
                        }
                        ZAdsGoogleGraphicBanner.this.mIsAdsClicked = true;
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onClicked();
                        }
                        ZAdsGoogleGraphicBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner.1.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                ZAdsGoogleGraphicBanner.this.mIsAdsClicked = false;
                            }
                        }, 1000L);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdClosed");
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onClosed();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    try {
                        Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdFailedToLoad" + loadAdError.getMessage());
                        ZAdsGoogleGraphicBanner.this.stopTimeoutTask();
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onFailed(ZAdsGoogleGraphicBanner.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    Adtima.m18328e(ZAdsGoogleGraphicBanner.TAG, "onAdLoaded");
                    try {
                        ZAdsGoogleGraphicBanner.this.stopTimeoutTask();
                        ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsIsLoaded = true;
                        if (((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onImpression();
                            ((ZAdsPartnerBannerAbstract) ZAdsGoogleGraphicBanner.this).mAdsListener.onLoaded(ZAdsGoogleGraphicBanner.this.mAdsData);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            layoutParams2.addRule(13);
            if (!this.mAdsData.f548b.equals("admob")) {
                if (this.mAdsData.f548b.equals("dfp")) {
                    AdManagerAdRequest build = ZAdsGoogleRequestBuilder.buildDFPRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build();
                    AdManagerAdView adManagerAdView = new AdManagerAdView(getContext());
                    this.mAdGoogleDFPBanner = adManagerAdView;
                    adManagerAdView.setAdSizes(AdSize.MEDIUM_RECTANGLE);
                    this.mAdGoogleDFPBanner.setAdUnitId(this.mAdsData.f550d);
                    this.mAdGoogleDFPBanner.setAdListener(c38081);
                    this.mAdGoogleDFPBanner.loadAd(build);
                    this.mAdGoogleDFPBanner.setLayoutParams(layoutParams2);
                    relativeLayout = this.mRootLayout;
                    view = this.mAdGoogleDFPBanner;
                }
                addView(this.mRootLayout);
                startTimeoutTask(this.mAdsData, AbstractC20202f.f99793U.longValue());
            }
            AdRequest build2 = ZAdsGoogleRequestBuilder.buildAdMobRequest(this.mAdsData, this.mAdsContentUrl, this.mAdsTargeting).build();
            AdView adView = new AdView(getContext());
            this.mAdGoogleBanner = adView;
            adView.setAdSize(AdSize.MEDIUM_RECTANGLE);
            this.mAdGoogleBanner.setAdUnitId(this.mAdsData.f550d);
            this.mAdGoogleBanner.setAdListener(c38081);
            this.mAdGoogleBanner.loadAd(build2);
            this.mAdGoogleBanner.setLayoutParams(layoutParams2);
            relativeLayout = this.mRootLayout;
            view = this.mAdGoogleBanner;
            relativeLayout.addView(view, layoutParams2);
            addView(this.mRootLayout);
            startTimeoutTask(this.mAdsData, AbstractC20202f.f99793U.longValue());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
        try {
            AdView adView = this.mAdGoogleBanner;
            if (adView != null) {
                adView.pause();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
        try {
            AdView adView = this.mAdGoogleBanner;
            if (adView != null) {
                adView.resume();
            }
        } catch (Exception unused) {
        }
    }
}
