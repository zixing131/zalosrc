package p627x;

import android.webkit.WebView;

/* renamed from: x.b */
/* loaded from: classes2.dex */
public class C29274b extends AbstractC29273a {
    public C29274b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m146276c(webView);
    }
}
