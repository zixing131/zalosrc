package com.adtima.ads.partner.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009a3.C0099d;
import p227i3.AbstractC20202f;
import p227i3.EnumC20200d;

/* loaded from: classes2.dex */
public final class ZAdsNetworkBundle extends ZAdsNetworkCreator {
    private static final String TAG = "ZAdsNetworkBundle";
    private HashMap<String, ZAdsPartnerBannerAbstract> mAdsBundleMap;
    private HashMap<String, Integer> mAdsBundleStatus;
    private long mAdsStartBundleTime;
    protected Handler mHandlerTimeOut;
    protected Runnable mRunnableTimeOut;

    /* loaded from: classes2.dex */
    public interface onAdsBundleListener {
        void onResult(Map.Entry<C0099d, ZAdsPartnerBannerAbstract> entry);
    }

    protected ZAdsNetworkBundle(Context context, String str, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, String str2, String str3, Bundle bundle) {
        super(context, str, zAdsBannerSize, i11, i12, z11, str2, str3, bundle);
        this.mAdsStartBundleTime = 0L;
        this.mHandlerTimeOut = null;
        this.mRunnableTimeOut = null;
        this.mAdsBundleStatus = null;
        this.mAdsBundleMap = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void chooseAdsBundle(final List<C0099d> list, final onAdsBundleListener onadsbundlelistener) {
        long longValue;
        AbstractMap.SimpleEntry simpleEntry;
        ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract;
        Runnable runnable;
        try {
            try {
                Handler handler = this.mHandlerTimeOut;
                if (handler != null && (runnable = this.mRunnableTimeOut) != null) {
                    handler.removeCallbacks(runnable);
                    this.mHandlerTimeOut.removeCallbacksAndMessages(null);
                }
                longValue = AbstractC20202f.f99798Z.longValue() - (System.currentTimeMillis() - this.mAdsStartBundleTime);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkAdsBundleTimeout", e11);
            }
            if (longValue > 0 && list.size() != this.mAdsBundleStatus.size()) {
                Runnable runnable2 = new Runnable() { // from class: com.adtima.ads.partner.network.ZAdsNetworkBundle.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsNetworkBundle.this.chooseAdsBundle(list, onadsbundlelistener);
                    }
                };
                this.mRunnableTimeOut = runnable2;
                this.mHandlerTimeOut.postDelayed(runnable2, longValue);
            }
            if (this.mAdsBundleStatus != null && this.mAdsBundleMap != null) {
                Iterator<C0099d> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        simpleEntry = null;
                        break;
                    }
                    C0099d next = it.next();
                    if (next != null && this.mAdsBundleStatus.get(next.f547a) != null && this.mAdsBundleStatus.get(next.f547a).intValue() == 1 && (zAdsPartnerBannerAbstract = this.mAdsBundleMap.get(next.f547a)) != null && zAdsPartnerBannerAbstract.isLoadedAdsPartner()) {
                        simpleEntry = new AbstractMap.SimpleEntry(next, zAdsPartnerBannerAbstract);
                        break;
                    }
                }
                this.mHandlerTimeOut = null;
                onadsbundlelistener.onResult(simpleEntry);
            }
            onadsbundlelistener.onResult(null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ZAdsNetworkBundle prepare(Context context, String str, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, String str2, String str3, Bundle bundle) {
        try {
            return new ZAdsNetworkBundle(context, str, zAdsBannerSize, i11, i12, z11, str2, str3, bundle);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "prepare", e11);
            return null;
        }
    }

    public void loadAdsBundle(final List<C0099d> list, final onAdsBundleListener onadsbundlelistener) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    this.mAdsBundleStatus = new HashMap<>();
                    this.mAdsBundleMap = new HashMap<>();
                    ZAdsPartnerViewListener zAdsPartnerViewListener = new ZAdsPartnerViewListener() { // from class: com.adtima.ads.partner.network.ZAdsNetworkBundle.1
                        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
                        public void onFailed(Object obj, EnumC20200d enumC20200d) {
                            super.onFailed(obj, enumC20200d);
                            try {
                                if (obj instanceof C0099d) {
                                    ZAdsNetworkBundle.this.mAdsBundleStatus.put(((C0099d) obj).f547a, 2);
                                    ZAdsNetworkBundle zAdsNetworkBundle = ZAdsNetworkBundle.this;
                                    if (zAdsNetworkBundle.mHandlerTimeOut != null) {
                                        zAdsNetworkBundle.chooseAdsBundle(list, onadsbundlelistener);
                                    }
                                }
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsNetworkBundle.TAG, "onFailed", e11);
                            }
                        }

                        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
                        public void onLoaded(Object obj) {
                            super.onLoaded(obj);
                            try {
                                if (obj instanceof C0099d) {
                                    ZAdsNetworkBundle.this.mAdsBundleStatus.put(((C0099d) obj).f547a, 1);
                                    ZAdsNetworkBundle zAdsNetworkBundle = ZAdsNetworkBundle.this;
                                    if (zAdsNetworkBundle.mHandlerTimeOut != null) {
                                        zAdsNetworkBundle.chooseAdsBundle(list, onadsbundlelistener);
                                    }
                                }
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsNetworkBundle.TAG, "onLoaded", e11);
                            }
                        }
                    };
                    for (C0099d c0099d : list) {
                        ZAdsPartnerBannerAbstract createAdsPartner = createAdsPartner(this.mAdsContext, this.mAdsSize, this.mAdsWidth, this.mAdsHeight, this.mAdsSoundOn, c0099d, this.mAdsContentUrl, this.mAdsTargeting);
                        if (createAdsPartner != null) {
                            createAdsPartner.setAdsPartnerListener(zAdsPartnerViewListener);
                            createAdsPartner.loadAdsPartner();
                            this.mAdsBundleMap.put(c0099d.f547a, createAdsPartner);
                        }
                    }
                    checkIfHaveRequest(list);
                    this.mAdsStartBundleTime = System.currentTimeMillis();
                    this.mHandlerTimeOut = new Handler();
                    chooseAdsBundle(list, onadsbundlelistener);
                    return;
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "loadAdsBundle", e11);
                return;
            }
        }
        if (onadsbundlelistener != null) {
            onadsbundlelistener.onResult(null);
        }
    }
}
