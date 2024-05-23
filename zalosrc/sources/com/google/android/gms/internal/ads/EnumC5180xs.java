package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xs */
/* loaded from: classes2.dex */
public enum EnumC5180xs implements vu3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: C */
    private static final wu3 f30604C = new wu3() { // from class: com.google.android.gms.internal.ads.vs
    };

    /* renamed from: p */
    private final int f30616p;

    EnumC5180xs(int i11) {
        this.f30616p = i11;
    }

    /* renamed from: c */
    public static EnumC5180xs m28003c(int i11) {
        switch (i11) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static xu3 m28004d() {
        return C5143ws.f30086a;
    }

    /* renamed from: b */
    public final int m28005b() {
        return this.f30616p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30616p);
    }
}
