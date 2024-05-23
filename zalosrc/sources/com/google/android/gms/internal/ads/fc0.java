package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class fc0 implements DialogInterface.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ hc0 f20085p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fc0(hc0 hc0Var) {
        this.f20085p = hc0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        Context context;
        Intent m22782i = this.f20085p.m22782i();
        zzt.zzp();
        context = this.f20085p.f21618d;
        zzs.zzJ(context, m22782i);
    }
}
