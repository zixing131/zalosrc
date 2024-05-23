package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class sq0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ JsResult f27817p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sq0(JsResult jsResult) {
        this.f27817p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f27817p.cancel();
    }
}
