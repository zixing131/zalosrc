package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes2.dex */
public final class BinderC5315c1 extends AbstractBinderC5417i1 {

    /* renamed from: p */
    private final AtomicReference f32303p = new AtomicReference();

    /* renamed from: q */
    private boolean f32304q;

    /* renamed from: W4 */
    public static final Object m28960W4(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e11) {
            String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName());
            throw e11;
        }
    }

    /* renamed from: I3 */
    public final String m28961I3(long j11) {
        return (String) m28960W4(m28963N(j11), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5434j1
    /* renamed from: J */
    public final void mo28962J(Bundle bundle) {
        synchronized (this.f32303p) {
            try {
                try {
                    this.f32303p.set(bundle);
                    this.f32304q = true;
                } finally {
                    this.f32303p.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: N */
    public final Bundle m28963N(long j11) {
        Bundle bundle;
        synchronized (this.f32303p) {
            if (!this.f32304q) {
                try {
                    this.f32303p.wait(j11);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f32303p.get();
        }
        return bundle;
    }

    /* renamed from: Q */
    public final Long m28964Q(long j11) {
        return (Long) m28960W4(m28963N(j11), Long.class);
    }
}
