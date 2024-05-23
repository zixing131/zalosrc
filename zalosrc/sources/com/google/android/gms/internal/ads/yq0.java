package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class yq0 extends WebChromeClient {

    /* renamed from: a */
    private final zq0 f31077a;

    public yq0(zq0 zq0Var) {
        this.f31077a = zq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static final Context m28297b(WebView webView) {
        if (!(webView instanceof zq0)) {
            return webView.getContext();
        }
        zq0 zq0Var = (zq0) webView;
        Activity zzk = zq0Var.zzk();
        if (zzk != null) {
            return zzk;
        }
        return zq0Var.getContext();
    }

    /* renamed from: a */
    protected final boolean m28298a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z11) {
        zq0 zq0Var;
        zzb zzd;
        try {
            zq0Var = this.f31077a;
        } catch (WindowManager.BadTokenException e11) {
            yk0.zzk("Fail to display Dialog.", e11);
        }
        if (zq0Var != null && zq0Var.zzP() != null && this.f31077a.zzP().zzd() != null && (zzd = this.f31077a.zzP().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(context);
        zzG.setTitle(str2);
        if (z11) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzG.setView(linearLayout).setPositiveButton(R.string.ok, new wq0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new vq0(jsPromptResult)).setOnCancelListener(new uq0(jsPromptResult)).create().show();
        } else {
            zzG.setMessage(str3).setPositiveButton(R.string.ok, new tq0(jsResult)).setNegativeButton(R.string.cancel, new sq0(jsResult)).setOnCancelListener(new rq0(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zq0)) {
            yk0.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzl zzN = ((zq0) webView).zzN();
        if (zzN == null) {
            yk0.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzN.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i11 = xq0.f30574a[consoleMessage.messageLevel().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    if (i11 != 5) {
                        yk0.zzi(str);
                    } else {
                        yk0.zze(str);
                    }
                } else {
                    yk0.zzi(str);
                }
            } else {
                yk0.zzj(str);
            }
        } else {
            yk0.zzg(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f31077a.mo26699h() != null) {
            webView2.setWebViewClient(this.f31077a.mo26699h());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j11, long j12, long j13, WebStorage.QuotaUpdater quotaUpdater) {
        long j14 = 5242880 - j13;
        if (j14 <= 0) {
            quotaUpdater.updateQuota(j11);
            return;
        }
        if (j11 == 0) {
            if (j12 > j14 || j12 > 1048576) {
                j12 = 0;
            }
        } else if (j12 == 0) {
            j12 = Math.min(j11 + Math.min(131072L, j14), 1048576L);
        } else {
            if (j12 <= Math.min(1048576 - j11, j14)) {
                j11 += j12;
            }
            j12 = j11;
        }
        quotaUpdater.updateQuota(j12);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z11;
        if (callback != null) {
            zzt.zzp();
            if (!zzs.zzx(this.f31077a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzt.zzp();
                if (!zzs.zzx(this.f31077a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z11 = false;
                    callback.invoke(str, z11, true);
                }
            }
            z11 = true;
            callback.invoke(str, z11, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        zzl zzN = this.f31077a.zzN();
        if (zzN == null) {
            yk0.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzN.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m28298a(m28297b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m28298a(m28297b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m28298a(m28297b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m28298a(m28297b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i11, WebChromeClient.CustomViewCallback customViewCallback) {
        zzl zzN = this.f31077a.zzN();
        if (zzN == null) {
            yk0.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzN.zzA(view, customViewCallback);
            zzN.zzy(i11);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
