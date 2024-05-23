package com.adtima.ads.partner;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class ZAdsPartnerInterstitialAbstract {
    protected Context mAdsContext = null;
    protected boolean mAdsIsLoaded = false;
    protected ZAdsPartnerViewListener mAdsListener = null;

    public abstract void destroyAdsPartner();

    public boolean isAdsPartnerLoaded() {
        return this.mAdsIsLoaded;
    }

    public abstract void loadAdsPartner();

    public abstract void pauseAdsPartner();

    public abstract void resumeAdsPartner();

    public void setAdsPartnerListener(ZAdsPartnerViewListener zAdsPartnerViewListener) {
        this.mAdsListener = zAdsPartnerViewListener;
    }

    public abstract void showAdsPartner();
}
