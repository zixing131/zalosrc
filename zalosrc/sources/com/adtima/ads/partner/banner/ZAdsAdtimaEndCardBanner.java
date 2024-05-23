package com.adtima.ads.partner.banner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
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
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaEndCardBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaEndCardBanner";
    private ZAdsBannerSize mAdSize;
    private C17718a mAdsData;
    private BroadcastReceiver mAdsPowerKeyReceiver;
    private boolean mAdsSoundOn;
    private ZVideoControl mAdsVideoControl;
    private RelativeLayout mCardLayout;
    private boolean mIsAdsClicked;
    private C20209m.e mOMSession;
    private FrameLayout mVideoLayout;

    public ZAdsAdtimaEndCardBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a, boolean z11) {
        super(context);
        this.mIsAdsClicked = false;
        this.mVideoLayout = null;
        this.mCardLayout = null;
        this.mAdsVideoControl = null;
        this.mAdsPowerKeyReceiver = null;
        this.mOMSession = null;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsData = c17718a;
            this.mAdsSoundOn = z11;
            this.mAdSize = zAdsBannerSize;
            FrameLayout frameLayout = new FrameLayout(context);
            this.mVideoLayout = frameLayout;
            frameLayout.setBackgroundColor(Color.parseColor("#2C2C2C"));
            int i13 = AbstractC22010c.f108378a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i13);
            layoutParams.gravity = 17;
            this.mVideoLayout.setLayoutParams(layoutParams);
            int i14 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i14, i14);
            RelativeLayout relativeLayout = new RelativeLayout(context);
            this.mCardLayout = relativeLayout;
            relativeLayout.setBackgroundColor(0);
            this.mCardLayout.setLayoutParams(layoutParams2);
            this.mCardLayout.setVisibility(8);
        } catch (Exception unused) {
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
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            if (ZAdsAdtimaEndCardBanner.this.mVideoLayout != null) {
                                ZAdsAdtimaEndCardBanner.this.mVideoLayout.setVisibility(0);
                            }
                            if (ZAdsAdtimaEndCardBanner.this.mAdsVideoControl != null) {
                                ZAdsAdtimaEndCardBanner.this.mAdsVideoControl.m18514l0();
                            }
                            if (ZAdsAdtimaEndCardBanner.this.mCardLayout != null) {
                                ZAdsAdtimaEndCardBanner.this.mCardLayout.setVisibility(8);
                            }
                        } catch (Exception e11) {
                            Adtima.m18329e(ZAdsAdtimaEndCardBanner.TAG, "onCompleted", e11);
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

    private void registerScreenOffReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.mAdsPowerKeyReceiver = new BroadcastReceiver() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.7
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && ZAdsAdtimaEndCardBanner.this.isAdsMediaPlaying()) {
                            ZAdsAdtimaEndCardBanner.this.pauseVideo();
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            getContext().registerReceiver(this.mAdsPowerKeyReceiver, intentFilter);
        } catch (Exception unused) {
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
            postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.6
                @Override // java.lang.Runnable
                public void run() {
                    ZAdsAdtimaEndCardBanner.this.mIsAdsClicked = false;
                }
            }, 1000L);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "webviewAction", e11);
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000c, B:11:0x0018, B:13:0x0023, B:15:0x0027, B:16:0x0030, B:18:0x006d, B:20:0x007a, B:22:0x00c4, B:24:0x00d1, B:26:0x00f9, B:27:0x0101, B:30:0x0109, B:32:0x010d, B:33:0x011a, B:35:0x0122, B:38:0x012a, B:49:0x0167, B:50:0x0173, B:51:0x017b, B:52:0x0183, B:53:0x0144, B:56:0x014e, B:59:0x0156, B:62:0x018f, B:63:0x019a, B:65:0x01a0, B:67:0x01a8, B:69:0x01ae, B:71:0x01b3, B:72:0x01ba, B:73:0x01c1, B:75:0x01d6, B:78:0x01db, B:80:0x01bd, B:81:0x00c8, B:82:0x0071), top: B:2:0x0002 }] */
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
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                    if (str2 == null) {
                        return true;
                    }
                    try {
                        ZAdsAdtimaEndCardBanner.this.webviewAction(str2);
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                }
            });
            this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.2
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
            this.mVideoLayout.addView(this.mAdsWebView0);
            int i13 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i13, i13);
            WebView webView2 = new WebView(getContext());
            this.mAdsWebView1 = webView2;
            webView2.setLayoutParams(layoutParams3);
            AbstractC19214i.m100838d(this.mAdsWebView1, 0);
            this.mAdsWebView1.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.3
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str2) {
                    if (str2 == null) {
                        return true;
                    }
                    try {
                        ZAdsAdtimaEndCardBanner.this.webviewAction(str2);
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                }
            });
            this.mAdsWebView1.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZAdsBannerSize zAdsBannerSize3 = this.mAdSize;
            if (zAdsBannerSize3 == zAdsBannerSize2 || zAdsBannerSize3 == ZAdsBannerSize.LARGE_RECTANGLE) {
                this.mAdsWebView1.getSettings().setTextZoom(100);
            }
            this.mAdsWebView1.loadDataWithBaseURL(null, this.mAdsData.f89803b.f94007d, "text/html", "UTF-8", null);
            this.mCardLayout.addView(this.mAdsWebView1);
            buildReplayEndCardButtonPanel();
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC22010c.f108378a, AbstractC22010c.f108379b);
            if (this.mAdsWidth == 0) {
                this.mAdsWidth = AbstractC20216t.m105523d(this.mAdsContext);
            }
            if (this.mAdsWidth > 0) {
                if (this.mAdSize == zAdsBannerSize2) {
                    int i14 = this.mAdsWidth;
                    layoutParams4 = new FrameLayout.LayoutParams(i14, (i14 * 9) / 16);
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
                                    int i15 = this.mAdsWidth;
                                    layoutParams4 = new FrameLayout.LayoutParams(i15, (i15 * 9) / 16);
                                } else if (c11 == 1) {
                                    int i16 = this.mAdsWidth;
                                    layoutParams4 = new FrameLayout.LayoutParams(i16, i16);
                                } else if (c11 != 2) {
                                    int i17 = this.mAdsWidth;
                                    layoutParams4 = new FrameLayout.LayoutParams(i17, (i17 * 9) / 16);
                                } else {
                                    int i18 = AbstractC22010c.f108378a;
                                    layoutParams4 = new FrameLayout.LayoutParams(i18, i18);
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
                    int i19 = this.mAdsWidth;
                    layoutParams4 = new FrameLayout.LayoutParams(i19, (i19 * 9) / 16);
                }
            }
            if (this.mAdSize != ZAdsBannerSize.FULL_PAGE || (str = this.mAdsData.f89802a.f508g0) == null || str.equals("full")) {
                layoutParams4.gravity = 17;
            } else {
                int i21 = this.mAdsWidth / 2;
                if (i21 <= 0) {
                    i21 = AbstractC20216t.m105523d(this.mAdsContext) / 2;
                }
                layoutParams4.topMargin = i21;
            }
            ZVideoControl zVideoControl = new ZVideoControl(getContext(), this.mAdsVastListener);
            this.mAdsVideoControl = zVideoControl;
            if (!this.mAdsData.f89802a.f500c0 && this.mAdsSoundOn) {
                z11 = true;
            }
            zVideoControl.setSoundOn(z11);
            this.mAdsVideoControl.setLayoutParams(layoutParams4);
            this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaEndCardBanner.5
                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onCompleted() {
                    super.onCompleted();
                    try {
                        if (ZAdsAdtimaEndCardBanner.this.mVideoLayout != null) {
                            ZAdsAdtimaEndCardBanner.this.mVideoLayout.setVisibility(8);
                        }
                        if (ZAdsAdtimaEndCardBanner.this.mCardLayout != null) {
                            ZAdsAdtimaEndCardBanner.this.mCardLayout.setVisibility(0);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaEndCardBanner.TAG, "onCompleted", e11);
                    }
                }

                @Override // com.adtima.control.ZVideoControl.C3871j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaEndCardBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaEndCardBanner.this).mAdsListener.onInteracted();
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaEndCardBanner.TAG, "onInteracted", e11);
                    }
                }
            });
            this.mAdsVideoControl.setVastModel(this.mAdsData.f89802a.f494Z.f10200a);
            this.mAdsVideoControl.m18507A(this.mAdsData.f89802a.f521n);
            this.mVideoLayout.addView(this.mAdsVideoControl, layoutParams4);
            addView(this.mVideoLayout);
            addView(this.mCardLayout);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
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
            m105417h.m105452g(this.mVideoLayout);
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
