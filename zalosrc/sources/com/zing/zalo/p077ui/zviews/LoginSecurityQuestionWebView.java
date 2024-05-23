package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.LoginSecurityQuestionWebView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.webview.LoginInterface;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.net.URI;
import me0.AbstractC23136l9;
import me0.C23055e5;
import org.json.JSONObject;
import p140ev.C18624m;

/* loaded from: classes6.dex */
public class LoginSecurityQuestionWebView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    MultiStateView f74721M0;

    /* renamed from: N0 */
    ZWebView f74722N0;

    /* renamed from: O0 */
    View f74723O0;

    /* renamed from: P0 */
    String f74724P0 = "";

    /* renamed from: Q0 */
    String f74725Q0 = "";

    /* renamed from: R0 */
    int f74726R0 = 0;

    /* renamed from: S0 */
    int f74727S0 = 0;

    /* renamed from: T0 */
    boolean f74728T0 = false;

    /* renamed from: U0 */
    boolean f74729U0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.LoginSecurityQuestionWebView$a */
    /* loaded from: classes6.dex */
    public class C14521a extends WebViewClient {
        C14521a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81198d() {
            if (LoginSecurityQuestionWebView.this.f74726R0 >= 3) {
                Intent intent = new Intent();
                intent.putExtra("fall_back", 1);
                LoginSecurityQuestionWebView.this.mo50035CK(-1, intent);
                LoginSecurityQuestionWebView.this.f72421L0.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m81199e() {
            LoginSecurityQuestionWebView loginSecurityQuestionWebView = LoginSecurityQuestionWebView.this;
            MultiStateView multiStateView = loginSecurityQuestionWebView.f74721M0;
            if (multiStateView != null && loginSecurityQuestionWebView.f74722N0 != null) {
                multiStateView.setVisibility(8);
                LoginSecurityQuestionWebView.this.f74722N0.setVisibility(0);
                LoginSecurityQuestionWebView loginSecurityQuestionWebView2 = LoginSecurityQuestionWebView.this;
                if (loginSecurityQuestionWebView2.f88760a0 != null && !TextUtils.isEmpty(loginSecurityQuestionWebView2.f74722N0.getTitle())) {
                    LoginSecurityQuestionWebView loginSecurityQuestionWebView3 = LoginSecurityQuestionWebView.this;
                    loginSecurityQuestionWebView3.f88760a0.setTitle(loginSecurityQuestionWebView3.f74722N0.getTitle());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m81200f(WebResourceRequest webResourceRequest) {
            try {
                if (LoginSecurityQuestionWebView.this.f74728T0 && !webResourceRequest.getUrl().getQuery().contains("targetRequest=1")) {
                    return;
                }
                LoginSecurityQuestionWebView loginSecurityQuestionWebView = LoginSecurityQuestionWebView.this;
                loginSecurityQuestionWebView.f74724P0 = loginSecurityQuestionWebView.f74724P0;
                MultiStateView multiStateView = loginSecurityQuestionWebView.f74721M0;
                if (multiStateView != null && loginSecurityQuestionWebView.f74722N0 != null) {
                    multiStateView.setVisibility(0);
                    LoginSecurityQuestionWebView.this.f74721M0.setState(MultiStateView.EnumC15914e.ERROR);
                    LoginSecurityQuestionWebView.this.f74722N0.setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            try {
                if (str.contains("targetRequest=1")) {
                    LoginSecurityQuestionWebView.this.f74724P0 = str;
                }
                LoginSecurityQuestionWebView loginSecurityQuestionWebView = LoginSecurityQuestionWebView.this;
                if (loginSecurityQuestionWebView.f74729U0) {
                    if (C23055e5.m118271f()) {
                        LoginSecurityQuestionWebView.this.f74726R0++;
                    }
                    LoginSecurityQuestionWebView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nu
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginSecurityQuestionWebView.C14521a.this.m81198d();
                        }
                    });
                    return;
                }
                loginSecurityQuestionWebView.f74728T0 = true;
                loginSecurityQuestionWebView.f74726R0 = 0;
                loginSecurityQuestionWebView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ou
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginSecurityQuestionWebView.C14521a.this.m81199e();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, final WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            try {
                LoginSecurityQuestionWebView loginSecurityQuestionWebView = LoginSecurityQuestionWebView.this;
                loginSecurityQuestionWebView.f74729U0 = true;
                loginSecurityQuestionWebView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.mu
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginSecurityQuestionWebView.C14521a.this.m81200f(webResourceRequest);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: kM */
    public static String m81183kM(String str) {
        try {
            int indexOf = str.indexOf(" ");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            URI uri = new URI(str);
            if (!TextUtils.isEmpty(uri.getHost())) {
                String host = uri.getHost();
                if (host.startsWith("www.")) {
                    return host.substring(4);
                }
                return host;
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m81184oM() {
        String str = "https";
        try {
            CookieSyncManager.createInstance(this.f72421L0.m92648SI());
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            CookieManager.getInstance().flush();
            String m81183kM = m81183kM(this.f74724P0);
            StringBuilder sb2 = new StringBuilder();
            if (!this.f74724P0.startsWith("https")) {
                str = "http";
            }
            sb2.append(str);
            sb2.append("://");
            sb2.append(m81183kM);
            sb2.append("/");
            String sb3 = sb2.toString();
            cookieManager.setCookie(sb3, new C18624m(m81183kM + "_zlink3rd", this.f74724P0, "/", m81183kM, "900000").toString());
            cookieManager.setCookie(sb3, new C18624m(m81183kM + "_zacc_session", this.f74725Q0, "/", m81183kM, "900000").toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m81185pM() {
        MultiStateView multiStateView = this.f74721M0;
        if (multiStateView != null && this.f74722N0 != null) {
            multiStateView.setVisibility(0);
            this.f74721M0.setState(MultiStateView.EnumC15914e.LOADING);
            this.f74722N0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m81186qM() {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ku
                @Override // java.lang.Runnable
                public final void run() {
                    LoginSecurityQuestionWebView.this.m81185pM();
                }
            });
            this.f74729U0 = false;
            m81194vM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m81187rM(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("error_code") && jSONObject.getInt("error_code") == 1000) {
                    showDialog(1);
                    return;
                }
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            intent.putExtra("data", str);
            intent.putExtra("src_type", this.f74727S0);
            mo50035CK(-1, intent);
            this.f72421L0.finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m81188sM(final String str) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.lu
            @Override // java.lang.Runnable
            public final void run() {
                LoginSecurityQuestionWebView.this.m81187rM(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static /* synthetic */ void m81189tM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m81190uM() {
        this.f74722N0.loadUrl(this.f74724P0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return super.mo39014DJ(i11);
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1);
        aVar.m43171t(AbstractC8020f0.str_title_dialog_error_connect);
        aVar.m43161j(AbstractC8020f0.str_content_dialog_error_connect);
        aVar.m43164m(AbstractC8020f0.str_close, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ju
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                LoginSecurityQuestionWebView.m81189tM(interfaceC17463d, i12);
            }
        });
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.login_security_question_web_view, viewGroup, false);
        this.f74723O0 = inflate;
        try {
            m81193nM(inflate);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f74724P0 = m92642L3.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                this.f74725Q0 = m92642L3.getString("token", "");
                this.f74727S0 = m92642L3.getInt("src_type", 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f74723O0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332 && m92676n2() != null) {
            AbstractC2379w.m12430d(m92676n2().getCurrentFocus());
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        ZWebView zWebView = this.f74722N0;
        if (zWebView != null) {
            zWebView.onPause();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LoginSecurityQuestionWebView";
    }

    /* renamed from: lM */
    void m81191lM() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.fu
            @Override // java.lang.Runnable
            public final void run() {
                LoginSecurityQuestionWebView.this.m81184oM();
            }
        });
    }

    /* renamed from: mM */
    void m81192mM() {
        this.f74721M0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.iu
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                LoginSecurityQuestionWebView.this.m81186qM();
            }
        });
        this.f74722N0.setWebViewClient(new C14521a());
    }

    /* renamed from: nM */
    void m81193nM(View view) {
        this.f74721M0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f74722N0 = (ZWebView) view.findViewById(AbstractC6918a0.webview_empty_device);
        this.f74721M0.setState(MultiStateView.EnumC15914e.LOADING);
        this.f74721M0.setVisibility(0);
        this.f74722N0.setVisibility(8);
        this.f74722N0.addJavascriptInterface(new LoginInterface(new LoginInterface.InterfaceC16782a() { // from class: com.zing.zalo.ui.zviews.gu
            @Override // com.zing.zalo.webview.LoginInterface.InterfaceC16782a
            /* renamed from: a */
            public final void mo87302a(String str) {
                LoginSecurityQuestionWebView.this.m81188sM(str);
            }
        }), "ZaloJavaScriptInterface");
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            m92676n2().mo35554O(32);
            ZWebView zWebView = this.f74722N0;
            if (zWebView != null) {
                zWebView.onResume();
            }
            if (TextUtils.isEmpty(this.f74724P0)) {
                Intent intent = new Intent();
                intent.putExtra("data", "");
                mo50035CK(-1, intent);
                this.f72421L0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    void m81194vM() {
        View view = this.f74723O0;
        if (view != null) {
            view.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hu
                @Override // java.lang.Runnable
                public final void run() {
                    LoginSecurityQuestionWebView.this.m81190uM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m81192mM();
            m81191lM();
            m81194vM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
