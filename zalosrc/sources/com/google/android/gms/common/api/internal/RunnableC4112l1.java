package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.l1 */
/* loaded from: classes2.dex */
public final class RunnableC4112l1 implements Runnable {

    /* renamed from: p */
    private final C4106j1 f16393p;

    /* renamed from: q */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC4115m1 f16394q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4112l1(AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m1, C4106j1 c4106j1) {
        this.f16394q = abstractDialogInterfaceOnCancelListenerC4115m1;
        this.f16393p = c4106j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f16394q.f16399q) {
            return;
        }
        ConnectionResult m19489b = this.f16393p.m19489b();
        if (m19489b.m19186K()) {
            AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m1 = this.f16394q;
            abstractDialogInterfaceOnCancelListenerC4115m1.f16229p.startActivityForResult(GoogleApiActivity.m19217a(abstractDialogInterfaceOnCancelListenerC4115m1.m19290b(), (PendingIntent) AbstractC4205o.m19722k(m19489b.m19185J()), this.f16393p.m19488a(), false), 1);
            return;
        }
        AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m12 = this.f16394q;
        if (abstractDialogInterfaceOnCancelListenerC4115m12.f16402t.mo19197d(abstractDialogInterfaceOnCancelListenerC4115m12.m19290b(), m19489b.m19188t(), null) != null) {
            AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m13 = this.f16394q;
            abstractDialogInterfaceOnCancelListenerC4115m13.f16402t.m19213y(abstractDialogInterfaceOnCancelListenerC4115m13.m19290b(), this.f16394q.f16229p, m19489b.m19188t(), 2, this.f16394q);
        } else {
            if (m19489b.m19188t() != 18) {
                this.f16394q.m19499l(m19489b, this.f16393p.m19488a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m14 = this.f16394q;
            Dialog m19208t = abstractDialogInterfaceOnCancelListenerC4115m14.f16402t.m19208t(abstractDialogInterfaceOnCancelListenerC4115m14.m19290b(), this.f16394q);
            AbstractDialogInterfaceOnCancelListenerC4115m1 abstractDialogInterfaceOnCancelListenerC4115m15 = this.f16394q;
            abstractDialogInterfaceOnCancelListenerC4115m15.f16402t.m19209u(abstractDialogInterfaceOnCancelListenerC4115m15.m19290b().getApplicationContext(), new C4109k1(this, m19208t));
        }
    }
}
