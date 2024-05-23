package com.adtima.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsTracking;
import p009a3.C0098c;
import p047c3.C3228a;
import p196h3.InterfaceC19739a;
import p196h3.InterfaceC19745g;
import p227i3.AbstractC20202f;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20221y;
import p309l.C21976d;
import p309l.C21977e;
import p309l.EnumC21975c;
import p313l3.AbstractC22011d;
import p667y2.C30267d;

/* loaded from: classes2.dex */
public class ZAdsAudio {
    private static final String TAG = "ZAdsAudio";
    private Context mAdsContext;
    private C21977e.a mAdsDaastListener;
    private InterfaceC19745g mAdsLoadListener;
    private InterfaceC19739a mAdsScheduleListener;
    private String mAdsZoneId;
    private C3228a mQoSEntity;
    private boolean mAdsIsLoaded = false;
    private boolean mIsAdsClicked = false;
    private boolean mIsVImpWaiting = true;
    public View mAdsRegisterView = null;
    private Bundle mAdsTargetingData = null;
    private int mAdsRetryCount = 0;
    private int mAdsWaitingCount = 0;
    private int mAdsReloadCount = 0;
    private int mAdsCurrentQuartile = 0;
    private C21976d mAdsDaastModel = null;
    private C0098c mAdsData = null;
    private ZAdsListener mAdsListener = null;
    private ZAdsTracking.ZAdsAudioTracking mAdsAudioTracking = null;
    private Handler mAdsHandler = null;
    private Runnable mAdsRunnable = null;
    private String mAdsLoadTag = null;
    private String mAdsContentId = "";
    private boolean mIsAdBackup = false;
    private boolean mEnableRetry = false;

    public ZAdsAudio(Context context, String str) {
        this.mAdsDaastListener = null;
        this.mAdsLoadListener = null;
        this.mAdsScheduleListener = null;
        this.mAdsZoneId = str;
        this.mAdsContext = context;
        this.mAdsScheduleListener = new InterfaceC19739a() { // from class: com.adtima.ads.ZAdsAudio.1
            @Override // p196h3.InterfaceC19739a
            public void onAdtimaAudioShow(C0098c c0098c) {
                Adtima.m18326d(ZAdsAudio.TAG, "onAdtimaAudioShow");
                if (ZAdsAudio.this.mQoSEntity != null) {
                    ZAdsAudio.this.mQoSEntity.m16369c(c0098c.f495a);
                    ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsAudio.this.mQoSEntity, true);
                }
                try {
                    ZAdsAudio.this.mAdsData = c0098c;
                    ZAdsAudio.this.mIsAdBackup = c0098c.f467A0;
                    C21977e.m114777b().m114779c(c0098c.f496a0, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat), ZAdsAudio.this.mAdsDaastListener);
                    ZAdsAudio.this.checkIfHaveRequest();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onAdtimaVideoShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19739a
            public void onEmptyAdsToShow() {
                Adtima.m18326d(ZAdsAudio.TAG, "onEmptyAdsToShow");
                ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsAudio.this.mQoSEntity, false);
                try {
                    if (ZAdsAudio.this.checkIfNeedRetryOrForceReset(false)) {
                        ZAdsAudio.this.loadAds();
                        return;
                    }
                    if (ZAdsAudio.this.mAdsListener != null) {
                        ZAdsAudio.this.mAdsListener.onAdsLoadFailed(-2);
                    }
                    ZAdsAudio.this.cleanAdsData();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onEmptyAdsToShow", e11);
                }
            }
        };
        this.mAdsDaastListener = new C21977e.a() { // from class: com.adtima.ads.ZAdsAudio.2
            @Override // p309l.C21977e.a
            public void onCompleted(C21976d c21976d) {
                Adtima.m18326d(ZAdsAudio.TAG, "onCompleted");
                try {
                    ZAdsAudio.this.mAdsDaastModel = c21976d;
                    if (ZAdsAudio.this.mAdsDaastModel != null && ZAdsAudio.this.mAdsDaastModel.m114776z()) {
                        ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsAudio.this.mQoSEntity, "audio", true);
                        ZAdsAudio.this.checkIfNeedRetryOrForceReset(true);
                        ZAdsAudio.this.mAdsIsLoaded = true;
                        ZAdsAudio zAdsAudio = ZAdsAudio.this;
                        zAdsAudio.mAdsAudioTracking = ZAdsTracking.ZAdsAudioTracking.createInstance(zAdsAudio.mAdsDaastModel, ZAdsAudio.this.mIsAdBackup);
                        if (ZAdsAudio.this.mAdsListener != null) {
                            ZAdsAudio.this.mAdsListener.onAdsLoadFinished();
                        }
                    }
                    Adtima.m18326d(ZAdsAudio.TAG, "onDaastLoadFinished but invalid, call schedule next");
                    ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsAudio.this.mQoSEntity, "audio", false);
                    ZAdsAudio.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onCompleted", e11);
                }
            }

            @Override // p309l.C21977e.a
            public void onError(int i11) {
                Adtima.m18326d(ZAdsAudio.TAG, "onError");
                try {
                    Adtima.m18326d(ZAdsAudio.TAG, "onError and call schedule next");
                    ZAdsAudio.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onError", e11);
                }
            }
        };
        this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsAudio.3
            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFailed(int i11) {
                Handler handler;
                Runnable runnable;
                long j11;
                try {
                    ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsAudio.this.mQoSEntity, false, false);
                    if (i11 == -5) {
                        if (ZAdsAudio.this.mAdsWaitingCount >= AbstractC20202f.f99801b) {
                            if (ZAdsAudio.this.mAdsListener != null) {
                                Adtima.m18328e(ZAdsAudio.TAG, "Can not init Adtima SDK");
                                ZAdsAudio.this.mAdsListener.onAdsLoadFailed(i11);
                            } else {
                                Adtima.m18328e(ZAdsAudio.TAG, "Init Adtima SDK fail, listener null");
                            }
                            ZAdsAudio.this.cleanAdsData();
                        }
                        ZAdsAudio.this.initHandler();
                        ZAdsAudio.this.mAdsRunnable = new Runnable() { // from class: com.adtima.ads.ZAdsAudio.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    Adtima.m18328e(ZAdsAudio.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsAudio.this.mAdsWaitingCount);
                                    ZAdsAudio.access$1308(ZAdsAudio.this);
                                    ZAdsAudio.this.loadAds();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        if (ZAdsAudio.this.mAdsHandler != null) {
                            handler = ZAdsAudio.this.mAdsHandler;
                            runnable = ZAdsAudio.this.mAdsRunnable;
                            j11 = AbstractC20202f.f99799a;
                            handler.postDelayed(runnable, j11);
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        if (ZAdsAudio.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                            Adtima.reInitSdk(ZAdsAudio.this.mAdsContext, AbstractC20202f.f99816i0);
                            ZAdsAudio.this.initHandler();
                            ZAdsAudio.this.mAdsRunnable = new Runnable() { // from class: com.adtima.ads.ZAdsAudio.3.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        Adtima.m18328e(ZAdsAudio.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsAudio.this.mAdsReloadCount);
                                        ZAdsAudio.access$1408(ZAdsAudio.this);
                                        ZAdsAudio.this.loadAds();
                                    } catch (Exception unused) {
                                    }
                                }
                            };
                            if (ZAdsAudio.this.mAdsHandler != null) {
                                handler = ZAdsAudio.this.mAdsHandler;
                                runnable = ZAdsAudio.this.mAdsRunnable;
                                j11 = AbstractC20202f.f99803c;
                                handler.postDelayed(runnable, j11);
                                return;
                            }
                            return;
                        }
                        if (ZAdsAudio.this.mAdsListener != null) {
                            ZAdsAudio.this.mAdsListener.onAdsLoadFailed(i11);
                        }
                    } else if (i11 == -8) {
                        if (ZAdsAudio.this.mAdsListener != null) {
                            ZAdsAudio.this.mAdsListener.onAdsLoadFailed(i11);
                        }
                    } else if (ZAdsAudio.this.checkIfNeedRetryOrForceReset(false)) {
                        Adtima.m18326d(ZAdsAudio.TAG, "Empty ad or null, try to load next");
                        ZAdsAudio.this.loadAds();
                        return;
                    } else if (ZAdsAudio.this.mAdsListener != null) {
                        ZAdsAudio.this.mAdsListener.onAdsLoadFailed(i11);
                    }
                    ZAdsAudio.this.cleanAdsData();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onFailed", e11);
                }
            }

            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFinished(boolean z11) {
                try {
                    ZAdsAudio.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsAudio.this.mQoSEntity, z11, true);
                    ZAdsAudio.this.mAdsWaitingCount = 0;
                    ZAdsAudio.this.mAdsReloadCount = 0;
                    ZAdsAudio.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsAudio.TAG, "onLoaded", e11);
                }
            }
        };
    }

    static /* synthetic */ int access$1308(ZAdsAudio zAdsAudio) {
        int i11 = zAdsAudio.mAdsWaitingCount;
        zAdsAudio.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$1408(ZAdsAudio zAdsAudio) {
        int i11 = zAdsAudio.mAdsReloadCount;
        zAdsAudio.mAdsReloadCount = i11 + 1;
        return i11;
    }

    private void cancelHandler() {
        Runnable runnable;
        try {
            Handler handler = this.mAdsHandler;
            if (handler != null && (runnable = this.mAdsRunnable) != null) {
                handler.removeCallbacks(runnable);
            }
            this.mAdsHandler = null;
            this.mAdsRunnable = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cancelHandler", e11);
        }
    }

    private synchronized void checkIfHaveInventory() {
        try {
            C20217u.m105538N0().m105595W(this.mAdsZoneId, this.mAdsIsLoaded);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveInventory", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveRequest() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105608p(0, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveRequest", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    private boolean checkIfRightAds(String str) {
        C21976d c21976d;
        String m117382g;
        if (str != null) {
            try {
                if (str.length() != 0 && (c21976d = this.mAdsDaastModel) != null && (m117382g = c21976d.m114772v().m117382g()) != null && m117382g.length() != 0) {
                    if (str.equals(m117382g)) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfRightAds", e11);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanAdsData() {
        try {
            this.mAdsCurrentQuartile = 0;
            this.mAdsIsLoaded = false;
            this.mAdsData = null;
            this.mAdsDaastModel = null;
            this.mAdsListener = null;
            this.mAdsContentId = "";
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanAdsData", e11);
        }
    }

    private void clearHandler() {
        try {
            this.mAdsListener = null;
            this.mAdsContext = null;
            this.mAdsScheduleListener = null;
            this.mAdsTargetingData = null;
            this.mAdsDaastListener = null;
            cancelHandler();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "clearHandler", e11);
        }
    }

    private void doAdsQuartile(int i11) {
        Adtima.m18326d(TAG, "doAdsQuartile: " + i11);
        int i12 = this.mAdsCurrentQuartile;
        EnumC21975c enumC21975c = null;
        if (i11 >= i12 * 25) {
            if (i12 == 1) {
                enumC21975c = EnumC21975c.firstQuartile;
            } else if (i12 == 2) {
                enumC21975c = EnumC21975c.midpoint;
            } else if (i12 == 3) {
                enumC21975c = EnumC21975c.thirdQuartile;
            }
            this.mAdsCurrentQuartile = i12 + 1;
        }
        if (enumC21975c != null) {
            this.mAdsAudioTracking.doAdsEvent(enumC21975c, this.mAdsContentId);
            if (enumC21975c == EnumC21975c.firstQuartile) {
                doAdsViewableImpression();
            }
        }
    }

    private void doAdsViewableImpression() {
        try {
            if (this.mAdsData == null || !this.mIsVImpWaiting) {
                return;
            }
            this.mIsVImpWaiting = false;
            C20217u.m105538N0().m105608p(8, this.mAdsData, this.mAdsContentId);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsViewableImpression", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initHandler() {
        try {
            if (this.mAdsHandler != null) {
                cancelHandler();
            }
            this.mAdsHandler = new Handler();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initHandler", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRightNow() {
        try {
            initHandler();
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.ZAdsAudio.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C20217u.m105538N0().m105589Q(ZAdsAudio.this.mAdsZoneId, ZAdsAudio.this.mAdsLoadTag, ZAdsAudio.this.mAdsContentId, ZAdsAudio.this.mAdsScheduleListener);
                    } catch (Exception e11) {
                        Adtima.m18327d(ZAdsAudio.TAG, "ZAdsVideo", e11);
                    }
                }
            };
            this.mAdsRunnable = runnable;
            Handler handler = this.mAdsHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleRightNow", e11);
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

    public void dismissAds() {
        Adtima.m18326d(TAG, "doAdsDismiss");
        try {
            cleanAdsData();
            clearHandler();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsDismiss", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x0007, B:8:0x000e, B:10:0x0012, B:12:0x001b, B:14:0x0021, B:16:0x0025, B:19:0x003b, B:21:0x0049, B:25:0x0032), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doAdsClick(String str) {
        Handler handler;
        Adtima.m18326d(TAG, "doAdsClicked");
        try {
            if (!checkIfRightAds(str) || this.mIsAdsClicked) {
                return;
            }
            this.mIsAdsClicked = true;
            String str2 = this.mAdsData.f512i0;
            if (str2 != null) {
                if (str2.length() != 0) {
                    ZAdsListener zAdsListener = this.mAdsListener;
                    if (zAdsListener != null) {
                        if (!zAdsListener.onAdsContentHandler(this.mAdsData.f512i0)) {
                        }
                        this.mAdsAudioTracking.doAdsClickTrack(this.mAdsContentId);
                        initHandler();
                        handler = this.mAdsHandler;
                        if (handler == null) {
                            handler.postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsAudio.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    ZAdsAudio.this.mIsAdsClicked = false;
                                }
                            }, 1500L);
                            return;
                        }
                        return;
                    }
                }
            }
            this.mAdsAudioTracking.doAdsTarget(this.mAdsData, this.mAdsContentId);
            this.mAdsAudioTracking.doAdsClickTrack(this.mAdsContentId);
            initHandler();
            handler = this.mAdsHandler;
            if (handler == null) {
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsclicked", e11);
        }
    }

    public void doAdsClickTrack(String str) {
        Adtima.m18326d(TAG, "doAdsClickTrack");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsClickTrack(this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsComplete", e11);
        }
    }

    public void doAdsClose(String str) {
        Adtima.m18326d(TAG, "doAdsComplete");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.close, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsComplete", e11);
        }
    }

    public void doAdsComplete(String str) {
        Adtima.m18326d(TAG, "doAdsComplete");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.complete, this.mAdsContentId);
                this.mAdsAudioTracking.cleanUpEvent();
                this.mAdsCurrentQuartile = 0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsComplete", e11);
        }
    }

    public void doAdsDisplay(String str) {
        Adtima.m18326d(TAG, "doAdsDisplay");
        try {
            if (checkIfRightAds(str)) {
                C20217u.m105538N0().m105587P("native", this.mAdsZoneId, this.mAdsLoadTag);
                this.mAdsAudioTracking.doAdsImpression(this.mAdsContentId);
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.creativeView, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsDisplay", e11);
        }
    }

    public void doAdsMute(String str) {
        Adtima.m18326d(TAG, "doAdsMute");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.mute, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsMute", e11);
        }
    }

    public void doAdsPause(String str) {
        Adtima.m18326d(TAG, "doAdsPause");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.pause, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsPause", e11);
        }
    }

    public void doAdsProgressByPercent(String str, int i11) {
        Adtima.m18326d(TAG, "doAdsProgressByPercent");
        try {
            if (checkIfRightAds(str) && getAdsMediaDuration() > 0) {
                this.mAdsAudioTracking.doAdsProgress((getAdsMediaDuration() * i11) / 100, this.mAdsContentId);
                doAdsQuartile(i11);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsProgressByPercent", e11);
        }
    }

    public void doAdsProgressByTime(String str, int i11) {
        Adtima.m18326d(TAG, "doAdsProgressByTime");
        try {
            if (checkIfRightAds(str) && getAdsMediaDuration() > 0) {
                this.mAdsAudioTracking.doAdsProgress(i11, this.mAdsContentId);
                doAdsQuartile((i11 * 100) / getAdsMediaDuration());
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsProgressByTime", e11);
        }
    }

    public void doAdsResume(String str) {
        Adtima.m18326d(TAG, "doAdsStop");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.resume, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsStop", e11);
        }
    }

    public void doAdsSkip(String str) {
        Adtima.m18326d(TAG, "doAdsclicked");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.skip, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsSkip", e11);
        }
    }

    public void doAdsStart(String str) {
        Adtima.m18326d(TAG, "doAdsStart");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.start, this.mAdsContentId);
                doAdsViewableImpression();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsStart", e11);
        }
    }

    public void doAdsUnmute(String str) {
        Adtima.m18326d(TAG, "doAdsUnmute");
        try {
            if (checkIfRightAds(str)) {
                this.mAdsAudioTracking.doAdsEvent(EnumC21975c.unmute, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsUnmute", e11);
        }
    }

    public String getAdsAction() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f503e;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getAdsContentId() {
        try {
            return this.mAdsContentId;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAdsContentUrl() {
        try {
            Bundle bundle = this.mAdsTargetingData;
            if (bundle != null) {
                return bundle.getString("content_url");
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004f -> B:9:0x0050). Please report as a decompilation issue!!! */
    public String getAdsDescription() {
        String str;
        C0098c c0098c;
        try {
            c0098c = this.mAdsData;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsDesc", e11);
        }
        if (c0098c != null) {
            String str2 = c0098c.f535u;
            if (str2 == null || str2.length() == 0) {
                String str3 = this.mAdsData.f501d;
                if (str3 == null || str3.length() == 0) {
                    String str4 = this.mAdsData.f527q;
                    if (str4 == null || str4.length() == 0) {
                        String str5 = this.mAdsData.f533t;
                        if (str5 != null && str5.length() != 0) {
                            str = this.mAdsData.f533t;
                        }
                    } else {
                        str = this.mAdsData.f527q;
                    }
                } else {
                    str = this.mAdsData.f501d;
                }
            } else {
                str = this.mAdsData.f535u;
            }
            return str;
        }
        str = null;
        return str;
    }

    public String getAdsId() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f495a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getAdsLandscapeCoverUrl() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f519m;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsLandscapeCoverUrl", e11);
        }
        return null;
    }

    public String getAdsLogoUrl() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f515k;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsLogoUrl", e11);
        }
        return null;
    }

    public int getAdsMediaDuration() {
        try {
            C21976d c21976d = this.mAdsDaastModel;
            if (c21976d != null) {
                return AbstractC22011d.m114901b(c21976d.m114765o());
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsMediaUrl", e11);
        }
        return 0;
    }

    public String getAdsMediaUrl() {
        try {
            C21976d c21976d = this.mAdsDaastModel;
            if (c21976d != null) {
                return c21976d.m114772v().m117382g();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsMediaUrl", e11);
        }
        return null;
    }

    public String getAdsMetaData() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f514j0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getMetaData", e11);
        }
        return null;
    }

    public String getAdsPortraitCoverUrl() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f517l;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsPortraitCoverUrl", e11);
        }
        return null;
    }

    public long getAdsSkipAfter() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f506f0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsSkipAfter", e11);
        }
        return 0L;
    }

    public String getAdsTarget(String str) {
        C21976d c21976d;
        try {
            if (checkIfRightAds(str) && (c21976d = this.mAdsDaastModel) != null && c21976d.m114758h() != null) {
                return this.mAdsDaastModel.m114758h().m117372a();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsTarget", e11);
        }
        return "";
    }

    public Bundle getAdsTargeting() {
        return this.mAdsTargetingData;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x002d -> B:9:0x002e). Please report as a decompilation issue!!! */
    public String getAdsTitle() {
        String str;
        C0098c c0098c;
        try {
            c0098c = this.mAdsData;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsDesc", e11);
        }
        if (c0098c != null) {
            String str2 = c0098c.f499c;
            if (str2 == null || str2.length() == 0) {
                String str3 = this.mAdsData.f529r;
                if (str3 != null && str3.length() != 0) {
                    str = this.mAdsData.f529r;
                }
            } else {
                str = this.mAdsData.f499c;
            }
            return str;
        }
        str = null;
        return str;
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

    public boolean isAdsAllowSkip() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f504e0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "isAdsAllowSkip", e11);
        }
        return false;
    }

    public boolean isAdsAutoPlayPrefer() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f502d0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "isAdsAutoPlayPrefer", e11);
        }
        return false;
    }

    public boolean isAdsClickable() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f522n0;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public boolean isAdsLoaded() {
        return this.mAdsIsLoaded;
    }

    public boolean isAdsSoundOnPrefer() {
        try {
            if (this.mAdsData != null) {
                return !r0.f500c0;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "isAdsSoundOnPrefer", e11);
        }
        return false;
    }

    public void loadAds() {
        loadAds(null);
    }

    public void registerAdsInteraction(View view) {
        try {
            this.mAdsRegisterView = view;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "registerAdsInteraction", e11);
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
            if (this.mAdsTargetingData == null) {
                this.mAdsTargetingData = new Bundle();
            }
            this.mAdsTargetingData.putString("content_url", str);
        } catch (Exception unused) {
        }
    }

    public void setAdsListener(ZAdsListener zAdsListener) {
        this.mAdsListener = zAdsListener;
    }

    public void setAdsTargeting(Bundle bundle) {
        this.mAdsTargetingData = bundle;
    }

    public void loadAds(String str) {
        this.mAdsLoadTag = str;
        this.mQoSEntity = new C3228a();
        try {
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
            C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "native", "native", this.mAdsZoneId, this.mAdsLoadTag, null, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }
}
