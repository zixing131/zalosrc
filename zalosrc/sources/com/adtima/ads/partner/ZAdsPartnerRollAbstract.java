package com.adtima.ads.partner;

import android.content.Context;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public abstract class ZAdsPartnerRollAbstract extends RelativeLayout {
    protected Context mAdsContext;
    protected ZAdsPartnerRollListener mAdsPartnerListener;

    public ZAdsPartnerRollAbstract(Context context) {
        super(context);
        this.mAdsPartnerListener = null;
        this.mAdsContext = context;
    }

    public void dismissAdsPartner() {
    }

    public void loadAdsPartner() {
    }

    public void pauseAdsPartner() {
    }

    public void playAdsPartner() {
    }

    public void resumeAdsPartner() {
    }

    public void setAdsPartnerListener(ZAdsPartnerRollListener zAdsPartnerRollListener) {
        this.mAdsPartnerListener = zAdsPartnerRollListener;
    }
}
