package com.adtima.ads.partner.network;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner;
import com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner;
import java.util.Iterator;
import java.util.List;
import p009a3.C0099d;
import p227i3.C20217u;

/* loaded from: classes2.dex */
class ZAdsNetworkCreator {
    private static final String TAG = "ZAdsNetworkCreator";
    protected String mAdsContentId;
    protected String mAdsContentUrl;
    protected Context mAdsContext;
    protected int mAdsHeight;
    protected ZAdsBannerSize mAdsSize;
    protected boolean mAdsSoundOn;
    protected Bundle mAdsTargeting;
    protected int mAdsWidth;
    protected String mAdsZone;

    /* JADX INFO: Access modifiers changed from: protected */
    public ZAdsNetworkCreator(Context context, String str, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, String str2, String str3, Bundle bundle) {
        try {
            this.mAdsContext = context;
            this.mAdsZone = str;
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsSoundOn = z11;
            this.mAdsSize = zAdsBannerSize;
            this.mAdsContentId = str2;
            this.mAdsContentUrl = str3;
            this.mAdsTargeting = bundle;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    protected synchronized void checkIfHaveRequest(C0099d c0099d) {
        if (c0099d != null) {
            try {
                C20217u.m105538N0().m105609q(0, c0099d, this.mAdsContentId);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveRequestAdsNetwork", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:3:0x0002, B:14:0x0030, B:16:0x0034, B:18:0x003c, B:20:0x004f, B:22:0x0014, B:25:0x0020), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ZAdsPartnerBannerAbstract createAdsPartner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, boolean z11, C0099d c0099d, String str, Bundle bundle) {
        String str2;
        int hashCode;
        char c11;
        try {
            str2 = c0099d.f548b;
            hashCode = str2.hashCode();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "createAdsPartner", e11);
        }
        if (hashCode != 99374) {
            if (hashCode == 92668925 && str2.equals("admob")) {
                c11 = 0;
                if (c11 == 0 && c11 != 1) {
                    return null;
                }
                String str3 = c0099d.f553g;
                return (str3 == null && str3.equals("native")) ? new ZAdsGoogleNativeBanner(context, zAdsBannerSize, i11, i12, z11, c0099d, str, bundle) : new ZAdsGoogleGraphicBanner(context, zAdsBannerSize, i11, i12, z11, c0099d, str, bundle);
            }
            c11 = 65535;
            if (c11 == 0) {
            }
            String str32 = c0099d.f553g;
            if (str32 == null) {
            }
        }
        if (str2.equals("dfp")) {
            c11 = 1;
            if (c11 == 0) {
            }
            String str322 = c0099d.f553g;
            if (str322 == null) {
            }
        }
        c11 = 65535;
        if (c11 == 0) {
        }
        String str3222 = c0099d.f553g;
        if (str3222 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void checkIfHaveRequest(List<C0099d> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    Iterator<C0099d> it = list.iterator();
                    while (it.hasNext()) {
                        C20217u.m105538N0().m105609q(0, it.next(), this.mAdsContentId);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveRequestAdsNetwork", e11);
            }
        }
    }
}
