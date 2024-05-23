package com.adtima.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsPartnerNativeAbstract;
import com.adtima.ads.partner.ZAdsPartnerNativeListener;
import com.adtima.ads.partner.nativepartner.ZAdsGoogleNative;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0098c;
import p009a3.C0099d;
import p047c3.C3228a;
import p178g3.AbstractC19211f;
import p196h3.InterfaceC19743e;
import p196h3.InterfaceC19745g;
import p227i3.AbstractC20202f;
import p227i3.C20199c;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20221y;

/* loaded from: classes2.dex */
public final class ZAdsNative implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private static final String TAG = "ZAdsNative";
    private View.OnClickListener mAdsClickListener;
    private Context mAdsContext;
    private String mAdsKind;
    private InterfaceC19745g mAdsLoadListener;
    private ZAdsPartnerNativeListener mAdsPartnerListener;
    private InterfaceC19743e mAdsScheduleListener;
    private String mAdsZoneId;
    private C3228a mQoSEntity;
    public View mAdsRegisterView = null;
    private AbstractRunnableC0008c mAdsTask = null;
    private Bundle mAdsTargetingData = null;
    private String mAdsContentUrl = null;
    private int mAdsWaitingCount = 0;
    private int mAdsReloadCount = 0;
    private int mAdsRetryCount = 0;
    private long mAdsDelayTime = 20000;
    private boolean mAdsIsLoaded = false;
    private boolean mIsAdsClicked = false;
    private boolean mEnableRetry = false;
    private boolean mAdsImpressionWaiting = false;
    private boolean mAdsInViewPortCurrent = false;
    private boolean mAdsBannerActiveViewWaiting = false;
    private boolean mAdsTrueImpressionWaiting = false;
    private long mAdsImpressionTimestamp = 0;
    private boolean mIsTrackingActive = false;
    private int mAdsActiveViewContinuouslyDuration = 0;
    private Timer mAdsActiveViewTimer = null;
    private TimerTask mTimerTask = null;
    private C0098c mAdsData = null;
    private ZAdsListener mAdsListener = null;
    private ZAdsPartnerNativeAbstract mAdsPartner = null;
    private View.OnClickListener mAdsAppClickListener = null;
    private String mAdsLoadTag = null;
    private String mAdsContentId = "";
    private long mStartTime = 0;
    private long mEndTime = 0;
    private long mDuration = 0;

    public ZAdsNative(Context context, String str) {
        this.mAdsPartnerListener = null;
        this.mAdsClickListener = null;
        this.mAdsLoadListener = null;
        this.mAdsScheduleListener = null;
        this.mAdsZoneId = str;
        this.mAdsContext = context;
        this.mAdsPartnerListener = new ZAdsPartnerNativeListener() { // from class: com.adtima.ads.ZAdsNative.1
            @Override // com.adtima.ads.partner.ZAdsPartnerNativeListener
            public void onFailed() {
                Adtima.m18326d(ZAdsNative.TAG, "onFailed");
                ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsNative.this.mQoSEntity, ZAdsNative.this.mAdsKind, false);
                try {
                    Adtima.m18326d(ZAdsNative.TAG, "onFailed and call schedule next");
                    ZAdsNative.this.scheduleRightNow();
                } catch (Exception unused) {
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerNativeListener
            public void onLoaded() {
                try {
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsNative.this.mQoSEntity, ZAdsNative.this.mAdsKind, true);
                    if (ZAdsNative.this.mAdsPartner != null) {
                        ZAdsNative zAdsNative = ZAdsNative.this;
                        zAdsNative.mAdsData = zAdsNative.mAdsPartner.getAdsPartner();
                        if (ZAdsNative.this.mAdsData != null) {
                            ZAdsNative.this.checkIfNeedRetryOrForceReset(true);
                            ZAdsNative.this.mAdsIsLoaded = true;
                            ZAdsNative.this.mAdsImpressionWaiting = true;
                            ZAdsNative.this.mAdsBannerActiveViewWaiting = true;
                            ZAdsNative.this.mAdsTrueImpressionWaiting = true;
                            if (ZAdsNative.this.mAdsListener != null) {
                                ZAdsNative.this.showDebugLog();
                                ZAdsNative.this.mAdsListener.onAdsLoadFinished();
                                return;
                            }
                            return;
                        }
                        if (ZAdsNative.this.mAdsListener == null) {
                            return;
                        } else {
                            ZAdsNative.this.showDebugLog();
                        }
                    } else if (ZAdsNative.this.mAdsListener == null) {
                        return;
                    } else {
                        ZAdsNative.this.showDebugLog();
                    }
                    ZAdsNative.this.mAdsListener.onAdsLoadFailed(-2);
                } catch (Exception unused) {
                }
            }
        };
        this.mAdsScheduleListener = new InterfaceC19743e() { // from class: com.adtima.ads.ZAdsNative.2
            @Override // p196h3.InterfaceC19743e
            public void onAdtimaNativeShow(C0098c c0098c) {
                try {
                    ZAdsNative.this.showDebugLog();
                    if (c0098c == null) {
                        if (ZAdsNative.this.mAdsListener != null) {
                            ZAdsNative.this.mAdsListener.onAdsLoadFailed(-3);
                        }
                        ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsNative.this.mQoSEntity, false);
                        return;
                    }
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsNative.this.mQoSEntity, true);
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsNative.this.mQoSEntity, c0098c.f537v, true);
                    if (!Adtima.isDebuggable()) {
                        ZAdsNative.this.mAdsDelayTime = c0098c.f539w;
                    }
                    ZAdsNative.this.mAdsData = c0098c;
                    if (ZAdsNative.this.mAdsData != null) {
                        C20199c.m105336g().m105345j(ZAdsNative.this.mAdsData.f515k);
                    }
                    ZAdsNative.this.mAdsIsLoaded = true;
                    ZAdsNative.this.mAdsImpressionWaiting = true;
                    ZAdsNative.this.mAdsBannerActiveViewWaiting = true;
                    ZAdsNative.this.mAdsTrueImpressionWaiting = true;
                    if (ZAdsNative.this.mAdsListener != null) {
                        ZAdsNative.this.mAdsListener.onAdsLoadFinished();
                    }
                    ZAdsNative.this.checkIfHaveRequest();
                } catch (Exception unused) {
                }
            }

            @Override // p196h3.InterfaceC19743e
            public void onEmptyAdsToShow() {
                try {
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsNative.this.mQoSEntity, false);
                    ZAdsNative.this.showDebugLog();
                    if (ZAdsNative.this.mAdsListener != null) {
                        ZAdsNative.this.mAdsListener.onAdsLoadFailed(-4);
                    }
                } catch (Exception unused) {
                }
            }

            @Override // p196h3.InterfaceC19743e
            public void onGoogleNativeShow(C0099d c0099d) {
                Adtima.m18328e(ZAdsNative.TAG, "onGoogleNativeShow");
                try {
                    if (ZAdsNative.this.mQoSEntity != null) {
                        ZAdsNative.this.mQoSEntity.m16375i(System.currentTimeMillis());
                        if (c0099d != null) {
                            ZAdsNative.this.mAdsKind = c0099d.f553g;
                            ZAdsNative.this.mQoSEntity.m16369c(c0099d.f547a);
                        }
                        ZAdsNative.this.mQoSEntity.m16379m(System.currentTimeMillis());
                    }
                    ZAdsNative.this.showDebugLog();
                    ZAdsNative.this.mAdsPartner = new ZAdsGoogleNative(ZAdsNative.this.mAdsContext, c0099d, ZAdsNative.this.mAdsContentUrl, ZAdsNative.this.mAdsTargetingData);
                    ZAdsNative.this.mAdsPartner.setAdsPartnerListener(ZAdsNative.this.mAdsPartnerListener);
                    ZAdsNative.this.mAdsPartner.loadAdsPartner();
                    ZAdsNative.this.checkIfHaveRequest();
                } catch (Exception unused) {
                }
            }
        };
        this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsNative.3
            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFailed(int i11) {
                ZAdsListener zAdsListener;
                Handler handler;
                Runnable runnable;
                long j11;
                try {
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsNative.this.mQoSEntity, false, false);
                    if (i11 == -5) {
                        if (ZAdsNative.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                            handler = new Handler();
                            runnable = new Runnable() { // from class: com.adtima.ads.ZAdsNative.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Adtima.m18328e(ZAdsNative.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsNative.this.mAdsWaitingCount);
                                    ZAdsNative.access$1908(ZAdsNative.this);
                                    ZAdsNative zAdsNative = ZAdsNative.this;
                                    zAdsNative.loadAds(zAdsNative.mAdsLoadTag);
                                }
                            };
                            j11 = AbstractC20202f.f99799a;
                            handler.postDelayed(runnable, j11);
                            return;
                        }
                        if (ZAdsNative.this.mAdsListener != null) {
                            zAdsListener = ZAdsNative.this.mAdsListener;
                            zAdsListener.onAdsLoadFailed(i11);
                            ZAdsNative.this.showDebugLog();
                        }
                        return;
                    }
                    if (i11 == -1) {
                        if (ZAdsNative.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                            Adtima.reInitSdk(ZAdsNative.this.mAdsContext, AbstractC20202f.f99816i0);
                            handler = new Handler();
                            runnable = new Runnable() { // from class: com.adtima.ads.ZAdsNative.3.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    Adtima.m18328e(ZAdsNative.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsNative.this.mAdsReloadCount);
                                    ZAdsNative.access$2008(ZAdsNative.this);
                                    ZAdsNative zAdsNative = ZAdsNative.this;
                                    zAdsNative.loadAds(zAdsNative.mAdsLoadTag);
                                }
                            };
                            j11 = AbstractC20202f.f99803c;
                            handler.postDelayed(runnable, j11);
                            return;
                        }
                        if (ZAdsNative.this.mAdsListener == null) {
                            return;
                        } else {
                            zAdsListener = ZAdsNative.this.mAdsListener;
                        }
                    } else {
                        if (i11 != -8) {
                            if (ZAdsNative.this.checkIfNeedRetryOrForceReset(false)) {
                                Adtima.m18326d(ZAdsNative.TAG, "Empty ad or null, try to load next");
                                ZAdsNative zAdsNative = ZAdsNative.this;
                                zAdsNative.loadAds(zAdsNative.mAdsLoadTag);
                                return;
                            } else {
                                if (ZAdsNative.this.mAdsListener != null) {
                                    ZAdsNative.this.showDebugLog();
                                    ZAdsNative.this.mAdsListener.onAdsLoadFailed(i11);
                                    return;
                                }
                                return;
                            }
                        }
                        if (ZAdsNative.this.mAdsListener == null) {
                            return;
                        } else {
                            zAdsListener = ZAdsNative.this.mAdsListener;
                        }
                    }
                    zAdsListener.onAdsLoadFailed(i11);
                    ZAdsNative.this.showDebugLog();
                } catch (Exception unused) {
                }
            }

            @Override // p196h3.InterfaceC19745g
            public void onAdsLoadFinished(boolean z11) {
                try {
                    ZAdsNative.this.mAdsWaitingCount = 0;
                    ZAdsNative.this.mAdsReloadCount = 0;
                    ZAdsNative.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsNative.this.mQoSEntity, z11, true);
                    ZAdsNative.this.scheduleRightNow();
                } catch (Exception unused) {
                }
            }
        };
        this.mAdsClickListener = new View.OnClickListener() { // from class: com.adtima.ads.ZAdsNative.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (ZAdsNative.this.mIsAdsClicked) {
                        return;
                    }
                    ZAdsNative.this.mIsAdsClicked = true;
                    ZAdsNative.this.checkIfHaveClick();
                    new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsNative.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ZAdsNative.this.mIsAdsClicked = false;
                        }
                    }, 1000L);
                } catch (Exception unused) {
                }
            }
        };
    }

    static /* synthetic */ int access$1908(ZAdsNative zAdsNative) {
        int i11 = zAdsNative.mAdsWaitingCount;
        zAdsNative.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$2008(ZAdsNative zAdsNative) {
        int i11 = zAdsNative.mAdsReloadCount;
        zAdsNative.mAdsReloadCount = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveActiveView() {
        try {
            try {
                if (!this.mAdsInViewPortCurrent || this.mAdsData == null) {
                    this.mAdsActiveViewContinuouslyDuration = 0;
                } else {
                    this.mAdsActiveViewContinuouslyDuration += 100;
                }
                reportActiveView(false);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[Catch: all -> 0x0042, Exception -> 0x0108, TRY_LEAVE, TryCatch #2 {Exception -> 0x0108, all -> 0x0042, blocks: (B:3:0x0001, B:9:0x0008, B:11:0x0019, B:14:0x0027, B:16:0x0033, B:17:0x003e, B:18:0x00f9, B:19:0x00fc, B:21:0x0100, B:25:0x0045, B:27:0x0051, B:29:0x0057, B:31:0x005b, B:33:0x0061, B:35:0x0065, B:36:0x006d, B:37:0x0073, B:38:0x00eb, B:41:0x0077, B:43:0x0083, B:44:0x008a, B:46:0x0096, B:47:0x00a0, B:49:0x00ac, B:50:0x00b6, B:52:0x00c2, B:53:0x00cc, B:55:0x00d2, B:57:0x00d8, B:59:0x00dc, B:60:0x00e4, B:61:0x00f1), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void checkIfHaveClick() {
        C20217u m105538N0;
        C0098c c0098c;
        boolean onAdsContentHandler;
        C20217u m105538N02;
        C0098c c0098c2;
        View.OnClickListener onClickListener;
        String str;
        try {
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
        if (this.mAdsData == null) {
            return;
        }
        reportActiveView(true);
        int i11 = 4;
        if (!this.mAdsData.f537v.equals("native") && !this.mAdsData.f537v.equals("graphic")) {
            if (!this.mAdsData.f537v.equals("admob")) {
                if (this.mAdsData.f537v.equals("zalo")) {
                    C0098c c0098c3 = this.mAdsData;
                    if (c0098c3.f505f != null) {
                        String str2 = c0098c3.f512i0;
                        if (str2 != null && str2.length() != 0) {
                            ZAdsListener zAdsListener = this.mAdsListener;
                            onAdsContentHandler = zAdsListener != null ? zAdsListener.onAdsContentHandler(this.mAdsData.f512i0) : false;
                            m105538N02 = C20217u.m105538N0();
                            c0098c2 = this.mAdsData;
                            m105538N02.m105619y(c0098c2, onAdsContentHandler, this.mAdsContentId);
                            if (!onAdsContentHandler) {
                            }
                        }
                        if (this.mAdsData.f505f.equals("default")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData;
                        } else {
                            if (this.mAdsData.f505f.equals("call")) {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = this.mAdsData;
                                str = this.mAdsContentId;
                                i11 = 6;
                            } else if (this.mAdsData.f505f.equals("chat")) {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = this.mAdsData;
                                str = this.mAdsContentId;
                                i11 = 5;
                            } else if (this.mAdsData.f505f.equals("follow")) {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = this.mAdsData;
                                str = this.mAdsContentId;
                                i11 = 7;
                            }
                            m105538N0.m105608p(i11, c0098c, str);
                        }
                    }
                }
                onClickListener = this.mAdsAppClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(this.mAdsRegisterView);
                }
            }
            this.mAdsPartner.haveAdsPartnerClick();
            m105538N0 = C20217u.m105538N0();
            c0098c = this.mAdsData;
            str = this.mAdsContentId;
            m105538N0.m105608p(i11, c0098c, str);
            onClickListener = this.mAdsAppClickListener;
            if (onClickListener != null) {
            }
        }
        String str3 = this.mAdsData.f512i0;
        if (str3 == null || str3.length() == 0) {
            m105538N0 = C20217u.m105538N0();
            c0098c = this.mAdsData;
            str = this.mAdsContentId;
            m105538N0.m105608p(i11, c0098c, str);
            onClickListener = this.mAdsAppClickListener;
            if (onClickListener != null) {
            }
        }
        ZAdsListener zAdsListener2 = this.mAdsListener;
        onAdsContentHandler = zAdsListener2 != null ? zAdsListener2.onAdsContentHandler(this.mAdsData.f512i0) : false;
        m105538N02 = C20217u.m105538N0();
        c0098c2 = this.mAdsData;
        m105538N02.m105619y(c0098c2, onAdsContentHandler, this.mAdsContentId);
        if (!onAdsContentHandler) {
        }
    }

    private synchronized void checkIfHaveFeedback(ArrayList<Integer> arrayList) {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105618x(this.mAdsData, this.mAdsContentId, arrayList);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveFeedback", e11);
        }
    }

    private synchronized void checkIfHaveImpression() {
        try {
            if (this.mAdsData != null && this.mAdsImpressionWaiting) {
                C20217u.m105538N0().m105587P("native", this.mAdsZoneId, this.mAdsLoadTag);
                C20217u.m105538N0().m105608p(1, this.mAdsData, this.mAdsContentId);
                this.mAdsImpressionWaiting = false;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
        }
    }

    private synchronized void checkIfHaveInViewPort() {
        try {
            boolean localVisibleRect = this.mAdsRegisterView.getLocalVisibleRect(new Rect());
            int width = (int) (((r0.width() * r0.height()) * 100.0d) / (this.mAdsRegisterView.getWidth() * this.mAdsRegisterView.getHeight()));
            if (localVisibleRect && width > 0) {
                checkIfHaveTrueImpression();
            }
            boolean z11 = localVisibleRect && width >= 50;
            this.mAdsInViewPortCurrent = z11;
            if (z11 && this.mAdsBannerActiveViewWaiting && !this.mIsTrackingActive) {
                stopActiveViewTimer();
                startActiveViewTimer();
            } else if (!z11 && this.mIsTrackingActive) {
                stopActiveViewTimer();
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
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

    private synchronized void checkIfHaveTrueImpression() {
        try {
            if (this.mAdsTrueImpressionWaiting) {
                Adtima.m18328e(TAG, "Report Viewable-Impression");
                C20217u.m105538N0().m105608p(8, this.mAdsData, this.mAdsContentId);
                this.mAdsTrueImpressionWaiting = false;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveTrueImpression", e11);
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

    @SuppressLint({"NewApi"})
    private void cleanUp() {
        Adtima.m18326d(TAG, "cleanUp");
        try {
            this.mAdsIsLoaded = false;
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
            this.mAdsScheduleListener = null;
            View view = this.mAdsRegisterView;
            if (view != null && view.getViewTreeObserver() != null) {
                if (AbstractC19211f.m100806a(16)) {
                    this.mAdsRegisterView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.mAdsRegisterView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
            stopActiveViewTimer();
            this.mAdsContext = null;
            C0009d.m7c(this.mAdsTask);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanUp", e11);
        }
    }

    private void reportActiveView(boolean z11) {
        int currentTimeMillis = ((int) (System.currentTimeMillis() - this.mAdsImpressionTimestamp)) % 180000;
        if (this.mAdsData == null || !this.mAdsBannerActiveViewWaiting) {
            return;
        }
        if (this.mAdsActiveViewContinuouslyDuration >= 1000 || z11) {
            Adtima.m18328e(TAG, "Have active view of native: " + this.mAdsActiveViewContinuouslyDuration);
            C20217u.m105538N0().m105601h0(currentTimeMillis, this.mAdsData, this.mAdsContentId);
            this.mAdsBannerActiveViewWaiting = false;
            stopActiveViewTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRightNow() {
        try {
            C0009d.m7c(this.mAdsTask);
            this.mAdsTask = new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsNative.5
                @Override // p001a.p005d.AbstractRunnableC0008c
                public Object doInBackground() {
                    try {
                        if (ZAdsNative.this.mQoSEntity != null) {
                            ZAdsNative.this.mQoSEntity.m16382p(System.currentTimeMillis());
                        }
                        C20217u.m105538N0().m105585O(ZAdsNative.this.mAdsZoneId, ZAdsNative.this.mAdsLoadTag, ZAdsNative.this.mAdsScheduleListener);
                        return null;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsNative.TAG, "scheduleAfterMillis", e11);
                        return null;
                    }
                }
            };
            this.mQoSEntity = C20212p.m105468m().m105470a(this.mQoSEntity, this.mAdsZoneId);
            C0009d.m11g(this.mAdsTask);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleNextTime", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDebugLog() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.mEndTime = currentTimeMillis;
            this.mDuration = currentTimeMillis - this.mStartTime;
            Adtima.m18328e(TAG, "ADTIMA-LOG : " + this.mAdsZoneId + " => Start : " + this.mStartTime + " - End : " + this.mEndTime + " - Duration : " + this.mDuration + "ms");
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showDebugLog", e11);
        }
    }

    private void startActiveViewTimer() {
        try {
            this.mAdsActiveViewContinuouslyDuration = 0;
            this.mAdsImpressionTimestamp = System.currentTimeMillis();
            this.mIsTrackingActive = true;
            this.mAdsActiveViewTimer = new Timer();
            TimerTask timerTask = new TimerTask() { // from class: com.adtima.ads.ZAdsNative.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        ZAdsNative.this.checkIfHaveActiveView();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsNative.TAG, "startActiveViewTimer", e11);
                    }
                }
            };
            this.mTimerTask = timerTask;
            this.mAdsActiveViewTimer.scheduleAtFixedRate(timerTask, 100L, 100L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startActiveViewTimer", e11);
        }
    }

    private void stopActiveViewTimer() {
        try {
            TimerTask timerTask = this.mTimerTask;
            if (timerTask != null) {
                timerTask.cancel();
                this.mTimerTask = null;
            }
            Timer timer = this.mAdsActiveViewTimer;
            if (timer != null) {
                timer.cancel();
                this.mAdsActiveViewTimer = null;
            }
            this.mAdsImpressionTimestamp = 0L;
            this.mAdsActiveViewContinuouslyDuration = 0;
            this.mIsTrackingActive = false;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "stopActiveViewTimer", e11);
        }
    }

    public void addAdsTargeting(String str, String str2) {
        try {
            if (this.mAdsTargetingData == null) {
                this.mAdsTargetingData = new Bundle();
            }
            this.mAdsTargetingData.putString(str, str2);
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        try {
            cleanUp();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "dismissAds", e11);
        }
    }

    public void feedbackAds(ArrayList<Integer> arrayList) {
        try {
            checkIfHaveFeedback(arrayList);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "feedbackAds", e11);
        }
    }

    public String getAction() {
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

    public String getAdsMetaData() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
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

    public String getAppCaption() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f531s;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getAppDescription() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f533t;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getAppName() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f529r;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getAppPackageName() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f492X;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public float getAppRating() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f525p;
            }
        } catch (Exception unused) {
        }
        return 0.0f;
    }

    public Bundle getBundleCookie() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f544y0;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getContext() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f535u;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getInfo() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f501d;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getLanscapeCover() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f519m;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getLogo() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f515k;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Deprecated
    public String getMetaData() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f514j0;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getPortraitCover() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f517l;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getPromotion() {
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null) {
                return c0098c.f527q;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0024 -> B:9:0x0025). Please report as a decompilation issue!!! */
    public String getTitle() {
        String str;
        C0098c c0098c;
        try {
            c0098c = this.mAdsData;
        } catch (Exception unused) {
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

    public void haveAdsInventory() {
        try {
            checkIfHaveInventory();
        } catch (Exception unused) {
        }
    }

    public boolean isAdsLoaded() {
        return this.mAdsIsLoaded;
    }

    public boolean isAdsRetryIfLoadFail() {
        return this.mEnableRetry;
    }

    public boolean isApp() {
        String str;
        try {
            C0098c c0098c = this.mAdsData;
            if (c0098c != null && (str = c0098c.f492X) != null) {
                if (str.length() != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public void loadAds() {
        loadAds(null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            checkIfHaveInViewPort();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        try {
            checkIfHaveInViewPort();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        try {
            Adtima.m18328e(TAG, "onViewAttachedToWindow");
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            checkIfHaveInViewPort();
            if (this.mAdsBannerActiveViewWaiting) {
                stopActiveViewTimer();
                startActiveViewTimer();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        try {
            Adtima.m18328e(TAG, "onViewDetachedFromWindow");
            stopActiveViewTimer();
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"NewApi"})
    public void registerAdsInteraction(View view) {
        try {
            this.mAdsRegisterView = view;
            if (view != null) {
                view.addOnAttachStateChangeListener(this);
                this.mAdsRegisterView.setOnClickListener(this.mAdsClickListener);
                ViewTreeObserver viewTreeObserver = this.mAdsRegisterView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
                checkIfHaveImpression();
            }
        } catch (Exception unused) {
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

    public void setAdsListener(ZAdsListener zAdsListener) {
        this.mAdsListener = zAdsListener;
    }

    public void setAdsRetryIfLoadFail(boolean z11) {
        try {
            this.mEnableRetry = z11;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setEnableRetry", e11);
        }
    }

    public void setAdsTargeting(Bundle bundle) {
        this.mAdsTargetingData = bundle;
    }

    @SuppressLint({"NewApi"})
    public void unregisterAdsInteraction() {
        try {
            View view = this.mAdsRegisterView;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = this.mAdsRegisterView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    viewTreeObserver.removeOnScrollChangedListener(this);
                }
                this.mAdsPartner.destroyAdsPartner();
            }
        } catch (Exception unused) {
        }
    }

    public void loadAds(String str) {
        try {
            this.mAdsLoadTag = str;
            this.mQoSEntity = new C3228a();
            String str2 = this.mAdsZoneId;
            if (str2 == null || str2.length() == 0) {
                Adtima.m18330p(TAG, "Request with empty zone!");
                return;
            }
            if (this.mAdsRetryCount == 0) {
                this.mStartTime = System.currentTimeMillis();
            }
            C3228a c3228a = this.mQoSEntity;
            if (c3228a != null) {
                c3228a.m16376j(this.mAdsZoneId);
                this.mQoSEntity.m16378l(System.currentTimeMillis());
            }
            C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "native", "native", this.mAdsZoneId, this.mAdsLoadTag, null, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
        } catch (Exception unused) {
        }
    }

    public void registerAdsInteraction(View view, View.OnClickListener onClickListener) {
        try {
            this.mAdsAppClickListener = onClickListener;
            registerAdsInteraction(view);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "registerAdsInteraction", e11);
        }
    }
}
