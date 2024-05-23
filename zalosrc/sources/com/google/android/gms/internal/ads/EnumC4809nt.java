package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* loaded from: classes2.dex */
public enum EnumC4809nt implements vu3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: B */
    private static final wu3 f25328B = new wu3() { // from class: com.google.android.gms.internal.ads.lt
    };

    /* renamed from: p */
    private final int f25340p;

    EnumC4809nt(int i11) {
        this.f25340p = i11;
    }

    /* renamed from: c */
    public static EnumC4809nt m25006c(int i11) {
        switch (i11) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static xu3 m25007d() {
        return C4772mt.f24737a;
    }

    /* renamed from: b */
    public final int m25008b() {
        return this.f25340p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f25340p);
    }
}
