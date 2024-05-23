package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* loaded from: classes2.dex */
public final class k03 implements AbstractC4172d.a, AbstractC4172d.b {

    /* renamed from: p */
    private final d13 f23048p;

    /* renamed from: q */
    private final z03 f23049q;

    /* renamed from: r */
    private final Object f23050r = new Object();

    /* renamed from: s */
    private boolean f23051s = false;

    /* renamed from: t */
    private boolean f23052t = false;

    public k03(Context context, Looper looper, z03 z03Var) {
        this.f23049q = z03Var;
        this.f23048p = new d13(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m23790b() {
        synchronized (this.f23050r) {
            try {
                if (!this.f23048p.isConnected()) {
                    if (this.f23048p.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f23048p.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        synchronized (this.f23050r) {
            try {
                if (this.f23052t) {
                    return;
                }
                this.f23052t = true;
                try {
                    this.f23048p.m21248g().m22266Q(new zzfoc(this.f23049q.mo27346a()));
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    m23790b();
                    throw th2;
                }
                m23790b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
    }

    /* renamed from: a */
    public final void m23791a() {
        synchronized (this.f23050r) {
            try {
                if (!this.f23051s) {
                    this.f23051s = true;
                    this.f23048p.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
