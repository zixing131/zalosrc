package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class rq0 implements DialogInterface.OnCancelListener {

    /* renamed from: p */
    final /* synthetic */ JsResult f27344p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rq0(JsResult jsResult) {
        this.f27344p = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f27344p.cancel();
    }
}
