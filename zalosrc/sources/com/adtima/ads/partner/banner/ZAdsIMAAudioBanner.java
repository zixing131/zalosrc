package com.adtima.ads.partner.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
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
import p090d3.C17718a;
import p227i3.AbstractC20202f;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p313l3.AbstractC22011d;
import p335m.C22695b;

/* loaded from: classes2.dex */
public class ZAdsIMAAudioBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsIMAAudioBanner";
    private final List<VideoAdPlayer.VideoAdPlayerCallback> callbacks;
    private ZAdsBannerSize mAdSize;
    private ZAudioControl mAdsAudioControl;
    private C17718a mAdsData;
    private AdsLoader mAdsLoader;
    private AdsManager mAdsManager;
    private String mClickThrougUrl;
    private ViewGroup mCompanionView;
    private AdMediaInfo mCurrentAd;
    private ImaAdPlayer mImaAdPlayer;
    private boolean mIsAdDisplayed;
    private boolean mIsAdsClicked;
    private boolean mIsFromControl;
    private ImageView mIvCompanion;
    private ViewGroup mMainView;
    private C22695b mMediaFile;
    private ImaSdkFactory mSdkFactory;
    private TextView mTvCta;
    private TextView mTvSubtitle;
    private TextView mTvTitle;
    private ImaProgressTracker progressTracker;

    /* renamed from: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner$7 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C38187 {

        /* renamed from: $SwitchMap$com$google$ads$interactivemedia$v3$api$AdEvent$AdEventType */
        static final /* synthetic */ int[] f15300x68022ad9;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f15300x68022ad9 = iArr;
            try {
                iArr[AdEvent.AdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.CLICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15300x68022ad9[AdEvent.AdEventType.ALL_ADS_COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class ImaAdPlayer implements VideoAdPlayer {
        ImaAdPlayer() {
        }

        public void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            ZAdsIMAAudioBanner.this.callbacks.add(videoAdPlayerCallback);
        }

        public VideoProgressUpdate getAdProgress() {
            if (ZAdsIMAAudioBanner.this.mCurrentAd == null) {
                return null;
            }
            return new VideoProgressUpdate(ZAdsIMAAudioBanner.this.mAdsAudioControl.getCurrentPosition(), ZAdsIMAAudioBanner.this.mAdsAudioControl.getDuration());
        }

        public int getVolume() {
            return 0;
        }

        public void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "ImaAdPlayer : loadAd " + adMediaInfo.getUrl());
            ZAdsIMAAudioBanner.this.mMediaFile.m117386k(adMediaInfo.getUrl());
            if (ZAdsIMAAudioBanner.this.mAdsAudioControl != null) {
                ZAdsIMAAudioBanner.this.mAdsAudioControl.setDaastModel(ZAdsIMAAudioBanner.this.mAdsData.f89802a.f498b0.f10199a);
                ZAdsIMAAudioBanner.this.mAdsAudioControl.m18435Q();
                if (ZAdsIMAAudioBanner.this.mAdsData.f89802a.f504e0) {
                    return;
                }
                ZAdsIMAAudioBanner.this.checkTimeoutNetwork(AbstractC20202f.f99800a0.longValue());
            }
        }

        public void pauseAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "ImaAdPlayer : pauseAd ");
            ZAdsIMAAudioBanner.this.progressTracker.stop();
            Iterator it = ZAdsIMAAudioBanner.this.callbacks.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onPause(adMediaInfo);
            }
        }

        public void playAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "ImaAdPlayer : playAd " + adMediaInfo.getUrl());
            ZAdsIMAAudioBanner.this.progressTracker.start();
            if (ZAdsIMAAudioBanner.this.mCurrentAd == adMediaInfo) {
                Iterator it = ZAdsIMAAudioBanner.this.callbacks.iterator();
                while (it.hasNext()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onResume(adMediaInfo);
                }
            } else {
                ZAdsIMAAudioBanner.this.mCurrentAd = adMediaInfo;
                Iterator it2 = ZAdsIMAAudioBanner.this.callbacks.iterator();
                while (it2.hasNext()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) it2.next()).onPlay(adMediaInfo);
                }
            }
            sendProgressUpdate();
        }

        public void release() {
            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "ImaAdPlayer : release ");
        }

        public void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            ZAdsIMAAudioBanner.this.callbacks.remove(videoAdPlayerCallback);
        }

        void sendProgressUpdate() {
            Iterator it = ZAdsIMAAudioBanner.this.callbacks.iterator();
            while (it.hasNext()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) it.next()).onAdProgress(ZAdsIMAAudioBanner.this.mCurrentAd, getAdProgress());
            }
        }

        public void stopAd(AdMediaInfo adMediaInfo) {
            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "ImaAdPlayer : stopAd ");
            ZAdsIMAAudioBanner.this.progressTracker.stop();
            ZAdsIMAAudioBanner.this.notifyEnded();
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

    public ZAdsIMAAudioBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a) {
        super(context);
        this.mImaAdPlayer = new ImaAdPlayer();
        this.mAdsAudioControl = null;
        this.mIsAdDisplayed = false;
        this.mIsFromControl = false;
        this.mMediaFile = new C22695b();
        this.mIsAdsClicked = false;
        this.mClickThrougUrl = "";
        this.callbacks = new ArrayList();
        this.mAdsWidth = i11;
        this.mAdsHeight = i12;
        this.mAdsData = c17718a;
        this.mAdSize = zAdsBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkTimeoutNetwork(long j11) {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsIMAAudioBanner.this.mAdsAudioControl == null || ZAdsIMAAudioBanner.this.mAdsAudioControl.getDuration() != 0) {
                            return;
                        }
                        ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener.onSkipped();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsIMAAudioBanner.TAG, "checkTimeoutNetwork", e11);
                    }
                }
            }, j11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkTimeoutNetwork", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEnded() {
        Iterator<VideoAdPlayer.VideoAdPlayerCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onEnded(this.mCurrentAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
                this.mAdsData.f89802a.f498b0.f10199a.m114766p(AbstractC22011d.m114904e((int) ad2.getDuration()));
                this.mAdsData.f89802a.f498b0.f10199a.m114752b((int) ad2.getDuration());
                this.mAdsData.f89802a.f498b0.f10199a.m114757g(this.mMediaFile);
                if (ad2.getTitle() != null && ad2.getTitle().length() != 0) {
                    this.mTvTitle.setText(ad2.getTitle());
                }
                if (ad2.getDescription() != null && ad2.getDescription().length() != 0) {
                    this.mTvSubtitle.setText(ad2.getDescription());
                }
                this.mAdsAudioControl.m18439k(ad2.isSkippable(), (long) ad2.getSkipTimeOffset());
                this.mAdsAudioControl.m18441n0();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "parseAdEvent", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
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
        this.mAdsData = null;
        this.mAdsListener = null;
        removeView(this.mMainView);
    }

    public void displayedAdsPartner() {
        Adtima.m18328e(TAG, "displayedAdsPartner");
        try {
            this.mAdsManager.start();
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
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

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        Adtima.m18328e(TAG, "loadAdsPartner");
        try {
            if (this.mAdSize != ZAdsBannerSize.FULL_PAGE) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__fullpage_ima_audio, (ViewGroup) null);
            addView(inflate);
            this.mMainView = (ViewGroup) inflate.findViewById(AbstractC3874e.zad__audio_view);
            this.mTvTitle = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_title);
            this.mTvSubtitle = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_subtitle);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC3874e.zad__audio_sc_cover_img);
            this.mIvCompanion = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            TextView textView = (TextView) inflate.findViewById(AbstractC3874e.zad__audio_tv_cta);
            this.mTvCta = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ZAdsIMAAudioBanner.this.mIsAdsClicked) {
                        return;
                    }
                    ZAdsIMAAudioBanner.this.mIsAdsClicked = true;
                    if (((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener != null) {
                        ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener.onClicked();
                    }
                    if (!ZAdsIMAAudioBanner.this.mClickThrougUrl.equals("")) {
                        C20218v.m105636a().m105639d(ZAdsIMAAudioBanner.this.mClickThrougUrl, ZAdsIMAAudioBanner.this.mAdsData.f89802a);
                    }
                    ZAdsIMAAudioBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ZAdsIMAAudioBanner.this.mIsAdsClicked = false;
                        }
                    }, 1000L);
                }
            });
            if (!this.mAdsData.f89802a.f522n0) {
                this.mTvCta.setVisibility(8);
            }
            ZAudioControl zAudioControl = (ZAudioControl) inflate.findViewById(AbstractC3874e.zad__audio_control);
            this.mAdsAudioControl = zAudioControl;
            zAudioControl.setAudioListener(this.mAdsDaastListener);
            this.mAdsAudioControl.setListener(new ZAudioControl.C3861j() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.4
                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onCompleted() {
                    super.onCompleted();
                    ZAdsIMAAudioBanner.this.notifyEnded();
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener.onInteracted();
                        }
                        ZAdsIMAAudioBanner.this.mIsFromControl = true;
                        if (ZAdsIMAAudioBanner.this.isAdsMediaPlaying()) {
                            ZAdsIMAAudioBanner.this.pauseAdsPartner();
                        } else {
                            ZAdsIMAAudioBanner.this.resumeAdsPartner();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onSkipped() {
                    super.onSkipped();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener.onSkipped();
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
            createAdsLoader.addAdErrorListener(new AdErrorEvent.AdErrorListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.5
                public void onAdError(AdErrorEvent adErrorEvent) {
                    Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                    try {
                        ZAdsIMAAudioBanner.this.notifyEnded();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsIMAAudioBanner.TAG, "onAdError", e11);
                    }
                }
            });
            this.mAdsLoader.addAdsLoadedListener(new AdsLoader.AdsLoadedListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.6
                public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
                    ZAdsIMAAudioBanner.this.mAdsManager = adsManagerLoadedEvent.getAdsManager();
                    ZAdsIMAAudioBanner.this.mAdsManager.addAdErrorListener(new AdErrorEvent.AdErrorListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.6.1
                        public void onAdError(AdErrorEvent adErrorEvent) {
                            Adtima.m18328e(ZAdsIMAAudioBanner.TAG, "adErrorEvent + " + adErrorEvent.getError().getMessage());
                            try {
                                ZAdsIMAAudioBanner.this.notifyEnded();
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsIMAAudioBanner.TAG, "onAdError", e11);
                            }
                        }
                    });
                    ZAdsIMAAudioBanner.this.mAdsManager.addAdEventListener(new AdEvent.AdEventListener() { // from class: com.adtima.ads.partner.banner.ZAdsIMAAudioBanner.6.2
                        public void onAdEvent(AdEvent adEvent) {
                            try {
                                try {
                                    Adtima.m18326d(ZAdsIMAAudioBanner.TAG, "onAdEvent: " + adEvent.getType());
                                } catch (Exception e11) {
                                    Adtima.m18329e(ZAdsIMAAudioBanner.TAG, "onAdEvent", e11);
                                }
                                int i11 = C38187.f15300x68022ad9[adEvent.getType().ordinal()];
                                if (i11 == 1) {
                                    ZAdsIMAAudioBanner.this.parseAdEvent(adEvent);
                                    return;
                                }
                                if (i11 == 4) {
                                    ZAdsIMAAudioBanner.this.mIsAdDisplayed = true;
                                    return;
                                }
                                if (i11 == 5) {
                                    ZAdsIMAAudioBanner.this.mIsAdDisplayed = false;
                                } else if (i11 == 6 && ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsIMAAudioBanner.this).mAdsListener.onClicked();
                                }
                            } catch (Exception e12) {
                                Adtima.m18329e(ZAdsIMAAudioBanner.TAG, "onAdEvent", e12);
                            }
                        }
                    });
                    AdsRenderingSettings createAdsRenderingSettings = ZAdsIMAAudioBanner.this.mSdkFactory.createAdsRenderingSettings();
                    createAdsRenderingSettings.setEnablePreloading(true);
                    createAdsRenderingSettings.setDisableUi(true);
                    createAdsRenderingSettings.setLoadVideoTimeout(1000000);
                    ZAdsIMAAudioBanner.this.mAdsManager.init(createAdsRenderingSettings);
                    ZAdsIMAAudioBanner zAdsIMAAudioBanner = ZAdsIMAAudioBanner.this;
                    zAdsIMAAudioBanner.progressTracker = new ImaProgressTracker(zAdsIMAAudioBanner.mImaAdPlayer);
                }
            });
            AdsRequest createAdsRequest = this.mSdkFactory.createAdsRequest();
            createAdsRequest.setAdTagUrl(this.mAdsData.f89802a.f498b0.f10199a.m114772v().m117382g());
            this.mAdsLoader.requestAds(createAdsRequest);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, "loadAdsPartner: " + e11.getMessage());
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
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

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
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
}
