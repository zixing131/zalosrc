package com.adtima.ads.partner.helper;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.adtima.Adtima;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import p009a3.C0099d;

/* loaded from: classes2.dex */
public final class ZAdsGoogleRequestBuilder {
    private static final String TAG = "ZAdsGoogleRequestBuilder";

    public static AdRequest.Builder buildAdMobRequest(C0099d c0099d, String str, Bundle bundle) {
        AdRequest.Builder builder;
        try {
            builder = new AdRequest.Builder();
            if (c0099d != null) {
                try {
                    try {
                        if (c0099d.f569w != 0.0d && c0099d.f570x != 0.0d) {
                            Location location = new Location("vi");
                            location.setLatitude(c0099d.f569w);
                            location.setLongitude(c0099d.f570x);
                            builder.setLocation(location);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        Adtima.m18329e(TAG, "buildAdMobRequest", e);
                        return builder;
                    }
                } catch (Exception e12) {
                    Adtima.m18329e(TAG, "buildAdMobRequest", e12);
                }
            }
            if (str != null) {
                try {
                    builder.setContentUrl(str);
                } catch (Exception e13) {
                    Adtima.m18329e(TAG, "buildAdMobRequest", e13);
                }
            }
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    String string = bundle.getString(str2);
                    if (string != null) {
                        builder.addKeyword(str2 + ": " + string);
                    }
                }
            }
        } catch (Exception e14) {
            e = e14;
            builder = null;
        }
        return builder;
    }

    public static AdManagerAdRequest.Builder buildDFPRequest(C0099d c0099d, String str, Bundle bundle) {
        AdManagerAdRequest.Builder builder;
        try {
            builder = new AdManagerAdRequest.Builder();
            if (c0099d != null) {
                try {
                    String str2 = c0099d.f571y;
                    if (str2 != null && str2.trim().length() != 0) {
                        builder.addCustomTargeting("c_ecpm", c0099d.f571y);
                    }
                } catch (Exception e11) {
                    e = e11;
                    Adtima.m18329e(TAG, "buildDFPRequest", e);
                    return builder;
                }
            }
            if (c0099d != null) {
                try {
                    if (c0099d.f569w != 0.0d && c0099d.f570x != 0.0d) {
                        Location location = new Location("vi");
                        location.setLatitude(c0099d.f569w);
                        location.setLongitude(c0099d.f570x);
                        builder.setLocation(location);
                    }
                } catch (Exception e12) {
                    Adtima.m18329e(TAG, "buildDFPRequest", e12);
                }
            }
            if (str != null) {
                try {
                    builder.setContentUrl(str);
                } catch (Exception e13) {
                    Adtima.m18329e(TAG, "buildDFPRequest", e13);
                }
            }
            if (bundle != null) {
                for (String str3 : bundle.keySet()) {
                    String string = bundle.getString(str3);
                    if (string != null) {
                        builder.addKeyword(str3 + ": " + string);
                    }
                }
            }
        } catch (Exception e14) {
            e = e14;
            builder = null;
        }
        return builder;
    }

    public static void initWithSoundRequest(Context context, boolean z11) {
        if (z11) {
            return;
        }
        try {
            MobileAds.initialize(context);
            MobileAds.setAppMuted(true);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initWithSoundRequest", e11);
        }
    }
}
