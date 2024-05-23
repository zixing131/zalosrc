package com.adtima.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ZAdsAdMap {
    private static HashMap<String, Integer> AD_TYPE_MAP = null;
    private static final int ZADS_BANNER = 2;
    private static final int ZADS_INCENTIVIZED = 4;
    private static final int ZADS_INTERSTITIAL = 5;
    private static final int ZADS_NATIVE = 1;
    private static final int ZADS_UNDEFINE = 0;
    private static final int ZADS_VIDEO = 3;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        AD_TYPE_MAP = hashMap;
        hashMap.put("native", 1);
        AD_TYPE_MAP.put("banner", 2);
        AD_TYPE_MAP.put("video_suite", 3);
        AD_TYPE_MAP.put("incentivized", 4);
        AD_TYPE_MAP.put("interstitial", 5);
    }

    public static int getValue(String str) {
        HashMap<String, Integer> hashMap = AD_TYPE_MAP;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0;
        }
        return AD_TYPE_MAP.get(str).intValue();
    }
}
