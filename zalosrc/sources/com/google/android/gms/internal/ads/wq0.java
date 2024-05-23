package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes2.dex */
final class wq0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ JsPromptResult f30064p;

    /* renamed from: q */
    final /* synthetic */ EditText f30065q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wq0(JsPromptResult jsPromptResult, EditText editText) {
        this.f30064p = jsPromptResult;
        this.f30065q = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f30064p.confirm(this.f30065q.getText().toString());
    }
}
