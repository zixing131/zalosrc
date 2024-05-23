package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.r0 */
/* loaded from: classes2.dex */
abstract class AbstractC4215r0 extends AbstractC4171c1 {

    /* renamed from: d */
    public final int f16650d;

    /* renamed from: e */
    public final Bundle f16651e;

    /* renamed from: f */
    final /* synthetic */ AbstractC4172d f16652f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4215r0(AbstractC4172d abstractC4172d, int i11, Bundle bundle) {
        super(abstractC4172d, Boolean.TRUE);
        this.f16652f = abstractC4172d;
        this.f16650d = i11;
        this.f16651e = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4171c1
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo19637a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.f16650d == 0) {
            if (!mo19676g()) {
                this.f16652f.m19642f(1, null);
                mo19675f(new ConnectionResult(8, null));
                return;
            }
            return;
        }
        this.f16652f.m19642f(1, null);
        Bundle bundle = this.f16651e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable(AbstractC4172d.KEY_PENDING_INTENT);
        }
        mo19675f(new ConnectionResult(this.f16650d, pendingIntent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4171c1
    /* renamed from: b */
    public final void mo19638b() {
    }

    /* renamed from: f */
    protected abstract void mo19675f(ConnectionResult connectionResult);

    /* renamed from: g */
    protected abstract boolean mo19676g();
}
