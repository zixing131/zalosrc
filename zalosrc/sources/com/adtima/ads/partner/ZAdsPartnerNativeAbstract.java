package com.adtima.ads.partner;

import android.content.Context;
import android.os.Handler;
import com.adtima.Adtima;
import p009a3.C0098c;

/* loaded from: classes2.dex */
public abstract class ZAdsPartnerNativeAbstract {
    private static final String TAG = "ZAdsPartnerNativeAbstract";
    protected Context mAdsContext = null;
    protected boolean mAdsIsLoaded = false;
    protected C0098c mAdsNative = null;
    protected ZAdsPartnerNativeListener mAdsListener = null;
    private Handler mHandlerTimeOut = null;
    private Runnable mRunnableTimeOut = null;

    public abstract void destroyAdsPartner();

    public C0098c getAdsPartner() {
        return this.mAdsNative;
    }

    public abstract void haveAdsPartnerClick();

    public boolean isAdsLoaded() {
        return this.mAdsIsLoaded;
    }

    public abstract void loadAdsPartner();

    public void setAdsPartnerListener(ZAdsPartnerNativeListener zAdsPartnerNativeListener) {
        this.mAdsListener = zAdsPartnerNativeListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startTimeoutTask(Object obj, long j11) {
        try {
            this.mRunnableTimeOut = new Runnable() { // from class: com.adtima.ads.partner.ZAdsPartnerNativeAbstract.1
                @Override // java.lang.Runnable
                public void run() {
                    ZAdsPartnerNativeAbstract.this.stopTimeoutTask();
                    ZAdsPartnerNativeListener zAdsPartnerNativeListener = ZAdsPartnerNativeAbstract.this.mAdsListener;
                    if (zAdsPartnerNativeListener != null) {
                        zAdsPartnerNativeListener.onFailed();
                        ZAdsPartnerNativeAbstract.this.mAdsListener = null;
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
