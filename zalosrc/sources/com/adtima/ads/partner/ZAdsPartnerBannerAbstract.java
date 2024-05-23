package com.adtima.ads.partner;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.adtima.Adtima;
import p196h3.InterfaceC19747i;
import p227i3.EnumC20200d;

/* loaded from: classes2.dex */
public abstract class ZAdsPartnerBannerAbstract extends LinearLayout {
    private static final String TAG = "ZAdsPartnerBannerAbstract";
    protected Context mAdsContext;
    protected ZAdsAudioPartnerListener mAdsDaastListener;
    protected int mAdsHeight;
    protected boolean mAdsIsLoaded;
    protected ZAdsPartnerViewListener mAdsListener;
    protected boolean mAdsSoundFocus;
    protected InterfaceC19747i mAdsVastListener;
    protected WebView mAdsWebView0;
    protected WebView mAdsWebView1;
    protected int mAdsWidth;
    protected Handler mHandlerTimeOut;
    protected Runnable mRunnableTimeOut;

    public ZAdsPartnerBannerAbstract(Context context) {
        super(context);
        this.mAdsWidth = 0;
        this.mAdsHeight = 0;
        this.mAdsIsLoaded = false;
        this.mAdsWebView0 = null;
        this.mAdsWebView1 = null;
        this.mAdsDaastListener = null;
        this.mAdsVastListener = null;
        this.mAdsListener = null;
        this.mHandlerTimeOut = null;
        this.mRunnableTimeOut = null;
        this.mAdsSoundFocus = true;
        this.mAdsContext = context;
    }

    public abstract void destroyAdsPartner();

    public boolean isAdsMediaPlaying() {
        return false;
    }

    public boolean isLoadedAdsPartner() {
        return this.mAdsIsLoaded;
    }

    public abstract void loadAdsPartner();

    public abstract void pauseAdsPartner();

    public abstract void resumeAdsPartner();

    public void setAdsDaastListener(ZAdsAudioPartnerListener zAdsAudioPartnerListener) {
        this.mAdsDaastListener = zAdsAudioPartnerListener;
    }

    public void setAdsPartnerListener(ZAdsPartnerViewListener zAdsPartnerViewListener) {
        this.mAdsListener = zAdsPartnerViewListener;
    }

    public void setAdsVastListener(InterfaceC19747i interfaceC19747i) {
        this.mAdsVastListener = interfaceC19747i;
    }

    public void setSoundFocus(boolean z11) {
        this.mAdsSoundFocus = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startTimeoutTask(final Object obj, long j11) {
        try {
            this.mRunnableTimeOut = new Runnable() { // from class: com.adtima.ads.partner.ZAdsPartnerBannerAbstract.1
                @Override // java.lang.Runnable
                public void run() {
                    ZAdsPartnerBannerAbstract.this.stopTimeoutTask();
                    ZAdsPartnerViewListener zAdsPartnerViewListener = ZAdsPartnerBannerAbstract.this.mAdsListener;
                    if (zAdsPartnerViewListener != null) {
                        zAdsPartnerViewListener.onFailed(obj, EnumC20200d.AD_RENDER_ERROR);
                        ZAdsPartnerBannerAbstract.this.mAdsListener = null;
                    }
                }
            };
            Handler handler = new Handler();
            this.mHandlerTimeOut = handler;
            handler.postDelayed(this.mRunnableTimeOut, j11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startTimeoutTask", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void stopTimeoutTask() {
        Runnable runnable;
        try {
            Handler handler = this.mHandlerTimeOut;
            if (handler == null || (runnable = this.mRunnableTimeOut) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
            this.mRunnableTimeOut = null;
            this.mHandlerTimeOut = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "stopTimeoutTask", e11);
        }
    }
}
