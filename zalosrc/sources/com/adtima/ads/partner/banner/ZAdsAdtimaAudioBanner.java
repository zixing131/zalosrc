package com.adtima.ads.partner.banner;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsAction;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.partner.ZAdsPartnerBannerAbstract;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.control.ZAudioControl;
import java.util.List;
import p009a3.C0098c;
import p090d3.C17718a;
import p178g3.AbstractC19214i;
import p227i3.AbstractC20202f;
import p227i3.C20209m;
import p227i3.C20218v;
import p227i3.EnumC20200d;
import p250j.C20894a;
import p313l3.AbstractC22010c;

/* loaded from: classes2.dex */
public final class ZAdsAdtimaAudioBanner extends ZAdsPartnerBannerAbstract {
    private static final String TAG = "ZAdsAdtimaAudioBanner";
    private View audioView;
    private ZAdsBannerSize mAdSize;
    private ZAudioControl mAdsAudioControl;
    private C17718a mAdsData;
    private boolean mIsAdsClicked;
    private C20209m.b mOMAudioSession;

    public ZAdsAdtimaAudioBanner(Context context, ZAdsBannerSize zAdsBannerSize, int i11, int i12, C17718a c17718a) {
        super(context);
        this.mAdsAudioControl = null;
        this.mIsAdsClicked = false;
        this.mOMAudioSession = null;
        try {
            this.mAdsWidth = i11;
            this.mAdsHeight = i12;
            this.mAdsData = c17718a;
            this.mAdSize = zAdsBannerSize;
        } catch (Exception unused) {
        }
    }

    private void checkTimeoutNetwork(long j11) {
        try {
            new Handler().postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZAdsAdtimaAudioBanner.this.mAdsAudioControl == null || ZAdsAdtimaAudioBanner.this.mAdsAudioControl.getDuration() != 0) {
                            return;
                        }
                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener.onSkipped();
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsAdtimaAudioBanner.TAG, "checkTimeoutNetwork", e11);
                    }
                }
            }, j11);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkTimeoutNetwork", e11);
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void destroyAdsPartner() {
        try {
            WebView webView = this.mAdsWebView0;
            if (webView != null) {
                webView.clearCache(true);
                this.mAdsWebView0.destroyDrawingCache();
                this.mAdsWebView0 = null;
            }
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18440n();
                this.mAdsAudioControl.m18438X();
                this.mAdsAudioControl = null;
            }
            C20209m.b bVar = this.mOMAudioSession;
            if (bVar != null) {
                bVar.m105430d();
                this.mOMAudioSession = null;
            }
            this.mAdsData = null;
            this.mAdsListener = null;
            this.mAdsVastListener = null;
        } catch (Exception unused) {
        }
    }

    public void displayedAdsPartner() {
        try {
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18435Q();
            }
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
        String str;
        try {
            if (this.mAdSize != ZAdsBannerSize.FULL_PAGE) {
                ZAdsPartnerViewListener zAdsPartnerViewListener = this.mAdsListener;
                if (zAdsPartnerViewListener != null) {
                    zAdsPartnerViewListener.onFailed(this.mAdsData, EnumC20200d.AD_RENDER_ERROR);
                    return;
                }
                return;
            }
            View inflate = LayoutInflater.from(this.mAdsContext).inflate(AbstractC3875f.zad__fullpage_adtima_audio, (ViewGroup) null);
            this.audioView = inflate;
            addView(inflate);
            int parseColor = Color.parseColor(AbstractC20202f.f99783K);
            this.audioView.setBackgroundColor(parseColor);
            WebView webView = (WebView) this.audioView.findViewById(AbstractC3874e.zad__web_view_0);
            this.mAdsWebView0 = webView;
            AbstractC19214i.m100838d(webView, parseColor);
            this.mAdsWebView0.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                    if (str2 != null) {
                        try {
                            if (!ZAdsAdtimaAudioBanner.this.mIsAdsClicked) {
                                ZAdsAdtimaAudioBanner.this.mIsAdsClicked = true;
                                if (str2.equals(ZAdsAction.URL_ACTION_TARGET)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener.onClicked();
                                    }
                                } else if (str2.equals(ZAdsAction.URL_ACTION_FEEDBACK)) {
                                    if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener != null) {
                                        ((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener.onReport();
                                    }
                                } else if (str2.contains("adtima")) {
                                    C20218v.m105636a().m105643h(str2);
                                }
                                ZAdsAdtimaAudioBanner.this.postDelayed(new Runnable() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        ZAdsAdtimaAudioBanner.this.mIsAdsClicked = false;
                                    }
                                }, 1000L);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            });
            this.mAdsWebView0.setOnTouchListener(new View.OnTouchListener() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return motionEvent.getAction() == 2;
                }
            });
            ZAdsBannerSize zAdsBannerSize = this.mAdSize;
            if (zAdsBannerSize == ZAdsBannerSize.MEDIUM_RECTANGLE || zAdsBannerSize == ZAdsBannerSize.LARGE_RECTANGLE) {
                this.mAdsWebView0.getSettings().setTextZoom(100);
            }
            C17718a c17718a = this.mAdsData;
            if (c17718a.f89802a.f522n0 || (str = c17718a.f89803b.f94007d) == null) {
                this.mAdsWebView0.loadDataWithBaseURL(null, c17718a.f89803b.f94006c, "text/html", "UTF-8", null);
            } else {
                this.mAdsWebView0.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            }
            new LinearLayout.LayoutParams(AbstractC22010c.f108378a, 0).weight = 3.0f;
            ZAudioControl zAudioControl = (ZAudioControl) this.audioView.findViewById(AbstractC3874e.zad__audio_control);
            this.mAdsAudioControl = zAudioControl;
            zAudioControl.setAudioListener(this.mAdsDaastListener);
            ZAudioControl zAudioControl2 = this.mAdsAudioControl;
            C0098c c0098c = this.mAdsData.f89802a;
            zAudioControl2.m18439k(c0098c.f504e0, c0098c.f506f0);
            this.mAdsAudioControl.setListener(new ZAudioControl.C3861j() { // from class: com.adtima.ads.partner.banner.ZAdsAdtimaAudioBanner.3
                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onInteracted() {
                    super.onInteracted();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener.onInteracted();
                        }
                    } catch (Exception unused) {
                    }
                }

                @Override // com.adtima.control.ZAudioControl.C3861j
                public void onSkipped() {
                    super.onSkipped();
                    try {
                        if (((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener != null) {
                            ((ZAdsPartnerBannerAbstract) ZAdsAdtimaAudioBanner.this).mAdsListener.onSkipped();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mAdsAudioControl.setDaastModel(this.mAdsData.f89802a.f498b0.f10199a);
            if (this.mAdsData.f89802a.f504e0) {
                return;
            }
            checkTimeoutNetwork(AbstractC20202f.f99800a0.longValue());
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    @Override // com.adtima.ads.partner.ZAdsPartnerBannerAbstract
    public void pauseAdsPartner() {
        pauseAudio();
    }

    public void pauseAudio() {
        try {
            ZAudioControl zAudioControl = this.mAdsAudioControl;
            if (zAudioControl != null) {
                zAudioControl.m18436S();
            }
        } catch (Exception unused) {
        }
    }

    public void playAudio() {
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
        playAudio();
    }

    public void startOMAudioSession(List<C20894a> list) {
        try {
            if (!AbstractC20202f.f99835s || list == null || list.size() == 0) {
                return;
            }
            C20209m m105408c = C20209m.m105408c(this.mAdsContext);
            C0098c c0098c = this.mAdsData.f89802a;
            C20209m.b m105415b = m105408c.m105415b(list, c0098c.f502d0, c0098c.f504e0, (float) c0098c.f506f0);
            this.mOMAudioSession = m105415b;
            m105415b.m105433g(this.audioView);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "startOMAudioSession", e11);
        }
    }

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
}
