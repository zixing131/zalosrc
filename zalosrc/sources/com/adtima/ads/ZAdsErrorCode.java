package com.adtima.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class ZAdsErrorCode {
    public static final int SDK_CACHE_NO_ERROR = 1;
    private static SparseArray<String> SDK_ERROR_MAP = null;
    public static final int SDK_GET_ADS_ERROR = -2;
    public static final int SDK_INIT_ERROR = -1;
    public static final int SDK_INIT_WAITING = -5;
    public static final int SDK_INVALID_ZONE = -7;
    public static final int SDK_NO_ADS_FREQUENCY_CAPPING = -8;
    public static final int SDK_NO_ADS_TO_SHOW = -4;
    public static final int SDK_NO_ERROR = 0;
    public static final int SDK_RENDER_ADS_ERROR = -3;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        SDK_ERROR_MAP = sparseArray;
        sparseArray.put(-1, "Error when init the SDK");
        SDK_ERROR_MAP.put(-2, "Error when getting ads");
        SDK_ERROR_MAP.put(-3, "Error when rendering ads");
        SDK_ERROR_MAP.put(-4, "No ads to show");
        SDK_ERROR_MAP.put(-5, "SDK is waiting to init, please wait!!!");
        SDK_ERROR_MAP.put(-7, "Invalid ZoneID");
        SDK_ERROR_MAP.put(-8, "No ads to show by capping");
    }

    public static String getMessage(int i11) {
        String str = SDK_ERROR_MAP.get(i11);
        return str == null ? "Undefined error" : str;
    }
}
