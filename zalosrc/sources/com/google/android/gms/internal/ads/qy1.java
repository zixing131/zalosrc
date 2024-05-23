package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* loaded from: classes2.dex */
public abstract class qy1 implements AbstractC4172d.a, AbstractC4172d.b {

    /* renamed from: p */
    protected final pl0 f26995p = new pl0();

    /* renamed from: q */
    protected final Object f26996q = new Object();

    /* renamed from: r */
    protected boolean f26997r = false;

    /* renamed from: s */
    protected boolean f26998s = false;

    /* renamed from: t */
    protected zzcbc f26999t;

    /* renamed from: u */
    protected af0 f27000u;

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        yk0.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* renamed from: Q */
    public void mo19643Q(ConnectionResult connectionResult) {
        yk0.zze("Disconnected from remote ad request service.");
        this.f26995p.zze(new zzedj(1));
    }

    /* renamed from: a */
    public final void m25918a() {
        synchronized (this.f26996q) {
            try {
                this.f26998s = true;
                if (!this.f27000u.isConnected()) {
                    if (this.f27000u.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f27000u.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
