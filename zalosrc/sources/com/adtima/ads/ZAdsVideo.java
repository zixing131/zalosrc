package com.adtima.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.adtima.Adtima;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p009a3.C0098c;
import p047c3.C3228a;
import p196h3.InterfaceC19745g;
import p196h3.InterfaceC19746h;
import p227i3.AbstractC20202f;
import p227i3.C20209m;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20221y;
import p250j.C20894a;
import p313l3.AbstractC22011d;
import p350n.C23498d;
import p350n.C23499e;
import p350n.EnumC23496b;
import p667y2.C30267d;

/* loaded from: classes2.dex */
public final class ZAdsVideo {
    private static final String TAG = "ZAdsVideo";
    private Context mAdsContext;
    private InterfaceC19745g mAdsLoadListener;
    private InterfaceC19746h mAdsScheduleListener;
    private C23499e.a mAdsVastListener;
    private String mAdsZoneId;
    private C3228a mQoSEntity;
    public View mAdsRegisterView = null;
    private Bundle mAdsTargetingData = null;
    private int mAdsRetryCount = 0;
    private int mAdsWaitingCount = 0;
    private int mAdsReloadCount = 0;
    private boolean mAdsIsLoaded = false;
    private boolean mIsAdsClicked = false;
    private int mAdsCurrentQuartile = 0;
    private C23498d mAdsVastModel = null;
    private C0098c mAdsData = null;
    private ZAdsListener mAdsListener = null;
    private HashMap<EnumC23496b, List<String>> mAdsTrackingEventMap = null;
    private HashMap<Integer, List<String>> mAdsTrackingProgressMap = null;
    private HashMap<Integer, List<String>> mAdsTrackingProgressMapTemp = null;
    private Handler mAdsHandler = null;
    private Runnable mAdsRunnable = null;
    private String mAdsLoadTag = null;
    private String mAdsContentId = "";
    private boolean mIsAdBackup = false;
    private boolean mEnableRetry = false;
    private C20209m.e mOMSession = null;

    public ZAdsVideo(Context context, String str) {
        this.mAdsVastListener = null;
        this.mAdsLoadListener = null;
        this.mAdsScheduleListener = null;
        this.mAdsZoneId = str;
        this.mAdsContext = context;
        this.mAdsScheduleListener = new InterfaceC19746h() { // from class: com.adtima.ads.ZAdsVideo.1
            @Override // p196h3.InterfaceC19746h
            public void onAdtimaVideoShow(C0098c c0098c) {
                Adtima.m18326d(ZAdsVideo.TAG, "onAdtimaVideoShow");
                try {
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsVideo.this.mQoSEntity, true);
                    ZAdsVideo.this.mAdsData = c0098c;
                    ZAdsVideo.this.mIsAdBackup = c0098c.f467A0;
                    if (ZAdsVideo.this.mQoSEntity != null) {
                        ZAdsVideo.this.mQoSEntity.m16369c(c0098c.f495a);
                    }
                    C23499e.m123360b().m123362c(ZAdsVideo.this.mAdsContext, c0098c.f493Y, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat), ZAdsVideo.this.mAdsVastListener);
                    ZAdsVideo.this.checkIfHaveRequest();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onAdtimaVideoShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19746h
            public void onEmptyAdsToShow() {
                Adtima.m18326d(ZAdsVideo.TAG, "onEmptyAdsToShow");
                try {
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsVideo.this.mQoSEntity, false);
                    if (ZAdsVideo.this.checkIfNeedRetryOrForceReset(false)) {
                        ZAdsVideo.this.loadAds();
                        return;
                    }
                    if (ZAdsVideo.this.mAdsListener != null) {
                        ZAdsVideo.this.mAdsListener.onAdsLoadFailed(-4);
                    }
                    ZAdsVideo.this.cleanAdsData();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onEmptyAdsToShow", e11);
                }
            }
        };
        this.mAdsVastListener = new C23499e.a() { // from class: com.adtima.ads.ZAdsVideo.2
            @Override // p350n.C23499e.a
            public void onCompleted(C23498d c23498d) {
                Adtima.m18326d(ZAdsVideo.TAG, "onCompleted");
                try {
                    ZAdsVideo.this.mAdsVastModel = c23498d;
                    ZAdsVideo zAdsVideo = ZAdsVideo.this;
                    zAdsVideo.mAdsTrackingEventMap = zAdsVideo.mAdsVastModel.m123354n();
                    ZAdsVideo zAdsVideo2 = ZAdsVideo.this;
                    zAdsVideo2.mAdsTrackingProgressMap = zAdsVideo2.mAdsVastModel.m123358r();
                    if (ZAdsVideo.this.mAdsVastModel != null && ZAdsVideo.this.mAdsVastModel.m123348h(ZAdsVideo.this.mAdsContext)) {
                        ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsVideo.this.mQoSEntity, "video", true);
                        ZAdsVideo.this.checkIfNeedRetryOrForceReset(true);
                        ZAdsVideo zAdsVideo3 = ZAdsVideo.this;
                        zAdsVideo3.startOMVideoSession(zAdsVideo3.mAdsVastModel.m123341a());
                        ZAdsVideo.this.mAdsIsLoaded = true;
                        if (ZAdsVideo.this.mAdsListener != null) {
                            ZAdsVideo.this.mAdsListener.onAdsLoadFinished();
                        }
                    }
                    Adtima.m18326d(ZAdsVideo.TAG, "onCompleted but invalid");
                    Adtima.m18326d(ZAdsVideo.TAG, "onVastLoadFinished but invalid, call schedule next");
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsVideo.this.mQoSEntity, "video", false);
                    ZAdsVideo.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onCompleted", e11);
                }
            }

            @Override // p350n.C23499e.a
            public void onError(int i11) {
                Adtima.m18326d(ZAdsVideo.TAG, "onError");
                try {
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsVideo.this.mQoSEntity, "video", false);
                    Adtima.m18326d(ZAdsVideo.TAG, "onError and call schedule next");
                    ZAdsVideo.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onError", e11);
                }
            }
        };
        this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsVideo.3
            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFailed(int i11) {
                Handler handler;
                Runnable runnable;
                long j11;
                try {
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsVideo.this.mQoSEntity, false, false);
                    if (i11 == -5) {
                        if (ZAdsVideo.this.mAdsWaitingCount >= AbstractC20202f.f99801b) {
                            if (ZAdsVideo.this.mAdsListener != null) {
                                ZAdsVideo.this.mAdsListener.onAdsLoadFailed(i11);
                            }
                            ZAdsVideo.this.cleanAdsData();
                        }
                        ZAdsVideo.this.initHandler();
                        ZAdsVideo.this.mAdsRunnable = new Runnable() { // from class: com.adtima.ads.ZAdsVideo.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    Adtima.m18328e(ZAdsVideo.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsVideo.this.mAdsWaitingCount);
                                    ZAdsVideo.access$1508(ZAdsVideo.this);
                                    ZAdsVideo.this.loadAds();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        if (ZAdsVideo.this.mAdsHandler != null) {
                            handler = ZAdsVideo.this.mAdsHandler;
                            runnable = ZAdsVideo.this.mAdsRunnable;
                            j11 = AbstractC20202f.f99799a;
                            handler.postDelayed(runnable, j11);
                            return;
                        }
                        return;
                    }
                    if (i11 == -1) {
                        if (ZAdsVideo.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                            Adtima.reInitSdk(ZAdsVideo.this.mAdsContext, AbstractC20202f.f99816i0);
                            ZAdsVideo.this.initHandler();
                            ZAdsVideo.this.mAdsRunnable = new Runnable() { // from class: com.adtima.ads.ZAdsVideo.3.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        Adtima.m18328e(ZAdsVideo.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsVideo.this.mAdsReloadCount);
                                        ZAdsVideo.access$1608(ZAdsVideo.this);
                                        ZAdsVideo.this.loadAds();
                                    } catch (Exception unused) {
                                    }
                                }
                            };
                            if (ZAdsVideo.this.mAdsHandler != null) {
                                handler = ZAdsVideo.this.mAdsHandler;
                                runnable = ZAdsVideo.this.mAdsRunnable;
                                j11 = AbstractC20202f.f99803c;
                                handler.postDelayed(runnable, j11);
                                return;
                            }
                            return;
                        }
                        if (ZAdsVideo.this.mAdsListener != null) {
                            ZAdsVideo.this.mAdsListener.onAdsLoadFailed(i11);
                        }
                    } else if (i11 == -8) {
                        if (ZAdsVideo.this.mAdsListener != null) {
                            ZAdsVideo.this.mAdsListener.onAdsLoadFailed(i11);
                        }
                    } else if (ZAdsVideo.this.checkIfNeedRetryOrForceReset(false)) {
                        Adtima.m18326d(ZAdsVideo.TAG, "Empty ad or null, try to load next");
                        ZAdsVideo.this.loadAds();
                        return;
                    } else if (ZAdsVideo.this.mAdsListener != null) {
                        ZAdsVideo.this.mAdsListener.onAdsLoadFailed(i11);
                    }
                    ZAdsVideo.this.cleanAdsData();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onFailed", e11);
                }
            }

            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFinished(boolean z11) {
                try {
                    ZAdsVideo.this.mAdsWaitingCount = 0;
                    ZAdsVideo.this.mAdsReloadCount = 0;
                    ZAdsVideo.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsVideo.this.mQoSEntity, z11, true);
                    ZAdsVideo.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsVideo.TAG, "onLoaded", e11);
                }
            }
        };
    }

    static /* synthetic */ int access$1508(ZAdsVideo zAdsVideo) {
        int i11 = zAdsVideo.mAdsWaitingCount;
        zAdsVideo.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$1608(ZAdsVideo zAdsVideo) {
        int i11 = zAdsVideo.mAdsReloadCount;
        zAdsVideo.mAdsReloadCount = i11 + 1;
        return i11;
    }

    private void cancelHandler() {
        try {
            Adtima.m18326d(TAG, "----> cancelHandler");
            Handler handler = this.mAdsHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mAdsRunnable);
                this.mAdsHandler = null;
            } else {
                if (handler != null) {
                    this.mAdsHandler = null;
                }
                if (this.mAdsRunnable == null) {
                    return;
                }
            }
            this.mAdsRunnable = null;
        } catch (Exception unused) {
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
        C23498d c23498d;
        String m125446i;
        if (str != null) {
            try {
                if (str.length() != 0 && (c23498d = this.mAdsVastModel) != null && (m125446i = c23498d.m123357q().m125446i()) != null && m125446i.length() != 0) {
                    if (str.equals(m125446i)) {
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
            this.mAdsData = null;
            this.mAdsCurrentQuartile = 0;
            this.mAdsIsLoaded = false;
            this.mAdsVastModel = null;
            this.mAdsTrackingEventMap = null;
            this.mAdsTrackingProgressMap = null;
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanAdsData", e11);
        }
    }

    private void clearAdsHandler() {
        try {
            this.mAdsListener = null;
            this.mAdsContext = null;
            this.mAdsScheduleListener = null;
            this.mAdsTargetingData = null;
            this.mAdsVastListener = null;
            cancelHandler();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "clearAdsHandler", e11);
        }
    }

    private void doAdsClick() {
        List m125455d;
        try {
            if (this.mAdsVastModel != null) {
                String str = this.mAdsData.f512i0;
                if (str != null) {
                    if (str.length() != 0) {
                        ZAdsListener zAdsListener = this.mAdsListener;
                        if (zAdsListener != null) {
                            if (!zAdsListener.onAdsContentHandler(this.mAdsData.f512i0)) {
                            }
                            m125455d = this.mAdsVastModel.m123359s().m125455d();
                            if (m125455d != null || m125455d.isEmpty() || this.mIsAdBackup) {
                                return;
                            }
                            C20217u.m105538N0().m105596X(m125455d, this.mAdsContentId);
                            return;
                        }
                    }
                }
                String m125453a = this.mAdsVastModel.m123359s().m125453a();
                if (m125453a != null && m125453a.length() != 0) {
                    C20217u.m105538N0().m105616w(this.mAdsData, m125453a, this.mAdsContentId);
                }
                m125455d = this.mAdsVastModel.m123359s().m125455d();
                if (m125455d != null) {
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsClick", e11);
        }
    }

    private void doAdsEvent(EnumC23496b enumC23496b) {
        List<String> list;
        try {
            HashMap<EnumC23496b, List<String>> hashMap = this.mAdsTrackingEventMap;
            if (hashMap == null || hashMap.isEmpty() || (list = this.mAdsTrackingEventMap.get(enumC23496b)) == null || list.isEmpty() || this.mIsAdBackup) {
                return;
            }
            C20217u.m105538N0().m105596X(list, this.mAdsContentId);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsEvent", e11);
        }
    }

    private void doAdsImpression() {
        try {
            if (this.mAdsVastModel != null) {
                C20217u.m105538N0().m105587P("native", this.mAdsZoneId, this.mAdsLoadTag);
                List m123356p = this.mAdsVastModel.m123356p();
                if (m123356p == null || m123356p.isEmpty() || this.mIsAdBackup) {
                    return;
                }
                C20217u.m105538N0().m105596X(this.mAdsVastModel.m123356p(), this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsImpression", e11);
        }
    }

    private void doAdsProgress(int i11) {
        List<String> remove;
        Adtima.m18326d(TAG, "doAdsProgress: " + i11);
        try {
            HashMap<Integer, List<String>> hashMap = this.mAdsTrackingProgressMap;
            if (hashMap == null || hashMap.isEmpty() || (remove = this.mAdsTrackingProgressMap.remove(Integer.valueOf(i11))) == null || remove.isEmpty() || this.mIsAdBackup) {
                return;
            }
            C20217u.m105538N0().m105596X(remove, this.mAdsContentId);
            if (this.mAdsTrackingProgressMapTemp == null) {
                this.mAdsTrackingProgressMapTemp = new HashMap<>();
            }
            this.mAdsTrackingProgressMapTemp.put(Integer.valueOf(i11), remove);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsProgress", e11);
        }
    }

    private void doAdsProgressRenew() {
        try {
            if (this.mAdsTrackingProgressMapTemp != null) {
                this.mAdsTrackingProgressMap = new HashMap<>();
                for (Map.Entry<Integer, List<String>> entry : this.mAdsTrackingProgressMapTemp.entrySet()) {
                    this.mAdsTrackingProgressMap.put(entry.getKey(), entry.getValue());
                }
                this.mAdsTrackingProgressMapTemp = new HashMap<>();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsProgressRenew", e11);
        }
    }

    private void doAdsQuartile(int i11) {
        int i12 = this.mAdsCurrentQuartile;
        EnumC23496b enumC23496b = null;
        if (i11 >= i12 * 25) {
            if (i12 == 1) {
                enumC23496b = EnumC23496b.firstQuartile;
                trackOMVideoEvent(1);
            } else {
                int i13 = 2;
                if (i12 == 2) {
                    enumC23496b = EnumC23496b.midpoint;
                } else {
                    i13 = 3;
                    if (i12 == 3) {
                        enumC23496b = EnumC23496b.thirdQuartile;
                    }
                }
                trackOMVideoEvent(i13);
            }
            this.mAdsCurrentQuartile++;
        }
        if (enumC23496b != null) {
            doAdsEvent(enumC23496b);
        }
    }

    private void doAdsViewableImpression() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105608p(8, this.mAdsData, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsViewableImpression", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initHandler() {
        try {
            Adtima.m18326d(TAG, "----> initHandler");
            if (this.mAdsHandler != null) {
                cancelHandler();
            }
            this.mAdsHandler = new Handler();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRightNow() {
        try {
            initHandler();
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.ZAdsVideo.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsVideo.this.mQoSEntity != null) {
                            ZAdsVideo.this.mQoSEntity.m16382p(System.currentTimeMillis());
                        }
                        C20217u.m105538N0().m105593T(ZAdsVideo.this.mAdsZoneId, ZAdsVideo.this.mAdsLoadTag, ZAdsVideo.this.mAdsContentId, ZAdsVideo.this.mAdsScheduleListener);
                    } catch (Exception e11) {
                        Adtima.m18327d(ZAdsVideo.TAG, ZAdsVideo.TAG, e11);
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
        C20209m.e eVar;
        Adtima.m18326d(TAG, "doAdsDismiss");
        try {
            cleanAdsData();
            clearAdsHandler();
            if (!AbstractC20202f.f99835s || (eVar = this.mOMSession) == null) {
                return;
            }
            eVar.m105449d();
            this.mOMSession = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsDismiss", e11);
        }
    }

    public void doAdsClose(String str) {
        Adtima.m18326d(TAG, "doAdsComplete");
        try {
            if (checkIfRightAds(str)) {
                doAdsEvent(EnumC23496b.close);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsComplete", e11);
        }
    }

    public void doAdsComplete(String str) {
        Adtima.m18326d(TAG, "doAdsComplete");
        try {
            if (checkIfRightAds(str)) {
                doAdsEvent(EnumC23496b.complete);
                doAdsProgressRenew();
                this.mAdsCurrentQuartile = 0;
                trackOMVideoEvent(4);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsComplete", e11);
        }
    }

    public void doAdsDisplay(String str) {
        C20209m.e eVar;
        Adtima.m18326d(TAG, "doAdsDisplay");
        try {
            if (checkIfRightAds(str)) {
                doAdsEvent(EnumC23496b.creativeView);
                doAdsImpression();
                if (!AbstractC20202f.f99835s || (eVar = this.mOMSession) == null) {
                    return;
                }
                eVar.m105452g(this.mAdsRegisterView);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsDisplay", e11);
        }
    }

    public void doAdsPause(String str) {
        Adtima.m18326d(TAG, "doAdsPause");
        try {
            if (checkIfRightAds(str)) {
                doAdsEvent(EnumC23496b.pause);
                trackOMVideoEvent(5);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsPause", e11);
        }
    }

    public void doAdsProgressByPercent(String str, int i11) {
        Adtima.m18326d(TAG, "doAdsProgressByPercent");
        try {
            if (checkIfRightAds(str) && getAdsMediaDuration() > 0) {
                doAdsProgress((getAdsMediaDuration() * i11) / 100);
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
                doAdsProgress(i11);
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
                doAdsEvent(EnumC23496b.resume);
                trackOMVideoEvent(6);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsStop", e11);
        }
    }

    public void doAdsStart(String str) {
        Adtima.m18326d(TAG, "doAdsStart");
        try {
            if (checkIfRightAds(str)) {
                doAdsEvent(EnumC23496b.start);
                doAdsViewableImpression();
                trackOMVideoStarted();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsStart", e11);
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
            C23498d c23498d = this.mAdsVastModel;
            if (c23498d != null) {
                return AbstractC22011d.m114901b(c23498d.m123349i());
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAdsMediaUrl", e11);
        }
        return 0;
    }

    public String getAdsMediaUrl() {
        try {
            C23498d c23498d = this.mAdsVastModel;
            if (c23498d != null) {
                return c23498d.m123357q().m125446i();
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

    public void startOMVideoSession(List<C20894a> list) {
        try {
            if (!AbstractC20202f.f99835s || list == null || list.size() == 0) {
                return;
            }
            C20209m m105408c = C20209m.m105408c(this.mAdsContext);
            C0098c c0098c = this.mAdsData;
            C20209m.e m105417h = m105408c.m105417h(list, c0098c.f502d0, c0098c.f504e0, (float) c0098c.f506f0);
            this.mOMSession = m105417h;
            m105417h.m105452g(this.mAdsRegisterView);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startOMVideoSession", e11);
        }
    }

    public void trackOMVideoEvent(int i11) {
        C20209m.e eVar;
        try {
            if (!AbstractC20202f.f99835s || (eVar = this.mOMSession) == null) {
                return;
            }
            eVar.m105451f(i11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMVideoEvent", e11);
        }
    }

    public void trackOMVideoStarted() {
        try {
            if (!AbstractC20202f.f99835s || this.mOMSession == null) {
                return;
            }
            this.mOMSession.m105450e(getAdsMediaDuration(), 0.8f);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMVideoStarted", e11);
        }
    }

    public void doAdsClick(String str) {
        Adtima.m18326d(TAG, "doAdsclicked");
        try {
            if (checkIfRightAds(str) && !this.mIsAdsClicked) {
                this.mIsAdsClicked = true;
                doAdsClick();
                initHandler();
                Handler handler = this.mAdsHandler;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsVideo.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ZAdsVideo.this.mIsAdsClicked = false;
                        }
                    }, 1500L);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doAdsclicked", e11);
        }
    }

    public void loadAds(String str) {
        this.mAdsLoadTag = str;
        try {
            String str2 = this.mAdsZoneId;
            if (str2 == null || str2.length() == 0) {
                Adtima.m18330p(TAG, "Request with empty zone!");
            } else {
                C3228a c3228a = new C3228a();
                this.mQoSEntity = c3228a;
                c3228a.m16376j(this.mAdsZoneId);
                this.mQoSEntity.m16378l(System.currentTimeMillis());
                C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "native", "native", this.mAdsZoneId, this.mAdsLoadTag, null, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }
}
