package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class tq0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ JsResult f28470p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tq0(JsResult jsResult) {
        this.f28470p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f28470p.confirm();
    }
}
