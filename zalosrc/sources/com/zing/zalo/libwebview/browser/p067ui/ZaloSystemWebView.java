package com.zing.zalo.libwebview.browser.p067ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import lv.InterfaceC22654b;
import lv.InterfaceC22655c;
import on0.AbstractC24341v;
import p307kv.AbstractC21954k;
import p658xu.C30206b;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes4.dex */
public class ZaloSystemWebView extends WebView implements DownloadListener {
    public static final C8952a Companion = new C8952a(null);

    /* renamed from: p */
    private InterfaceC22654b f47884p;

    /* renamed from: q */
    private final Map f47885q;

    /* renamed from: r */
    private boolean f47886r;

    /* renamed from: s */
    private int f47887s;

    /* renamed from: t */
    private String f47888t;

    /* renamed from: u */
    private boolean f47889u;

    /* renamed from: com.zing.zalo.libwebview.browser.ui.ZaloSystemWebView$a */
    /* loaded from: classes4.dex */
    public static final class C8952a {
        private C8952a() {
        }

        public /* synthetic */ C8952a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m47844a() {
            CookieManager.getInstance().removeAllCookies(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloSystemWebView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f47885q = new HashMap();
        this.f47887s = 100;
        this.f47889u = true;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        getSettings().setSaveFormData(true);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        setScrollBarStyle(0);
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        setScrollBarSize((int) aVar.m114613e(3, context2));
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        AbstractC19074t.m100207e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(new C30206b(userAgentString).m148973e());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        getSettings().setDatabaseEnabled(true);
        getSettings().setMixedContentMode(2);
        getSettings().setDomStorageEnabled(true);
        CookieManager.getInstance().flush();
        setLongClickable(true);
        setScrollbarFadingEnabled(true);
        setDownloadListener(this);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
    }

    /* renamed from: a */
    public boolean m47843a() {
        return this.f47886r;
    }

    public String getFirstLoadUrl() {
        return this.f47888t;
    }

    public View getWebView() {
        return this;
    }

    public WebView.HitTestResult getZaloHitTestResult() {
        WebView.HitTestResult hitTestResult = getHitTestResult();
        AbstractC19074t.m100207e(hitTestResult, "getHitTestResult(...)");
        return hitTestResult;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        boolean m127120J;
        AbstractC19074t.m100208f(str2, "data");
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        if (str != null) {
            m127120J = AbstractC24341v.m127120J(str, "javascript", false, 2, null);
            if (!m127120J) {
                this.f47888t = str;
            }
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        boolean m127120J;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (!this.f47885q.isEmpty()) {
            super.loadUrl(str, this.f47885q);
        } else {
            super.loadUrl(str);
        }
        m127120J = AbstractC24341v.m127120J(str, "javascript", false, 2, null);
        if (m127120J) {
            return;
        }
        this.f47888t = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
        InterfaceC22654b interfaceC22654b = this.f47884p;
        if (interfaceC22654b != null) {
            interfaceC22654b.onDownloadStart(str, str2, str3, str4, j11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        boolean z11;
        super.onScrollChanged(i11, i12, i13, i14);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47889u = z11;
    }

    public void setDownloadListener(InterfaceC22654b interfaceC22654b) {
        this.f47884p = interfaceC22654b;
    }

    public void setProgress(int i11) {
        this.f47887s = i11;
    }

    public void setScrollChangedListener(InterfaceC22655c interfaceC22655c) {
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map map) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(map, "additionalHttpHeaders");
        if (!this.f47885q.isEmpty()) {
            map.putAll(this.f47885q);
        }
        super.loadUrl(str, map);
        this.f47888t = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloSystemWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f47885q = new HashMap();
        this.f47887s = 100;
        this.f47889u = true;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        getSettings().setSaveFormData(true);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        setScrollBarStyle(0);
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        setScrollBarSize((int) aVar.m114613e(3, context2));
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        AbstractC19074t.m100207e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(new C30206b(userAgentString).m148973e());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        getSettings().setDatabaseEnabled(true);
        getSettings().setMixedContentMode(2);
        getSettings().setDomStorageEnabled(true);
        CookieManager.getInstance().flush();
        setLongClickable(true);
        setScrollbarFadingEnabled(true);
        setDownloadListener(this);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloSystemWebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f47885q = new HashMap();
        this.f47887s = 100;
        this.f47889u = true;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setLoadsImagesAutomatically(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        getSettings().setSaveFormData(true);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        setScrollBarStyle(0);
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        setScrollBarSize((int) aVar.m114613e(3, context2));
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        AbstractC19074t.m100207e(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(new C30206b(userAgentString).m148973e());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        getSettings().setDatabaseEnabled(true);
        getSettings().setMixedContentMode(2);
        getSettings().setDomStorageEnabled(true);
        CookieManager.getInstance().flush();
        setLongClickable(true);
        setScrollbarFadingEnabled(true);
        setDownloadListener(this);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
    }
}
