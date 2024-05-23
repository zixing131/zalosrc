package com.zing.zalo.webview;

import android.webkit.JavascriptInterface;

/* loaded from: classes5.dex */
public class LoginInterface {
    InterfaceC16782a mListener;

    /* renamed from: com.zing.zalo.webview.LoginInterface$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC16782a {
        /* renamed from: a */
        void mo87302a(String str);
    }

    public LoginInterface(InterfaceC16782a interfaceC16782a) {
        this.mListener = interfaceC16782a;
    }

    @JavascriptInterface
    public void jsCall(String str, String str2, String str3, String str4, String str5) {
        InterfaceC16782a interfaceC16782a = this.mListener;
        if (interfaceC16782a != null) {
            interfaceC16782a.mo87302a(str4);
        }
    }
}
