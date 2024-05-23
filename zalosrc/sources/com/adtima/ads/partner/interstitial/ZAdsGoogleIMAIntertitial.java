package com.adtima.ads.partner.interstitial;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsActivity;
import com.adtima.ads.partner.ZAdsAudioPartnerListener;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.control.ZAudioControl;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p029b3.C2503a;
import p227i3.AbstractC20202f;
import p227i3.C20218v;
import p313l3.AbstractC22011d;
import p335m.C22695b;

/* loaded from: classes2.dex */
public class ZAdsGoogleIMAIntertitial extends ZAdsPartnerInterstitialAbstract {
    private static final String TAG = "ZAdsGoogleIMAIntertitial";
    public C2503a mAdsAudioProfile;
    private RelativeLayout mAdsContainer;
    private ZAdsAudioPartnerListener mAdsDaastListener;
    private AdsLoader mAdsLoader;
    private AdsManager mAdsManager;
    private ViewGroup mCompanionView;
    private AdMediaInfo mCurrentAd;
    private boolean mIsAllowSkip;
    private ImageView mIvCompanion;
    private ViewGroup mMainView;
    private ImaSdkFactory mSdkFactory;
    private TextView mTvCta;
    private TextView mTvSubtitle;
    private TextView mTvTitle;
    private ImaProgressTracker progressTracker;
    private ImaAdPlayer mImaAdPlayer = new ImaAdPlayer();
    private ZAudioControl mAdsAudioControl = null;
    private boolean mIsAdDisplayed = false;
    private boolean mIsFromControl = false;
    private C22695b mMediaFile = new C22695b();
    private boolean mIsAdsClicked = false;
    private String mClickThrougUrl = "";
    private final List<VideoAdPlayer.VideoAdPlayerCallback> callbacks = new ArrayList();

    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$1 */
    /* loaded from: classes2.dex */
    public class RunnableC38261 implements Runnable {
        RunnableC38261() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ZAdsGoogleIMAIntertitial.this.mAdsAudioControl == null || ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.getDuration() != 0) {
                    return;
                }
                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onSkipped();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "checkTimeoutNetwork", e11);
            }
        }
    }

    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$2 */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC38272 implements View.OnClickListener {
        ViewOnClickListenerC38272() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$3 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC38283 implements View.OnClickListener {

        /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$3$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements Runnable {
            AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = false;
            }
        }

        ViewOnClickListenerC38283() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ZAdsGoogleIMAIntertitial.this.mIsAdsClicked) {
                return;
            }
            ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = true;
            if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
            }
            if (!ZAdsGoogleIMAIntertitial.this.mClickThrougUrl.equals("")) {
                C20218v.m105636a().m105639d(ZAdsGoogleIMAIntertitial.this.mClickThrougUrl, null);
            }
            ZAdsGoogleIMAIntertitial.this.mTvCta.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.3.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = false;
                }
            }, 1000L);
        }
    }

    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$4 */
    /* loaded from: classes2.dex */
    class C38294 extends ZAudioControl.C3861j {
        C38294() {
        }

        @Override // com.adtima.control.ZAudioControl.C3861j
        public void onCompleted() {
            super.onCompleted();
            ZAdsGoogleIMAIntertitial.this.notifyEnded();
        }

        @Override // com.adtima.control.ZAudioControl.C3861j
        public void onInteracted() {
            super.onInteracted();
            try {
                if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                    ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onInteracted();
                }
                ZAdsGoogleIMAIntertitial.this.mIsFromControl = true;
                if (ZAdsGoogleIMAIntertitial.this.isAdsMediaPlaying()) {
                    ZAdsGoogleIMAIntertitial.this.pauseAdsPartner();
                } else {
                    ZAdsGoogleIMAIntertitial.this.resumeAdsPartner();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.adtima.control.ZAudioControl.C3861j
        public void onSkipped() {
            super.onSkipped();
            try {
                if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                    ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onSkipped();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$5 */
    /* loaded from: classes2.dex */
    class C38305 implements AdErrorEvent.AdErrorListener {
        C38305() {
        }

        public void onAdError(AdErrorEvent adErrorEvent) {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
            try {
                ZAdsGoogleIMAIntertitial.this.notifyEnded();
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$6 */
    /* loaded from: classes2.dex */
    public class C38316 implements AdsLoader.AdsLoadedListener {

        /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$6$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1 implements AdErrorEvent.AdErrorListener {
            AnonymousClass1() {
            }

            public void onAdError(AdErrorEvent adErrorEvent) {
                Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                try {
                    ZAdsGoogleIMAIntertitial.this.notifyEnded();
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
                }
            }
        }

        /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$6$2 */
        /* loaded from: classes2.dex */
        class AnonymousClass2 implements AdEvent.AdEventListener {
            AnonymousClass2() {
            }

            public void onAdEvent(AdEvent adEvent) {
                try {
                    try {
                        Adtima.m18326d(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent: " + adEvent.getType());
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e11);
                    }
                    int i11 = C38327.f15301x68022ad9[adEvent.getType().ordinal()];
                    if (i11 == 1) {
                        ZAdsGoogleIMAIntertitial.this.parseAdEvent(adEvent);
                        return;
                    }
                    if (i11 == 4) {
                        ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = true;
                        return;
                    }
                    if (i11 == 5) {
                        ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = false;
                    } else if (i11 == 6 && ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
                    }
                } catch (Exception e12) {
                    Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e12);
                }
            }
        }

        C38316() {
        }

        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            ZAdsGoogleIMAIntertitial.this.mAdsManager = adsManagerLoadedEvent.getAdsManager();
            ZAdsGoogleIMAIntertitial.this.mAdsManager.addAdErrorListener(new AdErrorEvent.AdErrorListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.6.1
                AnonymousClass1() {
                }

                public void onAdError(AdErrorEvent adErrorEvent) {
                    Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                    try {
                        ZAdsGoogleIMAIntertitial.this.notifyEnded();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
                    }
                }
            });
            ZAdsGoogleIMAIntertitial.this.mAdsManager.addAdEventListener(new AdEvent.AdEventListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.6.2
                AnonymousClass2() {
                }

                public void onAdEvent(AdEvent adEvent) {
                    try {
                        try {
                            Adtima.m18326d(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent: " + adEvent.getType());
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e11);
                        }
                        int i11 = C38327.f15301x68022ad9[adEvent.getType().ordinal()];
                        if (i11 == 1) {
                            ZAdsGoogleIMAIntertitial.this.parseAdEvent(adEvent);
                            return;
                        }
                        if (i11 == 4) {
                            ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = true;
                            return;
                        }
                        if (i11 == 5) {
                            ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = false;
                        } else if (i11 == 6 && ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
                        }
                    } catch (Exception e12) {
                        Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e12);
                    }
                }
            });
            AdsRenderingSettings createAdsRenderingSettings = ZAdsGoogleIMAIntertitial.this.mSdkFactory.createAdsRenderingSettings();
            createAdsRenderingSettings.setEnablePreloading(true);
            createAdsRenderingSettings.setDisableUi(true);
            createAdsRenderingSettings.setLoadVideoTimeout(1000000);
            ZAdsGoogleIMAIntertitial.this.mAdsManager.init(createAdsRenderingSettings);
            ZAdsGoogleIMAIntertitial zAdsGoogleIMAIntertitial = ZAdsGoogleIMAIntertitial.this;
            zAdsGoogleIMAIntertitial.progressTracker = new ImaProgressTracker(zAdsGoogleIMAIntertitial.mImaAdPlayer);
        }
    }

    /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$7 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C38327 {

        /* renamed from: $SwitchMap$com$google$ads$interactivemedia$v3$api$AdEvent$AdEventType */
        static final /* synthetic */ int[] f15301x68022ad9;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f15301x68022ad9 = iArr;
            try {
                iArr[AdEvent.AdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.CLICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15301x68022ad9[AdEvent.AdEventType.ALL_ADS_COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class ImaAdPlayer implements VideoAdPlayer {
        ImaAdPlayer() {
        }

        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            ZAdsGoogleIMAIntertitial.this.callbacks.add(videoAdPlayerCallback);
        }

        public VideoProgressUpdate getAdProgress() {
            if (ZAdsGoogleIMAIntertitial.this.mCurrentAd == null) {
                return null;
            }
            return new VideoProgressUpdate(ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.getCurrentPosition(), ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.getDuration());
        }

        public int getVolume() {
            return 0;
        }

        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "ImaAdPlayer : loadAd " + adMediaInfo.getUrl());
            ZAdsGoogleIMAIntertitial.this.mMediaFile.m117386k(adMediaInfo.getUrl());
            if (ZAdsGoogleIMAIntertitial.this.mAdsAudioControl != null) {
                ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.setDaastModel(ZAdsGoogleIMAIntertitial.this.mAdsAudioProfile.f10199a);
                ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.m18435Q();
                if (ZAdsGoogleIMAIntertitial.this.mIsAllowSkip) {
                    return;
                }
                ZAdsGoogleIMAIntertitial.this.checkTimeoutNetwork(AbstractC20202f.f99800a0.longValue());
            }
        }

        public void pauseAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "ImaAdPlayer : pauseAd ");
            ZAdsGoogleIMAIntertitial.this.progressTracker.stop();
            Iterator it = ZAdsGoogleIMAIntertitial.this.callbacks.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onPause(adMediaInfo);
            }
        }

        public void playAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "ImaAdPlayer : playAd " + adMediaInfo.getUrl());
            ZAdsGoogleIMAIntertitial.this.progressTracker.start();
            if (ZAdsGoogleIMAIntertitial.this.mCurrentAd == adMediaInfo) {
                Iterator it = ZAdsGoogleIMAIntertitial.this.callbacks.iterator();
                while (it.hasNext()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onResume(adMediaInfo);
                }
            } else {
                ZAdsGoogleIMAIntertitial.this.mCurrentAd = adMediaInfo;
                Iterator it2 = ZAdsGoogleIMAIntertitial.this.callbacks.iterator();
                while (it2.hasNext()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) it2.next()).onPlay(adMediaInfo);
                }
            }
            sendProgressUpdate();
        }

        public void release() {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "ImaAdPlayer : release ");
        }

        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            ZAdsGoogleIMAIntertitial.this.callbacks.remove(videoAdPlayerCallback);
        }

        void sendProgressUpdate() {
            Iterator it = ZAdsGoogleIMAIntertitial.this.callbacks.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onAdProgress(ZAdsGoogleIMAIntertitial.this.mCurrentAd, getAdProgress());
            }
        }

        public void stopAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "ImaAdPlayer : stopAd ");
            ZAdsGoogleIMAIntertitial.this.progressTracker.stop();
            ZAdsGoogleIMAIntertitial.this.notifyEnded();
        }
    }

    /* loaded from: classes2.dex */
    static class ImaProgressTracker implements Handler.Callback {
        static final int QUIT = 2;
        static final int START = 0;
        static final int UPDATE = 1;
        static final int UPDATE_PERIOD_MS = 1000;
        private final Handler messageHandler = new Handler(this);
        private final ImaAdPlayer player;

        ImaProgressTracker(ImaAdPlayer imaAdPlayer) {
            this.player = imaAdPlayer;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0 || i11 == 1) {
                this.player.sendProgressUpdate();
                this.messageHandler.removeMessages(1);
                this.messageHandler.sendEmptyMessageDelayed(1, 1000L);
            } else if (i11 == 2) {
                this.messageHandler.removeMessages(1);
            }
            return true;
        }

        void start() {
            this.messageHandler.sendEmptyMessage(0);
        }

        void stop() {
            Handler handler = this.messageHandler;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 2));
        }
    }

    public ZAdsGoogleIMAIntertitial(Context context, C2503a c2503a, RelativeLayout relativeLayout, ZAdsAudioPartnerListener zAdsAudioPartnerListener, boolean z11) {
        this.mIsAllowSkip = false;
        this.mAdsContext = context;
        this.mAdsAudioProfile = c2503a;
        this.mIsAllowSkip = z11;
        this.mAdsContainer = relativeLayout;
        this.mAdsDaastListener = zAdsAudioPartnerListener;
    }

    public void checkTimeoutNetwork(long j11) {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.1
                RunnableC38261() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsGoogleIMAIntertitial.this.mAdsAudioControl == null || ZAdsGoogleIMAIntertitial.this.mAdsAudioControl.getDuration() != 0) {
                            return;
                        }
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onSkipped();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "checkTimeoutNetwork", e11);
                    }
                }
            }, j11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkTimeoutNetwork", e11);
        }
    }

    public void notifyEnded() {
        Iterator<VideoAdPlayer.VideoAdPlayerCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onEnded(this.mCurrentAd);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:            r6.mClickThrougUrl = r2;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parseAdEvent(AdEvent adEvent) {
        try {
            Ad ad2 = adEvent.getAd();
            if (ad2 != null) {
                try {
                    Iterator it = new ArrayList(Arrays.asList(ad2.toString().replace("Ad [", "").substring(0, r1.length() - 1).split(","))).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        String trim = str.substring(0, str.indexOf("=")).trim();
                        String trim2 = str.substring(str.indexOf("=") + 1).trim();
                        if (trim.equalsIgnoreCase("clickThroughUrl")) {
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                this.mMediaFile.m117377b(ad2.getVastMediaBitrate());
                this.mMediaFile.m117383h(ad2.getVastMediaWidth());
                this.mMediaFile.m117380e(ad2.getVastMediaHeight());
                this.mMediaFile.m117385j("custom/ima");
                this.mAdsAudioProfile.f10199a.m114766p(AbstractC22011d.m114904e((int) ad2.getDuration()));
                this.mAdsAudioProfile.f10199a.m114752b((int) ad2.getDuration());
                this.mAdsAudioProfile.f10199a.m114757g(this.mMediaFile);
                if (ad2.getTitle() != null && ad2.getTitle().length() != 0) {
                    this.mTvTitle.setText(ad2.getTitle());
                }
                if (ad2.getDescription() != null && ad2.getDescription().length() != 0) {
                    this.mTvSubtitle.setText(ad2.getDescription());
                }
                this.mAdsAudioControl.m18439k(ad2.isSkippable(), (long) ad2.getSkipTimeOffset());
                this.mAdsAudioControl.m18441n0();
                showAdsPartner();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "parseAdEvent", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void destroyAdsPartner() {
        Adtima.m18328e(TAG, "destroyAdsPartner");
        AdsManager adsManager = this.mAdsManager;
        if (adsManager != null) {
            adsManager.destroy();
            this.mAdsManager = null;
        }
        ZAudioControl zAudioControl = this.mAdsAudioControl;
        if (zAudioControl != null) {
            zAudioControl.m18440n();
            this.mAdsAudioControl.m18438X();
            this.mAdsAudioControl = null;
        }
        this.mAdsListener = null;
        this.mAdsContainer.removeView(this.mMainView);
        ((ZAdsActivity) this.mAdsContext).finish();
    }

    public boolean isAdsMediaPlaying() {
        try {
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                return zAudioControl.m18434N();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void loadAdsPartner() {
        Adtima.m18328e(TAG, "loadAdsPartner");
        try {
            View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__fullpage_ima_audio, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            this.mMainView = (ViewGroup) inflate.findViewById(AbstractC3874e.zad__audio_view);
            this.mTvTitle = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_title);
            this.mTvSubtitle = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_subtitle);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC3874e.zad__audio_sc_cover_img);
            this.mIvCompanion = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.2
                ViewOnClickListenerC38272() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            TextView textView = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_cta);
            this.mTvCta = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.3

                /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$3$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements Runnable {
                    AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = false;
                    }
                }

                ViewOnClickListenerC38283() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ZAdsGoogleIMAIntertitial.this.mIsAdsClicked) {
                        return;
                    }
                    ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = true;
                    if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                        ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
                    }
                    if (!ZAdsGoogleIMAIntertitial.this.mClickThrougUrl.equals("")) {
                        C20218v.m105636a().m105639d(ZAdsGoogleIMAIntertitial.this.mClickThrougUrl, null);
                    }
                    ZAdsGoogleIMAIntertitial.this.mTvCta.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.3.1
                        AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            ZAdsGoogleIMAIntertitial.this.mIsAdsClicked = false;
                        }
                    }, 1000L);
                }
            });
            ZAudioControl zAudioControl = (ZAudioControl) inflate.findViewById(AbstractC3874e.zad__audio_control);
            this.mAdsAudioControl = zAudioControl;
            zAudioControl.setAudioListener(this.mAdsDaastListener);
            this.mAdsAudioControl.setListener(new ZAudioControl.C3861j() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.4
                C38294() {
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onCompleted() {
                    super.onCompleted();
                    ZAdsGoogleIMAIntertitial.this.notifyEnded();
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onInteracted();
                        }
                        ZAdsGoogleIMAIntertitial.this.mIsFromControl = true;
                        if (ZAdsGoogleIMAIntertitial.this.isAdsMediaPlaying()) {
                            ZAdsGoogleIMAIntertitial.this.pauseAdsPartner();
                        } else {
                            ZAdsGoogleIMAIntertitial.this.resumeAdsPartner();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onSkipped() {
                    super.onSkipped();
                    try {
                        if (((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                            ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onSkipped();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mCompanionView = (ViewGroup) inflate.findViewById(AbstractC3874e.zad__audio_sc_cover);
            ImaSdkFactory imaSdkFactory = ImaSdkFactory.getInstance();
            this.mSdkFactory = imaSdkFactory;
            CompanionAdSlot createCompanionAdSlot = imaSdkFactory.createCompanionAdSlot();
            createCompanionAdSlot.setContainer(this.mCompanionView);
            createCompanionAdSlot.setSize(300, 250);
            AdDisplayContainer createAudioAdDisplayContainer = ImaSdkFactory.createAudioAdDisplayContainer(this.mAdsContext, this.mImaAdPlayer);
            createAudioAdDisplayContainer.setCompanionSlots(Collections.singleton(createCompanionAdSlot));
            AdsLoader createAdsLoader = this.mSdkFactory.createAdsLoader(this.mAdsContext, this.mSdkFactory.createImaSdkSettings(), createAudioAdDisplayContainer);
            this.mAdsLoader = createAdsLoader;
            createAdsLoader.addAdErrorListener(new AdErrorEvent.AdErrorListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.5
                C38305() {
                }

                public void onAdError(AdErrorEvent adErrorEvent) {
                    Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                    try {
                        ZAdsGoogleIMAIntertitial.this.notifyEnded();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
                    }
                }
            });
            this.mAdsLoader.addAdsLoadedListener(new AdsLoader.AdsLoadedListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.6

                /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$6$1 */
                /* loaded from: classes2.dex */
                class AnonymousClass1 implements AdErrorEvent.AdErrorListener {
                    AnonymousClass1() {
                    }

                    public void onAdError(AdErrorEvent adErrorEvent) {
                        Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                        try {
                            ZAdsGoogleIMAIntertitial.this.notifyEnded();
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
                        }
                    }
                }

                /* renamed from: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial$6$2 */
                /* loaded from: classes2.dex */
                class AnonymousClass2 implements AdEvent.AdEventListener {
                    AnonymousClass2() {
                    }

                    public void onAdEvent(AdEvent adEvent) {
                        try {
                            try {
                                Adtima.m18326d(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent: " + adEvent.getType());
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e11);
                            }
                            int i11 = C38327.f15301x68022ad9[adEvent.getType().ordinal()];
                            if (i11 == 1) {
                                ZAdsGoogleIMAIntertitial.this.parseAdEvent(adEvent);
                                return;
                            }
                            if (i11 == 4) {
                                ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = true;
                                return;
                            }
                            if (i11 == 5) {
                                ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = false;
                            } else if (i11 == 6 && ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                                ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
                            }
                        } catch (Exception e12) {
                            Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e12);
                        }
                    }
                }

                C38316() {
                }

                public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
                    ZAdsGoogleIMAIntertitial.this.mAdsManager = adsManagerLoadedEvent.getAdsManager();
                    ZAdsGoogleIMAIntertitial.this.mAdsManager.addAdErrorListener(new AdErrorEvent.AdErrorListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.6.1
                        AnonymousClass1() {
                        }

                        public void onAdError(AdErrorEvent adErrorEvent) {
                            Adtima.m18328e(ZAdsGoogleIMAIntertitial.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                            try {
                                ZAdsGoogleIMAIntertitial.this.notifyEnded();
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdError", e11);
                            }
                        }
                    });
                    ZAdsGoogleIMAIntertitial.this.mAdsManager.addAdEventListener(new AdEvent.AdEventListener() { // from class: com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial.6.2
                        AnonymousClass2() {
                        }

                        public void onAdEvent(AdEvent adEvent) {
                            try {
                                try {
                                    Adtima.m18326d(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent: " + adEvent.getType());
                                } catch (Exception e11) {
                                    Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e11);
                                }
                                int i11 = C38327.f15301x68022ad9[adEvent.getType().ordinal()];
                                if (i11 == 1) {
                                    ZAdsGoogleIMAIntertitial.this.parseAdEvent(adEvent);
                                    return;
                                }
                                if (i11 == 4) {
                                    ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = true;
                                    return;
                                }
                                if (i11 == 5) {
                                    ZAdsGoogleIMAIntertitial.this.mIsAdDisplayed = false;
                                } else if (i11 == 6 && ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener != null) {
                                    ((ZAdsPartnerInterstitialAbstract) ZAdsGoogleIMAIntertitial.this).mAdsListener.onClicked();
                                }
                            } catch (Exception e12) {
                                Adtima.m18329e(ZAdsGoogleIMAIntertitial.TAG, "onAdEvent", e12);
                            }
                        }
                    });
                    AdsRenderingSettings createAdsRenderingSettings = ZAdsGoogleIMAIntertitial.this.mSdkFactory.createAdsRenderingSettings();
                    createAdsRenderingSettings.setEnablePreloading(true);
                    createAdsRenderingSettings.setDisableUi(true);
                    createAdsRenderingSettings.setLoadVideoTimeout(1000000);
                    ZAdsGoogleIMAIntertitial.this.mAdsManager.init(createAdsRenderingSettings);
                    ZAdsGoogleIMAIntertitial zAdsGoogleIMAIntertitial = ZAdsGoogleIMAIntertitial.this;
                    zAdsGoogleIMAIntertitial.progressTracker = new ImaProgressTracker(zAdsGoogleIMAIntertitial.mImaAdPlayer);
                }
            });
            AdsRequest createAdsRequest = this.mSdkFactory.createAdsRequest();
            createAdsRequest.setAdTagUrl(this.mAdsAudioProfile.f10199a.m114772v().m117382g());
            this.mAdsLoader.requestAds(createAdsRequest);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, "loadAdsPartner: " + e11.getMessage());
            destroyAdsPartner();
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void pauseAdsPartner() {
        Adtima.m18328e(TAG, "pauseAdsPartner");
        AdsManager adsManager = this.mAdsManager;
        if (adsManager != null && this.mIsAdDisplayed) {
            adsManager.pause();
        }
        if (!this.mIsFromControl) {
            pauseAudio();
        }
        this.mIsFromControl = false;
    }

    public void pauseAudio() {
        Adtima.m18328e(TAG, "pauseAudio");
        try {
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18436S();
            }
        } catch (Exception unused) {
        }
    }

    public void playAudio() {
        Adtima.m18328e(TAG, "playAudio");
        try {
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18437V();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void resumeAdsPartner() {
        Adtima.m18328e(TAG, "resumeAdsPartner");
        AdsManager adsManager = this.mAdsManager;
        if (adsManager != null && this.mIsAdDisplayed) {
            adsManager.resume();
        }
        if (!this.mIsFromControl) {
            playAudio();
        }
        this.mIsFromControl = false;
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract
    public void showAdsPartner() {
        Adtima.m18328e(TAG, "showAdsPartner");
        try {
            this.mAdsManager.start();
        } catch (Exception unused) {
        }
    }
}
