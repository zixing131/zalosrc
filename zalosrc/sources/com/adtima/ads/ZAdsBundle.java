package com.adtima.ads;

import android.os.Bundle;
import com.adtima.Adtima;
import java.util.HashMap;
import p227i3.C20217u;

/* loaded from: classes2.dex */
public class ZAdsBundle {
    public static final String ALLOW_DUPLICATE = "allow_duplicate";
    private static final String TAG = "ZAdsBundle";
    private HashMap<String, Object> mAdsConfigMap;
    private HashMap<String, String> mAdsZoneIdTypeMap;
    private boolean mAdsPreload = false;
    private String mAdsLoadTag = null;
    private Bundle mAdsTargetingData = null;
    private ZAdsBundleListener mAdsBundleListener = null;

    public ZAdsBundle() {
        this.mAdsZoneIdTypeMap = null;
        this.mAdsConfigMap = null;
        try {
            this.mAdsZoneIdTypeMap = new HashMap<>();
            this.mAdsConfigMap = initAdsDefaultSetting();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    private HashMap<String, Object> initAdsDefaultSetting() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            hashMap.put(ALLOW_DUPLICATE, Boolean.FALSE);
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public void addAdsTargeting(String str, String str2) {
        try {
            if (this.mAdsTargetingData == null) {
                this.mAdsTargetingData = new Bundle();
            }
            this.mAdsTargetingData.putString(str, str2);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "addAdsTargeting", e11);
        }
    }

    public void addAdsZoneIdMap(String str, Class cls) {
        String str2;
        if (str != null) {
            try {
                if (str.length() != 0 && cls != null) {
                    if (cls.equals(ZAdsBanner.class)) {
                        str2 = "banner";
                    } else {
                        if (!cls.equals(ZAdsNative.class) && !cls.equals(ZAdsVideo.class)) {
                            if (cls.equals(ZAdsInterstitial.class)) {
                                str2 = "interstitial";
                            } else if (!cls.equals(ZAdsIncentivized.class)) {
                                return;
                            } else {
                                str2 = "incentivized";
                            }
                        }
                        str2 = "native";
                    }
                    if (this.mAdsZoneIdTypeMap == null) {
                        this.mAdsZoneIdTypeMap = new HashMap<>();
                    }
                    this.mAdsZoneIdTypeMap.put(str, str2);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "addAdsZoneMap", e11);
            }
        }
    }

    public void destroyAds() {
        try {
            HashMap<String, String> hashMap = this.mAdsZoneIdTypeMap;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.mAdsZoneIdTypeMap = null;
            HashMap<String, Object> hashMap2 = this.mAdsConfigMap;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            this.mAdsConfigMap = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAds", e11);
        }
    }

    public String getAdsContentUrl() {
        try {
            Bundle bundle = this.mAdsTargetingData;
            if (bundle != null) {
                return bundle.getString("content_url");
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsContentUrl", e11);
        }
        return null;
    }

    public Bundle getAdsTargeting() {
        try {
            return this.mAdsTargetingData;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
            return null;
        }
    }

    public Bundle getAdsTargetingData() {
        return this.mAdsTargetingData;
    }

    public boolean isAdsPreload() {
        return this.mAdsPreload;
    }

    public void preloadAds() {
        preloadAds(null);
    }

    public void removeAdsZoneIdMap(String str) {
        try {
            HashMap<String, String> hashMap = this.mAdsZoneIdTypeMap;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "removeAdsZoneIdMap", e11);
        }
    }

    public void setAdsContentUrl(String str) {
        try {
            if (this.mAdsTargetingData == null) {
                this.mAdsTargetingData = new Bundle();
            }
            this.mAdsTargetingData.putString("content_url", str);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setAdsContentUrl", e11);
        }
    }

    public void setAdsListener(ZAdsBundleListener zAdsBundleListener) {
        this.mAdsBundleListener = zAdsBundleListener;
    }

    public void setAdsPreload(boolean z11) {
        this.mAdsPreload = z11;
    }

    public void setAdsSetting(String str, Object obj) {
        try {
            if (this.mAdsConfigMap == null) {
                this.mAdsConfigMap = initAdsDefaultSetting();
            }
            this.mAdsConfigMap.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public void setAdsTargeting(Bundle bundle) {
        try {
            this.mAdsTargetingData = bundle;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    public void preloadAds(String str) {
        try {
            this.mAdsLoadTag = str;
            HashMap<String, String> hashMap = this.mAdsZoneIdTypeMap;
            if (hashMap == null || hashMap.size() == 0) {
                Adtima.m18330p(TAG, "Request with empty zones!");
            } else {
                C20217u.m105538N0().m105612u(Adtima.SDK_VERSION_CODE, this.mAdsZoneIdTypeMap, this.mAdsLoadTag, this.mAdsTargetingData, this.mAdsConfigMap, this.mAdsPreload, this.mAdsBundleListener);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAds", e11);
        }
    }
}
