package com.adtima.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsListener;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.interstitial.ZAdsGoogleGraphicInterstitial;
import com.adtima.ads.partner.interstitial.ZAdsGoogleNativeInterstitial;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0098c;
import p009a3.C0099d;
import p047c3.C3228a;
import p090d3.C17719b;
import p178g3.AbstractC19207b;
import p196h3.InterfaceC19742d;
import p196h3.InterfaceC19745g;
import p227i3.AbstractC20202f;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20221y;
import p227i3.EnumC20200d;

/* loaded from: classes2.dex */
public final class ZAdsInterstitial implements ZAdsInterface {
    public static final String TAG = "ZAdsInterstitial";
    private Context mAdsContext;
    private String mAdsKind;
    private ZAdsListener mAdsListener;
    private String mAdsZoneId;
    private C3228a mQoSEntity;
    private String mAdsNetwork = null;
    private int mAdsWaitingCount = 0;
    private int mAdsReloadCount = 0;
    private int mAdsRetryCount = 0;
    private boolean mAdsIsLoaded = false;
    private boolean mAdsIsDismiss = false;
    private String mAdsContentId = "";
    private String mAdsContentUrl = null;
    private Bundle mAdsTargetingData = null;
    private boolean mAdsDismissOnClickedPrefer = false;
    private boolean mAdsDismissOnCompletedPrefer = false;
    private boolean mAdsAudioAutoPlayPrefer = true;
    private boolean mAdsVideoAutoPlayPrefer = true;
    private boolean mAdsVideoSoundOnPrefer = true;
    private int mAdsOrientationPrefer = 0;
    private C0099d mAdsNetworkData = null;
    private InterfaceC19745g mAdsLoadListener = null;
    private ZAdsPartnerViewListener mAdsPartnerListener = null;
    private InterfaceC19742d mAdsScheduleListener = null;
    private Intent mAdsAdtimaIntent = null;
    private C17719b mAdsAdtimaData = null;
    private ZAdsPartnerInterstitialAbstract mAdsOtherNetwork = null;
    private String mAdsLoadTag = null;
    private String mContentFilterId = null;
    private long mScheduleTime = 0;
    private boolean mEnableRetry = false;
    private boolean mIsShowed = false;
    private AbstractRunnableC0008c mAdsTask = null;

    /* renamed from: com.adtima.ads.ZAdsInterstitial$1 */
    /* loaded from: classes2.dex */
    public class C37001 implements InterfaceC19745g {

        /* renamed from: com.adtima.ads.ZAdsInterstitial$1$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsInterstitial.this.mAdsWaitingCount);
                ZAdsInterstitial.access$108(ZAdsInterstitial.this);
                ZAdsInterstitial zAdsInterstitial = ZAdsInterstitial.this;
                zAdsInterstitial.loadAds(zAdsInterstitial.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
            }
        }

        /* renamed from: com.adtima.ads.ZAdsInterstitial$1$2 */
        /* loaded from: classes2.dex */
        class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsInterstitial.this.mAdsReloadCount);
                ZAdsInterstitial.access$208(ZAdsInterstitial.this);
                ZAdsInterstitial zAdsInterstitial = ZAdsInterstitial.this;
                zAdsInterstitial.loadAds(zAdsInterstitial.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
            }
        }

        C37001() {
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFailed(int i11) {
            ZAdsInterstitial zAdsInterstitial;
            Handler handler;
            Runnable anonymousClass2;
            long j11;
            try {
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsInterstitial.this.mQoSEntity, false, false);
                if (i11 == -5) {
                    if (ZAdsInterstitial.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                        handler = new Handler();
                        anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsInterstitial.1.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsInterstitial.this.mAdsWaitingCount);
                                ZAdsInterstitial.access$108(ZAdsInterstitial.this);
                                ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                                zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                            }
                        };
                        j11 = AbstractC20202f.f99799a;
                        handler.postDelayed(anonymousClass2, j11);
                        return;
                    }
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        zAdsInterstitial = ZAdsInterstitial.this;
                        zAdsInterstitial.mAdsListener.onAdsLoadFailed(i11);
                    }
                    return;
                }
                if (i11 == -1) {
                    if (ZAdsInterstitial.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                        Adtima.reInitSdk(ZAdsInterstitial.this.mAdsContext, AbstractC20202f.f99816i0);
                        handler = new Handler();
                        anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsInterstitial.1.2
                            AnonymousClass2() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsInterstitial.this.mAdsReloadCount);
                                ZAdsInterstitial.access$208(ZAdsInterstitial.this);
                                ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                                zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                            }
                        };
                        j11 = AbstractC20202f.f99803c;
                        handler.postDelayed(anonymousClass2, j11);
                        return;
                    }
                    if (ZAdsInterstitial.this.mAdsListener == null) {
                        return;
                    } else {
                        zAdsInterstitial = ZAdsInterstitial.this;
                    }
                } else if (i11 == -8) {
                    if (ZAdsInterstitial.this.mAdsListener == null) {
                        return;
                    } else {
                        zAdsInterstitial = ZAdsInterstitial.this;
                    }
                } else if (ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(false)) {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "Empty ad or null, try to load next");
                    ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                    zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag);
                    return;
                } else if (ZAdsInterstitial.this.mAdsListener == null) {
                    return;
                } else {
                    zAdsInterstitial = ZAdsInterstitial.this;
                }
                zAdsInterstitial.mAdsListener.onAdsLoadFailed(i11);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onFailed", e11);
            }
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFinished(boolean z11) {
            try {
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsInterstitial.this.mQoSEntity, z11, true);
                ZAdsInterstitial.this.mAdsWaitingCount = 0;
                ZAdsInterstitial.this.mAdsReloadCount = 0;
                ZAdsInterstitial.this.scheduleRightNow();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onLoaded", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsInterstitial$2 */
    /* loaded from: classes2.dex */
    public class C37012 extends ZAdsPartnerViewListener {
        C37012() {
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onAdNetworkBib(String str) {
            super.onAdNetworkBib(str);
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onAdNetworkBib " + str);
                if (ZAdsInterstitial.this.mAdsNetworkData == null || ZAdsInterstitial.this.mAdsNetworkData.f571y == null || ZAdsInterstitial.this.mAdsNetworkData.f571y.trim().length() == 0) {
                    return;
                }
                ZAdsInterstitial.this.mAdsNetworkData.f571y = str;
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onAdNetworkBib", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onClicked() {
            super.onClicked();
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onClicked");
                ZAdsInterstitial.this.checkIfHaveClick();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onClicked", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onClosed() {
            super.onClosed();
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onClosed");
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mAdsListener.onAdsClosed();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onClosed", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onFailed(Object obj, EnumC20200d enumC20200d) {
            super.onFailed(obj, enumC20200d);
            try {
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsInterstitial.this.mQoSEntity, ZAdsInterstitial.this.mAdsKind, false);
                ZAdsInterstitial.this.mAdsIsLoaded = false;
                Adtima.m18326d(ZAdsInterstitial.TAG, "onFailed and call schedule next");
                ZAdsInterstitial.this.scheduleRightNow();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onFailed", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onImpression() {
            super.onImpression();
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onImpression");
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onImpression", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onInteracted() {
            super.onInteracted();
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onInteracted");
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mAdsListener.onAdsInteracted();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onInteracted", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onLoaded(Object obj) {
            super.onLoaded(obj);
            try {
                Adtima.m18326d(ZAdsInterstitial.TAG, "onLoaded");
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsInterstitial.this.mQoSEntity, ZAdsInterstitial.this.mAdsKind, true);
                ZAdsInterstitial.this.mAdsIsLoaded = true;
                ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(true);
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                    ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                    ZAdsInterstitial.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.BANNER);
                    ZAdsInterstitial.this.checkIfHaveBidding(true);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onLoaded", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onClosed(boolean z11) {
            super.onClosed(z11);
            try {
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mAdsListener.onAdsClosed();
                    ZAdsInterstitial.this.mAdsListener.onAdsClosed(z11);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onClosed", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsInterstitial$3 */
    /* loaded from: classes2.dex */
    public class C37023 implements InterfaceC19742d {
        C37023() {
        }

        @Override // p196h3.InterfaceC19742d
        public void onAdtimaInterstitialShow(C17719b c17719b) {
            ZAdsInterstitial zAdsInterstitial;
            ZAdsListener.ADS_LOAD_KIND ads_load_kind;
            try {
                String str = ZAdsInterstitial.TAG;
                Adtima.m18326d(str, "onAdtimaInterstitialShow");
                ZAdsInterstitial.this.mAdsNetwork = "adtima";
                ZAdsInterstitial.this.mAdsAdtimaData = c17719b;
                if (c17719b == null) {
                    Adtima.m18326d(str, "onAdtimaInterstitialShow adtima is null");
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                    ZAdsInterstitial.this.mAdsIsLoaded = false;
                    ZAdsInterstitial.this.mAdsAdtimaIntent = null;
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-3);
                        return;
                    }
                    return;
                }
                if (ZAdsInterstitial.this.mQoSEntity != null) {
                    ZAdsInterstitial.this.mQoSEntity.m16369c(c17719b.f89805a.f495a);
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                }
                ZAdsInterstitial.this.mAdsKind = c17719b.f89805a.f537v;
                ZAdsInterstitial.this.checkIfHaveRequest();
                ZAdsInterstitial.this.mAdsIsLoaded = true;
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                    ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                    String str2 = c17719b.f89805a.f537v;
                    if (str2.equals("audio")) {
                        zAdsInterstitial = ZAdsInterstitial.this;
                        ads_load_kind = ZAdsListener.ADS_LOAD_KIND.AUDIO;
                    } else {
                        if (!str2.equals("video") && !str2.equals("rich") && !str2.equals("endcard")) {
                            if (!str2.equals("graphic") && !str2.equals("native")) {
                                if (!str2.equals("html")) {
                                    return;
                                }
                                if (c17719b.f89805a.f469B0.equals("programmatic")) {
                                    zAdsInterstitial = ZAdsInterstitial.this;
                                    ads_load_kind = ZAdsListener.ADS_LOAD_KIND.PROGRAMMATIC;
                                } else {
                                    zAdsInterstitial = ZAdsInterstitial.this;
                                    ads_load_kind = ZAdsListener.ADS_LOAD_KIND.HTML;
                                }
                            }
                            zAdsInterstitial = ZAdsInterstitial.this;
                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.BANNER;
                        }
                        zAdsInterstitial = ZAdsInterstitial.this;
                        ads_load_kind = ZAdsListener.ADS_LOAD_KIND.VIDEO;
                    }
                    zAdsInterstitial.hitCallbackWithKind(ads_load_kind);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaInterstitialShow", e11);
            }
        }

        @Override // p196h3.InterfaceC19742d
        public void onEmptyAdsToShow() {
            try {
                String str = ZAdsInterstitial.TAG;
                Adtima.m18326d(str, "onAdtimaEmptyAdsToShow");
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                if (ZAdsInterstitial.this.mContentFilterId != null && ZAdsInterstitial.this.mContentFilterId.trim().length() != 0) {
                    ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(true);
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-4);
                        return;
                    }
                    return;
                }
                if (ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(false)) {
                    Adtima.m18326d(str, "Empty ad or null, try to load next");
                    ZAdsInterstitial zAdsInterstitial = ZAdsInterstitial.this;
                    zAdsInterstitial.loadAds(zAdsInterstitial.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                } else if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-4);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaEmptyAdsToShow", e11);
            }
        }

        @Override // p196h3.InterfaceC19742d
        public void onIMAAudioInterstitialShow(C17719b c17719b) {
            try {
                String str = ZAdsInterstitial.TAG;
                Adtima.m18326d(str, "onIMAAudioInterstitialShow");
                ZAdsInterstitial.this.mAdsNetwork = "ima";
                ZAdsInterstitial.this.mAdsAdtimaData = c17719b;
                if (c17719b == null) {
                    Adtima.m18326d(str, "onIMAAudioInterstitialShow ad is null");
                    if (ZAdsInterstitial.this.mQoSEntity != null) {
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                    }
                    ZAdsInterstitial.this.mAdsIsLoaded = false;
                    ZAdsInterstitial.this.mAdsAdtimaIntent = null;
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-3);
                        return;
                    }
                    return;
                }
                if (ZAdsInterstitial.this.mQoSEntity != null) {
                    ZAdsInterstitial.this.mQoSEntity.m16369c(c17719b.f89805a.f495a);
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                }
                ZAdsInterstitial.this.mAdsKind = c17719b.f89805a.f537v;
                ZAdsInterstitial.this.checkIfHaveRequest();
                ZAdsInterstitial.this.mAdsIsLoaded = true;
                if (ZAdsInterstitial.this.mAdsListener != null) {
                    ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                    ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                    ZAdsInterstitial.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.AUDIO);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaInterstitialShow", e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:10:0x0003, B:12:0x0007, B:15:0x000f, B:17:0x0018, B:18:0x003a, B:26:0x0096, B:28:0x009e, B:29:0x0104, B:31:0x00a9, B:33:0x00ad, B:35:0x00b5, B:36:0x00e0, B:37:0x007e, B:40:0x0087, B:3:0x0122, B:5:0x0131, B:6:0x013b), top: B:9:0x0003 }] */
        @Override // p196h3.InterfaceC19742d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNetworkInterstitialShow(C0099d c0099d) {
            String str;
            char c11 = 0;
            if (c0099d != null) {
                try {
                    String str2 = c0099d.f550d;
                    if (str2 != null && str2.length() != 0) {
                        if (ZAdsInterstitial.this.mQoSEntity != null) {
                            ZAdsInterstitial.this.mQoSEntity.m16369c(c0099d.f547a);
                            ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                        }
                        ZAdsInterstitial.this.mAdsNetworkData = c0099d;
                        ZAdsInterstitial.this.mAdsNetwork = c0099d.f548b;
                        ZAdsInterstitial.this.mAdsKind = c0099d.f553g;
                        Adtima.m18326d(ZAdsInterstitial.TAG, "onNetworkInterstitialShow: " + ZAdsInterstitial.this.mAdsNetwork);
                        String str3 = ZAdsInterstitial.this.mAdsNetwork;
                        int hashCode = str3.hashCode();
                        if (hashCode == 99374) {
                            if (str3.equals("dfp")) {
                                c11 = 1;
                                if (c11 != 0) {
                                }
                                str = c0099d.f553g;
                                if (str == null) {
                                }
                                ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                                ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                                ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                                ZAdsInterstitial.this.checkIfHaveRequest();
                                return;
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            str = c0099d.f553g;
                            if (str == null) {
                            }
                            ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                            ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                            ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                            ZAdsInterstitial.this.checkIfHaveRequest();
                            return;
                        }
                        if (hashCode == 92668925 && str3.equals("admob")) {
                            if (c11 != 0 || c11 == 1) {
                                str = c0099d.f553g;
                                if (str == null && str.equals("native")) {
                                    ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleNativeInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData, ZAdsInterstitial.this.mAdsOrientationPrefer);
                                } else {
                                    ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                                }
                            } else if (ZAdsInterstitial.this.mAdsLoadListener != null) {
                                ZAdsInterstitial.this.mAdsLoadListener.onAdsLoadFailed(-2);
                            }
                            ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                            ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                            ZAdsInterstitial.this.checkIfHaveRequest();
                            return;
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                        str = c0099d.f553g;
                        if (str == null) {
                        }
                        ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                        ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                        ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                        ZAdsInterstitial.this.checkIfHaveRequest();
                        return;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onNetworkInterstitialShow", e11);
                    return;
                }
            }
            Adtima.m18326d(ZAdsInterstitial.TAG, "onNetworkInterstitialShow network is null");
            if (ZAdsInterstitial.this.mAdsLoadListener != null) {
                ZAdsInterstitial.this.mAdsLoadListener.onAdsLoadFailed(-3);
            }
            ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsInterstitial$4 */
    /* loaded from: classes2.dex */
    public class C37034 extends AbstractRunnableC0008c {
        C37034() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            try {
                if (ZAdsInterstitial.this.mQoSEntity != null) {
                    ZAdsInterstitial.this.mQoSEntity.m16382p(System.currentTimeMillis());
                }
                C20217u.m105538N0().m105592S(ZAdsInterstitial.this.mAdsZoneId, ZAdsInterstitial.this.mAdsLoadTag, ZAdsInterstitial.this.mAdsContentId, ZAdsInterstitial.this.mAdsScheduleListener);
                return null;
            } catch (Exception e11) {
                Adtima.m18327d(ZAdsInterstitial.TAG, "scheduleNextTime", e11);
                return null;
            }
        }
    }

    public ZAdsInterstitial(Context context, String str) {
        this.mAdsZoneId = str;
        this.mAdsContext = context;
        setupData();
    }

    static /* synthetic */ int access$108(ZAdsInterstitial zAdsInterstitial) {
        int i11 = zAdsInterstitial.mAdsWaitingCount;
        zAdsInterstitial.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$208(ZAdsInterstitial zAdsInterstitial) {
        int i11 = zAdsInterstitial.mAdsReloadCount;
        zAdsInterstitial.mAdsReloadCount = i11 + 1;
        return i11;
    }

    public static boolean checkAdsTargeting(String str, String str2, String str3) {
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    if (str != null && str.length() != 0) {
                        return C20217u.m105538N0().m105598b0("interstitial", str, str3, str2);
                    }
                    Adtima.m18330p(TAG, "Request with empty zone!");
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkAdsTargeting", e11);
            }
        }
        return false;
    }

    private void checkIfHaveActiveView() {
        try {
            if (this.mAdsNetworkData != null) {
                C20217u.m105538N0().m105609q(2, this.mAdsNetworkData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
        }
    }

    public synchronized void checkIfHaveBidding(boolean z11) {
        try {
            if (this.mAdsNetworkData != null) {
                C20217u.m105538N0().m105572A(this.mAdsNetworkData, z11);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveBidding", e11);
        }
    }

    public void checkIfHaveClick() {
        try {
            if (this.mAdsNetworkData != null) {
                C20217u.m105538N0().m105609q(4, this.mAdsNetworkData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveClick", e11);
        }
    }

    private void checkIfHaveImpression() {
        try {
            if (this.mAdsNetworkData != null) {
                C20217u.m105538N0().m105587P("interstitial", this.mAdsZoneId, this.mAdsLoadTag);
                C20217u.m105538N0().m105609q(1, this.mAdsNetworkData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveImpression", e11);
        }
    }

    private synchronized void checkIfHaveInventory() {
        try {
            C20217u.m105538N0().m105595W(this.mAdsZoneId, this.mAdsIsLoaded);
        } catch (Exception unused) {
        }
    }

    private void checkIfHaveTrueImpression() {
        try {
            if (this.mAdsNetworkData != null) {
                C20217u.m105538N0().m105609q(8, this.mAdsNetworkData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveTrueImpression", e11);
        }
    }

    public synchronized boolean checkIfNeedRetryOrForceReset(boolean z11) {
        int i11;
        boolean z12;
        if (!z11) {
            try {
                if (this.mEnableRetry && (i11 = this.mAdsRetryCount) != AbstractC20202f.f99809f) {
                    z12 = true;
                    this.mAdsRetryCount = i11 + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z12 = false;
        this.mAdsRetryCount = 0;
        return z12;
    }

    private void cleanUpAdsInterstitial() {
        try {
            this.mAdsListener = null;
            if (!this.mIsShowed && this.mQoSEntity != null) {
                this.mQoSEntity = C20212p.m105468m().m105471b(this.mQoSEntity, this.mAdsKind, false);
            }
            if (this.mAdsAdtimaIntent != null) {
                this.mAdsAdtimaIntent = null;
            }
            ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract = this.mAdsOtherNetwork;
            if (zAdsPartnerInterstitialAbstract != null) {
                zAdsPartnerInterstitialAbstract.destroyAdsPartner();
            }
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
            this.mAdsContext = null;
            C0009d.m7c(this.mAdsTask);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanUpAdsInterstitial", e11);
        }
    }

    public void hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND ads_load_kind) {
        Adtima.m18328e(TAG, "hitCallbackWithKind: " + ads_load_kind);
        try {
            ZAdsListener zAdsListener = this.mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsLoadFinished(ads_load_kind);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "hitCallbackWithKind", e11);
        }
    }

    public void scheduleRightNow() {
        try {
            C0009d.m7c(this.mAdsTask);
            this.mAdsTask = new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsInterstitial.4
                C37034() {
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public Object doInBackground() {
                    try {
                        if (ZAdsInterstitial.this.mQoSEntity != null) {
                            ZAdsInterstitial.this.mQoSEntity.m16382p(System.currentTimeMillis());
                        }
                        C20217u.m105538N0().m105592S(ZAdsInterstitial.this.mAdsZoneId, ZAdsInterstitial.this.mAdsLoadTag, ZAdsInterstitial.this.mAdsContentId, ZAdsInterstitial.this.mAdsScheduleListener);
                        return null;
                    } catch (Exception e11) {
                        Adtima.m18327d(ZAdsInterstitial.TAG, "scheduleNextTime", e11);
                        return null;
                    }
                }
            };
            this.mQoSEntity = C20212p.m105468m().m105470a(this.mQoSEntity, this.mAdsZoneId);
            C0009d.m11g(this.mAdsTask);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleRightNow", e11);
        }
    }

    private void setupData() {
        this.mAdsPartnerListener = new ZAdsPartnerViewListener() { // from class: com.adtima.ads.ZAdsInterstitial.2
            C37012() {
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onAdNetworkBib(String str) {
                super.onAdNetworkBib(str);
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onAdNetworkBib " + str);
                    if (ZAdsInterstitial.this.mAdsNetworkData == null || ZAdsInterstitial.this.mAdsNetworkData.f571y == null || ZAdsInterstitial.this.mAdsNetworkData.f571y.trim().length() == 0) {
                        return;
                    }
                    ZAdsInterstitial.this.mAdsNetworkData.f571y = str;
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onAdNetworkBib", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClicked() {
                super.onClicked();
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onClicked");
                    ZAdsInterstitial.this.checkIfHaveClick();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onClicked", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClosed() {
                super.onClosed();
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onClosed");
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsClosed();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onClosed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onFailed(Object obj, EnumC20200d enumC20200d) {
                super.onFailed(obj, enumC20200d);
                try {
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsInterstitial.this.mQoSEntity, ZAdsInterstitial.this.mAdsKind, false);
                    ZAdsInterstitial.this.mAdsIsLoaded = false;
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onFailed and call schedule next");
                    ZAdsInterstitial.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onFailed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onImpression() {
                super.onImpression();
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onImpression");
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onImpression", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onInteracted() {
                super.onInteracted();
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onInteracted");
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsInteracted();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onInteracted", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onLoaded(Object obj) {
                super.onLoaded(obj);
                try {
                    Adtima.m18326d(ZAdsInterstitial.TAG, "onLoaded");
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsInterstitial.this.mQoSEntity, ZAdsInterstitial.this.mAdsKind, true);
                    ZAdsInterstitial.this.mAdsIsLoaded = true;
                    ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(true);
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                        ZAdsInterstitial.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.BANNER);
                        ZAdsInterstitial.this.checkIfHaveBidding(true);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onLoaded", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClosed(boolean z11) {
                super.onClosed(z11);
                try {
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsClosed();
                        ZAdsInterstitial.this.mAdsListener.onAdsClosed(z11);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onClosed", e11);
                }
            }
        };
        this.mAdsScheduleListener = new InterfaceC19742d() { // from class: com.adtima.ads.ZAdsInterstitial.3
            C37023() {
            }

            @Override // p196h3.InterfaceC19742d
            public void onAdtimaInterstitialShow(C17719b c17719b) {
                ZAdsInterstitial zAdsInterstitial;
                ZAdsListener.ADS_LOAD_KIND ads_load_kind;
                try {
                    String str = ZAdsInterstitial.TAG;
                    Adtima.m18326d(str, "onAdtimaInterstitialShow");
                    ZAdsInterstitial.this.mAdsNetwork = "adtima";
                    ZAdsInterstitial.this.mAdsAdtimaData = c17719b;
                    if (c17719b == null) {
                        Adtima.m18326d(str, "onAdtimaInterstitialShow adtima is null");
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                        ZAdsInterstitial.this.mAdsIsLoaded = false;
                        ZAdsInterstitial.this.mAdsAdtimaIntent = null;
                        if (ZAdsInterstitial.this.mAdsListener != null) {
                            ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-3);
                            return;
                        }
                        return;
                    }
                    if (ZAdsInterstitial.this.mQoSEntity != null) {
                        ZAdsInterstitial.this.mQoSEntity.m16369c(c17719b.f89805a.f495a);
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                    }
                    ZAdsInterstitial.this.mAdsKind = c17719b.f89805a.f537v;
                    ZAdsInterstitial.this.checkIfHaveRequest();
                    ZAdsInterstitial.this.mAdsIsLoaded = true;
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                        String str2 = c17719b.f89805a.f537v;
                        if (str2.equals("audio")) {
                            zAdsInterstitial = ZAdsInterstitial.this;
                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.AUDIO;
                        } else {
                            if (!str2.equals("video") && !str2.equals("rich") && !str2.equals("endcard")) {
                                if (!str2.equals("graphic") && !str2.equals("native")) {
                                    if (!str2.equals("html")) {
                                        return;
                                    }
                                    if (c17719b.f89805a.f469B0.equals("programmatic")) {
                                        zAdsInterstitial = ZAdsInterstitial.this;
                                        ads_load_kind = ZAdsListener.ADS_LOAD_KIND.PROGRAMMATIC;
                                    } else {
                                        zAdsInterstitial = ZAdsInterstitial.this;
                                        ads_load_kind = ZAdsListener.ADS_LOAD_KIND.HTML;
                                    }
                                }
                                zAdsInterstitial = ZAdsInterstitial.this;
                                ads_load_kind = ZAdsListener.ADS_LOAD_KIND.BANNER;
                            }
                            zAdsInterstitial = ZAdsInterstitial.this;
                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.VIDEO;
                        }
                        zAdsInterstitial.hitCallbackWithKind(ads_load_kind);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaInterstitialShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19742d
            public void onEmptyAdsToShow() {
                try {
                    String str = ZAdsInterstitial.TAG;
                    Adtima.m18326d(str, "onAdtimaEmptyAdsToShow");
                    ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                    if (ZAdsInterstitial.this.mContentFilterId != null && ZAdsInterstitial.this.mContentFilterId.trim().length() != 0) {
                        ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(true);
                        if (ZAdsInterstitial.this.mAdsListener != null) {
                            ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-4);
                            return;
                        }
                        return;
                    }
                    if (ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(false)) {
                        Adtima.m18326d(str, "Empty ad or null, try to load next");
                        ZAdsInterstitial zAdsInterstitial = ZAdsInterstitial.this;
                        zAdsInterstitial.loadAds(zAdsInterstitial.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                    } else if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-4);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaEmptyAdsToShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19742d
            public void onIMAAudioInterstitialShow(C17719b c17719b) {
                try {
                    String str = ZAdsInterstitial.TAG;
                    Adtima.m18326d(str, "onIMAAudioInterstitialShow");
                    ZAdsInterstitial.this.mAdsNetwork = "ima";
                    ZAdsInterstitial.this.mAdsAdtimaData = c17719b;
                    if (c17719b == null) {
                        Adtima.m18326d(str, "onIMAAudioInterstitialShow ad is null");
                        if (ZAdsInterstitial.this.mQoSEntity != null) {
                            ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
                        }
                        ZAdsInterstitial.this.mAdsIsLoaded = false;
                        ZAdsInterstitial.this.mAdsAdtimaIntent = null;
                        if (ZAdsInterstitial.this.mAdsListener != null) {
                            ZAdsInterstitial.this.mAdsListener.onAdsLoadFailed(-3);
                            return;
                        }
                        return;
                    }
                    if (ZAdsInterstitial.this.mQoSEntity != null) {
                        ZAdsInterstitial.this.mQoSEntity.m16369c(c17719b.f89805a.f495a);
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                    }
                    ZAdsInterstitial.this.mAdsKind = c17719b.f89805a.f537v;
                    ZAdsInterstitial.this.checkIfHaveRequest();
                    ZAdsInterstitial.this.mAdsIsLoaded = true;
                    if (ZAdsInterstitial.this.mAdsListener != null) {
                        ZAdsInterstitial.this.mScheduleTime = System.currentTimeMillis();
                        ZAdsInterstitial.this.mAdsListener.onAdsLoadFinished();
                        ZAdsInterstitial.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.AUDIO);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsInterstitial.TAG, "onAdtimaInterstitialShow", e11);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:10:0x0003, B:12:0x0007, B:15:0x000f, B:17:0x0018, B:18:0x003a, B:26:0x0096, B:28:0x009e, B:29:0x0104, B:31:0x00a9, B:33:0x00ad, B:35:0x00b5, B:36:0x00e0, B:37:0x007e, B:40:0x0087, B:3:0x0122, B:5:0x0131, B:6:0x013b), top: B:9:0x0003 }] */
            @Override // p196h3.InterfaceC19742d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onNetworkInterstitialShow(C0099d c0099d) {
                String str;
                char c11 = 0;
                if (c0099d != null) {
                    try {
                        String str2 = c0099d.f550d;
                        if (str2 != null && str2.length() != 0) {
                            if (ZAdsInterstitial.this.mQoSEntity != null) {
                                ZAdsInterstitial.this.mQoSEntity.m16369c(c0099d.f547a);
                                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, true);
                            }
                            ZAdsInterstitial.this.mAdsNetworkData = c0099d;
                            ZAdsInterstitial.this.mAdsNetwork = c0099d.f548b;
                            ZAdsInterstitial.this.mAdsKind = c0099d.f553g;
                            Adtima.m18326d(ZAdsInterstitial.TAG, "onNetworkInterstitialShow: " + ZAdsInterstitial.this.mAdsNetwork);
                            String str3 = ZAdsInterstitial.this.mAdsNetwork;
                            int hashCode = str3.hashCode();
                            if (hashCode == 99374) {
                                if (str3.equals("dfp")) {
                                    c11 = 1;
                                    if (c11 != 0) {
                                    }
                                    str = c0099d.f553g;
                                    if (str == null) {
                                    }
                                    ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                                    ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                                    ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                                    ZAdsInterstitial.this.checkIfHaveRequest();
                                    return;
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                                str = c0099d.f553g;
                                if (str == null) {
                                }
                                ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                                ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                                ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                                ZAdsInterstitial.this.checkIfHaveRequest();
                                return;
                            }
                            if (hashCode == 92668925 && str3.equals("admob")) {
                                if (c11 != 0 || c11 == 1) {
                                    str = c0099d.f553g;
                                    if (str == null && str.equals("native")) {
                                        ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleNativeInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData, ZAdsInterstitial.this.mAdsOrientationPrefer);
                                    } else {
                                        ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                                    }
                                } else if (ZAdsInterstitial.this.mAdsLoadListener != null) {
                                    ZAdsInterstitial.this.mAdsLoadListener.onAdsLoadFailed(-2);
                                }
                                ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                                ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                                ZAdsInterstitial.this.checkIfHaveRequest();
                                return;
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            str = c0099d.f553g;
                            if (str == null) {
                            }
                            ZAdsInterstitial.this.mAdsOtherNetwork = new ZAdsGoogleGraphicInterstitial(ZAdsInterstitial.this.mAdsContext, ZAdsInterstitial.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsInterstitial.this.mAdsContentUrl, ZAdsInterstitial.this.mAdsTargetingData);
                            ZAdsInterstitial.this.mAdsOtherNetwork.setAdsPartnerListener(ZAdsInterstitial.this.mAdsPartnerListener);
                            ZAdsInterstitial.this.mAdsOtherNetwork.loadAdsPartner();
                            ZAdsInterstitial.this.checkIfHaveRequest();
                            return;
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsInterstitial.TAG, "onNetworkInterstitialShow", e11);
                        return;
                    }
                }
                Adtima.m18326d(ZAdsInterstitial.TAG, "onNetworkInterstitialShow network is null");
                if (ZAdsInterstitial.this.mAdsLoadListener != null) {
                    ZAdsInterstitial.this.mAdsLoadListener.onAdsLoadFailed(-3);
                }
                ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsInterstitial.this.mQoSEntity, false);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0198, code lost:            if (r10.mAdsVideoAutoPlayPrefer != false) goto L159;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showAdtima() {
        char c11;
        Intent intent;
        try {
            this.mAdsAdtimaIntent = new Intent(this.mAdsContext, (Class<?>) ZAdsActivity.class);
            C3228a c3228a = this.mQoSEntity;
            if (c3228a != null) {
                c3228a.m16379m(System.currentTimeMillis());
                ZAdsActivity.handleQoSEntity(this.mQoSEntity);
            }
            ZAdsActivity.handleAdsListener(this.mAdsListener);
            String str = this.mAdsAdtimaData.f89805a.f537v;
            boolean z11 = true;
            switch (str.hashCode()) {
                case -1606803861:
                    if (str.equals("endcard")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3500252:
                    if (str.equals("rich")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3731178:
                    if (str.equals("zalo")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 280343272:
                    if (str.equals("graphic")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                case 2:
                    this.mAdsAdtimaIntent.addFlags(268435456);
                    this.mAdsAdtimaIntent.putExtra("adsData", this.mAdsAdtimaData.m93794b().toString());
                    this.mAdsAdtimaIntent.putExtra("adsContentId", this.mAdsContentId);
                    this.mAdsAdtimaIntent.putExtra("adsLoadTag", this.mAdsLoadTag);
                    this.mAdsAdtimaIntent.putExtra("adsZoneId", this.mAdsZoneId);
                    this.mAdsAdtimaIntent.putExtra("adsOrientationPrefer", this.mAdsOrientationPrefer);
                    break;
                case 3:
                case 4:
                case 5:
                    ZAdsActivity.handleVideoProfile(this.mAdsAdtimaData.f89805a.f494Z);
                    this.mAdsAdtimaIntent.addFlags(268435456);
                    this.mAdsAdtimaIntent.putExtra("adsData", this.mAdsAdtimaData.m93794b().toString());
                    this.mAdsAdtimaIntent.putExtra("adsContentId", this.mAdsContentId);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnClicked", this.mAdsDismissOnClickedPrefer);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnCompleted", this.mAdsDismissOnCompletedPrefer);
                    this.mAdsAdtimaIntent.putExtra("adsSoundOnPrefer", !this.mAdsAdtimaData.f89805a.f500c0 && this.mAdsVideoSoundOnPrefer);
                    if (!AbstractC20202f.f99781I && AbstractC19207b.m100800f(this.mAdsContext)) {
                        this.mAdsAdtimaIntent.putExtra("adsAutoPlayPrefer", false);
                        break;
                    } else {
                        intent = this.mAdsAdtimaIntent;
                        if (this.mAdsAdtimaData.f89805a.f502d0) {
                            break;
                        }
                        z11 = false;
                        intent.putExtra("adsAutoPlayPrefer", z11);
                        break;
                    }
                    break;
                case 6:
                    ZAdsActivity.handleAudioProfile(this.mAdsAdtimaData.f89805a.f498b0);
                    this.mAdsAdtimaIntent.addFlags(268435456);
                    this.mAdsAdtimaIntent.putExtra("adsData", this.mAdsAdtimaData.m93794b().toString());
                    this.mAdsAdtimaIntent.putExtra("adsContentId", this.mAdsContentId);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnClicked", this.mAdsDismissOnClickedPrefer);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnCompleted", this.mAdsDismissOnCompletedPrefer);
                    if (AbstractC20202f.f99782J || !AbstractC19207b.m100800f(this.mAdsContext)) {
                        intent = this.mAdsAdtimaIntent;
                        if (this.mAdsAdtimaData.f89805a.f502d0 && this.mAdsAudioAutoPlayPrefer) {
                            intent.putExtra("adsAutoPlayPrefer", z11);
                            break;
                        }
                        z11 = false;
                        intent.putExtra("adsAutoPlayPrefer", z11);
                    }
                    this.mAdsAdtimaIntent.putExtra("adsAutoPlayPrefer", false);
                    break;
                case 7:
                    this.mAdsAdtimaIntent.addFlags(268435456);
                    this.mAdsAdtimaIntent.putExtra("adsData", this.mAdsAdtimaData.m93794b().toString());
                    this.mAdsAdtimaIntent.putExtra("adsContentId", this.mAdsContentId);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnClicked", this.mAdsDismissOnClickedPrefer);
                    this.mAdsAdtimaIntent.putExtra("adsDismissOnCompleted", this.mAdsDismissOnCompletedPrefer);
                    if (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext)) {
                        this.mAdsAdtimaIntent.putExtra("adsAutoPlayPrefer", this.mAdsVideoAutoPlayPrefer);
                    } else {
                        this.mAdsAdtimaIntent.putExtra("adsAutoPlayPrefer", false);
                    }
                    this.mAdsAdtimaIntent.putExtra("adsSoundOnPrefer", this.mAdsVideoSoundOnPrefer);
                    break;
            }
            this.mAdsAdtimaIntent.putExtra("adsContentId", this.mAdsContentId);
            this.mAdsContext.startActivity(this.mAdsAdtimaIntent);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showAdtima", e11);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[Catch: all -> 0x0017, Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:4:0x0001, B:6:0x000c, B:9:0x002d, B:11:0x0031, B:15:0x001b, B:17:0x001f), top: B:3:0x0001, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void checkIfHaveRequest() {
        try {
            try {
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveRequest", e11);
            }
            if (!this.mAdsNetwork.equals("adtima")) {
                if (this.mAdsNetwork.equals("ima")) {
                }
                if (this.mAdsNetworkData != null) {
                    C20217u.m105538N0().m105609q(0, this.mAdsNetworkData, this.mAdsContentId);
                }
            }
            if (this.mAdsAdtimaData != null) {
                C20217u.m105538N0().m105608p(0, this.mAdsAdtimaData.f89805a, this.mAdsContentId);
            }
            if (this.mAdsNetworkData != null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void dismiss() {
        Adtima.m18326d(TAG, "dismissAds");
        try {
            this.mAdsIsDismiss = true;
            this.mAdsIsLoaded = false;
            cleanUpAdsInterstitial();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "dismissAds", e11);
        }
    }

    public String getAdsContentId() {
        try {
            return this.mAdsContentId;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAdsContentUrl() {
        String str = this.mAdsContentUrl;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str;
                }
            } catch (Exception unused) {
                return str;
            }
        }
        Bundle bundle = this.mAdsTargetingData;
        return bundle != null ? bundle.getString("content_url") : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:            r0 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAdsId() {
        String str;
        C17719b c17719b;
        try {
        } catch (Exception unused) {
            str = null;
        }
        if (!this.mAdsNetwork.equals("adtima") || (c17719b = this.mAdsAdtimaData) == null) {
            C0099d c0099d = this.mAdsNetworkData;
            if (c0099d != null) {
                str = c0099d.f547a;
            }
            str = null;
        } else {
            str = c17719b.f89805a.f495a;
        }
        return str;
    }

    public String getAdsMetaData() {
        C0098c c0098c;
        try {
            C17719b c17719b = this.mAdsAdtimaData;
            if (c17719b != null && (c0098c = c17719b.f89805a) != null) {
                return c0098c.f514j0;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public Bundle getAdsTargeting() {
        return this.mAdsTargetingData;
    }

    public String getAdsZoneId() {
        return this.mAdsZoneId;
    }

    public void haveAdsInventory() {
        try {
            checkIfHaveInventory();
        } catch (Exception unused) {
        }
    }

    public boolean isAdsAudioAutoPlayPrefer() {
        return this.mAdsAudioAutoPlayPrefer;
    }

    public boolean isAdsDismissOnClickedPrefer() {
        return this.mAdsDismissOnClickedPrefer;
    }

    public boolean isAdsDismissOnCompletedPrefer() {
        return this.mAdsDismissOnCompletedPrefer;
    }

    public boolean isAdsLoaded() {
        ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract;
        try {
            if (this.mAdsIsLoaded) {
                if (!this.mAdsNetwork.equals("adtima")) {
                    if (this.mAdsNetwork.equals("ima")) {
                    }
                }
                if (isAdsValid()) {
                    return true;
                }
            }
            if (this.mAdsIsLoaded && (zAdsPartnerInterstitialAbstract = this.mAdsOtherNetwork) != null && zAdsPartnerInterstitialAbstract.isAdsPartnerLoaded()) {
                if (isAdsValid()) {
                    return true;
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "isAdsLoaded", e11);
        }
        return false;
    }

    public boolean isAdsValid() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.mScheduleTime;
            Adtima.m18328e(TAG, "isAdsValid " + currentTimeMillis);
            return currentTimeMillis < AbstractC20202f.f99810f0;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "isAdsValid", e11);
            return true;
        }
    }

    public boolean isAdsVideoAutoPlayPrefer() {
        return this.mAdsVideoAutoPlayPrefer;
    }

    public boolean isAdsVideoSoundOnPrefer() {
        return this.mAdsVideoSoundOnPrefer;
    }

    public boolean isDismissed() {
        return this.mAdsIsDismiss;
    }

    public void loadAds() {
        loadAds(null);
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onDestroy() {
        Adtima.m18326d(TAG, "onDestroy");
        try {
            cleanUpAdsInterstitial();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onDestroy", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onPause() {
        Adtima.m18326d(TAG, "onPause");
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onResume() {
        Adtima.m18326d(TAG, "onResume");
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onStart() {
        try {
            Adtima.m18326d(TAG, "onStart");
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onStart", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onStop() {
        try {
            Adtima.m18326d(TAG, "onStop");
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onStart", e11);
        }
    }

    public void setAdsAudioAutoPlayPrefer(boolean z11) {
        this.mAdsAudioAutoPlayPrefer = z11;
    }

    public void setAdsContentId(String str) {
        if (str == null) {
            str = "";
        }
        try {
            this.mAdsContentId = str;
        } catch (Exception unused) {
        }
    }

    public void setAdsContentUrl(String str) {
        try {
            this.mAdsContentUrl = str;
            if (this.mAdsTargetingData == null) {
                this.mAdsTargetingData = new Bundle();
            }
            this.mAdsTargetingData.putString("content_url", str);
        } catch (Exception unused) {
        }
    }

    public void setAdsDismissOnClickedPrefer(boolean z11) {
        this.mAdsDismissOnClickedPrefer = z11;
    }

    public void setAdsDismissOnCompletedPrefer(boolean z11) {
        this.mAdsDismissOnCompletedPrefer = z11;
    }

    public void setAdsListener(ZAdsListener zAdsListener) {
        this.mAdsListener = zAdsListener;
    }

    public void setAdsOrientationPrefer(int i11) {
        try {
            this.mAdsOrientationPrefer = i11;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setAdsOrientationPrefer", e11);
        }
    }

    public void setAdsTargeting(Bundle bundle) {
        this.mAdsTargetingData = bundle;
    }

    public void setAdsVideoAutoPlayPrefer(boolean z11) {
        this.mAdsVideoAutoPlayPrefer = z11;
    }

    public void setAdsVideoSoundOnPrefer(boolean z11) {
        this.mAdsVideoSoundOnPrefer = z11;
    }

    public void show() {
        ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract;
        Adtima.m18326d(TAG, "show");
        try {
            if (this.mAdsIsLoaded && this.mAdsNetwork != null && AbstractC19207b.m100801g(this.mAdsContext)) {
                this.mIsShowed = true;
                if (!this.mAdsNetwork.equals("adtima")) {
                    if (this.mAdsNetwork.equals("ima")) {
                    }
                    zAdsPartnerInterstitialAbstract = this.mAdsOtherNetwork;
                    if (zAdsPartnerInterstitialAbstract != null && zAdsPartnerInterstitialAbstract.isAdsPartnerLoaded()) {
                        checkIfHaveImpression();
                        checkIfHaveTrueImpression();
                        checkIfHaveActiveView();
                        this.mAdsOtherNetwork.showAdsPartner();
                    }
                    this.mAdsIsLoaded = false;
                }
                if (this.mAdsAdtimaData != null) {
                    showAdtima();
                    this.mAdsIsLoaded = false;
                }
                zAdsPartnerInterstitialAbstract = this.mAdsOtherNetwork;
                if (zAdsPartnerInterstitialAbstract != null) {
                    checkIfHaveImpression();
                    checkIfHaveTrueImpression();
                    checkIfHaveActiveView();
                    this.mAdsOtherNetwork.showAdsPartner();
                }
                this.mAdsIsLoaded = false;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "show", e11);
        }
    }

    public void loadAds(String str) {
        loadAds(str, null);
    }

    public void loadAds(String str, String str2) {
        try {
            this.mAdsLoadTag = str;
            this.mAdsIsLoaded = false;
            this.mContentFilterId = str2;
            this.mQoSEntity = new C3228a();
            this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsInterstitial.1

                /* renamed from: com.adtima.ads.ZAdsInterstitial$1$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsInterstitial.this.mAdsWaitingCount);
                        ZAdsInterstitial.access$108(ZAdsInterstitial.this);
                        ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                        zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                    }
                }

                /* renamed from: com.adtima.ads.ZAdsInterstitial$1$2 */
                /* loaded from: classes2.dex */
                class AnonymousClass2 implements Runnable {
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsInterstitial.this.mAdsReloadCount);
                        ZAdsInterstitial.access$208(ZAdsInterstitial.this);
                        ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                        zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                    }
                }

                C37001() {
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFailed(int i11) {
                    ZAdsInterstitial zAdsInterstitial;
                    Handler handler;
                    Runnable anonymousClass2;
                    long j11;
                    try {
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsInterstitial.this.mQoSEntity, false, false);
                        if (i11 == -5) {
                            if (ZAdsInterstitial.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                                handler = new Handler();
                                anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsInterstitial.1.1
                                    AnonymousClass1() {
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsInterstitial.this.mAdsWaitingCount);
                                        ZAdsInterstitial.access$108(ZAdsInterstitial.this);
                                        ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                                        zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                                    }
                                };
                                j11 = AbstractC20202f.f99799a;
                                handler.postDelayed(anonymousClass2, j11);
                                return;
                            }
                            if (ZAdsInterstitial.this.mAdsListener != null) {
                                zAdsInterstitial = ZAdsInterstitial.this;
                                zAdsInterstitial.mAdsListener.onAdsLoadFailed(i11);
                            }
                            return;
                        }
                        if (i11 == -1) {
                            if (ZAdsInterstitial.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                                Adtima.reInitSdk(ZAdsInterstitial.this.mAdsContext, AbstractC20202f.f99816i0);
                                handler = new Handler();
                                anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsInterstitial.1.2
                                    AnonymousClass2() {
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsInterstitial.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsInterstitial.this.mAdsReloadCount);
                                        ZAdsInterstitial.access$208(ZAdsInterstitial.this);
                                        ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                                        zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag, ZAdsInterstitial.this.mContentFilterId);
                                    }
                                };
                                j11 = AbstractC20202f.f99803c;
                                handler.postDelayed(anonymousClass2, j11);
                                return;
                            }
                            if (ZAdsInterstitial.this.mAdsListener == null) {
                                return;
                            } else {
                                zAdsInterstitial = ZAdsInterstitial.this;
                            }
                        } else if (i11 == -8) {
                            if (ZAdsInterstitial.this.mAdsListener == null) {
                                return;
                            } else {
                                zAdsInterstitial = ZAdsInterstitial.this;
                            }
                        } else if (ZAdsInterstitial.this.checkIfNeedRetryOrForceReset(false)) {
                            Adtima.m18326d(ZAdsInterstitial.TAG, "Empty ad or null, try to load next");
                            ZAdsInterstitial zAdsInterstitial2 = ZAdsInterstitial.this;
                            zAdsInterstitial2.loadAds(zAdsInterstitial2.mAdsLoadTag);
                            return;
                        } else if (ZAdsInterstitial.this.mAdsListener == null) {
                            return;
                        } else {
                            zAdsInterstitial = ZAdsInterstitial.this;
                        }
                        zAdsInterstitial.mAdsListener.onAdsLoadFailed(i11);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsInterstitial.TAG, "onFailed", e11);
                    }
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFinished(boolean z11) {
                    try {
                        ZAdsInterstitial.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsInterstitial.this.mQoSEntity, z11, true);
                        ZAdsInterstitial.this.mAdsWaitingCount = 0;
                        ZAdsInterstitial.this.mAdsReloadCount = 0;
                        ZAdsInterstitial.this.scheduleRightNow();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsInterstitial.TAG, "onLoaded", e11);
                    }
                }
            };
            String str3 = this.mAdsZoneId;
            if (str3 == null || str3.length() == 0) {
                Adtima.m18330p(TAG, "Request with empty zone!");
                return;
            }
            C3228a c3228a = this.mQoSEntity;
            if (c3228a != null) {
                c3228a.m16376j(this.mAdsZoneId);
                this.mQoSEntity.m16378l(System.currentTimeMillis());
            }
            C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "interstitial", "interstitial", this.mAdsZoneId, this.mAdsLoadTag, this.mContentFilterId, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }
}
