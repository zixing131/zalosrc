package p621wu;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import lv.InterfaceC22657e;
import p140ev.C18617f;
import p307kv.AbstractC21954k;

/* renamed from: wu.e */
/* loaded from: classes4.dex */
public abstract class AbstractC29248e extends WebViewClient {

    /* renamed from: a */
    private InterfaceC22657e f135458a;

    /* renamed from: b */
    private WebViewClient f135459b;

    /* renamed from: a */
    public final WebViewClient m146023a() {
        return this.f135459b;
    }

    /* renamed from: b */
    public final void m146024b(WebViewClient webViewClient) {
        this.f135459b = webViewClient;
    }

    /* renamed from: c */
    public final void m146025c(InterfaceC22657e interfaceC22657e) {
        this.f135458a = interfaceC22657e;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z11) {
        super.doUpdateVisitedHistory(webView, str, z11);
        InterfaceC22657e interfaceC22657e = this.f135458a;
        if (interfaceC22657e != null && interfaceC22657e.mo117250n() && webView != null) {
            webView.clearHistory();
        }
        InterfaceC22657e interfaceC22657e2 = this.f135458a;
        if (interfaceC22657e2 != null) {
            interfaceC22657e2.mo117246j(str, webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClient;
        super.onPageCommitVisible(webView, str);
        if (Build.VERSION.SDK_INT >= 23 && (webViewClient = this.f135459b) != null) {
            webViewClient.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        try {
            InterfaceC22657e interfaceC22657e = this.f135458a;
            if (interfaceC22657e != null && interfaceC22657e != null) {
                interfaceC22657e.mo117247k(webView, str);
            }
            WebViewClient webViewClient = this.f135459b;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            InterfaceC22657e interfaceC22657e = this.f135458a;
            if (interfaceC22657e != null && interfaceC22657e != null) {
                interfaceC22657e.mo117238B(webView, str, bitmap);
            }
            WebViewClient webViewClient = this.f135459b;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i11, String str, String str2) {
        try {
            InterfaceC22657e interfaceC22657e = this.f135458a;
            if (interfaceC22657e != null && interfaceC22657e != null) {
                interfaceC22657e.mo117253r(i11, str, str2);
            }
            WebViewClient webViewClient = this.f135459b;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i11, str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        AbstractC19074t.m100208f(httpAuthHandler, "handler");
        try {
            InterfaceC22657e interfaceC22657e = this.f135458a;
            if (interfaceC22657e != null) {
                if (interfaceC22657e != null) {
                    interfaceC22657e.mo117248l(httpAuthHandler, str, str2);
                }
            } else {
                httpAuthHandler.cancel();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        InterfaceC22657e interfaceC22657e = this.f135458a;
        if (interfaceC22657e != null) {
            interfaceC22657e.mo117251o(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        AbstractC19074t.m100208f(webView, "view");
        AbstractC19074t.m100208f(sslErrorHandler, "handler");
        AbstractC19074t.m100208f(sslError, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        try {
            InterfaceC22657e interfaceC22657e = this.f135458a;
            if (interfaceC22657e != null) {
                if (interfaceC22657e != null) {
                    interfaceC22657e.mo117255w(sslErrorHandler, sslError);
                }
            } else {
                sslErrorHandler.cancel();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        InterfaceC22657e interfaceC22657e = this.f135458a;
        if (interfaceC22657e != null) {
            interfaceC22657e.mo117240D(webView, renderProcessGoneDetail);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.f135459b;
        if (webViewClient != null) {
            WebResourceResponse shouldInterceptRequest = webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : null;
            if (shouldInterceptRequest != null) {
                return shouldInterceptRequest;
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.f135459b != null) {
            long m114623r = AbstractC21954k.Companion.m114623r();
            C18617f.a aVar = C18617f.Companion;
            C18617f m98397a = aVar.m98397a();
            if (m98397a != null) {
                m98397a.m98396s(m114623r);
            }
            WebViewClient webViewClient = this.f135459b;
            WebResourceResponse shouldInterceptRequest = webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (shouldInterceptRequest != null) {
                C18617f m98397a2 = aVar.m98397a();
                if (m98397a2 != null) {
                    m98397a2.m98381d(m114623r, webResourceRequest);
                }
                return shouldInterceptRequest;
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        CharSequence description;
        AbstractC19074t.m100208f(webResourceRequest, "request");
        AbstractC19074t.m100208f(webResourceError, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        try {
            errorCode = webResourceError.getErrorCode();
            description = webResourceError.getDescription();
            onReceivedError(webView, errorCode, description.toString(), webResourceRequest.getUrl().toString());
            WebViewClient webViewClient = this.f135459b;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
