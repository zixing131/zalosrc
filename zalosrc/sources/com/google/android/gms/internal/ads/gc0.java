package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gc0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ hc0 f20530p;

    public gc0(hc0 hc0Var) {
        this.f20530p = hc0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f20530p.m25683c("Operation denied by user.");
    }
}
