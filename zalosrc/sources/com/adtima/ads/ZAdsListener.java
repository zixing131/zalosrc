package com.adtima.ads;

import com.adtima.ads.ZAdsBanner;

/* loaded from: classes2.dex */
public class ZAdsListener {

    /* loaded from: classes2.dex */
    public enum ADS_LOAD_KIND {
        BANNER,
        AUDIO,
        VIDEO,
        HTML,
        PROGRAMMATIC,
        INTERACTIVE
    }

    public void onAdsAudioStage(ZAdsAudioStage zAdsAudioStage) {
    }

    public void onAdsClicked() {
    }

    public void onAdsClosed() {
    }

    public boolean onAdsContentHandler(String str) {
        return false;
    }

    public void onAdsInteracted() {
    }

    public void onAdsLoadFailed(int i11) {
    }

    public void onAdsLoadFinished() {
    }

    public void onAdsOpened() {
    }

    public boolean onAdsRequestAudioFocus() {
        return true;
    }

    public void onAdsRewarded(Object obj, String str) {
    }

    public void onAdsVideoStage(ZAdsVideoStage zAdsVideoStage) {
    }

    public void onBannerAdsVisible(ZAdsBanner.BANNER_VISIBLE_STATUS banner_visible_status) {
    }

    public void onAdsClosed(boolean z11) {
    }

    public void onAdsLoadFinished(ADS_LOAD_KIND ads_load_kind) {
    }
}
