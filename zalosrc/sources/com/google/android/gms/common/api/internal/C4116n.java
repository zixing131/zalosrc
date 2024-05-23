package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4205o;
import p665y0.C30240b;
import p704z4.C31218b;
import p704z4.InterfaceC31224e;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes2.dex */
public final class C4116n extends AbstractDialogInterfaceOnCancelListenerC4115m1 {

    /* renamed from: u */
    private final C30240b f16403u;

    /* renamed from: v */
    private final C4083c f16404v;

    C4116n(InterfaceC31224e interfaceC31224e, C4083c c4083c, C4070a c4070a) {
        super(interfaceC31224e, c4070a);
        this.f16403u = new C30240b();
        this.f16404v = c4083c;
        this.f16229p.mo19564a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m19505u(Activity activity, C4083c c4083c, C31218b c31218b) {
        InterfaceC31224e m19287c = LifecycleCallback.m19287c(activity);
        C4116n c4116n = (C4116n) m19287c.mo19565b("ConnectionlessLifecycleHelper", C4116n.class);
        if (c4116n == null) {
            c4116n = new C4116n(m19287c, c4083c, C4070a.m19196p());
        }
        AbstractC4205o.m19723l(c31218b, "ApiKey cannot be null");
        c4116n.f16403u.add(c31218b);
        c4083c.m19380d(c4116n);
    }

    /* renamed from: v */
    private final void m19506v() {
        if (!this.f16403u.isEmpty()) {
            this.f16404v.m19380d(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo19294h() {
        super.mo19294h();
        m19506v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo19296j() {
        super.mo19296j();
        m19506v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo19297k() {
        super.mo19297k();
        this.f16404v.m19381e(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1
    /* renamed from: m */
    protected final void mo19448m(ConnectionResult connectionResult, int i11) {
        this.f16404v.m19377J(connectionResult, i11);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC4115m1
    /* renamed from: n */
    protected final void mo19449n() {
        this.f16404v.m19378b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C30240b m19507t() {
        return this.f16403u;
    }
}
