package com.adtima.ads.partner.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009a3.C0099d;
import p227i3.AbstractC20202f;
import p227i3.C20211o;

/* loaded from: classes2.dex */
public final class ZAdsNetworksPreload extends ZAdsNetworkCreator {
    private static final String TAG = "ZAdsNetworksPreload";
    private boolean mAdsChooseFinished;
    private HashMap<String, ZAdsPartnerBannerAbstract> mAdsPreloadMap;
    private long mAdsStartPreloadTime;

    /* loaded from: classes2.dex */
    public interface OnAdsPreloadListener {
        void onResult(Map.Entry<C0099d, ZAdsPartnerBannerAbstract> entry);
    }

    protected ZAdsNetworksPreload(Context context, String str, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, String str2, String str3, Bundle bundle) {
        super(context, str, zAdsBannerSize, i11, i12, z11, str2, str3, bundle);
        this.mAdsStartPreloadTime = 0L;
        this.mAdsChooseFinished = false;
        this.mAdsPreloadMap = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map.Entry<C0099d, ZAdsPartnerBannerAbstract> chooseAdsPreload(List<C0099d> list) {
        ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract;
        AbstractMap.SimpleEntry simpleEntry = null;
        try {
            HashMap<String, ZAdsPartnerBannerAbstract> hashMap = this.mAdsPreloadMap;
            if (hashMap != null && hashMap.size() != 0 && list != null && list.size() != 0) {
                checkIfHaveRequest(list);
                int i11 = 0;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    C0099d c0099d = list.get(i11);
                    if (c0099d != null && (zAdsPartnerBannerAbstract = this.mAdsPreloadMap.get(c0099d.f547a)) != null && zAdsPartnerBannerAbstract.isLoadedAdsPartner()) {
                        simpleEntry = new AbstractMap.SimpleEntry(c0099d, this.mAdsPreloadMap.remove(c0099d.f547a));
                        break;
                    }
                    i11++;
                }
                this.mAdsChooseFinished = true;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "chooseAdsPartner", e11);
        }
        return simpleEntry;
    }

    private void preloadAdsNetwork() {
        List<C0099d> m105460d;
        try {
            if (AbstractC20202f.f99796X.equals(AbstractC20202f.f99795W) && (m105460d = C20211o.m105458b(this.mAdsContext).m105460d(this.mAdsZone)) != null && m105460d.size() != 0) {
                this.mAdsPreloadMap = new HashMap<>();
                this.mAdsStartPreloadTime = System.currentTimeMillis();
                for (C0099d c0099d : m105460d) {
                    ZAdsPartnerBannerAbstract createAdsPartner = createAdsPartner(this.mAdsContext, this.mAdsSize, this.mAdsWidth, this.mAdsHeight, this.mAdsSoundOn, c0099d, this.mAdsContentUrl, this.mAdsTargeting);
                    if (createAdsPartner != null) {
                        createAdsPartner.loadAdsPartner();
                        this.mAdsPreloadMap.put(c0099d.f547a, createAdsPartner);
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }

    public static ZAdsNetworksPreload prepare(Context context, String str, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, String str2, String str3, Bundle bundle) {
        ZAdsNetworksPreload zAdsNetworksPreload;
        try {
            zAdsNetworksPreload = new ZAdsNetworksPreload(context, str, zAdsBannerSize, i11, i12, z11, str2, str3, bundle);
            try {
                zAdsNetworksPreload.preloadAdsNetwork();
            } catch (Exception e11) {
                e = e11;
                Adtima.m18329e(TAG, "prepare", e);
                return zAdsNetworksPreload;
            }
        } catch (Exception e12) {
            e = e12;
            zAdsNetworksPreload = null;
        }
        return zAdsNetworksPreload;
    }

    public boolean checkAdsPreload() {
        try {
            HashMap<String, ZAdsPartnerBannerAbstract> hashMap = this.mAdsPreloadMap;
            if (hashMap != null) {
                if (hashMap.size() != 0) {
                    return true;
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkAdsPreload", e11);
        }
        return false;
    }

    public boolean checkAdsServed() {
        return this.mAdsChooseFinished;
    }

    public void destroy() {
        try {
            HashMap<String, ZAdsPartnerBannerAbstract> hashMap = this.mAdsPreloadMap;
            if (hashMap != null) {
                Iterator<Map.Entry<String, ZAdsPartnerBannerAbstract>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ZAdsPartnerBannerAbstract value = it.next().getValue();
                    if (value != null) {
                        value.destroyAdsPartner();
                    }
                }
                this.mAdsPreloadMap.clear();
                this.mAdsPreloadMap = null;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    public void serveAdsPreload(C0099d c0099d, OnAdsPreloadListener onAdsPreloadListener) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c0099d);
            serveAdsPreload(arrayList, onAdsPreloadListener);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "serveAdsPartner", e11);
        }
    }

    public void serveAdsPreload(final List<C0099d> list, final OnAdsPreloadListener onAdsPreloadListener) {
        try {
            Adtima.m18326d(TAG, "serveAdsPartner");
            long longValue = AbstractC20202f.f99798Z.longValue() - (System.currentTimeMillis() - this.mAdsStartPreloadTime);
            if (longValue > 0) {
                new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.network.ZAdsNetworksPreload.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            OnAdsPreloadListener onAdsPreloadListener2 = onAdsPreloadListener;
                            if (onAdsPreloadListener2 != null) {
                                onAdsPreloadListener2.onResult(ZAdsNetworksPreload.this.chooseAdsPreload(list));
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsNetworksPreload.TAG, "serveAdsPartner", e11);
                        }
                    }
                }, longValue);
            } else if (onAdsPreloadListener != null) {
                onAdsPreloadListener.onResult(chooseAdsPreload(list));
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "serveAdsPartner", e11);
        }
    }
}
