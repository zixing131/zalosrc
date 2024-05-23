package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.p057h5.H5AdsRequestHandler;
import com.google.android.gms.ads.p057h5.OnH5AdsEventListener;

/* loaded from: classes2.dex */
public final class o50 extends b50 {

    /* renamed from: d */
    public static final /* synthetic */ int f25439d = 0;

    /* renamed from: a */
    private WebViewClient f25440a;

    /* renamed from: b */
    private final H5AdsRequestHandler f25441b;

    /* renamed from: c */
    private final WebView f25442c;

    public o50(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        j53.m23536f(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.f25442c = webView;
        this.f25441b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.n50
            @Override // com.google.android.gms.ads.p057h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i11 = o50.f25439d;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    /* renamed from: c */
    private final boolean m25087c(WebView webView) {
        if (this.f25442c.equals(webView)) {
            return true;
        }
        yk0.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    /* renamed from: a */
    public final void m25088a() {
        this.f25441b.clearAdObjects();
    }

    /* renamed from: b */
    public final void m25089b(WebViewClient webViewClient) {
        boolean z11;
        if (webViewClient != this) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23536f(z11, "Delegate cannot be itself.");
        this.f25440a = webViewClient;
    }

    @Override // com.google.android.gms.internal.ads.b50
    public final WebViewClient getDelegate() {
        return this.f25440a;
    }

    @Override // com.google.android.gms.internal.ads.b50, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (m25087c(webView) && !this.f25441b.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.b50, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!m25087c(this.f25442c)) {
            return false;
        }
        if (this.f25441b.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.b50, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!m25087c(webView)) {
            return false;
        }
        if (this.f25441b.handleH5AdsRequest(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
