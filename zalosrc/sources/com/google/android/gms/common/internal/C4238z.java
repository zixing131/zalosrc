package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.z */
/* loaded from: classes2.dex */
public final class C4238z extends AbstractDialogInterfaceOnClickListenerC4167b0 {

    /* renamed from: p */
    final /* synthetic */ Intent f16676p;

    /* renamed from: q */
    final /* synthetic */ Activity f16677q;

    /* renamed from: r */
    final /* synthetic */ int f16678r;

    public C4238z(Intent intent, Activity activity, int i11) {
        this.f16676p = intent;
        this.f16677q = activity;
        this.f16678r = i11;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC4167b0
    /* renamed from: a */
    public final void mo19627a() {
        Intent intent = this.f16676p;
        if (intent != null) {
            this.f16677q.startActivityForResult(intent, this.f16678r);
        }
    }
}
