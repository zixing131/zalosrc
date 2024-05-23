package com.adtima.ads.partner.banner;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsAction;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.ZAdsJSInterface;
import com.adtima.ads.partner.ZAdsBannerSwipeListener;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.google.android.gms.ads.MobileAds;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p090d3.C17718a;
import p178g3.AbstractC19209d;
import p178g3.AbstractC19211f;
import p178g3.AbstractC19214i;
import p227i3.AbstractC20202f;
import p227i3.C20209m;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p313l3.AbstractC22010c;
import p313l3.AbstractC22011d;
import p702z2.AbstractC31194b;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaHtmlBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaHtmlBanner";
    private RelativeLayout clickFullLayout;
    private Sensor mAccelerometer;
    private ZAdsBannerSize mAdsBannerSize;
    private C17718a mAdsData;
    private AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    private AudioManager mAudioManager;
    private Handler mHandler;
    boolean mHasOrientationChanged;
    private boolean mIsAdsClicked;
    private boolean mIsReload;
    private C20209m.c mOMSession;
    private RelativeLayout mRootLayout;
    private Runnable mRunnable;
    private SensorManager mSensorManager;
    private AbstractC31194b mShakeDetector;
    private ZAdsBannerSwipeListener mSwipeListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class CustomWebview extends WebView {
        float downX;
        float downY;

        public CustomWebview(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int scaledTouchSlop = ViewConfiguration.get(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsContext).getScaledTouchSlop();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.downX = motionEvent.getRawX();
                this.downY = motionEvent.getRawY();
            } else if (actionMasked == 2) {
                float rawX = motionEvent.getRawX() - this.downX;
                float rawY = motionEvent.getRawY() - this.downY;
                if (Math.abs(rawX) > scaledTouchSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class WebChromeClientCustomPoster extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        private WebChromeClientCustomPoster() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
            try {
                WebView.HitTestResult hitTestResult = webView.getHitTestResult();
                if (hitTestResult == null || hitTestResult.getExtra() == null) {
                    WebView webView2 = new WebView(webView.getContext());
                    ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                    message.sendToTarget();
                    webView2.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.WebChromeClientCustomPoster.1
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                            ZAdsAdtimaHtmlBanner.this.handleUrlLoading(str);
                            return true;
                        }
                    });
                } else {
                    ZAdsAdtimaHtmlBanner.this.handleUrlLoading(hitTestResult.getExtra());
                }
                return true;
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsAdtimaHtmlBanner.TAG, "onCreateWindow", e11);
                return true;
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            try {
                Activity m114902c = AbstractC22011d.m114902c();
                ((FrameLayout) m114902c.getWindow().getDecorView()).removeView(this.mCustomView);
                this.mCustomView = null;
                m114902c.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
                m114902c.setRequestedOrientation(this.mOriginalOrientation);
                this.mCustomViewCallback.onCustomViewHidden();
                this.mCustomViewCallback = null;
            } catch (Exception unused) {
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            try {
                if (this.mCustomView != null) {
                    onHideCustomView();
                    return;
                }
                Activity m114902c = AbstractC22011d.m114902c();
                this.mCustomView = view;
                this.mOriginalSystemUiVisibility = m114902c.getWindow().getDecorView().getSystemUiVisibility();
                this.mOriginalOrientation = m114902c.getRequestedOrientation();
                this.mCustomViewCallback = customViewCallback;
                ((FrameLayout) m114902c.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
                m114902c.getWindow().getDecorView().setSystemUiVisibility(3846);
            } catch (Exception unused) {
            }
        }
    }

    public ZAdsAdtimaHtmlBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a, boolean z11) {
        super(context);
        this.mRootLayout = null;
        this.clickFullLayout = null;
        this.mAudioManager = null;
        this.mAudioFocusChangeListener = null;
        this.mOMSession = null;
        this.mIsAdsClicked = false;
        this.mRunnable = null;
        this.mHandler = null;
        this.mSensorManager = null;
        this.mHasOrientationChanged = false;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsData = c17718a;
            this.mAdsBannerSize = zAdsBannerSize;
            this.mIsReload = z11;
            this.mRootLayout = new RelativeLayout(context);
            int i13 = AbstractC22010c.f108378a;
            this.mRootLayout.setLayoutParams(new RelativeLayout.LayoutParams(i13, i13));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayBeforeCallback() {
        try {
            this.mHandler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.2
                @Override // java.lang.Runnable
                public void run() {
                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onImpression();
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onLoaded(ZAdsAdtimaHtmlBanner.this.mAdsData);
                    }
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, 300L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "delayBeforeCallback", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUrlLoading(String str) {
        String str2 = TAG;
        Adtima.m18326d(str2, "handleUrlLoading: " + str);
        if (str != null) {
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
                } else if (str.equals(ZAdsAction.URL_ACTION_INTERACT)) {
                    ZAdsPartnerViewListener zAdsPartnerViewListener2 = this.mAdsListener;
                    if (zAdsPartnerViewListener2 != null) {
                        zAdsPartnerViewListener2.onInteracted();
                    }
                } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_ON)) {
                    requestAudioFocus();
                } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_OFF)) {
                    requestAudioUnFocus();
                } else if (str.startsWith(ZAdsAction.URL_ACTION_CLICK)) {
                    String replace = str.replace("zads://action_click?target=", "");
                    Adtima.m18326d(str2, "Target: " + replace);
                    C17718a c17718a = this.mAdsData;
                    if (c17718a != null && c17718a.f89802a != null) {
                        C20218v.m105636a().m105639d(replace, this.mAdsData.f89802a);
                    }
                    ZAdsPartnerViewListener zAdsPartnerViewListener3 = this.mAdsListener;
                    if (zAdsPartnerViewListener3 != null) {
                        zAdsPartnerViewListener3.onTracking(4);
                    }
                } else {
                    ZAdsPartnerViewListener zAdsPartnerViewListener4 = this.mAdsListener;
                    if (zAdsPartnerViewListener4 != null) {
                        zAdsPartnerViewListener4.onClickedAdsProgrammatic();
                    }
                    C20218v.m105636a().m105639d(str, this.mAdsData.f89802a);
                }
                postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.6
                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsAdtimaHtmlBanner.this.mIsAdsClicked = false;
                    }
                }, 1000L);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadWebView() {
        try {
            setLayoutParams(new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight));
            removeView(this.mRootLayout);
            RelativeLayout relativeLayout = new RelativeLayout(this.mAdsContext);
            this.mRootLayout = relativeLayout;
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight));
            CustomWebview customWebview = new CustomWebview(getContext());
            this.mAdsWebView0 = customWebview;
            AbstractC19214i.m100838d(customWebview, 0);
            this.mAdsWebView0.getSettings().setJavaScriptEnabled(true);
            this.mAdsWebView0.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.mAdsWebView0.getSettings().setDomStorageEnabled(true);
            this.mAdsWebView0.getSettings().setDatabaseEnabled(true);
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.8
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    try {
                        if (AbstractC20202f.f99835s && ZAdsAdtimaHtmlBanner.this.mOMSession != null && ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0 != null) {
                            if (ZAdsAdtimaHtmlBanner.this.clickFullLayout == null) {
                                ZAdsAdtimaHtmlBanner.this.mOMSession.m105436c(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0);
                            } else {
                                ZAdsAdtimaHtmlBanner.this.mOMSession.m105437d(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0, ZAdsAdtimaHtmlBanner.this.clickFullLayout);
                            }
                        }
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWidth <= 0 || ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsHeight <= 0) {
                            return;
                        }
                        ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner = ZAdsAdtimaHtmlBanner.this;
                        zAdsAdtimaHtmlBanner.requestScreenSize(((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner).mAdsWidth, ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsHeight);
                    } catch (Exception unused) {
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str != null) {
                        try {
                            if (!ZAdsAdtimaHtmlBanner.this.mIsAdsClicked) {
                                ZAdsAdtimaHtmlBanner.this.mIsAdsClicked = true;
                                if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onClicked();
                                    }
                                } else if (str.equals(ZAdsAction.URL_ACTION_INTERACT)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onInteracted();
                                    }
                                } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_ON)) {
                                    ZAdsAdtimaHtmlBanner.this.requestAudioFocus();
                                } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_OFF)) {
                                    ZAdsAdtimaHtmlBanner.this.requestAudioUnFocus();
                                } else if (str.startsWith(ZAdsAction.URL_ACTION_CLICK)) {
                                    String replace = str.replace("zads://action_click?target=", "");
                                    Adtima.m18326d(ZAdsAdtimaHtmlBanner.TAG, "Target: " + replace);
                                    if (ZAdsAdtimaHtmlBanner.this.mAdsData != null && ZAdsAdtimaHtmlBanner.this.mAdsData.f89802a != null) {
                                        C20218v.m105636a().m105639d(replace, ZAdsAdtimaHtmlBanner.this.mAdsData.f89802a);
                                    }
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onTracking(4);
                                    }
                                } else {
                                    C20218v.m105636a().m105639d(str, ZAdsAdtimaHtmlBanner.this.mAdsData.f89802a);
                                }
                                ZAdsAdtimaHtmlBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.8.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZAdsAdtimaHtmlBanner.this.mIsAdsClicked = false;
                                    }
                                }, 1000L);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            });
            this.mAdsWebView0.setWebChromeClient(new WebChromeClientCustomPoster());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
            this.mAdsWebView0.setLayoutParams(layoutParams);
            this.mAdsWebView0.addJavascriptInterface(new ZAdsJSInterface(this.mAdsData.f89802a), "zadsJSInterface");
            if (AbstractC20202f.f99835s && this.mAdsData.f89802a.f540w0) {
                this.mOMSession = C20209m.m105408c(this.mAdsContext).m105418j();
                downloadUrlToString(this.mAdsData.f89802a.f517l, layoutParams);
            } else {
                this.mAdsWebView0.loadUrl(this.mAdsData.f89802a.f517l);
                this.mRootLayout.addView(this.mAdsWebView0, layoutParams);
                setUpView();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void requestScreenSize(int i11, int i12) {
        try {
            String m100804a = AbstractC19209d.m100804a(ZAdsAction.JS_REQUEST_SCREEN_SIZE, Integer.valueOf(i11), Integer.valueOf(i12));
            if (m100804a != null && m100804a.length() != 0 && this.mAdsWebView0 != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsWebView0.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsWebView0.loadUrl("javascript:" + m100804a);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpView() {
        try {
            if (this.mAdsData.f89802a.f524o0) {
                int i11 = AbstractC22010c.f108378a;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
                if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                    layoutParams = new RelativeLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.mAdsContext);
                this.clickFullLayout = relativeLayout;
                relativeLayout.setLayoutParams(layoutParams);
                this.clickFullLayout.setClickable(true);
                this.clickFullLayout.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                                ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onClicked();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.mRootLayout.addView(this.clickFullLayout, layoutParams);
            }
            addView(this.mRootLayout);
            registerAudioListener();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setUpView", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        Runnable runnable;
        C20209m.c cVar;
        try {
            WebView webView = this.mAdsWebView0;
            if (webView != null) {
                webView.loadUrl("about:blank");
                this.mAdsWebView0.clearCache(true);
                this.mAdsWebView0.destroyDrawingCache();
                this.mAdsWebView0 = null;
            }
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mSwipeListener = null;
            unregisterAudioListener();
            if (AbstractC20202f.f99835s && (cVar = this.mOMSession) != null) {
                cVar.m105435b();
                this.mOMSession = null;
            }
            Handler handler = this.mHandler;
            if (handler != null && (runnable = this.mRunnable) != null) {
                handler.removeCallbacks(runnable);
                this.mHandler = null;
            }
            if (this.mRunnable != null) {
                this.mRunnable = null;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "destroyAdsPartner", e11);
        }
    }

    public void downloadUrlToString(final String str, final LinearLayout.LayoutParams layoutParams) {
        try {
            C0009d.m11g(new AbstractRunnableC0008c() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.4
                @Override // p001a.p005d.AbstractRunnableC0008c
                public String doInBackground() {
                    try {
                        return AbstractC22011d.m114911l(str);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaHtmlBanner.TAG, "doInBackground", e11);
                        return "";
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(String str2) {
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0 == null || ZAdsAdtimaHtmlBanner.this.mOMSession == null) {
                            return;
                        }
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0.loadDataWithBaseURL(AbstractC22011d.m114914o(str), ZAdsAdtimaHtmlBanner.this.mOMSession.m105434a(str2), "text/html", "UTF-8", null);
                        ZAdsAdtimaHtmlBanner.this.mRootLayout.addView(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0, layoutParams);
                        ZAdsAdtimaHtmlBanner.this.setUpView();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaHtmlBanner.TAG, "onPostExecute", e11);
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "downloadUrlToString", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        try {
            int i11 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
            }
            setLayoutParams(layoutParams);
            setOrientation(1);
            CustomWebview customWebview = new CustomWebview(getContext());
            this.mAdsWebView0 = customWebview;
            AbstractC19214i.m100838d(customWebview, 0);
            this.mAdsWebView0.getSettings().setJavaScriptEnabled(true);
            this.mAdsWebView0.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.mAdsWebView0.getSettings().setDomStorageEnabled(true);
            this.mAdsWebView0.getSettings().setDatabaseEnabled(true);
            this.mAdsWebView0.getSettings().setMixedContentMode(2);
            ZAdsBannerSize zAdsBannerSize = this.mAdsBannerSize;
            if (zAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE || zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                this.mAdsWebView0.getSettings().setTextZoom(100);
            }
            try {
                C17718a c17718a = this.mAdsData;
                if (c17718a != null && c17718a.f89802a.f469B0.equals("programmatic")) {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.mAdsWebView0, true);
                    MobileAds.registerWebView(this.mAdsWebView0);
                }
            } catch (Exception unused) {
            }
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    Adtima.m18326d(ZAdsAdtimaHtmlBanner.TAG, "onPageFinished: " + str);
                    try {
                        if (AbstractC20202f.f99835s && ZAdsAdtimaHtmlBanner.this.mOMSession != null && ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0 != null) {
                            if (ZAdsAdtimaHtmlBanner.this.clickFullLayout == null) {
                                ZAdsAdtimaHtmlBanner.this.mOMSession.m105436c(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0);
                            } else {
                                ZAdsAdtimaHtmlBanner.this.mOMSession.m105437d(((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWebView0, ZAdsAdtimaHtmlBanner.this.clickFullLayout);
                            }
                        }
                        if (ZAdsAdtimaHtmlBanner.this.mIsReload) {
                            ZAdsAdtimaHtmlBanner.this.delayBeforeCallback();
                        } else if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onImpression();
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onLoaded(ZAdsAdtimaHtmlBanner.this.mAdsData);
                        }
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWidth <= 0 || ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsHeight <= 0) {
                            return;
                        }
                        ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner = ZAdsAdtimaHtmlBanner.this;
                        zAdsAdtimaHtmlBanner.requestScreenSize(((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner).mAdsWidth, ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsHeight);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i12, String str, String str2) {
                    super.onReceivedError(webView, i12, str, str2);
                    Adtima.m18326d(ZAdsAdtimaHtmlBanner.TAG, "onReceivedError description: " + str + " | errorCode" + i12);
                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener != null) {
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsListener.onFailed(ZAdsAdtimaHtmlBanner.this.mAdsData, EnumC20200d.AD_WEBVIEW_ERROR);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    Adtima.m18326d(ZAdsAdtimaHtmlBanner.TAG, "onReceivedHttpError: " + webResourceRequest.getUrl());
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    Adtima.m18326d(ZAdsAdtimaHtmlBanner.TAG, "onReceivedSslError: " + sslError.toString());
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    ZAdsAdtimaHtmlBanner.this.handleUrlLoading(str);
                    return true;
                }
            });
            this.mAdsWebView0.setWebChromeClient(new WebChromeClientCustomPoster());
            this.mAdsWebView0.setLayoutParams(layoutParams);
            this.mAdsWebView0.addJavascriptInterface(new ZAdsJSInterface(this.mAdsData.f89802a), "zadsJSInterface");
            if (AbstractC20202f.f99835s && this.mAdsData.f89802a.f540w0) {
                this.mOMSession = C20209m.m105408c(this.mAdsContext).m105418j();
                downloadUrlToString(this.mAdsData.f89802a.f517l, layoutParams);
            } else {
                this.mAdsWebView0.loadUrl(this.mAdsData.f89802a.f517l);
                this.mRootLayout.addView(this.mAdsWebView0, layoutParams);
                setUpView();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "loadAdsPartner", e11);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Adtima.m18328e(TAG, "--onConfigurationChanged");
        this.mHasOrientationChanged = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        try {
            if (this.mHasOrientationChanged) {
                postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner = ZAdsAdtimaHtmlBanner.this;
                        zAdsAdtimaHtmlBanner.mHasOrientationChanged = false;
                        View view = (View) zAdsAdtimaHtmlBanner.getParent();
                        if (view != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaHtmlBanner.this).mAdsWidth = view.getWidth();
                            if (ZAdsAdtimaHtmlBanner.this.mAdsBannerSize == ZAdsBannerSize.R11_RECTANGLE) {
                                ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner2 = ZAdsAdtimaHtmlBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner2).mAdsHeight = ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner2).mAdsWidth;
                            } else if (ZAdsAdtimaHtmlBanner.this.mAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                                ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner3 = ZAdsAdtimaHtmlBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner3).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner3).mAdsWidth * 100) / 300;
                            } else if (ZAdsAdtimaHtmlBanner.this.mAdsBannerSize == ZAdsBannerSize.R169_RECTANGLE) {
                                ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner4 = ZAdsAdtimaHtmlBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner4).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner4).mAdsWidth * 9) / 16;
                            } else if (ZAdsAdtimaHtmlBanner.this.mAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE) {
                                ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner5 = ZAdsAdtimaHtmlBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner5).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner5).mAdsWidth * 250) / 300;
                            } else if (ZAdsAdtimaHtmlBanner.this.mAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                                ZAdsAdtimaHtmlBanner zAdsAdtimaHtmlBanner6 = ZAdsAdtimaHtmlBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner6).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaHtmlBanner6).mAdsWidth * ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE) / 400;
                            }
                            ZAdsAdtimaHtmlBanner.this.reloadWebView();
                        }
                    }
                }, 10L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
        try {
            requestSoundOff();
            requestAudioUnFocus();
            SensorManager sensorManager = this.mSensorManager;
            if (sensorManager != null) {
                sensorManager.unregisterListener((SensorEventListener) null);
            }
        } catch (Exception unused) {
        }
    }

    public void registerAudioListener() {
        try {
            this.mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaHtmlBanner.5
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i11) {
                    if (i11 != -2) {
                        if (i11 != -1) {
                            return;
                        }
                        try {
                            ZAdsAdtimaHtmlBanner.this.mAudioManager.abandonAudioFocus(ZAdsAdtimaHtmlBanner.this.mAudioFocusChangeListener);
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    ZAdsAdtimaHtmlBanner.this.requestSoundOff();
                }
            };
        } catch (Exception unused) {
        }
    }

    public boolean requestAudioFocus() {
        AudioManager audioManager;
        try {
            audioManager = (AudioManager) getContext().getSystemService("audio");
            this.mAudioManager = audioManager;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "requestAudioFocus", e11);
        }
        return audioManager.requestAudioFocus(this.mAudioFocusChangeListener, 3, 1) == 1;
    }

    public boolean requestAudioUnFocus() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        try {
            AudioManager audioManager = this.mAudioManager;
            if (audioManager != null && (onAudioFocusChangeListener = this.mAudioFocusChangeListener) != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                return true;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "requestAudioUnFocus", e11);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public void requestSoundOff() {
        try {
            String m100804a = AbstractC19209d.m100804a(ZAdsAction.JS_REQUEST_SOUND_OFF, new Object());
            if (m100804a != null && m100804a.length() != 0 && this.mAdsWebView0 != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsWebView0.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsWebView0.loadUrl("javascript:" + m100804a);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener((SensorEventListener) null, this.mAccelerometer, 2);
        }
    }

    public void unregisterAudioListener() {
        try {
            this.mAudioFocusChangeListener = null;
        } catch (Exception unused) {
        }
    }
}
