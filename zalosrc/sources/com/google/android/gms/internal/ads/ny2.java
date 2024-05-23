package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ny2 {

    /* renamed from: a */
    private static final ny2 f25376a = new ny2();

    private ny2() {
    }

    /* renamed from: a */
    public static final ny2 m25043a() {
        return f25376a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m25044b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb2.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb2.append(obj2);
                        } else {
                            sb2.append('\"');
                            sb2.append(obj2);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new my2(this, webView, sb3));
                return;
            } else {
                webView.loadUrl(sb3);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (qx2.f26987a.booleanValue()) {
            TextUtils.isEmpty(concat);
        }
    }

    /* renamed from: c */
    public final void m25045c(WebView webView) {
        m25044b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void m25046d(WebView webView, JSONObject jSONObject) {
        m25044b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void m25047e(WebView webView, float f11) {
        m25044b(webView, "setDeviceVolume", Float.valueOf(f11));
    }

    /* renamed from: f */
    public final void m25048f(WebView webView, String str) {
        m25044b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void m25049g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m25044b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
