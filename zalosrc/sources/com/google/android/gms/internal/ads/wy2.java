package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class wy2 implements Runnable {

    /* renamed from: p */
    private final WebView f30271p;

    /* renamed from: q */
    final /* synthetic */ xy2 f30272q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wy2(xy2 xy2Var) {
        WebView webView;
        this.f30272q = xy2Var;
        webView = xy2Var.f30686d;
        this.f30271p = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30271p.destroy();
    }
}
