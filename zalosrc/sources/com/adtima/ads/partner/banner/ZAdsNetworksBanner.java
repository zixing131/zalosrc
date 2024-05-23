package com.adtima.ads.partner.banner;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import java.util.List;
import p009a3.C0099d;

/* loaded from: classes2.dex */
public class ZAdsNetworksBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsNetworksBanner";
    private List<C0099d> adsList;
    private String mAdsContentId;
    private String mAdsContentUrl;
    private ZAdsPartnerViewListener mAdsPartnerListener;
    private ZAdsBannerSize mAdsSize;
    private boolean mAdsSoundOn;
    private Bundle mAdsTargeting;

    public ZAdsNetworksBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, List<C0099d> list, String str, Bundle bundle, String str2, boolean z12) {
        super(context);
        this.mAdsContentUrl = null;
        this.mAdsTargeting = null;
        this.mAdsSoundOn = true;
        this.mAdsSize = null;
        this.mAdsContentId = "";
        this.adsList = null;
        this.mAdsPartnerListener = null;
    }

    private synchronized void checkIfHaveRequestAdsNetwork(C0099d c0099d) {
    }

    private boolean couldEndBeforeTimeout() {
        return true;
    }

    private void setDataToMap(C0099d c0099d, ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract) {
    }

    private void updateMapStatus(String str, int i11) {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        try {
            this.mAdsListener = null;
            stopTimeoutTask();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
    }
}
