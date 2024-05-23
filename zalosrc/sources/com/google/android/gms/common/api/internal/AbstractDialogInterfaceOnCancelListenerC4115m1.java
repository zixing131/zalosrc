package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;
import p504s5.HandlerC26145m;
import p704z4.InterfaceC31224e;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC4115m1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: q */
    protected volatile boolean f16399q;

    /* renamed from: r */
    protected final AtomicReference f16400r;

    /* renamed from: s */
    private final Handler f16401s;

    /* renamed from: t */
    protected final C4070a f16402t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterfaceOnCancelListenerC4115m1(InterfaceC31224e interfaceC31224e, C4070a c4070a) {
        super(interfaceC31224e);
        this.f16400r = new AtomicReference(null);
        this.f16401s = new HandlerC26145m(Looper.getMainLooper());
        this.f16402t = c4070a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m19499l(ConnectionResult connectionResult, int i11) {
        this.f16400r.set(null);
        mo19448m(connectionResult, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m19500o() {
        this.f16400r.set(null);
        mo19449n();
    }

    /* renamed from: p */
    private static final int m19501p(C4106j1 c4106j1) {
        if (c4106j1 == null) {
            return -1;
        }
        return c4106j1.m19488a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo19291e(int i11, int i12, Intent intent) {
        C4106j1 c4106j1 = (C4106j1) this.f16400r.get();
        if (i11 != 1) {
            if (i11 == 2) {
                int mo19200i = this.f16402t.mo19200i(m19290b());
                if (mo19200i == 0) {
                    m19500o();
                    return;
                } else {
                    if (c4106j1 == null) {
                        return;
                    }
                    if (c4106j1.m19489b().m19188t() == 18 && mo19200i == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i12 == -1) {
                m19500o();
                return;
            }
            if (i12 == 0) {
                if (c4106j1 == null) {
                    return;
                }
                int i13 = 13;
                if (intent != null) {
                    i13 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m19499l(new ConnectionResult(i13, null, c4106j1.m19489b().toString()), m19501p(c4106j1));
                return;
            }
        }
        if (c4106j1 != null) {
            m19499l(c4106j1.m19489b(), c4106j1.m19488a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo19292f(Bundle bundle) {
        C4106j1 c4106j1;
        super.mo19292f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f16400r;
            if (bundle.getBoolean("resolving_error", false)) {
                c4106j1 = new C4106j1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c4106j1 = null;
            }
            atomicReference.set(c4106j1);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo19295i(Bundle bundle) {
        super.mo19295i(bundle);
        C4106j1 c4106j1 = (C4106j1) this.f16400r.get();
        if (c4106j1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c4106j1.m19488a());
        bundle.putInt("failed_status", c4106j1.m19489b().m19188t());
        bundle.putParcelable("failed_resolution", c4106j1.m19489b().m19185J());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo19296j() {
        super.mo19296j();
        this.f16399q = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo19297k() {
        super.mo19297k();
        this.f16399q = false;
    }

    /* renamed from: m */
    protected abstract void mo19448m(ConnectionResult connectionResult, int i11);

    /* renamed from: n */
    protected abstract void mo19449n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m19499l(new ConnectionResult(13, null), m19501p((C4106j1) this.f16400r.get()));
    }

    /* renamed from: s */
    public final void m19504s(ConnectionResult connectionResult, int i11) {
        C4106j1 c4106j1 = new C4106j1(connectionResult, i11);
        AtomicReference atomicReference = this.f16400r;
        while (!AbstractC0007b.m4a(atomicReference, null, c4106j1)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f16401s.post(new RunnableC4112l1(this, c4106j1));
    }
}
