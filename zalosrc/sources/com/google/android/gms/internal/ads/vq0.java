package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes2.dex */
final class vq0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ JsPromptResult f29451p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vq0(JsPromptResult jsPromptResult) {
        this.f29451p = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f29451p.cancel();
    }
}
