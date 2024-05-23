package com.adtima.ads.partner.banner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsAction;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.control.ZVideoControl;
import java.util.List;
import p009a3.C0098c;
import p090d3.C17718a;
import p178g3.AbstractC19211f;
import p178g3.AbstractC19214i;
import p227i3.AbstractC20202f;
import p227i3.C20209m;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p250j.C20894a;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaRichBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaRichBanner";
    private C17718a mAdsData;
    private int mAdsGenViewId1;
    private int mAdsGenViewId2;
    private int mAdsGenViewId3;
    private BroadcastReceiver mAdsPowerKeyReceiver;
    private ZAdsBannerSize mAdsSize;
    private TextView mAdsSkipAfterTextView;
    private TextView mAdsSkipNowTextView;
    private boolean mAdsSoundOn;
    private ZVideoControl mAdsVideoControl;
    private LinearLayout mBodyLayout;
    private LinearLayout mContentLayout;
    private Handler mHandler;
    private LinearLayout mHeaderLayout;
    private boolean mIsAdsClicked;
    private C20209m.e mOMSession;
    private RelativeLayout mRootLayout;
    private Runnable mRunnable;

    public ZAdsAdtimaRichBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a, boolean z11) {
        super(context);
        this.mAdsGenViewId1 = 0;
        this.mAdsGenViewId2 = 0;
        this.mAdsGenViewId3 = 0;
        this.mRootLayout = null;
        this.mContentLayout = null;
        this.mHeaderLayout = null;
        this.mBodyLayout = null;
        this.mAdsVideoControl = null;
        this.mAdsSkipAfterTextView = null;
        this.mAdsSkipNowTextView = null;
        this.mAdsPowerKeyReceiver = null;
        this.mOMSession = null;
        this.mIsAdsClicked = false;
        this.mRunnable = null;
        this.mHandler = null;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsSize = zAdsBannerSize;
            this.mAdsData = c17718a;
            this.mAdsSoundOn = z11;
            initViewId();
            this.mRootLayout = new RelativeLayout(context);
            int i13 = AbstractC22010c.f108378a;
            this.mRootLayout.setLayoutParams(new RelativeLayout.LayoutParams(i13, i13));
            this.mContentLayout = new LinearLayout(context);
            int i14 = AbstractC22010c.f108378a;
            this.mContentLayout.setLayoutParams(new LinearLayout.LayoutParams(i14, i14));
            this.mContentLayout.setOrientation(1);
        } catch (Exception unused) {
        }
    }

    private void initViewId() {
        try {
            int m100835a = AbstractC19214i.m100835a();
            this.mAdsGenViewId1 = m100835a;
            if (m100835a == 0) {
                m100835a = 1111;
            }
            this.mAdsGenViewId1 = m100835a;
            int m100835a2 = AbstractC19214i.m100835a();
            this.mAdsGenViewId2 = m100835a2;
            if (m100835a2 == 0) {
                m100835a2 = 2222;
            }
            this.mAdsGenViewId2 = m100835a2;
            int m100835a3 = AbstractC19214i.m100835a();
            this.mAdsGenViewId3 = m100835a3;
            if (m100835a3 == 0) {
                m100835a3 = 3333;
            }
            this.mAdsGenViewId3 = m100835a3;
        } catch (Exception unused) {
        }
    }

    private void registerScreenOffReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.15
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && ZAdsAdtimaRichBanner.this.isAdsMediaPlaying()) {
                            ZAdsAdtimaRichBanner.this.pauseVideo();
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            this.mAdsPowerKeyReceiver = broadcastReceiver;
            this.mAdsContext.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRichSkipCountdown(final long j11) {
        try {
            this.mHandler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        long j12 = j11 - 1;
                        if (j12 <= 0) {
                            if (ZAdsAdtimaRichBanner.this.mAdsSkipAfterTextView != null) {
                                ZAdsAdtimaRichBanner.this.mAdsSkipAfterTextView.setVisibility(4);
                            }
                            if (ZAdsAdtimaRichBanner.this.mAdsSkipNowTextView != null) {
                                ZAdsAdtimaRichBanner.this.mAdsSkipNowTextView.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        if (j12 > 0) {
                            String str = AbstractC20202f.f99785M;
                            if (ZAdsAdtimaRichBanner.this.mAdsData != null && ZAdsAdtimaRichBanner.this.mAdsData.f89802a != null && ZAdsAdtimaRichBanner.this.mAdsData.f89802a.f504e0 && ZAdsAdtimaRichBanner.this.mAdsData.f89802a.f506f0 > 0) {
                                str = AbstractC20202f.f99784L.replace("#time#", String.valueOf(j12));
                            }
                            if (ZAdsAdtimaRichBanner.this.mAdsSkipAfterTextView != null) {
                                ZAdsAdtimaRichBanner.this.mAdsSkipAfterTextView.setText(str);
                            }
                            ZAdsAdtimaRichBanner.this.startRichSkipCountdown(j12);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaRichBanner.TAG, "startRichSkipCountdown", e11);
                    }
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, 1000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startSkipCountdown", e11);
        }
    }

    private void unregisterScreenOffReceiver() {
        try {
            BroadcastReceiver broadcastReceiver = this.mAdsPowerKeyReceiver;
            if (broadcastReceiver != null) {
                this.mAdsContext.unregisterReceiver(broadcastReceiver);
                this.mAdsPowerKeyReceiver = null;
            }
        } catch (Exception unused) {
            this.mAdsPowerKeyReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void webviewAction(String str) {
        try {
            if (this.mIsAdsClicked) {
                return;
            }
            this.mIsAdsClicked = true;
            if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onClicked();
                }
            } else if (str.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                ZAdsPartnerViewListener zAdsPartnerViewListener2 = this.mAdsListener;
                if (zAdsPartnerViewListener2 != null) {
                    zAdsPartnerViewListener2.onReport();
                }
            } else if (str.contains("adtima")) {
                C20218v.m105636a().m105643h(str);
            }
            postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.13
                @Override // java.lang.Runnable
                public void run() {
                    ZAdsAdtimaRichBanner.this.mIsAdsClicked = false;
                }
            }, 1000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "webviewAction", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        Runnable runnable;
        C20209m.e eVar;
        try {
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mAdsVastListener = null;
            unregisterScreenOffReceiver();
            AbstractC19214i.m100837c(this.mAdsWebView0);
            this.mAdsWebView0 = null;
            AbstractC19214i.m100837c(this.mAdsWebView1);
            this.mAdsWebView1 = null;
            AbstractC19214i.m100840f(this.mAdsVideoControl);
            this.mAdsVideoControl = null;
            if (AbstractC20202f.f99835s && (eVar = this.mOMSession) != null) {
                eVar.m105449d();
                this.mOMSession = null;
            }
            if (this.mHeaderLayout != null) {
                this.mHeaderLayout = null;
            }
            if (this.mBodyLayout != null) {
                this.mBodyLayout = null;
            }
            if (this.mContentLayout != null) {
                this.mContentLayout = null;
            }
            if (this.mRootLayout != null) {
                this.mRootLayout = null;
            }
            Handler handler = this.mHandler;
            if (handler != null && (runnable = this.mRunnable) != null) {
                handler.removeCallbacks(runnable);
                this.mHandler = null;
            }
            if (this.mRunnable != null) {
                this.mRunnable = null;
            }
            AbstractC19214i.m100836b(this);
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public boolean isAdsMediaPlaying() {
        try {
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                return zVideoControl.m18510b0();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        try {
            if (AbstractC19211f.m100807b(21)) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            ZAdsBannerSize zAdsBannerSize = this.mAdsSize;
            if (zAdsBannerSize == ZAdsBannerSize.R169_RECTANGLE) {
                int i11 = AbstractC22010c.f108378a;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
                if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                    layoutParams = new RelativeLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
                }
                ZVideoControl zVideoControl = new ZVideoControl(this.mAdsContext, this.mAdsVastListener);
                this.mAdsVideoControl = zVideoControl;
                zVideoControl.setSoundOn(this.mAdsSoundOn);
                this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.1
                    @Override // com.adtima.control.ZVideoControl.C3871j
                    public void onInteracted() {
                        super.onInteracted();
                        try {
                            if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener != null) {
                                ((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener.onInteracted();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
                this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
                WebView webView = new WebView(this.mAdsContext);
                this.mAdsWebView0 = webView;
                webView.setScrollContainer(false);
                this.mAdsWebView0.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
                this.mAdsWebView0.getSettings().setCacheMode(2);
                this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.2
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                        if (str == null) {
                            return true;
                        }
                        try {
                            ZAdsAdtimaRichBanner.this.webviewAction(str);
                            return true;
                        } catch (Exception unused) {
                            return true;
                        }
                    }
                });
                this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.3
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        return motionEvent.getAction() == 2;
                    }
                });
                this.mAdsWebView0.setLayoutParams(layoutParams);
                this.mAdsWebView0.setBackgroundColor(-1);
                this.mAdsWebView0.setVerticalScrollBarEnabled(false);
                this.mAdsWebView0.setHorizontalScrollBarEnabled(false);
                String str = this.mAdsData.f89803b.f94006c;
                ZAdsBannerSize zAdsBannerSize2 = this.mAdsSize;
                if (zAdsBannerSize2 == ZAdsBannerSize.MEDIUM_RECTANGLE || zAdsBannerSize2 == ZAdsBannerSize.LARGE_RECTANGLE) {
                    this.mAdsWebView0.getSettings().setTextZoom(100);
                }
                this.mAdsWebView0.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                setBackgroundColor(-1);
                setLayoutParams(layoutParams);
                this.mRootLayout.addView(this.mAdsWebView0, layoutParams);
                this.mRootLayout.addView(this.mAdsVideoControl, layoutParams);
            } else {
                ZAdsBannerSize zAdsBannerSize3 = ZAdsBannerSize.MEDIUM_RECTANGLE;
                if (zAdsBannerSize == zAdsBannerSize3) {
                    int i12 = AbstractC22010c.f108378a;
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i12, i12);
                    if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                        layoutParams2 = new RelativeLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
                    }
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
                    if (this.mAdsWidth > 0) {
                        int i13 = this.mAdsWidth;
                        layoutParams3 = new RelativeLayout.LayoutParams(i13, (i13 * 9) / 16);
                    }
                    layoutParams3.addRule(3, this.mAdsGenViewId1);
                    ZVideoControl zVideoControl2 = new ZVideoControl(this.mAdsContext, this.mAdsVastListener);
                    this.mAdsVideoControl = zVideoControl2;
                    zVideoControl2.setId(this.mAdsGenViewId2);
                    this.mAdsVideoControl.setSoundOn(this.mAdsSoundOn);
                    this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.4
                        @Override // com.adtima.control.ZVideoControl.C3871j
                        public void onInteracted() {
                            super.onInteracted();
                            try {
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener.onInteracted();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                    this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
                    this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
                    WebView webView2 = new WebView(this.mAdsContext);
                    this.mAdsWebView0 = webView2;
                    webView2.setId(this.mAdsGenViewId3);
                    this.mAdsWebView0.setScrollContainer(false);
                    this.mAdsWebView0.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
                    this.mAdsWebView0.getSettings().setCacheMode(2);
                    this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.5
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView3, String str2) {
                            if (str2 == null) {
                                return true;
                            }
                            try {
                                ZAdsAdtimaRichBanner.this.webviewAction(str2);
                                return true;
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                    });
                    this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.6
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            return motionEvent.getAction() == 2;
                        }
                    });
                    int i14 = AbstractC22010c.f108378a;
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i14, i14);
                    layoutParams4.addRule(3, this.mAdsGenViewId2);
                    layoutParams4.addRule(12);
                    this.mAdsWebView0.setLayoutParams(layoutParams4);
                    this.mAdsWebView0.setBackgroundColor(-1);
                    this.mAdsWebView0.setVerticalScrollBarEnabled(false);
                    this.mAdsWebView0.setHorizontalScrollBarEnabled(false);
                    String str2 = this.mAdsData.f89803b.f94006c;
                    ZAdsBannerSize zAdsBannerSize4 = this.mAdsSize;
                    if (zAdsBannerSize4 == zAdsBannerSize3 || zAdsBannerSize4 == ZAdsBannerSize.LARGE_RECTANGLE) {
                        this.mAdsWebView0.getSettings().setTextZoom(100);
                    }
                    this.mAdsWebView0.loadDataWithBaseURL(null, str2, "text/html", "UTF-8", null);
                    setBackgroundColor(-1);
                    setLayoutParams(layoutParams2);
                    this.mRootLayout.addView(this.mAdsVideoControl, layoutParams3);
                    this.mRootLayout.addView(this.mAdsWebView0, layoutParams4);
                } else if (zAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                    View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__fullpage_adtima_rich, (ViewGroup) null);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
                    if (this.mAdsWidth > 0) {
                        int i15 = this.mAdsWidth;
                        layoutParams5 = new LinearLayout.LayoutParams(i15, (i15 * 9) / 16);
                    }
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
                    if (this.mAdsWidth > 0) {
                        int i16 = this.mAdsWidth;
                        layoutParams6 = new LinearLayout.LayoutParams(i16, i16 / 3);
                    }
                    int i17 = AbstractC22010c.f108378a;
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(i17, i17);
                    WebView webView3 = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
                    this.mAdsWebView0 = webView3;
                    webView3.setLayoutParams(layoutParams6);
                    AbstractC19214i.m100838d(this.mAdsWebView0, -16777216);
                    this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.7
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView4, String str3) {
                            if (str3 == null) {
                                return true;
                            }
                            try {
                                ZAdsAdtimaRichBanner.this.webviewAction(str3);
                                return true;
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                    });
                    this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.8
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            return motionEvent.getAction() == 2;
                        }
                    });
                    ZAdsBannerSize zAdsBannerSize5 = this.mAdsSize;
                    if (zAdsBannerSize5 == zAdsBannerSize3 || zAdsBannerSize5 == ZAdsBannerSize.LARGE_RECTANGLE) {
                        this.mAdsWebView0.getSettings().setTextZoom(100);
                    }
                    this.mAdsWebView0.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94006c, "text/html", "UTF-8", null);
                    WebView webView4 = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_1);
                    this.mAdsWebView1 = webView4;
                    webView4.setLayoutParams(layoutParams7);
                    AbstractC19214i.m100838d(this.mAdsWebView1, -16777216);
                    this.mAdsWebView1.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.9
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView5, String str3) {
                            if (str3 == null) {
                                return true;
                            }
                            try {
                                ZAdsAdtimaRichBanner.this.webviewAction(str3);
                                return true;
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                    });
                    this.mAdsWebView1.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.10
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            return motionEvent.getAction() == 2;
                        }
                    });
                    ZAdsBannerSize zAdsBannerSize6 = this.mAdsSize;
                    if (zAdsBannerSize6 == zAdsBannerSize3 || zAdsBannerSize6 == ZAdsBannerSize.LARGE_RECTANGLE) {
                        this.mAdsWebView1.getSettings().setTextZoom(100);
                    }
                    this.mAdsWebView1.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94007d, "text/html", "UTF-8", null);
                    ZVideoControl zVideoControl3 = (ZVideoControl) inflate.findViewById(AbstractC3874e.zad__video_control);
                    this.mAdsVideoControl = zVideoControl3;
                    zVideoControl3.setVastListener(this.mAdsVastListener);
                    this.mAdsVideoControl.setLayoutParams(layoutParams5);
                    this.mAdsVideoControl.setClickPanelEnable(false);
                    this.mAdsVideoControl.setSoundOn(this.mAdsSoundOn);
                    this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.11
                        @Override // com.adtima.control.ZVideoControl.C3871j
                        public void onCompleted() {
                            super.onCompleted();
                            try {
                                ZAdsAdtimaRichBanner.this.mAdsSkipAfterTextView.setVisibility(4);
                                ZAdsAdtimaRichBanner.this.mAdsSkipNowTextView.setVisibility(0);
                            } catch (Exception unused) {
                            }
                        }

                        @Override // com.adtima.control.ZVideoControl.C3871j
                        public void onInteracted() {
                            super.onInteracted();
                            try {
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener.onInteracted();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                    this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
                    this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
                    this.mAdsSkipAfterTextView = (TextView) inflate.findViewById(AbstractC3874e.zad__skip_after);
                    TextView textView = (TextView) inflate.findViewById(AbstractC3874e.zad__skip_now);
                    this.mAdsSkipNowTextView = textView;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaRichBanner.12
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            try {
                                ZAdsAdtimaRichBanner.this.pauseAdsPartner();
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaRichBanner.this).mAdsListener.onSkipped();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                    C0098c c0098c = this.mAdsData.f89802a;
                    if (!c0098c.f504e0) {
                        this.mAdsSkipAfterTextView.setText(AbstractC20202f.f99785M);
                        this.mAdsSkipAfterTextView.setVisibility(0);
                        this.mAdsSkipNowTextView.setVisibility(4);
                    } else if (c0098c.f506f0 == 0) {
                        this.mAdsSkipAfterTextView.setVisibility(4);
                        this.mAdsSkipNowTextView.setVisibility(0);
                    } else {
                        this.mAdsSkipAfterTextView.setVisibility(0);
                        this.mAdsSkipNowTextView.setVisibility(4);
                        startRichSkipCountdown(this.mAdsData.f89802a.f506f0);
                    }
                    this.mRootLayout.addView(inflate);
                }
            }
            addView(this.mRootLayout);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
        unregisterScreenOffReceiver();
        pauseVideo();
    }

    public void pauseVideo() {
        try {
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                if (zVideoControl.m18510b0()) {
                    this.mAdsVideoControl.m18513j0();
                }
                if (this.mAdsVideoControl.m18508Z()) {
                    this.mAdsVideoControl.m18515m(this.mAdsSoundFocus);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void playVideo() {
        try {
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl == null || zVideoControl.m18508Z()) {
                return;
            }
            this.mAdsVideoControl.m18516w(this.mAdsSoundFocus);
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
        registerScreenOffReceiver();
        playVideo();
    }

    public void startOMVideoSession(List<C20894a> list) {
        try {
            if (!AbstractC20202f.f99835s || list == null || list.size() == 0) {
                return;
            }
            C20209m m105408c = C20209m.m105408c(this.mAdsContext);
            C0098c c0098c = this.mAdsData.f89802a;
            C20209m.e m105417h = m105408c.m105417h(list, c0098c.f502d0, c0098c.f504e0, (float) c0098c.f506f0);
            this.mOMSession = m105417h;
            m105417h.m105452g(this.mRootLayout);
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
            this.mOMSession.m105450e(this.mAdsVideoControl.getVideoDuration(), this.mAdsVideoControl.getVideoVolume());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMVideoStarted", e11);
        }
    }
}
