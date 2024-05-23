package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class uq0 implements DialogInterface.OnCancelListener {

    /* renamed from: p */
    final /* synthetic */ JsPromptResult f29027p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uq0(JsPromptResult jsPromptResult) {
        this.f29027p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f29027p.cancel();
    }
}
