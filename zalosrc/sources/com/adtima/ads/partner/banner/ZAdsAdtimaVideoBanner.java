package com.adtima.ads.partner.banner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import p227i3.AbstractC20216t;
import p227i3.C20209m;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p250j.C20894a;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaVideoBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaVideoBanner";
    private ZAdsBannerSize mAdSize;
    private C17718a mAdsData;
    private BroadcastReceiver mAdsPowerKeyReceiver;
    private boolean mAdsSoundOn;
    private ZVideoControl mAdsVideoControl;
    boolean mHasOrientationChanged;
    private boolean mIsAdsClicked;
    private C20209m.e mOMSession;
    private FrameLayout mRootLayout;

    public ZAdsAdtimaVideoBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a, boolean z11) {
        super(context);
        this.mIsAdsClicked = false;
        this.mRootLayout = null;
        this.mAdsVideoControl = null;
        this.mAdsPowerKeyReceiver = null;
        this.mOMSession = null;
        this.mHasOrientationChanged = false;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsData = c17718a;
            this.mAdsSoundOn = z11;
            this.mAdSize = zAdsBannerSize;
            FrameLayout frameLayout = new FrameLayout(context);
            this.mRootLayout = frameLayout;
            frameLayout.setBackgroundColor(Color.parseColor("#2C2C2C"));
            int i13 = AbstractC22010c.f108378a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i13);
            layoutParams.gravity = 17;
            this.mRootLayout.setLayoutParams(layoutParams);
        } catch (Exception unused) {
        }
    }

    private void registerScreenOffReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.mAdsPowerKeyReceiver = new BroadcastReceiver() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && ZAdsAdtimaVideoBanner.this.isAdsMediaPlaying()) {
                            ZAdsAdtimaVideoBanner.this.pauseVideo();
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            getContext().registerReceiver(this.mAdsPowerKeyReceiver, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a3 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0001, B:5:0x006b, B:8:0x007e, B:10:0x00a3, B:11:0x00ab, B:14:0x00b3, B:16:0x00b7, B:17:0x00c4, B:19:0x00cc, B:22:0x00d4, B:33:0x0111, B:34:0x011d, B:35:0x0125, B:36:0x012d, B:37:0x00ee, B:40:0x00f8, B:43:0x0100, B:46:0x0139, B:47:0x0144, B:49:0x014a, B:51:0x0152, B:53:0x0158, B:55:0x015d, B:56:0x0164, B:57:0x0169, B:59:0x017e, B:62:0x0183, B:66:0x0167, B:67:0x0073), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3 A[Catch: Exception -> 0x0070, TRY_ENTER, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0001, B:5:0x006b, B:8:0x007e, B:10:0x00a3, B:11:0x00ab, B:14:0x00b3, B:16:0x00b7, B:17:0x00c4, B:19:0x00cc, B:22:0x00d4, B:33:0x0111, B:34:0x011d, B:35:0x0125, B:36:0x012d, B:37:0x00ee, B:40:0x00f8, B:43:0x0100, B:46:0x0139, B:47:0x0144, B:49:0x014a, B:51:0x0152, B:53:0x0158, B:55:0x015d, B:56:0x0164, B:57:0x0169, B:59:0x017e, B:62:0x0183, B:66:0x0167, B:67:0x0073), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0001, B:5:0x006b, B:8:0x007e, B:10:0x00a3, B:11:0x00ab, B:14:0x00b3, B:16:0x00b7, B:17:0x00c4, B:19:0x00cc, B:22:0x00d4, B:33:0x0111, B:34:0x011d, B:35:0x0125, B:36:0x012d, B:37:0x00ee, B:40:0x00f8, B:43:0x0100, B:46:0x0139, B:47:0x0144, B:49:0x014a, B:51:0x0152, B:53:0x0158, B:55:0x015d, B:56:0x0164, B:57:0x0169, B:59:0x017e, B:62:0x0183, B:66:0x0167, B:67:0x0073), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void reloadWebView() {
        FrameLayout.LayoutParams layoutParams;
        String str;
        char c11;
        boolean z11 = false;
        try {
            setBackgroundColor(0);
            setLayoutParams(new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight));
            removeView(this.mRootLayout);
            FrameLayout frameLayout = new FrameLayout(this.mAdsContext);
            this.mRootLayout = frameLayout;
            frameLayout.setBackgroundColor(Color.parseColor("#2C2C2C"));
            int i11 = AbstractC22010c.f108378a;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i11);
            layoutParams2.gravity = 17;
            this.mRootLayout.setLayoutParams(layoutParams2);
            int i12 = AbstractC22010c.f108378a;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i12, i12);
            WebView webView = new WebView(getContext());
            this.mAdsWebView0 = webView;
            webView.setLayoutParams(layoutParams3);
            AbstractC19214i.m100838d(this.mAdsWebView0, 0);
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.6
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                    if (str2 != null) {
                        try {
                            if (!ZAdsAdtimaVideoBanner.this.mIsAdsClicked) {
                                ZAdsAdtimaVideoBanner.this.mIsAdsClicked = true;
                                if (str2.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onClicked();
                                    }
                                } else if (str2.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onReport();
                                    }
                                } else if (str2.contains("adtima")) {
                                    C20218v.m105636a().m105643h(str2);
                                }
                                ZAdsAdtimaVideoBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.6.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZAdsAdtimaVideoBanner.this.mIsAdsClicked = false;
                                    }
                                }, 1000L);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            });
            this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.7
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZAdsBannerSize zAdsBannerSize = this.mAdSize;
            ZAdsBannerSize zAdsBannerSize2 = ZAdsBannerSize.MEDIUM_RECTANGLE;
            if (zAdsBannerSize != zAdsBannerSize2) {
                if (zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                }
                this.mAdsWebView0.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94006c, "text/html", "UTF-8", null);
                this.mRootLayout.addView(this.mAdsWebView0);
                layoutParams = new FrameLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
                if (this.mAdsWidth == 0) {
                    this.mAdsWidth = AbstractC20216t.m105523d(this.mAdsContext);
                }
                if (this.mAdsWidth > 0) {
                    if (this.mAdSize == zAdsBannerSize2) {
                        int i13 = this.mAdsWidth;
                        layoutParams = new FrameLayout.LayoutParams(i13, (i13 * 9) / 16);
                    } else {
                        String str2 = this.mAdsData.f89802a.f508g0;
                        if (str2 != null && str2.length() != 0) {
                            String str3 = this.mAdsData.f89802a.f508g0;
                            int hashCode = str3.hashCode();
                            if (hashCode == -894674659) {
                                if (str3.equals("square")) {
                                    c11 = 1;
                                    if (c11 != 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                            } else if (hashCode != 3154575) {
                                if (hashCode == 1544803905 && str3.equals("default")) {
                                    c11 = 0;
                                    if (c11 != 0) {
                                        int i14 = this.mAdsWidth;
                                        layoutParams = new FrameLayout.LayoutParams(i14, (i14 * 9) / 16);
                                    } else if (c11 == 1) {
                                        int i15 = this.mAdsWidth;
                                        layoutParams = new FrameLayout.LayoutParams(i15, i15);
                                    } else if (c11 != 2) {
                                        int i16 = this.mAdsWidth;
                                        layoutParams = new FrameLayout.LayoutParams(i16, (i16 * 9) / 16);
                                    } else {
                                        int i17 = AbstractC22010c.f108378a;
                                        layoutParams = new FrameLayout.LayoutParams(i17, i17);
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                            } else {
                                if (str3.equals("full")) {
                                    c11 = 2;
                                    if (c11 != 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 != 0) {
                                }
                            }
                        }
                        int i18 = this.mAdsWidth;
                        layoutParams = new FrameLayout.LayoutParams(i18, (i18 * 9) / 16);
                    }
                }
                if (this.mAdSize == ZAdsBannerSize.FULL_PAGE || (str = this.mAdsData.f89802a.f508g0) == null || str.equals("full")) {
                    layoutParams.gravity = 17;
                } else {
                    int i19 = this.mAdsWidth / 2;
                    if (i19 <= 0) {
                        i19 = AbstractC20216t.m105523d(this.mAdsContext) / 2;
                    }
                    layoutParams.topMargin = i19;
                }
                ZVideoControl zVideoControl = new ZVideoControl(getContext(), this.mAdsVastListener);
                this.mAdsVideoControl = zVideoControl;
                if (!this.mAdsData.f89802a.f500c0 && this.mAdsSoundOn) {
                    z11 = true;
                }
                zVideoControl.setSoundOn(z11);
                this.mAdsVideoControl.setLayoutParams(layoutParams);
                this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.8
                    @Override // com.adtima.control.ZVideoControl.C3871j
                    public void onInteracted() {
                        super.onInteracted();
                        try {
                            if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                                ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onInteracted();
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
                this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
                this.mRootLayout.addView(this.mAdsVideoControl, layoutParams);
                addView(this.mRootLayout);
            }
            this.mAdsWebView0.getSettings().setTextZoom(100);
            this.mAdsWebView0.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94006c, "text/html", "UTF-8", null);
            this.mRootLayout.addView(this.mAdsWebView0);
            layoutParams = new FrameLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            if (this.mAdsWidth == 0) {
            }
            if (this.mAdsWidth > 0) {
            }
            if (this.mAdSize == ZAdsBannerSize.FULL_PAGE) {
            }
            layoutParams.gravity = 17;
            ZVideoControl zVideoControl2 = new ZVideoControl(getContext(), this.mAdsVastListener);
            this.mAdsVideoControl = zVideoControl2;
            if (!this.mAdsData.f89802a.f500c0) {
                z11 = true;
            }
            zVideoControl2.setSoundOn(z11);
            this.mAdsVideoControl.setLayoutParams(layoutParams);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.8
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
            this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
            this.mRootLayout.addView(this.mAdsVideoControl, layoutParams);
            addView(this.mRootLayout);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void unregisterScreenOffReceiver() {
        try {
            if (this.mAdsPowerKeyReceiver != null) {
                getContext().unregisterReceiver(this.mAdsPowerKeyReceiver);
                this.mAdsPowerKeyReceiver = null;
            }
        } catch (Exception unused) {
            this.mAdsPowerKeyReceiver = null;
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        C20209m.e eVar;
        try {
            AbstractC19214i.m100837c(this.mAdsWebView0);
            this.mAdsWebView0 = null;
            AbstractC19214i.m100840f(this.mAdsVideoControl);
            this.mAdsVideoControl = null;
            if (AbstractC20202f.f99835s && (eVar = this.mOMSession) != null) {
                eVar.m105449d();
                this.mOMSession = null;
            }
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mAdsVastListener = null;
            unregisterScreenOffReceiver();
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000c, B:11:0x0018, B:13:0x0023, B:15:0x0027, B:16:0x0030, B:18:0x006b, B:20:0x007a, B:22:0x009f, B:23:0x00a7, B:26:0x00af, B:28:0x00b3, B:29:0x00c0, B:31:0x00c8, B:34:0x00d0, B:45:0x010d, B:46:0x0119, B:47:0x0121, B:48:0x0129, B:49:0x00ea, B:52:0x00f4, B:55:0x00fc, B:58:0x0135, B:59:0x0140, B:61:0x0146, B:63:0x014e, B:65:0x0154, B:67:0x0159, B:68:0x0160, B:69:0x0167, B:71:0x017c, B:74:0x0181, B:76:0x0163, B:77:0x006f), top: B:2:0x0002 }] */
    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadAdsPartner() {
        String str;
        char c11;
        try {
            if (AbstractC19211f.m100807b(21)) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            int i11 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                layoutParams = new LinearLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
            }
            boolean z11 = false;
            setBackgroundColor(0);
            setLayoutParams(layoutParams);
            int i12 = AbstractC22010c.f108378a;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i12);
            WebView webView = new WebView(getContext());
            this.mAdsWebView0 = webView;
            webView.setLayoutParams(layoutParams2);
            AbstractC19214i.m100838d(this.mAdsWebView0, 0);
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                    if (str2 != null) {
                        try {
                            if (!ZAdsAdtimaVideoBanner.this.mIsAdsClicked) {
                                ZAdsAdtimaVideoBanner.this.mIsAdsClicked = true;
                                if (str2.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onClicked();
                                    }
                                } else if (str2.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onReport();
                                    }
                                } else if (str2.contains("adtima")) {
                                    C20218v.m105636a().m105643h(str2);
                                }
                                ZAdsAdtimaVideoBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZAdsAdtimaVideoBanner.this.mIsAdsClicked = false;
                                    }
                                }, 1000L);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            });
            this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZAdsBannerSize zAdsBannerSize = this.mAdSize;
            ZAdsBannerSize zAdsBannerSize2 = ZAdsBannerSize.MEDIUM_RECTANGLE;
            if (zAdsBannerSize == zAdsBannerSize2 || zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                this.mAdsWebView0.getSettings().setTextZoom(100);
            }
            this.mAdsWebView0.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94006c, "text/html", "UTF-8", null);
            this.mRootLayout.addView(this.mAdsWebView0);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            if (this.mAdsWidth == 0) {
                this.mAdsWidth = AbstractC20216t.m105523d(this.mAdsContext);
            }
            if (this.mAdsWidth > 0) {
                if (this.mAdSize == zAdsBannerSize2) {
                    int i13 = this.mAdsWidth;
                    layoutParams3 = new FrameLayout.LayoutParams(i13, (i13 * 9) / 16);
                } else {
                    String str2 = this.mAdsData.f89802a.f508g0;
                    if (str2 != null && str2.length() != 0) {
                        String str3 = this.mAdsData.f89802a.f508g0;
                        int hashCode = str3.hashCode();
                        if (hashCode == -894674659) {
                            if (str3.equals("square")) {
                                c11 = 1;
                                if (c11 != 0) {
                                }
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                        } else if (hashCode != 3154575) {
                            if (hashCode == 1544803905 && str3.equals("default")) {
                                c11 = 0;
                                if (c11 != 0) {
                                    int i14 = this.mAdsWidth;
                                    layoutParams3 = new FrameLayout.LayoutParams(i14, (i14 * 9) / 16);
                                } else if (c11 == 1) {
                                    int i15 = this.mAdsWidth;
                                    layoutParams3 = new FrameLayout.LayoutParams(i15, i15);
                                } else if (c11 != 2) {
                                    int i16 = this.mAdsWidth;
                                    layoutParams3 = new FrameLayout.LayoutParams(i16, (i16 * 9) / 16);
                                } else {
                                    int i17 = AbstractC22010c.f108378a;
                                    layoutParams3 = new FrameLayout.LayoutParams(i17, i17);
                                }
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                        } else {
                            if (str3.equals("full")) {
                                c11 = 2;
                                if (c11 != 0) {
                                }
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                        }
                    }
                    int i18 = this.mAdsWidth;
                    layoutParams3 = new FrameLayout.LayoutParams(i18, (i18 * 9) / 16);
                }
            }
            if (this.mAdSize != ZAdsBannerSize.FULL_PAGE || (str = this.mAdsData.f89802a.f508g0) == null || str.equals("full")) {
                layoutParams3.gravity = 17;
            } else {
                int i19 = this.mAdsWidth / 2;
                if (i19 <= 0) {
                    i19 = AbstractC20216t.m105523d(this.mAdsContext) / 2;
                }
                layoutParams3.topMargin = i19;
            }
            ZVideoControl zVideoControl = new ZVideoControl(getContext(), this.mAdsVastListener);
            this.mAdsVideoControl = zVideoControl;
            if (!this.mAdsData.f89802a.f500c0 && this.mAdsSoundOn) {
                z11 = true;
            }
            zVideoControl.setSoundOn(z11);
            this.mAdsVideoControl.setLayoutParams(layoutParams3);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.3
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsListener.onInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
            this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
            this.mAdsVideoControl.setIsAdtimaVideo(this.mAdsData.f89802a.f546z0);
            this.mRootLayout.addView(this.mAdsVideoControl, layoutParams3);
            addView(this.mRootLayout);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
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
                postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaVideoBanner.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner = ZAdsAdtimaVideoBanner.this;
                        zAdsAdtimaVideoBanner.mHasOrientationChanged = false;
                        View view = (View) zAdsAdtimaVideoBanner.getParent();
                        if (view != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaVideoBanner.this).mAdsWidth = view.getWidth();
                            if (ZAdsAdtimaVideoBanner.this.mAdSize == ZAdsBannerSize.R11_RECTANGLE) {
                                ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner2 = ZAdsAdtimaVideoBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner2).mAdsHeight = ((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner2).mAdsWidth;
                            } else if (ZAdsAdtimaVideoBanner.this.mAdSize == ZAdsBannerSize.R31_RECTANGLE) {
                                ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner3 = ZAdsAdtimaVideoBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner3).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner3).mAdsWidth * 100) / 300;
                            } else if (ZAdsAdtimaVideoBanner.this.mAdSize == ZAdsBannerSize.R169_RECTANGLE) {
                                ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner4 = ZAdsAdtimaVideoBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner4).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner4).mAdsWidth * 9) / 16;
                            } else if (ZAdsAdtimaVideoBanner.this.mAdSize == ZAdsBannerSize.MEDIUM_RECTANGLE) {
                                ZAdsAdtimaVideoBanner zAdsAdtimaVideoBanner5 = ZAdsAdtimaVideoBanner.this;
                                ((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner5).mAdsHeight = (((ZAdsPartnerBannerAbstract) zAdsAdtimaVideoBanner5).mAdsWidth * 250) / 300;
                            }
                            ZAdsAdtimaVideoBanner.this.reloadWebView();
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
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("playVideo SOUND : ");
            sb2.append(this.mAdsSoundFocus ? "TRUE" : "FALSE");
            Adtima.m18328e(str, sb2.toString());
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
