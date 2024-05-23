package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p704z4.AbstractC31252u;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* loaded from: classes2.dex */
final class C4109k1 extends AbstractC31252u {

    /* renamed from: a */
    final /* synthetic */ Dialog f16388a;

    /* renamed from: b */
    final /* synthetic */ RunnableC4112l1 f16389b;

    public C4109k1(RunnableC4112l1 runnableC4112l1, Dialog dialog) {
        this.f16389b = runnableC4112l1;
        this.f16388a = dialog;
    }

    @Override // p704z4.AbstractC31252u
    /* renamed from: a */
    public final void mo19408a() {
        this.f16389b.f16394q.m19500o();
        if (this.f16388a.isShowing()) {
            this.f16388a.dismiss();
        }
    }
}
