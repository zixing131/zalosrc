package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nq */
/* loaded from: classes2.dex */
public final class RunnableC4806nq implements Runnable {

    /* renamed from: p */
    final ValueCallback f25298p;

    /* renamed from: q */
    final /* synthetic */ C4510fq f25299q;

    /* renamed from: r */
    final /* synthetic */ WebView f25300r;

    /* renamed from: s */
    final /* synthetic */ boolean f25301s;

    /* renamed from: t */
    final /* synthetic */ C4881pq f25302t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4806nq(C4881pq c4881pq, final C4510fq c4510fq, final WebView webView, final boolean z11) {
        this.f25302t = c4881pq;
        this.f25299q = c4510fq;
        this.f25300r = webView;
        this.f25301s = z11;
        this.f25298p = new ValueCallback() { // from class: com.google.android.gms.internal.ads.mq
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                RunnableC4806nq runnableC4806nq = RunnableC4806nq.this;
                C4510fq c4510fq2 = c4510fq;
                WebView webView2 = webView;
                boolean z12 = z11;
                runnableC4806nq.f25302t.m25516d(c4510fq2, webView2, (String) obj, z12);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25300r.getSettings().getJavaScriptEnabled()) {
            try {
                this.f25300r.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f25298p);
            } catch (Throwable unused) {
                this.f25298p.onReceiveValue("");
            }
        }
    }
}
