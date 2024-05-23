package com.adtima.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsAudioPartnerListener;
import com.adtima.ads.partner.ZAdsPartnerInterstitialAbstract;
import com.adtima.ads.partner.interstitial.ZAdsGoogleIMAIntertitial;
import com.adtima.control.ZAudioControl;
import com.adtima.control.ZVideoControl;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0098c;
import p009a3.C0100e;
import p029b3.C2503a;
import p029b3.C2504b;
import p047c3.C3228a;
import p090d3.C17719b;
import p178g3.AbstractC19209d;
import p178g3.AbstractC19211f;
import p178g3.AbstractC19214i;
import p196h3.InterfaceC19747i;
import p227i3.AbstractC20202f;
import p227i3.AbstractC20216t;
import p227i3.C20209m;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20218v;
import p250j.C20894a;
import p309l.C21976d;
import p309l.EnumC21975c;
import p313l3.AbstractC22010c;
import p313l3.AbstractC22011d;
import p350n.C23498d;
import p350n.EnumC23496b;

/* loaded from: classes2.dex */
public final class ZAdsActivity extends Activity implements InterfaceC19747i {
    private static final String TAG = "ZAdsActivity";
    private static ZAdsListener mAdsListener;
    private static C2503a mAudioProfile;
    private static C3228a mQoSEntity;
    private static C2504b mVideoProfile;
    private ZAdsAudioPartnerListener mAdsDaastListener = null;
    private Context mAdsContext = null;
    private WebView mAdsContentView = null;
    private WebView mAdsHeaderView = null;
    private WebView mAdsFooterView = null;
    private WebView mAdsEndCardView = null;
    private ZVideoControl mAdsVideoControl = null;
    private TextView mAdsSkipAfterTextView = null;
    private TextView mAdsSkipNowTextView = null;
    private ZAudioControl mAdsAudioControl = null;
    private RelativeLayout mAdsContainer = null;
    private RelativeLayout mCardLayout = null;
    private RelativeLayout clickTagLayout = null;
    private LinearLayout mRichHeaderLayout = null;
    private LinearLayout mRichBodyLayout = null;
    private C17719b mAdsData = null;
    private boolean mAdsIsRefreshPageByOrientation = false;
    private boolean mAdsVastOrDaastImpressionWaiting = false;
    private List<String> mAdsVastOrDaastImpressionUrl = null;
    private boolean mAdsAutoPlayPrefer = true;
    private boolean mAdsSoundOnPrefer = true;
    private boolean mAdsDismissOnClickedPrefer = false;
    private boolean mAdsDismissOnCompletedPrefer = false;
    private boolean mAdsAllowBack = true;
    private boolean mAdsClickedOccured = false;
    private int mAdsWidth = 0;
    private int mAdsHeight = 0;
    private int mAdsOrientationPrefer = 0;
    private String mAdsContentId = "";
    private String mAdZoneId = "";
    private String mAdLoadTag = "";
    private Handler mHandler = null;
    private Runnable mRunnable = null;
    private AudioManager mAudioManager = null;
    private BroadcastReceiver mAdsPowerKeyReceiver = null;
    private AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = null;
    private C20209m.d mOMSession = null;
    private C20209m.b mOMAudioSession = null;
    private C20209m.e mOMVideoSession = null;
    private C20209m.c mOMHtmlSession = null;
    private AbstractRunnableC0008c mDownloadTask = null;
    private String mClickThrougUrl = "";
    private boolean mIsAdsClicked = false;
    private boolean mHasNotch = false;
    private boolean mIsOnCloseCalled = false;
    private boolean mIsAdBackup = false;
    private String mAdsKind = "nil";
    private ZAdsPartnerInterstitialAbstract mAdsNetworkView = null;

    private void buildAdtimaAudioInterstitial() {
        try {
            View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__fullpage_adtima_audio, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            int parseColor = Color.parseColor(AbstractC20202f.f99783K);
            inflate.setBackgroundColor(parseColor);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsContentView = webView;
            AbstractC19214i.m100838d(webView, parseColor);
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.24
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    Adtima.m18326d(ZAdsActivity.TAG, "Adtima onPageFinished");
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.25
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZAudioControl zAudioControl = (ZAudioControl) inflate.findViewById(AbstractC3874e.zad__audio_control);
            this.mAdsAudioControl = zAudioControl;
            zAudioControl.setAudioListener(this.mAdsDaastListener);
            ZAudioControl zAudioControl2 = this.mAdsAudioControl;
            C0098c c0098c = this.mAdsData.f89805a;
            zAudioControl2.m18439k(c0098c.f504e0, c0098c.f506f0);
            this.mAdsAudioControl.setListener(new ZAudioControl.C3861j() { // from class: com.adtima.ads.ZAdsActivity.26
                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onCompleted() {
                    super.onCompleted();
                    try {
                        ZAdsActivity.this.processOnComplete();
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onSkipped() {
                    super.onSkipped();
                    try {
                        if (ZAdsActivity.mAdsListener != null && ZAdsActivity.this.mAdsData != null) {
                            if (!ZAdsActivity.this.mAdsKind.equals("video") && !ZAdsActivity.this.mAdsKind.equals("rich")) {
                                if (ZAdsActivity.this.mAdsKind.equals("audio")) {
                                    ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.SKIPPED);
                                }
                                ZAdsActivity.mAdsListener.onAdsClosed();
                                ZAdsActivity.mAdsListener.onAdsClosed(true);
                                ZAdsActivity.this.mIsOnCloseCalled = true;
                            }
                            ZAdsActivity.mAdsListener.onAdsVideoStage(ZAdsVideoStage.SKIPPED);
                            ZAdsActivity.mAdsListener.onAdsClosed();
                            ZAdsActivity.mAdsListener.onAdsClosed(true);
                            ZAdsActivity.this.mIsOnCloseCalled = true;
                        }
                        ZAdsActivity.this.finish();
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildAdtimaAudioInterstitial", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: Exception -> 0x0167, TryCatch #0 {Exception -> 0x0167, blocks: (B:2:0x0000, B:4:0x004c, B:5:0x004e, B:9:0x0057, B:11:0x005f, B:14:0x0067, B:25:0x00a5, B:26:0x00b1, B:27:0x00b9, B:28:0x00c1, B:29:0x0082, B:32:0x008c, B:35:0x0094, B:38:0x00cd, B:39:0x00d8, B:41:0x00e0, B:43:0x00e6, B:45:0x00eb, B:46:0x00f2, B:47:0x00fa, B:51:0x00f5), top: B:1:0x0000 }] */
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildAdtimaEndCardInterstitialWithXML() {
        char c11;
        try {
            View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__activity_sub_layout, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsContentView = webView;
            AbstractC19214i.m100838d(webView, -16777216);
            inflate.findViewById(AbstractC3874e.zad__video_control).setVisibility(0);
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.10
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    Adtima.m18326d(ZAdsActivity.TAG, "Adtima onPageFinished");
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            int i11 = this.mAdsWidth;
            int i12 = this.mAdsHeight;
            if (i11 > i12) {
                this.mAdsWidth = i12;
            }
            if (this.mAdsWidth > 0 && i12 > 0) {
                String str = this.mAdsData.f89805a.f508g0;
                if (str != null && str.length() != 0) {
                    String str2 = this.mAdsData.f89805a.f508g0;
                    int hashCode = str2.hashCode();
                    if (hashCode == -894674659) {
                        if (str2.equals("square")) {
                            c11 = 1;
                            if (c11 != 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    } else if (hashCode != 3154575) {
                        if (hashCode == 1544803905 && str2.equals("default")) {
                            c11 = 0;
                            if (c11 != 0) {
                                int i13 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i13, (i13 * 9) / 16);
                            } else if (c11 == 1) {
                                int i14 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i14, i14);
                            } else if (c11 != 2) {
                                int i15 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i15, (i15 * 9) / 16);
                            } else {
                                int i16 = AbstractC22010c.f108378a;
                                layoutParams = new RelativeLayout.LayoutParams(i16, i16);
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    } else {
                        if (str2.equals("full")) {
                            c11 = 2;
                            if (c11 != 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    }
                }
                int i17 = this.mAdsWidth;
                layoutParams = new RelativeLayout.LayoutParams(i17, (i17 * 9) / 16);
            }
            String str3 = this.mAdsData.f89805a.f508g0;
            if (str3 == null || str3.equals("full")) {
                layoutParams.addRule(13);
            } else {
                int i18 = this.mAdsWidth / 2;
                if (i18 <= 0) {
                    i18 = AbstractC20216t.m105523d(this.mAdsContext) / 2;
                }
                layoutParams.topMargin = i18;
            }
            ZVideoControl zVideoControl = (ZVideoControl) inflate.findViewById(AbstractC3874e.zad__video_control);
            this.mAdsVideoControl = zVideoControl;
            zVideoControl.setVastListener(this);
            this.mAdsVideoControl.setLayoutParams(layoutParams);
            this.mAdsVideoControl.setSoundOn(this.mAdsSoundOnPrefer);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.ZAdsActivity.12
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onCompleted() {
                    super.onCompleted();
                    try {
                        if (ZAdsActivity.this.mAdsVideoControl != null) {
                            ZAdsActivity.this.mAdsVideoControl.setVisibility(8);
                        }
                        if (ZAdsActivity.this.mAdsContentView != null) {
                            ZAdsActivity.this.mAdsContentView.setVisibility(8);
                        }
                        if (ZAdsActivity.this.mCardLayout != null) {
                            ZAdsActivity.this.mCardLayout.setVisibility(0);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "onCompleted", e11);
                    }
                }

                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mCardLayout = (RelativeLayout) inflate.findViewById(AbstractC3874e.zad__card_layout);
            WebView webView2 = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_1);
            this.mAdsEndCardView = webView2;
            AbstractC19214i.m100838d(webView2, 0);
            findViewById(AbstractC3874e.zad__view_replay).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsActivity.this.mAdsVideoControl != null) {
                            ZAdsActivity.this.mAdsVideoControl.setVisibility(0);
                            ZAdsActivity.this.mAdsVideoControl.m18514l0();
                        }
                        if (ZAdsActivity.this.mAdsContentView != null) {
                            ZAdsActivity.this.mAdsContentView.setVisibility(0);
                        }
                        if (ZAdsActivity.this.mCardLayout != null) {
                            ZAdsActivity.this.mCardLayout.setVisibility(8);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "onCompleted", e11);
                    }
                }
            });
            this.mAdsEndCardView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.14
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str4);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsEndCardView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.15
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            this.mAdsEndCardView.loadDataWithBaseURL(null, this.mAdsData.f89806b.f94012c, "text/html", "UTF-8", null);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void buildAdtimaHtmlInterstitialWithXML() {
        try {
            View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__activity_sub_layout, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            inflate.setBackgroundColor(-16777216);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsContentView = webView;
            webView.setScrollContainer(false);
            this.mAdsContentView.getSettings().setJavaScriptEnabled(true);
            this.mAdsContentView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.mAdsContentView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            this.mAdsContentView.setBackgroundColor(-16777216);
            this.mAdsContentView.setVerticalScrollBarEnabled(false);
            this.mAdsContentView.setHorizontalScrollBarEnabled(false);
            this.mAdsContentView.getSettings().setCacheMode(2);
            this.mAdsContentView.getSettings().setMixedContentMode(2);
            try {
                C17719b c17719b = this.mAdsData;
                if (c17719b != null && c17719b.f89805a.f469B0.equals("programmatic")) {
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.mAdsContentView, true);
                    MobileAds.registerWebView(this.mAdsContentView);
                }
            } catch (Exception unused) {
            }
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.27
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    Adtima.m18326d(ZAdsActivity.TAG, "Adtima onLoaded");
                    try {
                        C3228a unused2 = ZAdsActivity.mQoSEntity = C20212p.m105468m().m105471b(ZAdsActivity.mQoSEntity, ZAdsActivity.this.mAdsKind, true);
                        if (AbstractC20202f.f99835s && ZAdsActivity.this.mOMHtmlSession != null) {
                            if (ZAdsActivity.this.clickTagLayout == null) {
                                ZAdsActivity.this.mOMHtmlSession.m105436c(ZAdsActivity.this.mAdsContentView);
                            } else {
                                ZAdsActivity.this.mOMHtmlSession.m105437d(ZAdsActivity.this.mAdsContentView, ZAdsActivity.this.clickTagLayout);
                            }
                        }
                        ZAdsActivity.this.checkIfHaveImpressionAndActiveView();
                        C0100e m105520a = AbstractC20216t.m105520a(ZAdsActivity.this.mAdsContext);
                        ZAdsActivity.this.requestScreenSize(m105520a.f572a, m105520a.f573b);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima onPageFinished", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    if (str != null) {
                        try {
                            if (str.equals(ZAdsAction.URL_ACTION_CLOSE)) {
                                if (ZAdsActivity.mAdsListener != null) {
                                    ZAdsActivity.mAdsListener.onAdsClosed();
                                    ZAdsActivity.mAdsListener.onAdsClosed(true);
                                    ZAdsActivity.this.mIsOnCloseCalled = true;
                                }
                                ZAdsActivity.this.requestSoundOff();
                                ZAdsActivity.this.finish();
                            } else if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                Adtima.m18326d(ZAdsActivity.TAG, "Adtima onAdsOpened");
                                if (ZAdsActivity.mAdsListener != null) {
                                    ZAdsActivity.mAdsListener.onAdsOpened();
                                }
                                ZAdsActivity.this.checkIfHaveClick();
                            } else if (str.equals(ZAdsAction.URL_ACTION_INTERACT)) {
                                if (ZAdsActivity.mAdsListener != null) {
                                    ZAdsActivity.mAdsListener.onAdsInteracted();
                                }
                            } else if (str.equals(ZAdsAction.URL_ACTION_CTA)) {
                                Adtima.m18326d(ZAdsActivity.TAG, "Adtima onAdsOpened");
                                if (ZAdsActivity.mAdsListener != null) {
                                    ZAdsActivity.mAdsListener.onAdsOpened();
                                }
                                ZAdsActivity.this.checkIfHaveAction();
                            } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_ON)) {
                                ZAdsActivity.this.requestAudioFocus();
                            } else if (str.equals(ZAdsAction.URL_ACTION_SOUND_OFF)) {
                                ZAdsActivity.this.requestAudioUnFocus();
                            } else if (str.startsWith(ZAdsAction.URL_ACTION_CLICK)) {
                                String replace = str.replace("zads://action_click?target=", "");
                                Adtima.m18326d(ZAdsActivity.TAG, "Target: " + replace);
                                C20218v.m105636a().m105639d(replace, ZAdsActivity.this.mAdsData.f89805a);
                                ZAdsActivity.this.checkIfHaveTracking(4);
                            } else {
                                if (ZAdsActivity.mAdsListener != null) {
                                    ZAdsActivity.mAdsListener.onAdsClicked();
                                }
                                C20218v.m105636a().m105639d(str, ZAdsActivity.this.mAdsData.f89805a);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        }
                    }
                    return true;
                }
            });
            this.mAdsContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.28
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            this.mAdsContentView.addJavascriptInterface(new ZAdsJSInterface(this.mAdsData.f89805a), "zadsJSInterface");
            int i11 = AbstractC22010c.f108378a;
            this.mAdsContentView.setLayoutParams(new RelativeLayout.LayoutParams(i11, i11));
            if (this.mAdsData.f89805a.f524o0) {
                int i12 = AbstractC22010c.f108378a;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i12);
                if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                    layoutParams = new RelativeLayout.LayoutParams(this.mAdsWidth, this.mAdsHeight);
                }
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(AbstractC3874e.zad_clicktag_panel);
                this.clickTagLayout = relativeLayout;
                relativeLayout.setVisibility(0);
                this.clickTagLayout.setLayoutParams(layoutParams);
                this.clickTagLayout.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.29
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            if (ZAdsActivity.mAdsListener != null) {
                                ZAdsActivity.mAdsListener.onAdsOpened();
                            }
                            ZAdsActivity.this.checkIfHaveClick();
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        } catch (Exception unused2) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void buildAdtimaInterstitialWithXML() {
        try {
            View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__activity_sub_layout, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            inflate.setBackgroundColor(-16777216);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsContentView = webView;
            AbstractC19214i.m100838d(webView, -16777216);
            if (AbstractC20202f.f99835s) {
                this.mAdsContentView.getSettings().setJavaScriptEnabled(true);
            }
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.5
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    Adtima.m18326d(ZAdsActivity.TAG, "Adtima onLoaded");
                    try {
                        C3228a unused = ZAdsActivity.mQoSEntity = C20212p.m105468m().m105471b(ZAdsActivity.mQoSEntity, ZAdsActivity.this.mAdsKind, true);
                        ZAdsActivity.this.checkIfHaveImpressionAndActiveView();
                        if (!AbstractC20202f.f99835s || ZAdsActivity.this.mOMSession == null) {
                            return;
                        }
                        ZAdsActivity.this.mOMSession.m105440c(ZAdsActivity.this.mAdsContentView, ZAdsActivity.this.mAdsData.f89805a);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima onPageFinished", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            registerAudioListener();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildAdtimaInterstitialWithXML", e11);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void buildAdtimaRichInterstitial() {
        try {
            View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__fullpage_adtima_rich, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            int i11 = this.mAdsWidth;
            int i12 = this.mAdsHeight;
            if (i11 > i12) {
                this.mAdsWidth = i12;
            }
            if (this.mAdsWidth > 0) {
                int i13 = this.mAdsWidth;
                layoutParams = new LinearLayout.LayoutParams(i13, (i13 * 9) / 16);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            if (this.mAdsWidth > 0) {
                int i14 = this.mAdsWidth;
                layoutParams2 = new LinearLayout.LayoutParams(i14, i14 / 3);
            }
            int i15 = AbstractC22010c.f108378a;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i15, i15);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsHeaderView = webView;
            webView.setLayoutParams(layoutParams2);
            AbstractC19214i.m100838d(this.mAdsHeaderView, -16777216);
            this.mAdsHeaderView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.16
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsHeaderView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.17
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            WebView webView2 = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_1);
            this.mAdsFooterView = webView2;
            webView2.setLayoutParams(layoutParams3);
            AbstractC19214i.m100838d(this.mAdsFooterView, -16777216);
            this.mAdsFooterView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.18
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsFooterView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.19
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZVideoControl zVideoControl = (ZVideoControl) inflate.findViewById(AbstractC3874e.zad__video_control);
            this.mAdsVideoControl = zVideoControl;
            zVideoControl.setVastListener(this);
            this.mAdsVideoControl.setLayoutParams(layoutParams);
            this.mAdsVideoControl.setClickPanelEnable(false);
            this.mAdsVideoControl.setSoundOn(this.mAdsSoundOnPrefer);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.ZAdsActivity.20
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onCompleted() {
                    super.onCompleted();
                    try {
                        ZAdsActivity.this.mAdsSkipAfterTextView.setVisibility(4);
                        ZAdsActivity.this.mAdsSkipNowTextView.setVisibility(0);
                        ZAdsActivity.this.processOnComplete();
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mAdsSkipAfterTextView = (TextView) inflate.findViewById(AbstractC3874e.zad__skip_after);
            TextView textView = (TextView) inflate.findViewById(AbstractC3874e.zad__skip_now);
            this.mAdsSkipNowTextView = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.21
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsActivity.mAdsListener != null && ZAdsActivity.this.mAdsData != null) {
                            if (!ZAdsActivity.this.mAdsKind.equals("video") && !ZAdsActivity.this.mAdsKind.equals("rich")) {
                                if (ZAdsActivity.this.mAdsKind.equals("audio")) {
                                    ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.SKIPPED);
                                }
                                ZAdsActivity.mAdsListener.onAdsClosed();
                                ZAdsActivity.mAdsListener.onAdsClosed(true);
                                ZAdsActivity.this.mIsOnCloseCalled = true;
                            }
                            ZAdsActivity.mAdsListener.onAdsVideoStage(ZAdsVideoStage.SKIPPED);
                            ZAdsActivity.mAdsListener.onAdsClosed();
                            ZAdsActivity.mAdsListener.onAdsClosed(true);
                            ZAdsActivity.this.mIsOnCloseCalled = true;
                        }
                        ZAdsActivity.this.finish();
                    } catch (Exception unused) {
                    }
                }
            });
            C0098c c0098c = this.mAdsData.f89805a;
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
                startRichSkipCountdown(this.mAdsData.f89805a.f506f0);
            }
            this.mAdsContainer.addView(inflate);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildAdtimaRichInterstitial", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:2:0x0000, B:5:0x0050, B:7:0x0054, B:9:0x005c, B:12:0x0064, B:23:0x00a1, B:24:0x00ad, B:25:0x00b5, B:26:0x00bd, B:27:0x007f, B:30:0x0088, B:33:0x0090, B:36:0x00c9, B:37:0x00d4, B:39:0x00dc, B:41:0x00e2, B:43:0x00e7, B:44:0x00ee, B:45:0x00f6, B:49:0x00f1), top: B:1:0x0000 }] */
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildAdtimaVideoInterstitialWithXML() {
        try {
            View inflate = LayoutInflater.from(this).inflate(AbstractC3875f.zad__activity_sub_layout, (ViewGroup) null);
            this.mAdsContainer.addView(inflate);
            inflate.setBackgroundColor(-16777216);
            WebView webView = (WebView) inflate.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsContentView = webView;
            AbstractC19214i.m100838d(webView, -16777216);
            char c11 = 0;
            inflate.findViewById(AbstractC3874e.zad__video_control).setVisibility(0);
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsActivity.7
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    Adtima.m18326d(ZAdsActivity.TAG, "Adtima onPageFinished");
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    try {
                        ZAdsActivity.this.handleUrlFromWebView(str);
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mAdsContentView.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.ZAdsActivity.8
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                String str = this.mAdsData.f89805a.f508g0;
                if (str != null && str.length() != 0) {
                    String str2 = this.mAdsData.f89805a.f508g0;
                    int hashCode = str2.hashCode();
                    if (hashCode == -894674659) {
                        if (str2.equals("square")) {
                            c11 = 1;
                            if (c11 != 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    } else if (hashCode != 3154575) {
                        if (hashCode == 1544803905 && str2.equals("default")) {
                            if (c11 != 0) {
                                int i11 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i11, (i11 * 9) / 16);
                            } else if (c11 == 1) {
                                int i12 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i12, i12);
                            } else if (c11 != 2) {
                                int i13 = this.mAdsWidth;
                                layoutParams = new RelativeLayout.LayoutParams(i13, (i13 * 9) / 16);
                            } else {
                                int i14 = AbstractC22010c.f108378a;
                                layoutParams = new RelativeLayout.LayoutParams(i14, i14);
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    } else {
                        if (str2.equals("full")) {
                            c11 = 2;
                            if (c11 != 0) {
                            }
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                        }
                    }
                }
                int i15 = this.mAdsWidth;
                layoutParams = new RelativeLayout.LayoutParams(i15, (i15 * 9) / 16);
            }
            String str3 = this.mAdsData.f89805a.f508g0;
            if (str3 == null || str3.equals("full")) {
                layoutParams.addRule(13);
            } else {
                int i16 = this.mAdsWidth / 2;
                if (i16 <= 0) {
                    i16 = AbstractC20216t.m105523d(this.mAdsContext) / 2;
                }
                layoutParams.topMargin = i16;
            }
            ZVideoControl zVideoControl = (ZVideoControl) inflate.findViewById(AbstractC3874e.zad__video_control);
            this.mAdsVideoControl = zVideoControl;
            zVideoControl.setVastListener(this);
            this.mAdsVideoControl.setLayoutParams(layoutParams);
            this.mAdsVideoControl.setSoundOn(this.mAdsSoundOnPrefer);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.ZAdsActivity.9
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onCompleted() {
                    super.onCompleted();
                    try {
                        ZAdsActivity.this.mAdsSkipAfterTextView.setVisibility(4);
                        ZAdsActivity.this.mAdsSkipNowTextView.setVisibility(0);
                        ZAdsActivity.this.processOnComplete();
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private void buildIMAAudioInterstitial() {
        try {
            ZAdsGoogleIMAIntertitial zAdsGoogleIMAIntertitial = new ZAdsGoogleIMAIntertitial(this, mAudioProfile, this.mAdsContainer, this.mAdsDaastListener, this.mAdsData.f89805a.f504e0);
            this.mAdsNetworkView = zAdsGoogleIMAIntertitial;
            zAdsGoogleIMAIntertitial.loadAdsPartner();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildAdtimaAudioInterstitial", e11);
        }
    }

    private LinearLayout buildReplayEndCardButtonPanel() {
        try {
            int i11 = AbstractC22010c.f108379b;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, AbstractC22011d.m114900a(this.mAdsContext, 6.0f), AbstractC22011d.m114900a(this.mAdsContext, 6.0f), 0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#333333"));
            gradientDrawable.setStroke(2, Color.parseColor("#d9d9d9"));
            gradientDrawable.setCornerRadius(10.0f);
            LinearLayout linearLayout = new LinearLayout(this.mAdsContext);
            try {
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(0);
                linearLayout.setBackground(gradientDrawable);
                int i12 = AbstractC22010c.f108379b;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i12, i12);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC22011d.m114900a(this.mAdsContext, 12.0f), AbstractC22011d.m114900a(this.mAdsContext, 12.0f));
                layoutParams3.gravity = 16;
                layoutParams3.setMargins(AbstractC22011d.m114900a(this.mAdsContext, 10.0f), 0, 0, 0);
                ImageView imageView = new ImageView(this.mAdsContext);
                imageView.setLayoutParams(layoutParams3);
                imageView.setImageResource(AbstractC3873d.zad__ic_endcard_replay);
                linearLayout.addView(imageView, layoutParams3);
                TextView textView = new TextView(this.mAdsContext);
                textView.bringToFront();
                textView.setId(AbstractC19214i.m100835a());
                textView.setLayoutParams(layoutParams2);
                textView.setTextColor(-1);
                textView.setPadding(AbstractC22011d.m114900a(this.mAdsContext, 8.0f), AbstractC22011d.m114900a(this.mAdsContext, 4.0f), AbstractC22011d.m114900a(this.mAdsContext, 8.0f), AbstractC22011d.m114900a(this.mAdsContext, 4.0f));
                textView.setText("Xem lại");
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.35
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            if (ZAdsActivity.this.mAdsVideoControl != null) {
                                ZAdsActivity.this.mAdsVideoControl.setVisibility(0);
                                ZAdsActivity.this.mAdsVideoControl.m18514l0();
                            }
                            if (ZAdsActivity.this.mAdsContentView != null) {
                                ZAdsActivity.this.mAdsContentView.setVisibility(0);
                            }
                            if (ZAdsActivity.this.mCardLayout != null) {
                                ZAdsActivity.this.mCardLayout.setVisibility(8);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onCompleted", e11);
                        }
                    }
                });
                linearLayout.addView(textView, layoutParams2);
                this.mCardLayout.addView(linearLayout, layoutParams);
                return linearLayout;
            } catch (Exception unused) {
                return linearLayout;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveAction() {
        String str;
        C20217u m105538N0;
        C0098c c0098c;
        String str2;
        int i11;
        try {
            try {
                C17719b c17719b = this.mAdsData;
                if (c17719b != null && (str = c17719b.f89805a.f505f) != null) {
                    if (str.equals("default")) {
                        checkIfHaveClick();
                    } else {
                        if (this.mAdsData.f89805a.f505f.equals("call")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 6;
                        } else if (this.mAdsData.f89805a.f505f.equals("chat")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 5;
                        } else if (this.mAdsData.f89805a.f505f.equals("follow")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 7;
                        }
                        m105538N0.m105608p(i11, c0098c, str2);
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
    public synchronized void checkIfHaveClick() {
        C20217u m105538N0;
        C0098c c0098c;
        String m125453a;
        ZAdsListener zAdsListener;
        C20217u m105538N02;
        List m125455d;
        C20217u m105538N03;
        C0098c c0098c2;
        String str;
        int i11;
        try {
            try {
                C17719b c17719b = this.mAdsData;
                if (c17719b != null) {
                    C0098c c0098c3 = c17719b.f89805a;
                    if (c0098c3.f522n0) {
                        String str2 = c0098c3.f505f;
                        if (str2 == null || str2.length() == 0 || !this.mAdsData.f89805a.f505f.equals("follow")) {
                            if (!this.mAdsKind.equals("audio") && !this.mAdsKind.equals("video") && !this.mAdsKind.equals("rich") && !this.mAdsKind.equals("endcard")) {
                                String str3 = this.mAdsData.f89805a.f512i0;
                                if (str3 == null || str3.length() == 0) {
                                    this.mAdsData.f89805a.f505f = "";
                                    m105538N03 = C20217u.m105538N0();
                                    c0098c2 = this.mAdsData.f89805a;
                                    str = this.mAdsContentId;
                                    i11 = 4;
                                } else {
                                    ZAdsListener zAdsListener2 = mAdsListener;
                                    C20217u.m105538N0().m105619y(this.mAdsData.f89805a, zAdsListener2 != null ? zAdsListener2.onAdsContentHandler(this.mAdsData.f89805a.f512i0) : false, this.mAdsContentId);
                                    checkIfHaveClickEventAndDismissOnClick();
                                }
                            }
                            String str4 = this.mAdsData.f89805a.f512i0;
                            if (str4 == null || str4.length() == 0 || (zAdsListener = mAdsListener) == null || !zAdsListener.onAdsContentHandler(this.mAdsData.f89805a.f512i0)) {
                                if (this.mAdsKind.equals("audio")) {
                                    if (!this.mIsAdBackup) {
                                        C20217u.m105538N0().m105596X(mAudioProfile.f10199a.m114758h().m117374d(), this.mAdsContentId);
                                    }
                                    if (!this.mAdsData.f89805a.f497b.equals("ima")) {
                                        m105538N0 = C20217u.m105538N0();
                                        c0098c = this.mAdsData.f89805a;
                                        m125453a = mAudioProfile.f10199a.m114758h().m117372a();
                                    } else if (!this.mClickThrougUrl.equals("")) {
                                        C20218v.m105636a().m105639d(this.mClickThrougUrl, this.mAdsData.f89805a);
                                    }
                                } else {
                                    if (!this.mIsAdBackup) {
                                        C20217u.m105538N0().m105596X(mVideoProfile.f10200a.m123359s().m125455d(), this.mAdsContentId);
                                    }
                                    m105538N0 = C20217u.m105538N0();
                                    c0098c = this.mAdsData.f89805a;
                                    m125453a = mVideoProfile.f10200a.m123359s().m125453a();
                                }
                                m105538N0.m105616w(c0098c, m125453a, this.mAdsContentId);
                            } else if (!this.mIsAdBackup) {
                                if (this.mAdsKind.equals("audio")) {
                                    m105538N02 = C20217u.m105538N0();
                                    m125455d = mAudioProfile.f10199a.m114758h().m117374d();
                                } else {
                                    m105538N02 = C20217u.m105538N0();
                                    m125455d = mVideoProfile.f10200a.m123359s().m125455d();
                                }
                                m105538N02.m105596X(m125455d, this.mAdsContentId);
                            }
                            checkIfHaveClickEventAndDismissOnClick();
                        } else {
                            m105538N03 = C20217u.m105538N0();
                            c0098c2 = this.mAdsData.f89805a;
                            str = this.mAdsContentId;
                            i11 = 7;
                        }
                        m105538N03.m105608p(i11, c0098c2, str);
                        checkIfHaveClickEventAndDismissOnClick();
                    }
                }
                ZAdsListener zAdsListener3 = mAdsListener;
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

    private synchronized void checkIfHaveClickEventAndDismissOnClick() {
        try {
            try {
                if (this.mAdsKind.equals("audio")) {
                    ZAudioControl zAudioControl = this.mAdsAudioControl;
                    if (zAudioControl != null) {
                        zAudioControl.m18436S();
                    }
                    ZAdsListener zAdsListener = mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsAudioStage(ZAdsAudioStage.CLICKED);
                    }
                } else if (this.mAdsKind.equals("video") || this.mAdsKind.equals("rich")) {
                    ZVideoControl zVideoControl = this.mAdsVideoControl;
                    if (zVideoControl != null) {
                        zVideoControl.m18513j0();
                    }
                    ZAdsListener zAdsListener2 = mAdsListener;
                    if (zAdsListener2 != null) {
                        zAdsListener2.onAdsVideoStage(ZAdsVideoStage.CLICKED);
                    }
                }
                if (this.mAdsDismissOnClickedPrefer) {
                    this.mAdsClickedOccured = true;
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveClickEventAndDismissOnClick", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveImpressionAndActiveView() {
        List<String> list;
        C17719b c17719b;
        C17719b c17719b2;
        ZAdsListener zAdsListener;
        ZAdsVideoStage zAdsVideoStage;
        ZAdsListener zAdsListener2;
        ZAdsAudioStage zAdsAudioStage;
        try {
            try {
                C20217u.m105538N0().m105587P("interstitial", this.mAdZoneId, this.mAdLoadTag);
                if (this.mAdsData == null || this.mAdsIsRefreshPageByOrientation || this.mAdsKind.equals("video") || this.mAdsKind.equals("rich") || this.mAdsKind.equals("endcard") || this.mAdsKind.equals("audio")) {
                    if (mAdsListener != null) {
                        C20217u.m105538N0().m105608p(8, this.mAdsData.f89805a, this.mAdsContentId);
                        if (this.mAdsKind.equals("audio")) {
                            if (this.mAdsAutoPlayPrefer) {
                                zAdsListener2 = mAdsListener;
                                zAdsAudioStage = ZAdsAudioStage.AUTO_PLAY;
                            } else {
                                zAdsListener2 = mAdsListener;
                                zAdsAudioStage = ZAdsAudioStage.CLICK_TO_PLAY;
                            }
                            zAdsListener2.onAdsAudioStage(zAdsAudioStage);
                            mAdsListener.onAdsAudioStage(ZAdsAudioStage.OPENED);
                        } else {
                            if (this.mAdsAutoPlayPrefer) {
                                zAdsListener = mAdsListener;
                                zAdsVideoStage = ZAdsVideoStage.AUTO_PLAY;
                            } else {
                                zAdsListener = mAdsListener;
                                zAdsVideoStage = ZAdsVideoStage.CLICK_TO_PLAY;
                            }
                            zAdsListener.onAdsVideoStage(zAdsVideoStage);
                            mAdsListener.onAdsVideoStage(ZAdsVideoStage.OPENED);
                        }
                    }
                    if (this.mAdsVastOrDaastImpressionWaiting && (list = this.mAdsVastOrDaastImpressionUrl) != null && list.size() != 0) {
                        if (!this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(this.mAdsVastOrDaastImpressionUrl, this.mAdsContentId);
                        }
                        this.mAdsVastOrDaastImpressionWaiting = false;
                        ZVideoControl zVideoControl = this.mAdsVideoControl;
                        if (zVideoControl != null && (c17719b2 = this.mAdsData) != null && !zVideoControl.m18510b0() && c17719b2.f89805a.f502d0 && this.mAdsAutoPlayPrefer) {
                            this.mAdsVideoControl.m18514l0();
                        }
                        ZAudioControl zAudioControl = this.mAdsAudioControl;
                        if (zAudioControl != null && (c17719b = this.mAdsData) != null && !zAudioControl.m18434N() && c17719b.f89805a.f502d0 && this.mAdsAutoPlayPrefer) {
                            this.mAdsAudioControl.m18437V();
                        }
                    }
                } else {
                    C20217u.m105538N0().m105608p(1, this.mAdsData.f89805a, this.mAdsContentId);
                    C20217u.m105538N0().m105608p(8, this.mAdsData.f89805a, this.mAdsContentId);
                    C20217u.m105538N0().m105608p(2, this.mAdsData.f89805a, this.mAdsContentId);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveImpressionAndActiveView", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveTracking(int i11) {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105615v0(i11, this.mAdsData.f89805a, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveTracking", e11);
        }
    }

    private void checkTimeoutNetwork(long j11) {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.32
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsActivity.this.mAdsAudioControl == null || ZAdsActivity.this.mAdsAudioControl.getDuration() != 0) {
                            return;
                        }
                        ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.SKIPPED);
                        ZAdsActivity.this.finishAfterAWhile();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "checkTimeoutNetwork", e11);
                    }
                }
            }, j11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkTimeoutNetwork", e11);
        }
    }

    private void clearAllDataAndView() {
        try {
            this.mAdsData = null;
            this.mAdsVastOrDaastImpressionUrl = null;
            this.mAdsVastOrDaastImpressionWaiting = false;
            requestSoundOff();
            requestAudioUnFocus();
            unregisterAudioListener();
            unregisterScreenOffReceiver();
            this.mAudioManager = null;
            if (AbstractC20202f.f99835s) {
                C20209m.d dVar = this.mOMSession;
                if (dVar != null) {
                    dVar.m105439b();
                    this.mOMSession = null;
                }
                C20209m.e eVar = this.mOMVideoSession;
                if (eVar != null) {
                    eVar.m105449d();
                    this.mOMVideoSession = null;
                }
                C20209m.c cVar = this.mOMHtmlSession;
                if (cVar != null) {
                    cVar.m105435b();
                    this.mOMHtmlSession = null;
                }
                C20209m.b bVar = this.mOMAudioSession;
                if (bVar != null) {
                    bVar.m105430d();
                    this.mOMAudioSession = null;
                }
                new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.31
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC19214i.m100837c(ZAdsActivity.this.mAdsContentView);
                        ZAdsActivity.this.mAdsContentView = null;
                    }
                }, 1200L);
            } else {
                AbstractC19214i.m100837c(this.mAdsContentView);
                this.mAdsContentView = null;
            }
            AbstractC19214i.m100837c(this.mAdsHeaderView);
            this.mAdsHeaderView = null;
            AbstractC19214i.m100837c(this.mAdsFooterView);
            this.mAdsFooterView = null;
            AbstractC19214i.m100840f(this.mAdsVideoControl);
            this.mAdsVideoControl = null;
            AbstractC19214i.m100839e(this.mAdsAudioControl);
            this.mAdsAudioControl = null;
            AbstractC19214i.m100836b(this.mRichHeaderLayout);
            this.mRichHeaderLayout = null;
            AbstractC19214i.m100836b(this.mRichBodyLayout);
            this.mRichBodyLayout = null;
            AbstractC19214i.m100836b(this.mAdsContainer);
            this.mAdsContainer = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "clearAllDataAndView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishAfterAWhile() {
        try {
            this.mHandler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.adtima.ads.ZAdsActivity.36
                @Override // java.lang.Runnable
                public void run() {
                    ZAdsActivity.this.finish();
                }
            };
            this.mRunnable = runnable;
            this.mHandler.postDelayed(runnable, 500L);
        } catch (Exception unused) {
        }
    }

    public static void handleAdsListener(ZAdsListener zAdsListener) {
        mAdsListener = zAdsListener;
    }

    public static void handleAudioProfile(C2503a c2503a) {
        mAudioProfile = c2503a;
    }

    public static void handleQoSEntity(C3228a c3228a) {
        mQoSEntity = c3228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUrlFromWebView(String str) {
        if (str != null) {
            try {
                if (this.mIsAdsClicked) {
                    return;
                }
                this.mIsAdsClicked = true;
                if (str.equals(ZAdsAction.URL_ACTION_CLOSE)) {
                    ZAdsListener zAdsListener = mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsClosed();
                        mAdsListener.onAdsClosed(true);
                        this.mIsOnCloseCalled = true;
                    }
                    finish();
                } else if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                    Adtima.m18326d(TAG, "Adtima onAdsOpened");
                    ZAdsListener zAdsListener2 = mAdsListener;
                    if (zAdsListener2 != null) {
                        zAdsListener2.onAdsOpened();
                    }
                    checkIfHaveClick();
                } else if (str.equals(ZAdsAction.URL_ACTION_CTA)) {
                    Adtima.m18326d(TAG, "Adtima onAdsOpened");
                    ZAdsListener zAdsListener3 = mAdsListener;
                    if (zAdsListener3 != null) {
                        zAdsListener3.onAdsOpened();
                    }
                    checkIfHaveAction();
                } else if (str.contains("adtima")) {
                    C20218v.m105636a().m105643h(str);
                }
                new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.22
                    @Override // java.lang.Runnable
                    public void run() {
                        ZAdsActivity.this.mIsAdsClicked = false;
                    }
                }, 1000L);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "Adtima shouldOverrideUrlLoading", e11);
            }
        }
    }

    public static void handleVideoProfile(C2504b c2504b) {
        mVideoProfile = c2504b;
    }

    private void initListener() {
        try {
            this.mAdsDaastListener = new ZAdsAudioPartnerListener() { // from class: com.adtima.ads.ZAdsActivity.4
                @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
                public void onAudioClick(String str, List<String> list) {
                    Adtima.m18326d(ZAdsActivity.TAG, "onAudioClick");
                    if (list != null) {
                        try {
                            if (list.size() != 0 && !ZAdsActivity.this.mIsAdBackup) {
                                C20217u.m105538N0().m105596X(list, ZAdsActivity.this.mAdsContentId);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onAudioClick", e11);
                            return;
                        }
                    }
                    if (str == null || str.length() == 0) {
                        return;
                    }
                    C20217u.m105538N0().m105616w(ZAdsActivity.this.mAdsData.f89805a, str, ZAdsActivity.this.mAdsContentId);
                }

                @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
                public void onAudioError(String str, List<String> list) {
                    Adtima.m18326d(ZAdsActivity.TAG, "onAudioError");
                    try {
                        C3228a unused = ZAdsActivity.mQoSEntity = C20212p.m105468m().m105471b(ZAdsActivity.mQoSEntity, ZAdsActivity.this.mAdsKind, false);
                        if (list != null && list.size() != 0) {
                            C20217u.m105538N0().m105594V(str, list);
                        }
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.ERROR);
                        }
                        ZAdsActivity.this.finish();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "onAudioError", e11);
                    }
                }

                @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
                public void onAudioEvent(EnumC21975c enumC21975c, List<String> list) {
                    Adtima.m18326d(ZAdsActivity.TAG, "onAudioEvent: " + enumC21975c);
                    if (list != null) {
                        try {
                            if (list.size() != 0 && !ZAdsActivity.this.mIsAdBackup) {
                                C20217u.m105538N0().m105596X(list, ZAdsActivity.this.mAdsContentId);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onAudioEvent", e11);
                            return;
                        }
                    }
                    if (enumC21975c == EnumC21975c.start) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.STARTED);
                        }
                        ZAdsActivity.this.trackOMAudioStarted();
                        return;
                    }
                    if (enumC21975c == EnumC21975c.pause) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.PAUSED);
                        }
                        ZAdsActivity.this.trackOMAudioEvent(5);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.resume) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.RESUMED);
                        }
                        ZAdsActivity.this.trackOMAudioEvent(6);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.complete) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.COMPLETED);
                        }
                        ZAdsActivity.this.trackOMAudioEvent(4);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.close) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.CLOSED);
                            return;
                        }
                        return;
                    }
                    if (enumC21975c == EnumC21975c.firstQuartile) {
                        ZAdsActivity.this.trackOMAudioEvent(1);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.midpoint) {
                        ZAdsActivity.this.trackOMAudioEvent(2);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.thirdQuartile) {
                        ZAdsActivity.this.trackOMAudioEvent(3);
                        return;
                    }
                    if (enumC21975c == EnumC21975c.mute) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.MUTE);
                        }
                        ZAdsActivity.this.trackOMAudioEvent(8);
                    } else if (enumC21975c == EnumC21975c.unmute) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsAudioStage(ZAdsAudioStage.UNMUTE);
                        }
                        ZAdsActivity.this.trackOMAudioEvent(9);
                    }
                }

                @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
                public void onAudioImpression(List<String> list) {
                    Adtima.m18326d(ZAdsActivity.TAG, "onAudioImpression");
                    if (list != null) {
                        try {
                            if (list.size() == 0 || ZAdsActivity.this.mIsAdBackup) {
                                return;
                            }
                            C20217u.m105538N0().m105596X(list, ZAdsActivity.this.mAdsContentId);
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onAudioImpression", e11);
                        }
                    }
                }

                @Override // com.adtima.ads.partner.ZAdsAudioPartnerListener
                public void onAudioReady(C21976d c21976d) {
                    Adtima.m18326d(ZAdsActivity.TAG, "onAudioReady");
                    if (c21976d != null) {
                        try {
                            ZAdsActivity.this.mAdsAudioControl.setVisibility(0);
                            ZAdsActivity.this.mAdsVastOrDaastImpressionWaiting = true;
                            ZAdsActivity.this.mAdsVastOrDaastImpressionUrl = c21976d.m114771u();
                            ZAdsActivity.this.startOMAudioSession(ZAdsActivity.mAudioProfile.f10199a.m114751a());
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onAudioReady", e11);
                            return;
                        }
                    }
                    C3228a unused = ZAdsActivity.mQoSEntity = C20212p.m105468m().m105471b(ZAdsActivity.mQoSEntity, ZAdsActivity.this.mAdsKind, true);
                    ZAdsActivity.this.checkIfHaveImpressionAndActiveView();
                }
            };
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initData", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[Catch: Exception -> 0x003e, TryCatch #1 {Exception -> 0x003e, blocks: (B:2:0x0000, B:5:0x001b, B:7:0x0025, B:10:0x0030, B:12:0x003a, B:13:0x008a, B:15:0x0094, B:18:0x009d, B:20:0x00b9, B:21:0x00e0, B:25:0x00bd, B:28:0x00de, B:33:0x0041, B:35:0x0049, B:36:0x004d, B:38:0x0057, B:39:0x005b, B:41:0x0063, B:43:0x0071, B:44:0x0075, B:45:0x0079, B:47:0x0083, B:48:0x0087), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de A[Catch: Exception -> 0x003e, TRY_ENTER, TryCatch #1 {Exception -> 0x003e, blocks: (B:2:0x0000, B:5:0x001b, B:7:0x0025, B:10:0x0030, B:12:0x003a, B:13:0x008a, B:15:0x0094, B:18:0x009d, B:20:0x00b9, B:21:0x00e0, B:25:0x00bd, B:28:0x00de, B:33:0x0041, B:35:0x0049, B:36:0x004d, B:38:0x0057, B:39:0x005b, B:41:0x0063, B:43:0x0071, B:44:0x0075, B:45:0x0079, B:47:0x0083, B:48:0x0087), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initView() {
        try {
            this.mAdsContainer = (RelativeLayout) findViewById(AbstractC3874e.zad__container);
            initListener();
            if (!this.mAdsKind.equals("graphic") && !this.mAdsKind.equals("native") && !this.mAdsKind.equals("zalo")) {
                if (this.mAdsKind.equals("video")) {
                    buildAdtimaVideoInterstitialWithXML();
                } else if (this.mAdsKind.equals("rich")) {
                    buildAdtimaRichInterstitial();
                } else if (this.mAdsKind.equals("endcard")) {
                    buildAdtimaEndCardInterstitialWithXML();
                } else if (this.mAdsKind.equals("audio")) {
                    if (this.mAdsData.f89805a.f497b.equals("ima")) {
                        buildIMAAudioInterstitial();
                    } else {
                        buildAdtimaAudioInterstitial();
                    }
                } else if (this.mAdsKind.equals("html")) {
                    buildAdtimaHtmlInterstitialWithXML();
                }
                if (!this.mAdsKind.equals("audio") && !this.mAdsKind.equals("rich")) {
                    this.mAdsContainer.postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ZAdsActivity.this.findViewById(AbstractC3874e.zad__close_btn).setVisibility(0);
                            } catch (Exception e11) {
                                Adtima.m18329e(ZAdsActivity.TAG, "onCreate", e11);
                            }
                        }
                    }, 1000L);
                    findViewById(AbstractC3874e.zad__close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (ZAdsActivity.mAdsListener != null) {
                                ZAdsActivity.mAdsListener.onAdsClosed();
                                ZAdsActivity.mAdsListener.onAdsClosed(true);
                            }
                            ZAdsActivity.this.mIsOnCloseCalled = true;
                            ZAdsActivity.this.finish();
                        }
                    });
                    if (this.mHasNotch) {
                        updateCloseButtonView();
                    }
                    loadData();
                }
                if (this.mAdsData.f89805a.f504e0) {
                    this.mAdsAllowBack = false;
                } else {
                    try {
                        this.mAdsAllowBack = false;
                        new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ZAdsActivity.this.mAdsAllowBack = true;
                            }
                        }, this.mAdsData.f89805a.f506f0 * 1000);
                    } catch (Exception unused) {
                    }
                }
                loadData();
            }
            buildAdtimaInterstitialWithXML();
            if (!this.mAdsKind.equals("audio")) {
                this.mAdsContainer.postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ZAdsActivity.this.findViewById(AbstractC3874e.zad__close_btn).setVisibility(0);
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsActivity.TAG, "onCreate", e11);
                        }
                    }
                }, 1000L);
                findViewById(AbstractC3874e.zad__close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (ZAdsActivity.mAdsListener != null) {
                            ZAdsActivity.mAdsListener.onAdsClosed();
                            ZAdsActivity.mAdsListener.onAdsClosed(true);
                        }
                        ZAdsActivity.this.mIsOnCloseCalled = true;
                        ZAdsActivity.this.finish();
                    }
                });
                if (this.mHasNotch) {
                }
                loadData();
            }
            if (this.mAdsData.f89805a.f504e0) {
            }
            loadData();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onCreate", e11);
            onFailed();
        }
    }

    @SuppressLint({"NewApi", "SourceLockedOrientationActivity"})
    private void loadData() {
        String str;
        String str2;
        C17719b c17719b;
        String str3;
        String str4;
        WebView webView;
        try {
            if (!this.mAdsKind.equals("zalo")) {
                setRequestedOrientation(1);
            }
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                zVideoControl.setVastModel(mVideoProfile.f10200a);
                this.mAdsVideoControl.m18507A(this.mAdsData.f89805a.f521n);
            }
            if (this.mAdsAudioControl != null && !this.mAdsData.f89805a.f497b.equals("ima")) {
                this.mAdsAudioControl.setDaastModel(mAudioProfile.f10199a);
                this.mAdsAudioControl.m18435Q();
                if (!this.mAdsData.f89805a.f504e0) {
                    checkTimeoutNetwork(AbstractC20202f.f99800a0.longValue());
                }
            }
            if (this.mAdsKind.equals("rich")) {
                String str5 = this.mAdsData.f89806b.f94011b;
                if (this.mHasNotch) {
                    str5 = str5.replace("class=\"header\">", "style=\"padding-top: 45px\" class=\"header\">");
                }
                this.mAdsHeaderView.loadDataWithBaseURL(null, str5, "text/html", "UTF-8", null);
                str4 = this.mAdsData.f89806b.f94012c;
                webView = this.mAdsFooterView;
            } else {
                if (!this.mAdsKind.equals("endcard")) {
                    if (this.mAdsKind.equals("html")) {
                        if (!AbstractC20202f.f99835s || !this.mAdsData.f89805a.f540w0) {
                            this.mAdsContentView.loadUrl(this.mAdsData.f89805a.f517l);
                            return;
                        } else {
                            this.mOMHtmlSession = C20209m.m105408c(this.mAdsContext).m105418j();
                            downloadUrlToString(this.mAdsData.f89805a.f517l);
                            return;
                        }
                    }
                    if (this.mAdsData.f89805a.f497b.equals("ima")) {
                        return;
                    }
                    String str6 = this.mAdsData.f89806b.f94011b;
                    if (this.mAdsKind.equals("zalo")) {
                        int i11 = this.mAdsOrientationPrefer;
                        if (i11 != 0) {
                            if (i11 != 2) {
                                str3 = this.mAdsData.f89806b.f94011b;
                            } else {
                                String str7 = this.mAdsData.f89806b.f94012c;
                                if (str7 != null && str7.length() != 0) {
                                    c17719b = this.mAdsData;
                                    str3 = c17719b.f89806b.f94012c;
                                }
                            }
                        } else if (AbstractC20216t.m105522c(this) == 2 && (str2 = this.mAdsData.f89806b.f94012c) != null && str2.length() != 0) {
                            c17719b = this.mAdsData;
                            str3 = c17719b.f89806b.f94012c;
                        }
                        str6 = str3;
                    }
                    if (this.mAdsKind.equals("audio")) {
                        C17719b c17719b2 = this.mAdsData;
                        if (!c17719b2.f89805a.f522n0 && (str = c17719b2.f89806b.f94012c) != null) {
                            str6 = str;
                        }
                    }
                    if (AbstractC20202f.f99835s && this.mAdsData.f89805a.f540w0) {
                        C20209m.d m105420m = C20209m.m105408c(this.mAdsContext).m105420m();
                        this.mOMSession = m105420m;
                        str6 = m105420m.m105438a(str6);
                    }
                    if (this.mHasNotch) {
                        str6 = str6.replace("class=\"label-ad\">", "style=\"padding-top: 45px\" class=\"label-ad\">");
                    }
                    this.mAdsContentView.loadDataWithBaseURL(null, str6, "text/html", "UTF-8", null);
                    return;
                }
                this.mAdsContentView.loadDataWithBaseURL(null, this.mAdsData.f89806b.f94011b, "text/html", "UTF-8", null);
                str4 = this.mAdsData.f89806b.f94012c;
                webView = this.mAdsEndCardView;
            }
            webView.loadDataWithBaseURL(null, str4, "text/html", "UTF-8", null);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setupData", e11);
        }
    }

    private void onFailed() {
        try {
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsLoadFailed(-3);
                finish();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processOnComplete() {
        try {
            if (mAdsListener != null && this.mAdsData != null) {
                if (!this.mAdsKind.equals("video") && !this.mAdsKind.equals("rich")) {
                    if (this.mAdsKind.equals("audio")) {
                        mAdsListener.onAdsAudioStage(ZAdsAudioStage.COMPLETED);
                    }
                }
                mAdsListener.onAdsVideoStage(ZAdsVideoStage.COMPLETED);
            }
            if (!this.mAdsDismissOnCompletedPrefer) {
                this.mAdsAllowBack = true;
                return;
            }
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsClosed();
                mAdsListener.onAdsClosed(false);
                this.mIsOnCloseCalled = true;
            }
            finishAfterAWhile();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "processOnComplete", e11);
        }
    }

    private void registerAudioListener() {
        Adtima.m18328e(TAG, "registerAudioListener");
        try {
            this.mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.adtima.ads.ZAdsActivity.34
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i11) {
                    if (i11 != -2) {
                        if (i11 != -1) {
                            return;
                        } else {
                            ZAdsActivity.this.mAudioManager.abandonAudioFocus(ZAdsActivity.this.mAudioFocusChangeListener);
                        }
                    }
                    ZAdsActivity.this.requestSoundOff();
                }
            };
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "registerAudioListener", e11);
        }
    }

    private void registerScreenOffReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.adtima.ads.ZAdsActivity.30
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && ZAdsActivity.this.mAdsVideoControl != null && ZAdsActivity.this.mAdsVideoControl.m18510b0()) {
                            ZAdsActivity.this.mAdsVideoControl.m18513j0();
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "unregisterReceiver", e11);
                    }
                }
            };
            this.mAdsPowerKeyReceiver = broadcastReceiver;
            registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestAudioFocus() {
        AudioManager audioManager;
        Adtima.m18328e(TAG, "requestAudioFocus");
        try {
            audioManager = (AudioManager) Adtima.SharedContext.getSystemService("audio");
            this.mAudioManager = audioManager;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "requestAudioFocus", e11);
        }
        return audioManager.requestAudioFocus(this.mAudioFocusChangeListener, 3, 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestAudioUnFocus() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        Adtima.m18328e(TAG, "requestAudioUnFocus");
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

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    @TargetApi(19)
    public void requestScreenSize(int i11, int i12) {
        Adtima.m18328e(TAG, "requestScreenSize");
        try {
            String m100804a = AbstractC19209d.m100804a(ZAdsAction.JS_REQUEST_SCREEN_SIZE, Integer.valueOf(i11), Integer.valueOf(i12));
            if (m100804a == null || m100804a.length() == 0) {
                return;
            }
            if (this.mAdsContentView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsContentView.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsContentView.loadUrl("javascript:" + m100804a);
                }
            }
            if (this.mAdsHeaderView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsHeaderView.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsHeaderView.loadUrl("javascript:" + m100804a);
                }
            }
            if (this.mAdsFooterView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsFooterView.evaluateJavascript(m100804a, null);
                    return;
                }
                this.mAdsFooterView.loadUrl("javascript:" + m100804a);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "requestScreenSize", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    @TargetApi(19)
    public void requestSoundOff() {
        Adtima.m18328e(TAG, "requestSoundOff");
        try {
            String m100804a = AbstractC19209d.m100804a(ZAdsAction.JS_REQUEST_SOUND_OFF, new Object());
            if (m100804a == null || m100804a.length() == 0) {
                return;
            }
            if (this.mAdsContentView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsContentView.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsContentView.loadUrl("javascript:" + m100804a);
                }
            }
            if (this.mAdsHeaderView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsHeaderView.evaluateJavascript(m100804a, null);
                } else {
                    this.mAdsHeaderView.loadUrl("javascript:" + m100804a);
                }
            }
            if (this.mAdsFooterView != null) {
                if (AbstractC19211f.m100806a(19)) {
                    this.mAdsFooterView.evaluateJavascript(m100804a, null);
                    return;
                }
                this.mAdsFooterView.loadUrl("javascript:" + m100804a);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "requestSoundOff", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRichSkipCountdown(final long j11) {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsActivity.23
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        long j12 = j11 - 1;
                        if (j12 <= 0) {
                            if (ZAdsActivity.this.mAdsSkipAfterTextView != null) {
                                ZAdsActivity.this.mAdsSkipAfterTextView.setVisibility(4);
                            }
                            if (ZAdsActivity.this.mAdsSkipNowTextView != null) {
                                ZAdsActivity.this.mAdsSkipNowTextView.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        if (j12 > 0) {
                            String str = AbstractC20202f.f99785M;
                            if (ZAdsActivity.this.mAdsData.f89805a != null && ZAdsActivity.this.mAdsData.f89805a.f504e0 && ZAdsActivity.this.mAdsData.f89805a.f506f0 > 0) {
                                str = AbstractC20202f.f99784L.replace("#time#", String.valueOf(j12));
                            }
                            if (ZAdsActivity.this.mAdsSkipAfterTextView != null) {
                                ZAdsActivity.this.mAdsSkipAfterTextView.setText(str);
                            }
                            ZAdsActivity.this.startRichSkipCountdown(j12);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "startRichSkipCountdown", e11);
                    }
                }
            }, 1000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startSkipCountdown", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackOMAudioEvent(int i11) {
        C20209m.b bVar;
        try {
            if (!AbstractC20202f.f99835s || (bVar = this.mOMAudioSession) == null) {
                return;
            }
            bVar.m105432f(i11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMAudioEvent", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackOMAudioStarted() {
        try {
            if (!AbstractC20202f.f99835s || this.mOMAudioSession == null) {
                return;
            }
            this.mOMAudioSession.m105431e(this.mAdsAudioControl.getDuration(), this.mAdsAudioControl.getAudioVolume());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMAudioStarted", e11);
        }
    }

    private void trackOMVideoEvent(int i11) {
        C20209m.e eVar;
        try {
            if (!AbstractC20202f.f99835s || (eVar = this.mOMVideoSession) == null) {
                return;
            }
            eVar.m105451f(i11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMVideoEvent", e11);
        }
    }

    private void trackOMVideoStarted() {
        try {
            if (!AbstractC20202f.f99835s || this.mOMVideoSession == null) {
                return;
            }
            this.mOMVideoSession.m105450e(this.mAdsVideoControl.getVideoDuration(), this.mAdsVideoControl.getVideoVolume());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "trackOMVideoStarted", e11);
        }
    }

    private void unregisterAudioListener() {
        Adtima.m18328e(TAG, "unregisterAudioListener");
        try {
            this.mAudioFocusChangeListener = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "unregisterAudioListener", e11);
        }
    }

    private void unregisterScreenOffReceiver() {
        try {
            BroadcastReceiver broadcastReceiver = this.mAdsPowerKeyReceiver;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.mAdsPowerKeyReceiver = null;
            }
        } catch (Exception e11) {
            this.mAdsPowerKeyReceiver = null;
            Adtima.m18329e(TAG, "unregisterReceiver", e11);
        }
    }

    private void updateCloseButtonView() {
        try {
            int m114900a = AbstractC22011d.m114900a(this.mAdsContext, 40.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m114900a, m114900a);
            int m114900a2 = AbstractC22011d.m114900a(this.mAdsContext, 5.0f);
            layoutParams.setMargins(m114900a2, m114900a2 + 45, m114900a2, m114900a2);
            findViewById(AbstractC3874e.zad__close_btn).setLayoutParams(layoutParams);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "updateCloseButtonView", e11);
        }
    }

    public void downloadUrlToString(final String str) {
        try {
            AbstractRunnableC0008c abstractRunnableC0008c = new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsActivity.33
                @Override // p001a.p005d.AbstractRunnableC0008c
                public String doInBackground() {
                    try {
                        return AbstractC22011d.m114911l(str);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "doInBackground", e11);
                        return "";
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(String str2) {
                    try {
                        ZAdsActivity.this.mAdsContentView.loadDataWithBaseURL(AbstractC22011d.m114914o(str), ZAdsActivity.this.mOMHtmlSession.m105434a(str2), "text/html", "UTF-8", null);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsActivity.TAG, "onPostExecute", e11);
                    }
                }
            };
            this.mDownloadTask = abstractRunnableC0008c;
            C0009d.m11g(abstractRunnableC0008c);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "downloadUrlToString", e11);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            clearAllDataAndView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "finish", e11);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ZAudioControl zAudioControl;
        ZVideoControl zVideoControl;
        try {
            if (this.mAdsAllowBack) {
                if (mAdsListener != null) {
                    if (!this.mAdsKind.equals("video") && (!this.mAdsKind.equals("rich") || (zVideoControl = this.mAdsVideoControl) == null || zVideoControl.m18508Z())) {
                        if (this.mAdsKind.equals("audio") && (zAudioControl = this.mAdsAudioControl) != null && !zAudioControl.m18433L()) {
                            mAdsListener.onAdsAudioStage(ZAdsAudioStage.SKIPPED);
                        }
                        mAdsListener.onAdsClosed();
                        mAdsListener.onAdsClosed(true);
                        this.mIsOnCloseCalled = true;
                    }
                    mAdsListener.onAdsVideoStage(ZAdsVideoStage.SKIPPED);
                    mAdsListener.onAdsClosed();
                    mAdsListener.onAdsClosed(true);
                    this.mIsOnCloseCalled = true;
                }
                super.onBackPressed();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onBackPressed", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Adtima.m18328e(TAG, "onConfigurationChanged");
        try {
            if (this.mAdsKind.equals("zalo")) {
                if (this.mAdsOrientationPrefer == 0) {
                    int i11 = configuration.orientation;
                    if (i11 == 2 || i11 == 1) {
                        this.mAdsIsRefreshPageByOrientation = true;
                        loadData();
                        RelativeLayout relativeLayout = this.mAdsContainer;
                        if (relativeLayout != null) {
                            relativeLayout.invalidate();
                        }
                    }
                } else {
                    initView();
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onConfigurationChanged", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:            r0 = getWindowManager().getDefaultDisplay().getCutout();     */
    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        DisplayCutout cutout;
        List boundingRects;
        super.onCreate(bundle);
        try {
            getWindow().setFlags(1024, 1024);
            requestWindowFeature(1);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1280);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                if (i11 >= 29 && cutout != null) {
                    boundingRects = cutout.getBoundingRects();
                    if (boundingRects.size() > 0) {
                        this.mHasNotch = true;
                    }
                }
            }
            setContentView(AbstractC3875f.zad__activity_root);
            this.mAdsContext = Adtima.SharedContext;
            String stringExtra = getIntent().getStringExtra("adsData");
            this.mAdsContentId = getIntent().getStringExtra("adsContentId");
            this.mAdsSoundOnPrefer = getIntent().getBooleanExtra("adsSoundOnPrefer", false);
            this.mAdsAutoPlayPrefer = getIntent().getBooleanExtra("adsAutoPlayPrefer", true);
            this.mAdsDismissOnClickedPrefer = getIntent().getBooleanExtra("adsDismissOnClicked", false);
            this.mAdsDismissOnCompletedPrefer = getIntent().getBooleanExtra("adsDismissOnCompleted", false);
            this.mAdsOrientationPrefer = getIntent().getIntExtra("adsOrientationPrefer", 0);
            this.mAdZoneId = getIntent().getStringExtra("adsZoneId");
            this.mAdLoadTag = getIntent().getStringExtra("adsLoadTag");
            C17719b m93793a = C17719b.m93793a(new JSONObject(stringExtra));
            this.mAdsData = m93793a;
            if (m93793a == null && mAdsListener != null) {
                onFailed();
                return;
            }
            this.mAdsWidth = AbstractC20216t.m105523d(this);
            this.mAdsHeight = AbstractC20216t.m105521b(this);
            C0098c c0098c = this.mAdsData.f89805a;
            String str = c0098c.f537v;
            this.mAdsKind = str;
            this.mIsAdBackup = c0098c.f467A0;
            if (str.equals("zalo")) {
                int i12 = this.mAdsOrientationPrefer;
                if (i12 == 1) {
                    setRequestedOrientation(1);
                    if (AbstractC20216t.m105522c(this) != 1) {
                        return;
                    }
                } else if (i12 == 2) {
                    setRequestedOrientation(6);
                    if (AbstractC20216t.m105522c(this) != 2) {
                        return;
                    }
                }
            }
            initView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onCreate", e11);
            onFailed();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        Runnable runnable;
        ZAdsListener zAdsListener;
        try {
            if (!this.mIsOnCloseCalled && (zAdsListener = mAdsListener) != null) {
                this.mIsOnCloseCalled = true;
                zAdsListener.onAdsClosed();
                mAdsListener.onAdsClosed(true);
            }
            if (mQoSEntity != null) {
                mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, this.mAdsKind, false);
            }
            Handler handler = this.mHandler;
            if (handler != null && (runnable = this.mRunnable) != null) {
                handler.removeCallbacks(runnable);
                this.mHandler = null;
            }
            if (this.mRunnable != null) {
                this.mRunnable = null;
            }
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            Adtima.m18326d(TAG, "onPause");
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                zVideoControl.m18513j0();
            }
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18436S();
            }
            requestSoundOff();
            requestAudioUnFocus();
            unregisterScreenOffReceiver();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onPause", e11);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        C17719b c17719b;
        super.onResume();
        try {
            registerScreenOffReceiver();
            if (this.mAdsDismissOnClickedPrefer && this.mAdsClickedOccured) {
                ZAdsListener zAdsListener = mAdsListener;
                if (zAdsListener != null) {
                    zAdsListener.onAdsClosed();
                    mAdsListener.onAdsClosed(false);
                    this.mIsOnCloseCalled = true;
                }
                finish();
            }
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl == null || (c17719b = this.mAdsData) == null || !c17719b.f89805a.f502d0 || !this.mAdsAutoPlayPrefer) {
                return;
            }
            zAudioControl.m18437V();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onResume", e11);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        try {
            Adtima.m18326d(TAG, "onStop");
            requestSoundOff();
            requestAudioUnFocus();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onStop", e11);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastClick(String str, List<String> list) {
        Adtima.m18326d(TAG, "onVastClick");
        if (list != null) {
            try {
                if (list.size() != 0 && !this.mIsAdBackup) {
                    C20217u.m105538N0().m105596X(list, this.mAdsContentId);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "onVastClick", e11);
                return;
            }
        }
        if (str != null && str.length() != 0) {
            C20217u.m105538N0().m105616w(this.mAdsData.f89805a, str, this.mAdsContentId);
        }
        checkIfHaveClickEventAndDismissOnClick();
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastError(String str, List<String> list) {
        Adtima.m18326d(TAG, "onVastError");
        try {
            mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, this.mAdsKind, false);
            if (list != null && list.size() != 0) {
                C20217u.m105538N0().m105594V(str, list);
            }
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsVideoStage(ZAdsVideoStage.ERROR);
            }
            finish();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onVastError", e11);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastEvent(EnumC23496b enumC23496b, List<String> list) {
        Adtima.m18326d(TAG, "onVastEvent: " + enumC23496b);
        if (list != null) {
            try {
                if (list.size() != 0 && !this.mIsAdBackup) {
                    C20217u.m105538N0().m105596X(list, this.mAdsContentId);
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "onVastEvent", e11);
                return;
            }
        }
        if (enumC23496b == EnumC23496b.start) {
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsVideoStage(ZAdsVideoStage.STARTED);
            }
            trackOMVideoStarted();
            return;
        }
        if (enumC23496b == EnumC23496b.pause) {
            ZAdsListener zAdsListener2 = mAdsListener;
            if (zAdsListener2 != null) {
                zAdsListener2.onAdsVideoStage(ZAdsVideoStage.PAUSED);
            }
            trackOMVideoEvent(5);
            return;
        }
        if (enumC23496b == EnumC23496b.resume) {
            ZAdsListener zAdsListener3 = mAdsListener;
            if (zAdsListener3 != null) {
                zAdsListener3.onAdsVideoStage(ZAdsVideoStage.RESUMED);
            }
            trackOMVideoEvent(6);
            return;
        }
        if (enumC23496b == EnumC23496b.complete) {
            ZAdsListener zAdsListener4 = mAdsListener;
            if (zAdsListener4 != null) {
                zAdsListener4.onAdsVideoStage(ZAdsVideoStage.COMPLETED);
            }
            trackOMVideoEvent(4);
            return;
        }
        if (enumC23496b == EnumC23496b.close) {
            ZAdsListener zAdsListener5 = mAdsListener;
            if (zAdsListener5 != null) {
                zAdsListener5.onAdsVideoStage(ZAdsVideoStage.CLOSED);
                return;
            }
            return;
        }
        if (enumC23496b == EnumC23496b.firstQuartile) {
            trackOMVideoEvent(1);
            return;
        }
        if (enumC23496b == EnumC23496b.midpoint) {
            trackOMVideoEvent(2);
            return;
        }
        if (enumC23496b == EnumC23496b.thirdQuartile) {
            trackOMVideoEvent(3);
            return;
        }
        if (enumC23496b == EnumC23496b.mute) {
            ZAdsListener zAdsListener6 = mAdsListener;
            if (zAdsListener6 != null) {
                zAdsListener6.onAdsVideoStage(ZAdsVideoStage.MUTE);
            }
            trackOMVideoEvent(8);
            return;
        }
        if (enumC23496b == EnumC23496b.unmute) {
            ZAdsListener zAdsListener7 = mAdsListener;
            if (zAdsListener7 != null) {
                zAdsListener7.onAdsVideoStage(ZAdsVideoStage.UNMUTE);
            }
            trackOMVideoEvent(9);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastImpression(List<String> list) {
        Adtima.m18326d(TAG, "onVastImpression");
        if (list != null) {
            try {
                if (list.size() == 0 || this.mIsAdBackup) {
                    return;
                }
                C20217u.m105538N0().m105596X(list, this.mAdsContentId);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "onVastImpression", e11);
            }
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastLoadFinished(C23498d c23498d) {
        Adtima.m18326d(TAG, "onVastLoadFinished");
        try {
            mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, this.mAdsKind, true);
            if (c23498d != null) {
                this.mAdsVideoControl.setVisibility(0);
                this.mAdsVastOrDaastImpressionWaiting = true;
                this.mAdsVastOrDaastImpressionUrl = c23498d.m123356p();
                startOMVideoSession(mVideoProfile.f10200a.m123341a());
            }
            checkIfHaveImpressionAndActiveView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onVastLoadFinished", e11);
        }
    }

    public void startOMAudioSession(List<C20894a> list) {
        try {
            if (!AbstractC20202f.f99835s || list == null || list.size() == 0) {
                return;
            }
            C20209m m105408c = C20209m.m105408c(this.mAdsContext);
            C0098c c0098c = this.mAdsData.f89805a;
            C20209m.b m105415b = m105408c.m105415b(list, c0098c.f502d0, c0098c.f504e0, (float) c0098c.f506f0);
            this.mOMAudioSession = m105415b;
            m105415b.m105433g(this.mAdsContainer);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startOMAudioSession", e11);
        }
    }

    public void startOMVideoSession(List<C20894a> list) {
        try {
            if (!AbstractC20202f.f99835s || list == null || list.size() == 0) {
                return;
            }
            C20209m m105408c = C20209m.m105408c(this.mAdsContext);
            C0098c c0098c = this.mAdsData.f89805a;
            C20209m.e m105417h = m105408c.m105417h(list, c0098c.f502d0, c0098c.f504e0, (float) c0098c.f506f0);
            this.mOMVideoSession = m105417h;
            m105417h.m105452g(this.mAdsContainer);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startOMVideoSession", e11);
        }
    }
}
