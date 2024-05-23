package p512t;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;
import p562v.AbstractC27390c;

/* renamed from: t.e */
/* loaded from: classes2.dex */
public class C26439e {

    /* renamed from: a */
    private static C26439e f125620a = new C26439e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t.e$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ WebView f125621p;

        /* renamed from: q */
        final /* synthetic */ String f125622q;

        a(C26439e c26439e, WebView webView, String str) {
            this.f125621p = webView;
            this.f125622q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f125621p.loadUrl(this.f125622q);
        }
    }

    private C26439e() {
    }

    /* renamed from: a */
    public static C26439e m136297a() {
        return f125620a;
    }

    /* renamed from: b */
    public void m136298b(WebView webView) {
        m136303g(webView, "finishSession", new Object[0]);
    }

    /* renamed from: c */
    public void m136299c(WebView webView, float f11) {
        m136303g(webView, "setDeviceVolume", Float.valueOf(f11));
    }

    /* renamed from: d */
    public void m136300d(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m136307k(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: e */
    public void m136301e(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m136303g(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m136303g(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: f */
    public void m136302f(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m136303g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: g */
    void m136303g(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            AbstractC27390c.m140332a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m136306j(sb2, objArr);
        sb2.append(")}");
        m136304h(webView, sb2);
    }

    /* renamed from: h */
    void m136304h(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb3);
        } else {
            handler.post(new a(this, webView, sb3));
        }
    }

    /* renamed from: i */
    public void m136305i(WebView webView, JSONObject jSONObject) {
        m136303g(webView, "init", jSONObject);
    }

    /* renamed from: j */
    void m136306j(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append('\"');
            } else {
                if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb2.append(obj2);
                    } else {
                        sb2.append('\"');
                        sb2.append(obj2);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append('\"');
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }

    /* renamed from: k */
    public boolean m136307k(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: l */
    public void m136308l(WebView webView) {
        m136303g(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: m */
    public void m136309m(WebView webView, String str) {
        m136303g(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: n */
    public void m136310n(WebView webView, JSONObject jSONObject) {
        m136303g(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: o */
    public void m136311o(WebView webView) {
        m136303g(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: p */
    public void m136312p(WebView webView, String str) {
        m136303g(webView, "setState", str);
    }
}
