package p621wu;

import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lv.InterfaceC22657e;
import pm0.C24848g0;

/* renamed from: wu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC29244a extends WebChromeClient {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final String[] f135433c = {"android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: a */
    private InterfaceC22657e f135434a;

    /* renamed from: b */
    private WebChromeClient f135435b;

    /* renamed from: wu.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final WebChromeClient m146005a() {
        return this.f135435b;
    }

    /* renamed from: b */
    public final void m146006b(InterfaceC22657e interfaceC22657e) {
        this.f135434a = interfaceC22657e;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        WebChromeClient webChromeClient = this.f135435b;
        if (webChromeClient != null) {
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null && interfaceC22657e != null) {
                interfaceC22657e.mo117242b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        InterfaceC22657e interfaceC22657e = this.f135434a;
        if (interfaceC22657e != null) {
            interfaceC22657e.mo117254s(f135433c, str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                interfaceC22657e.mo117239C();
            }
            WebChromeClient webChromeClient = this.f135435b;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC19074t.m100208f(jsResult, "receiver");
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                return interfaceC22657e.mo117252p(str, str2, jsResult);
            }
            jsResult.cancel();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        AbstractC19074t.m100208f(jsResult, "result");
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                return interfaceC22657e.mo117241E(str, str2, jsResult);
            }
            jsResult.cancel();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        AbstractC19074t.m100208f(jsPromptResult, "result");
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                return interfaceC22657e.mo117244e(str, str2, str3, jsPromptResult);
            }
            jsPromptResult.cancel();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        C24848g0 c24848g0;
        InterfaceC22657e interfaceC22657e = this.f135434a;
        if (interfaceC22657e != null) {
            interfaceC22657e.mo117245g(permissionRequest);
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            super.onPermissionRequest(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i11) {
        AbstractC19074t.m100208f(webView, "webView");
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                interfaceC22657e.mo117243c(i11);
            }
            WebChromeClient webChromeClient = this.f135435b;
            if (webChromeClient != null) {
                webChromeClient.onProgressChanged(webView, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                interfaceC22657e.mo117249m(webView, str, false);
            }
            WebChromeClient webChromeClient = this.f135435b;
            if (webChromeClient != null) {
                webChromeClient.onReceivedTitle(webView, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            InterfaceC22657e interfaceC22657e = this.f135434a;
            if (interfaceC22657e != null) {
                interfaceC22657e.mo117256z(view, i11, customViewCallback);
            }
            WebChromeClient webChromeClient = this.f135435b;
            if (webChromeClient != null) {
                webChromeClient.onShowCustomView(view, i11, customViewCallback);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
