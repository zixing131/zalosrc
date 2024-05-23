package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.gms.dynamic.h */
/* loaded from: classes2.dex */
final class ViewOnClickListenerC4277h implements View.OnClickListener {

    /* renamed from: p */
    final /* synthetic */ Context f16811p;

    /* renamed from: q */
    final /* synthetic */ Intent f16812q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnClickListenerC4277h(Context context, Intent intent) {
        this.f16811p = context;
        this.f16812q = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f16811p.startActivity(this.f16812q);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
