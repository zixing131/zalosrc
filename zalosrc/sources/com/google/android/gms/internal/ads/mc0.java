package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class mc0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ nc0 f24462p;

    public mc0(nc0 nc0Var) {
        this.f24462p = nc0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.f24462p.m25683c("User canceled the download.");
    }
}
