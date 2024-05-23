package com.adtima.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.incentivized.ZAdsGoogleRewardedVideo;
import p009a3.C0099d;
import p047c3.C3228a;
import p090d3.C17720c;
import p178g3.AbstractC19207b;
import p196h3.InterfaceC19741c;
import p196h3.InterfaceC19745g;
import p227i3.AbstractC20202f;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20221y;
import p227i3.EnumC20200d;

/* loaded from: classes2.dex */
public final class ZAdsIncentivized implements ZAdsInterface {
    private static final String TAG = "ZAdsIncentivized";
    private Context mAdsContext;
    private String mAdsZoneId;
    private C3228a mQoSEntity;
    private String mAdsNetwork = null;
    private Handler mAdsHandler = null;
    private Runnable mAdsRunnable = null;
    private int mAdsWaitingCount = 0;
    private int mAdsReloadCount = 0;
    private int mAdsRetryCount = 0;
    private boolean mAdsIsLoaded = false;
    private boolean mAdsIsDismiss = false;
    private String mAdsContentUrl = null;
    private Bundle mAdsTargetingData = null;
    private Object mAdsRewardExtras = null;
    private boolean mAdsDismissOnBackground = false;
    private boolean mAdsVideoAutoPlayPrefer = true;
    private boolean mAdsVideoSoundOnPrefer = true;
    private int mAdsOrientationPrefer = 0;
    private C0099d mAdsData = null;
    private ZAdsListener mAdsListener = null;
    private InterfaceC19745g mAdsLoadListener = null;
    private ZAdsPartnerViewListener mAdsPartnerListener = null;
    private InterfaceC19741c mAdsScheduleListener = null;
    private Intent mAdsAdtima = null;
    private C17720c mAdsAdtimaData = null;
    private ZAdsPartnerInterstitialAbstract mAdsNetworkView = null;
    private String mAdsLoadTag = null;
    private String mAdsContentId = "";
    private long mScheduleTime = 0;
    private boolean mEnableRetry = false;
    private boolean mIsShowed = false;

    /* renamed from: com.adtima.ads.ZAdsIncentivized$1 */
    /* loaded from: classes2.dex */
    public class C36961 implements InterfaceC19745g {

        /* renamed from: com.adtima.ads.ZAdsIncentivized$1$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsIncentivized.this.mAdsWaitingCount);
                ZAdsIncentivized.access$108(ZAdsIncentivized.this);
                ZAdsIncentivized zAdsIncentivized = ZAdsIncentivized.this;
                zAdsIncentivized.loadAds(zAdsIncentivized.mAdsLoadTag);
            }
        }

        /* renamed from: com.adtima.ads.ZAdsIncentivized$1$2 */
        /* loaded from: classes2.dex */
        class AnonymousClass2 implements Runnable {
            AnonymousClass2() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsIncentivized.this.mAdsReloadCount);
                ZAdsIncentivized.access$208(ZAdsIncentivized.this);
                ZAdsIncentivized zAdsIncentivized = ZAdsIncentivized.this;
                zAdsIncentivized.loadAds(zAdsIncentivized.mAdsLoadTag);
            }
        }

        C36961() {
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFailed(int i11) {
            ZAdsIncentivized zAdsIncentivized;
            Handler handler;
            Runnable anonymousClass2;
            long j11;
            try {
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsIncentivized.this.mQoSEntity, false, false);
                if (i11 == -5) {
                    if (ZAdsIncentivized.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                        handler = new Handler();
                        anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsIncentivized.1.1
                            AnonymousClass1() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsIncentivized.this.mAdsWaitingCount);
                                ZAdsIncentivized.access$108(ZAdsIncentivized.this);
                                ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                                zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                            }
                        };
                        j11 = AbstractC20202f.f99799a;
                        handler.postDelayed(anonymousClass2, j11);
                        return;
                    }
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        zAdsIncentivized = ZAdsIncentivized.this;
                        zAdsIncentivized.mAdsListener.onAdsLoadFailed(i11);
                    }
                    return;
                }
                if (i11 == -1) {
                    if (ZAdsIncentivized.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                        Adtima.reInitSdk(ZAdsIncentivized.this.mAdsContext, AbstractC20202f.f99816i0);
                        handler = new Handler();
                        anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsIncentivized.1.2
                            AnonymousClass2() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsIncentivized.this.mAdsReloadCount);
                                ZAdsIncentivized.access$208(ZAdsIncentivized.this);
                                ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                                zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                            }
                        };
                        j11 = AbstractC20202f.f99803c;
                        handler.postDelayed(anonymousClass2, j11);
                        return;
                    }
                    if (ZAdsIncentivized.this.mAdsListener == null) {
                        return;
                    } else {
                        zAdsIncentivized = ZAdsIncentivized.this;
                    }
                } else if (i11 == -8) {
                    if (ZAdsIncentivized.this.mAdsListener == null) {
                        return;
                    } else {
                        zAdsIncentivized = ZAdsIncentivized.this;
                    }
                } else if (ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(false)) {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "Empty ad or null, try to load next");
                    ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                    zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                    return;
                } else if (ZAdsIncentivized.this.mAdsListener == null) {
                    return;
                } else {
                    zAdsIncentivized = ZAdsIncentivized.this;
                }
                zAdsIncentivized.mAdsListener.onAdsLoadFailed(i11);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onFailed", e11);
            }
        }

        @Override // p196h3.InterfaceC19745g
        public void onAdsLoadFinished(boolean z11) {
            try {
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsIncentivized.this.mQoSEntity, z11, true);
                ZAdsIncentivized.this.mAdsWaitingCount = 0;
                ZAdsIncentivized.this.mAdsReloadCount = 0;
                ZAdsIncentivized.this.scheduleRightNow();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onLoaded", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsIncentivized$2 */
    /* loaded from: classes2.dex */
    public class C36972 extends ZAdsPartnerViewListener {
        C36972() {
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onClicked() {
            super.onClicked();
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onClicked");
                ZAdsIncentivized.this.checkIfHaveClick();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onClicked", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onClosed() {
            super.onClosed();
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onClosed");
                if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mAdsListener.onAdsClosed();
                }
                ZAdsIncentivized.this.mAdsIsLoaded = false;
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onClosed", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onFailed(Object obj, EnumC20200d enumC20200d) {
            super.onFailed(obj, enumC20200d);
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onFailed");
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsIncentivized.this.mQoSEntity, "incvideo", false);
                if (enumC20200d != EnumC20200d.AD_RENDER_ERROR) {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onFailed and call schedule next");
                    ZAdsIncentivized.this.scheduleRightNow();
                } else if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-3);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onFailed", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onInteracted() {
            super.onInteracted();
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onInteracted");
                if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mAdsListener.onAdsInteracted();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onInteracted", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onLoaded(Object obj) {
            super.onLoaded(obj);
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onLoaded");
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsIncentivized.this.mQoSEntity, "incvideo", true);
                ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(true);
                ZAdsIncentivized.this.mAdsIsLoaded = true;
                if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mScheduleTime = System.currentTimeMillis();
                    ZAdsIncentivized.this.mAdsListener.onAdsLoadFinished();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onLoaded", e11);
            }
        }

        @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
        public void onRewarded() {
            super.onRewarded();
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onRewarded");
                if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mAdsListener.onAdsRewarded(ZAdsIncentivized.this.mAdsRewardExtras, ZAdsIncentivized.this.mAdsData.f556j);
                }
                ZAdsIncentivized.this.mAdsIsLoaded = false;
                ZAdsIncentivized.this.checkIfHaveConversion();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onRewarded", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsIncentivized$3 */
    /* loaded from: classes2.dex */
    public class C36983 implements InterfaceC19741c {
        C36983() {
        }

        @Override // p196h3.InterfaceC19741c
        public void onAdtimaVideoRewardShow(C17720c c17720c) {
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow");
                ZAdsIncentivized.this.mAdsNetwork = "adtima";
                boolean z11 = false;
                if (c17720c == null) {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow adtima is null");
                    ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, false);
                    ZAdsIncentivized.this.mAdsIsLoaded = false;
                    ZAdsIncentivized.this.mAdsAdtima = null;
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-3);
                        return;
                    }
                    return;
                }
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, true);
                if (ZAdsIncentivized.this.mQoSEntity != null) {
                    ZAdsIncentivized.this.mQoSEntity.m16369c(c17720c.f89808a.f495a);
                }
                ZAdsIncentivized.this.mAdsAdtimaData = c17720c;
                ZAdsVideoReward.handleAdsListener(ZAdsIncentivized.this.mAdsListener);
                ZAdsVideoReward.handleAdsRewardExtras(ZAdsIncentivized.this.mAdsRewardExtras);
                ZAdsVideoReward.handleVideoProfile(c17720c.f89808a.f494Z);
                ZAdsIncentivized.this.mAdsAdtima = new Intent(ZAdsIncentivized.this.mAdsContext, (Class<?>) ZAdsVideoReward.class);
                ZAdsIncentivized.this.mAdsAdtima.addFlags(268435456);
                ZAdsIncentivized.this.mAdsAdtima.putExtra("adsData", c17720c.m93795a().toString());
                ZAdsIncentivized.this.mAdsAdtima.putExtra("adsContentId", ZAdsIncentivized.this.mAdsContentId);
                ZAdsIncentivized.this.mAdsAdtima.putExtra("adsDismissOnBackground", ZAdsIncentivized.this.mAdsDismissOnBackground);
                ZAdsIncentivized.this.mAdsAdtima.putExtra("adsSoundOnPrefer", !c17720c.f89808a.f500c0 && ZAdsIncentivized.this.mAdsVideoSoundOnPrefer);
                if (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(ZAdsIncentivized.this.mAdsContext)) {
                    Intent intent = ZAdsIncentivized.this.mAdsAdtima;
                    if (c17720c.f89808a.f502d0 && ZAdsIncentivized.this.mAdsVideoAutoPlayPrefer) {
                        z11 = true;
                    }
                    intent.putExtra("adsAutoPlayPrefer", z11);
                } else {
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsAutoPlayPrefer", false);
                }
                ZAdsIncentivized.this.mAdsAdtima.putExtra("adsOrientationPrefer", ZAdsIncentivized.this.mAdsOrientationPrefer);
                ZAdsIncentivized.this.checkIfHaveRequest();
                ZAdsIncentivized.this.mAdsIsLoaded = true;
                if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mScheduleTime = System.currentTimeMillis();
                    ZAdsIncentivized.this.mAdsListener.onAdsLoadFinished();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow", e11);
            }
        }

        @Override // p196h3.InterfaceC19741c
        public void onEmptyAdsToShow() {
            try {
                Adtima.m18326d(ZAdsIncentivized.TAG, "onEmptyAdsToShow");
                ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, false);
                if (ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(false)) {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "Empty ad or null, try to load next");
                    ZAdsIncentivized zAdsIncentivized = ZAdsIncentivized.this;
                    zAdsIncentivized.loadAds(zAdsIncentivized.mAdsLoadTag);
                } else if (ZAdsIncentivized.this.mAdsListener != null) {
                    ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-4);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onAdtimaEmptyAdsToShow", e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[ADDED_TO_REGION] */
        @Override // p196h3.InterfaceC19741c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNetworkVideoRewardShow(C0099d c0099d) {
            String str;
            char c11;
            try {
                if (ZAdsIncentivized.this.mQoSEntity != null) {
                    ZAdsIncentivized.this.mQoSEntity.m16375i(System.currentTimeMillis());
                    if (c0099d != null) {
                        ZAdsIncentivized.this.mQoSEntity.m16373g(c0099d.f553g);
                        ZAdsIncentivized.this.mQoSEntity.m16369c(c0099d.f547a);
                    }
                    ZAdsIncentivized.this.mQoSEntity.m16379m(System.currentTimeMillis());
                }
                if (c0099d != null && (str = c0099d.f550d) != null && str.length() != 0) {
                    ZAdsIncentivized.this.mAdsData = c0099d;
                    ZAdsIncentivized.this.mAdsNetwork = c0099d.f548b;
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow: " + ZAdsIncentivized.this.mAdsNetwork);
                    String str2 = ZAdsIncentivized.this.mAdsNetwork;
                    int hashCode = str2.hashCode();
                    if (hashCode == 99374) {
                        if (str2.equals("dfp")) {
                            c11 = 1;
                            if (c11 != 0) {
                            }
                            ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                            ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                            ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                            ZAdsIncentivized.this.checkIfHaveRequest();
                            return;
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                        ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                        ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                        ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                        ZAdsIncentivized.this.checkIfHaveRequest();
                        return;
                    }
                    if (hashCode == 92668925 && str2.equals("admob")) {
                        c11 = 0;
                        if (c11 != 0 || c11 == 1) {
                            ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                        } else if (ZAdsIncentivized.this.mAdsLoadListener != null) {
                            ZAdsIncentivized.this.mAdsLoadListener.onAdsLoadFailed(-2);
                        }
                        ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                        ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                        ZAdsIncentivized.this.checkIfHaveRequest();
                        return;
                    }
                    c11 = 65535;
                    if (c11 != 0) {
                    }
                    ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                    ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                    ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                    ZAdsIncentivized.this.checkIfHaveRequest();
                    return;
                }
                Adtima.m18326d(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow network is null");
                if (ZAdsIncentivized.this.mAdsLoadListener != null) {
                    ZAdsIncentivized.this.mAdsLoadListener.onAdsLoadFailed(-3);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsIncentivized$4 */
    /* loaded from: classes2.dex */
    public class RunnableC36994 implements Runnable {
        RunnableC36994() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C20217u.m105538N0().m105591R(ZAdsIncentivized.this.mAdsZoneId, ZAdsIncentivized.this.mAdsLoadTag, ZAdsIncentivized.this.mAdsContentId, ZAdsIncentivized.this.mAdsScheduleListener);
            } catch (Exception e11) {
                Adtima.m18327d(ZAdsIncentivized.TAG, "scheduleNextTime", e11);
            }
        }
    }

    public ZAdsIncentivized(Context context, String str) {
        this.mAdsZoneId = str;
        this.mAdsContext = context;
        setupData();
    }

    static /* synthetic */ int access$108(ZAdsIncentivized zAdsIncentivized) {
        int i11 = zAdsIncentivized.mAdsWaitingCount;
        zAdsIncentivized.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$208(ZAdsIncentivized zAdsIncentivized) {
        int i11 = zAdsIncentivized.mAdsReloadCount;
        zAdsIncentivized.mAdsReloadCount = i11 + 1;
        return i11;
    }

    private void checkIfHaveActiveView() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105609q(2, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
        }
    }

    public void checkIfHaveClick() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105609q(4, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveClick", e11);
        }
    }

    public void checkIfHaveConversion() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105609q(3, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveClick", e11);
        }
    }

    private void checkIfHaveImpression() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105587P("incentivized", this.mAdsZoneId, this.mAdsLoadTag);
                C20217u.m105538N0().m105609q(1, this.mAdsData, this.mAdsContentId);
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
            if (this.mAdsData != null) {
                Adtima.m18328e(TAG, "checkIfHaveTrueImpression - network");
                C20217u.m105538N0().m105609q(8, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
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

    private void cleanUpAdsIncentivized() {
        try {
            this.mAdsListener = null;
            if (!this.mIsShowed && this.mQoSEntity != null) {
                this.mQoSEntity = C20212p.m105468m().m105471b(this.mQoSEntity, "incvideo", false);
            }
            if (this.mAdsAdtima != null) {
                this.mAdsAdtima = null;
            }
            if (this.mAdsNetworkView != null) {
                this.mAdsNetworkView = null;
            }
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
            this.mAdsContext = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanUpAdsInterstitial", e11);
        }
    }

    public void scheduleRightNow() {
        try {
            Handler handler = this.mAdsHandler;
            if (handler == null) {
                this.mAdsHandler = new Handler();
            } else {
                handler.removeCallbacks(this.mAdsRunnable);
            }
            this.mAdsHandler.post(this.mAdsRunnable);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleRightNow", e11);
        }
    }

    private void setupData() {
        this.mAdsPartnerListener = new ZAdsPartnerViewListener() { // from class: com.adtima.ads.ZAdsIncentivized.2
            C36972() {
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClicked() {
                super.onClicked();
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onClicked");
                    ZAdsIncentivized.this.checkIfHaveClick();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onClicked", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClosed() {
                super.onClosed();
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onClosed");
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsClosed();
                    }
                    ZAdsIncentivized.this.mAdsIsLoaded = false;
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onClosed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onFailed(Object obj, EnumC20200d enumC20200d) {
                super.onFailed(obj, enumC20200d);
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onFailed");
                    ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsIncentivized.this.mQoSEntity, "incvideo", false);
                    if (enumC20200d != EnumC20200d.AD_RENDER_ERROR) {
                        Adtima.m18326d(ZAdsIncentivized.TAG, "onFailed and call schedule next");
                        ZAdsIncentivized.this.scheduleRightNow();
                    } else if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-3);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onFailed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onInteracted() {
                super.onInteracted();
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onInteracted");
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsInteracted();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onInteracted", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onLoaded(Object obj) {
                super.onLoaded(obj);
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onLoaded");
                    ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsIncentivized.this.mQoSEntity, "incvideo", true);
                    ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(true);
                    ZAdsIncentivized.this.mAdsIsLoaded = true;
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mScheduleTime = System.currentTimeMillis();
                        ZAdsIncentivized.this.mAdsListener.onAdsLoadFinished();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onLoaded", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onRewarded() {
                super.onRewarded();
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onRewarded");
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsRewarded(ZAdsIncentivized.this.mAdsRewardExtras, ZAdsIncentivized.this.mAdsData.f556j);
                    }
                    ZAdsIncentivized.this.mAdsIsLoaded = false;
                    ZAdsIncentivized.this.checkIfHaveConversion();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onRewarded", e11);
                }
            }
        };
        this.mAdsScheduleListener = new InterfaceC19741c() { // from class: com.adtima.ads.ZAdsIncentivized.3
            C36983() {
            }

            @Override // p196h3.InterfaceC19741c
            public void onAdtimaVideoRewardShow(C17720c c17720c) {
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow");
                    ZAdsIncentivized.this.mAdsNetwork = "adtima";
                    boolean z11 = false;
                    if (c17720c == null) {
                        Adtima.m18326d(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow adtima is null");
                        ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, false);
                        ZAdsIncentivized.this.mAdsIsLoaded = false;
                        ZAdsIncentivized.this.mAdsAdtima = null;
                        if (ZAdsIncentivized.this.mAdsListener != null) {
                            ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-3);
                            return;
                        }
                        return;
                    }
                    ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, true);
                    if (ZAdsIncentivized.this.mQoSEntity != null) {
                        ZAdsIncentivized.this.mQoSEntity.m16369c(c17720c.f89808a.f495a);
                    }
                    ZAdsIncentivized.this.mAdsAdtimaData = c17720c;
                    ZAdsVideoReward.handleAdsListener(ZAdsIncentivized.this.mAdsListener);
                    ZAdsVideoReward.handleAdsRewardExtras(ZAdsIncentivized.this.mAdsRewardExtras);
                    ZAdsVideoReward.handleVideoProfile(c17720c.f89808a.f494Z);
                    ZAdsIncentivized.this.mAdsAdtima = new Intent(ZAdsIncentivized.this.mAdsContext, (Class<?>) ZAdsVideoReward.class);
                    ZAdsIncentivized.this.mAdsAdtima.addFlags(268435456);
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsData", c17720c.m93795a().toString());
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsContentId", ZAdsIncentivized.this.mAdsContentId);
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsDismissOnBackground", ZAdsIncentivized.this.mAdsDismissOnBackground);
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsSoundOnPrefer", !c17720c.f89808a.f500c0 && ZAdsIncentivized.this.mAdsVideoSoundOnPrefer);
                    if (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(ZAdsIncentivized.this.mAdsContext)) {
                        Intent intent = ZAdsIncentivized.this.mAdsAdtima;
                        if (c17720c.f89808a.f502d0 && ZAdsIncentivized.this.mAdsVideoAutoPlayPrefer) {
                            z11 = true;
                        }
                        intent.putExtra("adsAutoPlayPrefer", z11);
                    } else {
                        ZAdsIncentivized.this.mAdsAdtima.putExtra("adsAutoPlayPrefer", false);
                    }
                    ZAdsIncentivized.this.mAdsAdtima.putExtra("adsOrientationPrefer", ZAdsIncentivized.this.mAdsOrientationPrefer);
                    ZAdsIncentivized.this.checkIfHaveRequest();
                    ZAdsIncentivized.this.mAdsIsLoaded = true;
                    if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mScheduleTime = System.currentTimeMillis();
                        ZAdsIncentivized.this.mAdsListener.onAdsLoadFinished();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onAdtimaVideoRewardShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19741c
            public void onEmptyAdsToShow() {
                try {
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onEmptyAdsToShow");
                    ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsIncentivized.this.mQoSEntity, false);
                    if (ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(false)) {
                        Adtima.m18326d(ZAdsIncentivized.TAG, "Empty ad or null, try to load next");
                        ZAdsIncentivized zAdsIncentivized = ZAdsIncentivized.this;
                        zAdsIncentivized.loadAds(zAdsIncentivized.mAdsLoadTag);
                    } else if (ZAdsIncentivized.this.mAdsListener != null) {
                        ZAdsIncentivized.this.mAdsListener.onAdsLoadFailed(-4);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onAdtimaEmptyAdsToShow", e11);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[ADDED_TO_REGION] */
            @Override // p196h3.InterfaceC19741c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onNetworkVideoRewardShow(C0099d c0099d) {
                String str;
                char c11;
                try {
                    if (ZAdsIncentivized.this.mQoSEntity != null) {
                        ZAdsIncentivized.this.mQoSEntity.m16375i(System.currentTimeMillis());
                        if (c0099d != null) {
                            ZAdsIncentivized.this.mQoSEntity.m16373g(c0099d.f553g);
                            ZAdsIncentivized.this.mQoSEntity.m16369c(c0099d.f547a);
                        }
                        ZAdsIncentivized.this.mQoSEntity.m16379m(System.currentTimeMillis());
                    }
                    if (c0099d != null && (str = c0099d.f550d) != null && str.length() != 0) {
                        ZAdsIncentivized.this.mAdsData = c0099d;
                        ZAdsIncentivized.this.mAdsNetwork = c0099d.f548b;
                        Adtima.m18326d(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow: " + ZAdsIncentivized.this.mAdsNetwork);
                        String str2 = ZAdsIncentivized.this.mAdsNetwork;
                        int hashCode = str2.hashCode();
                        if (hashCode == 99374) {
                            if (str2.equals("dfp")) {
                                c11 = 1;
                                if (c11 != 0) {
                                }
                                ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                                ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                                ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                                ZAdsIncentivized.this.checkIfHaveRequest();
                                return;
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                            ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                            ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                            ZAdsIncentivized.this.checkIfHaveRequest();
                            return;
                        }
                        if (hashCode == 92668925 && str2.equals("admob")) {
                            c11 = 0;
                            if (c11 != 0 || c11 == 1) {
                                ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                            } else if (ZAdsIncentivized.this.mAdsLoadListener != null) {
                                ZAdsIncentivized.this.mAdsLoadListener.onAdsLoadFailed(-2);
                            }
                            ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                            ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                            ZAdsIncentivized.this.checkIfHaveRequest();
                            return;
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                        ZAdsIncentivized.this.mAdsNetworkView = new ZAdsGoogleRewardedVideo(ZAdsIncentivized.this.mAdsContext, ZAdsIncentivized.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsIncentivized.this.mAdsContentUrl, ZAdsIncentivized.this.mAdsTargetingData);
                        ZAdsIncentivized.this.mAdsNetworkView.setAdsPartnerListener(ZAdsIncentivized.this.mAdsPartnerListener);
                        ZAdsIncentivized.this.mAdsNetworkView.loadAdsPartner();
                        ZAdsIncentivized.this.checkIfHaveRequest();
                        return;
                    }
                    Adtima.m18326d(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow network is null");
                    if (ZAdsIncentivized.this.mAdsLoadListener != null) {
                        ZAdsIncentivized.this.mAdsLoadListener.onAdsLoadFailed(-3);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsIncentivized.TAG, "onNetworkVideoRewardShow", e11);
                }
            }
        };
        this.mAdsHandler = new Handler();
        this.mAdsRunnable = new Runnable() { // from class: com.adtima.ads.ZAdsIncentivized.4
            RunnableC36994() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C20217u.m105538N0().m105591R(ZAdsIncentivized.this.mAdsZoneId, ZAdsIncentivized.this.mAdsLoadTag, ZAdsIncentivized.this.mAdsContentId, ZAdsIncentivized.this.mAdsScheduleListener);
                } catch (Exception e11) {
                    Adtima.m18327d(ZAdsIncentivized.TAG, "scheduleNextTime", e11);
                }
            }
        };
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

    public synchronized void checkIfHaveRequest() {
        try {
            try {
                if (this.mAdsNetwork.equals("adtima") && this.mAdsAdtimaData != null) {
                    C20217u.m105538N0().m105608p(0, this.mAdsAdtimaData.f89808a, this.mAdsContentId);
                } else if (this.mAdsData != null) {
                    C20217u.m105538N0().m105609q(0, this.mAdsData, this.mAdsContentId);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveRequest", e11);
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
            cleanUpAdsIncentivized();
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
        C17720c c17720c;
        try {
        } catch (Exception unused) {
            str = null;
        }
        if (!this.mAdsNetwork.equals("adtima") || (c17720c = this.mAdsAdtimaData) == null) {
            C0099d c0099d = this.mAdsData;
            if (c0099d != null) {
                str = c0099d.f547a;
            }
            str = null;
        } else {
            str = c17720c.f89808a.f495a;
        }
        return str;
    }

    public String getAdsMetaData() {
        try {
            C0099d c0099d = this.mAdsData;
            if (c0099d != null) {
                return c0099d.f555i;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public Object getAdsRewardExtras() {
        return this.mAdsRewardExtras;
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

    public boolean isAdsDismissOnBackground() {
        return this.mAdsDismissOnBackground;
    }

    public boolean isAdsLoaded() {
        return this.mAdsIsLoaded && isAdsValid();
    }

    public boolean isAdsValid() {
        try {
            return System.currentTimeMillis() - this.mScheduleTime < AbstractC20202f.f99812g0;
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
            ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract = this.mAdsNetworkView;
            if (zAdsPartnerInterstitialAbstract != null) {
                zAdsPartnerInterstitialAbstract.destroyAdsPartner();
            }
            cleanUpAdsIncentivized();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onDestroy", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onPause() {
        Adtima.m18326d(TAG, "onPause");
        try {
            ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract = this.mAdsNetworkView;
            if (zAdsPartnerInterstitialAbstract != null) {
                zAdsPartnerInterstitialAbstract.pauseAdsPartner();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onPause", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onResume() {
        Adtima.m18326d(TAG, "onResume");
        try {
            ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract = this.mAdsNetworkView;
            if (zAdsPartnerInterstitialAbstract != null) {
                zAdsPartnerInterstitialAbstract.resumeAdsPartner();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onResume", e11);
        }
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
            Adtima.m18329e(TAG, "onStop", e11);
        }
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

    public void setAdsDimissOnBackground(boolean z11) {
        this.mAdsDismissOnBackground = z11;
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

    public void setAdsRewardExtras(Object obj) {
        this.mAdsRewardExtras = obj;
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
        String str;
        Intent intent;
        Adtima.m18326d(TAG, "show");
        try {
            if (this.mAdsIsLoaded && (str = this.mAdsNetwork) != null) {
                this.mIsShowed = true;
                if (!str.equals("adtima") || (intent = this.mAdsAdtima) == null) {
                    ZAdsPartnerInterstitialAbstract zAdsPartnerInterstitialAbstract = this.mAdsNetworkView;
                    if (zAdsPartnerInterstitialAbstract != null && zAdsPartnerInterstitialAbstract.isAdsPartnerLoaded()) {
                        checkIfHaveImpression();
                        checkIfHaveTrueImpression();
                        checkIfHaveActiveView();
                        this.mAdsNetworkView.showAdsPartner();
                    }
                } else {
                    intent.putExtra("adsContentId", this.mAdsContentId);
                    this.mAdsContext.startActivity(this.mAdsAdtima);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "show", e11);
        }
    }

    public void loadAds(String str) {
        try {
            this.mAdsLoadTag = str;
            this.mQoSEntity = new C3228a();
            this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsIncentivized.1

                /* renamed from: com.adtima.ads.ZAdsIncentivized$1$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsIncentivized.this.mAdsWaitingCount);
                        ZAdsIncentivized.access$108(ZAdsIncentivized.this);
                        ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                        zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                    }
                }

                /* renamed from: com.adtima.ads.ZAdsIncentivized$1$2 */
                /* loaded from: classes2.dex */
                class AnonymousClass2 implements Runnable {
                    AnonymousClass2() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsIncentivized.this.mAdsReloadCount);
                        ZAdsIncentivized.access$208(ZAdsIncentivized.this);
                        ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                        zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                    }
                }

                C36961() {
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFailed(int i11) {
                    ZAdsIncentivized zAdsIncentivized;
                    Handler handler;
                    Runnable anonymousClass2;
                    long j11;
                    try {
                        ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsIncentivized.this.mQoSEntity, false, false);
                        if (i11 == -5) {
                            if (ZAdsIncentivized.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                                handler = new Handler();
                                anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsIncentivized.1.1
                                    AnonymousClass1() {
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsIncentivized.this.mAdsWaitingCount);
                                        ZAdsIncentivized.access$108(ZAdsIncentivized.this);
                                        ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                                        zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                                    }
                                };
                                j11 = AbstractC20202f.f99799a;
                                handler.postDelayed(anonymousClass2, j11);
                                return;
                            }
                            if (ZAdsIncentivized.this.mAdsListener != null) {
                                zAdsIncentivized = ZAdsIncentivized.this;
                                zAdsIncentivized.mAdsListener.onAdsLoadFailed(i11);
                            }
                            return;
                        }
                        if (i11 == -1) {
                            if (ZAdsIncentivized.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                                Adtima.reInitSdk(ZAdsIncentivized.this.mAdsContext, AbstractC20202f.f99816i0);
                                handler = new Handler();
                                anonymousClass2 = new Runnable() { // from class: com.adtima.ads.ZAdsIncentivized.1.2
                                    AnonymousClass2() {
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsIncentivized.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsIncentivized.this.mAdsReloadCount);
                                        ZAdsIncentivized.access$208(ZAdsIncentivized.this);
                                        ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                                        zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                                    }
                                };
                                j11 = AbstractC20202f.f99803c;
                                handler.postDelayed(anonymousClass2, j11);
                                return;
                            }
                            if (ZAdsIncentivized.this.mAdsListener == null) {
                                return;
                            } else {
                                zAdsIncentivized = ZAdsIncentivized.this;
                            }
                        } else if (i11 == -8) {
                            if (ZAdsIncentivized.this.mAdsListener == null) {
                                return;
                            } else {
                                zAdsIncentivized = ZAdsIncentivized.this;
                            }
                        } else if (ZAdsIncentivized.this.checkIfNeedRetryOrForceReset(false)) {
                            Adtima.m18326d(ZAdsIncentivized.TAG, "Empty ad or null, try to load next");
                            ZAdsIncentivized zAdsIncentivized2 = ZAdsIncentivized.this;
                            zAdsIncentivized2.loadAds(zAdsIncentivized2.mAdsLoadTag);
                            return;
                        } else if (ZAdsIncentivized.this.mAdsListener == null) {
                            return;
                        } else {
                            zAdsIncentivized = ZAdsIncentivized.this;
                        }
                        zAdsIncentivized.mAdsListener.onAdsLoadFailed(i11);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsIncentivized.TAG, "onFailed", e11);
                    }
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFinished(boolean z11) {
                    try {
                        ZAdsIncentivized.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsIncentivized.this.mQoSEntity, z11, true);
                        ZAdsIncentivized.this.mAdsWaitingCount = 0;
                        ZAdsIncentivized.this.mAdsReloadCount = 0;
                        ZAdsIncentivized.this.scheduleRightNow();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsIncentivized.TAG, "onLoaded", e11);
                    }
                }
            };
            String str2 = this.mAdsZoneId;
            if (str2 == null || str2.length() == 0) {
                Adtima.m18330p(TAG, "Request with empty zone!");
                return;
            }
            C3228a c3228a = this.mQoSEntity;
            if (c3228a != null) {
                c3228a.m16376j(this.mAdsZoneId);
                this.mQoSEntity.m16378l(System.currentTimeMillis());
            }
            C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "incentivized", "incentivized", this.mAdsZoneId, this.mAdsLoadTag, null, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }
}
