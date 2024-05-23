package com.adtima.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsListener;
import com.adtima.ads.partner.ZAdsAudioPartnerListener;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner;
import com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner;
import com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner;
import com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner;
import com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner;
import com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner;
import com.adtima.ads.partner.banner.ZAdsGoogleGraphicBanner;
import com.adtima.ads.partner.banner.ZAdsGoogleNativeBanner;
import com.adtima.ads.partner.banner.ZAdsIMAAudioBanner;
import com.adtima.ads.partner.network.ZAdsNetworkBundle;
import com.adtima.ads.partner.network.ZAdsNetworksPreload;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0098c;
import p009a3.C0099d;
import p047c3.C3228a;
import p090d3.C17718a;
import p178g3.AbstractC19207b;
import p178g3.AbstractC19211f;
import p178g3.C19206a;
import p196h3.InterfaceC19740b;
import p196h3.InterfaceC19745g;
import p196h3.InterfaceC19747i;
import p227i3.AbstractC20202f;
import p227i3.AbstractC20206j;
import p227i3.C20208l;
import p227i3.C20212p;
import p227i3.C20215s;
import p227i3.C20217u;
import p227i3.C20221y;
import p227i3.EnumC20200d;
import p309l.C21976d;
import p309l.EnumC21975c;
import p313l3.AbstractC22010c;
import p313l3.AbstractC22011d;
import p350n.C23498d;
import p350n.EnumC23496b;
import p699z.C31129a;

/* loaded from: classes2.dex */
public final class ZAdsBanner extends ZAdsView implements ZAdsInterface, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private static final String TAG = "ZAdsBanner";
    private int mAdsActiveViewContinuouslyDuration;
    private Timer mAdsActiveViewTimer;
    private boolean mAdsAudioAutoPlayPrefer;
    private boolean mAdsAutoRefresh;
    private boolean mAdsBannerActiveViewWaiting;
    private boolean mAdsBannerTrueImpWaiting;
    private boolean mAdsBorderEnable;
    private String mAdsContentId;
    private String mAdsContentUrl;
    private ZAdsAudioPartnerListener mAdsDaastListener;
    private Object mAdsData;
    private long mAdsDelayTime;
    private Handler mAdsHandler;
    private int mAdsHeight;
    private long mAdsImpressionTimestamp;
    private boolean mAdsInViewPortCurrent;
    private boolean mAdsIsDismiss;
    private boolean mAdsIsSchedule;
    private String mAdsKind;
    private String mAdsLoadTag;
    private boolean mAdsMediaActiveViewWaiting;
    private List<String> mAdsMediaImpressionWaiting;
    private ZAdsNetworksPreload mAdsNetworkPreload;
    private ZAdsPartnerViewListener mAdsPartnerListener;
    private boolean mAdsPreload;
    private View mAdsRegisterView;
    private int mAdsReloadCount;
    private int mAdsRetryCount;
    private Runnable mAdsRunnable;
    private InterfaceC19740b mAdsScheduleListener;
    private Object mAdsTag;
    private Bundle mAdsTargetingData;
    private InterfaceC19747i mAdsVastListener;
    private boolean mAdsVideoAutoPlayPrefer;
    private boolean mAdsVideoSoundOnPrefer;
    private int mAdsWaitingCount;
    private int mAdsWidth;
    private ZAdsPartnerBannerAbstract mAttachedBanner;
    private BANNER_SHOW_TYPE mBannerType;
    private String mContentFilterId;
    private AbstractRunnableC0008c mDownloadTask;
    private boolean mEnableRetry;
    private long mGetAdTime;
    private boolean mIsAdBackup;
    private boolean mIsInPageShowCompleted;
    private boolean mIsReloadWhenAutoRefresh;
    private boolean mIsVideoCompleted;
    private boolean mIsViewOnTopRegistered;
    private C3228a mQoSEntity;
    private Dialog mReportDialog;
    private long mSchedudeTime;
    private boolean mShouldPriorityLoadAd;
    private long mStartTime;
    private ZAdsPartnerBannerAbstract mTempBanner;
    private TimerTask mTimerTask;
    private Bitmap thumbBitmap;

    /* loaded from: classes2.dex */
    public enum BANNER_SHOW_TYPE {
        NORMAL,
        INPAGE
    }

    /* loaded from: classes2.dex */
    public enum BANNER_VISIBLE_STATUS {
        FULL
    }

    public ZAdsBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, "banner");
        this.mAdsData = null;
        this.mAdsWidth = 0;
        this.mAdsHeight = 0;
        this.mAdsWaitingCount = 0;
        this.mAdsReloadCount = 0;
        this.mAdsRetryCount = 0;
        this.mAdsContentId = "";
        this.mAdsIsSchedule = false;
        this.mAdsIsDismiss = false;
        this.mAdsAutoRefresh = false;
        this.mAdsAudioAutoPlayPrefer = true;
        this.mAdsVideoAutoPlayPrefer = true;
        this.mAdsVideoSoundOnPrefer = true;
        this.mAdsBorderEnable = false;
        this.mAdsBannerActiveViewWaiting = false;
        this.mAdsBannerTrueImpWaiting = false;
        this.mAdsMediaActiveViewWaiting = false;
        this.mAdsMediaImpressionWaiting = null;
        this.mAdsPreload = false;
        this.mEnableRetry = false;
        this.mAdsHandler = null;
        this.mAdsRunnable = null;
        this.mAdsDelayTime = 10000L;
        this.mShouldPriorityLoadAd = false;
        this.mAdsImpressionTimestamp = 0L;
        this.mAdsInViewPortCurrent = false;
        this.mAdsActiveViewContinuouslyDuration = 0;
        this.mAdsActiveViewTimer = null;
        this.mTimerTask = null;
        this.mAdsTargetingData = null;
        this.mAdsContentUrl = null;
        this.mAdsTag = null;
        this.mAdsNetworkPreload = null;
        this.mAttachedBanner = null;
        this.mTempBanner = null;
        this.mAdsVastListener = null;
        this.mAdsDaastListener = null;
        this.mAdsPartnerListener = null;
        this.mAdsScheduleListener = null;
        this.mAdsLoadTag = null;
        this.mContentFilterId = null;
        this.mReportDialog = null;
        this.mDownloadTask = null;
        this.thumbBitmap = null;
        this.mStartTime = 0L;
        this.mSchedudeTime = 0L;
        this.mGetAdTime = 0L;
        this.mAdsRegisterView = null;
        this.mIsVideoCompleted = false;
        this.mIsInPageShowCompleted = false;
        this.mIsViewOnTopRegistered = false;
        this.mIsReloadWhenAutoRefresh = false;
        this.mIsAdBackup = false;
        this.mBannerType = BANNER_SHOW_TYPE.NORMAL;
        try {
            setupData();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    static /* synthetic */ int access$5308(ZAdsBanner zAdsBanner) {
        int i11 = zAdsBanner.mAdsWaitingCount;
        zAdsBanner.mAdsWaitingCount = i11 + 1;
        return i11;
    }

    static /* synthetic */ int access$5408(ZAdsBanner zAdsBanner) {
        int i11 = zAdsBanner.mAdsReloadCount;
        zAdsBanner.mAdsReloadCount = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveAction() {
        C20217u m105538N0;
        C0098c c0098c;
        String str;
        int i11;
        try {
            try {
                Object obj = this.mAdsData;
                if (obj != null && (obj instanceof C17718a)) {
                    final C17718a c17718a = (C17718a) obj;
                    String str2 = c17718a.f89802a.f505f;
                    if (str2 != null) {
                        if (str2.equals("default")) {
                            checkIfHaveClick();
                        } else {
                            if (c17718a.f89802a.f505f.equals("call")) {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = c17718a.f89802a;
                                str = this.mAdsContentId;
                                i11 = 6;
                            } else if (c17718a.f89802a.f505f.equals("chat")) {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = c17718a.f89802a;
                                str = this.mAdsContentId;
                                i11 = 5;
                            } else {
                                if (c17718a.f89802a.f505f.equals("follow")) {
                                    String str3 = c17718a.f89802a.f516k0;
                                    if (str3 == null || str3.length() == 0) {
                                        m105538N0 = C20217u.m105538N0();
                                        c0098c = c17718a.f89802a;
                                        str = this.mAdsContentId;
                                        i11 = 7;
                                    } else {
                                        C31129a c31129a = new C31129a();
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("token", c17718a.f89802a.f516k0);
                                        jSONObject.put("oaid", c17718a.f89802a.f518l0);
                                        jSONObject.put("data", c17718a.f89802a.f520m0);
                                        c31129a.m151210c(this.mAdsContext, c17718a.f89802a.f516k0, jSONObject, new C31129a.b() { // from class: com.adtima.ads.ZAdsBanner.9
                                            @Override // p699z.C31129a.b
                                            public void onCompleted(int i12, String str4, JSONObject jSONObject2) {
                                                try {
                                                    if (i12 == 0) {
                                                        C20217u.m105538N0().m105614v(c17718a.f89802a, ZAdsBanner.this.mAdsContentId);
                                                    } else {
                                                        C20217u.m105538N0().m105608p(7, c17718a.f89802a, ZAdsBanner.this.mAdsContentId);
                                                    }
                                                } catch (Exception e11) {
                                                    Adtima.m18329e(ZAdsBanner.TAG, "checkIfHaveAction", e11);
                                                }
                                            }
                                        });
                                    }
                                }
                                reportActiveView(true);
                            }
                            m105538N0.m105608p(i11, c0098c, str);
                            reportActiveView(true);
                        }
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveAction", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveActiveView() {
        try {
            try {
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveActiveView", e11);
            }
            if (this.mAdsInViewPortCurrent) {
                Object obj = this.mAdsData;
                if (obj == null || !(obj instanceof C17718a)) {
                    if (obj instanceof C0099d) {
                        this.mAdsActiveViewContinuouslyDuration += 100;
                    }
                    reportActiveView(false);
                } else {
                    C17718a c17718a = (C17718a) obj;
                    if (!c17718a.f89802a.f537v.equals("video")) {
                        if (!c17718a.f89802a.f537v.equals("rich")) {
                            if (!c17718a.f89802a.f537v.equals("endcard")) {
                                if (c17718a.f89802a.f537v.equals("audio")) {
                                }
                                this.mAdsActiveViewContinuouslyDuration += 100;
                                reportActiveView(false);
                            }
                        }
                    }
                    ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
                    if (zAdsPartnerBannerAbstract != null) {
                        if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaVideoBanner) {
                            if (((ZAdsAdtimaVideoBanner) zAdsPartnerBannerAbstract).isAdsMediaPlaying()) {
                                this.mAdsActiveViewContinuouslyDuration += 100;
                            }
                        } else if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaRichBanner) {
                            if (((ZAdsAdtimaRichBanner) zAdsPartnerBannerAbstract).isAdsMediaPlaying()) {
                                this.mAdsActiveViewContinuouslyDuration += 100;
                            }
                        } else if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaAudioBanner) {
                            if (((ZAdsAdtimaAudioBanner) zAdsPartnerBannerAbstract).isAdsMediaPlaying()) {
                                this.mAdsActiveViewContinuouslyDuration += 100;
                            }
                        }
                    }
                    reportActiveView(false);
                }
            }
            this.mAdsActiveViewContinuouslyDuration = 0;
            reportActiveView(false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveBidding(boolean z11) {
        try {
            Object obj = this.mAdsData;
            if (obj != null && (obj instanceof C0099d)) {
                C20217u.m105538N0().m105572A((C0099d) this.mAdsData, z11);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveBidding", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveClick() {
        C20217u m105538N0;
        C0098c c0098c;
        String str;
        C20217u m105538N02;
        C0098c c0098c2;
        String m125453a;
        ZAdsListener zAdsListener;
        C20217u m105538N03;
        List m125455d;
        try {
            try {
                Object obj = this.mAdsData;
                if (obj != null) {
                    int i11 = 4;
                    if (obj instanceof C17718a) {
                        C17718a c17718a = (C17718a) obj;
                        if (c17718a.f89802a.f522n0) {
                            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
                            if (zAdsPartnerBannerAbstract != null) {
                                zAdsPartnerBannerAbstract.pauseAdsPartner();
                            }
                            String str2 = c17718a.f89802a.f505f;
                            if (str2 == null || str2.length() == 0 || !c17718a.f89802a.f505f.equals("follow")) {
                                if (!c17718a.f89802a.f537v.equals("audio") && !c17718a.f89802a.f537v.equals("video") && !c17718a.f89802a.f537v.equals("rich") && !c17718a.f89802a.f537v.equals("endcard")) {
                                    String str3 = c17718a.f89802a.f512i0;
                                    if (str3 == null || str3.length() == 0) {
                                        m105538N0 = C20217u.m105538N0();
                                        c0098c = c17718a.f89802a;
                                        str = this.mAdsContentId;
                                        m105538N0.m105608p(i11, c0098c, str);
                                    } else {
                                        ZAdsListener zAdsListener2 = this.mAdsListener;
                                        C20217u.m105538N0().m105619y(c17718a.f89802a, zAdsListener2 != null ? zAdsListener2.onAdsContentHandler(c17718a.f89802a.f512i0) : false, this.mAdsContentId);
                                    }
                                }
                                String str4 = c17718a.f89802a.f512i0;
                                if (str4 == null || str4.length() == 0 || (zAdsListener = this.mAdsListener) == null || !zAdsListener.onAdsContentHandler(c17718a.f89802a.f512i0)) {
                                    if (c17718a.f89802a.f537v.equals("audio")) {
                                        if (!this.mIsAdBackup) {
                                            C20217u.m105538N0().m105596X(c17718a.f89802a.f498b0.f10199a.m114758h().m117374d(), this.mAdsContentId);
                                        }
                                        if (!c17718a.f89802a.f497b.equals("ima")) {
                                            m105538N02 = C20217u.m105538N0();
                                            c0098c2 = c17718a.f89802a;
                                            m125453a = c0098c2.f498b0.f10199a.m114758h().m117372a();
                                        }
                                    } else {
                                        if (!this.mIsAdBackup) {
                                            C20217u.m105538N0().m105596X(c17718a.f89802a.f494Z.f10200a.m123359s().m125455d(), this.mAdsContentId);
                                        }
                                        m105538N02 = C20217u.m105538N0();
                                        c0098c2 = c17718a.f89802a;
                                        m125453a = c0098c2.f494Z.f10200a.m123359s().m125453a();
                                    }
                                    m105538N02.m105616w(c0098c2, m125453a, this.mAdsContentId);
                                } else if (!this.mIsAdBackup) {
                                    if (c17718a.f89802a.f537v.equals("audio")) {
                                        m105538N03 = C20217u.m105538N0();
                                        m125455d = c17718a.f89802a.f498b0.f10199a.m114758h().m117374d();
                                    } else {
                                        m105538N03 = C20217u.m105538N0();
                                        m125455d = c17718a.f89802a.f494Z.f10200a.m123359s().m125455d();
                                    }
                                    m105538N03.m105596X(m125455d, this.mAdsContentId);
                                }
                            } else {
                                m105538N0 = C20217u.m105538N0();
                                c0098c = c17718a.f89802a;
                                str = this.mAdsContentId;
                                i11 = 7;
                                m105538N0.m105608p(i11, c0098c, str);
                            }
                        }
                        reportActiveView(true);
                    } else {
                        if (obj instanceof C0099d) {
                            C20217u.m105538N0().m105609q(4, (C0099d) obj, this.mAdsContentId);
                        } else if (obj instanceof C0098c) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = (C0098c) this.mAdsData;
                            str = this.mAdsContentId;
                            m105538N0.m105608p(i11, c0098c, str);
                        }
                        reportActiveView(true);
                    }
                }
                ZAdsListener zAdsListener3 = this.mAdsListener;
                if (zAdsListener3 != null) {
                    zAdsListener3.onAdsClicked();
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveClick", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveError(EnumC20200d enumC20200d) {
        Object obj;
        C0099d c0099d;
        String str;
        C20217u m105538N0;
        String str2;
        String str3;
        try {
            obj = this.mAdsData;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
        if (obj instanceof C17718a) {
            C17718a c17718a = (C17718a) obj;
            C0098c c0098c = c17718a.f89802a;
            if (c0098c != null && (str3 = c0098c.f472D) != null && str3.trim().length() != 0 && !c17718a.f89802a.f467A0) {
                m105538N0 = C20217u.m105538N0();
                str2 = c17718a.f89802a.f472D;
            }
        } else if ((obj instanceof C0099d) && (str = (c0099d = (C0099d) obj).f559m) != null && str.trim().length() != 0) {
            m105538N0 = C20217u.m105538N0();
            str2 = c0099d.f559m;
        }
        m105538N0.m105575G(enumC20200d, str2);
    }

    private synchronized void checkIfHaveFeedback(ArrayList<Integer> arrayList) {
        try {
            Object obj = this.mAdsData;
            if (obj != null) {
                if (obj instanceof C17718a) {
                    C20217u.m105538N0().m105618x(((C17718a) obj).f89802a, this.mAdsContentId, arrayList);
                } else if (obj instanceof C0099d) {
                    C20217u.m105538N0().m105620z((C0099d) obj, this.mAdsContentId, arrayList);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:            if (r2 != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:            if (r2 != false) goto L55;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void checkIfHaveImpression() {
        ZAdsListener zAdsListener;
        ZAdsVideoStage zAdsVideoStage;
        ZAdsListener zAdsListener2;
        ZAdsAudioStage zAdsAudioStage;
        try {
            try {
                Adtima.m18328e(TAG, "start checkIfHaveImpression");
                if (this.mAdsData != null) {
                    C20217u.m105538N0().m105587P("banner", this.mAdsZoneId, this.mAdsLoadTag);
                    Object obj = this.mAdsData;
                    boolean z11 = true;
                    if (obj instanceof C17718a) {
                        C17718a c17718a = (C17718a) obj;
                        if (!c17718a.f89802a.f537v.equals("video") && !c17718a.f89802a.f537v.equals("rich") && !c17718a.f89802a.f537v.equals("endcard") && !c17718a.f89802a.f537v.equals("audio")) {
                            C20217u.m105538N0().m105608p(1, ((C17718a) this.mAdsData).f89802a, this.mAdsContentId);
                        } else if (this.mAdsListener != null) {
                            if (c17718a.f89802a.f537v.equals("audio")) {
                                if (!c17718a.f89802a.f502d0 || !this.mAdsAudioAutoPlayPrefer) {
                                    z11 = false;
                                }
                                if (AbstractC19207b.m100800f(this.mAdsContext)) {
                                    if (z11 && AbstractC20202f.f99782J) {
                                        zAdsListener2 = this.mAdsListener;
                                        zAdsAudioStage = ZAdsAudioStage.AUTO_PLAY;
                                    }
                                    zAdsListener2 = this.mAdsListener;
                                    zAdsAudioStage = ZAdsAudioStage.CLICK_TO_PLAY;
                                }
                                zAdsListener2.onAdsAudioStage(zAdsAudioStage);
                                this.mAdsListener.onAdsAudioStage(ZAdsAudioStage.OPENED);
                            } else {
                                if (!c17718a.f89802a.f502d0 || !this.mAdsVideoAutoPlayPrefer) {
                                    z11 = false;
                                }
                                if (AbstractC19207b.m100800f(this.mAdsContext)) {
                                    if (z11 && AbstractC20202f.f99781I) {
                                        zAdsListener = this.mAdsListener;
                                        zAdsVideoStage = ZAdsVideoStage.AUTO_PLAY;
                                    }
                                    zAdsListener = this.mAdsListener;
                                    zAdsVideoStage = ZAdsVideoStage.CLICK_TO_PLAY;
                                }
                                zAdsListener.onAdsVideoStage(zAdsVideoStage);
                                this.mAdsListener.onAdsVideoStage(ZAdsVideoStage.OPENED);
                            }
                        }
                    } else if (obj instanceof C0099d) {
                        C20217u.m105538N0().m105609q(1, (C0099d) obj, this.mAdsContentId);
                    }
                    stopActiveViewTimer();
                    startActiveViewTimer();
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveImpression", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x047d, code lost:            if (r0.isAdsMediaPlaying() != false) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x048d, code lost:            if (r0.isAdsMediaPlaying() != false) goto L282;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void checkIfHaveInViewPort() {
        boolean localVisibleRect;
        int i11;
        ZAdsIMAAudioBanner zAdsIMAAudioBanner;
        ZAdsAdtimaAudioBanner zAdsAdtimaAudioBanner;
        ZAdsAdtimaEndCardBanner zAdsAdtimaEndCardBanner;
        String str;
        String str2;
        ZAdsAdtimaRichBanner zAdsAdtimaRichBanner;
        String str3;
        String str4;
        ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner;
        String str5;
        String str6;
        List<String> list;
        int height;
        int height2;
        try {
            Rect rect = new Rect();
            View view = this.mAdsRegisterView;
            if (view == null || !this.mIsViewOnTopRegistered) {
                localVisibleRect = getLocalVisibleRect(rect);
                double width = rect.width() * rect.height();
                double width2 = getWidth() * getHeight();
                if (width2 > 0.0d) {
                    i11 = (int) ((width * 100.0d) / width2);
                }
                i11 = 0;
            } else {
                localVisibleRect = view.getLocalVisibleRect(rect);
                if (this.mAdsHeight > 0) {
                    height = rect.height() * 100;
                    height2 = this.mAdsHeight;
                } else {
                    if (this.mAdsRegisterView.getHeight() > 0) {
                        height = rect.height() * 100;
                        height2 = this.mAdsRegisterView.getHeight();
                    }
                    i11 = 0;
                }
                i11 = height / height2;
            }
            if (localVisibleRect && i11 > 0) {
                checkIfHaveTrueImpression();
            }
            if (!localVisibleRect || i11 < 50) {
                this.mAdsInViewPortCurrent = false;
                this.mAdsActiveViewContinuouslyDuration = 0;
                if (this.mAdsRegisterView == null || !this.mIsViewOnTopRegistered) {
                    ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
                    if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) zAdsPartnerBannerAbstract;
                        if (zAdsAdtimaVideoBanner.isAdsMediaPlaying()) {
                            str5 = TAG;
                            str6 = "pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str5, str6);
                            zAdsAdtimaVideoBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) zAdsPartnerBannerAbstract;
                        if (zAdsAdtimaRichBanner.isAdsMediaPlaying()) {
                            str3 = TAG;
                            str4 = "pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str3, str4);
                            zAdsAdtimaRichBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaEndCardBanner) {
                        zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) zAdsPartnerBannerAbstract;
                        if (zAdsAdtimaEndCardBanner.isAdsMediaPlaying()) {
                            str = TAG;
                            str2 = "pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str, str2);
                            zAdsAdtimaEndCardBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract instanceof ZAdsAdtimaAudioBanner) {
                        zAdsAdtimaAudioBanner = (ZAdsAdtimaAudioBanner) zAdsPartnerBannerAbstract;
                    } else if (zAdsPartnerBannerAbstract instanceof ZAdsIMAAudioBanner) {
                        zAdsIMAAudioBanner = (ZAdsIMAAudioBanner) zAdsPartnerBannerAbstract;
                    }
                } else if (i11 <= 10) {
                    ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract2 = this.mAttachedBanner;
                    if (zAdsPartnerBannerAbstract2 instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) zAdsPartnerBannerAbstract2;
                        if (zAdsAdtimaVideoBanner.isAdsMediaPlaying()) {
                            str5 = TAG;
                            str6 = "-pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str5, str6);
                            zAdsAdtimaVideoBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract2 instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) zAdsPartnerBannerAbstract2;
                        if (zAdsAdtimaRichBanner.isAdsMediaPlaying()) {
                            str3 = TAG;
                            str4 = "-pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str3, str4);
                            zAdsAdtimaRichBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract2 instanceof ZAdsAdtimaEndCardBanner) {
                        zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) zAdsPartnerBannerAbstract2;
                        if (zAdsAdtimaEndCardBanner.isAdsMediaPlaying()) {
                            str = TAG;
                            str2 = "-pauseVideo " + this.mAdsZoneId;
                            Adtima.m18328e(str, str2);
                            zAdsAdtimaEndCardBanner.pauseVideo();
                        }
                    } else if (zAdsPartnerBannerAbstract2 instanceof ZAdsAdtimaAudioBanner) {
                        zAdsAdtimaAudioBanner = (ZAdsAdtimaAudioBanner) zAdsPartnerBannerAbstract2;
                        if (zAdsAdtimaAudioBanner.isAdsMediaPlaying()) {
                            zAdsAdtimaAudioBanner.pauseAudio();
                        }
                    } else if (zAdsPartnerBannerAbstract2 instanceof ZAdsIMAAudioBanner) {
                        zAdsIMAAudioBanner = (ZAdsIMAAudioBanner) zAdsPartnerBannerAbstract2;
                        if (zAdsIMAAudioBanner.isAdsMediaPlaying()) {
                            zAdsIMAAudioBanner.pauseAudio();
                        }
                    }
                }
            } else {
                this.mAdsInViewPortCurrent = true;
                if (this.mAdsRegisterView != null && i11 >= 99 && !this.mIsInPageShowCompleted) {
                    this.mIsInPageShowCompleted = true;
                    ZAdsListener zAdsListener = this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onBannerAdsVisible(BANNER_VISIBLE_STATUS.FULL);
                    }
                }
                if (this.mAdsMediaActiveViewWaiting && (list = this.mAdsMediaImpressionWaiting) != null && list.size() != 0) {
                    if (!this.mIsAdBackup) {
                        C20217u.m105538N0().m105596X(this.mAdsMediaImpressionWaiting, this.mAdsContentId);
                    }
                    this.mAdsMediaActiveViewWaiting = false;
                    ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract3 = this.mAttachedBanner;
                    if (zAdsPartnerBannerAbstract3 instanceof ZAdsAdtimaVideoBanner) {
                        Object obj = this.mAdsData;
                        if (obj instanceof C17718a) {
                            C17718a c17718a = (C17718a) obj;
                            ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner2 = (ZAdsAdtimaVideoBanner) zAdsPartnerBannerAbstract3;
                            if (!zAdsAdtimaVideoBanner2.isAdsMediaPlaying() && c17718a.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "playVideo " + this.mAdsZoneId);
                                ZAdsListener zAdsListener2 = this.mAdsListener;
                                if (zAdsListener2 != null) {
                                    zAdsAdtimaVideoBanner2.setSoundFocus(zAdsListener2.onAdsRequestAudioFocus());
                                }
                                zAdsAdtimaVideoBanner2.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract3 instanceof ZAdsAdtimaRichBanner) {
                        Object obj2 = this.mAdsData;
                        if (obj2 instanceof C17718a) {
                            C17718a c17718a2 = (C17718a) obj2;
                            ZAdsAdtimaRichBanner zAdsAdtimaRichBanner2 = (ZAdsAdtimaRichBanner) zAdsPartnerBannerAbstract3;
                            if (!zAdsAdtimaRichBanner2.isAdsMediaPlaying() && c17718a2.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "playVideo " + this.mAdsZoneId);
                                ZAdsListener zAdsListener3 = this.mAdsListener;
                                if (zAdsListener3 != null) {
                                    zAdsAdtimaRichBanner2.setSoundFocus(zAdsListener3.onAdsRequestAudioFocus());
                                }
                                zAdsAdtimaRichBanner2.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract3 instanceof ZAdsAdtimaEndCardBanner) {
                        Object obj3 = this.mAdsData;
                        if (obj3 instanceof C17718a) {
                            C17718a c17718a3 = (C17718a) obj3;
                            ZAdsAdtimaEndCardBanner zAdsAdtimaEndCardBanner2 = (ZAdsAdtimaEndCardBanner) zAdsPartnerBannerAbstract3;
                            if (!zAdsAdtimaEndCardBanner2.isAdsMediaPlaying() && c17718a3.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "playVideo " + this.mAdsZoneId);
                                ZAdsListener zAdsListener4 = this.mAdsListener;
                                if (zAdsListener4 != null) {
                                    zAdsAdtimaEndCardBanner2.setSoundFocus(zAdsListener4.onAdsRequestAudioFocus());
                                }
                                zAdsAdtimaEndCardBanner2.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract3 instanceof ZAdsAdtimaAudioBanner) {
                        Object obj4 = this.mAdsData;
                        if (obj4 instanceof C17718a) {
                            C17718a c17718a4 = (C17718a) obj4;
                            ZAdsAdtimaAudioBanner zAdsAdtimaAudioBanner2 = (ZAdsAdtimaAudioBanner) zAdsPartnerBannerAbstract3;
                            zAdsAdtimaAudioBanner2.displayedAdsPartner();
                            if (!zAdsAdtimaAudioBanner2.isAdsMediaPlaying() && c17718a4.f89802a.f502d0 && this.mAdsAudioAutoPlayPrefer && (AbstractC20202f.f99782J || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                zAdsAdtimaAudioBanner2.playAudio();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract3 instanceof ZAdsIMAAudioBanner) {
                        Object obj5 = this.mAdsData;
                        if (obj5 instanceof C17718a) {
                            C17718a c17718a5 = (C17718a) obj5;
                            ZAdsIMAAudioBanner zAdsIMAAudioBanner2 = (ZAdsIMAAudioBanner) zAdsPartnerBannerAbstract3;
                            zAdsIMAAudioBanner2.displayedAdsPartner();
                            if (!zAdsIMAAudioBanner2.isAdsMediaPlaying() && c17718a5.f89802a.f502d0 && this.mAdsAudioAutoPlayPrefer && (AbstractC20202f.f99782J || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                zAdsIMAAudioBanner2.playAudio();
                            }
                        }
                    }
                }
                if (this.mAdsRegisterView != null && this.mIsViewOnTopRegistered) {
                    ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract4 = this.mAttachedBanner;
                    if (zAdsPartnerBannerAbstract4 instanceof ZAdsAdtimaVideoBanner) {
                        Object obj6 = this.mAdsData;
                        if (obj6 instanceof C17718a) {
                            C17718a c17718a6 = (C17718a) obj6;
                            ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner3 = (ZAdsAdtimaVideoBanner) zAdsPartnerBannerAbstract4;
                            if (!zAdsAdtimaVideoBanner3.isAdsMediaPlaying() && c17718a6.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && !this.mIsVideoCompleted && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "-playVideo " + this.mAdsZoneId);
                                zAdsAdtimaVideoBanner3.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract4 instanceof ZAdsAdtimaRichBanner) {
                        Object obj7 = this.mAdsData;
                        if (obj7 instanceof C17718a) {
                            C17718a c17718a7 = (C17718a) obj7;
                            ZAdsAdtimaRichBanner zAdsAdtimaRichBanner3 = (ZAdsAdtimaRichBanner) zAdsPartnerBannerAbstract4;
                            if (!zAdsAdtimaRichBanner3.isAdsMediaPlaying() && c17718a7.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "-playVideo " + this.mAdsZoneId);
                                zAdsAdtimaRichBanner3.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract4 instanceof ZAdsAdtimaEndCardBanner) {
                        Object obj8 = this.mAdsData;
                        if (obj8 instanceof C17718a) {
                            C17718a c17718a8 = (C17718a) obj8;
                            ZAdsAdtimaEndCardBanner zAdsAdtimaEndCardBanner3 = (ZAdsAdtimaEndCardBanner) zAdsPartnerBannerAbstract4;
                            if (!zAdsAdtimaEndCardBanner3.isAdsMediaPlaying() && c17718a8.f89802a.f502d0 && this.mAdsVideoAutoPlayPrefer && (AbstractC20202f.f99781I || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                Adtima.m18328e(TAG, "-playVideo " + this.mAdsZoneId);
                                zAdsAdtimaEndCardBanner3.playVideo();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract4 instanceof ZAdsAdtimaAudioBanner) {
                        Object obj9 = this.mAdsData;
                        if (obj9 instanceof C17718a) {
                            C17718a c17718a9 = (C17718a) obj9;
                            ZAdsAdtimaAudioBanner zAdsAdtimaAudioBanner3 = (ZAdsAdtimaAudioBanner) zAdsPartnerBannerAbstract4;
                            zAdsAdtimaAudioBanner3.displayedAdsPartner();
                            if (!zAdsAdtimaAudioBanner3.isAdsMediaPlaying() && c17718a9.f89802a.f502d0 && this.mAdsAudioAutoPlayPrefer && (AbstractC20202f.f99782J || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                zAdsAdtimaAudioBanner3.playAudio();
                            }
                        }
                    }
                    if (zAdsPartnerBannerAbstract4 instanceof ZAdsIMAAudioBanner) {
                        Object obj10 = this.mAdsData;
                        if (obj10 instanceof C17718a) {
                            C17718a c17718a10 = (C17718a) obj10;
                            ZAdsIMAAudioBanner zAdsIMAAudioBanner3 = (ZAdsIMAAudioBanner) zAdsPartnerBannerAbstract4;
                            zAdsIMAAudioBanner3.displayedAdsPartner();
                            if (!zAdsIMAAudioBanner3.isAdsMediaPlaying() && c17718a10.f89802a.f502d0 && this.mAdsAudioAutoPlayPrefer && (AbstractC20202f.f99782J || !AbstractC19207b.m100800f(this.mAdsContext))) {
                                zAdsIMAAudioBanner3.playAudio();
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveInViewPort", e11);
        } finally {
        }
    }

    private synchronized void checkIfHaveInventory() {
        try {
            C20217u.m105538N0().m105595W(this.mAdsZoneId, this.mAdsIsLoaded);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveRequest() {
        C20217u m105538N0;
        C0098c c0098c;
        try {
            try {
                Object obj = this.mAdsData;
                if (obj != null) {
                    if (obj instanceof C17718a) {
                        m105538N0 = C20217u.m105538N0();
                        c0098c = ((C17718a) this.mAdsData).f89802a;
                    } else if (obj instanceof C0099d) {
                        C20217u.m105538N0().m105609q(0, (C0099d) this.mAdsData, this.mAdsContentId);
                    } else if (obj instanceof C0098c) {
                        m105538N0 = C20217u.m105538N0();
                        c0098c = (C0098c) this.mAdsData;
                    }
                    m105538N0.m105608p(0, c0098c, this.mAdsContentId);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveRequest", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveTracking(int i11) {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105615v0(i11, ((C17718a) this.mAdsData).f89802a, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveTracking", e11);
        }
    }

    private synchronized void checkIfHaveTrueImpression() {
        try {
            try {
                Object obj = this.mAdsData;
                if (obj != null && this.mAdsBannerTrueImpWaiting) {
                    this.mAdsBannerTrueImpWaiting = false;
                    if (obj instanceof C17718a) {
                        C20217u.m105538N0().m105608p(8, ((C17718a) this.mAdsData).f89802a, this.mAdsContentId);
                    } else if (obj instanceof C0099d) {
                        C20217u.m105538N0().m105609q(8, (C0099d) this.mAdsData, this.mAdsContentId);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "sendTrackingTrueImpression", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean checkIfMediaIsPlaying() {
        boolean z11;
        ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract;
        try {
            try {
                zAdsPartnerBannerAbstract = this.mAttachedBanner;
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfMediaIsPlaying", e11);
            }
            if (!(zAdsPartnerBannerAbstract instanceof ZAdsAdtimaVideoBanner)) {
                if (!(zAdsPartnerBannerAbstract instanceof ZAdsAdtimaRichBanner)) {
                    if (!(zAdsPartnerBannerAbstract instanceof ZAdsAdtimaEndCardBanner)) {
                        if (!(zAdsPartnerBannerAbstract instanceof ZAdsAdtimaAudioBanner)) {
                            if (zAdsPartnerBannerAbstract instanceof ZAdsIMAAudioBanner) {
                            }
                            z11 = false;
                        }
                    }
                }
            }
            if (zAdsPartnerBannerAbstract.isAdsMediaPlaying()) {
                z11 = true;
            } else {
                zAdsPartnerBannerAbstract.destroyAdsPartner();
                this.mAdsMediaImpressionWaiting = null;
                z11 = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean checkIfNeedRetryOrForceReset(boolean z11) {
        int i11;
        boolean z12;
        if (!z11) {
            try {
                if ((this.mEnableRetry || this.mAdsAutoRefresh) && (i11 = this.mAdsRetryCount) != AbstractC20202f.f99809f) {
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
            this.mAdsIsSchedule = false;
            this.mAdsIsLoaded = false;
            this.mAdsRetryCount = 0;
            C20221y.m105659d().m105660b(this.mAdsZoneId, this.mAdsLoadTag);
            Handler handler = this.mAdsHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.mAdsHandler = null;
            this.mAdsScheduleListener = null;
            this.mAdsListener = null;
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
            if (zAdsPartnerBannerAbstract != null) {
                zAdsPartnerBannerAbstract.destroyAdsPartner();
                this.mAttachedBanner = null;
            }
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract2 = this.mTempBanner;
            if (zAdsPartnerBannerAbstract2 != null) {
                zAdsPartnerBannerAbstract2.destroyAdsPartner();
                this.mTempBanner = null;
            }
            C20217u.m105538N0().m105573D(this.mAdsBannerSize, this.mAdsZoneId);
            removeAllViews();
            stopActiveViewTimer();
            if (AbstractC19211f.m100806a(16)) {
                getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            this.mAdsContext = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanUp", e11);
        }
    }

    private void doDownloadImageTask(final String str, final ImageView imageView) {
        try {
            AbstractRunnableC0008c abstractRunnableC0008c = new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsBanner.14
                @Override // p001a.p005d.AbstractRunnableC0008c
                public Void doInBackground() {
                    try {
                        String str2 = str;
                        if (str2 == null || str2.length() == 0) {
                            return null;
                        }
                        ZAdsBanner.this.thumbBitmap = C20208l.m105404b().m105406a(str);
                        return null;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "doInBackground", e11);
                        return null;
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(Void r32) {
                    try {
                        if (ZAdsBanner.this.thumbBitmap != null) {
                            imageView.setImageBitmap(ZAdsBanner.this.thumbBitmap);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onPostExecute", e11);
                    }
                }
            };
            this.mDownloadTask = abstractRunnableC0008c;
            C0009d.m11g(abstractRunnableC0008c);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "doDownloadImageTask", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String genReportUrl(int i11) {
        try {
            return AbstractC20206j.m105393i() + "fbLandingId=" + i11 + "&bannerId=" + ((C17718a) this.mAdsData).f89802a.f495a + "&deviceId=" + C20217u.m105538N0().m105579J0() + "&platformid=1&zoneId=" + this.mAdsZoneId + "&useragent=" + Build.MODEL.replace(" ", "_") + "," + Build.VERSION.SDK_INT + "," + AbstractC19207b.m100799e(this.mAdsContext) + ",android," + Adtima.SDK_VERSION_CODE + "," + C20215s.m105509k().m105518m().f460a + "," + C19206a.m100793b().m100794a();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "genReportUrl", e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdsBundle(List<C0099d> list) {
        try {
            ZAdsNetworkBundle.prepare(this.mAdsContext, this.mAdsZoneId, this.mAdsBannerSize, this.mAdsWidth, this.mAdsHeight, this.mAdsVideoSoundOnPrefer, this.mAdsContentId, this.mAdsContentUrl, this.mAdsTargetingData).loadAdsBundle(list, new ZAdsNetworkBundle.onAdsBundleListener() { // from class: com.adtima.ads.ZAdsBanner.6
                @Override // com.adtima.ads.partner.network.ZAdsNetworkBundle.onAdsBundleListener
                public void onResult(Map.Entry<C0099d, ZAdsPartnerBannerAbstract> entry) {
                    if (entry != null) {
                        try {
                            ZAdsBanner.this.mAdsData = entry.getKey();
                            ZAdsBanner.this.mTempBanner = entry.getValue();
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsBanner.TAG, "handleAdsPreload", e11);
                            return;
                        }
                    }
                    if (ZAdsBanner.this.mAdsData == null || ZAdsBanner.this.mTempBanner == null) {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, "nil", false);
                        ZAdsBanner.this.scheduleRightNow();
                        return;
                    }
                    ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                    if (ZAdsBanner.this.mAdsPartnerListener != null) {
                        ZAdsBanner.this.mAdsPartnerListener.onLoaded(ZAdsBanner.this.mAdsData);
                        ZAdsBanner.this.mAdsPartnerListener.onImpression();
                        if (ZAdsBanner.this.mAdsData instanceof C0099d) {
                            ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ((C0099d) ZAdsBanner.this.mAdsData).f553g, true);
                        }
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "handleAdsPreload", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdsPreload(final List<C0099d> list) {
        try {
            this.mAdsNetworkPreload.serveAdsPreload(list, new ZAdsNetworksPreload.OnAdsPreloadListener() { // from class: com.adtima.ads.ZAdsBanner.5
                @Override // com.adtima.ads.partner.network.ZAdsNetworksPreload.OnAdsPreloadListener
                public void onResult(Map.Entry<C0099d, ZAdsPartnerBannerAbstract> entry) {
                    if (entry != null) {
                        try {
                            ZAdsBanner.this.mAdsData = entry.getKey();
                            ZAdsBanner.this.mTempBanner = entry.getValue();
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsBanner.TAG, "handleAdsPreload", e11);
                            return;
                        }
                    }
                    if (ZAdsBanner.this.mAdsData == null || ZAdsBanner.this.mTempBanner == null) {
                        ZAdsBanner.this.handleAdsBundle(list);
                        return;
                    }
                    ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                    if (ZAdsBanner.this.mAdsPartnerListener != null) {
                        ZAdsBanner.this.mAdsPartnerListener.onLoaded(ZAdsBanner.this.mAdsData);
                        ZAdsBanner.this.mAdsPartnerListener.onImpression();
                        if (ZAdsBanner.this.mAdsData instanceof C0099d) {
                            ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ((C0099d) ZAdsBanner.this.mAdsData).f553g, true);
                        }
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "handleAdsPreload", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND ads_load_kind) {
        try {
            ZAdsListener zAdsListener = this.mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsLoadFinished(ads_load_kind);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "hitCallbackWithKind", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initThanksView(int i11) {
        TextView textView;
        String str;
        try {
            removeAllViews();
            View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__thanks_layout, (ViewGroup) null);
            if (i11 == 2) {
                inflate.findViewById(AbstractC3874e.zad__img_thanks).setBackgroundResource(AbstractC3873d.zad__ic_thanks_report);
                textView = (TextView) inflate.findViewById(AbstractC3874e.zad__text_thanks);
                str = "Cảm ơn bạn đã gửi báo cáo";
            } else {
                inflate.findViewById(AbstractC3874e.zad__img_thanks).setBackgroundResource(AbstractC3873d.zad__ic_thanks_hide);
                textView = (TextView) inflate.findViewById(AbstractC3874e.zad__text_thanks);
                str = "Đã ẩn quảng cáo";
            }
            textView.setText(str);
            int i12 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
            if (this.mAttachedBanner.getWidth() > 0 && this.mAttachedBanner.getHeight() > 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mAttachedBanner.getWidth(), this.mAttachedBanner.getHeight());
            }
            addView(inflate, layoutParams);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initThanksView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeAdsInBanner() {
        try {
            try {
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "removeAdsInBanner", e11);
            }
            if (this.mAdsData == null) {
                return;
            }
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
            if (zAdsPartnerBannerAbstract != null) {
                zAdsPartnerBannerAbstract.destroyAdsPartner();
                this.mAttachedBanner = null;
            }
            removeAllViews();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportActiveView(boolean z11) {
        int currentTimeMillis = ((int) (System.currentTimeMillis() - this.mAdsImpressionTimestamp)) % 180000;
        Object obj = this.mAdsData;
        if (obj != null) {
            if (obj instanceof C17718a) {
                C17718a c17718a = (C17718a) obj;
                if (c17718a.f89802a.f537v.equals("video") || c17718a.f89802a.f537v.equals("rich") || c17718a.f89802a.f537v.equals("endcard") || c17718a.f89802a.f537v.equals("audio")) {
                    if (!this.mAdsBannerActiveViewWaiting) {
                        return;
                    }
                    if (this.mAdsActiveViewContinuouslyDuration < 2000 && !z11) {
                        return;
                    }
                    Adtima.m18328e(TAG, "Have active view of video: " + this.mAdsActiveViewContinuouslyDuration);
                } else {
                    if (!this.mAdsBannerActiveViewWaiting) {
                        return;
                    }
                    if (this.mAdsActiveViewContinuouslyDuration < 1000 && !z11) {
                        return;
                    }
                    Adtima.m18328e(TAG, "Have active view of banner: " + this.mAdsActiveViewContinuouslyDuration);
                    C20217u.m105538N0().m105601h0(currentTimeMillis, ((C17718a) this.mAdsData).f89802a, this.mAdsContentId);
                }
            } else {
                if (!(obj instanceof C0099d) || !this.mAdsBannerActiveViewWaiting) {
                    return;
                }
                if (this.mAdsActiveViewContinuouslyDuration < 1000 && !z11) {
                    return;
                }
                Adtima.m18328e(TAG, "Have active view of network: " + this.mAdsActiveViewContinuouslyDuration);
                C20217u.m105538N0().m105602i0(currentTimeMillis, (C0099d) this.mAdsData, this.mAdsContentId);
            }
            this.mAdsBannerActiveViewWaiting = false;
            stopActiveViewTimer();
        }
    }

    private void scheduleAfterMillis(long j11) {
        try {
            this.mGetAdTime = System.currentTimeMillis() - this.mStartTime;
            this.mSchedudeTime = System.currentTimeMillis();
            try {
                Handler handler = this.mAdsHandler;
                if (handler == null) {
                    this.mAdsHandler = new Handler();
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "scheduleAfterMillis", e11);
            }
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.ZAdsBanner.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsBanner.this.checkIfMediaIsPlaying()) {
                            ZAdsBanner.this.scheduleNextTime();
                            return;
                        }
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16382p(System.currentTimeMillis());
                        }
                        C20217u m105538N0 = C20217u.m105538N0();
                        ZAdsBanner zAdsBanner = ZAdsBanner.this;
                        m105538N0.m105574E(zAdsBanner.mAdsBannerSize, zAdsBanner.mAdsZoneId, zAdsBanner.mAdsLoadTag, ZAdsBanner.this.mAdsContentId, ZAdsBanner.this.mAdsPreload, ZAdsBanner.this.mAdsScheduleListener, ZAdsBanner.this.mShouldPriorityLoadAd);
                    } catch (Exception e12) {
                        Adtima.m18329e(ZAdsBanner.TAG, "scheduleAfterMillis", e12);
                    }
                }
            };
            this.mAdsRunnable = runnable;
            this.mAdsHandler.postDelayed(runnable, j11);
        } catch (Exception e12) {
            Adtima.m18329e(TAG, "scheduleAfterMillis", e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleNextTime() {
        try {
            this.mIsReloadWhenAutoRefresh = true;
            scheduleAfterMillis(this.mAdsDelayTime);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleNextTime", e11);
        }
    }

    private void scheduleOnResume() {
        try {
            scheduleAfterMillis(AbstractC20202f.f99827o);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleOnResume", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRightNow() {
        try {
            scheduleAfterMillis(0L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "scheduleRightNow", e11);
        }
    }

    private void setupData() {
        setGravity(17);
        this.mAdsHandler = new Handler();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        this.mAdsPartnerListener = new ZAdsPartnerViewListener() { // from class: com.adtima.ads.ZAdsBanner.1
            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onAction() {
                super.onAction();
                Adtima.m18326d(ZAdsBanner.TAG, "onAction");
                try {
                    ZAdsBanner.this.checkIfHaveAction();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onClicked", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onAdNetworkBib(String str) {
                super.onAdNetworkBib(str);
                Adtima.m18326d(ZAdsBanner.TAG, "onAdNetworkBib");
                try {
                    if (ZAdsBanner.this.mAdsData == null || !(ZAdsBanner.this.mAdsData instanceof C0099d) || str == null || str.trim().length() == 0) {
                        return;
                    }
                    ((C0099d) ZAdsBanner.this.mAdsData).f571y = str;
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdNetworkBib", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClicked() {
                super.onClicked();
                Adtima.m18326d(ZAdsBanner.TAG, "onClicked");
                try {
                    ZAdsBanner.this.checkIfHaveClick();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onClicked", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClickedAdsProgrammatic() {
                super.onClickedAdsProgrammatic();
                Adtima.m18326d(ZAdsBanner.TAG, "onClickedHTML");
                try {
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsClicked();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onClicked", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onClosed() {
                super.onClosed();
                Adtima.m18326d(ZAdsBanner.TAG, "onClosed");
                try {
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsClosed();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onClosed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onFailed(Object obj, EnumC20200d enumC20200d) {
                super.onFailed(obj, enumC20200d);
                Adtima.m18326d(ZAdsBanner.TAG, "onFailed");
                try {
                    if (enumC20200d == EnumC20200d.AD_WEBVIEW_ERROR) {
                        ZAdsBanner.this.mAdsListener.onAdsLoadFailed(-3);
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, false);
                        Adtima.m18326d(ZAdsBanner.TAG, "onFailed and call schedule next");
                        ZAdsBanner.this.scheduleRightNow();
                        ZAdsBanner.this.checkIfHaveError(enumC20200d);
                    }
                } catch (Exception e11) {
                    Adtima.m18327d(ZAdsBanner.TAG, "onFailed", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onImpression() {
                try {
                    super.onImpression();
                    Adtima.m18326d(ZAdsBanner.TAG, "onImpression");
                    ZAdsBanner.this.mAdsBannerActiveViewWaiting = true;
                    ZAdsBanner.this.mAdsBannerTrueImpWaiting = true;
                    ZAdsBanner.this.checkIfHaveInViewPort();
                    ZAdsBanner.this.checkIfHaveImpression();
                } catch (Exception e11) {
                    Adtima.m18327d(ZAdsBanner.TAG, "onImpression", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onInteracted() {
                super.onInteracted();
                Adtima.m18326d(ZAdsBanner.TAG, "onInteracted");
                try {
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsInteracted();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onInteracted", e11);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:            r7 = r6.this$0;     */
            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onLoaded(Object obj) {
                ZAdsBanner zAdsBanner;
                ZAdsListener.ADS_LOAD_KIND ads_load_kind;
                super.onLoaded(obj);
                Adtima.m18328e(ZAdsBanner.TAG, "onLoaded");
                try {
                    boolean z11 = true;
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, true);
                    ZAdsBanner.this.checkIfNeedRetryOrForceReset(true);
                    ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                    zAdsBanner2.mAdsIsLoaded = true;
                    if (zAdsBanner2.mAdsListener != null) {
                        zAdsBanner2.showDebugLog();
                        ZAdsBanner.this.mAdsListener.onAdsLoadFinished();
                        ZAdsBanner.this.checkIfHaveBidding(true);
                        if (obj != null) {
                            if (obj instanceof C17718a) {
                                String str = ((C17718a) obj).f89802a.f537v;
                                String str2 = ((C17718a) obj).f89802a.f505f;
                                if (!str2.equals("shake") && !str2.equals("swipeleft") && !str2.equals("swiperight") && !str2.equals("swipeup")) {
                                    z11 = false;
                                }
                                if (!str.equals("graphic") && !str.equals("native")) {
                                    if (str.equals("html")) {
                                        if (((C17718a) obj).f89802a.f469B0.equals("programmatic")) {
                                            zAdsBanner = ZAdsBanner.this;
                                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.PROGRAMMATIC;
                                        } else if (!z11 || ((C17718a) obj).f89802a.f524o0) {
                                            zAdsBanner = ZAdsBanner.this;
                                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.HTML;
                                        } else {
                                            zAdsBanner = ZAdsBanner.this;
                                            ads_load_kind = ZAdsListener.ADS_LOAD_KIND.INTERACTIVE;
                                        }
                                        zAdsBanner.hitCallbackWithKind(ads_load_kind);
                                    }
                                }
                                zAdsBanner = ZAdsBanner.this;
                                ads_load_kind = ZAdsListener.ADS_LOAD_KIND.BANNER;
                                zAdsBanner.hitCallbackWithKind(ads_load_kind);
                            } else if (obj instanceof C0099d) {
                                zAdsBanner = ZAdsBanner.this;
                                ads_load_kind = ZAdsListener.ADS_LOAD_KIND.BANNER;
                                zAdsBanner.hitCallbackWithKind(ads_load_kind);
                            }
                        }
                    }
                    ZAdsBanner.this.removeAdsInBanner();
                    ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                    zAdsBanner3.mAttachedBanner = zAdsBanner3.mTempBanner;
                    ZAdsBanner zAdsBanner4 = ZAdsBanner.this;
                    zAdsBanner4.addAdsToBanner(zAdsBanner4.mAttachedBanner, null);
                    ZAdsBanner zAdsBanner5 = ZAdsBanner.this;
                    zAdsBanner5.setupStoke(zAdsBanner5.mAdsBorderEnable);
                    if (ZAdsBanner.this.mAdsAutoRefresh) {
                        ZAdsBanner.this.scheduleNextTime();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onLoaded", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onNext() {
                super.onNext();
                Adtima.m18328e(ZAdsBanner.TAG, "onNext");
                try {
                    if (ZAdsBanner.this.mAdsAutoRefresh) {
                        ZAdsBanner.this.scheduleRightNow();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onLoaded", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onReport() {
                super.onReport();
                Adtima.m18326d(ZAdsBanner.TAG, "onReport");
                try {
                    ZAdsBanner.this.showReportDialog();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onReport", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onSkipped() {
                super.onSkipped();
                try {
                    ZAdsBanner zAdsBanner = ZAdsBanner.this;
                    if (zAdsBanner.mAdsListener != null && zAdsBanner.mAttachedBanner != null) {
                        if (!(ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) && !(ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) && !(ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner)) {
                            if (!(ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner)) {
                                if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsIMAAudioBanner) {
                                }
                            }
                            ZAdsBanner.this.mAdsListener.onAdsAudioStage(ZAdsAudioStage.SKIPPED);
                        }
                        ZAdsBanner.this.mAdsListener.onAdsVideoStage(ZAdsVideoStage.SKIPPED);
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                            ((ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(7);
                        } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                            ((ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(7);
                        } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            ((ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(7);
                        }
                    }
                    ZAdsBanner.this.scheduleRightNow();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onLoaded", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsPartnerViewListener
            public void onTracking(int i11) {
                super.onTracking(i11);
                try {
                    ZAdsBanner.this.checkIfHaveTracking(i11);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onTracking", e11);
                }
            }
        };
        this.mAdsVastListener = new InterfaceC19747i() { // from class: com.adtima.ads.ZAdsBanner.2
            @Override // p196h3.InterfaceC19747i
            public void onVastClick(String str, List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onVastClick");
                if (list != null) {
                    try {
                        if (list.size() != 0 && !ZAdsBanner.this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onVastClick", e11);
                        return;
                    }
                }
                if (str != null && str.length() != 0) {
                    if (ZAdsBanner.this.mAdsData instanceof C17718a) {
                        C20217u.m105538N0().m105616w(((C17718a) ZAdsBanner.this.mAdsData).f89802a, str, ZAdsBanner.this.mAdsContentId);
                    } else {
                        C20217u.m105538N0().m105583M(str, ZAdsBanner.this.mAdsContentId);
                    }
                }
                ZAdsBanner.this.reportActiveView(true);
            }

            @Override // p196h3.InterfaceC19747i
            public void onVastError(String str, List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onVastError");
                try {
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, false);
                    Adtima.m18326d(ZAdsBanner.TAG, "onVastError and call schedule next");
                    ZAdsBanner.this.scheduleRightNow();
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsVideoStage(ZAdsVideoStage.ERROR);
                    }
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    C20217u.m105538N0().m105594V(str, list);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onVastError", e11);
                }
            }

            @Override // p196h3.InterfaceC19747i
            public void onVastEvent(EnumC23496b enumC23496b, List<String> list) {
                int i11;
                ZAdsAdtimaEndCardBanner zAdsAdtimaEndCardBanner;
                ZAdsAdtimaRichBanner zAdsAdtimaRichBanner;
                ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner;
                Adtima.m18326d(ZAdsBanner.TAG, "onVastEvent: " + enumC23496b);
                if (list != null) {
                    try {
                        if (list.size() != 0 && !ZAdsBanner.this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onVastEvent", e11);
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.start) {
                    ZAdsBanner.this.mIsVideoCompleted = false;
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsVideoStage(ZAdsVideoStage.STARTED);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        ((ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoStarted();
                        return;
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        ((ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoStarted();
                        return;
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            ((ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoStarted();
                            return;
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.pause) {
                    ZAdsListener zAdsListener2 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener2 != null) {
                        zAdsListener2.onAdsVideoStage(ZAdsVideoStage.PAUSED);
                    }
                    i11 = 5;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.resume) {
                    ZAdsListener zAdsListener3 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener3 != null) {
                        zAdsListener3.onAdsVideoStage(ZAdsVideoStage.RESUMED);
                    }
                    i11 = 6;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.complete) {
                    ZAdsBanner.this.mIsVideoCompleted = true;
                    ZAdsListener zAdsListener4 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener4 != null) {
                        zAdsListener4.onAdsVideoStage(ZAdsVideoStage.COMPLETED);
                    }
                    i11 = 4;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.close) {
                    ZAdsListener zAdsListener5 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener5 != null) {
                        zAdsListener5.onAdsVideoStage(ZAdsVideoStage.CLOSED);
                        return;
                    }
                    return;
                }
                if (enumC23496b == EnumC23496b.firstQuartile) {
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        ((ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(1);
                        return;
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        ((ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(1);
                        return;
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            ((ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner).trackOMVideoEvent(1);
                            return;
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.midpoint) {
                    i11 = 2;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.thirdQuartile) {
                    i11 = 3;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.mute) {
                    ZAdsListener zAdsListener6 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener6 != null) {
                        zAdsListener6.onAdsVideoStage(ZAdsVideoStage.MUTE);
                    }
                    i11 = 8;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else {
                        if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                            zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                            zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                        }
                        return;
                    }
                }
                if (enumC23496b == EnumC23496b.unmute) {
                    ZAdsListener zAdsListener7 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener7 != null) {
                        zAdsListener7.onAdsVideoStage(ZAdsVideoStage.UNMUTE);
                    }
                    i11 = 9;
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        zAdsAdtimaVideoBanner = (ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaVideoBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        zAdsAdtimaRichBanner = (ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaRichBanner.trackOMVideoEvent(i11);
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                        zAdsAdtimaEndCardBanner = (ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner;
                        zAdsAdtimaEndCardBanner.trackOMVideoEvent(i11);
                    }
                }
            }

            @Override // p196h3.InterfaceC19747i
            public void onVastImpression(List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onVastImpression");
                if (list != null) {
                    try {
                        if (list.size() == 0 || ZAdsBanner.this.mIsAdBackup) {
                            return;
                        }
                        C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onVastImpression", e11);
                    }
                }
            }

            @Override // p196h3.InterfaceC19747i
            public void onVastLoadFinished(C23498d c23498d) {
                Adtima.m18326d(ZAdsBanner.TAG, "onVastLoadFinished");
                try {
                    if (c23498d == null) {
                        Adtima.m18326d(ZAdsBanner.TAG, "onVastLoadFinished but invalid, call schedule next");
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, false);
                        ZAdsBanner.this.scheduleRightNow();
                        return;
                    }
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, true);
                    ZAdsBanner.this.checkIfNeedRetryOrForceReset(true);
                    ZAdsBanner zAdsBanner = ZAdsBanner.this;
                    zAdsBanner.mAdsIsLoaded = true;
                    if (zAdsBanner.mAdsListener != null) {
                        zAdsBanner.showDebugLog();
                        ZAdsBanner.this.mAdsListener.onAdsLoadFinished();
                        ZAdsBanner.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.VIDEO);
                    }
                    ZAdsBanner.this.removeAdsInBanner();
                    ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                    zAdsBanner2.mAttachedBanner = zAdsBanner2.mTempBanner;
                    ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                    zAdsBanner3.addAdsToBanner(zAdsBanner3.mAttachedBanner, null);
                    ZAdsBanner zAdsBanner4 = ZAdsBanner.this;
                    zAdsBanner4.setupStoke(zAdsBanner4.mAdsBorderEnable);
                    ZAdsBanner.this.mAdsMediaImpressionWaiting = c23498d.m123356p();
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaRichBanner) {
                        ((ZAdsAdtimaRichBanner) ZAdsBanner.this.mAttachedBanner).startOMVideoSession(((C17718a) ZAdsBanner.this.mAdsData).f89802a.f494Z.f10200a.m123341a());
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaVideoBanner) {
                        ((ZAdsAdtimaVideoBanner) ZAdsBanner.this.mAttachedBanner).startOMVideoSession(((C17718a) ZAdsBanner.this.mAdsData).f89802a.f494Z.f10200a.m123341a());
                    } else if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaEndCardBanner) {
                        ((ZAdsAdtimaEndCardBanner) ZAdsBanner.this.mAttachedBanner).startOMVideoSession(((C17718a) ZAdsBanner.this.mAdsData).f89802a.f494Z.f10200a.m123341a());
                    }
                    ZAdsBanner.this.mAdsBannerActiveViewWaiting = true;
                    ZAdsBanner.this.mAdsMediaActiveViewWaiting = true;
                    ZAdsBanner.this.mAdsBannerTrueImpWaiting = true;
                    ZAdsBanner.this.checkIfHaveInViewPort();
                    ZAdsBanner.this.checkIfHaveImpression();
                    if (ZAdsBanner.this.mAdsAutoRefresh) {
                        ZAdsBanner.this.scheduleNextTime();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onVastLoadFinished", e11);
                }
            }
        };
        this.mAdsDaastListener = new ZAdsAudioPartnerListener() { // from class: com.adtima.ads.ZAdsBanner.3
            @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
            public void onAudioClick(String str, List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onAudioClick");
                if (list != null) {
                    try {
                        if (list.size() != 0 && !ZAdsBanner.this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onAudioClick", e11);
                        return;
                    }
                }
                if (str != null && str.length() != 0) {
                    if (ZAdsBanner.this.mAdsData instanceof C17718a) {
                        C20217u.m105538N0().m105616w(((C17718a) ZAdsBanner.this.mAdsData).f89802a, str, ZAdsBanner.this.mAdsContentId);
                    } else {
                        C20217u.m105538N0().m105583M(str, ZAdsBanner.this.mAdsContentId);
                    }
                }
                ZAdsBanner.this.reportActiveView(true);
            }

            @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
            public void onAudioError(String str, List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onAudioError");
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAudioError and call schedule next");
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, false);
                    ZAdsBanner.this.scheduleRightNow();
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsAudioStage(ZAdsAudioStage.ERROR);
                    }
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    C20217u.m105538N0().m105594V(str, list);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAudioError", e11);
                }
            }

            @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
            public void onAudioEvent(EnumC21975c enumC21975c, List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onAudioEvent: " + enumC21975c);
                if (list != null) {
                    try {
                        if (list.size() != 0 && !ZAdsBanner.this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onVastEvent", e11);
                        return;
                    }
                }
                if (enumC21975c == EnumC21975c.start) {
                    ZAdsListener zAdsListener = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsAudioStage(ZAdsAudioStage.STARTED);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioStarted();
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.pause) {
                    ZAdsListener zAdsListener2 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener2 != null) {
                        zAdsListener2.onAdsAudioStage(ZAdsAudioStage.PAUSED);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(5);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.resume) {
                    ZAdsListener zAdsListener3 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener3 != null) {
                        zAdsListener3.onAdsAudioStage(ZAdsAudioStage.RESUMED);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(6);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.complete) {
                    ZAdsListener zAdsListener4 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener4 != null) {
                        zAdsListener4.onAdsAudioStage(ZAdsAudioStage.COMPLETED);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(4);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.close) {
                    ZAdsListener zAdsListener5 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener5 != null) {
                        zAdsListener5.onAdsAudioStage(ZAdsAudioStage.CLOSED);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.firstQuartile) {
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(1);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.midpoint) {
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(2);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.thirdQuartile) {
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(3);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.mute) {
                    ZAdsListener zAdsListener6 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener6 != null) {
                        zAdsListener6.onAdsAudioStage(ZAdsAudioStage.MUTE);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(8);
                        return;
                    }
                    return;
                }
                if (enumC21975c == EnumC21975c.unmute) {
                    ZAdsListener zAdsListener7 = ZAdsBanner.this.mAdsListener;
                    if (zAdsListener7 != null) {
                        zAdsListener7.onAdsAudioStage(ZAdsAudioStage.UNMUTE);
                    }
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).trackOMAudioEvent(9);
                    }
                }
            }

            @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
            public void onAudioImpression(List<String> list) {
                Adtima.m18326d(ZAdsBanner.TAG, "onAudioImpression");
                if (list != null) {
                    try {
                        if (list.size() == 0 || ZAdsBanner.this.mIsAdBackup) {
                            return;
                        }
                        C20217u.m105538N0().m105596X(list, ZAdsBanner.this.mAdsContentId);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onAudioImpression", e11);
                    }
                }
            }

            @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
            public void onAudioReady(C21976d c21976d) {
                Adtima.m18326d(ZAdsBanner.TAG, "onAudioReady");
                try {
                    if (c21976d == null) {
                        Adtima.m18326d(ZAdsBanner.TAG, "onAudioReady but invalid, call schedule next");
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, false);
                        ZAdsBanner.this.scheduleRightNow();
                        return;
                    }
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105471b(ZAdsBanner.this.mQoSEntity, ZAdsBanner.this.mAdsKind, true);
                    ZAdsBanner.this.checkIfNeedRetryOrForceReset(true);
                    ZAdsBanner zAdsBanner = ZAdsBanner.this;
                    zAdsBanner.mAdsIsLoaded = true;
                    if (zAdsBanner.mAdsListener != null) {
                        zAdsBanner.showDebugLog();
                        ZAdsBanner.this.mAdsListener.onAdsLoadFinished();
                        ZAdsBanner.this.hitCallbackWithKind(ZAdsListener.ADS_LOAD_KIND.AUDIO);
                    }
                    ZAdsBanner.this.removeAdsInBanner();
                    ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                    zAdsBanner2.mAttachedBanner = zAdsBanner2.mTempBanner;
                    ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                    zAdsBanner3.addAdsToBanner(zAdsBanner3.mAttachedBanner, null);
                    ZAdsBanner zAdsBanner4 = ZAdsBanner.this;
                    zAdsBanner4.setupStoke(zAdsBanner4.mAdsBorderEnable);
                    ZAdsBanner.this.mAdsMediaImpressionWaiting = c21976d.m114771u();
                    if (ZAdsBanner.this.mAttachedBanner instanceof ZAdsAdtimaAudioBanner) {
                        ((ZAdsAdtimaAudioBanner) ZAdsBanner.this.mAttachedBanner).startOMAudioSession(((C17718a) ZAdsBanner.this.mAdsData).f89802a.f498b0.f10199a.m114751a());
                    }
                    ZAdsBanner.this.mAdsBannerActiveViewWaiting = true;
                    ZAdsBanner.this.mAdsMediaActiveViewWaiting = true;
                    ZAdsBanner.this.mAdsBannerTrueImpWaiting = true;
                    ZAdsBanner.this.checkIfHaveInViewPort();
                    ZAdsBanner.this.checkIfHaveImpression();
                    if (ZAdsBanner.this.mAdsAutoRefresh) {
                        ZAdsBanner.this.scheduleNextTime();
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAudioReady", e11);
                }
            }
        };
        this.mAdsScheduleListener = new InterfaceC19740b() { // from class: com.adtima.ads.ZAdsBanner.4
            @Override // p196h3.InterfaceC19740b
            public void onAdtimaAudioBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaAudioBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaAudioBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.setAdsDaastListener(ZAdsBanner.this.mAdsDaastListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaVideoBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onAdtimaBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaNativeBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a, ZAdsBanner.this.mIsReloadWhenAutoRefresh);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onAdtimaEndCardBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        boolean z11 = !c17718a.f89802a.f500c0 && ZAdsBanner.this.mAdsVideoSoundOnPrefer;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaEndCardBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a, z11);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.setAdsVastListener(ZAdsBanner.this.mAdsVastListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaEndCardBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onAdtimaHtmlBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaHtmlBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaHtmlBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a, ZAdsBanner.this.mIsReloadWhenAutoRefresh);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaHtmlBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onAdtimaRichBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaRichBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        boolean z11 = !c17718a.f89802a.f500c0 && ZAdsBanner.this.mAdsVideoSoundOnPrefer;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaRichBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a, z11);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.setAdsVastListener(ZAdsBanner.this.mAdsVastListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaRichBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onAdtimaVideoBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaVideoBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        boolean z11 = !c17718a.f89802a.f500c0 && ZAdsBanner.this.mAdsVideoSoundOnPrefer;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsAdtimaVideoBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a, z11);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.setAdsVastListener(ZAdsBanner.this.mAdsVastListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaVideoBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onEmptyAdsToShow() {
                ZAdsBanner zAdsBanner;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaEmptyAdsToShow");
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, false);
                    if (ZAdsBanner.this.mShouldPriorityLoadAd) {
                        if (!ZAdsBanner.this.checkIfNeedRetryOrForceReset(false)) {
                            return;
                        } else {
                            zAdsBanner = ZAdsBanner.this;
                        }
                    } else {
                        if (ZAdsBanner.this.mContentFilterId != null && ZAdsBanner.this.mContentFilterId.trim().length() != 0) {
                            ZAdsBanner.this.checkIfNeedRetryOrForceReset(true);
                            ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                            if (zAdsBanner2.mAdsListener != null) {
                                zAdsBanner2.showDebugLog();
                                ZAdsBanner.this.mAdsListener.onAdsLoadFailed(-4);
                                return;
                            }
                            return;
                        }
                        if (!ZAdsBanner.this.mAdsIsSchedule) {
                            return;
                        }
                        Adtima.m18326d(ZAdsBanner.TAG, "onAdtimaEmptyAdsToShow call load request");
                        if (!ZAdsBanner.this.checkIfNeedRetryOrForceReset(false)) {
                            ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                            if (zAdsBanner3.mAdsListener != null) {
                                zAdsBanner3.showDebugLog();
                                ZAdsBanner.this.mAdsListener.onAdsLoadFailed(-4);
                                return;
                            }
                            return;
                        }
                        ZAdsBanner.this.mAdsIsSchedule = false;
                        Adtima.m18326d(ZAdsBanner.TAG, "Empty ad or null, try to load next");
                        zAdsBanner = ZAdsBanner.this;
                    }
                    zAdsBanner.loadAdsWhenRetry(zAdsBanner.mAdsLoadTag);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaEmptyAdsToShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onIMAAudioBannerShow(C17718a c17718a) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onIMAAudioBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else if (c17718a == null) {
                        InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g != null) {
                            interfaceC19745g.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                        ZAdsBanner.this.mAdsKind = c17718a.f89802a.f537v;
                        ZAdsBanner.this.mIsAdBackup = c17718a.f89802a.f467A0;
                        if (ZAdsBanner.this.mQoSEntity != null) {
                            ZAdsBanner.this.mQoSEntity.m16369c(c17718a.f89802a.f495a);
                        }
                        if (!Adtima.isDebuggable()) {
                            ZAdsBanner.this.mAdsDelayTime = c17718a.f89802a.f539w;
                        }
                        ZAdsBanner.this.mAdsData = c17718a;
                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                        zAdsBanner2.mTempBanner = new ZAdsIMAAudioBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, c17718a);
                        ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                        ZAdsBanner.this.mTempBanner.setAdsDaastListener(ZAdsBanner.this.mAdsDaastListener);
                        ZAdsBanner.this.mTempBanner.loadAdsPartner();
                        ZAdsBanner.this.checkIfHaveRequest();
                        return;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onAdtimaVideoBannerShow", e11);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:3:0x0002, B:5:0x0022, B:6:0x002e, B:7:0x0155, B:12:0x003a, B:14:0x003e, B:17:0x0046, B:19:0x0062, B:20:0x0074, B:22:0x007a, B:23:0x0081, B:31:0x00af, B:33:0x00b5, B:34:0x0120, B:36:0x00b9, B:38:0x00bd, B:40:0x00c5, B:41:0x00f0, B:42:0x00f4, B:43:0x0097, B:46:0x00a0, B:49:0x013e, B:51:0x0144, B:52:0x0147), top: B:2:0x0002 }] */
            @Override // p196h3.InterfaceC19740b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onNetworkBannerShow(C0099d c0099d) {
                ZAdsBanner zAdsBanner;
                C20212p m105468m;
                C3228a c3228a;
                String str;
                String str2;
                ZAdsBanner zAdsBanner2;
                ZAdsPartnerBannerAbstract zAdsGoogleGraphicBanner;
                try {
                    Adtima.m18326d(ZAdsBanner.TAG, "onNetworkBannerShow");
                    ZAdsBanner.this.mSchedudeTime = System.currentTimeMillis() - ZAdsBanner.this.mSchedudeTime;
                    char c11 = 0;
                    if (!ZAdsBanner.this.mAdsIsSchedule) {
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    } else {
                        if (c0099d != null && (str = c0099d.f550d) != null && str.length() != 0) {
                            ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                            if (ZAdsBanner.this.mQoSEntity != null) {
                                ZAdsBanner.this.mAdsKind = c0099d.f553g;
                                ZAdsBanner.this.mQoSEntity.m16369c(c0099d.f547a);
                            }
                            if (!Adtima.isDebuggable()) {
                                ZAdsBanner.this.mAdsDelayTime = c0099d.f551e;
                            }
                            ZAdsBanner.this.mAdsData = c0099d;
                            String str3 = c0099d.f548b;
                            int hashCode = str3.hashCode();
                            if (hashCode == 99374) {
                                if (str3.equals("dfp")) {
                                    c11 = 1;
                                    if (c11 != 0) {
                                    }
                                    str2 = c0099d.f553g;
                                    if (str2 == null) {
                                    }
                                    zAdsBanner2 = ZAdsBanner.this;
                                    ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                                    zAdsGoogleGraphicBanner = new ZAdsGoogleGraphicBanner(zAdsBanner3.mAdsContext, zAdsBanner3.mAdsBannerSize, zAdsBanner3.mAdsWidth, ZAdsBanner.this.mAdsHeight, ZAdsBanner.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsBanner.this.mAdsContentUrl, ZAdsBanner.this.mAdsTargetingData);
                                    zAdsBanner2.mTempBanner = zAdsGoogleGraphicBanner;
                                    ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                                    ZAdsBanner.this.mTempBanner.loadAdsPartner();
                                    ZAdsBanner.this.checkIfHaveRequest();
                                    return;
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                                str2 = c0099d.f553g;
                                if (str2 == null) {
                                }
                                zAdsBanner2 = ZAdsBanner.this;
                                ZAdsBanner zAdsBanner32 = ZAdsBanner.this;
                                zAdsGoogleGraphicBanner = new ZAdsGoogleGraphicBanner(zAdsBanner32.mAdsContext, zAdsBanner32.mAdsBannerSize, zAdsBanner32.mAdsWidth, ZAdsBanner.this.mAdsHeight, ZAdsBanner.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsBanner.this.mAdsContentUrl, ZAdsBanner.this.mAdsTargetingData);
                                zAdsBanner2.mTempBanner = zAdsGoogleGraphicBanner;
                                ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                                ZAdsBanner.this.mTempBanner.loadAdsPartner();
                                ZAdsBanner.this.checkIfHaveRequest();
                                return;
                            }
                            if (hashCode == 92668925 && str3.equals("admob")) {
                                if (c11 != 0 || c11 == 1) {
                                    str2 = c0099d.f553g;
                                    if (str2 == null && str2.equals("native")) {
                                        zAdsBanner2 = ZAdsBanner.this;
                                        ZAdsBanner zAdsBanner4 = ZAdsBanner.this;
                                        zAdsGoogleGraphicBanner = new ZAdsGoogleNativeBanner(zAdsBanner4.mAdsContext, zAdsBanner4.mAdsBannerSize, zAdsBanner4.mAdsWidth, ZAdsBanner.this.mAdsHeight, ZAdsBanner.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsBanner.this.mAdsContentUrl, ZAdsBanner.this.mAdsTargetingData);
                                    } else {
                                        zAdsBanner2 = ZAdsBanner.this;
                                        ZAdsBanner zAdsBanner322 = ZAdsBanner.this;
                                        zAdsGoogleGraphicBanner = new ZAdsGoogleGraphicBanner(zAdsBanner322.mAdsContext, zAdsBanner322.mAdsBannerSize, zAdsBanner322.mAdsWidth, ZAdsBanner.this.mAdsHeight, ZAdsBanner.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsBanner.this.mAdsContentUrl, ZAdsBanner.this.mAdsTargetingData);
                                    }
                                    zAdsBanner2.mTempBanner = zAdsGoogleGraphicBanner;
                                } else {
                                    InterfaceC19745g interfaceC19745g = ZAdsBanner.this.mAdsLoadListener;
                                    if (interfaceC19745g != null) {
                                        interfaceC19745g.onAdsLoadFailed(-3);
                                    }
                                }
                                ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                                ZAdsBanner.this.mTempBanner.loadAdsPartner();
                                ZAdsBanner.this.checkIfHaveRequest();
                                return;
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            str2 = c0099d.f553g;
                            if (str2 == null) {
                            }
                            zAdsBanner2 = ZAdsBanner.this;
                            ZAdsBanner zAdsBanner3222 = ZAdsBanner.this;
                            zAdsGoogleGraphicBanner = new ZAdsGoogleGraphicBanner(zAdsBanner3222.mAdsContext, zAdsBanner3222.mAdsBannerSize, zAdsBanner3222.mAdsWidth, ZAdsBanner.this.mAdsHeight, ZAdsBanner.this.mAdsVideoSoundOnPrefer, c0099d, ZAdsBanner.this.mAdsContentUrl, ZAdsBanner.this.mAdsTargetingData);
                            zAdsBanner2.mTempBanner = zAdsGoogleGraphicBanner;
                            ZAdsBanner.this.mTempBanner.setAdsPartnerListener(ZAdsBanner.this.mAdsPartnerListener);
                            ZAdsBanner.this.mTempBanner.loadAdsPartner();
                            ZAdsBanner.this.checkIfHaveRequest();
                            return;
                        }
                        InterfaceC19745g interfaceC19745g2 = ZAdsBanner.this.mAdsLoadListener;
                        if (interfaceC19745g2 != null) {
                            interfaceC19745g2.onAdsLoadFailed(-3);
                        }
                        zAdsBanner = ZAdsBanner.this;
                        m105468m = C20212p.m105468m();
                        c3228a = ZAdsBanner.this.mQoSEntity;
                    }
                    zAdsBanner.mQoSEntity = m105468m.m105472c(c3228a, false);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onNetworkBannerShow", e11);
                }
            }

            @Override // p196h3.InterfaceC19740b
            public void onNetworkBannerShow(List<C0099d> list) {
                try {
                    ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105472c(ZAdsBanner.this.mQoSEntity, true);
                    if (ZAdsBanner.this.mAdsNetworkPreload == null || !ZAdsBanner.this.mAdsNetworkPreload.checkAdsPreload()) {
                        ZAdsBanner.this.handleAdsBundle(list);
                    } else {
                        ZAdsBanner.this.handleAdsPreload(list);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsBanner.TAG, "onNetworkBannerShow", e11);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void setupStoke(boolean z11) {
        if (z11) {
            try {
                setPadding(1, 1, 1, 1);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(0);
                gradientDrawable.setStroke(2, Color.parseColor("#d9d9d9"));
                setBackground(gradientDrawable);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "setupStoke", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDebugLog() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
            String str = this.mAdsZoneId + " => getAds : " + this.mGetAdTime + "ms - Schedule: " + this.mSchedudeTime + "ms - LoadParner: " + ((currentTimeMillis - this.mGetAdTime) - this.mSchedudeTime) + "ms - Total : " + currentTimeMillis + "ms";
            Adtima.m18328e(TAG, "ADTIMA-LOG : " + str);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showDebugLog", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showReportDialog() {
        try {
            Activity m114902c = AbstractC22011d.m114902c();
            View inflate = LayoutInflater.from(m114902c).inflate(AbstractC3875f.zad__report_dialog, (ViewGroup) null);
            View findViewById = inflate.findViewById(AbstractC3874e.zad__ad_details);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC3874e.zad__img_ad_details);
            Object obj = this.mAdsData;
            if (obj instanceof C17718a) {
                String str = ((C17718a) obj).f89802a.f499c;
                if (!TextUtils.isEmpty(str)) {
                    findViewById.setVisibility(0);
                    doDownloadImageTask(((C17718a) this.mAdsData).f89802a.f519m, imageView);
                    ((TextView) inflate.findViewById(AbstractC3874e.zad__desc_ad_details)).setText(str);
                }
            }
            Dialog dialog = new Dialog(m114902c);
            this.mReportDialog = dialog;
            dialog.setContentView(inflate);
            inflate.findViewById(AbstractC3874e.zad__rp_close).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsBanner.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsBanner.this.mReportDialog == null || !ZAdsBanner.this.mReportDialog.isShowing()) {
                            return;
                        }
                        ZAdsBanner.this.mReportDialog.dismiss();
                    } catch (Exception e11) {
                        Adtima.m18328e(ZAdsBanner.TAG, e11.toString());
                    }
                }
            });
            inflate.findViewById(AbstractC3874e.zad__hide_btn).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsBanner.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsBanner.this.mReportDialog != null && ZAdsBanner.this.mReportDialog.isShowing()) {
                            ZAdsBanner.this.mReportDialog.dismiss();
                        }
                        ZAdsBanner.this.initThanksView(2);
                        ZAdsBanner zAdsBanner = ZAdsBanner.this;
                        zAdsBanner.startLandingPage(zAdsBanner.genReportUrl(2));
                    } catch (Exception e11) {
                        Adtima.m18328e(ZAdsBanner.TAG, e11.toString());
                    }
                }
            });
            inflate.findViewById(AbstractC3874e.zad__report_btn).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsBanner.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsBanner.this.mReportDialog != null && ZAdsBanner.this.mReportDialog.isShowing()) {
                            ZAdsBanner.this.mReportDialog.dismiss();
                        }
                        ZAdsBanner.this.initThanksView(3);
                        ZAdsBanner zAdsBanner = ZAdsBanner.this;
                        zAdsBanner.startLandingPage(zAdsBanner.genReportUrl(3));
                    } catch (Exception e11) {
                        Adtima.m18328e(ZAdsBanner.TAG, e11.toString());
                    }
                }
            });
            if (this.mReportDialog.getWindow() != null) {
                this.mReportDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            this.mReportDialog.setCancelable(true);
            this.mReportDialog.setCanceledOnTouchOutside(true);
            this.mReportDialog.show();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showReportDialog", e11);
        }
    }

    private void startActiveViewTimer() {
        try {
            this.mAdsActiveViewContinuouslyDuration = 0;
            this.mAdsImpressionTimestamp = System.currentTimeMillis();
            this.mAdsActiveViewTimer = new Timer();
            TimerTask timerTask = new TimerTask() { // from class: com.adtima.ads.ZAdsBanner.10
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        ZAdsBanner.this.checkIfHaveActiveView();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "startActiveViewTimer", e11);
                    }
                }
            };
            this.mTimerTask = timerTask;
            this.mAdsActiveViewTimer.scheduleAtFixedRate(timerTask, 100L, 100L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startActiveViewTimer", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLandingPage(String str) {
        try {
            Adtima.m18328e(TAG, "startLandingPage: " + str);
            Intent intent = new Intent(this.mAdsContext, (Class<?>) ZAdsLanding.class);
            intent.putExtra("adsLanding", str);
            intent.putExtra("openReport", true);
            intent.putExtra("zaloForm", AbstractC22011d.m114919t(str));
            intent.setFlags(268435456);
            this.mAdsContext.startActivity(intent);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startLandingPage", e11);
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
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "addAdsTargeting", e11);
        }
    }

    public void dismiss() {
        try {
            this.mAdsIsDismiss = true;
            this.mAdsIsSchedule = false;
            this.mAdsIsLoaded = false;
            this.mAdsData = null;
            cleanUp();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "dismissAds", e11);
        }
    }

    public synchronized void feedbackAds(ArrayList<Integer> arrayList) {
        try {
            checkIfHaveFeedback(arrayList);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "feedbackAds", e11);
        }
    }

    public boolean getAdsAutoRefresh() {
        return this.mAdsAutoRefresh;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:            r0 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getAdsId() {
        String str;
        Object obj;
        try {
            obj = this.mAdsData;
        } catch (Exception unused) {
            str = null;
        }
        if (obj instanceof C17718a) {
            str = ((C17718a) obj).f89802a.f495a;
        } else {
            if (obj instanceof C0099d) {
                str = ((C0099d) obj).f547a;
            }
            str = null;
        }
        return str;
    }

    public String getAdsMetaData() {
        try {
            Object obj = this.mAdsData;
            if (obj != null && (obj instanceof C0098c)) {
                return ((C0098c) obj).f514j0;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public ZAdsBannerSize getAdsSize() {
        return this.mAdsBannerSize;
    }

    public Object getAdsTag() {
        return this.mAdsTag;
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

    public void initAdsSize(int i11, int i12) {
        this.mAdsWidth = i11;
        this.mAdsHeight = i12;
    }

    public boolean isAdsAudioAutoPlayPrefer() {
        return this.mAdsAudioAutoPlayPrefer;
    }

    public boolean isAdsBorderEnable() {
        return this.mAdsBorderEnable;
    }

    @Override // com.adtima.ads.ZAdsView
    public /* bridge */ /* synthetic */ boolean isAdsLoaded() {
        return super.isAdsLoaded();
    }

    public boolean isAdsPreload() {
        return this.mAdsPreload;
    }

    public boolean isAdsRetryIfLoadFail() {
        return this.mEnableRetry;
    }

    public boolean isAdsVideoAutoPlayPrefer() {
        return this.mAdsVideoAutoPlayPrefer;
    }

    public boolean isAdsVideoSoundOnPrefer() {
        return this.mAdsVideoSoundOnPrefer;
    }

    public void loadAds() {
        loadAds(null);
    }

    public void loadAdsWhenRetry(String str) {
        loadAds(str, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            checkIfHaveInViewPort();
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onDestroy() {
        Adtima.m18326d(TAG, "onDestroy");
        try {
            cleanUp();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onDestroy", e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        try {
            checkIfHaveInViewPort();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:5:0x0009, B:8:0x0014, B:10:0x0020, B:12:0x0026, B:13:0x0068, B:14:0x0029, B:16:0x002d, B:17:0x0031, B:18:0x0034, B:20:0x0038, B:21:0x003f, B:23:0x0043, B:24:0x0048, B:26:0x004c, B:27:0x0053, B:29:0x0057, B:31:0x005f, B:32:0x0064, B:33:0x006a, B:37:0x0010), top: B:2:0x0003 }] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int height;
        int i13;
        super.onMeasure(i11, i12);
        try {
            if (getParent() != null) {
                if (this.mAdsWidth > 0) {
                }
                this.mAdsWidth = View.MeasureSpec.getSize(i11);
                if (getParent() != null) {
                    ZAdsBannerSize zAdsBannerSize = this.mAdsBannerSize;
                    if (zAdsBannerSize == ZAdsBannerSize.R11_RECTANGLE) {
                        height = this.mAdsWidth;
                    } else {
                        if (zAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                            i13 = this.mAdsWidth * 100;
                        } else if (zAdsBannerSize == ZAdsBannerSize.R169_RECTANGLE) {
                            height = (this.mAdsWidth * 9) / 16;
                        } else if (zAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE) {
                            i13 = this.mAdsWidth * 250;
                        } else if (zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                            height = (this.mAdsWidth * ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE) / 400;
                        } else if (zAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                            View view = (View) getParent();
                            height = view != null ? view.getHeight() : View.MeasureSpec.getSize(i12);
                        }
                        height = i13 / 300;
                    }
                    this.mAdsHeight = height;
                }
                setMeasuredDimension(this.mAdsWidth, this.mAdsHeight);
            }
            if (this.mAdsHeight > 0) {
                return;
            }
            this.mAdsWidth = View.MeasureSpec.getSize(i11);
            if (getParent() != null) {
            }
            setMeasuredDimension(this.mAdsWidth, this.mAdsHeight);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onMeasure", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onPause() {
        Adtima.m18326d(TAG, "onPause");
        try {
            this.mAdsIsSchedule = false;
            Handler handler = this.mAdsHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
            if (zAdsPartnerBannerAbstract != null) {
                ZAdsListener zAdsListener = this.mAdsListener;
                if (zAdsListener != null) {
                    zAdsPartnerBannerAbstract.setSoundFocus(zAdsListener.onAdsRequestAudioFocus());
                }
                this.mAttachedBanner.pauseAdsPartner();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onPause", e11);
        }
    }

    @Override // com.adtima.ads.ZAdsInterface
    public void onResume() {
        Adtima.m18326d(TAG, "onResume");
        try {
            if (this.mAdsIsDismiss) {
                return;
            }
            if (this.mAdsAutoRefresh && ((!this.mAdsIsSchedule) & this.mAdsIsLoaded)) {
                this.mIsReloadWhenAutoRefresh = true;
                this.mAdsIsSchedule = true;
                scheduleOnResume();
            }
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
            if (zAdsPartnerBannerAbstract != null) {
                ZAdsListener zAdsListener = this.mAdsListener;
                if (zAdsListener != null) {
                    zAdsPartnerBannerAbstract.setSoundFocus(zAdsListener.onAdsRequestAudioFocus());
                }
                this.mAttachedBanner.resumeAdsPartner();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onResume", e11);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        try {
            checkIfHaveInViewPort();
        } catch (Exception unused) {
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
            Adtima.m18329e(TAG, "onStart", e11);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        try {
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
            stopActiveViewTimer();
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this);
        } catch (Exception unused) {
        }
    }

    public void refresh() {
        try {
            if (this.mAdsIsSchedule) {
                scheduleRightNow();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "refresh", e11);
        }
    }

    public void registerAdViewOnTop(View view) {
        try {
            this.mIsViewOnTopRegistered = true;
            this.mAdsRegisterView = view;
            view.addOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = this.mAdsRegisterView.getViewTreeObserver();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        } catch (Exception unused) {
        }
    }

    public void requestDisappear() {
        try {
            ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
            if (zAdsPartnerBannerAbstract != null) {
                zAdsPartnerBannerAbstract.destroyAdsPartner();
                this.mAttachedBanner = null;
            }
            removeAllViews();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "dismissAds", e11);
        }
    }

    public void setAdsAudioAutoPlayPrefer(boolean z11) {
        this.mAdsAudioAutoPlayPrefer = z11;
    }

    public void setAdsAutoRefresh(boolean z11) {
        this.mAdsAutoRefresh = z11;
    }

    @Override // com.adtima.ads.ZAdsView
    public /* bridge */ /* synthetic */ void setAdsBackgroundColor(int i11) {
        super.setAdsBackgroundColor(i11);
    }

    public void setAdsBorderEnable(boolean z11) {
        this.mAdsBorderEnable = z11;
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

    @Override // com.adtima.ads.ZAdsView
    public /* bridge */ /* synthetic */ void setAdsListener(ZAdsListener zAdsListener) {
        super.setAdsListener(zAdsListener);
    }

    public void setAdsPreload(boolean z11) {
        this.mAdsPreload = z11;
    }

    public void setAdsRetryIfLoadFail(boolean z11) {
        try {
            this.mEnableRetry = z11;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setEnableRetry", e11);
        }
    }

    public void setAdsSize(ZAdsBannerSize zAdsBannerSize) {
        this.mAdsBannerSize = zAdsBannerSize;
    }

    public void setAdsTag(Object obj) {
        this.mAdsTag = obj;
    }

    public void setAdsTargeting(Bundle bundle) {
        this.mAdsTargetingData = bundle;
    }

    @Override // com.adtima.ads.ZAdsView
    public /* bridge */ /* synthetic */ void setAdsTransitAnim(boolean z11) {
        super.setAdsTransitAnim(z11);
    }

    public void setAdsVideoAutoPlayPrefer(boolean z11) {
        this.mAdsVideoAutoPlayPrefer = z11;
    }

    public void setAdsVideoSoundOnPrefer(boolean z11) {
        this.mAdsVideoSoundOnPrefer = z11;
    }

    public void setAdsZoneId(String str) {
        this.mAdsZoneId = str;
    }

    public void setShouldPriorityLoad(boolean z11) {
        try {
            this.mShouldPriorityLoadAd = z11;
            Adtima.SharedContext = getContext().getApplicationContext();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setShouldPriorityLoad", e11);
        }
    }

    public boolean shouldPriorityLoadAd() {
        return this.mShouldPriorityLoadAd;
    }

    public void show() {
        try {
            if (AbstractC19207b.m100801g(this.mAdsContext)) {
                setVisibility(0);
                checkIfHaveInViewPort();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "show", e11);
        }
    }

    public void unregisterAdViewOnTop() {
        try {
            View view = this.mAdsRegisterView;
            if (view != null) {
                this.mIsViewOnTopRegistered = false;
                view.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = this.mAdsRegisterView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    viewTreeObserver.removeOnScrollChangedListener(this);
                }
                ZAdsPartnerBannerAbstract zAdsPartnerBannerAbstract = this.mAttachedBanner;
                if (zAdsPartnerBannerAbstract != null) {
                    zAdsPartnerBannerAbstract.pauseAdsPartner();
                }
            }
        } catch (Exception unused) {
        }
    }

    public ZAdsBanner(Context context, String str) {
        super(context, str, "banner");
        this.mAdsData = null;
        this.mAdsWidth = 0;
        this.mAdsHeight = 0;
        this.mAdsWaitingCount = 0;
        this.mAdsReloadCount = 0;
        this.mAdsRetryCount = 0;
        this.mAdsContentId = "";
        this.mAdsIsSchedule = false;
        this.mAdsIsDismiss = false;
        this.mAdsAutoRefresh = false;
        this.mAdsAudioAutoPlayPrefer = true;
        this.mAdsVideoAutoPlayPrefer = true;
        this.mAdsVideoSoundOnPrefer = true;
        this.mAdsBorderEnable = false;
        this.mAdsBannerActiveViewWaiting = false;
        this.mAdsBannerTrueImpWaiting = false;
        this.mAdsMediaActiveViewWaiting = false;
        this.mAdsMediaImpressionWaiting = null;
        this.mAdsPreload = false;
        this.mEnableRetry = false;
        this.mAdsHandler = null;
        this.mAdsRunnable = null;
        this.mAdsDelayTime = 10000L;
        this.mShouldPriorityLoadAd = false;
        this.mAdsImpressionTimestamp = 0L;
        this.mAdsInViewPortCurrent = false;
        this.mAdsActiveViewContinuouslyDuration = 0;
        this.mAdsActiveViewTimer = null;
        this.mTimerTask = null;
        this.mAdsTargetingData = null;
        this.mAdsContentUrl = null;
        this.mAdsTag = null;
        this.mAdsNetworkPreload = null;
        this.mAttachedBanner = null;
        this.mTempBanner = null;
        this.mAdsVastListener = null;
        this.mAdsDaastListener = null;
        this.mAdsPartnerListener = null;
        this.mAdsScheduleListener = null;
        this.mAdsLoadTag = null;
        this.mContentFilterId = null;
        this.mReportDialog = null;
        this.mDownloadTask = null;
        this.thumbBitmap = null;
        this.mStartTime = 0L;
        this.mSchedudeTime = 0L;
        this.mGetAdTime = 0L;
        this.mAdsRegisterView = null;
        this.mIsVideoCompleted = false;
        this.mIsInPageShowCompleted = false;
        this.mIsViewOnTopRegistered = false;
        this.mIsReloadWhenAutoRefresh = false;
        this.mIsAdBackup = false;
        this.mBannerType = BANNER_SHOW_TYPE.NORMAL;
        try {
            setupData();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, TAG, e11);
        }
    }

    public void loadAds(String str) {
        loadAds(str, null);
    }

    public void show(BANNER_SHOW_TYPE banner_show_type) {
        try {
            this.mBannerType = banner_show_type;
            if (AbstractC19207b.m100801g(this.mAdsContext)) {
                setVisibility(0);
                checkIfHaveInViewPort();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "show", e11);
        }
    }

    public void loadAds(String str, String str2) {
        Context context;
        String str3;
        ZAdsBannerSize zAdsBannerSize;
        int i11;
        int i12;
        boolean z11;
        String str4;
        String str5;
        Bundle bundle;
        try {
            this.mAdsLoadTag = str;
            this.mContentFilterId = str2;
            this.mQoSEntity = new C3228a();
            this.mAdsLoadListener = new InterfaceC19745g() { // from class: com.adtima.ads.ZAdsBanner.8
                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFailed(int i13) {
                    ZAdsBanner zAdsBanner;
                    Handler handler;
                    Runnable runnable;
                    long j11;
                    try {
                        ZAdsBanner.this.mAdsIsSchedule = false;
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsBanner.this.mQoSEntity, false, false);
                        if (i13 == -5) {
                            if (ZAdsBanner.this.mAdsWaitingCount < AbstractC20202f.f99801b) {
                                handler = new Handler();
                                runnable = new Runnable() { // from class: com.adtima.ads.ZAdsBanner.8.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsBanner.TAG, "onFailed with SDK_INIT_WAITING #" + ZAdsBanner.this.mAdsWaitingCount);
                                        ZAdsBanner.access$5308(ZAdsBanner.this);
                                        ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                                        zAdsBanner2.loadAds(zAdsBanner2.mAdsLoadTag, ZAdsBanner.this.mContentFilterId);
                                    }
                                };
                                j11 = AbstractC20202f.f99799a;
                                handler.postDelayed(runnable, j11);
                                return;
                            }
                            ZAdsBanner zAdsBanner2 = ZAdsBanner.this;
                            if (zAdsBanner2.mAdsListener != null) {
                                zAdsBanner2.showDebugLog();
                                zAdsBanner = ZAdsBanner.this;
                                zAdsBanner.mAdsListener.onAdsLoadFailed(i13);
                            }
                            return;
                        }
                        if (i13 == -1) {
                            if (ZAdsBanner.this.mAdsReloadCount < AbstractC20202f.f99805d) {
                                Adtima.reInitSdk(ZAdsBanner.this.mAdsContext, AbstractC20202f.f99816i0);
                                handler = new Handler();
                                runnable = new Runnable() { // from class: com.adtima.ads.ZAdsBanner.8.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Adtima.m18328e(ZAdsBanner.TAG, "onFailed with SDK_INIT_ERROR #" + ZAdsBanner.this.mAdsReloadCount);
                                        ZAdsBanner.access$5408(ZAdsBanner.this);
                                        ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                                        zAdsBanner3.loadAds(zAdsBanner3.mAdsLoadTag, ZAdsBanner.this.mContentFilterId);
                                    }
                                };
                                j11 = AbstractC20202f.f99803c;
                                handler.postDelayed(runnable, j11);
                                return;
                            }
                            ZAdsBanner zAdsBanner3 = ZAdsBanner.this;
                            if (zAdsBanner3.mAdsListener == null) {
                                return;
                            }
                            zAdsBanner3.showDebugLog();
                            zAdsBanner = ZAdsBanner.this;
                        } else if (i13 == -8) {
                            ZAdsBanner zAdsBanner4 = ZAdsBanner.this;
                            if (zAdsBanner4.mAdsListener == null) {
                                return;
                            }
                            zAdsBanner4.showDebugLog();
                            zAdsBanner = ZAdsBanner.this;
                        } else if (ZAdsBanner.this.checkIfNeedRetryOrForceReset(false)) {
                            Adtima.m18326d(ZAdsBanner.TAG, "Empty ad or null, try to load next");
                            ZAdsBanner zAdsBanner5 = ZAdsBanner.this;
                            zAdsBanner5.loadAdsWhenRetry(zAdsBanner5.mAdsLoadTag);
                            return;
                        } else {
                            ZAdsBanner zAdsBanner6 = ZAdsBanner.this;
                            if (zAdsBanner6.mAdsListener == null) {
                                return;
                            }
                            zAdsBanner6.showDebugLog();
                            zAdsBanner = ZAdsBanner.this;
                        }
                        zAdsBanner.mAdsListener.onAdsLoadFailed(i13);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onFailed", e11);
                    }
                }

                @Override // p196h3.InterfaceC19745g
                public void onAdsLoadFinished(boolean z12) {
                    try {
                        ZAdsBanner.this.mQoSEntity = C20212p.m105468m().m105473d(ZAdsBanner.this.mQoSEntity, z12, true);
                        ZAdsBanner.this.mAdsIsSchedule = true;
                        ZAdsBanner.this.mAdsWaitingCount = 0;
                        ZAdsBanner.this.mAdsReloadCount = 0;
                        ZAdsBanner.this.scheduleRightNow();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsBanner.TAG, "onLoaded", e11);
                    }
                }
            };
            String str6 = this.mAdsZoneId;
            if (str6 == null || str6.length() == 0) {
                Adtima.m18330p(TAG, "Request with empty zone!");
                return;
            }
            C3228a c3228a = this.mQoSEntity;
            if (c3228a != null) {
                c3228a.m16376j(this.mAdsZoneId);
                this.mQoSEntity.m16378l(System.currentTimeMillis());
            }
            if (this.mShouldPriorityLoadAd && this.mAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                C20217u.m105538N0().m105604k0(Adtima.SDK_VERSION_CODE, "banner", ZAdsBannerSize.toString(this.mAdsBannerSize), this.mAdsZoneId, this.mAdsLoadTag, this.mContentFilterId, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
            } else {
                C20217u.m105538N0().m105611t(Adtima.SDK_VERSION_CODE, "banner", ZAdsBannerSize.toString(this.mAdsBannerSize), this.mAdsZoneId, this.mAdsLoadTag, this.mContentFilterId, this.mAdsTargetingData, this.mAdsLoadListener, this.mAdsRetryCount);
            }
            ZAdsNetworksPreload zAdsNetworksPreload = this.mAdsNetworkPreload;
            if (zAdsNetworksPreload == null) {
                context = this.mAdsContext;
                str3 = this.mAdsZoneId;
                zAdsBannerSize = this.mAdsBannerSize;
                i11 = this.mAdsWidth;
                i12 = this.mAdsHeight;
                z11 = this.mAdsVideoSoundOnPrefer;
                str4 = this.mAdsContentId;
                str5 = this.mAdsContentUrl;
                bundle = this.mAdsTargetingData;
            } else {
                if (!zAdsNetworksPreload.checkAdsServed()) {
                    return;
                }
                this.mAdsNetworkPreload.destroy();
                context = this.mAdsContext;
                str3 = this.mAdsZoneId;
                zAdsBannerSize = this.mAdsBannerSize;
                i11 = this.mAdsWidth;
                i12 = this.mAdsHeight;
                z11 = this.mAdsVideoSoundOnPrefer;
                str4 = this.mAdsContentId;
                str5 = this.mAdsContentUrl;
                bundle = this.mAdsTargetingData;
            }
            this.mAdsNetworkPreload = ZAdsNetworksPreload.prepare(context, str3, zAdsBannerSize, i11, i12, z11, str4, str5, bundle);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAds", e11);
        }
    }

    public void loadAds(String str, String str2, String str3) {
        C20217u.m105538N0().m105617w0(str3);
        loadAds(str, str2);
    }
}
