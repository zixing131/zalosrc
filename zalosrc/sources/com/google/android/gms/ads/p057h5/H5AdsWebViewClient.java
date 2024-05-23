package com.google.android.gms.ads.p057h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.b50;
import com.google.android.gms.internal.ads.o50;

/* loaded from: classes2.dex */
public final class H5AdsWebViewClient extends b50 {
    private final o50 zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new o50(context, webView);
    }

    public void clearAdObjects() {
        this.zza.m25088a();
    }

    @Override // com.google.android.gms.internal.ads.b50
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.m25089b(webViewClient);
    }
}
