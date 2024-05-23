package com.adtima.ads;

/* loaded from: classes2.dex */
public enum ZAdsBannerSize {
    R11_RECTANGLE,
    R31_RECTANGLE,
    R169_RECTANGLE,
    MEDIUM_RECTANGLE,
    LARGE_RECTANGLE,
    FULL_PAGE;

    private static final String[] ARRAYS = {"r11rect", "r31rect", "r169rect", "medium", "large", "fullpage"};

    public static String toString(ZAdsBannerSize zAdsBannerSize) {
        return ARRAYS[zAdsBannerSize.ordinal()];
    }
}
