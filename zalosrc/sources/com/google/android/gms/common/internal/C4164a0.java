package com.google.android.gms.common.internal;

import android.content.Intent;
import p704z4.InterfaceC31224e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.a0 */
/* loaded from: classes2.dex */
public final class C4164a0 extends AbstractDialogInterfaceOnClickListenerC4167b0 {

    /* renamed from: p */
    final /* synthetic */ Intent f16568p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC31224e f16569q;

    public C4164a0(Intent intent, InterfaceC31224e interfaceC31224e, int i11) {
        this.f16568p = intent;
        this.f16569q = interfaceC31224e;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC4167b0
    /* renamed from: a */
    public final void mo19627a() {
        Intent intent = this.f16568p;
        if (intent != null) {
            this.f16569q.startActivityForResult(intent, 2);
        }
    }
}
