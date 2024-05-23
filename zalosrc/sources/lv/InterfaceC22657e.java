package lv;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: lv.e */
/* loaded from: classes4.dex */
public interface InterfaceC22657e {

    /* renamed from: lv.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m117257a(InterfaceC22657e interfaceC22657e, WebView webView, String str, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    z11 = true;
                }
                interfaceC22657e.mo117249m(webView, str, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onReceivedTitleHandler");
        }
    }

    /* renamed from: B */
    void mo117238B(WebView webView, String str, Bitmap bitmap);

    /* renamed from: C */
    void mo117239C();

    /* renamed from: D */
    void mo117240D(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail);

    /* renamed from: E */
    boolean mo117241E(String str, String str2, JsResult jsResult);

    /* renamed from: b */
    void mo117242b();

    /* renamed from: c */
    void mo117243c(int i11);

    /* renamed from: e */
    boolean mo117244e(String str, String str2, String str3, JsPromptResult jsPromptResult);

    /* renamed from: g */
    void mo117245g(PermissionRequest permissionRequest);

    /* renamed from: j */
    void mo117246j(String str, WebView webView);

    /* renamed from: k */
    void mo117247k(WebView webView, String str);

    /* renamed from: l */
    void mo117248l(HttpAuthHandler httpAuthHandler, String str, String str2);

    /* renamed from: m */
    void mo117249m(WebView webView, String str, boolean z11);

    /* renamed from: n */
    boolean mo117250n();

    /* renamed from: o */
    void mo117251o(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: p */
    boolean mo117252p(String str, String str2, JsResult jsResult);

    /* renamed from: r */
    void mo117253r(int i11, String str, String str2);

    /* renamed from: s */
    void mo117254s(String[] strArr, String str, GeolocationPermissions.Callback callback);

    /* renamed from: w */
    void mo117255w(SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: z */
    void mo117256z(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback);
}
