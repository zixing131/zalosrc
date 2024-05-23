package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class my2 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ WebView f24944p;

    /* renamed from: q */
    final /* synthetic */ String f24945q;

    public my2(ny2 ny2Var, WebView webView, String str) {
        this.f24944p = webView;
        this.f24945q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24944p.loadUrl(this.f24945q);
    }
}
