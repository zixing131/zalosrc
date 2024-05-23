package com.adtima.ads.partner.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.http.SslError;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsAction;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsBannerSwipeListener;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import java.util.ArrayList;
import p009a3.C0098c;
import p090d3.C17718a;
import p178g3.AbstractC19214i;
import p227i3.AbstractC20202f;
import p227i3.C20209m;
import p227i3.C20213q;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p313l3.AbstractC22010c;
import p702z2.AbstractC31194b;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaNativeBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaNativeBanner";
    private Sensor mAccelerometer;
    private ZAdsBannerSize mAdsBannerSize;
    private C17718a mAdsData;
    private Handler mHandler;
    boolean mHasOrientationChanged;
    private String mHtmlData;
    private boolean mIsAdsClicked;
    private boolean mIsReload;
    private C20209m.d mOMSession;
    private RelativeLayout mRootLayout;
    private Runnable mRunnable;
    private SensorManager mSensorManager;
    private AbstractC31194b mShakeDetector;
    private ZAdsBannerSwipeListener mSwipeListener;

    public ZAdsAdtimaNativeBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a, boolean z11) {
        super(context);
        this.mRootLayout = null;
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
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onImpression();
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onLoaded(ZAdsAdtimaNativeBanner.this.mAdsData);
                    }
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, 300L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "delayBeforeCallback", e11);
        }
    }

    private void reloadWebView() {
        try {
            this.mRootLayout.removeView(this.mAdsWebView0);
            WebView webView = new WebView(this.mAdsContext);
            this.mAdsWebView0 = webView;
            AbstractC19214i.m100838d(webView, 0);
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.5
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    if (str != null) {
                        try {
                            if (!ZAdsAdtimaNativeBanner.this.mIsAdsClicked) {
                                ZAdsAdtimaNativeBanner.this.mIsAdsClicked = true;
                                if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onClicked();
                                    }
                                } else if (str.equals(ZAdsAction.URL_ACTION_CTA)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onAction();
                                    }
                                } else if (str.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onReport();
                                    }
                                } else if (str.contains("adtima")) {
                                    C20218v.m105636a().m105643h(str);
                                }
                                ZAdsAdtimaNativeBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.5.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZAdsAdtimaNativeBanner.this.mIsAdsClicked = false;
                                    }
                                }, 1000L);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsAdtimaNativeBanner.TAG, "shouldOverrideUrlLoading", e11);
                        }
                    }
                    return true;
                }
            });
            int i11 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
            }
            this.mAdsWebView0.setLayoutParams(layoutParams);
            this.mAdsWebView0.loadDataWithBaseURL(null, this.mHtmlData, "text/html", "UTF-8", null);
            this.mRootLayout.addView(this.mAdsWebView0, layoutParams);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        Runnable runnable;
        try {
            Handler handler = this.mHandler;
            if (handler != null && (runnable = this.mRunnable) != null) {
                handler.removeCallbacks(runnable);
                this.mHandler = null;
            }
            if (this.mRunnable != null) {
                this.mRunnable = null;
            }
            if (AbstractC20202f.f99835s) {
                C20209m.d dVar = this.mOMSession;
                if (dVar != null) {
                    dVar.m105439b();
                    this.mOMSession = null;
                }
                new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0 != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0.clearCache(true);
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0.destroyDrawingCache();
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0.destroy();
                            ZAdsAdtimaNativeBanner zAdsAdtimaNativeBanner = ZAdsAdtimaNativeBanner.this;
                            zAdsAdtimaNativeBanner.removeView(((ZAdsPartnerBannerAbstract) zAdsAdtimaNativeBanner).mAdsWebView0);
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0 = null;
                        }
                    }
                }, 1200L);
            } else {
                WebView webView = this.mAdsWebView0;
                if (webView != null) {
                    webView.clearCache(true);
                    this.mAdsWebView0.destroyDrawingCache();
                    this.mAdsWebView0.destroy();
                    removeView(this.mAdsWebView0);
                    this.mAdsWebView0 = null;
                }
            }
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mSwipeListener = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void loadAdsPartner() {
        boolean z11;
        try {
            C17718a c17718a = this.mAdsData;
            this.mHtmlData = c17718a.f89803b.f94006c;
            if (AbstractC20202f.f99835s && c17718a.f89802a.f540w0) {
                C20209m.d m105420m = C20209m.m105408c(this.mAdsContext).m105420m();
                this.mOMSession = m105420m;
                this.mHtmlData = m105420m.m105438a(this.mHtmlData);
            }
            ArrayList arrayList = this.mAdsData.f89802a.f523o;
            if (arrayList == null || arrayList.size() == 0) {
                z11 = false;
            } else {
                String[] strArr = new String[4];
                try {
                    C0098c c0098c = this.mAdsData.f89802a;
                    strArr[0] = c0098c.f519m;
                    strArr[1] = c0098c.f523o.size() > 0 ? (String) this.mAdsData.f89802a.f523o.get(0) : null;
                    strArr[2] = this.mAdsData.f89802a.f523o.size() > 1 ? (String) this.mAdsData.f89802a.f523o.get(1) : null;
                    strArr[3] = this.mAdsData.f89802a.f523o.size() > 2 ? (String) this.mAdsData.f89802a.f523o.get(2) : null;
                } catch (Exception unused) {
                }
                C20213q m105480e = C20213q.m105480e();
                C17718a c17718a2 = this.mAdsData;
                String str = strArr[1];
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = strArr[2];
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = strArr[3];
                if (str4 != null) {
                    str2 = str4;
                }
                C17718a m105483b = m105480e.m105483b(c17718a2, str, str3, str2);
                this.mAdsData = m105483b;
                this.mHtmlData = m105483b.f89803b.f94007d;
                z11 = true;
            }
            WebView webView = new WebView(this.mAdsContext);
            this.mAdsWebView0 = webView;
            AbstractC19214i.m100838d(webView, 0);
            if (z11 || AbstractC20202f.f99835s) {
                this.mAdsWebView0.getSettings().setJavaScriptEnabled(true);
            }
            ZAdsBannerSize zAdsBannerSize = this.mAdsBannerSize;
            if (zAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE || zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                this.mAdsWebView0.getSettings().setTextZoom(100);
            }
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str5) {
                    try {
                        Adtima.m18328e(ZAdsAdtimaNativeBanner.TAG, "onPageFinished");
                        if (ZAdsAdtimaNativeBanner.this.mIsReload) {
                            ZAdsAdtimaNativeBanner.this.delayBeforeCallback();
                        } else if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onImpression();
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onLoaded(ZAdsAdtimaNativeBanner.this.mAdsData);
                        }
                        if (!AbstractC20202f.f99835s || ZAdsAdtimaNativeBanner.this.mOMSession == null) {
                            return;
                        }
                        ZAdsAdtimaNativeBanner.this.mOMSession.m105440c(((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsWebView0, ZAdsAdtimaNativeBanner.this.mAdsData.f89802a);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaNativeBanner.TAG, "onPageFinished", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView2, int i11, String str5, String str6) {
                    super.onReceivedError(webView2, i11, str5, str6);
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onFailed(ZAdsAdtimaNativeBanner.this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaNativeBanner.TAG, "onReceivedError", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                    Adtima.m18326d(ZAdsAdtimaNativeBanner.TAG, "onReceivedHttpError: " + webResourceRequest.getUrl());
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView2, sslErrorHandler, sslError);
                    Adtima.m18326d(ZAdsAdtimaNativeBanner.TAG, "onReceivedSslError: " + sslError.toString());
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str5) {
                    try {
                        Adtima.m18328e(ZAdsAdtimaNativeBanner.TAG, "shouldOverrideUrlLoading : " + str5);
                        if (str5 != null && !ZAdsAdtimaNativeBanner.this.mIsAdsClicked) {
                            ZAdsAdtimaNativeBanner.this.mIsAdsClicked = true;
                            if (str5.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onClicked();
                                }
                            } else if (str5.equals(ZAdsAction.URL_ACTION_CTA)) {
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onAction();
                                }
                            } else if (str5.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                                if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener != null) {
                                    ((ZAdsPartnerBannerAbstract) ZAdsAdtimaNativeBanner.this).mAdsListener.onReport();
                                }
                            } else if (str5.contains("adtima")) {
                                C20218v.m105636a().m105643h(str5);
                            }
                            ZAdsAdtimaNativeBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ZAdsAdtimaNativeBanner.this.mIsAdsClicked = false;
                                }
                            }, 1000L);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaNativeBanner.TAG, "shouldOverrideUrlLoading", e11);
                    }
                    return true;
                }
            });
            if (!z11) {
                this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaNativeBanner.2
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        return motionEvent.getAction() == 2;
                    }
                });
            }
            int i11 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
            }
            this.mAdsWebView0.setLayoutParams(layoutParams);
            this.mAdsWebView0.loadDataWithBaseURL(null, this.mHtmlData, "text/html", "UTF-8", null);
            this.mRootLayout.addView(this.mAdsWebView0, layoutParams);
            addView(this.mRootLayout);
        } catch (Exception unused2) {
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Adtima.m18328e(TAG, "--onConfigurationChanged");
        this.mHasOrientationChanged = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0003, B:6:0x000b, B:8:0x0011, B:10:0x001d, B:11:0x003b, B:13:0x003f, B:18:0x0022, B:20:0x0026, B:21:0x0028, B:22:0x002b, B:24:0x002f, B:25:0x0034, B:27:0x0038), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        super.onMeasure(i11, i12);
        try {
            if (getParent() == null || i12 != 0 || this.mAdsBannerSize == ZAdsBannerSize.FULL_PAGE) {
                return;
            }
            int size = View.MeasureSpec.getSize(i11);
            this.mAdsWidth = size;
            ZAdsBannerSize zAdsBannerSize = this.mAdsBannerSize;
            if (zAdsBannerSize != ZAdsBannerSize.R11_RECTANGLE) {
                if (zAdsBannerSize == ZAdsBannerSize.R31_RECTANGLE) {
                    i13 = size * 100;
                } else {
                    if (zAdsBannerSize != ZAdsBannerSize.R169_RECTANGLE) {
                        if (zAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE) {
                            i13 = size * 250;
                        }
                        if (this.mHasOrientationChanged) {
                            return;
                        }
                        this.mHasOrientationChanged = false;
                        reloadWebView();
                        return;
                    }
                    size = (size * 9) / 16;
                }
                size = i13 / 300;
            }
            this.mAdsHeight = size;
            if (this.mHasOrientationChanged) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener((SensorEventListener) null);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void resumeAdsPartner() {
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener((SensorEventListener) null, this.mAccelerometer, 2);
        }
    }
}
